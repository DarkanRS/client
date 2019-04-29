import java.io.IOException;
import java.net.Socket;

public abstract class Class434 {

	static int anInt5329;
	String aString5330;
	int anInt5331;

	public abstract Socket method7280(int var1) throws IOException;

	public abstract Socket method7281() throws IOException;

	public abstract Socket method7282() throws IOException;

	public abstract Socket method7287() throws IOException;

	Socket method7291() throws IOException {
		return new Socket(Loader.IP_ADDRESS, Loader.LOBBY_PORT);
	}

	public static void method7292() {
		Class373.method6365();
		Class236.aClass534_Sub2_2911.method11417(-2118478860);
		Class236.aClass534_Sub1_2913.method11417(-2125512068);
		TCPPacket tcpmessage_1;
		int i_2;
		if (client.maximumHeldKeys > 0) {
			tcpmessage_1 = Class271.createPacket(OutgoingPacket.KEY_PRESS, client.outputContext.isaac);
			tcpmessage_1.buffer.writeShort(client.maximumHeldKeys * 4);

			for (i_2 = 0; i_2 < client.maximumHeldKeys; i_2++) {
				KeyRecord interface16_3 = client.keyRecords[i_2];
				long long_4 = interface16_3.method119(272047645) - Class236.aLong2910;
				if (long_4 > 16777215L) {
					long_4 = 16777215L;
				}

				Class236.aLong2910 = interface16_3.method119(941918410);
				tcpmessage_1.buffer.writeByte(interface16_3.getCode());
				tcpmessage_1.buffer.write24BitInt((int) long_4);
			}

			client.outputContext.queuePacket(tcpmessage_1);
		}

		if (Class236.anInt2912 > 0) {
			--Class236.anInt2912;
		}

		if (client.aBool7371 && Class236.anInt2912 <= 0) {
			Class236.anInt2912 = 20;
			client.aBool7371 = false;
			tcpmessage_1 = Class271.createPacket(OutgoingPacket.MOVE_CAMERA, client.outputContext.isaac);
			tcpmessage_1.buffer.writeShortLE128((int) client.aFloat7146 >> 3);
			tcpmessage_1.buffer.writeShort128((int) client.aFloat7365 >> 3);
			client.outputContext.queuePacket(tcpmessage_1);
		}

		if (Class236.aBool2909 != Class530.appletHasFocus) {
			Class236.aBool2909 = Class530.appletHasFocus;
			tcpmessage_1 = Class271.createPacket(OutgoingPacket.CLIENT_FOCUS, client.outputContext.isaac);
			tcpmessage_1.buffer.writeByte(Class530.appletHasFocus ? 1 : 0);
			client.outputContext.queuePacket(tcpmessage_1);
		}

		if (!client.aBool7175) {
			tcpmessage_1 = Class271.createPacket(OutgoingPacket.SEND_PREFERENCES, client.outputContext.isaac);
			tcpmessage_1.buffer.writeByte(0);
			i_2 = tcpmessage_1.buffer.index;
			RsByteBuffer rsbytebuffer_6 = Class393.preferences.encode();
			tcpmessage_1.buffer.writeBytes(rsbytebuffer_6.buffer, 0, rsbytebuffer_6.index);
			tcpmessage_1.buffer.method13061(tcpmessage_1.buffer.index - i_2, -1036471531);
			client.outputContext.queuePacket(tcpmessage_1);
			client.aBool7175 = true;
		}

	}

}
