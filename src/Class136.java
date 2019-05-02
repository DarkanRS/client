public class Class136 {

	static Object anObject1637;
	static Object anObject1627;
	static Object anObject1628;
	Class137_Sub1[] aClass137_Sub1Array1632 = null;
	Class137_Sub4 aClass137_Sub4_1633 = null;
	Class137_Sub1[] aClass137_Sub1Array1634 = null;
	Class137_Sub4 aClass137_Sub4_1636 = null;
	Class137_Sub4 aClass137_Sub4_1638 = null;
	boolean aBool1631;

	static void method2348(OpenGLGraphicalRenderer class505_sub1_0) {
		byte[] bytes_2;
		if (anObject1637 == null) {
			Class370_Sub1_Sub2 class370_sub1_sub2_1 = new Class370_Sub1_Sub2();
			bytes_2 = class370_sub1_sub2_1.method15614();
			anObject1637 = JS5Manager.method5493(bytes_2, (byte) 83);
		}

		if (anObject1627 == null) {
			Class370_Sub2_Sub2 class370_sub2_sub2_3 = new Class370_Sub2_Sub2();
			bytes_2 = class370_sub2_sub2_3.method15617();
			anObject1627 = JS5Manager.method5493(bytes_2, (byte) 37);
		}

		Class164 class164_4 = class505_sub1_0.aClass164_8363;
		if (class164_4.method2847() && anObject1628 == null) {
			bytes_2 = Class264.method4782(new Class261_Sub1());
			anObject1628 = JS5Manager.method5493(bytes_2, (byte) 61);
		}

	}

	Class136(OpenGLGraphicalRenderer class505_sub1_1) {
		this.aBool1631 = class505_sub1_1.aBool8393;
		method2348(class505_sub1_1);
		if (!this.aBool1631) {
			this.aClass137_Sub1Array1632 = new Class137_Sub1[16];

			int i_2;
			byte[] bytes_3;
			for (i_2 = 0; i_2 < 16; i_2++) {
				bytes_3 = Node_Sub17_Sub5.method15410(anObject1637, i_2 * 32768, -1014539390);
				this.aClass137_Sub1Array1632[i_2] = new Class137_Sub1(class505_sub1_1, 3553, Class150.aClass150_1952, Class76.aClass76_751, 128, 128, true, bytes_3, Class150.aClass150_1952, false);
			}

			this.aClass137_Sub1Array1634 = new Class137_Sub1[16];

			for (i_2 = 0; i_2 < 16; i_2++) {
				bytes_3 = Node_Sub17_Sub5.method15410(anObject1627, i_2 * 32768, 675773741);
				this.aClass137_Sub1Array1634[i_2] = new Class137_Sub1(class505_sub1_1, 3553, Class150.aClass150_1952, Class76.aClass76_751, 128, 128, true, bytes_3, Class150.aClass150_1952, false);
			}
		} else {
			byte[] bytes_5 = QuickChatMessage.method6154(anObject1637, false);
			this.aClass137_Sub4_1633 = new Class137_Sub4(class505_sub1_1, Class150.aClass150_1952, Class76.aClass76_751, bytes_5, Class150.aClass150_1952);
			bytes_5 = QuickChatMessage.method6154(anObject1627, false);
			this.aClass137_Sub4_1636 = new Class137_Sub4(class505_sub1_1, Class150.aClass150_1952, Class76.aClass76_751, bytes_5, Class150.aClass150_1952);
			Class164 class164_6 = class505_sub1_1.aClass164_8363;
			if (class164_6.method2847()) {
				bytes_5 = QuickChatMessage.method6154(anObject1628, false);
				this.aClass137_Sub4_1638 = new Class137_Sub4(class505_sub1_1, Class150.aClass150_1949, Class76.aClass76_751);
				Class137_Sub4 class137_sub4_4 = new Class137_Sub4(class505_sub1_1, Class150.aClass150_1948, Class76.aClass76_751, bytes_5, Class150.aClass150_1948);
				if (!class164_6.method2848(this.aClass137_Sub4_1638, class137_sub4_4)) {
					this.aClass137_Sub4_1638.method2378();
					this.aClass137_Sub4_1638 = null;
				} else {
					this.aClass137_Sub4_1638.method2353();
				}

				class137_sub4_4.method2378();
			}
		}

	}

}
