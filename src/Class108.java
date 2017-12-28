
/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class108 {
	public String aString1083;
	public int anInt1084;
	public int anInt1085 = Class282_Sub20_Sub28.method15396((byte) 0) * 1559615941;
	public int anInt1086;
	public String aString1087;
	public String aString1088;
	public String aString1089;
	public String aString1090;
	public int anInt1091;
	public int anInt1092;
	public static String aString1093;

	void method1839(int i, int i_0_, String string, String string_1_, String string_2_, String string_3_, int i_4_, String string_5_) {
		anInt1085 = Class282_Sub20_Sub28.method15396((byte) 0) * 1559615941;
		anInt1084 = client.cycles * -953903207;
		anInt1092 = i * -1301834499;
		anInt1086 = i_0_ * 1439047399;
		aString1087 = string;
		aString1089 = string_1_;
		aString1088 = string_2_;
		aString1090 = string_3_;
		anInt1091 = 1875798715 * i_4_;
		aString1083 = string_5_;
	}

	void method1840(int i, int i_6_, String string, String string_7_, String string_8_, String string_9_, int i_10_, String string_11_, int i_12_) {
		anInt1085 = Class282_Sub20_Sub28.method15396((byte) 0) * 1559615941;
		anInt1084 = client.cycles * -953903207;
		anInt1092 = i * -1301834499;
		anInt1086 = i_6_ * 1439047399;
		aString1087 = string;
		aString1089 = string_7_;
		aString1088 = string_8_;
		aString1090 = string_9_;
		anInt1091 = 1875798715 * i_10_;
		aString1083 = string_11_;
	}

	Class108(int i, int i_13_, String string, String string_14_, String string_15_, String string_16_, int i_17_, String string_18_) {
		anInt1084 = -953903207 * client.cycles;
		anInt1092 = i * -1301834499;
		anInt1086 = 1439047399 * i_13_;
		aString1087 = string;
		aString1089 = string_14_;
		aString1088 = string_15_;
		aString1090 = string_16_;
		anInt1091 = 1875798715 * i_17_;
		aString1083 = string_18_;
	}

	void method1841(int i, int i_19_, String string, String string_20_, String string_21_, String string_22_, int i_23_, String string_24_) {
		anInt1085 = Class282_Sub20_Sub28.method15396((byte) 0) * 1559615941;
		anInt1084 = client.cycles * -953903207;
		anInt1092 = i * -1301834499;
		anInt1086 = i_19_ * 1439047399;
		aString1087 = string;
		aString1089 = string_20_;
		aString1088 = string_21_;
		aString1090 = string_22_;
		anInt1091 = 1875798715 * i_23_;
		aString1083 = string_24_;
	}

	void method1842(int i, int i_25_, String string, String string_26_, String string_27_, String string_28_, int i_29_, String string_30_) {
		anInt1085 = Class282_Sub20_Sub28.method15396((byte) 0) * 1559615941;
		anInt1084 = client.cycles * -953903207;
		anInt1092 = i * -1301834499;
		anInt1086 = i_25_ * 1439047399;
		aString1087 = string;
		aString1089 = string_26_;
		aString1088 = string_27_;
		aString1090 = string_28_;
		anInt1091 = 1875798715 * i_29_;
		aString1083 = string_30_;
	}

	void method1843(int i, int i_31_, String string, String string_32_, String string_33_, String string_34_, int i_35_, String string_36_) {
		anInt1085 = Class282_Sub20_Sub28.method15396((byte) 0) * 1559615941;
		anInt1084 = client.cycles * -953903207;
		anInt1092 = i * -1301834499;
		anInt1086 = i_31_ * 1439047399;
		aString1087 = string;
		aString1089 = string_32_;
		aString1088 = string_33_;
		aString1090 = string_34_;
		anInt1091 = 1875798715 * i_35_;
		aString1083 = string_36_;
	}

	void method1844(int i, int i_37_, String string, String string_38_, String string_39_, String string_40_, int i_41_, String string_42_) {
		anInt1085 = Class282_Sub20_Sub28.method15396((byte) 0) * 1559615941;
		anInt1084 = client.cycles * -953903207;
		anInt1092 = i * -1301834499;
		anInt1086 = i_37_ * 1439047399;
		aString1087 = string;
		aString1089 = string_38_;
		aString1088 = string_39_;
		aString1090 = string_40_;
		anInt1091 = 1875798715 * i_41_;
		aString1083 = string_42_;
	}

	static final void method1845(Class118 class118, Class98 class98, Class527 class527, int i) {
		String string = (String) (class527.anObjectArray7019[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 122183599) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class118.anObjectArray1271 = Class351.method6193(string, class527, 350429453);
		class118.aBool1384 = true;
	}

	public static int method1846(String string, int i) {
		return string.length() + 1;
	}

	static RsByteBuffer getLoginMod() {
		RsByteBuffer class282_sub35 = Class94.method1587((byte) -101);
		class282_sub35.writeLong(0L);
		class282_sub35.writeString(Class9.aString102);
		class282_sub35.writeLong(Class9.aLong86 * -6063499577746028609L);
		class282_sub35.writeLong(2357923306087344989L * client.aLong7409);
		class282_sub35.applyRSA(Class18.LOGIN_EXPONENT, Class18.LOGIN_MODULUS);
		return class282_sub35;
	}

	public static void method1848(Class206 class206, Class505 class505, int i) {
		Iterator iterator = Class235.aList2896.iterator();
		while (iterator.hasNext()) {
			Class539 class539 = (Class539) iterator.next();
			if (class539.aBool7130) {
				class539.method11516(class206, class505);
			}
		}
	}
}
