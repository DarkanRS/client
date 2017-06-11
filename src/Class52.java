/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class52 {
	public static Class243 aClass243_507;
	static Class4 aClass4_508;

	public abstract int method544();

	public abstract int method545();

	abstract boolean method546();

	public abstract int method547();

	abstract boolean method136();

	Class52() {
		/* empty */
	}

	abstract boolean method548();

	abstract boolean method134();

	public abstract void method137();

	public abstract void method135();

	public abstract void method138();

	public abstract int method549();

	public abstract int method550();

	public abstract int method551();

	public abstract int method552();

	static final void method553(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5245 -= -1365138610;
			if ((((ClientScript2) class403).aLongArray5251[1685767703 * ((ClientScript2) class403).anInt5245]) > (((ClientScript2) class403).aLongArray5251[1685767703 * ((ClientScript2) class403).anInt5245 + 1]))
				((ClientScript2) class403).anInt5259 += (286750741 * (((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cb.bb(").append(')').toString());
		}
	}

	static final void method554(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = Class248.decryptStringMessage(string, 757970283);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cb.zc(").append(')').toString());
		}
	}

	static Class4 method555(int i, byte i_0_) {
		try {
			if (i == 0) {
				if (3.0 == (double) Class301_Sub1.aFloat3233)
					return Class381.aClass4_4119;
				if (4.0 == (double) Class301_Sub1.aFloat3233)
					return Class255.aClass4_2795;
				if (6.0 == (double) Class301_Sub1.aFloat3233)
					return aClass4_508;
				if ((double) Class301_Sub1.aFloat3233 >= 8.0)
					return Class414.aClass4_5326;
			} else if (1 == i) {
				if (3.0 == (double) Class301_Sub1.aFloat3233)
					return aClass4_508;
				if (4.0 == (double) Class301_Sub1.aFloat3233)
					return Class414.aClass4_5326;
				if ((double) Class301_Sub1.aFloat3233 == 6.0)
					return Class355.aClass4_6525;
				if ((double) Class301_Sub1.aFloat3233 >= 8.0)
					return Class400.aClass4_5224;
			} else if (2 == i) {
				if (3.0 == (double) Class301_Sub1.aFloat3233)
					return Class355.aClass4_6525;
				if ((double) Class301_Sub1.aFloat3233 == 4.0)
					return Class400.aClass4_5224;
				if (6.0 == (double) Class301_Sub1.aFloat3233)
					return Class152.aClass4_1594;
				if ((double) Class301_Sub1.aFloat3233 >= 8.0)
					return Class241.aClass4_2707;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cb.bt(").append(')').toString());
		}
	}

	public static String method556(byte[] is, int i, int i_1_, int i_2_) {
		try {
			char[] cs = new char[i_1_];
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < i_1_; i_4_++) {
				int i_5_ = is[i_4_ + i] & 0xff;
				if (0 == i_5_) {
					if (i_2_ == 1825442367)
						throw new IllegalStateException();
				} else {
					if (i_5_ >= 128 && i_5_ < 160) {
						int i_6_ = Class419.aCharArray5340[i_5_ - 128];
						if (0 == i_6_)
							i_6_ = 63;
						i_5_ = i_6_;
					}
					cs[i_3_++] = (char) i_5_;
				}
			}
			return new String(cs, 0, i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("cb.u(").append(')').toString());
		}
	}
}
