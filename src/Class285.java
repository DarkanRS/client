import java.util.Stack;

public class Class285 {

	public Class521_Sub1 aClass521_Sub1_3391;
	boolean aBool3392;
	Login aClass284_3393;
	public static FontRenderer aClass8_3394;
	static Stack aStack3390 = new Stack();

	public boolean method5019(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4) {
		int i_5 = this.aClass521_Sub1_3391.method12996(712320257);
		if (this.aClass521_Sub1_3391.aClass275_Sub5Array7965 != null) {
			for (int i_6 = 0; i_6 < this.aClass521_Sub1_3391.aClass275_Sub5Array7965.length; i_6++) {
				this.aClass521_Sub1_3391.aClass275_Sub5Array7965[i_6].anInt7851 <<= i_5;
				if (this.aClass521_Sub1_3391.aClass275_Sub5Array7965[i_6].method12594(this.aClass284_3393.anInt3387 + i_2, i_3 + this.aClass284_3393.anInt3385) && this.aClass521_Sub1_3391.method12983(graphicalrenderer_1, i_2, i_3, -1469833306)) {
					this.aClass521_Sub1_3391.aClass275_Sub5Array7965[i_6].anInt7851 >>= i_5;
					return true;
				}

				this.aClass521_Sub1_3391.aClass275_Sub5Array7965[i_6].anInt7851 >>= i_5;
			}
		}

		return false;
	}

	static final void method5024(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 82);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class96_Sub18.method14664(icomponentdefinitions_3, interface_4, false, 2, cs2executor_0, (byte) 56);
	}

	public static String method5025(CharSequence charsequence_0, int i_1) {
		String string_2 = Class179.method3018(Class366.method6302(charsequence_0, (byte) 18));
		if (string_2 == null) {
			string_2 = "";
		}

		return string_2;
	}

	public static int method5026(CharSequence charsequence_0, int i_1, byte b_2) {
		return Class356.parseInt(charsequence_0, i_1, true, 2038427942);
	}

	static final void method5027(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		Class117.method1978(cs2executor_0.intStack[cs2executor_0.intStackPtr], cs2executor_0.intStack[cs2executor_0.intStackPtr + 1], 255, (byte) 1);
	}

	public static int getCRC(byte[] bytes_0, int i_1) {
		return Class455.getCRC(bytes_0, 0, i_1);
	}

	static final void method5029(CS2Executor cs2executor_0, short s_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Class282_Sub20_Sub4.method15207(icomponentdefinitions_3, cs2executor_0, -304097122);
	}

}
