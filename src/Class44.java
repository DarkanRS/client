/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class44 implements Interface46 {
	int[] anIntArray421 = { -1, -1, -1, -1, -1 };
	public static int[] anIntArray422;
	short[] aShortArray423;
	short[] aShortArray424;
	short[] aShortArray425;
	short[] aShortArray426;
	int[] anIntArray427;
	public static int[] anIntArray428 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	Class31 aClass31_429;
	static int anInt430;
	static int anInt431;

	public RSMesh method895(int i) {
		RSMesh[] class157s = new RSMesh[5];
		int i_0_ = 0;
		synchronized (((Class31) ((Class44) this).aClass31_429).aClass317_359) {
			for (int i_1_ = 0; i_1_ < 5; i_1_++) {
				if (((Class44) this).anIntArray421[i_1_] != -1)
					class157s[i_0_++] = RSMesh.decodeMesh((((Class31) ((Class44) this).aClass31_429).aClass317_359), (((Class44) this).anIntArray421[i_1_]), 0);
			}
		}
		for (int i_2_ = 0; i_2_ < 5; i_2_++) {
			if (null != class157s[i_2_] && class157s[i_2_].zoom < 13)
				class157s[i_2_].upscale(2);
		}
		RSMesh class157 = new RSMesh(class157s, i_0_);
		if (((Class44) this).aShortArray423 != null) {
			for (int i_3_ = 0; i_3_ < ((Class44) this).aShortArray423.length; i_3_++)
				class157.recolor(((Class44) this).aShortArray423[i_3_], ((Class44) this).aShortArray424[i_3_]);
		}
		if (((Class44) this).aShortArray425 != null) {
			for (int i_4_ = 0; i_4_ < ((Class44) this).aShortArray425.length; i_4_++)
				class157.retexture(((Class44) this).aShortArray425[i_4_], ((Class44) this).aShortArray426[i_4_]);
		}
		return class157;
	}

	void method897(RsByteBuffer class282_sub35, int i, int i_5_) {
		if (1 == i)
			class282_sub35.readUnsignedByte();
		else if (2 == i) {
			int i_6_ = class282_sub35.readUnsignedByte();
			((Class44) this).anIntArray427 = new int[i_6_];
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
				((Class44) this).anIntArray427[i_7_] = class282_sub35.readBigSmart();
		} else if (i != 3) {
			if (i == 40) {
				int i_8_ = class282_sub35.readUnsignedByte();
				((Class44) this).aShortArray423 = new short[i_8_];
				((Class44) this).aShortArray424 = new short[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
					((Class44) this).aShortArray423[i_9_] = (short) class282_sub35.readUnsignedShort();
					((Class44) this).aShortArray424[i_9_] = (short) class282_sub35.readUnsignedShort();
				}
			} else if (41 == i) {
				int i_10_ = class282_sub35.readUnsignedByte();
				((Class44) this).aShortArray425 = new short[i_10_];
				((Class44) this).aShortArray426 = new short[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
					((Class44) this).aShortArray425[i_11_] = (short) class282_sub35.readUnsignedShort();
					((Class44) this).aShortArray426[i_11_] = (short) class282_sub35.readUnsignedShort();
				}
			} else if (i >= 60 && i < 70)
				((Class44) this).anIntArray421[i - 60] = class282_sub35.readBigSmart();
		}
	}

	public boolean method898(int i) {
		if (((Class44) this).anIntArray427 == null)
			return true;
		boolean bool = true;
		synchronized (((Class31) ((Class44) this).aClass31_429).aClass317_359) {
			for (int i_12_ = 0; i_12_ < ((Class44) this).anIntArray427.length; i_12_++) {
				if (!((Class31) ((Class44) this).aClass31_429).aClass317_359.load(((Class44) this).anIntArray427[i_12_], 0))
					bool = false;
			}
		}
		return bool;
	}

	public RSMesh method899(int i) {
		if (null == ((Class44) this).anIntArray427)
			return null;
		RSMesh[] class157s = new RSMesh[((Class44) this).anIntArray427.length];
		synchronized (((Class31) ((Class44) this).aClass31_429).aClass317_359) {
			for (int i_13_ = 0; i_13_ < ((Class44) this).anIntArray427.length; i_13_++)
				class157s[i_13_] = RSMesh.decodeMesh((((Class31) ((Class44) this).aClass31_429).aClass317_359), (((Class44) this).anIntArray427[i_13_]), 0);
		}
		for (int i_14_ = 0; i_14_ < ((Class44) this).anIntArray427.length; i_14_++) {
			if (class157s[i_14_].zoom < 13)
				class157s[i_14_].upscale(2);
		}
		RSMesh class157;
		if (class157s.length == 1)
			class157 = class157s[0];
		else
			class157 = new RSMesh(class157s, class157s.length);
		if (null == class157)
			return null;
		if (null != ((Class44) this).aShortArray423) {
			for (int i_15_ = 0; i_15_ < ((Class44) this).aShortArray423.length; i_15_++)
				class157.recolor(((Class44) this).aShortArray423[i_15_], ((Class44) this).aShortArray424[i_15_]);
		}
		if (((Class44) this).aShortArray425 != null) {
			for (int i_16_ = 0; i_16_ < ((Class44) this).aShortArray425.length; i_16_++)
				class157.retexture(((Class44) this).aShortArray425[i_16_], ((Class44) this).aShortArray426[i_16_]);
		}
		return class157;
	}

	public boolean method900(int i) {
		boolean bool = true;
		synchronized (((Class31) ((Class44) this).aClass31_429).aClass317_359) {
			for (int i_17_ = 0; i_17_ < 5; i_17_++) {
				if (((Class44) this).anIntArray421[i_17_] != -1 && !(((Class31) ((Class44) this).aClass31_429).aClass317_359.load(((Class44) this).anIntArray421[i_17_], 0)))
					bool = false;
			}
		}
		return bool;
	}

	static {
		anIntArray422 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
	}

	Class44() {
		/* empty */
	}

	void method909(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_32_ = class282_sub35.readUnsignedByte();
			if (i_32_ == 0)
				break;
			method897(class282_sub35, i_32_, -2093049019);
		}
	}

	static final void method910(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 513538858) != null)
			string = string.substring(0, string.length() - 1);
		class118.params = Class351.method6193(string, class527, 240682174);
		class118.aBool1384 = true;
	}

	static final void method911(CS2Executor class527, int i) {
		int i_33_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_33_, 1594974983);
		int i_34_;
		if (class425.aBool5101)
			i_34_ = class425.anInt5102 * 712312847;
		else if (class425.members)
			i_34_ = Class149_Sub2.DEFAULTS_LOADER_7.anInt5880 * -1519092215;
		else
			i_34_ = Class149_Sub2.DEFAULTS_LOADER_7.anInt5881 * 725268415;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_34_;
	}

	static int method912(int i, int i_35_) {
		if (16711935 == i)
			return -1;
		return Class5.method294(i, (byte) -81);
	}

	public static void method913(Interface class98, IComponentDefinitions class118, byte i) {
		IComponentDefinitions class118_36_ = Class96_Sub23.method14682(class98, class118, -838454718);
		int i_37_;
		int i_38_;
		if (class118_36_ == null) {
			i_37_ = Class349.anInt4083 * -418109423;
			i_38_ = client.anInt3243 * -969250379;
		} else {
			i_37_ = 1506818197 * class118_36_.anInt1301;
			i_38_ = -492594917 * class118_36_.anInt1429;
		}
		Class484.method8200(class118, i_37_, i_38_, false, -342639292);
		Class246.method4204(class118, i_37_, i_38_, 354709557);
	}
}
