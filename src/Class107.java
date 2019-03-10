public class Class107 {

	protected static int anInt1082;

	IterableNodeMap aClass465_1080;

	Class282_Sub21[] aClass282_Sub21Array1079;

	Interface11 anInterface11_1078;

	public Class107(int i_1, Interface11 interface11_2) {
		int i_3;
		for (i_3 = 1; i_3 < i_1; i_3 += i_3) {
			;
		}
		this.aClass465_1080 = new IterableNodeMap(i_3);
		this.aClass282_Sub21Array1079 = new Class282_Sub21[i_3];
		this.anInterface11_1078 = interface11_2;
	}

	public Class282_Sub21 method1820(String string_1, int i_2) {
		long long_3 = this.anInterface11_1078.method79(string_1, 166693021);
		for (Class282_Sub21 class282_sub21_5 = (Class282_Sub21) this.aClass465_1080.get(long_3); class282_sub21_5 != null; class282_sub21_5 = (Class282_Sub21) this.aClass465_1080.method7747(-1934040693)) {
			if (class282_sub21_5.aString7674.equals(string_1)) {
				return class282_sub21_5;
			}
		}
		return null;
	}

	void method1821(int i_1, short s_2) {
		Class282_Sub21 class282_sub21_3 = this.method1823(i_1, 1887501575);
		if (class282_sub21_3 != null) {
			class282_sub21_3.remove();
			this.aClass282_Sub21Array1079[class282_sub21_3.anInt7675] = null;
		}
	}

	public void method1822(int i_1, String string_2, Class282_Sub21 class282_sub21_3, int i_4) {
		Class282_Sub21 class282_sub21_5 = this.method1820(string_2, -2129504033);
		if (class282_sub21_5 != null && class282_sub21_5.anInt7675 != i_1) {
			throw new IllegalArgumentException(string_2);
		} else {
			this.method1821(i_1, (short) -24232);
			if (i_1 >= this.aClass282_Sub21Array1079.length) {
				int i_6;
				for (i_6 = this.aClass282_Sub21Array1079.length; i_1 >= i_6; i_6 += i_6) {
					;
				}
				this.aClass465_1080 = new IterableNodeMap(i_6);
				for (int i_7 = 0; i_7 < this.aClass282_Sub21Array1079.length; i_7++) {
					Class282_Sub21 class282_sub21_10 = this.aClass282_Sub21Array1079[i_7];
					if (class282_sub21_10 != null) {
						this.aClass465_1080.put(class282_sub21_10, class282_sub21_10.data);
					}
				}
				Class282_Sub21[] arr_9 = new Class282_Sub21[i_6];
				for (int i_8 = 0; i_8 < this.aClass282_Sub21Array1079.length; i_8++) {
					arr_9[i_8] = this.aClass282_Sub21Array1079[i_8];
				}
				this.aClass282_Sub21Array1079 = arr_9;
			}
			class282_sub21_3.anInt7675 = i_1;
			class282_sub21_3.aString7674 = string_2;
			this.aClass465_1080.put(class282_sub21_3, this.anInterface11_1078.method79(string_2, 276122066));
			this.aClass282_Sub21Array1079[i_1] = class282_sub21_3;
		}
	}

	public Class282_Sub21 method1823(int i_1, int i_2) {
		return i_1 >= this.aClass282_Sub21Array1079.length ? null : this.aClass282_Sub21Array1079[i_1];
	}

	static void method1834(Class397 class397_0, int i_1, int i_2, CS2Executor cs2executor_3, byte b_4) {
		CS2Script cs2script_5 = Class225_Sub1.method12792(class397_0, i_1, i_2, 856735933);
		if (cs2script_5 == null) {
			Shadow.method15509(282059094);
		} else {
			cs2executor_3.intLocals = new int[cs2script_5.intLocalsCount];
			cs2executor_3.objectLocals = new Object[cs2script_5.stringLocalsCount];
			if (cs2script_5.aClass397_9527 != Class397.aClass397_4797 && cs2script_5.aClass397_9527 != Class397.aClass397_4805 && cs2script_5.aClass397_9527 != Class397.aClass397_4798) {
				if (cs2script_5.aClass397_9527 == Class397.aClass397_4806) {
					cs2executor_3.intLocals[0] = cs2executor_3.anInt7004;
				}
			} else {
				int i_6 = 0;
				int i_7 = 0;
				if (Class282_Sub20_Sub24.aClass118_9884 != null) {
					i_6 = Class282_Sub20_Sub24.aClass118_9884.anInt1299;
					i_7 = Class282_Sub20_Sub24.aClass118_9884.anInt1428;
				}
				cs2executor_3.intLocals[0] = Class163.mouseRecorder.method3569(2102959757) - i_6;
				cs2executor_3.intLocals[1] = Class163.mouseRecorder.method3570(756095591) - i_7;
			}
			Class51.method1068(cs2script_5, 200000, cs2executor_3, 223631814);
		}
	}

	static final void method1838(IComponentDefinitions icomponentdefinitions_0, byte[] bytes_1, byte[] bytes_2, CS2Executor cs2executor_3, int i_4) {
		int i_5 = cs2executor_3.intStack[--cs2executor_3.intStackPtr] - 1;
		if (i_5 >= 0 && i_5 <= 9) {
			Class445.method7429(icomponentdefinitions_0, i_5, bytes_1, bytes_2, cs2executor_3, -1172279897);
		} else {
			throw new RuntimeException();
		}
	}
}
