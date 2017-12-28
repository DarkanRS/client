
/* Class141_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class141_Sub4 extends Class141 {
	boolean aBool9063;
	static final String aString9064 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	static final String aString9065 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";
	static final String aString9066 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	Class133 aClass133_9067;
	boolean aBool9068;
	boolean aBool9069;
	static final String aString9070 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";
	Class137_Sub1 aClass137_Sub1_9071;
	Class133 aClass133_9072;
	boolean aBool9073 = false;
	Class133 aClass133_9074;
	Class133 aClass133_9075;
	static float[] aFloatArray9076 = { 0.0F, -1.0F, 0.0F, 0.0F };

	void method2408(boolean bool) {
		/* empty */
	}

	void method2403(boolean bool) {
		((Class141_Sub4) this).aBool9069 = bool;
		((Class141_Sub4) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13654(((Class141_Sub4) this).aClass137_Sub1_9071);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13717(34165, 7681);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 34166, 768);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13595(2, 5890, 770);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13610(0);
		method14427();
	}

	void method2397(boolean bool) {
		((Class141_Sub4) this).aBool9069 = bool;
		((Class141_Sub4) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13654(((Class141_Sub4) this).aClass137_Sub1_9071);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13717(34165, 7681);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 34166, 768);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13595(2, 5890, 770);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13610(0);
		method14427();
	}

	boolean method2395() {
		return ((Class141_Sub4) this).aBool9063;
	}

	void method2407(boolean bool) {
		/* empty */
	}

	void method14427() {
		Class384 class384 = (((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass384_8348);
		if (((Class141_Sub4) this).aBool9069)
			OpenGL.glBindProgramARB(34336, ((((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).anInt8450) == 2147483647 ? ((Class133) (((Class141_Sub4) this).aClass133_9067)).anInt1596 : (((Class133) ((Class141_Sub4) this).aClass133_9072).anInt1596)));
		else
			OpenGL.glBindProgramARB(34336, ((((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).anInt8450) == 2147483647 ? ((Class133) (((Class141_Sub4) this).aClass133_9075)).anInt1596 : (((Class133) ((Class141_Sub4) this).aClass133_9074).anInt1596)));
		float f = (float) ((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).anInt8450;
		float f_0_ = class384.aFloatArray4667[4] * f + class384.aFloatArray4667[12];
		float f_1_ = class384.aFloatArray4667[5] * f + class384.aFloatArray4667[13];
		float f_2_ = class384.aFloatArray4667[6] * f + class384.aFloatArray4667[14];
		aFloatArray9076[0] = -class384.aFloatArray4667[4];
		aFloatArray9076[1] = -class384.aFloatArray4667[5];
		aFloatArray9076[2] = -class384.aFloatArray4667[6];
		aFloatArray9076[3] = -(aFloatArray9076[0] * f_0_ + aFloatArray9076[1] * f_1_ + aFloatArray9076[2] * f_2_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray9076[0], aFloatArray9076[1], aFloatArray9076[2], aFloatArray9076[3]);
		OpenGL.glEnable(34336);
		((Class141_Sub4) this).aBool9068 = true;
		method14428();
	}

	void method14428() {
		if (((Class141_Sub4) this).aBool9068) {
			float f = (((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aFloat8404);
			float f_3_ = (((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aFloat8403);
			float f_4_ = f - (f - f_3_) * 0.125F;
			float f_5_ = f - (f - f_3_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_5_, f_4_, 256.0F / (float) ((((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).aClass90_8423.anInt945) * 973144081), (float) ((((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass90_8423.anInt947) * -732614481) / 255.0F);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13617((((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass90_8423.anInt946) * 1152775735);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13610(0);
		}
	}

	void method2400(Class137 class137, int i) {
		if (class137 == null) {
			if (!((Class141_Sub4) this).aBool9073) {
				((Class141_Sub4) this).aClass505_Sub1_1664.method13654(((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass137_Sub1_8460);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13612(1);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
				((Class141_Sub4) this).aBool9073 = true;
			}
		} else {
			if (((Class141_Sub4) this).aBool9073) {
				((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
				((Class141_Sub4) this).aBool9073 = false;
			}
			((Class141_Sub4) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	void method2399(int i, int i_6_) {
		/* empty */
	}

	boolean method2401() {
		return ((Class141_Sub4) this).aBool9063;
	}

	void method2402(boolean bool) {
		((Class141_Sub4) this).aBool9069 = bool;
		((Class141_Sub4) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13654(((Class141_Sub4) this).aClass137_Sub1_9071);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13717(34165, 7681);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 34166, 768);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13595(2, 5890, 770);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13610(0);
		method14427();
	}

	void method14429() {
		if (((Class141_Sub4) this).aBool9068) {
			float f = (((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aFloat8404);
			float f_7_ = (((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aFloat8403);
			float f_8_ = f - (f - f_7_) * 0.125F;
			float f_9_ = f - (f - f_7_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_9_, f_8_, 256.0F / (float) ((((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).aClass90_8423.anInt945) * 973144081), (float) ((((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass90_8423.anInt947) * -732614481) / 255.0F);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13617((((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass90_8423.anInt946) * 1152775735);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13610(0);
		}
	}

	void method2404(boolean bool) {
		/* empty */
	}

	void method2405(boolean bool) {
		/* empty */
	}

	void method2406(boolean bool) {
		/* empty */
	}

	Class141_Sub4(Class505_Sub1 class505_sub1) {
		super(class505_sub1);
		if (((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aBool8484) {
			((Class141_Sub4) this).aClass133_9075 = (Class133.method2321(((Class141_Sub4) this).aClass505_Sub1_1664, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			((Class141_Sub4) this).aClass133_9067 = (Class133.method2321(((Class141_Sub4) this).aClass505_Sub1_1664, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n"));
			((Class141_Sub4) this).aClass133_9074 = (Class133.method2321(((Class141_Sub4) this).aClass505_Sub1_1664, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			((Class141_Sub4) this).aClass133_9072 = (Class133.method2321(((Class141_Sub4) this).aClass505_Sub1_1664, 34336,
					"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n"));
			if (((Class141_Sub4) this).aClass133_9075 != null & ((Class141_Sub4) this).aClass133_9067 != null & ((Class141_Sub4) this).aClass133_9074 != null & ((Class141_Sub4) this).aClass133_9072 != null) {
				((Class141_Sub4) this).aClass137_Sub1_9071 = new Class137_Sub1(class505_sub1, 3553, Class150.aClass150_1951, Class76.aClass76_751, 2, 1, false, new byte[] { 0, -1 }, Class150.aClass150_1951, false);
				((Class141_Sub4) this).aClass137_Sub1_9071.method14445(false, false);
				((Class141_Sub4) this).aBool9063 = true;
			} else
				((Class141_Sub4) this).aBool9063 = false;
		} else
			((Class141_Sub4) this).aBool9063 = false;
	}

	void method2411() {
		if (((Class141_Sub4) this).aBool9068) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			((Class141_Sub4) this).aBool9068 = false;
		}
		((Class141_Sub4) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13654(null);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13717(8448, 8448);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13595(2, 34166, 770);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13610(0);
		if (((Class141_Sub4) this).aBool9073) {
			((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
			((Class141_Sub4) this).aBool9073 = false;
		}
	}

	void method2414(Class137 class137, int i) {
		if (class137 == null) {
			if (!((Class141_Sub4) this).aBool9073) {
				((Class141_Sub4) this).aClass505_Sub1_1664.method13654(((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass137_Sub1_8460);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13612(1);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
				((Class141_Sub4) this).aBool9073 = true;
			}
		} else {
			if (((Class141_Sub4) this).aBool9073) {
				((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
				((Class141_Sub4) this).aBool9073 = false;
			}
			((Class141_Sub4) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	void method2396(int i, int i_10_) {
		/* empty */
	}

	void method2410(int i, int i_11_) {
		/* empty */
	}

	void method2394(Class137 class137, int i) {
		if (class137 == null) {
			if (!((Class141_Sub4) this).aBool9073) {
				((Class141_Sub4) this).aClass505_Sub1_1664.method13654(((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass137_Sub1_8460);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13612(1);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
				((Class141_Sub4) this).aBool9073 = true;
			}
		} else {
			if (((Class141_Sub4) this).aBool9073) {
				((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
				((Class141_Sub4) this).aBool9073 = false;
			}
			((Class141_Sub4) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	void method2412(Class137 class137, int i) {
		if (class137 == null) {
			if (!((Class141_Sub4) this).aBool9073) {
				((Class141_Sub4) this).aClass505_Sub1_1664.method13654(((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass137_Sub1_8460);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13612(1);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
				((Class141_Sub4) this).aBool9073 = true;
			}
		} else {
			if (((Class141_Sub4) this).aBool9073) {
				((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
				((Class141_Sub4) this).aBool9073 = false;
			}
			((Class141_Sub4) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	void method2413(Class137 class137, int i) {
		if (class137 == null) {
			if (!((Class141_Sub4) this).aBool9073) {
				((Class141_Sub4) this).aClass505_Sub1_1664.method13654(((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass137_Sub1_8460);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13612(1);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 34168, 768);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 34168, 770);
				((Class141_Sub4) this).aBool9073 = true;
			}
		} else {
			if (((Class141_Sub4) this).aBool9073) {
				((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
				((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
				((Class141_Sub4) this).aBool9073 = false;
			}
			((Class141_Sub4) this).aClass505_Sub1_1664.method13654(class137);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13612(i);
		}
	}

	void method2398() {
		if (((Class141_Sub4) this).aBool9068) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			((Class141_Sub4) this).aBool9068 = false;
		}
		((Class141_Sub4) this).aClass505_Sub1_1664.method13610(1);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13654(null);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13717(8448, 8448);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13595(2, 34166, 770);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
		((Class141_Sub4) this).aClass505_Sub1_1664.method13610(0);
		if (((Class141_Sub4) this).aBool9073) {
			((Class141_Sub4) this).aClass505_Sub1_1664.method13595(0, 5890, 768);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13616(0, 5890, 770);
			((Class141_Sub4) this).aBool9073 = false;
		}
	}

	void method14430() {
		Class384 class384 = (((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass384_8348);
		if (((Class141_Sub4) this).aBool9069)
			OpenGL.glBindProgramARB(34336, ((((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).anInt8450) == 2147483647 ? ((Class133) (((Class141_Sub4) this).aClass133_9067)).anInt1596 : (((Class133) ((Class141_Sub4) this).aClass133_9072).anInt1596)));
		else
			OpenGL.glBindProgramARB(34336, ((((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).anInt8450) == 2147483647 ? ((Class133) (((Class141_Sub4) this).aClass133_9075)).anInt1596 : (((Class133) ((Class141_Sub4) this).aClass133_9074).anInt1596)));
		float f = (float) ((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).anInt8450;
		float f_12_ = class384.aFloatArray4667[4] * f + class384.aFloatArray4667[12];
		float f_13_ = class384.aFloatArray4667[5] * f + class384.aFloatArray4667[13];
		float f_14_ = class384.aFloatArray4667[6] * f + class384.aFloatArray4667[14];
		aFloatArray9076[0] = -class384.aFloatArray4667[4];
		aFloatArray9076[1] = -class384.aFloatArray4667[5];
		aFloatArray9076[2] = -class384.aFloatArray4667[6];
		aFloatArray9076[3] = -(aFloatArray9076[0] * f_12_ + aFloatArray9076[1] * f_13_ + aFloatArray9076[2] * f_14_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray9076[0], aFloatArray9076[1], aFloatArray9076[2], aFloatArray9076[3]);
		OpenGL.glEnable(34336);
		((Class141_Sub4) this).aBool9068 = true;
		method14428();
	}

	void method14431() {
		Class384 class384 = (((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass384_8348);
		if (((Class141_Sub4) this).aBool9069)
			OpenGL.glBindProgramARB(34336, ((((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).anInt8450) == 2147483647 ? ((Class133) (((Class141_Sub4) this).aClass133_9067)).anInt1596 : (((Class133) ((Class141_Sub4) this).aClass133_9072).anInt1596)));
		else
			OpenGL.glBindProgramARB(34336, ((((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).anInt8450) == 2147483647 ? ((Class133) (((Class141_Sub4) this).aClass133_9075)).anInt1596 : (((Class133) ((Class141_Sub4) this).aClass133_9074).anInt1596)));
		float f = (float) ((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).anInt8450;
		float f_15_ = class384.aFloatArray4667[4] * f + class384.aFloatArray4667[12];
		float f_16_ = class384.aFloatArray4667[5] * f + class384.aFloatArray4667[13];
		float f_17_ = class384.aFloatArray4667[6] * f + class384.aFloatArray4667[14];
		aFloatArray9076[0] = -class384.aFloatArray4667[4];
		aFloatArray9076[1] = -class384.aFloatArray4667[5];
		aFloatArray9076[2] = -class384.aFloatArray4667[6];
		aFloatArray9076[3] = -(aFloatArray9076[0] * f_15_ + aFloatArray9076[1] * f_16_ + aFloatArray9076[2] * f_17_);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray9076[0], aFloatArray9076[1], aFloatArray9076[2], aFloatArray9076[3]);
		OpenGL.glEnable(34336);
		((Class141_Sub4) this).aBool9068 = true;
		method14428();
	}

	void method2409(int i, int i_18_) {
		/* empty */
	}

	void method14432() {
		if (((Class141_Sub4) this).aBool9068) {
			float f = (((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aFloat8404);
			float f_19_ = (((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aFloat8403);
			float f_20_ = f - (f - f_19_) * 0.125F;
			float f_21_ = f - (f - f_19_) * 0.25F;
			OpenGL.glProgramLocalParameter4fARB(34336, 0, f_21_, f_20_, 256.0F / (float) ((((Class505_Sub1) (((Class141_Sub4) this).aClass505_Sub1_1664)).aClass90_8423.anInt945) * 973144081), (float) ((((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass90_8423.anInt947) * -732614481) / 255.0F);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13610(1);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13617((((Class505_Sub1) ((Class141_Sub4) this).aClass505_Sub1_1664).aClass90_8423.anInt946) * 1152775735);
			((Class141_Sub4) this).aClass505_Sub1_1664.method13610(0);
		}
	}
}
