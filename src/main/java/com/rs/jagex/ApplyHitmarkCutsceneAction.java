package com.rs.jagex;

public class ApplyHitmarkCutsceneAction extends CutsceneAction {

	int anInt9369;

	int anInt9370;

	int anInt9371;

	int anInt9373;

	int anInt9372;

	ApplyHitmarkCutsceneAction(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt9369 = rsbytebuffer_1.readUnsignedShort();
		int i_2 = rsbytebuffer_1.readUnsignedByte();
		if ((i_2 & 0x1) != 0) {
			anInt9370 = rsbytebuffer_1.readUnsignedShort();
			anInt9371 = rsbytebuffer_1.readUnsignedShort();
		} else {
			anInt9370 = -1;
			anInt9371 = -1;
		}
		if ((i_2 & 0x2) != 0) {
			anInt9373 = rsbytebuffer_1.readUnsignedShort();
			anInt9372 = rsbytebuffer_1.readUnsignedShort();
		} else {
			anInt9373 = -1;
			anInt9372 = -1;
		}
		if ((i_2 & 0x4) != 0) {
			int i_3 = rsbytebuffer_1.readUnsignedShort();
			int i_4 = rsbytebuffer_1.readUnsignedShort();
			int i_5 = i_3 * 255 / i_4;
			boolean bool_6;
			if (i_3 > 0 && i_5 < 1)
				bool_6 = true;
		}
	}

	public static int method14641() {
		boolean bool_1 = true;
		boolean bool_2 = false;
		boolean bool_3 = false;
		if (Class11.SYSTEM_INFO.ram < 512 && Class11.SYSTEM_INFO.ram != 0)
			bool_1 = false;
		if (GroundItemStrategy.aString8069.startsWith("win")) {
			bool_3 = true;
			bool_2 = true;
		} else
			bool_2 = true;
		if (Class188.aBool2378)
			bool_1 = false;
		if (Class188.aBool2377)
			bool_2 = false;
		if (Class188.aBool2372)
			bool_3 = false;
		if (!bool_1 && !bool_2 && !bool_3)
			return ServerEnvironment.method8313();
		int i_4 = -1;
		int i_5 = -1;
		int i_6 = -1;
		if (bool_1)
			try {
				i_4 = Class383.method6513(2, 1000);
			} catch (Exception ignored) {
			}
		if (bool_3)
			try {
				i_6 = Class383.method6513(3, 1000);
				if (Class393.preferences.currentToolkit.getValue() == 3) {
					RendererInfo class168_7 = Renderers.CURRENT_RENDERER.method8392();
					long long_8 = class168_7.driverVersion & 0xffffffffffffL;
					switch (class168_7.id) {
					case 4098:
						bool_2 &= long_8 >= 60129613779L;
						break;
					case 4318:
						bool_2 &= long_8 >= 64425238954L;
					}
				}
			} catch (Exception ignored) {
			}
		if (bool_2)
			try {
				i_5 = Class383.method6513(1, 1000);
			} catch (Exception ignored) {
			}
		if (i_4 == -1 && i_5 == -1 && i_6 == -1)
			return ServerEnvironment.method8313();
		else {
			i_6 = (int) (i_6 * 1.1F);
			i_5 = (int) (i_5 * 1.1F);
			return i_4 > i_6 && i_4 > i_5 ? Class470.method7823(i_4) : (i_6 > i_5 ? FontRenderer_Sub1.method13782(3, i_6) : FontRenderer_Sub1.method13782(1, i_5));
		}
	}

	static boolean method14643(IComponentDefinitions icomponentdefinitions_0) {
		IFEvents class282_sub10_2 = client.getIComponentSettings(icomponentdefinitions_0);
		return class282_sub10_2.depthFlags() > 0 || (class282_sub10_2.ignoresDepthFlags() || icomponentdefinitions_0.aClass118_1379 != null);
	}

	@Override
	public void method1592() {
		PathingEntity animable_2 = Class82.CUTSCENE_ENTITIES[anInt9369].method1342();
		animable_2.applyHit(anInt9370, anInt9371, anInt9373, anInt9372, client.FRAME_COUNT, 0);
	}

	public void method1601() {
		PathingEntity animable_1 = Class82.CUTSCENE_ENTITIES[1276816799 * anInt9369 * 565784159].method1342();
		animable_1.applyHit(-2146354133 * anInt9370 * 1355915907, 2002383587 * anInt9371 * 1673585355, anInt9373 * 306986489 * 117044297, anInt9372 * -491483183 * 1810377009, client.FRAME_COUNT * 1968179203 * -1809259861, 0);
	}
}
