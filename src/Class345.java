
/* Class345 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class Class345 {
	public static final int anInt4018 = 0;
	static final int anInt4019 = 2;
	static final int anInt4020 = 1;
	static Index aClass317_4021;
	public static final int anInt4022 = 2;
	public static final int anInt4023 = 0;
	public int anInt4024;
	public static Class345[] aClass345Array4025 = new Class345[16];
	static final int anInt4026 = 1;
	public int anInt4027;
	static int anInt4028 = 0;
	public static IterableNodeMap aClass465_4029 = new IterableNodeMap(16);
	public static final int anInt4030 = 1;
	static SoftCache aClass229_4031 = new SoftCache(64);
	public int anInt4032;
	public int anInt4033;
	int anInt4034;
	public int anInt4035;
	public int anInt4036;
	public int anInt4037;
	public int anInt4038;
	public int anInt4039;
	public int anInt4040 = 0;
	public int anInt4041;
	boolean aBool4042;
	static final int anInt4043 = 0;
	public long aLong4044;
	public static final int anInt4045 = 1;

	public static void method6123() {
		aClass229_4031.method3859(-1631584100);
	}

	void method6124(RsByteBuffer class282_sub35, byte i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (0 == i_0_) {
				break;
			}
			method6125(class282_sub35, i_0_, (byte) 45);
		}
	}

	void method6125(RsByteBuffer class282_sub35, int i, byte i_1_) {
		if (i == 1) {
			if (i_1_ == -1) {
				throw new IllegalStateException();
			}
			this.anInt4034 = class282_sub35.readUnsignedShort() * 514806741;
		} else if (2 == i) {
			if (i_1_ == -1) {
				/* empty */
			}
			class282_sub35.readUnsignedByte();
		} else if (3 == i) {
			if (i_1_ == -1) {
				throw new IllegalStateException();
			}
			anInt4027 = class282_sub35.readInt() * -227554163;
			anInt4036 = class282_sub35.readInt() * -1469138939;
			anInt4037 = class282_sub35.readInt() * 1549854621;
		} else if (4 == i) {
			if (i_1_ == -1) {
				for (;;) {
					/* empty */
				}
			}
			anInt4038 = class282_sub35.readUnsignedByte() * 116223721;
			anInt4035 = class282_sub35.readInt() * 1767108719;
		} else if (6 == i) {
			if (i_1_ == -1) {
				throw new IllegalStateException();
			}
			anInt4041 = class282_sub35.readUnsignedByte() * 1597735141;
		} else if (i == 8) {
			if (i_1_ != -1) {
				anInt4040 = 1037944977;
			}
		} else if (9 == i) {
			if (i_1_ == -1) {
				/* empty */
			}
			anInt4039 = 210869753;
		} else if (10 == i) {
			if (i_1_ == -1) {
				for (;;) {
					/* empty */
				}
			}
			this.aBool4042 = true;
		}
	}

	void method6126(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i) {
				break;
			}
			method6125(class282_sub35, i, (byte) -2);
		}
	}

	public static void method6127(Index class317) {
		aClass317_4021 = class317;
	}

	void method6128(byte i) {
		anInt4024 = 2021544655 * (Class382.anIntArray4661[this.anInt4034 * -956740227 << 3]);
		long l = anInt4027 * -161425851;
		long l_2_ = -365865779 * anInt4036;
		long l_3_ = 1487656629 * anInt4037;
		anInt4033 = (int) Math.sqrt(l * l + l_2_ * l_2_ + l_3_ * l_3_) * 1585049917;
		if (anInt4035 * -259821937 == 0) {
			anInt4035 = 1767108719;
		}
		if (1337215321 * anInt4038 == 0) {
			aLong4044 = 4471187909544885869L;
		} else if (1337215321 * anInt4038 == 1) {
			aLong4044 = (anInt4033 * 1494970536 / (anInt4035 * -259821937) * 1277411589624840595L);
			aLong4044 *= -3961663252755643237L * aLong4044;
		} else if (anInt4038 * 1337215321 == 2) {
			aLong4044 = (anInt4033 * 1494970536 / (-259821937 * anInt4035) * 1277411589624840595L);
		}
		if (this.aBool4042) {
			anInt4033 *= -1;
		}
	}

	public static void method6129(Index class317) {
		aClass317_4021 = class317;
	}

	public static void method6130(Index class317) {
		aClass317_4021 = class317;
	}

	public static void method6131(Index class317) {
		aClass317_4021 = class317;
	}

	public static Class345 method6132(int i) {
		Class345 class345 = (Class345) aClass229_4031.get(i);
		if (class345 != null) {
			return class345;
		}
		byte[] is = aClass317_4021.getFile(1, i, -1783914740);
		class345 = new Class345();
		class345.anInt4032 = i * -113116309;
		if (is != null) {
			class345.method6124(new RsByteBuffer(is), (byte) -15);
		}
		class345.method6128((byte) 68);
		if (2 == -39568147 * class345.anInt4041 && aClass465_4029.method7754(i) == null) {
			aClass465_4029.method7765(new Class282_Sub38(anInt4028 * 1723673999), i);
			aClass345Array4025[(anInt4028 += 1694585199) * 1723673999 - 1] = class345;
		}
		aClass229_4031.put(class345, i);
		return class345;
	}

	void method6133(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i) {
				break;
			}
			method6125(class282_sub35, i, (byte) -47);
		}
	}

	void method6134() {
		anInt4024 = 2021544655 * (Class382.anIntArray4661[this.anInt4034 * -956740227 << 3]);
		long l = anInt4027 * -161425851;
		long l_4_ = -365865779 * anInt4036;
		long l_5_ = 1487656629 * anInt4037;
		anInt4033 = (int) Math.sqrt(l * l + l_4_ * l_4_ + l_5_ * l_5_) * 1585049917;
		if (anInt4035 * -259821937 == 0) {
			anInt4035 = 1767108719;
		}
		if (1337215321 * anInt4038 == 0) {
			aLong4044 = 4471187909544885869L;
		} else if (1337215321 * anInt4038 == 1) {
			aLong4044 = (anInt4033 * 1494970536 / (anInt4035 * -259821937) * 1277411589624840595L);
			aLong4044 *= -3961663252755643237L * aLong4044;
		} else if (anInt4038 * 1337215321 == 2) {
			aLong4044 = (anInt4033 * 1494970536 / (-259821937 * anInt4035) * 1277411589624840595L);
		}
		if (this.aBool4042) {
			anInt4033 *= -1;
		}
	}

	Class345() {
		anInt4039 = 0;
		this.aBool4042 = false;
	}

	void method6135(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			this.anInt4034 = class282_sub35.readUnsignedShort() * 514806741;
		} else if (2 == i) {
			class282_sub35.readUnsignedByte();
		} else if (3 == i) {
			anInt4027 = class282_sub35.readInt() * -227554163;
			anInt4036 = class282_sub35.readInt() * -1469138939;
			anInt4037 = class282_sub35.readInt() * 1549854621;
		} else if (4 == i) {
			anInt4038 = class282_sub35.readUnsignedByte() * 116223721;
			anInt4035 = class282_sub35.readInt() * 1767108719;
		} else if (6 == i) {
			anInt4041 = class282_sub35.readUnsignedByte() * 1597735141;
		} else if (i == 8) {
			anInt4040 = 1037944977;
		} else if (9 == i) {
			anInt4039 = 210869753;
		} else if (10 == i) {
			this.aBool4042 = true;
		}
	}

	public static void method6136() {
		aClass229_4031.method3859(-2022521573);
	}

	public static Class442 method6137(String string, String string_6_, boolean bool, byte i) {
		File file = new File(Class263.aFile3264, new StringBuilder().append("preferences").append(string).append(".dat").toString());
		do {
			if (file.exists()) {
				if (i != -1) {
					for (;;) {
						/* empty */
					}
				}
				Class442 class442;
				try {
					Class442 class442_7_ = new Class442(file, "rw", 10000L);
					class442 = class442_7_;
				} catch (IOException ioexception) {
					break;
				}
				return class442;
			}
		} while (false);
		String string_8_ = "";
		if (33 == -1179779029 * Class514.anInt5887) {
			if (i != -1) {
				for (;;) {
					/* empty */
				}
			}
			string_8_ = "_rc";
		} else if (-1179779029 * Class514.anInt5887 == 34) {
			if (i != -1) {
				throw new IllegalStateException();
			}
			string_8_ = "_wip";
		}
		File file_9_ = new File(Class110.aString1103, new StringBuilder().append("jagex_").append(string_6_).append("_preferences").append(string).append(string_8_).append(".dat").toString());
		do {
			if (!bool) {
				if (i != -1) {
					for (;;) {
						/* empty */
					}
				}
				if (file_9_.exists()) {
					if (i != -1) {
						throw new IllegalStateException();
					}
					Class442 class442;
					try {
						Class442 class442_10_ = new Class442(file_9_, "rw", 10000L);
						class442 = class442_10_;
					} catch (IOException ioexception) {
						break;
					}
					return class442;
				}
			}
		} while (false);
		Class442 class442;
		try {
			Class442 class442_11_ = new Class442(file, "rw", 10000L);
			class442 = class442_11_;
		} catch (IOException ioexception) {
			throw new RuntimeException();
		}
		return class442;
	}

	static final void method6138(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = class513.aClass118_5886;
		Node.method5001(class118, class527, -1847769999);
	}

	static final void method6139(CS2Executor class527, int i) {
		long l = (class527.aLongArray7003[((class527.anInt7001 -= -1188480575) * 1820448321)]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = -1L == l ? "" : Long.toString(l, 36).toUpperCase();
	}

	public static boolean method6140(int i) {
		return 0 != Class148.anInt1730 * -1423242349;
	}

	static final void method6141(CS2Executor class527, int i) {
		int i_12_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_12_, (byte) 94);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_12_ >> 16];
		Class453.method7547(class118, class98, class527, 1462639259);
	}

	static final void method6142(CS2Executor class527, int i) {
		int i_13_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_13_, (byte) 30);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = 442725395 * class118.anInt1277;
	}

	static void method6143(int i, int i_14_) {
		Class105.anInt1069 = 946658707 * i;
		Class282_Sub30.aClass229_7712.method3859(-1205784337);
	}

	static Class369[] method6144(int i) {
		return (new Class369[] { Class369.aClass369_4273, Class369.aClass369_4270, Class369.aClass369_4279, Class369.aClass369_4277, Class369.aClass369_4272, Class369.aClass369_4269, Class369.aClass369_4275, Class369.aClass369_4268, Class369.aClass369_4274, Class369.aClass369_4276, Class369.aClass369_4271 });
	}

	static void worldLogin(String string, String string_15_, int i) {
		Class9.lobbyStage = 211318143;
		Class9.aClass184_73 = client.aClass184_7475;
		Class455.method7558(false, false, string, string_15_, -1L);// hmm
	}
}
