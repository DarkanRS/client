package com.jagex;

import com.Loader;

public class Node_Sub20_Sub26 extends Node_Sub20 {

	int anInt9886 = 4096;

	int[] method12319(int i_1) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, 798975247);
		if (this.aClass320_7667.aBool3722) {
			int[] ints_4 = this.method12317(0, i_1 - 1 & Class316.anInt3673, 2146057922);
			int[] ints_5 = this.method12317(0, i_1, 1965777622);
			int[] ints_6 = this.method12317(0, i_1 + 1 & Class316.anInt3673, 2055887552);

			for (int i_7 = 0; i_7 < Class316.anInt3670; i_7++) {
				int i_8 = (ints_6[i_7] - ints_4[i_7]) * this.anInt9886;
				int i_9 = (ints_5[i_7 + 1 & Class316.anInt3669] - ints_5[i_7 - 1 & Class316.anInt3669]) * this.anInt9886;
				int i_10 = i_9 >> 12;
				int i_11 = i_8 >> 12;
				int i_12 = i_10 * i_10 >> 12;
				int i_13 = i_11 * i_11 >> 12;
				int i_14 = (int) (Math.sqrt((double) ((float) (i_13 + i_12 + 4096) / 4096.0F)) * 4096.0D);
				int i_15 = i_14 != 0 ? 16777216 / i_14 : 0;
				ints_3[i_7] = 4096 - i_15;
			}
		}

		return ints_3;
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2) {
		if (i_1 == 0) {
			this.anInt9886 = rsbytebuffer_2.readUnsignedShort();
		}

	}

	public Node_Sub20_Sub26() {
		super(1, true);
	}

	static void lobbyLogin(String string_0, String string_1) {
		if (!Loader.LOBBY_ENABLED) {
			ParticleArchive1Def.worldLogin(string_0, string_1, (byte) -8);
			return;
		}
		Class9.lobbyStage = 140;
		Class9.CURRENT_CONNECTION_CONTEXT = client.LOBBY_CONNECTION_CONTEXT;
		Class455.method7558(false, false, string_0, string_1, -1L);
	}

}
