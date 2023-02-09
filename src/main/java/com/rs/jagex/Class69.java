package com.rs.jagex;

public class Class69 {

	public static Class69 aClass69_695;
	public static Class69 aClass69_689;
	public static Class69 aClass69_690;
	public static Class69 aClass69_691;
	public static Class69 aClass69_692;
	public static Class69 aClass69_693;
	public static Class69 aClass69_694;
	static Class69 aClass69_696;
	static Class69 aClass69_700;
	static Class69 aClass69_699;
	static Class69 aClass69_688;
	static Class69 aClass69_697;
	static int anInt702;

	static {
		aClass69_695 = new Class69(7, 0, 3, Class76.aClass76_758);
		aClass69_689 = new Class69(0, 1, 3, Class76.aClass76_758);
		aClass69_690 = new Class69(10, 2, 4, Class76.aClass76_751);
		aClass69_691 = new Class69(8, 3, 1, Class76.aClass76_758);
		aClass69_692 = new Class69(4, 4, 2, Class76.aClass76_758);
		aClass69_693 = new Class69(9, 5, 3, Class76.aClass76_758);
		aClass69_694 = new Class69(2, 6, 4, Class76.aClass76_758);
		aClass69_696 = new Class69(1, 7, 4, Class76.aClass76_758);
		aClass69_700 = new Class69(11, 8, 4, Class76.aClass76_758);
		aClass69_699 = new Class69(3, 9, 4, Class76.aClass76_758);
		aClass69_688 = new Class69(5, 10, 3, Class76.aClass76_758);
		aClass69_697 = new Class69(6, 11, 3, Class76.aClass76_758);
		anInt702 = Class159.method2739(16);
	}

	static Class69 method1285(int i_0) {
		return switch (i_0) {
		case 0 -> aClass69_695;
		case 1 -> aClass69_689;
		case 2 -> aClass69_690;
		case 3 -> aClass69_691;
		case 4 -> aClass69_692;
		case 5 -> aClass69_693;
		case 6 -> aClass69_694;
		default -> null;
		};
	}
	public int anInt698;
	public int anInt704;
	int anInt703;
	int anInt705;

	Class76 aClass76_706;

	Class69(int i_1, int i_2, int i_3, Class76 class76_4) {
		anInt698 = i_1;
		anInt703 = i_2;
		anInt705 = i_3;
		aClass76_706 = class76_4;
		anInt704 = aClass76_706.anInt748 * anInt705;
		if (anInt703 >= 16)
			throw new RuntimeException();
	}

}
