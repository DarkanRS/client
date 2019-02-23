import jaggl.OpenGL;

public class Class141_Sub9 extends Class141 {

	static float[] aFloatArray9111 = new float[4];
	Class138 aClass138_9109;
	float aFloat9112;
	int anInt9110;
	Class136 aClass136_9108;
	Class133 aClass133_9115;
	float[] aFloatArray9106;

	void method14463() {
		this.aClass138_9109 = new Class138(this.aClass505_Sub1_1664, 2);
		this.aClass138_9109.method2380(0);
		this.aClass505_Sub1_1664.method13610(1);
		this.aClass505_Sub1_1664.method13617(-16777216);
		this.aClass505_Sub1_1664.method13717(260, 7681);
		this.aClass505_Sub1_1664.method13616(0, 34166, 770);
		this.aClass505_Sub1_1664.method13610(0);
		OpenGL.glBindProgramARB(34336, this.aClass133_9115.anInt1596);
		OpenGL.glEnable(34336);
		this.aClass138_9109.method2381();
		this.aClass138_9109.method2380(1);
		this.aClass505_Sub1_1664.method13610(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass505_Sub1_1664.method13612(0);
		this.aClass505_Sub1_1664.method13616(0, 5890, 770);
		this.aClass505_Sub1_1664.method13610(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		this.aClass138_9109.method2381();
	}

	boolean method2395() {
		return true;
	}

	void method2397(boolean bool_1) {
		if (this.aClass138_9109 != null) {
			this.aClass138_9109.method2379('\u0000');
			this.aClass505_Sub1_1664.method13610(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(this.aClass505_Sub1_1664.aClass384_8391.buf, 0);
			OpenGL.glMatrixMode(5888);
			this.aClass505_Sub1_1664.method13610(0);
			if (this.aClass505_Sub1_1664.anInt8368 != this.anInt9110) {
				int i_2 = this.aClass505_Sub1_1664.anInt8368 % 5000 * 128 / 5000;

				for (int i_3 = 0; i_3 < 64; i_3++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_3, this.aFloatArray9106, i_2);
					i_2 += 2;
				}

				if (this.aClass136_9108.aBool1631) {
					this.aFloat9112 = (float) (this.aClass505_Sub1_1664.anInt8368 % 4000) / 4000.0F;
				} else {
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}

				this.anInt9110 = this.aClass505_Sub1_1664.anInt8368;
			}
		}

	}

	boolean method2401() {
		return true;
	}

	void method2408(boolean bool_1) {
	}

	void method2398() {
		if (this.aClass138_9109 != null) {
			this.aClass138_9109.method2379('\u0001');
			this.aClass505_Sub1_1664.method13610(1);
			this.aClass505_Sub1_1664.method13654((Class137) null);
			this.aClass505_Sub1_1664.method13610(0);
		}

	}

	void method2399(int i_1, int i_2) {
		if (this.aClass138_9109 != null) {
			this.aClass505_Sub1_1664.method13610(1);
			int i_3;
			if ((i_1 & 0x80) == 0) {
				if ((i_2 & 0x1) == 1) {
					if (!this.aClass136_9108.aBool1631) {
						i_3 = this.aClass505_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub1Array1632[i_3]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (this.aClass136_9108.aBool1631) {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub4_1633);
					} else {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub1Array1632[0]);
					}

					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else {
				this.aClass505_Sub1_1664.method13654((Class137) null);
			}

			this.aClass505_Sub1_1664.method13610(0);
			if ((i_1 & 0x40) == 0) {
				aFloatArray9111[0] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8429;
				aFloatArray9111[1] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8430;
				aFloatArray9111[2] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8431;
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			}

			i_3 = i_1 & 0x3;
			if (i_3 == 2) {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			} else if (i_3 == 3) {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
			}
		}

	}

	void method2400(Class137 class137_1, int i_2) {
		this.aClass505_Sub1_1664.method13654(class137_1);
		this.aClass505_Sub1_1664.method13612(i_2);
	}

	Class141_Sub9(Class505_Sub1 class505_sub1_1, Class136 class136_2) {
		super(class505_sub1_1);
		this.aClass136_9108 = class136_2;
		if (this.aClass505_Sub1_1664.aBool8484 && this.aClass505_Sub1_1664.anInt8469 >= 2) {
			this.aClass133_9115 = Class133.method2321(this.aClass505_Sub1_1664, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass133_9115 != null) {
				int[][] ints_3 = Class304.method5410(64, 256, 0, 4, 4, 3, 0.4F, false, 699119598);
				int[][] ints_4 = Class304.method5410(64, 256, 8, 4, 4, 3, 0.4F, false, 2060883829);
				int i_5 = 0;
				this.aFloatArray9106 = new float[32768];

				for (int i_6 = 0; i_6 < 256; i_6++) {
					int[] ints_7 = ints_3[i_6];
					int[] ints_8 = ints_4[i_6];

					for (int i_9 = 0; i_9 < 64; i_9++) {
						this.aFloatArray9106[i_5++] = (float) ints_7[i_9] / 4096.0F;
						this.aFloatArray9106[i_5++] = (float) ints_8[i_9] / 4096.0F;
					}
				}

				this.method14463();
			}
		}

	}

	void method2407(boolean bool_1) {
	}

	void method2402(boolean bool_1) {
		if (this.aClass138_9109 != null) {
			this.aClass138_9109.method2379('\u0000');
			this.aClass505_Sub1_1664.method13610(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(this.aClass505_Sub1_1664.aClass384_8391.buf, 0);
			OpenGL.glMatrixMode(5888);
			this.aClass505_Sub1_1664.method13610(0);
			if (this.anInt9110 != this.aClass505_Sub1_1664.anInt8368) {
				int i_2 = this.aClass505_Sub1_1664.anInt8368 % 5000 * 128 / 5000;

				for (int i_3 = 0; i_3 < 64; i_3++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_3, this.aFloatArray9106, i_2);
					i_2 += 2;
				}

				if (this.aClass136_9108.aBool1631) {
					this.aFloat9112 = (float) (this.aClass505_Sub1_1664.anInt8368 % 4000) / 4000.0F;
				} else {
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}

				this.anInt9110 = this.aClass505_Sub1_1664.anInt8368;
			}
		}

	}

	void method2410(int i_1, int i_2) {
		if (this.aClass138_9109 != null) {
			this.aClass505_Sub1_1664.method13610(1);
			int i_3;
			if ((i_1 & 0x80) == 0) {
				if ((i_2 & 0x1) == 1) {
					if (!this.aClass136_9108.aBool1631) {
						i_3 = this.aClass505_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub1Array1632[i_3]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (this.aClass136_9108.aBool1631) {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub4_1633);
					} else {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub1Array1632[0]);
					}

					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else {
				this.aClass505_Sub1_1664.method13654((Class137) null);
			}

			this.aClass505_Sub1_1664.method13610(0);
			if ((i_1 & 0x40) == 0) {
				aFloatArray9111[0] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8429;
				aFloatArray9111[1] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8430;
				aFloatArray9111[2] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8431;
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			}

			i_3 = i_1 & 0x3;
			if (i_3 == 2) {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			} else if (i_3 == 3) {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
			}
		}

	}

	void method2404(boolean bool_1) {
	}

	void method2394(Class137 class137_1, int i_2) {
		this.aClass505_Sub1_1664.method13654(class137_1);
		this.aClass505_Sub1_1664.method13612(i_2);
	}

	void method2406(boolean bool_1) {
	}

	void method2405(boolean bool_1) {
	}

	void method2411() {
		if (this.aClass138_9109 != null) {
			this.aClass138_9109.method2379('\u0001');
			this.aClass505_Sub1_1664.method13610(1);
			this.aClass505_Sub1_1664.method13654((Class137) null);
			this.aClass505_Sub1_1664.method13610(0);
		}

	}

	void method2409(int i_1, int i_2) {
		if (this.aClass138_9109 != null) {
			this.aClass505_Sub1_1664.method13610(1);
			int i_3;
			if ((i_1 & 0x80) == 0) {
				if ((i_2 & 0x1) == 1) {
					if (!this.aClass136_9108.aBool1631) {
						i_3 = this.aClass505_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub1Array1632[i_3]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (this.aClass136_9108.aBool1631) {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub4_1633);
					} else {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub1Array1632[0]);
					}

					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else {
				this.aClass505_Sub1_1664.method13654((Class137) null);
			}

			this.aClass505_Sub1_1664.method13610(0);
			if ((i_1 & 0x40) == 0) {
				aFloatArray9111[0] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8429;
				aFloatArray9111[1] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8430;
				aFloatArray9111[2] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8431;
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			}

			i_3 = i_1 & 0x3;
			if (i_3 == 2) {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			} else if (i_3 == 3) {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
			}
		}

	}

	void method2396(int i_1, int i_2) {
		if (this.aClass138_9109 != null) {
			this.aClass505_Sub1_1664.method13610(1);
			int i_3;
			if ((i_1 & 0x80) == 0) {
				if ((i_2 & 0x1) == 1) {
					if (!this.aClass136_9108.aBool1631) {
						i_3 = this.aClass505_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub1Array1632[i_3]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (this.aClass136_9108.aBool1631) {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub4_1633);
					} else {
						this.aClass505_Sub1_1664.method13654(this.aClass136_9108.aClass137_Sub1Array1632[0]);
					}

					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else {
				this.aClass505_Sub1_1664.method13654((Class137) null);
			}

			this.aClass505_Sub1_1664.method13610(0);
			if ((i_1 & 0x40) == 0) {
				aFloatArray9111[0] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8429;
				aFloatArray9111[1] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8430;
				aFloatArray9111[2] = this.aClass505_Sub1_1664.aFloat8432 * this.aClass505_Sub1_1664.aFloat8431;
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			}

			i_3 = i_1 & 0x3;
			if (i_3 == 2) {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			} else if (i_3 == 3) {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
			}
		}

	}

	void method2413(Class137 class137_1, int i_2) {
		this.aClass505_Sub1_1664.method13654(class137_1);
		this.aClass505_Sub1_1664.method13612(i_2);
	}

	void method2412(Class137 class137_1, int i_2) {
		this.aClass505_Sub1_1664.method13654(class137_1);
		this.aClass505_Sub1_1664.method13612(i_2);
	}

	void method2403(boolean bool_1) {
		if (this.aClass138_9109 != null) {
			this.aClass138_9109.method2379('\u0000');
			this.aClass505_Sub1_1664.method13610(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(this.aClass505_Sub1_1664.aClass384_8391.buf, 0);
			OpenGL.glMatrixMode(5888);
			this.aClass505_Sub1_1664.method13610(0);
			if (this.anInt9110 != this.aClass505_Sub1_1664.anInt8368) {
				int i_2 = this.aClass505_Sub1_1664.anInt8368 % 5000 * 128 / 5000;

				for (int i_3 = 0; i_3 < 64; i_3++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_3, this.aFloatArray9106, i_2);
					i_2 += 2;
				}

				if (this.aClass136_9108.aBool1631) {
					this.aFloat9112 = (float) (this.aClass505_Sub1_1664.anInt8368 % 4000) / 4000.0F;
				} else {
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}

				this.anInt9110 = this.aClass505_Sub1_1664.anInt8368;
			}
		}

	}

	void method2414(Class137 class137_1, int i_2) {
		this.aClass505_Sub1_1664.method13654(class137_1);
		this.aClass505_Sub1_1664.method13612(i_2);
	}

}
