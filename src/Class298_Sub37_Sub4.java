/* Class298_Sub37_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub37_Sub4 extends Class298_Sub37 {
	Class96[] aClass96Array9579;
	int anInt9580;
	byte[][] aByteArrayArray9581;
	static Class243 aClass243_9582;

	public boolean method3412(byte i) {
		try {
			if (((Class298_Sub37_Sub4) this).aClass96Array9579 != null)
				return true;
			if (((Class298_Sub37_Sub4) this).aByteArrayArray9581 == null) {
				synchronized (Class317.aClass243_3321) {
					if (!Class317.aClass243_3321.method2291(1899473659 * ((Class298_Sub37_Sub4) this).anInt9580, 334179097)) {
						boolean bool = false;
						return bool;
					}
					int[] is = (Class317.aClass243_3321.method2307((((Class298_Sub37_Sub4) this).anInt9580 * 1899473659), -2074944518));
					((Class298_Sub37_Sub4) this).aByteArrayArray9581 = new byte[is.length][];
					for (int i_0_ = 0; i_0_ < is.length; i_0_++)
						((Class298_Sub37_Sub4) this).aByteArrayArray9581[i_0_] = (Class317.aClass243_3321.method2315((1899473659 * ((Class298_Sub37_Sub4) this).anInt9580), is[i_0_], (byte) -7));
				}
			}
			boolean bool = true;
			for (int i_1_ = 0; (i_1_ < ((Class298_Sub37_Sub4) this).aByteArrayArray9581.length); i_1_++) {
				byte[] is = ((Class298_Sub37_Sub4) this).aByteArrayArray9581[i_1_];
				RsByteBuffer class298_sub53 = new RsByteBuffer(is);
				class298_sub53.index = 116413311;
				int i_2_ = class298_sub53.readUnsignedShort();
				synchronized (aClass243_9582) {
					bool &= aClass243_9582.method2310(i_2_, -457216440);
				}
			}
			if (!bool)
				return false;
			Class458 class458 = new Class458();
			int[] is;
			synchronized (Class317.aClass243_3321) {
				int i_3_ = (Class317.aClass243_3321.method2316(((Class298_Sub37_Sub4) this).anInt9580 * 1899473659, -222662329));
				((Class298_Sub37_Sub4) this).aClass96Array9579 = new Class96[i_3_];
				is = Class317.aClass243_3321.method2307((((Class298_Sub37_Sub4) this).anInt9580 * 1899473659), -2046558264);
			}
			for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
				byte[] is_5_ = ((Class298_Sub37_Sub4) this).aByteArrayArray9581[i_4_];
				RsByteBuffer class298_sub53 = new RsByteBuffer(is_5_);
				class298_sub53.index = 116413311;
				int i_6_ = class298_sub53.readUnsignedShort();
				Class298_Sub15 class298_sub15 = null;
				for (Class298_Sub15 class298_sub15_7_ = (Class298_Sub15) class458.method5967(2084946117); class298_sub15_7_ != null; class298_sub15_7_ = (Class298_Sub15) class458.method5969((byte) -23)) {
					if (i_6_ == (((Class298_Sub15) class298_sub15_7_).anInt7276 * 1029066723)) {
						class298_sub15 = class298_sub15_7_;
						break;
					}
				}
				if (null == class298_sub15) {
					synchronized (aClass243_9582) {
						class298_sub15 = (new Class298_Sub15(i_6_, aClass243_9582.method2294(i_6_, (byte) 34)));
					}
					class458.method5968(class298_sub15, 805140432);
				}
				((Class298_Sub37_Sub4) this).aClass96Array9579[is[i_4_]] = new Class96(is_5_, class298_sub15);
			}
			((Class298_Sub37_Sub4) this).aByteArrayArray9581 = null;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.f(").append(')').toString());
		}
	}

	public boolean method3413(int i, byte i_8_) {
		try {
			return (((Class96) ((Class298_Sub37_Sub4) this).aClass96Array9579[i]).aBoolean940);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.p(").append(')').toString());
		}
	}

	public boolean method3414(int i, byte i_9_) {
		try {
			return (((Class96) ((Class298_Sub37_Sub4) this).aClass96Array9579[i]).aBoolean941);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.i(").append(')').toString());
		}
	}

	public Class298_Sub37_Sub4(int i) {
		((Class298_Sub37_Sub4) this).anInt9580 = -2073571277 * i;
	}

	public boolean method3415(int i, int i_10_) {
		try {
			return (((Class96) ((Class298_Sub37_Sub4) this).aClass96Array9579[i]).aBoolean939);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aih.b(").append(')').toString());
		}
	}
}
