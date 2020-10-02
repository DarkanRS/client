package com.jagex;

public interface ImageLoader {

    boolean loadTexture(int var1);

    int[] renderTexturePixels(int var1, float var2, int var3, int var4, boolean var5);

    int[] renderMaterialPixelsI(int var1, int var3, int var4);

    int method84();

    TextureDetails getTextureDetails(int var1);

    float[] renderMaterialPixelsF(int var1, int var3, int var4);

    void method161();

}
