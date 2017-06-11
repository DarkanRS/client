/* Class406 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Iterator;

public final class Class406 {
	public static boolean aBoolean5274;

	Class406() throws Throwable {
		throw new Error();
	}

	static final void method4960(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			long l = (long) (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			long l_0_ = (long) (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) (l + l * l_0_ / 100L);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qw.yx(").append(')').toString());
		}
	}

	static final void method4961(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_1_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			if (null == Class389.aClass119Array4165[i_1_])
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (Class389.aClass119Array4165[i_1_].aClass105Array1405[i_2_].anInt1141) * -914988669;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qw.ale(").append(')').toString());
		}
	}

	static final void decodeNPCUpdate(boolean largeView, int i) {
		try {
			client.anInt8708 = 0;
			client.anInt8808 = 0;
			client.anInt8707 += 1968119283;
			Class467.method6023(1694864911);
			Class508.method6279(largeView, -775686729);
			Class481.decodeNPCsMasks((short) -6102);
			boolean bool_3_ = false;
			for (int i_4_ = 0; i_4_ < client.anInt8708 * -1508392173; i_4_++) {
				int i_5_ = client.anIntArray8709[i_4_];
				Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_5_));
				NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
				if (-1402769421 * class365_sub1_sub1_sub2_sub1.anInt10075 != client.anInt8707 * 440189755) {
					if (Class436.aBoolean5478 && Class518.method6313(i_5_, 351851633))
						Class194.method1868(2025307040);
					if (class365_sub1_sub1_sub2_sub1.aClass503_10190.method6242((byte) 32))
						Class244.method2330(class365_sub1_sub1_sub2_sub1, (byte) 35);
					class365_sub1_sub1_sub2_sub1.method4464(null, 1734282756);
					class298_sub29.unlink(-1460969981);
					bool_3_ = true;
				}
			}
			if (bool_3_) {
				int i_6_ = 1962237353 * client.anInt8772;
				client.anInt8772 = (client.npcs.method5814(1946710966) * -118843751);
				int i_7_ = 0;
				Iterator iterator = client.npcs.iterator();
				while (iterator.hasNext()) {
					Class298_Sub29 class298_sub29 = (Class298_Sub29) iterator.next();
					client.aClass298_Sub29Array8816[i_7_++] = class298_sub29;
				}
				for (int i_8_ = client.anInt8772 * 1962237353; i_8_ < i_6_; i_8_++)
					client.aClass298_Sub29Array8816[i_8_] = null;
			}
			if (385051775 * (((BufferedConnectionContext) client.gameConnection).stream.index) != ((BufferedConnectionContext) client.gameConnection).anInt336 * -866602563) {
				/*
				 * throw new RuntimeException( new StringBuilder() .append(
				 * 385051775 * (((Class25)
				 * client.aClass25_8711).aClass298_Sub53_Sub2_333.index))
				 * .append(" ") .append( -866602563 ((Class25)
				 * client.aClass25_8711).anInt336) .toString());
				 */
			}
			for (int i_9_ = 0; i_9_ < -1230451913 * client.anInt8703; i_9_++) {
				if (client.npcs.get((long) client.anIntArray8699[i_9_]) == null) {
					/*
					 * throw new RuntimeException(new
					 * StringBuilder().append(i_9_)
					 * .append(" ").append(client.anInt8703 * -1230451913)
					 * .toString());
					 */
				}
			}
			if (0 != (client.anInt8772 * 1962237353 - -1230451913 * client.anInt8703)) {
				/*
				 * throw new RuntimeException(new StringBuilder().append("")
				 * .append( client.anInt8772 * 1962237353 - (-1230451913 *
				 * client.anInt8703)) .toString());
				 */
			}
			for (int i_10_ = 0; i_10_ < client.anInt8772 * 1962237353; i_10_++) {
				if (-1402769421 * ((Entity) (client.aClass298_Sub29Array8816[i_10_].anObject7366)).anInt10075 != 440189755 * client.anInt8707) {
					/*
					 * throw new RuntimeException( new StringBuilder()
					 * .append("") .append( ((Entity)
					 * (client.aClass298_Sub29Array8816
					 * [i_10_].anObject7366)).anInt10064 * 1888274983)
					 * .toString());
					 */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qw.jq(").append(')').toString());
		}
	}

	public static final void method4963(int i, String string, Color color, Color color_11_, Color color_12_, byte i_13_) {
		try {
			do {
				try {
					Graphics graphics = Class52_Sub2_Sub1.aCanvas9079.getGraphics();
					if (Class285.aFont3082 == null)
						Class285.aFont3082 = new Font("Helvetica", 1, 13);
					if (null == color)
						color = new Color(140, 17, 17);
					if (color_11_ == null)
						color_11_ = new Color(140, 17, 17);
					if (color_12_ == null)
						color_12_ = new Color(255, 255, 255);
					try {
						if (Class298_Sub32_Sub22.anImage9468 == null)
							Class298_Sub32_Sub22.anImage9468 = (Class52_Sub2_Sub1.aCanvas9079.createImage(-2110394505 * Class462.anInt5683, (Class298_Sub40_Sub9.anInt9716 * -1111710645)));
						Graphics graphics_14_ = Class298_Sub32_Sub22.anImage9468.getGraphics();
						graphics_14_.setColor(Color.black);
						graphics_14_.fillRect(0, 0, -2110394505 * Class462.anInt5683, (Class298_Sub40_Sub9.anInt9716 * -1111710645));
						int i_15_ = Class462.anInt5683 * -2110394505 / 2 - 152;
						int i_16_ = (-1111710645 * Class298_Sub40_Sub9.anInt9716 / 2 - 18);
						graphics_14_.setColor(color_11_);
						graphics_14_.drawRect(i_15_, i_16_, 303, 33);
						graphics_14_.setColor(color);
						graphics_14_.fillRect(i_15_ + 2, i_16_ + 2, i * 3, 30);
						graphics_14_.setColor(Color.black);
						graphics_14_.drawRect(i_15_ + 1, i_16_ + 1, 301, 31);
						graphics_14_.fillRect(i * 3 + (2 + i_15_), i_16_ + 2, 300 - 3 * i, 30);
						graphics_14_.setFont(Class285.aFont3082);
						graphics_14_.setColor(color_12_);
						graphics_14_.drawString(string, i_15_ + (304 - (string.length() * 6)) / 2, 22 + i_16_);
						if (Class291.aString6485 != null) {
							graphics_14_.setFont(Class285.aFont3082);
							graphics_14_.setColor(color_12_);
							graphics_14_.drawString(Class291.aString6485, (-2110394505 * Class462.anInt5683 / 2 - Class291.aString6485.length() * 6 / 2), (Class298_Sub40_Sub9.anInt9716 * -1111710645 / 2) - 26);
						}
						graphics.drawImage(Class298_Sub32_Sub22.anImage9468, 0, 0, null);
					} catch (Exception exception) {
						graphics.setColor(Color.black);
						graphics.fillRect(0, 0, -2110394505 * Class462.anInt5683, (Class298_Sub40_Sub9.anInt9716 * -1111710645));
						int i_17_ = -2110394505 * Class462.anInt5683 / 2 - 152;
						int i_18_ = (Class298_Sub40_Sub9.anInt9716 * -1111710645 / 2 - 18);
						graphics.setColor(color_11_);
						graphics.drawRect(i_17_, i_18_, 303, 33);
						graphics.setColor(color);
						graphics.fillRect(i_17_ + 2, i_18_ + 2, 3 * i, 30);
						graphics.setColor(Color.black);
						graphics.drawRect(i_17_ + 1, 1 + i_18_, 301, 31);
						graphics.fillRect(i * 3 + (i_17_ + 2), 2 + i_18_, 300 - i * 3, 30);
						graphics.setFont(Class285.aFont3082);
						graphics.setColor(color_12_);
						if (null != Class291.aString6485) {
							graphics.setFont(Class285.aFont3082);
							graphics.setColor(color_12_);
							graphics.drawString(Class291.aString6485, ((Class462.anInt5683 * -2110394505 / 2) - Class291.aString6485.length() * 6 / 2), (Class298_Sub40_Sub9.anInt9716 * -1111710645 / 2) - 26);
						}
						graphics.drawString(string, i_17_ + ((304 - string.length() * 6) / 2), 22 + i_18_);
						break;
					}
					break;
				} catch (Exception exception) {
					Class52_Sub2_Sub1.aCanvas9079.repaint();
					break;
				}
			} while (false);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("qw.av(").append(')').toString());
		}
	}
}
