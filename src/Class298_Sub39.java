/* Class298_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub39 extends Linkable {
	int anInt7418;
	int anInt7419;

	Class298_Sub39(int i, int i_0_) {
		((Class298_Sub39) this).anInt7418 = 1518695855 * i;
		((Class298_Sub39) this).anInt7419 = -1654604829 * i_0_;
	}

	static void method3504(Class298_Sub37_Sub5 class298_sub37_sub5, int i, int i_1_) {
		try {
			if (Class436.aBoolean5478) {
				Class505 class505 = Class142.method1571(-2115678267);
				int i_2_ = 0;
				for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) class298_sub37_sub5).aClass461_9584.method5984(2119881606)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) class298_sub37_sub5).aClass461_9584.method5985(-758930912))) {
					int i_3_ = Class127_Sub1.method1425(class298_sub37_sub15, class505, 692106883);
					if (i_3_ > i_2_)
						i_2_ = i_3_;
				}
				i_2_ += 8;
				int i_4_ = (21 + (((Class298_Sub37_Sub5) class298_sub37_sub5).anInt9583 * -628325139 * (-411680299 * Class436.anInt5467)));
				Class389.anInt4166 = ((Class436.aBoolean5496 ? 26 : 22) + (-411680299 * Class436.anInt5467 * ((((Class298_Sub37_Sub5) class298_sub37_sub5).anInt9583) * -628325139))) * 1396848787;
				int i_5_ = (Class134.anInt6343 * 608683427 + -1347746885 * Class88.anInt806);
				if (i_5_ + i_2_ > -2110394505 * Class462.anInt5683)
					i_5_ = -1347746885 * Class88.anInt806 - i_2_;
				if (i_5_ < 0)
					i_5_ = 0;
				int i_6_ = (Class436.aBoolean5496 ? 20 + class505.anInt6202 * 1110385787 + 1 : 31);
				int i_7_ = 1 + (1110385787 * class505.anInt6202 + (i - i_6_));
				if (i_7_ + i_4_ > -1111710645 * Class298_Sub40_Sub9.anInt9716)
					i_7_ = Class298_Sub40_Sub9.anInt9716 * -1111710645 - i_4_;
				if (i_7_ < 0)
					i_7_ = 0;
				Class461.anInt5681 = 1353749359 * i_5_;
				Class501.anInt6119 = i_7_ * -1998653171;
				Class420.anInt5345 = -847507893 * i_2_;
				Class436.aClass298_Sub37_Sub5_5472 = class298_sub37_sub5;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abx.q(").append(')').toString());
		}
	}

	static void method3505(GraphicsToolkit class_ra, Class298_Sub52 class298_sub52, Class352 class352, int i, int i_8_, int i_9_, int i_10_, Class4 class4, int i_11_) {
		try {
			int i_12_ = i_8_ - i_10_ / 2 - 5;
			int i_13_ = i_9_ + 2;
			if (594838161 * class352.anInt3787 != 0)
				class_ra.method5015(i_12_, i_13_, i_10_ + 10, i_9_ + i * class4.method309() - i_13_ + 1, 594838161 * class352.anInt3787, (byte) 7);
			if (0 != class352.anInt3802 * -828737913)
				class_ra.method5014(i_12_, i_13_, i_10_ + 10, i_9_ + i * class4.method309() - i_13_ + 1, class352.anInt3802 * -828737913, -1130300720);
			int i_14_ = -1836991893 * class352.anInt3781;
			if (class298_sub52.aBoolean7611 && 1364087215 * class352.anInt3782 != -1)
				i_14_ = 1364087215 * class352.anInt3782;
			for (int i_15_ = 0; i_15_ < i; i_15_++) {
				String string = Class301_Sub1.aStringArray7638[i_15_];
				if (i_15_ < i - 1)
					string = string.substring(0, string.length() - 4);
				class4.method308(class_ra, string, i_8_, i_9_, i_14_, true);
				i_9_ += class4.method309();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abx.bj(").append(')').toString());
		}
	}

	static final void method3506(int i) {
		try {
			int i_16_ = 256 + -712176128 * Class376.anInt4089;
			int i_17_ = 256 + Class82_Sub4.anInt6832 * 1953388032;
			int i_18_ = (Class356.method4271(i_16_, i_17_, 1855729883 * Class99.anInt952, -1586416356) - -1439836243 * Class98_Sub3.anInt6938);
			if (1534163843 * Class21.anInt276 >= 100) {
				Class367.anInt4000 = -1475884800 + Class376.anInt4089 * -1222509056;
				Class146.anInt1575 = 2009399552 + Class82_Sub4.anInt6832 * 1453086208;
				Class110.anInt6403 = (Class356.method4271(-1740717447 * Class367.anInt4000, -299812095 * Class146.anInt1575, 1855729883 * Class99.anInt952, -1881231282) - -1439836243 * Class98_Sub3.anInt6938) * 1078403147;
			} else {
				if (Class367.anInt4000 * -1740717447 < i_16_) {
					Class367.anInt4000 += ((1534163843 * Class21.anInt276 * (i_16_ - -1740717447 * Class367.anInt4000) / 1000) + -170273947 * Class129.anInt6380) * 547882953;
					if (-1740717447 * Class367.anInt4000 > i_16_)
						Class367.anInt4000 = i_16_ * 547882953;
				}
				if (-1740717447 * Class367.anInt4000 > i_16_) {
					Class367.anInt4000 -= (547882953 * (Class129.anInt6380 * -170273947 + ((-1740717447 * Class367.anInt4000 - i_16_) * (1534163843 * Class21.anInt276) / 1000)));
					if (-1740717447 * Class367.anInt4000 < i_16_)
						Class367.anInt4000 = 547882953 * i_16_;
				}
				if (1449634147 * Class110.anInt6403 < i_18_) {
					Class110.anInt6403 += (((i_18_ - 1449634147 * Class110.anInt6403) * (Class21.anInt276 * 1534163843) / 1000) + Class129.anInt6380 * -170273947) * 1078403147;
					if (1449634147 * Class110.anInt6403 > i_18_)
						Class110.anInt6403 = 1078403147 * i_18_;
				}
				if (Class110.anInt6403 * 1449634147 > i_18_) {
					Class110.anInt6403 -= ((-170273947 * Class129.anInt6380 + ((Class110.anInt6403 * 1449634147 - i_18_) * (1534163843 * Class21.anInt276) / 1000)) * 1078403147);
					if (Class110.anInt6403 * 1449634147 < i_18_)
						Class110.anInt6403 = i_18_ * 1078403147;
				}
				if (-299812095 * Class146.anInt1575 < i_17_) {
					Class146.anInt1575 += (309839105 * (-170273947 * Class129.anInt6380 + (1534163843 * Class21.anInt276 * (i_17_ - Class146.anInt1575 * -299812095) / 1000)));
					if (Class146.anInt1575 * -299812095 > i_17_)
						Class146.anInt1575 = i_17_ * 309839105;
				}
				if (Class146.anInt1575 * -299812095 > i_17_) {
					Class146.anInt1575 -= (309839105 * (-170273947 * Class129.anInt6380 + ((Class146.anInt1575 * -299812095 - i_17_) * (Class21.anInt276 * 1534163843) / 1000)));
					if (Class146.anInt1575 * -299812095 < i_17_)
						Class146.anInt1575 = i_17_ * 309839105;
				}
			}
			i_16_ = 256 + Class_xa.anInt6292 * -589460992;
			i_17_ = 256 + Class464.anInt5959 * 1647476224;
			i_18_ = (Class356.method4271(i_16_, i_17_, 1855729883 * Class99.anInt952, -1098953725) - 771695069 * Class18.anInt255);
			int i_19_ = i_16_ - Class367.anInt4000 * -1740717447;
			int i_20_ = i_18_ - Class110.anInt6403 * 1449634147;
			int i_21_ = i_17_ - -299812095 * Class146.anInt1575;
			int i_22_ = (int) Math.sqrt((double) (i_21_ * i_21_ + i_19_ * i_19_));
			int i_23_ = ((int) (Math.atan2((double) i_20_, (double) i_22_) * 2607.5945876176133) & 0x3fff);
			int i_24_ = ((int) (Math.atan2((double) i_19_, (double) i_21_) * -2607.5945876176133) & 0x3fff);
			if (i_23_ < 1024)
				i_23_ = 1024;
			if (i_23_ > 3072)
				i_23_ = 3072;
			if (client.anInt8756 * -104436553 < i_23_) {
				client.anInt8756 += ((((i_23_ - client.anInt8756 * -104436553 >> 3) * (1179258959 * Class427.anInt5362) / 1000) + Class128_Sub1.anInt8556 * 298687157) << 3) * -648269561;
				if (client.anInt8756 * -104436553 > i_23_)
					client.anInt8756 = i_23_ * -648269561;
			}
			if (-104436553 * client.anInt8756 > i_23_) {
				client.anInt8756 -= (-648269561 * ((1179258959 * Class427.anInt5362 * (client.anInt8756 * -104436553 - i_23_ >> 3) / 1000) + 298687157 * Class128_Sub1.anInt8556 << 3));
				if (-104436553 * client.anInt8756 < i_23_)
					client.anInt8756 = i_23_ * -648269561;
			}
			int i_25_ = i_24_ - -1847894591 * Class135.anInt6384;
			if (i_25_ > 8192)
				i_25_ -= 16384;
			if (i_25_ < -8192)
				i_25_ += 16384;
			i_25_ >>= 3;
			if (i_25_ > 0) {
				Class135.anInt6384 += ((Class427.anInt5362 * 1179258959 * i_25_ / 1000 + Class128_Sub1.anInt8556 * 298687157) << 3) * -1587695039;
				Class135.anInt6384 = -1587695039 * (Class135.anInt6384 * -1847894591 & 0x3fff);
			}
			if (i_25_ < 0) {
				Class135.anInt6384 -= -1587695039 * ((Class128_Sub1.anInt8556 * 298687157 + (-i_25_ * (1179258959 * Class427.anInt5362) / 1000)) << 3);
				Class135.anInt6384 = (-1847894591 * Class135.anInt6384 & 0x3fff) * -1587695039;
			}
			int i_26_ = i_24_ - -1847894591 * Class135.anInt6384;
			if (i_26_ > 8192)
				i_26_ -= 16384;
			if (i_26_ < -8192)
				i_26_ += 16384;
			if (i_26_ < 0 && i_25_ > 0 || i_26_ > 0 && i_25_ < 0)
				Class135.anInt6384 = i_24_ * -1587695039;
			Class229.anInt6458 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abx.ho(").append(')').toString());
		}
	}

	static final void method3507(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -1593702044) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1245 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abx.lg(").append(')').toString());
		}
	}
}
