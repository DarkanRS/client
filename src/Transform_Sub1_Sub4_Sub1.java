import java.util.Iterator;
import java.util.List;

public class Transform_Sub1_Sub4_Sub1 extends Transform_Sub1_Sub4 implements SceneObject {

	ObjectIndexLoader aClass474_10489;
	int anInt10482;
	boolean aBool10488;
	byte aByte10487;
	byte aByte10485;
	boolean aBool10481;
	boolean aBool10490;
	MeshRasterizer aMeshRasterizer_10483;
	Shadow aCacheableNode_Sub17_10486;
	Class200 aClass200_10484;

	public int method76() {
		return this.anInt10482 * 1535728455 * 462020215;
	}

	boolean method12986(int i_1) {
		return this.aMeshRasterizer_10483 != null ? !this.aMeshRasterizer_10483.u() : true;
	}

	boolean method12987(int i_1) {
		return this.aMeshRasterizer_10483 != null ? this.aMeshRasterizer_10483.i() : false;
	}

	public int method12995(int i_1) {
		return this.aMeshRasterizer_10483 != null ? this.aMeshRasterizer_10483.YA() : 0;
	}

	MeshRasterizer method16068(GraphicalRenderer graphicalrenderer_1, int i_2, byte b_3) {
		if (this.aMeshRasterizer_10483 != null && graphicalrenderer_1.method8452(this.aMeshRasterizer_10483.m(), i_2) == 0) {
			return this.aMeshRasterizer_10483;
		} else {
			Class452 class452_4 = this.method16069(graphicalrenderer_1, i_2, false, 1517561642);
			return class452_4 != null ? (MeshRasterizer) class452_4.anObject5443 : null;
		}
	}

	Class452 method16069(GraphicalRenderer graphicalrenderer_1, int i_2, boolean bool_3, int i_4) {
		ObjectDefinitions objectdefinitions_5 = this.aClass474_10489.getObjectDefinitions(this.anInt10482);
		Ground class390_6;
		Ground class390_7;
		if (this.aBool10488) {
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
		return objectdefinitions_5.method8010(graphicalrenderer_1, i_2, this.aByte10485, this.aByte10487, class390_6, class390_7, (int) vector3_8.x, (int) vector3_8.y, (int) vector3_8.z, bool_3, (Class476) null, 921813682);
	}

	public void method90() {
		if (this.aMeshRasterizer_10483 != null) {
			this.aMeshRasterizer_10483.method11259();
		}

	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10483 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = graphicalrenderer_1.method8450();
			matrix44var_3.method5209(this.method11168());
			matrix44var_3.method5219((float) this.aShort9611, 0.0F, (float) this.aShort9612);
			Class285 class285_4 = Class470.method7824(this.aBool10481, (byte) -111);
			this.aMeshRasterizer_10483.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			return class285_4;
		}
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_5 = this.method16068(graphicalrenderer_1, 131072, (byte) -65);
		if (meshrasterizer_5 != null) {
			Matrix44Var matrix44var_6 = this.method11168();
			return meshrasterizer_5.method11270(i_2, i_3, matrix44var_6, false, 0);
		} else {
			return false;
		}
	}

	public Transform_Sub1_Sub4_Sub1(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, ObjectIndexLoader objectindexloader_3, ObjectDefinitions objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12, int i_13, int i_14) {
		super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, i_11, i_12);
		this.aClass474_10489 = objectindexloader_3;
		this.anInt10482 = objectdefinitions_4.id;
		this.aBool10488 = bool_10;
		this.aByte10487 = (byte) i_14;
		this.aByte10485 = (byte) i_13;
		this.aBool10481 = objectdefinitions_4.interactable != 0 && !bool_10;
		this.aBool10490 = graphicalrenderer_2.method8402() && objectdefinitions_4.aBool5703 && !this.aBool10488 && Class393.preferences.sceneryShadows.method12624((byte) -12) != 0;
		int i_15 = 2048;
		if (objectdefinitions_4.aBool5711) {
			i_15 |= 0x80000;
		}

		Class452 class452_16 = this.method16069(graphicalrenderer_2, i_15, this.aBool10490, 1172907039);
		if (class452_16 != null) {
			this.aMeshRasterizer_10483 = (MeshRasterizer) class452_16.anObject5443;
			this.aCacheableNode_Sub17_10486 = (Shadow) class452_16.anObject5444;
			if (objectdefinitions_4.aBool5711) {
				this.aMeshRasterizer_10483 = this.aMeshRasterizer_10483.method11289((byte) 0, i_15, false);
				if (objectdefinitions_4.aBool5711) {
					Class341 class341_17 = IndexLoaders.MAP_REGION_DECODER.method4426(2127518782);
					this.aMeshRasterizer_10483.PA(class341_17.anInt3992, class341_17.anInt3993, class341_17.anInt3994, class341_17.anInt3995);
				}
			}
		}

		this.method13008(1, (byte) -102);
	}

	public int method13005() {
		return this.aMeshRasterizer_10483 != null ? this.aMeshRasterizer_10483.YA() : 0;
	}

	public int method92(int i_1) {
		return this.aByte10487;
	}

	public void method85() {
		if (this.aMeshRasterizer_10483 != null) {
			this.aMeshRasterizer_10483.method11259();
		}

	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10483 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
			matrix44var_2.method5209(this.method11168());
			matrix44var_2.method5219((float) this.aShort9611, 0.0F, (float) this.aShort9612);
			Class285 class285_3 = Class470.method7824(this.aBool10481, (byte) -46);
			this.aMeshRasterizer_10483.method11282(matrix44var_2, this.boundingBoxPolygons[0], 0);
			return class285_3;
		}
	}

	public void method87(GraphicalRenderer graphicalrenderer_1) {
		Object obj_3 = null;
		Shadow class282_sub50_sub17_4;
		if (this.aCacheableNode_Sub17_10486 == null && this.aBool10490) {
			Class452 class452_5 = this.method16069(graphicalrenderer_1, 262144, true, -395426412);
			class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
		} else {
			class282_sub50_sub17_4 = this.aCacheableNode_Sub17_10486;
			this.aCacheableNode_Sub17_10486 = null;
		}

		Vector3 vector3_6 = this.method11166().coords;
		if (class282_sub50_sub17_4 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_4, this.collisionPlane, (int) vector3_6.x, (int) vector3_6.z, (boolean[]) null, (byte) -33);
		}

	}

	public void method88(GraphicalRenderer graphicalrenderer_1) {
		Object obj_3 = null;
		Shadow class282_sub50_sub17_4;
		if (this.aCacheableNode_Sub17_10486 == null && this.aBool10490) {
			Class452 class452_5 = this.method16069(graphicalrenderer_1, 262144, true, 1476969150);
			class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
		} else {
			class282_sub50_sub17_4 = this.aCacheableNode_Sub17_10486;
			this.aCacheableNode_Sub17_10486 = null;
		}

		Vector3 vector3_6 = this.method11166().coords;
		if (class282_sub50_sub17_4 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_4, this.collisionPlane, (int) vector3_6.x, (int) vector3_6.z, (boolean[]) null, (byte) -18);
		}

	}

	boolean method13002() {
		return this.aMeshRasterizer_10483 != null ? this.aMeshRasterizer_10483.i() : false;
	}

	public int method39() {
		return this.anInt10482 * 1535728455 * 462020215;
	}

	public int method73() {
		return this.aByte10485;
	}

	boolean method12999() {
		return this.aMeshRasterizer_10483 != null ? !this.aMeshRasterizer_10483.u() : true;
	}

	public int method91() {
		return this.aByte10487;
	}

	public void method38() {
		if (this.aMeshRasterizer_10483 != null) {
			this.aMeshRasterizer_10483.method11259();
		}

	}

	public void method96() {
		if (this.aMeshRasterizer_10483 != null) {
			this.aMeshRasterizer_10483.method11259();
		}

	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		Vector3 vector3_3 = this.method11166().coords;
		if (this.aClass200_10484 == null) {
			this.aClass200_10484 = EntityNode_Sub2.method12505((int) vector3_3.x, (int) vector3_3.y, (int) vector3_3.z, this.method16068(graphicalrenderer_1, 0, (byte) 22), (byte) 106);
		}

		return this.aClass200_10484;
	}

	public boolean method94() {
		return this.aBool10490;
	}

	boolean method13000() {
		return this.aMeshRasterizer_10483 != null ? this.aMeshRasterizer_10483.i() : false;
	}

	public void method93(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10486 == null && this.aBool10490) {
			Class452 class452_4 = this.method16069(graphicalrenderer_1, 262144, true, -576169702);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10486;
			this.aCacheableNode_Sub17_10486 = null;
		}

		Vector3 vector3_5 = this.method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) -19);
		}

	}

	public void method83(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10486 == null && this.aBool10490) {
			Class452 class452_4 = this.method16069(graphicalrenderer_1, 262144, true, 991322100);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10486;
			this.aCacheableNode_Sub17_10486 = null;
		}

		Vector3 vector3_5 = this.method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) -64);
		}

	}

	public void method97(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10486 == null && this.aBool10490) {
			Class452 class452_4 = this.method16069(graphicalrenderer_1, 262144, true, -1308325866);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10486;
			this.aCacheableNode_Sub17_10486 = null;
		}

		Vector3 vector3_5 = this.method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) 44);
		}

	}

	public int getId(int i_1) {
		return this.anInt10482;
	}

	public void method98(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10486 == null && this.aBool10490) {
			Class452 class452_4 = this.method16069(graphicalrenderer_1, 262144, true, 6216150);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10486;
			this.aCacheableNode_Sub17_10486 = null;
		}

		Vector3 vector3_5 = this.method11166().coords;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) -74);
		}

	}

	public boolean method86(int i_1) {
		return this.aBool10490;
	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().coords;
		if (this.aClass200_10484 == null) {
			this.aClass200_10484 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16068(graphicalrenderer_1, 0, (byte) -75), (byte) -30);
		}

		return this.aClass200_10484;
	}

	public int method77() {
		return this.aByte10485;
	}

	public int method13003() {
		return this.aMeshRasterizer_10483 != null ? this.aMeshRasterizer_10483.YA() : 0;
	}

	boolean method13001() {
		return this.aMeshRasterizer_10483 != null ? this.aMeshRasterizer_10483.i() : false;
	}

	public boolean method95() {
		return this.aBool10490;
	}

	public int method13006() {
		return this.aMeshRasterizer_10483 != null ? this.aMeshRasterizer_10483.YA() : 0;
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10483 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
			matrix44var_2.method5209(this.method11168());
			matrix44var_2.method5219((float) this.aShort9611, 0.0F, (float) this.aShort9612);
			Class285 class285_3 = Class470.method7824(this.aBool10481, (byte) -51);
			this.aMeshRasterizer_10483.method11282(matrix44var_2, this.boundingBoxPolygons[0], 0);
			return class285_3;
		}
	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10483 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = graphicalrenderer_1.method8450();
			matrix44var_2.method5209(this.method11168());
			matrix44var_2.method5219((float) this.aShort9611, 0.0F, (float) this.aShort9612);
			Class285 class285_3 = Class470.method7824(this.aBool10481, (byte) -61);
			this.aMeshRasterizer_10483.method11282(matrix44var_2, this.boundingBoxPolygons[0], 0);
			return class285_3;
		}
	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().coords;
		if (this.aClass200_10484 == null) {
			this.aClass200_10484 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16068(graphicalrenderer_1, 0, (byte) -38), (byte) 41);
		}

		return this.aClass200_10484;
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
	}

	public int method89(int i_1) {
		return this.aByte10485;
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().coords;
		if (this.aClass200_10484 == null) {
			this.aClass200_10484 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16068(graphicalrenderer_1, 0, (byte) 32), (byte) 31);
		}

		return this.aClass200_10484;
	}

	public int method13017() {
		return this.aMeshRasterizer_10483 != null ? this.aMeshRasterizer_10483.YA() : 0;
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_4 = this.method16068(graphicalrenderer_1, 131072, (byte) -6);
		if (meshrasterizer_4 != null) {
			Matrix44Var matrix44var_5 = this.method11168();
			return meshrasterizer_4.method11270(i_2, i_3, matrix44var_5, false, 0);
		} else {
			return false;
		}
	}

	static void iComponentOnGroundTile(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2) {
		if (i_1 >= 0 && i_2 >= 0 && Class20.aClass384_158 != null) {
			CoordGrid coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
			Matrix44Arr matrix44arr_5 = graphicalrenderer_0.method8449();
			graphicalrenderer_0.method8424(Class20.aClass384_158);
			graphicalrenderer_0.method8457(Class20.aClass294_155);
			graphicalrenderer_0.r(Class20.anInt180, Class20.anInt181, Class20.anInt180 + Class20.anInt176, Class20.anInt184 + Class20.anInt181);
			graphicalrenderer_0.method8617(Class20.anInt180, Class20.anInt181, Class20.anInt176, Class20.anInt184);
			matrix44arr_5.fromVarMatrix44(Class20.aClass294_155);
			matrix44arr_5.method6523(Class20.aClass384_158);
			matrix44arr_5.method6524();
			int i_6 = i_1 - Class20.anInt180;
			int i_7 = i_2 - Class20.anInt181;
			int i_9;
			int i_21;
			int i_22;
			int i_51;
			if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null && (!client.aBool7344 || (Class506.USE_OPTIONS_FLAGS & 0x40) != 0)) {
				int i_8 = -1;
				i_9 = -1;
				float f_10 = 2.0F * (float) i_6 / (float) Class20.anInt176 - 1.0F;
				float f_11 = 2.0F * (float) i_7 / (float) Class20.anInt184 - 1.0F;
				matrix44arr_5.method6527(f_10, f_11, -1.0F, Class20.aFloatArray194);
				float f_12 = Class20.aFloatArray194[0] / Class20.aFloatArray194[3];
				float f_13 = Class20.aFloatArray194[1] / Class20.aFloatArray194[3];
				float f_14 = Class20.aFloatArray194[2] / Class20.aFloatArray194[3];
				matrix44arr_5.method6527(f_10, f_11, 1.0F, Class20.aFloatArray194);
				float f_15 = Class20.aFloatArray194[0] / Class20.aFloatArray194[3];
				float f_16 = Class20.aFloatArray194[1] / Class20.aFloatArray194[3];
				float f_17 = Class20.aFloatArray194[2] / Class20.aFloatArray194[3];
				float f_18 = Class4.method288(f_12, f_13, f_14, f_15, f_16, f_17, 4, -1077357745);
				if (f_18 > 0.0F) {
					float f_19 = f_15 - f_12;
					float f_20 = f_17 - f_14;
					i_21 = (int) (f_19 * f_18 + f_12);
					i_22 = (int) (f_18 * f_20 + f_14);
					i_8 = i_21 + (VertexNormal.MY_PLAYER.getSize() - 1 << 8) >> 9;
					i_9 = i_22 + (VertexNormal.MY_PLAYER.getSize() - 1 << 8) >> 9;
					byte b_23 = VertexNormal.MY_PLAYER.plane;
					if (b_23 < 3 && (IndexLoaders.MAP_REGION_DECODER.method4433().tileMasks[1][i_21 >> 9][i_22 >> 9] & 0x2) != 0) {
						i_51 = b_23 + 1;
					}
				}

				if (i_8 != -1 && i_9 != -1) {
					if (client.aBool7344 && (Class506.USE_OPTIONS_FLAGS & 0x40) != 0) {
						IComponentDefinitions icomponentdefinitions_30 = Index.getIComponentDefinitions(client.anInt56, client.anInt7345);
						if (icomponentdefinitions_30 != null) {
							PlayerAppearance.method4032(client.aString7275, " " + "->" + " ", Defaults8Loader.anInt5932, 59, -1, 0L, i_8, i_9, true, false, (long) (i_8 << 32 | i_9), true, -1546030291);
						} else {
							Class60.method1170();
						}
					} else {
						if (CutsceneAction_Sub6.SHOW_FACE_HERE) {
							PlayerAppearance.method4032(Message.FACE_HERE.translate(Class223.CURRENT_LANGUAGE), "", -1, 60, -1, 0L, i_8, i_9, true, false, (long) (i_8 << 32 | i_9), true, -1333249112);
						}

						PlayerAppearance.method4032(Class85.aString817, "", client.anInt7311, 23, -1, 0L, i_8, i_9, true, false, (long) (i_8 << 32 | i_9), true, -1883599124);
					}
				}
			}

			Login xlogin_31 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aClass284_2648;
			i_9 = i_1;
			int i_43 = i_2;
			List list_32 = xlogin_31.aList3388;
			Iterator iterator_33 = list_32.iterator();

			while (true) {
				int i_46;
				int i_47;
				ObjectDefinitions objectdefinitions_57;
				SceneObject sceneobject_60;
				String[] arr_63;
				do {
					Class285 class285_34;
					do {
						do {
							do {
								int i_28;
								int i_38;
								int i_42;
								int i_49;
								while (true) {
									Vector3 vector3_26;
									int i_41;
									while (true) {
										do {
											do {
												if (!iterator_33.hasNext()) {
													return;
												}

												class285_34 = (Class285) iterator_33.next();
											} while (!client.aBool7372 && class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);
										} while (!class285_34.method5019(graphicalrenderer_0, i_9, i_43));

										boolean bool_44 = false;
										boolean bool_45 = false;
										if (class285_34.aTransform_Sub1_3391 instanceof Transform_Sub1_Sub1) {
											i_46 = ((Transform_Sub1_Sub1) class285_34.aTransform_Sub1_3391).aShort9458;
											i_47 = ((Transform_Sub1_Sub1) class285_34.aTransform_Sub1_3391).aShort9456;
										} else {
											Vector3 vector3_35 = class285_34.aTransform_Sub1_3391.method11166().coords;
											i_46 = (int) vector3_35.x >> 9;
											i_47 = (int) vector3_35.z >> 9;
										}

										if (!(class285_34.aTransform_Sub1_3391 instanceof Player)) {
											break;
										}

										Player player_58 = (Player) class285_34.aTransform_Sub1_3391;
										i_49 = player_58.getSize();
										Vector3 vector3_36 = player_58.method11166().coords;
										if ((i_49 & 0x1) == 0 && ((int) vector3_36.x & 0x1ff) == 0 && ((int) vector3_36.z & 0x1ff) == 0 || (i_49 & 0x1) == 1 && ((int) vector3_36.x & 0x1ff) == 256 && ((int) vector3_36.z & 0x1ff) == 256) {
											i_21 = (int) vector3_36.x - (player_58.getSize() - 1 << 8);
											i_22 = (int) vector3_36.z - (player_58.getSize() - 1 << 8);

											for (i_51 = 0; i_51 < client.NPC_UPDATE_INDEX; i_51++) {
												StringNode class282_sub47_24 = (StringNode) client.NPCS.get((long) client.NPC_UPDATE_INDICES[i_51]);
												if (class282_sub47_24 != null) {
													NPC npc_40 = (NPC) class282_sub47_24.anObject8068;
													if (npc_40.anInt10375 != client.cycles && npc_40.aBool10318) {
														vector3_26 = npc_40.method11166().coords;
														i_41 = (int) vector3_26.x - (npc_40.definitions.size - 1 << 8);
														i_28 = (int) vector3_26.z - (npc_40.definitions.size - 1 << 8);
														if (i_41 >= i_21 && npc_40.definitions.size <= player_58.getSize() - (i_41 - i_21 >> 9) && i_28 >= i_22 && npc_40.definitions.size <= player_58.getSize() - (i_28 - i_22 >> 9)) {
															MapAreaDefinitions.iComponentOnNPC(npc_40, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane, 1752430415);
															npc_40.anInt10375 = client.cycles;
														}
													}
												}
											}

											i_51 = Class197.NUM_PLAYER_INDICES;
											int[] ints_53 = Class197.PLAYER_INDICES;

											for (int i_25 = 0; i_25 < i_51; i_25++) {
												Player player_55 = client.players[ints_53[i_25]];
												if (player_55 != null && player_55.anInt10375 != client.cycles && player_58 != player_55 && player_55.aBool10318) {
													Vector3 vector3_27 = player_55.method11166().coords;
													i_28 = (int) vector3_27.x - (player_55.getSize() - 1 << 8);
													int i_29 = (int) vector3_27.z - (player_55.getSize() - 1 << 8);
													if (i_28 >= i_21 && player_55.getSize() <= player_58.getSize() - (i_28 - i_21 >> 9) && i_29 >= i_22 && player_55.getSize() <= player_58.getSize() - (i_29 - i_22 >> 9)) {
														CutsceneAction_Sub22.iComponentOnPlayer(player_55, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);
														player_55.anInt10375 = client.cycles;
													}
												}
											}
										}

										if (player_58.anInt10375 != client.cycles) {
											CutsceneAction_Sub22.iComponentOnPlayer(player_58, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);
											player_58.anInt10375 = client.cycles;
											break;
										}
									}

									if (!(class285_34.aTransform_Sub1_3391 instanceof NPC)) {
										break;
									}

									NPC npc_59 = (NPC) class285_34.aTransform_Sub1_3391;
									if (npc_59.definitions == null) {
										break;
									}

									Vector3 vector3_56 = npc_59.method11166().coords;
									if ((npc_59.definitions.size & 0x1) == 0 && ((int) vector3_56.x & 0x1ff) == 0 && ((int) vector3_56.z & 0x1ff) == 0 || (npc_59.definitions.size & 0x1) == 1 && ((int) vector3_56.x & 0x1ff) == 256 && ((int) vector3_56.z & 0x1ff) == 256) {
										int i_50 = (int) vector3_56.x - (npc_59.definitions.size - 1 << 8);
										i_21 = (int) vector3_56.z - (npc_59.definitions.size - 1 << 8);

										for (i_22 = 0; i_22 < client.NPC_UPDATE_INDEX; i_22++) {
											StringNode class282_sub47_37 = (StringNode) client.NPCS.get((long) client.NPC_UPDATE_INDICES[i_22]);
											if (class282_sub47_37 != null) {
												NPC npc_54 = (NPC) class282_sub47_37.anObject8068;
												if (npc_54.anInt10375 != client.cycles && npc_59 != npc_54 && npc_54.aBool10318) {
													Vector3 vector3_66 = npc_54.method11166().coords;
													i_42 = (int) vector3_66.x - (npc_54.definitions.size - 1 << 8);
													i_41 = (int) vector3_66.z - (npc_54.definitions.size - 1 << 8);
													if (i_42 >= i_50 && npc_54.definitions.size <= npc_59.definitions.size - (i_42 - i_50 >> 9) && i_41 >= i_21 && npc_54.definitions.size <= npc_59.definitions.size - (i_41 - i_21 >> 9)) {
														MapAreaDefinitions.iComponentOnNPC(npc_54, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane, 1644654446);
														npc_54.anInt10375 = client.cycles;
													}
												}
											}
										}

										i_22 = Class197.NUM_PLAYER_INDICES;
										int[] ints_64 = Class197.PLAYER_INDICES;

										for (i_38 = 0; i_38 < i_22; i_38++) {
											Player player_67 = client.players[ints_64[i_38]];
											if (player_67 != null && player_67.anInt10375 != client.cycles && player_67.aBool10318) {
												vector3_26 = player_67.method11166().coords;
												i_41 = (int) vector3_26.x - (player_67.getSize() - 1 << 8);
												i_28 = (int) vector3_26.z - (player_67.getSize() - 1 << 8);
												if (i_41 >= i_50 && player_67.getSize() <= npc_59.definitions.size - (i_41 - i_50 >> 9) && i_28 >= i_21 && player_67.getSize() <= npc_59.definitions.size - (i_28 - i_21 >> 9)) {
													CutsceneAction_Sub22.iComponentOnPlayer(player_67, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);
													player_67.anInt10375 = client.cycles;
												}
											}
										}
									}

									if (npc_59.anInt10375 != client.cycles) {
										MapAreaDefinitions.iComponentOnNPC(npc_59, class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane, 1776503457);
										npc_59.anInt10375 = client.cycles;
										break;
									}
								}

								if (class285_34.aTransform_Sub1_3391 instanceof GroundItem) {
									int i_48 = i_46 + coordgrid_4.x;
									i_49 = i_47 + coordgrid_4.y;
									Node_Sub29 class282_sub29_61 = (Node_Sub29) client.aClass465_7414.get((long) (class285_34.aTransform_Sub1_3391.plane << 28 | i_49 << 14 | i_48));
									if (class282_sub29_61 != null) {
										i_21 = 0;

										for (GroundItemNode class282_sub34_39 = (GroundItemNode) class282_sub29_61.aClass482_7708.method8065(-2081006953); class282_sub34_39 != null; i_21++) {
											ItemDefinitions itemdefinitions_65 = IndexLoaders.ITEM_LOADER.getItemDefinitions(class282_sub34_39.id);
											if (itemdefinitions_65.hasTooltipColor) {
												i_38 = itemdefinitions_65.tooltipColor;
											} else if (itemdefinitions_65.membersOnly) {
												i_38 = Class149_Sub2.DEFAULTS_LOADER_7.membersTooltipColor;
											} else {
												i_38 = Class149_Sub2.DEFAULTS_LOADER_7.f2pTooltipColor;
											}

											if (client.aBool7344 && class285_34.aTransform_Sub1_3391.plane == VertexNormal.MY_PLAYER.plane) {
												ParamDefinitions attributedefault_68 = CutsceneAction_Sub12.USE_INTERFACE_ID != -1 ? IndexLoaders.PARAM_LOADER.getParam(CutsceneAction_Sub12.USE_INTERFACE_ID) : null;
												if ((Class506.USE_OPTIONS_FLAGS & 0x1) != 0 && (attributedefault_68 == null || itemdefinitions_65.getCS2Integer(CutsceneAction_Sub12.USE_INTERFACE_ID, attributedefault_68.defaultInt) != attributedefault_68.defaultInt)) {
													PlayerAppearance.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + Utils.rgbToColHexShortcut(i_38) + itemdefinitions_65.name, Defaults8Loader.anInt5932, 17, -1, (long) class282_sub34_39.id, i_46, i_47, true, false, (long) i_21, false, -1634636602);
												}
											}

											if (class285_34.aTransform_Sub1_3391.plane == VertexNormal.MY_PLAYER.plane) {
												String[] arr_69 = itemdefinitions_65.groundOptions;

												for (i_42 = arr_69.length - 1; i_42 >= 0; --i_42) {
													if (arr_69[i_42] != null) {
														short s_70 = 0;
														i_28 = client.anInt7342;
														if (i_42 == 0) {
															s_70 = 18;
														}

														if (i_42 == 1) {
															s_70 = 19;
														}

														if (i_42 == 2) {
															s_70 = 20;
														}

														if (i_42 == 3) {
															s_70 = 21;
														}

														if (i_42 == 4) {
															s_70 = 22;
														}

														if (i_42 == 5) {
															s_70 = 1004;
														}

														if (i_42 == itemdefinitions_65.unknownInt18) {
															i_28 = itemdefinitions_65.unknownInt19;
														}

														if (i_42 == itemdefinitions_65.unknownInt20) {
															i_28 = itemdefinitions_65.unknownInt21;
														}

														PlayerAppearance.method4032(arr_69[i_42], Utils.rgbToColHexShortcut(i_38) + itemdefinitions_65.name, i_28, s_70, -1, (long) class282_sub34_39.id, i_46, i_47, true, false, (long) i_21, false, -1528903882);
													}
												}
											}

											class282_sub34_39 = (GroundItemNode) class282_sub29_61.aClass482_7708.method8068((byte) 117);
										}
									}
								}
							} while (!(class285_34.aTransform_Sub1_3391 instanceof SceneObject));

							sceneobject_60 = (SceneObject) class285_34.aTransform_Sub1_3391;
							objectdefinitions_57 = IndexLoaders.MAP_REGION_DECODER.method4436().getObjectDefinitions(sceneobject_60.getId(2000772127));
							if (objectdefinitions_57.toObjectIds != null) {
								objectdefinitions_57 = objectdefinitions_57.method8013(Class158_Sub1.PLAYER_VAR_PROVIDER, (byte) 107);
							}
						} while (objectdefinitions_57 == null);

						if (client.aBool7344 && class285_34.aTransform_Sub1_3391.plane == VertexNormal.MY_PLAYER.plane) {
							ParamDefinitions attributedefault_62 = CutsceneAction_Sub12.USE_INTERFACE_ID != -1 ? IndexLoaders.PARAM_LOADER.getParam(CutsceneAction_Sub12.USE_INTERFACE_ID) : null;
							if ((Class506.USE_OPTIONS_FLAGS & 0x4) != 0 && (attributedefault_62 == null || objectdefinitions_57.method7963(CutsceneAction_Sub12.USE_INTERFACE_ID, attributedefault_62.defaultInt, -2052450472) != attributedefault_62.defaultInt)) {
								PlayerAppearance.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + Utils.rgbToColHexShortcut(65535) + objectdefinitions_57.name, Defaults8Loader.anInt5932, 2, -1, Class329.method5905(sceneobject_60, i_46, i_47, (byte) -79), i_46, i_47, true, false, (long) sceneobject_60.hashCode(), false, -2015227666);
							}
						}
					} while (class285_34.aTransform_Sub1_3391.plane != VertexNormal.MY_PLAYER.plane);

					arr_63 = objectdefinitions_57.options;
				} while (arr_63 == null);

				for (i_21 = arr_63.length - 1; i_21 >= 0; --i_21) {
					if (arr_63[i_21] != null) {
						short s_52 = 0;
						i_51 = client.anInt7342;
						if (i_21 == 0) {
							s_52 = 3;
						}

						if (i_21 == 1) {
							s_52 = 4;
						}

						if (i_21 == 2) {
							s_52 = 5;
						}

						if (i_21 == 3) {
							s_52 = 6;
						}

						if (i_21 == 4) {
							s_52 = 1001;
						}

						if (i_21 == 5) {
							s_52 = 1002;
						}

						if (i_21 == objectdefinitions_57.anInt5705) {
							i_51 = objectdefinitions_57.anInt5665;
						}

						if (i_21 == objectdefinitions_57.anInt5670) {
							i_51 = objectdefinitions_57.anInt5666;
						}

						PlayerAppearance.method4032(arr_63[i_21], Utils.rgbToColHexShortcut(65535) + objectdefinitions_57.name, i_51, s_52, -1, Class329.method5905(sceneobject_60, i_46, i_47, (byte) -98), i_46, i_47, true, false, (long) sceneobject_60.hashCode(), false, -1344607256);
					}
				}
			}
		}
	}
}
