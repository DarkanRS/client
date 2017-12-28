
/* Class395 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.Inflater;

public class Class395 {
	Inflater anInflater4787;
	static int anInt4788;

	public byte[] method6764(byte[] is, byte i) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		class282_sub35.index = -1115476867 * (is.length - 4);
		int i_0_ = class282_sub35.method13085(-605901708);
		byte[] is_1_ = new byte[i_0_];
		class282_sub35.index = 0;
		method6767(class282_sub35, is_1_, 1818988089);
		return is_1_;
	}

	public void method6765(RsByteBuffer class282_sub35, byte[] is) {
		if (31 != (class282_sub35.buffer[class282_sub35.index * -1990677291]) || -117 != (class282_sub35.buffer[1 + class282_sub35.index * -1990677291]))
			throw new RuntimeException("");
		if (((Class395) this).anInflater4787 == null)
			((Class395) this).anInflater4787 = new Inflater(true);
		try {
			((Class395) this).anInflater4787.setInput(class282_sub35.buffer, class282_sub35.index * -1990677291 + 10, (class282_sub35.buffer.length - (8 + (10 + -1990677291 * class282_sub35.index))));
			((Class395) this).anInflater4787.inflate(is);
		} catch (Exception exception) {
			((Class395) this).anInflater4787.reset();
			throw new RuntimeException("");
		}
		((Class395) this).anInflater4787.reset();
	}

	public byte[] method6766(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		class282_sub35.index = -1115476867 * (is.length - 4);
		int i = class282_sub35.method13085(1261997421);
		byte[] is_2_ = new byte[i];
		class282_sub35.index = 0;
		method6767(class282_sub35, is_2_, 1687342112);
		return is_2_;
	}

	public void method6767(RsByteBuffer class282_sub35, byte[] is, int i) {
		if (31 != (class282_sub35.buffer[class282_sub35.index * -1990677291]) || -117 != (class282_sub35.buffer[1 + class282_sub35.index * -1990677291]))
			throw new RuntimeException("");
		if (((Class395) this).anInflater4787 == null)
			((Class395) this).anInflater4787 = new Inflater(true);
		try {
			((Class395) this).anInflater4787.setInput(class282_sub35.buffer, class282_sub35.index * -1990677291 + 10, (class282_sub35.buffer.length - (8 + (10 + -1990677291 * class282_sub35.index))));
			((Class395) this).anInflater4787.inflate(is);
		} catch (Exception exception) {
			((Class395) this).anInflater4787.reset();
			throw new RuntimeException("");
		}
		((Class395) this).anInflater4787.reset();
	}

	public Class395() {
		this(-1, 1000000, 1000000);
	}

	public byte[] method6768(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		class282_sub35.index = -1115476867 * (is.length - 4);
		int i = class282_sub35.method13085(-1441013526);
		byte[] is_3_ = new byte[i];
		class282_sub35.index = 0;
		method6767(class282_sub35, is_3_, -1088157596);
		return is_3_;
	}

	public byte[] method6769(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		class282_sub35.index = -1115476867 * (is.length - 4);
		int i = class282_sub35.method13085(-1229823202);
		byte[] is_4_ = new byte[i];
		class282_sub35.index = 0;
		method6767(class282_sub35, is_4_, -618422087);
		return is_4_;
	}

	public void method6770(RsByteBuffer class282_sub35, byte[] is) {
		if (31 != (class282_sub35.buffer[class282_sub35.index * -1990677291]) || -117 != (class282_sub35.buffer[1 + class282_sub35.index * -1990677291]))
			throw new RuntimeException("");
		if (((Class395) this).anInflater4787 == null)
			((Class395) this).anInflater4787 = new Inflater(true);
		try {
			((Class395) this).anInflater4787.setInput(class282_sub35.buffer, class282_sub35.index * -1990677291 + 10, (class282_sub35.buffer.length - (8 + (10 + -1990677291 * class282_sub35.index))));
			((Class395) this).anInflater4787.inflate(is);
		} catch (Exception exception) {
			((Class395) this).anInflater4787.reset();
			throw new RuntimeException("");
		}
		((Class395) this).anInflater4787.reset();
	}

	Class395(int i, int i_5_, int i_6_) {
		/* empty */
	}

	public void method6771(RsByteBuffer class282_sub35, byte[] is) {
		if (31 != (class282_sub35.buffer[class282_sub35.index * -1990677291]) || -117 != (class282_sub35.buffer[1 + class282_sub35.index * -1990677291]))
			throw new RuntimeException("");
		if (((Class395) this).anInflater4787 == null)
			((Class395) this).anInflater4787 = new Inflater(true);
		try {
			((Class395) this).anInflater4787.setInput(class282_sub35.buffer, class282_sub35.index * -1990677291 + 10, (class282_sub35.buffer.length - (8 + (10 + -1990677291 * class282_sub35.index))));
			((Class395) this).anInflater4787.inflate(is);
		} catch (Exception exception) {
			((Class395) this).anInflater4787.reset();
			throw new RuntimeException("");
		}
		((Class395) this).anInflater4787.reset();
	}

	public static final void method6772(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		if (i >= Class532_Sub1.anInt7071 * -612590951 && i_7_ <= -1345107225 * Class532_Sub1.anInt7069 && i_8_ >= 324226563 * Class532_Sub1.anInt7070 && i_9_ <= -348932735 * Class532_Sub1.anInt7068)
			Class92.method1564(i, i_7_, i_8_, i_9_, i_10_, (byte) -36);
		else
			Class463.method7728(i, i_7_, i_8_, i_9_, i_10_, 2064042619);
	}
}
