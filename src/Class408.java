/* Class408 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class408 {
	Class229 aClass229_4850 = new Class229(64);
	public int anInt4851;
	Class317 aClass317_4852;
	static Class317 aClass317_4853;

	public Class415 method6872(int i) {
		Class415 class415;
		synchronized (((Class408) this).aClass229_4850) {
			class415 = ((Class415) ((Class408) this).aClass229_4850.method3865((long) i));
		}
		if (null != class415)
			return class415;
		byte[] is;
		synchronized (((Class408) this).aClass317_4852) {
			is = (((Class408) this).aClass317_4852.getFile(-71319279 * Class120.aClass120_1482.anInt1521, i, -1848554770));
		}
		class415 = new Class415();
		if (null != is)
			class415.method6990(new RsByteBuffer(is), -2089573678);
		synchronized (((Class408) this).aClass229_4850) {
			((Class408) this).aClass229_4850.method3856(class415, (long) i);
		}
		return class415;
	}

	public Class415 method6873(int i, byte i_0_) {
		Class415 class415;
		synchronized (((Class408) this).aClass229_4850) {
			class415 = ((Class415) ((Class408) this).aClass229_4850.method3865((long) i));
		}
		if (null != class415)
			return class415;
		byte[] is;
		synchronized (((Class408) this).aClass317_4852) {
			is = (((Class408) this).aClass317_4852.getFile(-71319279 * Class120.aClass120_1482.anInt1521, i, -2097990028));
		}
		class415 = new Class415();
		if (null != is)
			class415.method6990(new RsByteBuffer(is), -2121705498);
		synchronized (((Class408) this).aClass229_4850) {
			((Class408) this).aClass229_4850.method3856(class415, (long) i);
		}
		return class415;
	}

	public Class408(Class486 class486, Class495 class495, Class317 class317) {
		((Class408) this).aClass317_4852 = class317;
		anInt4851 = (((Class408) this).aClass317_4852.method5624(((Class120.aClass120_1482.anInt1521) * -71319279), 2023918393) * 2109871343);
	}
}
