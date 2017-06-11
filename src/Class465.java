/* Class465 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

public class Class465 implements Interface18 {
	boolean aBoolean6513;
	int anInt6514;
	int anInt6515;
	int anInt6516;
	int anInt6517;
	int anInt6518;
	int anInt6519;
	static Class243 aClass243_6520;

	public boolean method235(Interface18 interface18) {
		if (!(interface18 instanceof Class465))
			return false;
		Class465 class465_0_ = (Class465) interface18;
		if (696186641 * ((Class465) class465_0_).anInt6519 != 696186641 * ((Class465) this).anInt6519)
			return false;
		if (((Class465) this).anInt6514 * 1776279405 != 1776279405 * ((Class465) class465_0_).anInt6514)
			return false;
		if (((Class465) this).anInt6515 * 793126543 != 793126543 * ((Class465) class465_0_).anInt6515)
			return false;
		if (-2052168577 * ((Class465) this).anInt6516 != ((Class465) class465_0_).anInt6516 * -2052168577)
			return false;
		if (-2128765879 * ((Class465) class465_0_).anInt6518 != ((Class465) this).anInt6518 * -2128765879)
			return false;
		if (-1527694577 * ((Class465) this).anInt6517 != ((Class465) class465_0_).anInt6517 * -1527694577)
			return false;
		if (((Class465) this).aBoolean6513 != ((Class465) class465_0_).aBoolean6513)
			return false;
		return true;
	}

	public boolean method232(Interface18 interface18) {
		try {
			if (!(interface18 instanceof Class465))
				return false;
			Class465 class465_1_ = (Class465) interface18;
			if (696186641 * ((Class465) class465_1_).anInt6519 != 696186641 * ((Class465) this).anInt6519)
				return false;
			if (((Class465) this).anInt6514 * 1776279405 != 1776279405 * ((Class465) class465_1_).anInt6514)
				return false;
			if (((Class465) this).anInt6515 * 793126543 != 793126543 * ((Class465) class465_1_).anInt6515)
				return false;
			if (-2052168577 * ((Class465) this).anInt6516 != ((Class465) class465_1_).anInt6516 * -2052168577)
				return false;
			if (-2128765879 * ((Class465) class465_1_).anInt6518 != ((Class465) this).anInt6518 * -2128765879)
				return false;
			if (-1527694577 * ((Class465) this).anInt6517 != ((Class465) class465_1_).anInt6517 * -1527694577)
				return false;
			if (((Class465) this).aBoolean6513 != ((Class465) class465_1_).aBoolean6513)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("te.f(").append(')').toString());
		}
	}

	public long method231() {
		try {
			long[] ls = RsByteBuffer.aLongArray7619;
			long l = -1L;
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (696186641 * ((Class465) this).anInt6519)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((1776279405 * ((Class465) this).anInt6514) >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class465) this).anInt6514 * 1776279405)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * (((Class465) this).anInt6515) >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * (((Class465) this).anInt6515) >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * (((Class465) this).anInt6515) >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * ((Class465) this).anInt6515)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (-2052168577 * ((Class465) this).anInt6516)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((-2128765879 * ((Class465) this).anInt6518) >> 24)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((((Class465) this).anInt6518 * -2128765879) >> 16)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) ((-2128765879 * ((Class465) this).anInt6518) >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class465) this).anInt6518 * -2128765879)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1527694577 * ((Class465) this).anInt6517)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class465) this).aBoolean6513 ? 1 : 0)) & 0xffL)];
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("te.a(").append(')').toString());
		}
	}

	public long method233() {
		long[] ls = RsByteBuffer.aLongArray7619;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (696186641 * ((Class465) this).anInt6519)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (1776279405 * ((Class465) this).anInt6514 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class465) this).anInt6514 * 1776279405)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * ((Class465) this).anInt6515 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * ((Class465) this).anInt6515 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * ((Class465) this).anInt6515 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * ((Class465) this).anInt6515)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-2052168577 * ((Class465) this).anInt6516)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-2128765879 * ((Class465) this).anInt6518 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (((Class465) this).anInt6518 * -2128765879 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-2128765879 * ((Class465) this).anInt6518 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class465) this).anInt6518 * -2128765879)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1527694577 * ((Class465) this).anInt6517)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class465) this).aBoolean6513 ? 1 : 0)) & 0xffL)];
		return l;
	}

	public long method234() {
		long[] ls = RsByteBuffer.aLongArray7619;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (696186641 * ((Class465) this).anInt6519)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (1776279405 * ((Class465) this).anInt6514 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class465) this).anInt6514 * 1776279405)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * ((Class465) this).anInt6515 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * ((Class465) this).anInt6515 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * ((Class465) this).anInt6515 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (793126543 * ((Class465) this).anInt6515)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-2052168577 * ((Class465) this).anInt6516)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-2128765879 * ((Class465) this).anInt6518 >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (((Class465) this).anInt6518 * -2128765879 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-2128765879 * ((Class465) this).anInt6518 >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class465) this).anInt6518 * -2128765879)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1527694577 * ((Class465) this).anInt6517)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((Class465) this).aBoolean6513 ? 1 : 0)) & 0xffL)];
		return l;
	}

	Class465() {
		/* empty */
	}

	public boolean method236(Interface18 interface18) {
		if (!(interface18 instanceof Class465))
			return false;
		Class465 class465_2_ = (Class465) interface18;
		if (696186641 * ((Class465) class465_2_).anInt6519 != 696186641 * ((Class465) this).anInt6519)
			return false;
		if (((Class465) this).anInt6514 * 1776279405 != 1776279405 * ((Class465) class465_2_).anInt6514)
			return false;
		if (((Class465) this).anInt6515 * 793126543 != 793126543 * ((Class465) class465_2_).anInt6515)
			return false;
		if (-2052168577 * ((Class465) this).anInt6516 != ((Class465) class465_2_).anInt6516 * -2052168577)
			return false;
		if (-2128765879 * ((Class465) class465_2_).anInt6518 != ((Class465) this).anInt6518 * -2128765879)
			return false;
		if (-1527694577 * ((Class465) this).anInt6517 != ((Class465) class465_2_).anInt6517 * -1527694577)
			return false;
		if (((Class465) this).aBoolean6513 != ((Class465) class465_2_).aBoolean6513)
			return false;
		return true;
	}

	public static String method6017(long l, int i, boolean bool, int i_3_) {
		try {
			Calendar calendar;
			if (bool) {
				Class300.method3686(l);
				calendar = Class490.aCalendar6075;
			} else {
				Class422_Sub9.method5658(l);
				calendar = Class490.aCalendar6073;
			}
			int i_4_ = calendar.get(5);
			int i_5_ = calendar.get(2);
			int i_6_ = calendar.get(1);
			int i_7_ = calendar.get(11);
			int i_8_ = calendar.get(12);
			if (i == 3)
				return Class422_Sub2.method5631(l, i, bool, (byte) 1);
			return new StringBuilder().append(Integer.toString(i_4_ / 10)).append(i_4_ % 10).append("-").append(Class490.aStringArrayArray6074[i][i_5_]).append("-").append(i_6_).append(" ").append(i_7_ / 10).append(i_7_ % 10).append(":").append(i_8_ / 10).append(i_8_ % 10).toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("te.f(").append(')').toString());
		}
	}

	static final void method6018(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -637719265) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1263 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("te.ld(").append(')').toString());
		}
	}

	static final void method6019(ClientScript2 class403, short i) {
		try {
			int i_9_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class350 class350 = Class94.aClass349_913.method4202(i_9_, (byte) 24);
			if (null != class350.anIntArray3712 && class350.anIntArray3712.length > 0) {
				int i_10_ = 0;
				int i_11_ = class350.anIntArray3713[0];
				for (int i_12_ = 1; i_12_ < class350.anIntArray3712.length; i_12_++) {
					if (class350.anIntArray3713[i_12_] > i_11_) {
						i_10_ = i_12_;
						i_11_ = class350.anIntArray3713[i_12_];
					}
				}
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = class350.anIntArray3712[i_10_];
			} else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -809747019 * class350.anInt3711;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("te.abx(").append(')').toString());
		}
	}
}
