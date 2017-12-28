/* Class282_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub33 extends Class282 {
	int anInt7827;
	int anInt7828;
	int anInt7829;
	int anInt7830 = -1221671315;
	int anInt7831;
	int anInt7832;
	int anInt7833;
	int anInt7834;
	Class282_Sub36 aClass282_Sub36_7835;
	static Class282_Sub15_Sub2 aClass282_Sub15_Sub2_7836;

	boolean method12576(int i, int i_0_) {
		if (i >= ((Class282_Sub33) this).anInt7830 * 1164692635 && i <= ((Class282_Sub33) this).anInt7828 * 182953267 && i_0_ >= ((Class282_Sub33) this).anInt7834 * -896843561 && i_0_ <= -1625607593 * ((Class282_Sub33) this).anInt7833)
			return true;
		if (i >= ((Class282_Sub33) this).anInt7829 * 74045135 && i <= ((Class282_Sub33) this).anInt7832 * 166090671 && i_0_ >= -1212832875 * ((Class282_Sub33) this).anInt7831 && i_0_ <= 301273125 * ((Class282_Sub33) this).anInt7827)
			return true;
		return false;
	}

	boolean method12577(int i, int i_1_, int i_2_) {
		if (i >= ((Class282_Sub33) this).anInt7830 * 1164692635 && i <= ((Class282_Sub33) this).anInt7828 * 182953267 && i_1_ >= ((Class282_Sub33) this).anInt7834 * -896843561 && i_1_ <= -1625607593 * ((Class282_Sub33) this).anInt7833)
			return true;
		if (i >= ((Class282_Sub33) this).anInt7829 * 74045135 && i <= ((Class282_Sub33) this).anInt7832 * 166090671 && i_1_ >= -1212832875 * ((Class282_Sub33) this).anInt7831 && i_1_ <= 301273125 * ((Class282_Sub33) this).anInt7827)
			return true;
		return false;
	}

	Class282_Sub33(Class282_Sub36 class282_sub36) {
		((Class282_Sub33) this).anInt7828 = -2147483648;
		((Class282_Sub33) this).anInt7834 = -292926183;
		((Class282_Sub33) this).anInt7833 = -2147483648;
		((Class282_Sub33) this).anInt7829 = -700018735;
		((Class282_Sub33) this).anInt7832 = -2147483648;
		((Class282_Sub33) this).anInt7831 = -82743229;
		((Class282_Sub33) this).anInt7827 = -2147483648;
		((Class282_Sub33) this).aClass282_Sub36_7835 = class282_sub36;
	}

	boolean method12578(int i, int i_3_) {
		if (i >= ((Class282_Sub33) this).anInt7830 * 1164692635 && i <= ((Class282_Sub33) this).anInt7828 * 182953267 && i_3_ >= ((Class282_Sub33) this).anInt7834 * -896843561 && i_3_ <= -1625607593 * ((Class282_Sub33) this).anInt7833)
			return true;
		if (i >= ((Class282_Sub33) this).anInt7829 * 74045135 && i <= ((Class282_Sub33) this).anInt7832 * 166090671 && i_3_ >= -1212832875 * ((Class282_Sub33) this).anInt7831 && i_3_ <= 301273125 * ((Class282_Sub33) this).anInt7827)
			return true;
		return false;
	}

	boolean method12579(int i, int i_4_) {
		if (i >= ((Class282_Sub33) this).anInt7830 * 1164692635 && i <= ((Class282_Sub33) this).anInt7828 * 182953267 && i_4_ >= ((Class282_Sub33) this).anInt7834 * -896843561 && i_4_ <= -1625607593 * ((Class282_Sub33) this).anInt7833)
			return true;
		if (i >= ((Class282_Sub33) this).anInt7829 * 74045135 && i <= ((Class282_Sub33) this).anInt7832 * 166090671 && i_4_ >= -1212832875 * ((Class282_Sub33) this).anInt7831 && i_4_ <= 301273125 * ((Class282_Sub33) this).anInt7827)
			return true;
		return false;
	}

	boolean method12580(int i, int i_5_) {
		if (i >= ((Class282_Sub33) this).anInt7830 * 1164692635 && i <= ((Class282_Sub33) this).anInt7828 * 182953267 && i_5_ >= ((Class282_Sub33) this).anInt7834 * -896843561 && i_5_ <= -1625607593 * ((Class282_Sub33) this).anInt7833)
			return true;
		if (i >= ((Class282_Sub33) this).anInt7829 * 74045135 && i <= ((Class282_Sub33) this).anInt7832 * 166090671 && i_5_ >= -1212832875 * ((Class282_Sub33) this).anInt7831 && i_5_ <= 301273125 * ((Class282_Sub33) this).anInt7827)
			return true;
		return false;
	}

	boolean method12581(int i, int i_6_) {
		if (i >= ((Class282_Sub33) this).anInt7830 * 1164692635 && i <= ((Class282_Sub33) this).anInt7828 * 182953267 && i_6_ >= ((Class282_Sub33) this).anInt7834 * -896843561 && i_6_ <= -1625607593 * ((Class282_Sub33) this).anInt7833)
			return true;
		if (i >= ((Class282_Sub33) this).anInt7829 * 74045135 && i <= ((Class282_Sub33) this).anInt7832 * 166090671 && i_6_ >= -1212832875 * ((Class282_Sub33) this).anInt7831 && i_6_ <= 301273125 * ((Class282_Sub33) this).anInt7827)
			return true;
		return false;
	}

	static String method12582(RsByteBuffer class282_sub35, int i, int i_7_) {
		String string;
		try {
			int i_8_ = class282_sub35.readUnsignedSmart(1694471636);
			if (i_8_ > i)
				i_8_ = i;
			byte[] is = new byte[i_8_];
			class282_sub35.index += (Class113.aClass117_1234.method1973((class282_sub35.buffer), ((class282_sub35.index) * -1990677291), is, 0, i_8_, (byte) -99) * -1115476867);
			String string_9_ = Class344.method6118(is, 0, i_8_, (byte) -71);
			string = string_9_;
		} catch (Exception exception) {
			return "Cabbage";
		}
		return string;
	}

	static final void method12583(Class527 class527, int i) {
		Class513 class513 = (((Class527) class527).aBool7022 ? ((Class527) class527).aClass513_6994 : ((Class527) class527).aClass513_7007);
		Class118 class118 = ((Class513) class513).aClass118_5886;
		Class209.method3601(class118, class527, -1856078763);
	}

	static final void method12584(Class527 class527, int i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class159.aClass450_2010.worldId * -87869981;
	}
}
