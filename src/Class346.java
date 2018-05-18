
/* Class346 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class346 {
	public int[] anIntArray4046;
	public Class282_Sub50_Sub9 aClass282_Sub50_Sub9_4047;
	public int anInt4048;
	static NodeCollection aClass482_4049;

	public static Class346 method6146(RsByteBuffer class282_sub35) {
		Class346 class346 = new Class346();
		class346.anInt4048 = class282_sub35.readUnsignedShort() * -1506067503;
		class346.aClass282_Sub50_Sub9_4047 = Class368.aClass429_4265.method7214(-624100047 * class346.anInt4048, -1934243316);
		return class346;
	}

	public static Class346 method6147(RsByteBuffer class282_sub35) {
		Class346 class346 = new Class346();
		class346.anInt4048 = class282_sub35.readUnsignedShort() * -1506067503;
		class346.aClass282_Sub50_Sub9_4047 = Class368.aClass429_4265.method7214(-624100047 * class346.anInt4048, -1564761464);
		return class346;
	}

	public static Class346 method6148(RsByteBuffer class282_sub35) {
		Class346 class346 = new Class346();
		class346.anInt4048 = class282_sub35.readUnsignedShort() * -1506067503;
		class346.aClass282_Sub50_Sub9_4047 = Class368.aClass429_4265.method7214(-624100047 * class346.anInt4048, -1849534305);
		return class346;
	}

	static final void method6149(CS2Executor class527, byte i) {
		((CS2Executor) class527).anInt7001 -= -1188480575;
	}

	static final void method6150(CS2Executor class527, short i) {
		UnderlayDefinition class513;
		if (((CS2Executor) class527).aBool7022) {
			if (i != 245)
				return;
			class513 = ((CS2Executor) class527).aClass513_6994;
		} else
			class513 = ((CS2Executor) class527).aClass513_7007;
		UnderlayDefinition class513_0_ = class513;
		Class118 class118 = ((UnderlayDefinition) class513_0_).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513_0_).aClass98_5885;
		Class339.method6045(class118, class98, class527, (byte) -37);
	}

	static final void method6151(CS2Executor class527, int i) {
		int i_1_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_1_, (byte) 7);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 198275475 * class118.anInt1428;
	}

	static final void method6152(CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		Class344.method6119(string, -315586619);
	}

	static final void method6153(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub29_8201.method13050(519629067);
	}

	public static byte[] method6154(Object object, boolean bool, byte i) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	static boolean method6155(RsBitsBuffer buffer, int i, short i_2_) {
		int i_3_ = buffer.readBits(2, (byte) -19);
		if (i_3_ == 0) {
			if (buffer.readBits(1, (byte) 91) != 0)
				method6155(buffer, i, (short) 371);
			int i_4_ = buffer.readBits(6, (byte) 50);
			int i_5_ = buffer.readBits(6, (byte) -76);
			boolean bool = buffer.readBits(1, (byte) 68) == 1;
			if (bool)
				Class197.anIntArray2435[(Class197.anInt2434 += 1879181821) * -706143403 - 1] = i;
			if (null != client.players[i])
				throw new RuntimeException();
			Class4 class4 = Class197.aClass4Array2430[i];
			Player player = (client.players[i] = (new Player(client.aClass257_7353.method4430(-1638773780))));
			player.anInt10314 = -1498872675 * i;
			if (Class197.aClass282_Sub35Array2428[i] != null)
				player.decodeAppearance(Class197.aClass282_Sub35Array2428[i], 1925099603);
			player.method15791((((Class4) class4).anInt30 * 1348874583), true, (byte) -43);
			player.faceEntity = -1796197679 * ((Class4) class4).anInt32;
			int i_6_ = -1268681323 * ((Class4) class4).anInt31;
			int i_7_ = i_6_ >> 28;
			int i_8_ = i_6_ >> 14 & 0xff;
			int i_9_ = i_6_ & 0xff;
			Class219 class219 = client.aClass257_7353.method4519(1961926059);
			int i_10_ = (i_8_ << 6) + i_4_ - class219.anInt2711 * 1948093437;
			int i_11_ = i_5_ + (i_9_ << 6) - class219.anInt2712 * -1002240017;
			player.aBool10571 = ((Class4) class4).aBool29;
			player.aBool10550 = ((Class4) class4).aBool33;
			player.aByteArray10365[0] = Class197.playerMovementTypes[i];
			player.aByte7967 = player.aByte7968 = (byte) i_7_;
			if (client.aClass257_7353.method4433(33386298).method5497(i_10_, i_11_, 1509882915))
				player.aByte7968++;
			player.method16130(i_10_, i_11_, -2001556911);
			player.aBool10568 = false;
			Class197.aClass4Array2430[i] = null;
			return true;
		}
		if (1 == i_3_) {
			int i_12_ = buffer.readBits(2, (byte) -68);
			int i_13_ = (-1268681323 * ((Class4) Class197.aClass4Array2430[i]).anInt31);
			((Class4) Class197.aClass4Array2430[i]).anInt31 = -1096995395 * (((i_12_ + (i_13_ >> 28) & 0x3) << 28) + (i_13_ & 0xfffffff));
			return false;
		}
		if (i_3_ == 2) {
			int i_14_ = buffer.readBits(5, (byte) 14);
			int i_15_ = i_14_ >> 3;
			int i_16_ = i_14_ & 0x7;
			int i_17_ = (-1268681323 * ((Class4) Class197.aClass4Array2430[i]).anInt31);
			int i_18_ = (i_17_ >> 28) + i_15_ & 0x3;
			int i_19_ = i_17_ >> 14 & 0xff;
			int i_20_ = i_17_ & 0xff;
			if (i_16_ == 0) {
				i_19_--;
				i_20_--;
			}
			if (1 == i_16_)
				i_20_--;
			if (i_16_ == 2) {
				i_19_++;
				i_20_--;
			}
			if (i_16_ == 3)
				i_19_--;
			if (i_16_ == 4)
				i_19_++;
			if (5 == i_16_) {
				i_19_--;
				i_20_++;
			}
			if (i_16_ == 6)
				i_20_++;
			if (7 == i_16_) {
				i_19_++;
				i_20_++;
			}
			((Class4) Class197.aClass4Array2430[i]).anInt31 = -1096995395 * ((i_18_ << 28) + (i_19_ << 14) + i_20_);
			return false;
		}
		int i_21_ = buffer.readBits(18, (byte) -11);
		int i_22_ = i_21_ >> 16;
		int i_23_ = i_21_ >> 8 & 0xff;
		int i_24_ = i_21_ & 0xff;
		int i_25_ = -1268681323 * ((Class4) Class197.aClass4Array2430[i]).anInt31;
		int i_26_ = i_22_ + (i_25_ >> 28) & 0x3;
		int i_27_ = i_23_ + (i_25_ >> 14) & 0xff;
		int i_28_ = i_24_ + i_25_ & 0xff;
		((Class4) Class197.aClass4Array2430[i]).anInt31 = ((i_27_ << 14) + (i_26_ << 28) + i_28_) * -1096995395;
		return false;
	}

	public static Class411 method6156(int i, int i_29_) {
		Class411[] class411s = Class451.method7519((short) 19418);
		Class411[] class411s_30_ = class411s;
		for (int i_31_ = 0; i_31_ < class411s_30_.length; i_31_++) {
			Class411 class411 = class411s_30_[i_31_];
			if (((Class411) class411).anInt4957 * 627673697 == i)
				return class411;
		}
		return null;
	}

	static String method6157(Class118 class118, int i) {
		if (client.method11633(class118).method12179(-461437925) == 0)
			return null;
		if (null == class118.aString1338 || class118.aString1338.trim().length() == 0) {
			if (client.aBool7168)
				return "Hidden-use";
			return null;
		}
		return class118.aString1338;
	}

	static final void method6158(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 908211513) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1415 = Class351.method6193(string, class527, 1001457907);
		class118.aBool1384 = true;
	}

	public static final void method6159(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
		int i_37_ = i_33_ - i;
		int i_38_ = i_34_ - i_32_;
		if (0 == i_37_) {
			if (i_38_ != 0)
				Class468_Sub15.method12746(i, i_32_, i_34_, i_35_, 1519996212);
		} else if (i_38_ == 0)
			CS2Executor.method11250(i, i_33_, i_32_, i_35_, -789142799);
		else {
			int i_39_ = (i_38_ << 12) / i_37_;
			int i_40_ = i_32_ - (i * i_39_ >> 12);
			int i_41_;
			int i_42_;
			if (i < -612590951 * Class532_Sub2.anInt7071) {
				i_41_ = i_40_ + (i_39_ * (Class532_Sub2.anInt7071 * -612590951) >> 12);
				i_42_ = -612590951 * Class532_Sub2.anInt7071;
			} else if (i > Class532_Sub2.anInt7069 * -1345107225) {
				i_41_ = (i_39_ * (-1345107225 * Class532_Sub2.anInt7069) >> 12) + i_40_;
				i_42_ = Class532_Sub2.anInt7069 * -1345107225;
			} else {
				i_41_ = i_32_;
				i_42_ = i;
			}
			int i_43_;
			int i_44_;
			if (i_33_ < -612590951 * Class532_Sub2.anInt7071) {
				i_43_ = ((-612590951 * Class532_Sub2.anInt7071 * i_39_ >> 12) + i_40_);
				i_44_ = Class532_Sub2.anInt7071 * -612590951;
			} else if (i_33_ > Class532_Sub2.anInt7069 * -1345107225) {
				i_43_ = i_40_ + (-1345107225 * Class532_Sub2.anInt7069 * i_39_ >> 12);
				i_44_ = -1345107225 * Class532_Sub2.anInt7069;
			} else {
				i_43_ = i_34_;
				i_44_ = i_33_;
			}
			if (i_41_ < 324226563 * Class532_Sub2.anInt7070) {
				i_41_ = 324226563 * Class532_Sub2.anInt7070;
				i_42_ = ((Class532_Sub2.anInt7070 * 324226563 - i_40_ << 12) / i_39_);
			} else if (i_41_ > -348932735 * Class532_Sub2.anInt7068) {
				i_41_ = Class532_Sub2.anInt7068 * -348932735;
				i_42_ = ((-348932735 * Class532_Sub2.anInt7068 - i_40_ << 12) / i_39_);
			}
			if (i_43_ < 324226563 * Class532_Sub2.anInt7070) {
				i_43_ = Class532_Sub2.anInt7070 * 324226563;
				i_44_ = ((324226563 * Class532_Sub2.anInt7070 - i_40_ << 12) / i_39_);
			} else if (i_43_ > -348932735 * Class532_Sub2.anInt7068) {
				i_43_ = -348932735 * Class532_Sub2.anInt7068;
				i_44_ = ((Class532_Sub2.anInt7068 * -348932735 - i_40_ << 12) / i_39_);
			}
			Class523.method11220(i_42_, i_41_, i_44_, i_43_, i_35_, (byte) 12);
		}
	}

	static void method6160(int i) {
		Class9.lobbyStage = -1543542220;
		Class9.aClass184_73 = client.aClass184_7218;
		if (null != client.aByteArray7152) {
			RsByteBuffer class282_sub35 = new RsByteBuffer(client.aByteArray7152);
			Class9.aLong77 = (class282_sub35.readLong(1238599154) * 2087908126908168589L);
			Class9.aLong86 = (class282_sub35.readLong(169037294) * -3627564723025713089L);
		}
		if (Class9.aLong77 * 8013795473128403269L < 0L)
			Class8_Sub1.method13784(35, 776111623);
		else
			Class455.method7558(false, true, "", "", 8013795473128403269L * Class9.aLong77);
	}

	static void method6161(boolean bool, int i) {
		if (bool) {
			if (-1699899559 * client.anInt7349 != -1)
				Class337.method6017(-1699899559 * client.anInt7349, -650534239);
			for (Class282_Sub44 class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7750(-649341183)); class282_sub44 != null; class282_sub44 = (Class282_Sub44) client.aClass465_7442.method7751((byte) 6)) {
				if (!class282_sub44.method4994(-2135855077)) {
					class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7750(439080271));
					if (null == class282_sub44)
						break;
				}
				Class351.method6196(class282_sub44, true, false, -1457682699);
			}
			client.anInt7349 = -153305321;
			client.aClass465_7442 = new IterableNodeMap(8);
			MeshModifier.method7041((byte) -97);
			client.anInt7349 = 1398349149 * Class58.aClass529_527.anInt7027;
			Class516.method8867(false, -905479502);
			IncomingPacket.method6378(-1538407760);
			Class150.method2582(client.anInt7349 * -1699899559, null, -1429871398);
		}
		Class9.aBool71 = true;
	}
}
