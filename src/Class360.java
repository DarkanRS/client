import jagdx.IUnknown;

public abstract class Class360 implements Interface7 {

	long aLong4168 = 0L;
	GraphicalRenderer_Sub2_Sub2 aGraphicalRenderer_Sub2_Sub2_4165;
	Class150 aClass150_4167;
	Class76 aClass76_4164;
	boolean aBool4166;

	long method6245() {
		return this.aLong4168;
	}

	public void method205(Class35 class35_1) {
	}

	public void method26() {
		if (this.aLong4168 != 0L) {
			IUnknown.Release(this.aLong4168);
			this.aLong4168 = 0L;
		}

		this.aGraphicalRenderer_Sub2_Sub2_4165.method13885(this);
	}

	void method6246() {
		if (this.aLong4168 != 0L) {
			this.aGraphicalRenderer_Sub2_Sub2_4165.method15650(this.aLong4168);
			this.aLong4168 = 0L;
		}

	}

	Class360(GraphicalRenderer_Sub2_Sub2 class505_sub2_sub2_1, Class150 class150_2, Class76 class76_3, boolean bool_4, int i_5) {
		this.aGraphicalRenderer_Sub2_Sub2_4165 = class505_sub2_sub2_1;
		this.aClass150_4167 = class150_2;
		this.aClass76_4164 = class76_3;
		this.aBool4166 = bool_4;
		this.aGraphicalRenderer_Sub2_Sub2_4165.method13901(this);
	}

	public void method32() {
		if (this.aLong4168 != 0L) {
			IUnknown.Release(this.aLong4168);
			this.aLong4168 = 0L;
		}

		this.aGraphicalRenderer_Sub2_Sub2_4165.method13885(this);
	}

	public void finalize() {
		this.method6246();
	}

}
