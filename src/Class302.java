
/* Class302 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class302 {
	static Class387[] aClass387Array3557;
	static int[] anIntArray3558 = { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };
	static Interface27[] anInterface27Array3559;
	static int anInt3560 = -432660167;
	static int anInt3561;
	static long aLong3562;
	static int anInt3563;
	static int anInt3564 = -1146213815;

	static void method5336(RsByteBuffer class282_sub35) {
		if ((class282_sub35.buffer.length - -1990677291 * class282_sub35.index) >= 1) {
			int i = class282_sub35.readUnsignedByte();
			if (i >= 0 && i <= 1 && (class282_sub35.buffer.length - -1990677291 * class282_sub35.index) >= 2) {
				int i_0_ = class282_sub35.readUnsignedShort();
				if ((class282_sub35.buffer.length - -1990677291 * class282_sub35.index) >= 6 * i_0_) {
					for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
						int i_2_ = class282_sub35.readUnsignedShort();
						int i_3_ = class282_sub35.readInt();
						if (i_2_ < Class320.anIntArray3724.length && Class282_Sub17_Sub2.aBoolArray9934[i_2_] && ((client.aClass408_7207.method6873(i_2_, (byte) 125).aChar4984) != '1' || i_3_ >= -1 && i_3_ <= 1))
							Class320.anIntArray3724[i_2_] = i_3_;
					}
				}
			}
		}
	}

	Class302() throws Throwable {
		throw new Error();
	}

	public static void method5337() {
		if (null == aClass387Array3557) {
			aClass387Array3557 = Class387.method6676(926734878);
			Class474.aClass387_5621 = aClass387Array3557[0];
			aLong3562 = Class169.method2869(1934213215) * -5491689582512610839L;
		}
		if (Class328.aClass306_3771 == null)
			Class165.method2852(633516668);
		Class387 class387 = Class474.aClass387_5621;
		int i = Class76.method1359((byte) 104);
		if (Class474.aClass387_5621 == class387) {
			Class380.aString4636 = ((Class387) Class474.aClass387_5621).aClass433_4711.method7273(Class223.aClass495_2772, -1263971246);
			if (((Class387) Class474.aClass387_5621).aBool4718)
				anInt3563 = (-1332863859 * (((586831783 * ((Class387) Class474.aClass387_5621).anInt4703) - (((Class387) Class474.aClass387_5621).anInt4715 * 2033966327)) * i / 100 + 2033966327 * (((Class387) Class474.aClass387_5621).anInt4715)));
			if (((Class387) Class474.aClass387_5621).aBool4694)
				Class380.aString4636 = new StringBuilder().append(Class380.aString4636).append(-723319227 * anInt3563).append("%").toString();
		} else if (Class474.aClass387_5621 == Class387.aClass387_4701) {
			Class328.aClass306_3771 = null;
			Class365.method6298(5, 1090704318);
		} else {
			Class380.aString4636 = ((Class387) class387).aClass433_4714.method7273(Class223.aClass495_2772, -1887797347);
			if (((Class387) Class474.aClass387_5621).aBool4694)
				Class380.aString4636 = new StringBuilder().append(Class380.aString4636).append(((Class387) class387).anInt4703 * 586831783).append("%").toString();
			anInt3563 = ((Class387) class387).anInt4703 * 337283835;
			if (((Class387) Class474.aClass387_5621).aBool4718 || ((Class387) class387).aBool4718)
				aLong3562 = Class169.method2869(1980274162) * -5491689582512610839L;
		}
		if (null != Class328.aClass306_3771) {
			Class328.aClass306_3771.method5422((5158573110282126937L * aLong3562), Class380.aString4636, -723319227 * anInt3563, Class474.aClass387_5621, 801780911);
			if (null != anInterface27Array3559) {
				for (int i_4_ = 1 + 1461682935 * anInt3560; i_4_ < anInterface27Array3559.length; i_4_++) {
					if ((anInterface27Array3559[i_4_].method191(251227496) >= 100) && anInt3560 * 1461682935 == i_4_ - 1 && 4 != -1741204137 * client.anInt7166 && Class328.aClass306_3771.method5450(1858715298)) {
						try {
							anInterface27Array3559[i_4_].method161(-1145558933);
						} catch (Exception exception) {
							anInterface27Array3559 = null;
							break;
						}
						Class328.aClass306_3771.method5445(anInterface27Array3559[i_4_], (byte) 16);
						anInt3560 += 432660167;
						if ((anInt3560 * 1461682935 >= anInterface27Array3559.length - 1) && anInterface27Array3559.length > 1)
							anInt3560 = (Class275_Sub7.aClass400_7862.method6790(-1385544053) ? 0 : -1) * 432660167;
					}
				}
			}
		}
	}

	public static void method5338() {
		if (null == aClass387Array3557) {
			aClass387Array3557 = Class387.method6676(926734878);
			Class474.aClass387_5621 = aClass387Array3557[0];
			aLong3562 = Class169.method2869(1791286749) * -5491689582512610839L;
		}
		if (Class328.aClass306_3771 == null)
			Class165.method2852(-1206200411);
		Class387 class387 = Class474.aClass387_5621;
		int i = Class76.method1359((byte) 77);
		if (Class474.aClass387_5621 == class387) {
			Class380.aString4636 = ((Class387) Class474.aClass387_5621).aClass433_4711.method7273(Class223.aClass495_2772, -1719061577);
			if (((Class387) Class474.aClass387_5621).aBool4718)
				anInt3563 = (-1332863859 * (((586831783 * ((Class387) Class474.aClass387_5621).anInt4703) - (((Class387) Class474.aClass387_5621).anInt4715 * 2033966327)) * i / 100 + 2033966327 * (((Class387) Class474.aClass387_5621).anInt4715)));
			if (((Class387) Class474.aClass387_5621).aBool4694)
				Class380.aString4636 = new StringBuilder().append(Class380.aString4636).append(-723319227 * anInt3563).append("%").toString();
		} else if (Class474.aClass387_5621 == Class387.aClass387_4701) {
			Class328.aClass306_3771 = null;
			Class365.method6298(5, 1801458204);
		} else {
			Class380.aString4636 = ((Class387) class387).aClass433_4714.method7273(Class223.aClass495_2772, -1586213516);
			if (((Class387) Class474.aClass387_5621).aBool4694)
				Class380.aString4636 = new StringBuilder().append(Class380.aString4636).append(((Class387) class387).anInt4703 * 586831783).append("%").toString();
			anInt3563 = ((Class387) class387).anInt4703 * 337283835;
			if (((Class387) Class474.aClass387_5621).aBool4718 || ((Class387) class387).aBool4718)
				aLong3562 = Class169.method2869(1766579412) * -5491689582512610839L;
		}
		if (null != Class328.aClass306_3771) {
			Class328.aClass306_3771.method5422((5158573110282126937L * aLong3562), Class380.aString4636, -723319227 * anInt3563, Class474.aClass387_5621, -378122633);
			if (null != anInterface27Array3559) {
				for (int i_5_ = 1 + 1461682935 * anInt3560; i_5_ < anInterface27Array3559.length; i_5_++) {
					if ((anInterface27Array3559[i_5_].method191(-749349527) >= 100) && anInt3560 * 1461682935 == i_5_ - 1 && 4 != -1741204137 * client.anInt7166 && Class328.aClass306_3771.method5450(1819597805)) {
						try {
							anInterface27Array3559[i_5_].method161(-1145558933);
						} catch (Exception exception) {
							anInterface27Array3559 = null;
							break;
						}
						Class328.aClass306_3771.method5445(anInterface27Array3559[i_5_], (byte) -19);
						anInt3560 += 432660167;
						if ((anInt3560 * 1461682935 >= anInterface27Array3559.length - 1) && anInterface27Array3559.length > 1)
							anInt3560 = (Class275_Sub7.aClass400_7862.method6790(567989909) ? 0 : -1) * 432660167;
					}
				}
			}
		}
	}

	static void method5339(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			if (i == 1) {
				int[] is_6_ = Class210.anIntArray2668 = new int[6];
				is_6_[0] = class282_sub35.readUnsignedShort();
				is_6_[1] = class282_sub35.readUnsignedShort();
				is_6_[2] = class282_sub35.readUnsignedShort();
				is_6_[3] = class282_sub35.readUnsignedShort();
				is_6_[4] = class282_sub35.readUnsignedShort();
				is_6_[5] = class282_sub35.readUnsignedShort();
			}
		}
	}

	static void method5340() {
		if (null != Class474.aClass387_5621) {
			Class328.aClass306_3771 = new Class306();
			Class328.aClass306_3771.method5422(5158573110282126937L * aLong3562, ((Class387) Class474.aClass387_5621).aClass433_4711.method7273(Class223.aClass495_2772, -575849982), ((Class387) Class474.aClass387_5621).anInt4715 * 2033966327, Class474.aClass387_5621, -233814825);
			Class377.aThread4520 = new Thread(Class328.aClass306_3771, "");
			Class377.aThread4520.start();
		}
	}

	static void method5341() {
		if (null != Class474.aClass387_5621) {
			Class328.aClass306_3771 = new Class306();
			Class328.aClass306_3771.method5422(5158573110282126937L * aLong3562, ((Class387) Class474.aClass387_5621).aClass433_4711.method7273(Class223.aClass495_2772, -483404764), ((Class387) Class474.aClass387_5621).anInt4715 * 2033966327, Class474.aClass387_5621, 1827564798);
			Class377.aThread4520 = new Thread(Class328.aClass306_3771, "");
			Class377.aThread4520.start();
		}
	}

	static void method5342() {
		if (null != Class474.aClass387_5621) {
			Class328.aClass306_3771 = new Class306();
			Class328.aClass306_3771.method5422(5158573110282126937L * aLong3562, ((Class387) Class474.aClass387_5621).aClass433_4711.method7273(Class223.aClass495_2772, -233108189), ((Class387) Class474.aClass387_5621).anInt4715 * 2033966327, Class474.aClass387_5621, -764968781);
			Class377.aThread4520 = new Thread(Class328.aClass306_3771, "");
			Class377.aThread4520.start();
		}
	}

	public static int method5343() {
		return Class96_Sub10_Sub1.anInt10159 * 1439648847;
	}

	public static int method5344() {
		return Class328.aClass306_3771.method5418(-1227341997);
	}

	public static void method5345() {
		if (null != Class328.aClass306_3771)
			Class328.aClass306_3771.method5437(-1300760614);
		if (Class377.aThread4520 != null) {
			for (;;) {
				try {
					Class377.aThread4520.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	static int method5346() {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub25_8206.method12926((byte) -22) == 0) {
			for (int i = 0; i < client.anInt7193 * -1911445195; i++) {
				if ((client.anInterface16Array7154[i].method118(-1115697676) == 's') || (client.anInterface16Array7154[i].method118(6547339) == 'S')) {
					Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub25_8206, 1, -1193443688);
					client.aBool7155 = true;
					break;
				}
			}
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4697) {
			if (Class468_Sub9.aClass309_7896 == null)
				Class468_Sub9.aClass309_7896 = new Class309(Class119.aClass312_1462, Class443.aClass313_5376, Class18.UPDATE_SERVER_EXPONENT, Class18.UPDATE_SERVER_MODULUS);
			if (!Class468_Sub9.aClass309_7896.method5476((byte) -114))
				return 0;
			Class282_Sub17_Sub1.method15402(0, null, true, 971180544);
			Class339.aBool3987 = !NodeCollection.method8145(-97827184);
			Class408.aClass317_4853 = AnimationDefinitions.method11146((Class339.aBool3987 ? Class102.aClass102_1051 : Class102.aClass102_1049), false, 1, true, 1553230491);
			Class186.aClass317_2347 = AnimationDefinitions.method11146(Class102.aClass102_1050, false, 1, true, 1037988232);
			Class410.aClass317_4924 = AnimationDefinitions.method11146(Class102.aClass102_1034, false, 1, true, 34985090);
		}
		if (Class387.aClass387_4695 == Class474.aClass387_5621) {
			boolean bool = Class186.aClass317_2347.method5612((byte) 62);
			int i = Class492.aClass327_Sub1Array5777[Class102.aClass102_1050.method1781(-730665964)].method12543(277308192);
			i = i + Class492.aClass327_Sub1Array5777[(Class339.aBool3987 ? Class102.aClass102_1051.method1781(1155988034) : Class102.aClass102_1049.method1781(-473472553))].method12543(-1653562513);
			i += Class492.aClass327_Sub1Array5777[Class102.aClass102_1034.method1781(-2013178367)].method12543(-1297794225);
			i = i + (bool ? 100 : Class186.aClass317_2347.method5614(2086483483));
			if (i != 400)
				return i / 4;
			Class96_Sub10_Sub1.anInt10159 = Class408.aClass317_4853.method5602(2055756743) * -1509668177;
			anInt3561 = Class186.aClass317_2347.method5602(2109583269) * 1439418903;
			Class477.method7960(Class408.aClass317_4853, (byte) -58);
			int i_7_ = Class393.aClass282_Sub54_4783.aClass468_Sub11_8217.method12699((byte) -112);
			Class275_Sub7.aClass400_7862 = new Class400(client.aClass486_7450, Class223.aClass495_2772, Class186.aClass317_2347);
			Class399[] class399s = Class275_Sub7.aClass400_7862.method6786(i_7_, -942565481);
			if (0 == class399s.length)
				class399s = Class275_Sub7.aClass400_7862.method6786(0, -1583549475);
			Class29 class29 = new Class29(Class408.aClass317_4853, Class410.aClass317_4924);
			if (class399s.length > 0) {
				anInterface27Array3559 = new Interface27[class399s.length];
				for (int i_8_ = 0; i_8_ < anInterface27Array3559.length; i_8_++)
					anInterface27Array3559[i_8_] = new Class299((Class275_Sub7.aClass400_7862.method6785(class399s[i_8_].anInt4814 * -87203297, 1941829952)), class399s[i_8_].anInt4815 * -811216011, -1604669349 * class399s[i_8_].anInt4816, class29);
			}
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4696)
			Class487.aClass378_5752 = new Class378(Class408.aClass317_4853, Class410.aClass317_4924, Class52_Sub3.method14522(-388253830));
		if (Class387.aClass387_4702 == Class474.aClass387_5621) {
			int i = Class487.aClass378_5752.method6404(560593482);
			int i_9_ = Class487.aClass378_5752.method6422(-1100987530);
			if (i < i_9_)
				return i * 100 / i_9_;
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4708) {
			if (anInterface27Array3559 != null && anInterface27Array3559.length > 0) {
				if (anInterface27Array3559[0].method191(1393529777) < 100)
					return 0;
				if (anInterface27Array3559.length > 1 && Class275_Sub7.aClass400_7862.method6790(-621955085) && anInterface27Array3559[1].method191(655159990) < 100)
					return 0;
			}
			Class487.aClass378_5752.method6403(client.anInterface35_7206, (short) 255);
			Class282_Sub11_Sub3.method15476(Class316.aClass505_3680, 988746289);
			Class365.method6298(15, 1028627727);
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4699) {
			Class211.aClass317_2673 = AnimationDefinitions.method11146(Class102.aClass102_1025, false, 1, false, 282392678);
			Class282_Sub20.aClass317_7672 = AnimationDefinitions.method11146(Class102.aClass102_1019, false, 1, false, -513763809);
			Class235.aClass317_2907 = AnimationDefinitions.method11146(Class102.aClass102_1018, false, 1, false, -286231348);
			Class282_Sub39.aClass317_8005 = AnimationDefinitions.method11146(Class102.aClass102_1046, false, 1, true, 964243382);
			Class523.aClass317_6957 = AnimationDefinitions.method11146(Class102.aClass102_1020, false, 1, true, -245752257);
			Class219.aClass317_2714 = AnimationDefinitions.method11146(Class102.aClass102_1021, false, 1, false, -277827356);
			Class149.aClass317_1745 = AnimationDefinitions.method11146(Class102.aClass102_1022, true, 1, false, -254043283);
			Class512.aClass317_5884 = AnimationDefinitions.method11146(Class102.aClass102_1023, true, 1, false, 2002596217);
			Class110.aClass317_1106 = AnimationDefinitions.method11146(Class102.aClass102_1024, false, 1, false, 1451274103);
			AttributeDefault.aClass317_5340 = AnimationDefinitions.method11146(Class102.aClass102_1026, false, 1, true, -177273028);
			Class250.aClass317_3093 = AnimationDefinitions.method11146(Class102.aClass102_1017, false, 1, false, -278631357);
			Class525.aClass317_6984 = AnimationDefinitions.method11146(Class102.aClass102_1055, false, 1, false, 1058113734);
			Class378.aClass317_4526 = AnimationDefinitions.method11146(Class102.aClass102_1042, false, 1, true, -121816629);
			JS5LocalRequester.aClass317_3665 = AnimationDefinitions.method11146(Class102.aClass102_1031, false, 1, false, 1109601608);
			Class211.aClass317_2674 = AnimationDefinitions.method11146(Class102.aClass102_1032, false, 1, false, -719322510);
			Class273.aClass317_3332 = AnimationDefinitions.method11146(Class102.aClass102_1028, false, 1, true, -616703642);
			Class236.aClass317_2915 = AnimationDefinitions.method11146(Class102.aClass102_1030, false, 1, true, -785918901);
			Class107.aClass317_1081 = AnimationDefinitions.method11146(Class102.aClass102_1035, false, 1, true, -926603011);
			Class383.aClass317_4665 = AnimationDefinitions.method11146(Class102.aClass102_1036, false, 1, true, 1362380659);
			Class235.aClass317_2908 = AnimationDefinitions.method11146(Class102.aClass102_1037, false, 1, true, 2080212471);
			ReferenceTable.aClass317_3749 = AnimationDefinitions.method11146(Class102.aClass102_1027, false, 1, true, 1220933974);
			Class222.aClass317_2766 = AnimationDefinitions.method11146(Class102.aClass102_1048, false, 1, true, 684448795);
			Class192.worldMap = AnimationDefinitions.method11146(Class102.aClass102_1040, true, 1, false, -618304246);
			Class371.aClass317_4326 = AnimationDefinitions.method11146(Class102.aClass102_1041, false, 1, true, -1930774047);
			Class329.aClass317_3861 = AnimationDefinitions.method11146(Class102.aClass102_1033, false, 1, true, -1317691239);
			NamedFileReference.aClass317_412 = AnimationDefinitions.method11146(Class102.aClass102_1043, true, 1, true, 895397431);
			Class468_Sub7.aClass317_7886 = AnimationDefinitions.method11146(Class102.aClass102_1044, false, 1, true, 1897441104);
			Class520.aClass317_5935 = AnimationDefinitions.method11146(Class102.aClass102_1045, true, 1, true, 432059230);
			Class215.aClass317_2686 = AnimationDefinitions.method11146(Class102.aClass102_1038, false, 1, true, -1553884910);
			Class89.aClass317_944 = AnimationDefinitions.method11146(Class102.aClass102_1052, true, 1, false, -1785563471);
			Class497.aClass317_5821 = AnimationDefinitions.method11146(Class102.aClass102_1047, true, 1, false, 1911826090);
			Class488.aClass317_5758 = AnimationDefinitions.method11146(Class102.aClass102_1029, true, 1, true, 1161645434);
			Class209.aClass317_2663 = AnimationDefinitions.method11146(Class102.aClass102_1053, true, 2, false, 1323770642);
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4700) {
			int i = 0;
			for (int i_10_ = 0; i_10_ < Class492.aClass327_Sub1Array5777.length; i_10_++) {
				if (Class492.aClass327_Sub1Array5777[i_10_] != null)
					i += (Class492.aClass327_Sub1Array5777[i_10_].method12543(243870409) * anIntArray3558[i_10_] / 100);
			}
			if (i != 100) {
				if (-1474947065 * anInt3564 < 0)
					anInt3564 = 1146213815 * i;
				return ((i - anInt3564 * -1474947065) * 100 / (100 - anInt3564 * -1474947065));
			}
			Class468_Sub20.method12806(Class211.aClass317_2673, (byte) -109);
			Class487.aClass378_5752 = new Class378(Class211.aClass317_2673, Class410.aClass317_4924, Class52_Sub3.method14522(-388253830));
		}
		if (Class387.aClass387_4717 == Class474.aClass387_5621) {
			byte[] is = Class520.aClass317_5935.method5615(((Class524.aClass524_6962.anInt6966) * -1719912253), -1705901889);
			if (is == null)
				return 0;
			Class89.method1496(is, 981822752);
			NodeCollection.method8148((byte) 4);
			Class365.method6298(1, 1313907543);
		}
		if (Class387.aClass387_4709 == Class474.aClass387_5621) {
			Class47_Sub1.aClass262_9143 = new Class262(Class497.aClass317_5821);
			Class159.method2740(Class47_Sub1.aClass262_9143, 705777106);
		}
		if (Class387.aClass387_4716 == Class474.aClass387_5621) {
			int i = Class461.method7702(-1152427430);
			if (i < 100)
				return i;
			Class358.method6235((Class520.aClass317_5935.method5615((-1719912253 * Class524.aClass524_6960.anInt6966), -1423345740)), (byte) -28);
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
			if (-1878247413 * Class58.aClass529_527.anInt7034 != -1 && !Class110.aClass317_1106.method5688((-1878247413 * (Class58.aClass529_527.anInt7034)), 0, 16711935))
				return 99;
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
			Class6.aClass340_45.method6062(new Class474(client.aClass486_7450, Class223.aClass495_2772, true, Class273.aClass317_3332, Class110.aClass317_1106), -353788375);
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
			JS5StandardRequester.method5559(Class215.aClass317_2686, -1927947764);
			Class296.aClass331_3535 = new Class331(Class223.aClass495_2772, Class371.aClass317_4326, Class329.aClass317_3861);
			Class368.aClass429_4265 = new Class429(Class223.aClass495_2772, Class371.aClass317_4326, Class329.aClass317_3861, new Class58());
			Class158_Sub1.aClass3_8507 = new Class3();
			Class94.method1589((short) 255);
			Class77.method1369(Class330.aClass523_3868, 904202460);
			Class62.method1261(Class468_Sub7.aClass317_7886, (byte) -11);
			Class173.method2943(Class110.aClass317_1106, Class321.anInterface22_3731, 16711680);
			Class117 class117 = new Class117(Class250.aClass317_3093.method5626("huffman", "", (byte) 1));
			Class392.method6740(class117, -1847534013);
			Class263.aClass273_3244 = Class84.method1461(192179911);
			Class11.aClass282_Sub51_124 = new Class282_Sub51(true);
		}
		if (Class387.aClass387_4705 == Class474.aClass387_5621) {
			int i = (Class59.method1159(Class211.aClass317_2673, 992647546) + Class487.aClass378_5752.method6405(true, 2019215417));
			int i_11_ = (Class109_Sub1.method14651(-1068820415) + Class487.aClass378_5752.method6422(-1172394561));
			if (i < i_11_)
				return 100 * i / i_11_;
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4706)
			Class291.method5125(Class192.worldMap, Class122.aClass536_1535, Class493.aClass479_5778, client.aClass257_7353.method4436(-1546019583), Class397.aClass218_4813, Class97.aClass427_995, Class158_Sub1.aClass3_8507);
		if (Class387.aClass387_4707 == Class474.aClass387_5621) {
			Class320.anIntArray3724 = new int[-1719166449 * client.aClass408_7207.anInt4851];
			Class282_Sub17_Sub2.aBoolArray9934 = new boolean[client.aClass408_7207.anInt4851 * -1719166449];
			Class462.aStringArray5548 = new String[-1873030137 * Class396.aClass401_4791.anInt4823];
			for (int i = 0; i < -1719166449 * client.aClass408_7207.anInt4851; i++) {
				if ((client.aClass408_7207.method6873(i, (byte) 57).anInt4983 * -1037642941) == 0) {
					Class282_Sub17_Sub2.aBoolArray9934[i] = true;
					client.anInt7399 += 1707039013;
				}
				Class320.anIntArray3724[i] = -1;
			}
			Class152.method2596((byte) -54);
			Class149.aClass317_1745.method5676(false, true, (byte) 8);
			Class512.aClass317_5884.method5676(true, true, (byte) 8);
			Class211.aClass317_2673.method5676(true, true, (byte) 8);
			Class410.aClass317_4924.method5676(true, true, (byte) 8);
			Class250.aClass317_3093.method5676(true, true, (byte) 8);
			client.aBool7219 = true;
		}
		if (Class474.aClass387_5621 == Class387.aClass387_4713) {
			if (!Class456_Sub3.method12682((Class58.aClass529_527.anInt7036 * 376713291), null, -1516160192))
				return 0;
			boolean bool = true;
			for (int i = 0; i < (Class468_Sub8.aClass98Array7889[Class58.aClass529_527.anInt7036 * 376713291].aClass118Array998).length; i++) {
				Class118 class118 = (Class468_Sub8.aClass98Array7889[376713291 * Class58.aClass529_527.anInt7036].aClass118Array998[i]);
				if (-2131393857 * class118.anInt1268 == 5 && 985215637 * class118.anInt1320 != -1 && !Class211.aClass317_2673.method5688((class118.anInt1320 * 985215637), 0, 16711935))
					bool = false;
			}
			if (!bool)
				return 0;
		}
		if (Class387.aClass387_4698 == Class474.aClass387_5621)
			Class348.method6175(true, -541657526);
		if (Class387.aClass387_4710 == Class474.aClass387_5621) {
			Class328.aClass306_3771.method5437(129852286);
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
			anInterface27Array3559 = null;
			Class358.method6234((byte) 102);
			client.aBool7465 = Class393.aClass282_Sub54_4783.aClass468_Sub25_8206.method12926((byte) 82) == 1;
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub25_8206), 1, -1250184501);
			if (client.aBool7465)
				Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub18_8214, 0, 1809461340);
			else if ((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.aBool7914) && -79546877 * Class11.aClass282_Sub51_124.anInt8167 < 512 && 0 != -79546877 * Class11.aClass282_Sub51_124.anInt8167)
				Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub18_8214, 0, -2044783266);
			Class190.method3148((byte) 67);
			if (client.aBool7465)
				Class538.method11500(0, false, (byte) 24);
			else
				Class538.method11500(Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method12776(222523488), false, (byte) 24);
			Class440.method7373(Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-1073367831), -1, -1, false, (byte) 14);
			Class487.aClass378_5752.method6403(client.anInterface35_7206, (short) 255);
			Class282_Sub11_Sub3.method15476(Class316.aClass505_3680, 565704931);
			Class188.method3139(Class316.aClass505_3680, Class211.aClass317_2673, -814245885);
			Class122.method2109(Class182.aClass160Array2261, (byte) 1);
		}
		return Class152.method2604((byte) 3);
	}

	public static int method5347() {
		return Class96_Sub10_Sub1.anInt10159 * 1439648847;
	}

	static void method5348(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			if (i == 1) {
				int i_12_ = class282_sub35.readUnsignedShort();
				if (1712678171 * Class260.anInt3228 == -1)
					Class260.anInt3228 = i_12_ * -1880658669;
			}
		}
	}

	static void method5349() {
		Class442 class442 = null;
		try {
			class442 = Class345.method6137("2", client.aClass486_7450.aString5748, false, (byte) -1);
			byte[] is = new byte[(int) class442.method7388(-273347477)];
			int i;
			for (int i_13_ = 0; i_13_ < is.length; i_13_ += i) {
				i = class442.method7389(is, i_13_, is.length - i_13_, (byte) -90);
				if (-1 == i)
					throw new IOException();
			}
			Class468_Sub10.method12696(new RsByteBuffer(is), 65280);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (null != class442)
				class442.method7385((short) 12586);
		} catch (Exception exception) {
			/* empty */
		}
	}

	static void method5350() {
		Class442 class442 = null;
		try {
			class442 = Class345.method6137("2", client.aClass486_7450.aString5748, false, (byte) -1);
			byte[] is = new byte[(int) class442.method7388(-273347477)];
			int i;
			for (int i_14_ = 0; i_14_ < is.length; i_14_ += i) {
				i = class442.method7389(is, i_14_, is.length - i_14_, (byte) -10);
				if (-1 == i)
					throw new IOException();
			}
			Class468_Sub10.method12696(new RsByteBuffer(is), 65280);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (null != class442)
				class442.method7385((short) 14463);
		} catch (Exception exception) {
			/* empty */
		}
	}

	static void method5351() {
		Class442 class442 = null;
		try {
			class442 = Class345.method6137("2", client.aClass486_7450.aString5748, false, (byte) -1);
			byte[] is = new byte[(int) class442.method7388(-273347477)];
			int i;
			for (int i_15_ = 0; i_15_ < is.length; i_15_ += i) {
				i = class442.method7389(is, i_15_, is.length - i_15_, (byte) -128);
				if (-1 == i)
					throw new IOException();
			}
			Class468_Sub10.method12696(new RsByteBuffer(is), 65280);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (null != class442)
				class442.method7385((short) 17798);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static void method5352() {
		if (null != anInterface27Array3559) {
			Interface27[] interface27s = anInterface27Array3559;
			for (int i = 0; i < interface27s.length; i++) {
				Interface27 interface27 = interface27s[i];
				interface27.method161(-1145558933);
			}
		}
	}

	public static int method5353() {
		return Class96_Sub10_Sub1.anInt10159 * 1439648847;
	}

	public static int method5354() {
		return Class96_Sub10_Sub1.anInt10159 * 1439648847;
	}

	public static int method5355() {
		return Class328.aClass306_3771.method5418(104697118);
	}

	static void method5356(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			if (i == 1) {
				int[] is_16_ = Class210.anIntArray2668 = new int[6];
				is_16_[0] = class282_sub35.readUnsignedShort();
				is_16_[1] = class282_sub35.readUnsignedShort();
				is_16_[2] = class282_sub35.readUnsignedShort();
				is_16_[3] = class282_sub35.readUnsignedShort();
				is_16_[4] = class282_sub35.readUnsignedShort();
				is_16_[5] = class282_sub35.readUnsignedShort();
			}
		}
	}

	public static void method5357() {
		if (null != Class328.aClass306_3771)
			Class328.aClass306_3771.method5437(-178074086);
		if (Class377.aThread4520 != null) {
			for (;;) {
				try {
					Class377.aThread4520.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	public static void method5358() {
		if (null != Class328.aClass306_3771)
			Class328.aClass306_3771.method5437(36436455);
		if (Class377.aThread4520 != null) {
			for (;;) {
				try {
					Class377.aThread4520.join();
					break;
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}

	public static void method5359(boolean bool) {
		if (Class328.aClass306_3771 == null)
			Class165.method2852(-464514832);
		if (bool)
			Class328.aClass306_3771.method5419((byte) 13);
	}

	static int method5360(int i, int i_17_, int i_18_) {
		int i_19_ = i >> 31 & i_17_ - 1;
		return i_19_ + ((i >>> 31) + i) % i_17_;
	}

	static void method5361(Animable class521_sub1_sub1_sub2, int i, int i_20_, int i_21_, int i_22_) {
		Class227 class227 = class521_sub1_sub1_sub2.method15855((byte) -17);
		Class456_Sub3 class456_sub3 = class521_sub1_sub1_sub2.aClass456_Sub3_10337;
		int i_23_ = ((class521_sub1_sub1_sub2.anInt10361 * 1633416769 - 1040633965 * class521_sub1_sub1_sub2.aClass19_10359.anInt153) & 0x3fff);
		if (Class249.aClass249_3083.aByte3085 == i) {
			if (0 != i_23_ || class521_sub1_sub1_sub2.anInt10357 * -1920915917 > 25) {
				if (i_21_ < 0 && -1 != class227.anInt2821 * 1350078131) {
					class456_sub3.method7570(class227.anInt2821 * 1350078131, false, true, -1480402548);
					class456_sub3.aBool7891 = false;
				} else if (i_21_ > 0 && -1 != class227.anInt2792 * 997445611) {
					class456_sub3.method7570(class227.anInt2792 * 997445611, false, true, -529478475);
					class456_sub3.aBool7891 = false;
				} else if (!class456_sub3.aBool7891 || !(class227.method3810(class456_sub3.method7597(-1676563676), -1546960795))) {
					class456_sub3.method7570(class227.method3809(711048554), false, true, -1671257670);
					class456_sub3.aBool7891 = class521_sub1_sub1_sub2.aClass456_Sub3_10337.method7564(1998152611);
				}
			} else if (!class456_sub3.aBool7891 || !class227.method3810(class456_sub3.method7597(-457692749), -1546960795)) {
				class456_sub3.method7570(class227.method3809(346097495), false, true, -1633423132);
				class456_sub3.aBool7891 = class456_sub3.method7564(303040136);
			}
		} else if (-737324181 * class521_sub1_sub1_sub2.faceEntity != -1 && (i_23_ >= 10240 || i_23_ <= 2048)) {
			int i_24_ = ((client.anIntArray7380[i_20_] - 1040633965 * (class521_sub1_sub1_sub2.aClass19_10359.anInt153)) & 0x3fff);
			if (Class249.aClass249_3086.aByte3085 == i && -474675041 * class227.anInt2797 != -1) {
				if (i_24_ > 2048 && i_24_ <= 6144 && class227.anInt2800 * -833477781 != -1)
					class456_sub3.method7570(-833477781 * class227.anInt2800, false, true, -744132293);
				else if (i_24_ >= 10240 && i_24_ < 14336 && class227.anInt2799 * 1642803439 != -1)
					class456_sub3.method7570(1642803439 * class227.anInt2799, false, true, -930326431);
				else if (i_24_ > 6144 && i_24_ < 10240 && 486149589 * class227.anInt2817 != -1)
					class456_sub3.method7570(486149589 * class227.anInt2817, false, true, -1031888720);
				else
					class456_sub3.method7570(class227.anInt2797 * -474675041, false, true, -1257308259);
			} else if (Class249.aClass249_3082.aByte3085 == i && class227.anInt2801 * 2055956425 != -1) {
				if (i_24_ > 2048 && i_24_ <= 6144 && -1 != class227.anInt2812 * 1489597113)
					class456_sub3.method7570(class227.anInt2812 * 1489597113, false, true, -173534330);
				else if (i_24_ >= 10240 && i_24_ < 14336 && -1 != 1879075923 * class227.anInt2803)
					class456_sub3.method7570(1879075923 * class227.anInt2803, false, true, -1986637657);
				else if (i_24_ > 6144 && i_24_ < 10240 && -1 != 1053306035 * class227.anInt2828)
					class456_sub3.method7570(1053306035 * class227.anInt2828, false, true, -1528009558);
				else
					class456_sub3.method7570(2055956425 * class227.anInt2801, false, true, -1259452142);
			} else if (i_24_ > 2048 && i_24_ <= 6144 && -1 != -762066591 * class227.anInt2796)
				class456_sub3.method7570(-762066591 * class227.anInt2796, false, true, -989017367);
			else if (i_24_ >= 10240 && i_24_ < 14336 && -1 != -1950693115 * class227.anInt2795)
				class456_sub3.method7570(class227.anInt2795 * -1950693115, false, true, -1349434432);
			else if (i_24_ > 6144 && i_24_ < 10240 && -1 != -670567583 * class227.anInt2794)
				class456_sub3.method7570(-670567583 * class227.anInt2794, false, true, -994621922);
			else
				class456_sub3.method7570(class227.anInt2793 * -1556707231, false, true, -883440567);
			class456_sub3.aBool7891 = false;
		} else if (i_23_ != 0 || class521_sub1_sub1_sub2.anInt10357 * -1920915917 > 25) {
			if (Class249.aClass249_3086.aByte3085 == i && -1 != -474675041 * class227.anInt2797) {
				if (i_21_ < 0 && -1 != 1179359471 * class227.anInt2807)
					class456_sub3.method7570(1179359471 * class227.anInt2807, false, true, -484680989);
				else if (i_21_ > 0 && -578974199 * class227.anInt2808 != -1)
					class456_sub3.method7570(class227.anInt2808 * -578974199, false, true, -274851042);
				else
					class456_sub3.method7570(-474675041 * class227.anInt2797, false, true, -85228314);
			} else if (Class249.aClass249_3082.aByte3085 == i && -1 != 2055956425 * class227.anInt2801) {
				if (i_21_ < 0 && -1 != class227.anInt2830 * -1250601453)
					class456_sub3.method7570(-1250601453 * class227.anInt2830, false, true, -1720670633);
				else if (i_21_ > 0 && -1 != -1184599575 * class227.anInt2806)
					class456_sub3.method7570(class227.anInt2806 * -1184599575, false, true, -568161732);
				else
					class456_sub3.method7570(class227.anInt2801 * 2055956425, false, true, -1131572762);
			} else if (i_21_ < 0 && -1 != class227.anInt2809 * 871699017)
				class456_sub3.method7570(871699017 * class227.anInt2809, false, true, -443057729);
			else if (i_21_ > 0 && -1 != 1656950271 * class227.anInt2810)
				class456_sub3.method7570(class227.anInt2810 * 1656950271, false, true, -1335690885);
			else
				class456_sub3.method7570(-1556707231 * class227.anInt2793, false, true, -1249670627);
			class456_sub3.aBool7891 = false;
		} else {
			if (Class249.aClass249_3086.aByte3085 == i && -1 != class227.anInt2797 * -474675041)
				class456_sub3.method7570(class227.anInt2797 * -474675041, false, true, -1921383310);
			else if (i == Class249.aClass249_3082.aByte3085 && class227.anInt2801 * 2055956425 != -1)
				class456_sub3.method7570(2055956425 * class227.anInt2801, false, true, -352623375);
			else
				class456_sub3.method7570(-1556707231 * class227.anInt2793, false, true, -765983563);
			class456_sub3.aBool7891 = false;
		}
	}

	static final void method5362(CS2Executor class527, byte i) {
		((CS2Executor) class527).anInt7012 -= 425673003;
		int i_25_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_26_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 + 1]);
		int i_27_ = (((CS2Executor) class527).intStack[2 + 1942118537 * ((CS2Executor) class527).anInt7012]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = ((CS2Executor) class527).aClass61_7010.method1198(i_25_, i_26_, i_27_, 1532957096);
	}

	public static long method5363(int i, int i_28_) {
		return (long) (11745 + i) * 86400000L;
	}

	public static int method5364(int i, int i_29_, float f, int i_30_) {
		return Class8_Sub3.method14337(i, i_29_, (int) f, 1385119855);
	}
}
