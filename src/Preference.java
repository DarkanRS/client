import java.util.Calendar;

public abstract class Preference {

	protected int anInt5578;
	protected Class282_Sub54 manager;

	Preference(int i_1, Class282_Sub54 class282_sub54_2) {
		this.anInt5578 = i_1;
		this.manager = class282_sub54_2;
	}

	abstract void method7780(int var1);

	Preference(Class282_Sub54 class282_sub54_1) {
		this.manager = class282_sub54_1;
		this.anInt5578 = this.method7781(1882816731);
	}

	abstract int method7781(int var1);

	void method7782(int i_1, byte b_2) {
		if (this.method7785(i_1, 594235257) != 3) {
			this.method7783(i_1, -663969344);
		}

	}

	abstract void method7783(int var1, int var2);

	abstract int method7784(int var1);

	abstract int method7785(int var1, int var2);

	abstract int method7786();

	abstract int method7787();

	public static String method7788(long long_0, int i_2, boolean bool_3, int i_4) {
		Calendar calendar_5;
		if (bool_3) {
			Class288.method5083(long_0);
			calendar_5 = Class407.aCalendar4846;
		} else {
			Class155.method2634(long_0);
			calendar_5 = Class407.aCalendar4848;
		}

		int i_6 = calendar_5.get(5);
		int i_7 = calendar_5.get(2);
		int i_8 = calendar_5.get(1);
		int i_9 = calendar_5.get(11);
		int i_10 = calendar_5.get(12);
		return i_2 == 3 ? ConnectionInfo.method7499(long_0, i_2, bool_3, 1558223183) : Integer.toString(i_6 / 10) + i_6 % 10 + "-" + Class407.aStringArrayArray4849[i_2][i_7] + "-" + i_8 + " " + i_9 / 10 + i_9 % 10 + ":" + i_10 / 10 + i_10 % 10;
	}

	static void method7789(int i_0) {
		if (Class393.preferences.aClass468_Sub3_8199.method12632(84527156) == 1) {
			IndexLoaders.MAP_REGION_LOADER_THREAD.method6049(new Class335(Class256.aClass256_3152, (RsBitsBuffer) null), 301123709);
		} else {
			IndexLoaders.MAP_REGION_DECODER.method4547((byte) -107);
			Class58.method1139(-1771275616);
		}

	}

}
