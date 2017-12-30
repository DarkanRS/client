
/* Class292 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

public class Class292 {
	static final int anInt3493 = 8;
	static final int anInt3494 = 1;
	static final int anInt3495 = 2;
	static final int anInt3496 = 16;
	static final int anInt3497 = 62;
	static final int anInt3498 = 63;

	Class292() throws Throwable {
		throw new Error();
	}

	static final void method5197(CS2Executor class527, byte i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_0_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_1_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 1]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class521_Sub1_Sub1_Sub6.method16125(i_0_, i_1_, false, 1986479665);
	}

	static final void method5198(CS2Executor class527, int i) {
		int i_2_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (Class119.aClass426_1463.getItemDefinitions(i_2_, 1980153420).aBool5052 ? 1 : 0);
	}

	static final void method5199(CS2Executor class527, byte i) {
		int i_3_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (i_3_ != -1)
			Class123.method2152(i_3_, 1279989197);
	}

	static final void method5200(boolean bool, CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		if (bool)
			Class455.method7554(class98, class118, 658695956);
		else
			Class218.method3710(class98, class118, 983481657);
	}

	static final void method5201(int i, int i_4_, int i_5_, int i_6_, byte i_7_) {
		for (int i_8_ = 0; i_8_ < client.anInt7407 * 1858642375; i_8_++) {
			Rectangle rectangle = client.aRectangleArray7411[i_8_];
			if (rectangle.x + rectangle.width > i && rectangle.x < i + i_5_ && rectangle.height + rectangle.y > i_4_ && rectangle.y < i_4_ + i_6_)
				client.aBoolArray7443[i_8_] = true;
		}
	}
}
