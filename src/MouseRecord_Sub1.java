import java.awt.Point;

public class MouseRecord_Sub1 extends MouseRecord {

	int anInt9513;
	int anInt9514;
	long time;
	static MouseRecord_Sub1[] aMouseRecord_Sub1Array9497 = new MouseRecord_Sub1[0];
	int x;
	int y;

	public int method14729() {
		return this.anInt9514;
	}

	public void cache() {
		MouseRecord_Sub1[] arr_2 = aMouseRecord_Sub1Array9497;
		synchronized (aMouseRecord_Sub1Array9497) {
			if (Class81.anInt803 < AreadSound.anInt3307 - 1) {
				aMouseRecord_Sub1Array9497[++Class81.anInt803 - 1] = this;
			}
		}
	}

	public int getX() {
		return this.x;
	}

	public int method14730() {
		return this.anInt9513;
	}

	public boolean method14731() {
		switch (this.anInt9513) {
		case 160:
		case 161:
		case 162:
		case 163:
		case 164:
		case 165:
		case 166:
		case 167:
		case 168:
		case 169:
		case 170:
		case 171:
		case 172:
		case 173:
		case 174:
		case 672:
		case 674:
			return true;
		default:
			return false;
		}
	}

	public int getMeta() {
		switch (this.anInt9513) {
		case 160:
		case 512:
			return 0;
		case 163:
		case 166:
		case 169:
		case 173:
		case 515:
		case 518:
		case 521:
		case 525:
			return 2;
		default:
			return 1;
		}
	}

	public long method13471() {
		return this.time;
	}

	public void method14732(Point point_1) {
		this.x -= point_1.x;
		this.y -= point_1.y;
	}

	public int getClickType() {
		switch (this.anInt9513) {
		case 160:
		case 512:
			return -1;
		case 161:
		case 163:
		case 513:
		case 515:
			return 0;
		case 162:
		case 514:
			return 3;
		case 164:
		case 166:
		case 516:
		case 518:
			return 2;
		case 165:
		case 517:
			return 5;
		case 167:
		case 169:
		case 519:
		case 521:
			return 1;
		case 168:
		case 520:
			return 4;
		case 170:
		case 522:
			return 6;
		default:
			return -2;
		}
	}

	public int getY() {
		return this.y;
	}
}
