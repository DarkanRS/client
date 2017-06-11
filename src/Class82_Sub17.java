/* Class82_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub17 extends Class82 {
	int anInt6887;
	int anInt6888;
	int anInt6889;

	public void method868() {
		Class94 class94 = (Class87.aClass94Array794[((Class82_Sub17) this).anInt6889 * -824702981]);
		Class80 class80 = (Class87.aClass80Array795[((Class82_Sub17) this).anInt6888 * -1213610501]);
		class80.method852(class94, ((Class82_Sub17) this).anInt6887 * 301530619, 1628828546);
	}

	public void method866(int i) {
		try {
			Class94 class94 = (Class87.aClass94Array794[((Class82_Sub17) this).anInt6889 * -824702981]);
			Class80 class80 = (Class87.aClass80Array795[((Class82_Sub17) this).anInt6888 * -1213610501]);
			class80.method852(class94, ((Class82_Sub17) this).anInt6887 * 301530619, 1628828546);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yf.f(").append(')').toString());
		}
	}

	Class82_Sub17(RsByteBuffer class298_sub53) {
		super(class298_sub53);
		((Class82_Sub17) this).anInt6889 = class298_sub53.readUnsignedShort() * 1115286323;
		((Class82_Sub17) this).anInt6888 = class298_sub53.readUnsignedShort() * -1394180813;
		((Class82_Sub17) this).anInt6887 = class298_sub53.readUnsignedByte() * 1303807283;
	}

	public void method869() {
		Class94 class94 = (Class87.aClass94Array794[((Class82_Sub17) this).anInt6889 * -824702981]);
		Class80 class80 = (Class87.aClass80Array795[((Class82_Sub17) this).anInt6888 * -1213610501]);
		class80.method852(class94, ((Class82_Sub17) this).anInt6887 * 301530619, 1628828546);
	}

	static void method918(IComponentDefinition class105, int i, int i_0_, int i_1_) {
		try {
			Class436.aClass105_5486 = class105;
			Class436.anInt5487 = i * -1021462033;
			Class436.anInt5502 = i_0_ * -1325119769;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yf.av(").append(')').toString());
		}
	}

	static final void method919(ClientScript2 class403, int i) {
		try {
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub7_7581, (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), -2102625264);
			client.aClass283_8716.method2667(732894181);
			Class3.method300(656179282);
			client.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yf.aib(").append(')').toString());
		}
	}

	public static void method920(int[] is, int[] is_2_, int i, int i_3_, int i_4_) {
		try {
			if (i < i_3_) {
				int i_5_ = (i + i_3_) / 2;
				int i_6_ = i;
				int i_7_ = is[i_5_];
				is[i_5_] = is[i_3_];
				is[i_3_] = i_7_;
				int i_8_ = is_2_[i_5_];
				is_2_[i_5_] = is_2_[i_3_];
				is_2_[i_3_] = i_8_;
				int i_9_ = 2147483647 == i_7_ ? 0 : 1;
				for (int i_10_ = i; i_10_ < i_3_; i_10_++) {
					if (is[i_10_] < i_7_ + (i_10_ & i_9_)) {
						int i_11_ = is[i_10_];
						is[i_10_] = is[i_6_];
						is[i_6_] = i_11_;
						int i_12_ = is_2_[i_10_];
						is_2_[i_10_] = is_2_[i_6_];
						is_2_[i_6_++] = i_12_;
					}
				}
				is[i_3_] = is[i_6_];
				is[i_6_] = i_7_;
				is_2_[i_3_] = is_2_[i_6_];
				is_2_[i_6_] = i_8_;
				method920(is, is_2_, i, i_6_ - 1, 1275694928);
				method920(is, is_2_, 1 + i_6_, i_3_, 415383023);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yf.i(").append(')').toString());
		}
	}

	static final void method921(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			client.anInt8837 = 1583527743 * (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			Class110.aClass459_6404 = Class275.method2571((((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 * 681479919) + 1]), 2087599862);
			if (null == Class110.aClass459_6404)
				Class110.aClass459_6404 = Class459.aClass459_5671;
			client.anInt8913 = (-1777248765 * (((ClientScript2) class403).anIntArray5244[2 + ((ClientScript2) class403).anInt5239 * 681479919]));
			BufferedConnectionContext class25 = Class429.method5760((short) 512);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2053, class25.aClass449_330, (byte) 32);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(-1168328513 * client.anInt8837);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(1790024195 * Class110.aClass459_6404.anInt5673);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(client.anInt8913 * -1710848853);
			class25.method390(class298_sub36, (byte) -13);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yf.abz(").append(')').toString());
		}
	}
}
