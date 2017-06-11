/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class27 {
	int anInt357 = 0;
	Class47_Sub5 aClass47_Sub5_358;
	int anInt359 = 0;
	int anInt360 = 0;
	Class_ra_Sub2 aClass_ra_Sub2_361;
	Class45 aClass45_362;
	Class47[] aClass47Array363;

	boolean method400(int i) {
		return ((Class27) this).aClass47Array363[i].method501();
	}

	void method401(int i, int i_0_, int i_1_, boolean bool, boolean bool_2_) {
		bool_2_ &= ((Class27) this).aClass_ra_Sub2_361.method5224();
		if (!bool_2_ && (i == 4 || i == 8 || i == 9)) {
			if (i == 4)
				i_1_ = i_0_;
			i = 2;
		}
		if (i != 0 && bool)
			i |= ~0x7fffffff;
		if (((Class27) this).anInt360 != i) {
			if (((Class27) this).anInt360 != 0)
				((Class27) this).aClass47Array363[((Class27) this).anInt360 & 0x7fffffff].method504();
			if (i != 0) {
				((Class27) this).aClass47Array363[i & 0x7fffffff].method505(bool);
				((Class27) this).aClass47Array363[i & 0x7fffffff].method518(bool);
				((Class27) this).aClass47Array363[i & 0x7fffffff].method503(i_0_, i_1_);
			}
			((Class27) this).anInt360 = i;
			((Class27) this).anInt357 = i_0_;
			((Class27) this).anInt359 = i_1_;
		} else if (((Class27) this).anInt360 != 0) {
			((Class27) this).aClass47Array363[((Class27) this).anInt360 & 0x7fffffff].method518(bool);
			if (((Class27) this).anInt357 != i_0_ || ((Class27) this).anInt359 != i_1_) {
				((Class27) this).aClass47Array363[((Class27) this).anInt360 & 0x7fffffff].method503(i_0_, i_1_);
				((Class27) this).anInt357 = i_0_;
				((Class27) this).anInt359 = i_1_;
			}
		}
	}

	boolean method402(Class30 class30, int i) {
		if (((Class27) this).anInt360 == 0)
			return false;
		((Class27) this).aClass47Array363[((Class27) this).anInt360 & 0x7fffffff].method500(class30, i);
		return true;
	}

	Class27(Class_ra_Sub2 class_ra_sub2) {
		((Class27) this).aClass_ra_Sub2_361 = class_ra_sub2;
		((Class27) this).aClass45_362 = new Class45(class_ra_sub2);
		((Class27) this).aClass47Array363 = new Class47[16];
		((Class27) this).aClass47Array363[1] = new Class47_Sub3(class_ra_sub2);
		((Class27) this).aClass47Array363[2] = new Class47_Sub8(class_ra_sub2, ((Class27) this).aClass45_362);
		((Class27) this).aClass47Array363[4] = new Class47_Sub4(class_ra_sub2, ((Class27) this).aClass45_362);
		((Class27) this).aClass47Array363[5] = new Class47_Sub6(class_ra_sub2, ((Class27) this).aClass45_362);
		((Class27) this).aClass47Array363[6] = new Class47_Sub1(class_ra_sub2);
		((Class27) this).aClass47Array363[7] = new Class47_Sub7(class_ra_sub2);
		((Class27) this).aClass47Array363[3] = ((Class27) this).aClass47_Sub5_358 = new Class47_Sub5(class_ra_sub2);
		((Class27) this).aClass47Array363[8] = new Class47_Sub9(class_ra_sub2, ((Class27) this).aClass45_362);
		((Class27) this).aClass47Array363[9] = new Class47_Sub2(class_ra_sub2, ((Class27) this).aClass45_362);
		if (!((Class27) this).aClass47Array363[8].method501())
			((Class27) this).aClass47Array363[8] = ((Class27) this).aClass47Array363[4];
		if (!((Class27) this).aClass47Array363[9].method501())
			((Class27) this).aClass47Array363[9] = ((Class27) this).aClass47Array363[8];
	}
}
