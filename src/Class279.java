import java.awt.Canvas;
import java.util.Stack;

public class Class279 {

	static int anInt3370;
	public static Class279 aClass279_3368 = new Class279();
	static Class279 aClass279_3369 = new Class279();
	static Class279 aClass279_3367 = new Class279();

	static void method4964(int i_0) {
		Class9.lobbyStage = 140;
		Class9.aClass184_73 = client.aClass184_7218;
		Class455.method7558(Class9.aLong77 == -1L, true, "", "", Class9.aLong77);
	}

	static final void method4965(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class242.method4160(icomponentdefinitions_3, interface_4, cs2executor_0, (short) 14442);
	}

	static final void method4966(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		EnumDefinitions enumdefinitions_4 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2, (byte) 8);
		char var_10000 = enumdefinitions_4.aChar5140;
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = enumdefinitions_4.getStringValue(i_3, 1017509768);
	}

	static final void method4967(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = Class225_Sub5.method13045(Class302.method5363(cs2executor_0.intStack[--cs2executor_0.intStackPtr], 126882752), Class223.CURRENT_LANGUAGE.method243((byte) 1), -912746201);
	}

	static final void method4968(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		Class468_Sub19.method12790(cs2executor_0.aClass282_Sub4_7011 == Class113.aClass282_Sub4_1235, i_2, -128209044);
	}

	static void method4969(Class285 class285_0, int i_1) {
		class285_0.aClass521_Sub1_3391 = null;
		Stack stack_2 = Class285.aStack3390;
		synchronized (Class285.aStack3390) {
			if (Class285.aStack3390.size() < 200) {
				Class285.aStack3390.push(class285_0);
			}

		}
	}

	static final void method4970(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		OutgoingLoginPacket.method6313(icomponentdefinitions_3, interface_4, cs2executor_0, 172839480);
	}

	static final void method4971(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class44.method910(icomponentdefinitions_3, interface_4, cs2executor_0, 2070102575);
	}

	static void renderItems(GraphicalRenderer graphicalrenderer_0, int i_1) {
		if (Class182.ITEMS.size(-1374254477) != 0) {
			Item item_2;
			if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(1853603888) == 0) {
				for (item_2 = (Item) Class182.ITEMS.head((byte) 98); item_2 != null; item_2 = (Item) Class182.ITEMS.next(471077510)) {
					IndexLoaders.ITEM_INDEX_LOADER.renderItemSprite(graphicalrenderer_0, graphicalrenderer_0, item_2.id, item_2.amount, item_2.outlineSize, item_2.shadowColor, false, false, item_2.anInt7819, Renderers.FONT_RENDERER, item_2.hasPlayerAppearance ? Class84.myPlayer.playerAppearance : null, (byte) 77);
					item_2.remove();
				}

				IncomingPacket.method6378(-1538407760);
			} else {
				if (Class182.HARDWARE_RENDERER == null) {
					Canvas canvas_3 = new Canvas();
					canvas_3.setSize(36, 32);
					Class182.HARDWARE_RENDERER = Class320.method5732(0, canvas_3, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, 0, -2102871027);
					Class182.aClass8_2259 = Class182.HARDWARE_RENDERER.method8448(Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, Class16.anInt140, 0, 2062772930), Class91.method1514(IndexLoaders.SPRITES_INDEX, Class16.anInt140, 0), true);
				}

				for (item_2 = (Item) Class182.ITEMS.head((byte) 59); item_2 != null; item_2 = (Item) Class182.ITEMS.next(-468135531)) {
					IndexLoaders.ITEM_INDEX_LOADER.renderItemSprite(Class182.HARDWARE_RENDERER, graphicalrenderer_0, item_2.id, item_2.amount, item_2.outlineSize, item_2.shadowColor, false, false, item_2.anInt7819, Class182.aClass8_2259, item_2.hasPlayerAppearance ? Class84.myPlayer.playerAppearance : null, (byte) 0);
					item_2.remove();
				}
			}
		}

	}

}
