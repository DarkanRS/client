/* Class446 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class446 implements Iterator {
	Class453 aClass453_5611;
	Linkable aClass298_5612;
	Linkable aClass298_5613 = null;
	static int anInt5614;

	public void method5898(Class453 class453, int i) {
		try {
			((Class446) this).aClass453_5611 = class453;
			((Class446) this).aClass298_5612 = (((Class446) this).aClass453_5611.aClass298_5643.next);
			((Class446) this).aClass298_5613 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sk.d(").append(')').toString());
		}
	}

	void method5899(int i) {
		try {
			((Class446) this).aClass298_5612 = (((Class446) this).aClass453_5611.aClass298_5643.next);
			((Class446) this).aClass298_5613 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sk.u(").append(')').toString());
		}
	}

	public Linkable method5900(int i) {
		try {
			method5899(1114782715);
			return (Linkable) next();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sk.x(").append(')').toString());
		}
	}

	public boolean hasNext() {
		try {
			return (((Class446) this).aClass298_5612 != ((Class446) this).aClass453_5611.aClass298_5643);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sk.hasNext(").append(')').toString());
		}
	}

	public void remove() {
		try {
			if (null == ((Class446) this).aClass298_5613)
				throw new IllegalStateException();
			((Class446) this).aClass298_5613.unlink(-1460969981);
			((Class446) this).aClass298_5613 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sk.remove(").append(')').toString());
		}
	}

	public Class446(Class453 class453) {
		((Class446) this).aClass453_5611 = class453;
		((Class446) this).aClass298_5612 = ((Class446) this).aClass453_5611.aClass298_5643.next;
		((Class446) this).aClass298_5613 = null;
	}

	public Object next() {
		try {
			Linkable class298 = ((Class446) this).aClass298_5612;
			if (((Class446) this).aClass453_5611.aClass298_5643 == class298) {
				class298 = null;
				((Class446) this).aClass298_5612 = null;
			} else
				((Class446) this).aClass298_5612 = class298.next;
			((Class446) this).aClass298_5613 = class298;
			return class298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sk.next(").append(')').toString());
		}
	}

	static final void method5901(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (Class452.aBoolean5642) {
				Class456[] class456s = Class271.method2545((byte) 18);
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 28445523 * class456s[i_0_].anInt5663;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 262154323 * class456s[i_0_].anInt5665;
			} else {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sk.aek(").append(')').toString());
		}
	}

	static final void method5902(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class374.anIntArray4078[(((ClientScript2) class403).anIntArray5257[1883543357 * ((ClientScript2) class403).anInt5259])]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sk.aq(").append(')').toString());
		}
	}
}
