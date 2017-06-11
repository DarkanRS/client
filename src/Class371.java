/* Class371 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class371 {
	public int anInt4031;
	public int anInt4032 = 1238942292;
	public int[] anIntArray4033 = null;
	public int[] anIntArray4034 = null;
	public int anInt4035 = -39715579;
	public int anInt4036;
	public int anInt4037;
	public boolean aBoolean4038 = true;
	public short[][] aShortArrayArray4039;
	static int anInt4040 = 4;
	public boolean aBoolean4041 = true;
	public int anInt4042;
	public boolean aBoolean4043;
	public short[][][] aShortArrayArrayArray4044;
	public int anInt4045;
	public int anInt4046;

	void method4580(RsByteBuffer class298_sub53, int i) {
		try {
			boolean bool = false;
			for (;;) {
				int opcode = class298_sub53.readUnsignedByte();
				if (0 == opcode) {
					if (i != -1224635914)
						throw new IllegalStateException();
					break;
				}
				if (1 == opcode) {
					if (null == anIntArray4033) {
						anInt4032 = 1238942292;
						anIntArray4033 = new int[4];
						anIntArray4034 = new int[4];
					}
					for (int i_1_ = 0; i_1_ < anIntArray4033.length; i_1_++) {
						anIntArray4033[i_1_] = class298_sub53.readShort(2110626558);
						anIntArray4034[i_1_] = class298_sub53.readShort(1614151446);
					}
					bool = true;
				} else if (opcode == 2)
					anInt4035 = class298_sub53.readBigSmart(1235052657) * 39715579;
				else if (opcode == 3) {
					anInt4032 = class298_sub53.readUnsignedByte() * -1837748075;
					anIntArray4033 = new int[-942466371 * anInt4032];
					anIntArray4034 = new int[-942466371 * anInt4032];
				} else if (4 == opcode)
					aBoolean4038 = false;
				else if (opcode == 5)
					anInt4042 = class298_sub53.read24BitUnsignedInteger((byte) 3) * -990069469;
				else if (opcode == 6)
					anInt4031 = class298_sub53.read24BitUnsignedInteger((byte) 66) * 1632959877;
				else if (7 == opcode) {
					aShortArrayArray4039 = new short[10][4];
					aShortArrayArrayArray4044 = new short[10][4][];
					for (int i_2_ = 0; i_2_ < 10; i_2_++) {
						for (int i_3_ = 0; i_3_ < 4; i_3_++) {
							int i_4_ = class298_sub53.readUnsignedShort();
							if (i_4_ == 65535)
								i_4_ = -1;
							aShortArrayArray4039[i_2_][i_3_] = (short) i_4_;
							int i_5_ = class298_sub53.readUnsignedShort();
							aShortArrayArrayArray4044[i_2_][i_3_] = new short[i_5_];
							for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
								int i_7_ = class298_sub53.readUnsignedShort();
								if (65535 == i_7_)
									i_7_ = -1;
								aShortArrayArrayArray4044[i_2_][i_3_][i_6_] = (short) i_7_;
							}
						}
					}
				} else if (opcode == 8)
					aBoolean4041 = false;
				else if (9 == opcode)
					anInt4036 = class298_sub53.readUnsignedByte() * 851919141;
				else if (10 == opcode)
					aBoolean4043 = false;
				else if (11 == opcode)
					anInt4037 = class298_sub53.readUnsignedByte() * -328397825;
				else if (opcode == 12) {
					anInt4045 = class298_sub53.readUnsignedShort() * -618853911;
					anInt4046 = class298_sub53.readUnsignedShort() * -1051634129;
				} else if (opcode == 13) {
					class298_sub53.readUnsignedByte();
					class298_sub53.readUnsignedByte();
					class298_sub53.readUnsignedByte();
					class298_sub53.readUnsignedByte();
					class298_sub53.readUnsignedByte();
				}
			}
			if (!bool) {
				if (null == anIntArray4033) {
					anInt4032 = 1238942292;
					anIntArray4033 = new int[4];
					anIntArray4034 = new int[4];
				}
				for (int i_8_ = 0; i_8_ < anIntArray4033.length; i_8_++) {
					anIntArray4033[i_8_] = 0;
					anIntArray4034[i_8_] = i_8_ * 20;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pk.a(").append(')').toString());
		}
	}

	public Class371(Class243 class243) {
		anInt4036 = 1703838282;
		aBoolean4043 = true;
		anInt4037 = -985193475;
		anInt4045 = 618853911;
		anInt4046 = 1051634129;
		byte[] is = class243.method2294((-363169051 * Class380.aClass380_4104.anInt4108), (byte) 61);
		method4580(new RsByteBuffer(is), -1224635914);
	}

	static void method4581(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 2] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 2]), 245040087).method4564(Class128.aClass148_6331, (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 - 1]), 236962620)) ? 1 : 0;
			((ClientScript2) class403).anInt5239 -= -391880689;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pk.c(").append(')').toString());
		}
	}

	static final void method4582(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -1435282371) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1122 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pk.lk(").append(')').toString());
		}
	}

	static final void method4583(ClientScript2 class403, int i) {
		try {
			int i_9_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_10_ = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7584.method5726(-2143866938);
			if (i_9_ != i_10_) {
				if (Class435.method5804(client.anInt8752 * -1233866115, (byte) 44)) {
					if (i_10_ == 0 && -1256171511 * Class300.anInt3207 != -1) {
						Class477.method6096(Class374_Sub1.aClass243_7731, -1256171511 * Class300.anInt3207, 0, i_9_, false, -2115031871);
						Class14.method344(57327767);
						Class300.aBoolean3208 = false;
					} else if (i_9_ == 0) {
						Class134.method1489((byte) -103);
						Class300.aBoolean3208 = false;
					} else
						Class70.method801(i_9_, -1911723714);
				}
				Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7584, i_9_, -2050981993);
				Class3.method300(656179282);
				client.aBoolean8666 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pk.aiw(").append(')').toString());
		}
	}

	static void method4584(int i, String string, boolean bool, byte i_11_) {
		try {
			Class16.method352(-1211644762);
			Tradution.method6053(-77044061);
			Class267.method2528(600492820);
			Class365_Sub1_Sub5_Sub2.method4533(i, string, bool, (short) 256);
			Class497.aClass197_6105.method1876(55121200);
			Class497.aClass197_6105.method1882(client.anInterface10_8700, (byte) 3);
			Class426.method5744(Class373.aClass_ra4071, -1982421296);
			Class346.method4173(Class373.aClass_ra4071, Class158.aClass243_6364, 556232880);
			Class92.method1007(886607379);
			Class_ta_Sub2.method6001(Class130_Sub2.aClass57Array6959, -1865975129);
			Class360.method4301(-1533729788);
			Class359.method4294(272313527);
			if (client.anInt8752 * -1233866115 == 19)
				Class439.method5851(1, 1559775234);
			else if (14 == client.anInt8752 * -1233866115)
				Class439.method5851(15, 326523598);
			else if (18 == -1233866115 * client.anInt8752)
				Class439.method5851(16, 508660854);
			else if (0 == -1233866115 * client.anInt8752)
				Class439.method5851(17, 582518486);
			else if (client.anInt8752 * -1233866115 == 11 || client.anInt8752 * -1233866115 == 7)
				Class234.method2175(-2131925444);
			else if (8 == client.anInt8752 * -1233866115)
				Class439.method5851(9, 1249490303);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pk.fk(").append(')').toString());
		}
	}

	static final void method4585(ClientScript2 class403, int i) {
		try {
			int i_12_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class298_Sub37_Sub13 class298_sub37_sub13 = Class298_Sub7.method2864(-577360818);
			if (class298_sub37_sub13 != null) {
				boolean bool = class298_sub37_sub13.method3453(i_12_ >> 28 & 0x3, i_12_ >> 14 & 0x3fff, i_12_ & 0x3fff, Class388.anIntArray4156, -253186022);
				if (bool)
					Class118.method1293(Class388.anIntArray4156[1], Class388.anIntArray4156[2], -548972447);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pk.ado(").append(')').toString());
		}
	}

	static final void method4586(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			client.aShort8923 = (short) (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			if (client.aShort8923 <= 0)
				client.aShort8923 = (short) 256;
			client.aShort8931 = (short) (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			if (client.aShort8931 <= 0)
				client.aShort8931 = (short) 320;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pk.akt(").append(')').toString());
		}
	}
}
