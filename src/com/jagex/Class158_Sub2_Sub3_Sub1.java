package com.jagex;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class158_Sub2_Sub3_Sub1 extends Class158_Sub2_Sub3 {

	Image anImage10450;

	void method15632(byte b_1) {
		super.method15632((byte) -7);
		DataBufferInt databufferint_2 = new DataBufferInt(this.anIntArray10240, this.anIntArray10240.length);
		DirectColorModel directcolormodel_3 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster_4 = Raster.createWritableRaster(directcolormodel_3.createCompatibleSampleModel(this.anInt10238, this.anInt10239), databufferint_2, (Point) null);
		this.anImage10450 = new BufferedImage(directcolormodel_3, writableraster_4, false, new Hashtable());
	}

	public int method14344() {
		return this.method14353(0, 0);
	}

	public final int method14353(int i_1, int i_2) {
		Graphics graphics_3 = this.aCanvas10241.getGraphics();
		graphics_3.drawImage(this.anImage10450, i_1, i_2, this.aCanvas10241);
		return 0;
	}

	public void method212() {
	}

	public int method14346() {
		return this.method14353(0, 0);
	}

	public int method14349() {
		return this.method14353(0, 0);
	}

	public int method14350() {
		return this.method14353(0, 0);
	}

	public final int method14351(int i_1, int i_2) {
		Graphics graphics_3 = this.aCanvas10241.getGraphics();
		graphics_3.drawImage(this.anImage10450, i_1, i_2, this.aCanvas10241);
		return 0;
	}

	public void method186() {
	}

	public final int method14352(int i_1, int i_2) {
		Graphics graphics_3 = this.aCanvas10241.getGraphics();
		graphics_3.drawImage(this.anImage10450, i_1, i_2, this.aCanvas10241);
		return 0;
	}

	public final int method14345(int i_1, int i_2) {
		Graphics graphics_3 = this.aCanvas10241.getGraphics();
		graphics_3.drawImage(this.anImage10450, i_1, i_2, this.aCanvas10241);
		return 0;
	}

	Class158_Sub2_Sub3_Sub1(HardwareRenderer hardwarerenderer_1, Canvas canvas_2, int i_3, int i_4) {
		super(hardwarerenderer_1, canvas_2, i_3, i_4);
		new Rectangle();
		this.method15632((byte) -46);
	}

}
