public class Node_Sub24 extends Node {

	public Vector3 aClass385_7687 = new Vector3();
	int anInt7684;
	int anInt7685;
	float aFloat7686;

	public final int method12368(byte b_1) {
		return (int) this.aClass385_7687.x;
	}

	public final int method12369() {
		return (int) this.aClass385_7687.y;
	}

	Node_Sub24(int i_1, int i_2, int i_3, int i_4, int i_5) {
		this.aClass385_7687.set((float) i_1, (float) i_2, (float) i_3);
		this.anInt7684 = i_4;
		this.anInt7685 = i_5;
		this.aFloat7686 = (float) 1.0;
	}

	public final int method12370() {
		return this.anInt7684;
	}

	public final int method12371(int i_1) {
		return this.anInt7685;
	}

	public void method12373(float f_1) {
		this.aFloat7686 = f_1;
	}

	public void method12374(int i_1, int i_2, int i_3, int i_4) {
		this.aClass385_7687.set((float) i_1, (float) i_2, (float) i_3);
	}

	public final int method12394(int i_1) {
		return (int) this.aClass385_7687.z;
	}

	public final float method12395(int i_1) {
		return this.aFloat7686;
	}

	public static void method12399(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		if (i_0 >= Class532_Sub2_Sub1.anInt7071 && i_0 <= Class532_Sub2_Sub1.anInt7069 && i_2 >= Class532_Sub2_Sub1.anInt7071 && i_2 <= Class532_Sub2_Sub1.anInt7069 && i_4 >= Class532_Sub2_Sub1.anInt7071 && i_4 <= Class532_Sub2_Sub1.anInt7069 && i_6 >= Class532_Sub2_Sub1.anInt7071 && i_6 <= Class532_Sub2_Sub1.anInt7069 && i_1 >= Class532_Sub2_Sub1.anInt7070 && i_1 <= Class532_Sub2_Sub1.anInt7068 && i_3 >= Class532_Sub2_Sub1.anInt7070 && i_3 <= Class532_Sub2_Sub1.anInt7068 && i_5 >= Class532_Sub2_Sub1.anInt7070 && i_5 <= Class532_Sub2_Sub1.anInt7068 && i_7 >= Class532_Sub2_Sub1.anInt7070 && i_7 <= Class532_Sub2_Sub1.anInt7068) {
			ClanChannel.method12117(i_0, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
		} else {
			Engine.method4779(i_0, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8);
		}

	}

}
