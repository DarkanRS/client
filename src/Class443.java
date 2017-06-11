/* Class443 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class443 {
	int anInt5593 = 0;
	public int anInt5594 = 328024129;
	public int anInt5595;
	public boolean aBoolean5596;
	public int anInt5597 = -381610496;
	public int anInt5598;
	public boolean aBoolean5599 = true;
	public int anInt5600;
	public int anInt5601;

	void method5880(int i, byte i_0_) {
		try {
			double d = (double) (i >> 16 & 0xff) / 256.0;
			double d_1_ = (double) (i >> 8 & 0xff) / 256.0;
			double d_2_ = (double) (i & 0xff) / 256.0;
			double d_3_ = d;
			if (d_1_ < d_3_)
				d_3_ = d_1_;
			if (d_2_ < d_3_)
				d_3_ = d_2_;
			double d_4_ = d;
			if (d_1_ > d_4_)
				d_4_ = d_1_;
			if (d_2_ > d_4_)
				d_4_ = d_2_;
			double d_5_ = 0.0;
			double d_6_ = 0.0;
			double d_7_ = (d_3_ + d_4_) / 2.0;
			if (d_3_ != d_4_) {
				if (d_7_ < 0.5)
					d_6_ = (d_4_ - d_3_) / (d_3_ + d_4_);
				if (d_7_ >= 0.5)
					d_6_ = (d_4_ - d_3_) / (2.0 - d_4_ - d_3_);
				if (d == d_4_)
					d_5_ = (d_1_ - d_2_) / (d_4_ - d_3_);
				else if (d_4_ == d_1_)
					d_5_ = 2.0 + (d_2_ - d) / (d_4_ - d_3_);
				else if (d_4_ == d_2_)
					d_5_ = (d - d_1_) / (d_4_ - d_3_) + 4.0;
			}
			d_5_ /= 6.0;
			anInt5595 = (int) (256.0 * d_6_) * 10667035;
			anInt5600 = (int) (d_7_ * 256.0) * -656706385;
			if (anInt5595 * -620399085 < 0)
				anInt5595 = 0;
			else if (-620399085 * anInt5595 > 255)
				anInt5595 = -1574873371;
			if (656695887 * anInt5600 < 0)
				anInt5600 = 0;
			else if (anInt5600 * 656695887 > 255)
				anInt5600 = 43596369;
			if (d_7_ > 0.5)
				anInt5601 = 1823857443 * (int) (512.0 * (d_6_ * (1.0 - d_7_)));
			else
				anInt5601 = (int) (512.0 * (d_6_ * d_7_)) * 1823857443;
			if (anInt5601 * -813159285 < 1)
				anInt5601 = 1823857443;
			anInt5598 = 599548295 * (int) ((double) (anInt5601 * -813159285) * d_5_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.b(").append(')').toString());
		}
	}

	void method5881(RsByteBuffer class298_sub53, int i, int i_8_) {
		try {
			if (1 == i) {
				((Class443) this).anInt5593 = class298_sub53.read24BitUnsignedInteger((byte) -8) * -1369220863;
				method5880(2106435329 * ((Class443) this).anInt5593, (byte) -123);
			} else if (2 == i) {
				anInt5594 = class298_sub53.readUnsignedShort() * -328024129;
				if (65535 == anInt5594 * 2012295231)
					anInt5594 = 328024129;
			} else if (i == 3)
				anInt5597 = ((class298_sub53.readUnsignedShort() << 2) * -562782069);
			else if (4 == i)
				aBoolean5599 = false;
			else if (5 == i)
				aBoolean5596 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.f(").append(')').toString());
		}
	}

	Class443() {
		aBoolean5596 = true;
	}

	void method5882(RsByteBuffer class298_sub53, byte i) {
		try {
			for (;;) {
				int i_9_ = class298_sub53.readUnsignedByte();
				if (0 == i_9_) {
					if (i != 7)
						break;
					break;
				}
				method5881(class298_sub53, i_9_, 1088681663);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.a(").append(')').toString());
		}
	}

	static void method5883(IComponentDefinition class105, Class_ta class_ta, int i, int i_10_, int i_11_, int i_12_, Class57 class57, byte i_13_) {
		try {
			if (null != class57) {
				int i_14_;
				if (-863531439 * Class298_Sub1.anInt7164 == 2)
					i_14_ = (int) client.aFloat8949 & 0x3fff;
				else
					i_14_ = ((int) client.aFloat8949 + client.anInt8801 * 1227356013) & 0x3fff;
				int i_15_ = (Math.max(class105.anInt1156 * -2093041337 / 2, 457937409 * class105.anInt1162 / 2) + 10);
				int i_16_ = i_12_ * i_12_ + i_11_ * i_11_;
				if (i_16_ <= i_15_ * i_15_) {
					int i_17_ = Class220.anIntArray2483[i_14_];
					int i_18_ = Class220.anIntArray2474[i_14_];
					if (2 != Class298_Sub1.anInt7164 * -863531439) {
						i_17_ = 256 * i_17_ / (256 + client.anInt8749 * 356727603);
						i_18_ = 256 * i_18_ / (356727603 * client.anInt8749 + 256);
					}
					int i_19_ = i_12_ * i_17_ + i_11_ * i_18_ >> 14;
					int i_20_ = i_18_ * i_12_ - i_11_ * i_17_ >> 14;
					class57.method654((i_19_ + (class105.anInt1156 * -2093041337 / 2 + i) - class57.method271() / 2), (457937409 * class105.anInt1162 / 2 + i_10_ - i_20_ - class57.method626() / 2), class_ta, i, i_10_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.t(").append(')').toString());
		}
	}

	static final void method5884(int i, int i_21_) {
		try {
			if (Class378.method4671(i, null, -1926955800))
				Class411.method5578((Class389.aClass119Array4165[i].aClass105Array1405), -1, (byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.lf(").append(')').toString());
		}
	}

	static final void method5885(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class95.anInt923 * -2009663223;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.ami(").append(')').toString());
		}
	}

	static final void method5886(ClientScript2 class403, short i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			Class495.method6194(string, 1988988347);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.vk(").append(')').toString());
		}
	}

	static final void method5887(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_22_ = ((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]) - 1);
			int i_23_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
			int i_24_ = (((ClientScript2) class403).anIntArray5244[2 + 681479919 * ((ClientScript2) class403).anInt5239]);
			if (i_22_ < 0 || i_22_ > 9)
				throw new RuntimeException();
			Class127.method1423(class105, i_22_, i_23_, i_24_, class403, 890851226);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sh.ke(").append(')').toString());
		}
	}
}
