/* Class282_Sub17_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub17_Sub3 extends Class282_Sub17 {
	String aString9935;
	Class348 this$0;

	void method12251(Class61 class61, int i) {
		class61.aString622 = ((Class282_Sub17_Sub3) this).aString9935;
	}

	void method12250(RsByteBuffer class282_sub35, int i) {
		((Class282_Sub17_Sub3) this).aString9935 = class282_sub35.readString();
		class282_sub35.readInt();
	}

	Class282_Sub17_Sub3(Class348 class348) {
		((Class282_Sub17_Sub3) this).this$0 = class348;
	}

	void method12257(RsByteBuffer class282_sub35) {
		((Class282_Sub17_Sub3) this).aString9935 = class282_sub35.readString();
		class282_sub35.readInt();
	}

	void method12252(Class61 class61) {
		class61.aString622 = ((Class282_Sub17_Sub3) this).aString9935;
	}

	void method12253(RsByteBuffer class282_sub35) {
		((Class282_Sub17_Sub3) this).aString9935 = class282_sub35.readString();
		class282_sub35.readInt();
	}

	void method12254(Class61 class61) {
		class61.aString622 = ((Class282_Sub17_Sub3) this).aString9935;
	}

	void method12258(Class61 class61) {
		class61.aString622 = ((Class282_Sub17_Sub3) this).aString9935;
	}

	void method12256(Class61 class61) {
		class61.aString622 = ((Class282_Sub17_Sub3) this).aString9935;
	}

	void method12249(RsByteBuffer class282_sub35) {
		((Class282_Sub17_Sub3) this).aString9935 = class282_sub35.readString();
		class282_sub35.readInt();
	}

	void method12255(Class61 class61) {
		class61.aString622 = ((Class282_Sub17_Sub3) this).aString9935;
	}

	static final void method15404(CS2Executor class527, int i) {
		class527.anInt7012 -= 567564004;
		client.aShort7276 = (short) (class527.intStack[class527.anInt7012 * 1942118537]);
		if (client.aShort7276 <= 0)
			client.aShort7276 = (short) 1;
		client.aShort7441 = (short) (class527.intStack[1942118537 * class527.anInt7012 + 1]);
		if (client.aShort7441 <= 0)
			client.aShort7441 = (short) 32767;
		else if (client.aShort7441 < client.aShort7276)
			client.aShort7441 = client.aShort7276;
		client.aShort7214 = (short) (class527.intStack[2 + 1942118537 * class527.anInt7012]);
		if (client.aShort7214 <= 0)
			client.aShort7214 = (short) 1;
		client.aShort7474 = (short) (class527.intStack[3 + class527.anInt7012 * 1942118537]);
		if (client.aShort7474 <= 0)
			client.aShort7474 = (short) 32767;
		else if (client.aShort7474 < client.aShort7214)
			client.aShort7474 = client.aShort7214;
	}

	static void method15405(int i, int i_0_, int i_1_, int i_2_, int i_3_, byte i_4_) {
		int i_5_ = 0;
		int i_6_ = i_2_;
		int i_7_ = i_1_ * i_1_;
		int i_8_ = i_2_ * i_2_;
		int i_9_ = i_8_ << 1;
		int i_10_ = i_7_ << 1;
		int i_11_ = i_2_ << 1;
		int i_12_ = i_9_ + i_7_ * (1 - i_11_);
		int i_13_ = i_8_ - (i_11_ - 1) * i_10_;
		int i_14_ = i_7_ << 2;
		int i_15_ = i_8_ << 2;
		int i_16_ = i_9_ * ((i_5_ << 1) + 3);
		int i_17_ = ((i_6_ << 1) - 3) * i_10_;
		int i_18_ = (i_5_ + 1) * i_15_;
		int i_19_ = (i_6_ - 1) * i_14_;
		if (i_0_ >= 324226563 * Class532_Sub3_Sub1.anInt7070 && i_0_ <= Class532_Sub3_Sub1.anInt7068 * -348932735) {
			int i_20_ = Class275.method4890(i + i_1_, (-612590951 * Class532_Sub3_Sub1.anInt7071), (Class532_Sub3_Sub1.anInt7069 * -1345107225), -2092614922);
			int i_21_ = Class275.method4890(i - i_1_, (-612590951 * Class532_Sub3_Sub1.anInt7071), (-1345107225 * Class532_Sub3_Sub1.anInt7069), 107584630);
			Class232.method3922(Class532_Sub3_Sub1.anIntArrayArray7072[i_0_], i_21_, i_20_, i_3_, (byte) -117);
		}
		while (i_6_ > 0) {
			if (i_12_ < 0) {
				while (i_12_ < 0) {
					i_12_ += i_16_;
					i_13_ += i_18_;
					i_16_ += i_15_;
					i_18_ += i_15_;
					i_5_++;
				}
			}
			if (i_13_ < 0) {
				i_12_ += i_16_;
				i_13_ += i_18_;
				i_16_ += i_15_;
				i_18_ += i_15_;
				i_5_++;
			}
			i_12_ += -i_19_;
			i_13_ += -i_17_;
			i_17_ -= i_14_;
			i_19_ -= i_14_;
			i_6_--;
			int i_22_ = i_0_ - i_6_;
			int i_23_ = i_6_ + i_0_;
			if (i_23_ >= 324226563 * Class532_Sub3_Sub1.anInt7070 && i_22_ <= -348932735 * Class532_Sub3_Sub1.anInt7068) {
				int i_24_ = Class275.method4890(i_5_ + i, (-612590951 * Class532_Sub3_Sub1.anInt7071), (-1345107225 * Class532_Sub3_Sub1.anInt7069), 1305925887);
				int i_25_ = Class275.method4890(i - i_5_, (Class532_Sub3_Sub1.anInt7071 * -612590951), (-1345107225 * Class532_Sub3_Sub1.anInt7069), 923847581);
				if (i_22_ >= Class532_Sub3_Sub1.anInt7070 * 324226563)
					Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_22_]), i_25_, i_24_, i_3_, (byte) 40);
				if (i_23_ <= Class532_Sub3_Sub1.anInt7068 * -348932735)
					Class232.method3922((Class532_Sub3_Sub1.anIntArrayArray7072[i_23_]), i_25_, i_24_, i_3_, (byte) 68);
			}
		}
	}
}
