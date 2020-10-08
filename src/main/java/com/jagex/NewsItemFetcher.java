package com.jagex;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

public class NewsItemFetcher implements Runnable {

    Thread aThread355;

    volatile boolean fetched;

    NewsItem[] newsItems;

    public static void method795() {
        Class235.aClass465_2904 = new IterableNodeMap(8);
        Class235.anInt2898 = 0;
        for (ParticleSystem class539_2 : Class235.aList2896) {
            class539_2.method11506();
        }
    }

    public static void method796(int[] ints_0, Object[] arr_1) {
        Class51.method1074(ints_0, arr_1, 0, ints_0.length - 1);
    }

    NewsItem get(int id) {
        return newsItems != null && id >= 0 && id < newsItems.length ? newsItems[id] : null;
    }

    boolean fetch() {
        if (fetched) {
            return true;
        } else {
            if (aThread355 == null) {
                aThread355 = new Thread(this);
                aThread355.start();
            }
            return fetched;
        }
    }

    @Override
    public void run() {
        try {
            int port = HDWaterTile.SERVER_ENVIRONMENT == ServerEnvironment.LIVE ? 80 : ConnectionInfo.JS5_CONNECTION_INFO.worldId + 7000;
            //System.out.println("http://" + Class448.aClass450_5420.host + ":" + port + "/news.ws?game=" + client.CURRENT_GAME.id);
            BufferedReader bufferedreader_2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + ConnectionInfo.JS5_CONNECTION_INFO.host + ":" + port + "/news.ws?game=" + client.CURRENT_GAME.id)).openStream())));
            String string_3 = bufferedreader_2.readLine();
            ArrayList<String> arraylist_4;
            for (arraylist_4 = new ArrayList<>(); string_3 != null; string_3 = bufferedreader_2.readLine()) {
                arraylist_4.add(string_3);
            }
            String[] arr_5 = new String[arraylist_4.size()];
            arraylist_4.toArray(arr_5);
            if (arr_5.length % 3 != 0) {
                return;
            }
            newsItems = new NewsItem[arr_5.length / 3];
            for (int i_6 = 0; i_6 < arr_5.length; i_6 += 3) {
                newsItems[i_6 / 3] = new NewsItem(arr_5[i_6], arr_5[i_6 + 1], arr_5[i_6 + 2]);
            }
        } catch (IOException ignored) {
        }
        fetched = true;
    }
}
