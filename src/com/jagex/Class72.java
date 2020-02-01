package com.jagex;
public class Class72 {

	long aLong724;
	int anInt723;

	Class72(Class69[] arr_1) {
		for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
			this.method1303(arr_1[i_2]);
		}

	}

	public final int method1296() {
		return this.anInt723;
	}

	public final Class69 method1297(int i_1) {
		return Class69.method1285(this.method1299(i_1));
	}

	Class72(Class69 class69_1) {
		this.aLong724 = (long) class69_1.anInt703;
		this.anInt723 = 1;
	}

	final int method1299(int i_1) {
		return (int) (this.aLong724 >> Class69.anInt702 * i_1) & 0xf;
	}

	final void method1303(Class69 class69_1) {
		this.aLong724 |= (long) (class69_1.anInt703 << Class69.anInt702 * this.anInt723++);
	}

}
