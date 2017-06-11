/* Class98_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class98_Sub4 extends Class98 {
	int anInt6939;
	int anInt6940;
	int anInt6941;
	static int anInt6942 = 1;
	int anInt6943;
	int anInt6944;
	int anInt6945;
	int anInt6946;
	int anInt6947;

	void method1050(int i, int i_0_) {
		/* empty */
	}

	void method1054(int i, int i_1_, byte i_2_) {
		try {
			int i_3_ = i * (-499535773 * ((Class98_Sub4) this).anInt6940) >> 12;
			int i_4_ = ((Class98_Sub4) this).anInt6941 * -1676834815 * i_1_ >> 12;
			int i_5_ = ((Class98_Sub4) this).anInt6947 * 1286877931 * i >> 12;
			int i_6_ = 1208078209 * ((Class98_Sub4) this).anInt6943 * i_1_ >> 12;
			int i_7_ = 1616079851 * ((Class98_Sub4) this).anInt6944 * i >> 12;
			int i_8_ = 1348897509 * ((Class98_Sub4) this).anInt6945 * i_1_ >> 12;
			int i_9_ = 1800257793 * ((Class98_Sub4) this).anInt6939 * i >> 12;
			int i_10_ = 1776133377 * ((Class98_Sub4) this).anInt6946 * i_1_ >> 12;
			Class336.method4095(i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, ((Class98_Sub4) this).anInt947 * 1785836763, (byte) -73);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yy.a(").append(')').toString());
		}
	}

	Class98_Sub4(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_) {
		super(-1, i_18_, i_19_);
		((Class98_Sub4) this).anInt6940 = i * -1481748149;
		((Class98_Sub4) this).anInt6941 = i_11_ * 2083682305;
		((Class98_Sub4) this).anInt6947 = i_12_ * -581704253;
		((Class98_Sub4) this).anInt6943 = i_13_ * 860778625;
		((Class98_Sub4) this).anInt6944 = -324574013 * i_14_;
		((Class98_Sub4) this).anInt6945 = -1154276627 * i_15_;
		((Class98_Sub4) this).anInt6939 = -13418751 * i_16_;
		((Class98_Sub4) this).anInt6946 = -2055513343 * i_17_;
	}

	void method1048(int i, int i_20_, byte i_21_) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yy.b(").append(')').toString());
		}
	}

	void method1049(int i, int i_22_) {
		int i_23_ = i * (-499535773 * ((Class98_Sub4) this).anInt6940) >> 12;
		int i_24_ = ((Class98_Sub4) this).anInt6941 * -1676834815 * i_22_ >> 12;
		int i_25_ = ((Class98_Sub4) this).anInt6947 * 1286877931 * i >> 12;
		int i_26_ = 1208078209 * ((Class98_Sub4) this).anInt6943 * i_22_ >> 12;
		int i_27_ = 1616079851 * ((Class98_Sub4) this).anInt6944 * i >> 12;
		int i_28_ = 1348897509 * ((Class98_Sub4) this).anInt6945 * i_22_ >> 12;
		int i_29_ = 1800257793 * ((Class98_Sub4) this).anInt6939 * i >> 12;
		int i_30_ = 1776133377 * ((Class98_Sub4) this).anInt6946 * i_22_ >> 12;
		Class336.method4095(i_23_, i_24_, i_25_, i_26_, i_27_, i_28_, i_29_, i_30_, ((Class98_Sub4) this).anInt947 * 1785836763, (byte) -33);
	}

	void method1052(int i, int i_31_) {
		/* empty */
	}

	void method1053(int i, int i_32_) {
		/* empty */
	}

	void method1046(int i, int i_33_) {
		/* empty */
	}

	void method1051(int i, int i_34_) {
		/* empty */
	}

	void method1047(int i, int i_35_, byte i_36_) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yy.f(").append(')').toString());
		}
	}

	static final void method1068(ClientScript2 class403, byte i) {
		try {
			int i_37_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_37_, (byte) -58);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 2053897963 * class105.anInt1169;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yy.rq(").append(')').toString());
		}
	}

	static final int method1069(int i, int i_38_, int i_39_, int i_40_) {
		try {
			if (i_38_ == i)
				return i;
			int i_41_ = 128 - i_39_;
			int i_42_ = i_39_ * (i_38_ & 0x7f) + i_41_ * (i & 0x7f) >> 7;
			int i_43_ = i_41_ * (i & 0x380) + (i_38_ & 0x380) * i_39_ >> 7;
			int i_44_ = (i & 0xfc00) * i_41_ + i_39_ * (i_38_ & 0xfc00) >> 7;
			return i_44_ & 0xfc00 | i_43_ & 0x380 | i_42_ & 0x7f;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yy.c(").append(')').toString());
		}
	}
}
