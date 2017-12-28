
/* Class378 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;
import java.util.Map;

public class Class378 {
	int[] anIntArray4521;
	Class317 aClass317_4522;
	Class317 aClass317_4523;
	Class229 aClass229_4524 = new Class229(20);
	Map aMap4525 = null;
	public static Class317 aClass317_4526;

	public int method6402() {
		if (((Class378) this).anIntArray4521 == null)
			return 0;
		return 2 * ((Class378) this).anIntArray4521.length;
	}

	public void method6403(Interface35 interface35, short i) {
		((Class378) this).aMap4525 = new HashMap(((Class378) this).anIntArray4521.length);
		for (int i_0_ = 0; i_0_ < ((Class378) this).anIntArray4521.length; i_0_++) {
			int i_1_ = ((Class378) this).anIntArray4521[i_0_];
			Class414 class414 = Class163.method2845(((Class378) this).aClass317_4523, i_1_, (byte) 31);
			byte[] is = ((Class378) this).aClass317_4522.method5615(i_1_, -1652257518);
			Object object = interface35.method216(is, class414, true, 1942118537);
			((Class378) this).aMap4525.put(Integer.valueOf(i_0_), new Class452(object, class414));
		}
	}

	public Class378(Class317 class317, Class317 class317_2_, int[] is) {
		((Class378) this).aClass317_4522 = class317;
		((Class378) this).aClass317_4523 = class317_2_;
		if (null != is)
			((Class378) this).anIntArray4521 = is;
		else
			((Class378) this).anIntArray4521 = null;
	}

	public int method6404(int i) {
		return method6405(false, 1676950204);
	}

	public int method6405(boolean bool, int i) {
		if (null == ((Class378) this).anIntArray4521)
			return 0;
		if (!bool && ((Class378) this).aMap4525 != null)
			return 2 * ((Class378) this).anIntArray4521.length;
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < ((Class378) this).anIntArray4521.length; i_4_++) {
			int i_5_ = ((Class378) this).anIntArray4521[i_4_];
			if (((Class378) this).aClass317_4522.method5661(i_5_, 2017428513))
				i_3_++;
			if (((Class378) this).aClass317_4523.method5661(i_5_, -810105857))
				i_3_++;
		}
		return i_3_;
	}

	Class452 method6406(Interface35 interface35, int i, boolean bool, boolean bool_6_) {
		if (-1 == i)
			return null;
		if (((Class378) this).anIntArray4521 != null) {
			for (int i_7_ = 0; i_7_ < ((Class378) this).anIntArray4521.length; i_7_++) {
				if (i == ((Class378) this).anIntArray4521[i_7_])
					return (Class452) ((Class378) this).aMap4525.get(Integer.valueOf(i_7_));
			}
		}
		Class452 class452 = (Class452) ((Class378) this).aClass229_4524.method3865((long) (i << 1 | (bool_6_ ? 1 : 0)));
		if (null != class452) {
			if (bool && null == class452.anObject5444) {
				Class414 class414 = Class163.method2845(((Class378) this).aClass317_4523, i, (byte) 102);
				if (class414 == null)
					return null;
				class452.anObject5444 = class414;
			}
			return class452;
		}
		byte[] is = ((Class378) this).aClass317_4522.method5615(i, -751208839);
		if (is == null)
			return null;
		Class414 class414 = Class163.method2845(((Class378) this).aClass317_4523, i, (byte) 94);
		if (null == class414)
			return null;
		if (bool)
			class452 = new Class452(interface35.method216(is, class414, bool_6_, 1942118537), class414);
		else
			class452 = new Class452(interface35.method216(is, class414, bool_6_, 1942118537), null);
		((Class378) this).aClass229_4524.method3856(class452, (long) (i << 1 | (bool_6_ ? 1 : 0)));
		return class452;
	}

	public int method6407() {
		if (((Class378) this).anIntArray4521 == null)
			return 0;
		return 2 * ((Class378) this).anIntArray4521.length;
	}

	public int method6408() {
		if (((Class378) this).anIntArray4521 == null)
			return 0;
		return 2 * ((Class378) this).anIntArray4521.length;
	}

	Class452 method6409(Interface35 interface35, int i, boolean bool, boolean bool_8_, byte i_9_) {
		if (-1 == i)
			return null;
		if (((Class378) this).anIntArray4521 != null) {
			for (int i_10_ = 0; i_10_ < ((Class378) this).anIntArray4521.length; i_10_++) {
				if (i == ((Class378) this).anIntArray4521[i_10_])
					return (Class452) ((Class378) this).aMap4525.get(Integer.valueOf(i_10_));
			}
		}
		Class452 class452 = (Class452) ((Class378) this).aClass229_4524.method3865((long) (i << 1 | (bool_8_ ? 1 : 0)));
		if (null != class452) {
			if (bool && null == class452.anObject5444) {
				Class414 class414 = Class163.method2845(((Class378) this).aClass317_4523, i, (byte) 119);
				if (class414 == null)
					return null;
				class452.anObject5444 = class414;
			}
			return class452;
		}
		byte[] is = ((Class378) this).aClass317_4522.method5615(i, -36884822);
		if (is == null)
			return null;
		Class414 class414 = Class163.method2845(((Class378) this).aClass317_4523, i, (byte) 90);
		if (null == class414)
			return null;
		if (bool)
			class452 = new Class452(interface35.method216(is, class414, bool_8_, 1942118537), class414);
		else
			class452 = new Class452(interface35.method216(is, class414, bool_8_, 1942118537), null);
		((Class378) this).aClass229_4524.method3856(class452, (long) (i << 1 | (bool_8_ ? 1 : 0)));
		return class452;
	}

	public void method6410(short i) {
		((Class378) this).aClass229_4524.method3859(-1705560469);
	}

	public void method6411(int i, int i_11_) {
		((Class378) this).aClass229_4524.method3858(i, (byte) -27);
	}

	public void method6412(int i) {
		((Class378) this).aClass229_4524.method3863(1703943609);
	}

	public void method6413(Interface35 interface35) {
		((Class378) this).aMap4525 = new HashMap(((Class378) this).anIntArray4521.length);
		for (int i = 0; i < ((Class378) this).anIntArray4521.length; i++) {
			int i_12_ = ((Class378) this).anIntArray4521[i];
			Class414 class414 = Class163.method2845(((Class378) this).aClass317_4523, i_12_, (byte) 123);
			byte[] is = ((Class378) this).aClass317_4522.method5615(i_12_, -2122877522);
			Object object = interface35.method216(is, class414, true, 1942118537);
			((Class378) this).aMap4525.put(Integer.valueOf(i), new Class452(object, class414));
		}
	}

	public void method6414(Interface35 interface35) {
		((Class378) this).aMap4525 = new HashMap(((Class378) this).anIntArray4521.length);
		for (int i = 0; i < ((Class378) this).anIntArray4521.length; i++) {
			int i_13_ = ((Class378) this).anIntArray4521[i];
			Class414 class414 = Class163.method2845(((Class378) this).aClass317_4523, i_13_, (byte) 90);
			byte[] is = ((Class378) this).aClass317_4522.method5615(i_13_, -1634640229);
			Object object = interface35.method216(is, class414, true, 1942118537);
			((Class378) this).aMap4525.put(Integer.valueOf(i), new Class452(object, class414));
		}
	}

	public Class414 method6415(Interface35 interface35, int i, int i_14_) {
		Class452 class452 = method6409(interface35, i, true, true, (byte) 1);
		if (class452 == null)
			return null;
		return (Class414) class452.anObject5444;
	}

	public void method6416() {
		((Class378) this).aMap4525 = null;
	}

	public int method6417() {
		return method6405(false, 1585974752);
	}

	public int method6418(boolean bool) {
		if (null == ((Class378) this).anIntArray4521)
			return 0;
		if (!bool && ((Class378) this).aMap4525 != null)
			return 2 * ((Class378) this).anIntArray4521.length;
		int i = 0;
		for (int i_15_ = 0; i_15_ < ((Class378) this).anIntArray4521.length; i_15_++) {
			int i_16_ = ((Class378) this).anIntArray4521[i_15_];
			if (((Class378) this).aClass317_4522.method5661(i_16_, -226275637))
				i++;
			if (((Class378) this).aClass317_4523.method5661(i_16_, -1748217652))
				i++;
		}
		return i;
	}

	public int method6419(boolean bool) {
		if (null == ((Class378) this).anIntArray4521)
			return 0;
		if (!bool && ((Class378) this).aMap4525 != null)
			return 2 * ((Class378) this).anIntArray4521.length;
		int i = 0;
		for (int i_17_ = 0; i_17_ < ((Class378) this).anIntArray4521.length; i_17_++) {
			int i_18_ = ((Class378) this).anIntArray4521[i_17_];
			if (((Class378) this).aClass317_4522.method5661(i_18_, 1022789844))
				i++;
			if (((Class378) this).aClass317_4523.method5661(i_18_, 1005529073))
				i++;
		}
		return i;
	}

	public void method6420() {
		((Class378) this).aClass229_4524.method3859(-830725297);
	}

	Class452 method6421(Interface35 interface35, int i, boolean bool, boolean bool_19_) {
		if (-1 == i)
			return null;
		if (((Class378) this).anIntArray4521 != null) {
			for (int i_20_ = 0; i_20_ < ((Class378) this).anIntArray4521.length; i_20_++) {
				if (i == ((Class378) this).anIntArray4521[i_20_])
					return (Class452) ((Class378) this).aMap4525.get(Integer.valueOf(i_20_));
			}
		}
		Class452 class452 = (Class452) ((Class378) this).aClass229_4524.method3865((long) (i << 1 | (bool_19_ ? 1 : 0)));
		if (null != class452) {
			if (bool && null == class452.anObject5444) {
				Class414 class414 = Class163.method2845(((Class378) this).aClass317_4523, i, (byte) 89);
				if (class414 == null)
					return null;
				class452.anObject5444 = class414;
			}
			return class452;
		}
		byte[] is = ((Class378) this).aClass317_4522.method5615(i, -871336505);
		if (is == null)
			return null;
		Class414 class414 = Class163.method2845(((Class378) this).aClass317_4523, i, (byte) 88);
		if (null == class414)
			return null;
		if (bool)
			class452 = new Class452(interface35.method216(is, class414, bool_19_, 1942118537), class414);
		else
			class452 = new Class452(interface35.method216(is, class414, bool_19_, 1942118537), null);
		((Class378) this).aClass229_4524.method3856(class452, (long) (i << 1 | (bool_19_ ? 1 : 0)));
		return class452;
	}

	public int method6422(int i) {
		if (((Class378) this).anIntArray4521 == null)
			return 0;
		return 2 * ((Class378) this).anIntArray4521.length;
	}

	public int method6423() {
		if (((Class378) this).anIntArray4521 == null)
			return 0;
		return 2 * ((Class378) this).anIntArray4521.length;
	}

	public void method6424(int i) {
		((Class378) this).aClass229_4524.method3858(i, (byte) 11);
	}

	public Class414 method6425(Interface35 interface35, int i) {
		Class452 class452 = method6409(interface35, i, true, true, (byte) 1);
		if (class452 == null)
			return null;
		return (Class414) class452.anObject5444;
	}

	public Object method6426(Interface35 interface35, int i, boolean bool, boolean bool_21_, int i_22_) {
		Class452 class452 = method6409(interface35, i, bool, bool_21_, (byte) 1);
		if (null == class452)
			return null;
		return class452.anObject5443;
	}

	Class452 method6427(Interface35 interface35, int i, boolean bool, boolean bool_23_) {
		if (-1 == i)
			return null;
		if (((Class378) this).anIntArray4521 != null) {
			for (int i_24_ = 0; i_24_ < ((Class378) this).anIntArray4521.length; i_24_++) {
				if (i == ((Class378) this).anIntArray4521[i_24_])
					return (Class452) ((Class378) this).aMap4525.get(Integer.valueOf(i_24_));
			}
		}
		Class452 class452 = (Class452) ((Class378) this).aClass229_4524.method3865((long) (i << 1 | (bool_23_ ? 1 : 0)));
		if (null != class452) {
			if (bool && null == class452.anObject5444) {
				Class414 class414 = Class163.method2845(((Class378) this).aClass317_4523, i, (byte) 69);
				if (class414 == null)
					return null;
				class452.anObject5444 = class414;
			}
			return class452;
		}
		byte[] is = ((Class378) this).aClass317_4522.method5615(i, -1372223000);
		if (is == null)
			return null;
		Class414 class414 = Class163.method2845(((Class378) this).aClass317_4523, i, (byte) 52);
		if (null == class414)
			return null;
		if (bool)
			class452 = new Class452(interface35.method216(is, class414, bool_23_, 1942118537), class414);
		else
			class452 = new Class452(interface35.method216(is, class414, bool_23_, 1942118537), null);
		((Class378) this).aClass229_4524.method3856(class452, (long) (i << 1 | (bool_23_ ? 1 : 0)));
		return class452;
	}

	public int method6428() {
		if (((Class378) this).anIntArray4521 == null)
			return 0;
		return 2 * ((Class378) this).anIntArray4521.length;
	}

	public void method6429() {
		((Class378) this).aClass229_4524.method3859(1653159735);
	}

	public void method6430() {
		((Class378) this).aMap4525 = null;
	}

	public void method6431() {
		((Class378) this).aClass229_4524.method3859(1179481786);
	}

	public void method6432() {
		((Class378) this).aClass229_4524.method3859(534913569);
	}

	public void method6433(int i) {
		((Class378) this).aMap4525 = null;
	}

	public void method6434() {
		((Class378) this).aClass229_4524.method3863(926195982);
	}

	public static int method6435(int i) {
		return Class96_Sub10_Sub1.anInt10159 * 1439648847;
	}

	public static byte[] method6436(String string, int i) {
		int i_25_ = string.length();
		if (0 == i_25_)
			return new byte[0];
		int i_26_ = i_25_ + 3 & ~0x3;
		int i_27_ = i_26_ / 4 * 3;
		if (i_26_ - 2 >= i_25_ || Class514.method8840(string.charAt(i_26_ - 2), -1434281035) == -1)
			i_27_ -= 2;
		else if (i_26_ - 1 >= i_25_ || (Class514.method8840(string.charAt(i_26_ - 1), -1329801870) == -1))
			i_27_--;
		byte[] is = new byte[i_27_];
		IncomingPacket.method6375(string, is, 0, -692534854);
		return is;
	}

	static final void method6437(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 283782002;
		long l = (long) (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012]);
		long l_28_ = (long) (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537 + 1]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) (l + l * l_28_ / 100L);
	}

	static final void method6438(byte i) {
		Class122.aClass536_1535.method11477(5, (byte) 1);
		Class493.aClass479_5778.method8030(5, 1440443465);
		Class20.aClass31_204.method802(5, -957587210);
		client.aClass257_7353.method4436(-1981388866).method7896(5, (byte) -88);
		Class350_Sub1.aClass406_7757.method6832(5, 1789161968);
		Class119.aClass426_1463.method7156(5, (byte) 44);
		Class330.aClass523_3868.method11210(5, (byte) -68);
		Class96_Sub20.aClass515_9416.method8847(5, 1748344729);
		Class16.aClass230_147.method3898(5, 1935231941);
		Class104.aClass377_1065.method6386(5, (byte) 31);
		Class45.aClass447_435.method7452(5, (byte) 17);
		Class243.aClass498_3001.method8320(5, 1532833912);
		Class502.aClass394_5831.method6755(5, (byte) -16);
		Class497.aClass233_5822.method3923(5, -1373028288);
		Class96_Sub16.aClass211_9383.method3615(5, -1820135458);
		Class397.aClass218_4813.method3695(5, -103071229);
		Class97.aClass427_995.method7173(5, 1756821991);
		Class125.aClass424_1573.method7068(5, -549869828);
		Class149.aClass288_1746.method5068(5, (byte) -22);
		Class488.aClass45_5759.method917(5, -1830471227);
		Class282_Sub23.aClass436_7683.method7307(5, 675653231);
		Class468_Sub23.aClass438_7932.method7326(5, -934687178);
		Login.aClass210_3389.method3602(5, -1179101504);
		Class286.aClass290_3402.method5107(5, (byte) 14);
		Class218.method3709(5, (short) 4421);
		Class439.method7343(50, 827005880);
		Class487.aClass378_5752.method6411(50, -1105244547);
		Class332.method5927(5, (byte) 0);
		Class322.method5768(5, (byte) -42);
		client.aClass229_7204.method3858(5, (byte) 17);
		Class20.aClass229_191.method3858(5, (byte) 15);
		Class517.aClass229_5901.method3858(5, (byte) -83);
	}
}
