/* Class282_Sub11_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub11_Sub1 extends Class282_Sub11 {
	byte aByte9999;
	Class349 this$0;
	byte aByte10000;
	String aString10001;

	void method12204(Class282_Sub4 class282_sub4, int i) {
		class282_sub4.aString7501 = ((Class282_Sub11_Sub1) this).aString10001;
		if (((Class282_Sub11_Sub1) this).aString10001 != null) {
			class282_sub4.aByte7504 = ((Class282_Sub11_Sub1) this).aByte9999;
			class282_sub4.aByte7497 = ((Class282_Sub11_Sub1) this).aByte10000;
		}
	}

	void method12203(RsByteBuffer class282_sub35, int i) {
		((Class282_Sub11_Sub1) this).aString10001 = class282_sub35.readNullString(1586002738);
		if (null != ((Class282_Sub11_Sub1) this).aString10001) {
			class282_sub35.readUnsignedByte();
			((Class282_Sub11_Sub1) this).aByte9999 = class282_sub35.readByte((short) -5576);
			((Class282_Sub11_Sub1) this).aByte10000 = class282_sub35.readByte((short) -9099);
		}
	}

	void method12206(RsByteBuffer class282_sub35) {
		((Class282_Sub11_Sub1) this).aString10001 = class282_sub35.readNullString(744034489);
		if (null != ((Class282_Sub11_Sub1) this).aString10001) {
			class282_sub35.readUnsignedByte();
			((Class282_Sub11_Sub1) this).aByte9999 = class282_sub35.readByte((short) -8725);
			((Class282_Sub11_Sub1) this).aByte10000 = class282_sub35.readByte((short) -19831);
		}
	}

	void method12205(Class282_Sub4 class282_sub4) {
		class282_sub4.aString7501 = ((Class282_Sub11_Sub1) this).aString10001;
		if (((Class282_Sub11_Sub1) this).aString10001 != null) {
			class282_sub4.aByte7504 = ((Class282_Sub11_Sub1) this).aByte9999;
			class282_sub4.aByte7497 = ((Class282_Sub11_Sub1) this).aByte10000;
		}
	}

	void method12208(RsByteBuffer class282_sub35) {
		((Class282_Sub11_Sub1) this).aString10001 = class282_sub35.readNullString(844690587);
		if (null != ((Class282_Sub11_Sub1) this).aString10001) {
			class282_sub35.readUnsignedByte();
			((Class282_Sub11_Sub1) this).aByte9999 = class282_sub35.readByte((short) -1608);
			((Class282_Sub11_Sub1) this).aByte10000 = class282_sub35.readByte((short) -7352);
		}
	}

	void method12207(RsByteBuffer class282_sub35) {
		((Class282_Sub11_Sub1) this).aString10001 = class282_sub35.readNullString(1889442687);
		if (null != ((Class282_Sub11_Sub1) this).aString10001) {
			class282_sub35.readUnsignedByte();
			((Class282_Sub11_Sub1) this).aByte9999 = class282_sub35.readByte((short) -681);
			((Class282_Sub11_Sub1) this).aByte10000 = class282_sub35.readByte((short) -27074);
		}
	}

	Class282_Sub11_Sub1(Class349 class349) {
		((Class282_Sub11_Sub1) this).this$0 = class349;
	}

	static int method15433(NPC class521_sub1_sub1_sub2_sub2, int i) {
		Class409 class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
		if (class409.anIntArray4886 != null) {
			class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
			if (class409 == null)
				return -1;
		}
		int i_0_ = -1955311273 * class409.anInt4876;
		Class227 class227 = class521_sub1_sub1_sub2_sub2.method15855((byte) -17);
		int i_1_ = class521_sub1_sub1_sub2_sub2.aClass456_Sub3_10337.method7597(-693790395);
		if (-1 == i_1_ || class521_sub1_sub1_sub2_sub2.aClass456_Sub3_10337.aBool7891)
			i_0_ = -1910117775 * class409.anInt4903;
		else if (class227.anInt2797 * -474675041 == i_1_ || i_1_ == 486149589 * class227.anInt2817 || class227.anInt2800 * -833477781 == i_1_ || 1642803439 * class227.anInt2799 == i_1_)
			i_0_ = class409.anInt4906 * -1427347049;
		else if (2055956425 * class227.anInt2801 == i_1_ || class227.anInt2828 * 1053306035 == i_1_ || 1489597113 * class227.anInt2812 == i_1_ || 1879075923 * class227.anInt2803 == i_1_)
			i_0_ = 1863998163 * class409.anInt4921;
		return i_0_;
	}

	public static Class59 method15434(int i, byte i_2_) {
		Class59 class59 = (Class59) Class59.aClass229_533.get((long) i);
		if (class59 != null)
			return class59;
		byte[] is = Class219.aClass317_2710.getFile(0, i, -1383197542);
		class59 = new Class59();
		if (null != is)
			class59.method1150(new RsByteBuffer(is), -1621727040);
		class59.method1146((byte) 1);
		Class59.aClass229_533.put(class59, (long) i);
		return class59;
	}

	static void method15435(int i, int i_3_, byte i_4_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Class263.method4778(16, (long) i);
		class282_sub50_sub12.method14995(1165505680);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = i_3_ * -1773141545;
	}
}
