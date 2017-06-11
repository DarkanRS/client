/* Class432 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ObjectDefinitions {
	byte aByte5363;
	public int anInt5364;
	public int anInt5365;
	public int[] anIntArray5366;
	public short[] aShortArray5367;
	public String name = "null";
	short[] aShortArray5369;
	public int[] anIntArray5370;
	byte[] aByteArray5371;
	short[] aShortArray5372;
	public short[] aShortArray5373;
	public int[][] modelIds;
	byte aByte5375;
	public int anInt5376;
	byte aByte5377 = 0;
	int[] anIntArray5378;
	int anInt5379;
	public int anInt5380;
	public boolean aBoolean5381;
	public int anInt5382;
	public int sizeY;
	int anInt5384;
	public boolean aBoolean5385;
	public int sizeX = -2144855351;
	public int anInt5387;
	public int anInt5388;
	public boolean aBoolean5389;
	int[] anIntArray5390;
	public int anInt5391;
	int anInt5392;
	int anInt5393;
	public String[] aStringArray5394;
	public boolean aBoolean5395;
	int anInt5396;
	public int anInt5397;
	public int anInt5398;
	public int anInt5399;
	public int anInt5400;
	public boolean aBoolean5401;
	public int anInt5402;
	Class433 aClass433_5403;
	public boolean aBoolean5404;
	public boolean aBoolean5405;
	int anInt5406;
	int anInt5407;
	public int anInt5408;
	public int anInt5409;
	public boolean aBoolean5410;
	int anInt5411;
	int anInt5412;
	int anInt5413;
	int anInt5414;
	byte aByte5415;
	public boolean aBoolean5416;
	byte aByte5417;
	public int anInt5418;
	int anInt5419;
	int anInt5420;
	int anInt5421;
	public int anInt5422;
	public static short[] aShortArray5423 = new short[256];
	public boolean aBoolean5424;
	public int anInt5425;
	public boolean aBoolean5426;
	public int anInt5427;
	public int anInt5428;
	public int[] anIntArray5429;
	public byte[] aByteArray5430;
	public boolean aBoolean5431;
	public boolean aBoolean5432;
	public boolean aBoolean5433;
	public boolean aBoolean5434;
	HashTable aClass437_5435;
	public int anInt5436;
	public int anInt5437;
	public int anInt5438;
	public int anInt5439;
	public boolean aBoolean5440;
	public boolean aBoolean5441;
	static int anInt5442 = 127007;

	void decode(RsByteBuffer stream, int i, int i_0_) {
		try {
			if (1 == i) {
				int i_1_ = stream.readUnsignedByte();
				aByteArray5430 = new byte[i_1_];
				modelIds = new int[i_1_][];
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
					aByteArray5430[i_2_] = stream.readByte(-12558881);
					int i_3_ = stream.readUnsignedByte();
					modelIds[i_2_] = new int[i_3_];
					for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
						modelIds[i_2_][i_4_] = stream.readBigSmart(1235052657);
				}
			} else if (i == 2)
				name = stream.readString(-1849485656);
			else if (14 == i)
				sizeX = stream.readUnsignedByte() * -2144855351;
			else if (i == 15)
				sizeY = stream.readUnsignedByte() * 44056569;
			else if (i == 17) {
				anInt5380 = 0;
				aBoolean5424 = false;
			} else if (i == 18)
				aBoolean5424 = false;
			else if (19 == i)
				anInt5382 = stream.readUnsignedByte() * 455422743;
			else if (21 == i)
				((ObjectDefinitions) this).aByte5363 = (byte) 1;
			else if (i == 22)
				aBoolean5385 = true;
			else if (i == 23)
				anInt5376 = -325083707;
			else if (24 == i) {
				int i_5_ = stream.readBigSmart(1235052657);
				if (i_5_ != -1)
					((ObjectDefinitions) this).anIntArray5378 = new int[] { i_5_ };
			} else if (i == 27)
				anInt5380 = 1137740721;
			else if (28 == i)
				anInt5391 = ((stream.readUnsignedByte() << 2) * 803995289);
			else if (i == 29)
				((ObjectDefinitions) this).anInt5392 = stream.readByte(-12558881) * -62240291;
			else if (39 == i)
				((ObjectDefinitions) this).anInt5393 = stream.readByte(-12558881) * -1530589831;
			else if (i >= 30 && i < 35)
				aStringArray5394[i - 30] = stream.readString(2140843487);
			else if (i == 40) {
				int i_6_ = stream.readUnsignedByte();
				((ObjectDefinitions) this).aShortArray5369 = new short[i_6_];
				aShortArray5367 = new short[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
					((ObjectDefinitions) this).aShortArray5369[i_7_] = (short) stream.readUnsignedShort();
					aShortArray5367[i_7_] = (short) stream.readUnsignedShort();
				}
			} else if (i == 41) {
				int i_8_ = stream.readUnsignedByte();
				((ObjectDefinitions) this).aShortArray5372 = new short[i_8_];
				aShortArray5373 = new short[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					((ObjectDefinitions) this).aShortArray5372[i_9_] = (short) stream.readUnsignedShort();
					aShortArray5373[i_9_] = (short) stream.readUnsignedShort();
				}
			} else if (i == 42) {
				int i_10_ = stream.readUnsignedByte();
				((ObjectDefinitions) this).aByteArray5371 = new byte[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
					((ObjectDefinitions) this).aByteArray5371[i_11_] = stream.readByte(-12558881);
			} else if (i == 62)
				aBoolean5404 = true;
			else if (64 == i)
				aBoolean5405 = false;
			else if (65 == i)
				((ObjectDefinitions) this).anInt5406 = stream.readUnsignedShort() * 929519655;
			else if (66 == i)
				((ObjectDefinitions) this).anInt5407 = stream.readUnsignedShort() * -1076239419;
			else if (i == 67)
				((ObjectDefinitions) this).anInt5414 = stream.readUnsignedShort() * 1192395179;
			else if (i == 69)
				stream.readUnsignedByte();
			else if (i == 70)
				((ObjectDefinitions) this).anInt5379 = (stream.readShort(1954619354) << 2) * 804752437;
			else if (i == 71)
				((ObjectDefinitions) this).anInt5396 = ((stream.readShort(1981333343) << 2) * -830213317);
			else if (i == 72)
				((ObjectDefinitions) this).anInt5411 = ((stream.readShort(2079097901) << 2) * 1957563615);
			else if (i == 73)
				aBoolean5410 = true;
			else if (i == 74)
				aBoolean5416 = true;
			else if (i == 75)
				anInt5409 = stream.readUnsignedByte() * 1763780945;
			else if (77 == i || 92 == i) {
				((ObjectDefinitions) this).anInt5420 = stream.readUnsignedShort() * -1228374415;
				if (65535 == 1064010385 * ((ObjectDefinitions) this).anInt5420)
					((ObjectDefinitions) this).anInt5420 = 1228374415;
				((ObjectDefinitions) this).anInt5421 = stream.readUnsignedShort() * -2115564225;
				if (65535 == -1128963393 * ((ObjectDefinitions) this).anInt5421)
					((ObjectDefinitions) this).anInt5421 = 2115564225;
				int i_12_ = -1;
				if (92 == i)
					i_12_ = stream.readBigSmart(1235052657);
				int i_13_ = stream.readUnsignedByte();
				anIntArray5366 = new int[2 + i_13_];
				for (int i_14_ = 0; i_14_ <= i_13_; i_14_++)
					anIntArray5366[i_14_] = stream.readBigSmart(1235052657);
				anIntArray5366[i_13_ + 1] = i_12_;
			} else if (i == 78) {
				anInt5422 = stream.readUnsignedShort() * -349046175;
				anInt5408 = stream.readUnsignedByte() * -634552289;
			} else if (i == 79) {
				anInt5427 = stream.readUnsignedShort() * 1882310759;
				anInt5428 = stream.readUnsignedShort() * 1376401661;
				anInt5408 = stream.readUnsignedByte() * -634552289;
				int i_15_ = stream.readUnsignedByte();
				anIntArray5429 = new int[i_15_];
				for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
					anIntArray5429[i_16_] = stream.readUnsignedShort();
			} else if (81 == i) {
				((ObjectDefinitions) this).aByte5363 = (byte) 2;
				((ObjectDefinitions) this).anInt5384 = stream.readUnsignedByte() * -1868938496;
			} else if (i == 82)
				aBoolean5432 = true;
			else if (88 == i)
				aBoolean5433 = false;
			else if (i == 89)
				aBoolean5431 = false;
			else if (91 == i)
				aBoolean5434 = true;
			else if (i == 93) {
				((ObjectDefinitions) this).aByte5363 = (byte) 3;
				((ObjectDefinitions) this).anInt5384 = stream.readUnsignedShort() * -242181565;
			} else if (i == 94)
				((ObjectDefinitions) this).aByte5363 = (byte) 4;
			else if (95 == i) {
				((ObjectDefinitions) this).aByte5363 = (byte) 5;
				((ObjectDefinitions) this).anInt5384 = stream.readShort(2013201622) * -242181565;
			} else if (97 == i)
				aBoolean5401 = true;
			else if (98 == i)
				aBoolean5381 = true;
			else if (99 == i) {
				anInt5397 = stream.readUnsignedByte() * 2064530465;
				anInt5436 = stream.readUnsignedShort() * -1320066331;
			} else if (100 == i) {
				anInt5398 = stream.readUnsignedByte() * 1406097311;
				anInt5364 = stream.readUnsignedShort() * 474865427;
			} else if (101 == i)
				anInt5402 = stream.readUnsignedByte() * 1747447869;
			else if (i == 102)
				anInt5400 = stream.readUnsignedShort() * 475870643;
			else if (103 == i)
				anInt5376 = 0;
			else if (104 == i)
				anInt5425 = stream.readUnsignedByte() * 1861040235;
			else if (i == 105)
				aBoolean5440 = true;
			else if (106 == i) {
				int i_17_ = stream.readUnsignedByte();
				int i_18_ = 0;
				((ObjectDefinitions) this).anIntArray5378 = new int[i_17_];
				((ObjectDefinitions) this).anIntArray5390 = new int[i_17_];
				for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
					((ObjectDefinitions) this).anIntArray5378[i_19_] = stream.readBigSmart(1235052657);
					i_18_ += ((ObjectDefinitions) this).anIntArray5390[i_19_] = stream.readUnsignedByte();
				}
				for (int i_20_ = 0; i_20_ < i_17_; i_20_++)
					((ObjectDefinitions) this).anIntArray5390[i_20_] = (65535 * ((ObjectDefinitions) this).anIntArray5390[i_20_] / i_18_);
			} else if (i == 107)
				anInt5399 = stream.readUnsignedShort() * -779127471;
			else if (i >= 150 && i < 155) {
				aStringArray5394[i - 150] = stream.readString(67859332);
				if (!((Class433) ((ObjectDefinitions) this).aClass433_5403).aBoolean5445)
					aStringArray5394[i - 150] = null;
			} else if (160 == i) {
				int i_21_ = stream.readUnsignedByte();
				anIntArray5370 = new int[i_21_];
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
					anIntArray5370[i_22_] = stream.readUnsignedShort();
			} else if (i == 162) {
				((ObjectDefinitions) this).aByte5363 = (byte) 3;
				((ObjectDefinitions) this).anInt5384 = stream.readInt((byte) 30) * -242181565;
			} else if (i == 163) {
				((ObjectDefinitions) this).aByte5417 = stream.readByte(-12558881);
				((ObjectDefinitions) this).aByte5375 = stream.readByte(-12558881);
				((ObjectDefinitions) this).aByte5415 = stream.readByte(-12558881);
				((ObjectDefinitions) this).aByte5377 = stream.readByte(-12558881);
			} else if (i == 164)
				((ObjectDefinitions) this).anInt5412 = stream.readShort(2119621102) * -1121469985;
			else if (165 == i)
				((ObjectDefinitions) this).anInt5413 = stream.readShort(1762145274) * 1097094883;
			else if (166 == i)
				((ObjectDefinitions) this).anInt5419 = stream.readShort(1892618723) * -870210675;
			else if (i == 167)
				anInt5418 = stream.readUnsignedShort() * 597954411;
			else if (168 == i)
				aBoolean5426 = true;
			else if (169 == i)
				aBoolean5395 = true;
			else if (170 == i)
				anInt5387 = stream.readUnsignedSmart(1723054621) * -1277797453;
			else if (171 == i)
				anInt5388 = stream.readUnsignedSmart(1723054621) * 883280249;
			else if (i == 173) {
				anInt5438 = stream.readUnsignedShort() * 1097791615;
				anInt5439 = stream.readUnsignedShort() * -127624289;
			} else if (i == 177)
				aBoolean5389 = true;
			else if (178 == i)
				anInt5437 = stream.readUnsignedByte() * -1122029857;
			else if (i == 189)
				aBoolean5441 = true;
			else if (i == 249) {
				int i_23_ = stream.readUnsignedByte();
				if (((ObjectDefinitions) this).aClass437_5435 == null) {
					int i_24_ = Class416.method5590(i_23_, (byte) 16);
					((ObjectDefinitions) this).aClass437_5435 = new HashTable(i_24_);
				}
				for (int i_25_ = 0; i_25_ < i_23_; i_25_++) {
					boolean bool = stream.readUnsignedByte() == 1;
					int i_26_ = stream.read24BitUnsignedInteger((byte) 44);
					Linkable class298;
					if (bool)
						class298 = new Class298_Sub29(stream.readString(-2143557829));
					else
						class298 = new Class298_Sub35(stream.readInt((byte) -68));
					((ObjectDefinitions) this).aClass437_5435.method5817(class298, (long) i_26_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.f(").append(')').toString());
		}
	}

	public String method5770(int i, String string, int i_27_) {
		try {
			if (((ObjectDefinitions) this).aClass437_5435 == null)
				return string;
			Class298_Sub29 class298_sub29 = ((Class298_Sub29) ((ObjectDefinitions) this).aClass437_5435.get((long) i));
			if (class298_sub29 == null)
				return string;
			return (String) class298_sub29.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.q(").append(')').toString());
		}
	}

	public final boolean method5771(int i, byte i_28_) {
		try {
			if (modelIds == null)
				return true;
			boolean bool = true;
			synchronized (((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass243_5447) {
				for (int i_29_ = 0; i_29_ < aByteArray5430.length; i_29_++) {
					if (aByteArray5430[i_29_] == i) {
						for (int i_30_ = 0; i_30_ < modelIds[i_29_].length; i_30_++) {
							if (!((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass243_5447.method2290(modelIds[i_29_][i_30_], 0, -1404450418))
								bool = false;
						}
					}
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.p(").append(')').toString());
		}
	}

	public final boolean method5772(int i) {
		try {
			if (modelIds == null)
				return true;
			boolean bool = true;
			synchronized (((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass243_5447) {
				for (int i_31_ = 0; i_31_ < modelIds.length; i_31_++) {
					for (int i_32_ = 0; i_32_ < modelIds[i_31_].length; i_32_++)
						bool &= (((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass243_5447.method2290(modelIds[i_31_][i_32_], 0, -1427920512));
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.i(").append(')').toString());
		}
	}

	public boolean method5773(int i, int i_33_) {
		try {
			if (((ObjectDefinitions) this).anIntArray5378 != null && -1 != i) {
				for (int i_34_ = 0; i_34_ < ((ObjectDefinitions) this).anIntArray5378.length; i_34_++) {
					if (((ObjectDefinitions) this).anIntArray5378[i_34_] == i)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.h(").append(')').toString());
		}
	}

	public final synchronized Class387 method5774(GraphicsToolkit class_ra, int i, int i_35_, int i_36_, Class_xa class_xa, Class_xa class_xa_37_, int i_38_, int i_39_, int i_40_, Class438 class438, Class435 class435, byte i_41_) {
		try {
			if (Class355.method4261(i_35_, 1883717056))
				i_35_ = Class424.aClass424_6596.anInt6613 * -1976050083;
			long l = (long) (i_36_ + ((i_35_ << 3) + (1181652947 * anInt5365 << 10)));
			int i_42_ = i;
			l |= (long) (class_ra.anInt5298 * 580915349 << 29);
			if (null != class435)
				l |= (((Class435) class435).aLong5460 * 2595045048596347611L << 32);
			if (class438 != null)
				i |= class438.method5829(-1790708337);
			if (((ObjectDefinitions) this).aByte5363 == 3)
				i |= 0x7;
			else {
				if (((ObjectDefinitions) this).aByte5363 != 0 || 0 != 52797131 * ((ObjectDefinitions) this).anInt5413)
					i |= 0x2;
				if (945504799 * ((ObjectDefinitions) this).anInt5412 != 0)
					i |= 0x1;
				if (0 != ((ObjectDefinitions) this).anInt5419 * 1782732613)
					i |= 0x4;
			}
			if (Class424.aClass424_6611.anInt6613 * -1976050083 == i_35_ && i_36_ > 3)
				i |= 0x5;
			Class387 class387;
			synchronized (((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5451) {
				class387 = (Class387) ((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5451.method4184(l);
			}
			if (class387 == null || class_ra.method5017(class387.m(), i) != 0) {
				if (class387 != null)
					i = class_ra.method5004(i, class387.m());
				class387 = method5775(class_ra, i, i_35_, i_36_, class435, 1981902641);
				if (null == class387)
					return null;
				synchronized (((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5451) {
					((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5451.method4194(class387, l);
				}
			}
			boolean bool = false;
			if (class438 != null) {
				class387 = class387.method4755((byte) 1, i, true);
				bool = true;
				class438.method5839(class387, i_36_ & 0x3, 1865606525);
			}
			if (i_35_ == -1976050083 * Class424.aClass424_6611.anInt6613 && i_36_ > 3) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.f(2048);
			}
			if (((ObjectDefinitions) this).aByte5363 != 0) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.pa(((ObjectDefinitions) this).aByte5363, 1762198123 * ((ObjectDefinitions) this).anInt5384, class_xa, class_xa_37_, i_38_, i_39_, i_40_);
			}
			if (945504799 * ((ObjectDefinitions) this).anInt5412 != 0 || 0 != ((ObjectDefinitions) this).anInt5413 * 52797131 || 0 != 1782732613 * ((ObjectDefinitions) this).anInt5419) {
				if (!bool) {
					class387 = class387.method4755((byte) 3, i, true);
					bool = true;
				}
				class387.ia(945504799 * ((ObjectDefinitions) this).anInt5412, ((ObjectDefinitions) this).anInt5413 * 52797131, 1782732613 * ((ObjectDefinitions) this).anInt5419);
			}
			if (bool)
				class387.KA(i_42_);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.d(").append(')').toString());
		}
	}

	Class387 method5775(GraphicsToolkit class_ra, int i, int i_43_, int i_44_, Class435 class435, int i_45_) {
		try {
			int i_46_ = ((ObjectDefinitions) this).anInt5392 * -1536403851 + 64;
			int i_47_ = -2019557395 * ((ObjectDefinitions) this).anInt5393 + 850;
			int i_48_ = i;
			boolean bool = (aBoolean5404 || (i_43_ == Class424.aClass424_6593.anInt6613 * -1976050083 && i_44_ > 3));
			if (bool)
				i |= 0x10;
			if (i_44_ == 0) {
				if (-166422633 * ((ObjectDefinitions) this).anInt5406 != 128 || ((ObjectDefinitions) this).anInt5379 * -1514641891 != 0)
					i |= 0x1;
				if (128 != ((ObjectDefinitions) this).anInt5414 * -895192829 || 0 != 2145431327 * ((ObjectDefinitions) this).anInt5411)
					i |= 0x4;
			} else
				i |= 0xd;
			if (128 != 668312333 * ((ObjectDefinitions) this).anInt5407 || ((ObjectDefinitions) this).anInt5396 * 1536191987 != 0)
				i |= 0x2;
			if (null != ((ObjectDefinitions) this).aShortArray5369)
				i |= 0x4000;
			if (((ObjectDefinitions) this).aShortArray5372 != null)
				i |= 0x8000;
			if (((ObjectDefinitions) this).aByte5377 != 0)
				i |= 0x80000;
			Class387 class387 = null;
			if (null != aByteArray5430) {
				int i_49_ = -1;
				for (int i_50_ = 0; i_50_ < aByteArray5430.length; i_50_++) {
					if (i_43_ == aByteArray5430[i_50_]) {
						i_49_ = i_50_;
						break;
					}
				}
				if (i_49_ == -1)
					return null;
				int[] is = ((class435 != null && ((Class435) class435).anIntArray5463 != null) ? ((Class435) class435).anIntArray5463 : modelIds[i_49_]);
				int i_51_ = is.length;
				if (i_51_ > 0) {
					long l = (long) (580915349 * class_ra.anInt5298);
					for (int i_52_ = 0; i_52_ < i_51_; i_52_++)
						l = (long) is[i_52_] + 67783L * l;
					synchronized (((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5450) {
						class387 = ((Class387) ((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5450.method4184(l));
					}
					if (null != class387) {
						if (i_46_ != class387.c())
							i |= 0x1000;
						if (i_47_ != class387.Z())
							i |= 0x2000;
					}
					if (null == class387 || class_ra.method5017(class387.m(), i) != 0) {
						int i_53_ = i | 0x1f01f;
						if (class387 != null)
							i_53_ = class_ra.method5004(i_53_, class387.m());
						Model model = null;
						synchronized (((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass64Array5443) {
							for (int i_54_ = 0; i_54_ < i_51_; i_54_++) {
								synchronized (((Class433) (((ObjectDefinitions) this).aClass433_5403)).aClass243_5447) {
									model = (Model.method751((((Class433) (((ObjectDefinitions) this).aClass433_5403)).aClass243_5447), is[i_54_], 0));
								}
								if (null == model) {
									Class387 class387_55_ = null;
									return class387_55_;
								}
								if (model.size < 13)
									model.method755(2);
								if (i_51_ > 1)
									((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass64Array5443[i_54_] = model;
							}
							if (i_51_ > 1)
								model = new Model((((Class433) (((ObjectDefinitions) this).aClass433_5403)).aClass64Array5443), i_51_);
						}
						class387 = class_ra.method5037(model, i_53_, (((Class433) (((ObjectDefinitions) this).aClass433_5403)).anInt5453) * -914670477, i_46_, i_47_);
						synchronized (((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5450) {
							((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5450.method4194(class387, l);
						}
					}
				}
			}
			if (null == class387)
				return null;
			Class387 class387_56_ = class387.method4755((byte) 0, i, true);
			if (i_46_ != class387.c())
				class387_56_.p(i_46_);
			if (i_47_ != class387.Z())
				class387_56_.Q(i_47_);
			if (bool)
				class387_56_.wa();
			if (i_43_ == Class424.aClass424_6596.anInt6613 * -1976050083 && i_44_ > 3) {
				class387_56_.S(2048);
				class387_56_.ia(180, 0, -180);
			}
			i_44_ &= 0x3;
			if (1 == i_44_)
				class387_56_.S(4096);
			else if (2 == i_44_)
				class387_56_.S(8192);
			else if (i_44_ == 3)
				class387_56_.S(12288);
			if (null != ((ObjectDefinitions) this).aShortArray5369) {
				short[] is;
				if (class435 != null && ((Class435) class435).aShortArray5462 != null)
					is = ((Class435) class435).aShortArray5462;
				else
					is = aShortArray5367;
				for (int i_57_ = 0; i_57_ < ((ObjectDefinitions) this).aShortArray5369.length; i_57_++) {
					if (((ObjectDefinitions) this).aByteArray5371 != null && i_57_ < ((ObjectDefinitions) this).aByteArray5371.length)
						class387_56_.X((((ObjectDefinitions) this).aShortArray5369[i_57_]), aShortArray5423[(((ObjectDefinitions) this).aByteArray5371[i_57_]) & 0xff]);
					else
						class387_56_.X((((ObjectDefinitions) this).aShortArray5369[i_57_]), is[i_57_]);
				}
			}
			if (null != ((ObjectDefinitions) this).aShortArray5372) {
				short[] is;
				if (null != class435 && null != ((Class435) class435).aShortArray5461)
					is = ((Class435) class435).aShortArray5461;
				else
					is = aShortArray5373;
				for (int i_58_ = 0; i_58_ < ((ObjectDefinitions) this).aShortArray5372.length; i_58_++)
					class387_56_.W(((ObjectDefinitions) this).aShortArray5372[i_58_], is[i_58_]);
			}
			if (0 != ((ObjectDefinitions) this).aByte5377)
				class387_56_.PA(((ObjectDefinitions) this).aByte5417, ((ObjectDefinitions) this).aByte5375, ((ObjectDefinitions) this).aByte5415, ((ObjectDefinitions) this).aByte5377 & 0xff);
			if (-166422633 * ((ObjectDefinitions) this).anInt5406 != 128 || 668312333 * ((ObjectDefinitions) this).anInt5407 != 128 || 128 != -895192829 * ((ObjectDefinitions) this).anInt5414)
				class387_56_.oa(((ObjectDefinitions) this).anInt5406 * -166422633, ((ObjectDefinitions) this).anInt5407 * 668312333, ((ObjectDefinitions) this).anInt5414 * -895192829);
			if (0 != ((ObjectDefinitions) this).anInt5379 * -1514641891 || 0 != 1536191987 * ((ObjectDefinitions) this).anInt5396 || 0 != ((ObjectDefinitions) this).anInt5411 * 2145431327)
				class387_56_.ia(-1514641891 * ((ObjectDefinitions) this).anInt5379, ((ObjectDefinitions) this).anInt5396 * 1536191987, ((ObjectDefinitions) this).anInt5411 * 2145431327);
			class387_56_.KA(i_48_);
			return class387_56_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.u(").append(')').toString());
		}
	}

	public int method5776(int i, int i_59_, byte i_60_) {
		try {
			if (null == ((ObjectDefinitions) this).aClass437_5435)
				return i_59_;
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) ((ObjectDefinitions) this).aClass437_5435.get((long) i));
			if (null == class298_sub35)
				return i_59_;
			return -774922497 * class298_sub35.anInt7394;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.r(").append(')').toString());
		}
	}

	public final ObjectDefinitions method5777(Interface23 interface23, int i) {
		try {
			int i_61_ = -1;
			if (((ObjectDefinitions) this).anInt5420 * 1064010385 != -1)
				i_61_ = interface23.method250((((ObjectDefinitions) this).anInt5420 * 1064010385), (byte) 36);
			else if (-1128963393 * ((ObjectDefinitions) this).anInt5421 != -1)
				i_61_ = interface23.method252((((ObjectDefinitions) this).anInt5421 * -1128963393), (byte) 99);
			if (i_61_ < 0 || i_61_ >= anIntArray5366.length - 1 || -1 == anIntArray5366[i_61_]) {
				int i_62_ = anIntArray5366[anIntArray5366.length - 1];
				if (-1 != i_62_)
					return ((ObjectDefinitions) this).aClass433_5403.getObjectDefinitions(i_62_);
				return null;
			}
			return ((ObjectDefinitions) this).aClass433_5403.getObjectDefinitions(anIntArray5366[i_61_]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.x(").append(')').toString());
		}
	}

	void method5778(int i) {
		try {
			if (1532834983 * anInt5382 == -1) {
				anInt5382 = 0;
				if (null != aByteArray5430 && 1 == aByteArray5430.length && (aByteArray5430[0] == Class424.aClass424_6611.anInt6613 * -1976050083))
					anInt5382 = 455422743;
				for (int i_63_ = 0; i_63_ < 5; i_63_++) {
					if (null != aStringArray5394[i_63_]) {
						anInt5382 = 455422743;
						break;
					}
				}
			}
			if (512737201 * anInt5409 == -1)
				anInt5409 = 1763780945 * (anInt5380 * -2144543407 != 0 ? 1 : 0);
			if (method5779(934270378) || aBoolean5381 || null != anIntArray5366)
				aBoolean5389 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.b(").append(')').toString());
		}
	}

	public boolean method5779(int i) {
		try {
			return ((ObjectDefinitions) this).anIntArray5378 != null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.s(").append(')').toString());
		}
	}

	public boolean method5780(int i) {
		try {
			return (((ObjectDefinitions) this).anIntArray5378 != null && ((ObjectDefinitions) this).anIntArray5378.length > 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.z(").append(')').toString());
		}
	}

	public int method5781(byte i) {
		try {
			if (null != ((ObjectDefinitions) this).anIntArray5378) {
				if (((ObjectDefinitions) this).anIntArray5378.length > 1) {
					int i_64_ = (int) (Math.random() * 65535.0);
					for (int i_65_ = 0; i_65_ < ((ObjectDefinitions) this).anIntArray5378.length; i_65_++) {
						if (i_64_ <= ((ObjectDefinitions) this).anIntArray5390[i_65_])
							return ((ObjectDefinitions) this).anIntArray5378[i_65_];
						i_64_ -= ((ObjectDefinitions) this).anIntArray5390[i_65_];
					}
				} else
					return ((ObjectDefinitions) this).anIntArray5378[0];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.y(").append(')').toString());
		}
	}

	public int[] method5782(int i) {
		try {
			return ((ObjectDefinitions) this).anIntArray5378;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.t(").append(')').toString());
		}
	}

	void method5783(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_66_ = class298_sub53.readUnsignedByte();
				if (i_66_ == 0) {
					if (i != -1780393822) {
						/* empty */
					}
					break;
				}
				decode(class298_sub53, i_66_, -537941504);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.a(").append(')').toString());
		}
	}

	ObjectDefinitions() {
		sizeY = 44056569;
		anInt5380 = -2019485854;
		aBoolean5424 = true;
		anInt5382 = -455422743;
		((ObjectDefinitions) this).aByte5363 = (byte) 0;
		((ObjectDefinitions) this).anInt5384 = 242181565;
		aBoolean5385 = false;
		anInt5376 = 325083707;
		anInt5387 = 1675091776;
		anInt5388 = 0;
		((ObjectDefinitions) this).anIntArray5378 = null;
		((ObjectDefinitions) this).anIntArray5390 = null;
		anInt5391 = -83909056;
		((ObjectDefinitions) this).anInt5392 = 0;
		((ObjectDefinitions) this).anInt5393 = 0;
		anInt5436 = 1320066331;
		anInt5364 = -474865427;
		anInt5397 = -2064530465;
		anInt5398 = -1406097311;
		anInt5399 = 779127471;
		anInt5400 = -475870643;
		aBoolean5401 = false;
		anInt5402 = 0;
		aBoolean5440 = false;
		aBoolean5404 = false;
		aBoolean5405 = true;
		((ObjectDefinitions) this).anInt5406 = -1280568448;
		((ObjectDefinitions) this).anInt5407 = -319692160;
		((ObjectDefinitions) this).anInt5414 = -1992239744;
		((ObjectDefinitions) this).anInt5379 = 0;
		((ObjectDefinitions) this).anInt5396 = 0;
		((ObjectDefinitions) this).anInt5411 = 0;
		((ObjectDefinitions) this).anInt5412 = 0;
		((ObjectDefinitions) this).anInt5413 = 0;
		((ObjectDefinitions) this).anInt5419 = 0;
		aBoolean5410 = false;
		aBoolean5416 = false;
		anInt5409 = -1763780945;
		anInt5418 = 0;
		((ObjectDefinitions) this).anInt5420 = 1228374415;
		((ObjectDefinitions) this).anInt5421 = 2115564225;
		anInt5422 = 349046175;
		anInt5408 = 0;
		anInt5437 = 0;
		anInt5425 = 2118857365;
		aBoolean5426 = false;
		anInt5427 = 0;
		anInt5428 = 0;
		aBoolean5395 = false;
		aBoolean5431 = true;
		aBoolean5432 = false;
		aBoolean5433 = true;
		aBoolean5434 = false;
		aBoolean5381 = false;
		anInt5438 = 1861779200;
		anInt5439 = 1687920384;
		aBoolean5389 = false;
		aBoolean5441 = false;
	}

	public boolean method5784(int i) {
		try {
			if (null == anIntArray5366)
				return anInt5422 * 393750945 != -1 || anIntArray5429 != null;
			for (int i_67_ = 0; i_67_ < anIntArray5366.length; i_67_++) {
				if (anIntArray5366[i_67_] != -1) {
					ObjectDefinitions class432_68_ = ((ObjectDefinitions) this).aClass433_5403.getObjectDefinitions(anIntArray5366[i_67_]);
					if (-1 != 393750945 * class432_68_.anInt5422 || null != class432_68_.anIntArray5429)
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.n(").append(')').toString());
		}
	}

	public final synchronized Class454 method5785(GraphicsToolkit class_ra, int i, int i_69_, int i_70_, Class_xa class_xa, Class_xa class_xa_71_, int i_72_, int i_73_, int i_74_, boolean bool, Class435 class435, int i_75_) {
		try {
			if (Class355.method4261(i_69_, -1998635010))
				i_69_ = Class424.aClass424_6596.anInt6613 * -1976050083;
			long l = (long) ((1181652947 * anInt5365 << 10) + (i_69_ << 3) + i_70_);
			l |= (long) (class_ra.anInt5298 * 580915349 << 29);
			if (class435 != null)
				l |= (2595045048596347611L * ((Class435) class435).aLong5460 << 32);
			int i_76_ = i;
			if (3 == ((ObjectDefinitions) this).aByte5363)
				i_76_ |= 0x7;
			else {
				if (0 != ((ObjectDefinitions) this).aByte5363 || 52797131 * ((ObjectDefinitions) this).anInt5413 != 0)
					i_76_ |= 0x2;
				if (945504799 * ((ObjectDefinitions) this).anInt5412 != 0)
					i_76_ |= 0x1;
				if (1782732613 * ((ObjectDefinitions) this).anInt5419 != 0)
					i_76_ |= 0x4;
			}
			if (bool)
				i_76_ |= 0x40000;
			Class454 class454;
			synchronized (((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5452) {
				class454 = (Class454) ((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5452.method4184(l);
			}
			Class387 class387 = (Class387) (class454 != null ? class454.anObject5645 : null);
			Class_na class_na = null;
			do {
				if (class387 == null || class_ra.method5017(class387.m(), i_76_) != 0) {
					if (null != class387)
						i_76_ = class_ra.method5004(i_76_, class387.m());
					int i_77_ = i_76_;
					if ((i_69_ == Class424.aClass424_6611.anInt6613 * -1976050083) && i_70_ > 3)
						i_77_ |= 0x5;
					class387 = method5775(class_ra, i_77_, i_69_, i_70_, class435, 1553510063);
					if (class387 == null)
						return null;
					if ((i_69_ == Class424.aClass424_6611.anInt6613 * -1976050083) && i_70_ > 3)
						class387.f(2048);
					if (bool)
						class_na = class387.ga(null);
					class387.KA(i_76_);
					class454 = new Class454(class387, class_na);
					synchronized (((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5452) {
						((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass348_5452.method4194(class454, l);
						break;
					}
				}
				class_na = (Class_na) class454.anObject5646;
				if (bool && class_na == null)
					class_na = (Class_na) (class454.anObject5646 = class387.ga(null));
			} while (false);
			boolean bool_78_ = (((ObjectDefinitions) this).aByte5363 != 0 && (null != class_xa || class_xa_71_ != null));
			boolean bool_79_ = (((ObjectDefinitions) this).anInt5412 * 945504799 != 0 || ((ObjectDefinitions) this).anInt5413 * 52797131 != 0 || 0 != ((ObjectDefinitions) this).anInt5419 * 1782732613);
			if (bool_78_ || bool_79_) {
				class387 = class387.method4755((byte) 0, i_76_, true);
				if (bool_78_)
					class387.pa(((ObjectDefinitions) this).aByte5363, 1762198123 * ((ObjectDefinitions) this).anInt5384, class_xa, class_xa_71_, i_72_, i_73_, i_74_);
				if (bool_79_)
					class387.ia(((ObjectDefinitions) this).anInt5412 * 945504799, 52797131 * ((ObjectDefinitions) this).anInt5413, ((ObjectDefinitions) this).anInt5419 * 1782732613);
				class387.KA(i);
			} else
				class387 = class387.method4755((byte) 0, i, true);
			((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass454_5456.anObject5645 = class387;
			((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass454_5456.anObject5646 = class_na;
			return (((Class433) ((ObjectDefinitions) this).aClass433_5403).aClass454_5456);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.k(").append(')').toString());
		}
	}

	public static Interface19 method5786(RsByteBuffer class298_sub53, byte i) {
		try {
			Class337 class337 = Class291.method2789(class298_sub53.readUnsignedByte(), (byte) -73);
			if (Class337.aClass337_3627 == class337)
				return Class238.method2201(class298_sub53, -1749563274);
			if (class337 == Class337.aClass337_3625)
				return Class237.method2195(class298_sub53, (byte) 1);
			if (class337 == Class337.aClass337_3624)
				return Class422_Sub7.method5651(class298_sub53, (byte) -67);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.a(").append(')').toString());
		}
	}

	static final void method5787(ClientScript2 class403, int i) {
		try {
			if (null != client.aByteArray8843)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.ahp(").append(')').toString());
		}
	}

	public static boolean method5788(char c, short i) {
		try {
			return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.y(").append(')').toString());
		}
	}

	static void method5789(int i) {
		try {
			Class305.method3751((byte) 127);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rw.aa(").append(')').toString());
		}
	}
}
