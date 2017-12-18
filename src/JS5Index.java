/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class JS5Index {
	public static JS5Index INDEX_24_QC_MESSAGE;
	public static JS5Index INDEX_8_SPRITES;
	public static JS5Index INDEX_2_CONFIG;
	public static JS5Index INDEX_3_INTERFACES;
	public static JS5Index INDEX_16_OBJECTS;
	public static JS5Index INDEX_5_LANDSCAPES;
	public static JS5Index INDEX_6_MUSIC;
	public static JS5Index INDEX_10_HUFFMAN;
	public static JS5Index INDEX_35_THEORA;
	public static JS5Index INDEX_9_TEXTURES;
	public static JS5Index INDEX_0_SKELETONS = new JS5Index(0);
	public static JS5Index INDEX_11_MUSIC2;
	public static JS5Index INDEX_1_SKINS = new JS5Index(1);
	public static JS5Index INDEX_13_FONTS;
	public static JS5Index INDEX_14_SOUNDS2;
	public static JS5Index INDEX_15_SOUNDS3;
	public static JS5Index INDEX_29_UNKNOWN;
	public static JS5Index INDEX_17_CS2_SETTINGS;
	public static JS5Index INDEX_18_NPCS;
	public static JS5Index INDEX_20_ANIMATIONS;
	public static JS5Index INDEX_22_SCRIPT_CONFIG;
	public static JS5Index INDEX_21_GRAPHICS;
	public static JS5Index INDEX_12_CS2;
	public static JS5Index INDEX_31_SHADERS;
	public static JS5Index INDEX_7_MODELS;
	public static JS5Index INDEX_25_QC_MENU;
	public static JS5Index INDEX_26_UNKNOWN;
	public static JS5Index INDEX_27_UNKNOWN;
	public static JS5Index INDEX_28_UNKNOWN;
	public static JS5Index INDEX_30_NATIVES;
	public static JS5Index INDEX_4_SOUNDS;
	public static JS5Index INDEX_19_ITEMS;
	public static JS5Index INDEX_32_P11_FONTS;
	public static JS5Index INDEX_33_GAME_TIPS;
	public static JS5Index INDEX_34_P11_FONTS2;
	public static JS5Index INDEX_23_WORLD_MAP;
	public static JS5Index INDEX_36_VORBIS;
	int anInt1366;
	static int anInt1367;

	static {
		INDEX_2_CONFIG = new JS5Index(2);
		INDEX_3_INTERFACES = new JS5Index(3);
		INDEX_4_SOUNDS = new JS5Index(4);
		INDEX_5_LANDSCAPES = new JS5Index(5);
		INDEX_6_MUSIC = new JS5Index(6);
		INDEX_7_MODELS = new JS5Index(7);
		INDEX_8_SPRITES = new JS5Index(8);
		INDEX_9_TEXTURES = new JS5Index(9);
		INDEX_10_HUFFMAN = new JS5Index(10);
		INDEX_11_MUSIC2 = new JS5Index(11);
		INDEX_12_CS2 = new JS5Index(12);
		INDEX_13_FONTS = new JS5Index(13);
		INDEX_14_SOUNDS2 = new JS5Index(14);
		INDEX_15_SOUNDS3 = new JS5Index(15);
		INDEX_16_OBJECTS = new JS5Index(16);
		INDEX_17_CS2_SETTINGS = new JS5Index(17);
		INDEX_18_NPCS = new JS5Index(18);
		INDEX_19_ITEMS = new JS5Index(19);
		INDEX_20_ANIMATIONS = new JS5Index(20);
		INDEX_21_GRAPHICS = new JS5Index(21);
		INDEX_22_SCRIPT_CONFIG = new JS5Index(22);
		INDEX_23_WORLD_MAP = new JS5Index(23);
		INDEX_24_QC_MESSAGE = new JS5Index(24);
		INDEX_25_QC_MENU = new JS5Index(25);
		INDEX_26_UNKNOWN = new JS5Index(26);
		INDEX_27_UNKNOWN = new JS5Index(27);
		INDEX_28_UNKNOWN = new JS5Index(28);
		INDEX_29_UNKNOWN = new JS5Index(29);
		INDEX_30_NATIVES = new JS5Index(30);
		INDEX_31_SHADERS = new JS5Index(31);
		INDEX_32_P11_FONTS = new JS5Index(32);
		INDEX_33_GAME_TIPS = new JS5Index(33);
		INDEX_34_P11_FONTS2 = new JS5Index(34);
		INDEX_35_THEORA = new JS5Index(35);
		INDEX_36_VORBIS = new JS5Index(36);
		anInt1367 = 1700689323;
	}

	JS5Index(int i) {
		((JS5Index) this).anInt1366 = i * 1424986353;
	}

	public int getIndexId() {
		try {
			return ((JS5Index) this).anInt1366 * -1047699439;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("en.f(").append(')').toString());
		}
	}

	static final void method1234(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_1_ = client.aClass251Array8920[i_0_].method2400(-574288948);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_1_ == 5 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("en.ye(").append(')').toString());
		}
	}

	static final void method1235(IComponentDefinition class105, ClientScript2 class403, byte i) {
		try {
			Class505 class505 = class105.method1113(Class497.aClass197_6105, client.anInterface10_8700, (byte) 88);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_4_ = class505.method6261(class105.aString1212, class105.anInt1156 * -2093041337, class105.anInt1191 * 418216501, i_3_, i_2_, Class130_Sub2.aClass57Array6959, (byte) -62);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("en.qg(").append(')').toString());
		}
	}

	public static boolean method1236(int i, int i_5_) {
		try {
			return (i >= -1976050083 * Class424.aClass424_6612.anInt6613 && i <= Class424.aClass424_6597.anInt6613 * -1976050083);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("en.d(").append(')').toString());
		}
	}

	static final void method1237(ClientScript2 class403, int i) {
		try {
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7549, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), -800925761);
			Class3.method300(656179282);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("en.aix(").append(')').toString());
		}
	}

	public static Class456[] method1238(Class457 class457, short i) {
		try {
			int[] is = class457.method5961();
			Class456[] class456s = new Class456[is.length >> 2];
			for (int i_6_ = 0; i_6_ < class456s.length; i_6_++) {
				Class456 class456 = new Class456();
				class456s[i_6_] = class456;
				class456.anInt5663 = -1110150949 * is[i_6_ << 2];
				class456.anInt5665 = is[1 + (i_6_ << 2)] * 1756912603;
				class456.anInt5664 = 1912690475 * is[2 + (i_6_ << 2)];
				((Class456) class456).anInt5662 = 2041694879 * is[(i_6_ << 2) + 3];
			}
			return class456s;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("en.a(").append(')').toString());
		}
	}
}
