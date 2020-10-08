package com.jagex;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public class Class158_Sub2_Sub3_Sub1 extends Class158_Sub2_Sub3 {

    Image anImage10450;

    Class158_Sub2_Sub3_Sub1(JavaRenderer hardwarerenderer_1, Canvas canvas_2, int i_3, int i_4) {
        super(hardwarerenderer_1, canvas_2, i_3, i_4);
        new Rectangle();
        method15632();
    }

    @Override
    void method15632() {
        super.method15632();
        DataBufferInt databufferint_2 = new DataBufferInt(anIntArray10240, anIntArray10240.length);
        DirectColorModel directcolormodel_3 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster writableraster_4 = Raster.createWritableRaster(directcolormodel_3.createCompatibleSampleModel(anInt10238, anInt10239), databufferint_2, null);
        anImage10450 = new BufferedImage(directcolormodel_3, writableraster_4, false, new Hashtable());
    }

    @Override
    public int method14344() {
        return method14353(0, 0);
    }

    @Override
    public int method14353(int i_1, int i_2) {
        Graphics graphics_3 = aCanvas10241.getGraphics();
        graphics_3.drawImage(anImage10450, i_1, i_2, aCanvas10241);
        return 0;
    }

    @Override
    public void method212() {
    }

    @Override
    public int method14346() {
        return method14353(0, 0);
    }

    @Override
    public int method14349() {
        return method14353(0, 0);
    }

    @Override
    public int method14350() {
        return method14353(0, 0);
    }

    @Override
    public int method14351(int i_1, int i_2) {
        Graphics graphics_3 = aCanvas10241.getGraphics();
        graphics_3.drawImage(anImage10450, i_1, i_2, aCanvas10241);
        return 0;
    }

    @Override
    public void method186() {
    }

    @Override
    public int method14352(int i_1, int i_2) {
        Graphics graphics_3 = aCanvas10241.getGraphics();
        graphics_3.drawImage(anImage10450, i_1, i_2, aCanvas10241);
        return 0;
    }

    @Override
    public int method14345(int i_1, int i_2) {
        Graphics graphics_3 = aCanvas10241.getGraphics();
        graphics_3.drawImage(anImage10450, i_1, i_2, aCanvas10241);
        return 0;
    }

}
