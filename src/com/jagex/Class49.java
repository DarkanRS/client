package com.jagex;
public class Class49 {

	static Object anObject482;
	static Object anObject477;
	static Object anObject483;
	public Interface1 anInterface1_480 = null;
	Interface6[] anInterface6Array476 = null;
	Interface1 anInterface1_475 = null;
	public Interface6[] anInterface6Array478 = null;
	public Interface1 anInterface1_479 = null;
	GraphicalRenderer_Sub2 aGraphicalRenderer_Sub2_481;
	public boolean aBool474;

	static void method968() {
		byte[] bytes_1;
		if (anObject482 == null) {
			Class370_Sub1_Sub1 class370_sub1_sub1_0 = new Class370_Sub1_Sub1();
			bytes_1 = class370_sub1_sub1_0.method15431();
			anObject482 = JS5Manager.method5493(bytes_1, (byte) 97);
		}

		if (anObject477 == null) {
			Class370_Sub2_Sub1 class370_sub2_sub1_2 = new Class370_Sub2_Sub1();
			bytes_1 = class370_sub2_sub1_2.method15442();
			anObject477 = JS5Manager.method5493(bytes_1, (byte) 80);
		}

	}

	public boolean method969() {
		if (!this.aGraphicalRenderer_Sub2_481.aBool8827) {
			return false;
		} else {
			if (this.anInterface1_480 == null) {
				byte[] bytes_1;
				if (anObject483 == null) {
					bytes_1 = Class264.method4782(new Class261_Sub1());
					anObject483 = JS5Manager.method5493(bytes_1, (byte) 40);
				}

				bytes_1 = QuickChatMessage.method6154(anObject483, false);
				byte[] bytes_2 = new byte[bytes_1.length * 4];
				int i_3 = 0;

				for (int i_4 = 0; i_4 < 16; i_4++) {
					int i_5 = i_4 * 16384;
					int i_6 = i_5;

					for (int i_7 = 0; i_7 < 128; i_7++) {
						int i_8 = i_6 + i_7 * 128;
						int i_9 = i_6 + (i_7 - 1 & 0x7f) * 128;
						int i_10 = (i_7 + 1 & 0x7f) * 128 + i_6;

						for (int i_11 = 0; i_11 < 128; i_11++) {
							float f_12 = (float) ((bytes_1[i_9 + i_11] & 0xff) - (bytes_1[i_10 + i_11] & 0xff));
							float f_13 = (float) ((bytes_1[i_8 + (i_11 - 1 & 0x7f)] & 0xff) - (bytes_1[(i_11 + 1 & 0x7f) + i_8] & 0xff));
							float f_14 = (float) (128.0D / Math.sqrt((double) (f_13 * f_13 + 16384.0F + f_12 * f_12)));
							bytes_2[i_3++] = (byte) ((int) (f_13 * f_14 + 127.0F));
							bytes_2[i_3++] = (byte) ((int) (128.0F * f_14 + 127.0F));
							bytes_2[i_3++] = (byte) ((int) (f_12 * f_14 + 127.0F));
							bytes_2[i_3++] = bytes_1[i_5++];
						}
					}
				}

				this.anInterface1_480 = this.aGraphicalRenderer_Sub2_481.method13962(Class150.aClass150_1949, bytes_2);
			}

			return this.anInterface1_480 != null;
		}
	}

	Class49(GraphicalRenderer_Sub2 class505_sub2_1) {
		this.aGraphicalRenderer_Sub2_481 = class505_sub2_1;
		this.aBool474 = this.aGraphicalRenderer_Sub2_481.aBool8827;
		if (this.aBool474 && !this.aGraphicalRenderer_Sub2_481.method13955(Class150.aClass150_1952, Class76.aClass76_751)) {
			this.aBool474 = false;
		}

		if (this.aBool474 || this.aGraphicalRenderer_Sub2_481.method13954(Class150.aClass150_1952, Class76.aClass76_751)) {
			method968();
			if (!this.aBool474) {
				this.anInterface6Array476 = new Interface6[16];

				int i_2;
				byte[] bytes_3;
				for (i_2 = 0; i_2 < 16; i_2++) {
					bytes_3 = Node_Sub17_Sub5.method15410(anObject482, i_2 * 32768, -232784177);
					this.anInterface6Array476[i_2] = this.aGraphicalRenderer_Sub2_481.method13957(Class150.aClass150_1952, 128, 128, true, bytes_3);
				}

				this.anInterface6Array478 = new Interface6[16];

				for (i_2 = 0; i_2 < 16; i_2++) {
					bytes_3 = Node_Sub17_Sub5.method15410(anObject477, i_2 * 32768, -560964822);
					this.anInterface6Array478[i_2] = this.aGraphicalRenderer_Sub2_481.method13957(Class150.aClass150_1952, 128, 128, true, bytes_3);
				}
			} else {
				byte[] bytes_4 = QuickChatMessage.method6154(anObject482, false);
				this.anInterface1_475 = this.aGraphicalRenderer_Sub2_481.method13962(Class150.aClass150_1952, bytes_4);
				bytes_4 = QuickChatMessage.method6154(anObject477, false);
				this.anInterface1_479 = this.aGraphicalRenderer_Sub2_481.method13962(Class150.aClass150_1952, bytes_4);
			}
		}

	}

	public boolean method975() {
		return this.aBool474 ? this.anInterface1_475 != null : this.anInterface6Array476 != null;
	}

}
