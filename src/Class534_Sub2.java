public class Class534_Sub2 extends Class534 {

	boolean method11434() {
		return this.method12842(654823929) != null || this.aLong7076 * 1203484888895588483L * 2966128844247041579L < Utils.time() - 2000L;
	}

	MouseRecord method12842(int i_1) {
		return (MouseRecord) client.mouseRecords.head();
	}

	void method11427(RsByteBuffer rsbytebuffer_1, MouseRecord class282_sub53_2) {
	}

	boolean method11423() {
		return this.method12842(1070936564) != null || this.aLong7076 < Utils.time() - 2000L;
	}

	TCPPacket method11416() {
		return Class271.createPacket(ClientPacket.MOVE_MOUSE_2, client.GAME_CONNECTION_CONTEXT.isaac);
	}

	void method11413(RsByteBuffer rsbytebuffer_1, MouseRecord class282_sub53_2) {
	}

	int method11412() {
		return 0;
	}

	void method11431() {
		MouseRecord class282_sub53_1 = this.method12842(1478779913);
		if (class282_sub53_1 != null) {
			int i_2 = this.method11408(class282_sub53_1, 32767, 207131238);
			int i_3 = class282_sub53_1.getY();
			if (i_3 < 0) {
				i_3 = 0;
			} else if (i_3 > 65535) {
				i_3 = 65535;
			}
			int i_4 = class282_sub53_1.getX();
			if (i_4 < 0) {
				i_4 = 0;
			} else if (i_4 > 65535) {
				i_4 = 65535;
			}
			byte b_5 = 0;
			if (class282_sub53_1.getClickType() == 2) {
				b_5 = 1;
			}
			TCPPacket tcpmessage_6 = Class271.createPacket(ClientPacket.MOUSE_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
			tcpmessage_6.buffer.writeLEInt(i_4 | i_3 << 16, (byte) -37);
			tcpmessage_6.buffer.writeShort(i_2 | b_5 << 15);
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_6);
		}
	}

	void method11418() {
		MouseRecord class282_sub53_1 = this.method12842(898910000);
		if (class282_sub53_1 != null) {
			int i_2 = this.method11408(class282_sub53_1, 32767, 1197830293);
			int i_3 = class282_sub53_1.getY();
			if (i_3 < 0) {
				i_3 = 0;
			} else if (i_3 > 65535) {
				i_3 = 65535;
			}
			int i_4 = class282_sub53_1.getX();
			if (i_4 < 0) {
				i_4 = 0;
			} else if (i_4 > 65535) {
				i_4 = 65535;
			}
			byte b_5 = 0;
			if (class282_sub53_1.getClickType() == 2) {
				b_5 = 1;
			}
			TCPPacket tcpmessage_6 = Class271.createPacket(ClientPacket.MOUSE_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
			tcpmessage_6.buffer.writeLEInt(i_4 | i_3 << 16, (byte) 76);
			tcpmessage_6.buffer.writeShort(i_2 | b_5 << 15);
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_6);
		}
	}

	int method11415() {
		return 0;
	}

	TCPPacket method11421() {
		return Class271.createPacket(ClientPacket.MOVE_MOUSE_2, client.GAME_CONNECTION_CONTEXT.isaac);
	}

	TCPPacket method11420() {
		return Class271.createPacket(ClientPacket.MOVE_MOUSE_2, client.GAME_CONNECTION_CONTEXT.isaac);
	}

	TCPPacket method11428() {
		return Class271.createPacket(ClientPacket.MOVE_MOUSE_2, client.GAME_CONNECTION_CONTEXT.isaac);
	}

	void method11414() {
		MouseRecord class282_sub53_2 = this.method12842(500103661);
		if (class282_sub53_2 != null) {
			int i_3 = this.method11408(class282_sub53_2, 32767, -102422024);
			int i_4 = class282_sub53_2.getY();
			if (i_4 < 0) {
				i_4 = 0;
			} else if (i_4 > 65535) {
				i_4 = 65535;
			}
			int i_5 = class282_sub53_2.getX();
			if (i_5 < 0) {
				i_5 = 0;
			} else if (i_5 > 65535) {
				i_5 = 65535;
			}
			byte b_6 = 0;
			if (class282_sub53_2.getClickType() == 2) {
				b_6 = 1;
			}
			TCPPacket tcpmessage_7 = Class271.createPacket(ClientPacket.MOUSE_CLICK, client.GAME_CONNECTION_CONTEXT.isaac);
			tcpmessage_7.buffer.writeLEInt(i_5 | i_4 << 16, (byte) -3);
			tcpmessage_7.buffer.writeShort(i_3 | b_6 << 15);
			client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_7);
		}
	}

	int method11425() {
		return 0;
	}

	int method11424() {
		return 0;
	}

	TCPPacket method11422() {
		return Class271.createPacket(ClientPacket.MOVE_MOUSE_2, client.GAME_CONNECTION_CONTEXT.isaac);
	}

	void method11426(RsByteBuffer rsbytebuffer_1, MouseRecord class282_sub53_2) {
	}

	static final void method12847(int i_0, byte b_1) {
		client.anIntArray7198 = new int[i_0];
		client.anIntArray7303 = new int[i_0];
		client.anIntArray7194 = new int[i_0];
		client.anIntArray7305 = new int[i_0];
		client.anIntArray7306 = new int[i_0];
	}
}
