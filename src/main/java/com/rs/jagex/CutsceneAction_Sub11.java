package com.rs.jagex;

public class CutsceneAction_Sub11 extends CutsceneAction {

	int anInt9299;

	int anInt9300;

	int anInt9301;

	int anInt9302;

	int anInt9303;

	int anInt9304;

	CutsceneAction_Sub11(ByteBuf rsbytebuffer_1) {
		super(rsbytebuffer_1);
		anInt9299 = rsbytebuffer_1.readUnsignedShort();
		anInt9300 = rsbytebuffer_1.readUnsignedShort();
		anInt9301 = rsbytebuffer_1.readUnsignedShort();
		anInt9302 = rsbytebuffer_1.readUnsignedShort();
		anInt9303 = rsbytebuffer_1.readUnsignedShort();
		anInt9304 = rsbytebuffer_1.readUnsignedShort();
	}

	@Override
	public void method1592() {
		Class86.CUTSCENE_CAMERA_MOVEMENTS[anInt9299].method1363(0);
		Class86.CUTSCENE_CAMERA_MOVEMENTS[anInt9300].method1363(1);
		client.anInt7277 = 0;
		client.anInt7279 = anInt9301;
		client.anInt7256 = 0;
		client.anInt7327 = anInt9303;
		client.anInt7182 = anInt9304;
		client.anInt7448 = 1;
		client.anInt7280 = anInt9302;
		Camera.STATE = 3;
		SpotAnimIndexLoader.method8860();
		client.aBool7321 = true;
	}

	public void method1601() {
		Class86.CUTSCENE_CAMERA_MOVEMENTS[136884767 * anInt9299 * -1845605921].method1363(0);
		Class86.CUTSCENE_CAMERA_MOVEMENTS[anInt9300 * 2006204237 * 1097011589].method1363(1);
		client.anInt7277 = 0;
		client.anInt7279 = anInt9301 * 1340850825 * 456369407 * 1010790215;
		client.anInt7256 = 0;
		client.anInt7327 = -1526006307 * anInt9303 * -666467409 * -768126693;
		client.anInt7182 = anInt9304 * -244194861 * -722833781 * 1448302961;
		client.anInt7448 = 1044733407 * -74015201;
		client.anInt7280 = anInt9302 * -692766461 * 1496611753 * -1508573389;
		Camera.STATE = 1155732519 * -672443707;
		SpotAnimIndexLoader.method8860();
		client.aBool7321 = true;
	}
}
