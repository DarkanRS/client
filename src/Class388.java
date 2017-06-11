/* Class388 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.ArrayList;

public final class Class388 {
	static ArrayList anArrayList4149;
	static int anInt4150 = 200000;
	static int anInt4151;
	static int anInt4152 = 0;
	public static Class348 aClass348_4153;
	static boolean aBoolean4154;
	static String aString4155;
	static int[] anIntArray4156 = new int[3];
	static int anInt4157;
	static int anInt4158 = 2000000;

	static {
		aClass348_4153 = new Class348(4);
		aBoolean4154 = false;
		aString4155 = null;
		anArrayList4149 = new ArrayList();
		anInt4157 = 0;
		anInt4151 = 0;
	}

	Class388() throws Throwable {
		throw new Error();
	}

	static final void method4853(ClientScript2 class403, byte i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			//if (i_0_ >= 0 && i_0_ < client.anIntArray8828.length) {
			//	if (((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1) >= 0 && ((((Class403) class403).anInt5239 += -391880689) * 681479919 - 1) < ((Class403) class403).anIntArray5244.length) {
					((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.anIntArray8828[i_0_];
			//	}
			//}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qb.tc(").append(')').toString());
		}
	}

	static final void method4854(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			class105.aBoolean1211 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1;
			Tradution.method6054(class105, 37472514);
			if (-1 == -1309843523 * class105.anInt1154 && !class119.aBoolean1403)
				Class508.method6281(-440872681 * class105.anInt1142, 473698218);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qb.ga(").append(')').toString());
		}
	}

	static final void method4855(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub19_7567.method5696(1452563063) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qb.aod(").append(')').toString());
		}
	}
}
