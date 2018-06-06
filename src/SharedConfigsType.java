/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SharedConfigsType {
	public static SharedConfigsType aClass120_1464;
	static SharedConfigsType aClass120_1465;
	public static SharedConfigsType aClass120_1466;
	public static SharedConfigsType aClass120_1467;
	static SharedConfigsType aClass120_1468;
	public static SharedConfigsType aClass120_1469;
	static SharedConfigsType aClass120_1470;
	public static SharedConfigsType aClass120_1471;
	static SharedConfigsType aClass120_1472;
	public static SharedConfigsType aClass120_1473;
	public static SharedConfigsType aClass120_1474;
	public static SharedConfigsType aClass120_1475;
	public static SharedConfigsType aClass120_1476;
	public static SharedConfigsType aClass120_1477;
	public static SharedConfigsType aClass120_1478;
	public static SharedConfigsType aClass120_1479;
	static SharedConfigsType aClass120_1480;
	static SharedConfigsType aClass120_1481;
	public static SharedConfigsType aClass120_1482;
	public static SharedConfigsType WORLD_MAP_DEFS;
	static SharedConfigsType aClass120_1484;
	static SharedConfigsType aClass120_1485;
	static SharedConfigsType aClass120_1486;
	public static SharedConfigsType aClass120_1487;
	public static SharedConfigsType OBJECT_DEFINITIONS;
	public static SharedConfigsType aClass120_1489;
	static SharedConfigsType aClass120_1490;
	static SharedConfigsType aClass120_1491;
	public static SharedConfigsType INVENTORIES;
	public static SharedConfigsType ITEM_DEFINITIONS;
	public static SharedConfigsType aClass120_1494;
	int fileIdBitShift;
	public static SharedConfigsType aClass120_1496;
	public static SharedConfigsType aClass120_1497;
	public static SharedConfigsType aClass120_1498;
	static SharedConfigsType aClass120_1499;
	static SharedConfigsType aClass120_1500;
	static SharedConfigsType aClass120_1501;
	static SharedConfigsType aClass120_1502;
	static SharedConfigsType aClass120_1503;
	public static SharedConfigsType UNDERLAY = new SharedConfigsType(1);
	static SharedConfigsType aClass120_1505;
	static SharedConfigsType aClass120_1506;
	static SharedConfigsType aClass120_1507;
	static SharedConfigsType aClass120_1508;
	public static SharedConfigsType aClass120_1509;
	public static SharedConfigsType aClass120_1510;
	public static SharedConfigsType aClass120_1511;
	public static SharedConfigsType HITBARS;
	static SharedConfigsType aClass120_1513;
	public static SharedConfigsType aClass120_1514;
	static SharedConfigsType aClass120_1515;
	static SharedConfigsType aClass120_1516;
	static SharedConfigsType aClass120_1517;
	static SharedConfigsType aClass120_1518;
	static SharedConfigsType aClass120_1519;
	static SharedConfigsType aClass120_1520;
	public int id;
	public static SharedConfigsType aClass120_1522;

	SharedConfigsType(int i) {
		this(i, 0);
	}

	SharedConfigsType(int i, int i_0_) {
		id = -982036495 * i;
		((SharedConfigsType) this).fileIdBitShift = 1490949057 * i_0_;
	}

	public int filesPerContainer(int i) {
		return 1 << 854326337 * ((SharedConfigsType) this).fileIdBitShift;
	}

	public int containerId(int i, int i_1_) {
		return i >>> 854326337 * ((SharedConfigsType) this).fileIdBitShift;
	}

	public int fileId(int i, int i_2_) {
		return i & (1 << ((SharedConfigsType) this).fileIdBitShift * 854326337) - 1;
	}

	public static boolean method2084(Index class317, Index class317_3_, Index class317_4_, Class282_Sub15_Sub2 class282_sub15_sub2, Class253 class253, int i) {
		Class148.aClass317_1737 = class317;
		Class148.aClass317_1731 = class317_3_;
		Class148.aClass317_1732 = class317_4_;
		Class148.aClass282_Sub15_Sub2_1735 = class282_sub15_sub2;
		Class502.aClass253_5830 = class253;
		Class453.anIntArray5449 = new int[16];
		for (int i_5_ = 0; i_5_ < 16; i_5_++)
			Class453.anIntArray5449[i_5_] = 255;
		return true;
	}

	static {
		aClass120_1465 = new SharedConfigsType(2);
		aClass120_1466 = new SharedConfigsType(3);
		aClass120_1514 = new SharedConfigsType(4);
		INVENTORIES = new SharedConfigsType(5);
		OBJECT_DEFINITIONS = new SharedConfigsType(6, 8);
		aClass120_1470 = new SharedConfigsType(7);
		aClass120_1471 = new SharedConfigsType(8, 8);
		aClass120_1467 = new SharedConfigsType(9, 7);
		ITEM_DEFINITIONS = new SharedConfigsType(10, 8);
		aClass120_1474 = new SharedConfigsType(11);
		aClass120_1475 = new SharedConfigsType(12, 7);
		aClass120_1476 = new SharedConfigsType(13, 8);
		aClass120_1477 = new SharedConfigsType(14, 10);
		aClass120_1478 = new SharedConfigsType(15);
		aClass120_1487 = new SharedConfigsType(16);
		aClass120_1480 = new SharedConfigsType(17);
		aClass120_1481 = new SharedConfigsType(18);
		aClass120_1482 = new SharedConfigsType(19);
		aClass120_1472 = new SharedConfigsType(20);
		aClass120_1484 = new SharedConfigsType(21);
		aClass120_1485 = new SharedConfigsType(22);
		aClass120_1486 = new SharedConfigsType(23);
		aClass120_1522 = new SharedConfigsType(24);
		aClass120_1479 = new SharedConfigsType(25);
		aClass120_1473 = new SharedConfigsType(26);
		aClass120_1490 = new SharedConfigsType(27);
		aClass120_1491 = new SharedConfigsType(28);
		aClass120_1469 = new SharedConfigsType(29);
		aClass120_1489 = new SharedConfigsType(30);
		aClass120_1494 = new SharedConfigsType(31);
		aClass120_1511 = new SharedConfigsType(32);
		aClass120_1496 = new SharedConfigsType(33);
		aClass120_1497 = new SharedConfigsType(34);
		aClass120_1498 = new SharedConfigsType(35);
		WORLD_MAP_DEFS = new SharedConfigsType(36);
		aClass120_1500 = new SharedConfigsType(37);
		aClass120_1501 = new SharedConfigsType(38);
		aClass120_1502 = new SharedConfigsType(39);
		aClass120_1503 = new SharedConfigsType(40);
		aClass120_1468 = new SharedConfigsType(41);
		aClass120_1505 = new SharedConfigsType(42);
		aClass120_1506 = new SharedConfigsType(43);
		aClass120_1507 = new SharedConfigsType(44);
		aClass120_1508 = new SharedConfigsType(45);
		aClass120_1509 = new SharedConfigsType(46);
		aClass120_1510 = new SharedConfigsType(47);
		aClass120_1518 = new SharedConfigsType(48);
		aClass120_1499 = new SharedConfigsType(49);
		aClass120_1513 = new SharedConfigsType(50);
		aClass120_1516 = new SharedConfigsType(51);
		aClass120_1515 = new SharedConfigsType(53);
		aClass120_1464 = new SharedConfigsType(54);
		aClass120_1517 = new SharedConfigsType(70);
		HITBARS = new SharedConfigsType(72);
		aClass120_1519 = new SharedConfigsType(73);
		aClass120_1520 = new SharedConfigsType(74);
	}

	static final void method2091(CS2Executor class527, byte i) {
		class527.anInt7012 -= 425673003;
		int i_6_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_7_ = (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		int i_8_ = (class527.intStack[2 + class527.anInt7012 * 1942118537]);
		QuickchatDefinitions class282_sub50_sub9 = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(i_6_, -1670488027);
		if ((class282_sub50_sub9.method14918(i_7_, -1596809459).id * -1869685303) != 0) {
			if (i >= 1)
				return;
			throw new RuntimeException("");
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class282_sub50_sub9.method14901(i_7_, i_8_, 1954102872);
	}

	static void method2092(CS2Executor class527, byte i) {
		class527.intStack[class527.anInt7012 * 1942118537 - 2] = (IndexLoaders.aClass242_4922.method4156((class527.intStack[class527.anInt7012 * 1942118537 - 2]), -1396181317).anIntArrayArray2966[(class527.intStack[1942118537 * class527.anInt7012 - 1])][0]);
		class527.anInt7012 -= 141891001;
	}

	static final void method2093(CS2Executor class527, byte i) {
		int i_9_ = (class527.intOpValues[class527.instrPtr * 301123709]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((NPC) class527.animable).aClass153_10579.method2610(i_9_, (short) 25901);
	}

	public static void method2094(int i, byte i_10_) {
		Class291_Sub1.anInt8018 = 428705471;
		Class291_Sub1.anInt8026 = i * 194319891;
		Class361.anInt4185 = 413638675;
		Class96_Sub9.anInt9282 = -1386689828;
	}

	static void method2095(Class282_Sub50_Sub7 class282_sub50_sub7, int i) {
		if (!Class20.aBool161) {
			class282_sub50_sub7.unlink(-371378792);
			Class20.anInt169 -= 1410722043;
			if (!((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9586) {
				long l = (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9580 * 820033947929891191L);
				Class282_Sub50_Sub15 class282_sub50_sub15;
				for (class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass465_172.method7754(l)); (class282_sub50_sub15 != null && !(((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588))); class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass465_172.method7747(-1584347554))) {
					/* empty */
				}
				if (null != class282_sub50_sub15 && class282_sub50_sub15.method15249(class282_sub50_sub7, (byte) 17))
					Class13.method503(class282_sub50_sub15, 1715883578);
			} else {
				for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7941((byte) 4)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7955(194809254))) {
					if (((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588)) {
						boolean bool = false;
						for (Class282_Sub50_Sub7 class282_sub50_sub7_11_ = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7941((byte) 4)); null != class282_sub50_sub7_11_; class282_sub50_sub7_11_ = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7955(444396099))) {
							if (class282_sub50_sub7_11_ == class282_sub50_sub7) {
								if (class282_sub50_sub15.method15249(class282_sub50_sub7, (byte) 111))
									Class13.method503(class282_sub50_sub15, 1035797942);
								bool = true;
								break;
							}
						}
						if (bool)
							break;
					}
				}
			}
		}
	}

	static final void method2096(CS2Executor class527, byte i) {
		int i_12_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (2 == client.anInt7434 * 1609086245 && i_12_ < client.anInt7449 * 493536965) {
			Class6 class6 = client.aClass6Array7452[i_12_];
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class6.aString37;
			if (class6.aString43 != null)
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = class6.aString43;
			else
				class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141) - 1] = "";
		} else {
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}
}
