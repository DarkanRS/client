/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class319 {
	public abstract void method3877();

	public abstract boolean method3878(int i);

	public abstract Class298_Sub50 method3879(int i);

	public abstract boolean method3880(byte i);

	public boolean method3881(byte i) {
		try {
			return (method3878(1488304464) || method3887(1935628895) || method3880((byte) 86));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nh.d(").append(')').toString());
		}
	}

	public abstract void method3882(byte i);

	public abstract int getMouseY(byte i);

	Class319() {
		/* empty */
	}

	public abstract void method3884();

	public abstract Class298_Sub50 method3885();

	public abstract void method3886(int i);

	public abstract boolean method3887(int i);

	public abstract boolean method3888();

	public abstract boolean method3889();

	public abstract boolean method3890();

	public abstract boolean method3891();

	public abstract boolean method3892();

	public abstract boolean method3893();

	public abstract int getMouseX(byte i);

	public abstract int method3895();

	public abstract Class298_Sub50 method3896();

	public abstract void method3897();

	public abstract void method3898();

	public abstract int method3899();

	static void method3900(GraphicsToolkit class_ra, int i, int i_0_, int i_1_, int i_2_, int i_3_, Class264 class264, Class505 class505, String string, int i_4_) {
		try {
			int i_5_ = (255 - -1274801891 * Class82_Sub4.anInt6833 - Class436.anInt5498 * 1868123923);
			if (i_5_ < 0)
				i_5_ = 0;
			if (Class313.aClass57_3299 == null || Class423.aClass57_5356 == null) {
				if (Class158.aClass243_6364.method2310(Class362.anInt3918 * 142643703, -457216440) && Class158.aClass243_6364.method2310(((Class422_Sub14.anInt8400) * 1757615047), -457216440)) {
					Class313.aClass57_3299 = (class_ra.method5125(Class89.method987(Class158.aClass243_6364, Class362.anInt3918 * 142643703, 0), true));
					Class89 class89 = Class89.method987(Class158.aClass243_6364, (Class422_Sub14.anInt8400 * 1757615047), 0);
					Class423.aClass57_5356 = class_ra.method5125(class89, true);
					class89.method992();
					Class74.aClass57_700 = class_ra.method5125(class89, true);
				} else
					class_ra.B(i, i_0_, i_1_, i_3_, i_5_ << 24 | 1018380409 * Class464.anInt5958, 1);
			}
			if (Class313.aClass57_3299 != null && Class423.aClass57_5356 != null) {
				int i_6_ = ((i_1_ - Class423.aClass57_5356.method623() * 2) / Class313.aClass57_3299.method623());
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
					Class313.aClass57_3299.method645((i + Class423.aClass57_5356.method623() + i_7_ * Class313.aClass57_3299.method623()), i_0_);
				Class423.aClass57_5356.method645(i, i_0_);
				Class74.aClass57_700.method645(i_1_ + i - Class74.aClass57_700.method623(), i_0_);
			}
			class264.method2488(string, 3 + i, ((20 - 1110385787 * class505.anInt6202) / 2 + (i_0_ + 1110385787 * class505.anInt6202)), -1067973831 * Class343.anInt3674 | ~0xffffff, -1, 772459815);
			class_ra.B(i, i_3_ + i_0_, i_1_, i_2_ - i_3_, i_5_ << 24 | Class464.anInt5958 * 1018380409, 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nh.ac(").append(')').toString());
		}
	}

	static final void method3901(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			int i_8_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_9_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			int i_10_ = (((ClientScript2) class403).anIntArray5244[2 + ((ClientScript2) class403).anInt5239 * 681479919]);
			int i_11_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 3]);
			i_8_ += i_9_ << 14;
			i_8_ += i_10_ << 28;
			i_8_ += i_11_;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nh.uu(").append(')').toString());
		}
	}

	static boolean method3902(int i, int i_12_) {
		try {
			return i == 19 || 14 == i || 18 == i || 0 == i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nh.fn(").append(')').toString());
		}
	}

	public static final void method3903(byte i) {
		try {
			BufferedConnectionContext class25 = Class429.method5760((short) 512);
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.JOIN_FRIEND_CHAT_PACKET, class25.aClass449_330, (byte) 59);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(0);
			class25.method390(class298_sub36, (byte) -71);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nh.ml(").append(')').toString());
		}
	}

	static void method3904(int i) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(15, 0L);
			class298_sub37_sub12.method3445(-900144368);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nh.ae(").append(')').toString());
		}
	}
}
