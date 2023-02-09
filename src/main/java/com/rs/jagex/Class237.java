package com.rs.jagex;

import java.util.Queue;

class Class237 implements Interface45 {

	static Class494 aClass494_2916;

	public static void clearMouseMovementRecords() {
		Class236.MOUSE_MOVEMENT_WINDOW.clear();
		Class236.MOUSE_MOVEMENT_CANVAS.clear();
		Class236.aLong2910 = -1L;
		Class236.aBool2909 = true;
	}
	
	@Override
	public void addMouseRecord(int i_1, int i_2, int i_3) {
		int i_5 = i_1 >> 16;
		int i_6 = i_1 & 0xffff;
		Queue<MouseRecord_Sub1> queue_7 = Class236.aQueue2914;
		synchronized (Class236.aQueue2914) {
			Class236.aQueue2914.add(Class217.method3694(i_5, i_6, i_2, i_3));
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
	public void method248() {
	}

	@Override
	public void method249() {
	}

	@Override
	public void method250() {
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
}
