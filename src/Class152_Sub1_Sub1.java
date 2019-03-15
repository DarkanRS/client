public class Class152_Sub1_Sub1 extends Class152_Sub1 {

	static int[] anIntArray10082 = new int[6];
	static int[][] anIntArrayArray10076 = new int[6][];
	Class137_Sub2 aClass137_Sub2_10077;
	OpenGLGraphicalRenderer aClass505_Sub1_10079;
	int anInt10080;
	int anInt10085;
	int anInt10078;
	int anInt10083;
	int anInt10081;
	int anInt10084;

	Class137_Sub2 method13519() {
		if (this.aClass137_Sub2_10077 == null) {
			Interface22 interface22_1 = this.aClass505_Sub1_10079.anInterface22_5834;
			anIntArray10082[0] = this.anInt10081;
			anIntArray10082[1] = this.anInt10084;
			anIntArray10082[2] = this.anInt10080;
			anIntArray10082[3] = this.anInt10085;
			anIntArray10082[4] = this.anInt10078;
			anIntArray10082[5] = this.anInt10083;
			boolean bool_2 = false;
			int i_3 = 0;

			int i_4;
			for (i_4 = 0; i_4 < 6; i_4++) {
				if (!interface22_1.method139(anIntArray10082[i_4], -1020099398)) {
					return null;
				}

				TextureDetails class169_5 = interface22_1.method144(anIntArray10082[i_4], -2056544604);
				int i_6 = class169_5.isHalfSize ? 64 : 128;
				if (i_6 > i_3) {
					i_3 = i_6;
				}

				if (class169_5.useMipmaps > 0) {
					bool_2 = true;
				}
			}

			for (i_4 = 0; i_4 < 6; i_4++) {
				anIntArrayArray10076[i_4] = interface22_1.method140(anIntArray10082[i_4], 1.0F, i_3, i_3, false, (byte) 70);
			}

			this.aClass137_Sub2_10077 = new Class137_Sub2(this.aClass505_Sub1_10079, Class150.aClass150_1950, Class76.aClass76_751, i_3, bool_2, anIntArrayArray10076);
		}

		return this.aClass137_Sub2_10077;
	}

	Class152_Sub1_Sub1(OpenGLGraphicalRenderer class505_sub1_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		this.aClass505_Sub1_10079 = class505_sub1_1;
		this.anInt10080 = i_4;
		this.anInt10085 = i_5;
		this.anInt10078 = i_6;
		this.anInt10083 = i_7;
		this.anInt10081 = i_2;
		this.anInt10084 = i_3;
	}

	Class137_Sub2 method13520() {
		if (this.aClass137_Sub2_10077 == null) {
			Interface22 interface22_1 = this.aClass505_Sub1_10079.anInterface22_5834;
			anIntArray10082[0] = this.anInt10081;
			anIntArray10082[1] = this.anInt10084;
			anIntArray10082[2] = this.anInt10080;
			anIntArray10082[3] = this.anInt10085;
			anIntArray10082[4] = this.anInt10078;
			anIntArray10082[5] = this.anInt10083;
			boolean bool_2 = false;
			int i_3 = 0;

			int i_4;
			for (i_4 = 0; i_4 < 6; i_4++) {
				if (!interface22_1.method139(anIntArray10082[i_4], -1745982008)) {
					return null;
				}

				TextureDetails class169_5 = interface22_1.method144(anIntArray10082[i_4], -1803305965);
				int i_6 = class169_5.isHalfSize ? 64 : 128;
				if (i_6 > i_3) {
					i_3 = i_6;
				}

				if (class169_5.useMipmaps > 0) {
					bool_2 = true;
				}
			}

			for (i_4 = 0; i_4 < 6; i_4++) {
				anIntArrayArray10076[i_4] = interface22_1.method140(anIntArray10082[i_4], 1.0F, i_3, i_3, false, (byte) 74);
			}

			this.aClass137_Sub2_10077 = new Class137_Sub2(this.aClass505_Sub1_10079, Class150.aClass150_1950, Class76.aClass76_751, i_3, bool_2, anIntArrayArray10076);
		}

		return this.aClass137_Sub2_10077;
	}

	Class137_Sub2 method13521() {
		if (this.aClass137_Sub2_10077 == null) {
			Interface22 interface22_1 = this.aClass505_Sub1_10079.anInterface22_5834;
			anIntArray10082[0] = this.anInt10081;
			anIntArray10082[1] = this.anInt10084;
			anIntArray10082[2] = this.anInt10080;
			anIntArray10082[3] = this.anInt10085;
			anIntArray10082[4] = this.anInt10078;
			anIntArray10082[5] = this.anInt10083;
			boolean bool_2 = false;
			int i_3 = 0;

			int i_4;
			for (i_4 = 0; i_4 < 6; i_4++) {
				if (!interface22_1.method139(anIntArray10082[i_4], -2037265679)) {
					return null;
				}

				TextureDetails class169_5 = interface22_1.method144(anIntArray10082[i_4], -1757106479);
				int i_6 = class169_5.isHalfSize ? 64 : 128;
				if (i_6 > i_3) {
					i_3 = i_6;
				}

				if (class169_5.useMipmaps > 0) {
					bool_2 = true;
				}
			}

			for (i_4 = 0; i_4 < 6; i_4++) {
				anIntArrayArray10076[i_4] = interface22_1.method140(anIntArray10082[i_4], 1.0F, i_3, i_3, false, (byte) 70);
			}

			this.aClass137_Sub2_10077 = new Class137_Sub2(this.aClass505_Sub1_10079, Class150.aClass150_1950, Class76.aClass76_751, i_3, bool_2, anIntArrayArray10076);
		}

		return this.aClass137_Sub2_10077;
	}

}
