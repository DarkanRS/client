package com.rs.jagex;

import java.awt.Canvas;
import java.awt.Dimension;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class AbstractRenderer {

	static boolean[] aBoolArray5839 = new boolean[8];
	public static AbstractRenderer createRenderer(int renderType, Canvas canvas, ImageLoader imageLoader, Index shaderIndex, int i_4) {
		int width = 0;
		int height = 0;
		if (canvas != null) {
			Dimension dimension = canvas.getSize();
			width = dimension.width;
			height = dimension.height;
		}
		return createRenderer(renderType, canvas, imageLoader, shaderIndex, i_4, width, height);
	}
	static synchronized AbstractRenderer createRenderer(int type, Canvas canvas, ImageLoader imageLoader, Index shaderIndex, int i_4, int width, int height) {
		if (type == 0)
			return JavaRenderer.create(canvas, imageLoader, width, height); //safe mode renderer
			if (type == 2)
				return ja.create(canvas, imageLoader, width, height); //jagex sw3d software renderer
			else if (type == 1)
				return OpenGLRenderer.create(canvas, imageLoader, i_4); //hardware accellerated opengl renderer
			else if (type == 5)
				return JAGGLRenderer.create(canvas, imageLoader, shaderIndex, i_4); //jagex gl library renderer
			else if (type == 3)
				return DirectXRenderer.create(canvas, imageLoader, shaderIndex, i_4); //directx renderer
			else
				throw new IllegalArgumentException("");
	}
	static void method8695(EntityNode_Sub2 class275_sub2_0) {
		class275_sub2_0.aTransform_Sub1_Sub1_Sub2_7739 = null;
		if (EntityNode_Sub2.anInt7741 < 20) {
			EntityNode_Sub2.aClass457_7745.offer(class275_sub2_0);
			++EntityNode_Sub2.anInt7741;
		}
	}
	public static int method8696(CharSequence charsequence_0) {
		int i_2 = charsequence_0.length();
		int i_3 = 0;
		for (int i_4 = 0; i_4 < i_2; i_4++)
			i_3 = (i_3 << 5) - i_3 + QuestIndexLoader.getByteForChar(charsequence_0.charAt(i_4));
		return i_3;
	}
	public static MenuActionEvent method8697() {
		return CutsceneAction_Sub23.aCacheableNode_Sub7_9445;
	}
	static CS2Script method8699(byte[] bytes_0) {
		return new CS2Script(new ByteBuf(bytes_0));
	}
	public ImageLoader textureCache;

	public int rendererId;

	protected Class158 aClass158_5853;


	protected Class158_Sub2 aClass158_Sub2_5841;

	protected Hashtable<Canvas, Class158_Sub2> mapCanvasToTBD = new Hashtable<>();

	int anInt5854 = -1;

	Class158_Sub1[] aClass158_Sub1Array5833 = new Class158_Sub1[4];

	AbstractRenderer(ImageLoader interface22_1) {
		textureCache = interface22_1;
		int i_2 = -1;
		for (int i_3 = 0; i_3 < 8; i_3++)
			if (!aBoolArray5839[i_3]) {
				aBoolArray5839[i_3] = true;
				i_2 = i_3;
				break;
			}
		if (i_2 == -1)
			throw new IllegalStateException("");
		rendererId = i_2;
	}

	public abstract int[] ab(int var1, int var2, int var3, int var4);

	public abstract void B(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void ba(int var1, int var2);

	public abstract void c(int var1, int var2, int var3);

	abstract void CA(int var1, int var2, int var3, int var4);

	public abstract FontRenderer createFont(FontMetrics var1, SpriteDefinitions[] var2, boolean var3);

	public abstract Ground createGround(int var1, int var2, int[][] var3, int[][] var4, int var6, int var7);

	public abstract MeshRasterizer createMeshRasterizer(RSMesh var1, int var2, int var3, int var4, int var5);

	public NativeSprite createNativeSprite(int[] ints_1, int i_3, int i_4, int i_5) {
		return method8442(ints_1, 0, i_3, i_4, i_5, true);
	}

	public abstract void DA(Class455 var2, int var3, int var4);

	public abstract int dd();

	public abstract int df();

	public abstract int di();

	public abstract int dv();

	public abstract void eh();

	public abstract void ej(float var1, float var2);

	public abstract void en(float var1, float var2);

	public abstract void eq(boolean var1);

	public abstract void ez();

	public abstract void fb(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void fc(int var1, int var2, int var3, int var4);

	public abstract void fd(int var1, int var2);

	public abstract void fe(int var1, int var2, int var3, int var4);

	public abstract void ff(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

	public abstract void fh(int[] var1);

	public abstract void fi(int var1, int var2);

	@Override
	protected void finalize() {
		method8396();
	}

	public abstract void fk(int var1, int var2, int var3, int var4);

	public abstract void fl(int var1, int var2, int var3, int var4, int var5);

	public abstract void fm(int var1, int var2, int var3, int var4);

	public abstract void fo(int var1, int var2, int var3, int var4, int var5);

	public abstract void fp(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void fq(int var1, int var2, int var3, int var4, int var5);

	abstract void fr(int var1, int var2, int var3, int var4, int var5);

	public abstract void fs(int var1, int var2, int var3, int var4, int var5);

	public abstract void ft(int[] var1);

	public abstract void fu(int var1, int var2);

	public abstract void fv(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

	abstract void fw(int var1, int var2, int var3, int var4, int var5);

	public abstract void G(int var1, int var2, int var3, int var4, int var5);

	public abstract void GA();

	public abstract void hi(int var1, Class455 var2, int var3, int var4);

	public abstract void hr(int var1, Class455 var2, int var3, int var4);

	public abstract void hz(int var1, Class455 var2, int var3, int var4);

	public abstract void IA(float var1);

	public abstract void ib(int var1, int var2, int var3);

	public abstract void ii(int var1);

	public abstract void ik(int var1, int var2, int var3);

	public abstract void il(int var1);

	public abstract void im(int var1, float var2, float var3, float var4, float var5, float var6);

	public abstract void in(float var1);

	public abstract void iq(int var1);

	public abstract void is(int var1, int var2, int var3);

	public abstract void iw(int var1, float var2, float var3, float var4, float var5, float var6);

	public abstract void iz(float var1);

	public abstract void J();

	public abstract void jf();

	public abstract int[] ke(int var1, int var2, int var3, int var4);

	public abstract int[] kf(int var1, int var2, int var3, int var4);

	public abstract int[] kh(int var1, int var2, int var3, int var4);

	public abstract void L();

	public abstract void m(int var1, float var2, float var3, float var4, float var5, float var6);

	public abstract RendererInfo method8392();

	public void method8393() throws Exception_Sub3 {
		method8555();
	}

	public abstract void method8394(int var1, GLLight[] var2);

	public abstract void method8395();

	public void method8396() {
		aBoolArray5839[rendererId] = false;
		Enumeration<Canvas> enumeration_2 = mapCanvasToTBD.keys();
		while (enumeration_2.hasMoreElements()) {
			Canvas canvas_3 = enumeration_2.nextElement();
			Class158_Sub2 class158_sub2_4 = mapCanvasToTBD.get(canvas_3);
			class158_sub2_4.method212();
		}
		method8397();
	}

	abstract void method8397();

	public abstract void method8398(int var1);

	public abstract boolean method8399();

	public abstract Class152 method8400(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract boolean method8402();

	public abstract boolean method8403();

	public abstract boolean method8404();

	public abstract boolean method8405();

	public abstract boolean method8406();

	public abstract boolean method8407();

	public void method8408(int[] ints_1) {
		if (aClass158_Sub2_5841 != null) {
			ints_1[0] = aClass158_Sub2_5841.getWidth();
			ints_1[1] = aClass158_Sub2_5841.getHeight();
		} else {
			ints_1[1] = 0;
			ints_1[0] = 0;
		}
	}

	public void method8410(Canvas canvas_1) {
		if (mapCanvasToTBD.containsKey(canvas_1)) {
			Class158_Sub2 class158_sub2_3 = mapCanvasToTBD.get(canvas_1);
			class158_sub2_3.method212();
			mapCanvasToTBD.remove(canvas_1);
		}
	}

	void method8411(Canvas canvas_1, Class158_Sub2 class158_sub2_2) {
		if (class158_sub2_2 == null)
			throw new RuntimeException();
		mapCanvasToTBD.put(canvas_1, class158_sub2_2);
	}

	public void method8412(Canvas canvas_1) {
		Class158_Sub2 class158_sub2_3 = mapCanvasToTBD.get(canvas_1);
		if (class158_sub2_3 == null)
			throw new RuntimeException();
		if (anInt5854 <= 0 && aClass158_Sub2_5841 == aClass158_5853) {
			if (aClass158_5853 != null)
				aClass158_5853.method2718();
			if (anInt5854 < 0)
				aClass158_5853 = class158_sub2_3;
			aClass158_Sub2_5841 = class158_sub2_3;
			class158_sub2_3.method213();
		} else
			throw new RuntimeException();
	}

	public void method8414(Canvas canvas_1, int i_2, int i_3) {
		Class158_Sub2 class158_sub2_5 = mapCanvasToTBD.get(canvas_1);
		if (class158_sub2_5 == null)
			throw new RuntimeException();
		class158_sub2_5.method14354(i_2, i_3);
	}

	public abstract void method8415(int var1, int var2, int var3, int var4, int var5, int var6);

	public void method8416(Class158_Sub1 class158_sub1_1) {
		if ((anInt5854 < 0) || (class158_sub1_1 != aClass158_Sub1Array5833[anInt5854]))
			throw new RuntimeException();
		aClass158_Sub1Array5833[--anInt5854 + 1] = null;
		class158_sub1_1.method2718();
		if (anInt5854 >= 0) {
			aClass158_5853 = aClass158_Sub1Array5833[anInt5854];
			aClass158_Sub1Array5833[anInt5854].method213();
		} else {
			aClass158_5853 = aClass158_Sub2_5841;
			aClass158_Sub2_5841.method213();
		}
	}

	abstract Class158_Sub2 method8417(Canvas var1, int width, int height);

	public abstract Class158_Sub1 method8418();

	public abstract Interface8 method8419(int var1, int var2);

	public abstract void method8420();

	public abstract void method8421();

	public abstract void method8423(Matrix44Var var1);

	public abstract void method8424(Matrix44 var1);

	public void method8425(int i_1, int i_2, int i_3, int i_4, int i_5) {
		B(i_1, i_2, i_3, i_4, i_5, 1);
	}

	public abstract void method8426(int var1, GLLight[] var2);

	public abstract Class455 method8427(int var1, int var2, int[] var3, int[] var4);

	public void method8428(int i_1, int i_2, int i_3, int i_4) {
		G(i_1, i_2, i_3, i_4, 1);
	}

	public void method8429(int i_1, int i_2, int i_3, int i_4, int i_5) {
		method8433(i_1, i_2, i_3, i_4, i_5, 1);
	}

	public abstract void method8430(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract boolean method8431();

	public abstract void method8433(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract int method8434(int var1, int var2);

	public abstract void method8435(int var1, int var2, int var3, int var4, int var5, int var7, int var8, int var9);

	public abstract int method8437(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract Node_Sub1 method8438(int var1);

	public abstract void method8439(Node_Sub1 var1);

	public NativeSprite method8440(int i_1, int i_2) {
		return method8654(i_1, i_2, true, false);
	}

	public abstract NativeSprite method8442(int[] var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract int method8443(int var1, int var2);

	public abstract NativeSprite method8444(SpriteDefinitions var1, boolean var2);

	public abstract void method8445();

	public abstract void method8446(Matrix44 var1);

	public abstract Matrix44 method8449();

	public abstract Matrix44Var method8450();

	public abstract int method8452(int var1, int var2);

	public abstract Matrix44 method8453();

	public abstract boolean method8454();

	public boolean method8455() {
		return true;
	}

	public abstract void method8456(Class151 var1);

	public abstract void method8457(Matrix44Var var1);

	public abstract Matrix44Var method8458();

	public abstract void method8459();

	Class158_Sub2 method8460() {
		return aClass158_Sub2_5841;
	}

	public abstract NativeSprite method8461(int var1, int var2, boolean var3, boolean var4);

	public abstract boolean method8462();

	public abstract int method8463();

	public abstract boolean method8464();

	public abstract boolean method8465();

	public abstract Class152 method8466(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract Class152 method8467(Class152 var1, Class152 var2, float var3, Class152 var4);

	public void method8468(int i_1, int i_2, int i_3, int i_4) {
		CA(i_1, i_2, i_3, i_4);
	}

	public abstract boolean method8469();

	public abstract boolean method8471();

	public void method8472(float f_1, float f_2, float f_3) {
		method8592(f_1, f_2, f_3);
	}

	public abstract void method8474();

	public abstract void method8475(HDWaterTile var2);

	public abstract void method8476(int var1, HDWaterTile var2);

	public abstract void method8477(Class152 var1);

	public abstract void method8479(float var1, float var2, float var3, float[] var4);

	public abstract void method8480();

	public abstract RendererInfo method8481();

	public abstract void method8483();

	public abstract void method8484();

	abstract void method8485();

	abstract void method8486();

	public abstract void method8487(int var1);

	public abstract void method8488(int var1);

	public abstract boolean method8489();

	public abstract void method8490();

	public abstract void method8491();

	public abstract boolean method8492();

	public abstract void method8494(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

	public abstract boolean method8495();

	public abstract void method8496(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

	public abstract void method8497();

	public abstract boolean method8498();

	public abstract boolean method8501();

	public abstract boolean method8502();

	public abstract boolean method8503();

	public abstract boolean method8504();

	public abstract MeshRasterizer method8505(RSMesh var1, int var2, int var3, int var4, int var5);

	public abstract void method8507();

	public abstract void method8511(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void method8513(int var1, int var2, int var3, int var4);

	public abstract void method8514(int var1, int var2, int var3, int var4);

	public abstract void method8515(float var1, float var2, float var3, float[] var4);

	public abstract void method8516(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13);

	public abstract Matrix44 method8517();

	public abstract NativeSprite method8518(SpriteDefinitions var1, boolean var2);

	public abstract void method8519(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void method8520(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void method8521();

	public Class158 method8523() {
		return aClass158_5853;
	}

	public void method8524(Canvas canvas_1, int width, int height) {
		if (!mapCanvasToTBD.containsKey(canvas_1)) {
			Class459.method7679(canvas_1);
			method8411(canvas_1, method8417(canvas_1, width, height));
		}
	}

	public abstract void method8525(int var3, int var4);

	public abstract void method8526(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract void method8527(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

	public abstract boolean method8528();

	public abstract void method8529(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

	public abstract void method8530(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9);

	abstract void method8531();

	public abstract void method8532(int var1, int var2, int var3, int var4, int var5, int var6, Class455 var7, int var8, int var9);

	public abstract void method8533(int var1, int var2, int var3, int var4, int var5, int var6, Class455 var7, int var8, int var9);

	public abstract void method8535(int var1, int var2, int var3, int var4, int var5, int var6, Class455 var7, int var8, int var9, int var10, int var11, int var12);

	public abstract void method8536(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

	public abstract int method8537(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract int method8538(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract int method8539(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract int method8540(int var1, int var2, int var3, int var4, int var5, int var6);

	public abstract Node_Sub1 method8541(int var1);

	public abstract void method8542(Node_Sub1 var1);

	public abstract NativeSprite method8543(int[] var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract void method8544(Node_Sub1 var1);

	public abstract int method8546(int var1, int var2);

	public abstract void method8547(int var1, GLLight[] var2);

	public abstract NativeSprite method8548(int[] var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract NativeSprite method8552(int var1, int var2, int var3, int var4, boolean var5);

	public abstract Class455 method8553(int var1, int var2, int[] var3, int[] var4);

	public abstract Class455 method8554(int var1, int var2, int[] var3, int[] var4);

	abstract void method8555() throws Exception_Sub3;

	public abstract Class455 method8556(int var1, int var2, int[] var3, int[] var4);

	public abstract Class152 method8557(Class152 var1, Class152 var2, float var3, Class152 var4);

	abstract Class158_Sub2 method8558(Canvas var1, int var2, int var3);

	public abstract void method8559(int var1);

	public abstract void method8560(int var1);

	public abstract MeshRasterizer method8561(RSMesh var1, int var2, int var3, int var4, int var5);

	public void method8562(int i_1, int i_2, int i_3, int i_4, int i_5) {
		method8430(i_1, i_2, i_3, i_4, i_5, 1);
	}

	public abstract void method8563(int var1, int var2, int var3, int var4, int var5, Class455 var7, int var8, int var9, int var10, int var11, int var12);

	public abstract MeshRasterizer method8564(RSMesh var1, int var2, int var3, int var4, int var5);

	public abstract int method8565(int var1, int var2);

	public abstract int method8566(int var1, int var2);

	public abstract int method8567(int var1, int var2);

	public abstract void method8568();

	public abstract Ground method8569(int var1, int var2, int[][] var3, int[][] var4, int var5, int var6, int var7);

	public abstract Node_Sub1 method8570(int var1);

	public abstract Matrix44 method8571();

	public abstract Matrix44Var method8572();

	public abstract void method8573(float var1, float var2, float var3, float[] var4);

	public abstract int method8574();

	public abstract void method8575(int var1, int var2, int var3, int var4, int var5, int var6, Class455 var7, int var8, int var9);

	public abstract void method8576(int var1, int var2, int var3, int var4, int var5, int var6, Class455 var7, int var8, int var9);

	public abstract NativeSprite method8577(int var1, int var2, boolean var3, boolean var4);

	public abstract boolean method8578();

	public abstract void method8579(int var1, GLLight[] var2);

	public abstract void method8580(Class151 var1);

	public abstract void method8581(Class151 var1);

	public abstract Matrix44Var method8583();

	public abstract void method8584(Class152 var1);

	public abstract void method8585(int var1, HDWaterTile var2);

	public abstract void method8586(Matrix44 var1);

	public abstract Matrix44 method8587();

	public abstract Matrix44 method8588();

	public abstract Matrix44 method8589();

	public abstract Matrix44 method8590();

	abstract void method8592(float var1, float var2, float var3);

	public GLLight method8593(int i_1, int i_2, int i_3, int i_4, int i_5) {
		return new GLLight(i_1, i_2, i_3, i_4, i_5);
	}

	public abstract void method8594(boolean var1);

	public abstract void method8595(boolean var1);

	abstract void method8596(int var1, int var2) throws Exception_Sub3;

	public abstract void method8598(Class152 var1);

	public abstract boolean method8599();

	public abstract boolean method8600();

	public abstract void method8601();

	public abstract void method8602();

	public abstract void method8603(int var1, int var2, int var3, int var4);

	public abstract NativeSprite method8604(int var1, int var2, int var3, int var4, boolean var5);

	public abstract boolean method8605();

	public abstract boolean method8606();

	public abstract boolean method8607();

	abstract void method8608(float var1, float var2, float var3, float var6);

	public abstract boolean method8609();

	public abstract void method8611();

	public abstract NativeSprite method8612(SpriteDefinitions var1, boolean var2);

	public abstract void method8613();

	public abstract boolean method8614();

	public abstract void method8615(int var1, HDWaterTile var2);

	public abstract void method8616(int var1, HDWaterTile var2);

	public abstract void method8617(int var1, int var2, int var3, int var4);

	public abstract void method8618(Node_Sub1 var1);

	public abstract void method8619(float var1, float var2, float var3, float[] var4);

	public abstract Class158_Sub1 method8620();

	public abstract Interface8 method8621(int var1, int var2);

	public abstract MeshRasterizer method8623(RSMesh var1, int var2, int var3, int var4, int var5);

	public abstract Class455 method8624(int var1, int var2, int[] var3, int[] var4);

	public abstract FontRenderer method8625(FontMetrics var1, SpriteDefinitions[] var2, boolean var3);

	public abstract Matrix44Var method8626();

	public abstract void method8627(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13);

	public abstract boolean method8628();

	public abstract void method8629(int var1, int var2, float var3, int var4, int var5, float var6, int var7, int var8, float var9, int var10, int var11, int var12, int var13);

	public abstract int method8630(int var1, int var2);

	public abstract int method8632(int var1, int var2);

	public abstract void method8633();

	public abstract void method8634();

	public abstract void method8635();

	public abstract Class152 method8636(int var1, int var2, int var3, int var4, int var5, int var6);

	public void method8637(Class158_Sub1 class158_sub1_1) {
		if (anInt5854 >= 3)
			throw new RuntimeException();
		if (anInt5854 >= 0)
			aClass158_Sub1Array5833[anInt5854].method2718();
		else
			aClass158_Sub2_5841.method2718();
		aClass158_5853 = aClass158_Sub1Array5833[++anInt5854] = class158_sub1_1;
		class158_sub1_1.method213();
	}

	public abstract boolean method8644();

	public abstract boolean method8649();

	public abstract void method8650(float var1, float var2, float var3, float[] var4);

	public abstract NativeSprite method8654(int var1, int var2, boolean var3, boolean var4);

	public abstract void method8658();

	public void method8659(int i_1, int i_2, int i_3, int i_4) {
		XA(i_1, i_2, i_3, i_4, 1);
	}

	public abstract FontRenderer method8660(FontMetrics var1, SpriteDefinitions[] var2, boolean var3);

	public abstract boolean method8664();

	public abstract NativeSprite method8668(int var1, int var2, int var3, int var4, boolean var5);

	public abstract void method8669(int var1, int var2, int var3, int var4, int var5, Class455 var7, int var8, int var9);

	public abstract void method8673(int var1, int var2, int var3, int var4);

	public abstract boolean method8674();

	public abstract boolean method8679();

	public abstract Matrix44Var method8685();

	public abstract void method8691();

	public abstract void N(int var1, int var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9);

	public abstract void o(int var1, int var2, int var3, int var4);

	public abstract void O();

	public abstract void qa(int[] var1);

	public abstract void r(int var1, int var2, int var3, int var4);

	public abstract void RA(boolean var1);

	public abstract void XA(int var1, int var2, int var3, int var4, int var5);

	public abstract int za();
}
