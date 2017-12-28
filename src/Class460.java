
/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class460 implements Iterator {
	Class482 aClass482_5535;
	Class282 aClass282_5536;
	Class282 aClass282_5537 = null;

	public Class282 method7680() {
		method7697((short) -18109);
		return (Class282) next();
	}

	public Object method7681() {
		Class282 class282 = ((Class460) this).aClass282_5536;
		if (class282 == ((Class460) this).aClass482_5535.aClass282_5728) {
			class282 = null;
			((Class460) this).aClass282_5536 = null;
		} else
			((Class460) this).aClass282_5536 = class282.aClass282_3378;
		((Class460) this).aClass282_5537 = class282;
		return class282;
	}

	public Class282 method7682() {
		method7697((short) -10835);
		return (Class282) next();
	}

	public Class282 method7683(int i) {
		method7697((short) -14367);
		return (Class282) next();
	}

	public Object next() {
		Class282 class282 = ((Class460) this).aClass282_5536;
		if (class282 == ((Class460) this).aClass482_5535.aClass282_5728) {
			class282 = null;
			((Class460) this).aClass282_5536 = null;
		} else
			((Class460) this).aClass282_5536 = class282.aClass282_3378;
		((Class460) this).aClass282_5537 = class282;
		return class282;
	}

	public boolean hasNext() {
		return (((Class460) this).aClass482_5535.aClass282_5728 != ((Class460) this).aClass282_5536);
	}

	public void method7684(Class482 class482, byte i) {
		((Class460) this).aClass482_5535 = class482;
		((Class460) this).aClass282_5536 = ((Class460) this).aClass482_5535.aClass282_5728.aClass282_3378;
		((Class460) this).aClass282_5537 = null;
	}

	public boolean method7685() {
		return (((Class460) this).aClass482_5535.aClass282_5728 != ((Class460) this).aClass282_5536);
	}

	public boolean method7686() {
		return (((Class460) this).aClass482_5535.aClass282_5728 != ((Class460) this).aClass282_5536);
	}

	public boolean method7687() {
		return (((Class460) this).aClass482_5535.aClass282_5728 != ((Class460) this).aClass282_5536);
	}

	public Class460(Class482 class482) {
		((Class460) this).aClass482_5535 = class482;
		((Class460) this).aClass282_5536 = ((Class460) this).aClass482_5535.aClass282_5728.aClass282_3378;
		((Class460) this).aClass282_5537 = null;
	}

	public Object method7688() {
		Class282 class282 = ((Class460) this).aClass282_5536;
		if (class282 == ((Class460) this).aClass482_5535.aClass282_5728) {
			class282 = null;
			((Class460) this).aClass282_5536 = null;
		} else
			((Class460) this).aClass282_5536 = class282.aClass282_3378;
		((Class460) this).aClass282_5537 = class282;
		return class282;
	}

	public Object method7689() {
		Class282 class282 = ((Class460) this).aClass282_5536;
		if (class282 == ((Class460) this).aClass482_5535.aClass282_5728) {
			class282 = null;
			((Class460) this).aClass282_5536 = null;
		} else
			((Class460) this).aClass282_5536 = class282.aClass282_3378;
		((Class460) this).aClass282_5537 = class282;
		return class282;
	}

	public void remove() {
		if (((Class460) this).aClass282_5537 == null)
			throw new IllegalStateException();
		((Class460) this).aClass282_5537.method4991(-371378792);
		((Class460) this).aClass282_5537 = null;
	}

	public void method7690() {
		if (((Class460) this).aClass282_5537 == null)
			throw new IllegalStateException();
		((Class460) this).aClass282_5537.method4991(-371378792);
		((Class460) this).aClass282_5537 = null;
	}

	public void method7691(Class482 class482) {
		((Class460) this).aClass482_5535 = class482;
		((Class460) this).aClass282_5536 = ((Class460) this).aClass482_5535.aClass282_5728.aClass282_3378;
		((Class460) this).aClass282_5537 = null;
	}

	public void method7692(Class482 class482) {
		((Class460) this).aClass482_5535 = class482;
		((Class460) this).aClass282_5536 = ((Class460) this).aClass482_5535.aClass282_5728.aClass282_3378;
		((Class460) this).aClass282_5537 = null;
	}

	void method7693() {
		((Class460) this).aClass282_5536 = ((Class460) this).aClass482_5535.aClass282_5728.aClass282_3378;
		((Class460) this).aClass282_5537 = null;
	}

	public void method7694() {
		if (((Class460) this).aClass282_5537 == null)
			throw new IllegalStateException();
		((Class460) this).aClass282_5537.method4991(-371378792);
		((Class460) this).aClass282_5537 = null;
	}

	void method7695() {
		((Class460) this).aClass282_5536 = ((Class460) this).aClass482_5535.aClass282_5728.aClass282_3378;
		((Class460) this).aClass282_5537 = null;
	}

	public void method7696(Class482 class482) {
		((Class460) this).aClass482_5535 = class482;
		((Class460) this).aClass282_5536 = ((Class460) this).aClass482_5535.aClass282_5728.aClass282_3378;
		((Class460) this).aClass282_5537 = null;
	}

	void method7697(short i) {
		((Class460) this).aClass282_5536 = ((Class460) this).aClass482_5535.aClass282_5728.aClass282_3378;
		((Class460) this).aClass282_5537 = null;
	}

	public Class282 method7698() {
		method7697((short) -19395);
		return (Class282) next();
	}

	static final void method7699(Class527 class527, int i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7151 ? 1 : 0;
	}

	static final void method7700(Class527 class527, int i) {
		int i_0_ = (((Class527) class527).anIntArray7018[((Class527) class527).anInt7020 * 301123709]);
		Class537 class537 = Class497.aClass233_5822.method3933(i_0_, 1537794608);
		if (null == class537)
			throw new RuntimeException();
		Integer integer = (((Class527) class527).aClass61_7010.method1225((1648080491 * client.aClass486_7450.anInt5746 << 16 | -1659474903 * class537.anInt7097), class537.anInt7098 * 1866356493, -47997093 * class537.anInt7099, (byte) 116));
		int i_1_;
		if (null == integer)
			i_1_ = 0;
		else
			i_1_ = integer.intValue();
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_1_;
	}
}
