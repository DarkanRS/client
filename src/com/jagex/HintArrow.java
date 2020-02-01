package com.jagex;
public class HintArrow {

	public int y;
	public int targetType;
	public int distance;
	public int targetIndex;
	int plane;
	int arrowSprite;
	int height;
	public int x;
	int idk;
	static int anInt2246;
	static SoftCache aClass229_2245 = new SoftCache(4);
	public int modelId = -1;

	public static ChatLine method3032(int i_0) {
		return i_0 >= 0 && i_0 < 100 ? ChatLine.CHAT_LINES[i_0] : null;
	}
}
