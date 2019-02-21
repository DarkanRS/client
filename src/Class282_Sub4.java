
/* Class282_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.BitSet;

public class Class282_Sub4 extends Node {
	public byte aByte7497;
	boolean aBool7498 = true;
	public Class57[] aClass57Array7499;
	int[] anIntArray7500;
	public String aString7501;
	long aLong7502;
	public int anInt7503 = 0;
	public byte aByte7504;
	boolean aBool7505;

	void method12094(Class57 class57) {
		if (null == aClass57Array7499 || anInt7503 * 1014406051 >= aClass57Array7499.length)
			method12112(5 + anInt7503 * 1014406051, (byte) 1);
		aClass57Array7499[(anInt7503 += -1628409845) * 1014406051 - 1] = class57;
		((Class282_Sub4) this).anIntArray7500 = null;
	}

	public Class282_Sub4(RsByteBuffer class282_sub35) {
		aString7501 = null;
		method12099(class282_sub35, 1015432776);
	}

	public int[] method12095(int i) {
		if (null == ((Class282_Sub4) this).anIntArray7500) {
			String[] strings = new String[1014406051 * anInt7503];
			((Class282_Sub4) this).anIntArray7500 = new int[1014406051 * anInt7503];
			for (int i_0_ = 0; i_0_ < anInt7503 * 1014406051; i_0_++) {
				strings[i_0_] = aClass57Array7499[i_0_].aString524;
				((Class282_Sub4) this).anIntArray7500[i_0_] = i_0_;
			}
			Class111.method1865(strings, ((Class282_Sub4) this).anIntArray7500, 413972480);
		}
		return ((Class282_Sub4) this).anIntArray7500;
	}

	void method12096(int i, byte i_1_) {
		anInt7503 -= -1628409845;
		if (1014406051 * anInt7503 == 0) {
			if (i_1_ != 2)
				return;
			aClass57Array7499 = null;
		} else
			Class503.method8359(aClass57Array7499, 1 + i, aClass57Array7499, i, anInt7503 * 1014406051 - i);
		((Class282_Sub4) this).anIntArray7500 = null;
	}

	void method12097(Class57 class57) {
		if (null == aClass57Array7499 || anInt7503 * 1014406051 >= aClass57Array7499.length)
			method12112(5 + anInt7503 * 1014406051, (byte) 1);
		aClass57Array7499[(anInt7503 += -1628409845) * 1014406051 - 1] = class57;
		((Class282_Sub4) this).anIntArray7500 = null;
	}

	public int method12098(String string, int i) {
		for (int i_2_ = 0; i_2_ < 1014406051 * anInt7503; i_2_++) {
			if (aClass57Array7499[i_2_].aString524.equalsIgnoreCase(string))
				return i_2_;
		}
		return -1;
	}

	void method12099(RsByteBuffer class282_sub35, int i) {
		int i_3_ = class282_sub35.readUnsignedByte();
		if (0 != (i_3_ & 0x1))
			((Class282_Sub4) this).aBool7505 = true;
		if ((i_3_ & 0x2) != 0)
			((Class282_Sub4) this).aBool7498 = true;
		data = class282_sub35.readLong(181951412) * -1253863389874800229L;
		((Class282_Sub4) this).aLong7502 = class282_sub35.readLong(456385505) * 8833176109314392467L;
		aString7501 = class282_sub35.readString();
		class282_sub35.readUnsignedByte();
		aByte7497 = class282_sub35.readByte();
		aByte7504 = class282_sub35.readByte();
		anInt7503 = class282_sub35.readUnsignedShort() * -1628409845;
		if (1014406051 * anInt7503 > 0) {
			aClass57Array7499 = new Class57[1014406051 * anInt7503];
			for (int i_4_ = 0; i_4_ < 1014406051 * anInt7503; i_4_++) {
				Class57 class57 = new Class57();
				if (((Class282_Sub4) this).aBool7505)
					class282_sub35.readLong(-77478356);
				if (((Class282_Sub4) this).aBool7498)
					class57.aString524 = class282_sub35.readString();
				class57.aByte525 = class282_sub35.readByte();
				class57.anInt526 = class282_sub35.readUnsignedShort() * -480639949;
				aClass57Array7499[i_4_] = class57;
			}
		}
	}

	static {
		new BitSet(65536);
	}

	void method12100(int i) {
		if (null != aClass57Array7499)
			Class503.method8359(aClass57Array7499, 0, aClass57Array7499 = new Class57[i], 0, 1014406051 * anInt7503);
		else
			aClass57Array7499 = new Class57[i];
	}

	public int method12101(String string) {
		for (int i = 0; i < 1014406051 * anInt7503; i++) {
			if (aClass57Array7499[i].aString524.equalsIgnoreCase(string))
				return i;
		}
		return -1;
	}

	void method12102(int i) {
		if (null != aClass57Array7499)
			Class503.method8359(aClass57Array7499, 0, aClass57Array7499 = new Class57[i], 0, 1014406051 * anInt7503);
		else
			aClass57Array7499 = new Class57[i];
	}

	public int[] method12103() {
		if (null == ((Class282_Sub4) this).anIntArray7500) {
			String[] strings = new String[1014406051 * anInt7503];
			((Class282_Sub4) this).anIntArray7500 = new int[1014406051 * anInt7503];
			for (int i = 0; i < anInt7503 * 1014406051; i++) {
				strings[i] = aClass57Array7499[i].aString524;
				((Class282_Sub4) this).anIntArray7500[i] = i;
			}
			Class111.method1865(strings, ((Class282_Sub4) this).anIntArray7500, -1673959654);
		}
		return ((Class282_Sub4) this).anIntArray7500;
	}

	void method12104(int i) {
		anInt7503 -= -1628409845;
		if (1014406051 * anInt7503 == 0)
			aClass57Array7499 = null;
		else
			Class503.method8359(aClass57Array7499, 1 + i, aClass57Array7499, i, anInt7503 * 1014406051 - i);
		((Class282_Sub4) this).anIntArray7500 = null;
	}

	void method12105(Class57 class57, byte i) {
		if (null == aClass57Array7499 || anInt7503 * 1014406051 >= aClass57Array7499.length)
			method12112(5 + anInt7503 * 1014406051, (byte) 1);
		aClass57Array7499[(anInt7503 += -1628409845) * 1014406051 - 1] = class57;
		((Class282_Sub4) this).anIntArray7500 = null;
	}

	void method12106(int i) {
		anInt7503 -= -1628409845;
		if (1014406051 * anInt7503 == 0)
			aClass57Array7499 = null;
		else
			Class503.method8359(aClass57Array7499, 1 + i, aClass57Array7499, i, anInt7503 * 1014406051 - i);
		((Class282_Sub4) this).anIntArray7500 = null;
	}

	void method12107(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readUnsignedByte();
		if (0 != (i & 0x1))
			((Class282_Sub4) this).aBool7505 = true;
		if ((i & 0x2) != 0)
			((Class282_Sub4) this).aBool7498 = true;
		data = class282_sub35.readLong(-16638582) * -1253863389874800229L;
		((Class282_Sub4) this).aLong7502 = class282_sub35.readLong(1432158484) * 8833176109314392467L;
		aString7501 = class282_sub35.readString();
		class282_sub35.readUnsignedByte();
		aByte7497 = class282_sub35.readByte();
		aByte7504 = class282_sub35.readByte();
		anInt7503 = class282_sub35.readUnsignedShort() * -1628409845;
		if (1014406051 * anInt7503 > 0) {
			aClass57Array7499 = new Class57[1014406051 * anInt7503];
			for (int i_5_ = 0; i_5_ < 1014406051 * anInt7503; i_5_++) {
				Class57 class57 = new Class57();
				if (((Class282_Sub4) this).aBool7505)
					class282_sub35.readLong(35779506);
				if (((Class282_Sub4) this).aBool7498)
					class57.aString524 = class282_sub35.readString();
				class57.aByte525 = class282_sub35.readByte();
				class57.anInt526 = class282_sub35.readUnsignedShort() * -480639949;
				aClass57Array7499[i_5_] = class57;
			}
		}
	}

	void method12108(int i) {
		if (null != aClass57Array7499)
			Class503.method8359(aClass57Array7499, 0, aClass57Array7499 = new Class57[i], 0, 1014406051 * anInt7503);
		else
			aClass57Array7499 = new Class57[i];
	}

	public int method12109(String string) {
		for (int i = 0; i < 1014406051 * anInt7503; i++) {
			if (aClass57Array7499[i].aString524.equalsIgnoreCase(string))
				return i;
		}
		return -1;
	}

	public int method12110(String string) {
		for (int i = 0; i < 1014406051 * anInt7503; i++) {
			if (aClass57Array7499[i].aString524.equalsIgnoreCase(string))
				return i;
		}
		return -1;
	}

	void method12111(int i) {
		anInt7503 -= -1628409845;
		if (1014406051 * anInt7503 == 0)
			aClass57Array7499 = null;
		else
			Class503.method8359(aClass57Array7499, 1 + i, aClass57Array7499, i, anInt7503 * 1014406051 - i);
		((Class282_Sub4) this).anIntArray7500 = null;
	}

	void method12112(int i, byte i_6_) {
		if (null != aClass57Array7499)
			Class503.method8359(aClass57Array7499, 0, aClass57Array7499 = new Class57[i], 0, 1014406051 * anInt7503);
		else
			aClass57Array7499 = new Class57[i];
	}

	void method12113(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readUnsignedByte();
		if (0 != (i & 0x1))
			((Class282_Sub4) this).aBool7505 = true;
		if ((i & 0x2) != 0)
			((Class282_Sub4) this).aBool7498 = true;
		data = class282_sub35.readLong(1863348043) * -1253863389874800229L;
		((Class282_Sub4) this).aLong7502 = class282_sub35.readLong(2125197101) * 8833176109314392467L;
		aString7501 = class282_sub35.readString();
		class282_sub35.readUnsignedByte();
		aByte7497 = class282_sub35.readByte();
		aByte7504 = class282_sub35.readByte();
		anInt7503 = class282_sub35.readUnsignedShort() * -1628409845;
		if (1014406051 * anInt7503 > 0) {
			aClass57Array7499 = new Class57[1014406051 * anInt7503];
			for (int i_7_ = 0; i_7_ < 1014406051 * anInt7503; i_7_++) {
				Class57 class57 = new Class57();
				if (((Class282_Sub4) this).aBool7505)
					class282_sub35.readLong(1267407828);
				if (((Class282_Sub4) this).aBool7498)
					class57.aString524 = class282_sub35.readString();
				class57.aByte525 = class282_sub35.readByte();
				class57.anInt526 = class282_sub35.readUnsignedShort() * -480639949;
				aClass57Array7499[i_7_] = class57;
			}
		}
	}

	public static void method12114(int i, int i_8_) {
		if (37 == i)
			Class291_Sub1.aFloat3462 = 3.0F;
		else if (50 == i)
			Class291_Sub1.aFloat3462 = 4.0F;
		else if (i == 75)
			Class291_Sub1.aFloat3462 = 6.0F;
		else if (i == 100)
			Class291_Sub1.aFloat3462 = 8.0F;
		else if (i == 200)
			Class291_Sub1.aFloat3462 = 16.0F;
		Class291_Sub1.anInt8016 = 638834387;
		Class291_Sub1.anInt8016 = 638834387;
	}

	static final void method12115(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = -672443707 * NativeLibraryLoader.anInt3240 == 2 ? 1 : 0;
	}

	static final void method12116(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub50_Sub17.method15511(class118, class98, class527, (byte) 63);
	}

	static void method12117(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		if (i != i_10_ || i_11_ != i_9_ || i_14_ != i_12_ || i_15_ != i_13_) {
			int i_18_ = i;
			int i_19_ = i_9_;
			int i_20_ = 3 * i;
			int i_21_ = 3 * i_9_;
			int i_22_ = i_10_ * 3;
			int i_23_ = 3 * i_11_;
			int i_24_ = 3 * i_12_;
			int i_25_ = i_13_ * 3;
			int i_26_ = i_14_ - i_24_ + i_22_ - i;
			int i_27_ = i_15_ - i_25_ + i_23_ - i_9_;
			int i_28_ = i_24_ - i_22_ - i_22_ + i_20_;
			int i_29_ = i_21_ + (i_25_ - i_23_ - i_23_);
			int i_30_ = i_22_ - i_20_;
			int i_31_ = i_23_ - i_21_;
			for (int i_32_ = 128; i_32_ <= 4096; i_32_ += 128) {
				int i_33_ = i_32_ * i_32_ >> 12;
				int i_34_ = i_33_ * i_32_ >> 12;
				int i_35_ = i_26_ * i_34_;
				int i_36_ = i_34_ * i_27_;
				int i_37_ = i_28_ * i_33_;
				int i_38_ = i_33_ * i_29_;
				int i_39_ = i_32_ * i_30_;
				int i_40_ = i_32_ * i_31_;
				int i_41_ = i + (i_37_ + i_35_ + i_39_ >> 12);
				int i_42_ = (i_36_ + i_38_ + i_40_ >> 12) + i_9_;
				AnimationIndexLoader.method11220(i_18_, i_19_, i_41_, i_42_, i_16_, (byte) 85);
				i_18_ = i_41_;
				i_19_ = i_42_;
			}
		} else
			AnimationIndexLoader.method11220(i, i_9_, i_14_, i_15_, i_16_, (byte) 47);
	}

	static final void method12118(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class241.method4149(class118, class98, class527, -799762783);
	}
}
