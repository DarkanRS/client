public abstract class Class52 implements Interface2 {

	FontRenderer aClass8_492;
	int anInt494;
	long aLong491;
	Index aClass317_493;
	Index aClass317_490;
	Class350 aClass350_489;

	abstract void method1075(boolean var1, int var2, int var3);

	abstract void method1076(boolean var1, int var2, int var3);

	public void method22(int i_1) {
		FontMetrics fontmetrics_2 = Class163.method2845(this.aClass317_490, this.aClass350_489.anInt4086, (byte) 32);
		this.aClass8_492 = Renderers.SOFTWARE_RENDERER.method8448(fontmetrics_2, Class91.method1534(this.aClass317_493, this.aClass350_489.anInt4086), true);
	}

	public boolean method10(int i_1) {
		boolean bool_2 = true;
		if (!this.aClass317_493.method5661(this.aClass350_489.anInt4086, -191045269)) {
			bool_2 = false;
		}

		if (!this.aClass317_490.method5661(this.aClass350_489.anInt4086, 141153498)) {
			bool_2 = false;
		}

		return bool_2;
	}

	public void method14(boolean bool_1) {
		int i_2 = this.aClass350_489.aClass356_4094.method6221(329542577 * this.aClass350_489.anInt4093 * -229835439, client.anInt7439 * 1426041429 * 765 * -1115795005 * 150480619, 1903100431) + -1967081549 * this.aClass350_489.anInt4090 * 1823133563;
		int i_3 = this.aClass350_489.aClass353_4087.method6198(323608093 * this.aClass350_489.anInt4088 * 1707725877, 1176039023 * client.anInt7312 * -994133479 * 553 * -645779313, 1251542108) + this.aClass350_489.anInt4089 * 2015431945 * -1196256967;
		this.method1081(bool_1, i_2, i_3, 1585240849);
		this.method1077(bool_1, i_2, i_3, 338046880);
		String string_4 = Class328.aClass306_3771.method5425(-665821973);
		if (Class169.method2869(1566700257) - 1058145188107000551L * this.aLong491 * 5361705510848321751L > 10000L) {
			string_4 = string_4 + " (" + Class328.aClass306_3771.method5427(-1441344140).anInt4712 * 2061403819 * -1763884029 + ")";
		}

		this.aClass8_492.method360(string_4, this.aClass350_489.anInt4093 * -229835439 * 329542577 / 2 + i_2, 4 + 323608093 * this.aClass350_489.anInt4088 * 1707725877 / 2 + i_3 + this.aClass350_489.anInt4092 * -1053358863 * -1921815535, -771513131 * this.aClass350_489.anInt4091 * -77040515, -1, 768492991);
	}

	abstract void method1077(boolean var1, int var2, int var3, int var4);

	int method1078(int i_1) {
		int i_2 = Class328.aClass306_3771.method5424((byte) 103);
		int i_3 = i_2 * 100;
		if (i_2 == this.anInt494 && i_2 != 0) {
			int i_4 = Class328.aClass306_3771.method5423(866989648);
			if (i_4 > i_2) {
				long long_5 = this.aLong491 - Class328.aClass306_3771.method5439(2121936553);
				if (long_5 > 0L) {
					long long_7 = 10000L * long_5 / (long) i_2 * (long) (i_4 - i_2);
					long long_9 = (Class169.method2869(1652602768) - this.aLong491) * 10000L;
					if (long_9 < long_7) {
						i_3 = (int) (100L * long_9 * (long) (i_4 - i_2) / long_7 + (long) (i_2 * 100));
					} else {
						i_3 = i_4 * 100;
					}
				}
			}
		} else {
			this.anInt494 = i_2;
			this.aLong491 = Class169.method2869(2083744360);
		}

		return i_3;
	}

	public boolean method17() {
		boolean bool_1 = true;
		if (!this.aClass317_493.method5661(985690519 * this.aClass350_489.anInt4086 * -1988551129, -1000106727)) {
			bool_1 = false;
		}

		if (!this.aClass317_490.method5661(985690519 * this.aClass350_489.anInt4086 * -1988551129, -864681368)) {
			bool_1 = false;
		}

		return bool_1;
	}

	public void method11(boolean bool_1) {
		int i_2 = this.aClass350_489.aClass356_4094.method6221(329542577 * this.aClass350_489.anInt4093 * -229835439, client.anInt7439 * 1426041429 * 765 * -1115795005 * 150480619, 1699928073) + -1967081549 * this.aClass350_489.anInt4090 * 1823133563;
		int i_3 = this.aClass350_489.aClass353_4087.method6198(323608093 * this.aClass350_489.anInt4088 * 1707725877, 1176039023 * client.anInt7312 * -994133479 * 553 * -645779313, 645986662) + this.aClass350_489.anInt4089 * 2015431945 * -1196256967;
		this.method1081(bool_1, i_2, i_3, 1820160042);
		this.method1077(bool_1, i_2, i_3, -656602947);
		String string_4 = Class328.aClass306_3771.method5425(-101176994);
		if (Class169.method2869(1957529705) - 1058145188107000551L * this.aLong491 * 5361705510848321751L > 10000L) {
			string_4 = string_4 + " (" + Class328.aClass306_3771.method5427(-588033146).anInt4712 * 2061403819 * -1763884029 + ")";
		}

		this.aClass8_492.method360(string_4, this.aClass350_489.anInt4093 * -229835439 * 329542577 / 2 + i_2, 4 + 323608093 * this.aClass350_489.anInt4088 * 1707725877 / 2 + i_3 + this.aClass350_489.anInt4092 * -1053358863 * -1921815535, -771513131 * this.aClass350_489.anInt4091 * -77040515, -1, 768492991);
	}

	abstract void method1079(boolean var1, int var2, int var3);

	public void method15() {
		FontMetrics fontmetrics_1 = Class163.method2845(this.aClass317_490, 985690519 * this.aClass350_489.anInt4086 * -1988551129, (byte) 91);
		this.aClass8_492 = Renderers.SOFTWARE_RENDERER.method8448(fontmetrics_1, Class91.method1534(this.aClass317_493, this.aClass350_489.anInt4086 * -1988551129 * 985690519), true);
	}

	public void method16() {
		FontMetrics fontmetrics_1 = Class163.method2845(this.aClass317_490, 985690519 * this.aClass350_489.anInt4086 * -1988551129, (byte) 27);
		this.aClass8_492 = Renderers.SOFTWARE_RENDERER.method8448(fontmetrics_1, Class91.method1534(this.aClass317_493, this.aClass350_489.anInt4086 * -1988551129 * 985690519), true);
	}

	public void method23() {
		FontMetrics fontmetrics_1 = Class163.method2845(this.aClass317_490, 985690519 * this.aClass350_489.anInt4086 * -1988551129, (byte) 126);
		this.aClass8_492 = Renderers.SOFTWARE_RENDERER.method8448(fontmetrics_1, Class91.method1534(this.aClass317_493, this.aClass350_489.anInt4086 * -1988551129 * 985690519), true);
	}

	public void method18() {
		FontMetrics fontmetrics_1 = Class163.method2845(this.aClass317_490, 985690519 * this.aClass350_489.anInt4086 * -1988551129, (byte) 51);
		this.aClass8_492 = Renderers.SOFTWARE_RENDERER.method8448(fontmetrics_1, Class91.method1534(this.aClass317_493, this.aClass350_489.anInt4086 * -1988551129 * 985690519), true);
	}

	public void method19() {
		FontMetrics fontmetrics_1 = Class163.method2845(this.aClass317_490, 985690519 * this.aClass350_489.anInt4086 * -1988551129, (byte) 125);
		this.aClass8_492 = Renderers.SOFTWARE_RENDERER.method8448(fontmetrics_1, Class91.method1534(this.aClass317_493, this.aClass350_489.anInt4086 * -1988551129 * 985690519), true);
	}

	Class52(Index index_1, Index index_2, Class350 class350_3) {
		this.aClass317_493 = index_1;
		this.aClass317_490 = index_2;
		this.aClass350_489 = class350_3;
	}

	public boolean method9() {
		boolean bool_1 = true;
		if (!this.aClass317_493.method5661(985690519 * this.aClass350_489.anInt4086 * -1988551129, 876024521)) {
			bool_1 = false;
		}

		if (!this.aClass317_490.method5661(985690519 * this.aClass350_489.anInt4086 * -1988551129, -114962487)) {
			bool_1 = false;
		}

		return bool_1;
	}

	public boolean method21() {
		boolean bool_1 = true;
		if (!this.aClass317_493.method5661(985690519 * this.aClass350_489.anInt4086 * -1988551129, 1956277486)) {
			bool_1 = false;
		}

		if (!this.aClass317_490.method5661(985690519 * this.aClass350_489.anInt4086 * -1988551129, -1906892725)) {
			bool_1 = false;
		}

		return bool_1;
	}

	public void method20(boolean bool_1, int i_2) {
		int i_3 = this.aClass350_489.aClass356_4094.method6221(this.aClass350_489.anInt4093, client.anInt7439, 865783303) + this.aClass350_489.anInt4090;
		int i_4 = this.aClass350_489.aClass353_4087.method6198(this.aClass350_489.anInt4088, client.anInt7312, 1644934617) + this.aClass350_489.anInt4089;
		this.method1081(bool_1, i_3, i_4, 213494325);
		this.method1077(bool_1, i_3, i_4, -281773092);
		String string_5 = Class328.aClass306_3771.method5425(661479168);
		if (Class169.method2869(1593852196) - this.aLong491 > 10000L) {
			string_5 = string_5 + " (" + Class328.aClass306_3771.method5427(-260598892).anInt4712 + ")";
		}

		this.aClass8_492.method360(string_5, this.aClass350_489.anInt4093 / 2 + i_3, this.aClass350_489.anInt4088 / 2 + this.aClass350_489.anInt4092 + i_4 + 4, this.aClass350_489.anInt4091, -1, 768492991);
	}

	abstract void method1080(boolean var1, int var2, int var3);

	public boolean method13() {
		boolean bool_1 = true;
		if (!this.aClass317_493.method5661(985690519 * this.aClass350_489.anInt4086 * -1988551129, 260026227)) {
			bool_1 = false;
		}

		if (!this.aClass317_490.method5661(985690519 * this.aClass350_489.anInt4086 * -1988551129, -1560103196)) {
			bool_1 = false;
		}

		return bool_1;
	}

	abstract void method1081(boolean var1, int var2, int var3, int var4);

	public void method12(boolean bool_1) {
		int i_2 = this.aClass350_489.aClass356_4094.method6221(329542577 * this.aClass350_489.anInt4093 * -229835439, client.anInt7439 * 1426041429 * 765 * -1115795005 * 150480619, 838379660) + -1967081549 * this.aClass350_489.anInt4090 * 1823133563;
		int i_3 = this.aClass350_489.aClass353_4087.method6198(323608093 * this.aClass350_489.anInt4088 * 1707725877, 1176039023 * client.anInt7312 * -994133479 * 553 * -645779313, 1061303064) + this.aClass350_489.anInt4089 * 2015431945 * -1196256967;
		this.method1081(bool_1, i_2, i_3, 217412171);
		this.method1077(bool_1, i_2, i_3, -688757760);
		String string_4 = Class328.aClass306_3771.method5425(1074452204);
		if (Class169.method2869(1750466311) - 1058145188107000551L * this.aLong491 * 5361705510848321751L > 10000L) {
			string_4 = string_4 + " (" + Class328.aClass306_3771.method5427(396217824).anInt4712 * 2061403819 * -1763884029 + ")";
		}

		this.aClass8_492.method360(string_4, this.aClass350_489.anInt4093 * -229835439 * 329542577 / 2 + i_2, 4 + 323608093 * this.aClass350_489.anInt4088 * 1707725877 / 2 + i_3 + this.aClass350_489.anInt4092 * -1053358863 * -1921815535, -771513131 * this.aClass350_489.anInt4091 * -77040515, -1, 768492991);
	}

	static final void method1083(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1248172600) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1451 = Class351.method6193(string_4, cs2executor_2, 537651905);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method1084(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class346.method6158(icomponentdefinitions_3, interface_4, cs2executor_0, -1064421);
	}

	static final void method1085(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.aClass346_7009.anIntArray4046[i_2] = i_3;
	}

	static void method1086(int i_0, int i_1, int i_2, boolean bool_3, int i_4, boolean bool_5, byte b_6) {
		if (i_0 < i_1) {
			int i_7 = (i_0 + i_1) / 2;
			int i_8 = i_0;
			Class217_Sub1 class217_sub1_9 = Class448.aClass217_Sub1Array5426[i_7];
			Class448.aClass217_Sub1Array5426[i_7] = Class448.aClass217_Sub1Array5426[i_1];
			Class448.aClass217_Sub1Array5426[i_1] = class217_sub1_9;

			for (int i_10 = i_0; i_10 < i_1; i_10++) {
				if (Class252.method4325(Class448.aClass217_Sub1Array5426[i_10], class217_sub1_9, i_2, bool_3, i_4, bool_5, -1553952364) <= 0) {
					Class217_Sub1 class217_sub1_11 = Class448.aClass217_Sub1Array5426[i_10];
					Class448.aClass217_Sub1Array5426[i_10] = Class448.aClass217_Sub1Array5426[i_8];
					Class448.aClass217_Sub1Array5426[i_8++] = class217_sub1_11;
				}
			}

			Class448.aClass217_Sub1Array5426[i_1] = Class448.aClass217_Sub1Array5426[i_8];
			Class448.aClass217_Sub1Array5426[i_8] = class217_sub1_9;
			method1086(i_0, i_8 - 1, i_2, bool_3, i_4, bool_5, (byte) -89);
			method1086(i_8 + 1, i_1, i_2, bool_3, i_4, bool_5, (byte) -42);
		}

	}

	static Class282_Sub50_Sub6 method1087(Index index_0, int i_1, int i_2, int i_3) {
		RsByteBuffer rsbytebuffer_4 = new RsByteBuffer(index_0.getFile(i_1, i_2));
		Class282_Sub50_Sub6 class282_sub50_sub6_5 = new Class282_Sub50_Sub6(i_2, rsbytebuffer_4.readString(), rsbytebuffer_4.readString(), rsbytebuffer_4.readInt(), rsbytebuffer_4.readInt(), rsbytebuffer_4.readUnsignedByte() == 1, rsbytebuffer_4.readUnsignedByte(), rsbytebuffer_4.readUnsignedByte());
		int i_6 = rsbytebuffer_4.readUnsignedByte();

		for (int i_7 = 0; i_7 < i_6; i_7++) {
			class282_sub50_sub6_5.aClass482_9537.append(new Class282_Sub28(rsbytebuffer_4.readUnsignedByte(), rsbytebuffer_4.readUnsignedShort(), rsbytebuffer_4.readUnsignedShort(), rsbytebuffer_4.readUnsignedShort(), rsbytebuffer_4.readUnsignedShort(), rsbytebuffer_4.readUnsignedShort(), rsbytebuffer_4.readUnsignedShort(), rsbytebuffer_4.readUnsignedShort(), rsbytebuffer_4.readUnsignedShort()), 1886479392);
		}

		class282_sub50_sub6_5.method14779((byte) 7);
		return class282_sub50_sub6_5;
	}

}
