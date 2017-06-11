/* Class490 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

public class Class490 {
	public static long aLong6072 = 1000L;
	static Calendar aCalendar6073;
	static String[][] aStringArrayArray6074 = { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" },
			{ "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };
	static Calendar aCalendar6075;

	static {
		aCalendar6073 = Calendar.getInstance();
		aCalendar6075 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	Class490() throws Throwable {
		throw new Error();
	}

	static boolean method6169(int i, int i_0_) {
		try {
			return (i == 59 || i == 2 || i == 8 || i == 17 || 15 == i || 16 == i || 58 == i);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ue.bh(").append(')').toString());
		}
	}

	static void method6170(int i) {
		try {
			if (1090452523 * Class291.availableCPU > 1)
				Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub26_7577, 4, 102316213);
			else
				Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub26_7577, 2, -437930362);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ue.q(").append(')').toString());
		}
	}
}
