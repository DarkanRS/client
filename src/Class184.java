import java.io.IOException;

public class Class184 {

	IncomingPacket aClass375_2278;
	public IsaacCipher isaac;
	IncomingPacket aClass375_2291;
	IsaacCipher aClass432_2295;
	IncomingPacket aClass375_2296;
	static int anInt2300;
	int anInt2297;
	public int anInt2290 = 0;
	int anInt2279 = 0;
	Class202 aClass202_2281;
	NodeCollection aClass482_2280 = new NodeCollection();
	RsByteBuffer aClass282_Sub35_2282 = new RsByteBuffer(1600);
	RsBitsBuffer recievedBuffer = new RsBitsBuffer(15000);
	IncomingPacket aClass375_2286 = null;
	int anInt2287 = 0;
	boolean aBool2288 = true;
	int anInt2289 = 0;
	public boolean aBool2298 = false;
	Class7 aClass7_2299 = new Class7();
	int anInt2293;
	int anInt2294;
	int anInt2292;

	public final void method3047(int i_1) throws IOException {
		if (this.aClass202_2281 != null && this.anInt2279 > 0) {
			this.aClass282_Sub35_2282.index = 0;

			while (true) {
				TCPMessage tcpmessage_2 = (TCPMessage) this.aClass482_2280.head((byte) 41);
				if (tcpmessage_2 == null || tcpmessage_2.anInt7680 > this.aClass282_Sub35_2282.buffer.length - this.aClass282_Sub35_2282.index) {
					this.aClass202_2281.method3311(this.aClass282_Sub35_2282.buffer, 0, this.aClass282_Sub35_2282.index, -771843978);
					this.anInt2297 += this.aClass282_Sub35_2282.index;
					this.anInt2290 = 0;
					break;
				}

				this.aClass282_Sub35_2282.writeBytes(tcpmessage_2.buffer.buffer, 0, tcpmessage_2.anInt7680);
				this.anInt2279 -= tcpmessage_2.anInt7680;
				tcpmessage_2.remove();
				tcpmessage_2.buffer.method13059(1420319429);
				tcpmessage_2.method12360(-923048057);
			}
		}

	}

	public final void method3049(TCPMessage tcpmessage_1, int i_2) {
		this.aClass482_2280.append(tcpmessage_1, 1467393733);
		tcpmessage_1.anInt7680 = tcpmessage_1.buffer.index;
		tcpmessage_1.buffer.index = 0;
		this.anInt2279 += tcpmessage_1.anInt7680;
	}

	void method3050(Class202 class202_1, String string_2, byte b_3) {
		this.aClass202_2281 = class202_1;
		this.aClass7_2299.method346(string_2, -181392292);
	}

	void method3051(byte b_1) {
		if (this.aClass202_2281 != null) {
			this.aClass202_2281.method3318(-1281215468);
			this.aClass202_2281 = null;
		}

		this.aClass7_2299.method346((String) null, -1992601565);
	}

	public Class202 method3053(byte b_1) {
		return this.aClass202_2281;
	}

	final void method3054(short s_1) {
		this.aClass482_2280.method8118(132408970);
		this.anInt2279 = 0;
	}

	Class184() {
		Thread thread_1 = new Thread(this.aClass7_2299);
		thread_1.setPriority(1);
		thread_1.start();
	}

	void method3059(int i_1) {
		if (client.cycles % 50 == 0) {
			this.anInt2293 = this.anInt2297;
			this.anInt2297 = 0;
			this.anInt2294 = this.anInt2292;
			this.anInt2292 = 0;
		}

	}

	void method3061(int i_1) {
		this.aClass202_2281 = null;
		this.aClass7_2299.method346((String) null, 958256601);
	}

	static final void method3064(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 73);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class175.method2960(icomponentdefinitions_3, interface_4, cs2executor_0, 1289929299);
	}

	static final void method3065(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 93);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1423;
	}

	static final void method3066(CS2Executor cs2executor_0, int i_1) {
		if (Class475.aBool5623) {
			Class467[] arr_2 = Class405.method6825((byte) -71);
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = arr_2.length;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	static final void method3067(CS2Executor cs2executor_0, int i_1) {
		Class337.method6018(cs2executor_0.animable, cs2executor_0, 1557948152);
	}

	static final void method3068(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class60.method1169((char) i_2, (byte) 65) ? 1 : 0;
	}

	static void method3069(int i_0, int i_1, int i_2) {
		Class282_Sub50_Sub12 class282_sub50_sub12_3 = Engine.getIComponentVar(5, (long) i_0);
		class282_sub50_sub12_3.method14995(401383109);
		class282_sub50_sub12_3.anInt9668 = i_1;
	}

}
