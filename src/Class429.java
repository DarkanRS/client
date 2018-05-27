/* Class429 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class429 {
	static final int anInt5127 = 32768;
	Index aClass317_5128;
	Index aClass317_5129;
	public int anInt5130 = 0;
	SoftCache aClass229_5131;
	static final int anInt5132 = 1;
	public int anInt5133 = 0;
	Interface19 anInterface19_5134;

	String method7211(Class243 class243, int[] is, long l) {
		if (((Class429) this).anInterface19_5134 != null) {
			String string = ((Class429) this).anInterface19_5134.method135(class243, is, l);
			if (null != string)
				return string;
		}
		return Long.toString(l);
	}

	public Class429(Language class495, Index class317, Index class317_0_, Interface19 interface19) {
		((Class429) this).aClass229_5131 = new SoftCache(64);
		((Class429) this).anInterface19_5134 = null;
		((Class429) this).aClass317_5129 = class317;
		((Class429) this).aClass317_5128 = class317_0_;
		((Class429) this).anInterface19_5134 = interface19;
		if (((Class429) this).aClass317_5129 != null)
			anInt5130 = (((Class429) this).aClass317_5129.filesCount(1, -1204926435) * 867652259);
		if (((Class429) this).aClass317_5128 != null)
			anInt5133 = (((Class429) this).aClass317_5128.filesCount(1, 1956053164) * 767103791);
	}

	String method7212(Class243 class243, int[] is, long l) {
		if (((Class429) this).anInterface19_5134 != null) {
			String string = ((Class429) this).anInterface19_5134.method135(class243, is, l);
			if (null != string)
				return string;
		}
		return Long.toString(l);
	}

	String method7213(Class243 class243, int[] is, long l) {
		if (((Class429) this).anInterface19_5134 != null) {
			String string = ((Class429) this).anInterface19_5134.method135(class243, is, l);
			if (null != string)
				return string;
		}
		return Long.toString(l);
	}

	public Class282_Sub50_Sub9 method7214(int i, int i_1_) {
		Class282_Sub50_Sub9 class282_sub50_sub9 = ((Class282_Sub50_Sub9) ((Class429) this).aClass229_5131.get((long) i));
		if (null != class282_sub50_sub9)
			return class282_sub50_sub9;
		byte[] is;
		if (i >= 32768)
			is = ((Class429) this).aClass317_5128.getFile(1, i & 0x7fff, -2004185096);
		else
			is = ((Class429) this).aClass317_5129.getFile(1, i, -1853926128);
		class282_sub50_sub9 = new Class282_Sub50_Sub9();
		((Class282_Sub50_Sub9) class282_sub50_sub9).aClass429_9623 = this;
		if (null != is)
			class282_sub50_sub9.method14913(new RsByteBuffer(is), -421624337);
		if (i >= 32768)
			class282_sub50_sub9.method14912(923886463);
		((Class429) this).aClass229_5131.put(class282_sub50_sub9, (long) i);
		return class282_sub50_sub9;
	}

	static final void method7215(byte i) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub27_8209.method12952((byte) 89) == 2) {
			byte[][][] is = IndexLoaders.MAP_REGION_DECODER.method4532(1227540505);
			byte i_2_ = (byte) (client.anInt7286 * 48374445 - 4 & 0xff);
			int i_3_ = (client.anInt7286 * 48374445 % IndexLoaders.MAP_REGION_DECODER.method4424(575613336));
			for (int i_4_ = 0; i_4_ < 4; i_4_++) {
				for (int i_5_ = 0; i_5_ < IndexLoaders.MAP_REGION_DECODER.method4451(-694905456); i_5_++)
					is[i_4_][i_3_][i_5_] = i_2_;
			}
			if (3 != Class4.anInt35 * 675588453) {
				for (int i_6_ = 0; i_6_ < 2; i_6_++) {
					client.anIntArray7198[i_6_] = -1000000;
					client.anIntArray7303[i_6_] = 1000000;
					client.anIntArray7194[i_6_] = 0;
					client.anIntArray7306[i_6_] = 1000000;
					client.anIntArray7305[i_6_] = 0;
				}
				Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
				int i_7_ = (int) class385.aFloat4671;
				int i_8_ = (int) class385.aFloat4673;
				Class311 class311 = IndexLoaders.MAP_REGION_DECODER.method4433(33386298);
				Class206 class206 = IndexLoaders.MAP_REGION_DECODER.method4430(-1591290583);
				if (-672443707 * Class262.anInt3240 == 2 || Class508.anInt5864 * 1927687797 != -1) {
					if (Class262.anInt3240 * -672443707 != 2) {
						i_7_ = 1927687797 * Class508.anInt5864;
						i_8_ = -902280531 * Class86.anInt833;
					}
					if (0 != ((class311.aByteArrayArrayArray3638[675588453 * Class4.anInt35][i_7_ >> 9][i_8_ >> 9]) & 0x4))
						JS5Manager.method5492((class206.aClass293ArrayArrayArray2604), 0, i_7_ >> 9, i_8_ >> 9, false, (byte) 46);
					else if (Class293.anInt3512 * 726126721 < 2560) {
						int i_9_ = -360258135 * Class31.anInt361 >> 9;
						int i_10_ = Class246.anInt3029 * 413271601 >> 9;
						int i_11_ = i_7_ >> 9;
						int i_12_ = i_8_ >> 9;
						int i_13_;
						if (i_11_ > i_9_)
							i_13_ = i_11_ - i_9_;
						else
							i_13_ = i_9_ - i_11_;
						int i_14_;
						if (i_12_ > i_10_)
							i_14_ = i_12_ - i_10_;
						else
							i_14_ = i_10_ - i_12_;
						if (0 == i_13_ && 0 == i_14_ || i_13_ <= -IndexLoaders.MAP_REGION_DECODER.method4424(-1429776362) || i_13_ >= IndexLoaders.MAP_REGION_DECODER.method4424(-898722517) || i_14_ <= -IndexLoaders.MAP_REGION_DECODER.method4451(-1279637264) || i_14_ >= IndexLoaders.MAP_REGION_DECODER.method4451(-1629693049)) {
							Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1940390478);
							Class151.method2594(new StringBuilder().append(i_9_).append(Class2.aString14).append(i_10_).append(" ").append(i_11_).append(Class2.aString14).append(i_12_).append(" ").append(class219.anInt2711 * 1948093437).append(Class2.aString14).append(class219.anInt2712 * -1002240017).toString(), new RuntimeException(), (byte) -63);
						} else {
							while_137_: do {
								if (i_13_ > i_14_) {
									int i_15_ = i_14_ * 65536 / i_13_;
									int i_16_ = 32768;
									while_136_: do {
										for (;;) {
											if (i_9_ == i_11_)
												break while_136_;
											if (i_9_ < i_11_)
												i_9_++;
											else if (i_9_ > i_11_)
												i_9_--;
											if (0 != ((class311.aByteArrayArrayArray3638[(Class4.anInt35 * 675588453)][i_9_][i_10_]) & 0x4)) {
												JS5Manager.method5492((class206.aClass293ArrayArrayArray2604), 1, i_9_, i_10_, false, (byte) -61);
												break while_136_;
											}
											i_16_ += i_15_;
											if (i_16_ >= 65536) {
												i_16_ -= 65536;
												if (i_10_ < i_12_)
													i_10_++;
												else if (i_10_ > i_12_)
													i_10_--;
												if (((class311.aByteArrayArrayArray3638[(675588453 * Class4.anInt35)][i_9_][i_10_]) & 0x4) != 0)
													break;
											}
										}
										JS5Manager.method5492((class206.aClass293ArrayArrayArray2604), 1, i_9_, i_10_, false, (byte) 49);
									} while (false);
								} else {
									int i_17_ = 65536 * i_13_ / i_14_;
									int i_18_ = 32768;
									for (;;) {
										if (i_12_ == i_10_)
											break while_137_;
										if (i_10_ < i_12_)
											i_10_++;
										else if (i_10_ > i_12_)
											i_10_--;
										if (0 != ((class311.aByteArrayArrayArray3638[Class4.anInt35 * 675588453][i_9_][i_10_]) & 0x4)) {
											JS5Manager.method5492((class206.aClass293ArrayArrayArray2604), 1, i_9_, i_10_, false, (byte) -10);
											break while_137_;
										}
										i_18_ += i_17_;
										if (i_18_ >= 65536) {
											i_18_ -= 65536;
											if (i_9_ < i_11_)
												i_9_++;
											else if (i_9_ > i_11_)
												i_9_--;
											if (((class311.aByteArrayArrayArray3638[675588453 * Class4.anInt35][i_9_][i_10_]) & 0x4) != 0)
												break;
										}
									}
									JS5Manager.method5492(class206.aClass293ArrayArrayArray2604, 1, i_9_, i_10_, false, (byte) 56);
								}
							} while (false);
						}
					}
				} else {
					int i_19_ = Class504.method8389(Class31.anInt361 * -360258135, Class246.anInt3029 * 413271601, 675588453 * Class4.anInt35, (byte) 111);
					if (i_19_ - 1929945579 * Class109_Sub1.anInt9384 < 3200 && ((class311.aByteArrayArrayArray3638[675588453 * Class4.anInt35][-360258135 * Class31.anInt361 >> 9][Class246.anInt3029 * 413271601 >> 9]) & 0x4) != 0)
						JS5Manager.method5492((class206.aClass293ArrayArrayArray2604), 1, Class31.anInt361 * -360258135 >> 9, (Class246.anInt3029 * 413271601 >> 9), false, (byte) -37);
				}
			}
		}
	}
}
