/* Class96_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub4 extends Class96 {
	int anInt8519;
	int anInt8520;
	int anInt8521;
	int anInt8522;
	int anInt8523;
	public static Class474 aClass474_8524;

	Class96_Sub4(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub4) this).anInt8520 = class282_sub35.readUnsignedShort() * 2062001331;
		int i = class282_sub35.readInt();
		((Class96_Sub4) this).anInt8519 = (i >>> 16) * 517305567;
		((Class96_Sub4) this).anInt8521 = (i & 0xffff) * -1845072575;
		((Class96_Sub4) this).anInt8522 = class282_sub35.readUnsignedByte() * 1440988541;
		((Class96_Sub4) this).anInt8523 = class282_sub35.method13094(1019045848) * 1479203411;
	}

	public void method1592(int i) {
		Class82.aClass75Array804[((Class96_Sub4) this).anInt8520 * 2144840315].method1336(1910720287 * ((Class96_Sub4) this).anInt8519, ((Class96_Sub4) this).anInt8521 * -194698559, 1760322517 * ((Class96_Sub4) this).anInt8522, 1015183835 * ((Class96_Sub4) this).anInt8523, 1433918687);
	}

	public void method1601() {
		Class82.aClass75Array804[((Class96_Sub4) this).anInt8520 * 2144840315].method1336(1910720287 * ((Class96_Sub4) this).anInt8519, ((Class96_Sub4) this).anInt8521 * -194698559, 1760322517 * ((Class96_Sub4) this).anInt8522, 1015183835 * ((Class96_Sub4) this).anInt8523, 1626481262);
	}

	static boolean method13788(int i, int i_0_) {
		return (i == 59 || i == 2 || i == 8 || 17 == i || 15 == i || 16 == i || i == 58);
	}

	static void method13789(Class282_Sub50_Sub7 class282_sub50_sub7, int i, int i_1_, int i_2_) {
		if (null != class282_sub50_sub7 && Class20.aClass482_171.aClass282_5728 != class282_sub50_sub7) {
			int i_3_ = (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9581 * 1575008129);
			int i_4_ = (395156599 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582);
			int i_5_ = (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225);
			int i_6_ = (int) (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584));
			long l = (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584 * -5876141066140255231L);
			if (i_5_ >= 2000)
				i_5_ -= 2000;
			Class219 class219 = client.aClass257_7353.method4519(1872189276);
			OutgoingPacket class379 = null;
			if (i_5_ == 44)
				class379 = OutgoingPacket.aClass379_4539;
			else if (45 == i_5_)
				class379 = OutgoingPacket.aClass379_4571;
			else if (46 == i_5_)
				class379 = OutgoingPacket.aClass379_4623;
			else if (i_5_ == 47)
				class379 = OutgoingPacket.aClass379_4616;
			else if (48 == i_5_)
				class379 = OutgoingPacket.aClass379_4610;
			else if (i_5_ == 49)
				class379 = OutgoingPacket.aClass379_4528;
			else if (i_5_ == 50)
				class379 = OutgoingPacket.aClass379_4594;
			else if (51 == i_5_)
				class379 = OutgoingPacket.aClass379_4621;
			else if (i_5_ == 52)
				class379 = OutgoingPacket.aClass379_4580;
			else if (i_5_ == 53)
				class379 = OutgoingPacket.aClass379_4629;
			if (null != class379) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i_6_];
				if (null != class521_sub1_sub1_sub2_sub1) {
					client.anInt7293 = -1271587837 * i;
					client.anInt7294 = 1614548531 * i_1_;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379, (client.aClass184_7475.aClass432_2283), -38973320);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_6_, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1893602887) ? 1 : 0, -1708065557);
					client.aClass184_7475.method3049(class282_sub23, 67860298);
					Class257.method4559(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], true, (Class344.method6115(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], class521_sub1_sub1_sub2_sub1.method15805(828768449), class521_sub1_sub1_sub2_sub1.method15805(828768449), 0, 971339209)), 1593350845);
				}
			}
			if (16 == i_5_) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_1_;
				client.anInt7296 = -370989110;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4540, client.aClass184_7475.aClass432_2283, -70783895);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(client.anInt7345 * -1673073865, 1417031095);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE((-1691508299 * Class84.myPlayer.anInt10314), (short) -7319);
				class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1700744259) ? 1 : 0, 2138987650);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(728544879 * Class7.anInt56, (byte) 104);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(-1555739329 * client.anInt7346, (short) -21214);
				client.aClass184_7475.method3049(class282_sub23, -436533109);
			}
			if (i_5_ == 57 || 1007 == i_5_)
				Class96_Sub10.method14603(i_6_, i_4_, i_3_, ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588, (byte) 9);
			if (i_5_ == 15) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i_6_];
				if (class521_sub1_sub1_sub2_sub1 != null) {
					client.anInt7293 = i * -1271587837;
					client.anInt7294 = i_1_ * 1614548531;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4540, (client.aClass184_7475.aClass432_2283), 2077499926);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-1673073865 * client.anInt7345, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(i_6_, (short) -12854);
					class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1642883449) ? 1 : 0, -1169068214);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(Class7.anInt56 * 728544879, (byte) 104);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(client.anInt7346 * -1555739329, (short) -2375);
					client.aClass184_7475.method3049(class282_sub23, -111115308);
					Class257.method4559(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], true, (Class344.method6115(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], class521_sub1_sub1_sub2_sub1.method15805(828768449), class521_sub1_sub1_sub2_sub1.method15805(828768449), 0, 971339209)), 1255775546);
				}
			}
			if (i_5_ == 2) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_1_;
				client.anInt7296 = -370989110;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4625, client.aClass184_7475.aClass432_2283, 787993622);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(i_3_ + class219.anInt2711 * 1948093437, -1183932171);
				class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1875320207) ? 1 : 0, -728413963);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV1((int) (l >>> 32) & 0x7fffffff, 1535840012);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(Class7.anInt56 * 728544879);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(-1555739329 * client.anInt7346, (short) -20075);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(-1673073865 * client.anInt7345, -800257688);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(i_4_ + -1002240017 * class219.anInt2712, (short) -19304);
				client.aClass184_7475.method3049(class282_sub23, -886113840);
				Class439.method7344(i_3_, i_4_, l);
			}
			OutgoingPacket class379_7_ = null;
			if (i_5_ == 9)
				class379_7_ = OutgoingPacket.aClass379_4592;
			else if (10 == i_5_)
				class379_7_ = OutgoingPacket.aClass379_4532;
			else if (i_5_ == 11)
				class379_7_ = OutgoingPacket.aClass379_4577;
			else if (12 == i_5_)
				class379_7_ = OutgoingPacket.aClass379_4599;
			else if (i_5_ == 13)
				class379_7_ = OutgoingPacket.aClass379_4622;
			else if (1003 == i_5_)
				class379_7_ = OutgoingPacket.aClass379_4530;
			if (class379_7_ != null) {
				Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_6_));
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					client.anInt7293 = -1271587837 * i;
					client.anInt7294 = i_1_ * 1614548531;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379_7_, (client.aClass184_7475.aClass432_2283), 1353629602);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_6_, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class84.method1465(-1762610857) ? 1 : 0);
					client.aClass184_7475.method3049(class282_sub23, -688965453);
					Class257.method4559(class521_sub1_sub1_sub2_sub2.regionBaseX[0], class521_sub1_sub1_sub2_sub2.regionBaseY[0], true, (Class344.method6115(class521_sub1_sub1_sub2_sub2.regionBaseX[0], class521_sub1_sub1_sub2_sub2.regionBaseY[0], class521_sub1_sub1_sub2_sub2.method15805(828768449), class521_sub1_sub1_sub2_sub2.method15805(828768449), 0, 971339209)), 907331887);
				}
			}
			if (60 == i_5_) {
				if (client.rights * -644057819 > 0 && Class96_Sub8.method14577(1203434505))
					Class447.method7460(Class84.myPlayer.aByte7967, i_3_ + 1948093437 * class219.anInt2711, i_4_ + class219.anInt2712 * -1002240017, -1797867076);
				else {
					client.anInt7293 = i * -1271587837;
					client.anInt7294 = 1614548531 * i_1_;
					client.anInt7296 = 1961989093;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4590, (client.aClass184_7475.aClass432_2283), 340096638);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(1948093437 * class219.anInt2711 + i_3_, -800257688);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_4_ + -1002240017 * class219.anInt2712, 1417031095);
					client.aClass184_7475.method3049(class282_sub23, -258838494);
				}
			}
			if (i_5_ == 23) {
				if (client.rights * -644057819 > 0 && Class96_Sub8.method14577(1203434505))
					Class447.method7460(Class84.myPlayer.aByte7967, i_3_ + class219.anInt2711 * 1948093437, i_4_ + class219.anInt2712 * -1002240017, -1328310024);
				else {
					Class282_Sub23 class282_sub23 = Class282_Sub2.method12078(i_3_, i_4_, i_6_, -1751804483);
					if (1 == i_6_) {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((int) client.aFloat7365, 1417031095);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(57);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1790074477 * client.anInt7255);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(client.anInt7203 * -1864403271);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(89);
						Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((int) class385.aFloat4671, 1417031095);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((int) class385.aFloat4673, 1417031095);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(63);
					} else {
						client.anInt7293 = -1271587837 * i;
						client.anInt7294 = 1614548531 * i_1_;
						client.anInt7296 = 1961989093;
						client.anInt7295 = 0;
					}
					client.aClass184_7475.method3049(class282_sub23, -1144629676);
					Class257.method4559(i_3_, i_4_, true, Class38.method853(i_3_, i_4_, 1597401587), 1072484880);
				}
			}
			if (17 == i_5_) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_1_;
				client.anInt7296 = -370989110;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4583, client.aClass184_7475.aClass432_2283, -30824193);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(client.anInt7346 * -1555739329, -800257688);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(728544879 * Class7.anInt56, (byte) 104);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_6_, 1417031095);
				class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-2067403858) ? 1 : 0, 614309811);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(client.anInt7345 * -1673073865, -1183932171);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(class219.anInt2712 * -1002240017 + i_4_, -1183932171);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(class219.anInt2711 * 1948093437 + i_3_, (short) -574);
				client.aClass184_7475.method3049(class282_sub23, 1026705629);
				client.method12073(i_3_, i_4_, 693787765);
			}
			if (i_5_ == 59) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_1_;
				client.anInt7296 = 1961989093;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4589, client.aClass184_7475.aClass432_2283, 1709499240);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(client.anInt7346 * -1555739329, (short) -18202);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(class219.anInt2712 * -1002240017 + i_4_, (short) -5938);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV1(728544879 * Class7.anInt56, 362432766);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(-1673073865 * client.anInt7345, -800257688);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(class219.anInt2711 * 1948093437 + i_3_, (short) -8634);
				client.aClass184_7475.method3049(class282_sub23, -311032746);
				Class257.method4559(i_3_, i_4_, true, Class38.method853(i_3_, i_4_, -795317623), 1870869554);
			}
			if (30 == i_5_ && null == client.aClass118_7352) {
				Class158_Sub2.method14355(i_4_, i_3_, 382043562);
				client.aClass118_7352 = Class317.method5694(i_4_, i_3_, -702392131);
				if (null != client.aClass118_7352)
					Class109.method1858(client.aClass118_7352, (byte) -7);
			}
			if (i_5_ == 58) {
				Class118 class118 = Class317.method5694(i_4_, i_3_, 1636358419);
				if (null != class118)
					Class151.method2590(class118, (byte) 30);
			}
			if (25 == i_5_) {
				Class118 class118 = Class317.method5694(i_4_, i_3_, 1215515572);
				if (class118 != null) {
					Class60.method1170(-609337146);
					Class282_Sub10 class282_sub10 = client.method11633(class118);
					Class304.method5409(class118, class282_sub10.method12179(-127585296), class282_sub10.anInt7541 * 1831058647, (byte) -114);
					client.aString7275 = Class346.method6157(class118, -252673863);
					if (client.aString7275 == null)
						client.aString7275 = "Null";
					client.aString7356 = new StringBuilder().append(class118.aString1369).append(Class59.method1163(16777215, 619010179)).toString();
				}
			} else {
				OutgoingPacket class379_8_ = null;
				if (18 == i_5_)
					class379_8_ = OutgoingPacket.aClass379_4559;
				else if (19 == i_5_)
					class379_8_ = OutgoingPacket.aClass379_4552;
				else if (i_5_ == 20)
					class379_8_ = OutgoingPacket.aClass379_4581;
				else if (21 == i_5_)
					class379_8_ = OutgoingPacket.aClass379_4535;
				else if (i_5_ == 22)
					class379_8_ = OutgoingPacket.aClass379_4564;
				else if (i_5_ == 1004)
					class379_8_ = OutgoingPacket.aClass379_4588;
				if (null != class379_8_) {
					client.anInt7293 = i * -1271587837;
					client.anInt7294 = i_1_ * 1614548531;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379_8_, (client.aClass184_7475.aClass432_2283), 934209488);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(i_6_, -1183932171);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByteC(Class84.method1465(-1708313818) ? 1 : 0, 1203558743);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class219.anInt2712 * -1002240017 + i_4_, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(i_3_ + class219.anInt2711 * 1948093437, -800257688);
					client.aClass184_7475.method3049(class282_sub23, 1582161852);
					client.method12073(i_3_, i_4_, 633151820);
				}
				if (8 == i_5_) {
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_6_));
					if (null != class282_sub47) {
						NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
						client.anInt7293 = -1271587837 * i;
						client.anInt7294 = 1614548531 * i_1_;
						client.anInt7296 = -370989110;
						client.anInt7295 = 0;
						Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4568, (client.aClass184_7475.aClass432_2283), -608363088);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(728544879 * Class7.anInt56, (byte) 104);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(i_6_, -1183932171);
						class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1846955130) ? 1 : 0, 1376249266);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(client.anInt7346 * -1555739329, -1183932171);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(client.anInt7345 * -1673073865, -800257688);
						client.aClass184_7475.method3049(class282_sub23, -86724265);
						Class257.method4559(class521_sub1_sub1_sub2_sub2.regionBaseX[0], class521_sub1_sub1_sub2_sub2.regionBaseY[0], true, Class344.method6115((class521_sub1_sub1_sub2_sub2.regionBaseX[0]), (class521_sub1_sub1_sub2_sub2.regionBaseY[0]), class521_sub1_sub1_sub2_sub2.method15805(828768449), class521_sub1_sub1_sub2_sub2.method15805(828768449), 0, 971339209), 1130929855);
					}
				}
				OutgoingPacket class379_9_ = null;
				if (i_5_ == 3)
					class379_9_ = OutgoingPacket.aClass379_4602;
				else if (i_5_ == 4)
					class379_9_ = OutgoingPacket.aClass379_4620;
				else if (i_5_ == 5)
					class379_9_ = OutgoingPacket.aClass379_4565;
				else if (i_5_ == 6)
					class379_9_ = OutgoingPacket.aClass379_4626;
				else if (i_5_ == 1001)
					class379_9_ = OutgoingPacket.aClass379_4575;
				else if (i_5_ == 1002)
					class379_9_ = OutgoingPacket.OBJECT_EXAMINE;
				if (class379_9_ != null) {
					client.anInt7293 = -1271587837 * i;
					client.anInt7294 = 1614548531 * i_1_;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379_9_, (client.aClass184_7475.aClass432_2283), 1341329905);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_4_ + -1002240017 * class219.anInt2712, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_3_ + class219.anInt2711 * 1948093437, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeInt((int) (l >>> 32) & 0x7fffffff);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte128(Class84.method1465(-1734216598) ? 1 : 0, 784835211);
					client.aClass184_7475.method3049(class282_sub23, -1242179380);
					Class439.method7344(i_3_, i_4_, l);
				}
				if (1008 == i_5_ || 1009 == i_5_ || 1010 == i_5_ || 1011 == i_5_ || 1012 == i_5_)
					Class6.method303(i_5_, i_6_, i_3_, -1949289541);
				if (client.aBool7344)
					Class60.method1170(-609337146);
				if (Class401.aClass118_4825 != null && -1694129533 * client.anInt7297 == 0)
					Class109.method1858(Class401.aClass118_4825, (byte) -103);
			}
		}
	}

	public static void method13790(Class282_Sub43 class282_sub43, int i) {
		Class400.method6794(class282_sub43, 200000, (byte) 44);
	}
}
