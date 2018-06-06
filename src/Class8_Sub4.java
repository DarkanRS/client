
/* Class8_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class8_Sub4 extends FontRenderer {
	Interface4 anInterface4_9320;
	Class505_Sub2 aClass505_Sub2_9321;
	Interface6 anInterface6_9322;

	void c(char c, int i, int i_0_, int i_1_, boolean bool) {
		((Class8_Sub4) this).aClass505_Sub2_9321.method13935();
		((Class8_Sub4) this).aClass505_Sub2_9321.method13904(1);
		Class47 class47 = (((Class505_Sub2) ((Class8_Sub4) this).aClass505_Sub2_9321).aClass47_8698);
		class47.anInterface6_443 = ((Class8_Sub4) this).anInterface6_9322;
		class47.method937(3, i_1_);
		float f = (float) ((Class8_Sub4) this).aClass505_Sub2_9321.method8523((byte) 120).method2714();
		float f_2_ = (float) ((Class8_Sub4) this).aClass505_Sub2_9321.method8523((byte) 114).method2716();
		class47.aClass384_442.method6525(2.0F / f, 2.0F / f_2_, 1.0F, 1.0F);
		class47.aClass384_442.buf[12] = (((float) i + ((Class8_Sub4) this).aClass505_Sub2_9321.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.buf[13] = (((float) i_0_ + ((Class8_Sub4) this).aClass505_Sub2_9321.method13905()) * 2.0F / f_2_) - 1.0F;
		class47.aClass384_442.buf[14] = -1.0F;
		class47.aClass384_440.method6518();
		class47.anInterface4_445 = ((Class8_Sub4) this).anInterface4_9320;
		class47.anInt446 = c * '\004';
		class47.aClass70_447 = (((Class505_Sub2) ((Class8_Sub4) this).aClass505_Sub2_9321).aClass70_8832);
		class47.method936();
	}

	Class8_Sub4(Class505_Sub2 class505_sub2, FontMetrics class414, Class91[] class91s, boolean bool) {
		super(class505_sub2, class414);
		((Class8_Sub4) this).aClass505_Sub2_9321 = class505_sub2;
		int i = 0;
		for (int i_3_ = 0; i_3_ < 256; i_3_++) {
			Class91 class91 = class91s[i_3_];
			if (class91.anInt954 > i)
				i = class91.anInt954;
			if (class91.anInt957 > i)
				i = class91.anInt957;
		}
		int i_4_ = i * 16;
		if (bool) {
			byte[] is = new byte[i_4_ * i_4_];
			for (int i_5_ = 0; i_5_ < 256; i_5_++) {
				Class91 class91 = class91s[i_5_];
				int i_6_ = class91.anInt954;
				int i_7_ = class91.anInt957;
				int i_8_ = i_5_ % 16 * i;
				int i_9_ = i_5_ / 16 * i;
				int i_10_ = i_9_ * i_4_ + i_8_;
				int i_11_ = 0;
				if (class91.aByteArray961 == null) {
					byte[] is_12_ = class91.aByteArray960;
					for (int i_13_ = 0; i_13_ < i_6_; i_13_++) {
						for (int i_14_ = 0; i_14_ < i_7_; i_14_++)
							is[i_10_++] = (byte) (is_12_[i_11_++] == 0 ? 0 : -1);
						i_10_ += i_4_ - i_7_;
					}
				} else {
					byte[] is_15_ = class91.aByteArray961;
					for (int i_16_ = 0; i_16_ < i_6_; i_16_++) {
						for (int i_17_ = 0; i_17_ < i_7_; i_17_++)
							is[i_10_++] = is_15_[i_11_++];
						i_10_ += i_4_ - i_7_;
					}
				}
			}
			if (!class505_sub2.method13954(Class150.aClass150_1951, Class76.aClass76_751)) {
				int[] is_18_ = new int[is.length];
				for (int i_19_ = 0; i_19_ < is.length; i_19_++)
					is_18_[i_19_] = is[i_19_] << 24;
				((Class8_Sub4) this).anInterface6_9322 = class505_sub2.method14024(i_4_, i_4_, false, is_18_);
			} else
				((Class8_Sub4) this).anInterface6_9322 = class505_sub2.method13957(Class150.aClass150_1951, i_4_, i_4_, false, is);
		} else {
			int[] is = new int[i_4_ * i_4_];
			for (int i_20_ = 0; i_20_ < 256; i_20_++) {
				Class91 class91 = class91s[i_20_];
				int[] is_21_ = class91.anIntArray955;
				byte[] is_22_ = class91.aByteArray961;
				byte[] is_23_ = class91.aByteArray960;
				int i_24_ = class91.anInt954;
				int i_25_ = class91.anInt957;
				int i_26_ = i_20_ % 16 * i;
				int i_27_ = i_20_ / 16 * i;
				int i_28_ = i_27_ * i_4_ + i_26_;
				int i_29_ = 0;
				if (is_22_ != null) {
					for (int i_30_ = 0; i_30_ < i_24_; i_30_++) {
						for (int i_31_ = 0; i_31_ < i_25_; i_31_++) {
							is[i_28_++] = (is_22_[i_29_] << 24 | is_21_[is_23_[i_29_] & 0xff]);
							i_29_++;
						}
						i_28_ += i_4_ - i_25_;
					}
				} else {
					for (int i_32_ = 0; i_32_ < i_24_; i_32_++) {
						for (int i_33_ = 0; i_33_ < i_25_; i_33_++) {
							int i_34_;
							if ((i_34_ = is_23_[i_29_++]) != 0)
								is[i_28_++] = ~0xffffff | is_21_[i_34_ & 0xff];
							else
								i_28_++;
						}
						i_28_ += i_4_ - i_25_;
					}
				}
			}
			((Class8_Sub4) this).anInterface6_9322 = class505_sub2.method14024(i_4_, i_4_, false, is);
		}
		((Class8_Sub4) this).anInterface6_9322.method205(Class35.aClass35_383);
		((Class8_Sub4) this).anInterface4_9320 = class505_sub2.method13994(false);
		((Class8_Sub4) this).anInterface4_9320.method31(20480, 20);
		ByteBuffer bytebuffer = ((Class8_Sub4) this).aClass505_Sub2_9321.aByteBuffer8838;
		bytebuffer.clear();
		float f = (((Class8_Sub4) this).anInterface6_9322.method47((float) i_4_) / (float) i_4_);
		float f_35_ = (((Class8_Sub4) this).anInterface6_9322.method62((float) i_4_) / (float) i_4_);
		for (int i_36_ = 0; i_36_ < 256; i_36_++) {
			Class91 class91 = class91s[i_36_];
			int i_37_ = class91.anInt954;
			int i_38_ = class91.anInt957;
			int i_39_ = class91.anInt959;
			int i_40_ = class91.anInt956;
			float f_41_ = (float) (i_36_ % 16 * i);
			float f_42_ = (float) (i_36_ / 16 * i);
			float f_43_ = f_41_ * f;
			float f_44_ = f_42_ * f_35_;
			float f_45_ = (f_41_ + (float) i_38_) * f;
			float f_46_ = (f_42_ + (float) i_37_) * f_35_;
			bytebuffer.putFloat((float) i_40_);
			bytebuffer.putFloat((float) i_39_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_43_);
			bytebuffer.putFloat(f_44_);
			bytebuffer.putFloat((float) i_40_);
			bytebuffer.putFloat((float) (i_39_ + i_37_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_43_);
			bytebuffer.putFloat(f_46_);
			bytebuffer.putFloat((float) (i_40_ + i_38_));
			bytebuffer.putFloat((float) (i_39_ + i_37_));
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_45_);
			bytebuffer.putFloat(f_46_);
			bytebuffer.putFloat((float) (i_40_ + i_38_));
			bytebuffer.putFloat((float) i_39_);
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(f_45_);
			bytebuffer.putFloat(f_44_);
		}
		((Class8_Sub4) this).anInterface4_9320.method42(0, bytebuffer.position(), (((Class8_Sub4) this).aClass505_Sub2_9321.aLong8695));
		class505_sub2.method13896(12);
	}

	void method362(char c, int i, int i_47_, int i_48_, boolean bool, Class455 class455, int i_49_, int i_50_) {
		/* empty */
	}

	void UA(char c, int i, int i_51_, int i_52_, boolean bool) {
		((Class8_Sub4) this).aClass505_Sub2_9321.method13935();
		((Class8_Sub4) this).aClass505_Sub2_9321.method13904(1);
		Class47 class47 = (((Class505_Sub2) ((Class8_Sub4) this).aClass505_Sub2_9321).aClass47_8698);
		class47.anInterface6_443 = ((Class8_Sub4) this).anInterface6_9322;
		class47.method937(3, i_52_);
		float f = (float) ((Class8_Sub4) this).aClass505_Sub2_9321.method8523((byte) 111).method2714();
		float f_53_ = (float) ((Class8_Sub4) this).aClass505_Sub2_9321.method8523((byte) 111).method2716();
		class47.aClass384_442.method6525(2.0F / f, 2.0F / f_53_, 1.0F, 1.0F);
		class47.aClass384_442.buf[12] = (((float) i + ((Class8_Sub4) this).aClass505_Sub2_9321.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.buf[13] = (((float) i_51_ + ((Class8_Sub4) this).aClass505_Sub2_9321.method13905()) * 2.0F / f_53_) - 1.0F;
		class47.aClass384_442.buf[14] = -1.0F;
		class47.aClass384_440.method6518();
		class47.anInterface4_445 = ((Class8_Sub4) this).anInterface4_9320;
		class47.anInt446 = c * '\004';
		class47.aClass70_447 = (((Class505_Sub2) ((Class8_Sub4) this).aClass505_Sub2_9321).aClass70_8832);
		class47.method936();
	}

	void method374(char c, int i, int i_54_, int i_55_, boolean bool, Class455 class455, int i_56_, int i_57_) {
		/* empty */
	}

	void t(char c, int i, int i_58_, int i_59_, boolean bool) {
		((Class8_Sub4) this).aClass505_Sub2_9321.method13935();
		((Class8_Sub4) this).aClass505_Sub2_9321.method13904(1);
		Class47 class47 = (((Class505_Sub2) ((Class8_Sub4) this).aClass505_Sub2_9321).aClass47_8698);
		class47.anInterface6_443 = ((Class8_Sub4) this).anInterface6_9322;
		class47.method937(3, i_59_);
		float f = (float) ((Class8_Sub4) this).aClass505_Sub2_9321.method8523((byte) 124).method2714();
		float f_60_ = (float) ((Class8_Sub4) this).aClass505_Sub2_9321.method8523((byte) 115).method2716();
		class47.aClass384_442.method6525(2.0F / f, 2.0F / f_60_, 1.0F, 1.0F);
		class47.aClass384_442.buf[12] = (((float) i + ((Class8_Sub4) this).aClass505_Sub2_9321.method13905()) * 2.0F / f) - 1.0F;
		class47.aClass384_442.buf[13] = (((float) i_58_ + ((Class8_Sub4) this).aClass505_Sub2_9321.method13905()) * 2.0F / f_60_) - 1.0F;
		class47.aClass384_442.buf[14] = -1.0F;
		class47.aClass384_440.method6518();
		class47.anInterface4_445 = ((Class8_Sub4) this).anInterface4_9320;
		class47.anInt446 = c * '\004';
		class47.aClass70_447 = (((Class505_Sub2) ((Class8_Sub4) this).aClass505_Sub2_9321).aClass70_8832);
		class47.method936();
	}
}
