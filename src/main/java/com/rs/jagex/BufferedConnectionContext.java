package com.rs.jagex;

import java.io.IOException;

public class BufferedConnectionContext {

	static int anInt2300;
	public static BufferedConnectionContext getConnectionContext() {
		return GameState.inLobby(client.GAME_STATE) ? client.LOBBY_CONNECTION_CONTEXT : client.GAME_CONNECTION_CONTEXT;
	}
	public ISAACCipher outKeys;
	public int anInt2290;
	public boolean aBool2298;
	ServerProt lastPacket;
	ServerProt thirdLastPacket;
	ISAACCipher inKeys;
	ServerProt secondLastPacket;
	int anInt2297;
	int readDataSize;
	Connection connection;
	NodeCollection queuedPackets = new NodeCollection();
	ByteBuf writeBuffer = new ByteBuf(1600);
	ByteBuf.Bit recievedBuffer = new ByteBuf.Bit(15000);
	ServerProt currentPacket;
	int currentPacketSize;
	boolean readyToRead = true;
	int idleReadPulses;
	ConnectionPinger pinger = new ConnectionPinger();
	int anInt2293;
	int anInt2294;

	int read;

	BufferedConnectionContext() {
		Thread thread_1 = new Thread(pinger);
		thread_1.setPriority(1);
		thread_1.start();
	}

	void clearAllQueuedPackets() {
		queuedPackets.removeAll();
		readDataSize = 0;
	}

	void end() {
		if (connection != null) {
			connection.end();
			connection = null;
		}
		pinger.setIp(null);
	}

	public void flush() throws IOException {
		if (connection != null && readDataSize > 0) {
			writeBuffer.index = 0;
			while (true) {
				TCPPacket packet = (TCPPacket) queuedPackets.head();
				if (packet == null || packet.anInt7680 > writeBuffer.buffer.length - writeBuffer.index) {
					connection.write(writeBuffer.buffer, writeBuffer.index);
					anInt2297 += writeBuffer.index;
					anInt2290 = 0;
					break;
				}
				writeBuffer.writeBytes(packet.buffer.buffer, 0, packet.anInt7680);
				readDataSize -= packet.anInt7680;
				packet.unlink();
				packet.buffer.method13059();
				packet.method12360();
			}
		}
	}

	public Connection getConnection() {
		return connection;
	}

	void init(Connection connection, String ip) {
		this.connection = connection;
		pinger.setIp(ip);
	}

	void method3059() {
		if (client.FRAME_COUNT % 50 == 0) {
			anInt2293 = anInt2297;
			anInt2297 = 0;
			anInt2294 = read;
			read = 0;
		}
	}

	public void queuePacket(TCPPacket tcpmessage_1) {
		queuedPackets.append(tcpmessage_1);
		tcpmessage_1.anInt7680 = tcpmessage_1.buffer.index;
		tcpmessage_1.buffer.index = 0;
		readDataSize += tcpmessage_1.anInt7680;
	}

	void reset() {
		connection = null;
		pinger.setIp(null);
	}
}
