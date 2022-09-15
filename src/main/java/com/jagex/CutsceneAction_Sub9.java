package com.jagex;

public class CutsceneAction_Sub9 extends CutsceneAction {

	static AccountCreationResponseOpcodes RECIEVED_RESPONSE;

	static int anInt9282;

	public static boolean method14585(int i_0) {
		return i_0 == (i_0 & -i_0);
	}

	int anInt9280;

	int anInt9279;

	SongReference aClass116_9281;

	CutsceneAction_Sub9(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt9280 = rsbytebuffer_1.readUnsignedShort();
		anInt9279 = rsbytebuffer_1.readUnsignedByte();
	}

	@Override
	public void method1592() {
		Class256.method4412(aClass116_9281, anInt9279);
	}

	@Override
	boolean method1599() {
		if (aClass116_9281 == null)
			aClass116_9281 = new SongReference(IndexLoaders.MUSIC_INDEX, anInt9280);
		return aClass116_9281.method1963();
	}

	public void method1601() {
		Class256.method4412(aClass116_9281, 68269153 * anInt9279 * -321392735);
	}
}
