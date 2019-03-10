public class Class114 {

	static Class194 aClass194_1243;

	String aString1237;

	Class122[] aClass122Array1236;

	Class122[] aClass122Array1240;

	Class99[] aClass99Array1241;

	void method1885(byte[] bytes_1, int i_2) throws Exception_Sub1 {
		Class100 class100_3 = new Class100(bytes_1);
		int i_4 = class100_3.method1632((byte) -72);
		if (i_4 != 4) {
			throw new Exception_Sub1(this, i_4, 4);
		} else {
			this.aString1237 = class100_3.method1633(16711935);
			this.aClass122Array1236 = new Class122[class100_3.method1632((byte) -44)];
			this.aClass122Array1240 = new Class122[class100_3.method1632((byte) -15)];
			this.aClass99Array1241 = new Class99[class100_3.method1632((byte) -125)];
			int i_5;
			for (i_5 = 0; i_5 < this.aClass122Array1236.length; i_5++) {
				this.aClass122Array1236[i_5] = new Class122();
				this.aClass122Array1236[i_5].method2105(class100_3, (byte) -114);
			}
			for (i_5 = 0; i_5 < this.aClass122Array1240.length; i_5++) {
				this.aClass122Array1240[i_5] = new Class122();
				this.aClass122Array1240[i_5].method2105(class100_3, (byte) -10);
			}
			for (i_5 = 0; i_5 < this.aClass99Array1241.length; i_5++) {
				this.aClass99Array1241[i_5] = new Class99();
				this.aClass99Array1241[i_5].method1628(class100_3, -998614135);
			}
		}
	}

	public Class114(byte[] bytes_1) throws Exception_Sub1 {
		this.method1885(bytes_1, 1555548172);
	}

	static FontMetrics method1887(int i_0) {
		FontMetrics fontmetrics_1;
		if (Class20.aBool187) {
			if (Class186.aClass8_2348 != null && Class176.aClass414_2200 != null) {
				fontmetrics_1 = Class176.aClass414_2200;
			} else {
				fontmetrics_1 = Class288.aClass414_3438;
			}
		} else {
			fontmetrics_1 = Class288.aClass414_3438;
		}
		Class20.anInt178 = fontmetrics_1.anInt4979 + fontmetrics_1.anInt4978;
		return fontmetrics_1;
	}

	static void method1890(long[] longs_0, Object[] arr_1, int i_2, int i_3, short s_4) {
		if (i_2 < i_3) {
			int i_5 = (i_3 + i_2) / 2;
			int i_6 = i_2;
			long long_7 = longs_0[i_5];
			longs_0[i_5] = longs_0[i_3];
			longs_0[i_3] = long_7;
			Object object_9 = arr_1[i_5];
			arr_1[i_5] = arr_1[i_3];
			arr_1[i_3] = object_9;
			int i_10 = long_7 == Long.MAX_VALUE ? 0 : 1;
			for (int i_11 = i_2; i_11 < i_3; i_11++) {
				if (longs_0[i_11] < (long) (i_11 & i_10) + long_7) {
					long long_12 = longs_0[i_11];
					longs_0[i_11] = longs_0[i_6];
					longs_0[i_6] = long_12;
					Object object_14 = arr_1[i_11];
					arr_1[i_11] = arr_1[i_6];
					arr_1[i_6++] = object_14;
				}
			}
			longs_0[i_3] = longs_0[i_6];
			longs_0[i_6] = long_7;
			arr_1[i_3] = arr_1[i_6];
			arr_1[i_6] = object_9;
			method1890(longs_0, arr_1, i_2, i_6 - 1, (short) 255);
			method1890(longs_0, arr_1, i_6 + 1, i_3, (short) 255);
		}
	}
}
