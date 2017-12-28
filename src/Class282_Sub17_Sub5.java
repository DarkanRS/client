
/* Class282_Sub17_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class282_Sub17_Sub5 extends Class282_Sub17 {
	int anInt9941;
	String aString9942;
	Class348 this$0;

	void method12251(Class61 class61, int i) {
		class61.method1224((((Class282_Sub17_Sub5) this).anInt9941 * -1507859325), ((Class282_Sub17_Sub5) this).aString9942, (byte) 34);
	}

	void method12250(RsByteBuffer class282_sub35, int i) {
		((Class282_Sub17_Sub5) this).anInt9941 = class282_sub35.readInt() * 2094172715;
		((Class282_Sub17_Sub5) this).aString9942 = class282_sub35.readString(-214607594);
	}

	void method12255(Class61 class61) {
		class61.method1224((((Class282_Sub17_Sub5) this).anInt9941 * -1507859325), ((Class282_Sub17_Sub5) this).aString9942, (byte) 25);
	}

	Class282_Sub17_Sub5(Class348 class348) {
		((Class282_Sub17_Sub5) this).this$0 = class348;
	}

	void method12257(RsByteBuffer class282_sub35) {
		((Class282_Sub17_Sub5) this).anInt9941 = class282_sub35.readInt() * 2094172715;
		((Class282_Sub17_Sub5) this).aString9942 = class282_sub35.readString(851459437);
	}

	void method12253(RsByteBuffer class282_sub35) {
		((Class282_Sub17_Sub5) this).anInt9941 = class282_sub35.readInt() * 2094172715;
		((Class282_Sub17_Sub5) this).aString9942 = class282_sub35.readString(-608533094);
	}

	void method12254(Class61 class61) {
		class61.method1224((((Class282_Sub17_Sub5) this).anInt9941 * -1507859325), ((Class282_Sub17_Sub5) this).aString9942, (byte) 80);
	}

	void method12258(Class61 class61) {
		class61.method1224((((Class282_Sub17_Sub5) this).anInt9941 * -1507859325), ((Class282_Sub17_Sub5) this).aString9942, (byte) 81);
	}

	void method12249(RsByteBuffer class282_sub35) {
		((Class282_Sub17_Sub5) this).anInt9941 = class282_sub35.readInt() * 2094172715;
		((Class282_Sub17_Sub5) this).aString9942 = class282_sub35.readString(1526885104);
	}

	void method12256(Class61 class61) {
		class61.method1224((((Class282_Sub17_Sub5) this).anInt9941 * -1507859325), ((Class282_Sub17_Sub5) this).aString9942, (byte) 84);
	}

	void method12252(Class61 class61) {
		class61.method1224((((Class282_Sub17_Sub5) this).anInt9941 * -1507859325), ((Class282_Sub17_Sub5) this).aString9942, (byte) 62);
	}

	public static byte[] method15410(Object object, int i, int i_0_, int i_1_) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			return Arrays.copyOfRange(is, i, i_0_ + i);
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[i_0_];
			bytebuffer.position(i);
			bytebuffer.get(is, 0, i_0_);
			return is;
		}
		throw new IllegalArgumentException();
	}
}
