
/* Class141_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class141_Sub9 extends Class141 {
	float[] aFloatArray9106;
	static final char aChar9107 = '\0';
	Class136 aClass136_9108;
	Class138 aClass138_9109;
	int anInt9110;
	static float[] aFloatArray9111 = new float[4];
	float aFloat9112;
	static final char aChar9113 = '\001';
	static final String aString9114 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
	Class133 aClass133_9115;

	void method14463() {
		((Class141_Sub9) this).aClass138_9109 = new Class138(((Class141_Sub9) this).aClass505_Sub1_1664, 2);
		((Class141_Sub9) this).aClass138_9109.method2380(0);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13617(-16777216);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13717(260, 7681);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13616(0, 34166, 770);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
		OpenGL.glBindProgramARB(34336, ((Class133) (((Class141_Sub9) this).aClass133_9115)).anInt1596);
		OpenGL.glEnable(34336);
		((Class141_Sub9) this).aClass138_9109.method2381();
		((Class141_Sub9) this).aClass138_9109.method2380(1);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13612(0);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		((Class141_Sub9) this).aClass138_9109.method2381();
	}

	boolean method2395() {
		return true;
	}

	void method2397(boolean bool) {
		if (((Class141_Sub9) this).aClass138_9109 != null) {
			((Class141_Sub9) this).aClass138_9109.method2379('\0');
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aClass384_8391.aFloatArray4667), 0);
			OpenGL.glMatrixMode(5888);
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
			if (((Class141_Sub9) this).anInt9110 != ((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).anInt8368) {
				int i = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).anInt8368 % 5000 * 128 / 5000);
				for (int i_0_ = 0; i_0_ < 64; i_0_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_0_, (((Class141_Sub9) this).aFloatArray9106), i);
					i += 2;
				}
				if (((Class136) ((Class141_Sub9) this).aClass136_9108).aBool1631)
					((Class141_Sub9) this).aFloat9112 = (float) ((((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).anInt8368) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class141_Sub9) this).anInt9110 = ((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).anInt8368;
			}
		}
	}

	boolean method2401() {
		return true;
	}

	void method2408(boolean bool) {
		/* empty */
	}

	void method2398() {
		if (((Class141_Sub9) this).aClass138_9109 != null) {
			((Class141_Sub9) this).aClass138_9109.method2379('\001');
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub9) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
		}
	}

	void method2399(int i, int i_1_) {
		if (((Class141_Sub9) this).aClass138_9109 != null) {
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
			if ((i & 0x80) == 0) {
				if ((i_1_ & 0x1) == 1) {
					if (!((Class136) ((Class141_Sub9) this).aClass136_9108).aBool1631) {
						int i_2_ = ((((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).anInt8368) % 4000 * 16 / 4000);
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub1Array1632[i_2_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class141_Sub9) this).aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class136) ((Class141_Sub9) this).aClass136_9108).aBool1631)
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub4_1633);
					else
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub1Array1632[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class141_Sub9) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
			if ((i & 0x40) == 0) {
				aFloatArray9111[0] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8429);
				aFloatArray9111[1] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8430);
				aFloatArray9111[2] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8431);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_3_ = i & 0x3;
			if (i_3_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_3_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2400(Class137 class137, int i) {
		((Class141_Sub9) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13612(i);
	}

	Class141_Sub9(Class505_Sub1 class505_sub1, Class136 class136) {
		super(class505_sub1);
		((Class141_Sub9) this).aClass136_9108 = class136;
		if ((((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aBool8484) && (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).anInt8469) >= 2) {
			((Class141_Sub9) this).aClass133_9115 = (Class133.method2321(((Class141_Sub9) this).aClass505_Sub1_1664, 34336,
					"!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
			if (((Class141_Sub9) this).aClass133_9115 != null) {
				int[][] is = Class304.method5410(64, 256, 0, 4, 4, 3, 0.4F, false, 699119598);
				int[][] is_4_ = Class304.method5410(64, 256, 8, 4, 4, 3, 0.4F, false, 2060883829);
				int i = 0;
				((Class141_Sub9) this).aFloatArray9106 = new float[32768];
				for (int i_5_ = 0; i_5_ < 256; i_5_++) {
					int[] is_6_ = is[i_5_];
					int[] is_7_ = is_4_[i_5_];
					for (int i_8_ = 0; i_8_ < 64; i_8_++) {
						((Class141_Sub9) this).aFloatArray9106[i++] = (float) is_6_[i_8_] / 4096.0F;
						((Class141_Sub9) this).aFloatArray9106[i++] = (float) is_7_[i_8_] / 4096.0F;
					}
				}
				method14463();
			}
		}
	}

	void method2407(boolean bool) {
		/* empty */
	}

	void method2402(boolean bool) {
		if (((Class141_Sub9) this).aClass138_9109 != null) {
			((Class141_Sub9) this).aClass138_9109.method2379('\0');
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aClass384_8391.aFloatArray4667), 0);
			OpenGL.glMatrixMode(5888);
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
			if (((Class141_Sub9) this).anInt9110 != ((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).anInt8368) {
				int i = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).anInt8368 % 5000 * 128 / 5000);
				for (int i_9_ = 0; i_9_ < 64; i_9_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_9_, (((Class141_Sub9) this).aFloatArray9106), i);
					i += 2;
				}
				if (((Class136) ((Class141_Sub9) this).aClass136_9108).aBool1631)
					((Class141_Sub9) this).aFloat9112 = (float) ((((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).anInt8368) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class141_Sub9) this).anInt9110 = ((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).anInt8368;
			}
		}
	}

	void method2410(int i, int i_10_) {
		if (((Class141_Sub9) this).aClass138_9109 != null) {
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
			if ((i & 0x80) == 0) {
				if ((i_10_ & 0x1) == 1) {
					if (!((Class136) ((Class141_Sub9) this).aClass136_9108).aBool1631) {
						int i_11_ = ((((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).anInt8368) % 4000 * 16 / 4000);
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub1Array1632[i_11_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class141_Sub9) this).aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class136) ((Class141_Sub9) this).aClass136_9108).aBool1631)
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub4_1633);
					else
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub1Array1632[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class141_Sub9) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
			if ((i & 0x40) == 0) {
				aFloatArray9111[0] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8429);
				aFloatArray9111[1] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8430);
				aFloatArray9111[2] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8431);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_12_ = i & 0x3;
			if (i_12_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_12_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2404(boolean bool) {
		/* empty */
	}

	void method2394(Class137 class137, int i) {
		((Class141_Sub9) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2406(boolean bool) {
		/* empty */
	}

	void method2405(boolean bool) {
		/* empty */
	}

	void method2411() {
		if (((Class141_Sub9) this).aClass138_9109 != null) {
			((Class141_Sub9) this).aClass138_9109.method2379('\001');
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub9) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
		}
	}

	void method2409(int i, int i_13_) {
		if (((Class141_Sub9) this).aClass138_9109 != null) {
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
			if ((i & 0x80) == 0) {
				if ((i_13_ & 0x1) == 1) {
					if (!((Class136) ((Class141_Sub9) this).aClass136_9108).aBool1631) {
						int i_14_ = ((((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).anInt8368) % 4000 * 16 / 4000);
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub1Array1632[i_14_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class141_Sub9) this).aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class136) ((Class141_Sub9) this).aClass136_9108).aBool1631)
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub4_1633);
					else
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub1Array1632[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class141_Sub9) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
			if ((i & 0x40) == 0) {
				aFloatArray9111[0] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8429);
				aFloatArray9111[1] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8430);
				aFloatArray9111[2] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8431);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_15_ = i & 0x3;
			if (i_15_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_15_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method2396(int i, int i_16_) {
		if (((Class141_Sub9) this).aClass138_9109 != null) {
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
			if ((i & 0x80) == 0) {
				if ((i_16_ & 0x1) == 1) {
					if (!((Class136) ((Class141_Sub9) this).aClass136_9108).aBool1631) {
						int i_17_ = ((((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).anInt8368) % 4000 * 16 / 4000);
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub1Array1632[i_17_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub4_1633);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class141_Sub9) this).aFloat9112, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class136) ((Class141_Sub9) this).aClass136_9108).aBool1631)
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub4_1633);
					else
						((Class141_Sub9) this).aClass505_Sub1_1664.method13654(((Class136) ((Class141_Sub9) this).aClass136_9108).aClass137_Sub1Array1632[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class141_Sub9) this).aClass505_Sub1_1664.method13654(null);
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
			if ((i & 0x40) == 0) {
				aFloatArray9111[0] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8429);
				aFloatArray9111[1] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8430);
				aFloatArray9111[2] = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aFloat8432 * ((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).aFloat8431);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray9111, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_18_ = i & 0x3;
			if (i_18_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_18_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method14464() {
		((Class141_Sub9) this).aClass138_9109 = new Class138(((Class141_Sub9) this).aClass505_Sub1_1664, 2);
		((Class141_Sub9) this).aClass138_9109.method2380(0);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13617(-16777216);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13717(260, 7681);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13616(0, 34166, 770);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
		OpenGL.glBindProgramARB(34336, ((Class133) (((Class141_Sub9) this).aClass133_9115)).anInt1596);
		OpenGL.glEnable(34336);
		((Class141_Sub9) this).aClass138_9109.method2381();
		((Class141_Sub9) this).aClass138_9109.method2380(1);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13612(0);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		((Class141_Sub9) this).aClass138_9109.method2381();
	}

	void method2413(Class137 class137, int i) {
		((Class141_Sub9) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2412(Class137 class137, int i) {
		((Class141_Sub9) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13612(i);
	}

	void method2403(boolean bool) {
		if (((Class141_Sub9) this).aClass138_9109 != null) {
			((Class141_Sub9) this).aClass138_9109.method2379('\0');
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).aClass384_8391.aFloatArray4667), 0);
			OpenGL.glMatrixMode(5888);
			((Class141_Sub9) this).aClass505_Sub1_1664.method13610(0);
			if (((Class141_Sub9) this).anInt9110 != ((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).anInt8368) {
				int i = (((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).anInt8368 % 5000 * 128 / 5000);
				for (int i_19_ = 0; i_19_ < 64; i_19_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_19_, (((Class141_Sub9) this).aFloatArray9106), i);
					i += 2;
				}
				if (((Class136) ((Class141_Sub9) this).aClass136_9108).aBool1631)
					((Class141_Sub9) this).aFloat9112 = (float) ((((Class505_Sub1) (((Class141_Sub9) this).aClass505_Sub1_1664)).anInt8368) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class141_Sub9) this).anInt9110 = ((Class505_Sub1) ((Class141_Sub9) this).aClass505_Sub1_1664).anInt8368;
			}
		}
	}

	void method2414(Class137 class137, int i) {
		((Class141_Sub9) this).aClass505_Sub1_1664.method13654(class137);
		((Class141_Sub9) this).aClass505_Sub1_1664.method13612(i);
	}
}
