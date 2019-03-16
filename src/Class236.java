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
		icomponentdefinitions_0.basePositionX = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		icomponentdefinitions_0.basePositionY = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
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
		Class109.redrawComponent(icomponentdefinitions_0, (byte) -75);
		IdentikitDefinition.method913(interface_1, icomponentdefinitions_0);
		if (icomponentdefinitions_0.type == 0) {
			HostNameIdentifier.method483(interface_1, icomponentdefinitions_0, false, -1665129520);
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class396.method6774(icomponentdefinitions_0.idHash);
		}
	}

	static void method3985(Animable animable_0, int i_1, byte b_2) {
		if (animable_0.currentAnimations != null) {
			MovementType class249_3 = (MovementType) Class386.identify(Class8_Sub3.method14339(), i_1);
			int i_4 = animable_0.currentAnimations[class249_3.method4268()];
			if (i_4 != animable_0.currentAnimation.method7597()) {
				animable_0.currentAnimation.method7615(i_4, animable_0.currentAnimation.getSpeed());
				animable_0.anInt10367 = animable_0.anInt10355;
			}
		}
	}
}
