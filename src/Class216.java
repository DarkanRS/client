/* Class216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class216 implements Interface24 {
	String aString6655;
	Class243 aClass243_6656;
	static String[] aStringArray6657;
	static int baseTileY;
	public static int anInt6659;
	static int anInt6660;

	public int method256(int i) {
		try {
			if (((Class216) this).aClass243_6656.method2312(((Class216) this).aString6655, -2147290732))
				return 100;
			return ((Class216) this).aClass243_6656.method2305(((Class216) this).aString6655, -1986969413);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jc.a(").append(')').toString());
		}
	}

	public Class463 method260(int i) {
		try {
			return Class463.aClass463_5686;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jc.f(").append(')').toString());
		}
	}

	Class216(Class243 class243, String string) {
		((Class216) this).aClass243_6656 = class243;
		((Class216) this).aString6655 = string;
	}

	public int method258() {
		if (((Class216) this).aClass243_6656.method2312(((Class216) this).aString6655, -2133628727))
			return 100;
		return ((Class216) this).aClass243_6656.method2305(((Class216) this).aString6655, -162075659);
	}

	public Class463 method259() {
		return Class463.aClass463_5686;
	}

	public Class463 method257() {
		return Class463.aClass463_5686;
	}

	public Class463 method261() {
		return Class463.aClass463_5686;
	}

	static ClientScript getClientScript(int i, byte i_0_) {
		try {
			ClientScript class298_sub37_sub17 = ((ClientScript) Class399.aClass354_5218.method4253((long) i));
			if (class298_sub37_sub17 != null)
				return class298_sub37_sub17;
			byte[] is = Class377.aClass243_4092.method2315(i, 0, (byte) 12);
			if (is == null || is.length <= 1)
				return null;
			try {
				class298_sub37_sub17 = ClanMember.method1775(is, (byte) 16);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i).toString());
			}
			Class399.aClass354_5218.method4255(class298_sub37_sub17, (long) i);
			return class298_sub37_sub17;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jc.f(").append(')').toString());
		}
	}

	static final void method1997(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class102 class102 = Class298_Sub40_Sub13.method3517(i_1_, -500483592);
			String string = "";
			if (null != class102 && null != class102.aString1089)
				string = class102.aString1089;
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jc.acz(").append(')').toString());
		}
	}

	public static int method1998(CharSequence charsequence, short i) {
		try {
			return Class422.method5619(charsequence, 10, true, -1228221916);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jc.i(").append(')').toString());
		}
	}

	static String method1999(int[] is, byte i) {
		try {
			StringBuilder stringbuilder = new StringBuilder();
			int i_2_ = -232961423 * Class277.anInt2964;
			for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
				Class369 class369 = Class316.aClass362_3318.method4307(is[i_3_], 245040087);
				if (class369.anInt4028 * 347977109 == -1) {
					if (i != 1)
						throw new IllegalStateException();
				} else {
					Class57 class57 = ((Class57) (Class436.aClass348_5500.method4184((long) (347977109 * class369.anInt4028))));
					if (class57 == null) {
						Class89 class89 = Class89.method987(Class158.aClass243_6364, class369.anInt4028 * 347977109, 0);
						if (class89 != null) {
							class57 = Class373.aClass_ra4071.method5125(class89, true);
							Class436.aClass348_5500.method4194(class57, (long) (class369.anInt4028 * 347977109));
						}
					}
					if (null != class57) {
						Class436.aClass57Array5501[i_2_] = class57;
						stringbuilder.append(" <img=").append(i_2_).append(">");
						i_2_++;
					}
				}
			}
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jc.bc(").append(')').toString());
		}
	}

	public static void method2000(boolean bool, boolean bool_4_, short i) {
		try {
			if (bool) {
				Class379.anInt4097 -= 1929855733;
				if (Class379.anInt4097 * -1320167075 == 0)
					Class379.anIntArray4096 = null;
			}
			if (bool_4_) {
				Class379.anInt4095 -= -1931699395;
				if (726176789 * Class379.anInt4095 == 0)
					Class294.anIntArray3165 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jc.f(").append(')').toString());
		}
	}

	public static final void method2001(boolean bool, byte i) {
		try {
			BufferedConnectionContext[] class25s = client.connectionContexts;
			for (int i_5_ = 0; i_5_ < class25s.length; i_5_++) {
				BufferedConnectionContext class25 = class25s[i_5_];
				try {
					class25.method386(-1494345865);
				} catch (IOException ioexception) {
					/* empty */
				}
				class25.method384((byte) 56);
			}
			IComponentSettings.method3503(-20644488);
			Class223.method2082(false, -1663847334);
			client.aClass283_8716.method2646((byte) 8);
			client.aClass283_8716.method2666(-2101576654);
			Class423.method5733(false, 1336561252);
			Class104.method1108(2, 207248326);
			Class300.anInt3207 = 184109511;
			Class300.aBoolean3208 = false;
			Class14.method344(-1865838561);
			Class264_Sub4.method2513(true, -2090545066);
			Class173.method1826(-1182326447);
			Class127_Sub1.method1427(-1799886054);
			Class264_Sub2.method2506(-1759070114);
			if (bool)
				Class439.method5851(6, 628188692);
			else {
				Class439.method5851(19, -244529723);
				try {
					Class466.method6021(ClientScriptMap.anApplet6044, "loggedout", (short) 24145);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jc.gi(").append(')').toString());
		}
	}

	static void method2002(int i, int i_6_) {
		try {
			Class298_Sub9.anInt7225 = -747654435 * i;
			Class298_Sub9.aClass348_7223.method4187();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jc.s(").append(')').toString());
		}
	}

	static final void method2003(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class287.myPlayer.aClass386_10084.method4719((byte) 0) >> 3;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jc.uc(").append(')').toString());
		}
	}
}
