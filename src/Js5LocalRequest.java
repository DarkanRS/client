/* Class282_Sub50_Sub11_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Js5LocalRequest extends Js5CacheRequest {
	Js5CacheFile aClass203_10464;
	static final int anInt10465 = 2;
	static final int anInt10466 = 3;
	int anInt10467;
	static final int anInt10468 = 1;
	byte[] aByteArray10469;

	int getCompletion(int i) {
		if (((Js5LocalRequest) this).incomplete)
			return 0;
		return 100;
	}

	byte[] method14944() {
		if (((Js5LocalRequest) this).incomplete)
			throw new RuntimeException();
		return ((Js5LocalRequest) this).aByteArray10469;
	}

	int method14947() {
		if (((Js5LocalRequest) this).incomplete)
			return 0;
		return 100;
	}

	byte[] getData(int i) {
		if (((Js5LocalRequest) this).incomplete)
			throw new RuntimeException();
		return ((Js5LocalRequest) this).aByteArray10469;
	}

	byte[] method14941() {
		if (((Js5LocalRequest) this).incomplete)
			throw new RuntimeException();
		return ((Js5LocalRequest) this).aByteArray10469;
	}

	byte[] method14945() {
		if (((Js5LocalRequest) this).incomplete)
			throw new RuntimeException();
		return ((Js5LocalRequest) this).aByteArray10469;
	}

	Js5LocalRequest() {
		/* empty */
	}

	int method14946() {
		if (((Js5LocalRequest) this).incomplete)
			return 0;
		return 100;
	}

	int method14948() {
		if (((Js5LocalRequest) this).incomplete)
			return 0;
		return 100;
	}
}
