
import java.util.LinkedList;

public class Class337 {
	static LinkedList aLinkedList3969 = new LinkedList();

	Class337() throws Throwable {
		throw new Error();
	}

	static final void method6016(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_0_, (byte) 101);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_0_ >> 16];
		Class521_Sub1_Sub4.method14892(class118, class98, class527, (byte) 79);
	}

	public static void unloadInterface(int interfaceId, int i_1_) {
		WorldMapIndexLoader.aBoolArray2709[interfaceId] = false;
		Class12.clearComponents(interfaceId, -1495607995);
	}

	static final void method6018(Class521_Sub1 class521_sub1, CS2Executor class527, int i) {
		boolean bool = false;
		int i_2_ = 0;
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = 0;
		if (class521_sub1.aClass275_Sub5Array7965 != null) {
			for (int i_6_ = 0; i_6_ < class521_sub1.aClass275_Sub5Array7965.length; i_6_++) {
				Class275_Sub5 class275_sub5 = class521_sub1.aClass275_Sub5Array7965[i_6_];
				if (class275_sub5.aBool7849) {
					int i_7_;
					int i_8_;
					if (class275_sub5.anInt7850 < class275_sub5.anInt7847) {
						i_7_ = (class275_sub5.anInt7850 - class275_sub5.anInt7851);
						i_8_ = (class275_sub5.anInt7851 + class275_sub5.anInt7847);
					} else {
						i_7_ = (class275_sub5.anInt7847 - class275_sub5.anInt7851);
						i_8_ = (class275_sub5.anInt7850 + class275_sub5.anInt7851);
					}
					int i_9_;
					int i_10_;
					if (class275_sub5.anInt7846 < class275_sub5.anInt7848) {
						i_9_ = (class275_sub5.anInt7846 - class275_sub5.anInt7851);
						i_10_ = (class275_sub5.anInt7851 + class275_sub5.anInt7848);
					} else {
						i_9_ = (class275_sub5.anInt7848 - class275_sub5.anInt7851);
						i_10_ = (class275_sub5.anInt7846 + class275_sub5.anInt7851);
					}
					if (!bool || i_7_ < i_2_)
						i_2_ = i_7_;
					if (!bool || i_9_ < i_3_)
						i_3_ = i_9_;
					if (!bool || i_8_ > i_4_)
						i_4_ = i_8_;
					if (!bool || i_10_ > i_5_)
						i_5_ = i_10_;
					bool = true;
				}
			}
		}
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_2_;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_3_;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_4_;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_5_;
	}
}
