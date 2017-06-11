/* Class523 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

final class Class523 implements Interface17 {
	public boolean method229(Class365_Sub1_Sub1 class365_sub1_sub1, int i) {
		try {
			return class365_sub1_sub1 instanceof Interface3;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("x.a(").append(')').toString());
		}
	}

	public boolean method228(Class365_Sub1_Sub1 class365_sub1_sub1) {
		return class365_sub1_sub1 instanceof Interface3;
	}

	public boolean method230(Class365_Sub1_Sub1 class365_sub1_sub1) {
		return class365_sub1_sub1 instanceof Interface3;
	}

	static final void method6329(IComponentDefinition class105, ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_1_ = ((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) - 1);
			if (2 != 1548853569 * class105.anInt1184)
				throw new RuntimeException("");
			SomethingDefinitions class503 = Class15.aClass507_224.method6269(class105.anInt1151 * 572201537, -87546938);
			if (class105.aClass498_1307 == null)
				class105.aClass498_1307 = new Class498(class503, false);
			class105.aClass498_1307.aLong6110 = Class382.method4686(-1683898407) * 3177550440302969639L;
			if (i_1_ < 0 || i_1_ >= class503.anIntArray6130.length)
				throw new RuntimeException("");
			class105.aClass498_1307.anIntArray6108[i_1_] = i_0_;
			Tradution.method6054(class105, -339426215);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("x.qp(").append(')').toString());
		}
	}

	public static final void method6330(IComponentDefinition class105, int i, int i_2_, int i_3_) {
		try {
			if (client.aClass105_8850 == null && !Class436.aBoolean5478 && (null != class105 && Class419.method5603(class105, 1470456512))) {
				client.aClass105_8850 = class105;
				client.aClass105_8712 = Class331.method4063(class105, (byte) -122);
				client.anInt8734 = -344812543 * i;
				client.anInt8853 = i_2_ * -1376922141;
				Class82_Sub22.anInt6917 = 0;
				client.aBoolean8863 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("x.ls(").append(')').toString());
		}
	}

	public static final IComponentDefinition method6331(Class119 class119, IComponentDefinition class105, int i) {
		try {
			if (-1 != 1573706803 * class105.anInt1160)
				return class119.method1297(class105.anInt1160 * 1573706803, (short) 8481);
			if (!class119.aBoolean1403) {
				int i_4_ = class105.anInt1142 * -440872681 >>> 16;
				Class460 class460 = new Class460(client.aClass437_8841);
				for (Interface class298_sub51 = (Interface) class460.method5979(-2012602178); null != class298_sub51; class298_sub51 = (Interface) class460.next()) {
					if (-1617025021 * class298_sub51.interfaceId == i_4_)
						return Class50.getIComponentDefinitions((int) (7051297995265073167L * (class298_sub51.linkedKey)), (byte) -3);
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("x.ku(").append(')').toString());
		}
	}

	public static void method6332(int i) {
		try {
			if (null != Class300.aClass284_3212)
				Class300.aClass284_3212.method2690((byte) -66);
			if (null != Class3.aClass284_68)
				Class3.aClass284_68.method2690((byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("x.i(").append(')').toString());
		}
	}

	static Class298_Sub50_Sub1 method6333(int i, int i_5_, int i_6_, long l, int i_7_, int i_8_) {
		try {
			synchronized (Class298_Sub50_Sub1.aClass298_Sub50_Sub1Array9735) {
				Class298_Sub50_Sub1 class298_sub50_sub1;
				if (0 == 2017906303 * Class298_Sub50_Sub1.anInt9733)
					class298_sub50_sub1 = new Class298_Sub50_Sub1();
				else
					class298_sub50_sub1 = (Class298_Sub50_Sub1.aClass298_Sub50_Sub1Array9735[((Class298_Sub50_Sub1.anInt9733 -= 1787228543) * 2017906303)]);
				((Class298_Sub50_Sub1) class298_sub50_sub1).anInt9736 = -435781441 * i;
				((Class298_Sub50_Sub1) class298_sub50_sub1).anInt9737 = i_5_ * -871010593;
				((Class298_Sub50_Sub1) class298_sub50_sub1).anInt9738 = i_6_ * -25797095;
				((Class298_Sub50_Sub1) class298_sub50_sub1).aLong9739 = -8923914877553624531L * l;
				((Class298_Sub50_Sub1) class298_sub50_sub1).anInt9740 = i_7_ * 1687973955;
				Class298_Sub50_Sub1 class298_sub50_sub1_9_ = class298_sub50_sub1;
				return class298_sub50_sub1_9_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("x.av(").append(')').toString());
		}
	}

	public static GraphicsToolkit method6334(int i, Canvas canvas, Interface_ma interface_ma, Class243 class243, int i_10_, int i_11_) {
		try {
			int i_12_ = 0;
			int i_13_ = 0;
			if (null != canvas) {
				Dimension dimension = canvas.getSize();
				i_12_ = dimension.width;
				i_13_ = dimension.height;
			}
			return Class393.method4892(i, canvas, interface_ma, class243, i_10_, i_12_, i_13_, 16777215);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("x.a(").append(')').toString());
		}
	}
}
