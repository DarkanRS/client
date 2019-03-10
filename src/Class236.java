import java.util.LinkedList;
import java.util.Queue;

public class Class236 {

	static long aLong2910 = -1L;

	static int anInt2912 = 0;

	static boolean aBool2909 = true;

	static Class534_Sub2 aClass534_Sub2_2911 = new Class534_Sub2();

	static Class534_Sub1 aClass534_Sub1_2913 = new Class534_Sub1();

	static Queue aQueue2914 = new LinkedList();

	Class236() throws Throwable {
		throw new Error();
	}

	static final void method3983(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		cs2executor_2.intStackPtr -= 4;
		icomponentdefinitions_0.anInt1295 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.anInt1296 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 2];
		if (i_4 < 0) {
			i_4 = 0;
		} else if (i_4 > 5) {
			i_4 = 5;
		}
		int i_5 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 3];
		if (i_5 < 0) {
			i_5 = 0;
		} else if (i_5 > 5) {
			i_5 = 5;
		}
		icomponentdefinitions_0.aByte1333 = (byte) i_4;
		icomponentdefinitions_0.aByte1355 = (byte) i_5;
		Class109.method1858(icomponentdefinitions_0, (byte) -75);
		IdentikitDefinition.method913(interface_1, icomponentdefinitions_0, (byte) 1);
		if (icomponentdefinitions_0.anInt1268 == 0) {
			Class12.method483(interface_1, icomponentdefinitions_0, false, -1665129520);
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class396.method6774(icomponentdefinitions_0.idHash, (byte) -43);
		}
	}

	static void method3985(Animable animable_0, int i_1, byte b_2) {
		if (animable_0.currentAnimations != null) {
			Class249 class249_3 = (Class249) Class386.method6672(Class8_Sub3.method14339(2013063034), i_1, -1950936431);
			int i_4 = animable_0.currentAnimations[class249_3.method4268(306106666)];
			if (i_4 != animable_0.currentAnimation.method7597(-886146530)) {
				animable_0.currentAnimation.method7615(i_4, animable_0.currentAnimation.getSpeed(), 405438357);
				animable_0.anInt10367 = animable_0.anInt10355;
			}
		}
	}
}
