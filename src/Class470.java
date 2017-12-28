
/* Class470 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Class470 {
	GraphicsDevice aGraphicsDevice5586;
	DisplayMode aDisplayMode5587;

	void method7806(Frame frame, int i, int i_0_, int i_1_, int i_2_) {
		((Class470) this).aDisplayMode5587 = ((Class470) this).aGraphicsDevice5586.getDisplayMode();
		if (null == ((Class470) this).aDisplayMode5587)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method7809(frame, 1163969038);
		if (i_2_ == 0) {
			int i_3_ = ((Class470) this).aDisplayMode5587.getRefreshRate();
			DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
			boolean bool = false;
			for (int i_4_ = 0; i_4_ < displaymodes.length; i_4_++) {
				if (displaymodes[i_4_].getWidth() == i && displaymodes[i_4_].getHeight() == i_0_ && displaymodes[i_4_].getBitDepth() == i_1_) {
					int i_5_ = displaymodes[i_4_].getRefreshRate();
					if (!bool || Math.abs(i_5_ - i_3_) < Math.abs(i_2_ - i_3_)) {
						i_2_ = i_5_;
						bool = true;
					}
				}
			}
			if (!bool)
				i_2_ = i_3_;
		}
		((Class470) this).aGraphicsDevice5586.setDisplayMode(new DisplayMode(i, i_0_, i_1_, i_2_));
	}

	int[] method7807(byte i) {
		DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i_6_ = 0; i_6_ < displaymodes.length; i_6_++) {
			is[i_6_ << 2] = displaymodes[i_6_].getWidth();
			is[(i_6_ << 2) + 1] = displaymodes[i_6_].getHeight();
			is[2 + (i_6_ << 2)] = displaymodes[i_6_].getBitDepth();
			is[3 + (i_6_ << 2)] = displaymodes[i_6_].getRefreshRate();
		}
		return is;
	}

	void method7808(Frame frame, int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		((Class470) this).aDisplayMode5587 = ((Class470) this).aGraphicsDevice5586.getDisplayMode();
		if (null == ((Class470) this).aDisplayMode5587)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method7809(frame, -1208525507);
		if (i_9_ == 0) {
			int i_11_ = ((Class470) this).aDisplayMode5587.getRefreshRate();
			DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
			boolean bool = false;
			for (int i_12_ = 0; i_12_ < displaymodes.length; i_12_++) {
				if (displaymodes[i_12_].getWidth() == i && displaymodes[i_12_].getHeight() == i_7_ && displaymodes[i_12_].getBitDepth() == i_8_) {
					int i_13_ = displaymodes[i_12_].getRefreshRate();
					if (!bool || Math.abs(i_13_ - i_11_) < Math.abs(i_9_ - i_11_)) {
						i_9_ = i_13_;
						bool = true;
					}
				}
			}
			if (!bool)
				i_9_ = i_11_;
		}
		((Class470) this).aGraphicsDevice5586.setDisplayMode(new DisplayMode(i, i_7_, i_8_, i_9_));
	}

	public Class470() throws Exception {
		GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		((Class470) this).aGraphicsDevice5586 = graphicsenvironment.getDefaultScreenDevice();
		if (!((Class470) this).aGraphicsDevice5586.isFullScreenSupported()) {
			GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
			GraphicsDevice[] graphicsdevices_14_ = graphicsdevices;
			for (int i = 0; i < graphicsdevices_14_.length; i++) {
				GraphicsDevice graphicsdevice = graphicsdevices_14_[i];
				if (null != graphicsdevice && graphicsdevice.isFullScreenSupported()) {
					((Class470) this).aGraphicsDevice5586 = graphicsdevice;
					return;
				}
			}
			throw new Exception();
		}
	}

	void method7809(Frame frame, int i) {
		boolean bool = false;
		try {
			Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field.setAccessible(true);
			boolean bool_15_ = ((Boolean) field.get(((Class470) this).aGraphicsDevice5586)).booleanValue();
			if (bool_15_) {
				field.set(((Class470) this).aGraphicsDevice5586, Boolean.FALSE);
				bool = true;
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			((Class470) this).aGraphicsDevice5586.setFullScreenWindow(frame);
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(((Class470) this).aGraphicsDevice5586, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (Exception object) {
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(((Class470) this).aGraphicsDevice5586, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			//throw object;
		}
	}

	int[] method7810() {
		DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i = 0; i < displaymodes.length; i++) {
			is[i << 2] = displaymodes[i].getWidth();
			is[(i << 2) + 1] = displaymodes[i].getHeight();
			is[2 + (i << 2)] = displaymodes[i].getBitDepth();
			is[3 + (i << 2)] = displaymodes[i].getRefreshRate();
		}
		return is;
	}

	int[] method7811() {
		DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i = 0; i < displaymodes.length; i++) {
			is[i << 2] = displaymodes[i].getWidth();
			is[(i << 2) + 1] = displaymodes[i].getHeight();
			is[2 + (i << 2)] = displaymodes[i].getBitDepth();
			is[3 + (i << 2)] = displaymodes[i].getRefreshRate();
		}
		return is;
	}

	int[] method7812() {
		DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		for (int i = 0; i < displaymodes.length; i++) {
			is[i << 2] = displaymodes[i].getWidth();
			is[(i << 2) + 1] = displaymodes[i].getHeight();
			is[2 + (i << 2)] = displaymodes[i].getBitDepth();
			is[3 + (i << 2)] = displaymodes[i].getRefreshRate();
		}
		return is;
	}

	void method7813(Frame frame, int i, int i_16_, int i_17_, int i_18_) {
		((Class470) this).aDisplayMode5587 = ((Class470) this).aGraphicsDevice5586.getDisplayMode();
		if (null == ((Class470) this).aDisplayMode5587)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method7809(frame, 2102203780);
		if (i_18_ == 0) {
			int i_19_ = ((Class470) this).aDisplayMode5587.getRefreshRate();
			DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
			boolean bool = false;
			for (int i_20_ = 0; i_20_ < displaymodes.length; i_20_++) {
				if (displaymodes[i_20_].getWidth() == i && displaymodes[i_20_].getHeight() == i_16_ && displaymodes[i_20_].getBitDepth() == i_17_) {
					int i_21_ = displaymodes[i_20_].getRefreshRate();
					if (!bool || Math.abs(i_21_ - i_19_) < Math.abs(i_18_ - i_19_)) {
						i_18_ = i_21_;
						bool = true;
					}
				}
			}
			if (!bool)
				i_18_ = i_19_;
		}
		((Class470) this).aGraphicsDevice5586.setDisplayMode(new DisplayMode(i, i_16_, i_17_, i_18_));
	}

	void method7814() {
		if (null != ((Class470) this).aDisplayMode5587) {
			DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_22_ = displaymodes;
			for (int i = 0; i < displaymodes_22_.length; i++) {
				DisplayMode displaymode = displaymodes_22_[i];
				if (displaymode.equals(((Class470) this).aDisplayMode5587)) {
					((Class470) this).aGraphicsDevice5586.setDisplayMode(((Class470) this).aDisplayMode5587);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(((Class470) this).aGraphicsDevice5586, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class470) this).aDisplayMode5587 = null;
		}
		method7809(null, 1411285754);
	}

	void method7815(Frame frame, int i, int i_23_, int i_24_, int i_25_) {
		((Class470) this).aDisplayMode5587 = ((Class470) this).aGraphicsDevice5586.getDisplayMode();
		if (null == ((Class470) this).aDisplayMode5587)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		method7809(frame, -1694700987);
		if (i_25_ == 0) {
			int i_26_ = ((Class470) this).aDisplayMode5587.getRefreshRate();
			DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
			boolean bool = false;
			for (int i_27_ = 0; i_27_ < displaymodes.length; i_27_++) {
				if (displaymodes[i_27_].getWidth() == i && displaymodes[i_27_].getHeight() == i_23_ && displaymodes[i_27_].getBitDepth() == i_24_) {
					int i_28_ = displaymodes[i_27_].getRefreshRate();
					if (!bool || Math.abs(i_28_ - i_26_) < Math.abs(i_25_ - i_26_)) {
						i_25_ = i_28_;
						bool = true;
					}
				}
			}
			if (!bool)
				i_25_ = i_26_;
		}
		((Class470) this).aGraphicsDevice5586.setDisplayMode(new DisplayMode(i, i_23_, i_24_, i_25_));
	}

	void method7816() {
		if (null != ((Class470) this).aDisplayMode5587) {
			DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_29_ = displaymodes;
			for (int i = 0; i < displaymodes_29_.length; i++) {
				DisplayMode displaymode = displaymodes_29_[i];
				if (displaymode.equals(((Class470) this).aDisplayMode5587)) {
					((Class470) this).aGraphicsDevice5586.setDisplayMode(((Class470) this).aDisplayMode5587);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(((Class470) this).aGraphicsDevice5586, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class470) this).aDisplayMode5587 = null;
		}
		method7809(null, 1207530464);
	}

	void method7817() {
		if (null != ((Class470) this).aDisplayMode5587) {
			DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_30_ = displaymodes;
			for (int i = 0; i < displaymodes_30_.length; i++) {
				DisplayMode displaymode = displaymodes_30_[i];
				if (displaymode.equals(((Class470) this).aDisplayMode5587)) {
					((Class470) this).aGraphicsDevice5586.setDisplayMode(((Class470) this).aDisplayMode5587);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(((Class470) this).aGraphicsDevice5586, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class470) this).aDisplayMode5587 = null;
		}
		method7809(null, -1658503027);
	}

	void method7818(Frame frame) {
		boolean bool = false;
		try {
			Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field.setAccessible(true);
			boolean bool_31_ = ((Boolean) field.get(((Class470) this).aGraphicsDevice5586)).booleanValue();
			if (bool_31_) {
				field.set(((Class470) this).aGraphicsDevice5586, Boolean.FALSE);
				bool = true;
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		try {
			((Class470) this).aGraphicsDevice5586.setFullScreenWindow(frame);
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(((Class470) this).aGraphicsDevice5586, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (Exception object) {
			if (bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field.set(((Class470) this).aGraphicsDevice5586, Boolean.TRUE);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			//throw object;
		}
	}

	void method7819() {
		if (null != ((Class470) this).aDisplayMode5587) {
			DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_32_ = displaymodes;
			for (int i = 0; i < displaymodes_32_.length; i++) {
				DisplayMode displaymode = displaymodes_32_[i];
				if (displaymode.equals(((Class470) this).aDisplayMode5587)) {
					((Class470) this).aGraphicsDevice5586.setDisplayMode(((Class470) this).aDisplayMode5587);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(((Class470) this).aGraphicsDevice5586, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class470) this).aDisplayMode5587 = null;
		}
		method7809(null, -266050405);
	}

	void method7820(byte i) {
		if (null != ((Class470) this).aDisplayMode5587) {
			DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_33_ = displaymodes;
			for (int i_34_ = 0; i_34_ < displaymodes_33_.length; i_34_++) {
				DisplayMode displaymode = displaymodes_33_[i_34_];
				if (displaymode.equals(((Class470) this).aDisplayMode5587)) {
					((Class470) this).aGraphicsDevice5586.setDisplayMode(((Class470) this).aDisplayMode5587);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(((Class470) this).aGraphicsDevice5586, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class470) this).aDisplayMode5587 = null;
		}
		method7809(null, -987965964);
	}

	void method7821() {
		if (null != ((Class470) this).aDisplayMode5587) {
			DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_35_ = displaymodes;
			for (int i = 0; i < displaymodes_35_.length; i++) {
				DisplayMode displaymode = displaymodes_35_[i];
				if (displaymode.equals(((Class470) this).aDisplayMode5587)) {
					((Class470) this).aGraphicsDevice5586.setDisplayMode(((Class470) this).aDisplayMode5587);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(((Class470) this).aGraphicsDevice5586, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class470) this).aDisplayMode5587 = null;
		}
		method7809(null, -1881290413);
	}

	void method7822() {
		if (null != ((Class470) this).aDisplayMode5587) {
			DisplayMode[] displaymodes = ((Class470) this).aGraphicsDevice5586.getDisplayModes();
			boolean bool = false;
			DisplayMode[] displaymodes_36_ = displaymodes;
			for (int i = 0; i < displaymodes_36_.length; i++) {
				DisplayMode displaymode = displaymodes_36_[i];
				if (displaymode.equals(((Class470) this).aDisplayMode5587)) {
					((Class470) this).aGraphicsDevice5586.setDisplayMode(((Class470) this).aDisplayMode5587);
					bool = true;
					break;
				}
			}
			if (!bool) {
				try {
					Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field.setAccessible(true);
					field.set(((Class470) this).aGraphicsDevice5586, null);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((Class470) this).aDisplayMode5587 = null;
		}
		method7809(null, 494953167);
	}

	static int method7823(int i, int i_37_) {
		int i_38_;
		if (i > 12097) {
			Class526.method11248(101206847);
			i_38_ = 4;
		} else if (i > 5098) {
			Class282_Sub40.method13300(-804709931);
			i_38_ = 3;
		} else if (i > 2012) {
			Class119.method2077(1657485946);
			i_38_ = 2;
		} else {
			Class282_Sub20_Sub25.method15393(true, 1578234856);
			i_38_ = 1;
		}
		if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1022441189) != 2) {
			Class393.aClass282_Sub54_4783.method13511((Class393.aClass282_Sub54_4783.aClass468_Sub18_8214), 2, -676897118);
			Class538.method11500(2, false, (byte) 24);
		} else
			Class393.aClass282_Sub54_4783.method13505((Class393.aClass282_Sub54_4783.aClass468_Sub18_8230), true, 861454749);
		Class190.method3148((byte) 99);
		return i_38_;
	}

	public static Class285 method7824(boolean bool, byte i) {
		synchronized (Class285.aStack3390) {
			Class285 class285;
			if (Class285.aStack3390.isEmpty())
				class285 = new Class285();
			else
				class285 = (Class285) Class285.aStack3390.pop();
			((Class285) class285).aBool3392 = bool;
			Class285 class285_39_ = class285;
			return class285_39_;
		}
	}

	static boolean method7825(int i) {
		client.anInt7221 += -1059690243;
		client.aBool7459 = true;
		return true;
	}

	static final void method7826(Class527 class527, byte i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_40_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]);
		int i_41_ = (((Class527) class527).anIntArray6999[1 + 1942118537 * ((Class527) class527).anInt7012]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = (Class296.aClass331_3535.method5918(i_40_, 1106724870).aCharArray9748[i_41_]);
	}
}
