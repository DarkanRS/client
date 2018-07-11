/* Class96_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class96_Sub10 extends Class96 {
	int anInt9295;
	int anInt9296;
	int anInt9297;
	
	Class96_Sub10(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub10) this).anInt9296 = class282_sub35.readUnsignedShort() * -1972436045;
		((Class96_Sub10) this).anInt9297 = class282_sub35.readUnsignedShort() * 468728079;
		((Class96_Sub10) this).anInt9295 = class282_sub35.readUnsignedByte() * 143267879;
	}

	boolean method1599(int i) {
		Class525 class525 = IndexLoaders.aClass515_9416.method8845((((Class96_Sub10) this).anInt9296) * 660169595, (byte) 90);
		boolean bool = class525.method11230(-1104094093);
		AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205(-364555849 * class525.anInt6977, (byte) -39);
		bool &= class518.method11132(2022289221);
		return bool;
	}

	boolean method1596() {
		Class525 class525 = IndexLoaders.aClass515_9416.method8845((((Class96_Sub10) this).anInt9296) * 660169595, (byte) -26);
		boolean bool = class525.method11230(-621133924);
		AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205(-364555849 * class525.anInt6977, (byte) 58);
		bool &= class518.method11132(1912479809);
		return bool;
	}

	boolean method1591() {
		Class525 class525 = IndexLoaders.aClass515_9416.method8845((((Class96_Sub10) this).anInt9296) * 660169595, (byte) -2);
		boolean bool = class525.method11230(-1374537529);
		AnimationDefinitions class518 = IndexLoaders.aClass523_3868.method11205(-364555849 * class525.anInt6977, (byte) -63);
		bool &= class518.method11132(1936584652);
		return bool;
	}

	static final void method14602(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_0_, (byte) 123);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class118.anInt1277 * 442725395;
	}

	public static void method14603(int i, int i_1_, int i_2_, String string, byte i_3_) {
		IComponentDefinitions class118 = Index.method5694(i_1_, i_2_, -1959607972);
		if (null != class118) {
			if (class118.params != null) {
				HookRequest request = new HookRequest();
				request.iComponentDefs = class118;
				request.anInt8051 = i * 161833325;
				request.opName = string;
				request.params = class118.params;
				Class96_Sub4.executeHookInner200k(request, 156165111);
			}
			if (client.method11633(class118).method12178(i - 1, (short) -2626)) {
				Class184 class184 = Class468_Sub20.method12807(870102038);
				if (-1741204137 * client.anInt7166 == 0 || 13 == client.anInt7166 * -1741204137) {
					if (1 == i) {
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4574, class184.isaac, 440245011);
						Class350_Sub3.method12590(class282_sub23, i_1_, i_2_, (-56249735 * class118.anInt1426), -1836374495);
						class184.method3049(class282_sub23, 1677489806);
					}
					if (i == 2) {
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4554, class184.isaac, -209568629);
						Class350_Sub3.method12590(class282_sub23, i_1_, i_2_, (-56249735 * class118.anInt1426), -1836374495);
						class184.method3049(class282_sub23, -641320368);
					}
					if (3 == i) {
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4527, class184.isaac, 67534413);
						Class350_Sub3.method12590(class282_sub23, i_1_, i_2_, (-56249735 * class118.anInt1426), -1836374495);
						class184.method3049(class282_sub23, 34641642);
					}
					if (i == 4) {
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4536, class184.isaac, 941336151);
						Class350_Sub3.method12590(class282_sub23, i_1_, i_2_, (class118.anInt1426 * -56249735), -1836374495);
						class184.method3049(class282_sub23, 1717133549);
					}
					if (i == 5) {
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4562, class184.isaac, -519873323);
						Class350_Sub3.method12590(class282_sub23, i_1_, i_2_, (-56249735 * class118.anInt1426), -1836374495);
						class184.method3049(class282_sub23, 1443340985);
					}
					if (6 == i) {
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4546, class184.isaac, 516854951);
						Class350_Sub3.method12590(class282_sub23, i_1_, i_2_, (-56249735 * class118.anInt1426), -1836374495);
						class184.method3049(class282_sub23, 1118744569);
					}
					if (i == 7) {
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4550, class184.isaac, 216995585);
						Class350_Sub3.method12590(class282_sub23, i_1_, i_2_, (-56249735 * class118.anInt1426), -1836374495);
						class184.method3049(class282_sub23, 1074910390);
					}
					if (i == 8) {
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4605, class184.isaac, 1816324678);
						Class350_Sub3.method12590(class282_sub23, i_1_, i_2_, (class118.anInt1426 * -56249735), -1836374495);
						class184.method3049(class282_sub23, -358596995);
					}
					if (i == 9) {
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4604, class184.isaac, 868991635);
						Class350_Sub3.method12590(class282_sub23, i_1_, i_2_, (-56249735 * class118.anInt1426), -1836374495);
						class184.method3049(class282_sub23, -986323584);
					}
					if (i == 10) {
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4608, class184.isaac, 486801259);
						Class350_Sub3.method12590(class282_sub23, i_1_, i_2_, (-56249735 * class118.anInt1426), -1836374495);
						class184.method3049(class282_sub23, -28228352);
					}
				}
			}
		}
	}

	static final void method14604(CS2Executor class527, byte i) {
		class527.intStackPtr -= 283782002;
		int i_4_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_5_ = (class527.intStack[class527.intStackPtr * 1942118537 + 1]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_4_ & i_5_;
	}

	static final void method14605(IComponentDefinitions class118, CS2Executor class527, byte i) {
		int i_6_ = 10;
		int i_7_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		Class274.method4883(class118, i_6_, i_7_, class527, -838566564);
	}
}
