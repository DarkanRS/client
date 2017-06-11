/* Class477 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class477 {
	public int itemDefinitionsLength;
	String[] aStringArray5988;
	Class504 aClass504_5989;
	Class243 aClass243_5990;
	int anInt5991;
	Class243 aClass243_5992;
	Class348 aClass348_5993 = new Class348(64);
	Class348 aClass348_5994 = new Class348(50);
	public Class340 aClass340_5995 = new Class340(250);
	Class465 aClass465_5996 = new Class465();
	Class429 aClass429_5997;
	Class411 aClass411_5998;
	boolean aBoolean5999;
	String[] aStringArray6000;
	public static Class500 aClass500_6001;

	public ItemDefinitions getItemDefinitions(int itemId) {
		return getItemDefinitions(itemId, false);
	}

	public static boolean OLD_ITEMS;

	public static void switchItems(boolean old) {
		if (old == OLD_ITEMS)
			return;
		OLD_ITEMS = old;
		Class223.method2082(false, -1663847334);
	}

	public ItemDefinitions getItemDefinitions(int itemId, boolean forceNew) {
		try {
			ItemDefinitions itemdefinition;

			if (!forceNew) {
				synchronized (((Class477) this).aClass348_5993) {
					itemdefinition = (ItemDefinitions) ((Class477) this).aClass348_5993.method4184((long) itemId);
				}
				if (itemdefinition != null)
					return itemdefinition;
			}

			boolean oldItem = false;

			byte[] is = null;

			if (!forceNew && OLD_ITEMS) {
				is = (((Class477) this).aClass243_5990.method2315(Class120.aClass120_1429.method1307(itemId + (Class298_Sub32_Sub14.aClass477_9400.itemDefinitionsLength * -888767613), -100335020), Class120.aClass120_1429.method1305(itemId + (Class298_Sub32_Sub14.aClass477_9400.itemDefinitionsLength * -888767613), -1698958016), (byte) -74));
				oldItem = true;
			}
			if (is == null) {
				synchronized (((Class477) this).aClass243_5990) {
					is = (((Class477) this).aClass243_5990.method2315(Class120.aClass120_1429.method1307(itemId, -100335020), Class120.aClass120_1429.method1305(itemId, -1698958016), (byte) -74));
					oldItem = false;
				}
			}
			itemdefinition = new ItemDefinitions();
			((ItemDefinitions) itemdefinition).aClass477_5751 = this;
			((ItemDefinitions) itemdefinition).anInt5740 = 1824752127 * itemId;
			itemdefinition.aStringArray5723 = (String[]) ((Class477) this).aStringArray5988.clone();
			itemdefinition.aStringArray5732 = (String[]) ((Class477) this).aStringArray6000.clone();
			if (null != is)
				itemdefinition.decode(new RsByteBuffer(is), oldItem);
			itemdefinition.method6025(16711935);
			if (-1 != itemdefinition.anInt5755 * -1673957995)
				itemdefinition.method6027(getItemDefinitions((itemdefinition.anInt5755 * -1673957995), forceNew), getItemDefinitions(809765849 * itemdefinition.anInt5709, forceNew), 219692629);
			if (itemdefinition.anInt5719 * 465190555 != -1)
				itemdefinition.method6039(getItemDefinitions(itemdefinition.anInt5719 * 465190555, forceNew), getItemDefinitions((-783380935 * (((ItemDefinitions) itemdefinition).anInt5756)), forceNew), -1676050822);
			if (-1 != 2083650097 * itemdefinition.anInt5770)
				itemdefinition.method6036(getItemDefinitions(itemdefinition.anInt5770 * 2083650097, forceNew), getItemDefinitions((1981372535 * (((ItemDefinitions) itemdefinition).anInt5769)), forceNew), -1733915014);
			if (!((Class477) this).aBoolean5999 && itemdefinition.aBoolean5731) {
				itemdefinition.anInt5700 = 0;
				itemdefinition.aStringArray5723 = ((Class477) this).aStringArray5988;
				itemdefinition.aStringArray5732 = ((Class477) this).aStringArray6000;
				itemdefinition.aBoolean5734 = false;
				itemdefinition.anIntArray5767 = null;
				if (null != ((ItemDefinitions) itemdefinition).aClass437_5766) {
					boolean bool = false;
					for (Linkable class298 = ((ItemDefinitions) itemdefinition).aClass437_5766.method5816(1739772889); class298 != null; class298 = ((ItemDefinitions) itemdefinition).aClass437_5766.method5815((byte) -94)) {
						Class497 class497 = (((Class477) this).aClass504_5989.method6251((int) (class298.linkedKey * 7051297995265073167L), -1474104007));
						if (class497.aBoolean6102)
							class298.unlink(-1460969981);
						else
							bool = true;
					}
					if (!bool)
						((ItemDefinitions) itemdefinition).aClass437_5766 = null;
				}
			}
			synchronized (((Class477) this).aClass348_5993) {
				((Class477) this).aClass348_5993.method4194(itemdefinition, (long) itemId);
			}
			return itemdefinition;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.a(").append(')').toString());
		}
	}

	public Class57 method6085(GraphicsToolkit class_ra, int i, int i_1_, int i_2_, int i_3_, int i_4_, Class366 class366, int i_5_) {
		try {
			((Class465) ((Class477) this).aClass465_5996).anInt6519 = -973477563 * class_ra.anInt5298;
			((Class465) ((Class477) this).aClass465_5996).anInt6514 = i * 1541800549;
			((Class465) ((Class477) this).aClass465_5996).anInt6515 = -1199949713 * i_1_;
			((Class465) ((Class477) this).aClass465_5996).anInt6516 = i_2_ * 29186943;
			((Class465) ((Class477) this).aClass465_5996).anInt6518 = i_3_ * 1868109305;
			((Class465) ((Class477) this).aClass465_5996).anInt6517 = i_4_ * 958157807;
			((Class465) ((Class477) this).aClass465_5996).aBoolean6513 = null != class366;
			return (Class57) aClass340_5995.method4134(((Class477) this).aClass465_5996);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.f(").append(')').toString());
		}
	}

	public Class57 method6086(GraphicsToolkit class_ra, GraphicsToolkit class_ra_6_, int i, int i_7_, int i_8_, int i_9_, boolean bool, boolean bool_10_, int i_11_, Class264 class264, Class366 class366, int i_12_) {
		try {
			if (!bool_10_) {
				Class57 class57 = method6085(class_ra_6_, i, i_7_, i_8_, i_9_, i_11_, class366, 467134725);
				if (null != class57)
					return class57;
			}
			ItemDefinitions class468 = getItemDefinitions(i);
			if (i_7_ > 1 && ((ItemDefinitions) class468).anIntArray5752 != null) {
				int i_13_ = -1;
				for (int i_14_ = 0; i_14_ < 10; i_14_++) {
					if (i_7_ >= ((ItemDefinitions) class468).anIntArray5753[i_14_] && 0 != ((ItemDefinitions) class468).anIntArray5753[i_14_])
						i_13_ = ((ItemDefinitions) class468).anIntArray5752[i_14_];
				}
				if (i_13_ != -1)
					class468 = getItemDefinitions(i_13_);
			}
			int[] is = class468.method6031(class_ra, class_ra_6_, i_7_, i_8_, i_9_, bool, i_11_, class264, class366, 1026825677);
			if (null == is)
				return null;
			Class57 class57;
			if (bool_10_)
				class57 = class_ra.method5031(is, 0, 36, 36, 32, 533151798);
			else
				class57 = class_ra_6_.method5031(is, 0, 36, 36, 32, 1367777589);
			if (!bool_10_) {
				Class465 class465 = new Class465();
				((Class465) class465).anInt6519 = -973477563 * class_ra_6_.anInt5298;
				((Class465) class465).anInt6514 = i * 1541800549;
				((Class465) class465).anInt6515 = i_7_ * -1199949713;
				((Class465) class465).anInt6516 = 29186943 * i_8_;
				((Class465) class465).anInt6518 = i_9_ * 1868109305;
				((Class465) class465).anInt6517 = 958157807 * i_11_;
				((Class465) class465).aBoolean6513 = null != class366;
				aClass340_5995.method4127(class57, class465);
			}
			return class57;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.b(").append(')').toString());
		}
	}

	public void method6087(int i, int i_15_) {
		try {
			((Class477) this).anInt5991 = i * -747694971;
			synchronized (((Class477) this).aClass348_5994) {
				((Class477) this).aClass348_5994.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.i(").append(')').toString());
		}
	}

	public void method6088(short i) {
		try {
			synchronized (((Class477) this).aClass348_5993) {
				((Class477) this).aClass348_5993.method4187();
			}
			synchronized (((Class477) this).aClass348_5994) {
				((Class477) this).aClass348_5994.method4187();
			}
			synchronized (aClass340_5995) {
				aClass340_5995.method4132();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.k(").append(')').toString());
		}
	}

	public void method6089(int i) {
		try {
			synchronized (aClass340_5995) {
				aClass340_5995.method4132();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.d(").append(')').toString());
		}
	}

	public Class477(Class411 class411, Class429 class429, boolean bool, Class504 class504, Class243 class243, Class243 class243_16_) {
		((Class477) this).aClass411_5998 = class411;
		((Class477) this).aClass429_5997 = class429;
		((Class477) this).aBoolean5999 = bool;
		((Class477) this).aClass504_5989 = class504;
		((Class477) this).aClass243_5990 = class243;
		((Class477) this).aClass243_5992 = class243_16_;
		if (null != ((Class477) this).aClass243_5990) {
			int i = ((Class477) this).aClass243_5990.method2296(1070333047) - 1;
			if (true)
				itemDefinitionsLength = 30000 * -1797723349;
			else
				itemDefinitionsLength = (i * Class120.aClass120_1429.method1306((short) 15063) + ((Class477) this).aClass243_5990.method2316(i, -1996628421)) * -1797723349;
		} else
			itemDefinitionsLength = 0;
		if (((Class477) this).aClass411_5998 == Class411.aClass411_5320)
			((Class477) this).aStringArray5988 = (new String[] { null, null, Tradution.aClass470_5790.method6049((((Class477) this).aClass429_5997), -875414210), null, null, Tradution.aClass470_5905.method6049((((Class477) this).aClass429_5997), -875414210) });
		else
			((Class477) this).aStringArray5988 = (new String[] { null, null, Tradution.aClass470_5790.method6049((((Class477) this).aClass429_5997), -875414210), null, null, null });
		((Class477) this).aStringArray6000 = (new String[] { null, null, null, null, Tradution.aClass470_5939.method6049((((Class477) this).aClass429_5997), -875414210) });
	}

	public void method6090(int i, byte i_17_) {
		try {
			synchronized (((Class477) this).aClass348_5993) {
				((Class477) this).aClass348_5993.method4186(i, -2090918778);
			}
			synchronized (((Class477) this).aClass348_5994) {
				((Class477) this).aClass348_5994.method4186(i, -1948181413);
			}
			synchronized (aClass340_5995) {
				aClass340_5995.method4131(i);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.x(").append(')').toString());
		}
	}

	public void method6091(byte i) {
		try {
			synchronized (((Class477) this).aClass348_5994) {
				((Class477) this).aClass348_5994.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.u(").append(')').toString());
		}
	}

	public void method6092(boolean bool, int i) {
		try {
			if (((Class477) this).aBoolean5999 != bool) {
				((Class477) this).aBoolean5999 = bool;
				method6088((short) 8756);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.p(").append(')').toString());
		}
	}

	public void method6093(int i) {
		try {
			synchronized (((Class477) this).aClass348_5993) {
				((Class477) this).aClass348_5993.method4189();
			}
			synchronized (((Class477) this).aClass348_5994) {
				((Class477) this).aClass348_5994.method4189();
			}
			synchronized (aClass340_5995) {
				aClass340_5995.method4136();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.r(").append(')').toString());
		}
	}

	static final void method6094(int i, byte i_18_) {
		try {
			Class305.method3753((byte) -70);
			int i_19_ = (Class440.aClass205_5582.method1914(i, -482836609).anInt2359 * -65795773);
			if (0 != i_19_) {
				int i_20_ = Class128.aClass148_6331.anIntArray6654[i];
				if (5 == i_19_)
					client.anInt8830 = -941750943 * i_20_;
				if (6 == i_19_)
					client.anInt8842 = i_20_ * 1034265279;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.lh(").append(')').toString());
		}
	}

	static final void method6095(ClientScript2 class403, int i) {
		try {
			Class298_Sub36.method3401(0, 0, (client.aClass105_8819.anInt1156 * -2093041337), (client.aClass105_8819.anInt1162 * 457937409), false, 1934343255);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -505673857 * client.anInt8664;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1387083365 * client.anInt8939;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.aku(").append(')').toString());
		}
	}

	public static void method6096(Class243 class243, int i, int i_21_, int i_22_, boolean bool, int i_23_) {
		try {
			Class478.method6099(class243, i, i_21_, i_22_, bool, 0L);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tq.f(").append(')').toString());
		}
	}
}
