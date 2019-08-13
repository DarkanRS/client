public class Class123 {

	boolean aBool1546 = false;

	Class476 aClass476_1541;

	MeshRasterizer aMeshRasterizer_1544;

	boolean[] aBoolArray1553;

	Shadow aCacheableNode_Sub17_1551;

	ParticleSystem aClass539_1538;

	int anInt1548;

	boolean aBool1552 = false;

	boolean aBool1543 = false;

	int anInt1547 = -1;

	int anInt1554 = 0;

	ObjectIndexLoader aClass474_1536;

	int anInt1540;

	int anInt1555;

	int anInt1542;

	Transform_Sub1 aTransform_Sub1_1539;

	byte aByte1537;

	byte aByte1549;

	boolean aBool1550;

	Animation aAnimation_1545;

	public void animate(int i_1) {
		this.aBool1546 = true;
		this.method2124(false, i_1, 1);
	}

	int method2115(int i_1) {
		return this.anInt1554;
	}

	void method2116(Class476 class476_1, int i_2) {
		this.aClass476_1541 = class476_1;
		this.aMeshRasterizer_1544 = null;
	}

	boolean method2117(int i_1) {
		return this.aBool1550;
	}

	void method2118(GraphicalRenderer graphicalrenderer_1, int i_2) {
		if (this.aCacheableNode_Sub17_1551 != null) {
			Vector3 vector3_3 = this.aTransform_Sub1_1539.method11166().coords;
			IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3427(this.aCacheableNode_Sub17_1551, this.aByte1549, (int) vector3_3.x, (int) vector3_3.z, this.aBoolArray1553, (byte) -43);
			this.aBoolArray1553 = null;
			this.aCacheableNode_Sub17_1551 = null;
		}
	}

	void method2119(GraphicalRenderer graphicalrenderer_1, MeshRasterizer meshrasterizer_2, Matrix44Var matrix44var_3, int i_4, int i_5, int i_6, int i_7, boolean bool_8, int i_9) {
		Surface[] arr_10 = meshrasterizer_2.method11253();
		SurfaceSkin[] arr_11 = meshrasterizer_2.method11274();
		if ((this.aClass539_1538 == null || this.aClass539_1538.aBool7132) && (arr_10 != null || arr_11 != null)) {
			ObjectDefinitions objectdefinitions_12 = this.aClass474_1536.getObjectDefinitions(this.anInt1540);
			if (objectdefinitions_12.toObjectIds != null) {
				objectdefinitions_12 = objectdefinitions_12.method8013((VarProvider) (client.anInt7341 == 4 ? Class86.anInterface42_832 : Class158_Sub1.PLAYER_VAR_PROVIDER), (byte) -36);
			}
			if (objectdefinitions_12 != null) {
				this.aClass539_1538 = ParticleSystem.method11557(client.cycles, true);
			}
		}
		if (this.aClass539_1538 != null) {
			meshrasterizer_2.method11273(matrix44var_3);
			if (bool_8) {
				this.aClass539_1538.method11511(graphicalrenderer_1, (long) client.cycles, arr_10, arr_11);
			} else {
				this.aClass539_1538.method11512((long) client.cycles);
			}
			this.aClass539_1538.method11515(this.aByte1537, i_4, i_5, i_6, i_7);
		}
	}

	int method2121() {
		return -this.method2115(-771412764);
	}

	void method2124(boolean bool_1, int i_2, int i_3) {
		int i_5 = i_2;
		boolean bool_6 = false;
		if (i_2 == -1) {
			ObjectDefinitions objectdefinitions_7 = this.aClass474_1536.getObjectDefinitions(this.anInt1540);
			ObjectDefinitions objectdefinitions_8 = objectdefinitions_7;
			if (objectdefinitions_7.toObjectIds != null) {
				objectdefinitions_7 = objectdefinitions_7.method8013((VarProvider) (client.anInt7341 == 4 ? Class86.anInterface42_832 : Class158_Sub1.PLAYER_VAR_PROVIDER), (byte) 4);
			}
			if (objectdefinitions_7 == null) {
				return;
			}
			if (objectdefinitions_8 == objectdefinitions_7) {
				objectdefinitions_8 = null;
			}
			if (objectdefinitions_7.method7967((byte) 82)) {
				if (bool_1 && this.aAnimation_1545.hasDefs() && objectdefinitions_7.method7979(this.aAnimation_1545.method7597(), -1433895387)) {
					return;
				}
				if (objectdefinitions_7.id != this.anInt1547) {
					bool_6 = objectdefinitions_7.aBool5702;
				}
				i_5 = objectdefinitions_7.method7977((byte) -48);
				if (objectdefinitions_7.method7976()) {
					i_3 = 0;
				} else {
					i_3 = 1;
				}
			} else if (objectdefinitions_8 != null && objectdefinitions_8.method7967((byte) 72)) {
				if (bool_1 && this.aAnimation_1545.hasDefs() && objectdefinitions_8.method7979(this.aAnimation_1545.method7597(), 512535535)) {
					return;
				}
				if (this.anInt1547 != objectdefinitions_7.id) {
					bool_6 = objectdefinitions_8.aBool5702;
				}
				i_5 = objectdefinitions_8.method7977((byte) 33);
				if (objectdefinitions_8.method7976()) {
					i_3 = 0;
				} else {
					i_3 = 1;
				}
			}
		}
		if (i_5 == -1) {
			this.aAnimation_1545.method7569();
		} else {
			this.aAnimation_1545.animateFull(i_5, 0, i_3, bool_6, -1486563257);
			this.anInt1548 = client.cycles;
			this.aBool1552 = false;
			this.aMeshRasterizer_1544 = null;
		}
	}

	Class123(GraphicalRenderer graphicalrenderer_1, ObjectIndexLoader objectindexloader_2, ObjectDefinitions objectdefinitions_3, int i_4, int i_5, int i_6, int i_7, Transform_Sub1 class521_sub1_8, boolean bool_9, int i_10) {
		this.aClass474_1536 = objectindexloader_2;
		this.anInt1540 = objectdefinitions_3.id;
		this.anInt1555 = i_4;
		this.anInt1542 = i_5;
		this.aTransform_Sub1_1539 = class521_sub1_8;
		this.aBool1546 = i_10 != -1;
		this.aByte1537 = (byte) i_6;
		this.aByte1549 = (byte) i_7;
		this.aBool1543 = bool_9;
		this.aBool1550 = graphicalrenderer_1.method8402() && objectdefinitions_3.aBool5703 && !this.aBool1543;
		this.aAnimation_1545 = new Animation_Sub2(class521_sub1_8);
		this.method2124(false, i_10, 1);
	}

	final MeshRasterizer method2132(GraphicalRenderer graphicalrenderer_1, int i_2, boolean bool_3, boolean bool_4) {
		ObjectDefinitions objectdefinitions_6 = this.aClass474_1536.getObjectDefinitions(this.anInt1540);
		if (objectdefinitions_6.toObjectIds != null) {
			objectdefinitions_6 = objectdefinitions_6.method8013((VarProvider) (client.anInt7341 == 4 ? Class86.anInterface42_832 : Class158_Sub1.PLAYER_VAR_PROVIDER), (byte) 31);
		}
		if (objectdefinitions_6 == null) {
			this.method2118(graphicalrenderer_1, 2015419671);
			this.anInt1547 = -1;
			return null;
		} else {
			if (!this.aBool1546 && this.anInt1547 != objectdefinitions_6.id) {
				this.method2124(true, -1, 0);
				this.aBool1552 = false;
				this.aMeshRasterizer_1544 = null;
			}
			this.method2133(this.aTransform_Sub1_1539);
			if (bool_4) {
				bool_4 &= this.aBool1550 & !this.aBool1552 & Class393.preferences.sceneryShadows.method12624((byte) -25) != 0;
			}
			if (bool_3 && !bool_4) {
				this.anInt1547 = objectdefinitions_6.id;
				return null;
			} else {
				Vector3 vector3_7 = this.aTransform_Sub1_1539.method11166().coords;
				SceneObjectManager sceneobjectmanager_8 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
				if (bool_4) {
					sceneobjectmanager_8.method3427(this.aCacheableNode_Sub17_1551, this.aByte1549, (int) vector3_7.x, (int) vector3_7.z, this.aBoolArray1553, (byte) -45);
					this.aBool1552 = false;
				}
				Ground class390_9 = sceneobjectmanager_8.aGroundArray2591[this.aByte1549];
				Ground class390_10;
				if (this.aBool1543) {
					class390_10 = sceneobjectmanager_8.aGroundArray2607[0];
				} else {
					class390_10 = this.aByte1549 < 3 ? sceneobjectmanager_8.aGroundArray2591[this.aByte1549 + 1] : null;
				}
				MeshRasterizer meshrasterizer_11 = null;
				if (this.aAnimation_1545.hasDefs()) {
					if (bool_4) {
						i_2 |= 0x40000;
					}
					meshrasterizer_11 = objectdefinitions_6.method8012(graphicalrenderer_1, i_2, this.anInt1555 != 11 ? this.anInt1555 : 10, this.anInt1555 == 11 ? 4 + this.anInt1542 : this.anInt1542, class390_9, class390_10, (int) vector3_7.x, class390_9.averageHeight((int) vector3_7.x, (int) vector3_7.z, -2124588555), (int) vector3_7.z, this.aAnimation_1545, this.aClass476_1541);
					if (meshrasterizer_11 != null) {
						if (bool_4) {
							if (this.aBoolArray1553 == null) {
								this.aBoolArray1553 = new boolean[4];
							}
							this.aCacheableNode_Sub17_1551 = meshrasterizer_11.ga(this.aCacheableNode_Sub17_1551);
							sceneobjectmanager_8.method3426(this.aCacheableNode_Sub17_1551, this.aByte1549, (int) vector3_7.x, (int) vector3_7.z, this.aBoolArray1553, (byte) -96);
							this.aBool1552 = true;
						}
						this.anInt1554 = meshrasterizer_11.YA();
						meshrasterizer_11.n();
					} else {
						this.aBoolArray1553 = null;
						this.aCacheableNode_Sub17_1551 = null;
						this.anInt1554 = 0;
					}
					this.aMeshRasterizer_1544 = null;
				} else if (this.aMeshRasterizer_1544 != null && (this.aMeshRasterizer_1544.m() & i_2) == i_2 && this.anInt1547 == objectdefinitions_6.id) {
					meshrasterizer_11 = this.aMeshRasterizer_1544;
				} else {
					if (this.aMeshRasterizer_1544 != null) {
						i_2 |= this.aMeshRasterizer_1544.m();
					}
					Class452 class452_12 = objectdefinitions_6.method8010(graphicalrenderer_1, i_2, this.anInt1555 != 11 ? this.anInt1555 : 10, this.anInt1555 == 11 ? 4 + this.anInt1542 : this.anInt1542, class390_9, class390_10, (int) vector3_7.x, class390_9.averageHeight((int) vector3_7.x, (int) vector3_7.z, -2029689654), (int) vector3_7.z, bool_4, this.aClass476_1541, 1886483873);
					if (class452_12 != null) {
						this.aMeshRasterizer_1544 = meshrasterizer_11 = (MeshRasterizer) class452_12.anObject5443;
						if (bool_4) {
							this.aCacheableNode_Sub17_1551 = (Shadow) class452_12.anObject5444;
							this.aBoolArray1553 = null;
							sceneobjectmanager_8.method3426(this.aCacheableNode_Sub17_1551, this.aByte1549, (int) vector3_7.x, (int) vector3_7.z, (boolean[]) null, (byte) -31);
							this.aBool1552 = true;
						}
						this.anInt1554 = meshrasterizer_11.YA();
						meshrasterizer_11.n();
					} else {
						this.aBoolArray1553 = null;
						this.aCacheableNode_Sub17_1551 = null;
						this.aMeshRasterizer_1544 = null;
						this.anInt1554 = 0;
					}
				}
				this.anInt1547 = objectdefinitions_6.id;
				return meshrasterizer_11;
			}
		}
	}

	void method2133(Transform_Sub1 class521_sub1_1) {
		if (this.aAnimation_1545.hasDefs()) {
			if (this.aAnimation_1545.method7627(client.cycles - this.anInt1548, -1604815652)) {
				if (Class393.preferences.sceneryShadows.method12624((byte) -127) == 2) {
					this.aBool1552 = false;
				}
				if (this.aAnimation_1545.method7580(487845582)) {
					this.aAnimation_1545.update(-1);
					this.aBool1546 = false;
					this.method2124(false, -1, 0);
				}
			}
		} else {
			this.method2124(false, -1, 0);
		}
		this.anInt1548 = client.cycles;
	}

	void method2136(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		this.method2132(graphicalrenderer_1, 262144, true, true);
	}

	public static int method2149() {
		if (IndexReference.anInt1039 == -1) {
			IndexReference[] arr_1 = Class158_Sub1.method13767();
			for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
				IndexReference indexreference_3 = arr_1[i_2];
				if (indexreference_3.indexId > IndexReference.anInt1039) {
					IndexReference.anInt1039 = indexreference_3.indexId;
				}
			}
			++IndexReference.anInt1039;
		}
		return IndexReference.anInt1039;
	}

	public static void method2152(int i_0, int i_1) {
		Index36FileNode class282_sub37_2 = (Index36FileNode) Class492.INDEX36_FILE_CACHE.get((long) i_0);
		if (class282_sub37_2 != null) {
			class282_sub37_2.aBool7995 = !class282_sub37_2.aBool7995;
			class282_sub37_2.reference.method4924(class282_sub37_2.aBool7995);
		}
	}
}
