
/* Class288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

public class Class288 {
	Index aClass317_3436;
	SoftCache aClass229_3437 = new SoftCache(16);
	static FontMetrics aClass414_3438;

	public void method5068(int i, byte i_0_) {
		synchronized (((Class288) this).aClass229_3437) {
			((Class288) this).aClass229_3437.method3858(i, (byte) -51);
		}
	}

	public void method5070(int i) {
		synchronized (((Class288) this).aClass229_3437) {
			((Class288) this).aClass229_3437.method3859(1722121730);
		}
	}

	public Class288(Game class486, Language class495, Index class317) {
		((Class288) this).aClass317_3436 = class317;
		((Class288) this).aClass317_3436.filesCount((-71319279 * (SharedConfigsType.aClass120_1469.id)), -1821241871);
	}

	public void method5071(int i) {
		synchronized (((Class288) this).aClass229_3437) {
			((Class288) this).aClass229_3437.method3863(2056846713);
		}
	}

	Class207 method5072(int i, int i_1_) {
		Class207 class207;
		synchronized (((Class288) this).aClass229_3437) {
			class207 = ((Class207) ((Class288) this).aClass229_3437.get((long) i));
		}
		if (class207 != null)
			return class207;
		byte[] is;
		synchronized (((Class288) this).aClass317_3436) {
			is = (((Class288) this).aClass317_3436.getFile(-71319279 * SharedConfigsType.aClass120_1469.id, i));
		}
		class207 = new Class207();
		if (is != null)
			class207.method3549(new RsByteBuffer(is), -2145124357);
		synchronized (((Class288) this).aClass229_3437) {
			((Class288) this).aClass229_3437.put(class207, (long) i);
		}
		return class207;
	}

	public Class247 method5077(int i, int i_2_, int i_3_, int i_4_, Class45 class45, int i_5_) {
		Class334[] class334s = null;
		Class207 class207 = method5072(i, -2042609292);
		if (null != ((Class207) class207).anIntArray2655) {
			class334s = new Class334[((Class207) class207).anIntArray2655.length];
			for (int i_6_ = 0; i_6_ < class334s.length; i_6_++) {
				Class38 class38 = class45.method914((((Class207) class207).anIntArray2655[i_6_]), -1040824349);
				class334s[i_6_] = new Class334(class38.anInt395 * -1157124829, -263107191 * class38.anInt402, -133387847 * class38.anInt401, class38.anInt397 * -552296001, class38.anInt399 * 1830044949, -154069655 * class38.anInt396, 134772441 * class38.anInt404, class38.aBool400, -810822993 * class38.anInt403, class38.anInt398 * -140856677, class38.anInt405 * -250014037);
			}
		}
		return new Class247(-1089853695 * ((Class207) class207).anInt2653, class334s, ((Class207) class207).anInt2654 * -1639521939, i_2_, i_3_, i_4_, ((Class207) class207).aClass204_2656, 1502700951 * ((Class207) class207).anInt2657);
	}

	static final void method5082(CS2Executor class527, int i) {
		class527.intStackPtr -= 283782002;
		int i_7_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_8_ = (class527.intStack[1942118537 * class527.intStackPtr + 1]);
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class282_Sub14.method12221(((UnderlayDefinition) class513).aClass118_5886, i_7_, i_8_, 1550850781);
	}

	static void method5083(long l) {
		Class407.aCalendar4846.setTime(new Date(l));
	}

	public static Interface getInterface(int interfaceId, int[] xteas, Interface inter, boolean bool, byte i_9_) {
		if (!Class388.INTERFACE_INDEX.loadFile(interfaceId, -2119577317))
			return null;
		int numComponents = Class388.INTERFACE_INDEX.filesCount(interfaceId, 1474003408);
		IComponentDefinitions[] componentDefs;
		if (numComponents == 0)
			componentDefs = new IComponentDefinitions[0];
		else if (inter == null)
			componentDefs = new IComponentDefinitions[numComponents];
		else
			componentDefs = inter.components;
		if (null == inter)
			inter = new Interface(bool, componentDefs);
		else {
			inter.components = componentDefs;
			inter.aBool999 = bool;
		}
		for (int componentId = 0; componentId < numComponents; componentId++) {
			if (inter.components[componentId] == null) {
				byte[] data = Class388.INTERFACE_INDEX.getFile(interfaceId, componentId, xteas);
				if (null != data) {
					IComponentDefinitions defs = inter.components[componentId] = new IComponentDefinitions();
					defs.idHash = ((interfaceId << 16) + componentId) * -1255176211;
					defs.readValues(new RsByteBuffer(data), 1943098120);
				}
			}
		}
		return inter;
	}
}
