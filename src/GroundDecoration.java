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
			int i_7 = (int) class305_5.coords.x >> 9;
			int i_8 = (int) class305_5.coords.z >> 9;
			this.aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, i_7, i_7, i_8, i_8, true, 1139295169);
			meshrasterizer_3.method11282(matrix44var_4, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10507.aClass539_1538 != null) {
				Class151 class151_9 = this.aClass123_10507.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_9);
			}
			this.aBool10508 = meshrasterizer_3.i() || this.aClass123_10507.aClass539_1538 != null;
			if (this.aClass200_10505 == null) {
				this.aClass200_10505 = EntityNode_Sub2.method12505((int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3, (byte) -28);
			} else {
				Class388.method6694(this.aClass200_10505, (int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3, -1412574443);
			}
			return class285_6;
		}
	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
		MeshRasterizer meshrasterizer_3 = this.aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_3 != null) {
			Vector3 vector3_4 = this.method11166().coords;
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
			int i_6 = (int) class305_4.coords.x >> 9;
			int i_7 = (int) class305_4.coords.z >> 9;
			this.aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, 2037340333);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10507.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10507.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}
			this.aBool10508 = meshrasterizer_2.i() || this.aClass123_10507.aClass539_1538 != null;
			if (this.aClass200_10505 == null) {
				this.aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, (byte) -26);
			} else {
				Class388.method6694(this.aClass200_10505, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, 1093700673);
			}
			return class285_5;
		}
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_2 != null) {
			Vector3 vector3_3 = this.method11166().coords;
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
			int i_6 = (int) class305_4.coords.x >> 9;
			int i_7 = (int) class305_4.coords.z >> 9;
			this.aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, -467825416);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10507.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10507.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}
			this.aBool10508 = meshrasterizer_2.i() || this.aClass123_10507.aClass539_1538 != null;
			if (this.aClass200_10505 == null) {
				this.aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, (byte) -32);
			} else {
				Class388.method6694(this.aClass200_10505, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, 234784710);
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
			int i_6 = (int) class305_4.coords.x >> 9;
			int i_7 = (int) class305_4.coords.z >> 9;
			this.aClass123_10507.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, i_6, i_6, i_7, i_7, true, 973723182);
			meshrasterizer_2.method11282(matrix44var_3, this.boundingBoxPolygons[0], 0);
			if (this.aClass123_10507.aClass539_1538 != null) {
				Class151 class151_8 = this.aClass123_10507.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_8);
			}
			this.aBool10508 = meshrasterizer_2.i() || this.aClass123_10507.aClass539_1538 != null;
			if (this.aClass200_10505 == null) {
				this.aClass200_10505 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, (byte) 68);
			} else {
				Class388.method6694(this.aClass200_10505, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2, 1066988598);
			}
			return class285_5;
		}
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = this.aClass123_10507.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_2 != null) {
			Vector3 vector3_3 = this.method11166().coords;
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
			IComponentDefinitions inter = arr_0[i_11];
			if (inter != null && (inter.parent == i_1 || i_1 == -1412584499 && inter == client.aClass118_7257)) {
				int i_13;
				if (i_8 == -1) {
					client.aRectangleArray7411[client.anInt7407].setBounds(inter.x + i_6, i_7 + inter.y, inter.width, inter.height);
					i_13 = ++client.anInt7407 - 1;
				} else {
					i_13 = i_8;
				}
				inter.anInt1449 = i_13;
				inter.anInt1450 = client.cycles;
				if (!client.method11651(inter)) {
					if (inter.contentType != 0) {
						Class28.method776(inter);
					}
					int drawX = inter.x + i_6;
					int drawY = i_7 + inter.y;
					int i_16 = inter.transparency;
					if (client.aBool7168 && (client.method11633(inter).settingsHash != 0 || inter.type == 0) && i_16 > 127) {
						i_16 = 127;
					}
					int i_17;
					int i_18;
					if (inter == client.aClass118_7257) {
						if (i_1 != -1412584499 && (inter.anInt1382 == IComponentDefinitions.anInt1265 || inter.anInt1382 == IComponentDefinitions.anInt1283 || client.method11633(inter).bit23Enabled())) {
							Comparable_Sub1.aClass118Array3772 = arr_0;
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
							if (i_17 + inter.width > client.anInt7432 + client.anInt7367) {
								i_17 = client.anInt7432 + client.anInt7367 - inter.width;
							}
							if (i_18 < client.anInt7265) {
								i_18 = client.anInt7265;
							}
							if (i_18 + inter.height > client.anInt7265 + client.anInt7476) {
								i_18 = client.anInt7476 + client.anInt7265 - inter.height;
							}
							if (client.method11633(inter).bit23Enabled()) {
								Class292.method5201(i_17, i_18, inter.width, inter.height);
							}
							drawX = i_17;
							drawY = i_18;
						}
						if (inter.anInt1382 == IComponentDefinitions.anInt1283) {
							i_16 = 128;
						}
					}
					int i_19;
					int i_20;
					int i_21;
					int i_22;
					if (inter.type == 2) {
						i_17 = i_2;
						i_18 = i_3;
						i_19 = i_4;
						i_20 = i_5;
					} else {
						i_21 = drawX + inter.width;
						i_22 = drawY + inter.height;
						if (inter.type == 9) {
							++i_21;
							++i_22;
						}
						i_17 = drawX > i_2 ? drawX : i_2;
						i_18 = drawY > i_3 ? drawY : i_3;
						i_19 = i_21 < i_4 ? i_21 : i_4;
						i_20 = i_22 < i_5 ? i_22 : i_5;
					}
					if (i_17 < i_19 && i_18 < i_20) {
						if (inter.contentType != 0) {
							if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1337 || inter.contentType == IComponentDefinitions.CONTENT_TYPE_1403) {
								HitbarDefinitions.method3231(drawX, drawY, inter.width, inter.height, inter.contentType == IComponentDefinitions.CONTENT_TYPE_1403);
								TCPPacket.method12366(i_13, i_17, i_18, i_19, i_20, drawX, drawY);
								Renderers.SOFTWARE_RENDERER.method8421();
								Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
								client.aBoolArray7443[i_13] = true;
								continue;
							}
							if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1338 && client.anInt7341 == 1) {
								if (inter.method2046(Renderers.SOFTWARE_RENDERER, -890940576) != null) {
									Node_Sub20_Sub24.method15391(-165186170);
									Item.method12574(Renderers.SOFTWARE_RENDERER, inter, drawX, drawY);
									Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
								}
								continue;
							}
							if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1408) {
								Shadow.method15506(Renderers.SOFTWARE_RENDERER, drawX, drawY, inter);
								continue;
							}
							if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1409) {
								Class366.method6301(Renderers.SOFTWARE_RENDERER, drawX, drawY, inter, inter.color % 64);
								continue;
							}
							if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1339) {
								if (inter.method2046(Renderers.SOFTWARE_RENDERER, -1781031351) != null) {
									Index36FileReference.method13448(inter, drawX, drawY);
									Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
								}
								continue;
							}
							if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1400) {
								Node_Sub46.method13407(Renderers.SOFTWARE_RENDERER, IndexLoaders.IMAGE_LOADER, drawX, drawY, inter.width, inter.height);
								client.aBoolArray7443[i_13] = true;
								Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
								continue;
							}
							if (inter.contentType == IComponentDefinitions.MINIMAP) {
								LoadingStage.renderMiniMiniMap(Renderers.SOFTWARE_RENDERER, drawX, drawY, inter.width, inter.height);
								client.aBoolArray7443[i_13] = true;
								Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
								continue;
							}
							if (inter.contentType == IComponentDefinitions.DEBUG_INFORMATION) {
								if (client.DRAW_DEBUG || client.aBool7177) {
									NPCDirection.drawDebugInformation(drawX, drawY, inter);
									client.aBoolArray7443[i_13] = true;
								}
								continue;
							}
						}
						int i_23;
						int i_24;
						int i_25;
						if (inter.type == 0) {
							if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1407 && Renderers.SOFTWARE_RENDERER.method8471()) {
								Renderers.SOFTWARE_RENDERER.method8525(Class349.anInt4083, client.anInt3243 * -969250379);
							}
							method16094(arr_0, inter.idHash, i_17, i_18, i_19, i_20, drawX - inter.scrollX, drawY - inter.scrollY, i_13, bool_9);
							if (inter.aClass118Array1439 != null) {
								method16094(inter.aClass118Array1439, inter.idHash, i_17, i_18, i_19, i_20, drawX - inter.scrollX, drawY - inter.scrollY, i_13, bool_9);
							}
							Node_Sub44 class282_sub44_33 = (Node_Sub44) client.aClass465_7442.get((long) inter.idHash);
							if (class282_sub44_33 != null) {
								RenderAnimIndexLoader.method3629(class282_sub44_33.anInt8063, i_17, i_18, i_19, i_20, drawX, drawY, i_13, -1473886497);
							}
							if (inter.contentType == IComponentDefinitions.CONTENT_TYPE_1407) {
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
							if (inter.type == 3) {
								if (i_16 == 0) {
									if (inter.aBool1316) {
										Renderers.SOFTWARE_RENDERER.B(drawX, drawY, inter.width, inter.height, inter.color, 0);
									} else {
										Renderers.SOFTWARE_RENDERER.method8430(drawX, drawY, inter.width, inter.height, inter.color, 0);
									}
								} else if (inter.aBool1316) {
									Renderers.SOFTWARE_RENDERER.B(drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | inter.color & 0xffffff, 1);
								} else {
									Renderers.SOFTWARE_RENDERER.method8430(drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | inter.color & 0xffffff, 1);
								}
							} else {
								ItemDefinitions itemdefinitions_36;
								if (inter.type == 4) {
									FontRenderer fontrenderer_43 = inter.method1988(Class487.aClass378_5752, client.anInterface35_7206, 177804367);
									if (fontrenderer_43 == null) {
										if (IComponentDefinitions.aBool1399) {
											Class109.redrawComponent(inter);
										}
									} else {
										i_22 = inter.color;
										String string_35 = inter.text;
										if (inter.anInt1426 != -1) {
											itemdefinitions_36 = IndexLoaders.ITEM_LOADER.getItemDefinitions(inter.anInt1426);
											string_35 = itemdefinitions_36.name;
											if (string_35 == null) {
												string_35 = "null";
											}
											if ((itemdefinitions_36.stackable == 1 || inter.anInt1427 != 1) && inter.anInt1427 != -1) {
												string_35 = Utils.rgbToColHexShortcut(16748608) + string_35 + "</col>" + " x" + Class488.method8210(inter.anInt1427);
											}
										}
										if (inter.anInt1435 != -1) {
											string_35 = Class148.method2550(inter.anInt1435);
											if (string_35 == null) {
												string_35 = "";
											}
										}
										if (inter == client.aClass118_7352) {
											string_35 = Message.PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE);
											i_22 = inter.color;
										}
										if (client.aBool7358) {
											Renderers.SOFTWARE_RENDERER.o(drawX, drawY, drawX + inter.width, drawY + inter.height);
										}
										if (inter.aBool1363) {
											fontrenderer_43.method367(string_35, drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | i_22, inter.aBool1420 ? 255 - (i_16 & 0xff) << 24 : -1, inter.anInt1359, inter.anInt1360, client.aRandom7260, Class455_Sub3.anInt9079, client.anIntArray7438, Class182.aNativeSpriteArray2261, (int[]) null, 1113506161);
										} else {
											fontrenderer_43.method373(string_35, drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | i_22, inter.aBool1420 ? 255 - (i_16 & 0xff) << 24 : -1, inter.anInt1359, inter.anInt1360, inter.anInt1358, inter.anInt1362, Class182.aNativeSpriteArray2261, (int[]) null, (Class455) null, 0, 0);
										}
										if (client.aBool7358) {
											Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
										}
									}
								} else {
									int i_27;
									int i_39;
									if (inter.type == 5) {
										if (inter.anInt1404 >= 0) {
											inter.method2027(IndexLoaders.SKYBOX_LOADER, IndexLoaders.SUN_LOADER, -1984245878).method4214(Renderers.SOFTWARE_RENDERER, drawX, drawY, inter.width, inter.height, inter.anInt1430 << 3, inter.anInt1431 << 3);
										} else {
											NativeSprite nativesprite_41;
											if (inter.anInt1426 != -1) {
												PlayerAppearance playerappearance_34 = inter.aBool1388 ? VertexNormal.MY_PLAYER.playerAppearance : null;
												nativesprite_41 = IndexLoaders.ITEM_LOADER.softwareRender(Renderers.SOFTWARE_RENDERER, inter.anInt1426, inter.anInt1427, inter.anInt1323, ~0xffffff | inter.anInt1324, inter.anInt1335, playerappearance_34);
											} else if (inter.anInt1435 != -1) {
												nativesprite_41 = SpotAnimIndexLoader.method8858(Renderers.SOFTWARE_RENDERER, inter.anInt1435);
											} else {
												nativesprite_41 = inter.method2048(Renderers.SOFTWARE_RENDERER);
											}
											if (nativesprite_41 != null) {
												i_22 = nativesprite_41.scaleWidth();
												i_23 = nativesprite_41.method2748();
												i_24 = 255 - (i_16 & 0xff) << 24 | (inter.color != 0 ? inter.color & 0xffffff : 16777215);
												if (!inter.aBool1322) {
													if (inter.color == 0 && i_16 == 0) {
														if (inter.anInt1423 != 0) {
															nativesprite_41.method2758((float) inter.width / 2.0F + (float) drawX, (float) drawY + (float) inter.height / 2.0F, inter.width * 4096 / i_22, inter.anInt1423);
														} else if (i_22 == inter.width && i_23 == inter.height) {
															nativesprite_41.method2752(drawX, drawY);
														} else {
															nativesprite_41.method2789(drawX, drawY, inter.width, inter.height);
														}
													} else if (inter.anInt1423 != 0) {
														nativesprite_41.method2790((float) inter.width / 2.0F + (float) drawX, (float) inter.height / 2.0F + (float) drawY, inter.width * 4096 / i_22, inter.anInt1423, i_24);
													} else if (i_22 == inter.width && i_23 == inter.height) {
														nativesprite_41.method2742(drawX, drawY, 0, i_24, 1);
													} else {
														nativesprite_41.method2754(drawX, drawY, inter.width, inter.height, 0, i_24, 1);
													}
												} else {
													Renderers.SOFTWARE_RENDERER.o(drawX, drawY, drawX + inter.width, drawY + inter.height);
													if (inter.anInt1423 != 0) {
														i_25 = (i_22 - 1 + inter.width) / i_22;
														i_39 = (i_23 - 1 + inter.height) / i_23;
														for (i_27 = 0; i_27 < i_25; i_27++) {
															for (int i_28 = 0; i_28 < i_39; i_28++) {
																if (inter.color != 0) {
																	nativesprite_41.method2790((float) (drawX + i_27 * i_22) + (float) i_22 / 2.0F, (float) i_23 / 2.0F + (float) (drawY + i_23 * i_28), 4096, inter.anInt1423, i_24);
																} else {
																	nativesprite_41.method2758((float) (drawX + i_22 * i_27) + (float) i_22 / 2.0F, (float) (drawY + i_23 * i_28) + (float) i_23 / 2.0F, 4096, inter.anInt1423);
																}
															}
														}
													} else if (inter.color == 0 && i_16 == 0) {
														nativesprite_41.method2756(drawX, drawY, inter.width, inter.height);
													} else {
														nativesprite_41.method2772(drawX, drawY, inter.width, inter.height, 0, i_24, 1);
													}
													Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
												}
											} else if (IComponentDefinitions.aBool1399) {
												Class109.redrawComponent(inter);
											}
										}
									} else if (inter.type == 6) {
										IndexLoaders.MAP_REGION_DECODER.method4435().method4052();
										MeshRasterizer meshrasterizer_40 = null;
										i_22 = 2048;
										if (inter.anInt1354 != 0) {
											i_22 |= 0x80000;
										}
										i_23 = 0;
										if (inter.anInt1426 != -1) {
											itemdefinitions_36 = IndexLoaders.ITEM_LOADER.getItemDefinitions(inter.anInt1426);
											if (itemdefinitions_36 != null) {
												itemdefinitions_36 = itemdefinitions_36.method7090(inter.anInt1427);
												meshrasterizer_40 = itemdefinitions_36.method7084(Renderers.SOFTWARE_RENDERER, i_22, 1, inter.aBool1388 ? VertexNormal.MY_PLAYER.playerAppearance : null, inter.aAnimation_1437, 0, 0, 0, 0);
												if (meshrasterizer_40 != null) {
													i_23 = -meshrasterizer_40.YA() >> 1;
												} else {
													Class109.redrawComponent(inter);
												}
											}
										} else {
											Player player_37;
											if (inter.anInt1329 == 3) {
												i_24 = inter.playerIndex;
												if (i_24 >= 0 && i_24 < 2048) {
													player_37 = client.players[i_24];
													if (player_37 != null && (i_24 == client.myPlayerIndex || Class272.method4840(player_37.displayName, (byte) 111) == inter.anInt1339)) {
														meshrasterizer_40 = inter.method2002(Renderers.SOFTWARE_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTITI_KIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, IndexLoaders.ANIMATION_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, inter.aAnimation_1437, player_37.playerAppearance);
														if (meshrasterizer_40 == null && IComponentDefinitions.aBool1399) {
															Class109.redrawComponent(inter);
														}
													}
												}
											} else if (inter.anInt1329 == 5) {
												i_24 = inter.playerIndex;
												if (i_24 >= 0 && i_24 < 2048) {
													player_37 = client.players[i_24];
													if (player_37 != null && (i_24 == client.myPlayerIndex || Class272.method4840(player_37.displayName, (byte) 17) == inter.anInt1339)) {
														meshrasterizer_40 = player_37.playerAppearance.method3998(Renderers.SOFTWARE_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTITI_KIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, IndexLoaders.ANIMATION_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, inter.aAnimation_1437, (Animation) null, (Animation[]) null, (int[]) null, 0, LinkedNodeList.EQUIPMENT_DEFAULTS, (short) -10357);
													}
												}
											} else if (inter.anInt1329 != 8 && inter.anInt1329 != 9) {
												if (inter.aAnimation_1437 != null && inter.aAnimation_1437.hasDefs()) {
													meshrasterizer_40 = inter.method2002(Renderers.SOFTWARE_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTITI_KIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, IndexLoaders.ANIMATION_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, inter.aAnimation_1437, VertexNormal.MY_PLAYER.playerAppearance);
													if (meshrasterizer_40 == null && IComponentDefinitions.aBool1399) {
														Class109.redrawComponent(inter);
													}
												} else {
													meshrasterizer_40 = inter.method2002(Renderers.SOFTWARE_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTITI_KIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, IndexLoaders.ANIMATION_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, (Animation) null, VertexNormal.MY_PLAYER.playerAppearance);
													if (meshrasterizer_40 == null && IComponentDefinitions.aBool1399) {
														Class109.redrawComponent(inter);
													}
												}
											} else {
												ItemContainer class282_sub30_42 = ItemContainer.getContainer(inter.playerIndex, false);
												if (class282_sub30_42 != null) {
													meshrasterizer_40 = class282_sub30_42.method12429(Renderers.SOFTWARE_RENDERER, i_22, inter.aAnimation_1437, inter.anInt1339, inter.anInt1329 == 9, inter.aBool1388 ? VertexNormal.MY_PLAYER.playerAppearance : null);
												}
											}
										}
										if (meshrasterizer_40 != null) {
											if (inter.anInt1354 != 0) {
												meshrasterizer_40.PA(inter.anInt1340, inter.anInt1350, inter.anInt1281, inter.anInt1354);
											}
											if (inter.anInt1417 > 0) {
												i_24 = (inter.width << 9) / inter.anInt1417;
											} else {
												i_24 = 512;
											}
											if (inter.anInt1326 > 0) {
												i_25 = (inter.height << 9) / inter.anInt1326;
											} else {
												i_25 = 512;
											}
											i_39 = inter.width / 2 + drawX;
											i_27 = inter.height / 2 + drawY;
											if (!inter.aBool1332) {
												i_39 += i_24 * inter.anInt1441 >> 9;
												i_27 += i_25 * inter.anInt1263 >> 9;
											}
											client.aClass294_7457.method5212();
											Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
											Matrix44Arr matrix44arr_38 = Renderers.SOFTWARE_RENDERER.method8449();
											int i_29 = IndexLoaders.MAP_REGION_DECODER.method4544(-1051442584);
											int i_30 = IndexLoaders.MAP_REGION_DECODER.method4522(-1749801746);
											i_30 += inter.spriteScale;
											if (inter.aBool1344) {
												if (inter.aBool1332) {
													matrix44arr_38.method6532((float) i_39, (float) i_27, (float) i_24, (float) i_25, (float) i_29, (float) i_30, (float) Class349.anInt4083, (float) (client.anInt3243 * -969250379), (float) inter.spriteScale);
												} else {
													matrix44arr_38.method6532((float) i_39, (float) i_27, (float) i_24, (float) i_25, (float) i_29, (float) i_30, (float) Class349.anInt4083, (float) (client.anInt3243 * -969250379), (float) (inter.spriteScale << 2));
												}
											} else {
												matrix44arr_38.method6531((float) i_39, (float) i_27, (float) i_24, (float) i_25, (float) i_29, (float) i_30, (float) Class349.anInt4083, (float) (client.anInt3243 * -969250379));
											}
											Renderers.SOFTWARE_RENDERER.method8424(matrix44arr_38);
											Renderers.SOFTWARE_RENDERER.ba(2, 0);
											if (inter.aBool1345) {
												Renderers.SOFTWARE_RENDERER.RA(false);
											}
											if (inter.aBool1332) {
												client.aClass294_7169.method5217(1.0F, 0.0F, 0.0F, Class382.method6508(inter.spritePitch));
												client.aClass294_7169.rotation(0.0F, 1.0F, 0.0F, Class382.method6508(inter.spriteRoll));
												client.aClass294_7169.rotation(0.0F, 0.0F, 1.0F, Class382.method6508(inter.spriteYaw));
												client.aClass294_7169.method5219((float) inter.anInt1441, (float) inter.anInt1263, (float) inter.anInt1304);
											} else {
												int i_31 = Class382.SINE[inter.spritePitch << 3] * (inter.spriteScale << 2) >> 14;
												int i_32 = Class382.COSINE[inter.spritePitch << 3] * (inter.spriteScale << 2) >> 14;
												client.aClass294_7169.method5217(0.0F, 0.0F, 1.0F, Class382.method6508(-inter.spriteYaw << 3));
												client.aClass294_7169.rotation(0.0F, 1.0F, 0.0F, Class382.method6508(inter.spriteRoll << 3));
												client.aClass294_7169.method5219((float) (inter.anInt1293 << 2), (float) (i_31 + i_23 + (inter.anInt1334 << 2)), (float) (i_32 + (inter.anInt1334 << 2)));
												client.aClass294_7169.rotation(1.0F, 0.0F, 0.0F, Class382.method6508(inter.spritePitch << 3));
											}
											inter.method1991(Renderers.SOFTWARE_RENDERER, meshrasterizer_40, client.aClass294_7169, client.cycles);
											if (client.aBool7358) {
												Renderers.SOFTWARE_RENDERER.o(drawX, drawY, drawX + inter.width, drawY + inter.height);
											}
											meshrasterizer_40.method11282(client.aClass294_7169, (EntityNode_Sub5) null, 1);
											if (!inter.aBool1344 && inter.particleSystem != null) {
												Renderers.SOFTWARE_RENDERER.method8456(inter.particleSystem.method11533());
											}
											if (client.aBool7358) {
												Renderers.SOFTWARE_RENDERER.r(i_2, i_3, i_4, i_5);
											}
											if (inter.aBool1345) {
												Renderers.SOFTWARE_RENDERER.RA(true);
											}
										}
									} else if (inter.type == 9) {
										if (inter.aBool1357) {
											i_21 = drawX;
											i_22 = drawY + inter.height;
											i_23 = drawX + inter.width;
											i_24 = drawY;
										} else {
											i_21 = drawX;
											i_22 = drawY;
											i_23 = drawX + inter.width;
											i_24 = drawY + inter.height;
										}
										if (inter.anInt1377 == 1) {
											Renderers.SOFTWARE_RENDERER.method8433(i_21, i_22, i_23, i_24, inter.color, 0);
										} else {
											Renderers.SOFTWARE_RENDERER.method8496(i_21, i_22, i_23, i_24, inter.color, inter.anInt1377, 0);
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
