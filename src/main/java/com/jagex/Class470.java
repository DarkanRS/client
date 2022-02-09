package com.jagex;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import java.util.Stack;

public class Class470 {

    DisplayMode displayMode;

    GraphicsDevice defaultMoniter;

    public Class470() throws Exception {
        GraphicsEnvironment gfxEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        defaultMoniter = gfxEnvironment.getDefaultScreenDevice();
        if (!defaultMoniter.isFullScreenSupported()) {
            GraphicsDevice[] moniters = gfxEnvironment.getScreenDevices();
            GraphicsDevice[] monitersArr = moniters;
            for (int i = 0; i < monitersArr.length; i++) {
                GraphicsDevice moniter = monitersArr[i];
                if (moniter != null && moniter.isFullScreenSupported()) {
                    defaultMoniter = moniter;
                    return;
                }
            }
            throw new Exception();
        }
    }

    static int method7823(int i_0) {
        byte b_2;
        if (i_0 > 12097) {
            EquipmentDefaults.method11248();
            b_2 = 4;
        } else if (i_0 > 5098) {
            Node_Sub40.method13300();
            b_2 = 3;
        } else if (i_0 > 2012) {
            Class119.method2077();
            b_2 = 2;
        } else {
            MaterialProp14.method15393();
            b_2 = 1;
        }
        if (Class393.preferences.currentToolkit.getValue() != 2) {
            Class393.preferences.setValue(Class393.preferences.toolKit, 2);
            ParticleProducer.switchRenderType(2, false);
        } else {
            Class393.preferences.method13505(Class393.preferences.currentToolkit, true);
        }
        Class190.savePreferences();
        return b_2;
    }

    public static Class285 method7824(boolean bool_0) {
        Stack<Class285> stack_2 = Class285.aStack3390;
        synchronized (Class285.aStack3390) {
            Class285 class285_3;
            if (Class285.aStack3390.isEmpty()) {
                class285_3 = new Class285();
            } else {
                class285_3 = Class285.aStack3390.pop();
            }
            class285_3.aBool3392 = bool_0;
            return class285_3;
        }
    }

    static boolean method7825() {
        ++client.anInt7221;
        client.aBool7459 = true;
        return true;
    }

    int[] method7807() {
        DisplayMode[] arr_2 = defaultMoniter.getDisplayModes();
        int[] ints_3 = new int[arr_2.length << 2];
        for (int i_4 = 0; i_4 < arr_2.length; i_4++) {
            ints_3[i_4 << 2] = arr_2[i_4].getWidth();
            ints_3[(i_4 << 2) + 1] = arr_2[i_4].getHeight();
            ints_3[(i_4 << 2) + 2] = arr_2[i_4].getBitDepth();
            ints_3[(i_4 << 2) + 3] = arr_2[i_4].getRefreshRate();
        }
        return ints_3;
    }

    void method7808(Frame window, int width, int height, int i_4, int i_5) {
        int i_51 = i_5;
        displayMode = defaultMoniter.getDisplayMode();
        if (displayMode == null) {
            throw new NullPointerException();
        } else {
            window.setUndecorated(true);
            window.enableInputMethods(false);
            method7809(window);
            if (i_51 == 0) {
                int refreshRate = displayMode.getRefreshRate();
                DisplayMode[] displayModes = defaultMoniter.getDisplayModes();
                boolean bool_9 = false;
                for (int i = 0; i < displayModes.length; i++) {
                    if (displayModes[i].getWidth() == width && displayModes[i].getHeight() == height && displayModes[i].getBitDepth() == i_4) {
                        int i_11 = displayModes[i].getRefreshRate();
                        if (!bool_9 || Math.abs(i_11 - refreshRate) < Math.abs(-refreshRate)) {
                            i_51 = i_11;
                            bool_9 = true;
                        }
                    }
                }
                if (!bool_9) {
                    i_51 = refreshRate;
                }
            }
            defaultMoniter.setDisplayMode(new DisplayMode(width, height, i_4, i_51));
        }
    }

    void method7809(Frame frame_1) {
        boolean bool_3 = false;
        Field field_4;
        try {
            field_4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");

            field_4.setAccessible(true);
            boolean bool_5 = ((Boolean) field_4.get(defaultMoniter)).booleanValue();
            if (bool_5) {
                field_4.set(defaultMoniter, Boolean.FALSE);
                bool_3 = true;
            }
        } catch (Throwable ignored) {
        }
        try {
            defaultMoniter.setFullScreenWindow(frame_1);
            if (bool_3) {
                try {
                    field_4 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    field_4.set(defaultMoniter, Boolean.TRUE);
                } catch (Throwable ignored) {
                }
            }
        } catch (Exception exception_10) {
            if (bool_3) {
                try {
                    Field field_6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
                    field_6.set(defaultMoniter, Boolean.TRUE);
                } catch (Throwable ignored) {
                }
            }
        }
    }

    void method7820() {
        if (displayMode != null) {
            DisplayMode[] arr_2 = defaultMoniter.getDisplayModes();
            boolean bool_3 = false;
            DisplayMode[] arr_4 = arr_2;
            for (int i_5 = 0; i_5 < arr_4.length; i_5++) {
                DisplayMode displaymode_6 = arr_4[i_5];
                if (displaymode_6.equals(displayMode)) {
                    defaultMoniter.setDisplayMode(displayMode);
                    bool_3 = true;
                    break;
                }
            }
            if (!bool_3) {
                try {
                    Field field_7 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("defaultDisplayMode");
                    field_7.setAccessible(true);
                    field_7.set(defaultMoniter, null);
                } catch (Throwable ignored) {
                }
            }
            displayMode = null;
        }
        method7809(null);
    }
}
