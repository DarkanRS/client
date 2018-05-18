/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class76 {
	public int anInt748;
	public static Class76 aClass76_749;
	static Class76 aClass76_750;
	public static Class76 aClass76_751;
	public static Class76 aClass76_752;
	static Class76 aClass76_753 = new Class76(6, 1);
	static Class76 aClass76_754;
	public static Class76 aClass76_755;
	static Class76 aClass76_756 = new Class76(0, 2);
	public int anInt757;
	public static Class76 aClass76_758;

	Class76(int i, int i_0_) {
		anInt757 = i * 968808761;
		anInt748 = i_0_ * -704130985;
	}

	static {
		aClass76_750 = new Class76(7, 4);
		aClass76_751 = new Class76(4, 1);
		aClass76_752 = new Class76(5, 2);
		aClass76_749 = new Class76(1, 3);
		aClass76_754 = new Class76(2, 4);
		aClass76_755 = new Class76(8, 2);
		aClass76_758 = new Class76(3, 4);
	}

	static int method1356(int i, int i_1_, int i_2_) {
		double d = Math.log(i_1_) / Math.log(2.0);
		double d_3_ = Math.log(i) / Math.log(2.0);
		double d_4_ = Math.random() * (d - d_3_) + d_3_;
		return (int) (Math.pow(2.0, d_4_) + 0.5);
	}

	static final void method1357(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class96_Sub1.anInt8307 * -993852069;
	}

	public static String method1358(int i, byte i_5_) {
		return new StringBuilder().append("<img=").append(i).append(">").toString();
	}

	static int method1359(byte i) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub25_8206.method12926((byte) 1) == 0) {
			for (int i_6_ = 0; i_6_ < client.anInt7193 * -1911445195; i_6_++) {
				if ((client.anInterface16Array7154[i_6_].method118(-469731478) == 's') || client.anInterface16Array7154[i_6_].method118(-1315201556) == 'S') {
					Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub25_8206, 1, -821310033);
					client.aBool7155 = true;
					break;
				}
			}
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4697) {
			if (Class468_Sub9.aClass309_7896 == null) {
				Class468_Sub9.aClass309_7896 = new Class309(Class119.aClass312_1462, Class443.aClass313_5376, Class18.UPDATE_SERVER_EXPONENT, Class18.UPDATE_SERVER_MODULUS);
			}
			if (!Class468_Sub9.aClass309_7896.method5476((byte) -44)) {
				return 0;
			}
			Class282_Sub17_Sub1.method15402(0, null, true, 1056006027);
			Class339.aBool3987 = !NodeCollection.method8145(-1882809257);
			Class408.aClass317_4853 = AnimationDefinitions.method11146((Class339.aBool3987 ? Class102.aClass102_1051 : Class102.aClass102_1049), false, 1, true, -60148418);
			Class186.aClass317_2347 = AnimationDefinitions.method11146(Class102.aClass102_1050, false, 1, true, 702387195);
			Class410.aClass317_4924 = AnimationDefinitions.method11146(Class102.aClass102_1034, false, 1, true, -1748846681);
		}
		if (Class387.aClass387_4695 == Class474.aClass387_5621) {
			boolean bool = Class186.aClass317_2347.method5612((byte) 25);
			int i_7_ = Class492.aClass327_Sub1Array5777[Class102.aClass102_1050.method1781(-1788134814)].method12543(-1386827058);
			i_7_ = (i_7_ + Class492.aClass327_Sub1Array5777[(Class339.aBool3987 ? Class102.aClass102_1051.method1781(-1812792223) : Class102.aClass102_1049.method1781(-1188170232))].method12543(-1418980679));
			i_7_ += Class492.aClass327_Sub1Array5777[Class102.aClass102_1034.method1781(308835858)].method12543(-1132280394);
			i_7_ = i_7_ + (bool ? 100 : Class186.aClass317_2347.method5614(-1834183892));
			if (i_7_ != 400) {
				return i_7_ / 4;
			}
			Class96_Sub10_Sub1.anInt10159 = Class408.aClass317_4853.method5602(2065022912) * -1509668177;
			Class302.anInt3561 = Class186.aClass317_2347.method5602(2109219152) * 1439418903;
			Class477.method7960(Class408.aClass317_4853, (byte) -12);
			int i_8_ = Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -106);
			Class275_Sub7.aClass400_7862 = new Class400(client.aClass486_7450, Class223.aClass495_2772, Class186.aClass317_2347);
			Class399[] class399s = Class275_Sub7.aClass400_7862.method6786(i_8_, -1983202433);
			if (0 == class399s.length) {
				class399s = Class275_Sub7.aClass400_7862.method6786(0, 462233129);
			}
			Class29 class29 = new Class29(Class408.aClass317_4853, Class410.aClass317_4924);
			if (class399s.length > 0) {
				Class302.anInterface27Array3559 = new Interface27[class399s.length];
				for (int i_9_ = 0; i_9_ < Class302.anInterface27Array3559.length; i_9_++) {
					Class302.anInterface27Array3559[i_9_] = new Class299((Class275_Sub7.aClass400_7862.method6785(class399s[i_9_].anInt4814 * -87203297, 1258078414)), class399s[i_9_].anInt4815 * -811216011, -1604669349 * class399s[i_9_].anInt4816, class29);
				}
			}
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4696) {
			Class487.aClass378_5752 = new Class378(Class408.aClass317_4853, Class410.aClass317_4924, Class52_Sub3.method14522(-388253830));
		}
		if (Class387.aClass387_4702 == Class474.aClass387_5621) {
			int i_10_ = Class487.aClass378_5752.method6404(253897692);
			int i_11_ = Class487.aClass378_5752.method6422(-1970261338);
			if (i_10_ < i_11_) {
				return i_10_ * 100 / i_11_;
			}
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4708) {
			if (Class302.anInterface27Array3559 != null && Class302.anInterface27Array3559.length > 0) {
				if (Class302.anInterface27Array3559[0].method191(-155060841) < 100) {
					return 0;
				}
				if (Class302.anInterface27Array3559.length > 1 && Class275_Sub7.aClass400_7862.method6790(906509340) && Class302.anInterface27Array3559[1].method191(1471914500) < 100) {
					return 0;
				}
			}
			Class487.aClass378_5752.method6403(client.anInterface35_7206, (short) 255);
			Class282_Sub11_Sub3.method15476(Class316.aClass505_3680, 425996443);
			Class365.method6298(15, 1025544676);
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4699) {
			Class211.aClass317_2673 = AnimationDefinitions.method11146(Class102.aClass102_1025, false, 1, false, -131566770);
			Class282_Sub20.aClass317_7672 = AnimationDefinitions.method11146(Class102.aClass102_1019, false, 1, false, -1119187214);
			Class235.aClass317_2907 = AnimationDefinitions.method11146(Class102.aClass102_1018, false, 1, false, -344663268);
			Class282_Sub39.aClass317_8005 = AnimationDefinitions.method11146(Class102.aClass102_1046, false, 1, true, -811989560);
			Class523.aClass317_6957 = AnimationDefinitions.method11146(Class102.aClass102_1020, false, 1, true, 414319297);
			Class219.aClass317_2714 = AnimationDefinitions.method11146(Class102.aClass102_1021, false, 1, false, 473331343);
			Class149.aClass317_1745 = AnimationDefinitions.method11146(Class102.aClass102_1022, true, 1, false, -41420769);
			Class512.aClass317_5884 = AnimationDefinitions.method11146(Class102.aClass102_1023, true, 1, false, 313944634);
			Class110.aClass317_1106 = AnimationDefinitions.method11146(Class102.aClass102_1024, false, 1, false, 1432117999);
			AttributeDefault.aClass317_5340 = AnimationDefinitions.method11146(Class102.aClass102_1026, false, 1, true, 1364644888);
			Class250.aClass317_3093 = AnimationDefinitions.method11146(Class102.aClass102_1017, false, 1, false, -992072436);
			Class525.aClass317_6984 = AnimationDefinitions.method11146(Class102.aClass102_1055, false, 1, false, -740935001);
			Class378.aClass317_4526 = AnimationDefinitions.method11146(Class102.aClass102_1042, false, 1, true, 797007816);
			JS5LocalRequester.aClass317_3665 = AnimationDefinitions.method11146(Class102.aClass102_1031, false, 1, false, 401055071);
			Class211.aClass317_2674 = AnimationDefinitions.method11146(Class102.aClass102_1032, false, 1, false, -1785100744);
			Class273.aClass317_3332 = AnimationDefinitions.method11146(Class102.aClass102_1028, false, 1, true, 1541138314);
			Class236.aClass317_2915 = AnimationDefinitions.method11146(Class102.aClass102_1030, false, 1, true, -1269439350);
			Class107.aClass317_1081 = AnimationDefinitions.method11146(Class102.aClass102_1035, false, 1, true, 356368392);
			Class383.aClass317_4665 = AnimationDefinitions.method11146(Class102.aClass102_1036, false, 1, true, -272116660);
			Class235.aClass317_2908 = AnimationDefinitions.method11146(Class102.aClass102_1037, false, 1, true, 185108014);
			ReferenceTable.aClass317_3749 = AnimationDefinitions.method11146(Class102.aClass102_1027, false, 1, true, 1196463554);
			Class222.aClass317_2766 = AnimationDefinitions.method11146(Class102.aClass102_1048, false, 1, true, -1629467771);
			Class192.worldMap = AnimationDefinitions.method11146(Class102.aClass102_1040, true, 1, false, 2069423675);
			Class371.aClass317_4326 = AnimationDefinitions.method11146(Class102.aClass102_1041, false, 1, true, 255695532);
			Class329.aClass317_3861 = AnimationDefinitions.method11146(Class102.aClass102_1033, false, 1, true, -1257657517);
			NamedFileReference.aClass317_412 = AnimationDefinitions.method11146(Class102.aClass102_1043, true, 1, true, -153298152);
			Class468_Sub7.aClass317_7886 = AnimationDefinitions.method11146(Class102.aClass102_1044, false, 1, true, -756939954);
			Class520.aClass317_5935 = AnimationDefinitions.method11146(Class102.aClass102_1045, true, 1, true, -252829200);
			Class215.aClass317_2686 = AnimationDefinitions.method11146(Class102.aClass102_1038, false, 1, true, 746326631);
			Class89.aClass317_944 = AnimationDefinitions.method11146(Class102.aClass102_1052, true, 1, false, -763412524);
			Class497.aClass317_5821 = AnimationDefinitions.method11146(Class102.aClass102_1047, true, 1, false, -1315527397);
			Class488.aClass317_5758 = AnimationDefinitions.method11146(Class102.aClass102_1029, true, 1, true, -446243916);
			Class209.aClass317_2663 = AnimationDefinitions.method11146(Class102.aClass102_1053, true, 2, false, -1852858499);
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4700) {
			int i_12_ = 0;
			for (int i_13_ = 0; i_13_ < Class492.aClass327_Sub1Array5777.length; i_13_++) {
				if (Class492.aClass327_Sub1Array5777[i_13_] != null) {
					i_12_ += (Class492.aClass327_Sub1Array5777[i_13_].method12543(-1380150804) * Class302.anIntArray3558[i_13_] / 100);
				}
			}
			if (i_12_ != 100) {
				if (-1474947065 * Class302.anInt3564 < 0) {
					Class302.anInt3564 = 1146213815 * i_12_;
				}
				return ((i_12_ - Class302.anInt3564 * -1474947065) * 100 / (100 - Class302.anInt3564 * -1474947065));
			}
			Class468_Sub20.method12806(Class211.aClass317_2673, (byte) -64);
			Class487.aClass378_5752 = new Class378(Class211.aClass317_2673, Class410.aClass317_4924, Class52_Sub3.method14522(-388253830));
		}
		if (Class387.aClass387_4717 == Class474.aClass387_5621) {
			byte[] is = Class520.aClass317_5935.method5615(((Class524.aClass524_6962.anInt6966) * -1719912253), -176752755);
			if (is == null) {
				return 0;
			}
			Class89.method1496(is, -164492309);
			NodeCollection.method8148((byte) 4);
			Class365.method6298(1, 1855105859);
		}
		if (Class387.aClass387_4709 == Class474.aClass387_5621) {
			Class47_Sub1.aClass262_9143 = new Class262(Class497.aClass317_5821);
			Class159.method2740(Class47_Sub1.aClass262_9143, 1544888001);
		}
		if (Class387.aClass387_4716 == Class474.aClass387_5621) {
			int i_14_ = Class461.method7702(-1152427430);
			if (i_14_ < 100) {
				return i_14_;
			}
			Class358.method6235((Class520.aClass317_5935.method5615((-1719912253 * Class524.aClass524_6960.anInt6966), -1241129078)), (byte) -81);
			Class58.aClass529_527 = new Class529(Class520.aClass317_5935);
			AbstractQueue_Sub1.aShortArrayArray10068 = Class58.aClass529_527.aShortArrayArray7039;
			Class366.aShortArrayArrayArray4232 = Class58.aClass529_527.aShortArrayArrayArray7040;
			if (-1 != Class58.aClass529_527.anInt7045 * 1965360767 && -1 != 2007534195 * Class58.aClass529_527.anInt7046) {
				client.anInt7439 = -406576707 * Class58.aClass529_527.anInt7045;
				client.anInt7312 = 981526077 * Class58.aClass529_527.anInt7046;
			}
			Class473.aClass526_5605 = new Class526(Class520.aClass317_5935);
			Class149_Sub2.aClass511_9314 = new Class511(Class520.aClass317_5935);
			Class282_Sub13.aClass519_7588 = new Class519(Class520.aClass317_5935);
		}
		if (Class387.aClass387_4704 == Class474.aClass387_5621) {
			if (-1878247413 * Class58.aClass529_527.anInt7034 != -1 && !Class110.aClass317_1106.method5688((-1878247413 * (Class58.aClass529_527.anInt7034)), 0, 16711935)) {
				return 99;
			}
			Class321.anInterface22_3731 = new Class323(NamedFileReference.aClass317_412, AttributeDefault.aClass317_5340, Class211.aClass317_2673);
			Class125.aClass424_1573 = new Class424(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class96_Sub16.aClass211_9383 = new Class211(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005, Class473.aClass526_5605);
			Class468_Sub23.aClass438_7932 = new Class438(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005, Class211.aClass317_2673);
			Class466.aClass444_5570 = new Class444(client.aClass486_7450, Class223.aClass495_2772, Class236.aClass317_2915);
			Class122.aClass536_1535 = new Class536(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class493.aClass479_5778 = new Class479(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Login.aClass210_3389 = new Class210(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005, Class211.aClass317_2673);
			Class286.aClass290_3402 = new Class290(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005, Class211.aClass317_2673);
			Class20.aClass31_204 = new Class31(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005, Class110.aClass317_1106);
			Class96_Sub10.aClass392_9298 = new Class392(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class282_Sub23.aClass436_7683 = new Class436(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class96_Sub4.aClass474_8524 = new Class474(client.aClass486_7450, Class223.aClass495_2772, true, Class273.aClass317_3332, Class110.aClass317_1106);
			client.aClass257_7353.method4442(Class96_Sub4.aClass474_8524, -834443097);
			Class6.aClass340_45.method6062(new Class474(client.aClass486_7450, Class223.aClass495_2772, true, Class273.aClass317_3332, Class110.aClass317_1106), -375345213);
			Class397.aClass218_4813 = new Class218(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005, Class211.aClass317_2673);
			Class97.aClass427_995 = new Class427(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005, Class211.aClass317_2673);
			Class350_Sub1.aClass406_7757 = new Class406(client.aClass486_7450, Class223.aClass495_2772, true, Class107.aClass317_1081, Class110.aClass317_1106);
			Class119.aClass426_1463 = new Class426(client.aClass486_7450, Class223.aClass495_2772, true, Class125.aClass424_1573, Class383.aClass317_4665, Class110.aClass317_1106);
			Class409.aClass242_4922 = new Class242(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005, true);
			Class330.aClass523_3868 = new Class523(client.aClass486_7450, Class223.aClass495_2772, Class235.aClass317_2908, Class282_Sub20.aClass317_7672, Class235.aClass317_2907);
			Class149.aClass288_1746 = new Class288(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class488.aClass45_5759 = new Class45(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class96_Sub20.aClass515_9416 = new Class515(client.aClass486_7450, Class223.aClass495_2772, ReferenceTable.aClass317_3749, Class110.aClass317_1106);
			Class207.aClass421_2658 = new Class421(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005, true);
			Class396.aClass401_4791 = new Class401(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			client.aClass408_7207 = new Class408(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class16.aClass230_147 = new Class230(client.aClass486_7450, Class223.aClass495_2772, Class222.aClass317_2766);
			Class104.aClass377_1065 = new Class377(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class45.aClass447_435 = new Class447(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class243.aClass498_3001 = new Class498(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class502.aClass394_5831 = new Class394(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class497.aClass233_5822 = new Class233(client.aClass486_7450, Class223.aClass495_2772, Class282_Sub39.aClass317_8005);
			Class403.method6803(Class523.aClass317_6957, Class110.aClass317_1106, Class211.aClass317_2673, Class410.aClass317_4924, 78858918);
			JS5StandardRequester.method5559(Class215.aClass317_2686, -1845335453);
			Class296.aClass331_3535 = new Class331(Class223.aClass495_2772, Class371.aClass317_4326, Class329.aClass317_3861);
			Class368.aClass429_4265 = new Class429(Class223.aClass495_2772, Class371.aClass317_4326, Class329.aClass317_3861, new Class58());
			Class158_Sub1.aClass3_8507 = new Class3();
			Class94.method1589((short) 255);
			Class77.method1369(Class330.aClass523_3868, 1486901897);
			Class62.method1261(Class468_Sub7.aClass317_7886, (byte) -73);
			Class173.method2943(Class110.aClass317_1106, Class321.anInterface22_3731, 16711680);
			Class117 class117 = new Class117(Class250.aClass317_3093.method5626("huffman", "", (byte) 1));
			Class392.method6740(class117, -1608458297);
			Class263.aClass273_3244 = Class84.method1461(192179911);
			Class11.aClass282_Sub51_124 = new Class282_Sub51(true);
		}
		if (Class387.aClass387_4705 == Class474.aClass387_5621) {
			int i_15_ = (Class59.method1159(Class211.aClass317_2673, -1920163258) + Class487.aClass378_5752.method6405(true, 1940883220));
			int i_16_ = (Class109_Sub1.method14651(-2091974733) + Class487.aClass378_5752.method6422(-167054108));
			if (i_15_ < i_16_) {
				return 100 * i_15_ / i_16_;
			}
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4706) {
			Class291.method5125(Class192.worldMap, Class122.aClass536_1535, Class493.aClass479_5778, client.aClass257_7353.method4436(-2053638412), Class397.aClass218_4813, Class97.aClass427_995, Class158_Sub1.aClass3_8507);
		}
		if (Class387.aClass387_4707 == Class474.aClass387_5621) {
			Class320.anIntArray3724 = new int[-1719166449 * client.aClass408_7207.anInt4851];
			Class282_Sub17_Sub2.aBoolArray9934 = new boolean[client.aClass408_7207.anInt4851 * -1719166449];
			Class462.aStringArray5548 = new String[-1873030137 * Class396.aClass401_4791.anInt4823];
			for (int i_17_ = 0; i_17_ < -1719166449 * client.aClass408_7207.anInt4851; i_17_++) {
				if ((client.aClass408_7207.method6873(i_17_, (byte) 124).anInt4983) * -1037642941 == 0) {
					Class282_Sub17_Sub2.aBoolArray9934[i_17_] = true;
					client.anInt7399 += 1707039013;
				}
				Class320.anIntArray3724[i_17_] = -1;
			}
			Class152.method2596((byte) -103);
			Class149.aClass317_1745.method5676(false, true, (byte) 8);
			Class512.aClass317_5884.method5676(true, true, (byte) 8);
			Class211.aClass317_2673.method5676(true, true, (byte) 8);
			Class410.aClass317_4924.method5676(true, true, (byte) 8);
			Class250.aClass317_3093.method5676(true, true, (byte) 8);
			client.aBool7219 = true;
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4713) {
			if (!Class456_Sub3.method12682((Class58.aClass529_527.anInt7036 * 376713291), null, -402984376)) {
				return 0;
			}
			boolean bool = true;
			for (int i_18_ = 0; i_18_ < (Class468_Sub8.aClass98Array7889[Class58.aClass529_527.anInt7036 * 376713291].aClass118Array998).length; i_18_++) {
				Class118 class118 = (Class468_Sub8.aClass98Array7889[376713291 * Class58.aClass529_527.anInt7036].aClass118Array998[i_18_]);
				if (-2131393857 * class118.anInt1268 == 5 && 985215637 * class118.anInt1320 != -1 && !Class211.aClass317_2673.method5688((class118.anInt1320 * 985215637), 0, 16711935)) {
					bool = false;
				}
			}
			if (!bool) {
				return 0;
			}
		}
		if (Class387.aClass387_4698 == Class474.aClass387_5621) {
			Class348.method6175(true, -1140561340);
		}
		if (Class387.aClass387_4710 == Class474.aClass387_5621) {
			Class328.aClass306_3771.method5437(1971285079);
			try {
				Class377.aThread4520.join();
			} catch (InterruptedException interruptedexception) {
				return 0;
			}
			Class328.aClass306_3771 = null;
			Class377.aThread4520 = null;
			Class408.aClass317_4853 = null;
			Class186.aClass317_2347 = null;
			Class275_Sub7.aClass400_7862 = null;
			Class302.anInterface27Array3559 = null;
			Class358.method6234((byte) 120);
			client.aBool7465 = Class393.aClass282_Sub54_4783.aClass468_Sub25_8206.method12926((byte) -77) == 1;
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub25_8206), 1, -425362702);
			if (client.aBool7465) {
				Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub18_8214, 0, 2109366156);
			} else if ((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.aBool7914) && -79546877 * Class11.aClass282_Sub51_124.anInt8167 < 512 && 0 != -79546877 * Class11.aClass282_Sub51_124.anInt8167) {
				Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub18_8214, 0, -28181047);
			}
			Class190.method3148((byte) 125);
			if (client.aBool7465) {
				Class538.method11500(0, false, (byte) 24);
			} else {
				Class538.method11500(Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method12776(2116214746), false, (byte) 24);
			}
			Class440.method7373(Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-2050547783), -1, -1, false, (byte) 65);
			Class487.aClass378_5752.method6403(client.anInterface35_7206, (short) 255);
			Class282_Sub11_Sub3.method15476(Class316.aClass505_3680, -2058774683);
			Class188.method3139(Class316.aClass505_3680, Class211.aClass317_2673, -814245885);
			Class122.method2109(Class182.aClass160Array2261, (byte) -7);
		}
		return Class152.method2604((byte) 3);
	}

	public static void method1360(String string, boolean bool, byte i) {
		string = string.toLowerCase();
		short[] is = new short[16];
		int i_19_ = 0;
		int i_20_ = bool ? 32768 : 0;
		int i_21_ = ((bool ? Class368.aClass429_4265.anInt5133 * 748884943 : Class368.aClass429_4265.anInt5130 * 1033695499) + i_20_);
		for (int i_22_ = i_20_; i_22_ < i_21_; i_22_++) {
			Class282_Sub50_Sub9 class282_sub50_sub9 = Class368.aClass429_4265.method7214(i_22_, -1918466805);
			if (class282_sub50_sub9.aBool9628 && class282_sub50_sub9.method14898(409119349).toLowerCase().indexOf(string) != -1) {
				if (i_19_ >= 50) {
					Class415.anInt4985 = -1978366005;
					Class308.aShortArray3621 = null;
					return;
				}
				if (i_19_ >= is.length) {
					short[] is_23_ = new short[2 * is.length];
					for (int i_24_ = 0; i_24_ < i_19_; i_24_++) {
						is_23_[i_24_] = is[i_24_];
					}
					is = is_23_;
				}
				is[i_19_++] = (short) i_22_;
			}
		}
		Class308.aShortArray3621 = is;
		Class283.anInt3384 = 0;
		Class415.anInt4985 = i_19_ * 1978366005;
		String[] strings = new String[560339485 * Class415.anInt4985];
		for (int i_25_ = 0; i_25_ < 560339485 * Class415.anInt4985; i_25_++) {
			strings[i_25_] = Class368.aClass429_4265.method7214(is[i_25_], -1792601455).method14898(-47369611);
		}
		Class100.method1644(strings, Class308.aShortArray3621, (short) 30307);
	}

	public static void method1361(byte i) {
		Class96.method1607((byte) 74);
		Class115.aClass160Array1248 = null;
	}

	static final void method1362(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_26_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_27_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class368.aClass429_4265.method7214(i_26_, -2012754494).anIntArray9624[i_27_]);
	}
}
