
/* Class304 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;

public class Class304 implements Interface27 {
	int anInt3569;
	FontMetrics aFontMetrics3570;
	int anInt3571;
	boolean aBool3572;
	Font aFont3573;
	Image anImage3574;
	Image anImage3575;
	Image anImage3576;
	Image anImage3577;
	Image anImage3578;
	Image anImage3579;
	Image anImage3580;
	Image anImage3581;
	Color aColor3582;
	boolean aBool3583;
	boolean aBool3584;
	int anInt3585;
	int anInt3586;
	int anInt3587;
	Image anImage3588;
	Image anImage3589;
	int anInt3590;
	int anInt3591;
	int anInt3592;
	int anInt3593;

	Image method5395(String string) throws IOException {
		Image image;
		try {
			InputStream inputstream = Class282_Sub44.anApplet8065.getClass().getClassLoader().getResourceAsStream(string);
			byte[] is = new byte[4000];
			int i = 0;
			int i_0_;
			while ((i_0_ = inputstream.read()) != -1)
				is[i++] = (byte) i_0_;
			Image image_1_ = Toolkit.getDefaultToolkit().createImage(is);
			image = image_1_;
		} catch (Exception exception) {
			throw new IOException();
		}
		return image;
	}

	final int method5396(int i, int i_2_) {
		if (((Class304) this).aBool3583)
			return (Class349.anInt4083 * -418109423 - i) / 2;
		return 0;
	}

	final int method5397(int i, byte i_3_) {
		if (((Class304) this).aBool3584)
			return (Class263.anInt3243 * -969250379 - i) / 2;
		return 0;
	}

	public void method188(byte i) {
		Class362.method6276(-1874192750);
	}

	public void method186() {
		Class362.method6276(-1874192750);
	}

	void method5398(byte i) {
		Class158_Sub1_Sub2.method15535(Class328.aClass306_3771.method5424((byte) 89), Class328.aClass306_3771.method5425(-1675493228), client.aColorArray7186[client.anInt7447 * 1920182969], client.aColorArray7199[1920182969 * client.anInt7447], client.aColorArray7200[client.anInt7447 * 1920182969], -25955957);
	}

	Image method5399(String string, byte i) throws IOException {
		Image image;
		try {
			InputStream inputstream = Class282_Sub44.anApplet8065.getClass().getClassLoader().getResourceAsStream(string);
			byte[] is = new byte[4000];
			int i_4_ = 0;
			int i_5_;
			while ((i_5_ = inputstream.read()) != -1)
				is[i_4_++] = (byte) i_5_;
			Image image_6_ = Toolkit.getDefaultToolkit().createImage(is);
			image = image_6_;
		} catch (Exception exception) {
			throw new IOException();
		}
		return image;
	}

	public void method161(int i) {
		/* empty */
	}

	public int method191(int i) {
		return 100;
	}

	public boolean method189(long l) {
		return true;
	}

	public int method190(int i) {
		return 0;
	}

	final int method5400(int i) {
		if (((Class304) this).aBool3583)
			return (Class349.anInt4083 * -418109423 - i) / 2;
		return 0;
	}

	final int method5401(int i) {
		if (((Class304) this).aBool3583)
			return (Class349.anInt4083 * -418109423 - i) / 2;
		return 0;
	}

	final int method5402(int i) {
		if (((Class304) this).aBool3583)
			return (Class349.anInt4083 * -418109423 - i) / 2;
		return 0;
	}

	public void method195() {
		/* empty */
	}

	public void method192(boolean bool) {
		if (!((Class304) this).aBool3572 && ((Class304) this).aFont3573 == null) {
			try {
				String[] strings = Class456_Sub3.method12681(client.aString7157, ',', 229848533);
				if (23 != strings.length)
					((Class304) this).aBool3572 = true;
				((Class304) this).aBool3583 = Boolean.parseBoolean(strings[0]);
				((Class304) this).aBool3584 = Boolean.parseBoolean(strings[1]);
				((Class304) this).anInt3585 = (Class328.method5830(strings[2], -2030396621) * -1241431707);
				((Class304) this).anInt3586 = Class328.method5830(strings[3], 974172112) * 1545138689;
				((Class304) this).anInt3587 = Class328.method5830(strings[4], 591996672) * -1872715597;
				((Class304) this).anInt3571 = Class328.method5830(strings[5], -1261326942) * 544546015;
				((Class304) this).anInt3569 = (Class328.method5830(strings[6], -1478060576) * -850535471);
				((Class304) this).anInt3590 = Class328.method5830(strings[7], 815852619) * -537340309;
				((Class304) this).anInt3591 = (Class328.method5830(strings[8], -1480568222) * 1020096939);
				((Class304) this).anInt3592 = Class328.method5830(strings[9], -1007765739) * -29425429;
				String string = strings[10];
				int i = Class328.method5830(strings[11], -2144581898);
				int i_7_ = Class285.method5026(strings[12].substring(2), 16, (byte) -78);
				((Class304) this).aFont3573 = new Font(string, 0, i);
				((Class304) this).aFontMetrics3570 = Class351.aCanvas4096.getFontMetrics(((Class304) this).aFont3573);
				((Class304) this).aColor3582 = new Color(i_7_);
				MediaTracker mediatracker = new MediaTracker(Class351.aCanvas4096);
				((Class304) this).anImage3575 = method5399(strings[13], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3575, 0);
				((Class304) this).anImage3574 = method5399(strings[14], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3574, 1);
				((Class304) this).anImage3589 = method5399(strings[15], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3589, 2);
				((Class304) this).anImage3576 = method5399(strings[16], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3576, 3);
				((Class304) this).anImage3577 = method5399(strings[17], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3577, 4);
				((Class304) this).anImage3578 = method5399(strings[18], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3578, 5);
				((Class304) this).anImage3579 = method5399(strings[19], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3579, 6);
				((Class304) this).anImage3580 = method5399(strings[20], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3580, 7);
				((Class304) this).anImage3581 = method5399(strings[21], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3581, 8);
				mediatracker.waitForAll();
				((Class304) this).anInt3593 = (Class328.method5830(strings[22], -949578085) * -1517908233);
			} catch (Exception exception) {
				((Class304) this).aBool3572 = true;
			}
		}
		if (((Class304) this).aBool3572)
			method5398((byte) 0);
		else {
			Graphics graphics = Class351.aCanvas4096.getGraphics();
			if (graphics != null) {
				try {
					int i = Class328.aClass306_3771.method5424((byte) 94);
					String string = Class328.aClass306_3771.method5425(-620954186);
					if (OutputStream_Sub1.anImage7953 == null)
						OutputStream_Sub1.anImage7953 = (Class351.aCanvas4096.createImage(-418109423 * Class349.anInt4083, Class263.anInt3243 * -969250379));
					Graphics graphics_8_ = OutputStream_Sub1.anImage7953.getGraphics();
					graphics_8_.setColor(Color.BLACK);
					graphics_8_.fillRect(0, 0, -418109423 * Class349.anInt4083, -969250379 * Class263.anInt3243);
					int i_9_ = ((Class304) this).anImage3579.getWidth(null);
					int i_10_ = ((Class304) this).anImage3580.getWidth(null);
					int i_11_ = ((Class304) this).anImage3581.getWidth(null);
					int i_12_ = ((Class304) this).anImage3579.getHeight(null);
					int i_13_ = ((Class304) this).anImage3580.getHeight(null);
					int i_14_ = ((Class304) this).anImage3581.getHeight(null);
					graphics_8_.drawImage(((Class304) this).anImage3579, (method5396(i_9_, 1666375263) + 215899441 * ((Class304) this).anInt3569 - -1703804669 * ((Class304) this).anInt3591 / 2), (method5397(i_12_, (byte) -26) + -1591466429 * ((Class304) this).anInt3590), null);
					int i_15_ = (215899441 * ((Class304) this).anInt3569 - ((Class304) this).anInt3591 * -1703804669 / 2 + i_9_);
					int i_16_ = (((Class304) this).anInt3569 * 215899441 + ((Class304) this).anInt3591 * -1703804669 / 2);
					for (int i_17_ = i_15_; i_17_ <= i_16_; i_17_ += i_11_)
						graphics_8_.drawImage(((Class304) this).anImage3581, (method5396(i_9_, 218736010) + (((Class304) this).anInt3569 * 215899441) + i_17_), (method5397(i_14_, (byte) -4) + (((Class304) this).anInt3590 * -1591466429)), null);
					graphics_8_.drawImage(((Class304) this).anImage3580, (method5396(i_10_, 1483047424) + ((Class304) this).anInt3569 * 215899441 + -1703804669 * ((Class304) this).anInt3591 / 2), (method5397(i_13_, (byte) -84) + -1591466429 * ((Class304) this).anInt3590), null);
					int i_18_ = ((Class304) this).anImage3589.getWidth(null);
					int i_19_ = ((Class304) this).anImage3589.getHeight(null);
					int i_20_ = ((Class304) this).anImage3576.getWidth(null);
					int i_21_ = ((Class304) this).anImage3576.getHeight(null);
					int i_22_ = ((Class304) this).anImage3578.getHeight(null);
					int i_23_ = ((Class304) this).anImage3577.getWidth(null);
					int i_24_ = ((Class304) this).anImage3577.getHeight(null);
					int i_25_ = ((Class304) this).anImage3578.getWidth(null);
					int i_26_ = ((Class304) this).anImage3575.getWidth(null);
					int i_27_ = ((Class304) this).anImage3574.getWidth(null);
					int i_28_ = (method5396((((Class304) this).anInt3587 * -1500311941), 743094848) + 956041325 * ((Class304) this).anInt3585);
					int i_29_ = (method5397(1149083423 * ((Class304) this).anInt3571, (byte) -55) + ((Class304) this).anInt3586 * -1599402495);
					graphics_8_.drawImage(((Class304) this).anImage3589, i_28_, ((1149083423 * ((Class304) this).anInt3571) - i_19_) / 2 + i_29_, null);
					graphics_8_.drawImage(((Class304) this).anImage3576, (i_28_ + (-1500311941 * ((Class304) this).anInt3587) - i_20_), ((1149083423 * ((Class304) this).anInt3571) - i_21_) / 2 + i_29_, null);
					if (((Class304) this).anImage3588 == null)
						((Class304) this).anImage3588 = (Class351.aCanvas4096.createImage((((Class304) this).anInt3587 * -1500311941 - i_18_ - i_20_), 1149083423 * ((Class304) this).anInt3571));
					Graphics graphics_30_ = ((Class304) this).anImage3588.getGraphics();
					for (int i_31_ = 0; i_31_ < (((Class304) this).anInt3587 * -1500311941 - i_18_ - i_20_); i_31_ += i_23_)
						graphics_30_.drawImage(((Class304) this).anImage3577, i_31_, 0, null);
					for (int i_32_ = 0; i_32_ < (((Class304) this).anInt3587 * -1500311941 - i_18_ - i_20_); i_32_ += i_25_)
						graphics_30_.drawImage(((Class304) this).anImage3578, i_32_, (((Class304) this).anInt3571 * 1149083423) - i_22_, null);
					int i_33_ = ((((Class304) this).anInt3587 * -1500311941 - i_18_ - i_20_) * i / 100);
					if (i_33_ > 0) {
						Image image = (Class351.aCanvas4096.createImage(i_33_, (1149083423 * ((Class304) this).anInt3571 - i_24_ - i_22_)));
						int i_34_ = image.getWidth(null);
						Graphics graphics_35_ = image.getGraphics();
						int i_36_ = (((Class304) this).anInt3593 * -493710649 * Class509.method8740(-1334135782) / 10 % i_26_);
						for (int i_37_ = i_36_ - i_26_; i_37_ < i_34_; i_37_ += i_26_)
							graphics_35_.drawImage((((Class304) this).anImage3575), i_37_, 0, null);
						graphics_30_.drawImage(image, 0, i_24_, null);
					}
					int i_38_ = i_33_;
					i_33_ = (-1500311941 * ((Class304) this).anInt3587 - i_18_ - i_20_ - i_33_);
					if (i_33_ > 0) {
						Image image = (Class351.aCanvas4096.createImage(i_33_, (1149083423 * ((Class304) this).anInt3571 - i_24_ - i_22_)));
						int i_39_ = image.getWidth(null);
						Graphics graphics_40_ = image.getGraphics();
						for (int i_41_ = 0; i_41_ < i_39_; i_41_ += i_27_)
							graphics_40_.drawImage((((Class304) this).anImage3574), i_41_, 0, null);
						graphics_30_.drawImage(image, i_38_, i_24_, null);
					}
					graphics_8_.drawImage(((Class304) this).anImage3588, i_28_ + i_18_, i_29_, null);
					graphics_8_.setFont(((Class304) this).aFont3573);
					graphics_8_.setColor(((Class304) this).aColor3582);
					graphics_8_.drawString(string, i_28_ + (-1500311941 * ((Class304) this).anInt3587 - ((Class304) this).aFontMetrics3570.stringWidth(string)) / 2, (4 + (((Class304) this).anInt3571 * 1149083423 / 2 + i_29_) + -2097436733 * ((Class304) this).anInt3592));
					graphics.drawImage(OutputStream_Sub1.anImage7953, 0, 0, null);
				} catch (Exception exception) {
					((Class304) this).aBool3572 = true;
				}
			} else
				Class351.aCanvas4096.repaint();
		}
	}

	public int method71() {
		return 0;
	}

	Class304() {
		/* empty */
	}

	public void x(boolean bool) {
		if (!((Class304) this).aBool3572 && ((Class304) this).aFont3573 == null) {
			try {
				String[] strings = Class456_Sub3.method12681(client.aString7157, ',', 229848533);
				if (23 != strings.length)
					((Class304) this).aBool3572 = true;
				((Class304) this).aBool3583 = Boolean.parseBoolean(strings[0]);
				((Class304) this).aBool3584 = Boolean.parseBoolean(strings[1]);
				((Class304) this).anInt3585 = (Class328.method5830(strings[2], -346568032) * -1241431707);
				((Class304) this).anInt3586 = (Class328.method5830(strings[3], -1703440249) * 1545138689);
				((Class304) this).anInt3587 = (Class328.method5830(strings[4], -2144517952) * -1872715597);
				((Class304) this).anInt3571 = Class328.method5830(strings[5], -665574879) * 544546015;
				((Class304) this).anInt3569 = Class328.method5830(strings[6], -867673357) * -850535471;
				((Class304) this).anInt3590 = Class328.method5830(strings[7], 1101144441) * -537340309;
				((Class304) this).anInt3591 = Class328.method5830(strings[8], 1548892014) * 1020096939;
				((Class304) this).anInt3592 = Class328.method5830(strings[9], -971832079) * -29425429;
				String string = strings[10];
				int i = Class328.method5830(strings[11], -716552025);
				int i_42_ = Class285.method5026(strings[12].substring(2), 16, (byte) -48);
				((Class304) this).aFont3573 = new Font(string, 0, i);
				((Class304) this).aFontMetrics3570 = Class351.aCanvas4096.getFontMetrics(((Class304) this).aFont3573);
				((Class304) this).aColor3582 = new Color(i_42_);
				MediaTracker mediatracker = new MediaTracker(Class351.aCanvas4096);
				((Class304) this).anImage3575 = method5399(strings[13], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3575, 0);
				((Class304) this).anImage3574 = method5399(strings[14], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3574, 1);
				((Class304) this).anImage3589 = method5399(strings[15], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3589, 2);
				((Class304) this).anImage3576 = method5399(strings[16], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3576, 3);
				((Class304) this).anImage3577 = method5399(strings[17], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3577, 4);
				((Class304) this).anImage3578 = method5399(strings[18], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3578, 5);
				((Class304) this).anImage3579 = method5399(strings[19], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3579, 6);
				((Class304) this).anImage3580 = method5399(strings[20], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3580, 7);
				((Class304) this).anImage3581 = method5399(strings[21], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3581, 8);
				mediatracker.waitForAll();
				((Class304) this).anInt3593 = (Class328.method5830(strings[22], -60073066) * -1517908233);
			} catch (Exception exception) {
				((Class304) this).aBool3572 = true;
			}
		}
		if (((Class304) this).aBool3572)
			method5398((byte) 0);
		else {
			Graphics graphics = Class351.aCanvas4096.getGraphics();
			if (graphics != null) {
				try {
					int i = Class328.aClass306_3771.method5424((byte) 101);
					String string = Class328.aClass306_3771.method5425(1371688477);
					if (OutputStream_Sub1.anImage7953 == null)
						OutputStream_Sub1.anImage7953 = (Class351.aCanvas4096.createImage(-418109423 * Class349.anInt4083, Class263.anInt3243 * -969250379));
					Graphics graphics_43_ = OutputStream_Sub1.anImage7953.getGraphics();
					graphics_43_.setColor(Color.BLACK);
					graphics_43_.fillRect(0, 0, -418109423 * Class349.anInt4083, -969250379 * Class263.anInt3243);
					int i_44_ = ((Class304) this).anImage3579.getWidth(null);
					int i_45_ = ((Class304) this).anImage3580.getWidth(null);
					int i_46_ = ((Class304) this).anImage3581.getWidth(null);
					int i_47_ = ((Class304) this).anImage3579.getHeight(null);
					int i_48_ = ((Class304) this).anImage3580.getHeight(null);
					int i_49_ = ((Class304) this).anImage3581.getHeight(null);
					graphics_43_.drawImage(((Class304) this).anImage3579, (method5396(i_44_, 1817688403) + 215899441 * ((Class304) this).anInt3569 - -1703804669 * ((Class304) this).anInt3591 / 2), (method5397(i_47_, (byte) -80) + -1591466429 * ((Class304) this).anInt3590), null);
					int i_50_ = (215899441 * ((Class304) this).anInt3569 - ((Class304) this).anInt3591 * -1703804669 / 2 + i_44_);
					int i_51_ = (((Class304) this).anInt3569 * 215899441 + ((Class304) this).anInt3591 * -1703804669 / 2);
					for (int i_52_ = i_50_; i_52_ <= i_51_; i_52_ += i_46_)
						graphics_43_.drawImage(((Class304) this).anImage3581, (method5396(i_44_, 1293096957) + (((Class304) this).anInt3569 * 215899441) + i_52_), (method5397(i_49_, (byte) -29) + (((Class304) this).anInt3590 * -1591466429)), null);
					graphics_43_.drawImage(((Class304) this).anImage3580, (method5396(i_45_, 528245338) + ((Class304) this).anInt3569 * 215899441 + -1703804669 * ((Class304) this).anInt3591 / 2), (method5397(i_48_, (byte) -81) + -1591466429 * ((Class304) this).anInt3590), null);
					int i_53_ = ((Class304) this).anImage3589.getWidth(null);
					int i_54_ = ((Class304) this).anImage3589.getHeight(null);
					int i_55_ = ((Class304) this).anImage3576.getWidth(null);
					int i_56_ = ((Class304) this).anImage3576.getHeight(null);
					int i_57_ = ((Class304) this).anImage3578.getHeight(null);
					int i_58_ = ((Class304) this).anImage3577.getWidth(null);
					int i_59_ = ((Class304) this).anImage3577.getHeight(null);
					int i_60_ = ((Class304) this).anImage3578.getWidth(null);
					int i_61_ = ((Class304) this).anImage3575.getWidth(null);
					int i_62_ = ((Class304) this).anImage3574.getWidth(null);
					int i_63_ = (method5396((((Class304) this).anInt3587 * -1500311941), 415756976) + 956041325 * ((Class304) this).anInt3585);
					int i_64_ = (method5397(1149083423 * ((Class304) this).anInt3571, (byte) -44) + ((Class304) this).anInt3586 * -1599402495);
					graphics_43_.drawImage(((Class304) this).anImage3589, i_63_, ((1149083423 * ((Class304) this).anInt3571) - i_54_) / 2 + i_64_, null);
					graphics_43_.drawImage(((Class304) this).anImage3576, (i_63_ + (-1500311941 * ((Class304) this).anInt3587) - i_55_), ((1149083423 * ((Class304) this).anInt3571) - i_56_) / 2 + i_64_, null);
					if (((Class304) this).anImage3588 == null)
						((Class304) this).anImage3588 = (Class351.aCanvas4096.createImage((((Class304) this).anInt3587 * -1500311941 - i_53_ - i_55_), 1149083423 * ((Class304) this).anInt3571));
					Graphics graphics_65_ = ((Class304) this).anImage3588.getGraphics();
					for (int i_66_ = 0; i_66_ < (((Class304) this).anInt3587 * -1500311941 - i_53_ - i_55_); i_66_ += i_58_)
						graphics_65_.drawImage(((Class304) this).anImage3577, i_66_, 0, null);
					for (int i_67_ = 0; i_67_ < (((Class304) this).anInt3587 * -1500311941 - i_53_ - i_55_); i_67_ += i_60_)
						graphics_65_.drawImage(((Class304) this).anImage3578, i_67_, (((Class304) this).anInt3571 * 1149083423) - i_57_, null);
					int i_68_ = ((((Class304) this).anInt3587 * -1500311941 - i_53_ - i_55_) * i / 100);
					if (i_68_ > 0) {
						Image image = (Class351.aCanvas4096.createImage(i_68_, (1149083423 * ((Class304) this).anInt3571 - i_59_ - i_57_)));
						int i_69_ = image.getWidth(null);
						Graphics graphics_70_ = image.getGraphics();
						int i_71_ = (((Class304) this).anInt3593 * -493710649 * Class509.method8740(-1290011940) / 10 % i_61_);
						for (int i_72_ = i_71_ - i_61_; i_72_ < i_69_; i_72_ += i_61_)
							graphics_70_.drawImage((((Class304) this).anImage3575), i_72_, 0, null);
						graphics_65_.drawImage(image, 0, i_59_, null);
					}
					int i_73_ = i_68_;
					i_68_ = (-1500311941 * ((Class304) this).anInt3587 - i_53_ - i_55_ - i_68_);
					if (i_68_ > 0) {
						Image image = (Class351.aCanvas4096.createImage(i_68_, (1149083423 * ((Class304) this).anInt3571 - i_59_ - i_57_)));
						int i_74_ = image.getWidth(null);
						Graphics graphics_75_ = image.getGraphics();
						for (int i_76_ = 0; i_76_ < i_74_; i_76_ += i_62_)
							graphics_75_.drawImage((((Class304) this).anImage3574), i_76_, 0, null);
						graphics_65_.drawImage(image, i_73_, i_59_, null);
					}
					graphics_43_.drawImage(((Class304) this).anImage3588, i_63_ + i_53_, i_64_, null);
					graphics_43_.setFont(((Class304) this).aFont3573);
					graphics_43_.setColor(((Class304) this).aColor3582);
					graphics_43_.drawString(string, i_63_ + (-1500311941 * ((Class304) this).anInt3587 - ((Class304) this).aFontMetrics3570.stringWidth(string)) / 2, (4 + (((Class304) this).anInt3571 * 1149083423 / 2 + i_64_) + -2097436733 * ((Class304) this).anInt3592));
					graphics.drawImage(OutputStream_Sub1.anImage7953, 0, 0, null);
				} catch (Exception exception) {
					((Class304) this).aBool3572 = true;
				}
			} else
				Class351.aCanvas4096.repaint();
		}
	}

	Image method5403(String string) throws IOException {
		Image image;
		try {
			InputStream inputstream = Class282_Sub44.anApplet8065.getClass().getClassLoader().getResourceAsStream(string);
			byte[] is = new byte[4000];
			int i = 0;
			int i_77_;
			while ((i_77_ = inputstream.read()) != -1)
				is[i++] = (byte) i_77_;
			Image image_78_ = Toolkit.getDefaultToolkit().createImage(is);
			image = image_78_;
		} catch (Exception exception) {
			throw new IOException();
		}
		return image;
	}

	public void method187(boolean bool, int i) {
		if (!((Class304) this).aBool3572 && ((Class304) this).aFont3573 == null) {
			try {
				String[] strings = Class456_Sub3.method12681(client.aString7157, ',', 229848533);
				if (23 != strings.length)
					((Class304) this).aBool3572 = true;
				((Class304) this).aBool3583 = Boolean.parseBoolean(strings[0]);
				((Class304) this).aBool3584 = Boolean.parseBoolean(strings[1]);
				((Class304) this).anInt3585 = (Class328.method5830(strings[2], 1033089484) * -1241431707);
				((Class304) this).anInt3586 = (Class328.method5830(strings[3], -1313656246) * 1545138689);
				((Class304) this).anInt3587 = (Class328.method5830(strings[4], -1060623325) * -1872715597);
				((Class304) this).anInt3571 = Class328.method5830(strings[5], -948777137) * 544546015;
				((Class304) this).anInt3569 = Class328.method5830(strings[6], 58867236) * -850535471;
				((Class304) this).anInt3590 = (Class328.method5830(strings[7], -2109433001) * -537340309);
				((Class304) this).anInt3591 = Class328.method5830(strings[8], -732361811) * 1020096939;
				((Class304) this).anInt3592 = Class328.method5830(strings[9], -2066543129) * -29425429;
				String string = strings[10];
				int i_79_ = Class328.method5830(strings[11], 60349585);
				int i_80_ = Class285.method5026(strings[12].substring(2), 16, (byte) 113);
				((Class304) this).aFont3573 = new Font(string, 0, i_79_);
				((Class304) this).aFontMetrics3570 = Class351.aCanvas4096.getFontMetrics(((Class304) this).aFont3573);
				((Class304) this).aColor3582 = new Color(i_80_);
				MediaTracker mediatracker = new MediaTracker(Class351.aCanvas4096);
				((Class304) this).anImage3575 = method5399(strings[13], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3575, 0);
				((Class304) this).anImage3574 = method5399(strings[14], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3574, 1);
				((Class304) this).anImage3589 = method5399(strings[15], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3589, 2);
				((Class304) this).anImage3576 = method5399(strings[16], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3576, 3);
				((Class304) this).anImage3577 = method5399(strings[17], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3577, 4);
				((Class304) this).anImage3578 = method5399(strings[18], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3578, 5);
				((Class304) this).anImage3579 = method5399(strings[19], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3579, 6);
				((Class304) this).anImage3580 = method5399(strings[20], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3580, 7);
				((Class304) this).anImage3581 = method5399(strings[21], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3581, 8);
				mediatracker.waitForAll();
				((Class304) this).anInt3593 = (Class328.method5830(strings[22], 651937374) * -1517908233);
			} catch (Exception exception) {
				((Class304) this).aBool3572 = true;
			}
		}
		if (((Class304) this).aBool3572)
			method5398((byte) 0);
		else {
			Graphics graphics = Class351.aCanvas4096.getGraphics();
			if (graphics != null) {
				try {
					int i_81_ = Class328.aClass306_3771.method5424((byte) 48);
					String string = Class328.aClass306_3771.method5425(-2106602009);
					if (OutputStream_Sub1.anImage7953 == null)
						OutputStream_Sub1.anImage7953 = (Class351.aCanvas4096.createImage(-418109423 * Class349.anInt4083, Class263.anInt3243 * -969250379));
					Graphics graphics_82_ = OutputStream_Sub1.anImage7953.getGraphics();
					graphics_82_.setColor(Color.BLACK);
					graphics_82_.fillRect(0, 0, -418109423 * Class349.anInt4083, -969250379 * Class263.anInt3243);
					int i_83_ = ((Class304) this).anImage3579.getWidth(null);
					int i_84_ = ((Class304) this).anImage3580.getWidth(null);
					int i_85_ = ((Class304) this).anImage3581.getWidth(null);
					int i_86_ = ((Class304) this).anImage3579.getHeight(null);
					int i_87_ = ((Class304) this).anImage3580.getHeight(null);
					int i_88_ = ((Class304) this).anImage3581.getHeight(null);
					graphics_82_.drawImage(((Class304) this).anImage3579, (method5396(i_83_, 1492729595) + 215899441 * ((Class304) this).anInt3569 - -1703804669 * ((Class304) this).anInt3591 / 2), (method5397(i_86_, (byte) -50) + -1591466429 * ((Class304) this).anInt3590), null);
					int i_89_ = (215899441 * ((Class304) this).anInt3569 - ((Class304) this).anInt3591 * -1703804669 / 2 + i_83_);
					int i_90_ = (((Class304) this).anInt3569 * 215899441 + ((Class304) this).anInt3591 * -1703804669 / 2);
					for (int i_91_ = i_89_; i_91_ <= i_90_; i_91_ += i_85_)
						graphics_82_.drawImage(((Class304) this).anImage3581, (method5396(i_83_, 1385814484) + (((Class304) this).anInt3569 * 215899441) + i_91_), (method5397(i_88_, (byte) -13) + (((Class304) this).anInt3590 * -1591466429)), null);
					graphics_82_.drawImage(((Class304) this).anImage3580, (method5396(i_84_, 1778616531) + ((Class304) this).anInt3569 * 215899441 + -1703804669 * ((Class304) this).anInt3591 / 2), (method5397(i_87_, (byte) -6) + -1591466429 * ((Class304) this).anInt3590), null);
					int i_92_ = ((Class304) this).anImage3589.getWidth(null);
					int i_93_ = ((Class304) this).anImage3589.getHeight(null);
					int i_94_ = ((Class304) this).anImage3576.getWidth(null);
					int i_95_ = ((Class304) this).anImage3576.getHeight(null);
					int i_96_ = ((Class304) this).anImage3578.getHeight(null);
					int i_97_ = ((Class304) this).anImage3577.getWidth(null);
					int i_98_ = ((Class304) this).anImage3577.getHeight(null);
					int i_99_ = ((Class304) this).anImage3578.getWidth(null);
					int i_100_ = ((Class304) this).anImage3575.getWidth(null);
					int i_101_ = ((Class304) this).anImage3574.getWidth(null);
					int i_102_ = (method5396((((Class304) this).anInt3587 * -1500311941), 1977246179) + 956041325 * ((Class304) this).anInt3585);
					int i_103_ = (method5397(1149083423 * ((Class304) this).anInt3571, (byte) -119) + ((Class304) this).anInt3586 * -1599402495);
					graphics_82_.drawImage(((Class304) this).anImage3589, i_102_, ((1149083423 * ((Class304) this).anInt3571) - i_93_) / 2 + i_103_, null);
					graphics_82_.drawImage(((Class304) this).anImage3576, (i_102_ + (-1500311941 * ((Class304) this).anInt3587) - i_94_), ((1149083423 * ((Class304) this).anInt3571) - i_95_) / 2 + i_103_, null);
					if (((Class304) this).anImage3588 == null)
						((Class304) this).anImage3588 = (Class351.aCanvas4096.createImage((((Class304) this).anInt3587 * -1500311941 - i_92_ - i_94_), 1149083423 * ((Class304) this).anInt3571));
					Graphics graphics_104_ = ((Class304) this).anImage3588.getGraphics();
					for (int i_105_ = 0; i_105_ < (((Class304) this).anInt3587 * -1500311941 - i_92_ - i_94_); i_105_ += i_97_)
						graphics_104_.drawImage(((Class304) this).anImage3577, i_105_, 0, null);
					for (int i_106_ = 0; i_106_ < (((Class304) this).anInt3587 * -1500311941 - i_92_ - i_94_); i_106_ += i_99_)
						graphics_104_.drawImage(((Class304) this).anImage3578, i_106_, (((Class304) this).anInt3571 * 1149083423) - i_96_, null);
					int i_107_ = ((((Class304) this).anInt3587 * -1500311941 - i_92_ - i_94_) * i_81_ / 100);
					if (i_107_ > 0) {
						Image image = (Class351.aCanvas4096.createImage(i_107_, (1149083423 * ((Class304) this).anInt3571 - i_98_ - i_96_)));
						int i_108_ = image.getWidth(null);
						Graphics graphics_109_ = image.getGraphics();
						int i_110_ = (((Class304) this).anInt3593 * -493710649 * Class509.method8740(-1387759931) / 10 % i_100_);
						for (int i_111_ = i_110_ - i_100_; i_111_ < i_108_; i_111_ += i_100_)
							graphics_109_.drawImage((((Class304) this).anImage3575), i_111_, 0, null);
						graphics_104_.drawImage(image, 0, i_98_, null);
					}
					int i_112_ = i_107_;
					i_107_ = (-1500311941 * ((Class304) this).anInt3587 - i_92_ - i_94_ - i_107_);
					if (i_107_ > 0) {
						Image image = (Class351.aCanvas4096.createImage(i_107_, (1149083423 * ((Class304) this).anInt3571 - i_98_ - i_96_)));
						int i_113_ = image.getWidth(null);
						Graphics graphics_114_ = image.getGraphics();
						for (int i_115_ = 0; i_115_ < i_113_; i_115_ += i_101_)
							graphics_114_.drawImage((((Class304) this).anImage3574), i_115_, 0, null);
						graphics_104_.drawImage(image, i_112_, i_98_, null);
					}
					graphics_82_.drawImage(((Class304) this).anImage3588, i_102_ + i_92_, i_103_, null);
					graphics_82_.setFont(((Class304) this).aFont3573);
					graphics_82_.setColor(((Class304) this).aColor3582);
					graphics_82_.drawString(string, i_102_ + (-1500311941 * ((Class304) this).anInt3587 - ((Class304) this).aFontMetrics3570.stringWidth(string)) / 2, (4 + (((Class304) this).anInt3571 * 1149083423 / 2 + i_103_) + -2097436733 * ((Class304) this).anInt3592));
					graphics.drawImage(OutputStream_Sub1.anImage7953, 0, 0, null);
				} catch (Exception exception) {
					((Class304) this).aBool3572 = true;
				}
			} else
				Class351.aCanvas4096.repaint();
		}
	}

	void method5404() {
		Class158_Sub1_Sub2.method15535(Class328.aClass306_3771.method5424((byte) 11), Class328.aClass306_3771.method5425(-1717386028), client.aColorArray7186[client.anInt7447 * 1920182969], client.aColorArray7199[1920182969 * client.anInt7447], client.aColorArray7200[client.anInt7447 * 1920182969], 445254587);
	}

	public void method194(boolean bool) {
		if (!((Class304) this).aBool3572 && ((Class304) this).aFont3573 == null) {
			try {
				String[] strings = Class456_Sub3.method12681(client.aString7157, ',', 229848533);
				if (23 != strings.length)
					((Class304) this).aBool3572 = true;
				((Class304) this).aBool3583 = Boolean.parseBoolean(strings[0]);
				((Class304) this).aBool3584 = Boolean.parseBoolean(strings[1]);
				((Class304) this).anInt3585 = Class328.method5830(strings[2], 895203431) * -1241431707;
				((Class304) this).anInt3586 = Class328.method5830(strings[3], 1978076845) * 1545138689;
				((Class304) this).anInt3587 = (Class328.method5830(strings[4], -930354221) * -1872715597);
				((Class304) this).anInt3571 = Class328.method5830(strings[5], -1326044091) * 544546015;
				((Class304) this).anInt3569 = Class328.method5830(strings[6], 1309882503) * -850535471;
				((Class304) this).anInt3590 = Class328.method5830(strings[7], 129092294) * -537340309;
				((Class304) this).anInt3591 = Class328.method5830(strings[8], -315499877) * 1020096939;
				((Class304) this).anInt3592 = Class328.method5830(strings[9], -221145728) * -29425429;
				String string = strings[10];
				int i = Class328.method5830(strings[11], 962870203);
				int i_116_ = Class285.method5026(strings[12].substring(2), 16, (byte) 87);
				((Class304) this).aFont3573 = new Font(string, 0, i);
				((Class304) this).aFontMetrics3570 = Class351.aCanvas4096.getFontMetrics(((Class304) this).aFont3573);
				((Class304) this).aColor3582 = new Color(i_116_);
				MediaTracker mediatracker = new MediaTracker(Class351.aCanvas4096);
				((Class304) this).anImage3575 = method5399(strings[13], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3575, 0);
				((Class304) this).anImage3574 = method5399(strings[14], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3574, 1);
				((Class304) this).anImage3589 = method5399(strings[15], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3589, 2);
				((Class304) this).anImage3576 = method5399(strings[16], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3576, 3);
				((Class304) this).anImage3577 = method5399(strings[17], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3577, 4);
				((Class304) this).anImage3578 = method5399(strings[18], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3578, 5);
				((Class304) this).anImage3579 = method5399(strings[19], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3579, 6);
				((Class304) this).anImage3580 = method5399(strings[20], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3580, 7);
				((Class304) this).anImage3581 = method5399(strings[21], (byte) 0);
				mediatracker.addImage(((Class304) this).anImage3581, 8);
				mediatracker.waitForAll();
				((Class304) this).anInt3593 = (Class328.method5830(strings[22], -1276931523) * -1517908233);
			} catch (Exception exception) {
				((Class304) this).aBool3572 = true;
			}
		}
		if (((Class304) this).aBool3572)
			method5398((byte) 0);
		else {
			Graphics graphics = Class351.aCanvas4096.getGraphics();
			if (graphics != null) {
				try {
					int i = Class328.aClass306_3771.method5424((byte) 110);
					String string = Class328.aClass306_3771.method5425(-1434118755);
					if (OutputStream_Sub1.anImage7953 == null)
						OutputStream_Sub1.anImage7953 = (Class351.aCanvas4096.createImage(-418109423 * Class349.anInt4083, Class263.anInt3243 * -969250379));
					Graphics graphics_117_ = OutputStream_Sub1.anImage7953.getGraphics();
					graphics_117_.setColor(Color.BLACK);
					graphics_117_.fillRect(0, 0, -418109423 * Class349.anInt4083, -969250379 * Class263.anInt3243);
					int i_118_ = ((Class304) this).anImage3579.getWidth(null);
					int i_119_ = ((Class304) this).anImage3580.getWidth(null);
					int i_120_ = ((Class304) this).anImage3581.getWidth(null);
					int i_121_ = ((Class304) this).anImage3579.getHeight(null);
					int i_122_ = ((Class304) this).anImage3580.getHeight(null);
					int i_123_ = ((Class304) this).anImage3581.getHeight(null);
					graphics_117_.drawImage(((Class304) this).anImage3579, (method5396(i_118_, 1593940832) + 215899441 * ((Class304) this).anInt3569 - -1703804669 * ((Class304) this).anInt3591 / 2), (method5397(i_121_, (byte) -109) + -1591466429 * ((Class304) this).anInt3590), null);
					int i_124_ = (215899441 * ((Class304) this).anInt3569 - ((Class304) this).anInt3591 * -1703804669 / 2 + i_118_);
					int i_125_ = (((Class304) this).anInt3569 * 215899441 + ((Class304) this).anInt3591 * -1703804669 / 2);
					for (int i_126_ = i_124_; i_126_ <= i_125_; i_126_ += i_120_)
						graphics_117_.drawImage(((Class304) this).anImage3581, (method5396(i_118_, 508141666) + (((Class304) this).anInt3569 * 215899441) + i_126_), (method5397(i_123_, (byte) -75) + (((Class304) this).anInt3590 * -1591466429)), null);
					graphics_117_.drawImage(((Class304) this).anImage3580, (method5396(i_119_, 982311242) + ((Class304) this).anInt3569 * 215899441 + -1703804669 * ((Class304) this).anInt3591 / 2), (method5397(i_122_, (byte) -88) + -1591466429 * ((Class304) this).anInt3590), null);
					int i_127_ = ((Class304) this).anImage3589.getWidth(null);
					int i_128_ = ((Class304) this).anImage3589.getHeight(null);
					int i_129_ = ((Class304) this).anImage3576.getWidth(null);
					int i_130_ = ((Class304) this).anImage3576.getHeight(null);
					int i_131_ = ((Class304) this).anImage3578.getHeight(null);
					int i_132_ = ((Class304) this).anImage3577.getWidth(null);
					int i_133_ = ((Class304) this).anImage3577.getHeight(null);
					int i_134_ = ((Class304) this).anImage3578.getWidth(null);
					int i_135_ = ((Class304) this).anImage3575.getWidth(null);
					int i_136_ = ((Class304) this).anImage3574.getWidth(null);
					int i_137_ = (method5396((((Class304) this).anInt3587 * -1500311941), 2110547678) + 956041325 * ((Class304) this).anInt3585);
					int i_138_ = (method5397(1149083423 * ((Class304) this).anInt3571, (byte) -15) + ((Class304) this).anInt3586 * -1599402495);
					graphics_117_.drawImage(((Class304) this).anImage3589, i_137_, ((1149083423 * ((Class304) this).anInt3571) - i_128_) / 2 + i_138_, null);
					graphics_117_.drawImage(((Class304) this).anImage3576, (i_137_ + (-1500311941 * ((Class304) this).anInt3587) - i_129_), ((1149083423 * ((Class304) this).anInt3571) - i_130_) / 2 + i_138_, null);
					if (((Class304) this).anImage3588 == null)
						((Class304) this).anImage3588 = (Class351.aCanvas4096.createImage((((Class304) this).anInt3587 * -1500311941 - i_127_ - i_129_), 1149083423 * ((Class304) this).anInt3571));
					Graphics graphics_139_ = ((Class304) this).anImage3588.getGraphics();
					for (int i_140_ = 0; i_140_ < (((Class304) this).anInt3587 * -1500311941 - i_127_ - i_129_); i_140_ += i_132_)
						graphics_139_.drawImage(((Class304) this).anImage3577, i_140_, 0, null);
					for (int i_141_ = 0; i_141_ < (((Class304) this).anInt3587 * -1500311941 - i_127_ - i_129_); i_141_ += i_134_)
						graphics_139_.drawImage(((Class304) this).anImage3578, i_141_, (((Class304) this).anInt3571 * 1149083423) - i_131_, null);
					int i_142_ = ((((Class304) this).anInt3587 * -1500311941 - i_127_ - i_129_) * i / 100);
					if (i_142_ > 0) {
						Image image = (Class351.aCanvas4096.createImage(i_142_, (1149083423 * ((Class304) this).anInt3571 - i_133_ - i_131_)));
						int i_143_ = image.getWidth(null);
						Graphics graphics_144_ = image.getGraphics();
						int i_145_ = (((Class304) this).anInt3593 * -493710649 * Class509.method8740(-1010766912) / 10 % i_135_);
						for (int i_146_ = i_145_ - i_135_; i_146_ < i_143_; i_146_ += i_135_)
							graphics_144_.drawImage((((Class304) this).anImage3575), i_146_, 0, null);
						graphics_139_.drawImage(image, 0, i_133_, null);
					}
					int i_147_ = i_142_;
					i_142_ = (-1500311941 * ((Class304) this).anInt3587 - i_127_ - i_129_ - i_142_);
					if (i_142_ > 0) {
						Image image = (Class351.aCanvas4096.createImage(i_142_, (1149083423 * ((Class304) this).anInt3571 - i_133_ - i_131_)));
						int i_148_ = image.getWidth(null);
						Graphics graphics_149_ = image.getGraphics();
						for (int i_150_ = 0; i_150_ < i_148_; i_150_ += i_136_)
							graphics_149_.drawImage((((Class304) this).anImage3574), i_150_, 0, null);
						graphics_139_.drawImage(image, i_147_, i_133_, null);
					}
					graphics_117_.drawImage(((Class304) this).anImage3588, i_137_ + i_127_, i_138_, null);
					graphics_117_.setFont(((Class304) this).aFont3573);
					graphics_117_.setColor(((Class304) this).aColor3582);
					graphics_117_.drawString(string, i_137_ + (-1500311941 * ((Class304) this).anInt3587 - ((Class304) this).aFontMetrics3570.stringWidth(string)) / 2, (4 + (((Class304) this).anInt3571 * 1149083423 / 2 + i_138_) + -2097436733 * ((Class304) this).anInt3592));
					graphics.drawImage(OutputStream_Sub1.anImage7953, 0, 0, null);
				} catch (Exception exception) {
					((Class304) this).aBool3572 = true;
				}
			} else
				Class351.aCanvas4096.repaint();
		}
	}

	public void method157() {
		Class362.method6276(-1874192750);
	}

	final int method5405(int i) {
		if (((Class304) this).aBool3584)
			return (Class263.anInt3243 * -969250379 - i) / 2;
		return 0;
	}

	public void method159() {
		/* empty */
	}

	public int method197() {
		return 100;
	}

	public int method196() {
		return 100;
	}

	final int method5406(int i) {
		if (((Class304) this).aBool3584)
			return (Class263.anInt3243 * -969250379 - i) / 2;
		return 0;
	}

	public int method198() {
		return 100;
	}

	public boolean method193(long l) {
		return true;
	}

	public void method158() {
		/* empty */
	}

	public int method72() {
		return 0;
	}

	static String method5407(int i, Language class495, byte i_151_) {
		if (i < 100000)
			return new StringBuilder().append("<col=ffff00>").append(i).append("</col>").toString();
		if (i < 10000000)
			return new StringBuilder().append("<col=ffffff>").append(i / 1000).append(Message.aClass433_5297.translate(class495, -664620101)).append("</col>").toString();
		return new StringBuilder().append("<col=00ff80>").append(i / 1000000).append(Message.aClass433_5304.translate(class495, -1313761048)).append("</col>").toString();
	}

	static final void method5408(CS2Executor class527, int i) {
		int i_152_ = Class84.myPlayer.aByte7967;
		Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
		Class219 class219 = client.aClass257_7353.method4519(165047864);
		int i_153_ = (1948093437 * class219.anInt2711 + ((int) class385.aFloat4671 >> 9));
		int i_154_ = (((int) class385.aFloat4673 >> 9) + class219.anInt2712 * -1002240017);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_154_ + ((i_152_ << 28) + (i_153_ << 14));
	}

	public static void method5409(Class118 class118, int i, int i_155_, byte i_156_) {
		if (class118 != null) {
			if (null != class118.anObjectArray1400) {
				Class282_Sub43 class282_sub43 = new Class282_Sub43();
				class282_sub43.aClass118_8053 = class118;
				class282_sub43.anObjectArray8054 = class118.anObjectArray1400;
				Class96_Sub4.method13790(class282_sub43, 1699733120);
			}
			client.aBool7344 = true;
			Class7.anInt56 = -12326165 * class118.anInt1287;
			client.anInt7345 = -1988979361 * class118.anInt1288;
			Class506.anInt5858 = i * -1022105259;
			Class96_Sub12.anInt9319 = -1316084439 * i_155_;
			client.anInt7346 = 718486087 * class118.anInt1426;
			Class519.anInt5932 = class118.anInt1307 * 1002765465;
			client.anInt7427 = class118.anInt1310 * 1201108967;
			Class109.method1858(class118, (byte) 35);
		}
	}

	public static int[][] method5410(int i, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, float f, boolean bool, int i_162_) {
		int[][] is = new int[i_157_][i];
		Class282_Sub20_Sub4 class282_sub20_sub4 = new Class282_Sub20_Sub4();
		((Class282_Sub20_Sub4) class282_sub20_sub4).aBool9726 = bool;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9725 = i_159_ * 542765127;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9735 = i_160_ * 554163529;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9736 = 1844348207 * i_161_;
		((Class282_Sub20_Sub4) class282_sub20_sub4).anInt9737 = -1659901129 * (int) (4096.0F * f);
		class282_sub20_sub4.method12321(1816098804);
		Class316.method5593(i, i_157_, 85508155);
		for (int i_163_ = 0; i_163_ < i_157_; i_163_++)
			class282_sub20_sub4.method15197(i_163_, is[i_163_], 915556346);
		return is;
	}
}
