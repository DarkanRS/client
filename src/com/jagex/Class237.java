package com.jagex;

import java.util.Queue;

class Class237 implements Interface45 {

    static Class494 aClass494_2916;

    static boolean isNPCClickType(int i_0) {
        return i_0 == 9 || i_0 == 10 || i_0 == 11 || i_0 == 12 || i_0 == 13 || i_0 == 1003 || i_0 == 8;
    }

    public static void method3990() {
        Class236.aClass534_Sub2_2911.method11409();
        Class236.aClass534_Sub1_2913.method11409();
        Class236.aLong2910 = -1L;
        Class236.aBool2909 = true;
    }

    @Override
    public void method248() {
    }

    @Override
    public void method251(int i_1, int i_2, int i_3) {
        int i_4 = i_1 >> 16;
        int i_5 = i_1 & 0xffff;
        Queue<MouseRecord_Sub1> queue_6 = Class236.aQueue2914;
        synchronized (Class236.aQueue2914) {
            Class236.aQueue2914.add(Class217.method3694(i_4, i_5, i_2, i_3));
        }
    }

    @Override
    public void method245(int i_1, int i_2, int i_3) {
        int i_5 = i_1 >> 16;
        int i_6 = i_1 & 0xffff;
        Queue<MouseRecord_Sub1> queue_7 = Class236.aQueue2914;
        synchronized (Class236.aQueue2914) {
            Class236.aQueue2914.add(Class217.method3694(i_5, i_6, i_2, i_3));
        }
    }

    @Override
    public void method246(int i_1, int i_2, int i_3) {
        int i_4 = i_1 >> 16;
        int i_5 = i_1 & 0xffff;
        Queue<MouseRecord_Sub1> queue_6 = Class236.aQueue2914;
        synchronized (Class236.aQueue2914) {
            Class236.aQueue2914.add(Class217.method3694(i_4, i_5, i_2, i_3));
        }
    }

    @Override
    public void method247(int i_1, int i_2, int i_3) {
        int i_4 = i_1 >> 16;
        int i_5 = i_1 & 0xffff;
        Queue<MouseRecord_Sub1> queue_6 = Class236.aQueue2914;
        synchronized (Class236.aQueue2914) {
            Class236.aQueue2914.add(Class217.method3694(i_4, i_5, i_2, i_3));
        }
    }

    @Override
    public void method244(int i_1, int i_2, int i_3) {
        int i_4 = i_1 >> 16;
        int i_5 = i_1 & 0xffff;
        Queue<MouseRecord_Sub1> queue_6 = Class236.aQueue2914;
        synchronized (Class236.aQueue2914) {
            Class236.aQueue2914.add(Class217.method3694(i_4, i_5, i_2, i_3));
        }
    }

    @Override
    public void method250() {
    }

    @Override
    public void method249() {
    }
}
