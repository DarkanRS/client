public class GroundDecoration extends SceneObjectNode implements SceneObject {

	boolean aBool10508 = true;

	Class200 aClass200_10505;

	public Class123 aClass123_10507;

	boolean aBool10506;

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10505;
	}

	boolean method12986(int i_1) {
		return false;
	}

	boolean method12987(int i_1) {
		return this.aBool10508;
	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		return this.aClass200_10505;
	}

	public int method12995(int i_1) {
		return this.aClass123_10507.method2115(560819680);
	}

	public int method12997() {
		return this.aClass123_10507.method2121();
	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_3 = this.aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_3 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_4 = this.method11168();
			Position class305_5 = this.method11166();
			Class285 class285_6 = Class470.method7824(this.aBool10506, (byte) -122);
			int i_7 = (int) class305_5.aClass385_3595.x >> 9;
			int i_8 = (int) class305_5.aClass385_3595.z >> 9;
			this.aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, i_7, i_7, i_8, i_8, true, 1139295169);
			meshrasterizer_3.method11282(matrix44var_4, this.aEntityNode_Sub5Array7965[0], 0);
			if (this.aClass123_10507.aClass539_1538 != null) {
				Class151 class151_9 = this.aClass123_10507.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_9);
			}
			this.aBool10508 = meshrasterizer_3.i() || this.aClass123_10507.aClass539_1538 != null;
			if (this.aClass200_10505 == null) {
				this.aClass200_10505 = EntityNode_Sub2.method12505((int) class305_5.aClass385_3595.x, (int) class305_5.aClass385_3595.y, (int) class305_5.aClass385_3595.z, meshrasterizer_3, (byte) -28);
			} else {
				Class388.method6694(this.aClass200_10505, (int) class305_5.aClass385_3595.x, (int) class305_5.aClass385_3595.y, (int) class305_5.aClass385_3595.z, meshrasterizer_3, -1412574443);
			}
			return class285_6;
		}
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
		MeshRasterizer meshrasterizer_3 = this.aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_3 != null) {
			Vector3 vector3_4 = this.method11166().aClass385_3595;
			int i_5 = (int) vector3_4.x >> 9;
			int i_6 = (int) vector3_4.z >> 9;
			this.aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_3, this.method11168(), i_5, i_5, i_6, i_6, false, 205228660);
		}
	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_5 = this.aClass123_10507.method2132(graphicalrenderer_1, 131072, false, false);
		return meshrasterizer_5 == null ? false : meshrasterizer_5.method11270(i_2, i_3, this.method11168(), false, 0);
	}

	final boolean method12985(int i_1) {
		return false;
	}

	final void method13013(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
		throw new IllegalStateException();
	}

	final boolean method13026() {
		return false;
	}

	public int getId(int i_1) {
		return this.aClass123_10507.anInt1540;
	}

	public int method92(int i_1) {
		return this.aClass123_10507.anInt1542;
	}

	public void method16091(Class476 class476_1) {
		this.aClass123_10507.method2116(class476_1, -1448472118);
	}

	public void method85() {
	}

	public boolean method86(int i_1) {
		return this.aClass123_10507.method2117(-1218985167);
	}

	public void method87(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10507.method2136(graphicalrenderer_1, (byte) -38);
	}

	boolean method13001() {
		return this.aBool10508;
	}

	public int method76() {
		return 1535779425 * this.aClass123_10507.anInt1540 * 1623064993;
	}

	public int method39() {
		return 1535779425 * this.aClass123_10507.anInt1540 * 1623064993;
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_4 = this.aClass123_10507.method2132(graphicalrenderer_1, 131072, false, false);
		return meshrasterizer_4 == null ? false : meshrasterizer_4.method11270(i_2, i_3, this.method11168(), false, 0);
	}

	boolean method13002() {
		return this.aBool10508;
	}

	public int method91() {
		return -515017769 * this.aClass123_10507.anInt1542 * -2132267033;
	}

	public void method38() {
	}

	public int method77() {
		return this.aClass123_10507.anInt1555 * 2129865927 * 845010167;
	}

	public void method90() {
	}

	public boolean method94() {
		return this.aClass123_10507.method2117(-1277974275);
	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			Class285 class285_5 = Class470.method7824(this.aBool10506, (byte) -111);
			int i_6 = (int) class305_4.aClass385_3595.x >> 9;
			int i_7 = (int) class305_4.aClass385_3595.z >> 9;
			this.aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, 2037340333);
			meshrasterizer_2.method11282(matrix44var_3, this.aEntityNode_Sub5Array7965[0], 0);
			if (this.aClass123_10507.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10507.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}
			this.aBool10508 = meshrasterizer_2.i() || this.aClass123_10507.aClass539_1538 != null;
			if (this.aClass200_10505 == null) {
				this.aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.aClass385_3595.x, (int) class305_4.aClass385_3595.y, (int) class305_4.aClass385_3595.z, meshrasterizer_2, (byte) -26);
			} else {
				Class388.method6694(this.aClass200_10505, (int) class305_4.aClass385_3595.x, (int) class305_4.aClass385_3595.y, (int) class305_4.aClass385_3595.z, meshrasterizer_2, 1093700673);
			}
			return class285_5;
		}
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_2 != null) {
			Vector3 vector3_3 = this.method11166().aClass385_3595;
			int i_4 = (int) vector3_3.x >> 9;
			int i_5 = (int) vector3_3.z >> 9;
			this.aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, this.method11168(), i_4, i_4, i_5, i_5, false, 77499913);
		}
	}

	public void method83(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10507.method2136(graphicalrenderer_1, (byte) 0);
	}

	public void method97(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10507.method2118(graphicalrenderer_1, 2118292159);
	}

	public void method98(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10507.method2118(graphicalrenderer_1, 1583823457);
	}

	boolean method12999() {
		return false;
	}

	public int method73() {
		return this.aClass123_10507.anInt1555 * 2129865927 * 845010167;
	}

	final void method12984(int i_1) {
		throw new IllegalStateException();
	}

	boolean method13000() {
		return this.aBool10508;
	}

	public int method13003() {
		return this.aClass123_10507.method2115(-1400524037);
	}

	public int method13017() {
		return this.aClass123_10507.method2115(1023858019);
	}

	public int method13005() {
		return this.aClass123_10507.method2115(-1751223861);
	}

	public GroundDecoration(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, ObjectIndexLoader objectindexloader_3, ObjectDefinitions objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12) {
		super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, objectdefinitions_4.anInt5704);
		this.aClass123_10507 = new Class123(graphicalrenderer_2, objectindexloader_3, objectdefinitions_4, SceneObjectType.GROUND_DECORATION.type, i_11, i_5, i_6, this, bool_10, i_12);
		this.aBool10506 = objectdefinitions_4.interactable != 0 && !bool_10;
		this.method13008(1, (byte) -48);
	}

	public int method89(int i_1) {
		return this.aClass123_10507.anInt1555;
	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			Class285 class285_5 = Class470.method7824(this.aBool10506, (byte) -77);
			int i_6 = (int) class305_4.aClass385_3595.x >> 9;
			int i_7 = (int) class305_4.aClass385_3595.z >> 9;
			this.aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, -467825416);
			meshrasterizer_2.method11282(matrix44var_3, this.aEntityNode_Sub5Array7965[0], 0);
			if (this.aClass123_10507.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10507.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}
			this.aBool10508 = meshrasterizer_2.i() || this.aClass123_10507.aClass539_1538 != null;
			if (this.aClass200_10505 == null) {
				this.aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.aClass385_3595.x, (int) class305_4.aClass385_3595.y, (int) class305_4.aClass385_3595.z, meshrasterizer_2, (byte) -32);
			} else {
				Class388.method6694(this.aClass200_10505, (int) class305_4.aClass385_3595.x, (int) class305_4.aClass385_3595.y, (int) class305_4.aClass385_3595.z, meshrasterizer_2, 234784710);
			}
			return class285_5;
		}
	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10507.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Position class305_4 = this.method11166();
			Class285 class285_5 = Class470.method7824(this.aBool10506, (byte) -86);
			int i_6 = (int) class305_4.aClass385_3595.x >> 9;
			int i_7 = (int) class305_4.aClass385_3595.z >> 9;
			this.aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, 973723182);
			meshrasterizer_2.method11282(matrix44var_3, this.aEntityNode_Sub5Array7965[0], 0);
			if (this.aClass123_10507.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10507.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}
			this.aBool10508 = meshrasterizer_2.i() || this.aClass123_10507.aClass539_1538 != null;
			if (this.aClass200_10505 == null) {
				this.aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.aClass385_3595.x, (int) class305_4.aClass385_3595.y, (int) class305_4.aClass385_3595.z, meshrasterizer_2, (byte) 68);
			} else {
				Class388.method6694(this.aClass200_10505, (int) class305_4.aClass385_3595.x, (int) class305_4.aClass385_3595.y, (int) class305_4.aClass385_3595.z, meshrasterizer_2, 1066988598);
			}
			return class285_5;
		}
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_2 != null) {
			Vector3 vector3_3 = this.method11166().aClass385_3595;
			int i_4 = (int) vector3_3.x >> 9;
			int i_5 = (int) vector3_3.z >> 9;
			this.aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, this.method11168(), i_4, i_4, i_5, i_5, false, 315040844);
		}
	}

	public int method13006() {
		return this.aClass123_10507.method2115(-674527119);
	}

	public boolean method95() {
		return this.aClass123_10507.method2117(-917966176);
	}

	final boolean method13011() {
		return false;
	}

	final void method13016(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		throw new IllegalStateException();
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10505;
	}

	public void method88(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10507.method2118(graphicalrenderer_1, 2063033359);
	}

	final void method13021() {
		throw new IllegalStateException();
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	public void method93(GraphicalRenderer graphicalrenderer_1) {
		this.aClass123_10507.method2136(graphicalrenderer_1, (byte) -31);
	}

	public void method96() {
	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		return this.aClass200_10505;
	}

	public static final void method16094(IComponentDefinitions[] arr_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, boolean bool_9) {
		Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
		for (int i_11 = 0; i_11 < arr_0.length; i_11++) {
			IComponentDefinitions icomponentdefinitions_12 = arr_0[i_11];
			if (icomponentdefinitions_12 != null && (icomponentdefinitions_12.parent == i_1 || i_1 == -1412584499 && icomponentdefinitions_12 == client.aClass118_7257)) {
				int i_13;
				if (i_8 == -1) {
					client.aRectangleArray7411[client.anInt7407].setBounds(icomponentdefinitions_12.x + i_6, i_7 + icomponentdefinitions_12.y, icomponentdefinitions_12.width, icomponentdefinitions_12.height);
					i_13 = ++client.anInt7407 - 1;
				} else {
					i_13 = i_8;
				}
				icomponentdefinitions_12.anInt1449 = i_13;
				icomponentdefinitions_12.anInt1450 = client.cycles;
				if (!client.method11651(icomponentdefinitions_12)) {
					if (icomponentdefinitions_12.contentType != 0) {
						Class28.method776(icomponentdefinitions_12);
					}
					int i_14 = icomponentdefinitions_12.x + i_6;
					int i_15 = i_7 + icomponentdefinitions_12.y;
					int i_16 = icomponentdefinitions_12.transparency;
					if (client.aBool7168 && (client.method11633(icomponentdefinitions_12).settingsHash != 0 || icomponentdefinitions_12.type == 0) && i_16 > 127) {
						i_16 = 127;
					}
					int i_17;
					int i_18;
					if (icomponentdefinitions_12 == client.aClass118_7257) {
						if (i_1 != -1412584499 && (icomponentdefinitions_12.anInt1382 == IComponentDefinitions.anInt1265 || icomponentdefinitions_12.anInt1382 == IComponentDefinitions.anInt1283 || client.method11633(icomponentdefinitions_12).bit23Enabled())) {
							Class328.aClass118Array3772 = arr_0;
							GameTipsLoader.anInt4822 = i_6;
							IsaacCipher.anInt5157 = i_7;
							continue;
						}
						if (client.aBool7364 && client.aBool7403) {
							i_17 = Class163.mouseRecorder.getMouseX();
							i_18 = Class163.mouseRecorder.getMouseY();
							i_17 -= client.anInt7361;
							i_18 -= client.anInt7362;
							if (i_17 < client.anInt7432) {
								i_17 = client.anInt7432;
							}
							if (i_17 + icomponentdefinitions_12.width > client.anInt7432 + client.anInt7367) {
								i_17 = client.anInt7432 + client.anInt7367 - icomponentdefinitions_12.width;
							}
							if (i_18 < client.anInt7265) {
								i_18 = client.anInt7265;
							}
							if (i_18 + icomponentdefinitions_12.height > client.anInt7265 + client.anInt7476) {
								i_18 = client.anInt7476 + client.anInt7265 - icomponentdefinitions_12.height;
							}
							if (client.method11633(icomponentdefinitions_12).bit23Enabled()) {
								Class292.method5201(i_17, i_18, icomponentdefinitions_12.width, icomponentdefinitions_12.height);
							}
							i_14 = i_17;
							i_15 = i_18;
						}
						if (icomponentdefinitions_12.anInt1382 == IComponentDefinitions.anInt1283) {
							i_16 = 128;
						}
					}
					int i_19;
					int i_20;
					int i_21;
					int i_22;
					if (icomponentdefinitions_12.type == 2) {
						i_17 = i_2;
						i_18 = i_3;
						i_19 = i_4;
						i_20 = i_5;
					} else {
						i_21 = i_14 + icomponentdefinitions_12.width;
						i_22 = i_15 + icomponentdefinitions_12.height;
						if (icomponentdefinitions_12.type == 9) {
							++i_21;
							++i_22;
						}
						i_17 = i_14 > i_2 ? i_14 : i_2;
						i_18 = i_15 > i_3 ? i_15 : i_3;
						i_19 = i_21 < i_4 ? i_21 : i_4;
						i_20 = i_22 < i_5 ? i_22 : i_5;
					}
					if (i_17 < i_19 && i_18 < i_20) {
						if (icomponentdefinitions_12.contentType != 0) {
							if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1372 || icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1436) {
								HitbarDefinitions.method3231(i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height, icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1436);
								TCPPacket.method12366(i_13, i_17, i_18, i_19, i_20, i_14, i_15);
								Renderers.SOFTWARE_RENDERER.method8421();
								Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
								client.aBoolArray7443[i_13] = true;
								continue;
							}
							if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1269 && client.anInt7341 == 1) {
								if (icomponentdefinitions_12.method2046(Renderers.SOFTWARE_RENDERER, -890940576) != null) {
									Node_Sub20_Sub24.method15391(-165186170);
									Item.method12574(Renderers.SOFTWARE_RENDERER, icomponentdefinitions_12, i_14, i_15);
									Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
								}
								continue;
							}
							if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1276) {
								Shadow.method15506(Renderers.SOFTWARE_RENDERER, i_14, i_15, icomponentdefinitions_12);
								continue;
							}
							if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1300) {
								Class366.method6301(Renderers.SOFTWARE_RENDERER, i_14, i_15, icomponentdefinitions_12, icomponentdefinitions_12.color % 64);
								continue;
							}
							if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1270) {
								if (icomponentdefinitions_12.method2046(Renderers.SOFTWARE_RENDERER, -1781031351) != null) {
									Class278_Sub1.method13448(icomponentdefinitions_12, i_14, i_15);
									Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
								}
								continue;
							}
							if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1313) {
								Node_Sub46.method13407(Renderers.SOFTWARE_RENDERER, IndexLoaders.IMAGE_LOADER, i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height);
								client.aBoolArray7443[i_13] = true;
								Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
								continue;
							}
							if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1272) {
								LoadingStage.renderMiniMiniMap(Renderers.SOFTWARE_RENDERER, i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height);
								client.aBoolArray7443[i_13] = true;
								Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
								continue;
							}
							if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1273) {
								if (client.aBool7176 || client.aBool7177) {
									NPCDirection.method4326(i_14, i_15, icomponentdefinitions_12);
									client.aBoolArray7443[i_13] = true;
								}
								continue;
							}
						}
						int i_23;
						int i_24;
						int i_25;
						if (icomponentdefinitions_12.type == 0) {
							if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1275 && Renderers.SOFTWARE_RENDERER.method8471()) {
								Renderers.SOFTWARE_RENDERER.method8525(Class349.anInt4083, client.anInt3243 * -969250379);
							}
							method16094(arr_0, icomponentdefinitions_12.idHash, i_17, i_18, i_19, i_20, i_14 - icomponentdefinitions_12.scrollX, i_15 - icomponentdefinitions_12.scrollY, i_13, bool_9);
							if (icomponentdefinitions_12.aClass118Array1439 != null) {
								method16094(icomponentdefinitions_12.aClass118Array1439, icomponentdefinitions_12.idHash, i_17, i_18, i_19, i_20, i_14 - icomponentdefinitions_12.scrollX, i_15 - icomponentdefinitions_12.scrollY, i_13, bool_9);
							}
							Node_Sub44 class282_sub44_33 = (Node_Sub44) client.aClass465_7442.get((long) icomponentdefinitions_12.idHash);
							if (class282_sub44_33 != null) {
								RenderAnimIndexLoader.method3629(class282_sub44_33.anInt8063, i_17, i_18, i_19, i_20, i_14, i_15, i_13, -1473886497);
							}
							if (icomponentdefinitions_12.contentType == IComponentDefinitions.anInt1275) {
								if (Renderers.SOFTWARE_RENDERER.method8471()) {
									Renderers.SOFTWARE_RENDERER.method8474();
								}
								if (client.anInt7341 == 4) {
									i_22 = client.anInt7238;
									i_23 = client.anInt7377;
									i_24 = client.anInt7413;
									i_25 = client.anInt7217;
									if (client.cycles < client.anInt7237) {
										float f_26 = (float) (client.cycles - client.anInt7236) * 1.0F / (float) (client.anInt7237 - client.anInt7236);
										i_22 = (int) ((float) client.anInt7238 * f_26 + (1.0F - f_26) * (float) Preference_Sub2.anInt7868);
										i_23 = (int) ((float) client.anInt7377 * f_26 + (float) Class350_Sub2.anInt7815 * (1.0F - f_26));
										i_24 = (int) (f_26 * (float) client.anInt7413 + (float) Class329_Sub1.anInt7726 * (1.0F - f_26));
										i_25 = (int) (f_26 * (float) client.anInt7217 + (float) Node_Sub17_Sub4.anInt9940 * (1.0F - f_26));
									}
									if (i_22 > 0) {
										Renderers.SOFTWARE_RENDERER.method8425(i_17, i_18, i_19 - i_17, i_20 - i_18, i_22 << 24 | i_23 << 16 | i_24 << 8 | i_25, (byte) -107);
									}
								}
							}
							Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
						}
						if (client.aBoolArray7410[i_13] || client.anInt7412 > 1) {
							if (icomponentdefinitions_12.type == 3) {
								if (i_16 == 0) {
									if (icomponentdefinitions_12.aBool1316) {
										Renderers.SOFTWARE_RENDERER.B(i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height, icomponentdefinitions_12.color, 0);
									} else {
										Renderers.SOFTWARE_RENDERER.method8430(i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height, icomponentdefinitions_12.color, 0);
									}
								} else if (icomponentdefinitions_12.aBool1316) {
									Renderers.SOFTWARE_RENDERER.B(i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height, 255 - (i_16 & 0xff) << 24 | icomponentdefinitions_12.color & 0xffffff, 1);
								} else {
									Renderers.SOFTWARE_RENDERER.method8430(i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height, 255 - (i_16 & 0xff) << 24 | icomponentdefinitions_12.color & 0xffffff, 1);
								}
							} else {
								ItemDefinitions itemdefinitions_36;
								if (icomponentdefinitions_12.type == 4) {
									FontRenderer fontrenderer_43 = icomponentdefinitions_12.method1988(Class487.aClass378_5752, client.anInterface35_7206, 177804367);
									if (fontrenderer_43 == null) {
										if (IComponentDefinitions.aBool1399) {
											Class109.redrawComponent(icomponentdefinitions_12);
										}
									} else {
										i_22 = icomponentdefinitions_12.color;
										String string_35 = icomponentdefinitions_12.text;
										if (icomponentdefinitions_12.anInt1426 != -1) {
											itemdefinitions_36 = IndexLoaders.ITEM_LOADER.getItemDefinitions(icomponentdefinitions_12.anInt1426);
											string_35 = itemdefinitions_36.name;
											if (string_35 == null) {
												string_35 = "null";
											}
											if ((itemdefinitions_36.stackable == 1 || icomponentdefinitions_12.anInt1427 != 1) && icomponentdefinitions_12.anInt1427 != -1) {
												string_35 = Utils.rgbToColHexShortcut(16748608) + string_35 + "</col>" + " x" + Class488.method8210(icomponentdefinitions_12.anInt1427);
											}
										}
										if (icomponentdefinitions_12.anInt1435 != -1) {
											string_35 = Class148.method2550(icomponentdefinitions_12.anInt1435);
											if (string_35 == null) {
												string_35 = "";
											}
										}
										if (icomponentdefinitions_12 == client.aClass118_7352) {
											string_35 = Message.PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE);
											i_22 = icomponentdefinitions_12.color;
										}
										if (client.aBool7358) {
											Renderers.SOFTWARE_RENDERER.o(i_14, i_15, i_14 + icomponentdefinitions_12.width, i_15 + icomponentdefinitions_12.height);
										}
										if (icomponentdefinitions_12.aBool1363) {
											fontrenderer_43.method367(string_35, i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height, 255 - (i_16 & 0xff) << 24 | i_22, icomponentdefinitions_12.aBool1420 ? 255 - (i_16 & 0xff) << 24 : -1, icomponentdefinitions_12.anInt1359, icomponentdefinitions_12.anInt1360, client.aRandom7260, PacketsDecoder.anInt9079, client.anIntArray7438, Class182.aNativeSpriteArray2261, (int[]) null, 1113506161);
										} else {
											fontrenderer_43.method373(string_35, i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height, 255 - (i_16 & 0xff) << 24 | i_22, icomponentdefinitions_12.aBool1420 ? 255 - (i_16 & 0xff) << 24 : -1, icomponentdefinitions_12.anInt1359, icomponentdefinitions_12.anInt1360, icomponentdefinitions_12.anInt1358, icomponentdefinitions_12.anInt1362, Class182.aNativeSpriteArray2261, (int[]) null, (Class455) null, 0, 0);
										}
										if (client.aBool7358) {
											Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
										}
									}
								} else {
									int i_27;
									int i_39;
									if (icomponentdefinitions_12.type == 5) {
										if (icomponentdefinitions_12.anInt1404 >= 0) {
											icomponentdefinitions_12.method2027(IndexLoaders.SKYBOX_LOADER, IndexLoaders.SUN_LOADER, -1984245878).method4214(Renderers.SOFTWARE_RENDERER, i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height, icomponentdefinitions_12.anInt1430 << 3, icomponentdefinitions_12.anInt1431 << 3);
										} else {
											NativeSprite nativesprite_41;
											if (icomponentdefinitions_12.anInt1426 != -1) {
												PlayerAppearance playerappearance_34 = icomponentdefinitions_12.aBool1388 ? VertexNormal.MY_PLAYER.playerAppearance : null;
												nativesprite_41 = IndexLoaders.ITEM_LOADER.softwareRender(Renderers.SOFTWARE_RENDERER, icomponentdefinitions_12.anInt1426, icomponentdefinitions_12.anInt1427, icomponentdefinitions_12.anInt1323, ~0xffffff | icomponentdefinitions_12.anInt1324, icomponentdefinitions_12.anInt1335, playerappearance_34);
											} else if (icomponentdefinitions_12.anInt1435 != -1) {
												nativesprite_41 = SpotAnimIndexLoader.method8858(Renderers.SOFTWARE_RENDERER, icomponentdefinitions_12.anInt1435);
											} else {
												nativesprite_41 = icomponentdefinitions_12.method2048(Renderers.SOFTWARE_RENDERER);
											}
											if (nativesprite_41 != null) {
												i_22 = nativesprite_41.scaleWidth();
												i_23 = nativesprite_41.method2748();
												i_24 = 255 - (i_16 & 0xff) << 24 | (icomponentdefinitions_12.color != 0 ? icomponentdefinitions_12.color & 0xffffff : 16777215);
												if (!icomponentdefinitions_12.aBool1322) {
													if (icomponentdefinitions_12.color == 0 && i_16 == 0) {
														if (icomponentdefinitions_12.anInt1423 != 0) {
															nativesprite_41.method2758((float) icomponentdefinitions_12.width / 2.0F + (float) i_14, (float) i_15 + (float) icomponentdefinitions_12.height / 2.0F, icomponentdefinitions_12.width * 4096 / i_22, icomponentdefinitions_12.anInt1423);
														} else if (i_22 == icomponentdefinitions_12.width && i_23 == icomponentdefinitions_12.height) {
															nativesprite_41.method2752(i_14, i_15);
														} else {
															nativesprite_41.method2789(i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height);
														}
													} else if (icomponentdefinitions_12.anInt1423 != 0) {
														nativesprite_41.method2790((float) icomponentdefinitions_12.width / 2.0F + (float) i_14, (float) icomponentdefinitions_12.height / 2.0F + (float) i_15, icomponentdefinitions_12.width * 4096 / i_22, icomponentdefinitions_12.anInt1423, i_24);
													} else if (i_22 == icomponentdefinitions_12.width && i_23 == icomponentdefinitions_12.height) {
														nativesprite_41.method2742(i_14, i_15, 0, i_24, 1);
													} else {
														nativesprite_41.method2754(i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height, 0, i_24, 1);
													}
												} else {
													Renderers.SOFTWARE_RENDERER.o(i_14, i_15, i_14 + icomponentdefinitions_12.width, i_15 + icomponentdefinitions_12.height);
													if (icomponentdefinitions_12.anInt1423 != 0) {
														i_25 = (i_22 - 1 + icomponentdefinitions_12.width) / i_22;
														i_39 = (i_23 - 1 + icomponentdefinitions_12.height) / i_23;
														for (i_27 = 0; i_27 < i_25; i_27++) {
															for (int i_28 = 0; i_28 < i_39; i_28++) {
																if (icomponentdefinitions_12.color != 0) {
																	nativesprite_41.method2790((float) (i_14 + i_27 * i_22) + (float) i_22 / 2.0F, (float) i_23 / 2.0F + (float) (i_15 + i_23 * i_28), 4096, icomponentdefinitions_12.anInt1423, i_24);
																} else {
																	nativesprite_41.method2758((float) (i_14 + i_22 * i_27) + (float) i_22 / 2.0F, (float) (i_15 + i_23 * i_28) + (float) i_23 / 2.0F, 4096, icomponentdefinitions_12.anInt1423);
																}
															}
														}
													} else if (icomponentdefinitions_12.color == 0 && i_16 == 0) {
														nativesprite_41.method2756(i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height);
													} else {
														nativesprite_41.method2772(i_14, i_15, icomponentdefinitions_12.width, icomponentdefinitions_12.height, 0, i_24, 1);
													}
													Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
												}
											} else if (IComponentDefinitions.aBool1399) {
												Class109.redrawComponent(icomponentdefinitions_12);
											}
										}
									} else if (icomponentdefinitions_12.type == 6) {
										IndexLoaders.MAP_REGION_DECODER.method4435().method4052();
										MeshRasterizer meshrasterizer_40 = null;
										i_22 = 2048;
										if (icomponentdefinitions_12.anInt1354 != 0) {
											i_22 |= 0x80000;
										}
										i_23 = 0;
										if (icomponentdefinitions_12.anInt1426 != -1) {
											itemdefinitions_36 = IndexLoaders.ITEM_LOADER.getItemDefinitions(icomponentdefinitions_12.anInt1426);
											if (itemdefinitions_36 != null) {
												itemdefinitions_36 = itemdefinitions_36.method7090(icomponentdefinitions_12.anInt1427);
												meshrasterizer_40 = itemdefinitions_36.method7084(Renderers.SOFTWARE_RENDERER, i_22, 1, icomponentdefinitions_12.aBool1388 ? VertexNormal.MY_PLAYER.playerAppearance : null, icomponentdefinitions_12.aAnimation_1437, 0, 0, 0, 0);
												if (meshrasterizer_40 != null) {
													i_23 = -meshrasterizer_40.YA() >> 1;
												} else {
													Class109.redrawComponent(icomponentdefinitions_12);
												}
											}
										} else {
											Player player_37;
											if (icomponentdefinitions_12.anInt1329 == 3) {
												i_24 = icomponentdefinitions_12.anInt1330;
												if (i_24 >= 0 && i_24 < 2048) {
													player_37 = client.players[i_24];
													if (player_37 != null && (i_24 == client.myPlayerIndex || Class272.method4840(player_37.displayName, (byte) 111) == icomponentdefinitions_12.anInt1339)) {
														meshrasterizer_40 = icomponentdefinitions_12.method2002(Renderers.SOFTWARE_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTITI_KIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, IndexLoaders.ANIMATION_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, icomponentdefinitions_12.aAnimation_1437, player_37.playerAppearance);
														if (meshrasterizer_40 == null && IComponentDefinitions.aBool1399) {
															Class109.redrawComponent(icomponentdefinitions_12);
														}
													}
												}
											} else if (icomponentdefinitions_12.anInt1329 == 5) {
												i_24 = icomponentdefinitions_12.anInt1330;
												if (i_24 >= 0 && i_24 < 2048) {
													player_37 = client.players[i_24];
													if (player_37 != null && (i_24 == client.myPlayerIndex || Class272.method4840(player_37.displayName, (byte) 17) == icomponentdefinitions_12.anInt1339)) {
														meshrasterizer_40 = player_37.playerAppearance.method3998(Renderers.SOFTWARE_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTITI_KIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, IndexLoaders.ANIMATION_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, icomponentdefinitions_12.aAnimation_1437, (Animation) null, (Animation[]) null, (int[]) null, 0, LinkedNodeList.EQUIPMENT_DEFAULTS, (short) -10357);
													}
												}
											} else if (icomponentdefinitions_12.anInt1329 != 8 && icomponentdefinitions_12.anInt1329 != 9) {
												if (icomponentdefinitions_12.aAnimation_1437 != null && icomponentdefinitions_12.aAnimation_1437.hasDefs()) {
													meshrasterizer_40 = icomponentdefinitions_12.method2002(Renderers.SOFTWARE_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTITI_KIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, IndexLoaders.ANIMATION_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, icomponentdefinitions_12.aAnimation_1437, VertexNormal.MY_PLAYER.playerAppearance);
													if (meshrasterizer_40 == null && IComponentDefinitions.aBool1399) {
														Class109.redrawComponent(icomponentdefinitions_12);
													}
												} else {
													meshrasterizer_40 = icomponentdefinitions_12.method2002(Renderers.SOFTWARE_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTITI_KIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, IndexLoaders.ANIMATION_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, (Animation) null, VertexNormal.MY_PLAYER.playerAppearance);
													if (meshrasterizer_40 == null && IComponentDefinitions.aBool1399) {
														Class109.redrawComponent(icomponentdefinitions_12);
													}
												}
											} else {
												ItemContainer class282_sub30_42 = ItemContainer.getContainer(icomponentdefinitions_12.anInt1330, false);
												if (class282_sub30_42 != null) {
													meshrasterizer_40 = class282_sub30_42.method12429(Renderers.SOFTWARE_RENDERER, i_22, icomponentdefinitions_12.aAnimation_1437, icomponentdefinitions_12.anInt1339, icomponentdefinitions_12.anInt1329 == 9, icomponentdefinitions_12.aBool1388 ? VertexNormal.MY_PLAYER.playerAppearance : null);
												}
											}
										}
										if (meshrasterizer_40 != null) {
											if (icomponentdefinitions_12.anInt1354 != 0) {
												meshrasterizer_40.PA(icomponentdefinitions_12.anInt1340, icomponentdefinitions_12.anInt1350, icomponentdefinitions_12.anInt1281, icomponentdefinitions_12.anInt1354);
											}
											if (icomponentdefinitions_12.anInt1417 > 0) {
												i_24 = (icomponentdefinitions_12.width << 9) / icomponentdefinitions_12.anInt1417;
											} else {
												i_24 = 512;
											}
											if (icomponentdefinitions_12.anInt1326 > 0) {
												i_25 = (icomponentdefinitions_12.height << 9) / icomponentdefinitions_12.anInt1326;
											} else {
												i_25 = 512;
											}
											i_39 = icomponentdefinitions_12.width / 2 + i_14;
											i_27 = icomponentdefinitions_12.height / 2 + i_15;
											if (!icomponentdefinitions_12.aBool1332) {
												i_39 += i_24 * icomponentdefinitions_12.anInt1441 >> 9;
												i_27 += i_25 * icomponentdefinitions_12.anInt1263 >> 9;
											}
											client.aClass294_7457.method5212();
											Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
											Matrix44Arr matrix44arr_38 = Renderers.SOFTWARE_RENDERER.method8449();
											int i_29 = IndexLoaders.MAP_REGION_DECODER.method4544(-1051442584);
											int i_30 = IndexLoaders.MAP_REGION_DECODER.method4522(-1749801746);
											i_30 += icomponentdefinitions_12.spriteScale;
											if (icomponentdefinitions_12.aBool1344) {
												if (icomponentdefinitions_12.aBool1332) {
													matrix44arr_38.method6532((float) i_39, (float) i_27, (float) i_24, (float) i_25, (float) i_29, (float) i_30, (float) Class349.anInt4083, (float) (client.anInt3243 * -969250379), (float) icomponentdefinitions_12.spriteScale);
												} else {
													matrix44arr_38.method6532((float) i_39, (float) i_27, (float) i_24, (float) i_25, (float) i_29, (float) i_30, (float) Class349.anInt4083, (float) (client.anInt3243 * -969250379), (float) (icomponentdefinitions_12.spriteScale << 2));
												}
											} else {
												matrix44arr_38.method6531((float) i_39, (float) i_27, (float) i_24, (float) i_25, (float) i_29, (float) i_30, (float) Class349.anInt4083, (float) (client.anInt3243 * -969250379));
											}
											Renderers.SOFTWARE_RENDERER.method8424(matrix44arr_38);
											Renderers.SOFTWARE_RENDERER.ba(2, 0);
											if (icomponentdefinitions_12.aBool1345) {
												Renderers.SOFTWARE_RENDERER.RA(false);
											}
											if (icomponentdefinitions_12.aBool1332) {
												client.aClass294_7169.method5217(1.0F, 0.0F, 0.0F, Class382.method6508(icomponentdefinitions_12.spritePitch));
												client.aClass294_7169.method5220(0.0F, 1.0F, 0.0F, Class382.method6508(icomponentdefinitions_12.spriteRoll));
												client.aClass294_7169.method5220(0.0F, 0.0F, 1.0F, Class382.method6508(icomponentdefinitions_12.spriteYaw));
												client.aClass294_7169.method5219((float) icomponentdefinitions_12.anInt1441, (float) icomponentdefinitions_12.anInt1263, (float) icomponentdefinitions_12.anInt1304);
											} else {
												int i_31 = Class382.anIntArray4657[icomponentdefinitions_12.spritePitch << 3] * (icomponentdefinitions_12.spriteScale << 2) >> 14;
												int i_32 = Class382.anIntArray4661[icomponentdefinitions_12.spritePitch << 3] * (icomponentdefinitions_12.spriteScale << 2) >> 14;
												client.aClass294_7169.method5217(0.0F, 0.0F, 1.0F, Class382.method6508(-icomponentdefinitions_12.spriteYaw << 3));
												client.aClass294_7169.method5220(0.0F, 1.0F, 0.0F, Class382.method6508(icomponentdefinitions_12.spriteRoll << 3));
												client.aClass294_7169.method5219((float) (icomponentdefinitions_12.anInt1293 << 2), (float) (i_31 + i_23 + (icomponentdefinitions_12.anInt1334 << 2)), (float) (i_32 + (icomponentdefinitions_12.anInt1334 << 2)));
												client.aClass294_7169.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(icomponentdefinitions_12.spritePitch << 3));
											}
											icomponentdefinitions_12.method1991(Renderers.SOFTWARE_RENDERER, meshrasterizer_40, client.aClass294_7169, client.cycles);
											if (client.aBool7358) {
												Renderers.SOFTWARE_RENDERER.o(i_14, i_15, i_14 + icomponentdefinitions_12.width, i_15 + icomponentdefinitions_12.height);
											}
											meshrasterizer_40.method11282(client.aClass294_7169, (EntityNode_Sub5) null, 1);
											if (!icomponentdefinitions_12.aBool1344 && icomponentdefinitions_12.particleSystem != null) {
												Renderers.SOFTWARE_RENDERER.method8456(icomponentdefinitions_12.particleSystem.method11533());
											}
											if (client.aBool7358) {
												Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
											}
											if (icomponentdefinitions_12.aBool1345) {
												Renderers.SOFTWARE_RENDERER.RA(true);
											}
										}
									} else if (icomponentdefinitions_12.type == 9) {
										if (icomponentdefinitions_12.aBool1357) {
											i_21 = i_14;
											i_22 = i_15 + icomponentdefinitions_12.height;
											i_23 = i_14 + icomponentdefinitions_12.width;
											i_24 = i_15;
										} else {
											i_21 = i_14;
											i_22 = i_15;
											i_23 = i_14 + icomponentdefinitions_12.width;
											i_24 = i_15 + icomponentdefinitions_12.height;
										}
										if (icomponentdefinitions_12.anInt1377 == 1) {
											Renderers.SOFTWARE_RENDERER.method8433(i_21, i_22, i_23, i_24, icomponentdefinitions_12.color, 0);
										} else {
											Renderers.SOFTWARE_RENDERER.method8496(i_21, i_22, i_23, i_24, icomponentdefinitions_12.color, icomponentdefinitions_12.anInt1377, 0);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
