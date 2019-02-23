public class Class534_Sub2 extends Class534 {

	boolean method11434() {
		return this.method12842(654823929) != null || this.aLong7076 * 1203484888895588483L * 2966128844247041579L < Class169.method2869(1907896045) - 2000L;
	}

	Class282_Sub53 method12842(int i_1) {
		return (Class282_Sub53) client.aClass482_7267.head((byte) 61);
	}

	void method11427(RsByteBuffer rsbytebuffer_1, Class282_Sub53 class282_sub53_2) {
	}

	boolean method11423(int i_1) {
		return this.method12842(1070936564) != null || this.aLong7076 < Class169.method2869(1563123713) - 2000L;
	}

	TCPMessage method11416(byte b_1) {
		return Class271.method4828(OutgoingPacket.aClass379_4600, client.aClass184_7475.isaac, -490942131);
	}

	void method11413(RsByteBuffer rsbytebuffer_1, Class282_Sub53 class282_sub53_2, int i_3) {
	}

	int method11412(int i_1) {
		return 0;
	}

	void method11431() {
		Class282_Sub53 class282_sub53_1 = this.method12842(1478779913);
		if (class282_sub53_1 != null) {
			int i_2 = this.method11408(class282_sub53_1, 32767, 207131238);
			int i_3 = class282_sub53_1.method13469(792510855);
			if (i_3 < 0) {
				i_3 = 0;
			} else if (i_3 > 65535) {
				i_3 = 65535;
			}

			int i_4 = class282_sub53_1.method13481(1279358218);
			if (i_4 < 0) {
				i_4 = 0;
			} else if (i_4 > 65535) {
				i_4 = 65535;
			}

			byte b_5 = 0;
			if (class282_sub53_1.method13470(-959652469) == 2) {
				b_5 = 1;
			}

			TCPMessage tcpmessage_6 = Class271.method4828(OutgoingPacket.aClass379_4586, client.aClass184_7475.isaac, -109776879);
			tcpmessage_6.buffer.writeLEInt(i_4 | i_3 << 16, (byte) -37);
			tcpmessage_6.buffer.writeShort(i_2 | b_5 << 15, 1417031095);
			client.aClass184_7475.method3049(tcpmessage_6, 1544869711);
		}

	}

	void method11418() {
		Class282_Sub53 class282_sub53_1 = this.method12842(898910000);
		if (class282_sub53_1 != null) {
			int i_2 = this.method11408(class282_sub53_1, 32767, 1197830293);
			int i_3 = class282_sub53_1.method13469(2099556517);
			if (i_3 < 0) {
				i_3 = 0;
			} else if (i_3 > 65535) {
				i_3 = 65535;
			}

			int i_4 = class282_sub53_1.method13481(1254719059);
			if (i_4 < 0) {
				i_4 = 0;
			} else if (i_4 > 65535) {
				i_4 = 65535;
			}

			byte b_5 = 0;
			if (class282_sub53_1.method13470(-956354647) == 2) {
				b_5 = 1;
			}

			TCPMessage tcpmessage_6 = Class271.method4828(OutgoingPacket.aClass379_4586, client.aClass184_7475.isaac, -423212520);
			tcpmessage_6.buffer.writeLEInt(i_4 | i_3 << 16, (byte) 76);
			tcpmessage_6.buffer.writeShort(i_2 | b_5 << 15, 1417031095);
			client.aClass184_7475.method3049(tcpmessage_6, 1417972816);
		}

	}

	int method11415() {
		return 0;
	}

	TCPMessage method11421() {
		return Class271.method4828(OutgoingPacket.aClass379_4600, client.aClass184_7475.isaac, -83522349);
	}

	TCPMessage method11420() {
		return Class271.method4828(OutgoingPacket.aClass379_4600, client.aClass184_7475.isaac, 1010735429);
	}

	TCPMessage method11428() {
		return Class271.method4828(OutgoingPacket.aClass379_4600, client.aClass184_7475.isaac, -202968975);
	}

	void method11414(int i_1) {
		Class282_Sub53 class282_sub53_2 = this.method12842(500103661);
		if (class282_sub53_2 != null) {
			int i_3 = this.method11408(class282_sub53_2, 32767, -102422024);
			int i_4 = class282_sub53_2.method13469(367077082);
			if (i_4 < 0) {
				i_4 = 0;
			} else if (i_4 > 65535) {
				i_4 = 65535;
			}

			int i_5 = class282_sub53_2.method13481(1346429650);
			if (i_5 < 0) {
				i_5 = 0;
			} else if (i_5 > 65535) {
				i_5 = 65535;
			}

			byte b_6 = 0;
			if (class282_sub53_2.method13470(-235884507) == 2) {
				b_6 = 1;
			}

			TCPMessage tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4586, client.aClass184_7475.isaac, 417641867);
			tcpmessage_7.buffer.writeLEInt(i_5 | i_4 << 16, (byte) -3);
			tcpmessage_7.buffer.writeShort(i_3 | b_6 << 15, 1417031095);
			client.aClass184_7475.method3049(tcpmessage_7, -990587266);
		}

	}

	int method11425() {
		return 0;
	}

	int method11424() {
		return 0;
	}

	TCPMessage method11422() {
		return Class271.method4828(OutgoingPacket.aClass379_4600, client.aClass184_7475.isaac, 1192447706);
	}

	void method11426(RsByteBuffer rsbytebuffer_1, Class282_Sub53 class282_sub53_2) {
	}

	static final void method12846(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class389.method6697(icomponentdefinitions_3, interface_4, cs2executor_0, 2102985161);
	}

	static final void method12847(int i_0, byte b_1) {
		client.anIntArray7198 = new int[i_0];
		client.anIntArray7303 = new int[i_0];
		client.anIntArray7194 = new int[i_0];
		client.anIntArray7305 = new int[i_0];
		client.anIntArray7306 = new int[i_0];
	}

}
