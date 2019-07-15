import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;

public class Class304 implements Interface27 {

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

	final int method5396(int i_1, int i_2) {
		return this.aBool3583 ? (Class349.anInt4083 - i_1) / 2 : 0;
	}

	final int method5397(int i_1, byte b_2) {
		return this.aBool3584 ? (Engine.anInt3243 * -969250379 - i_1) / 2 : 0;
	}

	public void method188() {
		Class362.method6276();
	}

	public void method186() {
		Class362.method6276();
	}

	void method5398() {
		Class158_Sub1_Sub2.method15535(Comparable_Sub1.aClass306_3771.method5424((byte) 89), Comparable_Sub1.aClass306_3771.method5425(-1675493228), client.aColorArray7186[client.anInt7447], client.aColorArray7199[client.anInt7447], client.aColorArray7200[client.anInt7447]);
	}

	Image method5399(String string_1) throws IOException {
		try {
			InputStream inputstream_4 = Node_Sub44.anApplet8065.getClass().getClassLoader().getResourceAsStream(string_1);
			byte[] bytes_5 = new byte[4000];
			int i_7;
			for (int i_6 = 0; (i_7 = inputstream_4.read()) != -1; bytes_5[i_6++] = (byte) i_7) {
				;
			}
			Image image_8 = Toolkit.getDefaultToolkit().createImage(bytes_5);
			return image_8;
		} catch (Exception exception_9) {
			return null;
		}
	}

	public void method161() {
	}

	public int method191(int i_1) {
		return 100;
	}

	public boolean method189(long long_1) {
		return true;
	}

	public int method190(int i_1) {
		return 0;
	}

	public void method195() {
	}

	public void method192(boolean bool_1) {
		if (!this.aBool3572 && this.aFont3573 == null) {
			try {
				String[] arr_2 = MovingAnimation.method12681(client.aString7157, ',');
				if (arr_2.length != 23) {
					this.aBool3572 = true;
				}
				this.aBool3583 = Boolean.parseBoolean(arr_2[0]);
				this.aBool3584 = Boolean.parseBoolean(arr_2[1]);
				this.anInt3585 = Utils.parseInt(arr_2[2]) * -1241431707 * 956041325;
				this.anInt3586 = Utils.parseInt(arr_2[3]) * 1545138689 * -1599402495;
				this.anInt3587 = Utils.parseInt(arr_2[4]) * -1872715597 * -1500311941;
				this.anInt3571 = Utils.parseInt(arr_2[5]) * 544546015 * 1149083423;
				this.anInt3569 = Utils.parseInt(arr_2[6]) * -850535471 * 215899441;
				this.anInt3590 = Utils.parseInt(arr_2[7]) * -537340309 * -1591466429;
				this.anInt3591 = Utils.parseInt(arr_2[8]) * 1020096939 * -1703804669;
				this.anInt3592 = Utils.parseInt(arr_2[9]) * -29425429 * -2097436733;
				String string_3 = arr_2[10];
				int i_4 = Utils.parseInt(arr_2[11]);
				int i_5 = Class285.method5026(arr_2[12].substring(2), (byte) -78);
				this.aFont3573 = new Font(string_3, 0, i_4);
				this.aFontMetrics3570 = Class351.gameCanvas.getFontMetrics(this.aFont3573);
				this.aColor3582 = new Color(i_5);
				MediaTracker mediatracker_6 = new MediaTracker(Class351.gameCanvas);
				this.anImage3575 = this.method5399(arr_2[13]);
				mediatracker_6.addImage(this.anImage3575, 0);
				this.anImage3574 = this.method5399(arr_2[14]);
				mediatracker_6.addImage(this.anImage3574, 1);
				this.anImage3589 = this.method5399(arr_2[15]);
				mediatracker_6.addImage(this.anImage3589, 2);
				this.anImage3576 = this.method5399(arr_2[16]);
				mediatracker_6.addImage(this.anImage3576, 3);
				this.anImage3577 = this.method5399(arr_2[17]);
				mediatracker_6.addImage(this.anImage3577, 4);
				this.anImage3578 = this.method5399(arr_2[18]);
				mediatracker_6.addImage(this.anImage3578, 5);
				this.anImage3579 = this.method5399(arr_2[19]);
				mediatracker_6.addImage(this.anImage3579, 6);
				this.anImage3580 = this.method5399(arr_2[20]);
				mediatracker_6.addImage(this.anImage3580, 7);
				this.anImage3581 = this.method5399(arr_2[21]);
				mediatracker_6.addImage(this.anImage3581, 8);
				mediatracker_6.waitForAll();
				this.anInt3593 = Utils.parseInt(arr_2[22]) * -1517908233 * -493710649;
			} catch (Exception exception_41) {
				this.aBool3572 = true;
			}
		}
		if (this.aBool3572) {
			this.method5398();
		} else {
			Graphics graphics_43 = Class351.gameCanvas.getGraphics();
			if (graphics_43 != null) {
				try {
					int i_33 = Comparable_Sub1.aClass306_3771.method5424((byte) 94);
					String string_34 = Comparable_Sub1.aClass306_3771.method5425(-620954186);
					if (OutputStream_Sub1.anImage7953 == null) {
						OutputStream_Sub1.anImage7953 = Class351.gameCanvas.createImage(-418109423 * Class349.anInt4083 * 1426041429 * 765 * -1943418639, Engine.anInt3243 * -969250379 * -1929118563 * -969250379);
					}
					Graphics graphics_35 = OutputStream_Sub1.anImage7953.getGraphics();
					graphics_35.setColor(Color.BLACK);
					graphics_35.fillRect(0, 0, -418109423 * Class349.anInt4083 * 1426041429 * 765 * -1943418639, -969250379 * Engine.anInt3243 * -969250379 * -1929118563);
					int i_36 = this.anImage3579.getWidth((ImageObserver) null);
					int i_7 = this.anImage3580.getWidth((ImageObserver) null);
					int i_8 = this.anImage3581.getWidth((ImageObserver) null);
					int i_9 = this.anImage3579.getHeight((ImageObserver) null);
					int i_10 = this.anImage3580.getHeight((ImageObserver) null);
					int i_11 = this.anImage3581.getHeight((ImageObserver) null);
					graphics_35.drawImage(this.anImage3579, this.method5396(i_36, 1666375263) + 215899441 * this.anInt3569 * -850535471 - -1703804669 * this.anInt3591 * 1020096939 / 2, this.method5397(i_9, (byte) -26) + -1591466429 * this.anInt3590 * -537340309, (ImageObserver) null);
					int i_12 = 215899441 * this.anInt3569 * -850535471 - this.anInt3591 * 1020096939 * -1703804669 / 2 + i_36;
					int i_13 = this.anInt3569 * -850535471 * 215899441 + this.anInt3591 * 1020096939 * -1703804669 / 2;
					int i_14;
					for (i_14 = i_12; i_14 <= i_13; i_14 += i_8) {
						graphics_35.drawImage(this.anImage3581, this.method5396(i_36, 218736010) + this.anInt3569 * -850535471 * 215899441 + i_14, this.method5397(i_11, (byte) -4) + this.anInt3590 * -537340309 * -1591466429, (ImageObserver) null);
					}
					graphics_35.drawImage(this.anImage3580, this.method5396(i_7, 1483047424) + this.anInt3569 * -850535471 * 215899441 + -1703804669 * this.anInt3591 * 1020096939 / 2, this.method5397(i_10, (byte) -84) + -1591466429 * this.anInt3590 * -537340309, (ImageObserver) null);
					i_14 = this.anImage3589.getWidth((ImageObserver) null);
					int i_15 = this.anImage3589.getHeight((ImageObserver) null);
					int i_16 = this.anImage3576.getWidth((ImageObserver) null);
					int i_17 = this.anImage3576.getHeight((ImageObserver) null);
					int i_18 = this.anImage3578.getHeight((ImageObserver) null);
					int i_19 = this.anImage3577.getWidth((ImageObserver) null);
					int i_20 = this.anImage3577.getHeight((ImageObserver) null);
					int i_21 = this.anImage3578.getWidth((ImageObserver) null);
					int i_22 = this.anImage3575.getWidth((ImageObserver) null);
					int i_23 = this.anImage3574.getWidth((ImageObserver) null);
					int i_24 = this.method5396(this.anInt3587 * -1872715597 * -1500311941, 743094848) + 956041325 * this.anInt3585 * -1241431707;
					int i_25 = this.method5397(1149083423 * this.anInt3571 * 544546015, (byte) -55) + this.anInt3586 * 1545138689 * -1599402495;
					graphics_35.drawImage(this.anImage3589, i_24, (1149083423 * this.anInt3571 * 544546015 - i_15) / 2 + i_25, (ImageObserver) null);
					graphics_35.drawImage(this.anImage3576, i_24 + -1500311941 * this.anInt3587 * -1872715597 - i_16, (1149083423 * this.anInt3571 * 544546015 - i_17) / 2 + i_25, (ImageObserver) null);
					if (this.anImage3588 == null) {
						this.anImage3588 = Class351.gameCanvas.createImage(this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16, 1149083423 * this.anInt3571 * 544546015);
					}
					Graphics graphics_26 = this.anImage3588.getGraphics();
					int i_27;
					for (i_27 = 0; i_27 < this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16; i_27 += i_19) {
						graphics_26.drawImage(this.anImage3577, i_27, 0, (ImageObserver) null);
					}
					for (i_27 = 0; i_27 < this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16; i_27 += i_21) {
						graphics_26.drawImage(this.anImage3578, i_27, this.anInt3571 * 544546015 * 1149083423 - i_18, (ImageObserver) null);
					}
					i_27 = (this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16) * i_33 / 100;
					int i_32;
					if (i_27 > 0) {
						Image image_28 = Class351.gameCanvas.createImage(i_27, 1149083423 * this.anInt3571 * 544546015 - i_20 - i_18);
						int i_29 = image_28.getWidth((ImageObserver) null);
						Graphics graphics_30 = image_28.getGraphics();
						int i_31 = this.anInt3593 * -1517908233 * -493710649 * Class509.method8740(-1334135782) / 10 % i_22;
						for (i_32 = i_31 - i_22; i_32 < i_29; i_32 += i_22) {
							graphics_30.drawImage(this.anImage3575, i_32, 0, (ImageObserver) null);
						}
						graphics_26.drawImage(image_28, 0, i_20, (ImageObserver) null);
					}
					int i_37 = i_27;
					i_27 = -1500311941 * this.anInt3587 * -1872715597 - i_14 - i_16 - i_27;
					if (i_27 > 0) {
						Image image_38 = Class351.gameCanvas.createImage(i_27, 1149083423 * this.anInt3571 * 544546015 - i_20 - i_18);
						int i_39 = image_38.getWidth((ImageObserver) null);
						Graphics graphics_40 = image_38.getGraphics();
						for (i_32 = 0; i_32 < i_39; i_32 += i_23) {
							graphics_40.drawImage(this.anImage3574, i_32, 0, (ImageObserver) null);
						}
						graphics_26.drawImage(image_38, i_37, i_20, (ImageObserver) null);
					}
					graphics_35.drawImage(this.anImage3588, i_24 + i_14, i_25, (ImageObserver) null);
					graphics_35.setFont(this.aFont3573);
					graphics_35.setColor(this.aColor3582);
					graphics_35.drawString(string_34, i_24 + (-1500311941 * this.anInt3587 * -1872715597 - this.aFontMetrics3570.stringWidth(string_34)) / 2, 4 + this.anInt3571 * 544546015 * 1149083423 / 2 + i_25 + -2097436733 * this.anInt3592 * -29425429);
					graphics_43.drawImage(OutputStream_Sub1.anImage7953, 0, 0, (ImageObserver) null);
				} catch (Exception exception_42) {
					this.aBool3572 = true;
				}
			} else {
				Class351.gameCanvas.repaint();
			}
		}
	}

	public int method71() {
		return 0;
	}

	public void x(boolean bool_1) {
		if (!this.aBool3572 && this.aFont3573 == null) {
			try {
				String[] arr_2 = MovingAnimation.method12681(client.aString7157, ',');
				if (arr_2.length != 23) {
					this.aBool3572 = true;
				}
				this.aBool3583 = Boolean.parseBoolean(arr_2[0]);
				this.aBool3584 = Boolean.parseBoolean(arr_2[1]);
				this.anInt3585 = Utils.parseInt(arr_2[2]) * -1241431707 * 956041325;
				this.anInt3586 = Utils.parseInt(arr_2[3]) * 1545138689 * -1599402495;
				this.anInt3587 = Utils.parseInt(arr_2[4]) * -1872715597 * -1500311941;
				this.anInt3571 = Utils.parseInt(arr_2[5]) * 544546015 * 1149083423;
				this.anInt3569 = Utils.parseInt(arr_2[6]) * -850535471 * 215899441;
				this.anInt3590 = Utils.parseInt(arr_2[7]) * -537340309 * -1591466429;
				this.anInt3591 = Utils.parseInt(arr_2[8]) * 1020096939 * -1703804669;
				this.anInt3592 = Utils.parseInt(arr_2[9]) * -29425429 * -2097436733;
				String string_3 = arr_2[10];
				int i_4 = Utils.parseInt(arr_2[11]);
				int i_5 = Class285.method5026(arr_2[12].substring(2), (byte) -48);
				this.aFont3573 = new Font(string_3, 0, i_4);
				this.aFontMetrics3570 = Class351.gameCanvas.getFontMetrics(this.aFont3573);
				this.aColor3582 = new Color(i_5);
				MediaTracker mediatracker_6 = new MediaTracker(Class351.gameCanvas);
				this.anImage3575 = this.method5399(arr_2[13]);
				mediatracker_6.addImage(this.anImage3575, 0);
				this.anImage3574 = this.method5399(arr_2[14]);
				mediatracker_6.addImage(this.anImage3574, 1);
				this.anImage3589 = this.method5399(arr_2[15]);
				mediatracker_6.addImage(this.anImage3589, 2);
				this.anImage3576 = this.method5399(arr_2[16]);
				mediatracker_6.addImage(this.anImage3576, 3);
				this.anImage3577 = this.method5399(arr_2[17]);
				mediatracker_6.addImage(this.anImage3577, 4);
				this.anImage3578 = this.method5399(arr_2[18]);
				mediatracker_6.addImage(this.anImage3578, 5);
				this.anImage3579 = this.method5399(arr_2[19]);
				mediatracker_6.addImage(this.anImage3579, 6);
				this.anImage3580 = this.method5399(arr_2[20]);
				mediatracker_6.addImage(this.anImage3580, 7);
				this.anImage3581 = this.method5399(arr_2[21]);
				mediatracker_6.addImage(this.anImage3581, 8);
				mediatracker_6.waitForAll();
				this.anInt3593 = Utils.parseInt(arr_2[22]) * -1517908233 * -493710649;
			} catch (Exception exception_41) {
				this.aBool3572 = true;
			}
		}
		if (this.aBool3572) {
			this.method5398();
		} else {
			Graphics graphics_43 = Class351.gameCanvas.getGraphics();
			if (graphics_43 != null) {
				try {
					int i_33 = Comparable_Sub1.aClass306_3771.method5424((byte) 101);
					String string_34 = Comparable_Sub1.aClass306_3771.method5425(1371688477);
					if (OutputStream_Sub1.anImage7953 == null) {
						OutputStream_Sub1.anImage7953 = Class351.gameCanvas.createImage(-418109423 * Class349.anInt4083 * 1426041429 * 765 * -1943418639, Engine.anInt3243 * -969250379 * -1929118563 * -969250379);
					}
					Graphics graphics_35 = OutputStream_Sub1.anImage7953.getGraphics();
					graphics_35.setColor(Color.BLACK);
					graphics_35.fillRect(0, 0, -418109423 * Class349.anInt4083 * 1426041429 * 765 * -1943418639, -969250379 * Engine.anInt3243 * -969250379 * -1929118563);
					int i_36 = this.anImage3579.getWidth((ImageObserver) null);
					int i_7 = this.anImage3580.getWidth((ImageObserver) null);
					int i_8 = this.anImage3581.getWidth((ImageObserver) null);
					int i_9 = this.anImage3579.getHeight((ImageObserver) null);
					int i_10 = this.anImage3580.getHeight((ImageObserver) null);
					int i_11 = this.anImage3581.getHeight((ImageObserver) null);
					graphics_35.drawImage(this.anImage3579, this.method5396(i_36, 1817688403) + 215899441 * this.anInt3569 * -850535471 - -1703804669 * this.anInt3591 * 1020096939 / 2, this.method5397(i_9, (byte) -80) + -1591466429 * this.anInt3590 * -537340309, (ImageObserver) null);
					int i_12 = 215899441 * this.anInt3569 * -850535471 - this.anInt3591 * 1020096939 * -1703804669 / 2 + i_36;
					int i_13 = this.anInt3569 * -850535471 * 215899441 + this.anInt3591 * 1020096939 * -1703804669 / 2;
					int i_14;
					for (i_14 = i_12; i_14 <= i_13; i_14 += i_8) {
						graphics_35.drawImage(this.anImage3581, this.method5396(i_36, 1293096957) + this.anInt3569 * -850535471 * 215899441 + i_14, this.method5397(i_11, (byte) -29) + this.anInt3590 * -537340309 * -1591466429, (ImageObserver) null);
					}
					graphics_35.drawImage(this.anImage3580, this.method5396(i_7, 528245338) + this.anInt3569 * -850535471 * 215899441 + -1703804669 * this.anInt3591 * 1020096939 / 2, this.method5397(i_10, (byte) -81) + -1591466429 * this.anInt3590 * -537340309, (ImageObserver) null);
					i_14 = this.anImage3589.getWidth((ImageObserver) null);
					int i_15 = this.anImage3589.getHeight((ImageObserver) null);
					int i_16 = this.anImage3576.getWidth((ImageObserver) null);
					int i_17 = this.anImage3576.getHeight((ImageObserver) null);
					int i_18 = this.anImage3578.getHeight((ImageObserver) null);
					int i_19 = this.anImage3577.getWidth((ImageObserver) null);
					int i_20 = this.anImage3577.getHeight((ImageObserver) null);
					int i_21 = this.anImage3578.getWidth((ImageObserver) null);
					int i_22 = this.anImage3575.getWidth((ImageObserver) null);
					int i_23 = this.anImage3574.getWidth((ImageObserver) null);
					int i_24 = this.method5396(this.anInt3587 * -1872715597 * -1500311941, 415756976) + 956041325 * this.anInt3585 * -1241431707;
					int i_25 = this.method5397(1149083423 * this.anInt3571 * 544546015, (byte) -44) + this.anInt3586 * 1545138689 * -1599402495;
					graphics_35.drawImage(this.anImage3589, i_24, (1149083423 * this.anInt3571 * 544546015 - i_15) / 2 + i_25, (ImageObserver) null);
					graphics_35.drawImage(this.anImage3576, i_24 + -1500311941 * this.anInt3587 * -1872715597 - i_16, (1149083423 * this.anInt3571 * 544546015 - i_17) / 2 + i_25, (ImageObserver) null);
					if (this.anImage3588 == null) {
						this.anImage3588 = Class351.gameCanvas.createImage(this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16, 1149083423 * this.anInt3571 * 544546015);
					}
					Graphics graphics_26 = this.anImage3588.getGraphics();
					int i_27;
					for (i_27 = 0; i_27 < this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16; i_27 += i_19) {
						graphics_26.drawImage(this.anImage3577, i_27, 0, (ImageObserver) null);
					}
					for (i_27 = 0; i_27 < this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16; i_27 += i_21) {
						graphics_26.drawImage(this.anImage3578, i_27, this.anInt3571 * 544546015 * 1149083423 - i_18, (ImageObserver) null);
					}
					i_27 = (this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16) * i_33 / 100;
					int i_32;
					if (i_27 > 0) {
						Image image_28 = Class351.gameCanvas.createImage(i_27, 1149083423 * this.anInt3571 * 544546015 - i_20 - i_18);
						int i_29 = image_28.getWidth((ImageObserver) null);
						Graphics graphics_30 = image_28.getGraphics();
						int i_31 = this.anInt3593 * -1517908233 * -493710649 * Class509.method8740(-1290011940) / 10 % i_22;
						for (i_32 = i_31 - i_22; i_32 < i_29; i_32 += i_22) {
							graphics_30.drawImage(this.anImage3575, i_32, 0, (ImageObserver) null);
						}
						graphics_26.drawImage(image_28, 0, i_20, (ImageObserver) null);
					}
					int i_37 = i_27;
					i_27 = -1500311941 * this.anInt3587 * -1872715597 - i_14 - i_16 - i_27;
					if (i_27 > 0) {
						Image image_38 = Class351.gameCanvas.createImage(i_27, 1149083423 * this.anInt3571 * 544546015 - i_20 - i_18);
						int i_39 = image_38.getWidth((ImageObserver) null);
						Graphics graphics_40 = image_38.getGraphics();
						for (i_32 = 0; i_32 < i_39; i_32 += i_23) {
							graphics_40.drawImage(this.anImage3574, i_32, 0, (ImageObserver) null);
						}
						graphics_26.drawImage(image_38, i_37, i_20, (ImageObserver) null);
					}
					graphics_35.drawImage(this.anImage3588, i_24 + i_14, i_25, (ImageObserver) null);
					graphics_35.setFont(this.aFont3573);
					graphics_35.setColor(this.aColor3582);
					graphics_35.drawString(string_34, i_24 + (-1500311941 * this.anInt3587 * -1872715597 - this.aFontMetrics3570.stringWidth(string_34)) / 2, 4 + this.anInt3571 * 544546015 * 1149083423 / 2 + i_25 + -2097436733 * this.anInt3592 * -29425429);
					graphics_43.drawImage(OutputStream_Sub1.anImage7953, 0, 0, (ImageObserver) null);
				} catch (Exception exception_42) {
					this.aBool3572 = true;
				}
			} else {
				Class351.gameCanvas.repaint();
			}
		}
	}

	public void method187(boolean bool_1) {
		if (!this.aBool3572 && this.aFont3573 == null) {
			try {
				String[] arr_3 = MovingAnimation.method12681(client.aString7157, ',');
				if (arr_3.length != 23) {
					this.aBool3572 = true;
				}
				this.aBool3583 = Boolean.parseBoolean(arr_3[0]);
				this.aBool3584 = Boolean.parseBoolean(arr_3[1]);
				this.anInt3585 = Utils.parseInt(arr_3[2]);
				this.anInt3586 = Utils.parseInt(arr_3[3]);
				this.anInt3587 = Utils.parseInt(arr_3[4]);
				this.anInt3571 = Utils.parseInt(arr_3[5]);
				this.anInt3569 = Utils.parseInt(arr_3[6]);
				this.anInt3590 = Utils.parseInt(arr_3[7]);
				this.anInt3591 = Utils.parseInt(arr_3[8]);
				this.anInt3592 = Utils.parseInt(arr_3[9]);
				String string_4 = arr_3[10];
				int i_5 = Utils.parseInt(arr_3[11]);
				int i_6 = Class285.method5026(arr_3[12].substring(2), (byte) 113);
				this.aFont3573 = new Font(string_4, 0, i_5);
				this.aFontMetrics3570 = Class351.gameCanvas.getFontMetrics(this.aFont3573);
				this.aColor3582 = new Color(i_6);
				MediaTracker mediatracker_7 = new MediaTracker(Class351.gameCanvas);
				this.anImage3575 = this.method5399(arr_3[13]);
				mediatracker_7.addImage(this.anImage3575, 0);
				this.anImage3574 = this.method5399(arr_3[14]);
				mediatracker_7.addImage(this.anImage3574, 1);
				this.anImage3589 = this.method5399(arr_3[15]);
				mediatracker_7.addImage(this.anImage3589, 2);
				this.anImage3576 = this.method5399(arr_3[16]);
				mediatracker_7.addImage(this.anImage3576, 3);
				this.anImage3577 = this.method5399(arr_3[17]);
				mediatracker_7.addImage(this.anImage3577, 4);
				this.anImage3578 = this.method5399(arr_3[18]);
				mediatracker_7.addImage(this.anImage3578, 5);
				this.anImage3579 = this.method5399(arr_3[19]);
				mediatracker_7.addImage(this.anImage3579, 6);
				this.anImage3580 = this.method5399(arr_3[20]);
				mediatracker_7.addImage(this.anImage3580, 7);
				this.anImage3581 = this.method5399(arr_3[21]);
				mediatracker_7.addImage(this.anImage3581, 8);
				mediatracker_7.waitForAll();
				this.anInt3593 = Utils.parseInt(arr_3[22]);
			} catch (Exception exception_42) {
				this.aBool3572 = true;
			}
		}
		if (this.aBool3572) {
			this.method5398();
		} else {
			Graphics graphics_44 = Class351.gameCanvas.getGraphics();
			if (graphics_44 != null) {
				try {
					int i_34 = Comparable_Sub1.aClass306_3771.method5424((byte) 48);
					String string_35 = Comparable_Sub1.aClass306_3771.method5425(-2106602009);
					if (OutputStream_Sub1.anImage7953 == null) {
						OutputStream_Sub1.anImage7953 = Class351.gameCanvas.createImage(Class349.anInt4083, Engine.anInt3243 * -969250379);
					}
					Graphics graphics_36 = OutputStream_Sub1.anImage7953.getGraphics();
					graphics_36.setColor(Color.BLACK);
					graphics_36.fillRect(0, 0, Class349.anInt4083, Engine.anInt3243 * -969250379);
					int i_37 = this.anImage3579.getWidth((ImageObserver) null);
					int i_8 = this.anImage3580.getWidth((ImageObserver) null);
					int i_9 = this.anImage3581.getWidth((ImageObserver) null);
					int i_10 = this.anImage3579.getHeight((ImageObserver) null);
					int i_11 = this.anImage3580.getHeight((ImageObserver) null);
					int i_12 = this.anImage3581.getHeight((ImageObserver) null);
					graphics_36.drawImage(this.anImage3579, this.method5396(i_37, 1492729595) + this.anInt3569 - this.anInt3591 / 2, this.method5397(i_10, (byte) -50) + this.anInt3590, (ImageObserver) null);
					int i_13 = this.anInt3569 - this.anInt3591 / 2 + i_37;
					int i_14 = this.anInt3591 / 2 + this.anInt3569;
					int i_15;
					for (i_15 = i_13; i_15 <= i_14; i_15 += i_9) {
						graphics_36.drawImage(this.anImage3581, this.method5396(i_37, 1385814484) + this.anInt3569 + i_15, this.method5397(i_12, (byte) -13) + this.anInt3590, (ImageObserver) null);
					}
					graphics_36.drawImage(this.anImage3580, this.method5396(i_8, 1778616531) + this.anInt3569 + this.anInt3591 / 2, this.method5397(i_11, (byte) -6) + this.anInt3590, (ImageObserver) null);
					i_15 = this.anImage3589.getWidth((ImageObserver) null);
					int i_16 = this.anImage3589.getHeight((ImageObserver) null);
					int i_17 = this.anImage3576.getWidth((ImageObserver) null);
					int i_18 = this.anImage3576.getHeight((ImageObserver) null);
					int i_19 = this.anImage3578.getHeight((ImageObserver) null);
					int i_20 = this.anImage3577.getWidth((ImageObserver) null);
					int i_21 = this.anImage3577.getHeight((ImageObserver) null);
					int i_22 = this.anImage3578.getWidth((ImageObserver) null);
					int i_23 = this.anImage3575.getWidth((ImageObserver) null);
					int i_24 = this.anImage3574.getWidth((ImageObserver) null);
					int i_25 = this.method5396(this.anInt3587, 1977246179) + this.anInt3585;
					int i_26 = this.method5397(this.anInt3571, (byte) -119) + this.anInt3586;
					graphics_36.drawImage(this.anImage3589, i_25, i_26 + (this.anInt3571 - i_16) / 2, (ImageObserver) null);
					graphics_36.drawImage(this.anImage3576, i_25 + this.anInt3587 - i_17, i_26 + (this.anInt3571 - i_18) / 2, (ImageObserver) null);
					if (this.anImage3588 == null) {
						this.anImage3588 = Class351.gameCanvas.createImage(this.anInt3587 - i_15 - i_17, this.anInt3571);
					}
					Graphics graphics_27 = this.anImage3588.getGraphics();
					int i_28;
					for (i_28 = 0; i_28 < this.anInt3587 - i_15 - i_17; i_28 += i_20) {
						graphics_27.drawImage(this.anImage3577, i_28, 0, (ImageObserver) null);
					}
					for (i_28 = 0; i_28 < this.anInt3587 - i_15 - i_17; i_28 += i_22) {
						graphics_27.drawImage(this.anImage3578, i_28, this.anInt3571 - i_19, (ImageObserver) null);
					}
					i_28 = i_34 * (this.anInt3587 - i_15 - i_17) / 100;
					int i_33;
					if (i_28 > 0) {
						Image image_29 = Class351.gameCanvas.createImage(i_28, this.anInt3571 - i_21 - i_19);
						int i_30 = image_29.getWidth((ImageObserver) null);
						Graphics graphics_31 = image_29.getGraphics();
						int i_32 = this.anInt3593 * Class509.method8740(-1387759931) / 10 % i_23;
						for (i_33 = i_32 - i_23; i_33 < i_30; i_33 += i_23) {
							graphics_31.drawImage(this.anImage3575, i_33, 0, (ImageObserver) null);
						}
						graphics_27.drawImage(image_29, 0, i_21, (ImageObserver) null);
					}
					int i_38 = i_28;
					i_28 = this.anInt3587 - i_15 - i_17 - i_28;
					if (i_28 > 0) {
						Image image_39 = Class351.gameCanvas.createImage(i_28, this.anInt3571 - i_21 - i_19);
						int i_40 = image_39.getWidth((ImageObserver) null);
						Graphics graphics_41 = image_39.getGraphics();
						for (i_33 = 0; i_33 < i_40; i_33 += i_24) {
							graphics_41.drawImage(this.anImage3574, i_33, 0, (ImageObserver) null);
						}
						graphics_27.drawImage(image_39, i_38, i_21, (ImageObserver) null);
					}
					graphics_36.drawImage(this.anImage3588, i_25 + i_15, i_26, (ImageObserver) null);
					graphics_36.setFont(this.aFont3573);
					graphics_36.setColor(this.aColor3582);
					graphics_36.drawString(string_35, i_25 + (this.anInt3587 - this.aFontMetrics3570.stringWidth(string_35)) / 2, this.anInt3571 / 2 + i_26 + this.anInt3592 + 4);
					graphics_44.drawImage(OutputStream_Sub1.anImage7953, 0, 0, (ImageObserver) null);
				} catch (Exception exception_43) {
					this.aBool3572 = true;
				}
			} else {
				Class351.gameCanvas.repaint();
			}
		}
	}

	public void method194(boolean bool_1) {
		if (!this.aBool3572 && this.aFont3573 == null) {
			try {
				String[] arr_2 = MovingAnimation.method12681(client.aString7157, ',');
				if (arr_2.length != 23) {
					this.aBool3572 = true;
				}
				this.aBool3583 = Boolean.parseBoolean(arr_2[0]);
				this.aBool3584 = Boolean.parseBoolean(arr_2[1]);
				this.anInt3585 = Utils.parseInt(arr_2[2]) * -1241431707 * 956041325;
				this.anInt3586 = Utils.parseInt(arr_2[3]) * 1545138689 * -1599402495;
				this.anInt3587 = Utils.parseInt(arr_2[4]) * -1872715597 * -1500311941;
				this.anInt3571 = Utils.parseInt(arr_2[5]) * 544546015 * 1149083423;
				this.anInt3569 = Utils.parseInt(arr_2[6]) * -850535471 * 215899441;
				this.anInt3590 = Utils.parseInt(arr_2[7]) * -537340309 * -1591466429;
				this.anInt3591 = Utils.parseInt(arr_2[8]) * 1020096939 * -1703804669;
				this.anInt3592 = Utils.parseInt(arr_2[9]) * -29425429 * -2097436733;
				String string_3 = arr_2[10];
				int i_4 = Utils.parseInt(arr_2[11]);
				int i_5 = Class285.method5026(arr_2[12].substring(2), (byte) 87);
				this.aFont3573 = new Font(string_3, 0, i_4);
				this.aFontMetrics3570 = Class351.gameCanvas.getFontMetrics(this.aFont3573);
				this.aColor3582 = new Color(i_5);
				MediaTracker mediatracker_6 = new MediaTracker(Class351.gameCanvas);
				this.anImage3575 = this.method5399(arr_2[13]);
				mediatracker_6.addImage(this.anImage3575, 0);
				this.anImage3574 = this.method5399(arr_2[14]);
				mediatracker_6.addImage(this.anImage3574, 1);
				this.anImage3589 = this.method5399(arr_2[15]);
				mediatracker_6.addImage(this.anImage3589, 2);
				this.anImage3576 = this.method5399(arr_2[16]);
				mediatracker_6.addImage(this.anImage3576, 3);
				this.anImage3577 = this.method5399(arr_2[17]);
				mediatracker_6.addImage(this.anImage3577, 4);
				this.anImage3578 = this.method5399(arr_2[18]);
				mediatracker_6.addImage(this.anImage3578, 5);
				this.anImage3579 = this.method5399(arr_2[19]);
				mediatracker_6.addImage(this.anImage3579, 6);
				this.anImage3580 = this.method5399(arr_2[20]);
				mediatracker_6.addImage(this.anImage3580, 7);
				this.anImage3581 = this.method5399(arr_2[21]);
				mediatracker_6.addImage(this.anImage3581, 8);
				mediatracker_6.waitForAll();
				this.anInt3593 = Utils.parseInt(arr_2[22]) * -1517908233 * -493710649;
			} catch (Exception exception_41) {
				this.aBool3572 = true;
			}
		}
		if (this.aBool3572) {
			this.method5398();
		} else {
			Graphics graphics_43 = Class351.gameCanvas.getGraphics();
			if (graphics_43 != null) {
				try {
					int i_33 = Comparable_Sub1.aClass306_3771.method5424((byte) 110);
					String string_34 = Comparable_Sub1.aClass306_3771.method5425(-1434118755);
					if (OutputStream_Sub1.anImage7953 == null) {
						OutputStream_Sub1.anImage7953 = Class351.gameCanvas.createImage(-418109423 * Class349.anInt4083 * 1426041429 * 765 * -1943418639, Engine.anInt3243 * -969250379 * -1929118563 * -969250379);
					}
					Graphics graphics_35 = OutputStream_Sub1.anImage7953.getGraphics();
					graphics_35.setColor(Color.BLACK);
					graphics_35.fillRect(0, 0, -418109423 * Class349.anInt4083 * 1426041429 * 765 * -1943418639, -969250379 * Engine.anInt3243 * -969250379 * -1929118563);
					int i_36 = this.anImage3579.getWidth((ImageObserver) null);
					int i_7 = this.anImage3580.getWidth((ImageObserver) null);
					int i_8 = this.anImage3581.getWidth((ImageObserver) null);
					int i_9 = this.anImage3579.getHeight((ImageObserver) null);
					int i_10 = this.anImage3580.getHeight((ImageObserver) null);
					int i_11 = this.anImage3581.getHeight((ImageObserver) null);
					graphics_35.drawImage(this.anImage3579, this.method5396(i_36, 1593940832) + 215899441 * this.anInt3569 * -850535471 - -1703804669 * this.anInt3591 * 1020096939 / 2, this.method5397(i_9, (byte) -109) + -1591466429 * this.anInt3590 * -537340309, (ImageObserver) null);
					int i_12 = 215899441 * this.anInt3569 * -850535471 - this.anInt3591 * 1020096939 * -1703804669 / 2 + i_36;
					int i_13 = this.anInt3569 * -850535471 * 215899441 + this.anInt3591 * 1020096939 * -1703804669 / 2;
					int i_14;
					for (i_14 = i_12; i_14 <= i_13; i_14 += i_8) {
						graphics_35.drawImage(this.anImage3581, this.method5396(i_36, 508141666) + this.anInt3569 * -850535471 * 215899441 + i_14, this.method5397(i_11, (byte) -75) + this.anInt3590 * -537340309 * -1591466429, (ImageObserver) null);
					}
					graphics_35.drawImage(this.anImage3580, this.method5396(i_7, 982311242) + this.anInt3569 * -850535471 * 215899441 + -1703804669 * this.anInt3591 * 1020096939 / 2, this.method5397(i_10, (byte) -88) + -1591466429 * this.anInt3590 * -537340309, (ImageObserver) null);
					i_14 = this.anImage3589.getWidth((ImageObserver) null);
					int i_15 = this.anImage3589.getHeight((ImageObserver) null);
					int i_16 = this.anImage3576.getWidth((ImageObserver) null);
					int i_17 = this.anImage3576.getHeight((ImageObserver) null);
					int i_18 = this.anImage3578.getHeight((ImageObserver) null);
					int i_19 = this.anImage3577.getWidth((ImageObserver) null);
					int i_20 = this.anImage3577.getHeight((ImageObserver) null);
					int i_21 = this.anImage3578.getWidth((ImageObserver) null);
					int i_22 = this.anImage3575.getWidth((ImageObserver) null);
					int i_23 = this.anImage3574.getWidth((ImageObserver) null);
					int i_24 = this.method5396(this.anInt3587 * -1872715597 * -1500311941, 2110547678) + 956041325 * this.anInt3585 * -1241431707;
					int i_25 = this.method5397(1149083423 * this.anInt3571 * 544546015, (byte) -15) + this.anInt3586 * 1545138689 * -1599402495;
					graphics_35.drawImage(this.anImage3589, i_24, (1149083423 * this.anInt3571 * 544546015 - i_15) / 2 + i_25, (ImageObserver) null);
					graphics_35.drawImage(this.anImage3576, i_24 + -1500311941 * this.anInt3587 * -1872715597 - i_16, (1149083423 * this.anInt3571 * 544546015 - i_17) / 2 + i_25, (ImageObserver) null);
					if (this.anImage3588 == null) {
						this.anImage3588 = Class351.gameCanvas.createImage(this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16, 1149083423 * this.anInt3571 * 544546015);
					}
					Graphics graphics_26 = this.anImage3588.getGraphics();
					int i_27;
					for (i_27 = 0; i_27 < this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16; i_27 += i_19) {
						graphics_26.drawImage(this.anImage3577, i_27, 0, (ImageObserver) null);
					}
					for (i_27 = 0; i_27 < this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16; i_27 += i_21) {
						graphics_26.drawImage(this.anImage3578, i_27, this.anInt3571 * 544546015 * 1149083423 - i_18, (ImageObserver) null);
					}
					i_27 = (this.anInt3587 * -1872715597 * -1500311941 - i_14 - i_16) * i_33 / 100;
					int i_32;
					if (i_27 > 0) {
						Image image_28 = Class351.gameCanvas.createImage(i_27, 1149083423 * this.anInt3571 * 544546015 - i_20 - i_18);
						int i_29 = image_28.getWidth((ImageObserver) null);
						Graphics graphics_30 = image_28.getGraphics();
						int i_31 = this.anInt3593 * -1517908233 * -493710649 * Class509.method8740(-1010766912) / 10 % i_22;
						for (i_32 = i_31 - i_22; i_32 < i_29; i_32 += i_22) {
							graphics_30.drawImage(this.anImage3575, i_32, 0, (ImageObserver) null);
						}
						graphics_26.drawImage(image_28, 0, i_20, (ImageObserver) null);
					}
					int i_37 = i_27;
					i_27 = -1500311941 * this.anInt3587 * -1872715597 - i_14 - i_16 - i_27;
					if (i_27 > 0) {
						Image image_38 = Class351.gameCanvas.createImage(i_27, 1149083423 * this.anInt3571 * 544546015 - i_20 - i_18);
						int i_39 = image_38.getWidth((ImageObserver) null);
						Graphics graphics_40 = image_38.getGraphics();
						for (i_32 = 0; i_32 < i_39; i_32 += i_23) {
							graphics_40.drawImage(this.anImage3574, i_32, 0, (ImageObserver) null);
						}
						graphics_26.drawImage(image_38, i_37, i_20, (ImageObserver) null);
					}
					graphics_35.drawImage(this.anImage3588, i_24 + i_14, i_25, (ImageObserver) null);
					graphics_35.setFont(this.aFont3573);
					graphics_35.setColor(this.aColor3582);
					graphics_35.drawString(string_34, i_24 + (-1500311941 * this.anInt3587 * -1872715597 - this.aFontMetrics3570.stringWidth(string_34)) / 2, 4 + this.anInt3571 * 544546015 * 1149083423 / 2 + i_25 + -2097436733 * this.anInt3592 * -29425429);
					graphics_43.drawImage(OutputStream_Sub1.anImage7953, 0, 0, (ImageObserver) null);
				} catch (Exception exception_42) {
					this.aBool3572 = true;
				}
			} else {
				Class351.gameCanvas.repaint();
			}
		}
	}

	public void method157() {
		Class362.method6276();
	}

	public void method159() {
	}

	public int method197() {
		return 100;
	}

	public int method196() {
		return 100;
	}

	public int method198() {
		return 100;
	}

	public boolean method193(long long_1) {
		return true;
	}

	public void method158() {
	}

	public int method72() {
		return 0;
	}

	static String method5407(int i_0, Language xlanguage_1) {
		return i_0 < 100000 ? "<col=ffff00>" + i_0 + "</col>" : (i_0 < 10000000 ? "<col=ffffff>" + i_0 / 1000 + Message.aClass433_5297.translate(xlanguage_1) + "</col>" : "<col=00ff80>" + i_0 / 1000000 + Message.aClass433_5304.translate(xlanguage_1) + "</col>");
	}

	public static void setUseOptionFlags(IComponentDefinitions componentDefs, int flags, int interfaceId, byte b_3) {
		if (componentDefs != null) {
			if (componentDefs.anObjectArray1400 != null) {
				HookRequest hookrequest_4 = new HookRequest();
				hookrequest_4.source = componentDefs;
				hookrequest_4.params = componentDefs.anObjectArray1400;
				CS2Executor.executeHookInner200k(hookrequest_4, 1699733120);
			}
			client.aBool7344 = true;
			Class7.anInt56 = componentDefs.idHash;
			client.anInt7345 = componentDefs.anInt1288;
			Class506.USE_OPTIONS_FLAGS = flags;
			CutsceneAction_Sub12.USE_INTERFACE_ID = interfaceId;
			client.anInt7346 = componentDefs.anInt1426;
			Defaults8Loader.anInt5932 = componentDefs.anInt1307;
			client.anInt7427 = componentDefs.anInt1310;
			Class109.redrawComponent(componentDefs);
		}
	}

	public static int[][] method5410(int i_2, int i_8) {
		int[][] ints_9 = new int[256][64];
		Node_Sub20_Sub4 class282_sub20_sub4_10 = new Node_Sub20_Sub4();
		class282_sub20_sub4_10.aBool9726 = false;
		class282_sub20_sub4_10.anInt9725 = 4;
		class282_sub20_sub4_10.anInt9735 = 4;
		class282_sub20_sub4_10.anInt9736 = 3;
		class282_sub20_sub4_10.anInt9737 = (int) (4096.0F * (float) 0.4);
		class282_sub20_sub4_10.method12321(1816098804);
		Class316.method5593(64, 256, 85508155);
		for (int i_11 = 0; i_11 < 256; i_11++) {
			class282_sub20_sub4_10.method15197(i_11, ints_9[i_11]);
		}
		return ints_9;
	}
}
