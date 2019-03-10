import java.util.Stack;

public class Defaults8Loader {

	static int anInt5932;

	public Interface17 anInterface17_5931;

	public Defaults8Loader(Index index_1) {
		byte[] bytes_2 = index_1.getFile(DefaultsFile.FILE_8.fileId);
		this.method11149(new RsByteBuffer(bytes_2), 1856651955);
	}

	void method11149(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			if (i_3 == 1) {
				this.anInterface17_5931 = Class197.method3202(rsbytebuffer_1, 470106489);
			}
		}
	}

	static void method11155(int i_0, int i_1, int i_2) {
		Class282_Sub50_Sub12 class282_sub50_sub12_3 = Engine.getIComponentVar(15, 0L);
		class282_sub50_sub12_3.method14995(1022143569);
		class282_sub50_sub12_3.anInt9668 = i_0;
		class282_sub50_sub12_3.anInt9641 = i_1;
	}

	public static void method11156(int i_0) {
		Stack stack_1 = Class285.aStack3390;
		synchronized (Class285.aStack3390) {
			Class285.aStack3390 = new Stack();
		}
	}
}
