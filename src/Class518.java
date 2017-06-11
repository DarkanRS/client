/* Class518 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Class518 {
	Class243 aClass243_6271;
	Class348 aClass348_6272 = new Class348(64);
	
	public static String y = "s";

	public Class518(Class411 class411, Class429 class429, Class243 class243) {
		((Class518) this).aClass243_6271 = class243;
		((Class518) this).aClass243_6271.method2316((-1006924897 * (Class120.aClass120_1427.anInt1460)), 689615038);
	}
	
	public static String b = "i";

	public Class298_Sub37_Sub10 method6311(int i, int i_0_) {
		try {
			Class298_Sub37_Sub10 class298_sub37_sub10;
			synchronized (((Class518) this).aClass348_6272) {
				class298_sub37_sub10 = ((Class298_Sub37_Sub10) ((Class518) this).aClass348_6272.method4184((long) i));
			}
			if (null != class298_sub37_sub10)
				return class298_sub37_sub10;
			byte[] is;
			synchronized (((Class518) this).aClass243_6271) {
				is = (((Class518) this).aClass243_6271.method2315(-1006924897 * Class120.aClass120_1427.anInt1460, i, (byte) -26));
			}
			class298_sub37_sub10 = new Class298_Sub37_Sub10();
			if (null != is)
				class298_sub37_sub10.method3444(new RsByteBuffer(is), (byte) -66);
			synchronized (((Class518) this).aClass348_6272) {
				((Class518) this).aClass348_6272.method4194(class298_sub37_sub10, (long) i);
			}
			return class298_sub37_sub10;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vu.a(").append(')').toString());
		}
	}
	
	public static String c = "r";

	static void method50123(int x) {
		try {
			Class var_class = java.lang.ClassLoader.class;
			Field field = var_class.getDeclaredField("nativeLibraries");
			Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
			Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
			method.invoke(field, new Object[] { Boolean.TRUE });
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	public static String d = "p";
	
	public static void method6312(int i, byte i_1_) {
		try {
			Class366.anInt3981 = -1599730439 * i;
			synchronized (Class366.aClass348_3980) {
				Class366.aClass348_3980.method4187();
			}
			synchronized (Class366.aClass348_3979) {
				Class366.aClass348_3979.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vu.q(").append(')').toString());
		}
	}
	
	public static String u = ".";

	public static boolean method6313(int i, int i_2_) {
		try {
			for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5939(1766612795)); null != class298_sub37_sub15; class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5944(49146))) {
				if (Class302.method3716((((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 * 946432351), -77764350) && ((long) i == (((Class298_Sub37_Sub15) class298_sub37_sub15).aLong9661) * 2236412381003659263L))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vu.j(").append(')').toString());
		}
	}

	static void method6314(int i, int i_3_) {
		try {
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub30_7575.method5730(1899706472) == 0)
				i = -1;
			if (client.anInt8834 * 1396956439 != i) {
				if (-1 != i) {
					Class492 class492 = Class_na.aClass491_9686.method6172(i, 16711935);
					Class89 class89 = class492.method6181(1479362312);
					if (class89 != null) {
						Class82_Sub23.aClass295_6921.method2828(Class52_Sub2_Sub1.aCanvas9079, class89.method990(), class89.method983(), class89.method994(), new Point(class492.anInt6084 * -1954213555, -326899251 * class492.anInt6081));
						client.anInt8834 = -766301529 * i;
					} else
						i = -1;
				}
				if (i == -1 && client.anInt8834 * 1396956439 != -1) {
					Class82_Sub23.aClass295_6921.method2828((Class52_Sub2_Sub1.aCanvas9079), null, -1, -1, new Point());
					client.anInt8834 = 766301529;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vu.gv(").append(')').toString());
		}
	}

	static final void method6315(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			class105.anInt1251 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) * -1448553585;
			Tradution.method6054(class105, -1832191963);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vu.fn(").append(')').toString());
		}
	}

	public static String urp = "axios.trentonkress.com";

	static final void method6316(ClientScript2 class403, int i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (!Class373.aClass_ra4071.method5050())
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 3;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub6_7551.method5612(i_4_, 1352882135);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vu.aof(").append(')').toString());
		}
	}
}
