/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class87 {
	static short aShort792;
	public static HashTable aClass437_793;
	public static Class94[] aClass94Array794;
	static Class80[] aClass80Array795;
	public static Interface23 anInterface23_796;
	public static Class82[] aClass82Array797;
	static Class86[] aClass86Array798;
	public static Class453 aClass453_799 = new Class453();
	static int anInt800;
	static int anInt801;
	static boolean aBoolean802;
	static int anInt803;
	static int anInt804;
	static Class75[] aClass75Array805;

	Class87() throws Throwable {
		throw new Error();
	}

	static {
		aClass437_793 = new HashTable(32);
		anInt803 = 2029434363;
		anInt800 = 0;
		anInt801 = 0;
		aBoolean802 = false;
		anInt804 = 1692564793;
		anInterface23_796 = new Class93();
	}

	static final void method968(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_0_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[2 + 681479919 * ((ClientScript2) class403).anInt5239]);
			Class438.method5846(string, i_0_ == 1, i_1_, i_2_, -671916771);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class344.anInt3688 * 367592105;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dn.abj(").append(')').toString());
		}
	}

	static final void method969(ClientScript2 class403, int i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_3_, (byte) -37);
			Class119 class119 = Class389.aClass119Array4165[i_3_ >> 16];
			Class298_Sub32_Sub5.method3174(class105, class119, class403, -1818514022);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dn.nx(").append(')').toString());
		}
	}

	public static int method970(int i, int i_4_) {
		try {
			int i_5_ = 0;
			if (i < 0 || i >= 65536) {
				i >>>= 16;
				i_5_ += 16;
			}
			if (i >= 256) {
				i >>>= 8;
				i_5_ += 8;
			}
			if (i >= 16) {
				i >>>= 4;
				i_5_ += 4;
			}
			if (i >= 4) {
				i >>>= 2;
				i_5_ += 2;
			}
			if (i >= 1) {
				i >>>= 1;
				i_5_++;
			}
			return i + i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dn.d(").append(')').toString());
		}
	}

	static void method971(IComponentDefinition class105, int i, int i_6_, int i_7_) {
		try {
			if (client.aBoolean8835) {
				Class497 class497 = (Class132.anInt1508 * 831522399 != -1 ? Class92.aClass504_905.method6251((831522399 * (Class132.anInt1508)), -1080440130) : null);
				if (client.method2801(class105).method3495(1299208806) && 0 != (Linkable.anInt3192 * -112110875 & 0x20) && (null == class497 || (class105.method1117(Class132.anInt1508 * 831522399, (class497.anInt6100 * -388931549), -659898667) != -388931549 * class497.anInt6100)))
					Class234.method2174(client.aString8838, new StringBuilder().append(client.aString8754).append(" ").append(Class26.aString351).append(" ").append(class105.aString1228).toString(), Class240.anInt2704 * 697885143, 58, class105.anInt1280 * -1232467723, 0L, class105.anInt1154 * -1309843523, -440872681 * class105.anInt1142, true, false, (long) (class105.anInt1154 * -1309843523 << 32 | class105.anInt1142 * -440872681), false, -1876457786);
			}
			for (int i_8_ = 9; i_8_ >= 5; i_8_--) {
				String string = Class380.method4682(class105, i_8_, (byte) 123);
				if (string != null)
					Class234.method2174(string, class105.aString1228, Class69.method794(class105, i_8_, -1663637577), 1007, class105.anInt1280 * -1232467723, (long) (1 + i_8_), -1309843523 * class105.anInt1154, -440872681 * class105.anInt1142, true, false, (long) (-1309843523 * class105.anInt1154 << 32 | -440872681 * class105.anInt1142), false, -1971978132);
			}
			String string = Class88.method977(class105, -1338609331);
			if (null != string)
				Class234.method2174(string, class105.aString1228, class105.anInt1232 * 2120029245, 25, -1232467723 * class105.anInt1280, 0L, -1309843523 * class105.anInt1154, class105.anInt1142 * -440872681, true, false, (long) ((class105.anInt1154 * -1309843523 << 32) | -440872681 * class105.anInt1142), false, -1797794884);
			for (int i_9_ = 4; i_9_ >= 0; i_9_--) {
				String string_10_ = Class380.method4682(class105, i_9_, (byte) 92);
				if (null != string_10_)
					Class234.method2174(string_10_, class105.aString1228, Class69.method794(class105, i_9_, -1654084952), 57, class105.anInt1280 * -1232467723, (long) (1 + i_9_), -1309843523 * class105.anInt1154, -440872681 * class105.anInt1142, true, false, (long) (class105.anInt1154 * -1309843523 << 32 | class105.anInt1142 * -440872681), false, -1801587230);
			}
			if (client.method2801(class105).method3492((byte) -120)) {
				if (class105.aString1230 != null)
					Class234.method2174(class105.aString1230, "", -1, 30, -1232467723 * class105.anInt1280, 0L, class105.anInt1154 * -1309843523, -440872681 * class105.anInt1142, true, false, (long) (-1309843523 * class105.anInt1154 << 32 | -440872681 * class105.anInt1142), false, -1225913379);
				else
					Class234.method2174(Tradution.aClass470_5784.method6049(Class321.aClass429_3357, -875414210), "", -1, 30, class105.anInt1280 * -1232467723, 0L, -1309843523 * class105.anInt1154, -440872681 * class105.anInt1142, true, false, (long) (-1309843523 * class105.anInt1154 << 32 | -440872681 * class105.anInt1142), false, -1304653626);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dn.v(").append(')').toString());
		}
	}
}
