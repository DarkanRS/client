/* Class517 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.io.IOException;

public class Class517 {
	Class348 aClass348_6267 = new Class348(64);
	public int anInt6268;
	Class243 aClass243_6269;
	public static Class243 aClass243_6270;

	public void method6304(int i, int i_0_) {
		try {
			synchronized (((Class517) this).aClass348_6267) {
				((Class517) this).aClass348_6267.method4186(i, -583338746);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vt.b(").append(')').toString());
		}
	}

	public void method6305(int i) {
		try {
			synchronized (((Class517) this).aClass348_6267) {
				((Class517) this).aClass348_6267.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vt.f(").append(')').toString());
		}
	}

	public void method6306(byte i) {
		try {
			synchronized (((Class517) this).aClass348_6267) {
				((Class517) this).aClass348_6267.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vt.p(").append(')').toString());
		}
	}

	public Class520 method6307(int i, int i_1_) {
		try {
			Class520 class520;
			synchronized (((Class517) this).aClass348_6267) {
				class520 = (Class520) ((Class517) this).aClass348_6267.method4184((long) i);
			}
			if (class520 != null)
				return class520;
			byte[] is;
			synchronized (((Class517) this).aClass243_6269) {
				is = (((Class517) this).aClass243_6269.method2315(Class120.aClass120_1452.anInt1460 * -1006924897, i, (byte) -91));
			}
			class520 = new Class520();
			if (is != null)
				class520.method6321(new RsByteBuffer(is), -1099657695);
			synchronized (((Class517) this).aClass348_6267) {
				((Class517) this).aClass348_6267.method4194(class520, (long) i);
			}
			return class520;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vt.a(").append(')').toString());
		}
	}

	public Class517(Class411 class411, Class429 class429, Class243 class243) {
		((Class517) this).aClass243_6269 = class243;
		if (((Class517) this).aClass243_6269 != null)
			anInt6268 = (((Class517) this).aClass243_6269.method2316(-1006924897 * Class120.aClass120_1452.anInt1460, 650803238)) * 2084802537;
		else
			anInt6268 = 0;
	}

	static void method6308(GraphicsToolkit class_ra, int i) {
		try {
			if (Class522.aClass453_6283.method5948(1828905535) != 0) {
				if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-627187888) == 0) {
					for (Class298_Sub14 class298_sub14 = (Class298_Sub14) Class522.aClass453_6283.method5939(1766612795); null != class298_sub14; class298_sub14 = ((Class298_Sub14) Class522.aClass453_6283.method5944(49146))) {
						Class298_Sub32_Sub14.aClass477_9400.method6086(class_ra, class_ra, (-1979936541 * ((Class298_Sub14) class298_sub14).anInt7264), (((Class298_Sub14) class298_sub14).anInt7261 * -751580615), (1613862267 * ((Class298_Sub14) class298_sub14).anInt7263), (((Class298_Sub14) class298_sub14).anInt7260 * -944151257), false, false, (-1216336855 * ((Class298_Sub14) class298_sub14).anInt7262), Script.aClass264_7534,
								(((Class298_Sub14) class298_sub14).aBoolean7265 ? (Class287.myPlayer.aClass366_10209) : null), 1788760477);
						class298_sub14.unlink(-1460969981);
					}
					Class360.method4301(-1387034810);
				} else {
					if (null == Class522.aClass_ra6285) {
						Canvas canvas = new Canvas();
						canvas.setSize(36, 32);
						Class522.aClass_ra6285 = Class523.method6334(0, canvas, Class253.anInterface_ma2785, Class82_Sub6.aClass243_6844, 0, -753690122);
						Class522.aClass264_6284 = (Class522.aClass_ra6285.method5092(Class322.method3931(Class173.aClass243_1758, (399302739 * Class74.anInt691), 0, (byte) 78), Class89.method993(Class158.aClass243_6364, Class74.anInt691 * 399302739, 0), true));
					}
					for (Class298_Sub14 class298_sub14 = (Class298_Sub14) Class522.aClass453_6283.method5939(1766612795); null != class298_sub14; class298_sub14 = ((Class298_Sub14) Class522.aClass453_6283.method5944(49146))) {
						Class298_Sub32_Sub14.aClass477_9400.method6086(Class522.aClass_ra6285, class_ra, (((Class298_Sub14) class298_sub14).anInt7264 * -1979936541), (((Class298_Sub14) class298_sub14).anInt7261 * -751580615), (((Class298_Sub14) class298_sub14).anInt7263 * 1613862267), (((Class298_Sub14) class298_sub14).anInt7260 * -944151257), false, false, (-1216336855 * ((Class298_Sub14) class298_sub14).anInt7262), Class522.aClass264_6284,
								(((Class298_Sub14) class298_sub14).aBoolean7265 ? (Class287.myPlayer.aClass366_10209) : null), 1451736551);
						class298_sub14.unlink(-1460969981);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vt.f(").append(')').toString());
		}
	}

	static final void method6309(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]);
			Class497 class497 = Class92.aClass504_905.method6251(i_3_, 1417186539);
			if (class497.method6206(1883696427))
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = Class15.aClass507_224.method6269(i_2_, 745591351).method6245(i_3_, class497.aString6101, 1273707892);
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (Class15.aClass507_224.method6269(i_2_, 1830480683).method6239(i_3_, -388931549 * class497.anInt6100, (byte) 106));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vt.abu(").append(')').toString());
		}
	}

	public static void method6310(boolean bool, int i) {
		try {
			Class247.method2365(2092159420);
			if (Class435.method5804(client.anInt8752 * -1233866115, (byte) -21)) {
				BufferedConnectionContext[] class25s = client.connectionContexts;
				for (int i_4_ = 0; i_4_ < class25s.length; i_4_++) {
					BufferedConnectionContext class25 = class25s[i_4_];
					class25.anInt339 += 1797987493;
					if (class25.anInt339 * 2033675053 < 50 && !bool)
						return;
					class25.anInt339 = 0;
					if (!class25.aBoolean347 && class25.method387(537308016) != null) {
						Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.PING_PACKET, class25.aClass449_330, (byte) 20);
						class25.method390(class298_sub36, (byte) -114);
						try {
							class25.method386(-1411124831);
						} catch (IOException ioexception) {
							class25.aBoolean347 = true;
						}
					}
				}
				Class247.method2365(1802810094);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("vt.a(").append(')').toString());
		}
	}
}
