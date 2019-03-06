public class Class521_Sub1_Sub3_Sub1 extends SceneObjectNode implements SceneObject {

	Shadow aClass282_Sub50_Sub17_10491;
	Class200 aClass200_10494;
	boolean aBool10497;
	ObjectIndexLoader aClass474_10492;
	int anInt10495;
	boolean aBool10493;
	byte aByte10496;
	boolean aBool10498;
	boolean aBool10500;
	MeshRasterizer aClass528_10499;

	public void method98(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aClass282_Sub50_Sub17_10491 == null && this.aBool10500) {
			Class452 class452_4 = this.method16074(graphicalrenderer_1, 262144, true, 750971439);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aClass282_Sub50_Sub17_10491;
			this.aClass282_Sub50_Sub17_10491 = null;
		}

		Vector3 vector3_5 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_3, this.aByte7968, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) 53);
		}

	}

	public void method96() {
		if (this.aClass528_10499 != null) {
			this.aClass528_10499.method11259();
		}

	}

	public int method13003() {
		return this.aClass528_10499 != null ? this.aClass528_10499.YA() : 0;
	}

	public int method12995(int i_1) {
		return this.aClass528_10499 != null ? this.aClass528_10499.YA() : 0;
	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1, int i_2) {
		if (this.aClass528_10499 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Class285 class285_4 = Class470.method7824(this.aBool10498, (byte) -59);
			this.aClass528_10499.method11282(matrix44var_3, this.aClass275_Sub5Array7965[0], 0);
			return class285_4;
		}
	}

	Class452 method16074(GraphicalRenderer graphicalrenderer_1, int i_2, boolean bool_3, int i_4) {
		ObjectDefinitions objectdefinitions_5 = this.aClass474_10492.getObjectDefinitions(this.anInt10495, 65280);
		Ground class390_6;
		Ground class390_7;
		if (this.aBool10493) {
			class390_6 = this.aClass206_7970.aClass390Array2614[this.aByte7968];
			class390_7 = this.aClass206_7970.aClass390Array2607[0];
		} else {
			class390_6 = this.aClass206_7970.aClass390Array2607[this.aByte7968];
			if (this.aByte7968 < 3) {
				class390_7 = this.aClass206_7970.aClass390Array2607[this.aByte7968 + 1];
			} else {
				class390_7 = null;
			}
		}

		Vector3 vector3_8 = this.method11166().aClass385_3595;
		return objectdefinitions_5.method8010(graphicalrenderer_1, i_2, SceneObjectType.GROUND_DECORATION.type, this.aByte10496, class390_6, class390_7, (int) vector3_8.x, (int) vector3_8.y, (int) vector3_8.z, bool_3, (Class476) null, 219855525);
	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		Vector3 vector3_3 = this.method11166().aClass385_3595;
		if (this.aClass200_10494 == null) {
			this.aClass200_10494 = Class275_Sub2.method12505((int) vector3_3.x, (int) vector3_3.y, (int) vector3_3.z, this.method16075(graphicalrenderer_1, 0, -857380966), (byte) -72);
		}

		return this.aClass200_10494;
	}

	public int method91() {
		return this.aByte10496;
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
	}

	public void method88(GraphicalRenderer graphicalrenderer_1, int i_2) {
		Object obj_3 = null;
		Shadow class282_sub50_sub17_4;
		if (this.aClass282_Sub50_Sub17_10491 == null && this.aBool10500) {
			Class452 class452_5 = this.method16074(graphicalrenderer_1, 262144, true, 750971439);
			class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
		} else {
			class282_sub50_sub17_4 = this.aClass282_Sub50_Sub17_10491;
			this.aClass282_Sub50_Sub17_10491 = null;
		}

		Vector3 vector3_6 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_4 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_4, this.aByte7968, (int) vector3_6.x, (int) vector3_6.z, (boolean[]) null, (byte) -76);
		}

	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		if (this.aClass528_10499 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = this.method11168();
			Class285 class285_3 = Class470.method7824(this.aBool10498, (byte) -56);
			this.aClass528_10499.method11282(matrix44var_2, this.aClass275_Sub5Array7965[0], 0);
			return class285_3;
		}
	}

	void method13013(GraphicalRenderer graphicalrenderer_1, Class521_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
		if (class521_sub1_2 instanceof Class521_Sub1_Sub3_Sub1) {
			Class521_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1_8 = (Class521_Sub1_Sub3_Sub1) class521_sub1_2;
			if (this.aClass528_10499 != null && class521_sub1_sub3_sub1_8.aClass528_10499 != null) {
				this.aClass528_10499.method11269(class521_sub1_sub3_sub1_8.aClass528_10499, i_3, i_4, i_5, bool_6);
			}
		}

	}

	void method12984(int i_1) {
		this.aBool10497 = false;
		if (this.aClass528_10499 != null) {
			this.aClass528_10499.KA(this.aClass528_10499.m() & ~0x10000);
		}

	}

	public int getId(int i_1) {
		return this.anInt10495;
	}

	MeshRasterizer method16075(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		if (this.aClass528_10499 != null && graphicalrenderer_1.method8452(this.aClass528_10499.m(), i_2) == 0) {
			return this.aClass528_10499;
		} else {
			Class452 class452_4 = this.method16074(graphicalrenderer_1, i_2, false, 750971439);
			return class452_4 != null ? (MeshRasterizer) class452_4.anObject5443 : null;
		}
	}

	public int method92(int i_1) {
		return this.aByte10496;
	}

	boolean method12986(int i_1) {
		return this.aClass528_10499 != null ? !this.aClass528_10499.u() : true;
	}

	boolean method13011() {
		return this.aBool10497;
	}

	public void method93(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aClass282_Sub50_Sub17_10491 == null && this.aBool10500) {
			Class452 class452_4 = this.method16074(graphicalrenderer_1, 262144, true, 750971439);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aClass282_Sub50_Sub17_10491;
			this.aClass282_Sub50_Sub17_10491 = null;
		}

		Vector3 vector3_5 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_3, this.aByte7968, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) -43);
		}

	}

	boolean method12985(int i_1) {
		return this.aBool10497;
	}

	public int method39() {
		return -1419362635 * this.anInt10495 * -1031192675;
	}

	public int method73() {
		return SceneObjectType.GROUND_DECORATION.type * 2087055829 * 1109376893;
	}

	public int method77() {
		return SceneObjectType.GROUND_DECORATION.type * 2087055829 * 1109376893;
	}

	public boolean method86(int i_1) {
		return this.aBool10500;
	}

	public void method87(GraphicalRenderer graphicalrenderer_1, int i_2) {
		Object obj_3 = null;
		Shadow class282_sub50_sub17_4;
		if (this.aClass282_Sub50_Sub17_10491 == null && this.aBool10500) {
			Class452 class452_5 = this.method16074(graphicalrenderer_1, 262144, true, 750971439);
			class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
		} else {
			class282_sub50_sub17_4 = this.aClass282_Sub50_Sub17_10491;
			this.aClass282_Sub50_Sub17_10491 = null;
		}

		Vector3 vector3_6 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_4 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_4, this.aByte7968, (int) vector3_6.x, (int) vector3_6.z, (boolean[]) null, (byte) -99);
		}

	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
	}

	public void method90() {
		if (this.aClass528_10499 != null) {
			this.aClass528_10499.method11259();
		}

	}

	public boolean method94() {
		return this.aBool10500;
	}

	public boolean method95() {
		return this.aBool10500;
	}

	public void method85(byte b_1) {
		if (this.aClass528_10499 != null) {
			this.aClass528_10499.method11259();
		}

	}

	public void method83(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aClass282_Sub50_Sub17_10491 == null && this.aBool10500) {
			Class452 class452_4 = this.method16074(graphicalrenderer_1, 262144, true, 750971439);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aClass282_Sub50_Sub17_10491;
			this.aClass282_Sub50_Sub17_10491 = null;
		}

		Vector3 vector3_5 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_3, this.aByte7968, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) -62);
		}

	}

	public void method97(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aClass282_Sub50_Sub17_10491 == null && this.aBool10500) {
			Class452 class452_4 = this.method16074(graphicalrenderer_1, 262144, true, 750971439);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aClass282_Sub50_Sub17_10491;
			this.aClass282_Sub50_Sub17_10491 = null;
		}

		Vector3 vector3_5 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_3, this.aByte7968, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) 71);
		}

	}

	public int method76() {
		return -1419362635 * this.anInt10495 * -1031192675;
	}

	boolean method12999() {
		return this.aClass528_10499 != null ? !this.aClass528_10499.u() : true;
	}

	void method13016(GraphicalRenderer graphicalrenderer_1, Class521_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (class521_sub1_2 instanceof Class521_Sub1_Sub3_Sub1) {
			Class521_Sub1_Sub3_Sub1 class521_sub1_sub3_sub1_7 = (Class521_Sub1_Sub3_Sub1) class521_sub1_2;
			if (this.aClass528_10499 != null && class521_sub1_sub3_sub1_7.aClass528_10499 != null) {
				this.aClass528_10499.method11269(class521_sub1_sub3_sub1_7.aClass528_10499, i_3, i_4, i_5, bool_6);
			}
		}

	}

	boolean method13001() {
		return this.aClass528_10499 != null ? this.aClass528_10499.i() : false;
	}

	boolean method13002() {
		return this.aClass528_10499 != null ? this.aClass528_10499.i() : false;
	}

	boolean method13000() {
		return this.aClass528_10499 != null ? this.aClass528_10499.i() : false;
	}

	public int method13017() {
		return this.aClass528_10499 != null ? this.aClass528_10499.YA() : 0;
	}

	public int method13005() {
		return this.aClass528_10499 != null ? this.aClass528_10499.YA() : 0;
	}

	public int method13006() {
		return this.aClass528_10499 != null ? this.aClass528_10499.YA() : 0;
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		if (this.aClass528_10499 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = this.method11168();
			Class285 class285_3 = Class470.method7824(this.aBool10498, (byte) -109);
			this.aClass528_10499.method11282(matrix44var_2, this.aClass275_Sub5Array7965[0], 0);
			return class285_3;
		}
	}

	boolean method12987(int i_1) {
		return this.aClass528_10499 != null ? this.aClass528_10499.i() : false;
	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		if (this.aClass528_10499 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = this.method11168();
			Class285 class285_3 = Class470.method7824(this.aBool10498, (byte) -30);
			this.aClass528_10499.method11282(matrix44var_2, this.aClass275_Sub5Array7965[0], 0);
			return class285_3;
		}
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
	}

	public Class521_Sub1_Sub3_Sub1(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, ObjectIndexLoader objectindexloader_3, ObjectDefinitions objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, boolean bool_12) {
		super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, objectdefinitions_4.anInt5704);
		this.aClass474_10492 = objectindexloader_3;
		this.anInt10495 = objectdefinitions_4.id;
		this.aBool10493 = bool_10;
		this.aByte10496 = (byte) i_11;
		this.aBool10498 = objectdefinitions_4.interactable != 0 && !bool_10;
		this.aBool10497 = bool_12;
		this.aBool10500 = graphicalrenderer_2.method8402() && objectdefinitions_4.aBool5703 && !this.aBool10493 && Class393.preferences.aClass468_Sub2_8205.method12624((byte) -122) != 0;
		int i_13 = 2048;
		if (this.aBool10497) {
			i_13 |= 0x10000;
		}

		if (objectdefinitions_4.aBool5711) {
			i_13 |= 0x80000;
		}

		Class452 class452_14 = this.method16074(graphicalrenderer_2, i_13, this.aBool10500, 750971439);
		if (class452_14 != null) {
			this.aClass528_10499 = (MeshRasterizer) class452_14.anObject5443;
			this.aClass282_Sub50_Sub17_10491 = (Shadow) class452_14.anObject5444;
			if (this.aBool10497 || objectdefinitions_4.aBool5711) {
				this.aClass528_10499 = this.aClass528_10499.method11289((byte) 0, i_13, false);
				if (objectdefinitions_4.aBool5711) {
					Class341 class341_15 = IndexLoaders.MAP_REGION_DECODER.method4426(1159043919);
					this.aClass528_10499.PA(class341_15.anInt3992, class341_15.anInt3993, class341_15.anInt3994, class341_15.anInt3995);
				}
			}
		}

		this.method13008(1, (byte) -30);
	}

	boolean method13026() {
		return this.aBool10497;
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_4 = this.method16075(graphicalrenderer_1, 131072, -338274423);
		if (meshrasterizer_4 != null) {
			Matrix44Var matrix44var_5 = this.method11168();
			return meshrasterizer_4.method11270(i_2, i_3, matrix44var_5, false, 0);
		} else {
			return false;
		}
	}

	public void method38() {
		if (this.aClass528_10499 != null) {
			this.aClass528_10499.method11259();
		}

	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		if (this.aClass200_10494 == null) {
			this.aClass200_10494 = Class275_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16075(graphicalrenderer_1, 0, 2111828058), (byte) 15);
		}

		return this.aClass200_10494;
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		if (this.aClass200_10494 == null) {
			this.aClass200_10494 = Class275_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16075(graphicalrenderer_1, 0, -1243491544), (byte) 55);
		}

		return this.aClass200_10494;
	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		if (this.aClass200_10494 == null) {
			this.aClass200_10494 = Class275_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16075(graphicalrenderer_1, 0, 1861667283), (byte) 4);
		}

		return this.aClass200_10494;
	}

	public int method89(int i_1) {
		return SceneObjectType.GROUND_DECORATION.type;
	}

	void method13021() {
		this.aBool10497 = false;
		if (this.aClass528_10499 != null) {
			this.aClass528_10499.KA(this.aClass528_10499.m() & ~0x10000);
		}

	}

	void method13015() {
		this.aBool10497 = false;
		if (this.aClass528_10499 != null) {
			this.aClass528_10499.KA(this.aClass528_10499.m() & ~0x10000);
		}

	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4) {
		MeshRasterizer meshrasterizer_5 = this.method16075(graphicalrenderer_1, 131072, 1304391023);
		if (meshrasterizer_5 != null) {
			Matrix44Var matrix44var_6 = this.method11168();
			return meshrasterizer_5.method11270(i_2, i_3, matrix44var_6, false, 0);
		} else {
			return false;
		}
	}

	public static final void method16078(MeshRasterizer meshrasterizer_0, Animation animation_1, Animation animation_2, int i_3) {
		if (animation_1.method7562(1986884672) && animation_2.method7562(1815488454)) {
			AnimationDefinitions animationdefinitions_4 = animation_1.defs;
			AnimationDefinitions animationdefinitions_5 = animation_2.defs;
			meshrasterizer_0.method11264(animation_1.aClass462_5464.aClass282_Sub50_Sub13_5545, animation_1.aClass462_5464.anInt5542, animation_1.aClass462_5464.aClass282_Sub50_Sub13_5546, animation_1.aClass462_5464.anInt5547, animation_1.anInt5457, animationdefinitions_4.frameDurations[animation_1.anInt5460], animation_2.aClass462_5464.aClass282_Sub50_Sub13_5545, animation_2.aClass462_5464.anInt5542, animation_2.aClass462_5464.aClass282_Sub50_Sub13_5546, animation_2.aClass462_5464.anInt5547, animation_2.anInt5457, animationdefinitions_5.frameDurations[animation_2.anInt5460], animationdefinitions_4.aBoolArray5915, animationdefinitions_4.aBool5923 | animationdefinitions_5.aBool5923);
		}

	}

	static final void method16079(CS2Executor cs2executor_0, short s_1) {
		cs2executor_0.intStackPtr -= 2;
		Class12.method486(cs2executor_0.intStack[cs2executor_0.intStackPtr], cs2executor_0.intStack[cs2executor_0.intStackPtr + 1], 0, 596260679);
	}

	static Class282_Sub53_Sub2 method16080(int i_0, int i_1, int i_2, long long_3, int i_5, int i_6) {
		Class282_Sub53_Sub2[] arr_7 = Class282_Sub53_Sub2.aClass282_Sub53_Sub2Array9633;
		synchronized (Class282_Sub53_Sub2.aClass282_Sub53_Sub2Array9633) {
			Class282_Sub53_Sub2 class282_sub53_sub2_8;
			if (Class279.anInt3370 == 0) {
				class282_sub53_sub2_8 = new Class282_Sub53_Sub2();
			} else {
				class282_sub53_sub2_8 = Class282_Sub53_Sub2.aClass282_Sub53_Sub2Array9633[--Class279.anInt3370];
			}

			class282_sub53_sub2_8.anInt9631 = i_0;
			class282_sub53_sub2_8.anInt9632 = i_1;
			class282_sub53_sub2_8.anInt9629 = i_2;
			class282_sub53_sub2_8.aLong9634 = long_3;
			class282_sub53_sub2_8.anInt9635 = i_5;
			return class282_sub53_sub2_8;
		}
	}

	static boolean method16081(int i_0) {
		return Class179.aBool2229;
	}

}
