/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Class239 {
	public boolean aBoolean2607;
	int anInt2608;
	int anInt2609;
	int[][][] anIntArrayArrayArray2610;
	Class298_Sub27[] aClass298_Sub27Array2611;
	int anInt2612 = 0;
	int anInt2613 = 1387168171;
	Class458 aClass458_2614 = new Class458();
	static Class298_Sub27 aClass298_Sub27_2615 = new Class298_Sub27(0, 0);

	final void method2203(int i) {
		try {
			for (int i_0_ = 0; i_0_ < ((Class239) this).anInt2609 * -431482401; i_0_++) {
				((Class239) this).anIntArrayArrayArray2610[i_0_][0] = null;
				((Class239) this).anIntArrayArrayArray2610[i_0_][1] = null;
				((Class239) this).anIntArrayArrayArray2610[i_0_][2] = null;
				((Class239) this).anIntArrayArrayArray2610[i_0_] = null;
			}
			((Class239) this).aClass298_Sub27Array2611 = null;
			((Class239) this).anIntArrayArrayArray2610 = null;
			((Class239) this).aClass458_2614.method5972(-1888417482);
			((Class239) this).aClass458_2614 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ka.a(").append(')').toString());
		}
	}

	Class239(int i, int i_1_, int i_2_) {
		aBoolean2607 = false;
		((Class239) this).anInt2608 = i_1_ * 982864511;
		((Class239) this).anInt2609 = i * 1934811679;
		((Class239) this).anIntArrayArrayArray2610 = new int[((Class239) this).anInt2609 * -431482401][3][i_2_];
		((Class239) this).aClass298_Sub27Array2611 = new Class298_Sub27[1714711935 * ((Class239) this).anInt2608];
	}

	public final int[][][] method2204(byte i) {
		try {
			if (-431482401 * ((Class239) this).anInt2609 != ((Class239) this).anInt2608 * 1714711935)
				throw new RuntimeException();
			for (int i_3_ = 0; i_3_ < ((Class239) this).anInt2609 * -431482401; i_3_++)
				((Class239) this).aClass298_Sub27Array2611[i_3_] = aClass298_Sub27_2615;
			return ((Class239) this).anIntArrayArrayArray2610;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ka.b(").append(')').toString());
		}
	}

	public final int[][] method2205(int i, byte i_4_) {
		try {
			if (1714711935 * ((Class239) this).anInt2608 != ((Class239) this).anInt2609 * -431482401) {
				if (((Class239) this).anInt2609 * -431482401 != 1) {
					Class298_Sub27 class298_sub27 = ((Class239) this).aClass298_Sub27Array2611[i];
					if (class298_sub27 == null) {
						aBoolean2607 = true;
						if (((Class239) this).anInt2612 * -1543676323 >= ((Class239) this).anInt2609 * -431482401) {
							Class298_Sub27 class298_sub27_5_ = ((Class298_Sub27) ((Class239) this).aClass458_2614.method5964(-1469951766));
							class298_sub27 = new Class298_Sub27(i, ((((Class298_Sub27) class298_sub27_5_).anInt7364) * -1217806945));
							((Class239) this).aClass298_Sub27Array2611[(((Class298_Sub27) class298_sub27_5_).anInt7363) * -1336494225] = null;
							class298_sub27_5_.unlink(-1460969981);
						} else {
							class298_sub27 = new Class298_Sub27(i, (-1543676323 * (((Class239) this).anInt2612)));
							((Class239) this).anInt2612 += 1892836853;
						}
						((Class239) this).aClass298_Sub27Array2611[i] = class298_sub27;
					} else
						aBoolean2607 = false;
					((Class239) this).aClass458_2614.method5965(class298_sub27, -726505062);
					return (((Class239) this).anIntArrayArrayArray2610[(((Class298_Sub27) class298_sub27).anInt7364 * -1217806945)]);
				}
				aBoolean2607 = i != -975728899 * ((Class239) this).anInt2613;
				((Class239) this).anInt2613 = -1387168171 * i;
				return ((Class239) this).anIntArrayArrayArray2610[0];
			}
			aBoolean2607 = null == ((Class239) this).aClass298_Sub27Array2611[i];
			((Class239) this).aClass298_Sub27Array2611[i] = aClass298_Sub27_2615;
			return ((Class239) this).anIntArrayArrayArray2610[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ka.f(").append(')').toString());
		}
	}

	static void method2206(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_7_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			Class497 class497 = Class92.aClass504_905.method6251(i_7_, 1588900320);
			if (class497.method6206(1883696427)) {
				String string = class497.aString6101;
				if (-1 == i_6_)
					((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = string;
				else
					((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = Class316.aClass362_3318.method4307(i_6_, 245040087).method4570(i_7_, string, 1005518410);
			} else {
				int i_8_ = -388931549 * class497.anInt6100;
				if (i_6_ == -1)
					((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = i_8_;
				else
					((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = Class316.aClass362_3318.method4307(i_6_, 245040087).method4568(i_7_, i_8_, (byte) -64);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ka.o(").append(')').toString());
		}
	}

	public static void method2207(int i, int i_9_, byte i_10_) {
		try {
			Class323_Sub1.method3955(i, i_9_, -1278555731);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ka.l(").append(')').toString());
		}
	}

	public static void method2208(int i, int i_11_) {
		try {
			if (i == 37)
				Class301_Sub1.aFloat3234 = 3.0F;
			else if (50 == i)
				Class301_Sub1.aFloat3234 = 4.0F;
			else if (i == 75)
				Class301_Sub1.aFloat3234 = 6.0F;
			else if (100 == i)
				Class301_Sub1.aFloat3234 = 8.0F;
			else if (200 == i)
				Class301_Sub1.aFloat3234 = 16.0F;
			Class301_Sub1.anInt7627 = 789877945;
			Class301_Sub1.anInt7627 = 789877945;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ka.cw(").append(')').toString());
		}
	}

	static final void method2209(IComponentDefinition class105, ClientScript2 class403, byte i) {
		try {
			Class505 class505 = class105.method1113(Class497.aClass197_6105, client.anInterface10_8700, (byte) -46);
			int i_12_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Point point = class505.method6263(class105.aString1212, class105.anInt1156 * -2093041337, class105.anInt1191 * 418216501, i_12_, Class130_Sub2.aClass57Array6959, 946663112);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = point.x;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = point.y;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ka.qr(").append(')').toString());
		}
	}

	public static Class297 method2210(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		try {
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7553.method5726(-2141800162) != 0 && i_13_ != 0 && Class300.anInt3213 * -991384187 < 50 && -1 != i) {
				Class297 class297 = new Class297((byte) 1, i, i_13_, i_14_, i_15_, 0, i_16_, null);
				Class300.aClass297Array3214[(Class300.anInt3213 += -598588595) * -991384187 - 1] = class297;
				return class297;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ka.n(").append(')').toString());
		}
	}
}
