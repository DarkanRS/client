public abstract class SceneObjectNode extends Class521_Sub1 {

	public short aShort9561;

	int method13036(Class282_Sub24[] arr_1) {
		Vector3 vector3_3 = this.method11166().aClass385_3595;
		return this.method13004((int) vector3_3.x >> this.aClass206_7970.anInt2592, (int) vector3_3.z >> this.aClass206_7970.anInt2592, arr_1);
	}

	boolean method13030(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		return this.aClass206_7970.aClass201_2600.method3271(this.aByte7968, (int) vector3_2.x >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157);
	}

	boolean method13037(GraphicalRenderer graphicalrenderer_1, int i_2) {
		Vector3 vector3_3 = this.method11166().aClass385_3595;
		return this.aClass206_7970.aClass201_2600.method3271(this.aByte7968, (int) vector3_3.x >> this.aClass206_7970.anInt2592, (int) vector3_3.z >> this.aClass206_7970.anInt2592);
	}

	boolean method13029(byte b_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		return this.aClass206_7970.aBoolArrayArray2651[((int) vector3_2.x >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2628 + this.aClass206_7970.anInt2652][((int) vector3_2.z >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2629 + this.aClass206_7970.anInt2652];
	}

	int method13024(Class282_Sub24[] arr_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		return this.method13004((int) vector3_2.x >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293, arr_1);
	}

	int method13025(Class282_Sub24[] arr_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		return this.method13004((int) vector3_2.x >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293, arr_1);
	}

	SceneObjectNode(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		super(sceneobjectmanager_1);
		this.plane = (byte) i_5;
		this.aByte7968 = (byte) i_6;
		this.aShort9561 = (short) i_7;
		this.method11171(new Vector3((float) i_2, (float) i_3, (float) i_4));
	}

	int method12982(Class282_Sub24[] arr_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		return this.method13004((int) vector3_2.x >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293, arr_1);
	}

	boolean method13022(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		return this.aClass206_7970.aClass201_2600.method3271(this.aByte7968, (int) vector3_2.x >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157);
	}

	boolean method13033() {
		Vector3 vector3_1 = this.method11166().aClass385_3595;
		return this.aClass206_7970.aBoolArrayArray2651[((int) vector3_1.x >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157) - -527863643 * this.aClass206_7970.anInt2628 * 453572397 + this.aClass206_7970.anInt2652 * 1632278577 * 1459994833][1459994833 * this.aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293) - 1580412859 * this.aClass206_7970.anInt2629 * -1765393037)];
	}

	int method13031(Class282_Sub24[] arr_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		return this.method13004((int) vector3_2.x >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293, arr_1);
	}

	boolean method12998(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		return this.aClass206_7970.aClass201_2600.method3271(this.aByte7968, (int) vector3_2.x >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157);
	}

	boolean method13032() {
		Vector3 vector3_1 = this.method11166().aClass385_3595;
		return this.aClass206_7970.aBoolArrayArray2651[((int) vector3_1.x >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157) - -527863643 * this.aClass206_7970.anInt2628 * 453572397 + this.aClass206_7970.anInt2652 * 1632278577 * 1459994833][1459994833 * this.aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293) - 1580412859 * this.aClass206_7970.anInt2629 * -1765393037)];
	}

	boolean method12988(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		return this.aClass206_7970.aClass201_2600.method3271(this.aByte7968, (int) vector3_2.x >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157);
	}

	boolean method13034() {
		Vector3 vector3_1 = this.method11166().aClass385_3595;
		return this.aClass206_7970.aBoolArrayArray2651[((int) vector3_1.x >> -1928575293 * this.aClass206_7970.anInt2592 * -2000283157) - -527863643 * this.aClass206_7970.anInt2628 * 453572397 + this.aClass206_7970.anInt2652 * 1632278577 * 1459994833][1459994833 * this.aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293) - 1580412859 * this.aClass206_7970.anInt2629 * -1765393037)];
	}

}
