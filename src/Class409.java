/* Class409 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class409 {
	public int anInt4854;
	Class406 aClass406_4855;
	public int anInt4856;
	public String aString4857 = "null";
	public int anInt4858 = -1156523463;
	public int[] anIntArray4859;
	public int[] anIntArray4860;
	public int anInt4861;
	public static short[] aShortArray4862 = new short[256];
	short[] aShortArray4863;
	public boolean aBool4864;
	byte[] aByteArray4865;
	short[] aShortArray4866;
	public short[] aShortArray4867;
	byte aByte4868;
	byte aByte4869;
	public static final int anInt4870 = 2;
	byte aByte4871;
	public boolean aBool4872;
	public int anInt4873;
	public short aShort4874;
	public int anInt4875;
	public int anInt4876;
	public int anInt4877;
	int anInt4878;
	public int anInt4879;
	int anInt4880;
	int anInt4881;
	public String[] aStringArray4882;
	public byte aByte4883;
	public boolean aBool4884;
	int anInt4885;
	public int[] anIntArray4886;
	public int anInt4887;
	int anInt4888;
	public int anInt4889;
	public boolean aBool4890;
	int anInt4891;
	public short[] aShortArray4892;
	public boolean aBool4893;
	public boolean aBool4894;
	int[][] anIntArrayArray4895;
	Class465 aClass465_4896;
	public short aShort4897;
	public int anInt4898 = 318852007;
	public byte aByte4899;
	public byte aByte4900;
	public static final int anInt4901 = 1;
	public int anInt4902;
	public int anInt4903;
	public boolean aBool4904;
	byte aByte4905;
	public int anInt4906;
	public int anInt4907;
	public int anInt4908;
	public int anInt4909;
	public Class252 aClass252_4910;
	public int anInt4911;
	public boolean aBool4912;
	public int anInt4913;
	public int anInt4914;
	public int[] anIntArray4915;
	public byte aByte4916;
	public int anInt4917;
	public int anInt4918;
	public int anInt4919;
	public boolean aBool4920;
	public int anInt4921;
	public static Class242 aClass242_4922;

	void method6874(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (i_0_ == 0)
				break;
			method6896(class282_sub35, i_0_, 88392628);
		}
	}

	public final Class528 method6875(Class505 class505, int i, Class211 class211, Interface42 interface42, Class456 class456, Class456 class456_1_, Class456[] class456s, int[] is, int i_2_, Class417 class417, int i_3_) {
		return method6879(class505, i, class211, interface42, class456, class456_1_, class456s, is, i_2_, class417, -490908695 * anInt4898, true, 1493042037);
	}

	public int method6876(int i, int i_4_, int i_5_) {
		if (((Class409) this).aClass465_4896 == null)
			return i_4_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class409) this).aClass465_4896.method7754((long) i));
		if (null == class282_sub38)
			return i_4_;
		return -570797415 * class282_sub38.anInt8002;
	}

	void method6877(int i) {
		if (anIntArray4859 == null)
			anIntArray4859 = new int[0];
		if (aByte4916 == -1) {
			if (Class486.aClass486_5744 == (((Class406) ((Class409) this).aClass406_4855).aClass486_4844))
				aByte4916 = (byte) 1;
			else
				aByte4916 = (byte) 0;
		}
	}

	public final Class528 method6878(Class505 class505, int i, Class211 class211, Interface42 interface42, Class456 class456, Class456 class456_6_, Class456[] class456s, int[] is, int i_7_, Class417 class417) {
		return method6879(class505, i, class211, interface42, class456, class456_6_, class456s, is, i_7_, class417, -490908695 * anInt4898, true, -1819079900);
	}

	public final Class528 method6879(Class505 class505, int i, Class211 class211, Interface42 interface42, Class456 class456, Class456 class456_8_, Class456[] class456s, int[] is, int i_9_, Class417 class417, int i_10_, boolean bool, int i_11_) {
		if (anIntArray4886 != null) {
			Class409 class409_12_ = method6884(interface42, 265881693);
			if (null == class409_12_)
				return null;
			return class409_12_.method6879(class505, i, class211, interface42, class456, class456_8_, class456s, is, i_9_, class417, i_10_, bool, 1208445516);
		}
		int i_13_ = i;
		if (((Class409) this).anInt4881 * -34693077 != 128)
			i_13_ |= 0x2;
		if (128 != ((Class409) this).anInt4880 * -961031919)
			i_13_ |= 0x5;
		boolean bool_14_ = false;
		int i_15_ = null != class456s ? class456s.length : 0;
		for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
			if (class456s[i_16_] != null) {
				i_13_ |= class456s[i_16_].method7640(-1824890003);
				bool_14_ = true;
			}
		}
		if (class456 != null) {
			i_13_ |= class456.method7640(-1277632431);
			bool_14_ = true;
		}
		if (null != class456_8_) {
			i_13_ |= class456_8_.method7640(-1870377420);
			bool_14_ = true;
		}
		long l = (long) (anInt4856 * -1524615769 | class505.anInt5840 * -413843045 << 16);
		if (null != class417)
			l |= class417.aLong4993 * -3839876830849846037L << 24;
		Class528 class528;
		synchronized (((Class406) ((Class409) this).aClass406_4855).aClass229_4836) {
			class528 = (Class528) ((Class406) ((Class409) this).aClass406_4855).aClass229_4836.method3865(l);
		}
		Class227 class227 = null;
		if (!bool && -1 != i_10_)
			class227 = class211.method3616(i_10_, (byte) 22);
		else if (-1 != -490908695 * anInt4898)
			class227 = class211.method3616(anInt4898 * -490908695, (byte) 85);
		if (class528 == null || (class528.m() & i_13_) != i_13_) {
			if (class528 != null)
				i_13_ |= class528.m();
			int i_17_ = i_13_;
			if (null != ((Class409) this).aShortArray4863)
				i_17_ |= 0x4000;
			if (((Class409) this).aShortArray4866 != null)
				i_17_ |= 0x8000;
			if (0 != ((Class409) this).aByte4871)
				i_17_ |= 0x80000;
			int[] is_18_ = (null != class417 && null != class417.anIntArray4992 ? class417.anIntArray4992 : anIntArray4859);
			boolean bool_19_ = false;
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass317_4842) {
				for (int i_20_ = 0; i_20_ < is_18_.length; i_20_++) {
					if (-1 != is_18_[i_20_] && !((Class406) ((Class409) this).aClass406_4855).aClass317_4842.method5688(is_18_[i_20_], 0, 16711935))
						bool_19_ = true;
				}
			}
			if (bool_19_)
				return null;
			Class157[] class157s = new Class157[is_18_.length];
			for (int i_21_ = 0; i_21_ < is_18_.length; i_21_++) {
				if (is_18_[i_21_] != -1) {
					synchronized (((Class406) ((Class409) this).aClass406_4855).aClass317_4842) {
						class157s[i_21_] = Class157.method2689((((Class406) (((Class409) this).aClass406_4855)).aClass317_4842), is_18_[i_21_], 0);
					}
					if (null != class157s[i_21_]) {
						if (class157s[i_21_].anInt1986 < 13)
							class157s[i_21_].method2679(2);
						if (((Class409) this).anIntArrayArray4895 != null && null != (((Class409) this).anIntArrayArray4895[i_21_]))
							class157s[i_21_].method2712((((Class409) this).anIntArrayArray4895[i_21_][0]), (((Class409) this).anIntArrayArray4895[i_21_][1]), (((Class409) this).anIntArrayArray4895[i_21_][2]));
					}
				}
			}
			if (class227 != null && class227.anIntArrayArray2802 != null) {
				for (int i_22_ = 0; i_22_ < class227.anIntArrayArray2802.length; i_22_++) {
					if (i_22_ < class157s.length && null != class157s[i_22_]) {
						int i_23_ = 0;
						int i_24_ = 0;
						int i_25_ = 0;
						int i_26_ = 0;
						int i_27_ = 0;
						int i_28_ = 0;
						if (null != class227.anIntArrayArray2802[i_22_]) {
							i_23_ = class227.anIntArrayArray2802[i_22_][0];
							i_24_ = class227.anIntArrayArray2802[i_22_][1];
							i_25_ = class227.anIntArrayArray2802[i_22_][2];
							i_26_ = class227.anIntArrayArray2802[i_22_][3] << 3;
							i_27_ = class227.anIntArrayArray2802[i_22_][4] << 3;
							i_28_ = class227.anIntArrayArray2802[i_22_][5] << 3;
						}
						if (0 != i_26_ || 0 != i_27_ || i_28_ != 0)
							class157s[i_22_].method2671(i_26_, i_27_, i_28_);
						if (i_23_ != 0 || 0 != i_24_ || i_25_ != 0)
							class157s[i_22_].method2712(i_23_, i_24_, i_25_);
					}
				}
			}
			Class157 class157;
			if (class157s.length == 1)
				class157 = class157s[0];
			else
				class157 = new Class157(class157s, class157s.length);
			class528 = (class505.method8451(class157, i_17_, (((Class406) ((Class409) this).aClass406_4855).anInt4845 * 1391585069), 64 + ((Class409) this).anInt4885 * 426609083, 850 + 2107558229 * ((Class409) this).anInt4888));
			if (null != ((Class409) this).aShortArray4863) {
				short[] is_29_;
				if (null != class417 && class417.aShortArray4990 != null)
					is_29_ = class417.aShortArray4990;
				else
					is_29_ = aShortArray4892;
				for (int i_30_ = 0; i_30_ < ((Class409) this).aShortArray4863.length; i_30_++) {
					if (null != ((Class409) this).aByteArray4865 && i_30_ < ((Class409) this).aByteArray4865.length)
						class528.X(((Class409) this).aShortArray4863[i_30_], (aShortArray4862[(((Class409) this).aByteArray4865[i_30_] & 0xff)]));
					else
						class528.X(((Class409) this).aShortArray4863[i_30_], is_29_[i_30_]);
				}
			}
			if (((Class409) this).aShortArray4866 != null) {
				short[] is_31_;
				if (null != class417 && null != class417.aShortArray4991)
					is_31_ = class417.aShortArray4991;
				else
					is_31_ = aShortArray4867;
				for (int i_32_ = 0; i_32_ < ((Class409) this).aShortArray4866.length; i_32_++)
					class528.W(((Class409) this).aShortArray4866[i_32_], is_31_[i_32_]);
			}
			if (0 != ((Class409) this).aByte4871)
				class528.PA(((Class409) this).aByte4868, ((Class409) this).aByte4869, ((Class409) this).aByte4905, ((Class409) this).aByte4871 & 0xff);
			class528.KA(i_13_);
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass229_4836) {
				((Class406) ((Class409) this).aClass406_4855).aClass229_4836.method3856(class528, l);
			}
		}
		Class528 class528_33_ = class528.method11289((byte) 4, i_13_, true);
		boolean bool_34_ = false;
		if (null != is) {
			for (int i_35_ = 0; i_35_ < 12; i_35_++) {
				if (-1 != is[i_35_])
					bool_34_ = true;
			}
		}
		if (!bool_14_ && !bool_34_)
			return class528_33_;
		Class294[] class294s = null;
		if (class227 != null)
			class294s = class227.method3811((byte) 81);
		if (bool_34_ && null != class294s) {
			for (int i_36_ = 0; i_36_ < 12; i_36_++) {
				if (class294s[i_36_] != null)
					class528_33_.method11298(class294s[i_36_], 1 << i_36_, true);
			}
		}
		int i_37_ = 0;
		int i_38_ = 1;
		while (i_37_ < i_15_) {
			if (class456s[i_37_] != null)
				class456s[i_37_].method7578(class528_33_, 0, i_38_, 1091009708);
			i_37_++;
			i_38_ <<= 1;
		}
		if (bool_34_) {
			for (i_37_ = 0; i_37_ < 12; i_37_++) {
				if (is[i_37_] != -1) {
					i_38_ = is[i_37_] - i_9_;
					i_38_ &= 0x3fff;
					Class294 class294 = new Class294();
					class294.method5217(0.0F, 1.0F, 0.0F, Class382.method6508(i_38_));
					class528_33_.method11298(class294, 1 << i_37_, false);
				}
			}
		}
		if (bool_34_ && null != class294s) {
			for (i_37_ = 0; i_37_ < 12; i_37_++) {
				if (null != class294s[i_37_])
					class528_33_.method11298(class294s[i_37_], 1 << i_37_, false);
			}
		}
		if (null != class456 && null != class456_8_)
			Class521_Sub1_Sub3_Sub1.method16078(class528_33_, class456, class456_8_, 407704915);
		else if (null != class456)
			class456.method7577(class528_33_, 0, 16711935);
		else if (class456_8_ != null)
			class456_8_.method7577(class528_33_, 0, 16711935);
		if (-961031919 * ((Class409) this).anInt4880 != 128 || 128 != -34693077 * ((Class409) this).anInt4881)
			class528_33_.oa(-961031919 * ((Class409) this).anInt4880, ((Class409) this).anInt4881 * -34693077, -961031919 * ((Class409) this).anInt4880);
		class528_33_.KA(i);
		return class528_33_;
	}

	public final Class528 method6880(Class505 class505, int i, Interface42 interface42, Class456 class456, Class417 class417, int i_39_) {
		if (null != anIntArray4886) {
			Class409 class409_40_ = method6884(interface42, 265881693);
			if (null == class409_40_)
				return null;
			return class409_40_.method6880(class505, i, interface42, class456, class417, 1382303105);
		}
		if (anIntArray4860 == null && (class417 == null || class417.anIntArray4992 == null))
			return null;
		int i_41_ = i;
		if (class456 != null)
			i_41_ |= class456.method7640(-1724515671);
		long l = (long) (-1524615769 * anInt4856 | class505.anInt5840 * -413843045 << 16);
		if (class417 != null)
			l |= -3839876830849846037L * class417.aLong4993 << 24;
		Class528 class528;
		synchronized (((Class406) ((Class409) this).aClass406_4855).aClass229_4843) {
			class528 = (Class528) ((Class406) ((Class409) this).aClass406_4855).aClass229_4843.method3865(l);
		}
		if (null == class528 || (class528.m() & i_41_) != i_41_) {
			if (null != class528)
				i_41_ |= class528.m();
			int i_42_ = i_41_;
			if (((Class409) this).aShortArray4863 != null)
				i_42_ |= 0x4000;
			if (((Class409) this).aShortArray4866 != null)
				i_42_ |= 0x8000;
			if (((Class409) this).aByte4871 != 0)
				i_42_ |= 0x80000;
			int[] is = (class417 != null && class417.anIntArray4992 != null ? class417.anIntArray4992 : anIntArray4860);
			boolean bool = false;
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass317_4842) {
				for (int i_43_ = 0; i_43_ < is.length; i_43_++) {
					if (!((Class406) ((Class409) this).aClass406_4855).aClass317_4842.method5688(is[i_43_], 0, 16711935))
						bool = true;
				}
			}
			if (bool)
				return null;
			Class157[] class157s = new Class157[is.length];
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass317_4842) {
				for (int i_44_ = 0; i_44_ < is.length; i_44_++)
					class157s[i_44_] = Class157.method2689((((Class406) (((Class409) this).aClass406_4855)).aClass317_4842), is[i_44_], 0);
			}
			for (int i_45_ = 0; i_45_ < is.length; i_45_++) {
				if (null != class157s[i_45_] && class157s[i_45_].anInt1986 < 13)
					class157s[i_45_].method2679(2);
			}
			Class157 class157;
			if (1 == class157s.length)
				class157 = class157s[0];
			else
				class157 = new Class157(class157s, class157s.length);
			class528 = class505.method8451(class157, i_42_, (((Class406) ((Class409) this).aClass406_4855).anInt4845) * 1391585069, 64, 768);
			if (((Class409) this).aShortArray4863 != null) {
				short[] is_46_;
				if (class417 != null && null != class417.aShortArray4990)
					is_46_ = class417.aShortArray4990;
				else
					is_46_ = aShortArray4892;
				for (int i_47_ = 0; i_47_ < ((Class409) this).aShortArray4863.length; i_47_++) {
					if (((Class409) this).aByteArray4865 != null && i_47_ < ((Class409) this).aByteArray4865.length)
						class528.X(((Class409) this).aShortArray4863[i_47_], (aShortArray4862[(((Class409) this).aByteArray4865[i_47_] & 0xff)]));
					else
						class528.X(((Class409) this).aShortArray4863[i_47_], is_46_[i_47_]);
				}
			}
			if (null != ((Class409) this).aShortArray4866) {
				short[] is_48_;
				if (null != class417 && null != class417.aShortArray4991)
					is_48_ = class417.aShortArray4991;
				else
					is_48_ = aShortArray4867;
				for (int i_49_ = 0; i_49_ < ((Class409) this).aShortArray4866.length; i_49_++)
					class528.W(((Class409) this).aShortArray4866[i_49_], is_48_[i_49_]);
			}
			if (((Class409) this).aByte4871 != 0)
				class528.PA(((Class409) this).aByte4868, ((Class409) this).aByte4869, ((Class409) this).aByte4905, ((Class409) this).aByte4871 & 0xff);
			class528.KA(i_41_);
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass229_4843) {
				((Class406) ((Class409) this).aClass406_4855).aClass229_4843.method3856(class528, l);
			}
		}
		if (null != class456) {
			class528 = class528.method11289((byte) 1, i_41_, true);
			class456.method7577(class528, 0, 16711935);
		}
		class528.KA(i);
		return class528;
	}

	public final boolean method6881(int i) {
		if (null == anIntArray4859)
			return true;
		boolean bool = true;
		int[] is = anIntArray4859;
		for (int i_50_ = 0; i_50_ < is.length; i_50_++) {
			int i_51_ = is[i_50_];
			if (!((Class406) ((Class409) this).aClass406_4855).aClass317_4842.method5688(i_51_, 0, 16711935))
				bool = false;
		}
		return bool;
	}

	public String method6882(int i, String string, int i_52_) {
		if (null == ((Class409) this).aClass465_4896)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class409) this).aClass465_4896.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public final boolean method6883() {
		if (null == anIntArray4859)
			return true;
		boolean bool = true;
		int[] is = anIntArray4859;
		for (int i = 0; i < is.length; i++) {
			int i_53_ = is[i];
			if (!((Class406) ((Class409) this).aClass406_4855).aClass317_4842.method5688(i_53_, 0, 16711935))
				bool = false;
		}
		return bool;
	}

	public final Class409 method6884(Interface42 interface42, int i) {
		int i_54_ = -1;
		if (((Class409) this).anInt4891 * -810512173 != -1)
			i_54_ = interface42.method241((-810512173 * ((Class409) this).anInt4891), -578283448);
		else if (-1 != 786850099 * ((Class409) this).anInt4878)
			i_54_ = interface42.method240((786850099 * ((Class409) this).anInt4878), 817995491);
		if (i_54_ < 0 || i_54_ >= anIntArray4886.length - 1 || -1 == anIntArray4886[i_54_]) {
			int i_55_ = anIntArray4886[anIntArray4886.length - 1];
			if (-1 != i_55_)
				return ((Class409) this).aClass406_4855.method6828(i_55_, (byte) -44);
			return null;
		}
		return ((Class409) this).aClass406_4855.method6828(anIntArray4886[i_54_], (byte) 43);
	}

	public boolean method6885(Interface42 interface42, byte i) {
		if (null == anIntArray4886)
			return true;
		int i_56_ = -1;
		if (-1 != ((Class409) this).anInt4891 * -810512173)
			i_56_ = interface42.method241((-810512173 * ((Class409) this).anInt4891), -2139197647);
		else if (786850099 * ((Class409) this).anInt4878 != -1)
			i_56_ = interface42.method240((((Class409) this).anInt4878 * 786850099), -332269014);
		if (i_56_ < 0 || i_56_ >= anIntArray4886.length - 1 || -1 == anIntArray4886[i_56_]) {
			int i_57_ = anIntArray4886[anIntArray4886.length - 1];
			if (-1 != i_57_)
				return true;
			return false;
		}
		return true;
	}

	public boolean method6886(int i) {
		if (null == anIntArray4886)
			return (anInt4903 * -1910117775 != -1 || -1955311273 * anInt4876 != -1 || -1 != -1427347049 * anInt4906);
		for (int i_58_ = 0; i_58_ < anIntArray4886.length; i_58_++) {
			if (anIntArray4886[i_58_] != -1) {
				Class409 class409_59_ = ((Class409) this).aClass406_4855.method6828(anIntArray4886[i_58_], (byte) -70);
				if (class409_59_.anInt4903 * -1910117775 != -1 || -1955311273 * class409_59_.anInt4876 != -1 || -1427347049 * class409_59_.anInt4906 != -1)
					return true;
			}
		}
		return false;
	}

	void method6887(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			int i_60_ = class282_sub35.readUnsignedByte();
			anIntArray4859 = new int[i_60_];
			for (int i_61_ = 0; i_61_ < i_60_; i_61_++)
				anIntArray4859[i_61_] = class282_sub35.readBigSmart(2015294266);
		} else if (i == 2)
			aString4857 = class282_sub35.readString(696474567);
		else if (i == 12)
			anInt4858 = class282_sub35.readUnsignedByte() * -1156523463;
		else if (i >= 30 && i < 35)
			aStringArray4882[i - 30] = class282_sub35.readString(1886780879);
		else if (40 == i) {
			int i_62_ = class282_sub35.readUnsignedByte();
			((Class409) this).aShortArray4863 = new short[i_62_];
			aShortArray4892 = new short[i_62_];
			for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
				((Class409) this).aShortArray4863[i_63_] = (short) class282_sub35.readUnsignedShort();
				aShortArray4892[i_63_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_64_ = class282_sub35.readUnsignedByte();
			((Class409) this).aShortArray4866 = new short[i_64_];
			aShortArray4867 = new short[i_64_];
			for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
				((Class409) this).aShortArray4866[i_65_] = (short) class282_sub35.readUnsignedShort();
				aShortArray4867[i_65_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_66_ = class282_sub35.readUnsignedByte();
			((Class409) this).aByteArray4865 = new byte[i_66_];
			for (int i_67_ = 0; i_67_ < i_66_; i_67_++)
				((Class409) this).aByteArray4865[i_67_] = class282_sub35.readByte((short) -27422);
		} else if (60 == i) {
			int i_68_ = class282_sub35.readUnsignedByte();
			anIntArray4860 = new int[i_68_];
			for (int i_69_ = 0; i_69_ < i_68_; i_69_++)
				anIntArray4860[i_69_] = class282_sub35.readBigSmart(1942201279);
		} else if (i == 93)
			aBool4864 = false;
		else if (i == 95)
			anInt4879 = class282_sub35.readUnsignedShort() * -518962747;
		else if (97 == i)
			((Class409) this).anInt4880 = class282_sub35.readUnsignedShort() * -395231247;
		else if (i == 98)
			((Class409) this).anInt4881 = class282_sub35.readUnsignedShort() * -102949245;
		else if (i == 99)
			aBool4904 = true;
		else if (i == 100)
			((Class409) this).anInt4885 = class282_sub35.readByte((short) -9445) * -2106403981;
		else if (i == 101)
			((Class409) this).anInt4888 = class282_sub35.readByte((short) -18319) * -618226703;
		else if (102 == i)
			anInt4887 = class282_sub35.readUnsignedShort() * -655354985;
		else if (i == 103)
			anInt4889 = class282_sub35.readUnsignedShort() * -516063969;
		else if (i == 106 || i == 118) {
			((Class409) this).anInt4891 = class282_sub35.readUnsignedShort() * -2140780709;
			if (65535 == ((Class409) this).anInt4891 * -810512173)
				((Class409) this).anInt4891 = 2140780709;
			((Class409) this).anInt4878 = class282_sub35.readUnsignedShort() * -1504935429;
			if (65535 == ((Class409) this).anInt4878 * 786850099)
				((Class409) this).anInt4878 = 1504935429;
			int i_70_ = -1;
			if (i == 118) {
				i_70_ = class282_sub35.readUnsignedShort();
				if (i_70_ == 65535)
					i_70_ = -1;
			}
			int i_71_ = class282_sub35.readUnsignedByte();
			anIntArray4886 = new int[2 + i_71_];
			for (int i_72_ = 0; i_72_ <= i_71_; i_72_++) {
				anIntArray4886[i_72_] = class282_sub35.readUnsignedShort();
				if (anIntArray4886[i_72_] == 65535)
					anIntArray4886[i_72_] = -1;
			}
			anIntArray4886[i_71_ + 1] = i_70_;
		} else if (107 == i)
			aBool4893 = false;
		else if (109 == i)
			aBool4894 = false;
		else if (i == 111)
			aBool4912 = false;
		else if (i == 113) {
			aShort4874 = (short) class282_sub35.readUnsignedShort();
			aShort4897 = (short) class282_sub35.readUnsignedShort();
		} else if (114 == i) {
			aByte4883 = class282_sub35.readByte((short) -31423);
			aByte4899 = class282_sub35.readByte((short) -3909);
		} else if (i == 119)
			aByte4900 = class282_sub35.readByte((short) -20710);
		else if (121 == i) {
			((Class409) this).anIntArrayArray4895 = new int[anIntArray4859.length][];
			int i_73_ = class282_sub35.readUnsignedByte();
			for (int i_74_ = 0; i_74_ < i_73_; i_74_++) {
				int i_75_ = class282_sub35.readUnsignedByte();
				int[] is = (((Class409) this).anIntArrayArray4895[i_75_] = new int[3]);
				is[0] = class282_sub35.readByte((short) -29267);
				is[1] = class282_sub35.readByte((short) -32279);
				is[2] = class282_sub35.readByte((short) -11124);
			}
		} else if (123 == i)
			anInt4902 = class282_sub35.readUnsignedShort() * -1013929977;
		else if (i == 125)
			aClass252_4910 = ((Class252) Class386.method6672(Class46.method931(1096077250), class282_sub35.readByte((short) -22403), -1343042747));
		else if (i == 127)
			anInt4898 = class282_sub35.readUnsignedShort() * -318852007;
		else if (i == 128)
			Class386.method6672(Class8_Sub3.method14339(1773900936), class282_sub35.readUnsignedByte(), -1445960295);
		else if (i == 134) {
			anInt4903 = class282_sub35.readUnsignedShort() * -1683450223;
			if (-1910117775 * anInt4903 == 65535)
				anInt4903 = 1683450223;
			anInt4921 = class282_sub35.readUnsignedShort() * -1949889189;
			if (65535 == anInt4921 * 1863998163)
				anInt4921 = 1949889189;
			anInt4876 = class282_sub35.readUnsignedShort() * 673000039;
			if (65535 == -1955311273 * anInt4876)
				anInt4876 = -673000039;
			anInt4906 = class282_sub35.readUnsignedShort() * 1797039655;
			if (anInt4906 * -1427347049 == 65535)
				anInt4906 = -1797039655;
			anInt4907 = class282_sub35.readUnsignedByte() * -1487095799;
		} else if (135 == i) {
			anInt4875 = class282_sub35.readUnsignedByte() * -501657497;
			anInt4873 = class282_sub35.readUnsignedShort() * 105756369;
		} else if (i == 136) {
			anInt4854 = class282_sub35.readUnsignedByte() * 830148041;
			anInt4861 = class282_sub35.readUnsignedShort() * -1021968649;
		} else if (i == 137)
			anInt4877 = class282_sub35.readUnsignedShort() * 1953007503;
		else if (i == 138)
			anInt4918 = class282_sub35.readBigSmart(1999787051) * 1094135957;
		else if (140 == i)
			anInt4909 = class282_sub35.readUnsignedByte() * -1523364637;
		else if (i == 141)
			aBool4884 = true;
		else if (i == 142)
			anInt4914 = class282_sub35.readUnsignedShort() * 1420766747;
		else if (143 == i)
			aBool4890 = true;
		else if (i >= 150 && i < 155) {
			aStringArray4882[i - 150] = class282_sub35.readString(15070428);
			if (!((Class406) ((Class409) this).aClass406_4855).aBool4838)
				aStringArray4882[i - 150] = null;
		} else if (155 == i) {
			((Class409) this).aByte4868 = class282_sub35.readByte((short) -28344);
			((Class409) this).aByte4869 = class282_sub35.readByte((short) -18620);
			((Class409) this).aByte4905 = class282_sub35.readByte((short) -16336);
			((Class409) this).aByte4871 = class282_sub35.readByte((short) -1898);
		} else if (i == 158)
			aByte4916 = (byte) 1;
		else if (159 == i)
			aByte4916 = (byte) 0;
		else if (i == 160) {
			int i_76_ = class282_sub35.readUnsignedByte();
			anIntArray4915 = new int[i_76_];
			for (int i_77_ = 0; i_77_ < i_76_; i_77_++)
				anIntArray4915[i_77_] = class282_sub35.readUnsignedShort();
		} else if (i == 162)
			aBool4872 = true;
		else if (i == 163)
			anInt4917 = class282_sub35.readUnsignedByte() * -832596403;
		else if (164 == i) {
			anInt4911 = class282_sub35.readUnsignedShort() * 1237298269;
			anInt4919 = class282_sub35.readUnsignedShort() * 665449705;
		} else if (i == 165)
			anInt4913 = class282_sub35.readUnsignedByte() * 1057419233;
		else if (i == 168)
			anInt4908 = class282_sub35.readUnsignedByte() * -967519343;
		else if (i == 169)
			aBool4920 = false;
		else if (249 == i) {
			int i_78_ = class282_sub35.readUnsignedByte();
			if (null == ((Class409) this).aClass465_4896) {
				int i_79_ = Class323.method5778(i_78_, 1161720703);
				((Class409) this).aClass465_4896 = new Class465(i_79_);
			}
			for (int i_80_ = 0; i_80_ < i_78_; i_80_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_81_ = class282_sub35.read24BitUnsignedInteger((short) 15601);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(8708310));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class409) this).aClass465_4896.method7765(class282, (long) i_81_);
			}
		}
	}

	public boolean method6888() {
		if (null == anIntArray4886)
			return (anInt4903 * -1910117775 != -1 || -1955311273 * anInt4876 != -1 || -1 != -1427347049 * anInt4906);
		for (int i = 0; i < anIntArray4886.length; i++) {
			if (anIntArray4886[i] != -1) {
				Class409 class409_82_ = ((Class409) this).aClass406_4855.method6828(anIntArray4886[i], (byte) -76);
				if (class409_82_.anInt4903 * -1910117775 != -1 || -1955311273 * class409_82_.anInt4876 != -1 || -1427347049 * class409_82_.anInt4906 != -1)
					return true;
			}
		}
		return false;
	}

	void method6889() {
		if (anIntArray4859 == null)
			anIntArray4859 = new int[0];
		if (aByte4916 == -1) {
			if (Class486.aClass486_5744 == (((Class406) ((Class409) this).aClass406_4855).aClass486_4844))
				aByte4916 = (byte) 1;
			else
				aByte4916 = (byte) 0;
		}
	}

	public final Class528 method6890(Class505 class505, int i, Class211 class211, Interface42 interface42, Class456 class456, Class456 class456_83_, Class456[] class456s, int[] is, int i_84_, Class417 class417) {
		return method6879(class505, i, class211, interface42, class456, class456_83_, class456s, is, i_84_, class417, -490908695 * anInt4898, true, 2091382151);
	}

	Class409() {
		((Class409) this).aByte4871 = (byte) 0;
		anInt4873 = -105756369;
		anInt4861 = 1021968649;
		anInt4875 = 501657497;
		anInt4854 = -830148041;
		anInt4877 = -1953007503;
		aBool4864 = true;
		anInt4879 = 518962747;
		((Class409) this).anInt4880 = 950007936;
		((Class409) this).anInt4881 = -292601472;
		aBool4904 = false;
		aBool4890 = false;
		aBool4884 = false;
		((Class409) this).anInt4885 = 0;
		((Class409) this).anInt4888 = 0;
		anInt4887 = 655354985;
		anInt4918 = -1094135957;
		anInt4889 = 665822176;
		((Class409) this).anInt4891 = 2140780709;
		((Class409) this).anInt4878 = 1504935429;
		aBool4893 = true;
		aBool4894 = true;
		aBool4912 = true;
		aShort4874 = (short) 0;
		aShort4897 = (short) 0;
		aByte4883 = (byte) -96;
		aByte4899 = (byte) -16;
		aByte4900 = (byte) 0;
		anInt4903 = 1683450223;
		anInt4921 = 1949889189;
		anInt4876 = -673000039;
		anInt4906 = -1797039655;
		anInt4907 = 0;
		anInt4908 = 0;
		anInt4909 = -1910925795;
		anInt4902 = 1013929977;
		aClass252_4910 = Class252.aClass252_3108;
		anInt4914 = -1420766747;
		aByte4916 = (byte) -1;
		anInt4917 = 832596403;
		anInt4911 = -1079223040;
		anInt4919 = -1443567360;
		anInt4913 = 0;
		aBool4920 = true;
	}

	void method6891(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			int i_85_ = class282_sub35.readUnsignedByte();
			anIntArray4859 = new int[i_85_];
			for (int i_86_ = 0; i_86_ < i_85_; i_86_++)
				anIntArray4859[i_86_] = class282_sub35.readBigSmart(1957100622);
		} else if (i == 2)
			aString4857 = class282_sub35.readString(25235133);
		else if (i == 12)
			anInt4858 = class282_sub35.readUnsignedByte() * -1156523463;
		else if (i >= 30 && i < 35)
			aStringArray4882[i - 30] = class282_sub35.readString(-688333229);
		else if (40 == i) {
			int i_87_ = class282_sub35.readUnsignedByte();
			((Class409) this).aShortArray4863 = new short[i_87_];
			aShortArray4892 = new short[i_87_];
			for (int i_88_ = 0; i_88_ < i_87_; i_88_++) {
				((Class409) this).aShortArray4863[i_88_] = (short) class282_sub35.readUnsignedShort();
				aShortArray4892[i_88_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_89_ = class282_sub35.readUnsignedByte();
			((Class409) this).aShortArray4866 = new short[i_89_];
			aShortArray4867 = new short[i_89_];
			for (int i_90_ = 0; i_90_ < i_89_; i_90_++) {
				((Class409) this).aShortArray4866[i_90_] = (short) class282_sub35.readUnsignedShort();
				aShortArray4867[i_90_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_91_ = class282_sub35.readUnsignedByte();
			((Class409) this).aByteArray4865 = new byte[i_91_];
			for (int i_92_ = 0; i_92_ < i_91_; i_92_++)
				((Class409) this).aByteArray4865[i_92_] = class282_sub35.readByte((short) -26438);
		} else if (60 == i) {
			int i_93_ = class282_sub35.readUnsignedByte();
			anIntArray4860 = new int[i_93_];
			for (int i_94_ = 0; i_94_ < i_93_; i_94_++)
				anIntArray4860[i_94_] = class282_sub35.readBigSmart(1953877147);
		} else if (i == 93)
			aBool4864 = false;
		else if (i == 95)
			anInt4879 = class282_sub35.readUnsignedShort() * -518962747;
		else if (97 == i)
			((Class409) this).anInt4880 = class282_sub35.readUnsignedShort() * -395231247;
		else if (i == 98)
			((Class409) this).anInt4881 = class282_sub35.readUnsignedShort() * -102949245;
		else if (i == 99)
			aBool4904 = true;
		else if (i == 100)
			((Class409) this).anInt4885 = class282_sub35.readByte((short) -17903) * -2106403981;
		else if (i == 101)
			((Class409) this).anInt4888 = class282_sub35.readByte((short) -15779) * -618226703;
		else if (102 == i)
			anInt4887 = class282_sub35.readUnsignedShort() * -655354985;
		else if (i == 103)
			anInt4889 = class282_sub35.readUnsignedShort() * -516063969;
		else if (i == 106 || i == 118) {
			((Class409) this).anInt4891 = class282_sub35.readUnsignedShort() * -2140780709;
			if (65535 == ((Class409) this).anInt4891 * -810512173)
				((Class409) this).anInt4891 = 2140780709;
			((Class409) this).anInt4878 = class282_sub35.readUnsignedShort() * -1504935429;
			if (65535 == ((Class409) this).anInt4878 * 786850099)
				((Class409) this).anInt4878 = 1504935429;
			int i_95_ = -1;
			if (i == 118) {
				i_95_ = class282_sub35.readUnsignedShort();
				if (i_95_ == 65535)
					i_95_ = -1;
			}
			int i_96_ = class282_sub35.readUnsignedByte();
			anIntArray4886 = new int[2 + i_96_];
			for (int i_97_ = 0; i_97_ <= i_96_; i_97_++) {
				anIntArray4886[i_97_] = class282_sub35.readUnsignedShort();
				if (anIntArray4886[i_97_] == 65535)
					anIntArray4886[i_97_] = -1;
			}
			anIntArray4886[i_96_ + 1] = i_95_;
		} else if (107 == i)
			aBool4893 = false;
		else if (109 == i)
			aBool4894 = false;
		else if (i == 111)
			aBool4912 = false;
		else if (i == 113) {
			aShort4874 = (short) class282_sub35.readUnsignedShort();
			aShort4897 = (short) class282_sub35.readUnsignedShort();
		} else if (114 == i) {
			aByte4883 = class282_sub35.readByte((short) 208);
			aByte4899 = class282_sub35.readByte((short) -8328);
		} else if (i == 119)
			aByte4900 = class282_sub35.readByte((short) -3895);
		else if (121 == i) {
			((Class409) this).anIntArrayArray4895 = new int[anIntArray4859.length][];
			int i_98_ = class282_sub35.readUnsignedByte();
			for (int i_99_ = 0; i_99_ < i_98_; i_99_++) {
				int i_100_ = class282_sub35.readUnsignedByte();
				int[] is = (((Class409) this).anIntArrayArray4895[i_100_] = new int[3]);
				is[0] = class282_sub35.readByte((short) -22428);
				is[1] = class282_sub35.readByte((short) -20997);
				is[2] = class282_sub35.readByte((short) -17619);
			}
		} else if (123 == i)
			anInt4902 = class282_sub35.readUnsignedShort() * -1013929977;
		else if (i == 125)
			aClass252_4910 = ((Class252) Class386.method6672(Class46.method931(168537997), class282_sub35.readByte((short) -716), -1066151030));
		else if (i == 127)
			anInt4898 = class282_sub35.readUnsignedShort() * -318852007;
		else if (i == 128)
			Class386.method6672(Class8_Sub3.method14339(2070300528), class282_sub35.readUnsignedByte(), -999829291);
		else if (i == 134) {
			anInt4903 = class282_sub35.readUnsignedShort() * -1683450223;
			if (-1910117775 * anInt4903 == 65535)
				anInt4903 = 1683450223;
			anInt4921 = class282_sub35.readUnsignedShort() * -1949889189;
			if (65535 == anInt4921 * 1863998163)
				anInt4921 = 1949889189;
			anInt4876 = class282_sub35.readUnsignedShort() * 673000039;
			if (65535 == -1955311273 * anInt4876)
				anInt4876 = -673000039;
			anInt4906 = class282_sub35.readUnsignedShort() * 1797039655;
			if (anInt4906 * -1427347049 == 65535)
				anInt4906 = -1797039655;
			anInt4907 = class282_sub35.readUnsignedByte() * -1487095799;
		} else if (135 == i) {
			anInt4875 = class282_sub35.readUnsignedByte() * -501657497;
			anInt4873 = class282_sub35.readUnsignedShort() * 105756369;
		} else if (i == 136) {
			anInt4854 = class282_sub35.readUnsignedByte() * 830148041;
			anInt4861 = class282_sub35.readUnsignedShort() * -1021968649;
		} else if (i == 137)
			anInt4877 = class282_sub35.readUnsignedShort() * 1953007503;
		else if (i == 138)
			anInt4918 = class282_sub35.readBigSmart(2103322509) * 1094135957;
		else if (140 == i)
			anInt4909 = class282_sub35.readUnsignedByte() * -1523364637;
		else if (i == 141)
			aBool4884 = true;
		else if (i == 142)
			anInt4914 = class282_sub35.readUnsignedShort() * 1420766747;
		else if (143 == i)
			aBool4890 = true;
		else if (i >= 150 && i < 155) {
			aStringArray4882[i - 150] = class282_sub35.readString(260997528);
			if (!((Class406) ((Class409) this).aClass406_4855).aBool4838)
				aStringArray4882[i - 150] = null;
		} else if (155 == i) {
			((Class409) this).aByte4868 = class282_sub35.readByte((short) -9428);
			((Class409) this).aByte4869 = class282_sub35.readByte((short) -29267);
			((Class409) this).aByte4905 = class282_sub35.readByte((short) -21564);
			((Class409) this).aByte4871 = class282_sub35.readByte((short) -9340);
		} else if (i == 158)
			aByte4916 = (byte) 1;
		else if (159 == i)
			aByte4916 = (byte) 0;
		else if (i == 160) {
			int i_101_ = class282_sub35.readUnsignedByte();
			anIntArray4915 = new int[i_101_];
			for (int i_102_ = 0; i_102_ < i_101_; i_102_++)
				anIntArray4915[i_102_] = class282_sub35.readUnsignedShort();
		} else if (i == 162)
			aBool4872 = true;
		else if (i == 163)
			anInt4917 = class282_sub35.readUnsignedByte() * -832596403;
		else if (164 == i) {
			anInt4911 = class282_sub35.readUnsignedShort() * 1237298269;
			anInt4919 = class282_sub35.readUnsignedShort() * 665449705;
		} else if (i == 165)
			anInt4913 = class282_sub35.readUnsignedByte() * 1057419233;
		else if (i == 168)
			anInt4908 = class282_sub35.readUnsignedByte() * -967519343;
		else if (i == 169)
			aBool4920 = false;
		else if (249 == i) {
			int i_103_ = class282_sub35.readUnsignedByte();
			if (null == ((Class409) this).aClass465_4896) {
				int i_104_ = Class323.method5778(i_103_, -671087577);
				((Class409) this).aClass465_4896 = new Class465(i_104_);
			}
			for (int i_105_ = 0; i_105_ < i_103_; i_105_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_106_ = class282_sub35.read24BitUnsignedInteger((short) 30767);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(1052941301));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class409) this).aClass465_4896.method7765(class282, (long) i_106_);
			}
		}
	}

	public final Class528 method6892(Class505 class505, int i, Class211 class211, Interface42 interface42, Class456 class456, Class456 class456_107_, Class456[] class456s, int[] is, int i_108_, Class417 class417) {
		return method6879(class505, i, class211, interface42, class456, class456_107_, class456s, is, i_108_, class417, -490908695 * anInt4898, true, -2145578601);
	}

	public final Class528 method6893(Class505 class505, int i, Class211 class211, Interface42 interface42, Class456 class456, Class456 class456_109_, Class456[] class456s, int[] is, int i_110_, Class417 class417, int i_111_, boolean bool) {
		if (anIntArray4886 != null) {
			Class409 class409_112_ = method6884(interface42, 265881693);
			if (null == class409_112_)
				return null;
			return class409_112_.method6879(class505, i, class211, interface42, class456, class456_109_, class456s, is, i_110_, class417, i_111_, bool, 162463161);
		}
		int i_113_ = i;
		if (((Class409) this).anInt4881 * -34693077 != 128)
			i_113_ |= 0x2;
		if (128 != ((Class409) this).anInt4880 * -961031919)
			i_113_ |= 0x5;
		boolean bool_114_ = false;
		int i_115_ = null != class456s ? class456s.length : 0;
		for (int i_116_ = 0; i_116_ < i_115_; i_116_++) {
			if (class456s[i_116_] != null) {
				i_113_ |= class456s[i_116_].method7640(-1487602156);
				bool_114_ = true;
			}
		}
		if (class456 != null) {
			i_113_ |= class456.method7640(-1575638692);
			bool_114_ = true;
		}
		if (null != class456_109_) {
			i_113_ |= class456_109_.method7640(-1053515861);
			bool_114_ = true;
		}
		long l = (long) (anInt4856 * -1524615769 | class505.anInt5840 * -413843045 << 16);
		if (null != class417)
			l |= class417.aLong4993 * -3839876830849846037L << 24;
		Class528 class528;
		synchronized (((Class406) ((Class409) this).aClass406_4855).aClass229_4836) {
			class528 = (Class528) ((Class406) ((Class409) this).aClass406_4855).aClass229_4836.method3865(l);
		}
		Class227 class227 = null;
		if (!bool && -1 != i_111_)
			class227 = class211.method3616(i_111_, (byte) 112);
		else if (-1 != -490908695 * anInt4898)
			class227 = class211.method3616(anInt4898 * -490908695, (byte) 48);
		if (class528 == null || (class528.m() & i_113_) != i_113_) {
			if (class528 != null)
				i_113_ |= class528.m();
			int i_117_ = i_113_;
			if (null != ((Class409) this).aShortArray4863)
				i_117_ |= 0x4000;
			if (((Class409) this).aShortArray4866 != null)
				i_117_ |= 0x8000;
			if (0 != ((Class409) this).aByte4871)
				i_117_ |= 0x80000;
			int[] is_118_ = (null != class417 && null != class417.anIntArray4992 ? class417.anIntArray4992 : anIntArray4859);
			boolean bool_119_ = false;
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass317_4842) {
				for (int i_120_ = 0; i_120_ < is_118_.length; i_120_++) {
					if (-1 != is_118_[i_120_] && !((Class406) ((Class409) this).aClass406_4855).aClass317_4842.method5688(is_118_[i_120_], 0, 16711935))
						bool_119_ = true;
				}
			}
			if (bool_119_)
				return null;
			Class157[] class157s = new Class157[is_118_.length];
			for (int i_121_ = 0; i_121_ < is_118_.length; i_121_++) {
				if (is_118_[i_121_] != -1) {
					synchronized (((Class406) ((Class409) this).aClass406_4855).aClass317_4842) {
						class157s[i_121_] = Class157.method2689((((Class406) (((Class409) this).aClass406_4855)).aClass317_4842), is_118_[i_121_], 0);
					}
					if (null != class157s[i_121_]) {
						if (class157s[i_121_].anInt1986 < 13)
							class157s[i_121_].method2679(2);
						if (((Class409) this).anIntArrayArray4895 != null && null != (((Class409) this).anIntArrayArray4895[i_121_]))
							class157s[i_121_].method2712((((Class409) this).anIntArrayArray4895[i_121_][0]), (((Class409) this).anIntArrayArray4895[i_121_][1]), (((Class409) this).anIntArrayArray4895[i_121_][2]));
					}
				}
			}
			if (class227 != null && class227.anIntArrayArray2802 != null) {
				for (int i_122_ = 0; i_122_ < class227.anIntArrayArray2802.length; i_122_++) {
					if (i_122_ < class157s.length && null != class157s[i_122_]) {
						int i_123_ = 0;
						int i_124_ = 0;
						int i_125_ = 0;
						int i_126_ = 0;
						int i_127_ = 0;
						int i_128_ = 0;
						if (null != class227.anIntArrayArray2802[i_122_]) {
							i_123_ = class227.anIntArrayArray2802[i_122_][0];
							i_124_ = class227.anIntArrayArray2802[i_122_][1];
							i_125_ = class227.anIntArrayArray2802[i_122_][2];
							i_126_ = class227.anIntArrayArray2802[i_122_][3] << 3;
							i_127_ = class227.anIntArrayArray2802[i_122_][4] << 3;
							i_128_ = class227.anIntArrayArray2802[i_122_][5] << 3;
						}
						if (0 != i_126_ || 0 != i_127_ || i_128_ != 0)
							class157s[i_122_].method2671(i_126_, i_127_, i_128_);
						if (i_123_ != 0 || 0 != i_124_ || i_125_ != 0)
							class157s[i_122_].method2712(i_123_, i_124_, i_125_);
					}
				}
			}
			Class157 class157;
			if (class157s.length == 1)
				class157 = class157s[0];
			else
				class157 = new Class157(class157s, class157s.length);
			class528 = (class505.method8451(class157, i_117_, (((Class406) ((Class409) this).aClass406_4855).anInt4845 * 1391585069), 64 + ((Class409) this).anInt4885 * 426609083, 850 + 2107558229 * ((Class409) this).anInt4888));
			if (null != ((Class409) this).aShortArray4863) {
				short[] is_129_;
				if (null != class417 && class417.aShortArray4990 != null)
					is_129_ = class417.aShortArray4990;
				else
					is_129_ = aShortArray4892;
				for (int i_130_ = 0; i_130_ < ((Class409) this).aShortArray4863.length; i_130_++) {
					if (null != ((Class409) this).aByteArray4865 && i_130_ < ((Class409) this).aByteArray4865.length)
						class528.X(((Class409) this).aShortArray4863[i_130_], (aShortArray4862[(((Class409) this).aByteArray4865[i_130_] & 0xff)]));
					else
						class528.X(((Class409) this).aShortArray4863[i_130_], is_129_[i_130_]);
				}
			}
			if (((Class409) this).aShortArray4866 != null) {
				short[] is_131_;
				if (null != class417 && null != class417.aShortArray4991)
					is_131_ = class417.aShortArray4991;
				else
					is_131_ = aShortArray4867;
				for (int i_132_ = 0; i_132_ < ((Class409) this).aShortArray4866.length; i_132_++)
					class528.W(((Class409) this).aShortArray4866[i_132_], is_131_[i_132_]);
			}
			if (0 != ((Class409) this).aByte4871)
				class528.PA(((Class409) this).aByte4868, ((Class409) this).aByte4869, ((Class409) this).aByte4905, ((Class409) this).aByte4871 & 0xff);
			class528.KA(i_113_);
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass229_4836) {
				((Class406) ((Class409) this).aClass406_4855).aClass229_4836.method3856(class528, l);
			}
		}
		Class528 class528_133_ = class528.method11289((byte) 4, i_113_, true);
		boolean bool_134_ = false;
		if (null != is) {
			for (int i_135_ = 0; i_135_ < 12; i_135_++) {
				if (-1 != is[i_135_])
					bool_134_ = true;
			}
		}
		if (!bool_114_ && !bool_134_)
			return class528_133_;
		Class294[] class294s = null;
		if (class227 != null)
			class294s = class227.method3811((byte) 50);
		if (bool_134_ && null != class294s) {
			for (int i_136_ = 0; i_136_ < 12; i_136_++) {
				if (class294s[i_136_] != null)
					class528_133_.method11298(class294s[i_136_], 1 << i_136_, true);
			}
		}
		int i_137_ = 0;
		int i_138_ = 1;
		while (i_137_ < i_115_) {
			if (class456s[i_137_] != null)
				class456s[i_137_].method7578(class528_133_, 0, i_138_, 2065696435);
			i_137_++;
			i_138_ <<= 1;
		}
		if (bool_134_) {
			for (i_137_ = 0; i_137_ < 12; i_137_++) {
				if (is[i_137_] != -1) {
					i_138_ = is[i_137_] - i_110_;
					i_138_ &= 0x3fff;
					Class294 class294 = new Class294();
					class294.method5217(0.0F, 1.0F, 0.0F, Class382.method6508(i_138_));
					class528_133_.method11298(class294, 1 << i_137_, false);
				}
			}
		}
		if (bool_134_ && null != class294s) {
			for (i_137_ = 0; i_137_ < 12; i_137_++) {
				if (null != class294s[i_137_])
					class528_133_.method11298(class294s[i_137_], 1 << i_137_, false);
			}
		}
		if (null != class456 && null != class456_109_)
			Class521_Sub1_Sub3_Sub1.method16078(class528_133_, class456, class456_109_, -1173437566);
		else if (null != class456)
			class456.method7577(class528_133_, 0, 16711935);
		else if (class456_109_ != null)
			class456_109_.method7577(class528_133_, 0, 16711935);
		if (-961031919 * ((Class409) this).anInt4880 != 128 || 128 != -34693077 * ((Class409) this).anInt4881)
			class528_133_.oa(-961031919 * ((Class409) this).anInt4880, ((Class409) this).anInt4881 * -34693077, -961031919 * ((Class409) this).anInt4880);
		class528_133_.KA(i);
		return class528_133_;
	}

	public final Class528 method6894(Class505 class505, int i, Class211 class211, Interface42 interface42, Class456 class456, Class456 class456_139_, Class456[] class456s, int[] is, int i_140_, Class417 class417, int i_141_, boolean bool) {
		if (anIntArray4886 != null) {
			Class409 class409_142_ = method6884(interface42, 265881693);
			if (null == class409_142_)
				return null;
			return class409_142_.method6879(class505, i, class211, interface42, class456, class456_139_, class456s, is, i_140_, class417, i_141_, bool, -103926895);
		}
		int i_143_ = i;
		if (((Class409) this).anInt4881 * -34693077 != 128)
			i_143_ |= 0x2;
		if (128 != ((Class409) this).anInt4880 * -961031919)
			i_143_ |= 0x5;
		boolean bool_144_ = false;
		int i_145_ = null != class456s ? class456s.length : 0;
		for (int i_146_ = 0; i_146_ < i_145_; i_146_++) {
			if (class456s[i_146_] != null) {
				i_143_ |= class456s[i_146_].method7640(-805544245);
				bool_144_ = true;
			}
		}
		if (class456 != null) {
			i_143_ |= class456.method7640(-804304003);
			bool_144_ = true;
		}
		if (null != class456_139_) {
			i_143_ |= class456_139_.method7640(-1945615388);
			bool_144_ = true;
		}
		long l = (long) (anInt4856 * -1524615769 | class505.anInt5840 * -413843045 << 16);
		if (null != class417)
			l |= class417.aLong4993 * -3839876830849846037L << 24;
		Class528 class528;
		synchronized (((Class406) ((Class409) this).aClass406_4855).aClass229_4836) {
			class528 = (Class528) ((Class406) ((Class409) this).aClass406_4855).aClass229_4836.method3865(l);
		}
		Class227 class227 = null;
		if (!bool && -1 != i_141_)
			class227 = class211.method3616(i_141_, (byte) 9);
		else if (-1 != -490908695 * anInt4898)
			class227 = class211.method3616(anInt4898 * -490908695, (byte) -14);
		if (class528 == null || (class528.m() & i_143_) != i_143_) {
			if (class528 != null)
				i_143_ |= class528.m();
			int i_147_ = i_143_;
			if (null != ((Class409) this).aShortArray4863)
				i_147_ |= 0x4000;
			if (((Class409) this).aShortArray4866 != null)
				i_147_ |= 0x8000;
			if (0 != ((Class409) this).aByte4871)
				i_147_ |= 0x80000;
			int[] is_148_ = (null != class417 && null != class417.anIntArray4992 ? class417.anIntArray4992 : anIntArray4859);
			boolean bool_149_ = false;
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass317_4842) {
				for (int i_150_ = 0; i_150_ < is_148_.length; i_150_++) {
					if (-1 != is_148_[i_150_] && !((Class406) ((Class409) this).aClass406_4855).aClass317_4842.method5688(is_148_[i_150_], 0, 16711935))
						bool_149_ = true;
				}
			}
			if (bool_149_)
				return null;
			Class157[] class157s = new Class157[is_148_.length];
			for (int i_151_ = 0; i_151_ < is_148_.length; i_151_++) {
				if (is_148_[i_151_] != -1) {
					synchronized (((Class406) ((Class409) this).aClass406_4855).aClass317_4842) {
						class157s[i_151_] = Class157.method2689((((Class406) (((Class409) this).aClass406_4855)).aClass317_4842), is_148_[i_151_], 0);
					}
					if (null != class157s[i_151_]) {
						if (class157s[i_151_].anInt1986 < 13)
							class157s[i_151_].method2679(2);
						if (((Class409) this).anIntArrayArray4895 != null && null != (((Class409) this).anIntArrayArray4895[i_151_]))
							class157s[i_151_].method2712((((Class409) this).anIntArrayArray4895[i_151_][0]), (((Class409) this).anIntArrayArray4895[i_151_][1]), (((Class409) this).anIntArrayArray4895[i_151_][2]));
					}
				}
			}
			if (class227 != null && class227.anIntArrayArray2802 != null) {
				for (int i_152_ = 0; i_152_ < class227.anIntArrayArray2802.length; i_152_++) {
					if (i_152_ < class157s.length && null != class157s[i_152_]) {
						int i_153_ = 0;
						int i_154_ = 0;
						int i_155_ = 0;
						int i_156_ = 0;
						int i_157_ = 0;
						int i_158_ = 0;
						if (null != class227.anIntArrayArray2802[i_152_]) {
							i_153_ = class227.anIntArrayArray2802[i_152_][0];
							i_154_ = class227.anIntArrayArray2802[i_152_][1];
							i_155_ = class227.anIntArrayArray2802[i_152_][2];
							i_156_ = class227.anIntArrayArray2802[i_152_][3] << 3;
							i_157_ = class227.anIntArrayArray2802[i_152_][4] << 3;
							i_158_ = class227.anIntArrayArray2802[i_152_][5] << 3;
						}
						if (0 != i_156_ || 0 != i_157_ || i_158_ != 0)
							class157s[i_152_].method2671(i_156_, i_157_, i_158_);
						if (i_153_ != 0 || 0 != i_154_ || i_155_ != 0)
							class157s[i_152_].method2712(i_153_, i_154_, i_155_);
					}
				}
			}
			Class157 class157;
			if (class157s.length == 1)
				class157 = class157s[0];
			else
				class157 = new Class157(class157s, class157s.length);
			class528 = (class505.method8451(class157, i_147_, (((Class406) ((Class409) this).aClass406_4855).anInt4845 * 1391585069), 64 + ((Class409) this).anInt4885 * 426609083, 850 + 2107558229 * ((Class409) this).anInt4888));
			if (null != ((Class409) this).aShortArray4863) {
				short[] is_159_;
				if (null != class417 && class417.aShortArray4990 != null)
					is_159_ = class417.aShortArray4990;
				else
					is_159_ = aShortArray4892;
				for (int i_160_ = 0; i_160_ < ((Class409) this).aShortArray4863.length; i_160_++) {
					if (null != ((Class409) this).aByteArray4865 && i_160_ < ((Class409) this).aByteArray4865.length)
						class528.X(((Class409) this).aShortArray4863[i_160_], (aShortArray4862[(((Class409) this).aByteArray4865[i_160_] & 0xff)]));
					else
						class528.X(((Class409) this).aShortArray4863[i_160_], is_159_[i_160_]);
				}
			}
			if (((Class409) this).aShortArray4866 != null) {
				short[] is_161_;
				if (null != class417 && null != class417.aShortArray4991)
					is_161_ = class417.aShortArray4991;
				else
					is_161_ = aShortArray4867;
				for (int i_162_ = 0; i_162_ < ((Class409) this).aShortArray4866.length; i_162_++)
					class528.W(((Class409) this).aShortArray4866[i_162_], is_161_[i_162_]);
			}
			if (0 != ((Class409) this).aByte4871)
				class528.PA(((Class409) this).aByte4868, ((Class409) this).aByte4869, ((Class409) this).aByte4905, ((Class409) this).aByte4871 & 0xff);
			class528.KA(i_143_);
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass229_4836) {
				((Class406) ((Class409) this).aClass406_4855).aClass229_4836.method3856(class528, l);
			}
		}
		Class528 class528_163_ = class528.method11289((byte) 4, i_143_, true);
		boolean bool_164_ = false;
		if (null != is) {
			for (int i_165_ = 0; i_165_ < 12; i_165_++) {
				if (-1 != is[i_165_])
					bool_164_ = true;
			}
		}
		if (!bool_144_ && !bool_164_)
			return class528_163_;
		Class294[] class294s = null;
		if (class227 != null)
			class294s = class227.method3811((byte) 58);
		if (bool_164_ && null != class294s) {
			for (int i_166_ = 0; i_166_ < 12; i_166_++) {
				if (class294s[i_166_] != null)
					class528_163_.method11298(class294s[i_166_], 1 << i_166_, true);
			}
		}
		int i_167_ = 0;
		int i_168_ = 1;
		while (i_167_ < i_145_) {
			if (class456s[i_167_] != null)
				class456s[i_167_].method7578(class528_163_, 0, i_168_, 1395778988);
			i_167_++;
			i_168_ <<= 1;
		}
		if (bool_164_) {
			for (i_167_ = 0; i_167_ < 12; i_167_++) {
				if (is[i_167_] != -1) {
					i_168_ = is[i_167_] - i_140_;
					i_168_ &= 0x3fff;
					Class294 class294 = new Class294();
					class294.method5217(0.0F, 1.0F, 0.0F, Class382.method6508(i_168_));
					class528_163_.method11298(class294, 1 << i_167_, false);
				}
			}
		}
		if (bool_164_ && null != class294s) {
			for (i_167_ = 0; i_167_ < 12; i_167_++) {
				if (null != class294s[i_167_])
					class528_163_.method11298(class294s[i_167_], 1 << i_167_, false);
			}
		}
		if (null != class456 && null != class456_139_)
			Class521_Sub1_Sub3_Sub1.method16078(class528_163_, class456, class456_139_, 1140648146);
		else if (null != class456)
			class456.method7577(class528_163_, 0, 16711935);
		else if (class456_139_ != null)
			class456_139_.method7577(class528_163_, 0, 16711935);
		if (-961031919 * ((Class409) this).anInt4880 != 128 || 128 != -34693077 * ((Class409) this).anInt4881)
			class528_163_.oa(-961031919 * ((Class409) this).anInt4880, ((Class409) this).anInt4881 * -34693077, -961031919 * ((Class409) this).anInt4880);
		class528_163_.KA(i);
		return class528_163_;
	}

	public final Class528 method6895(Class505 class505, int i, Interface42 interface42, Class456 class456, Class417 class417) {
		if (null != anIntArray4886) {
			Class409 class409_169_ = method6884(interface42, 265881693);
			if (null == class409_169_)
				return null;
			return class409_169_.method6880(class505, i, interface42, class456, class417, 1872137685);
		}
		if (anIntArray4860 == null && (class417 == null || class417.anIntArray4992 == null))
			return null;
		int i_170_ = i;
		if (class456 != null)
			i_170_ |= class456.method7640(-1880435794);
		long l = (long) (-1524615769 * anInt4856 | class505.anInt5840 * -413843045 << 16);
		if (class417 != null)
			l |= -3839876830849846037L * class417.aLong4993 << 24;
		Class528 class528;
		synchronized (((Class406) ((Class409) this).aClass406_4855).aClass229_4843) {
			class528 = (Class528) ((Class406) ((Class409) this).aClass406_4855).aClass229_4843.method3865(l);
		}
		if (null == class528 || (class528.m() & i_170_) != i_170_) {
			if (null != class528)
				i_170_ |= class528.m();
			int i_171_ = i_170_;
			if (((Class409) this).aShortArray4863 != null)
				i_171_ |= 0x4000;
			if (((Class409) this).aShortArray4866 != null)
				i_171_ |= 0x8000;
			if (((Class409) this).aByte4871 != 0)
				i_171_ |= 0x80000;
			int[] is = (class417 != null && class417.anIntArray4992 != null ? class417.anIntArray4992 : anIntArray4860);
			boolean bool = false;
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass317_4842) {
				for (int i_172_ = 0; i_172_ < is.length; i_172_++) {
					if (!((Class406) ((Class409) this).aClass406_4855).aClass317_4842.method5688(is[i_172_], 0, 16711935))
						bool = true;
				}
			}
			if (bool)
				return null;
			Class157[] class157s = new Class157[is.length];
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass317_4842) {
				for (int i_173_ = 0; i_173_ < is.length; i_173_++)
					class157s[i_173_] = Class157.method2689((((Class406) (((Class409) this).aClass406_4855)).aClass317_4842), is[i_173_], 0);
			}
			for (int i_174_ = 0; i_174_ < is.length; i_174_++) {
				if (null != class157s[i_174_] && class157s[i_174_].anInt1986 < 13)
					class157s[i_174_].method2679(2);
			}
			Class157 class157;
			if (1 == class157s.length)
				class157 = class157s[0];
			else
				class157 = new Class157(class157s, class157s.length);
			class528 = class505.method8451(class157, i_171_, (((Class406) ((Class409) this).aClass406_4855).anInt4845) * 1391585069, 64, 768);
			if (((Class409) this).aShortArray4863 != null) {
				short[] is_175_;
				if (class417 != null && null != class417.aShortArray4990)
					is_175_ = class417.aShortArray4990;
				else
					is_175_ = aShortArray4892;
				for (int i_176_ = 0; i_176_ < ((Class409) this).aShortArray4863.length; i_176_++) {
					if (((Class409) this).aByteArray4865 != null && i_176_ < ((Class409) this).aByteArray4865.length)
						class528.X(((Class409) this).aShortArray4863[i_176_], (aShortArray4862[(((Class409) this).aByteArray4865[i_176_] & 0xff)]));
					else
						class528.X(((Class409) this).aShortArray4863[i_176_], is_175_[i_176_]);
				}
			}
			if (null != ((Class409) this).aShortArray4866) {
				short[] is_177_;
				if (null != class417 && null != class417.aShortArray4991)
					is_177_ = class417.aShortArray4991;
				else
					is_177_ = aShortArray4867;
				for (int i_178_ = 0; i_178_ < ((Class409) this).aShortArray4866.length; i_178_++)
					class528.W(((Class409) this).aShortArray4866[i_178_], is_177_[i_178_]);
			}
			if (((Class409) this).aByte4871 != 0)
				class528.PA(((Class409) this).aByte4868, ((Class409) this).aByte4869, ((Class409) this).aByte4905, ((Class409) this).aByte4871 & 0xff);
			class528.KA(i_170_);
			synchronized (((Class406) ((Class409) this).aClass406_4855).aClass229_4843) {
				((Class406) ((Class409) this).aClass406_4855).aClass229_4843.method3856(class528, l);
			}
		}
		if (null != class456) {
			class528 = class528.method11289((byte) 1, i_170_, true);
			class456.method7577(class528, 0, 16711935);
		}
		class528.KA(i);
		return class528;
	}

	void method6896(RsByteBuffer class282_sub35, int i, int i_179_) {
		if (i == 1) {
			int i_180_ = class282_sub35.readUnsignedByte();
			anIntArray4859 = new int[i_180_];
			for (int i_181_ = 0; i_181_ < i_180_; i_181_++)
				anIntArray4859[i_181_] = class282_sub35.readBigSmart(2133985309);
		} else if (i == 2)
			aString4857 = class282_sub35.readString(763566128);
		else if (i == 12)
			anInt4858 = class282_sub35.readUnsignedByte() * -1156523463;
		else if (i >= 30 && i < 35)
			aStringArray4882[i - 30] = class282_sub35.readString(1950048097);
		else if (40 == i) {
			int i_182_ = class282_sub35.readUnsignedByte();
			((Class409) this).aShortArray4863 = new short[i_182_];
			aShortArray4892 = new short[i_182_];
			for (int i_183_ = 0; i_183_ < i_182_; i_183_++) {
				((Class409) this).aShortArray4863[i_183_] = (short) class282_sub35.readUnsignedShort();
				aShortArray4892[i_183_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_184_ = class282_sub35.readUnsignedByte();
			((Class409) this).aShortArray4866 = new short[i_184_];
			aShortArray4867 = new short[i_184_];
			for (int i_185_ = 0; i_185_ < i_184_; i_185_++) {
				((Class409) this).aShortArray4866[i_185_] = (short) class282_sub35.readUnsignedShort();
				aShortArray4867[i_185_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_186_ = class282_sub35.readUnsignedByte();
			((Class409) this).aByteArray4865 = new byte[i_186_];
			for (int i_187_ = 0; i_187_ < i_186_; i_187_++)
				((Class409) this).aByteArray4865[i_187_] = class282_sub35.readByte((short) -25558);
		} else if (60 == i) {
			int i_188_ = class282_sub35.readUnsignedByte();
			anIntArray4860 = new int[i_188_];
			for (int i_189_ = 0; i_189_ < i_188_; i_189_++)
				anIntArray4860[i_189_] = class282_sub35.readBigSmart(2064872775);
		} else if (i == 93)
			aBool4864 = false;
		else if (i == 95)
			anInt4879 = class282_sub35.readUnsignedShort() * -518962747;
		else if (97 == i)
			((Class409) this).anInt4880 = class282_sub35.readUnsignedShort() * -395231247;
		else if (i == 98)
			((Class409) this).anInt4881 = class282_sub35.readUnsignedShort() * -102949245;
		else if (i == 99)
			aBool4904 = true;
		else if (i == 100)
			((Class409) this).anInt4885 = class282_sub35.readByte((short) -2860) * -2106403981;
		else if (i == 101)
			((Class409) this).anInt4888 = class282_sub35.readByte((short) -13831) * -618226703;
		else if (102 == i)
			anInt4887 = class282_sub35.readUnsignedShort() * -655354985;
		else if (i == 103)
			anInt4889 = class282_sub35.readUnsignedShort() * -516063969;
		else if (i == 106 || i == 118) {
			((Class409) this).anInt4891 = class282_sub35.readUnsignedShort() * -2140780709;
			if (65535 == ((Class409) this).anInt4891 * -810512173)
				((Class409) this).anInt4891 = 2140780709;
			((Class409) this).anInt4878 = class282_sub35.readUnsignedShort() * -1504935429;
			if (65535 == ((Class409) this).anInt4878 * 786850099)
				((Class409) this).anInt4878 = 1504935429;
			int i_190_ = -1;
			if (i == 118) {
				i_190_ = class282_sub35.readUnsignedShort();
				if (i_190_ == 65535)
					i_190_ = -1;
			}
			int i_191_ = class282_sub35.readUnsignedByte();
			anIntArray4886 = new int[2 + i_191_];
			for (int i_192_ = 0; i_192_ <= i_191_; i_192_++) {
				anIntArray4886[i_192_] = class282_sub35.readUnsignedShort();
				if (anIntArray4886[i_192_] == 65535)
					anIntArray4886[i_192_] = -1;
			}
			anIntArray4886[i_191_ + 1] = i_190_;
		} else if (107 == i)
			aBool4893 = false;
		else if (109 == i)
			aBool4894 = false;
		else if (i == 111)
			aBool4912 = false;
		else if (i == 113) {
			aShort4874 = (short) class282_sub35.readUnsignedShort();
			aShort4897 = (short) class282_sub35.readUnsignedShort();
		} else if (114 == i) {
			aByte4883 = class282_sub35.readByte((short) -31587);
			aByte4899 = class282_sub35.readByte((short) -25259);
		} else if (i == 119)
			aByte4900 = class282_sub35.readByte((short) -23373);
		else if (121 == i) {
			((Class409) this).anIntArrayArray4895 = new int[anIntArray4859.length][];
			int i_193_ = class282_sub35.readUnsignedByte();
			for (int i_194_ = 0; i_194_ < i_193_; i_194_++) {
				int i_195_ = class282_sub35.readUnsignedByte();
				int[] is = (((Class409) this).anIntArrayArray4895[i_195_] = new int[3]);
				is[0] = class282_sub35.readByte((short) -3914);
				is[1] = class282_sub35.readByte((short) -31533);
				is[2] = class282_sub35.readByte((short) -32204);
			}
		} else if (123 == i)
			anInt4902 = class282_sub35.readUnsignedShort() * -1013929977;
		else if (i == 125)
			aClass252_4910 = ((Class252) Class386.method6672(Class46.method931(-1178887780), class282_sub35.readByte((short) -25767), -1522622422));
		else if (i == 127)
			anInt4898 = class282_sub35.readUnsignedShort() * -318852007;
		else if (i == 128)
			Class386.method6672(Class8_Sub3.method14339(392788046), class282_sub35.readUnsignedByte(), -1112541696);
		else if (i == 134) {
			anInt4903 = class282_sub35.readUnsignedShort() * -1683450223;
			if (-1910117775 * anInt4903 == 65535)
				anInt4903 = 1683450223;
			anInt4921 = class282_sub35.readUnsignedShort() * -1949889189;
			if (65535 == anInt4921 * 1863998163)
				anInt4921 = 1949889189;
			anInt4876 = class282_sub35.readUnsignedShort() * 673000039;
			if (65535 == -1955311273 * anInt4876)
				anInt4876 = -673000039;
			anInt4906 = class282_sub35.readUnsignedShort() * 1797039655;
			if (anInt4906 * -1427347049 == 65535)
				anInt4906 = -1797039655;
			anInt4907 = class282_sub35.readUnsignedByte() * -1487095799;
		} else if (135 == i) {
			anInt4875 = class282_sub35.readUnsignedByte() * -501657497;
			anInt4873 = class282_sub35.readUnsignedShort() * 105756369;
		} else if (i == 136) {
			anInt4854 = class282_sub35.readUnsignedByte() * 830148041;
			anInt4861 = class282_sub35.readUnsignedShort() * -1021968649;
		} else if (i == 137)
			anInt4877 = class282_sub35.readUnsignedShort() * 1953007503;
		else if (i == 138)
			anInt4918 = class282_sub35.readBigSmart(2081702149) * 1094135957;
		else if (140 == i)
			anInt4909 = class282_sub35.readUnsignedByte() * -1523364637;
		else if (i == 141)
			aBool4884 = true;
		else if (i == 142)
			anInt4914 = class282_sub35.readUnsignedShort() * 1420766747;
		else if (143 == i)
			aBool4890 = true;
		else if (i >= 150 && i < 155) {
			aStringArray4882[i - 150] = class282_sub35.readString(-571156301);
			if (!((Class406) ((Class409) this).aClass406_4855).aBool4838)
				aStringArray4882[i - 150] = null;
		} else if (155 == i) {
			((Class409) this).aByte4868 = class282_sub35.readByte((short) 203);
			((Class409) this).aByte4869 = class282_sub35.readByte((short) -28906);
			((Class409) this).aByte4905 = class282_sub35.readByte((short) -25047);
			((Class409) this).aByte4871 = class282_sub35.readByte((short) -14406);
		} else if (i == 158)
			aByte4916 = (byte) 1;
		else if (159 == i)
			aByte4916 = (byte) 0;
		else if (i == 160) {
			int i_196_ = class282_sub35.readUnsignedByte();
			anIntArray4915 = new int[i_196_];
			for (int i_197_ = 0; i_197_ < i_196_; i_197_++)
				anIntArray4915[i_197_] = class282_sub35.readUnsignedShort();
		} else if (i == 162)
			aBool4872 = true;
		else if (i == 163)
			anInt4917 = class282_sub35.readUnsignedByte() * -832596403;
		else if (164 == i) {
			anInt4911 = class282_sub35.readUnsignedShort() * 1237298269;
			anInt4919 = class282_sub35.readUnsignedShort() * 665449705;
		} else if (i == 165)
			anInt4913 = class282_sub35.readUnsignedByte() * 1057419233;
		else if (i == 168)
			anInt4908 = class282_sub35.readUnsignedByte() * -967519343;
		else if (i == 169)
			aBool4920 = false;
		else if (249 == i) {
			int i_198_ = class282_sub35.readUnsignedByte();
			if (null == ((Class409) this).aClass465_4896) {
				int i_199_ = Class323.method5778(i_198_, -597233692);
				((Class409) this).aClass465_4896 = new Class465(i_199_);
			}
			for (int i_200_ = 0; i_200_ < i_198_; i_200_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_201_ = class282_sub35.read24BitUnsignedInteger((short) 13614);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(1838133803));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class409) this).aClass465_4896.method7765(class282, (long) i_201_);
			}
		}
	}

	public final boolean method6897() {
		if (null == anIntArray4859)
			return true;
		boolean bool = true;
		int[] is = anIntArray4859;
		for (int i = 0; i < is.length; i++) {
			int i_202_ = is[i];
			if (!((Class406) ((Class409) this).aClass406_4855).aClass317_4842.method5688(i_202_, 0, 16711935))
				bool = false;
		}
		return bool;
	}

	public String method6898(int i, String string) {
		if (null == ((Class409) this).aClass465_4896)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class409) this).aClass465_4896.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public int method6899(int i, int i_203_) {
		if (((Class409) this).aClass465_4896 == null)
			return i_203_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class409) this).aClass465_4896.method7754((long) i));
		if (null == class282_sub38)
			return i_203_;
		return -570797415 * class282_sub38.anInt8002;
	}

	public String method6900(int i, String string) {
		if (null == ((Class409) this).aClass465_4896)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class409) this).aClass465_4896.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public int method6901(int i, int i_204_) {
		if (((Class409) this).aClass465_4896 == null)
			return i_204_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class409) this).aClass465_4896.method7754((long) i));
		if (null == class282_sub38)
			return i_204_;
		return -570797415 * class282_sub38.anInt8002;
	}

	public String method6902(int i, String string) {
		if (null == ((Class409) this).aClass465_4896)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class409) this).aClass465_4896.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public boolean method6903(Interface42 interface42) {
		if (null == anIntArray4886)
			return true;
		int i = -1;
		if (-1 != ((Class409) this).anInt4891 * -810512173)
			i = interface42.method241(-810512173 * ((Class409) this).anInt4891, -1771697069);
		else if (786850099 * ((Class409) this).anInt4878 != -1)
			i = interface42.method240(((Class409) this).anInt4878 * 786850099, 734477316);
		if (i < 0 || i >= anIntArray4886.length - 1 || -1 == anIntArray4886[i]) {
			int i_205_ = anIntArray4886[anIntArray4886.length - 1];
			if (-1 != i_205_)
				return true;
			return false;
		}
		return true;
	}

	public final Class528 method6904(Class505 class505, int i, Class211 class211, Interface42 interface42, Class456 class456, Class456 class456_206_, Class456[] class456s, int[] is, int i_207_, Class417 class417) {
		return method6879(class505, i, class211, interface42, class456, class456_206_, class456s, is, i_207_, class417, -490908695 * anInt4898, true, 248786522);
	}

	public boolean method6905(Interface42 interface42) {
		if (null == anIntArray4886)
			return true;
		int i = -1;
		if (-1 != ((Class409) this).anInt4891 * -810512173)
			i = interface42.method241(-810512173 * ((Class409) this).anInt4891, 1607614603);
		else if (786850099 * ((Class409) this).anInt4878 != -1)
			i = interface42.method240(((Class409) this).anInt4878 * 786850099, 1429466979);
		if (i < 0 || i >= anIntArray4886.length - 1 || -1 == anIntArray4886[i]) {
			int i_208_ = anIntArray4886[anIntArray4886.length - 1];
			if (-1 != i_208_)
				return true;
			return false;
		}
		return true;
	}

	public boolean method6906() {
		if (null == anIntArray4886)
			return (anInt4903 * -1910117775 != -1 || -1955311273 * anInt4876 != -1 || -1 != -1427347049 * anInt4906);
		for (int i = 0; i < anIntArray4886.length; i++) {
			if (anIntArray4886[i] != -1) {
				Class409 class409_209_ = ((Class409) this).aClass406_4855.method6828(anIntArray4886[i], (byte) -31);
				if (class409_209_.anInt4903 * -1910117775 != -1 || -1955311273 * class409_209_.anInt4876 != -1 || -1427347049 * class409_209_.anInt4906 != -1)
					return true;
			}
		}
		return false;
	}

	static void method6907(int i) {
		client.aClass257_7353.method4444(1050660585);
		Class58.method1139(-2058483007);
		Class356.method6227(true, (byte) -37);
		Class247.method4250((byte) -91);
		System.gc();
		Class316.aClass505_3680.ba(2, 0);
	}

	static final void method6908(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub18_8214.method12776(-558492277);
	}
}
