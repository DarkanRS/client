
/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

import jaclib.ping.Ping;

public class Class7 implements Runnable {
	volatile long aLong52 = -1357056565336257481L;
	String aString53;
	InetAddress anInetAddress54;
	volatile boolean aBool55 = true;
	static int anInt56;

	void method345() {
		if (null != ((Class7) this).anInetAddress54) {
			try {
				byte[] is = ((Class7) this).anInetAddress54.getAddress();
				((Class7) this).aLong52 = (long) Ping.method747(is[0], is[1], is[2], is[3], 10000L) * 1357056565336257481L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class89.method1504(1000L);
	}

	void method346(String string, int i) {
		((Class7) this).aString53 = string;
		((Class7) this).anInetAddress54 = null;
		((Class7) this).aLong52 = -1357056565336257481L;
		if (null != ((Class7) this).aString53) {
			try {
				((Class7) this).anInetAddress54 = InetAddress.getByName(((Class7) this).aString53);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	void method347(int i) {
		((Class7) this).aBool55 = false;
	}

	public void method348() {
		while (((Class7) this).aBool55)
			method354(1818946433);
	}

	public void run() {
		while (((Class7) this).aBool55)
			method354(2084342034);
	}

	long method349(byte i) {
		return -2718567541499767175L * ((Class7) this).aLong52;
	}

	void method350(String string) {
		((Class7) this).aString53 = string;
		((Class7) this).anInetAddress54 = null;
		((Class7) this).aLong52 = -1357056565336257481L;
		if (null != ((Class7) this).aString53) {
			try {
				((Class7) this).anInetAddress54 = InetAddress.getByName(((Class7) this).aString53);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	void method351(String string) {
		((Class7) this).aString53 = string;
		((Class7) this).anInetAddress54 = null;
		((Class7) this).aLong52 = -1357056565336257481L;
		if (null != ((Class7) this).aString53) {
			try {
				((Class7) this).anInetAddress54 = InetAddress.getByName(((Class7) this).aString53);
			} catch (UnknownHostException unknownhostexception) {
				/* empty */
			}
		}
	}

	long method352() {
		return -2718567541499767175L * ((Class7) this).aLong52;
	}

	void method353() {
		((Class7) this).aBool55 = false;
	}

	void method354(int i) {
		if (null != ((Class7) this).anInetAddress54) {
			try {
				byte[] is = ((Class7) this).anInetAddress54.getAddress();
				((Class7) this).aLong52 = (long) Ping.method747(is[0], is[1], is[2], is[3], 10000L) * 1357056565336257481L;
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class89.method1504(1000L);
	}

	public void method355() {
		while (((Class7) this).aBool55)
			method354(1557414739);
	}

	Class7() {
		/* empty */
	}

	static void method356(CS2Executor class527, int i) {
		class527.intStack[1942118537 * class527.intStackPtr - 1] = (IndexLoaders.aClass242_4922.method4156((class527.intStack[class527.intStackPtr * 1942118537 - 1]), -1396181317).anInt2958) * 792259457;
	}
}
