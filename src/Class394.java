/* Class394 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class394 {
	Class317 aClass317_4784;
	public int anInt4785;
	Class229 aClass229_4786 = new Class229(64);

	public void method6752(int i) {
		synchronized (((Class394) this).aClass229_4786) {
			((Class394) this).aClass229_4786.method3858(i, (byte) 109);
		}
	}

	public Class405 method6753(int i, int i_0_) {
		Class405 class405;
		synchronized (((Class394) this).aClass229_4786) {
			class405 = ((Class405) ((Class394) this).aClass229_4786.method3865((long) i));
		}
		if (class405 != null)
			return class405;
		byte[] is;
		synchronized (((Class394) this).aClass317_4784) {
			is = (((Class394) this).aClass317_4784.method5607(-71319279 * Class120.aClass120_1510.anInt1521, i, -1270537898));
		}
		class405 = new Class405();
		if (null != is)
			class405.method6816(new RsByteBuffer(is), 45839007);
		synchronized (((Class394) this).aClass229_4786) {
			((Class394) this).aClass229_4786.method3856(class405, (long) i);
		}
		return class405;
	}

	public void method6754(int i) {
		synchronized (((Class394) this).aClass229_4786) {
			((Class394) this).aClass229_4786.method3859(-51654906);
		}
	}

	public void method6755(int i, byte i_1_) {
		synchronized (((Class394) this).aClass229_4786) {
			((Class394) this).aClass229_4786.method3858(i, (byte) -24);
		}
	}

	public void method6756(int i) {
		synchronized (((Class394) this).aClass229_4786) {
			((Class394) this).aClass229_4786.method3863(1671454169);
		}
	}

	public Class394(Class486 class486, Class495 class495, Class317 class317) {
		((Class394) this).aClass317_4784 = class317;
		if (null != ((Class394) this).aClass317_4784)
			anInt4785 = (((Class394) this).aClass317_4784.method5624(-71319279 * Class120.aClass120_1510.anInt1521, -774524494)) * -476997773;
		else
			anInt4785 = 0;
	}

	public void method6757() {
		synchronized (((Class394) this).aClass229_4786) {
			((Class394) this).aClass229_4786.method3859(-2033684084);
		}
	}

	public void method6758(int i) {
		synchronized (((Class394) this).aClass229_4786) {
			((Class394) this).aClass229_4786.method3858(i, (byte) -62);
		}
	}

	public void method6759() {
		synchronized (((Class394) this).aClass229_4786) {
			((Class394) this).aClass229_4786.method3859(851512939);
		}
	}

	public void method6760() {
		synchronized (((Class394) this).aClass229_4786) {
			((Class394) this).aClass229_4786.method3863(1421982124);
		}
	}

	public void method6761() {
		synchronized (((Class394) this).aClass229_4786) {
			((Class394) this).aClass229_4786.method3863(1116239355);
		}
	}

	static final void method6762(Class527 class527, int i) {
		int i_2_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_2_, (byte) 41);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_2_ >> 16];
		Class202.method3338(class118, class98, class527, (byte) 82);
	}

	static void method6763(byte i) {
		Class187.anInt2363 = 0;
		Class187.anInt2351 = -1481335827;
		Class187.anInt2361 = 134656021;
		Class187.anInt2359 = 818291313;
	}
}
