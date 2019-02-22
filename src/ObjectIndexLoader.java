/* Class474 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ObjectIndexLoader {
	SoftCache softCache = new SoftCache(256);
	XLanguage aClass495_5608;
	boolean showOptions;
	Index objectIndex;
	Index meshIndex;
	Game game;
	SoftCache aClass229_5614 = new SoftCache(500);
	SoftCache aClass229_5615 = new SoftCache(30);
	RSMesh[] aClass157Array5616;
	int anInt5617;
	String[] defaultOptions;
	SoftCache aClass229_5619 = new SoftCache(50);
	Class452 aClass452_5620;
	
	public ObjectDefinitions getObjectDefinitions(int i, int i_0_) {
		ObjectDefinitions defs;
		synchronized (((ObjectIndexLoader) this).softCache) {
			defs = ((ObjectDefinitions) ((ObjectIndexLoader) this).softCache.get((long) i));
		}
		if (null != defs)
			return defs;
		byte[] data;
		synchronized (((ObjectIndexLoader) this).objectIndex) {
			data = (((ObjectIndexLoader) this).objectIndex.getFile(SharedConfigsType.OBJECT_DEFINITIONS.containerId(i), SharedConfigsType.OBJECT_DEFINITIONS.fileId(i)));
		}
		defs = new ObjectDefinitions();
		defs.id = -199598417 * i;
		((ObjectDefinitions) defs).loader = this;
		defs.options = (String[]) ((ObjectIndexLoader) this).defaultOptions.clone();
		if (data != null)
			defs.method7964(new RsByteBuffer(data), (byte) 43);
		defs.method7966(787748525);
		if (defs.ignoreClipOnAlternativeRoute) {
			defs.clipType = 0;
			defs.projectileClipped = false;
		}
		if (!((ObjectIndexLoader) this).showOptions && defs.aBool5660) {
			defs.options = null;
			defs.anIntArray5707 = null;
		}
		synchronized (((ObjectIndexLoader) this).softCache) {
			((ObjectIndexLoader) this).softCache.put(defs, (long) i);
		}
		return defs;
	}


	public void method7893(int i, int i_1_) {
		((ObjectIndexLoader) this).anInt5617 = i * 587822967;
		synchronized (((ObjectIndexLoader) this).aClass229_5614) {
			((ObjectIndexLoader) this).aClass229_5614.method3859(-2096062108);
		}
		synchronized (((ObjectIndexLoader) this).aClass229_5615) {
			((ObjectIndexLoader) this).aClass229_5615.method3859(-27932787);
		}
		synchronized (((ObjectIndexLoader) this).aClass229_5619) {
			((ObjectIndexLoader) this).aClass229_5619.method3859(1932349321);
		}
	}

	public void method7895(byte i) {
		synchronized (((ObjectIndexLoader) this).softCache) {
			((ObjectIndexLoader) this).softCache.method3859(1354085029);
		}
		synchronized (((ObjectIndexLoader) this).aClass229_5614) {
			((ObjectIndexLoader) this).aClass229_5614.method3859(-1238602820);
		}
		synchronized (((ObjectIndexLoader) this).aClass229_5615) {
			((ObjectIndexLoader) this).aClass229_5615.method3859(895757660);
		}
		synchronized (((ObjectIndexLoader) this).aClass229_5619) {
			((ObjectIndexLoader) this).aClass229_5619.method3859(722371520);
		}
		((ObjectIndexLoader) this).aClass157Array5616 = new RSMesh[4];
		((ObjectIndexLoader) this).aClass452_5620 = new Class452(null, null);
	}

	public void method7896(int i, byte i_2_) {
		synchronized (((ObjectIndexLoader) this).softCache) {
			((ObjectIndexLoader) this).softCache.method3858(i, (byte) -81);
		}
		synchronized (((ObjectIndexLoader) this).aClass229_5614) {
			((ObjectIndexLoader) this).aClass229_5614.method3858(i, (byte) -26);
		}
		synchronized (((ObjectIndexLoader) this).aClass229_5615) {
			((ObjectIndexLoader) this).aClass229_5615.method3858(i, (byte) 77);
		}
		synchronized (((ObjectIndexLoader) this).aClass229_5619) {
			((ObjectIndexLoader) this).aClass229_5619.method3858(i, (byte) 63);
		}
	}

	public void method7897(int i) {
		synchronized (((ObjectIndexLoader) this).softCache) {
			((ObjectIndexLoader) this).softCache.method3863(1368757759);
		}
		synchronized (((ObjectIndexLoader) this).aClass229_5614) {
			((ObjectIndexLoader) this).aClass229_5614.method3863(1886053158);
		}
		synchronized (((ObjectIndexLoader) this).aClass229_5615) {
			((ObjectIndexLoader) this).aClass229_5615.method3863(1444983758);
		}
		synchronized (((ObjectIndexLoader) this).aClass229_5619) {
			((ObjectIndexLoader) this).aClass229_5619.method3863(1778004488);
		}
	}

	public ObjectIndexLoader(Game class486, XLanguage class495, boolean bool, Index class317, Index class317_3_) {
		((ObjectIndexLoader) this).aClass157Array5616 = new RSMesh[4];
		((ObjectIndexLoader) this).aClass452_5620 = new Class452(null, null);
		((ObjectIndexLoader) this).game = class486;
		((ObjectIndexLoader) this).aClass495_5608 = class495;
		((ObjectIndexLoader) this).showOptions = bool;
		((ObjectIndexLoader) this).objectIndex = class317;
		((ObjectIndexLoader) this).meshIndex = class317_3_;
		if (null != ((ObjectIndexLoader) this).objectIndex) {
			int i = ((ObjectIndexLoader) this).objectIndex.containersCount() - 1;
			SharedConfigsType.OBJECT_DEFINITIONS.filesPerContainer(-1090472574);
			((ObjectIndexLoader) this).objectIndex.filesCount(i);
		}
		if (((ObjectIndexLoader) this).game == Game.darkan)
			((ObjectIndexLoader) this).defaultOptions = (new String[] { null, null, null, null, null, Message.EXAMINE.translate((((ObjectIndexLoader) this).aClass495_5608), -952366759) });
		else
			((ObjectIndexLoader) this).defaultOptions = new String[] { null, null, null, null, null, null };
	}

	public void method7899(int i, int i_4_) {
		((ObjectIndexLoader) this).softCache = new SoftCache(i);
	}

	public void method7912(boolean bool, int i) {
		if (bool != ((ObjectIndexLoader) this).showOptions) {
			((ObjectIndexLoader) this).showOptions = bool;
			method7895((byte) 107);
		}
	}

	public static int method7914(long l) {
		return (int) (l / 86400000L) - 11745;
	}

	static final void method7915(CS2Executor class527, byte i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class417.anInt4994 * -385885769;
	}

	public static Class217_Sub1 method7916(int i, int i_5_) {
		if (!Class244.aBool3007 || i < Class485.anInt5740 * -377428565 || i > -860748679 * Class244.anInt3003)
			return null;
		return (Class244.aClass217_Sub1Array3006[i - Class485.anInt5740 * -377428565]);
	}

	static void method7917(int i, int i_6_, byte i_7_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(14, (long) i);
		class282_sub50_sub12.method14995(1795507411);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = i_6_ * -1773141545;
	}
}
