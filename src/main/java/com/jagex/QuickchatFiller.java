package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public class QuickchatFiller implements Interface19 {

	public static EntityDefaults ENTITY_DEFAULTS;
	public static ClanSettings CLAN_SETTINGS;

	public static void method1139() {
		CursorDefintions.aNativeSprite_5004 = null;
		Class187.anInt2351 = -1;
	}

	static int method1141() {
		if (client.aClass118_7257 == null)
			if (!Class20.aBool161) {
				if (Class149_Sub2.DEFAULTS_LOADER_7.aBool5876) {
					if (Class20.aCacheableNode_Sub7_168 != null)
						return Class20.aCacheableNode_Sub7_168.anInt9578;
				} else if (CutsceneAction_Sub23.aCacheableNode_Sub7_9445 != null)
					return CutsceneAction_Sub23.aCacheableNode_Sub7_9445.anInt9578;
			} else {
				FontMetrics fontmetrics_1 = ShaderLoader.method1887();
				int i_2 = Class163.mouseRecorder.getMouseX();
				int i_3 = Class163.mouseRecorder.getMouseY();
				int i_4;
				int i_5;
				CacheableNode_Sub7 class282_sub50_sub7_7;
				int i_8;
				if (!Class20.aBool162) {
					if (i_2 > Class301.anInt3555 && i_2 < Class301.anInt3555 + Class158_Sub2.anInt8975) {
						i_4 = -1;
						for (i_5 = 0; i_5 < Class20.anInt169; i_5++) {
							if (Class20.aBool187)
								i_8 = (Class20.anInt169 - 1 - i_5) * Class20.anInt178 + fontmetrics_1.topPadding + BufferedConnectionContext.anInt2300 + 1 + 20;
							else
								i_8 = (Class20.anInt169 - 1 - i_5) * Class20.anInt178 + BufferedConnectionContext.anInt2300 + 31;
							if (i_3 > i_8 - fontmetrics_1.topPadding - 1 && i_3 < i_8 + fontmetrics_1.bottomPadding)
								i_4 = i_5;
						}
						if (i_4 != -1) {
							i_5 = 0;
							NodeIterator nodeiterator_6 = new NodeIterator(Class20.aClass482_171);
							for (class282_sub50_sub7_7 = (CacheableNode_Sub7) nodeiterator_6.method7683(); class282_sub50_sub7_7 != null; class282_sub50_sub7_7 = (CacheableNode_Sub7) nodeiterator_6.next())
								if (i_5++ == i_4)
									return class282_sub50_sub7_7.anInt9578;
						}
					}
				} else {
					Class469 class469_9;
					if (i_2 > Class301.anInt3555 && i_2 < Class301.anInt3555 + Class158_Sub2.anInt8975) {
						i_4 = -1;
						for (i_5 = 0; i_5 < Class20.anInt170; i_5++) {
							if (Class20.aBool187)
								i_8 = i_5 * Class20.anInt178 + fontmetrics_1.topPadding + BufferedConnectionContext.anInt2300 + 1 + 20;
							else
								i_8 = i_5 * Class20.anInt178 + BufferedConnectionContext.anInt2300 + 31;
							if (i_3 > i_8 - fontmetrics_1.topPadding - 1 && i_3 < i_8 + fontmetrics_1.bottomPadding)
								i_4 = i_5;
						}
						if (i_4 != -1) {
							i_5 = 0;
							class469_9 = new Class469(Class20.aClass477_182);
							for (CacheableNode_Sub15 class282_sub50_sub15_10 = (CacheableNode_Sub15) class469_9.method7790(); class282_sub50_sub15_10 != null; class282_sub50_sub15_10 = (CacheableNode_Sub15) class469_9.next())
								if (i_5++ == i_4)
									return ((CacheableNode_Sub7) class282_sub50_sub15_10.aClass477_9770.aCacheableNode_5629.aCacheableNode_8119).anInt9578;
						}
					} else if (Class20.aCacheableNode_Sub15_163 != null && i_2 > Class341.anInt3996 && i_2 < ObjectAnimationCutsceneAction.anInt8518 + Class341.anInt3996) {
						i_4 = -1;
						for (i_5 = 0; i_5 < Class20.aCacheableNode_Sub15_163.anInt9769; i_5++) {
							if (Class20.aBool187)
								i_8 = i_5 * Class20.anInt178 + fontmetrics_1.topPadding + CacheableNode_Sub2.anInt9471 + 1 + 20;
							else
								i_8 = i_5 * Class20.anInt178 + CacheableNode_Sub2.anInt9471 + 31;
							if (i_3 > i_8 - fontmetrics_1.topPadding - 1 && i_3 < i_8 + fontmetrics_1.bottomPadding)
								i_4 = i_5;
						}
						if (i_4 != -1) {
							i_5 = 0;
							class469_9 = new Class469(Class20.aCacheableNode_Sub15_163.aClass477_9770);
							for (class282_sub50_sub7_7 = (CacheableNode_Sub7) class469_9.method7790(); class282_sub50_sub7_7 != null; class282_sub50_sub7_7 = (CacheableNode_Sub7) class469_9.next())
								if (i_5++ == i_4)
									return class282_sub50_sub7_7.anInt9578;
						}
					}
				}
			}
		return -1;
	}

	public static void method1142(AreadSound class268_0) {
		if (class268_0.aNode_Sub15_Sub5_3304 != null)
			Class79.aNode_Sub15_Sub4_783.method15276(class268_0.aNode_Sub15_Sub5_3304);
		else
			class268_0.delay = Integer.MIN_VALUE;
	}

	@Override
	public String method135(QuickChatValueType value, int[] configs, long data) {
		if (value == QuickChatValueType.LISTDIALOG) {
			EnumDefinitions enumDef = IndexLoaders.ENUM_LOADER.getEnumDefinitions(configs[0]);
			return enumDef.getStringValue((int) data);
		}
		if (value != QuickChatValueType.OBJDIALOG && value != QuickChatValueType.OBJTRADEDIALOG)
			return value != QuickChatValueType.ENUM_STRING && value != QuickChatValueType.ENUM_STRING_CLAN && value != QuickChatValueType.ENUM_STRING_STATBASE ? null : IndexLoaders.ENUM_LOADER.getEnumDefinitions(configs[0]).getStringValue((int) data);
		else {
			ItemDefinitions itemdefinitions_5 = IndexLoaders.ITEM_LOADER.getItemDefinitions((int) data);
			return itemdefinitions_5.name;
		}
	}

	@Override
	public String method136(QuickChatValueType value, int[] ints_2, long long_3) {
		if (value == QuickChatValueType.LISTDIALOG) {
			EnumDefinitions enumdefinitions_6 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(ints_2[0]);
			return enumdefinitions_6.getStringValue((int) long_3);
		}
		if (value != QuickChatValueType.OBJDIALOG && value != QuickChatValueType.OBJTRADEDIALOG)
			return value != QuickChatValueType.ENUM_STRING && value != QuickChatValueType.ENUM_STRING_CLAN && QuickChatValueType.ENUM_STRING_STATBASE != value ? null : IndexLoaders.ENUM_LOADER.getEnumDefinitions(ints_2[0]).getStringValue((int) long_3);
		else {
			ItemDefinitions itemdefinitions_5 = IndexLoaders.ITEM_LOADER.getItemDefinitions((int) long_3);
			return itemdefinitions_5.name;
		}
	}

	@Override
	public String method137(QuickChatValueType quickchatdynamicvalue_1, int[] ints_2, long long_3) {
		if (quickchatdynamicvalue_1 == QuickChatValueType.LISTDIALOG) {
			EnumDefinitions enumdefinitions_6 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(ints_2[0]);
			return enumdefinitions_6.getStringValue((int) long_3);
		}
		if (quickchatdynamicvalue_1 != QuickChatValueType.OBJDIALOG && quickchatdynamicvalue_1 != QuickChatValueType.OBJTRADEDIALOG)
			return quickchatdynamicvalue_1 != QuickChatValueType.ENUM_STRING && quickchatdynamicvalue_1 != QuickChatValueType.ENUM_STRING_CLAN && QuickChatValueType.ENUM_STRING_STATBASE != quickchatdynamicvalue_1 ? null : IndexLoaders.ENUM_LOADER.getEnumDefinitions(ints_2[0]).getStringValue((int) long_3);
		else {
			ItemDefinitions itemdefinitions_5 = IndexLoaders.ITEM_LOADER.getItemDefinitions((int) long_3);
			return itemdefinitions_5.name;
		}
	}
}
