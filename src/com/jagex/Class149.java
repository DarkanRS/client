package com.jagex;
public abstract class Class149 {

	static int anInt1744;

	int anInt1743;

	int anInt1741;

	int anInt1742;

	abstract void method2555(int var1, int var2);

	Class149(int i_1, int i_2, int i_3) {
		this.anInt1743 = i_1;
		this.anInt1741 = i_2;
		this.anInt1742 = i_3;
	}

	abstract void method2556(int var1, int var2);

	abstract void method2557(int var1, int var2);

	abstract void method2558(int var1, int var2);

	abstract void method2559(int var1, int var2);

	abstract void method2560(int var1, int var2);

	abstract void method2561(int var1, int var2);

	abstract void method2562(int var1, int var2);

	static int method2565(CharSequence charsequence_0, char var_1) {
		int i_3 = 0;
		int i_4 = charsequence_0.length();
		for (int i_5 = 0; i_5 < i_4; i_5++) {
			if (charsequence_0.charAt(i_5) == var_1) {
				++i_3;
			}
		}
		return i_3;
	}
}
