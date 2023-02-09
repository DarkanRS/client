package com.rs.jagex;

public class Class514 {

	static int INSTANCE_NUMBER;

	static int method8840(char var_0) {
		return var_0 >= 0 && var_0 < Class480.anIntArray5715.length ? Class480.anIntArray5715[var_0] : -1;
	}

	static Class149_Sub2 method8842(ByteBuf rsbytebuffer_0) {
		return new Class149_Sub2(rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.readUnsignedByte());
	}

	Class514() throws Throwable {
		throw new Error();
	}
}
