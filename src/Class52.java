/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class52 implements Interface2 {
	Class350 aClass350_489;
	Index aClass317_490;
	long aLong491;
	FontRenderer aClass8_492;
	Index aClass317_493;
	int anInt494;

	abstract void method1075(boolean bool, int i, int i_0_);

	abstract void method1076(boolean bool, int i, int i_1_);

	public void method22(int i) {
		Class414 class414 = Class163.method2845(((Class52) this).aClass317_490, (985690519 * ((Class52) this).aClass350_489.anInt4086), (byte) 32);
		((Class52) this).aClass8_492 = (Renderers.SOFTWARE_RENDERER.method8448(class414, Class91.method1534(((Class52) this).aClass317_493, (((Class52) this).aClass350_489.anInt4086 * 985690519)), true));
	}

	public boolean method10(int i) {
		boolean bool = true;
		if (!((Class52) this).aClass317_493.method5661((985690519 * (((Class52) this).aClass350_489.anInt4086)), -191045269))
			bool = false;
		if (!((Class52) this).aClass317_490.method5661((985690519 * (((Class52) this).aClass350_489.anInt4086)), 141153498))
			bool = false;
		return bool;
	}

	public void method14(boolean bool) {
		int i = ((((Class52) this).aClass350_489.aClass356_4094.method6221(329542577 * ((Class52) this).aClass350_489.anInt4093, client.anInt7439 * 150480619, 1903100431)) + -1967081549 * ((Class52) this).aClass350_489.anInt4090);
		int i_2_ = ((((Class52) this).aClass350_489.aClass353_4087.method6198(323608093 * ((Class52) this).aClass350_489.anInt4088, 1176039023 * client.anInt7312, 1251542108)) + ((Class52) this).aClass350_489.anInt4089 * -1196256967);
		method1081(bool, i, i_2_, 1585240849);
		method1077(bool, i, i_2_, 338046880);
		String string = Class328.aClass306_3771.method5425(-665821973);
		if ((Class169.method2869(1566700257) - 1058145188107000551L * ((Class52) this).aLong491) > 10000L)
			string = new StringBuilder().append(string).append(" (").append((Class328.aClass306_3771.method5427(-1441344140).anInt4712) * -1763884029).append(")").toString();
		((Class52) this).aClass8_492.method360(string, ((Class52) this).aClass350_489.anInt4093 * 329542577 / 2 + i, (4 + (323608093 * ((Class52) this).aClass350_489.anInt4088 / 2 + i_2_) + ((Class52) this).aClass350_489.anInt4092 * -1921815535), -771513131 * ((Class52) this).aClass350_489.anInt4091, -1, 768492991);
	}

	abstract void method1077(boolean bool, int i, int i_3_, int i_4_);

	int method1078(int i) {
		int i_5_ = Class328.aClass306_3771.method5424((byte) 103);
		int i_6_ = 100 * i_5_;
		if (i_5_ == 1718200223 * ((Class52) this).anInt494 && 0 != i_5_) {
			int i_7_ = Class328.aClass306_3771.method5423(866989648);
			if (i_7_ > i_5_) {
				long l = (((Class52) this).aLong491 * 1058145188107000551L - Class328.aClass306_3771.method5439(2121936553));
				if (l > 0L) {
					long l_8_ = 10000L * l / (long) i_5_ * (long) (i_7_ - i_5_);
					long l_9_ = ((Class169.method2869(1652602768) - 1058145188107000551L * ((Class52) this).aLong491) * 10000L);
					if (l_9_ < l_8_)
						i_6_ = (int) ((100L * (l_9_ * (long) (i_7_ - i_5_)) / l_8_) + (long) (100 * i_5_));
					else
						i_6_ = 100 * i_7_;
				}
			}
		} else {
			((Class52) this).anInt494 = i_5_ * 816952415;
			((Class52) this).aLong491 = Class169.method2869(2083744360) * 5361705510848321751L;
		}
		return i_6_;
	}

	public boolean method17() {
		boolean bool = true;
		if (!((Class52) this).aClass317_493.method5661((985690519 * (((Class52) this).aClass350_489.anInt4086)), -1000106727))
			bool = false;
		if (!((Class52) this).aClass317_490.method5661((985690519 * (((Class52) this).aClass350_489.anInt4086)), -864681368))
			bool = false;
		return bool;
	}

	public void method11(boolean bool) {
		int i = ((((Class52) this).aClass350_489.aClass356_4094.method6221(329542577 * ((Class52) this).aClass350_489.anInt4093, client.anInt7439 * 150480619, 1699928073)) + -1967081549 * ((Class52) this).aClass350_489.anInt4090);
		int i_10_ = ((((Class52) this).aClass350_489.aClass353_4087.method6198(323608093 * ((Class52) this).aClass350_489.anInt4088, 1176039023 * client.anInt7312, 645986662)) + ((Class52) this).aClass350_489.anInt4089 * -1196256967);
		method1081(bool, i, i_10_, 1820160042);
		method1077(bool, i, i_10_, -656602947);
		String string = Class328.aClass306_3771.method5425(-101176994);
		if ((Class169.method2869(1957529705) - 1058145188107000551L * ((Class52) this).aLong491) > 10000L)
			string = new StringBuilder().append(string).append(" (").append(Class328.aClass306_3771.method5427(-588033146).anInt4712 * -1763884029).append(")").toString();
		((Class52) this).aClass8_492.method360(string, ((Class52) this).aClass350_489.anInt4093 * 329542577 / 2 + i, (4 + (323608093 * ((Class52) this).aClass350_489.anInt4088 / 2 + i_10_) + ((Class52) this).aClass350_489.anInt4092 * -1921815535), -771513131 * ((Class52) this).aClass350_489.anInt4091, -1, 768492991);
	}

	abstract void method1079(boolean bool, int i, int i_11_);

	public void method15() {
		Class414 class414 = Class163.method2845(((Class52) this).aClass317_490, (985690519 * ((Class52) this).aClass350_489.anInt4086), (byte) 91);
		((Class52) this).aClass8_492 = (Renderers.SOFTWARE_RENDERER.method8448(class414, Class91.method1534(((Class52) this).aClass317_493, (((Class52) this).aClass350_489.anInt4086 * 985690519)), true));
	}

	public void method16() {
		Class414 class414 = Class163.method2845(((Class52) this).aClass317_490, (985690519 * ((Class52) this).aClass350_489.anInt4086), (byte) 27);
		((Class52) this).aClass8_492 = (Renderers.SOFTWARE_RENDERER.method8448(class414, Class91.method1534(((Class52) this).aClass317_493, (((Class52) this).aClass350_489.anInt4086 * 985690519)), true));
	}

	public void method23() {
		Class414 class414 = Class163.method2845(((Class52) this).aClass317_490, (985690519 * ((Class52) this).aClass350_489.anInt4086), (byte) 126);
		((Class52) this).aClass8_492 = (Renderers.SOFTWARE_RENDERER.method8448(class414, Class91.method1534(((Class52) this).aClass317_493, (((Class52) this).aClass350_489.anInt4086 * 985690519)), true));
	}

	public void method18() {
		Class414 class414 = Class163.method2845(((Class52) this).aClass317_490, (985690519 * ((Class52) this).aClass350_489.anInt4086), (byte) 51);
		((Class52) this).aClass8_492 = (Renderers.SOFTWARE_RENDERER.method8448(class414, Class91.method1534(((Class52) this).aClass317_493, (((Class52) this).aClass350_489.anInt4086 * 985690519)), true));
	}

	public void method19() {
		Class414 class414 = Class163.method2845(((Class52) this).aClass317_490, (985690519 * ((Class52) this).aClass350_489.anInt4086), (byte) 125);
		((Class52) this).aClass8_492 = (Renderers.SOFTWARE_RENDERER.method8448(class414, Class91.method1534(((Class52) this).aClass317_493, (((Class52) this).aClass350_489.anInt4086 * 985690519)), true));
	}

	Class52(Index class317, Index class317_12_, Class350 class350) {
		((Class52) this).aClass317_493 = class317;
		((Class52) this).aClass317_490 = class317_12_;
		((Class52) this).aClass350_489 = class350;
	}

	public boolean method9() {
		boolean bool = true;
		if (!((Class52) this).aClass317_493.method5661((985690519 * (((Class52) this).aClass350_489.anInt4086)), 876024521))
			bool = false;
		if (!((Class52) this).aClass317_490.method5661((985690519 * (((Class52) this).aClass350_489.anInt4086)), -114962487))
			bool = false;
		return bool;
	}

	public boolean method21() {
		boolean bool = true;
		if (!((Class52) this).aClass317_493.method5661((985690519 * (((Class52) this).aClass350_489.anInt4086)), 1956277486))
			bool = false;
		if (!((Class52) this).aClass317_490.method5661((985690519 * (((Class52) this).aClass350_489.anInt4086)), -1906892725))
			bool = false;
		return bool;
	}

	public void method20(boolean bool, int i) {
		int i_13_ = ((((Class52) this).aClass350_489.aClass356_4094.method6221(329542577 * ((Class52) this).aClass350_489.anInt4093, client.anInt7439 * 150480619, 865783303)) + -1967081549 * ((Class52) this).aClass350_489.anInt4090);
		int i_14_ = ((((Class52) this).aClass350_489.aClass353_4087.method6198(323608093 * ((Class52) this).aClass350_489.anInt4088, 1176039023 * client.anInt7312, 1644934617)) + ((Class52) this).aClass350_489.anInt4089 * -1196256967);
		method1081(bool, i_13_, i_14_, 213494325);
		method1077(bool, i_13_, i_14_, -281773092);
		String string = Class328.aClass306_3771.method5425(661479168);
		if ((Class169.method2869(1593852196) - 1058145188107000551L * ((Class52) this).aLong491) > 10000L)
			string = new StringBuilder().append(string).append(" (").append(Class328.aClass306_3771.method5427(-260598892).anInt4712 * -1763884029).append(")").toString();
		((Class52) this).aClass8_492.method360(string, ((Class52) this).aClass350_489.anInt4093 * 329542577 / 2 + i_13_, (4 + (323608093 * ((Class52) this).aClass350_489.anInt4088 / 2 + i_14_) + ((Class52) this).aClass350_489.anInt4092 * -1921815535), -771513131 * ((Class52) this).aClass350_489.anInt4091, -1, 768492991);
	}

	abstract void method1080(boolean bool, int i, int i_15_);

	public boolean method13() {
		boolean bool = true;
		if (!((Class52) this).aClass317_493.method5661((985690519 * (((Class52) this).aClass350_489.anInt4086)), 260026227))
			bool = false;
		if (!((Class52) this).aClass317_490.method5661((985690519 * (((Class52) this).aClass350_489.anInt4086)), -1560103196))
			bool = false;
		return bool;
	}

	abstract void method1081(boolean bool, int i, int i_16_, int i_17_);

	public void method12(boolean bool) {
		int i = ((((Class52) this).aClass350_489.aClass356_4094.method6221(329542577 * ((Class52) this).aClass350_489.anInt4093, client.anInt7439 * 150480619, 838379660)) + -1967081549 * ((Class52) this).aClass350_489.anInt4090);
		int i_18_ = ((((Class52) this).aClass350_489.aClass353_4087.method6198(323608093 * ((Class52) this).aClass350_489.anInt4088, 1176039023 * client.anInt7312, 1061303064)) + ((Class52) this).aClass350_489.anInt4089 * -1196256967);
		method1081(bool, i, i_18_, 217412171);
		method1077(bool, i, i_18_, -688757760);
		String string = Class328.aClass306_3771.method5425(1074452204);
		if ((Class169.method2869(1750466311) - 1058145188107000551L * ((Class52) this).aLong491) > 10000L)
			string = new StringBuilder().append(string).append(" (").append(Class328.aClass306_3771.method5427(396217824).anInt4712 * -1763884029).append(")").toString();
		((Class52) this).aClass8_492.method360(string, ((Class52) this).aClass350_489.anInt4093 * 329542577 / 2 + i, (4 + (323608093 * ((Class52) this).aClass350_489.anInt4088 / 2 + i_18_) + ((Class52) this).aClass350_489.anInt4092 * -1921815535), -771513131 * ((Class52) this).aClass350_489.anInt4091, -1, 768492991);
	}

	int method1082() {
		int i = Class328.aClass306_3771.method5424((byte) 89);
		int i_19_ = 100 * i;
		if (i == 1718200223 * ((Class52) this).anInt494 && 0 != i) {
			int i_20_ = Class328.aClass306_3771.method5423(-1958540159);
			if (i_20_ > i) {
				long l = (((Class52) this).aLong491 * 1058145188107000551L - Class328.aClass306_3771.method5439(1449273228));
				if (l > 0L) {
					long l_21_ = 10000L * l / (long) i * (long) (i_20_ - i);
					long l_22_ = ((Class169.method2869(1873851729) - 1058145188107000551L * ((Class52) this).aLong491) * 10000L);
					if (l_22_ < l_21_)
						i_19_ = (int) ((100L * (l_22_ * (long) (i_20_ - i)) / l_21_) + (long) (100 * i));
					else
						i_19_ = 100 * i_20_;
				}
			}
		} else {
			((Class52) this).anInt494 = i * 816952415;
			((Class52) this).aLong491 = Class169.method2869(1626177492) * 5361705510848321751L;
		}
		return i_19_;
	}

	static final void method1083(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1248172600) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1451 = Class351.method6193(string, class527, 537651905);
		class118.aBool1384 = true;
	}

	static final void method1084(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class346.method6158(class118, class98, class527, -1064421);
	}

	static final void method1085(CS2Executor class527, byte i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_23_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_24_ = (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		((CS2Executor) class527).aClass346_7009.anIntArray4046[i_23_] = i_24_;
	}

	static void method1086(int i, int i_25_, int i_26_, boolean bool, int i_27_, boolean bool_28_, byte i_29_) {
		if (i < i_25_) {
			int i_30_ = (i_25_ + i) / 2;
			int i_31_ = i;
			Class217_Sub1 class217_sub1 = Class448.aClass217_Sub1Array5426[i_30_];
			Class448.aClass217_Sub1Array5426[i_30_] = Class448.aClass217_Sub1Array5426[i_25_];
			Class448.aClass217_Sub1Array5426[i_25_] = class217_sub1;
			for (int i_32_ = i; i_32_ < i_25_; i_32_++) {
				if (Class252.method4325((Class448.aClass217_Sub1Array5426[i_32_]), class217_sub1, i_26_, bool, i_27_, bool_28_, -1553952364) <= 0) {
					Class217_Sub1 class217_sub1_33_ = Class448.aClass217_Sub1Array5426[i_32_];
					Class448.aClass217_Sub1Array5426[i_32_] = Class448.aClass217_Sub1Array5426[i_31_];
					Class448.aClass217_Sub1Array5426[i_31_++] = class217_sub1_33_;
				}
			}
			Class448.aClass217_Sub1Array5426[i_25_] = Class448.aClass217_Sub1Array5426[i_31_];
			Class448.aClass217_Sub1Array5426[i_31_] = class217_sub1;
			method1086(i, i_31_ - 1, i_26_, bool, i_27_, bool_28_, (byte) -89);
			method1086(i_31_ + 1, i_25_, i_26_, bool, i_27_, bool_28_, (byte) -42);
		}
	}

	static Class282_Sub50_Sub6 method1087(Index class317, int i, int i_34_, int i_35_) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(class317.getFile(i, i_34_, -1701555254));
		Class282_Sub50_Sub6 class282_sub50_sub6 = new Class282_Sub50_Sub6(i_34_, class282_sub35.readString(-392505636), class282_sub35.readString(846172936), class282_sub35.readInt(), class282_sub35.readInt(), (class282_sub35.readUnsignedByte() == 1), class282_sub35.readUnsignedByte(), class282_sub35.readUnsignedByte());
		int i_36_ = class282_sub35.readUnsignedByte();
		for (int i_37_ = 0; i_37_ < i_36_; i_37_++)
			((Class282_Sub50_Sub6) class282_sub50_sub6).aClass482_9537.append(new Class282_Sub28(class282_sub35.readUnsignedByte(), class282_sub35.readUnsignedShort(), class282_sub35.readUnsignedShort(), class282_sub35.readUnsignedShort(), class282_sub35.readUnsignedShort(), class282_sub35.readUnsignedShort(), class282_sub35.readUnsignedShort(), class282_sub35.readUnsignedShort(), class282_sub35.readUnsignedShort()), 1886479392);
		class282_sub50_sub6.method14779((byte) 7);
		return class282_sub50_sub6;
	}
}
