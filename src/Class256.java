public class Class256 {

	public static Class256 aClass256_3154 = new Class256(false, false);

	public static Class256 aClass256_3153 = new Class256(true, false);

	public static Class256 aClass256_3158 = new Class256(false, false);

	public static Class256 aClass256_3155 = new Class256(true, false);

	static Class256 aClass256_3156 = new Class256(true, false);

	static Class256 aClass256_3157 = new Class256(true, true);

	static Class256 aClass256_3161 = new Class256(true, true);

	public static Class256 aClass256_3152 = new Class256(false, false);

	boolean aBool3160;

	boolean aBool3159;

	public boolean method4401() {
		return this.aBool3159;
	}

	Class256(boolean bool_1, boolean bool_2) {
		this.aBool3160 = bool_1;
		this.aBool3159 = bool_2;
	}

	boolean method4410(byte b_1) {
		return this.aBool3160;
	}

	public static void method4412(Class116 class116_0, int i_1, int i_2) {
		i_1 = i_1 * Class393.preferences.aClass468_Sub13_8228.method12714(241459419) >> 8;
		if (class116_0 == null) {
			Class226.method3805();
		} else {
			HostNameIdentifier.method487(class116_0, i_1);
			Class230.method3912();
		}
	}

	public static Class268 method4414(int i_0, int i_1, int i_2, int i_3, int i_4, boolean bool_5, int i_6) {
		if ((bool_5 ? Class393.preferences.aClass468_Sub13_8227.method12714(-2090466829) : Class393.preferences.aClass468_Sub13_8225.method12714(-1389613330)) != 0 && i_1 != 0 && Class260.anInt3219 < 50 && i_0 != -1) {
			Class268 class268_8 = new Class268((byte) (bool_5 ? 3 : 2), i_0, i_1, i_2, i_3, i_4, i_6, (Class521_Sub1) null);
			Class260.aClass268Array3232[++Class260.anInt3219 - 1] = class268_8;
			return class268_8;
		} else {
			return null;
		}
	}

	public static void method4415(int i_0, int i_1, int i_2, ObjectDefinitions objectdefinitions_3) {
		for (Class282_Sub48 class282_sub48_5 = (Class282_Sub48) Class282_Sub48.aClass482_8073.head((byte) 114); class282_sub48_5 != null; class282_sub48_5 = (Class282_Sub48) Class282_Sub48.aClass482_8073.next(-1010635900)) {
			if (i_0 == class282_sub48_5.anInt8076 && class282_sub48_5.anInt8107 == i_1 << 9 && i_2 << 9 == class282_sub48_5.anInt8078 && class282_sub48_5.aClass478_8104.id == objectdefinitions_3.id) {
				if (class282_sub48_5.aClass282_Sub15_Sub5_8099 != null) {
					Class79.aClass282_Sub15_Sub4_783.method15276(class282_sub48_5.aClass282_Sub15_Sub5_8099);
					class282_sub48_5.aClass282_Sub15_Sub5_8099 = null;
				}
				if (class282_sub48_5.aClass282_Sub15_Sub5_8096 != null) {
					Class79.aClass282_Sub15_Sub4_783.method15276(class282_sub48_5.aClass282_Sub15_Sub5_8096);
					class282_sub48_5.aClass282_Sub15_Sub5_8096 = null;
				}
				class282_sub48_5.remove();
				break;
			}
		}
	}

	static void method4416() {
		Class187.anInt2363 = 0;
		Class187.anInt2361 = -1;
		Class187.anInt2359 = -1;
	}
}
