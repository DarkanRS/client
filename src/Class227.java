
/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class227 {
	public int anInt2786;
	public boolean aBool2787;
	Class211 aClass211_2788;
	public int[] anIntArray2789;
	public int anInt2790;
	public int[][] anIntArrayArray2791;
	public int anInt2792;
	public int anInt2793;
	public int anInt2794;
	public int anInt2795;
	public int anInt2796;
	public int anInt2797;
	public int anInt2798;
	public int anInt2799;
	public int anInt2800;
	public int anInt2801;
	public int[][] anIntArrayArray2802;
	public int anInt2803;
	public int anInt2804;
	Class294[] aClass294Array2805;
	public int anInt2806;
	public int anInt2807;
	public int anInt2808;
	public int anInt2809;
	public int anInt2810;
	public int[] anIntArray2811;
	public int anInt2812;
	public int anInt2813;
	public int[] anIntArray2814;
	public int anInt2815;
	public int anInt2816;
	public int anInt2817;
	public int[] anIntArray2818;
	public int anInt2819 = 1841483755;
	public int anInt2820;
	public int anInt2821;
	int anInt2822;
	public int anInt2823;
	public int anInt2824;
	public int anInt2825;
	public int anInt2826;
	public int anInt2827;
	public int anInt2828;
	public int anInt2829;
	public int anInt2830;
	static int anInt2831;

	void method3807(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method3808(class282_sub35, i, 1671409778);
		}
	}

	void method3808(RsByteBuffer class282_sub35, int i, int i_0_) {
		if (1 == i) {
			anInt2819 = class282_sub35.readBigSmart(2076852527) * -1841483755;
			anInt2793 = class282_sub35.readBigSmart(1997737967) * -1282270303;
		} else if (2 == i)
			anInt2801 = class282_sub35.readBigSmart(1955860003) * 1440309881;
		else if (i == 3)
			anInt2828 = class282_sub35.readBigSmart(2118276199) * -9280901;
		else if (i == 4)
			anInt2803 = class282_sub35.readBigSmart(2144070605) * -1367558181;
		else if (5 == i)
			anInt2812 = class282_sub35.readBigSmart(2023251639) * -1330842743;
		else if (i == 6)
			anInt2797 = class282_sub35.readBigSmart(2103849781) * 1796346719;
		else if (i == 7)
			anInt2817 = class282_sub35.readBigSmart(2092906054) * 619103101;
		else if (8 == i)
			anInt2799 = class282_sub35.readBigSmart(2043479053) * 1275461135;
		else if (i == 9)
			anInt2800 = class282_sub35.readBigSmart(1988964713) * -356781757;
		else if (26 == i) {
			anInt2786 = ((short) (class282_sub35.readUnsignedByte() * 4) * 1845638735);
			anInt2829 = ((short) (class282_sub35.readUnsignedByte() * 4) * -588956041);
		} else if (i == 27) {
			if (anIntArrayArray2802 == null)
				anIntArrayArray2802 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length][];
			int i_1_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2802[i_1_] = new int[6];
			for (int i_2_ = 0; i_2_ < 6; i_2_++)
				anIntArrayArray2802[i_1_][i_2_] = class282_sub35.readShort(1960954063);
		} else if (i == 28) {
			int i_3_ = class282_sub35.readUnsignedByte();
			anIntArray2811 = new int[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				anIntArray2811[i_4_] = class282_sub35.readUnsignedByte();
				if (255 == anIntArray2811[i_4_])
					anIntArray2811[i_4_] = -1;
			}
		} else if (29 == i)
			anInt2820 = class282_sub35.readUnsignedByte() * -987374717;
		else if (30 == i)
			anInt2804 = class282_sub35.readUnsignedShort() * 257558101;
		else if (i == 31)
			anInt2825 = class282_sub35.readUnsignedByte() * -311542087;
		else if (32 == i)
			anInt2823 = class282_sub35.readUnsignedShort() * 2100277747;
		else if (33 == i)
			anInt2824 = class282_sub35.readShort(1858209964) * -472559017;
		else if (i == 34)
			anInt2816 = class282_sub35.readUnsignedByte() * -1099146947;
		else if (i == 35)
			anInt2815 = class282_sub35.readUnsignedShort() * 510177299;
		else if (36 == i)
			anInt2827 = class282_sub35.readShort(1666231467) * 50774847;
		else if (37 == i)
			anInt2826 = class282_sub35.readUnsignedByte() * -1731992137;
		else if (38 == i)
			anInt2821 = class282_sub35.readBigSmart(1951487804) * -967389061;
		else if (i == 39)
			anInt2792 = class282_sub35.readBigSmart(2086766256) * 1725030595;
		else if (i == 40)
			anInt2794 = class282_sub35.readBigSmart(2105446462) * -1544163167;
		else if (41 == i)
			anInt2795 = class282_sub35.readBigSmart(2009459460) * -963929139;
		else if (42 == i)
			anInt2796 = class282_sub35.readBigSmart(2053961041) * -1607820639;
		else if (i == 43)
			class282_sub35.readUnsignedShort();
		else if (i == 44)
			class282_sub35.readUnsignedShort();
		else if (45 == i)
			anInt2798 = class282_sub35.readUnsignedShort() * -286307705;
		else if (46 == i)
			anInt2830 = class282_sub35.readBigSmart(2114250981) * -1358044133;
		else if (i == 47)
			anInt2806 = class282_sub35.readBigSmart(1991971332) * -602180007;
		else if (i == 48)
			anInt2807 = class282_sub35.readBigSmart(2021553025) * -311781873;
		else if (49 == i)
			anInt2808 = class282_sub35.readBigSmart(2033475135) * 1032347705;
		else if (i == 50)
			anInt2809 = class282_sub35.readBigSmart(2143114717) * 1310162937;
		else if (i == 51)
			anInt2810 = class282_sub35.readBigSmart(2037722744) * -1871121921;
		else if (52 == i) {
			int i_5_ = class282_sub35.readUnsignedByte();
			anIntArray2814 = new int[i_5_];
			anIntArray2789 = new int[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				anIntArray2814[i_6_] = class282_sub35.readBigSmart(1983849040);
				int i_7_ = class282_sub35.readUnsignedByte();
				anIntArray2789[i_6_] = i_7_;
				((Class227) this).anInt2822 += -685147451 * i_7_;
			}
		} else if (53 == i)
			aBool2787 = false;
		else if (i == 54) {
			anInt2813 = (class282_sub35.readUnsignedByte() << 6) * -4475195;
			anInt2790 = (class282_sub35.readUnsignedByte() << 6) * 1862251257;
		} else if (i == 55) {
			if (anIntArray2818 == null)
				anIntArray2818 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length];
			int i_8_ = class282_sub35.readUnsignedByte();
			anIntArray2818[i_8_] = class282_sub35.readUnsignedShort();
		} else if (i == 56) {
			if (null == anIntArrayArray2791)
				anIntArrayArray2791 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length][];
			int i_9_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2791[i_9_] = new int[3];
			for (int i_10_ = 0; i_10_ < 3; i_10_++)
				anIntArrayArray2791[i_9_][i_10_] = class282_sub35.readShort(2037322066);
		}
	}

	Class227() {
		anIntArray2814 = null;
		anIntArray2789 = null;
		((Class227) this).anInt2822 = 0;
		anInt2821 = 967389061;
		anInt2792 = -1725030595;
		anInt2793 = 1282270303;
		anInt2794 = 1544163167;
		anInt2795 = 963929139;
		anInt2796 = 1607820639;
		anInt2797 = -1796346719;
		anInt2817 = -619103101;
		anInt2799 = -1275461135;
		anInt2800 = 356781757;
		anInt2801 = -1440309881;
		anInt2828 = 9280901;
		anInt2803 = 1367558181;
		anInt2812 = 1330842743;
		anInt2830 = 1358044133;
		anInt2806 = 602180007;
		anInt2807 = 311781873;
		anInt2808 = -1032347705;
		anInt2809 = -1310162937;
		anInt2810 = 1871121921;
		anInt2786 = 0;
		anInt2829 = 0;
		anInt2813 = 0;
		anInt2790 = 0;
		anInt2820 = 0;
		anInt2804 = 0;
		anInt2825 = 0;
		anInt2823 = 0;
		anInt2824 = 0;
		anInt2816 = 0;
		anInt2815 = 0;
		anInt2827 = 0;
		anInt2826 = 1731992137;
		anInt2798 = 286307705;
		aBool2787 = true;
	}

	public int method3809(int i) {
		if (-1 != anInt2819 * -243982531)
			return -243982531 * anInt2819;
		if (anIntArray2814 != null) {
			int i_11_ = (int) (Math.random() * (double) (1953362957 * ((Class227) this).anInt2822));
			int i_12_;
			for (i_12_ = 0; i_11_ >= anIntArray2789[i_12_]; i_12_++)
				i_11_ -= anIntArray2789[i_12_];
			return anIntArray2814[i_12_];
		}
		return -1;
	}

	public boolean method3810(int i, int i_13_) {
		if (i == -1)
			return false;
		if (i == -243982531 * anInt2819)
			return true;
		if (null != anIntArray2814) {
			for (int i_14_ = 0; i_14_ < anIntArray2814.length; i_14_++) {
				if (anIntArray2814[i_14_] == i)
					return true;
			}
		}
		return false;
	}

	public Class294[] method3811(byte i) {
		if (((Class227) this).aClass294Array2805 != null)
			return ((Class227) this).aClass294Array2805;
		if (null == anIntArrayArray2802)
			return null;
		((Class227) this).aClass294Array2805 = new Class294[anIntArrayArray2802.length];
		for (int i_15_ = 0; i_15_ < anIntArrayArray2802.length; i_15_++) {
			int i_16_ = 0;
			int i_17_ = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			int i_20_ = 0;
			int i_21_ = 0;
			if (null != anIntArrayArray2802[i_15_]) {
				i_16_ = anIntArrayArray2802[i_15_][0];
				i_17_ = anIntArrayArray2802[i_15_][1];
				i_18_ = anIntArrayArray2802[i_15_][2];
				i_19_ = anIntArrayArray2802[i_15_][3] << 3;
				i_20_ = anIntArrayArray2802[i_15_][4] << 3;
				i_21_ = anIntArrayArray2802[i_15_][5] << 3;
			}
			if (0 != i_16_ || i_17_ != 0 || 0 != i_18_ || 0 != i_19_ || i_20_ != 0 || 0 != i_21_) {
				Class294 class294 = (((Class227) this).aClass294Array2805[i_15_] = new Class294());
				if (i_21_ != 0)
					class294.method5220(0.0F, 0.0F, 1.0F, Class382.method6508(i_21_));
				if (i_19_ != 0)
					class294.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(i_19_));
				if (i_20_ != 0)
					class294.method5220(0.0F, 1.0F, 0.0F, Class382.method6508(i_20_));
				class294.method5219((float) i_16_, (float) i_17_, (float) i_18_);
			}
		}
		return ((Class227) this).aClass294Array2805;
	}

	void method3812(RsByteBuffer class282_sub35, int i) {
		if (1 == i) {
			anInt2819 = class282_sub35.readBigSmart(2053878939) * -1841483755;
			anInt2793 = class282_sub35.readBigSmart(1957941219) * -1282270303;
		} else if (2 == i)
			anInt2801 = class282_sub35.readBigSmart(2135357726) * 1440309881;
		else if (i == 3)
			anInt2828 = class282_sub35.readBigSmart(2145673153) * -9280901;
		else if (i == 4)
			anInt2803 = class282_sub35.readBigSmart(1979157560) * -1367558181;
		else if (5 == i)
			anInt2812 = class282_sub35.readBigSmart(2074038444) * -1330842743;
		else if (i == 6)
			anInt2797 = class282_sub35.readBigSmart(2049150052) * 1796346719;
		else if (i == 7)
			anInt2817 = class282_sub35.readBigSmart(2093490101) * 619103101;
		else if (8 == i)
			anInt2799 = class282_sub35.readBigSmart(2020938195) * 1275461135;
		else if (i == 9)
			anInt2800 = class282_sub35.readBigSmart(2007762279) * -356781757;
		else if (26 == i) {
			anInt2786 = ((short) (class282_sub35.readUnsignedByte() * 4) * 1845638735);
			anInt2829 = ((short) (class282_sub35.readUnsignedByte() * 4) * -588956041);
		} else if (i == 27) {
			if (anIntArrayArray2802 == null)
				anIntArrayArray2802 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length][];
			int i_22_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2802[i_22_] = new int[6];
			for (int i_23_ = 0; i_23_ < 6; i_23_++)
				anIntArrayArray2802[i_22_][i_23_] = class282_sub35.readShort(1890043360);
		} else if (i == 28) {
			int i_24_ = class282_sub35.readUnsignedByte();
			anIntArray2811 = new int[i_24_];
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
				anIntArray2811[i_25_] = class282_sub35.readUnsignedByte();
				if (255 == anIntArray2811[i_25_])
					anIntArray2811[i_25_] = -1;
			}
		} else if (29 == i)
			anInt2820 = class282_sub35.readUnsignedByte() * -987374717;
		else if (30 == i)
			anInt2804 = class282_sub35.readUnsignedShort() * 257558101;
		else if (i == 31)
			anInt2825 = class282_sub35.readUnsignedByte() * -311542087;
		else if (32 == i)
			anInt2823 = class282_sub35.readUnsignedShort() * 2100277747;
		else if (33 == i)
			anInt2824 = class282_sub35.readShort(1580457730) * -472559017;
		else if (i == 34)
			anInt2816 = class282_sub35.readUnsignedByte() * -1099146947;
		else if (i == 35)
			anInt2815 = class282_sub35.readUnsignedShort() * 510177299;
		else if (36 == i)
			anInt2827 = class282_sub35.readShort(1860902884) * 50774847;
		else if (37 == i)
			anInt2826 = class282_sub35.readUnsignedByte() * -1731992137;
		else if (38 == i)
			anInt2821 = class282_sub35.readBigSmart(2012682965) * -967389061;
		else if (i == 39)
			anInt2792 = class282_sub35.readBigSmart(2020446379) * 1725030595;
		else if (i == 40)
			anInt2794 = class282_sub35.readBigSmart(2013994531) * -1544163167;
		else if (41 == i)
			anInt2795 = class282_sub35.readBigSmart(2029481589) * -963929139;
		else if (42 == i)
			anInt2796 = class282_sub35.readBigSmart(1990546029) * -1607820639;
		else if (i == 43)
			class282_sub35.readUnsignedShort();
		else if (i == 44)
			class282_sub35.readUnsignedShort();
		else if (45 == i)
			anInt2798 = class282_sub35.readUnsignedShort() * -286307705;
		else if (46 == i)
			anInt2830 = class282_sub35.readBigSmart(2101386628) * -1358044133;
		else if (i == 47)
			anInt2806 = class282_sub35.readBigSmart(2006618818) * -602180007;
		else if (i == 48)
			anInt2807 = class282_sub35.readBigSmart(1952272573) * -311781873;
		else if (49 == i)
			anInt2808 = class282_sub35.readBigSmart(2004445877) * 1032347705;
		else if (i == 50)
			anInt2809 = class282_sub35.readBigSmart(2128614225) * 1310162937;
		else if (i == 51)
			anInt2810 = class282_sub35.readBigSmart(2054758691) * -1871121921;
		else if (52 == i) {
			int i_26_ = class282_sub35.readUnsignedByte();
			anIntArray2814 = new int[i_26_];
			anIntArray2789 = new int[i_26_];
			for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
				anIntArray2814[i_27_] = class282_sub35.readBigSmart(1948064427);
				int i_28_ = class282_sub35.readUnsignedByte();
				anIntArray2789[i_27_] = i_28_;
				((Class227) this).anInt2822 += -685147451 * i_28_;
			}
		} else if (53 == i)
			aBool2787 = false;
		else if (i == 54) {
			anInt2813 = (class282_sub35.readUnsignedByte() << 6) * -4475195;
			anInt2790 = (class282_sub35.readUnsignedByte() << 6) * 1862251257;
		} else if (i == 55) {
			if (anIntArray2818 == null)
				anIntArray2818 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length];
			int i_29_ = class282_sub35.readUnsignedByte();
			anIntArray2818[i_29_] = class282_sub35.readUnsignedShort();
		} else if (i == 56) {
			if (null == anIntArrayArray2791)
				anIntArrayArray2791 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length][];
			int i_30_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2791[i_30_] = new int[3];
			for (int i_31_ = 0; i_31_ < 3; i_31_++)
				anIntArrayArray2791[i_30_][i_31_] = class282_sub35.readShort(2137392774);
		}
	}

	void method3813(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method3808(class282_sub35, i, 1644893031);
		}
	}

	void method3814(RsByteBuffer class282_sub35, int i) {
		if (1 == i) {
			anInt2819 = class282_sub35.readBigSmart(2118678174) * -1841483755;
			anInt2793 = class282_sub35.readBigSmart(1964473726) * -1282270303;
		} else if (2 == i)
			anInt2801 = class282_sub35.readBigSmart(2009923064) * 1440309881;
		else if (i == 3)
			anInt2828 = class282_sub35.readBigSmart(1994761131) * -9280901;
		else if (i == 4)
			anInt2803 = class282_sub35.readBigSmart(2018359448) * -1367558181;
		else if (5 == i)
			anInt2812 = class282_sub35.readBigSmart(2127724836) * -1330842743;
		else if (i == 6)
			anInt2797 = class282_sub35.readBigSmart(1985984147) * 1796346719;
		else if (i == 7)
			anInt2817 = class282_sub35.readBigSmart(1968848574) * 619103101;
		else if (8 == i)
			anInt2799 = class282_sub35.readBigSmart(2108806349) * 1275461135;
		else if (i == 9)
			anInt2800 = class282_sub35.readBigSmart(2017317510) * -356781757;
		else if (26 == i) {
			anInt2786 = ((short) (class282_sub35.readUnsignedByte() * 4) * 1845638735);
			anInt2829 = ((short) (class282_sub35.readUnsignedByte() * 4) * -588956041);
		} else if (i == 27) {
			if (anIntArrayArray2802 == null)
				anIntArrayArray2802 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length][];
			int i_32_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2802[i_32_] = new int[6];
			for (int i_33_ = 0; i_33_ < 6; i_33_++)
				anIntArrayArray2802[i_32_][i_33_] = class282_sub35.readShort(1760439070);
		} else if (i == 28) {
			int i_34_ = class282_sub35.readUnsignedByte();
			anIntArray2811 = new int[i_34_];
			for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
				anIntArray2811[i_35_] = class282_sub35.readUnsignedByte();
				if (255 == anIntArray2811[i_35_])
					anIntArray2811[i_35_] = -1;
			}
		} else if (29 == i)
			anInt2820 = class282_sub35.readUnsignedByte() * -987374717;
		else if (30 == i)
			anInt2804 = class282_sub35.readUnsignedShort() * 257558101;
		else if (i == 31)
			anInt2825 = class282_sub35.readUnsignedByte() * -311542087;
		else if (32 == i)
			anInt2823 = class282_sub35.readUnsignedShort() * 2100277747;
		else if (33 == i)
			anInt2824 = class282_sub35.readShort(1698520070) * -472559017;
		else if (i == 34)
			anInt2816 = class282_sub35.readUnsignedByte() * -1099146947;
		else if (i == 35)
			anInt2815 = class282_sub35.readUnsignedShort() * 510177299;
		else if (36 == i)
			anInt2827 = class282_sub35.readShort(1735373542) * 50774847;
		else if (37 == i)
			anInt2826 = class282_sub35.readUnsignedByte() * -1731992137;
		else if (38 == i)
			anInt2821 = class282_sub35.readBigSmart(2029945376) * -967389061;
		else if (i == 39)
			anInt2792 = class282_sub35.readBigSmart(1967511400) * 1725030595;
		else if (i == 40)
			anInt2794 = class282_sub35.readBigSmart(2064097799) * -1544163167;
		else if (41 == i)
			anInt2795 = class282_sub35.readBigSmart(2093032196) * -963929139;
		else if (42 == i)
			anInt2796 = class282_sub35.readBigSmart(2146965328) * -1607820639;
		else if (i == 43)
			class282_sub35.readUnsignedShort();
		else if (i == 44)
			class282_sub35.readUnsignedShort();
		else if (45 == i)
			anInt2798 = class282_sub35.readUnsignedShort() * -286307705;
		else if (46 == i)
			anInt2830 = class282_sub35.readBigSmart(1969132982) * -1358044133;
		else if (i == 47)
			anInt2806 = class282_sub35.readBigSmart(2109670317) * -602180007;
		else if (i == 48)
			anInt2807 = class282_sub35.readBigSmart(2005489078) * -311781873;
		else if (49 == i)
			anInt2808 = class282_sub35.readBigSmart(2099703082) * 1032347705;
		else if (i == 50)
			anInt2809 = class282_sub35.readBigSmart(2000237386) * 1310162937;
		else if (i == 51)
			anInt2810 = class282_sub35.readBigSmart(1985516927) * -1871121921;
		else if (52 == i) {
			int i_36_ = class282_sub35.readUnsignedByte();
			anIntArray2814 = new int[i_36_];
			anIntArray2789 = new int[i_36_];
			for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
				anIntArray2814[i_37_] = class282_sub35.readBigSmart(2030902423);
				int i_38_ = class282_sub35.readUnsignedByte();
				anIntArray2789[i_37_] = i_38_;
				((Class227) this).anInt2822 += -685147451 * i_38_;
			}
		} else if (53 == i)
			aBool2787 = false;
		else if (i == 54) {
			anInt2813 = (class282_sub35.readUnsignedByte() << 6) * -4475195;
			anInt2790 = (class282_sub35.readUnsignedByte() << 6) * 1862251257;
		} else if (i == 55) {
			if (anIntArray2818 == null)
				anIntArray2818 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length];
			int i_39_ = class282_sub35.readUnsignedByte();
			anIntArray2818[i_39_] = class282_sub35.readUnsignedShort();
		} else if (i == 56) {
			if (null == anIntArrayArray2791)
				anIntArrayArray2791 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length][];
			int i_40_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2791[i_40_] = new int[3];
			for (int i_41_ = 0; i_41_ < 3; i_41_++)
				anIntArrayArray2791[i_40_][i_41_] = class282_sub35.readShort(1934573250);
		}
	}

	static final void method3815(int i, SwitchMap class465) {
		if (i != -1 && class465.method7754((long) i) == null)
			class465.method7765(new Class282(), (long) i);
	}

	void method3816(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method3808(class282_sub35, i, 60478687);
		}
	}

	public Class294[] method3817() {
		if (((Class227) this).aClass294Array2805 != null)
			return ((Class227) this).aClass294Array2805;
		if (null == anIntArrayArray2802)
			return null;
		((Class227) this).aClass294Array2805 = new Class294[anIntArrayArray2802.length];
		for (int i = 0; i < anIntArrayArray2802.length; i++) {
			int i_42_ = 0;
			int i_43_ = 0;
			int i_44_ = 0;
			int i_45_ = 0;
			int i_46_ = 0;
			int i_47_ = 0;
			if (null != anIntArrayArray2802[i]) {
				i_42_ = anIntArrayArray2802[i][0];
				i_43_ = anIntArrayArray2802[i][1];
				i_44_ = anIntArrayArray2802[i][2];
				i_45_ = anIntArrayArray2802[i][3] << 3;
				i_46_ = anIntArrayArray2802[i][4] << 3;
				i_47_ = anIntArrayArray2802[i][5] << 3;
			}
			if (0 != i_42_ || i_43_ != 0 || 0 != i_44_ || 0 != i_45_ || i_46_ != 0 || 0 != i_47_) {
				Class294 class294 = ((Class227) this).aClass294Array2805[i] = new Class294();
				if (i_47_ != 0)
					class294.method5220(0.0F, 0.0F, 1.0F, Class382.method6508(i_47_));
				if (i_45_ != 0)
					class294.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(i_45_));
				if (i_46_ != 0)
					class294.method5220(0.0F, 1.0F, 0.0F, Class382.method6508(i_46_));
				class294.method5219((float) i_42_, (float) i_43_, (float) i_44_);
			}
		}
		return ((Class227) this).aClass294Array2805;
	}

	void method3818(RsByteBuffer class282_sub35, int i) {
		if (1 == i) {
			anInt2819 = class282_sub35.readBigSmart(2144280986) * -1841483755;
			anInt2793 = class282_sub35.readBigSmart(2123906449) * -1282270303;
		} else if (2 == i)
			anInt2801 = class282_sub35.readBigSmart(2101835769) * 1440309881;
		else if (i == 3)
			anInt2828 = class282_sub35.readBigSmart(2076994552) * -9280901;
		else if (i == 4)
			anInt2803 = class282_sub35.readBigSmart(1961312933) * -1367558181;
		else if (5 == i)
			anInt2812 = class282_sub35.readBigSmart(2134071282) * -1330842743;
		else if (i == 6)
			anInt2797 = class282_sub35.readBigSmart(2058923605) * 1796346719;
		else if (i == 7)
			anInt2817 = class282_sub35.readBigSmart(1942132793) * 619103101;
		else if (8 == i)
			anInt2799 = class282_sub35.readBigSmart(2037689964) * 1275461135;
		else if (i == 9)
			anInt2800 = class282_sub35.readBigSmart(2112893838) * -356781757;
		else if (26 == i) {
			anInt2786 = ((short) (class282_sub35.readUnsignedByte() * 4) * 1845638735);
			anInt2829 = ((short) (class282_sub35.readUnsignedByte() * 4) * -588956041);
		} else if (i == 27) {
			if (anIntArrayArray2802 == null)
				anIntArrayArray2802 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length][];
			int i_48_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2802[i_48_] = new int[6];
			for (int i_49_ = 0; i_49_ < 6; i_49_++)
				anIntArrayArray2802[i_48_][i_49_] = class282_sub35.readShort(1795467983);
		} else if (i == 28) {
			int i_50_ = class282_sub35.readUnsignedByte();
			anIntArray2811 = new int[i_50_];
			for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
				anIntArray2811[i_51_] = class282_sub35.readUnsignedByte();
				if (255 == anIntArray2811[i_51_])
					anIntArray2811[i_51_] = -1;
			}
		} else if (29 == i)
			anInt2820 = class282_sub35.readUnsignedByte() * -987374717;
		else if (30 == i)
			anInt2804 = class282_sub35.readUnsignedShort() * 257558101;
		else if (i == 31)
			anInt2825 = class282_sub35.readUnsignedByte() * -311542087;
		else if (32 == i)
			anInt2823 = class282_sub35.readUnsignedShort() * 2100277747;
		else if (33 == i)
			anInt2824 = class282_sub35.readShort(2006839336) * -472559017;
		else if (i == 34)
			anInt2816 = class282_sub35.readUnsignedByte() * -1099146947;
		else if (i == 35)
			anInt2815 = class282_sub35.readUnsignedShort() * 510177299;
		else if (36 == i)
			anInt2827 = class282_sub35.readShort(1807657201) * 50774847;
		else if (37 == i)
			anInt2826 = class282_sub35.readUnsignedByte() * -1731992137;
		else if (38 == i)
			anInt2821 = class282_sub35.readBigSmart(2087885749) * -967389061;
		else if (i == 39)
			anInt2792 = class282_sub35.readBigSmart(2007162727) * 1725030595;
		else if (i == 40)
			anInt2794 = class282_sub35.readBigSmart(1978513140) * -1544163167;
		else if (41 == i)
			anInt2795 = class282_sub35.readBigSmart(2139158557) * -963929139;
		else if (42 == i)
			anInt2796 = class282_sub35.readBigSmart(1976285617) * -1607820639;
		else if (i == 43)
			class282_sub35.readUnsignedShort();
		else if (i == 44)
			class282_sub35.readUnsignedShort();
		else if (45 == i)
			anInt2798 = class282_sub35.readUnsignedShort() * -286307705;
		else if (46 == i)
			anInt2830 = class282_sub35.readBigSmart(1944021085) * -1358044133;
		else if (i == 47)
			anInt2806 = class282_sub35.readBigSmart(2099028126) * -602180007;
		else if (i == 48)
			anInt2807 = class282_sub35.readBigSmart(2040562333) * -311781873;
		else if (49 == i)
			anInt2808 = class282_sub35.readBigSmart(1978396905) * 1032347705;
		else if (i == 50)
			anInt2809 = class282_sub35.readBigSmart(2087244363) * 1310162937;
		else if (i == 51)
			anInt2810 = class282_sub35.readBigSmart(1956496496) * -1871121921;
		else if (52 == i) {
			int i_52_ = class282_sub35.readUnsignedByte();
			anIntArray2814 = new int[i_52_];
			anIntArray2789 = new int[i_52_];
			for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
				anIntArray2814[i_53_] = class282_sub35.readBigSmart(1947418569);
				int i_54_ = class282_sub35.readUnsignedByte();
				anIntArray2789[i_53_] = i_54_;
				((Class227) this).anInt2822 += -685147451 * i_54_;
			}
		} else if (53 == i)
			aBool2787 = false;
		else if (i == 54) {
			anInt2813 = (class282_sub35.readUnsignedByte() << 6) * -4475195;
			anInt2790 = (class282_sub35.readUnsignedByte() << 6) * 1862251257;
		} else if (i == 55) {
			if (anIntArray2818 == null)
				anIntArray2818 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length];
			int i_55_ = class282_sub35.readUnsignedByte();
			anIntArray2818[i_55_] = class282_sub35.readUnsignedShort();
		} else if (i == 56) {
			if (null == anIntArrayArray2791)
				anIntArrayArray2791 = new int[(((Class211) ((Class227) this).aClass211_2788).aClass526_2672.equipmentSlots).length][];
			int i_56_ = class282_sub35.readUnsignedByte();
			anIntArrayArray2791[i_56_] = new int[3];
			for (int i_57_ = 0; i_57_ < 3; i_57_++)
				anIntArrayArray2791[i_56_][i_57_] = class282_sub35.readShort(2011863070);
		}
	}

	void method3819(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method3808(class282_sub35, i, -1137707937);
		}
	}

	public boolean method3820(int i) {
		if (i == -1)
			return false;
		if (i == -243982531 * anInt2819)
			return true;
		if (null != anIntArray2814) {
			for (int i_58_ = 0; i_58_ < anIntArray2814.length; i_58_++) {
				if (anIntArray2814[i_58_] == i)
					return true;
			}
		}
		return false;
	}

	void method3821(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_59_ = class282_sub35.readUnsignedByte();
			if (0 == i_59_)
				break;
			method3808(class282_sub35, i_59_, -374840735);
		}
	}

	public Class294[] method3822() {
		if (((Class227) this).aClass294Array2805 != null)
			return ((Class227) this).aClass294Array2805;
		if (null == anIntArrayArray2802)
			return null;
		((Class227) this).aClass294Array2805 = new Class294[anIntArrayArray2802.length];
		for (int i = 0; i < anIntArrayArray2802.length; i++) {
			int i_60_ = 0;
			int i_61_ = 0;
			int i_62_ = 0;
			int i_63_ = 0;
			int i_64_ = 0;
			int i_65_ = 0;
			if (null != anIntArrayArray2802[i]) {
				i_60_ = anIntArrayArray2802[i][0];
				i_61_ = anIntArrayArray2802[i][1];
				i_62_ = anIntArrayArray2802[i][2];
				i_63_ = anIntArrayArray2802[i][3] << 3;
				i_64_ = anIntArrayArray2802[i][4] << 3;
				i_65_ = anIntArrayArray2802[i][5] << 3;
			}
			if (0 != i_60_ || i_61_ != 0 || 0 != i_62_ || 0 != i_63_ || i_64_ != 0 || 0 != i_65_) {
				Class294 class294 = ((Class227) this).aClass294Array2805[i] = new Class294();
				if (i_65_ != 0)
					class294.method5220(0.0F, 0.0F, 1.0F, Class382.method6508(i_65_));
				if (i_63_ != 0)
					class294.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(i_63_));
				if (i_64_ != 0)
					class294.method5220(0.0F, 1.0F, 0.0F, Class382.method6508(i_64_));
				class294.method5219((float) i_60_, (float) i_61_, (float) i_62_);
			}
		}
		return ((Class227) this).aClass294Array2805;
	}

	public Class294[] method3823() {
		if (((Class227) this).aClass294Array2805 != null)
			return ((Class227) this).aClass294Array2805;
		if (null == anIntArrayArray2802)
			return null;
		((Class227) this).aClass294Array2805 = new Class294[anIntArrayArray2802.length];
		for (int i = 0; i < anIntArrayArray2802.length; i++) {
			int i_66_ = 0;
			int i_67_ = 0;
			int i_68_ = 0;
			int i_69_ = 0;
			int i_70_ = 0;
			int i_71_ = 0;
			if (null != anIntArrayArray2802[i]) {
				i_66_ = anIntArrayArray2802[i][0];
				i_67_ = anIntArrayArray2802[i][1];
				i_68_ = anIntArrayArray2802[i][2];
				i_69_ = anIntArrayArray2802[i][3] << 3;
				i_70_ = anIntArrayArray2802[i][4] << 3;
				i_71_ = anIntArrayArray2802[i][5] << 3;
			}
			if (0 != i_66_ || i_67_ != 0 || 0 != i_68_ || 0 != i_69_ || i_70_ != 0 || 0 != i_71_) {
				Class294 class294 = ((Class227) this).aClass294Array2805[i] = new Class294();
				if (i_71_ != 0)
					class294.method5220(0.0F, 0.0F, 1.0F, Class382.method6508(i_71_));
				if (i_69_ != 0)
					class294.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(i_69_));
				if (i_70_ != 0)
					class294.method5220(0.0F, 1.0F, 0.0F, Class382.method6508(i_70_));
				class294.method5219((float) i_66_, (float) i_67_, (float) i_68_);
			}
		}
		return ((Class227) this).aClass294Array2805;
	}

	public int[] method3824() {
		SwitchMap class465 = new SwitchMap(16);
		Class1.method253(-243982531 * anInt2819, class465, 1898656425);
		if (anIntArray2814 != null) {
			int[] is = anIntArray2814;
			for (int i = 0; i < is.length; i++) {
				int i_72_ = is[i];
				Class1.method253(i_72_, class465, -11471264);
			}
		}
		Class1.method253(1350078131 * anInt2821, class465, 472127421);
		Class1.method253(997445611 * anInt2792, class465, -620836799);
		Class1.method253(-1556707231 * anInt2793, class465, -919336251);
		Class1.method253(anInt2794 * -670567583, class465, -1373094019);
		Class1.method253(-1950693115 * anInt2795, class465, -1916098048);
		Class1.method253(anInt2796 * -762066591, class465, 1075423986);
		Class1.method253(anInt2797 * -474675041, class465, 1116671987);
		Class1.method253(anInt2817 * 486149589, class465, -2078528144);
		Class1.method253(anInt2799 * 1642803439, class465, -1719488771);
		Class1.method253(anInt2800 * -833477781, class465, -1605014581);
		Class1.method253(2055956425 * anInt2801, class465, 848057833);
		Class1.method253(1053306035 * anInt2828, class465, -1090909210);
		Class1.method253(anInt2803 * 1879075923, class465, 1210379638);
		Class1.method253(anInt2812 * 1489597113, class465, -158395196);
		Class1.method253(-1250601453 * anInt2830, class465, -974618895);
		Class1.method253(anInt2806 * -1184599575, class465, -341360743);
		Class1.method253(anInt2807 * 1179359471, class465, -1436085315);
		Class1.method253(anInt2808 * -578974199, class465, 776620510);
		Class1.method253(anInt2809 * 871699017, class465, 1706687972);
		Class1.method253(anInt2810 * 1656950271, class465, 1342527577);
		int[] is = new int[class465.method7748((short) 552)];
		int i = 0;
		Iterator iterator = class465.iterator();
		while (iterator.hasNext()) {
			Class282 class282 = (Class282) iterator.next();
			is[i++] = (int) (class282.aLong3379 * -3442165056282524525L);
		}
		return is;
	}

	public int[] method3825() {
		SwitchMap class465 = new SwitchMap(16);
		Class1.method253(-243982531 * anInt2819, class465, -266659410);
		if (anIntArray2814 != null) {
			int[] is = anIntArray2814;
			for (int i = 0; i < is.length; i++) {
				int i_73_ = is[i];
				Class1.method253(i_73_, class465, -427525328);
			}
		}
		Class1.method253(1350078131 * anInt2821, class465, -1610311638);
		Class1.method253(997445611 * anInt2792, class465, -762944770);
		Class1.method253(-1556707231 * anInt2793, class465, -281484610);
		Class1.method253(anInt2794 * -670567583, class465, -184789283);
		Class1.method253(-1950693115 * anInt2795, class465, -1971640389);
		Class1.method253(anInt2796 * -762066591, class465, -851870855);
		Class1.method253(anInt2797 * -474675041, class465, -239460374);
		Class1.method253(anInt2817 * 486149589, class465, 741702428);
		Class1.method253(anInt2799 * 1642803439, class465, -554197728);
		Class1.method253(anInt2800 * -833477781, class465, 722968259);
		Class1.method253(2055956425 * anInt2801, class465, 2052092357);
		Class1.method253(1053306035 * anInt2828, class465, -411015122);
		Class1.method253(anInt2803 * 1879075923, class465, 2050048369);
		Class1.method253(anInt2812 * 1489597113, class465, 1062780139);
		Class1.method253(-1250601453 * anInt2830, class465, -1459762577);
		Class1.method253(anInt2806 * -1184599575, class465, 21934698);
		Class1.method253(anInt2807 * 1179359471, class465, 1849243735);
		Class1.method253(anInt2808 * -578974199, class465, -140965108);
		Class1.method253(anInt2809 * 871699017, class465, 26677144);
		Class1.method253(anInt2810 * 1656950271, class465, 421229620);
		int[] is = new int[class465.method7748((short) -2352)];
		int i = 0;
		Iterator iterator = class465.iterator();
		while (iterator.hasNext()) {
			Class282 class282 = (Class282) iterator.next();
			is[i++] = (int) (class282.aLong3379 * -3442165056282524525L);
		}
		return is;
	}

	public int[] method3826() {
		SwitchMap class465 = new SwitchMap(16);
		Class1.method253(-243982531 * anInt2819, class465, -2092613109);
		if (anIntArray2814 != null) {
			int[] is = anIntArray2814;
			for (int i = 0; i < is.length; i++) {
				int i_74_ = is[i];
				Class1.method253(i_74_, class465, 1519818068);
			}
		}
		Class1.method253(1350078131 * anInt2821, class465, -1892090751);
		Class1.method253(997445611 * anInt2792, class465, 1865416705);
		Class1.method253(-1556707231 * anInt2793, class465, -900678316);
		Class1.method253(anInt2794 * -670567583, class465, -1236332291);
		Class1.method253(-1950693115 * anInt2795, class465, -1195949063);
		Class1.method253(anInt2796 * -762066591, class465, 495768147);
		Class1.method253(anInt2797 * -474675041, class465, -837031540);
		Class1.method253(anInt2817 * 486149589, class465, 1900408406);
		Class1.method253(anInt2799 * 1642803439, class465, -1827802526);
		Class1.method253(anInt2800 * -833477781, class465, 373212097);
		Class1.method253(2055956425 * anInt2801, class465, -133076837);
		Class1.method253(1053306035 * anInt2828, class465, 599435963);
		Class1.method253(anInt2803 * 1879075923, class465, 400363437);
		Class1.method253(anInt2812 * 1489597113, class465, 275282671);
		Class1.method253(-1250601453 * anInt2830, class465, -409337607);
		Class1.method253(anInt2806 * -1184599575, class465, 1855414935);
		Class1.method253(anInt2807 * 1179359471, class465, 1593213272);
		Class1.method253(anInt2808 * -578974199, class465, 1850220177);
		Class1.method253(anInt2809 * 871699017, class465, -1016684625);
		Class1.method253(anInt2810 * 1656950271, class465, -153115799);
		int[] is = new int[class465.method7748((short) -5002)];
		int i = 0;
		Iterator iterator = class465.iterator();
		while (iterator.hasNext()) {
			Class282 class282 = (Class282) iterator.next();
			is[i++] = (int) (class282.aLong3379 * -3442165056282524525L);
		}
		return is;
	}

	public int[] method3827() {
		SwitchMap class465 = new SwitchMap(16);
		Class1.method253(-243982531 * anInt2819, class465, -754570121);
		if (anIntArray2814 != null) {
			int[] is = anIntArray2814;
			for (int i = 0; i < is.length; i++) {
				int i_75_ = is[i];
				Class1.method253(i_75_, class465, 662783852);
			}
		}
		Class1.method253(1350078131 * anInt2821, class465, -180839851);
		Class1.method253(997445611 * anInt2792, class465, -43549253);
		Class1.method253(-1556707231 * anInt2793, class465, 1381783464);
		Class1.method253(anInt2794 * -670567583, class465, -470601132);
		Class1.method253(-1950693115 * anInt2795, class465, 1236283669);
		Class1.method253(anInt2796 * -762066591, class465, 1000003370);
		Class1.method253(anInt2797 * -474675041, class465, 1172458779);
		Class1.method253(anInt2817 * 486149589, class465, -1268567506);
		Class1.method253(anInt2799 * 1642803439, class465, 380194981);
		Class1.method253(anInt2800 * -833477781, class465, -14877597);
		Class1.method253(2055956425 * anInt2801, class465, -247382893);
		Class1.method253(1053306035 * anInt2828, class465, 927162862);
		Class1.method253(anInt2803 * 1879075923, class465, -743533489);
		Class1.method253(anInt2812 * 1489597113, class465, -284658908);
		Class1.method253(-1250601453 * anInt2830, class465, -1740415650);
		Class1.method253(anInt2806 * -1184599575, class465, 2027787929);
		Class1.method253(anInt2807 * 1179359471, class465, 2030733293);
		Class1.method253(anInt2808 * -578974199, class465, 1989610551);
		Class1.method253(anInt2809 * 871699017, class465, -1904783265);
		Class1.method253(anInt2810 * 1656950271, class465, 2133496132);
		int[] is = new int[class465.method7748((short) -5677)];
		int i = 0;
		Iterator iterator = class465.iterator();
		while (iterator.hasNext()) {
			Class282 class282 = (Class282) iterator.next();
			is[i++] = (int) (class282.aLong3379 * -3442165056282524525L);
		}
		return is;
	}

	public int[] method3828(int i) {
		SwitchMap class465 = new SwitchMap(16);
		Class1.method253(-243982531 * anInt2819, class465, 1339333196);
		if (anIntArray2814 != null) {
			int[] is = anIntArray2814;
			for (int i_76_ = 0; i_76_ < is.length; i_76_++) {
				int i_77_ = is[i_76_];
				Class1.method253(i_77_, class465, -371482637);
			}
		}
		Class1.method253(1350078131 * anInt2821, class465, 936766272);
		Class1.method253(997445611 * anInt2792, class465, 617830168);
		Class1.method253(-1556707231 * anInt2793, class465, 622026359);
		Class1.method253(anInt2794 * -670567583, class465, -1286273225);
		Class1.method253(-1950693115 * anInt2795, class465, 1136269352);
		Class1.method253(anInt2796 * -762066591, class465, 981784054);
		Class1.method253(anInt2797 * -474675041, class465, -432276567);
		Class1.method253(anInt2817 * 486149589, class465, -24099782);
		Class1.method253(anInt2799 * 1642803439, class465, -472783883);
		Class1.method253(anInt2800 * -833477781, class465, 843907387);
		Class1.method253(2055956425 * anInt2801, class465, -622930621);
		Class1.method253(1053306035 * anInt2828, class465, -405283185);
		Class1.method253(anInt2803 * 1879075923, class465, -576014447);
		Class1.method253(anInt2812 * 1489597113, class465, 1786049859);
		Class1.method253(-1250601453 * anInt2830, class465, 918825528);
		Class1.method253(anInt2806 * -1184599575, class465, 854789085);
		Class1.method253(anInt2807 * 1179359471, class465, 230817910);
		Class1.method253(anInt2808 * -578974199, class465, -1749638);
		Class1.method253(anInt2809 * 871699017, class465, 2115368709);
		Class1.method253(anInt2810 * 1656950271, class465, -1020829225);
		int[] is = new int[class465.method7748((short) 9430)];
		int i_78_ = 0;
		Iterator iterator = class465.iterator();
		while (iterator.hasNext()) {
			Class282 class282 = (Class282) iterator.next();
			is[i_78_++] = (int) (class282.aLong3379 * -3442165056282524525L);
		}
		return is;
	}

	static final void method3829(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class412.aByte4963;
	}

	static final void method3830(CS2Executor class527, byte i) {
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(Class468.method7788((long) (((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537)]) * 60000L, Class223.aClass495_2772.method243((byte) 1), true, 1560112549)).append(" UTC").toString();
	}
}
