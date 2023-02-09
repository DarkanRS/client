package com.rs.jagex;

import java.awt.Point;

public class MouseRecord_Sub1 extends MouseRecord {

	static MouseRecord_Sub1[] aMouseRecord_Sub1Array9497 = new MouseRecord_Sub1[0];
	int anInt9513;
	int anInt9514;
	long time;
	int x;
	int y;

	@Override
	public void cache() {
		MouseRecord_Sub1[] arr_2 = aMouseRecord_Sub1Array9497;
		synchronized (aMouseRecord_Sub1Array9497) {
			if (Class81.anInt803 < AreadSound.anInt3307 - 1)
				aMouseRecord_Sub1Array9497[++Class81.anInt803 - 1] = this;
		}
	}

	@Override
	public int getClickType() {
		return switch (anInt9513) {
		case 160, 512 -> -1;
		case 161, 163, 513, 515 -> 0;
		case 162, 514 -> 3;
		case 164, 166, 516, 518 -> 2;
		case 165, 517 -> 5;
		case 167, 169, 519, 521 -> 1;
		case 168, 520 -> 4;
		case 170, 522 -> 6;
		default -> -2;
		};
	}

	@Override
	public int getMeta() {
		return switch (anInt9513) {
		case 160, 512 -> 0;
		case 163, 166, 169, 173, 515, 518, 521, 525 -> 2;
		default -> 1;
		};
	}

	@Override
	public long getTime() {
		return time;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	public int method14729() {
		return anInt9514;
	}

	public int method14730() {
		return anInt9513;
	}

	public boolean method14731() {
		return switch (anInt9513) {
		case 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 672, 674 -> true;
		default -> false;
		};
	}

	public void method14732(Point point_1) {
		x -= point_1.x;
		y -= point_1.y;
	}
}
