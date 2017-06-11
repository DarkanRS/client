/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public abstract class Class374 {
	int anInt4073;
	Class453 aClass453_4074 = new Class453();
	long aLong4075;
	long aLong4076 = -3541606857845020581L;
	int anInt4077;
	public static int[] anIntArray4078;

	abstract void method4612(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50);

	abstract void method4613();

	void method4614(int i) {
		try {
			((Class374) this).aClass453_4074.method5943((byte) 1);
			((Class374) this).aLong4076 = -3541606857845020581L;
			((Class374) this).aLong4075 = -142159167877835417L;
			((Class374) this).anInt4073 = 570832405;
			((Class374) this).anInt4077 = -1631848437;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("po.f(").append(')').toString());
		}
	}

	int method4615(Class298_Sub50 class298_sub50, int i, byte i_0_) {
		try {
			long l;
			if (-1L == ((Class374) this).aLong4076 * 2660634464725530669L)
				l = (long) i;
			else {
				l = (class298_sub50.method3549((byte) 97) - 2660634464725530669L * ((Class374) this).aLong4076);
				if (l > (long) i)
					l = (long) i;
			}
			((Class374) this).aLong4076 = class298_sub50.method3549((byte) 19) * 3541606857845020581L;
			return (int) l;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("po.p(").append(')').toString());
		}
	}

	abstract int method4616(int i);

	abstract void method4617(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50, byte i);

	abstract void method4618(byte i);

	abstract boolean method4619(int i);

	void method4620(Class298_Sub50 class298_sub50, int i) {
		try {
			((Class374) this).aClass453_4074.method5935(class298_sub50, 357494730);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("po.b(").append(')').toString());
		}
	}

	abstract void method4621();

	abstract void method4622();

	abstract boolean method4623();

	abstract boolean method4624();

	abstract Class298_Sub36 method4625();

	void method4626(int i) {
		try {
			if (method4619(-304373014)) {
				Class298_Sub36 class298_sub36 = null;
				int i_1_ = 0;
				int i_2_ = 0;
				int i_3_ = 0;
				Iterator iterator = ((Class374) this).aClass453_4074.iterator();
				while (iterator.hasNext()) {
					Class298_Sub50 class298_sub50 = (Class298_Sub50) iterator.next();
					if (class298_sub36 != null && (385051775 * (class298_sub36.aClass298_Sub53_Sub2_7396.index) - i_1_) >= 252 - (6 + method4616(-1861387813))) {
						if (i <= 775068819)
							throw new IllegalStateException();
						break;
					}
					class298_sub50.unlink(-1460969981);
					int i_4_ = class298_sub50.method3560(-1730629098);
					if (i_4_ < -1)
						i_4_ = -1;
					else if (i_4_ > 65534)
						i_4_ = 65534;
					int i_5_ = class298_sub50.method3547((byte) 55);
					if (i_5_ < -1)
						i_5_ = -1;
					else if (i_5_ > 65534)
						i_5_ = 65534;
					if (i_5_ == 954406595 * ((Class374) this).anInt4073 && -782291875 * ((Class374) this).anInt4077 == i_4_)
						class298_sub50.method3550(2126248838);
					else {
						if (class298_sub36 == null) {
							class298_sub36 = method4633((byte) -59);
							class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(0);
							i_1_ = 385051775 * (class298_sub36.aClass298_Sub53_Sub2_7396.index);
							class298_sub36.aClass298_Sub53_Sub2_7396.index += 232826622;
							i_2_ = 0;
							i_3_ = 0;
						}
						int i_6_;
						int i_7_;
						int i_8_;
						if (-1L != (((Class374) this).aLong4075 * 8383148474145196457L)) {
							i_6_ = (i_5_ - ((Class374) this).anInt4073 * 954406595);
							i_7_ = i_4_ - (-782291875 * ((Class374) this).anInt4077);
							i_8_ = (int) ((class298_sub50.method3549((byte) 19) - (8383148474145196457L * ((Class374) this).aLong4075)) / 20L);
							i_2_ += (class298_sub50.method3549((byte) 70) - (((Class374) this).aLong4075 * 8383148474145196457L)) % 20L;
						} else {
							i_6_ = i_5_;
							i_7_ = i_4_;
							i_8_ = 2147483647;
						}
						((Class374) this).anInt4073 = -570832405 * i_5_;
						((Class374) this).anInt4077 = i_4_ * 1631848437;
						if (i_8_ < 8 && i_6_ >= -32 && i_6_ <= 31 && i_7_ >= -32 && i_7_ <= 31) {
							i_6_ += 32;
							i_7_ += 32;
							class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(i_7_ + ((i_6_ << 6) + (i_8_ << 12)), 16711935);
						} else if (i_8_ < 32 && i_6_ >= -128 && i_6_ <= 127 && i_7_ >= -128 && i_7_ <= 127) {
							i_6_ += 128;
							i_7_ += 128;
							class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(128 + i_8_);
							class298_sub36.aClass298_Sub53_Sub2_7396.writeShort((i_6_ << 8) + i_7_, 16711935);
						} else if (i_8_ < 32) {
							class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(i_8_ + 192);
							if (-1 == i_5_ || -1 == i_4_)
								class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(-2147483648, -1667030496);
							else
								class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(i_5_ | i_4_ << 16, -1192850117);
						} else {
							class298_sub36.aClass298_Sub53_Sub2_7396.writeShort((i_8_ & 0x1fff) + 57344, 16711935);
							if (i_5_ == -1 || i_4_ == -1)
								class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(-2147483648, -1243424394);
							else
								class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(i_5_ | i_4_ << 16, 84476800);
						}
						i_3_++;
						method4617(class298_sub36.aClass298_Sub53_Sub2_7396, class298_sub50, (byte) 0);
						((Class374) this).aLong4075 = (class298_sub50.method3549((byte) 123) * 142159167877835417L);
						class298_sub50.method3550(1701654239);
					}
				}
				if (class298_sub36 != null) {
					class298_sub36.aClass298_Sub53_Sub2_7396.method3649(385051775 * (class298_sub36.aClass298_Sub53_Sub2_7396.index) - i_1_, (byte) -33);
					int i_9_ = 385051775 * (class298_sub36.aClass298_Sub53_Sub2_7396.index);
					class298_sub36.aClass298_Sub53_Sub2_7396.index = i_1_ * 116413311;
					class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(i_2_ / i_3_);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(i_2_ % i_3_);
					class298_sub36.aClass298_Sub53_Sub2_7396.index = 116413311 * i_9_;
					client.gameConnection.method390(class298_sub36, (byte) -85);
				}
			}
			method4618((byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("po.a(").append(')').toString());
		}
	}

	abstract void method4627(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50);

	abstract int method4628();

	abstract int method4629();

	Class374() {
		((Class374) this).aLong4075 = -142159167877835417L;
		((Class374) this).anInt4073 = 570832405;
		((Class374) this).anInt4077 = -1631848437;
	}

	abstract void method4630(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50);

	abstract Class298_Sub36 method4631();

	abstract void method4632(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50);

	abstract Class298_Sub36 method4633(byte i);

	abstract boolean method4634();

	abstract int method4635();

	static final void method4636(ClientScript2 class403, int i) {
		try {
			int i_10_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) (Math.random() * (double) i_10_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("po.yq(").append(')').toString());
		}
	}

	static final void method4637(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((ClientScript2) class403).aClass298_Sub25_5237.aByte7355;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("po.xq(").append(')').toString());
		}
	}

	static final void method4638(ClientScript2 class403, short i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class241.method2247(class105, class119, class403, -533196439);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("po.eg(").append(')').toString());
		}
	}
}
