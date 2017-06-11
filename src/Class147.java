/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class147 {
	static Class147 aClass147_1577;
	static Class147 aClass147_1578;
	static Class147 aClass147_1579 = new Class147(0, 4);
	int anInt1580;
	public int anInt1581;

	static {
		aClass147_1578 = new Class147(1, 5);
		aClass147_1577 = new Class147(2, 6);
	}

	Class147(int i, int i_0_) {
		((Class147) this).anInt1580 = i * -869034129;
		anInt1581 = -1628605819 * i_0_;
	}

	public static void method1600(IComponentDefinition class105, int i, int i_1_, int i_2_) {
		try {
			if (null != class105) {
				if (null != class105.anObjectArray1249) {
					Script class298_sub46 = new Script();
					class298_sub46.aClass105_7525 = class105;
					class298_sub46.params = class105.anObjectArray1249;
					Class444.method5889(class298_sub46, (byte) -26);
				}
				client.aBoolean8835 = true;
				Class379.anInt4099 = class105.anInt1142 * 1167811111;
				client.anInt8836 = class105.anInt1154 * -298861091;
				Linkable.anInt3192 = 1282349805 * i;
				Class132.anInt1508 = i_1_ * 1881265567;
				client.anInt8906 = 746397723 * class105.anInt1280;
				Class240.anInt2704 = 1745504609 * class105.anInt1179;
				client.anInt8937 = -472067203 * class105.anInt1163;
				Tradution.method6054(class105, -284512508);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fy.kc(").append(')').toString());
		}
	}

	static void method1601(byte i) {
		try {
			if (client.aByteArray8843 != null)
				Class120.method1311(-1491321338);
			else if (2084404473 * Class360.anInt3873 != -1)
				Class124.method1386((byte) -89);
			else
				Class497.method6208(Class360.username, Class360.password, 712466234);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("fy.f(").append(')').toString());
		}
	}
}
