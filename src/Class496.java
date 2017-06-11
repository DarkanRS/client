/* Class496 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class496 {
	Class487 aClass487_6095;
	public int anInt6096;
	public int anInt6097;
	public boolean aBoolean6098 = false;

	void method6196(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i != -1377008682) {
						/* empty */
					}
					break;
				}
				method6199(class298_sub53, i_0_, 227910133);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ul.a(").append(')').toString());
		}
	}

	public boolean method6197(byte i) {
		try {
			return ((Class487) ((Class496) this).aClass487_6095).aClass243_6068.method2310(anInt6097 * 1690480405, -457216440);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ul.p(").append(')').toString());
		}
	}

	public Class57 method6198(GraphicsToolkit class_ra, int i, boolean bool, byte i_1_) {
		try {
			long l = (long) (anInt6097 * 1690480405 | i << 16 | (bool ? 262144 : 0) | class_ra.anInt5298 * 580915349 << 19);
			Class57 class57 = (Class57) ((Class487) ((Class496) this).aClass487_6095).aClass348_6065.method4184(l);
			if (class57 != null)
				return class57;
			if (!((Class487) ((Class496) this).aClass487_6095).aClass243_6068.method2310(anInt6097 * 1690480405, -457216440))
				return null;
			Class89 class89 = Class89.method987((((Class487) (((Class496) this).aClass487_6095)).aClass243_6068), 1690480405 * anInt6097, 0);
			if (null != class89) {
				Class89 class89_2_ = class89;
				Class89 class89_3_ = class89;
				Class89 class89_4_ = class89;
				class89.anInt811 = 0;
				class89_4_.anInt814 = 0;
				class89_3_.anInt815 = 0;
				class89_2_.anInt813 = 0;
				if (bool)
					class89.method980();
				for (int i_5_ = 0; i_5_ < i; i_5_++)
					class89.method989();
			}
			class57 = class_ra.method5125(class89, true);
			if (class57 != null)
				((Class487) ((Class496) this).aClass487_6095).aClass348_6065.method4194(class57, l);
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ul.b(").append(')').toString());
		}
	}

	void method6199(RsByteBuffer class298_sub53, int i, int i_6_) {
		try {
			if (i == 1)
				anInt6097 = class298_sub53.readBigSmart(1235052657) * 24979517;
			else if (2 == i)
				anInt6096 = class298_sub53.read24BitUnsignedInteger((byte) 1) * 1870808461;
			else if (3 == i)
				aBoolean6098 = true;
			else if (i == 4)
				anInt6097 = -24979517;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ul.f(").append(')').toString());
		}
	}

	Class496() {
		/* empty */
	}

	static final void method6200(ClientScript2 class403, int i) {
		try {
			int i_7_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (null != Class301_Sub1.aClass437_7636) {
				Linkable class298 = Class301_Sub1.aClass437_7636.get((long) i_7_);
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = class298 != null ? 1 : 0;
			} else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ul.aeo(").append(')').toString());
		}
	}

	static final void method6201(ClientScript2 class403, int i) {
		try {
			int i_8_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (i_8_ >= 1 && i_8_ <= 2) {
				Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub12_7543, i_8_, 708632362);
				Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub12_7574, i_8_, 837898760);
				Class3.method300(656179282);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ul.afu(").append(')').toString());
		}
	}

	static void method6202(double d) {
		try {
			if (Class298_Sub37_Sub6.aDouble9587 != d) {
				for (int i = 0; i < 256; i++) {
					int i_9_ = (int) (Math.pow((double) i / 255.0, d) * 255.0);
					Class298_Sub37_Sub6.anIntArray9586[i] = i_9_ > 255 ? 255 : i_9_;
				}
				Class298_Sub37_Sub6.aDouble9587 = d;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ul.i(").append(')').toString());
		}
	}

	static final void method6203(ClientScript2 class403, int i) {
		try {
			int i_10_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_10_, (byte) -20);
			int i_11_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			i_11_--;
			if (class105.aStringArray1195 == null || i_11_ >= class105.aStringArray1195.length || class105.aStringArray1195[i_11_] == null)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = class105.aStringArray1195[i_11_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ul.sg(").append(')').toString());
		}
	}
}
