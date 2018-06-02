/* Class96_Sub10_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub10_Sub2 extends Class96_Sub10 {
	int anInt10222;
	int anInt10223;
	int anInt10224;

	public void method1601() {
		int i = 256 + ((Class96_Sub10_Sub2) this).anInt10223 * 611538432;
		int i_0_ = 256 + ((Class96_Sub10_Sub2) this).anInt10222 * -55350784;
		int i_1_ = -387189251 * ((Class96_Sub10_Sub2) this).anInt10224;
		if (i_1_ < 3 && (IndexLoaders.MAP_REGION_DECODER.method4433(33386298).method5497(((Class96_Sub10_Sub2) this).anInt10223 * 563231147, ((Class96_Sub10_Sub2) this).anInt10222 * -344041035, 1522246231)))
			i_1_++;
		Class521_Sub1_Sub1_Sub4 class521_sub1_sub1_sub4 = (new Class521_Sub1_Sub1_Sub4(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1619106347), 660169595 * ((Class96_Sub10_Sub2) this).anInt9296, 0, -387189251 * ((Class96_Sub10_Sub2) this).anInt10224, i_1_, i, (Class504.method8389(i, i_0_, (((Class96_Sub10_Sub2) this).anInt10224 * -387189251), (byte) 7) - ((Class96_Sub10_Sub2) this).anInt9295 * 277206935), i_0_, 563231147 * ((Class96_Sub10_Sub2) this).anInt10223,
				((Class96_Sub10_Sub2) this).anInt10223 * 563231147, -344041035 * ((Class96_Sub10_Sub2) this).anInt10222, -344041035 * ((Class96_Sub10_Sub2) this).anInt10222, ((Class96_Sub10_Sub2) this).anInt9297 * 1009489391, false));
		client.aClass465_7334.method7765(new Class282_Sub50_Sub10(class521_sub1_sub1_sub4), (long) (((Class96_Sub10_Sub2) this).anInt10223 * 563231147 << 16 | -344041035 * ((Class96_Sub10_Sub2) this).anInt10222));
	}

	public void method1592(int i) {
		int i_2_ = 256 + ((Class96_Sub10_Sub2) this).anInt10223 * 611538432;
		int i_3_ = 256 + ((Class96_Sub10_Sub2) this).anInt10222 * -55350784;
		int i_4_ = -387189251 * ((Class96_Sub10_Sub2) this).anInt10224;
		if (i_4_ < 3 && (IndexLoaders.MAP_REGION_DECODER.method4433(33386298).method5497(((Class96_Sub10_Sub2) this).anInt10223 * 563231147, ((Class96_Sub10_Sub2) this).anInt10222 * -344041035, 1968806525)))
			i_4_++;
		Class521_Sub1_Sub1_Sub4 class521_sub1_sub1_sub4 = (new Class521_Sub1_Sub1_Sub4(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1995024088), 660169595 * ((Class96_Sub10_Sub2) this).anInt9296, 0, -387189251 * ((Class96_Sub10_Sub2) this).anInt10224, i_4_, i_2_, (Class504.method8389(i_2_, i_3_, (((Class96_Sub10_Sub2) this).anInt10224 * -387189251), (byte) 34) - ((Class96_Sub10_Sub2) this).anInt9295 * 277206935), i_3_, 563231147 * ((Class96_Sub10_Sub2) this).anInt10223,
				((Class96_Sub10_Sub2) this).anInt10223 * 563231147, -344041035 * ((Class96_Sub10_Sub2) this).anInt10222, -344041035 * ((Class96_Sub10_Sub2) this).anInt10222, ((Class96_Sub10_Sub2) this).anInt9297 * 1009489391, false));
		client.aClass465_7334.method7765(new Class282_Sub50_Sub10(class521_sub1_sub1_sub4), (long) (((Class96_Sub10_Sub2) this).anInt10223 * 563231147 << 16 | -344041035 * ((Class96_Sub10_Sub2) this).anInt10222));
	}

	Class96_Sub10_Sub2(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		int i = class282_sub35.readInt();
		((Class96_Sub10_Sub2) this).anInt10223 = -979961597 * (i >>> 16);
		((Class96_Sub10_Sub2) this).anInt10222 = (i & 0xffff) * -1994093411;
		((Class96_Sub10_Sub2) this).anInt10224 = class282_sub35.readUnsignedByte() * -51671211;
	}
}
