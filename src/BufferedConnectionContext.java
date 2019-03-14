import java.io.IOException;

public class BufferedConnectionContext {

	IncomingPacket lastPacket;

	public IsaacCipher isaac;

	IncomingPacket thirdLastPacket;

	IsaacCipher aClass432_2295;

	IncomingPacket secondLastPacket;

	static int anInt2300;

	int anInt2297;

	public int anInt2290 = 0;

	int anInt2279 = 0;

	Connection aClass202_2281;

	NodeCollection queuedPackets = new NodeCollection();

	RsByteBuffer aClass282_Sub35_2282 = new RsByteBuffer(1600);

	RsBitsBuffer recievedBuffer = new RsBitsBuffer(15000);

	IncomingPacket currentPacket = null;

	int currentPacketSize = 0;

	boolean aBool2288 = true;

	int idleReadPulses = 0;

	public boolean aBool2298 = false;

	Class7 aClass7_2299 = new Class7();

	int anInt2293;

	int anInt2294;

	int read;

	public final void method3047(int i_1) throws IOException {
		if (this.aClass202_2281 != null && this.anInt2279 > 0) {
			this.aClass282_Sub35_2282.index = 0;
			while (true) {
				TCPMessage tcpmessage_2 = (TCPMessage) this.queuedPackets.head((byte) 41);
				if (tcpmessage_2 == null || tcpmessage_2.anInt7680 > this.aClass282_Sub35_2282.buffer.length - this.aClass282_Sub35_2282.index) {
					this.aClass202_2281.write(this.aClass282_Sub35_2282.buffer, 0, this.aClass282_Sub35_2282.index, -771843978);
					this.anInt2297 += this.aClass282_Sub35_2282.index;
					this.anInt2290 = 0;
					break;
				}
				this.aClass282_Sub35_2282.writeBytes(tcpmessage_2.buffer.buffer, 0, tcpmessage_2.anInt7680);
				this.anInt2279 -= tcpmessage_2.anInt7680;
				tcpmessage_2.remove();
				tcpmessage_2.buffer.method13059(1420319429);
				tcpmessage_2.method12360(-923048057);
			}
		}
	}

	public final void method3049(TCPMessage tcpmessage_1, int i_2) {
		this.queuedPackets.append(tcpmessage_1, 1467393733);
		tcpmessage_1.anInt7680 = tcpmessage_1.buffer.index;
		tcpmessage_1.buffer.index = 0;
		this.anInt2279 += tcpmessage_1.anInt7680;
	}

	void method3050(Connection class202_1, String string_2, byte b_3) {
		this.aClass202_2281 = class202_1;
		this.aClass7_2299.method346(string_2, -181392292);
	}

	void method3051(byte b_1) {
		if (this.aClass202_2281 != null) {
			this.aClass202_2281.method3318(-1281215468);
			this.aClass202_2281 = null;
		}
		this.aClass7_2299.method346((String) null, -1992601565);
	}

	public Connection getConnection() {
		return this.aClass202_2281;
	}

	final void method3054(short s_1) {
		this.queuedPackets.method8118(132408970);
		this.anInt2279 = 0;
	}

	BufferedConnectionContext() {
		Thread thread_1 = new Thread(this.aClass7_2299);
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

	void method3061(int i_1) {
		this.aClass202_2281 = null;
		this.aClass7_2299.method346((String) null, 958256601);
	}

	static void method3069(int i_0, int i_1, int i_2) {
		Class282_Sub50_Sub12 class282_sub50_sub12_3 = Engine.getIComponentVar(5, (long) i_0);
		class282_sub50_sub12_3.method14995(401383109);
		class282_sub50_sub12_3.anInt9668 = i_1;
	}
}
