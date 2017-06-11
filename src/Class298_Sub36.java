/* Class298_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class298_Sub36 extends Linkable {
	public RsBitsBuffer aClass298_Sub53_Sub2_7396;
	int anInt7397;
	static int anInt7398;
	public int anInt7399;
	static int anInt7400;
	OutcommingPacket aClass198_7401;
	static Class298_Sub36[] aClass298_Sub36Array7402 = new Class298_Sub36[300];
	public static Frame aFrame7403;

	public void method3400(int i) {
		try {
			if (anInt7400 * -848307417 < aClass298_Sub36Array7402.length)
				aClass298_Sub36Array7402[((anInt7400 += 265413783) * -848307417 - 1)] = this;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abu.p(").append(')').toString());
		}
	}

	Class298_Sub36() {
		/* empty */
	}

	static {
		anInt7400 = 0;
	}

	public static final void method3401(int i, int i_0_, int i_1_, int i_2_, boolean bool, int i_3_) {
		try {
			if (i_1_ < 1)
				i_1_ = 1;
			if (i_2_ < 1)
				i_2_ = 1;
			int i_4_ = i_2_ - 334;
			if (i_4_ < 0)
				i_4_ = 0;
			else if (i_4_ > 100)
				i_4_ = 100;
			int i_5_ = (client.aShort8928 + (client.aShort8929 - client.aShort8928) * i_4_ / 100);
			int i_6_ = i_2_ * i_5_ * 512 / (i_1_ * 334);
			if (i_6_ < client.aShort8934) {
				i_6_ = client.aShort8934;
				i_5_ = i_1_ * i_6_ * 334 / (512 * i_2_);
				if (i_5_ > client.aShort8743) {
					i_5_ = client.aShort8743;
					int i_7_ = i_2_ * i_5_ * 512 / (i_6_ * 334);
					int i_8_ = (i_1_ - i_7_) / 2;
					if (bool) {
						Class373.aClass_ra4071.L();
						Class373.aClass_ra4071.method5015(i, i_0_, i_8_, i_2_, -16777216, (byte) 7);
						Class373.aClass_ra4071.method5015(i_1_ + i - i_8_, i_0_, i_8_, i_2_, -16777216, (byte) 7);
					}
					i += i_8_;
					i_1_ -= i_8_ * 2;
				}
			} else if (i_6_ > client.aShort8935) {
				i_6_ = client.aShort8935;
				i_5_ = i_1_ * i_6_ * 334 / (i_2_ * 512);
				if (i_5_ < client.aShort8839) {
					i_5_ = client.aShort8839;
					int i_9_ = i_1_ * i_6_ * 334 / (i_5_ * 512);
					int i_10_ = (i_2_ - i_9_) / 2;
					if (bool) {
						Class373.aClass_ra4071.L();
						Class373.aClass_ra4071.method5015(i, i_0_, i_1_, i_10_, -16777216, (byte) 7);
						Class373.aClass_ra4071.method5015(i, i_0_ + i_2_ - i_10_, i_1_, i_10_, -16777216, (byte) 7);
					}
					i_0_ += i_10_;
					i_2_ -= i_10_ * 2;
				}
			}
			client.anInt8940 = i_5_ * i_2_ / 334 * 1463025151;
			client.anInt8936 = i * 1925400255;
			client.anInt8747 = i_0_ * -249668627;
			client.anInt8664 = -2079606657 * (short) i_1_;
			client.anInt8939 = (short) i_2_ * -34894995;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abu.iy(").append(')').toString());
		}
	}
}
