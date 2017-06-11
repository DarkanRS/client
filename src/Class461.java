/* Class461 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class461 implements Iterable {
	public Class298_Sub37 aClass298_Sub37_5679 = new Class298_Sub37();
	Class298_Sub37 aClass298_Sub37_5680;
	static int anInt5681;

	public Class461() {
		aClass298_Sub37_5679.aClass298_Sub37_7405 = aClass298_Sub37_5679;
		aClass298_Sub37_5679.aClass298_Sub37_7404 = aClass298_Sub37_5679;
	}

	public void method5982(Class298_Sub37 class298_sub37, byte i) {
		try {
			if (class298_sub37.aClass298_Sub37_7404 != null)
				class298_sub37.method3402(1066671336);
			class298_sub37.aClass298_Sub37_7404 = aClass298_Sub37_5679.aClass298_Sub37_7404;
			class298_sub37.aClass298_Sub37_7405 = aClass298_Sub37_5679;
			class298_sub37.aClass298_Sub37_7404.aClass298_Sub37_7405 = class298_sub37;
			class298_sub37.aClass298_Sub37_7405.aClass298_Sub37_7404 = class298_sub37;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sz.f(").append(')').toString());
		}
	}

	public Class298_Sub37 method5983(int i) {
		try {
			Class298_Sub37 class298_sub37 = aClass298_Sub37_5679.aClass298_Sub37_7405;
			if (aClass298_Sub37_5679 == class298_sub37)
				return null;
			class298_sub37.method3402(-785195500);
			return class298_sub37;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sz.i(").append(')').toString());
		}
	}

	public Class298_Sub37 method5984(int i) {
		try {
			return method5987(null, -232966576);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sz.k(").append(')').toString());
		}
	}

	public Class298_Sub37 method5985(int i) {
		try {
			Class298_Sub37 class298_sub37 = ((Class461) this).aClass298_Sub37_5680;
			if (aClass298_Sub37_5679 == class298_sub37) {
				((Class461) this).aClass298_Sub37_5680 = null;
				return null;
			}
			((Class461) this).aClass298_Sub37_5680 = class298_sub37.aClass298_Sub37_7405;
			return class298_sub37;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sz.u(").append(')').toString());
		}
	}

	public int method5986(short i) {
		try {
			int i_0_ = 0;
			for (Class298_Sub37 class298_sub37 = aClass298_Sub37_5679.aClass298_Sub37_7405; aClass298_Sub37_5679 != class298_sub37; class298_sub37 = class298_sub37.aClass298_Sub37_7405)
				i_0_++;
			return i_0_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sz.x(").append(')').toString());
		}
	}

	public Iterator iterator() {
		try {
			return new Class447(this);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sz.iterator(").append(')').toString());
		}
	}

	Class298_Sub37 method5987(Class298_Sub37 class298_sub37, int i) {
		try {
			Class298_Sub37 class298_sub37_1_;
			if (class298_sub37 == null)
				class298_sub37_1_ = aClass298_Sub37_5679.aClass298_Sub37_7405;
			else
				class298_sub37_1_ = class298_sub37;
			if (aClass298_Sub37_5679 == class298_sub37_1_) {
				((Class461) this).aClass298_Sub37_5680 = null;
				return null;
			}
			((Class461) this).aClass298_Sub37_5680 = class298_sub37_1_.aClass298_Sub37_7405;
			return class298_sub37_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sz.d(").append(')').toString());
		}
	}

	public void method5988(int i) {
		try {
			while (aClass298_Sub37_5679.aClass298_Sub37_7405 != aClass298_Sub37_5679)
				aClass298_Sub37_5679.aClass298_Sub37_7405.method3402(834138083);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sz.a(").append(')').toString());
		}
	}

	static void method5989(Class298_Sub41 class298_sub41, int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			if (-1 != ((Class298_Sub41) class298_sub41).anInt7443 * 391847895 || ((Class298_Sub41) class298_sub41).anIntArray7432 != null) {
				int i_6_ = 0;
				int i_7_ = ((((Class298_Sub41) class298_sub41).anInt7449 * 43235291 * Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7582.method5726(-2144866042)) >> 8);
				if (i_2_ > (-1012062621 * ((Class298_Sub41) class298_sub41).anInt7427))
					i_6_ += i_2_ - -1012062621 * ((Class298_Sub41) class298_sub41).anInt7427;
				else if (i_2_ < (-1808325887 * ((Class298_Sub41) class298_sub41).anInt7425))
					i_6_ += -1808325887 * (((Class298_Sub41) class298_sub41).anInt7425) - i_2_;
				if (i_3_ > -720500331 * ((Class298_Sub41) class298_sub41).anInt7428)
					i_6_ += i_3_ - -720500331 * ((Class298_Sub41) class298_sub41).anInt7428;
				else if (i_3_ < (((Class298_Sub41) class298_sub41).anInt7423 * 757346071))
					i_6_ += 757346071 * (((Class298_Sub41) class298_sub41).anInt7423) - i_3_;
				if ((826975881 * ((Class298_Sub41) class298_sub41).anInt7430 == 0) || i_6_ - 256 > 826975881 * ((Class298_Sub41) class298_sub41).anInt7430 || Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7582.method5726(-2144778383) == 0 || (-1926928785 * ((Class298_Sub41) class298_sub41).anInt7424) != i) {
					if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447) != null) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = null;
						((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7446 = null;
						((Class298_Sub41) class298_sub41).aClass298_Sub23_7445 = null;
					}
					if (null != (((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426)) {
						Class285.aClass298_Sub19_Sub4_3083.method3048(((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426 = null;
						((Class298_Sub41) class298_sub41).aClass298_Sub23_7420 = null;
						((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7453 = null;
					}
				} else {
					i_6_ -= 256;
					if (i_6_ < 0)
						i_6_ = 0;
					int i_8_ = ((826975881 * ((Class298_Sub41) class298_sub41).anInt7430) - (-2024907801 * ((Class298_Sub41) class298_sub41).anInt7429));
					if (i_8_ < 0)
						i_8_ = (((Class298_Sub41) class298_sub41).anInt7430 * 826975881);
					int i_9_ = i_7_;
					int i_10_ = (i_6_ - (-2024907801 * ((Class298_Sub41) class298_sub41).anInt7429));
					if (i_10_ > 0 && i_8_ > 0)
						i_9_ = (i_8_ - i_10_) * i_7_ / i_8_;
					Class287.myPlayer.getSize();
					int i_11_ = 8192;
					int i_12_ = ((((Class298_Sub41) class298_sub41).anInt7425 * -1808325887) + (((Class298_Sub41) class298_sub41).anInt7427 * -1012062621)) / 2 - i_2_;
					int i_13_ = (((-720500331 * ((Class298_Sub41) class298_sub41).anInt7428) + 757346071 * (((Class298_Sub41) class298_sub41).anInt7423)) / 2 - i_3_);
					if (i_12_ != 0 || 0 != i_13_) {
						int i_14_ = ((-(-1847894591 * Class135.anInt6384) - (int) (Math.atan2((double) i_12_, (double) i_13_) * 2607.5945876176133) - 4096) & 0x3fff);
						if (i_14_ > 8192)
							i_14_ = 16384 - i_14_;
						int i_15_;
						if (i_6_ <= 0)
							i_15_ = 8192;
						else if (i_6_ >= 4096)
							i_15_ = 16384;
						else
							i_15_ = i_6_ * 8192 / 4096 + 8192;
						i_11_ = i_14_ * i_15_ / 8192 + (16384 - i_15_ >> 1);
					}
					if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447) == null) {
						if ((391847895 * ((Class298_Sub41) class298_sub41).anInt7443) >= 0) {
							i_12_ = (((-455518897 * ((Class298_Sub41) class298_sub41).anInt7452 == 256) && (((Class298_Sub41) class298_sub41).anInt7441) * 1495381837 == 256) ? 256 : Class391.method4888((1495381837 * (((Class298_Sub41) class298_sub41).anInt7441)), ((((Class298_Sub41) class298_sub41).anInt7452) * -455518897), -1122963701));
							if (((Class298_Sub41) class298_sub41).aBoolean7444) {
								if (null == (((Class298_Sub41) class298_sub41).aClass298_Sub23_7445))
									((Class298_Sub41) class298_sub41).aClass298_Sub23_7445 = (Class298_Sub23.method3066(Class439.aClass243_5575, (((Class298_Sub41) class298_sub41).anInt7443) * 391847895));
								if ((((Class298_Sub41) class298_sub41).aClass298_Sub23_7445) != null) {
									if ((((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7446) == null)
										((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7446 = (((Class298_Sub41) class298_sub41).aClass298_Sub23_7445.method3067(new int[] { 22050 }));
									if ((((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7446) != null) {
										Class298_Sub19_Sub2 class298_sub19_sub2 = (Class298_Sub19_Sub2.method3027((((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7446), i_12_, i_9_ << 6, i_11_));
										class298_sub19_sub2.method2991(-1);
										Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub2);
										((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = class298_sub19_sub2;
									}
								}
							} else {
								Class278 class278 = Class278.method2604((Class52.aClass243_507), ((((Class298_Sub41) class298_sub41).anInt7443) * 391847895), 0);
								if (null != class278) {
									Class298_Sub26_Sub1 class298_sub26_sub1 = (class278.method2601().method3104(Class282.aClass270_6546));
									Class298_Sub19_Sub2 class298_sub19_sub2 = (Class298_Sub19_Sub2.method3027(class298_sub26_sub1, i_12_, i_9_ << 6, i_11_));
									class298_sub19_sub2.method2991(-1);
									Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub2);
									((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447 = class298_sub19_sub2;
								}
							}
						}
					} else {
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447.method2992(i_9_);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7447.method2989(i_11_);
					}
					if ((((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426) == null) {
						if ((((Class298_Sub41) class298_sub41).anIntArray7432 != null) && (((Class298_Sub41) class298_sub41).anInt7454 -= 950219665 * i_4_) * -1221989007 <= 0) {
							i_12_ = (((((Class298_Sub41) class298_sub41).anInt7452) * -455518897 == 256 && (256 == (((Class298_Sub41) class298_sub41).anInt7441) * 1495381837)) ? 256 : ((int) (Math.random() * (double) ((-455518897 * (((Class298_Sub41) class298_sub41).anInt7452)) - ((((Class298_Sub41) class298_sub41).anInt7441) * 1495381837))) + (((Class298_Sub41) class298_sub41).anInt7441) * 1495381837));
							if (((Class298_Sub41) class298_sub41).aBoolean7451) {
								if (null == (((Class298_Sub41) class298_sub41).aClass298_Sub23_7420)) {
									i_13_ = (int) (Math.random() * (double) (((Class298_Sub41) class298_sub41).anIntArray7432).length);
									((Class298_Sub41) class298_sub41).aClass298_Sub23_7420 = (Class298_Sub23.method3066(Class439.aClass243_5575, (((Class298_Sub41) class298_sub41).anIntArray7432[i_13_])));
								}
								if ((((Class298_Sub41) class298_sub41).aClass298_Sub23_7420) != null) {
									if ((((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7453) == null)
										((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7453 = (((Class298_Sub41) class298_sub41).aClass298_Sub23_7420.method3067(new int[] { 22050 }));
									if (null != (((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7453)) {
										Class298_Sub19_Sub2 class298_sub19_sub2 = (Class298_Sub19_Sub2.method3027((((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7453), i_12_, i_9_ << 6, i_11_));
										class298_sub19_sub2.method2991(0);
										Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub2);
										((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426 = class298_sub19_sub2;
										((Class298_Sub41) class298_sub41).anInt7454 = (((((Class298_Sub41) class298_sub41).anInt7450 * -15898815) + (int) (Math.random() * (double) ((-1398300237 * (((Class298_Sub41) class298_sub41).anInt7422)) - (-15898815 * (((Class298_Sub41) class298_sub41).anInt7450))))) * 950219665);
									}
								}
							} else {
								i_13_ = (int) (Math.random() * (double) (((Class298_Sub41) class298_sub41).anIntArray7432).length);
								Class278 class278 = Class278.method2604((Class52.aClass243_507), (((Class298_Sub41) class298_sub41).anIntArray7432[i_13_]), 0);
								if (null != class278) {
									Class298_Sub26_Sub1 class298_sub26_sub1 = (class278.method2601().method3104(Class282.aClass270_6546));
									Class298_Sub19_Sub2 class298_sub19_sub2 = (Class298_Sub19_Sub2.method3027(class298_sub26_sub1, i_12_, i_9_ << 6, i_11_));
									class298_sub19_sub2.method2991(0);
									Class285.aClass298_Sub19_Sub4_3083.method3043(class298_sub19_sub2);
									((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426 = class298_sub19_sub2;
									((Class298_Sub41) class298_sub41).anInt7454 = ((-15898815 * (((Class298_Sub41) class298_sub41).anInt7450) + (int) (Math.random() * (double) (((((Class298_Sub41) class298_sub41).anInt7422) * -1398300237) - (-15898815 * (((Class298_Sub41) class298_sub41).anInt7450))))) * 950219665);
								}
							}
						}
					} else {
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426.method2992(i_9_);
						((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426.method2989(i_11_);
						if (!((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426.method2840(-629325116)) {
							((Class298_Sub41) class298_sub41).aClass298_Sub19_Sub2_7426 = null;
							((Class298_Sub41) class298_sub41).aClass298_Sub23_7420 = null;
							((Class298_Sub41) class298_sub41).aClass298_Sub26_Sub1_7453 = null;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sz.n(").append(')').toString());
		}
	}
}
