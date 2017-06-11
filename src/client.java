
/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.Vector;

import jaclib.ping.Ping;

public final class client extends Class291 {
	static int anInt8637 = -771751936;
	public static boolean aBoolean8638;
	static boolean aBoolean8639;
	public static boolean aBoolean8640;
	static int[] anIntArray8641;
	public static int playerIndex;
	public static boolean aBoolean8643;
	static int anInt8644;
	public static long aLong8645;
	public static boolean aBoolean8646;
	public static boolean aBoolean8647;
	static String aString8648;
	public static String aString8649;
	public static Class442 aClass442_8650;
	public static boolean aBoolean8651;
	public static IComponentDefinition aClass105_8652;
	static boolean aBoolean8653;
	static int anInt8654;
	static String aString8655;
	public static String aString8656;
	static Class62[] aClass62Array8657;
	static Matrix4f aClass233_8658;
	static int anInt8659;
	static Class453 aClass453_8660;
	public static Object anObject8661;
	public static boolean aBoolean8662;
	static boolean aBoolean8663;
	public static int anInt8664;
	public static int anInt8665;
	public static boolean aBoolean8666;
	static boolean aBoolean8667;
	static boolean aBoolean8668;
	public static int anInt8669;
	static int[] anIntArray8670;
	public static Class299[] aClass299Array8671;
	public static boolean aBoolean8672;
	static boolean aBoolean8673;
	static boolean aBoolean8674;
	static long clientKey;
	public static boolean aBoolean8676;
	public static int anInt8677;
	static int anInt8678 = 31;
	public static BufferedConnectionContext[] connectionContexts;
	public static boolean aBoolean8680;
	public static int anInt8681;
	static int anInt8682;
	static int anInt8683 = 128;
	static boolean[] aBooleanArray8684;
	public static HashTable groundItems;
	static int anInt8686;
	public static int anInt8687;
	public static Interface16[] anInterface16Array8688;
	public static Color[] aColorArray8689;
	public static int anInt8690;
	public static Color[] aColorArray8691;
	static int handshakeStage;
	public static BufferedConnectionContext lobbyConnection;
	static int anInt8694;
	static int anInt8695 = 13828096;
	public static HashTable npcs;
	static Class348 aClass348_8697;
	static String aString8698;
	public static int[] anIntArray8699;
	public static Interface10 anInterface10_8700;
	public static Color[] aColorArray8701;
	static Random aRandom8702;
	public static int anInt8703;
	public static String[] aStringArray8704;
	public static int[] anIntArray8705;
	static int[] anIntArray8706;
	static int anInt8707;
	static int anInt8708;
	static int[] anIntArray8709;
	public static Interface16[] anInterface16Array8710;
	public static BufferedConnectionContext gameConnection;
	static IComponentDefinition aClass105_8712;
	static int anInt8713;
	static boolean aBoolean8714;
	public static Class404 aClass404_8715;
	public static Class283 aClass283_8716;
	public static volatile boolean aBoolean8717;
	public static Object anObject8718;
	static int anInt8719 = 1375731712;
	public static int anInt8720;
	public static int anInt8721;
	public static boolean[] aBooleanArray8722;
	static int anInt8723;
	public static int anInt8724;
	public static boolean aBoolean8725;
	static int anInt8726;
	static int anInt8727;
	public static int anInt8728;
	static int anInt8729 = 5;
	static int anInt8730 = 1179648;
	public static int anInt8731;
	public static int anInt8732;
	static int anInt8733 = -1828716544;
	static int anInt8734;
	static int[] anIntArray8735;
	public static boolean aBoolean8736;
	public static int anInt8737;
	static int[] calculatedScenePositionYs;
	public static int[] anIntArray8739;
	public static int anInt8740 = 2048;
	static int anInt8741;
	static int anInt8742;
	public static short aShort8743;
	static int anInt8744;
	static int anInt8745;
	static int anInt8746;
	static int anInt8747;
	static int anInt8748;
	static int anInt8749;
	static int[] calculatedScenePositionXs;
	public static int[] anIntArray8751;
	public static int anInt8752;
	public static int anInt8753;
	public static String aString8754;
	public static int anInt8755;
	static int anInt8756;
	public static float aFloat8757;
	static Calendar aCalendar8758;
	static float aFloat8759;
	static float aFloat8760;
	static boolean aBoolean8761;
	static boolean aBoolean8762;
	public static boolean aBoolean8763;
	static int anInt8764;
	public static int anInt8765 = 2;
	static int anInt8766 = 65535;
	public static int[][][] anIntArrayArrayArray8767;
	public static int anInt8768;
	public static int anInt8769;
	public static int anInt8770;
	public static int anInt8771;
	public static int anInt8772;
	static String[] aStringArray8773;
	public static int anInt8774;
	static boolean aBoolean8775;
	static boolean aBoolean8776;
	public static int anInt8777;
	public static boolean isMemberWorld;
	static int[] anIntArray8779;
	static Class348 aClass348_8780;
	static Class442 aClass442_8781;
	static long aLong8782;
	static int anInt8783;
	static int anInt8784;
	static int anInt8785;
	static int anInt8786;
	static int[] anIntArray8787;
	static int anInt8788;
	static int anInt8789 = 2;
	static int[] anIntArray8790;
	static int anInt8791 = 1;
	static int anInt8792;
	static int[] anIntArray8793;
	public static int anInt8794;
	static int[] anIntArray8795;
	static int anInt8796;
	static int[] anIntArray8797;
	static long aLong8798;
	static boolean aBoolean8799;
	static int anInt8800;
	static int anInt8801;
	public static boolean aBoolean8802;
	public static int anInt8803;
	public static String aString8804;
	public static Player[] aClass365_Sub1_Sub1_Sub2_Sub2Array8805;
	public static boolean aBoolean8806;
	public static boolean aBoolean8807;
	static int anInt8808;
	public static int playerRights;
	static int anInt8810;
	public static boolean aBoolean8811;
	public static boolean aBoolean8812;
	static boolean aBoolean8813;
	public static int anInt8814;
	static boolean aBoolean8815;
	public static Class298_Sub29[] aClass298_Sub29Array8816;
	static int anInt8817;
	static short[] aShortArray8818;
	public static IComponentDefinition aClass105_8819;
	static String[] aStringArray8820;
	static boolean[] aBooleanArray8821;
	static int anInt8822;
	static int[] anIntArray8823;
	public static Class453 aClass453_8824;
	public static HashTable aClass437_8825;
	static int anInt8826;
	public static Class453 aClass453_8827;
	public static int[] anIntArray8828;
	public static int[] anIntArray8829;
	static int anInt8830;
	public static int anInt8831;
	static int anInt8832;
	static int[] anIntArray8833;
	public static int anInt8834;
	public static boolean aBoolean8835;
	static int anInt8836;
	public static int anInt8837;
	public static String aString8838;
	public static short aShort8839;
	public static volatile int WINDOW_PANE_ID;
	public static HashTable aClass437_8841;
	static int anInt8842;
	public static byte[] aByteArray8843;
	public static int anInt8844;
	public static int anInt8845;
	static boolean aBoolean8846;
	static int[] anIntArray8847;
	static int anInt8848 = 0;
	static boolean aBoolean8849;
	static IComponentDefinition aClass105_8850;
	static int[] anIntArray8851;
	public static int anInt8852;
	static int anInt8853;
	static IComponentDefinition aClass105_8854;
	static boolean aBoolean8855;
	static int anInt8856;
	public static int anInt8857;
	static int anInt8858;
	public static String[] aStringArray8859;
	static int[] anIntArray8860;
	static int anInt8861;
	static int anInt8862;
	static boolean aBoolean8863;
	static int anInt8864;
	static boolean aBoolean8865;
	static boolean aBoolean8866;
	public static boolean aBoolean8867;
	static int anInt8868 = 79;
	public static Class19[] aClass19Array8869;
	public static int anInt8870;
	static Matrix3f aClass222_8871;
	static int anInt8872 = 9633792;
	static int anInt8873;
	static int[] anIntArray8874;
	static int anInt8875;
	static int[] anIntArray8876;
	static int anInt8877;
	static int anInt8878;
	static int anInt8879;
	static int[] anIntArray8880;
	static int anInt8881;
	public static int anInt8882;
	static int anInt8883;
	public static int anInt8884;
	static int anInt8885;
	static int anInt8886;
	static int anInt8887;
	static int anInt8888;
	public static int anInt8889 = 1;
	public static int anInt8890;
	public static float[] aFloatArray8891;
	static long aLong8892;
	public static Class453 aClass453_8893;
	public static int anInt8894;
	static Class453 aClass453_8895;
	static HashTable aClass437_8896;
	public static int anInt8897 = 113;
	static Class348 aClass348_8898;
	static int[] anIntArray8899;
	public static boolean[] aBooleanArray8900;
	static boolean[] aBooleanArray8901;
	static Rectangle[] aRectangleArray8902;
	static int anInt8903;
	static int[] anIntArray8904;
	static int anInt8905;
	static int anInt8906;
	static int[] anIntArray8907;
	static int[] anIntArray8908;
	static int[] anIntArray8909;
	static int anInt8910;
	static int[] anIntArray8911;
	static int anInt8912;
	public static int anInt8913;
	static int anInt8914 = 100;
	static long[] aLongArray8915;
	static int anInt8916;
	static boolean aBoolean8917;
	static int[] anIntArray8918;
	public static String aString8919;
	public static Class251[] aClass251Array8920;
	static int anInt8921;
	static boolean aBoolean8922;
	public static short aShort8923;
	public static int[] anIntArray8924;
	static int[] anIntArray8925;
	static int[] anIntArray8926;
	static String aString8927;
	public static short aShort8928;
	public static short aShort8929;
	static int anInt8930;
	public static short aShort8931;
	public static int anInt8932;
	public static int anInt8933;
	public static short aShort8934;
	public static short aShort8935;
	static int anInt8936;
	static int anInt8937;
	static boolean aBoolean8938;
	public static int anInt8939;
	static int anInt8940;
	public static int anInt8941;
	public static int anInt8942;
	static int anInt8943 = 4095;
	public static Class411 aClass411_8944 = null;
	public static String[] aStringArray8945;
	public static int[] anIntArray8946;
	public static String[] aStringArray8947;
	static int anInt8948 = 32;
	public static float aFloat8949;
	public static boolean[] aBooleanArray8950;
	static Class442 aClass442_8951;
	public static int anInt8952;
	static int anInt8953 = 200;
	public static String[] aStringArray8954;
	public static String[] aStringArray8955;
	static int anInt8956;
	public static boolean[] aBooleanArray8957;
	static boolean aBoolean8958;
	public static byte aByte8959;
	public static Interface17 anInterface17_8960;
	static int anInt8961;
	static int anInt8962 = 5373952;
	static int anInt8963 = 9568256;
	static int anInt8964 = 13762560;
	static int anInt8965 = 301989888;
	static int anInt8966;
	static int anInt8967 = -1845493760;
	static Matrix3f aClass222_8968;
	static int anInt8969 = 1245184;
	static int anInt8970 = 5439488;
	public static int anInt8971;
	static int anInt8972;
	static int anInt8973 = 318767104;
	static int anInt8974 = 1392508928;
	static int anInt8975 = 8;
	static int anInt8976 = -754974720;
	static int[] anIntArray8977;

	public final void init() {
		try {
			if (method2758(1161676873)) {
				Class209[] class209s = Class266.method2523(2020193893);
				for (int i = 0; i < class209s.length; i++) {
					Class209 class209 = class209s[i];
					String string = ClientScriptMap.anApplet6044.getParameter(class209.aString2395);
					if (string != null) {
						switch (Integer.parseInt(class209.aString2395)) {
						case 9:
							Class73.anInt689 = Integer.parseInt(string) * -2071496301;
							break;
						case 23:
							if (string.equals(Class26.aString355))
								aBoolean8643 = true;
							else
								aBoolean8643 = false;
							break;
						case 33:
							Class112.aString1369 = string;
							break;
						default:
							Class464.method6062("", new RuntimeException(), (short) -10320);
							break;
						case 7:
							Class486.aString6063 = string;
							break;
						case 21:
							Class474.aClass471_5976 = new Class464();
							Class474.aClass471_5976.worldId = Integer.parseInt(string) * 348739329;
							break;
						case 3:
							aString8655 = string;
							break;
						case 12:
							if (string.equalsIgnoreCase(Class26.aString355))
								aBoolean8651 = true;
							else
								aBoolean8651 = false;
							break;
						case 18:
							if (string.equalsIgnoreCase(Class26.aString355))
								aBoolean8807 = true;
							break;
						case 17:
							if (string.equalsIgnoreCase(Class26.aString355))
								aBoolean8958 = true;
							else
								aBoolean8958 = false;
							break;
						case 11:
							if (string.equalsIgnoreCase(Class26.aString355))
								aBoolean8638 = true;
							else
								aBoolean8638 = false;
							break;
						case 24:
							aString8649 = string;
							break;
						case 27:
							Class321.aClass429_3357 = Class429.method5754(Integer.parseInt(string), 615406105);
							break;
						case 30:
							if (string.equalsIgnoreCase(Class26.aString355))
								aBoolean8653 = true;
							else
								aBoolean8653 = false;
							break;
						case 22:
							if (string.equalsIgnoreCase(Class26.aString355))
								aBoolean8639 = true;
							else
								aBoolean8639 = false;
							break;
						case 13:
							Class242.aClass401_2708 = ((Class401) (Class422_Sub20.method5701(Class401.method4936(-1240424446), Integer.parseInt(string), (byte) 2)));
							if (Class401.aClass401_6552 == Class242.aClass401_2708)
								Class242.aClass401_2708 = Class401.aClass401_6560;
							else if (!Class401.method4932((Class242.aClass401_2708), 2072733929) && (Class242.aClass401_2708 != Class401.aClass401_6557))
								Class242.aClass401_2708 = Class401.aClass401_6557;
							break;
						case 5:
							Class350.anInt3758 = Integer.parseInt(string) * -339928991;
							break;
						case 32:
							aLong8645 = (Long.parseLong(string) * -4477728998236397853L);
							break;
						case 1:
							anInt8665 = Integer.parseInt(string) * 708949575;
							break;
						case 6:
							Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -115);
							if ((Class510.aClass444_6221 != Class444.aClass444_5605) && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221)
									&& (Class510.aClass444_6221 != Class444.aClass444_5604))
								Class510.aClass444_6221 = Class444.aClass444_5604;
							break;
						case 20:
							if (Class241.aClass471_2705 == null)
								Class241.aClass471_2705 = new Class464();
							Class241.aClass471_2705.address = string;
							break;
						case 8:
							break;
						case 2:
							aString8648 = string;
							if (aString8648.length() > 100)
								aString8648 = null;
							break;
						case 25:
							anInt8654 = Integer.parseInt(string) * -431443955;
							break;
						case 4:
							if (Class241.aClass471_2705 == null)
								Class241.aClass471_2705 = new Class464();
							Class241.aClass471_2705.worldId = Integer.parseInt(string) * 348739329;
							break;
						case 31:
							if (string.equalsIgnoreCase(Class26.aString355))
								aBoolean8867 = true;
							else
								aBoolean8867 = false;
							break;
						case 10:
							aString8656 = string;
							break;
						case 14:
							break;
						case 29:
							if (null != string) {
								aByteArray8843 = (Class140.method1557(Class328.method3989(string, -1122576135), (byte) 59));
								if (aByteArray8843.length < 16)
									aByteArray8843 = null;
							}
							break;
						case 26:
							aClass411_8944 = Class352.method4244(Integer.parseInt(string), (byte) 119);
							break;
						case 28:
							anInt8971 = Integer.parseInt(string) * 131907935;
							if (745003679 * anInt8971 < 0 || (745003679 * anInt8971 >= aColorArray8689.length))
								anInt8971 = 0;
							break;
						case 16:
							if (string.equals(Class26.aString355))
								aBoolean8680 = true;
							else
								aBoolean8680 = false;
							break;
						case 15:
							aString8927 = string;
						}
					}
				}
				if (aString8927 == null)
					aString8927 = "";
				Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, aClass411_8944.aString5322);
				Class385.aClient4141 = this;
				method2751(class311, aClass411_8944.aString5317, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(-369062280), 718, 1, aBoolean8653, (byte) 23);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.init(").append(')').toString());
		}
	}

	final void method2763(byte i) {
		try {
			Frame frame = new Frame(" ");
			frame.pack();
			frame.dispose();
			Class82_Sub3.aClass105_6825 = new IComponentDefinition();
			Class229.method2124((byte) -66);
			Class365_Sub1_Sub3.aClass255_9804 = new Class255();
			Class248.aClass247_2752 = new Class247_Sub1();
			int[] is = { 20, 260 };
			int[] is_0_ = { 1000, 100 };
			if (is == null || null == is_0_) {
				Class136.anIntArray6388 = null;
				Class416.anIntArray5331 = null;
				Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001 = null;
			} else {
				Class136.anIntArray6388 = is;
				Class416.anIntArray5331 = new int[is.length];
				Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001 = new byte[is.length][][];
				for (int i_1_ = 0; i_1_ < Class136.anIntArray6388.length; i_1_++)
					Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001[i_1_] = new byte[is_0_[i_1_]][];
			}
			Class217.method2017(100);
			Class218.method2027(10);
			IComponentSettings.method3500(100, 906973812);
			Class315.method3838(100, 1489616392);
			if (Class401.aClass401_6557 != Class242.aClass401_2708)
				Class98.aByteArrayArray949 = new byte[50][];
			Class422_Sub25.aClass298_Sub48_8425 = Class121.method1315(815058743);
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub21_7580.method5703((byte) -54) == 1)
				Class331.aBoolean3540 = false;
			if (Class401.aClass401_6557 == Class242.aClass401_2708)
				Class474.aClass471_5976.address = ClientScriptMap.anApplet6044.getCodeBase().getHost();
			else if (Class401.method4932(Class242.aClass401_2708, 2144783357)) {
				Class474.aClass471_5976.address = ClientScriptMap.anApplet6044.getCodeBase().getHost();
				Class474.aClass471_5976.anInt5954 = (815680320 + Class474.aClass471_5976.worldId * -1670427267);
				Class241.aClass471_2705.anInt5954 = (815680320 + Class241.aClass471_2705.worldId * -1670427267);
				Class474.aClass471_5976.anInt5955 = (-52655920 + Class474.aClass471_5976.worldId * 925746937);
				Class241.aClass471_2705.anInt5955 = (Class241.aClass471_2705.worldId * 925746937 + -52655920);
			} else if (Class242.aClass401_2708 == Class401.aClass401_6552) {
				Class474.aClass471_5976.address = Class26.aString354;
				Class241.aClass471_2705.address = Class26.aString354;
				Class474.aClass471_5976.anInt5954 = (815680320 + Class474.aClass471_5976.worldId * -1670427267);
				Class241.aClass471_2705.anInt5954 = (-1670427267 * Class241.aClass471_2705.worldId + 815680320);
				Class474.aClass471_5976.anInt5955 = (-52655920 + Class474.aClass471_5976.worldId * 925746937);
				Class241.aClass471_2705.anInt5955 = (-52655920 + Class241.aClass471_2705.worldId * 925746937);
			}
			Class474.aClass471_5979 = Class474.aClass471_5976;
			if (aClass411_8944 == Class411.aClass411_5320)
				aBoolean8674 = false;
			Class107.aShortArray1315 = ObjectDefinitions.aShortArray5423 = SomethingDefinitions.aShortArray6182 = ItemDefinitions.aShortArray5757 = new short[256];
			try {
				Class365_Sub1_Sub5_Sub2.aClipboard9941 = Class318.method3874((byte) 72).getToolkit().getSystemClipboard();
			} catch (Exception exception) {
				/* empty */
			}
			Class372.aClass323_4052 = Class294.method2825(Class52_Sub2_Sub1.aCanvas9079, 906112381);
			Class165.recorder = Class291.method2785(Class52_Sub2_Sub1.aCanvas9079, true, (short) 391);
			if (Class401.aClass401_6557 != Class242.aClass401_2708)
				aBoolean8667 = true;
			aString6485 = Tradution.aClass470_5874.method6049(Class321.aClass429_3357, -875414210);
			Class62.aClass248_612 = new Class248();
			new Thread(Class62.aClass248_612).start();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.ak(").append(')').toString());
		}
	}

	final void method2773(byte i) {
		try {
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-497578575) == 2) {
				try {
					method2806((byte) 0);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class464.method6062(new StringBuilder().append(throwable.getMessage()).append(" ").append(method2761((byte) 53)).toString(), throwable, (short) -28836);
					aBoolean8662 = true;
					Class370.method4578(0, false, 622850291);
				}
			} else
				method2806((byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.ae(").append(')').toString());
		}
	}

	final void method2774(int i) {
		try {
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1358011800) == 2) {
				try {
					method2792((byte) 0);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class464.method6062(new StringBuilder().append(throwable.getMessage()).append(" ").append(method2761((byte) 17)).toString(), throwable, (short) 1591);
					aBoolean8662 = true;
					Class370.method4578(0, false, 622850291);
				}
			} else
				method2792((byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.ao(").append(')').toString());
		}
	}

	void method2792(byte i) {
		try {
			if (-1233866115 * anInt8752 != 10) {
				long l = (Class82_Sub3.method881((byte) 12) / 1000000L - 2783675710070397783L * aLong8782);
				aLong8782 = (Class82_Sub3.method881((byte) -35) / 1000000L * -1871756826282688409L);
				boolean bool = Class69.method795(1477772934);
				if (bool && Class300.aBoolean3208 && Class300.aClass284_3212 != null)
					Class300.aClass284_3212.method2689(-1023851530);
				if (Class319.method3902(-1233866115 * anInt8752, 476312339)) {
					if (0L != aLong8798 * -7612703297707729209L && (Class122.method1319((byte) 1) > -7612703297707729209L * aLong8798))
						Class357.method4276(Class190.method1859((byte) -69), -1, -1, false, 243122933);
					else if (!Class373.aClass_ra4071.method5074() && aBoolean6478)
						Class335.method4086(-444434121);
				}
				if (null == Class231.aFrame2589) {
					Container container = Class318.method3874((byte) 74);
					int i_2_ = container.getSize().width;
					int i_3_ = container.getSize().height;
					if (container == Class298_Sub36.aFrame7403) {
						Insets insets = Class298_Sub36.aFrame7403.getInsets();
						i_2_ -= insets.right + insets.left;
						i_3_ -= insets.bottom + insets.top;
					}
					if (Class78.anInt733 * -639974669 != i_2_ || i_3_ != 1282634425 * anInt6472 || aBoolean8676) {
						if (null == Class373.aClass_ra4071 || Class373.aClass_ra4071.method4995())
							Class229.method2124((byte) -98);
						else {
							Class78.anInt733 = i_2_ * 1325868603;
							anInt6472 = i_3_ * -2115832951;
						}
						aLong8798 = ((Class122.method1319((byte) 1) + 500L) * -1373096961092238601L);
						aBoolean8676 = false;
					}
				}
				if (Class452.aBoolean5642 && null != Class231.aFrame2589 && !Class422_Sub7.aBoolean8385 && Class319.method3902(-1233866115 * anInt8752, 476312339))
					Class357.method4276(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub12_7543.method5669((byte) 34), -1, -1, false, 1694372474);
				boolean bool_4_ = false;
				if (aBoolean6471) {
					aBoolean6471 = false;
					bool_4_ = true;
				}
				if (bool_4_)
					Class148.method1614((byte) -3);
				if ((Class373.aClass_ra4071 != null && Class373.aClass_ra4071.method5074()) || Class190.method1859((byte) -122) != 1)
					Class360.method4301(-1789306490);
				if (Class88.method976(-1233866115 * anInt8752, -1448819665))
					Class60.method710(bool_4_, 430993133);
				else if (Class158_Sub1.method1703(-1233866115 * anInt8752, 520913281))
					Class405.method4958(447944821);
				else if (Class363.method4315(anInt8752 * -1233866115, 279703369))
					Class405.method4958(447944821);
				else if (Class358.method4287(anInt8752 * -1233866115, 361133550)) {
					if (aClass283_8716.method2627((byte) 103) == Class273.aClass273_2906) {
						int i_5_ = aClass283_8716.method2662(-471108411) / 2;
						Class139.method1548(new StringBuilder().append(Tradution.aClass470_5874.method6049(Class321.aClass429_3357, -875414210)).append(Class26.aString350).append("(").append(i_5_).append("%)").toString(), true,
								Class373.aClass_ra4071, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) 20);
					} else if (aClass283_8716.method2627((byte) 65) == Class273.aClass273_2904) {
						int i_6_ = 50 + aClass283_8716.method2670((byte) -20) / 2;
						Class139.method1548(new StringBuilder().append(Tradution.aClass470_5874.method6049(Class321.aClass429_3357, -875414210)).append(Class26.aString350).append("(").append(i_6_).append("%)").toString(), true,
								Class373.aClass_ra4071, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) 38);
					} else
						Class139.method1548((Tradution.aClass470_5874.method6049(Class321.aClass429_3357, -875414210)), true, Class373.aClass_ra4071, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) 64);
				} else if (-1233866115 * anInt8752 == 0)
					Class322.method3932(l);
				else if (5 == -1233866115 * anInt8752)
					Class139.method1548(
							new StringBuilder().append(Tradution.aClass470_5876.method6049(Class321.aClass429_3357, -875414210)).append(Class26.aString350).append(Tradution.aClass470_5794.method6049(Class321.aClass429_3357, -875414210)).toString(),
							false, Class373.aClass_ra4071, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) -78);
				else if (-1233866115 * anInt8752 == 13)
					Class139.method1548(Tradution.aClass470_5788.method6049(Class321.aClass429_3357, -875414210), false, Class373.aClass_ra4071, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) -34);
				if (anInt8956 * 2067224717 == 3) {
					for (int i_7_ = 0; i_7_ < -112139815 * anInt8686; i_7_++) {
						Rectangle rectangle = aRectangleArray8902[i_7_];
						if (aBooleanArray8901[i_7_])
							Class373.aClass_ra4071.method5014(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -65281, -1154135078);
						else
							Class373.aClass_ra4071.method5014(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -16711936, -2005947871);
					}
				}
				if (Class423.method5734(-268540899))
					Class445.method5895(Class373.aClass_ra4071, (byte) 127);
				if (!Class88.method976(anInt8752 * -1233866115, 797947023) && !Class358.method4287(-1233866115 * anInt8752, 1114719498) && -1 != WINDOW_PANE_ID * -257444687) {
					try {
						Class373.aClass_ra4071.method4988((byte) -94);
					} catch (Exception_Sub1 exception_sub1) {
						Class464.method6062(new StringBuilder().append(exception_sub1.getMessage()).append(" ").append(method2761((byte) 3)).toString(), exception_sub1, (short) -15479);
						Class370.method4578(0, false, 622850291);
					}
				}
				Class292.method2817(-1025699241);
				int i_8_ = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub26_7577.method5717((byte) 1);
				if (0 == i_8_)
					Class464.method6060(15L);
				else if (i_8_ == 1)
					Class464.method6060(10L);
				else if (2 == i_8_)
					Class464.method6060(5L);
				else if (3 == i_8_)
					Class464.method6060(2L);
				if (aBoolean8672)
					Class442.method5879(1638092472);
				if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub27_7579.method5720((byte) -31) == 1 && 19 == -1233866115 * anInt8752 && -257444687 * WINDOW_PANE_ID != -1) {
					Class422_Sub25.aClass298_Sub48_8425.method3540((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub27_7579), 0, 1020440405);
					Class3.method300(656179282);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.fy(").append(')').toString());
		}
	}

	final void method2765(int i) {
		try {
			if (aBoolean8736)
				Class52_Sub2.method589(1472564076);
			Class16.method352(-1772893156);
			if (null != Class373.aClass_ra4071)
				Class373.aClass_ra4071.method5136(1233420487);
			if (Class452.aBoolean5642 && Class231.aFrame2589 != null) {
				Class93.method1010(Class389.aClass457_4164, Class231.aFrame2589, -784023783);
				Class231.aFrame2589 = null;
			}
			gameConnection.method384((byte) 68);
			((BufferedConnectionContext) gameConnection).aClass124_340.method1382(-2007013994);
			lobbyConnection.method384((byte) 31);
			((BufferedConnectionContext) lobbyConnection).aClass124_340.method1382(-1769039718);
			Class523.method6332(1722973256);
			Class248.aClass247_2752.method2346((byte) -87);
			Class365_Sub1_Sub3.aClass255_9804.method2433(-1838301690);
			if (null != aClass404_8715) {
				aClass404_8715.method4948(876164724);
				aClass404_8715 = null;
			}
			try {
				Ping.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			Class244.method2326(875496962);
			try {
				Class444.method5890((byte) -128);
			} catch (Exception exception) {
				/* empty */
			}
			if (aBoolean6480)
				Class117.method1279(-849889720);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.ad(").append(')').toString());
		}
	}

	void method2793(int i) {
		try {
			boolean bool = Class248.aClass247_2752.method2351(-358267640);
			if (!bool)
				startUp(1084635084);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.ft(").append(')').toString());
		}
	}

	void method2794(int i, int i_9_) {
		try {
			Class423.aSocket5355 = null;
			Class365_Sub1_Sub5_Sub2.aClass318_9940 = null;
			handshakeStage = 0;
			Class248.aClass247_2752.anInt2735 += 686188557;
			Class248.aClass247_2752.anInt2745 = i * -1293857183;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.fl(").append(')').toString());
		}
	}

	static final void method2795() {
		int i = 1168366243 * Class10.anInt129;
		int[] is = Class10.anIntArray135;
		int i_10_ = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub25_7569.method5716((byte) -15);
		boolean bool = i_10_ == 1 && i > 200 || i_10_ == 0 && i > 50;
		for (int i_11_ = 0; i_11_ < i; i_11_++) {
			Player class365_sub1_sub1_sub2_sub2 = aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_11_]];
			if (!class365_sub1_sub1_sub2_sub2.method4477(526198823))
				class365_sub1_sub1_sub2_sub2.anInt10071 = 689024993;
			else if (class365_sub1_sub1_sub2_sub2.hidden)
				class365_sub1_sub1_sub2_sub2.anInt10071 = 689024993;
			else {
				class365_sub1_sub1_sub2_sub2.method4404(449273804);
				if (class365_sub1_sub1_sub2_sub2.aShort9798 < 0 || class365_sub1_sub1_sub2_sub2.aShort9795 < 0 || (class365_sub1_sub1_sub2_sub2.aShort9796 >= aClass283_8716.method2629(-1927739596))
						|| (class365_sub1_sub1_sub2_sub2.aShort9797 >= aClass283_8716.method2630(2032357288)))
					class365_sub1_sub1_sub2_sub2.anInt10071 = 689024993;
				else {
					class365_sub1_sub1_sub2_sub2.aBoolean10207 = (class365_sub1_sub1_sub2_sub2.aBoolean10094 ? bool : false);
					if (Class287.myPlayer == class365_sub1_sub1_sub2_sub2)
						class365_sub1_sub1_sub2_sub2.anInt10071 = -1458458655;
					else {
						int i_12_ = 0;
						if (!class365_sub1_sub1_sub2_sub2.aBoolean10123)
							i_12_++;
						if ((class365_sub1_sub1_sub2_sub2.anInt10116 * -1472450313) > anInt8884 * 443738891)
							i_12_ += 2;
						i_12_ += 5 - class365_sub1_sub1_sub2_sub2.getSize() << 2;
						if (class365_sub1_sub1_sub2_sub2.aBoolean10203 || class365_sub1_sub1_sub2_sub2.aBoolean10222)
							i_12_ += 512;
						else {
							if (198119493 * anInt8903 == 0)
								i_12_ += 32;
							else
								i_12_ += 128;
							i_12_ += 256;
						}
						class365_sub1_sub1_sub2_sub2.anInt10071 = (1 + i_12_) * -689024993;
					}
				}
			}
		}
		for (int i_13_ = 0; i_13_ < -1230451913 * anInt8703; i_13_++) {
			NPC class365_sub1_sub1_sub2_sub1 = ((NPC) (((Class298_Sub29) npcs.get((long) anIntArray8699[i_13_])).anObject7366));
			if (!class365_sub1_sub1_sub2_sub1.method4457(819293556) || !class365_sub1_sub1_sub2_sub1.aClass503_10190.method6241(Class128.aClass148_6331, 922180251))
				class365_sub1_sub1_sub2_sub1.anInt10071 = 689024993;
			else {
				class365_sub1_sub1_sub2_sub1.method4404(449273804);
				if (class365_sub1_sub1_sub2_sub1.aShort9798 < 0 || class365_sub1_sub1_sub2_sub1.aShort9795 < 0 || (class365_sub1_sub1_sub2_sub1.aShort9796 >= aClass283_8716.method2629(-1937230343))
						|| (class365_sub1_sub1_sub2_sub1.aShort9797 >= aClass283_8716.method2630(1822473503)))
					class365_sub1_sub1_sub2_sub1.anInt10071 = 689024993;
				else {
					int i_14_ = 0;
					if (!class365_sub1_sub1_sub2_sub1.aBoolean10123)
						i_14_++;
					if (-1472450313 * class365_sub1_sub1_sub2_sub1.anInt10116 > 443738891 * anInt8884)
						i_14_ += 2;
					i_14_ += 5 - class365_sub1_sub1_sub2_sub1.getSize() << 2;
					if (0 == anInt8903 * 198119493) {
						if (class365_sub1_sub1_sub2_sub1.aClass503_10190.aBoolean6173)
							i_14_ += 64;
						else
							i_14_ += 128;
					} else if (198119493 * anInt8903 == 1) {
						if (class365_sub1_sub1_sub2_sub1.aClass503_10190.aBoolean6173)
							i_14_ += 32;
						else
							i_14_ += 64;
					}
					if (class365_sub1_sub1_sub2_sub1.aClass503_10190.aBoolean6124)
						i_14_ += 1024;
					else if (!class365_sub1_sub1_sub2_sub1.aClass503_10190.aBoolean6155)
						i_14_ += 256;
					class365_sub1_sub1_sub2_sub1.anInt10071 = (1 + i_14_) * -689024993;
				}
			}
		}
		for (int i_15_ = 0; i_15_ < aClass19Array8869.length; i_15_++) {
			Class19 class19 = aClass19Array8869[i_15_];
			if (null != class19) {
				if (958933333 * class19.anInt266 == 1) {
					Class298_Sub29 class298_sub29 = ((Class298_Sub29) npcs.get((long) (class19.anInt256 * -841622081)));
					if (class298_sub29 != null) {
						NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
						if (648883167 * class365_sub1_sub1_sub2_sub1.anInt10071 >= 0)
							class365_sub1_sub1_sub2_sub1.anInt10071 += 1921054720;
					}
				} else if (958933333 * class19.anInt266 == 10) {
					Player class365_sub1_sub1_sub2_sub2 = (aClass365_Sub1_Sub1_Sub2_Sub2Array8805[-841622081 * class19.anInt256]);
					if (class365_sub1_sub1_sub2_sub2 != null && (Class287.myPlayer != class365_sub1_sub1_sub2_sub2) && (648883167 * class365_sub1_sub1_sub2_sub2.anInt10071 >= 0))
						class365_sub1_sub1_sub2_sub2.anInt10071 += 1921054720;
				}
			}
		}
	}

	static final void method2796(int i) {
		int i_16_ = 1168366243 * Class10.anInt129;
		int[] is = Class10.anIntArray135;
		int[][] is_17_ = aClass283_8716.method2656((byte) 11);
		int[][] is_18_ = aClass283_8716.method2638(-516804479);
		int i_19_;
		if (0 == anInt8724 * 1596783995)
			i_19_ = Class87.aClass94Array794.length;
		else
			i_19_ = anInt8703 * -1230451913 + i_16_;
		for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
			Entity class365_sub1_sub1_sub2;
			if (0 == 1596783995 * anInt8724) {
				Class94 class94 = Class87.aClass94Array794[i_20_];
				if (!class94.aBoolean912)
					continue;
				class365_sub1_sub1_sub2 = class94.method1015(1762691762);
			} else {
				if (i_20_ < i_16_)
					class365_sub1_sub1_sub2 = aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_20_]];
				else
					class365_sub1_sub1_sub2 = ((Entity) (((Class298_Sub29) npcs.get((long) anIntArray8699[i_20_ - i_16_])).anObject7366));
				if (i != class365_sub1_sub1_sub2.plane || class365_sub1_sub1_sub2.anInt10071 * 648883167 < 0)
					continue;
			}
			int i_21_ = class365_sub1_sub1_sub2.getSize();
			Class217 class217 = class365_sub1_sub1_sub2.method4337().aClass217_2599;
			if ((i_21_ & 0x1) == 0) {
				if (((int) class217.aFloat2451 & 0x1ff) != 0 || 0 != ((int) class217.aFloat2454 & 0x1ff))
					continue;
			} else if (((int) class217.aFloat2451 & 0x1ff) != 256 || 256 != ((int) class217.aFloat2454 & 0x1ff))
				continue;
			if (i_21_ == 1) {
				int i_22_ = (int) class217.aFloat2451 >> 9;
				int i_23_ = (int) class217.aFloat2454 >> 9;
				if (648883167 * class365_sub1_sub1_sub2.anInt10071 > is_17_[i_22_][i_23_]) {
					is_17_[i_22_][i_23_] = 648883167 * class365_sub1_sub1_sub2.anInt10071;
					is_18_[i_22_][i_23_] = 1;
				} else if (class365_sub1_sub1_sub2.anInt10071 * 648883167 == is_17_[i_22_][i_23_])
					is_18_[i_22_][i_23_]++;
			} else {
				int i_24_ = 60 + (i_21_ - 1) * 256;
				int i_25_ = (int) class217.aFloat2451 - i_24_ >> 9;
				int i_26_ = (int) class217.aFloat2454 - i_24_ >> 9;
				int i_27_ = (int) class217.aFloat2451 + i_24_ >> 9;
				int i_28_ = i_24_ + (int) class217.aFloat2454 >> 9;
				for (int i_29_ = i_25_; i_29_ <= i_27_; i_29_++) {
					for (int i_30_ = i_26_; i_30_ <= i_28_; i_30_++) {
						if (class365_sub1_sub1_sub2.anInt10071 * 648883167 > is_17_[i_29_][i_30_]) {
							is_17_[i_29_][i_30_] = (648883167 * class365_sub1_sub1_sub2.anInt10071);
							is_18_[i_29_][i_30_] = 1;
						} else if (is_17_[i_29_][i_30_] == (class365_sub1_sub1_sub2.anInt10071 * 648883167))
							is_18_[i_29_][i_30_]++;
					}
				}
			}
		}
	}

	static final void method2797(int i) {
		int i_31_ = Class10.anInt129 * 1168366243;
		int[] is = Class10.anIntArray135;
		int[][] is_32_ = aClass283_8716.method2656((byte) 11);
		int[][] is_33_ = aClass283_8716.method2638(-516804479);
		int i_34_;
		if (anInt8724 * 1596783995 == 0)
			i_34_ = Class87.aClass94Array794.length;
		else
			i_34_ = aBoolean8673 ? i_31_ : -1230451913 * anInt8703 + i_31_;
		for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
			Entity class365_sub1_sub1_sub2;
			if (anInt8724 * 1596783995 == 0) {
				Class94 class94 = Class87.aClass94Array794[i_35_];
				if (!class94.aBoolean912)
					continue;
				class365_sub1_sub1_sub2 = class94.method1015(2029177891);
			} else {
				if (i_35_ < i_31_)
					class365_sub1_sub1_sub2 = aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_35_]];
				else
					class365_sub1_sub1_sub2 = ((Entity) (((Class298_Sub29) npcs.get((long) anIntArray8699[i_35_ - i_31_])).anObject7366));
				if (i != class365_sub1_sub1_sub2.plane)
					continue;
				if (648883167 * class365_sub1_sub1_sub2.anInt10071 < 0) {
					class365_sub1_sub1_sub2.aBoolean10123 = false;
					continue;
				}
			}
			class365_sub1_sub1_sub2.anInt10069 = 0;
			int i_36_ = class365_sub1_sub1_sub2.getSize();
			Class217 class217 = class365_sub1_sub1_sub2.method4337().aClass217_2599;
			if ((i_36_ & 0x1) == 0) {
				if (0 != ((int) class217.aFloat2451 & 0x1ff) || ((int) class217.aFloat2454 & 0x1ff) != 0) {
					class365_sub1_sub1_sub2.aBoolean10123 = false;
					continue;
				}
			} else if (((int) class217.aFloat2451 & 0x1ff) != 256 || 256 != ((int) class217.aFloat2454 & 0x1ff)) {
				class365_sub1_sub1_sub2.aBoolean10123 = false;
				continue;
			}
			if (0 != anInt8724 * 1596783995) {
				if (i_36_ == 1) {
					int i_37_ = (int) class217.aFloat2451 >> 9;
					int i_38_ = (int) class217.aFloat2454 >> 9;
					if (648883167 * class365_sub1_sub1_sub2.anInt10071 != is_32_[i_37_][i_38_]) {
						class365_sub1_sub1_sub2.aBoolean10123 = true;
						continue;
					}
					if (is_33_[i_37_][i_38_] > 1) {
						is_33_[i_37_][i_38_]--;
						class365_sub1_sub1_sub2.aBoolean10123 = true;
						continue;
					}
				} else {
					int i_39_ = (i_36_ - 1) * 256 + 252;
					int i_40_ = (int) class217.aFloat2451 - i_39_ >> 9;
					int i_41_ = (int) class217.aFloat2454 - i_39_ >> 9;
					int i_42_ = (int) class217.aFloat2451 + i_39_ >> 9;
					int i_43_ = i_39_ + (int) class217.aFloat2454 >> 9;
					if (!Class146.method1599(is_32_, is_33_, (class365_sub1_sub1_sub2.anInt10071) * 648883167, i_40_, i_41_, i_42_, i_43_, -1335348035)) {
						for (int i_44_ = i_40_; i_44_ <= i_42_; i_44_++) {
							for (int i_45_ = i_41_; i_45_ <= i_43_; i_45_++) {
								if (is_32_[i_44_][i_45_] == (class365_sub1_sub1_sub2.anInt10071 * 648883167))
									is_33_[i_44_][i_45_]--;
							}
						}
						class365_sub1_sub1_sub2.aBoolean10123 = true;
						continue;
					}
				}
			}
			class365_sub1_sub1_sub2.aBoolean10123 = false;
			class365_sub1_sub1_sub2.method4341(class217.aFloat2451, (float) Class356.method4271((int) class217.aFloat2451, (int) class217.aFloat2454, class365_sub1_sub1_sub2.plane, -1247004114), class217.aFloat2454);
			aClass283_8716.method2675(-1611682495).method4022(class365_sub1_sub1_sub2, true, (byte) 0);
		}
	}

	static final void method2798() {
		anInt8659 = 0;
		for (int i = 0; i < -1230451913 * anInt8703; i++) {
			NPC class365_sub1_sub1_sub2_sub1 = ((NPC) (((Class298_Sub29) npcs.get((long) anIntArray8699[i])).anObject7366));
			if (class365_sub1_sub1_sub2_sub1.aBoolean10123 && class365_sub1_sub1_sub2_sub1.method4427((byte) 1) != -1) {
				int i_46_ = ((class365_sub1_sub1_sub2_sub1.getSize() - 1) * 256 + 252);
				Class217 class217 = class365_sub1_sub1_sub2_sub1.method4337().aClass217_2599;
				int i_47_ = (int) class217.aFloat2451 - i_46_ >> 9;
				int i_48_ = (int) class217.aFloat2454 - i_46_ >> 9;
				Entity class365_sub1_sub1_sub2 = Class391.method4886((class365_sub1_sub1_sub2_sub1.plane), i_47_, i_48_, (byte) 88);
				if (null != class365_sub1_sub1_sub2) {
					int i_49_ = class365_sub1_sub1_sub2.anInt10064 * 1888274983;
					if (class365_sub1_sub1_sub2 instanceof NPC)
						i_49_ += 2048;
					if (0 == -152681609 * class365_sub1_sub1_sub2.anInt10069 && (class365_sub1_sub1_sub2.method4427((byte) 1) != -1)) {
						anIntArray8851[1306491689 * anInt8659] = i_49_;
						anIntArray8779[anInt8659 * 1306491689] = i_49_;
						anInt8659 += -517123815;
						class365_sub1_sub1_sub2.anInt10069 += 512067143;
					}
					anIntArray8851[1306491689 * anInt8659] = i_49_;
					anIntArray8779[1306491689 * anInt8659] = (1888274983 * class365_sub1_sub1_sub2_sub1.anInt10064 + 2048);
					anInt8659 += -517123815;
					class365_sub1_sub1_sub2.anInt10069 += 512067143;
				}
			}
		}
		Class82_Sub17.method920(anIntArray8779, anIntArray8851, 0, 1306491689 * anInt8659 - 1, 1469095364);
	}

	static final void method2799() {
		int i = Class10.anInt129 * 1168366243;
		int[] is = Class10.anIntArray135;
		int i_50_;
		if (0 == anInt8724 * 1596783995)
			i_50_ = Class87.aClass94Array794.length;
		else
			i_50_ = aBoolean8673 ? i : i + -1230451913 * anInt8703;
		for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
			Entity class365_sub1_sub1_sub2;
			if (0 == 1596783995 * anInt8724) {
				Class94 class94 = Class87.aClass94Array794[i_51_];
				if (!class94.aBoolean912)
					continue;
				class365_sub1_sub1_sub2 = class94.method1015(459581942);
			} else {
				if (i_51_ < i)
					class365_sub1_sub1_sub2 = aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_51_]];
				else
					class365_sub1_sub1_sub2 = ((Entity) (((Class298_Sub29) npcs.get((long) anIntArray8699[i_51_ - i])).anObject7366));
				if (648883167 * class365_sub1_sub1_sub2.anInt10071 < 0)
					continue;
			}
			int i_52_ = class365_sub1_sub1_sub2.getSize();
			Class217 class217 = class365_sub1_sub1_sub2.method4337().aClass217_2599;
			if (0 == (i_52_ & 0x1)) {
				if (((int) class217.aFloat2451 & 0x1ff) == 0 && 0 == ((int) class217.aFloat2454 & 0x1ff))
					continue;
			} else if (((int) class217.aFloat2451 & 0x1ff) == 256 && 256 == ((int) class217.aFloat2454 & 0x1ff))
				continue;
			class365_sub1_sub1_sub2.method4341(class217.aFloat2451, (float) Class356.method4271((int) class217.aFloat2451, (int) class217.aFloat2454, class365_sub1_sub1_sub2.plane, -1692137069), class217.aFloat2454);
			aClass283_8716.method2675(-1611682495).method4022(class365_sub1_sub1_sub2, true, (byte) 0);
		}
	}

	public static final void method2800(Class119 class119, IComponentDefinition[] class105s, int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
		for (int i_61_ = 0; i_61_ < class105s.length; i_61_++) {
			IComponentDefinition class105 = class105s[i_61_];
			if (class105 != null && 1573706803 * class105.anInt1160 == i) {
				int i_62_ = 1354508417 * class105.anInt1143 + i_57_;
				int i_63_ = -749038817 * class105.anInt1155 + i_58_;
				int i_64_;
				int i_65_;
				int i_66_;
				int i_67_;
				if (2 == -1215239439 * class105.anInt1144) {
					i_64_ = i_53_;
					i_65_ = i_54_;
					i_66_ = i_55_;
					i_67_ = i_56_;
				} else {
					int i_68_ = -2093041337 * class105.anInt1156 + i_62_;
					int i_69_ = class105.anInt1162 * 457937409 + i_63_;
					if (-1215239439 * class105.anInt1144 == 9) {
						i_68_++;
						i_69_++;
					}
					i_64_ = i_62_ > i_53_ ? i_62_ : i_53_;
					i_65_ = i_63_ > i_54_ ? i_63_ : i_54_;
					i_66_ = i_68_ < i_55_ ? i_68_ : i_55_;
					i_67_ = i_69_ < i_56_ ? i_69_ : i_56_;
				}
				if (0 != -1215239439 * class105.anInt1144 && !class105.aBoolean1238 && method2801(class105).settingsHash * -1266165749 == 0 && aClass105_8712 != class105
						&& (907611645 * class105.anInt1145 != IComponentDefinition.anInt1265 * 310968271) && (405143323 * IComponentDefinition.anInt1129 != 907611645 * class105.anInt1145)
						&& (-451364727 * IComponentDefinition.anInt1269 != 907611645 * class105.anInt1145) && (907611645 * class105.anInt1145 != -1997023283 * IComponentDefinition.anInt1123)) {
					if (i_64_ < i_66_ && i_65_ < i_67_)
						Class411.method5577(class105, -1954843749);
				} else if (!method2802(class105)) {
					if (aClass105_8850 == class105 && Class419.method5603(aClass105_8850, 1205106518)) {
						aBoolean8938 = true;
						anInt8861 = i_62_ * -1501079155;
						anInt8862 = -1873720993 * i_63_;
					}
					if (class105.aBoolean1220 || i_64_ < i_66_ && i_65_ < i_67_) {
						if (class105.aBoolean1165 && i_59_ >= i_64_ && i_60_ >= i_65_ && i_59_ < i_66_ && i_60_ < i_67_) {
							for (Script class298_sub46 = ((Script) aClass453_8893.method5939(1766612795)); class298_sub46 != null; class298_sub46 = ((Script) aClass453_8893.method5944(49146))) {
								if (class298_sub46.aBoolean7533) {
									class298_sub46.unlink(-1460969981);
									class298_sub46.aClass105_7525.aBoolean1294 = false;
								}
							}
							if (0 == Class82_Sub22.anInt6917 * 379282043) {
								aClass105_8850 = null;
								aClass105_8712 = null;
							}
							anInt8864 = 0;
							Class301_Sub1.aBoolean7628 = false;
							aBoolean8866 = false;
							if (!Class436.aBoolean5478)
								Class98_Sub2.method1065((byte) 9);
						}
						boolean bool = (class105.aBoolean1183 && 5 == -1215239439 * class105.anInt1144 && class105.anInt1223 * -1993792969 == 0 && class105.anInt1283 * 925824753 < 0 && -1232467723 * class105.anInt1280 == -1
								&& -1 == class105.anInt1289 * -324971993 && !class105.aBoolean1196 && 840270937 * class105.anInt1306 == 0);
						boolean bool_70_ = false;
						if ((Class165.recorder.getMouseX((byte) -29) >= i_64_) && (Class165.recorder.getMouseY((byte) -71) >= i_65_) && (Class165.recorder.getMouseX((byte) 22) < i_66_) && (Class165.recorder.getMouseY((byte) 45) < i_67_)) {
							if (bool) {
								Class117 class117 = class105.method1116((Class373.aClass_ra4071), 1065695472);
								if (class117 == null || (class105.anInt1156 * -2093041337 != class117.anInt1393 * 1633695381) || (class117.anInt1394 * -60174999 != 457937409 * class105.anInt1162))
									bool_70_ = true;
								else {
									int i_71_ = (Class165.recorder.getMouseX((byte) 110) - i_62_);
									int i_72_ = (Class165.recorder.getMouseY((byte) -27) - i_63_);
									if (i_72_ >= 0 && i_72_ < (class117.anIntArray1396).length) {
										int i_73_ = class117.anIntArray1396[i_72_];
										if (i_71_ >= i_73_ && (i_71_ <= i_73_ + (class117.anIntArray1395[i_72_])))
											bool_70_ = true;
									}
								}
							} else
								bool_70_ = true;
						}
						if (!aBoolean8835 && bool_70_) {
							if (class105.anInt1272 * -1200030067 >= 0)
								anInt8937 = class105.anInt1272 * -133568665;
							else if (class105.aBoolean1165)
								anInt8937 = 280458557;
						}
						if (!Class436.aBoolean5478 && bool_70_ && !class119.aBoolean1403)
							Class87.method971(class105, i_59_ - i_62_, i_60_ - i_63_, -1958017189);
						boolean bool_74_ = false;
						if (Class165.recorder.method3878(-591622557) && bool_70_)
							bool_74_ = true;
						boolean bool_75_ = false;
						Class298_Sub50 class298_sub50 = ((Class298_Sub50) aClass453_8827.method5939(1766612795));
						if (null != class298_sub50 && class298_sub50.method3546(-1372966703) == 0 && class298_sub50.method3547((byte) -35) >= i_64_ && class298_sub50.method3560(-2145889865) >= i_65_ && class298_sub50.method3547((byte) 43) < i_66_
								&& (class298_sub50.method3560(-2006325499) < i_67_)) {
							if (bool) {
								Class117 class117 = class105.method1116((Class373.aClass_ra4071), 1959642657);
								if (class117 == null || (-2093041337 * class105.anInt1156 != 1633695381 * class117.anInt1393) || (class117.anInt1394 * -60174999 != class105.anInt1162 * 457937409))
									bool_75_ = true;
								else {
									int i_76_ = (class298_sub50.method3547((byte) -40) - i_62_);
									int i_77_ = (class298_sub50.method3560(-1117555002) - i_63_);
									if (i_77_ >= 0 && i_77_ < (class117.anIntArray1396).length) {
										int i_78_ = class117.anIntArray1396[i_77_];
										if (i_76_ >= i_78_ && i_76_ <= (class117.anIntArray1395[i_77_]) + i_78_)
											bool_75_ = true;
									}
								}
							} else
								bool_75_ = true;
						}
						if (class105.aByteArray1185 != null && !Class423.method5734(-1797996523)) {
							for (int i_79_ = 0; i_79_ < class105.aByteArray1185.length; i_79_++) {
								if (!Class372.aClass323_4052.method3936(class105.aByteArray1185[i_79_], 2064123957)) {
									if (class105.anIntArray1305 != null)
										class105.anIntArray1305[i_79_] = 0;
								} else if (class105.anIntArray1305 == null || (443738891 * anInt8884 >= (class105.anIntArray1305[i_79_]))) {
									byte i_80_ = class105.aByteArray1222[i_79_];
									if (0 == i_80_ || (((i_80_ & 0x8) == 0 || (!(Class372.aClass323_4052.method3936(86, -229313729)) && !(Class372.aClass323_4052.method3936(82, 328550876)) && !(Class372.aClass323_4052.method3936(81, 1628571302))))
											&& ((i_80_ & 0x2) == 0 || (Class372.aClass323_4052.method3936(86, -1332099546))) && (0 == (i_80_ & 0x1) || (Class372.aClass323_4052.method3936(82, 343135989)))
											&& ((i_80_ & 0x4) == 0 || (Class372.aClass323_4052.method3936(81, 883110115))))) {
										if (i_79_ < 10)
											Class301_Sub1.method3713(i_79_ + 1, (-440872681 * class105.anInt1142), (class105.anInt1154 * -1309843523), "", -1542002795);
										else if (10 == i_79_) {
											Class144.method1587((byte) 4);
											IComponentSettings settings = method2801(class105);
											Class147.method1600(class105, settings.method3497((byte) -4), (settings.anInt7410 * -1133219011), 1387537939);
											aString8838 = (Class88.method977(class105, -1213150980));
											if (aString8838 == null)
												aString8838 = "Null";
											aString8754 = new StringBuilder().append(class105.aString1228).append(Class285.method2709(16777215, -1325844551)).toString();
										}
										int i_81_ = class105.anIntArray1276[i_79_];
										if (class105.anIntArray1305 == null)
											class105.anIntArray1305 = (new int[(class105.aByteArray1185).length]);
										if (0 != i_81_)
											class105.anIntArray1305[i_79_] = (i_81_ + 443738891 * anInt8884);
										else
											class105.anIntArray1305[i_79_] = 2147483647;
									}
								}
							}
						}
						if (bool_75_)
							Class523.method6330(class105, class298_sub50.method3547((byte) 0) - i_62_, class298_sub50.method3560(-779478067) - i_63_, 1509566402);
						if (aClass105_8850 != null && class105 != aClass105_8850 && bool_70_ && method2801(class105).method3494(230946951))
							aClass105_8854 = class105;
						if (aClass105_8712 == class105) {
							aBoolean8855 = true;
							anInt8856 = 1246614319 * i_62_;
							anInt8800 = i_63_ * -429639553;
							anInt8858 = -1332645491 * aClass105_8712.anInt1156;
							anInt8966 = -85522485 * aClass105_8712.anInt1162;
						}
						if (class105.aBoolean1238 || 0 != class105.anInt1145 * 907611645) {
							if (bool_70_ && 0 != anInt8682 * 1170859143 && class105.anObjectArray1229 != null) {
								Script class298_sub46 = new Script();
								class298_sub46.aBoolean7533 = true;
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.anInt7527 = -1937115609 * anInt8682;
								class298_sub46.params = class105.anObjectArray1229;
								aClass453_8893.method5935(class298_sub46, 1704998047);
							}
							if (null != aClass105_8850) {
								bool_75_ = false;
								bool_74_ = false;
							} else if (Class436.aBoolean5478 || ((907611645 * class105.anInt1145 != 826979979 * IComponentDefinition.anInt1126) && anInt8864 * -651858367 > 0)) {
								bool_75_ = false;
								bool_74_ = false;
								bool_70_ = false;
							}
							if (class105.anInt1145 * 907611645 != 0) {
								if ((-451364727 * IComponentDefinition.anInt1269 == 907611645 * class105.anInt1145) || (907611645 * class105.anInt1145 == IComponentDefinition.anInt1123 * -1997023283)) {
									aClass105_8819 = class105;
									Class385 class385 = aClass283_8716.method2640((byte) -11).method4316((byte) -85);
									if ((class385.method4710((byte) -111) != null) && !Class62.aClass248_612.method2380(16777472))
										class385.method4710((byte) -126).method2588(Class373.aClass_ra4071, class105.anInt1162 * 457937409, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub19_7567.method5695(-1741518508), 1359487645);
									if ((IComponentDefinition.anInt1269 * -451364727 == class105.anInt1145 * 907611645) && !Class436.aBoolean5478 && i_59_ >= i_64_ && i_60_ >= i_65_ && i_59_ < i_66_ && i_60_ < i_67_) {
										Class98.method1055((Class373.aClass_ra4071), i_59_, i_60_, 132816560);
										for (Class302_Sub5 class302_sub5 = ((Class302_Sub5) (aClass442_8781.method5868(-16777216))); null != class302_sub5; class302_sub5 = ((Class302_Sub5) (aClass442_8781.method5872(266564001)))) {
											if (i_59_ >= (-1082644483 * (((Class302_Sub5) class302_sub5).anInt7659)) && i_59_ < (-989655965 * (((Class302_Sub5) class302_sub5).anInt7664))
													&& i_60_ >= ((((Class302_Sub5) class302_sub5).anInt7663) * 614770279) && i_60_ < (-252204233 * (((Class302_Sub5) class302_sub5).anInt7665))) {
												Class98_Sub2.method1065((byte) 112);
												Class91.method1001((((Class302_Sub5) class302_sub5).aClass365_Sub1_Sub1_Sub2_7660), (byte) -86);
											}
										}
									}
									int i_82_ = Class10.anInt129 * 1168366243;
									int[] is = Class10.anIntArray135;
									for (int i_83_ = 0; i_83_ < i_82_; i_83_++) {
										Player class365_sub1_sub1_sub2_sub2 = (aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_83_]]);
										if (null != class365_sub1_sub1_sub2_sub2) {
											Class62.method729(Class502.aClass502_6716, -1, -1, class365_sub1_sub1_sub2_sub2, is[i_83_], (byte) -7);
											class365_sub1_sub1_sub2_sub2.method4413(i_64_, i_65_, i_66_, i_67_, i_62_ - (class105.anInt1166 * 684246511), i_63_ - (class105.anInt1167 * -1424956747), i_59_, i_60_, 744800283);
										}
									}
									for (int i_84_ = 0; i_84_ < -1230451913 * anInt8703; i_84_++) {
										int i_85_ = anIntArray8699[i_84_];
										Class298_Sub29 class298_sub29 = ((Class298_Sub29) npcs.get((long) i_85_));
										if (null != class298_sub29) {
											Class62.method729(Class502.aClass502_6720, (-407713023 * (((NPC) (class298_sub29.anObject7366)).aClass503_10190.anInt6126)), -1, ((Entity) class298_sub29.anObject7366), i_85_, (byte) -73);
											((Entity) class298_sub29.anObject7366).method4413(i_64_, i_65_, i_66_, i_67_, i_62_ - (class105.anInt1166 * 684246511), i_63_ - (class105.anInt1167 * -1424956747), i_59_, i_60_, 744800283);
										}
									}
									continue;
								}
								if (310968271 * IComponentDefinition.anInt1265 == 907611645 * class105.anInt1145) {
									Class117 class117 = class105.method1116((Class373.aClass_ra4071), 842748651);
									if (class117 != null && (0 == -64305285 * Class3.anInt56 || Class3.anInt56 * -64305285 == 3) && !Class436.aBoolean5478 && i_59_ >= i_64_ && i_60_ >= i_65_ && i_59_ < i_66_ && i_60_ < i_67_) {
										int i_86_ = i_59_ - i_62_;
										int i_87_ = i_60_ - i_63_;
										int i_88_ = class117.anIntArray1396[i_87_];
										if (i_86_ >= i_88_ && i_86_ <= (class117.anIntArray1395[i_87_]) + i_88_) {
											i_86_ -= (class105.anInt1156 * -2093041337 / 2);
											i_87_ -= (457937409 * class105.anInt1162 / 2);
											int i_89_;
											if (2 == (-863531439 * Class298_Sub1.anInt7164))
												i_89_ = ((int) aFloat8949 & 0x3fff);
											else
												i_89_ = (((int) aFloat8949 + (anInt8801 * 1227356013)) & 0x3fff);
											int i_90_ = (Class220.anIntArray2483[i_89_]);
											int i_91_ = (Class220.anIntArray2474[i_89_]);
											if ((Class298_Sub1.anInt7164 * -863531439) != 2) {
												i_90_ = ((256 + (356727603 * anInt8749)) * i_90_) >> 8;
												i_91_ = (anInt8749 * 356727603 + 256) * i_91_ >> 8;
											}
											int i_92_ = ((i_86_ * i_91_ + i_87_ * i_90_) >> 14);
											int i_93_ = ((i_87_ * i_91_ - i_90_ * i_86_) >> 14);
											int i_94_;
											int i_95_;
											if (2 == -863531439 * (Class298_Sub1.anInt7164)) {
												i_94_ = (-2080858977 * anInt8753 >> 9) + (i_92_ >> 2);
												i_95_ = (anInt8755 * 1818837461 >> 9) - (i_93_ >> 2);
											} else {
												int i_96_ = ((Class287.myPlayer.getSize()) - 1) * 256;
												Class217 class217 = (Class287.myPlayer.method4337().aClass217_2599);
												i_94_ = ((i_92_ >> 2) + (((int) (class217.aFloat2451) - i_96_) >> 9));
												i_95_ = (((int) (class217.aFloat2454) - i_96_) >> 9) - (i_93_ >> 2);
											}
											if (aBoolean8835 && ((-112110875 * Linkable.anInt3192) & 0x40) != 0) {
												IComponentDefinition class105_97_ = (Class140.method1558((1262526353 * Class379.anInt4099), 392084321 * anInt8836, -156511736));
												if (class105_97_ != null)
													Class234.method2174(aString8838, new StringBuilder().append(" ").append(Class26.aString351).toString(), (697885143 * (Class240.anInt2704)), 59, (-1232467723 * (class105.anInt1280)), 1L, i_94_,
															i_95_, true, false, (long) (((-1309843523 * (class105.anInt1154)) << 32) | ((class105.anInt1142) * -440872681)), true, -1552213884);
												else
													Class144.method1587((byte) 4);
											} else {
												if (Class411.aClass411_5316 == aClass411_8944)
													Class234.method2174((Tradution.aClass470_5910.method6049((Class321.aClass429_3357), -875414210)), "", -1, 60, -1, 1L, i_94_, i_95_, true, false, 0L, true, -1517476672);
												Class234.method2174(Class82_Sub6.aString6845, "", -1471730241 * anInt8822, 23, -1, 1L, i_94_, i_95_, true, false, 0L, true, -1229159943);
											}
										}
									}
									continue;
								}
								if (class105.anInt1145 * 907611645 == 826979979 * IComponentDefinition.anInt1126) {
									Class113.aClass105_1373 = class105;
									if (bool_70_)
										Class301_Sub1.aBoolean7628 = true;
									if (bool_75_) {
										int i_98_ = (int) ((double) ((class298_sub50.method3547((byte) -16)) - i_62_ - (-2093041337 * (class105.anInt1156) / 2)) * 2.0 / (double) (Class301.aFloat3233));
										int i_99_ = (int) -((double) ((class298_sub50.method3560(-890591574)) - i_63_ - (457937409 * (class105.anInt1162) / 2)) * 2.0 / (double) (Class301.aFloat3233));
										int i_100_ = (i_98_ + (Class82_Sub14.anInt6875 * 1196508279) + Class301.anInt3245);
										int i_101_ = (Class301.anInt3238 + (i_99_ + (Class376.anInt4090 * 1882038855)));
										Class298_Sub37_Sub13 class298_sub37_sub13 = Class298_Sub7.method2864(-360398838);
										if (null != class298_sub37_sub13) {
											int[] is = new int[3];
											class298_sub37_sub13.method3451(i_100_, i_101_, is, -1054516511);
											if (null != is) {
												if ((Class372.aClass323_4052.method3936(82, 1232426176)) && (1806357379 * playerRights > 0)) {
													Class476.teleport(is[0], is[1], is[2], 1774070906);
													continue;
												}
												aBoolean8866 = true;
												Class241.anInt2706 = is[0] * -938951349;
												Class98.anInt950 = -1364790753 * is[1];
												Class221.anInt6663 = is[2] * 1686622783;
											}
											anInt8864 = 640786881;
											aBoolean8865 = false;
											anInt8734 = (Class165.recorder.getMouseX((byte) 32) * -344812543);
											anInt8853 = (Class165.recorder.getMouseY((byte) 45) * -1376922141);
										}
									} else if (bool_74_ && anInt8864 * -651858367 > 0) {
										if (1 == anInt8864 * -651858367 && ((-98735103 * anInt8734 != (Class165.recorder.getMouseX((byte) -21))) || (-938469429 * anInt8853 != (Class165.recorder.getMouseY((byte) 40))))) {
											Class401.anInt6562 = (Class82_Sub14.anInt6875 * -880153251);
											Class441.anInt5589 = (Class376.anInt4090 * 1849990747);
											anInt8864 = 1281573762;
										}
										if (2 == -651858367 * anInt8864) {
											aBoolean8865 = true;
											Class77.method842(((Class401.anInt6562 * 100354019) + (int) ((double) ((-98735103 * anInt8734) - (Class165.recorder.getMouseX((byte) 13))) * 2.0 / (double) (Class301.aFloat3234))), (short) 1347);
											Class352.method4246(((-1026644091 * Class441.anInt5589) - (int) ((double) ((-938469429 * anInt8853) - (Class165.recorder.getMouseY((byte) -70))) * 2.0 / (double) (Class301.aFloat3234))), (byte) 44);
										}
									} else {
										if (-651858367 * anInt8864 > 0 && !aBoolean8865) {
											if ((anInt8830 * 2089115297 == 1 || (Class58.method694(-1803643567))) && (-278777595 * Class436.anInt5506) > 2)
												Class63.method738(-98735103 * anInt8734, anInt8853 * -938469429, -2029149482);
											else if (Class63.method740(2130342678))
												Class63.method738(anInt8734 * -98735103, -938469429 * anInt8853, -2029149482);
										}
										anInt8864 = 0;
									}
									continue;
								}
								if (IComponentDefinition.anInt1127 * -283863983 == class105.anInt1145 * 907611645) {
									if (bool_74_)
										Class74.method831((Class165.recorder.getMouseX((byte) -30) - i_62_), (Class165.recorder.getMouseY((byte) 50) - i_63_), -2093041337 * class105.anInt1156, 457937409 * class105.anInt1162, -2108838735);
									continue;
								}
								if (907611645 * class105.anInt1145 == 405143323 * IComponentDefinition.anInt1129) {
									Class82_Sub17.method918(class105, i_62_, i_63_, -462358504);
									continue;
								}
							}
							if (!class105.aBoolean1295 && bool_75_) {
								class105.aBoolean1295 = true;
								if (class105.anObjectArray1240 != null) {
									Script class298_sub46 = new Script();
									class298_sub46.aBoolean7533 = true;
									class298_sub46.aClass105_7525 = class105;
									class298_sub46.anInt7526 = (class298_sub50.method3547((byte) 70) - i_62_) * 622624491;
									class298_sub46.anInt7527 = (class298_sub50.method3560(-1664921845) - i_63_) * 335112545;
									class298_sub46.params = class105.anObjectArray1240;
									aClass453_8893.method5935(class298_sub46, 1397555107);
								}
							}
							if (class105.aBoolean1295 && bool_74_ && class105.anObjectArray1263 != null) {
								Script class298_sub46 = new Script();
								class298_sub46.aBoolean7533 = true;
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.anInt7526 = (Class165.recorder.getMouseX((byte) -5) - i_62_) * 622624491;
								class298_sub46.anInt7527 = (Class165.recorder.getMouseY((byte) 20) - i_63_) * 335112545;
								class298_sub46.params = class105.anObjectArray1263;
								aClass453_8893.method5935(class298_sub46, 521504192);
							}
							if (class105.aBoolean1295 && !bool_74_) {
								class105.aBoolean1295 = false;
								if (null != class105.anObjectArray1150) {
									Script class298_sub46 = new Script();
									class298_sub46.aBoolean7533 = true;
									class298_sub46.aClass105_7525 = class105;
									class298_sub46.anInt7526 = (Class165.recorder.getMouseX((byte) -46) - i_62_) * 622624491;
									class298_sub46.anInt7527 = (Class165.recorder.getMouseY((byte) -116) - i_63_) * 335112545;
									class298_sub46.params = class105.anObjectArray1150;
									aClass453_8895.method5935(class298_sub46, 544676739);
								}
							}
							if (bool_74_ && null != class105.anObjectArray1243) {
								Script class298_sub46 = new Script();
								class298_sub46.aBoolean7533 = true;
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.anInt7526 = (Class165.recorder.getMouseX((byte) 84) - i_62_) * 622624491;
								class298_sub46.anInt7527 = (Class165.recorder.getMouseY((byte) 88) - i_63_) * 335112545;
								class298_sub46.params = class105.anObjectArray1243;
								aClass453_8893.method5935(class298_sub46, 1121649679);
							}
							if (!class105.aBoolean1294 && bool_70_) {
								class105.aBoolean1294 = true;
								if (class105.anObjectArray1244 != null) {
									Script class298_sub46 = new Script();
									class298_sub46.aBoolean7533 = true;
									class298_sub46.aClass105_7525 = class105;
									class298_sub46.anInt7526 = (Class165.recorder.getMouseX((byte) 77) - i_62_) * 622624491;
									class298_sub46.anInt7527 = (Class165.recorder.getMouseY((byte) 43) - i_63_) * 335112545;
									class298_sub46.params = class105.anObjectArray1244;
									aClass453_8893.method5935(class298_sub46, -424737725);
								}
							}
							if (class105.aBoolean1294 && bool_70_ && null != class105.anObjectArray1245) {
								Script class298_sub46 = new Script();
								class298_sub46.aBoolean7533 = true;
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.anInt7526 = (Class165.recorder.getMouseX((byte) 71) - i_62_) * 622624491;
								class298_sub46.anInt7527 = (Class165.recorder.getMouseY((byte) -47) - i_63_) * 335112545;
								class298_sub46.params = class105.anObjectArray1245;
								aClass453_8893.method5935(class298_sub46, 1191346239);
							}
							if (class105.aBoolean1294 && !bool_70_) {
								class105.aBoolean1294 = false;
								if (null != class105.anObjectArray1122) {
									Script class298_sub46 = new Script();
									class298_sub46.aBoolean7533 = true;
									class298_sub46.aClass105_7525 = class105;
									class298_sub46.anInt7526 = (Class165.recorder.getMouseX((byte) 44) - i_62_) * 622624491;
									class298_sub46.anInt7527 = (Class165.recorder.getMouseY((byte) 29) - i_63_) * 335112545;
									class298_sub46.params = class105.anObjectArray1122;
									aClass453_8895.method5935(class298_sub46, 1896898026);
								}
							}
							if (null != class105.anObjectArray1209) {
								Script class298_sub46 = new Script();
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.params = class105.anObjectArray1209;
								aClass453_8660.method5935(class298_sub46, 1662348001);
							}
							if (class105.anObjectArray1200 != null && (116700579 * anInt8877 > -1690676599 * class105.anInt1300)) {
								if (null == class105.anIntArray1258 || ((116700579 * anInt8877 - -1690676599 * class105.anInt1300) > 32)) {
									Script class298_sub46 = new Script();
									class298_sub46.aClass105_7525 = class105;
									class298_sub46.params = class105.anObjectArray1200;
									aClass453_8893.method5935(class298_sub46, 502102502);
								} else {
									while_122_: for (int i_102_ = (-1690676599 * class105.anInt1300); i_102_ < anInt8877 * 116700579; i_102_++) {
										int i_103_ = anIntArray8876[i_102_ & 0x1f];
										for (int i_104_ = 0; i_104_ < (class105.anIntArray1258).length; i_104_++) {
											if (i_103_ == (class105.anIntArray1258[i_104_])) {
												Script class298_sub46 = new Script();
												class298_sub46.aClass105_7525 = class105;
												class298_sub46.params = (class105.anObjectArray1200);
												aClass453_8893.method5935(class298_sub46, 1623160189);
												break while_122_;
											}
										}
									}
								}
								class105.anInt1300 = -1610191925 * anInt8877;
							}
							if (null != class105.anObjectArray1157 && (-466597939 * anInt8879 > -954704559 * class105.anInt1301)) {
								if (null == class105.anIntArray1260 || ((-466597939 * anInt8879 - class105.anInt1301 * -954704559) > 32)) {
									Script class298_sub46 = new Script();
									class298_sub46.aClass105_7525 = class105;
									class298_sub46.params = class105.anObjectArray1157;
									aClass453_8893.method5935(class298_sub46, 1651648237);
								} else {
									while_123_: for (int i_105_ = -954704559 * class105.anInt1301; i_105_ < anInt8879 * -466597939; i_105_++) {
										int i_106_ = anIntArray8787[i_105_ & 0x1f];
										for (int i_107_ = 0; i_107_ < (class105.anIntArray1260).length; i_107_++) {
											if (class105.anIntArray1260[i_107_] == i_106_) {
												Script class298_sub46 = new Script();
												class298_sub46.aClass105_7525 = class105;
												class298_sub46.params = (class105.anObjectArray1157);
												aClass453_8893.method5935(class298_sub46, 1953578472);
												break while_123_;
											}
										}
									}
								}
								class105.anInt1301 = anInt8879 * -1362594883;
							}
							if (null != class105.anObjectArray1177 && (anInt8783 * -1667357449 > 942876795 * class105.anInt1288)) {
								if (null == class105.anIntArray1188 || ((anInt8783 * -1667357449 - class105.anInt1288 * 942876795) > 32)) {
									Script class298_sub46 = new Script();
									class298_sub46.aClass105_7525 = class105;
									class298_sub46.params = class105.anObjectArray1177;
									aClass453_8893.method5935(class298_sub46, 2005476208);
								} else {
									while_124_: for (int i_108_ = 942876795 * class105.anInt1288; i_108_ < anInt8783 * -1667357449; i_108_++) {
										int i_109_ = anIntArray8874[i_108_ & 0x1f];
										for (int i_110_ = 0; i_110_ < (class105.anIntArray1188).length; i_110_++) {
											if (i_109_ == (class105.anIntArray1188[i_110_])) {
												Script class298_sub46 = new Script();
												class298_sub46.aClass105_7525 = class105;
												class298_sub46.params = (class105.anObjectArray1177);
												aClass453_8893.method5935(class298_sub46, 1394697778);
												break while_124_;
											}
										}
									}
								}
								class105.anInt1288 = 1037546165 * anInt8783;
							}
							if (class105.anObjectArray1172 != null && (1610062389 * anInt8873 > -745327741 * class105.anInt1298)) {
								if (null == class105.anIntArray1254 || ((anInt8873 * 1610062389 - -745327741 * class105.anInt1298) > 32)) {
									Script class298_sub46 = new Script();
									class298_sub46.aClass105_7525 = class105;
									class298_sub46.params = class105.anObjectArray1172;
									aClass453_8893.method5935(class298_sub46, 1555874647);
								} else {
									while_125_: for (int i_111_ = class105.anInt1298 * -745327741; i_111_ < anInt8873 * 1610062389; i_111_++) {
										int i_112_ = anIntArray8823[i_111_ & 0x1f];
										for (int i_113_ = 0; i_113_ < (class105.anIntArray1254).length; i_113_++) {
											if (class105.anIntArray1254[i_113_] == i_112_) {
												Script class298_sub46 = new Script();
												class298_sub46.aClass105_7525 = class105;
												class298_sub46.params = (class105.anObjectArray1172);
												aClass453_8893.method5935(class298_sub46, -117285712);
												break while_125_;
											}
										}
									}
								}
								class105.anInt1298 = anInt8873 * 914240999;
							}
							if (class105.anObjectArray1255 != null && (-1048955195 * anInt8875 > -670133479 * class105.anInt1299)) {
								if (class105.anIntArray1256 == null || ((anInt8875 * -1048955195 - -670133479 * class105.anInt1299) > 32)) {
									Script class298_sub46 = new Script();
									class298_sub46.aClass105_7525 = class105;
									class298_sub46.params = class105.anObjectArray1255;
									aClass453_8893.method5935(class298_sub46, 1231950426);
								} else {
									while_126_: for (int i_114_ = -670133479 * class105.anInt1299; i_114_ < anInt8875 * -1048955195; i_114_++) {
										int i_115_ = anIntArray8833[i_114_ & 0x1f];
										for (int i_116_ = 0; i_116_ < (class105.anIntArray1256).length; i_116_++) {
											if (class105.anIntArray1256[i_116_] == i_115_) {
												Script class298_sub46 = new Script();
												class298_sub46.aClass105_7525 = class105;
												class298_sub46.params = (class105.anObjectArray1255);
												aClass453_8893.method5935(class298_sub46, 1221126976);
												break while_126_;
											}
										}
									}
								}
								class105.anInt1299 = anInt8875 * -715849075;
							}
							if (class105.anObjectArray1261 != null && (-1653538697 * anInt8881 > 1544416945 * class105.anInt1302)) {
								if (null == class105.anIntArray1189 || ((anInt8881 * -1653538697 - class105.anInt1302 * 1544416945) > 32)) {
									Script class298_sub46 = new Script();
									class298_sub46.aClass105_7525 = class105;
									class298_sub46.params = class105.anObjectArray1261;
									aClass453_8893.method5935(class298_sub46, -118981685);
								} else {
									while_127_: for (int i_117_ = 1544416945 * class105.anInt1302; i_117_ < -1653538697 * anInt8881; i_117_++) {
										int i_118_ = anIntArray8880[i_117_ & 0x1f];
										for (int i_119_ = 0; i_119_ < (class105.anIntArray1189).length; i_119_++) {
											if (i_118_ == (class105.anIntArray1189[i_119_])) {
												Script class298_sub46 = new Script();
												class298_sub46.aClass105_7525 = class105;
												class298_sub46.params = (class105.anObjectArray1261);
												aClass453_8893.method5935(class298_sub46, 337274912);
												break while_127_;
											}
										}
									}
								}
								class105.anInt1302 = -1196442713 * anInt8881;
							}
							if ((538810253 * anInt8882 > 1916751821 * class105.anInt1215) && null != class105.anObjectArray1267) {
								Script class298_sub46 = new Script();
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.params = class105.anObjectArray1267;
								aClass453_8893.method5935(class298_sub46, 873474299);
							}
							if ((605488971 * anInt8883 > class105.anInt1215 * 1916751821) && null != class105.anObjectArray1285) {
								Script class298_sub46 = new Script();
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.params = class105.anObjectArray1285;
								aClass453_8893.method5935(class298_sub46, 1133301081);
							}
							if ((anInt8912 * -2049433257 > class105.anInt1215 * 1916751821) && null != class105.anObjectArray1270) {
								Script class298_sub46 = new Script();
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.params = class105.anObjectArray1270;
								aClass453_8893.method5935(class298_sub46, 2128380863);
							}
							if ((anInt8885 * -570891387 > class105.anInt1215 * 1916751821) && null != class105.anObjectArray1271) {
								Script class298_sub46 = new Script();
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.params = class105.anObjectArray1271;
								aClass453_8893.method5935(class298_sub46, 967792354);
							}
							if ((-707528081 * anInt8886 > class105.anInt1215 * 1916751821) && class105.anObjectArray1287 != null) {
								Script class298_sub46 = new Script();
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.params = class105.anObjectArray1287;
								aClass453_8893.method5935(class298_sub46, 1183468985);
							}
							if ((-53597277 * anInt8796 > class105.anInt1215 * 1916751821) && null != class105.anObjectArray1274) {
								Script class298_sub46 = new Script();
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.params = class105.anObjectArray1274;
								aClass453_8893.method5935(class298_sub46, 1170867246);
							}
							if ((anInt8888 * -1961929885 > 1916751821 * class105.anInt1215) && null != class105.anObjectArray1273) {
								Script class298_sub46 = new Script();
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.params = class105.anObjectArray1273;
								aClass453_8893.method5935(class298_sub46, 1238026704);
							}
							class105.anInt1215 = anInt8933 * -1380945021;
							if (null != class105.anObjectArray1268) {
								for (int i_120_ = 0; i_120_ < 1351936279 * anInt8894; i_120_++) {
									Script class298_sub46 = new Script();
									class298_sub46.aClass105_7525 = class105;
									class298_sub46.anInt7532 = (anInterface16Array8710[i_120_].method218((byte) -58) * 615642911);
									class298_sub46.anInt7531 = (anInterface16Array8710[i_120_].method217((byte) -10) * 100528189);
									class298_sub46.params = class105.anObjectArray1268;
									aClass453_8893.method5935(class298_sub46, 1490051014);
								}
							}
							if (aBoolean8775 && null != class105.anObjectArray1277) {
								Script class298_sub46 = new Script();
								class298_sub46.aClass105_7525 = class105;
								class298_sub46.params = class105.anObjectArray1277;
								aClass453_8893.method5935(class298_sub46, 693108400);
							}
						}
						if (class105.anInt1144 * -1215239439 == 5 && -1 != 925824753 * class105.anInt1283)
							class105.method1121(ConfigDefinitions.aClass317_3472, Class138_Sub1.aClass131_7010, 1204090508).method2588(Class373.aClass_ra4071, class105.anInt1162 * 457937409,
									Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub19_7567.method5695(-1741518508), 961658636);
						Class411.method5577(class105, -1825904339);
						if (class105.anInt1144 * -1215239439 == 0) {
							method2800(class119, class105s, class105.anInt1142 * -440872681, i_64_, i_65_, i_66_, i_67_, i_62_ - class105.anInt1166 * 684246511, (i_63_ - -1424956747 * class105.anInt1167), i_59_, i_60_);
							if (null != class105.aClass105Array1293)
								method2800(class119, class105.aClass105Array1293, -440872681 * class105.anInt1142, i_64_, i_65_, i_66_, i_67_, (i_62_ - class105.anInt1166 * 684246511), i_63_ - (-1424956747 * class105.anInt1167), i_59_, i_60_);
							Interface class298_sub51 = (Interface) (aClass437_8841.get((long) (class105.anInt1142 * -440872681)));
							if (class298_sub51 != null) {
								if (aClass411_8944 == Class411.aClass411_5320 && 0 == 27137839 * class298_sub51.clipped && !Class436.aBoolean5478 && bool_70_ && !aBoolean8846)
									Class98_Sub2.method1065((byte) 51);
								Class298_Sub32_Sub26.method3307(class298_sub51, -1617025021 * class298_sub51.interfaceId, i_64_, i_65_, i_66_, i_67_, i_62_, i_63_, i_59_, i_60_, (byte) 34);
							}
						}
					}
				}
			}
		}
	}

	public static IComponentSettings method2801(IComponentDefinition class105) {
		IComponentSettings class298_sub38 = ((IComponentSettings) aClass437_8896.get((long) (-1309843523 * class105.anInt1154) + ((long) (class105.anInt1142 * -440872681) << 32)));
		return (null != class298_sub38 ? class298_sub38 : class105.iComponentSettings);
	}

	static boolean method2802(IComponentDefinition class105) {
		if (aBoolean8846) {
			if (method2801(class105).settingsHash * -1266165749 != 0)
				return false;
			if (-1215239439 * class105.anInt1144 == 0)
				return false;
		}
		return class105.aBoolean1161;
	}

	static {
		aBoolean8638 = false;
		aBoolean8639 = false;
		aString8927 = null;
		anInt8665 = 0;
		anInt8971 = 0;
		aBoolean8643 = false;
		aByteArray8843 = null;
		aLong8645 = 0L;
		aBoolean8646 = false;
		aBoolean8647 = false;
		aString8648 = null;
		aString8649 = null;
		aBoolean8867 = false;
		aBoolean8651 = false;
		aBoolean8958 = false;
		aBoolean8653 = false;
		anInt8654 = 431443955;
		aString8655 = null;
		aString8656 = null;
		anInt8752 = 121508348;
		aClass233_8658 = new Matrix4f();
		aClass222_8871 = new Matrix3f();
		aClass222_8968 = new Matrix3f();
		aLong8782 = 0L;
		aBoolean8662 = false;
		aBoolean8663 = true;
		anInt8677 = 0;
		anInt8884 = 0;
		aBoolean8666 = true;
		aBoolean8667 = false;
		aBoolean8668 = false;
		anInt8669 = 0;
		aClass19Array8869 = new Class19[8];
		aClass299Array8671 = new Class299[9];
		aBoolean8672 = false;
		aBoolean8673 = false;
		aBoolean8674 = true;
		clientKey = (long) (Math.random() * 9.999999999E9) * -2884790245004171741L;
		aBoolean8676 = false;
		anInt8814 = 0;
		aBoolean8806 = false;
		anInt8723 = 0;
		aBoolean8680 = false;
		aClass453_8827 = new Class453();
		anInt8682 = 0;
		anInt8894 = 0;
		anInterface16Array8710 = new Interface16[128];
		anInt8687 = 0;
		anInterface16Array8688 = new Interface16[79];
		aColorArray8689 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };
		aColorArray8701 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };
		aColorArray8691 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };
		handshakeStage = 0;
		anInt8887 = 0;
		anInt8694 = 0;
		aClass348_8780 = new Class348(4);
		aClass348_8898 = new Class348(4);
		aClass348_8697 = new Class348(8);
		aString8698 = null;
		anInterface10_8700 = new Class238();
		npcs = new HashTable(64);
		aClass298_Sub29Array8816 = new Class298_Sub29[1024];
		anInt8772 = 0;
		anInt8703 = 0;
		anIntArray8699 = new int[1024];
		anInt8808 = 0;
		anIntArray8706 = new int[258];
		anInt8707 = 0;
		anInt8708 = 0;
		anIntArray8709 = new int[1012];
		lobbyConnection = new BufferedConnectionContext();
		gameConnection = new BufferedConnectionContext();
		connectionContexts = new BufferedConnectionContext[] { gameConnection, lobbyConnection };
		anInt8713 = 0;
		aBoolean8714 = false;
		aClass404_8715 = new Class404();
		aClass283_8716 = new Class283(false);
		aBoolean8717 = false;
		anObject8718 = new Object();
		anObject8661 = new Object();
		anIntArray8751 = new int[64];
		anInt8721 = 0;
		anIntArray8739 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		anInt8870 = -221729505;
		anInt8724 = -1334571751;
		aBoolean8725 = false;
		anInt8726 = 733205975;
		anInt8930 = 0;
		anInt8728 = 652594363;
		anInt8737 = -60133325;
		anInt8681 = 1875737127;
		anInt8731 = 0;
		anInt8732 = 0;
		anInt8720 = 0;
		anIntArray8735 = new int[4096];
		anIntArray8847 = new int[4096];
		calculatedScenePositionXs = new int[50];
		calculatedScenePositionYs = new int[50];
		anIntArray8918 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
		anInt8817 = 0;
		anInt8741 = -57270710;
		anInt8742 = 0;
		anInt8826 = -792852734;
		anInt8744 = 0;
		anInt8745 = 901405925;
		anInt8746 = 0;
		anInt8801 = 0;
		anInt8878 = -640741266;
		anInt8749 = 0;
		anInt8972 = 999313729;
		anInt8810 = 0;
		aRandom8702 = new Random();
		anInt8961 = 0;
		anInt8753 = 0;
		anInt8755 = 0;
		aFloat8757 = 1044.0F;
		aFloat8949 = 0.0F;
		aFloat8759 = 0.0F;
		aFloat8760 = 0.0F;
		aBoolean8761 = false;
		aBoolean8762 = false;
		aBoolean8763 = true;
		anInt8764 = 0;
		anIntArrayArrayArray8767 = new int[2][][];
		anInt8768 = -1723181617;
		anInt8769 = 2694169;
		anInt8770 = 0;
		anInt8771 = 0;
		anInt8857 = 0;
		anInt8852 = 0;
		anInt8774 = 0;
		aBoolean8775 = false;
		aBoolean8776 = false;
		anInt8777 = 0;
		anIntArray8851 = new int[511];
		anIntArray8779 = new int[513];
		anInt8659 = 0;
		aClass442_8781 = new Class442();
		anInt8903 = 0;
		aFloatArray8891 = new float[3];
		anInt8784 = 0;
		anInt8785 = 0;
		anInt8786 = 0;
		anInt8748 = 0;
		anInt8788 = 0;
		anInt8792 = 1225211529;
		anIntArray8793 = new int[2];
		anIntArray8670 = new int[2];
		anIntArray8795 = new int[2];
		anIntArray8641 = new int[2];
		anIntArray8797 = new int[2];
		aLong8798 = 0L;
		aBoolean8799 = true;
		anInt8727 = 421892320;
		anInt8910 = -1413813424;
		anInt8794 = 1384393775;
		anInt8803 = -1146614829;
		aClass365_Sub1_Sub1_Sub2_Sub2Array8805 = new Player[2048];
		playerIndex = -1448461709;
		aBoolean8807 = false;
		isMemberWorld = false;
		playerRights = 0;
		anInt8932 = 0;
		aBoolean8811 = false;
		aBoolean8812 = false;
		aBoolean8813 = false;
		aBoolean8640 = false;
		aBoolean8815 = true;
		aBoolean8802 = false;
		aShortArray8818 = new short[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		anIntArray8904 = new int[8];
		aStringArray8820 = new String[8];
		aBooleanArray8821 = new boolean[8];
		anInt8822 = -812630591;
		groundItems = new HashTable(64);
		aClass453_8824 = new Class453();
		aClass437_8825 = new HashTable(16);
		aClass442_8650 = new Class442();
		anIntArray8924 = new int[25];
		anIntArray8828 = new int[25];
		anIntArray8829 = new int[25];
		anInt8830 = 0;
		anInt8831 = -443563833;
		anInt8937 = 280458557;
		anInt8690 = 802224543;
		anInt8834 = 766301529;
		aBoolean8835 = false;
		anInt8836 = -1598367905;
		anInt8906 = -398138063;
		aString8838 = null;
		aString8754 = null;
		WINDOW_PANE_ID = -1785861201;
		aClass437_8841 = new HashTable(8);
		anInt8842 = 0;
		aClass105_8652 = null;
		anInt8844 = 0;
		anInt8845 = 0;
		aBoolean8846 = false;
		aBoolean8922 = false;
		aClass105_8819 = null;
		aBoolean8849 = false;
		aClass105_8850 = null;
		aClass105_8712 = null;
		anInt8734 = 0;
		anInt8853 = 0;
		aClass105_8854 = null;
		aBoolean8855 = false;
		anInt8856 = -1246614319;
		anInt8800 = 429639553;
		anInt8858 = -1523738763;
		anInt8966 = 706199093;
		aBoolean8938 = false;
		anInt8861 = 1501079155;
		anInt8862 = 1873720993;
		aBoolean8863 = false;
		anInt8864 = 0;
		aBoolean8865 = false;
		aBoolean8866 = false;
		anInt8933 = -908761385;
		anIntArray8874 = new int[32];
		anInt8783 = 0;
		anIntArray8823 = new int[32];
		anInt8873 = 0;
		anIntArray8833 = new int[32];
		anInt8875 = 0;
		anIntArray8876 = new int[32];
		anInt8877 = 0;
		anIntArray8787 = new int[32];
		anInt8879 = 0;
		anIntArray8880 = new int[32];
		anInt8881 = 0;
		anInt8882 = 0;
		anInt8883 = 0;
		anInt8912 = 0;
		anInt8885 = 0;
		anInt8886 = 0;
		anInt8796 = 0;
		anInt8888 = 0;
		anInt8890 = 0;
		aBoolean8736 = false;
		aLong8892 = -5732957771927789473L;
		aClass453_8893 = new Class453();
		aClass453_8660 = new Class453();
		aClass453_8895 = new Class453();
		aClass437_8896 = new HashTable(512);
		anInt8686 = 0;
		anInt8832 = 870349622;
		aBooleanArray8900 = new boolean[113];
		aBooleanArray8901 = new boolean[113];
		aRectangleArray8902 = new Rectangle[113];
		for (int i = 0; i < 113; i++)
			aRectangleArray8902[i] = new Rectangle();
		anInt8956 = 0;
		anIntArray8899 = new int[4];
		anInt8905 = 0;
		anInt8644 = -2022928202;
		anIntArray8907 = new int[anInt8644 * 547709851];
		anIntArray8908 = new int[547709851 * anInt8644];
		anIntArray8909 = new int[547709851 * anInt8644];
		aClass62Array8657 = new Class62[anInt8644 * 547709851];
		anIntArray8911 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		anInt8837 = 0;
		anInt8913 = 0;
		aLongArray8915 = new long[100];
		anInt8916 = 0;
		aBoolean8917 = false;
		aString8804 = null;
		aString8919 = null;
		aClass251Array8920 = new Class251[6];
		anInt8921 = 0;
		aBooleanArray8684 = new boolean[5];
		anIntArray8860 = new int[5];
		anIntArray8925 = new int[5];
		anIntArray8926 = new int[5];
		anIntArray8790 = new int[5];
		aShort8928 = (short) 256;
		aShort8929 = (short) 205;
		aShort8923 = (short) 256;
		aShort8931 = (short) 320;
		aShort8839 = (short) 1;
		aShort8743 = (short) 32767;
		aShort8934 = (short) 1;
		aShort8935 = (short) 32767;
		anInt8936 = 0;
		anInt8747 = 0;
		anInt8664 = 0;
		anInt8939 = 0;
		anInt8940 = 0;
		anInt8941 = 0;
		anInt8942 = 0;
		aStringArray8704 = new String[200];
		aStringArray8945 = new String[200];
		anIntArray8946 = new int[200];
		aStringArray8947 = new String[200];
		anIntArray8705 = new int[200];
		aBooleanArray8722 = new boolean[200];
		aBooleanArray8950 = new boolean[200];
		aClass442_8951 = new Class442();
		anInt8952 = 0;
		aStringArray8859 = new String[100];
		aStringArray8954 = new String[100];
		aStringArray8955 = new String[100];
		aStringArray8773 = new String[100];
		aBooleanArray8957 = new boolean[100];
		aCalendar8758 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		aByte8959 = (byte) -6;
		anInterface17_8960 = new Class523();
		anIntArray8977 = new int[4];
	}

	public final void method205() {
		if (method2758(-60994638)) {
			Class209[] class209s = Class266.method2523(-1853688964);
			for (int i = 0; i < class209s.length; i++) {
				Class209 class209 = class209s[i];
				String string = ClientScriptMap.anApplet6044.getParameter(class209.aString2395);
				if (string != null) {
					switch (Integer.parseInt(class209.aString2395)) {
					case 9:
						Class73.anInt689 = Integer.parseInt(string) * -2071496301;
						break;
					case 23:
						if (string.equals(Class26.aString355))
							aBoolean8643 = true;
						else
							aBoolean8643 = false;
						break;
					case 33:
						Class112.aString1369 = string;
						break;
					default:
						Class464.method6062("", new RuntimeException(), (short) 7807);
						break;
					case 7:
						Class486.aString6063 = string;
						break;
					case 21:
						Class474.aClass471_5976 = new Class464();
						Class474.aClass471_5976.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 3:
						aString8655 = string;
						break;
					case 12:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8651 = true;
						else
							aBoolean8651 = false;
						break;
					case 18:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8807 = true;
						break;
					case 17:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 11:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8638 = true;
						else
							aBoolean8638 = false;
						break;
					case 24:
						aString8649 = string;
						break;
					case 27:
						Class321.aClass429_3357 = Class429.method5754(Integer.parseInt(string), 1796181193);
						break;
					case 30:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8653 = true;
						else
							aBoolean8653 = false;
						break;
					case 22:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8639 = true;
						else
							aBoolean8639 = false;
						break;
					case 13:
						Class242.aClass401_2708 = (Class401) (Class422_Sub20.method5701(Class401.method4936(978559132), Integer.parseInt(string), (byte) 2));
						if (Class401.aClass401_6552 == Class242.aClass401_2708)
							Class242.aClass401_2708 = Class401.aClass401_6560;
						else if (!Class401.method4932(Class242.aClass401_2708, 2135116996) && (Class242.aClass401_2708 != Class401.aClass401_6557))
							Class242.aClass401_2708 = Class401.aClass401_6557;
						break;
					case 5:
						Class350.anInt3758 = Integer.parseInt(string) * -339928991;
						break;
					case 32:
						aLong8645 = Long.parseLong(string) * -4477728998236397853L;
						break;
					case 1:
						anInt8665 = Integer.parseInt(string) * 708949575;
						break;
					case 6:
						Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -63);
						if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604))
							Class510.aClass444_6221 = Class444.aClass444_5604;
						break;
					case 20:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.address = string;
						break;
					case 8:
						break;
					case 2:
						aString8648 = string;
						if (aString8648.length() > 100)
							aString8648 = null;
						break;
					case 25:
						anInt8654 = Integer.parseInt(string) * -431443955;
						break;
					case 4:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 31:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8867 = true;
						else
							aBoolean8867 = false;
						break;
					case 10:
						aString8656 = string;
						break;
					case 14:
						break;
					case 29:
						if (null != string) {
							aByteArray8843 = (Class140.method1557(Class328.method3989(string, -2124619496), (byte) 77));
							if (aByteArray8843.length < 16)
								aByteArray8843 = null;
						}
						break;
					case 26:
						aClass411_8944 = Class352.method4244(Integer.parseInt(string), (byte) 91);
						break;
					case 28:
						anInt8971 = Integer.parseInt(string) * 131907935;
						if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length)
							anInt8971 = 0;
						break;
					case 16:
						if (string.equals(Class26.aString355))
							aBoolean8680 = true;
						else
							aBoolean8680 = false;
						break;
					case 15:
						aString8927 = string;
					}
				}
			}
			if (aString8927 == null)
				aString8927 = "";
			Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, aClass411_8944.aString5322);
			Class385.aClient4141 = this;
			method2751(class311, aClass411_8944.aString5317, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(-1723932293), 718, 1, aBoolean8653, (byte) -31);
		}
	}

	final void method2770() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class82_Sub3.aClass105_6825 = new IComponentDefinition();
		Class229.method2124((byte) -73);
		Class365_Sub1_Sub3.aClass255_9804 = new Class255();
		Class248.aClass247_2752 = new Class247_Sub1();
		int[] is = { 20, 260 };
		int[] is_121_ = { 1000, 100 };
		if (is == null || null == is_121_) {
			Class136.anIntArray6388 = null;
			Class416.anIntArray5331 = null;
			Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001 = null;
		} else {
			Class136.anIntArray6388 = is;
			Class416.anIntArray5331 = new int[is.length];
			Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001 = new byte[is.length][][];
			for (int i = 0; i < Class136.anIntArray6388.length; i++)
				Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001[i] = new byte[is_121_[i]][];
		}
		Class217.method2017(100);
		Class218.method2027(10);
		IComponentSettings.method3500(100, 2088368476);
		Class315.method3838(100, -205571101);
		if (Class401.aClass401_6557 != Class242.aClass401_2708)
			Class98.aByteArrayArray949 = new byte[50][];
		Class422_Sub25.aClass298_Sub48_8425 = Class121.method1315(1281460883);
		if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub21_7580.method5703((byte) -114) == 1)
			Class331.aBoolean3540 = false;
		if (Class401.aClass401_6557 == Class242.aClass401_2708)
			Class474.aClass471_5976.address = ClientScriptMap.anApplet6044.getCodeBase().getHost();
		else if (Class401.method4932(Class242.aClass401_2708, 2144135205)) {
			Class474.aClass471_5976.address = ClientScriptMap.anApplet6044.getCodeBase().getHost();
			Class474.aClass471_5976.anInt5954 = 815680320 + Class474.aClass471_5976.worldId * -1670427267;
			Class241.aClass471_2705.anInt5954 = 815680320 + Class241.aClass471_2705.worldId * -1670427267;
			Class474.aClass471_5976.anInt5955 = -52655920 + Class474.aClass471_5976.worldId * 925746937;
			Class241.aClass471_2705.anInt5955 = Class241.aClass471_2705.worldId * 925746937 + -52655920;
		} else if (Class242.aClass401_2708 == Class401.aClass401_6552) {
			Class474.aClass471_5976.address = Class26.aString354;
			Class241.aClass471_2705.address = Class26.aString354;
			Class474.aClass471_5976.anInt5954 = 815680320 + Class474.aClass471_5976.worldId * -1670427267;
			Class241.aClass471_2705.anInt5954 = -1670427267 * Class241.aClass471_2705.worldId + 815680320;
			Class474.aClass471_5976.anInt5955 = -52655920 + Class474.aClass471_5976.worldId * 925746937;
			Class241.aClass471_2705.anInt5955 = -52655920 + Class241.aClass471_2705.worldId * 925746937;
		}
		Class474.aClass471_5979 = Class474.aClass471_5976;
		if (aClass411_8944 == Class411.aClass411_5320)
			aBoolean8674 = false;
		Class107.aShortArray1315 = ObjectDefinitions.aShortArray5423 = SomethingDefinitions.aShortArray6182 = ItemDefinitions.aShortArray5757 = new short[256];
		try {
			Class365_Sub1_Sub5_Sub2.aClipboard9941 = Class318.method3874((byte) 114).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class372.aClass323_4052 = Class294.method2825(Class52_Sub2_Sub1.aCanvas9079, 761707328);
		Class165.recorder = Class291.method2785(Class52_Sub2_Sub1.aCanvas9079, true, (short) 391);
		if (Class401.aClass401_6557 != Class242.aClass401_2708)
			aBoolean8667 = true;
		aString6485 = Tradution.aClass470_5874.method6049(Class321.aClass429_3357, -875414210);
		Class62.aClass248_612 = new Class248();
		new Thread(Class62.aClass248_612).start();
	}

	public final void method210() {
		if (method2758(555346996)) {
			Class209[] class209s = Class266.method2523(1031965287);
			for (int i = 0; i < class209s.length; i++) {
				Class209 class209 = class209s[i];
				String string = ClientScriptMap.anApplet6044.getParameter(class209.aString2395);
				if (string != null) {
					switch (Integer.parseInt(class209.aString2395)) {
					case 9:
						Class73.anInt689 = Integer.parseInt(string) * -2071496301;
						break;
					case 23:
						if (string.equals(Class26.aString355))
							aBoolean8643 = true;
						else
							aBoolean8643 = false;
						break;
					case 33:
						Class112.aString1369 = string;
						break;
					default:
						Class464.method6062("", new RuntimeException(), (short) 4311);
						break;
					case 7:
						Class486.aString6063 = string;
						break;
					case 21:
						Class474.aClass471_5976 = new Class464();
						Class474.aClass471_5976.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 3:
						aString8655 = string;
						break;
					case 12:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8651 = true;
						else
							aBoolean8651 = false;
						break;
					case 18:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8807 = true;
						break;
					case 17:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 11:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8638 = true;
						else
							aBoolean8638 = false;
						break;
					case 24:
						aString8649 = string;
						break;
					case 27:
						Class321.aClass429_3357 = Class429.method5754(Integer.parseInt(string), 2129104581);
						break;
					case 30:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8653 = true;
						else
							aBoolean8653 = false;
						break;
					case 22:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8639 = true;
						else
							aBoolean8639 = false;
						break;
					case 13:
						Class242.aClass401_2708 = (Class401) (Class422_Sub20.method5701(Class401.method4936(-1772297471), Integer.parseInt(string), (byte) 2));
						if (Class401.aClass401_6552 == Class242.aClass401_2708)
							Class242.aClass401_2708 = Class401.aClass401_6560;
						else if (!Class401.method4932(Class242.aClass401_2708, 2053185315) && (Class242.aClass401_2708 != Class401.aClass401_6557))
							Class242.aClass401_2708 = Class401.aClass401_6557;
						break;
					case 5:
						Class350.anInt3758 = Integer.parseInt(string) * -339928991;
						break;
					case 32:
						aLong8645 = Long.parseLong(string) * -4477728998236397853L;
						break;
					case 1:
						anInt8665 = Integer.parseInt(string) * 708949575;
						break;
					case 6:
						Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -17);
						if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604))
							Class510.aClass444_6221 = Class444.aClass444_5604;
						break;
					case 20:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.address = string;
						break;
					case 8:
						break;
					case 2:
						aString8648 = string;
						if (aString8648.length() > 100)
							aString8648 = null;
						break;
					case 25:
						anInt8654 = Integer.parseInt(string) * -431443955;
						break;
					case 4:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 31:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8867 = true;
						else
							aBoolean8867 = false;
						break;
					case 10:
						aString8656 = string;
						break;
					case 14:
						break;
					case 29:
						if (null != string) {
							aByteArray8843 = (Class140.method1557(Class328.method3989(string, -1069347336), (byte) 105));
							if (aByteArray8843.length < 16)
								aByteArray8843 = null;
						}
						break;
					case 26:
						aClass411_8944 = Class352.method4244(Integer.parseInt(string), (byte) 23);
						break;
					case 28:
						anInt8971 = Integer.parseInt(string) * 131907935;
						if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length)
							anInt8971 = 0;
						break;
					case 16:
						if (string.equals(Class26.aString355))
							aBoolean8680 = true;
						else
							aBoolean8680 = false;
						break;
					case 15:
						aString8927 = string;
					}
				}
			}
			if (aString8927 == null)
				aString8927 = "";
			Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, aClass411_8944.aString5322);
			Class385.aClient4141 = this;
			method2751(class311, aClass411_8944.aString5317, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(-586316395), 718, 1, aBoolean8653, (byte) 80);
		}
	}

	final void method2768() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class82_Sub3.aClass105_6825 = new IComponentDefinition();
		Class229.method2124((byte) -49);
		Class365_Sub1_Sub3.aClass255_9804 = new Class255();
		Class248.aClass247_2752 = new Class247_Sub1();
		int[] is = { 20, 260 };
		int[] is_122_ = { 1000, 100 };
		if (is == null || null == is_122_) {
			Class136.anIntArray6388 = null;
			Class416.anIntArray5331 = null;
			Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001 = null;
		} else {
			Class136.anIntArray6388 = is;
			Class416.anIntArray5331 = new int[is.length];
			Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001 = new byte[is.length][][];
			for (int i = 0; i < Class136.anIntArray6388.length; i++)
				Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001[i] = new byte[is_122_[i]][];
		}
		Class217.method2017(100);
		Class218.method2027(10);
		IComponentSettings.method3500(100, 230540177);
		Class315.method3838(100, 945128656);
		if (Class401.aClass401_6557 != Class242.aClass401_2708)
			Class98.aByteArrayArray949 = new byte[50][];
		Class422_Sub25.aClass298_Sub48_8425 = Class121.method1315(1110000568);
		if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub21_7580.method5703((byte) -45) == 1)
			Class331.aBoolean3540 = false;
		if (Class401.aClass401_6557 == Class242.aClass401_2708)
			Class474.aClass471_5976.address = ClientScriptMap.anApplet6044.getCodeBase().getHost();
		else if (Class401.method4932(Class242.aClass401_2708, 2086746818)) {
			Class474.aClass471_5976.address = ClientScriptMap.anApplet6044.getCodeBase().getHost();
			Class474.aClass471_5976.anInt5954 = 815680320 + Class474.aClass471_5976.worldId * -1670427267;
			Class241.aClass471_2705.anInt5954 = 815680320 + Class241.aClass471_2705.worldId * -1670427267;
			Class474.aClass471_5976.anInt5955 = -52655920 + Class474.aClass471_5976.worldId * 925746937;
			Class241.aClass471_2705.anInt5955 = Class241.aClass471_2705.worldId * 925746937 + -52655920;
		} else if (Class242.aClass401_2708 == Class401.aClass401_6552) {
			Class474.aClass471_5976.address = Class26.aString354;
			Class241.aClass471_2705.address = Class26.aString354;
			Class474.aClass471_5976.anInt5954 = 815680320 + Class474.aClass471_5976.worldId * -1670427267;
			Class241.aClass471_2705.anInt5954 = -1670427267 * Class241.aClass471_2705.worldId + 815680320;
			Class474.aClass471_5976.anInt5955 = -52655920 + Class474.aClass471_5976.worldId * 925746937;
			Class241.aClass471_2705.anInt5955 = -52655920 + Class241.aClass471_2705.worldId * 925746937;
		}
		Class474.aClass471_5979 = Class474.aClass471_5976;
		if (aClass411_8944 == Class411.aClass411_5320)
			aBoolean8674 = false;
		Class107.aShortArray1315 = ObjectDefinitions.aShortArray5423 = SomethingDefinitions.aShortArray6182 = ItemDefinitions.aShortArray5757 = new short[256];
		try {
			Class365_Sub1_Sub5_Sub2.aClipboard9941 = Class318.method3874((byte) 22).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class372.aClass323_4052 = Class294.method2825(Class52_Sub2_Sub1.aCanvas9079, 1701448688);
		Class165.recorder = Class291.method2785(Class52_Sub2_Sub1.aCanvas9079, true, (short) 391);
		if (Class401.aClass401_6557 != Class242.aClass401_2708)
			aBoolean8667 = true;
		aString6485 = Tradution.aClass470_5874.method6049(Class321.aClass429_3357, -875414210);
		Class62.aClass248_612 = new Class248();
		new Thread(Class62.aClass248_612).start();
	}

	final void method2775() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class82_Sub3.aClass105_6825 = new IComponentDefinition();
		Class229.method2124((byte) -84);
		Class365_Sub1_Sub3.aClass255_9804 = new Class255();
		Class248.aClass247_2752 = new Class247_Sub1();
		int[] is = { 20, 260 };
		int[] is_123_ = { 1000, 100 };
		if (is == null || null == is_123_) {
			Class136.anIntArray6388 = null;
			Class416.anIntArray5331 = null;
			Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001 = null;
		} else {
			Class136.anIntArray6388 = is;
			Class416.anIntArray5331 = new int[is.length];
			Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001 = new byte[is.length][][];
			for (int i = 0; i < Class136.anIntArray6388.length; i++)
				Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001[i] = new byte[is_123_[i]][];
		}
		Class217.method2017(100);
		Class218.method2027(10);
		IComponentSettings.method3500(100, 643091682);
		Class315.method3838(100, 1212945074);
		if (Class401.aClass401_6557 != Class242.aClass401_2708)
			Class98.aByteArrayArray949 = new byte[50][];
		Class422_Sub25.aClass298_Sub48_8425 = Class121.method1315(719994704);
		if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub21_7580.method5703((byte) -48) == 1)
			Class331.aBoolean3540 = false;
		if (Class401.aClass401_6557 == Class242.aClass401_2708)
			Class474.aClass471_5976.address = ClientScriptMap.anApplet6044.getCodeBase().getHost();
		else if (Class401.method4932(Class242.aClass401_2708, 2088050765)) {
			Class474.aClass471_5976.address = ClientScriptMap.anApplet6044.getCodeBase().getHost();
			Class474.aClass471_5976.anInt5954 = 815680320 + Class474.aClass471_5976.worldId * -1670427267;
			Class241.aClass471_2705.anInt5954 = 815680320 + Class241.aClass471_2705.worldId * -1670427267;
			Class474.aClass471_5976.anInt5955 = -52655920 + Class474.aClass471_5976.worldId * 925746937;
			Class241.aClass471_2705.anInt5955 = Class241.aClass471_2705.worldId * 925746937 + -52655920;
		} else if (Class242.aClass401_2708 == Class401.aClass401_6552) {
			Class474.aClass471_5976.address = Class26.aString354;
			Class241.aClass471_2705.address = Class26.aString354;
			Class474.aClass471_5976.anInt5954 = 815680320 + Class474.aClass471_5976.worldId * -1670427267;
			Class241.aClass471_2705.anInt5954 = -1670427267 * Class241.aClass471_2705.worldId + 815680320;
			Class474.aClass471_5976.anInt5955 = -52655920 + Class474.aClass471_5976.worldId * 925746937;
			Class241.aClass471_2705.anInt5955 = -52655920 + Class241.aClass471_2705.worldId * 925746937;
		}
		Class474.aClass471_5979 = Class474.aClass471_5976;
		if (aClass411_8944 == Class411.aClass411_5320)
			aBoolean8674 = false;
		Class107.aShortArray1315 = ObjectDefinitions.aShortArray5423 = SomethingDefinitions.aShortArray6182 = ItemDefinitions.aShortArray5757 = new short[256];
		try {
			Class365_Sub1_Sub5_Sub2.aClipboard9941 = Class318.method3874((byte) 106).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class372.aClass323_4052 = Class294.method2825(Class52_Sub2_Sub1.aCanvas9079, 1054576068);
		Class165.recorder = Class291.method2785(Class52_Sub2_Sub1.aCanvas9079, true, (short) 391);
		if (Class401.aClass401_6557 != Class242.aClass401_2708)
			aBoolean8667 = true;
		aString6485 = Tradution.aClass470_5874.method6049(Class321.aClass429_3357, -875414210);
		Class62.aClass248_612 = new Class248();
		new Thread(Class62.aClass248_612).start();
	}

	public String method2803() {
		String string = " ";
		try {
			Class341 class341 = aClass283_8716.method2628(681479919);
			string = new StringBuilder().append(string).append(class341.gameSceneBaseX * -1760580017).append(Class26.aString353).append(283514611 * class341.gameSceneBaseY).append(Class26.aString353).append(aClass283_8716.method2629(-2128021636))
					.append(Class26.aString353).append(aClass283_8716.method2630(-1076815167)).append(" ").toString();
			if (Class287.myPlayer != null)
				string = new StringBuilder().append(string).append(1855729883 * Class99.anInt952).append(Class26.aString353).append(-1760580017 * class341.gameSceneBaseX + (Class287.myPlayer.scenePositionXQueue[0])).append(Class26.aString353)
						.append((Class287.myPlayer.scenePositionYQueue[0]) + class341.gameSceneBaseY * 283514611).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class99.anInt952 * 1855729883).append(Class26.aString353).append(Class99.anInt952 * 1855729883).append(Class26.aString353).append(1855729883 * Class99.anInt952)
						.append(Class26.aString353).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-682947587)).append(" ").append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7549.method5675(-723955200))
					.append(" ").append(Class190.method1859((byte) -61)).append(" ").append(Class462.anInt5683 * -2110394505).append(Class26.aString353).append(Class298_Sub40_Sub9.anInt9716 * -1111710645).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub15_7560.method5684(-2018199679)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub7_7581.method5650(-90347626)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub5_7572.method5642(-1374891617)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub16_7557.method5687(1903704462)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub6_7551.method5647(-917787431)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(maximumMemory * 1126040225).append(" ").toString();
			string = new StringBuilder().append(string).append(-1233866115 * anInt8752).append(" ").toString();
			if (null != Class12.aClass298_Sub44_9946)
				string = new StringBuilder().append(string).append(Class12.aClass298_Sub44_9946.cpuClockSpeed * 399637415).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString8655 != null)
				string = new StringBuilder().append(string).append(aString8655).toString();
			else
				string = new StringBuilder().append(string).append(Class26.aString353).toString();
			try {
				if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1738416059) == 2) {
					Class var_class = java.lang.ClassLoader.class;
					Field field = var_class.getDeclaredField("nativeLibraries");
					Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
					Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
					method.invoke(field, new Object[] { Boolean.TRUE });
					Vector vector = (Vector) field.get(client.class.getClassLoader());
					for (int i = 0; i < vector.size(); i++) {
						try {
							Object object = vector.elementAt(i);
							Field field_125_ = object.getClass().getDeclaredField("name");
							method.invoke(field_125_, new Object[] { Boolean.TRUE });
							try {
								String string_126_ = (String) field_125_.get(object);
								if (null != string_126_ && string_126_.indexOf("sw3d.dll") != -1) {
									Field field_127_ = object.getClass().getDeclaredField("handle");
									method.invoke(field_127_, (new Object[] { Boolean.TRUE }));
									string = new StringBuilder().append(string).append(" ").append(Long.toHexString(field_127_.getLong(object))).toString();
									method.invoke(field_127_, (new Object[] { Boolean.FALSE }));
								}
							} catch (Throwable throwable) {
								/* empty */
							}
							method.invoke(field_125_, new Object[] { Boolean.FALSE });
						} catch (Throwable throwable) {
							/* empty */
						}
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	public String method2804() {
		String string = " ";
		try {
			Class341 class341 = aClass283_8716.method2628(681479919);
			string = new StringBuilder().append(string).append(class341.gameSceneBaseX * -1760580017).append(Class26.aString353).append(283514611 * class341.gameSceneBaseY).append(Class26.aString353).append(aClass283_8716.method2629(-2102644604))
					.append(Class26.aString353).append(aClass283_8716.method2630(-955929187)).append(" ").toString();
			if (Class287.myPlayer != null)
				string = new StringBuilder().append(string).append(1855729883 * Class99.anInt952).append(Class26.aString353).append(-1760580017 * class341.gameSceneBaseX + (Class287.myPlayer.scenePositionXQueue[0])).append(Class26.aString353)
						.append((Class287.myPlayer.scenePositionYQueue[0]) + class341.gameSceneBaseY * 283514611).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class99.anInt952 * 1855729883).append(Class26.aString353).append(Class99.anInt952 * 1855729883).append(Class26.aString353).append(1855729883 * Class99.anInt952)
						.append(Class26.aString353).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-2069894035)).append(" ").append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7549.method5675(-980707631))
					.append(" ").append(Class190.method1859((byte) -68)).append(" ").append(Class462.anInt5683 * -2110394505).append(Class26.aString353).append(Class298_Sub40_Sub9.anInt9716 * -1111710645).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub15_7560.method5684(-1869858699)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub7_7581.method5650(-1501062841)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub5_7572.method5642(1402925605)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub16_7557.method5687(2098109554)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub6_7551.method5647(708887962)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(maximumMemory * 1126040225).append(" ").toString();
			string = new StringBuilder().append(string).append(-1233866115 * anInt8752).append(" ").toString();
			if (null != Class12.aClass298_Sub44_9946)
				string = new StringBuilder().append(string).append(Class12.aClass298_Sub44_9946.cpuClockSpeed * 399637415).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString8655 != null)
				string = new StringBuilder().append(string).append(aString8655).toString();
			else
				string = new StringBuilder().append(string).append(Class26.aString353).toString();
			try {
				if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-578216379) == 2) {
					Class var_class = java.lang.ClassLoader.class;
					Field field = var_class.getDeclaredField("nativeLibraries");
					Class var_class_128_ = java.lang.reflect.AccessibleObject.class;
					Method method = var_class_128_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
					method.invoke(field, new Object[] { Boolean.TRUE });
					Vector vector = (Vector) field.get(client.class.getClassLoader());
					for (int i = 0; i < vector.size(); i++) {
						try {
							Object object = vector.elementAt(i);
							Field field_129_ = object.getClass().getDeclaredField("name");
							method.invoke(field_129_, new Object[] { Boolean.TRUE });
							try {
								String string_130_ = (String) field_129_.get(object);
								if (null != string_130_ && string_130_.indexOf("sw3d.dll") != -1) {
									Field field_131_ = object.getClass().getDeclaredField("handle");
									method.invoke(field_131_, (new Object[] { Boolean.TRUE }));
									string = new StringBuilder().append(string).append(" ").append(Long.toHexString(field_131_.getLong(object))).toString();
									method.invoke(field_131_, (new Object[] { Boolean.FALSE }));
								}
							} catch (Throwable throwable) {
								/* empty */
							}
							method.invoke(field_129_, new Object[] { Boolean.FALSE });
						} catch (Throwable throwable) {
							/* empty */
						}
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	public String method2805() {
		String string = " ";
		try {
			Class341 class341 = aClass283_8716.method2628(681479919);
			string = new StringBuilder().append(string).append(class341.gameSceneBaseX * -1760580017).append(Class26.aString353).append(283514611 * class341.gameSceneBaseY).append(Class26.aString353).append(aClass283_8716.method2629(-1917252704))
					.append(Class26.aString353).append(aClass283_8716.method2630(-659381111)).append(" ").toString();
			if (Class287.myPlayer != null)
				string = new StringBuilder().append(string).append(1855729883 * Class99.anInt952).append(Class26.aString353).append(-1760580017 * class341.gameSceneBaseX + (Class287.myPlayer.scenePositionXQueue[0])).append(Class26.aString353)
						.append((Class287.myPlayer.scenePositionYQueue[0]) + class341.gameSceneBaseY * 283514611).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(Class99.anInt952 * 1855729883).append(Class26.aString353).append(Class99.anInt952 * 1855729883).append(Class26.aString353).append(1855729883 * Class99.anInt952)
						.append(Class26.aString353).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-361845304)).append(" ").append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7549.method5675(-1338991605))
					.append(" ").append(Class190.method1859((byte) -87)).append(" ").append(Class462.anInt5683 * -2110394505).append(Class26.aString353).append(Class298_Sub40_Sub9.anInt9716 * -1111710645).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub15_7560.method5684(-1870553527)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub7_7581.method5650(-12224060)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub5_7572.method5642(-149412729)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub16_7557.method5687(1908877980)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub6_7551.method5647(-1923698698)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(maximumMemory * 1126040225).append(" ").toString();
			string = new StringBuilder().append(string).append(-1233866115 * anInt8752).append(" ").toString();
			if (null != Class12.aClass298_Sub44_9946)
				string = new StringBuilder().append(string).append(Class12.aClass298_Sub44_9946.cpuClockSpeed * 399637415).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString8655 != null)
				string = new StringBuilder().append(string).append(aString8655).toString();
			else
				string = new StringBuilder().append(string).append(Class26.aString353).toString();
			try {
				if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1704140617) == 2) {
					Class var_class = java.lang.ClassLoader.class;
					Field field = var_class.getDeclaredField("nativeLibraries");
					Class var_class_132_ = java.lang.reflect.AccessibleObject.class;
					Method method = var_class_132_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
					method.invoke(field, new Object[] { Boolean.TRUE });
					Vector vector = (Vector) field.get(client.class.getClassLoader());
					for (int i = 0; i < vector.size(); i++) {
						try {
							Object object = vector.elementAt(i);
							Field field_133_ = object.getClass().getDeclaredField("name");
							method.invoke(field_133_, new Object[] { Boolean.TRUE });
							try {
								String string_134_ = (String) field_133_.get(object);
								if (null != string_134_ && string_134_.indexOf("sw3d.dll") != -1) {
									Field field_135_ = object.getClass().getDeclaredField("handle");
									method.invoke(field_135_, (new Object[] { Boolean.TRUE }));
									string = new StringBuilder().append(string).append(" ").append(Long.toHexString(field_135_.getLong(object))).toString();
									method.invoke(field_135_, (new Object[] { Boolean.FALSE }));
								}
							} catch (Throwable throwable) {
								/* empty */
							}
							method.invoke(field_133_, new Object[] { Boolean.FALSE });
						} catch (Throwable throwable) {
							/* empty */
						}
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		return string;
	}

	void method2806(byte i) {
		try {
			if (10 != -1233866115 * anInt8752) {
				if (aBoolean8717) {
					synchronized (anObject8661) {
						anObject8661.notify();
					}
					synchronized (anObject8718) {
						try {
							anObject8718.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					aBoolean8717 = false;
				}
				anInt8884 += -2114713437;
				if (1 == anInt8884 * 443738891 % 1000) {
					GregorianCalendar gregoriancalendar = new GregorianCalendar();
					Class368.anInt4005 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6) * -850559371;
					aRandom8702.setSeed((long) (1401020893 * Class368.anInt4005));
				}
				gameConnection.method388((byte) 110);
				lobbyConnection.method388((byte) -69);
				method2793(-1133219011);
				if (null != Class203.aClass225_2337)
					Class203.aClass225_2337.method2097(-741953209);
				Class321.method3927(1528835992);
				Class510.method6289(1235750018);
				Class372.aClass323_4052.method3942(-1098053107);
				Class165.recorder.method3886(846408062);
				if (Class373.aClass_ra4071 != null)
					Class373.aClass_ra4071.method4993((int) Class122.method1319((byte) 1));
				anInt8894 = 0;
				anInt8687 = 0;
				for (Interface16 interface16 = Class372.aClass323_4052.method3937((byte) -104); interface16 != null; interface16 = Class372.aClass323_4052.method3937((byte) -84)) {
					int i_136_ = interface16.method227(-915468471);
					if (i_136_ == 2 || i_136_ == 3) {
						char c = interface16.method217((byte) -126);
						if (Class394.method4897(1632341597) && (c == '`' || c == '\u00a7' || c == '\u00b2')) {
							if (Class423.method5734(-1504050336))
								Class_v.method3673(-200374470);
							else
								Class375.method4653(-1941589186);
						} else if (1351936279 * anInt8894 < 128) {
							anInterface16Array8710[anInt8894 * 1351936279] = interface16;
							anInt8894 += 1498865319;
						}
					} else if (0 == i_136_ && -1625219821 * anInt8687 < 79) {
						anInterface16Array8688[anInt8687 * -1625219821] = interface16;
						anInt8687 += -1573964517;
					}
				}
				anInt8682 = 0;
				for (Class298_Sub50 class298_sub50 = Class165.recorder.method3879(-1183106665); null != class298_sub50; class298_sub50 = Class165.recorder.method3879(390773081)) {
					int i_137_ = class298_sub50.method3546(-1372966703);
					if (i_137_ == -1)
						Class93.method1012(class298_sub50, -1457107013);
					else if (i_137_ == 6) {
						anInt8682 += (class298_sub50.method3548(2127682803) * 815898935);
						class298_sub50.method3550(1052301405);
					} else if (Class128.method1437(i_137_, 1317289232)) {
						aClass453_8827.method5935(class298_sub50, 289207550);
						if (aClass453_8827.method5948(1828905535) > 10) {
							Class298_Sub50 class298_sub50_138_ = ((Class298_Sub50) aClass453_8827.method5936(2122873457));
							if (class298_sub50_138_ != null)
								class298_sub50_138_.method3550(880718198);
						}
					}
				}
				if (Class423.method5734(-2065645422))
					Class350.method4218(2062671792);
				if (Class88.method976(anInt8752 * -1233866115, 579190405)) {
					Class275.method2573(-123142149);
					Class113.method1247(1876624858);
				} else if (Class358.method4287(-1233866115 * anInt8752, -922237026))
					aClass283_8716.method2672(-319147356);
				if (Class413.method5584(anInt8752 * -1233866115, 1989496806) && !Class358.method4287(-1233866115 * anInt8752, -1179252225)) {
					method2809(-2054858271);
					Class288_Sub1.method2730(-1664553677);
					Class460.method5980((byte) 71);
				} else if (Class299.method3682(anInt8752 * -1233866115, 1765230881) && !Class358.method4287(-1233866115 * anInt8752, 275834204)) {
					method2809(-1772986224);
					Class460.method5980((byte) 123);
				} else if (6 == anInt8752 * -1233866115)
					Class460.method5980((byte) 42);
				else if (Class435.method5804(anInt8752 * -1233866115, (byte) 9) && !Class358.method4287(anInt8752 * -1233866115, 1200358903))
					Class126.method1407((byte) 31);
				else if (-1233866115 * anInt8752 == 5 || 13 == -1233866115 * anInt8752) {
					Class460.method5980((byte) 15);
					if (-3 != Class360.anInt3871 * -1372893999 && 2 != -1372893999 * Class360.anInt3871 && Class360.anInt3871 * -1372893999 != 15) {
						if (13 == anInt8752 * -1233866115) {
							Class360.anInt3888 = 1522102865 * Class360.anInt3910;
							Class360.anInt3906 = Class360.anInt3909 * -2096622051;
							Class360.anInt3894 = Class360.anInt3871 * 1695357761;
							if (Class474.aBoolean5973) {
								Class372.method4589((Class474.aClass471_5972.worldId) * 1606920449, (Class474.aClass471_5972.address), 955770805);
								gameConnection.method385(1032485285);
								Class439.method5851(5, 1513920408);
							} else
								Class216.method2001(Class360.aBoolean3912, (byte) 127);
						} else
							Class216.method2001(false, (byte) 21);
					}
				}
				Class517.method6308(Class373.aClass_ra4071, -828057261);
				aClass453_8827.method5936(2109619537);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.er(").append(')').toString());
		}
	}

	final void method2771() {
		if (aBoolean8736)
			Class52_Sub2.method589(1390271339);
		Class16.method352(-2139893918);
		if (null != Class373.aClass_ra4071)
			Class373.aClass_ra4071.method5136(295313203);
		if (Class452.aBoolean5642 && Class231.aFrame2589 != null) {
			Class93.method1010(Class389.aClass457_4164, Class231.aFrame2589, -171748881);
			Class231.aFrame2589 = null;
		}
		gameConnection.method384((byte) 48);
		((BufferedConnectionContext) gameConnection).aClass124_340.method1382(-1556544216);
		lobbyConnection.method384((byte) 55);
		((BufferedConnectionContext) lobbyConnection).aClass124_340.method1382(-921770099);
		Class523.method6332(1369308377);
		Class248.aClass247_2752.method2346((byte) -34);
		Class365_Sub1_Sub3.aClass255_9804.method2433(-854256441);
		if (null != aClass404_8715) {
			aClass404_8715.method4948(807433749);
			aClass404_8715 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class244.method2326(767475885);
		try {
			Class444.method5890((byte) -40);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBoolean6480)
			Class117.method1279(-849889720);
	}

	public String method2761(byte i) {
		try {
			String string = " ";
			try {
				Class341 class341 = aClass283_8716.method2628(681479919);
				string = new StringBuilder().append(string).append(class341.gameSceneBaseX * -1760580017).append(Class26.aString353).append(283514611 * class341.gameSceneBaseY).append(Class26.aString353).append(aClass283_8716.method2629(-2133877490))
						.append(Class26.aString353).append(aClass283_8716.method2630(-932420747)).append(" ").toString();
				if (Class287.myPlayer != null)
					string = new StringBuilder().append(string).append(1855729883 * Class99.anInt952).append(Class26.aString353).append(-1760580017 * class341.gameSceneBaseX + (Class287.myPlayer.scenePositionXQueue[0])).append(Class26.aString353)
							.append((Class287.myPlayer.scenePositionYQueue[0]) + class341.gameSceneBaseY * 283514611).append(" ").toString();
				else
					string = new StringBuilder().append(string).append(Class99.anInt952 * 1855729883).append(Class26.aString353).append(Class99.anInt952 * 1855729883).append(Class26.aString353).append(1855729883 * Class99.anInt952)
							.append(Class26.aString353).append(" ").toString();
				string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-719661759)).append(" ").append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7549.method5675(-1847382084))
						.append(" ").append(Class190.method1859((byte) -120)).append(" ").append(Class462.anInt5683 * -2110394505).append(Class26.aString353).append(Class298_Sub40_Sub9.anInt9716 * -1111710645).append(" ").toString();
				string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub15_7560.method5684(-2046413432)).append(" ").toString();
				string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub7_7581.method5650(-1774221022)).append(" ").toString();
				string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub5_7572.method5642(-2036567589)).append(" ").toString();
				string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub16_7557.method5687(2062127023)).append(" ").toString();
				string = new StringBuilder().append(string).append(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub6_7551.method5647(1830613279)).append(" ").toString();
				string = new StringBuilder().append(string).append("0 ").toString();
				string = new StringBuilder().append(string).append(maximumMemory * 1126040225).append(" ").toString();
				string = new StringBuilder().append(string).append(-1233866115 * anInt8752).append(" ").toString();
				if (null != Class12.aClass298_Sub44_9946)
					string = new StringBuilder().append(string).append(Class12.aClass298_Sub44_9946.cpuClockSpeed * 399637415).toString();
				else
					string = new StringBuilder().append(string).append(-1).toString();
				string = new StringBuilder().append(string).append(" ").toString();
				if (aString8655 != null)
					string = new StringBuilder().append(string).append(aString8655).toString();
				else
					string = new StringBuilder().append(string).append(Class26.aString353).toString();
				try {
					if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1809803071) == 2) {
						Class var_class = java.lang.ClassLoader.class;
						Field field = var_class.getDeclaredField("nativeLibraries");
						Class var_class_139_ = java.lang.reflect.AccessibleObject.class;
						Method method = var_class_139_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
						method.invoke(field, new Object[] { Boolean.TRUE });
						Vector vector = (Vector) field.get(client.class.getClassLoader());
						for (int i_140_ = 0; i_140_ < vector.size(); i_140_++) {
							try {
								Object object = vector.elementAt(i_140_);
								Field field_141_ = object.getClass().getDeclaredField("name");
								method.invoke(field_141_, new Object[] { Boolean.TRUE });
								try {
									String string_142_ = (String) field_141_.get(object);
									if (null != string_142_ && (string_142_.indexOf("sw3d.dll") != -1)) {
										Field field_143_ = object.getClass().getDeclaredField("handle");
										method.invoke(field_143_, (new Object[] { Boolean.TRUE }));
										string = new StringBuilder().append(string).append(" ").append(Long.toHexString(field_143_.getLong(object))).toString();
										method.invoke(field_143_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_141_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					}
				} catch (Throwable throwable) {
					/* empty */
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.j(").append(')').toString());
		}
	}

	final void method2779() {
		if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-638897214) == 2) {
			try {
				method2792((byte) 0);
			} catch (ThreadDeath threaddeath) {
				throw threaddeath;
			} catch (Throwable throwable) {
				Class464.method6062(new StringBuilder().append(throwable.getMessage()).append(" ").append(method2761((byte) 79)).toString(), throwable, (short) -11302);
				aBoolean8662 = true;
				Class370.method4578(0, false, 622850291);
			}
		} else
			method2792((byte) 0);
	}

	static final void method2807() {
		int[][] is = aClass283_8716.method2656((byte) 11);
		int i = aClass283_8716.method2629(-1956838281);
		int i_144_ = aClass283_8716.method2630(-848747876);
		for (int i_145_ = 0; i_145_ < i; i_145_++) {
			int[] is_146_ = is[i_145_];
			for (int i_147_ = 0; i_147_ < i_144_; i_147_++)
				is_146_[i_147_] = 0;
		}
	}

	final void method2769() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class82_Sub3.aClass105_6825 = new IComponentDefinition();
		Class229.method2124((byte) -110);
		Class365_Sub1_Sub3.aClass255_9804 = new Class255();
		Class248.aClass247_2752 = new Class247_Sub1();
		int[] is = { 20, 260 };
		int[] is_148_ = { 1000, 100 };
		if (is == null || null == is_148_) {
			Class136.anIntArray6388 = null;
			Class416.anIntArray5331 = null;
			Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001 = null;
		} else {
			Class136.anIntArray6388 = is;
			Class416.anIntArray5331 = new int[is.length];
			Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001 = new byte[is.length][][];
			for (int i = 0; i < Class136.anIntArray6388.length; i++)
				Class298_Sub37_Sub9_Sub2.aByteArrayArrayArray10001[i] = new byte[is_148_[i]][];
		}
		Class217.method2017(100);
		Class218.method2027(10);
		IComponentSettings.method3500(100, -621093418);
		Class315.method3838(100, 1820171138);
		if (Class401.aClass401_6557 != Class242.aClass401_2708)
			Class98.aByteArrayArray949 = new byte[50][];
		Class422_Sub25.aClass298_Sub48_8425 = Class121.method1315(1638033926);
		if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub21_7580.method5703((byte) -41) == 1)
			Class331.aBoolean3540 = false;
		if (Class401.aClass401_6557 == Class242.aClass401_2708)
			Class474.aClass471_5976.address = ClientScriptMap.anApplet6044.getCodeBase().getHost();
		else if (Class401.method4932(Class242.aClass401_2708, 2103536787)) {
			Class474.aClass471_5976.address = ClientScriptMap.anApplet6044.getCodeBase().getHost();
			Class474.aClass471_5976.anInt5954 = 815680320 + Class474.aClass471_5976.worldId * -1670427267;
			Class241.aClass471_2705.anInt5954 = 815680320 + Class241.aClass471_2705.worldId * -1670427267;
			Class474.aClass471_5976.anInt5955 = -52655920 + Class474.aClass471_5976.worldId * 925746937;
			Class241.aClass471_2705.anInt5955 = Class241.aClass471_2705.worldId * 925746937 + -52655920;
		} else if (Class242.aClass401_2708 == Class401.aClass401_6552) {
			Class474.aClass471_5976.address = Class26.aString354;
			Class241.aClass471_2705.address = Class26.aString354;
			Class474.aClass471_5976.anInt5954 = 815680320 + Class474.aClass471_5976.worldId * -1670427267;
			Class241.aClass471_2705.anInt5954 = -1670427267 * Class241.aClass471_2705.worldId + 815680320;
			Class474.aClass471_5976.anInt5955 = -52655920 + Class474.aClass471_5976.worldId * 925746937;
			Class241.aClass471_2705.anInt5955 = -52655920 + Class241.aClass471_2705.worldId * 925746937;
		}
		Class474.aClass471_5979 = Class474.aClass471_5976;
		if (aClass411_8944 == Class411.aClass411_5320)
			aBoolean8674 = false;
		Class107.aShortArray1315 = ObjectDefinitions.aShortArray5423 = SomethingDefinitions.aShortArray6182 = ItemDefinitions.aShortArray5757 = new short[256];
		try {
			Class365_Sub1_Sub5_Sub2.aClipboard9941 = Class318.method3874((byte) 65).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class372.aClass323_4052 = Class294.method2825(Class52_Sub2_Sub1.aCanvas9079, 1207669534);
		Class165.recorder = Class291.method2785(Class52_Sub2_Sub1.aCanvas9079, true, (short) 391);
		if (Class401.aClass401_6557 != Class242.aClass401_2708)
			aBoolean8667 = true;
		aString6485 = Tradution.aClass470_5874.method6049(Class321.aClass429_3357, -875414210);
		Class62.aClass248_612 = new Class248();
		new Thread(Class62.aClass248_612).start();
	}

	static IComponentDefinition method2808(IComponentDefinition class105) {
		IComponentSettings class298_sub38 = method2801(class105);
		if (class298_sub38.method3496(-1363143168))
			return Class82_Sub3.aClass105_6825;
		int i = class298_sub38.method3493((byte) 1);
		if (i == 0)
			return null;
		for (int i_149_ = 0; i_149_ < i; i_149_++) {
			class105 = Class523.method6331(Exception_Sub3.method275(((class105.anInt1142) * -440872681), (byte) 3), class105, -1949792813);
			if (class105 == null)
				return Class82_Sub3.aClass105_6825;
		}
		return class105;
	}

	final void method2809(int i) {
		try {
			if ((14 == -1233866115 * anInt8752 && !Class315.method3837((byte) 34)) || (18 == -1233866115 * anInt8752 && 42 == Class360.anInt3871 * -1372893999) || 8 == -1233866115 * anInt8752) {
				if (anInt8669 * 1592380953 > 1) {
					anInt8669 -= -2090750423;
					anInt8888 = 1991119277 * anInt8933;
				}
				if (!Class436.aBoolean5478)
					Class98_Sub2.method1065((byte) 83);
				for (int i_150_ = 0; i_150_ < 100; i_150_++) {
					if (!Class247.method2370(lobbyConnection, 1977605455)) {
						if (i >= -1655691580)
							throw new IllegalStateException();
						break;
					}
				}
			}
			Class422_Sub5.method5644(-2001896291);
			Class336_Sub4.method4104(-320472795);
			anInt8961 += 512435497;
			Class298_Sub32.method3138(-1, -1, (byte) -29);
			Class82_Sub17.method918(null, -1, -1, -936647614);
			Class62.method732(-1860145091);
			anInt8933 += -908761385;
			for (int i_151_ = 0; i_151_ < anInt8772 * 1962237353; i_151_++) {
				NPC npc = ((NPC) aClass298_Sub29Array8816[i_151_].anObject7366);
				if (null == npc) {
					if (i >= -1655691580) {
						/* empty */
					}
				} else {
					byte i_152_ = (npc.aClass503_10190.aByte6170);
					if (0 == (i_152_ & 0x1)) {
						if (i >= -1655691580)
							return;
					} else {
						int size = npc.getSize();
						if (0 != (i_152_ & 0x2) && 0 == (2050671733 * npc.anInt10120) && Math.random() * 1000.0 < 10.0) {
							int xDiff = (int) Math.round(Math.random() * 10.0 - 5.0);
							int yDiff = (int) Math.round(Math.random() * 10.0 - 5.0);
							if (0 != xDiff || yDiff != 0) {
								int toX = xDiff + (npc.scenePositionXQueue[0]);
								int toY = ((npc.scenePositionYQueue[0]) + yDiff);
								if (toX < 0)
									toX = 0;
								else if (toX > (aClass283_8716.method2629(-2117729189) - size - 1))
									toX = (aClass283_8716.method2629(-1866331716) - size - 1);
								if (toY < 0)
									toY = 0;
								else if (toY > (aClass283_8716.method2630(519906067) - size - 1))
									toY = (aClass283_8716.method2630(-1049497824) - size - 1);
								int steps = (Class298_Sub37.calculateRoute((npc.scenePositionXQueue[0]), (npc.scenePositionYQueue[0]), size, Class209.setExtraRoutefinderData(toX, toY, size, size, 0),
										(aClass283_8716.getSceneClipDataPlane((npc.plane))), true, calculatedScenePositionXs, calculatedScenePositionYs));
								if (steps > 0) {
									if (steps > 9)
										steps = 9;
									for (int i_159_ = 0; i_159_ < steps; i_159_++) {
										npc.scenePositionXQueue[i_159_] = (calculatedScenePositionXs[steps - i_159_ - 1]);
										npc.scenePositionYQueue[i_159_] = (calculatedScenePositionYs[steps - i_159_ - 1]);
										npc.aByteArray10110[i_159_] = (Class282.aClass282_6540.aByte6542);
									}
									npc.anInt10120 = steps * -1013322787;
								}
							}
						}
						Class341.method4141(npc, true, 2113441601);
						int i_160_ = Class266.method2525(npc, -219055962);
						Class116.method1270(npc, -1234202907);
						Class298_Sub32_Sub36.method3373(npc, -2143152965 * Class331.anInt3565, 236175727 * Class431.anInt6504, i_160_, -1481572185);
						Class411.method5575(npc, -2143152965 * Class331.anInt3565, 1554285314);
						Class473.method6068(npc, (byte) 13);
						Class218 class218 = Class218.method2019();
						class218.method2032(Class220.method2049(npc.aClass386_10084.method4719((byte) 0)), Class220.method2049(npc.aClass386_10111.method4719((byte) 0)), Class220.method2049(npc.aClass386_10113.method4719((byte) 0)));
						npc.method4346(class218);
						class218.method2029();
					}
				}
			}
			if ((19 == anInt8752 * -1233866115 || 18 == anInt8752 * -1233866115 || anInt8752 * -1233866115 == 14 || anInt8752 * -1233866115 == 8)
					&& (!Class315.method3837((byte) 34) || (anInt8752 * -1233866115 == 18 && -1372893999 * Class360.anInt3871 == 42)) && !Class489.method6167(-391880689)) {
				if (Class298_Sub1.anInt7164 * -863531439 == 3)
					Class298_Sub39.method3506(-887753775);
				else
					Class397.method4913((byte) 53);
				if (-1740717447 * Class367.anInt4000 >> 9 < 14 || (-1740717447 * Class367.anInt4000 >> 9 >= aClass283_8716.method2629(-2005655322) - 14) || Class146.anInt1575 * -299812095 >> 9 < 14
						|| (-299812095 * Class146.anInt1575 >> 9 >= aClass283_8716.method2630(-281479847) - 14))
					aClass283_8716.sendMapScene(new Class267((Class266.aClass266_2848), null), -1991819579);
			}
			for (;;) {
				Script class298_sub46 = (Script) aClass453_8660.method5936(2110977409);
				if (class298_sub46 == null) {
					if (i >= -1655691580) {
						/* empty */
					}
					break;
				}
				IComponentDefinition class105 = class298_sub46.aClass105_7525;
				if (-1309843523 * class105.anInt1154 >= 0) {
					IComponentDefinition class105_161_ = Class50.getIComponentDefinitions(1573706803 * class105.anInt1160, (byte) 75);
					if (class105_161_ == null || class105_161_.aClass105Array1292 == null || (class105.anInt1154 * -1309843523 >= class105_161_.aClass105Array1292.length))
						continue;
					if (class105 != (class105_161_.aClass105Array1292[-1309843523 * class105.anInt1154])) {
						if (i >= -1655691580) {
							/* empty */
						}
						continue;
					}
				}
				Class444.method5889(class298_sub46, (byte) -80);
			}
			for (;;) {
				Script class298_sub46 = (Script) aClass453_8895.method5936(2104272776);
				if (class298_sub46 == null) {
					if (i < -1655691580)
						break;
					return;
				}
				IComponentDefinition class105 = class298_sub46.aClass105_7525;
				if (class105.anInt1154 * -1309843523 >= 0) {
					IComponentDefinition class105_162_ = Class50.getIComponentDefinitions(1573706803 * class105.anInt1160, (byte) 54);
					if (class105_162_ == null || null == class105_162_.aClass105Array1292 || (class105.anInt1154 * -1309843523 >= class105_162_.aClass105Array1292.length))
						continue;
					if (class105 != (class105_162_.aClass105Array1292[class105.anInt1154 * -1309843523])) {
						if (i >= -1655691580) {
							/* empty */
						}
						continue;
					}
				}
				Class444.method5889(class298_sub46, (byte) -46);
			}
			for (;;) {
				Script class298_sub46 = (Script) aClass453_8893.method5936(2124467113);
				if (class298_sub46 == null) {
					if (i >= -1655691580) {
						/* empty */
					}
					break;
				}
				IComponentDefinition class105 = class298_sub46.aClass105_7525;
				if (-1309843523 * class105.anInt1154 >= 0) {
					IComponentDefinition class105_163_ = Class50.getIComponentDefinitions(1573706803 * class105.anInt1160, (byte) 71);
					if (class105_163_ == null || class105_163_.aClass105Array1292 == null || (-1309843523 * class105.anInt1154 >= class105_163_.aClass105Array1292.length))
						continue;
					if ((class105_163_.aClass105Array1292[-1309843523 * class105.anInt1154]) != class105) {
						if (i >= -1655691580) {
							/* empty */
						}
						continue;
					}
				}
				Class444.method5889(class298_sub46, (byte) 21);
			}
			if (null != aClass105_8850)
				Class53.method602(-587743288);
			if (443738891 * anInt8884 % 1500 == 0)
				Class141.method1567(-1874138850);
			if ((-1233866115 * anInt8752 == 14 && !Class315.method3837((byte) -38)) || (anInt8752 * -1233866115 == 18 && 42 == Class360.anInt3871 * -1372893999))
				Graphics.method610(99949596);
			Class308.method3784((byte) -37);
			if (aBoolean8736 && (-4876927317316500383L * aLong8892 < Class122.method1319((byte) 1) - 60000L))
				Class52_Sub2.method589(1589950276);
			for (Class302_Sub2 class302_sub2 = (Class302_Sub2) aClass442_8951.method5868(-16777216); class302_sub2 != null; class302_sub2 = ((Class302_Sub2) aClass442_8951.method5872(-1698881635))) {
				if ((long) (-1505693583 * ((Class302_Sub2) class302_sub2).anInt7647) < Class122.method1319((byte) 1) / 1000L - 5L) {
					if (((Class302_Sub2) class302_sub2).aShort7646 > 0)
						Class242_Sub1.method2282(5, 0, "", "", "", new StringBuilder().append(((Class302_Sub2) class302_sub2).aString7648).append(Tradution.aClass470_5901.method6049(Class321.aClass429_3357, -875414210)).toString(), -1638737966);
					if (((Class302_Sub2) class302_sub2).aShort7646 == 0)
						Class242_Sub1.method2282(5, 0, "", "", "", new StringBuilder().append(((Class302_Sub2) class302_sub2).aString7648).append(Tradution.aClass470_5902.method6049(Class321.aClass429_3357, -875414210)).toString(), 750491919);
					class302_sub2.method3714(-250843172);
				}
			}
			if ((14 == anInt8752 * -1233866115 && !Class315.method3837((byte) -62)) || (-1233866115 * anInt8752 == 18 && -1372893999 * Class360.anInt3871 == 42) || 8 == anInt8752 * -1233866115) {
				if (anInt8752 * -1233866115 != 18 && lobbyConnection.method387(537308016) == null)
					Class216.method2001(false, (byte) 100);
				else if (null != lobbyConnection) {
					lobbyConnection.anInt339 += 1797987493;
					if (lobbyConnection.anInt339 * 2033675053 > 50) {
						Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.PING_PACKET, lobbyConnection.aClass449_330, (byte) 52);
						lobbyConnection.method390(class298_sub36, (byte) -13);
					}
					try {
						lobbyConnection.method386(-1252759839);
					} catch (IOException ioexception) {
						if (18 == -1233866115 * anInt8752)
							lobbyConnection.method384((byte) 79);
						else
							Class216.method2001(false, (byte) 120);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.gy(").append(')').toString());
		}
	}

	final void method2772() {
		if (aBoolean8736)
			Class52_Sub2.method589(1480902174);
		Class16.method352(-1837678985);
		if (null != Class373.aClass_ra4071)
			Class373.aClass_ra4071.method5136(1124301967);
		if (Class452.aBoolean5642 && Class231.aFrame2589 != null) {
			Class93.method1010(Class389.aClass457_4164, Class231.aFrame2589, 1636611445);
			Class231.aFrame2589 = null;
		}
		gameConnection.method384((byte) 50);
		((BufferedConnectionContext) gameConnection).aClass124_340.method1382(-1670676523);
		lobbyConnection.method384((byte) 110);
		((BufferedConnectionContext) lobbyConnection).aClass124_340.method1382(-2132756692);
		Class523.method6332(1169249273);
		Class248.aClass247_2752.method2346((byte) -54);
		Class365_Sub1_Sub3.aClass255_9804.method2433(-776756018);
		if (null != aClass404_8715) {
			aClass404_8715.method4948(566548824);
			aClass404_8715 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class244.method2326(502450411);
		try {
			Class444.method5890((byte) -82);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBoolean6480)
			Class117.method1279(-849889720);
	}

	final void method2782() {
		if (aBoolean8736)
			Class52_Sub2.method589(1523652284);
		Class16.method352(190646444);
		if (null != Class373.aClass_ra4071)
			Class373.aClass_ra4071.method5136(761781050);
		if (Class452.aBoolean5642 && Class231.aFrame2589 != null) {
			Class93.method1010(Class389.aClass457_4164, Class231.aFrame2589, -593229897);
			Class231.aFrame2589 = null;
		}
		gameConnection.method384((byte) 15);
		((BufferedConnectionContext) gameConnection).aClass124_340.method1382(-1072650507);
		lobbyConnection.method384((byte) 26);
		((BufferedConnectionContext) lobbyConnection).aClass124_340.method1382(-1922574767);
		Class523.method6332(1756987742);
		Class248.aClass247_2752.method2346((byte) -25);
		Class365_Sub1_Sub3.aClass255_9804.method2433(-2042019743);
		if (null != aClass404_8715) {
			aClass404_8715.method4948(495769489);
			aClass404_8715 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class244.method2326(808532358);
		try {
			Class444.method5890((byte) -20);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBoolean6480)
			Class117.method1279(-849889720);
	}

	void startUp(int i) {
		try {
			if (-1874843963 * Class248.aClass247_2752.anInt2735 > 276316621 * anInt8694) {
				Class474.aClass471_5979.method6058(-1472184385);
				anInt8887 = (Class248.aClass247_2752.anInt2735 * 597723658 - -1674112382);
				if (1634815037 * anInt8887 > 3000)
					anInt8887 = 1385487896;
				if (-1874843963 * Class248.aClass247_2752.anInt2735 >= 2 && 2071451041 * Class248.aClass247_2752.anInt2745 == 6) {
					method2778("js5connect_outofdate", 1290969486);
					anInt8752 = 1532912722;
					return;
				}
				if (-1874843963 * Class248.aClass247_2752.anInt2735 >= 1 && 48 == Class248.aClass247_2752.anInt2745 * 2071451041) {
					method2778("sessionexpired", -1620528831);
					anInt8752 = 1532912722;
					return;
				}
				if (-1874843963 * Class248.aClass247_2752.anInt2735 >= 4 && Class248.aClass247_2752.anInt2745 * 2071451041 == -1) {
					method2778("js5crc", -147236052);
					anInt8752 = 1532912722;
					return;
				}
				if (-1874843963 * Class248.aClass247_2752.anInt2735 >= 4 && Class88.method976(-1233866115 * anInt8752, -1528186124)) {
					if (7 == Class248.aClass247_2752.anInt2745 * 2071451041 || Class248.aClass247_2752.anInt2745 * 2071451041 == 9)
						method2778("js5connect_full", -2072548353);
					else if (2071451041 * Class248.aClass247_2752.anInt2745 > 0) {
						if (null == aString8698)
							method2778("js5connect", 1739880113);
						else
							method2778(new StringBuilder().append("js5proxy_").append(aString8698.trim()).toString(), 846081998);
					} else
						method2778("js5io", -534127401);
					anInt8752 = 1532912722;
					return;
				}
			}
			anInt8694 = 1790042329 * Class248.aClass247_2752.anInt2735;
			if (1634815037 * anInt8887 > 0)
				anInt8887 -= 2003348245;
			else {
				try {
					if (0 == handshakeStage * -333700189) {
						Class423.aSocket5355 = Loader.LOBBY_ENABLED ? Class464.createSocket(Loader.LOBBY_IP, Loader.LOBBY_PORT) : Class474.aClass471_5979.method6056(295506052);
						handshakeStage += -244111349;
					}
					if (handshakeStage * -333700189 == 1) {
						Class365_Sub1_Sub5_Sub2.aClass318_9940 = Class264_Sub4.method2515(Class423.aSocket5355, 125000, -649048480);
						int i_164_ = 13 + aString8655.length();
						RsByteBuffer stream = new RsByteBuffer(i_164_ + 4);
						stream.writeByte((Class211.aClass211_2408.anInt2418) * -1813470547);
						stream.writeByte(i_164_);
						stream.writeInt(Loader.clientRevision, 662709758);
						stream.writeInt(Loader.REVISION, 662709758);
						if (Loader.SUB_REVISION != 0)
							stream.writeInt(Loader.SUB_REVISION, -899867170);
						stream.writeString(aString8655, 2115753617);
						Class365_Sub1_Sub5_Sub2.aClass318_9940.method3868(stream.buffer, 0, i_164_ + 4, 2087409715);
						handshakeStage += -244111349;
						Class205.aLong2341 = (Class122.method1319((byte) 1) * 3230976033870405335L);
					}
					if (2 == -333700189 * handshakeStage) {
						if (Class365_Sub1_Sub5_Sub2.aClass318_9940.isAvailable(1, (byte) -6)) {
							byte[] is = new byte[1];
							int i_165_ = Class365_Sub1_Sub5_Sub2.aClass318_9940.read(is, 0, 1, (byte) 29);
							System.out.println("Returncode: " + is[0]);
							if (is[0] == 25) {
								Loader.handleNewJarDownload();
								return;
							}
							if (is[0] != 0) {
								method2794(i_165_, 1537331688);
								return;
							}
							handshakeStage += -244111349;
						} else if ((Class122.method1319((byte) 1) - (Class205.aLong2341 * 4898534346964759783L)) > 30000L) {
							method2794(1001, 1729333366);
							return;
						}
					}
					if (handshakeStage * -333700189 == 3) {
						Class479[] class479s = Class479.method6104(1922216158);
						int i_166_ = 4 * class479s.length;
						if (Class365_Sub1_Sub5_Sub2.aClass318_9940.isAvailable(i_166_, (byte) -56)) {
							RsByteBuffer stream = new RsByteBuffer(i_166_);
							Class365_Sub1_Sub5_Sub2.aClass318_9940.read(stream.buffer, 0, stream.buffer.length, (byte) 28);
							for (int i_167_ = 0; i_167_ < class479s.length; i_167_++)
								class479s[i_167_].method6103(stream.readInt((byte) 30), 1206092602);
							boolean bool = (Class88.method976(-1233866115 * anInt8752, -1798608797) || Class413.method5584((-1233866115 * anInt8752), 1916221113) || Class299.method3682((anInt8752 * -1233866115), 1765230881));
							Class248.aClass247_2752.method2344(Class365_Sub1_Sub5_Sub2.aClass318_9940, !bool, 2131588995);
							Class423.aSocket5355 = null;
							Class365_Sub1_Sub5_Sub2.aClass318_9940 = null;
							handshakeStage = 0;
						}
					}
				} catch (IOException ioexception) {
					method2794(1002, 1042413501);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.fu(").append(')').toString());
		}
	}

	final void method2784() {
		if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1278701263) == 2) {
			try {
				method2806((byte) 0);
			} catch (ThreadDeath threaddeath) {
				throw threaddeath;
			} catch (Throwable throwable) {
				Class464.method6062(new StringBuilder().append(throwable.getMessage()).append(" ").append(method2761((byte) -30)).toString(), throwable, (short) 876);
				aBoolean8662 = true;
				Class370.method4578(0, false, 622850291);
			}
		} else
			method2806((byte) 0);
	}

	public final void method206() {
		if (method2758(1016289663)) {
			Class209[] class209s = Class266.method2523(-2747182);
			for (int i = 0; i < class209s.length; i++) {
				Class209 class209 = class209s[i];
				String string = ClientScriptMap.anApplet6044.getParameter(class209.aString2395);
				if (string != null) {
					switch (Integer.parseInt(class209.aString2395)) {
					case 9:
						Class73.anInt689 = Integer.parseInt(string) * -2071496301;
						break;
					case 23:
						if (string.equals(Class26.aString355))
							aBoolean8643 = true;
						else
							aBoolean8643 = false;
						break;
					case 33:
						Class112.aString1369 = string;
						break;
					default:
						Class464.method6062("", new RuntimeException(), (short) -3254);
						break;
					case 7:
						Class486.aString6063 = string;
						break;
					case 21:
						Class474.aClass471_5976 = new Class464();
						Class474.aClass471_5976.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 3:
						aString8655 = string;
						break;
					case 12:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8651 = true;
						else
							aBoolean8651 = false;
						break;
					case 18:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8807 = true;
						break;
					case 17:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 11:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8638 = true;
						else
							aBoolean8638 = false;
						break;
					case 24:
						aString8649 = string;
						break;
					case 27:
						Class321.aClass429_3357 = Class429.method5754(Integer.parseInt(string), 422244563);
						break;
					case 30:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8653 = true;
						else
							aBoolean8653 = false;
						break;
					case 22:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8639 = true;
						else
							aBoolean8639 = false;
						break;
					case 13:
						Class242.aClass401_2708 = (Class401) (Class422_Sub20.method5701(Class401.method4936(-2002441744), Integer.parseInt(string), (byte) 2));
						if (Class401.aClass401_6552 == Class242.aClass401_2708)
							Class242.aClass401_2708 = Class401.aClass401_6560;
						else if (!Class401.method4932(Class242.aClass401_2708, 2131067135) && (Class242.aClass401_2708 != Class401.aClass401_6557))
							Class242.aClass401_2708 = Class401.aClass401_6557;
						break;
					case 5:
						Class350.anInt3758 = Integer.parseInt(string) * -339928991;
						break;
					case 32:
						aLong8645 = Long.parseLong(string) * -4477728998236397853L;
						break;
					case 1:
						anInt8665 = Integer.parseInt(string) * 708949575;
						break;
					case 6:
						Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -72);
						if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604))
							Class510.aClass444_6221 = Class444.aClass444_5604;
						break;
					case 20:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.address = string;
						break;
					case 8:
						break;
					case 2:
						aString8648 = string;
						if (aString8648.length() > 100)
							aString8648 = null;
						break;
					case 25:
						anInt8654 = Integer.parseInt(string) * -431443955;
						break;
					case 4:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 31:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8867 = true;
						else
							aBoolean8867 = false;
						break;
					case 10:
						aString8656 = string;
						break;
					case 14:
						break;
					case 29:
						if (null != string) {
							aByteArray8843 = (Class140.method1557(Class328.method3989(string, -1670653072), (byte) 83));
							if (aByteArray8843.length < 16)
								aByteArray8843 = null;
						}
						break;
					case 26:
						aClass411_8944 = Class352.method4244(Integer.parseInt(string), (byte) 39);
						break;
					case 28:
						anInt8971 = Integer.parseInt(string) * 131907935;
						if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length)
							anInt8971 = 0;
						break;
					case 16:
						if (string.equals(Class26.aString355))
							aBoolean8680 = true;
						else
							aBoolean8680 = false;
						break;
					case 15:
						aString8927 = string;
					}
				}
			}
			if (aString8927 == null)
				aString8927 = "";
			Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, aClass411_8944.aString5322);
			Class385.aClient4141 = this;
			method2751(class311, aClass411_8944.aString5317, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(-1477238389), 718, 1, aBoolean8653, (byte) 80);
		}
	}

	public final void method207() {
		if (method2758(-150089276)) {
			Class209[] class209s = Class266.method2523(1350680601);
			for (int i = 0; i < class209s.length; i++) {
				Class209 class209 = class209s[i];
				String string = ClientScriptMap.anApplet6044.getParameter(class209.aString2395);
				if (string != null) {
					switch (Integer.parseInt(class209.aString2395)) {
					case 9:
						Class73.anInt689 = Integer.parseInt(string) * -2071496301;
						break;
					case 23:
						if (string.equals(Class26.aString355))
							aBoolean8643 = true;
						else
							aBoolean8643 = false;
						break;
					case 33:
						Class112.aString1369 = string;
						break;
					default:
						Class464.method6062("", new RuntimeException(), (short) -7537);
						break;
					case 7:
						Class486.aString6063 = string;
						break;
					case 21:
						Class474.aClass471_5976 = new Class464();
						Class474.aClass471_5976.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 3:
						aString8655 = string;
						break;
					case 12:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8651 = true;
						else
							aBoolean8651 = false;
						break;
					case 18:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8807 = true;
						break;
					case 17:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 11:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8638 = true;
						else
							aBoolean8638 = false;
						break;
					case 24:
						aString8649 = string;
						break;
					case 27:
						Class321.aClass429_3357 = Class429.method5754(Integer.parseInt(string), 1006289259);
						break;
					case 30:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8653 = true;
						else
							aBoolean8653 = false;
						break;
					case 22:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8639 = true;
						else
							aBoolean8639 = false;
						break;
					case 13:
						Class242.aClass401_2708 = (Class401) (Class422_Sub20.method5701(Class401.method4936(-890747284), Integer.parseInt(string), (byte) 2));
						if (Class401.aClass401_6552 == Class242.aClass401_2708)
							Class242.aClass401_2708 = Class401.aClass401_6560;
						else if (!Class401.method4932(Class242.aClass401_2708, 2094353987) && (Class242.aClass401_2708 != Class401.aClass401_6557))
							Class242.aClass401_2708 = Class401.aClass401_6557;
						break;
					case 5:
						Class350.anInt3758 = Integer.parseInt(string) * -339928991;
						break;
					case 32:
						aLong8645 = Long.parseLong(string) * -4477728998236397853L;
						break;
					case 1:
						anInt8665 = Integer.parseInt(string) * 708949575;
						break;
					case 6:
						Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -52);
						if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604))
							Class510.aClass444_6221 = Class444.aClass444_5604;
						break;
					case 20:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.address = string;
						break;
					case 8:
						break;
					case 2:
						aString8648 = string;
						if (aString8648.length() > 100)
							aString8648 = null;
						break;
					case 25:
						anInt8654 = Integer.parseInt(string) * -431443955;
						break;
					case 4:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 31:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8867 = true;
						else
							aBoolean8867 = false;
						break;
					case 10:
						aString8656 = string;
						break;
					case 14:
						break;
					case 29:
						if (null != string) {
							aByteArray8843 = (Class140.method1557(Class328.method3989(string, 509279540), (byte) 84));
							if (aByteArray8843.length < 16)
								aByteArray8843 = null;
						}
						break;
					case 26:
						aClass411_8944 = Class352.method4244(Integer.parseInt(string), (byte) 20);
						break;
					case 28:
						anInt8971 = Integer.parseInt(string) * 131907935;
						if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length)
							anInt8971 = 0;
						break;
					case 16:
						if (string.equals(Class26.aString355))
							aBoolean8680 = true;
						else
							aBoolean8680 = false;
						break;
					case 15:
						aString8927 = string;
					}
				}
			}
			if (aString8927 == null)
				aString8927 = "";
			Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, aClass411_8944.aString5322);
			Class385.aClient4141 = this;
			method2751(class311, aClass411_8944.aString5317, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(1155058529), 718, 1, aBoolean8653, (byte) -51);
		}
	}

	public final void method208() {
		if (method2758(2074155450)) {
			Class209[] class209s = Class266.method2523(-913728975);
			for (int i = 0; i < class209s.length; i++) {
				Class209 class209 = class209s[i];
				String string = ClientScriptMap.anApplet6044.getParameter(class209.aString2395);
				if (string != null) {
					switch (Integer.parseInt(class209.aString2395)) {
					case 9:
						Class73.anInt689 = Integer.parseInt(string) * -2071496301;
						break;
					case 23:
						if (string.equals(Class26.aString355))
							aBoolean8643 = true;
						else
							aBoolean8643 = false;
						break;
					case 33:
						Class112.aString1369 = string;
						break;
					default:
						Class464.method6062("", new RuntimeException(), (short) 868);
						break;
					case 7:
						Class486.aString6063 = string;
						break;
					case 21:
						Class474.aClass471_5976 = new Class464();
						Class474.aClass471_5976.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 3:
						aString8655 = string;
						break;
					case 12:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8651 = true;
						else
							aBoolean8651 = false;
						break;
					case 18:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8807 = true;
						break;
					case 17:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 11:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8638 = true;
						else
							aBoolean8638 = false;
						break;
					case 24:
						aString8649 = string;
						break;
					case 27:
						Class321.aClass429_3357 = Class429.method5754(Integer.parseInt(string), 2074884925);
						break;
					case 30:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8653 = true;
						else
							aBoolean8653 = false;
						break;
					case 22:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8639 = true;
						else
							aBoolean8639 = false;
						break;
					case 13:
						Class242.aClass401_2708 = (Class401) (Class422_Sub20.method5701(Class401.method4936(-292786858), Integer.parseInt(string), (byte) 2));
						if (Class401.aClass401_6552 == Class242.aClass401_2708)
							Class242.aClass401_2708 = Class401.aClass401_6560;
						else if (!Class401.method4932(Class242.aClass401_2708, 2141395178) && (Class242.aClass401_2708 != Class401.aClass401_6557))
							Class242.aClass401_2708 = Class401.aClass401_6557;
						break;
					case 5:
						Class350.anInt3758 = Integer.parseInt(string) * -339928991;
						break;
					case 32:
						aLong8645 = Long.parseLong(string) * -4477728998236397853L;
						break;
					case 1:
						anInt8665 = Integer.parseInt(string) * 708949575;
						break;
					case 6:
						Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -74);
						if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604))
							Class510.aClass444_6221 = Class444.aClass444_5604;
						break;
					case 20:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.address = string;
						break;
					case 8:
						break;
					case 2:
						aString8648 = string;
						if (aString8648.length() > 100)
							aString8648 = null;
						break;
					case 25:
						anInt8654 = Integer.parseInt(string) * -431443955;
						break;
					case 4:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 31:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8867 = true;
						else
							aBoolean8867 = false;
						break;
					case 10:
						aString8656 = string;
						break;
					case 14:
						break;
					case 29:
						if (null != string) {
							aByteArray8843 = (Class140.method1557(Class328.method3989(string, -315411760), (byte) 64));
							if (aByteArray8843.length < 16)
								aByteArray8843 = null;
						}
						break;
					case 26:
						aClass411_8944 = Class352.method4244(Integer.parseInt(string), (byte) 67);
						break;
					case 28:
						anInt8971 = Integer.parseInt(string) * 131907935;
						if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length)
							anInt8971 = 0;
						break;
					case 16:
						if (string.equals(Class26.aString355))
							aBoolean8680 = true;
						else
							aBoolean8680 = false;
						break;
					case 15:
						aString8927 = string;
					}
				}
			}
			if (aString8927 == null)
				aString8927 = "";
			Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, aClass411_8944.aString5322);
			Class385.aClient4141 = this;
			method2751(class311, aClass411_8944.aString5317, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(-1507101618), 718, 1, aBoolean8653, (byte) -75);
		}
	}

	public final void method204() {
		if (method2758(1279242864)) {
			Class209[] class209s = Class266.method2523(2103696164);
			for (int i = 0; i < class209s.length; i++) {
				Class209 class209 = class209s[i];
				String string = ClientScriptMap.anApplet6044.getParameter(class209.aString2395);
				if (string != null) {
					switch (Integer.parseInt(class209.aString2395)) {
					case 9:
						Class73.anInt689 = Integer.parseInt(string) * -2071496301;
						break;
					case 23:
						if (string.equals(Class26.aString355))
							aBoolean8643 = true;
						else
							aBoolean8643 = false;
						break;
					case 33:
						Class112.aString1369 = string;
						break;
					default:
						Class464.method6062("", new RuntimeException(), (short) -23039);
						break;
					case 7:
						Class486.aString6063 = string;
						break;
					case 21:
						Class474.aClass471_5976 = new Class464();
						Class474.aClass471_5976.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 3:
						aString8655 = string;
						break;
					case 12:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8651 = true;
						else
							aBoolean8651 = false;
						break;
					case 18:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8807 = true;
						break;
					case 17:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 11:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8638 = true;
						else
							aBoolean8638 = false;
						break;
					case 24:
						aString8649 = string;
						break;
					case 27:
						Class321.aClass429_3357 = Class429.method5754(Integer.parseInt(string), 556012524);
						break;
					case 30:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8653 = true;
						else
							aBoolean8653 = false;
						break;
					case 22:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8639 = true;
						else
							aBoolean8639 = false;
						break;
					case 13:
						Class242.aClass401_2708 = (Class401) (Class422_Sub20.method5701(Class401.method4936(1007543512), Integer.parseInt(string), (byte) 2));
						if (Class401.aClass401_6552 == Class242.aClass401_2708)
							Class242.aClass401_2708 = Class401.aClass401_6560;
						else if (!Class401.method4932(Class242.aClass401_2708, 2074117544) && (Class242.aClass401_2708 != Class401.aClass401_6557))
							Class242.aClass401_2708 = Class401.aClass401_6557;
						break;
					case 5:
						Class350.anInt3758 = Integer.parseInt(string) * -339928991;
						break;
					case 32:
						aLong8645 = Long.parseLong(string) * -4477728998236397853L;
						break;
					case 1:
						anInt8665 = Integer.parseInt(string) * 708949575;
						break;
					case 6:
						Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -119);
						if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604))
							Class510.aClass444_6221 = Class444.aClass444_5604;
						break;
					case 20:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.address = string;
						break;
					case 8:
						break;
					case 2:
						aString8648 = string;
						if (aString8648.length() > 100)
							aString8648 = null;
						break;
					case 25:
						anInt8654 = Integer.parseInt(string) * -431443955;
						break;
					case 4:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 31:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8867 = true;
						else
							aBoolean8867 = false;
						break;
					case 10:
						aString8656 = string;
						break;
					case 14:
						break;
					case 29:
						if (null != string) {
							aByteArray8843 = (Class140.method1557(Class328.method3989(string, -394383445), (byte) 114));
							if (aByteArray8843.length < 16)
								aByteArray8843 = null;
						}
						break;
					case 26:
						aClass411_8944 = Class352.method4244(Integer.parseInt(string), (byte) 122);
						break;
					case 28:
						anInt8971 = Integer.parseInt(string) * 131907935;
						if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length)
							anInt8971 = 0;
						break;
					case 16:
						if (string.equals(Class26.aString355))
							aBoolean8680 = true;
						else
							aBoolean8680 = false;
						break;
					case 15:
						aString8927 = string;
					}
				}
			}
			if (aString8927 == null)
				aString8927 = "";
			Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, aClass411_8944.aString5322);
			Class385.aClient4141 = this;
			method2751(class311, aClass411_8944.aString5317, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(1164456300), 718, 1, aBoolean8653, (byte) 22);
		}
	}

	public final void method211() {
		if (method2758(-967809085)) {
			Class209[] class209s = Class266.method2523(103288217);
			for (int i = 0; i < class209s.length; i++) {
				Class209 class209 = class209s[i];
				String string = ClientScriptMap.anApplet6044.getParameter(class209.aString2395);
				if (string != null) {
					switch (Integer.parseInt(class209.aString2395)) {
					case 9:
						Class73.anInt689 = Integer.parseInt(string) * -2071496301;
						break;
					case 23:
						if (string.equals(Class26.aString355))
							aBoolean8643 = true;
						else
							aBoolean8643 = false;
						break;
					case 33:
						Class112.aString1369 = string;
						break;
					default:
						Class464.method6062("", new RuntimeException(), (short) -24314);
						break;
					case 7:
						Class486.aString6063 = string;
						break;
					case 21:
						Class474.aClass471_5976 = new Class464();
						Class474.aClass471_5976.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 3:
						aString8655 = string;
						break;
					case 12:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8651 = true;
						else
							aBoolean8651 = false;
						break;
					case 18:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8807 = true;
						break;
					case 17:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8958 = true;
						else
							aBoolean8958 = false;
						break;
					case 11:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8638 = true;
						else
							aBoolean8638 = false;
						break;
					case 24:
						aString8649 = string;
						break;
					case 27:
						Class321.aClass429_3357 = Class429.method5754(Integer.parseInt(string), 1190807224);
						break;
					case 30:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8653 = true;
						else
							aBoolean8653 = false;
						break;
					case 22:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8639 = true;
						else
							aBoolean8639 = false;
						break;
					case 13:
						Class242.aClass401_2708 = (Class401) (Class422_Sub20.method5701(Class401.method4936(-1055186700), Integer.parseInt(string), (byte) 2));
						if (Class401.aClass401_6552 == Class242.aClass401_2708)
							Class242.aClass401_2708 = Class401.aClass401_6560;
						else if (!Class401.method4932(Class242.aClass401_2708, 2064566243) && (Class242.aClass401_2708 != Class401.aClass401_6557))
							Class242.aClass401_2708 = Class401.aClass401_6557;
						break;
					case 5:
						Class350.anInt3758 = Integer.parseInt(string) * -339928991;
						break;
					case 32:
						aLong8645 = Long.parseLong(string) * -4477728998236397853L;
						break;
					case 1:
						anInt8665 = Integer.parseInt(string) * 708949575;
						break;
					case 6:
						Class510.aClass444_6221 = Class444.method5888(Integer.parseInt(string), (byte) -68);
						if (Class510.aClass444_6221 != Class444.aClass444_5605 && (Class510.aClass444_6221 != Class444.aClass444_5602) && (Class444.aClass444_5603 != Class510.aClass444_6221) && (Class510.aClass444_6221 != Class444.aClass444_5604))
							Class510.aClass444_6221 = Class444.aClass444_5604;
						break;
					case 20:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.address = string;
						break;
					case 8:
						break;
					case 2:
						aString8648 = string;
						if (aString8648.length() > 100)
							aString8648 = null;
						break;
					case 25:
						anInt8654 = Integer.parseInt(string) * -431443955;
						break;
					case 4:
						if (Class241.aClass471_2705 == null)
							Class241.aClass471_2705 = new Class464();
						Class241.aClass471_2705.worldId = Integer.parseInt(string) * 348739329;
						break;
					case 31:
						if (string.equalsIgnoreCase(Class26.aString355))
							aBoolean8867 = true;
						else
							aBoolean8867 = false;
						break;
					case 10:
						aString8656 = string;
						break;
					case 14:
						break;
					case 29:
						if (null != string) {
							aByteArray8843 = (Class140.method1557(Class328.method3989(string, -1400546512), (byte) 95));
							if (aByteArray8843.length < 16)
								aByteArray8843 = null;
						}
						break;
					case 26:
						aClass411_8944 = Class352.method4244(Integer.parseInt(string), (byte) 95);
						break;
					case 28:
						anInt8971 = Integer.parseInt(string) * 131907935;
						if (745003679 * anInt8971 < 0 || 745003679 * anInt8971 >= aColorArray8689.length)
							anInt8971 = 0;
						break;
					case 16:
						if (string.equals(Class26.aString355))
							aBoolean8680 = true;
						else
							aBoolean8680 = false;
						break;
					case 15:
						aString8927 = string;
					}
				}
			}
			if (aString8927 == null)
				aString8927 = "";
			Class311 class311 = new Class311(775068819 * anInt8794, -791746413 * anInt8803, 351263031 * anInt8727, anInt8910 * -510898275, aClass411_8944.aString5322);
			Class385.aClient4141 = this;
			method2751(class311, aClass411_8944.aString5317, Class510.aClass444_6221.aString5607, 32 + 1286017487 * Class510.aClass444_6221.anInt5608, Class356.method4268(-418428626), 718, 1, aBoolean8653, (byte) 29);
		}
	}

	final void method2781() {
		if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1480003909) == 2) {
			try {
				method2806((byte) 0);
			} catch (ThreadDeath threaddeath) {
				throw threaddeath;
			} catch (Throwable throwable) {
				Class464.method6062(new StringBuilder().append(throwable.getMessage()).append(" ").append(method2761((byte) -19)).toString(), throwable, (short) -2557);
				aBoolean8662 = true;
				Class370.method4578(0, false, 622850291);
			}
		} else
			method2806((byte) 0);
	}

	static final void method2811(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class100.anInt1079 * -1537941929;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("client.amm(").append(')').toString());
		}
	}
}
