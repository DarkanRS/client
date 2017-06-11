/* Class291 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
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

public abstract class Class291 implements Interface14, Runnable, FocusListener, WindowListener {
	static Class292 aClass292_6466;
	public static int anInt6467;
	static String aString6468 = "rw";
	static int anInt6469 = 32;
	public static int availableCPU;
	protected static volatile boolean aBoolean6471;
	protected static int anInt6472;
	public static int anInt6473;
	public static int anInt6474;
	static Class484 aClass484_6475;
	protected static Class484 aClass484_6476;
	static int anInt6477;
	protected static volatile boolean aBoolean6478;
	static long[] aLongArray6479;
	protected static boolean aBoolean6480;
	static volatile boolean aBoolean6481;
	static int anInt6482 = 524288000;
	static int anInt6483 = 1048576;
	static long aLong6484 = 8126035193609507072L;
	protected static String aString6485;
	static long[] aLongArray6486;
	public static int maximumMemory;
	static String aString6488 = "main_file_cache.idx255";
	static String aString6489 = "random.dat";
	static String aString6490 = "main_file_cache.idx";
	static volatile long aLong6491;
	public static Class309 aClass309_6492;
	static int anInt6493 = 0;
	static String aString6494 = "main_file_cache.dat2";
	static int anInt6495 = 1;
	static long aLong6496;
	static boolean aBoolean6497;
	boolean aBoolean6498 = false;
	static Class484 aClass484_6499;
	static File aFile6500;
	boolean aBoolean6501 = false;

	public final void windowOpened(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.windowOpened(").append(')').toString());
		}
	}

	public void supplyApplet(Applet applet) {
		try {
			ClientScriptMap.anApplet6044 = applet;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.supplyApplet(").append(')').toString());
		}
	}

	final void method2751(Class311 class311, String string, String string_0_, int i, int i_1_, int i_2_, int i_3_, boolean bool, byte i_4_) {
		try {
			try {
				method2762(Class292.aClass292_3163, bool, (short) -2229);
				Class78.anInt733 = ((Class462.anInt5683 = class311.method3811((byte) -35) * -2010408377) * 1228593773);
				anInt6472 = ((Class298_Sub40_Sub9.anInt9716 = class311.method3815(2024501789) * 1445266787) * 1864178979);
				anInt6473 = 0;
				anInt6474 = 0;
				if (Class389.method4865((byte) 35) == Class292.aClass292_3164) {
					Class78.anInt733 += -1643230090 * class311.method3812((byte) 52);
					anInt6472 += 63301394 * class311.method3813(-974427485);
					method2780(class311.method3814(1376340372), -260131528);
				}
				RuntimeException_Sub2.anApplet6306 = ClientScriptMap.anApplet6044;
				method2752(string, string_0_, i, i_1_, i_2_, i_3_, (byte) 95);
			} catch (Throwable throwable) {
				Class464.method6062(null, throwable, (short) -30442);
				method2778("crash", 1946443012);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.a(").append(')').toString());
		}
	}

	final void method2752(String string, String string_5_, int i, int i_6_, int i_7_, int i_8_, byte i_9_) throws Exception {
		try {
			Class310.anInt6512 = i_6_ * -652430819;
			Class139.anInt1548 = i * 19765097;
			RuntimeException_Sub2.anInt6307 = i_7_ * 715279939;
			Class400.anInt5225 = i_8_ * 1366053379;
			Class350.aString3759 = "Unknown";
			Class120.aString1462 = "1.1";
			try {
				Class350.aString3759 = System.getProperty("java.vendor");
				Class120.aString1462 = System.getProperty("java.version");
			} catch (Exception exception) {
				/* empty */
			}
			try {
				Class365_Sub1_Sub3_Sub2.aString9932 = System.getProperty("os.name");
			} catch (Exception exception) {
				Class365_Sub1_Sub3_Sub2.aString9932 = "Unknown";
			}
			Class82_Sub8.aString6856 = Class365_Sub1_Sub3_Sub2.aString9932.toLowerCase();
			try {
				Class344.aString3687 = System.getProperty("os.arch").toLowerCase();
			} catch (Exception exception) {
				Class344.aString3687 = "";
			}
			try {
				Class250.aString2765 = System.getProperty("os.version").toLowerCase();
			} catch (Exception exception) {
				Class250.aString2765 = "";
			}
			try {
				Class83.aString765 = System.getProperty("user.home");
				if (Class83.aString765 != null)
					Class83.aString765 = new StringBuilder().append(Class83.aString765).append("/").toString();
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (Class82_Sub8.aString6856.startsWith("win")) {
					if (null == Class83.aString765)
						Class83.aString765 = System.getenv("USERPROFILE");
				} else if (null == Class83.aString765)
					Class83.aString765 = System.getenv("HOME");
				if (Class83.aString765 != null)
					Class83.aString765 = new StringBuilder().append(Class83.aString765).append("/").toString();
			} catch (Exception exception) {
				/* empty */
			}
			if (null == Class83.aString765)
				Class83.aString765 = "~/";
			try {
				ClientScript2.anEventQueue5262 = Toolkit.getDefaultToolkit().getSystemEventQueue();
			} catch (Throwable throwable) {
				/* empty */
			}
			Class216.aStringArray6657 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Class83.aString765, "/tmp/", "" };
			Class68.aStringArray679 = (new String[] { new StringBuilder().append(".titan2k12_cache_").append(Class139.anInt1548 * -518493991).toString(), new StringBuilder().append(".file_store_").append(-518493991 * Class139.anInt1548).toString() });
			while_73_: for (int i_10_ = 0; i_10_ < 4; i_10_++) {
				aFile6500 = method2783(string, string_5_, i_10_, (short) 8683);
				if (!aFile6500.exists())
					aFile6500.mkdirs();
				File[] files = aFile6500.listFiles();
				if (null == files)
					break;
				File[] files_11_ = files;
				int i_12_ = 0;
				for (;;) {
					if (i_12_ >= files_11_.length)
						break while_73_;
					File file = files_11_[i_12_];
					if (!method2753(file, false, -547060345)) {
						if (i_9_ > 3)
							break;
						return;
					}
					i_12_++;
				}
			}
			Class365_Sub1_Sub5_Sub1.method4528(aFile6500, (byte) 113);
			IsaacCipher.method5920(527600768);
			aClass484_6476 = (new Class484(new Class476(Class482.method6118("main_file_cache.dat2", (byte) -19), "rw", 524288000L), 5200, 0));
			aClass484_6475 = (new Class484(new Class476(Class482.method6118("main_file_cache.idx255", (byte) -21), "rw", 1048576L), 6000, 0));
			Class497.aClass484Array6106 = new Class484[Class310.anInt6512 * 1210163253];
			for (int i_13_ = 0; i_13_ < 1210163253 * Class310.anInt6512; i_13_++)
				Class497.aClass484Array6106[i_13_] = new Class484(new Class476((Class482.method6118(new StringBuilder().append("main_file_cache.idx").append(i_13_).toString(), (byte) -49)), "rw", 1048576L), 6000, 0);
			try {
				Class389.aClass457_4164 = new Class457();
			} catch (Exception exception) {
				Class452.aBoolean5642 = false;
			}
			Class82_Sub23.aClass295_6921 = new Class295();
			ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
			for (ThreadGroup threadgroup_14_ = threadgroup.getParent(); threadgroup_14_ != null; threadgroup_14_ = threadgroup.getParent())
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
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.f(").append(')').toString());
		}
	}

	boolean method2753(File file, boolean bool, int i) {
		try {
			boolean bool_16_;
			try {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i_17_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_17_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				if (bool)
					file.delete();
				bool_16_ = true;
			} catch (Exception exception) {
				return false;
			}
			return bool_16_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.k(").append(')').toString());
		}
	}

	public boolean method2754(File file, int i) {
		try {
			if (null == file)
				return false;
			if (!file.exists())
				return false;
			if (!file.isDirectory())
				return false;
			if (file.listFiles().length != 0)
				return false;
			if (!method2753(new File(file, "test.dat"), true, -1050192338))
				return false;
			method2755(file, aFile6500, 285238690);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.p(").append(')').toString());
		}
	}

	void method2755(File file, File file_18_, int i) {
		try {
			try {
				Class476 class476 = new Class476(Class180.aFile6528, "rw", 10000L);
				RsByteBuffer class298_sub53 = new RsByteBuffer(500);
				class298_sub53.writeByte(2);
				class298_sub53.writeByte(null != file_18_ ? 1 : 0);
				class298_sub53.putJagString(file.getPath(), (short) 3940);
				if (file_18_ != null)
					class298_sub53.putJagString(file_18_.getPath(), (short) -4942);
				class476.method6078(class298_sub53.buffer, 0, 385051775 * class298_sub53.index, -1059972794);
				class476.method6079(1033544132);
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.i(").append(')').toString());
		}
	}

	synchronized void method2756(int i) {
		try {
			method2757(-924154311);
			Container container = Class318.method3874((byte) 114);
			Class52_Sub2_Sub1.aCanvas9079 = new Canvas_Sub1(container);
			method2777(container, -1139610021);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.y(").append(')').toString());
		}
	}

	public final void method203(Graphics graphics) {
		method195(graphics);
	}

	void method2757(int i) {
		try {
			if (Class52_Sub2_Sub1.aCanvas9079 != null) {
				Class52_Sub2_Sub1.aCanvas9079.removeFocusListener(this);
				Class52_Sub2_Sub1.aCanvas9079.getParent().setBackground(Color.black);
				Class52_Sub2_Sub1.aCanvas9079.getParent().remove(Class52_Sub2_Sub1.aCanvas9079);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.v(").append(')').toString());
		}
	}

	final boolean method2758(int i) {
		try {
			String string = ClientScriptMap.anApplet6044.getDocumentBase().getHost().toLowerCase();
			if (string.equals("jagex.com") || string.endsWith(".jagex.com"))
				return true;
			if (string.equals("runescape.com") || string.endsWith(".runescape.com"))
				return true;
			if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com"))
				return true;
			if (string.endsWith("127.0.0.1") || string.endsWith(Class518.urp))
				return true;
			for (/**/; (string.length() > 0 && string.charAt(string.length() - 1) >= '0' && string.charAt(string.length() - 1) <= '9'); string = string.substring(0, string.length() - 1)) {
				/* empty */
			}
			if (string.endsWith("192.168.1."))
				return true;
			method2778("invalidhost", 827144132);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.g(").append(')').toString());
		}
	}

	public void run() {
		try {
			do {
				try {
					try {
						method2759((byte) 52);
					} catch (ThreadDeath threaddeath) {
						throw threaddeath;
					} catch (Throwable throwable) {
						Class464.method6062(method2761((byte) 7), throwable, (short) -23042);
						method2778("crash", 1023949022);
						method2776(true, (byte) 127);
						break;
					}
					method2776(true, (byte) 85);
				} catch (RuntimeException object) {
					method2776(true, (byte) 16);
					throw object;
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.run(").append(')').toString());
		}
	}

	void method2759(byte i) {
		try {
			if (null != Class350.aString3759) {
				String string = Class350.aString3759.toLowerCase();
				if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
					String string_19_ = Class120.aString1462;
					if (string_19_.equals("1.1") || string_19_.startsWith("1.1.") || string_19_.equals("1.2") || string_19_.startsWith("1.2.") || string_19_.equals("1.3") || string_19_.startsWith("1.3.") || string_19_.equals("1.4") || string_19_.startsWith("1.4.") || string_19_.equals("1.5") || string_19_.startsWith("1.5.") || string_19_.equals("1.6.0")) {
						method2778("wrongjava", -1275699738);
						return;
					}
					if (string_19_.startsWith("1.6.0_")) {
						int i_20_;
						for (i_20_ = 6; (i_20_ < string_19_.length() && Class431.method5764(string_19_.charAt(i_20_), -1385964882)); i_20_++) {
							/* empty */
						}
						String string_21_ = string_19_.substring(6, i_20_);
						if (Class51.method543(string_21_, 1847779492) && (Class216.method1998(string_21_, (short) -16539) < 10)) {
							method2778("wrongjava", 1520717461);
							return;
						}
					}
				}
			}
			Class318.method3874((byte) 121).setFocusCycleRoot(true);
			maximumMemory = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -1855823519;
			availableCPU = Runtime.getRuntime().availableProcessors() * 1245045379;
			method2756(-781587209);
			method2763((byte) 1);
			aClass309_6492 = Class360.method4302(-978847778);
			while (0L == 2916456661870185289L * aLong6496 || (Class122.method1319((byte) 1) < aLong6496 * 2916456661870185289L)) {
				RuntimeException_Sub1.anInt6303 = (aClass309_6492.method3787(aLong6484 * -4639622049358970979L) * -2090388391);
				for (int i_22_ = 0; i_22_ < RuntimeException_Sub1.anInt6303 * -1597189143; i_22_++)
					method2764((byte) 1);
				method2760(-454270165);
				Class492.method6185(Class52_Sub2_Sub1.aCanvas9079, -2014187301);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.e(").append(')').toString());
		}
	}

	void method2760(int i) {
		try {
			long l = Class122.method1319((byte) 1);
			long l_23_ = aLongArray6486[-1371443851 * Class272.anInt2903];
			aLongArray6486[-1371443851 * Class272.anInt2903] = l;
			Class272.anInt2903 = 1423456989 * (-1371443851 * Class272.anInt2903 + 1 & 0x1f);
			if (l_23_ != 0L && l > l_23_) {
				int i_24_ = (int) (l - l_23_);
				anInt6467 = ((i_24_ >> 1) + 32000) / i_24_ * -863758789;
			}
			if ((anInt6477 += -2020246835) * 698024453 - 1 > 50) {
				anInt6477 -= 2066873354;
				aBoolean6471 = true;
				Class52_Sub2_Sub1.aCanvas9079.setSize(Class462.anInt5683 * -2110394505, Class298_Sub40_Sub9.anInt9716 * -1111710645);
				Class52_Sub2_Sub1.aCanvas9079.setVisible(true);
				if (null != Class298_Sub36.aFrame7403 && Class231.aFrame2589 == null) {
					Insets insets = Class298_Sub36.aFrame7403.getInsets();
					Class52_Sub2_Sub1.aCanvas9079.setLocation(insets.left + anInt6473 * 1898544019, 540368727 * anInt6474 + insets.top);
				} else
					Class52_Sub2_Sub1.aCanvas9079.setLocation((anInt6473 * 1898544019), (540368727 * anInt6474));
			}
			method2774(1539562437);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.w(").append(')').toString());
		}
	}

	String method2761(byte i) {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.j(").append(')').toString());
		}
	}

	void method2762(Class292 class292, boolean bool, short i) {
		try {
			if (class292 == null)
				throw new NullPointerException();
			if (class292 != Class292.aClass292_3163 && Class292.aClass292_3162 != class292)
				throw new IllegalStateException();
			aClass292_6466 = class292;
			if (aClass292_6466 != Class292.aClass292_3162) {
				if (bool)
					aClass292_6466 = Class292.aClass292_3164;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.az(").append(')').toString());
		}
	}

	public void method192() {
		try {
			if (!aBoolean6497)
				aLong6496 = ((Class122.method1319((byte) 1) + 4000L) * -5427437724707662087L);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.stop(").append(')').toString());
		}
	}

	public final synchronized void method195(Graphics graphics) {
		try {
			if (!aBoolean6497) {
				aBoolean6471 = true;
				if ((Class122.method1319((byte) 1) - -4623726814665285853L * aLong6491) > 1000L) {
					Rectangle rectangle = graphics.getClipBounds();
					if (rectangle == null || (rectangle.width >= -639974669 * Class78.anInt733 && rectangle.height >= anInt6472 * 1282634425))
						aBoolean6478 = true;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.paint(").append(')').toString());
		}
	}

	public final void focusGained(FocusEvent focusevent) {
		try {
			aBoolean6481 = true;
			aBoolean6471 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.focusGained(").append(')').toString());
		}
	}

	public final void windowActivated(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.windowActivated(").append(')').toString());
		}
	}

	public final void windowClosed(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.windowClosed(").append(')').toString());
		}
	}

	public final void windowClosing(WindowEvent windowevent) {
		try {
			aBoolean6480 = true;
			method193();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.windowClosing(").append(')').toString());
		}
	}

	public final void windowDeiconified(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.windowDeiconified(").append(')').toString());
		}
	}

	public final void windowIconified(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.windowIconified(").append(')').toString());
		}
	}

	public void start() {
		try {
			if (!aBoolean6497)
				aLong6496 = 0L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.start(").append(')').toString());
		}
	}

	public abstract void init();

	abstract void method2763(byte i);

	void method2764(byte i) {
		try {
			long l = Class122.method1319((byte) 1);
			long l_25_ = aLongArray6479[Class402.anInt5227 * -1495088089];
			aLongArray6479[Class402.anInt5227 * -1495088089] = l;
			Class402.anInt5227 = -1259443305 * (1 + Class402.anInt5227 * -1495088089 & 0x1f);
			if (0L != l_25_ && l <= l_25_) {
				/* empty */
			}
			synchronized (this) {
				Class422_Sub7.aBoolean8385 = aBoolean6481;
			}
			method2773((byte) 17);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.m(").append(')').toString());
		}
	}

	abstract void method2765(int i);

	public abstract void method204();

	public boolean method2766(int i) {
		try {
			((Class291) this).aBoolean6501 = Class85.method955(-1461998657).method265("jaclib", 888400764);
			if (((Class291) this).aBoolean6501) {
				try {
					QueryPerformanceCounter.init();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			return ((Class291) this).aBoolean6501;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.ai(").append(')').toString());
		}
	}

	public boolean method2767(int i) {
		try {
			return Class85.method955(-975726550).method265("jagtheora", 1050805065);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.al(").append(')').toString());
		}
	}

	static {
		anInt6467 = 0;
		aLongArray6486 = new long[32];
		aLongArray6479 = new long[32];
		anInt6473 = 0;
		anInt6474 = 0;
		aString6485 = null;
		aBoolean6471 = true;
		anInt6477 = -806102940;
		aBoolean6478 = false;
		aLong6491 = 0L;
		aBoolean6480 = false;
		aBoolean6481 = true;
		aClass484_6499 = null;
		aClass484_6476 = null;
		aClass484_6475 = null;
		aClass292_6466 = null;
		aLong6496 = 0L;
		aBoolean6497 = false;
		maximumMemory = 1855823519;
		availableCPU = 1245045379;
	}

	public final synchronized void method191(Graphics graphics) {
		if (!aBoolean6497) {
			aBoolean6471 = true;
			if ((Class122.method1319((byte) 1) - -4623726814665285853L * aLong6491) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (rectangle == null || (rectangle.width >= -639974669 * Class78.anInt733 && rectangle.height >= anInt6472 * 1282634425))
					aBoolean6478 = true;
			}
		}
	}

	public final void method194(Graphics graphics) {
		try {
			method195(graphics);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.update(").append(')').toString());
		}
	}

	abstract void method2768();

	abstract void method2769();

	abstract void method2770();

	public abstract void method211();

	public final synchronized void method201(Graphics graphics) {
		if (!aBoolean6497) {
			aBoolean6471 = true;
			if ((Class122.method1319((byte) 1) - -4623726814665285853L * aLong6491) > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (rectangle == null || (rectangle.width >= -639974669 * Class78.anInt733 && rectangle.height >= anInt6472 * 1282634425))
					aBoolean6478 = true;
			}
		}
	}

	abstract void method2771();

	abstract void method2772();

	public void method196() {
		if (!aBoolean6497)
			aLong6496 = 0L;
	}

	public void method200() {
		if (!aBoolean6497) {
			aLong6496 = Class122.method1319((byte) 1) * -5427437724707662087L;
			Class464.method6060(5000L);
			method2776(false, (byte) 2);
		}
	}

	public void method193() {
		try {
			if (!aBoolean6497) {
				aLong6496 = Class122.method1319((byte) 1) * -5427437724707662087L;
				Class464.method6060(5000L);
				method2776(false, (byte) 120);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.destroy(").append(')').toString());
		}
	}

	abstract void method2773(byte i);

	abstract void method2774(int i);

	abstract void method2775();

	final void method2776(boolean bool, byte i) {
		try {
			synchronized (this) {
				if (aBoolean6497)
					return;
				aBoolean6497 = true;
			}
			try {
				method2765(2099588371);
			} catch (Exception exception) {
				/* empty */
			}
			try {
				aClass484_6476.method6133(23087728);
				for (int i_26_ = 0; i_26_ < 1210163253 * Class310.anInt6512; i_26_++)
					Class497.aClass484Array6106[i_26_].method6133(1779540289);
				aClass484_6475.method6133(1551725262);
				aClass484_6499.method6133(1640504231);
			} catch (Exception exception) {
				/* empty */
			}
			if (((Class291) this).aBoolean6501) {
				try {
					QueryPerformanceCounter.quit();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			Class71.method813(true, 32768);
			if (SubIncommingPacket.method1926(-1578689153))
				Class85.method955(-1456500375).method264(-242181565);
			if (Class52_Sub2_Sub1.aCanvas9079 != null) {
				try {
					Class52_Sub2_Sub1.aCanvas9079.removeFocusListener(this);
					Class52_Sub2_Sub1.aCanvas9079.getParent().remove(Class52_Sub2_Sub1.aCanvas9079);
				} catch (Exception exception) {
					/* empty */
				}
			}
			if (Class298_Sub36.aFrame7403 != null) {
				Class298_Sub36.aFrame7403.setVisible(false);
				Class298_Sub36.aFrame7403.dispose();
				Class298_Sub36.aFrame7403 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.o(").append(')').toString());
		}
	}

	void method2777(Container container, int i) {
		try {
			container.setBackground(Color.black);
			container.setLayout(null);
			container.add(Class52_Sub2_Sub1.aCanvas9079);
			Class52_Sub2_Sub1.aCanvas9079.setSize(-2110394505 * Class462.anInt5683, -1111710645 * Class298_Sub40_Sub9.anInt9716);
			Class52_Sub2_Sub1.aCanvas9079.setVisible(true);
			if (container == Class298_Sub36.aFrame7403) {
				Insets insets = Class298_Sub36.aFrame7403.getInsets();
				Class52_Sub2_Sub1.aCanvas9079.setLocation(insets.left + 1898544019 * anInt6473, anInt6474 * 540368727 + insets.top);
			} else
				Class52_Sub2_Sub1.aCanvas9079.setLocation((1898544019 * anInt6473), (540368727 * anInt6474));
			Class52_Sub2_Sub1.aCanvas9079.addFocusListener(this);
			Class52_Sub2_Sub1.aCanvas9079.requestFocus();
			Class422_Sub7.aBoolean8385 = true;
			aBoolean6481 = true;
			Class52_Sub2_Sub1.aCanvas9079.setFocusTraversalKeysEnabled(false);
			aBoolean6471 = true;
			aBoolean6478 = false;
			aLong6491 = Class122.method1319((byte) 1) * -4845717340640327541L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.h(").append(')').toString());
		}
	}

	public void method197() {
		if (!aBoolean6497)
			aLong6496 = ((Class122.method1319((byte) 1) + 4000L) * -5427437724707662087L);
	}

	public void method198() {
		if (!aBoolean6497)
			aLong6496 = ((Class122.method1319((byte) 1) + 4000L) * -5427437724707662087L);
	}

	public void method199() {
		if (!aBoolean6497)
			aLong6496 = ((Class122.method1319((byte) 1) + 4000L) * -5427437724707662087L);
	}

	public void method202() {
		if (!aBoolean6497) {
			aLong6496 = Class122.method1319((byte) 1) * -5427437724707662087L;
			Class464.method6060(5000L);
			method2776(false, (byte) 22);
		}
	}

	public final void method209(Graphics graphics) {
		method195(graphics);
	}

	void method2778(String string, int i) {
		try {
			if (!((Class291) this).aBoolean6498) {
				((Class291) this).aBoolean6498 = true;

				try {
					Class466.method6021(ClientScriptMap.anApplet6044, "loggedout", (short) 19911);
				} catch (Throwable throwable) {
					/* empty */
				}
				try {

				} catch (Exception exception) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.ah(").append(')').toString());
		}
	}

	Class291() {
		/* empty */
	}

	abstract void method2779();

	public final void windowDeactivated(WindowEvent windowevent) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.windowDeactivated(").append(')').toString());
		}
	}

	synchronized void method2780(String string, int i) {
		try {
			Class298_Sub36.aFrame7403 = new Frame();
			Class298_Sub36.aFrame7403.setTitle(string);
			Class298_Sub36.aFrame7403.setResizable(true);
			Class298_Sub36.aFrame7403.addWindowListener(this);
			Class298_Sub36.aFrame7403.setBackground(Color.black);
			Class298_Sub36.aFrame7403.setVisible(true);
			Class298_Sub36.aFrame7403.toFront();
			Insets insets = Class298_Sub36.aFrame7403.getInsets();
			Class298_Sub36.aFrame7403.setSize((insets.right + (Class78.anInt733 * -639974669 + insets.left)), (anInt6472 * 1282634425 + insets.top + insets.bottom));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.z(").append(')').toString());
		}
	}

	public abstract void method208();

	public abstract void method205();

	public abstract void method206();

	public abstract void method207();

	public abstract void method210();

	abstract void method2781();

	abstract void method2782();

	public final void focusLost(FocusEvent focusevent) {
		try {
			aBoolean6481 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.focusLost(").append(')').toString());
		}
	}

	File method2783(String string, String string_27_, int i, short i_28_) {
		try {
			String string_29_ = (i == 0 ? "" : new StringBuilder().append("").append(i).toString());
			Class180.aFile6528 = new File(Class83.aString765, new StringBuilder().append("titan2k12_cl_").append(string).append("_").append(string_27_).append(string_29_).append(".dat").toString());
			String string_30_ = null;
			String string_31_ = null;
			boolean bool = false;
			if (Class180.aFile6528.exists()) {
				try {
					Class476 class476 = new Class476(Class180.aFile6528, "rw", 10000L);
					int i_32_;
					RsByteBuffer class298_sub53;
					for (class298_sub53 = (new RsByteBuffer((int) class476.method6080(-840924897))); (class298_sub53.index * 385051775 < class298_sub53.buffer.length); class298_sub53.index += i_32_ * 116413311) {
						i_32_ = (class476.method6081(class298_sub53.buffer, class298_sub53.index * 385051775, (class298_sub53.buffer.length - class298_sub53.index * 385051775), (short) -10746));
						if (i_32_ == -1)
							throw new IOException();
					}
					class298_sub53.index = 0;
					i_32_ = class298_sub53.readUnsignedByte();
					if (i_32_ < 1 || i_32_ > 2)
						throw new IOException(new StringBuilder().append("").append(i_32_).toString());
					int i_33_ = 0;
					if (i_32_ > 1)
						i_33_ = class298_sub53.readUnsignedByte();
					string_30_ = class298_sub53.readJagString(681479919);
					if (1 == i_33_)
						string_31_ = class298_sub53.readJagString(681479919);
					class476.method6079(554571748);
				} catch (IOException ioexception) {
					ioexception.printStackTrace();
				}
				if (null != string_30_) {
					File file = new File(string_30_);
					if (!file.exists())
						string_30_ = null;
				}
				if (null != string_30_) {
					File file = new File(string_30_, "test.dat");
					if (!method2753(file, true, -332239711))
						string_30_ = null;
				}
			}
			if (string_30_ == null && 0 == i) {
				while_74_: for (int i_34_ = 0; i_34_ < Class68.aStringArray679.length; i_34_++) {
					for (int i_35_ = 0; i_35_ < Class216.aStringArray6657.length; i_35_++) {
						File file = new File(new StringBuilder().append(Class216.aStringArray6657[i_35_]).append(Class68.aStringArray679[i_34_]).append(File.separatorChar).append(string).append(File.separatorChar).toString());
						if (file.exists() && method2753(new File(file, "test.dat"), true, -1984790861)) {
							string_30_ = file.toString();
							bool = true;
							break while_74_;
						}
					}
				}
			}
			if (string_30_ == null) {
				string_30_ = new StringBuilder().append(Class83.aString765).append(File.separatorChar).append("titan2k12cache").append(string_29_).append(File.separatorChar).append(string).append(File.separatorChar).append(string_27_).append(File.separatorChar).toString();
				bool = true;
			}
			if (null != string_31_) {
				File file = new File(string_31_);
				File file_36_ = new File(string_30_);
				try {
					File[] files = file.listFiles();
					File[] files_37_ = files;
					for (int i_38_ = 0; i_38_ < files_37_.length; i_38_++) {
						File file_39_ = files_37_[i_38_];
						File file_40_ = new File(file_36_, file_39_.getName());
						boolean bool_41_ = file_39_.renameTo(file_40_);
						if (!bool_41_)
							throw new IOException();
					}
				} catch (Exception exception) {
					exception.printStackTrace();
				}
				bool = true;
			}
			if (bool)
				method2755(new File(string_30_), null, 359278649);
			return new File(string_30_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.b(").append(')').toString());
		}
	}

	abstract void method2784();

	public static Class319 method2785(Component component, boolean bool, short i) {
		try {
			return new Class319_Sub1(component, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.a(").append(')').toString());
		}
	}

	static final void method2786(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class298_Sub43.method3527(class105, class119, class403, (byte) -29);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.eq(").append(')').toString());
		}
	}

	static final void method2787(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			class105.anInt1178 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) * 1158843261;
			Tradution.method6054(class105, 510093055);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.fy(").append(')').toString());
		}
	}

	static final void method2788(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -1424956747 * class105.anInt1167;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.pz(").append(')').toString());
		}
	}

	static Class337 method2789(int i, byte i_42_) {
		try {
			Class337[] class337s = SubIncommingPacket.method1920(-1851883668);
			for (int i_43_ = 0; i_43_ < class337s.length; i_43_++) {
				Class337 class337 = class337s[i_43_];
				if (((Class337) class337).anInt3626 * 1161031995 == i)
					return class337;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.f(").append(')').toString());
		}
	}

	static final void method2790(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1] = (((ClientScript2) class403).aClass162_5252.method1756((byte) 4)[(((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1])]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.xv(").append(')').toString());
		}
	}

	static void method2791(int i, String string, String string_44_, int i_45_) {
		try {
			if (null != client.gameConnection) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2088, client.gameConnection.aClass449_330, (byte) 94);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeShort((1 + Class120.method1310(string, (byte) -1) + Class120.method1310(string_44_, (byte) -1)), 16711935);
				class298_sub36.aClass298_Sub53_Sub2_7396.putJagString(string_44_, (short) -29506);
				class298_sub36.aClass298_Sub53_Sub2_7396.write128Byte(i, (byte) 1);
				class298_sub36.aClass298_Sub53_Sub2_7396.putJagString(string, (short) 12393);
				client.gameConnection.method390(class298_sub36, (byte) -120);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mc.apk(").append(')').toString());
		}
	}
}
