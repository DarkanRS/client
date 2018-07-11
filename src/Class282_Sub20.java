/* Class282_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class282_Sub20 extends Node {
	protected static final int anInt7658 = 4096;
	protected static final int anInt7659 = 12;
	protected static final int anInt7660 = 8192;
	protected static final int anInt7661 = 2048;
	protected static final int anInt7662 = 1024;
	public static final float aFloat7663 = 4096.0F;
	protected static final int anInt7664 = -4096;
	protected static final int anInt7665 = 4095;
	static final int anInt7666 = 255;
	protected Class320 aClass320_7667;
	int anInt7668;
	protected boolean aBool7669;
	protected Class308 aClass308_7670;
	Class282_Sub20[] aClass282_Sub20Array7671;
	
	int method12314() {
		return -1;
	}

	void method12315(int i, int i_0_, byte i_1_) {
		int i_2_ = (1518118487 * ((Class282_Sub20) this).anInt7668 == 255 ? i_0_ : 1518118487 * ((Class282_Sub20) this).anInt7668);
		if (aBool7669)
			aClass320_7667 = new Class320(i_2_, i_0_, i);
		else
			aClass308_7670 = new Class308(i_2_, i_0_, i);
	}

	void method12316() {
		if (aBool7669) {
			aClass320_7667.method5720((byte) 8);
			aClass320_7667 = null;
		} else {
			aClass308_7670.method5462((byte) 0);
			aClass308_7670 = null;
		}
	}

	final int[] method12317(int i, int i_3_, int i_4_) {
		if (!((Class282_Sub20) this).aClass282_Sub20Array7671[i].aBool7669)
			return (((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12320(i_3_, -1507861387)[0]);
		return ((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12319(i_3_, 752457538);
	}

	void method12318() {
		/* empty */
	}

	int[] method12319(int i, int i_5_) {
		throw new IllegalStateException();
	}

	int[][] method12320(int i, int i_6_) {
		throw new IllegalStateException();
	}

	void method12321(int i) {
		/* empty */
	}

	void method12322(int i, RsByteBuffer class282_sub35, int i_7_) {
		/* empty */
	}

	int method12323(int i) {
		return -1;
	}

	int method12324(byte i) {
		return -1;
	}

	int[] method12325(int i) {
		throw new IllegalStateException();
	}

	void method12326(int i) {
		if (aBool7669) {
			aClass320_7667.method5720((byte) 8);
			aClass320_7667 = null;
		} else {
			aClass308_7670.method5462((byte) 0);
			aClass308_7670 = null;
		}
	}

	int[] method12327(int i) {
		throw new IllegalStateException();
	}

	void method12328() {
		/* empty */
	}

	void method12329() {
		/* empty */
	}

	static Class282_Sub20 method12330(int i) {
		switch (i) {
		case 32:
			return new Class282_Sub20_Sub12();
		case 4:
			return new Class282_Sub20_Sub37();
		case 12:
			return new Class282_Sub20_Sub3();
		case 14:
			return new Class282_Sub20_Sub25();
		case 36:
			return new Class282_Sub20_Sub24();
		case 18:
			return new Class282_Sub20_Sub29_Sub1();
		case 26:
			return new Class282_Sub20_Sub11();
		case 28:
			return new Class282_Sub20_Sub9();
		case 27:
			return new Class282_Sub20_Sub1();
		case 39:
			return new Class282_Sub20_Sub29();
		case 8:
			return new Class282_Sub20_Sub10();
		case 2:
			return new Class282_Sub20_Sub6();
		case 0:
			return new Class282_Sub20_Sub17();
		case 11:
			return new Class282_Sub20_Sub35();
		case 35:
			return new Class282_Sub20_Sub26();
		case 7:
			return new Class282_Sub20_Sub27();
		case 15:
			return new Class282_Sub20_Sub34();
		case 3:
			return new Class282_Sub20_Sub18();
		case 19:
			return new Class282_Sub20_Sub15();
		case 33:
			return new Class282_Sub20_Sub36();
		case 9:
			return new Class282_Sub20_Sub23();
		case 23:
			return new Class282_Sub20_Sub22();
		case 25:
			return new Class282_Sub20_Sub28();
		case 21:
			return new Class282_Sub20_Sub33();
		case 30:
			return new Class282_Sub20_Sub7();
		case 20:
			return new Class282_Sub20_Sub2();
		case 24:
			return new Class282_Sub20_Sub30();
		case 16:
			return new Class282_Sub20_Sub8();
		case 6:
			return new Class282_Sub20_Sub20();
		case 10:
			return new Class282_Sub20_Sub13();
		case 1:
			return new Class282_Sub20_Sub21();
		case 5:
			return new Class282_Sub20_Sub16();
		case 34:
			return new Class282_Sub20_Sub4();
		case 17:
			return new Class282_Sub20_Sub32();
		case 13:
			return new Class282_Sub20_Sub38();
		case 29:
			return new Class282_Sub20_Sub19();
		case 37:
			return new Class282_Sub20_Sub14();
		case 22:
			return new Class282_Sub20_Sub31();
		case 38:
			return new Class282_Sub20_Sub39();
		case 31:
			return new Class282_Sub20_Sub5();
		default:
			return null;
		}
	}

	final int[][] method12331(int i, int i_8_) {
		if (((Class282_Sub20) this).aClass282_Sub20Array7671[i].aBool7669) {
			int[] is = ((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12319(i_8_, 752457538);
			int[][] is_9_ = new int[3][];
			is_9_[0] = is;
			is_9_[1] = is;
			is_9_[2] = is;
			return is_9_;
		}
		return ((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12320(i_8_, 797213842);
	}

	void method12332(int i, RsByteBuffer class282_sub35) {
		/* empty */
	}

	final int[][] method12333(int i, int i_10_, byte i_11_) {
		if (((Class282_Sub20) this).aClass282_Sub20Array7671[i].aBool7669) {
			int[] is = ((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12319(i_10_, 752457538);
			int[][] is_12_ = new int[3][];
			is_12_[0] = is;
			is_12_[1] = is;
			is_12_[2] = is;
			return is_12_;
		}
		return ((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12320(i_10_, 1247848050);
	}

	void method12334(int i, RsByteBuffer class282_sub35) {
		/* empty */
	}

	void method12335(int i, RsByteBuffer class282_sub35) {
		/* empty */
	}

	int[] method12336(int i) {
		throw new IllegalStateException();
	}

	void method12337(int i, int i_13_) {
		int i_14_ = (1518118487 * ((Class282_Sub20) this).anInt7668 == 255 ? i_13_ : 1518118487 * ((Class282_Sub20) this).anInt7668);
		if (aBool7669)
			aClass320_7667 = new Class320(i_14_, i_13_, i);
		else
			aClass308_7670 = new Class308(i_14_, i_13_, i);
	}

	int method12338() {
		return -1;
	}

	int[][] method12339(int i) {
		throw new IllegalStateException();
	}

	void method12340(int i, int i_15_) {
		int i_16_ = (1518118487 * ((Class282_Sub20) this).anInt7668 == 255 ? i_15_ : 1518118487 * ((Class282_Sub20) this).anInt7668);
		if (aBool7669)
			aClass320_7667 = new Class320(i_16_, i_15_, i);
		else
			aClass308_7670 = new Class308(i_16_, i_15_, i);
	}

	static Class282_Sub20 method12341(int i) {
		switch (i) {
		case 32:
			return new Class282_Sub20_Sub12();
		case 4:
			return new Class282_Sub20_Sub37();
		case 12:
			return new Class282_Sub20_Sub3();
		case 14:
			return new Class282_Sub20_Sub25();
		case 36:
			return new Class282_Sub20_Sub24();
		case 18:
			return new Class282_Sub20_Sub29_Sub1();
		case 26:
			return new Class282_Sub20_Sub11();
		case 28:
			return new Class282_Sub20_Sub9();
		case 27:
			return new Class282_Sub20_Sub1();
		case 39:
			return new Class282_Sub20_Sub29();
		case 8:
			return new Class282_Sub20_Sub10();
		case 2:
			return new Class282_Sub20_Sub6();
		case 0:
			return new Class282_Sub20_Sub17();
		case 11:
			return new Class282_Sub20_Sub35();
		case 35:
			return new Class282_Sub20_Sub26();
		case 7:
			return new Class282_Sub20_Sub27();
		case 15:
			return new Class282_Sub20_Sub34();
		case 3:
			return new Class282_Sub20_Sub18();
		case 19:
			return new Class282_Sub20_Sub15();
		case 33:
			return new Class282_Sub20_Sub36();
		case 9:
			return new Class282_Sub20_Sub23();
		case 23:
			return new Class282_Sub20_Sub22();
		case 25:
			return new Class282_Sub20_Sub28();
		case 21:
			return new Class282_Sub20_Sub33();
		case 30:
			return new Class282_Sub20_Sub7();
		case 20:
			return new Class282_Sub20_Sub2();
		case 24:
			return new Class282_Sub20_Sub30();
		case 16:
			return new Class282_Sub20_Sub8();
		case 6:
			return new Class282_Sub20_Sub20();
		case 10:
			return new Class282_Sub20_Sub13();
		case 1:
			return new Class282_Sub20_Sub21();
		case 5:
			return new Class282_Sub20_Sub16();
		case 34:
			return new Class282_Sub20_Sub4();
		case 17:
			return new Class282_Sub20_Sub32();
		case 13:
			return new Class282_Sub20_Sub38();
		case 29:
			return new Class282_Sub20_Sub19();
		case 37:
			return new Class282_Sub20_Sub14();
		case 22:
			return new Class282_Sub20_Sub31();
		case 38:
			return new Class282_Sub20_Sub39();
		case 31:
			return new Class282_Sub20_Sub5();
		default:
			return null;
		}
	}

	final int[] method12342(int i, int i_17_) {
		if (!((Class282_Sub20) this).aClass282_Sub20Array7671[i].aBool7669)
			return (((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12320(i_17_, 926533467)[0]);
		return ((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12319(i_17_, 752457538);
	}

	void method12343(int i, int i_18_) {
		int i_19_ = (1518118487 * ((Class282_Sub20) this).anInt7668 == 255 ? i_18_ : 1518118487 * ((Class282_Sub20) this).anInt7668);
		if (aBool7669)
			aClass320_7667 = new Class320(i_19_, i_18_, i);
		else
			aClass308_7670 = new Class308(i_19_, i_18_, i);
	}

	final int[] method12344(int i, int i_20_) {
		if (!((Class282_Sub20) this).aClass282_Sub20Array7671[i].aBool7669)
			return (((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12320(i_20_, -1916774736)[0]);
		return ((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12319(i_20_, 752457538);
	}

	final int[] method12345(int i, int i_21_) {
		if (!((Class282_Sub20) this).aClass282_Sub20Array7671[i].aBool7669)
			return (((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12320(i_21_, -940419157)[0]);
		return ((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12319(i_21_, 752457538);
	}

	final int[][] method12346(int i, int i_22_) {
		if (((Class282_Sub20) this).aClass282_Sub20Array7671[i].aBool7669) {
			int[] is = ((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12319(i_22_, 752457538);
			int[][] is_23_ = new int[3][];
			is_23_[0] = is;
			is_23_[1] = is;
			is_23_[2] = is;
			return is_23_;
		}
		return ((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12320(i_22_, -1692408946);
	}

	final int[] method12347(int i, int i_24_) {
		if (!((Class282_Sub20) this).aClass282_Sub20Array7671[i].aBool7669)
			return (((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12320(i_24_, -297342430)[0]);
		return ((Class282_Sub20) this).aClass282_Sub20Array7671[i].method12319(i_24_, 752457538);
	}

	static Class282_Sub20 method12348(int i) {
		switch (i) {
		case 32:
			return new Class282_Sub20_Sub12();
		case 4:
			return new Class282_Sub20_Sub37();
		case 12:
			return new Class282_Sub20_Sub3();
		case 14:
			return new Class282_Sub20_Sub25();
		case 36:
			return new Class282_Sub20_Sub24();
		case 18:
			return new Class282_Sub20_Sub29_Sub1();
		case 26:
			return new Class282_Sub20_Sub11();
		case 28:
			return new Class282_Sub20_Sub9();
		case 27:
			return new Class282_Sub20_Sub1();
		case 39:
			return new Class282_Sub20_Sub29();
		case 8:
			return new Class282_Sub20_Sub10();
		case 2:
			return new Class282_Sub20_Sub6();
		case 0:
			return new Class282_Sub20_Sub17();
		case 11:
			return new Class282_Sub20_Sub35();
		case 35:
			return new Class282_Sub20_Sub26();
		case 7:
			return new Class282_Sub20_Sub27();
		case 15:
			return new Class282_Sub20_Sub34();
		case 3:
			return new Class282_Sub20_Sub18();
		case 19:
			return new Class282_Sub20_Sub15();
		case 33:
			return new Class282_Sub20_Sub36();
		case 9:
			return new Class282_Sub20_Sub23();
		case 23:
			return new Class282_Sub20_Sub22();
		case 25:
			return new Class282_Sub20_Sub28();
		case 21:
			return new Class282_Sub20_Sub33();
		case 30:
			return new Class282_Sub20_Sub7();
		case 20:
			return new Class282_Sub20_Sub2();
		case 24:
			return new Class282_Sub20_Sub30();
		case 16:
			return new Class282_Sub20_Sub8();
		case 6:
			return new Class282_Sub20_Sub20();
		case 10:
			return new Class282_Sub20_Sub13();
		case 1:
			return new Class282_Sub20_Sub21();
		case 5:
			return new Class282_Sub20_Sub16();
		case 34:
			return new Class282_Sub20_Sub4();
		case 17:
			return new Class282_Sub20_Sub32();
		case 13:
			return new Class282_Sub20_Sub38();
		case 29:
			return new Class282_Sub20_Sub19();
		case 37:
			return new Class282_Sub20_Sub14();
		case 22:
			return new Class282_Sub20_Sub31();
		case 38:
			return new Class282_Sub20_Sub39();
		case 31:
			return new Class282_Sub20_Sub5();
		default:
			return null;
		}
	}

	static Class282_Sub20 method12349(int i) {
		switch (i) {
		case 32:
			return new Class282_Sub20_Sub12();
		case 4:
			return new Class282_Sub20_Sub37();
		case 12:
			return new Class282_Sub20_Sub3();
		case 14:
			return new Class282_Sub20_Sub25();
		case 36:
			return new Class282_Sub20_Sub24();
		case 18:
			return new Class282_Sub20_Sub29_Sub1();
		case 26:
			return new Class282_Sub20_Sub11();
		case 28:
			return new Class282_Sub20_Sub9();
		case 27:
			return new Class282_Sub20_Sub1();
		case 39:
			return new Class282_Sub20_Sub29();
		case 8:
			return new Class282_Sub20_Sub10();
		case 2:
			return new Class282_Sub20_Sub6();
		case 0:
			return new Class282_Sub20_Sub17();
		case 11:
			return new Class282_Sub20_Sub35();
		case 35:
			return new Class282_Sub20_Sub26();
		case 7:
			return new Class282_Sub20_Sub27();
		case 15:
			return new Class282_Sub20_Sub34();
		case 3:
			return new Class282_Sub20_Sub18();
		case 19:
			return new Class282_Sub20_Sub15();
		case 33:
			return new Class282_Sub20_Sub36();
		case 9:
			return new Class282_Sub20_Sub23();
		case 23:
			return new Class282_Sub20_Sub22();
		case 25:
			return new Class282_Sub20_Sub28();
		case 21:
			return new Class282_Sub20_Sub33();
		case 30:
			return new Class282_Sub20_Sub7();
		case 20:
			return new Class282_Sub20_Sub2();
		case 24:
			return new Class282_Sub20_Sub30();
		case 16:
			return new Class282_Sub20_Sub8();
		case 6:
			return new Class282_Sub20_Sub20();
		case 10:
			return new Class282_Sub20_Sub13();
		case 1:
			return new Class282_Sub20_Sub21();
		case 5:
			return new Class282_Sub20_Sub16();
		case 34:
			return new Class282_Sub20_Sub4();
		case 17:
			return new Class282_Sub20_Sub32();
		case 13:
			return new Class282_Sub20_Sub38();
		case 29:
			return new Class282_Sub20_Sub19();
		case 37:
			return new Class282_Sub20_Sub14();
		case 22:
			return new Class282_Sub20_Sub31();
		case 38:
			return new Class282_Sub20_Sub39();
		case 31:
			return new Class282_Sub20_Sub5();
		default:
			return null;
		}
	}

	void method12350() {
		/* empty */
	}

	Class282_Sub20(int i, boolean bool) {
		aBool7669 = bool;
		((Class282_Sub20) this).aClass282_Sub20Array7671 = new Class282_Sub20[i];
	}

	static Class282_Sub20 method12351(RsByteBuffer class282_sub35) {
		class282_sub35.readUnsignedByte();
		int i = class282_sub35.readUnsignedByte();
		Class282_Sub20 class282_sub20 = Class252.method4328(i, -541707526);
		((Class282_Sub20) class282_sub20).anInt7668 = class282_sub35.readUnsignedByte() * 278242663;
		int i_25_ = class282_sub35.readUnsignedByte();
		for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
			int i_27_ = class282_sub35.readUnsignedByte();
			class282_sub20.method12322(i_27_, class282_sub35, -1874287568);
		}
		class282_sub20.method12321(963679187);
		return class282_sub20;
	}

	static final void method12352(CS2Executor class527, byte i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class464.aBool5556 ? 1 : 0;
	}
}
