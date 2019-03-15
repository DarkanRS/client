public class Class167 {

	SoftCache aClass229_2044 = new SoftCache(256);
	OpenGLGraphicalRenderer aClass505_Sub1_2042;
	Interface22 anInterface22_2043;

	Class137_Sub1 method2857(int i_1, int i_2) {
		Object object_3 = this.aClass229_2044.get((long) i_1);
		if (object_3 != null) {
			return (Class137_Sub1) object_3;
		} else if (!this.anInterface22_2043.method139(i_1, -1358664924)) {
			return null;
		} else {
			TextureDetails class169_4 = this.anInterface22_2043.method144(i_1, -2078681696);
			if (i_2 == -1) {
				i_2 = class169_4.isHalfSize ? 64 : this.aClass505_Sub1_2042.anInt8349;
			}

			Class137_Sub1 class137_sub1_5;
			if (class169_4.hdr && this.aClass505_Sub1_2042.method8471()) {
				float[] floats_7 = this.anInterface22_2043.method145(i_1, i_2, i_2);
				class137_sub1_5 = new Class137_Sub1(this.aClass505_Sub1_2042, Class150.aClass150_1949, Class76.aClass76_755, i_2, i_2, class169_4.useMipmaps != 0, floats_7, Class150.aClass150_1949);
			} else {
				int[] ints_6;
				if (class169_4.blendType != 2 && Class282_Sub41.method13367(class169_4.effectId, (short) 8231)) {
					ints_6 = this.anInterface22_2043.method140(i_1, 0.7F, i_2, i_2, true, (byte) 47);
				} else {
					ints_6 = this.anInterface22_2043.method141(i_1, i_2, i_2, false, 1544969950);
				}

				class137_sub1_5 = new Class137_Sub1(this.aClass505_Sub1_2042, 3553, i_2, i_2, class169_4.useMipmaps != 0, ints_6, 0, 0, false);
			}

			class137_sub1_5.method14445(class169_4.repeatS, class169_4.repeatT);
			this.aClass229_2044.put(class137_sub1_5, (long) i_1);
			return class137_sub1_5;
		}
	}

	Class137_Sub1 method2858(int i_1) {
		return this.method2857(i_1, -1);
	}

	void method2860() {
		this.aClass229_2044.method3858(5, (byte) 49);
	}

	void method2861() {
		this.aClass229_2044.method3859(355316582);
	}

	Class167(OpenGLGraphicalRenderer class505_sub1_1, Interface22 interface22_2) {
		this.aClass505_Sub1_2042 = class505_sub1_1;
		this.anInterface22_2043 = interface22_2;
	}

}
