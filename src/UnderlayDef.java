/* Class481 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class UnderlayDef {
	public int a;
	public int anInt5719;
	public int anInt5720;
	public boolean aBool5721;
	public boolean aBool5722;
	int anInt5723 = 0;
	public int r;
	public int b;
	public int g;

	void method8047(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			((UnderlayDef) this).anInt5723 = class282_sub35.read24BitUnsignedInteger() * 1504179655;
			method8048(((UnderlayDef) this).anInt5723 * -129287177, 876511716);
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

	void method8048(int rgb, int i_0_) {
		double redD = (double) (rgb >> 16 & 0xff) / 256.0;
		double greenD = (double) (rgb >> 8 & 0xff) / 256.0;
		double blueD = (double) (rgb & 0xff) / 256.0;
		double minorC = redD;
		if (greenD < minorC)
			minorC = greenD;
		if (blueD < minorC)
			minorC = blueD;
		double majorC = redD;
		if (greenD > majorC)
			majorC = greenD;
		if (blueD > majorC)
			majorC = blueD;
		double d_5_ = 0.0;
		double d_6_ = 0.0;
		double d_7_ = (majorC + minorC) / 2.0;
		if (majorC != minorC) {
			if (d_7_ < 0.5)
				d_6_ = (majorC - minorC) / (majorC + minorC);
			if (d_7_ >= 0.5)
				d_6_ = (majorC - minorC) / (2.0 - majorC - minorC);
			if (redD == majorC)
				d_5_ = (greenD - blueD) / (majorC - minorC);
			else if (majorC == greenD)
				d_5_ = 2.0 + (blueD - redD) / (majorC - minorC);
			else if (majorC == blueD)
				d_5_ = (redD - greenD) / (majorC - minorC) + 4.0;
		}
		d_5_ /= 6.0;
		g = 129547103 * (int) (d_6_ * 256.0);
		b = (int) (256.0 * d_7_) * 1365217939;
		if (-771727201 * g < 0)
			g = 0;
		else if (g * -771727201 > 255)
			g = -1325227103;
		if (b * 1389910939 < 0)
			b = 0;
		else if (1389910939 * b > 255)
			b = 238223469;
		if (d_7_ > 0.5)
			a = (int) (d_6_ * (1.0 - d_7_) * 512.0) * -812457911;
		else
			a = (int) (d_6_ * d_7_ * 512.0) * -812457911;
		if (a * -45673991 < 1)
			a = -812457911;
		r = (int) (d_5_ * (double) (-45673991 * a)) * -2032289709;
	}

	void method8049(RsByteBuffer class282_sub35, int i, byte i_8_) {
		if (i == 1) {
			((UnderlayDef) this).anInt5723 = class282_sub35.read24BitUnsignedInteger() * 1504179655;
			method8048(((UnderlayDef) this).anInt5723 * -129287177, 1049430248);
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
			((UnderlayDef) this).anInt5723 = class282_sub35.read24BitUnsignedInteger() * 1504179655;
			method8048(((UnderlayDef) this).anInt5723 * -129287177, 255699844);
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

	UnderlayDef() {
		anInt5719 = -1470638369;
		anInt5720 = 2114264576;
		aBool5721 = true;
		aBool5722 = true;
	}

	void method8054(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			((UnderlayDef) this).anInt5723 = class282_sub35.read24BitUnsignedInteger() * 1504179655;
			method8048(((UnderlayDef) this).anInt5723 * -129287177, 515760809);
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
			((UnderlayDef) this).anInt5723 = class282_sub35.read24BitUnsignedInteger() * 1504179655;
			method8048(((UnderlayDef) this).anInt5723 * -129287177, -71891519);
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
			((UnderlayDef) this).anInt5723 = class282_sub35.read24BitUnsignedInteger() * 1504179655;
			method8048(((UnderlayDef) this).anInt5723 * -129287177, -1054865466);
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
