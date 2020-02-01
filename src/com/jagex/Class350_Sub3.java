package com.jagex;
public class Class350_Sub3 extends Class350 {

	public int anInt7844;
	public int anInt7840;
	public int anInt7842;
	public int anInt7843;
	public int anInt7841;
	public int anInt7845;

	Class350_Sub3(Class356 class356_1, Class353 class353_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13, int i_14, int i_15) {
		super(class356_1, class353_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9);
		this.anInt7844 = i_10;
		this.anInt7840 = i_11;
		this.anInt7842 = i_12;
		this.anInt7843 = i_13;
		this.anInt7841 = i_14;
		this.anInt7845 = i_15;
	}

	public Class60 method25() {
		return Class60.aClass60_608;
	}

	public Class60 method24() {
		return Class60.aClass60_608;
	}

	static void method12590(TCPPacket tcpmessage_0, int i_1, int i_2, int i_3) {
		tcpmessage_0.buffer.writeIntLE(i_1);
		tcpmessage_0.buffer.writeShort(i_3);
		tcpmessage_0.buffer.writeShort128(i_2);
	}

}
