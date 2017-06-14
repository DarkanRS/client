/* Class411 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class411 {
	public static Class411 aClass411_5316;
	public String aString5317;
	static Class411 aClass411_5318;
	static Class411 aClass411_5319;
	public static Class411 aClass411_5320 = new Class411("darkan", "Darkan", 0);
	static Class411 aClass411_5321;
	public String aString5322;
	public int gameType;
	static Class298_Sub37_Sub15 aClass298_Sub37_Sub15_5324;
	static int anInt5325;

	Class411(String string, String string_0_, int i) {
		aString5317 = string;
		aString5322 = string_0_;
		gameType = i * 977088255;
	}

	static {
		aClass411_5316 = new Class411("stellardawn", "Stellar Dawn", 1);
		aClass411_5318 = new Class411("game3", "Game 3", 2);
		aClass411_5319 = new Class411("game4", "Game 4", 3);
		aClass411_5321 = new Class411("game5", "Game 5", 4);
	}

	public static long method5574(int i, int i_1_) {
		try {
			return 86400000L * (long) (11745 + i);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rb.r(").append(')').toString());
		}
	}

	static void method5575(Entity class365_sub1_sub1_sub2, int i, int i_2_) {
		try {
			if (null != class365_sub1_sub1_sub2.anIntArray10093) {
				Class282 class282 = ((Class282) Class422_Sub20.method5701(Class522.method6325((byte) -26), i, (byte) 2));
				int i_3_ = (class365_sub1_sub1_sub2.anIntArray10093[class282.method2617((byte) -118)]);
				if (i_3_ != class365_sub1_sub1_sub2.aClass438_10078.method5823(1579357241)) {
					class365_sub1_sub1_sub2.aClass438_10078.method5833(i_3_, class365_sub1_sub1_sub2.aClass438_10078.method5827((short) 758), -684011169);
					class365_sub1_sub1_sub2.anInt10125 = class365_sub1_sub1_sub2.anInt10120 * -526956429;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rb.hk(").append(')').toString());
		}
	}

	static void method5576(int i, int i_4_, int i_5_, Class298_Sub12 class298_sub12, int i_6_) {
		try {
			long l = (long) (i << 28 | i_5_ << 14 | i_4_);
			Class298_Sub2 class298_sub2 = (Class298_Sub2) client.groundItems.get(l);
			if (class298_sub2 == null) {
				class298_sub2 = new Class298_Sub2();
				client.groundItems.method5817(class298_sub2, l);
				class298_sub2.aClass453_7166.method5935(class298_sub12, 1567854006);
			} else {
				ItemDefinitions class468 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(1768239597 * class298_sub12.anInt7257));
				int i_7_ = 785788887 * class468.anInt5721;
				if (789409129 * class468.anInt5704 == 1)
					i_7_ *= 1 + 567630807 * (((Class298_Sub12) class298_sub12).anInt7256);
				for (Class298_Sub12 class298_sub12_8_ = (Class298_Sub12) class298_sub2.aClass453_7166.method5939(1766612795); null != class298_sub12_8_; class298_sub12_8_ = ((Class298_Sub12) class298_sub2.aClass453_7166.method5944(49146))) {
					class468 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(class298_sub12_8_.anInt7257 * 1768239597));
					int i_9_ = 785788887 * class468.anInt5721;
					if (1 == 789409129 * class468.anInt5704)
						i_9_ *= 1 + (((Class298_Sub12) class298_sub12_8_).anInt7256) * 567630807;
					if (i_7_ > i_9_) {
						Class97_Sub1.method1044(class298_sub12, class298_sub12_8_, 1979456016);
						return;
					}
				}
				class298_sub2.aClass453_7166.method5935(class298_sub12, 1066004680);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rb.jt(").append(')').toString());
		}
	}

	static void method5577(IComponentDefinition class105, int i) {
		try {
			if (5 == -1215239439 * class105.anInt1144 && -1 != class105.anInt1280 * -1232467723)
				Class230.method2125(Class373.aClass_ra4071, class105, -1423422969);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rb.lz(").append(')').toString());
		}
	}

	static final void method5578(IComponentDefinition[] class105s, int i, byte i_10_) {
		try {
			for (int i_11_ = 0; i_11_ < class105s.length; i_11_++) {
				IComponentDefinition class105 = class105s[i_11_];
				if (null == class105) {
					if (i_10_ != 1) {
						/* empty */
					}
				} else if (i != class105.anInt1160 * 1573706803) {
					if (i_10_ != 1) {
						/* empty */
					}
				} else if (client.method2802(class105)) {
					if (i_10_ != 1)
						throw new IllegalStateException();
				} else {
					if (0 == -1215239439 * class105.anInt1144) {
						method5578(class105s, class105.anInt1142 * -440872681, (byte) 1);
						if (class105.aClass105Array1293 != null)
							method5578(class105.aClass105Array1293, class105.anInt1142 * -440872681, (byte) 1);
						Interface class298_sub51 = ((Interface) (client.aClass437_8841.get((long) (class105.anInt1142 * -440872681))));
						if (class298_sub51 != null)
							Class443.method5884((-1617025021 * class298_sub51.interfaceId), 587240851);
					}
					if (6 == class105.anInt1144 * -1215239439 && class105.anInt1290 * 1347982601 != -1) {
						if (class105.aClass438_1152 == null) {
							class105.aClass438_1152 = new Class438_Sub1();
							class105.aClass438_1152.method5821(1347982601 * class105.anInt1290, -1878217807);
						}
						if (class105.aClass438_1152.method5822(((client.anInt8961) * 614680345), 1675733273) && class105.aClass438_1152.method5832(1621670182))
							class105.aClass438_1152.method5834(507141034);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rb.le(").append(')').toString());
		}
	}

	static void method5579(int i) {
		try {
			if (13 == client.anInt8752 * -1233866115)
				Class264_Sub2.method2506(-1611681764);
			Class305.method3751((byte) 76);
			client.lobbyConnection.method384((byte) 113);
			Class422_Sub7.aBoolean8385 = true;
			Class93.method1011((byte) 1);
			for (int i_12_ = 0; i_12_ < client.aClass19Array8869.length; i_12_++)
				client.aClass19Array8869[i_12_] = null;
			client.aBoolean8835 = false;
			Class127_Sub3.method1434(-338598105);
			client.anInt8817 = ((int) (Math.random() * 100.0) - 50) * 1640262285;
			client.anInt8742 = ((int) (Math.random() * 110.0) - 55) * 974956735;
			client.anInt8744 = ((int) (Math.random() * 80.0) - 40) * -1010535049;
			client.anInt8801 = ((int) (Math.random() * 120.0) - 60) * -1216239003;
			client.anInt8749 = ((int) (Math.random() * 30.0) - 20) * -852543493;
			client.aFloat8949 = (float) ((int) (Math.random() * 160.0) - 80 & 0x3fff);
			Class21.method369(1944021119);
			for (int i_13_ = 0; i_13_ < 2048; i_13_++)
				client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_13_] = null;
			Class287.myPlayer = null;
			client.anInt8703 = 0;
			client.anInt8772 = 0;
			client.npcs.clear((byte) -7);
			client.aClass453_8824.method5943((byte) 1);
			client.aClass437_8825.clear((byte) -106);
			client.aClass442_8650.method5869(585418023);
			client.groundItems.clear((byte) -42);
			Class298_Sub1.aClass453_7152 = new Class453();
			Class298_Sub1.aClass453_7162 = new Class453();
			Class128.aClass148_6331.method1603(-1549621575);
			Class182.method1847((byte) -108);
			Class376.anInt4089 = 0;
			Class82_Sub4.anInt6832 = 0;
			Class98_Sub3.anInt6938 = 0;
			Class129.anInt6380 = 0;
			Class21.anInt276 = 0;
			Class_xa.anInt6292 = 0;
			Class464.anInt5959 = 0;
			Class18.anInt255 = 0;
			Class128_Sub1.anInt8556 = 0;
			Class427.anInt5362 = 0;
			for (int i_14_ = 0; i_14_ < Class374.anIntArray4078.length; i_14_++) {
				if (!Class254.aBooleanArray2790[i_14_])
					Class374.anIntArray4078[i_14_] = -1;
			}
			if (-257444687 * client.WINDOW_PANE_ID != -1)
				Class82_Sub8.method893(-257444687 * client.WINDOW_PANE_ID, -2042512871);
			for (Interface class298_sub51 = ((Interface) client.aClass437_8841.method5816(1962409913)); null != class298_sub51; class298_sub51 = ((Interface) client.aClass437_8841.method5815((byte) -39))) {
				if (!class298_sub51.method2840(-629325116)) {
					class298_sub51 = ((Interface) client.aClass437_8841.method5816(1772804345));
					if (null == class298_sub51) {
						if (i != -2092028687) {
							/* empty */
						}
						break;
					}
				}
				Class173.method1821(class298_sub51, true, false, -113822480);
			}
			client.WINDOW_PANE_ID = -1785861201;
			client.aClass437_8841 = new HashTable(8);
			Class397.method4912((short) 255);
			client.aClass105_8652 = null;
			for (int i_15_ = 0; i_15_ < 8; i_15_++) {
				client.aStringArray8820[i_15_] = null;
				client.aBooleanArray8821[i_15_] = false;
				client.anIntArray8904[i_15_] = -1;
			}
			Class418.method5601((byte) -40);
			client.aBoolean8663 = true;
			for (int i_16_ = 0; i_16_ < 113; i_16_++)
				client.aBooleanArray8900[i_16_] = true;
			for (int i_17_ = 0; i_17_ < 6; i_17_++)
				client.aClass251Array8920[i_17_] = new Class251();
			client.aClass283_8716.method2640((byte) -46).method4324(-1196946367);
			client.aBoolean8763 = true;
			Class107.aShortArray1315 = ObjectDefinitions.aShortArray5423 = SomethingDefinitions.aShortArray6182 = ItemDefinitions.aShortArray5757 = new short[256];
			Class82_Sub6.aString6845 = Tradution.aClass470_5854.method6049(Class321.aClass429_3357, -875414210);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub17_7565, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub17_7564.method5689(-2013953489), 185315871);
			client.anInt8713 = 0;
			Class447.method5905(2108312995);
			Class326.method3974(-2137735375);
			Class_xa.aClass396_6291 = null;
			Class365_Sub1_Sub2_Sub1.aLong9911 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rb.ak(").append(')').toString());
		}
	}

	static final void method5580(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class84.aClass305_770.method3747("jagtheora", -935061597) ? 1 : 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rb.and(").append(')').toString());
		}
	}
}
