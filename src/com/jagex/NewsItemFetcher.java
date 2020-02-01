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

    NewsItem get(int id) {
        return this.newsItems != null && id >= 0 && id < this.newsItems.length ? this.newsItems[id] : null;
    }

    boolean fetch() {
        if (this.fetched) {
            return true;
        } else {
            if (this.aThread355 == null) {
                this.aThread355 = new Thread(this);
                this.aThread355.start();
            }
            return this.fetched;
        }
    }

    public void run() {
        try {
            int port = HDWaterTile.SERVER_ENVIRONMENT == ServerEnvironment.LIVE ? 80 : Class448.aClass450_5420.worldId + 7000;
            //System.out.println("http://" + Class448.aClass450_5420.host + ":" + port + "/news.ws?game=" + client.CURRENT_GAME.id);
            BufferedReader bufferedreader_2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class448.aClass450_5420.host + ":" + port + "/news.ws?game=" + client.CURRENT_GAME.id)).openStream())));
            String string_3 = bufferedreader_2.readLine();
            ArrayList arraylist_4;
            for (arraylist_4 = new ArrayList(); string_3 != null; string_3 = bufferedreader_2.readLine()) {
                arraylist_4.add(string_3);
            }
            String[] arr_5 = new String[arraylist_4.size()];
            arraylist_4.toArray(arr_5);
            if (arr_5.length % 3 != 0) {
                return;
            }
            this.newsItems = new NewsItem[arr_5.length / 3];
            for (int i_6 = 0; i_6 < arr_5.length; i_6 += 3) {
                this.newsItems[i_6 / 3] = new NewsItem(arr_5[i_6], arr_5[i_6 + 1], arr_5[i_6 + 2]);
            }
        } catch (IOException ioexception_8) {
            ;
        }
        this.fetched = true;
    }

    public static void method795() {
        Class235.aClass465_2904 = new IterableNodeMap(8);
        Class235.anInt2898 = 0;
        Iterator iterator_1 = Class235.aList2896.iterator();
        while (iterator_1.hasNext()) {
            ParticleSystem class539_2 = (ParticleSystem) iterator_1.next();
            class539_2.method11506();
        }
    }

    public static void method796(int[] ints_0, Object[] arr_1) {
        Class51.method1074(ints_0, arr_1, 0, ints_0.length - 1, -990491051);
    }
}
