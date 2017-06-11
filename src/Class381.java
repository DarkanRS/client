/* Class381 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class381 {
	public Interface19 anInterface19_4109;
	public int anInt4110;
	public Interface19 anInterface19_4111;
	public Interface19 anInterface19_4112;
	public Interface19 anInterface19_4113;
	public Class355 aClass355_4114;
	public Class355 aClass355_4115;
	public Class355 aClass355_4116;
	public int anInt4117;
	public boolean aBoolean4118;
	static Class4 aClass4_4119;

	void method4683(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i <= -440872681)
						throw new IllegalStateException();
					break;
				}
				if (1 == i_0_)
					anInterface19_4113 = ObjectDefinitions.method5786(class298_sub53, (byte) -24);
				else if (i_0_ == 2)
					anInterface19_4109 = ObjectDefinitions.method5786(class298_sub53, (byte) 2);
				else if (3 == i_0_)
					anInterface19_4111 = ObjectDefinitions.method5786(class298_sub53, (byte) -93);
				else if (4 == i_0_)
					anInterface19_4112 = ObjectDefinitions.method5786(class298_sub53, (byte) -56);
				else if (i_0_ == 5)
					aClass355_4116 = Class422_Sub7.method5651(class298_sub53, (byte) -80);
				else if (i_0_ == 6)
					aClass355_4114 = Class422_Sub7.method5651(class298_sub53, (byte) 68);
				else if (i_0_ == 7)
					aClass355_4115 = Class422_Sub7.method5651(class298_sub53, (byte) 9);
				else if (8 == i_0_)
					ObjectDefinitions.method5786(class298_sub53, (byte) -104);
				else if (i_0_ == 9)
					ObjectDefinitions.method5786(class298_sub53, (byte) -11);
				else if (i_0_ == 10)
					ObjectDefinitions.method5786(class298_sub53, (byte) -108);
				else if (11 == i_0_)
					aBoolean4118 = true;
				else if (i_0_ == 12)
					anInt4110 = class298_sub53.readInt((byte) -25) * 1848816991;
				else if (13 == i_0_)
					anInt4117 = class298_sub53.readInt((byte) -10) * 1126272039;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pv.a(").append(')').toString());
		}
	}

	public Class381(Class243 class243) {
		byte[] is = class243.method2294((Class380.aClass380_4106.anInt4108 * -363169051), (byte) 29);
		method4683(new RsByteBuffer(is), 1436577561);
	}

	public static int[][] method4684(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, float f, boolean bool, byte i_6_) {
		try {
			int[][] is = new int[i_1_][i];
			Class298_Sub32_Sub34 class298_sub32_sub34 = new Class298_Sub32_Sub34();
			((Class298_Sub32_Sub34) class298_sub32_sub34).aBoolean9548 = bool;
			((Class298_Sub32_Sub34) class298_sub32_sub34).anInt9546 = i_3_ * 1143174821;
			((Class298_Sub32_Sub34) class298_sub32_sub34).anInt9545 = i_4_ * 2124139087;
			((Class298_Sub32_Sub34) class298_sub32_sub34).anInt9547 = i_5_ * -1820512295;
			((Class298_Sub32_Sub34) class298_sub32_sub34).anInt9544 = (int) (f * 4096.0F) * 52875281;
			class298_sub32_sub34.method3133(-786844466);
			Class250.method2397(i, i_1_, (byte) 24);
			for (int i_7_ = 0; i_7_ < i_1_; i_7_++)
				class298_sub32_sub34.method3356(i_7_, is[i_7_], -1995149862);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pv.be(").append(')').toString());
		}
	}
}
