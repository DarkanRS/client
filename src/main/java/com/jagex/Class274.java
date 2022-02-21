package com.jagex;

import com.Loader;

public class Class274 {

    protected static Class470 aClass470_3336;

    int width;
    int height;
    int anInt3333;
    int anInt3335;
    String name;

    public Class274(int width, int height, int i_3, int i_4, String name) {
        this.width = width;
        this.height = height;
        anInt3333 = i_3;
        anInt3335 = i_4;
        this.name = name;
    }

    public static void method4884() {
        if (ConnectionInfo.NEWS_CONNECTION_INFO.worldId != -1) {
			Class62.setGameHost(Loader.DEFAULT_WORLD, Loader.DEFAULT_WORLD_HOST);
            //Class62.setGameHost(ConnectionInfo.NEWS_CONNECTION_INFO.worldId, ConnectionInfo.NEWS_CONNECTION_INFO.host);
        }
    }

    int method4868() {
        return anInt3333;
    }

    String getName() {
        return name;
    }

    int getWidth() {
        return width;
    }

    int method4872() {
        return anInt3335;
    }

    int getHeight() {
        return height;
    }
}
