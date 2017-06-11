/* Class298_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37 extends Linkable {
	public Class298_Sub37 aClass298_Sub37_7404;
	public Class298_Sub37 aClass298_Sub37_7405;
	public long aLong7406;
	public static int[][] anIntArrayArray7407;

	public void method3402(int i) {
		try {
			if (aClass298_Sub37_7404 != null) {
				aClass298_Sub37_7404.aClass298_Sub37_7405 = aClass298_Sub37_7405;
				aClass298_Sub37_7405.aClass298_Sub37_7404 = aClass298_Sub37_7404;
				aClass298_Sub37_7405 = null;
				aClass298_Sub37_7404 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abv.c(").append(')').toString());
		}
	}

	public static int calculateRoute(int startX, int startY, int size, Class336 class336, Class289 planeClipData, boolean alternativeRoute, int[] calculatedPositionXsArray, int[] calculatedPositionYsArray) {
		try {
			for (int i_4_ = 0; i_4_ < 128; i_4_++) {
				for (int i_5_ = 0; i_5_ < 128; i_5_++) {
					Class285.anIntArrayArray3076[i_4_][i_5_] = 0;
					Class285.anIntArrayArray3080[i_4_][i_5_] = 99999999;
				}
			}
			boolean bool_6_;
			if (size == 1)
				bool_6_ = Class330.method4006(startX, startY, class336, planeClipData, -369838027);
			else if (2 == size)
				bool_6_ = Class228.method2120(startX, startY, class336, planeClipData, -1327541421);
			else
				bool_6_ = Class372.method4593(startX, startY, size, class336, planeClipData, (byte) 58);
			int i_7_ = startX - 64;
			int i_8_ = startY - 64;
			int i_9_ = -1035599555 * Class285.anInt3078;
			int i_10_ = 1111664165 * ClanMember.anInt1684;
			if (!bool_6_) {
				if (alternativeRoute) {
					int i_11_ = 2147483647;
					int i_12_ = 2147483647;
					int i_13_ = 10;
					int i_14_ = class336.toX * -1331662251;
					int i_15_ = 1517720743 * class336.toY;
					int i_16_ = class336.sizeX * -1900284579;
					int i_17_ = 772610897 * class336.sizeY;
					for (int i_18_ = i_14_ - i_13_; i_18_ <= i_13_ + i_14_; i_18_++) {
						for (int i_19_ = i_15_ - i_13_; i_19_ <= i_15_ + i_13_; i_19_++) {
							int i_20_ = i_18_ - i_7_;
							int i_21_ = i_19_ - i_8_;
							if (i_20_ >= 0 && i_21_ >= 0 && i_20_ < 128 && i_21_ < 128 && (Class285.anIntArrayArray3080[i_20_][i_21_] < 100)) {
								int i_22_ = 0;
								if (i_18_ < i_14_)
									i_22_ = i_14_ - i_18_;
								else if (i_18_ > i_16_ + i_14_ - 1)
									i_22_ = i_18_ - (i_16_ + i_14_ - 1);
								int i_23_ = 0;
								if (i_19_ < i_15_)
									i_23_ = i_15_ - i_19_;
								else if (i_19_ > i_15_ + i_17_ - 1)
									i_23_ = i_19_ - (i_17_ + i_15_ - 1);
								int i_24_ = i_22_ * i_22_ + i_23_ * i_23_;
								if (i_24_ < i_11_ || (i_24_ == i_11_ && (Class285.anIntArrayArray3080[i_20_][i_21_]) < i_12_)) {
									i_11_ = i_24_;
									i_12_ = (Class285.anIntArrayArray3080[i_20_][i_21_]);
									i_9_ = i_18_;
									i_10_ = i_19_;
								}
							}
						}
					}
					if (i_11_ == 2147483647)
						return -1;
				} else
					return -1;
			}
			if (startX == i_9_ && i_10_ == startY)
				return 0;
			int i_25_ = 0;
			Class285.routeFinderXArray[i_25_] = i_9_;
			Class285.routeFinderYArray[i_25_++] = i_10_;
			int i_27_;
			int i_26_ = (i_27_ = Class285.anIntArrayArray3076[i_9_ - i_7_][i_10_ - i_8_]);
			while (startX != i_9_ || startY != i_10_) {
				if (i_27_ != i_26_) {
					i_27_ = i_26_;
					Class285.routeFinderXArray[i_25_] = i_9_;
					Class285.routeFinderYArray[i_25_++] = i_10_;
				}
				if (0 != (i_26_ & 0x2))
					i_9_++;
				else if (0 != (i_26_ & 0x8))
					i_9_--;
				if ((i_26_ & 0x1) != 0)
					i_10_++;
				else if ((i_26_ & 0x4) != 0)
					i_10_--;
				i_26_ = Class285.anIntArrayArray3076[i_9_ - i_7_][i_10_ - i_8_];
			}
			int steps = 0;
			while_8_: do {
				do {
					if (i_25_-- <= 0)
						break while_8_;
					calculatedPositionXsArray[steps] = Class285.routeFinderXArray[i_25_];
					calculatedPositionYsArray[steps++] = Class285.routeFinderYArray[i_25_];
				} while (steps < calculatedPositionXsArray.length);
			} while (false);
			return steps;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abv.a(").append(')').toString());
		}
	}

	static final void method3404(ClientScript2 class403, byte i) {
		try {
			int i_29_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class298_Sub37_Sub13 class298_sub37_sub13 = Class301.method3705(i_29_);
			if (class298_sub37_sub13 == null) {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			} else {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (-2052483955 * class298_sub37_sub13.anInt9647 - class298_sub37_sub13.anInt9650 * 1364716801);
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (929385381 * class298_sub37_sub13.anInt9646 - class298_sub37_sub13.anInt9649 * 1345239131);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abv.adj(").append(')').toString());
		}
	}

	static Class98_Sub2 method3405(RsByteBuffer class298_sub53, int i) {
		try {
			return new Class98_Sub2(class298_sub53.readShort(1780611979), class298_sub53.readShort(2084327915), class298_sub53.readShort(1750072102), class298_sub53.readShort(1941131752), class298_sub53.read24BitUnsignedInteger((byte) 56), class298_sub53.readUnsignedByte());
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abv.r(").append(')').toString());
		}
	}
}
