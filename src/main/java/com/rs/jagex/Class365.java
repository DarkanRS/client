package com.rs.jagex;

public class Class365 implements Interface3 {

	public static void method6299(int i_0, boolean bool_1, int i_2, boolean bool_3) {
		Class52.method1086(0, ConnectionInfo.WORLD_DESCRIPTORS_BYID.length - 1, i_0, bool_1, i_2, bool_3);
		ConnectionInfo.currentWorldPingIdx = 0;
		ConnectionInfo.CURRENT_WORLD_PING_REQUEST = null;
	}
	public int anInt4229;
	public Class356 aClass356_4225;
	public Class353 aClass353_4226;
	public int anInt4221;
	public int anInt4223;
	public int anInt4227;
	public int anInt4228;
	public int anInt4224;
	public int anInt4222;
	public int anInt4220;

	public boolean aBool4230;

	Class365(int i_1, Class356 class356_2, Class353 class353_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, boolean bool_11) {
		anInt4229 = i_1;
		aClass356_4225 = class356_2;
		aClass353_4226 = class353_3;
		anInt4221 = i_4;
		anInt4223 = i_5;
		anInt4227 = i_6;
		anInt4228 = i_7;
		anInt4224 = i_8;
		anInt4222 = i_9;
		anInt4220 = i_10;
		aBool4230 = bool_11;
	}

	@Override
	public Class60 method24() {
		return Class60.aClass60_605;
	}

	@Override
	public Class60 method25() {
		return Class60.aClass60_605;
	}

}
