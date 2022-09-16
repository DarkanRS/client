package com.jagex;

public interface ImageLoader {

	TextureDetails getTextureDetails(int var1);

	boolean loadTexture(int var1);

	void method161();

	int method84();

	float[] renderMaterialPixelsF(int var1, int var3, int var4);

	int[] renderMaterialPixelsI(int var1, int var3, int var4);

	int[] renderTexturePixels(int var1, float var2, int var3, int var4, boolean var5);

}
