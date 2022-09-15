package com.jagex;

import java.awt.Font;

public class SpotAnimIndexLoader {

	static Font aFont5893;

	public static NativeSprite method8858(AbstractRenderer graphicalrenderer_0, int i_1) {
		VorbisNode class282_sub37_3 = (VorbisNode) Class492.INDEX36_FILE_CACHE.get(i_1);
		if (class282_sub37_3 != null) {
			Node_Sub41_Sub3 class282_sub41_sub3_4 = class282_sub37_3.vfReference.method4918();
			class282_sub37_3.aBool7996 = true;
			if (class282_sub41_sub3_4 != null) {
				Class492.aClass502_5776.aAbstractRenderer_5829 = graphicalrenderer_0;
				return class282_sub41_sub3_4.method14795(Class492.aClass502_5776);
			}
		}
		return null;
	}

	public static void method8860() {
		if (client.anInt7277 != -1 && client.anInt7448 != -1) {
			int i_1 = ((client.anInt7182 - client.anInt7327) * client.anInt7256 >> 16) + client.anInt7327;
			client.anInt7256 += i_1;
			if (client.anInt7256 >= 65535) {
				client.anInt7256 = 65535;
				client.aBool7355 = !client.aBool7285;
				client.aBool7285 = true;
			} else {
				client.aBool7355 = false;
				client.aBool7285 = false;
			}
			float f_2 = client.anInt7256 / 65535.0F;
			float[] floats_3 = new float[3];
			int i_4 = client.anInt7279 * 2;
			int i_7;
			int i_8;
			int i_9;
			int i_10;
			int i_12;
			int i_18;
			for (int i_5 = 0; i_5 < 3; i_5++) {
				int i_17 = client.anIntArrayArrayArray7302[client.anInt7277][i_4][i_5] * 3;
				i_7 = client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 1][i_5] * 3;
				i_8 = (client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 2][i_5] - (client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 3][i_5] - client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 2][i_5])) * 3;
				i_9 = client.anIntArrayArrayArray7302[client.anInt7277][i_4][i_5];
				i_10 = i_7 - i_17;
				i_18 = i_17 - i_7 * 2 + i_8;
				i_12 = client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 2][i_5] - i_9 + i_7 - i_8;
				floats_3[i_5] = i_9 + ((i_12 * f_2 + i_18) * f_2 + i_10) * f_2;
			}
			CoordGrid coordgrid_16 = IndexLoaders.MAP_REGION_DECODER.getBase();
			IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = (int) floats_3[0] - coordgrid_16.x * 512;
			Class109_Sub1.CAM_MOVE_ABSOLUTEZ = (int) floats_3[1] * -1;
			Class246.CAM_MOVE_ABSOLUTEY = (int) floats_3[2] - coordgrid_16.y * 512;
			float[] floats_6 = new float[3];
			i_7 = client.anInt7280 * 2;
			for (i_8 = 0; i_8 < 3; i_8++) {
				i_9 = client.anIntArrayArrayArray7302[client.anInt7448][i_7][i_8] * 3;
				i_10 = client.anIntArrayArrayArray7302[client.anInt7448][i_7 + 1][i_8] * 3;
				i_18 = (client.anIntArrayArrayArray7302[client.anInt7448][i_7 + 2][i_8] - (client.anIntArrayArrayArray7302[client.anInt7448][i_7 + 3][i_8] - client.anIntArrayArrayArray7302[client.anInt7448][i_7 + 2][i_8])) * 3;
				i_12 = client.anIntArrayArrayArray7302[client.anInt7448][i_7][i_8];
				int i_13 = i_10 - i_9;
				int i_14 = i_9 - i_10 * 2 + i_18;
				int i_15 = i_10 + (client.anIntArrayArrayArray7302[client.anInt7448][i_7 + 2][i_8] - i_12) - i_18;
				floats_6[i_8] = f_2 * ((i_14 + f_2 * i_15) * f_2 + i_13) + i_12;
			}
			float f_19 = floats_6[0] - floats_3[0];
			float f_20 = -1.0f * (floats_6[1] - floats_3[1]);
			float f_21 = floats_6[2] - floats_3[2];
			double d_11 = Math.sqrt(f_21 * f_21 + f_19 * f_19);
			Class293.anInt3512 = (int) (Math.atan2(f_20, d_11) * 2607.5945876176133D) & 0x3fff;
			AnimationDefinitions.anInt5930 = (int) (-Math.atan2(f_19, f_21) * 2607.5945876176133D) & 0x3fff;
			Class121.anInt1525 = ((client.anIntArrayArrayArray7302[client.anInt7277][i_4 + 2][3] - client.anIntArrayArrayArray7302[client.anInt7277][i_4][3]) * client.anInt7256 >> 16) + client.anIntArrayArrayArray7302[client.anInt7277][i_4][3];
		}
	}

	public static void method8862(int i_0, int i_1, int i_2, boolean bool_3) {
		if (Class393.preferences.currentToolkit.getValue() != 0) {
			Class291_Sub1.anInt8021 = Class393.preferences.currentToolkit.getValue();
			ParticleProducer.switchRenderType(0, true);
		} else
			Class122.method2111(false);
		Class291_Sub1.anInt8019 = i_1;
		Class291_Sub1.anInt8020 = i_2;
		Class291_Sub1.aBool8028 = bool_3;
		Class291.method5128(i_0);
	}

	LRUCache aClass229_5891 = new LRUCache(64);

	LRUCache aClass229_5890 = new LRUCache(60);

	Index aClass317_5888;

	Index aClass317_5889;

	int anInt5892;

	public SpotAnimIndexLoader(Index index_3, Index index_4) {
		aClass317_5888 = index_3;
		aClass317_5889 = index_4;
		int i_5 = aClass317_5888.containersCount() - 1;
		SharedConfigsType.SPOT_ANIMS.filesPerContainer();
		aClass317_5888.filesCount(i_5);
	}

	public SpotAnimDefinitions getSpotAnimDefs(int i_1) {
		LRUCache softcache_4 = aClass229_5891;
		SpotAnimDefinitions spotanimdefinitions_3;
		synchronized (aClass229_5891) {
			spotanimdefinitions_3 = (SpotAnimDefinitions) aClass229_5891.get(i_1);
		}
		if (spotanimdefinitions_3 != null)
			return spotanimdefinitions_3;
		Index index_5 = aClass317_5888;
		byte[] bytes_10;
		synchronized (aClass317_5888) {
			bytes_10 = aClass317_5888.getFile(SharedConfigsType.SPOT_ANIMS.containerId(i_1), SharedConfigsType.SPOT_ANIMS.fileId(i_1));
		}
		spotanimdefinitions_3 = new SpotAnimDefinitions();
		spotanimdefinitions_3.aClass515_6973 = this;
		spotanimdefinitions_3.anInt6969 = i_1;
		if (bytes_10 != null)
			spotanimdefinitions_3.method11226(new ByteBuf(bytes_10));
		LRUCache softcache_9 = aClass229_5891;
		synchronized (aClass229_5891) {
			aClass229_5891.put(spotanimdefinitions_3, i_1);
			return spotanimdefinitions_3;
		}
	}

	public void method8846(int i_1) {
		anInt5892 = i_1;
		LRUCache softcache_3 = aClass229_5890;
		synchronized (aClass229_5890) {
			aClass229_5890.method3859();
		}
	}

	public void method8847() {
		LRUCache softcache_3 = aClass229_5891;
		synchronized (aClass229_5891) {
			aClass229_5891.method3858(5);
		}
		softcache_3 = aClass229_5890;
		synchronized (aClass229_5890) {
			aClass229_5890.method3858(5);
		}
	}

	public void method8848() {
		LRUCache softcache_2 = aClass229_5891;
		synchronized (aClass229_5891) {
			aClass229_5891.method3859();
		}
		softcache_2 = aClass229_5890;
		synchronized (aClass229_5890) {
			aClass229_5890.method3859();
		}
	}

	public void method8849() {
		LRUCache softcache_2 = aClass229_5891;
		synchronized (aClass229_5891) {
			aClass229_5891.method3863();
		}
		softcache_2 = aClass229_5890;
		synchronized (aClass229_5890) {
			aClass229_5890.method3863();
		}
	}
}
