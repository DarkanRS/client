public class CoordGrid {

	static Index aClass317_2710;
	public int level;
	public int x;
	public int y;

	public String toString() {
		return this.level + "," + (this.x >> 6) + "," + (this.y >> 6) + "," + (this.x & 0x3f) + "," + (this.y & 0x3f);
	}

	public CoordGrid(int i_1) {
		if (i_1 == -1) {
			this.level = -1;
		} else {
			this.level = i_1 >> 28 & 0x3;
			this.x = i_1 >> 14 & 0x3fff;
			this.y = i_1 & 0x3fff;
		}

	}

	public CoordGrid() {
		this.level = -1;
	}

	public CoordGrid(int i_1, int i_2, int i_3) {
		this.level = i_1;
		this.x = i_2;
		this.y = i_3;
	}

	static final void method3713(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method7785(i_2, 618850580);
	}

	static final void method3714(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		Class96_Sub10.method14603(8, i_2 << 16 | i_3, i_4, "", (byte) 81);
	}

}
