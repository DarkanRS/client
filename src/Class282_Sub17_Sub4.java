public class Class282_Sub17_Sub4 extends Class282_Sub17 {

	public static int anInt9940;
	int anInt9937;
	int anInt9938;
	int anInt9939;
	int anInt9936;
	Class348 this$0;

	void method12255(Class61 class61_1) {
		class61_1.method1212(-31291083 * this.anInt9937 * 339755293, -1425966289 * this.anInt9938 * 1183558607, this.anInt9939 * 2031642257 * -53470607, this.anInt9936 * -1979650293 * 2126963875, (byte) 86);
	}

	void method12250(RsByteBuffer rsbytebuffer_1, int i_2) {
		this.anInt9937 = rsbytebuffer_1.readInt();
		this.anInt9938 = rsbytebuffer_1.readInt();
		this.anInt9939 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9936 = rsbytebuffer_1.readUnsignedByte();
	}

	void method12251(Class61 class61_1, int i_2) {
		class61_1.method1212(this.anInt9937, this.anInt9938, this.anInt9939, this.anInt9936, (byte) 62);
	}

	void method12254(Class61 class61_1) {
		class61_1.method1212(-31291083 * this.anInt9937 * 339755293, -1425966289 * this.anInt9938 * 1183558607, this.anInt9939 * 2031642257 * -53470607, this.anInt9936 * -1979650293 * 2126963875, (byte) 67);
	}

	void method12257(RsByteBuffer rsbytebuffer_1) {
		this.anInt9937 = rsbytebuffer_1.readInt() * 339755293 * -31291083;
		this.anInt9938 = rsbytebuffer_1.readInt() * 1183558607 * -1425966289;
		this.anInt9939 = rsbytebuffer_1.readUnsignedByte() * 2031642257 * -53470607;
		this.anInt9936 = rsbytebuffer_1.readUnsignedByte() * -1979650293 * 2126963875;
	}

	void method12249(RsByteBuffer rsbytebuffer_1) {
		this.anInt9937 = rsbytebuffer_1.readInt() * 339755293 * -31291083;
		this.anInt9938 = rsbytebuffer_1.readInt() * 1183558607 * -1425966289;
		this.anInt9939 = rsbytebuffer_1.readUnsignedByte() * 2031642257 * -53470607;
		this.anInt9936 = rsbytebuffer_1.readUnsignedByte() * -1979650293 * 2126963875;
	}

	Class282_Sub17_Sub4(Class348 class348_1) {
		this.this$0 = class348_1;
	}

	void method12258(Class61 class61_1) {
		class61_1.method1212(-31291083 * this.anInt9937 * 339755293, -1425966289 * this.anInt9938 * 1183558607, this.anInt9939 * 2031642257 * -53470607, this.anInt9936 * -1979650293 * 2126963875, (byte) 20);
	}

	void method12256(Class61 class61_1) {
		class61_1.method1212(-31291083 * this.anInt9937 * 339755293, -1425966289 * this.anInt9938 * 1183558607, this.anInt9939 * 2031642257 * -53470607, this.anInt9936 * -1979650293 * 2126963875, (byte) 62);
	}

	void method12252(Class61 class61_1) {
		class61_1.method1212(-31291083 * this.anInt9937 * 339755293, -1425966289 * this.anInt9938 * 1183558607, this.anInt9939 * 2031642257 * -53470607, this.anInt9936 * -1979650293 * 2126963875, (byte) 64);
	}

	void method12253(RsByteBuffer rsbytebuffer_1) {
		this.anInt9937 = rsbytebuffer_1.readInt() * 339755293 * -31291083;
		this.anInt9938 = rsbytebuffer_1.readInt() * 1183558607 * -1425966289;
		this.anInt9939 = rsbytebuffer_1.readUnsignedByte() * 2031642257 * -53470607;
		this.anInt9936 = rsbytebuffer_1.readUnsignedByte() * -1979650293 * 2126963875;
	}

	static final void method15406(CS2Executor cs2executor_0, int i_1) {
		boolean bool_2 = true;
		if (client.aBool7310) {
			try {
				Object object_3 = Class361.aClass361_4169.method6255((short) 7681);
				if (object_3 != null) {
					bool_2 = ((Boolean) object_3).booleanValue();
				}
			} catch (Throwable throwable_4) {
				;
			}
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = bool_2 ? 1 : 0;
	}

	static final void method15407(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.fog.method7785(i_2, -723558345);
	}

	static final void method15408(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		RenderAnimDefs renderanimdefs_3 = IndexLoaders.RENDER_ANIMS.getRenderAnimDefs(i_2, (byte) 12);
		if (renderanimdefs_3.anIntArray2814 != null && renderanimdefs_3.anIntArray2814.length > 0) {
			int i_4 = 0;
			int i_5 = renderanimdefs_3.anIntArray2789[0];

			for (int i_6 = 1; i_6 < renderanimdefs_3.anIntArray2814.length; i_6++) {
				if (renderanimdefs_3.anIntArray2789[i_6] > i_5) {
					i_4 = i_6;
					i_5 = renderanimdefs_3.anIntArray2789[i_6];
				}
			}

			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = renderanimdefs_3.anIntArray2814[i_4];
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = renderanimdefs_3.defaultStandAnimation;
		}

	}

	static final void method15409(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1686354780) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1386 = Class351.method6193(string_4, cs2executor_2, 1189927775);
		icomponentdefinitions_0.aBool1384 = true;
	}

}
