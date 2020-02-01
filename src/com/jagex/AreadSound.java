package com.jagex;
public class AreadSound {

	MIDIInstrument aNode_Sub18_3294;

	Node_Sub26_Sub1_Sub1 aNode_Sub26_Sub1_Sub1_3296;

	SoundEffect soundEffect;

	Node_Sub15_Sub5 aNode_Sub15_Sub5_3304;

	static int anInt3307;

	int anInt3305 = -1;

	int anInt3306 = -1;

	byte type;

	int soundId;

	int anInt3302;

	int delay;

	int volume;

	int anInt3298;

	int anInt3295;

	boolean method4793(byte b_1) {
		return this.type == 2 || this.type == 3;
	}

	AreadSound(byte type, int soundId, int i_3, int i_4, int i_5, int i_6, int i_7, Transform_Sub1 class521_sub1_8) {
		this.type = type;
		this.soundId = soundId;
		this.anInt3302 = i_3;
		this.delay = i_4;
		this.volume = i_5;
		this.anInt3298 = i_6;
		this.anInt3295 = i_7;
		if (class521_sub1_8 != null && class521_sub1_8 instanceof Transform_Sub1_Sub1) {
			Transform_Sub1_Sub1 class521_sub1_sub1_9 = (Transform_Sub1_Sub1) class521_sub1_8;
			this.anInt3305 = class521_sub1_sub1_9.aShort9458;
			this.anInt3306 = class521_sub1_sub1_9.aShort9456;
		}
	}

	public static int[] method4799(int i_0) {
		int[] ints_2 = new int[3];
		Class155.method2634(Class302.method5363(i_0, 1155387046));
		ints_2[0] = Class407.aCalendar4848.get(5);
		ints_2[1] = Class407.aCalendar4848.get(2);
		ints_2[2] = Class407.aCalendar4848.get(1);
		return ints_2;
	}

	static void method4800(GraphicalRenderer graphicalrenderer_0) {
		if ((Class20.anInt169 >= 2 || client.aBool7344) && client.aClass118_7257 == null) {
			String string_2;
			if (client.aBool7344 && Class20.anInt169 < 2) {
				string_2 = client.aString7275 + Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE) + client.aString7356 + " " + "->";
			} else if (Preference_Sub1.method12619(-1903584217) && Class20.anInt169 > 2) {
				string_2 = Static.method6380(CutsceneAction_Sub23.aCacheableNode_Sub7_9445, 1195583741);
			} else {
				CacheableNode_Sub7 class282_sub50_sub7_3 = CutsceneAction_Sub23.aCacheableNode_Sub7_9445;
				if (class282_sub50_sub7_3 == null) {
					return;
				}
				string_2 = Static.method6380(class282_sub50_sub7_3, 1123504706);
				int[] ints_4 = Class534_Sub1.method12815(class282_sub50_sub7_3, -1336515986);
				if (ints_4 != null) {
					string_2 = string_2 + Class15.method547(ints_4, 2114598830);
				}
			}
			if (Class20.anInt169 > 2) {
				string_2 = string_2 + Utils.rgbToColHexShortcut(16777215) + " / " + (Class20.anInt169 - 2) + Message.MORE_OPTIONS.translate(Class223.CURRENT_LANGUAGE);
			}
			if (Class20.aClass118_183 != null) {
				FontRenderer fontrenderer_5 = Class20.aClass118_183.method1988(Class487.aClass378_5752, client.anInterface35_7206, -208417273);
				if (fontrenderer_5 == null) {
					fontrenderer_5 = Class285.aFontRenderer_3394;
				}
				fontrenderer_5.method367(string_2, Class20.anInt195, Class20.anInt179, Class20.aClass118_183.width, Class20.aClass118_183.height, Class20.aClass118_183.color, Class20.aClass118_183.spriteShadow, Class20.aClass118_183.textHorizontalAli, Class20.aClass118_183.textVerticalAli, client.aRandom7260, Class455_Sub3.anInt9079, client.anIntArray7438, Class115.aNativeSpriteArray1248, Class20.anIntArray177, 1750233370);
				Class292.method5201(client.anIntArray7438[0], client.anIntArray7438[1], client.anIntArray7438[2], client.anIntArray7438[3]);
			}
		}
	}
}
