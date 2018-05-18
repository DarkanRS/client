/* Class282_Sub54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub54 extends Node {
	public Class468_Sub4 aClass468_Sub4_8187;
	static final int anInt8188 = 23;
	public static final int anInt8189 = 245;
	public static final int anInt8190 = 500;
	Game aClass486_8191;
	public Class468_Sub6 aClass468_Sub6_8192;
	public Class468_Sub13 aClass468_Sub13_8193;
	public Class468_Sub30 aClass468_Sub30_8194;
	public Class468_Sub12 aClass468_Sub12_8195;
	Class463 aClass463_8196;
	public Class468_Sub1 aClass468_Sub1_8197;
	public Class468_Sub16 aClass468_Sub16_8198;
	public Class468_Sub3 aClass468_Sub3_8199;
	public Class468_Sub17 aClass468_Sub17_8200;
	public Class468_Sub29 aClass468_Sub29_8201;
	public Class468_Sub23 aClass468_Sub23_8202;
	public Class468_Sub15 aClass468_Sub15_8203;
	public Class468_Sub19 aClass468_Sub19_8204;
	public Class468_Sub2 aClass468_Sub2_8205;
	public Class468_Sub25 aClass468_Sub25_8206;
	public Class468_Sub20 aClass468_Sub20_8207;
	public Class468_Sub27 aClass468_Sub27_8208;
	public Class468_Sub27 aClass468_Sub27_8209;
	public Class468_Sub7 aClass468_Sub7_8210;
	public Class468_Sub14 aClass468_Sub14_8211;
	public Class468_Sub28 aClass468_Sub28_8212;
	public Class468_Sub22 aClass468_Sub22_8213;
	public Class468_Sub18 aClass468_Sub18_8214;
	public Class468_Sub10 aClass468_Sub10_8215;
	public Class468_Sub24 aClass468_Sub24_8216;
	public Class468_Sub11 aClass468_Sub11_8217;
	public Class468_Sub9 aClass468_Sub9_8218;
	public Class468_Sub8 aClass468_Sub8_8219;
	static final int anInt8220 = 27;
	public Class468_Sub5 aClass468_Sub5_8221;
	public Class468_Sub21 aClass468_Sub21_8222;
	public Class468_Sub4 aClass468_Sub4_8223;
	public Class468_Sub26 aClass468_Sub26_8224;
	public Class468_Sub13 aClass468_Sub13_8225;
	public Class468_Sub9 aClass468_Sub9_8226;
	public Class468_Sub13 aClass468_Sub13_8227;
	public Class468_Sub13 aClass468_Sub13_8228;
	public Class468_Sub13 aClass468_Sub13_8229;
	public Class468_Sub18 aClass468_Sub18_8230;
	static final int anInt8231 = 40;

	void method13495(RsByteBuffer class282_sub35) {
		if (null == class282_sub35 || null == class282_sub35.buffer)
			method13497(true, 1017159501);
		else {
			int i = class282_sub35.readUnsignedByte();
			if (i < 23) {
				try {
					method13498(class282_sub35, i, 870969532);
				} catch (Exception exception) {
					method13497(true, 1257016535);
				}
				method13497(false, -296633257);
			} else if (i > 27)
				method13497(true, -1467905190);
			else {
				aClass468_Sub4_8187 = new Class468_Sub4(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub4_8223 = new Class468_Sub4(aClass468_Sub4_8187.method12641(975843902), this);
				aClass468_Sub12_8195 = new Class468_Sub12(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub21_8222 = new Class468_Sub21(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub1_8197 = new Class468_Sub1(class282_sub35.readUnsignedByte(), this);
				if (i >= 27)
					aClass468_Sub16_8198 = new Class468_Sub16(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub26_8224 = new Class468_Sub26(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub30_8194 = new Class468_Sub30(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub17_8200 = new Class468_Sub17(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub23_8202 = new Class468_Sub23(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub15_8203 = new Class468_Sub15(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub19_8204 = new Class468_Sub19(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub2_8205 = new Class468_Sub2(class282_sub35.readUnsignedByte(), this);
				if (i >= 24)
					aClass468_Sub29_8201 = new Class468_Sub29(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub20_8207 = new Class468_Sub20(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub27_8208 = new Class468_Sub27(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub27_8209 = new Class468_Sub27(aClass468_Sub27_8208.method12952((byte) 118), this);
				aClass468_Sub7_8210 = new Class468_Sub7(class282_sub35.readUnsignedByte(), this);
				if (i >= 25)
					aClass468_Sub14_8211 = new Class468_Sub14(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub28_8212 = new Class468_Sub28(class282_sub35.readUnsignedByte(), this);
				if (i <= 25)
					class282_sub35.index += -1115476867;
				aClass468_Sub22_8213 = new Class468_Sub22(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub18_8214 = new Class468_Sub18(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub18_8230 = new Class468_Sub18(aClass468_Sub18_8214.method12776(841694442), this);
				class282_sub35.readUnsignedByte();
				aClass468_Sub24_8216 = new Class468_Sub24(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub9_8226 = new Class468_Sub9(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub9_8218 = new Class468_Sub9(aClass468_Sub9_8226.method12687(-468992039), this);
				aClass468_Sub8_8219 = new Class468_Sub8(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub6_8192 = new Class468_Sub6(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub5_8221 = new Class468_Sub5(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub11_8217 = new Class468_Sub11(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub25_8206 = new Class468_Sub25(class282_sub35.readUnsignedByte(), this);
				if (i >= 26)
					aClass468_Sub3_8199 = new Class468_Sub3(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8225 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8193 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8227 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8228 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8229 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub10_8215 = new Class468_Sub10(class282_sub35.readUnsignedByte(), this);
				method13497(false, -813197599);
			}
		}
		method13502(-1736305082);
	}

	public Class282_Sub54(RsByteBuffer class282_sub35, Game class486, int i) {
		((Class282_Sub54) this).aClass486_8191 = class486;
		((Class282_Sub54) this).aClass463_8196 = new Class463(-1346844585 * Class263.anInt3273, Class263.anInt3277 * -1290103735, Class402.aString4828.indexOf("arm") != -1);
		aClass468_Sub18_8230 = new Class468_Sub18(i, this);
		method13496(class282_sub35, (short) -14853);
	}

	void method13496(RsByteBuffer class282_sub35, short i) {
		if (null == class282_sub35 || null == class282_sub35.buffer)
			method13497(true, -1548642338);
		else {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (i_0_ < 23) {
				try {
					method13498(class282_sub35, i_0_, 1555660216);
				} catch (Exception exception) {
					method13497(true, 612084272);
				}
				method13497(false, -226219565);
			} else if (i_0_ > 27)
				method13497(true, 2054281814);
			else {
				aClass468_Sub4_8187 = new Class468_Sub4(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub4_8223 = new Class468_Sub4(aClass468_Sub4_8187.method12641(-1510157435), this);
				aClass468_Sub12_8195 = new Class468_Sub12(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub21_8222 = new Class468_Sub21(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub1_8197 = new Class468_Sub1(class282_sub35.readUnsignedByte(), this);
				if (i_0_ >= 27)
					aClass468_Sub16_8198 = new Class468_Sub16(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub26_8224 = new Class468_Sub26(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub30_8194 = new Class468_Sub30(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub17_8200 = new Class468_Sub17(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub23_8202 = new Class468_Sub23(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub15_8203 = new Class468_Sub15(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub19_8204 = new Class468_Sub19(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub2_8205 = new Class468_Sub2(class282_sub35.readUnsignedByte(), this);
				if (i_0_ >= 24)
					aClass468_Sub29_8201 = new Class468_Sub29(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub20_8207 = new Class468_Sub20(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub27_8208 = new Class468_Sub27(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub27_8209 = new Class468_Sub27(aClass468_Sub27_8208.method12952((byte) 37), this);
				aClass468_Sub7_8210 = new Class468_Sub7(class282_sub35.readUnsignedByte(), this);
				if (i_0_ >= 25)
					aClass468_Sub14_8211 = new Class468_Sub14(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub28_8212 = new Class468_Sub28(class282_sub35.readUnsignedByte(), this);
				if (i_0_ <= 25)
					class282_sub35.index += -1115476867;
				aClass468_Sub22_8213 = new Class468_Sub22(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub18_8214 = new Class468_Sub18(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub18_8230 = new Class468_Sub18(aClass468_Sub18_8214.method12776(-958077547), this);
				class282_sub35.readUnsignedByte();
				aClass468_Sub24_8216 = new Class468_Sub24(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub9_8226 = new Class468_Sub9(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub9_8218 = new Class468_Sub9(aClass468_Sub9_8226.method12687(-1215691938), this);
				aClass468_Sub8_8219 = new Class468_Sub8(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub6_8192 = new Class468_Sub6(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub5_8221 = new Class468_Sub5(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub11_8217 = new Class468_Sub11(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub25_8206 = new Class468_Sub25(class282_sub35.readUnsignedByte(), this);
				if (i_0_ >= 26)
					aClass468_Sub3_8199 = new Class468_Sub3(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8225 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8193 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8227 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8228 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8229 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub10_8215 = new Class468_Sub10(class282_sub35.readUnsignedByte(), this);
				method13497(false, -23246823);
			}
		}
		method13502(-1736305082);
	}

	void method13497(boolean bool, int i) {
		if (bool || aClass468_Sub4_8187 == null)
			aClass468_Sub4_8187 = new Class468_Sub4(this);
		if (bool || aClass468_Sub4_8223 == null)
			aClass468_Sub4_8223 = new Class468_Sub4(aClass468_Sub4_8187.method12641(2142983368), this);
		if (bool || null == aClass468_Sub12_8195)
			aClass468_Sub12_8195 = new Class468_Sub12(this);
		if (bool || null == aClass468_Sub21_8222)
			aClass468_Sub21_8222 = new Class468_Sub21(this);
		if (bool || null == aClass468_Sub1_8197)
			aClass468_Sub1_8197 = new Class468_Sub1(this);
		if (bool || aClass468_Sub16_8198 == null)
			aClass468_Sub16_8198 = new Class468_Sub16(this);
		if (bool || null == aClass468_Sub26_8224)
			aClass468_Sub26_8224 = new Class468_Sub26(this);
		if (bool || null == aClass468_Sub30_8194)
			aClass468_Sub30_8194 = new Class468_Sub30(this);
		if (bool || aClass468_Sub17_8200 == null)
			aClass468_Sub17_8200 = new Class468_Sub17(this);
		if (bool || null == aClass468_Sub23_8202)
			aClass468_Sub23_8202 = new Class468_Sub23(this);
		if (bool || aClass468_Sub15_8203 == null)
			aClass468_Sub15_8203 = new Class468_Sub15(this);
		if (bool || aClass468_Sub19_8204 == null)
			aClass468_Sub19_8204 = new Class468_Sub19(this);
		if (bool || aClass468_Sub2_8205 == null)
			aClass468_Sub2_8205 = new Class468_Sub2(this);
		if (bool || null == aClass468_Sub29_8201)
			aClass468_Sub29_8201 = new Class468_Sub29(this);
		if (bool || aClass468_Sub20_8207 == null)
			aClass468_Sub20_8207 = new Class468_Sub20(this);
		if (bool || aClass468_Sub27_8208 == null)
			aClass468_Sub27_8208 = new Class468_Sub27(this);
		if (bool || null == aClass468_Sub27_8209)
			aClass468_Sub27_8209 = new Class468_Sub27(aClass468_Sub27_8208.method12952((byte) 96), this);
		if (bool || aClass468_Sub7_8210 == null)
			aClass468_Sub7_8210 = new Class468_Sub7(this);
		if (bool || aClass468_Sub14_8211 == null)
			aClass468_Sub14_8211 = new Class468_Sub14(this);
		if (bool || null == aClass468_Sub28_8212)
			aClass468_Sub28_8212 = new Class468_Sub28(this);
		if (bool || aClass468_Sub22_8213 == null)
			aClass468_Sub22_8213 = new Class468_Sub22(this);
		if (bool || aClass468_Sub18_8214 == null)
			aClass468_Sub18_8214 = new Class468_Sub18(this);
		if (bool || null == aClass468_Sub18_8230)
			aClass468_Sub18_8230 = new Class468_Sub18(aClass468_Sub18_8214.method12776(-1125192103), this);
		if (bool || null == aClass468_Sub24_8216)
			aClass468_Sub24_8216 = new Class468_Sub24(this);
		if (bool || aClass468_Sub9_8226 == null)
			aClass468_Sub9_8226 = new Class468_Sub9(this);
		if (bool || aClass468_Sub9_8218 == null)
			aClass468_Sub9_8218 = new Class468_Sub9(aClass468_Sub9_8226.method12687(-1865727854), this);
		if (bool || null == aClass468_Sub8_8219)
			aClass468_Sub8_8219 = new Class468_Sub8(this);
		if (bool || aClass468_Sub6_8192 == null)
			aClass468_Sub6_8192 = new Class468_Sub6(this);
		if (bool || aClass468_Sub5_8221 == null)
			aClass468_Sub5_8221 = new Class468_Sub5(this);
		if (bool || aClass468_Sub11_8217 == null)
			aClass468_Sub11_8217 = new Class468_Sub11(this);
		if (bool || null == aClass468_Sub25_8206)
			aClass468_Sub25_8206 = new Class468_Sub25(this);
		if (bool || aClass468_Sub3_8199 == null)
			aClass468_Sub3_8199 = new Class468_Sub3(this);
		if (bool || aClass468_Sub13_8225 == null)
			aClass468_Sub13_8225 = new Class468_Sub13(this);
		if (bool || aClass468_Sub13_8193 == null)
			aClass468_Sub13_8193 = new Class468_Sub13(this);
		if (bool || aClass468_Sub13_8227 == null)
			aClass468_Sub13_8227 = new Class468_Sub13(this);
		if (bool || null == aClass468_Sub13_8228)
			aClass468_Sub13_8228 = new Class468_Sub13(this);
		if (bool || aClass468_Sub13_8229 == null)
			aClass468_Sub13_8229 = new Class468_Sub13(this);
		if (bool || null == aClass468_Sub10_8215)
			aClass468_Sub10_8215 = new Class468_Sub10(this);
	}

	void method13498(RsByteBuffer class282_sub35, int i, int i_1_) {
		aClass468_Sub21_8222 = new Class468_Sub21(class282_sub35.readUnsignedByte(), this);
		class282_sub35.index += -1115476867;
		aClass468_Sub27_8208 = new Class468_Sub27(class282_sub35.readUnsignedByte() + 1, this);
		aClass468_Sub23_8202 = new Class468_Sub23(class282_sub35.readUnsignedByte(), this);
		class282_sub35.index += -1115476867;
		aClass468_Sub15_8203 = new Class468_Sub15(class282_sub35.readUnsignedByte(), this);
		aClass468_Sub26_8224 = new Class468_Sub26(class282_sub35.readUnsignedByte(), this);
		class282_sub35.readUnsignedByte();
		aClass468_Sub28_8212 = new Class468_Sub28(class282_sub35.readUnsignedByte(), this);
		int i_2_ = class282_sub35.readUnsignedByte();
		int i_3_ = 0;
		if (i >= 17)
			i_3_ = class282_sub35.readUnsignedByte();
		aClass468_Sub2_8205 = new Class468_Sub2(i_2_ > i_3_ ? i_2_ : i_3_, this);
		boolean bool = true;
		boolean bool_4_ = true;
		if (i >= 2) {
			bool = class282_sub35.readUnsignedByte() == 1;
			if (i >= 17)
				bool_4_ = class282_sub35.readUnsignedByte() == 1;
		} else {
			bool = class282_sub35.readUnsignedByte() == 1;
			class282_sub35.readUnsignedByte();
		}
		aClass468_Sub19_8204 = new Class468_Sub19(bool | bool_4_ ? 1 : 0, this);
		aClass468_Sub24_8216 = new Class468_Sub24(class282_sub35.readUnsignedByte(), this);
		aClass468_Sub30_8194 = new Class468_Sub30(class282_sub35.readUnsignedByte(), this);
		aClass468_Sub4_8187 = new Class468_Sub4(class282_sub35.readUnsignedByte(), this);
		aClass468_Sub10_8215 = new Class468_Sub10(class282_sub35.readUnsignedByte(), this);
		aClass468_Sub13_8225 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
		if (i >= 20)
			aClass468_Sub13_8227 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
		else
			aClass468_Sub13_8227 = new Class468_Sub13(aClass468_Sub13_8225.method12714(1536477085), this);
		aClass468_Sub13_8228 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
		aClass468_Sub13_8193 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
		if (i >= 21)
			aClass468_Sub13_8229 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
		else
			aClass468_Sub13_8229 = new Class468_Sub13(aClass468_Sub13_8228.method12714(1602734923), this);
		if (i >= 1) {
			class282_sub35.readUnsignedShort();
			class282_sub35.readUnsignedShort();
		}
		if (i >= 3 && i < 6)
			class282_sub35.readUnsignedByte();
		if (i >= 4)
			aClass468_Sub20_8207 = new Class468_Sub20(class282_sub35.readUnsignedByte(), this);
		class282_sub35.readInt();
		if (i >= 6)
			aClass468_Sub9_8226 = new Class468_Sub9(class282_sub35.readUnsignedByte(), this);
		if (i >= 7)
			aClass468_Sub25_8206 = new Class468_Sub25(class282_sub35.readUnsignedByte(), this);
		if (i >= 8)
			class282_sub35.readUnsignedByte();
		if (i >= 9)
			aClass468_Sub1_8197 = new Class468_Sub1(class282_sub35.readUnsignedByte(), this);
		if (i >= 10)
			aClass468_Sub12_8195 = new Class468_Sub12(class282_sub35.readUnsignedByte(), this);
		if (i >= 11)
			aClass468_Sub8_8219 = new Class468_Sub8(class282_sub35.readUnsignedByte(), this);
		if (i >= 12)
			aClass468_Sub15_8203 = new Class468_Sub15(class282_sub35.readUnsignedByte(), this);
		if (i >= 13)
			aClass468_Sub17_8200 = new Class468_Sub17(class282_sub35.readUnsignedByte(), this);
		if (i >= 14)
			aClass468_Sub18_8214 = new Class468_Sub18(class282_sub35.readUnsignedByte(), this);
		if (i >= 15)
			aClass468_Sub5_8221 = new Class468_Sub5(class282_sub35.readUnsignedByte(), this);
		if (i >= 16)
			aClass468_Sub22_8213 = new Class468_Sub22(class282_sub35.readUnsignedByte(), this);
		if (i >= 18)
			aClass468_Sub6_8192 = new Class468_Sub6(class282_sub35.readUnsignedByte(), this);
		if (i >= 19)
			aClass468_Sub7_8210 = new Class468_Sub7(class282_sub35.readUnsignedByte(), this);
		if (i >= 22)
			aClass468_Sub11_8217 = new Class468_Sub11(class282_sub35.readUnsignedByte(), this);
	}

	public RsByteBuffer method13499(int i) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(40);
		class282_sub35.writeByte(27);
		class282_sub35.writeByte(aClass468_Sub4_8187.method12641(1497480561));
		class282_sub35.writeByte(aClass468_Sub12_8195.method12706((byte) 95));
		class282_sub35.writeByte(aClass468_Sub21_8222.method12865(475375870));
		class282_sub35.writeByte(aClass468_Sub1_8197.method12615(-462784918));
		class282_sub35.writeByte(aClass468_Sub16_8198.method12750((byte) 32));
		class282_sub35.writeByte(aClass468_Sub26_8224.method12943(975799184));
		class282_sub35.writeByte(aClass468_Sub30_8194.method13417(-1899817216));
		class282_sub35.writeByte(aClass468_Sub17_8200.method12762(-140573));
		class282_sub35.writeByte(aClass468_Sub23_8202.method12897((byte) 75));
		class282_sub35.writeByte(aClass468_Sub15_8203.method12739(-118386335));
		class282_sub35.writeByte(aClass468_Sub19_8204.method12786(-399420695));
		class282_sub35.writeByte(aClass468_Sub2_8205.method12624((byte) -37));
		class282_sub35.writeByte(aClass468_Sub29_8201.method13050(519629067));
		class282_sub35.writeByte(aClass468_Sub20_8207.method12794(1270958764));
		class282_sub35.writeByte(aClass468_Sub27_8208.method12952((byte) 121));
		class282_sub35.writeByte(aClass468_Sub7_8210.method12666(141061966));
		class282_sub35.writeByte(aClass468_Sub14_8211.method12728(-1912429644));
		class282_sub35.writeByte(aClass468_Sub28_8212.method12966((byte) -41));
		class282_sub35.writeByte(aClass468_Sub22_8213.method12873(2145197376));
		class282_sub35.writeByte(aClass468_Sub18_8214.method12776(-120460114));
		class282_sub35.writeByte(0);
		class282_sub35.writeByte(aClass468_Sub24_8216.method12920(1244153925));
		class282_sub35.writeByte(aClass468_Sub9_8226.method12687(416506379));
		class282_sub35.writeByte(aClass468_Sub8_8219.method12675(-1589433086));
		class282_sub35.writeByte(aClass468_Sub6_8192.method12654(-239553097));
		class282_sub35.writeByte(aClass468_Sub5_8221.method12651(1040968302));
		class282_sub35.writeByte(aClass468_Sub11_8217.method12699((byte) -71));
		class282_sub35.writeByte(aClass468_Sub25_8206.method12926((byte) -54));
		class282_sub35.writeByte(aClass468_Sub3_8199.method12632(793302253));
		class282_sub35.writeByte(aClass468_Sub13_8225.method12714(1537092634));
		class282_sub35.writeByte(aClass468_Sub13_8193.method12714(-2033162521));
		class282_sub35.writeByte(aClass468_Sub13_8227.method12714(-1613359935));
		class282_sub35.writeByte(aClass468_Sub13_8228.method12714(-416727286));
		class282_sub35.writeByte(aClass468_Sub13_8229.method12714(1813865542));
		class282_sub35.writeByte(aClass468_Sub10_8215.method12691(-1240240085));
		return class282_sub35;
	}

	void method13500(boolean bool) {
		if (bool || aClass468_Sub4_8187 == null)
			aClass468_Sub4_8187 = new Class468_Sub4(this);
		if (bool || aClass468_Sub4_8223 == null)
			aClass468_Sub4_8223 = new Class468_Sub4(aClass468_Sub4_8187.method12641(-658927599), this);
		if (bool || null == aClass468_Sub12_8195)
			aClass468_Sub12_8195 = new Class468_Sub12(this);
		if (bool || null == aClass468_Sub21_8222)
			aClass468_Sub21_8222 = new Class468_Sub21(this);
		if (bool || null == aClass468_Sub1_8197)
			aClass468_Sub1_8197 = new Class468_Sub1(this);
		if (bool || aClass468_Sub16_8198 == null)
			aClass468_Sub16_8198 = new Class468_Sub16(this);
		if (bool || null == aClass468_Sub26_8224)
			aClass468_Sub26_8224 = new Class468_Sub26(this);
		if (bool || null == aClass468_Sub30_8194)
			aClass468_Sub30_8194 = new Class468_Sub30(this);
		if (bool || aClass468_Sub17_8200 == null)
			aClass468_Sub17_8200 = new Class468_Sub17(this);
		if (bool || null == aClass468_Sub23_8202)
			aClass468_Sub23_8202 = new Class468_Sub23(this);
		if (bool || aClass468_Sub15_8203 == null)
			aClass468_Sub15_8203 = new Class468_Sub15(this);
		if (bool || aClass468_Sub19_8204 == null)
			aClass468_Sub19_8204 = new Class468_Sub19(this);
		if (bool || aClass468_Sub2_8205 == null)
			aClass468_Sub2_8205 = new Class468_Sub2(this);
		if (bool || null == aClass468_Sub29_8201)
			aClass468_Sub29_8201 = new Class468_Sub29(this);
		if (bool || aClass468_Sub20_8207 == null)
			aClass468_Sub20_8207 = new Class468_Sub20(this);
		if (bool || aClass468_Sub27_8208 == null)
			aClass468_Sub27_8208 = new Class468_Sub27(this);
		if (bool || null == aClass468_Sub27_8209)
			aClass468_Sub27_8209 = new Class468_Sub27(aClass468_Sub27_8208.method12952((byte) 105), this);
		if (bool || aClass468_Sub7_8210 == null)
			aClass468_Sub7_8210 = new Class468_Sub7(this);
		if (bool || aClass468_Sub14_8211 == null)
			aClass468_Sub14_8211 = new Class468_Sub14(this);
		if (bool || null == aClass468_Sub28_8212)
			aClass468_Sub28_8212 = new Class468_Sub28(this);
		if (bool || aClass468_Sub22_8213 == null)
			aClass468_Sub22_8213 = new Class468_Sub22(this);
		if (bool || aClass468_Sub18_8214 == null)
			aClass468_Sub18_8214 = new Class468_Sub18(this);
		if (bool || null == aClass468_Sub18_8230)
			aClass468_Sub18_8230 = new Class468_Sub18(aClass468_Sub18_8214.method12776(1401670312), this);
		if (bool || null == aClass468_Sub24_8216)
			aClass468_Sub24_8216 = new Class468_Sub24(this);
		if (bool || aClass468_Sub9_8226 == null)
			aClass468_Sub9_8226 = new Class468_Sub9(this);
		if (bool || aClass468_Sub9_8218 == null)
			aClass468_Sub9_8218 = new Class468_Sub9(aClass468_Sub9_8226.method12687(-366933587), this);
		if (bool || null == aClass468_Sub8_8219)
			aClass468_Sub8_8219 = new Class468_Sub8(this);
		if (bool || aClass468_Sub6_8192 == null)
			aClass468_Sub6_8192 = new Class468_Sub6(this);
		if (bool || aClass468_Sub5_8221 == null)
			aClass468_Sub5_8221 = new Class468_Sub5(this);
		if (bool || aClass468_Sub11_8217 == null)
			aClass468_Sub11_8217 = new Class468_Sub11(this);
		if (bool || null == aClass468_Sub25_8206)
			aClass468_Sub25_8206 = new Class468_Sub25(this);
		if (bool || aClass468_Sub3_8199 == null)
			aClass468_Sub3_8199 = new Class468_Sub3(this);
		if (bool || aClass468_Sub13_8225 == null)
			aClass468_Sub13_8225 = new Class468_Sub13(this);
		if (bool || aClass468_Sub13_8193 == null)
			aClass468_Sub13_8193 = new Class468_Sub13(this);
		if (bool || aClass468_Sub13_8227 == null)
			aClass468_Sub13_8227 = new Class468_Sub13(this);
		if (bool || null == aClass468_Sub13_8228)
			aClass468_Sub13_8228 = new Class468_Sub13(this);
		if (bool || aClass468_Sub13_8229 == null)
			aClass468_Sub13_8229 = new Class468_Sub13(this);
		if (bool || null == aClass468_Sub10_8215)
			aClass468_Sub10_8215 = new Class468_Sub10(this);
	}

	public Class463 method13501() {
		return ((Class282_Sub54) this).aClass463_8196;
	}

	void method13502(int i) {
		aClass468_Sub4_8187.method12639((byte) -35);
		aClass468_Sub4_8223.method12639((byte) -23);
		aClass468_Sub12_8195.method12703(-2130049176);
		aClass468_Sub21_8222.method12861(-833257877);
		aClass468_Sub1_8197.method12616((byte) 16);
		aClass468_Sub16_8198.method12749(-1385034853);
		aClass468_Sub26_8224.method12941((byte) -58);
		aClass468_Sub30_8194.method13415((byte) -26);
		aClass468_Sub17_8200.method12767((byte) 6);
		aClass468_Sub23_8202.method12898((byte) 34);
		aClass468_Sub15_8203.method12741(130294314);
		aClass468_Sub19_8204.method12785(1216614107);
		aClass468_Sub2_8205.method12627((byte) -59);
		aClass468_Sub29_8201.method13048(-2117218391);
		aClass468_Sub20_8207.method12793(1354281667);
		aClass468_Sub27_8208.method12950(1301389562);
		aClass468_Sub27_8209.method12950(221369371);
		aClass468_Sub7_8210.method12663(-911909604);
		aClass468_Sub14_8211.method12725(-1401423341);
		aClass468_Sub28_8212.method12959(-922946523);
		aClass468_Sub22_8213.method12871((byte) -2);
		aClass468_Sub18_8214.method12773(-132030593);
		aClass468_Sub18_8230.method12773(-1630198990);
		aClass468_Sub24_8216.method12918((short) 22655);
		aClass468_Sub9_8226.method12684((byte) -10);
		aClass468_Sub9_8218.method12684((byte) 105);
		aClass468_Sub8_8219.method12674(-956855309);
		aClass468_Sub6_8192.method12653(-1781190291);
		aClass468_Sub5_8221.method12648(2102747953);
		aClass468_Sub11_8217.method12698((byte) -36);
		aClass468_Sub25_8206.method12928((byte) 32);
		aClass468_Sub3_8199.method12631(-1642104120);
		aClass468_Sub13_8225.method12712((byte) 114);
		aClass468_Sub13_8193.method12712((byte) 41);
		aClass468_Sub13_8227.method12712((byte) 85);
		aClass468_Sub13_8228.method12712((byte) 78);
		aClass468_Sub13_8229.method12712((byte) 16);
		aClass468_Sub10_8215.method12692(2077923945);
	}

	public void method13503(Class468_Sub18 class468_sub18, boolean bool) {
		class468_sub18.method12783(bool, (byte) 0);
		method13502(-1736305082);
	}

	public Class463 method13504(byte i) {
		return ((Class282_Sub54) this).aClass463_8196;
	}

	public void method13505(Class468_Sub18 class468_sub18, boolean bool, int i) {
		class468_sub18.method12783(bool, (byte) 0);
		method13502(-1736305082);
	}

	public Class282_Sub54(Game class486, int i) {
		((Class282_Sub54) this).aClass486_8191 = class486;
		((Class282_Sub54) this).aClass463_8196 = new Class463(Class263.anInt3273 * -1346844585, -1290103735 * Class263.anInt3277, (Class402.aString4828.toLowerCase().indexOf("arm") != -1));
		aClass468_Sub18_8230 = new Class468_Sub18(i, this);
		method13497(true, 311350524);
	}

	void method13506(boolean bool) {
		if (bool || aClass468_Sub4_8187 == null)
			aClass468_Sub4_8187 = new Class468_Sub4(this);
		if (bool || aClass468_Sub4_8223 == null)
			aClass468_Sub4_8223 = new Class468_Sub4(aClass468_Sub4_8187.method12641(2074023466), this);
		if (bool || null == aClass468_Sub12_8195)
			aClass468_Sub12_8195 = new Class468_Sub12(this);
		if (bool || null == aClass468_Sub21_8222)
			aClass468_Sub21_8222 = new Class468_Sub21(this);
		if (bool || null == aClass468_Sub1_8197)
			aClass468_Sub1_8197 = new Class468_Sub1(this);
		if (bool || aClass468_Sub16_8198 == null)
			aClass468_Sub16_8198 = new Class468_Sub16(this);
		if (bool || null == aClass468_Sub26_8224)
			aClass468_Sub26_8224 = new Class468_Sub26(this);
		if (bool || null == aClass468_Sub30_8194)
			aClass468_Sub30_8194 = new Class468_Sub30(this);
		if (bool || aClass468_Sub17_8200 == null)
			aClass468_Sub17_8200 = new Class468_Sub17(this);
		if (bool || null == aClass468_Sub23_8202)
			aClass468_Sub23_8202 = new Class468_Sub23(this);
		if (bool || aClass468_Sub15_8203 == null)
			aClass468_Sub15_8203 = new Class468_Sub15(this);
		if (bool || aClass468_Sub19_8204 == null)
			aClass468_Sub19_8204 = new Class468_Sub19(this);
		if (bool || aClass468_Sub2_8205 == null)
			aClass468_Sub2_8205 = new Class468_Sub2(this);
		if (bool || null == aClass468_Sub29_8201)
			aClass468_Sub29_8201 = new Class468_Sub29(this);
		if (bool || aClass468_Sub20_8207 == null)
			aClass468_Sub20_8207 = new Class468_Sub20(this);
		if (bool || aClass468_Sub27_8208 == null)
			aClass468_Sub27_8208 = new Class468_Sub27(this);
		if (bool || null == aClass468_Sub27_8209)
			aClass468_Sub27_8209 = new Class468_Sub27(aClass468_Sub27_8208.method12952((byte) 69), this);
		if (bool || aClass468_Sub7_8210 == null)
			aClass468_Sub7_8210 = new Class468_Sub7(this);
		if (bool || aClass468_Sub14_8211 == null)
			aClass468_Sub14_8211 = new Class468_Sub14(this);
		if (bool || null == aClass468_Sub28_8212)
			aClass468_Sub28_8212 = new Class468_Sub28(this);
		if (bool || aClass468_Sub22_8213 == null)
			aClass468_Sub22_8213 = new Class468_Sub22(this);
		if (bool || aClass468_Sub18_8214 == null)
			aClass468_Sub18_8214 = new Class468_Sub18(this);
		if (bool || null == aClass468_Sub18_8230)
			aClass468_Sub18_8230 = new Class468_Sub18(aClass468_Sub18_8214.method12776(836638749), this);
		if (bool || null == aClass468_Sub24_8216)
			aClass468_Sub24_8216 = new Class468_Sub24(this);
		if (bool || aClass468_Sub9_8226 == null)
			aClass468_Sub9_8226 = new Class468_Sub9(this);
		if (bool || aClass468_Sub9_8218 == null)
			aClass468_Sub9_8218 = new Class468_Sub9(aClass468_Sub9_8226.method12687(125257182), this);
		if (bool || null == aClass468_Sub8_8219)
			aClass468_Sub8_8219 = new Class468_Sub8(this);
		if (bool || aClass468_Sub6_8192 == null)
			aClass468_Sub6_8192 = new Class468_Sub6(this);
		if (bool || aClass468_Sub5_8221 == null)
			aClass468_Sub5_8221 = new Class468_Sub5(this);
		if (bool || aClass468_Sub11_8217 == null)
			aClass468_Sub11_8217 = new Class468_Sub11(this);
		if (bool || null == aClass468_Sub25_8206)
			aClass468_Sub25_8206 = new Class468_Sub25(this);
		if (bool || aClass468_Sub3_8199 == null)
			aClass468_Sub3_8199 = new Class468_Sub3(this);
		if (bool || aClass468_Sub13_8225 == null)
			aClass468_Sub13_8225 = new Class468_Sub13(this);
		if (bool || aClass468_Sub13_8193 == null)
			aClass468_Sub13_8193 = new Class468_Sub13(this);
		if (bool || aClass468_Sub13_8227 == null)
			aClass468_Sub13_8227 = new Class468_Sub13(this);
		if (bool || null == aClass468_Sub13_8228)
			aClass468_Sub13_8228 = new Class468_Sub13(this);
		if (bool || aClass468_Sub13_8229 == null)
			aClass468_Sub13_8229 = new Class468_Sub13(this);
		if (bool || null == aClass468_Sub10_8215)
			aClass468_Sub10_8215 = new Class468_Sub10(this);
	}

	public Game method13507() {
		return ((Class282_Sub54) this).aClass486_8191;
	}

	public RsByteBuffer method13508() {
		RsByteBuffer class282_sub35 = new RsByteBuffer(40);
		class282_sub35.writeByte(27);
		class282_sub35.writeByte(aClass468_Sub4_8187.method12641(-761307574));
		class282_sub35.writeByte(aClass468_Sub12_8195.method12706((byte) 46));
		class282_sub35.writeByte(aClass468_Sub21_8222.method12865(475375870));
		class282_sub35.writeByte(aClass468_Sub1_8197.method12615(88750076));
		class282_sub35.writeByte(aClass468_Sub16_8198.method12750((byte) 32));
		class282_sub35.writeByte(aClass468_Sub26_8224.method12943(1810160164));
		class282_sub35.writeByte(aClass468_Sub30_8194.method13417(-2120135179));
		class282_sub35.writeByte(aClass468_Sub17_8200.method12762(977879737));
		class282_sub35.writeByte(aClass468_Sub23_8202.method12897((byte) 39));
		class282_sub35.writeByte(aClass468_Sub15_8203.method12739(-118386335));
		class282_sub35.writeByte(aClass468_Sub19_8204.method12786(-399420695));
		class282_sub35.writeByte(aClass468_Sub2_8205.method12624((byte) -112));
		class282_sub35.writeByte(aClass468_Sub29_8201.method13050(519629067));
		class282_sub35.writeByte(aClass468_Sub20_8207.method12794(2127550747));
		class282_sub35.writeByte(aClass468_Sub27_8208.method12952((byte) 11));
		class282_sub35.writeByte(aClass468_Sub7_8210.method12666(87318669));
		class282_sub35.writeByte(aClass468_Sub14_8211.method12728(-1912429644));
		class282_sub35.writeByte(aClass468_Sub28_8212.method12966((byte) -18));
		class282_sub35.writeByte(aClass468_Sub22_8213.method12873(-953728728));
		class282_sub35.writeByte(aClass468_Sub18_8214.method12776(-2127134028));
		class282_sub35.writeByte(0);
		class282_sub35.writeByte(aClass468_Sub24_8216.method12920(1043857565));
		class282_sub35.writeByte(aClass468_Sub9_8226.method12687(344663776));
		class282_sub35.writeByte(aClass468_Sub8_8219.method12675(-1589433086));
		class282_sub35.writeByte(aClass468_Sub6_8192.method12654(-239553097));
		class282_sub35.writeByte(aClass468_Sub5_8221.method12651(-586986253));
		class282_sub35.writeByte(aClass468_Sub11_8217.method12699((byte) -69));
		class282_sub35.writeByte(aClass468_Sub25_8206.method12926((byte) -55));
		class282_sub35.writeByte(aClass468_Sub3_8199.method12632(149576209));
		class282_sub35.writeByte(aClass468_Sub13_8225.method12714(-1083156437));
		class282_sub35.writeByte(aClass468_Sub13_8193.method12714(283556495));
		class282_sub35.writeByte(aClass468_Sub13_8227.method12714(-1911670304));
		class282_sub35.writeByte(aClass468_Sub13_8228.method12714(351499970));
		class282_sub35.writeByte(aClass468_Sub13_8229.method12714(-1752144027));
		class282_sub35.writeByte(aClass468_Sub10_8215.method12691(-2133200483));
		return class282_sub35;
	}

	public void method13509(Class468 class468, int i) {
		class468.method7782(i, (byte) 61);
		method13502(-1736305082);
	}

	public void method13510(Class468_Sub18 class468_sub18, boolean bool) {
		class468_sub18.method12783(bool, (byte) 0);
		method13502(-1736305082);
	}

	public void method13511(Class468 class468, int i, int i_5_) {
		class468.method7782(i, (byte) 120);
		method13502(-1736305082);
	}

	void method13512() {
		aClass468_Sub4_8187.method12639((byte) 34);
		aClass468_Sub4_8223.method12639((byte) -30);
		aClass468_Sub12_8195.method12703(-2040073380);
		aClass468_Sub21_8222.method12861(-2007114696);
		aClass468_Sub1_8197.method12616((byte) 72);
		aClass468_Sub16_8198.method12749(-1856319222);
		aClass468_Sub26_8224.method12941((byte) -93);
		aClass468_Sub30_8194.method13415((byte) -98);
		aClass468_Sub17_8200.method12767((byte) 6);
		aClass468_Sub23_8202.method12898((byte) -40);
		aClass468_Sub15_8203.method12741(602282317);
		aClass468_Sub19_8204.method12785(1438488611);
		aClass468_Sub2_8205.method12627((byte) -28);
		aClass468_Sub29_8201.method13048(-2131289264);
		aClass468_Sub20_8207.method12793(1466266379);
		aClass468_Sub27_8208.method12950(1683257217);
		aClass468_Sub27_8209.method12950(2042777601);
		aClass468_Sub7_8210.method12663(-1685118385);
		aClass468_Sub14_8211.method12725(-1309638990);
		aClass468_Sub28_8212.method12959(-1698036478);
		aClass468_Sub22_8213.method12871((byte) -103);
		aClass468_Sub18_8214.method12773(1861618942);
		aClass468_Sub18_8230.method12773(86143552);
		aClass468_Sub24_8216.method12918((short) 1380);
		aClass468_Sub9_8226.method12684((byte) 23);
		aClass468_Sub9_8218.method12684((byte) 5);
		aClass468_Sub8_8219.method12674(1991045947);
		aClass468_Sub6_8192.method12653(588315714);
		aClass468_Sub5_8221.method12648(-125453130);
		aClass468_Sub11_8217.method12698((byte) -102);
		aClass468_Sub25_8206.method12928((byte) 105);
		aClass468_Sub3_8199.method12631(-368375186);
		aClass468_Sub13_8225.method12712((byte) 95);
		aClass468_Sub13_8193.method12712((byte) 82);
		aClass468_Sub13_8227.method12712((byte) 41);
		aClass468_Sub13_8228.method12712((byte) 84);
		aClass468_Sub13_8229.method12712((byte) 101);
		aClass468_Sub10_8215.method12692(2058305861);
	}

	void method13513() {
		aClass468_Sub4_8187.method12639((byte) -5);
		aClass468_Sub4_8223.method12639((byte) -54);
		aClass468_Sub12_8195.method12703(-2107729579);
		aClass468_Sub21_8222.method12861(1663036924);
		aClass468_Sub1_8197.method12616((byte) 38);
		aClass468_Sub16_8198.method12749(-1389571295);
		aClass468_Sub26_8224.method12941((byte) -43);
		aClass468_Sub30_8194.method13415((byte) 17);
		aClass468_Sub17_8200.method12767((byte) 6);
		aClass468_Sub23_8202.method12898((byte) -38);
		aClass468_Sub15_8203.method12741(271465828);
		aClass468_Sub19_8204.method12785(575029506);
		aClass468_Sub2_8205.method12627((byte) -116);
		aClass468_Sub29_8201.method13048(-2130179806);
		aClass468_Sub20_8207.method12793(-1058893247);
		aClass468_Sub27_8208.method12950(1019646300);
		aClass468_Sub27_8209.method12950(1495995817);
		aClass468_Sub7_8210.method12663(-1894827720);
		aClass468_Sub14_8211.method12725(-1525465361);
		aClass468_Sub28_8212.method12959(-1274283790);
		aClass468_Sub22_8213.method12871((byte) -76);
		aClass468_Sub18_8214.method12773(-1575969489);
		aClass468_Sub18_8230.method12773(1858141731);
		aClass468_Sub24_8216.method12918((short) 25868);
		aClass468_Sub9_8226.method12684((byte) 38);
		aClass468_Sub9_8218.method12684((byte) -37);
		aClass468_Sub8_8219.method12674(171112544);
		aClass468_Sub6_8192.method12653(-944615578);
		aClass468_Sub5_8221.method12648(1982228397);
		aClass468_Sub11_8217.method12698((byte) -74);
		aClass468_Sub25_8206.method12928((byte) 59);
		aClass468_Sub3_8199.method12631(69205011);
		aClass468_Sub13_8225.method12712((byte) 72);
		aClass468_Sub13_8193.method12712((byte) 116);
		aClass468_Sub13_8227.method12712((byte) 103);
		aClass468_Sub13_8228.method12712((byte) 64);
		aClass468_Sub13_8229.method12712((byte) 13);
		aClass468_Sub10_8215.method12692(2102384761);
	}

	public Game method13514(byte i) {
		return ((Class282_Sub54) this).aClass486_8191;
	}

	public Class463 method13515() {
		return ((Class282_Sub54) this).aClass463_8196;
	}

	public Class463 method13516() {
		return ((Class282_Sub54) this).aClass463_8196;
	}

	public Class463 method13517() {
		return ((Class282_Sub54) this).aClass463_8196;
	}

	void method13518(RsByteBuffer class282_sub35) {
		if (null == class282_sub35 || null == class282_sub35.buffer)
			method13497(true, -77849246);
		else {
			int i = class282_sub35.readUnsignedByte();
			if (i < 23) {
				try {
					method13498(class282_sub35, i, 831712586);
				} catch (Exception exception) {
					method13497(true, -143520684);
				}
				method13497(false, 313668983);
			} else if (i > 27)
				method13497(true, -515320601);
			else {
				aClass468_Sub4_8187 = new Class468_Sub4(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub4_8223 = new Class468_Sub4(aClass468_Sub4_8187.method12641(128374153), this);
				aClass468_Sub12_8195 = new Class468_Sub12(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub21_8222 = new Class468_Sub21(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub1_8197 = new Class468_Sub1(class282_sub35.readUnsignedByte(), this);
				if (i >= 27)
					aClass468_Sub16_8198 = new Class468_Sub16(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub26_8224 = new Class468_Sub26(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub30_8194 = new Class468_Sub30(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub17_8200 = new Class468_Sub17(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub23_8202 = new Class468_Sub23(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub15_8203 = new Class468_Sub15(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub19_8204 = new Class468_Sub19(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub2_8205 = new Class468_Sub2(class282_sub35.readUnsignedByte(), this);
				if (i >= 24)
					aClass468_Sub29_8201 = new Class468_Sub29(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub20_8207 = new Class468_Sub20(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub27_8208 = new Class468_Sub27(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub27_8209 = new Class468_Sub27(aClass468_Sub27_8208.method12952((byte) 127), this);
				aClass468_Sub7_8210 = new Class468_Sub7(class282_sub35.readUnsignedByte(), this);
				if (i >= 25)
					aClass468_Sub14_8211 = new Class468_Sub14(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub28_8212 = new Class468_Sub28(class282_sub35.readUnsignedByte(), this);
				if (i <= 25)
					class282_sub35.index += -1115476867;
				aClass468_Sub22_8213 = new Class468_Sub22(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub18_8214 = new Class468_Sub18(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub18_8230 = new Class468_Sub18(aClass468_Sub18_8214.method12776(-711072893), this);
				class282_sub35.readUnsignedByte();
				aClass468_Sub24_8216 = new Class468_Sub24(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub9_8226 = new Class468_Sub9(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub9_8218 = new Class468_Sub9(aClass468_Sub9_8226.method12687(-734543345), this);
				aClass468_Sub8_8219 = new Class468_Sub8(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub6_8192 = new Class468_Sub6(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub5_8221 = new Class468_Sub5(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub11_8217 = new Class468_Sub11(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub25_8206 = new Class468_Sub25(class282_sub35.readUnsignedByte(), this);
				if (i >= 26)
					aClass468_Sub3_8199 = new Class468_Sub3(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8225 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8193 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8227 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8228 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub13_8229 = new Class468_Sub13(class282_sub35.readUnsignedByte(), this);
				aClass468_Sub10_8215 = new Class468_Sub10(class282_sub35.readUnsignedByte(), this);
				method13497(false, 1147045425);
			}
		}
		method13502(-1736305082);
	}
}
