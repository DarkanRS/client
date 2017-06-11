/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class122 {
	public String aString1464;
	public String aString1465;
	static Class243 aClass243_1466;
	public static Class243 aClass243_1467;

	void method1317(Class101 class101, int i) {
		try {
			aString1465 = class101.method1079(1509343502);
			aString1464 = class101.method1079(1509343502);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ey.a(").append(')').toString());
		}
	}

	Class122() {
		/* empty */
	}

	public static Class151 method1318(RsByteBuffer class298_sub53, byte i) {
		try {
			String string = class298_sub53.readString(-564007296);
			Class139 class139 = (Class491.method6176((byte) 112)[class298_sub53.readUnsignedByte()]);
			Class133 class133 = (Class113.method1255(722680550)[class298_sub53.readUnsignedByte()]);
			int i_0_ = class298_sub53.readShort(1872216088);
			int i_1_ = class298_sub53.readShort(2093452439);
			int i_2_ = class298_sub53.readUnsignedByte();
			int i_3_ = class298_sub53.readUnsignedByte();
			int i_4_ = class298_sub53.readUnsignedByte();
			int i_5_ = class298_sub53.readUnsignedShort();
			int i_6_ = class298_sub53.readUnsignedShort();
			int i_7_ = class298_sub53.readBigSmart(1235052657);
			int i_8_ = class298_sub53.readInt((byte) 69);
			int i_9_ = class298_sub53.readInt((byte) 57);
			return new Class151(string, class139, class133, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ey.a(").append(')').toString());
		}
	}

	public static final synchronized long method1319(byte i) {
		try {
			long l = System.currentTimeMillis();
			if (l < -1072184856876656313L * Class83.aLong763)
				Class83.aLong762 += (-7920182256634826327L * (-1072184856876656313L * Class83.aLong763 - l));
			Class83.aLong763 = -8643661642579214217L * l;
			return Class83.aLong762 * 8643379242525344409L + l;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ey.a(").append(')').toString());
		}
	}

	static final void method1320(Entity class365_sub1_sub1_sub2, Entity class365_sub1_sub1_sub2_10_, int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		try {
			int i_18_ = class365_sub1_sub1_sub2_10_.method4427((byte) 1);
			if (i_18_ != -1) {
				Object object = null;
				Class57 class57 = (Class57) client.aClass348_8697.method4184((long) i_18_);
				if (null == class57) {
					Class89[] class89s = Class89.method993(Class158.aClass243_6364, i_18_, 0);
					if (null == class89s)
						return;
					class57 = Class373.aClass_ra4071.method5125(class89s[0], true);
					client.aClass348_8697.method4194(class57, (long) i_18_);
				}
				Class217 class217 = class365_sub1_sub1_sub2.method4337().aClass217_2599;
				Class125.method1400(class365_sub1_sub1_sub2.plane, (int) class217.aFloat2451, (int) class217.aFloat2454, class365_sub1_sub1_sub2.getSize() * 256, 0, false, 2131920659);
				int i_19_ = (int) ((float) i_11_ + client.aFloatArray8891[0] - 18.0F);
				int i_20_ = (int) ((float) i_12_ + client.aFloatArray8891[1] - 16.0F - 54.0F);
				i_19_ += i / 4 * 18;
				i_20_ += 18 * (i % 4);
				class57.method645(i_19_, i_20_);
				if (class365_sub1_sub1_sub2 == class365_sub1_sub1_sub2_10_)
					Class373.aClass_ra4071.method5014(i_19_ - 1, i_20_ - 1, 18, 18, -256, -769094548);
				Class302_Sub5 class302_sub5 = Class229.method2122((byte) 60);
				((Class302_Sub5) class302_sub5).aClass365_Sub1_Sub1_Sub2_7660 = class365_sub1_sub1_sub2_10_;
				((Class302_Sub5) class302_sub5).anInt7659 = i_19_ * 514092373;
				((Class302_Sub5) class302_sub5).anInt7663 = i_20_ * -783084201;
				((Class302_Sub5) class302_sub5).anInt7664 = 1997526347 * (i_19_ + 16);
				((Class302_Sub5) class302_sub5).anInt7665 = 1675098759 * (i_20_ + 16);
				client.aClass442_8781.method5870(class302_sub5, -69122600);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ey.jp(").append(')').toString());
		}
	}

	static final void method1321(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub10_7548.method5661((byte) 92);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ey.akg(").append(')').toString());
		}
	}

	static final void method1322(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_21_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_22_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_21_ < i_22_ ? i_21_ : i_22_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ey.or(").append(')').toString());
		}
	}
}
