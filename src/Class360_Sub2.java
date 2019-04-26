import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;

public class Class360_Sub2 extends Class360 implements Interface6 {

	int anInt9154;
	int anInt9157;
	boolean aBool9156;
	boolean aBool9155;

	public boolean method46() {
		return true;
	}

	public void method48(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		if (this.aClass150_4167 == Class150.aClass150_1949 && this.aClass76_4164 == Class76.aClass76_751) {
			if (i_7 == 0) {
				i_7 = i_3;
			}

			ByteBuffer bytebuffer_8 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
			bytebuffer_8.clear();
			bytebuffer_8.asIntBuffer().put(ints_5, i_6, i_4 * i_7);
			IDirect3DTexture.Upload(this.aLong4168, 0, i_1, i_2, i_3, i_4, this.aClass150_4167.anInt1959 * i_7, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
		} else {
			throw new RuntimeException();
		}
	}

	public void method66(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		if (this.aClass150_4167 == Class150.aClass150_1949 && this.aClass76_4164 == Class76.aClass76_751) {
			if (i_7 == 0) {
				i_7 = i_3;
			}

			ByteBuffer bytebuffer_8 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
			bytebuffer_8.clear();
			bytebuffer_8.asIntBuffer().put(ints_5, i_6, i_7 * i_4);
			IDirect3DTexture.Upload(this.aLong4168, 0, i_1, i_2, i_3, i_4, i_7 * this.aClass150_4167.anInt1959 * -615555291 * 351642797, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
		} else {
			throw new RuntimeException();
		}
	}

	Class360_Sub2(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, Class150 class150_2, int i_3, int i_4, boolean bool_5, byte[] bytes_6, int i_7, int i_8) {
		super(class505_sub2_sub2_1, class150_2, Class76.aClass76_751, bool_5 && class505_sub2_sub2_1.aBool10263, i_3 * i_4);
		if (!this.aGraphicalRenderer_Sub2_Sub2_4165.aBool10265) {
			this.anInt9154 = Utils.nextPowerOfTwo(i_3);
			this.anInt9157 = Utils.nextPowerOfTwo(i_4);
		} else {
			this.anInt9154 = i_3;
			this.anInt9157 = i_4;
		}

		if (bool_5) {
			this.aLong4168 = IDirect3DDevice.CreateTexture(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, this.anInt9154, this.anInt9157, 0, 1024, GraphicalRenderer_Sub2_Sub2.method15652(this.aClass150_4167, Class76.aClass76_751), 1);
		} else {
			this.aLong4168 = IDirect3DDevice.CreateTexture(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, this.anInt9154, this.anInt9157, 1, 0, GraphicalRenderer_Sub2_Sub2.method15652(this.aClass150_4167, Class76.aClass76_751), 1);
		}

		if (i_8 == 0) {
			i_8 = i_3;
		}

		ByteBuffer bytebuffer_9 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer_9.clear();
		Class150 class150_10 = this.aClass150_4167;
		Class150 class150_10000 = this.aClass150_4167;
		if (class150_10 == Class150.aClass150_1956) {
			bytebuffer_9.put(bytes_6, i_7, i_3 * i_4 / 2);
			IDirect3DTexture.Upload(this.aLong4168, 0, 0, 0, i_3, i_4 / 4, i_3 / 4 * 8, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
		} else {
			Class150 class150_11 = this.aClass150_4167;
			class150_10000 = this.aClass150_4167;
			if (class150_11 == Class150.aClass150_1957) {
				bytebuffer_9.put(bytes_6, i_7, i_3 * i_4);
				IDirect3DTexture.Upload(this.aLong4168, 0, 0, 0, i_3, i_4 / 4, i_3 / 4 * 16, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
			} else {
				bytebuffer_9.put(bytes_6, i_7, i_8 * i_4);
				IDirect3DTexture.Upload(this.aLong4168, 0, 0, 0, i_3, i_4, this.aClass150_4167.anInt1959 * i_8, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
			}
		}

	}

	public boolean method63() {
		return true;
	}

	Class360_Sub2(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5, int i_6, int i_7) {
		super(class505_sub2_sub2_1, class150_2, class76_3, false, i_5 * i_4);
		if (!this.aGraphicalRenderer_Sub2_Sub2_4165.aBool10265) {
			this.anInt9154 = Utils.nextPowerOfTwo(i_4);
			this.anInt9157 = Utils.nextPowerOfTwo(i_5);
		} else {
			this.anInt9154 = i_4;
			this.anInt9157 = i_5;
		}

		this.aLong4168 = IDirect3DDevice.CreateTexture(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, i_4, i_5, 0, i_6, GraphicalRenderer_Sub2_Sub2.method15652(this.aClass150_4167, this.aClass76_4164), i_7);
	}

	long method6245() {
		return this.aLong4168;
	}

	public int method36() {
		return this.anInt9154;
	}

	public float method62(float f_1) {
		return f_1 / (float) this.anInt9157;
	}

	Class360_Sub2(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, Class150 class150_2, int i_3, int i_4, boolean bool_5, float[] floats_6, int i_7, int i_8) {
		super(class505_sub2_sub2_1, class150_2, Class76.aClass76_751, bool_5 && class505_sub2_sub2_1.aBool10263, i_3 * i_4);
		if (!this.aGraphicalRenderer_Sub2_Sub2_4165.aBool10265) {
			this.anInt9154 = Utils.nextPowerOfTwo(i_3);
			this.anInt9157 = Utils.nextPowerOfTwo(i_4);
		} else {
			this.anInt9154 = i_3;
			this.anInt9157 = i_4;
		}

		if (bool_5) {
			this.aLong4168 = IDirect3DDevice.CreateTexture(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, this.anInt9154, this.anInt9157, 0, 1024, GraphicalRenderer_Sub2_Sub2.method15652(this.aClass150_4167, Class76.aClass76_758), 1);
		} else {
			this.aLong4168 = IDirect3DDevice.CreateTexture(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, this.anInt9154, this.anInt9157, 1, 0, GraphicalRenderer_Sub2_Sub2.method15652(this.aClass150_4167, Class76.aClass76_758), 1);
		}

		if (i_8 == 0) {
			i_8 = i_3;
		}

		ByteBuffer bytebuffer_9 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer_9.clear();
		bytebuffer_9.asFloatBuffer().put(floats_6, i_7, this.aClass150_4167.anInt1959 * i_8 * i_4);
		IDirect3DTexture.Upload(this.aLong4168, 0, 0, 0, i_3, i_4, this.aClass150_4167.anInt1959 * i_8 * 4, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
	}

	public void method52(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
		if (class150_6 == this.aClass150_4167 && this.aClass76_4164 == Class76.aClass76_751) {
			if (i_8 == 0) {
				i_8 = i_3;
			}

			ByteBuffer bytebuffer_9 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
			bytebuffer_9.clear();
			bytebuffer_9.put(bytes_5, i_7, i_8 * i_4);
			IDirect3DTexture.Upload(this.aLong4168, 0, i_1, i_2, i_3, i_4, this.aClass150_4167.anInt1959 * i_8, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
		} else {
			throw new RuntimeException();
		}
	}

	public void method204(Class35 class35_1) {
		super.method205(class35_1);
	}

	public void method50(boolean bool_1, boolean bool_2) {
		this.aBool9156 = bool_1;
		this.aBool9155 = bool_2;
	}

	public void method201(Class35 class35_1) {
		super.method205(class35_1);
	}

	Class360_Sub2(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5) {
		this(class505_sub2_sub2_1, class150_2, class76_3, i_4, i_5, 0, 1);
	}

	public void method53(int i_3, int i_4, int[] ints_5) {
		if (this.aClass150_4167 == Class150.aClass150_1949 && this.aClass76_4164 == Class76.aClass76_751) {
			ByteBuffer bytebuffer_7 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
			bytebuffer_7.clear();
			IDirect3DTexture.Download(this.aLong4168, 0, 0, 0, i_3, i_4, i_3 * 4, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
			bytebuffer_7.asIntBuffer().get(ints_5, 0, i_3 * i_4);
		} else {
			throw new RuntimeException();
		}
	}

	public void method207() {
		this.aGraphicalRenderer_Sub2_Sub2_4165.method15647(this);
	}

	public float method47(float f_1) {
		return f_1 / (float) this.anInt9154;
	}

	public void method26() {
		super.method26();
	}

	Class360_Sub2(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, int i_2, int i_3, boolean bool_4, int[] ints_5, int i_6, int i_7) {
		super(class505_sub2_sub2_1, Class150.aClass150_1949, Class76.aClass76_751, bool_4 && class505_sub2_sub2_1.aBool10263, i_2 * i_3);
		if (!this.aGraphicalRenderer_Sub2_Sub2_4165.aBool10265) {
			this.anInt9154 = Utils.nextPowerOfTwo(i_2);
			this.anInt9157 = Utils.nextPowerOfTwo(i_3);
		} else {
			this.anInt9154 = i_2;
			this.anInt9157 = i_3;
		}

		if (bool_4) {
			this.aLong4168 = IDirect3DDevice.CreateTexture(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, this.anInt9154, this.anInt9157, 0, 1024, 21, 1);
		} else {
			this.aLong4168 = IDirect3DDevice.CreateTexture(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, this.anInt9154, this.anInt9157, 1, 0, 21, 1);
		}

		if (i_7 == 0) {
			i_7 = i_2;
		}

		ByteBuffer bytebuffer_8 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer_8.clear();
		bytebuffer_8.asIntBuffer().put(ints_5, i_6, i_3 * i_7);
		IDirect3DTexture.Upload(this.aLong4168, 0, 0, 0, i_2, i_3, this.aClass150_4167.anInt1959 * i_7, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
	}

	public int method55() {
		return this.anInt9154;
	}

	public int method59() {
		return this.anInt9157;
	}

	public int method57() {
		return this.anInt9154;
	}

	public int method70() {
		return this.anInt9154;
	}

	public float method65(float f_1) {
		return f_1 / (float) this.anInt9154;
	}

	public float method56(float f_1) {
		return f_1 / (float) this.anInt9154;
	}

	public float method45(float f_1) {
		return f_1 / (float) this.anInt9154;
	}

	public float method60(float f_1) {
		return f_1 / (float) this.anInt9157;
	}

	public boolean method54() {
		return false;
	}

	public float method51(float f_1) {
		return f_1 / (float) this.anInt9157;
	}

	public int method1() {
		return this.anInt9154;
	}

	public void method64(boolean bool_1, boolean bool_2) {
		this.aBool9156 = bool_1;
		this.aBool9155 = bool_2;
	}

	public void method61(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		if (this.aClass150_4167 == Class150.aClass150_1949 && this.aClass76_4164 == Class76.aClass76_751) {
			if (i_7 == 0) {
				i_7 = i_3;
			}

			ByteBuffer bytebuffer_8 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
			bytebuffer_8.clear();
			bytebuffer_8.asIntBuffer().put(ints_5, i_6, i_7 * i_4);
			IDirect3DTexture.Upload(this.aLong4168, 0, i_1, i_2, i_3, i_4, i_7 * this.aClass150_4167.anInt1959 * -615555291 * 351642797, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
		} else {
			throw new RuntimeException();
		}
	}

	public void method205(Class35 class35_1) {
		super.method205(class35_1);
	}

	public void method67(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		if (this.aClass150_4167 == Class150.aClass150_1949 && this.aClass76_4164 == Class76.aClass76_751) {
			if (i_7 == 0) {
				i_7 = i_3;
			}

			ByteBuffer bytebuffer_8 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
			bytebuffer_8.clear();
			bytebuffer_8.asIntBuffer().put(ints_5, i_6, i_7 * i_4);
			IDirect3DTexture.Upload(this.aLong4168, 0, i_1, i_2, i_3, i_4, i_7 * this.aClass150_4167.anInt1959 * -615555291 * 351642797, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
		} else {
			throw new RuntimeException();
		}
	}

	public void method68(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
		if (this.aClass150_4167 == class150_6 && this.aClass76_4164 == Class76.aClass76_751) {
			if (i_8 == 0) {
				i_8 = i_3;
			}

			ByteBuffer bytebuffer_9 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
			bytebuffer_9.clear();
			bytebuffer_9.put(bytes_5, i_7, i_8 * i_4);
			IDirect3DTexture.Upload(this.aLong4168, 0, i_1, i_2, i_3, i_4, i_8 * this.aClass150_4167.anInt1959 * -615555291 * 351642797, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
		} else {
			throw new RuntimeException();
		}
	}

	public void method69(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6) {
		if (this.aClass150_4167 == Class150.aClass150_1949 && this.aClass76_4164 == Class76.aClass76_751) {
			ByteBuffer bytebuffer_7 = this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838;
			bytebuffer_7.clear();
			IDirect3DTexture.Download(this.aLong4168, 0, i_1, i_2, i_3, i_4, i_3 * 4, 0, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
			bytebuffer_7.asIntBuffer().get(ints_5, i_6, i_3 * i_4);
		} else {
			throw new RuntimeException();
		}
	}

	public boolean method49() {
		return false;
	}

	public void method203() {
		this.aGraphicalRenderer_Sub2_Sub2_4165.method15647(this);
	}

	public void method32() {
		super.method26();
	}

	public void method206(Class35 class35_1) {
		super.method205(class35_1);
	}

	public float method58(float f_1) {
		return f_1 / (float) this.anInt9157;
	}

	public void method202(Class35 class35_1) {
		super.method205(class35_1);
	}

	public int method71() {
		return this.anInt9157;
	}

	public int method72() {
		return this.anInt9157;
	}

}
