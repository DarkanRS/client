/* Class298_Sub17_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub17_Sub4 extends Class298_Sub17 {
	byte aByte9202;
	String aString9203;
	byte aByte9204;
	Class152 aClass152_9205;

	void method2916(RsByteBuffer class298_sub53) {
		((Class298_Sub17_Sub4) this).aString9203 = class298_sub53.method3652(-517364695);
		if (((Class298_Sub17_Sub4) this).aString9203 != null) {
			class298_sub53.readUnsignedByte();
			((Class298_Sub17_Sub4) this).aByte9204 = class298_sub53.readByte(-12558881);
			((Class298_Sub17_Sub4) this).aByte9202 = class298_sub53.readByte(-12558881);
		}
	}

	void method2922(RsByteBuffer class298_sub53) {
		((Class298_Sub17_Sub4) this).aString9203 = class298_sub53.method3652(-517364695);
		if (((Class298_Sub17_Sub4) this).aString9203 != null) {
			class298_sub53.readUnsignedByte();
			((Class298_Sub17_Sub4) this).aByte9204 = class298_sub53.readByte(-12558881);
			((Class298_Sub17_Sub4) this).aByte9202 = class298_sub53.readByte(-12558881);
		}
	}

	void method2918(ClanChannel class298_sub25, int i) {
		try {
			class298_sub25.clanName = ((Class298_Sub17_Sub4) this).aString9203;
			if (null != ((Class298_Sub17_Sub4) this).aString9203) {
				class298_sub25.aByte7360 = ((Class298_Sub17_Sub4) this).aByte9204;
				class298_sub25.aByte7355 = ((Class298_Sub17_Sub4) this).aByte9202;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ags.f(").append(')').toString());
		}
	}

	void method2920(RsByteBuffer class298_sub53) {
		((Class298_Sub17_Sub4) this).aString9203 = class298_sub53.method3652(-517364695);
		if (((Class298_Sub17_Sub4) this).aString9203 != null) {
			class298_sub53.readUnsignedByte();
			((Class298_Sub17_Sub4) this).aByte9204 = class298_sub53.readByte(-12558881);
			((Class298_Sub17_Sub4) this).aByte9202 = class298_sub53.readByte(-12558881);
		}
	}

	void method2921(ClanChannel class298_sub25) {
		class298_sub25.clanName = ((Class298_Sub17_Sub4) this).aString9203;
		if (null != ((Class298_Sub17_Sub4) this).aString9203) {
			class298_sub25.aByte7360 = ((Class298_Sub17_Sub4) this).aByte9204;
			class298_sub25.aByte7355 = ((Class298_Sub17_Sub4) this).aByte9202;
		}
	}

	Class298_Sub17_Sub4(Class152 class152) {
		super();
	}

	void method2917(RsByteBuffer class298_sub53, int i) {
		try {
			((Class298_Sub17_Sub4) this).aString9203 = class298_sub53.method3652(-517364695);
			if (((Class298_Sub17_Sub4) this).aString9203 != null) {
				class298_sub53.readUnsignedByte();
				((Class298_Sub17_Sub4) this).aByte9204 = class298_sub53.readByte(-12558881);
				((Class298_Sub17_Sub4) this).aByte9202 = class298_sub53.readByte(-12558881);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ags.a(").append(')').toString());
		}
	}

	void method2919(ClanChannel class298_sub25) {
		class298_sub25.clanName = ((Class298_Sub17_Sub4) this).aString9203;
		if (null != ((Class298_Sub17_Sub4) this).aString9203) {
			class298_sub25.aByte7360 = ((Class298_Sub17_Sub4) this).aByte9204;
			class298_sub25.aByte7355 = ((Class298_Sub17_Sub4) this).aByte9202;
		}
	}

	static final void method2925(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class298_Sub37_Sub13 class298_sub37_sub13 = Class301.method3705(i_0_);
			if (class298_sub37_sub13 == null)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1110271707 * class298_sub37_sub13.anInt9645;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ags.aeq(").append(')').toString());
		}
	}

	static int method2926(int i) {
		try {
			if (client.aClass105_8850 == null) {
				if (!Class436.aBoolean5478) {
					if (Class144.aClass381_1563.aBoolean4118) {
						if (Class318.aClass298_Sub37_Sub15_3322 != null)
							return ((((Class298_Sub37_Sub15) Class318.aClass298_Sub37_Sub15_3322).anInt9659) * -1988795597);
					} else if (Class298_Sub45.aClass298_Sub37_Sub15_7522 != null)
						return ((((Class298_Sub37_Sub15) Class298_Sub45.aClass298_Sub37_Sub15_7522).anInt9659) * -1988795597);
				} else {
					Class505 class505 = Class142.method1571(-2091565600);
					int i_1_ = Class165.recorder.getMouseX((byte) -81);
					int i_2_ = Class165.recorder.getMouseY((byte) -7);
					if (!Class436.aBoolean5471) {
						if (i_1_ > Class88.anInt806 * -1347746885 && i_1_ < (608683427 * Class134.anInt6343 + Class88.anInt806 * -1347746885)) {
							int i_3_ = -1;
							for (int i_4_ = 0; i_4_ < Class436.anInt5506 * -278777595; i_4_++) {
								if (Class436.aBoolean5496) {
									int i_5_ = ((-411680299 * Class436.anInt5467 * (-278777595 * Class436.anInt5506 - 1 - i_4_)) + (1 + ((class505.anInt6202 * 1110385787) + (20 + (Class302_Sub4.anInt7658 * 1089948687)))));
									if (i_2_ > i_5_ - (class505.anInt6202 * 1110385787) - 1 && i_2_ < (class505.anInt6197 * -1883958527) + i_5_)
										i_3_ = i_4_;
								} else {
									int i_6_ = (((Class436.anInt5506 * -278777595 - 1 - i_4_) * (Class436.anInt5467 * -411680299)) + ((1089948687 * Class302_Sub4.anInt7658) + 31));
									if (i_2_ > i_6_ - (class505.anInt6202 * 1110385787) - 1 && i_2_ < (class505.anInt6197 * -1883958527) + i_6_)
										i_3_ = i_4_;
								}
							}
							if (-1 != i_3_) {
								int i_7_ = 0;
								Class446 class446 = new Class446(Class436.aClass453_5480);
								for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) class446.method5900(446818813)); null != class298_sub37_sub15; class298_sub37_sub15 = ((Class298_Sub37_Sub15) class446.next())) {
									if (i_7_++ == i_3_)
										return (-1988795597 * (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9659));
								}
							}
						}
					} else if (i_1_ > -1347746885 * Class88.anInt806 && i_1_ < (-1347746885 * Class88.anInt806 + Class134.anInt6343 * 608683427)) {
						int i_8_ = -1;
						for (int i_9_ = 0; i_9_ < 1592446965 * Class436.anInt5479; i_9_++) {
							if (Class436.aBoolean5496) {
								int i_10_ = (i_9_ * (Class436.anInt5467 * -411680299) + (1 + ((Class302_Sub4.anInt7658 * 1089948687) + 20 + (class505.anInt6202 * 1110385787))));
								if (i_2_ > (i_10_ - class505.anInt6202 * 1110385787 - 1) && i_2_ < (class505.anInt6197 * -1883958527 + i_10_))
									i_8_ = i_9_;
							} else {
								int i_11_ = (Class302_Sub4.anInt7658 * 1089948687 + 31 + i_9_ * (-411680299 * Class436.anInt5467));
								if (i_2_ > (i_11_ - class505.anInt6202 * 1110385787 - 1) && i_2_ < (-1883958527 * class505.anInt6197 + i_11_))
									i_8_ = i_9_;
							}
						}
						if (-1 != i_8_) {
							int i_12_ = 0;
							Class447 class447 = new Class447(Class436.aClass461_5482);
							for (Class298_Sub37_Sub5 class298_sub37_sub5 = ((Class298_Sub37_Sub5) class447.method5904((short) 21512)); null != class298_sub37_sub5; class298_sub37_sub5 = (Class298_Sub37_Sub5) class447.next()) {
								if (i_12_++ == i_8_)
									return (-1988795597 * (((Class298_Sub37_Sub15) (Class298_Sub37_Sub15) (((Class298_Sub37_Sub5) class298_sub37_sub5).aClass461_9584.aClass298_Sub37_5679.aClass298_Sub37_7405)).anInt9659));
							}
						}
					} else if (null != Class436.aClass298_Sub37_Sub5_5472 && i_1_ > 805710735 * Class461.anInt5681 && i_1_ < (Class461.anInt5681 * 805710735 + 2054409059 * Class420.anInt5345)) {
						int i_13_ = -1;
						for (int i_14_ = 0; i_14_ < (((Class298_Sub37_Sub5) Class436.aClass298_Sub37_Sub5_5472).anInt9583) * -628325139; i_14_++) {
							if (Class436.aBoolean5496) {
								int i_15_ = (1 + (1110385787 * class505.anInt6202 + (-1370784315 * Class501.anInt6119 + 20)) + i_14_ * (Class436.anInt5467 * -411680299));
								if (i_2_ > (i_15_ - 1110385787 * class505.anInt6202 - 1) && i_2_ < (-1883958527 * class505.anInt6197 + i_15_))
									i_13_ = i_14_;
							} else {
								int i_16_ = (-411680299 * Class436.anInt5467 * i_14_ + (31 + -1370784315 * Class501.anInt6119));
								if (i_2_ > (i_16_ - class505.anInt6202 * 1110385787 - 1) && i_2_ < (-1883958527 * class505.anInt6197 + i_16_))
									i_13_ = i_14_;
							}
						}
						if (i_13_ != -1) {
							int i_17_ = 0;
							Class447 class447 = new Class447(((Class298_Sub37_Sub5) (Class436.aClass298_Sub37_Sub5_5472)).aClass461_9584);
							for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) class447.method5904((short) 3172)); null != class298_sub37_sub15; class298_sub37_sub15 = ((Class298_Sub37_Sub15) class447.next())) {
								if (i_17_++ == i_13_)
									return (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9659 * -1988795597);
							}
						}
					}
				}
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ags.at(").append(')').toString());
		}
	}
}
