package com.rs.jagex;

public class PlaySoundVorbisCutsceneAction extends CutsceneAction {

	static boolean method14577() {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5879);
	}

	AreadSound aClass268_9271;

	int anInt9270;

	int anInt9269;

	int anInt9272;

	int anInt9268;

	PlaySoundVorbisCutsceneAction(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt9270 = rsbytebuffer_1.readUnsignedShort();
		anInt9269 = rsbytebuffer_1.readUnsignedByte();
		anInt9272 = rsbytebuffer_1.readUnsignedByte();
		anInt9268 = rsbytebuffer_1.readUnsignedByte();
	}

	@Override
	public void method1592() {
		aClass268_9271 = Class435.playSoundVorbis(anInt9270, anInt9268, 0, anInt9269, false, anInt9272);
	}

	@Override
	void method1593() {
		if (aClass268_9271 != null) {
			QuickchatFiller.method1142(aClass268_9271);
			aClass268_9271 = null;
		}
	}

	public void method1601() {
		aClass268_9271 = Class435.playSoundVorbis(983294899 * anInt9270 * -1315470469, anInt9268 * 1609664985 * -573413783, 0, anInt9269 * -957613339 * -840420627, false, 177588843 * anInt9272 * -1529769405);
	}
}
