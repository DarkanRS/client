/* Class366 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class366 implements Interface3 {
	public int anInt4231;
	public static short[][][] skinColors;

	public Class60 method24(int i) {
		return Class60.aClass60_609;
	}

	Class366(int i) {
		anInt4231 = -776392521 * i;
	}

	public static Class366 method6300(RsByteBuffer class282_sub35) {
		int i = class282_sub35.readInt();
		return new Class366(i);
	}

	public Class60 method25() {
		return Class60.aClass60_609;
	}

	static void method6301(GraphicalRenderer class505, int i, int i_0_, Class118 class118, int i_1_, int i_2_) {
		for (int i_3_ = 7; i_3_ >= 0; i_3_--) {
			for (int i_4_ = 127; i_4_ >= 0; i_4_--) {
				int i_5_ = (i_1_ & 0x3f) << 10 | (i_3_ & 0x7) << 7 | i_4_ & 0x7f;
				Class38.method854(false, true, -1039964582);
				int i_6_ = Class540.anIntArray7136[i_5_];
				Class13.method508(false, true, -1893866080);
				class505.B(i + (i_4_ * (1506818197 * class118.anInt1301) >> 7), i_0_ + (-492594917 * class118.anInt1429 * (7 - i_3_) >> 3), 1 + (1506818197 * class118.anInt1301 >> 7), (-492594917 * class118.anInt1429 >> 3) + 1, i_6_, 0);
			}
		}
	}

	static long method6302(CharSequence charsequence, byte i) {
		long l = 0L;
		int i_7_ = charsequence.length();
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			l *= 37L;
			char c = charsequence.charAt(i_8_);
			if (c >= 'A' && c <= 'Z')
				l += (long) ('\001' + c - 'A');
			else if (c >= 'a' && c <= 'z')
				l += (long) (c + '\001' - 'a');
			else if (c >= '0' && c <= '9')
				l += (long) ('\033' + c - '0');
			if (l >= 177917621779460413L)
				break;
		}
		for (/**/; l % 37L == 0L && 0L != l; l /= 37L) {
			/* empty */
		}
		return l;
	}

	public static Class365 method6303(RsByteBuffer class282_sub35, byte i) {
		int i_9_ = class282_sub35.readUnsignedByte();
		Class356 class356 = (Class350_Sub3_Sub1.method15558(-41327107)[class282_sub35.readUnsignedByte()]);
		Class353 class353 = (Class483.method8155(152314627)[class282_sub35.readUnsignedByte()]);
		int i_10_ = class282_sub35.readShort(1637042593);
		int i_11_ = class282_sub35.readShort(1591872384);
		int i_12_ = class282_sub35.readUnsignedShort();
		int i_13_ = class282_sub35.readUnsignedShort();
		int i_14_ = class282_sub35.readInt();
		int i_15_ = class282_sub35.readInt();
		int i_16_ = class282_sub35.readInt();
		boolean bool = class282_sub35.readUnsignedByte() == 1;
		return new Class365(i_9_, class356, class353, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, bool);
	}

	static final void method6304(CS2Executor class527, int i) {
		int i_17_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class368.aClass429_4265.method7214(i_17_, -2138128366).method14916(-235375245);
	}

	static final void method6305(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class475.method7927(class118, class527, (byte) -27);
	}
}
