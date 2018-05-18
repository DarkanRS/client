
/* Class160_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class160_Sub2 extends NativeSprite {
	boolean aBool9028;
	Class137_Sub1_Sub1 aClass137_Sub1_Sub1_9029;
	int anInt9030;
	int anInt9031 = 0;
	Class505_Sub1 aClass505_Sub1_9032;
	Class137_Sub1_Sub1 aClass137_Sub1_Sub1_9033;
	int anInt9034;
	int anInt9035;
	int anInt9036;

	public void method2783(int i, int i_0_, int i_1_, int i_2_) {
		((Class160_Sub2) this).anInt9030 = i;
		((Class160_Sub2) this).anInt9034 = i_0_;
		((Class160_Sub2) this).anInt9036 = i_1_;
		((Class160_Sub2) this).anInt9035 = i_2_;
		((Class160_Sub2) this).aBool9028 = (((Class160_Sub2) this).anInt9030 != 0 || ((Class160_Sub2) this).anInt9034 != 0 || ((Class160_Sub2) this).anInt9036 != 0 || ((Class160_Sub2) this).anInt9035 != 0);
	}

	void method2791(float f, float f_3_, float f_4_, float f_5_, float f_6_, float f_7_, int i, int i_8_, int i_9_, int i_10_) {
		if (((Class160_Sub2) this).aBool9028) {
			float f_11_ = (float) method228();
			float f_12_ = (float) method2748();
			float f_13_ = (f_4_ - f) / f_11_;
			float f_14_ = (f_5_ - f_3_) / f_11_;
			float f_15_ = (f_6_ - f) / f_12_;
			float f_16_ = (f_7_ - f_3_) / f_12_;
			float f_17_ = f_15_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_18_ = f_16_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_19_ = f_13_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_20_ = f_14_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_21_ = -f_13_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_22_ = -f_14_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_23_ = -f_15_ * (float) ((Class160_Sub2) this).anInt9035;
			float f_24_ = -f_16_ * (float) ((Class160_Sub2) this).anInt9035;
			f = f + f_19_ + f_17_;
			f_3_ = f_3_ + f_20_ + f_18_;
			f_4_ = f_4_ + f_21_ + f_17_;
			f_5_ = f_5_ + f_22_ + f_18_;
			f_6_ = f_6_ + f_19_ + f_23_;
			f_7_ = f_7_ + f_20_ + f_24_;
		}
		float f_25_ = f_6_ + (f_4_ - f);
		float f_26_ = f_5_ + (f_7_ - f_3_);
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351((i_10_ & 0x1) != 0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_9_);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i);
		OpenGL.glColor4ub((byte) (i_8_ >> 16), (byte) (i_8_ >> 8), (byte) i_8_, (byte) (i_8_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134));
		OpenGL.glVertex2f(f, f_3_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_6_, f_7_);
		OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132), 0.0F);
		OpenGL.glVertex2f(f_25_, f_26_);
		OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132), (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134));
		OpenGL.glVertex2f(f_4_, f_5_);
		OpenGL.glEnd();
	}

	Class160_Sub2(Class505_Sub1 class505_sub1, int i, int i_27_, int[] is, int i_28_, int i_29_) {
		((Class160_Sub2) this).aBool9028 = false;
		((Class160_Sub2) this).anInt9034 = 0;
		((Class160_Sub2) this).anInt9030 = 0;
		((Class160_Sub2) this).anInt9035 = 0;
		((Class160_Sub2) this).anInt9036 = 0;
		((Class160_Sub2) this).aClass505_Sub1_9032 = class505_sub1;
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033 = Class137_Sub1_Sub1.method15537(class505_sub1, i, i_27_, false, is, i_29_, i_28_);
	}

	public void method2743(int i, int i_30_, int i_31_, int i_32_) {
		((Class160_Sub2) this).anInt9030 = i;
		((Class160_Sub2) this).anInt9034 = i_30_;
		((Class160_Sub2) this).anInt9036 = i_31_;
		((Class160_Sub2) this).anInt9035 = i_32_;
		((Class160_Sub2) this).aBool9028 = (((Class160_Sub2) this).anInt9030 != 0 || ((Class160_Sub2) this).anInt9034 != 0 || ((Class160_Sub2) this).anInt9036 != 0 || ((Class160_Sub2) this).anInt9035 != 0);
	}

	public void method2767(int i, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_) {
		if (((Class505_Sub1) ((Class160_Sub2) this).aClass505_Sub1_9032).aBool8456) {
			int[] is = ((Class160_Sub2) this).aClass505_Sub1_9032.ab(i_36_, i_37_, i_34_, i_35_);
			if (is != null) {
				for (int i_38_ = 0; i_38_ < is.length; i_38_++)
					is[i_38_] |= ~0xffffff;
				method14414(i, i_33_, i_34_, i_35_, is, 0, i_34_);
			}
		} else
			((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method14439(i, i_33_, i_34_, i_35_, i_36_, i_37_);
	}

	public int method2747() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136);
	}

	public void method2781(int i, int i_39_, int i_40_, int i_41_) {
		((Class160_Sub2) this).anInt9030 = i;
		((Class160_Sub2) this).anInt9034 = i_39_;
		((Class160_Sub2) this).anInt9036 = i_40_;
		((Class160_Sub2) this).anInt9035 = i_41_;
		((Class160_Sub2) this).aBool9028 = (((Class160_Sub2) this).anInt9030 != 0 || ((Class160_Sub2) this).anInt9034 != 0 || ((Class160_Sub2) this).anInt9036 != 0 || ((Class160_Sub2) this).anInt9035 != 0);
	}

	public int method2793() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133);
	}

	public int method2748() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133 + ((Class160_Sub2) this).anInt9034 + ((Class160_Sub2) this).anInt9035);
	}

	public int method2786() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136);
	}

	public void method2750(int i, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_) {
		if (((Class505_Sub1) ((Class160_Sub2) this).aClass505_Sub1_9032).aBool8456) {
			int[] is = ((Class160_Sub2) this).aClass505_Sub1_9032.ab(i_45_, i_46_, i_43_, i_44_);
			if (is != null) {
				for (int i_47_ = 0; i_47_ < is.length; i_47_++)
					is[i_47_] |= ~0xffffff;
				method14414(i, i_42_, i_43_, i_44_, is, 0, i_43_);
			}
		} else
			((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method14439(i, i_42_, i_43_, i_44_, i_45_, i_46_);
	}

	public void method2751(int i, int i_48_, int i_49_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 = (Class137_Sub1_Sub1.method15538(((Class160_Sub2) this).aClass505_Sub1_9032, i, i_48_, ((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136, ((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133));
		((Class160_Sub2) this).anInt9031 = i_49_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	void method14414(int i, int i_50_, int i_51_, int i_52_, int[] is, int i_53_, int i_54_) {
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method14452(i, i_50_, i_51_, i_52_, is, i_53_, i_54_, true);
	}

	public void method2772(int i, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_) {
		int i_61_ = i + i_56_;
		int i_62_ = i_55_ + i_57_;
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351(false);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_60_);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_58_);
		OpenGL.glColor4ub((byte) (i_59_ >> 16), (byte) (i_59_ >> 8), (byte) i_59_, (byte) (i_59_ >> 24));
		if (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aBool10135 && !((Class160_Sub2) this).aBool9028) {
			float f = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134) * (float) i_57_ / (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133));
			float f_63_ = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132) * (float) i_56_ / (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_55_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_62_);
			OpenGL.glTexCoord2f(f_63_, 0.0F);
			OpenGL.glVertex2i(i_61_, i_62_);
			OpenGL.glTexCoord2f(f_63_, f);
			OpenGL.glVertex2i(i_61_, i_55_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class160_Sub2) this).anInt9030, (float) ((Class160_Sub2) this).anInt9034, 0.0F);
			int i_64_ = method228();
			int i_65_ = method2748();
			int i_66_ = i_55_ + (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133);
			OpenGL.glBegin(7);
			int i_67_ = i_55_;
			for (/**/; i_66_ <= i_62_; i_66_ += i_65_) {
				int i_68_ = i + (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136);
				int i_69_ = i;
				while (i_68_ <= i_61_) {
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_69_, i_67_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_69_, i_66_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), 0.0F);
					OpenGL.glVertex2i(i_68_, i_66_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_68_, i_67_);
					i_68_ += i_64_;
					i_69_ += i_64_;
				}
				if (i_69_ < i_61_) {
					float f = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132) * (float) (i_61_ - i_69_) / (float) ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136);
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_69_, i_67_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_69_, i_66_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_61_, i_66_);
					OpenGL.glTexCoord2f(f, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_61_, i_67_);
				}
				i_67_ += i_65_;
			}
			if (i_67_ < i_62_) {
				float f = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134) * (float) (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133 - (i_62_ - i_67_)) / (float) ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133);
				int i_70_ = i + (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136);
				int i_71_ = i;
				while (i_70_ <= i_61_) {
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_71_, i_67_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_71_, i_62_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), f);
					OpenGL.glVertex2i(i_70_, i_62_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_70_, i_67_);
					i_70_ += i_64_;
					i_71_ += i_64_;
				}
				if (i_71_ < i_61_) {
					float f_72_ = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132) * (float) (i_61_ - i_71_) / (float) ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136);
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_71_, i_67_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_71_, i_62_);
					OpenGL.glTexCoord2f(f_72_, f);
					OpenGL.glVertex2i(i_61_, i_62_);
					OpenGL.glTexCoord2f(f_72_, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_61_, i_67_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	void method14415() {
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(null);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(8448, 8448);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34168, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13616(0, 5890, 770);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34168, 768);
	}

	public void method2742(int i, int i_73_, int i_74_, int i_75_, int i_76_) {
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351(false);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_76_);
		OpenGL.glColor4ub((byte) (i_75_ >> 16), (byte) (i_75_ >> 8), (byte) i_75_, (byte) (i_75_ >> 24));
		i += ((Class160_Sub2) this).anInt9030;
		i_73_ += ((Class160_Sub2) this).anInt9034;
		if (((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 == null) {
			((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
			((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_74_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_73_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_73_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_73_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_73_);
			OpenGL.glEnd();
		} else {
			method14419(i_74_);
			((Class160_Sub2) this).aClass137_Sub1_Sub1_9029.method2351(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_73_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_73_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_73_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_73_);
			OpenGL.glEnd();
			method14415();
		}
	}

	public void method2773(int i, int i_77_, Class455 class455, int i_78_, int i_79_) {
		Class455_Sub2 class455_sub2 = (Class455_Sub2) class455;
		Class137_Sub1_Sub1 class137_sub1_sub1 = ((Class455_Sub2) class455_sub2).aClass137_Sub1_Sub1_8974;
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351(false);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(class137_sub1_sub1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(7681, 8448);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 34168, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(1);
		i += ((Class160_Sub2) this).anInt9030;
		i_77_ += ((Class160_Sub2) this).anInt9034;
		int i_80_ = i + ((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136;
		int i_81_ = i_77_ + (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133);
		float f = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10132 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10136);
		float f_82_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10133);
		float f_83_ = (float) (i - i_78_) * f;
		float f_84_ = (float) (i_80_ - i_78_) * f;
		float f_85_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 - (float) (i_77_ - i_79_) * f_82_);
		float f_86_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 - (float) (i_81_ - i_79_) * f_82_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_83_, f_85_);
		OpenGL.glVertex2i(i, i_77_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_83_, f_86_);
		OpenGL.glVertex2i(i, i_77_ + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_84_, f_86_);
		OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_77_ + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_84_, f_85_);
		OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_77_);
		OpenGL.glEnd();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 5890, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(null);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
	}

	void method2755(int i, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_) {
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351((i_93_ & 0x1) != 0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_92_);
		OpenGL.glColor4ub((byte) (i_91_ >> 16), (byte) (i_91_ >> 8), (byte) i_91_, (byte) (i_91_ >> 24));
		if (((Class160_Sub2) this).aBool9028) {
			float f = (float) i_88_ / (float) method228();
			float f_94_ = (float) i_89_ / (float) method2748();
			float f_95_ = (float) i + (float) ((Class160_Sub2) this).anInt9030 * f;
			float f_96_ = ((float) i_87_ + (float) ((Class160_Sub2) this).anInt9034 * f_94_);
			float f_97_ = (f_95_ + (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136) * f);
			float f_98_ = (f_96_ + (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133) * f_94_);
			if (((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 == null) {
				((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
				((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_90_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_95_, f_96_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_95_, f_98_);
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_97_, f_98_);
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_97_, f_96_);
				OpenGL.glEnd();
			} else {
				method14419(i_90_);
				((Class160_Sub2) this).aClass137_Sub1_Sub1_9029.method2351(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
				OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_95_, f_96_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_95_, f_98_);
				OpenGL.glMultiTexCoord2f(33985, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), 0.0F);
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_97_, f_98_);
				OpenGL.glMultiTexCoord2f(33985, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_97_, f_96_);
				OpenGL.glEnd();
				method14415();
			}
		} else if (((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 == null) {
			((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
			((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_90_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_87_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_87_ + i_89_);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + i_88_, i_87_ + i_89_);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + i_88_, i_87_);
			OpenGL.glEnd();
		} else {
			method14419(i_90_);
			((Class160_Sub2) this).aClass137_Sub1_Sub1_9029.method2351(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_87_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_87_ + i_89_);
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + i_88_, i_87_ + i_89_);
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + i_88_, i_87_);
			OpenGL.glEnd();
			method14415();
		}
	}

	void method14416(int i) {
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(((Class160_Sub2) this).aClass505_Sub1_9032.method13613(i), 7681);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34167, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13616(0, 34168, 770);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9029);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(34479, 7681);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34166, 768);
		if (((Class160_Sub2) this).anInt9031 == 0)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(1.0F, 0.5F, 0.5F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 1)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(0.5F, 1.0F, 0.5F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 2)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(0.5F, 0.5F, 1.0F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 3)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(128.5F, 128.5F, 128.5F, 0.0F);
	}

	void method2764(float f, float f_99_, float f_100_, float f_101_, float f_102_, float f_103_, int i, int i_104_, int i_105_, int i_106_) {
		if (((Class160_Sub2) this).aBool9028) {
			float f_107_ = (float) method228();
			float f_108_ = (float) method2748();
			float f_109_ = (f_100_ - f) / f_107_;
			float f_110_ = (f_101_ - f_99_) / f_107_;
			float f_111_ = (f_102_ - f) / f_108_;
			float f_112_ = (f_103_ - f_99_) / f_108_;
			float f_113_ = f_111_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_114_ = f_112_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_115_ = f_109_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_116_ = f_110_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_117_ = -f_109_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_118_ = -f_110_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_119_ = -f_111_ * (float) ((Class160_Sub2) this).anInt9035;
			float f_120_ = -f_112_ * (float) ((Class160_Sub2) this).anInt9035;
			f = f + f_115_ + f_113_;
			f_99_ = f_99_ + f_116_ + f_114_;
			f_100_ = f_100_ + f_117_ + f_113_;
			f_101_ = f_101_ + f_118_ + f_114_;
			f_102_ = f_102_ + f_115_ + f_119_;
			f_103_ = f_103_ + f_116_ + f_120_;
		}
		float f_121_ = f_102_ + (f_100_ - f);
		float f_122_ = f_101_ + (f_103_ - f_99_);
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351((i_106_ & 0x1) != 0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_105_);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i);
		OpenGL.glColor4ub((byte) (i_104_ >> 16), (byte) (i_104_ >> 8), (byte) i_104_, (byte) (i_104_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134));
		OpenGL.glVertex2f(f, f_99_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_102_, f_103_);
		OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132), 0.0F);
		OpenGL.glVertex2f(f_121_, f_122_);
		OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132), (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134));
		OpenGL.glVertex2f(f_100_, f_101_);
		OpenGL.glEnd();
	}

	public int method228() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136 + ((Class160_Sub2) this).anInt9030 + ((Class160_Sub2) this).anInt9036);
	}

	public void method2796(int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_) {
		int i_129_ = i + i_124_;
		int i_130_ = i_123_ + i_125_;
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351(false);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_128_);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_126_);
		OpenGL.glColor4ub((byte) (i_127_ >> 16), (byte) (i_127_ >> 8), (byte) i_127_, (byte) (i_127_ >> 24));
		if (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aBool10135 && !((Class160_Sub2) this).aBool9028) {
			float f = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134) * (float) i_125_ / (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133));
			float f_131_ = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132) * (float) i_124_ / (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_123_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_130_);
			OpenGL.glTexCoord2f(f_131_, 0.0F);
			OpenGL.glVertex2i(i_129_, i_130_);
			OpenGL.glTexCoord2f(f_131_, f);
			OpenGL.glVertex2i(i_129_, i_123_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class160_Sub2) this).anInt9030, (float) ((Class160_Sub2) this).anInt9034, 0.0F);
			int i_132_ = method228();
			int i_133_ = method2748();
			int i_134_ = i_123_ + (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133);
			OpenGL.glBegin(7);
			int i_135_ = i_123_;
			for (/**/; i_134_ <= i_130_; i_134_ += i_133_) {
				int i_136_ = i + (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136);
				int i_137_ = i;
				while (i_136_ <= i_129_) {
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_137_, i_135_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_137_, i_134_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), 0.0F);
					OpenGL.glVertex2i(i_136_, i_134_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_136_, i_135_);
					i_136_ += i_132_;
					i_137_ += i_132_;
				}
				if (i_137_ < i_129_) {
					float f = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132) * (float) (i_129_ - i_137_) / (float) ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136);
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_137_, i_135_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_137_, i_134_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_129_, i_134_);
					OpenGL.glTexCoord2f(f, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_129_, i_135_);
				}
				i_135_ += i_133_;
			}
			if (i_135_ < i_130_) {
				float f = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134) * (float) (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133 - (i_130_ - i_135_)) / (float) ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133);
				int i_138_ = i + (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136);
				int i_139_ = i;
				while (i_138_ <= i_129_) {
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_139_, i_135_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_139_, i_130_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), f);
					OpenGL.glVertex2i(i_138_, i_130_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_138_, i_135_);
					i_138_ += i_132_;
					i_139_ += i_132_;
				}
				if (i_139_ < i_129_) {
					float f_140_ = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132) * (float) (i_129_ - i_139_) / (float) ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136);
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_139_, i_135_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_139_, i_130_);
					OpenGL.glTexCoord2f(f_140_, f);
					OpenGL.glVertex2i(i_129_, i_130_);
					OpenGL.glTexCoord2f(f_140_, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_129_, i_135_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	Class160_Sub2(Class505_Sub1 class505_sub1, int i, int i_141_, int i_142_, int i_143_) {
		((Class160_Sub2) this).aBool9028 = false;
		((Class160_Sub2) this).anInt9034 = 0;
		((Class160_Sub2) this).anInt9030 = 0;
		((Class160_Sub2) this).anInt9035 = 0;
		((Class160_Sub2) this).anInt9036 = 0;
		((Class160_Sub2) this).aClass505_Sub1_9032 = class505_sub1;
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033 = Class137_Sub1_Sub1.method15538(class505_sub1, i, i_141_, i_142_, i_143_);
	}

	public void method2769(int i, int i_144_, int i_145_, int i_146_, int i_147_, int i_148_) {
		if (((Class505_Sub1) ((Class160_Sub2) this).aClass505_Sub1_9032).aBool8456) {
			int[] is = ((Class160_Sub2) this).aClass505_Sub1_9032.ab(i_147_, i_148_, i_145_, i_146_);
			if (is != null) {
				for (int i_149_ = 0; i_149_ < is.length; i_149_++)
					is[i_149_] |= ~0xffffff;
				method14414(i, i_144_, i_145_, i_146_, is, 0, i_145_);
			}
		} else
			((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method14439(i, i_144_, i_145_, i_146_, i_147_, i_148_);
	}

	void method2800(float f, float f_150_, float f_151_, float f_152_, float f_153_, float f_154_, int i, Class455 class455, int i_155_, int i_156_) {
		Class137_Sub1_Sub1 class137_sub1_sub1 = (((Class455_Sub2) (Class455_Sub2) class455).aClass137_Sub1_Sub1_8974);
		if (((Class160_Sub2) this).aBool9028) {
			float f_157_ = (float) method228();
			float f_158_ = (float) method2748();
			float f_159_ = (f_151_ - f) / f_157_;
			float f_160_ = (f_152_ - f_150_) / f_157_;
			float f_161_ = (f_153_ - f) / f_158_;
			float f_162_ = (f_154_ - f_150_) / f_158_;
			float f_163_ = f_161_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_164_ = f_162_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_165_ = f_159_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_166_ = f_160_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_167_ = -f_159_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_168_ = -f_160_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_169_ = -f_161_ * (float) ((Class160_Sub2) this).anInt9035;
			float f_170_ = -f_162_ * (float) ((Class160_Sub2) this).anInt9035;
			f = f + f_165_ + f_163_;
			f_150_ = f_150_ + f_166_ + f_164_;
			f_151_ = f_151_ + f_167_ + f_163_;
			f_152_ = f_152_ + f_168_ + f_164_;
			f_153_ = f_153_ + f_165_ + f_169_;
			f_154_ = f_154_ + f_166_ + f_170_;
		}
		float f_171_ = f_153_ + (f_151_ - f);
		float f_172_ = f_152_ + (f_154_ - f_150_);
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351((i & 0x1) != 0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(class137_sub1_sub1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(7681, 8448);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 34168, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(1);
		float f_173_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10132 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10136);
		float f_174_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10133);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_173_ * (f - (float) i_155_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_174_ * (f_150_ - (float) i_156_)));
		OpenGL.glVertex2f(f, f_150_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_173_ * (f_153_ - (float) i_155_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_174_ * (f_154_ - (float) i_156_)));
		OpenGL.glVertex2f(f_153_, f_154_);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_173_ * (f_171_ - (float) i_155_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_174_ * (f_172_ - (float) i_156_)));
		OpenGL.glVertex2f(f_171_, f_172_);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_173_ * (f_151_ - (float) i_155_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_174_ * (f_152_ - (float) i_156_)));
		OpenGL.glVertex2f(f_151_, f_152_);
		OpenGL.glEnd();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 5890, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(null);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
	}

	public void method2771(int i, int i_175_, int i_176_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 = (Class137_Sub1_Sub1.method15538(((Class160_Sub2) this).aClass505_Sub1_9032, i, i_175_, ((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136, ((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133));
		((Class160_Sub2) this).anInt9031 = i_176_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public Interface9 method2801() {
		return ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method14441(0);
	}

	public void method2784(int i, int i_177_, Class455 class455, int i_178_, int i_179_) {
		Class455_Sub2 class455_sub2 = (Class455_Sub2) class455;
		Class137_Sub1_Sub1 class137_sub1_sub1 = ((Class455_Sub2) class455_sub2).aClass137_Sub1_Sub1_8974;
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351(false);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(class137_sub1_sub1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(7681, 8448);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 34168, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(1);
		i += ((Class160_Sub2) this).anInt9030;
		i_177_ += ((Class160_Sub2) this).anInt9034;
		int i_180_ = i + ((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136;
		int i_181_ = (i_177_ + ((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133);
		float f = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10132 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10136);
		float f_182_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10133);
		float f_183_ = (float) (i - i_178_) * f;
		float f_184_ = (float) (i_180_ - i_178_) * f;
		float f_185_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 - (float) (i_177_ - i_179_) * f_182_);
		float f_186_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 - (float) (i_181_ - i_179_) * f_182_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_183_, f_185_);
		OpenGL.glVertex2i(i, i_177_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_183_, f_186_);
		OpenGL.glVertex2i(i, i_177_ + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_184_, f_186_);
		OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_177_ + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_184_, f_185_);
		OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_177_);
		OpenGL.glEnd();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 5890, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(null);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
	}

	public void method2774(int i, int i_187_, Class455 class455, int i_188_, int i_189_) {
		Class455_Sub2 class455_sub2 = (Class455_Sub2) class455;
		Class137_Sub1_Sub1 class137_sub1_sub1 = ((Class455_Sub2) class455_sub2).aClass137_Sub1_Sub1_8974;
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351(false);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(class137_sub1_sub1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(7681, 8448);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 34168, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(1);
		i += ((Class160_Sub2) this).anInt9030;
		i_187_ += ((Class160_Sub2) this).anInt9034;
		int i_190_ = i + ((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136;
		int i_191_ = (i_187_ + ((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133);
		float f = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10132 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10136);
		float f_192_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10133);
		float f_193_ = (float) (i - i_188_) * f;
		float f_194_ = (float) (i_190_ - i_188_) * f;
		float f_195_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 - (float) (i_187_ - i_189_) * f_192_);
		float f_196_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 - (float) (i_191_ - i_189_) * f_192_);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_193_, f_195_);
		OpenGL.glVertex2i(i, i_187_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_193_, f_196_);
		OpenGL.glVertex2i(i, i_187_ + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_194_, f_196_);
		OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_187_ + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_194_, f_195_);
		OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_187_);
		OpenGL.glEnd();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 5890, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(null);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
	}

	void method2775(int i, int i_197_, int i_198_, int i_199_, int i_200_, int i_201_, int i_202_, int i_203_) {
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351((i_203_ & 0x1) != 0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_202_);
		OpenGL.glColor4ub((byte) (i_201_ >> 16), (byte) (i_201_ >> 8), (byte) i_201_, (byte) (i_201_ >> 24));
		if (((Class160_Sub2) this).aBool9028) {
			float f = (float) i_198_ / (float) method228();
			float f_204_ = (float) i_199_ / (float) method2748();
			float f_205_ = (float) i + (float) ((Class160_Sub2) this).anInt9030 * f;
			float f_206_ = ((float) i_197_ + (float) ((Class160_Sub2) this).anInt9034 * f_204_);
			float f_207_ = (f_205_ + (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136) * f);
			float f_208_ = (f_206_ + (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133) * f_204_);
			if (((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 == null) {
				((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
				((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_200_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_205_, f_206_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_205_, f_208_);
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_207_, f_208_);
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_207_, f_206_);
				OpenGL.glEnd();
			} else {
				method14419(i_200_);
				((Class160_Sub2) this).aClass137_Sub1_Sub1_9029.method2351(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
				OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_205_, f_206_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_205_, f_208_);
				OpenGL.glMultiTexCoord2f(33985, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), 0.0F);
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_207_, f_208_);
				OpenGL.glMultiTexCoord2f(33985, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_207_, f_206_);
				OpenGL.glEnd();
				method14415();
			}
		} else if (((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 == null) {
			((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
			((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_200_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_197_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_197_ + i_199_);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + i_198_, i_197_ + i_199_);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + i_198_, i_197_);
			OpenGL.glEnd();
		} else {
			method14419(i_200_);
			((Class160_Sub2) this).aClass137_Sub1_Sub1_9029.method2351(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_197_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_197_ + i_199_);
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + i_198_, i_197_ + i_199_);
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + i_198_, i_197_);
			OpenGL.glEnd();
			method14415();
		}
	}

	void method2766(float f, float f_209_, float f_210_, float f_211_, float f_212_, float f_213_, int i, Class455 class455, int i_214_, int i_215_) {
		Class137_Sub1_Sub1 class137_sub1_sub1 = (((Class455_Sub2) (Class455_Sub2) class455).aClass137_Sub1_Sub1_8974);
		if (((Class160_Sub2) this).aBool9028) {
			float f_216_ = (float) method228();
			float f_217_ = (float) method2748();
			float f_218_ = (f_210_ - f) / f_216_;
			float f_219_ = (f_211_ - f_209_) / f_216_;
			float f_220_ = (f_212_ - f) / f_217_;
			float f_221_ = (f_213_ - f_209_) / f_217_;
			float f_222_ = f_220_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_223_ = f_221_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_224_ = f_218_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_225_ = f_219_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_226_ = -f_218_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_227_ = -f_219_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_228_ = -f_220_ * (float) ((Class160_Sub2) this).anInt9035;
			float f_229_ = -f_221_ * (float) ((Class160_Sub2) this).anInt9035;
			f = f + f_224_ + f_222_;
			f_209_ = f_209_ + f_225_ + f_223_;
			f_210_ = f_210_ + f_226_ + f_222_;
			f_211_ = f_211_ + f_227_ + f_223_;
			f_212_ = f_212_ + f_224_ + f_228_;
			f_213_ = f_213_ + f_225_ + f_229_;
		}
		float f_230_ = f_212_ + (f_210_ - f);
		float f_231_ = f_211_ + (f_213_ - f_209_);
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351((i & 0x1) != 0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(class137_sub1_sub1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(7681, 8448);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 34168, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(1);
		float f_232_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10132 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10136);
		float f_233_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10133);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_232_ * (f - (float) i_214_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_233_ * (f_209_ - (float) i_215_)));
		OpenGL.glVertex2f(f, f_209_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_232_ * (f_212_ - (float) i_214_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_233_ * (f_213_ - (float) i_215_)));
		OpenGL.glVertex2f(f_212_, f_213_);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_232_ * (f_230_ - (float) i_214_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_233_ * (f_231_ - (float) i_215_)));
		OpenGL.glVertex2f(f_230_, f_231_);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_232_ * (f_210_ - (float) i_214_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_233_ * (f_211_ - (float) i_215_)));
		OpenGL.glVertex2f(f_210_, f_211_);
		OpenGL.glEnd();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 5890, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(null);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
	}

	public void method2749(int i, int i_234_, int i_235_, int i_236_, int i_237_) {
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351(false);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_237_);
		OpenGL.glColor4ub((byte) (i_236_ >> 16), (byte) (i_236_ >> 8), (byte) i_236_, (byte) (i_236_ >> 24));
		i += ((Class160_Sub2) this).anInt9030;
		i_234_ += ((Class160_Sub2) this).anInt9034;
		if (((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 == null) {
			((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
			((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_235_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_234_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_234_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_234_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_234_);
			OpenGL.glEnd();
		} else {
			method14419(i_235_);
			((Class160_Sub2) this).aClass137_Sub1_Sub1_9029.method2351(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_234_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_234_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_234_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_234_);
			OpenGL.glEnd();
			method14415();
		}
	}

	public void method2778(int i, int i_238_, int i_239_, int i_240_, int i_241_) {
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351(false);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_241_);
		OpenGL.glColor4ub((byte) (i_240_ >> 16), (byte) (i_240_ >> 8), (byte) i_240_, (byte) (i_240_ >> 24));
		i += ((Class160_Sub2) this).anInt9030;
		i_238_ += ((Class160_Sub2) this).anInt9034;
		if (((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 == null) {
			((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
			((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_239_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_238_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_238_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_238_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_238_);
			OpenGL.glEnd();
		} else {
			method14419(i_239_);
			((Class160_Sub2) this).aClass137_Sub1_Sub1_9029.method2351(false);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_238_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_238_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_238_ + (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133));
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136, i_238_);
			OpenGL.glEnd();
			method14415();
		}
	}

	public int method2792() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133 + ((Class160_Sub2) this).anInt9034 + ((Class160_Sub2) this).anInt9035);
	}

	public void method2780(int i, int i_242_, int i_243_, int i_244_) {
		((Class160_Sub2) this).anInt9030 = i;
		((Class160_Sub2) this).anInt9034 = i_242_;
		((Class160_Sub2) this).anInt9036 = i_243_;
		((Class160_Sub2) this).anInt9035 = i_244_;
		((Class160_Sub2) this).aBool9028 = (((Class160_Sub2) this).anInt9030 != 0 || ((Class160_Sub2) this).anInt9034 != 0 || ((Class160_Sub2) this).anInt9036 != 0 || ((Class160_Sub2) this).anInt9035 != 0);
	}

	public void method2744(int[] is) {
		is[0] = ((Class160_Sub2) this).anInt9030;
		is[1] = ((Class160_Sub2) this).anInt9034;
		is[2] = ((Class160_Sub2) this).anInt9036;
		is[3] = ((Class160_Sub2) this).anInt9035;
	}

	public void method2782(int[] is) {
		is[0] = ((Class160_Sub2) this).anInt9030;
		is[1] = ((Class160_Sub2) this).anInt9034;
		is[2] = ((Class160_Sub2) this).anInt9036;
		is[3] = ((Class160_Sub2) this).anInt9035;
	}

	public Interface9 method2808() {
		return ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method14441(0);
	}

	public void method2777(int[] is) {
		is[0] = ((Class160_Sub2) this).anInt9030;
		is[1] = ((Class160_Sub2) this).anInt9034;
		is[2] = ((Class160_Sub2) this).anInt9036;
		is[3] = ((Class160_Sub2) this).anInt9035;
	}

	public void method2770(int i, int i_245_, int i_246_) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 = (Class137_Sub1_Sub1.method15538(((Class160_Sub2) this).aClass505_Sub1_9032, i, i_245_, ((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136, ((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133));
		((Class160_Sub2) this).anInt9031 = i_246_;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	public void method2785(int[] is) {
		is[0] = ((Class160_Sub2) this).anInt9030;
		is[1] = ((Class160_Sub2) this).anInt9034;
		is[2] = ((Class160_Sub2) this).anInt9036;
		is[3] = ((Class160_Sub2) this).anInt9035;
	}

	public int method2794() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136);
	}

	public int method2788() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133);
	}

	public int method2765() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133);
	}

	public int method225() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136 + ((Class160_Sub2) this).anInt9030 + ((Class160_Sub2) this).anInt9036);
	}

	public int method227() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136 + ((Class160_Sub2) this).anInt9030 + ((Class160_Sub2) this).anInt9036);
	}

	public int method226() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136 + ((Class160_Sub2) this).anInt9030 + ((Class160_Sub2) this).anInt9036);
	}

	public int method229() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136 + ((Class160_Sub2) this).anInt9030 + ((Class160_Sub2) this).anInt9036);
	}

	void method14417() {
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(null);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(8448, 8448);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34168, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13616(0, 5890, 770);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34168, 768);
	}

	public int method2757() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133 + ((Class160_Sub2) this).anInt9034 + ((Class160_Sub2) this).anInt9035);
	}

	public int method2753() {
		return (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133 + ((Class160_Sub2) this).anInt9034 + ((Class160_Sub2) this).anInt9035);
	}

	public void method2799(int i, int i_247_, int i_248_, int i_249_, int i_250_, int i_251_, int i_252_) {
		int i_253_ = i + i_248_;
		int i_254_ = i_247_ + i_249_;
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351(false);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_252_);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_250_);
		OpenGL.glColor4ub((byte) (i_251_ >> 16), (byte) (i_251_ >> 8), (byte) i_251_, (byte) (i_251_ >> 24));
		if (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aBool10135 && !((Class160_Sub2) this).aBool9028) {
			float f = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134) * (float) i_249_ / (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133));
			float f_255_ = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132) * (float) i_248_ / (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136));
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, f);
			OpenGL.glVertex2i(i, i_247_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_254_);
			OpenGL.glTexCoord2f(f_255_, 0.0F);
			OpenGL.glVertex2i(i_253_, i_254_);
			OpenGL.glTexCoord2f(f_255_, f);
			OpenGL.glVertex2i(i_253_, i_247_);
			OpenGL.glEnd();
		} else {
			OpenGL.glPushMatrix();
			OpenGL.glTranslatef((float) ((Class160_Sub2) this).anInt9030, (float) ((Class160_Sub2) this).anInt9034, 0.0F);
			int i_256_ = method228();
			int i_257_ = method2748();
			int i_258_ = i_247_ + (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133);
			OpenGL.glBegin(7);
			int i_259_ = i_247_;
			for (/**/; i_258_ <= i_254_; i_258_ += i_257_) {
				int i_260_ = i + (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136);
				int i_261_ = i;
				while (i_260_ <= i_253_) {
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_261_, i_259_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_261_, i_258_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), 0.0F);
					OpenGL.glVertex2i(i_260_, i_258_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_260_, i_259_);
					i_260_ += i_256_;
					i_261_ += i_256_;
				}
				if (i_261_ < i_253_) {
					float f = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132) * (float) (i_253_ - i_261_) / (float) ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136);
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_261_, i_259_);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(i_261_, i_258_);
					OpenGL.glTexCoord2f(f, 0.0F);
					OpenGL.glVertex2i(i_253_, i_258_);
					OpenGL.glTexCoord2f(f, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_253_, i_259_);
				}
				i_259_ += i_257_;
			}
			if (i_259_ < i_254_) {
				float f = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134) * (float) (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133 - (i_254_ - i_259_)) / (float) ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10133);
				int i_262_ = i + (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136);
				int i_263_ = i;
				while (i_262_ <= i_253_) {
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_263_, i_259_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_263_, i_254_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), f);
					OpenGL.glVertex2i(i_262_, i_254_);
					OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_262_, i_259_);
					i_262_ += i_256_;
					i_263_ += i_256_;
				}
				if (i_263_ < i_253_) {
					float f_264_ = ((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132) * (float) (i_253_ - i_263_) / (float) ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).anInt10136);
					OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_263_, i_259_);
					OpenGL.glTexCoord2f(0.0F, f);
					OpenGL.glVertex2i(i_263_, i_254_);
					OpenGL.glTexCoord2f(f_264_, f);
					OpenGL.glVertex2i(i_253_, i_254_);
					OpenGL.glTexCoord2f(f_264_, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
					OpenGL.glVertex2i(i_253_, i_259_);
				}
			}
			OpenGL.glEnd();
			OpenGL.glPopMatrix();
		}
	}

	Class160_Sub2(Class505_Sub1 class505_sub1, int i, int i_265_, boolean bool) {
		((Class160_Sub2) this).aBool9028 = false;
		((Class160_Sub2) this).anInt9034 = 0;
		((Class160_Sub2) this).anInt9030 = 0;
		((Class160_Sub2) this).anInt9035 = 0;
		((Class160_Sub2) this).anInt9036 = 0;
		((Class160_Sub2) this).aClass505_Sub1_9032 = class505_sub1;
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033 = Class137_Sub1_Sub1.method15547(class505_sub1, (bool ? Class150.aClass150_1949 : Class150.aClass150_1950), Class76.aClass76_751, i, i_265_);
	}

	void method14418(int i) {
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(((Class160_Sub2) this).aClass505_Sub1_9032.method13613(i), 7681);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34167, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13616(0, 34168, 770);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9029);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(34479, 7681);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34166, 768);
		if (((Class160_Sub2) this).anInt9031 == 0)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(1.0F, 0.5F, 0.5F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 1)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(0.5F, 1.0F, 0.5F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 2)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(0.5F, 0.5F, 1.0F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 3)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(128.5F, 128.5F, 128.5F, 0.0F);
	}

	void method2798(float f, float f_266_, float f_267_, float f_268_, float f_269_, float f_270_, int i, int i_271_, int i_272_, int i_273_) {
		if (((Class160_Sub2) this).aBool9028) {
			float f_274_ = (float) method228();
			float f_275_ = (float) method2748();
			float f_276_ = (f_267_ - f) / f_274_;
			float f_277_ = (f_268_ - f_266_) / f_274_;
			float f_278_ = (f_269_ - f) / f_275_;
			float f_279_ = (f_270_ - f_266_) / f_275_;
			float f_280_ = f_278_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_281_ = f_279_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_282_ = f_276_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_283_ = f_277_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_284_ = -f_276_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_285_ = -f_277_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_286_ = -f_278_ * (float) ((Class160_Sub2) this).anInt9035;
			float f_287_ = -f_279_ * (float) ((Class160_Sub2) this).anInt9035;
			f = f + f_282_ + f_280_;
			f_266_ = f_266_ + f_283_ + f_281_;
			f_267_ = f_267_ + f_284_ + f_280_;
			f_268_ = f_268_ + f_285_ + f_281_;
			f_269_ = f_269_ + f_282_ + f_286_;
			f_270_ = f_270_ + f_283_ + f_287_;
		}
		float f_288_ = f_269_ + (f_267_ - f);
		float f_289_ = f_268_ + (f_270_ - f_266_);
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351((i_273_ & 0x1) != 0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_272_);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i);
		OpenGL.glColor4ub((byte) (i_271_ >> 16), (byte) (i_271_ >> 8), (byte) i_271_, (byte) (i_271_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134));
		OpenGL.glVertex2f(f, f_266_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_269_, f_270_);
		OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132), 0.0F);
		OpenGL.glVertex2f(f_288_, f_289_);
		OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132), (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134));
		OpenGL.glVertex2f(f_267_, f_268_);
		OpenGL.glEnd();
	}

	void method2812(float f, float f_290_, float f_291_, float f_292_, float f_293_, float f_294_, int i, int i_295_, int i_296_, int i_297_) {
		if (((Class160_Sub2) this).aBool9028) {
			float f_298_ = (float) method228();
			float f_299_ = (float) method2748();
			float f_300_ = (f_291_ - f) / f_298_;
			float f_301_ = (f_292_ - f_290_) / f_298_;
			float f_302_ = (f_293_ - f) / f_299_;
			float f_303_ = (f_294_ - f_290_) / f_299_;
			float f_304_ = f_302_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_305_ = f_303_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_306_ = f_300_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_307_ = f_301_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_308_ = -f_300_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_309_ = -f_301_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_310_ = -f_302_ * (float) ((Class160_Sub2) this).anInt9035;
			float f_311_ = -f_303_ * (float) ((Class160_Sub2) this).anInt9035;
			f = f + f_306_ + f_304_;
			f_290_ = f_290_ + f_307_ + f_305_;
			f_291_ = f_291_ + f_308_ + f_304_;
			f_292_ = f_292_ + f_309_ + f_305_;
			f_293_ = f_293_ + f_306_ + f_310_;
			f_294_ = f_294_ + f_307_ + f_311_;
		}
		float f_312_ = f_293_ + (f_291_ - f);
		float f_313_ = f_292_ + (f_294_ - f_290_);
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351((i_297_ & 0x1) != 0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_296_);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i);
		OpenGL.glColor4ub((byte) (i_295_ >> 16), (byte) (i_295_ >> 8), (byte) i_295_, (byte) (i_295_ >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134));
		OpenGL.glVertex2f(f, f_290_);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(f_293_, f_294_);
		OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132), 0.0F);
		OpenGL.glVertex2f(f_312_, f_313_);
		OpenGL.glTexCoord2f((((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10132), (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).aFloat10134));
		OpenGL.glVertex2f(f_291_, f_292_);
		OpenGL.glEnd();
	}

	public void method2768(int i, int i_314_, int i_315_, int i_316_, int i_317_, int i_318_) {
		if (((Class505_Sub1) ((Class160_Sub2) this).aClass505_Sub1_9032).aBool8456) {
			int[] is = ((Class160_Sub2) this).aClass505_Sub1_9032.ab(i_317_, i_318_, i_315_, i_316_);
			if (is != null) {
				for (int i_319_ = 0; i_319_ < is.length; i_319_++)
					is[i_319_] |= ~0xffffff;
				method14414(i, i_314_, i_315_, i_316_, is, 0, i_315_);
			}
		} else
			((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method14439(i, i_314_, i_315_, i_316_, i_317_, i_318_);
	}

	void method2811(float f, float f_320_, float f_321_, float f_322_, float f_323_, float f_324_, int i, Class455 class455, int i_325_, int i_326_) {
		Class137_Sub1_Sub1 class137_sub1_sub1 = (((Class455_Sub2) (Class455_Sub2) class455).aClass137_Sub1_Sub1_8974);
		if (((Class160_Sub2) this).aBool9028) {
			float f_327_ = (float) method228();
			float f_328_ = (float) method2748();
			float f_329_ = (f_321_ - f) / f_327_;
			float f_330_ = (f_322_ - f_320_) / f_327_;
			float f_331_ = (f_323_ - f) / f_328_;
			float f_332_ = (f_324_ - f_320_) / f_328_;
			float f_333_ = f_331_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_334_ = f_332_ * (float) ((Class160_Sub2) this).anInt9034;
			float f_335_ = f_329_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_336_ = f_330_ * (float) ((Class160_Sub2) this).anInt9030;
			float f_337_ = -f_329_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_338_ = -f_330_ * (float) ((Class160_Sub2) this).anInt9036;
			float f_339_ = -f_331_ * (float) ((Class160_Sub2) this).anInt9035;
			float f_340_ = -f_332_ * (float) ((Class160_Sub2) this).anInt9035;
			f = f + f_335_ + f_333_;
			f_320_ = f_320_ + f_336_ + f_334_;
			f_321_ = f_321_ + f_337_ + f_333_;
			f_322_ = f_322_ + f_338_ + f_334_;
			f_323_ = f_323_ + f_335_ + f_339_;
			f_324_ = f_324_ + f_336_ + f_340_;
		}
		float f_341_ = f_323_ + (f_321_ - f);
		float f_342_ = f_322_ + (f_324_ - f_320_);
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351((i & 0x1) != 0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(class137_sub1_sub1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(7681, 8448);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 34168, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(1);
		float f_343_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10132 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10136);
		float f_344_ = (((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134 / (float) ((Class137_Sub1_Sub1) class137_sub1_sub1).anInt10133);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_343_ * (f - (float) i_325_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_344_ * (f_320_ - (float) i_326_)));
		OpenGL.glVertex2f(f, f_320_);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_343_ * (f_323_ - (float) i_325_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_344_ * (f_324_ - (float) i_326_)));
		OpenGL.glVertex2f(f_323_, f_324_);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, f_343_ * (f_341_ - (float) i_325_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_344_ * (f_342_ - (float) i_326_)));
		OpenGL.glVertex2f(f_341_, f_342_);
		OpenGL.glMultiTexCoord2f(33984, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
		OpenGL.glMultiTexCoord2f(33985, f_343_ * (f_321_ - (float) i_325_), ((((Class137_Sub1_Sub1) class137_sub1_sub1).aFloat10134) - f_344_ * (f_322_ - (float) i_326_)));
		OpenGL.glVertex2f(f_321_, f_322_);
		OpenGL.glEnd();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(0, 5890, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13612(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(null);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
	}

	void method14419(int i) {
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(((Class160_Sub2) this).aClass505_Sub1_9032.method13613(i), 7681);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34167, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13616(0, 34168, 770);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9029);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(34479, 7681);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34166, 768);
		if (((Class160_Sub2) this).anInt9031 == 0)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(1.0F, 0.5F, 0.5F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 1)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(0.5F, 1.0F, 0.5F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 2)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(0.5F, 0.5F, 1.0F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 3)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(128.5F, 128.5F, 128.5F, 0.0F);
	}

	public void method2804(int[] is) {
		is[0] = ((Class160_Sub2) this).anInt9030;
		is[1] = ((Class160_Sub2) this).anInt9034;
		is[2] = ((Class160_Sub2) this).anInt9036;
		is[3] = ((Class160_Sub2) this).anInt9035;
	}

	void method2787(int i, int i_345_, int i_346_, int i_347_, int i_348_, int i_349_, int i_350_, int i_351_) {
		((Class160_Sub2) this).aClass137_Sub1_Sub1_9033.method2351((i_351_ & 0x1) != 0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13637();
		((Class160_Sub2) this).aClass505_Sub1_9032.method13624(i_350_);
		OpenGL.glColor4ub((byte) (i_349_ >> 16), (byte) (i_349_ >> 8), (byte) i_349_, (byte) (i_349_ >> 24));
		if (((Class160_Sub2) this).aBool9028) {
			float f = (float) i_346_ / (float) method228();
			float f_352_ = (float) i_347_ / (float) method2748();
			float f_353_ = (float) i + (float) ((Class160_Sub2) this).anInt9030 * f;
			float f_354_ = ((float) i_345_ + (float) ((Class160_Sub2) this).anInt9034 * f_352_);
			float f_355_ = (f_353_ + (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10136) * f);
			float f_356_ = (f_354_ + (float) (((Class137_Sub1_Sub1) ((Class160_Sub2) this).aClass137_Sub1_Sub1_9033).anInt10133) * f_352_);
			if (((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 == null) {
				((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
				((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_348_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_353_, f_354_);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_353_, f_356_);
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_355_, f_356_);
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_355_, f_354_);
				OpenGL.glEnd();
			} else {
				method14419(i_348_);
				((Class160_Sub2) this).aClass137_Sub1_Sub1_9029.method2351(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
				OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_353_, f_354_);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(f_353_, f_356_);
				OpenGL.glMultiTexCoord2f(33985, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), 0.0F);
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
				OpenGL.glVertex2f(f_355_, f_356_);
				OpenGL.glMultiTexCoord2f(33985, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132), (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
				OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
				OpenGL.glVertex2f(f_355_, f_354_);
				OpenGL.glEnd();
				method14415();
			}
		} else if (((Class160_Sub2) this).aClass137_Sub1_Sub1_9029 == null) {
			((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
			((Class160_Sub2) this).aClass505_Sub1_9032.method13612(i_348_);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_345_);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_345_ + i_347_);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + i_346_, i_345_ + i_347_);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + i_346_, i_345_);
			OpenGL.glEnd();
		} else {
			method14419(i_348_);
			((Class160_Sub2) this).aClass137_Sub1_Sub1_9029.method2351(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(0.0F, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i, i_345_);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(i, i_345_ + i_347_);
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, 0.0F);
			OpenGL.glVertex2i(i + i_346_, i_345_ + i_347_);
			OpenGL.glMultiTexCoord2f(33985, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, (((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134));
			OpenGL.glTexCoord2f(((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10132, ((Class137_Sub1_Sub1) (((Class160_Sub2) this).aClass137_Sub1_Sub1_9033)).aFloat10134);
			OpenGL.glVertex2i(i + i_346_, i_345_);
			OpenGL.glEnd();
			method14415();
		}
	}

	void method14420(int i) {
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(((Class160_Sub2) this).aClass505_Sub1_9032.method13613(i), 7681);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34167, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13616(0, 34168, 770);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9029);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(34479, 7681);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34166, 768);
		if (((Class160_Sub2) this).anInt9031 == 0)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(1.0F, 0.5F, 0.5F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 1)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(0.5F, 1.0F, 0.5F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 2)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(0.5F, 0.5F, 1.0F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 3)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(128.5F, 128.5F, 128.5F, 0.0F);
	}

	void method14421() {
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(null);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(8448, 8448);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34168, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13616(0, 5890, 770);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34168, 768);
	}

	void method14422(int i) {
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(1);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9033);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(((Class160_Sub2) this).aClass505_Sub1_9032.method13613(i), 7681);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34167, 768);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13616(0, 34168, 770);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13610(0);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13654(((Class160_Sub2) this).aClass137_Sub1_Sub1_9029);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13717(34479, 7681);
		((Class160_Sub2) this).aClass505_Sub1_9032.method13595(1, 34166, 768);
		if (((Class160_Sub2) this).anInt9031 == 0)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(1.0F, 0.5F, 0.5F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 1)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(0.5F, 1.0F, 0.5F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 2)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(0.5F, 0.5F, 1.0F, 0.0F);
		else if (((Class160_Sub2) this).anInt9031 == 3)
			((Class160_Sub2) this).aClass505_Sub1_9032.method13635(128.5F, 128.5F, 128.5F, 0.0F);
	}
}
