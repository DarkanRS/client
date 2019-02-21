/* Class218 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class WorldMapIndexLoader {
	Index aClass317_2703;
	public static final int anInt2704 = 64;
	Index aClass317_2705;
	public static final int anInt2706 = 128;
	SoftCache aClass229_2707 = new SoftCache(128);
	SoftCache aClass229_2708 = new SoftCache(64);
	static boolean[] aBoolArray2709;

	public void method3695(int i, int i_0_) {
		synchronized (((WorldMapIndexLoader) this).aClass229_2707) {
			((WorldMapIndexLoader) this).aClass229_2707.method3858(i, (byte) 71);
		}
		synchronized (((WorldMapIndexLoader) this).aClass229_2708) {
			((WorldMapIndexLoader) this).aClass229_2708.method3858(i, (byte) -60);
		}
	}

	public void method3696(byte i) {
		synchronized (((WorldMapIndexLoader) this).aClass229_2707) {
			((WorldMapIndexLoader) this).aClass229_2707.method3863(2127164020);
		}
		synchronized (((WorldMapIndexLoader) this).aClass229_2708) {
			((WorldMapIndexLoader) this).aClass229_2708.method3863(1611491782);
		}
	}

	public void method3697(int i, int i_1_, int i_2_) {
		((WorldMapIndexLoader) this).aClass229_2707 = new SoftCache(i);
		((WorldMapIndexLoader) this).aClass229_2708 = new SoftCache(i_1_);
	}

	public void method3698(int i) {
		synchronized (((WorldMapIndexLoader) this).aClass229_2707) {
			((WorldMapIndexLoader) this).aClass229_2707.method3858(i, (byte) 11);
		}
		synchronized (((WorldMapIndexLoader) this).aClass229_2708) {
			((WorldMapIndexLoader) this).aClass229_2708.method3858(i, (byte) -18);
		}
	}

	public void method3699(byte i) {
		synchronized (((WorldMapIndexLoader) this).aClass229_2707) {
			((WorldMapIndexLoader) this).aClass229_2707.method3859(-1557275586);
		}
		synchronized (((WorldMapIndexLoader) this).aClass229_2708) {
			((WorldMapIndexLoader) this).aClass229_2708.method3859(-1044931706);
		}
	}

	public WorldMapAreaDefs getWorldMapDefs(int i, int i_3_) {
		WorldMapAreaDefs class220;
		synchronized (((WorldMapIndexLoader) this).aClass229_2707) {
			class220 = ((WorldMapAreaDefs) ((WorldMapIndexLoader) this).aClass229_2707.get((long) i));
		}
		if (null != class220)
			return class220;
		byte[] is;
		synchronized (((WorldMapIndexLoader) this).aClass317_2705) {
			is = ((WorldMapIndexLoader) this).aClass317_2705.getFile(((SharedConfigsType.WORLD_MAP_DEFS.id) * -71319279), i);
		}
		class220 = new WorldMapAreaDefs();
		class220.anInt2753 = 443844459 * i;
		((WorldMapAreaDefs) class220).aClass218_2716 = this;
		if (is != null)
			class220.method3716(new RsByteBuffer(is), -141546823);
		class220.method3718(-1915876048);
		synchronized (((WorldMapIndexLoader) this).aClass229_2707) {
			((WorldMapIndexLoader) this).aClass229_2707.put(class220, (long) i);
		}
		return class220;
	}

	public WorldMapAreaDefs method3701(int i) {
		WorldMapAreaDefs class220;
		synchronized (((WorldMapIndexLoader) this).aClass229_2707) {
			class220 = ((WorldMapAreaDefs) ((WorldMapIndexLoader) this).aClass229_2707.get((long) i));
		}
		if (null != class220)
			return class220;
		byte[] is;
		synchronized (((WorldMapIndexLoader) this).aClass317_2705) {
			is = ((WorldMapIndexLoader) this).aClass317_2705.getFile(((SharedConfigsType.WORLD_MAP_DEFS.id) * -71319279), i);
		}
		class220 = new WorldMapAreaDefs();
		class220.anInt2753 = 443844459 * i;
		((WorldMapAreaDefs) class220).aClass218_2716 = this;
		if (is != null)
			class220.method3716(new RsByteBuffer(is), -141546823);
		class220.method3718(-275295059);
		synchronized (((WorldMapIndexLoader) this).aClass229_2707) {
			((WorldMapIndexLoader) this).aClass229_2707.put(class220, (long) i);
		}
		return class220;
	}

	public void method3702(int i, int i_4_) {
		((WorldMapIndexLoader) this).aClass229_2707 = new SoftCache(i);
		((WorldMapIndexLoader) this).aClass229_2708 = new SoftCache(i_4_);
	}

	public WorldMapIndexLoader(Game class486, Language class495, Index class317, Index class317_5_) {
		((WorldMapIndexLoader) this).aClass317_2705 = class317;
		((WorldMapIndexLoader) this).aClass317_2703 = class317_5_;
		((WorldMapIndexLoader) this).aClass317_2705.filesCount((-71319279 * (SharedConfigsType.WORLD_MAP_DEFS.id)), -945990147);
	}

	public void method3703(int i, int i_6_) {
		((WorldMapIndexLoader) this).aClass229_2707 = new SoftCache(i);
		((WorldMapIndexLoader) this).aClass229_2708 = new SoftCache(i_6_);
	}

	public void method3704(int i, int i_7_) {
		((WorldMapIndexLoader) this).aClass229_2707 = new SoftCache(i);
		((WorldMapIndexLoader) this).aClass229_2708 = new SoftCache(i_7_);
	}

	public void method3705(int i) {
		synchronized (((WorldMapIndexLoader) this).aClass229_2707) {
			((WorldMapIndexLoader) this).aClass229_2707.method3858(i, (byte) -68);
		}
		synchronized (((WorldMapIndexLoader) this).aClass229_2708) {
			((WorldMapIndexLoader) this).aClass229_2708.method3858(i, (byte) 11);
		}
	}

	public void method3706(int i, int i_8_) {
		((WorldMapIndexLoader) this).aClass229_2707 = new SoftCache(i);
		((WorldMapIndexLoader) this).aClass229_2708 = new SoftCache(i_8_);
	}

	public void method3707() {
		synchronized (((WorldMapIndexLoader) this).aClass229_2707) {
			((WorldMapIndexLoader) this).aClass229_2707.method3863(1498884219);
		}
		synchronized (((WorldMapIndexLoader) this).aClass229_2708) {
			((WorldMapIndexLoader) this).aClass229_2708.method3863(1582058157);
		}
	}

	public void method3708() {
		synchronized (((WorldMapIndexLoader) this).aClass229_2707) {
			((WorldMapIndexLoader) this).aClass229_2707.method3863(1396736779);
		}
		synchronized (((WorldMapIndexLoader) this).aClass229_2708) {
			((WorldMapIndexLoader) this).aClass229_2708.method3863(1448169082);
		}
	}

	public static void method3709(int i, short i_9_) {
		synchronized (PlayerAppearance.aClass229_2920) {
			PlayerAppearance.aClass229_2920.method3858(i, (byte) 86);
		}
		synchronized (PlayerAppearance.aClass229_2930) {
			PlayerAppearance.aClass229_2930.method3858(i, (byte) 15);
		}
	}

	static void method3710(Interface class98, IComponentDefinitions class118, int i) {
		if (null != class118) {
			if (class118.anInt1288 * 1924549737 != -1) {
				IComponentDefinitions class118_10_ = (class98.components[class118.anInt1305 * 2110532063 & 0xffff]);
				if (null != class118_10_) {
					if (class118_10_.aClass118Array1438 == class118_10_.aClass118Array1439) {
						class118_10_.aClass118Array1439 = (new IComponentDefinitions[class118_10_.aClass118Array1438.length]);
						class118_10_.aClass118Array1439[0] = class118;
						Class503.method8359(class118_10_.aClass118Array1438, 0, class118_10_.aClass118Array1439, 1, 1924549737 * class118.anInt1288);
						Class503.method8359(class118_10_.aClass118Array1438, 1 + 1924549737 * class118.anInt1288, class118_10_.aClass118Array1439, 1924549737 * class118.anInt1288 + 1, (class118_10_.aClass118Array1438.length - 1924549737 * class118.anInt1288 - 1));
					} else {
						int i_11_ = 0;
						IComponentDefinitions[] class118s;
						for (class118s = class118_10_.aClass118Array1439; (i_11_ < class118s.length && class118s[i_11_] != class118); i_11_++) {
							/* empty */
						}
						if (i_11_ < class118s.length) {
							Class503.method8359(class118s, 0, class118s, 1, i_11_);
							class118s[0] = class118;
						}
					}
				}
			} else {
				IComponentDefinitions[] class118s = class98.method1617(-1207733107);
				int i_12_;
				for (i_12_ = 0; i_12_ < class118s.length && class118 != class118s[i_12_]; i_12_++) {
					/* empty */
				}
				if (i_12_ < class118s.length) {
					Class503.method8359(class118s, 0, class118s, 1, i_12_);
					class118s[0] = class118;
				}
			}
		}
	}
}
