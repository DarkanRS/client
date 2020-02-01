package com.jagex;
public class CursorDefintions {

	CursorIndexLoader loader;
	static NativeSprite aNativeSprite_5004;
	int spriteId;
	public int anInt5002;
	public int anInt5000;

	void method7024(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method7025(rsbytebuffer_1, i_3);
		}
	}

	void method7025(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.spriteId = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 2) {
			this.anInt5002 = rsbytebuffer_1.readUnsignedByte();
			this.anInt5000 = rsbytebuffer_1.readUnsignedByte();
		}

	}

	public synchronized SpriteDefinitions getSprite() {
		SpriteDefinitions class91_2 = (SpriteDefinitions) this.loader.aClass229_5342.get((long) this.spriteId);
		if (class91_2 != null) {
			return class91_2;
		} else {
			class91_2 = SpriteDefinitions.getSprite(this.loader.spritesIndex, this.spriteId, 0);
			if (class91_2 != null) {
				this.loader.aClass229_5342.put(class91_2, (long) this.spriteId);
			}

			return class91_2;
		}
	}

}
