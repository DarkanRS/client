package com.jagex;

public class h extends MeshRasterizer implements Interface40 {

	long nativeid;
	ja aja7140;
	ba aba7141;
	ParticleEmitterConfig[] aClass87Array7139;
	SurfaceSkin[] aClass172Array7142;

	h(ja ja_1) {
		aja7140 = ja_1;
		aba7141 = null;
		ba(ja_1);
	}

	h(ja ja_1, ba ba_2, RSMesh rsmesh_3, int i_4, int i_5, int i_6, int i_7) {
		aja7140 = ja_1;
		aba7141 = ba_2;
		aClass87Array7139 = rsmesh_3.particleConfig;
		aClass172Array7142 = rsmesh_3.surfaceSkins;
		int i_8 = rsmesh_3.particleConfig == null ? 0 : rsmesh_3.particleConfig.length;
		int i_9 = rsmesh_3.surfaceSkins == null ? 0 : rsmesh_3.surfaceSkins.length;
		int i_10 = 0;
		int[] ints_11 = new int[i_9 + i_8 * 3];

		int i_12;
		for (i_12 = 0; i_12 < i_8; i_12++) {
			ints_11[i_10++] = aClass87Array7139[i_12].faceX;
			ints_11[i_10++] = aClass87Array7139[i_12].faceY;
			ints_11[i_10++] = aClass87Array7139[i_12].faceZ;
		}

		for (i_12 = 0; i_12 < i_9; i_12++)
			ints_11[i_10++] = aClass172Array7142[i_12].anInt2119;

		i_12 = rsmesh_3.isolatedVertexNormals == null ? 0 : rsmesh_3.isolatedVertexNormals.length;
		int[] ints_13 = new int[i_12 * 8];
		int i_14 = 0;

		int i_15;
		VertexNormal class84_16;
		for (i_15 = 0; i_15 < i_12; i_15++) {
			class84_16 = rsmesh_3.isolatedVertexNormals[i_15];
			BillboardDefinitions class347_17 = NPCMeshModifier.getBillboardDefinitions(class84_16.anInt812);
			ints_13[i_14++] = class84_16.anInt809;
			ints_13[i_14++] = class347_17.anInt4054;
			ints_13[i_14++] = class347_17.anInt4050;
			ints_13[i_14++] = class347_17.anInt4055;
			ints_13[i_14++] = class347_17.anInt4057;
			ints_13[i_14++] = class347_17.anInt4051;
			ints_13[i_14++] = class347_17.aBool4059 ? -1 : 0;
		}

		for (i_15 = 0; i_15 < i_12; i_15++) {
			class84_16 = rsmesh_3.isolatedVertexNormals[i_15];
			ints_13[i_14++] = class84_16.anInt811;
		}

		U(aja7140, aba7141, rsmesh_3.vertexCount, rsmesh_3.maxDepth, rsmesh_3.vertexX, rsmesh_3.vertexY, rsmesh_3.vertexZ, rsmesh_3.vertexSkins, rsmesh_3.aShortArray1980, rsmesh_3.faceCount, rsmesh_3.triangleX, rsmesh_3.triangleY, rsmesh_3.triangleZ, rsmesh_3.faceType, rsmesh_3.facePriorities, rsmesh_3.faceAlphas, rsmesh_3.texturePos, rsmesh_3.faceColor, rsmesh_3.faceTextures, rsmesh_3.textureSkins, rsmesh_3.priority, rsmesh_3.aShortArray1981, rsmesh_3.texturedFaceCount, rsmesh_3.textureRenderTypes, rsmesh_3.texTriX, rsmesh_3.texTriY, rsmesh_3.texTriZ, rsmesh_3.particleDirectionX, rsmesh_3.particleDirectionY, rsmesh_3.particleDirectionZ, rsmesh_3.particleLifespanX, rsmesh_3.particleLifespanY, rsmesh_3.particleLifespanZ, rsmesh_3.texturePrimaryColor, rsmesh_3.textureSecondaryColor, ints_11, i_8, i_9, i_4, i_5, i_6, i_7, ints_13);
	}

	native void aa(float[] var1, int var2, boolean var3);

	@Override
	public native int AA();

	@Override
	public native int ae();

	@Override
	public native void aq(int var1);

	@Override
	public native int ar();

	@Override
	public native byte[] aw();

	native void ba(ja var1);

	native void BA(h var1, h var2, int var3, boolean var4, boolean var5);

	@Override
	native void bb(int var1, int var2, int var3, int var4);

	@Override
	public native void bc(int var1, int var2, Ground var3, Ground var4, int var5, int var6, int var7);

	@Override
	public native void be();

	@Override
	public native void bf(int var1);

	@Override
	native boolean bh();

	@Override
	public native void bi(int var1);

	@Override
	public native void bj(int var1);

	@Override
	public native void bk(int var1);

	@Override
	native void bl(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

	@Override
	public native void bm(int var1);

	@Override
	public native void bn(int var1);

	@Override
	native void bo(int var1, int var2, int var3, int var4);

	@Override
	native void bp();

	@Override
	public native void bq();

	@Override
	public native void bs(int var1);

	@Override
	native boolean bv();

	@Override
	public native void bw(int var1);

	@Override
	public native void bx(int var1);

	@Override
	public native void by();

	@Override
	public native void bz(int var1);

	@Override
	public native int c();

	@Override
	public native int ca();

	@Override
	public native int cb();

	@Override
	public native int cc();

	@Override
	public native int cd();

	@Override
	public native void ce(int var1);

	@Override
	public native int ch();

	@Override
	public native int ci();

	@Override
	public native int ck();

	@Override
	public native int cm();

	@Override
	public native int co();

	@Override
	public native int cp();

	@Override
	public native void cq(short var1, short var2);

	@Override
	public native void cr(int var1);

	@Override
	public native int ct();

	@Override
	public native int cu();

	@Override
	public native int cv();

	@Override
	public native int cw();

	@Override
	public native void cy(int var1, int var2, int var3, int var4);

	@Override
	public native byte[] cz();

	@Override
	public native Shadow da(Shadow var1);

	@Override
	public native int dd();

	@Override
	public native void df(short var1, short var2);

	@Override
	public native int dg();

	@Override
	public native boolean dh();

	@Override
	public native void di(short var1, short var2);

	@Override
	public native void dk(int var1, int var2, int var3);

	@Override
	public native void dl(int var1);

	@Override
	public native int dm();

	@Override
	public native Shadow dn(Shadow var1);

	@Override
	public native int dp();

	@Override
	public native int dq();

	@Override
	public native Shadow dr(Shadow var1);

	@Override
	public native int du();

	@Override
	public native boolean dv();

	@Override
	public native Shadow dw(Shadow var1);

	@Override
	public native int dy();

	@Override
	native void e(int var1, int[] var2, int var3, int var4, int var5, boolean var6, int var7, int[] var8);

	@Override
	native boolean ea();

	@Override
	public native void EA(int var1);

	@Override
	public native void ep(int var1, int var2, int var3);

	@Override
	public native void f(int var1);

	native void fb(long var1, int var3, int[] var4, int var5, int var6, int var7, int var8, boolean var9);

	native void fe(ja var1, ba var2, int var3, int var4, int[] var5, int[] var6, int[] var7, int[] var8, short[] var9, int var10, short[] var11, short[] var12, short[] var13, byte[] var14, byte[] var15, byte[] var16, byte[] var17, short[] var18, short[] var19, int[] var20, byte var21, short[] var22, int var23, byte[] var24, short[] var25, short[] var26, short[] var27, int[] var28, int[] var29, int[] var30, byte[] var31, byte[] var32, int[] var33, int[] var34, int[] var35, int[] var36, int var37, int var38, int var39, int var40, int var41, int var42, int[] var43);

	native void ff(byte var1, byte[] var2);

	native void fg(h var1, h var2, int var3, boolean var4, boolean var5);

	native void fh(ja var1);

	@Override
	protected void finalize() {
		if (nativeid != 0L)
			Class156.method2642(this);

	}

	native void fk(ja var1, ba var2, int var3, int var4, int[] var5, int[] var6, int[] var7, int[] var8, short[] var9, int var10, short[] var11, short[] var12, short[] var13, byte[] var14, byte[] var15, byte[] var16, byte[] var17, short[] var18, short[] var19, int[] var20, byte var21, short[] var22, int var23, byte[] var24, short[] var25, short[] var26, short[] var27, int[] var28, int[] var29, int[] var30, byte[] var31, byte[] var32, int[] var33, int[] var34, int[] var35, int[] var36, int var37, int var38, int var39, int var40, int var41, int var42, int[] var43);

	native void fp(long var1, int var3, int[] var4, int var5, int var6, int var7, int var8, boolean var9);

	native void fr(byte var1, byte[] var2);

	native void ft(ja var1);

	native void fv(long var1, int var3, int[] var4, int var5, int var6, int var7, int var8, boolean var9);

	native void fw(byte var1, byte[] var2);

	native void fz(long var1, int var3, int[] var4, int var5, int var6, int var7, int var8, boolean var9);

	@Override
	public native Shadow ga(Shadow var1);

	@Override
	public native int ha();

	@Override
	public native boolean i();

	@Override
	public native void ia(int var1, int var2, int var3);

	native void IA(byte var1, byte[] var2);

	native void J(long var1, int var3, int[] var4, int var5, int var6, int var7, int var8, boolean var9);

	@Override
	native void ka();

	@Override
	public native void KA(int var1);

	@Override
	public native int m();

	@Override
	public native void ma(boolean var1);

	@Override
	public ParticleEmitterConfig[] method11253() {
		return aClass87Array7139;
	}

	@Override
	public void method11259() {
	}

	@Override
	void method11260() {
		if (aja7140.as > 1)
			synchronized (this) {
				while (aBool7023)
					try {
						wait();
					} catch (InterruptedException ignored) {
					}

				aBool7023 = true;
			}

	}

	@Override
	void method11261() {
		if (aja7140.as > 1)
			synchronized (this) {
				aBool7023 = false;
				notifyAll();
			}

	}

	@Override
	public void method11263(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		Matrix44 matrix44_4 = aja7140.nx().aClass384_51;
		matrix44_4.fromVarMatrix44(matrix44var_1);
		aa(matrix44_4.buf, i_2, bool_3);
	}

	@Override
	void method11268(int i_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
		J(nativeid, i_1, ints_2, i_3, i_4, i_5, i_6, bool_7);
	}

	@Override
	public void method11269(MeshRasterizer meshrasterizer_1, int i_2, int i_3, int i_4, boolean bool_5) {
		aja7140.nx().method313(this, meshrasterizer_1, i_2, i_3, i_4, bool_5);
	}

	@Override
	public boolean method11270(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		return aja7140.nx().method335(this, i_1, i_2, matrix44var_3, bool_4);
	}

	@Override
	public void method11273(Matrix44Var matrix44var_1) {
		method11604(ja.aa, matrix44var_1);
		int i_2 = 0;
		int i_3;
		if (aClass87Array7139 != null)
			for (i_3 = 0; i_3 < aClass87Array7139.length; i_3++) {
				ParticleEmitterConfig class87_4 = aClass87Array7139[i_3];
				class87_4.anInt844 = ja.aa[i_2++];
				class87_4.anInt841 = ja.aa[i_2++];
				class87_4.anInt847 = ja.aa[i_2++];
				class87_4.anInt834 = ja.aa[i_2++];
				class87_4.anInt843 = ja.aa[i_2++];
				class87_4.anInt845 = ja.aa[i_2++];
				class87_4.anInt846 = ja.aa[i_2++];
				class87_4.anInt840 = ja.aa[i_2++];
				class87_4.anInt848 = ja.aa[i_2++];
			}

		if (aClass172Array7142 != null)
			for (i_3 = 0; i_3 < aClass172Array7142.length; i_3++) {
				SurfaceSkin class172_6 = aClass172Array7142[i_3];
				SurfaceSkin class172_5 = class172_6;
				if (class172_6.aClass172_2114 != null)
					class172_5 = class172_6.aClass172_2114;

				if (class172_6.aClass384_2116 == null)
					class172_6.aClass384_2116 = new Matrix44();

				class172_6.aClass384_2116.fromVarMatrix44(matrix44var_1);
				class172_5.anInt2113 = ja.aa[i_2++];
				class172_5.anInt2117 = ja.aa[i_2++];
				class172_5.anInt2118 = ja.aa[i_2++];
			}

	}

	@Override
	public SurfaceSkin[] method11274() {
		return aClass172Array7142;
	}

	@Override
	void method11275(int i_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
		J(nativeid, i_1, ints_2, i_3, i_4, i_5, i_6, bool_7);
	}

	@Override
	public MeshRasterizer method11276(byte b_1, int i_2, boolean bool_3) {
		return aja7140.nx().method325(this, b_1, i_2, bool_3);
	}

	@Override
	public MeshRasterizer method11277(byte b_1, int i_2, boolean bool_3) {
		return aja7140.nx().method325(this, b_1, i_2, bool_3);
	}

	@Override
	public MeshRasterizer method11278(byte b_1, int i_2, boolean bool_3) {
		return aja7140.nx().method325(this, b_1, i_2, bool_3);
	}

	@Override
	public MeshRasterizer method11279(byte b_1, int i_2, boolean bool_3) {
		return aja7140.nx().method325(this, b_1, i_2, bool_3);
	}

	@Override
	public void method11282(Matrix44Var matrix44var_1, EntityNode_Sub5 class275_sub5_2, int i_3) {
		if (class275_sub5_2 == null)
			aja7140.nx().method314(this, matrix44var_1, null, i_3);
		else {
			ja.ae[5] = 0;
			aja7140.nx().method314(this, matrix44var_1, ja.ae, i_3);
			class275_sub5_2.anInt7847 = ja.ae[0];
			class275_sub5_2.anInt7848 = ja.ae[1];
			class275_sub5_2.anInt7850 = ja.ae[2];
			class275_sub5_2.anInt7846 = ja.ae[3];
			class275_sub5_2.anInt7851 = ja.ae[4];
			class275_sub5_2.aBool7849 = ja.ae[5] != 0;
		}

	}

	@Override
	public SurfaceSkin[] method11283() {
		return aClass172Array7142;
	}

	@Override
	void method11285() {
		if (aja7140.as > 1)
			synchronized (this) {
				aBool7023 = false;
				notifyAll();
			}

	}

	@Override
	public boolean method11286(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		return aja7140.nx().method335(this, i_1, i_2, matrix44var_3, bool_4);
	}

	@Override
	void method11288() {
		if (aja7140.as > 1)
			synchronized (this) {
				aBool7023 = false;
				notifyAll();
			}

	}

	@Override
	public MeshRasterizer method11289(byte b_1, int i_2, boolean bool_3) {
		return aja7140.nx().method325(this, b_1, i_2, bool_3);
	}

	@Override
	public void method11290(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		Matrix44 matrix44_4 = aja7140.nx().aClass384_51;
		matrix44_4.fromVarMatrix44(matrix44var_1);
		aa(matrix44_4.buf, i_2, bool_3);
	}

	@Override
	public void method11291(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		Matrix44 matrix44_4 = aja7140.nx().aClass384_51;
		matrix44_4.fromVarMatrix44(matrix44var_1);
		aa(matrix44_4.buf, i_2, bool_3);
	}

	@Override
	public void method11292(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		Matrix44 matrix44_4 = aja7140.nx().aClass384_51;
		matrix44_4.fromVarMatrix44(matrix44var_1);
		aa(matrix44_4.buf, i_2, bool_3);
	}

	@Override
	public void method11293(Matrix44Var matrix44var_1, EntityNode_Sub5 class275_sub5_2, int i_3) {
		if (class275_sub5_2 == null)
			aja7140.nx().method314(this, matrix44var_1, null, i_3);
		else {
			ja.ae[5] = 0;
			aja7140.nx().method314(this, matrix44var_1, ja.ae, i_3);
			class275_sub5_2.anInt7847 = ja.ae[0];
			class275_sub5_2.anInt7848 = ja.ae[1];
			class275_sub5_2.anInt7850 = ja.ae[2];
			class275_sub5_2.anInt7846 = ja.ae[3];
			class275_sub5_2.anInt7851 = ja.ae[4];
			class275_sub5_2.aBool7849 = ja.ae[5] != 0;
		}

	}

	@Override
	public void method11294(Matrix44Var matrix44var_1) {
		method11604(ja.aa, matrix44var_1);
		int i_2 = 0;
		int i_3;
		if (aClass87Array7139 != null)
			for (i_3 = 0; i_3 < aClass87Array7139.length; i_3++) {
				ParticleEmitterConfig class87_4 = aClass87Array7139[i_3];
				class87_4.anInt844 = ja.aa[i_2++] * -1929058355 * -75866875;
				class87_4.anInt841 = ja.aa[i_2++] * 996785411 * 1618253227;
				class87_4.anInt847 = ja.aa[i_2++] * 976806429 * -489230283;
				class87_4.anInt834 = ja.aa[i_2++] * -458323579 * 1747322701;
				class87_4.anInt843 = ja.aa[i_2++] * 543149547 * -174394685;
				class87_4.anInt845 = ja.aa[i_2++] * 1054448197 * 305293453;
				class87_4.anInt846 = ja.aa[i_2++] * 1348028043 * 1878552867;
				class87_4.anInt840 = ja.aa[i_2++] * -1652520905 * 950906247;
				class87_4.anInt848 = ja.aa[i_2++] * 1757672349 * -1923011915;
			}

		if (aClass172Array7142 != null)
			for (i_3 = 0; i_3 < aClass172Array7142.length; i_3++) {
				SurfaceSkin class172_6 = aClass172Array7142[i_3];
				SurfaceSkin class172_5 = class172_6;
				if (class172_6.aClass172_2114 != null)
					class172_5 = class172_6.aClass172_2114;

				if (class172_6.aClass384_2116 == null)
					class172_6.aClass384_2116 = new Matrix44();

				class172_6.aClass384_2116.fromVarMatrix44(matrix44var_1);
				class172_5.anInt2113 = ja.aa[i_2++] * 959663283 * -48479621;
				class172_5.anInt2117 = ja.aa[i_2++] * -1084180847 * 1018284657;
				class172_5.anInt2118 = ja.aa[i_2++] * -1221574613 * 1898872451;
			}

	}

	@Override
	public void method11295() {
	}

	@Override
	public MeshRasterizer method11296(byte b_1, int i_2, boolean bool_3) {
		return aja7140.nx().method325(this, b_1, i_2, bool_3);
	}

	@Override
	public void method11298(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		Matrix44 matrix44_4 = aja7140.nx().aClass384_51;
		matrix44_4.fromVarMatrix44(matrix44var_1);
		aa(matrix44_4.buf, i_2, bool_3);
	}

	@Override
	public void method11299(MeshRasterizer meshrasterizer_1, int i_2, int i_3, int i_4, boolean bool_5) {
		aja7140.nx().method313(this, meshrasterizer_1, i_2, i_3, i_4, bool_5);
	}

	@Override
	public ParticleEmitterConfig[] method11300() {
		return aClass87Array7139;
	}

	@Override
	void method11301() {
		if (aja7140.as > 1)
			synchronized (this) {
				while (aBool7023)
					try {
						wait();
					} catch (InterruptedException ignored) {
					}

				aBool7023 = true;
			}

	}

	@Override
	public SurfaceSkin[] method11302() {
		return aClass172Array7142;
	}

	@Override
	public boolean method11303() {
		return true;
	}

	@Override
	public void method11307(byte b_1, byte[] bytes_2) {
		IA(b_1, bytes_2);
	}

	@Override
	void method11308() {
		if (aja7140.as > 1)
			synchronized (this) {
				while (aBool7023)
					try {
						wait();
					} catch (InterruptedException ignored) {
					}

				aBool7023 = true;
			}

	}

	@Override
	public boolean method11309(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		return aja7140.nx().method335(this, i_1, i_2, matrix44var_3, bool_4);
	}

	@Override
	public void method11312(byte b_1, byte[] bytes_2) {
		IA(b_1, bytes_2);
	}

	@Override
	public void method11315(Matrix44Var matrix44var_1) {
		method11604(ja.aa, matrix44var_1);
		int i_2 = 0;
		int i_3;
		if (aClass87Array7139 != null)
			for (i_3 = 0; i_3 < aClass87Array7139.length; i_3++) {
				ParticleEmitterConfig class87_4 = aClass87Array7139[i_3];
				class87_4.anInt844 = ja.aa[i_2++] * -1929058355 * -75866875;
				class87_4.anInt841 = ja.aa[i_2++] * 996785411 * 1618253227;
				class87_4.anInt847 = ja.aa[i_2++] * 976806429 * -489230283;
				class87_4.anInt834 = ja.aa[i_2++] * -458323579 * 1747322701;
				class87_4.anInt843 = ja.aa[i_2++] * 543149547 * -174394685;
				class87_4.anInt845 = ja.aa[i_2++] * 1054448197 * 305293453;
				class87_4.anInt846 = ja.aa[i_2++] * 1348028043 * 1878552867;
				class87_4.anInt840 = ja.aa[i_2++] * -1652520905 * 950906247;
				class87_4.anInt848 = ja.aa[i_2++] * 1757672349 * -1923011915;
			}

		if (aClass172Array7142 != null)
			for (i_3 = 0; i_3 < aClass172Array7142.length; i_3++) {
				SurfaceSkin class172_6 = aClass172Array7142[i_3];
				SurfaceSkin class172_5 = class172_6;
				if (class172_6.aClass172_2114 != null)
					class172_5 = class172_6.aClass172_2114;

				if (class172_6.aClass384_2116 == null)
					class172_6.aClass384_2116 = new Matrix44();

				class172_6.aClass384_2116.fromVarMatrix44(matrix44var_1);
				class172_5.anInt2113 = ja.aa[i_2++] * 959663283 * -48479621;
				class172_5.anInt2117 = ja.aa[i_2++] * -1084180847 * 1018284657;
				class172_5.anInt2118 = ja.aa[i_2++] * -1221574613 * 1898872451;
			}

	}

	@Override
	public SurfaceSkin[] method11331() {
		return aClass172Array7142;
	}

	void method11604(int[] ints_1, Matrix44Var matrix44var_2) {
		aja7140.nx().method331(this, ints_1, matrix44var_2);
	}

	@Override
	public native int n();

	@Override
	public native int N();

	@Override
	public native int o();

	@Override
	public native void oa(int var1, int var2, int var3);

	@Override
	public native void p(int var1);

	@Override
	public native void pa(int var1, int var2, Ground var3, Ground var4, int var5, int var6, int var7);

	@Override
	public native void PA(int var1, int var2, int var3, int var4);

	@Override
	public native void Q(int var1);

	@Override
	public native int RA();

	@Override
	public native void S(int var1);

	@Override
	public boolean successful() {
		return true;
	}

	@Override
	public native void t(int var1);

	@Override
	public native boolean u();

	native void U(ja var1, ba var2, int var3, int var4, int[] var5, int[] var6, int[] var7, int[] var8, short[] var9, int var10, short[] var11, short[] var12, short[] var13, byte[] var14, byte[] var15, byte[] var16, byte[] var17, short[] var18, short[] var19, int[] var20, byte var21, short[] var22, int var23, byte[] var24, short[] var25, short[] var26, short[] var27, int[] var28, int[] var29, int[] var30, byte[] var31, byte[] var32, int[] var33, int[] var34, int[] var35, int[] var36, int var37, int var38, int var39, int var40, int var41, int var42, int[] var43);

	@Override
	native void w(int var1, int var2, int var3, int var4);

	@Override
	public native void W(short var1, short var2);

	@Override
	public native void wa();

	@Override
	public native void x(boolean var1);

	@Override
	public native void X(short var1, short var2);

	@Override
	public native void y(boolean var1);

	@Override
	public native int ya();

	@Override
	public native int YA();

	@Override
	public native int Z();

}
