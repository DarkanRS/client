import java.util.Iterator;

public class Class258 {

	Class258() throws Throwable {
		throw new Error();
	}

	static final void method4565(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		if (icomponentdefinitions_3.anInt1426 != -1) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1427;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	static final void method4566(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (client.aString7426 != null && i_2 < Class459.anInt5534) {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = Class467.aClass173Array5575[i_2].aString2127;
		} else {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = "";
		}

	}

	static final void method4567(CS2Executor cs2executor_0, short s_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2 > i_3 ? i_2 : i_3;
	}

	static final void method4568(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.anInt7000 -= 2;
		cs2executor_0.intStackPtr -= 2;
		Class119.method2074((String) cs2executor_0.objectStack[cs2executor_0.anInt7000], (String) cs2executor_0.objectStack[cs2executor_0.anInt7000 + 1], cs2executor_0.intStack[cs2executor_0.intStackPtr], cs2executor_0.intStack[cs2executor_0.intStackPtr + 1] == 1, (byte) 55);
	}

	static final void method4569(int i_0) {
		Iterator iterator_1 = client.aClass465_7334.iterator();

		while (iterator_1.hasNext()) {
			Class282_Sub50_Sub10 class282_sub50_sub10_2 = (Class282_Sub50_Sub10) iterator_1.next();
			Class521_Sub1_Sub1_Sub4 class521_sub1_sub1_sub4_3 = class282_sub50_sub10_2.aClass521_Sub1_Sub1_Sub4_9636;
			if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-831174311) != null && class521_sub1_sub1_sub4_3.method15927(-831489293)) {
				IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1442376239).method3397(class521_sub1_sub1_sub4_3, true, 402306072);
			}
		}

	}

	public static Class357 method4570(RsByteBuffer rsbytebuffer_0, int i_1) {
		int i_2 = rsbytebuffer_0.readBigSmart();
		Class356 class356_3 = Class350_Sub3_Sub1.method15558(251815760)[rsbytebuffer_0.readUnsignedByte()];
		Class353 class353_4 = AccountCreationResponseOpcodes.method8155(152314627)[rsbytebuffer_0.readUnsignedByte()];
		int i_5 = rsbytebuffer_0.readShort();
		int i_6 = rsbytebuffer_0.readShort();
		return new Class357(i_2, class356_3, class353_4, i_5, i_6);
	}

}
