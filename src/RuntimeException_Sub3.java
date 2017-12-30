
/* RuntimeException_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

public class RuntimeException_Sub3 extends RuntimeException {
	public static int anInt10457;
	public static String aString10458;
	static long aLong10459;
	public static Applet anApplet10460;
	String aString10461;
	Throwable aThrowable10462;

	static final String method16052(String string, String string_0_, String string_1_) {
		for (int i = string.indexOf(string_0_); i != -1; i = string.indexOf(string_0_, i + string_1_.length()))
			string = new StringBuilder().append(string.substring(0, i)).append(string_1_).append(string.substring(i + string_0_.length())).toString();
		return string;
	}

	RuntimeException_Sub3(Throwable throwable, String string) {
		((RuntimeException_Sub3) this).aString10461 = string;
		((RuntimeException_Sub3) this).aThrowable10462 = throwable;
		initCause(throwable);
	}

	static final String method16053(String string, String string_2_, String string_3_) {
		for (int i = string.indexOf(string_2_); i != -1; i = string.indexOf(string_2_, i + string_3_.length()))
			string = new StringBuilder().append(string.substring(0, i)).append(string_3_).append(string.substring(i + string_2_.length())).toString();
		return string;
	}

	static String method16054(Throwable throwable) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub3) {
			RuntimeException_Sub3 runtimeexception_sub3 = (RuntimeException_Sub3) throwable;
			string = new StringBuilder().append(((RuntimeException_Sub3) runtimeexception_sub3).aString10461).append(" | ").toString();
			throwable = (((RuntimeException_Sub3) runtimeexception_sub3).aThrowable10462);
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_4_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_4_));
		String string_5_ = bufferedreader.readLine();
		for (;;) {
			String string_6_ = bufferedreader.readLine();
			if (null == string_6_)
				break;
			int i = string_6_.indexOf('(');
			int i_7_ = string_6_.indexOf(')', i + 1);
			String string_8_;
			if (i != -1)
				string_8_ = string_6_.substring(0, i);
			else
				string_8_ = string_6_;
			string_8_ = string_8_.trim();
			string_8_ = string_8_.substring(string_8_.lastIndexOf(' ') + 1);
			string_8_ = string_8_.substring(string_8_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_8_).toString();
			if (i != -1 && -1 != i_7_) {
				int i_9_ = string_6_.indexOf(".java:", i);
				if (i_9_ >= 0)
					string = new StringBuilder().append(string).append(string_6_.substring(5 + i_9_, i_7_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_5_).toString();
		return string;
	}

	static String method16055(Throwable throwable) throws IOException {
		String string;
		if (throwable instanceof RuntimeException_Sub3) {
			RuntimeException_Sub3 runtimeexception_sub3 = (RuntimeException_Sub3) throwable;
			string = new StringBuilder().append(((RuntimeException_Sub3) runtimeexception_sub3).aString10461).append(" | ").toString();
			throwable = (((RuntimeException_Sub3) runtimeexception_sub3).aThrowable10462);
		} else
			string = "";
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_10_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_10_));
		String string_11_ = bufferedreader.readLine();
		for (;;) {
			String string_12_ = bufferedreader.readLine();
			if (null == string_12_)
				break;
			int i = string_12_.indexOf('(');
			int i_13_ = string_12_.indexOf(')', i + 1);
			String string_14_;
			if (i != -1)
				string_14_ = string_12_.substring(0, i);
			else
				string_14_ = string_12_;
			string_14_ = string_14_.trim();
			string_14_ = string_14_.substring(string_14_.lastIndexOf(' ') + 1);
			string_14_ = string_14_.substring(string_14_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_14_).toString();
			if (i != -1 && -1 != i_13_) {
				int i_15_ = string_12_.indexOf(".java:", i);
				if (i_15_ >= 0)
					string = new StringBuilder().append(string).append(string_12_.substring(5 + i_15_, i_13_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_11_).toString();
		return string;
	}

	static final void method16056(String string) {
		System.out.println(new StringBuilder().append("Error: ").append(Class96.method1609(string, "%0a", "\n", -1666688407)).toString());
	}

	public static void method16057(String string, Throwable throwable) {
		try {
			String string_16_ = "";
			if (throwable != null)
				string_16_ = Class96_Sub3.method13787(throwable, (byte) -121);
			if (string != null) {
				if (null != throwable)
					string_16_ = new StringBuilder().append(string_16_).append(" | ").toString();
				string_16_ = new StringBuilder().append(string_16_).append(string).toString();
			}
			CS2Executor.method11251(string_16_, 127181205);
			string_16_ = Class475.method7926(string_16_, -1338327602);
			if (null != anApplet10460) {
				String string_17_ = "Unknown";
				String string_18_ = "1.1";
				try {
					string_17_ = System.getProperty("java.vendor");
					string_18_ = System.getProperty("java.version");
				} catch (Exception exception) {
					/* empty */
				}
				URL url = new URL(anApplet10460.getCodeBase(), new StringBuilder().append("clienterror.ws?c=").append(-1705325745 * anInt10457).append("&cs=").append(-1529960075 * Class392.anInt4781).append("&u=").append(aString10458 != null ? Class475.method7926(aString10458, 473245135) : new StringBuilder().append("").append(7071485906675456853L * aLong10459).toString()).append("&v1=").append(Class475.method7926(string_17_, -153497428)).append("&v2=")
						.append(Class475.method7926(string_18_, -1459835465)).append("&e=").append(string_16_).toString());
				DataInputStream datainputstream = new DataInputStream(url.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	static final String method16058(String string, String string_19_, String string_20_) {
		for (int i = string.indexOf(string_19_); i != -1; i = string.indexOf(string_19_, i + string_20_.length()))
			string = new StringBuilder().append(string.substring(0, i)).append(string_20_).append(string.substring(i + string_19_.length())).toString();
		return string;
	}

	public static void method16059(String string, Throwable throwable) {
		try {
			String string_21_ = "";
			if (throwable != null)
				string_21_ = Class96_Sub3.method13787(throwable, (byte) -41);
			if (string != null) {
				if (null != throwable)
					string_21_ = new StringBuilder().append(string_21_).append(" | ").toString();
				string_21_ = new StringBuilder().append(string_21_).append(string).toString();
			}
			CS2Executor.method11251(string_21_, -1037935916);
			string_21_ = Class475.method7926(string_21_, -1854907362);
			if (null != anApplet10460) {
				String string_22_ = "Unknown";
				String string_23_ = "1.1";
				try {
					string_22_ = System.getProperty("java.vendor");
					string_23_ = System.getProperty("java.version");
				} catch (Exception exception) {
					/* empty */
				}
				URL url = new URL(anApplet10460.getCodeBase(), new StringBuilder().append("clienterror.ws?c=").append(-1705325745 * anInt10457).append("&cs=").append(-1529960075 * Class392.anInt4781).append("&u=").append(aString10458 != null ? Class475.method7926(aString10458, 88155643) : new StringBuilder().append("").append(7071485906675456853L * aLong10459).toString()).append("&v1=").append(Class475.method7926(string_22_, -325881984)).append("&v2=")
						.append(Class475.method7926(string_23_, 365739852)).append("&e=").append(string_21_).toString());
				DataInputStream datainputstream = new DataInputStream(url.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
