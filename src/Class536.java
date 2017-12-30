/* Class536 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class536 {
	Class229 aClass229_7092 = new Class229(64);
	public int anInt7093 = 0;
	public int anInt7094;
	Class317 aClass317_7095;

	public Class531 method11474(int i) {
		Class531 class531;
		synchronized (((Class536) this).aClass229_7092) {
			class531 = ((Class531) ((Class536) this).aClass229_7092.method3865((long) i));
		}
		if (class531 != null)
			return class531;
		byte[] is;
		synchronized (((Class536) this).aClass317_7095) {
			is = (((Class536) this).aClass317_7095.getFile(-71319279 * Class120.aClass120_1514.anInt1521, i, -1972523322));
		}
		class531 = new Class531();
		((Class531) class531).aClass536_7062 = this;
		((Class531) class531).anInt7053 = -609380743 * i;
		if (null != is)
			class531.method11357(new RsByteBuffer(is), -279483513);
		class531.method11356((byte) -125);
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3856(class531, (long) i);
		}
		return class531;
	}

	public Class531 method11475(int i, byte i_0_) {
		Class531 class531;
		synchronized (((Class536) this).aClass229_7092) {
			class531 = ((Class531) ((Class536) this).aClass229_7092.method3865((long) i));
		}
		if (class531 != null)
			return class531;
		byte[] is;
		synchronized (((Class536) this).aClass317_7095) {
			is = (((Class536) this).aClass317_7095.getFile(-71319279 * Class120.aClass120_1514.anInt1521, i, -1901150108));
		}
		class531 = new Class531();
		((Class531) class531).aClass536_7062 = this;
		((Class531) class531).anInt7053 = -609380743 * i;
		if (null != is)
			class531.method11357(new RsByteBuffer(is), 1338105221);
		class531.method11356((byte) -46);
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3856(class531, (long) i);
		}
		return class531;
	}

	public void method11476(byte i) {
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3859(2009928513);
		}
	}

	public void method11477(int i, byte i_1_) {
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3858(i, (byte) 14);
		}
	}

	public void method11478(int i) {
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3863(1398711796);
		}
	}

	public Class531 method11479(int i) {
		Class531 class531;
		synchronized (((Class536) this).aClass229_7092) {
			class531 = ((Class531) ((Class536) this).aClass229_7092.method3865((long) i));
		}
		if (class531 != null)
			return class531;
		byte[] is;
		synchronized (((Class536) this).aClass317_7095) {
			is = (((Class536) this).aClass317_7095.getFile(-71319279 * Class120.aClass120_1514.anInt1521, i, -1679639365));
		}
		class531 = new Class531();
		((Class531) class531).aClass536_7062 = this;
		((Class531) class531).anInt7053 = -609380743 * i;
		if (null != is)
			class531.method11357(new RsByteBuffer(is), 1704529585);
		class531.method11356((byte) -52);
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3856(class531, (long) i);
		}
		return class531;
	}

	public void method11480() {
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3859(-2069097146);
		}
	}

	public Class531 method11481(int i) {
		Class531 class531;
		synchronized (((Class536) this).aClass229_7092) {
			class531 = ((Class531) ((Class536) this).aClass229_7092.method3865((long) i));
		}
		if (class531 != null)
			return class531;
		byte[] is;
		synchronized (((Class536) this).aClass317_7095) {
			is = (((Class536) this).aClass317_7095.getFile(-71319279 * Class120.aClass120_1514.anInt1521, i, -1865732659));
		}
		class531 = new Class531();
		((Class531) class531).aClass536_7062 = this;
		((Class531) class531).anInt7053 = -609380743 * i;
		if (null != is)
			class531.method11357(new RsByteBuffer(is), -541895478);
		class531.method11356((byte) -88);
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3856(class531, (long) i);
		}
		return class531;
	}

	public void method11482() {
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3863(951955760);
		}
	}

	public void method11483() {
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3859(205402084);
		}
	}

	public void method11484(int i) {
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3858(i, (byte) -1);
		}
	}

	public void method11485(int i) {
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3858(i, (byte) 8);
		}
	}

	public Class536(Class486 class486, Class495 class495, Class317 class317) {
		((Class536) this).aClass317_7095 = class317;
		anInt7094 = (((Class536) this).aClass317_7095.method5624((-71319279 * (Class120.aClass120_1514.anInt1521)), -2042690113) * -919202315);
	}

	static final void method11486(CS2Executor class527, byte i) {
		int i_2_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = client.anIntArray7337[i_2_];
	}
}
