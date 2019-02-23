import java.awt.Canvas;
import java.awt.Dimension;

public class Class320 {

	public static Class253 aClass253_3723;
	public static int[] anIntArray3724;
	static Class282_Sub25 aClass282_Sub25_3719 = new Class282_Sub25(0, 0);
	Class282_Sub25[] aClass282_Sub25Array3720;
	int[][] anIntArrayArray3717;
	LinkedNodeList aClass473_3721 = new LinkedNodeList();
	public boolean aBool3722 = false;
	int anInt3714 = 0;
	int anInt3718 = -1;
	int anInt3715;
	int anInt3716;

	final void method5720(byte b_1) {
		for (int i_2 = 0; i_2 < this.anInt3716; i_2++) {
			this.anIntArrayArray3717[i_2] = null;
		}

		this.aClass282_Sub25Array3720 = null;
		this.anIntArrayArray3717 = null;
		this.aClass473_3721.clear();
		this.aClass473_3721 = null;
	}

	public final int[] method5721(int i_1, int i_2) {
		if (this.anInt3715 != this.anInt3716) {
			if (this.anInt3716 != 1) {
				Class282_Sub25 class282_sub25_3 = this.aClass282_Sub25Array3720[i_1];
				if (class282_sub25_3 == null) {
					this.aBool3722 = true;
					if (this.anInt3714 >= this.anInt3716) {
						Class282_Sub25 class282_sub25_4 = (Class282_Sub25) this.aClass473_3721.getNext();
						class282_sub25_3 = new Class282_Sub25(i_1, class282_sub25_4.anInt7689);
						this.aClass282_Sub25Array3720[class282_sub25_4.anInt7688] = null;
						class282_sub25_4.remove();
					} else {
						class282_sub25_3 = new Class282_Sub25(i_1, this.anInt3714);
						++this.anInt3714;
					}

					this.aClass282_Sub25Array3720[i_1] = class282_sub25_3;
				} else {
					this.aBool3722 = false;
				}

				this.aClass473_3721.insertFront(class282_sub25_3);
				return this.anIntArrayArray3717[class282_sub25_3.anInt7689];
			} else {
				this.aBool3722 = this.anInt3718 != i_1;
				this.anInt3718 = i_1;
				return this.anIntArrayArray3717[0];
			}
		} else {
			this.aBool3722 = this.aClass282_Sub25Array3720[i_1] == null;
			this.aClass282_Sub25Array3720[i_1] = aClass282_Sub25_3719;
			return this.anIntArrayArray3717[i_1];
		}
	}

	public final int[][] method5722(byte b_1) {
		if (this.anInt3716 != this.anInt3715) {
			throw new RuntimeException();
		} else {
			for (int i_2 = 0; i_2 < this.anInt3716; i_2++) {
				this.aClass282_Sub25Array3720[i_2] = aClass282_Sub25_3719;
			}

			return this.anIntArrayArray3717;
		}
	}

	Class320(int i_1, int i_2, int i_3) {
		this.anInt3715 = i_2;
		this.anInt3716 = i_1;
		this.anIntArrayArray3717 = new int[this.anInt3716][i_3];
		this.aClass282_Sub25Array3720 = new Class282_Sub25[this.anInt3715];
	}

	public static void method5731(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		Class42.method890(i_5, i_6, 100, (byte) -118);
		Class260.aClass277_3234 = new Class277(i_0, i_1 << 9, i_2 << 9, i_3 << 8, i_4 * 8);
	}

	public static GraphicalRenderer method5732(int i_0, Canvas canvas_1, Interface22 interface22_2, Index index_3, int i_4, int i_5) {
		int i_6 = 0;
		int i_7 = 0;
		if (canvas_1 != null) {
			Dimension dimension_8 = canvas_1.getSize();
			i_6 = dimension_8.width;
			i_7 = dimension_8.height;
		}

		return Class88.method1493(i_0, canvas_1, interface22_2, index_3, i_4, i_6, i_7, (byte) 73);
	}

	static final void method5733(CS2Executor cs2executor_0, short s_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.membersWorld ? 1 : 0;
	}

	static final void method5734(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8227.method12714(1068541972);
	}

	static final void method5735(CS2Executor cs2executor_0, byte b_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		cs2executor_0.intStackPtr -= 2;
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		FontMetrics fontmetrics_5 = Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, i_4, 0, 1444002710);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = fontmetrics_5.method6951(string_2, i_3, Class182.aClass160Array2261, (byte) 76);
	}

	static void method5736(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = IndexLoaders.aClass242_4922.method4156(cs2executor_0.intStack[--cs2executor_0.intStackPtr], -1396181317).altName;
	}

}
