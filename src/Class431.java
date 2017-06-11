/* Class431 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class431 implements Interface15 {
	public static int anInt6502;
	GraphicsToolkit aClass_ra6503;
	static int anInt6504;

	Class431() {
		/* empty */
	}

	public Object method215(int[] is, int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		return ((Class431) this).aClass_ra6503.method5030(is, i, i_0_, i_1_, i_2_, false);
	}

	public Object method212(int[] is, int i, int i_3_, int i_4_, int i_5_, boolean bool) {
		return ((Class431) this).aClass_ra6503.method5030(is, i, i_3_, i_4_, i_5_, false);
	}

	public Object method214(int[] is, int i, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_) {
		try {
			return ((Class431) this).aClass_ra6503.method5030(is, i, i_6_, i_7_, i_8_, false);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rv.a(").append(')').toString());
		}
	}

	public Object method213(int[] is, int i, int i_10_, int i_11_, int i_12_, boolean bool) {
		return ((Class431) this).aClass_ra6503.method5030(is, i, i_10_, i_11_, i_12_, false);
	}

	public static boolean method5763(byte[] is, int i) {
		try {
			RsByteBuffer class298_sub53 = new RsByteBuffer(is);
			int i_13_ = class298_sub53.readUnsignedByte();
			if (i_13_ != 2)
				return false;
			boolean bool = class298_sub53.readUnsignedByte() == 1;
			if (bool)
				Class22.method372(class298_sub53, -255751616);
			Class298_Sub9.method2893(class298_sub53, 1138164692);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rv.f(").append(')').toString());
		}
	}

	public static boolean method5764(char c, int i) {
		try {
			return c >= '0' && c <= '9';
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rv.z(").append(')').toString());
		}
	}

	static final void method5765(ClientScript2 class403, int i) {
		try {
			int i_14_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			boolean bool = true;
			if (i_14_ < 0)
				bool = 0 == (i_14_ + 1) % 4;
			else if (i_14_ < 1582)
				bool = 0 == i_14_ % 4;
			else if (i_14_ % 4 != 0)
				bool = false;
			else if (0 != i_14_ % 100)
				bool = true;
			else if (i_14_ % 400 != 0)
				bool = false;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rv.aky(").append(')').toString());
		}
	}

	static void method5766(int i) {
		try {
			Class360.aClass25_3905.method383((short) 8191);
			((BufferedConnectionContext) Class360.aClass25_3905).stream.index = 0;
			((BufferedConnectionContext) Class360.aClass25_3905).INCOMMING_PACKET = null;
			((BufferedConnectionContext) Class360.aClass25_3905).aClass202_344 = null;
			((BufferedConnectionContext) Class360.aClass25_3905).aClass202_345 = null;
			((BufferedConnectionContext) Class360.aClass25_3905).aClass202_348 = null;
			((BufferedConnectionContext) Class360.aClass25_3905).anInt336 = 0;
			((BufferedConnectionContext) Class360.aClass25_3905).anInt338 = 0;
			client.anInt8669 = 0;
			Class447.method5905(2108312995);
			Class271.method2547(385051775);
			for (int i_15_ = 0; i_15_ < 2048; i_15_++)
				client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_15_] = null;
			Class287.myPlayer = null;
			for (int i_16_ = 0; i_16_ < 1962237353 * client.anInt8772; i_16_++) {
				Entity class365_sub1_sub1_sub2 = ((Entity) client.aClass298_Sub29Array8816[i_16_].anObject7366);
				if (class365_sub1_sub1_sub2 != null)
					class365_sub1_sub1_sub2.anInt10090 = -283914955;
			}
			Class418.method5601((byte) -61);
			Class298_Sub1.anInt7164 = 1355934404;
			Class418.anInt5339 = -1001372047;
			Class100.anInt1081 = 178575833;
			Class439.method5851(0, 580389189);
			for (int i_17_ = 0; i_17_ < 113; i_17_++)
				client.aBooleanArray8900[i_17_] = true;
			Class326.method3974(-2137735375);
			Class_xa.aClass396_6291 = null;
			Class365_Sub1_Sub2_Sub1.aLong9911 = 0L;
			Class119.method1304(2030440577);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rv.ae(").append(')').toString());
		}
	}

	public static void method5767(int i, Class243 class243, int i_18_, int i_19_, int i_20_, boolean bool, int i_21_) {
		try {
			Class79.anInt734 = -1262101671;
			Class79.aClass243_744 = class243;
			Class79.anInt745 = -407545223 * i_18_;
			Class79.anInt746 = -956029523 * i_19_;
			Class79.aClass298_Sub19_Sub1_748 = null;
			Class79.anInt739 = i_20_ * -2102749749;
			Class8.aBoolean114 = bool;
			Class298_Sub24_Sub1.anInt9276 = 771950311 * i;
			Class313.aClass97_3300 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rv.r(").append(')').toString());
		}
	}

	public static void method5768(Entity class365_sub1_sub1_sub2, int[] is, int i, boolean bool, byte i_22_) {
		try {
			if (null != class365_sub1_sub1_sub2.anIntArray10093) {
				boolean bool_23_ = true;
				for (int i_24_ = 0; i_24_ < class365_sub1_sub1_sub2.anIntArray10093.length; i_24_++) {
					if (is[i_24_] != class365_sub1_sub1_sub2.anIntArray10093[i_24_]) {
						bool_23_ = false;
						break;
					}
				}
				Class438 class438 = class365_sub1_sub1_sub2.aClass438_10078;
				if (bool_23_ && class438.method5819((byte) -38)) {
					Class391 class391 = class365_sub1_sub1_sub2.aClass438_10078.method5820(1190945096);
					int i_25_ = class391.anInt4184 * -1117238071;
					if (1 == i_25_)
						class438.method5835(i, (byte) 81);
					if (i_25_ == 2)
						class438.method5842(1476401100);
				}
			}
			boolean bool_26_ = true;
			for (int i_27_ = 0; i_27_ < is.length; i_27_++) {
				if (is[i_27_] != -1)
					bool_26_ = false;
				if (null == class365_sub1_sub1_sub2.anIntArray10093 || -1 == class365_sub1_sub1_sub2.anIntArray10093[i_27_] || ((Class501.aClass395_6122.method4903(is[i_27_], (byte) -62).anInt4178) * -1445588039 >= (Class501.aClass395_6122.method4903(class365_sub1_sub1_sub2.anIntArray10093[i_27_], (byte) -47).anInt4178) * -1445588039)) {
					class365_sub1_sub1_sub2.anIntArray10093 = is;
					class365_sub1_sub1_sub2.aClass438_10078.method5828(i, -1445580533);
					if (bool)
						class365_sub1_sub1_sub2.anInt10125 = class365_sub1_sub1_sub2.anInt10120 * -526956429;
				}
			}
			if (bool_26_) {
				class365_sub1_sub1_sub2.anIntArray10093 = is;
				class365_sub1_sub1_sub2.aClass438_10078.method5828(i, -1445580533);
				if (bool)
					class365_sub1_sub1_sub2.anInt10125 = -526956429 * class365_sub1_sub1_sub2.anInt10120;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rv.ke(").append(')').toString());
		}
	}
}
