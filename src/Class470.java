import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import java.util.Stack;

public class Class470 {

	DisplayMode aDisplayMode5587;

	GraphicsDevice aGraphicsDevice5586;

	int[] method7807(byte b_1) {
		DisplayMode[] arr_2 = this.aGraphicsDevice5586.getDisplayModes();
		int[] ints_3 = new int[arr_2.length << 2];
		for (int i_4 = 0; i_4 < arr_2.length; i_4++) {
			ints_3[i_4 << 2] = arr_2[i_4].getWidth();
			ints_3[(i_4 << 2) + 1] = arr_2[i_4].getHeight();
			ints_3[(i_4 << 2) + 2] = arr_2[i_4].getBitDepth();
			ints_3[(i_4 << 2) + 3] = arr_2[i_4].getRefreshRate();
		}
		return ints_3;
	}

	void method7808(Frame frame_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.aDisplayMode5587 = this.aGraphicsDevice5586.getDisplayMode();
		if (this.aDisplayMode5587 == null) {
			throw new NullPointerException();
		} else {
			frame_1.setUndecorated(true);
			frame_1.enableInputMethods(false);
			this.method7809(frame_1, -1208525507);
			if (i_5 == 0) {
				int i_7 = this.aDisplayMode5587.getRefreshRate();
				DisplayMode[] arr_8 = this.aGraphicsDevice5586.getDisplayModes();
				boolean bool_9 = false;
				for (int i_10 = 0; i_10 < arr_8.length; i_10++) {
					if (arr_8[i_10].getWidth() == i_2 && arr_8[i_10].getHeight() == i_3 && arr_8[i_10].getBitDepth() == i_4) {
						int i_11 = arr_8[i_10].getRefreshRate();
						if (!bool_9 || Math.abs(i_11 - i_7) < Math.abs(i_5 - i_7)) {
							i_5 = i_11;
							bool_9 = true;
						}
					}
				}
				if (!bool_9) {
					i_5 = i_7;
				}
			}
			this.aGraphicsDevice5586.setDisplayMode(new DisplayMode(i_2, i_3, i_4, i_5));
		}
	}

	public Class470() throws Exception {
		GraphicsEnvironment graphicsenvironment_1 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice5586 = graphicsenvironment_1.getDefaultScreenDevice();
		if (!this.aGraphicsDevice5586.isFullScreenSupported()) {
			GraphicsDevice[] arr_2 = graphicsenvironment_1.getScreenDevices();
			GraphicsDevice[] arr_3 = arr_2;
			for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
				GraphicsDevice graphicsdevice_5 = arr_3[i_4];
				if (graphicsdevice_5 != null && graphicsdevice_5.isFullScreenSupported()) {
					this.aGraphicsDevice5586 = graphicsdevice_5;
					return;
				}
			}
			throw new Exception();
		}
	}

	void method7809(Frame frame_1, int i_2) {
		boolean bool_3 = false;
		Field field_4;
		try {
			field_4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field_4.setAccessible(true);
			boolean bool_5 = ((Boolean) field_4.get(this.aGraphicsDevice5586)).booleanValue();
			if (bool_5) {
				field_4.set(this.aGraphicsDevice5586, Boolean.FALSE);
				bool_3 = true;
			}
		} catch (Throwable throwable_9) {
			;
		}
		try {
			this.aGraphicsDevice5586.setFullScreenWindow(frame_1);
			if (bool_3) {
				try {
					field_4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field_4.set(this.aGraphicsDevice5586, Boolean.TRUE);
				} catch (Throwable throwable_8) {
					;
				}
			}
		} catch (Exception exception_10) {
			if (bool_3) {
				try {
					Field field_6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					field_6.set(this.aGraphicsDevice5586, Boolean.TRUE);
				} catch (Throwable throwable_7) {
					;
				}
			}
		}
	}

	void method7820(byte b_1) {
		if (this.aDisplayMode5587 != null) {
			DisplayMode[] arr_2 = this.aGraphicsDevice5586.getDisplayModes();
			boolean bool_3 = false;
			DisplayMode[] arr_4 = arr_2;
			for (int i_5 = 0; i_5 < arr_4.length; i_5++) {
				DisplayMode displaymode_6 = arr_4[i_5];
				if (displaymode_6.equals(this.aDisplayMode5587)) {
					this.aGraphicsDevice5586.setDisplayMode(this.aDisplayMode5587);
					bool_3 = true;
					break;
				}
			}
			if (!bool_3) {
				try {
					Field field_7 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
					field_7.setAccessible(true);
					field_7.set(this.aGraphicsDevice5586, (Object) null);
				} catch (Throwable throwable_8) {
					;
				}
			}
			this.aDisplayMode5587 = null;
		}
		this.method7809((Frame) null, -987965964);
	}

	static int method7823(int i_0, int i_1) {
		byte b_2;
		if (i_0 > 12097) {
			Defaults6Loader.method11248(101206847);
			b_2 = 4;
		} else if (i_0 > 5098) {
			Class282_Sub40.method13300(-804709931);
			b_2 = 3;
		} else if (i_0 > 2012) {
			Class119.method2077(1657485946);
			b_2 = 2;
		} else {
			Class282_Sub20_Sub25.method15393(true, 1578234856);
			b_2 = 1;
		}
		if (Class393.preferences.currentToolkit.getValue(-1022441189) != 2) {
			Class393.preferences.setValue(Class393.preferences.aClass468_Sub18_8214, 2, -676897118);
			ParticleProducer.method11500(2, false, (byte) 24);
		} else {
			Class393.preferences.method13505(Class393.preferences.currentToolkit, true, 861454749);
		}
		Class190.savePreferences((byte) 99);
		return b_2;
	}

	public static Class285 method7824(boolean bool_0, byte b_1) {
		Stack stack_2 = Class285.aStack3390;
		synchronized (Class285.aStack3390) {
			Class285 class285_3;
			if (Class285.aStack3390.isEmpty()) {
				class285_3 = new Class285();
			} else {
				class285_3 = (Class285) Class285.aStack3390.pop();
			}
			class285_3.aBool3392 = bool_0;
			return class285_3;
		}
	}

	static boolean method7825(int i_0) {
		++client.anInt7221;
		client.aBool7459 = true;
		return true;
	}
}
