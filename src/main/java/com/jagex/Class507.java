package com.jagex;

import java.awt.Container;
import java.awt.Insets;

import com.jagex.clans.settings.ChangeClanSetting;

public class Class507 {

    static Class208 aClass208_5860;

    Class507() throws Throwable {
        throw new Error();
    }

    static void method8725(int currentScreenMode, int desiredScreenMode, int width, int height, boolean isFullScreen) {
        if (Class475.supportsFullScreen && client.fullScreenFrame != null && (desiredScreenMode != 3 || width != Class363.anInt4203 || height != client.anInt3249)) {
            Class329.method5903(Class274.aClass470_3336, client.fullScreenFrame);
            client.fullScreenFrame = null;
        }
        if (Class475.supportsFullScreen && desiredScreenMode == 3 && client.fullScreenFrame == null) {
            client.fullScreenFrame = ModeWhere.method7852(Class274.aClass470_3336, width, height, 0);
            if (client.fullScreenFrame != null) {
                Class363.anInt4203 = width;
                client.anInt3249 = height;
                Class190.savePreferences();
            }
        }
        if (desiredScreenMode == 3 && (!Class475.supportsFullScreen || client.fullScreenFrame == null)) {
            method8725(currentScreenMode, Class393.preferences.screenSize.method12687(), -1, -1, true);
        } else {
            Container container_6 = Class371.getActiveContainer();
            Insets insets_7;
            if (client.fullScreenFrame != null) {
                SunIndexLoader.anInt434 = width;
                Class107.anInt1082 = height;
            } else if (client.engineFrame != null) {
                insets_7 = client.engineFrame.getInsets();
                int i_10001 = insets_7.left + insets_7.right;
                SunIndexLoader.anInt434 = client.engineFrame.getSize().width - i_10001;
                i_10001 = insets_7.bottom + insets_7.top;
                Class107.anInt1082 = client.engineFrame.getSize().height - i_10001;
            } else {
                SunIndexLoader.anInt434 = container_6.getSize().width;
                Class107.anInt1082 = container_6.getSize().height;
            }
            if (SunIndexLoader.anInt434 <= 0) {
                SunIndexLoader.anInt434 = 1;
            }
            if (Class107.anInt1082 <= 0) {
                Class107.anInt1082 = 1;
            }
            if (desiredScreenMode != 1) {
                Class46.method935();
            } else {
                ChangeClanSetting.BASE_WINDOW_WIDTH = client.GAME_WIDTH;
                client.GAME_CANVAS_X = (SunIndexLoader.anInt434 - client.GAME_WIDTH) / 2;
                client.BASE_WINDOW_HEIGHT = client.GAME_HEIGHT * -1929118563;
                client.GAME_CANVAS_Y = 0;
            }
            if (ConnectionInfo.SERVER_ENVIRONMENT != ServerEnvironment.LIVE && ChangeClanSetting.BASE_WINDOW_WIDTH < 1024) {
                int i_10000 = client.BASE_WINDOW_HEIGHT;
            }
            if (!isFullScreen) {
                Class351.gameCanvas.setSize(ChangeClanSetting.BASE_WINDOW_WIDTH, client.BASE_WINDOW_HEIGHT * -969250379);
                Renderers.CURRENT_RENDERER.method8414(Class351.gameCanvas, ChangeClanSetting.BASE_WINDOW_WIDTH, client.BASE_WINDOW_HEIGHT * -969250379);
                if (container_6 == client.engineFrame) {
                    insets_7 = client.engineFrame.getInsets();
                    Class351.gameCanvas.setLocation(insets_7.left + client.GAME_CANVAS_X, insets_7.top + client.GAME_CANVAS_Y);
                } else {
                    Class351.gameCanvas.setLocation(client.GAME_CANVAS_X, client.GAME_CANVAS_Y);
                }
            } else {
                Class350_Sub2.method12571(true);
            }
            client.resizeableScreen = desiredScreenMode >= 2;
            GameTipsLoader.method6795();
            if (client.BASE_WINDOW_ID != -1) {
                Class516.method8867(true);
            }
            if (client.GAME_CONNECTION_CONTEXT.getConnection() != null && GameState.loggedIn(client.GAME_STATE)) {
                Class388.method6692();
            }
            for (int i_8 = 0; i_8 < 107; i_8++) {
                client.INTERFACE_107_BIT23[i_8] = true;
            }
            client.aBool3274 = true;
        }
    }

    public static CacheableNode_Sub7 method8727() {
        return Class20.aCacheableNode_Sub7_168;
    }
}
