/* Class481 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class481 {
	public int anInt5718;
	public int anInt5719;
	public int anInt5720;
	public boolean aBool5721;
	public boolean aBool5722;
	int anInt5723 = 0;
	public int anInt5724;
	public int anInt5725;
	public int anInt5726;

	void method8047(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			((Class481) this).anInt5723 = class282_sub35.read24BitUnsignedInteger((short) 23860) * 1504179655;
			method8048(((Class481) this).anInt5723 * -129287177, 876511716);
		} else if (2 == i) {
			anInt5719 = class282_sub35.readUnsignedShort() * 1470638369;
			if (anInt5719 * -1346987295 == 65535)
				anInt5719 = -1470638369;
		} else if (3 == i)
			anInt5720 = (class282_sub35.readUnsignedShort() << 2) * -1489042801;
		else if (4 == i)
			aBool5721 = false;
		else if (i == 5)
			aBool5722 = false;
	}

	void method8048(int i, int i_0_) {
		double d = (double) (i >> 16 & 0xff) / 256.0;
		double d_1_ = (double) (i >> 8 & 0xff) / 256.0;
		double d_2_ = (double) (i & 0xff) / 256.0;
		double d_3_ = d;
		if (d_1_ < d_3_)
			d_3_ = d_1_;
		if (d_2_ < d_3_)
			d_3_ = d_2_;
		double d_4_ = d;
		if (d_1_ > d_4_)
			d_4_ = d_1_;
		if (d_2_ > d_4_)
			d_4_ = d_2_;
		double d_5_ = 0.0;
		double d_6_ = 0.0;
		double d_7_ = (d_4_ + d_3_) / 2.0;
		if (d_4_ != d_3_) {
			if (d_7_ < 0.5)
				d_6_ = (d_4_ - d_3_) / (d_4_ + d_3_);
			if (d_7_ >= 0.5)
				d_6_ = (d_4_ - d_3_) / (2.0 - d_4_ - d_3_);
			if (d == d_4_)
				d_5_ = (d_1_ - d_2_) / (d_4_ - d_3_);
			else if (d_4_ == d_1_)
				d_5_ = 2.0 + (d_2_ - d) / (d_4_ - d_3_);
			else if (d_4_ == d_2_)
				d_5_ = (d - d_1_) / (d_4_ - d_3_) + 4.0;
		}
		d_5_ /= 6.0;
		anInt5726 = 129547103 * (int) (d_6_ * 256.0);
		anInt5725 = (int) (256.0 * d_7_) * 1365217939;
		if (-771727201 * anInt5726 < 0)
			anInt5726 = 0;
		else if (anInt5726 * -771727201 > 255)
			anInt5726 = -1325227103;
		if (anInt5725 * 1389910939 < 0)
			anInt5725 = 0;
		else if (1389910939 * anInt5725 > 255)
			anInt5725 = 238223469;
		if (d_7_ > 0.5)
			anInt5718 = (int) (d_6_ * (1.0 - d_7_) * 512.0) * -812457911;
		else
			anInt5718 = (int) (d_6_ * d_7_ * 512.0) * -812457911;
		if (anInt5718 * -45673991 < 1)
			anInt5718 = -812457911;
		anInt5724 = (int) (d_5_ * (double) (-45673991 * anInt5718)) * -2032289709;
	}

	void method8049(RsByteBuffer class282_sub35, int i, byte i_8_) {
		if (i == 1) {
			((Class481) this).anInt5723 = class282_sub35.read24BitUnsignedInteger((short) 12399) * 1504179655;
			method8048(((Class481) this).anInt5723 * -129287177, 1049430248);
		} else if (2 == i) {
			anInt5719 = class282_sub35.readUnsignedShort() * 1470638369;
			if (anInt5719 * -1346987295 == 65535)
				anInt5719 = -1470638369;
		} else if (3 == i)
			anInt5720 = (class282_sub35.readUnsignedShort() << 2) * -1489042801;
		else if (4 == i)
			aBool5721 = false;
		else if (i == 5)
			aBool5722 = false;
	}

	void method8050(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_9_ = class282_sub35.readUnsignedByte();
			if (0 == i_9_)
				break;
			method8049(class282_sub35, i_9_, (byte) 87);
		}
	}

	void method8051(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method8049(class282_sub35, i, (byte) 42);
		}
	}

	void method8052(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method8049(class282_sub35, i, (byte) 49);
		}
	}

	void method8053(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			((Class481) this).anInt5723 = class282_sub35.read24BitUnsignedInteger((short) 19945) * 1504179655;
			method8048(((Class481) this).anInt5723 * -129287177, 255699844);
		} else if (2 == i) {
			anInt5719 = class282_sub35.readUnsignedShort() * 1470638369;
			if (anInt5719 * -1346987295 == 65535)
				anInt5719 = -1470638369;
		} else if (3 == i)
			anInt5720 = (class282_sub35.readUnsignedShort() << 2) * -1489042801;
		else if (4 == i)
			aBool5721 = false;
		else if (i == 5)
			aBool5722 = false;
	}

	Class481() {
		anInt5719 = -1470638369;
		anInt5720 = 2114264576;
		aBool5721 = true;
		aBool5722 = true;
	}

	void method8054(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			((Class481) this).anInt5723 = class282_sub35.read24BitUnsignedInteger((short) 27481) * 1504179655;
			method8048(((Class481) this).anInt5723 * -129287177, 515760809);
		} else if (2 == i) {
			anInt5719 = class282_sub35.readUnsignedShort() * 1470638369;
			if (anInt5719 * -1346987295 == 65535)
				anInt5719 = -1470638369;
		} else if (3 == i)
			anInt5720 = (class282_sub35.readUnsignedShort() << 2) * -1489042801;
		else if (4 == i)
			aBool5721 = false;
		else if (i == 5)
			aBool5722 = false;
	}

	void method8055(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			((Class481) this).anInt5723 = class282_sub35.read24BitUnsignedInteger((short) 9985) * 1504179655;
			method8048(((Class481) this).anInt5723 * -129287177, -71891519);
		} else if (2 == i) {
			anInt5719 = class282_sub35.readUnsignedShort() * 1470638369;
			if (anInt5719 * -1346987295 == 65535)
				anInt5719 = -1470638369;
		} else if (3 == i)
			anInt5720 = (class282_sub35.readUnsignedShort() << 2) * -1489042801;
		else if (4 == i)
			aBool5721 = false;
		else if (i == 5)
			aBool5722 = false;
	}

	void method8056(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			((Class481) this).anInt5723 = class282_sub35.read24BitUnsignedInteger((short) 12325) * 1504179655;
			method8048(((Class481) this).anInt5723 * -129287177, -1054865466);
		} else if (2 == i) {
			anInt5719 = class282_sub35.readUnsignedShort() * 1470638369;
			if (anInt5719 * -1346987295 == 65535)
				anInt5719 = -1470638369;
		} else if (3 == i)
			anInt5720 = (class282_sub35.readUnsignedShort() << 2) * -1489042801;
		else if (4 == i)
			aBool5721 = false;
		else if (i == 5)
			aBool5722 = false;
	}
}
