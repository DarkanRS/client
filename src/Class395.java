import java.util.zip.Inflater;

public class Class395 {

	static int b12FullIndex;
	Inflater anInflater4787;

	public byte[] method6764(byte[] bytes_1) {
		RsByteBuffer rsbytebuffer_3 = new RsByteBuffer(bytes_1);
		rsbytebuffer_3.index = bytes_1.length - 4;
		int i_4 = rsbytebuffer_3.method13085(-605901708);
		byte[] bytes_5 = new byte[i_4];
		rsbytebuffer_3.index = 0;
		this.method6767(rsbytebuffer_3, bytes_5, 1818988089);
		return bytes_5;
	}

	public void method6767(RsByteBuffer rsbytebuffer_1, byte[] bytes_2, int i_3) {
		if (rsbytebuffer_1.buffer[rsbytebuffer_1.index] == 31 && rsbytebuffer_1.buffer[rsbytebuffer_1.index + 1] == -117) {
			if (this.anInflater4787 == null) {
				this.anInflater4787 = new Inflater(true);
			}

			try {
				this.anInflater4787.setInput(rsbytebuffer_1.buffer, rsbytebuffer_1.index + 10, rsbytebuffer_1.buffer.length - (rsbytebuffer_1.index + 8 + 10));
				this.anInflater4787.inflate(bytes_2);
			} catch (Exception exception_5) {
				this.anInflater4787.reset();
				throw new RuntimeException("");
			}

			this.anInflater4787.reset();
		} else {
			throw new RuntimeException("");
		}
	}
	
	public static final void method6772(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (i_0 >= Class532_Sub1.anInt7071 && i_1 <= Class532_Sub1.anInt7069 && i_2 >= Class532_Sub1.anInt7070 && i_3 <= Class532_Sub1.anInt7068) {
			CutsceneObject.method1564(i_0, i_1, i_2, i_3, i_4);
		} else {
			ProcessorSpecs.method7728(i_0, i_1, i_2, i_3, i_4);
		}

	}

}
