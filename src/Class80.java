/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class80 {
	static int anInt749 = 0;
	int[] anIntArray750;
	static int anInt751 = 2;
	int[] anIntArray752;

	Class80(RsByteBuffer class298_sub53) {
		int i = class298_sub53.readUnsignedSmart(1723054621);
		((Class80) this).anIntArray750 = new int[i];
		((Class80) this).anIntArray752 = new int[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = class298_sub53.readUnsignedByte();
			((Class80) this).anIntArray750[i_0_] = i_1_;
			int i_2_ = class298_sub53.readUnsignedShort();
			int i_3_ = class298_sub53.readUnsignedShort();
			((Class80) this).anIntArray752[i_0_] = i_3_ + (i_2_ << 16);
		}
	}

	void method852(Class94 class94, int i, int i_4_) {
		try {
			int i_5_ = ((Class80) this).anIntArray752[0];
			class94.method1017(i, i_5_ >>> 16, i_5_ & 0xffff, -1002380279);
			Entity class365_sub1_sub1_sub2 = class94.method1015(1609800550);
			class365_sub1_sub1_sub2.anInt10120 = 0;
			for (int i_6_ = ((Class80) this).anIntArray750.length - 1; i_6_ >= 0; i_6_--) {
				int i_7_ = ((Class80) this).anIntArray750[i_6_];
				int i_8_ = ((Class80) this).anIntArray752[i_6_];
				class365_sub1_sub1_sub2.scenePositionXQueue[class365_sub1_sub1_sub2.anInt10120 * 2050671733] = i_8_ >> 16;
				class365_sub1_sub1_sub2.scenePositionYQueue[2050671733 * class365_sub1_sub1_sub2.anInt10120] = i_8_ & 0xffff;
				byte i_9_ = Class282.aClass282_6540.aByte6542;
				if (0 == i_7_)
					i_9_ = Class282.aClass282_6545.aByte6542;
				else if (2 == i_7_)
					i_9_ = Class282.aClass282_6541.aByte6542;
				class365_sub1_sub1_sub2.aByteArray10110[class365_sub1_sub1_sub2.anInt10120 * 2050671733] = i_9_;
				class365_sub1_sub1_sub2.anInt10120 += -1013322787;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("df.a(").append(')').toString());
		}
	}

	public static Class158 method853(RsByteBuffer class298_sub53, short i) {
		try {
			int i_10_ = class298_sub53.readBigSmart(1235052657);
			Class139 class139 = (Class491.method6176((byte) 44)[class298_sub53.readUnsignedByte()]);
			Class133 class133 = (Class113.method1255(126968516)[class298_sub53.readUnsignedByte()]);
			int i_11_ = class298_sub53.readShort(1556136554);
			int i_12_ = class298_sub53.readShort(1903752417);
			return new Class158(i_10_, class139, class133, i_11_, i_12_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("df.a(").append(')').toString());
		}
	}

	static final void method854(ClientScript2 class403, byte i) {
		try {
			int i_13_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_13_, (byte) 76);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class105.anInt1162 * 457937409;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("df.qn(").append(')').toString());
		}
	}

	static final void method855(byte i) {
		try {
			for (Class302_Sub5 class302_sub5 = ((Class302_Sub5) client.aClass442_8781.method5871((byte) 3)); null != class302_sub5; class302_sub5 = ((Class302_Sub5) client.aClass442_8781.method5871((byte) 3)))
				Class152.method1655(class302_sub5, -1638035740);
			int i_14_ = 0;
			int i_15_ = 3;
			if (0 == client.anInt8724 * 1596783995) {
				for (int i_16_ = i_14_; i_16_ <= i_15_; i_16_++)
					client.method2797(i_16_);
				client.method2799();
			} else {
				client.method2795();
				for (int i_17_ = i_14_; i_17_ <= i_15_; i_17_++) {
					client.method2807();
					client.method2796(i_17_);
					client.method2797(i_17_);
				}
				client.method2798();
				client.method2799();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("df.ii(").append(')').toString());
		}
	}

	static final void method856(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_18_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_19_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string.substring(i_18_, i_19_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("df.aas(").append(')').toString());
		}
	}
}
