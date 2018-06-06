
/* Class515 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

public class Class515 {
	Index aClass317_5888;
	Index aClass317_5889;
	SoftCache aClass229_5890;
	SoftCache aClass229_5891 = new SoftCache(64);
	int anInt5892;
	static Font aFont5893;

	public Class515(Game class486, Language class495, Index class317, Index class317_0_) {
		((Class515) this).aClass229_5890 = new SoftCache(60);
		((Class515) this).aClass317_5888 = class317;
		((Class515) this).aClass317_5889 = class317_0_;
		int i = ((Class515) this).aClass317_5888.containersCount(-1503644160) - 1;
		SharedConfigsType.aClass120_1476.filesPerContainer(-397238873);
		((Class515) this).aClass317_5888.filesCount(i, -1544265999);
	}

	public Class525 method8845(int i, byte i_1_) {
		Class525 class525;
		synchronized (((Class515) this).aClass229_5891) {
			class525 = ((Class525) ((Class515) this).aClass229_5891.get((long) i));
		}
		if (null != class525)
			return class525;
		byte[] is;
		synchronized (((Class515) this).aClass317_5888) {
			is = (((Class515) this).aClass317_5888.getFile(SharedConfigsType.aClass120_1476.containerId(i, 1680181373), SharedConfigsType.aClass120_1476.fileId(i, -1956342306), -2016707377));
		}
		class525 = new Class525();
		((Class525) class525).aClass515_6973 = this;
		((Class525) class525).anInt6969 = -195085151 * i;
		if (null != is)
			class525.method11226(new RsByteBuffer(is), 91916290);
		synchronized (((Class515) this).aClass229_5891) {
			((Class515) this).aClass229_5891.put(class525, (long) i);
		}
		return class525;
	}

	public void method8846(int i, byte i_2_) {
		((Class515) this).anInt5892 = 2093543805 * i;
		synchronized (((Class515) this).aClass229_5890) {
			((Class515) this).aClass229_5890.method3859(1433473768);
		}
	}

	public void method8847(int i, int i_3_) {
		synchronized (((Class515) this).aClass229_5891) {
			((Class515) this).aClass229_5891.method3858(i, (byte) 28);
		}
		synchronized (((Class515) this).aClass229_5890) {
			((Class515) this).aClass229_5890.method3858(i, (byte) 23);
		}
	}

	public void method8848(int i) {
		synchronized (((Class515) this).aClass229_5891) {
			((Class515) this).aClass229_5891.method3859(128096981);
		}
		synchronized (((Class515) this).aClass229_5890) {
			((Class515) this).aClass229_5890.method3859(-1366287850);
		}
	}

	public void method8849(short i) {
		synchronized (((Class515) this).aClass229_5891) {
			((Class515) this).aClass229_5891.method3863(1832676736);
		}
		synchronized (((Class515) this).aClass229_5890) {
			((Class515) this).aClass229_5890.method3863(1443039032);
		}
	}

	public Class525 method8850(int i) {
		Class525 class525;
		synchronized (((Class515) this).aClass229_5891) {
			class525 = ((Class525) ((Class515) this).aClass229_5891.get((long) i));
		}
		if (null != class525)
			return class525;
		byte[] is;
		synchronized (((Class515) this).aClass317_5888) {
			is = (((Class515) this).aClass317_5888.getFile(SharedConfigsType.aClass120_1476.containerId(i, 1920394682), SharedConfigsType.aClass120_1476.fileId(i, -1985592077), -1473089875));
		}
		class525 = new Class525();
		((Class525) class525).aClass515_6973 = this;
		((Class525) class525).anInt6969 = -195085151 * i;
		if (null != is)
			class525.method11226(new RsByteBuffer(is), 1412893995);
		synchronized (((Class515) this).aClass229_5891) {
			((Class515) this).aClass229_5891.put(class525, (long) i);
		}
		return class525;
	}

	public Class525 method8851(int i) {
		Class525 class525;
		synchronized (((Class515) this).aClass229_5891) {
			class525 = ((Class525) ((Class515) this).aClass229_5891.get((long) i));
		}
		if (null != class525)
			return class525;
		byte[] is;
		synchronized (((Class515) this).aClass317_5888) {
			is = (((Class515) this).aClass317_5888.getFile(SharedConfigsType.aClass120_1476.containerId(i, 812185949), SharedConfigsType.aClass120_1476.fileId(i, -1835326623), -1380117977));
		}
		class525 = new Class525();
		((Class525) class525).aClass515_6973 = this;
		((Class525) class525).anInt6969 = -195085151 * i;
		if (null != is)
			class525.method11226(new RsByteBuffer(is), 1709092472);
		synchronized (((Class515) this).aClass229_5891) {
			((Class515) this).aClass229_5891.put(class525, (long) i);
		}
		return class525;
	}

	public Class525 method8852(int i) {
		Class525 class525;
		synchronized (((Class515) this).aClass229_5891) {
			class525 = ((Class525) ((Class515) this).aClass229_5891.get((long) i));
		}
		if (null != class525)
			return class525;
		byte[] is;
		synchronized (((Class515) this).aClass317_5888) {
			is = (((Class515) this).aClass317_5888.getFile(SharedConfigsType.aClass120_1476.containerId(i, 261335376), SharedConfigsType.aClass120_1476.fileId(i, -2058400457), -1305945625));
		}
		class525 = new Class525();
		((Class525) class525).aClass515_6973 = this;
		((Class525) class525).anInt6969 = -195085151 * i;
		if (null != is)
			class525.method11226(new RsByteBuffer(is), 1391740058);
		synchronized (((Class515) this).aClass229_5891) {
			((Class515) this).aClass229_5891.put(class525, (long) i);
		}
		return class525;
	}

	public void method8853(int i) {
		((Class515) this).anInt5892 = 2093543805 * i;
		synchronized (((Class515) this).aClass229_5890) {
			((Class515) this).aClass229_5890.method3859(-1186397462);
		}
	}

	public void method8854(int i) {
		((Class515) this).anInt5892 = 2093543805 * i;
		synchronized (((Class515) this).aClass229_5890) {
			((Class515) this).aClass229_5890.method3859(-1131986209);
		}
	}

	public void method8855(int i) {
		((Class515) this).anInt5892 = 2093543805 * i;
		synchronized (((Class515) this).aClass229_5890) {
			((Class515) this).aClass229_5890.method3859(2027607840);
		}
	}

	public void method8856() {
		synchronized (((Class515) this).aClass229_5891) {
			((Class515) this).aClass229_5891.method3863(1647371679);
		}
		synchronized (((Class515) this).aClass229_5890) {
			((Class515) this).aClass229_5890.method3863(1334510758);
		}
	}

	public void method8857() {
		synchronized (((Class515) this).aClass229_5891) {
			((Class515) this).aClass229_5891.method3863(1716987398);
		}
		synchronized (((Class515) this).aClass229_5890) {
			((Class515) this).aClass229_5890.method3863(884024890);
		}
	}

	public static NativeSprite method8858(GraphicalRenderer class505, int i, int i_4_) {
		Class282_Sub37 class282_sub37 = (Class282_Sub37) Class492.aClass465_5774.method7754((long) i);
		if (null != class282_sub37) {
			Class282_Sub41_Sub3 class282_sub41_sub3 = ((Class282_Sub37) class282_sub37).aClass278_Sub1_8001.method4918(1179079332);
			((Class282_Sub37) class282_sub37).aBool7996 = true;
			if (null != class282_sub41_sub3) {
				((Class502) Class492.aClass502_5776).aClass505_5829 = class505;
				return ((NativeSprite) class282_sub41_sub3.method14795((Class492.aClass502_5776), -1234291023));
			}
		}
		return null;
	}

	static final void method8859(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (class527.aBool7022) {
			if (i == 1)
				return;
			class513 = class527.aClass513_6994;
		} else
			class513 = class527.aClass513_7007;
		UnderlayDefinition class513_5_ = class513;
		IComponentDefinitions class118 = ((UnderlayDefinition) class513_5_).aClass118_5886;
		Class235.method3965(class118, class527, -757819357);
	}

	public static final void method8860(byte i) {
		if (-1384937123 * client.anInt7277 != -1 && -1 != -74015201 * client.anInt7448) {
			int i_6_ = (-768126693 * client.anInt7327 + (((1448302961 * client.anInt7182 - -768126693 * client.anInt7327) * (client.anInt7256 * -1409864719)) >> 16));
			client.anInt7256 += 1413506321 * i_6_;
			if (client.anInt7256 * -1409864719 >= 65535) {
				client.anInt7256 = 282106607;
				if (!client.aBool7285)
					client.aBool7355 = true;
				else
					client.aBool7355 = false;
				client.aBool7285 = true;
			} else {
				client.aBool7355 = false;
				client.aBool7285 = false;
			}
			float f = (float) (-1409864719 * client.anInt7256) / 65535.0F;
			float[] fs = new float[3];
			int i_7_ = client.anInt7279 * 2021580430;
			for (int i_8_ = 0; i_8_ < 3; i_8_++) {
				int i_9_ = 3 * (client.anIntArrayArrayArray7302[client.anInt7277 * -1384937123][i_7_][i_8_]);
				int i_10_ = 3 * (client.anIntArrayArrayArray7302[client.anInt7277 * -1384937123][1 + i_7_][i_8_]);
				int i_11_ = (((client.anIntArrayArrayArray7302[client.anInt7277 * -1384937123][2 + i_7_][i_8_]) - ((client.anIntArrayArrayArray7302[-1384937123 * client.anInt7277][i_7_ + 3][i_8_]) - (client.anIntArrayArrayArray7302[client.anInt7277 * -1384937123][2 + i_7_][i_8_]))) * 3);
				int i_12_ = (client.anIntArrayArrayArray7302[client.anInt7277 * -1384937123][i_7_][i_8_]);
				int i_13_ = i_10_ - i_9_;
				int i_14_ = i_9_ - 2 * i_10_ + i_11_;
				int i_15_ = i_10_ + ((client.anIntArrayArrayArray7302[client.anInt7277 * -1384937123][i_7_ + 2][i_8_]) - i_12_) - i_11_;
				fs[i_8_] = (float) i_12_ + (((float) i_15_ * f + (float) i_14_) * f + (float) i_13_) * f;
			}
			CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1394522751);
			Class31.anInt361 = ((int) fs[0] - 991427072 * class219.x) * -2043310439;
			Class109_Sub1.anInt9384 = 126779709 * (int) fs[1];
			Class246.anInt3029 = (((int) fs[2] - class219.y * -2045780480) * 1442943697);
			float[] fs_16_ = new float[3];
			int i_17_ = client.anInt7280 * 1277820518;
			for (int i_18_ = 0; i_18_ < 3; i_18_++) {
				int i_19_ = 3 * (client.anIntArrayArrayArray7302[client.anInt7448 * -74015201][i_17_][i_18_]);
				int i_20_ = 3 * (client.anIntArrayArrayArray7302[-74015201 * client.anInt7448][i_17_ + 1][i_18_]);
				int i_21_ = (((client.anIntArrayArrayArray7302[client.anInt7448 * -74015201][2 + i_17_][i_18_]) - ((client.anIntArrayArrayArray7302[client.anInt7448 * -74015201][i_17_ + 3][i_18_]) - (client.anIntArrayArrayArray7302[-74015201 * client.anInt7448][i_17_ + 2][i_18_]))) * 3);
				int i_22_ = (client.anIntArrayArrayArray7302[-74015201 * client.anInt7448][i_17_][i_18_]);
				int i_23_ = i_20_ - i_19_;
				int i_24_ = i_19_ - 2 * i_20_ + i_21_;
				int i_25_ = ((client.anIntArrayArrayArray7302[client.anInt7448 * -74015201][2 + i_17_][i_18_]) - i_22_ + i_20_ - i_21_);
				fs_16_[i_18_] = f * (((float) i_24_ + f * (float) i_25_) * f + (float) i_23_) + (float) i_22_;
			}
			float f_26_ = fs_16_[0] - fs[0];
			float f_27_ = -1.0F * (fs_16_[1] - fs[1]);
			float f_28_ = fs_16_[2] - fs[2];
			double d = Math.sqrt((double) (f_28_ * f_28_ + f_26_ * f_26_));
			Class293.anInt3512 = ((int) (Math.atan2((double) f_27_, d) * 2607.5945876176133) & 0x3fff) * -647467135;
			AnimationDefinitions.anInt5930 = ((int) (-Math.atan2((double) f_26_, (double) f_28_) * 2607.5945876176133) & 0x3fff) * 1898253385;
			Class121.anInt1525 = (((-1409864719 * client.anInt7256 * ((client.anIntArrayArrayArray7302[client.anInt7277 * -1384937123][i_7_ + 2][3]) - (client.anIntArrayArrayArray7302[-1384937123 * client.anInt7277][i_7_][3]))) >> 16) + (client.anIntArrayArrayArray7302[client.anInt7277 * -1384937123][i_7_][3])) * -833027875;
		}
	}

	public static int method8861(int i, int i_29_, boolean bool, int i_30_) {
		Class282_Sub30 class282_sub30 = CS2Runner.method11127(i, bool, 1815831231);
		if (null == class282_sub30)
			return -1;
		if (i_29_ < 0 || i_29_ >= (((Class282_Sub30) class282_sub30).anIntArray7710).length)
			return -1;
		return ((Class282_Sub30) class282_sub30).anIntArray7710[i_29_];
	}

	public static void method8862(int i, int i_31_, int i_32_, boolean bool, int i_33_) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(1767720477) != 0) {
			Class291_Sub1.anInt8021 = Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-124335836) * 923733999;
			Class538.method11500(0, true, (byte) 24);
		} else
			Class122.method2111(false, 662490589);
		Class291_Sub1.anInt8019 = 776800459 * i_31_;
		Class291_Sub1.anInt8020 = i_32_ * 611890095;
		Class291_Sub1.aBool8028 = bool;
		Class291_Sub1.method5128(i);
	}

	static final void method8863(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1299 * 597157617;
	}
}
