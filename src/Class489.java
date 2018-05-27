/* Class489 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class489 {
	public int anInt5762;
	public int anInt5763;
	public int anInt5764;
	static int anInt5765;

	void method8213(RsByteBuffer class282_sub35, byte i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (i_0_ == 0) {
				if (i < 7)
					break;
				break;
			}
			method8214(class282_sub35, i_0_, -315183952);
		}
	}

	Class489() {
		/* empty */
	}

	void method8214(RsByteBuffer class282_sub35, int i, int i_1_) {
		if (i == 1) {
			anInt5764 = class282_sub35.readUnsignedShort() * 265195743;
			anInt5763 = class282_sub35.readUnsignedByte() * -217331027;
			anInt5762 = class282_sub35.readUnsignedByte() * -1379572239;
		}
	}

	static final void method8215(CS2Executor class527, int i) {
		int i_2_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_2_, (byte) 98);
		if (null == class118.aString1369)
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = class118.aString1369;
	}

	static void method8216(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 - 1] = IndexLoaders.aClass242_4922.method4156((((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 - 1]), -1396181317).method4098(Class158_Sub1.aClass3_8507, (byte) 1) ? 1 : 0;
	}

	static void method8217(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class476 class476, byte i_8_) {
		Class282_Sub31 class282_sub31 = null;
		for (Class282_Sub31 class282_sub31_9_ = ((Class282_Sub31) Class282_Sub31.aClass482_7776.head((byte) 22)); null != class282_sub31_9_; class282_sub31_9_ = (Class282_Sub31) Class282_Sub31.aClass482_7776.next(375031762)) {
			if (i == (((Class282_Sub31) class282_sub31_9_).anInt7764 * 1291499461) && i_3_ == 37618455 * class282_sub31_9_.anInt7762 && i_4_ == -322610393 * class282_sub31_9_.anInt7763 && (((Class282_Sub31) class282_sub31_9_).anInt7766 * -497894501 == i_5_)) {
				class282_sub31 = class282_sub31_9_;
				break;
			}
		}
		if (class282_sub31 == null) {
			class282_sub31 = new Class282_Sub31();
			((Class282_Sub31) class282_sub31).anInt7764 = -362696947 * i;
			((Class282_Sub31) class282_sub31).anInt7766 = i_5_ * 1143878291;
			class282_sub31.anInt7762 = i_3_ * 1690395815;
			class282_sub31.anInt7763 = 765748375 * i_4_;
			Class282_Sub31.aClass482_7776.append(class282_sub31, -373570573);
		}
		((Class282_Sub31) class282_sub31).anInt7769 = i_6_ * -567871853;
		((Class282_Sub31) class282_sub31).anInt7771 = -763092445 * i_7_;
		((Class282_Sub31) class282_sub31).aClass476_7768 = class476;
		((Class282_Sub31) class282_sub31).aBool7773 = true;
		((Class282_Sub31) class282_sub31).aBool7774 = false;
	}

	static final void method8218(CS2Executor class527, byte i) {
		int i_10_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class380.method6450((char) i_10_, -294596475) ? 1 : 0;
	}

	static final void method8219(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class488.anInt5760 * 1448596553;
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = -1845665331 * Class351.anInt4097;
	}

	static final void method8220(CS2Executor class527, byte i) {
		int i_11_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_11_, (byte) 50);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_11_ >>> 16];
		Class118 class118_12_ = Class96_Sub23.method14682(class98, class118, -838454718);
		int[] is = ((CS2Executor) class527).intStack;
		int i_13_ = (((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1;
		int i_14_;
		if (class118_12_ == null) {
			if (i != 0)
				return;
			i_14_ = -1;
		} else
			i_14_ = class118_12_.anInt1287 * -1952846363;
		is[i_13_] = i_14_;
	}
}
