
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

@SuppressWarnings({"rawtypes", "unchecked"})
public final class client extends Engine {
	public static float aFloat7146;
	static boolean aBool7147;
	static int[] anIntArray7148;
	public static int anInt7149;
	static int[] anIntArray7150;
	public static boolean aBool7151;
	public static byte[] aByteArray7152;
	public static long aLong7153;
	public static Interface16[] anInterface16Array7154;
	public static boolean aBool7155;
	static String aString7156;
	public static String aString7157;
	public static boolean aBool7158;
	public static boolean aBool7159;
	static boolean aBool7160;
	static boolean aBool7161;
	public static int anInt7162;
	static int anInt7163;
	static String aString7164;
	public static String aString7165;
	public static int anInt7166;
	static Matrix44Arr aClass384_7167;
	static boolean aBool7168;
	static Matrix44Var aClass294_7169;
	static long aLong7170;
	public static boolean aBool7171;
	static boolean aBool7172;
	public static int anInt7173;
	public static int cycles;
	public static boolean aBool7175;
	static boolean aBool7176;
	static boolean aBool7177;
	public static int anInt7178;
	static int anInt7179;
	public static Class281[] aClass281Array7180;
	public static int anInt7182;
	public static IComponentDefinitions aClass118_7183;
	static int anInt7184;
	public static boolean aBool7185;
	public static Color[] aColorArray7186;
	static int anInt7187;
	public static int anInt7188;
	public static boolean aBool7189;
	public static int anInt7190;
	static int anInt7191;
	static int anInt7192;
	public static int anInt7193;
	static int[] anIntArray7194;
	public static int anInt7196;
	static int[] anIntArray7198;
	public static Color[] aColorArray7199;
	public static Color[] aColorArray7200;
	static int anInt7201;
	static int anInt7202;
	static int anInt7203;
	static SoftCache aClass229_7204;
	static int anInt7205;
	public static Interface35 anInterface35_7206;
	public static IterableNodeMap aClass465_7208;
	public static Class282_Sub47[] aClass282_Sub47Array7209;
	public static int anInt7210;
	public static int anInt7211;
	public static int[] anIntArray7212;
	static int npcListSize;
	public static short aShort7214;
	static int anInt7215;
	static int anInt7216;
	public static int anInt7217;
	public static Class184 aClass184_7218;
	public static boolean aBool7219;
	public static Class184[] aClass184Array7220;
	static int anInt7221;
	static int[] anIntArray7222;
	public static Class508 aClass508_7223;
	public static boolean aBool7224;
	public static volatile boolean aBool7225;
	public static Object anObject7226;
	public static Object anObject7227;
	public static int[] anIntArray7228;
	public static int[] anIntArray7230;
	public static int anInt7231;
	static int anInt7232;
	static NodeCollection aClass482_7233;
	public static int anInt7234;
	static int anInt7235;
	public static int anInt7236;
	public static int anInt7237;
	public static int anInt7238;
	static short[] aShortArray7239;
	public static int anInt7240;
	static boolean aBool7241;
	static int[] anIntArray7243;
	public static boolean aBool7244;
	static int[] walkStepsX;
	static int[] walkStepsY;
	static IComponentDefinitions aClass118_7247;
	static int anInt7248;
	static int anInt7249;
	static int anInt7250;
	static int anInt7251;
	static int anInt7252;
	static int anInt7253;
	static int anInt7255;
	public static int anInt7256;
	static IComponentDefinitions aClass118_7257;
	static int anInt7258;
	static int anInt7259;
	static Random aRandom7260;
	static int anInt7261;
	public static int anInt7262;
	static int[] anIntArray7263;
	static boolean aBool7264;
	static int anInt7265;
	static float aFloat7266;
	public static NodeCollection aClass482_7267;
	static int[] anIntArray7268;
	static boolean aBool7269;
	public static int anInt7270;
	public static int anInt7271;
	static int anInt7273;
	public static String aString7275;
	public static short aShort7276;
	public static int anInt7277;
	static Calendar aCalendar7278;
	public static int anInt7279;
	public static int anInt7280;
	static String aString7281;
	static int[] NPC_INDICES;
	static int[] anIntArray7283;
	static float aFloat7284;
	static boolean aBool7285;
	public static int anInt7286;
	static int[] anIntArray7287;
	static int[] anIntArray7288;
	static Class457 aClass457_7290;
	static int anInt7291;
	public static float[] aFloatArray7292;
	static int anInt7293;
	static int anInt7294;
	static int anInt7295;
	static int anInt7296;
	static int anInt7297;
	public static Interface16[] anInterface16Array7298;
	public static int anInt7300;
	static boolean aBool7301;
	public static int[][][] anIntArrayArrayArray7302;
	static int[] anIntArray7303;
	static int anInt7304;
	static int[] anIntArray7305;
	static int[] anIntArray7306;
	static long aLong7307;
	static int anInt7309;
	public static boolean aBool7310;
	static int anInt7311;
	public static int anInt7312;
	public static Player[] players;
	public static int anInt7315;
	public static boolean aBool7316;
	public static boolean membersWorld;
	public static int rights;
	public static int anInt7319;
	static int anInt7320;
	public static boolean aBool7321;
	static boolean aBool7322;
	public static boolean aBool7323;
	public static short aShort7324;
	public static boolean aBool7325;
	public static int anInt7327;
	static int[] anIntArray7328;
	static String[] aStringArray7329;
	static boolean[] aBoolArray7330;
	static boolean aBool7331;
	static int anInt7332;
	public static NodeCollection aClass482_7333;
	public static IterableNodeMap aClass465_7334;
	public static Class457 aClass457_7335;
	public static int[] anIntArray7336;
	public static int[] anIntArray7337;
	public static int[] anIntArray7338;
	static int anInt7339;
	public static int anInt7340;
	public static int anInt7341;
	public static int anInt7342;
	static int anInt7343;
	public static boolean aBool7344;
	static int anInt7345;
	static int anInt7346;
	public static int anInt7347;
	public static Class180[] aClass180Array7348;
	public static volatile int anInt7349;
	static Class457 aClass457_7350;
	static int anInt7351;
	public static IComponentDefinitions aClass118_7352;
	public static int anInt7354;
	static boolean aBool7355;
	public static String aString7356;
	static int anInt7357;
	static boolean aBool7358;
	public static String aString7359;
	static int anInt7361;
	static int anInt7362;
	static boolean aBool7364;
	public static float aFloat7365;
	static int anInt7366;
	static int anInt7367;
	static int anInt7368;
	static boolean aBool7369;
	static IComponentDefinitions aClass118_7370;
	public static boolean aBool7371;
	static boolean aBool7372;
	public static int anInt7373;
	static boolean aBool7374;
	static boolean aBool7375;
	public static int anInt7376;
	public static int anInt7377;
	static int[] anIntArray7379;
	static int[] anIntArray7380;
	static int[] anIntArray7381;
	static int anInt7382;
	static int anInt7384;
	static int anInt7386;
	static int[] anIntArray7387;
	static int anInt7388;
	static int anInt7389;
	static int anInt7390;
	public static int anInt7391;
	public static boolean aBool7393;
	public static short aShort7394;
	static int anInt7395;
	static int anInt7396;
	static int anInt7397;
	public static int anInt7399;
	public static boolean aBool7400;
	static long aLong7401;
	public static NodeCollection aClass482_7402;
	static boolean aBool7403;
	static NodeCollection aClass482_7404;
	static IterableNodeMap aClass465_7405;
	static int anInt7407;
	static int anInt7408;
	static long aLong7409;
	static boolean[] aBoolArray7410;
	static Rectangle[] aRectangleArray7411;
	static int anInt7412;
	public static int anInt7413;
	public static IterableNodeMap aClass465_7414;
	static int anInt7415;
	public static int anInt7416;
	static int[] anIntArray7417;
	static int anInt7418;
	static Class163[] aClass163Array7419;
	static int[] anIntArray7420;
	static int[] anIntArray7421;
	public static int anInt7422;
	static long[] aLongArray7424;
	static int[] anIntArray7425;
	public static String aString7426;
	static int anInt7427;
	public static Class330[] aClass330Array7428;
	static int anInt7429;
	static boolean[] aBoolArray7431;
	static int anInt7432;
	static int[] anIntArray7433;
	public static int anInt7434;
	static int[] anIntArray7435;
	public static short aShort7436;
	public static short aShort7437;
	static int[] anIntArray7438;
	public static int anInt7439;
	public static int anInt7440;
	public static short aShort7441;
	public static IterableNodeMap aClass465_7442;
	public static boolean[] aBoolArray7443;
	static int anInt7444;
	static int anInt7445;
	public static Interface25 anInterface25_7446;
	public static int anInt7447;
	public static int anInt7448;
	public static int anInt7449;
	public static Game CURRENT_GAME = null;
	static int anInt7451;
	public static Class6[] aClass6Array7452;
	static int anInt7453;
	static boolean aBool7454;
	public static Class10[] aClass10Array7456;
	static Matrix44Var aClass294_7457;
	public static byte aByte7458;
	static boolean aBool7459;
	static int[] anIntArray7461;
	static int[] anIntArray7462;
	static String aString7463;
	public static boolean aBool7465;
	static int anInt7472;
	public static short aShort7474;
	public static Class184 aClass184_7475;
	static int anInt7476;
	//public static DiscordRichPresence presence;

	public final void init() {
		if (method4665((byte) 80)) {
			String string = "";
			Class358[] class358s = Class153.method2619(860702591);
			for (int i = 0; i < class358s.length; i++) {
				Class358 class358 = class358s[i];
				String string_2_ = Class282_Sub44.anApplet8065.getParameter(class358.aString4159);
				if (null != string_2_) {
					switch (Integer.parseInt(class358.aString4159)) {
					case 13:
						Class464.aString5555 = string_2_;
						break;
					case 4:
						aString7156 = string_2_;
						if (aString7156.length() > 100)
							aString7156 = null;
						break;
					case 5:
						if (Class448.aClass450_5424 == null)
							Class448.aClass450_5424 = new Class450();
						Class448.aClass450_5424.aString5433 = string_2_;
						break;
					case 9:
						if (string_2_.equalsIgnoreCase(Class2.aString13))
							aBool7310 = true;
						else
							aBool7310 = false;
						break;
					case 3:
						aString7165 = string_2_;
						break;
					case 1:
						if (null != string_2_) {
							aByteArray7152 = (Class378.method6436(Class75.method1353(string_2_, -808427320), -634179594));
							if (aByteArray7152.length < 16)
								aByteArray7152 = null;
						}
						break;
					case 17:
						aString7164 = string_2_;
						break;
					case 31:
						Class223.CURRENT_LANGUAGE = Language.method8278(Integer.parseInt(string_2_), 1916155090);
						break;
					case 2:
						if (string_2_.equalsIgnoreCase(Class2.aString13))
							aBool7158 = true;
						else
							aBool7158 = false;
						break;
					case 12:
						break;
					case 28:
						if (string_2_.equals(Class2.aString13))
							aBool7189 = true;
						else
							aBool7189 = false;
						break;
					case 29:
						if (string_2_.equals(Class2.aString13))
							aBool7151 = true;
						else
							aBool7151 = false;
						break;
					case 27:
						anInt7163 = Integer.parseInt(string_2_) * -874138425;
						break;
					case 21:
						break;
					case 20:
						aString7157 = string_2_;
						break;
					case 8:
						CURRENT_GAME = IncomingPacket.method6376(Integer.parseInt(string_2_), 265812512);
						break;
					case 25:
						if (string_2_.equalsIgnoreCase(Class2.aString13))
							aBool7159 = true;
						else
							aBool7159 = false;
						break;
					case 14:
						if (Class448.aClass450_5424 == null)
							Class448.aClass450_5424 = new Class450();
						Class448.aClass450_5424.worldId = Integer.parseInt(string_2_) * -1933199413;
						break;
					case 6:
						TilestreamPacket.anInt4219 = Integer.parseInt(string_2_) * -37116627;
						break;
					case 34:
						Class445.aString5384 = string_2_;
						break;
					case 7:
						string = string_2_;
						break;
					case 23:
						anInt7149 = Integer.parseInt(string_2_) * 1564360473;
						break;
					case 24:
						Class90.aClass496_952 = ((Class496) Class386.method6672(Class496.method8299(1459523387), Integer.parseInt(string_2_), -1573621925));
						if (Class496.aClass496_5810 == Class90.aClass496_952)
							Class90.aClass496_952 = Class496.aClass496_5807;
						else if (!Class496.method8308(Class90.aClass496_952, 1201911871) && (Class496.aClass496_5813 != Class90.aClass496_952))
							Class90.aClass496_952 = Class496.aClass496_5813;
						break;
					case 26:
						aLong7153 = (Long.parseLong(string_2_) * -5626745816563543837L);
						break;
					case 30:
						RenderAnimDefs.anInt2831 = Integer.parseInt(string_2_) * -917544917;
						break;
					case 33:
						aString7281 = string_2_;
						break;
					case 11:
						if (string_2_.equalsIgnoreCase(Class2.aString13))
							aBool7161 = true;
						else
							aBool7161 = false;
						break;
					default:
						Class151.method2594("", new RuntimeException(), (byte) -14);
						break;
					case 32:
						RegionMap.aString3643 = string_2_;
						break;
					case 22:
						if (string_2_.equalsIgnoreCase(Class2.aString13))
							aBool7160 = true;
						else
							aBool7160 = false;
						break;
					case 15:
						Class176.aClass472_2201 = Class182.method3040(Integer.parseInt(string_2_), (byte) -28);
						if (Class176.aClass472_2201 != Class472.aClass472_5599 && (Class472.aClass472_5598 != Class176.aClass472_2201) && (Class176.aClass472_2201 != Class472.aClass472_5596) && (Class176.aClass472_2201 != Class472.aClass472_5600))
							Class176.aClass472_2201 = Class472.aClass472_5600;
						break;
					case 16:
						Class448.aClass450_5420 = new Class450();
						Class448.aClass450_5420.worldId = Integer.parseInt(string_2_) * -1933199413;
						break;
					case 18:
						if (string_2_.equalsIgnoreCase(Class2.aString13))
							aBool7316 = true;
						break;
					case 35:
						anInt7447 = Integer.parseInt(string_2_) * 826882953;
						if (1920182969 * anInt7447 < 0 || (anInt7447 * 1920182969 >= aColorArray7186.length))
							anInt7447 = 0;
						break;
					case 10:
						if (string_2_.equalsIgnoreCase(Class2.aString13))
							aBool7147 = true;
						else
							aBool7147 = false;
					}
				}
			}
			if (null == aString7281)
				aString7281 = "";
			Class274 class274 = new Class274(150480619 * anInt7439, 1176039023 * anInt7312, anInt7309 * 1226390255, anInt7205 * 429626423, CURRENT_GAME.aString5749);
			Class308.aclient3620 = this;
			String string_3_ = Class176.aClass472_2201.aString5601;
			int i = -2001827121 * Class176.aClass472_2201.anInt5602 + 32;
			if (!string.equals("")) {
				string_3_ = new StringBuilder().append(string_3_).append("_").append(string).toString();
				i = 0;
			}
			method4655(class274, CURRENT_GAME.aString5748, string_3_, i, Class123.method2149(957345803), 727, 1, aBool7161, 1114711538);
		}
	}

	final void method4677(int i) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1787736351) == 2) {
			try {
				method11618((byte) 14);
			} catch (ThreadDeath threaddeath) {
				throw threaddeath;
			} catch (Throwable throwable) {
				Class151.method2594(new StringBuilder().append(throwable.getMessage()).append(" ").append(method4669(983158904)).toString(), throwable, (byte) -77);
				aBool7171 = true;
				Class538.method11500(0, false, (byte) 24);
			}
		} else
			method11618((byte) 26);
	}

	void method11618(byte i) {
		if (anInt7166 * -1741204137 != 16) {
			if (aBool7225) {
				synchronized (anObject7227) {
					anObject7227.notify();
				}
				synchronized (anObject7226) {
					try {
						anObject7226.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool7225 = false;
			}
			cycles += 1968179203;
			if (-1809259861 * cycles % 1000 == 1) {
				GregorianCalendar gregoriancalendar = new GregorianCalendar();
				PacketsDecoder.anInt9079 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6) * -916009099;
				aRandom7260.setSeed((long) (PacketsDecoder.anInt9079 * -242333475));
			}
			aClass184_7475.method3059(-1650964006);
			aClass184_7218.method3059(-1386724833);
			method11622(-1461261501);
			if (Class468_Sub9.JS5_MANAGER != null)
				Class468_Sub9.JS5_MANAGER.method5482(2044223540);
			ObjectDefinitions.method8020(-2003966578);
			Class158_Sub1_Sub2.method15536(466978251);
			Class96_Sub21.aClass199_9438.method3235((byte) -27);
			Class163.aClass209_2031.method3589((byte) 19);
			if (Renderers.SOFTWARE_RENDERER != null)
				Renderers.SOFTWARE_RENDERER.method8398((int) Class169.method2869(1607634051));
			anInt7193 = 0;
			anInt7196 = 0;
			for (Interface16 interface16 = Class96_Sub21.aClass199_9438.method3237(50218263); null != interface16; interface16 = Class96_Sub21.aClass199_9438.method3237(-1126150226)) {
				int i_4_ = interface16.method84(2070414047);
				if (2 == i_4_ || 3 == i_4_) {
					char c = interface16.method118(-176963649);
					if (Class298.method5303((byte) 37) && (c == '`' || c == '\u00a7' || c == '\u00b2')) {
						if (Class521_Sub1_Sub3_Sub1.method16081(16711935))
							Class173.method2944(1516285434);
						else
							SpotAnimDefinitions.method11243(1225769000);
					} else if (anInt7193 * -1911445195 < 131) {
						anInterface16Array7154[-1911445195 * anInt7193] = interface16;
						anInt7193 += 1919951133;
					}
				} else if (i_4_ == 0 && anInt7196 * -809233249 < 75) {
					anInterface16Array7298[-809233249 * anInt7196] = interface16;
					anInt7196 += -892074145;
				}
			}
			anInt7191 = 0;
			for (Class282_Sub53 class282_sub53 = Class163.aClass209_2031.method3571((byte) 13); null != class282_sub53; class282_sub53 = Class163.aClass209_2031.method3571((byte) 69)) {
				int i_5_ = class282_sub53.method13470(1548872878);
				if (-1 == i_5_)
					JS5CacheFile.method3353(class282_sub53, 342240407);
				else if (6 == i_5_) {
					anInt7191 += class282_sub53.method13473((byte) 1) * 1927076255;
					class282_sub53.method13475(-667277258);
				} else if (Class298.method5304(i_5_, -1452447223)) {
					aClass482_7267.append(class282_sub53, 1804983209);
					if (aClass482_7267.size(-1374254477) > 10) {
						Class282_Sub53 class282_sub53_6_ = ((Class282_Sub53) aClass482_7267.method8061((byte) -45));
						if (class282_sub53_6_ != null)
							class282_sub53_6_.method13475(1848572957);
					}
				}
			}
			if (Class521_Sub1_Sub3_Sub1.method16081(16711935))
				Class301.method5333(998996232);
			if (Class504.method8388(anInt7166 * -1741204137, (byte) 80)) {
				Class468_Sub20.method12808(1176039023);
				Class282_Sub15_Sub1.method14840((byte) 69);
			} else if (Class464.method7742(anInt7166 * -1741204137, (byte) 12))
				IndexLoaders.MAP_REGION_DECODER.method4461((byte) -96);
			if (Class97.method1612(anInt7166 * -1741204137, 1908805257) && !Class464.method7742(anInt7166 * -1741204137, (byte) 101)) {
				method12044((short) 3630);
				Class521_Sub1_Sub5_Sub1.handleAccountCreationStart(-1548261686);
				Login.method5018((byte) -128);
			} else if (Class282_Sub17.method12259(anInt7166 * -1741204137, -1507650612) && !Class464.method7742(anInt7166 * -1741204137, (byte) 25)) {
				method12044((short) 3677);
				Login.method5018((byte) -128);
			} else if (12 == -1741204137 * anInt7166)
				Login.method5018((byte) -128);
			else if (Class169.method2875(anInt7166 * -1741204137, -1980250019) && !Class464.method7742(anInt7166 * -1741204137, (byte) 45))
				Class282_Sub20_Sub22.method15386(1134821376);
			else if (10 == anInt7166 * -1741204137 || anInt7166 * -1741204137 == 17) {
				Login.method5018((byte) -128);
				if (-3 != -1378127363 * Class9.anInt106 && -1378127363 * Class9.anInt106 != 2 && 15 != Class9.anInt106 * -1378127363) {
					if (-1741204137 * anInt7166 == 17) {
						Class9.anInt109 = Class9.anInt112 * 1549085435;
						Class9.anInt108 = Class9.anInt94 * -702764165;
						Class9.anInt107 = -1069834303 * Class9.anInt106;
						if (Class448.aBool5428) {
							Class62.method1262((Class448.aClass450_5429.worldId) * -87869981, (Class448.aClass450_5429.aString5433), (byte) 8);
							aClass184_7475.method3061(-1506150960);
							Class365.setGameState(10, 1906023297);
						} else
							Class438.method7333(Class9.aBool71, 2069442218);
					} else
						Class438.method7333(false, 2035320841);
				}
			}
			Class279.renderItems(Renderers.SOFTWARE_RENDERER, 358603141);
			aClass482_7267.method8061((byte) -124);
		}
	}
	
	static final void method11619() {
		int i = Class197.NUM_PLAYER_INDICES * -963499271;
		int[] is = Class197.PLAYER_INDICES;
		int i_7_;
		if (anInt7341 * -891719545 == 4)
			i_7_ = Class82.aClass75Array804.length;
		else
			i_7_ = aBool7241 ? i : i + -685729279 * anInt7211;
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			Animable class521_sub1_sub1_sub2;
			if (4 == -891719545 * anInt7341) {
				Class75 class75 = Class82.aClass75Array804[i_8_];
				if (!class75.aBool742)
					continue;
				class521_sub1_sub1_sub2 = class75.method1342((byte) 124);
			} else {
				if (i_8_ < i)
					class521_sub1_sub1_sub2 = players[is[i_8_]];
				else
					class521_sub1_sub1_sub2 = ((Animable) (((Class282_Sub47) aClass465_7208.method7754((long) anIntArray7212[i_8_ - i])).anObject8068));
				if (class521_sub1_sub1_sub2.anInt10321 * 1870758255 < 0)
					continue;
			}
			int i_9_ = class521_sub1_sub1_sub2.getSize(828768449);
			Vector3 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
			if (0 == (i_9_ & 0x1)) {
				if (((int) class385.x & 0x1ff) == 0 && 0 == ((int) class385.z & 0x1ff))
					continue;
			} else if (((int) class385.x & 0x1ff) == 256 && 256 == ((int) class385.z & 0x1ff))
				continue;
			class521_sub1_sub1_sub2.method11172(class385.x, (float) Class504.method8389((int) class385.x, (int) class385.z, class521_sub1_sub1_sub2.plane, (byte) 71), class385.z);
			IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-2126118936).method3397(class521_sub1_sub1_sub2, true, -622341859);
		}
	}

	void method11620(int i) {
		if (16 != anInt7166 * -1741204137) {
			long l = (Class176.method2979(-565051439) / 1000000L - aLong7170 * 2346649428362796523L);
			aLong7170 = (Class176.method2979(-1607655073) / 1000000L * 7185307724259795651L);
			boolean bool = Class463.method7730(-1898751022);
			if (bool && Class260.aBool3220 && null != Class320.aClass253_3723)
				Class320.aClass253_3723.method4334();
			if (Class176.method2980(-1741204137 * anInt7166, -997270926)) {
				if (0L != -3274584702471831225L * aLong7307 && (Class169.method2869(1916346566) > aLong7307 * -3274584702471831225L))
					Class440.method7373(Class158.method2730((short) -17166), -1, -1, false, (byte) 23);
				else if (!Renderers.SOFTWARE_RENDERER.method8465() && aBool3257)
					Class350_Sub2.method12571(757549008);
			}
			if (aFrame3260 == null) {
				Container container = Class371.method6354((byte) 1);
				int i_10_ = container.getSize().width;
				int i_11_ = container.getSize().height;
				if (aFrame3261 == container) {
					Insets insets = aFrame3261.getInsets();
					i_10_ -= insets.left + insets.right;
					i_11_ -= insets.bottom + insets.top;
				}
				if (i_10_ != Class45.anInt434 * -1016911135 || i_11_ != -499509193 * Class107.anInt1082 || aBool7185) {
					if (null == Renderers.SOFTWARE_RENDERER || Renderers.SOFTWARE_RENDERER.method8664())
						Class532_Sub1.method12840(865941395);
					else {
						Class45.anInt434 = i_10_ * 1031248161;
						Class107.anInt1082 = i_11_ * 685317511;
					}
					aLong7307 = ((Class169.method2869(1891897029) + 500L) * -3021149809371490185L);
					aBool7185 = false;
				}
			}
			if (Class475.aBool5623 && null != aFrame3260 && !Class530.aBool7050 && Class176.method2980(-1741204137 * anInt7166, -576589462))
				Class440.method7373(Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-342071815), -1, -1, false, (byte) 98);
			boolean bool_12_ = false;
			if (aBool3274) {
				aBool3274 = false;
				bool_12_ = true;
			}
			if (bool_12_)
				Class275.method4891((byte) -93);
			if ((null != Renderers.SOFTWARE_RENDERER && Renderers.SOFTWARE_RENDERER.method8465()) || Class158.method2730((short) -4575) != 1)
				IncomingPacket.method6378(-1538407760);
			if (Class504.method8388(-1741204137 * anInt7166, (byte) -30))
				NodeCollection.method8144(bool_12_, 1852531918);
			else if (Class245.method4198(anInt7166 * -1741204137, -1239613367))
				Class538.method11501(-354801018);
			else if (Class325.method5789(anInt7166 * -1741204137, 1548611864))
				Class538.method11501(-639557220);
			else if (Class464.method7742(-1741204137 * anInt7166, (byte) 88)) {
				if (IndexLoaders.MAP_REGION_DECODER.method4420((byte) 0) == Class339.aClass339_3985) {
					int i_13_ = IndexLoaders.MAP_REGION_DECODER.method4421((byte) 123) / 2;
					Class446.method7447(new StringBuilder().append(Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -1524722095)).append(Class2.aString16).append("(").append(i_13_).append("%)").toString(), true, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -97);
				} else if (IndexLoaders.MAP_REGION_DECODER.method4420((byte) 0) == Class339.aClass339_3983) {
					int i_14_ = 50 + IndexLoaders.MAP_REGION_DECODER.method4538((byte) -70) / 2;
					Class446.method7447(new StringBuilder().append(Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -1005069265)).append(Class2.aString16).append("(").append(i_14_).append("%)").toString(), true, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -56);
				} else
					Class446.method7447(Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -267708081), true, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -27);
			} else if (13 == -1741204137 * anInt7166)
				Class152.method2601(l);
			else if (10 == anInt7166 * -1741204137)
				Class446.method7447(new StringBuilder().append(Message.CONNECTION_LOST.translate(Class223.CURRENT_LANGUAGE, -897810008)).append(Class2.aString16).append(Message.ATTEMPTING_TO_REESTABLISH.translate((Class223.CURRENT_LANGUAGE), -1031078167)).toString(), false, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -41);
			else if (anInt7166 * -1741204137 == 17)
				Class446.method7447(Message.PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -905717195), false, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -100);
			if (3 == anInt7412 * 414438813) {
				for (int i_15_ = 0; i_15_ < anInt7407 * 1858642375; i_15_++) {
					Rectangle rectangle = aRectangleArray7411[i_15_];
					if (aBoolArray7410[i_15_])
						Renderers.SOFTWARE_RENDERER.method8562(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -65281, (byte) 4);
					else
						Renderers.SOFTWARE_RENDERER.method8562(rectangle.x, rectangle.y, rectangle.width, rectangle.height, -16711936, (byte) 4);
				}
			}
			if (Class521_Sub1_Sub3_Sub1.method16081(16711935))
				Class282_Sub47.method13409(Renderers.SOFTWARE_RENDERER, 1735470926);
			if (!Class504.method8388(anInt7166 * -1741204137, (byte) -54) && !Class464.method7742(anInt7166 * -1741204137, (byte) 17) && -1 != anInt7349 * -1699899559) {
				try {
					Renderers.SOFTWARE_RENDERER.method8393((short) 30084);
				} catch (Exception_Sub3 exception_sub3) {
					Class151.method2594(new StringBuilder().append(exception_sub3.getMessage()).append(" ").append(method4669(115393610)).toString(), exception_sub3, (byte) -126);
					Class538.method11500(0, false, (byte) 24);
				}
			}
			Class383.method6511(-1054790963);
			int i_16_ = Class393.aClass282_Sub54_4783.aClass468_Sub5_8221.method12651(-1870398327);
			if (0 == i_16_)
				Class89.method1504(15L);
			else if (1 == i_16_)
				Class89.method1504(10L);
			else if (2 == i_16_)
				Class89.method1504(5L);
			else if (3 == i_16_)
				Class89.method1504(2L);
			if (aBool7219)
				Class378.method6438((byte) 84);
			if (Class393.aClass282_Sub54_4783.aClass468_Sub25_8206.method12926((byte) 40) == 1 && anInt7166 * -1741204137 == 5 && -1699899559 * anInt7349 != -1) {
				Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub25_8206, 0, -1689344796);
				Class190.method3148((byte) 36);
			}
		}
	}

	public String method4669(int i) {
		String string = " ";
		try {
			CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1082242167);
			string = new StringBuilder().append(string).append(1948093437 * class219.x).append(Class2.aString14).append(-1002240017 * class219.y).append(Class2.aString14).append(IndexLoaders.MAP_REGION_DECODER.getSizeX(-2095875527)).append(Class2.aString14).append(IndexLoaders.MAP_REGION_DECODER.getSizeY(-1882387528)).append(" ").toString();
			if (null != Class84.myPlayer)
				string = new StringBuilder().append(string).append(675588453 * Class4.anInt35).append(Class2.aString14).append(class219.x * 1948093437 + (Class84.myPlayer.regionBaseX[0])).append(Class2.aString14).append((Class84.myPlayer.regionBaseY[0]) + class219.y * -1002240017).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(675588453 * Class4.anInt35).append(Class2.aString14).append(675588453 * Class4.anInt35).append(Class2.aString14).append(675588453 * Class4.anInt35).append(Class2.aString14).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-993129385)).append(" ").append(Class393.aClass282_Sub54_4783.aClass468_Sub4_8187.method12641(-679082268)).append(" ").append(Class158.method2730((short) -5599)).append(" ").append(Class349.anInt4083 * -418109423).append(Class2.aString14).append(-969250379 * anInt3243).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -13)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(-14216160)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(-932998306)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method12706((byte) 75)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(MAX_MEMORY * -1346844585).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt7166 * -1741204137).append(" ").toString();
			if (null != Class11.SYSTEM_INFO)
				string = new StringBuilder().append(string).append(-79546877 * Class11.SYSTEM_INFO.anInt8167).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString7164 != null)
				string = new StringBuilder().append(string).append(aString7164).toString();
			else
				string = new StringBuilder().append(string).append(Class2.aString14).toString();
			try {
				if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1268238146) == 2) {
					Class var_class = Class.forName("java.lang.ClassLoader");
					Field field = var_class.getDeclaredField("nativeLibraries");
					Class var_class_32_ = Class.forName("java.lang.reflect.AccessibleObject");
					Method method = var_class_32_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
					method.invoke(field, new Object[] { Boolean.TRUE });
					Vector vector = (Vector) field.get(client.class.getClassLoader());
					for (int i_33_ = 0; i_33_ < vector.size(); i_33_++) {
						try {
							Object object = vector.elementAt(i_33_);
							Field field_34_ = object.getClass().getDeclaredField("name");
							method.invoke(field_34_, new Object[] { Boolean.TRUE });
							try {
								String string_35_ = (String) field_34_.get(object);
								if (string_35_ != null && string_35_.indexOf("sw3d.dll") != -1) {
									Field field_36_ = object.getClass().getDeclaredField("handle");
									method.invoke(field_36_, (new Object[] { Boolean.TRUE }));
									string = new StringBuilder().append(string).append(" ").append(Long.toHexString(field_36_.getLong(object))).toString();
									method.invoke(field_36_, (new Object[] { Boolean.FALSE }));
								}
							} catch (Throwable throwable) {
								/* empty */
							}
							method.invoke(field_34_, new Object[] { Boolean.FALSE });
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

	void method11622(int i) {
		boolean bool = Class119.JS5_STANDARD_REQUESTER.method5521((byte) 81);
		if (!bool)
			method11623(1298538523);
	}

	void method11623(int i) {
		if (Class119.JS5_STANDARD_REQUESTER.anInt3657 * 1287875275 > anInt7232 * 607823547) {
			Class159.aClass450_2010.method7493(-389298701);
			anInt7202 = Class119.JS5_STANDARD_REQUESTER.anInt3657 * 1375581498 - -40028562;
			if (895034347 * anInt7202 > 3000)
				anInt7202 = -480342744;
			if (1287875275 * Class119.JS5_STANDARD_REQUESTER.anInt3657 >= 2 && 6 == Class119.JS5_STANDARD_REQUESTER.anInt3650 * -99092567) {
				method4680("js5connect_outofdate", -894832460);
				anInt7166 = 1782998640;
				return;
			}
			if (Class119.JS5_STANDARD_REQUESTER.anInt3657 * 1287875275 >= 1 && 48 == -99092567 * Class119.JS5_STANDARD_REQUESTER.anInt3650) {
				method4680("sessionexpired", -912773431);
				anInt7166 = 1782998640;
				return;
			}
			if (1287875275 * Class119.JS5_STANDARD_REQUESTER.anInt3657 >= 4 && -1 == Class119.JS5_STANDARD_REQUESTER.anInt3650 * -99092567) {
				method4680("js5crc", -1498631441);
				anInt7166 = 1782998640;
				return;
			}
			if (1287875275 * Class119.JS5_STANDARD_REQUESTER.anInt3657 >= 4 && Class504.method8388(anInt7166 * -1741204137, (byte) 81)) {
				if (7 == -99092567 * Class119.JS5_STANDARD_REQUESTER.anInt3650 || -99092567 * Class119.JS5_STANDARD_REQUESTER.anInt3650 == 9)
					method4680("js5connect_full", -1792306679);
				else if (Class119.JS5_STANDARD_REQUESTER.anInt3650 * -99092567 > 0) {
					if (aString7463 == null)
						method4680("js5connect", -1670135642);
					else
						method4680(new StringBuilder().append("js5proxy_").append(aString7463.trim()).toString(), -162605543);
				} else
					method4680("js5io", -243953316);
				anInt7166 = 1782998640;
				return;
			}
		}
		anInt7232 = 913503025 * Class119.JS5_STANDARD_REQUESTER.anInt3657;
		if (anInt7202 * 895034347 > 0)
			anInt7202 -= -910693181;
		else {
			try {
				if (anInt7201 * 2137302489 == 0) {
					Class282_Sub20_Sub10.aSocket9802 = Class159.aClass450_2010.method7494((byte) 122);
					anInt7201 += 2033814121;
				}
				if (1 == 2137302489 * anInt7201) {
					Class47_Sub1.aClass202_9142 = Class38.method852(Class282_Sub20_Sub10.aSocket9802, 125000, 165252847);
					int length = 13 + aString7164.length();
					RsByteBuffer buffer = new RsByteBuffer(length + 4);
					buffer.writeByte(1627920319 * (OutgoingLoginPacket.INIT_JS5REMOTE_CONNECTION.id));
					buffer.writeByte(length);
					buffer.writeInt(Loader.CLIENT_BUILD);
					buffer.writeInt(Loader.MAJOR_BUILD);
					buffer.writeInt(Loader.SUB_BUILD);
					buffer.writeString(aString7164);
					Class47_Sub1.aClass202_9142.method3311((buffer.buffer), 0, length + 2, -2102703988);
					anInt7201 += 2033814121;
					JS5CacheFile.aLong2577 = (Class169.method2869(1650526502) * -453947708628580327L);
				}
				if (2137302489 * anInt7201 == 2) {
					if (Class47_Sub1.aClass202_9142.method3315(1, (byte) 59)) {
						byte[] is = new byte[1];
						int i_38_ = Class47_Sub1.aClass202_9142.method3327(is, 0, 1, -1159358495);
						if (is[0] == 25) {
							//Loader.handleNewJarDownload();
							return;
						}
						if (is[0] != 0) {
							method11624(i_38_, -70293611);
							return;
						}
						anInt7201 += 2033814121;
					} else if ((Class169.method2869(1762263805) - JS5CacheFile.aLong2577 * 6477284008193397801L) > 30000L) {
						method11624(1001, -70293611);
						return;
					}
				}
				if (2137302489 * anInt7201 == 3) {
					Class446[] class446s = Class446.method7436((byte) 24);
					int i_39_ = 4 * class446s.length;
					if (Class47_Sub1.aClass202_9142.method3315(i_39_, (byte) 108)) {
						RsByteBuffer class282_sub35 = new RsByteBuffer(i_39_);
						Class47_Sub1.aClass202_9142.method3327(class282_sub35.buffer, 0, class282_sub35.buffer.length, -892041058);
						for (int i_40_ = 0; i_40_ < class446s.length; i_40_++)
							class446s[i_40_].method7439(class282_sub35.readInt(), (short) -28837);
						boolean bool = (Class504.method8388(anInt7166 * -1741204137, (byte) 104) || Class97.method1612(anInt7166 * -1741204137, 1908805257) || Class282_Sub17.method12259((-1741204137 * anInt7166), -869623251));
						Class119.JS5_STANDARD_REQUESTER.method5522((Class47_Sub1.aClass202_9142), !bool, 784597378);
						Class282_Sub20_Sub10.aSocket9802 = null;
						Class47_Sub1.aClass202_9142 = null;
						anInt7201 = 0;
					}
				}
			} catch (IOException ioexception) {
				method11624(1002, -70293611);
			}
		}
	}

	void method11624(int i, int i_41_) {
		Class282_Sub20_Sub10.aSocket9802 = null;
		Class47_Sub1.aClass202_9142 = null;
		anInt7201 = 0;
		Class119.JS5_STANDARD_REQUESTER.anInt3657 += 1211706083;
		Class119.JS5_STANDARD_REQUESTER.anInt3650 = -1208836967 * i;
	}

	static final void method11626() {
		int i = -963499271 * Class197.NUM_PLAYER_INDICES;
		int[] is = Class197.PLAYER_INDICES;
		int i_42_ = Class393.aClass282_Sub54_4783.aClass468_Sub15_8203.method12739(-118386335);
		boolean bool = 1 == i_42_ && i > 200 || i_42_ == 0 && i > 50;
		for (int i_43_ = 0; i_43_ < i; i_43_++) {
			Player class521_sub1_sub1_sub2_sub1 = players[is[i_43_]];
			if (!class521_sub1_sub1_sub2_sub1.method16126((byte) 123))
				class521_sub1_sub1_sub2_sub1.anInt10321 = 2027750001;
			else if (class521_sub1_sub1_sub2_sub1.hidden)
				class521_sub1_sub1_sub2_sub1.anInt10321 = 2027750001;
			else {
				class521_sub1_sub1_sub2_sub1.method14697((byte) 56);
				if (class521_sub1_sub1_sub2_sub1.aShort9458 < 0 || class521_sub1_sub1_sub2_sub1.aShort9456 < 0 || (class521_sub1_sub1_sub2_sub1.localX >= IndexLoaders.MAP_REGION_DECODER.getSizeX(-1249546922)) || (class521_sub1_sub1_sub2_sub1.localY >= IndexLoaders.MAP_REGION_DECODER.getSizeY(-1946809228)))
					class521_sub1_sub1_sub2_sub1.anInt10321 = 2027750001;
				else {
					class521_sub1_sub1_sub2_sub1.aBool10573 = (class521_sub1_sub1_sub2_sub1.aClass456_Sub3_10337.aBool7891) ? bool : false;
					if (Class84.myPlayer == class521_sub1_sub1_sub2_sub1)
						class521_sub1_sub1_sub2_sub1.anInt10321 = -119733647;
					else {
						int i_44_ = 0;
						if (!class521_sub1_sub1_sub2_sub1.aBool10318)
							i_44_++;
						if (!class521_sub1_sub1_sub2_sub1.aClass457_10333.method7666(1539995969))
							i_44_ += 2;
						i_44_ += 5 - class521_sub1_sub1_sub2_sub1.getSize(828768449) << 2;
						if (class521_sub1_sub1_sub2_sub1.aBool10571 || class521_sub1_sub1_sub2_sub1.aBool10550)
							i_44_ += 512;
						else {
							if (0 == 1890021973 * anInt7291)
								i_44_ += 32;
							else
								i_44_ += 128;
							i_44_ += 256;
						}
						class521_sub1_sub1_sub2_sub1.anInt10321 = -2027750001 * (1 + i_44_);
					}
				}
			}
		}
		for (int i_45_ = 0; i_45_ < anInt7211 * -685729279; i_45_++) {
			NPC class521_sub1_sub1_sub2_sub2 = ((NPC) (((Class282_Sub47) aClass465_7208.method7754((long) anIntArray7212[i_45_])).anObject8068));
			if (!class521_sub1_sub1_sub2_sub2.method16160(1233643385) || !class521_sub1_sub1_sub2_sub2.aClass409_10580.method6885(Class158_Sub1.aClass3_8507, (byte) -30))
				class521_sub1_sub1_sub2_sub2.anInt10321 = 2027750001;
			else {
				class521_sub1_sub1_sub2_sub2.method14697((byte) 71);
				if (class521_sub1_sub1_sub2_sub2.aShort9458 < 0 || class521_sub1_sub1_sub2_sub2.aShort9456 < 0 || (class521_sub1_sub1_sub2_sub2.localX >= IndexLoaders.MAP_REGION_DECODER.getSizeX(1367636803)) || (class521_sub1_sub1_sub2_sub2.localY >= IndexLoaders.MAP_REGION_DECODER.getSizeY(-831632780)))
					class521_sub1_sub1_sub2_sub2.anInt10321 = 2027750001;
				else {
					int i_46_ = 0;
					if (!class521_sub1_sub1_sub2_sub2.aBool10318)
						i_46_++;
					if (!class521_sub1_sub1_sub2_sub2.aClass457_10333.method7666(1870908513))
						i_46_ += 2;
					i_46_ += 5 - class521_sub1_sub1_sub2_sub2.getSize(828768449) << 2;
					if (anInt7291 * 1890021973 == 0) {
						if (class521_sub1_sub1_sub2_sub2.aClass409_10580.aBool4884)
							i_46_ += 64;
						else
							i_46_ += 128;
					} else if (1 == anInt7291 * 1890021973) {
						if (class521_sub1_sub1_sub2_sub2.aClass409_10580.aBool4884)
							i_46_ += 32;
						else
							i_46_ += 64;
					}
					if (class521_sub1_sub1_sub2_sub2.aClass409_10580.aBool4904)
						i_46_ += 1024;
					else if (!class521_sub1_sub1_sub2_sub2.aClass409_10580.aBool4890)
						i_46_ += 256;
					class521_sub1_sub1_sub2_sub2.anInt10321 = (i_46_ + 1) * -2027750001;
				}
			}
		}
		for (int i_47_ = 0; i_47_ < aClass180Array7348.length; i_47_++) {
			Class180 class180 = aClass180Array7348[i_47_];
			if (class180 != null) {
				if (1 == -379447335 * class180.anInt2236) {
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) aClass465_7208.method7754((long) (1505135749 * (class180.anInt2238))));
					if (null != class282_sub47) {
						NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
						if ((class521_sub1_sub1_sub2_sub2.anInt10321 * 1870758255) >= 0)
							class521_sub1_sub1_sub2_sub2.anInt10321 += 401373184;
					}
				} else if (class180.anInt2236 * -379447335 == 10) {
					Player class521_sub1_sub1_sub2_sub1 = (players[1505135749 * class180.anInt2238]);
					if (class521_sub1_sub1_sub2_sub1 != null && (class521_sub1_sub1_sub2_sub1 != Class84.myPlayer) && (1870758255 * class521_sub1_sub1_sub2_sub1.anInt10321) >= 0)
						class521_sub1_sub1_sub2_sub1.anInt10321 += 401373184;
				}
			}
		}
	}

	static final void method11627() {
		int[][] is = IndexLoaders.MAP_REGION_DECODER.method4437((byte) -47);
		int i = IndexLoaders.MAP_REGION_DECODER.getSizeX(-1706901294);
		int i_48_ = IndexLoaders.MAP_REGION_DECODER.getSizeY(-1291370646);
		for (int i_49_ = 0; i_49_ < i; i_49_++) {
			int[] is_50_ = is[i_49_];
			for (int i_51_ = 0; i_51_ < i_48_; i_51_++)
				is_50_[i_51_] = 0;
		}
	}

	static final void method11628(int i) {
		int i_52_ = Class197.NUM_PLAYER_INDICES * -963499271;
		int[] is = Class197.PLAYER_INDICES;
		int[][] is_53_ = IndexLoaders.MAP_REGION_DECODER.method4437((byte) -121);
		int[][] is_54_ = IndexLoaders.MAP_REGION_DECODER.method4438(2109447530);
		int i_55_;
		if (4 == -891719545 * anInt7341)
			i_55_ = Class82.aClass75Array804.length;
		else
			i_55_ = -685729279 * anInt7211 + i_52_;
		for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
			Animable class521_sub1_sub1_sub2;
			if (anInt7341 * -891719545 == 4) {
				Class75 class75 = Class82.aClass75Array804[i_56_];
				if (!class75.aBool742)
					continue;
				class521_sub1_sub1_sub2 = class75.method1342((byte) 81);
			} else {
				if (i_56_ < i_52_)
					class521_sub1_sub1_sub2 = players[is[i_56_]];
				else
					class521_sub1_sub1_sub2 = ((Animable) (((Class282_Sub47) aClass465_7208.method7754((long) anIntArray7212[i_56_ - i_52_])).anObject8068));
				if (class521_sub1_sub1_sub2.plane != i || class521_sub1_sub1_sub2.anInt10321 * 1870758255 < 0)
					continue;
			}
			int i_57_ = class521_sub1_sub1_sub2.getSize(828768449);
			Vector3 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
			if ((i_57_ & 0x1) == 0) {
				if (0 != ((int) class385.x & 0x1ff) || ((int) class385.z & 0x1ff) != 0)
					continue;
			} else if (((int) class385.x & 0x1ff) != 256 || ((int) class385.z & 0x1ff) != 256)
				continue;
			if (i_57_ == 1) {
				int i_58_ = (int) class385.x >> 9;
				int i_59_ = (int) class385.z >> 9;
				if (class521_sub1_sub1_sub2.anInt10321 * 1870758255 > is_53_[i_58_][i_59_]) {
					is_53_[i_58_][i_59_] = 1870758255 * class521_sub1_sub1_sub2.anInt10321;
					is_54_[i_58_][i_59_] = 1;
				} else if (class521_sub1_sub1_sub2.anInt10321 * 1870758255 == is_53_[i_58_][i_59_])
					is_54_[i_58_][i_59_]++;
			} else {
				int i_60_ = 60 + (i_57_ - 1) * 256;
				int i_61_ = (int) class385.x - i_60_ >> 9;
				int i_62_ = (int) class385.z - i_60_ >> 9;
				int i_63_ = i_60_ + (int) class385.x >> 9;
				int i_64_ = i_60_ + (int) class385.z >> 9;
				for (int i_65_ = i_61_; i_65_ <= i_63_; i_65_++) {
					for (int i_66_ = i_62_; i_66_ <= i_64_; i_66_++) {
						if (1870758255 * class521_sub1_sub1_sub2.anInt10321 > is_53_[i_65_][i_66_]) {
							is_53_[i_65_][i_66_] = (class521_sub1_sub1_sub2.anInt10321 * 1870758255);
							is_54_[i_65_][i_66_] = 1;
						} else if ((1870758255 * class521_sub1_sub1_sub2.anInt10321) == is_53_[i_65_][i_66_])
							is_54_[i_65_][i_66_]++;
					}
				}
			}
		}
	}

	static final void method11629(int i) {
		int i_67_ = Class197.NUM_PLAYER_INDICES * -963499271;
		int[] is = Class197.PLAYER_INDICES;
		int[][] is_68_ = IndexLoaders.MAP_REGION_DECODER.method4437((byte) -8);
		int[][] is_69_ = IndexLoaders.MAP_REGION_DECODER.method4438(129417438);
		int i_70_;
		if (anInt7341 * -891719545 == 4)
			i_70_ = Class82.aClass75Array804.length;
		else
			i_70_ = aBool7241 ? i_67_ : anInt7211 * -685729279 + i_67_;
		for (int i_71_ = 0; i_71_ < i_70_; i_71_++) {
			Animable class521_sub1_sub1_sub2;
			if (anInt7341 * -891719545 == 4) {
				Class75 class75 = Class82.aClass75Array804[i_71_];
				if (!class75.aBool742)
					continue;
				class521_sub1_sub1_sub2 = class75.method1342((byte) 64);
			} else {
				if (i_71_ < i_67_)
					class521_sub1_sub1_sub2 = players[is[i_71_]];
				else
					class521_sub1_sub1_sub2 = ((Animable) (((Class282_Sub47) aClass465_7208.method7754((long) anIntArray7212[i_71_ - i_67_])).anObject8068));
				if (class521_sub1_sub1_sub2.plane != i)
					continue;
				if (1870758255 * class521_sub1_sub1_sub2.anInt10321 < 0) {
					class521_sub1_sub1_sub2.aBool10318 = false;
					continue;
				}
			}
			class521_sub1_sub1_sub2.anInt10319 = 0;
			int i_72_ = class521_sub1_sub1_sub2.getSize(828768449);
			Vector3 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
			if (0 == (i_72_ & 0x1)) {
				if (((int) class385.x & 0x1ff) != 0 || 0 != ((int) class385.z & 0x1ff)) {
					class521_sub1_sub1_sub2.aBool10318 = false;
					continue;
				}
			} else if (((int) class385.x & 0x1ff) != 256 || 256 != ((int) class385.z & 0x1ff)) {
				class521_sub1_sub1_sub2.aBool10318 = false;
				continue;
			}
			if (4 != -891719545 * anInt7341) {
				if (1 == i_72_) {
					int i_73_ = (int) class385.x >> 9;
					int i_74_ = (int) class385.z >> 9;
					if (is_68_[i_73_][i_74_] != 1870758255 * class521_sub1_sub1_sub2.anInt10321) {
						class521_sub1_sub1_sub2.aBool10318 = true;
						continue;
					}
					if (is_69_[i_73_][i_74_] > 1) {
						is_69_[i_73_][i_74_]--;
						class521_sub1_sub1_sub2.aBool10318 = true;
						continue;
					}
				} else {
					int i_75_ = (i_72_ - 1) * 256 + 252;
					int i_76_ = (int) class385.x - i_75_ >> 9;
					int i_77_ = (int) class385.z - i_75_ >> 9;
					int i_78_ = i_75_ + (int) class385.x >> 9;
					int i_79_ = (int) class385.z + i_75_ >> 9;
					if (!Class81.method1453(is_68_, is_69_, (1870758255 * (class521_sub1_sub1_sub2.anInt10321)), i_76_, i_77_, i_78_, i_79_, (byte) -45)) {
						for (int i_80_ = i_76_; i_80_ <= i_78_; i_80_++) {
							for (int i_81_ = i_77_; i_81_ <= i_79_; i_81_++) {
								if (is_68_[i_80_][i_81_] == (1870758255 * class521_sub1_sub1_sub2.anInt10321))
									is_69_[i_80_][i_81_]--;
							}
						}
						class521_sub1_sub1_sub2.aBool10318 = true;
						continue;
					}
				}
			}
			class521_sub1_sub1_sub2.aBool10318 = false;
			class521_sub1_sub1_sub2.method11172(class385.x, (float) Class504.method8389((int) class385.x, (int) class385.z, class521_sub1_sub1_sub2.plane, (byte) 48), class385.z);
			IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1468321038).method3397(class521_sub1_sub1_sub2, true, -1200990157);
		}
	}

	public static Class282_Sub10 method11633(IComponentDefinitions class118) {
		Class282_Sub10 class282_sub10 = ((Class282_Sub10) aClass465_7405.method7754(((long) (class118.idHash * -1952846363) << 32) + (long) (1924549737 * class118.anInt1288)));
		return (class282_sub10 != null ? class282_sub10 : class118.aClass282_Sub10_1364);
	}

	static IComponentDefinitions method11634(IComponentDefinitions class118) {
		Class282_Sub10 class282_sub10 = method11633(class118);
		if (class282_sub10.method12196(-1498084889))
			return Class221.aClass118_2763;
		int i = class282_sub10.method12180((byte) 95);
		if (0 == i)
			return null;
		for (int i_95_ = 0; i_95_ < i; i_95_++) {
			class118 = Class96_Sub23.method14682(Class96.method1605(((class118.idHash) * -1952846363), (byte) -8), class118, -838454718);
			if (class118 == null)
				return Class221.aClass118_2763;
		}
		return class118;
	}

	static {
		aBool7310 = false;
		aBool7147 = false;
		aString7281 = null;
		anInt7149 = 0;
		anInt7447 = 0;
		aBool7151 = false;
		aByteArray7152 = null;
		aLong7153 = 0L;
		aBool7465 = false;
		aBool7155 = false;
		aString7156 = null;
		aString7157 = null;
		aBool7158 = false;
		aBool7159 = false;
		aBool7160 = false;
		aBool7161 = false;
		anInt7162 = 0;
		anInt7163 = 874138425;
		aString7164 = null;
		aString7165 = null;
		anInt7166 = 445749660;
		aClass384_7167 = new Matrix44Arr();
		aClass294_7457 = new Matrix44Var();
		aClass294_7169 = new Matrix44Var();
		aLong7170 = 0L;
		aBool7171 = false;
		aBool7172 = true;
		anInt7173 = 0;
		cycles = 0;
		aBool7175 = true;
		aBool7176 = false;
		aBool7177 = false;
		anInt7178 = 0;
		aClass180Array7348 = new Class180[8];
		aClass281Array7180 = new Class281[9];
		aBool7219 = false;
		aBool7241 = false;
		aBool7372 = true;
		aLong7409 = (long) (Math.random() * 9.999999999E9) * -2743734734993538827L;
		aBool7185 = false;
		anInt7240 = 0;
		aBool7393 = false;
		anInt7396 = 0;
		aBool7189 = false;
		aClass482_7267 = new NodeCollection();
		anInt7191 = 0;
		anInt7193 = 0;
		anInterface16Array7154 = new Interface16[131];
		anInt7196 = 0;
		anInterface16Array7298 = new Interface16[75];
		aColorArray7186 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };
		aColorArray7199 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };
		aColorArray7200 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };
		anInt7201 = 0;
		anInt7202 = 0;
		anInt7232 = 0;
		aClass229_7204 = new SoftCache(8);
		aString7463 = null;
		anInterface35_7206 = new Class15();
		aClass465_7208 = new IterableNodeMap(64);
		aClass282_Sub47Array7209 = new Class282_Sub47[1024];
		anInt7210 = 0;
		anInt7211 = 0;
		anIntArray7212 = new int[1024];
		npcListSize = 0;
		NPC_INDICES = new int[261];
		anInt7332 = 0;
		anInt7216 = 0;
		anIntArray7421 = new int[1005];
		aClass184_7218 = new Class184();
		aClass184_7475 = new Class184();
		aClass184Array7220 = new Class184[] { aClass184_7475, aClass184_7218 };
		anInt7221 = 0;
		aBool7459 = false;
		aClass508_7223 = new Class508();
		IndexLoaders.MAP_REGION_DECODER = new MapRegion(false);
		aBool7225 = false;
		anObject7226 = new Object();
		anObject7227 = new Object();
		anIntArray7228 = new int[64];
		anInt7234 = 0;
		anIntArray7230 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		anInt7231 = 593633913;
		anInt7341 = -1766566601;
		aBool7321 = false;
		anInt7357 = 1562805881;
		anInt7235 = 0;
		anInt7236 = -559909651;
		anInt7237 = -1647117777;
		anInt7238 = -1104730827;
		anInt7377 = 0;
		anInt7413 = 0;
		anInt7217 = 0;
		anIntArray7243 = new int[4096];
		anIntArray7425 = new int[4096];
		walkStepsX = new int[50];
		walkStepsY = new int[50];
		anIntArray7380 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
		anInt7248 = 0;
		anInt7249 = -1977797126;
		anInt7250 = 0;
		anInt7251 = 618668954;
		anInt7343 = 0;
		anInt7253 = -1879830745;
		anInt7418 = 0;
		anInt7255 = 0;
		anInt7187 = 728497418;
		anInt7203 = 0;
		anInt7258 = -2025825177;
		anInt7259 = 0;
		aRandom7260 = new Random();
		anInt7261 = 0;
		anInt7262 = 0;
		anInt7376 = 0;
		aFloat7146 = 1052.0F;
		aFloat7365 = 0.0F;
		aFloat7266 = 0.0F;
		aFloat7284 = 0.0F;
		aBool7331 = false;
		aBool7269 = false;
		anInt7270 = -1733694242;
		anInt7271 = anInt7270 * 2116907017 + 509667616;
		aBool7371 = true;
		anInt7273 = 0;
		anIntArrayArrayArray7302 = new int[2][][];
		anInt7277 = 158788875;
		anInt7448 = -1044733407;
		anInt7279 = 0;
		anInt7280 = 0;
		anInt7256 = 0;
		anInt7327 = 0;
		anInt7182 = 0;
		aBool7355 = false;
		aBool7285 = false;
		anInt7286 = 0;
		anIntArray7287 = new int[508];
		anIntArray7288 = new int[502];
		anInt7304 = 0;
		aClass457_7290 = new Class457();
		anInt7291 = 0;
		aFloatArray7292 = new float[3];
		anInt7293 = 0;
		anInt7294 = 0;
		anInt7295 = 0;
		anInt7296 = 0;
		anInt7297 = 0;
		anInt7472 = 1582144605;
		anIntArray7198 = new int[2];
		anIntArray7303 = new int[2];
		anIntArray7194 = new int[2];
		anIntArray7305 = new int[2];
		anIntArray7306 = new int[2];
		aLong7307 = 0L;
		aBool7301 = true;
		anInt7309 = -1469677088;
		anInt7205 = 1229330544;
		anInt7439 = 1115313079;
		anInt7312 = -633674521;
		players = new Player[2048];
		anInt7315 = 1265803515;
		aBool7316 = false;
		membersWorld = false;
		rights = 0;
		anInt7319 = 0;
		aBool7224 = false;
		aBool7244 = false;
		aBool7322 = false;
		aBool7323 = false;
		aBool7454 = true;
		aBool7325 = false;
		aShortArray7239 = new short[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		anIntArray7328 = new int[8];
		aStringArray7329 = new String[8];
		aBoolArray7330 = new boolean[8];
		anInt7311 = 1263465007;
		aClass465_7414 = new IterableNodeMap(64);
		aClass482_7333 = new NodeCollection();
		aClass465_7334 = new IterableNodeMap(16);
		aClass457_7335 = new Class457();
		anIntArray7336 = new int[25];
		anIntArray7337 = new int[25];
		anIntArray7338 = new int[25];
		anInt7339 = 0;
		anInt7340 = -96844955;
		anInt7427 = 434551523;
		anInt7342 = -1244871605;
		anInt7190 = 618386713;
		aBool7344 = false;
		anInt7345 = -267172487;
		anInt7346 = -2109153983;
		aString7275 = null;
		aString7356 = null;
		anInt7349 = -153305321;
		aClass465_7442 = new IterableNodeMap(8);
		anInt7351 = 0;
		aClass118_7352 = null;
		anInt7300 = 0;
		anInt7354 = 0;
		aBool7168 = false;
		aBool7264 = false;
		aClass118_7183 = null;
		aBool7358 = false;
		aClass118_7257 = null;
		aClass118_7247 = null;
		anInt7361 = 0;
		anInt7362 = 0;
		aClass118_7370 = null;
		aBool7403 = false;
		anInt7432 = 913311703;
		anInt7265 = 864485077;
		anInt7367 = -324836289;
		anInt7476 = -1900518641;
		aBool7369 = false;
		anInt7252 = 1659832809;
		anInt7215 = 1182378399;
		aBool7364 = false;
		anInt7184 = 0;
		aBool7374 = false;
		aBool7375 = false;
		anInt7347 = 1196922783;
		anIntArray7379 = new int[32];
		anInt7453 = 0;
		anIntArray7381 = new int[32];
		anInt7382 = 0;
		anIntArray7283 = new int[32];
		anInt7384 = 0;
		anIntArray7150 = new int[32];
		anInt7368 = 0;
		anIntArray7387 = new int[32];
		anInt7388 = 0;
		anIntArray7222 = new int[32];
		anInt7390 = 0;
		anInt7391 = 0;
		anInt7386 = 0;
		anInt7179 = 0;
		anInt7192 = 0;
		anInt7395 = 0;
		anInt7320 = 0;
		anInt7397 = 0;
		anInt7399 = 0;
		aBool7400 = false;
		aLong7401 = 3531340789837788151L;
		aClass482_7402 = new NodeCollection();
		aClass482_7233 = new NodeCollection();
		aClass482_7404 = new NodeCollection();
		aClass465_7405 = new IterableNodeMap(512);
		anInt7407 = 0;
		anInt7408 = -2019371470;
		aBoolArray7443 = new boolean[107];
		aBoolArray7410 = new boolean[107];
		aRectangleArray7411 = new Rectangle[107];
		for (int i = 0; i < 107; i++)
			aRectangleArray7411[i] = new Rectangle();
		anInt7412 = 0;
		anIntArray7438 = new int[4];
		anInt7415 = 0;
		anInt7366 = 412657459;
		anIntArray7420 = new int[anInt7366 * 432489217];
		anIntArray7417 = new int[432489217 * anInt7366];
		anIntArray7263 = new int[432489217 * anInt7366];
		aClass163Array7419 = new Class163[432489217 * anInt7366];
		anIntArray7148 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		anInt7416 = 0;
		anInt7422 = 0;
		aLongArray7424 = new long[100];
		anInt7389 = 0;
		aString7426 = null;
		aString7359 = null;
		aClass330Array7428 = new Class330[6];
		anInt7429 = 0;
		aBoolArray7431 = new boolean[5];
		anIntArray7268 = new int[5];
		anIntArray7433 = new int[5];
		anIntArray7462 = new int[5];
		anIntArray7435 = new int[5];
		aShort7436 = (short) 256;
		aShort7437 = (short) 205;
		aShort7394 = (short) 256;
		aShort7324 = (short) 320;
		aShort7276 = (short) 1;
		aShort7441 = (short) 32767;
		aShort7214 = (short) 1;
		aShort7474 = (short) 32767;
		anInt7444 = 0;
		anInt7445 = 0;
		anInt7188 = 0;
		anInt7440 = 0;
		anInt7451 = 0;
		anInt7449 = 0;
		anInt7434 = 0;
		aClass6Array7452 = new Class6[200];
		aClass457_7350 = new Class457();
		anInt7373 = 0;
		aClass10Array7456 = new Class10[100];
		aCalendar7278 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		aByte7458 = (byte) -6;
		anInterface25_7446 = new Class17();
		anIntArray7461 = new int[4];
	}

	final void method4686() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class221.aClass118_2763 = new IComponentDefinitions();
		Class532_Sub1.method12840(1040254092);
		Whirlpool.JS5_LOCAL_REQUESTER = new JS5LocalRequester();
		Class119.JS5_STANDARD_REQUESTER = new Class312_Sub1();
		Class239.method4090(new int[] { 20, 260 }, new int[] { 1000, 100 }, 1716786333);
		Vector3.method6643(100);
		Quaternion.method6493(10);
		ItemDefinitions.method7141(100, (byte) -88);
		Class282_Sub41_Sub3.method14807(100, 649907715);
		if (Class496.aClass496_5813 != Class90.aClass496_952)
			Class339.aByteArrayArray3986 = new byte[50][];
		Class393.aClass282_Sub54_4783 = Class225_Sub1.method12791(-1043766180);
		if (Class393.aClass282_Sub54_4783.aClass468_Sub3_8199.method12632(507739411) == 1)
			SceneObjectManager.aBool2644 = false;
		if (Class496.aClass496_5813 == Class90.aClass496_952)
			Class448.aClass450_5420.aString5433 = Class282_Sub44.anApplet8065.getCodeBase().getHost();
		else if (Class496.method8308(Class90.aClass496_952, 739431588)) {
			Class448.aClass450_5420.aString5433 = Class282_Sub44.anApplet8065.getCodeBase().getHost();
			Class448.aClass450_5420.anInt5434 = 1140744768 + -58916693 * Class448.aClass450_5420.worldId;
			Class448.aClass450_5424.anInt5434 = Class448.aClass450_5424.worldId * -58916693 + 1140744768;
			Class448.aClass450_5420.anInt5437 = -1441381029 * Class448.aClass450_5420.worldId + 1250363344;
			Class448.aClass450_5424.anInt5437 = Class448.aClass450_5424.worldId * -1441381029 + 1250363344;
		} else if (Class496.aClass496_5810 == Class90.aClass496_952) {
			Class448.aClass450_5420.aString5433 = Class2.aString19;
			Class448.aClass450_5424.aString5433 = Class2.aString19;
			Class448.aClass450_5420.anInt5434 = -58916693 * Class448.aClass450_5420.worldId + 1140744768;
			Class448.aClass450_5424.anInt5434 = -58916693 * Class448.aClass450_5424.worldId + 1140744768;
			Class448.aClass450_5420.anInt5437 = -1441381029 * Class448.aClass450_5420.worldId + 1250363344;
			Class448.aClass450_5424.anInt5437 = -1441381029 * Class448.aClass450_5424.worldId + 1250363344;
		}
		Class159.aClass450_2010 = Class448.aClass450_5420;
		if (Game.darkan == CURRENT_GAME)
			aBool7372 = false;
		Class455.aShortArray5452 = ObjectDefinitions.aShortArray5691 = NPCDefinitions.aShortArray4862 = ItemDefinitions.staticColorArr256 = new short[256];
		try {
			Class182.aClipboard2263 = Class371.method6354((byte) 1).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class96_Sub21.aClass199_9438 = Class325.method5787(Class351.gameCanvas, 539499635);
		Class163.aClass209_2031 = FontRenderer.method400(Class351.gameCanvas, true, (byte) -44);
		if (Class496.aClass496_5813 != Class90.aClass496_952)
			aBool7176 = true;
		aString3252 = Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -1954357321);
		IndexLoaders.MAP_REGION_LOADER_THREAD = new MapRegionLoaderTask();
		new Thread(IndexLoaders.MAP_REGION_LOADER_THREAD).start();
	}

	final void method4688() {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1690824454) == 2) {
			try {
				method11618((byte) 95);
			} catch (ThreadDeath threaddeath) {
				throw threaddeath;
			} catch (Throwable throwable) {
				Class151.method2594(new StringBuilder().append(throwable.getMessage()).append(" ").append(method4669(2110908751)).toString(), throwable, (byte) -93);
				aBool7171 = true;
				Class538.method11500(0, false, (byte) 24);
			}
		} else
			method11618((byte) 24);
	}

	final void method4689() {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(532788863) == 2) {
			try {
				method11618((byte) 102);
			} catch (ThreadDeath threaddeath) {
				throw threaddeath;
			} catch (Throwable throwable) {
				Class151.method2594(new StringBuilder().append(throwable.getMessage()).append(" ").append(method4669(-217360066)).toString(), throwable, (byte) -22);
				aBool7171 = true;
				Class538.method11500(0, false, (byte) 24);
			}
		} else
			method11618((byte) 34);
	}

	public String method4691() {
		String string = " ";
		try {
			CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1819311505);
			string = new StringBuilder().append(string).append(1948093437 * class219.x).append(Class2.aString14).append(-1002240017 * class219.y).append(Class2.aString14).append(IndexLoaders.MAP_REGION_DECODER.getSizeX(283512229)).append(Class2.aString14).append(IndexLoaders.MAP_REGION_DECODER.getSizeY(-319549995)).append(" ").toString();
			if (null != Class84.myPlayer)
				string = new StringBuilder().append(string).append(675588453 * Class4.anInt35).append(Class2.aString14).append(class219.x * 1948093437 + (Class84.myPlayer.regionBaseX[0])).append(Class2.aString14).append((Class84.myPlayer.regionBaseY[0]) + class219.y * -1002240017).append(" ").toString();
			else
				string = new StringBuilder().append(string).append(675588453 * Class4.anInt35).append(Class2.aString14).append(675588453 * Class4.anInt35).append(Class2.aString14).append(675588453 * Class4.anInt35).append(Class2.aString14).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(1928494244)).append(" ").append(Class393.aClass282_Sub54_4783.aClass468_Sub4_8187.method12641(761768417)).append(" ").append(Class158.method2730((short) -11674)).append(" ").append(Class349.anInt4083 * -418109423).append(Class2.aString14).append(-969250379 * anInt3243).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -120)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(1097279715)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12873(1971356271)).append(" ").toString();
			string = new StringBuilder().append(string).append(Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method12706((byte) 89)).append(" ").toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(MAX_MEMORY * -1346844585).append(" ").toString();
			string = new StringBuilder().append(string).append(anInt7166 * -1741204137).append(" ").toString();
			if (null != Class11.SYSTEM_INFO)
				string = new StringBuilder().append(string).append(-79546877 * Class11.SYSTEM_INFO.anInt8167).toString();
			else
				string = new StringBuilder().append(string).append(-1).toString();
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString7164 != null)
				string = new StringBuilder().append(string).append(aString7164).toString();
			else
				string = new StringBuilder().append(string).append(Class2.aString14).toString();
			try {
				if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(1491263318) == 2) {
					Class var_class = Class.forName("java.lang.ClassLoader");
					Field field = var_class.getDeclaredField("nativeLibraries");
					Class var_class_106_ = Class.forName("java.lang.reflect.AccessibleObject");
					Method method = var_class_106_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
					method.invoke(field, new Object[] { Boolean.TRUE });
					Vector vector = (Vector) field.get(client.class.getClassLoader());
					for (int i = 0; i < vector.size(); i++) {
						try {
							Object object = vector.elementAt(i);
							Field field_107_ = object.getClass().getDeclaredField("name");
							method.invoke(field_107_, new Object[] { Boolean.TRUE });
							try {
								String string_108_ = (String) field_107_.get(object);
								if (string_108_ != null && string_108_.indexOf("sw3d.dll") != -1) {
									Field field_109_ = object.getClass().getDeclaredField("handle");
									method.invoke(field_109_, (new Object[] { Boolean.TRUE }));
									string = new StringBuilder().append(string).append(" ").append(Long.toHexString(field_109_.getLong(object))).toString();
									method.invoke(field_109_, (new Object[] { Boolean.FALSE }));
								}
							} catch (Throwable throwable) {
								/* empty */
							}
							method.invoke(field_107_, new Object[] { Boolean.FALSE });
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

	static boolean method11651(IComponentDefinitions class118) {
		if (aBool7168) {
			if (method11633(class118).anInt7547 * 488242129 != 0)
				return false;
			if (class118.anInt1268 * -2131393857 == 0)
				return false;
		}
		return class118.aBool1306;
	}

	final void method4678(int i) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(678097413) == 2) {
			try {
				method11620(-1670950684);
			} catch (ThreadDeath threaddeath) {
				throw threaddeath;
			} catch (Throwable throwable) {
				Class151.method2594(new StringBuilder().append(throwable.getMessage()).append(" ").append(method4669(928438920)).toString(), throwable, (byte) -23);
				aBool7171 = true;
				Class538.method11500(0, false, (byte) 24);
			}
		} else
			method11620(-1594826994);
	}

	static final void method11750() {
		anInt7304 = 0;
		for (int i = 0; i < -685729279 * anInt7211; i++) {
			NPC class521_sub1_sub1_sub2_sub2 = ((NPC) (((Class282_Sub47) aClass465_7208.method7754((long) anIntArray7212[i])).anObject8068));
			if (class521_sub1_sub1_sub2_sub2.aBool10318 && (class521_sub1_sub1_sub2_sub2.method15899(1588256325) != -1)) {
				int i_693_ = ((class521_sub1_sub1_sub2_sub2.getSize(828768449) - 1) * 256 + 252);
				Vector3 class385 = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
				int i_694_ = (int) class385.x - i_693_ >> 9;
				int i_695_ = (int) class385.z - i_693_ >> 9;
				Animable class521_sub1_sub1_sub2 = Class155.method2640((class521_sub1_sub1_sub2_sub2.plane), i_694_, i_695_, 1096362951);
				if (null != class521_sub1_sub1_sub2) {
					int i_696_ = -1691508299 * class521_sub1_sub1_sub2.anInt10314;
					if (class521_sub1_sub1_sub2 instanceof NPC)
						i_696_ += 2048;
					if (0 == -1960408139 * class521_sub1_sub1_sub2.anInt10319 && (class521_sub1_sub1_sub2.method15899(1156663306) != -1)) {
						anIntArray7287[-282380655 * anInt7304] = i_696_;
						anIntArray7288[-282380655 * anInt7304] = i_696_;
						anInt7304 += 1194805873;
						class521_sub1_sub1_sub2.anInt10319 += -783136099;
					}
					anIntArray7287[-282380655 * anInt7304] = i_696_;
					anIntArray7288[-282380655 * anInt7304] = (-1691508299 * class521_sub1_sub1_sub2_sub2.anInt10314) + 2048;
					anInt7304 += 1194805873;
					class521_sub1_sub1_sub2.anInt10319 += -783136099;
				}
			}
		}
		Class225_Sub5.method13047(anIntArray7288, anIntArray7287, 0, anInt7304 * -282380655 - 1, (byte) 101);
	}

	final void method4738() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class221.aClass118_2763 = new IComponentDefinitions();
		Class532_Sub1.method12840(-1015935879);
		Whirlpool.JS5_LOCAL_REQUESTER = new JS5LocalRequester();
		Class119.JS5_STANDARD_REQUESTER = new Class312_Sub1();
		Class239.method4090(new int[] { 20, 260 }, new int[] { 1000, 100 }, -651551316);
		Vector3.method6643(100);
		Quaternion.method6493(10);
		ItemDefinitions.method7141(100, (byte) -10);
		Class282_Sub41_Sub3.method14807(100, 702651669);
		if (Class496.aClass496_5813 != Class90.aClass496_952)
			Class339.aByteArrayArray3986 = new byte[50][];
		Class393.aClass282_Sub54_4783 = Class225_Sub1.method12791(-1043766180);
		if (Class393.aClass282_Sub54_4783.aClass468_Sub3_8199.method12632(1417868363) == 1)
			SceneObjectManager.aBool2644 = false;
		if (Class496.aClass496_5813 == Class90.aClass496_952)
			Class448.aClass450_5420.aString5433 = Class282_Sub44.anApplet8065.getCodeBase().getHost();
		else if (Class496.method8308(Class90.aClass496_952, 1401692729)) {
			Class448.aClass450_5420.aString5433 = Class282_Sub44.anApplet8065.getCodeBase().getHost();
			Class448.aClass450_5420.anInt5434 = 1140744768 + -58916693 * Class448.aClass450_5420.worldId;
			Class448.aClass450_5424.anInt5434 = Class448.aClass450_5424.worldId * -58916693 + 1140744768;
			Class448.aClass450_5420.anInt5437 = -1441381029 * Class448.aClass450_5420.worldId + 1250363344;
			Class448.aClass450_5424.anInt5437 = Class448.aClass450_5424.worldId * -1441381029 + 1250363344;
		} else if (Class496.aClass496_5810 == Class90.aClass496_952) {
			Class448.aClass450_5420.aString5433 = Class2.aString19;
			Class448.aClass450_5424.aString5433 = Class2.aString19;
			Class448.aClass450_5420.anInt5434 = -58916693 * Class448.aClass450_5420.worldId + 1140744768;
			Class448.aClass450_5424.anInt5434 = -58916693 * Class448.aClass450_5424.worldId + 1140744768;
			Class448.aClass450_5420.anInt5437 = -1441381029 * Class448.aClass450_5420.worldId + 1250363344;
			Class448.aClass450_5424.anInt5437 = -1441381029 * Class448.aClass450_5424.worldId + 1250363344;
		}
		Class159.aClass450_2010 = Class448.aClass450_5420;
		if (Game.darkan == CURRENT_GAME)
			aBool7372 = false;
		Class455.aShortArray5452 = ObjectDefinitions.aShortArray5691 = NPCDefinitions.aShortArray4862 = ItemDefinitions.staticColorArr256 = new short[256];
		try {
			Class182.aClipboard2263 = Class371.method6354((byte) 1).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class96_Sub21.aClass199_9438 = Class325.method5787(Class351.gameCanvas, 539499635);
		Class163.aClass209_2031 = FontRenderer.method400(Class351.gameCanvas, true, (byte) -9);
		if (Class496.aClass496_5813 != Class90.aClass496_952)
			aBool7176 = true;
		aString3252 = Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -504694626);
		IndexLoaders.MAP_REGION_LOADER_THREAD = new MapRegionLoaderTask();
		new Thread(IndexLoaders.MAP_REGION_LOADER_THREAD).start();
	}

	public static final void method11768(Interface class98, IComponentDefinitions[] class118s, int i, int i_765_, int i_766_, int i_767_, int i_768_, int i_769_, int i_770_, int i_771_, int i_772_) {
		for (int i_773_ = 0; i_773_ < class118s.length; i_773_++) {
			IComponentDefinitions class118 = class118s[i_773_];
			if (null != class118 && 2110532063 * class118.anInt1305 == i) {
				int i_774_ = class118.anInt1299 * 597157617 + i_769_;
				int i_775_ = i_770_ + class118.anInt1428 * 198275475;
				int i_776_;
				int i_777_;
				int i_778_;
				int i_779_;
				if (class118.anInt1268 * -2131393857 == 2) {
					i_776_ = i_765_;
					i_777_ = i_766_;
					i_778_ = i_767_;
					i_779_ = i_768_;
				} else {
					int i_780_ = i_774_ + class118.anInt1301 * 1506818197;
					int i_781_ = -492594917 * class118.anInt1429 + i_775_;
					if (class118.anInt1268 * -2131393857 == 9) {
						i_780_++;
						i_781_++;
					}
					i_776_ = i_774_ > i_765_ ? i_774_ : i_765_;
					i_777_ = i_775_ > i_766_ ? i_775_ : i_766_;
					i_778_ = i_780_ < i_767_ ? i_780_ : i_767_;
					i_779_ = i_781_ < i_768_ ? i_781_ : i_768_;
				}
				if (0 != class118.anInt1268 * -2131393857 && !class118.aBool1384 && method11633(class118).anInt7547 * 488242129 == 0 && class118 != aClass118_7247 && (class118.anInt1290 * 1449989045 != 1575345145 * IComponentDefinitions.anInt1269) && (-502106969 * IComponentDefinitions.anInt1374 != class118.anInt1290 * 1449989045) && (1449989045 * class118.anInt1290 != IComponentDefinitions.anInt1372 * -741477579) && (1449989045 * class118.anInt1290 != IComponentDefinitions.anInt1436 * 260799187)) {
					if (i_776_ < i_778_ && i_777_ < i_779_)
						Class86.method1482(class118, (byte) 35);
				} else if (!method11651(class118)) {
					if (class118 == aClass118_7257 && Class96_Sub14.method14643(aClass118_7257, -140661194)) {
						aBool7369 = true;
						anInt7252 = -1659832809 * i_774_;
						anInt7215 = -1182378399 * i_775_;
					}
					if (class118.aBool1424 || i_776_ < i_778_ && i_777_ < i_779_) {
						if (class118.aBool1291 && i_771_ >= i_776_ && i_772_ >= i_777_ && i_771_ < i_778_ && i_772_ < i_779_) {
							for (HookRequest class282_sub43 = ((HookRequest) aClass482_7402.head((byte) 111)); class282_sub43 != null; class282_sub43 = ((HookRequest) aClass482_7402.next(999668227))) {
								if (class282_sub43.aBool8052) {
									class282_sub43.remove();
									class282_sub43.iComponentDefs.aBool1440 = false;
								}
							}
							if (0 == 2100482291 * Class96_Sub1.anInt8308) {
								aClass118_7257 = null;
								aClass118_7247 = null;
							}
							anInt7184 = 0;
							Class291_Sub1.aBool8022 = false;
							aBool7375 = false;
							if (!Class20.aBool161)
								HitsplatDefinitions.method3851(-402153223);
						}
						boolean bool = (class118.aBool1328 && 5 == class118.anInt1268 * -2131393857 && 1762983005 * class118.anInt1453 == 0 && -1546094517 * class118.anInt1404 < 0 && -1 == class118.anInt1426 * -56249735 && class118.anInt1435 * 602613369 == -1 && !class118.aBool1322 && 0 == -169127141 * class118.anInt1423);
						boolean bool_782_ = false;
						if (i_771_ >= i_776_ && i_772_ >= i_777_ && i_771_ < i_778_ && i_772_ < i_779_) {
							if (bool) {
								Class119 class119 = class118.method2046((Renderers.SOFTWARE_RENDERER), 386578026);
								if (null == class119 || (-1125753931 * class119.anInt1458 != 1506818197 * class118.anInt1301) || (class118.anInt1429 * -492594917 != class119.anInt1454 * 2069222845))
									bool_782_ = true;
								else {
									int i_783_ = i_771_ - i_774_;
									int i_784_ = i_772_ - i_775_;
									if (i_784_ >= 0 && i_784_ < (class119.anIntArray1457).length) {
										int i_785_ = class119.anIntArray1457[i_784_];
										if (i_783_ >= i_785_ && i_783_ <= (class119.anIntArray1455[i_784_]) + i_785_)
											bool_782_ = true;
									}
								}
							} else
								bool_782_ = true;
						}
						if (!aBool7344 && bool_782_) {
							if (class118.anInt1309 * 185851771 >= 0)
								anInt7427 = class118.anInt1309 * -243304465;
							else if (class118.aBool1291)
								anInt7427 = 434551523;
						}
						if (!Class20.aBool161 && bool_782_ && !class98.aBool999)
							Class455.method7553(class118, i_771_ - i_774_, i_772_ - i_775_, 1085541534);
						boolean bool_786_ = false;
						if (Class163.aClass209_2031.method3565((byte) -53) && bool_782_)
							bool_786_ = true;
						boolean bool_787_ = false;
						Class282_Sub53 class282_sub53 = ((Class282_Sub53) aClass482_7267.head((byte) 119));
						if (null != class282_sub53 && class282_sub53.method13470(1070950260) == 0 && class282_sub53.method13481(1581398490) >= i_776_ && class282_sub53.method13469(523863332) >= i_777_ && class282_sub53.method13481(1968714645) < i_778_ && (class282_sub53.method13469(1262935690) < i_779_)) {
							if (bool) {
								Class119 class119 = class118.method2046((Renderers.SOFTWARE_RENDERER), 854241922);
								if (null == class119 || (class118.anInt1301 * 1506818197 != class119.anInt1458 * -1125753931) || (class118.anInt1429 * -492594917 != 2069222845 * class119.anInt1454))
									bool_787_ = true;
								else {
									int i_788_ = (class282_sub53.method13481(1963952523) - i_774_);
									int i_789_ = (class282_sub53.method13469(-1768286963) - i_775_);
									if (i_789_ >= 0 && i_789_ < (class119.anIntArray1457).length) {
										int i_790_ = class119.anIntArray1457[i_789_];
										if (i_788_ >= i_790_ && i_788_ <= (class119.anIntArray1455[i_789_]) + i_790_)
											bool_787_ = true;
									}
								}
							} else
								bool_787_ = true;
						}
						if (class118.aBool1424 && !Class521_Sub1_Sub3_Sub1.method16081(16711935)) {
							for (int i_791_ = 0; i_791_ < class118.aByteArrayArray1366.length; i_791_++) {
								boolean bool_792_ = false;
								boolean bool_793_ = false;
								if (class118.anIntArray1267[i_791_] > 0) {
									for (int i_794_ = 0; i_794_ < anInt7193 * -1911445195; i_794_++) {
										if (class118.anIntArray1267[i_791_] == anInterface16Array7154[i_794_].method118(-1744878171)) {
											bool_792_ = true;
											if (class118.anIntArray1425 == null || ((class118.anIntArray1425[i_791_]) <= (cycles * -1809259861)))
												bool_793_ = true;
											break;
										}
									}
								}
								if (!bool_792_ && (class118.aByteArrayArray1366[i_791_] != null)) {
									for (int i_795_ = 0; i_795_ < (class118.aByteArrayArray1366[i_791_]).length; i_795_++) {
										if (Class96_Sub21.aClass199_9438.method3236((class118.aByteArrayArray1366[i_791_][i_795_]), -1446906824)) {
											bool_792_ = true;
											if (class118.anIntArray1425 != null && ((class118.anIntArray1425[i_791_]) > cycles * -1809259861))
												break;
											byte i_796_ = (class118.aByteArrayArray1367[i_791_][i_795_]);
											if (i_796_ == 0 || ((0 == (i_796_ & 0x8) || (!(Class96_Sub21.aClass199_9438.method3236(86, -2117949057)) && !(Class96_Sub21.aClass199_9438.method3236(82, -1492987736)) && !(Class96_Sub21.aClass199_9438.method3236(81, -1770217708)))) && (0 == (i_796_ & 0x2) || (Class96_Sub21.aClass199_9438.method3236(86, -1478963287))) && ((i_796_ & 0x1) == 0 || (Class96_Sub21.aClass199_9438.method3236(82, -1680703843)))
													&& (0 == (i_796_ & 0x4) || (Class96_Sub21.aClass199_9438.method3236(81, -1805947277))))) {
												bool_793_ = true;
												break;
											}
										}
									}
								}
								if (bool_793_) {
									if (i_791_ < 10)
										Class96_Sub10.method14603(1 + i_791_, class118.idHash * -1952846363, 1924549737 * class118.anInt1288, "", (byte) 124);
									else if (i_791_ == 10) {
										Class60.method1170(-609337146);
										Class282_Sub10 class282_sub10 = method11633(class118);
										Class304.method5409(class118, class282_sub10.method12179(852440372), (1831058647 * class282_sub10.anInt7541), (byte) -33);
										aString7275 = Class346.method6157(class118, 1492565193);
										if (null == aString7275)
											aString7275 = "Null";
										aString7356 = new StringBuilder().append(class118.aString1369).append(Class59.method1163(16777215, 619010179)).toString();
									}
									int i_797_ = class118.anIntArray1395[i_791_];
									if (null == class118.anIntArray1425)
										class118.anIntArray1425 = (new int[(class118.aByteArrayArray1366).length]);
									if (0 != i_797_)
										class118.anIntArray1425[i_791_] = cycles * -1809259861 + i_797_;
									else
										class118.anIntArray1425[i_791_] = 2147483647;
								}
								if (!bool_792_ && class118.anIntArray1425 != null)
									class118.anIntArray1425[i_791_] = 0;
							}
						}
						if (bool_787_)
							Class282_Sub14.method12221(class118, (class282_sub53.method13481(1900714400) - i_774_), (class282_sub53.method13469(-380403758) - i_775_), 983477136);
						if (null != aClass118_7257 && class118 != aClass118_7257 && bool_782_ && method11633(class118).method12177(437818173))
							aClass118_7370 = class118;
						if (aClass118_7247 == class118) {
							aBool7403 = true;
							anInt7432 = -913311703 * i_774_;
							anInt7265 = -864485077 * i_775_;
							anInt7367 = 751361877 * aClass118_7247.anInt1301;
							anInt7476 = 1858901611 * aClass118_7247.anInt1429;
						}
						if (class118.aBool1384 || class118.anInt1290 * 1449989045 != 0) {
							if (bool_782_ && 1789395551 * anInt7191 != 0 && class118.anObjectArray1412 != null) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.aBool8052 = true;
								class282_sub43.iComponentDefs = class118;
								class282_sub43.anInt8055 = anInt7191 * -2033324105;
								class282_sub43.params = class118.anObjectArray1412;
								aClass482_7402.append(class282_sub43, 1731325963);
							}
							if (aClass118_7257 != null) {
								bool_787_ = false;
								bool_786_ = false;
							} else if (Class20.aBool161 || ((class118.anInt1290 * 1449989045 != 663156097 * IComponentDefinitions.anInt1313) && anInt7184 * 676534483 > 0)) {
								bool_787_ = false;
								bool_786_ = false;
								bool_782_ = false;
							}
							if (class118.anInt1290 * 1449989045 != 0) {
								if ((IComponentDefinitions.anInt1372 * -741477579 == class118.anInt1290 * 1449989045) || (class118.anInt1290 * 1449989045 == IComponentDefinitions.anInt1436 * 260799187)) {
									aClass118_7183 = class118;
									Class535 class535 = IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4038((short) 4792);
									if ((class535.method11451(1476624725) != null) && !IndexLoaders.MAP_REGION_LOADER_THREAD.method6051(1561367630))
										class535.method11451(1476624725).method4217(Renderers.SOFTWARE_RENDERER, -492594917 * class118.anInt1429, Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644), -1133830850);
									if ((-741477579 * IComponentDefinitions.anInt1372 == 1449989045 * class118.anInt1290) && !Class20.aBool161 && i_771_ >= i_776_ && i_772_ >= i_777_ && i_771_ < i_778_ && i_772_ < i_779_) {
										Class521_Sub1_Sub4_Sub1.method16073(Renderers.SOFTWARE_RENDERER, i_771_, i_772_, -170435576);
										for (Class275_Sub2 class275_sub2 = ((Class275_Sub2) (aClass457_7290.method7659(301908602))); null != class275_sub2; class275_sub2 = ((Class275_Sub2) (aClass457_7290.method7650((byte) 102)))) {
											if (i_771_ >= ((((Class275_Sub2) class275_sub2).anInt7742) * 283619161) && i_771_ < ((((Class275_Sub2) class275_sub2).anInt7744) * 375717969) && (i_772_ >= (-472412079 * (((Class275_Sub2) class275_sub2).anInt7743))) && (i_772_ < (-1657734741 * (((Class275_Sub2) class275_sub2).anInt7740)))) {
												HitsplatDefinitions.method3851(-402153223);
												Class463.method7724((((Class275_Sub2) class275_sub2).aClass521_Sub1_Sub1_Sub2_7739), -196909236);
											}
										}
									}
									int i_798_ = Class197.NUM_PLAYER_INDICES * -963499271;
									int[] is = Class197.PLAYER_INDICES;
									for (int i_799_ = 0; i_799_ < i_798_; i_799_++) {
										Player class521_sub1_sub1_sub2_sub1 = (players[is[i_799_]]);
										if (null != class521_sub1_sub1_sub2_sub1) {
											Class1.method252(Class397.aClass397_4806, -1, -1, class521_sub1_sub1_sub2_sub1, is[i_799_], 1912850737);
											class521_sub1_sub1_sub2_sub1.method15880(i_776_, i_777_, i_778_, i_779_, (i_774_ - (276864765 * class118.anInt1311)), (i_775_ - (682782159 * class118.anInt1312)), i_771_, i_772_, (byte) 91);
										}
									}
									for (int i_800_ = 0; i_800_ < -685729279 * anInt7211; i_800_++) {
										int i_801_ = anIntArray7212[i_800_];
										Class282_Sub47 class282_sub47 = ((Class282_Sub47) aClass465_7208.method7754((long) i_801_));
										if (class282_sub47 != null) {
											Class1.method252(Class397.aClass397_4804, (((NPC) class282_sub47.anObject8068).aClass409_10580.anInt4856) * -1524615769, -1, ((Animable) class282_sub47.anObject8068), i_801_, 1492205273);
											((Animable) class282_sub47.anObject8068).method15880(i_776_, i_777_, i_778_, i_779_, (i_774_ - (276864765 * class118.anInt1311)), i_775_ - (class118.anInt1312 * 682782159), i_771_, i_772_, (byte) 77);
										}
									}
									continue;
								}
								if (IComponentDefinitions.anInt1269 * 1575345145 == 1449989045 * class118.anInt1290) {
									Class119 class119 = (class118.method2046(Renderers.SOFTWARE_RENDERER, -139394981));
									if (class119 != null && (0 == (-1221526793 * Class187.anInt2363) || 3 == (-1221526793 * Class187.anInt2363)) && !Class20.aBool161 && i_771_ >= i_776_ && i_772_ >= i_777_ && i_771_ < i_778_ && i_772_ < i_779_) {
										int i_802_ = i_771_ - i_774_;
										int i_803_ = i_772_ - i_775_;
										int i_804_ = class119.anIntArray1457[i_803_];
										if (i_802_ >= i_804_ && i_802_ <= (class119.anIntArray1455[i_803_]) + i_804_) {
											i_802_ -= (class118.anInt1301 * 1506818197 / 2);
											i_803_ -= (-492594917 * class118.anInt1429 / 2);
											int i_805_;
											if (-672443707 * NativeLibraryLoader.anInt3240 == 4)
												i_805_ = ((int) aFloat7365 & 0x3fff);
											else
												i_805_ = (((int) aFloat7365 + (-1790074477 * anInt7255)) & 0x3fff);
											int i_806_ = (Class382.anIntArray4657[i_805_]);
											int i_807_ = (Class382.anIntArray4661[i_805_]);
											if (NativeLibraryLoader.anInt3240 * -672443707 != 4) {
												i_806_ = i_806_ * ((-1864403271 * anInt7203) + 256) >> 8;
												i_807_ = ((256 + (anInt7203 * -1864403271)) * i_807_) >> 8;
											}
											int i_808_ = ((i_806_ * i_803_ + i_802_ * i_807_) >> 14);
											int i_809_ = ((i_803_ * i_807_ - i_806_ * i_802_) >> 14);
											int i_810_;
											int i_811_;
											if (-672443707 * NativeLibraryLoader.anInt3240 == 4) {
												i_810_ = (anInt7262 * 61805441 >> 9) + (i_808_ >> 2);
												i_811_ = (-1032332761 * anInt7376 >> 9) - (i_809_ >> 2);
											} else {
												int i_812_ = ((Class84.myPlayer.getSize(828768449)) - 1) * 256;
												Vector3 class385 = (Class84.myPlayer.method11166().aClass385_3595);
												i_810_ = ((i_808_ >> 2) + (((int) (class385.x) - i_812_) >> 9));
												i_811_ = (((int) (class385.z) - i_812_) >> 9) - (i_809_ >> 2);
											}
											if (aBool7344 && 0 != ((1310510077 * Class506.anInt5858) & 0x40)) {
												IComponentDefinitions class118_813_ = (Index.method5694((728544879 * Class7.anInt56), (-1673073865 * anInt7345), 381428528));
												if (class118_813_ != null)
													PlayerAppearance.method4032(aString7275, new StringBuilder().append(" ").append(Class2.aString17).toString(), (Defaults8Loader.anInt5932 * -239192305), 59, (-56249735 * (class118.anInt1426)), 1L, i_810_, i_811_, true, false, (long) ((((class118.anInt1288) * 1924549737) << 32) | ((class118.idHash) * -1952846363)), true, -1033171513);
												else
													Class60.method1170(-609337146);
											} else {
												if (Game.stellarDawn == CURRENT_GAME)
													PlayerAppearance.method4032((Message.FACE_HERE.translate((Class223.CURRENT_LANGUAGE), -1664758870)), "", -1, 60, -1, 1L, i_810_, i_811_, true, false, 0L, true, -1558398631);
												PlayerAppearance.method4032(Class85.aString817, "", 460745521 * anInt7311, 23, -1, 1L, i_810_, i_811_, true, false, 0L, true, -1994629741);
											}
										}
									}
									continue;
								}
								if (1449989045 * class118.anInt1290 == IComponentDefinitions.anInt1313 * 663156097) {
									Class282_Sub20_Sub24.aClass118_9884 = class118;
									if (bool_782_)
										Class291_Sub1.aBool8022 = true;
									if (bool_787_) {
										int i_814_ = (int) ((double) ((class282_sub53.method13481(1215503828)) - i_774_ - ((class118.anInt1301) * 1506818197 / 2)) * 2.0 / (double) (Class291.aFloat3468));
										int i_815_ = (int) -((double) ((class282_sub53.method13469(11142405)) - i_775_ - (-492594917 * (class118.anInt1429) / 2)) * 2.0 / (double) (Class291.aFloat3468));
										int i_816_ = (Class291.anInt3472 + ((-861975801 * Class427.anInt5123) + i_814_));
										int i_817_ = (Class291.anInt3473 + ((Class475.anInt5624 * 483850921) + i_815_));
										Class282_Sub50_Sub6 class282_sub50_sub6 = Class125.method2173(1504861114);
										if (null != class282_sub50_sub6) {
											int[] is = new int[3];
											class282_sub50_sub6.method14775(i_816_, i_817_, is, -1788209952);
											if (is != null) {
												if ((Class96_Sub21.aClass199_9438.method3236(82, -1914297424)) && (-644057819 * rights > 0)) {
													Class447.method7460(is[0], is[1], is[2], -952047234);
													continue;
												}
												aBool7375 = true;
												Class282_Sub15_Sub5.anInt9859 = -528547023 * is[0];
												Class44.anInt431 = 868144561 * is[1];
												Class421.anInt5015 = is[2] * 1900093881;
											}
											anInt7184 = -1831534757;
											aBool7374 = false;
											anInt7361 = (Class163.aClass209_2031.method3569(2118752348) * 1630160131);
											anInt7362 = (Class163.aClass209_2031.method3570(756095591) * 546105467);
										}
									} else if (bool_786_ && anInt7184 * 676534483 > 0) {
										if (anInt7184 * 676534483 == 1 && ((anInt7361 * 290868651 != (Class163.aClass209_2031.method3569(2088913466))) || (-554256717 * anInt7362 != (Class163.aClass209_2031.method3570(756095591))))) {
											Class244.anInt3008 = (Class427.anInt5123 * 268540937);
											Class11.anInt123 = (Class475.anInt5624 * -1472926225);
											anInt7184 = 631897782;
										}
										if (676534483 * anInt7184 == 2) {
											aBool7374 = true;
											Class89.method1503(((1373409935 * Class244.anInt3008) + (int) ((double) ((290868651 * anInt7361) - (Class163.aClass209_2031.method3569(2080711871))) * 2.0 / (double) (Class291.aFloat3462))), 688128723);
											Class316.method5599((Class11.anInt123 * 1467496679 - (int) ((double) ((anInt7362 * -554256717) - (Class163.aClass209_2031.method3570(756095591))) * 2.0 / (double) (Class291.aFloat3462))), 1671825198);
										}
									} else {
										if (anInt7184 * 676534483 > 0 && !aBool7374) {
											if ((-1718417173 * anInt7339 == 1 || (JS5GrabWorker.method12562(-1506814013))) && (Class20.anInt169 * 2144330291) > 2)
												Class242.method4164(290868651 * anInt7361, anInt7362 * -554256717, -1135712207);
											else if (Class216.method3677(116247147))
												Class242.method4164(anInt7361 * 290868651, -554256717 * anInt7362, -603230978);
										}
										anInt7184 = 0;
									}
									continue;
								}
								if (IComponentDefinitions.anInt1272 * -1417910959 == 1449989045 * class118.anInt1290) {
									if (bool_786_)
										Class306.method5458((Class163.aClass209_2031.method3569(2133055748) - i_774_), (Class163.aClass209_2031.method3570(756095591) - i_775_), 1506818197 * class118.anInt1301, class118.anInt1429 * -492594917, 301855530);
									continue;
								}
								if (class118.anInt1290 * 1449989045 == -502106969 * IComponentDefinitions.anInt1374) {
									Class15.method544(class118, i_774_, i_775_, 1211773543);
									continue;
								}
							}
							if (!class118.aBool1286 && bool_787_) {
								class118.aBool1286 = true;
								if (class118.anObjectArray1386 != null) {
									HookRequest class282_sub43 = new HookRequest();
									class282_sub43.aBool8052 = true;
									class282_sub43.iComponentDefs = class118;
									class282_sub43.anInt8059 = (class282_sub53.method13481(1563678506) - i_774_) * 610593631;
									class282_sub43.anInt8055 = (class282_sub53.method13469(804357569) - i_775_) * -916586071;
									class282_sub43.params = class118.anObjectArray1386;
									aClass482_7402.append(class282_sub43, 2000718310);
								}
							}
							if (class118.aBool1286 && bool_786_ && null != class118.anObjectArray1319) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.aBool8052 = true;
								class282_sub43.iComponentDefs = class118;
								class282_sub43.anInt8059 = (Class163.aClass209_2031.method3569(1948013292) - i_774_) * 610593631;
								class282_sub43.anInt8055 = (Class163.aClass209_2031.method3570(756095591) - i_775_) * -916586071;
								class282_sub43.params = class118.anObjectArray1319;
								aClass482_7402.append(class282_sub43, -97449863);
							}
							if (class118.aBool1286 && !bool_786_) {
								class118.aBool1286 = false;
								if (class118.anObjectArray1302 != null) {
									HookRequest class282_sub43 = new HookRequest();
									class282_sub43.aBool8052 = true;
									class282_sub43.iComponentDefs = class118;
									class282_sub43.anInt8059 = (Class163.aClass209_2031.method3569(2071340926) - i_774_) * 610593631;
									class282_sub43.anInt8055 = (Class163.aClass209_2031.method3570(756095591) - i_775_) * -916586071;
									class282_sub43.params = class118.anObjectArray1302;
									aClass482_7404.append(class282_sub43, 1766339959);
								}
							}
							if (bool_786_ && null != class118.anObjectArray1389) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.aBool8052 = true;
								class282_sub43.iComponentDefs = class118;
								class282_sub43.anInt8059 = (Class163.aClass209_2031.method3569(2087662207) - i_774_) * 610593631;
								class282_sub43.anInt8055 = (Class163.aClass209_2031.method3570(756095591) - i_775_) * -916586071;
								class282_sub43.params = class118.anObjectArray1389;
								aClass482_7402.append(class282_sub43, -1572116680);
							}
							if (!class118.aBool1440 && bool_782_) {
								class118.aBool1440 = true;
								if (class118.anObjectArray1390 != null) {
									HookRequest class282_sub43 = new HookRequest();
									class282_sub43.aBool8052 = true;
									class282_sub43.iComponentDefs = class118;
									class282_sub43.anInt8059 = (Class163.aClass209_2031.method3569(1986967200) - i_774_) * 610593631;
									class282_sub43.anInt8055 = (Class163.aClass209_2031.method3570(756095591) - i_775_) * -916586071;
									class282_sub43.params = class118.anObjectArray1390;
									aClass482_7402.append(class282_sub43, 1364078697);
								}
							}
							if (class118.aBool1440 && bool_782_ && class118.anObjectArray1278 != null) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.aBool8052 = true;
								class282_sub43.iComponentDefs = class118;
								class282_sub43.anInt8059 = (Class163.aClass209_2031.method3569(2139552091) - i_774_) * 610593631;
								class282_sub43.anInt8055 = (Class163.aClass209_2031.method3570(756095591) - i_775_) * -916586071;
								class282_sub43.params = class118.anObjectArray1278;
								aClass482_7402.append(class282_sub43, -1008965297);
							}
							if (class118.aBool1440 && !bool_782_) {
								class118.aBool1440 = false;
								if (class118.anObjectArray1392 != null) {
									HookRequest class282_sub43 = new HookRequest();
									class282_sub43.aBool8052 = true;
									class282_sub43.iComponentDefs = class118;
									class282_sub43.anInt8059 = (Class163.aClass209_2031.method3569(2027458621) - i_774_) * 610593631;
									class282_sub43.anInt8055 = (Class163.aClass209_2031.method3570(756095591) - i_775_) * -916586071;
									class282_sub43.params = class118.anObjectArray1392;
									aClass482_7404.append(class282_sub43, -268167144);
								}
							}
							if (class118.anObjectArray1409 != null) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.iComponentDefs = class118;
								class282_sub43.params = class118.anObjectArray1409;
								aClass482_7233.append(class282_sub43, 2120828664);
							}
							if (null != class118.anObjectArray1403 && (anInt7368 * -29238265 > class118.anInt1446 * 1918380069)) {
								if (class118.anIntArray1315 == null || ((anInt7368 * -29238265 - 1918380069 * class118.anInt1446) > 32)) {
									HookRequest class282_sub43 = new HookRequest();
									class282_sub43.iComponentDefs = class118;
									class282_sub43.params = class118.anObjectArray1403;
									aClass482_7402.append(class282_sub43, 1882589106);
								} else {
									while_14_: for (int i_818_ = 1918380069 * class118.anInt1446; i_818_ < anInt7368 * -29238265; i_818_++) {
										int i_819_ = anIntArray7150[i_818_ & 0x1f];
										for (int i_820_ = 0; i_820_ < (class118.anIntArray1315).length; i_820_++) {
											if (class118.anIntArray1315[i_820_] == i_819_) {
												HookRequest class282_sub43 = new HookRequest();
												class282_sub43.iComponentDefs = class118;
												class282_sub43.params = (class118.anObjectArray1403);
												aClass482_7402.append(class282_sub43, -1583416035);
												break while_14_;
											}
										}
									}
								}
								class118.anInt1446 = 718509499 * anInt7368;
							}
							if (class118.anObjectArray1405 != null && (721577081 * anInt7388 > class118.anInt1447 * -588912717)) {
								if (null == class118.anIntArray1406 || ((anInt7388 * 721577081 - class118.anInt1447 * -588912717) > 32)) {
									HookRequest class282_sub43 = new HookRequest();
									class282_sub43.iComponentDefs = class118;
									class282_sub43.params = class118.anObjectArray1405;
									aClass482_7402.append(class282_sub43, -1542519735);
								} else {
									while_15_: for (int i_821_ = class118.anInt1447 * -588912717; i_821_ < anInt7388 * 721577081; i_821_++) {
										int i_822_ = anIntArray7387[i_821_ & 0x1f];
										for (int i_823_ = 0; i_823_ < (class118.anIntArray1406).length; i_823_++) {
											if (i_822_ == (class118.anIntArray1406[i_823_])) {
												HookRequest class282_sub43 = new HookRequest();
												class282_sub43.iComponentDefs = class118;
												class282_sub43.params = (class118.anObjectArray1405);
												aClass482_7402.append(class282_sub43, 1083916278);
												break while_15_;
											}
										}
									}
								}
								class118.anInt1447 = -1239290589 * anInt7388;
							}
							if (null != class118.anObjectArray1397 && (1129368511 * anInt7453 > class118.anInt1443 * 1876717979)) {
								if (class118.anIntArray1401 == null || ((1129368511 * anInt7453 - 1876717979 * class118.anInt1443) > 32)) {
									HookRequest class282_sub43 = new HookRequest();
									class282_sub43.iComponentDefs = class118;
									class282_sub43.params = class118.anObjectArray1397;
									aClass482_7402.append(class282_sub43, 2105416157);
								} else {
									while_16_: for (int i_824_ = 1876717979 * class118.anInt1443; i_824_ < anInt7453 * 1129368511; i_824_++) {
										int i_825_ = anIntArray7379[i_824_ & 0x1f];
										for (int i_826_ = 0; i_826_ < (class118.anIntArray1401).length; i_826_++) {
											if (class118.anIntArray1401[i_826_] == i_825_) {
												HookRequest class282_sub43 = new HookRequest();
												class282_sub43.iComponentDefs = class118;
												class282_sub43.params = (class118.anObjectArray1397);
												aClass482_7402.append(class282_sub43, 747112081);
												break while_16_;
											}
										}
									}
								}
								class118.anInt1443 = anInt7453 * 2060677805;
							}
							if (null != class118.anObjectArray1342 && (anInt7382 * 280036749 > class118.anInt1444 * 1028755253)) {
								if (class118.anIntArray1398 == null || ((280036749 * anInt7382 - class118.anInt1444 * 1028755253) > 32)) {
									HookRequest class282_sub43 = new HookRequest();
									class282_sub43.iComponentDefs = class118;
									class282_sub43.params = class118.anObjectArray1342;
									aClass482_7402.append(class282_sub43, 24525168);
								} else {
									while_17_: for (int i_827_ = 1028755253 * class118.anInt1444; i_827_ < 280036749 * anInt7382; i_827_++) {
										int i_828_ = anIntArray7381[i_827_ & 0x1f];
										for (int i_829_ = 0; i_829_ < (class118.anIntArray1398).length; i_829_++) {
											if (i_828_ == (class118.anIntArray1398[i_829_])) {
												HookRequest class282_sub43 = new HookRequest();
												class282_sub43.iComponentDefs = class118;
												class282_sub43.params = (class118.anObjectArray1342);
												aClass482_7402.append(class282_sub43, -1099284632);
												break while_17_;
											}
										}
									}
								}
								class118.anInt1444 = -821415943 * anInt7382;
							}
							if (null != class118.anObjectArray1387 && (anInt7384 * 260874913 > class118.anInt1445 * -1445947283)) {
								if (null == class118.anIntArray1402 || ((260874913 * anInt7384 - class118.anInt1445 * -1445947283) > 32)) {
									HookRequest class282_sub43 = new HookRequest();
									class282_sub43.iComponentDefs = class118;
									class282_sub43.params = class118.anObjectArray1387;
									aClass482_7402.append(class282_sub43, -1118574570);
								} else {
									while_18_: for (int i_830_ = (class118.anInt1445 * -1445947283); i_830_ < 260874913 * anInt7384; i_830_++) {
										int i_831_ = anIntArray7283[i_830_ & 0x1f];
										for (int i_832_ = 0; i_832_ < (class118.anIntArray1402).length; i_832_++) {
											if (i_831_ == (class118.anIntArray1402[i_832_])) {
												HookRequest class282_sub43 = new HookRequest();
												class282_sub43.iComponentDefs = class118;
												class282_sub43.params = (class118.anObjectArray1387);
												aClass482_7402.append(class282_sub43, -587383315);
												break while_18_;
											}
										}
									}
								}
								class118.anInt1445 = 146799237 * anInt7384;
							}
							if (null != class118.anObjectArray1407 && (1033923721 * anInt7390 > 1268569579 * class118.anInt1448)) {
								if (null == class118.anIntArray1408 || ((1033923721 * anInt7390 - class118.anInt1448 * 1268569579) > 32)) {
									HookRequest class282_sub43 = new HookRequest();
									class282_sub43.iComponentDefs = class118;
									class282_sub43.params = class118.anObjectArray1407;
									aClass482_7402.append(class282_sub43, -715862270);
								} else {
									while_19_: for (int i_833_ = class118.anInt1448 * 1268569579; i_833_ < 1033923721 * anInt7390; i_833_++) {
										int i_834_ = anIntArray7222[i_833_ & 0x1f];
										for (int i_835_ = 0; i_835_ < (class118.anIntArray1408).length; i_835_++) {
											if (class118.anIntArray1408[i_835_] == i_834_) {
												HookRequest class282_sub43 = new HookRequest();
												class282_sub43.iComponentDefs = class118;
												class282_sub43.params = (class118.anObjectArray1407);
												aClass482_7402.append(class282_sub43, -591564519);
												break while_19_;
											}
										}
									}
								}
								class118.anInt1448 = anInt7390 * -2114017701;
							}
							if ((anInt7391 * 1614567877 > -2134706409 * class118.anInt1442) && null != class118.anObjectArray1413) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.iComponentDefs = class118;
								class282_sub43.params = class118.anObjectArray1413;
								aClass482_7402.append(class282_sub43, -1950466919);
							}
							if ((anInt7386 * 130674865 > -2134706409 * class118.anInt1442) && class118.anObjectArray1415 != null) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.iComponentDefs = class118;
								class282_sub43.params = class118.anObjectArray1415;
								aClass482_7402.append(class282_sub43, 375255808);
							}
							if ((anInt7179 * 1318018537 > -2134706409 * class118.anInt1442) && null != class118.anObjectArray1416) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.iComponentDefs = class118;
								class282_sub43.params = class118.anObjectArray1416;
								aClass482_7402.append(class282_sub43, 588293762);
							}
							if ((1253841501 * anInt7192 > -2134706409 * class118.anInt1442) && class118.anObjectArray1383 != null) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.iComponentDefs = class118;
								class282_sub43.params = class118.anObjectArray1383;
								aClass482_7402.append(class282_sub43, -1230143136);
							}
							if ((1427171939 * anInt7395 > class118.anInt1442 * -2134706409) && class118.anObjectArray1418 != null) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.iComponentDefs = class118;
								class282_sub43.params = class118.anObjectArray1418;
								aClass482_7402.append(class282_sub43, -881378125);
							}
							if ((-875401321 * anInt7320 > class118.anInt1442 * -2134706409) && null != class118.anObjectArray1361) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.iComponentDefs = class118;
								class282_sub43.params = class118.anObjectArray1361;
								aClass482_7402.append(class282_sub43, -483889363);
							}
							if ((92601653 * anInt7397 > class118.anInt1442 * -2134706409) && null != class118.anObjectArray1419) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.iComponentDefs = class118;
								class282_sub43.params = class118.anObjectArray1419;
								aClass482_7402.append(class282_sub43, -2054972027);
							}
							class118.anInt1442 = anInt7347 * -838112775;
							if (null != class118.anObjectArray1292) {
								for (int i_836_ = 0; i_836_ < anInt7193 * -1911445195; i_836_++) {
									HookRequest class282_sub43 = new HookRequest();
									class282_sub43.iComponentDefs = class118;
									class282_sub43.anInt8058 = (anInterface16Array7154[i_836_].method92(317240429) * -1259911049);
									class282_sub43.anInt8056 = (anInterface16Array7154[i_836_].method118(-1306556341) * -1763450683);
									class282_sub43.params = class118.anObjectArray1292;
									aClass482_7402.append(class282_sub43, -738320602);
								}
							}
							if (aBool7355 && class118.anObjectArray1353 != null) {
								HookRequest class282_sub43 = new HookRequest();
								class282_sub43.iComponentDefs = class118;
								class282_sub43.params = class118.anObjectArray1353;
								aClass482_7402.append(class282_sub43, 993442497);
							}
						}
						if (5 == class118.anInt1268 * -2131393857 && -1546094517 * class118.anInt1404 != -1)
							class118.method2027(IndexLoaders.aClass288_1746, IndexLoaders.aClass45_5759, -1847543291).method4217(Renderers.SOFTWARE_RENDERER, -492594917 * class118.anInt1429, Class393.aClass282_Sub54_4783.aClass468_Sub14_8211.method12728(-1912429644), -1133830850);
						Class86.method1482(class118, (byte) 9);
						if (-2131393857 * class118.anInt1268 == 0) {
							method11768(class98, class118s, -1952846363 * class118.idHash, i_776_, i_777_, i_778_, i_779_, (i_774_ - 276864765 * class118.anInt1311), (i_775_ - 682782159 * class118.anInt1312), i_771_, i_772_);
							if (null != class118.aClass118Array1439)
								method11768(class98, class118.aClass118Array1439, class118.idHash * -1952846363, i_776_, i_777_, i_778_, i_779_, (i_774_ - class118.anInt1311 * 276864765), (i_775_ - class118.anInt1312 * 682782159), i_771_, i_772_);
							Class282_Sub44 class282_sub44 = (Class282_Sub44) (aClass465_7442.method7754((long) (class118.idHash * -1952846363)));
							if (null != class282_sub44) {
								if (Game.darkan == CURRENT_GAME && 0 == (class282_sub44.anInt8062 * -1517697923) && !Class20.aBool161 && bool_782_ && !aBool7168)
									HitsplatDefinitions.method3851(-402153223);
								Class436.method7313(class282_sub44, (class282_sub44.anInt8063 * 587626901), i_776_, i_777_, i_778_, i_779_, i_774_, i_775_, i_771_, i_772_, (byte) -89);
							}
						}
					}
				}
			}
		}
	}

	public final void method166() {
		if (method4665((byte) 92)) {
			String string = "";
			Class358[] class358s = Class153.method2619(-239279481);
			for (int i = 0; i < class358s.length; i++) {
				Class358 class358 = class358s[i];
				String string_1158_ = Class282_Sub44.anApplet8065.getParameter(class358.aString4159);
				if (null != string_1158_) {
					switch (Integer.parseInt(class358.aString4159)) {
					case 13:
						Class464.aString5555 = string_1158_;
						break;
					case 4:
						aString7156 = string_1158_;
						if (aString7156.length() > 100)
							aString7156 = null;
						break;
					case 5:
						if (Class448.aClass450_5424 == null)
							Class448.aClass450_5424 = new Class450();
						Class448.aClass450_5424.aString5433 = string_1158_;
						break;
					case 9:
						if (string_1158_.equalsIgnoreCase(Class2.aString13))
							aBool7310 = true;
						else
							aBool7310 = false;
						break;
					case 3:
						aString7165 = string_1158_;
						break;
					case 1:
						if (null != string_1158_) {
							aByteArray7152 = (Class378.method6436(Class75.method1353(string_1158_, -808427320), -1465976305));
							if (aByteArray7152.length < 16)
								aByteArray7152 = null;
						}
						break;
					case 17:
						aString7164 = string_1158_;
						break;
					case 31:
						Class223.CURRENT_LANGUAGE = Language.method8278(Integer.parseInt(string_1158_), 922881218);
						break;
					case 2:
						if (string_1158_.equalsIgnoreCase(Class2.aString13))
							aBool7158 = true;
						else
							aBool7158 = false;
						break;
					case 12:
						break;
					case 28:
						if (string_1158_.equals(Class2.aString13))
							aBool7189 = true;
						else
							aBool7189 = false;
						break;
					case 29:
						if (string_1158_.equals(Class2.aString13))
							aBool7151 = true;
						else
							aBool7151 = false;
						break;
					case 27:
						anInt7163 = Integer.parseInt(string_1158_) * -874138425;
						break;
					case 21:
						break;
					case 20:
						aString7157 = string_1158_;
						break;
					case 8:
						CURRENT_GAME = IncomingPacket.method6376(Integer.parseInt(string_1158_), 265812512);
						break;
					case 25:
						if (string_1158_.equalsIgnoreCase(Class2.aString13))
							aBool7159 = true;
						else
							aBool7159 = false;
						break;
					case 14:
						if (Class448.aClass450_5424 == null)
							Class448.aClass450_5424 = new Class450();
						Class448.aClass450_5424.worldId = Integer.parseInt(string_1158_) * -1933199413;
						break;
					case 6:
						TilestreamPacket.anInt4219 = Integer.parseInt(string_1158_) * -37116627;
						break;
					case 34:
						Class445.aString5384 = string_1158_;
						break;
					case 7:
						string = string_1158_;
						break;
					case 23:
						anInt7149 = Integer.parseInt(string_1158_) * 1564360473;
						break;
					case 24:
						Class90.aClass496_952 = ((Class496) Class386.method6672(Class496.method8299(1459523387), Integer.parseInt(string_1158_), -1375315920));
						if (Class496.aClass496_5810 == Class90.aClass496_952)
							Class90.aClass496_952 = Class496.aClass496_5807;
						else if (!Class496.method8308(Class90.aClass496_952, 1812698195) && (Class496.aClass496_5813 != Class90.aClass496_952))
							Class90.aClass496_952 = Class496.aClass496_5813;
						break;
					case 26:
						aLong7153 = (Long.parseLong(string_1158_) * -5626745816563543837L);
						break;
					case 30:
						RenderAnimDefs.anInt2831 = Integer.parseInt(string_1158_) * -917544917;
						break;
					case 33:
						aString7281 = string_1158_;
						break;
					case 11:
						if (string_1158_.equalsIgnoreCase(Class2.aString13))
							aBool7161 = true;
						else
							aBool7161 = false;
						break;
					default:
						Class151.method2594("", new RuntimeException(), (byte) -45);
						break;
					case 32:
						RegionMap.aString3643 = string_1158_;
						break;
					case 22:
						if (string_1158_.equalsIgnoreCase(Class2.aString13))
							aBool7160 = true;
						else
							aBool7160 = false;
						break;
					case 15:
						Class176.aClass472_2201 = Class182.method3040(Integer.parseInt(string_1158_), (byte) -45);
						if (Class176.aClass472_2201 != Class472.aClass472_5599 && (Class472.aClass472_5598 != Class176.aClass472_2201) && (Class176.aClass472_2201 != Class472.aClass472_5596) && (Class176.aClass472_2201 != Class472.aClass472_5600))
							Class176.aClass472_2201 = Class472.aClass472_5600;
						break;
					case 16:
						Class448.aClass450_5420 = new Class450();
						Class448.aClass450_5420.worldId = Integer.parseInt(string_1158_) * -1933199413;
						break;
					case 18:
						if (string_1158_.equalsIgnoreCase(Class2.aString13))
							aBool7316 = true;
						break;
					case 35:
						anInt7447 = Integer.parseInt(string_1158_) * 826882953;
						if (1920182969 * anInt7447 < 0 || (anInt7447 * 1920182969 >= aColorArray7186.length))
							anInt7447 = 0;
						break;
					case 10:
						if (string_1158_.equalsIgnoreCase(Class2.aString13))
							aBool7147 = true;
						else
							aBool7147 = false;
					}
				}
			}
			if (null == aString7281)
				aString7281 = "";
			Class274 class274 = new Class274(150480619 * anInt7439, 1176039023 * anInt7312, anInt7309 * 1226390255, anInt7205 * 429626423, CURRENT_GAME.aString5749);
			Class308.aclient3620 = this;
			String string_1159_ = Class176.aClass472_2201.aString5601;
			int i = -2001827121 * Class176.aClass472_2201.anInt5602 + 32;
			if (!string.equals("")) {
				string_1159_ = new StringBuilder().append(string_1159_).append("_").append(string).toString();
				i = 0;
			}
			method4655(class274, CURRENT_GAME.aString5748, string_1159_, i, Class123.method2149(957345803), 727, 1, aBool7161, 1826658639);
		}
	}

	final void method4762() {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(2074046994) == 2) {
			try {
				method11620(-1556566629);
			} catch (ThreadDeath threaddeath) {
				throw threaddeath;
			} catch (Throwable throwable) {
				Class151.method2594(new StringBuilder().append(throwable.getMessage()).append(" ").append(method4669(1026019021)).toString(), throwable, (byte) -92);
				aBool7171 = true;
				Class538.method11500(0, false, (byte) 24);
			}
		} else
			method11620(-642104427);
	}

	final void method4714(int i) {
		if (aBool7400)
			Class282_Sub11.method12211(-2040156931);
		Class28.method772((byte) 124);
		if (null != Renderers.SOFTWARE_RENDERER)
			Renderers.SOFTWARE_RENDERER.method8396(1980757736);
		if (Class475.aBool5623 && aFrame3260 != null) {
			Class329.method5903(Class274.aClass470_3336, aFrame3260, -1941222213);
			aFrame3260 = null;
		}
		aClass184_7475.method3051((byte) -122);
		((Class184) aClass184_7475).aClass7_2299.method347(-669506484);
		aClass184_7218.method3051((byte) -84);
		((Class184) aClass184_7218).aClass7_2299.method347(1264741540);
		Class278_Sub1.method13449((byte) -20);
		Class119.JS5_STANDARD_REQUESTER.method5525(1906332744);
		Whirlpool.JS5_LOCAL_REQUESTER.method5565((byte) 68);
		if (aClass508_7223 != null) {
			aClass508_7223.method8733(1980974848);
			aClass508_7223 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class176.method2977(1319465646);
		try {
			Class277.method4907(-670567583);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool3259)
			Class480.method8043(-1246779141);
	}

	final void method4676(byte i) {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();
		Class221.aClass118_2763 = new IComponentDefinitions();
		Class532_Sub1.method12840(1319563672);
		Whirlpool.JS5_LOCAL_REQUESTER = new JS5LocalRequester();
		Class119.JS5_STANDARD_REQUESTER = new Class312_Sub1();
		Class239.method4090(new int[] { 20, 260 }, new int[] { 1000, 100 }, -196172746);
		Vector3.method6643(100);
		Quaternion.method6493(10);
		ItemDefinitions.method7141(100, (byte) -39);
		Class282_Sub41_Sub3.method14807(100, -741497337);
		if (Class496.aClass496_5813 != Class90.aClass496_952)
			Class339.aByteArrayArray3986 = new byte[50][];
		Class393.aClass282_Sub54_4783 = Class225_Sub1.method12791(-1043766180);
		if (Class393.aClass282_Sub54_4783.aClass468_Sub3_8199.method12632(100736861) == 1)
			SceneObjectManager.aBool2644 = false;
		if (Class496.aClass496_5813 == Class90.aClass496_952)
			Class448.aClass450_5420.aString5433 = Class282_Sub44.anApplet8065.getCodeBase().getHost();
		else if (Class496.method8308(Class90.aClass496_952, 1661844371)) {
			Class448.aClass450_5420.aString5433 = Class282_Sub44.anApplet8065.getCodeBase().getHost();
			Class448.aClass450_5420.anInt5434 = 1140744768 + -58916693 * Class448.aClass450_5420.worldId;
			Class448.aClass450_5424.anInt5434 = Class448.aClass450_5424.worldId * -58916693 + 1140744768;
			Class448.aClass450_5420.anInt5437 = -1441381029 * Class448.aClass450_5420.worldId + 1250363344;
			Class448.aClass450_5424.anInt5437 = Class448.aClass450_5424.worldId * -1441381029 + 1250363344;
		} else if (Class496.aClass496_5810 == Class90.aClass496_952) {
			Class448.aClass450_5420.aString5433 = Class2.aString19;
			Class448.aClass450_5424.aString5433 = Class2.aString19;
			Class448.aClass450_5420.anInt5434 = -58916693 * Class448.aClass450_5420.worldId + 1140744768;
			Class448.aClass450_5424.anInt5434 = -58916693 * Class448.aClass450_5424.worldId + 1140744768;
			Class448.aClass450_5420.anInt5437 = -1441381029 * Class448.aClass450_5420.worldId + 1250363344;
			Class448.aClass450_5424.anInt5437 = -1441381029 * Class448.aClass450_5424.worldId + 1250363344;
		}
		Class159.aClass450_2010 = Class448.aClass450_5420;
		if (Game.darkan == CURRENT_GAME)
			aBool7372 = false;
		Class455.aShortArray5452 = ObjectDefinitions.aShortArray5691 = NPCDefinitions.aShortArray4862 = ItemDefinitions.staticColorArr256 = new short[256];
		try {
			Class182.aClipboard2263 = Class371.method6354((byte) 1).getToolkit().getSystemClipboard();
		} catch (Exception exception) {
			/* empty */
		}
		Class96_Sub21.aClass199_9438 = Class325.method5787(Class351.gameCanvas, 539499635);
		Class163.aClass209_2031 = FontRenderer.method400(Class351.gameCanvas, true, (byte) -76);
		if (Class496.aClass496_5813 != Class90.aClass496_952)
			aBool7176 = true;
		aString3252 = Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -876841091);
		IndexLoaders.MAP_REGION_LOADER_THREAD = new MapRegionLoaderTask();
		new Thread(IndexLoaders.MAP_REGION_LOADER_THREAD).start();
	}

	final void method4690() {
		if (aBool7400)
			Class282_Sub11.method12211(-2074127322);
		Class28.method772((byte) 94);
		if (null != Renderers.SOFTWARE_RENDERER)
			Renderers.SOFTWARE_RENDERER.method8396(-2758306);
		if (Class475.aBool5623 && aFrame3260 != null) {
			Class329.method5903(Class274.aClass470_3336, aFrame3260, -1141031774);
			aFrame3260 = null;
		}
		aClass184_7475.method3051((byte) -43);
		((Class184) aClass184_7475).aClass7_2299.method347(2071949527);
		aClass184_7218.method3051((byte) -77);
		((Class184) aClass184_7218).aClass7_2299.method347(-1713928547);
		Class278_Sub1.method13449((byte) 10);
		Class119.JS5_STANDARD_REQUESTER.method5525(-411822521);
		Whirlpool.JS5_LOCAL_REQUESTER.method5565((byte) 4);
		if (aClass508_7223 != null) {
			aClass508_7223.method8733(1980974848);
			aClass508_7223 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class176.method2977(510613699);
		try {
			Class277.method4907(-670567583);
		} catch (Exception exception) {
			/* empty */
		}
		if (aBool3259)
			Class480.method8043(-1155407572);
	}

	final void method12044(short i) {
		if (anInt7166 * -1741204137 == 0 && !JS5CacheFile.method3360((byte) -61) || (7 == -1741204137 * anInt7166 && 42 == -1378127363 * Class9.anInt106) || 3 == -1741204137 * anInt7166) {
			if (anInt7178 * -762135173 > 1) {
				anInt7178 -= -1706714701;
				anInt7397 = anInt7347 * 1520234947;
			}
			if (!Class20.aBool161)
				HitsplatDefinitions.method3851(-402153223);
			for (int i_2491_ = 0; (i_2491_ < 100 && Class8_Sub3.method14338(aClass184_7218, (byte) 2)); i_2491_++) {
				/* empty */
			}
		}
		Class84.method1464(490404841);
		RenderAnimIndexLoader.method3630(1475911246);
		anInt7261 += 684988109;
		Class380.method6451(-1, -1, 703434359);
		Class15.method544(null, -1, -1, 404067969);
		Class496.method8315(-2122533779);
		anInt7347 += 1196922783;
		for (int i_2492_ = 0; i_2492_ < 1658163325 * anInt7210; i_2492_++) {
			NPC class521_sub1_sub1_sub2_sub2 = ((NPC) aClass282_Sub47Array7209[i_2492_].anObject8068);
			if (null != class521_sub1_sub1_sub2_sub2) {
				byte i_2493_ = class521_sub1_sub1_sub2_sub2.aClass409_10580.aByte4900;
				if ((i_2493_ & 0x1) != 0) {
					int i_2494_ = class521_sub1_sub1_sub2_sub2.getSize(828768449);
					if ((i_2493_ & 0x2) != 0 && (class521_sub1_sub1_sub2_sub2.anInt10355 * 1871221471) == 0 && Math.random() * 1000.0 < 10.0) {
						int i_2495_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						int i_2496_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						if (i_2495_ != 0 || 0 != i_2496_) {
							int i_2497_ = i_2495_ + (class521_sub1_sub1_sub2_sub2.regionBaseX[0]);
							int i_2498_ = ((class521_sub1_sub1_sub2_sub2.regionBaseY[0]) + i_2496_);
							if (i_2497_ < 0)
								i_2497_ = 0;
							else if (i_2497_ > (IndexLoaders.MAP_REGION_DECODER.getSizeX(1372810716) - i_2494_ - 1))
								i_2497_ = (IndexLoaders.MAP_REGION_DECODER.getSizeX(869728275) - i_2494_ - 1);
							if (i_2498_ < 0)
								i_2498_ = 0;
							else if (i_2498_ > (IndexLoaders.MAP_REGION_DECODER.getSizeY(-158983735) - i_2494_ - 1))
								i_2498_ = (IndexLoaders.MAP_REGION_DECODER.getSizeY(-472284797) - i_2494_ - 1);
							int i_2499_ = (Class112.findRoute((class521_sub1_sub1_sub2_sub2.regionBaseX[0]), (class521_sub1_sub1_sub2_sub2.regionBaseY[0]), i_2494_, Class190.method3150(i_2497_, i_2498_, i_2494_, i_2494_, 0, (byte) 55), (IndexLoaders.MAP_REGION_DECODER.getClipMap(class521_sub1_sub1_sub2_sub2.plane, 1801793645)), true, walkStepsX, walkStepsY, -22174447));
							if (i_2499_ > 0) {
								if (i_2499_ > 9)
									i_2499_ = 9;
								for (int i_2500_ = 0; i_2500_ < i_2499_; i_2500_++) {
									class521_sub1_sub1_sub2_sub2.regionBaseX[i_2500_] = (walkStepsX[i_2499_ - i_2500_ - 1]);
									class521_sub1_sub1_sub2_sub2.regionBaseY[i_2500_] = (walkStepsY[i_2499_ - i_2500_ - 1]);
									class521_sub1_sub1_sub2_sub2.aByteArray10365[i_2500_] = Class249.aClass249_3084.aByte3085;
								}
								class521_sub1_sub1_sub2_sub2.anInt10355 = i_2499_ * -2086688481;
							}
						}
					}
					SystemInfo.method13466(class521_sub1_sub1_sub2_sub2, true, 141891001);
					int i_2501_ = Class427.method7188(class521_sub1_sub1_sub2_sub2, 1919547361);
					WallDecoration.method16087(class521_sub1_sub1_sub2_sub2, -702995784);
					Class302.method5361(class521_sub1_sub1_sub2_sub2, Class44.anInt430 * 1714233093, Class8_Sub1.anInt8515 * -1293360775, i_2501_, 852225468);
					Class236.method3985(class521_sub1_sub1_sub2_sub2, 1714233093 * Class44.anInt430, (byte) -74);
					Class150.method2581(class521_sub1_sub1_sub2_sub2, 818834728);
					Quaternion class381 = Quaternion.create();
					class381.romYawPitchRoll(Class382.method6508(class521_sub1_sub1_sub2_sub2.aClass19_10359.method578((byte) 2)), Class382.method6508(class521_sub1_sub1_sub2_sub2.aClass19_10330.method578((byte) 2)), Class382.method6508(class521_sub1_sub1_sub2_sub2.aClass19_10360.method578((byte) 2)));
					class521_sub1_sub1_sub2_sub2.method11187(class381);
					class381.cache();
				}
			}
		}
		if ((5 == anInt7166 * -1741204137 || -1741204137 * anInt7166 == 7 || -1741204137 * anInt7166 == 0 || -1741204137 * anInt7166 == 3) && (!JS5CacheFile.method3360((byte) 40) || (anInt7166 * -1741204137 == 7 && 42 == -1378127363 * Class9.anInt106)) && !Class85.method1466(787262715)) {
			if (NativeLibraryLoader.anInt3240 * -672443707 == 5)
				Wall.method16113(70521151);
			else
				SpotAnimIndexLoader.method8860((byte) -121);
			if (-360258135 * Class31.anInt361 >> 9 < 14 || (-360258135 * Class31.anInt361 >> 9 >= IndexLoaders.MAP_REGION_DECODER.getSizeX(676914845) - 14) || 413271601 * Class246.anInt3029 >> 9 < 14 || (Class246.anInt3029 * 413271601 >> 9 >= IndexLoaders.MAP_REGION_DECODER.getSizeY(-1158968215) - 14))
				IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3154, null), 919170648);
		}
		for (;;) {
			HookRequest class282_sub43 = (HookRequest) aClass482_7233.method8061((byte) -106);
			if (null == class282_sub43)
				break;
			IComponentDefinitions class118 = class282_sub43.iComponentDefs;
			if (1924549737 * class118.anInt1288 >= 0) {
				IComponentDefinitions class118_2502_ = Class117.method1981(2110532063 * class118.anInt1305, (byte) 83);
				if (class118_2502_ == null || null == class118_2502_.aClass118Array1438 || (1924549737 * class118.anInt1288 >= class118_2502_.aClass118Array1438.length) || class118 != (class118_2502_.aClass118Array1438[1924549737 * class118.anInt1288]))
					continue;
			}
			Class96_Sub4.executeHookInner200k(class282_sub43, 60192385);
		}
		for (;;) {
			HookRequest class282_sub43 = (HookRequest) aClass482_7404.method8061((byte) -51);
			if (class282_sub43 == null)
				break;
			IComponentDefinitions class118 = class282_sub43.iComponentDefs;
			if (1924549737 * class118.anInt1288 >= 0) {
				IComponentDefinitions class118_2503_ = Class117.method1981(2110532063 * class118.anInt1305, (byte) 126);
				if (null == class118_2503_ || class118_2503_.aClass118Array1438 == null || (class118.anInt1288 * 1924549737 >= class118_2503_.aClass118Array1438.length) || class118 != (class118_2503_.aClass118Array1438[class118.anInt1288 * 1924549737]))
					continue;
			}
			Class96_Sub4.executeHookInner200k(class282_sub43, 433740759);
		}
		for (;;) {
			HookRequest class282_sub43 = (HookRequest) aClass482_7402.method8061((byte) -66);
			if (class282_sub43 == null)
				break;
			IComponentDefinitions class118 = class282_sub43.iComponentDefs;
			if (class118.anInt1288 * 1924549737 >= 0) {
				IComponentDefinitions class118_2504_ = Class117.method1981(class118.anInt1305 * 2110532063, (byte) 6);
				if (null == class118_2504_ || class118_2504_.aClass118Array1438 == null || (1924549737 * class118.anInt1288 >= class118_2504_.aClass118Array1438.length) || (class118_2504_.aClass118Array1438[class118.anInt1288 * 1924549737]) != class118)
					continue;
			}
			Class96_Sub4.executeHookInner200k(class282_sub43, 970362287);
		}
		if (aClass118_7257 != null)
			Class161.method2827(1986248750);
		if (0 == cycles * -1809259861 % 1500)
			Class60.method1172(-1916310321);
		if (-1741204137 * anInt7166 == 0 && !JS5CacheFile.method3360((byte) 10) || (anInt7166 * -1741204137 == 7 && 42 == -1378127363 * Class9.anInt106))
			Class461.method7703(-1982488660);
		Class449.method7490((byte) -9);
		if (aBool7400 && (aLong7401 * -7566578057014918599L < Class169.method2869(1901695622) - 60000L))
			Class282_Sub11.method12211(133515669);
		for (Class275_Sub4 class275_sub4 = (Class275_Sub4) aClass457_7350.method7659(301908602); null != class275_sub4; class275_sub4 = (Class275_Sub4) aClass457_7350.method7650((byte) 99)) {
			if ((long) (((Class275_Sub4) class275_sub4).anInt7838 * 478251145) < Class169.method2869(1872640380) / 1000L - 5L) {
				if (((Class275_Sub4) class275_sub4).aShort7839 > 0)
					Class191.method3167(5, 0, "", "", "", new StringBuilder().append(((Class275_Sub4) class275_sub4).aString7837).append(Message.HAS_LOGGED_IN.translate(Class223.CURRENT_LANGUAGE, -1495775612)).toString(), 1096465682);
				if (0 == ((Class275_Sub4) class275_sub4).aShort7839)
					Class191.method3167(5, 0, "", "", "", new StringBuilder().append(((Class275_Sub4) class275_sub4).aString7837).append(Message.HAS_LOGGED_OUT.translate(Class223.CURRENT_LANGUAGE, -737324095)).toString(), 1209993360);
				class275_sub4.method4887((byte) -82);
			}
		}
		if (0 == -1741204137 * anInt7166 && !JS5CacheFile.method3360((byte) 17) || (7 == -1741204137 * anInt7166 && -1378127363 * Class9.anInt106 == 42) || -1741204137 * anInt7166 == 3) {
			if (anInt7166 * -1741204137 != 7 && aClass184_7218.method3053((byte) -22) == null)
				Class438.method7333(false, 2142128542);
			else if (aClass184_7218 != null) {
				aClass184_7218.anInt2290 += 352048501;
				if (804033245 * aClass184_7218.anInt2290 > 50) {
					TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.KEEP_ALIVE, aClass184_7218.isaac, 241462938);
					aClass184_7218.method3049(class282_sub23, -494100424);
				}
				try {
					aClass184_7218.method3047(1630204206);
				} catch (IOException ioexception) {
					if (7 == anInt7166 * -1741204137)
						aClass184_7218.method3051((byte) -106);
					else
						Class438.method7333(false, 2058327064);
				}
			}
		}
	}

	public final void method165() {
		if (method4665((byte) 79)) {
			String string = "";
			Class358[] class358s = Class153.method2619(1235722465);
			for (int i = 0; i < class358s.length; i++) {
				Class358 class358 = class358s[i];
				String string_2650_ = Class282_Sub44.anApplet8065.getParameter(class358.aString4159);
				if (null != string_2650_) {
					switch (Integer.parseInt(class358.aString4159)) {
					case 13:
						Class464.aString5555 = string_2650_;
						break;
					case 4:
						aString7156 = string_2650_;
						if (aString7156.length() > 100)
							aString7156 = null;
						break;
					case 5:
						if (Class448.aClass450_5424 == null)
							Class448.aClass450_5424 = new Class450();
						Class448.aClass450_5424.aString5433 = string_2650_;
						break;
					case 9:
						if (string_2650_.equalsIgnoreCase(Class2.aString13))
							aBool7310 = true;
						else
							aBool7310 = false;
						break;
					case 3:
						aString7165 = string_2650_;
						break;
					case 1:
						if (null != string_2650_) {
							aByteArray7152 = (Class378.method6436(Class75.method1353(string_2650_, -808427320), -2067601059));
							if (aByteArray7152.length < 16)
								aByteArray7152 = null;
						}
						break;
					case 17:
						aString7164 = string_2650_;
						break;
					case 31:
						Class223.CURRENT_LANGUAGE = Language.method8278(Integer.parseInt(string_2650_), -1464008019);
						break;
					case 2:
						if (string_2650_.equalsIgnoreCase(Class2.aString13))
							aBool7158 = true;
						else
							aBool7158 = false;
						break;
					case 12:
						break;
					case 28:
						if (string_2650_.equals(Class2.aString13))
							aBool7189 = true;
						else
							aBool7189 = false;
						break;
					case 29:
						if (string_2650_.equals(Class2.aString13))
							aBool7151 = true;
						else
							aBool7151 = false;
						break;
					case 27:
						anInt7163 = Integer.parseInt(string_2650_) * -874138425;
						break;
					case 21:
						break;
					case 20:
						aString7157 = string_2650_;
						break;
					case 8:
						CURRENT_GAME = IncomingPacket.method6376(Integer.parseInt(string_2650_), 265812512);
						break;
					case 25:
						if (string_2650_.equalsIgnoreCase(Class2.aString13))
							aBool7159 = true;
						else
							aBool7159 = false;
						break;
					case 14:
						if (Class448.aClass450_5424 == null)
							Class448.aClass450_5424 = new Class450();
						Class448.aClass450_5424.worldId = Integer.parseInt(string_2650_) * -1933199413;
						break;
					case 6:
						TilestreamPacket.anInt4219 = Integer.parseInt(string_2650_) * -37116627;
						break;
					case 34:
						Class445.aString5384 = string_2650_;
						break;
					case 7:
						string = string_2650_;
						break;
					case 23:
						anInt7149 = Integer.parseInt(string_2650_) * 1564360473;
						break;
					case 24:
						Class90.aClass496_952 = ((Class496) Class386.method6672(Class496.method8299(1459523387), Integer.parseInt(string_2650_), -1989115689));
						if (Class496.aClass496_5810 == Class90.aClass496_952)
							Class90.aClass496_952 = Class496.aClass496_5807;
						else if (!Class496.method8308(Class90.aClass496_952, 1676029063) && (Class496.aClass496_5813 != Class90.aClass496_952))
							Class90.aClass496_952 = Class496.aClass496_5813;
						break;
					case 26:
						aLong7153 = (Long.parseLong(string_2650_) * -5626745816563543837L);
						break;
					case 30:
						RenderAnimDefs.anInt2831 = Integer.parseInt(string_2650_) * -917544917;
						break;
					case 33:
						aString7281 = string_2650_;
						break;
					case 11:
						if (string_2650_.equalsIgnoreCase(Class2.aString13))
							aBool7161 = true;
						else
							aBool7161 = false;
						break;
					default:
						Class151.method2594("", new RuntimeException(), (byte) -46);
						break;
					case 32:
						RegionMap.aString3643 = string_2650_;
						break;
					case 22:
						if (string_2650_.equalsIgnoreCase(Class2.aString13))
							aBool7160 = true;
						else
							aBool7160 = false;
						break;
					case 15:
						Class176.aClass472_2201 = Class182.method3040(Integer.parseInt(string_2650_), (byte) -42);
						if (Class176.aClass472_2201 != Class472.aClass472_5599 && (Class472.aClass472_5598 != Class176.aClass472_2201) && (Class176.aClass472_2201 != Class472.aClass472_5596) && (Class176.aClass472_2201 != Class472.aClass472_5600))
							Class176.aClass472_2201 = Class472.aClass472_5600;
						break;
					case 16:
						Class448.aClass450_5420 = new Class450();
						Class448.aClass450_5420.worldId = Integer.parseInt(string_2650_) * -1933199413;
						break;
					case 18:
						if (string_2650_.equalsIgnoreCase(Class2.aString13))
							aBool7316 = true;
						break;
					case 35:
						anInt7447 = Integer.parseInt(string_2650_) * 826882953;
						if (1920182969 * anInt7447 < 0 || (anInt7447 * 1920182969 >= aColorArray7186.length))
							anInt7447 = 0;
						break;
					case 10:
						if (string_2650_.equalsIgnoreCase(Class2.aString13))
							aBool7147 = true;
						else
							aBool7147 = false;
					}
				}
			}
			if (null == aString7281)
				aString7281 = "";
			Class274 class274 = new Class274(150480619 * anInt7439, 1176039023 * anInt7312, anInt7309 * 1226390255, anInt7205 * 429626423, CURRENT_GAME.aString5749);
			Class308.aclient3620 = this;
			String string_2651_ = Class176.aClass472_2201.aString5601;
			int i = -2001827121 * Class176.aClass472_2201.anInt5602 + 32;
			if (!string.equals("")) {
				string_2651_ = new StringBuilder().append(string_2651_).append("_").append(string).toString();
				i = 0;
			}
			method4655(class274, CURRENT_GAME.aString5748, string_2651_, i, Class123.method2149(957345803), 727, 1, aBool7161, -187113750);
		}
	}

	static final void method12073(int i, int i_2653_, int i_2654_) {
		if (Game.stellarDawn != CURRENT_GAME) {
			if (!MapRegion.routeTo(i, i_2653_, false, Class371.method6352(i, i_2653_, 1, 1, -1423689712), 928803696))
				MapRegion.routeTo(i, i_2653_, false, Class344.method6115(i, i_2653_, 1, 1, 0, 971339209), 1252373974);
		} else if (!MapRegion.routeTo(i, i_2653_, false, Class344.method6115(i, i_2653_, 1, 1, 0, 971339209), 1016386097))
			MapRegion.routeTo(i, i_2653_, false, Class371.method6352(i, i_2653_, 1, 1, -1013496612), 1340706039);
	}
}
