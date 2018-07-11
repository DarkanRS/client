/* Class239 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class239 {
	Class535 aClass535_2931;
	static int anInt2932;
	static final float aFloat2933 = 1.1523438F;
	static final float aFloat2934 = 0.69921875F;
	static int anInt2935 = -915243579;
	long aLong2936;
	Class535 aClass535_2937;
	static final int anInt2938 = -50;
	static final int anInt2939 = 0;
	static Class247 aClass247_2940;
	static final int anInt2941 = -60;
	static int anInt2942;
	Class535[][] aClass535ArrayArray2943;
	GraphicalRenderer aClass505_2944;
	int anInt2945;
	int anInt2946 = 0;
	boolean aBool2947;
	Class535 aClass535_2948;
	static final int anInt2949 = -50;
	static final float aFloat2950 = 1.2F;
	Class535 aClass535_2951;
	Vector3 aClass385_2952;
	SoftCache aClass229_2953;
	SoftCache aClass229_2954;

	void method4036() {
		((Class239) this).aClass505_2944.IA((0.7F + (float) Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870) * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(-1217777158)) * ((Class535) ((Class239) this).aClass535_2951).aFloat7081);
		((Class239) this).aClass505_2944.m((783185137 * ((Class535) ((Class239) this).aClass535_2951).anInt7083), ((Class535) ((Class239) this).aClass535_2951).aFloat7082, ((Class535) ((Class239) this).aClass535_2951).aFloat7090, (float) ((int) ((Class239) this).aClass385_2952.x << 2), (float) ((int) ((Class239) this).aClass385_2952.y << 2), (float) ((int) ((Class239) this).aClass385_2952.z << 2));
		((Class239) this).aClass505_2944.method8477(((Class535) ((Class239) this).aClass535_2951).aClass152_7087);
	}

	public void method4037(MapRegion class257, byte i) {
		if (Class97.method1612(-1741204137 * client.anInt7166, 1908805257) || Class282_Sub17.method12259(-1741204137 * client.anInt7166, -1116602507))
			method4072(Class31.anInt361 * -360258135 >> 12, 413271601 * Class246.anInt3029 >> 12, -234390203 * anInt2942, -1959454932);
		else {
			int i_0_ = -1;
			int i_1_ = -1;
			if (null != Class84.myPlayer) {
				i_0_ = (Class84.myPlayer.regionBaseX[0]) >> 3;
				i_1_ = (Class84.myPlayer.regionBaseY[0]) >> 3;
			}
			if (i_0_ < 0 || i_0_ >= class257.getSizeX(-1174933270) >> 3 || i_1_ < 0 || i_1_ >= class257.getSizeY(-1872557951) >> 3)
				method4072(class257.getSizeX(-848412942) >> 4, class257.getSizeY(-1591004572) >> 4, 0, -1860642378);
			else
				method4072(i_0_, i_1_, -234390203 * anInt2942, -1945601333);
		}
		method4065(16711935);
		method4049((byte) 97);
		method4051(-2036397088);
		method4075(-2065291582);
	}

	public Class535 method4038(short i) {
		return ((Class239) this).aClass535_2951;
	}

	public void method4039(Class239 class239_2_, byte i) {
		((Class239) this).aClass535_2951.method11444(((Class239) class239_2_).aClass535_2951, -1309813608);
		((Class239) this).aClass535_2937.method11444(((Class239) class239_2_).aClass535_2937, -1309813608);
		((Class239) this).aClass535_2931.method11444(((Class239) class239_2_).aClass535_2931, -1309813608);
		((Class239) this).aLong2936 = 1L * ((Class239) class239_2_).aLong2936;
		((Class239) this).anInt2946 = 1 * ((Class239) class239_2_).anInt2946;
		((Class239) this).anInt2945 = ((Class239) class239_2_).anInt2945 * 1;
	}

	public void method4040(int i) {
		((Class239) this).aClass229_2953.method3859(-1350574454);
		((Class239) this).aClass229_2954.method3859(-1414478211);
	}

	void method4041() {
		if (((Class239) this).anInt2945 * 1863439521 >= 0) {
			long l = Class169.method2869(1604585678);
			((Class239) this).anInt2945 -= ((l - ((Class239) this).aLong2936 * 662631799317739713L) * 824774497L);
			if (1863439521 * ((Class239) this).anInt2945 > 0)
				((Class239) this).aClass535_2951.method11445(((Class239) this).aClass505_2944, ((Class239) this).aClass535_2937, ((Class239) this).aClass535_2931, ((float) (((Class239) this).anInt2946 * 1678562179 - 1863439521 * ((Class239) this).anInt2945) / (float) (1678562179 * ((Class239) this).anInt2946)), (byte) 24);
			else {
				((Class239) this).aClass535_2951.method11444((((Class239) this).aClass535_2931), -1309813608);
				if ((((Class535) ((Class239) this).aClass535_2951).aClass247_7091) != null)
					((Class535) ((Class239) this).aClass535_2951).aClass247_7091.method4209(202966170);
				((Class239) this).anInt2945 = -824774497;
			}
			((Class239) this).aLong2936 = l * 8475826069062178625L;
		}
	}

	Class247 method4042(int i, int i_3_, int i_4_, int i_5_) {
		long l = (((long) i_3_ & 0xffffL) << 48 | ((long) i_4_ & 0xffffL) << 32 | ((long) i_5_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class247 class247 = (Class247) ((Class239) this).aClass229_2954.get(l);
		if (null == class247) {
			class247 = IndexLoaders.aClass288_1746.method5077(i, i_3_, i_4_, i_5_, IndexLoaders.aClass45_5759, 1560540952);
			((Class239) this).aClass229_2954.put(class247, l);
		}
		return class247;
	}

	public void method4043(int i, int i_6_, Class535 class535) {
		((Class239) this).aClass535ArrayArray2943[i][i_6_] = class535;
	}

	public void method4044(int i) {
		for (int i_7_ = 0; i_7_ < ((Class239) this).aClass535ArrayArray2943.length; i_7_++) {
			for (int i_8_ = 0; i_8_ < ((Class239) this).aClass535ArrayArray2943[i_7_].length; i_8_++)
				((Class239) this).aClass535ArrayArray2943[i_7_][i_8_] = ((Class239) this).aClass535_2948;
		}
	}

	public void method4045(int i, int i_9_, int i_10_) {
		Class535 class535 = ((Class239) this).aClass535ArrayArray2943[i][i_9_];
		if (null != class535)
			((Class239) this).aClass385_2952.copy(((Class535) class535).aClass385_7084);
		method4049((byte) 70);
	}

	void method4046() {
		((Class239) this).aClass505_2944.IA((0.7F + (float) Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870) * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(899196772)) * ((Class535) ((Class239) this).aClass535_2951).aFloat7081);
		((Class239) this).aClass505_2944.m((783185137 * ((Class535) ((Class239) this).aClass535_2951).anInt7083), ((Class535) ((Class239) this).aClass535_2951).aFloat7082, ((Class535) ((Class239) this).aClass535_2951).aFloat7090, (float) ((int) ((Class239) this).aClass385_2952.x << 2), (float) ((int) ((Class239) this).aClass385_2952.y << 2), (float) ((int) ((Class239) this).aClass385_2952.z << 2));
		((Class239) this).aClass505_2944.method8477(((Class535) ((Class239) this).aClass535_2951).aClass152_7087);
	}

	public void method4047() {
		for (int i = 0; i < ((Class239) this).aClass535ArrayArray2943.length; i++) {
			for (int i_11_ = 0; i_11_ < ((Class239) this).aClass535ArrayArray2943[i].length; i_11_++)
				((Class239) this).aClass535ArrayArray2943[i][i_11_] = ((Class239) this).aClass535_2948;
		}
	}

	public void method4048(int i) {
		((Class239) this).aBool2947 = true;
	}

	void method4049(byte i) {
		((Class239) this).aClass505_2944.IA((0.7F + (float) Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870) * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(-1566103967)) * ((Class535) ((Class239) this).aClass535_2951).aFloat7081);
		((Class239) this).aClass505_2944.m((783185137 * ((Class535) ((Class239) this).aClass535_2951).anInt7083), ((Class535) ((Class239) this).aClass535_2951).aFloat7082, ((Class535) ((Class239) this).aClass535_2951).aFloat7090, (float) ((int) ((Class239) this).aClass385_2952.x << 2), (float) ((int) ((Class239) this).aClass385_2952.y << 2), (float) ((int) ((Class239) this).aClass385_2952.z << 2));
		((Class239) this).aClass505_2944.method8477(((Class535) ((Class239) this).aClass535_2951).aClass152_7087);
	}

	Class247 method4050(int i, int i_12_, int i_13_, int i_14_, byte i_15_) {
		long l = (((long) i_12_ & 0xffffL) << 48 | ((long) i_13_ & 0xffffL) << 32 | ((long) i_14_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class247 class247 = (Class247) ((Class239) this).aClass229_2954.get(l);
		if (null == class247) {
			class247 = IndexLoaders.aClass288_1746.method5077(i, i_12_, i_13_, i_14_, IndexLoaders.aClass45_5759, 1868752196);
			((Class239) this).aClass229_2954.put(class247, l);
		}
		return class247;
	}

	void method4051(int i) {
		((Class239) this).aClass505_2944.method8472(((Class535) ((Class239) this).aClass535_2951).aFloat7080, ((Class535) ((Class239) this).aClass535_2951).aFloat7088, ((Class535) ((Class239) this).aClass535_2951).aFloat7089, (byte) 12);
	}

	public void method4052(byte i) {
		((Class239) this).aClass505_2944.IA((0.7F + (float) Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870) * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(-1614008770)) * 1.1523438F);
		((Class239) this).aClass505_2944.m(-1226832141 * anInt2935, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		((Class239) this).aClass505_2944.c(anInt2932 * 820300105, -1, 0);
		((Class239) this).aClass505_2944.method8477(Class81.aClass152_802);
	}

	static {
		anInt2932 = -1144904856;
		anInt2942 = 1665259205;
	}

	public void method4053() {
		for (int i = 0; i < ((Class239) this).aClass535ArrayArray2943.length; i++) {
			for (int i_16_ = 0; i_16_ < ((Class239) this).aClass535ArrayArray2943[i].length; i_16_++)
				((Class239) this).aClass535ArrayArray2943[i][i_16_] = ((Class239) this).aClass535_2948;
		}
	}

	public void method4054(MapRegion class257) {
		if (Class97.method1612(-1741204137 * client.anInt7166, 1908805257) || Class282_Sub17.method12259(-1741204137 * client.anInt7166, -2041088455))
			method4072(Class31.anInt361 * -360258135 >> 12, 413271601 * Class246.anInt3029 >> 12, -234390203 * anInt2942, -2132462841);
		else {
			int i = -1;
			int i_17_ = -1;
			if (null != Class84.myPlayer) {
				i = (Class84.myPlayer.regionBaseX[0]) >> 3;
				i_17_ = (Class84.myPlayer.regionBaseY[0]) >> 3;
			}
			if (i < 0 || i >= class257.getSizeX(-1066552159) >> 3 || i_17_ < 0 || i_17_ >= class257.getSizeY(-1514282256) >> 3)
				method4072(class257.getSizeX(762572794) >> 4, class257.getSizeY(-749819506) >> 4, 0, -2134388598);
			else
				method4072(i, i_17_, -234390203 * anInt2942, -2130629821);
		}
		method4065(16711935);
		method4049((byte) 58);
		method4051(-950771888);
		method4075(-1569721475);
	}

	public void method4055(MapRegion class257) {
		if (Class97.method1612(-1741204137 * client.anInt7166, 1908805257) || Class282_Sub17.method12259(-1741204137 * client.anInt7166, -1434312970))
			method4072(Class31.anInt361 * -360258135 >> 12, 413271601 * Class246.anInt3029 >> 12, -234390203 * anInt2942, -1938260506);
		else {
			int i = -1;
			int i_18_ = -1;
			if (null != Class84.myPlayer) {
				i = (Class84.myPlayer.regionBaseX[0]) >> 3;
				i_18_ = (Class84.myPlayer.regionBaseY[0]) >> 3;
			}
			if (i < 0 || i >= class257.getSizeX(-103338097) >> 3 || i_18_ < 0 || i_18_ >= class257.getSizeY(-2144456749) >> 3)
				method4072(class257.getSizeX(-305951268) >> 4, class257.getSizeY(-1691483286) >> 4, 0, -2133166479);
			else
				method4072(i, i_18_, -234390203 * anInt2942, -1899763635);
		}
		method4065(16711935);
		method4049((byte) 68);
		method4051(-508452656);
		method4075(-1316838437);
	}

	public void method4056(int i, int i_19_, Class535 class535, byte i_20_) {
		((Class239) this).aClass535ArrayArray2943[i][i_19_] = class535;
	}

	public void method4057(MapRegion class257) {
		if (Class97.method1612(-1741204137 * client.anInt7166, 1908805257) || Class282_Sub17.method12259(-1741204137 * client.anInt7166, -1936941263))
			method4072(Class31.anInt361 * -360258135 >> 12, 413271601 * Class246.anInt3029 >> 12, -234390203 * anInt2942, -1795193497);
		else {
			int i = -1;
			int i_21_ = -1;
			if (null != Class84.myPlayer) {
				i = (Class84.myPlayer.regionBaseX[0]) >> 3;
				i_21_ = (Class84.myPlayer.regionBaseY[0]) >> 3;
			}
			if (i < 0 || i >= class257.getSizeX(-10335230) >> 3 || i_21_ < 0 || i_21_ >= class257.getSizeY(-408655960) >> 3)
				method4072(class257.getSizeX(-2023934615) >> 4, class257.getSizeY(-1063099912) >> 4, 0, -2033757495);
			else
				method4072(i, i_21_, -234390203 * anInt2942, -1855467463);
		}
		method4065(16711935);
		method4049((byte) 61);
		method4051(-1044478085);
		method4075(-354915300);
	}

	public Class535 method4058() {
		return ((Class239) this).aClass535_2951;
	}

	public Class535 method4059() {
		return ((Class239) this).aClass535_2951;
	}

	public void method4060(Class239 class239_22_) {
		((Class239) this).aClass535_2951.method11444((((Class239) class239_22_).aClass535_2951), -1309813608);
		((Class239) this).aClass535_2937.method11444((((Class239) class239_22_).aClass535_2937), -1309813608);
		((Class239) this).aClass535_2931.method11444((((Class239) class239_22_).aClass535_2931), -1309813608);
		((Class239) this).aLong2936 = 1L * ((Class239) class239_22_).aLong2936;
		((Class239) this).anInt2946 = 1 * ((Class239) class239_22_).anInt2946;
		((Class239) this).anInt2945 = ((Class239) class239_22_).anInt2945 * 1;
	}

	public void method4061() {
		((Class239) this).aClass229_2953.method3859(482121213);
		((Class239) this).aClass229_2954.method3859(620207987);
	}

	public void method4062() {
		((Class239) this).aClass229_2953.method3859(876248154);
		((Class239) this).aClass229_2954.method3859(-1606174557);
	}

	Class152 method4063(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
		long l = (67481L * (long) i ^ 97549L * (long) i_23_ ^ 475427L * (long) i_24_ ^ 986053L * (long) i_25_ ^ (long) i_26_ * 32147369L ^ 76724863L * (long) i_27_);
		Class152 class152 = (Class152) ((Class239) this).aClass229_2953.get(l);
		if (null != class152)
			return class152;
		class152 = ((Class239) this).aClass505_2944.method8466(i, i_23_, i_24_, i_25_, i_26_, i_27_);
		((Class239) this).aClass229_2953.put(class152, l);
		return class152;
	}

	Class152 method4064(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		long l = (67481L * (long) i ^ 97549L * (long) i_28_ ^ 475427L * (long) i_29_ ^ 986053L * (long) i_30_ ^ (long) i_31_ * 32147369L ^ 76724863L * (long) i_32_);
		Class152 class152 = (Class152) ((Class239) this).aClass229_2953.get(l);
		if (null != class152)
			return class152;
		class152 = ((Class239) this).aClass505_2944.method8466(i, i_28_, i_29_, i_30_, i_31_, i_32_);
		((Class239) this).aClass229_2953.put(class152, l);
		return class152;
	}

	void method4065(int i) {
		if (((Class239) this).anInt2945 * 1863439521 >= 0) {
			long l = Class169.method2869(2103046036);
			((Class239) this).anInt2945 -= ((l - ((Class239) this).aLong2936 * 662631799317739713L) * 824774497L);
			if (1863439521 * ((Class239) this).anInt2945 > 0)
				((Class239) this).aClass535_2951.method11445(((Class239) this).aClass505_2944, ((Class239) this).aClass535_2937, ((Class239) this).aClass535_2931, ((float) (((Class239) this).anInt2946 * 1678562179 - 1863439521 * ((Class239) this).anInt2945) / (float) (1678562179 * ((Class239) this).anInt2946)), (byte) 24);
			else {
				((Class239) this).aClass535_2951.method11444((((Class239) this).aClass535_2931), -1309813608);
				if ((((Class535) ((Class239) this).aClass535_2951).aClass247_7091) != null)
					((Class535) ((Class239) this).aClass535_2951).aClass247_7091.method4209(202966170);
				((Class239) this).anInt2945 = -824774497;
			}
			((Class239) this).aLong2936 = l * 8475826069062178625L;
		}
	}

	Class247 method4066(int i, int i_34_, int i_35_, int i_36_) {
		long l = (((long) i_34_ & 0xffffL) << 48 | ((long) i_35_ & 0xffffL) << 32 | ((long) i_36_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class247 class247 = (Class247) ((Class239) this).aClass229_2954.get(l);
		if (null == class247) {
			class247 = IndexLoaders.aClass288_1746.method5077(i, i_34_, i_35_, i_36_, IndexLoaders.aClass45_5759, 1824037577);
			((Class239) this).aClass229_2954.put(class247, l);
		}
		return class247;
	}

	public void method4067(int i, int i_37_) {
		Class535 class535 = ((Class239) this).aClass535ArrayArray2943[i][i_37_];
		if (null != class535)
			((Class239) this).aClass385_2952.copy(((Class535) class535).aClass385_7084);
		method4049((byte) 68);
	}

	public void method4068() {
		((Class239) this).aClass505_2944.IA((0.7F + (float) Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870) * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(455484829)) * 1.1523438F);
		((Class239) this).aClass505_2944.m(-1226832141 * anInt2935, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		((Class239) this).aClass505_2944.c(anInt2932 * 820300105, -1, 0);
		((Class239) this).aClass505_2944.method8477(Class81.aClass152_802);
	}

	public void method4069() {
		int i = 0;
		int i_38_ = ((256 + -1617038559 * ((Class535) (((Class239) this).aClass535_2951)).anInt7086 << 2) + i);
		((Class239) this).aClass505_2944.c((((Class535) ((Class239) this).aClass535_2951).anInt7085) * 227569303, (Class393.aClass282_Sub54_4783.aClass468_Sub30_8194.method13417(-1798368470) == 1 ? i_38_ : -1), 0);
	}

	public void method4070(MapRegion class257) {
		if (Class97.method1612(-1741204137 * client.anInt7166, 1908805257) || Class282_Sub17.method12259(-1741204137 * client.anInt7166, -1876730094))
			method4072(Class31.anInt361 * -360258135 >> 12, 413271601 * Class246.anInt3029 >> 12, -234390203 * anInt2942, -1902980348);
		else {
			int i = -1;
			int i_39_ = -1;
			if (null != Class84.myPlayer) {
				i = (Class84.myPlayer.regionBaseX[0]) >> 3;
				i_39_ = (Class84.myPlayer.regionBaseY[0]) >> 3;
			}
			if (i < 0 || i >= class257.getSizeX(1657103484) >> 3 || i_39_ < 0 || i_39_ >= class257.getSizeY(-1710669290) >> 3)
				method4072(class257.getSizeX(-251111200) >> 4, class257.getSizeY(-1964037741) >> 4, 0, -1798457661);
			else
				method4072(i, i_39_, -234390203 * anInt2942, -2082529410);
		}
		method4065(16711935);
		method4049((byte) 71);
		method4051(-304050770);
		method4075(-2048959746);
	}

	public void method4071() {
		for (int i = 0; i < ((Class239) this).aClass535ArrayArray2943.length; i++) {
			for (int i_40_ = 0; i_40_ < ((Class239) this).aClass535ArrayArray2943[i].length; i_40_++)
				((Class239) this).aClass535ArrayArray2943[i][i_40_] = ((Class239) this).aClass535_2948;
		}
	}

	void method4072(int i, int i_41_, int i_42_, int i_43_) {
		Class535 class535 = ((Class239) this).aClass535ArrayArray2943[i][i_41_];
		if (class535 == null)
			class535 = ((Class239) this).aClass535_2948;
		if (((Class239) this).aBool2947) {
			((Class239) this).aBool2947 = false;
			i_42_ = 0;
		}
		if (!((Class239) this).aClass535_2931.method11449(class535, -1943830455)) {
			((Class239) this).aClass535_2931.method11444(class535, -1309813608);
			((Class239) this).aLong2936 = Class169.method2869(2064594062) * 8475826069062178625L;
			((Class239) this).anInt2946 = (((Class239) this).anInt2945 = i_42_ * 824774497) * -404362741;
			if (1678562179 * ((Class239) this).anInt2946 != 0) {
				((Class239) this).aClass535_2937.method11444((((Class239) this).aClass535_2951), -1309813608);
				if (null != (((Class535) ((Class239) this).aClass535_2951).aClass247_7091)) {
					if (((Class535) ((Class239) this).aClass535_2951).aClass247_7091.method4210((short) -24183))
						((Class535) ((Class239) this).aClass535_2951).aClass247_7091 = ((Class535) ((Class239) this).aClass535_2937).aClass247_7091 = ((Class535) ((Class239) this).aClass535_2951).aClass247_7091.method4211((byte) 58);
					if (null != (((Class535) ((Class239) this).aClass535_2951).aClass247_7091) && ((((Class535) ((Class239) this).aClass535_2951).aClass247_7091) != (((Class535) ((Class239) this).aClass535_2931).aClass247_7091)))
						((Class535) ((Class239) this).aClass535_2951).aClass247_7091.method4208((((Class535) ((Class239) this).aClass535_2931).aClass247_7091), 2142547957);
				}
			}
		}
	}

	void method4073(int i, int i_44_, int i_45_) {
		Class535 class535 = ((Class239) this).aClass535ArrayArray2943[i][i_44_];
		if (class535 == null)
			class535 = ((Class239) this).aClass535_2948;
		if (((Class239) this).aBool2947) {
			((Class239) this).aBool2947 = false;
			i_45_ = 0;
		}
		if (!((Class239) this).aClass535_2931.method11449(class535, 1482468023)) {
			((Class239) this).aClass535_2931.method11444(class535, -1309813608);
			((Class239) this).aLong2936 = Class169.method2869(1556811075) * 8475826069062178625L;
			((Class239) this).anInt2946 = (((Class239) this).anInt2945 = i_45_ * 824774497) * -404362741;
			if (1678562179 * ((Class239) this).anInt2946 != 0) {
				((Class239) this).aClass535_2937.method11444((((Class239) this).aClass535_2951), -1309813608);
				if (null != (((Class535) ((Class239) this).aClass535_2951).aClass247_7091)) {
					if (((Class535) ((Class239) this).aClass535_2951).aClass247_7091.method4210((short) -7741))
						((Class535) ((Class239) this).aClass535_2951).aClass247_7091 = ((Class535) ((Class239) this).aClass535_2937).aClass247_7091 = ((Class535) ((Class239) this).aClass535_2951).aClass247_7091.method4211((byte) 113);
					if (null != (((Class535) ((Class239) this).aClass535_2951).aClass247_7091) && ((((Class535) ((Class239) this).aClass535_2951).aClass247_7091) != (((Class535) ((Class239) this).aClass535_2931).aClass247_7091)))
						((Class535) ((Class239) this).aClass535_2951).aClass247_7091.method4208((((Class535) ((Class239) this).aClass535_2931).aClass247_7091), 2133278080);
				}
			}
		}
	}

	void method4074(int i, int i_46_, int i_47_) {
		Class535 class535 = ((Class239) this).aClass535ArrayArray2943[i][i_46_];
		if (class535 == null)
			class535 = ((Class239) this).aClass535_2948;
		if (((Class239) this).aBool2947) {
			((Class239) this).aBool2947 = false;
			i_47_ = 0;
		}
		if (!((Class239) this).aClass535_2931.method11449(class535, -1020556150)) {
			((Class239) this).aClass535_2931.method11444(class535, -1309813608);
			((Class239) this).aLong2936 = Class169.method2869(2036177754) * 8475826069062178625L;
			((Class239) this).anInt2946 = (((Class239) this).anInt2945 = i_47_ * 824774497) * -404362741;
			if (1678562179 * ((Class239) this).anInt2946 != 0) {
				((Class239) this).aClass535_2937.method11444((((Class239) this).aClass535_2951), -1309813608);
				if (null != (((Class535) ((Class239) this).aClass535_2951).aClass247_7091)) {
					if (((Class535) ((Class239) this).aClass535_2951).aClass247_7091.method4210((short) -213))
						((Class535) ((Class239) this).aClass535_2951).aClass247_7091 = ((Class535) ((Class239) this).aClass535_2937).aClass247_7091 = ((Class535) ((Class239) this).aClass535_2951).aClass247_7091.method4211((byte) 45);
					if (null != (((Class535) ((Class239) this).aClass535_2951).aClass247_7091) && ((((Class535) ((Class239) this).aClass535_2951).aClass247_7091) != (((Class535) ((Class239) this).aClass535_2931).aClass247_7091)))
						((Class535) ((Class239) this).aClass535_2951).aClass247_7091.method4208((((Class535) ((Class239) this).aClass535_2931).aClass247_7091), 404593339);
				}
			}
		}
	}

	public void method4075(int i) {
		int i_48_ = 0;
		int i_49_ = ((256 + -1617038559 * ((Class535) (((Class239) this).aClass535_2951)).anInt7086 << 2) + i_48_);
		((Class239) this).aClass505_2944.c((((Class535) ((Class239) this).aClass535_2951).anInt7085) * 227569303, (Class393.aClass282_Sub54_4783.aClass468_Sub30_8194.method13417(-2079793648) == 1 ? i_49_ : -1), 0);
	}

	public void method4076() {
		((Class239) this).aBool2947 = true;
	}

	public void method4077() {
		((Class239) this).aBool2947 = true;
	}

	void method4078() {
		((Class239) this).aClass505_2944.IA((0.7F + (float) Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870) * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(-677567831)) * ((Class535) ((Class239) this).aClass535_2951).aFloat7081);
		((Class239) this).aClass505_2944.m((783185137 * ((Class535) ((Class239) this).aClass535_2951).anInt7083), ((Class535) ((Class239) this).aClass535_2951).aFloat7082, ((Class535) ((Class239) this).aClass535_2951).aFloat7090, (float) ((int) ((Class239) this).aClass385_2952.x << 2), (float) ((int) ((Class239) this).aClass385_2952.y << 2), (float) ((int) ((Class239) this).aClass385_2952.z << 2));
		((Class239) this).aClass505_2944.method8477(((Class535) ((Class239) this).aClass535_2951).aClass152_7087);
	}

	public Class239(GraphicalRenderer class505, int i, int i_50_) {
		((Class239) this).anInt2945 = -824774497;
		((Class239) this).aLong2936 = 0L;
		((Class239) this).aBool2947 = false;
		((Class239) this).aClass385_2952 = new Vector3(-50.0F, -60.0F, -50.0F);
		((Class239) this).aClass229_2953 = new SoftCache(9);
		((Class239) this).aClass229_2954 = new SoftCache(9);
		((Class239) this).aClass505_2944 = class505;
		((Class239) this).aClass535ArrayArray2943 = new Class535[i][i_50_];
		if (null != Class210.anIntArray2668)
			Class81.aClass152_802 = method4064(Class210.anIntArray2668[0], Class210.anIntArray2668[1], Class210.anIntArray2668[2], Class210.anIntArray2668[3], Class210.anIntArray2668[4], Class210.anIntArray2668[5], 106789318);
		aClass247_2940 = null;
		((Class239) this).aClass535_2948 = new Class535();
		((Class239) this).aClass535_2951 = new Class535();
		((Class239) this).aClass535_2937 = new Class535();
		((Class239) this).aClass535_2931 = new Class535();
		method4048(899760555);
	}

	Class247 method4079(int i, int i_51_, int i_52_, int i_53_) {
		long l = (((long) i_51_ & 0xffffL) << 48 | ((long) i_52_ & 0xffffL) << 32 | ((long) i_53_ & 0xffffL) << 16 | (long) i & 0xffffL);
		Class247 class247 = (Class247) ((Class239) this).aClass229_2954.get(l);
		if (null == class247) {
			class247 = IndexLoaders.aClass288_1746.method5077(i, i_51_, i_52_, i_53_, IndexLoaders.aClass45_5759, 2026640567);
			((Class239) this).aClass229_2954.put(class247, l);
		}
		return class247;
	}

	void method4080() {
		((Class239) this).aClass505_2944.IA((0.7F + (float) Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870) * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(557786587)) * ((Class535) ((Class239) this).aClass535_2951).aFloat7081);
		((Class239) this).aClass505_2944.m((783185137 * ((Class535) ((Class239) this).aClass535_2951).anInt7083), ((Class535) ((Class239) this).aClass535_2951).aFloat7082, ((Class535) ((Class239) this).aClass535_2951).aFloat7090, (float) ((int) ((Class239) this).aClass385_2952.x << 2), (float) ((int) ((Class239) this).aClass385_2952.y << 2), (float) ((int) ((Class239) this).aClass385_2952.z << 2));
		((Class239) this).aClass505_2944.method8477(((Class535) ((Class239) this).aClass535_2951).aClass152_7087);
	}

	void method4081() {
		((Class239) this).aClass505_2944.IA((0.7F + (float) Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870) * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(-596084463)) * ((Class535) ((Class239) this).aClass535_2951).aFloat7081);
		((Class239) this).aClass505_2944.m((783185137 * ((Class535) ((Class239) this).aClass535_2951).anInt7083), ((Class535) ((Class239) this).aClass535_2951).aFloat7082, ((Class535) ((Class239) this).aClass535_2951).aFloat7090, (float) ((int) ((Class239) this).aClass385_2952.x << 2), (float) ((int) ((Class239) this).aClass385_2952.y << 2), (float) ((int) ((Class239) this).aClass385_2952.z << 2));
		((Class239) this).aClass505_2944.method8477(((Class535) ((Class239) this).aClass535_2951).aClass152_7087);
	}

	public void method4082() {
		int i = 0;
		int i_54_ = ((256 + -1617038559 * ((Class535) (((Class239) this).aClass535_2951)).anInt7086 << 2) + i);
		((Class239) this).aClass505_2944.c((((Class535) ((Class239) this).aClass535_2951).anInt7085) * 227569303, (Class393.aClass282_Sub54_4783.aClass468_Sub30_8194.method13417(-1818521455) == 1 ? i_54_ : -1), 0);
	}

	public void method4083(int i, int i_55_, Class535 class535) {
		((Class239) this).aClass535ArrayArray2943[i][i_55_] = class535;
	}

	void method4084() {
		((Class239) this).aClass505_2944.method8472(((Class535) ((Class239) this).aClass535_2951).aFloat7080, ((Class535) ((Class239) this).aClass535_2951).aFloat7088, ((Class535) ((Class239) this).aClass535_2951).aFloat7089, (byte) 12);
	}

	void method4085() {
		((Class239) this).aClass505_2944.method8472(((Class535) ((Class239) this).aClass535_2951).aFloat7080, ((Class535) ((Class239) this).aClass535_2951).aFloat7088, ((Class535) ((Class239) this).aClass535_2951).aFloat7089, (byte) 12);
	}

	public void method4086(MapRegion class257) {
		if (Class97.method1612(-1741204137 * client.anInt7166, 1908805257) || Class282_Sub17.method12259(-1741204137 * client.anInt7166, -1950976700))
			method4072(Class31.anInt361 * -360258135 >> 12, 413271601 * Class246.anInt3029 >> 12, -234390203 * anInt2942, -2132681097);
		else {
			int i = -1;
			int i_56_ = -1;
			if (null != Class84.myPlayer) {
				i = (Class84.myPlayer.regionBaseX[0]) >> 3;
				i_56_ = (Class84.myPlayer.regionBaseY[0]) >> 3;
			}
			if (i < 0 || i >= class257.getSizeX(-161764870) >> 3 || i_56_ < 0 || i_56_ >= class257.getSizeY(-599469964) >> 3)
				method4072(class257.getSizeX(408352122) >> 4, class257.getSizeY(-1348015280) >> 4, 0, -1827881418);
			else
				method4072(i, i_56_, -234390203 * anInt2942, -1878748840);
		}
		method4065(16711935);
		method4049((byte) 96);
		method4051(-38045894);
		method4075(-1133164009);
	}

	public void method4087() {
		((Class239) this).aClass505_2944.IA((0.7F + (float) Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870) * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(1741068473)) * 1.1523438F);
		((Class239) this).aClass505_2944.m(-1226832141 * anInt2935, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		((Class239) this).aClass505_2944.c(anInt2932 * 820300105, -1, 0);
		((Class239) this).aClass505_2944.method8477(Class81.aClass152_802);
	}

	public void method4088() {
		((Class239) this).aClass505_2944.IA((0.7F + (float) Class393.aClass282_Sub54_4783.aClass468_Sub21_8222.method12865(475375870) * 0.1F + IndexLoaders.MAP_REGION_DECODER.method4428(-2074900997)) * 1.1523438F);
		((Class239) this).aClass505_2944.m(-1226832141 * anInt2935, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		((Class239) this).aClass505_2944.c(anInt2932 * 820300105, -1, 0);
		((Class239) this).aClass505_2944.method8477(Class81.aClass152_802);
	}

	static final void method4089(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.intStackPtr -= 425673003;
		int i_57_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_58_ = (class527.intStack[1 + class527.intStackPtr * 1942118537]);
		int i_59_ = (class527.intStack[2 + 1942118537 * class527.intStackPtr]);
		Class282_Sub20_Sub8.method15242(string, 1 == i_57_, i_58_, i_59_, 1920082068);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class415.anInt4985 * 560339485;
	}

	public static void method4090(int[] is, int[] is_60_, int i) {
		if (is == null || is_60_ == null) {
			CircularBuffer.anIntArray5773 = null;
			Class412.anIntArray4962 = null;
			IcmpService_Sub1.aByteArrayArrayArray7963 = null;
		} else {
			CircularBuffer.anIntArray5773 = is;
			Class412.anIntArray4962 = new int[is.length];
			IcmpService_Sub1.aByteArrayArrayArray7963 = new byte[is.length][][];
			for (int i_61_ = 0; i_61_ < CircularBuffer.anIntArray5773.length; i_61_++)
				IcmpService_Sub1.aByteArrayArrayArray7963[i_61_] = new byte[is_60_[i_61_]][];
		}
	}

	static final void method4091(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (Class291.aClass282_Sub50_Sub6_3491 != null ? Class291.aClass282_Sub50_Sub6_3491.anInt9536 * 1864297169 : -1);
	}
}
