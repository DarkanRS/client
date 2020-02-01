package com.jagex;
public abstract class Transform_Sub1_Sub2 extends Transform_Sub1 {

	static int anInt9461;

	boolean method13030(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().coords;
		Class208 class208_3 = this.aClass206_7970.method3507(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, (byte) -22);
		return class208_3 != null && class208_3.aTransform_Sub1_Sub1_2659.aBool9459 ? this.aClass206_7970.aClass201_2600.method3273(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, class208_3.aTransform_Sub1_Sub1_2659.method12995(660913959) + this.method12995(-1468272747)) : this.aClass206_7970.aClass201_2600.method3271(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592);
	}

	final void method13016(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		throw new IllegalStateException();
	}

	boolean method13033() {
		Vector3 vector3_1 = this.method11166().coords;
		return this.aClass206_7970.aBoolArrayArray2651[((int) vector3_1.x >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2628 * this.aClass206_7970.anInt2652][this.aClass206_7970.anInt2652 + (((int) vector3_1.z >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2629)];
	}

	boolean method13029(byte b_1) {
		Vector3 vector3_2 = this.method11166().coords;
		return this.aClass206_7970.aBoolArrayArray2651[((int) vector3_2.x >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2628 + this.aClass206_7970.anInt2652][((int) vector3_2.z >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2629 + this.aClass206_7970.anInt2652];
	}

	final boolean method12985(int i_1) {
		return false;
	}

	final void method13013(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
		throw new IllegalStateException();
	}

	final void method12984(int i_1) {
		throw new IllegalStateException();
	}

	final boolean method13026() {
		return false;
	}

	final boolean method13011() {
		return false;
	}

	boolean method12988(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().coords;
		Class208 class208_3 = this.aClass206_7970.method3507(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, (byte) -12);
		return class208_3 != null && class208_3.aTransform_Sub1_Sub1_2659.aBool9459 ? this.aClass206_7970.aClass201_2600.method3273(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, class208_3.aTransform_Sub1_Sub1_2659.method12995(-300040140) + this.method12995(-669380437)) : this.aClass206_7970.aClass201_2600.method3271(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592);
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	boolean method13034() {
		Vector3 vector3_1 = this.method11166().coords;
		return this.aClass206_7970.aBoolArrayArray2651[((int) vector3_1.x >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2628 * this.aClass206_7970.anInt2652][this.aClass206_7970.anInt2652 + (((int) vector3_1.z >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2629)];
	}

	int method13024(Node_Sub24[] arr_1) {
		Vector3 vector3_2 = this.method11166().coords;
		return this.method13004((int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, arr_1);
	}

	int method13025(Node_Sub24[] arr_1) {
		Vector3 vector3_2 = this.method11166().coords;
		return this.method13004((int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, arr_1);
	}

	int method13031(Node_Sub24[] arr_1) {
		Vector3 vector3_2 = this.method11166().coords;
		return this.method13004((int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, arr_1);
	}

	int method12982(Node_Sub24[] arr_1) {
		Vector3 vector3_2 = this.method11166().coords;
		return this.method13004((int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, arr_1);
	}

	Transform_Sub1_Sub2(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		super(sceneobjectmanager_1);
		this.plane = (byte) i_5;
		this.collisionPlane = (byte) i_6;
		this.method11171(new Vector3((float) i_2, (float) i_3, (float) i_4));
	}

	final void method13021() {
		throw new IllegalStateException();
	}

	int method13036(Node_Sub24[] arr_1) {
		Vector3 vector3_3 = this.method11166().coords;
		return this.method13004((int) vector3_3.x >> this.aClass206_7970.anInt2592, (int) vector3_3.z >> this.aClass206_7970.anInt2592, arr_1);
	}

	boolean method13022(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().coords;
		Class208 class208_3 = this.aClass206_7970.method3507(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, (byte) -29);
		return class208_3 != null && class208_3.aTransform_Sub1_Sub1_2659.aBool9459 ? this.aClass206_7970.aClass201_2600.method3273(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, class208_3.aTransform_Sub1_Sub1_2659.method12995(-1585085886) + this.method12995(-849675272)) : this.aClass206_7970.aClass201_2600.method3271(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592);
	}

	boolean method13032() {
		Vector3 vector3_1 = this.method11166().coords;
		return this.aClass206_7970.aBoolArrayArray2651[((int) vector3_1.x >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2628 * this.aClass206_7970.anInt2652][this.aClass206_7970.anInt2652 + (((int) vector3_1.z >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2629)];
	}

	boolean method13037(GraphicalRenderer graphicalrenderer_1, int i_2) {
		Vector3 vector3_3 = this.method11166().coords;
		Class208 class208_4 = this.aClass206_7970.method3507(this.plane, (int) vector3_3.x >> this.aClass206_7970.anInt2592, (int) vector3_3.z >> this.aClass206_7970.anInt2592, (byte) 43);
		return class208_4 != null && class208_4.aTransform_Sub1_Sub1_2659.aBool9459 ? this.aClass206_7970.aClass201_2600.method3273(this.plane, (int) vector3_3.x >> this.aClass206_7970.anInt2592, (int) vector3_3.z >> this.aClass206_7970.anInt2592, class208_4.aTransform_Sub1_Sub1_2659.method12995(626314496) + this.method12995(-413929199)) : this.aClass206_7970.aClass201_2600.method3271(this.plane, (int) vector3_3.x >> this.aClass206_7970.anInt2592, (int) vector3_3.z >> this.aClass206_7970.anInt2592);
	}

	boolean method12998(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().coords;
		Class208 class208_3 = this.aClass206_7970.method3507(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, (byte) 22);
		return class208_3 != null && class208_3.aTransform_Sub1_Sub1_2659.aBool9459 ? this.aClass206_7970.aClass201_2600.method3273(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592, class208_3.aTransform_Sub1_Sub1_2659.method12995(-1436578253) + this.method12995(-206928837)) : this.aClass206_7970.aClass201_2600.method3271(this.plane, (int) vector3_2.x >> this.aClass206_7970.anInt2592, (int) vector3_2.z >> this.aClass206_7970.anInt2592);
	}

}
