public abstract class MeshRasterizer {

	protected boolean aBool7023 = false;

	public abstract void bc(int var1, int var2, Ground var3, Ground var4, int var5, int var6, int var7);

	public abstract Surface[] method11253();

	public abstract int o();

	int method11254(float f_1, float f_2, float f_3) {
		float f_4 = f_1 < 0.0F ? -f_1 : f_1;
		float f_5 = f_2 < 0.0F ? -f_2 : f_2;
		float f_6 = f_3 < 0.0F ? -f_3 : f_3;
		return f_5 > f_4 && f_5 > f_6 ? (f_2 > 0.0F ? 0 : 1) : (f_6 > f_4 && f_6 > f_5 ? (f_3 > 0.0F ? 2 : 3) : (f_1 > 0.0F ? 4 : 5));
	}

	void method11255(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, float[] floats_8, int i_9, float f_10, float f_11, float f_12, float[] floats_13) {
		i_1 -= i_4;
		i_2 -= i_5;
		i_3 -= i_6;
		float f_14 = (float) i_1 * floats_8[0] + (float) i_2 * floats_8[1] + (float) i_3 * floats_8[2];
		float f_15 = (float) i_1 * floats_8[3] + (float) i_2 * floats_8[4] + (float) i_3 * floats_8[5];
		float f_16 = (float) i_1 * floats_8[6] + (float) i_2 * floats_8[7] + (float) i_3 * floats_8[8];
		float f_17;
		float f_18;
		if (i_7 == 0) {
			f_17 = f_14 + f_10 + 0.5F;
			f_18 = -f_16 + f_12 + 0.5F;
		} else if (i_7 == 1) {
			f_17 = f_14 + f_10 + 0.5F;
			f_18 = f_16 + f_12 + 0.5F;
		} else if (i_7 == 2) {
			f_17 = -f_14 + f_10 + 0.5F;
			f_18 = -f_15 + f_11 + 0.5F;
		} else if (i_7 == 3) {
			f_17 = f_14 + f_10 + 0.5F;
			f_18 = -f_15 + f_11 + 0.5F;
		} else if (i_7 == 4) {
			f_17 = f_16 + f_12 + 0.5F;
			f_18 = -f_15 + f_11 + 0.5F;
		} else {
			f_17 = -f_16 + f_12 + 0.5F;
			f_18 = -f_15 + f_11 + 0.5F;
		}

		float f_19;
		if (i_9 == 1) {
			f_19 = f_17;
			f_17 = -f_18;
			f_18 = f_19;
		} else if (i_9 == 2) {
			f_17 = -f_17;
			f_18 = -f_18;
		} else if (i_9 == 3) {
			f_19 = f_17;
			f_17 = f_18;
			f_18 = -f_19;
		}

		floats_13[0] = f_17;
		floats_13[1] = f_18;
	}

	Class83 method11256(RSMesh rsmesh_1, int[] ints_2, int i_3) {
		int[] ints_4 = null;
		int[] ints_5 = null;
		int[] ints_6 = null;
		float[][] floats_7 = null;
		if (rsmesh_1.texturePos != null) {
			int i_8 = rsmesh_1.numTextureTriangles;
			int[] ints_9 = new int[i_8];
			int[] ints_10 = new int[i_8];
			int[] ints_11 = new int[i_8];
			int[] ints_12 = new int[i_8];
			int[] ints_13 = new int[i_8];
			int[] ints_14 = new int[i_8];

			int i_15;
			for (i_15 = 0; i_15 < i_8; i_15++) {
				ints_9[i_15] = Integer.MAX_VALUE;
				ints_10[i_15] = -2147483647;
				ints_11[i_15] = Integer.MAX_VALUE;
				ints_12[i_15] = -2147483647;
				ints_13[i_15] = Integer.MAX_VALUE;
				ints_14[i_15] = -2147483647;
			}

			int i_20;
			for (i_15 = 0; i_15 < i_3; i_15++) {
				int i_16 = ints_2[i_15];
				if (rsmesh_1.texturePos[i_16] != -1) {
					int i_17 = rsmesh_1.texturePos[i_16] & 0xff;

					for (int i_18 = 0; i_18 < 3; i_18++) {
						short s_19;
						if (i_18 == 0) {
							s_19 = rsmesh_1.triangleX[i_16];
						} else if (i_18 == 1) {
							s_19 = rsmesh_1.triangleY[i_16];
						} else {
							s_19 = rsmesh_1.triangleZ[i_16];
						}

						i_20 = rsmesh_1.vertexX[s_19];
						int i_21 = rsmesh_1.vertexY[s_19];
						int i_22 = rsmesh_1.vertexZ[s_19];
						if (i_20 < ints_9[i_17]) {
							ints_9[i_17] = i_20;
						}

						if (i_20 > ints_10[i_17]) {
							ints_10[i_17] = i_20;
						}

						if (i_21 < ints_11[i_17]) {
							ints_11[i_17] = i_21;
						}

						if (i_21 > ints_12[i_17]) {
							ints_12[i_17] = i_21;
						}

						if (i_22 < ints_13[i_17]) {
							ints_13[i_17] = i_22;
						}

						if (i_22 > ints_14[i_17]) {
							ints_14[i_17] = i_22;
						}
					}
				}
			}

			ints_4 = new int[i_8];
			ints_5 = new int[i_8];
			ints_6 = new int[i_8];
			floats_7 = new float[i_8][];

			for (i_15 = 0; i_15 < i_8; i_15++) {
				byte b_23 = rsmesh_1.textureRenderTypes[i_15];
				if (b_23 > 0) {
					ints_4[i_15] = (ints_9[i_15] + ints_10[i_15]) / 2;
					ints_5[i_15] = (ints_11[i_15] + ints_12[i_15]) / 2;
					ints_6[i_15] = (ints_13[i_15] + ints_14[i_15]) / 2;
					float f_24;
					float f_25;
					float f_26;
					if (b_23 == 1) {
						i_20 = rsmesh_1.particleDirectionX[i_15];
						if (i_20 == 0) {
							f_24 = 1.0F;
							f_26 = 1.0F;
						} else if (i_20 > 0) {
							f_24 = 1.0F;
							f_26 = (float) i_20 / 1024.0F;
						} else {
							f_26 = 1.0F;
							f_24 = (float) (-i_20) / 1024.0F;
						}

						f_25 = 64.0F / (float) rsmesh_1.particleDirectionY[i_15];
					} else if (b_23 == 2) {
						f_24 = 64.0F / (float) rsmesh_1.particleDirectionX[i_15];
						f_25 = 64.0F / (float) rsmesh_1.particleDirectionY[i_15];
						f_26 = 64.0F / (float) rsmesh_1.particleDirectionZ[i_15];
					} else {
						f_24 = (float) rsmesh_1.particleDirectionX[i_15] / 1024.0F;
						f_25 = (float) rsmesh_1.particleDirectionY[i_15] / 1024.0F;
						f_26 = (float) rsmesh_1.particleDirectionZ[i_15] / 1024.0F;
					}

					floats_7[i_15] = this.method11257(rsmesh_1.texTriX[i_15], rsmesh_1.texTriY[i_15], rsmesh_1.texTriZ[i_15], rsmesh_1.particleLifespanX[i_15] & 0xff, f_24, f_25, f_26);
				}
			}
		}

		return new Class83(this, ints_4, ints_5, ints_6, floats_7);
	}

	float[] method11257(int i_1, int i_2, int i_3, int i_4, float f_5, float f_6, float f_7) {
		float[] floats_8 = new float[9];
		float[] floats_9 = new float[9];
		float f_10 = (float) Math.cos((double) ((float) i_4 * 0.024543693F));
		float f_11 = (float) Math.sin((double) ((float) i_4 * 0.024543693F));
		float f_12 = 1.0F - f_10;
		floats_8[0] = f_10;
		floats_8[1] = 0.0F;
		floats_8[2] = f_11;
		floats_8[3] = 0.0F;
		floats_8[4] = 1.0F;
		floats_8[5] = 0.0F;
		floats_8[6] = -f_11;
		floats_8[7] = 0.0F;
		floats_8[8] = f_10;
		float[] floats_13 = new float[9];
		float f_14 = 1.0F;
		float f_15 = 0.0F;
		f_10 = (float) i_2 / 32767.0F;
		f_11 = -((float) Math.sqrt((double) (1.0F - f_10 * f_10)));
		f_12 = 1.0F - f_10;
		float f_16 = (float) Math.sqrt((double) (i_3 * i_3 + i_1 * i_1));
		if (f_16 == 0.0F && f_10 == 0.0F) {
			floats_9 = floats_8;
		} else {
			if (f_16 != 0.0F) {
				f_14 = (float) (-i_3) / f_16;
				f_15 = (float) i_1 / f_16;
			}

			floats_13[0] = f_10 + f_14 * f_14 * f_12;
			floats_13[1] = f_15 * f_11;
			floats_13[2] = f_15 * f_14 * f_12;
			floats_13[3] = -f_15 * f_11;
			floats_13[4] = f_10;
			floats_13[5] = f_14 * f_11;
			floats_13[6] = f_14 * f_15 * f_12;
			floats_13[7] = -f_14 * f_11;
			floats_13[8] = f_10 + f_15 * f_15 * f_12;
			floats_9[0] = floats_8[0] * floats_13[0] + floats_8[1] * floats_13[3] + floats_8[2] * floats_13[6];
			floats_9[1] = floats_8[0] * floats_13[1] + floats_8[1] * floats_13[4] + floats_8[2] * floats_13[7];
			floats_9[2] = floats_8[0] * floats_13[2] + floats_8[1] * floats_13[5] + floats_8[2] * floats_13[8];
			floats_9[3] = floats_8[3] * floats_13[0] + floats_8[4] * floats_13[3] + floats_8[5] * floats_13[6];
			floats_9[4] = floats_8[3] * floats_13[1] + floats_8[4] * floats_13[4] + floats_8[5] * floats_13[7];
			floats_9[5] = floats_8[3] * floats_13[2] + floats_8[4] * floats_13[5] + floats_8[5] * floats_13[8];
			floats_9[6] = floats_8[6] * floats_13[0] + floats_8[7] * floats_13[3] + floats_8[8] * floats_13[6];
			floats_9[7] = floats_8[6] * floats_13[1] + floats_8[7] * floats_13[4] + floats_8[8] * floats_13[7];
			floats_9[8] = floats_8[6] * floats_13[2] + floats_8[7] * floats_13[5] + floats_8[8] * floats_13[8];
		}

		floats_9[0] *= f_5;
		floats_9[1] *= f_5;
		floats_9[2] *= f_5;
		floats_9[3] *= f_6;
		floats_9[4] *= f_6;
		floats_9[5] *= f_6;
		floats_9[6] *= f_7;
		floats_9[7] *= f_7;
		floats_9[8] *= f_7;
		return floats_9;
	}

	public abstract void ia(int var1, int var2, int var3);

	public final void method11258(AnimationFrameSet animationskeleton_1, int i_2, AnimationFrameSet animationskeleton_3, int i_4, int i_5, int i_6, int i_8, boolean bool_9, int[] ints_10) {
		if (i_2 != -1) {
			this.method11260();
			if (!this.ea()) {
				this.method11261();
			} else {
				AnimationFrame animationskin_11 = animationskeleton_1.frames[i_2];
				AnimationFrameBase animationskinnode_12 = animationskin_11.frameBaseList;
				AnimationFrame animationskin_13 = null;
				if (animationskeleton_3 != null) {
					animationskin_13 = animationskeleton_3.frames[i_4];
					if (animationskinnode_12 != animationskin_13.frameBaseList) {
						animationskin_13 = null;
					}
				}

				this.method11266(animationskinnode_12, animationskin_11, animationskin_13, i_5, i_6, 0, (boolean[]) null, false, bool_9, i_8, ints_10);
				this.ka();
				this.method11261();
			}
		}

	}

	public abstract int m();

	public abstract void method11259();

	public abstract void f(int var1);

	public abstract void ep(int var1, int var2, int var3);

	public abstract void t(int var1);

	abstract void e(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

	public abstract int dq();

	public abstract void wa();

	public abstract void oa(int var1, int var2, int var3);

	public abstract void df(short var1, short var2);

	abstract boolean bh();

	abstract void method11260();

	abstract void method11261();

	public final void method11262(AnimationFrameSet animationskeleton_1, int i_2, AnimationFrameSet animationskeleton_3, int i_4, int i_5, int i_6, int i_7, boolean bool_8) {
		if (i_2 != -1) {
			this.method11260();
			if (!this.ea()) {
				this.method11261();
			} else {
				AnimationFrame animationskin_9 = animationskeleton_1.frames[i_2];
				AnimationFrameBase animationskinnode_10 = animationskin_9.frameBaseList;
				AnimationFrame animationskin_11 = null;
				if (animationskeleton_3 != null) {
					animationskin_11 = animationskeleton_3.frames[i_4];
					if (animationskinnode_10 != animationskin_11.frameBaseList) {
						animationskin_11 = null;
					}
				}

				this.method11266(animationskinnode_10, animationskin_9, animationskin_11, i_5, i_6, i_7, (boolean[]) null, false, bool_8, 65535, (int[]) null);
				this.ka();
				this.method11261();
			}
		}

	}

	public abstract void method11263(Matrix44Var var1, int var2, boolean var3);

	public final void method11264(AnimationFrameSet animationskeleton_1, int i_2, AnimationFrameSet animationskeleton_3, int i_4, int i_5, int i_6, AnimationFrameSet animationskeleton_7, int i_8, AnimationFrameSet animationskeleton_9, int i_10, int i_11, int i_12, boolean[] bools_13, boolean bool_14) {
		if (i_2 != -1) {
			if (bools_13 != null && i_8 != -1) {
				this.method11260();
				if (!this.ea()) {
					this.method11261();
				} else {
					AnimationFrame animationskin_15 = animationskeleton_1.frames[i_2];
					AnimationFrameBase animationskinnode_16 = animationskin_15.frameBaseList;
					AnimationFrame animationskin_17 = null;
					if (animationskeleton_3 != null) {
						animationskin_17 = animationskeleton_3.frames[i_4];
						if (animationskinnode_16 != animationskin_17.frameBaseList) {
							animationskin_17 = null;
						}
					}

					this.method11266(animationskinnode_16, animationskin_15, animationskin_17, i_5, i_6, 0, bools_13, false, bool_14, 65535, (int[]) null);
					AnimationFrame animationskin_18 = animationskeleton_7.frames[i_8];
					AnimationFrame animationskin_19 = null;
					if (animationskeleton_9 != null) {
						animationskin_19 = animationskeleton_9.frames[i_10];
						if (animationskinnode_16 != animationskin_19.frameBaseList) {
							animationskin_19 = null;
						}
					}

					this.method11268(0, new int[0], 0, 0, 0, 0, bool_14);
					this.method11266(animationskin_18.frameBaseList, animationskin_18, animationskin_19, i_11, i_12, 0, bools_13, true, bool_14, 65535, (int[]) null);
					this.ka();
					this.method11261();
				}
			} else {
				this.method11262(animationskeleton_1, i_2, animationskeleton_3, i_4, i_5, i_6, 0, bool_14);
			}
		}

	}

	void method11266(AnimationFrameBase animFrameBase, AnimationFrame animFrame1, AnimationFrame animFrame2, int i_4, int i_5, int i_6, boolean[] bools_7, boolean bool_8, boolean bool_9, int modelIndex, int[] ints_11) {
		int i_12;
		if (animFrame2 != null && i_4 != 0) {
			i_12 = 0;
			int i_35 = 0;

			for (int i_36 = 0; i_36 < animFrameBase.count; i_36++) {
				boolean bool_15 = false;
				if (i_12 < animFrame1.transformationCount && i_36 == animFrame1.transformationIndices[i_12]) {
					bool_15 = true;
				}

				boolean bool_16 = false;
				if (i_35 < animFrame2.transformationCount && i_36 == animFrame2.transformationIndices[i_35]) {
					bool_16 = true;
				}

				if (bool_15 || bool_16) {
					if (bools_7 != null && bools_7[i_36] != bool_8 && animFrameBase.transformationTypes[i_36] != 0) {
						if (bool_15) {
							++i_12;
						}

						if (bool_16) {
							++i_35;
						}
					} else {
						short s_17 = 0;
						int i_18 = animFrameBase.transformationTypes[i_36];
						if (i_18 == 3 || i_18 == 10) {
							s_17 = 128;
						}

						short s_19;
						short s_20;
						short s_21;
						short primaryVertexSkin;
						byte b_23;
						if (bool_15) {
							s_19 = animFrame1.transformationX[i_12];
							s_20 = animFrame1.transformationY[i_12];
							s_21 = animFrame1.transformationZ[i_12];
							primaryVertexSkin = animFrame1.skippedReferences[i_12];
							b_23 = animFrame1.transformationFlags[i_12];
							++i_12;
						} else {
							s_19 = s_17;
							s_20 = s_17;
							s_21 = s_17;
							primaryVertexSkin = -1;
							b_23 = 0;
						}

						short s_24;
						short s_25;
						short s_26;
						short s_27;
						byte b_28;
						if (bool_16) {
							s_24 = animFrame2.transformationX[i_35];
							s_25 = animFrame2.transformationY[i_35];
							s_26 = animFrame2.transformationZ[i_35];
							s_27 = animFrame2.skippedReferences[i_35];
							b_28 = animFrame2.transformationFlags[i_35];
							++i_35;
						} else {
							s_24 = s_17;
							s_25 = s_17;
							s_26 = s_17;
							s_27 = -1;
							b_28 = 0;
						}

						int i_29;
						int i_30;
						int i_31;
						if ((b_23 & 0x2) == 0 && (b_28 & 0x1) == 0) {
							int i_32;
							if (i_18 == 2) {
								i_32 = s_24 - s_19 & 0x3fff;
								int i_33 = s_25 - s_20 & 0x3fff;
								int i_34 = s_26 - s_21 & 0x3fff;
								if (i_32 >= 8192) {
									i_32 -= 16384;
								}

								if (i_33 >= 8192) {
									i_33 -= 16384;
								}

								if (i_34 >= 8192) {
									i_34 -= 16384;
								}

								i_29 = s_19 + i_32 * i_4 / i_5 & 0x3fff;
								i_30 = s_20 + i_33 * i_4 / i_5 & 0x3fff;
								i_31 = s_21 + i_34 * i_4 / i_5 & 0x3fff;
							} else if (i_18 == 9) {
								i_32 = s_24 - s_19 & 0x3fff;
								if (i_32 >= 8192) {
									i_32 -= 16384;
								}

								i_29 = s_19 + i_32 * i_4 / i_5 & 0x3fff;
								i_31 = 0;
								i_30 = 0;
							} else if (i_18 == 7) {
								i_32 = s_24 - s_19 & 0x3f;
								if (i_32 >= 32) {
									i_32 -= 64;
								}

								i_29 = s_19 + i_32 * i_4 / i_5 & 0x3f;
								i_30 = s_20 + (s_25 - s_20) * i_4 / i_5;
								i_31 = s_21 + (s_26 - s_21) * i_4 / i_5;
							} else {
								i_29 = s_19 + (s_24 - s_19) * i_4 / i_5;
								i_30 = s_20 + (s_25 - s_20) * i_4 / i_5;
								i_31 = s_21 + (s_26 - s_21) * i_4 / i_5;
							}
						} else {
							i_29 = s_19;
							i_30 = s_20;
							i_31 = s_21;
						}

						if (primaryVertexSkin != -1) {
							this.method11267(0, animFrameBase.labels[primaryVertexSkin], 0, 0, 0, i_6, bool_9, modelIndex & animFrameBase.anIntArray7561[primaryVertexSkin], ints_11);
						} else if (s_27 != -1) {
							this.method11267(0, animFrameBase.labels[s_27], 0, 0, 0, i_6, bool_9, modelIndex & animFrameBase.anIntArray7561[s_27], ints_11);
						}

						this.method11267(i_18, animFrameBase.labels[i_36], i_29, i_30, i_31, i_6, bool_9, modelIndex & animFrameBase.anIntArray7561[i_36], ints_11);
					}
				}
			}
		} else {
			for (i_12 = 0; i_12 < animFrame1.transformationCount; i_12++) {
				short s_13 = animFrame1.transformationIndices[i_12];
				if (bools_7 == null || bools_7[s_13] == bool_8 || animFrameBase.transformationTypes[s_13] == 0) {
					short s_14 = animFrame1.skippedReferences[i_12];
					if (s_14 != -1) {
						this.method11267(0, animFrameBase.labels[s_14], 0, 0, 0, i_6, bool_9, modelIndex & animFrameBase.anIntArray7561[s_14], ints_11);
					}

					this.method11267(animFrameBase.transformationTypes[s_13], animFrameBase.labels[s_13], animFrame1.transformationX[i_12], animFrame1.transformationY[i_12], animFrame1.transformationZ[i_12], i_6, bool_9, modelIndex & animFrameBase.anIntArray7561[s_13], ints_11);
				}
			}
		}

	}

	void method11267(int i_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7, int i_8, int[] ints_9) {
		int i_10;
		if (i_6 == 1) {
			if (i_1 != 0 && i_1 != 1) {
				if (i_1 == 3) {
					i_10 = i_3;
					i_3 = i_5;
					i_5 = i_10;
				} else if (i_1 == 2) {
					i_10 = i_3;
					i_3 = -i_5 & 0x3fff;
					i_5 = i_10 & 0x3fff;
				}
			} else {
				i_10 = -i_3;
				i_3 = i_5;
				i_5 = i_10;
			}
		} else if (i_6 == 2) {
			if (i_1 != 0 && i_1 != 1) {
				if (i_1 == 2) {
					i_3 = -i_3 & 0x3fff;
					i_5 = -i_5 & 0x3fff;
				}
			} else {
				i_3 = -i_3;
				i_5 = -i_5;
			}
		} else if (i_6 == 3) {
			if (i_1 != 0 && i_1 != 1) {
				if (i_1 == 3) {
					i_10 = i_3;
					i_3 = i_5;
					i_5 = i_10;
				} else if (i_1 == 2) {
					i_10 = i_3;
					i_3 = i_5 & 0x3fff;
					i_5 = -i_10 & 0x3fff;
				}
			} else {
				i_10 = i_3;
				i_3 = -i_5;
				i_5 = i_10;
			}
		}

		if (i_8 != 65535) {
			this.e(i_1, ints_2, i_3, i_4, i_5, bool_7, i_8, ints_9);
		} else {
			this.method11268(i_1, ints_2, i_3, i_4, i_5, i_6, bool_7);
		}

	}

	public abstract void bk(int var1);

	abstract void method11268(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

	public abstract void Q(int var1);

	public abstract void method11269(MeshRasterizer var1, int var2, int var3, int var4, boolean var5);

	abstract void ka();

	abstract void bo(int var1, int var2, int var3, int var4);

	public abstract int ct();

	public abstract boolean method11270(int var1, int var2, Matrix44Var var3, boolean var4, int var5);

	public abstract Shadow ga(Shadow var1);

	public abstract int N();

	public abstract int n();

	public abstract int RA();

	abstract void bl(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

	public abstract int YA();

	public abstract int dp();

	public abstract int AA();

	public abstract int ha();

	public abstract void KA(int var1);

	public abstract void bz(int var1);

	public abstract int Z();

	public abstract byte[] aw();

	public abstract boolean dh();

	void method11271(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, float[] floats_7, int i_8, float f_9, float[] floats_10) {
		i_1 -= i_4;
		i_2 -= i_5;
		i_3 -= i_6;
		float f_11 = (float) i_1 * floats_7[0] + (float) i_2 * floats_7[1] + (float) i_3 * floats_7[2];
		float f_12 = (float) i_1 * floats_7[3] + (float) i_2 * floats_7[4] + (float) i_3 * floats_7[5];
		float f_13 = (float) i_1 * floats_7[6] + (float) i_2 * floats_7[7] + (float) i_3 * floats_7[8];
		float f_14 = (float) Math.sqrt((double) (f_11 * f_11 + f_12 * f_12 + f_13 * f_13));
		float f_15 = (float) Math.atan2((double) f_11, (double) f_13) / 6.2831855F + 0.5F;
		float f_16 = (float) Math.asin((double) (f_12 / f_14)) / 3.1415927F + 0.5F + f_9;
		float f_17;
		if (i_8 == 1) {
			f_17 = f_15;
			f_15 = -f_16;
			f_16 = f_17;
		} else if (i_8 == 2) {
			f_15 = -f_15;
			f_16 = -f_16;
		} else if (i_8 == 3) {
			f_17 = f_15;
			f_15 = f_16;
			f_16 = -f_17;
		}

		floats_10[0] = f_15;
		floats_10[1] = f_16;
	}

	public abstract void W(short var1, short var2);

	public abstract void PA(int var1, int var2, int var3, int var4);

	public abstract boolean successful();

	public abstract boolean i();

	public abstract boolean u();

	public abstract void method11273(Matrix44Var var1);

	public abstract int cw();

	public abstract SurfaceSkin[] method11274();

	abstract void method11275(int var1, int[] var2, int var3, int var4, int var5, int var6, boolean var7);

	public abstract void bj(int var1);

	public abstract MeshRasterizer method11276(byte var1, int var2, boolean var3);

	public abstract MeshRasterizer method11277(byte var1, int var2, boolean var3);

	public abstract MeshRasterizer method11278(byte var1, int var2, boolean var3);

	public abstract MeshRasterizer method11279(byte var1, int var2, boolean var3);

	void method11281(Ground class390_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		boolean bool_9 = false;
		boolean bool_10 = false;
		boolean bool_11 = false;
		int i_12 = -i_5 / 2;
		int i_13 = -i_6 / 2;
		int i_14 = class390_1.averageHeight(i_12 + i_2, i_13 + i_4, 2029342916);
		int i_15 = i_5 / 2;
		int i_16 = -i_6 / 2;
		int i_17 = class390_1.averageHeight(i_15 + i_2, i_16 + i_4, 211604312);
		int i_18 = -i_5 / 2;
		int i_19 = i_6 / 2;
		int i_20 = class390_1.averageHeight(i_18 + i_2, i_19 + i_4, -1995785916);
		int i_21 = i_5 / 2;
		int i_22 = i_6 / 2;
		int i_23 = class390_1.averageHeight(i_21 + i_2, i_22 + i_4, 1123501570);
		int i_24 = i_14 < i_17 ? i_14 : i_17;
		int i_25 = i_20 < i_23 ? i_20 : i_23;
		int i_26 = i_17 < i_23 ? i_17 : i_23;
		int i_27 = i_14 < i_20 ? i_14 : i_20;
		int i_28;
		int i_29;
		if (i_6 != 0) {
			i_28 = (int) (Math.atan2((double) (i_24 - i_25), (double) i_6) * 2607.5945876176133D) & 0x3fff;
			if (i_28 != 0) {
				if (i_7 != 0) {
					if (i_28 > 8192) {
						i_29 = 16384 - i_7;
						if (i_28 < i_29) {
							i_28 = i_29;
						}
					} else if (i_28 > i_7) {
						i_28 = i_7;
					}
				}

				this.t(i_28);
			}
		}

		if (i_5 != 0) {
			i_28 = (int) (Math.atan2((double) (i_27 - i_26), (double) i_5) * 2607.5945876176133D) & 0x3fff;
			if (i_28 != 0) {
				if (i_8 != 0) {
					if (i_28 > 8192) {
						i_29 = 16384 - i_8;
						if (i_28 < i_29) {
							i_28 = i_29;
						}
					} else if (i_28 > i_8) {
						i_28 = i_8;
					}
				}

				this.EA(i_28);
			}
		}

		i_28 = i_14 + i_23;
		if (i_17 + i_20 < i_28) {
			i_28 = i_17 + i_20;
		}

		i_28 = (i_28 >> 1) - i_3;
		if (i_28 != 0) {
			this.ia(0, i_28, 0);
		}

	}

	public abstract int ae();

	public abstract void aq(int var1);

	public abstract int cu();

	public abstract void method11282(Matrix44Var var1, EntityNode_Sub5 var2, int var3);

	public abstract void X(short var1, short var2);

	public abstract void bx(int var1);

	public abstract SurfaceSkin[] method11283();

	public abstract int ya();

	public abstract void bm(int var1);

	public abstract int ca();

	public abstract int c();

	public abstract void bf(int var1);

	public abstract void bn(int var1);

	public abstract void be();

	public final void method11284(AnimationFrameSet animationskeleton_1, int i_2) {
		if (i_2 != -1) {
			this.method11260();
			if (!this.ea()) {
				this.method11261();
			} else {
				AnimationFrame animationskin_3 = animationskeleton_1.frames[i_2];
				AnimationFrameBase animationskinnode_4 = animationskin_3.frameBaseList;

				for (int i_5 = 0; i_5 < animationskin_3.transformationCount; i_5++) {
					short s_6 = animationskin_3.transformationIndices[i_5];
					if (animationskinnode_4.aBoolArray7563[s_6]) {
						if (animationskin_3.skippedReferences[i_5] != -1) {
							this.w(0, 0, 0, 0);
						}

						this.w(animationskinnode_4.transformationTypes[s_6], animationskin_3.transformationX[i_5], animationskin_3.transformationY[i_5], animationskin_3.transformationZ[i_5]);
					}
				}

				this.ka();
				this.method11261();
			}
		}

	}

	public abstract void bq();

	abstract void w(int var1, int var2, int var3, int var4);

	public abstract void cr(int var1);

	abstract void method11285();

	public abstract boolean method11286(int var1, int var2, Matrix44Var var3, boolean var4, int var5);

	abstract boolean bv();

	abstract boolean ea();

	abstract void method11288();

	abstract void bb(int var1, int var2, int var3, int var4);

	public abstract MeshRasterizer method11289(byte var1, int var2, boolean var3);

	public abstract int cc();

	public abstract void method11290(Matrix44Var var1, int var2, boolean var3);

	public abstract void method11291(Matrix44Var var1, int var2, boolean var3);

	public abstract void method11292(Matrix44Var var1, int var2, boolean var3);

	public abstract void method11293(Matrix44Var var1, EntityNode_Sub5 var2, int var3);

	public abstract int ar();

	public abstract void method11294(Matrix44Var var1);

	public abstract int cv();

	public abstract int cp();

	public abstract int dg();

	public abstract int ci();

	public abstract void bw(int var1);

	public abstract void method11295();

	public abstract int cb();

	public abstract MeshRasterizer method11296(byte var1, int var2, boolean var3);

	public abstract int cm();

	public abstract void bs(int var1);

	public abstract int ck();

	public abstract int co();

	public abstract void ce(int var1);

	public abstract void method11298(Matrix44Var var1, int var2, boolean var3);

	public abstract int ch();

	public abstract byte[] cz();

	public abstract void cq(short var1, short var2);

	public abstract void method11299(MeshRasterizer var1, int var2, int var3, int var4, boolean var5);

	public abstract void cy(int var1, int var2, int var3, int var4);

	public abstract Surface[] method11300();

	public abstract void p(int var1);

	abstract void method11301();

	public abstract SurfaceSkin[] method11302();

	public abstract boolean method11303();

	public abstract void dl(int var1);

	public abstract int dy();

	public abstract int dm();

	void method11306(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, float[] floats_7, float f_8, int i_9, float f_10, float[] floats_11) {
		i_1 -= i_4;
		i_2 -= i_5;
		i_3 -= i_6;
		float f_12 = (float) i_1 * floats_7[0] + (float) i_2 * floats_7[1] + (float) i_3 * floats_7[2];
		float f_13 = (float) i_1 * floats_7[3] + (float) i_2 * floats_7[4] + (float) i_3 * floats_7[5];
		float f_14 = (float) i_1 * floats_7[6] + (float) i_2 * floats_7[7] + (float) i_3 * floats_7[8];
		float f_15 = (float) Math.atan2((double) f_12, (double) f_14) / 6.2831855F + 0.5F;
		if (f_8 != 1.0F) {
			f_15 *= f_8;
		}

		float f_16 = f_13 + 0.5F + f_10;
		float f_17;
		if (i_9 == 1) {
			f_17 = f_15;
			f_15 = -f_16;
			f_16 = f_17;
		} else if (i_9 == 2) {
			f_15 = -f_15;
			f_16 = -f_16;
		} else if (i_9 == 3) {
			f_17 = f_15;
			f_15 = f_16;
			f_16 = -f_17;
		}

		floats_11[0] = f_15;
		floats_11[1] = f_16;
	}

	public abstract int du();

	public abstract void dk(int var1, int var2, int var3);

	public abstract int dd();

	public abstract void di(short var1, short var2);

	public abstract void method11307(byte var1, byte[] var2);

	public abstract boolean dv();

	abstract void method11308();

	public abstract void S(int var1);

	public abstract boolean method11309(int var1, int var2, Matrix44Var var3, boolean var4, int var5);

	public abstract void EA(int var1);

	public abstract Shadow dn(Shadow var1);

	public abstract Shadow da(Shadow var1);

	public abstract Shadow dw(Shadow var1);

	public abstract Shadow dr(Shadow var1);

	abstract void bp();

	public abstract void method11312(byte var1, byte[] var2);

	public abstract int cd();

	public abstract void method11315(Matrix44Var var1);

	public abstract void by();

	public abstract void pa(int var1, int var2, Ground var3, Ground var4, int var5, int var6, int var7);

	public abstract void bi(int var1);

	public abstract SurfaceSkin[] method11331();

}
