/* Class238 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class238 implements Interface10 {
	public Object method131(byte[] is, Class505 class505, boolean bool, int i) {
		try {
			return Class373.aClass_ra4071.method5092(class505, Class89.method982(is), bool);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("k.a(").append(')').toString());
		}
	}

	public Object method130(byte[] is, Class505 class505, boolean bool) {
		return Class373.aClass_ra4071.method5092(class505, Class89.method982(is), bool);
	}

	public Object method132(byte[] is, Class505 class505, boolean bool) {
		return Class373.aClass_ra4071.method5092(class505, Class89.method982(is), bool);
	}

	static Class322 method2199(Class365_Sub1_Sub1 class365_sub1_sub1, byte i) {
		try {
			Class322 class322;
			if (null == Class322.aClass322_3358)
				class322 = new Class322();
			else {
				class322 = Class322.aClass322_3358;
				Class322.aClass322_3358 = Class322.aClass322_3358.aClass322_3360;
				class322.aClass322_3360 = null;
				Class322.anInt3361 -= -1998519535;
			}
			class322.aClass365_Sub1_Sub1_3359 = class365_sub1_sub1;
			return class322;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("k.a(").append(')').toString());
		}
	}

	public static void method2200(Class139 class139, Class133 class133, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			Class14.aClass139_171 = class139;
			Class14.aClass133_177 = class133;
			Class14.anInt170 = i * 295365919;
			Class14.anInt173 = -1224770727 * i_0_;
			Class14.anInt172 = i_1_ * -1586864867;
			Class14.anInt175 = 1104541761 * i_2_;
			Class410.anInt5290 = 1351228359 * i_3_;
			Class14.anInt174 = 838462141 * i_4_;
			Class318.anInt3323 = i_5_ * 339871807;
			Class98_Sub2.aClass89_6932 = null;
			Class422_Sub30.aClass89_8437 = null;
			Class385.aClass89_4142 = null;
			Class428.anInt6623 = i_6_ * 1589600979;
			Class14.anInt168 = i_7_ * -674457001;
			Class309.method3804(-1268692886);
			Class372_Sub3.aBoolean7730 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("k.a(").append(')').toString());
		}
	}

	static Class345 method2201(RsByteBuffer class298_sub53, int i) {
		try {
			int i_9_ = class298_sub53.readUnsignedByte();
			int i_10_ = class298_sub53.readUnsignedByte();
			int i_11_ = class298_sub53.readUnsignedByte();
			int[] is = new int[i_11_];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
				is[i_12_] = class298_sub53.readUnsignedByte();
			return new Class345(i_9_, i_10_, is);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("k.p(").append(')').toString());
		}
	}

	static final void method2202(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_13_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_14_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
			int i_15_ = (((ClientScript2) class403).anIntArray5244[2 + 681479919 * ((ClientScript2) class403).anInt5239]);
			Class50.getIComponentDefinitions(i_13_, (byte) 83);
			Class359.method4291(Class389.aClass119Array4165[i_13_ >>> 16], i_13_ & 0xffff, i_14_, i_15_, ((ClientScript2) class403).aBoolean5261, class403, -782842809);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("k.ba(").append(')').toString());
		}
	}
}
