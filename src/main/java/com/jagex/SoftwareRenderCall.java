package com.jagex;

public class SoftwareRenderCall implements Hashable {

	static Class149_Sub4 method7033(ByteBuf rsbytebuffer_0) {
		return new Class149_Sub4(rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.readUnsignedByte());
	}

	public static void method7034(AnimationDefinitions defs, int i_1) {
		if (Class260.SOUNDS_SIZE < 50 && defs != null && defs.soundSettings != null && i_1 < defs.soundSettings.length && defs.soundSettings[i_1] != null) {
			int i_3 = defs.soundSettings[i_1][0];
			int i_4 = i_3 >> 8;
		int i_5 = i_3 >> 5 & 0x7;
		int i_6;
		if (defs.soundSettings[i_1].length > 1) {
			i_6 = (int) (Math.random() * defs.soundSettings[i_1].length);
			if (i_6 > 0)
				i_4 = defs.soundSettings[i_1][i_6];
		}
		i_6 = 256;
		if (defs.anIntArray5927 != null && defs.anIntArray5919 != null)
			i_6 = Class76.method1356(defs.anIntArray5927[i_1], defs.anIntArray5919[i_1]);
		int i_7 = defs.soundDurations == null ? 255 : defs.soundDurations[i_1];
		if (defs.vorbisSound)
			Class435.playSoundVorbis(i_4, i_5, 0, i_7, false, i_6);
		else
			VarNPCMap.playSoundSynth(i_4, i_5, 0, i_7, i_6);
		}
	}

	static boolean method7035(char var_0) {
		return var_0 == 160 || var_0 == 32 || var_0 == 95 || var_0 == 45;
	}

	int outlineSize;

	int itemAmount;

	int itemId;

	int rendererId;

	int shadowColor;

	int renderStack;

	boolean hasPlayerAppearance;

	@Override
	public long getHashCode() {
		long[] longs_1 = ByteBuf.aLongArray7979;
		long long_2 = -1L;
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ rendererId) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (itemId >> 8)) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ itemId) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (itemAmount >> 24)) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (itemAmount >> 16)) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (itemAmount >> 8)) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ itemAmount) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ outlineSize) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (shadowColor >> 24)) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (shadowColor >> 16)) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (shadowColor >> 8)) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ shadowColor) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ renderStack) & 0xffL)];
		long_2 = long_2 >>> 8 ^ longs_1[(int) ((long_2 ^ (hasPlayerAppearance ? 1 : 0)) & 0xffL)];
		return long_2;
	}

	@Override
	public boolean isEqual(Hashable interface18_1) {
		if (!(interface18_1 instanceof SoftwareRenderCall softwareitemrender_2))
			return false;
		return softwareitemrender_2.rendererId == rendererId && (softwareitemrender_2.itemId == itemId && (softwareitemrender_2.itemAmount == itemAmount && (outlineSize == softwareitemrender_2.outlineSize && (softwareitemrender_2.shadowColor == shadowColor && (softwareitemrender_2.renderStack == renderStack && softwareitemrender_2.hasPlayerAppearance == hasPlayerAppearance)))));
	}
}
