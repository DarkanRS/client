
/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class184 {
	IncomingPacket aClass375_2278;
	int anInt2279;
	NodeCollection aClass482_2280 = new NodeCollection();
	Class202 aClass202_2281;
	RsByteBuffer aClass282_Sub35_2282;
	public IsaacCipher isaac;
	RsBitsBuffer recievedBuffer;
	static final int anInt2285 = 15000;
	IncomingPacket aClass375_2286;
	int anInt2287;
	boolean aBool2288;
	int anInt2289;
	public int anInt2290;
	IncomingPacket aClass375_2291;
	int anInt2292;
	int anInt2293;
	int anInt2294;
	IsaacCipher aClass432_2295;
	IncomingPacket aClass375_2296;
	int anInt2297;
	public boolean aBool2298;
	Class7 aClass7_2299;
	static int anInt2300;

	void method3045() {
		((Class184) this).aClass202_2281 = null;
		((Class184) this).aClass7_2299.method346(null, -997048512);
	}

	void method3046() {
		((Class184) this).aClass202_2281 = null;
		((Class184) this).aClass7_2299.method346(null, -1147859221);
	}

	public final void method3047(int i) throws IOException {
		if (null != ((Class184) this).aClass202_2281 && ((Class184) this).anInt2279 * -99760051 > 0) {
			((Class184) this).aClass282_Sub35_2282.index = 0;
			for (;;) {
				TCPMessage class282_sub23 = ((TCPMessage) ((Class184) this).aClass482_2280.head((byte) 41));
				if (class282_sub23 == null || (class282_sub23.anInt7680 * -766688357 > ((((Class184) this).aClass282_Sub35_2282.buffer).length - -1990677291 * (((Class184) this).aClass282_Sub35_2282.index))))
					break;
				((Class184) this).aClass282_Sub35_2282.writeBytes(class282_sub23.buffer.buffer, 0, class282_sub23.anInt7680 * -766688357);
				((Class184) this).anInt2279 -= 2072817543 * class282_sub23.anInt7680;
				class282_sub23.remove();
				class282_sub23.buffer.method13059(1420319429);
				class282_sub23.method12360(-923048057);
			}
			((Class184) this).aClass202_2281.method3311(((Class184) this).aClass282_Sub35_2282.buffer, 0, (-1990677291 * ((Class184) this).aClass282_Sub35_2282.index), -771843978);
			((Class184) this).anInt2297 += (297016231 * ((Class184) this).aClass282_Sub35_2282.index);
			anInt2290 = 0;
		}
	}

	final void method3048() {
		((Class184) this).aClass482_2280.method8118(748859075);
		((Class184) this).anInt2279 = 0;
	}

	public final void method3049(TCPMessage class282_sub23, int i) {
		((Class184) this).aClass482_2280.append(class282_sub23, 1467393733);
		class282_sub23.anInt7680 = -115904433 * class282_sub23.buffer.index;
		class282_sub23.buffer.index = 0;
		((Class184) this).anInt2279 += class282_sub23.anInt7680 * 2072817543;
	}

	void method3050(Class202 class202, String string, byte i) {
		((Class184) this).aClass202_2281 = class202;
		((Class184) this).aClass7_2299.method346(string, -181392292);
	}

	void method3051(byte i) {
		if (null != ((Class184) this).aClass202_2281) {
			((Class184) this).aClass202_2281.method3318(-1281215468);
			((Class184) this).aClass202_2281 = null;
		}
		((Class184) this).aClass7_2299.method346(null, -1992601565);
	}

	void method3052() {
		if (0 == -1809259861 * client.cycles % 50) {
			((Class184) this).anInt2293 = ((Class184) this).anInt2297 * 973480959;
			((Class184) this).anInt2297 = 0;
			((Class184) this).anInt2294 = ((Class184) this).anInt2292 * -1790100339;
			((Class184) this).anInt2292 = 0;
		}
	}

	public Class202 method3053(byte i) {
		return ((Class184) this).aClass202_2281;
	}

	final void method3054(short i) {
		((Class184) this).aClass482_2280.method8118(132408970);
		((Class184) this).anInt2279 = 0;
	}

	public final void method3055() throws IOException {
		if (null != ((Class184) this).aClass202_2281 && ((Class184) this).anInt2279 * -99760051 > 0) {
			((Class184) this).aClass282_Sub35_2282.index = 0;
			for (;;) {
				TCPMessage class282_sub23 = (TCPMessage) ((Class184) this).aClass482_2280.head((byte) 104);
				if (class282_sub23 == null || (class282_sub23.anInt7680 * -766688357 > ((((Class184) this).aClass282_Sub35_2282.buffer).length - -1990677291 * (((Class184) this).aClass282_Sub35_2282.index))))
					break;
				((Class184) this).aClass282_Sub35_2282.writeBytes(class282_sub23.buffer.buffer, 0, class282_sub23.anInt7680 * -766688357);
				((Class184) this).anInt2279 -= 2072817543 * class282_sub23.anInt7680;
				class282_sub23.remove();
				class282_sub23.buffer.method13059(1701861837);
				class282_sub23.method12360(-1158414947);
			}
			((Class184) this).aClass202_2281.method3311(((Class184) this).aClass282_Sub35_2282.buffer, 0, (-1990677291 * ((Class184) this).aClass282_Sub35_2282.index), -1139030272);
			((Class184) this).anInt2297 += (297016231 * ((Class184) this).aClass282_Sub35_2282.index);
			anInt2290 = 0;
		}
	}

	public final void method3056() throws IOException {
		if (null != ((Class184) this).aClass202_2281 && ((Class184) this).anInt2279 * -99760051 > 0) {
			((Class184) this).aClass282_Sub35_2282.index = 0;
			for (;;) {
				TCPMessage class282_sub23 = (TCPMessage) ((Class184) this).aClass482_2280.head((byte) 114);
				if (class282_sub23 == null || (class282_sub23.anInt7680 * -766688357 > ((((Class184) this).aClass282_Sub35_2282.buffer).length - -1990677291 * (((Class184) this).aClass282_Sub35_2282.index))))
					break;
				((Class184) this).aClass282_Sub35_2282.writeBytes(class282_sub23.buffer.buffer, 0, class282_sub23.anInt7680 * -766688357);
				((Class184) this).anInt2279 -= 2072817543 * class282_sub23.anInt7680;
				class282_sub23.remove();
				class282_sub23.buffer.method13059(1721372976);
				class282_sub23.method12360(-1410304456);
			}
			((Class184) this).aClass202_2281.method3311(((Class184) this).aClass282_Sub35_2282.buffer, 0, (-1990677291 * ((Class184) this).aClass282_Sub35_2282.index), -685901287);
			((Class184) this).anInt2297 += (297016231 * ((Class184) this).aClass282_Sub35_2282.index);
			anInt2290 = 0;
		}
	}

	Class184() {
		((Class184) this).anInt2279 = 0;
		((Class184) this).aClass282_Sub35_2282 = new RsByteBuffer(1600);
		((Class184) this).recievedBuffer = new RsBitsBuffer(15000);
		((Class184) this).aClass375_2286 = null;
		((Class184) this).anInt2287 = 0;
		((Class184) this).aBool2288 = true;
		((Class184) this).anInt2289 = 0;
		anInt2290 = 0;
		aBool2298 = false;
		((Class184) this).aClass7_2299 = new Class7();
		Thread thread = new Thread(((Class184) this).aClass7_2299);
		thread.setPriority(1);
		thread.start();
	}

	public final void method3057(TCPMessage class282_sub23) {
		((Class184) this).aClass482_2280.append(class282_sub23, 543008654);
		class282_sub23.anInt7680 = -115904433 * class282_sub23.buffer.index;
		class282_sub23.buffer.index = 0;
		((Class184) this).anInt2279 += class282_sub23.anInt7680 * 2072817543;
	}

	public final void method3058(TCPMessage class282_sub23) {
		((Class184) this).aClass482_2280.append(class282_sub23, -1756231606);
		class282_sub23.anInt7680 = -115904433 * class282_sub23.buffer.index;
		class282_sub23.buffer.index = 0;
		((Class184) this).anInt2279 += class282_sub23.anInt7680 * 2072817543;
	}

	void method3059(int i) {
		if (0 == -1809259861 * client.cycles % 50) {
			((Class184) this).anInt2293 = ((Class184) this).anInt2297 * 973480959;
			((Class184) this).anInt2297 = 0;
			((Class184) this).anInt2294 = ((Class184) this).anInt2292 * -1790100339;
			((Class184) this).anInt2292 = 0;
		}
	}

	void method3060() {
		if (0 == -1809259861 * client.cycles % 50) {
			((Class184) this).anInt2293 = ((Class184) this).anInt2297 * 973480959;
			((Class184) this).anInt2297 = 0;
			((Class184) this).anInt2294 = ((Class184) this).anInt2292 * -1790100339;
			((Class184) this).anInt2292 = 0;
		}
	}

	void method3061(int i) {
		((Class184) this).aClass202_2281 = null;
		((Class184) this).aClass7_2299.method346(null, 958256601);
	}

	public final void method3062(TCPMessage class282_sub23) {
		((Class184) this).aClass482_2280.append(class282_sub23, -1560002099);
		class282_sub23.anInt7680 = -115904433 * class282_sub23.buffer.index;
		class282_sub23.buffer.index = 0;
		((Class184) this).anInt2279 += class282_sub23.anInt7680 * 2072817543;
	}

	public Class202 method3063() {
		return ((Class184) this).aClass202_2281;
	}

	static final void method3064(CS2Executor class527, short i) {
		int i_0_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_0_, (byte) 73);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_0_ >> 16];
		Class175.method2960(class118, class98, class527, 1289929299);
	}

	static final void method3065(CS2Executor class527, int i) {
		int i_1_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_1_, (byte) 93);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class118.anInt1423 * -169127141;
	}

	static final void method3066(CS2Executor class527, int i) {
		if (Class475.aBool5623) {
			Class467[] class467s = Class405.method6825((byte) -71);
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = class467s.length;
		} else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method3067(CS2Executor class527, int i) {
		Class337.method6018((class527.animable), class527, 1557948152);
	}

	static final void method3068(CS2Executor class527, int i) {
		int i_2_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class60.method1169((char) i_2_, (byte) 65) ? 1 : 0;
	}

	static void method3069(int i, int i_3_, int i_4_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(5, (long) i);
		class282_sub50_sub12.method14995(401383109);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = i_3_ * -1773141545;
	}
}
