/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class42 implements Interface2 {
	NativeSprite aClass160_414;
	Index aClass317_415;
	Class357 aClass357_416;

	public boolean method17() {
		return ((Class42) this).aClass317_415.method5661(((((Class42) this).aClass357_416.anInt4124) * -1847374165), -1305601959);
	}

	public void method18() {
		((Class42) this).aClass160_414 = Class152.method2600(((Class42) this).aClass317_415, (-1847374165 * ((Class42) this).aClass357_416.anInt4124), -2075798412);
	}

	Class42(Index class317, Class357 class357) {
		((Class42) this).aClass317_415 = class317;
		((Class42) this).aClass357_416 = class357;
	}

	public boolean method10(int i) {
		return ((Class42) this).aClass317_415.method5661(((((Class42) this).aClass357_416.anInt4124) * -1847374165), 1496586207);
	}

	public void method12(boolean bool) {
		if (bool) {
			int i = ((((Class42) this).aClass357_416.aClass356_4121.method6221(((Class42) this).aClass160_414.method228(), client.anInt7439 * 150480619, 2107635220)) + ((Class42) this).aClass357_416.anInt4123 * -809264285);
			int i_0_ = ((((Class42) this).aClass357_416.aClass353_4122.method6198(((Class42) this).aClass160_414.method2748(), 1176039023 * client.anInt7312, 649230584)) + 177795463 * ((Class42) this).aClass357_416.anInt4120);
			((Class42) this).aClass160_414.method2752(i, i_0_);
		}
	}

	public void method11(boolean bool) {
		if (bool) {
			int i = ((((Class42) this).aClass357_416.aClass356_4121.method6221(((Class42) this).aClass160_414.method228(), client.anInt7439 * 150480619, 1305006650)) + ((Class42) this).aClass357_416.anInt4123 * -809264285);
			int i_1_ = ((((Class42) this).aClass357_416.aClass353_4122.method6198(((Class42) this).aClass160_414.method2748(), 1176039023 * client.anInt7312, 2065837494)) + 177795463 * ((Class42) this).aClass357_416.anInt4120);
			((Class42) this).aClass160_414.method2752(i, i_1_);
		}
	}

	public void method16() {
		((Class42) this).aClass160_414 = Class152.method2600(((Class42) this).aClass317_415, (-1847374165 * ((Class42) this).aClass357_416.anInt4124), -1068914745);
	}

	public void method15() {
		((Class42) this).aClass160_414 = Class152.method2600(((Class42) this).aClass317_415, (-1847374165 * ((Class42) this).aClass357_416.anInt4124), -387196515);
	}

	public void method23() {
		((Class42) this).aClass160_414 = Class152.method2600(((Class42) this).aClass317_415, (-1847374165 * ((Class42) this).aClass357_416.anInt4124), -978898236);
	}

	public boolean method13() {
		return ((Class42) this).aClass317_415.method5661(((((Class42) this).aClass357_416.anInt4124) * -1847374165), -299517708);
	}

	public void method14(boolean bool) {
		if (bool) {
			int i = ((((Class42) this).aClass357_416.aClass356_4121.method6221(((Class42) this).aClass160_414.method228(), client.anInt7439 * 150480619, 2114569725)) + ((Class42) this).aClass357_416.anInt4123 * -809264285);
			int i_2_ = ((((Class42) this).aClass357_416.aClass353_4122.method6198(((Class42) this).aClass160_414.method2748(), 1176039023 * client.anInt7312, 699445183)) + 177795463 * ((Class42) this).aClass357_416.anInt4120);
			((Class42) this).aClass160_414.method2752(i, i_2_);
		}
	}

	public void method19() {
		((Class42) this).aClass160_414 = Class152.method2600(((Class42) this).aClass317_415, (-1847374165 * ((Class42) this).aClass357_416.anInt4124), -1296629447);
	}

	public void method22(int i) {
		((Class42) this).aClass160_414 = Class152.method2600(((Class42) this).aClass317_415, (-1847374165 * ((Class42) this).aClass357_416.anInt4124), -787343378);
	}

	public boolean method9() {
		return ((Class42) this).aClass317_415.method5661(((((Class42) this).aClass357_416.anInt4124) * -1847374165), -849546583);
	}

	public boolean method21() {
		return ((Class42) this).aClass317_415.method5661(((((Class42) this).aClass357_416.anInt4124) * -1847374165), -709821543);
	}

	public void method20(boolean bool, int i) {
		if (bool) {
			int i_3_ = ((((Class42) this).aClass357_416.aClass356_4121.method6221(((Class42) this).aClass160_414.method228(), client.anInt7439 * 150480619, 2066009749)) + ((Class42) this).aClass357_416.anInt4123 * -809264285);
			int i_4_ = ((((Class42) this).aClass357_416.aClass353_4122.method6198(((Class42) this).aClass160_414.method2748(), 1176039023 * client.anInt7312, 2002667061)) + 177795463 * ((Class42) this).aClass357_416.anInt4120);
			((Class42) this).aClass160_414.method2752(i_3_, i_4_);
		}
	}

	public static void method890(int i, int i_5_, int i_6_, byte i_7_) {
		if (Class260.aClass116_3229 != null && Class260.aClass116_3229.method1956(1160218565) && 773403033 * Class260.aClass116_3229.anInt1254 == i) {
			Class256.method4412(Class260.aClass116_3229, i_5_, 1627261277);
			Class260.anInt3223 = i * 919080253;
			Class260.aClass116_3229 = null;
			Class260.aClass282_Sub15_Sub2_3231 = null;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4531, client.aClass184_7475.isaac, -228003010);
			class282_sub23.buffer.writeInt(-1);
			client.aClass184_7475.method3049(class282_sub23, 1617512289);
		} else {
			i_5_ = i_5_ * Class393.aClass282_Sub54_4783.aClass468_Sub13_8228.method12714(-1100344734) >> 8;
			if (i == -1 && !Class260.aBool3220)
				Class226.method3805(-1719520107);
			else if (i != -1 && (1293234709 * Class260.anInt3223 != i || !Class116.method1966(1943151089)) && 0 != i_5_ && !Class260.aBool3220) {
				Class282_Sub1.method11615(i_6_, IndexLoaders.MUSIC_INDEX, i, 0, i_5_, false, new Class109_Sub1(), -752307268);
				Class468_Sub6.method12658(-406997007);
			}
			if (i != Class260.anInt3223 * 1293234709)
				Class260.aClass282_Sub15_Sub2_3231 = null;
			Class260.anInt3223 = i * 919080253;
			Class260.aClass277_3234 = null;
		}
	}

	public static long method891(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		Class407.aCalendar4846.clear();
		Class407.aCalendar4846.set(i_12_, i_11_, i_10_, i_9_, i_8_, i);
		return Class407.aCalendar4846.getTime().getTime();
	}

	static final void method892(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class118.aBool1306 ? 1 : 0;
	}
}
