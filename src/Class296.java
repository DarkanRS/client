
/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.ping.Ping;

public class Class296 {
	static Class446[] aClass446Array3531;
	static int anInt3532 = 0;
	static int anInt3533 = 0;
	public static int anInt3534;
	
	public static int method5293() {
		if (0 == anInt3532 * 1164388509) {
			Class446.aClass446_5412.method7435(new Class301("jaclib"), (byte) -56);
			if (Class446.aClass446_5412.method7443(1322798442).method84(-477828346) != 100)
				return 1;
			if (!((Class301) Class446.aClass446_5412.method7443(-1460062494)).method5328((byte) -117)) {
				Class308.aclient3620.method4681((byte) 1);
				Class223.method3770((byte) 1);
				try {
					Ping.init();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt3532 = -699884107;
		}
		if (1 == anInt3532 * 1164388509) {
			aClass446Array3531 = Class446.method7436((byte) 24);
			Class446.aClass446_5386.method7435(new Class298(IndexLoaders.DEFAULTS_INDEX), (byte) -17);
			Class446.aClass446_5387.method7435(new Class301("jaggl"), (byte) -50);
			Class446.aClass446_5388.method7435(new Class301("jagdx"), (byte) -18);
			Class446.aClass446_5389.method7435(new Class301("sw3d"), (byte) 92);
			Class446.aClass446_5415.method7435(new Class301("hw3d"), (byte) 5);
			Class446.aClass446_5385.method7435(new Class301("jagtheora"), (byte) 66);
			Class446.aClass446_5392.method7435(new Class298(IndexLoaders.SHADER_INDEX), (byte) 10);
			Class446.aClass446_5390.method7435(new Class298(IndexLoaders.TEXTURE_DEFINITION_INDEX), (byte) -6);
			Class446.aClass446_5394.method7435(new Class298(IndexLoaders.CONFIG_INDEX), (byte) 37);
			Class446.aClass446_5395.method7435(new Class298(IndexLoaders.OBJECT_INDEX), (byte) -57);
			Class446.aClass446_5397.method7435(new Class298(IndexLoaders.ENUM_INDEX), (byte) -45);
			Class446.aClass446_5393.method7435(new Class298(IndexLoaders.NPC_INDEX), (byte) 27);
			Class446.aClass446_5413.method7435(new Class298(IndexLoaders.ITEM_INDEX), (byte) 7);
			Class446.aClass446_5399.method7435(new Class298(IndexLoaders.SEQUENCES_INDEX), (byte) -57);
			Class446.aClass446_5400.method7435(new Class298(IndexLoaders.SPOTANIM_INDEX), (byte) 50);
			Class446.aClass446_5401.method7435(new Class298(IndexLoaders.VARBIT_INDEX), (byte) -31);
			Class446.aClass446_5402.method7435(new Class298(IndexLoaders.QC_MESSAGES_INDEX), (byte) -95);
			Class446.aClass446_5403.method7435(new Class298(IndexLoaders.QC_MENU_INDEX), (byte) 5);
			Class446.aClass446_5404.method7435(new Class298(IndexLoaders.TEXTURE_INDEX), (byte) -67);
			Class446.aClass446_5405.method7435(new Class298(IndexLoaders.PARTICLE_INDEX), (byte) 70);
			Class446.aClass446_5410.method7435(new Class298(IndexLoaders.BILLBOARD_INDEX), (byte) -42);
			Class446.aClass446_5407.method7435(new Class383((IndexLoaders.HUFFMAN_INDEX), "huffman"), (byte) 46);
			Class446.aClass446_5391.method7435(new Class298(IndexLoaders.INTERFACE_INDEX), (byte) 96);
			Class446.aClass446_5409.method7435(new Class298(IndexLoaders.CS2_SCRIPTS_INDEX), (byte) -35);
			Class446.aClass446_5398.method7435(new Class298(IndexLoaders.FONT_METRICS_INDEX), (byte) -24);
			Class446.aClass446_5411.method7435(new Class388((IndexLoaders.WORLD_MAP_INDEX), "details"), (byte) -74);
			for (int i = 0; i < aClass446Array3531.length; i++) {
				if (aClass446Array3531[i].method7443(1480288863) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class446[] class446s = aClass446Array3531;
			for (int i_0_ = 0; i_0_ < class446s.length; i_0_++) {
				Class446 class446 = class446s[i_0_];
				int i_1_ = class446.method7432((byte) 66);
				int i_2_ = class446.method7443(-1235746349).method84(-477828346);
				i += i_2_ * i_1_ / 100;
			}
			anInt3533 = i * -621298115;
			anInt3532 = -1399768214;
		}
		if (null == aClass446Array3531)
			return 100;
		int i = 0;
		int i_3_ = 0;
		boolean bool = true;
		Class446[] class446s = aClass446Array3531;
		for (int i_4_ = 0; i_4_ < class446s.length; i_4_++) {
			Class446 class446 = class446s[i_4_];
			int i_5_ = class446.method7432((byte) 66);
			int i_6_ = class446.method7443(-1044791730).method84(-477828346);
			if (i_6_ < 100)
				bool = false;
			i += i_5_;
			i_3_ += i_5_ * i_6_ / 100;
		}
		if (bool) {
			if (!((Class301) Class446.aClass446_5385.method7443(-226245168)).method5328((byte) -49))
				client.aBool7393 = Class308.aclient3620.method4662((byte) 7);
			aClass446Array3531 = null;
		}
		i_3_ -= anInt3533 * -1694086891;
		i -= anInt3533 * -1694086891;
		int i_7_ = i > 0 ? i_3_ * 100 / i : 100;
		if (!bool && i_7_ > 99)
			i_7_ = 99;
		return i_7_;
	}

	public static int method5294() {
		if (0 == anInt3532 * 1164388509) {
			Class446.aClass446_5412.method7435(new Class301("jaclib"), (byte) 54);
			if (Class446.aClass446_5412.method7443(1457064220).method84(-477828346) != 100)
				return 1;
			if (!((Class301) Class446.aClass446_5412.method7443(1614526456)).method5328((byte) -98)) {
				Class308.aclient3620.method4681((byte) 1);
				Class223.method3770((byte) 1);
				try {
					Ping.init();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt3532 = -699884107;
		}
		if (1 == anInt3532 * 1164388509) {
			aClass446Array3531 = Class446.method7436((byte) 24);
			Class446.aClass446_5386.method7435(new Class298(IndexLoaders.DEFAULTS_INDEX), (byte) -13);
			Class446.aClass446_5387.method7435(new Class301("jaggl"), (byte) -8);
			Class446.aClass446_5388.method7435(new Class301("jagdx"), (byte) 47);
			Class446.aClass446_5389.method7435(new Class301("sw3d"), (byte) 61);
			Class446.aClass446_5415.method7435(new Class301("hw3d"), (byte) 20);
			Class446.aClass446_5385.method7435(new Class301("jagtheora"), (byte) -18);
			Class446.aClass446_5392.method7435(new Class298(IndexLoaders.SHADER_INDEX), (byte) -71);
			Class446.aClass446_5390.method7435(new Class298(IndexLoaders.TEXTURE_DEFINITION_INDEX), (byte) -24);
			Class446.aClass446_5394.method7435(new Class298(IndexLoaders.CONFIG_INDEX), (byte) -59);
			Class446.aClass446_5395.method7435(new Class298(IndexLoaders.OBJECT_INDEX), (byte) 104);
			Class446.aClass446_5397.method7435(new Class298(IndexLoaders.ENUM_INDEX), (byte) -60);
			Class446.aClass446_5393.method7435(new Class298(IndexLoaders.NPC_INDEX), (byte) -51);
			Class446.aClass446_5413.method7435(new Class298(IndexLoaders.ITEM_INDEX), (byte) 2);
			Class446.aClass446_5399.method7435(new Class298(IndexLoaders.SEQUENCES_INDEX), (byte) 8);
			Class446.aClass446_5400.method7435(new Class298(IndexLoaders.SPOTANIM_INDEX), (byte) 80);
			Class446.aClass446_5401.method7435(new Class298(IndexLoaders.VARBIT_INDEX), (byte) 47);
			Class446.aClass446_5402.method7435(new Class298(IndexLoaders.QC_MESSAGES_INDEX), (byte) -68);
			Class446.aClass446_5403.method7435(new Class298(IndexLoaders.QC_MENU_INDEX), (byte) 68);
			Class446.aClass446_5404.method7435(new Class298(IndexLoaders.TEXTURE_INDEX), (byte) -3);
			Class446.aClass446_5405.method7435(new Class298(IndexLoaders.PARTICLE_INDEX), (byte) 78);
			Class446.aClass446_5410.method7435(new Class298(IndexLoaders.BILLBOARD_INDEX), (byte) -52);
			Class446.aClass446_5407.method7435(new Class383((IndexLoaders.HUFFMAN_INDEX), "huffman"), (byte) -25);
			Class446.aClass446_5391.method7435(new Class298(IndexLoaders.INTERFACE_INDEX), (byte) 17);
			Class446.aClass446_5409.method7435(new Class298(IndexLoaders.CS2_SCRIPTS_INDEX), (byte) 6);
			Class446.aClass446_5398.method7435(new Class298(IndexLoaders.FONT_METRICS_INDEX), (byte) -39);
			Class446.aClass446_5411.method7435(new Class388((IndexLoaders.WORLD_MAP_INDEX), "details"), (byte) -8);
			for (int i = 0; i < aClass446Array3531.length; i++) {
				if (aClass446Array3531[i].method7443(1425576153) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class446[] class446s = aClass446Array3531;
			for (int i_8_ = 0; i_8_ < class446s.length; i_8_++) {
				Class446 class446 = class446s[i_8_];
				int i_9_ = class446.method7432((byte) 66);
				int i_10_ = class446.method7443(963619985).method84(-477828346);
				i += i_10_ * i_9_ / 100;
			}
			anInt3533 = i * -621298115;
			anInt3532 = -1399768214;
		}
		if (null == aClass446Array3531)
			return 100;
		int i = 0;
		int i_11_ = 0;
		boolean bool = true;
		Class446[] class446s = aClass446Array3531;
		for (int i_12_ = 0; i_12_ < class446s.length; i_12_++) {
			Class446 class446 = class446s[i_12_];
			int i_13_ = class446.method7432((byte) 66);
			int i_14_ = class446.method7443(1261475695).method84(-477828346);
			if (i_14_ < 100)
				bool = false;
			i += i_13_;
			i_11_ += i_13_ * i_14_ / 100;
		}
		if (bool) {
			if (!((Class301) Class446.aClass446_5385.method7443(-1632742454)).method5328((byte) -32))
				client.aBool7393 = Class308.aclient3620.method4662((byte) 14);
			aClass446Array3531 = null;
		}
		i_11_ -= anInt3533 * -1694086891;
		i -= anInt3533 * -1694086891;
		int i_15_ = i > 0 ? i_11_ * 100 / i : 100;
		if (!bool && i_15_ > 99)
			i_15_ = 99;
		return i_15_;
	}

	Class296() throws Throwable {
		throw new Error();
	}

	public static int method5295() {
		if (0 == anInt3532 * 1164388509) {
			Class446.aClass446_5412.method7435(new Class301("jaclib"), (byte) 0);
			if (Class446.aClass446_5412.method7443(-580271749).method84(-477828346) != 100)
				return 1;
			if (!((Class301) Class446.aClass446_5412.method7443(-376894485)).method5328((byte) -23)) {
				Class308.aclient3620.method4681((byte) 1);
				Class223.method3770((byte) 1);
				try {
					Ping.init();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt3532 = -699884107;
		}
		if (1 == anInt3532 * 1164388509) {
			aClass446Array3531 = Class446.method7436((byte) 24);
			Class446.aClass446_5386.method7435(new Class298(IndexLoaders.DEFAULTS_INDEX), (byte) -47);
			Class446.aClass446_5387.method7435(new Class301("jaggl"), (byte) -31);
			Class446.aClass446_5388.method7435(new Class301("jagdx"), (byte) 15);
			Class446.aClass446_5389.method7435(new Class301("sw3d"), (byte) 74);
			Class446.aClass446_5415.method7435(new Class301("hw3d"), (byte) 103);
			Class446.aClass446_5385.method7435(new Class301("jagtheora"), (byte) 50);
			Class446.aClass446_5392.method7435(new Class298(IndexLoaders.SHADER_INDEX), (byte) -60);
			Class446.aClass446_5390.method7435(new Class298(IndexLoaders.TEXTURE_DEFINITION_INDEX), (byte) 5);
			Class446.aClass446_5394.method7435(new Class298(IndexLoaders.CONFIG_INDEX), (byte) -52);
			Class446.aClass446_5395.method7435(new Class298(IndexLoaders.OBJECT_INDEX), (byte) 93);
			Class446.aClass446_5397.method7435(new Class298(IndexLoaders.ENUM_INDEX), (byte) 50);
			Class446.aClass446_5393.method7435(new Class298(IndexLoaders.NPC_INDEX), (byte) -23);
			Class446.aClass446_5413.method7435(new Class298(IndexLoaders.ITEM_INDEX), (byte) -9);
			Class446.aClass446_5399.method7435(new Class298(IndexLoaders.SEQUENCES_INDEX), (byte) 13);
			Class446.aClass446_5400.method7435(new Class298(IndexLoaders.SPOTANIM_INDEX), (byte) -26);
			Class446.aClass446_5401.method7435(new Class298(IndexLoaders.VARBIT_INDEX), (byte) 16);
			Class446.aClass446_5402.method7435(new Class298(IndexLoaders.QC_MESSAGES_INDEX), (byte) -86);
			Class446.aClass446_5403.method7435(new Class298(IndexLoaders.QC_MENU_INDEX), (byte) 40);
			Class446.aClass446_5404.method7435(new Class298(IndexLoaders.TEXTURE_INDEX), (byte) -13);
			Class446.aClass446_5405.method7435(new Class298(IndexLoaders.PARTICLE_INDEX), (byte) -64);
			Class446.aClass446_5410.method7435(new Class298(IndexLoaders.BILLBOARD_INDEX), (byte) 73);
			Class446.aClass446_5407.method7435(new Class383((IndexLoaders.HUFFMAN_INDEX), "huffman"), (byte) 57);
			Class446.aClass446_5391.method7435(new Class298(IndexLoaders.INTERFACE_INDEX), (byte) -77);
			Class446.aClass446_5409.method7435(new Class298(IndexLoaders.CS2_SCRIPTS_INDEX), (byte) 37);
			Class446.aClass446_5398.method7435(new Class298(IndexLoaders.FONT_METRICS_INDEX), (byte) 12);
			Class446.aClass446_5411.method7435(new Class388((IndexLoaders.WORLD_MAP_INDEX), "details"), (byte) -29);
			for (int i = 0; i < aClass446Array3531.length; i++) {
				if (aClass446Array3531[i].method7443(-1850556854) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class446[] class446s = aClass446Array3531;
			for (int i_16_ = 0; i_16_ < class446s.length; i_16_++) {
				Class446 class446 = class446s[i_16_];
				int i_17_ = class446.method7432((byte) 66);
				int i_18_ = class446.method7443(-773841292).method84(-477828346);
				i += i_18_ * i_17_ / 100;
			}
			anInt3533 = i * -621298115;
			anInt3532 = -1399768214;
		}
		if (null == aClass446Array3531)
			return 100;
		int i = 0;
		int i_19_ = 0;
		boolean bool = true;
		Class446[] class446s = aClass446Array3531;
		for (int i_20_ = 0; i_20_ < class446s.length; i_20_++) {
			Class446 class446 = class446s[i_20_];
			int i_21_ = class446.method7432((byte) 66);
			int i_22_ = class446.method7443(941157360).method84(-477828346);
			if (i_22_ < 100)
				bool = false;
			i += i_21_;
			i_19_ += i_21_ * i_22_ / 100;
		}
		if (bool) {
			if (!((Class301) Class446.aClass446_5385.method7443(2112847787)).method5328((byte) -94))
				client.aBool7393 = Class308.aclient3620.method4662((byte) -39);
			aClass446Array3531 = null;
		}
		i_19_ -= anInt3533 * -1694086891;
		i -= anInt3533 * -1694086891;
		int i_23_ = i > 0 ? i_19_ * 100 / i : 100;
		if (!bool && i_23_ > 99)
			i_23_ = 99;
		return i_23_;
	}

	static final void method5296(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (class527.aBool7022) {
			if (i <= 0)
				return;
			class513 = class527.aClass513_6994;
		} else
			class513 = class527.aClass513_7007;
		UnderlayDefinition class513_24_ = class513;
		IComponentDefinitions class118 = ((UnderlayDefinition) class513_24_).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513_24_).aClass98_5885;
		Class204.method3366(class118, class98, class527, (byte) -128);
	}

	static final void method5297(CS2Executor class527, byte i) {
		int i_25_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		int i_26_ = client.aClass330Array7428[i_25_].method5908(-1252250172);
		int[] is = class527.intStack;
		int i_27_ = (class527.intStackPtr += 141891001) * 1942118537 - 1;
		int i_28_;
		if (i_26_ == 1) {
			if (i <= -123)
				return;
			i_28_ = 1;
		} else
			i_28_ = 0;
		is[i_27_] = i_28_;
	}

	static final void method5298(CS2Executor class527, int i) {
		int i_29_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[class527.anInt7000 * 1806726141]);
		String string_30_ = (String) (class527.objectStack[1806726141 * class527.anInt7000 + 1]);
		if (string.length() <= 500 && string_30_.length() <= 500)
			Class105.method1804(i_29_, string, string_30_, (byte) -22);
	}

	static final void method5299(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class282_Sub45.method13405(Class169.method2869(1994559110));
	}
}
