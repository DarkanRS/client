
/* Class96_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class96_Sub3 extends Class96 {
	int anInt8516;
	int anInt8517;
	static int anInt8518;

	boolean method1596() {
		AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205((((Class96_Sub3) this).anInt8517) * -45034787, (byte) -33);
		return class518.method11132(1948514804);
	}

	public void method1592(int i) {
		Class92 class92 = (Class86.aClass92Array820[((Class96_Sub3) this).anInt8516 * -1978703627]);
		Class9.animateObject(-1318859227 * ((Class92) class92).anInt965, ((Class92) class92).anInt962 * -76417803, -987984923 * ((Class92) class92).anInt966, (((Class92) class92).aClass458_963.anInt5494 * 480268417), (((Class92) class92).aClass458_963.anInt5481 * 1109376893), -71092145 * ((Class92) class92).anInt967, ((Class96_Sub3) this).anInt8517 * -45034787, (byte) 1);
	}

	boolean method1599(int i) {
		AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205((((Class96_Sub3) this).anInt8517) * -45034787, (byte) 45);
		return class518.method11132(1971931825);
	}

	public void method1601() {
		Class92 class92 = (Class86.aClass92Array820[((Class96_Sub3) this).anInt8516 * -1978703627]);
		Class9.animateObject(-1318859227 * ((Class92) class92).anInt965, ((Class92) class92).anInt962 * -76417803, -987984923 * ((Class92) class92).anInt966, (((Class92) class92).aClass458_963.anInt5494 * 480268417), (((Class92) class92).aClass458_963.anInt5481 * 1109376893), -71092145 * ((Class92) class92).anInt967, ((Class96_Sub3) this).anInt8517 * -45034787, (byte) 1);
	}

	boolean method1591() {
		AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205((((Class96_Sub3) this).anInt8517) * -45034787, (byte) 59);
		return class518.method11132(2115233018);
	}

	Class96_Sub3(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub3) this).anInt8516 = class282_sub35.readUnsignedShort() * 834292573;
		((Class96_Sub3) this).anInt8517 = class282_sub35.readBigSmart() * 450467189;
	}

	static final void method13785(CS2Executor class527, int i) {
		int i_0_ = (class527.intOpValues[301123709 * class527.instrPtr]);
		class527.anInt7000 -= i_0_ * 1476624725;
		String string = Class377.method6398(class527.objectStack, 1806726141 * class527.anInt7000, i_0_, 2084790838);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static void method13786(int i, int i_1_, int i_2_, int i_3_, byte i_4_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(4, (long) i);
		class282_sub50_sub12.method14995(1205574173);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = -1773141545 * i_1_;
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9641 = 717659479 * i_2_;
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9642 = i_3_ * -1932168275;
	}

	static String method13787(Throwable throwable, byte i) throws IOException {
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
		String string_5_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_5_));
		String string_6_ = bufferedreader.readLine();
		for (;;) {
			String string_7_ = bufferedreader.readLine();
			if (null == string_7_)
				break;
			int i_8_ = string_7_.indexOf('(');
			int i_9_ = string_7_.indexOf(')', i_8_ + 1);
			String string_10_;
			if (i_8_ != -1)
				string_10_ = string_7_.substring(0, i_8_);
			else
				string_10_ = string_7_;
			string_10_ = string_10_.trim();
			string_10_ = string_10_.substring(string_10_.lastIndexOf(' ') + 1);
			string_10_ = string_10_.substring(string_10_.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(string_10_).toString();
			if (i_8_ != -1 && -1 != i_9_) {
				int i_11_ = string_7_.indexOf(".java:", i_8_);
				if (i_11_ >= 0)
					string = new StringBuilder().append(string).append(string_7_.substring(5 + i_11_, i_9_)).toString();
			}
			string = new StringBuilder().append(string).append(' ').toString();
		}
		string = new StringBuilder().append(string).append("| ").append(string_6_).toString();
		return string;
	}
}
