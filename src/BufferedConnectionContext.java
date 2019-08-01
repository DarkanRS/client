import java.io.IOException;

public class BufferedConnectionContext {

	ServerPacket lastPacket;
	public IsaacCipher isaac;
	ServerPacket thirdLastPacket;
	IsaacCipher aClass432_2295;
	ServerPacket secondLastPacket;
	static int anInt2300;
	int anInt2297;
	public int anInt2290 = 0;
	int readDataSize = 0;
	Connection connection;
	NodeCollection queuedPackets = new NodeCollection();
	RsByteBuffer writeBuffer = new RsByteBuffer(1600);
	RsBitsBuffer recievedBuffer = new RsBitsBuffer(15000);
	ServerPacket currentPacket = null;
	int currentPacketSize = 0;
	boolean aBool2288 = true;
	int idleReadPulses = 0;
	public boolean aBool2298 = false;
	ConnectionPinger pinger = new ConnectionPinger();
	int anInt2293;
	int anInt2294;
	int read;

	public final void flush() throws IOException {
		if (this.connection != null && this.readDataSize > 0) {
			this.writeBuffer.index = 0;
			while (true) {
				TCPPacket packet = (TCPPacket) this.queuedPackets.head();
				if (packet == null || packet.anInt7680 > this.writeBuffer.buffer.length - this.writeBuffer.index) {
					this.connection.write(this.writeBuffer.buffer, this.writeBuffer.index, -771843978);
					this.anInt2297 += this.writeBuffer.index;
					this.anInt2290 = 0;
					break;
				}
				this.writeBuffer.writeBytes(packet.buffer.buffer, 0, packet.anInt7680);
				this.readDataSize -= packet.anInt7680;
				packet.remove();
				packet.buffer.method13059();
				packet.method12360();
			}
		}
	}

	public final void queuePacket(TCPPacket tcpmessage_1) {
		this.queuedPackets.append(tcpmessage_1);
		tcpmessage_1.anInt7680 = tcpmessage_1.buffer.index;
		tcpmessage_1.buffer.index = 0;
		this.readDataSize += tcpmessage_1.anInt7680;
	}

	void init(Connection connection, String ip) {
		this.connection = connection;
		this.pinger.setIp(ip);
	}

	void method3051() {
		if (this.connection != null) {
			this.connection.method3318(-1281215468);
			this.connection = null;
		}
		this.pinger.setIp((String) null);
	}

	public Connection getConnection() {
		return this.connection;
	}

	final void clearAllQueuedPackets() {
		this.queuedPackets.removeAll();
		this.readDataSize = 0;
	}

	BufferedConnectionContext() {
		Thread thread_1 = new Thread(this.pinger);
		thread_1.setPriority(1);
		thread_1.start();
	}

	void method3059(int i_1) {
		if (client.cycles % 50 == 0) {
			this.anInt2293 = this.anInt2297;
			this.anInt2297 = 0;
			this.anInt2294 = this.read;
			this.read = 0;
		}
	}

	void reset() {
		this.connection = null;
		this.pinger.setIp((String) null);
	}
}
