/* Class415 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class415 {
	public static final int anInt4981 = 0;
	static final int anInt4982 = 1;
	public int anInt4983 = 2026164587;
	public char aChar4984;
	public static int anInt4985;

	Class415() {
		/* empty */
	}

	void method6990(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method6991(class282_sub35, i_0_, -650729602);
		}
	}

	void method6991(RsByteBuffer class282_sub35, int i, int i_1_) {
		if (1 == i)
			aChar4984 = Class11.method470(class282_sub35.readByte((short) -32359), -792484929);
		else if (2 == i)
			anInt4983 = 0;
	}

	void method6992(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method6991(class282_sub35, i, -650729602);
		}
	}

	void method6993(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method6991(class282_sub35, i, -650729602);
		}
	}

	void method6994(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method6991(class282_sub35, i, -650729602);
		}
	}

	void method6995(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method6991(class282_sub35, i, -650729602);
		}
	}

	static void method6996(GraphicalRenderer class505, IComponentDefinitions class118, int i) {
		boolean bool = ((IndexLoaders.ITEM_INDEX_LOADER.softwareRender(class505, class118.anInt1426 * -56249735, 6040081 * class118.anInt1427, class118.anInt1323 * -346307573, ~0xffffff | class118.anInt1324 * 1279397863, 71935343 * class118.anInt1335, (class118.aBool1388 ? Class84.myPlayer.playerAppearance : null), 206421629)) == null);
		if (bool) {
			Class182.ITEMS.append(new Item(-56249735 * class118.anInt1426, 6040081 * class118.anInt1427, -346307573 * class118.anInt1323, (~0xffffff | 1279397863 * class118.anInt1324), 71935343 * class118.anInt1335, class118.aBool1388), 2129824962);
			Class109.method1858(class118, (byte) 71);
		}
	}

	static void method6997(GraphicalRenderer class505, ObjectDefinitions class478, int i, int i_2_, int i_3_, int i_4_) {
		Class418 class418 = IndexLoaders.aClass427_995.method7172(class478.anInt5689 * -272332433, -1014703371);
		if (-1 != class418.anInt4995 * -1053123675) {
			if (class478.aBool5671) {
				i += -1467651883 * class478.anInt5672;
				i &= 0x3;
			} else
				i = 0;
			NativeSprite class160 = class418.method7010(class505, i, class478.aBool5673, (byte) 75);
			if (class160 != null) {
				int i_5_ = -752356381 * class478.anInt5648;
				int i_6_ = -1610844647 * class478.anInt5649;
				if (1 == (i & 0x1)) {
					i_5_ = -1610844647 * class478.anInt5649;
					i_6_ = -752356381 * class478.anInt5648;
				}
				int i_7_ = class160.method228();
				int i_8_ = class160.method2748();
				if (class418.aBool4996) {
					i_7_ = i_5_ * 4;
					i_8_ = 4 * i_6_;
				}
				if (0 != class418.anInt4997 * -104422635)
					class160.method2754(i_2_, i_3_ - 4 * (i_6_ - 1), i_7_, i_8_, 0, (~0xffffff | -104422635 * class418.anInt4997), 1);
				else
					class160.method2789(i_2_, i_3_ - (i_6_ - 1) * 4, i_7_, i_8_);
			}
		}
	}

	static final void method6998(CS2Executor class527, byte i) {
		if (Class233.anInt2880 * -638562019 == 2)
			Class188.aBool2378 = true;
		else if (-638562019 * Class233.anInt2880 == 1)
			Class188.aBool2377 = true;
		else if (Class233.anInt2880 * -638562019 == 3)
			Class188.aBool2372 = true;
	}
}
