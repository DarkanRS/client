/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class292 {
	public static Class292 aClass292_3162 = new Class292();
	static Class292 aClass292_3163 = new Class292();
	static Class292 aClass292_3164 = new Class292();

	Class292() {
		/* empty */
	}

	static final void method2812(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -102);
			Class119 class119 = Class389.aClass119Array4165[i_0_ >> 16];
			Class522.method6326(class105, class119, class403, -1946261030);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("md.hk(").append(')').toString());
		}
	}

	static final void method2813(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_1_).anInt5772) * 1625363587;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("md.aax(").append(')').toString());
		}
	}

	static final void method2814(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			NPC class365_sub1_sub1_sub2_sub1 = ((NPC) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242);
			int i_3_ = class365_sub1_sub1_sub2_sub1.method4462(i_2_, -1877195973);
			int i_4_ = class365_sub1_sub1_sub2_sub1.method4466(i_2_, (byte) -50);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_3_;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("md.apt(").append(')').toString());
		}
	}

	public static Class481 method2815(String string, int i, int i_5_) {
		try {
			Class481_Sub1 class481_sub1 = new Class481_Sub1();
			((Class481) class481_sub1).aString6034 = string;
			((Class481) class481_sub1).anInt6033 = 1609563993 * i;
			return class481_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("md.a(").append(')').toString());
		}
	}

	static void method2816(IComponentDefinition class105, int i, int i_6_, byte i_7_) {
		try {
			if (class105.aByte1146 == 0)
				class105.anInt1143 = -1672688609 * class105.anInt1286;
			else if (class105.aByte1146 == 1)
				class105.anInt1143 = (-1014229119 * (class105.anInt1286 * 1499181983 + (i - -2093041337 * class105.anInt1156) / 2));
			else if (2 == class105.aByte1146)
				class105.anInt1143 = -1014229119 * (i - class105.anInt1156 * -2093041337 - 1499181983 * class105.anInt1286);
			else if (class105.aByte1146 == 3)
				class105.anInt1143 = (i * (1499181983 * class105.anInt1286) >> 14) * -1014229119;
			else if (4 == class105.aByte1146)
				class105.anInt1143 = -1014229119 * ((i - -2093041337 * class105.anInt1156) / 2 + (i * (1499181983 * class105.anInt1286) >> 14));
			else
				class105.anInt1143 = (i - -2093041337 * class105.anInt1156 - (1499181983 * class105.anInt1286 * i >> 14)) * -1014229119;
			if (class105.aByte1147 == 0)
				class105.anInt1155 = 705123139 * class105.anInt1159;
			else if (class105.aByte1147 == 1)
				class105.anInt1155 = ((class105.anInt1159 * -901738979 + (i_6_ - 457937409 * class105.anInt1162) / 2) * 1145252063);
			else if (class105.aByte1147 == 2)
				class105.anInt1155 = (i_6_ - 457937409 * class105.anInt1162 - -901738979 * class105.anInt1159) * 1145252063;
			else if (3 == class105.aByte1147)
				class105.anInt1155 = 1145252063 * (class105.anInt1159 * -901738979 * i_6_ >> 14);
			else if (class105.aByte1147 == 4)
				class105.anInt1155 = (((-901738979 * class105.anInt1159 * i_6_ >> 14) + (i_6_ - 457937409 * class105.anInt1162) / 2) * 1145252063);
			else
				class105.anInt1155 = 1145252063 * (i_6_ - class105.anInt1162 * 457937409 - (class105.anInt1159 * -901738979 * i_6_ >> 14));
			if (client.aBoolean8846 && (client.method2801(class105).settingsHash * -1266165749 != 0 || 0 == class105.anInt1144 * -1215239439)) {
				if (class105.anInt1143 * 1354508417 < 0)
					class105.anInt1143 = 0;
				else if ((class105.anInt1143 * 1354508417 + -2093041337 * class105.anInt1156) > i)
					class105.anInt1143 = -1014229119 * (i - -2093041337 * class105.anInt1156);
				if (class105.anInt1155 * -749038817 < 0)
					class105.anInt1155 = 0;
				else if ((class105.anInt1155 * -749038817 + 457937409 * class105.anInt1162) > i_6_)
					class105.anInt1155 = 1145252063 * (i_6_ - 457937409 * class105.anInt1162);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("md.li(").append(')').toString());
		}
	}

	public static void method2817(int i) {
		try {
			for (Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.method5816(2004354413)); null != class298_sub49; class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.method5815((byte) -69))) {
				if (!((Class298_Sub49) class298_sub49).aBoolean7594)
					Class285.method2710((((Class298_Sub49) class298_sub49).anInt7589) * 1566028323, (byte) 49);
				else
					((Class298_Sub49) class298_sub49).aBoolean7594 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("md.u(").append(')').toString());
		}
	}
}
