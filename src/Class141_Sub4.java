import jaggl.OpenGL;

public class Class141_Sub4 extends Class141 {

	static float[] aFloatArray9076 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };
	boolean aBool9069;
	boolean aBool9068;
	boolean aBool9073 = false;
	boolean aBool9063;
	Class133 aClass133_9075;
	Class133 aClass133_9067;
	Class133 aClass133_9074;
	Class133 aClass133_9072;
	Class137_Sub1 aClass137_Sub1_9071;

	void method2408(boolean bool_1) {
	}

	void method2403(boolean bool_1) {
		this.aBool9069 = bool_1;
		this.aClass505_Sub1_1664.method13610(1);
		this.aClass505_Sub1_1664.method13654(this.aClass137_Sub1_9071);
		this.aClass505_Sub1_1664.method13717(34165, 7681);
		this.aClass505_Sub1_1664.method13595(0, 34166, 768);
		this.aClass505_Sub1_1664.method13595(2, 5890, 770);
		this.aClass505_Sub1_1664.method13616(0, 34168, 770);
		this.aClass505_Sub1_1664.method13610(0);
		this.method14427();
	}

	void method2397(boolean bool_1) {
		this.aBool9069 = bool_1;
		this.aClass505_Sub1_1664.method13610(1);
		this.aClass505_Sub1_1664.method13654(this.aClass137_Sub1_9071);
		this.aClass505_Sub1_1664.method13717(34165, 7681);
		this.aClass505_Sub1_1664.method13595(0, 34166, 768);
		this.aClass505_Sub1_1664.method13595(2, 5890, 770);
		this.aClass505_Sub1_1664.method13616(0, 34168, 770);
		this.aClass505_Sub1_1664.method13610(0);
		this.method14427();
	}

	boolean method2395() {
		return this.aBool9063;
	}

	void method2407(boolean bool_1) {
	}

	void method14427() {
		Matrix44Arr matrix44arr_1 = this.aClass505_Sub1_1664.aClass384_8348;
		if (this.aBool9069) {
			OpenGL.glBindProgramARB(34336, this.aClass505_Sub1_1664.anInt8450 == Integer.MAX_VALUE ? this.aClass133_9067.anInt1596 : this.aClass133_9072.anInt1596);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass505_Sub1_1664.anInt8450 == Integer.MAX_VALUE ? this.aClass133_9075.anInt1596 : this.aClass133_9074.anInt1596);
		}

		float f_2 = (float) this.aClass505_Sub1_1664.anInt8450;
		float f_3 = matrix44arr_1.buf[4] * f_2 + matrix44arr_1.buf[12];
		float f_4 = matrix44arr_1.buf[5] * f_2 + matrix44arr_1.buf[13];
		float f_5 = matrix44arr_1.buf[6] * f_2 + matrix44arr_1.buf[14];
		aFloatArray9076[0] = -matrix44arr_1.buf[4];
		aFloatArray9076[1] = -matrix44arr_1.buf[5];
		aFloatArray9076[2] = -matrix44arr_1.buf[6];
		aFloatArray9076[3] = -(aFloatArray9076[0] * f_3 + aFloatArray9076[1] * f_4 + aFloatArray9076[2] * f_5);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray9076[0], aFloatArray9076[1], aFloatArray9076[2], aFloatArray9076[3]);
		OpenGL.glEnable(34336);
		this.aBool9068 = true;
		this.method14428();
	}

	void method14428() {
		if (this.aBool9068) {
			float f_1 = this.aClass505_Sub1_1664.aFloat8404;
			float f_2 = this.aClass505_Sub1_1664.aFloat8403;
			float f_3 = f_1 - (f_1 - f_2) * 0.125F;
			float f_4 = f_1 - (f_1 - f_2) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_4, f_3, 256.0F / (float) this.aClass505_Sub1_1664.aClass90_8423.scale, (float) this.aClass505_Sub1_1664.aClass90_8423.intensity / 255.0F);
			this.aClass505_Sub1_1664.method13610(1);
			this.aClass505_Sub1_1664.method13617(this.aClass505_Sub1_1664.aClass90_8423.color);
			this.aClass505_Sub1_1664.method13610(0);
		}

	}

	void method2400(Class137 class137_1, int i_2) {
		if (class137_1 == null) {
			if (!this.aBool9073) {
				this.aClass505_Sub1_1664.method13654(this.aClass505_Sub1_1664.aClass137_Sub1_8460);
				this.aClass505_Sub1_1664.method13612(1);
				this.aClass505_Sub1_1664.method13595(0, 34168, 768);
				this.aClass505_Sub1_1664.method13616(0, 34168, 770);
				this.aBool9073 = true;
			}
		} else {
			if (this.aBool9073) {
				this.aClass505_Sub1_1664.method13595(0, 5890, 768);
				this.aClass505_Sub1_1664.method13616(0, 5890, 770);
				this.aBool9073 = false;
			}

			this.aClass505_Sub1_1664.method13654(class137_1);
			this.aClass505_Sub1_1664.method13612(i_2);
		}

	}

	void method2399(int i_1, int i_2) {
	}

	boolean method2401() {
		return this.aBool9063;
	}

	void method2402(boolean bool_1) {
		this.aBool9069 = bool_1;
		this.aClass505_Sub1_1664.method13610(1);
		this.aClass505_Sub1_1664.method13654(this.aClass137_Sub1_9071);
		this.aClass505_Sub1_1664.method13717(34165, 7681);
		this.aClass505_Sub1_1664.method13595(0, 34166, 768);
		this.aClass505_Sub1_1664.method13595(2, 5890, 770);
		this.aClass505_Sub1_1664.method13616(0, 34168, 770);
		this.aClass505_Sub1_1664.method13610(0);
		this.method14427();
	}

	void method2404(boolean bool_1) {
	}

	void method2405(boolean bool_1) {
	}

	void method2406(boolean bool_1) {
	}

	Class141_Sub4(OpenGLGraphicalRenderer class505_sub1_1) {
		super(class505_sub1_1);
		if (this.aClass505_Sub1_1664.aBool8484) {
			this.aClass133_9075 = Class133.method2321(this.aClass505_Sub1_1664, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass133_9067 = Class133.method2321(this.aClass505_Sub1_1664, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass133_9074 = Class133.method2321(this.aClass505_Sub1_1664, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass133_9072 = Class133.method2321(this.aClass505_Sub1_1664, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass133_9075 != null & this.aClass133_9067 != null & this.aClass133_9074 != null & this.aClass133_9072 != null) {
				this.aClass137_Sub1_9071 = new Class137_Sub1(class505_sub1_1, 3553, Class150.aClass150_1951, Class76.aClass76_751, 2, 1, false, new byte[] { (byte) 0, (byte) -1 }, Class150.aClass150_1951, false);
				this.aClass137_Sub1_9071.method14445(false, false);
				this.aBool9063 = true;
			} else {
				this.aBool9063 = false;
			}
		} else {
			this.aBool9063 = false;
		}

	}

	void method2411() {
		if (this.aBool9068) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBool9068 = false;
		}

		this.aClass505_Sub1_1664.method13610(1);
		this.aClass505_Sub1_1664.method13654((Class137) null);
		this.aClass505_Sub1_1664.method13717(8448, 8448);
		this.aClass505_Sub1_1664.method13595(0, 5890, 768);
		this.aClass505_Sub1_1664.method13595(2, 34166, 770);
		this.aClass505_Sub1_1664.method13616(0, 5890, 770);
		this.aClass505_Sub1_1664.method13610(0);
		if (this.aBool9073) {
			this.aClass505_Sub1_1664.method13595(0, 5890, 768);
			this.aClass505_Sub1_1664.method13616(0, 5890, 770);
			this.aBool9073 = false;
		}

	}

	void method2414(Class137 class137_1, int i_2) {
		if (class137_1 == null) {
			if (!this.aBool9073) {
				this.aClass505_Sub1_1664.method13654(this.aClass505_Sub1_1664.aClass137_Sub1_8460);
				this.aClass505_Sub1_1664.method13612(1);
				this.aClass505_Sub1_1664.method13595(0, 34168, 768);
				this.aClass505_Sub1_1664.method13616(0, 34168, 770);
				this.aBool9073 = true;
			}
		} else {
			if (this.aBool9073) {
				this.aClass505_Sub1_1664.method13595(0, 5890, 768);
				this.aClass505_Sub1_1664.method13616(0, 5890, 770);
				this.aBool9073 = false;
			}

			this.aClass505_Sub1_1664.method13654(class137_1);
			this.aClass505_Sub1_1664.method13612(i_2);
		}

	}

	void method2396(int i_1, int i_2) {
	}

	void method2410(int i_1, int i_2) {
	}

	void method2394(Class137 class137_1, int i_2) {
		if (class137_1 == null) {
			if (!this.aBool9073) {
				this.aClass505_Sub1_1664.method13654(this.aClass505_Sub1_1664.aClass137_Sub1_8460);
				this.aClass505_Sub1_1664.method13612(1);
				this.aClass505_Sub1_1664.method13595(0, 34168, 768);
				this.aClass505_Sub1_1664.method13616(0, 34168, 770);
				this.aBool9073 = true;
			}
		} else {
			if (this.aBool9073) {
				this.aClass505_Sub1_1664.method13595(0, 5890, 768);
				this.aClass505_Sub1_1664.method13616(0, 5890, 770);
				this.aBool9073 = false;
			}

			this.aClass505_Sub1_1664.method13654(class137_1);
			this.aClass505_Sub1_1664.method13612(i_2);
		}

	}

	void method2412(Class137 class137_1, int i_2) {
		if (class137_1 == null) {
			if (!this.aBool9073) {
				this.aClass505_Sub1_1664.method13654(this.aClass505_Sub1_1664.aClass137_Sub1_8460);
				this.aClass505_Sub1_1664.method13612(1);
				this.aClass505_Sub1_1664.method13595(0, 34168, 768);
				this.aClass505_Sub1_1664.method13616(0, 34168, 770);
				this.aBool9073 = true;
			}
		} else {
			if (this.aBool9073) {
				this.aClass505_Sub1_1664.method13595(0, 5890, 768);
				this.aClass505_Sub1_1664.method13616(0, 5890, 770);
				this.aBool9073 = false;
			}

			this.aClass505_Sub1_1664.method13654(class137_1);
			this.aClass505_Sub1_1664.method13612(i_2);
		}

	}

	void method2413(Class137 class137_1, int i_2) {
		if (class137_1 == null) {
			if (!this.aBool9073) {
				this.aClass505_Sub1_1664.method13654(this.aClass505_Sub1_1664.aClass137_Sub1_8460);
				this.aClass505_Sub1_1664.method13612(1);
				this.aClass505_Sub1_1664.method13595(0, 34168, 768);
				this.aClass505_Sub1_1664.method13616(0, 34168, 770);
				this.aBool9073 = true;
			}
		} else {
			if (this.aBool9073) {
				this.aClass505_Sub1_1664.method13595(0, 5890, 768);
				this.aClass505_Sub1_1664.method13616(0, 5890, 770);
				this.aBool9073 = false;
			}

			this.aClass505_Sub1_1664.method13654(class137_1);
			this.aClass505_Sub1_1664.method13612(i_2);
		}

	}

	void method2398() {
		if (this.aBool9068) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBool9068 = false;
		}

		this.aClass505_Sub1_1664.method13610(1);
		this.aClass505_Sub1_1664.method13654((Class137) null);
		this.aClass505_Sub1_1664.method13717(8448, 8448);
		this.aClass505_Sub1_1664.method13595(0, 5890, 768);
		this.aClass505_Sub1_1664.method13595(2, 34166, 770);
		this.aClass505_Sub1_1664.method13616(0, 5890, 770);
		this.aClass505_Sub1_1664.method13610(0);
		if (this.aBool9073) {
			this.aClass505_Sub1_1664.method13595(0, 5890, 768);
			this.aClass505_Sub1_1664.method13616(0, 5890, 770);
			this.aBool9073 = false;
		}

	}

	void method2409(int i_1, int i_2) {
	}

}
