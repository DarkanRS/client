/* Class365_Sub1_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class365_Sub1_Sub4_Sub1 extends Class365_Sub1_Sub4 {
	public int anInt10142;
	public int anInt10143;
	boolean aBoolean10144;
	public int anInt10145;
	public int anInt10146;
	public int anInt10147;
	int anInt10148;
	int anInt10149;
	public int anInt10150 = -474510257;
	int anInt10151;
	public int anInt10152;
	int anInt10153;
	int anInt10154;

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			Class217 class217 = Class217.method2005(method4337().aClass217_2599);
			Class322 class322 = aClass331_7722.method4036(plane, (int) class217.aFloat2451 >> 9, (int) class217.aFloat2454 >> 9, -583169676);
			Class365_Sub1_Sub2 class365_sub1_sub2 = aClass331_7722.method4058(plane, (int) class217.aFloat2451 >> 9, (int) class217.aFloat2454 >> 9, (byte) 55);
			int i_0_ = 0;
			if (null != class322 && class322.aClass365_Sub1_Sub1_3359.aBoolean9799)
				i_0_ = class322.aClass365_Sub1_Sub1_3359.method4361(1951240662);
			if (class365_sub1_sub2 != null && class365_sub1_sub2.aShort9801 > -i_0_)
				i_0_ = -class365_sub1_sub2.aShort9801;
			if (-1184748693 * anInt10142 != i_0_) {
				class217.aFloat2455 += (float) (i_0_ - anInt10142 * -1184748693);
				method4340(class217);
				anInt10142 = 472885571 * i_0_;
			}
			Matrix3f class222 = class_ra.method5178();
			class222.method2055();
			if (anInt10142 * -1184748693 == 0) {
				boolean bool = false;
				boolean bool_1_ = false;
				boolean bool_2_ = false;
				Class_xa class_xa = aClass331_7722.aClass_xaArray3517[aByte7724];
				int i_3_ = (455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149 << 1);
				int i_4_ = i_3_;
				int i_5_ = -i_3_ / 2;
				int i_6_ = -i_4_ / 2;
				int i_7_ = class_xa.method6340(i_5_ + (int) class217.aFloat2451, (int) class217.aFloat2454 + i_6_, -1982900642);
				int i_8_ = i_3_ / 2;
				int i_9_ = -i_4_ / 2;
				int i_10_ = class_xa.method6340((int) class217.aFloat2451 + i_8_, i_9_ + (int) class217.aFloat2454, -1725399320);
				int i_11_ = -i_3_ / 2;
				int i_12_ = i_4_ / 2;
				int i_13_ = class_xa.method6340((int) class217.aFloat2451 + i_11_, (int) class217.aFloat2454 + i_12_, -1471266970);
				int i_14_ = i_3_ / 2;
				int i_15_ = i_4_ / 2;
				int i_16_ = class_xa.method6340(i_14_ + (int) class217.aFloat2451, i_15_ + (int) class217.aFloat2454, -1424760570);
				int i_17_ = i_7_ < i_10_ ? i_7_ : i_10_;
				int i_18_ = i_13_ < i_16_ ? i_13_ : i_16_;
				int i_19_ = i_10_ < i_16_ ? i_10_ : i_16_;
				int i_20_ = i_7_ < i_13_ ? i_7_ : i_13_;
				if (i_4_ != 0) {
					int i_21_ = ((int) (Math.atan2((double) (i_17_ - i_18_), (double) i_4_) * 2607.5945876176133) & 0x3fff);
					if (i_21_ != 0)
						class222.method2071(1.0F, 0.0F, 0.0F, Class220.method2049(i_21_));
				}
				if (i_3_ != 0) {
					int i_22_ = ((int) (Math.atan2((double) (i_20_ - i_19_), (double) i_3_) * 2607.5945876176133) & 0x3fff);
					if (i_22_ != 0)
						class222.method2071(0.0F, 0.0F, 1.0F, Class220.method2049(-i_22_));
				}
				int i_23_ = i_7_ + i_16_;
				if (i_10_ + i_13_ < i_23_)
					i_23_ = i_13_ + i_10_;
				i_23_ = (i_23_ >> 1) - (int) class217.aFloat2455;
				if (i_23_ != 0)
					class222.method2064(0.0F, (float) i_23_, 0.0F);
			}
			class217.method2006();
			Class217 class217_24_ = method4337().aClass217_2599;
			class222.method2064(class217_24_.aFloat2451, class217_24_.aFloat2455 - 10.0F, class217_24_.aFloat2454);
			Class335 class335 = Class73.method818(true, 2098850781);
			((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 = false;
			((Class365_Sub1_Sub4_Sub1) this).anInt10149 = 0;
			if (anInt10146 * -1651799761 != -1) {
				Class387 class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 526336, 1271433065 * anInt10147, null, null, (1191848641 * ((Class365_Sub1_Sub4_Sub1) this).anInt10151), (((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391), (-1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153), (-1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154), 1919430109));
				if (null != class387) {
					class387.method4739(class222, aClass302_Sub1Array7726[2], 0);
					((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= class387.i();
					((Class365_Sub1_Sub4_Sub1) this).anInt10149 = class387.n() * 674558949;
				}
			}
			if (-1 != -909380271 * anInt10150) {
				Class387 class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 526336, 442323255 * anInt10145, null, null, (1191848641 * ((Class365_Sub1_Sub4_Sub1) this).anInt10151), (((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391), (-1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153), (-1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154), 1944203535));
				if (null != class387) {
					class387.method4739(class222, aClass302_Sub1Array7726[1], 0);
					((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= class387.i();
					if (class387.n() > (455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149))
						((Class365_Sub1_Sub4_Sub1) this).anInt10149 = class387.n() * 674558949;
				}
			}
			Class387 class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 526336, 825822935 * anInt10143, null, null, ((Class365_Sub1_Sub4_Sub1) this).anInt10151 * 1191848641, ((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391, -1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153, -1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154, 1623001467));
			if (null != class387) {
				class387.method4739(class222, aClass302_Sub1Array7726[0], 0);
				((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= class387.i();
				if (class387.n() > 455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149)
					((Class365_Sub1_Sub4_Sub1) this).anInt10149 = class387.n() * 674558949;
			}
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akc.bo(").append(')').toString());
		}
	}

	void method4516(int i) {
		try {
			((Class365_Sub1_Sub4_Sub1) this).anInt10151 = (32 + (int) (Math.random() * 4.0)) * 2009949505;
			((Class365_Sub1_Sub4_Sub1) this).anInt10148 = (3 + (int) (Math.random() * 2.0)) * 880372431;
			((Class365_Sub1_Sub4_Sub1) this).anInt10153 = (16 + (int) (Math.random() * 3.0)) * -1003661399;
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub16_7557.method5687(1941334276) == 1)
				((Class365_Sub1_Sub4_Sub1) this).anInt10154 = (int) (Math.random() * 10.0) * 1183208523;
			else
				((Class365_Sub1_Sub4_Sub1) this).anInt10154 = (int) (Math.random() * 20.0) * 1183208523;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akc.a(").append(')').toString());
		}
	}

	public int method4379() {
		return -10;
	}

	boolean method4376(short i) {
		try {
			return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akc.be(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akc.bc(").append(')').toString());
		}
	}

	public int method4381() {
		return -10;
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akc.bb(").append(')').toString());
		}
	}

	Class335 method4370(GraphicsToolkit class_ra) {
		Class217 class217 = Class217.method2005(method4337().aClass217_2599);
		Class322 class322 = aClass331_7722.method4036(plane, (int) class217.aFloat2451 >> 9, (int) class217.aFloat2454 >> 9, 1738520080);
		Class365_Sub1_Sub2 class365_sub1_sub2 = aClass331_7722.method4058(plane, (int) class217.aFloat2451 >> 9, (int) class217.aFloat2454 >> 9, (byte) 15);
		int i = 0;
		if (null != class322 && class322.aClass365_Sub1_Sub1_3359.aBoolean9799)
			i = class322.aClass365_Sub1_Sub1_3359.method4361(1951240662);
		if (class365_sub1_sub2 != null && class365_sub1_sub2.aShort9801 > -i)
			i = -class365_sub1_sub2.aShort9801;
		if (-1184748693 * anInt10142 != i) {
			class217.aFloat2455 += (float) (i - anInt10142 * -1184748693);
			method4340(class217);
			anInt10142 = 472885571 * i;
		}
		Matrix3f class222 = class_ra.method5178();
		class222.method2055();
		if (anInt10142 * -1184748693 == 0) {
			boolean bool = false;
			boolean bool_25_ = false;
			boolean bool_26_ = false;
			Class_xa class_xa = aClass331_7722.aClass_xaArray3517[aByte7724];
			int i_27_ = 455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149 << 1;
			int i_28_ = i_27_;
			int i_29_ = -i_27_ / 2;
			int i_30_ = -i_28_ / 2;
			int i_31_ = class_xa.method6340(i_29_ + (int) class217.aFloat2451, (int) class217.aFloat2454 + i_30_, -1545427351);
			int i_32_ = i_27_ / 2;
			int i_33_ = -i_28_ / 2;
			int i_34_ = class_xa.method6340((int) class217.aFloat2451 + i_32_, i_33_ + (int) class217.aFloat2454, -1284070566);
			int i_35_ = -i_27_ / 2;
			int i_36_ = i_28_ / 2;
			int i_37_ = class_xa.method6340((int) class217.aFloat2451 + i_35_, (int) class217.aFloat2454 + i_36_, -1982262190);
			int i_38_ = i_27_ / 2;
			int i_39_ = i_28_ / 2;
			int i_40_ = class_xa.method6340(i_38_ + (int) class217.aFloat2451, i_39_ + (int) class217.aFloat2454, -1609235363);
			int i_41_ = i_31_ < i_34_ ? i_31_ : i_34_;
			int i_42_ = i_37_ < i_40_ ? i_37_ : i_40_;
			int i_43_ = i_34_ < i_40_ ? i_34_ : i_40_;
			int i_44_ = i_31_ < i_37_ ? i_31_ : i_37_;
			if (i_28_ != 0) {
				int i_45_ = ((int) (Math.atan2((double) (i_41_ - i_42_), (double) i_28_) * 2607.5945876176133) & 0x3fff);
				if (i_45_ != 0)
					class222.method2071(1.0F, 0.0F, 0.0F, Class220.method2049(i_45_));
			}
			if (i_27_ != 0) {
				int i_46_ = ((int) (Math.atan2((double) (i_44_ - i_43_), (double) i_27_) * 2607.5945876176133) & 0x3fff);
				if (i_46_ != 0)
					class222.method2071(0.0F, 0.0F, 1.0F, Class220.method2049(-i_46_));
			}
			int i_47_ = i_31_ + i_40_;
			if (i_34_ + i_37_ < i_47_)
				i_47_ = i_37_ + i_34_;
			i_47_ = (i_47_ >> 1) - (int) class217.aFloat2455;
			if (i_47_ != 0)
				class222.method2064(0.0F, (float) i_47_, 0.0F);
		}
		class217.method2006();
		Class217 class217_48_ = method4337().aClass217_2599;
		class222.method2064(class217_48_.aFloat2451, class217_48_.aFloat2455 - 10.0F, class217_48_.aFloat2454);
		Class335 class335 = Class73.method818(true, 1609695805);
		((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 = false;
		((Class365_Sub1_Sub4_Sub1) this).anInt10149 = 0;
		if (anInt10146 * -1651799761 != -1) {
			Class387 class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 526336, 1271433065 * anInt10147, null, null, 1191848641 * ((Class365_Sub1_Sub4_Sub1) this).anInt10151, ((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391, -1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153, -1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154, 1928416812));
			if (null != class387) {
				class387.method4739(class222, aClass302_Sub1Array7726[2], 0);
				((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= class387.i();
				((Class365_Sub1_Sub4_Sub1) this).anInt10149 = class387.n() * 674558949;
			}
		}
		if (-1 != -909380271 * anInt10150) {
			Class387 class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 526336, 442323255 * anInt10145, null, null, 1191848641 * ((Class365_Sub1_Sub4_Sub1) this).anInt10151, ((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391, -1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153, -1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154, 1479435475));
			if (null != class387) {
				class387.method4739(class222, aClass302_Sub1Array7726[1], 0);
				((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= class387.i();
				if (class387.n() > 455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149)
					((Class365_Sub1_Sub4_Sub1) this).anInt10149 = class387.n() * 674558949;
			}
		}
		Class387 class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 526336, 825822935 * anInt10143, null, null, ((Class365_Sub1_Sub4_Sub1) this).anInt10151 * 1191848641, ((Class365_Sub1_Sub4_Sub1) this).anInt10148 * 943545391, -1436336999 * ((Class365_Sub1_Sub4_Sub1) this).anInt10153, -1595812509 * ((Class365_Sub1_Sub4_Sub1) this).anInt10154, 1686923112));
		if (null != class387) {
			class387.method4739(class222, aClass302_Sub1Array7726[0], 0);
			((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 |= class387.i();
			if (class387.n() > 455610861 * ((Class365_Sub1_Sub4_Sub1) this).anInt10149)
				((Class365_Sub1_Sub4_Sub1) this).anInt10149 = class387.n() * 674558949;
		}
		return class335;
	}

	public int method4517() {
		return anInt10142 * -1184748693 - method4361(1951240662);
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_49_, byte i_50_) {
		try {
			Matrix3f class222 = class_ra.method5178();
			class222.method2054(method4337());
			class222.method2064(0.0F, -10.0F, 0.0F);
			Class387 class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 131072, anInt10143 * 825822935, null, null, 0, 0, 0, 0, 1524116625));
			if (class387 != null && class387.method4787(i, i_49_, class222, true, 0))
				return true;
			if (-1 != -909380271 * anInt10150) {
				class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 131072, anInt10145 * 442323255, null, null, 0, 0, 0, 0, 1865340976));
				if (null != class387 && class387.method4787(i, i_49_, class222, true, 0))
					return true;
			}
			if (-1651799761 * anInt10146 != -1) {
				class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 131072, anInt10147 * 1271433065, null, null, 0, 0, 0, 0, 1786172187));
				if (null != class387 && class387.method4787(i, i_49_, class222, true, 0))
					return true;
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akc.bu(").append(')').toString());
		}
	}

	public int method4363(byte i) {
		try {
			return anInt10142 * -1184748693 - method4361(1951240662);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akc.bx(").append(')').toString());
		}
	}

	boolean method4353() {
		return false;
	}

	boolean method4365() {
		return false;
	}

	boolean method4374() {
		return false;
	}

	public int method4361(int i) {
		try {
			return -10;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akc.bm(").append(')').toString());
		}
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_51_) {
		Matrix3f class222 = class_ra.method5178();
		class222.method2054(method4337());
		class222.method2064(0.0F, -10.0F, 0.0F);
		Class387 class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 131072, anInt10143 * 825822935, null, null, 0, 0, 0, 0, 1941958028));
		if (class387 != null && class387.method4787(i, i_51_, class222, true, 0))
			return true;
		if (-1 != -909380271 * anInt10150) {
			class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 131072, anInt10145 * 442323255, null, null, 0, 0, 0, 0, 1793640460));
			if (null != class387 && class387.method4787(i, i_51_, class222, true, 0))
				return true;
		}
		if (-1651799761 * anInt10146 != -1) {
			class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 131072, anInt10147 * 1271433065, null, null, 0, 0, 0, 0, 1580885065));
			if (null != class387 && class387.method4787(i, i_51_, class222, true, 0))
				return true;
		}
		return false;
	}

	public int method4518() {
		return anInt10142 * -1184748693 - method4361(1951240662);
	}

	boolean method4399(byte i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akc.bf(").append(')').toString());
		}
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		return null;
	}

	void method4371(GraphicsToolkit class_ra) {
		/* empty */
	}

	void method4373(GraphicsToolkit class_ra) {
		/* empty */
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_52_) {
		Matrix3f class222 = class_ra.method5178();
		class222.method2054(method4337());
		class222.method2064(0.0F, -10.0F, 0.0F);
		Class387 class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 131072, anInt10143 * 825822935, null, null, 0, 0, 0, 0, 1821520052));
		if (class387 != null && class387.method4787(i, i_52_, class222, true, 0))
			return true;
		if (-1 != -909380271 * anInt10150) {
			class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 131072, anInt10145 * 442323255, null, null, 0, 0, 0, 0, 1489694814));
			if (null != class387 && class387.method4787(i, i_52_, class222, true, 0))
				return true;
		}
		if (-1651799761 * anInt10146 != -1) {
			class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 131072, anInt10147 * 1271433065, null, null, 0, 0, 0, 0, 1473872743));
			if (null != class387 && class387.method4787(i, i_52_, class222, true, 0))
				return true;
		}
		return false;
	}

	int method4519() {
		ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152);
		int i = class468.anInt5768 * -427528997;
		if (anInt10150 * -909380271 != -1) {
			ItemDefinitions class468_53_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271);
			if (-427528997 * class468_53_.anInt5768 > i)
				i = -427528997 * class468_53_.anInt5768;
		}
		if (-1 != -1651799761 * anInt10146) {
			ItemDefinitions class468_54_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761);
			if (-427528997 * class468_54_.anInt5768 > i)
				i = class468_54_.anInt5768 * -427528997;
		}
		return i;
	}

	int method4356(byte i) {
		try {
			ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152);
			int i_55_ = class468.anInt5768 * -427528997;
			if (anInt10150 * -909380271 != -1) {
				ItemDefinitions class468_56_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271);
				if (-427528997 * class468_56_.anInt5768 > i_55_)
					i_55_ = -427528997 * class468_56_.anInt5768;
			}
			if (-1 != -1651799761 * anInt10146) {
				ItemDefinitions class468_57_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761);
				if (-427528997 * class468_57_.anInt5768 > i_55_)
					i_55_ = class468_57_.anInt5768 * -427528997;
			}
			return i_55_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("akc.dh(").append(')').toString());
		}
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_58_) {
		Matrix3f class222 = class_ra.method5178();
		class222.method2054(method4337());
		class222.method2064(0.0F, -10.0F, 0.0F);
		Class387 class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152).method6029(class_ra, 131072, anInt10143 * 825822935, null, null, 0, 0, 0, 0, 1529040042));
		if (class387 != null && class387.method4787(i, i_58_, class222, true, 0))
			return true;
		if (-1 != -909380271 * anInt10150) {
			class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271).method6029(class_ra, 131072, anInt10145 * 442323255, null, null, 0, 0, 0, 0, 1915148901));
			if (null != class387 && class387.method4787(i, i_58_, class222, true, 0))
				return true;
		}
		if (-1651799761 * anInt10146 != -1) {
			class387 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761).method6029(class_ra, 131072, anInt10147 * 1271433065, null, null, 0, 0, 0, 0, 1728888293));
			if (null != class387 && class387.method4787(i, i_58_, class222, true, 0))
				return true;
		}
		return false;
	}

	public int method4380() {
		return -10;
	}

	public Class365_Sub1_Sub4_Sub1(Class331 class331, int i, int i_59_, int i_60_, int i_61_, int i_62_) {
		super(class331, i, i_59_, i_60_, i_61_, i_62_);
		anInt10146 = 2004197937;
		anInt10142 = 0;
		((Class365_Sub1_Sub4_Sub1) this).anInt10149 = 0;
		((Class365_Sub1_Sub4_Sub1) this).aBoolean10144 = false;
		method4362(3, -2110276499);
		method4516(-1068420966);
	}

	boolean method4369() {
		return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
	}

	boolean method4382() {
		return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
	}

	boolean method4349() {
		return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
	}

	boolean method4383() {
		return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
	}

	boolean method4351() {
		return ((Class365_Sub1_Sub4_Sub1) this).aBoolean10144;
	}

	int method4520() {
		ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152);
		int i = class468.anInt5768 * -427528997;
		if (anInt10150 * -909380271 != -1) {
			ItemDefinitions class468_63_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271);
			if (-427528997 * class468_63_.anInt5768 > i)
				i = -427528997 * class468_63_.anInt5768;
		}
		if (-1 != -1651799761 * anInt10146) {
			ItemDefinitions class468_64_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761);
			if (-427528997 * class468_64_.anInt5768 > i)
				i = class468_64_.anInt5768 * -427528997;
		}
		return i;
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		return null;
	}

	int method4521() {
		ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(-441234013 * anInt10152);
		int i = class468.anInt5768 * -427528997;
		if (anInt10150 * -909380271 != -1) {
			ItemDefinitions class468_65_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10150 * -909380271);
			if (-427528997 * class468_65_.anInt5768 > i)
				i = -427528997 * class468_65_.anInt5768;
		}
		if (-1 != -1651799761 * anInt10146) {
			ItemDefinitions class468_66_ = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(anInt10146 * -1651799761);
			if (-427528997 * class468_66_.anInt5768 > i)
				i = class468_66_.anInt5768 * -427528997;
		}
		return i;
	}
}
