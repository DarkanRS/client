
/* Class158_Sub2_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class Class158_Sub2_Sub3_Sub1 extends Class158_Sub2_Sub3 {
	Image anImage10450;

	void method15637() {
		super.method15632((byte) -20);
		DataBufferInt databufferint = new DataBufferInt((((Class158_Sub2_Sub3_Sub1) this).anIntArray10240), (((Class158_Sub2_Sub3_Sub1) this).anIntArray10240).length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = (Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(-1977580999 * ((Class158_Sub2_Sub3_Sub1) this).anInt10238, 2033125333 * ((Class158_Sub2_Sub3_Sub1) this).anInt10239)), databufferint, null));
		((Class158_Sub2_Sub3_Sub1) this).anImage10450 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	void method15632(byte i) {
		super.method15632((byte) -7);
		DataBufferInt databufferint = new DataBufferInt((((Class158_Sub2_Sub3_Sub1) this).anIntArray10240), (((Class158_Sub2_Sub3_Sub1) this).anIntArray10240).length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = (Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(-1977580999 * ((Class158_Sub2_Sub3_Sub1) this).anInt10238, 2033125333 * ((Class158_Sub2_Sub3_Sub1) this).anInt10239)), databufferint, null));
		((Class158_Sub2_Sub3_Sub1) this).anImage10450 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	public int method14344() {
		return method14353(0, 0);
	}

	public final int method14353(int i, int i_0_) {
		Graphics graphics = ((Class158_Sub2_Sub3_Sub1) this).aCanvas10241.getGraphics();
		graphics.drawImage(((Class158_Sub2_Sub3_Sub1) this).anImage10450, i, i_0_, ((Class158_Sub2_Sub3_Sub1) this).aCanvas10241);
		return 0;
	}

	public void method212() {
		/* empty */
	}

	void method15636() {
		super.method15632((byte) 63);
		DataBufferInt databufferint = new DataBufferInt((((Class158_Sub2_Sub3_Sub1) this).anIntArray10240), (((Class158_Sub2_Sub3_Sub1) this).anIntArray10240).length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = (Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(-1977580999 * ((Class158_Sub2_Sub3_Sub1) this).anInt10238, 2033125333 * ((Class158_Sub2_Sub3_Sub1) this).anInt10239)), databufferint, null));
		((Class158_Sub2_Sub3_Sub1) this).anImage10450 = new BufferedImage(directcolormodel, writableraster, false, new Hashtable());
	}

	public int method14346() {
		return method14353(0, 0);
	}

	public int method14349() {
		return method14353(0, 0);
	}

	public int method14350() {
		return method14353(0, 0);
	}

	public final int method14351(int i, int i_1_) {
		Graphics graphics = ((Class158_Sub2_Sub3_Sub1) this).aCanvas10241.getGraphics();
		graphics.drawImage(((Class158_Sub2_Sub3_Sub1) this).anImage10450, i, i_1_, ((Class158_Sub2_Sub3_Sub1) this).aCanvas10241);
		return 0;
	}

	public void method186() {
		/* empty */
	}

	public final int method14352(int i, int i_2_) {
		Graphics graphics = ((Class158_Sub2_Sub3_Sub1) this).aCanvas10241.getGraphics();
		graphics.drawImage(((Class158_Sub2_Sub3_Sub1) this).anImage10450, i, i_2_, ((Class158_Sub2_Sub3_Sub1) this).aCanvas10241);
		return 0;
	}

	public final int method14345(int i, int i_3_) {
		Graphics graphics = ((Class158_Sub2_Sub3_Sub1) this).aCanvas10241.getGraphics();
		graphics.drawImage(((Class158_Sub2_Sub3_Sub1) this).anImage10450, i, i_3_, ((Class158_Sub2_Sub3_Sub1) this).aCanvas10241);
		return 0;
	}

	Class158_Sub2_Sub3_Sub1(Class505_Sub3 class505_sub3, Canvas canvas, int i, int i_4_) {
		super(class505_sub3, canvas, i, i_4_);
		new Rectangle();
		method15632((byte) -46);
	}
}
