import jaclib.ping.Ping;
import net.arikia.dev.drpc.DiscordRichPresence;

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

public final class client extends Engine {

	public static Game CURRENT_GAME = null;
	public static boolean aBool7310 = false;
	static boolean aBool7147 = false;
	static String aString7281 = null;
	public static int anInt7149 = 0;
	public static int anInt7447 = 0;
	public static boolean aBool7151 = false;
	public static byte[] aByteArray7152 = null;
	public static long aLong7153 = 0L;
	public static boolean aBool7465 = false;
	public static boolean aBool7155 = false;
	static String aString7156 = null;
	public static String aString7157 = null;
	public static boolean aBool7158 = false;
	public static boolean aBool7159 = false;
	static boolean aBool7160 = false;
	static boolean aBool7161 = false;
	public static int anInt7162 = 0;
	static int anInt7163 = -1;
	static String aString7164 = null;
	public static String aString7165 = null;
	public static int gameState = 4;
	static Matrix44Arr aClass384_7167 = new Matrix44Arr();
	static Matrix44Var aClass294_7457 = new Matrix44Var();
	static Matrix44Var aClass294_7169 = new Matrix44Var();
	static long aLong7170 = 0L;
	public static boolean aBool7171 = false;
	static boolean aBool7172 = true;
	public static int anInt7173 = 0;
	public static int cycles = 0;
	public static boolean aBool7175 = true;
	static boolean aBool7176 = false;
	static boolean aBool7177 = false;
	public static int anInt7178 = 0;
	public static Class180[] aClass180Array7348 = new Class180[8];
	public static Class281[] aClass281Array7180 = new Class281[9];
	public static boolean aBool7219 = false;
	static boolean aBool7241 = false;
	static boolean aBool7372 = true;
	static long aLong7409 = (long) (Math.random() * 9.999999999E9D);
	public static boolean aBool7185 = false;
	public static int anInt7240 = 0;
	public static boolean aBool7393 = false;
	static int anInt7396 = 0;
	public static boolean aBool7189 = false;
	public static NodeCollection mouseRecords = new NodeCollection();
	static int anInt7191 = 0;
	public static int anInt7193 = 0;
	public static KeyRecord[] KEYS_PRESSED = new KeyRecord[131];
	public static int maximumHeldKeys = 0;
	public static KeyRecord[] anInterface16Array7298 = new KeyRecord[75];
	public static Color[] aColorArray7186 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };
	public static Color[] aColorArray7199 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };
	public static Color[] aColorArray7200 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };
	static int updateStage = 0;
	static int anInt7202 = 0;
	static int anInt7232 = 0;
	static SoftCache aClass229_7204 = new SoftCache(8);
	static String aString7463 = null;
	public static Interface35 anInterface35_7206 = new Class15();
	public static IterableNodeMap NPCS = new IterableNodeMap(64);
	public static Class282_Sub47[] aClass282_Sub47Array7209 = new Class282_Sub47[1024];
	public static int anInt7210 = 0;
	public static int NPC_UPDATE_INDEX = 0;
	public static int[] NPC_UPDATE_INDICES = new int[1024];
	static int npcListSize = 0;
	static int[] NPC_INDICES = new int[261];
	static int anInt7332 = 0;
	static int anInt7216 = 0;
	static int[] anIntArray7421 = new int[1005];
	public static BufferedConnectionContext connectionContext = new BufferedConnectionContext();
	public static BufferedConnectionContext aClass184_7475 = new BufferedConnectionContext();
	public static BufferedConnectionContext[] aClass184Array7220;
	static int anInt7221;
	static boolean aBool7459;
	public static Class508 aClass508_7223;
	public static volatile boolean aBool7225;
	public static Object anObject7226;
	public static Object anObject7227;
	public static int[] anIntArray7228;
	public static int anInt7234;
	public static int[] anIntArray7230;
	public static int CURRENT_CUTSCENE;
	public static int anInt7341;
	public static boolean aBool7321;
	static int anInt7357;
	static int anInt7235;
	public static int anInt7236;
	public static int anInt7237;
	public static int anInt7238;
	public static int anInt7377;
	public static int anInt7413;
	public static int anInt7217;
	static int[] anIntArray7243;
	static int[] anIntArray7425;
	static int[] walkStepsX;
	static int[] walkStepsY;
	static int[] NPC_TURN_DIRECTIONS;
	static int anInt7248;
	static int anInt7249;
	static int anInt7250;
	static int anInt7251;
	static int anInt7343;
	static int anInt7253;
	static int anInt7418;
	static int anInt7255;
	static int anInt7187;
	static int anInt7203;
	static int anInt7258;
	static int anInt7259;
	static Random aRandom7260;
	static int anInt7261;
	public static int anInt7262;
	public static int anInt7376;
	public static float aFloat7146;
	public static float aFloat7365;
	static float aFloat7266;
	static float aFloat7284;
	static boolean aBool7331;
	static boolean aBool7269;
	public static int anInt7270;
	public static int anInt7271;
	public static boolean aBool7371;
	static int anInt7273;
	public static int[][][] anIntArrayArrayArray7302;
	public static int anInt7277;
	public static int anInt7448;
	public static int anInt7279;
	public static int anInt7280;
	public static int anInt7256;
	public static int anInt7327;
	public static int anInt7182;
	static boolean aBool7355;
	static boolean aBool7285;
	public static int anInt7286;
	static int[] anIntArray7287;
	static int[] anIntArray7288;
	static int anInt7304;
	static EntityList aClass457_7290;
	static int anInt7291;
	public static float[] aFloatArray7292;
	static int anInt7293;
	static int anInt7294;
	static int anInt7295;
	static int anInt7296;
	static int anInt7297;
	static int anInt7472;
	static int[] anIntArray7198;
	static int[] anIntArray7303;
	static int[] anIntArray7194;
	static int[] anIntArray7305;
	static int[] anIntArray7306;
	static long aLong7307;
	static boolean resizeableScreen;
	static int anInt7309;
	static int anInt7205;
	public static int anInt7439;
	public static int anInt7312;
	public static Player[] players;
	public static int anInt7315;
	public static boolean aBool7316;
	public static boolean membersWorld;
	public static int rights;
	public static int anInt7319;
	public static boolean aBool7224;
	public static boolean aBool7244;
	static boolean aBool7322;
	public static boolean aBool7323;
	static boolean aBool7454;
	public static boolean aBool7325;
	static short[] aShortArray7239;
	static int[] PLAYER_OPTION_CURSORS;
	static String[] PLAYER_OPTIONS;
	static boolean[] PLAYER_OPTION_REDUCED_PRIORITY;
	static int anInt7311;
	public static IterableNodeMap aClass465_7414;
	public static NodeCollection aClass482_7333;
	public static IterableNodeMap aClass465_7334;
	public static EntityList aClass457_7335;
	public static int[] anIntArray7336;
	public static int[] anIntArray7337;
	public static int[] anIntArray7338;
	static int anInt7339;
	public static int anInt7340;
	static int anInt7427;
	public static int anInt7342;
	public static int anInt7190;
	public static boolean aBool7344;
	static int anInt7345;
	static int anInt7346;
	public static String aString7275;
	public static String aString7356;
	public static volatile int anInt7349;
	public static IterableNodeMap aClass465_7442;
	static int anInt7351;
	public static IComponentDefinitions aClass118_7352;
	public static int anInt7300;
	public static int anInt7354;
	static boolean aBool7168;
	static boolean aBool7264;
	public static IComponentDefinitions aClass118_7183;
	static boolean aBool7358;
	static IComponentDefinitions aClass118_7257;
	static IComponentDefinitions aClass118_7247;
	static int anInt7361;
	static int anInt7362;
	static IComponentDefinitions aClass118_7370;
	static boolean aBool7403;
	static int anInt7432;
	static int anInt7265;
	static int anInt7367;
	static int anInt7476;
	static boolean aBool7369;
	static int anInt7252;
	static int anInt7215;
	static boolean aBool7364;
	static int anInt7184;
	static boolean aBool7374;
	static boolean aBool7375;
	public static int anInt7347;
	static int[] anIntArray7379;
	static int anInt7453;
	static int[] anIntArray7381;
	static int anInt7382;
	static int[] anIntArray7283;
	static int anInt7384;
	static int[] anIntArray7150;
	static int anInt7368;
	static int[] anIntArray7387;
	static int anInt7388;
	static int[] CLAN_VAR_KEYS;
	static int CLAN_VAR_COUNTER;
	public static int anInt7391;
	static int anInt7386;
	static int anInt7179;
	static int anInt7192;
	static int anInt7395;
	static int anInt7320;
	static int anInt7397;
	public static int anInt7399;
	public static boolean aBool7400;
	static long aLong7401;
	public static NodeCollection aClass482_7402;
	static NodeCollection aClass482_7233;
	static NodeCollection aClass482_7404;
	static IterableNodeMap ICOMPONENT_SETTINGS_SLOTS;
	static int anInt7407;
	static int anInt7408;
	public static boolean[] aBoolArray7443;
	static boolean[] aBoolArray7410;
	static Rectangle[] aRectangleArray7411;
	static int anInt7412;
	static int[] anIntArray7438;
	static int anInt7415;
	static int anInt7366;
	static int[] anIntArray7420;
	static int[] anIntArray7417;
	static int[] anIntArray7263;
	static Class163[] aClass163Array7419;
	static int[] anIntArray7148;
	public static int anInt7416;
	public static int anInt7422;
	static long[] aLongArray7424;
	static int anInt7389;
	public static String aString7426;
	public static String aString7359;
	public static GrandExchangeSlot[] GRAND_EXCHANGE_SLOTS;
	static int anInt7429;
	static boolean[] aBoolArray7431;
	static int[] anIntArray7268;
	static int[] anIntArray7433;
	static int[] anIntArray7462;
	static int[] anIntArray7435;
	public static short aShort7436;
	public static short aShort7437;
	public static short aShort7394;
	public static short aShort7324;
	public static short aShort7276;
	public static short aShort7441;
	public static short aShort7214;
	public static short aShort7474;
	static int anInt7444;
	static int anInt7445;
	public static int anInt7188;
	public static int anInt7440;
	static int anInt7451;
	public static int anInt7449;
	public static int anInt7434;
	public static Class6[] aClass6Array7452;
	static EntityList aClass457_7350;
	public static int anInt7373;
	public static Class10[] aClass10Array7456;
	static Calendar aCalendar7278;
	public static byte aByte7458;
	public static Interface25 anInterface25_7446;
	static int[] anIntArray7461;
	public static Object presence;
	
	public static DiscordRichPresence getPresence() {
		try {
			return (DiscordRichPresence) presence;
		} catch (Exception e) {
			return null;
		}
	}

	static {
		aClass184Array7220 = new BufferedConnectionContext[] { aClass184_7475, connectionContext };
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
		CURRENT_CUTSCENE = -1;
		anInt7341 = 1;
		aBool7321 = false;
		anInt7357 = -1;
		anInt7235 = 0;
		anInt7236 = -1;
		anInt7237 = -1;
		anInt7238 = 255;
		anInt7377 = 0;
		anInt7413 = 0;
		anInt7217 = 0;
		anIntArray7243 = new int[4096];
		anIntArray7425 = new int[4096];
		walkStepsX = new int[50];
		walkStepsY = new int[50];
		NPC_TURN_DIRECTIONS = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
		anInt7248 = 0;
		anInt7249 = 2;
		anInt7250 = 0;
		anInt7251 = 2;
		anInt7343 = 0;
		anInt7253 = 1;
		anInt7418 = 0;
		anInt7255 = 0;
		anInt7187 = 2;
		anInt7203 = 0;
		anInt7258 = 1;
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
		anInt7270 = 46;
		anInt7271 = anInt7270 + 800;
		aBool7371 = true;
		anInt7273 = 0;
		anIntArrayArrayArray7302 = new int[2][][];
		anInt7277 = -1;
		anInt7448 = -1;
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
		aClass457_7290 = new EntityList();
		anInt7291 = 0;
		aFloatArray7292 = new float[3];
		anInt7293 = 0;
		anInt7294 = 0;
		anInt7295 = 0;
		anInt7296 = 0;
		anInt7297 = 0;
		anInt7472 = -1;
		anIntArray7198 = new int[2];
		anIntArray7303 = new int[2];
		anIntArray7194 = new int[2];
		anIntArray7305 = new int[2];
		anIntArray7306 = new int[2];
		aLong7307 = 0L;
		resizeableScreen = true;
		anInt7309 = 32;
		anInt7205 = 16;
		anInt7439 = 765;
		anInt7312 = 553;
		players = new Player[2048];
		anInt7315 = -1;
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
		aShortArray7239 = new short[] { (short) 44, (short) 45, (short) 46, (short) 47, (short) 48, (short) 49, (short) 50, (short) 51 };
		PLAYER_OPTION_CURSORS = new int[8];
		PLAYER_OPTIONS = new String[8];
		PLAYER_OPTION_REDUCED_PRIORITY = new boolean[8];
		anInt7311 = -1;
		aClass465_7414 = new IterableNodeMap(64);
		aClass482_7333 = new NodeCollection();
		aClass465_7334 = new IterableNodeMap(16);
		aClass457_7335 = new EntityList();
		anIntArray7336 = new int[25];
		anIntArray7337 = new int[25];
		anIntArray7338 = new int[25];
		anInt7339 = 0;
		anInt7340 = -1;
		anInt7427 = -1;
		anInt7342 = -1;
		anInt7190 = -1;
		aBool7344 = false;
		anInt7345 = -1;
		anInt7346 = -1;
		aString7275 = null;
		aString7356 = null;
		anInt7349 = -1;
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
		anInt7432 = -1;
		anInt7265 = -1;
		anInt7367 = -1;
		anInt7476 = -1;
		aBool7369 = false;
		anInt7252 = -1;
		anInt7215 = -1;
		aBool7364 = false;
		anInt7184 = 0;
		aBool7374 = false;
		aBool7375 = false;
		anInt7347 = 1;
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
		CLAN_VAR_KEYS = new int[32];
		CLAN_VAR_COUNTER = 0;
		anInt7391 = 0;
		anInt7386 = 0;
		anInt7179 = 0;
		anInt7192 = 0;
		anInt7395 = 0;
		anInt7320 = 0;
		anInt7397 = 0;
		anInt7399 = 0;
		aBool7400 = false;
		aLong7401 = -1L;
		aClass482_7402 = new NodeCollection();
		aClass482_7233 = new NodeCollection();
		aClass482_7404 = new NodeCollection();
		ICOMPONENT_SETTINGS_SLOTS = new IterableNodeMap(512);
		anInt7407 = 0;
		anInt7408 = -2;
		aBoolArray7443 = new boolean[107];
		aBoolArray7410 = new boolean[107];
		aRectangleArray7411 = new Rectangle[107];

		for (int i_0 = 0; i_0 < 107; i_0++) {
			aRectangleArray7411[i_0] = new Rectangle();
		}

		anInt7412 = 0;
		anIntArray7438 = new int[4];
		anInt7415 = 0;
		anInt7366 = 51;
		anIntArray7420 = new int[anInt7366];
		anIntArray7417 = new int[anInt7366];
		anIntArray7263 = new int[anInt7366];
		aClass163Array7419 = new Class163[anInt7366];
		anIntArray7148 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		anInt7416 = 0;
		anInt7422 = 0;
		aLongArray7424 = new long[100];
		anInt7389 = 0;
		aString7426 = null;
		aString7359 = null;
		GRAND_EXCHANGE_SLOTS = new GrandExchangeSlot[6];
		anInt7429 = 0;
		aBoolArray7431 = new boolean[5];
		anIntArray7268 = new int[5];
		anIntArray7433 = new int[5];
		anIntArray7462 = new int[5];
		anIntArray7435 = new int[5];
		aShort7436 = 256;
		aShort7437 = 205;
		aShort7394 = 256;
		aShort7324 = 320;
		aShort7276 = 1;
		aShort7441 = 32767;
		aShort7214 = 1;
		aShort7474 = 32767;
		anInt7444 = 0;
		anInt7445 = 0;
		anInt7188 = 0;
		anInt7440 = 0;
		anInt7451 = 0;
		anInt7449 = 0;
		anInt7434 = 0;
		aClass6Array7452 = new Class6[200];
		aClass457_7350 = new EntityList();
		anInt7373 = 0;
		aClass10Array7456 = new Class10[100];
		aCalendar7278 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		aByte7458 = -6;
		anInterface25_7446 = new Class17();
		anIntArray7461 = new int[4];
	}

	public final void init() {
		if (this.method4665((byte) 80)) {
			String str_1 = "";
			Class358[] arr_2 = Class153.method2619(860702591);

			for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
				Class358 class358_4 = arr_2[i_3];
				String string_7 = Class282_Sub44.anApplet8065.getParameter(class358_4.aString4159);
				if (string_7 != null) {
					switch (Integer.parseInt(class358_4.aString4159)) {
					case 1:
						if (string_7 != null) {
							aByteArray7152 = Class378.method6436(CutsceneEntity.method1353(string_7), -634179594);
							if (aByteArray7152.length < 16) {
								aByteArray7152 = null;
							}
						}
						break;
					case 2:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7158 = true;
						} else {
							aBool7158 = false;
						}
						break;
					case 3:
						aString7165 = string_7;
						break;
					case 4:
						aString7156 = string_7;
						if (aString7156.length() > 100) {
							aString7156 = null;
						}
						break;
					case 5:
						if (Class448.lobbyConnectionInfo == null) {
							Class448.lobbyConnectionInfo = new ConnectionInfo();
						}

						Class448.lobbyConnectionInfo.host = string_7;
						break;
					case 6:
						TilestreamPacket.anInt4219 = Integer.parseInt(string_7);
						break;
					case 7:
						str_1 = string_7;
						break;
					case 8:
						CURRENT_GAME = IncomingPacket.method6376(Integer.parseInt(string_7));
						break;
					case 9:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7310 = true;
						} else {
							aBool7310 = false;
						}
						break;
					case 10:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7147 = true;
						} else {
							aBool7147 = false;
						}
						break;
					case 11:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7161 = true;
						} else {
							aBool7161 = false;
						}
					case 12:
					case 21:
						break;
					case 13:
						Class464.aString5555 = string_7;
						break;
					case 14:
						if (Class448.lobbyConnectionInfo == null) {
							Class448.lobbyConnectionInfo = new ConnectionInfo();
						}

						Class448.lobbyConnectionInfo.worldId = Integer.parseInt(string_7);
						break;
					case 15:
						Class176.aClass472_2201 = Class182.method3040(Integer.parseInt(string_7), (byte) -28);
						if (Class176.aClass472_2201 != Class472.aClass472_5599 && Class472.aClass472_5598 != Class176.aClass472_2201 && Class176.aClass472_2201 != Class472.aClass472_5596 && Class176.aClass472_2201 != Class472.aClass472_5600) {
							Class176.aClass472_2201 = Class472.aClass472_5600;
						}
						break;
					case 16:
						Class448.aClass450_5420 = new ConnectionInfo();
						Class448.aClass450_5420.worldId = Integer.parseInt(string_7);
						break;
					case 17:
						aString7164 = string_7;
						break;
					case 18:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7316 = true;
						}
						break;
					case 19:
					default:
						Class151.method2594("", new RuntimeException(), (byte) -14);
						break;
					case 20:
						aString7157 = string_7;
						break;
					case 22:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7160 = true;
						} else {
							aBool7160 = false;
						}
						break;
					case 23:
						anInt7149 = Integer.parseInt(string_7);
						break;
					case 24:
						HDWaterTile.aClass496_952 = (Class496) Class386.identify(Class496.method8299(), Integer.parseInt(string_7));
						if (Class496.aClass496_5810 == HDWaterTile.aClass496_952) {
							HDWaterTile.aClass496_952 = Class496.aClass496_5807;
						} else if (!Class496.method8308(HDWaterTile.aClass496_952, 1201911871) && Class496.aClass496_5813 != HDWaterTile.aClass496_952) {
							HDWaterTile.aClass496_952 = Class496.aClass496_5813;
						}
						break;
					case 25:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7159 = true;
						} else {
							aBool7159 = false;
						}
						break;
					case 26:
						aLong7153 = Long.parseLong(string_7);
						break;
					case 27:
						anInt7163 = Integer.parseInt(string_7);
						break;
					case 28:
						if (string_7.equals("true")) {
							aBool7189 = true;
						} else {
							aBool7189 = false;
						}
						break;
					case 29:
						if (string_7.equals("true")) {
							aBool7151 = true;
						} else {
							aBool7151 = false;
						}
						break;
					case 30:
						RenderAnimDefs.anInt2831 = Integer.parseInt(string_7);
						break;
					case 31:
						Class223.CURRENT_LANGUAGE = Language.method8278(Integer.parseInt(string_7), 1916155090);
						break;
					case 32:
						RegionMap.aString3643 = string_7;
						break;
					case 33:
						aString7281 = string_7;
						break;
					case 34:
						Class445.aString5384 = string_7;
						break;
					case 35:
						anInt7447 = Integer.parseInt(string_7);
						if (anInt7447 < 0 || anInt7447 >= aColorArray7186.length) {
							anInt7447 = 0;
						}
					}
				}
			}

			if (aString7281 == null) {
				aString7281 = "";
			}

			Class274 class274_6 = new Class274(anInt7439, anInt7312, anInt7309, anInt7205, CURRENT_GAME.aString5749);
			Class308.aclient3620 = this;
			String string_8 = Class176.aClass472_2201.aString5601;
			int i_5 = Class176.aClass472_2201.anInt5602 + 32;
			if (!str_1.equals("")) {
				string_8 = string_8 + "_" + str_1;
				i_5 = 0;
			}

			this.method4655(class274_6, CURRENT_GAME.aString5748, string_8, i_5, Class123.method2149(), aBool7161, 1114711538);
		}

	}

	final void method4677() {
		if (Class393.preferences.currentToolkit.getValue(-1787736351) == 2) {
			try {
				this.pulse((byte) 14);
			} catch (ThreadDeath threaddeath_3) {
				throw threaddeath_3;
			} catch (Throwable throwable_4) {
				Class151.method2594(throwable_4.getMessage() + " " + this.method4669(983158904), throwable_4, (byte) -77);
				aBool7171 = true;
				ParticleProducer.method11500(0, false);
			}
		} else {
			this.pulse((byte) 26);
		}

	}

	void pulse(byte b_1) {
		if (gameState != 16) {
			if (aBool7225) {
				Object object_2 = anObject7227;
				synchronized (anObject7227) {
					anObject7227.notify();
				}

				object_2 = anObject7226;
				synchronized (anObject7226) {
					try {
						anObject7226.wait();
					} catch (InterruptedException interruptedexception_7) {
						;
					}
				}

				aBool7225 = false;
			}

			++cycles;
			if (cycles % 1000 == 1) {
				GregorianCalendar gregoriancalendar_10 = new GregorianCalendar();
				PacketsDecoder.anInt9079 = gregoriancalendar_10.get(11) * 600 + gregoriancalendar_10.get(12) * 10 + gregoriancalendar_10.get(13) / 6;
				aRandom7260.setSeed((long) PacketsDecoder.anInt9079);
			}

			aClass184_7475.method3059(-1650964006);
			connectionContext.method3059(-1386724833);
			this.method11622();
			if (Class468_Sub9.JS5_MANAGER != null) {
				Class468_Sub9.JS5_MANAGER.pulse();
			}

			ObjectDefinitions.method8020();
			Class158_Sub1_Sub2.method15536();
			Class96_Sub21.keyRecorder.method3235();
			Class163.mouseRecorder.method3589();
			if (Renderers.SOFTWARE_RENDERER != null) {
				Renderers.SOFTWARE_RENDERER.method8398((int) TextureDetails.time());
			}

			anInt7193 = 0;
			maximumHeldKeys = 0;

			int type;
			for (KeyRecord record = Class96_Sub21.keyRecorder.getNext(50218263); record != null; record = Class96_Sub21.keyRecorder.getNext(-1126150226)) {
				type = record.getType();
				if (type != 2 && type != 3) {
					if (type == 0 && maximumHeldKeys < 75) {
						anInterface16Array7298[maximumHeldKeys] = record;
						++maximumHeldKeys;
					}
				} else {
					char keyCode = record.getCode(-176963649);
					if (Class298.method5303((byte) 37) && (keyCode == 96 || keyCode == 167 || keyCode == 178)) {
						if (Class521_Sub1_Sub3_Sub1.method16081()) {
							Class173.method2944(1516285434);
						} else {
							SpotAnimDefinitions.method11243();
						}
					} else if (anInt7193 < 131) {
						KEYS_PRESSED[anInt7193] = record;
						++anInt7193;
					}
				}
			}

			anInt7191 = 0;

			for (MouseRecord record = Class163.mouseRecorder.nextSubmission((byte) 13); record != null; record = Class163.mouseRecorder.nextSubmission((byte) 69)) {
				type = record.getClickType(1548872878);
				if (type == -1) {
					JS5CacheFile.record(record);
				} else if (type == 6) {
					anInt7191 += record.getMeta();
					record.cache(-667277258);
				} else if (Class298.method5304(type, -1452447223)) {
					mouseRecords.append(record);
					if (mouseRecords.size() > 10) {
						MouseRecord head = (MouseRecord) mouseRecords.popHead((byte) -45);
						if (head != null) {
							head.cache(1848572957);
						}
					}
				}
			}

			if (Class521_Sub1_Sub3_Sub1.method16081()) {
				Class301.method5333();
			}

			if (Class504.loadingState(gameState, (byte) 80)) {
				Class468_Sub20.method12808();
				Class282_Sub15_Sub1.method14840((byte) 69);
			} else if (Class464.method7742(gameState, (byte) 12)) {
				IndexLoaders.MAP_REGION_DECODER.method4461((byte) -96);
			}

			if (Class97.loggedOutState(gameState) && !Class464.method7742(gameState, (byte) 101)) {
				this.method12044((short) 3630);
				Class521_Sub1_Sub5_Sub1.handleAccountCreationStart();
				Login.method5018();
			} else if (Class282_Sub17.lobbyState(gameState, -1507650612) && !Class464.method7742(gameState, (byte) 25)) {
				this.method12044((short) 3677);
				Login.method5018();
			} else if (gameState == 12) {
				Login.method5018();
			} else if (TextureDetails.method2875(gameState, -1980250019) && !Class464.method7742(gameState, (byte) 45)) {
				Class282_Sub20_Sub22.method15386();
			} else if (gameState == 10 || gameState == 17) {
				Login.method5018();
				if (Class9.anInt106 != -3 && Class9.anInt106 != 2 && Class9.anInt106 != 15) {
					if (gameState == 17) {
						Class9.anInt109 = Class9.anInt112;
						Class9.anInt108 = Class9.anInt94;
						Class9.anInt107 = Class9.anInt106;
						if (Class448.aBool5428) {
							Class62.setGameHost(Class448.aClass450_5429.worldId, Class448.aClass450_5429.host);
							aClass184_7475.method3061(-1506150960);
							Class365.setGameState(10);
						} else {
							CursorIndexLoader.method7333(Class9.aBool71, 2069442218);
						}
					} else {
						CursorIndexLoader.method7333(false, 2035320841);
					}
				}
			}

			Class279.renderItems(Renderers.SOFTWARE_RENDERER);
			mouseRecords.popHead((byte) -124);
		}

	}

	static final void method11619() {
		int i_0 = Class197.NUM_PLAYER_INDICES;
		int[] ints_1 = Class197.PLAYER_INDICES;
		int i_2;
		if (anInt7341 == 4) {
			i_2 = Class82.aClass75Array804.length;
		} else {
			i_2 = aBool7241 ? i_0 : i_0 + NPC_UPDATE_INDEX;
		}

		for (int i_3 = 0; i_3 < i_2; i_3++) {
			Object obj_4;
			if (anInt7341 == 4) {
				CutsceneEntity class75_5 = Class82.aClass75Array804[i_3];
				if (!class75_5.initialized) {
					continue;
				}

				obj_4 = class75_5.method1342((byte) 124);
			} else {
				if (i_3 < i_0) {
					obj_4 = players[ints_1[i_3]];
				} else {
					obj_4 = (Animable) ((Class282_Sub47) NPCS.get((long) NPC_UPDATE_INDICES[i_3 - i_0])).anObject8068;
				}

				if (((Animable) obj_4).drawPriority < 0) {
					continue;
				}
			}

			int i_7 = ((Animable) obj_4).getSize();
			Vector3 vector3_6 = ((Animable) obj_4).method11166().aClass385_3595;
			if ((i_7 & 0x1) == 0) {
				if (((int) vector3_6.x & 0x1ff) == 0 && ((int) vector3_6.z & 0x1ff) == 0) {
					continue;
				}
			} else if (((int) vector3_6.x & 0x1ff) == 256 && ((int) vector3_6.z & 0x1ff) == 256) {
				continue;
			}

			((Animable) obj_4).method11172(vector3_6.x, (float) Class504.method8389((int) vector3_6.x, (int) vector3_6.z, ((Animable) obj_4).plane, (byte) 71), vector3_6.z);
			IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3397((Class521_Sub1_Sub1) obj_4, true, -622341859);
		}

	}

	void method11620(int i_1) {
		if (gameState != 16) {
			long long_2 = Class176.method2979(-565051439) / 1000000L - aLong7170;
			aLong7170 = Class176.method2979(-1607655073) / 1000000L;
			boolean bool_4 = Class463.method7730();
			if (bool_4 && Class260.aBool3220 && Class320.aClass253_3723 != null) {
				Class320.aClass253_3723.method4334();
			}

			if (Class176.method2980(gameState, -997270926)) {
				if (aLong7307 != 0L && TextureDetails.time() > aLong7307) {
					Class440.method7373(Class158.windowedMode(), -1, -1, false, (byte) 23);
				} else if (!Renderers.SOFTWARE_RENDERER.method8465() && aBool3257) {
					Class350_Sub2.method12571(757549008);
				}
			}

			int width;
			if (fullScreenFrame == null) {
				Container container_5 = Class371.getActiveContainer();
				width = container_5.getSize().width;
				int height = container_5.getSize().height;
				if (container_5 == engineFrame) {
					Insets insets_8 = engineFrame.getInsets();
					width -= insets_8.left + insets_8.right;
					height -= insets_8.bottom + insets_8.top;
				}

				if (width != SunIndexLoader.anInt434 || height != Class107.anInt1082 || aBool7185) {
					if (Renderers.SOFTWARE_RENDERER != null && !Renderers.SOFTWARE_RENDERER.method8664()) {
						SunIndexLoader.anInt434 = width;
						Class107.anInt1082 = height;
					} else {
						Class532_Sub1.method12840(865941395);
					}

					aLong7307 = TextureDetails.time() + 500L;
					aBool7185 = false;
				}
			}

			if (Class475.supportsFullScreen && fullScreenFrame != null && !Class530.aBool7050 && Class176.method2980(gameState, -576589462)) {
				Class440.method7373(Class393.preferences.screenSize.method12687(-342071815), -1, -1, false, (byte) 98);
			}

			boolean bool_9 = false;
			if (aBool3274) {
				aBool3274 = false;
				bool_9 = true;
			}

			if (bool_9) {
				EntityNode.method4891((byte) -93);
			}

			if (Renderers.SOFTWARE_RENDERER != null && Renderers.SOFTWARE_RENDERER.method8465() || Class158.windowedMode() != 1) {
				IncomingPacket.method6378();
			}

			if (Class504.loadingState(gameState, (byte) -30)) {
				NodeCollection.method8144(bool_9);
			} else if (Class245.method4198(gameState)) {
				ParticleProducer.method11501(-354801018);
			} else if (Class325.method5789(gameState)) {
				ParticleProducer.method11501(-639557220);
			} else if (Class464.method7742(gameState, (byte) 88)) {
				if (IndexLoaders.MAP_REGION_DECODER.method4420() == Class339.aClass339_3985) {
					width = IndexLoaders.MAP_REGION_DECODER.method4421() / 2;
					Class446.method7447(Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -1524722095) + "<br>" + "(" + width + "%)", true, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -97);
				} else if (IndexLoaders.MAP_REGION_DECODER.method4420() == Class339.aClass339_3983) {
					width = 50 + IndexLoaders.MAP_REGION_DECODER.method4538() / 2;
					Class446.method7447(Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -1005069265) + "<br>" + "(" + width + "%)", true, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -56);
				} else {
					Class446.method7447(Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -267708081), true, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -27);
				}
			} else if (gameState == 13) {
				Class152.method2601(long_2);
			} else if (gameState == 10) {
				Class446.method7447(Message.CONNECTION_LOST.translate(Class223.CURRENT_LANGUAGE, -897810008) + "<br>" + Message.ATTEMPTING_TO_REESTABLISH.translate(Class223.CURRENT_LANGUAGE, -1031078167), false, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -41);
			} else if (gameState == 17) {
				Class446.method7447(Message.PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -905717195), false, Renderers.SOFTWARE_RENDERER, Class16.aClass8_144, Class16.aClass414_139, (byte) -100);
			}

			if (anInt7412 == 3) {
				for (width = 0; width < anInt7407; width++) {
					Rectangle rectangle_10 = aRectangleArray7411[width];
					if (aBoolArray7410[width]) {
						Renderers.SOFTWARE_RENDERER.method8562(rectangle_10.x, rectangle_10.y, rectangle_10.width, rectangle_10.height, -65281);
					} else {
						Renderers.SOFTWARE_RENDERER.method8562(rectangle_10.x, rectangle_10.y, rectangle_10.width, rectangle_10.height, -16711936);
					}
				}
			}

			if (Class521_Sub1_Sub3_Sub1.method16081()) {
				Class282_Sub47.method13409(Renderers.SOFTWARE_RENDERER);
			}

			if (!Class504.loadingState(gameState, (byte) -54) && !Class464.method7742(gameState, (byte) 17) && anInt7349 != -1) {
				try {
					Renderers.SOFTWARE_RENDERER.method8393((short) 30084);
				} catch (Exception_Sub3 exception_sub3_12) {
					Class151.method2594(exception_sub3_12.getMessage() + " " + this.method4669(115393610), exception_sub3_12, (byte) -126);
					ParticleProducer.method11500(0, false);
				}
			}

			Class383.method6511();
			width = Class393.preferences.cpu.getValue();
			if (width == 0) {
				Class89.sleep(15L);
			} else if (width == 1) {
				Class89.sleep(10L);
			} else if (width == 2) {
				Class89.sleep(5L);
			} else if (width == 3) {
				Class89.sleep(2L);
			}

			if (aBool7219) {
				Class378.method6438();
			}

			if (Class393.preferences.safeMode.getValue((byte) 40) == 1 && gameState == 5 && anInt7349 != -1) {
				Class393.preferences.setValue(Class393.preferences.safeMode, 0, -1689344796);
				Class190.savePreferences((byte) 36);
			}
		}

	}

	public String method4669(int i_1) {
		String str_2 = " ";

		try {
			CoordGrid coordgrid_3 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			str_2 = str_2 + coordgrid_3.x + "," + coordgrid_3.y + "," + IndexLoaders.MAP_REGION_DECODER.getSizeX() + "," + IndexLoaders.MAP_REGION_DECODER.getSizeY() + " ";
			if (VertexNormal.myPlayer != null) {
				str_2 = str_2 + Class4.anInt35 + "," + (VertexNormal.myPlayer.regionBaseX[0] + coordgrid_3.x) + "," + (VertexNormal.myPlayer.regionBaseY[0] + coordgrid_3.y) + " ";
			} else {
				str_2 = str_2 + Class4.anInt35 + "," + Class4.anInt35 + "," + Class4.anInt35 + "," + " ";
			}

			str_2 = str_2 + Class393.preferences.currentToolkit.getValue(-993129385) + " " + Class393.preferences.aClass468_Sub4_8187.method12641(-679082268) + " " + Class158.windowedMode() + " " + Class349.anInt4083 + "," + anInt3243 * -969250379 + " ";
			str_2 = str_2 + Class393.preferences.aClass468_Sub19_8204.method12786() + " ";
			str_2 = str_2 + Class393.preferences.aClass468_Sub2_8205.method12624((byte) -13) + " ";
			str_2 = str_2 + Class393.preferences.water.getValue(-14216160) + " ";
			str_2 = str_2 + Class393.preferences.textures.method12873(-932998306) + " ";
			str_2 = str_2 + Class393.preferences.aClass468_Sub12_8195.method12706((byte) 75) + " ";
			str_2 = str_2 + "0 ";
			str_2 = str_2 + MAX_MEMORY + " ";
			str_2 = str_2 + gameState + " ";
			if (Class11.SYSTEM_INFO != null) {
				str_2 = str_2 + Class11.SYSTEM_INFO.anInt8167;
			} else {
				str_2 = str_2 + -1;
			}

			str_2 = str_2 + " ";
			if (aString7164 != null) {
				str_2 = str_2 + aString7164;
			} else {
				str_2 = str_2 + ",";
			}

			try {
				if (Class393.preferences.currentToolkit.getValue(-1268238146) == 2) {
					Class class_4 = Class.forName("java.lang.ClassLoader");
					Field field_5 = class_4.getDeclaredField("nativeLibraries");
					Class class_6 = Class.forName("java.lang.reflect.AccessibleObject");
					Method method_7 = class_6.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
					method_7.invoke(field_5, new Object[] { Boolean.TRUE });
					Vector vector_8 = (Vector) field_5.get(client.class.getClassLoader());

					for (int i_9 = 0; i_9 < vector_8.size(); i_9++) {
						try {
							Object object_10 = vector_8.elementAt(i_9);
							Field field_11 = object_10.getClass().getDeclaredField("name");
							method_7.invoke(field_11, new Object[] { Boolean.TRUE });

							try {
								String string_12 = (String) field_11.get(object_10);
								if (string_12 != null && string_12.indexOf("sw3d.dll") != -1) {
									Field field_13 = object_10.getClass().getDeclaredField("handle");
									method_7.invoke(field_13, new Object[] { Boolean.TRUE });
									str_2 = str_2 + " " + Long.toHexString(field_13.getLong(object_10));
									method_7.invoke(field_13, new Object[] { Boolean.FALSE });
								}
							} catch (Throwable throwable_14) {
								;
							}

							method_7.invoke(field_11, new Object[] { Boolean.FALSE });
						} catch (Throwable throwable_15) {
							;
						}
					}
				}
			} catch (Throwable throwable_16) {
				;
			}
		} catch (Throwable throwable_17) {
			;
		}

		return str_2;
	}

	void method11622() {
		boolean bool_2 = Class119.JS5_STANDARD_REQUESTER.method5521();
		if (!bool_2) {
			this.method11623();
		}

	}

	void method11623() {
		if (Class119.JS5_STANDARD_REQUESTER.anInt3657 > anInt7232) {
			Class159.GAME_CONNECTION_INFO.swap(-389298701);
			anInt7202 = Class119.JS5_STANDARD_REQUESTER.anInt3657 * 250 - 250;
			if (anInt7202 > 3000) {
				anInt7202 = 3000;
			}

			if (Class119.JS5_STANDARD_REQUESTER.anInt3657 >= 2 && Class119.JS5_STANDARD_REQUESTER.anInt3650 == 6) {
				this.method4680("js5connect_outofdate", -894832460);
				gameState = 16;
				return;
			}

			if (Class119.JS5_STANDARD_REQUESTER.anInt3657 >= 1 && Class119.JS5_STANDARD_REQUESTER.anInt3650 == 48) {
				this.method4680("sessionexpired", -912773431);
				gameState = 16;
				return;
			}

			if (Class119.JS5_STANDARD_REQUESTER.anInt3657 >= 4 && Class119.JS5_STANDARD_REQUESTER.anInt3650 == -1) {
				this.method4680("js5crc", -1498631441);
				gameState = 16;
				return;
			}

			if (Class119.JS5_STANDARD_REQUESTER.anInt3657 >= 4 && Class504.loadingState(gameState, (byte) 81)) {
				if (Class119.JS5_STANDARD_REQUESTER.anInt3650 != 7 && Class119.JS5_STANDARD_REQUESTER.anInt3650 != 9) {
					if (Class119.JS5_STANDARD_REQUESTER.anInt3650 > 0) {
						if (aString7463 == null) {
							this.method4680("js5connect", -1670135642);
						} else {
							this.method4680("js5proxy_" + aString7463.trim(), -162605543);
						}
					} else {
						this.method4680("js5io", -243953316);
					}
				} else {
					this.method4680("js5connect_full", -1792306679);
				}

				gameState = 16;
				return;
			}
		}

		anInt7232 = Class119.JS5_STANDARD_REQUESTER.anInt3657;
		if (anInt7202 > 0) {
			--anInt7202;
		} else {
			try {
				if (updateStage == 0) {
					Class282_Sub20_Sub10.clientSocket = Class159.GAME_CONNECTION_INFO.createSocket((byte) 122);
					++updateStage;
				}

				if (updateStage == 1) {
					Class47_Sub1.updateConnection = SunDefinitions.createAsyncConnection(Class282_Sub20_Sub10.clientSocket, 125000, 165252847);
					int length = 13 + aString7164.length();
					RsByteBuffer stream = new RsByteBuffer(length + 4);
					stream.writeByte(OutgoingLoginPacket.INIT_JS5REMOTE_CONNECTION.id);
					stream.writeByte(length);
					stream.writeInt(Loader.CLIENT_BUILD);
					stream.writeInt(Loader.MAJOR_BUILD);
					stream.writeInt(Loader.MINOR_BUILD);
					stream.writeString(aString7164);
					Class47_Sub1.updateConnection.write(stream.buffer, length + 2, -2102703988);
					++updateStage;
					JS5CacheFile.aLong2577 = TextureDetails.time();
				}

				int reponse;
				if (updateStage == 2) {
					if (Class47_Sub1.updateConnection.available(1)) {
						byte[] bytes_6 = new byte[1];
						reponse = Class47_Sub1.updateConnection.read(bytes_6, 0, 1);
						if (bytes_6[0] == 25) {
							return;
						}

						if (bytes_6[0] != 0) {
							this.updateNetStatus(reponse);
							return;
						}

						++updateStage;
					} else if (TextureDetails.time() - JS5CacheFile.aLong2577 > 30000L) {
						this.updateNetStatus(1001);
						return;
					}
				}

				if (updateStage == 3) {
					Class446[] arr_10 = Class446.method7436();
					reponse = arr_10.length * 4;
					if (Class47_Sub1.updateConnection.available(reponse)) {
						RsByteBuffer rsbytebuffer_4 = new RsByteBuffer(reponse);
						Class47_Sub1.updateConnection.read(rsbytebuffer_4.buffer, 0, rsbytebuffer_4.buffer.length);

						for (int i_5 = 0; i_5 < arr_10.length; i_5++) {
							arr_10[i_5].method7439(rsbytebuffer_4.readInt());
						}

						boolean loggedOut = Class504.loadingState(gameState, (byte) 104) || Class97.loggedOutState(gameState) || Class282_Sub17.lobbyState(gameState, -869623251);
						Class119.JS5_STANDARD_REQUESTER.init(Class47_Sub1.updateConnection, !loggedOut);
						Class282_Sub20_Sub10.clientSocket = null;
						Class47_Sub1.updateConnection = null;
						updateStage = 0;
					}
				}
			} catch (IOException ioexception_8) {
				this.updateNetStatus(1002);
			}
		}

	}

	void updateNetStatus(int i_1) {
		Class282_Sub20_Sub10.clientSocket = null;
		Class47_Sub1.updateConnection = null;
		updateStage = 0;
		++Class119.JS5_STANDARD_REQUESTER.anInt3657;
		Class119.JS5_STANDARD_REQUESTER.anInt3650 = i_1;
	}

	static final void method11626() {
		int count = Class197.NUM_PLAYER_INDICES;
		int[] playerIndices = Class197.PLAYER_INDICES;
		int idleAnimations = Class393.preferences.idleAnimations.getValue();
		boolean animate = idleAnimations == 1 && count > 200 || idleAnimations == 0 && count > 50;

		int i_4;
		int i_8;
		for (i_4 = 0; i_4 < count; i_4++) {
			Player player_5 = players[playerIndices[i_4]];
			if (!player_5.hasAppearance((byte) 123)) {
				player_5.drawPriority = -1;
			} else if (player_5.hidden) {
				player_5.drawPriority = -1;
			} else {
				player_5.method14697((byte) 56);
				if (player_5.aShort9458 >= 0 && player_5.aShort9456 >= 0 && player_5.localX < IndexLoaders.MAP_REGION_DECODER.getSizeX() && player_5.localY < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
					player_5.aBool10573 = player_5.aClass456_Sub3_10337.aBool7891 ? animate : false;
					if (player_5 == VertexNormal.myPlayer) {
						player_5.drawPriority = Integer.MAX_VALUE;
					} else {
						i_8 = 0;
						if (!player_5.aBool10318) {
							++i_8;
						}

						if (!player_5.aClass457_10333.method7666(1539995969)) {
							i_8 += 2;
						}

						i_8 += 5 - player_5.getSize() << 2;
						if (!player_5.aBool10571 && !player_5.aBool10550) {
							if (anInt7291 == 0) {
								i_8 += 32;
							} else {
								i_8 += 128;
							}

							i_8 += 256;
						} else {
							i_8 += 512;
						}

						player_5.drawPriority = i_8 + 1;
					}
				} else {
					player_5.drawPriority = -1;
				}
			}
		}

		for (i_4 = 0; i_4 < NPC_UPDATE_INDEX; i_4++) {
			NPC npc_9 = (NPC) ((Class282_Sub47) NPCS.get((long) NPC_UPDATE_INDICES[i_4])).anObject8068;
			if (npc_9.hasDefinition(1233643385) && npc_9.definitions.method6885(Class158_Sub1.PLAYER_VAR_PROVIDER)) {
				npc_9.method14697((byte) 71);
				if (npc_9.aShort9458 >= 0 && npc_9.aShort9456 >= 0 && npc_9.localX < IndexLoaders.MAP_REGION_DECODER.getSizeX() && npc_9.localY < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
					i_8 = 0;
					if (!npc_9.aBool10318) {
						++i_8;
					}

					if (!npc_9.aClass457_10333.method7666(1870908513)) {
						i_8 += 2;
					}

					i_8 += 5 - npc_9.getSize() << 2;
					if (anInt7291 == 0) {
						if (npc_9.definitions.aBool4884) {
							i_8 += 64;
						} else {
							i_8 += 128;
						}
					} else if (anInt7291 == 1) {
						if (npc_9.definitions.aBool4884) {
							i_8 += 32;
						} else {
							i_8 += 64;
						}
					}

					if (npc_9.definitions.aBool4904) {
						i_8 += 1024;
					} else if (!npc_9.definitions.aBool4890) {
						i_8 += 256;
					}

					npc_9.drawPriority = i_8 + 1;
				} else {
					npc_9.drawPriority = -1;
				}
			} else {
				npc_9.drawPriority = -1;
			}
		}

		for (i_4 = 0; i_4 < aClass180Array7348.length; i_4++) {
			Class180 class180_10 = aClass180Array7348[i_4];
			if (class180_10 != null) {
				if (class180_10.anInt2236 == 1) {
					Class282_Sub47 class282_sub47_6 = (Class282_Sub47) NPCS.get((long) class180_10.anInt2238);
					if (class282_sub47_6 != null) {
						NPC npc_7 = (NPC) class282_sub47_6.anObject8068;
						if (npc_7.drawPriority >= 0) {
							npc_7.drawPriority += 2048;
						}
					}
				} else if (class180_10.anInt2236 == 10) {
					Player player_11 = players[class180_10.anInt2238];
					if (player_11 != null && player_11 != VertexNormal.myPlayer && player_11.drawPriority >= 0) {
						player_11.drawPriority += 2048;
					}
				}
			}
		}

	}

	static final void method11627() {
		int[][] ints_0 = IndexLoaders.MAP_REGION_DECODER.method4437((byte) -47);
		int i_1 = IndexLoaders.MAP_REGION_DECODER.getSizeX();
		int i_2 = IndexLoaders.MAP_REGION_DECODER.getSizeY();

		for (int i_3 = 0; i_3 < i_1; i_3++) {
			int[] ints_4 = ints_0[i_3];

			for (int i_5 = 0; i_5 < i_2; i_5++) {
				ints_4[i_5] = 0;
			}
		}

	}

	static final void method11628(int i_0) {
		int i_1 = Class197.NUM_PLAYER_INDICES;
		int[] ints_2 = Class197.PLAYER_INDICES;
		int[][] ints_3 = IndexLoaders.MAP_REGION_DECODER.method4437((byte) -121);
		int[][] ints_4 = IndexLoaders.MAP_REGION_DECODER.method4438(2109447530);
		int i_5;
		if (anInt7341 == 4) {
			i_5 = Class82.aClass75Array804.length;
		} else {
			i_5 = i_1 + NPC_UPDATE_INDEX;
		}

		for (int i_6 = 0; i_6 < i_5; i_6++) {
			Object obj_7;
			if (anInt7341 == 4) {
				CutsceneEntity class75_8 = Class82.aClass75Array804[i_6];
				if (!class75_8.initialized) {
					continue;
				}

				obj_7 = class75_8.method1342((byte) 81);
			} else {
				if (i_6 < i_1) {
					obj_7 = players[ints_2[i_6]];
				} else {
					obj_7 = (Animable) ((Class282_Sub47) NPCS.get((long) NPC_UPDATE_INDICES[i_6 - i_1])).anObject8068;
				}

				if (i_0 != ((Animable) obj_7).plane || ((Animable) obj_7).drawPriority < 0) {
					continue;
				}
			}

			int i_17 = ((Animable) obj_7).getSize();
			Vector3 vector3_9 = ((Animable) obj_7).method11166().aClass385_3595;
			if ((i_17 & 0x1) == 0) {
				if (((int) vector3_9.x & 0x1ff) != 0 || ((int) vector3_9.z & 0x1ff) != 0) {
					continue;
				}
			} else if (((int) vector3_9.x & 0x1ff) != 256 || ((int) vector3_9.z & 0x1ff) != 256) {
				continue;
			}

			int i_10;
			int i_11;
			if (i_17 == 1) {
				i_10 = (int) vector3_9.x >> 9;
				i_11 = (int) vector3_9.z >> 9;
				if (((Animable) obj_7).drawPriority > ints_3[i_10][i_11]) {
					ints_3[i_10][i_11] = ((Animable) obj_7).drawPriority;
					ints_4[i_10][i_11] = 1;
				} else if (ints_3[i_10][i_11] == ((Animable) obj_7).drawPriority) {
					++ints_4[i_10][i_11];
				}
			} else {
				i_10 = (i_17 - 1) * 256 + 60;
				i_11 = (int) vector3_9.x - i_10 >> 9;
				int i_12 = (int) vector3_9.z - i_10 >> 9;
				int i_13 = i_10 + (int) vector3_9.x >> 9;
				int i_14 = i_10 + (int) vector3_9.z >> 9;

				for (int i_15 = i_11; i_15 <= i_13; i_15++) {
					for (int i_16 = i_12; i_16 <= i_14; i_16++) {
						if (((Animable) obj_7).drawPriority > ints_3[i_15][i_16]) {
							ints_3[i_15][i_16] = ((Animable) obj_7).drawPriority;
							ints_4[i_15][i_16] = 1;
						} else if (ints_3[i_15][i_16] == ((Animable) obj_7).drawPriority) {
							++ints_4[i_15][i_16];
						}
					}
				}
			}
		}

	}

	static final void method11629(int i_0) {
		int i_1 = Class197.NUM_PLAYER_INDICES;
		int[] ints_2 = Class197.PLAYER_INDICES;
		int[][] ints_3 = IndexLoaders.MAP_REGION_DECODER.method4437((byte) -8);
		int[][] ints_4 = IndexLoaders.MAP_REGION_DECODER.method4438(129417438);
		int i_5;
		if (anInt7341 == 4) {
			i_5 = Class82.aClass75Array804.length;
		} else {
			i_5 = aBool7241 ? i_1 : i_1 + NPC_UPDATE_INDEX;
		}

		for (int i_6 = 0; i_6 < i_5; i_6++) {
			Object obj_7;
			if (anInt7341 == 4) {
				CutsceneEntity class75_8 = Class82.aClass75Array804[i_6];
				if (!class75_8.initialized) {
					continue;
				}

				obj_7 = class75_8.method1342((byte) 64);
			} else {
				if (i_6 < i_1) {
					obj_7 = players[ints_2[i_6]];
				} else {
					obj_7 = (Animable) ((Class282_Sub47) NPCS.get((long) NPC_UPDATE_INDICES[i_6 - i_1])).anObject8068;
				}

				if (i_0 != ((Animable) obj_7).plane) {
					continue;
				}

				if (((Animable) obj_7).drawPriority < 0) {
					((Animable) obj_7).aBool10318 = false;
					continue;
				}
			}

			((Animable) obj_7).anInt10319 = 0;
			int i_17 = ((Animable) obj_7).getSize();
			Vector3 vector3_9 = ((Animable) obj_7).method11166().aClass385_3595;
			if ((i_17 & 0x1) == 0) {
				if (((int) vector3_9.x & 0x1ff) != 0 || ((int) vector3_9.z & 0x1ff) != 0) {
					((Animable) obj_7).aBool10318 = false;
					continue;
				}
			} else if (((int) vector3_9.x & 0x1ff) != 256 || ((int) vector3_9.z & 0x1ff) != 256) {
				((Animable) obj_7).aBool10318 = false;
				continue;
			}

			if (anInt7341 != 4) {
				int i_10;
				int i_11;
				if (i_17 == 1) {
					i_10 = (int) vector3_9.x >> 9;
					i_11 = (int) vector3_9.z >> 9;
					if (ints_3[i_10][i_11] != ((Animable) obj_7).drawPriority) {
						((Animable) obj_7).aBool10318 = true;
						continue;
					}

					if (ints_4[i_10][i_11] > 1) {
						--ints_4[i_10][i_11];
						((Animable) obj_7).aBool10318 = true;
						continue;
					}
				} else {
					i_10 = (i_17 - 1) * 256 + 252;
					i_11 = (int) vector3_9.x - i_10 >> 9;
					int i_12 = (int) vector3_9.z - i_10 >> 9;
					int i_13 = i_10 + (int) vector3_9.x >> 9;
					int i_14 = i_10 + (int) vector3_9.z >> 9;
					if (!Class81.method1453(ints_3, ints_4, ((Animable) obj_7).drawPriority, i_11, i_12, i_13, i_14)) {
						for (int i_15 = i_11; i_15 <= i_13; i_15++) {
							for (int i_16 = i_12; i_16 <= i_14; i_16++) {
								if (ints_3[i_15][i_16] == ((Animable) obj_7).drawPriority) {
									--ints_4[i_15][i_16];
								}
							}
						}

						((Animable) obj_7).aBool10318 = true;
						continue;
					}
				}
			}

			((Animable) obj_7).aBool10318 = false;
			((Animable) obj_7).method11172(vector3_9.x, (float) Class504.method8389((int) vector3_9.x, (int) vector3_9.z, ((Animable) obj_7).plane, (byte) 48), vector3_9.z);
			IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3397((Class521_Sub1_Sub1) obj_7, true, -1200990157);
		}

	}

	public static IComponentSettings method11633(IComponentDefinitions icomponentdefinitions_0) {
		IComponentSettings class282_sub10_1 = (IComponentSettings) ICOMPONENT_SETTINGS_SLOTS.get(((long) icomponentdefinitions_0.idHash << 32) + (long) icomponentdefinitions_0.anInt1288);
		return class282_sub10_1 != null ? class282_sub10_1 : icomponentdefinitions_0.settings;
	}

	static IComponentDefinitions method11634(IComponentDefinitions icomponentdefinitions_0) {
		IComponentSettings class282_sub10_1 = method11633(icomponentdefinitions_0);
		if (class282_sub10_1.bit23Enabled()) {
			return Class221.aClass118_2763;
		} else {
			int i_2 = class282_sub10_1.depthFlags();
			if (i_2 == 0) {
				return null;
			} else {
				for (int i_3 = 0; i_3 < i_2; i_3++) {
					icomponentdefinitions_0 = Class96_Sub23.method14682(Class96.method1605(icomponentdefinitions_0.idHash), icomponentdefinitions_0);
					if (icomponentdefinitions_0 == null) {
						return Class221.aClass118_2763;
					}
				}

				return icomponentdefinitions_0;
			}
		}
	}

	final void method4686() {
		Frame frame_1 = new Frame(" ");
		frame_1.pack();
		frame_1.dispose();
		Class221.aClass118_2763 = new IComponentDefinitions();
		Class532_Sub1.method12840(1040254092);
		Whirlpool.JS5_LOCAL_REQUESTER = new JS5LocalRequester();
		Class119.JS5_STANDARD_REQUESTER = new Class312_Sub1();
		Class239.method4090(new int[] { 20, 260 }, new int[] { 1000, 100 }, 1716786333);
		Vector3.initVectorStack();
		Quaternion.method6493();
		ItemDefinitions.method7141((byte) -88);
		Class282_Sub41_Sub3.method14807(649907715);
		if (Class496.aClass496_5813 != HDWaterTile.aClass496_952) {
			Class339.aByteArrayArray3986 = new byte[50][];
		}

		Class393.preferences = Class225_Sub1.method12791();
		if (Class393.preferences.aClass468_Sub3_8199.method12632(507739411) == 1) {
			SceneObjectManager.aBool2644 = false;
		}

		if (Class496.aClass496_5813 == HDWaterTile.aClass496_952) {
			Class448.aClass450_5420.host = Class282_Sub44.anApplet8065.getCodeBase().getHost();
		} else if (Class496.method8308(HDWaterTile.aClass496_952, 739431588)) {
			Class448.aClass450_5420.host = Class282_Sub44.anApplet8065.getCodeBase().getHost();
			Class448.aClass450_5420.anInt5434 = 1140744768 + -58916693 * Class448.aClass450_5420.worldId * -1933199413;
			Class448.lobbyConnectionInfo.anInt5434 = Class448.lobbyConnectionInfo.worldId * -1933199413 * -58916693 + 1140744768;
			Class448.aClass450_5420.anInt5437 = (-1441381029 * Class448.aClass450_5420.worldId * -1933199413 + 1250363344) * -1637999045;
			Class448.lobbyConnectionInfo.anInt5437 = (Class448.lobbyConnectionInfo.worldId * -1933199413 * -1441381029 + 1250363344) * -1637999045;
		} else if (Class496.aClass496_5810 == HDWaterTile.aClass496_952) {
			Class448.aClass450_5420.host = "127.0.0.1";
			Class448.lobbyConnectionInfo.host = "127.0.0.1";
			Class448.aClass450_5420.anInt5434 = -58916693 * Class448.aClass450_5420.worldId * -1933199413 + 1140744768;
			Class448.lobbyConnectionInfo.anInt5434 = -58916693 * Class448.lobbyConnectionInfo.worldId * -1933199413 + 1140744768;
			Class448.aClass450_5420.anInt5437 = (-1441381029 * Class448.aClass450_5420.worldId * -1933199413 + 1250363344) * -1637999045;
			Class448.lobbyConnectionInfo.anInt5437 = (-1441381029 * Class448.lobbyConnectionInfo.worldId * -1933199413 + 1250363344) * -1637999045;
		}

		Class159.GAME_CONNECTION_INFO = Class448.aClass450_5420;
		if (Game.darkan == CURRENT_GAME) {
			aBool7372 = false;
		}

		Class455.aShortArray5452 = ObjectDefinitions.aShortArray5691 = NPCDefinitions.aShortArray4862 = ItemDefinitions.staticColorArr256 = new short[256];

		try {
			Class182.aClipboard2263 = Class371.getActiveContainer().getToolkit().getSystemClipboard();
		} catch (Exception exception_3) {
			;
		}

		Class96_Sub21.keyRecorder = Class325.method5787(Class351.gameCanvas);
		Class163.mouseRecorder = FontRenderer.method400(Class351.gameCanvas, (byte) -44);
		if (Class496.aClass496_5813 != HDWaterTile.aClass496_952) {
			aBool7176 = true;
		}

		aString3252 = Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -1954357321);
		IndexLoaders.MAP_REGION_LOADER_THREAD = new MapRegionLoaderTask();
		(new Thread(IndexLoaders.MAP_REGION_LOADER_THREAD)).start();
	}

	final void method4688() {
		if (Class393.preferences.currentToolkit.getValue(-1690824454) == 2) {
			try {
				this.pulse((byte) 95);
			} catch (ThreadDeath threaddeath_2) {
				throw threaddeath_2;
			} catch (Throwable throwable_3) {
				Class151.method2594(throwable_3.getMessage() + " " + this.method4669(2110908751), throwable_3, (byte) -93);
				aBool7171 = true;
				ParticleProducer.method11500(0, false);
			}
		} else {
			this.pulse((byte) 24);
		}

	}

	final void method4689() {
		if (Class393.preferences.currentToolkit.getValue(532788863) == 2) {
			try {
				this.pulse((byte) 102);
			} catch (ThreadDeath threaddeath_2) {
				throw threaddeath_2;
			} catch (Throwable throwable_3) {
				Class151.method2594(throwable_3.getMessage() + " " + this.method4669(-217360066), throwable_3, (byte) -22);
				aBool7171 = true;
				ParticleProducer.method11500(0, false);
			}
		} else {
			this.pulse((byte) 34);
		}

	}

	static boolean method11651(IComponentDefinitions icomponentdefinitions_0) {
		if (aBool7168) {
			if (method11633(icomponentdefinitions_0).settingsHash != 0) {
				return false;
			}

			if (icomponentdefinitions_0.type == 0) {
				return false;
			}
		}

		return icomponentdefinitions_0.hidden;
	}

	final void method4678() {
		if (Class393.preferences.currentToolkit.getValue(678097413) == 2) {
			try {
				this.method11620(-1670950684);
			} catch (ThreadDeath threaddeath_3) {
				throw threaddeath_3;
			} catch (Throwable throwable_4) {
				Class151.method2594(throwable_4.getMessage() + " " + this.method4669(928438920), throwable_4, (byte) -23);
				aBool7171 = true;
				ParticleProducer.method11500(0, false);
			}
		} else {
			this.method11620(-1594826994);
		}

	}

	static final void method11750() {
		anInt7304 = 0;

		for (int i_0 = 0; i_0 < NPC_UPDATE_INDEX; i_0++) {
			NPC npc_1 = (NPC) ((Class282_Sub47) NPCS.get((long) NPC_UPDATE_INDICES[i_0])).anObject8068;
			if (npc_1.aBool10318 && npc_1.method15899(1588256325) != -1) {
				int i_2 = (npc_1.getSize() - 1) * 256 + 252;
				Vector3 vector3_3 = npc_1.method11166().aClass385_3595;
				int i_4 = (int) vector3_3.x - i_2 >> 9;
				int i_5 = (int) vector3_3.z - i_2 >> 9;
				Animable animable_6 = Class155.method2640(npc_1.plane, i_4, i_5);
				if (animable_6 != null) {
					int i_7 = animable_6.index;
					if (animable_6 instanceof NPC) {
						i_7 += 2048;
					}

					if (animable_6.anInt10319 == 0 && animable_6.method15899(1156663306) != -1) {
						anIntArray7287[anInt7304] = i_7;
						anIntArray7288[anInt7304] = i_7;
						++anInt7304;
						++animable_6.anInt10319;
					}

					anIntArray7287[anInt7304] = i_7;
					anIntArray7288[anInt7304] = npc_1.index + 2048;
					++anInt7304;
					++animable_6.anInt10319;
				}
			}
		}

		Class225_Sub5.method13047(anIntArray7288, anIntArray7287, 0, anInt7304 - 1, (byte) 101);
	}

	final void method4738() {
		Frame frame_1 = new Frame(" ");
		frame_1.pack();
		frame_1.dispose();
		Class221.aClass118_2763 = new IComponentDefinitions();
		Class532_Sub1.method12840(-1015935879);
		Whirlpool.JS5_LOCAL_REQUESTER = new JS5LocalRequester();
		Class119.JS5_STANDARD_REQUESTER = new Class312_Sub1();
		Class239.method4090(new int[] { 20, 260 }, new int[] { 1000, 100 }, -651551316);
		Vector3.initVectorStack();
		Quaternion.method6493();
		ItemDefinitions.method7141((byte) -10);
		Class282_Sub41_Sub3.method14807(702651669);
		if (Class496.aClass496_5813 != HDWaterTile.aClass496_952) {
			Class339.aByteArrayArray3986 = new byte[50][];
		}

		Class393.preferences = Class225_Sub1.method12791();
		if (Class393.preferences.aClass468_Sub3_8199.method12632(1417868363) == 1) {
			SceneObjectManager.aBool2644 = false;
		}

		if (Class496.aClass496_5813 == HDWaterTile.aClass496_952) {
			Class448.aClass450_5420.host = Class282_Sub44.anApplet8065.getCodeBase().getHost();
		} else if (Class496.method8308(HDWaterTile.aClass496_952, 1401692729)) {
			Class448.aClass450_5420.host = Class282_Sub44.anApplet8065.getCodeBase().getHost();
			Class448.aClass450_5420.anInt5434 = 1140744768 + -58916693 * Class448.aClass450_5420.worldId * -1933199413;
			Class448.lobbyConnectionInfo.anInt5434 = Class448.lobbyConnectionInfo.worldId * -1933199413 * -58916693 + 1140744768;
			Class448.aClass450_5420.anInt5437 = (-1441381029 * Class448.aClass450_5420.worldId * -1933199413 + 1250363344) * -1637999045;
			Class448.lobbyConnectionInfo.anInt5437 = (Class448.lobbyConnectionInfo.worldId * -1933199413 * -1441381029 + 1250363344) * -1637999045;
		} else if (Class496.aClass496_5810 == HDWaterTile.aClass496_952) {
			Class448.aClass450_5420.host = "127.0.0.1";
			Class448.lobbyConnectionInfo.host = "127.0.0.1";
			Class448.aClass450_5420.anInt5434 = -58916693 * Class448.aClass450_5420.worldId * -1933199413 + 1140744768;
			Class448.lobbyConnectionInfo.anInt5434 = -58916693 * Class448.lobbyConnectionInfo.worldId * -1933199413 + 1140744768;
			Class448.aClass450_5420.anInt5437 = (-1441381029 * Class448.aClass450_5420.worldId * -1933199413 + 1250363344) * -1637999045;
			Class448.lobbyConnectionInfo.anInt5437 = (-1441381029 * Class448.lobbyConnectionInfo.worldId * -1933199413 + 1250363344) * -1637999045;
		}

		Class159.GAME_CONNECTION_INFO = Class448.aClass450_5420;
		if (Game.darkan == CURRENT_GAME) {
			aBool7372 = false;
		}

		Class455.aShortArray5452 = ObjectDefinitions.aShortArray5691 = NPCDefinitions.aShortArray4862 = ItemDefinitions.staticColorArr256 = new short[256];

		try {
			Class182.aClipboard2263 = Class371.getActiveContainer().getToolkit().getSystemClipboard();
		} catch (Exception exception_3) {
			;
		}

		Class96_Sub21.keyRecorder = Class325.method5787(Class351.gameCanvas);
		Class163.mouseRecorder = FontRenderer.method400(Class351.gameCanvas, (byte) -9);
		if (Class496.aClass496_5813 != HDWaterTile.aClass496_952) {
			aBool7176 = true;
		}

		aString3252 = Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -504694626);
		IndexLoaders.MAP_REGION_LOADER_THREAD = new MapRegionLoaderTask();
		(new Thread(IndexLoaders.MAP_REGION_LOADER_THREAD)).start();
	}

	public static final void method11768(Interface interface_0, IComponentDefinitions[] arr_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
		for (int i_11 = 0; i_11 < arr_1.length; i_11++) {
			IComponentDefinitions icomponentdefinitions_12 = arr_1[i_11];
			if (icomponentdefinitions_12 != null && i_2 == icomponentdefinitions_12.parent) {
				int i_13 = i_7 + icomponentdefinitions_12.anInt1299;
				int i_14 = i_8 + icomponentdefinitions_12.anInt1428;
				int i_15;
				int i_16;
				int i_17;
				int i_18;
				if (icomponentdefinitions_12.type == 2) {
					i_15 = i_3;
					i_16 = i_4;
					i_17 = i_5;
					i_18 = i_6;
				} else {
					int i_19 = i_13 + icomponentdefinitions_12.anInt1301;
					int i_20 = i_14 + icomponentdefinitions_12.anInt1429;
					if (icomponentdefinitions_12.type == 9) {
						++i_19;
						++i_20;
					}

					i_15 = i_13 > i_3 ? i_13 : i_3;
					i_16 = i_14 > i_4 ? i_14 : i_4;
					i_17 = i_19 < i_5 ? i_19 : i_5;
					i_18 = i_20 < i_6 ? i_20 : i_6;
				}

				if (icomponentdefinitions_12.type != 0 && !icomponentdefinitions_12.aBool1384 && method11633(icomponentdefinitions_12).settingsHash == 0 && icomponentdefinitions_12 != aClass118_7247 && icomponentdefinitions_12.contentType != IComponentDefinitions.anInt1269 && icomponentdefinitions_12.contentType != IComponentDefinitions.anInt1374 && icomponentdefinitions_12.contentType != IComponentDefinitions.anInt1372 && icomponentdefinitions_12.contentType != IComponentDefinitions.anInt1436) {
					if (i_15 < i_17 && i_16 < i_18) {
						Class86.method1482(icomponentdefinitions_12, (byte) 35);
					}
				} else if (!method11651(icomponentdefinitions_12)) {
					if (icomponentdefinitions_12 == aClass118_7257 && Class96_Sub14.method14643(aClass118_7257, -140661194)) {
						aBool7369 = true;
						anInt7252 = i_13;
						anInt7215 = i_14;
					}

					if (icomponentdefinitions_12.aBool1424 || i_15 < i_17 && i_16 < i_18) {
						if (icomponentdefinitions_12.disableHover && i_9 >= i_15 && i_10 >= i_16 && i_9 < i_17 && i_10 < i_18) {
							for (HookRequest hookrequest_37 = (HookRequest) aClass482_7402.head((byte) 111); hookrequest_37 != null; hookrequest_37 = (HookRequest) aClass482_7402.next(999668227)) {
								if (hookrequest_37.aBool8052) {
									hookrequest_37.remove();
									hookrequest_37.iComponentDefs.aBool1440 = false;
								}
							}

							if (Class96_Sub1.anInt8308 == 0) {
								aClass118_7257 = null;
								aClass118_7247 = null;
							}

							anInt7184 = 0;
							Class291_Sub1.aBool8022 = false;
							aBool7375 = false;
							if (!Class20.aBool161) {
								HitsplatDefinitions.method3851();
							}
						}

						boolean bool_47 = icomponentdefinitions_12.aBool1328 && icomponentdefinitions_12.type == 5 && icomponentdefinitions_12.anInt1453 == 0 && icomponentdefinitions_12.anInt1404 < 0 && icomponentdefinitions_12.anInt1426 == -1 && icomponentdefinitions_12.anInt1435 == -1 && !icomponentdefinitions_12.aBool1322 && icomponentdefinitions_12.anInt1423 == 0;
						boolean bool_48 = false;
						int i_24;
						if (i_9 >= i_15 && i_10 >= i_16 && i_9 < i_17 && i_10 < i_18) {
							if (bool_47) {
								Class119 class119_21 = icomponentdefinitions_12.method2046(Renderers.SOFTWARE_RENDERER, 386578026);
								if (class119_21 != null && class119_21.anInt1458 == icomponentdefinitions_12.anInt1301 && icomponentdefinitions_12.anInt1429 == class119_21.anInt1454) {
									int i_22 = i_9 - i_13;
									int i_23 = i_10 - i_14;
									if (i_23 >= 0 && i_23 < class119_21.anIntArray1457.length) {
										i_24 = class119_21.anIntArray1457[i_23];
										if (i_22 >= i_24 && i_22 <= i_24 + class119_21.anIntArray1455[i_23]) {
											bool_48 = true;
										}
									}
								} else {
									bool_48 = true;
								}
							} else {
								bool_48 = true;
							}
						}

						if (!aBool7344 && bool_48) {
							if (icomponentdefinitions_12.anInt1309 >= 0) {
								anInt7427 = icomponentdefinitions_12.anInt1309;
							} else if (icomponentdefinitions_12.disableHover) {
								anInt7427 = -1;
							}
						}

						if (!Class20.aBool161 && bool_48 && !interface_0.aBool999) {
							Class455.method7553(icomponentdefinitions_12, i_9 - i_13, i_10 - i_14);
						}

						boolean bool_38 = false;
						if (Class163.mouseRecorder.method3565((byte) -53) && bool_48) {
							bool_38 = true;
						}

						boolean bool_49 = false;
						MouseRecord class282_sub53_39 = (MouseRecord) mouseRecords.head((byte) 119);
						int i_25;
						int i_26;
						int i_27;
						Class119 class119_40;
						if (class282_sub53_39 != null && class282_sub53_39.getClickType(1070950260) == 0 && class282_sub53_39.method13481(1581398490) >= i_15 && class282_sub53_39.method13469(523863332) >= i_16 && class282_sub53_39.method13481(1968714645) < i_17 && class282_sub53_39.method13469(1262935690) < i_18) {
							if (bool_47) {
								class119_40 = icomponentdefinitions_12.method2046(Renderers.SOFTWARE_RENDERER, 854241922);
								if (class119_40 != null && icomponentdefinitions_12.anInt1301 == class119_40.anInt1458 && icomponentdefinitions_12.anInt1429 == class119_40.anInt1454) {
									i_25 = class282_sub53_39.method13481(1963952523) - i_13;
									i_26 = class282_sub53_39.method13469(-1768286963) - i_14;
									if (i_26 >= 0 && i_26 < class119_40.anIntArray1457.length) {
										i_27 = class119_40.anIntArray1457[i_26];
										if (i_25 >= i_27 && i_25 <= i_27 + class119_40.anIntArray1455[i_26]) {
											bool_49 = true;
										}
									}
								} else {
									bool_49 = true;
								}
							} else {
								bool_49 = true;
							}
						}

						if (icomponentdefinitions_12.aBool1424 && !Class521_Sub1_Sub3_Sub1.method16081()) {
							for (i_24 = 0; i_24 < icomponentdefinitions_12.aByteArrayArray1366.length; i_24++) {
								boolean bool_50 = false;
								boolean bool_51 = false;
								if (icomponentdefinitions_12.anIntArray1267[i_24] > 0) {
									for (i_27 = 0; i_27 < anInt7193; i_27++) {
										if (icomponentdefinitions_12.anIntArray1267[i_24] == KEYS_PRESSED[i_27].getCode(-1744878171)) {
											bool_50 = true;
											if (icomponentdefinitions_12.anIntArray1425 == null || icomponentdefinitions_12.anIntArray1425[i_24] <= cycles) {
												bool_51 = true;
											}
											break;
										}
									}
								}

								if (!bool_50 && icomponentdefinitions_12.aByteArrayArray1366[i_24] != null) {
									for (i_27 = 0; i_27 < icomponentdefinitions_12.aByteArrayArray1366[i_24].length; i_27++) {
										if (Class96_Sub21.keyRecorder.method3236(icomponentdefinitions_12.aByteArrayArray1366[i_24][i_27], -1446906824)) {
											bool_50 = true;
											if (icomponentdefinitions_12.anIntArray1425 != null && icomponentdefinitions_12.anIntArray1425[i_24] > cycles) {
												break;
											}

											byte b_28 = icomponentdefinitions_12.aByteArrayArray1367[i_24][i_27];
											if (b_28 == 0 || ((b_28 & 0x8) == 0 || !Class96_Sub21.keyRecorder.method3236(86, -2117949057) && !Class96_Sub21.keyRecorder.method3236(82, -1492987736) && !Class96_Sub21.keyRecorder.method3236(81, -1770217708)) && ((b_28 & 0x2) == 0 || Class96_Sub21.keyRecorder.method3236(86, -1478963287)) && ((b_28 & 0x1) == 0 || Class96_Sub21.keyRecorder.method3236(82, -1680703843)) && ((b_28 & 0x4) == 0 || Class96_Sub21.keyRecorder.method3236(81, -1805947277))) {
												bool_51 = true;
												break;
											}
										}
									}
								}

								if (bool_51) {
									if (i_24 < 10) {
										Class96_Sub10.method14603(i_24 + 1, icomponentdefinitions_12.idHash, icomponentdefinitions_12.anInt1288, "", (byte) 124);
									} else if (i_24 == 10) {
										Class60.method1170();
										IComponentSettings class282_sub10_41 = method11633(icomponentdefinitions_12);
										Class304.method5409(icomponentdefinitions_12, class282_sub10_41.getUseOptionFlags(), class282_sub10_41.interfaceId, (byte) -33);
										aString7275 = Class346.method6157(icomponentdefinitions_12, 1492565193);
										if (aString7275 == null) {
											aString7275 = "Null";
										}

										aString7356 = icomponentdefinitions_12.aString1369 + ParticleProducerDefinition.method1163(16777215);
									}

									i_27 = icomponentdefinitions_12.anIntArray1395[i_24];
									if (icomponentdefinitions_12.anIntArray1425 == null) {
										icomponentdefinitions_12.anIntArray1425 = new int[icomponentdefinitions_12.aByteArrayArray1366.length];
									}

									if (i_27 != 0) {
										icomponentdefinitions_12.anIntArray1425[i_24] = i_27 + cycles;
									} else {
										icomponentdefinitions_12.anIntArray1425[i_24] = Integer.MAX_VALUE;
									}
								}

								if (!bool_50 && icomponentdefinitions_12.anIntArray1425 != null) {
									icomponentdefinitions_12.anIntArray1425[i_24] = 0;
								}
							}
						}

						if (bool_49) {
							Class282_Sub14.method12221(icomponentdefinitions_12, class282_sub53_39.method13481(1900714400) - i_13, class282_sub53_39.method13469(-380403758) - i_14, 983477136);
						}

						if (aClass118_7257 != null && icomponentdefinitions_12 != aClass118_7257 && bool_48 && method11633(icomponentdefinitions_12).dragEnabled()) {
							aClass118_7370 = icomponentdefinitions_12;
						}

						if (icomponentdefinitions_12 == aClass118_7247) {
							aBool7403 = true;
							anInt7432 = i_13;
							anInt7265 = i_14;
							anInt7367 = aClass118_7247.anInt1301;
							anInt7476 = aClass118_7247.anInt1429;
						}

						if (icomponentdefinitions_12.aBool1384 || icomponentdefinitions_12.contentType != 0) {
							HookRequest hookrequest_53;
							if (bool_48 && anInt7191 != 0 && icomponentdefinitions_12.anObjectArray1412 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.aBool8052 = true;
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.anInt8055 = anInt7191;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1412;
								aClass482_7402.append(hookrequest_53);
							}

							if (aClass118_7257 != null) {
								bool_49 = false;
								bool_38 = false;
							} else if (Class20.aBool161 || icomponentdefinitions_12.contentType != IComponentDefinitions.anInt1313 && anInt7184 > 0) {
								bool_49 = false;
								bool_38 = false;
								bool_48 = false;
							}

							if (icomponentdefinitions_12.contentType != 0) {
								int i_52;
								if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1372 || icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1436) {
									aClass118_7183 = icomponentdefinitions_12;
									Class535 class535_59 = IndexLoaders.MAP_REGION_DECODER.method4435().method4038((short) 4792);
									if (class535_59.method11451() != null && !IndexLoaders.MAP_REGION_LOADER_THREAD.method6051()) {
										class535_59.method11451().method4217(Renderers.SOFTWARE_RENDERER, icomponentdefinitions_12.anInt1429, Class393.preferences.aClass468_Sub14_8211.method12728());
									}

									if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1372 && !Class20.aBool161 && i_9 >= i_15 && i_10 >= i_16 && i_9 < i_17 && i_10 < i_18) {
										Class521_Sub1_Sub4_Sub1.method16073(Renderers.SOFTWARE_RENDERER, i_9, i_10);

										for (Class275_Sub2 class275_sub2_57 = (Class275_Sub2) aClass457_7290.method7659(); class275_sub2_57 != null; class275_sub2_57 = (Class275_Sub2) aClass457_7290.method7650((byte) 102)) {
											if (i_9 >= class275_sub2_57.anInt7742 && i_9 < class275_sub2_57.anInt7744 && i_10 >= class275_sub2_57.anInt7743 && i_10 < class275_sub2_57.anInt7740) {
												HitsplatDefinitions.method3851();
												Class463.method7724(class275_sub2_57.aClass521_Sub1_Sub1_Sub2_7739);
											}
										}
									}

									i_25 = Class197.NUM_PLAYER_INDICES;
									int[] ints_46 = Class197.PLAYER_INDICES;

									for (i_27 = 0; i_27 < i_25; i_27++) {
										Player player_55 = players[ints_46[i_27]];
										if (player_55 != null) {
											AccountCreationStage.method252(Class397.aClass397_4806, -1, player_55, ints_46[i_27], 1912850737);
											player_55.method15880(i_15, i_16, i_17, i_18, i_13 - icomponentdefinitions_12.anInt1311, i_14 - icomponentdefinitions_12.anInt1312, i_9, i_10, (byte) 91);
										}
									}

									for (i_27 = 0; i_27 < NPC_UPDATE_INDEX; i_27++) {
										i_52 = NPC_UPDATE_INDICES[i_27];
										Class282_Sub47 class282_sub47_56 = (Class282_Sub47) NPCS.get((long) i_52);
										if (class282_sub47_56 != null) {
											AccountCreationStage.method252(Class397.aClass397_4804, ((NPC) class282_sub47_56.anObject8068).definitions.anInt4856, (Animable) class282_sub47_56.anObject8068, i_52, 1492205273);
											((Animable) class282_sub47_56.anObject8068).method15880(i_15, i_16, i_17, i_18, i_13 - icomponentdefinitions_12.anInt1311, i_14 - icomponentdefinitions_12.anInt1312, i_9, i_10, (byte) 77);
										}
									}
									continue;
								}

								if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1269) {
									class119_40 = icomponentdefinitions_12.method2046(Renderers.SOFTWARE_RENDERER, -139394981);
									if (class119_40 == null || Class187.anInt2363 != 0 && Class187.anInt2363 != 3 || Class20.aBool161 || i_9 < i_15 || i_10 < i_16 || i_9 >= i_17 || i_10 >= i_18) {
										continue;
									}

									i_25 = i_9 - i_13;
									i_26 = i_10 - i_14;
									i_27 = class119_40.anIntArray1457[i_26];
									if (i_25 < i_27 || i_25 > i_27 + class119_40.anIntArray1455[i_26]) {
										continue;
									}

									i_25 -= icomponentdefinitions_12.anInt1301 / 2;
									i_26 -= icomponentdefinitions_12.anInt1429 / 2;
									if (NativeLibraryLoader.anInt3240 == 4) {
										i_52 = (int) aFloat7365 & 0x3fff;
									} else {
										i_52 = (int) aFloat7365 + anInt7255 & 0x3fff;
									}

									int i_29 = Class382.anIntArray4657[i_52];
									int i_30 = Class382.anIntArray4661[i_52];
									if (NativeLibraryLoader.anInt3240 != 4) {
										i_29 = (anInt7203 + 256) * i_29 >> 8;
										i_30 = i_30 * (anInt7203 + 256) >> 8;
									}

									int i_31 = i_29 * i_26 + i_25 * i_30 >> 14;
									int i_32 = i_26 * i_30 - i_29 * i_25 >> 14;
									int i_33;
									int i_34;
									if (NativeLibraryLoader.anInt3240 == 4) {
										i_33 = (i_31 >> 2) + (anInt7262 >> 9);
										i_34 = (anInt7376 >> 9) - (i_32 >> 2);
									} else {
										int i_45 = (VertexNormal.myPlayer.getSize() - 1) * 256;
										Vector3 vector3_36 = VertexNormal.myPlayer.method11166().aClass385_3595;
										i_33 = ((int) vector3_36.x - i_45 >> 9) + (i_31 >> 2);
										i_34 = ((int) vector3_36.z - i_45 >> 9) - (i_32 >> 2);
									}

									if (aBool7344 && (Class506.anInt5858 & 0x40) != 0) {
										IComponentDefinitions icomponentdefinitions_35 = Index.method5694(Class7.anInt56, anInt7345, 381428528);
										if (icomponentdefinitions_35 != null) {
											PlayerAppearance.method4032(aString7275, " " + "->", Defaults8Loader.anInt5932, 59, icomponentdefinitions_12.anInt1426, 1L, i_33, i_34, true, false, (long) (icomponentdefinitions_12.anInt1288 << 32 | icomponentdefinitions_12.idHash), true, -1033171513);
										} else {
											Class60.method1170();
										}
										continue;
									}

									if (Game.stellarDawn == CURRENT_GAME) {
										PlayerAppearance.method4032(Message.FACE_HERE.translate(Class223.CURRENT_LANGUAGE, -1664758870), "", -1, 60, -1, 1L, i_33, i_34, true, false, 0L, true, -1558398631);
									}

									PlayerAppearance.method4032(Class85.aString817, "", anInt7311, 23, -1, 1L, i_33, i_34, true, false, 0L, true, -1994629741);
									continue;
								}

								if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1313) {
									Class282_Sub20_Sub24.aClass118_9884 = icomponentdefinitions_12;
									if (bool_48) {
										Class291_Sub1.aBool8022 = true;
									}

									if (bool_49) {
										i_24 = (int) ((double) (class282_sub53_39.method13481(1215503828) - i_13 - icomponentdefinitions_12.anInt1301 / 2) * 2.0D / (double) Class291.aFloat3468);
										i_25 = (int) (-((double) (class282_sub53_39.method13469(11142405) - i_14 - icomponentdefinitions_12.anInt1429 / 2) * 2.0D / (double) Class291.aFloat3468));
										i_26 = i_24 + Class291.anInt3472 + MapSpriteIndexLoader.anInt5123;
										i_27 = i_25 + Class291.anInt3473 + Class475.anInt5624;
										Class282_Sub50_Sub6 class282_sub50_sub6_42 = Class125.method2173(1504861114);
										if (class282_sub50_sub6_42 == null) {
											continue;
										}

										int[] ints_43 = new int[3];
										class282_sub50_sub6_42.method14775(i_26, i_27, ints_43, -1788209952);
										if (ints_43 != null) {
											if (Class96_Sub21.keyRecorder.method3236(82, -1914297424) && rights > 0) {
												SCT24IndexLoader.method7460(ints_43[0], ints_43[1], ints_43[2], -952047234);
												continue;
											}

											aBool7375 = true;
											Class282_Sub15_Sub5.anInt9859 = ints_43[0];
											IdentikitDefinition.anInt431 = ints_43[1];
											StructIndexLoader.anInt5015 = ints_43[2];
										}

										anInt7184 = 1;
										aBool7374 = false;
										anInt7361 = Class163.mouseRecorder.method3569(2118752348);
										anInt7362 = Class163.mouseRecorder.method3570();
										continue;
									}

									if (bool_38 && anInt7184 > 0) {
										if (anInt7184 == 1 && (anInt7361 != Class163.mouseRecorder.method3569(2088913466) || anInt7362 != Class163.mouseRecorder.method3570())) {
											Class244.anInt3008 = MapSpriteIndexLoader.anInt5123;
											Class11.anInt123 = Class475.anInt5624;
											anInt7184 = 2;
										}

										if (anInt7184 == 2) {
											aBool7374 = true;
											Class89.method1503(Class244.anInt3008 + (int) ((double) (anInt7361 - Class163.mouseRecorder.method3569(2080711871)) * 2.0D / (double) Class291.aFloat3462));
											Class316.method5599(Class11.anInt123 - (int) ((double) (anInt7362 - Class163.mouseRecorder.method3570()) * 2.0D / (double) Class291.aFloat3462));
										}
										continue;
									}

									if (anInt7184 > 0 && !aBool7374) {
										if ((anInt7339 == 1 || JS5GrabWorker.method12562(-1506814013)) && Class20.anInt169 > 2) {
											QuestIndexLoader.method4164(anInt7361, anInt7362, -1135712207);
										} else if (Class216.method3677(116247147)) {
											QuestIndexLoader.method4164(anInt7361, anInt7362, -603230978);
										}
									}

									anInt7184 = 0;
									continue;
								}

								if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1272) {
									if (bool_38) {
										Class306.method5458(Class163.mouseRecorder.method3569(2133055748) - i_13, Class163.mouseRecorder.method3570() - i_14, icomponentdefinitions_12.anInt1301, icomponentdefinitions_12.anInt1429);
									}
									continue;
								}

								if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1374) {
									Class15.method544(icomponentdefinitions_12, i_13, i_14, 1211773543);
									continue;
								}
							}

							if (!icomponentdefinitions_12.aBool1286 && bool_49) {
								icomponentdefinitions_12.aBool1286 = true;
								if (icomponentdefinitions_12.anObjectArray1386 != null) {
									hookrequest_53 = new HookRequest();
									hookrequest_53.aBool8052 = true;
									hookrequest_53.iComponentDefs = icomponentdefinitions_12;
									hookrequest_53.anInt8059 = class282_sub53_39.method13481(1563678506) - i_13;
									hookrequest_53.anInt8055 = class282_sub53_39.method13469(804357569) - i_14;
									hookrequest_53.params = icomponentdefinitions_12.anObjectArray1386;
									aClass482_7402.append(hookrequest_53);
								}
							}

							if (icomponentdefinitions_12.aBool1286 && bool_38 && icomponentdefinitions_12.anObjectArray1319 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.aBool8052 = true;
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.anInt8059 = Class163.mouseRecorder.method3569(1948013292) - i_13;
								hookrequest_53.anInt8055 = Class163.mouseRecorder.method3570() - i_14;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1319;
								aClass482_7402.append(hookrequest_53);
							}

							if (icomponentdefinitions_12.aBool1286 && !bool_38) {
								icomponentdefinitions_12.aBool1286 = false;
								if (icomponentdefinitions_12.anObjectArray1302 != null) {
									hookrequest_53 = new HookRequest();
									hookrequest_53.aBool8052 = true;
									hookrequest_53.iComponentDefs = icomponentdefinitions_12;
									hookrequest_53.anInt8059 = Class163.mouseRecorder.method3569(2071340926) - i_13;
									hookrequest_53.anInt8055 = Class163.mouseRecorder.method3570() - i_14;
									hookrequest_53.params = icomponentdefinitions_12.anObjectArray1302;
									aClass482_7404.append(hookrequest_53);
								}
							}

							if (bool_38 && icomponentdefinitions_12.anObjectArray1389 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.aBool8052 = true;
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.anInt8059 = Class163.mouseRecorder.method3569(2087662207) - i_13;
								hookrequest_53.anInt8055 = Class163.mouseRecorder.method3570() - i_14;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1389;
								aClass482_7402.append(hookrequest_53);
							}

							if (!icomponentdefinitions_12.aBool1440 && bool_48) {
								icomponentdefinitions_12.aBool1440 = true;
								if (icomponentdefinitions_12.anObjectArray1390 != null) {
									hookrequest_53 = new HookRequest();
									hookrequest_53.aBool8052 = true;
									hookrequest_53.iComponentDefs = icomponentdefinitions_12;
									hookrequest_53.anInt8059 = Class163.mouseRecorder.method3569(1986967200) - i_13;
									hookrequest_53.anInt8055 = Class163.mouseRecorder.method3570() - i_14;
									hookrequest_53.params = icomponentdefinitions_12.anObjectArray1390;
									aClass482_7402.append(hookrequest_53);
								}
							}

							if (icomponentdefinitions_12.aBool1440 && bool_48 && icomponentdefinitions_12.anObjectArray1278 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.aBool8052 = true;
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.anInt8059 = Class163.mouseRecorder.method3569(2139552091) - i_13;
								hookrequest_53.anInt8055 = Class163.mouseRecorder.method3570() - i_14;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1278;
								aClass482_7402.append(hookrequest_53);
							}

							if (icomponentdefinitions_12.aBool1440 && !bool_48) {
								icomponentdefinitions_12.aBool1440 = false;
								if (icomponentdefinitions_12.anObjectArray1392 != null) {
									hookrequest_53 = new HookRequest();
									hookrequest_53.aBool8052 = true;
									hookrequest_53.iComponentDefs = icomponentdefinitions_12;
									hookrequest_53.anInt8059 = Class163.mouseRecorder.method3569(2027458621) - i_13;
									hookrequest_53.anInt8055 = Class163.mouseRecorder.method3570() - i_14;
									hookrequest_53.params = icomponentdefinitions_12.anObjectArray1392;
									aClass482_7404.append(hookrequest_53);
								}
							}

							if (icomponentdefinitions_12.anObjectArray1409 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1409;
								aClass482_7233.append(hookrequest_53);
							}

							HookRequest hookrequest_54;
							if (icomponentdefinitions_12.anObjectArray1403 != null && anInt7368 > icomponentdefinitions_12.anInt1446) {
								if (icomponentdefinitions_12.anIntArray1315 != null && anInt7368 - icomponentdefinitions_12.anInt1446 <= 32) {
									label969: for (i_24 = icomponentdefinitions_12.anInt1446; i_24 < anInt7368; i_24++) {
										i_25 = anIntArray7150[i_24 & 0x1f];

										for (i_26 = 0; i_26 < icomponentdefinitions_12.anIntArray1315.length; i_26++) {
											if (i_25 == icomponentdefinitions_12.anIntArray1315[i_26]) {
												hookrequest_54 = new HookRequest();
												hookrequest_54.iComponentDefs = icomponentdefinitions_12;
												hookrequest_54.params = icomponentdefinitions_12.anObjectArray1403;
												aClass482_7402.append(hookrequest_54);
												break label969;
											}
										}
									}
								} else {
									hookrequest_53 = new HookRequest();
									hookrequest_53.iComponentDefs = icomponentdefinitions_12;
									hookrequest_53.params = icomponentdefinitions_12.anObjectArray1403;
									aClass482_7402.append(hookrequest_53);
								}

								icomponentdefinitions_12.anInt1446 = anInt7368;
							}

							if (icomponentdefinitions_12.anObjectArray1405 != null && anInt7388 > icomponentdefinitions_12.anInt1447) {
								if (icomponentdefinitions_12.anIntArray1406 != null && anInt7388 - icomponentdefinitions_12.anInt1447 <= 32) {
									label945: for (i_24 = icomponentdefinitions_12.anInt1447; i_24 < anInt7388; i_24++) {
										i_25 = anIntArray7387[i_24 & 0x1f];

										for (i_26 = 0; i_26 < icomponentdefinitions_12.anIntArray1406.length; i_26++) {
											if (i_25 == icomponentdefinitions_12.anIntArray1406[i_26]) {
												hookrequest_54 = new HookRequest();
												hookrequest_54.iComponentDefs = icomponentdefinitions_12;
												hookrequest_54.params = icomponentdefinitions_12.anObjectArray1405;
												aClass482_7402.append(hookrequest_54);
												break label945;
											}
										}
									}
								} else {
									hookrequest_53 = new HookRequest();
									hookrequest_53.iComponentDefs = icomponentdefinitions_12;
									hookrequest_53.params = icomponentdefinitions_12.anObjectArray1405;
									aClass482_7402.append(hookrequest_53);
								}

								icomponentdefinitions_12.anInt1447 = anInt7388;
							}

							if (icomponentdefinitions_12.anObjectArray1397 != null && anInt7453 > icomponentdefinitions_12.anInt1443) {
								if (icomponentdefinitions_12.anIntArray1401 != null && anInt7453 - icomponentdefinitions_12.anInt1443 <= 32) {
									label921: for (i_24 = icomponentdefinitions_12.anInt1443; i_24 < anInt7453; i_24++) {
										i_25 = anIntArray7379[i_24 & 0x1f];

										for (i_26 = 0; i_26 < icomponentdefinitions_12.anIntArray1401.length; i_26++) {
											if (i_25 == icomponentdefinitions_12.anIntArray1401[i_26]) {
												hookrequest_54 = new HookRequest();
												hookrequest_54.iComponentDefs = icomponentdefinitions_12;
												hookrequest_54.params = icomponentdefinitions_12.anObjectArray1397;
												aClass482_7402.append(hookrequest_54);
												break label921;
											}
										}
									}
								} else {
									hookrequest_53 = new HookRequest();
									hookrequest_53.iComponentDefs = icomponentdefinitions_12;
									hookrequest_53.params = icomponentdefinitions_12.anObjectArray1397;
									aClass482_7402.append(hookrequest_53);
								}

								icomponentdefinitions_12.anInt1443 = anInt7453;
							}

							if (icomponentdefinitions_12.anObjectArray1342 != null && anInt7382 > icomponentdefinitions_12.anInt1444) {
								if (icomponentdefinitions_12.anIntArray1398 != null && anInt7382 - icomponentdefinitions_12.anInt1444 <= 32) {
									label897: for (i_24 = icomponentdefinitions_12.anInt1444; i_24 < anInt7382; i_24++) {
										i_25 = anIntArray7381[i_24 & 0x1f];

										for (i_26 = 0; i_26 < icomponentdefinitions_12.anIntArray1398.length; i_26++) {
											if (i_25 == icomponentdefinitions_12.anIntArray1398[i_26]) {
												hookrequest_54 = new HookRequest();
												hookrequest_54.iComponentDefs = icomponentdefinitions_12;
												hookrequest_54.params = icomponentdefinitions_12.anObjectArray1342;
												aClass482_7402.append(hookrequest_54);
												break label897;
											}
										}
									}
								} else {
									hookrequest_53 = new HookRequest();
									hookrequest_53.iComponentDefs = icomponentdefinitions_12;
									hookrequest_53.params = icomponentdefinitions_12.anObjectArray1342;
									aClass482_7402.append(hookrequest_53);
								}

								icomponentdefinitions_12.anInt1444 = anInt7382;
							}

							if (icomponentdefinitions_12.anObjectArray1387 != null && anInt7384 > icomponentdefinitions_12.anInt1445) {
								if (icomponentdefinitions_12.anIntArray1402 != null && anInt7384 - icomponentdefinitions_12.anInt1445 <= 32) {
									label873: for (i_24 = icomponentdefinitions_12.anInt1445; i_24 < anInt7384; i_24++) {
										i_25 = anIntArray7283[i_24 & 0x1f];

										for (i_26 = 0; i_26 < icomponentdefinitions_12.anIntArray1402.length; i_26++) {
											if (i_25 == icomponentdefinitions_12.anIntArray1402[i_26]) {
												hookrequest_54 = new HookRequest();
												hookrequest_54.iComponentDefs = icomponentdefinitions_12;
												hookrequest_54.params = icomponentdefinitions_12.anObjectArray1387;
												aClass482_7402.append(hookrequest_54);
												break label873;
											}
										}
									}
								} else {
									hookrequest_53 = new HookRequest();
									hookrequest_53.iComponentDefs = icomponentdefinitions_12;
									hookrequest_53.params = icomponentdefinitions_12.anObjectArray1387;
									aClass482_7402.append(hookrequest_53);
								}

								icomponentdefinitions_12.anInt1445 = anInt7384;
							}

							if (icomponentdefinitions_12.anObjectArray1407 != null && CLAN_VAR_COUNTER > icomponentdefinitions_12.anInt1448) {
								if (icomponentdefinitions_12.anIntArray1408 != null && CLAN_VAR_COUNTER - icomponentdefinitions_12.anInt1448 <= 32) {
									label849: for (i_24 = icomponentdefinitions_12.anInt1448; i_24 < CLAN_VAR_COUNTER; i_24++) {
										i_25 = CLAN_VAR_KEYS[i_24 & 0x1f];

										for (i_26 = 0; i_26 < icomponentdefinitions_12.anIntArray1408.length; i_26++) {
											if (i_25 == icomponentdefinitions_12.anIntArray1408[i_26]) {
												hookrequest_54 = new HookRequest();
												hookrequest_54.iComponentDefs = icomponentdefinitions_12;
												hookrequest_54.params = icomponentdefinitions_12.anObjectArray1407;
												aClass482_7402.append(hookrequest_54);
												break label849;
											}
										}
									}
								} else {
									hookrequest_53 = new HookRequest();
									hookrequest_53.iComponentDefs = icomponentdefinitions_12;
									hookrequest_53.params = icomponentdefinitions_12.anObjectArray1407;
									aClass482_7402.append(hookrequest_53);
								}

								icomponentdefinitions_12.anInt1448 = CLAN_VAR_COUNTER;
							}

							if (anInt7391 > icomponentdefinitions_12.anInt1442 && icomponentdefinitions_12.anObjectArray1413 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1413;
								aClass482_7402.append(hookrequest_53);
							}

							if (anInt7386 > icomponentdefinitions_12.anInt1442 && icomponentdefinitions_12.anObjectArray1415 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1415;
								aClass482_7402.append(hookrequest_53);
							}

							if (anInt7179 > icomponentdefinitions_12.anInt1442 && icomponentdefinitions_12.anObjectArray1416 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1416;
								aClass482_7402.append(hookrequest_53);
							}

							if (anInt7192 > icomponentdefinitions_12.anInt1442 && icomponentdefinitions_12.anObjectArray1383 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1383;
								aClass482_7402.append(hookrequest_53);
							}

							if (anInt7395 > icomponentdefinitions_12.anInt1442 && icomponentdefinitions_12.anObjectArray1418 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1418;
								aClass482_7402.append(hookrequest_53);
							}

							if (anInt7320 > icomponentdefinitions_12.anInt1442 && icomponentdefinitions_12.anObjectArray1361 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1361;
								aClass482_7402.append(hookrequest_53);
							}

							if (anInt7397 > icomponentdefinitions_12.anInt1442 && icomponentdefinitions_12.anObjectArray1419 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1419;
								aClass482_7402.append(hookrequest_53);
							}

							icomponentdefinitions_12.anInt1442 = anInt7347;
							if (icomponentdefinitions_12.anObjectArray1292 != null) {
								for (i_24 = 0; i_24 < anInt7193; i_24++) {
									HookRequest hookrequest_44 = new HookRequest();
									hookrequest_44.iComponentDefs = icomponentdefinitions_12;
									hookrequest_44.anInt8058 = KEYS_PRESSED[i_24].method92();
									hookrequest_44.anInt8056 = KEYS_PRESSED[i_24].getCode(-1306556341);
									hookrequest_44.params = icomponentdefinitions_12.anObjectArray1292;
									aClass482_7402.append(hookrequest_44);
								}
							}

							if (aBool7355 && icomponentdefinitions_12.anObjectArray1353 != null) {
								hookrequest_53 = new HookRequest();
								hookrequest_53.iComponentDefs = icomponentdefinitions_12;
								hookrequest_53.params = icomponentdefinitions_12.anObjectArray1353;
								aClass482_7402.append(hookrequest_53);
							}
						}

						if (icomponentdefinitions_12.type == 5 && icomponentdefinitions_12.anInt1404 != -1) {
							icomponentdefinitions_12.method2027(IndexLoaders.SKYBOX_LOADER, IndexLoaders.SUN_LOADER, -1847543291).method4217(Renderers.SOFTWARE_RENDERER, icomponentdefinitions_12.anInt1429, Class393.preferences.aClass468_Sub14_8211.method12728());
						}

						Class86.method1482(icomponentdefinitions_12, (byte) 9);
						if (icomponentdefinitions_12.type == 0) {
							method11768(interface_0, arr_1, icomponentdefinitions_12.idHash, i_15, i_16, i_17, i_18, i_13 - icomponentdefinitions_12.anInt1311, i_14 - icomponentdefinitions_12.anInt1312, i_9, i_10);
							if (icomponentdefinitions_12.aClass118Array1439 != null) {
								method11768(interface_0, icomponentdefinitions_12.aClass118Array1439, icomponentdefinitions_12.idHash, i_15, i_16, i_17, i_18, i_13 - icomponentdefinitions_12.anInt1311, i_14 - icomponentdefinitions_12.anInt1312, i_9, i_10);
							}

							Class282_Sub44 class282_sub44_58 = (Class282_Sub44) aClass465_7442.get((long) icomponentdefinitions_12.idHash);
							if (class282_sub44_58 != null) {
								if (Game.darkan == CURRENT_GAME && class282_sub44_58.anInt8062 == 0 && !Class20.aBool161 && bool_48 && !aBool7168) {
									HitsplatDefinitions.method3851();
								}

								LightIntensityIndexLoader.method7313(class282_sub44_58, class282_sub44_58.anInt8063, i_15, i_16, i_17, i_18, i_13, i_14, i_9, i_10, (byte) -89);
							}
						}
					}
				}
			}
		}

	}

	public final void method166() {
		if (this.method4665((byte) 92)) {
			String str_1 = "";
			Class358[] arr_2 = Class153.method2619(-239279481);

			for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
				Class358 class358_4 = arr_2[i_3];
				String string_7 = Class282_Sub44.anApplet8065.getParameter(class358_4.aString4159);
				if (string_7 != null) {
					switch (Integer.parseInt(class358_4.aString4159)) {
					case 1:
						if (string_7 != null) {
							aByteArray7152 = Class378.method6436(CutsceneEntity.method1353(string_7), -1465976305);
							if (aByteArray7152.length < 16) {
								aByteArray7152 = null;
							}
						}
						break;
					case 2:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7158 = true;
						} else {
							aBool7158 = false;
						}
						break;
					case 3:
						aString7165 = string_7;
						break;
					case 4:
						aString7156 = string_7;
						if (aString7156.length() > 100) {
							aString7156 = null;
						}
						break;
					case 5:
						if (Class448.lobbyConnectionInfo == null) {
							Class448.lobbyConnectionInfo = new ConnectionInfo();
						}

						Class448.lobbyConnectionInfo.host = string_7;
						break;
					case 6:
						TilestreamPacket.anInt4219 = Integer.parseInt(string_7) * -37116627 * -520818011;
						break;
					case 7:
						str_1 = string_7;
						break;
					case 8:
						CURRENT_GAME = IncomingPacket.method6376(Integer.parseInt(string_7));
						break;
					case 9:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7310 = true;
						} else {
							aBool7310 = false;
						}
						break;
					case 10:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7147 = true;
						} else {
							aBool7147 = false;
						}
						break;
					case 11:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7161 = true;
						} else {
							aBool7161 = false;
						}
					case 12:
					case 21:
						break;
					case 13:
						Class464.aString5555 = string_7;
						break;
					case 14:
						if (Class448.lobbyConnectionInfo == null) {
							Class448.lobbyConnectionInfo = new ConnectionInfo();
						}

						Class448.lobbyConnectionInfo.worldId = Integer.parseInt(string_7) * -1933199413 * -87869981;
						break;
					case 15:
						Class176.aClass472_2201 = Class182.method3040(Integer.parseInt(string_7), (byte) -45);
						if (Class176.aClass472_2201 != Class472.aClass472_5599 && Class472.aClass472_5598 != Class176.aClass472_2201 && Class176.aClass472_2201 != Class472.aClass472_5596 && Class176.aClass472_2201 != Class472.aClass472_5600) {
							Class176.aClass472_2201 = Class472.aClass472_5600;
						}
						break;
					case 16:
						Class448.aClass450_5420 = new ConnectionInfo();
						Class448.aClass450_5420.worldId = Integer.parseInt(string_7) * -1933199413 * -87869981;
						break;
					case 17:
						aString7164 = string_7;
						break;
					case 18:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7316 = true;
						}
						break;
					case 19:
					default:
						Class151.method2594("", new RuntimeException(), (byte) -45);
						break;
					case 20:
						aString7157 = string_7;
						break;
					case 22:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7160 = true;
						} else {
							aBool7160 = false;
						}
						break;
					case 23:
						anInt7149 = Integer.parseInt(string_7) * 1564360473 * -1543197399;
						break;
					case 24:
						HDWaterTile.aClass496_952 = (Class496) Class386.identify(Class496.method8299(), Integer.parseInt(string_7));
						if (Class496.aClass496_5810 == HDWaterTile.aClass496_952) {
							HDWaterTile.aClass496_952 = Class496.aClass496_5807;
						} else if (!Class496.method8308(HDWaterTile.aClass496_952, 1812698195) && Class496.aClass496_5813 != HDWaterTile.aClass496_952) {
							HDWaterTile.aClass496_952 = Class496.aClass496_5813;
						}
						break;
					case 25:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7159 = true;
						} else {
							aBool7159 = false;
						}
						break;
					case 26:
						aLong7153 = Long.parseLong(string_7) * -5626745816563543837L * -8972807970865466165L;
						break;
					case 27:
						anInt7163 = Integer.parseInt(string_7) * -874138425 * 204524791;
						break;
					case 28:
						if (string_7.equals("true")) {
							aBool7189 = true;
						} else {
							aBool7189 = false;
						}
						break;
					case 29:
						if (string_7.equals("true")) {
							aBool7151 = true;
						} else {
							aBool7151 = false;
						}
						break;
					case 30:
						RenderAnimDefs.anInt2831 = Integer.parseInt(string_7) * -917544917 * -1439277437;
						break;
					case 31:
						Class223.CURRENT_LANGUAGE = Language.method8278(Integer.parseInt(string_7), 922881218);
						break;
					case 32:
						RegionMap.aString3643 = string_7;
						break;
					case 33:
						aString7281 = string_7;
						break;
					case 34:
						Class445.aString5384 = string_7;
						break;
					case 35:
						anInt7447 = Integer.parseInt(string_7) * 826882953 * 1920182969;
						if (1920182969 * anInt7447 * 826882953 < 0 || anInt7447 * 826882953 * 1920182969 >= aColorArray7186.length) {
							anInt7447 = 0 * 1920182969;
						}
					}
				}
			}

			if (aString7281 == null) {
				aString7281 = "";
			}

			Class274 class274_6 = new Class274(150480619 * anInt7439 * 1426041429 * 765 * -1115795005, 1176039023 * anInt7312 * -994133479 * 553 * -645779313, anInt7309 * -2059193329 * 1226390255, anInt7205 * 76833159 * 429626423, CURRENT_GAME.aString5749);
			Class308.aclient3620 = this;
			String string_8 = Class176.aClass472_2201.aString5601;
			int i_5 = -2001827121 * Class176.aClass472_2201.anInt5602 * 886324271 + 32;
			if (!str_1.equals("")) {
				string_8 = string_8 + "_" + str_1;
				i_5 = 0;
			}

			this.method4655(class274_6, CURRENT_GAME.aString5748, string_8, i_5, Class123.method2149(), aBool7161, 1826658639);
		}

	}

	final void method4762() {
		if (Class393.preferences.currentToolkit.getValue(2074046994) == 2) {
			try {
				this.method11620(-1556566629);
			} catch (ThreadDeath threaddeath_2) {
				throw threaddeath_2;
			} catch (Throwable throwable_3) {
				Class151.method2594(throwable_3.getMessage() + " " + this.method4669(1026019021), throwable_3, (byte) -92);
				aBool7171 = true;
				ParticleProducer.method11500(0, false);
			}
		} else {
			this.method11620(-642104427);
		}

	}

	final void method4714() {
		if (aBool7400) {
			Class282_Sub11.method12211(-2040156931);
		}

		Class28.method772((byte) 124);
		if (Renderers.SOFTWARE_RENDERER != null) {
			Renderers.SOFTWARE_RENDERER.method8396(1980757736);
		}

		if (Class475.supportsFullScreen && fullScreenFrame != null) {
			Class329.method5903(Class274.aClass470_3336, fullScreenFrame, -1941222213);
			fullScreenFrame = null;
		}

		aClass184_7475.method3051((byte) -122);
		aClass184_7475.aClass7_2299.method347(-669506484);
		connectionContext.method3051((byte) -84);
		connectionContext.aClass7_2299.method347(1264741540);
		Class278_Sub1.method13449((byte) -20);
		Class119.JS5_STANDARD_REQUESTER.method5525(1906332744);
		Whirlpool.JS5_LOCAL_REQUESTER.method5565((byte) 68);
		if (aClass508_7223 != null) {
			aClass508_7223.method8733();
			aClass508_7223 = null;
		}

		try {
			Ping.quit();
		} catch (Throwable throwable_4) {
			;
		}

		Class176.method2977(1319465646);

		try {
			Class277.method4907();
		} catch (Exception exception_3) {
			;
		}

		if (aBool3259) {
			Class480.method8043(-1246779141);
		}

	}

	final void method4676() {
		Frame frame_2 = new Frame(" ");
		frame_2.pack();
		frame_2.dispose();
		Class221.aClass118_2763 = new IComponentDefinitions();
		Class532_Sub1.method12840(1319563672);
		Whirlpool.JS5_LOCAL_REQUESTER = new JS5LocalRequester();
		Class119.JS5_STANDARD_REQUESTER = new Class312_Sub1();
		Class239.method4090(new int[] { 20, 260 }, new int[] { 1000, 100 }, -196172746);
		Vector3.initVectorStack();
		Quaternion.method6493();
		ItemDefinitions.method7141((byte) -39);
		Class282_Sub41_Sub3.method14807(-741497337);
		if (Class496.aClass496_5813 != HDWaterTile.aClass496_952) {
			Class339.aByteArrayArray3986 = new byte[50][];
		}

		Class393.preferences = Class225_Sub1.method12791();
		if (Class393.preferences.aClass468_Sub3_8199.method12632(100736861) == 1) {
			SceneObjectManager.aBool2644 = false;
		}

		if (Class496.aClass496_5813 == HDWaterTile.aClass496_952) {
			Class448.aClass450_5420.host = Class282_Sub44.anApplet8065.getCodeBase().getHost();
		} else if (Class496.method8308(HDWaterTile.aClass496_952, 1661844371)) {
			Class448.aClass450_5420.host = Class282_Sub44.anApplet8065.getCodeBase().getHost();
			Class448.aClass450_5420.anInt5434 = Class448.aClass450_5420.worldId * -1708079975 + 1140744768;
			Class448.lobbyConnectionInfo.anInt5434 = Class448.lobbyConnectionInfo.worldId * -1708079975 + 1140744768;
			Class448.aClass450_5420.anInt5437 = Class448.aClass450_5420.worldId * -1473668237 + 1047080176;
			Class448.lobbyConnectionInfo.anInt5437 = Class448.lobbyConnectionInfo.worldId * -1473668237 + 1047080176;
		} else if (Class496.aClass496_5810 == HDWaterTile.aClass496_952) {
			Class448.aClass450_5420.host = "127.0.0.1";
			Class448.lobbyConnectionInfo.host = "127.0.0.1";
			Class448.aClass450_5420.anInt5434 = Class448.aClass450_5420.worldId * -1708079975 + 1140744768;
			Class448.lobbyConnectionInfo.anInt5434 = Class448.lobbyConnectionInfo.worldId * -1708079975 + 1140744768;
			Class448.aClass450_5420.anInt5437 = Class448.aClass450_5420.worldId * -1473668237 + 1047080176;
			Class448.lobbyConnectionInfo.anInt5437 = Class448.lobbyConnectionInfo.worldId * -1473668237 + 1047080176;
		}

		Class159.GAME_CONNECTION_INFO = Class448.aClass450_5420;
		if (Game.darkan == CURRENT_GAME) {
			aBool7372 = false;
		}

		Class455.aShortArray5452 = ObjectDefinitions.aShortArray5691 = NPCDefinitions.aShortArray4862 = ItemDefinitions.staticColorArr256 = new short[256];

		try {
			Class182.aClipboard2263 = Class371.getActiveContainer().getToolkit().getSystemClipboard();
		} catch (Exception exception_4) {
			;
		}

		Class96_Sub21.keyRecorder = Class325.method5787(Class351.gameCanvas);
		Class163.mouseRecorder = FontRenderer.method400(Class351.gameCanvas, (byte) -76);
		if (Class496.aClass496_5813 != HDWaterTile.aClass496_952) {
			aBool7176 = true;
		}

		aString3252 = Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -876841091);
		IndexLoaders.MAP_REGION_LOADER_THREAD = new MapRegionLoaderTask();
		(new Thread(IndexLoaders.MAP_REGION_LOADER_THREAD)).start();
	}

	final void method4690() {
		if (aBool7400) {
			Class282_Sub11.method12211(-2074127322);
		}

		Class28.method772((byte) 94);
		if (Renderers.SOFTWARE_RENDERER != null) {
			Renderers.SOFTWARE_RENDERER.method8396(-2758306);
		}

		if (Class475.supportsFullScreen && fullScreenFrame != null) {
			Class329.method5903(Class274.aClass470_3336, fullScreenFrame, -1141031774);
			fullScreenFrame = null;
		}

		aClass184_7475.method3051((byte) -43);
		aClass184_7475.aClass7_2299.method347(2071949527);
		connectionContext.method3051((byte) -77);
		connectionContext.aClass7_2299.method347(-1713928547);
		Class278_Sub1.method13449((byte) 10);
		Class119.JS5_STANDARD_REQUESTER.method5525(-411822521);
		Whirlpool.JS5_LOCAL_REQUESTER.method5565((byte) 4);
		if (aClass508_7223 != null) {
			aClass508_7223.method8733();
			aClass508_7223 = null;
		}

		try {
			Ping.quit();
		} catch (Throwable throwable_3) {
			;
		}

		Class176.method2977(510613699);

		try {
			Class277.method4907();
		} catch (Exception exception_2) {
			;
		}

		if (aBool3259) {
			Class480.method8043(-1155407572);
		}

	}

	final void method12044(short s_1) {
		int i_2;
		if (gameState == 0 && !JS5CacheFile.method3360((byte) -61) || gameState == 7 && Class9.anInt106 == 42 || gameState == 3) {
			if (anInt7178 > 1) {
				--anInt7178;
				anInt7397 = anInt7347;
			}

			if (!Class20.aBool161) {
				HitsplatDefinitions.method3851();
			}

			for (i_2 = 0; i_2 < 100 && Class8_Sub3.method14338(connectionContext); i_2++) {
				;
			}
		}

		PulseEvent.processPulseEvents();
		RenderAnimIndexLoader.method3630();
		++anInt7261;
		Class380.method6451(-1, -1, 703434359);
		Class15.method544((IComponentDefinitions) null, -1, -1, 404067969);
		Class496.method8315(-2122533779);
		++anInt7347;

		for (i_2 = 0; i_2 < anInt7210; i_2++) {
			NPC npc_3 = (NPC) aClass282_Sub47Array7209[i_2].anObject8068;
			if (npc_3 != null) {
				byte b_4 = npc_3.definitions.walkMask;
				if ((b_4 & 0x1) != 0) {
					int i_5 = npc_3.getSize();
					int i_6;
					if ((b_4 & 0x2) != 0 && npc_3.anInt10355 == 0 && Math.random() * 1000.0D < 10.0D) {
						i_6 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						int i_7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (i_6 != 0 || i_7 != 0) {
							int i_8 = i_6 + npc_3.regionBaseX[0];
							int i_9 = i_7 + npc_3.regionBaseY[0];
							if (i_8 < 0) {
								i_8 = 0;
							} else if (i_8 > IndexLoaders.MAP_REGION_DECODER.getSizeX() - i_5 - 1) {
								i_8 = IndexLoaders.MAP_REGION_DECODER.getSizeX() - i_5 - 1;
							}

							if (i_9 < 0) {
								i_9 = 0;
							} else if (i_9 > IndexLoaders.MAP_REGION_DECODER.getSizeY() - i_5 - 1) {
								i_9 = IndexLoaders.MAP_REGION_DECODER.getSizeY() - i_5 - 1;
							}

							int i_10 = Class112.findRoute(npc_3.regionBaseX[0], npc_3.regionBaseY[0], i_5, Class190.method3150(i_8, i_9, i_5, i_5), IndexLoaders.MAP_REGION_DECODER.getClipMap(npc_3.plane), true, walkStepsX, walkStepsY, -22174447);
							if (i_10 > 0) {
								if (i_10 > 9) {
									i_10 = 9;
								}

								for (int i_11 = 0; i_11 < i_10; i_11++) {
									npc_3.regionBaseX[i_11] = walkStepsX[i_10 - i_11 - 1];
									npc_3.regionBaseY[i_11] = walkStepsY[i_10 - i_11 - 1];
									npc_3.walkTypes[i_11] = MovementType.WALKING.id;
								}

								npc_3.anInt10355 = i_10;
							}
						}
					}

					SystemInfo.method13466(npc_3, true);
					i_6 = MapSpriteIndexLoader.method7188(npc_3);
					WallDecoration.method16087(npc_3);
					Class302.handleMovementAnimations(npc_3, IdentikitDefinition.anInt430, Class8_Sub1.anInt8515, i_6, 852225468);
					Class236.method3985(npc_3, IdentikitDefinition.anInt430, (byte) -74);
					Class150.method2581(npc_3, 818834728);
					Quaternion quaternion_12 = Quaternion.create();
					quaternion_12.romYawPitchRoll(Class382.method6508(npc_3.aClass19_10359.method578()), Class382.method6508(npc_3.aClass19_10330.method578()), Class382.method6508(npc_3.aClass19_10360.method578()));
					npc_3.method11187(quaternion_12);
					quaternion_12.cache();
				}
			}
		}

		if ((gameState == 5 || gameState == 7 || gameState == 0 || gameState == 3) && (!JS5CacheFile.method3360((byte) 40) || gameState == 7 && Class9.anInt106 == 42) && !Class85.method1466(787262715)) {
			if (NativeLibraryLoader.anInt3240 == 5) {
				Wall.method16113();
			} else {
				SpotAnimIndexLoader.method8860((byte) -121);
			}

			if (IdentitiKitIndexLoader.anInt361 >> 9 < 14 || IdentitiKitIndexLoader.anInt361 >> 9 >= IndexLoaders.MAP_REGION_DECODER.getSizeX() - 14 || Class246.anInt3029 >> 9 < 14 || Class246.anInt3029 >> 9 >= IndexLoaders.MAP_REGION_DECODER.getSizeY() - 14) {
				IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3154, (RsBitsBuffer) null), 919170648);
			}
		}

		while (true) {
			HookRequest hookrequest_13;
			IComponentDefinitions icomponentdefinitions_14;
			IComponentDefinitions icomponentdefinitions_16;
			do {
				hookrequest_13 = (HookRequest) aClass482_7233.popHead((byte) -106);
				if (hookrequest_13 == null) {
					while (true) {
						do {
							hookrequest_13 = (HookRequest) aClass482_7404.popHead((byte) -51);
							if (hookrequest_13 == null) {
								while (true) {
									do {
										hookrequest_13 = (HookRequest) aClass482_7402.popHead((byte) -66);
										if (hookrequest_13 == null) {
											if (aClass118_7257 != null) {
												Class161.method2827(1986248750);
											}

											if (cycles % 1500 == 0) {
												Class60.method1172(-1916310321);
											}

											if (gameState == 0 && !JS5CacheFile.method3360((byte) 10) || gameState == 7 && Class9.anInt106 == 42) {
												Class461.method7703();
											}

											SCT24Definitions.method7490();
											if (aBool7400 && aLong7401 < TextureDetails.time() - 60000L) {
												Class282_Sub11.method12211(133515669);
											}

											for (Class275_Sub4 class275_sub4_17 = (Class275_Sub4) aClass457_7350.method7659(); class275_sub4_17 != null; class275_sub4_17 = (Class275_Sub4) aClass457_7350.method7650((byte) 99)) {
												if ((long) class275_sub4_17.anInt7838 < TextureDetails.time() / 1000L - 5L) {
													if (class275_sub4_17.aShort7839 > 0) {
														Class191.method3167(5, 0, "", "", "", class275_sub4_17.aString7837 + Message.HAS_LOGGED_IN.translate(Class223.CURRENT_LANGUAGE, -1495775612), 1096465682);
													}

													if (class275_sub4_17.aShort7839 == 0) {
														Class191.method3167(5, 0, "", "", "", class275_sub4_17.aString7837 + Message.HAS_LOGGED_OUT.translate(Class223.CURRENT_LANGUAGE, -737324095), 1209993360);
													}

													class275_sub4_17.method4887();
												}
											}

											if (gameState == 0 && !JS5CacheFile.method3360((byte) 17) || gameState == 7 && Class9.anInt106 == 42 || gameState == 3) {
												if (gameState != 7 && connectionContext.getConnection() == null) {
													CursorIndexLoader.method7333(false, 2142128542);
												} else if (connectionContext != null) {
													++connectionContext.anInt2290;
													if (connectionContext.anInt2290 > 50) {
														TCPPacket tcpmessage_18 = Class271.method4828(OutgoingPacket.KEEP_ALIVE, connectionContext.isaac, 241462938);
														connectionContext.queuePacket(tcpmessage_18);
													}

													try {
														connectionContext.method3047(1630204206);
													} catch (IOException ioexception_15) {
														if (gameState == 7) {
															connectionContext.method3051((byte) -106);
														} else {
															CursorIndexLoader.method7333(false, 2058327064);
														}
													}
												}
											}

											return;
										}

										icomponentdefinitions_16 = hookrequest_13.iComponentDefs;
										if (icomponentdefinitions_16.anInt1288 < 0) {
											break;
										}

										icomponentdefinitions_14 = IComponentDefinitions.getDefs(icomponentdefinitions_16.parent);
									} while (icomponentdefinitions_14 == null || icomponentdefinitions_14.aClass118Array1438 == null || icomponentdefinitions_16.anInt1288 >= icomponentdefinitions_14.aClass118Array1438.length || icomponentdefinitions_16 != icomponentdefinitions_14.aClass118Array1438[icomponentdefinitions_16.anInt1288]);

									CS2Executor.executeHookInner200k(hookrequest_13, 970362287);
								}
							}

							icomponentdefinitions_16 = hookrequest_13.iComponentDefs;
							if (icomponentdefinitions_16.anInt1288 < 0) {
								break;
							}

							icomponentdefinitions_14 = IComponentDefinitions.getDefs(icomponentdefinitions_16.parent);
						} while (icomponentdefinitions_14 == null || icomponentdefinitions_14.aClass118Array1438 == null || icomponentdefinitions_16.anInt1288 >= icomponentdefinitions_14.aClass118Array1438.length || icomponentdefinitions_16 != icomponentdefinitions_14.aClass118Array1438[icomponentdefinitions_16.anInt1288]);

						CS2Executor.executeHookInner200k(hookrequest_13, 433740759);
					}
				}

				icomponentdefinitions_16 = hookrequest_13.iComponentDefs;
				if (icomponentdefinitions_16.anInt1288 < 0) {
					break;
				}

				icomponentdefinitions_14 = IComponentDefinitions.getDefs(icomponentdefinitions_16.parent);
			} while (icomponentdefinitions_14 == null || icomponentdefinitions_14.aClass118Array1438 == null || icomponentdefinitions_16.anInt1288 >= icomponentdefinitions_14.aClass118Array1438.length || icomponentdefinitions_16 != icomponentdefinitions_14.aClass118Array1438[icomponentdefinitions_16.anInt1288]);

			CS2Executor.executeHookInner200k(hookrequest_13, 60192385);
		}
	}

	public final void method165() {
		if (this.method4665((byte) 79)) {
			String str_1 = "";
			Class358[] arr_2 = Class153.method2619(1235722465);

			for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
				Class358 class358_4 = arr_2[i_3];
				String string_7 = Class282_Sub44.anApplet8065.getParameter(class358_4.aString4159);
				if (string_7 != null) {
					switch (Integer.parseInt(class358_4.aString4159)) {
					case 1:
						if (string_7 != null) {
							aByteArray7152 = Class378.method6436(CutsceneEntity.method1353(string_7), -2067601059);
							if (aByteArray7152.length < 16) {
								aByteArray7152 = null;
							}
						}
						break;
					case 2:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7158 = true;
						} else {
							aBool7158 = false;
						}
						break;
					case 3:
						aString7165 = string_7;
						break;
					case 4:
						aString7156 = string_7;
						if (aString7156.length() > 100) {
							aString7156 = null;
						}
						break;
					case 5:
						if (Class448.lobbyConnectionInfo == null) {
							Class448.lobbyConnectionInfo = new ConnectionInfo();
						}

						Class448.lobbyConnectionInfo.host = string_7;
						break;
					case 6:
						TilestreamPacket.anInt4219 = Integer.parseInt(string_7) * -37116627 * -520818011;
						break;
					case 7:
						str_1 = string_7;
						break;
					case 8:
						CURRENT_GAME = IncomingPacket.method6376(Integer.parseInt(string_7));
						break;
					case 9:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7310 = true;
						} else {
							aBool7310 = false;
						}
						break;
					case 10:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7147 = true;
						} else {
							aBool7147 = false;
						}
						break;
					case 11:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7161 = true;
						} else {
							aBool7161 = false;
						}
					case 12:
					case 21:
						break;
					case 13:
						Class464.aString5555 = string_7;
						break;
					case 14:
						if (Class448.lobbyConnectionInfo == null) {
							Class448.lobbyConnectionInfo = new ConnectionInfo();
						}

						Class448.lobbyConnectionInfo.worldId = Integer.parseInt(string_7) * -1933199413 * -87869981;
						break;
					case 15:
						Class176.aClass472_2201 = Class182.method3040(Integer.parseInt(string_7), (byte) -42);
						if (Class176.aClass472_2201 != Class472.aClass472_5599 && Class472.aClass472_5598 != Class176.aClass472_2201 && Class176.aClass472_2201 != Class472.aClass472_5596 && Class176.aClass472_2201 != Class472.aClass472_5600) {
							Class176.aClass472_2201 = Class472.aClass472_5600;
						}
						break;
					case 16:
						Class448.aClass450_5420 = new ConnectionInfo();
						Class448.aClass450_5420.worldId = Integer.parseInt(string_7) * -1933199413 * -87869981;
						break;
					case 17:
						aString7164 = string_7;
						break;
					case 18:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7316 = true;
						}
						break;
					case 19:
					default:
						Class151.method2594("", new RuntimeException(), (byte) -46);
						break;
					case 20:
						aString7157 = string_7;
						break;
					case 22:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7160 = true;
						} else {
							aBool7160 = false;
						}
						break;
					case 23:
						anInt7149 = Integer.parseInt(string_7) * 1564360473 * -1543197399;
						break;
					case 24:
						HDWaterTile.aClass496_952 = (Class496) Class386.identify(Class496.method8299(), Integer.parseInt(string_7));
						if (Class496.aClass496_5810 == HDWaterTile.aClass496_952) {
							HDWaterTile.aClass496_952 = Class496.aClass496_5807;
						} else if (!Class496.method8308(HDWaterTile.aClass496_952, 1676029063) && Class496.aClass496_5813 != HDWaterTile.aClass496_952) {
							HDWaterTile.aClass496_952 = Class496.aClass496_5813;
						}
						break;
					case 25:
						if (string_7.equalsIgnoreCase("true")) {
							aBool7159 = true;
						} else {
							aBool7159 = false;
						}
						break;
					case 26:
						aLong7153 = Long.parseLong(string_7) * -5626745816563543837L * -8972807970865466165L;
						break;
					case 27:
						anInt7163 = Integer.parseInt(string_7) * -874138425 * 204524791;
						break;
					case 28:
						if (string_7.equals("true")) {
							aBool7189 = true;
						} else {
							aBool7189 = false;
						}
						break;
					case 29:
						if (string_7.equals("true")) {
							aBool7151 = true;
						} else {
							aBool7151 = false;
						}
						break;
					case 30:
						RenderAnimDefs.anInt2831 = Integer.parseInt(string_7) * -917544917 * -1439277437;
						break;
					case 31:
						Class223.CURRENT_LANGUAGE = Language.method8278(Integer.parseInt(string_7), -1464008019);
						break;
					case 32:
						RegionMap.aString3643 = string_7;
						break;
					case 33:
						aString7281 = string_7;
						break;
					case 34:
						Class445.aString5384 = string_7;
						break;
					case 35:
						anInt7447 = Integer.parseInt(string_7) * 826882953 * 1920182969;
						if (1920182969 * anInt7447 * 826882953 < 0 || anInt7447 * 826882953 * 1920182969 >= aColorArray7186.length) {
							anInt7447 = 0 * 1920182969;
						}
					}
				}
			}

			if (aString7281 == null) {
				aString7281 = "";
			}

			Class274 class274_6 = new Class274(150480619 * anInt7439 * 1426041429 * 765 * -1115795005, 1176039023 * anInt7312 * -994133479 * 553 * -645779313, anInt7309 * -2059193329 * 1226390255, anInt7205 * 76833159 * 429626423, CURRENT_GAME.aString5749);
			Class308.aclient3620 = this;
			String string_8 = Class176.aClass472_2201.aString5601;
			int i_5 = -2001827121 * Class176.aClass472_2201.anInt5602 * 886324271 + 32;
			if (!str_1.equals("")) {
				string_8 = string_8 + "_" + str_1;
				i_5 = 0;
			}

			this.method4655(class274_6, CURRENT_GAME.aString5748, string_8, i_5, Class123.method2149(), aBool7161, -187113750);
		}

	}

	static final void method12073(int i_0, int i_1, int i_2) {
		if (Game.stellarDawn != CURRENT_GAME) {
			if (!MapRegion.routeTo(i_0, i_1, false, Class371.method6352(i_0, i_1, -1423689712), 928803696)) {
				MapRegion.routeTo(i_0, i_1, false, Class344.method6115(i_0, i_1, 1, 1), 1252373974);
			}
		} else if (!MapRegion.routeTo(i_0, i_1, false, Class344.method6115(i_0, i_1, 1, 1), 1016386097)) {
			MapRegion.routeTo(i_0, i_1, false, Class371.method6352(i_0, i_1, -1013496612), 1340706039);
		}

	}

}
