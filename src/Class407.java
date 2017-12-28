
/* Class407 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Class407 {
	static Calendar aCalendar4846;
	public static final long aLong4847 = 1000L;
	static Calendar aCalendar4848;
	static String[][] aStringArrayArray4849 = { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" },
			{ "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	static void method6853(long l) {
		aCalendar4846.setTime(new Date(l));
	}

	static {
		aCalendar4848 = Calendar.getInstance();
		aCalendar4846 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	public static String method6854(long l, int i) {
		Class155.method2634(l);
		int i_0_ = aCalendar4848.get(5);
		int i_1_ = aCalendar4848.get(2);
		int i_2_ = aCalendar4848.get(1);
		if (i == 3)
			return Class93.method1578(l, i, (byte) 8);
		return new StringBuilder().append(Integer.toString(i_0_ / 10)).append(i_0_ % 10).append("-").append(aStringArrayArray4849[i][i_1_]).append("-").append(i_2_).toString();
	}

	static void method6855(long l) {
		aCalendar4846.setTime(new Date(l));
	}

	public static long method6856(int i) {
		return (long) (11745 + i) * 86400000L;
	}

	public static String method6857(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class288.method5083(l);
			calendar = aCalendar4846;
		} else {
			Class155.method2634(l);
			calendar = aCalendar4848;
		}
		int i_3_ = calendar.get(5);
		int i_4_ = calendar.get(2);
		int i_5_ = calendar.get(1);
		int i_6_ = calendar.get(11);
		int i_7_ = calendar.get(12);
		if (i == 3)
			return Class450.method7499(l, i, bool, 1785041976);
		return new StringBuilder().append(Integer.toString(i_3_ / 10)).append(i_3_ % 10).append("-").append(aStringArrayArray4849[i][i_4_]).append("-").append(i_5_).append(" ").append(i_6_ / 10).append(i_6_ % 10).append(":").append(i_7_ / 10).append(i_7_ % 10).toString();
	}

	public static String method6858(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class288.method5083(l);
			calendar = aCalendar4846;
		} else {
			Class155.method2634(l);
			calendar = aCalendar4848;
		}
		int i_8_ = calendar.get(5);
		int i_9_ = calendar.get(2);
		int i_10_ = calendar.get(1);
		int i_11_ = calendar.get(11);
		int i_12_ = calendar.get(12);
		if (i == 3)
			return Class450.method7499(l, i, bool, 1315267194);
		return new StringBuilder().append(Integer.toString(i_8_ / 10)).append(i_8_ % 10).append("-").append(aStringArrayArray4849[i][i_9_]).append("-").append(i_10_).append(" ").append(i_11_ / 10).append(i_11_ % 10).append(":").append(i_12_ / 10).append(i_12_ % 10).toString();
	}

	static String method6859(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class288.method5083(l);
			calendar = aCalendar4846;
		} else {
			Class155.method2634(l);
			calendar = aCalendar4848;
		}
		int i_13_ = calendar.get(5);
		int i_14_ = calendar.get(2) + 1;
		int i_15_ = calendar.get(1);
		int i_16_ = calendar.get(11);
		int i_17_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_13_ / 10)).append(i_13_ % 10).append("/").append(i_14_ / 10).append(i_14_ % 10).append("/").append(i_15_ % 100 / 10).append(i_15_ % 10).append(" ").append(i_16_ / 10).append(i_16_ % 10).append(":").append(i_17_ / 10).append(i_17_ % 10).toString();
	}

	static String method6860(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class288.method5083(l);
			calendar = aCalendar4846;
		} else {
			Class155.method2634(l);
			calendar = aCalendar4848;
		}
		int i_18_ = calendar.get(5);
		int i_19_ = calendar.get(2) + 1;
		int i_20_ = calendar.get(1);
		int i_21_ = calendar.get(11);
		int i_22_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_18_ / 10)).append(i_18_ % 10).append("/").append(i_19_ / 10).append(i_19_ % 10).append("/").append(i_20_ % 100 / 10).append(i_20_ % 10).append(" ").append(i_21_ / 10).append(i_21_ % 10).append(":").append(i_22_ / 10).append(i_22_ % 10).toString();
	}

	static String method6861(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class288.method5083(l);
			calendar = aCalendar4846;
		} else {
			Class155.method2634(l);
			calendar = aCalendar4848;
		}
		int i_23_ = calendar.get(5);
		int i_24_ = calendar.get(2) + 1;
		int i_25_ = calendar.get(1);
		int i_26_ = calendar.get(11);
		int i_27_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_23_ / 10)).append(i_23_ % 10).append("/").append(i_24_ / 10).append(i_24_ % 10).append("/").append(i_25_ % 100 / 10).append(i_25_ % 10).append(" ").append(i_26_ / 10).append(i_26_ % 10).append(":").append(i_27_ / 10).append(i_27_ % 10).toString();
	}

	Class407() throws Throwable {
		throw new Error();
	}

	static String method6862(long l, int i) {
		Class155.method2634(l);
		int i_28_ = aCalendar4848.get(5);
		int i_29_ = aCalendar4848.get(2) + 1;
		int i_30_ = aCalendar4848.get(1);
		return new StringBuilder().append(Integer.toString(i_28_ / 10)).append(i_28_ % 10).append("/").append(i_29_ / 10).append(i_29_ % 10).append("/").append(i_30_ % 100 / 10).append(i_30_ % 10).toString();
	}

	public static String method6863(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class288.method5083(l);
			calendar = aCalendar4846;
		} else {
			Class155.method2634(l);
			calendar = aCalendar4848;
		}
		int i_31_ = calendar.get(5);
		int i_32_ = calendar.get(2);
		int i_33_ = calendar.get(1);
		int i_34_ = calendar.get(11);
		int i_35_ = calendar.get(12);
		if (i == 3)
			return Class450.method7499(l, i, bool, 2035363842);
		return new StringBuilder().append(Integer.toString(i_31_ / 10)).append(i_31_ % 10).append("-").append(aStringArrayArray4849[i][i_32_]).append("-").append(i_33_).append(" ").append(i_34_ / 10).append(i_34_ % 10).append(":").append(i_35_ / 10).append(i_35_ % 10).toString();
	}

	static String method6864(long l, int i) {
		Class155.method2634(l);
		int i_36_ = aCalendar4848.get(5);
		int i_37_ = aCalendar4848.get(2) + 1;
		int i_38_ = aCalendar4848.get(1);
		return new StringBuilder().append(Integer.toString(i_36_ / 10)).append(i_36_ % 10).append("/").append(i_37_ / 10).append(i_37_ % 10).append("/").append(i_38_ % 100 / 10).append(i_38_ % 10).toString();
	}

	public static String method6865(long l, int i) {
		Class155.method2634(l);
		int i_39_ = aCalendar4848.get(5);
		int i_40_ = aCalendar4848.get(2);
		int i_41_ = aCalendar4848.get(1);
		if (i == 3)
			return Class93.method1578(l, i, (byte) 8);
		return new StringBuilder().append(Integer.toString(i_39_ / 10)).append(i_39_ % 10).append("-").append(aStringArrayArray4849[i][i_40_]).append("-").append(i_41_).toString();
	}

	static void method6866(long l) {
		aCalendar4848.setTime(new Date(l));
	}

	static void method6867(long l) {
		aCalendar4846.setTime(new Date(l));
	}

	public static int[] method6868(int i) {
		int[] is = new int[3];
		Class155.method2634(Class302.method5363(i, 2135944380));
		is[0] = aCalendar4848.get(5);
		is[1] = aCalendar4848.get(2);
		is[2] = aCalendar4848.get(1);
		return is;
	}

	public static int[] method6869(int i) {
		int[] is = new int[3];
		Class155.method2634(Class302.method5363(i, -1294137687));
		is[0] = aCalendar4848.get(5);
		is[1] = aCalendar4848.get(2);
		is[2] = aCalendar4848.get(1);
		return is;
	}

	public static long method6870(int i) {
		return (long) (11745 + i) * 86400000L;
	}

	static final void method6871(int i, int i_42_, int i_43_, int i_44_, int i_45_) {
		Class210.method3612(i, i_42_, i_43_, 0, i_44_, false, (byte) -68);
	}
}
