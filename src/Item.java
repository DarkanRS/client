/* Class282_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Item extends Node {
	int amount;
	int id;
	int outlineSize;
	int anInt7819;
	int shadowColor;
	boolean hasPlayerAppearance;

	Item(int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
		((Item) this).id = i * 1372077649;
		((Item) this).amount = -446235323 * i_0_;
		((Item) this).outlineSize = -813139483 * i_1_;
		((Item) this).shadowColor = -547508263 * i_2_;
		((Item) this).anInt7819 = -545500941 * i_3_;
		((Item) this).hasPlayerAppearance = bool;
	}

	static void method12574(GraphicalRenderer class505, IComponentDefinitions class118, int i, int i_4_, int i_5_) {
		Class119 class119 = class118.method2046(class505, 1273435241);
		if (class119 != null) {
			Class455 class455 = class119.aClass455_1456;
			class505.r(i, i_4_, i + class118.anInt1301 * 1506818197, class118.anInt1429 * -492594917 + i_4_);
			if ((1506818197 * class118.anInt1301 != -1125753931 * class119.anInt1458) || (-492594917 * class118.anInt1429 != 2069222845 * class119.anInt1454))
				throw new IllegalStateException("");
			if (2 != -1221526793 * Class187.anInt2363 && Class187.anInt2363 * -1221526793 != 5 && Class419.aClass160_5004 != null) {
				CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1681892219);
				int i_6_;
				int i_7_;
				int i_8_;
				int i_9_;
				if (-672443707 * NativeLibraryLoader.anInt3240 == 4) {
					i_6_ = client.anInt7262 * 61805441;
					i_7_ = client.anInt7376 * -1032332761;
					i_8_ = (int) -client.aFloat7365 & 0x3fff;
					i_9_ = 4096;
				} else {
					Vector3 class385 = (Class84.myPlayer.method11166().aClass385_3595);
					i_6_ = (int) class385.x;
					i_7_ = (int) class385.z;
					i_8_ = ((int) -client.aFloat7365 + -1790074477 * client.anInt7255) & 0x3fff;
					i_9_ = 4096 - 234318736 * client.anInt7203;
				}
				int i_10_ = 48 + i_6_ / 128;
				int i_11_ = (48 + IndexLoaders.MAP_REGION_DECODER.method4451(-1005893088) * 4 - i_7_ / 128);
				Class419.aClass160_5004.method2762(((float) i + (float) (class118.anInt1301 * 1506818197) / 2.0F), ((float) i_4_ + (float) (-492594917 * class118.anInt1429) / 2.0F), (float) i_10_, (float) i_11_, i_9_, i_8_ << 2, class455, i, i_4_);
				Class283 class283 = IndexLoaders.MAP_REGION_DECODER.method4528((byte) 38);
				for (Class282_Sub38 class282_sub38 = ((Class282_Sub38) Class187.aClass482_2350.head((byte) 120)); null != class282_sub38; class282_sub38 = ((Class282_Sub38) Class187.aClass482_2350.next(1158642483))) {
					int i_12_ = class282_sub38.anInt8002 * -570797415;
					int i_13_ = ((class283.anIntArray3381[i_12_] >> 14 & 0x3fff) - class219.x * 1948093437);
					int i_14_ = ((class283.anIntArray3381[i_12_] & 0x3fff) - class219.y * -1002240017);
					int i_15_ = 4 * i_13_ + 2 - i_6_ / 128;
					int i_16_ = 2 + i_14_ * 4 - i_7_ / 128;
					Class158.method2731(class505, class455, class118, i, i_4_, i_15_, i_16_, class283.anIntArray3383[i_12_], 1376881925);
				}
				for (int i_17_ = 0; i_17_ < Class187.anInt2353 * 1036045197; i_17_++) {
					int i_18_ = 4 * Class187.anIntArray2354[i_17_] + 2 - i_6_ / 128;
					int i_19_ = Class187.anIntArray2355[i_17_] * 4 + 2 - i_7_ / 128;
					ObjectDefinitions class478 = (IndexLoaders.MAP_REGION_DECODER.method4436(-1953311803).getObjectDefinitions(Class187.anIntArray2357[i_17_], 65280));
					if (null != class478.anIntArray5650) {
						class478 = class478.method8013(Class158_Sub1.aClass3_8507, (byte) -58);
						if (class478 == null || -1796959211 * class478.anInt5669 == -1)
							continue;
					}
					Class158.method2731(class505, class455, class118, i, i_4_, i_18_, i_19_, -1796959211 * class478.anInt5669, 2923328);
				}
				for (Class282_Sub29 class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7750(-456921914)); class282_sub29 != null; class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7751((byte) 97))) {
					int i_20_ = (int) ((class282_sub29.data * -3442165056282524525L) >> 28 & 0x3L);
					if (335283739 * Class187.anInt2351 == i_20_) {
						int i_21_ = ((int) ((-3442165056282524525L * class282_sub29.data) & 0x3fffL) - class219.x * 1948093437);
						int i_22_ = ((int) ((class282_sub29.data * -3442165056282524525L) >> 14 & 0x3fffL) - class219.y * -1002240017);
						int i_23_ = 4 * i_21_ + 2 - i_6_ / 128;
						int i_24_ = 2 + 4 * i_22_ - i_7_ / 128;
						Class190.method3149(class118, class455, i, i_4_, i_23_, i_24_, Class250.aClass160Array3092[0], 1358567832);
					}
				}
				Class469.method7805(class505, i_6_, i_7_, class118, class455, i, i_4_, 2063184307);
				Class82.method1457(i_6_, i_7_, class118, class455, i, i_4_, 1942118537);
				Class190.method3151(i_6_, i_7_, class118, class119, i, i_4_, 848202629);
				if (NativeLibraryLoader.anInt3240 * -672443707 != 4) {
					if (895508675 * Class187.anInt2361 != 0) {
						int i_25_ = (-712932596 * Class187.anInt2361 + 2 - i_6_ / 128 + (Class84.myPlayer.method15805(828768449) - 1) * 2);
						int i_26_ = (2 + 20612540 * Class187.anInt2359 - i_7_ / 128 + (Class84.myPlayer.method15805(828768449) - 1) * 2);
						Class190.method3149(class118, class455, i, i_4_, i_25_, i_26_, (Class16.aClass160Array145[Class187.aBool2360 ? 1 : 0]), 1471010271);
					}
					if (!Class84.myPlayer.hidden)
						class505.method8425(i + 1506818197 * class118.anInt1301 / 2 - 1, i_4_ + -492594917 * class118.anInt1429 / 2 - 1, 3, 3, -1, (byte) -117);
				}
			} else
				class505.DA(-16777216, class455, i, i_4_);
		}
	}

	public static void method12575(int i, byte i_27_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.method4778(10, (long) i);
		class282_sub50_sub12.method14965((byte) 34);
	}
}
