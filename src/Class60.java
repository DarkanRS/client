/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class60 {
	public static Class60 aClass60_601;
	public static Class60 aClass60_602;
	public static Class60 aClass60_603;
	public static Class60 aClass60_604;
	public static Class60 aClass60_605;
	public static Class60 aClass60_606;
	public static Class60 aClass60_607;
	public static Class60 aClass60_608;
	public static Class60 aClass60_609 = new Class60(1);
	public static Class60 aClass60_610;
	public int anInt611;
	public static NativeSprite aClass160_612;

	Class60(int i) {
		anInt611 = i * -103195257;
	}

	static {
		aClass60_602 = new Class60(2);
		aClass60_603 = new Class60(2);
		aClass60_608 = new Class60(2);
		aClass60_605 = new Class60(1);
		aClass60_606 = new Class60(1);
		aClass60_607 = new Class60(1);
		aClass60_604 = new Class60(2);
		aClass60_601 = new Class60(1);
		aClass60_610 = new Class60(2);
	}

	public static Class60[] method1164() {
		return (new Class60[] { aClass60_609, aClass60_602, aClass60_603, aClass60_608, aClass60_605, aClass60_606, aClass60_607, aClass60_604, aClass60_601, aClass60_610 });
	}

	public static Class60[] method1165() {
		return (new Class60[] { aClass60_609, aClass60_602, aClass60_603, aClass60_608, aClass60_605, aClass60_606, aClass60_607, aClass60_604, aClass60_601, aClass60_610 });
	}

	public static boolean method1166(int i, int i_0_) {
		return 1 == i || i == 3 || 5 == i;
	}

	static final void method1167(CS2Executor class527, int i) {
		int i_1_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_1_, (byte) 23);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_1_ >> 16];
		FontRenderer.method403(class118, class98, class527, 2136495218);
	}

	public static IncomingPacket[] getIncommingPacket() {
		return (new IncomingPacket[] { IncomingPacket.PLAYER_ON_ICOMPONENT, IncomingPacket.aClass375_4352, IncomingPacket.aClass375_4504, IncomingPacket.aClass375_4354, IncomingPacket.aClass375_4450, IncomingPacket.aClass375_4356, IncomingPacket.NPC_UPDATE, IncomingPacket.CONFIG_2, IncomingPacket.aClass375_4381, IncomingPacket.aClass375_4360, IncomingPacket.aClass375_4361, IncomingPacket.aClass375_4362, IncomingPacket.GLOBAL_CONFIG_1, IncomingPacket.aClass375_4365, IncomingPacket.aClass375_4473,
				IncomingPacket.aClass375_4392, IncomingPacket.aClass375_4367, IncomingPacket.aClass375_4368, IncomingPacket.aClass375_4433, IncomingPacket.aClass375_4370, IncomingPacket.aClass375_4402, IncomingPacket.aClass375_4372, IncomingPacket.aClass375_4510, IncomingPacket.aClass375_4374, IncomingPacket.aClass375_4391, IncomingPacket.aClass375_4376, IncomingPacket.aClass375_4377, IncomingPacket.CREATE_GROUND_ITEM, IncomingPacket.aClass375_4480, IncomingPacket.PING,
				IncomingPacket.aClass375_4427, IncomingPacket.aClass375_4382, IncomingPacket.aClass375_4394, IncomingPacket.aClass375_4384, IncomingPacket.aClass375_4385, IncomingPacket.aClass375_4386, IncomingPacket.aClass375_4397, IncomingPacket.WINDOW_PANE_PACKET, IncomingPacket.INTERFACE, IncomingPacket.aClass375_4371, IncomingPacket.aClass375_4399, IncomingPacket.WORLD_TILE, IncomingPacket.aClass375_4393, IncomingPacket.PLAYER_UPDATE, IncomingPacket.aClass375_4395,
				IncomingPacket.aClass375_4440, IncomingPacket.aClass375_4502, IncomingPacket.NPC_UPDATE_LARGE, IncomingPacket.MOVE_ICOMPONENT, IncomingPacket.aClass375_4400, IncomingPacket.aClass375_4401, IncomingPacket.DYNAMIC_MAP_REGION, IncomingPacket.aClass375_4499, IncomingPacket.aClass375_4478, IncomingPacket.aClass375_4511, IncomingPacket.aClass375_4406, IncomingPacket.aClass375_4429, IncomingPacket.aClass375_4408, IncomingPacket.aClass375_4409, IncomingPacket.aClass375_4410,
				IncomingPacket.aClass375_4411, IncomingPacket.aClass375_4412, IncomingPacket.aClass375_4413, IncomingPacket.aClass375_4414, IncomingPacket.RUN_ENERGY, IncomingPacket.aClass375_4416, IncomingPacket.aClass375_4390, IncomingPacket.aClass375_4373, IncomingPacket.VARPBIT_1, IncomingPacket.DESTROY_OBJECT, IncomingPacket.aClass375_4421, IncomingPacket.aClass375_4422, IncomingPacket.aClass375_4423, IncomingPacket.aClass375_4396, IncomingPacket.aClass375_4425,
				IncomingPacket.aClass375_4426, IncomingPacket.aClass375_4492, IncomingPacket.aClass375_4428, IncomingPacket.aClass375_4407, IncomingPacket.aClass375_4430, IncomingPacket.OBJECT_ANIMATION, IncomingPacket.aClass375_4432, IncomingPacket.aClass375_4417, IncomingPacket.aClass375_4434, IncomingPacket.aClass375_4435, IncomingPacket.REGION, IncomingPacket.aClass375_4437, IncomingPacket.aClass375_4438, IncomingPacket.aClass375_4439, IncomingPacket.aClass375_4387,
				IncomingPacket.aClass375_4441, IncomingPacket.aClass375_4442, IncomingPacket.aClass375_4443, IncomingPacket.aClass375_4359, IncomingPacket.aClass375_4445, IncomingPacket.aClass375_4446, IncomingPacket.aClass375_4418, IncomingPacket.aClass375_4448, IncomingPacket.aClass375_4449, IncomingPacket.RUN_CS2_SCRIPT, IncomingPacket.aClass375_4451, IncomingPacket.aClass375_4452, IncomingPacket.aClass375_4491, IncomingPacket.aClass375_4358, IncomingPacket.aClass375_4455,
				IncomingPacket.aClass375_4456, IncomingPacket.aClass375_4457, IncomingPacket.aClass375_4458, IncomingPacket.VARPBIT_2, IncomingPacket.NPC_ON_ICOMPONENT, IncomingPacket.aClass375_4461, IncomingPacket.aClass375_4462, IncomingPacket.aClass375_4463, IncomingPacket.aClass375_4464, IncomingPacket.aClass375_4465, IncomingPacket.CONFIG_1, IncomingPacket.GLOBAL_CONFIG_2, IncomingPacket.CREATE_OBJECT, IncomingPacket.aClass375_4469, IncomingPacket.aClass375_4470,
				IncomingPacket.aClass375_4404, IncomingPacket.ICOMPONENT_SETTINGS, IncomingPacket.aClass375_4509, IncomingPacket.aClass375_4474, IncomingPacket.aClass375_4475, IncomingPacket.REMOVE_GROUND_ITEM, IncomingPacket.aClass375_4477, IncomingPacket.aClass375_4500, IncomingPacket.aClass375_4479, IncomingPacket.aClass375_4364, IncomingPacket.aClass375_4481, IncomingPacket.aClass375_4353, IncomingPacket.aClass375_4483, IncomingPacket.aClass375_4355, IncomingPacket.aClass375_4453,
				IncomingPacket.aClass375_4486, IncomingPacket.aClass375_4487, IncomingPacket.aClass375_4488, IncomingPacket.aClass375_4489, IncomingPacket.aClass375_4351, IncomingPacket.aClass375_4490, IncomingPacket.aClass375_4484, IncomingPacket.aClass375_4493, IncomingPacket.PROJECTILE, IncomingPacket.aClass375_4495, IncomingPacket.aClass375_4496, IncomingPacket.aClass375_4497, IncomingPacket.aClass375_4498, IncomingPacket.aClass375_4383, IncomingPacket.aClass375_4375,
				IncomingPacket.aClass375_4501, IncomingPacket.aClass375_4444, IncomingPacket.aClass375_4369, IncomingPacket.aClass375_4482, IncomingPacket.aClass375_4505, IncomingPacket.aClass375_4506, IncomingPacket.aClass375_4507, IncomingPacket.aClass375_4508, IncomingPacket.aClass375_4379, IncomingPacket.aClass375_4405, IncomingPacket.GAME_MESSAGE });
	}

	public static boolean method1169(char c, byte i) {
		return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	public static void method1170(int i) {
		if (client.aBool7344) {
			Class118 class118 = Index.method5694(728544879 * Class7.anInt56, client.anInt7345 * -1673073865, 1160609713);
			if (class118 != null && class118.anObjectArray1396 != null) {
				Class282_Sub43 class282_sub43 = new Class282_Sub43();
				class282_sub43.aClass118_8053 = class118;
				class282_sub43.anObjectArray8054 = class118.anObjectArray1396;
				Class96_Sub4.method13790(class282_sub43, 1386646091);
			}
			client.anInt7427 = 434551523;
			client.anInt7346 = -2109153983;
			client.aBool7344 = false;
			if (null != class118)
				Class109.method1858(class118, (byte) 30);
		}
	}

	static final void method1171(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 487511911 * class527.aClass61_7010.anInt641;
	}

	static void method1172(int i) {
		if (Class90.aClass496_952 != Class496.aClass496_5810)
			Class361.aClass361_4174.method6257(-84783453);
	}

	static final void method1173(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 1334854505 * client.anInt7422;
	}

	static final void method1174(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		ItemIndexLoader.method7170(i_3_, 377314002);
		int i_8_ = 0;
		int i_9_ = i_3_ - i_6_;
		if (i_9_ < 0)
			i_9_ = 0;
		int i_10_ = i_3_;
		int i_11_ = -i_3_;
		int i_12_ = i_9_;
		int i_13_ = -i_9_;
		int i_14_ = -1;
		int i_15_ = -1;
		if (i_2_ >= Class532_Sub3.anInt7070 * 324226563 && i_2_ <= Class532_Sub3.anInt7068 * -348932735) {
			int[] is = Class532_Sub3.anIntArrayArray7072[i_2_];
			int i_16_ = Class275.method4890(i - i_3_, Class532_Sub3.anInt7071 * -612590951, -1345107225 * Class532_Sub3.anInt7069, 1149911370);
			int i_17_ = Class275.method4890(i_3_ + i, -612590951 * Class532_Sub3.anInt7071, -1345107225 * Class532_Sub3.anInt7069, -1752676227);
			int i_18_ = Class275.method4890(i - i_9_, -612590951 * Class532_Sub3.anInt7071, -1345107225 * Class532_Sub3.anInt7069, 543795752);
			int i_19_ = Class275.method4890(i_9_ + i, Class532_Sub3.anInt7071 * -612590951, Class532_Sub3.anInt7069 * -1345107225, 1403864905);
			Class232.method3922(is, i_16_, i_18_, i_5_, (byte) -39);
			Class232.method3922(is, i_18_, i_19_, i_4_, (byte) -10);
			Class232.method3922(is, i_19_, i_17_, i_5_, (byte) -23);
		}
		while (i_10_ > i_8_) {
			i_14_ += 2;
			i_15_ += 2;
			i_11_ += i_14_;
			i_13_ += i_15_;
			if (i_13_ >= 0 && i_12_ >= 1) {
				i_12_--;
				i_13_ -= i_12_ << 1;
				Class5.anIntArray36[i_12_] = i_8_;
			}
			i_8_++;
			if (i_11_ >= 0) {
				i_10_--;
				i_11_ -= i_10_ << 1;
				int i_20_ = i_2_ - i_10_;
				int i_21_ = i_10_ + i_2_;
				if (i_21_ >= 324226563 * Class532_Sub3.anInt7070 && i_20_ <= -348932735 * Class532_Sub3.anInt7068) {
					if (i_10_ >= i_9_) {
						int i_22_ = Class275.method4890(i_8_ + i, (Class532_Sub3.anInt7071 * -612590951), (Class532_Sub3.anInt7069 * -1345107225), -617603444);
						int i_23_ = Class275.method4890(i - i_8_, (Class532_Sub3.anInt7071 * -612590951), (Class532_Sub3.anInt7069 * -1345107225), -1801446753);
						if (i_21_ <= -348932735 * Class532_Sub3.anInt7068)
							Class232.method3922((Class532_Sub3.anIntArrayArray7072[i_21_]), i_23_, i_22_, i_5_, (byte) -23);
						if (i_20_ >= Class532_Sub3.anInt7070 * 324226563)
							Class232.method3922((Class532_Sub3.anIntArrayArray7072[i_20_]), i_23_, i_22_, i_5_, (byte) 29);
					} else {
						int i_24_ = Class5.anIntArray36[i_10_];
						int i_25_ = Class275.method4890(i + i_8_, (Class532_Sub3.anInt7071 * -612590951), (-1345107225 * Class532_Sub3.anInt7069), 877789143);
						int i_26_ = Class275.method4890(i - i_8_, (Class532_Sub3.anInt7071 * -612590951), (-1345107225 * Class532_Sub3.anInt7069), 58227539);
						int i_27_ = Class275.method4890(i + i_24_, (Class532_Sub3.anInt7071 * -612590951), (Class532_Sub3.anInt7069 * -1345107225), -1073712474);
						int i_28_ = Class275.method4890(i - i_24_, (Class532_Sub3.anInt7071 * -612590951), (-1345107225 * Class532_Sub3.anInt7069), 87726144);
						if (i_21_ <= -348932735 * Class532_Sub3.anInt7068) {
							int[] is = Class532_Sub3.anIntArrayArray7072[i_21_];
							Class232.method3922(is, i_26_, i_28_, i_5_, (byte) 31);
							Class232.method3922(is, i_28_, i_27_, i_4_, (byte) -76);
							Class232.method3922(is, i_27_, i_25_, i_5_, (byte) 42);
						}
						if (i_20_ >= Class532_Sub3.anInt7070 * 324226563) {
							int[] is = Class532_Sub3.anIntArrayArray7072[i_20_];
							Class232.method3922(is, i_26_, i_28_, i_5_, (byte) -28);
							Class232.method3922(is, i_28_, i_27_, i_4_, (byte) -31);
							Class232.method3922(is, i_27_, i_25_, i_5_, (byte) -10);
						}
					}
				}
			}
			int i_29_ = i_2_ - i_8_;
			int i_30_ = i_2_ + i_8_;
			if (i_30_ >= Class532_Sub3.anInt7070 * 324226563 && i_29_ <= -348932735 * Class532_Sub3.anInt7068) {
				int i_31_ = i + i_10_;
				int i_32_ = i - i_10_;
				if (i_31_ >= -612590951 * Class532_Sub3.anInt7071 && i_32_ <= Class532_Sub3.anInt7069 * -1345107225) {
					i_31_ = Class275.method4890(i_31_, (Class532_Sub3.anInt7071 * -612590951), (-1345107225 * Class532_Sub3.anInt7069), 686110117);
					i_32_ = Class275.method4890(i_32_, (-612590951 * Class532_Sub3.anInt7071), (Class532_Sub3.anInt7069 * -1345107225), -716811882);
					if (i_8_ < i_9_) {
						int i_33_ = i_12_ < i_8_ ? Class5.anIntArray36[i_8_] : i_12_;
						int i_34_ = Class275.method4890(i + i_33_, (-612590951 * Class532_Sub3.anInt7071), (Class532_Sub3.anInt7069 * -1345107225), -569174694);
						int i_35_ = Class275.method4890(i - i_33_, (-612590951 * Class532_Sub3.anInt7071), (-1345107225 * Class532_Sub3.anInt7069), -277030614);
						if (i_30_ <= Class532_Sub3.anInt7068 * -348932735) {
							int[] is = Class532_Sub3.anIntArrayArray7072[i_30_];
							Class232.method3922(is, i_32_, i_35_, i_5_, (byte) -20);
							Class232.method3922(is, i_35_, i_34_, i_4_, (byte) 51);
							Class232.method3922(is, i_34_, i_31_, i_5_, (byte) -7);
						}
						if (i_29_ >= 324226563 * Class532_Sub3.anInt7070) {
							int[] is = Class532_Sub3.anIntArrayArray7072[i_29_];
							Class232.method3922(is, i_32_, i_35_, i_5_, (byte) 32);
							Class232.method3922(is, i_35_, i_34_, i_4_, (byte) -49);
							Class232.method3922(is, i_34_, i_31_, i_5_, (byte) -4);
						}
					} else {
						if (i_30_ <= -348932735 * Class532_Sub3.anInt7068)
							Class232.method3922((Class532_Sub3.anIntArrayArray7072[i_30_]), i_32_, i_31_, i_5_, (byte) 63);
						if (i_29_ >= 324226563 * Class532_Sub3.anInt7070)
							Class232.method3922((Class532_Sub3.anIntArrayArray7072[i_29_]), i_32_, i_31_, i_5_, (byte) 67);
					}
				}
			}
		}
	}
}
