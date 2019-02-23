import jaclib.ping.Ping;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class7 implements Runnable {

	static int anInt56;
	String aString53;
	InetAddress anInetAddress54;
	volatile long aLong52 = -1L;
	volatile boolean aBool55 = true;

	void method346(String string_1, int i_2) {
		this.aString53 = string_1;
		this.anInetAddress54 = null;
		this.aLong52 = -1L;
		if (this.aString53 != null) {
			try {
				this.anInetAddress54 = InetAddress.getByName(this.aString53);
			} catch (UnknownHostException unknownhostexception_4) {
				;
			}
		}

	}

	void method347(int i_1) {
		this.aBool55 = false;
	}

	public void run() {
		while (this.aBool55) {
			this.method354(2084342034);
		}

	}

	long method349(byte b_1) {
		return this.aLong52;
	}

	void method354(int i_1) {
		if (this.anInetAddress54 != null) {
			try {
				byte[] bytes_2 = this.anInetAddress54.getAddress();
				this.aLong52 = (long) Ping.method747(bytes_2[0], bytes_2[1], bytes_2[2], bytes_2[3], 10000L);
			} catch (Throwable throwable_3) {
				;
			}
		}

		Class89.method1504(1000L);
	}

	static void method356(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[cs2executor_0.intStackPtr - 1] = IndexLoaders.aClass242_4922.method4156(cs2executor_0.intStack[cs2executor_0.intStackPtr - 1], -1396181317).anInt2958;
	}

}
