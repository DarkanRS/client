import java.io.IOException;
import java.io.OutputStream;

public class Class289 implements Runnable {

	IOException anIOException3439;
	int anInt3443 = 0;
	int anInt3444 = 0;
	OutputStream anOutputStream3442;
	boolean aBool3446;
	int anInt3440;
	byte[] aByteArray3441;
	Thread aThread3445;

	boolean method5086(int i_1) {
		if (this.aBool3446) {
			try {
				this.anOutputStream3442.close();
				if (this.anIOException3439 == null) {
					this.anIOException3439 = new IOException("");
				}
			} catch (IOException ioexception_3) {
				if (this.anIOException3439 == null) {
					this.anIOException3439 = new IOException(ioexception_3);
				}
			}

			return true;
		} else {
			return false;
		}
	}

	public void run() {
		do {
			int i_1;
			synchronized (this) {
				while (true) {
					if (this.anIOException3439 != null) {
						return;
					}

					if (this.anInt3443 <= this.anInt3444) {
						i_1 = this.anInt3444 - this.anInt3443;
					} else {
						i_1 = this.anInt3440 - this.anInt3443 + this.anInt3444;
					}

					if (i_1 > 0) {
						break;
					}

					try {
						this.anOutputStream3442.flush();
					} catch (IOException ioexception_7) {
						this.anIOException3439 = ioexception_7;
						return;
					}

					if (this.method5086(-1814029220)) {
						return;
					}

					try {
						this.wait();
					} catch (InterruptedException interruptedexception_8) {
						;
					}
				}
			}

			try {
				if (i_1 + this.anInt3443 <= this.anInt3440) {
					this.anOutputStream3442.write(this.aByteArray3441, this.anInt3443, i_1);
				} else {
					int i_4 = this.anInt3440 - this.anInt3443;
					this.anOutputStream3442.write(this.aByteArray3441, this.anInt3443, i_4);
					this.anOutputStream3442.write(this.aByteArray3441, 0, i_1 - i_4);
				}
			} catch (IOException ioexception_9) {
				IOException ioexception_2 = ioexception_9;
				synchronized (this) {
					this.anIOException3439 = ioexception_2;
					return;
				}
			}

			synchronized (this) {
				this.anInt3443 = (i_1 + this.anInt3443) % this.anInt3440;
			}
		} while (!this.method5086(528920596));

	}

	void method5087(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
		if (i_3 >= 0 && i_2 >= 0 && i_3 + i_2 <= bytes_1.length) {
			synchronized (this) {
				if (this.anIOException3439 != null) {
					throw new IOException(this.anIOException3439.toString());
				} else {
					int i_6;
					if (this.anInt3443 <= this.anInt3444) {
						i_6 = this.anInt3440 - this.anInt3444 + this.anInt3443 - 1;
					} else {
						i_6 = this.anInt3443 - this.anInt3444 - 1;
					}

					if (i_6 < i_3) {
						throw new IOException("");
					} else {
						if (i_3 + this.anInt3444 <= this.anInt3440) {
							System.arraycopy(bytes_1, i_2, this.aByteArray3441, this.anInt3444, i_3);
						} else {
							int i_7 = this.anInt3440 - this.anInt3444;
							System.arraycopy(bytes_1, i_2, this.aByteArray3441, this.anInt3444, i_7);
							System.arraycopy(bytes_1, i_7 + i_2, this.aByteArray3441, 0, i_3 - i_7);
						}

						this.anInt3444 = (i_3 + this.anInt3444) % this.anInt3440;
						this.notifyAll();
					}
				}
			}
		} else {
			throw new IOException();
		}
	}

	void method5089(byte b_1) {
		this.anOutputStream3442 = new OutputStream_Sub1();
	}

	void method5094(int i_1) {
		synchronized (this) {
			this.aBool3446 = true;
			this.notifyAll();
		}

		try {
			this.aThread3445.join();
		} catch (InterruptedException interruptedexception_3) {
			;
		}

	}

	Class289(OutputStream outputstream_1, int i_2) {
		this.anOutputStream3442 = outputstream_1;
		this.anInt3440 = i_2 + 1;
		this.aByteArray3441 = new byte[this.anInt3440];
		this.aThread3445 = new Thread(this);
		this.aThread3445.setDaemon(true);
		this.aThread3445.start();
	}

	static boolean method5097(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2) {
		Class169.time();
		if (!graphicalrenderer_0.method8455(1890093661)) {
			return false;
		} else {
			int i_3 = IndexLoaders.MAP_REGION_DECODER.getSizeX(-1338331391);
			int i_4 = IndexLoaders.MAP_REGION_DECODER.getSizeY(-663161868);
			RegionMap regionmap_5 = IndexLoaders.MAP_REGION_DECODER.method4433(33386298);
			SceneObjectManager sceneobjectmanager_6 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1741761339);
			int i_7 = i_3 / 2;
			byte b_8 = 0;
			byte b_9 = 0;
			boolean bool_10 = true;

			int i_11;
			int i_13;
			for (i_11 = b_8; i_11 < i_3 + b_8; i_11++) {
				for (int i_12 = b_9; i_12 < i_4 + b_9; i_12++) {
					for (i_13 = i_1; i_13 <= 3; i_13++) {
						if (regionmap_5.method5498(i_1, i_13, i_11, i_12, (short) -19634)) {
							int i_14 = i_13;
							if (regionmap_5.is0x2(i_11, i_12, 1914032698)) {
								i_14 = i_13 - 1;
							}

							if (i_14 >= 0) {
								bool_10 &= QuickchatDefinitions.method14921(i_14, i_11, i_12, (byte) 95);
							}
						}
					}
				}
			}

			if (!bool_10) {
				return false;
			} else {
				i_11 = i_3 * 4 + 48 + 48;
				int[] ints_35 = new int[i_11 * i_11];

				for (i_13 = 0; i_13 < ints_35.length; i_13++) {
					ints_35[i_13] = -16777216;
				}

				Class158_Sub1 class158_sub1_36 = null;
				byte b_49 = 0;
				byte b_15 = 0;
				if (Class187.aBool2352) {
					Class419.aClass160_5004 = graphicalrenderer_0.method8654(i_11, i_11, false, true);
					class158_sub1_36 = graphicalrenderer_0.method8418();
					class158_sub1_36.method13759(0, Class419.aClass160_5004.method2808());
					Interface8 interface8_16 = graphicalrenderer_0.method8419(i_11, i_11);
					class158_sub1_36.method13765(interface8_16);
					graphicalrenderer_0.method8637(class158_sub1_36, -165772657);
					i_7 = i_3;
					b_49 = 48;
					b_15 = 48;
					graphicalrenderer_0.ba(1, 0);
				} else {
					Class419.aClass160_5004 = graphicalrenderer_0.createNativeSprite(ints_35, 0, i_11, i_11, i_11, 1063937715);
				}

				IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4052((byte) 1);
				int i_37 = ~0xffffff | (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
				int i_17 = ~0xffffff | 238 + (int) (Math.random() * 20.0D) - 10 << 16;
				int i_18 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
				boolean[][] bools_19 = new boolean[i_7 + 1 + 2][i_7 + 1 + 2];

				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_25;
				int i_26;
				int i_27;
				int i_28;
				int i_29;
				int i_31;
				int i_32;
				int i_33;
				int i_34;
				for (int i_20 = b_8; i_20 < b_8 + i_3; i_20 += i_7) {
					for (i_21 = b_9; i_21 < i_4 + b_9; i_21 += i_7) {
						i_22 = b_49;
						i_23 = b_15;
						i_24 = i_20;
						if (i_20 > 0) {
							i_24 = i_20 - 1;
							i_22 = b_49 + 4;
						}

						i_25 = i_21;
						if (i_21 > 0) {
							i_25 = i_21 - 1;
						}

						i_26 = i_7 + i_20;
						if (i_26 < i_3) {
							++i_26;
						}

						i_27 = i_7 + i_21;
						if (i_27 < i_4) {
							++i_27;
							i_23 = b_15 + 4;
						}

						if (Class187.aBool2358) {
							graphicalrenderer_0.L();
						} else {
							graphicalrenderer_0.r(0, 0, i_22 + i_7 * 4, i_23 + i_7 * 4);
						}

						graphicalrenderer_0.ba(3, -16777216);
						i_28 = i_7;
						if (i_7 > i_3 - 1) {
							i_28 = i_3 - 1;
						}

						int i_30;
						for (i_29 = i_1; i_29 <= 3; i_29++) {
							for (i_30 = 0; i_30 <= i_28; i_30++) {
								for (i_31 = 0; i_31 <= i_28; i_31++) {
									bools_19[i_30][i_31] = regionmap_5.method5498(i_1, i_29, i_24 + i_30, i_31 + i_25, (short) 11199);
								}
							}

							sceneobjectmanager_6.aClass390Array2607[i_29].method6715(b_49, b_15, 1024, i_24, i_25, i_26, i_27, bools_19);
							if (!Class187.aBool2356) {
								for (i_30 = -4; i_30 < i_7; i_30++) {
									for (i_31 = -4; i_31 < i_7; i_31++) {
										i_32 = i_20 + i_30;
										i_33 = i_21 + i_31;
										if (i_32 >= b_8 && i_33 >= b_9 && regionmap_5.method5498(i_1, i_29, i_32, i_33, (short) -7367)) {
											i_34 = i_29;
											if (regionmap_5.is0x2(i_32, i_33, 2011719380)) {
												i_34 = i_29 - 1;
											}

											if (i_34 >= 0) {
												Class225_Sub5.method13042(graphicalrenderer_0, i_34, i_32, i_33, i_22 + i_30 * 4, (i_7 - i_31) * 4 + i_23 - 4, i_37, i_17, 1677446637);
											}
										}
									}
								}
							}
						}

						if (Class187.aBool2356) {
							ClipMap clipmap_38 = IndexLoaders.MAP_REGION_DECODER.getClipMap(i_1, 1801793645);

							for (i_30 = 0; i_30 < i_7; i_30++) {
								for (i_31 = 0; i_31 < i_7; i_31++) {
									i_32 = i_20 + i_30;
									i_33 = i_21 + i_31;
									i_34 = clipmap_38.map[i_32 - clipmap_38.offsetX][i_33 - clipmap_38.offsetY];
									if ((i_34 & 0x40240000) != 0) {
										graphicalrenderer_0.method8425(i_22 + i_30 * 4, (i_7 - i_31) * 4 + i_23 - 4, 4, 4, -1713569622, (byte) -107);
									} else if ((i_34 & 0x800000) != 0) {
										graphicalrenderer_0.method8659(i_22 + i_30 * 4, (i_7 - i_31) * 4 + i_23 - 4, 4, -1713569622, -113850245);
									} else if ((i_34 & 0x2000000) != 0) {
										graphicalrenderer_0.method8428(i_22 + i_30 * 4 + 3, (i_7 - i_31) * 4 + i_23 - 4, 4, -1713569622, -1796764807);
									} else if ((i_34 & 0x8000000) != 0) {
										graphicalrenderer_0.method8659(i_22 + i_30 * 4, (i_7 - i_31) * 4 + i_23 - 4 + 3, 4, -1713569622, 1008017075);
									} else if ((i_34 & 0x20000000) != 0) {
										graphicalrenderer_0.method8428(i_22 + i_30 * 4, (i_7 - i_31) * 4 + i_23 - 4, 4, -1713569622, -1796764807);
									}
								}
							}
						}

						graphicalrenderer_0.B(i_22, i_23, i_7 * 4, i_7 * 4, i_18, 2);
						if (!Class187.aBool2352) {
							Class419.aClass160_5004.method2750((i_20 - b_8) * 4 + 48, i_4 * 4 + 48 - (i_21 - b_9) * 4 - i_7 * 4, i_7 * 4, i_7 * 4, i_22, i_23);
							if (Class187.aBool2358) {
								Class419.aClass160_5004.method2752(256, 0);

								try {
									graphicalrenderer_0.method8393((short) 3740);
									Class89.sleep(2000L);
								} catch (Exception exception_48) {
									;
								}
							}
						}
					}
				}

				if (Class187.aBool2352) {
					graphicalrenderer_0.method8416(class158_sub1_36, (byte) -88);
					if (Class187.aBool2358) {
						Class419.aClass160_5004.method2752(256, 0);

						try {
							graphicalrenderer_0.method8393((short) 11377);
							Class89.sleep(2000L);
						} catch (Exception exception_47) {
							;
						}
					}
				}

				graphicalrenderer_0.L();
				graphicalrenderer_0.ba(1, 1);
				IncomingPacket.method6378(-1538407760);
				ObjectIndexLoader objectindexloader_39 = IndexLoaders.MAP_REGION_DECODER.method4436(-1461590672);
				Class187.anInt2353 = 0;
				Class187.aClass482_2350.method8118(862321870);
				if (!Class187.aBool2356) {
					for (i_21 = b_8; i_21 < b_8 + i_3; i_21++) {
						for (i_22 = b_9; i_22 < i_4 + b_9; i_22++) {
							for (i_23 = i_1; i_23 <= i_1 + 1 && i_23 <= 3; i_23++) {
								if (regionmap_5.method5498(i_1, i_23, i_21, i_22, (short) -2270)) {
									SceneObject sceneobject_40 = (SceneObject) sceneobjectmanager_6.getGroundDecoration(i_23, i_21, i_22, -387297653);
									if (sceneobject_40 == null) {
										sceneobject_40 = (SceneObject) sceneobjectmanager_6.getInteractableObject(i_23, i_21, i_22, client.anInterface25_7446, -233664382);
									}

									if (sceneobject_40 == null) {
										sceneobject_40 = (SceneObject) sceneobjectmanager_6.getWall(i_23, i_21, i_22, (byte) -90);
									}

									if (sceneobject_40 == null) {
										sceneobject_40 = (SceneObject) sceneobjectmanager_6.getWallDecoration(i_23, i_21, i_22, (byte) 98);
									}

									if (sceneobject_40 != null) {
										ObjectDefinitions objectdefinitions_41 = objectindexloader_39.getObjectDefinitions(sceneobject_40.getId(905574000), 65280);
										if (!objectdefinitions_41.aBool5660 || client.membersWorld) {
											i_26 = objectdefinitions_41.anInt5669;
											if (objectdefinitions_41.anIntArray5650 != null) {
												for (i_27 = 0; i_27 < objectdefinitions_41.anIntArray5650.length; i_27++) {
													if (objectdefinitions_41.anIntArray5650[i_27] != -1) {
														ObjectDefinitions objectdefinitions_42 = objectindexloader_39.getObjectDefinitions(objectdefinitions_41.anIntArray5650[i_27], 65280);
														if (objectdefinitions_42.anInt5669 >= 0) {
															i_26 = objectdefinitions_42.anInt5669;
														}
													}
												}
											}

											if (i_26 >= 0) {
												boolean bool_50 = false;
												if (i_26 >= 0) {
													WorldMapAreaDefs worldmapareadefs_51 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i_26, 537535478);
													if (worldmapareadefs_51 != null && worldmapareadefs_51.aBool2730) {
														bool_50 = true;
													}
												}

												i_28 = i_21;
												i_29 = i_22;
												if (bool_50) {
													int[][] ints_43 = IndexLoaders.MAP_REGION_DECODER.getClipMap(i_23, 1801793645).map;
													i_31 = IndexLoaders.MAP_REGION_DECODER.getClipMap(i_23, 1801793645).offsetX;
													i_32 = IndexLoaders.MAP_REGION_DECODER.getClipMap(i_23, 1801793645).offsetY;

													for (i_33 = 0; i_33 < 10; i_33++) {
														i_34 = (int) (Math.random() * 4.0D);
														if (i_34 == 0 && i_28 > b_8 && i_28 > i_21 - 3 && (ints_43[i_28 - 1 - i_31][i_29 - i_32] & 0x2c0108) == 0) {
															--i_28;
														}

														if (i_34 == 1 && i_28 < b_8 + i_3 - 1 && i_28 < i_21 + 3 && (ints_43[i_28 + 1 - i_31][i_29 - i_32] & 0x2c0180) == 0) {
															++i_28;
														}

														if (i_34 == 2 && i_29 > b_9 && i_29 > i_22 - 3 && (ints_43[i_28 - i_31][i_29 - 1 - i_32] & 0x2c0102) == 0) {
															--i_29;
														}

														if (i_34 == 3 && i_29 < b_9 + i_4 - 1 && i_29 < i_22 + 3 && (ints_43[i_28 - i_31][i_29 + 1 - i_32] & 0x2c0120) == 0) {
															++i_29;
														}
													}
												}

												Class187.anIntArray2357[Class187.anInt2353] = objectdefinitions_41.id;
												Class187.anIntArray2354[Class187.anInt2353] = i_28;
												Class187.anIntArray2355[Class187.anInt2353] = i_29;
												++Class187.anInt2353;
											}
										}
									}
								}
							}
						}
					}

					Class283 class283_44 = IndexLoaders.MAP_REGION_DECODER.method4528((byte) 79);
					if (class283_44 != null) {
						IndexLoaders.WORLD_MAP_INDEX_LOADER.method3697(1024, 64, -2093693613);
						CoordGrid coordgrid_45 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(825342307);

						for (i_23 = 0; i_23 < class283_44.anInt3382; i_23++) {
							i_24 = class283_44.anIntArray3381[i_23];
							if (i_24 >> 28 == Class84.myPlayer.plane) {
								i_25 = (i_24 >> 14 & 0x3fff) - coordgrid_45.x;
								i_26 = (i_24 & 0x3fff) - coordgrid_45.y;
								if (i_25 >= 0 && i_25 < i_3 && i_26 >= 0 && i_26 < i_4) {
									Class187.aClass482_2350.append(new Class282_Sub38(i_23), -2102160301);
								} else {
									WorldMapAreaDefs worldmapareadefs_46 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(class283_44.anIntArray3383[i_23], 1792768149);
									if (worldmapareadefs_46.anIntArray2717 != null && i_25 + worldmapareadefs_46.anInt2731 >= 0 && i_25 + worldmapareadefs_46.anInt2747 < i_3 && i_26 + worldmapareadefs_46.anInt2746 >= 0 && i_26 + worldmapareadefs_46.anInt2744 < i_4) {
										Class187.aClass482_2350.append(new Class282_Sub38(i_23), -1057083252);
									}
								}
							}
						}

						IndexLoaders.WORLD_MAP_INDEX_LOADER.method3697(128, 64, -1572860391);
					}
				}

				return true;
			}
		}
	}

	static final void method5098(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		Class320.anIntArray3724[i_2] = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		Class282_Sub20_Sub11.method15264(i_2, (short) -20101);
		client.aBool7400 |= Class282_Sub17_Sub2.aBoolArray9934[i_2];
	}

	static final void method5099(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class242.method4159(icomponentdefinitions_3, interface_4, cs2executor_0, -1802550840);
	}

	static final void method5100(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class41_Sub1_Sub1.method15524((byte) -41);
	}

}
