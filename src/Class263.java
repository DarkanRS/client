
/* Class263 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

import jaclib.nanotime.QueryPerformanceCounter;

public abstract class Class263 implements Interface24, Runnable, FocusListener, WindowListener {
	static final int anInt3241 = 524288000;
	static long aLong3242 = -4661227965373235968L;
	public static int anInt3243;
	public static Class273 aClass273_3244;
	static final int anInt3245 = 32;
	static long[] aLongArray3246;
	static long[] aLongArray3247;
	static final int anInt3248 = 1;
	public static int anInt3249;
	public static int anInt3250;
	public static int anInt3251;
	protected static String aString3252;
	public static int anInt3253 = 0;
	boolean aBool3254 = false;
	static long aLong3255;
	static int anInt3256;
	protected static volatile boolean aBool3257;
	static final String aString3258 = "main_file_cache.idx255";
	protected static boolean aBool3259;
	public static Frame aFrame3260;
	public static Frame aFrame3261;
	static final int anInt3262 = 1048576;
	static final String aString3263 = "rw";
	static File aFile3264;
	static final String aString3265 = "main_file_cache.dat2";
	static final String aString3266 = "main_file_cache.idx";
	static Class279 aClass279_3267;
	boolean aBool3268 = false;
	static Class440 aClass440_3269;
	protected static Class440 aClass440_3270;
	static Class440 aClass440_3271;
	static final int anInt3272 = 0;
	public static int anInt3273;
	protected static volatile boolean aBool3274;
	static volatile boolean aBool3275;
	static boolean aBool3276;
	public static int anInt3277;
	static final String aString3278 = "random.dat";
	static int anInt3279;
	static volatile long aLong3280;

	public final void method4654(WindowEvent windowevent) {
		/* empty */
	}

	public void supplyApplet(Applet applet) {
		Class282_Sub44.anApplet8065 = applet;
	}

	final void method4655(Class274 class274, String string, String string_0_, int i, int i_1_, int i_2_, int i_3_, boolean bool, int i_4_) {
		try {
			method4683(Class279.aClass279_3369, bool, 1311506683);
			Class45.anInt434 = ((Class349.anInt4083 = class274.method4871(16711680) * -1943418639) * -2106436815);
			Class107.anInt1082 = ((anInt3243 = class274.method4877((byte) 14) * -1929118563) * 154419059);
			anInt3250 = 0;
			anInt3251 = 0;
			if (NamedFileReference.method867(-1097326159) == Class279.aClass279_3367) {
				Class45.anInt434 += 2062496322 * class274.method4868((short) 128);
				Class107.anInt1082 += 1370635022 * class274.method4872((byte) -78);
				method4661(class274.method4870(1701502832), (short) 2048);
			}
			RuntimeException_Sub3.anApplet10460 = Class282_Sub44.anApplet8065;
			method4656(string, string_0_, i, i_1_, i_2_, i_3_, 311924431);
		} catch (Throwable throwable) {
			Class151.method2594(null, throwable, (byte) -115);
			method4680("crash", -1314193107);
		}
	}

	final void method4656(String string, String string_5_, int i, int i_6_, int i_7_, int i_8_, int i_9_) throws Exception {
		Class290.anInt3451 = i_6_ * -172911177;
		Class514.anInt5887 = 1182973571 * i;
		RuntimeException_Sub3.anInt10457 = 108751791 * i_7_;
		Class392.anInt4781 = 122429149 * i_8_;
		Class282_Sub20_Sub34.aString9967 = "Unknown";
		Class108.aString1093 = "1.1";
		try {
			Class282_Sub20_Sub34.aString9967 = System.getProperty("java.vendor");
			Class108.aString1093 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			RuntimeException_Sub4.aString10463 = System.getProperty("os.name");
		} catch (Exception exception) {
			RuntimeException_Sub4.aString10463 = "Unknown";
		}
		Class225_Sub6.aString8069 = RuntimeException_Sub4.aString10463.toLowerCase();
		try {
			Class402.aString4828 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class402.aString4828 = "";
		}
		try {
			Class231.aString2876 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			Class231.aString2876 = "";
		}
		try {
			Class110.aString1103 = System.getProperty("user.home");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class225_Sub6.aString8069.startsWith("win")) {
				if (null == Class110.aString1103)
					Class110.aString1103 = System.getenv("USERPROFILE");
			} else if (null == Class110.aString1103)
				Class110.aString1103 = System.getenv("HOME");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (null == Class110.aString1103)
			Class110.aString1103 = "~/";
		try {
			Class282_Sub50_Sub17.anEventQueue10074 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class246.aStringArray3028 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class110.aString1103, "/tmp/", "" };
		Class106.aStringArray1077 = new String[] { new StringBuilder().append(".jagex_cache_").append(-1179779029 * Class514.anInt5887).toString(), new StringBuilder().append(".file_store_").append(Class514.anInt5887 * -1179779029).toString() };
		while_52_: for (int i_10_ = 0; i_10_ < 4; i_10_++) {
			aFile3264 = method4657(string, string_5_, i_10_, (byte) 75);
			if (!aFile3264.exists())
				aFile3264.mkdirs();
			File[] files = aFile3264.listFiles();
			if (null != files) {
				File[] files_11_ = files;
				for (int i_12_ = 0; i_12_ < files_11_.length; i_12_++) {
					File file = files_11_[i_12_];
					if (!method4720(file, false, (byte) -47))
						continue while_52_;
				}
			}
			break;
		}
		Class499.method8334(aFile3264, 1977794836);
		Class328.method5827((short) -23494);
		aClass440_3270 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.dat2", 1605505802)), "rw", 524288000L), 5200, 0);
		aClass440_3271 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.idx255", 526140284)), "rw", 1048576L), 6000, 0);
		Class97.aClass440Array996 = new Class440[Class290.anInt3451 * 2026002439];
		for (int i_13_ = 0; i_13_ < Class290.anInt3451 * 2026002439; i_13_++)
			Class97.aClass440Array996[i_13_] = new Class440(new Class442((Class96_Sub23.method14681(new StringBuilder().append("main_file_cache.idx").append(i_13_).toString(), 535964137)), "rw", 1048576L), 6000, 0);
		try {
			Class274.aClass470_3336 = new Class470();
		} catch (Exception exception) {
			Class475.aBool5623 = false;
		}
		MeshModifier.aClass267_5026 = new Class267();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_14_ = threadgroup.getParent(); null != threadgroup_14_; threadgroup_14_ = threadgroup.getParent())
			threadgroup = threadgroup_14_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_15_ = 0; i_15_ < threads.length; i_15_++) {
			if (null != threads[i_15_] && threads[i_15_].getName().startsWith("AWT"))
				threads[i_15_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	File method4657(String string, String string_16_, int i, byte i_17_) {
		String string_18_ = (i == 0 ? "" : new StringBuilder().append("").append(i).toString());
		Canvas_Sub1.aFile9453 = new File(Class110.aString1103, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_16_).append(string_18_).append(".dat").toString());
		String string_19_ = null;
		String string_20_ = null;
		boolean bool = false;
		if (Canvas_Sub1.aFile9453.exists()) {
			try {
				Class442 class442 = new Class442(Canvas_Sub1.aFile9453, "rw", 10000L);
				int i_21_;
				RsByteBuffer class282_sub35;
				for (class282_sub35 = (new RsByteBuffer((int) class442.method7388(-273347477))); (class282_sub35.index * -1990677291 < class282_sub35.buffer.length); class282_sub35.index += i_21_ * -1115476867) {
					i_21_ = class442.method7389(class282_sub35.buffer, (class282_sub35.index * -1990677291), ((class282_sub35.buffer).length - (-1990677291 * class282_sub35.index)), (byte) -53);
					if (-1 == i_21_)
						throw new IOException();
				}
				class282_sub35.index = 0;
				i_21_ = class282_sub35.readUnsignedByte();
				if (i_21_ < 1 || i_21_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_21_).toString());
				int i_22_ = 0;
				if (i_21_ > 1)
					i_22_ = class282_sub35.readUnsignedByte();
				if (i_21_ <= 2) {
					string_19_ = class282_sub35.readGJString(413750486);
					if (1 == i_22_)
						string_20_ = class282_sub35.readGJString(633964103);
				} else {
					string_19_ = class282_sub35.method13248(-961534937);
					if (i_22_ == 1)
						string_20_ = class282_sub35.method13248(-1576651752);
				}
				class442.method7385((short) 22499);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (string_19_ != null) {
				File file = new File(string_19_);
				if (!file.exists())
					string_19_ = null;
			}
			if (string_19_ != null) {
				File file = new File(string_19_, "test.dat");
				if (!method4720(file, true, (byte) -16))
					string_19_ = null;
			}
		}
		if (string_19_ == null && 0 == i) {
			while_53_: for (int i_23_ = 0; i_23_ < Class106.aStringArray1077.length; i_23_++) {
				for (int i_24_ = 0; i_24_ < Class246.aStringArray3028.length; i_24_++) {
					File file = new File(new StringBuilder().append(Class246.aStringArray3028[i_24_]).append(Class106.aStringArray1077[i_23_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method4720(new File(file, "test.dat"), true, (byte) -97)) {
						string_19_ = file.toString();
						bool = true;
						break while_53_;
					}
				}
			}
		}
		if (null == string_19_) {
			string_19_ = new StringBuilder().append(Class110.aString1103).append(File.separatorChar).append("jagexcache").append(string_18_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_16_).append(File.separatorChar).toString();
			bool = true;
		}
		if (string_20_ != null) {
			File file = new File(string_20_);
			File file_25_ = new File(string_19_);
			try {
				File[] files = file.listFiles();
				File[] files_26_ = files;
				for (int i_27_ = 0; i_27_ < files_26_.length; i_27_++) {
					File file_28_ = files_26_[i_27_];
					File file_29_ = new File(file_25_, file_28_.getName());
					boolean bool_30_ = file_28_.renameTo(file_29_);
					if (!bool_30_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method4659(new File(string_19_), null, -1666415972);
		return new File(string_19_);
	}

	public boolean method4658(File file, int i) {
		if (null == file)
			return false;
		if (!file.exists())
			return false;
		if (!file.isDirectory())
			return false;
		if (file.listFiles().length != 0)
			return false;
		if (!method4720(new File(file, "test.dat"), true, (byte) -106))
			return false;
		method4659(file, aFile3264, -2119897926);
		return true;
	}

	void method4659(File file, File file_31_, int i) {
		try {
			Class442 class442 = new Class442(Canvas_Sub1.aFile9453, "rw", 10000L);
			RsByteBuffer class282_sub35 = new RsByteBuffer(500);
			class282_sub35.writeByte(3);
			class282_sub35.writeByte(null != file_31_ ? 1 : 0);
			class282_sub35.method13071(file.getPath(), (byte) 46);
			if (file_31_ != null)
				class282_sub35.method13071(file_31_.getPath(), (byte) 32);
			class442.method7386(class282_sub35.buffer, 0, class282_sub35.index * -1990677291, -724626289);
			class442.method7385((short) 5959);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	File method4660(String string, String string_32_, int i) {
		String string_33_ = (i == 0 ? "" : new StringBuilder().append("").append(i).toString());
		Canvas_Sub1.aFile9453 = new File(Class110.aString1103, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_32_).append(string_33_).append(".dat").toString());
		String string_34_ = null;
		String string_35_ = null;
		boolean bool = false;
		if (Canvas_Sub1.aFile9453.exists()) {
			try {
				Class442 class442 = new Class442(Canvas_Sub1.aFile9453, "rw", 10000L);
				int i_36_;
				RsByteBuffer class282_sub35;
				for (class282_sub35 = (new RsByteBuffer((int) class442.method7388(-273347477))); (class282_sub35.index * -1990677291 < class282_sub35.buffer.length); class282_sub35.index += i_36_ * -1115476867) {
					i_36_ = class442.method7389(class282_sub35.buffer, (class282_sub35.index * -1990677291), ((class282_sub35.buffer).length - (-1990677291 * class282_sub35.index)), (byte) -93);
					if (-1 == i_36_)
						throw new IOException();
				}
				class282_sub35.index = 0;
				i_36_ = class282_sub35.readUnsignedByte();
				if (i_36_ < 1 || i_36_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_36_).toString());
				int i_37_ = 0;
				if (i_36_ > 1)
					i_37_ = class282_sub35.readUnsignedByte();
				if (i_36_ <= 2) {
					string_34_ = class282_sub35.readGJString(279990287);
					if (1 == i_37_)
						string_35_ = class282_sub35.readGJString(146017391);
				} else {
					string_34_ = class282_sub35.method13248(-806756641);
					if (i_37_ == 1)
						string_35_ = class282_sub35.method13248(-1822038807);
				}
				class442.method7385((short) 22295);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (string_34_ != null) {
				File file = new File(string_34_);
				if (!file.exists())
					string_34_ = null;
			}
			if (string_34_ != null) {
				File file = new File(string_34_, "test.dat");
				if (!method4720(file, true, (byte) -9))
					string_34_ = null;
			}
		}
		if (string_34_ == null && 0 == i) {
			while_54_: for (int i_38_ = 0; i_38_ < Class106.aStringArray1077.length; i_38_++) {
				for (int i_39_ = 0; i_39_ < Class246.aStringArray3028.length; i_39_++) {
					File file = new File(new StringBuilder().append(Class246.aStringArray3028[i_39_]).append(Class106.aStringArray1077[i_38_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method4720(new File(file, "test.dat"), true, (byte) -68)) {
						string_34_ = file.toString();
						bool = true;
						break while_54_;
					}
				}
			}
		}
		if (null == string_34_) {
			string_34_ = new StringBuilder().append(Class110.aString1103).append(File.separatorChar).append("jagexcache").append(string_33_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_32_).append(File.separatorChar).toString();
			bool = true;
		}
		if (string_35_ != null) {
			File file = new File(string_35_);
			File file_40_ = new File(string_34_);
			try {
				File[] files = file.listFiles();
				File[] files_41_ = files;
				for (int i_42_ = 0; i_42_ < files_41_.length; i_42_++) {
					File file_43_ = files_41_[i_42_];
					File file_44_ = new File(file_40_, file_43_.getName());
					boolean bool_45_ = file_43_.renameTo(file_44_);
					if (!bool_45_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method4659(new File(string_34_), null, -1039074149);
		return new File(string_34_);
	}

	synchronized void method4661(String string, short i) {
		aFrame3261 = new Frame();
		aFrame3261.setTitle(string);
		aFrame3261.setResizable(true);
		aFrame3261.addWindowListener(this);
		aFrame3261.setBackground(Color.black);
		aFrame3261.setVisible(true);
		aFrame3261.toFront();
		Insets insets = aFrame3261.getInsets();
		aFrame3261.setSize(insets.right + (Class45.anInt434 * -1016911135 + insets.left), (insets.top + Class107.anInt1082 * -499509193 + insets.bottom));
	}

	public boolean method4662(byte i) {
		return Class362.method6278(616047582).method222("jagtheora", -1470478737);
	}

	void method4663(Container container, int i) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class351.aCanvas4096);
		Class351.aCanvas4096.setSize(Class349.anInt4083 * -418109423, -969250379 * anInt3243);
		Class351.aCanvas4096.setVisible(true);
		if (container == aFrame3261) {
			Insets insets = aFrame3261.getInsets();
			Class351.aCanvas4096.setLocation((insets.left + anInt3250 * -1911940837), (insets.top + 698621615 * anInt3251));
		} else
			Class351.aCanvas4096.setLocation(-1911940837 * anInt3250, 698621615 * anInt3251);
		Class351.aCanvas4096.addFocusListener(this);
		Class351.aCanvas4096.requestFocus();
		Class530.aBool7050 = true;
		aBool3275 = true;
		Class351.aCanvas4096.setFocusTraversalKeysEnabled(false);
		aBool3274 = true;
		aBool3257 = false;
		aLong3280 = Class169.method2869(2040905349) * 3757206876099985283L;
	}

	public static final int method4664() {
		return (int) (1000000000L / (-2258443257437157839L * aLong3242));
	}

	final boolean method4665(byte i) {
		String string = Class282_Sub44.anApplet8065.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1") || string.endsWith("trentonkress.com"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method4680("invalidhost", -1367940016);
		return false;
	}

	public void run() {
		do {
			try {
				try {
					method4745((byte) -64);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class151.method2594(method4669(260769719), throwable, (byte) -107);
					method4680("crash", -1160452299);
					method4675(true, -1458406280);
					break;
				}
				method4675(true, -1505449815);
			} catch (Exception object) {
				method4675(true, -1953400023);
				//throw object;
			}
		} while (false);
	}

	public static final void method4666() {
		aClass273_3244.method4853(-1473028742);
		for (int i = 0; i < 32; i++)
			aLongArray3246[i] = 0L;
		for (int i = 0; i < 32; i++)
			aLongArray3247[i] = 0L;
		anInt3279 = 0;
	}

	void method4667(int i) {
		long l = Class169.method2869(1711185014);
		long l_46_ = aLongArray3247[-1079748253 * Class75.anInt747];
		aLongArray3247[Class75.anInt747 * -1079748253] = l;
		Class75.anInt747 = -2133856181 * (1 + -1079748253 * Class75.anInt747 & 0x1f);
		if (0L != l_46_ && l <= l_46_) {
			/* empty */
		}
		synchronized (this) {
			Class530.aBool7050 = aBool3275;
		}
		method4677(1918859196);
	}

	void method4668(int i) {
		long l = Class169.method2869(1929238921);
		long l_47_ = aLongArray3246[Class165.anInt2036 * 272435041];
		aLongArray3246[272435041 * Class165.anInt2036] = l;
		Class165.anInt2036 = (272435041 * Class165.anInt2036 + 1 & 0x1f) * -408429407;
		if (l_47_ != 0L && l > l_47_) {
			int i_48_ = (int) (l - l_47_);
			anInt3253 = -1808753135 * ((32000 + (i_48_ >> 1)) / i_48_);
		}
		if ((anInt3256 += -866862289) * 650144719 - 1 > 50) {
			anInt3256 -= -393441490;
			aBool3274 = true;
			Class351.aCanvas4096.setSize(Class349.anInt4083 * -418109423, -969250379 * anInt3243);
			Class351.aCanvas4096.setVisible(true);
			if (aFrame3261 != null && null == aFrame3260) {
				Insets insets = aFrame3261.getInsets();
				Class351.aCanvas4096.setLocation((insets.left + anInt3250 * -1911940837), (698621615 * anInt3251 + insets.top));
			} else
				Class351.aCanvas4096.setLocation(anInt3250 * -1911940837, 698621615 * anInt3251);
		}
		method4678(-2093077702);
	}

	String method4669(int i) {
		return null;
	}

	public final void method4670(WindowEvent windowevent) {
		aBool3259 = true;
		destroy();
	}

	final void method4671(String string, String string_49_, int i, int i_50_, int i_51_, int i_52_) throws Exception {
		Class290.anInt3451 = i_50_ * -172911177;
		Class514.anInt5887 = 1182973571 * i;
		RuntimeException_Sub3.anInt10457 = 108751791 * i_51_;
		Class392.anInt4781 = 122429149 * i_52_;
		Class282_Sub20_Sub34.aString9967 = "Unknown";
		Class108.aString1093 = "1.1";
		try {
			Class282_Sub20_Sub34.aString9967 = System.getProperty("java.vendor");
			Class108.aString1093 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			RuntimeException_Sub4.aString10463 = System.getProperty("os.name");
		} catch (Exception exception) {
			RuntimeException_Sub4.aString10463 = "Unknown";
		}
		Class225_Sub6.aString8069 = RuntimeException_Sub4.aString10463.toLowerCase();
		try {
			Class402.aString4828 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class402.aString4828 = "";
		}
		try {
			Class231.aString2876 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			Class231.aString2876 = "";
		}
		try {
			Class110.aString1103 = System.getProperty("user.home");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class225_Sub6.aString8069.startsWith("win")) {
				if (null == Class110.aString1103)
					Class110.aString1103 = System.getenv("USERPROFILE");
			} else if (null == Class110.aString1103)
				Class110.aString1103 = System.getenv("HOME");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (null == Class110.aString1103)
			Class110.aString1103 = "~/";
		try {
			Class282_Sub50_Sub17.anEventQueue10074 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class246.aStringArray3028 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class110.aString1103, "/tmp/", "" };
		Class106.aStringArray1077 = new String[] { new StringBuilder().append(".jagex_cache_").append(-1179779029 * Class514.anInt5887).toString(), new StringBuilder().append(".file_store_").append(Class514.anInt5887 * -1179779029).toString() };
		while_56_: for (int i_53_ = 0; i_53_ < 4; i_53_++) {
			aFile3264 = method4657(string, string_49_, i_53_, (byte) 9);
			if (!aFile3264.exists())
				aFile3264.mkdirs();
			File[] files = aFile3264.listFiles();
			if (null != files) {
				File[] files_54_ = files;
				for (int i_55_ = 0; i_55_ < files_54_.length; i_55_++) {
					File file = files_54_[i_55_];
					if (!method4720(file, false, (byte) -100))
						continue while_56_;
				}
			}
			break;
		}
		Class499.method8334(aFile3264, 919190914);
		Class328.method5827((short) -1298);
		aClass440_3270 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.dat2", 916060299)), "rw", 524288000L), 5200, 0);
		aClass440_3271 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.idx255", 1793098491)), "rw", 1048576L), 6000, 0);
		Class97.aClass440Array996 = new Class440[Class290.anInt3451 * 2026002439];
		for (int i_56_ = 0; i_56_ < Class290.anInt3451 * 2026002439; i_56_++)
			Class97.aClass440Array996[i_56_] = new Class440(new Class442((Class96_Sub23.method14681(new StringBuilder().append("main_file_cache.idx").append(i_56_).toString(), 1607788235)), "rw", 1048576L), 6000, 0);
		try {
			Class274.aClass470_3336 = new Class470();
		} catch (Exception exception) {
			Class475.aBool5623 = false;
		}
		MeshModifier.aClass267_5026 = new Class267();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_57_ = threadgroup.getParent(); null != threadgroup_57_; threadgroup_57_ = threadgroup.getParent())
			threadgroup = threadgroup_57_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_58_ = 0; i_58_ < threads.length; i_58_++) {
			if (null != threads[i_58_] && threads[i_58_].getName().startsWith("AWT"))
				threads[i_58_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	public void stop() {
		if (!aBool3276)
			aLong3255 = ((Class169.method2869(2052853338) + 4000L) * -7135659755925244301L);
	}

	public void destroy() {
		if (!aBool3276) {
			aLong3255 = Class169.method2869(1658627673) * -7135659755925244301L;
			Class89.method1504(5000L);
			method4675(false, -2042911108);
		}
	}

	void method4672() {
		if (Class351.aCanvas4096 != null) {
			Class351.aCanvas4096.removeFocusListener(this);
			Class351.aCanvas4096.getParent().setBackground(Color.black);
			Class351.aCanvas4096.getParent().remove(Class351.aCanvas4096);
		}
	}

	public final synchronized void paint(Graphics graphics) {
		if (!aBool3276) {
			aBool3274 = true;
			if ((Class169.method2869(2051320390) - -8855560604364028117L * aLong3280) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle || (rectangle.width >= Class45.anInt434 * -1016911135 && (rectangle.height >= -499509193 * Class107.anInt1082)))
					aBool3257 = true;
			}
		}
	}

	public final void focusGained(FocusEvent focusevent) {
		aBool3275 = true;
		aBool3274 = true;
	}

	public final void focusLost(FocusEvent focusevent) {
		aBool3275 = false;
	}

	public final void windowActivated(WindowEvent windowevent) {
		/* empty */
	}

	File method4673(String string, String string_59_, int i) {
		String string_60_ = (i == 0 ? "" : new StringBuilder().append("").append(i).toString());
		Canvas_Sub1.aFile9453 = new File(Class110.aString1103, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_59_).append(string_60_).append(".dat").toString());
		String string_61_ = null;
		String string_62_ = null;
		boolean bool = false;
		if (Canvas_Sub1.aFile9453.exists()) {
			try {
				Class442 class442 = new Class442(Canvas_Sub1.aFile9453, "rw", 10000L);
				int i_63_;
				RsByteBuffer class282_sub35;
				for (class282_sub35 = (new RsByteBuffer((int) class442.method7388(-273347477))); (class282_sub35.index * -1990677291 < class282_sub35.buffer.length); class282_sub35.index += i_63_ * -1115476867) {
					i_63_ = class442.method7389(class282_sub35.buffer, (class282_sub35.index * -1990677291), ((class282_sub35.buffer).length - (-1990677291 * class282_sub35.index)), (byte) -5);
					if (-1 == i_63_)
						throw new IOException();
				}
				class282_sub35.index = 0;
				i_63_ = class282_sub35.readUnsignedByte();
				if (i_63_ < 1 || i_63_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_63_).toString());
				int i_64_ = 0;
				if (i_63_ > 1)
					i_64_ = class282_sub35.readUnsignedByte();
				if (i_63_ <= 2) {
					string_61_ = class282_sub35.readGJString(-799615620);
					if (1 == i_64_)
						string_62_ = class282_sub35.readGJString(64537071);
				} else {
					string_61_ = class282_sub35.method13248(-19486323);
					if (i_64_ == 1)
						string_62_ = class282_sub35.method13248(-1538896668);
				}
				class442.method7385((short) 16041);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (string_61_ != null) {
				File file = new File(string_61_);
				if (!file.exists())
					string_61_ = null;
			}
			if (string_61_ != null) {
				File file = new File(string_61_, "test.dat");
				if (!method4720(file, true, (byte) -70))
					string_61_ = null;
			}
		}
		if (string_61_ == null && 0 == i) {
			while_57_: for (int i_65_ = 0; i_65_ < Class106.aStringArray1077.length; i_65_++) {
				for (int i_66_ = 0; i_66_ < Class246.aStringArray3028.length; i_66_++) {
					File file = new File(new StringBuilder().append(Class246.aStringArray3028[i_66_]).append(Class106.aStringArray1077[i_65_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method4720(new File(file, "test.dat"), true, (byte) -74)) {
						string_61_ = file.toString();
						bool = true;
						break while_57_;
					}
				}
			}
		}
		if (null == string_61_) {
			string_61_ = new StringBuilder().append(Class110.aString1103).append(File.separatorChar).append("jagexcache").append(string_60_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_59_).append(File.separatorChar).toString();
			bool = true;
		}
		if (string_62_ != null) {
			File file = new File(string_62_);
			File file_67_ = new File(string_61_);
			try {
				File[] files = file.listFiles();
				File[] files_68_ = files;
				for (int i_69_ = 0; i_69_ < files_68_.length; i_69_++) {
					File file_70_ = files_68_[i_69_];
					File file_71_ = new File(file_67_, file_70_.getName());
					boolean bool_72_ = file_70_.renameTo(file_71_);
					if (!bool_72_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method4659(new File(string_61_), null, -984740453);
		return new File(string_61_);
	}

	public final void windowClosing(WindowEvent windowevent) {
		aBool3259 = true;
		destroy();
	}

	public final void windowDeactivated(WindowEvent windowevent) {
		/* empty */
	}

	static void method4674() {
		try {
			File file = new File(Class110.aString1103, "random.dat");
			if (file.exists())
				aClass440_3269 = new Class440(new Class442(file, "rw", 25L), 24, 0);
			else {
				while_58_: for (int i = 0; i < Class106.aStringArray1077.length; i++) {
					for (int i_73_ = 0; i_73_ < Class246.aStringArray3028.length; i_73_++) {
						File file_74_ = new File(new StringBuilder().append(Class246.aStringArray3028[i_73_]).append(Class106.aStringArray1077[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_74_.exists()) {
							aClass440_3269 = new Class440(new Class442(file_74_, "rw", 25L), 24, 0);
							break while_58_;
						}
					}
				}
			}
			if (null == aClass440_3269) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass440_3269 = new Class440(new Class442(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	final void method4675(boolean bool, int i) {
		synchronized (this) {
			if (aBool3276)
				return;
			aBool3276 = true;
		}
		try {
			method4714(-1254177397);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass440_3270.method7346(65280);
			for (int i_75_ = 0; i_75_ < 2026002439 * Class290.anInt3451; i_75_++)
				Class97.aClass440Array996[i_75_].method7346(65280);
			aClass440_3271.method7346(65280);
			aClass440_3269.method7346(65280);
		} catch (Exception exception) {
			/* empty */
		}
		if (((Class263) this).aBool3268) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class156.method2645(true, 985239898);
		if (Class187.method3118((byte) 80))
			Class362.method6278(616047582).method219(1291104911);
		if (Class351.aCanvas4096 != null) {
			try {
				Class351.aCanvas4096.removeFocusListener(this);
				Class351.aCanvas4096.getParent().remove(Class351.aCanvas4096);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (aFrame3261 != null) {
			aFrame3261.setVisible(false);
			aFrame3261.dispose();
			aFrame3261 = null;
		}
	}

	public final void windowOpened(WindowEvent windowevent) {
		/* empty */
	}

	public abstract void init();

	abstract void method4676(byte i);

	abstract void method4677(int i);

	abstract void method4678(int i);

	public boolean method4679(File file) {
		if (null == file)
			return false;
		if (!file.exists())
			return false;
		if (!file.isDirectory())
			return false;
		if (file.listFiles().length != 0)
			return false;
		if (!method4720(new File(file, "test.dat"), true, (byte) -108))
			return false;
		method4659(file, aFile3264, 891495710);
		return true;
	}

	void method4680(String string, int i) {
		if (!((Class263) this).aBool3254) {
			((Class263) this).aBool3254 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class441.method7377(Class282_Sub44.anApplet8065, "loggedout", 1643442211);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class282_Sub44.anApplet8065.getAppletContext().showDocument(new URL(Class282_Sub44.anApplet8065.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public boolean method4681(byte i) {
		((Class263) this).aBool3268 = Class362.method6278(616047582).method222("jaclib", -938566175);
		if (((Class263) this).aBool3268) {
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		return ((Class263) this).aBool3268;
	}

	public final void method4682(FocusEvent focusevent) {
		aBool3275 = true;
		aBool3274 = true;
	}

	void method4683(Class279 class279, boolean bool, int i) {
		if (null == class279)
			throw new NullPointerException();
		if (class279 != Class279.aClass279_3369 && Class279.aClass279_3368 != class279)
			throw new IllegalStateException();
		aClass279_3267 = class279;
		if (aClass279_3267 != Class279.aClass279_3368) {
			if (bool)
				aClass279_3267 = Class279.aClass279_3367;
		}
	}

	public final void windowDeiconified(WindowEvent windowevent) {
		/* empty */
	}

	public void method4684() {
		do {
			try {
				try {
					method4745((byte) 3);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class151.method2594(method4669(-895830103), throwable, (byte) -95);
					method4680("crash", -1325463112);
					method4675(true, -1902711599);
					break;
				}
				method4675(true, -1622679354);
			} catch (Exception object) {
				method4675(true, -2075447563);
				//throw object;
			}
		} while (false);
	}

	public final void method4685(WindowEvent windowevent) {
		/* empty */
	}

	abstract void method4686();

	final boolean method4687() {
		String string = Class282_Sub44.anApplet8065.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1") || string.endsWith("trentonkress.com"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method4680("invalidhost", -125318311);
		return false;
	}

	abstract void method4688();

	abstract void method4689();

	abstract void method4690();

	String method4691() {
		return null;
	}

	public void method168(Applet applet) {
		Class282_Sub44.anApplet8065 = applet;
	}

	final void method4692(String string, String string_76_, int i, int i_77_, int i_78_, int i_79_) throws Exception {
		Class290.anInt3451 = i_77_ * -172911177;
		Class514.anInt5887 = 1182973571 * i;
		RuntimeException_Sub3.anInt10457 = 108751791 * i_78_;
		Class392.anInt4781 = 122429149 * i_79_;
		Class282_Sub20_Sub34.aString9967 = "Unknown";
		Class108.aString1093 = "1.1";
		try {
			Class282_Sub20_Sub34.aString9967 = System.getProperty("java.vendor");
			Class108.aString1093 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			RuntimeException_Sub4.aString10463 = System.getProperty("os.name");
		} catch (Exception exception) {
			RuntimeException_Sub4.aString10463 = "Unknown";
		}
		Class225_Sub6.aString8069 = RuntimeException_Sub4.aString10463.toLowerCase();
		try {
			Class402.aString4828 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class402.aString4828 = "";
		}
		try {
			Class231.aString2876 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			Class231.aString2876 = "";
		}
		try {
			Class110.aString1103 = System.getProperty("user.home");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class225_Sub6.aString8069.startsWith("win")) {
				if (null == Class110.aString1103)
					Class110.aString1103 = System.getenv("USERPROFILE");
			} else if (null == Class110.aString1103)
				Class110.aString1103 = System.getenv("HOME");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (null == Class110.aString1103)
			Class110.aString1103 = "~/";
		try {
			Class282_Sub50_Sub17.anEventQueue10074 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class246.aStringArray3028 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class110.aString1103, "/tmp/", "" };
		Class106.aStringArray1077 = new String[] { new StringBuilder().append(".jagex_cache_").append(-1179779029 * Class514.anInt5887).toString(), new StringBuilder().append(".file_store_").append(Class514.anInt5887 * -1179779029).toString() };
		while_60_: for (int i_80_ = 0; i_80_ < 4; i_80_++) {
			aFile3264 = method4657(string, string_76_, i_80_, (byte) 50);
			if (!aFile3264.exists())
				aFile3264.mkdirs();
			File[] files = aFile3264.listFiles();
			if (null != files) {
				File[] files_81_ = files;
				for (int i_82_ = 0; i_82_ < files_81_.length; i_82_++) {
					File file = files_81_[i_82_];
					if (!method4720(file, false, (byte) -18))
						continue while_60_;
				}
			}
			break;
		}
		Class499.method8334(aFile3264, 1201383508);
		Class328.method5827((short) 15372);
		aClass440_3270 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.dat2", 540682521)), "rw", 524288000L), 5200, 0);
		aClass440_3271 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.idx255", 1533521908)), "rw", 1048576L), 6000, 0);
		Class97.aClass440Array996 = new Class440[Class290.anInt3451 * 2026002439];
		for (int i_83_ = 0; i_83_ < Class290.anInt3451 * 2026002439; i_83_++)
			Class97.aClass440Array996[i_83_] = new Class440(new Class442((Class96_Sub23.method14681(new StringBuilder().append("main_file_cache.idx").append(i_83_).toString(), 1074472551)), "rw", 1048576L), 6000, 0);
		try {
			Class274.aClass470_3336 = new Class470();
		} catch (Exception exception) {
			Class475.aBool5623 = false;
		}
		MeshModifier.aClass267_5026 = new Class267();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_84_ = threadgroup.getParent(); null != threadgroup_84_; threadgroup_84_ = threadgroup.getParent())
			threadgroup = threadgroup_84_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_85_ = 0; i_85_ < threads.length; i_85_++) {
			if (null != threads[i_85_] && threads[i_85_].getName().startsWith("AWT"))
				threads[i_85_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	public final void method4693(WindowEvent windowevent) {
		/* empty */
	}

	void method4694(String string) {
		if (!((Class263) this).aBool3254) {
			((Class263) this).aBool3254 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class441.method7377(Class282_Sub44.anApplet8065, "loggedout", 1624477749);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class282_Sub44.anApplet8065.getAppletContext().showDocument(new URL(Class282_Sub44.anApplet8065.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	final void method4695(String string, String string_86_, int i, int i_87_, int i_88_, int i_89_) throws Exception {
		Class290.anInt3451 = i_87_ * -172911177;
		Class514.anInt5887 = 1182973571 * i;
		RuntimeException_Sub3.anInt10457 = 108751791 * i_88_;
		Class392.anInt4781 = 122429149 * i_89_;
		Class282_Sub20_Sub34.aString9967 = "Unknown";
		Class108.aString1093 = "1.1";
		try {
			Class282_Sub20_Sub34.aString9967 = System.getProperty("java.vendor");
			Class108.aString1093 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			RuntimeException_Sub4.aString10463 = System.getProperty("os.name");
		} catch (Exception exception) {
			RuntimeException_Sub4.aString10463 = "Unknown";
		}
		Class225_Sub6.aString8069 = RuntimeException_Sub4.aString10463.toLowerCase();
		try {
			Class402.aString4828 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class402.aString4828 = "";
		}
		try {
			Class231.aString2876 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			Class231.aString2876 = "";
		}
		try {
			Class110.aString1103 = System.getProperty("user.home");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class225_Sub6.aString8069.startsWith("win")) {
				if (null == Class110.aString1103)
					Class110.aString1103 = System.getenv("USERPROFILE");
			} else if (null == Class110.aString1103)
				Class110.aString1103 = System.getenv("HOME");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (null == Class110.aString1103)
			Class110.aString1103 = "~/";
		try {
			Class282_Sub50_Sub17.anEventQueue10074 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class246.aStringArray3028 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class110.aString1103, "/tmp/", "" };
		Class106.aStringArray1077 = new String[] { new StringBuilder().append(".jagex_cache_").append(-1179779029 * Class514.anInt5887).toString(), new StringBuilder().append(".file_store_").append(Class514.anInt5887 * -1179779029).toString() };
		while_62_: for (int i_90_ = 0; i_90_ < 4; i_90_++) {
			aFile3264 = method4657(string, string_86_, i_90_, (byte) 17);
			if (!aFile3264.exists())
				aFile3264.mkdirs();
			File[] files = aFile3264.listFiles();
			if (null != files) {
				File[] files_91_ = files;
				for (int i_92_ = 0; i_92_ < files_91_.length; i_92_++) {
					File file = files_91_[i_92_];
					if (!method4720(file, false, (byte) -67))
						continue while_62_;
				}
			}
			break;
		}
		Class499.method8334(aFile3264, 1077118022);
		Class328.method5827((short) -12456);
		aClass440_3270 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.dat2", 1598960179)), "rw", 524288000L), 5200, 0);
		aClass440_3271 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.idx255", 330774815)), "rw", 1048576L), 6000, 0);
		Class97.aClass440Array996 = new Class440[Class290.anInt3451 * 2026002439];
		for (int i_93_ = 0; i_93_ < Class290.anInt3451 * 2026002439; i_93_++)
			Class97.aClass440Array996[i_93_] = new Class440(new Class442((Class96_Sub23.method14681(new StringBuilder().append("main_file_cache.idx").append(i_93_).toString(), 1651786352)), "rw", 1048576L), 6000, 0);
		try {
			Class274.aClass470_3336 = new Class470();
		} catch (Exception exception) {
			Class475.aBool5623 = false;
		}
		MeshModifier.aClass267_5026 = new Class267();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_94_ = threadgroup.getParent(); null != threadgroup_94_; threadgroup_94_ = threadgroup.getParent())
			threadgroup = threadgroup_94_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_95_ = 0; i_95_ < threads.length; i_95_++) {
			if (null != threads[i_95_] && threads[i_95_].getName().startsWith("AWT"))
				threads[i_95_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	final void method4696(String string, String string_96_, int i, int i_97_, int i_98_, int i_99_) throws Exception {
		Class290.anInt3451 = i_97_ * -172911177;
		Class514.anInt5887 = 1182973571 * i;
		RuntimeException_Sub3.anInt10457 = 108751791 * i_98_;
		Class392.anInt4781 = 122429149 * i_99_;
		Class282_Sub20_Sub34.aString9967 = "Unknown";
		Class108.aString1093 = "1.1";
		try {
			Class282_Sub20_Sub34.aString9967 = System.getProperty("java.vendor");
			Class108.aString1093 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			RuntimeException_Sub4.aString10463 = System.getProperty("os.name");
		} catch (Exception exception) {
			RuntimeException_Sub4.aString10463 = "Unknown";
		}
		Class225_Sub6.aString8069 = RuntimeException_Sub4.aString10463.toLowerCase();
		try {
			Class402.aString4828 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class402.aString4828 = "";
		}
		try {
			Class231.aString2876 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			Class231.aString2876 = "";
		}
		try {
			Class110.aString1103 = System.getProperty("user.home");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class225_Sub6.aString8069.startsWith("win")) {
				if (null == Class110.aString1103)
					Class110.aString1103 = System.getenv("USERPROFILE");
			} else if (null == Class110.aString1103)
				Class110.aString1103 = System.getenv("HOME");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (null == Class110.aString1103)
			Class110.aString1103 = "~/";
		try {
			Class282_Sub50_Sub17.anEventQueue10074 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class246.aStringArray3028 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class110.aString1103, "/tmp/", "" };
		Class106.aStringArray1077 = new String[] { new StringBuilder().append(".jagex_cache_").append(-1179779029 * Class514.anInt5887).toString(), new StringBuilder().append(".file_store_").append(Class514.anInt5887 * -1179779029).toString() };
		while_64_: for (int i_100_ = 0; i_100_ < 4; i_100_++) {
			aFile3264 = method4657(string, string_96_, i_100_, (byte) 8);
			if (!aFile3264.exists())
				aFile3264.mkdirs();
			File[] files = aFile3264.listFiles();
			if (null != files) {
				File[] files_101_ = files;
				for (int i_102_ = 0; i_102_ < files_101_.length; i_102_++) {
					File file = files_101_[i_102_];
					if (!method4720(file, false, (byte) -10))
						continue while_64_;
				}
			}
			break;
		}
		Class499.method8334(aFile3264, 1354595397);
		Class328.method5827((short) 13688);
		aClass440_3270 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.dat2", 277788279)), "rw", 524288000L), 5200, 0);
		aClass440_3271 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.idx255", 780580416)), "rw", 1048576L), 6000, 0);
		Class97.aClass440Array996 = new Class440[Class290.anInt3451 * 2026002439];
		for (int i_103_ = 0; i_103_ < Class290.anInt3451 * 2026002439; i_103_++)
			Class97.aClass440Array996[i_103_] = new Class440(new Class442((Class96_Sub23.method14681(new StringBuilder().append("main_file_cache.idx").append(i_103_).toString(), 306323345)), "rw", 1048576L), 6000, 0);
		try {
			Class274.aClass470_3336 = new Class470();
		} catch (Exception exception) {
			Class475.aBool5623 = false;
		}
		MeshModifier.aClass267_5026 = new Class267();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_104_ = threadgroup.getParent(); null != threadgroup_104_; threadgroup_104_ = threadgroup.getParent())
			threadgroup = threadgroup_104_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_105_ = 0; i_105_ < threads.length; i_105_++) {
			if (null != threads[i_105_] && threads[i_105_].getName().startsWith("AWT"))
				threads[i_105_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	void method4697(File file, File file_106_) {
		try {
			Class442 class442 = new Class442(Canvas_Sub1.aFile9453, "rw", 10000L);
			RsByteBuffer class282_sub35 = new RsByteBuffer(500);
			class282_sub35.writeByte(3);
			class282_sub35.writeByte(null != file_106_ ? 1 : 0);
			class282_sub35.method13071(file.getPath(), (byte) 125);
			if (file_106_ != null)
				class282_sub35.method13071(file_106_.getPath(), (byte) 108);
			class442.method7386(class282_sub35.buffer, 0, class282_sub35.index * -1990677291, -68105547);
			class442.method7385((short) 22975);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	public static void method4698(Object object) {
		if (Class282_Sub50_Sub17.anEventQueue10074 != null) {
			for (int i = 0; i < 50 && (Class282_Sub50_Sub17.anEventQueue10074.peekEvent() != null); i++)
				Class89.method1504(1L);
			try {
				if (object != null)
					Class282_Sub50_Sub17.anEventQueue10074.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public void start() {
		if (!aBool3276)
			aLong3255 = 0L;
	}

	File method4699(String string, String string_107_, int i) {
		String string_108_ = (i == 0 ? "" : new StringBuilder().append("").append(i).toString());
		Canvas_Sub1.aFile9453 = new File(Class110.aString1103, new StringBuilder().append("jagex_cl_").append(string).append("_").append(string_107_).append(string_108_).append(".dat").toString());
		String string_109_ = null;
		String string_110_ = null;
		boolean bool = false;
		if (Canvas_Sub1.aFile9453.exists()) {
			try {
				Class442 class442 = new Class442(Canvas_Sub1.aFile9453, "rw", 10000L);
				int i_111_;
				RsByteBuffer class282_sub35;
				for (class282_sub35 = (new RsByteBuffer((int) class442.method7388(-273347477))); (class282_sub35.index * -1990677291 < class282_sub35.buffer.length); class282_sub35.index += i_111_ * -1115476867) {
					i_111_ = class442.method7389(class282_sub35.buffer, (class282_sub35.index * -1990677291), ((class282_sub35.buffer).length - (-1990677291 * class282_sub35.index)), (byte) -100);
					if (-1 == i_111_)
						throw new IOException();
				}
				class282_sub35.index = 0;
				i_111_ = class282_sub35.readUnsignedByte();
				if (i_111_ < 1 || i_111_ > 3)
					throw new IOException(new StringBuilder().append("").append(i_111_).toString());
				int i_112_ = 0;
				if (i_111_ > 1)
					i_112_ = class282_sub35.readUnsignedByte();
				if (i_111_ <= 2) {
					string_109_ = class282_sub35.readGJString(341667473);
					if (1 == i_112_)
						string_110_ = class282_sub35.readGJString(-211615219);
				} else {
					string_109_ = class282_sub35.method13248(-904455071);
					if (i_112_ == 1)
						string_110_ = class282_sub35.method13248(-1110077536);
				}
				class442.method7385((short) 25822);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (string_109_ != null) {
				File file = new File(string_109_);
				if (!file.exists())
					string_109_ = null;
			}
			if (string_109_ != null) {
				File file = new File(string_109_, "test.dat");
				if (!method4720(file, true, (byte) -13))
					string_109_ = null;
			}
		}
		if (string_109_ == null && 0 == i) {
			while_65_: for (int i_113_ = 0; i_113_ < Class106.aStringArray1077.length; i_113_++) {
				for (int i_114_ = 0; i_114_ < Class246.aStringArray3028.length; i_114_++) {
					File file = new File(new StringBuilder().append(Class246.aStringArray3028[i_114_]).append(Class106.aStringArray1077[i_113_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
					if (file.exists() && method4720(new File(file, "test.dat"), true, (byte) -8)) {
						string_109_ = file.toString();
						bool = true;
						break while_65_;
					}
				}
			}
		}
		if (null == string_109_) {
			string_109_ = new StringBuilder().append(Class110.aString1103).append(File.separatorChar).append("jagexcache").append(string_108_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_107_).append(File.separatorChar).toString();
			bool = true;
		}
		if (string_110_ != null) {
			File file = new File(string_110_);
			File file_115_ = new File(string_109_);
			try {
				File[] files = file.listFiles();
				File[] files_116_ = files;
				for (int i_117_ = 0; i_117_ < files_116_.length; i_117_++) {
					File file_118_ = files_116_[i_117_];
					File file_119_ = new File(file_115_, file_118_.getName());
					boolean bool_120_ = file_118_.renameTo(file_119_);
					if (!bool_120_)
						throw new IOException();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool)
			method4659(new File(string_109_), null, -1602935182);
		return new File(string_109_);
	}

	public boolean method4700(File file) {
		if (null == file)
			return false;
		if (!file.exists())
			return false;
		if (!file.isDirectory())
			return false;
		if (file.listFiles().length != 0)
			return false;
		if (!method4720(new File(file, "test.dat"), true, (byte) -88))
			return false;
		method4659(file, aFile3264, -1814165161);
		return true;
	}

	public boolean method4701(File file) {
		if (null == file)
			return false;
		if (!file.exists())
			return false;
		if (!file.isDirectory())
			return false;
		if (file.listFiles().length != 0)
			return false;
		if (!method4720(new File(file, "test.dat"), true, (byte) -21))
			return false;
		method4659(file, aFile3264, 330033784);
		return true;
	}

	void method4702(File file, File file_121_) {
		try {
			Class442 class442 = new Class442(Canvas_Sub1.aFile9453, "rw", 10000L);
			RsByteBuffer class282_sub35 = new RsByteBuffer(500);
			class282_sub35.writeByte(3);
			class282_sub35.writeByte(null != file_121_ ? 1 : 0);
			class282_sub35.method13071(file.getPath(), (byte) 57);
			if (file_121_ != null)
				class282_sub35.method13071(file_121_.getPath(), (byte) 126);
			class442.method7386(class282_sub35.buffer, 0, class282_sub35.index * -1990677291, 544054148);
			class442.method7385((short) 5131);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	final void method4703(String string, String string_122_, int i, int i_123_, int i_124_, int i_125_) throws Exception {
		Class290.anInt3451 = i_123_ * -172911177;
		Class514.anInt5887 = 1182973571 * i;
		RuntimeException_Sub3.anInt10457 = 108751791 * i_124_;
		Class392.anInt4781 = 122429149 * i_125_;
		Class282_Sub20_Sub34.aString9967 = "Unknown";
		Class108.aString1093 = "1.1";
		try {
			Class282_Sub20_Sub34.aString9967 = System.getProperty("java.vendor");
			Class108.aString1093 = System.getProperty("java.version");
		} catch (Exception exception) {
			/* empty */
		}
		try {
			RuntimeException_Sub4.aString10463 = System.getProperty("os.name");
		} catch (Exception exception) {
			RuntimeException_Sub4.aString10463 = "Unknown";
		}
		Class225_Sub6.aString8069 = RuntimeException_Sub4.aString10463.toLowerCase();
		try {
			Class402.aString4828 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			Class402.aString4828 = "";
		}
		try {
			Class231.aString2876 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			Class231.aString2876 = "";
		}
		try {
			Class110.aString1103 = System.getProperty("user.home");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (Class225_Sub6.aString8069.startsWith("win")) {
				if (null == Class110.aString1103)
					Class110.aString1103 = System.getenv("USERPROFILE");
			} else if (null == Class110.aString1103)
				Class110.aString1103 = System.getenv("HOME");
			if (null != Class110.aString1103)
				Class110.aString1103 = new StringBuilder().append(Class110.aString1103).append("/").toString();
		} catch (Exception exception) {
			/* empty */
		}
		if (null == Class110.aString1103)
			Class110.aString1103 = "~/";
		try {
			Class282_Sub50_Sub17.anEventQueue10074 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			/* empty */
		}
		Class246.aStringArray3028 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class110.aString1103, "/tmp/", "" };
		Class106.aStringArray1077 = new String[] { new StringBuilder().append(".jagex_cache_").append(-1179779029 * Class514.anInt5887).toString(), new StringBuilder().append(".file_store_").append(Class514.anInt5887 * -1179779029).toString() };
		while_67_: for (int i_126_ = 0; i_126_ < 4; i_126_++) {
			aFile3264 = method4657(string, string_122_, i_126_, (byte) 120);
			if (!aFile3264.exists())
				aFile3264.mkdirs();
			File[] files = aFile3264.listFiles();
			if (null != files) {
				File[] files_127_ = files;
				for (int i_128_ = 0; i_128_ < files_127_.length; i_128_++) {
					File file = files_127_[i_128_];
					if (!method4720(file, false, (byte) -16))
						continue while_67_;
				}
			}
			break;
		}
		Class499.method8334(aFile3264, 738056892);
		Class328.method5827((short) -12901);
		aClass440_3270 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.dat2", 1033231012)), "rw", 524288000L), 5200, 0);
		aClass440_3271 = new Class440(new Class442((Class96_Sub23.method14681("main_file_cache.idx255", 476454754)), "rw", 1048576L), 6000, 0);
		Class97.aClass440Array996 = new Class440[Class290.anInt3451 * 2026002439];
		for (int i_129_ = 0; i_129_ < Class290.anInt3451 * 2026002439; i_129_++)
			Class97.aClass440Array996[i_129_] = new Class440(new Class442((Class96_Sub23.method14681(new StringBuilder().append("main_file_cache.idx").append(i_129_).toString(), 375890735)), "rw", 1048576L), 6000, 0);
		try {
			Class274.aClass470_3336 = new Class470();
		} catch (Exception exception) {
			Class475.aBool5623 = false;
		}
		MeshModifier.aClass267_5026 = new Class267();
		ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
		for (ThreadGroup threadgroup_130_ = threadgroup.getParent(); null != threadgroup_130_; threadgroup_130_ = threadgroup.getParent())
			threadgroup = threadgroup_130_;
		Thread[] threads = new Thread[1000];
		threadgroup.enumerate(threads);
		for (int i_131_ = 0; i_131_ < threads.length; i_131_++) {
			if (null != threads[i_131_] && threads[i_131_].getName().startsWith("AWT"))
				threads[i_131_].setPriority(1);
		}
		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	synchronized void method4704(int i) {
		method4729((byte) 23);
		Container container = Class371.method6354((byte) 1);
		Class351.aCanvas4096 = new Canvas_Sub1(container);
		method4663(container, 135642590);
	}

	boolean method4705(File file, boolean bool) {
		boolean bool_132_;
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
			int i = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			if (bool)
				file.delete();
			bool_132_ = true;
		} catch (Exception exception) {
			return false;
		}
		return bool_132_;
	}

	public static File method4706() {
		return aFile3264;
	}

	public static File method4707() {
		return aFile3264;
	}

	public static Class442 method4708(String string, String string_133_, boolean bool) {
		File file = new File(aFile3264, new StringBuilder().append("preferences").append(string).append(".dat").toString());
		do {
			if (file.exists()) {
				Class442 class442;
				try {
					Class442 class442_134_ = new Class442(file, "rw", 10000L);
					class442 = class442_134_;
				} catch (IOException ioexception) {
					break;
				}
				return class442;
			}
		} while (false);
		String string_135_ = "";
		if (33 == -1179779029 * Class514.anInt5887)
			string_135_ = "_rc";
		else if (-1179779029 * Class514.anInt5887 == 34)
			string_135_ = "_wip";
		File file_136_ = new File(Class110.aString1103, new StringBuilder().append("jagex_").append(string_133_).append("_preferences").append(string).append(string_135_).append(".dat").toString());
		do {
			if (!bool && file_136_.exists()) {
				Class442 class442;
				try {
					Class442 class442_137_ = new Class442(file_136_, "rw", 10000L);
					class442 = class442_137_;
				} catch (IOException ioexception) {
					break;
				}
				return class442;
			}
		} while (false);
		Class442 class442;
		try {
			Class442 class442_138_ = new Class442(file, "rw", 10000L);
			class442 = class442_138_;
		} catch (IOException ioexception) {
			throw new RuntimeException();
		}
		return class442;
	}

	public static Class442 method4709(String string, String string_139_, boolean bool) {
		File file = new File(aFile3264, new StringBuilder().append("preferences").append(string).append(".dat").toString());
		do {
			if (file.exists()) {
				Class442 class442;
				try {
					Class442 class442_140_ = new Class442(file, "rw", 10000L);
					class442 = class442_140_;
				} catch (IOException ioexception) {
					break;
				}
				return class442;
			}
		} while (false);
		String string_141_ = "";
		if (33 == -1179779029 * Class514.anInt5887)
			string_141_ = "_rc";
		else if (-1179779029 * Class514.anInt5887 == 34)
			string_141_ = "_wip";
		File file_142_ = new File(Class110.aString1103, new StringBuilder().append("jagex_").append(string_139_).append("_preferences").append(string).append(string_141_).append(".dat").toString());
		do {
			if (!bool && file_142_.exists()) {
				Class442 class442;
				try {
					Class442 class442_143_ = new Class442(file_142_, "rw", 10000L);
					class442 = class442_143_;
				} catch (IOException ioexception) {
					break;
				}
				return class442;
			}
		} while (false);
		Class442 class442;
		try {
			Class442 class442_144_ = new Class442(file, "rw", 10000L);
			class442 = class442_144_;
		} catch (IOException ioexception) {
			throw new RuntimeException();
		}
		return class442;
	}

	public final synchronized void method180(Graphics graphics) {
		if (!aBool3276) {
			aBool3274 = true;
			if ((Class169.method2869(1848544211) - -8855560604364028117L * aLong3280) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle || (rectangle.width >= Class45.anInt434 * -1016911135 && (rectangle.height >= -499509193 * Class107.anInt1082)))
					aBool3257 = true;
			}
		}
	}

	static void method4710() {
		try {
			File file = new File(Class110.aString1103, "random.dat");
			if (file.exists())
				aClass440_3269 = new Class440(new Class442(file, "rw", 25L), 24, 0);
			else {
				while_68_: for (int i = 0; i < Class106.aStringArray1077.length; i++) {
					for (int i_145_ = 0; i_145_ < Class246.aStringArray3028.length; i_145_++) {
						File file_146_ = new File(new StringBuilder().append(Class246.aStringArray3028[i_145_]).append(Class106.aStringArray1077[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_146_.exists()) {
							aClass440_3269 = new Class440(new Class442(file_146_, "rw", 25L), 24, 0);
							break while_68_;
						}
					}
				}
			}
			if (null == aClass440_3269) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass440_3269 = new Class440(new Class442(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	static void method4711() {
		try {
			File file = new File(Class110.aString1103, "random.dat");
			if (file.exists())
				aClass440_3269 = new Class440(new Class442(file, "rw", 25L), 24, 0);
			else {
				while_69_: for (int i = 0; i < Class106.aStringArray1077.length; i++) {
					for (int i_147_ = 0; i_147_ < Class246.aStringArray3028.length; i_147_++) {
						File file_148_ = new File(new StringBuilder().append(Class246.aStringArray3028[i_147_]).append(Class106.aStringArray1077[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_148_.exists()) {
							aClass440_3269 = new Class440(new Class442(file_148_, "rw", 25L), 24, 0);
							break while_69_;
						}
					}
				}
			}
			if (null == aClass440_3269) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass440_3269 = new Class440(new Class442(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	public final void method4712(FocusEvent focusevent) {
		aBool3275 = true;
		aBool3274 = true;
	}

	public static void method4713(RsByteBuffer class282_sub35) {
		byte[] is = new byte[24];
		try {
			aClass440_3269.method7347(0L);
			aClass440_3269.method7351(is, -426996380);
			int i;
			for (i = 0; i < 24 && 0 == is[i]; i++) {
				/* empty */
			}
			if (i >= 24)
				throw new IOException();
		} catch (Exception exception) {
			for (int i = 0; i < 24; i++)
				is[i] = (byte) -1;
		}
		class282_sub35.writeBytes(is, 0, 24);
	}

	abstract void method4714(int i);

	public static void method4715(RsByteBuffer class282_sub35) {
		byte[] is = new byte[24];
		try {
			aClass440_3269.method7347(0L);
			aClass440_3269.method7351(is, -27531469);
			int i;
			for (i = 0; i < 24 && 0 == is[i]; i++) {
				/* empty */
			}
			if (i >= 24)
				throw new IOException();
		} catch (Exception exception) {
			for (int i = 0; i < 24; i++)
				is[i] = (byte) -1;
		}
		class282_sub35.writeBytes(is, 0, 24);
	}

	static void method4716(RsByteBuffer class282_sub35, int i) {
		if (aClass440_3269 != null) {
			try {
				aClass440_3269.method7347(0L);
				aClass440_3269.method7352(class282_sub35.buffer, i, 24, 1942118537);
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	final boolean method4717() {
		String string = Class282_Sub44.anApplet8065.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1") || string.endsWith("trentonkress.com"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method4680("invalidhost", -1196618393);
		return false;
	}

	synchronized void method4718(String string) {
		aFrame3261 = new Frame();
		aFrame3261.setTitle(string);
		aFrame3261.setResizable(true);
		aFrame3261.addWindowListener(this);
		aFrame3261.setBackground(Color.black);
		aFrame3261.setVisible(true);
		aFrame3261.toFront();
		Insets insets = aFrame3261.getInsets();
		aFrame3261.setSize(insets.right + (Class45.anInt434 * -1016911135 + insets.left), (insets.top + Class107.anInt1082 * -499509193 + insets.bottom));
	}

	synchronized void method4719() {
		method4729((byte) 23);
		Container container = Class371.method6354((byte) 1);
		Class351.aCanvas4096 = new Canvas_Sub1(container);
		method4663(container, 884378609);
	}

	boolean method4720(File file, boolean bool, byte i) {
		boolean bool_149_;
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
			int i_150_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_150_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			if (bool)
				file.delete();
			bool_149_ = true;
		} catch (Exception exception) {
			return false;
		}
		return bool_149_;
	}

	synchronized void method4721() {
		method4729((byte) 23);
		Container container = Class371.method6354((byte) 1);
		Class351.aCanvas4096 = new Canvas_Sub1(container);
		method4663(container, 787556375);
	}

	public static Container method4722() {
		if (null != aFrame3260)
			return aFrame3260;
		if (null != aFrame3261)
			return aFrame3261;
		return Class282_Sub44.anApplet8065;
	}

	public static Container method4723() {
		if (null != aFrame3260)
			return aFrame3260;
		if (null != aFrame3261)
			return aFrame3261;
		return Class282_Sub44.anApplet8065;
	}

	void method4724(Container container) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class351.aCanvas4096);
		Class351.aCanvas4096.setSize(Class349.anInt4083 * -418109423, -969250379 * anInt3243);
		Class351.aCanvas4096.setVisible(true);
		if (container == aFrame3261) {
			Insets insets = aFrame3261.getInsets();
			Class351.aCanvas4096.setLocation((insets.left + anInt3250 * -1911940837), (insets.top + 698621615 * anInt3251));
		} else
			Class351.aCanvas4096.setLocation(-1911940837 * anInt3250, 698621615 * anInt3251);
		Class351.aCanvas4096.addFocusListener(this);
		Class351.aCanvas4096.requestFocus();
		Class530.aBool7050 = true;
		aBool3275 = true;
		Class351.aCanvas4096.setFocusTraversalKeysEnabled(false);
		aBool3274 = true;
		aBool3257 = false;
		aLong3280 = Class169.method2869(1961121371) * 3757206876099985283L;
	}

	public static void method4725(RsByteBuffer class282_sub35) {
		byte[] is = new byte[24];
		try {
			aClass440_3269.method7347(0L);
			aClass440_3269.method7351(is, -1354622566);
			int i;
			for (i = 0; i < 24 && 0 == is[i]; i++) {
				/* empty */
			}
			if (i >= 24)
				throw new IOException();
		} catch (Exception exception) {
			for (int i = 0; i < 24; i++)
				is[i] = (byte) -1;
		}
		class282_sub35.writeBytes(is, 0, 24);
	}

	static {
		aLongArray3246 = new long[32];
		aLongArray3247 = new long[32];
		anInt3250 = 0;
		anInt3251 = 0;
		aString3252 = null;
		aBool3274 = true;
		anInt3256 = 360552396;
		aBool3257 = false;
		aLong3280 = 0L;
		aBool3259 = false;
		aBool3275 = true;
		aClass440_3269 = null;
		aClass440_3270 = null;
		aClass440_3271 = null;
		aClass279_3267 = null;
		aLong3255 = 0L;
		aBool3276 = false;
		anInt3273 = 1264016537;
		anInt3277 = 1116577273;
	}

	void method4726() {
		if (Class351.aCanvas4096 != null) {
			Class351.aCanvas4096.removeFocusListener(this);
			Class351.aCanvas4096.getParent().setBackground(Color.black);
			Class351.aCanvas4096.getParent().remove(Class351.aCanvas4096);
		}
	}

	static long method4727() {
		return aClass273_3244.method4852(1606553342);
	}

	public void method4728() {
		do {
			try {
				try {
					method4745((byte) -88);
				} catch (ThreadDeath threaddeath) {
					throw threaddeath;
				} catch (Throwable throwable) {
					Class151.method2594(method4669(1262756584), throwable, (byte) -45);
					method4680("crash", -908983498);
					method4675(true, -1575278870);
					break;
				}
				method4675(true, -1776355897);
			} catch (Exception object) {
				method4675(true, -1758118826);
				//throw object;
			}
		} while (false);
	}

	void method4729(byte i) {
		if (Class351.aCanvas4096 != null) {
			Class351.aCanvas4096.removeFocusListener(this);
			Class351.aCanvas4096.getParent().setBackground(Color.black);
			Class351.aCanvas4096.getParent().remove(Class351.aCanvas4096);
		}
	}

	static void method4730() {
		try {
			File file = new File(Class110.aString1103, "random.dat");
			if (file.exists())
				aClass440_3269 = new Class440(new Class442(file, "rw", 25L), 24, 0);
			else {
				while_70_: for (int i = 0; i < Class106.aStringArray1077.length; i++) {
					for (int i_151_ = 0; i_151_ < Class246.aStringArray3028.length; i_151_++) {
						File file_152_ = new File(new StringBuilder().append(Class246.aStringArray3028[i_151_]).append(Class106.aStringArray1077[i]).append(File.separatorChar).append("random.dat").toString());
						if (file_152_.exists()) {
							aClass440_3269 = new Class440(new Class442(file_152_, "rw", 25L), 24, 0);
							break while_70_;
						}
					}
				}
			}
			if (null == aClass440_3269) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				aClass440_3269 = new Class440(new Class442(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	final boolean method4731() {
		String string = Class282_Sub44.anApplet8065.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1") || string.endsWith("trentonkress.com"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method4680("invalidhost", -2097566077);
		return false;
	}

	public final void method4732(WindowEvent windowevent) {
		/* empty */
	}

	public static void method4733(Object object) {
		if (Class282_Sub50_Sub17.anEventQueue10074 != null) {
			for (int i = 0; i < 50 && (Class282_Sub50_Sub17.anEventQueue10074.peekEvent() != null); i++)
				Class89.method1504(1L);
			try {
				if (object != null)
					Class282_Sub50_Sub17.anEventQueue10074.postEvent(new ActionEvent(object, 1001, "dummy"));
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	void method4734() {
		long l = Class169.method2869(1677136002);
		long l_153_ = aLongArray3247[-1079748253 * Class75.anInt747];
		aLongArray3247[Class75.anInt747 * -1079748253] = l;
		Class75.anInt747 = -2133856181 * (1 + -1079748253 * Class75.anInt747 & 0x1f);
		if (0L != l_153_ && l <= l_153_) {
			/* empty */
		}
		synchronized (this) {
			Class530.aBool7050 = aBool3275;
		}
		method4677(-2044146959);
	}

	public final void method4735(FocusEvent focusevent) {
		aBool3275 = true;
		aBool3274 = true;
	}

	public boolean method4736() {
		return Class362.method6278(616047582).method222("jagtheora", -1425396460);
	}

	final void method4737(boolean bool) {
		synchronized (this) {
			if (aBool3276)
				return;
			aBool3276 = true;
		}
		try {
			method4714(-1603144746);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			aClass440_3270.method7346(65280);
			for (int i = 0; i < 2026002439 * Class290.anInt3451; i++)
				Class97.aClass440Array996[i].method7346(65280);
			aClass440_3271.method7346(65280);
			aClass440_3269.method7346(65280);
		} catch (Exception exception) {
			/* empty */
		}
		if (((Class263) this).aBool3268) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class156.method2645(true, 985239898);
		if (Class187.method3118((byte) 14))
			Class362.method6278(616047582).method219(1145130372);
		if (Class351.aCanvas4096 != null) {
			try {
				Class351.aCanvas4096.removeFocusListener(this);
				Class351.aCanvas4096.getParent().remove(Class351.aCanvas4096);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (aFrame3261 != null) {
			aFrame3261.setVisible(false);
			aFrame3261.dispose();
			aFrame3261 = null;
		}
	}

	abstract void method4738();

	public static final int method4739() {
		return (int) (1000000000L / (-2258443257437157839L * aLong3242));
	}

	public boolean method4740() {
		return Class362.method6278(616047582).method222("jagtheora", 1732194789);
	}

	static long method4741() {
		return aClass273_3244.method4852(1315820010);
	}

	static long method4742() {
		return aClass273_3244.method4852(2044422794);
	}

	void method4743(Container container) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class351.aCanvas4096);
		Class351.aCanvas4096.setSize(Class349.anInt4083 * -418109423, -969250379 * anInt3243);
		Class351.aCanvas4096.setVisible(true);
		if (container == aFrame3261) {
			Insets insets = aFrame3261.getInsets();
			Class351.aCanvas4096.setLocation((insets.left + anInt3250 * -1911940837), (insets.top + 698621615 * anInt3251));
		} else
			Class351.aCanvas4096.setLocation(-1911940837 * anInt3250, 698621615 * anInt3251);
		Class351.aCanvas4096.addFocusListener(this);
		Class351.aCanvas4096.requestFocus();
		Class530.aBool7050 = true;
		aBool3275 = true;
		Class351.aCanvas4096.setFocusTraversalKeysEnabled(false);
		aBool3274 = true;
		aBool3257 = false;
		aLong3280 = Class169.method2869(2045346650) * 3757206876099985283L;
	}

	public void method169() {
		if (!aBool3276)
			aLong3255 = 0L;
	}

	public void method167() {
		if (!aBool3276)
			aLong3255 = 0L;
	}

	public void method170() {
		if (!aBool3276)
			aLong3255 = 0L;
	}

	public void method171() {
		if (!aBool3276)
			aLong3255 = ((Class169.method2869(1644405330) + 4000L) * -7135659755925244301L);
	}

	public void method181() {
		if (!aBool3276)
			aLong3255 = ((Class169.method2869(1651695228) + 4000L) * -7135659755925244301L);
	}

	public void method172() {
		if (!aBool3276)
			aLong3255 = ((Class169.method2869(1855857438) + 4000L) * -7135659755925244301L);
	}

	public void method173() {
		if (!aBool3276)
			aLong3255 = ((Class169.method2869(1739901836) + 4000L) * -7135659755925244301L);
	}

	public final void update(Graphics graphics) {
		paint(graphics);
	}

	public void method175() {
		if (!aBool3276) {
			aLong3255 = Class169.method2869(2146320231) * -7135659755925244301L;
			Class89.method1504(5000L);
			method4675(false, -1541596193);
		}
	}

	public final void method176(Graphics graphics) {
		paint(graphics);
	}

	public final void method177(Graphics graphics) {
		paint(graphics);
	}

	public final void method178(Graphics graphics) {
		paint(graphics);
	}

	public final synchronized void method179(Graphics graphics) {
		if (!aBool3276) {
			aBool3274 = true;
			if ((Class169.method2869(1731963969) - -8855560604364028117L * aLong3280) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (null == rectangle || (rectangle.width >= Class45.anInt434 * -1016911135 && (rectangle.height >= -499509193 * Class107.anInt1082)))
					aBool3257 = true;
			}
		}
	}

	void method4744() {
		long l = Class169.method2869(1786568291);
		long l_154_ = aLongArray3246[Class165.anInt2036 * 272435041];
		aLongArray3246[272435041 * Class165.anInt2036] = l;
		Class165.anInt2036 = (272435041 * Class165.anInt2036 + 1 & 0x1f) * -408429407;
		if (l_154_ != 0L && l > l_154_) {
			int i = (int) (l - l_154_);
			anInt3253 = -1808753135 * ((32000 + (i >> 1)) / i);
		}
		if ((anInt3256 += -866862289) * 650144719 - 1 > 50) {
			anInt3256 -= -393441490;
			aBool3274 = true;
			Class351.aCanvas4096.setSize(Class349.anInt4083 * -418109423, -969250379 * anInt3243);
			Class351.aCanvas4096.setVisible(true);
			if (aFrame3261 != null && null == aFrame3260) {
				Insets insets = aFrame3261.getInsets();
				Class351.aCanvas4096.setLocation((insets.left + anInt3250 * -1911940837), (698621615 * anInt3251 + insets.top));
			} else
				Class351.aCanvas4096.setLocation(anInt3250 * -1911940837, 698621615 * anInt3251);
		}
		method4678(-2093077702);
	}

	void method4745(byte i) {
		if (Class282_Sub20_Sub34.aString9967 != null) {
			String string = Class282_Sub20_Sub34.aString9967.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_155_ = Class108.aString1093;
				if (string_155_.equals("1.1") || string_155_.startsWith("1.1.") || string_155_.equals("1.2") || string_155_.startsWith("1.2.") || string_155_.equals("1.3") || string_155_.startsWith("1.3.") || string_155_.equals("1.4") || string_155_.startsWith("1.4.") || string_155_.equals("1.5") || string_155_.startsWith("1.5.") || string_155_.equals("1.6.0")) {
					method4680("wrongjava", -1236837356);
					return;
				}
				if (string_155_.startsWith("1.6.0_")) {
					int i_156_;
					for (i_156_ = 6; (i_156_ < string_155_.length() && Class523.method11219(string_155_.charAt(i_156_), -2094159875)); i_156_++) {
						/* empty */
					}
					String string_157_ = string_155_.substring(6, i_156_);
					if (Class115.method1950(string_157_, 233261508) && Class328.method5830(string_157_, 1485921021) < 10) {
						method4680("wrongjava", -1712930660);
						return;
					}
				}
			}
		}
		Class371.method6354((byte) 1).setFocusCycleRoot(true);
		anInt3273 = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -1264016537);
		anInt3277 = Runtime.getRuntime().availableProcessors() * 1116577273;
		method4704(1996724901);
		method4676((byte) 58);
		aClass273_3244 = Class84.method1461(192179911);
		while (aLong3255 * 2009587532026748603L == 0L || (Class169.method2869(1780900677) < 2009587532026748603L * aLong3255)) {
			anInt3279 = (aClass273_3244.method4842(-2258443257437157839L * aLong3242) * 712917693);
			for (int i_158_ = 0; i_158_ < anInt3279 * 865486997; i_158_++)
				method4667(981410915);
			method4668(-1781025052);
			Class282_Sub20_Sub27.method15395(Class351.aCanvas4096, -859332556);
		}
	}

	void method4746() {
		long l = Class169.method2869(2043547430);
		long l_159_ = aLongArray3247[-1079748253 * Class75.anInt747];
		aLongArray3247[Class75.anInt747 * -1079748253] = l;
		Class75.anInt747 = -2133856181 * (1 + -1079748253 * Class75.anInt747 & 0x1f);
		if (0L != l_159_ && l <= l_159_) {
			/* empty */
		}
		synchronized (this) {
			Class530.aBool7050 = aBool3275;
		}
		method4677(125874236);
	}

	synchronized void method4747() {
		method4729((byte) 23);
		Container container = Class371.method6354((byte) 1);
		Class351.aCanvas4096 = new Canvas_Sub1(container);
		method4663(container, 1691604047);
	}

	final boolean method4748() {
		String string = Class282_Sub44.anApplet8065.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
			return true;
		if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
			return true;
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
			return true;
		if (string.endsWith("127.0.0.1") || string.endsWith("trentonkress.com"))
			return true;
		for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
			/* empty */
		}
		if (string.endsWith("192.168.1."))
			return true;
		method4680("invalidhost", -1411469663);
		return false;
	}

	void method4749() {
		if (Class351.aCanvas4096 != null) {
			Class351.aCanvas4096.removeFocusListener(this);
			Class351.aCanvas4096.getParent().setBackground(Color.black);
			Class351.aCanvas4096.getParent().remove(Class351.aCanvas4096);
		}
	}

	public final void method4750(WindowEvent windowevent) {
		/* empty */
	}

	public final void method4751(FocusEvent focusevent) {
		aBool3275 = false;
	}

	public final void method4752(WindowEvent windowevent) {
		aBool3259 = true;
		destroy();
	}

	public final void method4753(WindowEvent windowevent) {
		/* empty */
	}

	public final void method4754(WindowEvent windowevent) {
		/* empty */
	}

	void method4755(File file, File file_160_) {
		try {
			Class442 class442 = new Class442(Canvas_Sub1.aFile9453, "rw", 10000L);
			RsByteBuffer class282_sub35 = new RsByteBuffer(500);
			class282_sub35.writeByte(3);
			class282_sub35.writeByte(null != file_160_ ? 1 : 0);
			class282_sub35.method13071(file.getPath(), (byte) 11);
			if (file_160_ != null)
				class282_sub35.method13071(file_160_.getPath(), (byte) 92);
			class442.method7386(class282_sub35.buffer, 0, class282_sub35.index * -1990677291, 548905352);
			class442.method7385((short) 9152);
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	public final void method4756(WindowEvent windowevent) {
		/* empty */
	}

	public final void windowClosed(WindowEvent windowevent) {
		/* empty */
	}

	public final void method4757(WindowEvent windowevent) {
		/* empty */
	}

	public final void method4758(WindowEvent windowevent) {
		/* empty */
	}

	public final void method4759(WindowEvent windowevent) {
		/* empty */
	}

	public void method174() {
		if (!aBool3276) {
			aLong3255 = Class169.method2869(1931930446) * -7135659755925244301L;
			Class89.method1504(5000L);
			method4675(false, -1481410790);
		}
	}

	public final void method4760(WindowEvent windowevent) {
		/* empty */
	}

	public final void method4761(WindowEvent windowevent) {
		/* empty */
	}

	public abstract void method165();

	public abstract void method166();

	abstract void method4762();

	public static final void method4763(int i, String string, Color color, Color color_161_, Color color_162_) {
		try {
			Graphics graphics = Class351.aCanvas4096.getGraphics();
			if (null == Class515.aFont5893)
				Class515.aFont5893 = new Font("Helvetica", 1, 13);
			if (color == null)
				color = new Color(140, 17, 17);
			if (color_161_ == null)
				color_161_ = new Color(140, 17, 17);
			if (null == color_162_)
				color_162_ = new Color(255, 255, 255);
			try {
				if (OutputStream_Sub1.anImage7953 == null)
					OutputStream_Sub1.anImage7953 = Class351.aCanvas4096.createImage((-418109423 * (Class349.anInt4083)), (-969250379 * anInt3243));
				Graphics graphics_163_ = OutputStream_Sub1.anImage7953.getGraphics();
				graphics_163_.setColor(Color.black);
				graphics_163_.fillRect(0, 0, Class349.anInt4083 * -418109423, -969250379 * anInt3243);
				int i_164_ = Class349.anInt4083 * -418109423 / 2 - 152;
				int i_165_ = -969250379 * anInt3243 / 2 - 18;
				graphics_163_.setColor(color_161_);
				graphics_163_.drawRect(i_164_, i_165_, 303, 33);
				graphics_163_.setColor(color);
				graphics_163_.fillRect(2 + i_164_, i_165_ + 2, i * 3, 30);
				graphics_163_.setColor(Color.black);
				graphics_163_.drawRect(i_164_ + 1, i_165_ + 1, 301, 31);
				graphics_163_.fillRect(i * 3 + (i_164_ + 2), i_165_ + 2, 300 - 3 * i, 30);
				graphics_163_.setFont(Class515.aFont5893);
				graphics_163_.setColor(color_162_);
				graphics_163_.drawString(string, (i_164_ + (304 - string.length() * 6) / 2), 22 + i_165_);
				if (aString3252 != null) {
					graphics_163_.setFont(Class515.aFont5893);
					graphics_163_.setColor(color_162_);
					graphics_163_.drawString(aString3252, ((Class349.anInt4083 * -418109423 / 2) - aString3252.length() * 6 / 2), anInt3243 * -969250379 / 2 - 26);
				}
				graphics.drawImage(OutputStream_Sub1.anImage7953, 0, 0, null);
			} catch (Exception exception) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, -418109423 * Class349.anInt4083, -969250379 * anInt3243);
				int i_166_ = Class349.anInt4083 * -418109423 / 2 - 152;
				int i_167_ = -969250379 * anInt3243 / 2 - 18;
				graphics.setColor(color_161_);
				graphics.drawRect(i_166_, i_167_, 303, 33);
				graphics.setColor(color);
				graphics.fillRect(2 + i_166_, 2 + i_167_, 3 * i, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(i_166_ + 1, i_167_ + 1, 301, 31);
				graphics.fillRect(3 * i + (i_166_ + 2), i_167_ + 2, 300 - 3 * i, 30);
				graphics.setFont(Class515.aFont5893);
				graphics.setColor(color_162_);
				if (aString3252 != null) {
					graphics.setFont(Class515.aFont5893);
					graphics.setColor(color_162_);
					graphics.drawString(aString3252, (-418109423 * Class349.anInt4083 / 2 - aString3252.length() * 6 / 2), -969250379 * anInt3243 / 2 - 26);
				}
				graphics.drawString(string, i_166_ + (304 - string.length() * 6) / 2, 22 + i_167_);
			}
		} catch (Exception exception) {
			Class351.aCanvas4096.repaint();
		}
	}

	void method4764(String string) {
		if (!((Class263) this).aBool3254) {
			((Class263) this).aBool3254 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				Class441.method7377(Class282_Sub44.anApplet8065, "loggedout", 1451973226);
			} catch (Throwable throwable) {
				/* empty */
			}
			try {
				Class282_Sub44.anApplet8065.getAppletContext().showDocument(new URL(Class282_Sub44.anApplet8065.getCodeBase(), new StringBuilder().append("error_game_").append(string).append(".ws").toString()), "_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	Class263() {
		/* empty */
	}

	public boolean method4765() {
		return Class362.method6278(616047582).method222("jagtheora", 979690513);
	}

	static void method4766(RsByteBuffer class282_sub35, int i) {
		if (aClass440_3269 != null) {
			try {
				aClass440_3269.method7347(0L);
				aClass440_3269.method7352(class282_sub35.buffer, i, 24, 1942118537);
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public boolean method4767() {
		return Class362.method6278(616047582).method222("jagtheora", -1128740503);
	}

	public boolean method4768() {
		return Class362.method6278(616047582).method222("jagtheora", 664817394);
	}

	public boolean method4769() {
		return Class362.method6278(616047582).method222("jagtheora", -666742963);
	}

	public final void windowIconified(WindowEvent windowevent) {
		/* empty */
	}

	void method4770(Class279 class279, boolean bool) {
		if (null == class279)
			throw new NullPointerException();
		if (class279 != Class279.aClass279_3369 && Class279.aClass279_3368 != class279)
			throw new IllegalStateException();
		aClass279_3267 = class279;
		if (aClass279_3267 != Class279.aClass279_3368) {
			if (bool)
				aClass279_3267 = Class279.aClass279_3367;
		}
	}

	public static Class279 method4771() {
		return aClass279_3267;
	}

	static final void method4772(Class118 class118, Class98 class98, CS2Executor class527, byte i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1550392426) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1419 = Class351.method6193(string, class527, 902561109);
		class118.aBool1384 = true;
	}

	static final void method4773(CS2Executor class527, int i) {
		if (0 == client.anInt7434 * 1609086245)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -2;
		else if (1 == client.anInt7434 * 1609086245)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = client.anInt7449 * 493536965;
	}

	static final void method4774(CS2Executor class527, int i) {
		String string = null;
		if (Class119.aClass12_1461 != null)
			string = Class119.aClass12_1461.method473(-495509625);
		if (string == null)
			string = "";
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method4775(CS2Executor class527, int i) {
		Class242.method4166(61403740);
	}

	static final void method4776(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub6_8192), 0, -1214034115);
		Class190.method3148((byte) 63);
		client.aBool7175 = false;
	}

	static int method4777(int i, int i_168_, byte i_169_) {
		if (Class458.aClass458_5493.anInt5481 * 1109376893 == i || i == Class458.aClass458_5473.anInt5481 * 1109376893)
			return Class521_Sub1_Sub5_Sub2.anIntArray10533[i_168_ & 0x3];
		return Class521_Sub1_Sub5_Sub2.anIntArray10531[i_168_ & 0x3];
	}

	static Class282_Sub50_Sub12 method4778(int i, long l) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = (Class282_Sub50_Sub12) Class282_Sub50_Sub12.aClass465_9667.method7754((long) i << 56 | l);
		if (class282_sub50_sub12 == null) {
			class282_sub50_sub12 = new Class282_Sub50_Sub12(i, l);
			Class282_Sub50_Sub12.aClass465_9667.method7765(class282_sub50_sub12, class282_sub50_sub12.aLong3379 * -3442165056282524525L);
		}
		return class282_sub50_sub12;
	}

	static void method4779(int i, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_, byte i_178_) {
		if (i != i_171_ || i_170_ != i_172_ || i_173_ != i_175_ || i_176_ != i_174_) {
			int i_179_ = i;
			int i_180_ = i_170_;
			int i_181_ = 3 * i;
			int i_182_ = i_170_ * 3;
			int i_183_ = i_171_ * 3;
			int i_184_ = i_172_ * 3;
			int i_185_ = 3 * i_173_;
			int i_186_ = i_174_ * 3;
			int i_187_ = i_183_ + (i_175_ - i_185_) - i;
			int i_188_ = i_176_ - i_186_ + i_184_ - i_170_;
			int i_189_ = i_185_ - i_183_ - i_183_ + i_181_;
			int i_190_ = i_182_ + (i_186_ - i_184_ - i_184_);
			int i_191_ = i_183_ - i_181_;
			int i_192_ = i_184_ - i_182_;
			for (int i_193_ = 128; i_193_ <= 4096; i_193_ += 128) {
				int i_194_ = i_193_ * i_193_ >> 12;
				int i_195_ = i_193_ * i_194_ >> 12;
				int i_196_ = i_187_ * i_195_;
				int i_197_ = i_188_ * i_195_;
				int i_198_ = i_194_ * i_189_;
				int i_199_ = i_190_ * i_194_;
				int i_200_ = i_191_ * i_193_;
				int i_201_ = i_193_ * i_192_;
				int i_202_ = (i_198_ + i_196_ + i_200_ >> 12) + i;
				int i_203_ = i_170_ + (i_199_ + i_197_ + i_201_ >> 12);
				Class346.method6159(i_179_, i_180_, i_202_, i_203_, i_177_, -880935447);
				i_179_ = i_202_;
				i_180_ = i_203_;
			}
		} else
			Class346.method6159(i, i_170_, i_175_, i_176_, i_177_, -1028676957);
	}
}
