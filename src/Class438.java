
/* Class438 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class438 {
	Index aClass317_5341;
	SoftCache aClass229_5342;
	Index aClass317_5343;
	SoftCache aClass229_5344 = new SoftCache(64);

	public void method7324(int i) {
		synchronized (((Class438) this).aClass229_5344) {
			((Class438) this).aClass229_5344.method3859(1982287383);
		}
		synchronized (((Class438) this).aClass229_5342) {
			((Class438) this).aClass229_5342.method3859(378665676);
		}
	}

	public Class419 method7325(int i, int i_0_) {
		Class419 class419;
		synchronized (((Class438) this).aClass229_5344) {
			class419 = ((Class419) ((Class438) this).aClass229_5344.get((long) i));
		}
		if (class419 != null)
			return class419;
		byte[] is;
		synchronized (((Class438) this).aClass317_5343) {
			is = ((Class438) this).aClass317_5343.getFile(((SharedConfigsType.aClass120_1496.id) * -71319279), i);
		}
		class419 = new Class419();
		((Class419) class419).aClass438_5001 = this;
		if (null != is)
			class419.method7024(new RsByteBuffer(is), 2098733573);
		synchronized (((Class438) this).aClass229_5344) {
			((Class438) this).aClass229_5344.put(class419, (long) i);
		}
		return class419;
	}

	public void method7326(int i, int i_1_) {
		synchronized (((Class438) this).aClass229_5344) {
			((Class438) this).aClass229_5344.method3858(i, (byte) -55);
		}
		synchronized (((Class438) this).aClass229_5342) {
			((Class438) this).aClass229_5342.method3858(i, (byte) 18);
		}
	}

	public void method7327(int i) {
		synchronized (((Class438) this).aClass229_5344) {
			((Class438) this).aClass229_5344.method3863(1594658345);
		}
		synchronized (((Class438) this).aClass229_5342) {
			((Class438) this).aClass229_5342.method3863(725307198);
		}
	}

	public Class438(Game class486, XLanguage class495, Index class317, Index class317_2_) {
		((Class438) this).aClass229_5342 = new SoftCache(2);
		((Class438) this).aClass317_5343 = class317;
		((Class438) this).aClass317_5341 = class317_2_;
		((Class438) this).aClass317_5343.filesCount((SharedConfigsType.aClass120_1496.id) * -71319279);
	}

	public Class419 method7328(int i) {
		Class419 class419;
		synchronized (((Class438) this).aClass229_5344) {
			class419 = ((Class419) ((Class438) this).aClass229_5344.get((long) i));
		}
		if (class419 != null)
			return class419;
		byte[] is;
		synchronized (((Class438) this).aClass317_5343) {
			is = ((Class438) this).aClass317_5343.getFile(((SharedConfigsType.aClass120_1496.id) * -71319279), i);
		}
		class419 = new Class419();
		((Class419) class419).aClass438_5001 = this;
		if (null != is)
			class419.method7024(new RsByteBuffer(is), 1997893572);
		synchronized (((Class438) this).aClass229_5344) {
			((Class438) this).aClass229_5344.put(class419, (long) i);
		}
		return class419;
	}

	public Class419 method7329(int i) {
		Class419 class419;
		synchronized (((Class438) this).aClass229_5344) {
			class419 = ((Class419) ((Class438) this).aClass229_5344.get((long) i));
		}
		if (class419 != null)
			return class419;
		byte[] is;
		synchronized (((Class438) this).aClass317_5343) {
			is = ((Class438) this).aClass317_5343.getFile(((SharedConfigsType.aClass120_1496.id) * -71319279), i);
		}
		class419 = new Class419();
		((Class419) class419).aClass438_5001 = this;
		if (null != is)
			class419.method7024(new RsByteBuffer(is), 2089587924);
		synchronized (((Class438) this).aClass229_5344) {
			((Class438) this).aClass229_5344.put(class419, (long) i);
		}
		return class419;
	}

	public void method7330() {
		synchronized (((Class438) this).aClass229_5344) {
			((Class438) this).aClass229_5344.method3859(-1097504552);
		}
		synchronized (((Class438) this).aClass229_5342) {
			((Class438) this).aClass229_5342.method3859(-598164768);
		}
	}

	public void method7331() {
		synchronized (((Class438) this).aClass229_5344) {
			((Class438) this).aClass229_5344.method3859(-838705536);
		}
		synchronized (((Class438) this).aClass229_5342) {
			((Class438) this).aClass229_5342.method3859(1532635622);
		}
	}

	static final void method7332(CS2Executor class527, byte i) {
		Class337.method6018(((Class521_Sub1) class527.anInterface12_7013), class527, 1876481461);
	}

	public static final void method7333(boolean bool, int i) {
		Class184[] class184s = client.aClass184Array7220;
		for (int i_3_ = 0; i_3_ < class184s.length; i_3_++) {
			Class184 class184 = class184s[i_3_];
			try {
				class184.method3047(1513639473);
			} catch (IOException ioexception) {
				/* empty */
			}
			class184.method3051((byte) -59);
		}
		JS5StandardRequester.method5558(-500941691);
		Class356.method6227(false, (byte) -48);
		IndexLoaders.MAP_REGION_DECODER.method4444(1869336559);
		IndexLoaders.MAP_REGION_DECODER.method4485(-756888037);
		Class122.method2111(false, 662490589);
		Class358.method6240(2, 1510969650);
		Class260.anInt3223 = -919080253;
		Class260.aBool3220 = false;
		Class468_Sub6.method12658(-111108219);
		ClipMap.method6008(true, (byte) 8);
		Class459.method7678(-1273832193);
		Class204.method3367(-2146743661);
		Class42_Sub1.method14562(1915286568);
		if (bool)
			Class365.setGameState(12, 1408893156);
		else {
			Class365.setGameState(5, 1704453778);
			try {
				Class441.method7377(Class282_Sub44.anApplet8065, "loggedout", 1769975690);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}

	static final void method7334(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub8_8219.method12675(-1589433086) == 1 ? 1 : 0;
	}

	static void method7335(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool, int i_17_) {
		if (i_4_ != 0 && i_6_ != -1) {
			Animable class521_sub1_sub1_sub2 = null;
			if (i_4_ < 0) {
				int i_18_ = -i_4_ - 1;
				if (i_18_ == 1595512269 * client.anInt7315)
					class521_sub1_sub1_sub2 = Class84.myPlayer;
				else
					class521_sub1_sub1_sub2 = client.players[i_18_];
			} else {
				int i_19_ = i_4_ - 1;
				Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_19_));
				if (null != class282_sub47)
					class521_sub1_sub1_sub2 = ((Animable) class282_sub47.anObject8068);
			}
			if (class521_sub1_sub1_sub2 != null) {
				RenderAnimDefs class227 = class521_sub1_sub1_sub2.getRenderAnimDefs((byte) -17);
				if (class227.anIntArrayArray2802 != null && class227.anIntArrayArray2802[i_6_] != null)
					i_7_ -= class227.anIntArrayArray2802[i_6_][1];
				if (class227.anIntArrayArray2791 != null && null != class227.anIntArrayArray2791[i_6_])
					i_7_ -= class227.anIntArrayArray2791[i_6_][1];
			}
		}
		Class521_Sub1_Sub1_Sub3 class521_sub1_sub1_sub3 = (new Class521_Sub1_Sub1_Sub3(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1810939972), i, Class272.anInt3331 * -1258088735, Class272.anInt3331 * -1258088735, i_9_, i_10_, i_7_, i_13_ + -1809259861 * client.cycles, -1809259861 * client.cycles + i_14_, i_15_, i_16_, i_4_, i_5_, i_8_, bool, i_6_));
		class521_sub1_sub1_sub3.method15904(i_11_, i_12_, (Class504.method8389(i_11_, i_12_, -1258088735 * Class272.anInt3331, (byte) 65) - i_8_), client.cycles * -1809259861 + i_13_, -209443166);
		client.aClass482_7333.append(new Class282_Sub50_Sub16(class521_sub1_sub1_sub3), -1750493342);
	}
}
