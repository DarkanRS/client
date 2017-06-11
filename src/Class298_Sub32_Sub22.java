/* Class298_Sub32_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

public class Class298_Sub32_Sub22 extends Class298_Sub32 {
	static int anInt9462 = 4096;
	int anInt9463 = 0;
	static boolean aBoolean9464 = false;
	int anInt9465 = -2014605312;
	static Class272 aClass272_9466;
	static int anInt9467 = 0;
	public static Image anImage9468;

	int[][] method3132(int i, byte i_0_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 37);
			if (aClass239_7380.aBoolean2607) {
				int[][] is_1_ = method3134(0, i, (byte) 8);
				int[] is_2_ = is_1_[0];
				int[] is_3_ = is_1_[1];
				int[] is_4_ = is_1_[2];
				int[] is_5_ = is[0];
				int[] is_6_ = is[1];
				int[] is_7_ = is[2];
				for (int i_8_ = 0; i_8_ < Class250.anInt2755 * -1474554145; i_8_++) {
					int i_9_ = is_2_[i_8_];
					int i_10_ = is_3_[i_8_];
					int i_11_ = is_4_[i_8_];
					if (i_9_ < ((Class298_Sub32_Sub22) this).anInt9463 * -583223949)
						is_5_[i_8_] = (((Class298_Sub32_Sub22) this).anInt9463 * -583223949);
					else if (i_9_ > (-1910102135 * ((Class298_Sub32_Sub22) this).anInt9465))
						is_5_[i_8_] = (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135);
					else
						is_5_[i_8_] = i_9_;
					if (i_10_ < -583223949 * ((Class298_Sub32_Sub22) this).anInt9463)
						is_6_[i_8_] = (-583223949 * ((Class298_Sub32_Sub22) this).anInt9463);
					else if (i_10_ > (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135))
						is_6_[i_8_] = (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135);
					else
						is_6_[i_8_] = i_10_;
					if (i_11_ < ((Class298_Sub32_Sub22) this).anInt9463 * -583223949)
						is_7_[i_8_] = (((Class298_Sub32_Sub22) this).anInt9463 * -583223949);
					else if (i_11_ > (-1910102135 * ((Class298_Sub32_Sub22) this).anInt9465))
						is_7_[i_8_] = (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135);
					else
						is_7_[i_8_] = i_11_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahk.k(").append(')').toString());
		}
	}

	int[] method3131(int i, int i_12_) {
		try {
			int[] is = aClass257_7384.method2448(i, 1756826230);
			if (aClass257_7384.aBoolean2810) {
				int[] is_13_ = method3129(0, i, -1887337990);
				for (int i_14_ = 0; i_14_ < -1474554145 * Class250.anInt2755; i_14_++) {
					int i_15_ = is_13_[i_14_];
					if (i_15_ < ((Class298_Sub32_Sub22) this).anInt9463 * -583223949)
						is[i_14_] = -583223949 * (((Class298_Sub32_Sub22) this).anInt9463);
					else if (i_15_ > (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135))
						is[i_14_] = (-1910102135 * ((Class298_Sub32_Sub22) this).anInt9465);
					else
						is[i_14_] = i_15_;
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahk.i(").append(')').toString());
		}
	}

	void method3274(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub22) this).anInt9463 = class298_sub53.readUnsignedShort() * 380991419;
			break;
		case 1:
			((Class298_Sub32_Sub22) this).anInt9465 = class298_sub53.readUnsignedShort() * -784826695;
			break;
		case 2:
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
			break;
		}
	}

	int[][] method3275(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 49);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_16_ = method3134(0, i, (byte) 8);
			int[] is_17_ = is_16_[0];
			int[] is_18_ = is_16_[1];
			int[] is_19_ = is_16_[2];
			int[] is_20_ = is[0];
			int[] is_21_ = is[1];
			int[] is_22_ = is[2];
			for (int i_23_ = 0; i_23_ < Class250.anInt2755 * -1474554145; i_23_++) {
				int i_24_ = is_17_[i_23_];
				int i_25_ = is_18_[i_23_];
				int i_26_ = is_19_[i_23_];
				if (i_24_ < ((Class298_Sub32_Sub22) this).anInt9463 * -583223949)
					is_20_[i_23_] = ((Class298_Sub32_Sub22) this).anInt9463 * -583223949;
				else if (i_24_ > (-1910102135 * ((Class298_Sub32_Sub22) this).anInt9465))
					is_20_[i_23_] = (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135);
				else
					is_20_[i_23_] = i_24_;
				if (i_25_ < -583223949 * ((Class298_Sub32_Sub22) this).anInt9463)
					is_21_[i_23_] = -583223949 * ((Class298_Sub32_Sub22) this).anInt9463;
				else if (i_25_ > (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135))
					is_21_[i_23_] = (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135);
				else
					is_21_[i_23_] = i_25_;
				if (i_26_ < ((Class298_Sub32_Sub22) this).anInt9463 * -583223949)
					is_22_[i_23_] = ((Class298_Sub32_Sub22) this).anInt9463 * -583223949;
				else if (i_26_ > (-1910102135 * ((Class298_Sub32_Sub22) this).anInt9465))
					is_22_[i_23_] = (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135);
				else
					is_22_[i_23_] = i_26_;
			}
		}
		return is;
	}

	int[] method3276(int i) {
		int[] is = aClass257_7384.method2448(i, 4636343);
		if (aClass257_7384.aBoolean2810) {
			int[] is_27_ = method3129(0, i, -1887337990);
			for (int i_28_ = 0; i_28_ < -1474554145 * Class250.anInt2755; i_28_++) {
				int i_29_ = is_27_[i_28_];
				if (i_29_ < ((Class298_Sub32_Sub22) this).anInt9463 * -583223949)
					is[i_28_] = -583223949 * ((Class298_Sub32_Sub22) this).anInt9463;
				else if (i_29_ > (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135))
					is[i_28_] = (-1910102135 * ((Class298_Sub32_Sub22) this).anInt9465);
				else
					is[i_28_] = i_29_;
			}
		}
		return is;
	}

	int[] method3277(int i) {
		int[] is = aClass257_7384.method2448(i, 211268328);
		if (aClass257_7384.aBoolean2810) {
			int[] is_30_ = method3129(0, i, -1887337990);
			for (int i_31_ = 0; i_31_ < -1474554145 * Class250.anInt2755; i_31_++) {
				int i_32_ = is_30_[i_31_];
				if (i_32_ < ((Class298_Sub32_Sub22) this).anInt9463 * -583223949)
					is[i_31_] = -583223949 * ((Class298_Sub32_Sub22) this).anInt9463;
				else if (i_32_ > (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135))
					is[i_31_] = (-1910102135 * ((Class298_Sub32_Sub22) this).anInt9465);
				else
					is[i_31_] = i_32_;
			}
		}
		return is;
	}

	public Class298_Sub32_Sub22() {
		super(1, false);
	}

	void method3278(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 0:
			((Class298_Sub32_Sub22) this).anInt9463 = class298_sub53.readUnsignedShort() * 380991419;
			break;
		case 1:
			((Class298_Sub32_Sub22) this).anInt9465 = class298_sub53.readUnsignedShort() * -784826695;
			break;
		case 2:
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
			break;
		}
	}

	int[][] method3279(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 40);
		if (aClass239_7380.aBoolean2607) {
			int[][] is_33_ = method3134(0, i, (byte) 8);
			int[] is_34_ = is_33_[0];
			int[] is_35_ = is_33_[1];
			int[] is_36_ = is_33_[2];
			int[] is_37_ = is[0];
			int[] is_38_ = is[1];
			int[] is_39_ = is[2];
			for (int i_40_ = 0; i_40_ < Class250.anInt2755 * -1474554145; i_40_++) {
				int i_41_ = is_34_[i_40_];
				int i_42_ = is_35_[i_40_];
				int i_43_ = is_36_[i_40_];
				if (i_41_ < ((Class298_Sub32_Sub22) this).anInt9463 * -583223949)
					is_37_[i_40_] = ((Class298_Sub32_Sub22) this).anInt9463 * -583223949;
				else if (i_41_ > (-1910102135 * ((Class298_Sub32_Sub22) this).anInt9465))
					is_37_[i_40_] = (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135);
				else
					is_37_[i_40_] = i_41_;
				if (i_42_ < -583223949 * ((Class298_Sub32_Sub22) this).anInt9463)
					is_38_[i_40_] = -583223949 * ((Class298_Sub32_Sub22) this).anInt9463;
				else if (i_42_ > (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135))
					is_38_[i_40_] = (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135);
				else
					is_38_[i_40_] = i_42_;
				if (i_43_ < ((Class298_Sub32_Sub22) this).anInt9463 * -583223949)
					is_39_[i_40_] = ((Class298_Sub32_Sub22) this).anInt9463 * -583223949;
				else if (i_43_ > (-1910102135 * ((Class298_Sub32_Sub22) this).anInt9465))
					is_39_[i_40_] = (((Class298_Sub32_Sub22) this).anInt9465 * -1910102135);
				else
					is_39_[i_40_] = i_43_;
			}
		}
		return is;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_44_) {
		try {
			switch (i) {
			case 0:
				((Class298_Sub32_Sub22) this).anInt9463 = class298_sub53.readUnsignedShort() * 380991419;
				break;
			case 1:
				((Class298_Sub32_Sub22) this).anInt9465 = class298_sub53.readUnsignedShort() * -784826695;
				break;
			case 2:
				aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ahk.r(").append(')').toString());
		}
	}
}
