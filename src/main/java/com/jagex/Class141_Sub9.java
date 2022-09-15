package com.jagex;

import jaggl.OpenGL;

public class Class141_Sub9 extends Class141 {

	static float[] aFloatArray9111 = new float[4];
	Class138 aClass138_9109;
	float aFloat9112;
	int anInt9110;
	Class136 aClass136_9108;
	Class133 aClass133_9115;
	float[] aFloatArray9106;

	Class141_Sub9(OpenGLRenderer class505_sub1_1, Class136 class136_2) {
		super(class505_sub1_1);
		aClass136_9108 = class136_2;
		if (aGraphicalRenderer_Sub1_1664.supportsVertexPrograms && aGraphicalRenderer_Sub1_1664.maxTextureUnits >= 2) {
			aClass133_9115 = Class133.method2321(aGraphicalRenderer_Sub1_1664, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (aClass133_9115 != null) {
				int[][] ints_3 = Class304.method5410();
				int[][] ints_4 = Class304.method5410();
				int i_5 = 0;
				aFloatArray9106 = new float[32768];

				for (int i_6 = 0; i_6 < 256; i_6++) {
					int[] ints_7 = ints_3[i_6];
					int[] ints_8 = ints_4[i_6];

					for (int i_9 = 0; i_9 < 64; i_9++) {
						aFloatArray9106[i_5++] = ints_7[i_9] / 4096.0F;
						aFloatArray9106[i_5++] = ints_8[i_9] / 4096.0F;
					}
				}

				method14463();
			}
		}

	}

	void method14463() {
		aClass138_9109 = new Class138(2);
		aClass138_9109.method2380(0);
		aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
		aGraphicalRenderer_Sub1_1664.method13617(-16777216);
		aGraphicalRenderer_Sub1_1664.method13717(260, 7681);
		aGraphicalRenderer_Sub1_1664.method13616(0, 34166);
		aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
		OpenGL.glBindProgramARB(34336, aClass133_9115.anInt1596);
		OpenGL.glEnable(34336);
		aClass138_9109.method2381();
		aClass138_9109.method2380(1);
		aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		aGraphicalRenderer_Sub1_1664.method13612(0);
		aGraphicalRenderer_Sub1_1664.method13616(0, 5890);
		aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		aClass138_9109.method2381();
	}

	@Override
	void method2394(GLTexture class137_1, int i_2) {
		aGraphicalRenderer_Sub1_1664.setTexture(class137_1);
		aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	@Override
	boolean method2395() {
		return true;
	}

	@Override
	void method2396(int i_1, int i_2) {
		if (aClass138_9109 != null) {
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			int i_3;
			if ((i_1 & 0x80) == 0) {
				if ((i_2 & 0x1) == 1) {
					if (!aClass136_9108.aBool1631) {
						i_3 = aGraphicalRenderer_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub1Array1632[i_3]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass136_9108.aBool1631)
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub4_1633);
					else
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub1Array1632[0]);

					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aGraphicalRenderer_Sub1_1664.setTexture(null);

			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			if ((i_1 & 0x40) == 0) {
				aFloatArray9111[0] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8429;
				aFloatArray9111[1] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8430;
				aFloatArray9111[2] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8431;
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);

			i_3 = i_1 & 0x3;
			if (i_3 == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_3 == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}

	}

	@Override
	void method2397(boolean bool_1) {
		if (aClass138_9109 != null) {
			aClass138_9109.method2379('\u0000');
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(aGraphicalRenderer_Sub1_1664.aClass384_8391.buf, 0);
			OpenGL.glMatrixMode(5888);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			if (aGraphicalRenderer_Sub1_1664.anInt8368 != anInt9110) {
				int i_2 = aGraphicalRenderer_Sub1_1664.anInt8368 % 5000 * 128 / 5000;

				for (int i_3 = 0; i_3 < 64; i_3++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_3, aFloatArray9106, i_2);
					i_2 += 2;
				}

				if (aClass136_9108.aBool1631)
					aFloat9112 = (aGraphicalRenderer_Sub1_1664.anInt8368 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);

				anInt9110 = aGraphicalRenderer_Sub1_1664.anInt8368;
			}
		}

	}

	@Override
	void method2398() {
		if (aClass138_9109 != null) {
			aClass138_9109.method2379('\u0001');
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.setTexture(null);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
		}

	}

	@Override
	void method2399(int i_1, int i_2) {
		if (aClass138_9109 != null) {
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			int i_3;
			if ((i_1 & 0x80) == 0) {
				if ((i_2 & 0x1) == 1) {
					if (!aClass136_9108.aBool1631) {
						i_3 = aGraphicalRenderer_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub1Array1632[i_3]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass136_9108.aBool1631)
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub4_1633);
					else
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub1Array1632[0]);

					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aGraphicalRenderer_Sub1_1664.setTexture(null);

			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			if ((i_1 & 0x40) == 0) {
				aFloatArray9111[0] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8429;
				aFloatArray9111[1] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8430;
				aFloatArray9111[2] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8431;
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);

			i_3 = i_1 & 0x3;
			if (i_3 == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_3 == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}

	}

	@Override
	void method2400(GLTexture class137_1, int i_2) {
		aGraphicalRenderer_Sub1_1664.setTexture(class137_1);
		aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	@Override
	boolean method2401() {
		return true;
	}

	@Override
	void method2402(boolean bool_1) {
		if (aClass138_9109 != null) {
			aClass138_9109.method2379('\u0000');
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(aGraphicalRenderer_Sub1_1664.aClass384_8391.buf, 0);
			OpenGL.glMatrixMode(5888);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			if (anInt9110 != aGraphicalRenderer_Sub1_1664.anInt8368) {
				int i_2 = aGraphicalRenderer_Sub1_1664.anInt8368 % 5000 * 128 / 5000;

				for (int i_3 = 0; i_3 < 64; i_3++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_3, aFloatArray9106, i_2);
					i_2 += 2;
				}

				if (aClass136_9108.aBool1631)
					aFloat9112 = (aGraphicalRenderer_Sub1_1664.anInt8368 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);

				anInt9110 = aGraphicalRenderer_Sub1_1664.anInt8368;
			}
		}

	}

	@Override
	void method2403(boolean bool_1) {
		if (aClass138_9109 != null) {
			aClass138_9109.method2379('\u0000');
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(aGraphicalRenderer_Sub1_1664.aClass384_8391.buf, 0);
			OpenGL.glMatrixMode(5888);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			if (anInt9110 != aGraphicalRenderer_Sub1_1664.anInt8368) {
				int i_2 = aGraphicalRenderer_Sub1_1664.anInt8368 % 5000 * 128 / 5000;

				for (int i_3 = 0; i_3 < 64; i_3++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_3, aFloatArray9106, i_2);
					i_2 += 2;
				}

				if (aClass136_9108.aBool1631)
					aFloat9112 = (aGraphicalRenderer_Sub1_1664.anInt8368 % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);

				anInt9110 = aGraphicalRenderer_Sub1_1664.anInt8368;
			}
		}

	}

	@Override
	void method2404() {
	}

	@Override
	void method2405() {
	}

	@Override
	void method2406() {
	}

	@Override
	void method2407() {
	}

	@Override
	void method2408() {
	}

	@Override
	void method2409(int i_1, int i_2) {
		if (aClass138_9109 != null) {
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			int i_3;
			if ((i_1 & 0x80) == 0) {
				if ((i_2 & 0x1) == 1) {
					if (!aClass136_9108.aBool1631) {
						i_3 = aGraphicalRenderer_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub1Array1632[i_3]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass136_9108.aBool1631)
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub4_1633);
					else
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub1Array1632[0]);

					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aGraphicalRenderer_Sub1_1664.setTexture(null);

			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			if ((i_1 & 0x40) == 0) {
				aFloatArray9111[0] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8429;
				aFloatArray9111[1] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8430;
				aFloatArray9111[2] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8431;
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);

			i_3 = i_1 & 0x3;
			if (i_3 == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_3 == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}

	}

	@Override
	void method2410(int i_1, int i_2) {
		if (aClass138_9109 != null) {
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			int i_3;
			if ((i_1 & 0x80) == 0) {
				if ((i_2 & 0x1) == 1) {
					if (!aClass136_9108.aBool1631) {
						i_3 = aGraphicalRenderer_Sub1_1664.anInt8368 % 4000 * 16 / 4000;
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub1Array1632[i_3]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass136_9108.aBool1631)
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub4_1633);
					else
						aGraphicalRenderer_Sub1_1664.setTexture(aClass136_9108.aClass137_Sub1Array1632[0]);

					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				aGraphicalRenderer_Sub1_1664.setTexture(null);

			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
			if ((i_1 & 0x40) == 0) {
				aFloatArray9111[0] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8429;
				aFloatArray9111[1] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8430;
				aFloatArray9111[2] = aGraphicalRenderer_Sub1_1664.aFloat8432 * aGraphicalRenderer_Sub1_1664.aFloat8431;
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);

			i_3 = i_1 & 0x3;
			if (i_3 == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_3 == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}

	}

	@Override
	void method2411() {
		if (aClass138_9109 != null) {
			aClass138_9109.method2379('\u0001');
			aGraphicalRenderer_Sub1_1664.setActiveTexture(1);
			aGraphicalRenderer_Sub1_1664.setTexture(null);
			aGraphicalRenderer_Sub1_1664.setActiveTexture(0);
		}

	}

	@Override
	void method2412(GLTexture class137_1, int i_2) {
		aGraphicalRenderer_Sub1_1664.setTexture(class137_1);
		aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	@Override
	void method2413(GLTexture class137_1, int i_2) {
		aGraphicalRenderer_Sub1_1664.setTexture(class137_1);
		aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	@Override
	void method2414(GLTexture class137_1, int i_2) {
		aGraphicalRenderer_Sub1_1664.setTexture(class137_1);
		aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

}
