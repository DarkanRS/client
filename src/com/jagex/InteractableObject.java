package com.jagex;
public class InteractableObject extends Transform_Sub1_Sub1 implements SceneObject {

	boolean aBool10512 = true;

	Class200 aClass200_10510;

	public Class123 aClass123_10509;

	boolean aBool10511;

	public int method76() {
		return this.aClass123_10509.anInt1540 * 1623064993 * 1535779425;
	}

	boolean method12986(int i_1) {
		return false;
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10509.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_2 != null) {
			this.aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_2, this.method11168(), this.aShort9458, this.localX, this.aShort9456, this.localY, false, 1109367296);
		}
	}

	public int method12995(int i_1) {
		return this.aClass123_10509.method2115(1252566568);
	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		return this.aClass200_10510;
	}

	public boolean method94() {
		return this.aClass123_10509.method2117(1835275443);
	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_3 = this.aClass123_10509.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_3 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_4 = this.method11168();
			Class285 class285_5 = Class470.method7824(this.aBool10511, (byte) -97);
			this.aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, this.aShort9458, this.localX, this.aShort9456, this.localY, true, -219339696);
			meshrasterizer_3.method11282(matrix44var_4, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10509.aClass539_1538 != null) {
				Class151 class151_6 = this.aClass123_10509.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_6);
			}
			this.aBool10512 = meshrasterizer_3.i() || this.aClass123_10509.aClass539_1538 != null;
			Position class305_7 = this.method11166();
			if (this.aClass200_10510 == null) {
				this.aClass200_10510 = EntityNode_Sub2.method12505((int) class305_7.coords.x, (int) class305_7.coords.y, (int) class305_7.coords.z, meshrasterizer_3, (byte) -19);
			} else {
				Class388.method6694(this.aClass200_10510, (int) class305_7.coords.x, (int) class305_7.coords.y, (int) class305_7.coords.z, meshrasterizer_3, 464369048);
			}
			return class285_5;
		}
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
		MeshRasterizer meshrasterizer_3 = this.aClass123_10509.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_3 != null) {
			this.aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_3, this.method11168(), this.aShort9458, this.localX, this.aShort9456, this.localY, false, 985528873);
		}
	}

	public void method16096(Class476 class476_1) {
		this.aClass123_10509.method2116(class476_1, 501867772);
	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_5 = this.aClass123_10509.method2132(graphicalrenderer_1, 131072, false, false);
		return meshrasterizer_5 == null ? false : meshrasterizer_5.method11270(i_2, i_3, this.method11168(), false, 0);
	}

	final boolean method12985(int i_1) {
		return false;
	}

	boolean method13001() {
		return this.aBool10512;
	}

	final void method12984(int i_1) {
		throw new IllegalStateException();
	}

	public void method97(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10509.method2118(graphicalrenderer_1, 1610737913);
	}

	public int method89(int i_1) {
		return this.aClass123_10509.anInt1555;
	}

	public int method92(int i_1) {
		return this.aClass123_10509.anInt1542;
	}

	public void method85() {
	}

	public boolean method86(int i_1) {
		return this.aClass123_10509.method2117(-566540955);
	}

	public void method87(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10509.method2136(graphicalrenderer_1, (byte) -107);
	}

	public void method88(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10509.method2118(graphicalrenderer_1, 1860248692);
	}

	public int getId(int i_1) {
		return this.aClass123_10509.anInt1540;
	}

	public int method39() {
		return this.aClass123_10509.anInt1540 * 1623064993 * 1535779425;
	}

	boolean method12987(int i_1) {
		return this.aBool10512;
	}

	public InteractableObject(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, ObjectIndexLoader objectindexloader_3, ObjectDefinitions objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12, int i_13, int i_14, int i_15, int i_16, int i_17) {
		super(sceneobjectmanager_1, i_5, i_6, i_7, i_8, i_9, i_11, i_12, i_13, i_14, objectdefinitions_4.supportsItems == 1, FriendStatus.method7705(i_15, i_16));
		this.aClass123_10509 = new Class123(graphicalrenderer_2, objectindexloader_3, objectdefinitions_4, i_15, i_16, this.plane, i_6, this, bool_10, i_17);
		this.aBool10511 = objectdefinitions_4.interactable != 0 && !bool_10;
		this.method13008(1, (byte) -22);
	}

	public int method91() {
		return this.aClass123_10509.anInt1542 * -2132267033 * -515017769;
	}

	public void method38() {
	}

	public void method90() {
	}

	public void method98(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10509.method2118(graphicalrenderer_1, 1873794569);
	}

	public boolean method95() {
		return this.aClass123_10509.method2117(-102116081);
	}

	public void method93(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10509.method2136(graphicalrenderer_1, (byte) -105);
	}

	public void method83(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10509.method2136(graphicalrenderer_1, (byte) -44);
	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10509.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Class285 class285_4 = Class470.method7824(this.aBool10511, (byte) -2);
			this.aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, this.aShort9458, this.localX, this.aShort9456, this.localY, true, 915832914);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10509.aClass539_1538 != null) {
				Class151 class151_5 = this.aClass123_10509.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_5);
			}
			this.aBool10512 = meshrasterizer_2.i() || this.aClass123_10509.aClass539_1538 != null;
			Position class305_6 = this.method11166();
			if (this.aClass200_10510 == null) {
				this.aClass200_10510 = EntityNode_Sub2.method12505((int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2, (byte) 1);
			} else {
				Class388.method6694(this.aClass200_10510, (int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2, -1316927176);
			}
			return class285_4;
		}
	}

	boolean method12999() {
		return false;
	}

	public int method77() {
		return 845010167 * this.aClass123_10509.anInt1555 * 2129865927;
	}

	boolean method13000() {
		return this.aBool10512;
	}

	final void method13013(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
		throw new IllegalStateException();
	}

	boolean method13002() {
		return this.aBool10512;
	}

	public int method13003() {
		return this.aClass123_10509.method2115(-1854230374);
	}

	public int method13017() {
		return this.aClass123_10509.method2115(469812250);
	}

	public int method13005() {
		return this.aClass123_10509.method2115(1237587241);
	}

	public int method13006() {
		return this.aClass123_10509.method2115(138212061);
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10509.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Class285 class285_4 = Class470.method7824(this.aBool10511, (byte) -19);
			this.aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, this.aShort9458, this.localX, this.aShort9456, this.localY, true, 1469676287);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10509.aClass539_1538 != null) {
				Class151 class151_5 = this.aClass123_10509.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_5);
			}
			this.aBool10512 = meshrasterizer_2.i() || this.aClass123_10509.aClass539_1538 != null;
			Position class305_6 = this.method11166();
			if (this.aClass200_10510 == null) {
				this.aClass200_10510 = EntityNode_Sub2.method12505((int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2, (byte) 4);
			} else {
				Class388.method6694(this.aClass200_10510, (int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2, 1083467352);
			}
			return class285_4;
		}
	}

	public void method96() {
	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10509.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Class285 class285_4 = Class470.method7824(this.aBool10511, (byte) -5);
			this.aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, this.aShort9458, this.localX, this.aShort9456, this.localY, true, 1385050972);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10509.aClass539_1538 != null) {
				Class151 class151_5 = this.aClass123_10509.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_5);
			}
			this.aBool10512 = meshrasterizer_2.i() || this.aClass123_10509.aClass539_1538 != null;
			Position class305_6 = this.method11166();
			if (this.aClass200_10510 == null) {
				this.aClass200_10510 = EntityNode_Sub2.method12505((int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2, (byte) -21);
			} else {
				Class388.method6694(this.aClass200_10510, (int) class305_6.coords.x, (int) class305_6.coords.y, (int) class305_6.coords.z, meshrasterizer_2, -640718163);
			}
			return class285_4;
		}
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10509.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_2 != null) {
			this.aClass123_10509.method2119(graphicalrenderer_1, meshrasterizer_2, this.method11168(), this.aShort9458, this.localX, this.aShort9456, this.localY, false, 1583997112);
		}
	}

	public int method73() {
		return 845010167 * this.aClass123_10509.anInt1555 * 2129865927;
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10510;
	}

	final boolean method13026() {
		return false;
	}

	final boolean method13011() {
		return false;
	}

	final void method13016(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		throw new IllegalStateException();
	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10510;
	}

	final void method13021() {
		throw new IllegalStateException();
	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10510;
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_4 = this.aClass123_10509.method2132(graphicalrenderer_1, 131072, false, false);
		return meshrasterizer_4 == null ? false : meshrasterizer_4.method11270(i_2, i_3, this.method11168(), false, 0);
	}

	public int method12997() {
		return this.aClass123_10509.method2121();
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	public static void method16099(IComponentDefinitions[] arr_0, int i_1, int i_2, int i_3, boolean bool_4, byte b_5) {
		for (int i_6 = 0; i_6 < arr_0.length; i_6++) {
			IComponentDefinitions icomponentdefinitions_7 = arr_0[i_6];
			if (icomponentdefinitions_7 != null && icomponentdefinitions_7.parent == i_1) {
				Class484.initSizes(icomponentdefinitions_7, i_2, i_3, bool_4, -417515150);
				Class246.method4204(icomponentdefinitions_7, i_2, i_3, -878856707);
				if (icomponentdefinitions_7.scrollX > icomponentdefinitions_7.scrollWidth - icomponentdefinitions_7.width) {
					icomponentdefinitions_7.scrollX = icomponentdefinitions_7.scrollWidth - icomponentdefinitions_7.width;
				}
				if (icomponentdefinitions_7.scrollX < 0) {
					icomponentdefinitions_7.scrollX = 0;
				}
				if (icomponentdefinitions_7.scrollY > icomponentdefinitions_7.scrollHeight - icomponentdefinitions_7.height) {
					icomponentdefinitions_7.scrollY = icomponentdefinitions_7.scrollHeight - icomponentdefinitions_7.height;
				}
				if (icomponentdefinitions_7.scrollY < 0) {
					icomponentdefinitions_7.scrollY = 0;
				}
				if (icomponentdefinitions_7.type == ComponentType.CONTAINER) {
					Class480.method8044(arr_0, icomponentdefinitions_7, bool_4, (byte) -82);
				}
			}
		}
	}
}
