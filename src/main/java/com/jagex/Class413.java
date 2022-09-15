package com.jagex;

public enum Class413 implements Identifiable {

	aClass413_4971(1, 0, ""),
	aClass413_4965(6, 1, ""),
	aClass413_4968(7, 2, ""),
	aClass413_4967(3, 3, ""),
	aClass413_4970(4, 4, ""),
	aClass413_4969(5, 5, ""),
	aClass413_4964(0, 6, ""),
	aClass413_4966("");

	static void method6939() {
		ItemContainer.aClass229_7712.method3859();
	}
	final int anInt4972;
	final int anInt4973;

	final String aString4974;

	Class413(int i_1, int i_2, String string_4) {
		anInt4972 = i_1;
		anInt4973 = i_2;
		aString4974 = string_4;
	}

	Class413(String string_4) {
		anInt4972 = 2;
		anInt4973 = -1;
		aString4974 = string_4;
	}

	@Override
	public int getValue() {
		return anInt4973;
	}

	@Override
	public String toString() {
		return aString4974;
	}
}
