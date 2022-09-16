package com.jagex;

public class HintArrow {

	static int anInt2246;
	static LRUCache aClass229_2245 = new LRUCache(4);
	public int y;
	public int targetType;
	public int distance;
	public int targetIndex;
	public int x;
	public int modelId = -1;
	int plane;
	int arrowSprite;
	int height;
	int idk;

	@Override
	public String toString() {
		return "HINT_ARROW[ type: " + targetType + " targetIndex: " + targetIndex + " arrowSprite: " + arrowSprite + "(" + x + ", " + y + ", " + plane + ")";
	}
}
