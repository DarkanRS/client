package com.jagex;

public class StaticElements {

	public static int CS2_QUERY_RESULT_IDX;

	public int size;

	public int[] regionHashes;

	public int[] areaIds;

	public StaticElements(int i_1) {
		size = i_1;
		regionHashes = new int[size];
		areaIds = new int[size];
	}
}
