package com.jagex;
public final class Class514 {

	static int anInt5887;

	Class514() throws Throwable {
		throw new Error();
	}

	static int method8840(char var_0, int i_1) {
		return var_0 >= 0 && var_0 < Class480.anIntArray5715.length ? Class480.anIntArray5715[var_0] : -1;
	}

	public static final void method8841(int i_0) {
		for (int i_1 = 0; i_1 < 5; i_1++) {
			client.CAM_SHAKING[i_1] = false;
		}
		client.anInt7277 = -1;
		client.anInt7448 = -1;
		LinkedNodeList.anInt5606 = 0;
		Class501.anInt5828 = 0;
		NativeLibraryLoader.anInt3240 = 2;
		Class86.anInt833 = -1;
		PingRequester.anInt5864 = -1;
	}

	static Class149_Sub2 method8842(RsByteBuffer rsbytebuffer_0) {
		return new Class149_Sub2(rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.readUnsignedByte());
	}
}
