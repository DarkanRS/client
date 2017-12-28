/* Class342 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class342 {
	int anInt3997 = 2;
	int[] anIntArray3998;
	int anInt3999;
	int anInt4000;
	int anInt4001;
	int anInt4002;
	int anInt4003;
	int anInt4004;
	int[] anIntArray4005 = new int[2];
	int anInt4006;
	int anInt4007;

	final int method6075(int i) {
		if (((Class342) this).anInt4007 >= ((Class342) this).anInt4003) {
			((Class342) this).anInt4001 = (((Class342) this).anIntArray3998[((Class342) this).anInt4004++]) << 15;
			if (((Class342) this).anInt4004 >= ((Class342) this).anInt3997)
				((Class342) this).anInt4004 = ((Class342) this).anInt3997 - 1;
			((Class342) this).anInt4003 = (int) ((double) (((Class342) this).anIntArray4005[((Class342) this).anInt4004]) / 65536.0 * (double) i);
			if (((Class342) this).anInt4003 > ((Class342) this).anInt4007)
				((Class342) this).anInt4006 = ((((((Class342) this).anIntArray3998[((Class342) this).anInt4004]) << 15) - ((Class342) this).anInt4001) / (((Class342) this).anInt4003 - ((Class342) this).anInt4007));
		}
		((Class342) this).anInt4001 += ((Class342) this).anInt4006;
		((Class342) this).anInt4007++;
		return ((Class342) this).anInt4001 - ((Class342) this).anInt4006 >> 15;
	}

	final void method6076(RsByteBuffer class282_sub35) {
		((Class342) this).anInt4002 = class282_sub35.readUnsignedByte();
		((Class342) this).anInt4000 = class282_sub35.readInt();
		((Class342) this).anInt3999 = class282_sub35.readInt();
		method6086(class282_sub35);
	}

	final void method6077(RsByteBuffer class282_sub35) {
		((Class342) this).anInt3997 = class282_sub35.readUnsignedByte();
		((Class342) this).anIntArray4005 = new int[((Class342) this).anInt3997];
		((Class342) this).anIntArray3998 = new int[((Class342) this).anInt3997];
		for (int i = 0; i < ((Class342) this).anInt3997; i++) {
			((Class342) this).anIntArray4005[i] = class282_sub35.readUnsignedShort();
			((Class342) this).anIntArray3998[i] = class282_sub35.readUnsignedShort();
		}
	}

	final void method6078() {
		((Class342) this).anInt4003 = 0;
		((Class342) this).anInt4004 = 0;
		((Class342) this).anInt4006 = 0;
		((Class342) this).anInt4001 = 0;
		((Class342) this).anInt4007 = 0;
	}

	final int method6079(int i) {
		if (((Class342) this).anInt4007 >= ((Class342) this).anInt4003) {
			((Class342) this).anInt4001 = (((Class342) this).anIntArray3998[((Class342) this).anInt4004++]) << 15;
			if (((Class342) this).anInt4004 >= ((Class342) this).anInt3997)
				((Class342) this).anInt4004 = ((Class342) this).anInt3997 - 1;
			((Class342) this).anInt4003 = (int) ((double) (((Class342) this).anIntArray4005[((Class342) this).anInt4004]) / 65536.0 * (double) i);
			if (((Class342) this).anInt4003 > ((Class342) this).anInt4007)
				((Class342) this).anInt4006 = ((((((Class342) this).anIntArray3998[((Class342) this).anInt4004]) << 15) - ((Class342) this).anInt4001) / (((Class342) this).anInt4003 - ((Class342) this).anInt4007));
		}
		((Class342) this).anInt4001 += ((Class342) this).anInt4006;
		((Class342) this).anInt4007++;
		return ((Class342) this).anInt4001 - ((Class342) this).anInt4006 >> 15;
	}

	final void method6080(RsByteBuffer class282_sub35) {
		((Class342) this).anInt4002 = class282_sub35.readUnsignedByte();
		((Class342) this).anInt4000 = class282_sub35.readInt();
		((Class342) this).anInt3999 = class282_sub35.readInt();
		method6086(class282_sub35);
	}

	final void method6081(RsByteBuffer class282_sub35) {
		((Class342) this).anInt4002 = class282_sub35.readUnsignedByte();
		((Class342) this).anInt4000 = class282_sub35.readInt();
		((Class342) this).anInt3999 = class282_sub35.readInt();
		method6086(class282_sub35);
	}

	final void method6082(RsByteBuffer class282_sub35) {
		((Class342) this).anInt3997 = class282_sub35.readUnsignedByte();
		((Class342) this).anIntArray4005 = new int[((Class342) this).anInt3997];
		((Class342) this).anIntArray3998 = new int[((Class342) this).anInt3997];
		for (int i = 0; i < ((Class342) this).anInt3997; i++) {
			((Class342) this).anIntArray4005[i] = class282_sub35.readUnsignedShort();
			((Class342) this).anIntArray3998[i] = class282_sub35.readUnsignedShort();
		}
	}

	Class342() {
		((Class342) this).anIntArray3998 = new int[2];
		((Class342) this).anIntArray4005[0] = 0;
		((Class342) this).anIntArray4005[1] = 65535;
		((Class342) this).anIntArray3998[0] = 0;
		((Class342) this).anIntArray3998[1] = 65535;
	}

	final void method6083(RsByteBuffer class282_sub35) {
		((Class342) this).anInt3997 = class282_sub35.readUnsignedByte();
		((Class342) this).anIntArray4005 = new int[((Class342) this).anInt3997];
		((Class342) this).anIntArray3998 = new int[((Class342) this).anInt3997];
		for (int i = 0; i < ((Class342) this).anInt3997; i++) {
			((Class342) this).anIntArray4005[i] = class282_sub35.readUnsignedShort();
			((Class342) this).anIntArray3998[i] = class282_sub35.readUnsignedShort();
		}
	}

	final void method6084() {
		((Class342) this).anInt4003 = 0;
		((Class342) this).anInt4004 = 0;
		((Class342) this).anInt4006 = 0;
		((Class342) this).anInt4001 = 0;
		((Class342) this).anInt4007 = 0;
	}

	final int method6085(int i) {
		if (((Class342) this).anInt4007 >= ((Class342) this).anInt4003) {
			((Class342) this).anInt4001 = (((Class342) this).anIntArray3998[((Class342) this).anInt4004++]) << 15;
			if (((Class342) this).anInt4004 >= ((Class342) this).anInt3997)
				((Class342) this).anInt4004 = ((Class342) this).anInt3997 - 1;
			((Class342) this).anInt4003 = (int) ((double) (((Class342) this).anIntArray4005[((Class342) this).anInt4004]) / 65536.0 * (double) i);
			if (((Class342) this).anInt4003 > ((Class342) this).anInt4007)
				((Class342) this).anInt4006 = ((((((Class342) this).anIntArray3998[((Class342) this).anInt4004]) << 15) - ((Class342) this).anInt4001) / (((Class342) this).anInt4003 - ((Class342) this).anInt4007));
		}
		((Class342) this).anInt4001 += ((Class342) this).anInt4006;
		((Class342) this).anInt4007++;
		return ((Class342) this).anInt4001 - ((Class342) this).anInt4006 >> 15;
	}

	final void method6086(RsByteBuffer class282_sub35) {
		((Class342) this).anInt3997 = class282_sub35.readUnsignedByte();
		((Class342) this).anIntArray4005 = new int[((Class342) this).anInt3997];
		((Class342) this).anIntArray3998 = new int[((Class342) this).anInt3997];
		for (int i = 0; i < ((Class342) this).anInt3997; i++) {
			((Class342) this).anIntArray4005[i] = class282_sub35.readUnsignedShort();
			((Class342) this).anIntArray3998[i] = class282_sub35.readUnsignedShort();
		}
	}

	final int method6087(int i) {
		if (((Class342) this).anInt4007 >= ((Class342) this).anInt4003) {
			((Class342) this).anInt4001 = (((Class342) this).anIntArray3998[((Class342) this).anInt4004++]) << 15;
			if (((Class342) this).anInt4004 >= ((Class342) this).anInt3997)
				((Class342) this).anInt4004 = ((Class342) this).anInt3997 - 1;
			((Class342) this).anInt4003 = (int) ((double) (((Class342) this).anIntArray4005[((Class342) this).anInt4004]) / 65536.0 * (double) i);
			if (((Class342) this).anInt4003 > ((Class342) this).anInt4007)
				((Class342) this).anInt4006 = ((((((Class342) this).anIntArray3998[((Class342) this).anInt4004]) << 15) - ((Class342) this).anInt4001) / (((Class342) this).anInt4003 - ((Class342) this).anInt4007));
		}
		((Class342) this).anInt4001 += ((Class342) this).anInt4006;
		((Class342) this).anInt4007++;
		return ((Class342) this).anInt4001 - ((Class342) this).anInt4006 >> 15;
	}
}
