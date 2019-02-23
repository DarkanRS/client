public class Class50 {

	static final boolean method979(int i_0, int i_1) {
		return (i_0 & 0x22) != 0;
	}

	static final boolean method980(int i_0, int i_1) {
		return (i_0 & 0x34) != 0;
	}

	static final boolean method981(int i_0, int i_1) {
		return (i_0 & 0x37) != 0;
	}

	static final boolean method982(int i_0, int i_1) {
		return (i_0 & 0x220) == 544 | (i_0 & 0x18) != 0;
	}

	static final boolean method983(int i_0, int i_1) {
		return (i_0 & 0x800) != 0 && (i_1 & 0x37) != 0;
	}

	static final boolean method984(int i_0, int i_1) {
		return (i_0 & 0x100) != 0;
	}

	static final boolean method985(int i_0, int i_1) {
		return false;
	}

	static final boolean method986(int i_0, int i_1) {
		return (i_0 & 0x10) != 0;
	}

	static final boolean method987(int i_0, int i_1) {
		return method1022(i_0, i_1) || method1051(i_0, i_1);
	}

	static final boolean method988(int i_0, int i_1) {
		return (i_0 & 0xc580) != 0;
	}

	static final boolean method989(int i_0, int i_1) {
		return (i_0 & 0x10000) != 0;
	}

	static final boolean method990(int i_0, int i_1) {
		return (i_0 & 0x800) != 0;
	}

	static final boolean method992(int i_0, int i_1) {
		return (i_0 & 0x8000) != 0;
	}

	static final boolean method993(int i_0, int i_1) {
		return (i_0 & 0x800) != 0;
	}

	static final boolean method994(int i_0, int i_1) {
		return (i_0 & 0x21) != 0;
	}

	static final boolean method995(int i_0, int i_1) {
		return (method994(i_0, i_1) | method979(i_0, i_1) | method980(i_0, i_1)) & method990(i_0, i_1);
	}

	static final boolean method996(int i_0, int i_1) {
		boolean bool_2 = (i_1 & 0x37) != 0 ? method1020(i_0, i_1) : method1051(i_0, i_1);
		return (i_0 & 0x10000) != 0 | method982(i_0, i_1) | bool_2;
	}

	static final boolean method999(int i_0, int i_1) {
		return method986(i_0, i_1) & method1043(i_0, i_1);
	}

	static final boolean method1000(int i_0, int i_1) {
		return (i_0 & 0x70000) != 0 || method994(i_0, i_1) || method995(i_0, i_1);
	}

	static final boolean method1001(int i_0, int i_1) {
		return (i_0 & 0x70000) != 0 || method979(i_0, i_1) || method995(i_0, i_1);
	}

	static final boolean method1002(int i_0, int i_1) {
		return (i_0 & 0x70000) != 0 || method980(i_0, i_1) || method995(i_0, i_1);
	}

	Class50() throws Throwable {
		throw new Error();
	}

	static final boolean method1004(int i_0, int i_1) {
		return (i_0 & 0x40000) != 0 | method984(i_0, i_1) || method1051(i_0, i_1);
	}

	static final boolean method1005(int i_0, int i_1) {
		return method985(i_0, i_1) || method1056(i_0, i_1);
	}

	static final boolean method1006(int i_0, int i_1) {
		return (i_0 & 0x180) != 0;
	}

	static final boolean method1007(int i_0, int i_1) {
		return (i_0 & 0x20) != 0;
	}

	static final boolean method1008(int i_0, int i_1) {
		return (i_0 & 0x400) != 0;
	}

	static final boolean method1009(int i_0, int i_1) {
		return (i_0 & 0x60000) != 0 | method986(i_0, i_1) || method999(i_0, i_1);
	}

	static final boolean method1010(int i_0, int i_1) {
		return (i_0 & 0x800) != 0 | method992(i_0, i_1) || method1051(i_0, i_1);
	}

	static final boolean method1020(int i_0, int i_1) {
		return method983(i_0, i_1) & ((i_0 & 0x2000) != 0 | method982(i_0, i_1) | method989(i_0, i_1));
	}

	static final boolean method1022(int i_0, int i_1) {
		return (i_0 & 0x84080) != 0;
	}

	static final boolean method1043(int i_0, int i_1) {
		return (i_0 & 0x800) != 0;
	}

	static final boolean method1051(int i_0, int i_1) {
		return !method1059(i_0, i_1) ? false : ((i_0 & 0x9000) != 0 | method1022(i_0, i_1) | method984(i_0, i_1) ? true : (i_1 & 0x37) == 0 & ((i_0 & 0x2000) != 0 | method982(i_0, i_1) | method989(i_0, i_1)));
	}

	static final boolean method1056(int i_0, int i_1) {
		return method985(i_0, i_1) & method993(i_0, i_1);
	}

	static final boolean method1059(int i_0, int i_1) {
		return (i_0 & 0x800) != 0;
	}

}
