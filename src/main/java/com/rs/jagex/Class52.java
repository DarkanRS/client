package com.rs.jagex;

public abstract class Class52 implements Interface2 {

	static void method1086(int i_0, int i_1, int i_2, boolean bool_3, int i_4, boolean bool_5) {
		if (i_0 < i_1) {
			int i_7 = (i_0 + i_1) / 2;
			int i_8 = i_0;
			WorldDescriptor class217_sub1_9 = ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_7];
			ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_7] = ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_1];
			ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_1] = class217_sub1_9;
			for (int i_10 = i_0; i_10 < i_1; i_10++)
				if (NPCDirection.method4325(ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_10], class217_sub1_9, i_2, bool_3, i_4, bool_5) <= 0) {
					WorldDescriptor class217_sub1_11 = ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_10];
					ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_10] = ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_8];
					ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_8++] = class217_sub1_11;
				}
			ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_1] = ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_8];
			ConnectionInfo.WORLD_DESCRIPTORS_BYID[i_8] = class217_sub1_9;
			method1086(i_0, i_8 - 1, i_2, bool_3, i_4, bool_5);
			method1086(i_8 + 1, i_1, i_2, bool_3, i_4, bool_5);
		}
	}

	static WorldMapDef method1087(Index mapAreas, int archiveId, int fileId) {
		ByteBuf buffer = new ByteBuf(mapAreas.getFile(archiveId, fileId));
		WorldMapDef def = new WorldMapDef(fileId, buffer.readString(), buffer.readString(), buffer.readInt(), buffer.readInt(), buffer.readUnsignedByte() == 1, buffer.readUnsignedByte(), buffer.readUnsignedByte());
		int size = buffer.readUnsignedByte();
		for (int i = 0; i < size; i++)
			def.areaRects.append(new WorldMapRect(buffer.readUnsignedByte(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort(), buffer.readUnsignedShort()));
		def.init();
		return def;
	}

	FontRenderer aFontRenderer_492;

	int anInt494;

	long aLong491;

	Index aClass317_493;

	Index aClass317_490;

	Class350 aClass350_489;

	Class52(Index index_1, Index index_2, Class350 class350_3) {
		aClass317_493 = index_1;
		aClass317_490 = index_2;
		aClass350_489 = class350_3;
	}

	@Override
	public boolean method10() {
		boolean bool_2 = true;
		if (!aClass317_493.loadFile(aClass350_489.anInt4086))
			bool_2 = false;
		if (!aClass317_490.loadFile(aClass350_489.anInt4086))
			bool_2 = false;
		return bool_2;
	}

	abstract void method1075(int var2, int var3);

	abstract void method1076(boolean var1, int var2, int var3);

	abstract void method1077(int var2, int var3);

	int method1078() {
		int i_2 = Comparable_Sub1.aClass306_3771.method5424();
		int i_3 = i_2 * 100;
		if (i_2 == anInt494 && i_2 != 0) {
			int i_4 = Comparable_Sub1.aClass306_3771.method5423();
			if (i_4 > i_2) {
				long long_5 = aLong491 - Comparable_Sub1.aClass306_3771.method5439();
				if (long_5 > 0L) {
					long long_7 = 10000L * long_5 / i_2 * (i_4 - i_2);
					long long_9 = (Utils.time() - aLong491) * 10000L;
					if (long_9 < long_7)
						i_3 = (int) (100L * long_9 * (i_4 - i_2) / long_7 + (i_2 * 100));
					else
						i_3 = i_4 * 100;
				}
			}
		} else {
			anInt494 = i_2;
			aLong491 = Utils.time();
		}
		return i_3;
	}

	abstract void method1079(int var2, int var3);

	abstract void method1080(int var2, int var3);

	abstract void method1081(boolean var1, int var2, int var3);

	@Override
	public void method11(boolean bool_1) {
		int i_2 = aClass350_489.aClass356_4094.method6221(329542577 * aClass350_489.anInt4093 * -229835439, client.GAME_WIDTH * 1426041429 * 765 * -1115795005 * 150480619) + -1967081549 * aClass350_489.anInt4090 * 1823133563;
		int i_3 = aClass350_489.aClass353_4087.method6198(323608093 * aClass350_489.anInt4088 * 1707725877, 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass350_489.anInt4089 * 2015431945 * -1196256967;
		method1081(bool_1, i_2, i_3);
		method1077(i_2, i_3);
		String string_4 = Comparable_Sub1.aClass306_3771.method5425();
		if (Utils.time() - 1058145188107000551L * aLong491 * 5361705510848321751L > 10000L)
			string_4 = string_4 + " (" + Comparable_Sub1.aClass306_3771.method5427().anInt4712 * 2061403819 * -1763884029 + ")";
		aFontRenderer_492.method360(string_4, aClass350_489.anInt4093 * -229835439 * 329542577 / 2 + i_2, 4 + 323608093 * aClass350_489.anInt4088 * 1707725877 / 2 + i_3 + aClass350_489.anInt4092 * -1053358863 * -1921815535, -771513131 * aClass350_489.anInt4091 * -77040515, -1);
	}

	@Override
	public void method12(boolean bool_1) {
		int i_2 = aClass350_489.aClass356_4094.method6221(329542577 * aClass350_489.anInt4093 * -229835439, client.GAME_WIDTH * 1426041429 * 765 * -1115795005 * 150480619) + -1967081549 * aClass350_489.anInt4090 * 1823133563;
		int i_3 = aClass350_489.aClass353_4087.method6198(323608093 * aClass350_489.anInt4088 * 1707725877, 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass350_489.anInt4089 * 2015431945 * -1196256967;
		method1081(bool_1, i_2, i_3);
		method1077(i_2, i_3);
		String string_4 = Comparable_Sub1.aClass306_3771.method5425();
		if (Utils.time() - 1058145188107000551L * aLong491 * 5361705510848321751L > 10000L)
			string_4 = string_4 + " (" + Comparable_Sub1.aClass306_3771.method5427().anInt4712 * 2061403819 * -1763884029 + ")";
		aFontRenderer_492.method360(string_4, aClass350_489.anInt4093 * -229835439 * 329542577 / 2 + i_2, 4 + 323608093 * aClass350_489.anInt4088 * 1707725877 / 2 + i_3 + aClass350_489.anInt4092 * -1053358863 * -1921815535, -771513131 * aClass350_489.anInt4091 * -77040515, -1);
	}

	@Override
	public boolean method13() {
		boolean bool_1 = true;
		if (!aClass317_493.loadFile(985690519 * aClass350_489.anInt4086 * -1988551129))
			bool_1 = false;
		if (!aClass317_490.loadFile(985690519 * aClass350_489.anInt4086 * -1988551129))
			bool_1 = false;
		return bool_1;
	}

	@Override
	public void method14(boolean bool_1) {
		int i_2 = aClass350_489.aClass356_4094.method6221(329542577 * aClass350_489.anInt4093 * -229835439, client.GAME_WIDTH * 1426041429 * 765 * -1115795005 * 150480619) + -1967081549 * aClass350_489.anInt4090 * 1823133563;
		int i_3 = aClass350_489.aClass353_4087.method6198(323608093 * aClass350_489.anInt4088 * 1707725877, 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass350_489.anInt4089 * 2015431945 * -1196256967;
		method1081(bool_1, i_2, i_3);
		method1077(i_2, i_3);
		String string_4 = Comparable_Sub1.aClass306_3771.method5425();
		if (Utils.time() - 1058145188107000551L * aLong491 * 5361705510848321751L > 10000L)
			string_4 = string_4 + " (" + Comparable_Sub1.aClass306_3771.method5427().anInt4712 * 2061403819 * -1763884029 + ")";
		aFontRenderer_492.method360(string_4, aClass350_489.anInt4093 * -229835439 * 329542577 / 2 + i_2, 4 + 323608093 * aClass350_489.anInt4088 * 1707725877 / 2 + i_3 + aClass350_489.anInt4092 * -1053358863 * -1921815535, -771513131 * aClass350_489.anInt4091 * -77040515, -1);
	}

	@Override
	public void method15() {
		FontMetrics fontmetrics_1 = Class163.method2845(aClass317_490, 985690519 * aClass350_489.anInt4086 * -1988551129);
		aFontRenderer_492 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_1, SpriteDefinitions.method1534(aClass317_493, aClass350_489.anInt4086 * -1988551129 * 985690519), true);
	}

	@Override
	public void method16() {
		FontMetrics fontmetrics_1 = Class163.method2845(aClass317_490, 985690519 * aClass350_489.anInt4086 * -1988551129);
		aFontRenderer_492 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_1, SpriteDefinitions.method1534(aClass317_493, aClass350_489.anInt4086 * -1988551129 * 985690519), true);
	}

	@Override
	public boolean method17() {
		boolean bool_1 = true;
		if (!aClass317_493.loadFile(985690519 * aClass350_489.anInt4086 * -1988551129))
			bool_1 = false;
		if (!aClass317_490.loadFile(985690519 * aClass350_489.anInt4086 * -1988551129))
			bool_1 = false;
		return bool_1;
	}

	@Override
	public void method18() {
		FontMetrics fontmetrics_1 = Class163.method2845(aClass317_490, 985690519 * aClass350_489.anInt4086 * -1988551129);
		aFontRenderer_492 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_1, SpriteDefinitions.method1534(aClass317_493, aClass350_489.anInt4086 * -1988551129 * 985690519), true);
	}

	@Override
	public void method19() {
		FontMetrics fontmetrics_1 = Class163.method2845(aClass317_490, 985690519 * aClass350_489.anInt4086 * -1988551129);
		aFontRenderer_492 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_1, SpriteDefinitions.method1534(aClass317_493, aClass350_489.anInt4086 * -1988551129 * 985690519), true);
	}

	@Override
	public void method20(boolean bool_1) {
		int i_3 = aClass350_489.aClass356_4094.method6221(aClass350_489.anInt4093, client.GAME_WIDTH) + aClass350_489.anInt4090;
		int i_4 = aClass350_489.aClass353_4087.method6198(aClass350_489.anInt4088, client.GAME_HEIGHT) + aClass350_489.anInt4089;
		method1081(bool_1, i_3, i_4);
		method1077(i_3, i_4);
		String string_5 = Comparable_Sub1.aClass306_3771.method5425();
		if (Utils.time() - aLong491 > 10000L)
			string_5 = string_5 + " (" + Comparable_Sub1.aClass306_3771.method5427().anInt4712 + ")";
		aFontRenderer_492.method360(string_5, aClass350_489.anInt4093 / 2 + i_3, aClass350_489.anInt4088 / 2 + aClass350_489.anInt4092 + i_4 + 4, aClass350_489.anInt4091, -1);
	}

	@Override
	public boolean method21() {
		boolean bool_1 = true;
		if (!aClass317_493.loadFile(985690519 * aClass350_489.anInt4086 * -1988551129))
			bool_1 = false;
		if (!aClass317_490.loadFile(985690519 * aClass350_489.anInt4086 * -1988551129))
			bool_1 = false;
		return bool_1;
	}

	@Override
	public void method22() {
		FontMetrics fontmetrics_2 = Class163.method2845(aClass317_490, aClass350_489.anInt4086);
		aFontRenderer_492 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_2, SpriteDefinitions.method1534(aClass317_493, aClass350_489.anInt4086), true);
	}

	@Override
	public void method23() {
		FontMetrics fontmetrics_1 = Class163.method2845(aClass317_490, 985690519 * aClass350_489.anInt4086 * -1988551129);
		aFontRenderer_492 = Renderers.CURRENT_RENDERER.createFont(fontmetrics_1, SpriteDefinitions.method1534(aClass317_493, aClass350_489.anInt4086 * -1988551129 * 985690519), true);
	}

	@Override
	public boolean method9() {
		boolean bool_1 = true;
		if (!aClass317_493.loadFile(985690519 * aClass350_489.anInt4086 * -1988551129))
			bool_1 = false;
		if (!aClass317_490.loadFile(985690519 * aClass350_489.anInt4086 * -1988551129))
			bool_1 = false;
		return bool_1;
	}
}
