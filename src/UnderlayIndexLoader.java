
/* Class479 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class UnderlayIndexLoader {
	Index configIndex;
	SoftCache cache = new SoftCache(128);

	public void method8024(int i) {
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.method3858(i, (byte) 97);
		}
	}

	public UnderlayDef getUnderlayDef(int i, byte i_0_) {
		UnderlayDef def;
		synchronized (((UnderlayIndexLoader) this).cache) {
			def = ((UnderlayDef) ((UnderlayIndexLoader) this).cache.get((long) i));
		}
		if (def != null)
			return def;
		byte[] is;
		synchronized (((UnderlayIndexLoader) this).configIndex) {
			is = (((UnderlayIndexLoader) this).configIndex.getFile(-71319279 * SharedConfigsType.FLO1.id, i, -1999870087));
		}
		def = new UnderlayDef();
		if (null != is)
			def.method8050(new RsByteBuffer(is), -341633442);
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.put(def, (long) i);
		}
		return def;
	}

	public void method8026(int i) {
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.method3859(-62537234);
		}
	}

	public UnderlayIndexLoader(Game class486, Language class495, Index class317) {
		((UnderlayIndexLoader) this).configIndex = class317;
		((UnderlayIndexLoader) this).configIndex.filesCount((SharedConfigsType.FLO1.id) * -71319279, 345702944);
	}

	public void method8027() {
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.method3859(-438351749);
		}
	}

	public UnderlayDef method8028(int i) {
		UnderlayDef class481;
		synchronized (((UnderlayIndexLoader) this).cache) {
			class481 = ((UnderlayDef) ((UnderlayIndexLoader) this).cache.get((long) i));
		}
		if (class481 != null)
			return class481;
		byte[] is;
		synchronized (((UnderlayIndexLoader) this).configIndex) {
			is = (((UnderlayIndexLoader) this).configIndex.getFile(-71319279 * SharedConfigsType.FLO1.id, i, -1393062609));
		}
		class481 = new UnderlayDef();
		if (null != is)
			class481.method8050(new RsByteBuffer(is), 2009630074);
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.put(class481, (long) i);
		}
		return class481;
	}

	public UnderlayDef method8029(int i) {
		UnderlayDef class481;
		synchronized (((UnderlayIndexLoader) this).cache) {
			class481 = ((UnderlayDef) ((UnderlayIndexLoader) this).cache.get((long) i));
		}
		if (class481 != null)
			return class481;
		byte[] is;
		synchronized (((UnderlayIndexLoader) this).configIndex) {
			is = (((UnderlayIndexLoader) this).configIndex.getFile(-71319279 * SharedConfigsType.FLO1.id, i, -1675981481));
		}
		class481 = new UnderlayDef();
		if (null != is)
			class481.method8050(new RsByteBuffer(is), -979770743);
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.put(class481, (long) i);
		}
		return class481;
	}

	public void method8030(int i, int i_1_) {
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.method3858(i, (byte) -26);
		}
	}

	public void method8031() {
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.method3859(-2074436659);
		}
	}

	public void method8032(int i) {
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.method3863(977235767);
		}
	}

	public void method8033() {
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.method3859(-1304573321);
		}
	}

	public void method8034(int i) {
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.method3858(i, (byte) -6);
		}
	}

	public UnderlayDef method8035(int i) {
		UnderlayDef class481;
		synchronized (((UnderlayIndexLoader) this).cache) {
			class481 = ((UnderlayDef) ((UnderlayIndexLoader) this).cache.get((long) i));
		}
		if (class481 != null)
			return class481;
		byte[] is;
		synchronized (((UnderlayIndexLoader) this).configIndex) {
			is = (((UnderlayIndexLoader) this).configIndex.getFile(-71319279 * SharedConfigsType.FLO1.id, i, -1932524788));
		}
		class481 = new UnderlayDef();
		if (null != is)
			class481.method8050(new RsByteBuffer(is), 68816610);
		synchronized (((UnderlayIndexLoader) this).cache) {
			((UnderlayIndexLoader) this).cache.put(class481, (long) i);
		}
		return class481;
	}

	static void method8036(int i, byte i_2_) {
		if (Class393.aClass282_Sub54_4783.aClass468_Sub8_8219.method12675(-1589433086) == 0)
			i = -1;
		if (i != client.anInt7190 * -1474737961) {
			if (i != -1) {
				Class419 class419 = IndexLoaders.aClass438_7932.method7325(i, -962986657);
				Class91 class91 = class419.method7026(-890527904);
				if (null != class91) {
					MeshModifier.aClass267_5026.setcustomcursor(Class351.gameCanvas, class91.method1528(), class91.method1519(), class91.method1520(), new Point(class419.anInt5002 * 1805382875, class419.anInt5000 * -683952919));
					client.anInt7190 = i * -618386713;
				} else
					i = -1;
			}
			if (-1 == i && -1 != client.anInt7190 * -1474737961) {
				MeshModifier.aClass267_5026.setcustomcursor(Class351.gameCanvas, null, -1, -1, new Point());
				client.anInt7190 = 618386713;
			}
		}
	}

	static final void method8037(CS2Executor class527, int i) {
		int i_3_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class527.aClass61_7010.aStringArray639[i_3_];
	}

	public static Class494[] method8038(byte i) {
		return (new Class494[] { Class494.aClass494_5784, Class494.aClass494_5792, Class494.aClass494_5787, Class494.aClass494_5789, Class494.aClass494_5786, Class494.aClass494_5782, Class494.aClass494_5788, Class494.aClass494_5779, Class494.aClass494_5790, Class494.aClass494_5783, Class494.aClass494_5791, Class494.aClass494_5781, Class494.aClass494_5785, Class494.aClass494_5780 });
	}
}
