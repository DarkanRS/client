
/* IcmpService_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jaclib.ping.IcmpService;

public class IcmpService_Sub1 extends IcmpService {
	List aList7962 = new ArrayList();
	static byte[][][] aByteArrayArrayArray7963;
	static volatile IcmpService_Sub1 anIcmpService_Sub1_7964;

	public static void method12968() {
		if (null != anIcmpService_Sub1_7964) {
			try {
				anIcmpService_Sub1_7964.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_7964 = null;
		}
	}

	protected void notify(int i) {
		Iterator iterator = ((IcmpService_Sub1) this).aList7962.iterator();
		while (iterator.hasNext()) {
			Interface45 interface45 = (Interface45) iterator.next();
			interface45.method248(0 == i, -1942989186);
		}
	}

	protected void notify(int i, int i_0_, int i_1_) {
		Iterator iterator = ((IcmpService_Sub1) this).aList7962.iterator();
		while (iterator.hasNext()) {
			Interface45 interface45 = (Interface45) iterator.next();
			interface45.method245(i, i_0_, i_1_, 53718982);
		}
	}

	IcmpService_Sub1() {
		/* empty */
	}

	public static void method12969(Interface45 interface45) {
		if (anIcmpService_Sub1_7964 == null)
			throw new IllegalStateException("");
		((IcmpService_Sub1) anIcmpService_Sub1_7964).aList7962.add(interface45);
	}

	public static boolean method12970() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_7964 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_7964 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class512());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	public static void method12971(Interface45 interface45) {
		if (anIcmpService_Sub1_7964 == null)
			throw new IllegalStateException("");
		((IcmpService_Sub1) anIcmpService_Sub1_7964).aList7962.add(interface45);
	}

	public static boolean method12972() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_7964 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_7964 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class512());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	public static boolean method12973() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_7964 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_7964 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class512());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	public static boolean method12974() {
		do {
			boolean bool;
			try {
				if (available())
					break;
				bool = false;
			} catch (Throwable throwable) {
				return false;
			}
			return bool;
		} while (false);
		if (anIcmpService_Sub1_7964 != null)
			throw new IllegalStateException("");
		anIcmpService_Sub1_7964 = new IcmpService_Sub1();
		Thread thread = new Thread(new Class512());
		thread.setDaemon(true);
		thread.start();
		return true;
	}

	public static void method12975(Interface45 interface45) {
		if (anIcmpService_Sub1_7964 == null)
			throw new IllegalStateException("");
		((IcmpService_Sub1) anIcmpService_Sub1_7964).aList7962.add(interface45);
	}

	public static void method12976() {
		if (null != anIcmpService_Sub1_7964) {
			try {
				anIcmpService_Sub1_7964.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_7964 = null;
		}
	}

	public static void method12977() {
		if (null != anIcmpService_Sub1_7964) {
			try {
				anIcmpService_Sub1_7964.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_7964 = null;
		}
	}

	public static void method12978() {
		if (null != anIcmpService_Sub1_7964) {
			try {
				anIcmpService_Sub1_7964.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_7964 = null;
		}
	}

	protected void method11597(int i) {
		Iterator iterator = ((IcmpService_Sub1) this).aList7962.iterator();
		while (iterator.hasNext()) {
			Interface45 interface45 = (Interface45) iterator.next();
			interface45.method248(0 == i, -1493708806);
		}
	}

	public static void method12979(Interface45 interface45) {
		if (anIcmpService_Sub1_7964 == null)
			throw new IllegalStateException("");
		((IcmpService_Sub1) anIcmpService_Sub1_7964).aList7962.add(interface45);
	}

	protected void method11598(int i) {
		Iterator iterator = ((IcmpService_Sub1) this).aList7962.iterator();
		while (iterator.hasNext()) {
			Interface45 interface45 = (Interface45) iterator.next();
			interface45.method248(0 == i, 1478443735);
		}
	}

	public static void method12980() {
		if (null != anIcmpService_Sub1_7964) {
			try {
				anIcmpService_Sub1_7964.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_7964 = null;
		}
	}

	public static void method12981() {
		if (null != anIcmpService_Sub1_7964) {
			try {
				anIcmpService_Sub1_7964.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			anIcmpService_Sub1_7964 = null;
		}
	}

	protected void method11599(int i, int i_2_, int i_3_) {
		Iterator iterator = ((IcmpService_Sub1) this).aList7962.iterator();
		while (iterator.hasNext()) {
			Interface45 interface45 = (Interface45) iterator.next();
			interface45.method245(i, i_2_, i_3_, 53718982);
		}
	}

	protected void method11600(int i, int i_4_, int i_5_) {
		Iterator iterator = ((IcmpService_Sub1) this).aList7962.iterator();
		while (iterator.hasNext()) {
			Interface45 interface45 = (Interface45) iterator.next();
			interface45.method245(i, i_4_, i_5_, 53718982);
		}
	}
}
