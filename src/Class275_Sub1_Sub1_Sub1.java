
/* Class275_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class275_Sub1_Sub1_Sub1 extends Class275_Sub1_Sub1 {
	short aShort10424;
	short aShort10425;
	int anInt10426;
	short aShort10427;
	Class538 aClass538_10428;
	int anInt10429;
	short aShort10430;
	short aShort10431;
	short aShort10432;

	void method15952(SceneObjectManager class206, GraphicalRenderer class505, long l) {
		int i = anInt10205 >> 12 + class206.anInt2592 * -1928575293;
		int i_0_ = anInt10202 >> 12 + class206.anInt2592 * -1928575293;
		int i_1_ = anInt10208 >> 12;
		if (i_1_ > 0 || i_1_ < -262144 || i < 0 || i >= class206.anInt2617 * -1912960305 || i_0_ < 0 || i_0_ >= class206.anInt2603 * -18177099)
			method15957();
		else {
			Class539 class539 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102);
			Class59 class59 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass59_7101);
			Class390[] class390s = class206.aClass390Array2591;
			int i_2_ = ((Class539) class539).anInt7122;
			Class293 class293 = (class206.aClass293ArrayArrayArray2604[((Class539) class539).anInt7122][i][i_0_]);
			if (class293 != null)
				i_2_ = class293.aByte3507;
			int i_3_ = class390s[i_2_].method6722(i, i_0_, 65280);
			int i_4_;
			if (i_2_ < class206.anInt2601 * -1485737447 - 1)
				i_4_ = class390s[i_2_ + 1].method6722(i, i_0_, 65280);
			else
				i_4_ = i_3_ - (8 << class206.anInt2592 * -1928575293);
			if (class59.aBool578) {
				if (class59.anInt591 * 157076069 == -1 && i_1_ > i_3_) {
					method15957();
					return;
				}
				if (class59.anInt591 * 157076069 >= 0 && i_1_ > class390s[class59.anInt591 * 157076069].method6722(i, i_0_, 65280)) {
					method15957();
					return;
				}
				if (class59.anInt600 * 1307285259 == -1 && i_1_ < i_4_) {
					method15957();
					return;
				}
				if (class59.anInt600 * 1307285259 >= 0 && i_1_ < class390s[class59.anInt600 * 1307285259 + 1].method6722(i, i_0_, 65280)) {
					method15957();
					return;
				}
			}
			int i_5_;
			for (i_5_ = class206.anInt2601 * -1485737447 - 1; i_5_ > 0 && i_1_ > class390s[i_5_].method6722(i, i_0_, 65280); i_5_--) {
				/* empty */
			}
			if (class59.aBool541 && i_5_ == 0 && i_1_ > class390s[0].method6722(i, i_0_, 65280))
				method15957();
			else if (i_5_ == class206.anInt2601 * -1485737447 - 1 && (class390s[i_5_].method6722(i, i_0_, 65280) - i_1_ > 8 << class206.anInt2592 * -1928575293))
				method15957();
			else {
				class293 = class206.aClass293ArrayArrayArray2604[i_5_][i][i_0_];
				if (class293 == null) {
					if (i_5_ == 0 || (class206.aClass293ArrayArrayArray2604[0][i][i_0_] == null))
						class293 = class206.aClass293ArrayArrayArray2604[0][i][i_0_] = new Class293(0);
					boolean bool = ((class206.aClass293ArrayArrayArray2604[0][i][i_0_].aClass293_3509) != null);
					if (i_5_ == 3 && bool) {
						method15957();
						return;
					}
					for (int i_6_ = 1; i_6_ <= i_5_; i_6_++) {
						if ((class206.aClass293ArrayArrayArray2604[i_6_][i][i_0_]) == null) {
							class293 = class206.aClass293ArrayArrayArray2604[i_6_][i][i_0_] = new Class293(i_6_);
							if (bool)
								class293.aByte3507++;
						}
					}
				}
				if (class59.aBool576) {
					int i_7_ = anInt10205 >> 12;
					int i_8_ = anInt10202 >> 12;
					if (class293.aClass521_Sub1_Sub5_3505 != null) {
						Class200 class200 = class293.aClass521_Sub1_Sub5_3505.method12992(class505, (byte) -121);
						if (class200 != null && class200.method3255(i_7_, i_1_, i_8_)) {
							method15957();
							return;
						}
					}
					if (class293.aClass521_Sub1_Sub5_3502 != null) {
						Class200 class200 = class293.aClass521_Sub1_Sub5_3502.method12992(class505, (byte) -95);
						if (class200 != null && class200.method3255(i_7_, i_1_, i_8_)) {
							method15957();
							return;
						}
					}
					if (class293.aClass521_Sub1_Sub3_3499 != null) {
						Class200 class200 = class293.aClass521_Sub1_Sub3_3499.method12992(class505, (byte) -71);
						if (class200 != null && class200.method3255(i_7_, i_1_, i_8_)) {
							method15957();
							return;
						}
					}
					for (Class208 class208 = class293.aClass208_3504; class208 != null; class208 = class208.aClass208_2660) {
						Class200 class200 = class208.aClass521_Sub1_Sub1_2659.method12992(class505, (byte) -4);
						if (class200 != null && class200.method3255(i_7_, i_1_, i_8_)) {
							method15957();
							return;
						}
					}
				}
				((Class539) class539).aClass151_7131.aClass464_1961.method7735(this, -641050915);
			}
		}
	}

	void method15953() {
		((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[((Class275_Sub1_Sub1_Sub1) this).aShort10425] = null;
		Class235.aClass275_Sub1_Sub1_Sub1Array2897[(Class235.anInt2905 * -2090761405)] = this;
		Class235.anInt2905 = (Class235.anInt2905 * -2090761405 + 1 & 0x3ff) * -1325686421;
		method4887((byte) -94);
		method12423((byte) -65);
	}

	void method15954() {
		int i = (((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).anInt7125);
		if ((((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[i]) != null)
			((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[i].method15957();
		((Class539) (((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass539_7102)).aClass275_Sub1_Sub1_Sub1Array7120[i] = this;
		((Class275_Sub1_Sub1_Sub1) this).aShort10425 = (short) ((Class539) (((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass539_7102)).anInt7125;
		((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).anInt7125 = i + 1 & 0x1fff;
		((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass457_7100.method7649(this, 1353338910);
	}

	void method15955(Class538 class538, int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool, boolean bool_19_) {
		((Class275_Sub1_Sub1_Sub1) this).aClass538_10428 = class538;
		anInt10205 = i << 12;
		anInt10208 = i_9_ << 12;
		anInt10202 = i_10_ << 12;
		anInt10209 = i_16_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10432 = ((Class275_Sub1_Sub1_Sub1) this).aShort10427 = (short) i_15_;
		anInt10206 = i_17_;
		anInt10207 = i_18_;
		aBool10210 = bool_19_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10431 = (short) i_11_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10424 = (short) i_12_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10430 = (short) i_13_;
		((Class275_Sub1_Sub1_Sub1) this).anInt10429 = i_14_;
		aByte10211 = (((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass87_7110.aByte839);
		method15954();
	}

	void method15956() {
		((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[((Class275_Sub1_Sub1_Sub1) this).aShort10425] = null;
		Class235.aClass275_Sub1_Sub1_Sub1Array2897[(Class235.anInt2905 * -2090761405)] = this;
		Class235.anInt2905 = (Class235.anInt2905 * -2090761405 + 1 & 0x3ff) * -1325686421;
		method4887((byte) -75);
		method12423((byte) -69);
	}

	void method15957() {
		((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[((Class275_Sub1_Sub1_Sub1) this).aShort10425] = null;
		Class235.aClass275_Sub1_Sub1_Sub1Array2897[(Class235.anInt2905 * -2090761405)] = this;
		Class235.anInt2905 = (Class235.anInt2905 * -2090761405 + 1 & 0x3ff) * -1325686421;
		method4887((byte) -14);
		method12423((byte) -115);
	}

	void method15958(Class538 class538, int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, boolean bool, boolean bool_30_) {
		((Class275_Sub1_Sub1_Sub1) this).aClass538_10428 = class538;
		anInt10205 = i << 12;
		anInt10208 = i_20_ << 12;
		anInt10202 = i_21_ << 12;
		anInt10209 = i_27_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10432 = ((Class275_Sub1_Sub1_Sub1) this).aShort10427 = (short) i_26_;
		anInt10206 = i_28_;
		anInt10207 = i_29_;
		aBool10210 = bool_30_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10431 = (short) i_22_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10424 = (short) i_23_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10430 = (short) i_24_;
		((Class275_Sub1_Sub1_Sub1) this).anInt10429 = i_25_;
		aByte10211 = (((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass87_7110.aByte839);
		method15954();
	}

	void method15959() {
		int i = (((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).anInt7125);
		if ((((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[i]) != null)
			((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[i].method15957();
		((Class539) (((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass539_7102)).aClass275_Sub1_Sub1_Sub1Array7120[i] = this;
		((Class275_Sub1_Sub1_Sub1) this).aShort10425 = (short) ((Class539) (((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass539_7102)).anInt7125;
		((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).anInt7125 = i + 1 & 0x1fff;
		((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass457_7100.method7649(this, 1107570443);
	}

	void method15960() {
		int i = (((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).anInt7125);
		if ((((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[i]) != null)
			((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[i].method15957();
		((Class539) (((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass539_7102)).aClass275_Sub1_Sub1_Sub1Array7120[i] = this;
		((Class275_Sub1_Sub1_Sub1) this).aShort10425 = (short) ((Class539) (((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass539_7102)).anInt7125;
		((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).anInt7125 = i + 1 & 0x1fff;
		((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass457_7100.method7649(this, 928692090);
	}

	void method15961() {
		int i = (((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).anInt7125);
		if ((((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[i]) != null)
			((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[i].method15957();
		((Class539) (((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass539_7102)).aClass275_Sub1_Sub1_Sub1Array7120[i] = this;
		((Class275_Sub1_Sub1_Sub1) this).aShort10425 = (short) ((Class539) (((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass539_7102)).anInt7125;
		((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).anInt7125 = i + 1 & 0x1fff;
		((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass457_7100.method7649(this, 1645229433);
	}

	void method15962(long l, int i) {
		((Class275_Sub1_Sub1_Sub1) this).aShort10427 -= i;
		if (((Class275_Sub1_Sub1_Sub1) this).aShort10427 <= 0)
			method15957();
		else {
			int i_31_ = anInt10205 >> 12;
			int i_32_ = anInt10208 >> 12;
			int i_33_ = anInt10202 >> 12;
			Class539 class539 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102);
			Class59 class59 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass59_7101);
			if (class59.anInt564 * 1726042923 != 0) {
				if ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt558 * -439640385) {
					int i_34_ = ((anInt10209 >> 8 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 >> 16 & 0xff) + class59.anInt593 * 609996313 * i);
					int i_35_ = ((anInt10209 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 >> 8 & 0xff) + class59.anInt594 * 1220054747 * i);
					int i_36_ = ((anInt10209 << 8 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 & 0xff) + class59.anInt595 * -772932515 * i);
					if (i_34_ < 0)
						i_34_ = 0;
					else if (i_34_ > 65535)
						i_34_ = 65535;
					if (i_35_ < 0)
						i_35_ = 0;
					else if (i_35_ > 65535)
						i_35_ = 65535;
					if (i_36_ < 0)
						i_36_ = 0;
					else if (i_36_ > 65535)
						i_36_ = 65535;
					anInt10209 &= ~0xffffff;
					anInt10209 |= (((i_34_ & 0xff00) << 8) + (i_35_ & 0xff00) + ((i_36_ & 0xff00) >> 8));
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 &= ~0xffffff;
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 |= (((i_34_ & 0xff) << 16) + ((i_35_ & 0xff) << 8) + (i_36_ & 0xff));
				}
				if ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt592 * 1148071175) {
					int i_37_ = ((anInt10209 >> 16 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 >> 24 & 0xff) + class59.anInt596 * -386829787 * i);
					if (i_37_ < 0)
						i_37_ = 0;
					else if (i_37_ > 65535)
						i_37_ = 65535;
					anInt10209 &= 0xffffff;
					anInt10209 |= (i_37_ & 0xff00) << 16;
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 &= 0xffffff;
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 |= (i_37_ & 0xff) << 24;
				}
			}
			if (class59.anInt547 * 1033240751 != -1 && ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt597 * -1114757341))
				((Class275_Sub1_Sub1_Sub1) this).anInt10429 += class59.anInt598 * 539636103 * i;
			if (class59.anInt583 * -1575212911 != -1 && ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt580 * -130590745))
				anInt10206 += class59.anInt540 * -1725947623 * i;
			double d = (double) ((Class275_Sub1_Sub1_Sub1) this).aShort10431;
			double d_38_ = (double) ((Class275_Sub1_Sub1_Sub1) this).aShort10424;
			double d_39_ = (double) ((Class275_Sub1_Sub1_Sub1) this).aShort10430;
			boolean bool = false;
			if (class59.anInt542 * 1654042887 == 1) {
				int i_40_ = i_31_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2894) * -1219492825;
				int i_41_ = i_32_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2887) * -556077091;
				int i_42_ = i_33_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2892) * -1774643233;
				int i_43_ = ((int) Math.sqrt((double) (i_40_ * i_40_ + i_41_ * i_41_ + i_42_ * i_42_)) >> 2);
				long l_44_ = (long) (class59.anInt569 * 1340699479 * i_43_ * i);
				((Class275_Sub1_Sub1_Sub1) this).anInt10429 -= ((long) ((Class275_Sub1_Sub1_Sub1) this).anInt10429 * l_44_) >> 18;
			} else if (class59.anInt542 * 1654042887 == 2) {
				int i_45_ = i_31_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2894) * -1219492825;
				int i_46_ = i_32_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2887) * -556077091;
				int i_47_ = i_33_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2892) * -1774643233;
				int i_48_ = i_45_ * i_45_ + i_46_ * i_46_ + i_47_ * i_47_;
				long l_49_ = (long) (class59.anInt569 * 1340699479 * i_48_ * i);
				((Class275_Sub1_Sub1_Sub1) this).anInt10429 -= ((long) ((Class275_Sub1_Sub1_Sub1) this).anInt10429 * l_49_) >> 28;
			}
			if (class59.anIntArray559 != null) {
				Iterator iterator = ((Class539) class539).aList7127.iterator();
				while (iterator.hasNext()) {
					Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
					Class345 class345 = ((Class282_Sub40) class282_sub40).aClass345_8007;
					if (class345.anInt4041 * -39568147 != 1) {
						boolean bool_50_ = false;
						for (int i_51_ = 0; i_51_ < class59.anIntArray559.length; i_51_++) {
							if (class59.anIntArray559[i_51_] == class345.anInt4032 * 700012867) {
								bool_50_ = true;
								break;
							}
						}
						if (bool_50_) {
							double d_52_ = (double) (i_31_ - (((Class282_Sub40) class282_sub40).anInt8010 * 522396413));
							double d_53_ = (double) (i_32_ - (((Class282_Sub40) class282_sub40).anInt8006 * 320103333));
							double d_54_ = (double) (i_33_ - (((Class282_Sub40) class282_sub40).anInt8008 * 338658825));
							double d_55_ = (d_52_ * d_52_ + d_53_ * d_53_ + d_54_ * d_54_);
							if (!(d_55_ > (double) (class345.aLong4044 * -3961663252755643237L))) {
								double d_56_ = Math.sqrt(d_55_);
								if (d_56_ == 0.0)
									d_56_ = 1.0;
								double d_57_ = ((d_52_ * (double) (((Class282_Sub40) class282_sub40).aFloat8011) + d_53_ * (double) (class345.anInt4036 * -365865779) + d_54_ * (double) (((Class282_Sub40) class282_sub40).aFloat8012)) * 65535.0 / ((double) (class345.anInt4033 * 1260613141) * d_56_));
								if (!(d_57_ < (double) (class345.anInt4024 * 241660975))) {
									double d_58_ = 0.0;
									if (class345.anInt4038 * 1337215321 == 1)
										d_58_ = (d_56_ / 16.0 * (double) (class345.anInt4035 * -259821937));
									else if (class345.anInt4038 * 1337215321 == 2)
										d_58_ = (d_56_ / 16.0 * (d_56_ / 16.0) * (double) (class345.anInt4035 * -259821937));
									if (class345.anInt4039 * -707357623 == 0) {
										if (class345.anInt4040 * 1626273905 == 0) {
											d += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_58_) * (double) i;
											d_38_ += ((double) ((class345.anInt4036) * -365865779) - d_58_) * (double) i;
											d_39_ += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_58_) * (double) i;
											bool = true;
										} else {
											anInt10205 += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_58_) * (double) i;
											anInt10208 += ((double) ((class345.anInt4036) * -365865779) - d_58_) * (double) i;
											anInt10202 += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_58_) * (double) i;
										}
									} else {
										double d_59_ = (d_52_ / d_56_ * (double) (class345.anInt4033 * 1260613141));
										double d_60_ = (d_53_ / d_56_ * (double) (class345.anInt4033 * 1260613141));
										double d_61_ = (d_54_ / d_56_ * (double) (class345.anInt4033 * 1260613141));
										if (class345.anInt4040 * 1626273905 == 0) {
											d += d_59_ * (double) i;
											d_38_ += d_60_ * (double) i;
											d_39_ += d_61_ * (double) i;
											bool = true;
										} else {
											anInt10205 += d_59_ * (double) i;
											anInt10208 += d_60_ * (double) i;
											anInt10202 += d_61_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class59.anIntArray582 != null) {
				for (int i_62_ = 0; i_62_ < class59.anIntArray582.length; i_62_++) {
					Class282_Sub40 class282_sub40 = ((Class282_Sub40) (Class235.aClass465_2904.method7754((long) class59.anIntArray582[i_62_])));
					while (class282_sub40 != null) {
						Class345 class345 = ((Class282_Sub40) class282_sub40).aClass345_8007;
						double d_63_ = (double) (i_31_ - (((Class282_Sub40) class282_sub40).anInt8010) * 522396413);
						double d_64_ = (double) (i_32_ - (((Class282_Sub40) class282_sub40).anInt8006) * 320103333);
						double d_65_ = (double) (i_33_ - (((Class282_Sub40) class282_sub40).anInt8008) * 338658825);
						double d_66_ = d_63_ * d_63_ + d_64_ * d_64_ + d_65_ * d_65_;
						if (d_66_ > (double) (class345.aLong4044 * -3961663252755643237L))
							class282_sub40 = ((Class282_Sub40) Class235.aClass465_2904.method7747(-1057511334));
						else {
							double d_67_ = Math.sqrt(d_66_);
							if (d_67_ == 0.0)
								d_67_ = 1.0;
							double d_68_ = ((d_63_ * (double) (((Class282_Sub40) class282_sub40).aFloat8011) + d_64_ * (double) (class345.anInt4036 * -365865779) + d_65_ * (double) (((Class282_Sub40) class282_sub40).aFloat8012)) * 65535.0 / ((double) (class345.anInt4033 * 1260613141) * d_67_));
							if (d_68_ < (double) (class345.anInt4024 * 241660975))
								class282_sub40 = ((Class282_Sub40) Class235.aClass465_2904.method7747(-1455891258));
							else {
								double d_69_ = 0.0;
								if (class345.anInt4038 * 1337215321 == 1)
									d_69_ = (d_67_ / 16.0 * (double) (class345.anInt4035 * -259821937));
								else if (class345.anInt4038 * 1337215321 == 2)
									d_69_ = (d_67_ / 16.0 * (d_67_ / 16.0) * (double) (class345.anInt4035 * -259821937));
								if (class345.anInt4039 * -707357623 == 0) {
									if (class345.anInt4040 * 1626273905 == 0) {
										d += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_69_) * (double) i;
										d_38_ += ((double) (class345.anInt4036 * -365865779) - d_69_) * (double) i;
										d_39_ += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_69_) * (double) i;
										bool = true;
									} else {
										anInt10205 += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_69_) * (double) i;
										anInt10208 += ((double) (class345.anInt4036 * -365865779) - d_69_) * (double) i;
										anInt10202 += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_69_) * (double) i;
									}
								} else {
									double d_70_ = (d_63_ / d_67_ * (double) (class345.anInt4033 * 1260613141));
									double d_71_ = (d_64_ / d_67_ * (double) (class345.anInt4033 * 1260613141));
									double d_72_ = (d_65_ / d_67_ * (double) (class345.anInt4033 * 1260613141));
									if (class345.anInt4040 * 1626273905 == 0) {
										d += d_70_ * (double) i;
										d_38_ += d_71_ * (double) i;
										d_39_ += d_72_ * (double) i;
										bool = true;
									} else {
										anInt10205 += d_70_ * (double) i;
										anInt10208 += d_71_ * (double) i;
										anInt10202 += d_72_ * (double) i;
									}
								}
								class282_sub40 = ((Class282_Sub40) Class235.aClass465_2904.method7747(-1192634900));
							}
						}
					}
				}
			}
			if (class59.anIntArray561 != null) {
				if (class59.anIntArray562 == null) {
					class59.anIntArray562 = new int[class59.anIntArray561.length];
					for (int i_73_ = 0; i_73_ < class59.anIntArray561.length; i_73_++) {
						Class423.method7065(class59.anIntArray561[i_73_], -1229346850);
						class59.anIntArray562[i_73_] = (((Class282_Sub38) (Class345.aClass465_4029.method7754((long) class59.anIntArray561[i_73_]))).anInt8002) * -570797415;
					}
				}
				for (int i_74_ = 0; i_74_ < class59.anIntArray562.length; i_74_++) {
					Class345 class345 = (Class345.aClass345Array4025[class59.anIntArray562[i_74_]]);
					if (class345.anInt4040 * 1626273905 == 0) {
						d += (double) (class345.anInt4027 * -161425851 * i);
						d_38_ += (double) (class345.anInt4036 * -365865779 * i);
						d_39_ += (double) (class345.anInt4037 * 1487656629 * i);
						bool = true;
					} else {
						anInt10205 += class345.anInt4027 * -161425851 * i;
						anInt10208 += class345.anInt4036 * -365865779 * i;
						anInt10202 += class345.anInt4037 * 1487656629 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_38_ > 32767.0 || d_39_ > 32767.0 || d < -32767.0 || d_38_ < -32767.0 || d_39_ < -32767.0) {
					d /= 2.0;
					d_38_ /= 2.0;
					d_39_ /= 2.0;
					((Class275_Sub1_Sub1_Sub1) this).anInt10429 <<= 1;
				}
				((Class275_Sub1_Sub1_Sub1) this).aShort10431 = (short) (int) d;
				((Class275_Sub1_Sub1_Sub1) this).aShort10424 = (short) (int) d_38_;
				((Class275_Sub1_Sub1_Sub1) this).aShort10430 = (short) (int) d_39_;
			}
			anInt10205 += (((long) ((Class275_Sub1_Sub1_Sub1) this).aShort10431 * (long) (((Class275_Sub1_Sub1_Sub1) this).anInt10429 << 2)) >> 23) * (long) i;
			anInt10208 += (((long) ((Class275_Sub1_Sub1_Sub1) this).aShort10424 * (long) (((Class275_Sub1_Sub1_Sub1) this).anInt10429 << 2)) >> 23) * (long) i;
			anInt10202 += (((long) ((Class275_Sub1_Sub1_Sub1) this).aShort10430 * (long) (((Class275_Sub1_Sub1_Sub1) this).anInt10429 << 2)) >> 23) * (long) i;
		}
	}

	void method15963(long l, int i) {
		((Class275_Sub1_Sub1_Sub1) this).aShort10427 -= i;
		if (((Class275_Sub1_Sub1_Sub1) this).aShort10427 <= 0)
			method15957();
		else {
			int i_75_ = anInt10205 >> 12;
			int i_76_ = anInt10208 >> 12;
			int i_77_ = anInt10202 >> 12;
			Class539 class539 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102);
			Class59 class59 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass59_7101);
			if (class59.anInt564 * 1726042923 != 0) {
				if ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt558 * -439640385) {
					int i_78_ = ((anInt10209 >> 8 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 >> 16 & 0xff) + class59.anInt593 * 609996313 * i);
					int i_79_ = ((anInt10209 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 >> 8 & 0xff) + class59.anInt594 * 1220054747 * i);
					int i_80_ = ((anInt10209 << 8 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 & 0xff) + class59.anInt595 * -772932515 * i);
					if (i_78_ < 0)
						i_78_ = 0;
					else if (i_78_ > 65535)
						i_78_ = 65535;
					if (i_79_ < 0)
						i_79_ = 0;
					else if (i_79_ > 65535)
						i_79_ = 65535;
					if (i_80_ < 0)
						i_80_ = 0;
					else if (i_80_ > 65535)
						i_80_ = 65535;
					anInt10209 &= ~0xffffff;
					anInt10209 |= (((i_78_ & 0xff00) << 8) + (i_79_ & 0xff00) + ((i_80_ & 0xff00) >> 8));
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 &= ~0xffffff;
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 |= (((i_78_ & 0xff) << 16) + ((i_79_ & 0xff) << 8) + (i_80_ & 0xff));
				}
				if ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt592 * 1148071175) {
					int i_81_ = ((anInt10209 >> 16 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 >> 24 & 0xff) + class59.anInt596 * -386829787 * i);
					if (i_81_ < 0)
						i_81_ = 0;
					else if (i_81_ > 65535)
						i_81_ = 65535;
					anInt10209 &= 0xffffff;
					anInt10209 |= (i_81_ & 0xff00) << 16;
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 &= 0xffffff;
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 |= (i_81_ & 0xff) << 24;
				}
			}
			if (class59.anInt547 * 1033240751 != -1 && ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt597 * -1114757341))
				((Class275_Sub1_Sub1_Sub1) this).anInt10429 += class59.anInt598 * 539636103 * i;
			if (class59.anInt583 * -1575212911 != -1 && ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt580 * -130590745))
				anInt10206 += class59.anInt540 * -1725947623 * i;
			double d = (double) ((Class275_Sub1_Sub1_Sub1) this).aShort10431;
			double d_82_ = (double) ((Class275_Sub1_Sub1_Sub1) this).aShort10424;
			double d_83_ = (double) ((Class275_Sub1_Sub1_Sub1) this).aShort10430;
			boolean bool = false;
			if (class59.anInt542 * 1654042887 == 1) {
				int i_84_ = i_75_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2894) * -1219492825;
				int i_85_ = i_76_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2887) * -556077091;
				int i_86_ = i_77_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2892) * -1774643233;
				int i_87_ = ((int) Math.sqrt((double) (i_84_ * i_84_ + i_85_ * i_85_ + i_86_ * i_86_)) >> 2);
				long l_88_ = (long) (class59.anInt569 * 1340699479 * i_87_ * i);
				((Class275_Sub1_Sub1_Sub1) this).anInt10429 -= ((long) ((Class275_Sub1_Sub1_Sub1) this).anInt10429 * l_88_) >> 18;
			} else if (class59.anInt542 * 1654042887 == 2) {
				int i_89_ = i_75_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2894) * -1219492825;
				int i_90_ = i_76_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2887) * -556077091;
				int i_91_ = i_77_ - (((Class234) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115).anInt2892) * -1774643233;
				int i_92_ = i_89_ * i_89_ + i_90_ * i_90_ + i_91_ * i_91_;
				long l_93_ = (long) (class59.anInt569 * 1340699479 * i_92_ * i);
				((Class275_Sub1_Sub1_Sub1) this).anInt10429 -= ((long) ((Class275_Sub1_Sub1_Sub1) this).anInt10429 * l_93_) >> 28;
			}
			if (class59.anIntArray559 != null) {
				Iterator iterator = ((Class539) class539).aList7127.iterator();
				while (iterator.hasNext()) {
					Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
					Class345 class345 = ((Class282_Sub40) class282_sub40).aClass345_8007;
					if (class345.anInt4041 * -39568147 != 1) {
						boolean bool_94_ = false;
						for (int i_95_ = 0; i_95_ < class59.anIntArray559.length; i_95_++) {
							if (class59.anIntArray559[i_95_] == class345.anInt4032 * 700012867) {
								bool_94_ = true;
								break;
							}
						}
						if (bool_94_) {
							double d_96_ = (double) (i_75_ - (((Class282_Sub40) class282_sub40).anInt8010 * 522396413));
							double d_97_ = (double) (i_76_ - (((Class282_Sub40) class282_sub40).anInt8006 * 320103333));
							double d_98_ = (double) (i_77_ - (((Class282_Sub40) class282_sub40).anInt8008 * 338658825));
							double d_99_ = (d_96_ * d_96_ + d_97_ * d_97_ + d_98_ * d_98_);
							if (!(d_99_ > (double) (class345.aLong4044 * -3961663252755643237L))) {
								double d_100_ = Math.sqrt(d_99_);
								if (d_100_ == 0.0)
									d_100_ = 1.0;
								double d_101_ = ((d_96_ * (double) (((Class282_Sub40) class282_sub40).aFloat8011) + d_97_ * (double) (class345.anInt4036 * -365865779) + d_98_ * (double) (((Class282_Sub40) class282_sub40).aFloat8012)) * 65535.0 / ((double) (class345.anInt4033 * 1260613141) * d_100_));
								if (!(d_101_ < (double) (class345.anInt4024 * 241660975))) {
									double d_102_ = 0.0;
									if (class345.anInt4038 * 1337215321 == 1)
										d_102_ = (d_100_ / 16.0 * (double) (class345.anInt4035 * -259821937));
									else if (class345.anInt4038 * 1337215321 == 2)
										d_102_ = (d_100_ / 16.0 * (d_100_ / 16.0) * (double) (class345.anInt4035 * -259821937));
									if (class345.anInt4039 * -707357623 == 0) {
										if (class345.anInt4040 * 1626273905 == 0) {
											d += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_102_) * (double) i;
											d_82_ += ((double) ((class345.anInt4036) * -365865779) - d_102_) * (double) i;
											d_83_ += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_102_) * (double) i;
											bool = true;
										} else {
											anInt10205 += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_102_) * (double) i;
											anInt10208 += ((double) ((class345.anInt4036) * -365865779) - d_102_) * (double) i;
											anInt10202 += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_102_) * (double) i;
										}
									} else {
										double d_103_ = (d_96_ / d_100_ * (double) (class345.anInt4033 * 1260613141));
										double d_104_ = (d_97_ / d_100_ * (double) (class345.anInt4033 * 1260613141));
										double d_105_ = (d_98_ / d_100_ * (double) (class345.anInt4033 * 1260613141));
										if (class345.anInt4040 * 1626273905 == 0) {
											d += d_103_ * (double) i;
											d_82_ += d_104_ * (double) i;
											d_83_ += d_105_ * (double) i;
											bool = true;
										} else {
											anInt10205 += d_103_ * (double) i;
											anInt10208 += d_104_ * (double) i;
											anInt10202 += d_105_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class59.anIntArray582 != null) {
				for (int i_106_ = 0; i_106_ < class59.anIntArray582.length; i_106_++) {
					Class282_Sub40 class282_sub40 = ((Class282_Sub40) (Class235.aClass465_2904.method7754((long) class59.anIntArray582[i_106_])));
					while (class282_sub40 != null) {
						Class345 class345 = ((Class282_Sub40) class282_sub40).aClass345_8007;
						double d_107_ = (double) (i_75_ - (((Class282_Sub40) class282_sub40).anInt8010) * 522396413);
						double d_108_ = (double) (i_76_ - (((Class282_Sub40) class282_sub40).anInt8006) * 320103333);
						double d_109_ = (double) (i_77_ - (((Class282_Sub40) class282_sub40).anInt8008) * 338658825);
						double d_110_ = (d_107_ * d_107_ + d_108_ * d_108_ + d_109_ * d_109_);
						if (d_110_ > (double) (class345.aLong4044 * -3961663252755643237L))
							class282_sub40 = ((Class282_Sub40) Class235.aClass465_2904.method7747(-2143819118));
						else {
							double d_111_ = Math.sqrt(d_110_);
							if (d_111_ == 0.0)
								d_111_ = 1.0;
							double d_112_ = ((d_107_ * (double) (((Class282_Sub40) class282_sub40).aFloat8011) + d_108_ * (double) (class345.anInt4036 * -365865779) + d_109_ * (double) (((Class282_Sub40) class282_sub40).aFloat8012)) * 65535.0 / ((double) (class345.anInt4033 * 1260613141) * d_111_));
							if (d_112_ < (double) (class345.anInt4024 * 241660975))
								class282_sub40 = ((Class282_Sub40) Class235.aClass465_2904.method7747(-1431074119));
							else {
								double d_113_ = 0.0;
								if (class345.anInt4038 * 1337215321 == 1)
									d_113_ = (d_111_ / 16.0 * (double) (class345.anInt4035 * -259821937));
								else if (class345.anInt4038 * 1337215321 == 2)
									d_113_ = (d_111_ / 16.0 * (d_111_ / 16.0) * (double) (class345.anInt4035 * -259821937));
								if (class345.anInt4039 * -707357623 == 0) {
									if (class345.anInt4040 * 1626273905 == 0) {
										d += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_113_) * (double) i;
										d_82_ += ((double) (class345.anInt4036 * -365865779) - d_113_) * (double) i;
										d_83_ += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_113_) * (double) i;
										bool = true;
									} else {
										anInt10205 += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_113_) * (double) i;
										anInt10208 += ((double) (class345.anInt4036 * -365865779) - d_113_) * (double) i;
										anInt10202 += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_113_) * (double) i;
									}
								} else {
									double d_114_ = (d_107_ / d_111_ * (double) (class345.anInt4033 * 1260613141));
									double d_115_ = (d_108_ / d_111_ * (double) (class345.anInt4033 * 1260613141));
									double d_116_ = (d_109_ / d_111_ * (double) (class345.anInt4033 * 1260613141));
									if (class345.anInt4040 * 1626273905 == 0) {
										d += d_114_ * (double) i;
										d_82_ += d_115_ * (double) i;
										d_83_ += d_116_ * (double) i;
										bool = true;
									} else {
										anInt10205 += d_114_ * (double) i;
										anInt10208 += d_115_ * (double) i;
										anInt10202 += d_116_ * (double) i;
									}
								}
								class282_sub40 = ((Class282_Sub40) Class235.aClass465_2904.method7747(-1204071537));
							}
						}
					}
				}
			}
			if (class59.anIntArray561 != null) {
				if (class59.anIntArray562 == null) {
					class59.anIntArray562 = new int[class59.anIntArray561.length];
					for (int i_117_ = 0; i_117_ < class59.anIntArray561.length; i_117_++) {
						Class423.method7065(class59.anIntArray561[i_117_], -1229346850);
						class59.anIntArray562[i_117_] = (((Class282_Sub38) (Class345.aClass465_4029.method7754((long) class59.anIntArray561[i_117_]))).anInt8002) * -570797415;
					}
				}
				for (int i_118_ = 0; i_118_ < class59.anIntArray562.length; i_118_++) {
					Class345 class345 = (Class345.aClass345Array4025[class59.anIntArray562[i_118_]]);
					if (class345.anInt4040 * 1626273905 == 0) {
						d += (double) (class345.anInt4027 * -161425851 * i);
						d_82_ += (double) (class345.anInt4036 * -365865779 * i);
						d_83_ += (double) (class345.anInt4037 * 1487656629 * i);
						bool = true;
					} else {
						anInt10205 += class345.anInt4027 * -161425851 * i;
						anInt10208 += class345.anInt4036 * -365865779 * i;
						anInt10202 += class345.anInt4037 * 1487656629 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_82_ > 32767.0 || d_83_ > 32767.0 || d < -32767.0 || d_82_ < -32767.0 || d_83_ < -32767.0) {
					d /= 2.0;
					d_82_ /= 2.0;
					d_83_ /= 2.0;
					((Class275_Sub1_Sub1_Sub1) this).anInt10429 <<= 1;
				}
				((Class275_Sub1_Sub1_Sub1) this).aShort10431 = (short) (int) d;
				((Class275_Sub1_Sub1_Sub1) this).aShort10424 = (short) (int) d_82_;
				((Class275_Sub1_Sub1_Sub1) this).aShort10430 = (short) (int) d_83_;
			}
			anInt10205 += (((long) ((Class275_Sub1_Sub1_Sub1) this).aShort10431 * (long) (((Class275_Sub1_Sub1_Sub1) this).anInt10429 << 2)) >> 23) * (long) i;
			anInt10208 += (((long) ((Class275_Sub1_Sub1_Sub1) this).aShort10424 * (long) (((Class275_Sub1_Sub1_Sub1) this).anInt10429 << 2)) >> 23) * (long) i;
			anInt10202 += (((long) ((Class275_Sub1_Sub1_Sub1) this).aShort10430 * (long) (((Class275_Sub1_Sub1_Sub1) this).anInt10429 << 2)) >> 23) * (long) i;
		}
	}

	void method15964(SceneObjectManager class206, GraphicalRenderer class505, long l) {
		int i = anInt10205 >> 12 + class206.anInt2592 * -1928575293;
		int i_119_ = anInt10202 >> 12 + class206.anInt2592 * -1928575293;
		int i_120_ = anInt10208 >> 12;
		if (i_120_ > 0 || i_120_ < -262144 || i < 0 || i >= class206.anInt2617 * -1912960305 || i_119_ < 0 || i_119_ >= class206.anInt2603 * -18177099)
			method15957();
		else {
			Class539 class539 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102);
			Class59 class59 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass59_7101);
			Class390[] class390s = class206.aClass390Array2591;
			int i_121_ = ((Class539) class539).anInt7122;
			Class293 class293 = (class206.aClass293ArrayArrayArray2604[((Class539) class539).anInt7122][i][i_119_]);
			if (class293 != null)
				i_121_ = class293.aByte3507;
			int i_122_ = class390s[i_121_].method6722(i, i_119_, 65280);
			int i_123_;
			if (i_121_ < class206.anInt2601 * -1485737447 - 1)
				i_123_ = class390s[i_121_ + 1].method6722(i, i_119_, 65280);
			else
				i_123_ = i_122_ - (8 << class206.anInt2592 * -1928575293);
			if (class59.aBool578) {
				if (class59.anInt591 * 157076069 == -1 && i_120_ > i_122_) {
					method15957();
					return;
				}
				if (class59.anInt591 * 157076069 >= 0 && i_120_ > class390s[class59.anInt591 * 157076069].method6722(i, i_119_, 65280)) {
					method15957();
					return;
				}
				if (class59.anInt600 * 1307285259 == -1 && i_120_ < i_123_) {
					method15957();
					return;
				}
				if (class59.anInt600 * 1307285259 >= 0 && i_120_ < class390s[class59.anInt600 * 1307285259 + 1].method6722(i, i_119_, 65280)) {
					method15957();
					return;
				}
			}
			int i_124_;
			for (i_124_ = class206.anInt2601 * -1485737447 - 1; (i_124_ > 0 && i_120_ > class390s[i_124_].method6722(i, i_119_, 65280)); i_124_--) {
				/* empty */
			}
			if (class59.aBool541 && i_124_ == 0 && i_120_ > class390s[0].method6722(i, i_119_, 65280))
				method15957();
			else if (i_124_ == class206.anInt2601 * -1485737447 - 1 && (class390s[i_124_].method6722(i, i_119_, 65280) - i_120_) > 8 << class206.anInt2592 * -1928575293)
				method15957();
			else {
				class293 = class206.aClass293ArrayArrayArray2604[i_124_][i][i_119_];
				if (class293 == null) {
					if (i_124_ == 0 || (class206.aClass293ArrayArrayArray2604[0][i][i_119_] == null))
						class293 = class206.aClass293ArrayArrayArray2604[0][i][i_119_] = new Class293(0);
					boolean bool = ((class206.aClass293ArrayArrayArray2604[0][i][i_119_].aClass293_3509) != null);
					if (i_124_ == 3 && bool) {
						method15957();
						return;
					}
					for (int i_125_ = 1; i_125_ <= i_124_; i_125_++) {
						if ((class206.aClass293ArrayArrayArray2604[i_125_][i][i_119_]) == null) {
							class293 = class206.aClass293ArrayArrayArray2604[i_125_][i][i_119_] = new Class293(i_125_);
							if (bool)
								class293.aByte3507++;
						}
					}
				}
				if (class59.aBool576) {
					int i_126_ = anInt10205 >> 12;
					int i_127_ = anInt10202 >> 12;
					if (class293.aClass521_Sub1_Sub5_3505 != null) {
						Class200 class200 = class293.aClass521_Sub1_Sub5_3505.method12992(class505, (byte) -83);
						if (class200 != null && class200.method3255(i_126_, i_120_, i_127_)) {
							method15957();
							return;
						}
					}
					if (class293.aClass521_Sub1_Sub5_3502 != null) {
						Class200 class200 = class293.aClass521_Sub1_Sub5_3502.method12992(class505, (byte) -77);
						if (class200 != null && class200.method3255(i_126_, i_120_, i_127_)) {
							method15957();
							return;
						}
					}
					if (class293.aClass521_Sub1_Sub3_3499 != null) {
						Class200 class200 = class293.aClass521_Sub1_Sub3_3499.method12992(class505, (byte) -46);
						if (class200 != null && class200.method3255(i_126_, i_120_, i_127_)) {
							method15957();
							return;
						}
					}
					for (Class208 class208 = class293.aClass208_3504; class208 != null; class208 = class208.aClass208_2660) {
						Class200 class200 = class208.aClass521_Sub1_Sub1_2659.method12992(class505, (byte) -46);
						if (class200 != null && class200.method3255(i_126_, i_120_, i_127_)) {
							method15957();
							return;
						}
					}
				}
				((Class539) class539).aClass151_7131.aClass464_1961.method7735(this, -1270853981);
			}
		}
	}

	void method15965(SceneObjectManager class206, GraphicalRenderer class505, long l) {
		int i = anInt10205 >> 12 + class206.anInt2592 * -1928575293;
		int i_128_ = anInt10202 >> 12 + class206.anInt2592 * -1928575293;
		int i_129_ = anInt10208 >> 12;
		if (i_129_ > 0 || i_129_ < -262144 || i < 0 || i >= class206.anInt2617 * -1912960305 || i_128_ < 0 || i_128_ >= class206.anInt2603 * -18177099)
			method15957();
		else {
			Class539 class539 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102);
			Class59 class59 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass59_7101);
			Class390[] class390s = class206.aClass390Array2591;
			int i_130_ = ((Class539) class539).anInt7122;
			Class293 class293 = (class206.aClass293ArrayArrayArray2604[((Class539) class539).anInt7122][i][i_128_]);
			if (class293 != null)
				i_130_ = class293.aByte3507;
			int i_131_ = class390s[i_130_].method6722(i, i_128_, 65280);
			int i_132_;
			if (i_130_ < class206.anInt2601 * -1485737447 - 1)
				i_132_ = class390s[i_130_ + 1].method6722(i, i_128_, 65280);
			else
				i_132_ = i_131_ - (8 << class206.anInt2592 * -1928575293);
			if (class59.aBool578) {
				if (class59.anInt591 * 157076069 == -1 && i_129_ > i_131_) {
					method15957();
					return;
				}
				if (class59.anInt591 * 157076069 >= 0 && i_129_ > class390s[class59.anInt591 * 157076069].method6722(i, i_128_, 65280)) {
					method15957();
					return;
				}
				if (class59.anInt600 * 1307285259 == -1 && i_129_ < i_132_) {
					method15957();
					return;
				}
				if (class59.anInt600 * 1307285259 >= 0 && i_129_ < class390s[class59.anInt600 * 1307285259 + 1].method6722(i, i_128_, 65280)) {
					method15957();
					return;
				}
			}
			int i_133_;
			for (i_133_ = class206.anInt2601 * -1485737447 - 1; (i_133_ > 0 && i_129_ > class390s[i_133_].method6722(i, i_128_, 65280)); i_133_--) {
				/* empty */
			}
			if (class59.aBool541 && i_133_ == 0 && i_129_ > class390s[0].method6722(i, i_128_, 65280))
				method15957();
			else if (i_133_ == class206.anInt2601 * -1485737447 - 1 && (class390s[i_133_].method6722(i, i_128_, 65280) - i_129_) > 8 << class206.anInt2592 * -1928575293)
				method15957();
			else {
				class293 = class206.aClass293ArrayArrayArray2604[i_133_][i][i_128_];
				if (class293 == null) {
					if (i_133_ == 0 || (class206.aClass293ArrayArrayArray2604[0][i][i_128_] == null))
						class293 = class206.aClass293ArrayArrayArray2604[0][i][i_128_] = new Class293(0);
					boolean bool = ((class206.aClass293ArrayArrayArray2604[0][i][i_128_].aClass293_3509) != null);
					if (i_133_ == 3 && bool) {
						method15957();
						return;
					}
					for (int i_134_ = 1; i_134_ <= i_133_; i_134_++) {
						if ((class206.aClass293ArrayArrayArray2604[i_134_][i][i_128_]) == null) {
							class293 = class206.aClass293ArrayArrayArray2604[i_134_][i][i_128_] = new Class293(i_134_);
							if (bool)
								class293.aByte3507++;
						}
					}
				}
				if (class59.aBool576) {
					int i_135_ = anInt10205 >> 12;
					int i_136_ = anInt10202 >> 12;
					if (class293.aClass521_Sub1_Sub5_3505 != null) {
						Class200 class200 = class293.aClass521_Sub1_Sub5_3505.method12992(class505, (byte) -108);
						if (class200 != null && class200.method3255(i_135_, i_129_, i_136_)) {
							method15957();
							return;
						}
					}
					if (class293.aClass521_Sub1_Sub5_3502 != null) {
						Class200 class200 = class293.aClass521_Sub1_Sub5_3502.method12992(class505, (byte) -127);
						if (class200 != null && class200.method3255(i_135_, i_129_, i_136_)) {
							method15957();
							return;
						}
					}
					if (class293.aClass521_Sub1_Sub3_3499 != null) {
						Class200 class200 = class293.aClass521_Sub1_Sub3_3499.method12992(class505, (byte) -37);
						if (class200 != null && class200.method3255(i_135_, i_129_, i_136_)) {
							method15957();
							return;
						}
					}
					for (Class208 class208 = class293.aClass208_3504; class208 != null; class208 = class208.aClass208_2660) {
						Class200 class200 = class208.aClass521_Sub1_Sub1_2659.method12992(class505, (byte) -12);
						if (class200 != null && class200.method3255(i_135_, i_129_, i_136_)) {
							method15957();
							return;
						}
					}
				}
				((Class539) class539).aClass151_7131.aClass464_1961.method7735(this, -606845948);
			}
		}
	}

	Class275_Sub1_Sub1_Sub1(Class538 class538, int i, int i_137_, int i_138_, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, boolean bool, boolean bool_147_) {
		((Class275_Sub1_Sub1_Sub1) this).aClass538_10428 = class538;
		anInt10205 = i << 12;
		anInt10208 = i_137_ << 12;
		anInt10202 = i_138_ << 12;
		anInt10209 = i_144_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10432 = ((Class275_Sub1_Sub1_Sub1) this).aShort10427 = (short) i_143_;
		anInt10206 = i_145_;
		anInt10207 = i_146_;
		aBool10210 = bool_147_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10431 = (short) i_139_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10424 = (short) i_140_;
		((Class275_Sub1_Sub1_Sub1) this).aShort10430 = (short) i_141_;
		((Class275_Sub1_Sub1_Sub1) this).anInt10429 = i_142_;
		aByte10211 = (((Class538) ((Class275_Sub1_Sub1_Sub1) this).aClass538_10428).aClass87_7110.aByte839);
		method15954();
	}

	void method15966() {
		((Class539) ((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102).aClass275_Sub1_Sub1_Sub1Array7120[((Class275_Sub1_Sub1_Sub1) this).aShort10425] = null;
		Class235.aClass275_Sub1_Sub1_Sub1Array2897[(Class235.anInt2905 * -2090761405)] = this;
		Class235.anInt2905 = (Class235.anInt2905 * -2090761405 + 1 & 0x3ff) * -1325686421;
		method4887((byte) -6);
		method12423((byte) -111);
	}

	void method15967(long l, int i) {
		((Class275_Sub1_Sub1_Sub1) this).aShort10427 -= i;
		if (((Class275_Sub1_Sub1_Sub1) this).aShort10427 <= 0)
			method15957();
		else {
			int i_148_ = anInt10205 >> 12;
			int i_149_ = anInt10208 >> 12;
			int i_150_ = anInt10202 >> 12;
			Class539 class539 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass539_7102);
			Class59 class59 = (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass59_7101);
			if (class59.anInt564 * 1726042923 != 0) {
				if ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt558 * -439640385) {
					int i_151_ = ((anInt10209 >> 8 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 >> 16 & 0xff) + class59.anInt593 * 609996313 * i);
					int i_152_ = ((anInt10209 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 >> 8 & 0xff) + class59.anInt594 * 1220054747 * i);
					int i_153_ = ((anInt10209 << 8 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 & 0xff) + class59.anInt595 * -772932515 * i);
					if (i_151_ < 0)
						i_151_ = 0;
					else if (i_151_ > 65535)
						i_151_ = 65535;
					if (i_152_ < 0)
						i_152_ = 0;
					else if (i_152_ > 65535)
						i_152_ = 65535;
					if (i_153_ < 0)
						i_153_ = 0;
					else if (i_153_ > 65535)
						i_153_ = 65535;
					anInt10209 &= ~0xffffff;
					anInt10209 |= (((i_151_ & 0xff00) << 8) + (i_152_ & 0xff00) + ((i_153_ & 0xff00) >> 8));
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 &= ~0xffffff;
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 |= (((i_151_ & 0xff) << 16) + ((i_152_ & 0xff) << 8) + (i_153_ & 0xff));
				}
				if ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt592 * 1148071175) {
					int i_154_ = ((anInt10209 >> 16 & 0xff00) + (((Class275_Sub1_Sub1_Sub1) this).anInt10426 >> 24 & 0xff) + class59.anInt596 * -386829787 * i);
					if (i_154_ < 0)
						i_154_ = 0;
					else if (i_154_ > 65535)
						i_154_ = 65535;
					anInt10209 &= 0xffffff;
					anInt10209 |= (i_154_ & 0xff00) << 16;
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 &= 0xffffff;
					((Class275_Sub1_Sub1_Sub1) this).anInt10426 |= (i_154_ & 0xff) << 24;
				}
			}
			if (class59.anInt547 * 1033240751 != -1 && ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt597 * -1114757341))
				((Class275_Sub1_Sub1_Sub1) this).anInt10429 += class59.anInt598 * 539636103 * i;
			if (class59.anInt583 * -1575212911 != -1 && ((((Class275_Sub1_Sub1_Sub1) this).aShort10432 - ((Class275_Sub1_Sub1_Sub1) this).aShort10427) <= class59.anInt580 * -130590745))
				anInt10206 += class59.anInt540 * -1725947623 * i;
			double d = (double) ((Class275_Sub1_Sub1_Sub1) this).aShort10431;
			double d_155_ = (double) ((Class275_Sub1_Sub1_Sub1) this).aShort10424;
			double d_156_ = (double) ((Class275_Sub1_Sub1_Sub1) this).aShort10430;
			boolean bool = false;
			if (class59.anInt542 * 1654042887 == 1) {
				int i_157_ = i_148_ - ((Class234) (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115)).anInt2894 * -1219492825;
				int i_158_ = i_149_ - ((Class234) (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115)).anInt2887 * -556077091;
				int i_159_ = i_150_ - ((Class234) (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115)).anInt2892 * -1774643233;
				int i_160_ = ((int) Math.sqrt((double) (i_157_ * i_157_ + i_158_ * i_158_ + i_159_ * i_159_)) >> 2);
				long l_161_ = (long) (class59.anInt569 * 1340699479 * i_160_ * i);
				((Class275_Sub1_Sub1_Sub1) this).anInt10429 -= ((long) ((Class275_Sub1_Sub1_Sub1) this).anInt10429 * l_161_) >> 18;
			} else if (class59.anInt542 * 1654042887 == 2) {
				int i_162_ = i_148_ - ((Class234) (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115)).anInt2894 * -1219492825;
				int i_163_ = i_149_ - ((Class234) (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115)).anInt2887 * -556077091;
				int i_164_ = i_150_ - ((Class234) (((Class538) (((Class275_Sub1_Sub1_Sub1) this).aClass538_10428)).aClass234_7115)).anInt2892 * -1774643233;
				int i_165_ = i_162_ * i_162_ + i_163_ * i_163_ + i_164_ * i_164_;
				long l_166_ = (long) (class59.anInt569 * 1340699479 * i_165_ * i);
				((Class275_Sub1_Sub1_Sub1) this).anInt10429 -= ((long) ((Class275_Sub1_Sub1_Sub1) this).anInt10429 * l_166_) >> 28;
			}
			if (class59.anIntArray559 != null) {
				Iterator iterator = ((Class539) class539).aList7127.iterator();
				while (iterator.hasNext()) {
					Class282_Sub40 class282_sub40 = (Class282_Sub40) iterator.next();
					Class345 class345 = ((Class282_Sub40) class282_sub40).aClass345_8007;
					if (class345.anInt4041 * -39568147 != 1) {
						boolean bool_167_ = false;
						for (int i_168_ = 0; i_168_ < class59.anIntArray559.length; i_168_++) {
							if (class59.anIntArray559[i_168_] == class345.anInt4032 * 700012867) {
								bool_167_ = true;
								break;
							}
						}
						if (bool_167_) {
							double d_169_ = (double) (i_148_ - (((Class282_Sub40) class282_sub40).anInt8010) * 522396413);
							double d_170_ = (double) (i_149_ - (((Class282_Sub40) class282_sub40).anInt8006) * 320103333);
							double d_171_ = (double) (i_150_ - (((Class282_Sub40) class282_sub40).anInt8008) * 338658825);
							double d_172_ = (d_169_ * d_169_ + d_170_ * d_170_ + d_171_ * d_171_);
							if (!(d_172_ > (double) (class345.aLong4044 * -3961663252755643237L))) {
								double d_173_ = Math.sqrt(d_172_);
								if (d_173_ == 0.0)
									d_173_ = 1.0;
								double d_174_ = ((d_169_ * (double) (((Class282_Sub40) class282_sub40).aFloat8011) + d_170_ * (double) (class345.anInt4036 * -365865779) + d_171_ * (double) (((Class282_Sub40) class282_sub40).aFloat8012)) * 65535.0 / ((double) (class345.anInt4033 * 1260613141) * d_173_));
								if (!(d_174_ < (double) (class345.anInt4024 * 241660975))) {
									double d_175_ = 0.0;
									if (class345.anInt4038 * 1337215321 == 1)
										d_175_ = (d_173_ / 16.0 * (double) (class345.anInt4035 * -259821937));
									else if (class345.anInt4038 * 1337215321 == 2)
										d_175_ = (d_173_ / 16.0 * (d_173_ / 16.0) * (double) (class345.anInt4035 * -259821937));
									if (class345.anInt4039 * -707357623 == 0) {
										if (class345.anInt4040 * 1626273905 == 0) {
											d += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_175_) * (double) i;
											d_155_ += ((double) ((class345.anInt4036) * -365865779) - d_175_) * (double) i;
											d_156_ += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_175_) * (double) i;
											bool = true;
										} else {
											anInt10205 += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_175_) * (double) i;
											anInt10208 += ((double) ((class345.anInt4036) * -365865779) - d_175_) * (double) i;
											anInt10202 += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_175_) * (double) i;
										}
									} else {
										double d_176_ = (d_169_ / d_173_ * (double) (class345.anInt4033 * 1260613141));
										double d_177_ = (d_170_ / d_173_ * (double) (class345.anInt4033 * 1260613141));
										double d_178_ = (d_171_ / d_173_ * (double) (class345.anInt4033 * 1260613141));
										if (class345.anInt4040 * 1626273905 == 0) {
											d += d_176_ * (double) i;
											d_155_ += d_177_ * (double) i;
											d_156_ += d_178_ * (double) i;
											bool = true;
										} else {
											anInt10205 += d_176_ * (double) i;
											anInt10208 += d_177_ * (double) i;
											anInt10202 += d_178_ * (double) i;
										}
									}
								}
							}
						}
					}
				}
			}
			if (class59.anIntArray582 != null) {
				for (int i_179_ = 0; i_179_ < class59.anIntArray582.length; i_179_++) {
					Class282_Sub40 class282_sub40 = ((Class282_Sub40) (Class235.aClass465_2904.method7754((long) class59.anIntArray582[i_179_])));
					while (class282_sub40 != null) {
						Class345 class345 = ((Class282_Sub40) class282_sub40).aClass345_8007;
						double d_180_ = (double) (i_148_ - (((Class282_Sub40) class282_sub40).anInt8010) * 522396413);
						double d_181_ = (double) (i_149_ - (((Class282_Sub40) class282_sub40).anInt8006) * 320103333);
						double d_182_ = (double) (i_150_ - (((Class282_Sub40) class282_sub40).anInt8008) * 338658825);
						double d_183_ = (d_180_ * d_180_ + d_181_ * d_181_ + d_182_ * d_182_);
						if (d_183_ > (double) (class345.aLong4044 * -3961663252755643237L))
							class282_sub40 = ((Class282_Sub40) Class235.aClass465_2904.method7747(-1253459750));
						else {
							double d_184_ = Math.sqrt(d_183_);
							if (d_184_ == 0.0)
								d_184_ = 1.0;
							double d_185_ = ((d_180_ * (double) (((Class282_Sub40) class282_sub40).aFloat8011) + d_181_ * (double) (class345.anInt4036 * -365865779) + d_182_ * (double) (((Class282_Sub40) class282_sub40).aFloat8012)) * 65535.0 / ((double) (class345.anInt4033 * 1260613141) * d_184_));
							if (d_185_ < (double) (class345.anInt4024 * 241660975))
								class282_sub40 = ((Class282_Sub40) Class235.aClass465_2904.method7747(-1518106530));
							else {
								double d_186_ = 0.0;
								if (class345.anInt4038 * 1337215321 == 1)
									d_186_ = (d_184_ / 16.0 * (double) (class345.anInt4035 * -259821937));
								else if (class345.anInt4038 * 1337215321 == 2)
									d_186_ = (d_184_ / 16.0 * (d_184_ / 16.0) * (double) (class345.anInt4035 * -259821937));
								if (class345.anInt4039 * -707357623 == 0) {
									if (class345.anInt4040 * 1626273905 == 0) {
										d += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_186_) * (double) i;
										d_155_ += ((double) (class345.anInt4036 * -365865779) - d_186_) * (double) i;
										d_156_ += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_186_) * (double) i;
										bool = true;
									} else {
										anInt10205 += ((double) (((Class282_Sub40) class282_sub40).aFloat8011) - d_186_) * (double) i;
										anInt10208 += ((double) (class345.anInt4036 * -365865779) - d_186_) * (double) i;
										anInt10202 += ((double) (((Class282_Sub40) class282_sub40).aFloat8012) - d_186_) * (double) i;
									}
								} else {
									double d_187_ = (d_180_ / d_184_ * (double) (class345.anInt4033 * 1260613141));
									double d_188_ = (d_181_ / d_184_ * (double) (class345.anInt4033 * 1260613141));
									double d_189_ = (d_182_ / d_184_ * (double) (class345.anInt4033 * 1260613141));
									if (class345.anInt4040 * 1626273905 == 0) {
										d += d_187_ * (double) i;
										d_155_ += d_188_ * (double) i;
										d_156_ += d_189_ * (double) i;
										bool = true;
									} else {
										anInt10205 += d_187_ * (double) i;
										anInt10208 += d_188_ * (double) i;
										anInt10202 += d_189_ * (double) i;
									}
								}
								class282_sub40 = ((Class282_Sub40) Class235.aClass465_2904.method7747(-1586920665));
							}
						}
					}
				}
			}
			if (class59.anIntArray561 != null) {
				if (class59.anIntArray562 == null) {
					class59.anIntArray562 = new int[class59.anIntArray561.length];
					for (int i_190_ = 0; i_190_ < class59.anIntArray561.length; i_190_++) {
						Class423.method7065(class59.anIntArray561[i_190_], -1229346850);
						class59.anIntArray562[i_190_] = (((Class282_Sub38) (Class345.aClass465_4029.method7754((long) class59.anIntArray561[i_190_]))).anInt8002) * -570797415;
					}
				}
				for (int i_191_ = 0; i_191_ < class59.anIntArray562.length; i_191_++) {
					Class345 class345 = (Class345.aClass345Array4025[class59.anIntArray562[i_191_]]);
					if (class345.anInt4040 * 1626273905 == 0) {
						d += (double) (class345.anInt4027 * -161425851 * i);
						d_155_ += (double) (class345.anInt4036 * -365865779 * i);
						d_156_ += (double) (class345.anInt4037 * 1487656629 * i);
						bool = true;
					} else {
						anInt10205 += class345.anInt4027 * -161425851 * i;
						anInt10208 += class345.anInt4036 * -365865779 * i;
						anInt10202 += class345.anInt4037 * 1487656629 * i;
					}
				}
			}
			if (bool) {
				while (d > 32767.0 || d_155_ > 32767.0 || d_156_ > 32767.0 || d < -32767.0 || d_155_ < -32767.0 || d_156_ < -32767.0) {
					d /= 2.0;
					d_155_ /= 2.0;
					d_156_ /= 2.0;
					((Class275_Sub1_Sub1_Sub1) this).anInt10429 <<= 1;
				}
				((Class275_Sub1_Sub1_Sub1) this).aShort10431 = (short) (int) d;
				((Class275_Sub1_Sub1_Sub1) this).aShort10424 = (short) (int) d_155_;
				((Class275_Sub1_Sub1_Sub1) this).aShort10430 = (short) (int) d_156_;
			}
			anInt10205 += (((long) ((Class275_Sub1_Sub1_Sub1) this).aShort10431 * (long) (((Class275_Sub1_Sub1_Sub1) this).anInt10429 << 2)) >> 23) * (long) i;
			anInt10208 += (((long) ((Class275_Sub1_Sub1_Sub1) this).aShort10424 * (long) (((Class275_Sub1_Sub1_Sub1) this).anInt10429 << 2)) >> 23) * (long) i;
			anInt10202 += (((long) ((Class275_Sub1_Sub1_Sub1) this).aShort10430 * (long) (((Class275_Sub1_Sub1_Sub1) this).anInt10429 << 2)) >> 23) * (long) i;
		}
	}
}
