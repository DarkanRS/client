/* Class298_Sub32_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub32_Sub2 extends Class298_Sub32 {
	Class98[] aClass98Array9321;
	static boolean aBoolean9322 = true;

	final void method3143(int[][] is, byte i) {
		try {
			int i_0_ = Class250.anInt2755 * -1474554145;
			int i_1_ = 461985445 * Class250.anInt2756;
			Class382.method4685(is, (byte) 1);
			Class463.method6009(0, 0, Class250.anInt2753 * -901777799, Class250.anInt2758 * -289063255, -252258015);
			if (null != ((Class298_Sub32_Sub2) this).aClass98Array9321) {
				for (int i_2_ = 0; (i_2_ < ((Class298_Sub32_Sub2) this).aClass98Array9321.length); i_2_++) {
					Class98 class98 = ((Class298_Sub32_Sub2) this).aClass98Array9321[i_2_];
					int i_3_ = ((Class98) class98).anInt948 * 699194661;
					int i_4_ = 1785836763 * ((Class98) class98).anInt947;
					if (i_3_ >= 0) {
						if (i_4_ >= 0)
							class98.method1048(i_0_, i_1_, (byte) 1);
						else
							class98.method1047(i_0_, i_1_, (byte) 1);
					} else if (i_4_ >= 0)
						class98.method1054(i_0_, i_1_, (byte) 88);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agd.ac(").append(')').toString());
		}
	}

	int[] method3131(int i, int i_5_) {
		try {
			int[] is = aClass257_7384.method2448(i, 22480626);
			if (aClass257_7384.aBoolean2810)
				method3143(aClass257_7384.method2449(-45371310), (byte) 24);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agd.i(").append(')').toString());
		}
	}

	int[][] method3132(int i, byte i_6_) {
		try {
			int[][] is = aClass239_7380.method2205(i, (byte) 90);
			if (aClass239_7380.aBoolean2607) {
				int i_7_ = -1474554145 * Class250.anInt2755;
				int i_8_ = Class250.anInt2756 * 461985445;
				int[][] is_9_ = new int[i_8_][i_7_];
				int[][][] is_10_ = aClass239_7380.method2204((byte) 53);
				method3143(is_9_, (byte) 121);
				for (int i_11_ = 0; i_11_ < 461985445 * Class250.anInt2756; i_11_++) {
					int[] is_12_ = is_9_[i_11_];
					int[][] is_13_ = is_10_[i_11_];
					int[] is_14_ = is_13_[0];
					int[] is_15_ = is_13_[1];
					int[] is_16_ = is_13_[2];
					for (int i_17_ = 0; i_17_ < Class250.anInt2755 * -1474554145; i_17_++) {
						int i_18_ = is_12_[i_17_];
						is_16_[i_17_] = (i_18_ & 0xff) << 4;
						is_15_[i_17_] = (i_18_ & 0xff00) >> 4;
						is_14_[i_17_] = (i_18_ & 0xff0000) >> 12;
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agd.k(").append(')').toString());
		}
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_19_) {
		try {
			if (0 == i) {
				((Class298_Sub32_Sub2) this).aClass98Array9321 = new Class98[class298_sub53.readUnsignedByte()];
				for (int i_20_ = 0; (i_20_ < ((Class298_Sub32_Sub2) this).aClass98Array9321.length); i_20_++) {
					int i_21_ = class298_sub53.readUnsignedByte();
					switch (i_21_) {
					case 0:
						((Class298_Sub32_Sub2) this).aClass98Array9321[i_20_] = Class298_Sub37.method3405(class298_sub53, -920913322);
						break;
					case 3:
						((Class298_Sub32_Sub2) this).aClass98Array9321[i_20_] = Class7.method313(class298_sub53, 2061944382);
						break;
					case 1:
						((Class298_Sub32_Sub2) this).aClass98Array9321[i_20_] = SubIncommingPacket.method1922(class298_sub53, -1403634291);
						break;
					case 2:
						((Class298_Sub32_Sub2) this).aClass98Array9321[i_20_] = Class68.method783(class298_sub53, 505653408);
						break;
					}
				}
			} else if (i == 1)
				aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agd.r(").append(')').toString());
		}
	}

	int[] method3144(int i) {
		int[] is = aClass257_7384.method2448(i, 294665976);
		if (aClass257_7384.aBoolean2810)
			method3143(aClass257_7384.method2449(-654420077), (byte) 118);
		return is;
	}

	int[] method3145(int i) {
		int[] is = aClass257_7384.method2448(i, 569359385);
		if (aClass257_7384.aBoolean2810)
			method3143(aClass257_7384.method2449(226434011), (byte) 55);
		return is;
	}

	void method3146(int i, RsByteBuffer class298_sub53) {
		if (0 == i) {
			((Class298_Sub32_Sub2) this).aClass98Array9321 = new Class98[class298_sub53.readUnsignedByte()];
			for (int i_22_ = 0; i_22_ < ((Class298_Sub32_Sub2) this).aClass98Array9321.length; i_22_++) {
				int i_23_ = class298_sub53.readUnsignedByte();
				switch (i_23_) {
				case 0:
					((Class298_Sub32_Sub2) this).aClass98Array9321[i_22_] = Class298_Sub37.method3405(class298_sub53, -205247731);
					break;
				case 3:
					((Class298_Sub32_Sub2) this).aClass98Array9321[i_22_] = Class7.method313(class298_sub53, -291977486);
					break;
				case 1:
					((Class298_Sub32_Sub2) this).aClass98Array9321[i_22_] = SubIncommingPacket.method1922(class298_sub53, -1904035175);
					break;
				case 2:
					((Class298_Sub32_Sub2) this).aClass98Array9321[i_22_] = Class68.method783(class298_sub53, 634970133);
					break;
				}
			}
		} else if (i == 1)
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
	}

	public Class298_Sub32_Sub2() {
		super(0, true);
	}

	void method3147(int i, RsByteBuffer class298_sub53) {
		if (0 == i) {
			((Class298_Sub32_Sub2) this).aClass98Array9321 = new Class98[class298_sub53.readUnsignedByte()];
			for (int i_24_ = 0; i_24_ < ((Class298_Sub32_Sub2) this).aClass98Array9321.length; i_24_++) {
				int i_25_ = class298_sub53.readUnsignedByte();
				switch (i_25_) {
				case 0:
					((Class298_Sub32_Sub2) this).aClass98Array9321[i_24_] = Class298_Sub37.method3405(class298_sub53, 492697170);
					break;
				case 3:
					((Class298_Sub32_Sub2) this).aClass98Array9321[i_24_] = Class7.method313(class298_sub53, -646790238);
					break;
				case 1:
					((Class298_Sub32_Sub2) this).aClass98Array9321[i_24_] = SubIncommingPacket.method1922(class298_sub53, 388197853);
					break;
				case 2:
					((Class298_Sub32_Sub2) this).aClass98Array9321[i_24_] = Class68.method783(class298_sub53, 892412290);
					break;
				}
			}
		} else if (i == 1)
			aBoolean7382 = class298_sub53.readUnsignedByte() == 1;
	}

	int[][] method3148(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 78);
		if (aClass239_7380.aBoolean2607) {
			int i_26_ = -1474554145 * Class250.anInt2755;
			int i_27_ = Class250.anInt2756 * 461985445;
			int[][] is_28_ = new int[i_27_][i_26_];
			int[][][] is_29_ = aClass239_7380.method2204((byte) 97);
			method3143(is_28_, (byte) 120);
			for (int i_30_ = 0; i_30_ < 461985445 * Class250.anInt2756; i_30_++) {
				int[] is_31_ = is_28_[i_30_];
				int[][] is_32_ = is_29_[i_30_];
				int[] is_33_ = is_32_[0];
				int[] is_34_ = is_32_[1];
				int[] is_35_ = is_32_[2];
				for (int i_36_ = 0; i_36_ < Class250.anInt2755 * -1474554145; i_36_++) {
					int i_37_ = is_31_[i_36_];
					is_35_[i_36_] = (i_37_ & 0xff) << 4;
					is_34_[i_36_] = (i_37_ & 0xff00) >> 4;
					is_33_[i_36_] = (i_37_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}

	int[][] method3149(int i) {
		int[][] is = aClass239_7380.method2205(i, (byte) 34);
		if (aClass239_7380.aBoolean2607) {
			int i_38_ = -1474554145 * Class250.anInt2755;
			int i_39_ = Class250.anInt2756 * 461985445;
			int[][] is_40_ = new int[i_39_][i_38_];
			int[][][] is_41_ = aClass239_7380.method2204((byte) 114);
			method3143(is_40_, (byte) 39);
			for (int i_42_ = 0; i_42_ < 461985445 * Class250.anInt2756; i_42_++) {
				int[] is_43_ = is_40_[i_42_];
				int[][] is_44_ = is_41_[i_42_];
				int[] is_45_ = is_44_[0];
				int[] is_46_ = is_44_[1];
				int[] is_47_ = is_44_[2];
				for (int i_48_ = 0; i_48_ < Class250.anInt2755 * -1474554145; i_48_++) {
					int i_49_ = is_43_[i_48_];
					is_47_[i_48_] = (i_49_ & 0xff) << 4;
					is_46_[i_48_] = (i_49_ & 0xff00) >> 4;
					is_45_[i_48_] = (i_49_ & 0xff0000) >> 12;
				}
			}
		}
		return is;
	}

	static final void method3150(ClientScript2 class403, int i) {
		try {
			int i_50_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_50_, (byte) -15);
			Class119 class119 = Class389.aClass119Array4165[i_50_ >> 16];
			Class301_Sub1.method3712(class105, class119, class403, (byte) 31);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agd.de(").append(')').toString());
		}
	}
}
