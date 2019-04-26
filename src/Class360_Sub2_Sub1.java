import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class360_Sub2_Sub1 extends Class360_Sub2 implements Interface29 {

	public void method206(Class35 class35_1) {
		super.method205(class35_1);
	}

	public Interface9 method200() {
		return new Class376(this, 0);
	}

	public int method70() {
		return super.method1();
	}

	public int method1() {
		return super.method1();
	}

	public float method51(float f_1) {
		return super.method62(f_1);
	}

	public float method47(float f_1) {
		return super.method47(f_1);
	}

	public boolean method54() {
		return super.method54();
	}

	public boolean method46() {
		return super.method46();
	}

	public void method50(boolean bool_1, boolean bool_2) {
		super.method50(bool_1, bool_2);
	}

	public void method48(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		super.method48(i_1, i_2, i_3, i_4, ints_5, i_6, i_7);
	}

	public void method52(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
		super.method52(i_1, i_2, i_3, i_4, bytes_5, class150_6, i_7, i_8);
	}

	public void method53(int i_3, int i_4, int[] ints_5) {
		long long_7 = IDirect3DTexture.GetSurfaceLevel(this.aLong4168, 0);
		long long_9 = IDirect3DDevice.CreateRenderTarget(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, i_3, i_4, 21, 0, 0, true);
		if (Class25.method751(IDirect3DDevice.StretchRect(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, long_7, 0, 0, i_3, i_4, long_9, 0, 0, i_3, i_4, 1))) {
			IDirect3DSurface.Download(long_9, 0, 0, i_3, i_4, i_3 * 4, 16, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
			this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838.clear();
			this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838.asIntBuffer().get(ints_5);
		}

		IUnknown.Release(long_7);
		IUnknown.Release(long_9);
	}

	public void method204(Class35 class35_1) {
		super.method205(class35_1);
	}

	public void method205(Class35 class35_1) {
		super.method205(class35_1);
	}

	public void method26() {
		super.method26();
	}

	public void method32() {
		super.method26();
	}

	public int method55() {
		return super.method1();
	}

	public int method36() {
		return super.method1();
	}

	public int method57() {
		return super.method1();
	}

	public int method59() {
		return super.method59();
	}

	public float method60(float f_1) {
		return super.method62(f_1);
	}

	public float method56(float f_1) {
		return super.method47(f_1);
	}

	public float method45(float f_1) {
		return super.method47(f_1);
	}

	public int method71() {
		return super.method59();
	}

	public float method58(float f_1) {
		return super.method62(f_1);
	}

	public boolean method49() {
		return super.method54();
	}

	public boolean method63() {
		return super.method46();
	}

	public float method62(float f_1) {
		return super.method62(f_1);
	}

	public void method61(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		super.method48(i_1, i_2, i_3, i_4, ints_5, i_6, i_7);
	}

	public void method66(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		super.method48(i_1, i_2, i_3, i_4, ints_5, i_6, i_7);
	}

	public void method67(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6, int i_7) {
		super.method48(i_1, i_2, i_3, i_4, ints_5, i_6, i_7);
	}

	public void method68(int i_1, int i_2, int i_3, int i_4, byte[] bytes_5, Class150 class150_6, int i_7, int i_8) {
		super.method52(i_1, i_2, i_3, i_4, bytes_5, class150_6, i_7, i_8);
	}

	public void method69(int i_1, int i_2, int i_3, int i_4, int[] ints_5, int i_6) {
		long long_7 = IDirect3DTexture.GetSurfaceLevel(this.aLong4168, 0);
		long long_9 = IDirect3DDevice.CreateRenderTarget(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, i_3, i_4, 21, 0, 0, true);
		if (Class25.method751(IDirect3DDevice.StretchRect(this.aGraphicalRenderer_Sub2_Sub2_4165.aLong10252, long_7, i_1, i_2, i_3, i_4, long_9, 0, 0, i_3, i_4, 1))) {
			IDirect3DSurface.Download(long_9, 0, 0, i_3, i_4, i_3 * 4, 16, this.aGraphicalRenderer_Sub2_Sub2_4165.aLong8695);
			this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838.clear();
			this.aGraphicalRenderer_Sub2_Sub2_4165.aByteBuffer8838.asIntBuffer().get(ints_5);
		}

		IUnknown.Release(long_7);
		IUnknown.Release(long_9);
	}

	public void method207() {
		super.method207();
	}

	public void method203() {
		super.method207();
	}

	Class360_Sub2_Sub1(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, Class150 class150_2, Class76 class76_3, int i_4, int i_5) {
		super(class505_sub2_sub2_1, class150_2, class76_3, i_4, i_5, 1025, 0);
	}

	public float method65(float f_1) {
		return super.method47(f_1);
	}

	public void method64(boolean bool_1, boolean bool_2) {
		super.method50(bool_1, bool_2);
	}

	public void method202(Class35 class35_1) {
		super.method205(class35_1);
	}

	public Interface9 method199(int i_1) {
		return new Class376(this, i_1);
	}

	public void method201(Class35 class35_1) {
		super.method205(class35_1);
	}

	public int method72() {
		return super.method59();
	}

}
