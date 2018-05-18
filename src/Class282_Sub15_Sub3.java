/* Class282_Sub15_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub15_Sub3 extends Class282_Sub15 {
	Class282_Sub15_Sub2 aClass282_Sub15_Sub2_9753;
	NodeCollection aClass482_9754 = new NodeCollection();
	Class282_Sub15_Sub4 aClass282_Sub15_Sub4_9755 = new Class282_Sub15_Sub4();

	void method12242(int[] is, int i, int i_0_) {
		((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method12230(is, i, i_0_);
		while_194_: for (Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.head((byte) 9); null != class282_sub13; class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.next(170364017)) {
			if (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15115(class282_sub13, 2059938362)) {
				int i_1_ = i;
				int i_2_ = i_0_;
				while_192_: do {
					do {
						if (i_2_ <= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584))
							break while_192_;
						method15234(class282_sub13, is, i_1_, (((Class282_Sub13) class282_sub13).anInt7584) * 1985703289, i_1_ + i_2_, 286364982);
						i_1_ += (((Class282_Sub13) class282_sub13).anInt7584 * 1985703289);
						i_2_ -= 1985703289 * (((Class282_Sub13) class282_sub13).anInt7584);
					} while (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15128(class282_sub13, is, i_1_, i_2_, -1639993540));
					continue while_194_;
				} while (false);
				method15234(class282_sub13, is, i_1_, i_2_, i_2_ + i_1_, 286364982);
				((Class282_Sub13) class282_sub13).anInt7584 -= i_2_ * -431461175;
			}
		}
	}

	Class282_Sub15 method12226() {
		Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.head((byte) 120);
		if (class282_sub13 == null)
			return null;
		if (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 != null)
			return ((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568;
		return method12239();
	}

	int method12224() {
		return 0;
	}

	void method15231(Class282_Sub13 class282_sub13, int i) {
		if (((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9707[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) & 0x4) != 0 && ((Class282_Sub13) class282_sub13).anInt7579 * 761835511 < 0) {
			int i_3_ = ((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9712[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) / Class253.anInt3129);
			int i_4_ = ((i_3_ + 1048575 - ((Class282_Sub13) class282_sub13).anInt7583 * 1147204123) / i_3_);
			((Class282_Sub13) class282_sub13).anInt7583 = ((i * i_3_ + ((Class282_Sub13) class282_sub13).anInt7583 * 1147204123) & 0xfffff) * 940218387;
			if (i_4_ <= i) {
				Class282_Sub15_Sub5 class282_sub15_sub5 = (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
				if (0 == (((Class282_Sub15_Sub2) (((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753)).anIntArray9704[(846406309 * ((Class282_Sub13) class282_sub13).anInt7582)]))
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1803325867), class282_sub15_sub5.method15315(-1614882126), class282_sub15_sub5.method15316(1381675266)));
				else {
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-2026061524), 0, class282_sub15_sub5.method15316(1709464558)));
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15099(class282_sub13, (((Class282_Sub14) (((Class282_Sub13) class282_sub13).aClass282_Sub14_7566)).aShortArray7590[(((Class282_Sub13) class282_sub13).anInt7569 * 1293000467)]) < 0, (byte) 48);
				}
				if ((((Class282_Sub14) ((Class282_Sub13) class282_sub13).aClass282_Sub14_7566).aShortArray7590[(((Class282_Sub13) class282_sub13).anInt7569 * 1293000467)]) < 0)
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15325(-1, (byte) 8);
				i = (((Class282_Sub13) class282_sub13).anInt7583 * 1147204123 / i_3_);
			}
		}
		((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12231(i);
	}

	void method12230(int[] is, int i, int i_5_) {
		((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method12230(is, i, i_5_);
		while_197_: for (Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.head((byte) 60); null != class282_sub13; class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.next(-503729338)) {
			if (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15115(class282_sub13, 2021322787)) {
				int i_6_ = i;
				int i_7_ = i_5_;
				while_195_: do {
					do {
						if (i_7_ <= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584))
							break while_195_;
						method15234(class282_sub13, is, i_6_, (((Class282_Sub13) class282_sub13).anInt7584) * 1985703289, i_6_ + i_7_, 286364982);
						i_6_ += (((Class282_Sub13) class282_sub13).anInt7584 * 1985703289);
						i_7_ -= 1985703289 * (((Class282_Sub13) class282_sub13).anInt7584);
					} while (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15128(class282_sub13, is, i_6_, i_7_, -465224323));
					continue while_197_;
				} while (false);
				method15234(class282_sub13, is, i_6_, i_7_, i_7_ + i_6_, 286364982);
				((Class282_Sub13) class282_sub13).anInt7584 -= i_7_ * -431461175;
			}
		}
	}

	void method15232(Class282_Sub13 class282_sub13, int[] is, int i, int i_8_, int i_9_) {
		if (((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9707[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) & 0x4) != 0 && ((Class282_Sub13) class282_sub13).anInt7579 * 761835511 < 0) {
			int i_10_ = ((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9712[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) / Class253.anInt3129);
			for (;;) {
				int i_11_ = ((1048575 + i_10_ - 1147204123 * (((Class282_Sub13) class282_sub13).anInt7583)) / i_10_);
				if (i_11_ > i_8_)
					break;
				((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12230(is, i, i_11_);
				i += i_11_;
				i_8_ -= i_11_;
				((Class282_Sub13) class282_sub13).anInt7583 += (i_10_ * i_11_ - 1048576) * 940218387;
				int i_12_ = Class253.anInt3129 / 100;
				int i_13_ = 262144 / i_10_;
				if (i_13_ < i_12_)
					i_12_ = i_13_;
				Class282_Sub15_Sub5 class282_sub15_sub5 = (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
				if (0 == (((Class282_Sub15_Sub2) (((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753)).anIntArray9704[(846406309 * ((Class282_Sub13) class282_sub13).anInt7582)]))
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1713560523), class282_sub15_sub5.method15315(-1042246039), class282_sub15_sub5.method15316(1783559851)));
				else {
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-2083319476), 0, class282_sub15_sub5.method15316(-1080058557)));
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15099(class282_sub13, (((Class282_Sub14) (((Class282_Sub13) class282_sub13).aClass282_Sub14_7566)).aShortArray7590[1293000467 * (((Class282_Sub13) class282_sub13).anInt7569)]) < 0, (byte) -23);
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15320(i_12_, class282_sub15_sub5.method15315(-384187752), -1605658118);
				}
				if ((((Class282_Sub14) ((Class282_Sub13) class282_sub13).aClass282_Sub14_7566).aShortArray7590[(((Class282_Sub13) class282_sub13).anInt7569 * 1293000467)]) < 0)
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15325(-1, (byte) 8);
				class282_sub15_sub5.method15322(i_12_, (byte) 104);
				class282_sub15_sub5.method12230(is, i, i_9_ - i);
				if (class282_sub15_sub5.method15311((byte) 33))
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method15275(class282_sub15_sub5);
			}
			((Class282_Sub13) class282_sub13).anInt7583 += i_8_ * i_10_ * 940218387;
		}
		((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12230(is, i, i_8_);
	}

	Class282_Sub15 method12233() {
		Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.head((byte) 41);
		if (class282_sub13 == null)
			return null;
		if (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 != null)
			return ((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568;
		return method12239();
	}

	void method15233(Class282_Sub13 class282_sub13, int i, int i_14_) {
		if (((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9707[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) & 0x4) != 0 && ((Class282_Sub13) class282_sub13).anInt7579 * 761835511 < 0) {
			int i_15_ = ((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9712[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) / Class253.anInt3129);
			int i_16_ = ((i_15_ + 1048575 - ((Class282_Sub13) class282_sub13).anInt7583 * 1147204123) / i_15_);
			((Class282_Sub13) class282_sub13).anInt7583 = ((i * i_15_ + ((Class282_Sub13) class282_sub13).anInt7583 * 1147204123) & 0xfffff) * 940218387;
			if (i_16_ <= i) {
				Class282_Sub15_Sub5 class282_sub15_sub5 = (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
				if (0 == (((Class282_Sub15_Sub2) (((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753)).anIntArray9704[(846406309 * ((Class282_Sub13) class282_sub13).anInt7582)]))
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1982478339), class282_sub15_sub5.method15315(-821905990), class282_sub15_sub5.method15316(690484951)));
				else {
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-2009448683), 0, class282_sub15_sub5.method15316(-1602994122)));
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15099(class282_sub13, (((Class282_Sub14) (((Class282_Sub13) class282_sub13).aClass282_Sub14_7566)).aShortArray7590[(((Class282_Sub13) class282_sub13).anInt7569 * 1293000467)]) < 0, (byte) -35);
				}
				if ((((Class282_Sub14) ((Class282_Sub13) class282_sub13).aClass282_Sub14_7566).aShortArray7590[(((Class282_Sub13) class282_sub13).anInt7569 * 1293000467)]) < 0)
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15325(-1, (byte) 8);
				i = (((Class282_Sub13) class282_sub13).anInt7583 * 1147204123 / i_15_);
			}
		}
		((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12231(i);
	}

	Class282_Sub15 method12232() {
		Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.head((byte) 77);
		if (class282_sub13 == null)
			return null;
		if (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 != null)
			return ((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568;
		return method12239();
	}

	void method15234(Class282_Sub13 class282_sub13, int[] is, int i, int i_17_, int i_18_, int i_19_) {
		if (((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9707[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) & 0x4) != 0 && ((Class282_Sub13) class282_sub13).anInt7579 * 761835511 < 0) {
			int i_20_ = ((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9712[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) / Class253.anInt3129);
			for (;;) {
				int i_21_ = ((1048575 + i_20_ - 1147204123 * (((Class282_Sub13) class282_sub13).anInt7583)) / i_20_);
				if (i_21_ > i_17_)
					break;
				((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12230(is, i, i_21_);
				i += i_21_;
				i_17_ -= i_21_;
				((Class282_Sub13) class282_sub13).anInt7583 += (i_20_ * i_21_ - 1048576) * 940218387;
				int i_22_ = Class253.anInt3129 / 100;
				int i_23_ = 262144 / i_20_;
				if (i_23_ < i_22_)
					i_22_ = i_23_;
				Class282_Sub15_Sub5 class282_sub15_sub5 = (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
				if (0 == (((Class282_Sub15_Sub2) (((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753)).anIntArray9704[(846406309 * ((Class282_Sub13) class282_sub13).anInt7582)]))
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1968132723), class282_sub15_sub5.method15315(-646351712), class282_sub15_sub5.method15316(1503134708)));
				else {
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1801069434), 0, class282_sub15_sub5.method15316(696166910)));
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15099(class282_sub13, (((Class282_Sub14) (((Class282_Sub13) class282_sub13).aClass282_Sub14_7566)).aShortArray7590[1293000467 * (((Class282_Sub13) class282_sub13).anInt7569)]) < 0, (byte) 17);
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15320(i_22_, class282_sub15_sub5.method15315(-1596806100), -1351786987);
				}
				if ((((Class282_Sub14) ((Class282_Sub13) class282_sub13).aClass282_Sub14_7566).aShortArray7590[(((Class282_Sub13) class282_sub13).anInt7569 * 1293000467)]) < 0)
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15325(-1, (byte) 8);
				class282_sub15_sub5.method15322(i_22_, (byte) -5);
				class282_sub15_sub5.method12230(is, i, i_18_ - i);
				if (class282_sub15_sub5.method15311((byte) 33))
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method15275(class282_sub15_sub5);
			}
			((Class282_Sub13) class282_sub13).anInt7583 += i_17_ * i_20_ * 940218387;
		}
		((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12230(is, i, i_17_);
	}

	Class282_Sub15 method12229() {
		for (;;) {
			Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.next(-340710606);
			if (null == class282_sub13)
				return null;
			if (null != ((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568)
				return (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
		}
	}

	Class282_Sub15 method12235() {
		for (;;) {
			Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.next(132765120);
			if (null == class282_sub13)
				return null;
			if (null != ((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568)
				return (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
		}
	}

	Class282_Sub15 method12236() {
		for (;;) {
			Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.next(2134723021);
			if (null == class282_sub13)
				return null;
			if (null != ((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568)
				return (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
		}
	}

	int method12227() {
		return 0;
	}

	int method12238() {
		return 0;
	}

	void method15235(Class282_Sub13 class282_sub13, int i) {
		if (((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9707[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) & 0x4) != 0 && ((Class282_Sub13) class282_sub13).anInt7579 * 761835511 < 0) {
			int i_24_ = ((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9712[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) / Class253.anInt3129);
			int i_25_ = ((i_24_ + 1048575 - ((Class282_Sub13) class282_sub13).anInt7583 * 1147204123) / i_24_);
			((Class282_Sub13) class282_sub13).anInt7583 = ((i * i_24_ + ((Class282_Sub13) class282_sub13).anInt7583 * 1147204123) & 0xfffff) * 940218387;
			if (i_25_ <= i) {
				Class282_Sub15_Sub5 class282_sub15_sub5 = (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
				if (0 == (((Class282_Sub15_Sub2) (((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753)).anIntArray9704[(846406309 * ((Class282_Sub13) class282_sub13).anInt7582)]))
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1805555378), class282_sub15_sub5.method15315(1372590596), class282_sub15_sub5.method15316(1907515819)));
				else {
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1677218417), 0, class282_sub15_sub5.method15316(100318648)));
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15099(class282_sub13, (((Class282_Sub14) (((Class282_Sub13) class282_sub13).aClass282_Sub14_7566)).aShortArray7590[(((Class282_Sub13) class282_sub13).anInt7569 * 1293000467)]) < 0, (byte) -53);
				}
				if ((((Class282_Sub14) ((Class282_Sub13) class282_sub13).aClass282_Sub14_7566).aShortArray7590[(((Class282_Sub13) class282_sub13).anInt7569 * 1293000467)]) < 0)
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15325(-1, (byte) 8);
				i = (((Class282_Sub13) class282_sub13).anInt7583 * 1147204123 / i_24_);
			}
		}
		((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12231(i);
	}

	int method12244() {
		return 0;
	}

	Class282_Sub15_Sub3(Class282_Sub15_Sub2 class282_sub15_sub2) {
		((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753 = class282_sub15_sub2;
	}

	void method12241(int[] is, int i, int i_26_) {
		((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method12230(is, i, i_26_);
		while_200_: for (Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.head((byte) 61); null != class282_sub13; class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.next(1821407871)) {
			if (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15115(class282_sub13, 1864764119)) {
				int i_27_ = i;
				int i_28_ = i_26_;
				while_198_: do {
					do {
						if (i_28_ <= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584))
							break while_198_;
						method15234(class282_sub13, is, i_27_, (((Class282_Sub13) class282_sub13).anInt7584) * 1985703289, i_27_ + i_28_, 286364982);
						i_27_ += (((Class282_Sub13) class282_sub13).anInt7584 * 1985703289);
						i_28_ -= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584);
					} while (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15128(class282_sub13, is, i_27_, i_28_, -579260816));
					continue while_200_;
				} while (false);
				method15234(class282_sub13, is, i_27_, i_28_, i_28_ + i_27_, 286364982);
				((Class282_Sub13) class282_sub13).anInt7584 -= i_28_ * -431461175;
			}
		}
	}

	Class282_Sub15 method12239() {
		for (;;) {
			Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.next(2047491972);
			if (null == class282_sub13)
				return null;
			if (null != ((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568)
				return (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
		}
	}

	void method12243(int i) {
		((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method12231(i);
		while_203_: for (Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.head((byte) 48); class282_sub13 != null; class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.next(-370103133)) {
			if (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15115(class282_sub13, 2054111295)) {
				int i_29_ = i;
				while_201_: do {
					do {
						if (i_29_ <= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584))
							break while_201_;
						method15233(class282_sub13, (((Class282_Sub13) class282_sub13).anInt7584) * 1985703289, -2038249384);
						i_29_ -= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584);
					} while (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15128(class282_sub13, null, 0, i_29_, 1061686588));
					continue while_203_;
				} while (false);
				method15233(class282_sub13, i_29_, -1157347305);
				((Class282_Sub13) class282_sub13).anInt7584 -= -431461175 * i_29_;
			}
		}
	}

	void method12234(int i) {
		((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method12231(i);
		while_206_: for (Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.head((byte) 61); class282_sub13 != null; class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.next(1963194555)) {
			if (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15115(class282_sub13, 1966927188)) {
				int i_30_ = i;
				while_204_: do {
					do {
						if (i_30_ <= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584))
							break while_204_;
						method15233(class282_sub13, (((Class282_Sub13) class282_sub13).anInt7584) * 1985703289, -1356701033);
						i_30_ -= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584);
					} while (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15128(class282_sub13, null, 0, i_30_, 122684206));
					continue while_206_;
				} while (false);
				method15233(class282_sub13, i_30_, -918400987);
				((Class282_Sub13) class282_sub13).anInt7584 -= -431461175 * i_30_;
			}
		}
	}

	void method15236(Class282_Sub13 class282_sub13, int[] is, int i, int i_31_, int i_32_) {
		if (((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9707[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) & 0x4) != 0 && ((Class282_Sub13) class282_sub13).anInt7579 * 761835511 < 0) {
			int i_33_ = ((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9712[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) / Class253.anInt3129);
			for (;;) {
				int i_34_ = ((1048575 + i_33_ - 1147204123 * (((Class282_Sub13) class282_sub13).anInt7583)) / i_33_);
				if (i_34_ > i_31_)
					break;
				((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12230(is, i, i_34_);
				i += i_34_;
				i_31_ -= i_34_;
				((Class282_Sub13) class282_sub13).anInt7583 += (i_33_ * i_34_ - 1048576) * 940218387;
				int i_35_ = Class253.anInt3129 / 100;
				int i_36_ = 262144 / i_33_;
				if (i_36_ < i_35_)
					i_35_ = i_36_;
				Class282_Sub15_Sub5 class282_sub15_sub5 = (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
				if (0 == (((Class282_Sub15_Sub2) (((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753)).anIntArray9704[(846406309 * ((Class282_Sub13) class282_sub13).anInt7582)]))
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1361504399), class282_sub15_sub5.method15315(1266272092), class282_sub15_sub5.method15316(1821621343)));
				else {
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1536839475), 0, class282_sub15_sub5.method15316(2016674106)));
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15099(class282_sub13, (((Class282_Sub14) (((Class282_Sub13) class282_sub13).aClass282_Sub14_7566)).aShortArray7590[1293000467 * (((Class282_Sub13) class282_sub13).anInt7569)]) < 0, (byte) -29);
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15320(i_35_, class282_sub15_sub5.method15315(1712492178), -1932271656);
				}
				if ((((Class282_Sub14) ((Class282_Sub13) class282_sub13).aClass282_Sub14_7566).aShortArray7590[(((Class282_Sub13) class282_sub13).anInt7569 * 1293000467)]) < 0)
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15325(-1, (byte) 8);
				class282_sub15_sub5.method15322(i_35_, (byte) 51);
				class282_sub15_sub5.method12230(is, i, i_32_ - i);
				if (class282_sub15_sub5.method15311((byte) 33))
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method15275(class282_sub15_sub5);
			}
			((Class282_Sub13) class282_sub13).anInt7583 += i_31_ * i_33_ * 940218387;
		}
		((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12230(is, i, i_31_);
	}

	void method15237(Class282_Sub13 class282_sub13, int[] is, int i, int i_37_, int i_38_) {
		if (((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9707[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) & 0x4) != 0 && ((Class282_Sub13) class282_sub13).anInt7579 * 761835511 < 0) {
			int i_39_ = ((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9712[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) / Class253.anInt3129);
			for (;;) {
				int i_40_ = ((1048575 + i_39_ - 1147204123 * (((Class282_Sub13) class282_sub13).anInt7583)) / i_39_);
				if (i_40_ > i_37_)
					break;
				((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12230(is, i, i_40_);
				i += i_40_;
				i_37_ -= i_40_;
				((Class282_Sub13) class282_sub13).anInt7583 += (i_39_ * i_40_ - 1048576) * 940218387;
				int i_41_ = Class253.anInt3129 / 100;
				int i_42_ = 262144 / i_39_;
				if (i_42_ < i_41_)
					i_41_ = i_42_;
				Class282_Sub15_Sub5 class282_sub15_sub5 = (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
				if (0 == (((Class282_Sub15_Sub2) (((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753)).anIntArray9704[(846406309 * ((Class282_Sub13) class282_sub13).anInt7582)]))
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1769291758), class282_sub15_sub5.method15315(-484247750), class282_sub15_sub5.method15316(347029315)));
				else {
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1394801464), 0, class282_sub15_sub5.method15316(-423280920)));
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15099(class282_sub13, (((Class282_Sub14) (((Class282_Sub13) class282_sub13).aClass282_Sub14_7566)).aShortArray7590[1293000467 * (((Class282_Sub13) class282_sub13).anInt7569)]) < 0, (byte) -28);
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15320(i_41_, class282_sub15_sub5.method15315(-510454693), -1423355908);
				}
				if ((((Class282_Sub14) ((Class282_Sub13) class282_sub13).aClass282_Sub14_7566).aShortArray7590[(((Class282_Sub13) class282_sub13).anInt7569 * 1293000467)]) < 0)
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15325(-1, (byte) 8);
				class282_sub15_sub5.method15322(i_41_, (byte) -25);
				class282_sub15_sub5.method12230(is, i, i_38_ - i);
				if (class282_sub15_sub5.method15311((byte) 33))
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method15275(class282_sub15_sub5);
			}
			((Class282_Sub13) class282_sub13).anInt7583 += i_37_ * i_39_ * 940218387;
		}
		((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12230(is, i, i_37_);
	}

	void method15238(Class282_Sub13 class282_sub13, int[] is, int i, int i_43_, int i_44_) {
		if (((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9707[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) & 0x4) != 0 && ((Class282_Sub13) class282_sub13).anInt7579 * 761835511 < 0) {
			int i_45_ = ((((Class282_Sub15_Sub2) ((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753).anIntArray9712[((Class282_Sub13) class282_sub13).anInt7582 * 846406309]) / Class253.anInt3129);
			for (;;) {
				int i_46_ = ((1048575 + i_45_ - 1147204123 * (((Class282_Sub13) class282_sub13).anInt7583)) / i_45_);
				if (i_46_ > i_43_)
					break;
				((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12230(is, i, i_46_);
				i += i_46_;
				i_43_ -= i_46_;
				((Class282_Sub13) class282_sub13).anInt7583 += (i_45_ * i_46_ - 1048576) * 940218387;
				int i_47_ = Class253.anInt3129 / 100;
				int i_48_ = 262144 / i_45_;
				if (i_48_ < i_47_)
					i_47_ = i_48_;
				Class282_Sub15_Sub5 class282_sub15_sub5 = (((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568);
				if (0 == (((Class282_Sub15_Sub2) (((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753)).anIntArray9704[(846406309 * ((Class282_Sub13) class282_sub13).anInt7582)]))
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1920455571), class282_sub15_sub5.method15315(1883953030), class282_sub15_sub5.method15316(79132451)));
				else {
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568 = (((Class282_Sub13) class282_sub13).aClass282_Sub26_Sub1_7565.method15225(class282_sub15_sub5.method15323(-1364871081), 0, class282_sub15_sub5.method15316(676850408)));
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15099(class282_sub13, (((Class282_Sub14) (((Class282_Sub13) class282_sub13).aClass282_Sub14_7566)).aShortArray7590[1293000467 * (((Class282_Sub13) class282_sub13).anInt7569)]) < 0, (byte) -6);
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15320(i_47_, class282_sub15_sub5.method15315(-1278499769), -1939624638);
				}
				if ((((Class282_Sub14) ((Class282_Sub13) class282_sub13).aClass282_Sub14_7566).aShortArray7590[(((Class282_Sub13) class282_sub13).anInt7569 * 1293000467)]) < 0)
					((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method15325(-1, (byte) 8);
				class282_sub15_sub5.method15322(i_47_, (byte) -84);
				class282_sub15_sub5.method12230(is, i, i_44_ - i);
				if (class282_sub15_sub5.method15311((byte) 33))
					((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method15275(class282_sub15_sub5);
			}
			((Class282_Sub13) class282_sub13).anInt7583 += i_43_ * i_45_ * 940218387;
		}
		((Class282_Sub13) class282_sub13).aClass282_Sub15_Sub5_7568.method12230(is, i, i_43_);
	}

	int method12228() {
		return 0;
	}

	void method12231(int i) {
		((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method12231(i);
		while_209_: for (Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.head((byte) 104); class282_sub13 != null; class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.next(1065777410)) {
			if (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15115(class282_sub13, 2094163441)) {
				int i_49_ = i;
				while_207_: do {
					do {
						if (i_49_ <= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584))
							break while_207_;
						method15233(class282_sub13, (((Class282_Sub13) class282_sub13).anInt7584) * 1985703289, -1208210724);
						i_49_ -= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584);
					} while (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15128(class282_sub13, null, 0, i_49_, 57208903));
					continue while_209_;
				} while (false);
				method15233(class282_sub13, i_49_, -1401648790);
				((Class282_Sub13) class282_sub13).anInt7584 -= -431461175 * i_49_;
			}
		}
	}

	void method12240(int[] is, int i, int i_50_) {
		((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub4_9755.method12230(is, i, i_50_);
		while_212_: for (Class282_Sub13 class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.head((byte) 70); null != class282_sub13; class282_sub13 = (Class282_Sub13) ((Class282_Sub15_Sub3) this).aClass482_9754.next(2023134706)) {
			if (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15115(class282_sub13, 1817142568)) {
				int i_51_ = i;
				int i_52_ = i_50_;
				while_210_: do {
					do {
						if (i_52_ <= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584))
							break while_210_;
						method15234(class282_sub13, is, i_51_, (((Class282_Sub13) class282_sub13).anInt7584) * 1985703289, i_51_ + i_52_, 286364982);
						i_51_ += (((Class282_Sub13) class282_sub13).anInt7584 * 1985703289);
						i_52_ -= (1985703289 * ((Class282_Sub13) class282_sub13).anInt7584);
					} while (!((Class282_Sub15_Sub3) this).aClass282_Sub15_Sub2_9753.method15128(class282_sub13, is, i_51_, i_52_, 76289834));
					continue while_212_;
				} while (false);
				method15234(class282_sub13, is, i_51_, i_52_, i_52_ + i_51_, 286364982);
				((Class282_Sub13) class282_sub13).anInt7584 -= i_52_ * -431461175;
			}
		}
	}

	public static void method15239(Class356 class356, Class353 class353, int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, byte i_61_) {
		Class174.aClass356_2139 = class356;
		Class174.aClass353_2140 = class353;
		Class174.anInt2134 = -773373219 * i;
		Class174.anInt2133 = 1089378155 * i_53_;
		Class174.anInt2136 = 1954124527 * i_54_;
		Class208.anInt2662 = i_55_ * -1130345879;
		Class232.anInt2878 = i_56_ * -3876747;
		Class477.anInt5630 = -964486071 * i_57_;
		Class359.anInt4163 = i_58_ * 1622687971;
		Class174.aClass91_2141 = null;
		Class174.aClass91_2138 = null;
		Class242.aClass91_2981 = null;
		Class434.anInt5329 = i_59_ * 564282469;
		Class174.anInt2137 = -2088983635 * i_60_;
		Class174.method2954(305406486);
		Class174.aBool2135 = true;
	}
}
