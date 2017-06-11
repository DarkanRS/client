/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class279 {
	int anInt2970;
	int[] anIntArray2971;
	int[] anIntArray2972;
	int anInt2973;
	int anInt2974;
	int anInt2975;
	int anInt2976;
	int anInt2977;
	int anInt2978;
	int anInt2979 = 2;
	int anInt2980;

	final int method2605(int i) {
		if (((Class279) this).anInt2980 >= ((Class279) this).anInt2976) {
			((Class279) this).anInt2970 = (((Class279) this).anIntArray2972[((Class279) this).anInt2977++]) << 15;
			if (((Class279) this).anInt2977 >= ((Class279) this).anInt2979)
				((Class279) this).anInt2977 = ((Class279) this).anInt2979 - 1;
			((Class279) this).anInt2976 = (int) ((double) (((Class279) this).anIntArray2971[((Class279) this).anInt2977]) / 65536.0 * (double) i);
			if (((Class279) this).anInt2976 > ((Class279) this).anInt2980)
				((Class279) this).anInt2978 = ((((((Class279) this).anIntArray2972[((Class279) this).anInt2977]) << 15) - ((Class279) this).anInt2970) / (((Class279) this).anInt2976 - ((Class279) this).anInt2980));
		}
		((Class279) this).anInt2970 += ((Class279) this).anInt2978;
		((Class279) this).anInt2980++;
		return ((Class279) this).anInt2970 - ((Class279) this).anInt2978 >> 15;
	}

	final void method2606(RsByteBuffer class298_sub53) {
		((Class279) this).anInt2975 = class298_sub53.readUnsignedByte();
		((Class279) this).anInt2973 = class298_sub53.readInt((byte) 10);
		((Class279) this).anInt2974 = class298_sub53.readInt((byte) -71);
		method2607(class298_sub53);
	}

	final void method2607(RsByteBuffer class298_sub53) {
		((Class279) this).anInt2979 = class298_sub53.readUnsignedByte();
		((Class279) this).anIntArray2971 = new int[((Class279) this).anInt2979];
		((Class279) this).anIntArray2972 = new int[((Class279) this).anInt2979];
		for (int i = 0; i < ((Class279) this).anInt2979; i++) {
			((Class279) this).anIntArray2971[i] = class298_sub53.readUnsignedShort();
			((Class279) this).anIntArray2972[i] = class298_sub53.readUnsignedShort();
		}
	}

	final void method2608() {
		((Class279) this).anInt2976 = 0;
		((Class279) this).anInt2977 = 0;
		((Class279) this).anInt2978 = 0;
		((Class279) this).anInt2970 = 0;
		((Class279) this).anInt2980 = 0;
	}

	Class279() {
		((Class279) this).anIntArray2971 = new int[2];
		((Class279) this).anIntArray2972 = new int[2];
		((Class279) this).anIntArray2971[0] = 0;
		((Class279) this).anIntArray2971[1] = 65535;
		((Class279) this).anIntArray2972[0] = 0;
		((Class279) this).anIntArray2972[1] = 65535;
	}
}
