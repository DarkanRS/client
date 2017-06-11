/* Class298_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub9 extends Linkable {
	static Class348 aClass348_7223;
	static HashTable aClass437_7224 = new HashTable(32);
	static int anInt7225;
	int[] anIntArray7226 = { -1 };
	int[] anIntArray7227 = { 0 };
	static int anInt7228;

	static {
		aClass348_7223 = new Class348(10);
	}

	Class298_Sub9() {
		/* empty */
	}

	final Class387 method2891(GraphicsToolkit class_ra, int i, Class438 class438, int i_0_, boolean bool, Class366 class366, byte i_1_) {
		try {
			Class387 class387 = null;
			int i_2_ = i;
			Class350 class350 = null;
			if (-1 != i_0_)
				class350 = Class94.aClass349_913.method4202(i_0_, (byte) 89);
			int[] is = ((Class298_Sub9) this).anIntArray7226;
			if (null != class350 && null != class350.anIntArray3732) {
				is = new int[class350.anIntArray3732.length];
				for (int i_3_ = 0; i_3_ < class350.anIntArray3732.length; i_3_++) {
					int i_4_ = class350.anIntArray3732[i_3_];
					if (i_4_ >= 0 && i_4_ < ((Class298_Sub9) this).anIntArray7226.length)
						is[i_3_] = ((Class298_Sub9) this).anIntArray7226[i_4_];
					else
						is[i_3_] = -1;
				}
			}
			if (class438 != null)
				i_2_ |= class438.method5829(-1790708337);
			long l = method2892(is, i_0_, null != class366 ? class366.anIntArray3973 : null, bool, 551500137);
			if (aClass348_7223 != null)
				class387 = (Class387) aClass348_7223.method4184(l);
			if (null == class387 || class_ra.method5017(class387.m(), i_2_) != 0) {
				if (class387 != null)
					i_2_ = class_ra.method5004(i_2_, class387.m());
				int i_5_ = i_2_;
				boolean bool_6_ = false;
				for (int i_7_ = 0; i_7_ < is.length; i_7_++) {
					if (is[i_7_] == -1) {
						if (i_1_ != 1) {
							/* empty */
						}
					} else if (!Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(is[i_7_]).method6034(bool, null, (byte) -79))
						bool_6_ = true;
				}
				if (bool_6_)
					return null;
				Model[] class64s = new Model[is.length];
				for (int i_8_ = 0; i_8_ < is.length; i_8_++) {
					if (is[i_8_] == -1) {
						if (i_1_ != 1)
							throw new IllegalStateException();
					} else
						class64s[i_8_] = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(is[i_8_]).method6028(bool, null, -1732273011);
				}
				if (class350 != null && null != class350.anIntArrayArray3710) {
					for (int i_9_ = 0; i_9_ < class350.anIntArrayArray3710.length; i_9_++) {
						if (class350.anIntArrayArray3710[i_9_] != null) {
							if (null == class64s[i_9_]) {
								if (i_1_ != 1)
									throw new IllegalStateException();
							} else {
								int i_10_ = class350.anIntArrayArray3710[i_9_][0];
								int i_11_ = class350.anIntArrayArray3710[i_9_][1];
								int i_12_ = class350.anIntArrayArray3710[i_9_][2];
								int i_13_ = class350.anIntArrayArray3710[i_9_][3];
								int i_14_ = class350.anIntArrayArray3710[i_9_][4];
								int i_15_ = class350.anIntArrayArray3710[i_9_][5];
								if (i_13_ != 0 || i_14_ != 0 || i_15_ != 0)
									class64s[i_9_].method754(i_13_, i_14_, i_15_);
								if (i_10_ != 0 || 0 != i_11_ || 0 != i_12_)
									class64s[i_9_].method753(i_10_, i_11_, i_12_);
							}
						}
					}
				}
				Model model = new Model(class64s, class64s.length);
				if (null != class366)
					i_5_ |= 0x4000;
				class387 = class_ra.method5037(model, i_5_, anInt7225 * 1310831989, 66, 850);
				if (class366 != null) {
					for (int i_16_ = 0; i_16_ < 10; i_16_++) {
						for (int i_17_ = 0; (i_17_ < Class366.aShortArrayArray3970[i_16_].length); i_17_++) {
							if (class366.anIntArray3973[i_16_] < (Class22.aShortArrayArrayArray278[i_16_][i_17_]).length)
								class387.X((Class366.aShortArrayArray3970[i_16_][i_17_]), (Class22.aShortArrayArrayArray278[i_16_][i_17_][class366.anIntArray3973[i_16_]]));
						}
					}
				}
				if (null != aClass348_7223) {
					class387.KA(i_2_);
					aClass348_7223.method4194(class387, l);
				}
			}
			if (class438 == null)
				return class387;
			Class387 class387_18_ = class387.method4755((byte) 1, i_2_, true);
			class438.method5839(class387_18_, 0, -1119502581);
			return class387_18_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aam.n(").append(')').toString());
		}
	}

	long method2892(int[] is, int i, int[] is_19_, boolean bool, int i_20_) {
		try {
			long[] ls = RsByteBuffer.aLongArray7619;
			long l = -1L;
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (i >> 8)) & 0xffL)];
			l = l >>> 8 ^ ls[(int) ((l ^ (long) i) & 0xffL)];
			for (int i_21_ = 0; i_21_ < is.length; i_21_++) {
				l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_21_] >> 24)) & 0xffL)];
				l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_21_] >> 16)) & 0xffL)];
				l = l >>> 8 ^ ls[(int) ((l ^ (long) (is[i_21_] >> 8)) & 0xffL)];
				l = l >>> 8 ^ ls[(int) ((l ^ (long) is[i_21_]) & 0xffL)];
			}
			if (null != is_19_) {
				for (int i_22_ = 0; i_22_ < 5; i_22_++)
					l = l >>> 8 ^ ls[(int) ((l ^ (long) is_19_[i_22_]) & 0xffL)];
			}
			l = l >>> 8 ^ ls[(int) ((l ^ (long) (bool ? 1 : 0)) & 0xffL)];
			return l;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aam.q(").append(')').toString());
		}
	}

	static void method2893(RsByteBuffer class298_sub53, int i) {
		try {
			for (int i_23_ = 0; i_23_ < 1017276543 * Class24.anInt9950; i_23_++) {
				int i_24_ = class298_sub53.readUnsignedSmart(1723054621);
				int i_25_ = class298_sub53.readUnsignedShort();
				if (i_25_ == 65535)
					i_25_ = -1;
				if (null != Class131.aClass343_Sub1Array1498[i_24_])
					Class131.aClass343_Sub1Array1498[i_24_].anInt3666 = i_25_ * 2083476291;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aam.p(").append(')').toString());
		}
	}
}
