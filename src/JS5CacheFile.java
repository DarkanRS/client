
/* Class203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public final class JS5CacheFile {
	int anInt2572;
	Class440 aClass440_2573 = null;
	Class440 aClass440_2574 = null;
	int anInt2575;
	static byte[] aByteArray2576 = new byte[520];
	static long aLong2577;

	public String method3347() {
		return new StringBuilder().append("").append(((JS5CacheFile) this).anInt2575 * 1395827361).toString();
	}

	public boolean method3348(int i, byte[] is, int i_0_, int i_1_) {
		synchronized (((JS5CacheFile) this).aClass440_2573) {
			if (i_0_ < 0 || i_0_ > ((JS5CacheFile) this).anInt2572 * 33824747)
				throw new IllegalArgumentException();
			boolean bool = method3349(i, is, i_0_, true, 1578851603);
			if (!bool)
				bool = method3349(i, is, i_0_, false, 1984786993);
			boolean bool_2_ = bool;
			return bool_2_;
		}
	}

	boolean method3349(int i, byte[] is, int i_3_, boolean bool, int i_4_) {
		synchronized (((JS5CacheFile) this).aClass440_2573) {
			boolean bool_5_;
			try {
				int i_6_;
				if (bool) {
					if (((JS5CacheFile) this).aClass440_2574.method7345((byte) -128) < (long) (6 + 6 * i)) {
						boolean bool_7_ = false;
						return bool_7_;
					}
					((JS5CacheFile) this).aClass440_2574.method7347((long) (6 * i));
					((JS5CacheFile) this).aClass440_2574.method7350(aByteArray2576, 0, 6, 1524075486);
					i_6_ = ((aByteArray2576[5] & 0xff) + (((aByteArray2576[3] & 0xff) << 16) + ((aByteArray2576[4] & 0xff) << 8)));
					if (i_6_ <= 0 || (long) i_6_ > ((JS5CacheFile) this).aClass440_2573.method7345((byte) -125) / 520L) {
						boolean bool_8_ = false;
						return bool_8_;
					}
				} else {
					i_6_ = (int) ((((JS5CacheFile) this).aClass440_2573.method7345((byte) -125) + 519L) / 520L);
					if (0 == i_6_)
						i_6_ = 1;
				}
				aByteArray2576[0] = (byte) (i_3_ >> 16);
				aByteArray2576[1] = (byte) (i_3_ >> 8);
				aByteArray2576[2] = (byte) i_3_;
				aByteArray2576[3] = (byte) (i_6_ >> 16);
				aByteArray2576[4] = (byte) (i_6_ >> 8);
				aByteArray2576[5] = (byte) i_6_;
				((JS5CacheFile) this).aClass440_2574.method7347((long) (i * 6));
				((JS5CacheFile) this).aClass440_2574.method7352(aByteArray2576, 0, 6, 1942118537);
				int i_9_ = 0;
				int i_10_ = 0;
				while (i_9_ < i_3_) {
					int i_11_ = 0;
					if (bool) {
						((JS5CacheFile) this).aClass440_2573.method7347((long) (i_6_ * 520));
						int i_12_;
						int i_13_;
						int i_14_;
						if (i > 65535) {
							try {
								((JS5CacheFile) this).aClass440_2573.method7350(aByteArray2576, 0, 10, 1458391850);
							} catch (EOFException eofexception) {
								break;
							}
							i_12_ = (((aByteArray2576[0] & 0xff) << 24) + ((aByteArray2576[1] & 0xff) << 16) + ((aByteArray2576[2] & 0xff) << 8) + (aByteArray2576[3] & 0xff));
							i_13_ = (((aByteArray2576[4] & 0xff) << 8) + (aByteArray2576[5] & 0xff));
							i_11_ = ((aByteArray2576[8] & 0xff) + (((aByteArray2576[6] & 0xff) << 16) + ((aByteArray2576[7] & 0xff) << 8)));
							i_14_ = aByteArray2576[9] & 0xff;
						} else {
							try {
								((JS5CacheFile) this).aClass440_2573.method7350(aByteArray2576, 0, 8, -118308080);
							} catch (EOFException eofexception) {
								break;
							}
							i_12_ = ((aByteArray2576[1] & 0xff) + ((aByteArray2576[0] & 0xff) << 8));
							i_13_ = ((aByteArray2576[3] & 0xff) + ((aByteArray2576[2] & 0xff) << 8));
							i_11_ = ((aByteArray2576[6] & 0xff) + (((aByteArray2576[4] & 0xff) << 16) + ((aByteArray2576[5] & 0xff) << 8)));
							i_14_ = aByteArray2576[7] & 0xff;
						}
						if (i != i_12_ || i_13_ != i_10_ || (i_14_ != 1395827361 * ((JS5CacheFile) this).anInt2575)) {
							boolean bool_15_ = false;
							return bool_15_;
						}
						if (i_11_ < 0 || (long) i_11_ > (((JS5CacheFile) this).aClass440_2573.method7345((byte) -126) / 520L)) {
							boolean bool_16_ = false;
							return bool_16_;
						}
					}
					if (i_11_ == 0) {
						bool = false;
						i_11_ = (int) ((((JS5CacheFile) this).aClass440_2573.method7345((byte) -128) + 519L) / 520L);
						if (i_11_ == 0)
							i_11_++;
						if (i_6_ == i_11_)
							i_11_++;
					}
					if (i_3_ - i_9_ <= 512)
						i_11_ = 0;
					if (i > 65535) {
						aByteArray2576[0] = (byte) (i >> 24);
						aByteArray2576[1] = (byte) (i >> 16);
						aByteArray2576[2] = (byte) (i >> 8);
						aByteArray2576[3] = (byte) i;
						aByteArray2576[4] = (byte) (i_10_ >> 8);
						aByteArray2576[5] = (byte) i_10_;
						aByteArray2576[6] = (byte) (i_11_ >> 16);
						aByteArray2576[7] = (byte) (i_11_ >> 8);
						aByteArray2576[8] = (byte) i_11_;
						aByteArray2576[9] = (byte) (((JS5CacheFile) this).anInt2575 * 1395827361);
						((JS5CacheFile) this).aClass440_2573.method7347((long) (i_6_ * 520));
						((JS5CacheFile) this).aClass440_2573.method7352(aByteArray2576, 0, 10, 1942118537);
						int i_17_ = i_3_ - i_9_;
						if (i_17_ > 510)
							i_17_ = 510;
						((JS5CacheFile) this).aClass440_2573.method7352(is, i_9_, i_17_, 1942118537);
						i_9_ += i_17_;
					} else {
						aByteArray2576[0] = (byte) (i >> 8);
						aByteArray2576[1] = (byte) i;
						aByteArray2576[2] = (byte) (i_10_ >> 8);
						aByteArray2576[3] = (byte) i_10_;
						aByteArray2576[4] = (byte) (i_11_ >> 16);
						aByteArray2576[5] = (byte) (i_11_ >> 8);
						aByteArray2576[6] = (byte) i_11_;
						aByteArray2576[7] = (byte) (((JS5CacheFile) this).anInt2575 * 1395827361);
						((JS5CacheFile) this).aClass440_2573.method7347((long) (520 * i_6_));
						((JS5CacheFile) this).aClass440_2573.method7352(aByteArray2576, 0, 8, 1942118537);
						int i_18_ = i_3_ - i_9_;
						if (i_18_ > 512)
							i_18_ = 512;
						((JS5CacheFile) this).aClass440_2573.method7352(is, i_9_, i_18_, 1942118537);
						i_9_ += i_18_;
					}
					i_6_ = i_11_;
					i_10_++;
				}
				bool_5_ = true;
			} catch (IOException ioexception) {
				boolean bool_19_ = false;
				return bool_19_;
			}
			return bool_5_;
		}
	}

	public byte[] method3350(int i, byte i_20_) {
		synchronized (((JS5CacheFile) this).aClass440_2573) {
			byte[] is;
			try {
				if (((JS5CacheFile) this).aClass440_2574.method7345((byte) -128) < (long) (6 * i + 6)) {
					byte[] is_21_ = null;
					return is_21_;
				}
				((JS5CacheFile) this).aClass440_2574.method7347((long) (6 * i));
				((JS5CacheFile) this).aClass440_2574.method7350(aByteArray2576, 0, 6, 1783473570);
				int i_22_ = (((aByteArray2576[0] & 0xff) << 16) + ((aByteArray2576[1] & 0xff) << 8) + (aByteArray2576[2] & 0xff));
				int i_23_ = ((aByteArray2576[5] & 0xff) + (((aByteArray2576[4] & 0xff) << 8) + ((aByteArray2576[3] & 0xff) << 16)));
				if (i_22_ < 0 || i_22_ > ((JS5CacheFile) this).anInt2572 * 33824747) {
					byte[] is_24_ = null;
					return is_24_;
				}
				if (i_23_ <= 0 || (long) i_23_ > ((JS5CacheFile) this).aClass440_2573.method7345((byte) -128) / 520L) {
					byte[] is_25_ = null;
					return is_25_;
				}
				byte[] is_26_ = new byte[i_22_];
				int i_27_ = 0;
				int i_28_ = 0;
				while (i_27_ < i_22_) {
					if (i_23_ == 0) {
						byte[] is_29_ = null;
						return is_29_;
					}
					((JS5CacheFile) this).aClass440_2573.method7347((long) (520 * i_23_));
					int i_30_ = i_22_ - i_27_;
					int i_31_;
					int i_32_;
					int i_33_;
					int i_34_;
					int i_35_;
					if (i > 65535) {
						if (i_30_ > 510)
							i_30_ = 510;
						i_31_ = 10;
						((JS5CacheFile) this).aClass440_2573.method7350(aByteArray2576, 0, i_31_ + i_30_, -536752183);
						i_32_ = ((aByteArray2576[3] & 0xff) + (((aByteArray2576[0] & 0xff) << 24) + ((aByteArray2576[1] & 0xff) << 16) + ((aByteArray2576[2] & 0xff) << 8)));
						i_33_ = (((aByteArray2576[4] & 0xff) << 8) + (aByteArray2576[5] & 0xff));
						i_34_ = (((aByteArray2576[6] & 0xff) << 16) + ((aByteArray2576[7] & 0xff) << 8) + (aByteArray2576[8] & 0xff));
						i_35_ = aByteArray2576[9] & 0xff;
					} else {
						if (i_30_ > 512)
							i_30_ = 512;
						i_31_ = 8;
						((JS5CacheFile) this).aClass440_2573.method7350(aByteArray2576, 0, i_31_ + i_30_, 2090709032);
						i_32_ = ((aByteArray2576[1] & 0xff) + ((aByteArray2576[0] & 0xff) << 8));
						i_33_ = ((aByteArray2576[3] & 0xff) + ((aByteArray2576[2] & 0xff) << 8));
						i_34_ = (((aByteArray2576[5] & 0xff) << 8) + ((aByteArray2576[4] & 0xff) << 16) + (aByteArray2576[6] & 0xff));
						i_35_ = aByteArray2576[7] & 0xff;
					}
					if (i_32_ != i || i_33_ != i_28_ || ((JS5CacheFile) this).anInt2575 * 1395827361 != i_35_) {
						byte[] is_36_ = null;
						return is_36_;
					}
					if (i_34_ < 0 || (long) i_34_ > (((JS5CacheFile) this).aClass440_2573.method7345((byte) -126) / 520L)) {
						byte[] is_37_ = null;
						return is_37_;
					}
					int i_38_ = i_30_ + i_31_;
					for (int i_39_ = i_31_; i_39_ < i_38_; i_39_++)
						is_26_[i_27_++] = aByteArray2576[i_39_];
					i_23_ = i_34_;
					i_28_++;
				}
				is = is_26_;
			} catch (IOException ioexception) {
				byte[] is_40_ = null;
				return is_40_;
			}
			return is;
		}
	}

	public String toString() {
		return new StringBuilder().append("").append(((JS5CacheFile) this).anInt2575 * 1395827361).toString();
	}

	public JS5CacheFile(int i, Class440 class440, Class440 class440_41_, int i_42_) {
		((JS5CacheFile) this).anInt2572 = 2054678456;
		((JS5CacheFile) this).anInt2575 = 907395425 * i;
		((JS5CacheFile) this).aClass440_2573 = class440;
		((JS5CacheFile) this).aClass440_2574 = class440_41_;
		((JS5CacheFile) this).anInt2572 = 341250243 * i_42_;
	}

	public String method3351() {
		return new StringBuilder().append("").append(((JS5CacheFile) this).anInt2575 * 1395827361).toString();
	}

	public byte[] method3352(int i) {
		synchronized (((JS5CacheFile) this).aClass440_2573) {
			byte[] is;
			try {
				if (((JS5CacheFile) this).aClass440_2574.method7345((byte) -127) < (long) (6 * i + 6)) {
					byte[] is_43_ = null;
					return is_43_;
				}
				((JS5CacheFile) this).aClass440_2574.method7347((long) (6 * i));
				((JS5CacheFile) this).aClass440_2574.method7350(aByteArray2576, 0, 6, 1476084306);
				int i_44_ = (((aByteArray2576[0] & 0xff) << 16) + ((aByteArray2576[1] & 0xff) << 8) + (aByteArray2576[2] & 0xff));
				int i_45_ = ((aByteArray2576[5] & 0xff) + (((aByteArray2576[4] & 0xff) << 8) + ((aByteArray2576[3] & 0xff) << 16)));
				if (i_44_ < 0 || i_44_ > ((JS5CacheFile) this).anInt2572 * 33824747) {
					byte[] is_46_ = null;
					return is_46_;
				}
				if (i_45_ <= 0 || (long) i_45_ > ((JS5CacheFile) this).aClass440_2573.method7345((byte) -127) / 520L) {
					byte[] is_47_ = null;
					return is_47_;
				}
				byte[] is_48_ = new byte[i_44_];
				int i_49_ = 0;
				int i_50_ = 0;
				while (i_49_ < i_44_) {
					if (i_45_ == 0) {
						byte[] is_51_ = null;
						return is_51_;
					}
					((JS5CacheFile) this).aClass440_2573.method7347((long) (520 * i_45_));
					int i_52_ = i_44_ - i_49_;
					int i_53_;
					int i_54_;
					int i_55_;
					int i_56_;
					int i_57_;
					if (i > 65535) {
						if (i_52_ > 510)
							i_52_ = 510;
						i_53_ = 10;
						((JS5CacheFile) this).aClass440_2573.method7350(aByteArray2576, 0, i_53_ + i_52_, 1848151659);
						i_54_ = ((aByteArray2576[3] & 0xff) + (((aByteArray2576[0] & 0xff) << 24) + ((aByteArray2576[1] & 0xff) << 16) + ((aByteArray2576[2] & 0xff) << 8)));
						i_55_ = (((aByteArray2576[4] & 0xff) << 8) + (aByteArray2576[5] & 0xff));
						i_56_ = (((aByteArray2576[6] & 0xff) << 16) + ((aByteArray2576[7] & 0xff) << 8) + (aByteArray2576[8] & 0xff));
						i_57_ = aByteArray2576[9] & 0xff;
					} else {
						if (i_52_ > 512)
							i_52_ = 512;
						i_53_ = 8;
						((JS5CacheFile) this).aClass440_2573.method7350(aByteArray2576, 0, i_53_ + i_52_, -596517172);
						i_54_ = ((aByteArray2576[1] & 0xff) + ((aByteArray2576[0] & 0xff) << 8));
						i_55_ = ((aByteArray2576[3] & 0xff) + ((aByteArray2576[2] & 0xff) << 8));
						i_56_ = (((aByteArray2576[5] & 0xff) << 8) + ((aByteArray2576[4] & 0xff) << 16) + (aByteArray2576[6] & 0xff));
						i_57_ = aByteArray2576[7] & 0xff;
					}
					if (i_54_ != i || i_55_ != i_50_ || ((JS5CacheFile) this).anInt2575 * 1395827361 != i_57_) {
						byte[] is_58_ = null;
						return is_58_;
					}
					if (i_56_ < 0 || (long) i_56_ > (((JS5CacheFile) this).aClass440_2573.method7345((byte) -128) / 520L)) {
						byte[] is_59_ = null;
						return is_59_;
					}
					int i_60_ = i_52_ + i_53_;
					for (int i_61_ = i_53_; i_61_ < i_60_; i_61_++)
						is_48_[i_49_++] = aByteArray2576[i_61_];
					i_45_ = i_56_;
					i_50_++;
				}
				is = is_48_;
			} catch (IOException ioexception) {
				byte[] is_62_ = null;
				return is_62_;
			}
			return is;
		}
	}

	public static void method3353(Class282_Sub53 class282_sub53, int i) {
		if (!Class169.method2875(-1741204137 * client.anInt7166, -1927229770))
			class282_sub53.method13475(-485901681);
		else
			Class236.aClass534_Sub2_2911.method11410(class282_sub53, (byte) 24);
	}

	public static Class225 method3354(int i, int i_63_, int i_64_, int i_65_, Class458 class458, int i_66_, int i_67_) {
		Class224.aClass225_Sub4_2777.anInt2779 = -726719813 * i;
		Class224.aClass225_Sub4_2777.anInt2780 = i_63_ * 1767388707;
		Class224.aClass225_Sub4_2777.anInt2781 = i_64_ * -12808295;
		Class224.aClass225_Sub4_2777.anInt2782 = i_65_ * 1709796035;
		((Class225_Sub4) Class224.aClass225_Sub4_2777).aClass458_7934 = class458;
		((Class225_Sub4) Class224.aClass225_Sub4_2777).anInt7933 = i_66_ * 657015239;
		return Class224.aClass225_Sub4_2777;
	}

	static final void method3355(CS2Executor class527, int i) {
		int i_68_ = (((CS2Executor) class527).unknown[301123709 * ((CS2Executor) class527).instrPtr]);
		String string = (String) Class46.anObjectArray437[i_68_];
		if (null == string)
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = string;
	}

	static final void method3356(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		ReferenceTable.method5763(class118, class98, class527, 2042314343);
	}

	static final void method3357(CS2Executor class527, byte i) {
		int i_69_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_69_, (byte) 111);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_69_ >> 16];
		Class96_Sub9.method14586(class118, class98, class527, 909686877);
	}

	static final void method3358(CS2Executor class527, byte i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-317680305);
	}

	public static void method3359(int i) {
		if (!Class190.aBool2383) {
			Class435.method7301((client.aClass257_7353.method4430(-1518927169).aClass293ArrayArrayArray2610), (byte) 90);
			if ((client.aClass257_7353.method4430(-2093053436).aClass293ArrayArrayArray2608) != null)
				Class435.method7301((client.aClass257_7353.method4430(-1407673431).aClass293ArrayArrayArray2608), (byte) 112);
			Class190.aBool2383 = true;
		}
	}

	public static final boolean method3360(byte i) {
		boolean bool;
		if (2 != Class9.loginStage * 1923286921) {
			if (i == -1) {
				/* empty */
			}
			bool = true;
		} else
			bool = false;
		return bool;
	}

	static final void method3361(CS2Executor class527, byte i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (((CS2Executor) class527).aClass61_7010.method1197((String) (((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141)]), 1985834786));
	}
}
