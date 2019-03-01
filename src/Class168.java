public class Class168 {

	public int anInt2052;
	public String aString2051;
	public int anInt2045;
	public String aString2053;
	public long aLong2049;

	public Class168(int i_1, String string_2, int i_3, String string_4, long long_5) {
		this.anInt2052 = i_1;
		this.aString2051 = string_2;
		this.anInt2045 = i_3;
		this.aString2053 = string_4;
		this.aLong2049 = long_5;
	}

	static final void method2865(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 45);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class529.method11337(icomponentdefinitions_3, interface_4, cs2executor_0, -1404316012);
	}

	static final void method2866(CS2Executor cs2executor_0, byte b_1) {
		if (Class475.supportsFullScreen && Engine.fullScreenFrame != null) {
			Class440.method7373(Class393.preferences.aClass468_Sub9_8226.method12687(-580037051), -1, -1, false, (byte) 116);
		}

		if (NamedFileReference.method867(-391014767) == Class279.aClass279_3368) {
			Class282_Sub11.method12211(-541554902);
			System.exit(0);
		} else {
			Class480.method8043(-25732624);
		}

	}

	static final void method2867(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = cs2executor_0.animable.method12997(-218366287);
	}

	static final void method2868(CS2Executor cs2executor_0, byte b_1) {
		if (Class308.aShortArray3621 != null && Class283.anInt3384 < Class415.anInt4985) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class308.aShortArray3621[++Class283.anInt3384 - 1] & 0xffff;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
		}

	}

}
