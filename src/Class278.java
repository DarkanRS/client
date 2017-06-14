/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class278 {
	int anInt2966;
	static int anInt2967 = 22050;
	int anInt2968;
	Class268[] aClass268Array2969 = new Class268[10];

	Class278(RsByteBuffer class298_sub53) {
		for (int i = 0; i < 10; i++) {
			int i_0_ = class298_sub53.readUnsignedByte();
			if (i_0_ != 0) {
				class298_sub53.index -= 116413311;
				((Class278) this).aClass268Array2969[i] = new Class268();
				((Class278) this).aClass268Array2969[i].method2530(class298_sub53);
			}
		}
		((Class278) this).anInt2968 = class298_sub53.readUnsignedShort();
		((Class278) this).anInt2966 = class298_sub53.readUnsignedShort();
	}

	public Class298_Sub26_Sub1 method2601() {
		byte[] is = method2603();
		return new Class298_Sub26_Sub1(22050, is, (22050 * ((Class278) this).anInt2968 / 1000), (22050 * ((Class278) this).anInt2966 / 1000));
	}

	public final int method2602() {
		int i = 9999999;
		for (int i_1_ = 0; i_1_ < 10; i_1_++) {
			if (((Class278) this).aClass268Array2969[i_1_] != null && (((Class268) ((Class278) this).aClass268Array2969[i_1_]).anInt2874) / 20 < i)
				i = (((Class268) ((Class278) this).aClass268Array2969[i_1_]).anInt2874) / 20;
		}
		if (((Class278) this).anInt2968 < ((Class278) this).anInt2966 && ((Class278) this).anInt2968 / 20 < i)
			i = ((Class278) this).anInt2968 / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (((Class278) this).aClass268Array2969[i_2_] != null)
				((Class268) ((Class278) this).aClass268Array2969[i_2_]).anInt2874 -= i * 20;
		}
		if (((Class278) this).anInt2968 < ((Class278) this).anInt2966) {
			((Class278) this).anInt2968 -= i * 20;
			((Class278) this).anInt2966 -= i * 20;
		}
		return i;
	}

	final byte[] method2603() {
		int i = 0;
		for (int i_3_ = 0; i_3_ < 10; i_3_++) {
			if (((Class278) this).aClass268Array2969[i_3_] != null && ((((Class268) ((Class278) this).aClass268Array2969[i_3_]).anInt2873) + (((Class268) ((Class278) this).aClass268Array2969[i_3_]).anInt2874)) > i)
				i = ((((Class268) ((Class278) this).aClass268Array2969[i_3_]).anInt2873) + (((Class268) ((Class278) this).aClass268Array2969[i_3_]).anInt2874));
		}
		if (i == 0)
			return new byte[0];
		int i_4_ = 22050 * i / 1000;
		byte[] is = new byte[i_4_];
		for (int i_5_ = 0; i_5_ < 10; i_5_++) {
			if (((Class278) this).aClass268Array2969[i_5_] != null) {
				int i_6_ = ((((Class268) ((Class278) this).aClass268Array2969[i_5_]).anInt2873) * 22050 / 1000);
				int i_7_ = ((((Class268) ((Class278) this).aClass268Array2969[i_5_]).anInt2874) * 22050 / 1000);
				int[] is_8_ = (((Class278) this).aClass268Array2969[i_5_].method2531(i_6_, ((Class268) (((Class278) this).aClass268Array2969[i_5_])).anInt2873));
				for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
					int i_10_ = is[i_9_ + i_7_] + (is_8_[i_9_] >> 8);
					if ((i_10_ + 128 & ~0xff) != 0)
						i_10_ = i_10_ >> 31 ^ 0x7f;
					is[i_9_ + i_7_] = (byte) i_10_;
				}
			}
		}
		return is;
	}

	public static Class278 method2604(Class243 class243, int i, int i_11_) {
		byte[] is = class243.getFile(i, i_11_, (byte) -90);
		if (is == null)
			return null;
		return new Class278(new RsByteBuffer(is));
	}
}
