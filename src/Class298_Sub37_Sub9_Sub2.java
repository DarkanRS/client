/* Class298_Sub37_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class298_Sub37_Sub9_Sub2 extends Class298_Sub37_Sub9 {
	public static byte[][][] aByteArrayArrayArray10001;
	SoftReference aSoftReference10002;

	boolean method3439() {
		return true;
	}

	Object method3437(int i) {
		try {
			return ((Class298_Sub37_Sub9_Sub2) this).aSoftReference10002.get();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akt.a(").append(')').toString());
		}
	}

	boolean method3438(int i) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akt.f(").append(')').toString());
		}
	}

	Object method3442() {
		return ((Class298_Sub37_Sub9_Sub2) this).aSoftReference10002.get();
	}

	Object method3440() {
		return ((Class298_Sub37_Sub9_Sub2) this).aSoftReference10002.get();
	}

	boolean method3441() {
		return true;
	}

	boolean method3436() {
		return true;
	}

	Class298_Sub37_Sub9_Sub2(Object object, int i) {
		super(i);
		((Class298_Sub37_Sub9_Sub2) this).aSoftReference10002 = new SoftReference(object);
	}
}
