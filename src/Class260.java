/* Class260 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class260 {
	static final int anInt3217 = 0;
	static final int anInt3218 = 8192;
	static int anInt3219;
	public static boolean aBool3220;
	static Class277 aClass277_3221;
	static final int anInt3222 = 4096;
	public static int anInt3223 = -919080253;
	static final int anInt3224 = 4096;
	static final int anInt3225 = 16384;
	static final int anInt3226 = 16384;
	public static final int anInt3227 = 2;
	public static int anInt3228;
	static Class116 aClass116_3229;
	static final int anInt3230 = 50;
	static Class282_Sub15_Sub2 aClass282_Sub15_Sub2_3231;
	static Class268[] aClass268Array3232;
	static final int anInt3233 = 8192;
	static Class277 aClass277_3234;

	public static void method4571() {
		Class150.method2580(-1, 255, (byte) 16);
	}

	static {
		aBool3220 = false;
		anInt3228 = 1880658669;
		anInt3219 = 0;
		aClass268Array3232 = new Class268[50];
		aClass277_3221 = null;
		aClass277_3234 = null;
	}

	public static void method4572() {
		Class253.method4330(22050, Class393.aClass282_Sub54_4783.aClass468_Sub10_8215.method12691(119543123) == 1, 2);
		Class320.aClass253_3723 = Class253.method4331(Class351.gameCanvas, 0, 22050);
		Class42_Sub1.method14563(true, Class282_Sub20_Sub10.method15262(null, -1761346495), (short) 18381);
		Class100.aClass253_1008 = Class253.method4331(Class351.gameCanvas, 1, 2048);
		Class79.aClass282_Sub15_Sub4_783 = new Class282_Sub15_Sub4();
		Class100.aClass253_1008.method4329(Class79.aClass282_Sub15_Sub4_783);
		Class119.aClass344_1460 = new Class344(22050, Class253.anInt3129);
		Class468_Sub6.method12658(988925379);
	}

	static Class282_Sub15_Sub2 method4573(Class282_Sub15_Sub2 class282_sub15_sub2) {
		Class282_Sub15_Sub2 class282_sub15_sub2_0_ = (null == class282_sub15_sub2 ? new Class282_Sub15_Sub2() : new Class282_Sub15_Sub2(class282_sub15_sub2));
		class282_sub15_sub2_0_.method15137(9, 128, -959033506);
		return class282_sub15_sub2_0_;
	}

	static Class282_Sub15_Sub2 method4574(Class282_Sub15_Sub2 class282_sub15_sub2) {
		Class282_Sub15_Sub2 class282_sub15_sub2_1_ = (null == class282_sub15_sub2 ? new Class282_Sub15_Sub2() : new Class282_Sub15_Sub2(class282_sub15_sub2));
		class282_sub15_sub2_1_.method15137(9, 128, -877048462);
		return class282_sub15_sub2_1_;
	}

	public static void method4575() {
		Class278_Sub1.method13449((byte) -16);
		Class253.method4330(22050, Class393.aClass282_Sub54_4783.aClass468_Sub10_8215.method12691(-73319945) == 1, 2);
		Class320.aClass253_3723 = Class253.method4331(Class351.gameCanvas, 0, 22050);
		Class42_Sub1.method14563(true, Class282_Sub20_Sub10.method15262(null, -223983280), (short) 31488);
		Class100.aClass253_1008 = Class253.method4331(Class351.gameCanvas, 1, 2048);
		Class100.aClass253_1008.method4329(Class79.aClass282_Sub15_Sub4_783);
	}

	public static void method4576(int i, int i_2_, int i_3_) {
		if (aClass116_3229 != null && aClass116_3229.method1956(2093854110) && 773403033 * aClass116_3229.anInt1254 == i) {
			Class256.method4412(aClass116_3229, i_2_, -23828463);
			anInt3223 = i * 919080253;
			aClass116_3229 = null;
			aClass282_Sub15_Sub2_3231 = null;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4531, client.aClass184_7475.isaac, 2058137528);
			class282_sub23.buffer.writeInt(-1);
			client.aClass184_7475.method3049(class282_sub23, 1047416964);
		} else {
			i_2_ = i_2_ * Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(1862879949) >> 8;
			if (i == -1 && !aBool3220)
				Class226.method3805(-1719520107);
			else if (i != -1 && (1293234709 * anInt3223 != i || !Class116.method1966(1638394767)) && 0 != i_2_ && !aBool3220) {
				Class282_Sub1.method11615(i_3_, IndexLoaders.MUSIC_INDEX, i, 0, i_2_, false, new Class109_Sub1(), 2120891919);
				Class468_Sub6.method12658(-1664381146);
			}
			if (i != anInt3223 * 1293234709)
				aClass282_Sub15_Sub2_3231 = null;
			anInt3223 = i * 919080253;
			aClass277_3234 = null;
		}
	}

	static int method4577(int i, int i_4_) {
		double d = Math.log((double) i_4_) / Math.log(2.0);
		double d_5_ = Math.log((double) i) / Math.log(2.0);
		double d_6_ = Math.random() * (d - d_5_) + d_5_;
		return (int) (Math.pow(2.0, d_6_) + 0.5);
	}

	static void method4578(boolean bool, Class282_Sub15_Sub2 class282_sub15_sub2) {
		Class320.aClass253_3723.method4329(class282_sub15_sub2);
		if (bool)
			SharedConfigsType.method2084(IndexLoaders.INDEX_15, IndexLoaders.MIDI_INSTRUMENT_INDEX, IndexLoaders.SOUND_EFFECT_INDEX, class282_sub15_sub2, Class320.aClass253_3723, -1541261130);
	}

	static void method4579() {
		if (aClass277_3221 != null) {
			Vector3 class385 = Vector3.method6623(Class84.myPlayer.method11166().aClass385_3595);
			CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1057014816);
			class385.x += (float) (class219.x * 1948093437 << 9);
			class385.z += (float) (class219.y * -1002240017 << 9);
			class385.subtract((float) (((Class277) aClass277_3221).anInt3349 * -142397055), class385.y, (float) (-1830451005 * (((Class277) aClass277_3221).anInt3348)));
			float f = class385.magnitude();
			class385.method6624();
			float f_7_ = 0.0F;
			if (f < (float) (((Class277) aClass277_3221).anInt3351 * -495770161))
				f_7_ = 1.0F;
			else if (f > (float) (-453376919 * ((Class277) aClass277_3221).anInt3350))
				f_7_ = 0.0F;
			else {
				f -= (float) (-495770161 * ((Class277) aClass277_3221).anInt3351);
				f_7_ = 1.0F - f / (float) (((Class277) aClass277_3221).anInt3347 * -809965967);
			}
			Class187.method3121((int) (f_7_ * 256.0F), (short) -5821);
		}
	}

	public static void method4580() {
		if (Class320.aClass253_3723 != null)
			Class320.aClass253_3723.method4335();
		if (null != Class100.aClass253_1008)
			Class100.aClass253_1008.method4335();
	}

	public static void method4581() {
		if (Class320.aClass253_3723 != null)
			Class320.aClass253_3723.method4335();
		if (null != Class100.aClass253_1008)
			Class100.aClass253_1008.method4335();
	}

	public static void method4582() {
		if (Class320.aClass253_3723 != null)
			Class320.aClass253_3723.method4333();
		if (null != Class100.aClass253_1008)
			Class100.aClass253_1008.method4333();
	}

	public static void method4583() {
		for (int i = 0; i < -458827259 * anInt3219; i++) {
			Class268 class268 = aClass268Array3232[i];
			if (3 == ((Class268) class268).aByte3300)
				Class58.method1142(class268, 1283253628);
		}
	}

	public static void method4584() {
		if (Class320.aClass253_3723 != null)
			Class320.aClass253_3723.method4335();
		if (null != Class100.aClass253_1008)
			Class100.aClass253_1008.method4335();
	}

	public static void method4585(Class268 class268) {
		if (((Class268) class268).aClass282_Sub15_Sub5_3304 != null)
			Class79.aClass282_Sub15_Sub4_783.method15276(((Class268) class268).aClass282_Sub15_Sub5_3304);
		else
			((Class268) class268).anInt3297 = -2147483648;
	}

	public static void method4586() {
		aClass268Array3232 = new Class268[50];
		anInt3219 = 0;
	}

	public static void method4587(AnimationDefinitions class518, int i, Class521_Sub1 class521_sub1) {
		if (anInt3219 * -458827259 < 50 && (class518 != null && class518.anIntArrayArray5913 != null && i < class518.anIntArrayArray5913.length && null != class518.anIntArrayArray5913[i]) && (class521_sub1.plane == Class84.myPlayer.plane)) {
			int i_8_ = class518.anIntArrayArray5913[i][0];
			int i_9_ = i_8_ >> 8;
			int i_10_ = i_8_ >> 5 & 0x7;
			int i_11_ = i_8_ & 0x1f;
			if (class518.anIntArrayArray5913[i].length > 1) {
				int i_12_ = (int) (Math.random() * (double) (class518.anIntArrayArray5913[i]).length);
				if (i_12_ > 0)
					i_9_ = class518.anIntArrayArray5913[i][i_12_];
			}
			int i_13_ = 256;
			if (null != class518.anIntArray5927 && null != class518.anIntArray5919)
				i_13_ = ((int) (Math.random() * (double) (class518.anIntArray5919[i] - class518.anIntArray5927[i])) + class518.anIntArray5927[i]);
			int i_14_ = (null == class518.anIntArray5926 ? 255 : class518.anIntArray5926[i]);
			if (i_11_ == 0) {
				if (Class84.myPlayer == class521_sub1) {
					if (class518.aBool5928)
						Class435.method7300(i_9_, i_10_, 0, i_14_, false, i_13_, 1449989045);
					else
						Class153.method2618(i_9_, i_10_, 0, i_14_, i_13_, 1443083827);
				}
			} else {
				if (Class84.myPlayer == class521_sub1) {
					if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(-859280198) == 0)
						return;
				} else if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8193.method12714(-2120881535) == 0)
					return;
				Vector3 class385 = class521_sub1.method11166().aClass385_3595;
				int i_15_ = (int) class385.x - 256 >> 9;
				int i_16_ = (int) class385.z - 256 >> 9;
				int i_17_ = ((class521_sub1 == Class84.myPlayer) ? 0 : i_11_ + ((i_15_ << 16) + (class521_sub1.plane << 24) + (i_16_ << 8)));
				aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = new Class268(class518.aBool5928 ? (byte) 2 : (byte) 1, i_9_, i_10_, 0, i_14_, i_17_, i_13_, class521_sub1);
			}
		}
	}

	public static void method4588(AnimationDefinitions class518, int i, Class521_Sub1 class521_sub1) {
		if (anInt3219 * -458827259 < 50 && (class518 != null && class518.anIntArrayArray5913 != null && i < class518.anIntArrayArray5913.length && null != class518.anIntArrayArray5913[i]) && (class521_sub1.plane == Class84.myPlayer.plane)) {
			int i_18_ = class518.anIntArrayArray5913[i][0];
			int i_19_ = i_18_ >> 8;
			int i_20_ = i_18_ >> 5 & 0x7;
			int i_21_ = i_18_ & 0x1f;
			if (class518.anIntArrayArray5913[i].length > 1) {
				int i_22_ = (int) (Math.random() * (double) (class518.anIntArrayArray5913[i]).length);
				if (i_22_ > 0)
					i_19_ = class518.anIntArrayArray5913[i][i_22_];
			}
			int i_23_ = 256;
			if (null != class518.anIntArray5927 && null != class518.anIntArray5919)
				i_23_ = ((int) (Math.random() * (double) (class518.anIntArray5919[i] - class518.anIntArray5927[i])) + class518.anIntArray5927[i]);
			int i_24_ = (null == class518.anIntArray5926 ? 255 : class518.anIntArray5926[i]);
			if (i_21_ == 0) {
				if (Class84.myPlayer == class521_sub1) {
					if (class518.aBool5928)
						Class435.method7300(i_19_, i_20_, 0, i_24_, false, i_23_, 1449989045);
					else
						Class153.method2618(i_19_, i_20_, 0, i_24_, i_23_, 742756114);
				}
			} else {
				if (Class84.myPlayer == class521_sub1) {
					if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(-284251300) == 0)
						return;
				} else if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8193.method12714(2008105785) == 0)
					return;
				Vector3 class385 = class521_sub1.method11166().aClass385_3595;
				int i_25_ = (int) class385.x - 256 >> 9;
				int i_26_ = (int) class385.z - 256 >> 9;
				int i_27_ = ((class521_sub1 == Class84.myPlayer) ? 0 : i_21_ + ((i_25_ << 16) + (class521_sub1.plane << 24) + (i_26_ << 8)));
				aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = new Class268(class518.aBool5928 ? (byte) 2 : (byte) 1, i_19_, i_20_, 0, i_24_, i_27_, i_23_, class521_sub1);
			}
		}
	}

	static int method4589(int i, int i_28_) {
		double d = Math.log((double) i_28_) / Math.log(2.0);
		double d_29_ = Math.log((double) i) / Math.log(2.0);
		double d_30_ = Math.random() * (d - d_29_) + d_29_;
		return (int) (Math.pow(2.0, d_30_) + 0.5);
	}

	public static void method4590(int i, int i_31_, int i_32_) {
		if (aClass116_3229 != null && aClass116_3229.method1956(1361036505) && 773403033 * aClass116_3229.anInt1254 == i) {
			Class256.method4412(aClass116_3229, i_31_, -68618497);
			anInt3223 = i * 919080253;
			aClass116_3229 = null;
			aClass282_Sub15_Sub2_3231 = null;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4531, client.aClass184_7475.isaac, -519429332);
			class282_sub23.buffer.writeInt(-1);
			client.aClass184_7475.method3049(class282_sub23, -916114407);
		} else {
			i_31_ = i_31_ * Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(-289835) >> 8;
			if (i == -1 && !aBool3220)
				Class226.method3805(-1719520107);
			else if (i != -1 && (1293234709 * anInt3223 != i || !Class116.method1966(-470718420)) && 0 != i_31_ && !aBool3220) {
				Class282_Sub1.method11615(i_32_, IndexLoaders.MUSIC_INDEX, i, 0, i_31_, false, new Class109_Sub1(), 1439691684);
				Class468_Sub6.method12658(761177553);
			}
			if (i != anInt3223 * 1293234709)
				aClass282_Sub15_Sub2_3231 = null;
			anInt3223 = i * 919080253;
			aClass277_3234 = null;
		}
	}

	public static void method4591(AnimationDefinitions class518, int i) {
		if (-458827259 * anInt3219 < 50 && (class518 != null && null != class518.anIntArrayArray5913 && i < class518.anIntArrayArray5913.length && null != class518.anIntArrayArray5913[i])) {
			int i_33_ = class518.anIntArrayArray5913[i][0];
			int i_34_ = i_33_ >> 8;
			int i_35_ = i_33_ >> 5 & 0x7;
			if (class518.anIntArrayArray5913[i].length > 1) {
				int i_36_ = (int) (Math.random() * (double) (class518.anIntArrayArray5913[i]).length);
				if (i_36_ > 0)
					i_34_ = class518.anIntArrayArray5913[i][i_36_];
			}
			int i_37_ = 256;
			if (class518.anIntArray5927 != null && null != class518.anIntArray5919)
				i_37_ = Class76.method1356(class518.anIntArray5927[i], class518.anIntArray5919[i], -1021175029);
			int i_38_ = (class518.anIntArray5926 == null ? 255 : class518.anIntArray5926[i]);
			if (class518.aBool5928)
				Class435.method7300(i_34_, i_35_, 0, i_38_, false, i_37_, 1449989045);
			else
				Class153.method2618(i_34_, i_35_, 0, i_38_, i_37_, 975644194);
		}
	}

	public static void method4592(AnimationDefinitions class518, int i) {
		if (-458827259 * anInt3219 < 50 && (class518 != null && null != class518.anIntArrayArray5913 && i < class518.anIntArrayArray5913.length && null != class518.anIntArrayArray5913[i])) {
			int i_39_ = class518.anIntArrayArray5913[i][0];
			int i_40_ = i_39_ >> 8;
			int i_41_ = i_39_ >> 5 & 0x7;
			if (class518.anIntArrayArray5913[i].length > 1) {
				int i_42_ = (int) (Math.random() * (double) (class518.anIntArrayArray5913[i]).length);
				if (i_42_ > 0)
					i_40_ = class518.anIntArrayArray5913[i][i_42_];
			}
			int i_43_ = 256;
			if (class518.anIntArray5927 != null && null != class518.anIntArray5919)
				i_43_ = Class76.method1356(class518.anIntArray5927[i], class518.anIntArray5919[i], -1021175029);
			int i_44_ = (class518.anIntArray5926 == null ? 255 : class518.anIntArray5926[i]);
			if (class518.aBool5928)
				Class435.method7300(i_40_, i_41_, 0, i_44_, false, i_43_, 1449989045);
			else
				Class153.method2618(i_40_, i_41_, 0, i_44_, i_43_, 1711310219);
		}
	}

	public static Class268 method4593(int i, int i_45_, int i_46_, int i_47_, int i_48_) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(-306549908) != 0 && 0 != i_45_ && -458827259 * anInt3219 < 50 && i != -1) {
			Class268 class268 = new Class268((byte) 1, i, i_45_, i_46_, i_47_, 0, i_48_, null);
			aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = class268;
			return class268;
		}
		return null;
	}

	Class260() throws Throwable {
		throw new Error();
	}

	public static Class268 method4594(int i, int i_49_, int i_50_, int i_51_, int i_52_) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(-571597461) != 0 && 0 != i_49_ && -458827259 * anInt3219 < 50 && i != -1) {
			Class268 class268 = new Class268((byte) 1, i, i_49_, i_50_, i_51_, 0, i_52_, null);
			aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = class268;
			return class268;
		}
		return null;
	}

	public static Class268 method4595(int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(923527220) != 0 && 0 != i_53_ && anInt3219 * -458827259 < 50 && i != -1) {
			Class268 class268 = new Class268((byte) 1, i, i_53_, i_54_, i_55_, i_56_, i_57_, null);
			aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = class268;
			return class268;
		}
		return null;
	}

	public static Class268 method4596(int i, int i_58_, int i_59_, int i_60_, boolean bool, int i_61_) {
		if ((bool ? Class393.aClass282_Sub54_4783.aClass468_Sub13_8227.method12714(1456213357) : Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(2135836330)) != 0 && i_58_ != 0 && -458827259 * anInt3219 < 50 && -1 != i) {
			Class268 class268 = new Class268(bool ? (byte) 3 : (byte) 2, i, i_58_, i_59_, i_60_, 0, i_61_, null);
			aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = class268;
			return class268;
		}
		return null;
	}

	public static Class268 method4597(int i, int i_62_, int i_63_, int i_64_, boolean bool, int i_65_) {
		if ((bool ? Class393.aClass282_Sub54_4783.aClass468_Sub13_8227.method12714(1758671249) : Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(-795362448)) != 0 && i_62_ != 0 && -458827259 * anInt3219 < 50 && -1 != i) {
			Class268 class268 = new Class268(bool ? (byte) 3 : (byte) 2, i, i_62_, i_63_, i_64_, 0, i_65_, null);
			aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = class268;
			return class268;
		}
		return null;
	}

	public static Class268 method4598(int i, int i_66_, int i_67_, int i_68_, int i_69_, boolean bool, int i_70_) {
		if ((bool ? Class393.aClass282_Sub54_4783.aClass468_Sub13_8227.method12714(-67634864) : Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(-1197823440)) != 0 && i_66_ != 0 && -458827259 * anInt3219 < 50 && -1 != i) {
			Class268 class268 = new Class268(bool ? (byte) 3 : (byte) 2, i, i_66_, i_67_, i_68_, i_69_, i_70_, null);
			aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = class268;
			return class268;
		}
		return null;
	}

	public static Class268 method4599(int i, int i_71_, int i_72_, int i_73_, int i_74_, boolean bool, int i_75_) {
		if ((bool ? Class393.aClass282_Sub54_4783.aClass468_Sub13_8227.method12714(424667656) : Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(-1311339228)) != 0 && i_71_ != 0 && -458827259 * anInt3219 < 50 && -1 != i) {
			Class268 class268 = new Class268(bool ? (byte) 3 : (byte) 2, i, i_71_, i_72_, i_73_, i_74_, i_75_, null);
			aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = class268;
			return class268;
		}
		return null;
	}

	public static Class268 method4600(int i, int i_76_, int i_77_, int i_78_, int i_79_, boolean bool, int i_80_) {
		if ((bool ? Class393.aClass282_Sub54_4783.aClass468_Sub13_8227.method12714(1464890515) : Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(1404382506)) != 0 && i_76_ != 0 && -458827259 * anInt3219 < 50 && -1 != i) {
			Class268 class268 = new Class268(bool ? (byte) 3 : (byte) 2, i, i_76_, i_77_, i_78_, i_79_, i_80_, null);
			aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = class268;
			return class268;
		}
		return null;
	}

	public static void method4601(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_) {
		Class42.method890(i_85_, i_86_, 100, (byte) -54);
		aClass277_3234 = new Class277(i, i_81_ << 9, i_82_ << 9, i_83_ << 8, 8 * i_84_);
	}

	static int method4602(int i, int i_87_) {
		double d = Math.log((double) i_87_) / Math.log(2.0);
		double d_88_ = Math.log((double) i) / Math.log(2.0);
		double d_89_ = Math.random() * (d - d_88_) + d_88_;
		return (int) (Math.pow(2.0, d_89_) + 0.5);
	}

	public static void method4603(int i, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_) {
		Class42.method890(i_94_, i_95_, 100, (byte) 75);
		aClass277_3234 = new Class277(i, i_90_ << 9, i_91_ << 9, i_92_ << 8, 8 * i_93_);
	}

	static void method4604() {
		if (aClass277_3221 != null) {
			Vector3 class385 = Vector3.method6623(Class84.myPlayer.method11166().aClass385_3595);
			CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(45783610);
			class385.x += (float) (class219.x * 1948093437 << 9);
			class385.z += (float) (class219.y * -1002240017 << 9);
			class385.subtract((float) (((Class277) aClass277_3221).anInt3349 * -142397055), class385.y, (float) (-1830451005 * (((Class277) aClass277_3221).anInt3348)));
			float f = class385.magnitude();
			class385.method6624();
			float f_96_ = 0.0F;
			if (f < (float) (((Class277) aClass277_3221).anInt3351 * -495770161))
				f_96_ = 1.0F;
			else if (f > (float) (-453376919 * ((Class277) aClass277_3221).anInt3350))
				f_96_ = 0.0F;
			else {
				f -= (float) (-495770161 * ((Class277) aClass277_3221).anInt3351);
				f_96_ = 1.0F - f / (float) (((Class277) aClass277_3221).anInt3347 * -809965967);
			}
			Class187.method3121((int) (f_96_ * 256.0F), (short) -17479);
		}
	}

	public static void method4605() {
		Class150.method2580(-1, 255, (byte) -35);
	}

	public static Class268 method4606(int i, int i_97_, int i_98_, int i_99_, int i_100_) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(1969912804) != 0 && 0 != i_97_ && -458827259 * anInt3219 < 50 && i != -1) {
			Class268 class268 = new Class268((byte) 1, i, i_97_, i_98_, i_99_, 0, i_100_, null);
			aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = class268;
			return class268;
		}
		return null;
	}

	public static void method4607() {
		MeshModifier.method7042((byte) 2);
		Class282_Sub20_Sub36.method15420((byte) -49);
		Class282_Sub20_Sub24.method15391(1980856650);
		Class335.method5961(-1537238407);
	}

	static void method4608(boolean bool, Class282_Sub15_Sub2 class282_sub15_sub2) {
		Class320.aClass253_3723.method4329(class282_sub15_sub2);
		if (bool)
			SharedConfigsType.method2084(IndexLoaders.INDEX_15, IndexLoaders.MIDI_INSTRUMENT_INDEX, IndexLoaders.SOUND_EFFECT_INDEX, class282_sub15_sub2, Class320.aClass253_3723, -1541261130);
	}

	public static void method4609(int i, int i_101_, int i_102_) {
		if (aClass116_3229 != null && aClass116_3229.method1956(205228907) && 773403033 * aClass116_3229.anInt1254 == i) {
			Class256.method4412(aClass116_3229, i_101_, -169646111);
			anInt3223 = i * 919080253;
			aClass116_3229 = null;
			aClass282_Sub15_Sub2_3231 = null;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4531, client.aClass184_7475.isaac, 1168092558);
			class282_sub23.buffer.writeInt(-1);
			client.aClass184_7475.method3049(class282_sub23, 1268311768);
		} else {
			i_101_ = i_101_ * Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(1500365897) >> 8;
			if (i == -1 && !aBool3220)
				Class226.method3805(-1719520107);
			else if (i != -1 && (1293234709 * anInt3223 != i || !Class116.method1966(-491391986)) && 0 != i_101_ && !aBool3220) {
				Class282_Sub1.method11615(i_102_, IndexLoaders.MUSIC_INDEX, i, 0, i_101_, false, new Class109_Sub1(), 79968203);
				Class468_Sub6.method12658(42661990);
			}
			if (i != anInt3223 * 1293234709)
				aClass282_Sub15_Sub2_3231 = null;
			anInt3223 = i * 919080253;
			aClass277_3234 = null;
		}
	}

	public static void method4610(Class116 class116, int i) {
		i = i * Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(1911867484) >> 8;
		if (class116 == null)
			Class226.method3805(-1719520107);
		else {
			Class12.method487(class116, i, 1324638747);
			Class230.method3912((byte) 3);
		}
	}

	public static void method4611(int i, int i_103_, int i_104_) {
		i_104_ = i_104_ * Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(-1561729900) >> 8;
		if (0 != i_104_ && i != -1) {
			if (!aBool3220 && -1 != 1293234709 * anInt3223 && Class116.method1966(1992461194) && !Class345.method6140(2038275332)) {
				aClass282_Sub15_Sub2_3231 = Message.method7272((byte) -39);
				Class230.method3912((byte) 3);
				Class282_Sub15_Sub2 class282_sub15_sub2 = Class282_Sub20_Sub10.method15262(aClass282_Sub15_Sub2_3231, -1870974818);
				Class42_Sub1.method14563(true, class282_sub15_sub2, (short) 9841);
			}
			Class11.method13400(IndexLoaders.INDEX_11, i, 0, i_104_, false, (byte) -46);
			Class150.method2580(-1, 255, (byte) 48);
			aBool3220 = true;
		}
	}

	public static void method4612(int i, int i_105_, int i_106_) {
		i_106_ = i_106_ * Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(512582903) >> 8;
		if (0 != i_106_ && i != -1) {
			if (!aBool3220 && -1 != 1293234709 * anInt3223 && Class116.method1966(-1462731740) && !Class345.method6140(-1869808)) {
				aClass282_Sub15_Sub2_3231 = Message.method7272((byte) 13);
				Class230.method3912((byte) 3);
				Class282_Sub15_Sub2 class282_sub15_sub2 = Class282_Sub20_Sub10.method15262(aClass282_Sub15_Sub2_3231, -128022584);
				Class42_Sub1.method14563(true, class282_sub15_sub2, (short) 14000);
			}
			Class11.method13400(IndexLoaders.INDEX_11, i, 0, i_106_, false, (byte) -27);
			Class150.method2580(-1, 255, (byte) -35);
			aBool3220 = true;
		}
	}

	public static void method4613(int i, int i_107_) {
		Class150.method2580(i, i_107_, (byte) -53);
	}

	static int method4614(int i, int i_108_) {
		double d = Math.log((double) i_108_) / Math.log(2.0);
		double d_109_ = Math.log((double) i) / Math.log(2.0);
		double d_110_ = Math.random() * (d - d_109_) + d_109_;
		return (int) (Math.pow(2.0, d_110_) + 0.5);
	}

	public static void method4615(int i, int i_111_, int i_112_) {
		i_112_ = i_112_ * Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(-742879470) >> 8;
		if (0 != i_112_ && i != -1) {
			if (!aBool3220 && -1 != 1293234709 * anInt3223 && Class116.method1966(-2060151554) && !Class345.method6140(1088192376)) {
				aClass282_Sub15_Sub2_3231 = Message.method7272((byte) -33);
				Class230.method3912((byte) 3);
				Class282_Sub15_Sub2 class282_sub15_sub2 = Class282_Sub20_Sub10.method15262(aClass282_Sub15_Sub2_3231, 29215494);
				Class42_Sub1.method14563(true, class282_sub15_sub2, (short) 7925);
			}
			Class11.method13400(IndexLoaders.INDEX_11, i, 0, i_112_, false, (byte) -40);
			Class150.method2580(-1, 255, (byte) 12);
			aBool3220 = true;
		}
	}

	static void method4616(boolean bool, Class282_Sub15_Sub2 class282_sub15_sub2) {
		Class320.aClass253_3723.method4329(class282_sub15_sub2);
		if (bool)
			SharedConfigsType.method2084(IndexLoaders.INDEX_15, IndexLoaders.MIDI_INSTRUMENT_INDEX, IndexLoaders.SOUND_EFFECT_INDEX, class282_sub15_sub2, Class320.aClass253_3723, -1541261130);
	}

	public static void method4617(AnimationDefinitions class518, int i) {
		if (-458827259 * anInt3219 < 50 && (class518 != null && null != class518.anIntArrayArray5913 && i < class518.anIntArrayArray5913.length && null != class518.anIntArrayArray5913[i])) {
			int i_113_ = class518.anIntArrayArray5913[i][0];
			int i_114_ = i_113_ >> 8;
			int i_115_ = i_113_ >> 5 & 0x7;
			if (class518.anIntArrayArray5913[i].length > 1) {
				int i_116_ = (int) (Math.random() * (double) (class518.anIntArrayArray5913[i]).length);
				if (i_116_ > 0)
					i_114_ = class518.anIntArrayArray5913[i][i_116_];
			}
			int i_117_ = 256;
			if (class518.anIntArray5927 != null && null != class518.anIntArray5919)
				i_117_ = Class76.method1356(class518.anIntArray5927[i], class518.anIntArray5919[i], -1021175029);
			int i_118_ = (class518.anIntArray5926 == null ? 255 : class518.anIntArray5926[i]);
			if (class518.aBool5928)
				Class435.method7300(i_114_, i_115_, 0, i_118_, false, i_117_, 1449989045);
			else
				Class153.method2618(i_114_, i_115_, 0, i_118_, i_117_, 1680797752);
		}
	}

	public static void method4618() {
		for (int i = 0; i < -458827259 * anInt3219; i++) {
			Class268 class268 = aClass268Array3232[i];
			if (3 == ((Class268) class268).aByte3300)
				Class58.method1142(class268, 1197943751);
		}
	}

	public static void method4619(int i, int i_119_, int i_120_, int i_121_, int i_122_, int i_123_, int i_124_) {
		Class42.method890(i_123_, i_124_, 100, (byte) 34);
		aClass277_3234 = new Class277(i, i_119_ << 9, i_120_ << 9, i_121_ << 8, 8 * i_122_);
	}

	public static void method4620() {
		for (int i = 0; i < -458827259 * anInt3219; i++) {
			Class268 class268 = aClass268Array3232[i];
			if (3 == ((Class268) class268).aByte3300)
				Class58.method1142(class268, 1238818162);
		}
	}

	public static void method4621(Class268 class268) {
		if (((Class268) class268).aClass282_Sub15_Sub5_3304 != null)
			Class79.aClass282_Sub15_Sub4_783.method15276(((Class268) class268).aClass282_Sub15_Sub5_3304);
		else
			((Class268) class268).anInt3297 = -2147483648;
	}

	public static void method4622(Class268 class268) {
		if (((Class268) class268).aClass282_Sub15_Sub5_3304 != null)
			Class79.aClass282_Sub15_Sub4_783.method15276(((Class268) class268).aClass282_Sub15_Sub5_3304);
		else
			((Class268) class268).anInt3297 = -2147483648;
	}

	public static void method4623() {
		if (Class320.aClass253_3723 != null)
			Class320.aClass253_3723.method4333();
		if (null != Class100.aClass253_1008)
			Class100.aClass253_1008.method4333();
	}

	public static void method4624(AnimationDefinitions class518, int i, Class521_Sub1 class521_sub1) {
		if (anInt3219 * -458827259 < 50 && (class518 != null && class518.anIntArrayArray5913 != null && i < class518.anIntArrayArray5913.length && null != class518.anIntArrayArray5913[i]) && (class521_sub1.plane == Class84.myPlayer.plane)) {
			int i_125_ = class518.anIntArrayArray5913[i][0];
			int i_126_ = i_125_ >> 8;
			int i_127_ = i_125_ >> 5 & 0x7;
			int i_128_ = i_125_ & 0x1f;
			if (class518.anIntArrayArray5913[i].length > 1) {
				int i_129_ = (int) (Math.random() * (double) (class518.anIntArrayArray5913[i]).length);
				if (i_129_ > 0)
					i_126_ = class518.anIntArrayArray5913[i][i_129_];
			}
			int i_130_ = 256;
			if (null != class518.anIntArray5927 && null != class518.anIntArray5919)
				i_130_ = ((int) (Math.random() * (double) (class518.anIntArray5919[i] - class518.anIntArray5927[i])) + class518.anIntArray5927[i]);
			int i_131_ = (null == class518.anIntArray5926 ? 255 : class518.anIntArray5926[i]);
			if (i_128_ == 0) {
				if (Class84.myPlayer == class521_sub1) {
					if (class518.aBool5928)
						Class435.method7300(i_126_, i_127_, 0, i_131_, false, i_130_, 1449989045);
					else
						Class153.method2618(i_126_, i_127_, 0, i_131_, i_130_, 1532547799);
				}
			} else {
				if (Class84.myPlayer == class521_sub1) {
					if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(1883080475) == 0)
						return;
				} else if (Class393.aClass282_Sub54_4783.aClass468_Sub13_8193.method12714(1842845443) == 0)
					return;
				Vector3 class385 = class521_sub1.method11166().aClass385_3595;
				int i_132_ = (int) class385.x - 256 >> 9;
				int i_133_ = (int) class385.z - 256 >> 9;
				int i_134_ = ((class521_sub1 == Class84.myPlayer) ? 0 : i_128_ + ((i_132_ << 16) + (class521_sub1.plane << 24) + (i_133_ << 8)));
				aClass268Array3232[(anInt3219 += -1221598515) * -458827259 - 1] = new Class268(class518.aBool5928 ? (byte) 2 : (byte) 1, i_126_, i_127_, 0, i_131_, i_134_, i_130_, class521_sub1);
			}
		}
	}

	static void method4625() {
		if (null != aClass277_3221) {
			aClass277_3221 = null;
			Class187.method3121(256, (short) 3518);
		}
	}

	public static void method4626() {
		if (Class320.aClass253_3723 != null)
			Class320.aClass253_3723.method4333();
		if (null != Class100.aClass253_1008)
			Class100.aClass253_1008.method4333();
	}

	public static void method4627(int i) {
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4531, client.aClass184_7475.isaac, -376501848);
		class282_sub23.buffer.writeInt(-1);
		client.aClass184_7475.method3049(class282_sub23, -340583361);
		aClass116_3229 = new Class116(IndexLoaders.MUSIC_INDEX, i);
	}

	public static void method4628(int i) {
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4531, client.aClass184_7475.isaac, -97242203);
		class282_sub23.buffer.writeInt(-1);
		client.aClass184_7475.method3049(class282_sub23, -553178131);
		aClass116_3229 = new Class116(IndexLoaders.MUSIC_INDEX, i);
	}

	static final void method4629(CS2Executor class527, int i) {
		int i_135_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_135_, (byte) 40);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_135_ >> 16];
		Class306.method5455(class118, class98, class527, 1919949252);
	}

	static final void method4630(CS2Executor class527, int i) {
		class527.intStackPtr -= 283782002;
		int i_136_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_137_ = ((class527.intStack[1942118537 * class527.intStackPtr + 1]) - 1);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_136_, 1109098301);
		if (-1330791315 * class425.anInt5061 == i_137_)
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = class425.anInt5062 * 439280359;
		else if (i_137_ == -1576872607 * class425.anInt5030)
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = class425.anInt5031 * -1516146479;
		else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = -1;
	}

	static final void method4631(CS2Executor class527, int i) {
		class527.intStackPtr -= 283782002;
		int i_138_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_139_ = (class527.intStack[1 + class527.intStackPtr * 1942118537]);
		class527.aClass346_7009.anIntArray4046[i_138_] = i_139_;
	}

	static final int method4632(int i, int i_140_, int i_141_) {
		int i_142_ = i_140_ * 57 + i;
		i_142_ = i_142_ << 13 ^ i_142_;
		int i_143_ = ((789221 + i_142_ * i_142_ * 15731) * i_142_ + 1376312589 & 0x7fffffff);
		return i_143_ >> 19 & 0xff;
	}

	static final void method4633(CS2Executor class527, byte i) {
		int i_144_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_144_, (byte) 59);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_144_ >> 16];
		Class204.method3369(class118, class98, class527, (byte) 0);
	}
}
