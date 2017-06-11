/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class125 {
	public int anInt1481;
	public int anInt1482;
	public int anInt1483;
	public int anInt1484;
	public int anInt1485;
	public boolean aBoolean1486;
	public int anInt1487;
	public int anInt1488;
	public int anInt1489;
	public int anInt1490 = -233713448;
	public int anInt1491;

	void method1390(RsByteBuffer class298_sub53, byte i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i < 1)
						break;
					break;
				}
				method1391(class298_sub53, i_0_, (short) 6892);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.a(").append(')').toString());
		}
	}

	void method1391(RsByteBuffer class298_sub53, int i, short i_1_) {
		try {
			if (1 == i)
				anInt1490 = class298_sub53.readUnsignedShort() * -1639826917;
			else if (2 == i)
				aBoolean1486 = true;
			else if (3 == i) {
				anInt1483 = class298_sub53.readShort(1536042537) * -652822843;
				anInt1489 = class298_sub53.readShort(1731816677) * -369949453;
				anInt1481 = class298_sub53.readShort(2113073635) * 586212811;
			} else if (4 == i)
				anInt1491 = class298_sub53.readUnsignedByte() * 1941395261;
			else if (5 == i)
				anInt1488 = class298_sub53.readBigSmart(1235052657) * 372664533;
			else if (i == 6)
				anInt1487 = class298_sub53.read24BitUnsignedInteger((byte) -37) * -1508681825;
			else if (i == 7) {
				anInt1485 = class298_sub53.readShort(2027099715) * -1789510425;
				anInt1484 = class298_sub53.readShort(1934566489) * 695060321;
				anInt1482 = class298_sub53.readShort(2047169490) * -1953778617;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.f(").append(')').toString());
		}
	}

	Class125() {
		anInt1487 = -118708127;
	}

	static final void method1392(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_2_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class82_Sub2.method878(i_2_, i_3_, true, -880312954);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.tq(").append(')').toString());
		}
	}

	static final void method1393(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_5_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			Class74.method830(i_4_, i_5_ >> 14 & 0x3fff, i_5_ & 0x3fff, false, 1608871018);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.aen(").append(')').toString());
		}
	}

	static final void method1394(ClientScript2 class403, int i) {
		try {
			NPC class365_sub1_sub1_sub2_sub1 = ((NPC) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242);
			String string = class365_sub1_sub1_sub2_sub1.aString10186;
			SomethingDefinitions class503 = class365_sub1_sub1_sub2_sub1.aClass503_10190;
			if (null != class503.anIntArray6188) {
				class503 = class503.method6240(Class128.aClass148_6331, 1606413785);
				if (class503 == null)
					string = "";
				else
					string = class503.aString6127;
			}
			if (string == null)
				string = "";
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.aoq(").append(')').toString());
		}
	}

	static void method1395(int i, boolean bool, int i_6_) {
		try {
			if (bool) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2036, client.gameConnection.aClass449_330, (byte) 105);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(i, 16711935);
				client.gameConnection.method390(class298_sub36, (byte) -34);
			} else
				Class126.method1405(Class502.aClass502_6722, i, -1, -1830852893);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.p(").append(')').toString());
		}
	}

	static void method1396(Class298_Sub36 class298_sub36, int interfaceHash, int slotId1, int slotId2, int i_9_) {
		try {
			class298_sub36.aClass298_Sub53_Sub2_7396.writeIntV2(interfaceHash);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128(slotId2);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(slotId1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.ka(").append(')').toString());
		}
	}

	static final void method1397(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -255285486) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1275 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.nv(").append(')').toString());
		}
	}

	static int method1398(NPC class365_sub1_sub1_sub2_sub1, int i) {
		try {
			SomethingDefinitions class503 = class365_sub1_sub1_sub2_sub1.aClass503_10190;
			if (class503.anIntArray6188 != null) {
				class503 = class503.method6240(Class128.aClass148_6331, 1880791850);
				if (class503 == null)
					return -1;
			}
			int i_10_ = 1105496999 * class503.anInt6169;
			Class350 class350 = class365_sub1_sub1_sub2_sub1.method4426(1451181541);
			int i_11_ = class365_sub1_sub1_sub2_sub1.aClass438_10077.method5823(1966806311);
			if (i_11_ == -1 || class365_sub1_sub1_sub2_sub1.aBoolean10094)
				i_10_ = class503.anInt6151 * 1945943361;
			else if (class350.anInt3721 * 230243963 == i_11_ || i_11_ == class350.anInt3749 * 491753731 || class350.anInt3724 * -783166629 == i_11_ || i_11_ == class350.anInt3746 * -2054940183)
				i_10_ = class503.anInt6176 * -1390399277;
			else if (class350.anInt3755 * 328817727 == i_11_ || i_11_ == class350.anInt3722 * -1238642279 || i_11_ == 124010991 * class350.anInt3728 || -907666203 * class350.anInt3727 == i_11_)
				i_10_ = -904091095 * class503.anInt6174;
			return i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.x(").append(')').toString());
		}
	}

	static Class111[] method1399(byte i) {
		try {
			return (new Class111[] { Class111.aClass111_1346, Class111.aClass111_1363, Class111.aClass111_1329, Class111.aClass111_1364, Class111.aClass111_1360, Class111.aClass111_1335, Class111.aClass111_1357, Class111.aClass111_1347, Class111.aClass111_1356, Class111.aClass111_1343, Class111.aClass111_1344, Class111.aClass111_1351, Class111.aClass111_1348, Class111.aClass111_1333, Class111.aClass111_1362, Class111.aClass111_1358, Class111.aClass111_1336, Class111.aClass111_1352,
					Class111.aClass111_1355, Class111.aClass111_1365, Class111.aClass111_1332, Class111.aClass111_1334, Class111.aClass111_1359, Class111.aClass111_1349, Class111.aClass111_1361, Class111.aClass111_1350, Class111.aClass111_1337, Class111.aClass111_1339, Class111.aClass111_1330, Class111.aClass111_1345, Class111.aClass111_1341, Class111.aClass111_1354, Class111.aClass111_1342, Class111.aClass111_1331, Class111.aClass111_1353, Class111.aClass111_1338, Class111.aClass111_1340 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.a(").append(')').toString());
		}
	}

	static final void method1400(int i, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, int i_16_) {
		try {
			if (!bool && (i_12_ < 512 || i_13_ < 512 || i_12_ > (client.aClass283_8716.method2629(-2030738775) - 2) * 512 || i_13_ > (client.aClass283_8716.method2630(346597058) - 2) * 512)) {
				float[] fs = client.aFloatArray8891;
				client.aFloatArray8891[1] = -1.0F;
				fs[0] = -1.0F;
			} else {
				int i_17_ = (Class356.method4271(i_12_, i_13_, i, -1332954611) - i_15_);
				client.aClass222_8871.method2070(Class373.aClass_ra4071.method5044());
				client.aClass222_8871.method2064((float) i_14_, 0.0F, 0.0F);
				Class373.aClass_ra4071.method5043(client.aClass222_8871);
				if (bool)
					Class373.aClass_ra4071.method5060((float) i_12_, (float) i_17_, (float) i_13_, client.aFloatArray8891);
				else
					Class373.aClass_ra4071.method5059((float) i_12_, (float) i_17_, (float) i_13_, client.aFloatArray8891);
				client.aClass222_8871.method2064((float) -i_14_, 0.0F, 0.0F);
				Class373.aClass_ra4071.method5043(client.aClass222_8871);
				client.aFloatArray8891[0] -= (float) (client.anInt8936 * -1868355265);
				client.aFloatArray8891[1] -= (float) (-689948187 * client.anInt8747);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.jk(").append(')').toString());
		}
	}

	static int method1401(byte i) {
		try {
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub27_7579.method5720((byte) -102) == 0) {
				for (int i_18_ = 0; i_18_ < client.anInt8894 * 1351936279; i_18_++) {
					if (client.anInterface16Array8710[i_18_].method217((byte) -58) == 's' || client.anInterface16Array8710[i_18_].method217((byte) -73) == 'S') {
						Class422_Sub25.aClass298_Sub48_8425.method3540((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub27_7579), 1, -669556569);
						client.aBoolean8647 = true;
						break;
					}
				}
			}
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2538) {
				if (Class203.aClass225_2337 == null)
					Class203.aClass225_2337 = new Class225(Class248.aClass247_2752, Class365_Sub1_Sub3.aClass255_9804, Class50.aBigInteger502, Class50.aBigInteger501);
				if (!Class203.aClass225_2337.method2094(2031500180))
					return 0;
				Class365_Sub1_Sub5_Sub2.method4533(0, null, true, (short) 256);
				Class230.aBoolean2567 = !Class78.method844((byte) 3);
				Class122.aClass243_1466 = Class372.method4590((Class230.aBoolean2567 ? Class111.aClass111_1363 : Class111.aClass111_1361), false, 1, true, 1414942231);
				Class230.aClass243_2564 = Class372.method4590(Class111.aClass111_1362, false, 1, true, 1414942231);
				Class173.aClass243_1758 = Class372.method4590(Class111.aClass111_1342, false, 1, true, 1414942231);
			}
			if (Class227.aClass227_2531 == Class82_Sub6.aClass227_6843) {
				boolean bool = Class230.aClass243_2564.method2292(380717281);
				int i_19_ = Class373.aClass242_Sub1Array4072[Class111.aClass111_1362.method1233(1981547205)].method2270(1121322968);
				i_19_ = i_19_ + Class373.aClass242_Sub1Array4072[(Class230.aBoolean2567 ? Class111.aClass111_1363.method1233(-1014323373) : Class111.aClass111_1361.method1233(-1736042893))].method2270(1121322968);
				i_19_ += Class373.aClass242_Sub1Array4072[Class111.aClass111_1342.method1233(-202973063)].method2270(1121322968);
				i_19_ = i_19_ + (bool ? 100 : Class230.aClass243_2564.method2293((byte) 4));
				if (i_19_ != 400)
					return i_19_ / 4;
				Class386.anInt4145 = (Class122.aClass243_1466.method2285((byte) -31) * -1650604707);
				Class118.anInt1401 = (Class230.aClass243_2564.method2285((byte) -108) * 1003249155);
				Class70.method806(Class122.aClass243_1466, (byte) 13);
				int i_20_ = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub20_7578.method5700(-463949651);
				Class420.aClass515_5344 = new Class515(client.aClass411_8944, Class321.aClass429_3357, Class230.aClass243_2564);
				Class510[] class510s = Class420.aClass515_5344.method6294(i_20_, -957350299);
				if (class510s.length == 0)
					class510s = Class420.aClass515_5344.method6294(0, -2070003816);
				Class143 class143 = new Class143(Class122.aClass243_1466, Class173.aClass243_1758);
				if (class510s.length > 0) {
					Class230.anInterface12Array2562 = new Interface12[class510s.length];
					for (int i_21_ = 0; i_21_ < Class230.anInterface12Array2562.length; i_21_++)
						Class230.anInterface12Array2562[i_21_] = new Class229((Class420.aClass515_5344.method6295((-872036857 * class510s[i_21_].anInt6220), (byte) 89)), (722190409 * class510s[i_21_].anInt6218), (class510s[i_21_].anInt6219 * -1852131045), class143);
				}
			}
			if (Class227.aClass227_2532 == Class82_Sub6.aClass227_6843)
				Class497.aClass197_6105 = new Class197(Class122.aClass243_1466, Class173.aClass243_1758, Class510.method6287(-1719059338));
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2533) {
				int i_22_ = Class497.aClass197_6105.method1877(2082019062);
				int i_23_ = Class497.aClass197_6105.method1878(1886749638);
				if (i_22_ < i_23_)
					return 100 * i_22_ / i_23_;
			}
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2534) {
				if (Class230.anInterface12Array2562 != null && Class230.anInterface12Array2562.length > 0) {
					if (Class230.anInterface12Array2562[0].method159((byte) 54) < 100)
						return 0;
					if (Class230.anInterface12Array2562.length > 1 && Class420.aClass515_5344.method6296((byte) -52) && Class230.anInterface12Array2562[1].method159((byte) 126) < 100)
						return 0;
				}
				Class497.aClass197_6105.method1882(client.anInterface10_8700, (byte) 3);
				Class426.method5744(Class373.aClass_ra4071, -1001154805);
				Class439.method5851(11, -22830656);
			}
			if (Class227.aClass227_2535 == Class82_Sub6.aClass227_6843) {
				Class158.aClass243_6364 = Class372.method4590(Class111.aClass111_1330, false, 1, false, 1414942231);
				Class491.aClass243_6080 = Class372.method4590(Class111.aClass111_1339, false, 1, false, 1414942231);
				Class497.aClass243_6103 = Class372.method4590(Class111.aClass111_1341, false, 1, false, 1414942231);
				Class284_Sub1.aClass243_7146 = Class372.method4590(Class111.aClass111_1331, false, 1, true, 1414942231);
				Class160.aClass243_1647 = Class372.method4590(Class111.aClass111_1332, false, 1, true, 1414942231);
				Class52.aClass243_507 = Class372.method4590(Class111.aClass111_1359, false, 1, false, 1414942231);
				Class65.aClass243_665 = Class372.method4590(Class111.aClass111_1334, true, 1, false, 1414942231);
				Class374_Sub1.aClass243_7731 = Class372.method4590(Class111.aClass111_1335, true, 1, false, 1414942231);
				Class341.aClass243_3646 = Class372.method4590(Class111.aClass111_1353, false, 1, false, 1414942231);
				Class127.aClass243_6377 = Class372.method4590(Class111.aClass111_1338, false, 1, true, 1414942231);
				Class122.aClass243_1467 = Class372.method4590(Class111.aClass111_1336, false, 1, false, 1414942231);
				Class463.aClass243_5688 = Class372.method4590(Class111.aClass111_1340, false, 1, false, 1414942231);
				Class377.aClass243_4092 = Class372.method4590(Class111.aClass111_1351, false, 1, true, 1414942231);
				Class439.aClass243_5575 = Class372.method4590(Class111.aClass111_1343, false, 1, false, 1414942231);
				Class114.aClass243_1381 = Class372.method4590(Class111.aClass111_1344, false, 1, false, 1414942231);
				Class354.aClass243_3826 = Class372.method4590(Class111.aClass111_1333, false, 1, true, 1414942231);
				Class521.aClass243_6281 = Class372.method4590(Class111.aClass111_1346, false, 1, true, 1414942231);
				Class133.aClass243_1512 = Class372.method4590(Class111.aClass111_1347, false, 1, true, 1414942231);
				Class92.aClass243_904 = Class372.method4590(Class111.aClass111_1360, false, 1, true, 1414942231);
				Class260.aClass243_2819 = Class372.method4590(Class111.aClass111_1348, false, 1, true, 1414942231);
				Class23.aClass243_326 = Class372.method4590(Class111.aClass111_1350, false, 1, true, 1414942231);
				Class499.aClass243_6113 = Class372.method4590(Class111.aClass111_1349, false, 1, true, 1414942231);
				Class_v.aClass243_7622 = Class372.method4590(Class111.aClass111_1364, true, 1, false, 1414942231);
				Class497.aClass243_6104 = Class372.method4590(Class111.aClass111_1329, false, 1, true, 1414942231);
				Class266.aClass243_2855 = Class372.method4590(Class111.aClass111_1354, false, 1, true, 1414942231);
				Class451.aClass243_5641 = Class372.method4590(Class111.aClass111_1355, true, 1, true, 1414942231);
				Class51.aClass243_505 = Class372.method4590(Class111.aClass111_1356, false, 1, true, 1414942231);
				Class399.aClass243_5219 = Class372.method4590(Class111.aClass111_1357, true, 1, true, 1414942231);
				Class277.aClass243_2965 = Class372.method4590(Class111.aClass111_1345, false, 1, true, 1414942231);
				Class399.aClass243_5220 = Class372.method4590(Class111.aClass111_1337, true, 1, false, 1414942231);
				Class97.aClass243_945 = Class372.method4590(Class111.aClass111_1358, true, 1, false, 1414942231);
				Class82_Sub6.aClass243_6844 = Class372.method4590(Class111.aClass111_1352, true, 1, true, 1414942231);
				Class517.aClass243_6270 = Class372.method4590(Class111.aClass111_1365, true, 2, false, 1414942231);
			}
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2536) {
				int i_24_ = 0;
				for (int i_25_ = 0; i_25_ < Class373.aClass242_Sub1Array4072.length; i_25_++) {
					if (null != Class373.aClass242_Sub1Array4072[i_25_])
						i_24_ += (Class373.aClass242_Sub1Array4072[i_25_].method2270(1121322968) * Class230.anIntArray2568[i_25_] / 100);
				}
				if (i_24_ != 100) {
					if (Class230.anInt2565 * -1347166103 < 0)
						Class230.anInt2565 = 1430761433 * i_24_;
					return (100 * (i_24_ - Class230.anInt2565 * -1347166103) / (100 - Class230.anInt2565 * -1347166103));
				}
				Class379.method4673(Class158.aClass243_6364, 819988020);
				Class497.aClass197_6105 = new Class197(Class158.aClass243_6364, Class173.aClass243_1758, Class510.method6287(-1719059338));
			}
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2539) {
				byte[] is = Class399.aClass243_5219.method2294((-363169051 * (Class380.aClass380_4102.anInt4108)), (byte) 101);
				if (is == null)
					return 0;
				Class244.method2327(is, -1441857995);
				Class110.method1223(-1016382228);
				Class439.method5851(7, 907142690);
			}
			if (Class227.aClass227_2541 == Class82_Sub6.aClass227_6843) {
				Class84.aClass305_770 = new Class305(Class97.aClass243_945);
				Class362.method4310(Class84.aClass305_770, (byte) 8);
			}
			if (Class227.aClass227_2530 == Class82_Sub6.aClass227_6843) {
				int i_26_ = Class354.method4259(-1857525316);
				if (i_26_ < 100)
					return i_26_;
				Class74.method824((Class399.aClass243_5219.method2294((Class380.aClass380_4103.anInt4108 * -363169051), (byte) 90)), 745625463);
				HashTable.aClass371_5520 = new Class371(Class399.aClass243_5219);
				Class366.aShortArrayArray3970 = HashTable.aClass371_5520.aShortArrayArray4039;
				Class22.aShortArrayArrayArray278 = HashTable.aClass371_5520.aShortArrayArrayArray4044;
				if (-1 != 1352949337 * HashTable.aClass371_5520.anInt4045 && -1 != 133542095 * HashTable.aClass371_5520.anInt4046) {
					client.anInt8794 = -2081728285 * HashTable.aClass371_5520.anInt4045;
					client.anInt8803 = HashTable.aClass371_5520.anInt4046 * 437692501;
				}
				Class82_Sub18.aClass405_6892 = new Class405(Class399.aClass243_5219);
				Class144.aClass381_1563 = new Class381(Class399.aClass243_5219);
				HashTable.aClass377_5519 = new Class377(Class399.aClass243_5219);
			}
			if (Class227.aClass227_2537 == Class82_Sub6.aClass227_6843) {
				if (-1919698893 * HashTable.aClass371_5520.anInt4035 != -1 && !Class341.aClass243_3646.method2290((-1919698893 * (HashTable.aClass371_5520.anInt4035)), 0, -1803759646))
					return 99;
				Class253.anInterface_ma2785 = new Class249(Class451.aClass243_5641, Class127.aClass243_6377, Class158.aClass243_6364);
				Class92.aClass504_905 = new Class504(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class94.aClass349_913 = new Class349(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146, Class82_Sub18.aClass405_6892);
				Class_na.aClass491_9686 = new Class491(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146, Class158.aClass243_6364);
				Class51.aClass475_506 = new Class475(client.aClass411_8944, Class321.aClass429_3357, Class521.aClass243_6281);
				Class504.aClass375_6196 = new Class375(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class151.aClass451_6358 = new Class451(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class500.aClass347_6117 = new Class347(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146, Class158.aClass243_6364);
				Class212.aClass144_2433 = new Class144(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146, Class341.aClass243_3646);
				Class300.aClass518_3217 = new Class518(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class237.aClass499_6668 = new Class499(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class463.aClass433_5689 = new Class433(client.aClass411_8944, Class321.aClass429_3357, true, Class354.aClass243_3826, Class341.aClass243_3646);
				client.aClass283_8716.method2645(Class463.aClass433_5689, -18361497);
				Class62.aClass248_612.method2379(new Class433(client.aClass411_8944, Class321.aClass429_3357, true, Class354.aClass243_3826, Class341.aClass243_3646), 681479919);
				Class363.aClass339_3931 = new Class339(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146, Class158.aClass243_6364);
				Class120.aClass487_1463 = new Class487(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146, Class158.aClass243_6364);
				Class15.aClass507_224 = new Class507(client.aClass411_8944, Class321.aClass429_3357, true, Class133.aClass243_1512, Class341.aClass243_3646);
				Class298_Sub32_Sub14.aClass477_9400 = new Class477(client.aClass411_8944, Class321.aClass429_3357, true, Class92.aClass504_905, Class92.aClass243_904, Class341.aClass243_3646);
				Class316.aClass362_3318 = new Class362(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146, true);
				Class501.aClass395_6122 = new Class395(client.aClass411_8944, Class321.aClass429_3357, Class260.aClass243_2819, Class491.aClass243_6080, Class497.aClass243_6103);
				ConfigDefinitions.aClass317_3472 = new Class317(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class138_Sub1.aClass131_7010 = new Class131(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class158_Sub1.aClass389_8568 = new Class389(client.aClass411_8944, Class321.aClass429_3357, Class23.aClass243_326, Class341.aClass243_3646);
				Class477.aClass500_6001 = new Class500(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146, true);
				Class412.aClass508_6574 = new Class508(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class320.aClass494_6550 = new Class494(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class472.aClass314_5965 = new Class314(client.aClass411_8944, Class321.aClass429_3357, Class499.aClass243_6113);
				Class440.aClass205_5582 = new Class205(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class422_Sub7.aClass445_8384 = new Class445(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class82_Sub16.aClass427_6886 = new Class427(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class99.aClass517_951 = new Class517(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class299.aClass370_3199 = new Class370(client.aClass411_8944, Class321.aClass429_3357, Class284_Sub1.aClass243_7146);
				Class298_Sub24.method3080(Class160.aClass243_1647, Class341.aClass243_3646, Class158.aClass243_6364, Class173.aClass243_1758, 995134055);
				Class_ta.method5997(Class277.aClass243_2965, (byte) 9);
				GraphicsToolkit.aClass256_5315 = new Class256(Class321.aClass429_3357, Class497.aClass243_6104, Class266.aClass243_2855);
				Class447.aClass469_5618 = new Class469(Class321.aClass429_3357, Class497.aClass243_6104, Class266.aClass243_2855, new Class180());
				Class165.method1783(-980237906);
				Class128.aClass148_6331 = new Class148();
				Class359.method4294(1884668010);
				Class240.method2231(Class501.aClass395_6122, 638864948);
				Class493.method6188(Class51.aClass243_505, -1530430191);
				Class62.method727(Class341.aClass243_3646, Class253.anInterface_ma2785, 2043056803);
				Class113 class113 = new Class113(Class122.aClass243_1467.method2301("huffman", "", 1988047685));
				Class336_Sub6.method4107(class113, -1778895275);
				Class291.aClass309_6492 = Class360.method4302(-1239681225);
				Class12.aClass298_Sub44_9946 = new Class298_Sub44(true);
			}
			if (Class227.aClass227_2540 == Class82_Sub6.aClass227_6843) {
				int i_27_ = (Class298_Sub32_Sub30.method3334(Class158.aClass243_6364, (byte) 34) + Class497.aClass197_6105.method1875(true, -249350940));
				int i_28_ = (Class273.method2565((short) 7611) + Class497.aClass197_6105.method1878(2124717791));
				if (i_27_ < i_28_)
					return i_27_ * 100 / i_28_;
			}
			if (Class227.aClass227_2542 == Class82_Sub6.aClass227_6843)
				Class301.method3690(Class_v.aClass243_7622, Class504.aClass375_6196, Class151.aClass451_6358, client.aClass283_8716.method2641(-1404290651), Class363.aClass339_3931, Class120.aClass487_1463, Class128.aClass148_6331);
			if (Class82_Sub6.aClass227_6843 == Class227.aClass227_2554) {
				Class374.anIntArray4078 = new int[-2088092255 * Class320.aClass494_6550.anInt6090];
				Class254.aBooleanArray2790 = (new boolean[Class320.aClass494_6550.anInt6090 * -2088092255]);
				ClientScriptsExecutor.aStringArray4126 = (new String[1127111807 * Class412.aClass508_6574.anInt6214]);
				for (int i_29_ = 0; i_29_ < Class320.aClass494_6550.anInt6090 * -2088092255; i_29_++) {
					if ((Class320.aClass494_6550.method6191(i_29_, (byte) -12).anInt5969) * 1043657149 == 0) {
						Class254.aBooleanArray2790[i_29_] = true;
						client.anInt8890 += 1273319593;
					}
					Class374.anIntArray4078[i_29_] = -1;
				}
				SubIncommingPacket.method1919(915865311);
				Class65.aClass243_665.method2298(false, true, -176172929);
				Class374_Sub1.aClass243_7731.method2298(true, true, -158717020);
				Class158.aClass243_6364.method2298(true, true, -1968339968);
				Class173.aClass243_1758.method2298(true, true, -1788343139);
				Class122.aClass243_1467.method2298(true, true, -629544722);
				client.aBoolean8672 = true;
			}
			if (Class227.aClass227_2544 == Class82_Sub6.aClass227_6843) {
				if (!Class378.method4671((HashTable.aClass371_5520.anInt4042 * 747461259), null, -2054647884))
					return 0;
				boolean bool = true;
				for (int i_30_ = 0; i_30_ < (Class389.aClass119Array4165[747461259 * HashTable.aClass371_5520.anInt4042].aClass105Array1405).length; i_30_++) {
					IComponentDefinition class105 = (Class389.aClass119Array4165[HashTable.aClass371_5520.anInt4042 * 747461259].aClass105Array1405[i_30_]);
					if (-1215239439 * class105.anInt1144 == 5 && -1 != class105.anInt1175 * 1411971043 && !(Class158.aClass243_6364.method2290(1411971043 * class105.anInt1175, 0, -1154476799)))
						bool = false;
				}
				if (!bool)
					return 0;
			}
			if (Class227.aClass227_2545 == Class82_Sub6.aClass227_6843)
				Class501.method6227(true, -1028404543);
			if (Class227.aClass227_2546 == Class82_Sub6.aClass227_6843) {
				Class288_Sub1.aClass219_7147.method2042((byte) 25);
				try {
					Class459.aThread5674.join();
				} catch (InterruptedException interruptedexception) {
					return 0;
				}
				Class288_Sub1.aClass219_7147 = null;
				Class459.aThread5674 = null;
				Class122.aClass243_1466 = null;
				Class230.aClass243_2564 = null;
				Class420.aClass515_5344 = null;
				Class230.anInterface12Array2562 = null;
				Class507.method6276(1677071566);
				client.aBoolean8646 = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub27_7579.method5720((byte) -47) == 1;
				Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub27_7579, 1, 807460534);
				if (client.aBoolean8646)
					Class422_Sub25.aClass298_Sub48_8425.method3540((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7570), 0, -91524334);
				else if ((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7570.aBoolean8398) && (399637415 * Class12.aClass298_Sub44_9946.cpuClockSpeed < 512) && (399637415 * Class12.aClass298_Sub44_9946.cpuClockSpeed != 0))
					Class422_Sub25.aClass298_Sub48_8425.method3540((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7570), 0, -1214226075);
				Class3.method300(656179282);
				if (client.aBoolean8646)
					Class370.method4578(0, false, 622850291);
				else
					Class370.method4578(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7570.method5677(-1847672596), false, 622850291);
				Class357.method4276(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub12_7543.method5669((byte) 12), -1, -1, false, -107949513);
				Class497.aClass197_6105.method1882(client.anInterface10_8700, (byte) 3);
				Class426.method5744(Class373.aClass_ra4071, -1188868944);
				Class346.method4173(Class373.aClass_ra4071, Class158.aClass243_6364, 498152714);
				Class_ta_Sub2.method6001(Class130_Sub2.aClass57Array6959, -1481526948);
			}
			return Class522.method6324(205846067);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.d(").append(')').toString());
		}
	}

	static final int method1402(int i, int i_31_) {
		try {
			int i_32_ = i & 0x3f;
			int i_33_ = i >> 6 & 0x3;
			if (i_32_ == 18) {
				if (i_33_ == 0)
					return 1;
				if (1 == i_33_)
					return 2;
				if (2 == i_33_)
					return 4;
				if (3 == i_33_)
					return 8;
			} else if (i_32_ == 19 || 21 == i_32_) {
				if (0 == i_33_)
					return 16;
				if (1 == i_33_)
					return 32;
				if (i_33_ == 2)
					return 64;
				if (3 == i_33_)
					return 128;
			}
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fb.ib(").append(')').toString());
		}
	}
}
