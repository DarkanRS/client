
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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

import jaclib.nanotime.QueryPerformanceCounter;

public abstract class Engine implements Interface24, Runnable, FocusListener, WindowListener {
	static long aLong3242 = -4661227965373235968L;
	public static int anInt3243;
	public static Class273 aClass273_3244;
	static long[] aLongArray3246;
	static long[] aLongArray3247;
	public static int anInt3249;
	public static int anInt3250;
	public static int anInt3251;
	protected static String aString3252;
	public static int FPS = 0;
	boolean aBool3254 = false;
	static long aLong3255;
	static int anInt3256;
	protected static volatile boolean aBool3257;
	protected static boolean aBool3259;
	public static Frame aFrame3260;
	public static Frame aFrame3261;
	static File aFile3264;
	static Class279 aClass279_3267;
	boolean aBool3268 = false;
	static Class440 aClass440_3269;
	protected static Class440 aClass440_3270;
	static Class440 aClass440_3271;
	public static int MAX_MEMORY;
	protected static volatile boolean aBool3274;
	static volatile boolean aBool3275;
	static boolean aBool3276;
	public static int AVAILABLE_PROCESSORS;
	static int anInt3279;
	static volatile long aLong3280;

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
		InventoriesIndexLoader.anInt4781 = 122429149 * i_8_;
		Class282_Sub20_Sub34.aString9967 = "Unknown";
		ChatLine.aString1093 = "1.1";
		try {
			Class282_Sub20_Sub34.aString9967 = System.getProperty("java.vendor");
			ChatLine.aString1093 = System.getProperty("java.version");
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
		Class106.aStringArray1077 = new String[] { new StringBuilder().append(".dk_cache_").append(-1179779029 * Class514.anInt5887).toString(), new StringBuilder().append(".file_store_").append(Class514.anInt5887 * -1179779029).toString() };
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
		Canvas_Sub1.aFile9453 = new File(Class110.aString1103, new StringBuilder().append("dk_cl_").append(string).append("_").append(string_16_).append(string_18_).append(".dat").toString());
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
			string_19_ = new StringBuilder().append(Class110.aString1103).append(File.separatorChar).append("dkcache").append(string_18_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_16_).append(File.separatorChar).toString();
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
		return Class362.getNativeLibraryLoader(616047582).loadLibrary("jagtheora", -1470478737);
	}

	void method4663(Container container, int i) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(Class351.gameCanvas);
		Class351.gameCanvas.setSize(Class349.anInt4083 * -418109423, -969250379 * anInt3243);
		Class351.gameCanvas.setVisible(true);
		if (container == aFrame3261) {
			Insets insets = aFrame3261.getInsets();
			Class351.gameCanvas.setLocation((insets.left + anInt3250 * -1911940837), (insets.top + 698621615 * anInt3251));
		} else
			Class351.gameCanvas.setLocation(-1911940837 * anInt3250, 698621615 * anInt3251);
		Class351.gameCanvas.addFocusListener(this);
		Class351.gameCanvas.requestFocus();
		Class530.aBool7050 = true;
		aBool3275 = true;
		Class351.gameCanvas.setFocusTraversalKeysEnabled(false);
		aBool3274 = true;
		aBool3257 = false;
		aLong3280 = Class169.method2869(2040905349) * 3757206876099985283L;
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
			FPS = -1808753135 * ((32000 + (i_48_ >> 1)) / i_48_);
		}
		if ((anInt3256 += -866862289) * 650144719 - 1 > 50) {
			anInt3256 -= -393441490;
			aBool3274 = true;
			Class351.gameCanvas.setSize(Class349.anInt4083 * -418109423, -969250379 * anInt3243);
			Class351.gameCanvas.setVisible(true);
			if (aFrame3261 != null && null == aFrame3260) {
				Insets insets = aFrame3261.getInsets();
				Class351.gameCanvas.setLocation((insets.left + anInt3250 * -1911940837), (698621615 * anInt3251 + insets.top));
			} else
				Class351.gameCanvas.setLocation(anInt3250 * -1911940837, 698621615 * anInt3251);
		}
		method4678(-2093077702);
	}

	String method4669(int i) {
		return null;
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

	public final void windowClosing(WindowEvent windowevent) {
		aBool3259 = true;
		destroy();
	}

	public final void windowDeactivated(WindowEvent windowevent) {
		/* empty */
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
		if (((Engine) this).aBool3268) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		Class156.method2645(true, 985239898);
		if (Class187.method3118((byte) 80))
			Class362.getNativeLibraryLoader(616047582).method219(1291104911);
		if (Class351.gameCanvas != null) {
			try {
				Class351.gameCanvas.removeFocusListener(this);
				Class351.gameCanvas.getParent().remove(Class351.gameCanvas);
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

	void method4680(String string, int i) {
		if (!((Engine) this).aBool3254) {
			((Engine) this).aBool3254 = true;
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
		((Engine) this).aBool3268 = Class362.getNativeLibraryLoader(616047582).loadLibrary("jaclib", -938566175);
		if (((Engine) this).aBool3268) {
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		return ((Engine) this).aBool3268;
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

	abstract void method4686();

	abstract void method4688();

	abstract void method4689();

	abstract void method4690();

	String method4691() {
		return null;
	}

	public void method168(Applet applet) {
		Class282_Sub44.anApplet8065 = applet;
	}

	public void start() {
		if (!aBool3276)
			aLong3255 = 0L;
	}

	synchronized void method4704(int i) {
		method4729((byte) 23);
		Container container = Class371.method6354((byte) 1);
		Class351.gameCanvas = new Canvas_Sub1(container);
		method4663(container, 135642590);
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

	abstract void method4714(int i);

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
		MAX_MEMORY = 1264016537;
		AVAILABLE_PROCESSORS = 1116577273;
	}

	void method4729(byte i) {
		if (Class351.gameCanvas != null) {
			Class351.gameCanvas.removeFocusListener(this);
			Class351.gameCanvas.getParent().setBackground(Color.black);
			Class351.gameCanvas.getParent().remove(Class351.gameCanvas);
		}
	}

	abstract void method4738();

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

	void method4745(byte i) {
		if (Class282_Sub20_Sub34.aString9967 != null) {
			String string = Class282_Sub20_Sub34.aString9967.toLowerCase();
			if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
				String string_155_ = ChatLine.aString1093;
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
					if (Class115.method1950(string_157_, 233261508) && Class328.parseInt(string_157_, 1485921021) < 10) {
						method4680("wrongjava", -1712930660);
						return;
					}
				}
			}
		}
		Class371.method6354((byte) 1).setFocusCycleRoot(true);
		MAX_MEMORY = (((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -1264016537);
		AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors() * 1116577273;
		method4704(1996724901);
		method4676((byte) 58);
		aClass273_3244 = Class84.method1461(192179911);
		while (aLong3255 * 2009587532026748603L == 0L || (Class169.method2869(1780900677) < 2009587532026748603L * aLong3255)) {
			anInt3279 = (aClass273_3244.method4842(-2258443257437157839L * aLong3242) * 712917693);
			for (int i_158_ = 0; i_158_ < anInt3279 * 865486997; i_158_++)
				method4667(981410915);
			method4668(-1781025052);
			Class282_Sub20_Sub27.method15395(Class351.gameCanvas, -859332556);
		}
	}

	public final void windowClosed(WindowEvent windowevent) {
		/* empty */
	}

	public void method174() {
		if (!aBool3276) {
			aLong3255 = Class169.method2869(1931930446) * -7135659755925244301L;
			Class89.method1504(5000L);
			method4675(false, -1481410790);
		}
	}

	public abstract void method165();

	public abstract void method166();

	abstract void method4762();

	public static final void method4763(int i, String string, Color color, Color color_161_, Color color_162_) {
		try {
			Graphics graphics = Class351.gameCanvas.getGraphics();
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
					OutputStream_Sub1.anImage7953 = Class351.gameCanvas.createImage((-418109423 * (Class349.anInt4083)), (-969250379 * anInt3243));
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
			Class351.gameCanvas.repaint();
		}
	}

	Engine() {
		/* empty */
	}

	public final void windowIconified(WindowEvent windowevent) {
		/* empty */
	}

	static final void method4772(IComponentDefinitions class118, Interface class98, CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1550392426) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1419 = Class351.method6193(string, class527, 902561109);
		class118.aBool1384 = true;
	}

	static final void method4773(CS2Executor class527, int i) {
		if (0 == client.anInt7434 * 1609086245)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -2;
		else if (1 == client.anInt7434 * 1609086245)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = -1;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = client.anInt7449 * 493536965;
	}

	static final void method4774(CS2Executor class527, int i) {
		String string = null;
		if (Class119.aClass12_1461 != null)
			string = Class119.aClass12_1461.method473(-495509625);
		if (string == null)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
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
			return Wall.anIntArray10533[i_168_ & 0x3];
		return Wall.anIntArray10531[i_168_ & 0x3];
	}

	static Class282_Sub50_Sub12 getIComponentVar(int i, long l) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = (Class282_Sub50_Sub12) Class282_Sub50_Sub12.aClass465_9667.method7754((long) i << 56 | l);
		if (class282_sub50_sub12 == null) {
			class282_sub50_sub12 = new Class282_Sub50_Sub12(i, l);
			Class282_Sub50_Sub12.aClass465_9667.method7765(class282_sub50_sub12, class282_sub50_sub12.data * -3442165056282524525L);
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
