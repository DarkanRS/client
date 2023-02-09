package com.rs.jagex;

import com.rs.jagex.clans.settings.ChangeClanSetting;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class Class304 implements Interface27 {

	static String method5407(int i_0, Language xlanguage_1) {
		return i_0 < 100000 ? "<col=ffff00>" + i_0 + "</col>" : (i_0 < 10000000 ? "<col=ffffff>" + i_0 / 1000 + LocalizedText.aClass433_5297.translate(xlanguage_1) + "</col>" : "<col=00ff80>" + i_0 / 1000000 + LocalizedText.aClass433_5304.translate(xlanguage_1) + "</col>");
	}
	public static int[][] method5410() {
		int[][] ints_9 = new int[256][64];
		MaterialProp34 class282_sub20_sub4_10 = new MaterialProp34();
		class282_sub20_sub4_10.aBool9726 = false;
		class282_sub20_sub4_10.anInt9725 = 4;
		class282_sub20_sub4_10.anInt9735 = 4;
		class282_sub20_sub4_10.anInt9736 = 3;
		class282_sub20_sub4_10.anInt9737 = (int) (4096.0F * (float) 0.4);
		class282_sub20_sub4_10.method12321();
		Class316.method5593(64, 256);
		for (int i_11 = 0; i_11 < 256; i_11++)
			class282_sub20_sub4_10.method15197(i_11, ints_9[i_11]);
		return ints_9;
	}
	public static void setUseOptionFlags(IComponentDefinitions componentDefs, int flags, int targetParam) {
		if (componentDefs != null) {
			if (componentDefs.onUseScript != null) {
				HookRequest hookrequest_4 = new HookRequest();
				hookrequest_4.source = componentDefs;
				hookrequest_4.params = componentDefs.onUseScript;
				CS2Executor.executeHookInner(hookrequest_4);
			}
			client.IS_USE_SELECTED = true;
			client.anInt56 = componentDefs.idHash;
			client.anInt7345 = componentDefs.slotId;
			Class506.USE_OPTIONS_FLAGS = flags;
			CutsceneAction_Sub12.TARGET_PARAM = targetParam;
			client.anInt7346 = componentDefs.containerItemId;
			Defaults8Loader.anInt5932 = componentDefs.targetOverCursor;
			client.anInt7427 = componentDefs.targetLeaveCursor;
			IComponentDefinitions.redrawComponent(componentDefs);
		}
	}
	boolean aBool3572;
	boolean aBool3583;
	boolean aBool3584;
	int anInt3585;
	int anInt3586;
	int anInt3587;
	int anInt3571;
	int anInt3569;
	int anInt3590;
	int anInt3591;
	int anInt3592;
	Font aFont3573;
	java.awt.FontMetrics aFontMetrics3570;
	Color aColor3582;
	Image anImage3575;
	Image anImage3574;
	Image anImage3589;
	Image anImage3576;
	Image anImage3577;
	Image anImage3578;
	Image anImage3579;
	Image anImage3580;

	Image anImage3581;

	int anInt3593;

	Image anImage3588;

	int getWindowHeight(int i_1) {
		return aBool3584 ? (Engine.BASE_WINDOW_HEIGHT * -969250379 - i_1) / 2 : 0;
	}

	int getWindowWidth(int i_1) {
		return aBool3583 ? (ChangeClanSetting.BASE_WINDOW_WIDTH - i_1) / 2 : 0;
	}

	@Override
	public void method157() {
		Class362.method6276();
	}

	@Override
	public void method158() {
	}

	@Override
	public void method159() {
	}

	@Override
	public void method161() {
	}

	@Override
	public void method186() {
		Class362.method6276();
	}

	@Override
	public void method187() {
		if (!aBool3572 && aFont3573 == null)
			try {
				String[] arr_3 = MovingAnimation.split(client.aString7157, ',');
				if (arr_3.length != 23)
					aBool3572 = true;
				aBool3583 = Boolean.parseBoolean(arr_3[0]);
				aBool3584 = Boolean.parseBoolean(arr_3[1]);
				anInt3585 = Utils.parseInt(arr_3[2]);
				anInt3586 = Utils.parseInt(arr_3[3]);
				anInt3587 = Utils.parseInt(arr_3[4]);
				anInt3571 = Utils.parseInt(arr_3[5]);
				anInt3569 = Utils.parseInt(arr_3[6]);
				anInt3590 = Utils.parseInt(arr_3[7]);
				anInt3591 = Utils.parseInt(arr_3[8]);
				anInt3592 = Utils.parseInt(arr_3[9]);
				String string_4 = arr_3[10];
				int i_5 = Utils.parseInt(arr_3[11]);
				int i_6 = Class285.method5026(arr_3[12].substring(2));
				aFont3573 = new Font(string_4, Font.PLAIN, i_5);
				aFontMetrics3570 = Class351.gameCanvas.getFontMetrics(aFont3573);
				aColor3582 = new Color(i_6);
				MediaTracker mediatracker_7 = new MediaTracker(Class351.gameCanvas);
				anImage3575 = method5399(arr_3[13]);
				mediatracker_7.addImage(anImage3575, 0);
				anImage3574 = method5399(arr_3[14]);
				mediatracker_7.addImage(anImage3574, 1);
				anImage3589 = method5399(arr_3[15]);
				mediatracker_7.addImage(anImage3589, 2);
				anImage3576 = method5399(arr_3[16]);
				mediatracker_7.addImage(anImage3576, 3);
				anImage3577 = method5399(arr_3[17]);
				mediatracker_7.addImage(anImage3577, 4);
				anImage3578 = method5399(arr_3[18]);
				mediatracker_7.addImage(anImage3578, 5);
				anImage3579 = method5399(arr_3[19]);
				mediatracker_7.addImage(anImage3579, 6);
				anImage3580 = method5399(arr_3[20]);
				mediatracker_7.addImage(anImage3580, 7);
				anImage3581 = method5399(arr_3[21]);
				mediatracker_7.addImage(anImage3581, 8);
				mediatracker_7.waitForAll();
				anInt3593 = Utils.parseInt(arr_3[22]);
			} catch (Exception exception_42) {
				aBool3572 = true;
			}
		if (aBool3572)
			method5398();
		else {
			Graphics graphics_44 = Class351.gameCanvas.getGraphics();
			if (graphics_44 != null)
				try {
					int i_34 = Comparable_Sub1.aClass306_3771.method5424();
					String string_35 = Comparable_Sub1.aClass306_3771.method5425();
					if (ClosedOutputStream.anImage7953 == null)
						ClosedOutputStream.anImage7953 = Class351.gameCanvas.createImage(ChangeClanSetting.BASE_WINDOW_WIDTH, Engine.BASE_WINDOW_HEIGHT * -969250379);
					Graphics graphics_36 = ClosedOutputStream.anImage7953.getGraphics();
					graphics_36.setColor(Color.BLACK);
					graphics_36.fillRect(0, 0, ChangeClanSetting.BASE_WINDOW_WIDTH, Engine.BASE_WINDOW_HEIGHT * -969250379);
					int i_37 = anImage3579.getWidth(null);
					int i_8 = anImage3580.getWidth(null);
					int i_9 = anImage3581.getWidth(null);
					int i_10 = anImage3579.getHeight(null);
					int i_11 = anImage3580.getHeight(null);
					int i_12 = anImage3581.getHeight(null);
					graphics_36.drawImage(anImage3579, getWindowWidth(i_37) + anInt3569 - anInt3591 / 2, getWindowHeight(i_10) + anInt3590, null);
					int i_13 = anInt3569 - anInt3591 / 2 + i_37;
					int i_14 = anInt3591 / 2 + anInt3569;
					int i_15;
					for (i_15 = i_13; i_15 <= i_14; i_15 += i_9)
						graphics_36.drawImage(anImage3581, getWindowWidth(i_37) + anInt3569 + i_15, getWindowHeight(i_12) + anInt3590, null);
					graphics_36.drawImage(anImage3580, getWindowWidth(i_8) + anInt3569 + anInt3591 / 2, getWindowHeight(i_11) + anInt3590, null);
					i_15 = anImage3589.getWidth(null);
					int i_16 = anImage3589.getHeight(null);
					int i_17 = anImage3576.getWidth(null);
					int i_18 = anImage3576.getHeight(null);
					int i_19 = anImage3578.getHeight(null);
					int i_20 = anImage3577.getWidth(null);
					int i_21 = anImage3577.getHeight(null);
					int i_22 = anImage3578.getWidth(null);
					int i_23 = anImage3575.getWidth(null);
					int i_24 = anImage3574.getWidth(null);
					int i_25 = getWindowWidth(anInt3587) + anInt3585;
					int i_26 = getWindowHeight(anInt3571) + anInt3586;
					graphics_36.drawImage(anImage3589, i_25, i_26 + (anInt3571 - i_16) / 2, null);
					graphics_36.drawImage(anImage3576, i_25 + anInt3587 - i_17, i_26 + (anInt3571 - i_18) / 2, null);
					if (anImage3588 == null)
						anImage3588 = Class351.gameCanvas.createImage(anInt3587 - i_15 - i_17, anInt3571);
					Graphics graphics_27 = anImage3588.getGraphics();
					int i_28;
					for (i_28 = 0; i_28 < anInt3587 - i_15 - i_17; i_28 += i_20)
						graphics_27.drawImage(anImage3577, i_28, 0, null);
					for (i_28 = 0; i_28 < anInt3587 - i_15 - i_17; i_28 += i_22)
						graphics_27.drawImage(anImage3578, i_28, anInt3571 - i_19, null);
					i_28 = i_34 * (anInt3587 - i_15 - i_17) / 100;
					int i_33;
					if (i_28 > 0) {
						Image image_29 = Class351.gameCanvas.createImage(i_28, anInt3571 - i_21 - i_19);
						int i_30 = image_29.getWidth(null);
						Graphics graphics_31 = image_29.getGraphics();
						int i_32 = anInt3593 * CS2ReturnValue.method8740() / 10 % i_23;
						for (i_33 = i_32 - i_23; i_33 < i_30; i_33 += i_23)
							graphics_31.drawImage(anImage3575, i_33, 0, null);
						graphics_27.drawImage(image_29, 0, i_21, null);
					}
					int i_38 = i_28;
					i_28 = anInt3587 - i_15 - i_17 - i_28;
					if (i_28 > 0) {
						Image image_39 = Class351.gameCanvas.createImage(i_28, anInt3571 - i_21 - i_19);
						int i_40 = image_39.getWidth(null);
						Graphics graphics_41 = image_39.getGraphics();
						for (i_33 = 0; i_33 < i_40; i_33 += i_24)
							graphics_41.drawImage(anImage3574, i_33, 0, null);
						graphics_27.drawImage(image_39, i_38, i_21, null);
					}
					graphics_36.drawImage(anImage3588, i_25 + i_15, i_26, null);
					graphics_36.setFont(aFont3573);
					graphics_36.setColor(aColor3582);
					graphics_36.drawString(string_35, i_25 + (anInt3587 - aFontMetrics3570.stringWidth(string_35)) / 2, anInt3571 / 2 + i_26 + anInt3592 + 4);
					graphics_44.drawImage(ClosedOutputStream.anImage7953, 0, 0, null);
				} catch (Exception exception_43) {
					aBool3572 = true;
				}
			else
				Class351.gameCanvas.repaint();
		}
	}

	@Override
	public void method188() {
		Class362.method6276();
	}

	@Override
	public boolean method189(long long_1) {
		return true;
	}

	@Override
	public int method190() {
		return 0;
	}

	@Override
	public int method191() {
		return 100;
	}

	@Override
	public boolean method193(long long_1) {
		return true;
	}

	@Override
	public void method195() {
	}

	@Override
	public int method196() {
		return 100;
	}

	@Override
	public int method197() {
		return 100;
	}

	@Override
	public int method198() {
		return 100;
	}

	void method5398() {
		Class158_Sub1_Sub2.method15535(Comparable_Sub1.aClass306_3771.method5424(), Comparable_Sub1.aClass306_3771.method5425(), client.aColorArray7186[client.anInt7447], client.aColorArray7199[client.anInt7447], client.aColorArray7200[client.anInt7447]);
	}

	Image method5399(String string_1) throws IOException {
		try {
			InputStream inputstream_4 = SubInterface.suppliedApplet.getClass().getClassLoader().getResourceAsStream(string_1);
			byte[] bytes_5 = new byte[4000];
			int i_7;
			for (int i_6 = 0; (i_7 = inputstream_4.read()) != -1; bytes_5[i_6++] = (byte) i_7) {
			}
			Image image_8 = Toolkit.getDefaultToolkit().createImage(bytes_5);
			return image_8;
		} catch (Exception exception_9) {
			return null;
		}
	}

	@Override
	public int method71() {
		return 0;
	}

	@Override
	public int method72() {
		return 0;
	}
}
