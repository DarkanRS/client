
/* Class279 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class279 {
	static Class279 aClass279_3367;
	public static Class279 aClass279_3368 = new Class279();
	static Class279 aClass279_3369 = new Class279();
	static int anInt3370;

	static {
		aClass279_3367 = new Class279();
	}

	Class279() {
		/* empty */
	}

	static void method4964(int i) {
		Class9.lobbyStage = -1543542220;
		Class9.aClass184_73 = client.aClass184_7218;
		Class455.method7558(-1L == 8013795473128403269L * Class9.aLong77, true, "", "", 8013795473128403269L * Class9.aLong77);
	}

	static final void method4965(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class242.method4160(class118, class98, class527, (short) 14442);
	}

	static final void method4966(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_0_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_1_ = (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		Class431 class431 = IndexLoaders.aClass444_5570.method7424(i_0_, (byte) 8);
		if ('s' == class431.aChar5140) {
			/* empty */
		}
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = class431.method7226(i_1_, 1017509768);
	}

	static final void method4967(CS2Executor class527, int i) {
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = (Class225_Sub5.method13045(Class302.method5363((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]), 126882752), Class223.CURRENT_LANGUAGE.method243((byte) 1), -912746201));
	}

	static final void method4968(CS2Executor class527, int i) {
		int i_2_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class468_Sub19.method12790((Class113.aClass282_Sub4_1235 == (((CS2Executor) class527).aClass282_Sub4_7011)), i_2_, -128209044);
	}

	static void method4969(Class285 class285, int i) {
		class285.aClass521_Sub1_3391 = null;
		synchronized (Class285.aStack3390) {
			if (Class285.aStack3390.size() < 200)
				Class285.aStack3390.push(class285);
		}
	}

	static final void method4970(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class369.method6313(class118, class98, class527, 172839480);
	}

	static final void method4971(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class44.method910(class118, class98, class527, 2070102575);
	}

	static void renderItems(GraphicalRenderer softwareRenderer, int i) {
		if (Class182.ITEMS.size(-1374254477) != 0) {
			if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(1853603888) == 0) {
				for (Item item = ((Item) Class182.ITEMS.head((byte) 98)); item != null; item = ((Item) Class182.ITEMS.next(471077510))) {
					IndexLoaders.ITEM_INDEX_LOADER.renderItemSprite(softwareRenderer, softwareRenderer, (item.id * 1343343281), (item.amount * -1956508275), (item.outlineSize * 1172052973), (item.shadowColor * 1379786857), false, false, (item.anInt7819 * 660031547), Renderers.FONT_RENDERER, (item.hasPlayerAppearance ? (Class84.myPlayer.playerAppearance) : null), (byte) 77);
					item.unlink(-371378792);
				}
				IncomingPacket.method6378(-1538407760);
			} else {
				if (Class182.HARDWARE_RENDERER == null) {
					Canvas canvas = new Canvas();
					canvas.setSize(36, 32);
					Class182.HARDWARE_RENDERER = Class320.method5732(0, canvas, IndexLoaders.IMAGE_LOADER, IndexLoaders.SHADER_INDEX, 0, -2102871027);
					Class182.aClass8_2259 = (Class182.HARDWARE_RENDERER.method8448(Class94.method1588(IndexLoaders.FONT_METRICS_INDEX, 1500183805 * Class16.anInt140, 0, 2062772930), Class91.method1514(IndexLoaders.SPRITES_INDEX, 1500183805 * Class16.anInt140, 0), true));
				}
				for (Item class282_sub32 = ((Item) Class182.ITEMS.head((byte) 59)); class282_sub32 != null; class282_sub32 = ((Item) Class182.ITEMS.next(-468135531))) {
					IndexLoaders.ITEM_INDEX_LOADER.renderItemSprite(Class182.HARDWARE_RENDERER, softwareRenderer, (((Item) class282_sub32).id * 1343343281), (((Item) class282_sub32).amount * -1956508275), (((Item) class282_sub32).outlineSize * 1172052973), (1379786857 * ((Item) class282_sub32).shadowColor), false, false, (660031547 * ((Item) class282_sub32).anInt7819), Class182.aClass8_2259,
							(((Item) class282_sub32).hasPlayerAppearance ? (Class84.myPlayer.playerAppearance) : null), (byte) 0);
					class282_sub32.unlink(-371378792);
				}
			}
		}
	}
}
