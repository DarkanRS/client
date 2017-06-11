/* Class473 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class473 {
	public static int anInt5966 = 0;
	static int anInt5967 = 1;
	public char aChar5968;
	public int anInt5969 = -194719339;

	Class473() {
		/* empty */
	}

	void method6066(RsByteBuffer class298_sub53, int i, int i_0_) {
		try {
			if (1 == i)
				aChar5968 = Class493.method6190(class298_sub53.readByte(-12558881), 2112352543);
			else if (i == 2)
				anInt5969 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tm.f(").append(')').toString());
		}
	}

	void method6067(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_1_ = class298_sub53.readUnsignedByte();
				if (i_1_ == 0) {
					if (i != 1327711716)
						throw new IllegalStateException();
					break;
				}
				method6066(class298_sub53, i_1_, -168938577);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tm.a(").append(')').toString());
		}
	}

	static final void method6068(Entity class365_sub1_sub1_sub2, byte i) {
		try {
			Class438 class438 = class365_sub1_sub1_sub2.aClass438_10077;
			if (class438.method5819((byte) -67) && class438.method5822(1, 1987990558) && class438.method5832(-1549707079)) {
				if (class365_sub1_sub1_sub2.aBoolean10094) {
					class438.method5841(class365_sub1_sub1_sub2.method4426(-646688457).method4208(-2063556157), false, true, (byte) 71);
					class365_sub1_sub1_sub2.aBoolean10094 = class438.method5819((byte) -43);
				}
				class438.method5834(-381553454);
			}
			for (int i_2_ = 0; i_2_ < class365_sub1_sub1_sub2.currentGraphics.length; i_2_++) {
				if (-1 != -967533709 * (class365_sub1_sub1_sub2.currentGraphics[i_2_].id)) {
					Class438 class438_3_ = (class365_sub1_sub1_sub2.currentGraphics[i_2_].aClass438_569);
					if (class438_3_.method5826(-65534)) {
						Class398 class398 = (Class158_Sub1.aClass389_8568.method4857((class365_sub1_sub1_sub2.currentGraphics[i_2_].id) * -967533709, -2105534401));
						Class391 class391 = class438_3_.method5820(301840356);
						if (class398.aBoolean5215) {
							if (3 == class391.anInt4182 * 62820525) {
								if ((1888275831 * class365_sub1_sub1_sub2.anInt10125) > 0 && ((class365_sub1_sub1_sub2.anInt10095 * -412225079) <= client.anInt8884 * 443738891) && ((1450943713 * class365_sub1_sub1_sub2.anInt10103) < 443738891 * client.anInt8884)) {
									class438_3_.method5821(-1, -1544973787);
									class365_sub1_sub1_sub2.currentGraphics[i_2_].id = -1313669563;
									continue;
								}
							} else if (1 == class391.anInt4182 * 62820525 && (class365_sub1_sub1_sub2.anInt10125 * 1888275831) > 0 && ((-412225079 * (class365_sub1_sub1_sub2.anInt10095)) <= 443738891 * client.anInt8884) && ((1450943713 * (class365_sub1_sub1_sub2.anInt10103)) < 443738891 * client.anInt8884)) {
								if (i <= 0)
									throw new IllegalStateException();
								continue;
							}
						}
					}
					if (class438_3_.method5822(1, 2118435651) && class438_3_.method5832(-618238980)) {
						class438_3_.method5821(-1, -1633965272);
						class365_sub1_sub1_sub2.currentGraphics[i_2_].id = -1313669563;
					}
				}
			}
			Class438 class438_4_ = class365_sub1_sub1_sub2.aClass438_10078;
			do {
				if (class438_4_.method5819((byte) -111)) {
					Class391 class391 = class438_4_.method5820(-239895480);
					if (class391.anInt4182 * 62820525 == 3) {
						if (1888275831 * class365_sub1_sub1_sub2.anInt10125 > 0 && (class365_sub1_sub1_sub2.anInt10095 * -412225079 <= client.anInt8884 * 443738891) && (class365_sub1_sub1_sub2.anInt10103 * 1450943713 < 443738891 * client.anInt8884)) {
							class365_sub1_sub1_sub2.anIntArray10093 = null;
							class438_4_.method5821(-1, -1775890638);
							break;
						}
					} else if (class391.anInt4182 * 62820525 == 1) {
						if (1888275831 * class365_sub1_sub1_sub2.anInt10125 > 0 && (class365_sub1_sub1_sub2.anInt10095 * -412225079 <= 443738891 * client.anInt8884) && (class365_sub1_sub1_sub2.anInt10103 * 1450943713 < 443738891 * client.anInt8884)) {
							class438_4_.method5828(1, -1445580533);
							break;
						}
						class438_4_.method5828(0, -1445580533);
					}
					if (class438_4_.method5822(1, 1800694800) && class438_4_.method5832(2113161557)) {
						class365_sub1_sub1_sub2.anIntArray10093 = null;
						class438_4_.method5821(-1, -1505745932);
					}
				}
			} while (false);
			for (int i_5_ = 0; i_5_ < (class365_sub1_sub1_sub2.aClass438_Sub2_Sub1Array10112).length; i_5_++) {
				Class438_Sub2_Sub1 class438_sub2_sub1 = (class365_sub1_sub1_sub2.aClass438_Sub2_Sub1Array10112[i_5_]);
				if (null == class438_sub2_sub1) {
					if (i <= 0)
						break;
				} else if (class438_sub2_sub1.anInt9874 * -623360337 > 0)
					class438_sub2_sub1.anInt9874 -= -731066289;
				else if (class438_sub2_sub1.method5822(1, 1635339259) && class438_sub2_sub1.method5832(-1916061004))
					class365_sub1_sub1_sub2.aClass438_Sub2_Sub1Array10112[i_5_] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tm.if(").append(')').toString());
		}
	}

	static boolean method6069(int i, int i_6_, int i_7_) {
		try {
			if (i_6_ >= 1000 && i < 1000)
				return true;
			if (i_6_ < 1000 && i < 1000) {
				if (Class490.method6169(i, 1576950944))
					return true;
				if (Class490.method6169(i_6_, 1956430101))
					return false;
				return true;
			}
			if (i_6_ >= 1000 && i >= 1000)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tm.bv(").append(')').toString());
		}
	}

	static void method6070(int i) {
		try {
			if (client.aByteArray8843 != null)
				Class418.method5598((byte) -48);
			else if (2084404473 * Class360.anInt3873 != -1)
				Class282.method2625(1290556720);
			else
				Class86.method966(Class360.username, Class360.password, (short) 5737);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tm.a(").append(')').toString());
		}
	}
}
