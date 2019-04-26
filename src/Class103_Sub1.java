import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

public class Class103_Sub1 extends Class103 {

	Class101 aClass101_9148;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_9144;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_9145;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_9149;
	Node_Sub21_Sub1 aNode_Sub21_Sub1_9146;
	Matrix44Arr aClass384_9147 = new Matrix44Arr();

	boolean method14483() throws Exception_Sub2 {
		this.aClass101_9148 = this.aGraphicalRenderer_Sub2_1057.method13890("Particle");
		this.aNode_Sub21_Sub1_9144 = this.aClass101_9148.method1691("WVPMatrix", (short) 22417);
		this.aNode_Sub21_Sub1_9145 = this.aClass101_9148.method1691("DiffuseSampler", (short) 26058);
		this.aNode_Sub21_Sub1_9149 = this.aClass101_9148.method1691("TexCoordMatrix", (short) 32643);
		this.aNode_Sub21_Sub1_9146 = this.aClass101_9148.method1691("DiffuseColour", (short) 29027);
		this.aClass101_9148.method1655(this.aClass101_9148.method1654(-1983174373));
		return true;
	}

	public void method1788(Matrix44Arr matrix44arr_1) {
		this.aClass384_9147.method6562(matrix44arr_1);
		this.aClass384_9147.method6523(this.aGraphicalRenderer_Sub2_1057.aClass384_8729);
	}

	public void method1787(int i_1) {
		this.method14486(2119747101);
		this.aGraphicalRenderer_Sub2_1057.method14002(Class352.aClass352_4098, 0, i_1 * 4, 0, i_1 * 2);
	}

	public void method1790() {
		this.method14486(2135879735);
		this.aGraphicalRenderer_Sub2_1057.method14150();
	}

	public void method1789(Matrix44Arr matrix44arr_1) {
		this.aClass384_9147.method6562(matrix44arr_1);
		this.aClass384_9147.method6523(this.aGraphicalRenderer_Sub2_1057.aClass384_8729);
	}

	public void method1786(Matrix44Arr matrix44arr_1) {
		this.aClass384_9147.method6562(matrix44arr_1);
		this.aClass384_9147.method6523(this.aGraphicalRenderer_Sub2_1057.aClass384_8729);
	}

	public void method1785(int i_1) {
		this.method14486(2127063617);
		this.aGraphicalRenderer_Sub2_1057.method14002(Class352.aClass352_4098, 0, 4 * i_1, 0, i_1 * 2);
	}

	public void method1791() {
		this.method14486(2126455360);
		this.aGraphicalRenderer_Sub2_1057.method14150();
	}

	public void method1792() {
		this.method14486(2147226519);
		this.aGraphicalRenderer_Sub2_1057.method14150();
	}

	void method14486(int i_1) {
		this.aClass101_9148.method1655(this.aClass101_9148.method1654(96252371));
		this.aClass101_9148.method1646();
		this.aClass101_9148.method1671(this.aNode_Sub21_Sub1_9145, 0, this.anInterface6_1059);
		this.aClass101_9148.method1668(this.aNode_Sub21_Sub1_9144, this.aClass384_9147, (byte) -104);
		this.aClass101_9148.method1667(this.aNode_Sub21_Sub1_9149, this.aClass384_1058, -262849390);
		this.aClass101_9148.method1696(this.aNode_Sub21_Sub1_9146, this.anInt1056);
	}

	public Class103_Sub1(GraphicalRenderer_Sub2 class505_sub2_1) throws Exception_Sub2 {
		super(class505_sub2_1);
		this.method14483();
	}

	static NativeSprite method14490(byte[] bytes_0, byte b_1) {
		if (bytes_0 == null) {
			throw new RuntimeException("");
		} else {
			while (true) {
				try {
					Image image_3 = Toolkit.getDefaultToolkit().createImage(bytes_0);
					MediaTracker mediatracker_4 = new MediaTracker(Node_Sub44.anApplet8065);
					mediatracker_4.addImage(image_3, 0);
					mediatracker_4.waitForAll();
					int i_5 = image_3.getWidth(Node_Sub44.anApplet8065);
					int i_6 = image_3.getHeight(Node_Sub44.anApplet8065);
					if (!mediatracker_4.isErrorAny() && i_5 >= 0 && i_6 >= 0) {
						int[] ints_7 = new int[i_5 * i_6];
						PixelGrabber pixelgrabber_8 = new PixelGrabber(image_3, 0, 0, i_5, i_6, ints_7, 0, i_5);
						pixelgrabber_8.grabPixels();
						NativeSprite nativesprite_2 = Renderers.SOFTWARE_RENDERER.createNativeSprite(ints_7, i_5, i_5, i_6, 194479026);
						return nativesprite_2;
					}

					throw new RuntimeException("");
				} catch (InterruptedException interruptedexception_9) {
					;
				}
			}
		}
	}

}
