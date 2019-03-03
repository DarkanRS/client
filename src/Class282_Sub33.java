public class Class282_Sub33 extends Node {

	static Class282_Sub15_Sub2 aClass282_Sub15_Sub2_7836;
	int anInt7830 = Integer.MAX_VALUE;
	int anInt7828 = Integer.MIN_VALUE;
	int anInt7834 = Integer.MAX_VALUE;
	int anInt7833 = Integer.MIN_VALUE;
	int anInt7829 = Integer.MAX_VALUE;
	int anInt7832 = Integer.MIN_VALUE;
	int anInt7831 = Integer.MAX_VALUE;
	int anInt7827 = Integer.MIN_VALUE;
	Class282_Sub36 aClass282_Sub36_7835;

	boolean method12577(int i_1, int i_2, int i_3) {
		return i_1 >= this.anInt7830 && i_1 <= this.anInt7828 && i_2 >= this.anInt7834 && i_2 <= this.anInt7833 ? true : i_1 >= this.anInt7829 && i_1 <= this.anInt7832 && i_2 >= this.anInt7831 && i_2 <= this.anInt7827;
	}

	Class282_Sub33(Class282_Sub36 class282_sub36_1) {
		this.aClass282_Sub36_7835 = class282_sub36_1;
	}

	static String method12582(RsByteBuffer rsbytebuffer_0, int i_1, int i_2) {
		try {
			int i_4 = rsbytebuffer_0.readUnsignedSmart(1694471636);
			if (i_4 > i_1) {
				i_4 = i_1;
			}

			byte[] bytes_5 = new byte[i_4];
			rsbytebuffer_0.index += Class113.aClass117_1234.method1973(rsbytebuffer_0.buffer, rsbytebuffer_0.index, bytes_5, 0, i_4, (byte) -99);
			String string_6 = Class344.method6118(bytes_5, 0, i_4, (byte) -71);
			return string_6;
		} catch (Exception exception_8) {
			return "Cabbage";
		}
	}

	static final void method12583(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Class209.method3601(icomponentdefinitions_3, cs2executor_0, -1856078763);
	}

	static final void method12584(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class159.aClass450_2010.worldId;
	}

}
