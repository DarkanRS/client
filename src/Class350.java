/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class350 implements Interface3 {
	public int anInt4086;
	public Class353 aClass353_4087;
	public int anInt4088;
	public int anInt4089;
	public int anInt4090;
	public int anInt4091;
	public int anInt4092;
	public int anInt4093;
	public Class356 aClass356_4094;

	static Class350 method6187(RsByteBuffer class282_sub35) {
		Class356 class356 = (Class350_Sub3_Sub1.method15558(1505926417)[class282_sub35.readUnsignedByte()]);
		Class353 class353 = (Class483.method8155(152314627)[class282_sub35.readUnsignedByte()]);
		int i = class282_sub35.readShort(2010035576);
		int i_0_ = class282_sub35.readShort(1760455590);
		int i_1_ = class282_sub35.readUnsignedShort();
		int i_2_ = class282_sub35.readUnsignedShort();
		int i_3_ = class282_sub35.readShort(2007114319);
		int i_4_ = class282_sub35.readBigSmart(2101115812);
		int i_5_ = class282_sub35.readInt();
		return new Class350(class356, class353, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
	}

	public Class60 method24(int i) {
		return null;
	}

	public Class60 method25() {
		return null;
	}

	static Class350 method6188(RsByteBuffer class282_sub35) {
		Class356 class356 = (Class350_Sub3_Sub1.method15558(-556784147)[class282_sub35.readUnsignedByte()]);
		Class353 class353 = (Class483.method8155(152314627)[class282_sub35.readUnsignedByte()]);
		int i = class282_sub35.readShort(1599050571);
		int i_6_ = class282_sub35.readShort(2129989949);
		int i_7_ = class282_sub35.readUnsignedShort();
		int i_8_ = class282_sub35.readUnsignedShort();
		int i_9_ = class282_sub35.readShort(1982029468);
		int i_10_ = class282_sub35.readBigSmart(2075793397);
		int i_11_ = class282_sub35.readInt();
		return new Class350(class356, class353, i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_);
	}

	Class350(Class356 class356, Class353 class353, int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		aClass356_4094 = class356;
		aClass353_4087 = class353;
		anInt4090 = 1823133563 * i;
		anInt4089 = 2015431945 * i_12_;
		anInt4093 = -229835439 * i_13_;
		anInt4088 = i_14_ * 1707725877;
		anInt4092 = i_15_ * -1053358863;
		anInt4086 = i_16_ * -1988551129;
		anInt4091 = i_17_ * -77040515;
	}

	public static void method6189(byte i) {
		for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7941((byte) 4)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7955(-433309836))) {
			if ((((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 * 2026887253) > 1) {
				((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 = 0;
				Class20.aClass229_164.put(class282_sub50_sub15, (820033947929891191L * (((Class282_Sub50_Sub7) (Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)).aLong9580)));
				((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7935((byte) 116);
			}
		}
		Class20.anInt170 = 0;
		Class20.anInt169 = 0;
		Class20.aClass482_171.method8118(-1633616509);
		Class20.aClass465_172.method7749(168262790);
		Class20.aClass477_182.method7935((byte) 1);
		Class20.aBool161 = false;
	}

	static final void method6190(CS2Executor class527, byte i) {
		AnimationDefinitions.method11148((((CS2Executor) class527).animable), (((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537)]), 1271800838);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}
}
