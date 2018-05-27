
/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class Class78 {
	static Map aMap766;
	public static final long aLong767 = 1000L;
	static HashMap aHashMap768 = new HashMap();

	public static String method1371(Date date, String string) {
		return method1382(date, string, method1373(-2116466592), Language.aClass495_5795, (short) 25671);
	}

	public static String method1372(Date date, String string, int i) {
		return method1382(date, string, method1373(-1860849890), Language.aClass495_5795, (short) 16433);
	}

	static {
		Calendar.getInstance(method1375("Europe/London", 184912342));
	}

	static TimeZone method1373(int i) {
		return method1375("Europe/London", -669580467);
	}

	static String method1374(Date date, String string, TimeZone timezone, Language class495) {
		if (null == aMap766) {
			aMap766 = new HashMap(6);
			Language[] class495s = Language.method8294(2118646344);
			for (int i = 0; i < class495s.length; i++) {
				Language class495_0_ = class495s[i];
				aMap766.put(class495_0_, new ConcurrentLinkedQueue());
			}
		}
		ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap766.get(class495);
		SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
		if (simpledateformat == null)
			simpledateformat = new SimpleDateFormat(string, class495.method8293(-216671097));
		else
			simpledateformat.applyPattern(string);
		simpledateformat.setTimeZone(timezone);
		String string_1_ = simpledateformat.format(date);
		concurrentlinkedqueue.add(simpledateformat);
		return string_1_;
	}

	Class78() throws Throwable {
		throw new Error();
	}

	static TimeZone method1375(String string, int i) {
		synchronized (aHashMap768) {
			TimeZone timezone = (TimeZone) aHashMap768.get(string);
			if (timezone == null) {
				timezone = TimeZone.getTimeZone(string);
				aHashMap768.put(string, timezone);
			}
			TimeZone timezone_2_ = timezone;
			return timezone_2_;
		}
	}

	public static String method1376(Date date, String string) {
		return method1382(date, string, method1373(-2033816243), Language.aClass495_5795, (short) 20032);
	}

	static TimeZone method1377(String string) {
		synchronized (aHashMap768) {
			TimeZone timezone = (TimeZone) aHashMap768.get(string);
			if (timezone == null) {
				timezone = TimeZone.getTimeZone(string);
				aHashMap768.put(string, timezone);
			}
			TimeZone timezone_3_ = timezone;
			return timezone_3_;
		}
	}

	static TimeZone method1378(String string) {
		synchronized (aHashMap768) {
			TimeZone timezone = (TimeZone) aHashMap768.get(string);
			if (timezone == null) {
				timezone = TimeZone.getTimeZone(string);
				aHashMap768.put(string, timezone);
			}
			TimeZone timezone_4_ = timezone;
			return timezone_4_;
		}
	}

	static TimeZone method1379() {
		return method1375("Europe/London", -1690388300);
	}

	static TimeZone method1380(String string) {
		synchronized (aHashMap768) {
			TimeZone timezone = (TimeZone) aHashMap768.get(string);
			if (timezone == null) {
				timezone = TimeZone.getTimeZone(string);
				aHashMap768.put(string, timezone);
			}
			TimeZone timezone_5_ = timezone;
			return timezone_5_;
		}
	}

	static TimeZone method1381(String string) {
		synchronized (aHashMap768) {
			TimeZone timezone = (TimeZone) aHashMap768.get(string);
			if (timezone == null) {
				timezone = TimeZone.getTimeZone(string);
				aHashMap768.put(string, timezone);
			}
			TimeZone timezone_6_ = timezone;
			return timezone_6_;
		}
	}

	static String method1382(Date date, String string, TimeZone timezone, Language class495, short i) {
		if (null == aMap766) {
			aMap766 = new HashMap(6);
			Language[] class495s = Language.method8294(-15971239);
			for (int i_7_ = 0; i_7_ < class495s.length; i_7_++) {
				Language class495_8_ = class495s[i_7_];
				aMap766.put(class495_8_, new ConcurrentLinkedQueue());
			}
		}
		ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue) aMap766.get(class495);
		SimpleDateFormat simpledateformat = (SimpleDateFormat) concurrentlinkedqueue.poll();
		if (simpledateformat == null)
			simpledateformat = new SimpleDateFormat(string, class495.method8293(-216671097));
		else
			simpledateformat.applyPattern(string);
		simpledateformat.setTimeZone(timezone);
		String string_9_ = simpledateformat.format(date);
		concurrentlinkedqueue.add(simpledateformat);
		return string_9_;
	}

	static TimeZone method1383() {
		return method1375("Europe/London", -450129020);
	}

	static void method1384(int i) {
		if (null != client.aByteArray7152)
			Class418.method7022((byte) -30);
		else if (-1 != Class9.anInt76 * 1051306693)
			Class14.method537(1442363159);
		else
			Class345.worldLogin(Class9.aString99, Class9.aString102, 2140005303);
	}

	static final void method1385(CS2Executor class527, int i) {
		int i_10_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_10_, (byte) 32);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_10_ >> 16];
		Class241.method4149(class118, class98, class527, -1861412275);
	}

	static final int method1386(Class413 class413, int i) {
		if (class413 == null)
			return 12;
		switch (-680323683 * ((Class413) class413).anInt4972) {
		case 5:
			return 20;
		default:
			return 12;
		}
	}

	static final void method1387(CS2Executor class527, byte i) {
		int i_11_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class217_Sub1 class217_sub1 = ObjectIndexLoader.method7916(i_11_, 1517040496);
		if (null != class217_sub1) {
			if (i >= -1) {
				for (;;) {
					/* empty */
				}
			}
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1203083985 * class217_sub1.anInt2700;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7977;
			Class213 class213 = class217_sub1.method13055((short) -22599);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -216896281 * class213.anInt2680;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class213.aString2679;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2701 * 652811625;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt7978 * -129507359;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7976;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}

	static void method1388(int i, int i_12_, int i_13_, int i_14_, int i_15_, byte i_16_) {
		if (i_13_ <= Class532_Sub1.anInt7068 * -348932735 && i_14_ >= 324226563 * Class532_Sub1.anInt7070) {
			boolean bool;
			if (i < -612590951 * Class532_Sub1.anInt7071) {
				i = Class532_Sub1.anInt7071 * -612590951;
				bool = false;
			} else if (i > -1345107225 * Class532_Sub1.anInt7069) {
				i = Class532_Sub1.anInt7069 * -1345107225;
				bool = false;
			} else
				bool = true;
			boolean bool_17_;
			if (i_12_ < -612590951 * Class532_Sub1.anInt7071) {
				i_12_ = -612590951 * Class532_Sub1.anInt7071;
				bool_17_ = false;
			} else if (i_12_ > -1345107225 * Class532_Sub1.anInt7069) {
				i_12_ = Class532_Sub1.anInt7069 * -1345107225;
				bool_17_ = false;
			} else
				bool_17_ = true;
			if (i_13_ >= 324226563 * Class532_Sub1.anInt7070)
				Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_13_++], i, i_12_, i_15_, (byte) -14);
			else
				i_13_ = Class532_Sub1.anInt7070 * 324226563;
			if (i_14_ <= -348932735 * Class532_Sub1.anInt7068)
				Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_14_--], i, i_12_, i_15_, (byte) 40);
			else
				i_14_ = Class532_Sub1.anInt7068 * -348932735;
			if (bool && bool_17_) {
				for (int i_18_ = i_13_; i_18_ <= i_14_; i_18_++) {
					int[] is = Class532_Sub1.anIntArrayArray7072[i_18_];
					is[i] = is[i_12_] = i_15_;
				}
			} else if (bool) {
				for (int i_19_ = i_13_; i_19_ <= i_14_; i_19_++)
					Class532_Sub1.anIntArrayArray7072[i_19_][i] = i_15_;
			} else if (bool_17_) {
				for (int i_20_ = i_13_; i_20_ <= i_14_; i_20_++)
					Class532_Sub1.anIntArrayArray7072[i_20_][i_12_] = i_15_;
			}
		}
	}

	public static void method1389(int i, int i_21_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Class263.method4778(7, (long) i);
		class282_sub50_sub12.method14965((byte) 5);
	}
}
