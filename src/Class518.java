/* Class518 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class518 {
	public int anInt5907;
	Class523 aClass523_5908;
	public int anInt5909;
	Class465 aClass465_5910;
	public int[] anIntArray5911;
	public int[] anIntArray5912;
	public int[][] anIntArrayArray5913;
	public int anInt5914 = 1208528487;
	public boolean[] aBoolArray5915;
	public int anInt5916 = -1175313279;
	public int anInt5917 = 611393677;
	public int anInt5918 = -814987755;
	public int[] anIntArray5919;
	public int anInt5920;
	public int anInt5921;
	public int[] anIntArray5922;
	public boolean aBool5923;
	public boolean aBool5924;
	public static boolean aBool5925 = false;
	public int[] anIntArray5926;
	public int[] anIntArray5927;
	public boolean aBool5928;
	public int anInt5929 = 949180193;
	public static int anInt5930;

	public String method11129(int i, String string, int i_0_) {
		if (null == ((Class518) this).aClass465_5910)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class518) this).aClass465_5910.method7754((long) i));
		if (null == class282_sub47)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	void method11130(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_1_ = class282_sub35.readUnsignedByte();
			if (i_1_ == 0)
				break;
			method11131(class282_sub35, i_1_, 1214881169);
		}
	}

	void method11131(RsByteBuffer class282_sub35, int i, int i_2_) {
		if (1 == i) {
			int i_3_ = class282_sub35.readUnsignedShort();
			anIntArray5912 = new int[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				anIntArray5912[i_4_] = class282_sub35.readUnsignedShort();
			anIntArray5922 = new int[i_3_];
			for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
				anIntArray5922[i_5_] = class282_sub35.readUnsignedShort();
			for (int i_6_ = 0; i_6_ < i_3_; i_6_++)
				anIntArray5922[i_6_] = (class282_sub35.readUnsignedShort() << 16) + anIntArray5922[i_6_];
		} else if (i == 2)
			anInt5914 = class282_sub35.readUnsignedShort() * -1208528487;
		else if (3 == i) {
			aBoolArray5915 = new boolean[256];
			int i_7_ = class282_sub35.readUnsignedByte();
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				aBoolArray5915[class282_sub35.readUnsignedByte()] = true;
		} else if (5 == i)
			anInt5916 = class282_sub35.readUnsignedByte() * -1094056115;
		else if (6 == i)
			anInt5917 = class282_sub35.readUnsignedShort() * -611393677;
		else if (i == 7)
			anInt5918 = class282_sub35.readUnsignedShort() * 814987755;
		else if (8 == i)
			anInt5929 = class282_sub35.readUnsignedByte() * 313272235;
		else if (9 == i)
			anInt5920 = class282_sub35.readUnsignedByte() * -26888893;
		else if (10 == i)
			anInt5921 = class282_sub35.readUnsignedByte() * -507546261;
		else if (i == 11)
			anInt5907 = class282_sub35.readUnsignedByte() * -845688857;
		else if (i == 12) {
			int i_9_ = class282_sub35.readUnsignedByte();
			anIntArray5911 = new int[i_9_];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
				anIntArray5911[i_10_] = class282_sub35.readUnsignedShort();
			for (int i_11_ = 0; i_11_ < i_9_; i_11_++)
				anIntArray5911[i_11_] = (class282_sub35.readUnsignedShort() << 16) + anIntArray5911[i_11_];
		} else if (13 == i) {
			int i_12_ = class282_sub35.readUnsignedShort();
			anIntArrayArray5913 = new int[i_12_][];
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				int i_14_ = class282_sub35.readUnsignedByte();
				if (i_14_ > 0) {
					anIntArrayArray5913[i_13_] = new int[i_14_];
					anIntArrayArray5913[i_13_][0] = class282_sub35.read24BitUnsignedInteger((short) 6790);
					for (int i_15_ = 1; i_15_ < i_14_; i_15_++)
						anIntArrayArray5913[i_13_][i_15_] = class282_sub35.readUnsignedShort();
				}
			}
		} else if (i == 14)
			aBool5923 = true;
		else if (i == 15)
			aBool5924 = true;
		else if (i != 16) {
			if (18 == i)
				aBool5928 = true;
			else if (19 == i) {
				if (anIntArray5926 == null) {
					anIntArray5926 = new int[anIntArrayArray5913.length];
					for (int i_16_ = 0; i_16_ < anIntArrayArray5913.length; i_16_++)
						anIntArray5926[i_16_] = 255;
				}
				anIntArray5926[class282_sub35.readUnsignedByte()] = class282_sub35.readUnsignedByte();
			} else if (i == 20) {
				if (null == anIntArray5927 || null == anIntArray5919) {
					anIntArray5927 = new int[anIntArrayArray5913.length];
					anIntArray5919 = new int[anIntArrayArray5913.length];
					for (int i_17_ = 0; i_17_ < anIntArrayArray5913.length; i_17_++) {
						anIntArray5927[i_17_] = 256;
						anIntArray5919[i_17_] = 256;
					}
				}
				int i_18_ = class282_sub35.readUnsignedByte();
				anIntArray5927[i_18_] = class282_sub35.readUnsignedShort();
				anIntArray5919[i_18_] = class282_sub35.readUnsignedShort();
			} else if (249 == i) {
				int i_19_ = class282_sub35.readUnsignedByte();
				if (((Class518) this).aClass465_5910 == null) {
					int i_20_ = Class323.method5778(i_19_, 1720003752);
					((Class518) this).aClass465_5910 = new Class465(i_20_);
				}
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					boolean bool = class282_sub35.readUnsignedByte() == 1;
					int i_22_ = class282_sub35.read24BitUnsignedInteger((short) 24364);
					Class282 class282;
					if (bool)
						class282 = new Class282_Sub47(class282_sub35.readString(-487209290));
					else
						class282 = new Class282_Sub38(class282_sub35.readInt());
					((Class518) this).aClass465_5910.method7765(class282, (long) i_22_);
				}
			}
		}
	}

	Class518() {
		anInt5920 = 26888893;
		anInt5921 = 507546261;
		anInt5907 = -1691377714;
		aBool5923 = false;
		aBool5924 = false;
		aBool5928 = false;
	}

	public boolean method11132(int i) {
		if (anIntArray5922 == null)
			return true;
		boolean bool = true;
		int[] is = anIntArray5922;
		for (int i_23_ = 0; i_23_ < is.length; i_23_++) {
			int i_24_ = is[i_23_];
			if (((Class518) this).aClass523_5908.method11207(i_24_ >>> 16, -1536383536) == null)
				bool = false;
		}
		return bool;
	}

	public int method11133(int i, int i_25_, int i_26_) {
		if (null == ((Class518) this).aClass465_5910)
			return i_25_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class518) this).aClass465_5910.method7754((long) i));
		if (null == class282_sub38)
			return i_25_;
		return class282_sub38.anInt8002 * -570797415;
	}

	public int method11134(int i, int i_27_) {
		if (null == ((Class518) this).aClass465_5910)
			return i_27_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class518) this).aClass465_5910.method7754((long) i));
		if (null == class282_sub38)
			return i_27_;
		return class282_sub38.anInt8002 * -570797415;
	}

	void method11135(RsByteBuffer class282_sub35, int i) {
		if (1 == i) {
			int i_28_ = class282_sub35.readUnsignedShort();
			anIntArray5912 = new int[i_28_];
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++)
				anIntArray5912[i_29_] = class282_sub35.readUnsignedShort();
			anIntArray5922 = new int[i_28_];
			for (int i_30_ = 0; i_30_ < i_28_; i_30_++)
				anIntArray5922[i_30_] = class282_sub35.readUnsignedShort();
			for (int i_31_ = 0; i_31_ < i_28_; i_31_++)
				anIntArray5922[i_31_] = (class282_sub35.readUnsignedShort() << 16) + anIntArray5922[i_31_];
		} else if (i == 2)
			anInt5914 = class282_sub35.readUnsignedShort() * -1208528487;
		else if (3 == i) {
			aBoolArray5915 = new boolean[256];
			int i_32_ = class282_sub35.readUnsignedByte();
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
				aBoolArray5915[class282_sub35.readUnsignedByte()] = true;
		} else if (5 == i)
			anInt5916 = class282_sub35.readUnsignedByte() * -1094056115;
		else if (6 == i)
			anInt5917 = class282_sub35.readUnsignedShort() * -611393677;
		else if (i == 7)
			anInt5918 = class282_sub35.readUnsignedShort() * 814987755;
		else if (8 == i)
			anInt5929 = class282_sub35.readUnsignedByte() * 313272235;
		else if (9 == i)
			anInt5920 = class282_sub35.readUnsignedByte() * -26888893;
		else if (10 == i)
			anInt5921 = class282_sub35.readUnsignedByte() * -507546261;
		else if (i == 11)
			anInt5907 = class282_sub35.readUnsignedByte() * -845688857;
		else if (i == 12) {
			int i_34_ = class282_sub35.readUnsignedByte();
			anIntArray5911 = new int[i_34_];
			for (int i_35_ = 0; i_35_ < i_34_; i_35_++)
				anIntArray5911[i_35_] = class282_sub35.readUnsignedShort();
			for (int i_36_ = 0; i_36_ < i_34_; i_36_++)
				anIntArray5911[i_36_] = (class282_sub35.readUnsignedShort() << 16) + anIntArray5911[i_36_];
		} else if (13 == i) {
			int i_37_ = class282_sub35.readUnsignedShort();
			anIntArrayArray5913 = new int[i_37_][];
			for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
				int i_39_ = class282_sub35.readUnsignedByte();
				if (i_39_ > 0) {
					anIntArrayArray5913[i_38_] = new int[i_39_];
					anIntArrayArray5913[i_38_][0] = class282_sub35.read24BitUnsignedInteger((short) 20180);
					for (int i_40_ = 1; i_40_ < i_39_; i_40_++)
						anIntArrayArray5913[i_38_][i_40_] = class282_sub35.readUnsignedShort();
				}
			}
		} else if (i == 14)
			aBool5923 = true;
		else if (i == 15)
			aBool5924 = true;
		else if (i != 16) {
			if (18 == i)
				aBool5928 = true;
			else if (19 == i) {
				if (anIntArray5926 == null) {
					anIntArray5926 = new int[anIntArrayArray5913.length];
					for (int i_41_ = 0; i_41_ < anIntArrayArray5913.length; i_41_++)
						anIntArray5926[i_41_] = 255;
				}
				anIntArray5926[class282_sub35.readUnsignedByte()] = class282_sub35.readUnsignedByte();
			} else if (i == 20) {
				if (null == anIntArray5927 || null == anIntArray5919) {
					anIntArray5927 = new int[anIntArrayArray5913.length];
					anIntArray5919 = new int[anIntArrayArray5913.length];
					for (int i_42_ = 0; i_42_ < anIntArrayArray5913.length; i_42_++) {
						anIntArray5927[i_42_] = 256;
						anIntArray5919[i_42_] = 256;
					}
				}
				int i_43_ = class282_sub35.readUnsignedByte();
				anIntArray5927[i_43_] = class282_sub35.readUnsignedShort();
				anIntArray5919[i_43_] = class282_sub35.readUnsignedShort();
			} else if (249 == i) {
				int i_44_ = class282_sub35.readUnsignedByte();
				if (((Class518) this).aClass465_5910 == null) {
					int i_45_ = Class323.method5778(i_44_, 1506813605);
					((Class518) this).aClass465_5910 = new Class465(i_45_);
				}
				for (int i_46_ = 0; i_46_ < i_44_; i_46_++) {
					boolean bool = class282_sub35.readUnsignedByte() == 1;
					int i_47_ = class282_sub35.read24BitUnsignedInteger((short) 18162);
					Class282 class282;
					if (bool)
						class282 = new Class282_Sub47(class282_sub35.readString(-342371097));
					else
						class282 = new Class282_Sub38(class282_sub35.readInt());
					((Class518) this).aClass465_5910.method7765(class282, (long) i_47_);
				}
			}
		}
	}

	void method11136(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method11131(class282_sub35, i, 1705199708);
		}
	}

	void method11137(RsByteBuffer class282_sub35, int i) {
		if (1 == i) {
			int i_48_ = class282_sub35.readUnsignedShort();
			anIntArray5912 = new int[i_48_];
			for (int i_49_ = 0; i_49_ < i_48_; i_49_++)
				anIntArray5912[i_49_] = class282_sub35.readUnsignedShort();
			anIntArray5922 = new int[i_48_];
			for (int i_50_ = 0; i_50_ < i_48_; i_50_++)
				anIntArray5922[i_50_] = class282_sub35.readUnsignedShort();
			for (int i_51_ = 0; i_51_ < i_48_; i_51_++)
				anIntArray5922[i_51_] = (class282_sub35.readUnsignedShort() << 16) + anIntArray5922[i_51_];
		} else if (i == 2)
			anInt5914 = class282_sub35.readUnsignedShort() * -1208528487;
		else if (3 == i) {
			aBoolArray5915 = new boolean[256];
			int i_52_ = class282_sub35.readUnsignedByte();
			for (int i_53_ = 0; i_53_ < i_52_; i_53_++)
				aBoolArray5915[class282_sub35.readUnsignedByte()] = true;
		} else if (5 == i)
			anInt5916 = class282_sub35.readUnsignedByte() * -1094056115;
		else if (6 == i)
			anInt5917 = class282_sub35.readUnsignedShort() * -611393677;
		else if (i == 7)
			anInt5918 = class282_sub35.readUnsignedShort() * 814987755;
		else if (8 == i)
			anInt5929 = class282_sub35.readUnsignedByte() * 313272235;
		else if (9 == i)
			anInt5920 = class282_sub35.readUnsignedByte() * -26888893;
		else if (10 == i)
			anInt5921 = class282_sub35.readUnsignedByte() * -507546261;
		else if (i == 11)
			anInt5907 = class282_sub35.readUnsignedByte() * -845688857;
		else if (i == 12) {
			int i_54_ = class282_sub35.readUnsignedByte();
			anIntArray5911 = new int[i_54_];
			for (int i_55_ = 0; i_55_ < i_54_; i_55_++)
				anIntArray5911[i_55_] = class282_sub35.readUnsignedShort();
			for (int i_56_ = 0; i_56_ < i_54_; i_56_++)
				anIntArray5911[i_56_] = (class282_sub35.readUnsignedShort() << 16) + anIntArray5911[i_56_];
		} else if (13 == i) {
			int i_57_ = class282_sub35.readUnsignedShort();
			anIntArrayArray5913 = new int[i_57_][];
			for (int i_58_ = 0; i_58_ < i_57_; i_58_++) {
				int i_59_ = class282_sub35.readUnsignedByte();
				if (i_59_ > 0) {
					anIntArrayArray5913[i_58_] = new int[i_59_];
					anIntArrayArray5913[i_58_][0] = class282_sub35.read24BitUnsignedInteger((short) 23755);
					for (int i_60_ = 1; i_60_ < i_59_; i_60_++)
						anIntArrayArray5913[i_58_][i_60_] = class282_sub35.readUnsignedShort();
				}
			}
		} else if (i == 14)
			aBool5923 = true;
		else if (i == 15)
			aBool5924 = true;
		else if (i != 16) {
			if (18 == i)
				aBool5928 = true;
			else if (19 == i) {
				if (anIntArray5926 == null) {
					anIntArray5926 = new int[anIntArrayArray5913.length];
					for (int i_61_ = 0; i_61_ < anIntArrayArray5913.length; i_61_++)
						anIntArray5926[i_61_] = 255;
				}
				anIntArray5926[class282_sub35.readUnsignedByte()] = class282_sub35.readUnsignedByte();
			} else if (i == 20) {
				if (null == anIntArray5927 || null == anIntArray5919) {
					anIntArray5927 = new int[anIntArrayArray5913.length];
					anIntArray5919 = new int[anIntArrayArray5913.length];
					for (int i_62_ = 0; i_62_ < anIntArrayArray5913.length; i_62_++) {
						anIntArray5927[i_62_] = 256;
						anIntArray5919[i_62_] = 256;
					}
				}
				int i_63_ = class282_sub35.readUnsignedByte();
				anIntArray5927[i_63_] = class282_sub35.readUnsignedShort();
				anIntArray5919[i_63_] = class282_sub35.readUnsignedShort();
			} else if (249 == i) {
				int i_64_ = class282_sub35.readUnsignedByte();
				if (((Class518) this).aClass465_5910 == null) {
					int i_65_ = Class323.method5778(i_64_, -2037518015);
					((Class518) this).aClass465_5910 = new Class465(i_65_);
				}
				for (int i_66_ = 0; i_66_ < i_64_; i_66_++) {
					boolean bool = class282_sub35.readUnsignedByte() == 1;
					int i_67_ = class282_sub35.read24BitUnsignedInteger((short) 13915);
					Class282 class282;
					if (bool)
						class282 = new Class282_Sub47(class282_sub35.readString(1708868767));
					else
						class282 = new Class282_Sub38(class282_sub35.readInt());
					((Class518) this).aClass465_5910.method7765(class282, (long) i_67_);
				}
			}
		}
	}

	public String method11138(int i, String string) {
		if (null == ((Class518) this).aClass465_5910)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class518) this).aClass465_5910.method7754((long) i));
		if (null == class282_sub47)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	void method11139(RsByteBuffer class282_sub35, int i) {
		if (1 == i) {
			int i_68_ = class282_sub35.readUnsignedShort();
			anIntArray5912 = new int[i_68_];
			for (int i_69_ = 0; i_69_ < i_68_; i_69_++)
				anIntArray5912[i_69_] = class282_sub35.readUnsignedShort();
			anIntArray5922 = new int[i_68_];
			for (int i_70_ = 0; i_70_ < i_68_; i_70_++)
				anIntArray5922[i_70_] = class282_sub35.readUnsignedShort();
			for (int i_71_ = 0; i_71_ < i_68_; i_71_++)
				anIntArray5922[i_71_] = (class282_sub35.readUnsignedShort() << 16) + anIntArray5922[i_71_];
		} else if (i == 2)
			anInt5914 = class282_sub35.readUnsignedShort() * -1208528487;
		else if (3 == i) {
			aBoolArray5915 = new boolean[256];
			int i_72_ = class282_sub35.readUnsignedByte();
			for (int i_73_ = 0; i_73_ < i_72_; i_73_++)
				aBoolArray5915[class282_sub35.readUnsignedByte()] = true;
		} else if (5 == i)
			anInt5916 = class282_sub35.readUnsignedByte() * -1094056115;
		else if (6 == i)
			anInt5917 = class282_sub35.readUnsignedShort() * -611393677;
		else if (i == 7)
			anInt5918 = class282_sub35.readUnsignedShort() * 814987755;
		else if (8 == i)
			anInt5929 = class282_sub35.readUnsignedByte() * 313272235;
		else if (9 == i)
			anInt5920 = class282_sub35.readUnsignedByte() * -26888893;
		else if (10 == i)
			anInt5921 = class282_sub35.readUnsignedByte() * -507546261;
		else if (i == 11)
			anInt5907 = class282_sub35.readUnsignedByte() * -845688857;
		else if (i == 12) {
			int i_74_ = class282_sub35.readUnsignedByte();
			anIntArray5911 = new int[i_74_];
			for (int i_75_ = 0; i_75_ < i_74_; i_75_++)
				anIntArray5911[i_75_] = class282_sub35.readUnsignedShort();
			for (int i_76_ = 0; i_76_ < i_74_; i_76_++)
				anIntArray5911[i_76_] = (class282_sub35.readUnsignedShort() << 16) + anIntArray5911[i_76_];
		} else if (13 == i) {
			int i_77_ = class282_sub35.readUnsignedShort();
			anIntArrayArray5913 = new int[i_77_][];
			for (int i_78_ = 0; i_78_ < i_77_; i_78_++) {
				int i_79_ = class282_sub35.readUnsignedByte();
				if (i_79_ > 0) {
					anIntArrayArray5913[i_78_] = new int[i_79_];
					anIntArrayArray5913[i_78_][0] = class282_sub35.read24BitUnsignedInteger((short) 2134);
					for (int i_80_ = 1; i_80_ < i_79_; i_80_++)
						anIntArrayArray5913[i_78_][i_80_] = class282_sub35.readUnsignedShort();
				}
			}
		} else if (i == 14)
			aBool5923 = true;
		else if (i == 15)
			aBool5924 = true;
		else if (i != 16) {
			if (18 == i)
				aBool5928 = true;
			else if (19 == i) {
				if (anIntArray5926 == null) {
					anIntArray5926 = new int[anIntArrayArray5913.length];
					for (int i_81_ = 0; i_81_ < anIntArrayArray5913.length; i_81_++)
						anIntArray5926[i_81_] = 255;
				}
				anIntArray5926[class282_sub35.readUnsignedByte()] = class282_sub35.readUnsignedByte();
			} else if (i == 20) {
				if (null == anIntArray5927 || null == anIntArray5919) {
					anIntArray5927 = new int[anIntArrayArray5913.length];
					anIntArray5919 = new int[anIntArrayArray5913.length];
					for (int i_82_ = 0; i_82_ < anIntArrayArray5913.length; i_82_++) {
						anIntArray5927[i_82_] = 256;
						anIntArray5919[i_82_] = 256;
					}
				}
				int i_83_ = class282_sub35.readUnsignedByte();
				anIntArray5927[i_83_] = class282_sub35.readUnsignedShort();
				anIntArray5919[i_83_] = class282_sub35.readUnsignedShort();
			} else if (249 == i) {
				int i_84_ = class282_sub35.readUnsignedByte();
				if (((Class518) this).aClass465_5910 == null) {
					int i_85_ = Class323.method5778(i_84_, -1610926434);
					((Class518) this).aClass465_5910 = new Class465(i_85_);
				}
				for (int i_86_ = 0; i_86_ < i_84_; i_86_++) {
					boolean bool = class282_sub35.readUnsignedByte() == 1;
					int i_87_ = class282_sub35.read24BitUnsignedInteger((short) 6865);
					Class282 class282;
					if (bool)
						class282 = new Class282_Sub47(class282_sub35.readString(1745796995));
					else
						class282 = new Class282_Sub38(class282_sub35.readInt());
					((Class518) this).aClass465_5910.method7765(class282, (long) i_87_);
				}
			}
		}
	}

	public boolean method11140() {
		if (anIntArray5922 == null)
			return true;
		boolean bool = true;
		int[] is = anIntArray5922;
		for (int i = 0; i < is.length; i++) {
			int i_88_ = is[i];
			if (((Class518) this).aClass523_5908.method11207(i_88_ >>> 16, -1536383536) == null)
				bool = false;
		}
		return bool;
	}

	public int method11141(int i, int i_89_) {
		if (null == ((Class518) this).aClass465_5910)
			return i_89_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class518) this).aClass465_5910.method7754((long) i));
		if (null == class282_sub38)
			return i_89_;
		return class282_sub38.anInt8002 * -570797415;
	}

	public int method11142(int i, int i_90_) {
		if (null == ((Class518) this).aClass465_5910)
			return i_90_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class518) this).aClass465_5910.method7754((long) i));
		if (null == class282_sub38)
			return i_90_;
		return class282_sub38.anInt8002 * -570797415;
	}

	void method11143(byte i) {
		if (-1113882773 * anInt5920 == -1) {
			if (aBoolArray5915 != null)
				anInt5920 = -53777786;
			else
				anInt5920 = 0;
		}
		if (113839939 * anInt5921 == -1) {
			if (null != aBoolArray5915)
				anInt5921 = -1015092522;
			else
				anInt5921 = 0;
		}
	}

	public String method11144(int i, String string) {
		if (null == ((Class518) this).aClass465_5910)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class518) this).aClass465_5910.method7754((long) i));
		if (null == class282_sub47)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public String method11145(int i, String string) {
		if (null == ((Class518) this).aClass465_5910)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class518) this).aClass465_5910.method7754((long) i));
		if (null == class282_sub47)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public static Class317 method11146(Class102 class102, boolean bool, int i, boolean bool_91_, int i_92_) {
		if (null == Class492.aClass327_Sub1Array5777)
			Class492.aClass327_Sub1Array5777 = new Class327_Sub1[Class123.method2149(957345803)];
		Class203 class203 = null;
		int i_93_ = class102.method1781(-333623124);
		if (client.aClass440_3270 != null)
			class203 = new Class203(i_93_, client.aClass440_3270, Class97.aClass440Array996[i_93_], 1500000);
		Class492.aClass327_Sub1Array5777[i_93_] = Class468_Sub9.aClass309_7896.method5480(i_93_, class203, Class533.aClass203_7073, (byte) 107);
		Class492.aClass327_Sub1Array5777[i_93_].method12544((short) -3210);
		return new Class317(Class492.aClass327_Sub1Array5777[i_93_], bool, i);
	}

	static final void method11147(Class527 class527, int i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method12609(-1561738474) ? 1 : 0;
	}

	public static final void method11148(Class521_Sub1 class521_sub1, int i, int i_94_) {
		Class8_Sub3.method14336(class521_sub1, i, true, 1386523975);
	}
}
