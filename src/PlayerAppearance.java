public class PlayerAppearance {

	static int[] anIntArray2917 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };
	static SoftCache aClass229_2920 = new SoftCache(260);
	static SoftCache aClass229_2930 = new SoftCache(5);
	public int anInt2928 = -1;
	long aLong2926;
	int anInt2925;
	int[] anIntArray2921;
	MeshModifier[] aClass422Array2922;
	public int[] colors;
	public boolean aBool2929;
	long aLong2927;

	void method3991(byte b_1) {
		long[] longs_2 = RsByteBuffer.aLongArray7979;
		this.aLong2926 = -1L;
		this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) (this.anInt2925 >> 8)) & 0xffL)];
		this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) this.anInt2925) & 0xffL)];

		int i_3;
		for (i_3 = 0; i_3 < this.anIntArray2921.length; i_3++) {
			this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) (this.anIntArray2921[i_3] >> 24)) & 0xffL)];
			this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) (this.anIntArray2921[i_3] >> 16)) & 0xffL)];
			this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) (this.anIntArray2921[i_3] >> 8)) & 0xffL)];
			this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) this.anIntArray2921[i_3]) & 0xffL)];
		}

		if (this.aClass422Array2922 != null) {
			for (i_3 = 0; i_3 < this.aClass422Array2922.length; i_3++) {
				if (this.aClass422Array2922[i_3] != null) {
					int[] ints_4;
					int[] ints_5;
					if (this.aBool2929) {
						ints_4 = this.aClass422Array2922[i_3].femaleBody;
						ints_5 = this.aClass422Array2922[i_3].femaleHeads;
					} else {
						ints_4 = this.aClass422Array2922[i_3].maleBody;
						ints_5 = this.aClass422Array2922[i_3].maleHeads;
					}

					int i_6;
					if (ints_4 != null) {
						for (i_6 = 0; i_6 < ints_4.length; i_6++) {
							this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) (ints_4[i_6] >> 8)) & 0xffL)];
							this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) ints_4[i_6]) & 0xffL)];
						}
					}

					if (ints_5 != null) {
						for (i_6 = 0; i_6 < ints_5.length; i_6++) {
							this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) (ints_5[i_6] >> 8)) & 0xffL)];
							this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) ints_5[i_6]) & 0xffL)];
						}
					}

					if (this.aClass422Array2922[i_3].modifiedColors != null) {
						for (i_6 = 0; i_6 < this.aClass422Array2922[i_3].modifiedColors.length; i_6++) {
							this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) (this.aClass422Array2922[i_3].modifiedColors[i_6] >> 8)) & 0xffL)];
							this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) this.aClass422Array2922[i_3].modifiedColors[i_6]) & 0xffL)];
						}
					}

					if (this.aClass422Array2922[i_3].modifiedTextures != null) {
						for (i_6 = 0; i_6 < this.aClass422Array2922[i_3].modifiedTextures.length; i_6++) {
							this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) (this.aClass422Array2922[i_3].modifiedTextures[i_6] >> 8)) & 0xffL)];
							this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) this.aClass422Array2922[i_3].modifiedTextures[i_6]) & 0xffL)];
						}
					}
				}
			}
		}

		for (i_3 = 0; i_3 < 10; i_3++) {
			this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) this.colors[i_3]) & 0xffL)];
		}

		this.aLong2926 = this.aLong2926 >>> 8 ^ longs_2[(int) ((this.aLong2926 ^ (long) (this.aBool2929 ? 1 : 0)) & 0xffL)];
	}

	public void method3992(int i_1, int[] ints_2, MeshModifier[] arr_3, int[] ints_4, boolean bool_5, int i_6, int i_7) {
		if (this.anInt2925 != i_1) {
			this.anInt2925 = i_1;
		}

		this.anIntArray2921 = ints_2;
		this.aClass422Array2922 = arr_3;
		this.colors = ints_4;
		this.aBool2929 = bool_5;
		this.anInt2928 = i_6;
		this.method3991((byte) 3);
	}

	public void method3993(int i_1, int i_2, Class31 class31_3, int i_4) {
		int i_5 = anIntArray2917[i_1];
		if (class31_3.method800(i_2, 1435454406) != null) {
			this.anIntArray2921[i_5] = i_2 | ~0x7fffffff;
			this.method3991((byte) 3);
		}

	}

	public void method3995(int i_1, int i_2, ItemIndexLoader itemindexloader_3, byte b_4) {
		if (i_2 == -1) {
			this.anIntArray2921[i_1] = 0;
		} else if (itemindexloader_3.getItemDefinitions(i_2, 115625832) != null) {
			this.anIntArray2921[i_1] = i_2 | 0x40000000;
			this.method3991((byte) 3);
		}

	}

	public MeshRasterizer method3998(GraphicalRenderer graphicalrenderer_1, int i_2, RenderAnimIndexLoader renderanimindexloader_3, Class31 class31_4, NPCIndexLoader npcindexloader_5, ItemIndexLoader itemindexloader_6, AnimationIndexLoader animationindexloader_7, Interface42 interface42_8, Animation animation_9, Animation animation_10, Animation[] arr_11, int[] ints_12, int i_13, boolean bool_14, Defaults6Loader defaults6loader_15, short s_16) {
		if (this.anInt2928 != -1) {
			return npcindexloader_5.getNPCDefinitions(this.anInt2928, (byte) -32).method6875(graphicalrenderer_1, i_2, renderanimindexloader_3, interface42_8, animation_9, animation_10, arr_11, ints_12, i_13, (Class417) null, 2039422694);
		} else {
			int i_17 = i_2;
			long long_18 = this.aLong2926;
			int[] ints_20 = this.anIntArray2921;
			boolean bool_21 = false;
			boolean bool_22 = false;
			int i_24;
			if (animation_9 != null) {
				AnimationDefinitions animationdefinitions_23 = animation_9.getDefs();
				if (animationdefinitions_23 != null && (animationdefinitions_23.leftHandItem >= 0 || animationdefinitions_23.rightHandItem >= 0)) {
					ints_20 = new int[this.anIntArray2921.length];

					for (i_24 = 0; i_24 < ints_20.length; i_24++) {
						ints_20[i_24] = this.anIntArray2921[i_24];
					}

					if (animationdefinitions_23.leftHandItem >= 0 && defaults6loader_15.anInt6990 != -1) {
						bool_21 = true;
						if (animationdefinitions_23.leftHandItem == 65535) {
							ints_20[defaults6loader_15.anInt6990] = 0;

							for (i_24 = 0; i_24 < defaults6loader_15.anIntArray6992.length; i_24++) {
								ints_20[defaults6loader_15.anIntArray6992[i_24]] = 0;
							}

							long_18 ^= ~0xffffffffL;
						} else {
							ints_20[defaults6loader_15.anInt6990] = animationdefinitions_23.leftHandItem | 0x40000000;

							for (i_24 = 0; i_24 < defaults6loader_15.anIntArray6992.length; i_24++) {
								ints_20[defaults6loader_15.anIntArray6992[i_24]] = 0;
							}

							long_18 ^= (long) ints_20[defaults6loader_15.anInt6990] << 32;
						}
					}

					if (animationdefinitions_23.rightHandItem >= 0 && defaults6loader_15.anInt6991 != -1) {
						bool_22 = true;
						if (animationdefinitions_23.rightHandItem == 65535) {
							ints_20[defaults6loader_15.anInt6991] = 0;

							for (i_24 = 0; i_24 < defaults6loader_15.anIntArray6993.length; i_24++) {
								ints_20[defaults6loader_15.anIntArray6993[i_24]] = 0;
							}

							long_18 ^= 0xffffffffL;
						} else {
							ints_20[defaults6loader_15.anInt6991] = animationdefinitions_23.rightHandItem | 0x40000000;

							for (i_24 = 0; i_24 < defaults6loader_15.anIntArray6993.length; i_24++) {
								ints_20[defaults6loader_15.anIntArray6993[i_24]] = 0;
							}

							long_18 ^= (long) ints_20[defaults6loader_15.anInt6991];
						}
					}
				}
			}

			boolean bool_38 = false;
			i_24 = arr_11 != null ? arr_11.length : 0;

			for (int i_25 = 0; i_25 < i_24; i_25++) {
				if (arr_11[i_25] != null) {
					i_17 |= arr_11[i_25].method7640(-1188538690);
					bool_38 = true;
				}
			}

			if (animation_9 != null) {
				i_17 |= animation_9.method7640(-1468207471);
				bool_38 = true;
			}

			if (animation_10 != null) {
				i_17 |= animation_10.method7640(-1978063837);
				bool_38 = true;
			}

			boolean bool_50 = false;
			if (ints_12 != null) {
				for (int i_26 = 0; i_26 < ints_12.length; i_26++) {
					if (ints_12[i_26] != -1) {
						i_17 |= 0x20;
						bool_50 = true;
					}
				}
			}

			SoftCache softcache_27 = aClass229_2920;
			MeshRasterizer meshrasterizer_39;
			synchronized (aClass229_2920) {
				meshrasterizer_39 = (MeshRasterizer) aClass229_2920.get(long_18);
			}

			RenderAnimDefs renderanimdefs_51 = null;
			if (this.anInt2925 != -1) {
				renderanimdefs_51 = renderanimindexloader_3.getRenderAnimDefs(this.anInt2925, (byte) 62);
			}

			int i_30;
			int i_31;
			if (meshrasterizer_39 == null || graphicalrenderer_1.method8452(meshrasterizer_39.m(), i_17) != 0) {
				if (meshrasterizer_39 != null) {
					i_17 = graphicalrenderer_1.method8546(i_17, meshrasterizer_39.m());
				}

				boolean bool_29 = false;
				i_30 = 0;

				while (true) {
					int i_34;
					if (i_30 >= ints_20.length) {
						if (bool_29) {
							if (this.aLong2927 != -1L) {
								SoftCache softcache_40 = aClass229_2920;
								synchronized (aClass229_2920) {
									meshrasterizer_39 = (MeshRasterizer) aClass229_2920.get(this.aLong2927);
								}
							}

							if (meshrasterizer_39 == null || graphicalrenderer_1.method8452(meshrasterizer_39.m(), i_17) != 0) {
								return null;
							}
						} else {
							RSMesh[] arr_56 = new RSMesh[ints_20.length];

							int i_41;
							for (i_31 = 0; i_31 < ints_20.length; i_31++) {
								i_41 = ints_20[i_31];
								MeshModifier meshmodifier_42 = null;
								boolean bool_55 = i_31 == 5 && bool_21 || i_31 == 3 && bool_22;
								RSMesh rsmesh_35;
								if ((i_41 & 0x40000000) != 0) {
									if (!bool_55 && this.aClass422Array2922 != null && this.aClass422Array2922[i_31] != null) {
										meshmodifier_42 = this.aClass422Array2922[i_31];
									}

									rsmesh_35 = itemindexloader_6.getItemDefinitions(i_41 & 0x3fffffff, 489246789).getBodyMesh(this.aBool2929, meshmodifier_42, 710746900);
									if (rsmesh_35 != null) {
										arr_56[i_31] = rsmesh_35;
									}
								} else if ((i_41 & ~0x7fffffff) != 0) {
									rsmesh_35 = class31_4.method800(i_41 & 0x3fffffff, -33767981).method899(-1947876301);
									if (rsmesh_35 != null) {
										arr_56[i_31] = rsmesh_35;
									}
								}
							}

							int i_54;
							if (renderanimdefs_51 != null && renderanimdefs_51.anIntArrayArray2802 != null) {
								for (i_31 = 0; i_31 < renderanimdefs_51.anIntArrayArray2802.length; i_31++) {
									if (arr_56[i_31] != null) {
										i_41 = 0;
										i_54 = 0;
										i_34 = 0;
										int i_43 = 0;
										int i_36 = 0;
										int i_37 = 0;
										if (renderanimdefs_51.anIntArrayArray2802[i_31] != null) {
											i_41 = renderanimdefs_51.anIntArrayArray2802[i_31][0];
											i_54 = renderanimdefs_51.anIntArrayArray2802[i_31][1];
											i_34 = renderanimdefs_51.anIntArrayArray2802[i_31][2];
											i_43 = renderanimdefs_51.anIntArrayArray2802[i_31][3] << 3;
											i_36 = renderanimdefs_51.anIntArrayArray2802[i_31][4] << 3;
											i_37 = renderanimdefs_51.anIntArrayArray2802[i_31][5] << 3;
										}

										if (i_43 != 0 || i_36 != 0 || i_37 != 0) {
											arr_56[i_31].method2671(i_43, i_36, i_37);
										}

										if (i_41 != 0 || i_54 != 0 || i_34 != 0) {
											arr_56[i_31].method2712(i_41, i_54, i_34);
										}
									}
								}
							}

							RSMesh rsmesh_44 = new RSMesh(arr_56, arr_56.length);
							int i_28 = i_17 | 0x4000;
							meshrasterizer_39 = graphicalrenderer_1.createMeshRasterizer(rsmesh_44, i_28, Class149.anInt1744, 64, 850);

							for (i_41 = 0; i_41 < 10; i_41++) {
								for (i_54 = 0; i_54 < AbstractQueue_Sub1.SKIN_COLORS[i_41].length; i_54++) {
									if (this.colors[i_41] < Class366.SKIN_COLORS[i_41][i_54].length) {
										meshrasterizer_39.X(AbstractQueue_Sub1.SKIN_COLORS[i_41][i_54], Class366.SKIN_COLORS[i_41][i_54][this.colors[i_41]]);
									}
								}
							}

							meshrasterizer_39.KA(i_17);
							SoftCache softcache_52 = aClass229_2920;
							synchronized (aClass229_2920) {
								aClass229_2920.put(meshrasterizer_39, long_18);
							}

							this.aLong2927 = long_18;
						}
						break;
					}

					i_31 = ints_20[i_30];
					MeshModifier meshmodifier_32 = null;
					boolean bool_33 = false;
					if (bool_21) {
						if (defaults6loader_15.anInt6990 == i_30) {
							bool_33 = true;
						} else {
							for (i_34 = 0; i_34 < defaults6loader_15.anIntArray6992.length; i_34++) {
								if (defaults6loader_15.anIntArray6992[i_34] == i_30) {
									bool_33 = true;
									break;
								}
							}
						}
					}

					if (bool_22) {
						if (defaults6loader_15.anInt6991 == i_30) {
							bool_33 = true;
						} else {
							for (i_34 = 0; i_34 < defaults6loader_15.anIntArray6993.length; i_34++) {
								if (defaults6loader_15.anIntArray6993[i_34] == i_30) {
									bool_33 = true;
									break;
								}
							}
						}
					}

					if ((i_31 & 0x40000000) != 0) {
						if (!bool_33 && this.aClass422Array2922 != null && this.aClass422Array2922[i_30] != null) {
							meshmodifier_32 = this.aClass422Array2922[i_30];
						}

						if (!itemindexloader_6.getItemDefinitions(i_31 & 0x3fffffff, 865631179).bodyMeshesReady(this.aBool2929, meshmodifier_32, -1830991961)) {
							bool_29 = true;
						}
					} else if ((i_31 & ~0x7fffffff) != 0 && !class31_4.method800(i_31 & 0x3fffffff, 1122652918).method898(-965716691)) {
						bool_29 = true;
					}

					++i_30;
				}
			}

			MeshRasterizer meshrasterizer_45 = meshrasterizer_39.method11289((byte) 4, i_17, true);
			if (!bool_38 && !bool_50) {
				return meshrasterizer_45;
			} else {
				Matrix44Var[] arr_46 = null;
				if (renderanimdefs_51 != null) {
					arr_46 = renderanimdefs_51.method3811((byte) 98);
				}

				if (bool_50 && arr_46 != null) {
					for (i_30 = 0; i_30 < ints_12.length; i_30++) {
						if (arr_46[i_30] != null) {
							meshrasterizer_45.method11298(arr_46[i_30], 1 << i_30, true);
						}
					}
				}

				i_30 = 0;

				for (i_31 = 1; i_30 < i_24; i_31 <<= 1) {
					if (arr_11[i_30] != null) {
						arr_11[i_30].method7578(meshrasterizer_45, 0, i_31, 892744834);
					}

					++i_30;
				}

				if (bool_50) {
					for (i_30 = 0; i_30 < ints_12.length; i_30++) {
						if (ints_12[i_30] != -1) {
							i_31 = ints_12[i_30] - i_13;
							i_31 &= 0x3fff;
							Matrix44Var matrix44var_53 = new Matrix44Var();
							matrix44var_53.method5217(0.0F, 1.0F, 0.0F, Class382.method6508(i_31));
							meshrasterizer_45.method11298(matrix44var_53, 1 << i_30, false);
						}
					}
				}

				if (bool_50 && arr_46 != null) {
					for (i_30 = 0; i_30 < ints_12.length; i_30++) {
						if (arr_46[i_30] != null) {
							meshrasterizer_45.method11298(arr_46[i_30], 1 << i_30, false);
						}
					}
				}

				if (animation_9 != null && animation_10 != null) {
					Class521_Sub1_Sub3_Sub1.method16078(meshrasterizer_45, animation_9, animation_10, -484588693);
				} else if (animation_9 != null) {
					animation_9.method7577(meshrasterizer_45, 0, 16711935);
				} else if (animation_10 != null) {
					animation_10.method7577(meshrasterizer_45, 0, 16711935);
				}

				return meshrasterizer_45;
			}
		}
	}

	public MeshRasterizer method3999(GraphicalRenderer graphicalrenderer_1, int i_2, Class31 class31_3, AnimationIndexLoader animationindexloader_4, Animation animation_5, int i_6, int i_7, int i_8, int i_9) {
		int i_10 = animation_5 != null ? i_2 | animation_5.method7640(-1959438084) : i_2;
		long long_11 = (long) i_8 << 32 | (long) (i_7 << 16) | (long) i_6;
		SoftCache softcache_14 = aClass229_2930;
		MeshRasterizer meshrasterizer_13;
		synchronized (aClass229_2930) {
			meshrasterizer_13 = (MeshRasterizer) aClass229_2930.get(long_11);
		}

		if (meshrasterizer_13 == null || graphicalrenderer_1.method8452(meshrasterizer_13.m(), i_10) != 0) {
			if (meshrasterizer_13 != null) {
				i_10 = graphicalrenderer_1.method8546(i_10, meshrasterizer_13.m());
			}

			RSMesh[] arr_15 = new RSMesh[3];
			int i_16 = 0;
			if (!class31_3.method800(i_6, 2136015066).method900(36053) || !class31_3.method800(i_7, 1449973284).method900(36053) || !class31_3.method800(i_8, 327347634).method900(36053)) {
				return null;
			}

			RSMesh rsmesh_17 = class31_3.method800(i_6, 23864498).method895(246816839);
			if (rsmesh_17 != null) {
				arr_15[i_16++] = rsmesh_17;
			}

			rsmesh_17 = class31_3.method800(i_7, 283433208).method895(1834406332);
			if (rsmesh_17 != null) {
				arr_15[i_16++] = rsmesh_17;
			}

			rsmesh_17 = class31_3.method800(i_8, 644064518).method895(1598273380);
			if (rsmesh_17 != null) {
				arr_15[i_16++] = rsmesh_17;
			}

			rsmesh_17 = new RSMesh(arr_15, i_16);
			int i_20 = i_10 | 0x4000;
			meshrasterizer_13 = graphicalrenderer_1.createMeshRasterizer(rsmesh_17, i_20, Class149.anInt1744, 64, 768);

			for (int i_18 = 0; i_18 < 10; i_18++) {
				for (int i_19 = 0; i_19 < AbstractQueue_Sub1.SKIN_COLORS[i_18].length; i_19++) {
					if (this.colors[i_18] < Class366.SKIN_COLORS[i_18][i_19].length) {
						meshrasterizer_13.X(AbstractQueue_Sub1.SKIN_COLORS[i_18][i_19], Class366.SKIN_COLORS[i_18][i_19][this.colors[i_18]]);
					}
				}
			}

			meshrasterizer_13.KA(i_10);
			SoftCache softcache_21 = aClass229_2930;
			synchronized (aClass229_2930) {
				aClass229_2930.put(meshrasterizer_13, long_11);
			}
		}

		if (animation_5 == null) {
			return meshrasterizer_13;
		} else {
			meshrasterizer_13 = meshrasterizer_13.method11289((byte) 4, i_10, true);
			animation_5.method7577(meshrasterizer_13, 0, 16711935);
			return meshrasterizer_13;
		}
	}

	public void method4003(boolean bool_1, int i_2) {
		this.aBool2929 = bool_1;
		this.method3991((byte) 3);
	}

	public MeshRasterizer method4021(GraphicalRenderer graphicalrenderer_1, int i_2, Class31 class31_3, NPCIndexLoader npcindexloader_4, ItemIndexLoader itemindexloader_5, AnimationIndexLoader animationindexloader_6, Interface42 interface42_7, Animation animation_8, int i_9) {
		if (this.anInt2928 != -1) {
			return npcindexloader_4.getNPCDefinitions(this.anInt2928, (byte) 14).method6880(graphicalrenderer_1, i_2, interface42_7, animation_8, (Class417) null, 1135826867);
		} else {
			int i_10 = animation_8 != null ? i_2 | animation_8.method7640(-1790467862) : i_2;
			SoftCache softcache_12 = aClass229_2930;
			MeshRasterizer meshrasterizer_11;
			synchronized (aClass229_2930) {
				meshrasterizer_11 = (MeshRasterizer) aClass229_2930.get(this.aLong2926);
			}

			if (meshrasterizer_11 == null || graphicalrenderer_1.method8452(meshrasterizer_11.m(), i_10) != 0) {
				if (meshrasterizer_11 != null) {
					i_10 = graphicalrenderer_1.method8546(i_10, meshrasterizer_11.m());
				}

				boolean bool_13 = false;

				int i_15;
				for (int i_14 = 0; i_14 < this.anIntArray2921.length; i_14++) {
					i_15 = this.anIntArray2921[i_14];
					MeshModifier meshmodifier_16 = null;
					if ((i_15 & 0x40000000) != 0) {
						if (this.aClass422Array2922 != null && this.aClass422Array2922[i_14] != null) {
							meshmodifier_16 = this.aClass422Array2922[i_14];
						}

						if (!itemindexloader_5.getItemDefinitions(i_15 & 0x3fffffff, 1258535408).headMeshesReady(this.aBool2929, meshmodifier_16, -2079589755)) {
							bool_13 = true;
						}
					} else if ((i_15 & ~0x7fffffff) != 0 && !class31_3.method800(i_15 & 0x3fffffff, 745327343).method900(36053)) {
						bool_13 = true;
					}
				}

				if (bool_13) {
					return null;
				}

				RSMesh[] arr_21 = new RSMesh[this.anIntArray2921.length];
				i_15 = 0;

				int i_17;
				for (int i_22 = 0; i_22 < this.anIntArray2921.length; i_22++) {
					i_17 = this.anIntArray2921[i_22];
					MeshModifier meshmodifier_18 = null;
					RSMesh rsmesh_19;
					if ((i_17 & 0x40000000) != 0) {
						if (this.aClass422Array2922 != null && this.aClass422Array2922[i_22] != null) {
							meshmodifier_18 = this.aClass422Array2922[i_22];
						}

						rsmesh_19 = itemindexloader_5.getItemDefinitions(i_17 & 0x3fffffff, 393457333).getHeadMesh(this.aBool2929, meshmodifier_18, -1413121212);
						if (rsmesh_19 != null) {
							arr_21[i_15++] = rsmesh_19;
						}
					} else if ((i_17 & ~0x7fffffff) != 0) {
						rsmesh_19 = class31_3.method800(i_17 & 0x3fffffff, 316441737).method895(-2041696);
						if (rsmesh_19 != null) {
							arr_21[i_15++] = rsmesh_19;
						}
					}
				}

				RSMesh rsmesh_28 = new RSMesh(arr_21, i_15);
				int i_20 = i_10 | 0x4000;
				meshrasterizer_11 = graphicalrenderer_1.createMeshRasterizer(rsmesh_28, i_20, Class149.anInt1744, 64, 768);

				for (i_17 = 0; i_17 < 10; i_17++) {
					for (int i_23 = 0; i_23 < AbstractQueue_Sub1.SKIN_COLORS[i_17].length; i_23++) {
						if (this.colors[i_17] < Class366.SKIN_COLORS[i_17][i_23].length) {
							meshrasterizer_11.X(AbstractQueue_Sub1.SKIN_COLORS[i_17][i_23], Class366.SKIN_COLORS[i_17][i_23][this.colors[i_17]]);
						}
					}
				}

				meshrasterizer_11.KA(i_10);
				SoftCache softcache_24 = aClass229_2930;
				synchronized (aClass229_2930) {
					aClass229_2930.put(meshrasterizer_11, this.aLong2926);
				}
			}

			if (animation_8 == null) {
				return meshrasterizer_11;
			} else {
				MeshRasterizer meshrasterizer_27 = meshrasterizer_11.method11289((byte) 4, i_10, true);
				animation_8.method7577(meshrasterizer_27, 0, 16711935);
				return meshrasterizer_27;
			}
		}
	}

	public void method4029(int i_1, int i_2, byte b_3) {
		this.colors[i_1] = i_2;
		this.method3991((byte) 3);
	}

	static final void method4030(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class204.method3365(icomponentdefinitions_3, interface_4, cs2executor_0, -296742554);
	}

	static final void method4031(CS2Executor cs2executor_0, short s_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class163.aClass209_2031.method3565((byte) -75) ? 1 : 0;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class163.aClass209_2031.method3566(-2143623365) ? 1 : 0;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class163.aClass209_2031.method3567((byte) -59) ? 1 : 0;
	}

	static void method4032(String string_0, String string_1, int i_2, int i_3, int i_4, long long_5, int i_7, int i_8, boolean bool_9, boolean bool_10, long long_11, boolean bool_13, int i_14) {
		if (!Class20.aBool161 && Class20.anInt169 < 520) {
			i_2 = i_2 != -1 ? i_2 : client.anInt7427;
			Class282_Sub50_Sub7 class282_sub50_sub7_15 = new Class282_Sub50_Sub7(string_0, string_1, i_2, i_3, i_4, long_5, i_7, i_8, bool_9, bool_10, long_11, bool_13);
			Class361.method6269(class282_sub50_sub7_15, -1498808978);
		}

	}

	static final void method4033(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 64);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class96_Sub17.method14653(icomponentdefinitions_3, interface_4, cs2executor_0, -1617819065);
	}

	static void method4034(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte b_7) {
		int i_8 = Class275.method4890(i_2, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, 843506601);
		int i_9 = Class275.method4890(i_3, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, -196621682);
		int i_10 = Class275.method4890(i_0, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, 1641610688);
		int i_11 = Class275.method4890(i_1, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, 444789004);
		int i_12 = Class275.method4890(i_2 + i_6, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, 995356010);
		int i_13 = Class275.method4890(i_3 - i_6, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, -1579133308);

		int i_14;
		for (i_14 = i_8; i_14 < i_12; i_14++) {
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_14], i_10, i_11, i_5, (byte) 47);
		}

		for (i_14 = i_9; i_14 > i_13; --i_14) {
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_14], i_10, i_11, i_5, (byte) -32);
		}

		i_14 = Class275.method4890(i_0 + i_6, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, -1513727224);
		int i_15 = Class275.method4890(i_1 - i_6, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, -1346060806);

		for (int i_16 = i_12; i_16 <= i_13; i_16++) {
			int[] ints_17 = Class532_Sub1.anIntArrayArray7072[i_16];
			Class232.method3922(ints_17, i_10, i_14, i_5, (byte) 87);
			Class232.method3922(ints_17, i_14, i_15, i_4, (byte) 89);
			Class232.method3922(ints_17, i_15, i_11, i_5, (byte) -32);
		}

	}

	static final void method4035(CS2Executor cs2executor_0, int i_1) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub7_8210, cs2executor_0.intStack[--cs2executor_0.intStackPtr], 1004111582);
		Class190.method3148((byte) 112);
		client.aBool7185 = true;
	}

}
