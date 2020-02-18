package com.jagex;

import java.io.IOException;
import java.net.Socket;
import java.util.Calendar;

public class ConnectionInfo {

    public static int anInt5438;
    public String host;
    public int worldId;
    public int anInt5437 = 1;
    public int anInt5434 = -190419398;
    boolean alternate = true;
    boolean proxied;

    static String method7499(long long_0) {
        Calendar calendar_5;
        if (true) {
            SkyboxIndexLoader.method5083(long_0);
            calendar_5 = Class407.aCalendar4846;
        } else {
            Class155.method2634(long_0);
            calendar_5 = Class407.aCalendar4848;
        }
        int i_6 = calendar_5.get(Calendar.DATE);
        int i_7 = calendar_5.get(Calendar.MONTH) + 1;
        int i_8 = calendar_5.get(Calendar.YEAR);
        int i_9 = calendar_5.get(Calendar.HOUR_OF_DAY);
        int i_10 = calendar_5.get(Calendar.MINUTE);
        return Integer.toString(i_6 / 10) + i_6 % 10 + "/" + i_7 / 10 + i_7 % 10 + "/" + i_8 % 100 / 10 + i_8 % 10 + " " + i_9 / 10 + i_9 % 10 + ":" + i_10 / 10 + i_10 % 10;
    }

    public boolean equals(ConnectionInfo class450_1) {
        return class450_1 != null && (worldId == class450_1.worldId && host.equals(class450_1.host));
    }

    public void swap() {
        if (!alternate) {
            alternate = true;
            proxied = true;
        } else if (proxied) {
            proxied = false;
        } else {
            alternate = false;
        }
    }

    public Socket createSocket() throws IOException {
        return new Socket(host, 5555);
    }
}
