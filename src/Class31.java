
/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class31 implements IndexLoader {
	Index aClass317_358;
	Index aClass317_359;
	Class229 aClass229_360 = new Class229(64);
	public static int anInt361;

	public void method799() {
		synchronized (((Class31) this).aClass229_360) {
			((Class31) this).aClass229_360.method3859(702031167);
		}
	}

	public Class44 method800(int i, int i_0_) {
		Class44 class44;
		synchronized (((Class31) this).aClass229_360) {
			class44 = ((Class44) ((Class31) this).aClass229_360.method3865((long) i));
		}
		if (class44 != null)
			return class44;
		byte[] is;
		synchronized (((Class31) this).aClass317_358) {
			is = ((Class31) this).aClass317_358.getFile((-71319279 * (Class120.aClass120_1466.anInt1521)), i, -1429017309);
		}
		class44 = new Class44();
		((Class44) class44).aClass31_429 = this;
		if (null != is)
			class44.method909(new RsByteBuffer(is), -1148034067);
		synchronized (((Class31) this).aClass229_360) {
			((Class31) this).aClass229_360.method3856(class44, (long) i);
		}
		return class44;
	}

	public void method801(int i) {
		synchronized (((Class31) this).aClass229_360) {
			((Class31) this).aClass229_360.method3859(-1013964419);
		}
	}

	public void method802(int i, int i_1_) {
		synchronized (((Class31) this).aClass229_360) {
			((Class31) this).aClass229_360.method3858(i, (byte) -3);
		}
	}

	public void method803(byte i) {
		synchronized (((Class31) this).aClass229_360) {
			((Class31) this).aClass229_360.method3863(903388454);
		}
	}

	public void method804(int i) {
		synchronized (((Class31) this).aClass229_360) {
			((Class31) this).aClass229_360.method3858(i, (byte) 91);
		}
	}

	public Class44 method805(int i) {
		Class44 class44;
		synchronized (((Class31) this).aClass229_360) {
			class44 = ((Class44) ((Class31) this).aClass229_360.method3865((long) i));
		}
		if (class44 != null)
			return class44;
		byte[] is;
		synchronized (((Class31) this).aClass317_358) {
			is = ((Class31) this).aClass317_358.getFile((-71319279 * (Class120.aClass120_1466.anInt1521)), i, -1720300705);
		}
		class44 = new Class44();
		((Class44) class44).aClass31_429 = this;
		if (null != is)
			class44.method909(new RsByteBuffer(is), -1148034067);
		synchronized (((Class31) this).aClass229_360) {
			((Class31) this).aClass229_360.method3856(class44, (long) i);
		}
		return class44;
	}

	public Class31(Game class486, Class495 class495, Index class317, Index class317_2_) {
		((Class31) this).aClass317_358 = class317;
		((Class31) this).aClass317_359 = class317_2_;
		((Class31) this).aClass317_358.filesCount(-71319279 * (Class120.aClass120_1466.anInt1521), 409432994);
	}

	public void method806() {
		synchronized (((Class31) this).aClass229_360) {
			((Class31) this).aClass229_360.method3859(-900924002);
		}
	}

	public Class44 method807(int i) {
		Class44 class44;
		synchronized (((Class31) this).aClass229_360) {
			class44 = ((Class44) ((Class31) this).aClass229_360.method3865((long) i));
		}
		if (class44 != null)
			return class44;
		byte[] is;
		synchronized (((Class31) this).aClass317_358) {
			is = ((Class31) this).aClass317_358.getFile((-71319279 * (Class120.aClass120_1466.anInt1521)), i, -1398702478);
		}
		class44 = new Class44();
		((Class44) class44).aClass31_429 = this;
		if (null != is)
			class44.method909(new RsByteBuffer(is), -1148034067);
		synchronized (((Class31) this).aClass229_360) {
			((Class31) this).aClass229_360.method3856(class44, (long) i);
		}
		return class44;
	}

	public void method808() {
		synchronized (((Class31) this).aClass229_360) {
			((Class31) this).aClass229_360.method3859(438412195);
		}
	}

	public static void method809(RsByteBuffer class282_sub35, int i) {
		byte[] is = new byte[24];
		try {
			Class263.aClass440_3269.method7347(0L);
			Class263.aClass440_3269.method7351(is, -991225250);
			int i_3_;
			for (i_3_ = 0; i_3_ < 24 && 0 == is[i_3_]; i_3_++) {
				/* empty */
			}
			if (i_3_ >= 24)
				throw new IOException();
		} catch (Exception exception) {
			for (int i_4_ = 0; i_4_ < 24; i_4_++)
				is[i_4_] = (byte) -1;
		}
		class282_sub35.writeBytes(is, 0, 24);
	}

	static final void method810(CS2Executor class527, int i) {
		Class10.method458((((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537)]), 1942118537);
	}

	static final void method811(CS2Executor class527, int i) {
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = ((CS2Executor) class527).aClass282_Sub4_7011.aString7501;
	}

	public static final Class282_Sub44 method812(int i, Class282_Sub44 class282_sub44, int[] is, boolean bool, byte i_5_) {
		Class282_Sub44 class282_sub44_6_ = (Class282_Sub44) client.aClass465_7442.method7754((long) i);
		if (null != class282_sub44_6_)
			Class351.method6196(class282_sub44_6_, (587626901 * class282_sub44.anInt8063 != class282_sub44_6_.anInt8063 * 587626901), bool, -1911344380);
		client.aClass465_7442.method7765(class282_sub44, (long) i);
		Class336.method6007(587626901 * class282_sub44.anInt8063, is, -1937827624);
		Class118 class118 = Class117.method1981(i, (byte) 76);
		if (class118 != null)
			Class109.method1858(class118, (byte) 12);
		if (null != client.aClass118_7352) {
			Class109.method1858(client.aClass118_7352, (byte) -25);
			client.aClass118_7352 = null;
		}
		OutputStream_Sub1.method12938((byte) 26);
		if (class118 != null)
			Class12.method483((Class468_Sub8.aClass98Array7889[-1952846363 * class118.anInt1287 >>> 16]), class118, !bool, -1031164822);
		if (!bool)
			Class150.method2582(587626901 * class282_sub44.anInt8063, is, -1100140607);
		if (!bool && client.anInt7349 * -1699899559 != -1)
			Class383.method6514(-1699899559 * client.anInt7349, 1, 815212600);
		return class282_sub44;
	}

	static final void method813(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		int i_11_ = 0;
		int i_12_ = i_8_;
		int i_13_ = -i_8_;
		int i_14_ = -1;
		Class232.method3922(Class532_Sub3.anIntArrayArray7072[i_7_], i - i_8_, i_8_ + i, i_9_, (byte) -15);
		while (i_12_ > i_11_) {
			i_14_ += 2;
			i_13_ += i_14_;
			i_11_++;
			if (i_13_ >= 0) {
				i_12_--;
				i_13_ -= i_12_ << 1;
				int[] is = Class532_Sub3.anIntArrayArray7072[i_12_ + i_7_];
				int[] is_15_ = Class532_Sub3.anIntArrayArray7072[i_7_ - i_12_];
				int i_16_ = i_11_ + i;
				int i_17_ = i - i_11_;
				Class232.method3922(is, i_17_, i_16_, i_9_, (byte) -71);
				Class232.method3922(is_15_, i_17_, i_16_, i_9_, (byte) 45);
			}
			int i_18_ = i_12_ + i;
			int i_19_ = i - i_12_;
			int[] is = Class532_Sub3.anIntArrayArray7072[i_11_ + i_7_];
			int[] is_20_ = Class532_Sub3.anIntArrayArray7072[i_7_ - i_11_];
			Class232.method3922(is, i_19_, i_18_, i_9_, (byte) 11);
			Class232.method3922(is_20_, i_19_, i_18_, i_9_, (byte) -34);
		}
	}

	static final void method814(CS2Executor class527, int i) {
		int i_21_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub14 class282_sub50_sub14 = Class296.aClass331_3535.method5918(i_21_, 1213236683);
		if (null == class282_sub50_sub14.anIntArray9747)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub14.anIntArray9747.length;
	}

	static final void method815(CS2Executor class527, short i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class413.method6942(class118, class527, 312854602);
	}
}
