import java.io.IOException;
import java.net.Socket;

public class Class202_Sub1 extends Class202 {

	public static Class282_Sub4 aClass282_Sub4_8186;
	Socket aSocket8184;
	Class286 aClass286_8183;
	Class289 aClass289_8185;

	public int method3312(int i_1) throws IOException {
		return this.aClass286_8183.method5034(675588453);
	}

	public boolean available(int i_1, byte b_2) throws IOException {
		return this.aClass286_8183.method5030(i_1, 140362254);
	}

	public void method3330() {
		this.aClass289_8185.method5094(1533379991);

		try {
			this.aSocket8184.close();
		} catch (IOException ioexception_2) {
			;
		}

		this.aClass286_8183.method5042(1037256692);
	}

	public int read(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
		return this.aClass286_8183.method5043(bytes_1, i_2, i_3, -1812586359);
	}

	public void write(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
		this.aClass289_8185.method5087(bytes_1, i_2, i_3, -2123189080);
	}

	public void finalize() {
		this.method3318(-282508161);
	}

	public void method3320(byte b_1) {
		this.aClass286_8183.method5031(-358652405);
		this.aClass289_8185.method5089((byte) 93);
	}

	public void method3310() {
		this.aClass289_8185.method5094(-315048026);

		try {
			this.aSocket8184.close();
		} catch (IOException ioexception_2) {
			;
		}

		this.aClass286_8183.method5042(-310821679);
	}

	public boolean method3328(int i_1) throws IOException {
		return this.aClass286_8183.method5030(i_1, 616390569);
	}

	public void method3332() {
		this.aClass286_8183.method5031(-358652405);
		this.aClass289_8185.method5089((byte) 109);
	}

	public void method3333() {
		this.aClass286_8183.method5031(-358652405);
		this.aClass289_8185.method5089((byte) 11);
	}

	public boolean method3329(int i_1) throws IOException {
		return this.aClass286_8183.method5030(i_1, 2048228153);
	}

	public boolean method3321(int i_1) throws IOException {
		return this.aClass286_8183.method5030(i_1, -107857674);
	}

	public int method3322() throws IOException {
		return this.aClass286_8183.method5034(675588453);
	}

	public int method3323() throws IOException {
		return this.aClass286_8183.method5034(675588453);
	}

	public int method3324(byte[] bytes_1, int i_2, int i_3) throws IOException {
		return this.aClass286_8183.method5043(bytes_1, i_2, i_3, -944362593);
	}

	public void method3325(byte[] bytes_1, int i_2, int i_3) throws IOException {
		this.aClass289_8185.method5087(bytes_1, i_2, i_3, -1840053185);
	}

	public void method3326(byte[] bytes_1, int i_2, int i_3) throws IOException {
		this.aClass289_8185.method5087(bytes_1, i_2, i_3, -1850876885);
	}

	Class202_Sub1(Socket socket_1, int i_2) throws IOException {
		this.aSocket8184 = socket_1;
		this.aSocket8184.setSoTimeout(30000);
		this.aSocket8184.setTcpNoDelay(true);
		this.aClass286_8183 = new Class286(this.aSocket8184.getInputStream(), i_2);
		this.aClass289_8185 = new Class289(this.aSocket8184.getOutputStream(), i_2);
	}

	public void method3316() {
		this.aClass289_8185.method5094(1106310151);

		try {
			this.aSocket8184.close();
		} catch (IOException ioexception_2) {
			;
		}

		this.aClass286_8183.method5042(-1304432726);
	}

	public void method3318(int i_1) {
		this.aClass289_8185.method5094(900325637);

		try {
			this.aSocket8184.close();
		} catch (IOException ioexception_3) {
			;
		}

		this.aClass286_8183.method5042(1120679627);
	}

	public boolean method3317(int i_1) throws IOException {
		return this.aClass286_8183.method5030(i_1, 1384301076);
	}

	public void method3331() {
		this.aClass286_8183.method5031(-358652405);
		this.aClass289_8185.method5089((byte) 69);
	}

	public boolean method3319(int i_1) throws IOException {
		return this.aClass286_8183.method5030(i_1, 1764967239);
	}

	public void method3314() {
		this.aClass289_8185.method5094(2033958494);

		try {
			this.aSocket8184.close();
		} catch (IOException ioexception_2) {
			;
		}

		this.aClass286_8183.method5042(-1480562152);
	}

	static final void method13494(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		if (RegionMap.aString3643 != null && RegionMap.aString3643.equalsIgnoreCase(string_2)) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

}
