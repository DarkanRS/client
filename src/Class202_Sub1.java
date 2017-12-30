
/* Class202_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class202_Sub1 extends Class202 {
	Class286 aClass286_8183;
	Socket aSocket8184;
	Class289 aClass289_8185;
	public static Class282_Sub4 aClass282_Sub4_8186;

	public int method3312(int i) throws IOException {
		return ((Class202_Sub1) this).aClass286_8183.method5034(675588453);
	}

	public boolean method3315(int i, byte i_0_) throws IOException {
		return ((Class202_Sub1) this).aClass286_8183.method5030(i, 140362254);
	}

	public void method3330() {
		((Class202_Sub1) this).aClass289_8185.method5094(1533379991);
		try {
			((Class202_Sub1) this).aSocket8184.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class202_Sub1) this).aClass286_8183.method5042(1037256692);
	}

	public int method3327(byte[] is, int i, int i_1_, int i_2_) throws IOException {
		return ((Class202_Sub1) this).aClass286_8183.method5043(is, i, i_1_, -1812586359);
	}

	public void method3311(byte[] is, int i, int i_3_, int i_4_) throws IOException {
		((Class202_Sub1) this).aClass289_8185.method5087(is, i, i_3_, -2123189080);
	}

	public void finalize() {
		method3318(-282508161);
	}

	public void method3320(byte i) {
		((Class202_Sub1) this).aClass286_8183.method5031(-358652405);
		((Class202_Sub1) this).aClass289_8185.method5089((byte) 93);
	}

	public void method3310() {
		((Class202_Sub1) this).aClass289_8185.method5094(-315048026);
		try {
			((Class202_Sub1) this).aSocket8184.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class202_Sub1) this).aClass286_8183.method5042(-310821679);
	}

	void method13492() {
		method3318(-1414931214);
	}

	void method13493() {
		method3318(1733561420);
	}

	public boolean method3328(int i) throws IOException {
		return ((Class202_Sub1) this).aClass286_8183.method5030(i, 616390569);
	}

	public void method3332() {
		((Class202_Sub1) this).aClass286_8183.method5031(-358652405);
		((Class202_Sub1) this).aClass289_8185.method5089((byte) 109);
	}

	public void method3333() {
		((Class202_Sub1) this).aClass286_8183.method5031(-358652405);
		((Class202_Sub1) this).aClass289_8185.method5089((byte) 11);
	}

	public boolean method3329(int i) throws IOException {
		return ((Class202_Sub1) this).aClass286_8183.method5030(i, 2048228153);
	}

	public boolean method3321(int i) throws IOException {
		return ((Class202_Sub1) this).aClass286_8183.method5030(i, -107857674);
	}

	public int method3322() throws IOException {
		return ((Class202_Sub1) this).aClass286_8183.method5034(675588453);
	}

	public int method3323() throws IOException {
		return ((Class202_Sub1) this).aClass286_8183.method5034(675588453);
	}

	public int method3324(byte[] is, int i, int i_5_) throws IOException {
		return ((Class202_Sub1) this).aClass286_8183.method5043(is, i, i_5_, -944362593);
	}

	public void method3325(byte[] is, int i, int i_6_) throws IOException {
		((Class202_Sub1) this).aClass289_8185.method5087(is, i, i_6_, -1840053185);
	}

	public void method3326(byte[] is, int i, int i_7_) throws IOException {
		((Class202_Sub1) this).aClass289_8185.method5087(is, i, i_7_, -1850876885);
	}

	Class202_Sub1(Socket socket, int i) throws IOException {
		((Class202_Sub1) this).aSocket8184 = socket;
		((Class202_Sub1) this).aSocket8184.setSoTimeout(30000);
		((Class202_Sub1) this).aSocket8184.setTcpNoDelay(true);
		((Class202_Sub1) this).aClass286_8183 = new Class286(((Class202_Sub1) this).aSocket8184.getInputStream(), i);
		((Class202_Sub1) this).aClass289_8185 = new Class289(((Class202_Sub1) this).aSocket8184.getOutputStream(), i);
	}

	public void method3316() {
		((Class202_Sub1) this).aClass289_8185.method5094(1106310151);
		try {
			((Class202_Sub1) this).aSocket8184.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class202_Sub1) this).aClass286_8183.method5042(-1304432726);
	}

	public void method3318(int i) {
		((Class202_Sub1) this).aClass289_8185.method5094(900325637);
		try {
			((Class202_Sub1) this).aSocket8184.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class202_Sub1) this).aClass286_8183.method5042(1120679627);
	}

	public boolean method3317(int i) throws IOException {
		return ((Class202_Sub1) this).aClass286_8183.method5030(i, 1384301076);
	}

	public void method3331() {
		((Class202_Sub1) this).aClass286_8183.method5031(-358652405);
		((Class202_Sub1) this).aClass289_8185.method5089((byte) 69);
	}

	public boolean method3319(int i) throws IOException {
		return ((Class202_Sub1) this).aClass286_8183.method5030(i, 1764967239);
	}

	public void method3314() {
		((Class202_Sub1) this).aClass289_8185.method5094(2033958494);
		try {
			((Class202_Sub1) this).aSocket8184.close();
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class202_Sub1) this).aClass286_8183.method5042(-1480562152);
	}

	static final void method13494(CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class311.aString3643 != null && Class311.aString3643.equalsIgnoreCase(string))
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}
}
