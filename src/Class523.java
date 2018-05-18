/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class523 {
	SoftCache aClass229_6954;
	SoftCache aClass229_6955 = new SoftCache(64);
	Index aClass317_6956;
	public static Index aClass317_6957;

	public void method11204(int i) {
		synchronized (((Class523) this).aClass229_6955) {
			((Class523) this).aClass229_6955.method3859(1867962972);
		}
		synchronized (((Class523) this).aClass229_6954) {
			((Class523) this).aClass229_6954.method3859(335894365);
		}
	}

	public AnimationDefinitions method11205(int i, byte i_0_) {
		AnimationDefinitions class518;
		synchronized (((Class523) this).aClass229_6955) {
			class518 = ((AnimationDefinitions) ((Class523) this).aClass229_6955.method3865((long) i));
		}
		if (null != class518)
			return class518;
		byte[] is;
		synchronized (((Class523) this).aClass317_6956) {
			is = (((Class523) this).aClass317_6956.getFile(SharedConfigsType.aClass120_1475.containerId(i, -724424749), SharedConfigsType.aClass120_1475.fileId(i, -2052729107), -1610742451));
		}
		class518 = new AnimationDefinitions();
		class518.anInt5909 = i * 919942973;
		((AnimationDefinitions) class518).aClass523_5908 = this;
		if (null != is)
			class518.method11130(new RsByteBuffer(is), -2068474756);
		class518.method11143((byte) -115);
		synchronized (((Class523) this).aClass229_6955) {
			((Class523) this).aClass229_6955.put(class518, (long) i);
		}
		return class518;
	}

	public Class523(Game class486, Language class495, Index class317, Index class317_1_, Index class317_2_) {
		((Class523) this).aClass229_6954 = new SoftCache(100);
		((Class523) this).aClass317_6956 = class317;
		if (null != ((Class523) this).aClass317_6956) {
			int i = ((Class523) this).aClass317_6956.containersCount(-738745647) - 1;
			SharedConfigsType.aClass120_1475.filesPerContainer(-1584727313);
			((Class523) this).aClass317_6956.filesCount(i, -812236501);
		}
		Class96_Sub10_Sub1.method15554(class317_1_, class317_2_, 2, -1736051925);
	}

	public AnimationDefinitions method11206(int i) {
		AnimationDefinitions class518;
		synchronized (((Class523) this).aClass229_6955) {
			class518 = ((AnimationDefinitions) ((Class523) this).aClass229_6955.method3865((long) i));
		}
		if (null != class518)
			return class518;
		byte[] is;
		synchronized (((Class523) this).aClass317_6956) {
			is = (((Class523) this).aClass317_6956.getFile(SharedConfigsType.aClass120_1475.containerId(i, 1295408569), SharedConfigsType.aClass120_1475.fileId(i, -2139558643), -1900901959));
		}
		class518 = new AnimationDefinitions();
		class518.anInt5909 = i * 919942973;
		((AnimationDefinitions) class518).aClass523_5908 = this;
		if (null != is)
			class518.method11130(new RsByteBuffer(is), -528606767);
		class518.method11143((byte) -109);
		synchronized (((Class523) this).aClass229_6955) {
			((Class523) this).aClass229_6955.put(class518, (long) i);
		}
		return class518;
	}

	public Class282_Sub50_Sub13 method11207(int i, int i_3_) {
		Class282_Sub50_Sub13 class282_sub50_sub13;
		synchronized (((Class523) this).aClass229_6954) {
			class282_sub50_sub13 = ((Class282_Sub50_Sub13) ((Class523) this).aClass229_6954.method3865((long) i));
			if (class282_sub50_sub13 == null) {
				class282_sub50_sub13 = new Class282_Sub50_Sub13(i);
				((Class523) this).aClass229_6954.put(class282_sub50_sub13, (long) i);
			}
			if (!class282_sub50_sub13.method15086((byte) 5)) {
				Class282_Sub50_Sub13 class282_sub50_sub13_4_ = null;
				return class282_sub50_sub13_4_;
			}
		}
		return class282_sub50_sub13;
	}

	public void method11208(int i) {
		synchronized (((Class523) this).aClass229_6955) {
			((Class523) this).aClass229_6955.method3863(2031071202);
		}
		synchronized (((Class523) this).aClass229_6954) {
			((Class523) this).aClass229_6954.method3863(1832973954);
		}
	}

	public void method11209(int i) {
		synchronized (((Class523) this).aClass229_6955) {
			((Class523) this).aClass229_6955.method3858(i, (byte) 34);
		}
		synchronized (((Class523) this).aClass229_6954) {
			((Class523) this).aClass229_6954.method3858(i, (byte) -34);
		}
	}

	public void method11210(int i, byte i_5_) {
		synchronized (((Class523) this).aClass229_6955) {
			((Class523) this).aClass229_6955.method3858(i, (byte) -49);
		}
		synchronized (((Class523) this).aClass229_6954) {
			((Class523) this).aClass229_6954.method3858(i, (byte) -26);
		}
	}

	public Class282_Sub50_Sub13 method11211(int i) {
		Class282_Sub50_Sub13 class282_sub50_sub13;
		synchronized (((Class523) this).aClass229_6954) {
			class282_sub50_sub13 = ((Class282_Sub50_Sub13) ((Class523) this).aClass229_6954.method3865((long) i));
			if (class282_sub50_sub13 == null) {
				class282_sub50_sub13 = new Class282_Sub50_Sub13(i);
				((Class523) this).aClass229_6954.put(class282_sub50_sub13, (long) i);
			}
			if (!class282_sub50_sub13.method15086((byte) 109)) {
				Class282_Sub50_Sub13 class282_sub50_sub13_6_ = null;
				return class282_sub50_sub13_6_;
			}
		}
		return class282_sub50_sub13;
	}

	public void method11212() {
		synchronized (((Class523) this).aClass229_6955) {
			((Class523) this).aClass229_6955.method3859(742208273);
		}
		synchronized (((Class523) this).aClass229_6954) {
			((Class523) this).aClass229_6954.method3859(449206607);
		}
	}

	public void method11213(int i) {
		synchronized (((Class523) this).aClass229_6955) {
			((Class523) this).aClass229_6955.method3858(i, (byte) 6);
		}
		synchronized (((Class523) this).aClass229_6954) {
			((Class523) this).aClass229_6954.method3858(i, (byte) -14);
		}
	}

	public void method11214() {
		synchronized (((Class523) this).aClass229_6955) {
			((Class523) this).aClass229_6955.method3863(1543221990);
		}
		synchronized (((Class523) this).aClass229_6954) {
			((Class523) this).aClass229_6954.method3863(1773431982);
		}
	}

	public void method11215(int i) {
		synchronized (((Class523) this).aClass229_6955) {
			((Class523) this).aClass229_6955.method3858(i, (byte) 56);
		}
		synchronized (((Class523) this).aClass229_6954) {
			((Class523) this).aClass229_6954.method3858(i, (byte) -69);
		}
	}

	public void method11216() {
		synchronized (((Class523) this).aClass229_6955) {
			((Class523) this).aClass229_6955.method3863(775580924);
		}
		synchronized (((Class523) this).aClass229_6954) {
			((Class523) this).aClass229_6954.method3863(1230279377);
		}
	}

	public Class282_Sub50_Sub13 method11217(int i) {
		Class282_Sub50_Sub13 class282_sub50_sub13;
		synchronized (((Class523) this).aClass229_6954) {
			class282_sub50_sub13 = ((Class282_Sub50_Sub13) ((Class523) this).aClass229_6954.method3865((long) i));
			if (class282_sub50_sub13 == null) {
				class282_sub50_sub13 = new Class282_Sub50_Sub13(i);
				((Class523) this).aClass229_6954.put(class282_sub50_sub13, (long) i);
			}
			if (!class282_sub50_sub13.method15086((byte) -60)) {
				Class282_Sub50_Sub13 class282_sub50_sub13_7_ = null;
				return class282_sub50_sub13_7_;
			}
		}
		return class282_sub50_sub13;
	}

	static final void method11218(CS2Executor class527, byte i) {
		int i_8_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub20_8207), i_8_, 1266441439);
		Class190.method3148((byte) 88);
		client.aBool7175 = false;
	}

	public static boolean method11219(char c, int i) {
		return c >= '0' && c <= '9';
	}

	static final void method11220(int i, int i_9_, int i_10_, int i_11_, int i_12_, byte i_13_) {
		int i_14_ = i_11_ - i_9_;
		int i_15_ = i_10_ - i;
		if (i_15_ == 0) {
			if (i_14_ != 0)
				Class225_Sub6.method13411(i, i_9_, i_11_, i_12_, (byte) -83);
		} else if (i_14_ == 0)
			Class16.method568(i, i_10_, i_9_, i_12_, (short) 128);
		else {
			if (i_14_ < 0)
				i_14_ = -i_14_;
			if (i_15_ < 0)
				i_15_ = -i_15_;
			boolean bool = i_14_ > i_15_;
			if (bool) {
				int i_16_ = i;
				int i_17_ = i_10_;
				i = i_9_;
				i_9_ = i_16_;
				i_10_ = i_11_;
				i_11_ = i_17_;
			}
			if (i > i_10_) {
				int i_18_ = i;
				int i_19_ = i_9_;
				i = i_10_;
				i_10_ = i_18_;
				i_9_ = i_11_;
				i_11_ = i_19_;
			}
			int i_20_ = i_9_;
			int i_21_ = i_10_ - i;
			int i_22_ = i_11_ - i_9_;
			int i_23_ = -(i_21_ >> 1);
			int i_24_ = i_9_ < i_11_ ? 1 : -1;
			if (i_22_ < 0)
				i_22_ = -i_22_;
			if (bool) {
				for (int i_25_ = i; i_25_ <= i_10_; i_25_++) {
					Class532_Sub2.anIntArrayArray7072[i_25_][i_20_] = i_12_;
					i_23_ += i_22_;
					if (i_23_ > 0) {
						i_20_ += i_24_;
						i_23_ -= i_21_;
					}
				}
			} else {
				for (int i_26_ = i; i_26_ <= i_10_; i_26_++) {
					Class532_Sub2.anIntArrayArray7072[i_20_][i_26_] = i_12_;
					i_23_ += i_22_;
					if (i_23_ > 0) {
						i_20_ += i_24_;
						i_23_ -= i_21_;
					}
				}
			}
		}
	}
}
