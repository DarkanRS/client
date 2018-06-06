/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class149 {
	int anInt1741;
	int anInt1742;
	int anInt1743;
	static int anInt1744;
	
	abstract void method2555(int i, int i_0_);

	Class149(int i, int i_1_, int i_2_) {
		((Class149) this).anInt1743 = i * 440863295;
		((Class149) this).anInt1741 = -1378640425 * i_1_;
		((Class149) this).anInt1742 = i_2_ * 383825605;
	}

	abstract void method2556(int i, int i_3_, int i_4_);

	abstract void method2557(int i, int i_5_, byte i_6_);

	abstract void method2558(int i, int i_7_);

	abstract void method2559(int i, int i_8_);

	abstract void method2560(int i, int i_9_);

	abstract void method2561(int i, int i_10_, int i_11_);

	abstract void method2562(int i, int i_12_);

	static final void method2563(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class96_Sub18.method14664(class118, class98, true, 0, class527, (byte) -16);
	}

	static final void method2564(CS2Executor class527, byte i) {
		int i_13_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_13_, (byte) 82);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_13_ >> 16];
		Class44.method910(class118, class98, class527, 1996171820);
	}

	static int method2565(CharSequence charsequence, char c, int i) {
		int i_14_ = 0;
		int i_15_ = charsequence.length();
		for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
			if (charsequence.charAt(i_16_) == c)
				i_14_++;
		}
		return i_14_;
	}

	static final void method2566(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (0 != -1741204137 * client.anInt7166 || JS5CacheFile.method3360((byte) 72))
			client.aByte7458 = (byte) -5;
		else if (string.length() > 20)
			client.aByte7458 = (byte) -4;
		else {
			client.aByte7458 = (byte) -1;
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4624, client.aClass184_7218.isaac, 1473933655);
			class282_sub23.buffer.writeByte(0);
			int i_17_ = (-1990677291 * class282_sub23.buffer.index);
			class282_sub23.buffer.writeString(string);
			class282_sub23.buffer.method13061(-1990677291 * (class282_sub23.buffer.index) - i_17_, -1911140874);
			client.aClass184_7218.method3049(class282_sub23, -861728727);
		}
	}

	static final void method2567(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class463.method7729(class118, class98, class527, 1735506761);
	}

	static final void method2568(CS2Executor class527, byte i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub26_8224, ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) == 1) ? 1 : 0, -2145743553);
		Class190.method3148((byte) 49);
		client.aBool7175 = false;
	}
}
