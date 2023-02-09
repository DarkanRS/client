package com.rs.jagex;

import java.util.LinkedList;
import java.util.Queue;

public class Class236 {

	static long aLong2910 = -1L;

	static int anInt2912;

	static boolean aBool2909 = true;

	static MouseMovementICMP MOUSE_MOVEMENT_CANVAS = new MouseMovementICMP();
	static MouseMovementJav MOUSE_MOVEMENT_WINDOW = new MouseMovementJav();
	static Queue<MouseRecord_Sub1> aQueue2914 = new LinkedList<>();

	static void method3985(PathingEntity animable_0, int i_1) {
		if (animable_0.currentAnimations != null) {
			MoveSpeed class249_3 = (MoveSpeed) Class386.identify(MoveSpeed.values(), i_1);
			int i_4 = animable_0.currentAnimations[class249_3.getValueIncr()];
			if (i_4 != animable_0.currentAnimation.method7597()) {
				animable_0.currentAnimation.method7615(i_4, animable_0.currentAnimation.getSpeed());
				animable_0.anInt10367 = animable_0.anInt10355;
			}
		}
	}

	Class236() throws Throwable {
		throw new Error();
	}
}
