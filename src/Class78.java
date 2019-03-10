import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class78 {

	static HashMap aHashMap768 = new HashMap();
	static Map aMap766;

	static {
		Calendar.getInstance(method1375("Europe/London", 184912342));
	}

	public static String method1372(Date date_0, String string_1, int i_2) {
		return method1382(date_0, string_1, method1373(-1860849890), Language.aClass495_5795, (short) 16433);
	}

	static TimeZone method1373(int i_0) {
		return method1375("Europe/London", -669580467);
	}

	Class78() throws Throwable {
		throw new Error();
	}

	static TimeZone method1375(String string_0, int i_1) {
		HashMap hashmap_2 = aHashMap768;
		synchronized (aHashMap768) {
			TimeZone timezone_3 = (TimeZone) aHashMap768.get(string_0);
			if (timezone_3 == null) {
				timezone_3 = TimeZone.getTimeZone(string_0);
				aHashMap768.put(string_0, timezone_3);
			}

			return timezone_3;
		}
	}

	static String method1382(Date date_0, String string_1, TimeZone timezone_2, Language xlanguage_3, short s_4) {
		if (aMap766 == null) {
			aMap766 = new HashMap(6);
			Language[] arr_5 = Language.method8294(-15971239);

			for (int i_6 = 0; i_6 < arr_5.length; i_6++) {
				Language xlanguage_7 = arr_5[i_6];
				aMap766.put(xlanguage_7, new ConcurrentLinkedQueue());
			}
		}

		ConcurrentLinkedQueue concurrentlinkedqueue_9 = (ConcurrentLinkedQueue) aMap766.get(xlanguage_3);
		SimpleDateFormat simpledateformat_8 = (SimpleDateFormat) concurrentlinkedqueue_9.poll();
		if (simpledateformat_8 == null) {
			simpledateformat_8 = new SimpleDateFormat(string_1, xlanguage_3.method8293(-216671097));
		} else {
			simpledateformat_8.applyPattern(string_1);
		}

		simpledateformat_8.setTimeZone(timezone_2);
		String string_10 = simpledateformat_8.format(date_0);
		concurrentlinkedqueue_9.add(simpledateformat_8);
		return string_10;
	}

	static void method1384(int i_0) {
		if (client.aByteArray7152 != null) {
			Class418.method7022((byte) -30);
		} else if (Class9.anInt76 != -1) {
			Class14.method537(1442363159);
		} else {
			Class345.worldLogin(Class9.aString99, Class9.aString102, 2140005303);
		}

	}

	static final void method1385(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 32);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class241.method4149(icomponentdefinitions_3, interface_4, cs2executor_0, -1861412275);
	}

	static final int method1386(Class413 class413_0, int i_1) {
		if (class413_0 == null) {
			return 12;
		} else {
			switch (class413_0.anInt4972) {
			case 5:
				return 20;
			default:
				return 12;
			}
		}
	}

	static final void method1387(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		Class217_Sub1 class217_sub1_3 = ObjectIndexLoader.method7916(i_2, 1517040496);
		if (class217_sub1_3 != null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class217_sub1_3.anInt2700;
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = class217_sub1_3.aString7977;
			Class213 class213_4 = class217_sub1_3.method13055((short) -22599);
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class213_4.anInt2680;
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = class213_4.aString2679;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class217_sub1_3.anInt2701;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class217_sub1_3.anInt7978;
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = class217_sub1_3.aString7976;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = "";
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = "";
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = "";
		}

	}

	static void method1388(int i_0, int i_1, int i_2, int i_3, int i_4, byte b_5) {
		if (i_2 <= Class532_Sub1.anInt7068 && i_3 >= Class532_Sub1.anInt7070) {
			boolean bool_6;
			if (i_0 < Class532_Sub1.anInt7071) {
				i_0 = Class532_Sub1.anInt7071;
				bool_6 = false;
			} else if (i_0 > Class532_Sub1.anInt7069) {
				i_0 = Class532_Sub1.anInt7069;
				bool_6 = false;
			} else {
				bool_6 = true;
			}

			boolean bool_7;
			if (i_1 < Class532_Sub1.anInt7071) {
				i_1 = Class532_Sub1.anInt7071;
				bool_7 = false;
			} else if (i_1 > Class532_Sub1.anInt7069) {
				i_1 = Class532_Sub1.anInt7069;
				bool_7 = false;
			} else {
				bool_7 = true;
			}

			if (i_2 >= Class532_Sub1.anInt7070) {
				Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_2++], i_0, i_1, i_4, (byte) -14);
			} else {
				i_2 = Class532_Sub1.anInt7070;
			}

			if (i_3 <= Class532_Sub1.anInt7068) {
				Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_3--], i_0, i_1, i_4, (byte) 40);
			} else {
				i_3 = Class532_Sub1.anInt7068;
			}

			int i_8;
			if (bool_6 && bool_7) {
				for (i_8 = i_2; i_8 <= i_3; i_8++) {
					int[] ints_9 = Class532_Sub1.anIntArrayArray7072[i_8];
					ints_9[i_0] = ints_9[i_1] = i_4;
				}
			} else if (bool_6) {
				for (i_8 = i_2; i_8 <= i_3; i_8++) {
					Class532_Sub1.anIntArrayArray7072[i_8][i_0] = i_4;
				}
			} else if (bool_7) {
				for (i_8 = i_2; i_8 <= i_3; i_8++) {
					Class532_Sub1.anIntArrayArray7072[i_8][i_1] = i_4;
				}
			}
		}

	}

	public static void method1389(int i_0, int i_1) {
		Class282_Sub50_Sub12 class282_sub50_sub12_2 = Engine.getIComponentVar(7, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) 5);
	}

}
