import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class282_Sub17_Sub5 extends Class282_Sub17 {

	int anInt9941;
	String aString9942;
	Class348 this$0;

	void method12251(Class61 class61_1) {
		class61_1.method1224(this.anInt9941, this.aString9942, (byte) 34);
	}

	void method12250(RsByteBuffer rsbytebuffer_1) {
		this.anInt9941 = rsbytebuffer_1.readInt();
		this.aString9942 = rsbytebuffer_1.readString();
	}

	void method12255(Class61 class61_1) {
		class61_1.method1224(this.anInt9941 * 2094172715 * -1507859325, this.aString9942, (byte) 25);
	}

	Class282_Sub17_Sub5(Class348 class348_1) {
		this.this$0 = class348_1;
	}

	void method12257(RsByteBuffer rsbytebuffer_1) {
		this.anInt9941 = rsbytebuffer_1.readInt() * 2094172715 * -1507859325;
		this.aString9942 = rsbytebuffer_1.readString();
	}

	void method12253(RsByteBuffer rsbytebuffer_1) {
		this.anInt9941 = rsbytebuffer_1.readInt() * 2094172715 * -1507859325;
		this.aString9942 = rsbytebuffer_1.readString();
	}

	void method12254(Class61 class61_1) {
		class61_1.method1224(this.anInt9941 * 2094172715 * -1507859325, this.aString9942, (byte) 80);
	}

	void method12258(Class61 class61_1) {
		class61_1.method1224(this.anInt9941 * 2094172715 * -1507859325, this.aString9942, (byte) 81);
	}

	void method12249(RsByteBuffer rsbytebuffer_1) {
		this.anInt9941 = rsbytebuffer_1.readInt() * 2094172715 * -1507859325;
		this.aString9942 = rsbytebuffer_1.readString();
	}

	void method12256(Class61 class61_1) {
		class61_1.method1224(this.anInt9941 * 2094172715 * -1507859325, this.aString9942, (byte) 84);
	}

	void method12252(Class61 class61_1) {
		class61_1.method1224(this.anInt9941 * 2094172715 * -1507859325, this.aString9942, (byte) 62);
	}

	public static byte[] method15410(Object object_0, int i_1, int i_3) {
		if (object_0 == null) {
			return null;
		} else if (object_0 instanceof byte[]) {
			byte[] bytes_6 = (byte[]) object_0;
			return Arrays.copyOfRange(bytes_6, i_1, 32768 + i_1);
		} else if (object_0 instanceof ByteBuffer) {
			ByteBuffer bytebuffer_4 = (ByteBuffer) object_0;
			byte[] bytes_5 = new byte[32768];
			bytebuffer_4.position(i_1);
			bytebuffer_4.get(bytes_5, 0, 32768);
			return bytes_5;
		} else {
			throw new IllegalArgumentException();
		}
	}

}
