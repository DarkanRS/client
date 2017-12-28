/* Class41_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class41_Sub1 extends Class41 {
	int[] anIntArray9201;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9202;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9203;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9204;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9205;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9206;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9207;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9208;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9209;
	static final int anInt9210 = 1;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9211;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9212;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9213;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9214;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9215;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9216;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9217;
	protected Class101 aClass101_9218;
	static final int anInt9219 = 2;
	static final int anInt9220 = 4;
	static final int anInt9221 = 8;
	static final int anInt9222 = 16;
	static final int anInt9223 = 32;
	static final int anInt9224 = 64;
	static final int anInt9225 = 128;
	int anInt9226;
	Class384[] aClass384Array9227;
	static Class384 aClass384_9228 = new Class384();
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9229;
	float[] aFloatArray9230 = new float[3];

	void method877() {
		/* empty */
	}

	boolean method14523(String string) throws Exception_Sub2 {
		aClass101_9218 = aClass505_Sub2_413.method13890(string);
		if (aClass101_9218 == null)
			throw new Exception_Sub2("");
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9212 = aClass101_9218.method1681("textureMatrix", (byte) 18);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9211 = aClass101_9218.method1681("modelMatrix", (byte) -24);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9204 = aClass101_9218.method1681("viewMatrix", (byte) -52);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9202 = aClass101_9218.method1681("projectionMatrix", (byte) -50);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9207 = aClass101_9218.method1681("modelViewMatrix", (byte) 33);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9208 = aClass101_9218.method1681("modelViewProjectionMatrix", (byte) 81);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9216 = aClass101_9218.method1681("viewProjectionMatrix", (byte) -33);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9229 = aClass101_9218.method1681("ambientColour", (byte) -14);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9209 = aClass101_9218.method1681("sunDirection", (byte) 68);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9214 = aClass101_9218.method1681("sunColour", (byte) 81);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9215 = aClass101_9218.method1681("antiSunColour", (byte) -7);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9217 = aClass101_9218.method1681("sunExponent", (byte) -20);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9213 = aClass101_9218.method1681("eyePosition", (byte) -36);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9203 = aClass101_9218.method1681("eyePositionOS", (byte) 7);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9205 = aClass101_9218.method1681("sunDirectionOS", (byte) 39);
		if (!method14524()) {
			aClass101_9218 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9212 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9211 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9204 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9202 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9207 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9208 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9216 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9229 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9209 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9214 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9215 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9217 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9213 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9203 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9205 = null;
			return false;
		}
		if (aClass101_9218.method1656(413496416) == null) {
			Class115 class115 = aClass101_9218.method1654(604973216);
			if (class115 == null)
				throw new Exception_Sub2(new StringBuilder().append(aClass101_9218.method1717(40421350)).append("").toString());
			aClass101_9218.method1655(class115);
		}
		((Class41_Sub1) this).anInt9226 = aClass101_9218.method1650(1800341695);
		((Class41_Sub1) this).anIntArray9201 = new int[((Class41_Sub1) this).anInt9226];
		return true;
	}

	abstract boolean method14524() throws Exception_Sub2;

	void method14525(int i, Class294 class294) {
		if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9205 != null) {
			float[] fs = { aClass505_Sub2_413.aFloatArray8747[0], aClass505_Sub2_413.aFloatArray8747[1], aClass505_Sub2_413.aFloatArray8747[2] };
			class294.method5230(fs);
			aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9205), fs[0], fs[1], fs[2], (byte) -50);
		}
	}

	void method14526() {
		method14530(aClass505_Sub2_413.aBool8684);
		method14527(aClass505_Sub2_413.method13884());
		method14528();
		method877();
	}

	void method885() {
		if (aClass101_9218 != null)
			aClass101_9218.method1647();
	}

	void method14527(Class384 class384) {
		if (aClass101_9218 != null && aClass101_9218.method1648() && aClass505_Sub2_413.method13963() == 0) {
			int i = aClass101_9218.method1714(-1997910663);
			if ((((Class41_Sub1) this).anIntArray9201[i] & 0x80) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9212 != null) {
				aClass101_9218.method1667((((Class41_Sub1) this).aClass282_Sub21_Sub1_9212), class384, 1796891625);
				((Class41_Sub1) this).anIntArray9201[i] &= ~0x80;
			}
		}
	}

	void method14528() {
		if (aClass101_9218 != null && aClass101_9218.method1648()) {
			int i = aClass101_9218.method1714(-2137286253);
			int i_0_ = ((Class41_Sub1) this).anIntArray9201[i];
			if ((i_0_ & 0x1) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9211 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9211), aClass505_Sub2_413.method14036(), (byte) -54);
			if ((i_0_ & 0x2) != 0) {
				if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9204 != null)
					aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9204), aClass505_Sub2_413.method14126(), (byte) -33);
				if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9213 != null) {
					((Class41_Sub1) this).aFloatArray9230[0] = 0.0F;
					((Class41_Sub1) this).aFloatArray9230[1] = 0.0F;
					((Class41_Sub1) this).aFloatArray9230[2] = 0.0F;
					aClass505_Sub2_413.method8458().method5228(((Class41_Sub1) this).aFloatArray9230[0], ((Class41_Sub1) this).aFloatArray9230[1], ((Class41_Sub1) this).aFloatArray9230[2], ((Class41_Sub1) this).aFloatArray9230);
					aClass101_9218.method1661(((Class41_Sub1) this).aClass282_Sub21_Sub1_9213, ((Class41_Sub1) this).aFloatArray9230[0], ((Class41_Sub1) this).aFloatArray9230[1], ((Class41_Sub1) this).aFloatArray9230[2], (byte) -104);
				}
			}
			if ((i_0_ & 0x10) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9207 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9207), aClass505_Sub2_413.method13930(), (byte) -45);
			if ((i_0_ & 0x8) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9206 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9206), aClass505_Sub2_413.method13998(), (byte) -72);
			if ((i_0_ & 0x4) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9202 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9202), aClass505_Sub2_413.method13912(), (byte) -67);
			if ((i_0_ & 0x20) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9208 != null) {
				aClass384_9228.method6568(aClass505_Sub2_413.method13930(), aClass505_Sub2_413.method13912());
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9208), aClass384_9228, (byte) -54);
			}
			if ((i_0_ & 0x40) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9216 != null) {
				aClass384_9228.method6568(aClass505_Sub2_413.method14126(), aClass505_Sub2_413.method13912());
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9216), aClass384_9228, (byte) -94);
			}
			if (aClass505_Sub2_413.method13963() == 0 && (((Class41_Sub1) this).anIntArray9201[i] & 0x80) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9212 != null) {
				aClass101_9218.method1667((((Class41_Sub1) this).aClass282_Sub21_Sub1_9212), aClass505_Sub2_413.method13884(), 56632045);
				((Class41_Sub1) this).anIntArray9201[i] &= ~0x80;
			}
			((Class41_Sub1) this).anIntArray9201[i] = 0;
		}
	}

	void method14529(int i, Class294 class294) {
		if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9203 != null) {
			Class384 class384 = aClass505_Sub2_413.method13998();
			float[] fs = { class384.aFloatArray4667[12], class384.aFloatArray4667[13], class384.aFloatArray4667[14] };
			float[] fs_1_ = { 0.0F, 0.0F, 0.0F };
			class384.method6528(fs_1_);
			float[] fs_2_ = { 0.0F, 0.0F, 0.0F };
			aClass505_Sub2_413.method8458().method5226(0.0F, 0.0F, 0.0F, fs_2_);
			class294.method5243(fs);
			aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9203), fs[0], fs[1], fs[2], (byte) -92);
		}
	}

	void method886() {
		method14532(Class294.aClass294_3518);
	}

	void method14530(boolean bool) {
		if (aClass101_9218 != null && aClass101_9218.method1648()) {
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9229 != null)
				aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9229), (aClass505_Sub2_413.aFloat8766 * aClass505_Sub2_413.aFloat8769), (aClass505_Sub2_413.aFloat8767 * aClass505_Sub2_413.aFloat8769), (aClass505_Sub2_413.aFloat8768 * aClass505_Sub2_413.aFloat8769), (byte) -107);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9209 != null)
				aClass101_9218.method1661(((Class41_Sub1) this).aClass282_Sub21_Sub1_9209, aClass505_Sub2_413.aFloatArray8747[0], aClass505_Sub2_413.aFloatArray8747[1], aClass505_Sub2_413.aFloatArray8747[2], (byte) -123);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9214 != null)
				aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9214), (aClass505_Sub2_413.aFloat8766 * aClass505_Sub2_413.aFloat8770), (aClass505_Sub2_413.aFloat8767 * aClass505_Sub2_413.aFloat8770), (aClass505_Sub2_413.aFloat8768 * aClass505_Sub2_413.aFloat8770), (byte) -113);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9215 != null)
				aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9215), (-aClass505_Sub2_413.aFloat8766 * aClass505_Sub2_413.aFloat8826), (-aClass505_Sub2_413.aFloat8767 * aClass505_Sub2_413.aFloat8826), (-aClass505_Sub2_413.aFloat8768 * aClass505_Sub2_413.aFloat8826), (byte) -35);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9217 != null)
				aClass101_9218.method1659((((Class41_Sub1) this).aClass282_Sub21_Sub1_9217), 64.0F + Math.abs(aClass505_Sub2_413.aFloatArray8747[1]) * 928.0F, (short) 25645);
		}
	}

	void method879() {
		method14532(Class294.aClass294_3518);
	}

	void method14531(boolean bool) {
		if (aClass101_9218 != null && aClass101_9218.method1648()) {
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9229 != null)
				aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9229), (aClass505_Sub2_413.aFloat8766 * aClass505_Sub2_413.aFloat8769), (aClass505_Sub2_413.aFloat8767 * aClass505_Sub2_413.aFloat8769), (aClass505_Sub2_413.aFloat8768 * aClass505_Sub2_413.aFloat8769), (byte) -114);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9209 != null)
				aClass101_9218.method1661(((Class41_Sub1) this).aClass282_Sub21_Sub1_9209, aClass505_Sub2_413.aFloatArray8747[0], aClass505_Sub2_413.aFloatArray8747[1], aClass505_Sub2_413.aFloatArray8747[2], (byte) -53);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9214 != null)
				aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9214), (aClass505_Sub2_413.aFloat8766 * aClass505_Sub2_413.aFloat8770), (aClass505_Sub2_413.aFloat8767 * aClass505_Sub2_413.aFloat8770), (aClass505_Sub2_413.aFloat8768 * aClass505_Sub2_413.aFloat8770), (byte) -43);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9215 != null)
				aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9215), (-aClass505_Sub2_413.aFloat8766 * aClass505_Sub2_413.aFloat8826), (-aClass505_Sub2_413.aFloat8767 * aClass505_Sub2_413.aFloat8826), (-aClass505_Sub2_413.aFloat8768 * aClass505_Sub2_413.aFloat8826), (byte) -30);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9217 != null)
				aClass101_9218.method1659((((Class41_Sub1) this).aClass282_Sub21_Sub1_9217), 64.0F + Math.abs(aClass505_Sub2_413.aFloatArray8747[1]) * 928.0F, (short) 3996);
		}
	}

	void method14532(Class294 class294) {
		Class384 class384 = aClass505_Sub2_413.aClass384_8683;
		class384.method6522(class294);
		int i = aClass101_9218.method1714(-1934547708);
		if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9211 != null) {
			aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9211), class384, (byte) -59);
			((Class41_Sub1) this).anIntArray9201[i] &= ~0x1;
		}
		if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9207 != null) {
			aClass384_9228.method6568(class384, aClass505_Sub2_413.method14126());
			aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9207), aClass384_9228, (byte) -4);
			((Class41_Sub1) this).anIntArray9201[i] &= ~0x10;
		}
		if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9208 != null) {
			aClass384_9228.method6568(class384, aClass505_Sub2_413.method13931());
			aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9208), aClass384_9228, (byte) -61);
			((Class41_Sub1) this).anIntArray9201[i] &= ~0x20;
		}
		method14529(i, class294);
		method14549(i, class294);
	}

	void method14533() {
		if (aClass101_9218 != null && aClass101_9218.method1648()) {
			int i = aClass101_9218.method1714(-2082236826);
			int i_3_ = ((Class41_Sub1) this).anIntArray9201[i];
			if ((i_3_ & 0x1) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9211 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9211), aClass505_Sub2_413.method14036(), (byte) -117);
			if ((i_3_ & 0x2) != 0) {
				if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9204 != null)
					aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9204), aClass505_Sub2_413.method14126(), (byte) -86);
				if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9213 != null) {
					((Class41_Sub1) this).aFloatArray9230[0] = 0.0F;
					((Class41_Sub1) this).aFloatArray9230[1] = 0.0F;
					((Class41_Sub1) this).aFloatArray9230[2] = 0.0F;
					aClass505_Sub2_413.method8458().method5228(((Class41_Sub1) this).aFloatArray9230[0], ((Class41_Sub1) this).aFloatArray9230[1], ((Class41_Sub1) this).aFloatArray9230[2], ((Class41_Sub1) this).aFloatArray9230);
					aClass101_9218.method1661(((Class41_Sub1) this).aClass282_Sub21_Sub1_9213, ((Class41_Sub1) this).aFloatArray9230[0], ((Class41_Sub1) this).aFloatArray9230[1], ((Class41_Sub1) this).aFloatArray9230[2], (byte) -4);
				}
			}
			if ((i_3_ & 0x10) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9207 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9207), aClass505_Sub2_413.method13930(), (byte) -18);
			if ((i_3_ & 0x8) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9206 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9206), aClass505_Sub2_413.method13998(), (byte) -90);
			if ((i_3_ & 0x4) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9202 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9202), aClass505_Sub2_413.method13912(), (byte) -48);
			if ((i_3_ & 0x20) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9208 != null) {
				aClass384_9228.method6568(aClass505_Sub2_413.method13930(), aClass505_Sub2_413.method13912());
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9208), aClass384_9228, (byte) -10);
			}
			if ((i_3_ & 0x40) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9216 != null) {
				aClass384_9228.method6568(aClass505_Sub2_413.method14126(), aClass505_Sub2_413.method13912());
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9216), aClass384_9228, (byte) -16);
			}
			if (aClass505_Sub2_413.method13963() == 0 && (((Class41_Sub1) this).anIntArray9201[i] & 0x80) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9212 != null) {
				aClass101_9218.method1667((((Class41_Sub1) this).aClass282_Sub21_Sub1_9212), aClass505_Sub2_413.method13884(), 301749338);
				((Class41_Sub1) this).anIntArray9201[i] &= ~0x80;
			}
			((Class41_Sub1) this).anIntArray9201[i] = 0;
		}
	}

	void method14534(Class384 class384) {
		if (aClass101_9218 != null && aClass101_9218.method1648() && aClass505_Sub2_413.method13963() == 0) {
			int i = aClass101_9218.method1714(-1878862147);
			if ((((Class41_Sub1) this).anIntArray9201[i] & 0x80) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9212 != null) {
				aClass101_9218.method1667((((Class41_Sub1) this).aClass282_Sub21_Sub1_9212), class384, 1543222075);
				((Class41_Sub1) this).anIntArray9201[i] &= ~0x80;
			}
		}
	}

	void method888() {
		aClass101_9218.method1646();
		((Class41_Sub1) this).anIntArray9201[aClass101_9218.method1714(-1896522085)] = -1;
		method14550(0);
		method14526();
	}

	void method874() {
		/* empty */
	}

	void method889() {
		method14532(Class294.aClass294_3518);
	}

	boolean method14535(String string) throws Exception_Sub2 {
		aClass101_9218 = aClass505_Sub2_413.method13890(string);
		if (aClass101_9218 == null)
			throw new Exception_Sub2("");
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9212 = aClass101_9218.method1681("textureMatrix", (byte) -2);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9211 = aClass101_9218.method1681("modelMatrix", (byte) 53);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9204 = aClass101_9218.method1681("viewMatrix", (byte) 34);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9202 = aClass101_9218.method1681("projectionMatrix", (byte) 73);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9207 = aClass101_9218.method1681("modelViewMatrix", (byte) -64);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9208 = aClass101_9218.method1681("modelViewProjectionMatrix", (byte) 47);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9216 = aClass101_9218.method1681("viewProjectionMatrix", (byte) 79);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9229 = aClass101_9218.method1681("ambientColour", (byte) 24);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9209 = aClass101_9218.method1681("sunDirection", (byte) -102);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9214 = aClass101_9218.method1681("sunColour", (byte) 45);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9215 = aClass101_9218.method1681("antiSunColour", (byte) 50);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9217 = aClass101_9218.method1681("sunExponent", (byte) 4);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9213 = aClass101_9218.method1681("eyePosition", (byte) -35);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9203 = aClass101_9218.method1681("eyePositionOS", (byte) 8);
		((Class41_Sub1) this).aClass282_Sub21_Sub1_9205 = aClass101_9218.method1681("sunDirectionOS", (byte) 59);
		if (!method14524()) {
			aClass101_9218 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9212 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9211 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9204 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9202 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9207 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9208 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9216 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9229 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9209 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9214 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9215 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9217 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9213 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9203 = null;
			((Class41_Sub1) this).aClass282_Sub21_Sub1_9205 = null;
			return false;
		}
		if (aClass101_9218.method1656(-1471151638) == null) {
			Class115 class115 = aClass101_9218.method1654(-316613035);
			if (class115 == null)
				throw new Exception_Sub2(new StringBuilder().append(aClass101_9218.method1717(-2040162183)).append("").toString());
			aClass101_9218.method1655(class115);
		}
		((Class41_Sub1) this).anInt9226 = aClass101_9218.method1650(863368);
		((Class41_Sub1) this).anIntArray9201 = new int[((Class41_Sub1) this).anInt9226];
		return true;
	}

	void method884() {
		/* empty */
	}

	void method14536(int i) {
		for (int i_4_ = 0; i_4_ < ((Class41_Sub1) this).anInt9226; i_4_++)
			((Class41_Sub1) this).anIntArray9201[i_4_] |= 128 << i;
	}

	void method14537() {
		method14530(aClass505_Sub2_413.aBool8684);
		method14527(aClass505_Sub2_413.method13884());
		method14528();
		method877();
	}

	void method14538() {
		method14530(aClass505_Sub2_413.aBool8684);
		method14527(aClass505_Sub2_413.method13884());
		method14528();
		method877();
	}

	abstract boolean method14539() throws Exception_Sub2;

	void method14540(Class384 class384) {
		if (aClass101_9218 != null && aClass101_9218.method1648() && aClass505_Sub2_413.method13963() == 0) {
			int i = aClass101_9218.method1714(-2065553030);
			if ((((Class41_Sub1) this).anIntArray9201[i] & 0x80) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9212 != null) {
				aClass101_9218.method1667((((Class41_Sub1) this).aClass282_Sub21_Sub1_9212), class384, 1822587241);
				((Class41_Sub1) this).anIntArray9201[i] &= ~0x80;
			}
		}
	}

	abstract boolean method14541() throws Exception_Sub2;

	void method14542() {
		if (aClass101_9218 != null && aClass101_9218.method1648()) {
			int i = aClass101_9218.method1714(-2087457478);
			int i_5_ = ((Class41_Sub1) this).anIntArray9201[i];
			if ((i_5_ & 0x1) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9211 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9211), aClass505_Sub2_413.method14036(), (byte) -88);
			if ((i_5_ & 0x2) != 0) {
				if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9204 != null)
					aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9204), aClass505_Sub2_413.method14126(), (byte) -54);
				if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9213 != null) {
					((Class41_Sub1) this).aFloatArray9230[0] = 0.0F;
					((Class41_Sub1) this).aFloatArray9230[1] = 0.0F;
					((Class41_Sub1) this).aFloatArray9230[2] = 0.0F;
					aClass505_Sub2_413.method8458().method5228(((Class41_Sub1) this).aFloatArray9230[0], ((Class41_Sub1) this).aFloatArray9230[1], ((Class41_Sub1) this).aFloatArray9230[2], ((Class41_Sub1) this).aFloatArray9230);
					aClass101_9218.method1661(((Class41_Sub1) this).aClass282_Sub21_Sub1_9213, ((Class41_Sub1) this).aFloatArray9230[0], ((Class41_Sub1) this).aFloatArray9230[1], ((Class41_Sub1) this).aFloatArray9230[2], (byte) -3);
				}
			}
			if ((i_5_ & 0x10) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9207 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9207), aClass505_Sub2_413.method13930(), (byte) -103);
			if ((i_5_ & 0x8) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9206 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9206), aClass505_Sub2_413.method13998(), (byte) -32);
			if ((i_5_ & 0x4) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9202 != null)
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9202), aClass505_Sub2_413.method13912(), (byte) -18);
			if ((i_5_ & 0x20) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9208 != null) {
				aClass384_9228.method6568(aClass505_Sub2_413.method13930(), aClass505_Sub2_413.method13912());
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9208), aClass384_9228, (byte) -96);
			}
			if ((i_5_ & 0x40) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9216 != null) {
				aClass384_9228.method6568(aClass505_Sub2_413.method14126(), aClass505_Sub2_413.method13912());
				aClass101_9218.method1668((((Class41_Sub1) this).aClass282_Sub21_Sub1_9216), aClass384_9228, (byte) -39);
			}
			if (aClass505_Sub2_413.method13963() == 0 && (((Class41_Sub1) this).anIntArray9201[i] & 0x80) != 0 && ((Class41_Sub1) this).aClass282_Sub21_Sub1_9212 != null) {
				aClass101_9218.method1667((((Class41_Sub1) this).aClass282_Sub21_Sub1_9212), aClass505_Sub2_413.method13884(), 641700596);
				((Class41_Sub1) this).anIntArray9201[i] &= ~0x80;
			}
			((Class41_Sub1) this).anIntArray9201[i] = 0;
		}
	}

	void method14543(int i, Class294 class294) {
		if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9203 != null) {
			Class384 class384 = aClass505_Sub2_413.method13998();
			float[] fs = { class384.aFloatArray4667[12], class384.aFloatArray4667[13], class384.aFloatArray4667[14] };
			float[] fs_6_ = { 0.0F, 0.0F, 0.0F };
			class384.method6528(fs_6_);
			float[] fs_7_ = { 0.0F, 0.0F, 0.0F };
			aClass505_Sub2_413.method8458().method5226(0.0F, 0.0F, 0.0F, fs_7_);
			class294.method5243(fs);
			aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9203), fs[0], fs[1], fs[2], (byte) -95);
		}
	}

	void method14544(int i, Class294 class294) {
		if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9205 != null) {
			float[] fs = { aClass505_Sub2_413.aFloatArray8747[0], aClass505_Sub2_413.aFloatArray8747[1], aClass505_Sub2_413.aFloatArray8747[2] };
			class294.method5230(fs);
			aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9205), fs[0], fs[1], fs[2], (byte) -1);
		}
	}

	void method873() {
		aClass101_9218.method1646();
		((Class41_Sub1) this).anIntArray9201[aClass101_9218.method1714(-2118159907)] = -1;
		method14550(0);
		method14526();
	}

	void method14545(int i, Class294 class294) {
		if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9205 != null) {
			float[] fs = { aClass505_Sub2_413.aFloatArray8747[0], aClass505_Sub2_413.aFloatArray8747[1], aClass505_Sub2_413.aFloatArray8747[2] };
			class294.method5230(fs);
			aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9205), fs[0], fs[1], fs[2], (byte) -124);
		}
	}

	void method14546(boolean bool) {
		if (aClass101_9218 != null && aClass101_9218.method1648()) {
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9229 != null)
				aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9229), (aClass505_Sub2_413.aFloat8766 * aClass505_Sub2_413.aFloat8769), (aClass505_Sub2_413.aFloat8767 * aClass505_Sub2_413.aFloat8769), (aClass505_Sub2_413.aFloat8768 * aClass505_Sub2_413.aFloat8769), (byte) 0);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9209 != null)
				aClass101_9218.method1661(((Class41_Sub1) this).aClass282_Sub21_Sub1_9209, aClass505_Sub2_413.aFloatArray8747[0], aClass505_Sub2_413.aFloatArray8747[1], aClass505_Sub2_413.aFloatArray8747[2], (byte) -7);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9214 != null)
				aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9214), (aClass505_Sub2_413.aFloat8766 * aClass505_Sub2_413.aFloat8770), (aClass505_Sub2_413.aFloat8767 * aClass505_Sub2_413.aFloat8770), (aClass505_Sub2_413.aFloat8768 * aClass505_Sub2_413.aFloat8770), (byte) -81);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9215 != null)
				aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9215), (-aClass505_Sub2_413.aFloat8766 * aClass505_Sub2_413.aFloat8826), (-aClass505_Sub2_413.aFloat8767 * aClass505_Sub2_413.aFloat8826), (-aClass505_Sub2_413.aFloat8768 * aClass505_Sub2_413.aFloat8826), (byte) -9);
			if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9217 != null)
				aClass101_9218.method1659((((Class41_Sub1) this).aClass282_Sub21_Sub1_9217), 64.0F + Math.abs(aClass505_Sub2_413.aFloatArray8747[1]) * 928.0F, (short) 2902);
		}
	}

	Class41_Sub1(Class505_Sub2 class505_sub2) {
		super(class505_sub2);
		new Class294();
		((Class41_Sub1) this).aClass384Array9227 = new Class384[aClass505_Sub2_413.anInt8825];
		for (int i = 0; i < aClass505_Sub2_413.anInt8825; i++)
			((Class41_Sub1) this).aClass384Array9227[i] = new Class384();
	}

	void method14547(int i) {
		for (int i_8_ = 0; i_8_ < ((Class41_Sub1) this).anInt9226; i_8_++)
			((Class41_Sub1) this).anIntArray9201[i_8_] |= 128 << i;
	}

	void method14548(int i) {
		for (int i_9_ = 0; i_9_ < ((Class41_Sub1) this).anInt9226; i_9_++)
			((Class41_Sub1) this).anIntArray9201[i_9_] |= 128 << i;
	}

	void method14549(int i, Class294 class294) {
		if (((Class41_Sub1) this).aClass282_Sub21_Sub1_9205 != null) {
			float[] fs = { aClass505_Sub2_413.aFloatArray8747[0], aClass505_Sub2_413.aFloatArray8747[1], aClass505_Sub2_413.aFloatArray8747[2] };
			class294.method5230(fs);
			aClass101_9218.method1661((((Class41_Sub1) this).aClass282_Sub21_Sub1_9205), fs[0], fs[1], fs[2], (byte) -97);
		}
	}

	void method14550(int i) {
		((Class41_Sub1) this).aClass384Array9227[0].method6518();
		method14536(i);
	}

	void method14551(int i) {
		((Class41_Sub1) this).aClass384Array9227[0].method6518();
		method14536(i);
	}
}
