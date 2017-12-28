/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class61 {
	public String[] aStringArray617;
	boolean aBool618;
	public byte aByte619;
	boolean aBool620;
	int[] anIntArray621;
	public String aString622;
	int anInt623;
	public boolean aBool624;
	static final int anInt625 = 5;
	public byte aByte626;
	public byte aByte627;
	public byte aByte628;
	Class465 aClass465_629;
	long[] aLongArray630;
	long aLong631;
	public int anInt632;
	int[] anIntArray633;
	public int[] anIntArray634;
	public int anInt635;
	public int anInt636;
	int anInt637 = 0;
	long[] aLongArray638;
	public String[] aStringArray639;
	public byte[] aByteArray640;
	public int anInt641;
	static final byte aByte642 = 127;
	static final byte aByte643 = 126;
	static final byte aByte644 = 125;
	static final byte aByte645 = 0;
	public static final byte aByte646 = -1;
	public static Class160 aClass160_647;

	public String method1194(int i) {
		if (null == ((Class61) this).aClass465_629)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (class282 == null || !(class282 instanceof Class282_Sub47))
			return null;
		return (String) ((Class282_Sub47) class282).anObject8068;
	}

	public int[] method1195() {
		if (((Class61) this).anIntArray621 == null) {
			String[] strings = new String[1869493667 * anInt632];
			((Class61) this).anIntArray621 = new int[1869493667 * anInt632];
			for (int i = 0; i < anInt632 * 1869493667; i++) {
				strings[i] = aStringArray639[i];
				((Class61) this).anIntArray621[i] = i;
			}
			Class111.method1865(strings, ((Class61) this).anIntArray621, -1785471613);
		}
		return ((Class61) this).anIntArray621;
	}

	void method1196(int i) {
		if (((Class61) this).aBool618) {
			if (((Class61) this).aLongArray630 != null)
				Class503.method8351(((Class61) this).aLongArray630, 0, (((Class61) this).aLongArray630 = new long[i]), 0, anInt632 * 1869493667);
			else
				((Class61) this).aLongArray630 = new long[i];
		}
		if (((Class61) this).aBool620) {
			if (null != aStringArray639)
				Class503.method8359(aStringArray639, 0, aStringArray639 = new String[i], 0, 1869493667 * anInt632);
			else
				aStringArray639 = new String[i];
		}
		if (aByteArray640 != null)
			Class503.method8352(aByteArray640, 0, aByteArray640 = new byte[i], 0, 1869493667 * anInt632);
		else
			aByteArray640 = new byte[i];
		if (((Class61) this).anIntArray633 != null)
			Class503.method8362(((Class61) this).anIntArray633, 0, ((Class61) this).anIntArray633 = new int[i], 0, 1869493667 * anInt632);
		else
			((Class61) this).anIntArray633 = new int[i];
		if (null != anIntArray634)
			Class503.method8362(anIntArray634, 0, anIntArray634 = new int[i], 0, anInt632 * 1869493667);
		else
			anIntArray634 = new int[i];
	}

	public int method1197(String string, int i) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i_0_ = 0; i_0_ < anInt632 * 1869493667; i_0_++) {
			if (aStringArray639[i_0_].equals(string))
				return i_0_;
		}
		return -1;
	}

	public int method1198(int i, int i_1_, int i_2_, int i_3_) {
		int i_4_ = 31 == i_2_ ? -1 : (1 << i_2_ + 1) - 1;
		return (((Class61) this).anIntArray633[i] & i_4_) >>> i_1_;
	}

	public Integer method1199(int i, int i_5_) {
		if (null == ((Class61) this).aClass465_629)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (null == class282 || !(class282 instanceof Class282_Sub38))
			return null;
		return new Integer(((Class282_Sub38) class282).anInt8002 * -570797415);
	}

	boolean method1200(int i, int i_6_, int i_7_, int i_8_) {
		int i_9_ = (1 << i_7_) - 1;
		int i_10_ = i_8_ == 31 ? -1 : (1 << i_8_ + 1) - 1;
		int i_11_ = i_10_ ^ i_9_;
		i_6_ <<= i_7_;
		i_6_ &= i_11_;
		if (null != ((Class61) this).aClass465_629) {
			Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
			if (class282 != null) {
				if (class282 instanceof Class282_Sub38) {
					Class282_Sub38 class282_sub38 = (Class282_Sub38) class282;
					if ((-570797415 * class282_sub38.anInt8002 & i_11_) == i_6_)
						return false;
					Class282_Sub38 class282_sub38_12_;
					(class282_sub38_12_ = class282_sub38).anInt8002 = (-570797415 * class282_sub38_12_.anInt8002 & (i_11_ ^ 0xffffffff)) * 1270866345;
					Class282_Sub38 class282_sub38_13_;
					(class282_sub38_13_ = class282_sub38).anInt8002 = ((-570797415 * class282_sub38_13_.anInt8002 | i_6_) * 1270866345);
					return true;
				}
				class282.method4991(-371378792);
			}
		} else
			((Class61) this).aClass465_629 = new Class465(4);
		((Class61) this).aClass465_629.method7765(new Class282_Sub38(i_6_), (long) i);
		return true;
	}

	public Long method1201(int i, int i_14_) {
		if (null == ((Class61) this).aClass465_629)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (class282 == null || !(class282 instanceof Class282_Sub45))
			return null;
		return new Long(3367138086658270151L * ((Class282_Sub45) class282).aLong8066);
	}

	public String method1202(int i, int i_15_) {
		if (null == ((Class61) this).aClass465_629)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (class282 == null || !(class282 instanceof Class282_Sub47))
			return null;
		return (String) ((Class282_Sub47) class282).anObject8068;
	}

	void method1203(int i) {
		if (i < 0 || i >= anInt632 * 1869493667)
			throw new RuntimeException("");
		anInt632 -= -1571510773;
		((Class61) this).anIntArray621 = null;
		if (0 == anInt632 * 1869493667) {
			((Class61) this).aLongArray630 = null;
			aStringArray639 = null;
			aByteArray640 = null;
			((Class61) this).anIntArray633 = null;
			anIntArray634 = null;
			anInt635 = 665258433;
			anInt636 = 359106103;
		} else {
			Class503.method8352(aByteArray640, 1 + i, aByteArray640, i, 1869493667 * anInt632 - i);
			Class503.method8362(((Class61) this).anIntArray633, i + 1, ((Class61) this).anIntArray633, i, 1869493667 * anInt632 - i);
			Class503.method8362(anIntArray634, i + 1, anIntArray634, i, 1869493667 * anInt632 - i);
			if (null != ((Class61) this).aLongArray630)
				Class503.method8351(((Class61) this).aLongArray630, i + 1, ((Class61) this).aLongArray630, i, 1869493667 * anInt632 - i);
			if (null != aStringArray639)
				Class503.method8359(aStringArray639, 1 + i, aStringArray639, i, anInt632 * 1869493667 - i);
			if (i == anInt635 * -1130104385 || -1900875655 * anInt636 == i)
				method1206(-969972337);
		}
	}

	void method1204(int i) {
		anInt641 -= 2065781847;
		if (0 == 487511911 * anInt641) {
			((Class61) this).aLongArray638 = null;
			aStringArray617 = null;
		} else {
			if (((Class61) this).aLongArray638 != null)
				Class503.method8351(((Class61) this).aLongArray638, i + 1, ((Class61) this).aLongArray638, i, 487511911 * anInt641 - i);
			if (null != aStringArray617)
				Class503.method8359(aStringArray617, 1 + i, aStringArray617, i, 487511911 * anInt641 - i);
		}
	}

	public Integer method1205(int i) {
		if (null == ((Class61) this).aClass465_629)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (null == class282 || !(class282 instanceof Class282_Sub38))
			return null;
		return new Integer(((Class282_Sub38) class282).anInt8002 * -570797415);
	}

	void method1206(int i) {
		if (0 == 1869493667 * anInt632) {
			anInt635 = 665258433;
			anInt636 = 359106103;
		} else {
			anInt635 = 665258433;
			anInt636 = 359106103;
			int i_16_ = 0;
			byte i_17_ = aByteArray640[0];
			for (int i_18_ = 1; i_18_ < anInt632 * 1869493667; i_18_++) {
				if (aByteArray640[i_18_] > i_17_) {
					if (i_17_ == 125)
						anInt636 = -359106103 * i_16_;
					i_16_ = i_18_;
					i_17_ = aByteArray640[i_18_];
				} else if (-1 == anInt636 * -1900875655 && aByteArray640[i_18_] == 125)
					anInt636 = i_18_ * -359106103;
			}
			anInt635 = -665258433 * i_16_;
			if (-1 != -1130104385 * anInt635)
				aByteArray640[-1130104385 * anInt635] = (byte) 126;
		}
	}

	void method1207(long l, String string, int i) {
		if (string != null && string.length() == 0)
			string = null;
		if (((Class61) this).aBool618 != l > 0L)
			throw new RuntimeException("");
		if ((null != string) != ((Class61) this).aBool620)
			throw new RuntimeException("");
		if (l > 0L && (null == ((Class61) this).aLongArray638 || (487511911 * anInt641 >= ((Class61) this).aLongArray638.length)) || (string != null && (aStringArray617 == null || 487511911 * anInt641 >= aStringArray617.length)))
			method1211(anInt641 * 487511911 + 5, (short) 2920);
		if (((Class61) this).aLongArray638 != null)
			((Class61) this).aLongArray638[487511911 * anInt641] = l;
		if (aStringArray617 != null)
			aStringArray617[487511911 * anInt641] = string;
		anInt641 += 2065781847;
	}

	void method1208(int i, int i_19_) {
		anInt641 -= 2065781847;
		if (0 == 487511911 * anInt641) {
			((Class61) this).aLongArray638 = null;
			aStringArray617 = null;
		} else {
			if (((Class61) this).aLongArray638 != null)
				Class503.method8351(((Class61) this).aLongArray638, i + 1, ((Class61) this).aLongArray638, i, 487511911 * anInt641 - i);
			if (null != aStringArray617)
				Class503.method8359(aStringArray617, 1 + i, aStringArray617, i, 487511911 * anInt641 - i);
		}
	}

	int method1209(int i, byte i_20_, int i_21_) {
		if (i_20_ == 126 || 127 == i_20_)
			return -1;
		if (i == -1130104385 * anInt635 && (-1 == anInt636 * -1900875655 || aByteArray640[-1900875655 * anInt636] < 125))
			return -1;
		if (i_20_ == aByteArray640[i])
			return -1;
		aByteArray640[i] = i_20_;
		method1206(1779625886);
		return i;
	}

	int method1210(int i, int i_22_, int i_23_, int i_24_, byte i_25_) {
		int i_26_ = (1 << i_23_) - 1;
		int i_27_ = i_24_ == 31 ? -1 : (1 << 1 + i_24_) - 1;
		int i_28_ = i_27_ ^ i_26_;
		i_22_ <<= i_23_;
		i_22_ &= i_28_;
		int i_29_ = ((Class61) this).anIntArray633[i];
		if ((i_29_ & i_28_) == i_22_)
			return -1;
		i_29_ &= i_28_ ^ 0xffffffff;
		((Class61) this).anIntArray633[i] = i_29_ | i_22_;
		return i;
	}

	void method1211(int i, short i_30_) {
		if (((Class61) this).aBool618) {
			if (((Class61) this).aLongArray638 != null)
				Class503.method8351(((Class61) this).aLongArray638, 0, (((Class61) this).aLongArray638 = new long[i]), 0, 487511911 * anInt641);
			else
				((Class61) this).aLongArray638 = new long[i];
		}
		if (((Class61) this).aBool620) {
			if (null != aStringArray617)
				Class503.method8359(aStringArray617, 0, aStringArray617 = new String[i], 0, anInt641 * 487511911);
			else
				aStringArray617 = new String[i];
		}
	}

	boolean method1212(int i, int i_31_, int i_32_, int i_33_, byte i_34_) {
		int i_35_ = (1 << i_32_) - 1;
		int i_36_ = i_33_ == 31 ? -1 : (1 << i_33_ + 1) - 1;
		int i_37_ = i_36_ ^ i_35_;
		i_31_ <<= i_32_;
		i_31_ &= i_37_;
		if (null != ((Class61) this).aClass465_629) {
			Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
			if (class282 != null) {
				if (class282 instanceof Class282_Sub38) {
					Class282_Sub38 class282_sub38 = (Class282_Sub38) class282;
					if ((-570797415 * class282_sub38.anInt8002 & i_37_) == i_31_)
						return false;
					Class282_Sub38 class282_sub38_38_;
					(class282_sub38_38_ = class282_sub38).anInt8002 = (-570797415 * class282_sub38_38_.anInt8002 & (i_37_ ^ 0xffffffff)) * 1270866345;
					Class282_Sub38 class282_sub38_39_;
					(class282_sub38_39_ = class282_sub38).anInt8002 = ((-570797415 * class282_sub38_39_.anInt8002 | i_31_) * 1270866345);
					return true;
				}
				class282.method4991(-371378792);
			}
		} else
			((Class61) this).aClass465_629 = new Class465(4);
		((Class61) this).aClass465_629.method7765(new Class282_Sub38(i_31_), (long) i);
		return true;
	}

	boolean method1213(int i, long l) {
		if (((Class61) this).aClass465_629 != null) {
			Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
			if (class282 != null) {
				if (class282 instanceof Class282_Sub45) {
					Class282_Sub45 class282_sub45 = (Class282_Sub45) class282;
					if (class282_sub45.aLong8066 * 3367138086658270151L == l)
						return false;
					class282_sub45.aLong8066 = 1350258240038399479L * l;
					return true;
				}
				class282.method4991(-371378792);
			}
		} else
			((Class61) this).aClass465_629 = new Class465(4);
		((Class61) this).aClass465_629.method7765(new Class282_Sub45(l), (long) i);
		return true;
	}

	public Integer method1214(int i, int i_40_, int i_41_) {
		if (((Class61) this).aClass465_629 == null)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (null == class282 || !(class282 instanceof Class282_Sub38))
			return null;
		int i_42_ = i_41_ == 31 ? -1 : (1 << 1 + i_41_) - 1;
		return new Integer((-570797415 * ((Class282_Sub38) class282).anInt8002 & i_42_) >>> i_40_);
	}

	public int[] method1215(byte i) {
		if (((Class61) this).anIntArray621 == null) {
			String[] strings = new String[1869493667 * anInt632];
			((Class61) this).anIntArray621 = new int[1869493667 * anInt632];
			for (int i_43_ = 0; i_43_ < anInt632 * 1869493667; i_43_++) {
				strings[i_43_] = aStringArray639[i_43_];
				((Class61) this).anIntArray621[i_43_] = i_43_;
			}
			Class111.method1865(strings, ((Class61) this).anIntArray621, 415358781);
		}
		return ((Class61) this).anIntArray621;
	}

	void method1216(long l, String string, int i, byte i_44_) {
		if (null != string && string.length() == 0)
			string = null;
		if (l > 0L != ((Class61) this).aBool618)
			throw new RuntimeException("");
		if (((Class61) this).aBool620 != (string != null))
			throw new RuntimeException("");
		if (l > 0L && (((Class61) this).aLongArray630 == null || (anInt632 * 1869493667 >= ((Class61) this).aLongArray630.length)) || (null != string && (null == aStringArray639 || anInt632 * 1869493667 >= aStringArray639.length)))
			method1232(5 + anInt632 * 1869493667, (byte) 123);
		if (((Class61) this).aLongArray630 != null)
			((Class61) this).aLongArray630[anInt632 * 1869493667] = l;
		if (aStringArray639 != null)
			aStringArray639[1869493667 * anInt632] = string;
		if (-1130104385 * anInt635 == -1) {
			anInt635 = anInt632 * 1269945629;
			aByteArray640[anInt632 * 1869493667] = (byte) 126;
		} else
			aByteArray640[1869493667 * anInt632] = (byte) 0;
		((Class61) this).anIntArray633[anInt632 * 1869493667] = 0;
		anIntArray634[anInt632 * 1869493667] = i;
		anInt632 += -1571510773;
		((Class61) this).anIntArray621 = null;
	}

	void method1217(int i) {
		if (((Class61) this).aBool618) {
			if (((Class61) this).aLongArray630 != null)
				Class503.method8351(((Class61) this).aLongArray630, 0, (((Class61) this).aLongArray630 = new long[i]), 0, anInt632 * 1869493667);
			else
				((Class61) this).aLongArray630 = new long[i];
		}
		if (((Class61) this).aBool620) {
			if (null != aStringArray639)
				Class503.method8359(aStringArray639, 0, aStringArray639 = new String[i], 0, 1869493667 * anInt632);
			else
				aStringArray639 = new String[i];
		}
		if (aByteArray640 != null)
			Class503.method8352(aByteArray640, 0, aByteArray640 = new byte[i], 0, 1869493667 * anInt632);
		else
			aByteArray640 = new byte[i];
		if (((Class61) this).anIntArray633 != null)
			Class503.method8362(((Class61) this).anIntArray633, 0, ((Class61) this).anIntArray633 = new int[i], 0, 1869493667 * anInt632);
		else
			((Class61) this).anIntArray633 = new int[i];
		if (null != anIntArray634)
			Class503.method8362(anIntArray634, 0, anIntArray634 = new int[i], 0, anInt632 * 1869493667);
		else
			anIntArray634 = new int[i];
	}

	void method1218(int i) {
		if (((Class61) this).aBool618) {
			if (((Class61) this).aLongArray638 != null)
				Class503.method8351(((Class61) this).aLongArray638, 0, (((Class61) this).aLongArray638 = new long[i]), 0, 487511911 * anInt641);
			else
				((Class61) this).aLongArray638 = new long[i];
		}
		if (((Class61) this).aBool620) {
			if (null != aStringArray617)
				Class503.method8359(aStringArray617, 0, aStringArray617 = new String[i], 0, anInt641 * 487511911);
			else
				aStringArray617 = new String[i];
		}
	}

	void method1219(int i) {
		if (((Class61) this).aBool618) {
			if (((Class61) this).aLongArray638 != null)
				Class503.method8351(((Class61) this).aLongArray638, 0, (((Class61) this).aLongArray638 = new long[i]), 0, 487511911 * anInt641);
			else
				((Class61) this).aLongArray638 = new long[i];
		}
		if (((Class61) this).aBool620) {
			if (null != aStringArray617)
				Class503.method8359(aStringArray617, 0, aStringArray617 = new String[i], 0, anInt641 * 487511911);
			else
				aStringArray617 = new String[i];
		}
	}

	public Class61(RsByteBuffer class282_sub35) {
		aString622 = null;
		((Class61) this).anInt623 = 0;
		anInt635 = 665258433;
		anInt636 = 359106103;
		method1234(class282_sub35, 901446116);
	}

	public int method1220(String string) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i = 0; i < anInt632 * 1869493667; i++) {
			if (aStringArray639[i].equals(string))
				return i;
		}
		return -1;
	}

	public Integer method1221(int i) {
		if (null == ((Class61) this).aClass465_629)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (null == class282 || !(class282 instanceof Class282_Sub38))
			return null;
		return new Integer(((Class282_Sub38) class282).anInt8002 * -570797415);
	}

	boolean method1222(int i, int i_45_, int i_46_) {
		if (null != ((Class61) this).aClass465_629) {
			Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
			if (class282 != null) {
				if (class282 instanceof Class282_Sub38) {
					Class282_Sub38 class282_sub38 = (Class282_Sub38) class282;
					if (-570797415 * class282_sub38.anInt8002 == i_45_)
						return false;
					class282_sub38.anInt8002 = i_45_ * 1270866345;
					return true;
				}
				class282.method4991(-371378792);
			}
		} else
			((Class61) this).aClass465_629 = new Class465(4);
		((Class61) this).aClass465_629.method7765(new Class282_Sub38(i_45_), (long) i);
		return true;
	}

	public Integer method1223(int i) {
		if (null == ((Class61) this).aClass465_629)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (null == class282 || !(class282 instanceof Class282_Sub38))
			return null;
		return new Integer(((Class282_Sub38) class282).anInt8002 * -570797415);
	}

	boolean method1224(int i, String string, byte i_47_) {
		if (null == string)
			string = "";
		else if (string.length() > 80)
			string = string.substring(0, 80);
		if (null != ((Class61) this).aClass465_629) {
			Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
			if (null != class282) {
				if (class282 instanceof Class282_Sub47) {
					Class282_Sub47 class282_sub47 = (Class282_Sub47) class282;
					if (class282_sub47.anObject8068 instanceof String) {
						if (string.equals(class282_sub47.anObject8068))
							return false;
						class282_sub47.method4991(-371378792);
						class282_sub47.method4991(-371378792);
						((Class61) this).aClass465_629.method7765(new Class282_Sub47(string), class282_sub47.aLong3379 * -3442165056282524525L);
						return true;
					}
				}
				class282.method4991(-371378792);
			}
		} else
			((Class61) this).aClass465_629 = new Class465(4);
		((Class61) this).aClass465_629.method7765(new Class282_Sub47(string), (long) i);
		return true;
	}

	public Integer method1225(int i, int i_48_, int i_49_, byte i_50_) {
		if (((Class61) this).aClass465_629 == null)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (null == class282 || !(class282 instanceof Class282_Sub38))
			return null;
		int i_51_ = i_49_ == 31 ? -1 : (1 << 1 + i_49_) - 1;
		return new Integer((-570797415 * ((Class282_Sub38) class282).anInt8002 & i_51_) >>> i_48_);
	}

	public Integer method1226(int i, int i_52_, int i_53_) {
		if (((Class61) this).aClass465_629 == null)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (null == class282 || !(class282 instanceof Class282_Sub38))
			return null;
		int i_54_ = i_53_ == 31 ? -1 : (1 << 1 + i_53_) - 1;
		return new Integer((-570797415 * ((Class282_Sub38) class282).anInt8002 & i_54_) >>> i_52_);
	}

	public Integer method1227(int i, int i_55_, int i_56_) {
		if (((Class61) this).aClass465_629 == null)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (null == class282 || !(class282 instanceof Class282_Sub38))
			return null;
		int i_57_ = i_56_ == 31 ? -1 : (1 << 1 + i_56_) - 1;
		return new Integer((-570797415 * ((Class282_Sub38) class282).anInt8002 & i_57_) >>> i_55_);
	}

	public Integer method1228(int i, int i_58_, int i_59_) {
		if (((Class61) this).aClass465_629 == null)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (null == class282 || !(class282 instanceof Class282_Sub38))
			return null;
		int i_60_ = i_59_ == 31 ? -1 : (1 << 1 + i_59_) - 1;
		return new Integer((-570797415 * ((Class282_Sub38) class282).anInt8002 & i_60_) >>> i_58_);
	}

	public Long method1229(int i) {
		if (null == ((Class61) this).aClass465_629)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (class282 == null || !(class282 instanceof Class282_Sub45))
			return null;
		return new Long(3367138086658270151L * ((Class282_Sub45) class282).aLong8066);
	}

	public String method1230(int i) {
		if (null == ((Class61) this).aClass465_629)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (class282 == null || !(class282 instanceof Class282_Sub47))
			return null;
		return (String) ((Class282_Sub47) class282).anObject8068;
	}

	public String method1231(int i) {
		if (null == ((Class61) this).aClass465_629)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (class282 == null || !(class282 instanceof Class282_Sub47))
			return null;
		return (String) ((Class282_Sub47) class282).anObject8068;
	}

	void method1232(int i, byte i_61_) {
		if (((Class61) this).aBool618) {
			if (((Class61) this).aLongArray630 != null)
				Class503.method8351(((Class61) this).aLongArray630, 0, (((Class61) this).aLongArray630 = new long[i]), 0, anInt632 * 1869493667);
			else
				((Class61) this).aLongArray630 = new long[i];
		}
		if (((Class61) this).aBool620) {
			if (null != aStringArray639)
				Class503.method8359(aStringArray639, 0, aStringArray639 = new String[i], 0, 1869493667 * anInt632);
			else
				aStringArray639 = new String[i];
		}
		if (aByteArray640 != null)
			Class503.method8352(aByteArray640, 0, aByteArray640 = new byte[i], 0, 1869493667 * anInt632);
		else
			aByteArray640 = new byte[i];
		if (((Class61) this).anIntArray633 != null)
			Class503.method8362(((Class61) this).anIntArray633, 0, ((Class61) this).anIntArray633 = new int[i], 0, 1869493667 * anInt632);
		else
			((Class61) this).anIntArray633 = new int[i];
		if (null != anIntArray634)
			Class503.method8362(anIntArray634, 0, anIntArray634 = new int[i], 0, anInt632 * 1869493667);
		else
			anIntArray634 = new int[i];
	}

	void method1233(int i, int i_62_) {
		if (i < 0 || i >= anInt632 * 1869493667)
			throw new RuntimeException("");
		anInt632 -= -1571510773;
		((Class61) this).anIntArray621 = null;
		if (0 == anInt632 * 1869493667) {
			((Class61) this).aLongArray630 = null;
			aStringArray639 = null;
			aByteArray640 = null;
			((Class61) this).anIntArray633 = null;
			anIntArray634 = null;
			anInt635 = 665258433;
			anInt636 = 359106103;
		} else {
			Class503.method8352(aByteArray640, 1 + i, aByteArray640, i, 1869493667 * anInt632 - i);
			Class503.method8362(((Class61) this).anIntArray633, i + 1, ((Class61) this).anIntArray633, i, 1869493667 * anInt632 - i);
			Class503.method8362(anIntArray634, i + 1, anIntArray634, i, 1869493667 * anInt632 - i);
			if (null != ((Class61) this).aLongArray630)
				Class503.method8351(((Class61) this).aLongArray630, i + 1, ((Class61) this).aLongArray630, i, 1869493667 * anInt632 - i);
			if (null != aStringArray639)
				Class503.method8359(aStringArray639, 1 + i, aStringArray639, i, anInt632 * 1869493667 - i);
			if (i == anInt635 * -1130104385 || -1900875655 * anInt636 == i)
				method1206(-561191659);
		}
	}

	void method1234(RsByteBuffer class282_sub35, int i) {
		int i_63_ = class282_sub35.readUnsignedByte();
		if (i_63_ < 1 || i_63_ > 5)
			throw new RuntimeException(new StringBuilder().append("").append(i_63_).toString());
		int i_64_ = class282_sub35.readUnsignedByte();
		if (0 != (i_64_ & 0x1))
			((Class61) this).aBool618 = true;
		if ((i_64_ & 0x2) != 0)
			((Class61) this).aBool620 = true;
		if (!((Class61) this).aBool618) {
			((Class61) this).aLongArray630 = null;
			((Class61) this).aLongArray638 = null;
		}
		if (!((Class61) this).aBool620) {
			aStringArray639 = null;
			aStringArray617 = null;
		}
		((Class61) this).anInt637 = class282_sub35.readInt() * 1021671405;
		((Class61) this).anInt623 = class282_sub35.readInt() * 232274815;
		if (i_63_ <= 3 && 0 != -1754037121 * ((Class61) this).anInt623)
			((Class61) this).anInt623 += -115958176;
		anInt632 = class282_sub35.readUnsignedShort() * -1571510773;
		anInt641 = class282_sub35.readUnsignedByte() * 2065781847;
		aString622 = class282_sub35.readString(1873945985);
		if (i_63_ >= 4)
			class282_sub35.readInt();
		aBool624 = class282_sub35.readUnsignedByte() == 1;
		aByte619 = class282_sub35.readByte((short) -4382);
		aByte626 = class282_sub35.readByte((short) -3823);
		aByte627 = class282_sub35.readByte((short) -23283);
		aByte628 = class282_sub35.readByte((short) -25367);
		if (1869493667 * anInt632 > 0) {
			if (((Class61) this).aBool618 && (null == ((Class61) this).aLongArray630 || (((Class61) this).aLongArray630.length < 1869493667 * anInt632)))
				((Class61) this).aLongArray630 = new long[1869493667 * anInt632];
			if (((Class61) this).aBool620 && (aStringArray639 == null || aStringArray639.length < 1869493667 * anInt632))
				aStringArray639 = new String[anInt632 * 1869493667];
			if (aByteArray640 == null || aByteArray640.length < anInt632 * 1869493667)
				aByteArray640 = new byte[1869493667 * anInt632];
			if (((Class61) this).anIntArray633 == null || (((Class61) this).anIntArray633.length < anInt632 * 1869493667))
				((Class61) this).anIntArray633 = new int[1869493667 * anInt632];
			if (null == anIntArray634 || anIntArray634.length < anInt632 * 1869493667)
				anIntArray634 = new int[anInt632 * 1869493667];
			for (int i_65_ = 0; i_65_ < anInt632 * 1869493667; i_65_++) {
				if (((Class61) this).aBool618)
					((Class61) this).aLongArray630[i_65_] = class282_sub35.readLong(1657847296);
				if (((Class61) this).aBool620)
					aStringArray639[i_65_] = class282_sub35.method13090(2060010006);
				aByteArray640[i_65_] = class282_sub35.readByte((short) -23950);
				if (i_63_ >= 2)
					((Class61) this).anIntArray633[i_65_] = class282_sub35.readInt();
				if (i_63_ >= 5)
					anIntArray634[i_65_] = class282_sub35.readUnsignedShort();
				else
					anIntArray634[i_65_] = 0;
			}
			method1206(-931317286);
		}
		if (anInt641 * 487511911 > 0) {
			if (((Class61) this).aBool618 && (((Class61) this).aLongArray638 == null || (((Class61) this).aLongArray638.length < anInt641 * 487511911)))
				((Class61) this).aLongArray638 = new long[487511911 * anInt641];
			if (((Class61) this).aBool620 && (aStringArray617 == null || aStringArray617.length < anInt641 * 487511911))
				aStringArray617 = new String[anInt641 * 487511911];
			for (int i_66_ = 0; i_66_ < 487511911 * anInt641; i_66_++) {
				if (((Class61) this).aBool618)
					((Class61) this).aLongArray638[i_66_] = class282_sub35.readLong(612955628);
				if (((Class61) this).aBool620)
					aStringArray617[i_66_] = class282_sub35.method13090(1621296132);
			}
		}
		if (i_63_ >= 3) {
			int i_67_ = class282_sub35.readUnsignedShort();
			if (i_67_ > 0) {
				((Class61) this).aClass465_629 = new Class465(i_67_ < 16 ? Class323.method5778(i_67_, 1744507894) : 16);
				while (i_67_-- > 0) {
					int i_68_ = class282_sub35.readInt();
					int i_69_ = i_68_ & 0x3fffffff;
					int i_70_ = i_68_ >>> 30;
					if (i_70_ == 0) {
						int i_71_ = class282_sub35.readInt();
						((Class61) this).aClass465_629.method7765(new Class282_Sub38(i_71_), (long) i_69_);
					} else if (i_70_ == 1) {
						long l = class282_sub35.readLong(1934711036);
						((Class61) this).aClass465_629.method7765(new Class282_Sub45(l), (long) i_69_);
					} else if (i_70_ == 2) {
						String string = class282_sub35.readString(-87216806);
						((Class61) this).aClass465_629.method7765(new Class282_Sub47(string), (long) i_69_);
					}
				}
			}
		}
	}

	void method1235(long l, String string, int i) {
		if (null != string && string.length() == 0)
			string = null;
		if (l > 0L != ((Class61) this).aBool618)
			throw new RuntimeException("");
		if (((Class61) this).aBool620 != (string != null))
			throw new RuntimeException("");
		if (l > 0L && (((Class61) this).aLongArray630 == null || (anInt632 * 1869493667 >= ((Class61) this).aLongArray630.length)) || (null != string && (null == aStringArray639 || anInt632 * 1869493667 >= aStringArray639.length)))
			method1232(5 + anInt632 * 1869493667, (byte) 124);
		if (((Class61) this).aLongArray630 != null)
			((Class61) this).aLongArray630[anInt632 * 1869493667] = l;
		if (aStringArray639 != null)
			aStringArray639[1869493667 * anInt632] = string;
		if (-1130104385 * anInt635 == -1) {
			anInt635 = anInt632 * 1269945629;
			aByteArray640[anInt632 * 1869493667] = (byte) 126;
		} else
			aByteArray640[1869493667 * anInt632] = (byte) 0;
		((Class61) this).anIntArray633[anInt632 * 1869493667] = 0;
		anIntArray634[anInt632 * 1869493667] = i;
		anInt632 += -1571510773;
		((Class61) this).anIntArray621 = null;
	}

	void method1236(int i) {
		if (i < 0 || i >= anInt632 * 1869493667)
			throw new RuntimeException("");
		anInt632 -= -1571510773;
		((Class61) this).anIntArray621 = null;
		if (0 == anInt632 * 1869493667) {
			((Class61) this).aLongArray630 = null;
			aStringArray639 = null;
			aByteArray640 = null;
			((Class61) this).anIntArray633 = null;
			anIntArray634 = null;
			anInt635 = 665258433;
			anInt636 = 359106103;
		} else {
			Class503.method8352(aByteArray640, 1 + i, aByteArray640, i, 1869493667 * anInt632 - i);
			Class503.method8362(((Class61) this).anIntArray633, i + 1, ((Class61) this).anIntArray633, i, 1869493667 * anInt632 - i);
			Class503.method8362(anIntArray634, i + 1, anIntArray634, i, 1869493667 * anInt632 - i);
			if (null != ((Class61) this).aLongArray630)
				Class503.method8351(((Class61) this).aLongArray630, i + 1, ((Class61) this).aLongArray630, i, 1869493667 * anInt632 - i);
			if (null != aStringArray639)
				Class503.method8359(aStringArray639, 1 + i, aStringArray639, i, anInt632 * 1869493667 - i);
			if (i == anInt635 * -1130104385 || -1900875655 * anInt636 == i)
				method1206(234700788);
		}
	}

	public Integer method1237(int i) {
		if (null == ((Class61) this).aClass465_629)
			return null;
		Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
		if (null == class282 || !(class282 instanceof Class282_Sub38))
			return null;
		return new Integer(((Class282_Sub38) class282).anInt8002 * -570797415);
	}

	void method1238() {
		if (0 == 1869493667 * anInt632) {
			anInt635 = 665258433;
			anInt636 = 359106103;
		} else {
			anInt635 = 665258433;
			anInt636 = 359106103;
			int i = 0;
			byte i_72_ = aByteArray640[0];
			for (int i_73_ = 1; i_73_ < anInt632 * 1869493667; i_73_++) {
				if (aByteArray640[i_73_] > i_72_) {
					if (i_72_ == 125)
						anInt636 = -359106103 * i;
					i = i_73_;
					i_72_ = aByteArray640[i_73_];
				} else if (-1 == anInt636 * -1900875655 && aByteArray640[i_73_] == 125)
					anInt636 = i_73_ * -359106103;
			}
			anInt635 = -665258433 * i;
			if (-1 != -1130104385 * anInt635)
				aByteArray640[-1130104385 * anInt635] = (byte) 126;
		}
	}

	void method1239() {
		if (0 == 1869493667 * anInt632) {
			anInt635 = 665258433;
			anInt636 = 359106103;
		} else {
			anInt635 = 665258433;
			anInt636 = 359106103;
			int i = 0;
			byte i_74_ = aByteArray640[0];
			for (int i_75_ = 1; i_75_ < anInt632 * 1869493667; i_75_++) {
				if (aByteArray640[i_75_] > i_74_) {
					if (i_74_ == 125)
						anInt636 = -359106103 * i;
					i = i_75_;
					i_74_ = aByteArray640[i_75_];
				} else if (-1 == anInt636 * -1900875655 && aByteArray640[i_75_] == 125)
					anInt636 = i_75_ * -359106103;
			}
			anInt635 = -665258433 * i;
			if (-1 != -1130104385 * anInt635)
				aByteArray640[-1130104385 * anInt635] = (byte) 126;
		}
	}

	void method1240() {
		if (0 == 1869493667 * anInt632) {
			anInt635 = 665258433;
			anInt636 = 359106103;
		} else {
			anInt635 = 665258433;
			anInt636 = 359106103;
			int i = 0;
			byte i_76_ = aByteArray640[0];
			for (int i_77_ = 1; i_77_ < anInt632 * 1869493667; i_77_++) {
				if (aByteArray640[i_77_] > i_76_) {
					if (i_76_ == 125)
						anInt636 = -359106103 * i;
					i = i_77_;
					i_76_ = aByteArray640[i_77_];
				} else if (-1 == anInt636 * -1900875655 && aByteArray640[i_77_] == 125)
					anInt636 = i_77_ * -359106103;
			}
			anInt635 = -665258433 * i;
			if (-1 != -1130104385 * anInt635)
				aByteArray640[-1130104385 * anInt635] = (byte) 126;
		}
	}

	void method1241() {
		if (0 == 1869493667 * anInt632) {
			anInt635 = 665258433;
			anInt636 = 359106103;
		} else {
			anInt635 = 665258433;
			anInt636 = 359106103;
			int i = 0;
			byte i_78_ = aByteArray640[0];
			for (int i_79_ = 1; i_79_ < anInt632 * 1869493667; i_79_++) {
				if (aByteArray640[i_79_] > i_78_) {
					if (i_78_ == 125)
						anInt636 = -359106103 * i;
					i = i_79_;
					i_78_ = aByteArray640[i_79_];
				} else if (-1 == anInt636 * -1900875655 && aByteArray640[i_79_] == 125)
					anInt636 = i_79_ * -359106103;
			}
			anInt635 = -665258433 * i;
			if (-1 != -1130104385 * anInt635)
				aByteArray640[-1130104385 * anInt635] = (byte) 126;
		}
	}

	public int method1242(String string) {
		if (string == null || string.length() == 0)
			return -1;
		for (int i = 0; i < anInt632 * 1869493667; i++) {
			if (aStringArray639[i].equals(string))
				return i;
		}
		return -1;
	}

	void method1243(long l, String string) {
		if (string != null && string.length() == 0)
			string = null;
		if (((Class61) this).aBool618 != l > 0L)
			throw new RuntimeException("");
		if ((null != string) != ((Class61) this).aBool620)
			throw new RuntimeException("");
		if (l > 0L && (null == ((Class61) this).aLongArray638 || (487511911 * anInt641 >= ((Class61) this).aLongArray638.length)) || (string != null && (aStringArray617 == null || 487511911 * anInt641 >= aStringArray617.length)))
			method1211(anInt641 * 487511911 + 5, (short) -2181);
		if (((Class61) this).aLongArray638 != null)
			((Class61) this).aLongArray638[487511911 * anInt641] = l;
		if (aStringArray617 != null)
			aStringArray617[487511911 * anInt641] = string;
		anInt641 += 2065781847;
	}

	void method1244(long l, String string) {
		if (string != null && string.length() == 0)
			string = null;
		if (((Class61) this).aBool618 != l > 0L)
			throw new RuntimeException("");
		if ((null != string) != ((Class61) this).aBool620)
			throw new RuntimeException("");
		if (l > 0L && (null == ((Class61) this).aLongArray638 || (487511911 * anInt641 >= ((Class61) this).aLongArray638.length)) || (string != null && (aStringArray617 == null || 487511911 * anInt641 >= aStringArray617.length)))
			method1211(anInt641 * 487511911 + 5, (short) -29147);
		if (((Class61) this).aLongArray638 != null)
			((Class61) this).aLongArray638[487511911 * anInt641] = l;
		if (aStringArray617 != null)
			aStringArray617[487511911 * anInt641] = string;
		anInt641 += 2065781847;
	}

	void method1245(long l, String string, int i) {
		if (null != string && string.length() == 0)
			string = null;
		if (l > 0L != ((Class61) this).aBool618)
			throw new RuntimeException("");
		if (((Class61) this).aBool620 != (string != null))
			throw new RuntimeException("");
		if (l > 0L && (((Class61) this).aLongArray630 == null || (anInt632 * 1869493667 >= ((Class61) this).aLongArray630.length)) || (null != string && (null == aStringArray639 || anInt632 * 1869493667 >= aStringArray639.length)))
			method1232(5 + anInt632 * 1869493667, (byte) 127);
		if (((Class61) this).aLongArray630 != null)
			((Class61) this).aLongArray630[anInt632 * 1869493667] = l;
		if (aStringArray639 != null)
			aStringArray639[1869493667 * anInt632] = string;
		if (-1130104385 * anInt635 == -1) {
			anInt635 = anInt632 * 1269945629;
			aByteArray640[anInt632 * 1869493667] = (byte) 126;
		} else
			aByteArray640[1869493667 * anInt632] = (byte) 0;
		((Class61) this).anIntArray633[anInt632 * 1869493667] = 0;
		anIntArray634[anInt632 * 1869493667] = i;
		anInt632 += -1571510773;
		((Class61) this).anIntArray621 = null;
	}

	void method1246(int i) {
		anInt641 -= 2065781847;
		if (0 == 487511911 * anInt641) {
			((Class61) this).aLongArray638 = null;
			aStringArray617 = null;
		} else {
			if (((Class61) this).aLongArray638 != null)
				Class503.method8351(((Class61) this).aLongArray638, i + 1, ((Class61) this).aLongArray638, i, 487511911 * anInt641 - i);
			if (null != aStringArray617)
				Class503.method8359(aStringArray617, 1 + i, aStringArray617, i, 487511911 * anInt641 - i);
		}
	}

	int method1247(int i, byte i_80_) {
		if (i_80_ == 126 || 127 == i_80_)
			return -1;
		if (i == -1130104385 * anInt635 && (-1 == anInt636 * -1900875655 || aByteArray640[-1900875655 * anInt636] < 125))
			return -1;
		if (i_80_ == aByteArray640[i])
			return -1;
		aByteArray640[i] = i_80_;
		method1206(660301923);
		return i;
	}

	int method1248(int i, byte i_81_) {
		if (i_81_ == 126 || 127 == i_81_)
			return -1;
		if (i == -1130104385 * anInt635 && (-1 == anInt636 * -1900875655 || aByteArray640[-1900875655 * anInt636] < 125))
			return -1;
		if (i_81_ == aByteArray640[i])
			return -1;
		aByteArray640[i] = i_81_;
		method1206(933356058);
		return i;
	}

	int method1249(int i, int i_82_, int i_83_, int i_84_) {
		int i_85_ = (1 << i_83_) - 1;
		int i_86_ = i_84_ == 31 ? -1 : (1 << 1 + i_84_) - 1;
		int i_87_ = i_86_ ^ i_85_;
		i_82_ <<= i_83_;
		i_82_ &= i_87_;
		int i_88_ = ((Class61) this).anIntArray633[i];
		if ((i_88_ & i_87_) == i_82_)
			return -1;
		i_88_ &= i_87_ ^ 0xffffffff;
		((Class61) this).anIntArray633[i] = i_88_ | i_82_;
		return i;
	}

	boolean method1250(int i, int i_89_, int i_90_, int i_91_) {
		int i_92_ = (1 << i_90_) - 1;
		int i_93_ = i_91_ == 31 ? -1 : (1 << i_91_ + 1) - 1;
		int i_94_ = i_93_ ^ i_92_;
		i_89_ <<= i_90_;
		i_89_ &= i_94_;
		if (null != ((Class61) this).aClass465_629) {
			Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
			if (class282 != null) {
				if (class282 instanceof Class282_Sub38) {
					Class282_Sub38 class282_sub38 = (Class282_Sub38) class282;
					if ((-570797415 * class282_sub38.anInt8002 & i_94_) == i_89_)
						return false;
					Class282_Sub38 class282_sub38_95_;
					(class282_sub38_95_ = class282_sub38).anInt8002 = (-570797415 * class282_sub38_95_.anInt8002 & (i_94_ ^ 0xffffffff)) * 1270866345;
					Class282_Sub38 class282_sub38_96_;
					(class282_sub38_96_ = class282_sub38).anInt8002 = ((-570797415 * class282_sub38_96_.anInt8002 | i_89_) * 1270866345);
					return true;
				}
				class282.method4991(-371378792);
			}
		} else
			((Class61) this).aClass465_629 = new Class465(4);
		((Class61) this).aClass465_629.method7765(new Class282_Sub38(i_89_), (long) i);
		return true;
	}

	void method1251(long l, String string) {
		if (string != null && string.length() == 0)
			string = null;
		if (((Class61) this).aBool618 != l > 0L)
			throw new RuntimeException("");
		if ((null != string) != ((Class61) this).aBool620)
			throw new RuntimeException("");
		if (l > 0L && (null == ((Class61) this).aLongArray638 || (487511911 * anInt641 >= ((Class61) this).aLongArray638.length)) || (string != null && (aStringArray617 == null || 487511911 * anInt641 >= aStringArray617.length)))
			method1211(anInt641 * 487511911 + 5, (short) -7281);
		if (((Class61) this).aLongArray638 != null)
			((Class61) this).aLongArray638[487511911 * anInt641] = l;
		if (aStringArray617 != null)
			aStringArray617[487511911 * anInt641] = string;
		anInt641 += 2065781847;
	}

	boolean method1252(int i, String string) {
		if (null == string)
			string = "";
		else if (string.length() > 80)
			string = string.substring(0, 80);
		if (null != ((Class61) this).aClass465_629) {
			Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
			if (null != class282) {
				if (class282 instanceof Class282_Sub47) {
					Class282_Sub47 class282_sub47 = (Class282_Sub47) class282;
					if (class282_sub47.anObject8068 instanceof String) {
						if (string.equals(class282_sub47.anObject8068))
							return false;
						class282_sub47.method4991(-371378792);
						class282_sub47.method4991(-371378792);
						((Class61) this).aClass465_629.method7765(new Class282_Sub47(string), class282_sub47.aLong3379 * -3442165056282524525L);
						return true;
					}
				}
				class282.method4991(-371378792);
			}
		} else
			((Class61) this).aClass465_629 = new Class465(4);
		((Class61) this).aClass465_629.method7765(new Class282_Sub47(string), (long) i);
		return true;
	}

	boolean method1253(int i, String string) {
		if (null == string)
			string = "";
		else if (string.length() > 80)
			string = string.substring(0, 80);
		if (null != ((Class61) this).aClass465_629) {
			Class282 class282 = ((Class61) this).aClass465_629.method7754((long) i);
			if (null != class282) {
				if (class282 instanceof Class282_Sub47) {
					Class282_Sub47 class282_sub47 = (Class282_Sub47) class282;
					if (class282_sub47.anObject8068 instanceof String) {
						if (string.equals(class282_sub47.anObject8068))
							return false;
						class282_sub47.method4991(-371378792);
						class282_sub47.method4991(-371378792);
						((Class61) this).aClass465_629.method7765(new Class282_Sub47(string), class282_sub47.aLong3379 * -3442165056282524525L);
						return true;
					}
				}
				class282.method4991(-371378792);
			}
		} else
			((Class61) this).aClass465_629 = new Class465(4);
		((Class61) this).aClass465_629.method7765(new Class282_Sub47(string), (long) i);
		return true;
	}

	static final void method1254(Class527 class527, int i) {
		((Class527) class527).anInt7020 += (((Class527) class527).anIntArray7018[((Class527) class527).anInt7020 * 301123709]) * -1051529003;
	}

	static final void method1255(Class527 class527, int i) {
		int i_97_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class220 class220 = Class397.aClass218_4813.method3700(i_97_, 676193293);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = -1248709255 * class220.anInt2719;
	}
}
