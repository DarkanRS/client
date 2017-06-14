/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class322 {
	static Class322 aClass322_3358;
	public Class365_Sub1_Sub1 aClass365_Sub1_Sub1_3359;
	public Class322 aClass322_3360;
	static int anInt3361 = 0;

	Class322() {
		/* empty */
	}

	void method3929(byte i) {
		try {
			if (anInt3361 * -1841279503 < 500) {
				aClass365_Sub1_Sub1_3359 = null;
				aClass322_3360 = aClass322_3358;
				aClass322_3358 = this;
				anInt3361 += -1998519535;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nk.f(").append(')').toString());
		}
	}

	static final void method3930(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (client.aString8804 != null && i_0_ < -1801543887 * Class489.anInt6071)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = Class82_Sub6.aClass7Array6846[i_0_].aString96;
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nk.wv(").append(')').toString());
		}
	}

	public static Class505 method3931(Class243 class243, int i, int i_1_, byte i_2_) {
		try {
			byte[] is = class243.getFile(i, i_1_, (byte) -42);
			if (null == is)
				return null;
			return new Class505(is);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nk.a(").append(')').toString());
		}
	}

	static final void method3932(long l) {
		try {
			if (client.aClass283_8716.method2675(-1611682495) != null) {
				if (4 == -863531439 * Class298_Sub1.anInt7164 || 5 == Class298_Sub1.anInt7164 * -863531439)
					Class491.method6175(l);
				else if (Class298_Sub1.anInt7164 * -863531439 == 2)
					ClientScript2.method4944(l);
			}
			Class152.method1652(Class373.aClass_ra4071, (long) (443738891 * client.anInt8884));
			if (-1 != -257444687 * client.WINDOW_PANE_ID)
				Class443.method5884(-257444687 * client.WINDOW_PANE_ID, -333860368);
			for (int i = 0; i < -112139815 * client.anInt8686; i++) {
				client.aBooleanArray8901[i] = client.aBooleanArray8900[i];
				client.aBooleanArray8900[i] = false;
			}
			client.anInt8832 = client.anInt8884 * -1390800553;
			Class298_Sub32.method3138(-1, -1, (byte) -69);
			if (client.WINDOW_PANE_ID * -257444687 != -1) {
				client.anInt8686 = 0;
				Class104.method1104(1847385357);
			}
			Class373.aClass_ra4071.L();
			Class463.method6013(Class373.aClass_ra4071, (byte) 38);
			int i = Class298_Sub17_Sub4.method2926(695848123);
			if (-1 == i)
				i = client.anInt8937 * -1808468501;
			if (i == -1)
				i = client.anInt8831 * 1203044105;
			Class518.method6314(i, 614001892);
			int i_3_ = (Class287.myPlayer.getSize() << 8);
			Class217 class217 = (Class287.myPlayer.method4337().aClass217_2599);
			Class341.method4144((Class287.myPlayer.plane), i_3_ + (int) class217.aFloat2451, (int) class217.aFloat2454 + i_3_, client.anInt8961 * 614680345, (short) 8192);
			client.anInt8961 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nk.ia(").append(')').toString());
		}
	}

	static RsByteBuffer method3933(int i) {
		try {
			RsByteBuffer class298_sub53 = new RsByteBuffer(518);
			Class360.anIntArray3889 = new int[4];
			Class360.anIntArray3889[0] = (int) (Math.random() * 9.9999999E7);
			Class360.anIntArray3889[1] = (int) (Math.random() * 9.9999999E7);
			Class360.anIntArray3889[2] = (int) (Math.random() * 9.9999999E7);
			Class360.anIntArray3889[3] = (int) (Math.random() * 9.9999999E7);
			class298_sub53.writeByte(10);
			class298_sub53.writeInt(Class360.anIntArray3889[0], -805516494);
			class298_sub53.writeInt(Class360.anIntArray3889[1], -2077289504);
			class298_sub53.writeInt(Class360.anIntArray3889[2], 699745273);
			class298_sub53.writeInt(Class360.anIntArray3889[3], -753217368);
			return class298_sub53;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nk.m(").append(')').toString());
		}
	}
}
