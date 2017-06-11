/* Class352 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class352 {
	Class339 aClass339_3776;
	public byte[] aByteArray3777;
	public String[] aStringArray3778;
	public int anInt3779;
	public boolean aBoolean3780;
	public int anInt3781;
	public int anInt3782;
	public int anInt3783;
	public int anInt3784;
	public int anInt3785 = 1126107561;
	public static int anInt3786 = 2;
	public int anInt3787;
	public int anInt3788;
	public String aString3789;
	int anInt3790;
	public boolean aBoolean3791;
	public String aString3792;
	public int anInt3793;
	int anInt3794;
	int anInt3795;
	int anInt3796;
	int anInt3797;
	int anInt3798;
	public int anInt3799;
	int anInt3800;
	int anInt3801;
	public int anInt3802;
	public int[] anIntArray3803;
	public int anInt3804;
	public int anInt3805;
	public int anInt3806;
	public int anInt3807;
	public int anInt3808;
	public static int anInt3809 = 0;
	public boolean aBoolean3810;
	HashTable aClass437_3811;
	public int anInt3812;
	public int anInt3813;
	public int[] anIntArray3814;
	int anInt3815;
	public boolean aBoolean3816;
	public int anInt3817;
	public static int anInt3818 = 1;

	void method4234(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i != 677294156) {
						/* empty */
					}
					break;
				}
				method4235(class298_sub53, i_0_, (short) 3170);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.a(").append(')').toString());
		}
	}

	void method4235(RsByteBuffer class298_sub53, int i, short i_1_) {
		try {
			if (1 == i)
				anInt3785 = class298_sub53.readBigSmart(1235052657) * -1126107561;
			else if (i == 2)
				anInt3779 = class298_sub53.readBigSmart(1235052657) * -1006024925;
			else if (3 == i)
				aString3792 = class298_sub53.readString(-730966089);
			else if (4 == i)
				anInt3781 = class298_sub53.read24BitUnsignedInteger((byte) -65) * 1851662915;
			else if (5 == i)
				anInt3782 = class298_sub53.read24BitUnsignedInteger((byte) -42) * 1266787663;
			else if (i == 6)
				anInt3783 = class298_sub53.readUnsignedByte() * -2108294259;
			else if (7 == i) {
				int i_2_ = class298_sub53.readUnsignedByte();
				if (0 == (i_2_ & 0x1))
					aBoolean3810 = false;
				if ((i_2_ & 0x2) == 2)
					aBoolean3780 = true;
			} else if (8 == i)
				aBoolean3791 = class298_sub53.readUnsignedByte() == 1;
			else if (9 == i) {
				((Class352) this).anInt3797 = class298_sub53.readUnsignedShort() * 1896723045;
				if (65535 == -539447443 * ((Class352) this).anInt3797)
					((Class352) this).anInt3797 = -1896723045;
				((Class352) this).anInt3798 = class298_sub53.readUnsignedShort() * -1225014007;
				if (-869705415 * ((Class352) this).anInt3798 == 65535)
					((Class352) this).anInt3798 = 1225014007;
				((Class352) this).anInt3795 = class298_sub53.readInt((byte) -62) * -166802393;
				((Class352) this).anInt3796 = class298_sub53.readInt((byte) -20) * -1288246043;
			} else if (i >= 10 && i <= 14)
				aStringArray3778[i - 10] = class298_sub53.readString(-1381247713);
			else if (i == 15) {
				int i_3_ = class298_sub53.readUnsignedByte();
				anIntArray3803 = new int[2 * i_3_];
				for (int i_4_ = 0; i_4_ < 2 * i_3_; i_4_++)
					anIntArray3803[i_4_] = class298_sub53.readShort(1914193224);
				anInt3808 = class298_sub53.readInt((byte) -21) * 88246575;
				int i_5_ = class298_sub53.readUnsignedByte();
				anIntArray3814 = new int[i_5_];
				for (int i_6_ = 0; i_6_ < anIntArray3814.length; i_6_++)
					anIntArray3814[i_6_] = class298_sub53.readInt((byte) 10);
				aByteArray3777 = new byte[i_3_];
				for (int i_7_ = 0; i_7_ < i_3_; i_7_++)
					aByteArray3777[i_7_] = class298_sub53.readByte(-12558881);
			} else if (i == 16)
				aBoolean3816 = false;
			else if (17 == i)
				aString3789 = class298_sub53.readString(-136783420);
			else if (18 == i)
				((Class352) this).anInt3794 = class298_sub53.readBigSmart(1235052657) * -1998808761;
			else if (19 == i)
				anInt3817 = class298_sub53.readUnsignedShort() * -1012984825;
			else if (20 == i) {
				((Class352) this).anInt3801 = class298_sub53.readUnsignedShort() * -1125434795;
				if (((Class352) this).anInt3801 * 769127165 == 65535)
					((Class352) this).anInt3801 = 1125434795;
				((Class352) this).anInt3790 = class298_sub53.readUnsignedShort() * -1435131889;
				if (-1461367057 * ((Class352) this).anInt3790 == 65535)
					((Class352) this).anInt3790 = 1435131889;
				((Class352) this).anInt3815 = class298_sub53.readInt((byte) 28) * 1428832641;
				((Class352) this).anInt3800 = class298_sub53.readInt((byte) 99) * 1701861307;
			} else if (i == 21)
				anInt3802 = class298_sub53.readInt((byte) -43) * -264999113;
			else if (22 == i)
				anInt3787 = class298_sub53.readInt((byte) -10) * 1977581169;
			else if (i == 23) {
				anInt3806 = class298_sub53.readUnsignedByte() * -799363989;
				anInt3799 = class298_sub53.readUnsignedByte() * 234302495;
				anInt3788 = class298_sub53.readUnsignedByte() * -1952866083;
			} else if (i == 24) {
				anInt3812 = class298_sub53.readShort(2027309656) * -1983273215;
				anInt3813 = class298_sub53.readShort(1532524522) * 1940877605;
			} else if (i == 249) {
				int i_8_ = class298_sub53.readUnsignedByte();
				if (((Class352) this).aClass437_3811 == null) {
					int i_9_ = Class416.method5590(i_8_, (byte) 16);
					((Class352) this).aClass437_3811 = new HashTable(i_9_);
				}
				for (int i_10_ = 0; i_10_ < i_8_; i_10_++) {
					boolean bool = class298_sub53.readUnsignedByte() == 1;
					int i_11_ = class298_sub53.read24BitUnsignedInteger((byte) -26);
					Linkable class298;
					if (bool)
						class298 = new Class298_Sub29(class298_sub53.readString(-826702559));
					else
						class298 = new Class298_Sub35(class298_sub53.readInt((byte) 97));
					((Class352) this).aClass437_3811.method5817(class298, (long) i_11_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.f(").append(')').toString());
		}
	}

	void method4236(int i) {
		try {
			if (null != anIntArray3803) {
				for (int i_12_ = 0; i_12_ < anIntArray3803.length; i_12_ += 2) {
					if (anIntArray3803[i_12_] < anInt3804 * 1281846757)
						anInt3804 = anIntArray3803[i_12_] * -1687812115;
					else if (anIntArray3803[i_12_] > 968926443 * anInt3793)
						anInt3793 = anIntArray3803[i_12_] * -426581053;
					if (anIntArray3803[i_12_ + 1] < anInt3805 * -1901940595)
						anInt3805 = -2066836923 * anIntArray3803[i_12_ + 1];
					else if (anIntArray3803[1 + i_12_] > -1294057761 * anInt3807)
						anInt3807 = -812843745 * anIntArray3803[1 + i_12_];
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.b(").append(')').toString());
		}
	}

	public boolean method4237(Interface23 interface23, int i) {
		try {
			int i_13_;
			if (-1 != -869705415 * ((Class352) this).anInt3798)
				i_13_ = interface23.method252((-869705415 * ((Class352) this).anInt3798), (byte) 44);
			else if (-1 != -539447443 * ((Class352) this).anInt3797)
				i_13_ = interface23.method250((-539447443 * ((Class352) this).anInt3797), (byte) 24);
			else
				return true;
			if (i_13_ < 338289559 * ((Class352) this).anInt3795 || i_13_ > -959385363 * ((Class352) this).anInt3796)
				return false;
			boolean bool = false;
			int i_14_;
			if (-1461367057 * ((Class352) this).anInt3790 != -1)
				i_14_ = interface23.method252((((Class352) this).anInt3790 * -1461367057), (byte) 17);
			else if (-1 != ((Class352) this).anInt3801 * 769127165)
				i_14_ = interface23.method250((((Class352) this).anInt3801 * 769127165), (byte) 72);
			else
				return true;
			if (i_14_ < ((Class352) this).anInt3815 * 372768385 || i_14_ > 520017267 * ((Class352) this).anInt3800)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.p(").append(')').toString());
		}
	}

	public Class57 method4238(GraphicsToolkit class_ra, boolean bool, int i) {
		try {
			int i_15_ = bool ? anInt3779 * -1413078901 : anInt3785 * 715019623;
			int i_16_ = i_15_ | 580915349 * class_ra.anInt5298 << 29;
			Class57 class57 = (Class57) ((Class339) ((Class352) this).aClass339_3776).aClass348_3635.method4184((long) i_16_);
			if (class57 != null)
				return class57;
			if (!((Class339) ((Class352) this).aClass339_3776).aClass243_3638.method2310(i_15_, -457216440))
				return null;
			Class89 class89 = Class89.method987((((Class339) (((Class352) this).aClass339_3776)).aClass243_3638), i_15_, 0);
			if (class89 != null) {
				class57 = class_ra.method5125(class89, true);
				((Class339) ((Class352) this).aClass339_3776).aClass348_3635.method4194(class57, (long) i_16_);
			}
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.i(").append(')').toString());
		}
	}

	Class352() {
		anInt3779 = 1006024925;
		anInt3782 = -1266787663;
		anInt3783 = 0;
		aBoolean3810 = true;
		aBoolean3780 = false;
		aBoolean3791 = true;
		aStringArray3778 = new String[5];
		((Class352) this).anInt3794 = 1998808761;
		((Class352) this).anInt3797 = -1896723045;
		((Class352) this).anInt3798 = 1225014007;
		((Class352) this).anInt3801 = 1125434795;
		((Class352) this).anInt3790 = 1435131889;
		anInt3804 = -459671533;
		anInt3805 = -80646725;
		anInt3793 = -2147483648;
		anInt3807 = -2147483648;
		anInt3806 = 799363989;
		anInt3799 = -234302495;
		anInt3788 = 1952866083;
		aBoolean3816 = true;
		anInt3817 = 1012984825;
	}

	public String method4239(int i, String string, byte i_17_) {
		try {
			if (null == ((Class352) this).aClass437_3811)
				return string;
			Class298_Sub29 class298_sub29 = ((Class298_Sub29) ((Class352) this).aClass437_3811.get((long) i));
			if (null == class298_sub29)
				return string;
			return (String) class298_sub29.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.u(").append(')').toString());
		}
	}

	public Class57 method4240(GraphicsToolkit class_ra, int i) {
		try {
			Class57 class57 = ((Class57) (((Class339) ((Class352) this).aClass339_3776).aClass348_3635.method4184((long) (((Class352) this).anInt3794 * 1027948663 | 0x20000 | class_ra.anInt5298 * 580915349 << 29))));
			if (null != class57)
				return class57;
			((Class339) ((Class352) this).aClass339_3776).aClass243_3638.method2310(1027948663 * ((Class352) this).anInt3794, -457216440);
			Class89 class89 = Class89.method987((((Class339) ((Class352) this).aClass339_3776).aClass243_3638), ((Class352) this).anInt3794 * 1027948663, 0);
			if (class89 != null) {
				class57 = class_ra.method5125(class89, true);
				((Class339) ((Class352) this).aClass339_3776).aClass348_3635.method4194(class57, (long) (((Class352) this).anInt3794 * 1027948663 | 0x20000 | class_ra.anInt5298 * 580915349 << 29));
			}
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.k(").append(')').toString());
		}
	}

	public int method4241(int i, int i_18_, int i_19_) {
		try {
			if (((Class352) this).aClass437_3811 == null)
				return i_18_;
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) ((Class352) this).aClass437_3811.get((long) i));
			if (class298_sub35 == null)
				return i_18_;
			return class298_sub35.anInt7394 * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.d(").append(')').toString());
		}
	}

	static final void method4242(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1959403445;
			Class320.method3913((((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]), (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]), (((ClientScript2) class403).anIntArray5244[2 + ((ClientScript2) class403).anInt5239 * 681479919]), (((ClientScript2) class403).anIntArray5244[3 + 681479919 * ((ClientScript2) class403).anInt5239]), false, (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 4]), 2026903657);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.to(").append(')').toString());
		}
	}

	static final void method4243(ClientScript2 class403, byte i) {
		try {
			int i_20_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class300.aClass518_3217.method6311(i_20_, 614874976).anInt9604) * 1317156085;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.ta(").append(')').toString());
		}
	}

	public static Class411 method4244(int i, byte i_21_) {
		try {
			Class411[] class411s = Class499.method6216((byte) 75);
			for (int i_22_ = 0; i_22_ < class411s.length; i_22_++) {
				Class411 class411 = class411s[i_22_];
				if (class411.gameType * -937307905 == i)
					return class411;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.f(").append(')').toString());
		}
	}

	public static int method4245(long l) {
		try {
			Class422_Sub9.method5658(l);
			return Class490.aCalendar6073.get(1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.q(").append(')').toString());
		}
	}

	static void method4246(int i, byte i_23_) {
		try {
			Class376.anInt4090 = i * -435591305;
			Class301_Sub1.anInt7627 = 789877945;
			Class301_Sub1.anInt7627 = 789877945;
			Class225.method2103(65536);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.co(").append(')').toString());
		}
	}

	static final void method4247(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			Class107.aShortArray1315[(((ClientScript2) class403).anIntArray5244[(681479919 * ((ClientScript2) class403).anInt5239)])] = (short) Class86.method964((((ClientScript2) class403).anIntArray5244[(681479919 * ((ClientScript2) class403).anInt5239 + 1)]), (byte) -118);
			Class298_Sub32_Sub14.aClass477_9400.method6091((byte) -85);
			Class298_Sub32_Sub14.aClass477_9400.method6089(-1524552538);
			Class15.aClass507_224.method6273((byte) 14);
			Class360.method4301(658986741);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.afg(").append(')').toString());
		}
	}

	static final void method4248(ClientScript2 class403, byte i) {
		try {
			int i_24_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_24_).aString5707);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("or.aaj(").append(')').toString());
		}
	}
}
