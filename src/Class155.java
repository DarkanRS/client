import java.util.Date;

public final class Class155 {

	IterableNodeMap aClass465_1969;

	int anInt1968;

	public void method2624() {
		if (this.aClass465_1969 != null) {
			this.aClass465_1969.method7749(-1100560301);
		}
	}

	public void method2625(int i_1, int i_2) {
		if (this.aClass465_1969 == null) {
			this.aClass465_1969 = new IterableNodeMap(this.anInt1968);
		}
		IntNode class282_sub38_4 = (IntNode) this.aClass465_1969.get((long) i_1);
		if (class282_sub38_4 != null) {
			class282_sub38_4.value = i_2;
		} else {
			class282_sub38_4 = new IntNode(i_2);
			this.aClass465_1969.put(class282_sub38_4, (long) i_1);
		}
	}

	public int method2626(int i_1, byte b_2) {
		IntNode class282_sub38_3 = (IntNode) this.aClass465_1969.get((long) i_1);
		if (class282_sub38_3 != null) {
			return class282_sub38_3.value;
		} else {
			Class372 class372_4 = IndexLoaders.VAR_LOADER.method6384(i_1, 1420964828);
			return class372_4.aChar4328 != 105 ? -1 : 0;
		}
	}

	public int method2627(int i_1) {
		VarBitDefinitions class226_3 = IndexLoaders.VARBIT_LOADER.getVarBit(i_1, (byte) 48);
		int i_4 = class226_3.baseVar;
		int i_5 = class226_3.endBit == 31 ? -1 : (1 << class226_3.endBit + 1) - 1;
		return (this.method2626(i_4, (byte) 17) & i_5) >>> class226_3.startBit;
	}

	Class155() {
		this.anInt1968 = 16;
	}

	static void method2634(long long_0) {
		Class407.aCalendar4848.setTime(new Date(long_0));
	}

	public static void method2635(String string_0, String string_1) {
		if (string_0.length() <= 320 && Class388.method6693(1569311303)) {
			client.connectionContext.method3051((byte) -71);
			HitbarIndexLoader.method5118((byte) -126);
			Class9.aString99 = string_0;
			Class9.aString102 = string_1;
			Class365.setGameState(14);
		}
	}

	static final void method2636() {
		int i_1 = Class197.NUM_PLAYER_INDICES;
		int[] ints_2 = Class197.PLAYER_INDICES;
		for (int i_3 = 0; i_3 < i_1; i_3++) {
			Player player_4 = client.players[ints_2[i_3]];
			if (player_4 != null) {
				Class363.method6287(player_4, false, 960427099);
			}
		}
	}

	static final void method2637(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		ItemIndexLoader.method7170(i_2);
		int i_7 = 0;
		int i_8 = i_2 - i_5;
		if (i_8 < 0) {
			i_8 = 0;
		}
		int i_9 = i_2;
		int i_10 = -i_2;
		int i_11 = i_8;
		int i_12 = -i_8;
		int i_13 = -1;
		int i_14 = -1;
		int[] ints_15 = Class532_Sub3.anIntArrayArray7072[i_1];
		int i_16 = i_0 - i_8;
		int i_17 = i_0 + i_8;
		KeyHoldInputSubscriber.method3922(ints_15, i_0 - i_2, i_16, i_4, (byte) 98);
		KeyHoldInputSubscriber.method3922(ints_15, i_16, i_17, i_3, (byte) 67);
		KeyHoldInputSubscriber.method3922(ints_15, i_17, i_0 + i_2, i_4, (byte) -55);
		while (i_9 > i_7) {
			i_13 += 2;
			i_14 += 2;
			i_10 += i_13;
			i_12 += i_14;
			if (i_12 >= 0 && i_11 >= 1) {
				Class5.anIntArray36[i_11] = i_7;
				--i_11;
				i_12 -= i_11 << 1;
			}
			++i_7;
			int[] ints_18;
			int[] ints_19;
			int i_20;
			int i_21;
			int i_22;
			int i_23;
			int i_24;
			if (i_10 >= 0) {
				--i_9;
				i_10 -= i_9 << 1;
				if (i_9 >= i_8) {
					ints_18 = Class532_Sub3.anIntArrayArray7072[i_9 + i_1];
					ints_19 = Class532_Sub3.anIntArrayArray7072[i_1 - i_9];
					i_20 = i_0 + i_7;
					i_21 = i_0 - i_7;
					KeyHoldInputSubscriber.method3922(ints_18, i_21, i_20, i_4, (byte) -14);
					KeyHoldInputSubscriber.method3922(ints_19, i_21, i_20, i_4, (byte) 93);
				} else {
					ints_18 = Class532_Sub3.anIntArrayArray7072[i_9 + i_1];
					ints_19 = Class532_Sub3.anIntArrayArray7072[i_1 - i_9];
					i_20 = Class5.anIntArray36[i_9];
					i_21 = i_0 + i_7;
					i_22 = i_0 - i_7;
					i_23 = i_0 + i_20;
					i_24 = i_0 - i_20;
					KeyHoldInputSubscriber.method3922(ints_18, i_22, i_24, i_4, (byte) -28);
					KeyHoldInputSubscriber.method3922(ints_18, i_24, i_23, i_3, (byte) -29);
					KeyHoldInputSubscriber.method3922(ints_18, i_23, i_21, i_4, (byte) -47);
					KeyHoldInputSubscriber.method3922(ints_19, i_22, i_24, i_4, (byte) 5);
					KeyHoldInputSubscriber.method3922(ints_19, i_24, i_23, i_3, (byte) -58);
					KeyHoldInputSubscriber.method3922(ints_19, i_23, i_21, i_4, (byte) 9);
				}
			}
			ints_18 = Class532_Sub3.anIntArrayArray7072[i_7 + i_1];
			ints_19 = Class532_Sub3.anIntArrayArray7072[i_1 - i_7];
			i_20 = i_0 + i_9;
			i_21 = i_0 - i_9;
			if (i_7 < i_8) {
				i_22 = i_11 < i_7 ? Class5.anIntArray36[i_7] : i_11;
				i_23 = i_0 + i_22;
				i_24 = i_0 - i_22;
				KeyHoldInputSubscriber.method3922(ints_18, i_21, i_24, i_4, (byte) -3);
				KeyHoldInputSubscriber.method3922(ints_18, i_24, i_23, i_3, (byte) 79);
				KeyHoldInputSubscriber.method3922(ints_18, i_23, i_20, i_4, (byte) -16);
				KeyHoldInputSubscriber.method3922(ints_19, i_21, i_24, i_4, (byte) 40);
				KeyHoldInputSubscriber.method3922(ints_19, i_24, i_23, i_3, (byte) -44);
				KeyHoldInputSubscriber.method3922(ints_19, i_23, i_20, i_4, (byte) -57);
			} else {
				KeyHoldInputSubscriber.method3922(ints_18, i_21, i_20, i_4, (byte) -47);
				KeyHoldInputSubscriber.method3922(ints_19, i_21, i_20, i_4, (byte) 12);
			}
		}
	}

	static Animable method2640(int i_0, int i_1, int i_2) {
		Class293 class293_4 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aClass293ArrayArrayArray2604[i_0][i_1][i_2];
		if (class293_4 == null) {
			return null;
		} else {
			Animable animable_5 = null;
			int i_6 = -1;
			for (Class208 class208_7 = class293_4.aClass208_3504; class208_7 != null; class208_7 = class208_7.aClass208_2660) {
				Class521_Sub1_Sub1 class521_sub1_sub1_8 = class208_7.aClass521_Sub1_Sub1_2659;
				if (class521_sub1_sub1_8 instanceof Animable) {
					Animable animable_9 = (Animable) class521_sub1_sub1_8;
					int i_10 = (animable_9.getSize() - 1) * 256 + 252;
					Vector3 vector3_11 = animable_9.method11166().aClass385_3595;
					int i_12 = (int) vector3_11.x - i_10 >> 9;
					int i_13 = (int) vector3_11.z - i_10 >> 9;
					int i_14 = i_10 + (int) vector3_11.x >> 9;
					int i_15 = i_10 + (int) vector3_11.z >> 9;
					if (i_12 <= i_1 && i_13 <= i_2 && i_14 >= i_1 && i_15 >= i_2) {
						int i_16 = (i_14 + 1 - i_1) * (i_15 + 1 - i_2);
						if (i_16 > i_6) {
							animable_5 = animable_9;
							i_6 = i_16;
						}
					}
				}
			}
			return animable_5;
		}
	}
}
