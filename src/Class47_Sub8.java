/* Class47_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class47_Sub8 extends Class47 {
	float aFloat6798;
	int anInt6799;
	static char aChar6800 = '\001';
	static String aString6801 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
	Class39 aClass39_6802;
	float[] aFloatArray6803;
	static char aChar6804 = '\0';
	Class28 aClass28_6805;
	Class45 aClass45_6806;
	static float[] aFloatArray6807 = new float[4];

	void method508(boolean bool) {
		/* empty */
	}

	boolean method501() {
		return true;
	}

	void method525() {
		((Class47_Sub8) this).aClass28_6805 = new Class28(((Class47_Sub8) this).aClass_ra_Sub2_491, 2);
		((Class47_Sub8) this).aClass28_6805.method405(0);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5273(-16777216);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5258(260, 7681);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5286(0, 34166, 770);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
		OpenGL.glBindProgramARB(34336, ((Class39) (((Class47_Sub8) this).aClass39_6802)).anInt430);
		OpenGL.glEnable(34336);
		((Class47_Sub8) this).aClass28_6805.method403();
		((Class47_Sub8) this).aClass28_6805.method405(1);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5243(0);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5286(0, 5890, 770);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		OpenGL.glDisable(34820);
		((Class47_Sub8) this).aClass28_6805.method403();
	}

	void method505(boolean bool) {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass28_6805.method404('\0');
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aClass233_8089.aFloatArray2594), 0);
			OpenGL.glMatrixMode(5888);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
			if (((Class47_Sub8) this).anInt6799 != (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062)) {
				int i = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062 % 5000 * 128 / 5000);
				for (int i_0_ = 0; i_0_ < 64; i_0_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_0_, (((Class47_Sub8) this).aFloatArray6803), i);
					i += 2;
				}
				if (((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480)
					((Class47_Sub8) this).aFloat6798 = (float) ((((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class47_Sub8) this).anInt6799 = ((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062;
			}
		}
	}

	void method504() {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass28_6805.method404('\001');
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
		}
	}

	void method503(int i, int i_1_) {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			if ((i & 0x80) == 0) {
				if ((i_1_ & 0x1) == 1) {
					if (!((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480) {
						int i_2_ = ((((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062) % 4000 * 16 / 4000);
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[i_2_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class47_Sub8) this).aFloat6798, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480)
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
					else
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
			if ((i & 0x40) == 0) {
				aFloatArray6807[0] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8125);
				aFloatArray6807[1] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8128);
				aFloatArray6807[2] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8191);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray6807, 0);
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

	void method518(boolean bool) {
		/* empty */
	}

	void method502(int i, int i_4_) {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			if ((i & 0x80) == 0) {
				if ((i_4_ & 0x1) == 1) {
					if (!((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480) {
						int i_5_ = ((((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062) % 4000 * 16 / 4000);
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[i_5_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class47_Sub8) this).aFloat6798, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480)
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
					else
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
			if ((i & 0x40) == 0) {
				aFloatArray6807[0] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8125);
				aFloatArray6807[1] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8128);
				aFloatArray6807[2] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8191);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray6807, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_6_ = i & 0x3;
			if (i_6_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_6_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method500(Class30 class30, int i) {
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(class30);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5243(i);
	}

	void method513(int i, int i_7_) {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			if ((i & 0x80) == 0) {
				if ((i_7_ & 0x1) == 1) {
					if (!((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480) {
						int i_8_ = ((((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062) % 4000 * 16 / 4000);
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[i_8_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class47_Sub8) this).aFloat6798, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480)
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
					else
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
			if ((i & 0x40) == 0) {
				aFloatArray6807[0] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8125);
				aFloatArray6807[1] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8128);
				aFloatArray6807[2] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8191);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray6807, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_9_ = i & 0x3;
			if (i_9_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_9_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method511() {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass28_6805.method404('\001');
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
		}
	}

	void method509(boolean bool) {
		/* empty */
	}

	void method510(boolean bool) {
		/* empty */
	}

	Class47_Sub8(Class_ra_Sub2 class_ra_sub2, Class45 class45) {
		super(class_ra_sub2);
		((Class47_Sub8) this).aClass45_6806 = class45;
		if ((((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aBoolean8039) && (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8165) >= 2) {
			((Class47_Sub8) this).aClass39_6802 = (Class39
					.method477(
							((Class47_Sub8) this).aClass_ra_Sub2_491,
							34336,
							"!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND"));
			if (((Class47_Sub8) this).aClass39_6802 != null) {
				int[][] is = Class381.method4684(64, 256, 0, 4, 4, 3, 0.4F, false, (byte) 25);
				int[][] is_10_ = Class381.method4684(64, 256, 8, 4, 4, 3, 0.4F, false, (byte) 80);
				int i = 0;
				((Class47_Sub8) this).aFloatArray6803 = new float[32768];
				for (int i_11_ = 0; i_11_ < 256; i_11_++) {
					int[] is_12_ = is[i_11_];
					int[] is_13_ = is_10_[i_11_];
					for (int i_14_ = 0; i_14_ < 64; i_14_++) {
						((Class47_Sub8) this).aFloatArray6803[i++] = (float) is_12_[i_14_] / 4096.0F;
						((Class47_Sub8) this).aFloatArray6803[i++] = (float) is_13_[i_14_] / 4096.0F;
					}
				}
				method525();
			}
		}
	}

	void method507(boolean bool) {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass28_6805.method404('\0');
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aClass233_8089.aFloatArray2594), 0);
			OpenGL.glMatrixMode(5888);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
			if (((Class47_Sub8) this).anInt6799 != (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062)) {
				int i = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062 % 5000 * 128 / 5000);
				for (int i_15_ = 0; i_15_ < 64; i_15_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_15_, (((Class47_Sub8) this).aFloatArray6803), i);
					i += 2;
				}
				if (((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480)
					((Class47_Sub8) this).aFloat6798 = (float) ((((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class47_Sub8) this).anInt6799 = ((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062;
			}
		}
	}

	void method512() {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass28_6805.method404('\001');
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
		}
	}

	void method517(int i, int i_16_) {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			if ((i & 0x80) == 0) {
				if ((i_16_ & 0x1) == 1) {
					if (!((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480) {
						int i_17_ = ((((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).anInt8062) % 4000 * 16 / 4000);
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[i_17_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class47_Sub8) this).aFloat6798, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480)
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
					else
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
			if ((i & 0x40) == 0) {
				aFloatArray6807[0] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8125);
				aFloatArray6807[1] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8128);
				aFloatArray6807[2] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8191);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray6807, 0);
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

	void method515(int i, int i_19_) {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			if ((i & 0x80) == 0) {
				if ((i_19_ & 0x1) == 1) {
					if (!((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480) {
						int i_20_ = ((((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).anInt8062) % 4000 * 16 / 4000);
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[i_20_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class47_Sub8) this).aFloat6798, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480)
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
					else
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
			if ((i & 0x40) == 0) {
				aFloatArray6807[0] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8125);
				aFloatArray6807[1] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8128);
				aFloatArray6807[2] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8191);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray6807, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_21_ = i & 0x3;
			if (i_21_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_21_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method516(int i, int i_22_) {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			if ((i & 0x80) == 0) {
				if ((i_22_ & 0x1) == 1) {
					if (!((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480) {
						int i_23_ = ((((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).anInt8062) % 4000 * 16 / 4000);
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[i_23_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, ((Class47_Sub8) this).aFloat6798, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480)
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub4_482);
					else
						((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(((Class45) ((Class47_Sub8) this).aClass45_6806).aClass30_Sub2Array487[0]);
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else
				((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(null);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
			if ((i & 0x40) == 0) {
				aFloatArray6807[0] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8125);
				aFloatArray6807[1] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8128);
				aFloatArray6807[2] = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aFloat8130 * ((Class_ra_Sub2) (((Class47_Sub8) this).aClass_ra_Sub2_491)).aFloat8191);
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray6807, 0);
			} else
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_24_ = i & 0x3;
			if (i_24_ == 2)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_24_ == 3)
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	void method506(boolean bool) {
		if (((Class47_Sub8) this).aClass28_6805 != null) {
			((Class47_Sub8) this).aClass28_6805.method404('\0');
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf((((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).aClass233_8089.aFloatArray2594), 0);
			OpenGL.glMatrixMode(5888);
			((Class47_Sub8) this).aClass_ra_Sub2_491.method5255(0);
			if (((Class47_Sub8) this).anInt6799 != (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062)) {
				int i = (((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062 % 5000 * 128 / 5000);
				for (int i_25_ = 0; i_25_ < 64; i_25_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_25_, (((Class47_Sub8) this).aFloatArray6803), i);
					i += 2;
				}
				if (((Class45) ((Class47_Sub8) this).aClass45_6806).aBoolean480)
					((Class47_Sub8) this).aFloat6798 = (float) ((((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062) % 4000) / 4000.0F;
				else
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				((Class47_Sub8) this).anInt6799 = ((Class_ra_Sub2) ((Class47_Sub8) this).aClass_ra_Sub2_491).anInt8062;
			}
		}
	}

	void method514(Class30 class30, int i) {
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(class30);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5243(i);
	}

	void method519(Class30 class30, int i) {
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5256(class30);
		((Class47_Sub8) this).aClass_ra_Sub2_491.method5243(i);
	}

	boolean method520() {
		return true;
	}
}
