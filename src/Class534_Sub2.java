/* Class534_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class534_Sub2 extends Class534 {
	boolean method11434() {
		return (method12842(654823929) != null || (((Class534_Sub2) this).aLong7076 * 2966128844247041579L < Class169.method2869(1907896045) - 2000L));
	}

	Class282_Sub53 method12842(int i) {
		return (Class282_Sub53) client.aClass482_7267.head((byte) 61);
	}

	void method11427(RsByteBuffer class282_sub35, Class282_Sub53 class282_sub53) {
		/* empty */
	}

	boolean method11423(int i) {
		return (method12842(1070936564) != null || (((Class534_Sub2) this).aLong7076 * 2966128844247041579L < Class169.method2869(1563123713) - 2000L));
	}

	TCPMessage method11416(byte i) {
		return Class271.method4828(OutgoingPacket.aClass379_4600, client.aClass184_7475.isaac, -490942131);
	}

	void method11413(RsByteBuffer class282_sub35, Class282_Sub53 class282_sub53, int i) {
		/* empty */
	}

	int method11412(int i) {
		return 0;
	}

	void method11431() {
		Class282_Sub53 class282_sub53 = method12842(1478779913);
		if (null != class282_sub53) {
			int i = method11408(class282_sub53, 32767, 207131238);
			int i_0_ = class282_sub53.method13469(792510855);
			if (i_0_ < 0)
				i_0_ = 0;
			else if (i_0_ > 65535)
				i_0_ = 65535;
			int i_1_ = class282_sub53.method13481(1279358218);
			if (i_1_ < 0)
				i_1_ = 0;
			else if (i_1_ > 65535)
				i_1_ = 65535;
			int i_2_ = 0;
			if (class282_sub53.method13470(-959652469) == 2)
				i_2_ = 1;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4586, client.aClass184_7475.isaac, -109776879);
			class282_sub23.buffer.writeLEInt(i_1_ | i_0_ << 16, (byte) -37);
			class282_sub23.buffer.writeShort(i | i_2_ << 15, 1417031095);
			client.aClass184_7475.method3049(class282_sub23, 1544869711);
		}
	}

	void method11418() {
		Class282_Sub53 class282_sub53 = method12842(898910000);
		if (null != class282_sub53) {
			int i = method11408(class282_sub53, 32767, 1197830293);
			int i_3_ = class282_sub53.method13469(2099556517);
			if (i_3_ < 0)
				i_3_ = 0;
			else if (i_3_ > 65535)
				i_3_ = 65535;
			int i_4_ = class282_sub53.method13481(1254719059);
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ > 65535)
				i_4_ = 65535;
			int i_5_ = 0;
			if (class282_sub53.method13470(-956354647) == 2)
				i_5_ = 1;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4586, client.aClass184_7475.isaac, -423212520);
			class282_sub23.buffer.writeLEInt(i_4_ | i_3_ << 16, (byte) 76);
			class282_sub23.buffer.writeShort(i | i_5_ << 15, 1417031095);
			client.aClass184_7475.method3049(class282_sub23, 1417972816);
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

	void method11414(int i) {
		Class282_Sub53 class282_sub53 = method12842(500103661);
		if (null != class282_sub53) {
			int i_6_ = method11408(class282_sub53, 32767, -102422024);
			int i_7_ = class282_sub53.method13469(367077082);
			if (i_7_ < 0)
				i_7_ = 0;
			else if (i_7_ > 65535)
				i_7_ = 65535;
			int i_8_ = class282_sub53.method13481(1346429650);
			if (i_8_ < 0)
				i_8_ = 0;
			else if (i_8_ > 65535)
				i_8_ = 65535;
			int i_9_ = 0;
			if (class282_sub53.method13470(-235884507) == 2)
				i_9_ = 1;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4586, client.aClass184_7475.isaac, 417641867);
			class282_sub23.buffer.writeLEInt(i_8_ | i_7_ << 16, (byte) -3);
			class282_sub23.buffer.writeShort(i_6_ | i_9_ << 15, 1417031095);
			client.aClass184_7475.method3049(class282_sub23, -990587266);
		}
	}

	int method11425() {
		return 0;
	}

	int method11424() {
		return 0;
	}

	Class534_Sub2() {
		/* empty */
	}

	TCPMessage method11422() {
		return Class271.method4828(OutgoingPacket.aClass379_4600, client.aClass184_7475.isaac, 1192447706);
	}

	void method11426(RsByteBuffer class282_sub35, Class282_Sub53 class282_sub53) {
		/* empty */
	}

	Class282_Sub53 method12843() {
		return (Class282_Sub53) client.aClass482_7267.head((byte) 48);
	}

	Class282_Sub53 method12844() {
		return (Class282_Sub53) client.aClass482_7267.head((byte) 114);
	}

	Class282_Sub53 method12845() {
		return (Class282_Sub53) client.aClass482_7267.head((byte) 122);
	}

	static final void method12846(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class389.method6697(class118, class98, class527, 2102985161);
	}

	static final void method12847(int i, byte i_10_) {
		client.anIntArray7198 = new int[i];
		client.anIntArray7303 = new int[i];
		client.anIntArray7194 = new int[i];
		client.anIntArray7305 = new int[i];
		client.anIntArray7306 = new int[i];
	}
}
