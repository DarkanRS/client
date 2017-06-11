/* Class298_Sub26_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub26_Sub1 extends Class298_Sub26 {
	public byte[] aByteArray9309;
	int anInt9310;
	public int anInt9311;
	public int anInt9312;
	public boolean aBoolean9313;

	Class298_Sub26_Sub1(int i, byte[] is, int i_0_, int i_1_, boolean bool) {
		anInt9312 = i;
		aByteArray9309 = is;
		anInt9311 = i_0_;
		((Class298_Sub26_Sub1) this).anInt9310 = i_1_;
		aBoolean9313 = bool;
	}

	public Class298_Sub26_Sub1 method3104(Class270 class270) {
		aByteArray9309 = class270.method2532(aByteArray9309, -1269328247);
		anInt9312 = class270.method2534(anInt9312, -1038860736);
		if (anInt9311 == ((Class298_Sub26_Sub1) this).anInt9310)
			anInt9311 = ((Class298_Sub26_Sub1) this).anInt9310 = class270.method2535(anInt9311, -1221225571);
		else {
			anInt9311 = class270.method2535(anInt9311, 465158744);
			((Class298_Sub26_Sub1) this).anInt9310 = class270.method2535(((Class298_Sub26_Sub1) this).anInt9310, -220655901);
			if (anInt9311 == ((Class298_Sub26_Sub1) this).anInt9310)
				anInt9311--;
		}
		return this;
	}

	Class298_Sub26_Sub1(int i, byte[] is, int i_2_, int i_3_) {
		anInt9312 = i;
		aByteArray9309 = is;
		anInt9311 = i_2_;
		((Class298_Sub26_Sub1) this).anInt9310 = i_3_;
	}
}
