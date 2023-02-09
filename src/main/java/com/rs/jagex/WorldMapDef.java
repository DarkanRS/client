package com.rs.jagex;

public class WorldMapDef extends CacheableNode {

	public static void method14788(String string_0, boolean bool_1, boolean bool_3) {
		PingRequester.method8736(string_0, bool_1, "openjs", bool_3);
	}
	public int anInt9542 = -1;
	public int anInt9539 = 12800;
	public int anInt9540;
	public int anInt9541 = 12800;
	public int anInt9535;
	public int id;
	public String staticElementsName;
	public String areaName;
	public int regionHash;
	int anInt9538 = -1;
	boolean aBool9543 = true;

	NodeCollection areaRects;

	WorldMapDef(int fileId, String staticElementsName, String areaName, int regionHash, int i_5, boolean bool_6, int i_7, int mapSizeIndex) {
		id = fileId;
		this.staticElementsName = staticElementsName;
		this.areaName = areaName;
		this.regionHash = regionHash;
		anInt9538 = i_5;
		aBool9543 = bool_6;
		anInt9542 = i_7;
		if (anInt9542 == 255)
			anInt9542 = 0;

		Class480.getMapSize(mapSizeIndex);
		areaRects = new NodeCollection();
	}

	void init() {
		anInt9539 = 12800;
		anInt9540 = 0;
		anInt9541 = 12800;
		anInt9535 = 0;

		for (WorldMapRect rect = (WorldMapRect) areaRects.head(); rect != null; rect = (WorldMapRect) areaRects.next()) {
			if (rect.bestBottomLeftX < anInt9539)
				anInt9539 = rect.bestBottomLeftX;
			if (rect.bestTopRightX > anInt9540)
				anInt9540 = rect.bestTopRightX;
			if (rect.bestBottomLeftY < anInt9541)
				anInt9541 = rect.bestBottomLeftY;
			if (rect.bestTopRightY > anInt9535)
				anInt9535 = rect.bestTopRightY;
		}

	}

	public boolean method14775(int i_1, int i_2, int[] ints_3) {
		for (WorldMapRect class282_sub28_5 = (WorldMapRect) areaRects.head(); class282_sub28_5 != null; class282_sub28_5 = (WorldMapRect) areaRects.next())
			if (class282_sub28_5.method12409(i_1, i_2)) {
				class282_sub28_5.method12410(i_1, i_2, ints_3);
				return true;
			}

		return false;
	}

	public boolean method14777(int i_1, int i_2, int[] ints_3) {
		for (WorldMapRect class282_sub28_5 = (WorldMapRect) areaRects.head(); class282_sub28_5 != null; class282_sub28_5 = (WorldMapRect) areaRects.next())
			if (class282_sub28_5.method12415(i_1, i_2)) {
				class282_sub28_5.method12414(i_1, i_2, ints_3);
				return true;
			}

		return false;
	}

	public boolean method14778(int i_1, int i_2, int i_3, int[] ints_4) {
		for (WorldMapRect class282_sub28_6 = (WorldMapRect) areaRects.head(); class282_sub28_6 != null; class282_sub28_6 = (WorldMapRect) areaRects.next())
			if (class282_sub28_6.method12408(i_1, i_2, i_3)) {
				class282_sub28_6.method12414(i_2, i_3, ints_4);
				return true;
			}

		return false;
	}

	boolean method14784(int i_1, int i_2) {
		for (WorldMapRect class282_sub28_4 = (WorldMapRect) areaRects.head(); class282_sub28_4 != null; class282_sub28_4 = (WorldMapRect) areaRects.next())
			if (class282_sub28_4.method12415(i_1, i_2))
				return true;

		return false;
	}

}
