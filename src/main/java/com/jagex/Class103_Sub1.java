package com.jagex;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class103_Sub1 extends Class103 {

	static NativeSprite method14490(byte[] bytes_0) {
		if (bytes_0 == null)
			throw new RuntimeException("");
		while (true)
			try {
				Image image_3 = Toolkit.getDefaultToolkit().createImage(bytes_0);
				MediaTracker mediatracker_4 = new MediaTracker(SubInterface.suppliedApplet);
				mediatracker_4.addImage(image_3, 0);
				mediatracker_4.waitForAll();
				int i_5 = image_3.getWidth(SubInterface.suppliedApplet);
				int i_6 = image_3.getHeight(SubInterface.suppliedApplet);
				if (!mediatracker_4.isErrorAny() && i_5 >= 0 && i_6 >= 0) {
					int[] ints_7 = new int[i_5 * i_6];
					PixelGrabber pixelgrabber_8 = new PixelGrabber(image_3, 0, 0, i_5, i_6, ints_7, 0, i_5);
					pixelgrabber_8.grabPixels();
					NativeSprite nativesprite_2 = Renderers.CURRENT_RENDERER.createNativeSprite(ints_7, i_5, i_5, i_6);
					return nativesprite_2;
				}

				throw new RuntimeException("");
			} catch (InterruptedException ignored) {
			}
	}
	Shader aClass101_9148;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_9144;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_9145;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_9149;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_9146;

	Matrix44 aClass384_9147 = new Matrix44();

	public Class103_Sub1(HardwareRenderer class505_sub2_1) throws Exception_Sub2 {
		super(class505_sub2_1);
		method14483();
	}

	boolean method14483() throws Exception_Sub2 {
		aClass101_9148 = aGraphicalRenderer_Sub2_1057.loadShader("Particle");
		aNode_Sub21_Sub1_9144 = aClass101_9148.method1691("WVPMatrix");
		aNode_Sub21_Sub1_9145 = aClass101_9148.method1691("DiffuseSampler");
		aNode_Sub21_Sub1_9149 = aClass101_9148.method1691("TexCoordMatrix");
		aNode_Sub21_Sub1_9146 = aClass101_9148.method1691("DiffuseColour");
		aClass101_9148.method1655(aClass101_9148.method1654());
		return true;
	}

	void method14486() {
		aClass101_9148.method1655(aClass101_9148.method1654());
		aClass101_9148.method1646();
		aClass101_9148.method1671(aNode_Sub21_Sub1_9145, 0, anInterface6_1059);
		aClass101_9148.method1668(aNode_Sub21_Sub1_9144, aClass384_9147);
		aClass101_9148.method1667(aNode_Sub21_Sub1_9149, aClass384_1058);
		aClass101_9148.method1696(aNode_Sub21_Sub1_9146, anInt1056);
	}

	@Override
	public void method1785(int i_1) {
		method14486();
		aGraphicalRenderer_Sub2_1057.method14002(Class352.aClass352_4098, 0, 4 * i_1, 0, i_1 * 2);
	}

	@Override
	public void method1786(Matrix44 matrix44_1) {
		aClass384_9147.copy(matrix44_1);
		aClass384_9147.multiply(aGraphicalRenderer_Sub2_1057.aClass384_8729);
	}

	@Override
	public void method1787(int i_1) {
		method14486();
		aGraphicalRenderer_Sub2_1057.method14002(Class352.aClass352_4098, 0, i_1 * 4, 0, i_1 * 2);
	}

	@Override
	public void method1788(Matrix44 matrix44_1) {
		aClass384_9147.copy(matrix44_1);
		aClass384_9147.multiply(aGraphicalRenderer_Sub2_1057.aClass384_8729);
	}

	@Override
	public void method1789(Matrix44 matrix44_1) {
		aClass384_9147.copy(matrix44_1);
		aClass384_9147.multiply(aGraphicalRenderer_Sub2_1057.aClass384_8729);
	}

	@Override
	public void method1790() {
		method14486();
		aGraphicalRenderer_Sub2_1057.method14150();
	}

	@Override
	public void method1791() {
		method14486();
		aGraphicalRenderer_Sub2_1057.method14150();
	}

	@Override
	public void method1792() {
		method14486();
		aGraphicalRenderer_Sub2_1057.method14150();
	}

}
