import jaclib.nanotime.QueryPerformanceCounter;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
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

public abstract class Engine implements Interface24, Runnable, FocusListener, WindowListener {

	public static int anInt3249;
	public static Frame fullScreenFrame;
	static long aLong3242 = 20000000L;
	public static int FPS = 0;
	static long[] aLongArray3246 = new long[32];
	static long[] aLongArray3247 = new long[32];
	public static int anInt3250 = 0;
	public static int anInt3251 = 0;
	protected static String aString3252 = null;
	protected static volatile boolean aBool3274 = true;
	static int anInt3256 = 500;
	protected static volatile boolean aBool3257 = false;
	static volatile long aLong3280 = 0L;
	protected static boolean aBool3259 = false;
	static volatile boolean aBool3275 = true;
	static Class440 aClass440_3269 = null;
	protected static Class440 aClass440_3270 = null;
	static Class440 aClass440_3271 = null;
	static Class279 aClass279_3267 = null;
	static long aLong3255 = 0L;
	static boolean aBool3276 = false;
	public static int MAX_MEMORY = -1;
	public static int AVAILABLE_PROCESSORS = 1;
	public static int anInt3243;
	static File aFile3264;
	public static Frame engineFrame;
	boolean aBool3254 = false;
	boolean aBool3268 = false;
	public static Class273 aClass273_3244;
	static int anInt3279;

	public void supplyApplet(Applet applet_1) {
		Class282_Sub44.anApplet8065 = applet_1;
	}

	final void method4655(Class274 class274_1, String string_2, String string_3, int i_4, int i_5, int i_6, int i_7, boolean bool_8, int i_9) {
		try {
			this.method4683(Class279.aClass279_3369, bool_8, 1311506683);
			Class45.anInt434 = Class349.anInt4083 = class274_1.method4871(16711680);
			int i_10000 = class274_1.method4877((byte) 14);
			anInt3243 = i_10000 * -1929118563;
			Class107.anInt1082 = i_10000;
			anInt3250 = 0;
			anInt3251 = 0;
			if (NamedFileReference.method867(-1097326159) == Class279.aClass279_3367) {
				Class45.anInt434 += 2 * class274_1.method4868((short) 128);
				Class107.anInt1082 += 2 * class274_1.method4872((byte) -78);
				this.method4661(class274_1.method4870(1701502832), (short) 2048);
			}

			RuntimeException_Sub3.anApplet10460 = Class282_Sub44.anApplet8065;
			this.method4656(string_2, string_3, i_4, i_5, i_6, i_7, 311924431);
		} catch (Throwable throwable_11) {
			Class151.method2594((String) null, throwable_11, (byte) -115);
			this.method4680("crash", -1314193107);
		}

	}

	final void method4656(String string_1, String string_2, int i_3, int i_4, int i_5, int i_6, int i_7) throws Exception {
		Class290.anInt3451 = i_4;
		Class514.anInt5887 = i_3;
		RuntimeException_Sub3.anInt10457 = i_5;
		InventoriesIndexLoader.anInt4781 = i_6;
		Class282_Sub20_Sub34.aString9967 = "Unknown";
		ChatLine.aString1093 = "1.1";

		try {
			Class282_Sub20_Sub34.aString9967 = System.getProperty("java.vendor");
			ChatLine.aString1093 = System.getProperty("java.version");
		} catch (Exception exception_22) {
			;
		}

		try {
			RuntimeException_Sub4.aString10463 = System.getProperty("os.name");
		} catch (Exception exception_21) {
			RuntimeException_Sub4.aString10463 = "Unknown";
		}

		Class225_Sub6.aString8069 = RuntimeException_Sub4.aString10463.toLowerCase();

		try {
			Class402.aString4828 = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception_20) {
			Class402.aString4828 = "";
		}

		try {
			Class231.aString2876 = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception_19) {
			Class231.aString2876 = "";
		}

		try {
			Class110.aString1103 = System.getProperty("user.home");
			if (Class110.aString1103 != null) {
				Class110.aString1103 = Class110.aString1103 + "/";
			}
		} catch (Exception exception_18) {
			;
		}

		try {
			if (Class225_Sub6.aString8069.startsWith("win")) {
				if (Class110.aString1103 == null) {
					Class110.aString1103 = System.getenv("USERPROFILE");
				}
			} else if (Class110.aString1103 == null) {
				Class110.aString1103 = System.getenv("HOME");
			}

			if (Class110.aString1103 != null) {
				Class110.aString1103 = Class110.aString1103 + "/";
			}
		} catch (Exception exception_17) {
			;
		}

		if (Class110.aString1103 == null) {
			Class110.aString1103 = "~/";
		}

		try {
			Class282_Sub50_Sub17.anEventQueue10074 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable_16) {
			;
		}

		Class246.aStringArray3028 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class110.aString1103, "/tmp/", "" };
		Class106.aStringArray1077 = new String[] { ".dk_cache_" + Class514.anInt5887, ".file_store_" + Class514.anInt5887 };
		int i_13 = 0;

		label131: while (i_13 < 4) {
			aFile3264 = this.method4657(string_1, string_2, i_13, (byte) 75);
			if (!aFile3264.exists()) {
				aFile3264.mkdirs();
			}

			File[] arr_9 = aFile3264.listFiles();
			if (arr_9 == null) {
				break;
			}

			File[] arr_10 = arr_9;
			int i_11 = 0;

			while (true) {
				if (i_11 >= arr_10.length) {
					break label131;
				}

				File file_12 = arr_10[i_11];
				if (!this.method4720(file_12, false, (byte) -47)) {
					++i_13;
					break;
				}

				++i_11;
			}
		}

		Class499.method8334(aFile3264, 1977794836);
		Class328.method5827((short) -23494);
		aClass440_3270 = new Class440(new Class442(Class96_Sub23.method14681("main_file_cache.dat2", 1605505802), "rw", 524288000L), 5200, 0);
		aClass440_3271 = new Class440(new Class442(Class96_Sub23.method14681("main_file_cache.idx255", 526140284), "rw", 1048576L), 6000, 0);
		Class97.aClass440Array996 = new Class440[Class290.anInt3451];

		for (i_13 = 0; i_13 < Class290.anInt3451; i_13++) {
			Class97.aClass440Array996[i_13] = new Class440(new Class442(Class96_Sub23.method14681("main_file_cache.idx" + i_13, 535964137), "rw", 1048576L), 6000, 0);
		}

		try {
			Class274.aClass470_3336 = new Class470();
		} catch (Exception exception_15) {
			Class475.supportsFullScreen = false;
		}

		MeshModifier.aClass267_5026 = new Class267();
		ThreadGroup threadgroup_8 = Thread.currentThread().getThreadGroup();

		for (ThreadGroup threadgroup_23 = threadgroup_8.getParent(); threadgroup_23 != null; threadgroup_23 = threadgroup_23.getParent()) {
			threadgroup_8 = threadgroup_23;
		}

		Thread[] arr_24 = new Thread[1000];
		threadgroup_8.enumerate(arr_24);

		for (int i_14 = 0; i_14 < arr_24.length; i_14++) {
			if (arr_24[i_14] != null && arr_24[i_14].getName().startsWith("AWT")) {
				arr_24[i_14].setPriority(1);
			}
		}

		Thread thread_25 = new Thread(this);
		thread_25.setDaemon(true);
		thread_25.start();
		thread_25.setPriority(1);
	}

	File method4657(String string_1, String string_2, int i_3, byte b_4) {
		String str_5 = i_3 == 0 ? "" : "" + i_3;
		Canvas_Sub1.aFile9453 = new File(Class110.aString1103, "dk_cl_" + string_1 + "_" + string_2 + str_5 + ".dat");
		String string_6 = null;
		String string_7 = null;
		boolean bool_8 = false;
		int i_10;
		File file_22;
		if (Canvas_Sub1.aFile9453.exists()) {
			try {
				Class442 class442_9 = new Class442(Canvas_Sub1.aFile9453, "rw", 10000L);

				RsByteBuffer rsbytebuffer_11;
				for (rsbytebuffer_11 = new RsByteBuffer((int) class442_9.method7388(-273347477)); rsbytebuffer_11.index < rsbytebuffer_11.buffer.length; rsbytebuffer_11.index += i_10) {
					i_10 = class442_9.method7389(rsbytebuffer_11.buffer, rsbytebuffer_11.index, rsbytebuffer_11.buffer.length - rsbytebuffer_11.index, (byte) -53);
					if (i_10 == -1) {
						throw new IOException();
					}
				}

				rsbytebuffer_11.index = 0;
				i_10 = rsbytebuffer_11.readUnsignedByte();
				if (i_10 < 1 || i_10 > 3) {
					throw new IOException("" + i_10);
				}

				int i_12 = 0;
				if (i_10 > 1) {
					i_12 = rsbytebuffer_11.readUnsignedByte();
				}

				if (i_10 <= 2) {
					string_6 = rsbytebuffer_11.readGJString(413750486);
					if (i_12 == 1) {
						string_7 = rsbytebuffer_11.readGJString(633964103);
					}
				} else {
					string_6 = rsbytebuffer_11.method13248(-961534937);
					if (i_12 == 1) {
						string_7 = rsbytebuffer_11.method13248(-1576651752);
					}
				}

				class442_9.method7385((short) 22499);
			} catch (IOException ioexception_21) {
				ioexception_21.printStackTrace();
			}

			if (string_6 != null) {
				file_22 = new File(string_6);
				if (!file_22.exists()) {
					string_6 = null;
				}
			}

			if (string_6 != null) {
				file_22 = new File(string_6, "test.dat");
				if (!this.method4720(file_22, true, (byte) -16)) {
					string_6 = null;
				}
			}
		}

		if (string_6 == null && i_3 == 0) {
			label103: for (int i_17 = 0; i_17 < Class106.aStringArray1077.length; i_17++) {
				for (i_10 = 0; i_10 < Class246.aStringArray3028.length; i_10++) {
					File file_23 = new File(Class246.aStringArray3028[i_10] + Class106.aStringArray1077[i_17] + File.separatorChar + string_1 + File.separatorChar);
					if (file_23.exists() && this.method4720(new File(file_23, "test.dat"), true, (byte) -97)) {
						string_6 = file_23.toString();
						bool_8 = true;
						break label103;
					}
				}
			}
		}

		if (string_6 == null) {
			string_6 = Class110.aString1103 + File.separatorChar + "dkcache" + str_5 + File.separatorChar + string_1 + File.separatorChar + string_2 + File.separatorChar;
			bool_8 = true;
		}

		if (string_7 != null) {
			file_22 = new File(string_7);
			File file_18 = new File(string_6);

			try {
				File[] arr_24 = file_22.listFiles();
				File[] arr_19 = arr_24;

				for (int i_13 = 0; i_13 < arr_19.length; i_13++) {
					File file_14 = arr_19[i_13];
					File file_15 = new File(file_18, file_14.getName());
					boolean bool_16 = file_14.renameTo(file_15);
					if (!bool_16) {
						throw new IOException();
					}
				}
			} catch (Exception exception_20) {
				exception_20.printStackTrace();
			}

			bool_8 = true;
		}

		if (bool_8) {
			this.method4659(new File(string_6), (File) null, -1666415972);
		}

		return new File(string_6);
	}

	public boolean method4658(File file_1, int i_2) {
		if (file_1 == null) {
			return false;
		} else if (!file_1.exists()) {
			return false;
		} else if (!file_1.isDirectory()) {
			return false;
		} else if (file_1.listFiles().length != 0) {
			return false;
		} else if (!this.method4720(new File(file_1, "test.dat"), true, (byte) -106)) {
			return false;
		} else {
			this.method4659(file_1, aFile3264, -2119897926);
			return true;
		}
	}

	void method4659(File file_1, File file_2, int i_3) {
		try {
			Class442 class442_4 = new Class442(Canvas_Sub1.aFile9453, "rw", 10000L);
			RsByteBuffer rsbytebuffer_5 = new RsByteBuffer(500);
			rsbytebuffer_5.writeByte(3);
			rsbytebuffer_5.writeByte(file_2 != null ? 1 : 0);
			rsbytebuffer_5.method13071(file_1.getPath(), (byte) 46);
			if (file_2 != null) {
				rsbytebuffer_5.method13071(file_2.getPath(), (byte) 32);
			}

			class442_4.method7386(rsbytebuffer_5.buffer, 0, rsbytebuffer_5.index, -724626289);
			class442_4.method7385((short) 5959);
		} catch (IOException ioexception_6) {
			ioexception_6.printStackTrace();
		}

	}

	synchronized void method4661(String string_1, short s_2) {
		engineFrame = new Frame();
		engineFrame.setTitle(string_1);
		engineFrame.setResizable(true);
		engineFrame.addWindowListener(this);
		engineFrame.setBackground(Color.black);
		engineFrame.setVisible(true);
		engineFrame.toFront();
		Insets insets_3 = engineFrame.getInsets();
		engineFrame.setSize(insets_3.right + insets_3.left + Class45.anInt434, insets_3.top + insets_3.bottom + Class107.anInt1082);
	}

	public boolean method4662(byte b_1) {
		return Class362.getNativeLibraryLoader(616047582).loadLibrary("jagtheora", -1470478737);
	}

	void method4663(Container container_1, int i_2) {
		container_1.setBackground(Color.black);
		container_1.setLayout((LayoutManager) null);
		container_1.add(Class351.gameCanvas);
		Class351.gameCanvas.setSize(Class349.anInt4083, anInt3243 * -969250379);
		Class351.gameCanvas.setVisible(true);
		if (container_1 == engineFrame) {
			Insets insets_3 = engineFrame.getInsets();
			Class351.gameCanvas.setLocation(insets_3.left + anInt3250, insets_3.top + anInt3251);
		} else {
			Class351.gameCanvas.setLocation(anInt3250, anInt3251);
		}

		Class351.gameCanvas.addFocusListener(this);
		Class351.gameCanvas.requestFocus();
		Class530.aBool7050 = true;
		aBool3275 = true;
		Class351.gameCanvas.setFocusTraversalKeysEnabled(false);
		aBool3274 = true;
		aBool3257 = false;
		aLong3280 = Class169.time();
	}

	final boolean method4665(byte b_1) {
		String string_2 = Class282_Sub44.anApplet8065.getDocumentBase().getHost().toLowerCase();
		if (!string_2.equals("jagex.com") && !string_2.endsWith(".jagex.com")) {
			if (!string_2.equals("runescape.com") && !string_2.endsWith(".runescape.com")) {
				if (!string_2.equals("stellardawn.com") && !string_2.endsWith(".stellardawn.com")) {
					if (!string_2.endsWith("127.0.0.1") && !string_2.endsWith("trentonkress.com")) {
						while (string_2.length() > 0 && string_2.charAt(string_2.length() - 1) >= 48 && string_2.charAt(string_2.length() - 1) <= 57) {
							string_2 = string_2.substring(0, string_2.length() - 1);
						}

						if (string_2.endsWith("192.168.1.")) {
							return true;
						} else {
							this.method4680("invalidhost", -1367940016);
							return false;
						}
					} else {
						return true;
					}
				} else {
					return true;
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	public void run() {
		try {
			try {
				this.method4745((byte) -64);
			} catch (ThreadDeath threaddeath_2) {
				throw threaddeath_2;
			} catch (Throwable throwable_3) {
				Class151.method2594(this.method4669(260769719), throwable_3, (byte) -107);
				this.method4680("crash", -1160452299);
				this.method4675(true, -1458406280);
				return;
			}

			this.method4675(true, -1505449815);
		} catch (Exception exception_4) {
			this.method4675(true, -1953400023);
		}

	}

	void method4667(int i_1) {
		long long_2 = Class169.time();
		long long_4 = aLongArray3247[Class75.anInt747];
		aLongArray3247[Class75.anInt747] = long_2;
		Class75.anInt747 = Class75.anInt747 + 1 & 0x1f;
		if (long_4 != 0L) {
			;
		}

		synchronized (this) {
			Class530.aBool7050 = aBool3275;
		}

		this.method4677(1918859196);
	}

	void method4668(int i_1) {
		long long_2 = Class169.time();
		long long_4 = aLongArray3246[Class165.anInt2036];
		aLongArray3246[Class165.anInt2036] = long_2;
		Class165.anInt2036 = Class165.anInt2036 + 1 & 0x1f;
		if (long_4 != 0L && long_2 > long_4) {
			int i_6 = (int) (long_2 - long_4);
			FPS = ((i_6 >> 1) + 32000) / i_6;
		}

		if (++anInt3256 - 1 > 50) {
			anInt3256 -= 50;
			aBool3274 = true;
			Class351.gameCanvas.setSize(Class349.anInt4083, anInt3243 * -969250379);
			Class351.gameCanvas.setVisible(true);
			if (engineFrame != null && fullScreenFrame == null) {
				Insets insets_7 = engineFrame.getInsets();
				Class351.gameCanvas.setLocation(insets_7.left + anInt3250, insets_7.top + anInt3251);
			} else {
				Class351.gameCanvas.setLocation(anInt3250, anInt3251);
			}
		}

		this.method4678(-2093077702);
	}

	String method4669(int i_1) {
		return null;
	}

	public void stop() {
		if (!aBool3276) {
			aLong3255 = Class169.time() + 4000L;
		}

	}

	public void destroy() {
		if (!aBool3276) {
			aLong3255 = Class169.time();
			Class89.sleep(5000L);
			this.method4675(false, -2042911108);
		}

	}

	public final synchronized void paint(Graphics graphics_1) {
		if (!aBool3276) {
			aBool3274 = true;
			if (Class169.time() - aLong3280 > 1000L) {
				Rectangle rectangle_2 = graphics_1.getClipBounds();
				if (rectangle_2 == null || rectangle_2.width >= Class45.anInt434 && rectangle_2.height >= Class107.anInt1082) {
					aBool3257 = true;
				}
			}
		}

	}

	public final void focusGained(FocusEvent focusevent_1) {
		aBool3275 = true;
		aBool3274 = true;
	}

	public final void focusLost(FocusEvent focusevent_1) {
		aBool3275 = false;
	}

	public final void windowActivated(WindowEvent windowevent_1) {
	}

	public final void windowClosing(WindowEvent windowevent_1) {
		aBool3259 = true;
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent windowevent_1) {
	}

	final void method4675(boolean bool_1, int i_2) {
		synchronized (this) {
			if (aBool3276) {
				return;
			}

			aBool3276 = true;
		}

		try {
			this.method4714(-1254177397);
		} catch (Exception exception_7) {
			;
		}

		try {
			aClass440_3270.method7346(65280);

			for (int i_4 = 0; i_4 < Class290.anInt3451; i_4++) {
				Class97.aClass440Array996[i_4].method7346(65280);
			}

			aClass440_3271.method7346(65280);
			aClass440_3269.method7346(65280);
		} catch (Exception exception_8) {
			;
		}

		if (this.aBool3268) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable_6) {
				;
			}
		}

		Class156.method2645(true, 985239898);
		if (Class187.method3118((byte) 80)) {
			Class362.getNativeLibraryLoader(616047582).method219(1291104911);
		}

		if (Class351.gameCanvas != null) {
			try {
				Class351.gameCanvas.removeFocusListener(this);
				Class351.gameCanvas.getParent().remove(Class351.gameCanvas);
			} catch (Exception exception_5) {
				;
			}
		}

		if (engineFrame != null) {
			engineFrame.setVisible(false);
			engineFrame.dispose();
			engineFrame = null;
		}

	}

	public final void windowOpened(WindowEvent windowevent_1) {
	}

	public abstract void init();

	abstract void method4676(byte var1);

	abstract void method4677(int var1);

	abstract void method4678(int var1);

	void method4680(String string_1, int i_2) {
		if (!this.aBool3254) {
			this.aBool3254 = true;
			System.out.println("error_game_" + string_1);

			try {
				Class441.method7377(Class282_Sub44.anApplet8065, "loggedout", 1643442211);
			} catch (Throwable throwable_5) {
				;
			}

			try {
				Class282_Sub44.anApplet8065.getAppletContext().showDocument(new URL(Class282_Sub44.anApplet8065.getCodeBase(), "error_game_" + string_1 + ".ws"), "_top");
			} catch (Exception exception_4) {
				;
			}
		}

	}

	public boolean method4681(byte b_1) {
		this.aBool3268 = Class362.getNativeLibraryLoader(616047582).loadLibrary("jaclib", -938566175);
		if (this.aBool3268) {
			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable_3) {
				;
			}
		}

		return this.aBool3268;
	}

	void method4683(Class279 class279_1, boolean bool_2, int i_3) {
		if (class279_1 == null) {
			throw new NullPointerException();
		} else if (class279_1 != Class279.aClass279_3369 && class279_1 != Class279.aClass279_3368) {
			throw new IllegalStateException();
		} else {
			aClass279_3267 = class279_1;
			if (aClass279_3267 != Class279.aClass279_3368 && bool_2) {
				aClass279_3267 = Class279.aClass279_3367;
			}

		}
	}

	public final void windowDeiconified(WindowEvent windowevent_1) {
	}

	abstract void method4686();

	abstract void method4688();

	abstract void method4689();

	abstract void method4690();

	public void method168(Applet applet_1) {
		Class282_Sub44.anApplet8065 = applet_1;
	}

	public void start() {
		if (!aBool3276) {
			aLong3255 = 0L;
		}

	}

	synchronized void method4704(int i_1) {
		this.method4729((byte) 23);
		Container container_2 = Class371.getActiveContainer((byte) 1);
		Class351.gameCanvas = new Canvas_Sub1(container_2);
		this.method4663(container_2, 135642590);
	}

	public final synchronized void method180(Graphics graphics_1) {
		if (!aBool3276) {
			aBool3274 = true;
			if (Class169.time() - -8855560604364028117L * aLong3280 * 3757206876099985283L > 1000L) {
				Rectangle rectangle_2 = graphics_1.getClipBounds();
				if (rectangle_2 == null || rectangle_2.width >= Class45.anInt434 * 1426041429 * 765 * 1031248161 * -1016911135 && rectangle_2.height >= -499509193 * Class107.anInt1082 * -1929118563 * -969250379 * 685317511) {
					aBool3257 = true;
				}
			}
		}

	}

	abstract void method4714(int var1);

	boolean method4720(File file_1, boolean bool_2, byte b_3) {
		try {
			RandomAccessFile randomaccessfile_5 = new RandomAccessFile(file_1, "rw");
			int i_6 = randomaccessfile_5.read();
			randomaccessfile_5.seek(0L);
			randomaccessfile_5.write(i_6);
			randomaccessfile_5.seek(0L);
			randomaccessfile_5.close();
			if (bool_2) {
				file_1.delete();
			}

			boolean bool_4 = true;
			return bool_4;
		} catch (Exception exception_7) {
			return false;
		}
	}

	void method4729(byte b_1) {
		if (Class351.gameCanvas != null) {
			Class351.gameCanvas.removeFocusListener(this);
			Class351.gameCanvas.getParent().setBackground(Color.black);
			Class351.gameCanvas.getParent().remove(Class351.gameCanvas);
		}

	}

	abstract void method4738();

	public void method169() {
		if (!aBool3276) {
			aLong3255 = 0L * 2009587532026748603L;
		}

	}

	public void method167() {
		if (!aBool3276) {
			aLong3255 = 0L * 2009587532026748603L;
		}

	}

	public void method170() {
		if (!aBool3276) {
			aLong3255 = 0L * 2009587532026748603L;
		}

	}

	public void method171() {
		if (!aBool3276) {
			aLong3255 = (Class169.time() + 4000L) * -7135659755925244301L * 2009587532026748603L;
		}

	}

	public void method181() {
		if (!aBool3276) {
			aLong3255 = (Class169.time() + 4000L) * -7135659755925244301L * 2009587532026748603L;
		}

	}

	public void method172() {
		if (!aBool3276) {
			aLong3255 = (Class169.time() + 4000L) * -7135659755925244301L * 2009587532026748603L;
		}

	}

	public void method173() {
		if (!aBool3276) {
			aLong3255 = (Class169.time() + 4000L) * -7135659755925244301L * 2009587532026748603L;
		}

	}

	public final void update(Graphics graphics_1) {
		this.paint(graphics_1);
	}

	public void method175() {
		if (!aBool3276) {
			aLong3255 = Class169.time() * -7135659755925244301L * 2009587532026748603L;
			Class89.sleep(5000L);
			this.method4675(false, -1541596193);
		}

	}

	public final void method176(Graphics graphics_1) {
		this.paint(graphics_1);
	}

	public final void method177(Graphics graphics_1) {
		this.paint(graphics_1);
	}

	public final void method178(Graphics graphics_1) {
		this.paint(graphics_1);
	}

	public final synchronized void method179(Graphics graphics_1) {
		if (!aBool3276) {
			aBool3274 = true;
			if (Class169.time() - -8855560604364028117L * aLong3280 * 3757206876099985283L > 1000L) {
				Rectangle rectangle_2 = graphics_1.getClipBounds();
				if (rectangle_2 == null || rectangle_2.width >= Class45.anInt434 * 1426041429 * 765 * 1031248161 * -1016911135 && rectangle_2.height >= -499509193 * Class107.anInt1082 * -1929118563 * -969250379 * 685317511) {
					aBool3257 = true;
				}
			}
		}

	}

	void method4745(byte b_1) {
		if (Class282_Sub20_Sub34.aString9967 != null) {
			String string_2 = Class282_Sub20_Sub34.aString9967.toLowerCase();
			if (string_2.indexOf("sun") != -1 || string_2.indexOf("apple") != -1) {
				String string_3 = ChatLine.aString1093;
				if (string_3.equals("1.1") || string_3.startsWith("1.1.") || string_3.equals("1.2") || string_3.startsWith("1.2.") || string_3.equals("1.3") || string_3.startsWith("1.3.") || string_3.equals("1.4") || string_3.startsWith("1.4.") || string_3.equals("1.5") || string_3.startsWith("1.5.") || string_3.equals("1.6.0")) {
					this.method4680("wrongjava", -1236837356);
					return;
				}

				if (string_3.startsWith("1.6.0_")) {
					int i_4;
					for (i_4 = 6; i_4 < string_3.length() && AnimationIndexLoader.method11219(string_3.charAt(i_4), -2094159875); i_4++) {
						;
					}

					String string_5 = string_3.substring(6, i_4);
					if (Class115.method1950(string_5, 233261508) && Class328.parseInt(string_5, 1485921021) < 10) {
						this.method4680("wrongjava", -1712930660);
						return;
					}
				}
			}
		}

		Class371.getActiveContainer((byte) 1).setFocusCycleRoot(true);
		MAX_MEMORY = (int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1;
		AVAILABLE_PROCESSORS = Runtime.getRuntime().availableProcessors();
		this.method4704(1996724901);
		this.method4676((byte) 58);
		aClass273_3244 = Class84.method1461(192179911);

		while (aLong3255 == 0L || Class169.time() < aLong3255) {
			anInt3279 = aClass273_3244.method4842(aLong3242);

			for (int i_6 = 0; i_6 < anInt3279; i_6++) {
				this.method4667(981410915);
			}

			this.method4668(-1781025052);
			Class282_Sub20_Sub27.method15395(Class351.gameCanvas, -859332556);
		}

	}

	public final void windowClosed(WindowEvent windowevent_1) {
	}

	public void method174() {
		if (!aBool3276) {
			aLong3255 = Class169.time() * -7135659755925244301L * 2009587532026748603L;
			Class89.sleep(5000L);
			this.method4675(false, -1481410790);
		}

	}

	public abstract void method165();

	public abstract void method166();

	abstract void method4762();

	public final void windowIconified(WindowEvent windowevent_1) {
	}

	static final void method4772(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1550392426) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1419 = Class351.method6193(string_4, cs2executor_2, 902561109);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method4773(CS2Executor cs2executor_0, int i_1) {
		if (client.anInt7434 == 0) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -2;
		} else if (client.anInt7434 == 1) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7449;
		}

	}

	static final void method4774(CS2Executor cs2executor_0, int i_1) {
		String string_2 = null;
		if (Class119.aClass12_1461 != null) {
			string_2 = Class119.aClass12_1461.method473(-495509625);
		}

		if (string_2 == null) {
			string_2 = "";
		}

		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = string_2;
	}

	static final void method4775(CS2Executor cs2executor_0, int i_1) {
		Class242.method4166(61403740);
	}

	static final void method4776(CS2Executor cs2executor_0, int i_1) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub6_8192, 0, -1214034115);
		Class190.savePreferences((byte) 63);
		client.aBool7175 = false;
	}

	static int method4777(int i_0, int i_1, byte b_2) {
		return i_0 != SceneObjectType.WALL_DIAGONAL_CORNER.type && i_0 != SceneObjectType.WALL_STRAIGHT_CORNER.type ? Wall.anIntArray10531[i_1 & 0x3] : Wall.anIntArray10533[i_1 & 0x3];
	}

	static Class282_Sub50_Sub12 getIComponentVar(int i_0, long long_1) {
		Class282_Sub50_Sub12 class282_sub50_sub12_3 = (Class282_Sub50_Sub12) Class282_Sub50_Sub12.aClass465_9667.get((long) i_0 << 56 | long_1);
		if (class282_sub50_sub12_3 == null) {
			class282_sub50_sub12_3 = new Class282_Sub50_Sub12(i_0, long_1);
			Class282_Sub50_Sub12.aClass465_9667.method7765(class282_sub50_sub12_3, class282_sub50_sub12_3.data);
		}

		return class282_sub50_sub12_3;
	}

	static void method4779(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, byte b_9) {
		if (i_0 == i_2 && i_3 == i_1 && i_4 == i_6 && i_5 == i_7) {
			Class346.method6159(i_0, i_1, i_6, i_7, i_8, -1028676957);
		} else {
			int i_10 = i_0;
			int i_11 = i_1;
			int i_12 = i_0 * 3;
			int i_13 = i_1 * 3;
			int i_14 = i_2 * 3;
			int i_15 = i_3 * 3;
			int i_16 = i_4 * 3;
			int i_17 = i_5 * 3;
			int i_18 = i_6 - i_16 + i_14 - i_0;
			int i_19 = i_15 + (i_7 - i_17) - i_1;
			int i_20 = i_12 + (i_16 - i_14 - i_14);
			int i_21 = i_13 + (i_17 - i_15 - i_15);
			int i_22 = i_14 - i_12;
			int i_23 = i_15 - i_13;

			for (int i_24 = 128; i_24 <= 4096; i_24 += 128) {
				int i_25 = i_24 * i_24 >> 12;
				int i_26 = i_24 * i_25 >> 12;
				int i_27 = i_18 * i_26;
				int i_28 = i_19 * i_26;
				int i_29 = i_25 * i_20;
				int i_30 = i_21 * i_25;
				int i_31 = i_22 * i_24;
				int i_32 = i_24 * i_23;
				int i_33 = i_0 + (i_29 + i_27 + i_31 >> 12);
				int i_34 = (i_30 + i_28 + i_32 >> 12) + i_1;
				Class346.method6159(i_10, i_11, i_33, i_34, i_8, -880935447);
				i_10 = i_33;
				i_11 = i_34;
			}
		}

	}

}
