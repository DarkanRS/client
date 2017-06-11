/* Class82_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub10 extends Class82 {
	public void method868() {
		Class107.method1144(true, (short) 3546);
	}

	public void method866(int i) {
		try {
			Class107.method1144(true, (short) 12990);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xv.f(").append(')').toString());
		}
	}

	public void method869() {
		Class107.method1144(true, (short) 8961);
	}

	Class82_Sub10(RsByteBuffer class298_sub53) {
		super(class298_sub53);
	}

	static final void method903(int i, int i_0_, int i_1_) {
		try {
			if (Class378.method4671(i, null, -1864950961))
				Class170.method1812((Class389.aClass119Array4165[i].aClass105Array1405), i_0_, (byte) 65);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xv.lv(").append(')').toString());
		}
	}

	static void method904(IComponentDefinition class105, int i, int i_2_, boolean bool, byte i_3_) {
		try {
			int i_4_ = -2093041337 * class105.anInt1156;
			int i_5_ = class105.anInt1162 * 457937409;
			if (class105.aByte1148 == 0)
				class105.anInt1156 = class105.anInt1253 * -86683899;
			else if (1 == class105.aByte1148)
				class105.anInt1156 = -614915977 * (i - 1769572195 * class105.anInt1253);
			else if (2 == class105.aByte1148)
				class105.anInt1156 = -614915977 * (i * (1769572195 * class105.anInt1253) >> 14);
			if (0 == class105.aByte1149)
				class105.anInt1162 = -472364941 * class105.anInt1153;
			else if (1 == class105.aByte1149)
				class105.anInt1162 = (i_2_ - class105.anInt1153 * -1747263885) * -67604991;
			else if (class105.aByte1149 == 2)
				class105.anInt1162 = -67604991 * (i_2_ * (-1747263885 * class105.anInt1153) >> 14);
			if (class105.aByte1148 == 4)
				class105.anInt1156 = -614915977 * (class105.anInt1158 * 1183580231 * (class105.anInt1162 * 457937409) / (class105.anInt1242 * 1289873889));
			if (class105.aByte1149 == 4)
				class105.anInt1162 = -67604991 * (-2093041337 * class105.anInt1156 * (1289873889 * class105.anInt1242) / (1183580231 * class105.anInt1158));
			if (client.aBoolean8846 && (client.method2801(class105).settingsHash * -1266165749 != 0 || class105.anInt1144 * -1215239439 == 0)) {
				if (class105.anInt1162 * 457937409 < 5 && -2093041337 * class105.anInt1156 < 5) {
					class105.anInt1162 = -338024955;
					class105.anInt1156 = 1220387411;
				} else {
					if (457937409 * class105.anInt1162 <= 0)
						class105.anInt1162 = -338024955;
					if (class105.anInt1156 * -2093041337 <= 0)
						class105.anInt1156 = 1220387411;
				}
			}
			if (class105.anInt1145 * 907611645 == IComponentDefinition.anInt1269 * -451364727)
				client.aClass105_8819 = class105;
			if (bool && class105.anObjectArray1164 != null && (i_4_ != class105.anInt1156 * -2093041337 || 457937409 * class105.anInt1162 != i_5_)) {
				Script class298_sub46 = new Script();
				class298_sub46.aClass105_7525 = class105;
				class298_sub46.params = class105.anObjectArray1164;
				client.aClass453_8893.method5935(class298_sub46, 528123519);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xv.kj(").append(')').toString());
		}
	}

	static void method905(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 - 2] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 2]), 245040087).anIntArrayArray4017[(((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1])][0]);
			((ClientScript2) class403).anInt5239 -= -391880689;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xv.s(").append(')').toString());
		}
	}
}
