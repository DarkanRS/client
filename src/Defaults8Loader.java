
/* Class519 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Stack;

public class Defaults8Loader {
	public Interface17 anInterface17_5931;
	static int anInt5932;

	public Defaults8Loader(Index class317) {
		byte[] is = class317.getFile((DefaultsFile.FILE_8.anInt6966 * -1719912253), -1967379724);
		method11149(new RsByteBuffer(is), 1856651955);
	}

	void method11149(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (0 == i_0_)
				break;
			if (1 == i_0_)
				anInterface17_5931 = Class197.method3202(class282_sub35, 470106489);
		}
	}

	void method11150(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i)
				anInterface17_5931 = Class197.method3202(class282_sub35, 470106489);
		}
	}

	void method11151(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i)
				anInterface17_5931 = Class197.method3202(class282_sub35, 470106489);
		}
	}

	void method11152(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i)
				anInterface17_5931 = Class197.method3202(class282_sub35, 470106489);
		}
	}

	void method11153(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			if (1 == i)
				anInterface17_5931 = Class197.method3202(class282_sub35, 470106489);
		}
	}

	static final void method11154(CS2Executor class527, int i) {
		class527.aClass346_7009 = new Class346();
		class527.aClass346_7009.anInt4048 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1506067503);
		class527.aClass346_7009.aClass282_Sub50_Sub9_4047 = IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(((class527.aClass346_7009.anInt4048) * -624100047), -1711115203);
		class527.aClass346_7009.anIntArray4046 = new int[class527.aClass346_7009.aClass282_Sub50_Sub9_4047.method14916(388398854)];
	}

	static void method11155(int i, int i_1_, int i_2_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.method4778(15, 0L);
		class282_sub50_sub12.method14995(1022143569);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = -1773141545 * i;
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9641 = i_1_ * 717659479;
	}

	public static void method11156(int i) {
		synchronized (Class285.aStack3390) {
			Class285.aStack3390 = new Stack();
		}
	}
}
