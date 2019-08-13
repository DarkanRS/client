public class Transform_Sub1_Sub1_Sub6 extends Transform_Sub1_Sub1 implements SceneObject {

	Class200 aClass200_10537;

	ObjectIndexLoader aClass474_10542;

	int id;

	boolean aBool10536;

	byte aByte10539;

	byte aByte10540;

	boolean aBool10541;

	boolean aBool10543;

	boolean aBool10544;

	MeshRasterizer aMeshRasterizer_10535;

	Shadow aCacheableNode_Sub17_10538;

	public boolean method94() {
		return this.aBool10544;
	}

	boolean method13026() {
		return this.aBool10543;
	}

	boolean method12987(int i_1) {
		return this.aMeshRasterizer_10535 != null ? this.aMeshRasterizer_10535.i() : false;
	}

	public int method16115() {
		return this.aMeshRasterizer_10535 != null ? this.aMeshRasterizer_10535.N() / 4 : 15;
	}

	MeshRasterizer method16116(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		if (this.aMeshRasterizer_10535 != null && graphicalrenderer_1.method8452(this.aMeshRasterizer_10535.m(), i_2) == 0) {
			return this.aMeshRasterizer_10535;
		} else {
			Class452 class452_4 = this.method16117(graphicalrenderer_1, i_2, false);
			return class452_4 != null ? (MeshRasterizer) class452_4.anObject5443 : null;
		}
	}

	Class452 method16117(GraphicalRenderer graphicalrenderer_1, int i_2, boolean bool_3) {
		ObjectDefinitions objectdefinitions_5 = this.aClass474_10542.getObjectDefinitions(this.id);
		Ground class390_6;
		Ground class390_7;
		if (this.aBool10536) {
			class390_6 = this.aClass206_7970.aGroundArray2614[this.collisionPlane];
			class390_7 = this.aClass206_7970.aGroundArray2607[0];
		} else {
			class390_6 = this.aClass206_7970.aGroundArray2607[this.collisionPlane];
			if (this.collisionPlane < 3) {
				class390_7 = this.aClass206_7970.aGroundArray2607[this.collisionPlane + 1];
			} else {
				class390_7 = null;
			}
		}
		Vector3 vector3_8 = this.method11166().coords;
		return objectdefinitions_5.method8010(graphicalrenderer_1, i_2, this.aByte10539 != SceneObjectType.GROUND_INTERACT.type ? this.aByte10539 : SceneObjectType.SCENERY_INTERACT.type, SceneObjectType.GROUND_INTERACT.type == this.aByte10539 ? this.aByte10540 + 4 : this.aByte10540, class390_6, class390_7, (int) vector3_8.x, (int) vector3_8.y, (int) vector3_8.z, bool_3, (Class476) null, -333836235);
	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		Vector3 vector3_3 = this.method11166().coords;
		if (this.aClass200_10537 == null) {
			this.aClass200_10537 = EntityNode_Sub2.method12505((int) vector3_3.x, (int) vector3_3.y, (int) vector3_3.z, this.method16116(graphicalrenderer_1, 0, 1810045144), (byte) -15);
		}
		return this.aClass200_10537;
	}

	public Transform_Sub1_Sub1_Sub6(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, ObjectIndexLoader objectindexloader_3, ObjectDefinitions objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12, int i_13, int i_14, int i_15, int i_16, boolean bool_17) {
		super(sceneobjectmanager_1, i_5, i_6, i_7, i_8, i_9, i_11, i_12, i_13, i_14, objectdefinitions_4.supportsItems == 1, BuildEnvironment.method7853(i_15, i_16));
		this.aClass474_10542 = objectindexloader_3;
		this.id = objectdefinitions_4.id;
		this.collisionPlane = (byte) i_6;
		this.aBool10536 = bool_10;
		this.aByte10539 = (byte) i_15;
		this.aByte10540 = (byte) i_16;
		this.aBool10541 = objectdefinitions_4.interactable != 0 && !bool_10;
		this.aBool10543 = bool_17;
		this.aBool10544 = graphicalrenderer_2.method8402() && objectdefinitions_4.aBool5703 && !this.aBool10536 && Class393.preferences.sceneryShadows.method12624((byte) -6) != 0;
		int i_18 = 2048;
		if (this.aBool10543) {
			i_18 |= 0x10000;
		}
		if (objectdefinitions_4.aBool5711) {
			i_18 |= 0x80000;
		}
		Class452 class452_19 = this.method16117(graphicalrenderer_2, i_18, this.aBool10544);
		if (class452_19 != null) {
			this.aMeshRasterizer_10535 = (MeshRasterizer) class452_19.anObject5443;
			this.aCacheableNode_Sub17_10538 = (Shadow) class452_19.anObject5444;
			if (this.aBool10543 || objectdefinitions_4.aBool5711) {
				this.aMeshRasterizer_10535 = this.aMeshRasterizer_10535.method11289((byte) 0, i_18, false);
				if (objectdefinitions_4.aBool5711) {
					Class341 class341_20 = IndexLoaders.MAP_REGION_DECODER.method4426(1466531789);
					this.aMeshRasterizer_10535.PA(class341_20.anInt3992, class341_20.anInt3993, class341_20.anInt3994, class341_20.anInt3995);
				}
			}
		}
		this.method13008(1, (byte) -117);
	}

	public int method89(int i_1) {
		return this.aByte10539;
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10535 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = this.method11168();
			Class285 class285_3 = Class470.method7824(this.aBool10541, (byte) -109);
			this.aMeshRasterizer_10535.method11282(matrix44var_2, this.boundingBoxPolygons[0], 0);
			return class285_3;
		}
	}

	boolean method12985(int i_1) {
		return this.aBool10543;
	}

	void method13013(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
		if (class521_sub1_2 instanceof Transform_Sub1_Sub5_Sub1) {
			Transform_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_8 = (Transform_Sub1_Sub5_Sub1) class521_sub1_2;
			if (this.aMeshRasterizer_10535 != null && class521_sub1_sub5_sub1_8.aMeshRasterizer_10513 != null) {
				this.aMeshRasterizer_10535.method11269(class521_sub1_sub5_sub1_8.aMeshRasterizer_10513, i_3, i_4, i_5, bool_6);
			}
		} else if (class521_sub1_2 instanceof Transform_Sub1_Sub1_Sub6) {
			Transform_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_9 = (Transform_Sub1_Sub1_Sub6) class521_sub1_2;
			if (this.aMeshRasterizer_10535 != null && class521_sub1_sub1_sub6_9.aMeshRasterizer_10535 != null) {
				this.aMeshRasterizer_10535.method11269(class521_sub1_sub1_sub6_9.aMeshRasterizer_10535, i_3, i_4, i_5, bool_6);
			}
		}
	}

	void method12984(int i_1) {
		this.aBool10543 = false;
		if (this.aMeshRasterizer_10535 != null) {
			this.aMeshRasterizer_10535.KA(this.aMeshRasterizer_10535.m() & ~0x10000);
		}
	}

	public int getId(int i_1) {
		return this.id;
	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10535 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Class285 class285_4 = Class470.method7824(this.aBool10541, (byte) -118);
			this.aMeshRasterizer_10535.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			return class285_4;
		}
	}

	public int method92(int i_1) {
		return this.aByte10540;
	}

	public void method38() {
		if (this.aMeshRasterizer_10535 != null) {
			this.aMeshRasterizer_10535.method11259();
		}
	}

	public boolean method86(int i_1) {
		return this.aBool10544;
	}

	public void method96() {
		if (this.aMeshRasterizer_10535 != null) {
			this.aMeshRasterizer_10535.method11259();
		}
	}

	public void method88(GraphicalRenderer graphicalrenderer_1) {
		Object obj_3 = null;
		Shadow class282_sub50_sub17_4;
		if (this.aCacheableNode_Sub17_10538 == null && this.aBool10544) {
			Class452 class452_5 = this.method16117(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
		} else {
			class282_sub50_sub17_4 = this.aCacheableNode_Sub17_10538;
			this.aCacheableNode_Sub17_10538 = null;
		}
		Vector3 vector3_6 = this.method11166().coords;
		if (class282_sub50_sub17_4 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_4, this.collisionPlane, (int) vector3_6.x, (int) vector3_6.z, (boolean[]) null, (byte) -117);
		}
	}

	boolean method13001() {
		return this.aMeshRasterizer_10535 != null ? this.aMeshRasterizer_10535.i() : false;
	}

	public int method76() {
		return -1638295397 * this.id * 75533715;
	}

	public int method39() {
		return -1638295397 * this.id * 75533715;
	}

	public int method91() {
		return this.aByte10540;
	}

	public void method93(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10538 == null && this.aBool10544) {
			Class452 class452_4 = this.method16117(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10538;
			this.aCacheableNode_Sub17_10538 = null;
		}
		Vector3 vector3_5 = this.method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) -21);
		}
	}

	public int method77() {
		return this.aByte10539;
	}

	public void method90() {
		if (this.aMeshRasterizer_10535 != null) {
			this.aMeshRasterizer_10535.method11259();
		}
	}

	public int method13017() {
		return this.aMeshRasterizer_10535 != null ? this.aMeshRasterizer_10535.YA() : 0;
	}

	public boolean method95() {
		return this.aBool10544;
	}

	public void method83(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10538 == null && this.aBool10544) {
			Class452 class452_4 = this.method16117(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10538;
			this.aCacheableNode_Sub17_10538 = null;
		}
		Vector3 vector3_5 = this.method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) -17);
		}
	}

	public void method97(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10538 == null && this.aBool10544) {
			Class452 class452_4 = this.method16117(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10538;
			this.aCacheableNode_Sub17_10538 = null;
		}
		Vector3 vector3_5 = this.method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) -47);
		}
	}

	public void method98(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10538 == null && this.aBool10544) {
			Class452 class452_4 = this.method16117(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10538;
			this.aCacheableNode_Sub17_10538 = null;
		}
		Vector3 vector3_5 = this.method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) 98);
		}
	}

	boolean method12999() {
		return this.aMeshRasterizer_10535 != null ? !this.aMeshRasterizer_10535.u() : true;
	}

	boolean method13000() {
		return this.aMeshRasterizer_10535 != null ? this.aMeshRasterizer_10535.i() : false;
	}

	boolean method12986(int i_1) {
		return this.aMeshRasterizer_10535 != null ? !this.aMeshRasterizer_10535.u() : true;
	}

	boolean method13002() {
		return this.aMeshRasterizer_10535 != null ? this.aMeshRasterizer_10535.i() : false;
	}

	public int method13003() {
		return this.aMeshRasterizer_10535 != null ? this.aMeshRasterizer_10535.YA() : 0;
	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_5 = this.method16116(graphicalrenderer_1, 131072, 1404485768);
		if (meshrasterizer_5 != null) {
			Matrix44Var matrix44var_6 = this.method11168();
			return meshrasterizer_5.method11270(i_2, i_3, matrix44var_6, false, 0);
		} else {
			return false;
		}
	}

	public int method13005() {
		return this.aMeshRasterizer_10535 != null ? this.aMeshRasterizer_10535.YA() : 0;
	}

	public int method13006() {
		return this.aMeshRasterizer_10535 != null ? this.aMeshRasterizer_10535.YA() : 0;
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10535 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = this.method11168();
			Class285 class285_3 = Class470.method7824(this.aBool10541, (byte) 3);
			this.aMeshRasterizer_10535.method11282(matrix44var_2, this.boundingBoxPolygons[0], 0);
			return class285_3;
		}
	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10535 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = this.method11168();
			Class285 class285_3 = Class470.method7824(this.aBool10541, (byte) -31);
			this.aMeshRasterizer_10535.method11282(matrix44var_2, this.boundingBoxPolygons[0], 0);
			return class285_3;
		}
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
	}

	public void method85() {
		if (this.aMeshRasterizer_10535 != null) {
			this.aMeshRasterizer_10535.method11259();
		}
	}

	boolean method13011() {
		return this.aBool10543;
	}

	void method13016(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (class521_sub1_2 instanceof Transform_Sub1_Sub5_Sub1) {
			Transform_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_7 = (Transform_Sub1_Sub5_Sub1) class521_sub1_2;
			if (this.aMeshRasterizer_10535 != null && class521_sub1_sub5_sub1_7.aMeshRasterizer_10513 != null) {
				this.aMeshRasterizer_10535.method11269(class521_sub1_sub5_sub1_7.aMeshRasterizer_10513, i_3, i_4, i_5, bool_6);
			}
		} else if (class521_sub1_2 instanceof Transform_Sub1_Sub1_Sub6) {
			Transform_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_8 = (Transform_Sub1_Sub1_Sub6) class521_sub1_2;
			if (this.aMeshRasterizer_10535 != null && class521_sub1_sub1_sub6_8.aMeshRasterizer_10535 != null) {
				this.aMeshRasterizer_10535.method11269(class521_sub1_sub1_sub6_8.aMeshRasterizer_10535, i_3, i_4, i_5, bool_6);
			}
		}
	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().coords;
		if (this.aClass200_10537 == null) {
			this.aClass200_10537 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16116(graphicalrenderer_1, 0, -1544222422), (byte) 86);
		}
		return this.aClass200_10537;
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().coords;
		if (this.aClass200_10537 == null) {
			this.aClass200_10537 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16116(graphicalrenderer_1, 0, 1772745037), (byte) -101);
		}
		return this.aClass200_10537;
	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().coords;
		if (this.aClass200_10537 == null) {
			this.aClass200_10537 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16116(graphicalrenderer_1, 0, 2021240884), (byte) -103);
		}
		return this.aClass200_10537;
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_4 = this.method16116(graphicalrenderer_1, 131072, 1129524351);
		if (meshrasterizer_4 != null) {
			Matrix44Var matrix44var_5 = this.method11168();
			return meshrasterizer_4.method11270(i_2, i_3, matrix44var_5, false, 0);
		} else {
			return false;
		}
	}

	void method13021() {
		this.aBool10543 = false;
		if (this.aMeshRasterizer_10535 != null) {
			this.aMeshRasterizer_10535.KA(this.aMeshRasterizer_10535.m() & ~0x10000);
		}
	}

	void method13015() {
		this.aBool10543 = false;
		if (this.aMeshRasterizer_10535 != null) {
			this.aMeshRasterizer_10535.KA(this.aMeshRasterizer_10535.m() & ~0x10000);
		}
	}

	public void method87(GraphicalRenderer graphicalrenderer_1) {
		Object obj_3 = null;
		Shadow class282_sub50_sub17_4;
		if (this.aCacheableNode_Sub17_10538 == null && this.aBool10544) {
			Class452 class452_5 = this.method16117(graphicalrenderer_1, 262144, true);
			class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
		} else {
			class282_sub50_sub17_4 = this.aCacheableNode_Sub17_10538;
			this.aCacheableNode_Sub17_10538 = null;
		}
		Vector3 vector3_6 = this.method11166().coords;
		if (class282_sub50_sub17_4 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_4, this.collisionPlane, (int) vector3_6.x, (int) vector3_6.z, (boolean[]) null, (byte) -9);
		}
	}

	public int method12995(int i_1) {
		return this.aMeshRasterizer_10535 != null ? this.aMeshRasterizer_10535.YA() : 0;
	}

	public int method73() {
		return this.aByte10539;
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
	}
}
