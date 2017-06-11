/* Class224 - Decompiled by JODE
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

public class Class224 implements Interface12 {
	Image anImage6425;
	boolean aBoolean6426;
	FontMetrics aFontMetrics6427;
	Color aColor6428;
	Image anImage6429;
	Image anImage6430;
	Image anImage6431;
	int anInt6432;
	int anInt6433;
	Image anImage6434;
	Font aFont6435;
	Image anImage6436;
	int anInt6437;
	Image anImage6438;
	boolean aBoolean6439;
	boolean aBoolean6440;
	int anInt6441;
	int anInt6442;
	int anInt6443;
	int anInt6444;
	int anInt6445;
	Image anImage6446;
	Image anImage6447;
	int anInt6448;
	Image anImage6449;

	final int method2086(int i, int i_0_) {
		try {
			if (((Class224) this).aBoolean6439)
				return (Class462.anInt5683 * -2110394505 - i) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.a(").append(')').toString());
		}
	}

	public void method160(boolean bool, int i) {
		try {
			if (!((Class224) this).aBoolean6426 && null == ((Class224) this).aFont6435) {
				try {
					String[] strings = Class365_Sub1_Sub3_Sub1.method4508(client.aString8649, ',', 1855531743);
					if (strings.length != 23)
						((Class224) this).aBoolean6426 = true;
					((Class224) this).aBoolean6439 = Boolean.parseBoolean(strings[0]);
					((Class224) this).aBoolean6440 = Boolean.parseBoolean(strings[1]);
					((Class224) this).anInt6441 = (Class216.method1998(strings[2], (short) 13478) * 1964281455);
					((Class224) this).anInt6442 = (Class216.method1998(strings[3], (short) -3766) * -1706979163);
					((Class224) this).anInt6443 = (Class216.method1998(strings[4], (short) -31027) * -739282769);
					((Class224) this).anInt6444 = (Class216.method1998(strings[5], (short) -4692) * 653393239);
					((Class224) this).anInt6445 = (Class216.method1998(strings[6], (short) -24880) * 1534341113);
					((Class224) this).anInt6432 = (Class216.method1998(strings[7], (short) -11380) * -698963109);
					((Class224) this).anInt6433 = (Class216.method1998(strings[8], (short) -28758) * 1938947963);
					((Class224) this).anInt6448 = (Class216.method1998(strings[9], (short) 9091) * 1454829183);
					String string = strings[10];
					int i_1_ = Class216.method1998(strings[11], (short) 1058);
					int i_2_ = Class398.method4924(strings[12].substring(2), 16, (byte) -28);
					((Class224) this).aFont6435 = new Font(string, 0, i_1_);
					((Class224) this).aFontMetrics6427 = Class52_Sub2_Sub1.aCanvas9079.getFontMetrics(((Class224) this).aFont6435);
					((Class224) this).aColor6428 = new Color(i_2_);
					MediaTracker mediatracker = new MediaTracker(Class52_Sub2_Sub1.aCanvas9079);
					((Class224) this).anImage6431 = method2089(strings[13], -822395030);
					mediatracker.addImage(((Class224) this).anImage6431, 0);
					((Class224) this).anImage6430 = method2089(strings[14], -2141223361);
					mediatracker.addImage(((Class224) this).anImage6430, 1);
					((Class224) this).anImage6425 = method2089(strings[15], -72969942);
					mediatracker.addImage(((Class224) this).anImage6425, 2);
					((Class224) this).anImage6449 = method2089(strings[16], -1604693448);
					mediatracker.addImage(((Class224) this).anImage6449, 3);
					((Class224) this).anImage6429 = method2089(strings[17], -526492417);
					mediatracker.addImage(((Class224) this).anImage6429, 4);
					((Class224) this).anImage6434 = method2089(strings[18], -2098831749);
					mediatracker.addImage(((Class224) this).anImage6434, 5);
					((Class224) this).anImage6447 = method2089(strings[19], -74846883);
					mediatracker.addImage(((Class224) this).anImage6447, 6);
					((Class224) this).anImage6436 = method2089(strings[20], -1555968401);
					mediatracker.addImage(((Class224) this).anImage6436, 7);
					((Class224) this).anImage6446 = method2089(strings[21], -1967538866);
					mediatracker.addImage(((Class224) this).anImage6446, 8);
					mediatracker.waitForAll();
					((Class224) this).anInt6437 = (Class216.method1998(strings[22], (short) 10256) * 1655153121);
				} catch (Exception exception) {
					((Class224) this).aBoolean6426 = true;
				}
			}
			if (((Class224) this).aBoolean6426)
				method2087((byte) 21);
			else {
				Graphics graphics = Class52_Sub2_Sub1.aCanvas9079.getGraphics();
				if (null != graphics) {
					try {
						int i_3_ = Class288_Sub1.aClass219_7147.method2038(-15916663);
						String string = Class288_Sub1.aClass219_7147.method2039((short) 19939);
						if (Class298_Sub32_Sub22.anImage9468 == null)
							Class298_Sub32_Sub22.anImage9468 = (Class52_Sub2_Sub1.aCanvas9079.createImage(Class462.anInt5683 * -2110394505, (Class298_Sub40_Sub9.anInt9716 * -1111710645)));
						Graphics graphics_4_ = Class298_Sub32_Sub22.anImage9468.getGraphics();
						graphics_4_.setColor(Color.BLACK);
						graphics_4_.fillRect(0, 0, Class462.anInt5683 * -2110394505, (Class298_Sub40_Sub9.anInt9716 * -1111710645));
						int i_5_ = ((Class224) this).anImage6447.getWidth(null);
						int i_6_ = ((Class224) this).anImage6436.getWidth(null);
						int i_7_ = ((Class224) this).anImage6446.getWidth(null);
						int i_8_ = ((Class224) this).anImage6447.getHeight(null);
						int i_9_ = ((Class224) this).anImage6436.getHeight(null);
						int i_10_ = ((Class224) this).anImage6446.getHeight(null);
						graphics_4_.drawImage(((Class224) this).anImage6447, (method2086(i_5_, 1748147978) + ((Class224) this).anInt6445 * -1077321143 - ((Class224) this).anInt6433 * 510265267 / 2), (method2088(i_8_, -1405353702) + 1216449747 * ((Class224) this).anInt6432), null);
						int i_11_ = (-1077321143 * ((Class224) this).anInt6445 - 510265267 * ((Class224) this).anInt6433 / 2 + i_5_);
						int i_12_ = (510265267 * ((Class224) this).anInt6433 / 2 + -1077321143 * ((Class224) this).anInt6445);
						for (int i_13_ = i_11_; i_13_ <= i_12_; i_13_ += i_7_)
							graphics_4_.drawImage(((Class224) this).anImage6446, (method2086(i_5_, 1551718275) + ((Class224) this).anInt6445 * -1077321143 + i_13_), (method2088(i_10_, -1405353702) + 1216449747 * ((Class224) this).anInt6432), null);
						graphics_4_.drawImage(((Class224) this).anImage6436, (method2086(i_6_, 1762202219) + ((Class224) this).anInt6445 * -1077321143 + ((Class224) this).anInt6433 * 510265267 / 2), (method2088(i_9_, -1405353702) + ((Class224) this).anInt6432 * 1216449747), null);
						int i_14_ = ((Class224) this).anImage6425.getWidth(null);
						int i_15_ = ((Class224) this).anImage6425.getHeight(null);
						int i_16_ = ((Class224) this).anImage6449.getWidth(null);
						int i_17_ = ((Class224) this).anImage6449.getHeight(null);
						int i_18_ = ((Class224) this).anImage6434.getHeight(null);
						int i_19_ = ((Class224) this).anImage6429.getWidth(null);
						int i_20_ = ((Class224) this).anImage6429.getHeight(null);
						int i_21_ = ((Class224) this).anImage6434.getWidth(null);
						int i_22_ = ((Class224) this).anImage6431.getWidth(null);
						int i_23_ = ((Class224) this).anImage6430.getWidth(null);
						int i_24_ = (method2086((-170793393 * ((Class224) this).anInt6443), 1743968400) + ((Class224) this).anInt6441 * -1610968945);
						int i_25_ = (method2088((((Class224) this).anInt6444 * -67617177), -1405353702) + ((Class224) this).anInt6442 * 315873069);
						graphics_4_.drawImage(((Class224) this).anImage6425, i_24_, ((-67617177 * ((Class224) this).anInt6444) - i_15_) / 2 + i_25_, null);
						graphics_4_.drawImage(((Class224) this).anImage6449, (i_24_ + -170793393 * ((Class224) this).anInt6443 - i_16_), i_25_ + (((Class224) this).anInt6444 * -67617177 - i_17_) / 2, null);
						if (null == ((Class224) this).anImage6438)
							((Class224) this).anImage6438 = (Class52_Sub2_Sub1.aCanvas9079.createImage((((Class224) this).anInt6443 * -170793393 - i_14_ - i_16_), ((Class224) this).anInt6444 * -67617177));
						Graphics graphics_26_ = ((Class224) this).anImage6438.getGraphics();
						for (int i_27_ = 0; i_27_ < (-170793393 * ((Class224) this).anInt6443 - i_14_ - i_16_); i_27_ += i_19_)
							graphics_26_.drawImage((((Class224) this).anImage6429), i_27_, 0, null);
						for (int i_28_ = 0; i_28_ < (((Class224) this).anInt6443 * -170793393 - i_14_ - i_16_); i_28_ += i_21_)
							graphics_26_.drawImage(((Class224) this).anImage6434, i_28_, (-67617177 * ((Class224) this).anInt6444 - i_18_), null);
						int i_29_ = i_3_ * (((Class224) this).anInt6443 * -170793393 - i_14_ - i_16_) / 100;
						if (i_29_ > 0) {
							Image image = (Class52_Sub2_Sub1.aCanvas9079.createImage(i_29_, (-67617177 * ((Class224) this).anInt6444 - i_20_ - i_18_)));
							int i_30_ = image.getWidth(null);
							Graphics graphics_31_ = image.getGraphics();
							int i_32_ = (32268833 * ((Class224) this).anInt6437 * Class74.method823(1139144319) / 10 % i_22_);
							for (int i_33_ = i_32_ - i_22_; i_33_ < i_30_; i_33_ += i_22_)
								graphics_31_.drawImage((((Class224) this).anImage6431), i_33_, 0, null);
							graphics_26_.drawImage(image, 0, i_20_, null);
						}
						int i_34_ = i_29_;
						i_29_ = (((Class224) this).anInt6443 * -170793393 - i_14_ - i_16_ - i_29_);
						if (i_29_ > 0) {
							Image image = (Class52_Sub2_Sub1.aCanvas9079.createImage(i_29_, (((Class224) this).anInt6444 * -67617177 - i_20_ - i_18_)));
							int i_35_ = image.getWidth(null);
							Graphics graphics_36_ = image.getGraphics();
							for (int i_37_ = 0; i_37_ < i_35_; i_37_ += i_23_)
								graphics_36_.drawImage((((Class224) this).anImage6430), i_37_, 0, null);
							graphics_26_.drawImage(image, i_34_, i_20_, null);
						}
						graphics_4_.drawImage(((Class224) this).anImage6438, i_24_ + i_14_, i_25_, null);
						graphics_4_.setFont(((Class224) this).aFont6435);
						graphics_4_.setColor(((Class224) this).aColor6428);
						graphics_4_.drawString(string, i_24_ + (-170793393 * ((Class224) this).anInt6443 - ((Class224) this).aFontMetrics6427.stringWidth(string)) / 2, (4 + (i_25_ + ((Class224) this).anInt6444 * -67617177 / 2) + ((Class224) this).anInt6448 * 1282855295));
						graphics.drawImage(Class298_Sub32_Sub22.anImage9468, 0, 0, null);
					} catch (Exception exception) {
						((Class224) this).aBoolean6426 = true;
					}
				} else
					Class52_Sub2_Sub1.aCanvas9079.repaint();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.b(").append(')').toString());
		}
	}

	public void method155(boolean bool) {
		if (!((Class224) this).aBoolean6426 && null == ((Class224) this).aFont6435) {
			try {
				String[] strings = Class365_Sub1_Sub3_Sub1.method4508(client.aString8649, ',', 1881820708);
				if (strings.length != 23)
					((Class224) this).aBoolean6426 = true;
				((Class224) this).aBoolean6439 = Boolean.parseBoolean(strings[0]);
				((Class224) this).aBoolean6440 = Boolean.parseBoolean(strings[1]);
				((Class224) this).anInt6441 = (Class216.method1998(strings[2], (short) 9025) * 1964281455);
				((Class224) this).anInt6442 = (Class216.method1998(strings[3], (short) -28781) * -1706979163);
				((Class224) this).anInt6443 = (Class216.method1998(strings[4], (short) -29073) * -739282769);
				((Class224) this).anInt6444 = (Class216.method1998(strings[5], (short) -13052) * 653393239);
				((Class224) this).anInt6445 = (Class216.method1998(strings[6], (short) 15623) * 1534341113);
				((Class224) this).anInt6432 = (Class216.method1998(strings[7], (short) 10134) * -698963109);
				((Class224) this).anInt6433 = (Class216.method1998(strings[8], (short) 11376) * 1938947963);
				((Class224) this).anInt6448 = (Class216.method1998(strings[9], (short) -2228) * 1454829183);
				String string = strings[10];
				int i = Class216.method1998(strings[11], (short) 4411);
				int i_38_ = Class398.method4924(strings[12].substring(2), 16, (byte) 3);
				((Class224) this).aFont6435 = new Font(string, 0, i);
				((Class224) this).aFontMetrics6427 = Class52_Sub2_Sub1.aCanvas9079.getFontMetrics(((Class224) this).aFont6435);
				((Class224) this).aColor6428 = new Color(i_38_);
				MediaTracker mediatracker = new MediaTracker(Class52_Sub2_Sub1.aCanvas9079);
				((Class224) this).anImage6431 = method2089(strings[13], -1436254117);
				mediatracker.addImage(((Class224) this).anImage6431, 0);
				((Class224) this).anImage6430 = method2089(strings[14], -673980220);
				mediatracker.addImage(((Class224) this).anImage6430, 1);
				((Class224) this).anImage6425 = method2089(strings[15], -66632149);
				mediatracker.addImage(((Class224) this).anImage6425, 2);
				((Class224) this).anImage6449 = method2089(strings[16], -1032931100);
				mediatracker.addImage(((Class224) this).anImage6449, 3);
				((Class224) this).anImage6429 = method2089(strings[17], -196322295);
				mediatracker.addImage(((Class224) this).anImage6429, 4);
				((Class224) this).anImage6434 = method2089(strings[18], -1016348343);
				mediatracker.addImage(((Class224) this).anImage6434, 5);
				((Class224) this).anImage6447 = method2089(strings[19], -490962228);
				mediatracker.addImage(((Class224) this).anImage6447, 6);
				((Class224) this).anImage6436 = method2089(strings[20], -915469050);
				mediatracker.addImage(((Class224) this).anImage6436, 7);
				((Class224) this).anImage6446 = method2089(strings[21], -2081233119);
				mediatracker.addImage(((Class224) this).anImage6446, 8);
				mediatracker.waitForAll();
				((Class224) this).anInt6437 = (Class216.method1998(strings[22], (short) 5981) * 1655153121);
			} catch (Exception exception) {
				((Class224) this).aBoolean6426 = true;
			}
		}
		if (((Class224) this).aBoolean6426)
			method2087((byte) 24);
		else {
			Graphics graphics = Class52_Sub2_Sub1.aCanvas9079.getGraphics();
			if (null != graphics) {
				try {
					int i = Class288_Sub1.aClass219_7147.method2038(-15916663);
					String string = Class288_Sub1.aClass219_7147.method2039((short) 2096);
					if (Class298_Sub32_Sub22.anImage9468 == null)
						Class298_Sub32_Sub22.anImage9468 = (Class52_Sub2_Sub1.aCanvas9079.createImage(Class462.anInt5683 * -2110394505, Class298_Sub40_Sub9.anInt9716 * -1111710645));
					Graphics graphics_39_ = Class298_Sub32_Sub22.anImage9468.getGraphics();
					graphics_39_.setColor(Color.BLACK);
					graphics_39_.fillRect(0, 0, Class462.anInt5683 * -2110394505, (Class298_Sub40_Sub9.anInt9716 * -1111710645));
					int i_40_ = ((Class224) this).anImage6447.getWidth(null);
					int i_41_ = ((Class224) this).anImage6436.getWidth(null);
					int i_42_ = ((Class224) this).anImage6446.getWidth(null);
					int i_43_ = ((Class224) this).anImage6447.getHeight(null);
					int i_44_ = ((Class224) this).anImage6436.getHeight(null);
					int i_45_ = ((Class224) this).anImage6446.getHeight(null);
					graphics_39_.drawImage(((Class224) this).anImage6447, (method2086(i_40_, 1305023627) + ((Class224) this).anInt6445 * -1077321143 - ((Class224) this).anInt6433 * 510265267 / 2), (method2088(i_43_, -1405353702) + 1216449747 * ((Class224) this).anInt6432), null);
					int i_46_ = (-1077321143 * ((Class224) this).anInt6445 - 510265267 * ((Class224) this).anInt6433 / 2 + i_40_);
					int i_47_ = (510265267 * ((Class224) this).anInt6433 / 2 + -1077321143 * ((Class224) this).anInt6445);
					for (int i_48_ = i_46_; i_48_ <= i_47_; i_48_ += i_42_)
						graphics_39_.drawImage(((Class224) this).anImage6446, (method2086(i_40_, -327497276) + ((Class224) this).anInt6445 * -1077321143 + i_48_), (method2088(i_45_, -1405353702) + 1216449747 * ((Class224) this).anInt6432), null);
					graphics_39_.drawImage(((Class224) this).anImage6436, (method2086(i_41_, 1445959544) + ((Class224) this).anInt6445 * -1077321143 + ((Class224) this).anInt6433 * 510265267 / 2), (method2088(i_44_, -1405353702) + ((Class224) this).anInt6432 * 1216449747), null);
					int i_49_ = ((Class224) this).anImage6425.getWidth(null);
					int i_50_ = ((Class224) this).anImage6425.getHeight(null);
					int i_51_ = ((Class224) this).anImage6449.getWidth(null);
					int i_52_ = ((Class224) this).anImage6449.getHeight(null);
					int i_53_ = ((Class224) this).anImage6434.getHeight(null);
					int i_54_ = ((Class224) this).anImage6429.getWidth(null);
					int i_55_ = ((Class224) this).anImage6429.getHeight(null);
					int i_56_ = ((Class224) this).anImage6434.getWidth(null);
					int i_57_ = ((Class224) this).anImage6431.getWidth(null);
					int i_58_ = ((Class224) this).anImage6430.getWidth(null);
					int i_59_ = (method2086(-170793393 * ((Class224) this).anInt6443, -1051400562) + ((Class224) this).anInt6441 * -1610968945);
					int i_60_ = (method2088(((Class224) this).anInt6444 * -67617177, -1405353702) + ((Class224) this).anInt6442 * 315873069);
					graphics_39_.drawImage(((Class224) this).anImage6425, i_59_, ((-67617177 * ((Class224) this).anInt6444) - i_50_) / 2 + i_60_, null);
					graphics_39_.drawImage(((Class224) this).anImage6449, (i_59_ + -170793393 * ((Class224) this).anInt6443 - i_51_), i_60_ + (((Class224) this).anInt6444 * -67617177 - i_52_) / 2, null);
					if (null == ((Class224) this).anImage6438)
						((Class224) this).anImage6438 = (Class52_Sub2_Sub1.aCanvas9079.createImage((((Class224) this).anInt6443 * -170793393 - i_49_ - i_51_), ((Class224) this).anInt6444 * -67617177));
					Graphics graphics_61_ = ((Class224) this).anImage6438.getGraphics();
					for (int i_62_ = 0; i_62_ < (-170793393 * ((Class224) this).anInt6443 - i_49_ - i_51_); i_62_ += i_54_)
						graphics_61_.drawImage(((Class224) this).anImage6429, i_62_, 0, null);
					for (int i_63_ = 0; i_63_ < (((Class224) this).anInt6443 * -170793393 - i_49_ - i_51_); i_63_ += i_56_)
						graphics_61_.drawImage(((Class224) this).anImage6434, i_63_, ((-67617177 * ((Class224) this).anInt6444) - i_53_), null);
					int i_64_ = i * (((Class224) this).anInt6443 * -170793393 - i_49_ - i_51_) / 100;
					if (i_64_ > 0) {
						Image image = (Class52_Sub2_Sub1.aCanvas9079.createImage(i_64_, (-67617177 * ((Class224) this).anInt6444 - i_55_ - i_53_)));
						int i_65_ = image.getWidth(null);
						Graphics graphics_66_ = image.getGraphics();
						int i_67_ = (32268833 * ((Class224) this).anInt6437 * Class74.method823(1139144319) / 10 % i_57_);
						for (int i_68_ = i_67_ - i_57_; i_68_ < i_65_; i_68_ += i_57_)
							graphics_66_.drawImage((((Class224) this).anImage6431), i_68_, 0, null);
						graphics_61_.drawImage(image, 0, i_55_, null);
					}
					int i_69_ = i_64_;
					i_64_ = (((Class224) this).anInt6443 * -170793393 - i_49_ - i_51_ - i_64_);
					if (i_64_ > 0) {
						Image image = (Class52_Sub2_Sub1.aCanvas9079.createImage(i_64_, (((Class224) this).anInt6444 * -67617177 - i_55_ - i_53_)));
						int i_70_ = image.getWidth(null);
						Graphics graphics_71_ = image.getGraphics();
						for (int i_72_ = 0; i_72_ < i_70_; i_72_ += i_58_)
							graphics_71_.drawImage((((Class224) this).anImage6430), i_72_, 0, null);
						graphics_61_.drawImage(image, i_69_, i_55_, null);
					}
					graphics_39_.drawImage(((Class224) this).anImage6438, i_59_ + i_49_, i_60_, null);
					graphics_39_.setFont(((Class224) this).aFont6435);
					graphics_39_.setColor(((Class224) this).aColor6428);
					graphics_39_.drawString(string, i_59_ + (-170793393 * ((Class224) this).anInt6443 - ((Class224) this).aFontMetrics6427.stringWidth(string)) / 2, (4 + (i_60_ + ((Class224) this).anInt6444 * -67617177 / 2) + ((Class224) this).anInt6448 * 1282855295));
					graphics.drawImage(Class298_Sub32_Sub22.anImage9468, 0, 0, null);
				} catch (Exception exception) {
					((Class224) this).aBoolean6426 = true;
				}
			} else
				Class52_Sub2_Sub1.aCanvas9079.repaint();
		}
	}

	public boolean method152(long l) {
		return true;
	}

	void method2087(byte i) {
		try {
			Class406.method4963(Class288_Sub1.aClass219_7147.method2038(-15916663), Class288_Sub1.aClass219_7147.method2039((short) 1984), client.aColorArray8689[745003679 * client.anInt8971], client.aColorArray8701[client.anInt8971 * 745003679], client.aColorArray8691[745003679 * client.anInt8971], (byte) -117);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.i(").append(')').toString());
		}
	}

	public void method149(short i) {
		try {
			Class219.method2047(-1084979949);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.k(").append(')').toString());
		}
	}

	public void method150(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.d(").append(')').toString());
		}
	}

	public int method159(byte i) {
		try {
			return 100;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.u(").append(')').toString());
		}
	}

	public boolean method153(long l) {
		try {
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.x(").append(')').toString());
		}
	}

	public int method151(int i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.r(").append(')').toString());
		}
	}

	public void method157() {
		Class219.method2047(-2108269046);
	}

	final int method2088(int i, int i_73_) {
		try {
			if (((Class224) this).aBoolean6440)
				return (-1111710645 * Class298_Sub40_Sub9.anInt9716 - i) / 2;
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.f(").append(')').toString());
		}
	}

	public void method156(boolean bool) {
		if (!((Class224) this).aBoolean6426 && null == ((Class224) this).aFont6435) {
			try {
				String[] strings = Class365_Sub1_Sub3_Sub1.method4508(client.aString8649, ',', 1134178210);
				if (strings.length != 23)
					((Class224) this).aBoolean6426 = true;
				((Class224) this).aBoolean6439 = Boolean.parseBoolean(strings[0]);
				((Class224) this).aBoolean6440 = Boolean.parseBoolean(strings[1]);
				((Class224) this).anInt6441 = (Class216.method1998(strings[2], (short) 11020) * 1964281455);
				((Class224) this).anInt6442 = (Class216.method1998(strings[3], (short) 10827) * -1706979163);
				((Class224) this).anInt6443 = (Class216.method1998(strings[4], (short) -2435) * -739282769);
				((Class224) this).anInt6444 = (Class216.method1998(strings[5], (short) -1964) * 653393239);
				((Class224) this).anInt6445 = (Class216.method1998(strings[6], (short) -3841) * 1534341113);
				((Class224) this).anInt6432 = (Class216.method1998(strings[7], (short) -1804) * -698963109);
				((Class224) this).anInt6433 = (Class216.method1998(strings[8], (short) -16911) * 1938947963);
				((Class224) this).anInt6448 = (Class216.method1998(strings[9], (short) -9547) * 1454829183);
				String string = strings[10];
				int i = Class216.method1998(strings[11], (short) -19874);
				int i_74_ = Class398.method4924(strings[12].substring(2), 16, (byte) 58);
				((Class224) this).aFont6435 = new Font(string, 0, i);
				((Class224) this).aFontMetrics6427 = Class52_Sub2_Sub1.aCanvas9079.getFontMetrics(((Class224) this).aFont6435);
				((Class224) this).aColor6428 = new Color(i_74_);
				MediaTracker mediatracker = new MediaTracker(Class52_Sub2_Sub1.aCanvas9079);
				((Class224) this).anImage6431 = method2089(strings[13], -62779859);
				mediatracker.addImage(((Class224) this).anImage6431, 0);
				((Class224) this).anImage6430 = method2089(strings[14], 369629810);
				mediatracker.addImage(((Class224) this).anImage6430, 1);
				((Class224) this).anImage6425 = method2089(strings[15], -981765273);
				mediatracker.addImage(((Class224) this).anImage6425, 2);
				((Class224) this).anImage6449 = method2089(strings[16], -2016782893);
				mediatracker.addImage(((Class224) this).anImage6449, 3);
				((Class224) this).anImage6429 = method2089(strings[17], -967911112);
				mediatracker.addImage(((Class224) this).anImage6429, 4);
				((Class224) this).anImage6434 = method2089(strings[18], -982429791);
				mediatracker.addImage(((Class224) this).anImage6434, 5);
				((Class224) this).anImage6447 = method2089(strings[19], -1870298585);
				mediatracker.addImage(((Class224) this).anImage6447, 6);
				((Class224) this).anImage6436 = method2089(strings[20], 186274003);
				mediatracker.addImage(((Class224) this).anImage6436, 7);
				((Class224) this).anImage6446 = method2089(strings[21], 757154557);
				mediatracker.addImage(((Class224) this).anImage6446, 8);
				mediatracker.waitForAll();
				((Class224) this).anInt6437 = (Class216.method1998(strings[22], (short) -30388) * 1655153121);
			} catch (Exception exception) {
				((Class224) this).aBoolean6426 = true;
			}
		}
		if (((Class224) this).aBoolean6426)
			method2087((byte) 81);
		else {
			Graphics graphics = Class52_Sub2_Sub1.aCanvas9079.getGraphics();
			if (null != graphics) {
				try {
					int i = Class288_Sub1.aClass219_7147.method2038(-15916663);
					String string = Class288_Sub1.aClass219_7147.method2039((short) 32099);
					if (Class298_Sub32_Sub22.anImage9468 == null)
						Class298_Sub32_Sub22.anImage9468 = (Class52_Sub2_Sub1.aCanvas9079.createImage(Class462.anInt5683 * -2110394505, Class298_Sub40_Sub9.anInt9716 * -1111710645));
					Graphics graphics_75_ = Class298_Sub32_Sub22.anImage9468.getGraphics();
					graphics_75_.setColor(Color.BLACK);
					graphics_75_.fillRect(0, 0, Class462.anInt5683 * -2110394505, (Class298_Sub40_Sub9.anInt9716 * -1111710645));
					int i_76_ = ((Class224) this).anImage6447.getWidth(null);
					int i_77_ = ((Class224) this).anImage6436.getWidth(null);
					int i_78_ = ((Class224) this).anImage6446.getWidth(null);
					int i_79_ = ((Class224) this).anImage6447.getHeight(null);
					int i_80_ = ((Class224) this).anImage6436.getHeight(null);
					int i_81_ = ((Class224) this).anImage6446.getHeight(null);
					graphics_75_.drawImage(((Class224) this).anImage6447, (method2086(i_76_, -405273218) + ((Class224) this).anInt6445 * -1077321143 - ((Class224) this).anInt6433 * 510265267 / 2), (method2088(i_79_, -1405353702) + 1216449747 * ((Class224) this).anInt6432), null);
					int i_82_ = (-1077321143 * ((Class224) this).anInt6445 - 510265267 * ((Class224) this).anInt6433 / 2 + i_76_);
					int i_83_ = (510265267 * ((Class224) this).anInt6433 / 2 + -1077321143 * ((Class224) this).anInt6445);
					for (int i_84_ = i_82_; i_84_ <= i_83_; i_84_ += i_78_)
						graphics_75_.drawImage(((Class224) this).anImage6446, (method2086(i_76_, 1304137435) + ((Class224) this).anInt6445 * -1077321143 + i_84_), (method2088(i_81_, -1405353702) + 1216449747 * ((Class224) this).anInt6432), null);
					graphics_75_.drawImage(((Class224) this).anImage6436, (method2086(i_77_, -1173942038) + ((Class224) this).anInt6445 * -1077321143 + ((Class224) this).anInt6433 * 510265267 / 2), (method2088(i_80_, -1405353702) + ((Class224) this).anInt6432 * 1216449747), null);
					int i_85_ = ((Class224) this).anImage6425.getWidth(null);
					int i_86_ = ((Class224) this).anImage6425.getHeight(null);
					int i_87_ = ((Class224) this).anImage6449.getWidth(null);
					int i_88_ = ((Class224) this).anImage6449.getHeight(null);
					int i_89_ = ((Class224) this).anImage6434.getHeight(null);
					int i_90_ = ((Class224) this).anImage6429.getWidth(null);
					int i_91_ = ((Class224) this).anImage6429.getHeight(null);
					int i_92_ = ((Class224) this).anImage6434.getWidth(null);
					int i_93_ = ((Class224) this).anImage6431.getWidth(null);
					int i_94_ = ((Class224) this).anImage6430.getWidth(null);
					int i_95_ = (method2086(-170793393 * ((Class224) this).anInt6443, 928943045) + ((Class224) this).anInt6441 * -1610968945);
					int i_96_ = (method2088(((Class224) this).anInt6444 * -67617177, -1405353702) + ((Class224) this).anInt6442 * 315873069);
					graphics_75_.drawImage(((Class224) this).anImage6425, i_95_, ((-67617177 * ((Class224) this).anInt6444) - i_86_) / 2 + i_96_, null);
					graphics_75_.drawImage(((Class224) this).anImage6449, (i_95_ + -170793393 * ((Class224) this).anInt6443 - i_87_), i_96_ + (((Class224) this).anInt6444 * -67617177 - i_88_) / 2, null);
					if (null == ((Class224) this).anImage6438)
						((Class224) this).anImage6438 = (Class52_Sub2_Sub1.aCanvas9079.createImage((((Class224) this).anInt6443 * -170793393 - i_85_ - i_87_), ((Class224) this).anInt6444 * -67617177));
					Graphics graphics_97_ = ((Class224) this).anImage6438.getGraphics();
					for (int i_98_ = 0; i_98_ < (-170793393 * ((Class224) this).anInt6443 - i_85_ - i_87_); i_98_ += i_90_)
						graphics_97_.drawImage(((Class224) this).anImage6429, i_98_, 0, null);
					for (int i_99_ = 0; i_99_ < (((Class224) this).anInt6443 * -170793393 - i_85_ - i_87_); i_99_ += i_92_)
						graphics_97_.drawImage(((Class224) this).anImage6434, i_99_, ((-67617177 * ((Class224) this).anInt6444) - i_89_), null);
					int i_100_ = i * (((Class224) this).anInt6443 * -170793393 - i_85_ - i_87_) / 100;
					if (i_100_ > 0) {
						Image image = (Class52_Sub2_Sub1.aCanvas9079.createImage(i_100_, (-67617177 * ((Class224) this).anInt6444 - i_91_ - i_89_)));
						int i_101_ = image.getWidth(null);
						Graphics graphics_102_ = image.getGraphics();
						int i_103_ = (32268833 * ((Class224) this).anInt6437 * Class74.method823(1139144319) / 10 % i_93_);
						for (int i_104_ = i_103_ - i_93_; i_104_ < i_101_; i_104_ += i_93_)
							graphics_102_.drawImage((((Class224) this).anImage6431), i_104_, 0, null);
						graphics_97_.drawImage(image, 0, i_91_, null);
					}
					int i_105_ = i_100_;
					i_100_ = (((Class224) this).anInt6443 * -170793393 - i_85_ - i_87_ - i_100_);
					if (i_100_ > 0) {
						Image image = (Class52_Sub2_Sub1.aCanvas9079.createImage(i_100_, (((Class224) this).anInt6444 * -67617177 - i_91_ - i_89_)));
						int i_106_ = image.getWidth(null);
						Graphics graphics_107_ = image.getGraphics();
						for (int i_108_ = 0; i_108_ < i_106_; i_108_ += i_94_)
							graphics_107_.drawImage((((Class224) this).anImage6430), i_108_, 0, null);
						graphics_97_.drawImage(image, i_105_, i_91_, null);
					}
					graphics_75_.drawImage(((Class224) this).anImage6438, i_95_ + i_85_, i_96_, null);
					graphics_75_.setFont(((Class224) this).aFont6435);
					graphics_75_.setColor(((Class224) this).aColor6428);
					graphics_75_.drawString(string, i_95_ + (-170793393 * ((Class224) this).anInt6443 - ((Class224) this).aFontMetrics6427.stringWidth(string)) / 2, (4 + (i_96_ + ((Class224) this).anInt6444 * -67617177 / 2) + ((Class224) this).anInt6448 * 1282855295));
					graphics.drawImage(Class298_Sub32_Sub22.anImage9468, 0, 0, null);
				} catch (Exception exception) {
					((Class224) this).aBoolean6426 = true;
				}
			} else
				Class52_Sub2_Sub1.aCanvas9079.repaint();
		}
	}

	public void method163() {
		/* empty */
	}

	Image method2089(String string, int i) throws IOException {
		try {
			Image image;
			try {
				InputStream inputstream = ClientScriptMap.anApplet6044.getClass().getClassLoader().getResourceAsStream(string);
				byte[] is = new byte[4000];
				int i_109_ = 0;
				int i_110_;
				while ((i_110_ = inputstream.read()) != -1)
					is[i_109_++] = (byte) i_110_;
				Image image_111_ = Toolkit.getDefaultToolkit().createImage(is);
				image = image_111_;
			} catch (Exception exception) {
				throw new IOException();
			}
			return image;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.p(").append(')').toString());
		}
	}

	public int method154() {
		return 100;
	}

	public int method158() {
		return 100;
	}

	public int method161() {
		return 100;
	}

	Class224() {
		/* empty */
	}

	public int method162() {
		return 0;
	}

	static final void method2090(ClientScript2 class403, int i) {
		try {
			int i_112_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (client.anInt8942 * 1131012101 != 0 && i_112_ < client.anInt8952 * -548972447)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = client.aStringArray8954[i_112_];
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.ws(").append(')').toString());
		}
	}

	static final void method2091(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_113_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_114_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			int i_115_ = (Class447.aClass469_5618.method6045(i_113_, (short) -3682).method3460(i_114_, -1821518698).anInt3996 * -1682932563);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_115_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.adr(").append(')').toString());
		}
	}

	static final void method2092(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_116_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_117_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			if (-1 != i_116_) {
				if (i_117_ > 255)
					i_117_ = 255;
				else if (i_117_ < 0)
					i_117_ = 0;
				Class313.method3820(i_116_, i_117_, false, 2142965372);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.anc(").append(')').toString());
		}
	}

	static final void method2093(int i, int i_118_, int i_119_, int i_120_, int i_121_, int i_122_) {
		try {
			int i_123_ = i_120_ - i_118_;
			int i_124_ = i_119_ - i;
			if (i_124_ == 0) {
				if (i_123_ != 0)
					Class492.method6183(i, i_118_, i_120_, i_121_, -1450466434);
			} else if (i_123_ == 0)
				Class474.method6072(i, i_119_, i_118_, i_121_, 458370276);
			else {
				if (i_123_ < 0)
					i_123_ = -i_123_;
				if (i_124_ < 0)
					i_124_ = -i_124_;
				boolean bool = i_123_ > i_124_;
				if (bool) {
					int i_125_ = i;
					int i_126_ = i_119_;
					i = i_118_;
					i_118_ = i_125_;
					i_119_ = i_120_;
					i_120_ = i_126_;
				}
				if (i > i_119_) {
					int i_127_ = i;
					int i_128_ = i_118_;
					i = i_119_;
					i_119_ = i_127_;
					i_118_ = i_120_;
					i_120_ = i_128_;
				}
				int i_129_ = i_118_;
				int i_130_ = i_119_ - i;
				int i_131_ = i_120_ - i_118_;
				int i_132_ = -(i_130_ >> 1);
				int i_133_ = i_118_ < i_120_ ? 1 : -1;
				if (i_131_ < 0)
					i_131_ = -i_131_;
				if (bool) {
					for (int i_134_ = i; i_134_ <= i_119_; i_134_++) {
						Class372_Sub2.anIntArrayArray4047[i_134_][i_129_] = i_121_;
						i_132_ += i_131_;
						if (i_132_ > 0) {
							i_129_ += i_133_;
							i_132_ -= i_130_;
						}
					}
				} else {
					for (int i_135_ = i; i_135_ <= i_119_; i_135_++) {
						Class372_Sub2.anIntArrayArray4047[i_129_][i_135_] = i_121_;
						i_132_ += i_131_;
						if (i_132_ > 0) {
							i_129_ += i_133_;
							i_132_ -= i_130_;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("jm.s(").append(')').toString());
		}
	}
}
