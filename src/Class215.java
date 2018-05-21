/* Class215 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class215 implements Interface17 {
	int anInt2683;
	int anInt2684;
	int[] anIntArray2685;
	public static Index aClass317_2686;

	Class215(int i, int i_0_, int[] is) {
		((Class215) this).anInt2683 = i * 985045531;
		((Class215) this).anInt2684 = i_0_ * 1924060881;
		((Class215) this).anIntArray2685 = is;
	}

	public boolean method127(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199, byte i_1_) {
		if (null == class282_sub53) {
			if (-142561261 * ((Class215) this).anInt2683 != -1)
				return false;
		} else {
			if (((Class215) this).anInt2683 * -142561261 != class282_sub53.method13470(-69637093))
				return false;
			if (-1099480527 * ((Class215) this).anInt2684 > class282_sub53.method13473((byte) 1))
				return false;
			int[] is = ((Class215) this).anIntArray2685;
			for (int i_2_ = 0; i_2_ < is.length; i_2_++) {
				int i_3_ = is[i_2_];
				if (!class199.method3236(i_3_, -1576046451))
					return false;
			}
		}
		return true;
	}

	public boolean method128(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199) {
		if (null == class282_sub53) {
			if (-142561261 * ((Class215) this).anInt2683 != -1)
				return false;
		} else {
			if (((Class215) this).anInt2683 * -142561261 != class282_sub53.method13470(2068258113))
				return false;
			if (-1099480527 * ((Class215) this).anInt2684 > class282_sub53.method13473((byte) 1))
				return false;
			int[] is = ((Class215) this).anIntArray2685;
			for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
				int i_5_ = is[i_4_];
				if (!class199.method3236(i_5_, -2084416497))
					return false;
			}
		}
		return true;
	}

	public boolean method129(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199) {
		if (null == class282_sub53) {
			if (-142561261 * ((Class215) this).anInt2683 != -1)
				return false;
		} else {
			if (((Class215) this).anInt2683 * -142561261 != class282_sub53.method13470(-1374498088))
				return false;
			if (-1099480527 * ((Class215) this).anInt2684 > class282_sub53.method13473((byte) 1))
				return false;
			int[] is = ((Class215) this).anIntArray2685;
			for (int i_6_ = 0; i_6_ < is.length; i_6_++) {
				int i_7_ = is[i_6_];
				if (!class199.method3236(i_7_, -1578013720))
					return false;
			}
		}
		return true;
	}

	static Class215 method3670(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readUnsignedByte();
		int i_8_ = class282_sub35.readUnsignedByte();
		int i_9_ = class282_sub35.readUnsignedByte();
		int[] is = new int[i_9_];
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
			is[i_10_] = class282_sub35.readUnsignedByte();
		return new Class215(i, i_8_, is);
	}

	static Class215 method3671(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readUnsignedByte();
		int i_11_ = class282_sub35.readUnsignedByte();
		int i_12_ = class282_sub35.readUnsignedByte();
		int[] is = new int[i_12_];
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
			is[i_13_] = class282_sub35.readUnsignedByte();
		return new Class215(i, i_11_, is);
	}

	public boolean method126(Class282_Sub53 class282_sub53, Interface16[] interface16s, int i, Class199 class199) {
		if (null == class282_sub53) {
			if (-142561261 * ((Class215) this).anInt2683 != -1)
				return false;
		} else {
			if (((Class215) this).anInt2683 * -142561261 != class282_sub53.method13470(-63255169))
				return false;
			if (-1099480527 * ((Class215) this).anInt2684 > class282_sub53.method13473((byte) 1))
				return false;
			int[] is = ((Class215) this).anIntArray2685;
			for (int i_14_ = 0; i_14_ < is.length; i_14_++) {
				int i_15_ = is[i_14_];
				if (!class199.method3236(i_15_, -1402673347))
					return false;
			}
		}
		return true;
	}

	static final void method3672(Class118 class118, Class98 class98, CS2Executor class527, short i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 394644224) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1412 = Class351.method6193(string, class527, 1237376111);
		class118.aBool1384 = true;
	}

	static void method3673(String string, boolean bool, int i, int i_16_, String string_17_, boolean bool_18_, int i_19_) {
		string = string.toLowerCase();
		short[] is = new short[16];
		int i_20_ = -1;
		String string_21_ = null;
		if (-1 != i) {
			AttributeDefault class437 = Class125.aClass424_1573.method7069(i, (byte) 0);
			if (class437 == null || class437.method7319(1591846177) != bool_18_)
				return;
			if (class437.method7319(1882298499))
				string_21_ = class437.aString5335;
			else
				i_20_ = class437.anInt5337 * -1741480635;
		}
		int i_22_ = 0;
		for (int i_23_ = 0; i_23_ < IndexLoaders.ITEM_INDEX_LOADER.maxItemsCount * -1662523091; i_23_++) {
			ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_23_, 1398783345);
			if ((!bool || class425.grandExchange) && -1 == class425.certTemplateId * -722914683 && -1203090775 * class425.landTemplateId == -1 && -1 == class425.bindTemplateId * 370155889 && 0 == class425.anInt5095 * -2136347513 && class425.aString5043.toLowerCase().indexOf(string) != -1) {
				if (i != -1) {
					if (bool_18_) {
						if (!string_17_.equals(class425.method7101(i, string_21_, -1780783562)))
							continue;
					} else if (i_16_ != class425.method7099(i, i_20_, -1985446250))
						continue;
				}
				if (i_22_ >= 250) {
					Class415.anInt4985 = -1978366005;
					Class308.aShortArray3621 = null;
					return;
				}
				if (i_22_ >= is.length) {
					short[] is_24_ = new short[2 * is.length];
					for (int i_25_ = 0; i_25_ < i_22_; i_25_++)
						is_24_[i_25_] = is[i_25_];
					is = is_24_;
				}
				is[i_22_++] = (short) i_23_;
			}
		}
		Class308.aShortArray3621 = is;
		Class283.anInt3384 = 0;
		Class415.anInt4985 = i_22_ * 1978366005;
		String[] strings = new String[Class415.anInt4985 * 560339485];
		for (int i_26_ = 0; i_26_ < 560339485 * Class415.anInt4985; i_26_++)
			strings[i_26_] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(is[i_26_], 1650435768).aString5043);
		Class100.method1644(strings, Class308.aShortArray3621, (short) 2733);
	}
}
