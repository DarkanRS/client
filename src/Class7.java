/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class7 {
	public String aString92;
	public String aString93;
	String aString94;
	public int anInt95;
	public String aString96;
	public byte aByte97;

	Class7() {
		/* empty */
	}

	static final void method310(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			int[] is = Class298_Sub6.method2863(string, class403, -1009686334);
			if (null != is)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1157 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.anIntArray1260 = is;
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ah.oo(").append(')').toString());
		}
	}

	static final void method311(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aClass251Array8920[i_0_].method2401((byte) 8);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ah.yc(").append(')').toString());
		}
	}

	static final void method312(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_1_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[2 + ((ClientScript2) class403).anInt5239 * 681479919]);
			Class301_Sub1.method3713(1, i_1_ << 16 | i_2_, i_3_, "", -172660954);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ah.alj(").append(')').toString());
		}
	}

	static Class98_Sub1 method313(RsByteBuffer class298_sub53, int i) {
		try {
			return new Class98_Sub1(class298_sub53.readShort(1844791454), class298_sub53.readShort(1564642079), class298_sub53.readShort(1940740922), class298_sub53.readShort(1868310527), class298_sub53.read24BitUnsignedInteger((byte) 51), class298_sub53.read24BitUnsignedInteger((byte) -10), class298_sub53.readUnsignedByte());
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ah.r(").append(')').toString());
		}
	}

	static void method314(GraphicsToolkit class_ra, int i) {
		try {
			if ((Class436.anInt5506 * -278777595 >= 2 || client.aBoolean8835) && null == client.aClass105_8850) {
				String string;
				if (client.aBoolean8835 && -278777595 * Class436.anInt5506 < 2)
					string = new StringBuilder().append(client.aString8838).append(Tradution.aClass470_5916.method6049(Class321.aClass429_3357, -875414210)).append(client.aString8754).append(" ").append(Class26.aString351).toString();
				else if (Class117.method1275((byte) 122) && -278777595 * Class436.anInt5506 > 2)
					string = Class8.method315((Class298_Sub45.aClass298_Sub37_Sub15_7522), 2135114234);
				else {
					Class298_Sub37_Sub15 class298_sub37_sub15 = Class298_Sub45.aClass298_Sub37_Sub15_7522;
					if (class298_sub37_sub15 == null)
						return;
					string = Class8.method315(class298_sub37_sub15, 2142692033);
					int[] is = Class313.method3821(class298_sub37_sub15, (byte) -32);
					if (is != null)
						string = new StringBuilder().append(string).append(Class216.method1999(is, (byte) 1)).toString();
				}
				if (-278777595 * Class436.anInt5506 > 2)
					string = new StringBuilder().append(string).append(Class285.method2709(16777215, -1452738255)).append(" / ").append(Class436.anInt5506 * -278777595 - 2).append(Tradution.aClass470_5814.method6049(Class321.aClass429_3357, -875414210)).toString();
				if (Class436.aClass105_5486 != null) {
					Class264 class264 = (Class436.aClass105_5486.method1112(Class497.aClass197_6105, client.anInterface10_8700, 2046154242));
					if (null == class264)
						class264 = Class101.aClass264_1084;
					class264.method2485(string, -828992241 * Class436.anInt5487, 1604938967 * Class436.anInt5502, -2093041337 * Class436.aClass105_5486.anInt1156, Class436.aClass105_5486.anInt1162 * 457937409, 1045422783 * Class436.aClass105_5486.anInt1170, -2065110161 * Class436.aClass105_5486.anInt1251, 872550387 * Class436.aClass105_5486.anInt1214, -1594110459 * Class436.aClass105_5486.anInt1124, client.aRandom8702, 1401020893 * Class368.anInt4005, client.anIntArray8899,
							Class436.aClass57Array5501, Class422_Sub3.anIntArray8372, -1153250817);
					Class227.method2112(client.anIntArray8899[0], client.anIntArray8899[1], client.anIntArray8899[2], client.anIntArray8899[3], (byte) 2);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ah.ay(").append(')').toString());
		}
	}
}
