package com.jagex;

public class WorldMapRect extends Node {

    int plane;
    int bottomLeftX;
    int bottomLeftY;
    int topRightX;
    int topRightY;
    int bestBottomLeftX;
    int bestBottomLeftY;
    int bestTopRightX;
    int bestTopRightY;

    WorldMapRect(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        plane = i_1;
        bottomLeftX = i_2;
        bottomLeftY = i_3;
        topRightX = i_4;
        topRightY = i_5;
        bestBottomLeftX = i_6;
        bestBottomLeftY = i_7;
        bestTopRightX = i_8;
        bestTopRightY = i_9;
    }

    boolean method12408(int i_1, int i_2, int i_3) {
        return plane == i_1 && i_2 >= bottomLeftX && i_2 <= topRightX && i_3 >= bottomLeftY && i_3 <= topRightY;
    }

    boolean method12409(int i_1, int i_2) {
        return i_1 >= bestBottomLeftX && i_1 <= bestTopRightX && i_2 >= bestBottomLeftY && i_2 <= bestTopRightY;
    }

    void method12410(int i_1, int i_2, int[] ints_3) {
        ints_3[0] = plane;
        ints_3[1] = bottomLeftX - bestBottomLeftX + i_1;
        ints_3[2] = bottomLeftY - bestBottomLeftY + i_2;
    }

    void method12414(int i_1, int i_2, int[] ints_3) {
        ints_3[0] = 0;
        ints_3[1] = bestBottomLeftX - bottomLeftX + i_1;
        ints_3[2] = bestBottomLeftY - bottomLeftY + i_2;
    }

    boolean method12415(int i_1, int i_2) {
        return i_1 >= bottomLeftX && i_1 <= topRightX && i_2 >= bottomLeftY && i_2 <= topRightY;
    }

}
