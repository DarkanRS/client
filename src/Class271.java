
/* Class271 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class271 {
	static File aFile3327;
	static boolean aBool3328 = false;
	static Hashtable aHashtable3329 = new Hashtable(16);
	static int anInt3330;

	static void method4820(File file) {
		aFile3327 = file;
		if (!aFile3327.exists())
			throw new RuntimeException("");
		aBool3328 = true;
	}

	static void method4821(File file) {
		aFile3327 = file;
		if (!aFile3327.exists())
			throw new RuntimeException("");
		aBool3328 = true;
	}

	Class271() throws Throwable {
		throw new Error();
	}

	static void method4822(File file) {
		aFile3327 = file;
		if (!aFile3327.exists())
			throw new RuntimeException("");
		aBool3328 = true;
	}

	static File method4823(String string) {
		if (!aBool3328)
			throw new RuntimeException("");
		File file = (File) aHashtable3329.get(string);
		if (file != null)
			return file;
		File file_0_ = new File(aFile3327, string);
		RandomAccessFile randomaccessfile = null;
		File file_1_;
		try {
			File file_2_ = new File(file_0_.getParent());
			if (!file_2_.exists())
				throw new RuntimeException("");
			randomaccessfile = new RandomAccessFile(file_0_, "rw");
			int i = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			aHashtable3329.put(string, file_0_);
			file_1_ = file_0_;
		} catch (Exception exception) {
			try {
				if (null != randomaccessfile) {
					randomaccessfile.close();
					Object object = null;
				}
			} catch (Exception exception_3_) {
				/* empty */
			}
			throw new RuntimeException();
		}
		return file_1_;
	}

	public static String method4824(byte[] is, int i, int i_4_, int i_5_) {
		char[] cs = new char[i_4_];
		int i_6_ = 0;
		int i_7_ = i;
		int i_8_ = i + i_4_;
		while (i_7_ < i_8_) {
			int i_9_ = is[i_7_++] & 0xff;
			int i_10_;
			if (i_9_ < 128) {
				if (i_9_ == 0)
					i_10_ = 65533;
				else
					i_10_ = i_9_;
			} else if (i_9_ < 192)
				i_10_ = 65533;
			else if (i_9_ < 224) {
				if (i_7_ < i_8_ && 128 == (is[i_7_] & 0xc0)) {
					i_10_ = (i_9_ & 0x1f) << 6 | is[i_7_++] & 0x3f;
					if (i_10_ < 128)
						i_10_ = 65533;
				} else
					i_10_ = 65533;
			} else if (i_9_ < 240) {
				if (1 + i_7_ < i_8_ && 128 == (is[i_7_] & 0xc0) && (is[1 + i_7_] & 0xc0) == 128) {
					i_10_ = ((i_9_ & 0xf) << 12 | (is[i_7_++] & 0x3f) << 6 | is[i_7_++] & 0x3f);
					if (i_10_ < 2048)
						i_10_ = 65533;
				} else
					i_10_ = 65533;
			} else if (i_9_ < 248) {
				if (i_7_ + 2 < i_8_ && 128 == (is[i_7_] & 0xc0) && 128 == (is[i_7_ + 1] & 0xc0) && 128 == (is[i_7_ + 2] & 0xc0)) {
					i_10_ = ((i_9_ & 0x7) << 18 | (is[i_7_++] & 0x3f) << 12 | (is[i_7_++] & 0x3f) << 6 | is[i_7_++] & 0x3f);
					if (i_10_ < 65536 || i_10_ > 1114111)
						i_10_ = 65533;
					else
						i_10_ = 65533;
				} else
					i_10_ = 65533;
			} else
				i_10_ = 65533;
			cs[i_6_++] = (char) i_10_;
		}
		return new String(cs, 0, i_6_);
	}

	static final void method4825(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_11_ = (class527.intStack[class527.anInt7012 * 1942118537]);
		int i_12_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class515.method8861(i_11_, i_12_, true, 113694446);
	}

	static final void method4826(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = -274659233 * Class9.anInt112;
	}

	static void method4827(Index class317, int i, int i_13_, int i_14_, boolean bool, long l) {
		Class109.method1859(class317, i, i_13_, i_14_, bool, l, 0, 2065437582);
	}

	public static TCPMessage method4828(OutgoingPacket class379, IsaacCipher class432, int i) {
		TCPMessage class282_sub23 = Class158_Sub2.method14356((short) 2048);
		((TCPMessage) class282_sub23).packet = class379;
		((TCPMessage) class282_sub23).anInt7678 = ((OutgoingPacket) class379).anInt4632 * -1049235717;
		if (-1490091691 * ((TCPMessage) class282_sub23).anInt7678 == -1)
			class282_sub23.buffer = new RsBitsBuffer(260);
		else if (-1490091691 * ((TCPMessage) class282_sub23).anInt7678 == -2)
			class282_sub23.buffer = new RsBitsBuffer(10000);
		else if (((TCPMessage) class282_sub23).anInt7678 * -1490091691 <= 18)
			class282_sub23.buffer = new RsBitsBuffer(20);
		else if (((TCPMessage) class282_sub23).anInt7678 * -1490091691 <= 98)
			class282_sub23.buffer = new RsBitsBuffer(100);
		else
			class282_sub23.buffer = new RsBitsBuffer(260);
		class282_sub23.buffer.setIsaacCipher(class432, 351906319);
		class282_sub23.buffer.writeIsaacByte((((OutgoingPacket) ((TCPMessage) class282_sub23).packet).anInt4631) * -498570583, 328020366);
		class282_sub23.anInt7680 = 0;
		return class282_sub23;
	}

	static final void method4829(CS2Executor class527, short i) {
		if (0 == 1609086245 * client.anInt7434)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1754449153 * client.anInt7373;
	}

	static final void method4830(CS2Executor class527, int i) {
		IComponentDefinitions class118 = (class527.animable.inter.method1618((class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]), (byte) 12));
		class118.aClass118Array1438 = null;
		class118.aClass118Array1439 = null;
		Class109.method1858(class118, (byte) -73);
	}
}
