/* Class521_Sub1_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class521_Sub1_Sub5 extends Class521_Sub1 {
	public short aShort9615;
	static int[] anIntArray9618 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	boolean method12988(GraphicalRenderer class505) {
		Class385 class385 = method11166().aClass385_3595;
		return (aClass206_7970.aClass201_2600.method3275(this, aByte7968, ((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293), ((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293)));
	}

	int method13025(Class282_Sub24[] class282_sub24s) {
		Class385 class385 = method11166().aClass385_3595;
		int i = ((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293);
		int i_0_ = ((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293);
		int i_1_ = 0;
		if (-527863643 * ((SceneObjectManager) aClass206_7970).anInt2628 == i)
			i_1_++;
		else if (((SceneObjectManager) aClass206_7970).anInt2628 * -527863643 < i)
			i_1_ += 2;
		if (i_0_ == 1580412859 * ((SceneObjectManager) aClass206_7970).anInt2629)
			i_1_ += 3;
		else if (1580412859 * ((SceneObjectManager) aClass206_7970).anInt2629 > i_0_)
			i_1_ += 6;
		int i_2_ = anIntArray9618[i_1_];
		if ((aShort9615 & i_2_) != 0)
			return method13004(i, i_0_, class282_sub24s, 868144561);
		if (aShort9615 == 1 && i > 0)
			return method13004(i - 1, i_0_, class282_sub24s, 868144561);
		if (aShort9615 == 4 && i <= aClass206_7970.anInt2617 * -1912960305)
			return method13004(i + 1, i_0_, class282_sub24s, 868144561);
		if (8 == aShort9615 && i_0_ > 0)
			return method13004(i, i_0_ - 1, class282_sub24s, 868144561);
		if (aShort9615 == 2 && i_0_ <= -18177099 * aClass206_7970.anInt2603)
			return method13004(i, 1 + i_0_, class282_sub24s, 868144561);
		if (aShort9615 == 16 && i > 0 && i_0_ <= aClass206_7970.anInt2603 * -18177099)
			return method13004(i - 1, i_0_ + 1, class282_sub24s, 868144561);
		if (32 == aShort9615 && i <= -1912960305 * aClass206_7970.anInt2617 && i_0_ <= -18177099 * aClass206_7970.anInt2603)
			return method13004(i + 1, 1 + i_0_, class282_sub24s, 868144561);
		if (aShort9615 == 128 && i > 0 && i_0_ > 0)
			return method13004(i - 1, i_0_ - 1, class282_sub24s, 868144561);
		if (aShort9615 == 64 && i <= -1912960305 * aClass206_7970.anInt2617 && i_0_ > 0)
			return method13004(1 + i, i_0_ - 1, class282_sub24s, 868144561);
		throw new RuntimeException("");
	}

	boolean method13037(GraphicalRenderer class505, int i) {
		Class385 class385 = method11166().aClass385_3595;
		return (aClass206_7970.aClass201_2600.method3275(this, aByte7968, ((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293), ((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293)));
	}

	boolean method13029(byte i) {
		Class385 class385 = method11166().aClass385_3595;
		return (((SceneObjectManager) aClass206_7970).aBoolArrayArray2651[(((SceneObjectManager) aClass206_7970).anInt2652 * 1459994833 + (((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293) - -527863643 * ((SceneObjectManager) aClass206_7970).anInt2628))][(1459994833 * ((SceneObjectManager) aClass206_7970).anInt2652 + (((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293) - ((SceneObjectManager) aClass206_7970).anInt2629 * 1580412859))]);
	}

	int method13036(Class282_Sub24[] class282_sub24s, int i) {
		Class385 class385 = method11166().aClass385_3595;
		int i_3_ = ((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293);
		int i_4_ = ((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293);
		int i_5_ = 0;
		if (-527863643 * ((SceneObjectManager) aClass206_7970).anInt2628 == i_3_)
			i_5_++;
		else if (((SceneObjectManager) aClass206_7970).anInt2628 * -527863643 < i_3_)
			i_5_ += 2;
		if (i_4_ == 1580412859 * ((SceneObjectManager) aClass206_7970).anInt2629)
			i_5_ += 3;
		else if (1580412859 * ((SceneObjectManager) aClass206_7970).anInt2629 > i_4_)
			i_5_ += 6;
		int i_6_ = anIntArray9618[i_5_];
		if ((aShort9615 & i_6_) != 0)
			return method13004(i_3_, i_4_, class282_sub24s, 868144561);
		if (aShort9615 == 1 && i_3_ > 0)
			return method13004(i_3_ - 1, i_4_, class282_sub24s, 868144561);
		if (aShort9615 == 4 && i_3_ <= aClass206_7970.anInt2617 * -1912960305)
			return method13004(i_3_ + 1, i_4_, class282_sub24s, 868144561);
		if (8 == aShort9615 && i_4_ > 0)
			return method13004(i_3_, i_4_ - 1, class282_sub24s, 868144561);
		if (aShort9615 == 2 && i_4_ <= -18177099 * aClass206_7970.anInt2603)
			return method13004(i_3_, 1 + i_4_, class282_sub24s, 868144561);
		if (aShort9615 == 16 && i_3_ > 0 && i_4_ <= aClass206_7970.anInt2603 * -18177099)
			return method13004(i_3_ - 1, i_4_ + 1, class282_sub24s, 868144561);
		if (32 == aShort9615 && i_3_ <= -1912960305 * aClass206_7970.anInt2617 && i_4_ <= -18177099 * aClass206_7970.anInt2603)
			return method13004(i_3_ + 1, 1 + i_4_, class282_sub24s, 868144561);
		if (aShort9615 == 128 && i_3_ > 0 && i_4_ > 0)
			return method13004(i_3_ - 1, i_4_ - 1, class282_sub24s, 868144561);
		if (aShort9615 == 64 && i_3_ <= -1912960305 * aClass206_7970.anInt2617 && i_4_ > 0)
			return method13004(1 + i_3_, i_4_ - 1, class282_sub24s, 868144561);
		throw new RuntimeException("");
	}

	boolean method13034() {
		Class385 class385 = method11166().aClass385_3595;
		return (((SceneObjectManager) aClass206_7970).aBoolArrayArray2651[(((SceneObjectManager) aClass206_7970).anInt2652 * 1459994833 + (((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293) - -527863643 * ((SceneObjectManager) aClass206_7970).anInt2628))][(1459994833 * ((SceneObjectManager) aClass206_7970).anInt2652 + (((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293) - ((SceneObjectManager) aClass206_7970).anInt2629 * 1580412859))]);
	}

	Class521_Sub1_Sub5(SceneObjectManager class206, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		super(class206);
		aByte7967 = (byte) i_9_;
		aByte7968 = (byte) i_10_;
		aShort9615 = (short) i_11_;
		method11171(new Class385((float) i, (float) i_7_, (float) i_8_));
	}

	boolean method12998(GraphicalRenderer class505) {
		Class385 class385 = method11166().aClass385_3595;
		return (aClass206_7970.aClass201_2600.method3275(this, aByte7968, ((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293), ((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293)));
	}

	boolean method13022(GraphicalRenderer class505) {
		Class385 class385 = method11166().aClass385_3595;
		return (aClass206_7970.aClass201_2600.method3275(this, aByte7968, ((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293), ((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293)));
	}

	int method13031(Class282_Sub24[] class282_sub24s) {
		Class385 class385 = method11166().aClass385_3595;
		int i = ((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293);
		int i_12_ = ((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293);
		int i_13_ = 0;
		if (-527863643 * ((SceneObjectManager) aClass206_7970).anInt2628 == i)
			i_13_++;
		else if (((SceneObjectManager) aClass206_7970).anInt2628 * -527863643 < i)
			i_13_ += 2;
		if (i_12_ == 1580412859 * ((SceneObjectManager) aClass206_7970).anInt2629)
			i_13_ += 3;
		else if (1580412859 * ((SceneObjectManager) aClass206_7970).anInt2629 > i_12_)
			i_13_ += 6;
		int i_14_ = anIntArray9618[i_13_];
		if ((aShort9615 & i_14_) != 0)
			return method13004(i, i_12_, class282_sub24s, 868144561);
		if (aShort9615 == 1 && i > 0)
			return method13004(i - 1, i_12_, class282_sub24s, 868144561);
		if (aShort9615 == 4 && i <= aClass206_7970.anInt2617 * -1912960305)
			return method13004(i + 1, i_12_, class282_sub24s, 868144561);
		if (8 == aShort9615 && i_12_ > 0)
			return method13004(i, i_12_ - 1, class282_sub24s, 868144561);
		if (aShort9615 == 2 && i_12_ <= -18177099 * aClass206_7970.anInt2603)
			return method13004(i, 1 + i_12_, class282_sub24s, 868144561);
		if (aShort9615 == 16 && i > 0 && i_12_ <= aClass206_7970.anInt2603 * -18177099)
			return method13004(i - 1, i_12_ + 1, class282_sub24s, 868144561);
		if (32 == aShort9615 && i <= -1912960305 * aClass206_7970.anInt2617 && i_12_ <= -18177099 * aClass206_7970.anInt2603)
			return method13004(i + 1, 1 + i_12_, class282_sub24s, 868144561);
		if (aShort9615 == 128 && i > 0 && i_12_ > 0)
			return method13004(i - 1, i_12_ - 1, class282_sub24s, 868144561);
		if (aShort9615 == 64 && i <= -1912960305 * aClass206_7970.anInt2617 && i_12_ > 0)
			return method13004(1 + i, i_12_ - 1, class282_sub24s, 868144561);
		throw new RuntimeException("");
	}

	boolean method13030(GraphicalRenderer class505) {
		Class385 class385 = method11166().aClass385_3595;
		return (aClass206_7970.aClass201_2600.method3275(this, aByte7968, ((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293), ((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293)));
	}

	int method13024(Class282_Sub24[] class282_sub24s) {
		Class385 class385 = method11166().aClass385_3595;
		int i = ((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293);
		int i_15_ = ((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293);
		int i_16_ = 0;
		if (-527863643 * ((SceneObjectManager) aClass206_7970).anInt2628 == i)
			i_16_++;
		else if (((SceneObjectManager) aClass206_7970).anInt2628 * -527863643 < i)
			i_16_ += 2;
		if (i_15_ == 1580412859 * ((SceneObjectManager) aClass206_7970).anInt2629)
			i_16_ += 3;
		else if (1580412859 * ((SceneObjectManager) aClass206_7970).anInt2629 > i_15_)
			i_16_ += 6;
		int i_17_ = anIntArray9618[i_16_];
		if ((aShort9615 & i_17_) != 0)
			return method13004(i, i_15_, class282_sub24s, 868144561);
		if (aShort9615 == 1 && i > 0)
			return method13004(i - 1, i_15_, class282_sub24s, 868144561);
		if (aShort9615 == 4 && i <= aClass206_7970.anInt2617 * -1912960305)
			return method13004(i + 1, i_15_, class282_sub24s, 868144561);
		if (8 == aShort9615 && i_15_ > 0)
			return method13004(i, i_15_ - 1, class282_sub24s, 868144561);
		if (aShort9615 == 2 && i_15_ <= -18177099 * aClass206_7970.anInt2603)
			return method13004(i, 1 + i_15_, class282_sub24s, 868144561);
		if (aShort9615 == 16 && i > 0 && i_15_ <= aClass206_7970.anInt2603 * -18177099)
			return method13004(i - 1, i_15_ + 1, class282_sub24s, 868144561);
		if (32 == aShort9615 && i <= -1912960305 * aClass206_7970.anInt2617 && i_15_ <= -18177099 * aClass206_7970.anInt2603)
			return method13004(i + 1, 1 + i_15_, class282_sub24s, 868144561);
		if (aShort9615 == 128 && i > 0 && i_15_ > 0)
			return method13004(i - 1, i_15_ - 1, class282_sub24s, 868144561);
		if (aShort9615 == 64 && i <= -1912960305 * aClass206_7970.anInt2617 && i_15_ > 0)
			return method13004(1 + i, i_15_ - 1, class282_sub24s, 868144561);
		throw new RuntimeException("");
	}

	boolean method13032() {
		Class385 class385 = method11166().aClass385_3595;
		return (((SceneObjectManager) aClass206_7970).aBoolArrayArray2651[(((SceneObjectManager) aClass206_7970).anInt2652 * 1459994833 + (((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293) - -527863643 * ((SceneObjectManager) aClass206_7970).anInt2628))][(1459994833 * ((SceneObjectManager) aClass206_7970).anInt2652 + (((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293) - ((SceneObjectManager) aClass206_7970).anInt2629 * 1580412859))]);
	}

	boolean method13033() {
		Class385 class385 = method11166().aClass385_3595;
		return (((SceneObjectManager) aClass206_7970).aBoolArrayArray2651[(((SceneObjectManager) aClass206_7970).anInt2652 * 1459994833 + (((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293) - -527863643 * ((SceneObjectManager) aClass206_7970).anInt2628))][(1459994833 * ((SceneObjectManager) aClass206_7970).anInt2652 + (((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293) - ((SceneObjectManager) aClass206_7970).anInt2629 * 1580412859))]);
	}

	int method12982(Class282_Sub24[] class282_sub24s) {
		Class385 class385 = method11166().aClass385_3595;
		int i = ((int) class385.aFloat4671 >> aClass206_7970.anInt2592 * -1928575293);
		int i_18_ = ((int) class385.aFloat4673 >> aClass206_7970.anInt2592 * -1928575293);
		int i_19_ = 0;
		if (-527863643 * ((SceneObjectManager) aClass206_7970).anInt2628 == i)
			i_19_++;
		else if (((SceneObjectManager) aClass206_7970).anInt2628 * -527863643 < i)
			i_19_ += 2;
		if (i_18_ == 1580412859 * ((SceneObjectManager) aClass206_7970).anInt2629)
			i_19_ += 3;
		else if (1580412859 * ((SceneObjectManager) aClass206_7970).anInt2629 > i_18_)
			i_19_ += 6;
		int i_20_ = anIntArray9618[i_19_];
		if ((aShort9615 & i_20_) != 0)
			return method13004(i, i_18_, class282_sub24s, 868144561);
		if (aShort9615 == 1 && i > 0)
			return method13004(i - 1, i_18_, class282_sub24s, 868144561);
		if (aShort9615 == 4 && i <= aClass206_7970.anInt2617 * -1912960305)
			return method13004(i + 1, i_18_, class282_sub24s, 868144561);
		if (8 == aShort9615 && i_18_ > 0)
			return method13004(i, i_18_ - 1, class282_sub24s, 868144561);
		if (aShort9615 == 2 && i_18_ <= -18177099 * aClass206_7970.anInt2603)
			return method13004(i, 1 + i_18_, class282_sub24s, 868144561);
		if (aShort9615 == 16 && i > 0 && i_18_ <= aClass206_7970.anInt2603 * -18177099)
			return method13004(i - 1, i_18_ + 1, class282_sub24s, 868144561);
		if (32 == aShort9615 && i <= -1912960305 * aClass206_7970.anInt2617 && i_18_ <= -18177099 * aClass206_7970.anInt2603)
			return method13004(i + 1, 1 + i_18_, class282_sub24s, 868144561);
		if (aShort9615 == 128 && i > 0 && i_18_ > 0)
			return method13004(i - 1, i_18_ - 1, class282_sub24s, 868144561);
		if (aShort9615 == 64 && i <= -1912960305 * aClass206_7970.anInt2617 && i_18_ > 0)
			return method13004(1 + i, i_18_ - 1, class282_sub24s, 868144561);
		throw new RuntimeException("");
	}
}
