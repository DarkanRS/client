public class Class282_Sub28 extends Node {

	int anInt7697;
	int anInt7698;
	int anInt7699;
	int anInt7700;
	int anInt7702;
	int anInt7701;
	int anInt7703;
	int anInt7704;
	int anInt7705;

	Class282_Sub28(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
		this.anInt7697 = i_1;
		this.anInt7698 = i_2;
		this.anInt7699 = i_3;
		this.anInt7700 = i_4;
		this.anInt7702 = i_5;
		this.anInt7701 = i_6;
		this.anInt7703 = i_7;
		this.anInt7704 = i_8;
		this.anInt7705 = i_9;
	}

	boolean method12408(int i_1, int i_2, int i_3) {
		return this.anInt7697 == i_1 && i_2 >= this.anInt7698 && i_2 <= this.anInt7700 && i_3 >= this.anInt7699 && i_3 <= this.anInt7702;
	}

	boolean method12409(int i_1, int i_2) {
		return i_1 >= this.anInt7701 && i_1 <= this.anInt7704 && i_2 >= this.anInt7703 && i_2 <= this.anInt7705;
	}

	void method12410(int i_1, int i_2, int[] ints_3) {
		ints_3[0] = this.anInt7697;
		ints_3[1] = this.anInt7698 - this.anInt7701 + i_1;
		ints_3[2] = this.anInt7699 - this.anInt7703 + i_2;
	}

	void method12414(int i_1, int i_2, int[] ints_3, int i_4) {
		ints_3[0] = 0;
		ints_3[1] = this.anInt7701 - this.anInt7698 + i_1;
		ints_3[2] = this.anInt7703 - this.anInt7699 + i_2;
	}

	boolean method12415(int i_1, int i_2, int i_3) {
		return i_1 >= this.anInt7698 && i_1 <= this.anInt7700 && i_2 >= this.anInt7699 && i_2 <= this.anInt7702;
	}

}
