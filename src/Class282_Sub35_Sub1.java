import jaclib.memory.Stream;

public class Class282_Sub35_Sub1 extends RsByteBuffer {

	void method14685(float f_1) {
		int i_2 = Stream.floatToRawIntBits(f_1);
		this.buffer[++this.index - 1] = (byte) i_2;
		this.buffer[++this.index - 1] = (byte) (i_2 >> 8);
		this.buffer[++this.index - 1] = (byte) (i_2 >> 16);
		this.buffer[++this.index - 1] = (byte) (i_2 >> 24);
	}

	void method14688(float f_1) {
		int i_2 = Stream.floatToRawIntBits(f_1);
		this.buffer[++this.index - 1] = (byte) (i_2 >> 24);
		this.buffer[++this.index - 1] = (byte) (i_2 >> 16);
		this.buffer[++this.index - 1] = (byte) (i_2 >> 8);
		this.buffer[++this.index - 1] = (byte) i_2;
	}

	Class282_Sub35_Sub1(int i_1) {
		super(i_1);
	}

}
