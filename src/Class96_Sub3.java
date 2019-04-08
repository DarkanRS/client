import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Class96_Sub3 extends CutsceneAction {

	static int anInt8518;

	int anInt8516;

	int anInt8517;

	public void method1592() {
		Class92 class92_2 = Class86.aClass92Array820[this.anInt8516];
		Class9.animateObject(class92_2.anInt965, class92_2.anInt962, class92_2.anInt966, class92_2.aClass458_963.anInt5494, class92_2.aClass458_963.type, class92_2.anInt967, this.anInt8517);
	}

	boolean method1599() {
		AnimationDefinitions animationdefinitions_2 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(this.anInt8517, (byte) 45);
		return animationdefinitions_2.ready();
	}

	public void method1601() {
		Class92 class92_1 = Class86.aClass92Array820[this.anInt8516 * 834292573 * -1978703627];
		Class9.animateObject(-1318859227 * class92_1.anInt965 * 1968020909, class92_1.anInt962 * 1631065949 * -76417803, -987984923 * class92_1.anInt966 * -1041057299, class92_1.aClass458_963.anInt5494 * -259002495 * 480268417, class92_1.aClass458_963.type * 2087055829 * 1109376893, -71092145 * class92_1.anInt967 * 1405673135, this.anInt8517 * 450467189 * -45034787);
	}

	Class96_Sub3(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt8516 = rsbytebuffer_1.readUnsignedShort();
		this.anInt8517 = rsbytebuffer_1.readBigSmart();
	}

	static String method13787(Throwable throwable_0) throws IOException {
		String str_2;
		if (throwable_0 instanceof RuntimeException_Sub3) {
			RuntimeException_Sub3 runtimeexception_sub3_3 = (RuntimeException_Sub3) throwable_0;
			str_2 = runtimeexception_sub3_3.aString10461 + " | ";
			throwable_0 = runtimeexception_sub3_3.aThrowable10462;
		} else {
			str_2 = "";
		}
		StringWriter stringwriter_13 = new StringWriter();
		PrintWriter printwriter_4 = new PrintWriter(stringwriter_13);
		throwable_0.printStackTrace(printwriter_4);
		printwriter_4.close();
		String string_5 = stringwriter_13.toString();
		BufferedReader bufferedreader_6 = new BufferedReader(new StringReader(string_5));
		String string_7 = bufferedreader_6.readLine();
		while (true) {
			String string_8 = bufferedreader_6.readLine();
			if (string_8 == null) {
				str_2 = str_2 + "| " + string_7;
				return str_2;
			}
			int i_9 = string_8.indexOf(40);
			int i_10 = string_8.indexOf(41, i_9 + 1);
			String string_11;
			if (i_9 != -1) {
				string_11 = string_8.substring(0, i_9);
			} else {
				string_11 = string_8;
			}
			string_11 = string_11.trim();
			string_11 = string_11.substring(string_11.lastIndexOf(32) + 1);
			string_11 = string_11.substring(string_11.lastIndexOf(9) + 1);
			str_2 = str_2 + string_11;
			if (i_9 != -1 && i_10 != -1) {
				int i_12 = string_8.indexOf(".java:", i_9);
				if (i_12 >= 0) {
					str_2 = str_2 + string_8.substring(i_12 + 5, i_10);
				}
			}
			str_2 = str_2 + ' ';
		}
	}
}
