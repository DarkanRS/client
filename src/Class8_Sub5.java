
/* Class8_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class8_Sub5 extends FontRenderer {
	Class505_Sub1 aClass505_Sub1_9323;
	Class138 aClass138_9324;
	Class137_Sub1_Sub1 aClass137_Sub1_Sub1_9325;
	boolean aBool9326;

	void method374(char c, int i, int i_0_, int i_1_, boolean bool, Class455 class455, int i_2_, int i_3_) {
		Class455_Sub2 class455_sub2 = (Class455_Sub2) class455;
		Class137_Sub1_Sub1 class137_sub1_sub1 = ((Class455_Sub2) class455_sub2).aClass137_Sub1_Sub1_8974;
		((Class8_Sub5) this).aClass505_Sub1_9323.method13606();
		((Class8_Sub5) this).aClass505_Sub1_9323.method13654(((Class8_Sub5) this).aClass137_Sub1_Sub1_9325);
		if (((Class8_Sub5) this).aBool9326 || bool) {
			((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 8448);
			((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 34168, 768);
		} else
			((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 7681);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13610(1);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13654(class137_sub1_sub1);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 8448);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10132 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10136);
		float f_4_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10133);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_2_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_4_, 0.0F, (float) -i_3_ * f_4_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_1_ >> 16), (byte) (i_1_ >> 8), (byte) i_1_, (byte) (i_1_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_0_, 0.0F);
		((Class8_Sub5) this).aClass138_9324.method2379(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 5890, 768);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13717(8448, 8448);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13654(null);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13610(0);
		if (((Class8_Sub5) this).aBool9326 || bool)
			((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 5890, 768);
	}

	void method362(char c, int i, int i_5_, int i_6_, boolean bool, Class455 class455, int i_7_, int i_8_) {
		Class455_Sub2 class455_sub2 = (Class455_Sub2) class455;
		Class137_Sub1_Sub1 class137_sub1_sub1 = ((Class455_Sub2) class455_sub2).aClass137_Sub1_Sub1_8974;
		((Class8_Sub5) this).aClass505_Sub1_9323.method13606();
		((Class8_Sub5) this).aClass505_Sub1_9323.method13654(((Class8_Sub5) this).aClass137_Sub1_Sub1_9325);
		if (((Class8_Sub5) this).aBool9326 || bool) {
			((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 8448);
			((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 34168, 768);
		} else
			((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 7681);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13610(1);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13654(class137_sub1_sub1);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 8448);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		float f = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10132 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10136);
		float f_9_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10133);
		OpenGL.glTexGenfv(8192, 9474, new float[] { f, 0.0F, 0.0F, (float) -i_7_ * f }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, f_9_, 0.0F, (float) -i_8_ * f_9_ }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (i_6_ >> 16), (byte) (i_6_ >> 8), (byte) i_6_, (byte) (i_6_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_5_, 0.0F);
		((Class8_Sub5) this).aClass138_9324.method2379(c);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 5890, 768);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13717(8448, 8448);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13654(null);
		((Class8_Sub5) this).aClass505_Sub1_9323.method13610(0);
		if (((Class8_Sub5) this).aBool9326 || bool)
			((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 5890, 768);
	}

	void UA(char c, int i, int i_10_, int i_11_, boolean bool) {
		((Class8_Sub5) this).aClass505_Sub1_9323.method13606();
		((Class8_Sub5) this).aClass505_Sub1_9323.method13654(((Class8_Sub5) this).aClass137_Sub1_Sub1_9325);
		if (((Class8_Sub5) this).aBool9326 || bool) {
			((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 8448);
			((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 34168, 768);
		} else
			((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 7681);
		OpenGL.glColor4ub((byte) (i_11_ >> 16), (byte) (i_11_ >> 8), (byte) i_11_, (byte) (i_11_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_10_, 0.0F);
		((Class8_Sub5) this).aClass138_9324.method2379(c);
		OpenGL.glLoadIdentity();
		if (((Class8_Sub5) this).aBool9326 || bool)
			((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 5890, 768);
	}

	void c(char c, int i, int i_12_, int i_13_, boolean bool) {
		((Class8_Sub5) this).aClass505_Sub1_9323.method13606();
		((Class8_Sub5) this).aClass505_Sub1_9323.method13654(((Class8_Sub5) this).aClass137_Sub1_Sub1_9325);
		if (((Class8_Sub5) this).aBool9326 || bool) {
			((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 8448);
			((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 34168, 768);
		} else
			((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 7681);
		OpenGL.glColor4ub((byte) (i_13_ >> 16), (byte) (i_13_ >> 8), (byte) i_13_, (byte) (i_13_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_12_, 0.0F);
		((Class8_Sub5) this).aClass138_9324.method2379(c);
		OpenGL.glLoadIdentity();
		if (((Class8_Sub5) this).aBool9326 || bool)
			((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 5890, 768);
	}

	Class8_Sub5(Class505_Sub1 class505_sub1, Class414 class414, Class91[] class91s, boolean bool) {
		super(class505_sub1, class414);
		((Class8_Sub5) this).aClass505_Sub1_9323 = class505_sub1;
		int i = 0;
		for (int i_14_ = 0; i_14_ < 256; i_14_++) {
			Class91 class91 = class91s[i_14_];
			if (class91.anInt954 > i)
				i = class91.anInt954;
			if (class91.anInt957 > i)
				i = class91.anInt957;
		}
		int i_15_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_15_ * i_15_];
			for (int i_16_ = 0; i_16_ < 256; i_16_++) {
				Class91 class91 = class91s[i_16_];
				int i_17_ = class91.anInt954;
				int i_18_ = class91.anInt957;
				int i_19_ = i_16_ % 16 * i;
				int i_20_ = i_16_ / 16 * i;
				int i_21_ = i_20_ * i_15_ + i_19_;
				int i_22_ = 0;
				if (class91.aByteArray961 == null) {
					byte[] is_23_ = class91.aByteArray960;
					for (int i_24_ = 0; i_24_ < i_17_; i_24_++) {
						for (int i_25_ = 0; i_25_ < i_18_; i_25_++)
							is[i_21_++] = (byte) (is_23_[i_22_++] == 0 ? 0 : -1);
						i_21_ += i_15_ - i_18_;
					}
				} else {
					byte[] is_26_ = class91.aByteArray961;
					for (int i_27_ = 0; i_27_ < i_17_; i_27_++) {
						for (int i_28_ = 0; i_28_ < i_18_; i_28_++)
							is[i_21_++] = is_26_[i_22_++];
						i_21_ += i_15_ - i_18_;
					}
				}
			}
			((Class8_Sub5) this).aClass137_Sub1_Sub1_9325 = Class137_Sub1_Sub1.method15540(class505_sub1, Class150.aClass150_1951, Class76.aClass76_751, i_15_, i_15_, false, is, Class150.aClass150_1951);
			((Class8_Sub5) this).aBool9326 = true;
		} else {
			int[] is = new int[i_15_ * i_15_];
			for (int i_29_ = 0; i_29_ < 256; i_29_++) {
				Class91 class91 = class91s[i_29_];
				int[] is_30_ = class91.anIntArray955;
				byte[] is_31_ = class91.aByteArray961;
				byte[] is_32_ = class91.aByteArray960;
				int i_33_ = class91.anInt954;
				int i_34_ = class91.anInt957;
				int i_35_ = i_29_ % 16 * i;
				int i_36_ = i_29_ / 16 * i;
				int i_37_ = i_36_ * i_15_ + i_35_;
				int i_38_ = 0;
				if (is_31_ != null) {
					for (int i_39_ = 0; i_39_ < i_33_; i_39_++) {
						for (int i_40_ = 0; i_40_ < i_34_; i_40_++) {
							is[i_37_++] = (is_31_[i_38_] << 24 | is_30_[is_32_[i_38_] & 0xff]);
							i_38_++;
						}
						i_37_ += i_15_ - i_34_;
					}
				} else {
					for (int i_41_ = 0; i_41_ < i_33_; i_41_++) {
						for (int i_42_ = 0; i_42_ < i_34_; i_42_++) {
							int i_43_;
							if ((i_43_ = is_32_[i_38_++]) != 0)
								is[i_37_++] = ~0xffffff | is_30_[i_43_ & 0xff];
							else
								i_37_++;
						}
						i_37_ += i_15_ - i_34_;
					}
				}
			}
			((Class8_Sub5) this).aClass137_Sub1_Sub1_9325 = Class137_Sub1_Sub1.method15537(class505_sub1, i_15_, i_15_, false, is, 0, 0);
			((Class8_Sub5) this).aBool9326 = false;
		}
		((Class8_Sub5) this).aClass137_Sub1_Sub1_9325.method2351(false);
		((Class8_Sub5) this).aClass138_9324 = new Class138(class505_sub1, 256);
		float f = (((Class137_Sub1_Sub1) ((Class8_Sub5) this).aClass137_Sub1_Sub1_9325).aFloat10132 / (float) (((Class137_Sub1_Sub1) ((Class8_Sub5) this).aClass137_Sub1_Sub1_9325).anInt10136));
		float f_44_ = (((Class137_Sub1_Sub1) ((Class8_Sub5) this).aClass137_Sub1_Sub1_9325).aFloat10134 / (float) (((Class137_Sub1_Sub1) ((Class8_Sub5) this).aClass137_Sub1_Sub1_9325).anInt10133));
		for (int i_45_ = 0; i_45_ < 256; i_45_++) {
			Class91 class91 = class91s[i_45_];
			int i_46_ = class91.anInt954;
			int i_47_ = class91.anInt957;
			int i_48_ = class91.anInt959;
			int i_49_ = class91.anInt956;
			float f_50_ = (float) (i_45_ % 16 * i);
			float f_51_ = (float) (i_45_ / 16 * i);
			float f_52_ = f_50_ * f;
			float f_53_ = f_51_ * f_44_;
			float f_54_ = (f_50_ + (float) i_47_) * f;
			float f_55_ = (f_51_ + (float) i_46_) * f_44_;
			((Class8_Sub5) this).aClass138_9324.method2380(i_45_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(f_52_, (((Class137_Sub1_Sub1) (((Class8_Sub5) this).aClass137_Sub1_Sub1_9325)).aFloat10134) - f_53_);
			OpenGL.glVertex2i(i_49_, i_48_);
			OpenGL.glTexCoord2f(f_52_, (((Class137_Sub1_Sub1) (((Class8_Sub5) this).aClass137_Sub1_Sub1_9325)).aFloat10134) - f_55_);
			OpenGL.glVertex2i(i_49_, i_48_ + i_46_);
			OpenGL.glTexCoord2f(f_54_, (((Class137_Sub1_Sub1) (((Class8_Sub5) this).aClass137_Sub1_Sub1_9325)).aFloat10134) - f_55_);
			OpenGL.glVertex2i(i_49_ + i_47_, i_48_ + i_46_);
			OpenGL.glTexCoord2f(f_54_, (((Class137_Sub1_Sub1) (((Class8_Sub5) this).aClass137_Sub1_Sub1_9325)).aFloat10134) - f_53_);
			OpenGL.glVertex2i(i_49_ + i_47_, i_48_);
			OpenGL.glEnd();
			((Class8_Sub5) this).aClass138_9324.method2381();
		}
	}

	void t(char c, int i, int i_56_, int i_57_, boolean bool) {
		((Class8_Sub5) this).aClass505_Sub1_9323.method13606();
		((Class8_Sub5) this).aClass505_Sub1_9323.method13654(((Class8_Sub5) this).aClass137_Sub1_Sub1_9325);
		if (((Class8_Sub5) this).aBool9326 || bool) {
			((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 8448);
			((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 34168, 768);
		} else
			((Class8_Sub5) this).aClass505_Sub1_9323.method13717(7681, 7681);
		OpenGL.glColor4ub((byte) (i_57_ >> 16), (byte) (i_57_ >> 8), (byte) i_57_, (byte) (i_57_ >> 24));
		OpenGL.glTranslatef((float) i, (float) i_56_, 0.0F);
		((Class8_Sub5) this).aClass138_9324.method2379(c);
		OpenGL.glLoadIdentity();
		if (((Class8_Sub5) this).aBool9326 || bool)
			((Class8_Sub5) this).aClass505_Sub1_9323.method13595(0, 5890, 768);
	}
}
