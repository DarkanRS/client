/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public abstract class Class247 {
	Class461 aClass461_2732;
	static int anInt2733 = 512;
	static int anInt2734 = 20;
	public volatile int anInt2735;
	Class461 aClass461_2736 = new Class461();
	RsByteBuffer buffer;
	Class461 aClass461_2738;
	static int anInt2739 = 50;
	int lastUpdate;
	long aLong2741;
	Class461 aClass461_2742 = new Class461();
	byte aByte2743;
	RsByteBuffer aClass298_Sub53_2744;
	public volatile int anInt2745;
	static int anInt2746 = 3;
	Class298_Sub37_Sub16_Sub1 aClass298_Sub37_Sub16_Sub1_2747;
	public static long aLong2748;

	abstract void method2337();

	Class298_Sub37_Sub16_Sub1 method2338(int i, int i_0_, byte i_1_, boolean bool, int i_2_) {
		try {
			long l = ((long) i << 32) + (long) i_0_;
			Class298_Sub37_Sub16_Sub1 class298_sub37_sub16_sub1 = new Class298_Sub37_Sub16_Sub1();
			class298_sub37_sub16_sub1.aLong7406 = 1476940603538232441L * l;
			((Class298_Sub37_Sub16_Sub1) class298_sub37_sub16_sub1).aByte10003 = i_1_;
			((Class298_Sub37_Sub16_Sub1) class298_sub37_sub16_sub1).aBoolean9672 = bool;
			if (bool) {
				if (method2348(2080324549) >= 50)
					throw new RuntimeException();
				((Class247) this).aClass461_2736.method5982(class298_sub37_sub16_sub1, (byte) -14);
			} else {
				if (method2341(144457290) >= 20)
					throw new RuntimeException();
				((Class247) this).aClass461_2738.method5982(class298_sub37_sub16_sub1, (byte) -22);
			}
			return class298_sub37_sub16_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.a(").append(')').toString());
		}
	}

	public abstract void method2339();

	boolean method2340(byte i) {
		try {
			return method2348(1959855858) >= 50;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.b(").append(')').toString());
		}
	}

	int method2341(int i) {
		try {
			return (((Class247) this).aClass461_2738.method5986((short) -13891) + ((Class247) this).aClass461_2732.method5986((short) -16314));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.p(").append(')').toString());
		}
	}

	public abstract void method2342(Object object, boolean bool);

	Class247() {
		((Class247) this).aClass461_2738 = new Class461();
		((Class247) this).aClass461_2732 = new Class461();
		((Class247) this).aClass298_Sub53_2744 = new RsByteBuffer(6);
		((Class247) this).aByte2743 = (byte) 0;
		anInt2735 = 0;
		anInt2745 = 0;
		((Class247) this).buffer = new RsByteBuffer(10);
	}

	public abstract void method2343(boolean bool, int i);

	public abstract void method2344(Object object, boolean bool, int i);

	public abstract void method2345(byte i);

	public abstract void method2346(byte i);

	boolean method2347(byte i) {
		try {
			return method2341(-938507058) >= 20;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.f(").append(')').toString());
		}
	}

	public int method2348(int i) {
		try {
			return (((Class247) this).aClass461_2736.method5986((short) -18478) + ((Class247) this).aClass461_2742.method5986((short) -10486));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.i(").append(')').toString());
		}
	}

	public abstract boolean method2349();

	abstract void method2350();

	public abstract boolean method2351(int i);

	public abstract void method2352(Object object, boolean bool);

	public abstract void method2353(short i);

	public abstract void method2354(boolean bool);

	public abstract void method2355();

	public abstract void method2356();

	public abstract void method2357();

	public abstract void method2358();

	abstract void method2359(int i);

	public abstract void method2360();

	public abstract void method2361();

	static final void decodePlayerUpdate(RsBitsBuffer stream, int i, int i_3_) {
		try {
			Class10.anInt139 = 0;
			Class365_Sub1_Sub5_Sub2.method4536(stream, (byte) -53);
			Class82_Sub7.decodePlayersMasks(stream, -2052480320);
			if (stream.index * 385051775 != i)
				throw new RuntimeException(new StringBuilder().append(385051775 * (stream.index)).append(" ").append(i).toString());
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.f(").append(')').toString());
		}
	}

	static final void method2363(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			class105.aBoolean1181 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) == 1;
			Tradution.method6054(class105, -270865215);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.fm(").append(')').toString());
		}
	}

	static final void method2364(ClientScript2 class403, byte i) {
		try {
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_4_, (byte) 36);
			Class119 class119 = Class389.aClass119Array4165[i_4_ >> 16];
			Class388.method4854(class105, class119, class403, (byte) 16);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.gz(").append(')').toString());
		}
	}

	public static void method2365(int i) {
		try {
			if (Class300.aClass284_3212 != null)
				Class300.aClass284_3212.method2680(720263824);
			if (null != Class3.aClass284_68)
				Class3.aClass284_68.method2680(-1003086851);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.d(").append(')').toString());
		}
	}

	public static int method2366(Class298_Sub37_Sub15 class298_sub37_sub15, byte i) {
		try {
			if (Class436.aBoolean5478)
				return 6;
			if (null == class298_sub37_sub15)
				return 0;
			int i_5_ = (946432351 * ((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662);
			if (Class214.method1993(i_5_, 1867074090))
				return 1;
			if (Class398.method4920(i_5_, (short) 300))
				return 2;
			if (Class395.method4907(i_5_, (byte) 55))
				return 3;
			if (Class302.method3716(i_5_, -1710245740))
				return 4;
			if (Class493.method6189(i_5_, (byte) 120))
				return 7;
			if (16 == i_5_)
				return 8;
			return 5;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.ap(").append(')').toString());
		}
	}

	static final void method2367(ClientScript2 class403, int i) {
		try {
			Class298_Sub52 class298_sub52 = Class236.method2190(1470671507);
			if (null == class298_sub52) {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
			} else {
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -530122905 * class298_sub52.anInt7608;
				int i_6_ = (-1740053407 * class298_sub52.anInt7605 << 28 | (2122110429 * class298_sub52.anInt7607 + Class301.anInt3245) << 14 | (Class301.anInt3238 + -372920341 * class298_sub52.anInt7610));
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = i_6_;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.adz(").append(')').toString());
		}
	}

	public static String method2368(int i, int i_7_) {
		try {
			return new StringBuilder().append("<img=").append(i).append(">").toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.a(").append(')').toString());
		}
	}

	static final void method2369(ClientScript2 class403, int i) {
		try {
			Class390.method4875(Class_na.method3476(1476588124), class403, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.uh(").append(')').toString());
		}
	}

	static final boolean method2370(BufferedConnectionContext class25, int i) {
		try {
			boolean bool;
			try {
				bool = PacketsDecoder.method4548(class25, -1028317786);
			} catch (IOException ioexception) {
				if (18 == -1233866115 * client.anInt8752) {
					class25.method385(1607816785);
					return false;
				}
				SubIncommingPacket.method1923(-196070211);
				return true;
			} catch (Exception exception) {
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				String string = new StringBuilder().append(((BufferedConnectionContext) class25).INCOMMING_PACKET != null ? (2075990793 * ((BufferedConnectionContext) class25).INCOMMING_PACKET.anInt2187) : -1).append(Class26.aString353).append(((BufferedConnectionContext) class25).aClass202_345 != null ? (2075990793 * ((BufferedConnectionContext) class25).aClass202_345.anInt2187) : -1).append(Class26.aString353).append(null != ((BufferedConnectionContext) class25).aClass202_348 ? (2075990793 * ((BufferedConnectionContext) class25).aClass202_348.anInt2187) : -1).append(" ")
						.append(((BufferedConnectionContext) class25).anInt336 * -866602563).append(Class26.aString353).append(-1760580017 * class341.gameSceneBaseX + (Class287.myPlayer.scenePositionXQueue[0])).append(Class26.aString353).append(283514611 * class341.gameSceneBaseY + (Class287.myPlayer.scenePositionYQueue[0])).append(" ").toString();
				for (int i_8_ = 0; (i_8_ < -866602563 * ((BufferedConnectionContext) class25).anInt336 && i_8_ < 50); i_8_++)
					string = new StringBuilder().append(string).append(((BufferedConnectionContext) class25).stream.buffer[i_8_]).append(Class26.aString353).toString();
				Class464.method6062(string, exception, (short) -6614);
				Class216.method2001(false, (byte) 71);
				return true;
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.jc(").append(')').toString());
		}
	}

	public static void method2371(byte i) {
		try {
			Class360.method4300(-1349846936);
			ClientScriptsExecutor.aClass374_Sub1_4125.method4626(2074664377);
			ClientScriptsExecutor.aClass374_Sub2_4121.method4626(2003457775);
			if (-1625219821 * client.anInt8687 > 0) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_1994, client.gameConnection.aClass449_330, (byte) 79);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(2089055308 * client.anInt8687, 16711935);
				for (int i_9_ = 0; i_9_ < client.anInt8687 * -1625219821; i_9_++) {
					Interface16 interface16 = client.anInterface16Array8688[i_9_];
					long l = (interface16.method216(-1501300299) - -4339417020449565913L * ClientScriptsExecutor.aLong4123);
					if (l > 16777215L)
						l = 16777215L;
					ClientScriptsExecutor.aLong4123 = (interface16.method216(-2043012774) * -7881601697932874601L);
					class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(interface16.method218((byte) -114));
					class298_sub36.aClass298_Sub53_Sub2_7396.putTriByte((int) l, (byte) 52);
				}
				client.gameConnection.method390(class298_sub36, (byte) -79);
			}
			if (ClientScriptsExecutor.anInt4120 * -2116412357 > 0)
				ClientScriptsExecutor.anInt4120 -= -1604952845;
			if (client.aBoolean8763 && ClientScriptsExecutor.anInt4120 * -2116412357 <= 0) {
				ClientScriptsExecutor.anInt4120 = -2034285828;
				client.aBoolean8763 = false;
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.MOVE_CAMERA_PACKET, client.gameConnection.aClass449_330, (byte) 50);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeShort128((int) client.aFloat8757 >> 3);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE((int) client.aFloat8949 >> 3, 1908840395);
				client.gameConnection.method390(class298_sub36, (byte) -20);
			}
			if (ClientScriptsExecutor.aBoolean4122 != Class422_Sub7.aBoolean8385) {
				ClientScriptsExecutor.aBoolean4122 = Class422_Sub7.aBoolean8385;
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2063, client.gameConnection.aClass449_330, (byte) 90);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(Class422_Sub7.aBoolean8385 ? 1 : 0);
				client.gameConnection.method390(class298_sub36, (byte) -44);
			}
			if (!client.aBoolean8666) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2003, client.gameConnection.aClass449_330, (byte) 9);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(0);
				int i_10_ = (385051775 * class298_sub36.aClass298_Sub53_Sub2_7396.index);
				RsByteBuffer class298_sub53 = Class422_Sub25.aClass298_Sub48_8425.method3542(-49990428);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeBytes(class298_sub53.buffer, 0, 385051775 * class298_sub53.index, (short) -16962);
				class298_sub36.aClass298_Sub53_Sub2_7396.method3649((class298_sub36.aClass298_Sub53_Sub2_7396.index * 385051775) - i_10_, (byte) -113);
				client.gameConnection.method390(class298_sub36, (byte) -84);
				client.aBoolean8666 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.d(").append(')').toString());
		}
	}

	static void method2372(GraphicsToolkit class_ra, int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		try {
			if ((null == Class486.aClass57_6062 || null == Class501.aClass57_6123 || Class367.aClass57_4001 == null) && Class158.aClass243_6364.method2310(Class162.anInt1680 * 1049272911, -457216440) && Class158.aClass243_6364.method2310(Class361.anInt3914 * -745532315, -457216440) && Class158.aClass243_6364.method2310((-684155443 * Class260.anInt2820), -457216440)) {
				Class89 class89 = Class89.method987(Class158.aClass243_6364, -745532315 * Class361.anInt3914, 0);
				Class501.aClass57_6123 = class_ra.method5125(class89, true);
				class89.method992();
				Class82_Sub8.aClass57_6855 = class_ra.method5125(class89, true);
				Class486.aClass57_6062 = (class_ra.method5125(Class89.method987(Class158.aClass243_6364, 1049272911 * Class162.anInt1680, 0), true));
				Class89 class89_16_ = Class89.method987(Class158.aClass243_6364, Class260.anInt2820 * -684155443, 0);
				Class367.aClass57_4001 = class_ra.method5125(class89_16_, true);
				class89_16_.method992();
				Class373.aClass57_4070 = class_ra.method5125(class89_16_, true);
			}
			if (null != Class486.aClass57_6062 && Class501.aClass57_6123 != null && Class367.aClass57_4001 != null) {
				int i_17_ = ((i_12_ - Class367.aClass57_4001.method623() * 2) / Class486.aClass57_6062.method623());
				for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
					Class486.aClass57_6062.method645((i + Class367.aClass57_4001.method623() + i_18_ * Class486.aClass57_6062.method623()), i_11_ + i_13_ - Class486.aClass57_6062.method625());
				int i_19_ = ((i_13_ - i_14_ - Class367.aClass57_4001.method625()) / Class501.aClass57_6123.method625());
				for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
					Class501.aClass57_6123.method645(i, (i_14_ + i_11_ + i_20_ * Class501.aClass57_6123.method625()));
					Class82_Sub8.aClass57_6855.method645(i_12_ + i - Class82_Sub8.aClass57_6855.method623(), (i_14_ + i_11_ + i_20_ * Class501.aClass57_6123.method625()));
				}
				Class367.aClass57_4001.method645(i, (i_13_ + i_11_ - Class367.aClass57_4001.method625()));
				Class373.aClass57_4070.method645(i_12_ + i - Class367.aClass57_4001.method623(), i_11_ + i_13_ - Class367.aClass57_4001.method625());
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.am(").append(')').toString());
		}
	}

	static final void method2373(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_21_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_22_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			Class461 class461 = Class301.method3693(i_21_ >> 14 & 0x3fff, i_21_ & 0x3fff);
			boolean bool = false;
			for (Class298_Sub37_Sub13 class298_sub37_sub13 = (Class298_Sub37_Sub13) class461.method5984(1544902477); class298_sub37_sub13 != null; class298_sub37_sub13 = ((Class298_Sub37_Sub13) class461.method5985(1578702645))) {
				if (-947282109 * class298_sub37_sub13.anInt9643 == i_22_) {
					bool = true;
					break;
				}
			}
			if (bool)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.ael(").append(')').toString());
		}
	}

	static final void method2374(ClientScript2 class403, int i) {
		try {
			int i_23_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_24_ = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7587.method5726(-2143149199);
			if (i_23_ != i_24_ && (Class300.anInt3210 * 782166935 == Class300.anInt3207 * -1256171511)) {
				if (!Class435.method5804(client.anInt8752 * -1233866115, (byte) 33)) {
					if (0 == i_24_) {
						Class477.method6096(Class374_Sub1.aClass243_7731, -1256171511 * Class300.anInt3207, 0, i_23_, false, -2072200222);
						Class14.method344(791572932);
						Class300.aBoolean3208 = false;
					} else if (i_23_ == 0) {
						Class134.method1489((byte) -3);
						Class300.aBoolean3208 = false;
					} else
						Class70.method801(i_23_, -1911723714);
				}
				Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7587, i_23_, -1422708524);
				Class3.method300(656179282);
				client.aBoolean8666 = false;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.ajq(").append(')').toString());
		}
	}

	public static boolean method2375(char c, int i) {
		try {
			if (c >= ' ' && c <= '~')
				return true;
			if (c >= '\u00a0' && c <= '\u00ff')
				return true;
			if (c == '\u20ac' || '\u0152' == c || c == '\u2014' || c == '\u0153' || c == '\u0178')
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.v(").append(')').toString());
		}
	}

	static void method2376(int i) {
		try {
			for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5939(1766612795)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5944(49146))) {
				if (Class214.method1993(946432351 * (((Class298_Sub37_Sub15) class298_sub37_sub15).anInt9662), 1804726647))
					Class285.method2714(class298_sub37_sub15, (byte) 5);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ki.w(").append(')').toString());
		}
	}
}
