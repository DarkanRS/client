package com.jagex;

public class CutsceneAction_Sub10_Sub2 extends CutsceneAction_Sub10 {

	int anInt10223;
	int anInt10222;
	int anInt10224;

	CutsceneAction_Sub10_Sub2(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		int i_2 = rsbytebuffer_1.readInt();
		anInt10223 = i_2 >>> 16;
		anInt10222 = i_2 & 0xffff;
		anInt10224 = rsbytebuffer_1.readUnsignedByte();
	}

	@Override
	public void method1592() {
		int i_2 = anInt10223 * 512 + 256;
		int i_3 = anInt10222 * 512 + 256;
		int i_4 = anInt10224;
		if (i_4 < 3 && IndexLoaders.MAP_REGION_DECODER.getRenderFlags().isLowerObjectsToOverrideClipping(anInt10223, anInt10222))
			++i_4;

		SpotAnimation class521_sub1_sub1_sub4_5 = new SpotAnimation(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), anInt9296, 0, anInt10224, i_4, i_2, Class504.getTerrainHeightAtPos(i_2, i_3, anInt10224) - anInt9295, i_3, anInt10223, anInt10223, anInt10222, anInt10222, anInt9297, false);
		client.aClass465_7334.put(new CacheableNode_Sub10(class521_sub1_sub1_sub4_5), anInt10223 << 16 | anInt10222);
	}

	public void method1601() {
		int i_1 = 256 + anInt10223 * -979961597 * 611538432;
		int i_2 = 256 + anInt10222 * -1994093411 * -55350784;
		int i_3 = -387189251 * anInt10224 * -51671211;
		if (i_3 < 3 && IndexLoaders.MAP_REGION_DECODER.getRenderFlags().isLowerObjectsToOverrideClipping(anInt10223 * -979961597 * 563231147, anInt10222 * -1994093411 * -344041035))
			++i_3;

		SpotAnimation class521_sub1_sub1_sub4_4 = new SpotAnimation(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), 660169595 * anInt9296 * -1972436045, 0, -387189251 * anInt10224 * -51671211, i_3, i_1, Class504.getTerrainHeightAtPos(i_1, i_2, anInt10224 * -51671211 * -387189251) - anInt9295 * 143267879 * 277206935, i_2, 563231147 * anInt10223 * -979961597, anInt10223 * -979961597 * 563231147, -344041035 * anInt10222 * -1994093411, -344041035 * anInt10222 * -1994093411, anInt9297 * 468728079 * 1009489391, false);
		client.aClass465_7334.put(new CacheableNode_Sub10(class521_sub1_sub1_sub4_4), anInt10223 * -979961597 * 563231147 << 16 | -344041035 * anInt10222 * -1994093411);
	}

}
