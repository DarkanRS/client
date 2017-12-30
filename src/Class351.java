
/* Class351 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class351 implements Interface3 {
	public int anInt4095;
	public static Canvas aCanvas4096;
	public static int anInt4097;

	public Class60 method25() {
		return Class60.aClass60_601;
	}

	Class351(int i) {
		anInt4095 = i * -1867361899;
	}

	public static Class351 method6191(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readBigSmart(2066197333);
		return new Class351(i);
	}

	public Class60 method24(int i) {
		return Class60.aClass60_601;
	}

	public static Class351 method6192(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readBigSmart(2120632698);
		return new Class351(i);
	}

	static final Object[] method6193(String string, CS2Executor class527, int i) {
		Object[] objects = new Object[string.length() + 1];
		for (int i_0_ = objects.length - 1; i_0_ >= 1; i_0_--) {
			if (string.charAt(i_0_ - 1) == 's')
				objects[i_0_] = (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
			else if (string.charAt(i_0_ - 1) == '\u00a7')
				objects[i_0_] = new Long(((CS2Executor) class527).aLongArray7003[(((CS2Executor) class527).anInt7001 -= -1188480575) * 1820448321]);
			else
				objects[i_0_] = new Integer(((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		}
		int i_1_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (i_1_ != -1)
			objects[0] = new Integer(i_1_);
		else
			objects = null;
		return objects;
	}

	static final void method6194(CS2Executor class527, int i) {
		int i_2_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		Class119.method2075(i_2_, string, (byte) 3);
	}

	static final void method6195(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub4_8223.method12641(-1731892952);
	}

	public static final void method6196(Class282_Sub44 class282_sub44, boolean bool, boolean bool_3_, int i) {
		int i_4_ = 587626901 * class282_sub44.anInt8063;
		int i_5_ = (int) (-3442165056282524525L * class282_sub44.aLong3379);
		class282_sub44.method4991(-371378792);
		if (bool)
			Class337.method6017(i_4_, -775991491);
		Class109_Sub1.method14650(i_4_, 185452428);
		Class118 class118 = Class117.method1981(i_5_, (byte) 49);
		if (null != class118)
			Class109.method1858(class118, (byte) -15);
		OutputStream_Sub1.method12938((byte) 7);
		if (!bool_3_ && -1 != client.anInt7349 * -1699899559)
			Class383.method6514(-1699899559 * client.anInt7349, 1, 772605854);
		Class451 class451 = new Class451(client.aClass465_7442);
		for (Class282_Sub44 class282_sub44_6_ = (Class282_Sub44) class451.method7503(2066696054); null != class282_sub44_6_; class282_sub44_6_ = (Class282_Sub44) class451.next()) {
			if (!class282_sub44_6_.method4994(1418797057)) {
				class282_sub44_6_ = (Class282_Sub44) class451.method7503(1554887126);
				if (null == class282_sub44_6_)
					break;
			}
			if (3 == class282_sub44_6_.anInt8062 * -1517697923) {
				int i_7_ = (int) (class282_sub44_6_.aLong3379 * -3442165056282524525L);
				if (i_7_ >>> 16 == i_4_)
					method6196(class282_sub44_6_, true, bool_3_, -1676599874);
			}
		}
	}

	public static synchronized void method6197(byte[] is, int i) {
		if (is.length == 100 && Class491.anInt5768 * -1753327595 < 1000)
			Class491.aByteArrayArray5767[(Class491.anInt5768 += -608782531) * -1753327595 - 1] = is;
		else if (5000 == is.length && Class491.anInt5769 * -495226665 < 250)
			Class491.aByteArrayArray5771[(Class491.anInt5769 += 758153959) * -495226665 - 1] = is;
		else if (30000 == is.length && -1159034629 * Class491.anInt5772 < 50)
			Class491.aByteArrayArray5770[(Class491.anInt5772 += -1912454605) * -1159034629 - 1] = is;
		else if (IcmpService_Sub1.aByteArrayArrayArray7963 != null) {
			for (int i_8_ = 0; i_8_ < Class491.anIntArray5773.length; i_8_++) {
				if (is.length == Class491.anIntArray5773[i_8_] && (Class412.anIntArray4962[i_8_] < (IcmpService_Sub1.aByteArrayArrayArray7963[i_8_]).length)) {
					IcmpService_Sub1.aByteArrayArrayArray7963[i_8_][Class412.anIntArray4962[i_8_]++] = is;
					break;
				}
			}
		}
	}
}
