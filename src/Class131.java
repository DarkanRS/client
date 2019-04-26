import jaclib.memory.Buffer;

public class Class131 {

	OpenGLGraphicalRenderer aGraphicalRenderer_Sub1_1594;
	Buffer aBuffer1593;

	Class131(OpenGLGraphicalRenderer class505_sub1_1, Buffer buffer_2) {
		this.aGraphicalRenderer_Sub1_1594 = class505_sub1_1;
		this.aBuffer1593 = buffer_2;
	}

	void method2319(byte[] bytes_1, int i_2) {
		if (this.aBuffer1593 == null || this.aBuffer1593.method1() < i_2) {
			this.aBuffer1593 = this.aGraphicalRenderer_Sub1_1594.aNativeHeap8445.method759(i_2, false);
		}

		this.aBuffer1593.method116(bytes_1, 0, 0, i_2);
	}

	Class131(OpenGLGraphicalRenderer class505_sub1_1, byte[] bytes_2, int i_3) {
		this.aGraphicalRenderer_Sub1_1594 = class505_sub1_1;
		this.aBuffer1593 = this.aGraphicalRenderer_Sub1_1594.aNativeHeap8445.method759(i_3, false);
		if (bytes_2 != null) {
			this.aBuffer1593.method116(bytes_2, 0, 0, i_3);
		}

	}

}
