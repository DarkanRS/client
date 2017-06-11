/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class296 {
	public int[] anIntArray3168;
	public int anInt3169;
	public int[] anIntArray3170;

	public Class296(int i) {
		anInt3169 = 526813095 * i;
		anIntArray3168 = new int[anInt3169 * -1407078377];
		anIntArray3170 = new int[anInt3169 * -1407078377];
	}

	static final void method2829(ClientScript2 class403, byte i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class298_Sub37_Sub14 class298_sub37_sub14 = Class447.aClass469_5618.method6045(i_0_, (short) -22209);
			if (class298_sub37_sub14.anIntArray9653 == null)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = class298_sub37_sub14.anIntArray9653.length;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mi.acn(").append(')').toString());
		}
	}

	public static long method2830(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, byte i_6_) {
		try {
			Class490.aCalendar6075.clear();
			Class490.aCalendar6075.set(i_5_, i_4_, i_3_, i_2_, i_1_, i);
			return Class490.aCalendar6075.getTime().getTime();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mi.x(").append(')').toString());
		}
	}

	static final void method2831(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub18_7561.method5693(-919235605) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mi.ajl(").append(')').toString());
		}
	}

	static final void method2832(ClientScript2 class403, byte i) {
		try {
			int i_7_ = (((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]);
			((ClientScript2) class403).anInt5241 -= i_7_ * 969361751;
			String string = Class_ta.method5996(((ClientScript2) class403).anObjectArray5240, (-203050393 * ((ClientScript2) class403).anInt5241), i_7_, (byte) 0);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mi.aw(").append(')').toString());
		}
	}

	static final void method2833(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5241 -= 1938723502;
			((ClientScript2) class403).anInt5239 -= -783761378;
			Class18.method362((String) (((ClientScript2) class403).anObjectArray5240[((ClientScript2) class403).anInt5241 * -203050393]), (String) (((ClientScript2) class403).anObjectArray5240[-203050393 * ((ClientScript2) class403).anInt5241 + 1]), (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]), 1 == (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]), -1761866879);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mi.age(").append(')').toString());
		}
	}

	static void method2834(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		try {
			int i_13_ = 0;
			int i_14_ = i_10_;
			int i_15_ = i_9_ * i_9_;
			int i_16_ = i_10_ * i_10_;
			int i_17_ = i_16_ << 1;
			int i_18_ = i_15_ << 1;
			int i_19_ = i_10_ << 1;
			int i_20_ = (1 - i_19_) * i_15_ + i_17_;
			int i_21_ = i_16_ - i_18_ * (i_19_ - 1);
			int i_22_ = i_15_ << 2;
			int i_23_ = i_16_ << 2;
			int i_24_ = i_17_ * ((i_13_ << 1) + 3);
			int i_25_ = i_18_ * ((i_14_ << 1) - 3);
			int i_26_ = i_23_ * (1 + i_13_);
			int i_27_ = i_22_ * (i_14_ - 1);
			if (i_8_ >= Class372_Sub1_Sub1.anInt4049 * 1155384281 && i_8_ <= Class372_Sub1_Sub1.anInt4050 * -1062447355) {
				int i_28_ = Class463.method6012(i_9_ + i, (Class372_Sub1_Sub1.anInt4051 * -1424479739), (Class372_Sub1_Sub1.anInt4048 * 1135094847), -1212608691);
				int i_29_ = Class463.method6012(i - i_9_, (Class372_Sub1_Sub1.anInt4051 * -1424479739), (Class372_Sub1_Sub1.anInt4048 * 1135094847), -1212608691);
				Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_8_]), i_29_, i_28_, i_11_, 1327265891);
			}
			while (i_14_ > 0) {
				if (i_20_ < 0) {
					while (i_20_ < 0) {
						i_20_ += i_24_;
						i_21_ += i_26_;
						i_24_ += i_23_;
						i_26_ += i_23_;
						i_13_++;
					}
				}
				if (i_21_ < 0) {
					i_20_ += i_24_;
					i_21_ += i_26_;
					i_24_ += i_23_;
					i_26_ += i_23_;
					i_13_++;
				}
				i_20_ += -i_27_;
				i_21_ += -i_25_;
				i_25_ -= i_22_;
				i_27_ -= i_22_;
				i_14_--;
				int i_30_ = i_8_ - i_14_;
				int i_31_ = i_14_ + i_8_;
				if (i_31_ >= Class372_Sub1_Sub1.anInt4049 * 1155384281 && i_30_ <= Class372_Sub1_Sub1.anInt4050 * -1062447355) {
					int i_32_ = Class463.method6012(i + i_13_, (-1424479739 * Class372_Sub1_Sub1.anInt4051), (1135094847 * Class372_Sub1_Sub1.anInt4048), -1212608691);
					int i_33_ = Class463.method6012(i - i_13_, (-1424479739 * Class372_Sub1_Sub1.anInt4051), (Class372_Sub1_Sub1.anInt4048 * 1135094847), -1212608691);
					if (i_30_ >= 1155384281 * Class372_Sub1_Sub1.anInt4049)
						Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_30_]), i_33_, i_32_, i_11_, -2141002125);
					if (i_31_ <= -1062447355 * Class372_Sub1_Sub1.anInt4050)
						Class82_Sub22.method940((Class372_Sub1_Sub1.anIntArrayArray4047[i_31_]), i_33_, i_32_, i_11_, 1394048143);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mi.ah(").append(')').toString());
		}
	}
}
