/* Class96_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub22 extends Class96 {
	int anInt9439;
	static int anInt9440;
	int anInt9441;
	int anInt9442;

	Class96_Sub22(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub22) this).anInt9442 = class282_sub35.readUnsignedShort() * 1623391291;
		((Class96_Sub22) this).anInt9439 = class282_sub35.readUnsignedShort() * 1017986755;
		((Class96_Sub22) this).anInt9441 = class282_sub35.readUnsignedByte() * 579947685;
	}

	public void method1592(int i) {
		Class75 class75 = (Class82.aClass75Array804[-1738900237 * ((Class96_Sub22) this).anInt9442]);
		Class93 class93 = (Class86.aClass93Array821[588964331 * ((Class96_Sub22) this).anInt9439]);
		class93.method1566(class75, ((Class96_Sub22) this).anInt9441 * -851068115, 682382660);
	}

	public void method1601() {
		Class75 class75 = (Class82.aClass75Array804[-1738900237 * ((Class96_Sub22) this).anInt9442]);
		Class93 class93 = (Class86.aClass93Array821[588964331 * ((Class96_Sub22) this).anInt9439]);
		class93.method1566(class75, ((Class96_Sub22) this).anInt9441 * -851068115, -1235876637);
	}

	static void method14678(Player class521_sub1_sub1_sub2_sub1, boolean bool, int i) {
		if (Class20.anInt169 * 2144330291 < 412) {
			if (Class84.myPlayer == class521_sub1_sub1_sub2_sub1) {
				if (client.aBool7344 && (Class506.anInt5858 * 1310510077 & 0x10) != 0)
					Class238.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16777215, 619010179)).append(Class433.aClass433_5299.method7273(Class223.aClass495_2772, -1114882023)).toString(), Class519.anInt5932 * -239192305, 16, -1, 0L, 0, 0, true, false, (long) (class521_sub1_sub1_sub2_sub1.anInt10314 * -1691508299), false, -1931180359);
			} else {
				String string;
				if (0 == -1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556) {
					boolean bool_0_ = true;
					if (1519880441 * (Class84.myPlayer.anInt10555) != -1 && -1 != (1519880441 * class521_sub1_sub1_sub2_sub1.anInt10555)) {
						int i_1_ = (((Class84.myPlayer.anInt10555) * 1519880441 < (1519880441 * class521_sub1_sub1_sub2_sub1.anInt10555)) ? (1519880441 * (Class84.myPlayer.anInt10555)) : (class521_sub1_sub1_sub2_sub1.anInt10555 * 1519880441));
						int i_2_ = ((-1880473919 * (Class84.myPlayer.anInt10565)) - (-1880473919 * class521_sub1_sub1_sub2_sub1.anInt10565));
						if (i_2_ < 0)
							i_2_ = -i_2_;
						if (i_2_ > i_1_)
							bool_0_ = false;
					}
					String string_3_ = (client.aClass486_7450 == Class486.aClass486_5750 ? (Class433.aClass433_5290.method7273(Class223.aClass495_2772, -1209944287)) : (Class433.aClass433_5281.method7273(Class223.aClass495_2772, -1303103497)));
					if (class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919 >= class521_sub1_sub1_sub2_sub1.anInt10554 * 410641457)
						string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 2054627302)).append(bool_0_ ? (Class426.method7169((-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565)), (-1880473919 * (Class84.myPlayer.anInt10565)), -1737457030)) : Class59.method1163(16777215, 619010179)).append(Class2.aString15).append(string_3_).append(class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919).append(Class2.aString18).toString();
					else
						string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 2144417480)).append(bool_0_ ? (Class426.method7169((-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565)), (-1880473919 * (Class84.myPlayer.anInt10565)), -1524250646)) : Class59.method1163(16777215, 619010179)).append(Class2.aString15).append(string_3_).append(class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919).append("+")
								.append((410641457 * class521_sub1_sub1_sub2_sub1.anInt10554) - (-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565))).append(Class2.aString18).toString();
				} else if (-1 == (-1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556))
					string = class521_sub1_sub1_sub2_sub1.method16127(true, 2137901539);
				else
					string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 1967945336)).append(Class2.aString15).append(Class433.aClass433_5171.method7273(Class223.aClass495_2772, -871379797)).append(-1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556).append(Class2.aString18).toString();
				if (client.aBool7344 && !bool && 0 != (1310510077 * Class506.anInt5858 & 0x8))
					Class238.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16777215, 619010179)).append(string).toString(), Class519.anInt5932 * -239192305, 15, -1, (long) (class521_sub1_sub1_sub2_sub1.anInt10314 * -1691508299), 0, 0, true, false, (long) (-1691508299 * class521_sub1_sub1_sub2_sub1.anInt10314), false, -1521566355);
				if (!bool) {
					for (int i_4_ = 7; i_4_ >= 0; i_4_--) {
						if (client.aStringArray7329[i_4_] != null) {
							short i_5_ = 0;
							if ((Class486.aClass486_5744 == client.aClass486_7450) && (client.aStringArray7329[i_4_].equalsIgnoreCase(Class433.aClass433_5295.method7273(Class223.aClass495_2772, -440996695)))) {
								if (client.aBool7454 && ((class521_sub1_sub1_sub2_sub1.anInt10565) * -1880473919 > (-1880473919 * (Class84.myPlayer.anInt10565))))
									i_5_ = (short) 2000;
								if ((-1623446397 * (Class84.myPlayer.anInt10559)) != 0 && 0 != (class521_sub1_sub1_sub2_sub1.anInt10559) * -1623446397) {
									if ((class521_sub1_sub1_sub2_sub1.anInt10559) * -1623446397 == (-1623446397 * (Class84.myPlayer.anInt10559)))
										i_5_ = (short) 2000;
									else
										i_5_ = (short) 0;
								} else if (class521_sub1_sub1_sub2_sub1.aBool10550)
									i_5_ = (short) 2000;
							} else if (client.aBoolArray7330[i_4_])
								i_5_ = (short) 2000;
							short i_6_ = (short) (i_5_ + client.aShortArray7239[i_4_]);
							int i_7_ = (-1 != client.anIntArray7328[i_4_] ? client.anIntArray7328[i_4_] : 452205213 * client.anInt7342);
							Class238.method4032(client.aStringArray7329[i_4_], new StringBuilder().append(Class59.method1163(16777215, 619010179)).append(string).toString(), i_7_, i_6_, -1, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), 0, 0, true, false, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), false, -1621747030);
						}
					}
				} else
					Class238.method4032(new StringBuilder().append(Class59.method1163(13421772, 619010179)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), false, -1005059728);
				if (!bool) {
					for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.method8097((byte) 114)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.method8067(1246744595))) {
						if (23 == -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) {
							((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585 = new StringBuilder().append(Class59.method1163(16777215, 619010179)).append(string).toString();
							break;
						}
					}
				}
			}
		}
	}

	static final void method14679(Class527 class527, int i) {
		Class93.method1573(class527, (byte) 93);
	}

	static final void method14680(Class118 class118, Class527 class527, int i) {
		int i_8_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		int i_9_ = ((((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]) - 1);
		if (6 != 2131324949 * class118.anInt1329)
			throw new RuntimeException("");
		Class409 class409 = Class350_Sub1.aClass406_7757.method6828(class118.anInt1330 * -402732635, (byte) 52);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, true);
		class118.aClass417_1308.aLong4993 = Class86.method1480(-610795534) * 7197667099348947907L;
		if (i_9_ < 0 || i_9_ >= class409.anIntArray4859.length)
			throw new RuntimeException(new StringBuilder().append("").append(i_9_).toString());
		class118.aClass417_1308.anIntArray4992[i_9_] = i_8_;
		Class109.method1858(class118, (byte) -65);
	}
}
