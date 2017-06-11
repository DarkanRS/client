/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class328 {
	public static int anInt3473 = 1;
	short[] aShortArray3474;
	public static int anInt3475 = 4;
	public static int anInt3476 = 8;
	public static int anInt3477 = 16;
	public static int anInt3478 = 2;
	byte aByte3479;
	short aShort3480;
	short aShort3481;
	byte aByte3482;
	short aShort3483;
	int[] anIntArray3484;
	int[] anIntArray3485;
	int[] anIntArray3486;
	short aShort3487;
	short[] aShortArray3488;
	short[] aShortArray3489;

	Class328(Class331 class331, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		((Class328) this).aByte3482 = (byte) i;
		((Class328) this).aByte3479 = (byte) i_0_;
		((Class328) this).anIntArray3484 = new int[4];
		((Class328) this).anIntArray3485 = new int[4];
		((Class328) this).anIntArray3486 = new int[4];
		((Class328) this).anIntArray3484[0] = i_1_;
		((Class328) this).anIntArray3484[1] = i_2_;
		((Class328) this).anIntArray3484[2] = i_3_;
		((Class328) this).anIntArray3484[3] = i_4_;
		((Class328) this).anIntArray3485[0] = i_5_;
		((Class328) this).anIntArray3485[1] = i_6_;
		((Class328) this).anIntArray3485[2] = i_7_;
		((Class328) this).anIntArray3485[3] = i_8_;
		((Class328) this).anIntArray3486[0] = i_9_;
		((Class328) this).anIntArray3486[1] = i_10_;
		((Class328) this).anIntArray3486[2] = i_11_;
		((Class328) this).anIntArray3486[3] = i_12_;
		((Class328) this).aShort3487 = (short) (i_1_ >> -1688804109 * class331.anInt3504);
		((Class328) this).aShort3481 = (short) (i_3_ >> -1688804109 * class331.anInt3504);
		((Class328) this).aShort3480 = (short) (i_9_ >> -1688804109 * class331.anInt3504);
		((Class328) this).aShort3483 = (short) (i_11_ >> class331.anInt3504 * -1688804109);
		((Class328) this).aShortArray3474 = new short[4];
		((Class328) this).aShortArray3488 = new short[4];
		((Class328) this).aShortArray3489 = new short[4];
	}

	static final void method3985(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class441.method5865(class105, class119, class403, 1592585834);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nr.kz(").append(')').toString());
		}
	}

	static final void method3986(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.playerIndex * -442628795;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nr.vd(").append(')').toString());
		}
	}

	static final void method3987(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5241 -= 1938723502;
			String string = (String) (((ClientScript2) class403).anObjectArray5240[((ClientScript2) class403).anInt5241 * -203050393]);
			String string_13_ = ((String) (((ClientScript2) class403).anObjectArray5240[-203050393 * ((ClientScript2) class403).anInt5241 + 1]));
			Class63.method741(string, string_13_, 2101690439);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nr.agx(").append(')').toString());
		}
	}

	static final void method3988(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7570.method5681(-1938875884) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nr.aot(").append(')').toString());
		}
	}

	public static String method3989(String string, int i) {
		try {
			StringBuilder stringbuilder = new StringBuilder();
			int i_14_ = string.length();
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
				char c = string.charAt(i_15_);
				if (37 == c && i_14_ > i_15_ + 2) {
					c = string.charAt(i_15_ + 1);
					boolean bool = false;
					int i_16_;
					if (c >= 48 && c <= 57)
						i_16_ = c - 48;
					else if (c >= 97 && c <= 102)
						i_16_ = 10 + c - 97;
					else if (c >= 65 && c <= 70)
						i_16_ = c + 10 - 65;
					else {
						stringbuilder.append('%');
						continue;
					}
					i_16_ *= 16;
					int i_17_ = string.charAt(i_15_ + 2);
					if (i_17_ >= 48 && i_17_ <= 57)
						i_16_ += i_17_ - 48;
					else if (i_17_ >= 97 && i_17_ <= 102)
						i_16_ += i_17_ + 10 - 97;
					else if (i_17_ >= 65 && i_17_ <= 70)
						i_16_ += i_17_ + 10 - 65;
					else {
						stringbuilder.append('%');
						continue;
					}
					if (0 != i_16_ && Class422_Sub29.method5729((byte) i_16_, (short) 18002))
						stringbuilder.append(Class493.method6190((byte) i_16_, 2122534616));
					i_15_ += 2;
				} else if (c == 43)
					stringbuilder.append(' ');
				else
					stringbuilder.append(c);
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nr.a(").append(')').toString());
		}
	}

	static final void method3990(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			if (-1309843523 * ((Class390) class390).aClass105_4168.anInt1154 == -1) {
				if (((ClientScript2) class403).aBoolean5261)
					throw new RuntimeException("");
				throw new RuntimeException("");
			}
			IComponentDefinition class105 = class390.method4868(-2049654672);
			class105.aClass105Array1292[-1309843523 * ((Class390) class390).aClass105_4168.anInt1154] = null;
			Tradution.method6054(class105, 575626440);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nr.bt(").append(')').toString());
		}
	}
}
