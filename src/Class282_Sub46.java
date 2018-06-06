/* Class282_Sub46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub46 extends Node {
	public short aShort8067;

	public Class282_Sub46(short i) {
		aShort8067 = i;
	}

	static void method13407(GraphicalRenderer renderer, Interface22 interface22, int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		if (-8084891 * Class291_Sub1.anInt8015 < 100)
			Class435.method7302(renderer, interface22, (byte) 37);
		renderer.r(i, i_0_, i_1_ + i, i_2_ + i_0_);
		if (-8084891 * Class291_Sub1.anInt8015 < 100) {
			int i_4_ = 20;
			int i_5_ = i + i_1_ / 2;
			int i_6_ = i_0_ + i_2_ / 2 - 18 - i_4_;
			renderer.B(i, i_0_, i_1_, i_2_, -16777216, 0);
			renderer.method8430(i_5_ - 152, i_6_, 304, 34, client.aColorArray7199[client.anInt7447 * 1920182969].getRGB(), 0);
			renderer.B(i_5_ - 150, 2 + i_6_, -24254673 * Class291_Sub1.anInt8015, 30, client.aColorArray7186[1920182969 * client.anInt7447].getRGB(), 0);
			Class285.aClass8_3394.method360(Message.LOADING.translate(Class223.CURRENT_LANGUAGE, -895351629), i_5_, i_4_ + i_6_, client.aColorArray7200[1920182969 * client.anInt7447].getRGB(), -1, 768492991);
		} else {
			int i_7_ = (-861975801 * Class427.anInt5123 - (int) ((float) i_1_ / Class291_Sub1.aFloat3468));
			int i_8_ = ((int) ((float) i_2_ / Class291_Sub1.aFloat3468) + Class475.anInt5624 * 483850921);
			int i_9_ = ((int) ((float) i_1_ / Class291_Sub1.aFloat3468) + Class427.anInt5123 * -861975801);
			int i_10_ = (Class475.anInt5624 * 483850921 - (int) ((float) i_2_ / Class291_Sub1.aFloat3468));
			MapRegionLoaderTask.anInt3991 = -848800339 * (-861975801 * Class427.anInt5123 - (int) ((float) i_1_ / Class291_Sub1.aFloat3468));
			Class489.anInt5765 = 1732935055 * (483850921 * Class475.anInt5624 - (int) ((float) i_2_ / Class291_Sub1.aFloat3468));
			Class488.anInt5760 = -791388679 * (int) ((float) (2 * i_1_) / Class291_Sub1.aFloat3468);
			Class351.anInt4097 = ((int) ((float) (2 * i_2_) / Class291_Sub1.aFloat3468) * 429290245);
			Class291_Sub1.method5139(i_7_ + Class291_Sub1.anInt3472, Class291_Sub1.anInt3473 + i_8_, Class291_Sub1.anInt3472 + i_9_, Class291_Sub1.anInt3473 + i_10_, i, i_0_, i + i_1_, 1 + (i_0_ + i_2_));
			Class291_Sub1.renderMap(renderer);
			NodeCollection areas = Class291_Sub1.method5135(renderer);
			Class18.renderInformation(renderer, areas, 0, 0, (byte) 2);
			if (Class361.anInt4185 * 750747217 > 0) {
				Class96_Sub9.anInt9282 -= 759227215;
				if (Class96_Sub9.anInt9282 * 896422831 == 0) {
					Class361.anInt4185 -= -1293776207;
					Class96_Sub9.anInt9282 = -1995324884;
				}
			}
			if (client.aBool7176) {
				int i_11_ = i + i_1_ - 5;
				int i_12_ = i_2_ + i_0_ - 8;
				Class16.aClass8_144.method359(new StringBuilder().append("Fps:").append(Engine.FPS * 457052913).toString(), i_11_, i_12_, 16776960, -1, 1878721557);
				i_12_ -= 15;
				Runtime runtime = Runtime.getRuntime();
				int i_13_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				int i_14_ = 16776960;
				if (i_13_ > 65536)
					i_14_ = 16711680;
				Class16.aClass8_144.method359(new StringBuilder().append("Mem:").append(i_13_).append("k").toString(), i_11_, i_12_, i_14_, -1, 1878721557);
				i_12_ -= 15;
			}
		}
	}

	static final void method13408(CS2Executor class527, byte i) {
		int i_15_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_15_, (byte) 113);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_15_ >> 16];
		Class100.method1642(class118, class98, class527, -441010369);
	}
}
