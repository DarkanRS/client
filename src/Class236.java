/* Class236 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class236 {
	public static int anInt2601 = 4;
	public static int anInt2602 = 1;
	public static int anInt2603 = 3;
	public static int anInt2604 = 0;
	public static int anInt2605 = 2;
	static IComponentDefinition aClass105_2606;

	Class236() throws Throwable {
		throw new Error();
	}

	static final byte[] method2188(byte[] is, int i) {
		try {
			RsByteBuffer class298_sub53 = new RsByteBuffer(is);
			int i_0_ = class298_sub53.readUnsignedByte();
			int i_1_ = class298_sub53.readInt((byte) -98);
			if (i_1_ < 0 || (-989796335 * Class243.anInt2722 != 0 && i_1_ > -989796335 * Class243.anInt2722))
				throw new RuntimeException();
			if (i_0_ == 0) {
				byte[] is_2_ = new byte[i_1_];
				class298_sub53.readBytes(is_2_, 0, i_1_, -953523806);
				return is_2_;
			}
			int i_3_ = class298_sub53.readInt((byte) -15);
			if (i_3_ < 0 || (0 != -989796335 * Class243.anInt2722 && i_3_ > Class243.anInt2722 * -989796335))
				throw new RuntimeException();
			byte[] is_4_ = new byte[i_3_];
			if (1 == i_0_)
				Class450.method5921(is_4_, i_3_, is, i_1_, 9);
			else {
				synchronized (Class243.aClass519_2714) {
					Class243.aClass519_2714.method6318(class298_sub53, is_4_, -2006263589);
				}
			}
			return is_4_;
		} catch (Throwable runtimeexception) {
			if (Loader.DISABLE_XTEA_CRASH)
				return new byte[100];
			else
				throw Class346.method4175(runtimeexception, new StringBuilder().append("jy.ad(").append(')').toString());
		}
	}

	static final void method2189(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_5_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			int i_7_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]);
			Class301_Sub1.method3713(8, i_5_ << 16 | i_6_, i_7_, "", 1153707798);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jy.all(").append(')').toString());
		}
	}

	public static Class298_Sub52 method2190(int i) {
		try {
			if (Class301_Sub1.aClass453_3236 == null || null == Class301_Sub1.aClass446_7634)
				return null;
			Class301_Sub1.aClass446_7634.method5898(Class301_Sub1.aClass453_3236, 1595014600);
			Class298_Sub52 class298_sub52 = ((Class298_Sub52) Class301_Sub1.aClass446_7634.method5900(1453357547));
			if (class298_sub52 == null)
				return null;
			Class352 class352 = Class301_Sub1.aClass339_3251.method4116((-530122905 * (class298_sub52.anInt7608)), -113320818);
			if (null == class352 || !class352.aBoolean3816 || !class352.method4237(Class301_Sub1.anInterface23_3223, 391184195))
				return Class52_Sub1.method567(-20548648);
			return class298_sub52;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jy.cn(").append(')').toString());
		}
	}

	static final void method2191(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class291.method2787(class105, class119, class403, 2047482896);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jy.fh(").append(')').toString());
		}
	}
}
