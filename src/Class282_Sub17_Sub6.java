/* Class282_Sub17_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub17_Sub6 extends Class282_Sub17 {
	byte aByte10014;
	byte aByte10015;
	boolean aBool10016;
	byte aByte10017;
	byte aByte10018;
	Class348 this$0;

	@Override
	void method12253(RsByteBuffer class282_sub35) {
		this.aBool10016 = class282_sub35.readUnsignedByte() == 1;
		this.aByte10015 = class282_sub35.readByte((short) -5586);
		this.aByte10014 = class282_sub35.readByte((short) -28852);
		this.aByte10017 = class282_sub35.readByte((short) -13098);
		this.aByte10018 = class282_sub35.readByte((short) -31496);
	}

	@Override
	void method12252(Class61 class61) {
		class61.aBool624 = this.aBool10016;
		class61.aByte619 = this.aByte10015;
		class61.aByte626 = this.aByte10014;
		class61.aByte627 = this.aByte10017;
		class61.aByte628 = this.aByte10018;
	}

	@Override
	void method12251(Class61 class61, int i) {
		class61.aBool624 = this.aBool10016;
		class61.aByte619 = this.aByte10015;
		class61.aByte626 = this.aByte10014;
		class61.aByte627 = this.aByte10017;
		class61.aByte628 = this.aByte10018;
	}

	@Override
	void method12249(RsByteBuffer class282_sub35) {
		this.aBool10016 = class282_sub35.readUnsignedByte() == 1;
		this.aByte10015 = class282_sub35.readByte((short) -9718);
		this.aByte10014 = class282_sub35.readByte((short) -23829);
		this.aByte10017 = class282_sub35.readByte((short) -5385);
		this.aByte10018 = class282_sub35.readByte((short) -18225);
	}

	@Override
	void method12257(RsByteBuffer class282_sub35) {
		this.aBool10016 = class282_sub35.readUnsignedByte() == 1;
		this.aByte10015 = class282_sub35.readByte((short) -25112);
		this.aByte10014 = class282_sub35.readByte((short) -24330);
		this.aByte10017 = class282_sub35.readByte((short) -7752);
		this.aByte10018 = class282_sub35.readByte((short) -25951);
	}

	@Override
	void method12250(RsByteBuffer class282_sub35, int i) {
		this.aBool10016 = class282_sub35.readUnsignedByte() == 1;
		this.aByte10015 = class282_sub35.readByte((short) -6640);
		this.aByte10014 = class282_sub35.readByte((short) -23637);
		this.aByte10017 = class282_sub35.readByte((short) -2756);
		this.aByte10018 = class282_sub35.readByte((short) -28934);
	}

	@Override
	void method12256(Class61 class61) {
		class61.aBool624 = this.aBool10016;
		class61.aByte619 = this.aByte10015;
		class61.aByte626 = this.aByte10014;
		class61.aByte627 = this.aByte10017;
		class61.aByte628 = this.aByte10018;
	}

	@Override
	void method12258(Class61 class61) {
		class61.aBool624 = this.aBool10016;
		class61.aByte619 = this.aByte10015;
		class61.aByte626 = this.aByte10014;
		class61.aByte627 = this.aByte10017;
		class61.aByte628 = this.aByte10018;
	}

	@Override
	void method12254(Class61 class61) {
		class61.aBool624 = this.aBool10016;
		class61.aByte619 = this.aByte10015;
		class61.aByte626 = this.aByte10014;
		class61.aByte627 = this.aByte10017;
		class61.aByte628 = this.aByte10018;
	}

	Class282_Sub17_Sub6(Class348 class348) {
		this.this$0 = class348;
	}

	@Override
	void method12255(Class61 class61) {
		class61.aBool624 = this.aBool10016;
		class61.aByte619 = this.aByte10015;
		class61.aByte626 = this.aByte10014;
		class61.aByte627 = this.aByte10017;
		class61.aByte628 = this.aByte10018;
	}

	static final void method15437(Class527 class527, short i) {
		if (0 != -1741204137 * client.anInt7166 || Class203.method3360((byte) 56)) {
			class527.anIntArray6999[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		} else if (Class448.aBool5422) {
			class527.anIntArray6999[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		} else if (8133049586794585531L * Class448.aLong5425 > Class169.method2869(1849274283) - 1000L) {
			class527.anIntArray6999[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 1;
		} else {
			Class448.aBool5422 = true;
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4613, client.aClass184_7218.aClass432_2283, 1318116976);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(Class418.anInt4999 * 4249963);
			client.aClass184_7218.method3049(class282_sub23, -587637854);
			class527.anIntArray6999[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		}
	}

	static final byte[] method15438(byte[] is, byte i) {
		try {
			RsByteBuffer class282_sub35 = new RsByteBuffer(is);
			int i_0_ = class282_sub35.readUnsignedByte();
			int i_1_ = class282_sub35.readInt();
			if (i_1_ < 0 || (1020558379 * Class317.anInt3689 != 0 && i_1_ > 1020558379 * Class317.anInt3689)) {
				throw new RuntimeException();
			}
			if (0 == i_0_) {
				byte[] is_2_ = new byte[i_1_];
				class282_sub35.readBytes(is_2_, 0, i_1_, 1321336426);
				return is_2_;
			}
			int i_3_ = class282_sub35.readInt();
			if (i_3_ < 0 || (0 != Class317.anInt3689 * 1020558379 && i_3_ > 1020558379 * Class317.anInt3689)) {
				throw new RuntimeException();
			}
			byte[] is_4_ = new byte[i_3_];
			if (i_0_ == 1) {
				Class471.method7828(is_4_, i_3_, is, i_1_, 9);
			} else {
				synchronized (Class317.aClass395_3684) {
					Class317.aClass395_3684.method6767(class282_sub35, is_4_, -1958864927);
				}
			}
			return is_4_;
		} catch (Throwable e) {
			if (Loader.DISABLE_XTEA_CRASH) {
				return new byte[100];
			} else {
				throw new RuntimeException();
			}
		}
	}
}
