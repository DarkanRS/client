/* Class96_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub9 extends Class96 {
	static Class483 aClass483_9278;
	int anInt9279;
	int anInt9280;
	Class116 aClass116_9281;
	static int anInt9282;

	boolean method1591() {
		if (null == ((Class96_Sub9) this).aClass116_9281)
			((Class96_Sub9) this).aClass116_9281 = new Class116(IndexLoaders.MUSIC_INDEX, -1480555825 * ((Class96_Sub9) this).anInt9280);
		return ((Class96_Sub9) this).aClass116_9281.method1963(1418683997);
	}

	Class96_Sub9(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub9) this).anInt9280 = class282_sub35.readUnsignedShort() * -20495313;
		((Class96_Sub9) this).anInt9279 = class282_sub35.readUnsignedByte() * -321392735;
	}

	boolean method1599(int i) {
		if (null == ((Class96_Sub9) this).aClass116_9281)
			((Class96_Sub9) this).aClass116_9281 = new Class116(IndexLoaders.MUSIC_INDEX, -1480555825 * ((Class96_Sub9) this).anInt9280);
		return ((Class96_Sub9) this).aClass116_9281.method1963(1418683997);
	}

	public void method1601() {
		Class256.method4412(((Class96_Sub9) this).aClass116_9281, 68269153 * ((Class96_Sub9) this).anInt9279, 1541193543);
	}

	boolean method1596() {
		if (null == ((Class96_Sub9) this).aClass116_9281)
			((Class96_Sub9) this).aClass116_9281 = new Class116(IndexLoaders.MUSIC_INDEX, -1480555825 * ((Class96_Sub9) this).anInt9280);
		return ((Class96_Sub9) this).aClass116_9281.method1963(1418683997);
	}

	public void method1592(int i) {
		Class256.method4412(((Class96_Sub9) this).aClass116_9281, 68269153 * ((Class96_Sub9) this).anInt9279, 1212110524);
	}

	public static boolean method14585(int i, int i_0_) {
		return (i & -i) == i;
	}

	static final void method14586(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, -159099843) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1396 = Class351.method6193(string, class527, -448612500);
		class118.aBool1384 = true;
	}

	static void method14587(int i, int i_1_, int i_2_, short i_3_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Class263.method4778(9, (long) i);
		class282_sub50_sub12.method14995(1698715246);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = -1773141545 * i_1_;
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9641 = 717659479 * i_2_;
	}
}
