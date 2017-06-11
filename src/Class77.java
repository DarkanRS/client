/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class77 {
	public static Class77 aClass77_714;
	static Class77 aClass77_715;
	static Class77 aClass77_716;
	public static Class77 aClass77_717;
	public static Class77 aClass77_718;
	public static Class77 aClass77_719;
	static Class77 aClass77_720 = new Class77(2, 1);
	public static Class77 aClass77_721;
	static Class77 aClass77_722 = new Class77(5, 2);
	public int anInt723;
	public int anInt724;

	static {
		aClass77_716 = new Class77(8, 4);
		aClass77_717 = new Class77(1, 1);
		aClass77_718 = new Class77(6, 2);
		aClass77_719 = new Class77(7, 3);
		aClass77_715 = new Class77(0, 4);
		aClass77_714 = new Class77(4, 2);
		aClass77_721 = new Class77(3, 4);
	}

	Class77(int i, int i_0_) {
		anInt723 = i * 115261893;
		anInt724 = -2085880873 * i_0_;
	}

	static final void method839(ClientScript2 class403, int i) {
		try {
			String string;
			if (Class287.myPlayer != null && null != (Class287.myPlayer.displayName))
				string = Class287.myPlayer.method4475(false, (byte) -122);
			else
				string = "";
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dc.acq(").append(')').toString());
		}
	}

	public static byte[] method840(CharSequence charsequence, int i) {
		try {
			int i_1_ = charsequence.length();
			byte[] is = new byte[i_1_];
			for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
				char c = charsequence.charAt(i_2_);
				if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
					is[i_2_] = (byte) c;
				else if ('\u20ac' == c)
					is[i_2_] = (byte) -128;
				else if ('\u201a' == c)
					is[i_2_] = (byte) -126;
				else if ('\u0192' == c)
					is[i_2_] = (byte) -125;
				else if (c == '\u201e')
					is[i_2_] = (byte) -124;
				else if ('\u2026' == c)
					is[i_2_] = (byte) -123;
				else if ('\u2020' == c)
					is[i_2_] = (byte) -122;
				else if ('\u2021' == c)
					is[i_2_] = (byte) -121;
				else if ('\u02c6' == c)
					is[i_2_] = (byte) -120;
				else if ('\u2030' == c)
					is[i_2_] = (byte) -119;
				else if ('\u0160' == c)
					is[i_2_] = (byte) -118;
				else if (c == '\u2039')
					is[i_2_] = (byte) -117;
				else if ('\u0152' == c)
					is[i_2_] = (byte) -116;
				else if (c == '\u017d')
					is[i_2_] = (byte) -114;
				else if ('\u2018' == c)
					is[i_2_] = (byte) -111;
				else if ('\u2019' == c)
					is[i_2_] = (byte) -110;
				else if (c == '\u201c')
					is[i_2_] = (byte) -109;
				else if ('\u201d' == c)
					is[i_2_] = (byte) -108;
				else if (c == '\u2022')
					is[i_2_] = (byte) -107;
				else if ('\u2013' == c)
					is[i_2_] = (byte) -106;
				else if ('\u2014' == c)
					is[i_2_] = (byte) -105;
				else if ('\u02dc' == c)
					is[i_2_] = (byte) -104;
				else if ('\u2122' == c)
					is[i_2_] = (byte) -103;
				else if ('\u0161' == c)
					is[i_2_] = (byte) -102;
				else if (c == '\u203a')
					is[i_2_] = (byte) -101;
				else if (c == '\u0153')
					is[i_2_] = (byte) -100;
				else if ('\u017e' == c)
					is[i_2_] = (byte) -98;
				else if ('\u0178' == c)
					is[i_2_] = (byte) -97;
				else
					is[i_2_] = (byte) 63;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dc.i(").append(')').toString());
		}
	}

	public static boolean method841(int i, int i_3_, byte i_4_) {
		try {
			if (!Class436.aBoolean5478)
				return false;
			int i_5_ = i >> 16;
			int i_6_ = i & 0xffff;
			if (Class389.aClass119Array4165[i_5_] == null || null == (Class389.aClass119Array4165[i_5_].aClass105Array1405[i_6_]))
				return false;
			IComponentDefinition class105 = Class389.aClass119Array4165[i_5_].aClass105Array1405[i_6_];
			if (i_3_ != -1 || class105.anInt1144 * -1215239439 != 0) {
				for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5939(1766612795)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5944(49146))) {
					if (-887503319 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9658 == i_3_ && (-440872681 * class105.anInt1142 == (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9663) * -502720623)
							&& (946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 58 || (946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 1007) || (946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 25) || 57 == (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 * 946432351) || (946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 30)))
						return true;
				}
			} else {
				for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5939(1766612795)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5944(49146))) {
					if (58 == 946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 || 1007 == 946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 || 946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 25 || 946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662 == 57 || 30 == (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662) * 946432351) {
						for (IComponentDefinition class105_7_ = Class50.getIComponentDefinitions((((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9663) * -502720623, (byte) -39); null != class105_7_; class105_7_ = Class523.method6331((Class389.aClass119Array4165[(((class105_7_.anInt1142) * -440872681) >> 16)]), class105_7_, -1653818376)) {
							if (-440872681 * class105_7_.anInt1142 == -440872681 * class105.anInt1142)
								return true;
						}
					}
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dc.ah(").append(')').toString());
		}
	}

	static void method842(int i, short i_8_) {
		try {
			Class82_Sub14.anInt6875 = i * -2076584633;
			Class301_Sub1.anInt7632 = 433609607;
			Class301_Sub1.anInt7627 = 789877945;
			Class225.method2103(65536);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dc.cj(").append(')').toString());
		}
	}
}
