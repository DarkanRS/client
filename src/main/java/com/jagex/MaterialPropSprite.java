package com.jagex;

public class MaterialPropSprite extends MaterialProperty {

	public static int SPRITE_ARCHIVE_ID = -1;
	int[] pixels;
	int width;
	int height;
	int spriteId = -1;

	public MaterialPropSprite() {
		super(0, false);
	}

	@Override
	void decode(int opcode, ByteBuf buffer) {
		if (opcode == 0)
			spriteId = buffer.readUnsignedShort();

	}

	@Override
	int[][] getPixels(int i_1) {
		int[][] ints_3 = aClass308_7670.method5463(i_1);
		if (aClass308_7670.aBool3619 && method15398()) {
			int[] ints_4 = ints_3[0];
			int[] ints_5 = ints_3[1];
			int[] ints_6 = ints_3[2];
			int i_7 = (height != Class316.anInt3671 ? height * i_1 / Class316.anInt3671 : i_1) * width;
			int i_8;
			int i_9;
			if (width == Class316.anInt3670)
				for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
					i_9 = pixels[i_7++];
					ints_6[i_8] = (i_9 & 0xff) << 4;
					ints_5[i_8] = (i_9 & 0xff00) >> 4;
					ints_4[i_8] = (i_9 & 0xff0000) >> 12;
				}
			else
				for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
					i_9 = i_8 * width / Class316.anInt3670;
					int i_10 = pixels[i_7 + i_9];
					ints_6[i_8] = (i_10 & 0xff) << 4;
					ints_5[i_8] = (i_10 & 0xff00) >> 4;
					ints_4[i_8] = (i_10 & 0xff0000) >> 12;
				}
		}

		return ints_3;
	}

	@Override
	int getSpriteId() {
		return spriteId;
	}

	boolean method15398() {
		if (pixels != null)
			return true;
		if (spriteId >= 0) {
			SpriteDefinitions sprite = SPRITE_ARCHIVE_ID >= 0 ? SpriteDefinitions.getSprite(Class532_Sub2.CURR_SPRITE_INDEX, SPRITE_ARCHIVE_ID, spriteId) : SpriteDefinitions.method1515(Class532_Sub2.CURR_SPRITE_INDEX, spriteId);
			sprite.load();
			pixels = sprite.getPixels();
			width = sprite.width;
			height = sprite.height;
			return true;
		} else
			return false;
	}

	@Override
	void reset() {
		super.reset();
		pixels = null;
	}

}
