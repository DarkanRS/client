/* Class391 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class391 {
	public int[] anIntArray4169;
	Class395 aClass395_4170;
	public int anInt4171;
	public int[] anIntArray4172;
	public boolean aBoolean4173;
	public int[] anIntArray4174;
	public int anInt4175 = 490274841;
	public boolean aBoolean4176;
	public boolean[] aBooleanArray4177;
	public int anInt4178 = 1084755117;
	public int anInt4179 = 556718803;
	public int anInt4180 = -1297220983;
	public int anInt4181 = -1164419115;
	public int anInt4182 = 1486793947;
	public int[] anIntArray4183;
	public int anInt4184;
	public boolean aBoolean4185;
	public static boolean aBoolean4186 = false;
	public int[][] anIntArrayArray4187;
	public int[] anIntArray4188;
	public int anInt4189 = 1424483545;
	public int[] anIntArray4190;
	HashTable aClass437_4191;

	public String method4877(int i, String string, int i_0_) {
		try {
			if (((Class391) this).aClass437_4191 == null)
				return string;
			Class298_Sub29 class298_sub29 = ((Class298_Sub29) ((Class391) this).aClass437_4191.get((long) i));
			if (class298_sub29 == null)
				return string;
			return (String) class298_sub29.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.k(").append(')').toString());
		}
	}

	void method4878(RsByteBuffer class298_sub53, int i, int i_1_) {
		try {
			if (1 == i) {
				int i_2_ = class298_sub53.readUnsignedShort();
				anIntArray4169 = new int[i_2_];
				for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
					anIntArray4169[i_3_] = class298_sub53.readUnsignedShort();
				anIntArray4172 = new int[i_2_];
				for (int i_4_ = 0; i_4_ < i_2_; i_4_++)
					anIntArray4172[i_4_] = class298_sub53.readUnsignedShort();
				for (int i_5_ = 0; i_5_ < i_2_; i_5_++)
					anIntArray4172[i_5_] = ((class298_sub53.readUnsignedShort() << 16) + anIntArray4172[i_5_]);
			} else if (2 == i)
				anInt4175 = class298_sub53.readUnsignedShort() * -490274841;
			else if (i == 3) {
				aBooleanArray4177 = new boolean[256];
				int i_6_ = class298_sub53.readUnsignedByte();
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
					aBooleanArray4177[class298_sub53.readUnsignedByte()] = true;
			} else if (5 == i)
				anInt4178 = class298_sub53.readUnsignedByte() * -1501035895;
			else if (6 == i)
				anInt4179 = class298_sub53.readUnsignedShort() * -556718803;
			else if (i == 7)
				anInt4180 = class298_sub53.readUnsignedShort() * 1297220983;
			else if (i == 8)
				anInt4181 = class298_sub53.readUnsignedByte() * 248539239;
			else if (i == 9)
				anInt4182 = class298_sub53.readUnsignedByte() * -1486793947;
			else if (10 == i)
				anInt4189 = class298_sub53.readUnsignedByte() * -1424483545;
			else if (i == 11)
				anInt4184 = class298_sub53.readUnsignedByte() * 1436650873;
			else if (i == 12) {
				int i_8_ = class298_sub53.readUnsignedByte();
				anIntArray4174 = new int[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
					anIntArray4174[i_9_] = class298_sub53.readUnsignedShort();
				for (int i_10_ = 0; i_10_ < i_8_; i_10_++)
					anIntArray4174[i_10_] = ((class298_sub53.readUnsignedShort() << 16) + anIntArray4174[i_10_]);
			} else if (13 == i) {
				int i_11_ = class298_sub53.readUnsignedShort();
				anIntArrayArray4187 = new int[i_11_][];
				for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
					int i_13_ = class298_sub53.readUnsignedByte();
					if (i_13_ > 0) {
						anIntArrayArray4187[i_12_] = new int[i_13_];
						anIntArrayArray4187[i_12_][0] = class298_sub53.read24BitUnsignedInteger((byte) -28);
						for (int i_14_ = 1; i_14_ < i_13_; i_14_++)
							anIntArrayArray4187[i_12_][i_14_] = class298_sub53.readUnsignedShort();
					}
				}
			} else if (14 == i)
				aBoolean4185 = true;
			else if (i == 15)
				aBoolean4176 = true;
			else if (16 == i) {
				if (i_1_ >= 2084286669) {
					/* empty */
				}
			} else if (18 == i)
				aBoolean4173 = true;
			else if (19 == i) {
				if (null == anIntArray4188) {
					anIntArray4188 = new int[anIntArrayArray4187.length];
					for (int i_15_ = 0; i_15_ < anIntArrayArray4187.length; i_15_++)
						anIntArray4188[i_15_] = 255;
				}
				anIntArray4188[class298_sub53.readUnsignedByte()] = class298_sub53.readUnsignedByte();
			} else if (20 == i) {
				if (null == anIntArray4183 || anIntArray4190 == null) {
					anIntArray4183 = new int[anIntArrayArray4187.length];
					anIntArray4190 = new int[anIntArrayArray4187.length];
					for (int i_16_ = 0; i_16_ < anIntArrayArray4187.length; i_16_++) {
						anIntArray4183[i_16_] = 256;
						anIntArray4190[i_16_] = 256;
					}
				}
				int i_17_ = class298_sub53.readUnsignedByte();
				anIntArray4183[i_17_] = class298_sub53.readUnsignedShort();
				anIntArray4190[i_17_] = class298_sub53.readUnsignedShort();
			} else if (i == 249) {
				int i_18_ = class298_sub53.readUnsignedByte();
				if (((Class391) this).aClass437_4191 == null) {
					int i_19_ = Class416.method5590(i_18_, (byte) 16);
					((Class391) this).aClass437_4191 = new HashTable(i_19_);
				}
				for (int i_20_ = 0; i_20_ < i_18_; i_20_++) {
					boolean bool = class298_sub53.readUnsignedByte() == 1;
					int i_21_ = class298_sub53.read24BitUnsignedInteger((byte) -17);
					Linkable class298;
					if (bool)
						class298 = new Class298_Sub29(class298_sub53.readString(102394051));
					else
						class298 = new Class298_Sub35(class298_sub53.readInt((byte) 14));
					((Class391) this).aClass437_4191.method5817(class298, (long) i_21_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.f(").append(')').toString());
		}
	}

	void method4879(byte i) {
		try {
			if (62820525 * anInt4182 == -1) {
				if (aBooleanArray4177 != null)
					anInt4182 = 1321379402;
				else
					anInt4182 = 0;
			}
			if (-1 == -882531177 * anInt4189) {
				if (aBooleanArray4177 != null)
					anInt4189 = 1446000206;
				else
					anInt4189 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.b(").append(')').toString());
		}
	}

	public boolean method4880(int i) {
		try {
			if (null == anIntArray4172)
				return true;
			boolean bool = true;
			int[] is = anIntArray4172;
			for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
				int i_23_ = is[i_22_];
				if (((Class391) this).aClass395_4170.method4900(i_23_ >>> 16, -1720040211) == null)
					bool = false;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.p(").append(')').toString());
		}
	}

	public int method4881(int i, int i_24_, int i_25_) {
		try {
			if (((Class391) this).aClass437_4191 == null)
				return i_24_;
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) ((Class391) this).aClass437_4191.get((long) i));
			if (null == class298_sub35)
				return i_24_;
			return class298_sub35.anInt7394 * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.i(").append(')').toString());
		}
	}

	Class391() {
		anInt4184 = -1421665550;
		aBoolean4185 = false;
		aBoolean4176 = false;
		aBoolean4173 = false;
	}

	void method4882(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_26_ = class298_sub53.readUnsignedByte();
				if (0 == i_26_) {
					if (i >= -360107567)
						throw new IllegalStateException();
					break;
				}
				method4878(class298_sub53, i_26_, -1717065205);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.a(").append(')').toString());
		}
	}

	static final void method4883(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aShort8923;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aShort8931;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.akz(").append(')').toString());
		}
	}

	public static void method4884(int i, int i_27_, int i_28_, int i_29_, ObjectDefinitions class432, NPC class365_sub1_sub1_sub2_sub1, Player class365_sub1_sub1_sub2_sub2, byte i_30_) {
		try {
			Class298_Sub41 class298_sub41 = new Class298_Sub41();
			((Class298_Sub41) class298_sub41).anInt7424 = 2135210127 * i;
			((Class298_Sub41) class298_sub41).anInt7425 = -7217919 * (i_27_ << 9);
			((Class298_Sub41) class298_sub41).anInt7423 = (i_28_ << 9) * 584186023;
			if (class432 != null) {
				((Class298_Sub41) class298_sub41).aClass432_7435 = class432;
				int i_31_ = class432.sizeX * -1125834887;
				int i_32_ = class432.sizeY * -565161399;
				if (i_29_ == 1 || i_29_ == 3) {
					i_31_ = class432.sizeY * -565161399;
					i_32_ = class432.sizeX * -1125834887;
				}
				((Class298_Sub41) class298_sub41).anInt7427 = 305826635 * (i_27_ + i_31_ << 9);
				((Class298_Sub41) class298_sub41).anInt7428 = -1647445571 * (i_28_ + i_32_ << 9);
				((Class298_Sub41) class298_sub41).anInt7443 = 128561991 * class432.anInt5422;
				((Class298_Sub41) class298_sub41).aBoolean7444 = class432.aBoolean5426;
				((Class298_Sub41) class298_sub41).anInt7430 = 1644605369 * (-161350689 * class432.anInt5408 << 9);
				((Class298_Sub41) class298_sub41).anInt7449 = class432.anInt5425 * -1807698503;
				((Class298_Sub41) class298_sub41).anInt7450 = class432.anInt5427 * 763489431;
				((Class298_Sub41) class298_sub41).anInt7422 = class432.anInt5428 * 1972784599;
				((Class298_Sub41) class298_sub41).anIntArray7432 = class432.anIntArray5429;
				((Class298_Sub41) class298_sub41).aBoolean7451 = class432.aBoolean5395;
				((Class298_Sub41) class298_sub41).anInt7452 = -1937096719 * class432.anInt5439;
				((Class298_Sub41) class298_sub41).anInt7441 = 1100795 * class432.anInt5438;
				((Class298_Sub41) class298_sub41).anInt7429 = 406226903 * (-282587873 * class432.anInt5437 << 9);
				if (null != class432.anIntArray5366) {
					((Class298_Sub41) class298_sub41).aBoolean7437 = true;
					class298_sub41.method3519(-2011876770);
				}
				if (null != ((Class298_Sub41) class298_sub41).anIntArray7432)
					((Class298_Sub41) class298_sub41).anInt7454 = (((-15898815 * ((Class298_Sub41) class298_sub41).anInt7450) + (int) (Math.random() * (double) ((-1398300237 * ((Class298_Sub41) class298_sub41).anInt7422) - (-15898815 * (((Class298_Sub41) class298_sub41).anInt7450))))) * 950219665);
				Class298_Sub41.aClass453_7421.method5935(class298_sub41, 2135348486);
			} else if (class365_sub1_sub1_sub2_sub1 != null) {
				((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub1_7433 = class365_sub1_sub1_sub2_sub1;
				SomethingDefinitions class503 = class365_sub1_sub1_sub2_sub1.aClass503_10190;
				if (null != class503.anIntArray6188) {
					((Class298_Sub41) class298_sub41).aBoolean7437 = true;
					class503 = class503.method6240(Class128.aClass148_6331, 1825815932);
				}
				if (class503 != null) {
					((Class298_Sub41) class298_sub41).anInt7427 = 305826635 * (class503.anInt6187 * -2095128707 + i_27_ << 9);
					((Class298_Sub41) class298_sub41).anInt7428 = (-1647445571 * (i_28_ + -2095128707 * class503.anInt6187 << 9));
					((Class298_Sub41) class298_sub41).anInt7443 = Class125.method1398(class365_sub1_sub1_sub2_sub1, 2096811251) * 502744039;
					((Class298_Sub41) class298_sub41).aBoolean7444 = class503.aBoolean6180;
					((Class298_Sub41) class298_sub41).anInt7430 = (class503.anInt6140 * 1525111487 << 9) * 1644605369;
					((Class298_Sub41) class298_sub41).anInt7449 = -1283486135 * class503.anInt6179;
					((Class298_Sub41) class298_sub41).anInt7452 = 1142643823 * class503.anInt6161;
					((Class298_Sub41) class298_sub41).anInt7441 = 1682293055 * class503.anInt6190;
					((Class298_Sub41) class298_sub41).anInt7429 = (-1422618341 * class503.anInt6175 << 9) * 406226903;
				}
				Class298_Sub41.aClass453_7455.method5935(class298_sub41, 387904128);
			} else if (null != class365_sub1_sub1_sub2_sub2) {
				((Class298_Sub41) class298_sub41).aClass365_Sub1_Sub1_Sub2_Sub2_7434 = class365_sub1_sub1_sub2_sub2;
				((Class298_Sub41) class298_sub41).anInt7427 = ((i_27_ + class365_sub1_sub1_sub2_sub2.getSize()) << 9) * 305826635;
				((Class298_Sub41) class298_sub41).anInt7428 = ((i_28_ + class365_sub1_sub1_sub2_sub2.getSize()) << 9) * -1647445571;
				((Class298_Sub41) class298_sub41).anInt7443 = Class375.method4652(class365_sub1_sub1_sub2_sub2, 2035612836) * 502744039;
				((Class298_Sub41) class298_sub41).aBoolean7444 = class365_sub1_sub1_sub2_sub2.transformedNpc;
				((Class298_Sub41) class298_sub41).anInt7430 = (780357347 * class365_sub1_sub1_sub2_sub2.anInt10214 << 9) * 1644605369;
				((Class298_Sub41) class298_sub41).anInt7449 = -1138033583 * class365_sub1_sub1_sub2_sub2.anInt10215;
				((Class298_Sub41) class298_sub41).anInt7452 = -1197363456;
				((Class298_Sub41) class298_sub41).anInt7441 = -900102912;
				((Class298_Sub41) class298_sub41).anInt7429 = 0;
				Class298_Sub41.aClass437_7440.method5817(class298_sub41, (long) (class365_sub1_sub1_sub2_sub2.anInt10064 * 1888274983));
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.p(").append(')').toString());
		}
	}

	static final void method4885(ClientScript2 class403, byte i) {
		try {
			int i_33_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_33_, (byte) 95);
			Class119 class119 = Class389.aClass119Array4165[i_33_ >> 16];
			Class260.method2461(class105, class119, class403, (short) 28140);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.gu(").append(')').toString());
		}
	}

	static Entity method4886(int i, int i_34_, int i_35_, byte i_36_) {
		try {
			Class326 class326 = (client.aClass283_8716.method2675(-1611682495).aClass326ArrayArrayArray3516[i][i_34_][i_35_]);
			if (class326 == null)
				return null;
			Entity class365_sub1_sub1_sub2 = null;
			int i_37_ = -1;
			for (Class322 class322 = class326.aClass322_3456; class322 != null; class322 = class322.aClass322_3360) {
				Class365_Sub1_Sub1 class365_sub1_sub1 = class322.aClass365_Sub1_Sub1_3359;
				if (class365_sub1_sub1 instanceof Entity) {
					Entity class365_sub1_sub1_sub2_38_ = (Entity) class365_sub1_sub1;
					int i_39_ = ((class365_sub1_sub1_sub2_38_.getSize() - 1) * 256 + 252);
					Class217 class217 = (class365_sub1_sub1_sub2_38_.method4337().aClass217_2599);
					int i_40_ = (int) class217.aFloat2451 - i_39_ >> 9;
					int i_41_ = (int) class217.aFloat2454 - i_39_ >> 9;
					int i_42_ = i_39_ + (int) class217.aFloat2451 >> 9;
					int i_43_ = i_39_ + (int) class217.aFloat2454 >> 9;
					if (i_40_ <= i_34_ && i_41_ <= i_35_ && i_42_ >= i_34_ && i_43_ >= i_35_) {
						int i_44_ = (1 + i_42_ - i_34_) * (i_43_ + 1 - i_35_);
						if (i_44_ > i_37_) {
							class365_sub1_sub1_sub2 = class365_sub1_sub1_sub2_38_;
							i_37_ = i_44_;
						}
					}
				}
			}
			return class365_sub1_sub1_sub2;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.id(").append(')').toString());
		}
	}

	static final void method4887(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			class105.aBoolean1171 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1;
			Tradution.method6054(class105, 2128713505);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.ds(").append(')').toString());
		}
	}

	static int method4888(int i, int i_45_, int i_46_) {
		try {
			double d = Math.log((double) i_45_) / Math.log(2.0);
			double d_47_ = Math.log((double) i) / Math.log(2.0);
			double d_48_ = Math.random() * (d - d_47_) + d_47_;
			return (int) (Math.pow(2.0, d_48_) + 0.5);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qe.m(").append(')').toString());
		}
	}
}
