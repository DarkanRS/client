/* Class290 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class290 {
	SoftCache aClass229_3447;
	Index aClass317_3448;
	SoftCache aClass229_3449 = new SoftCache(64);
	Index aClass317_3450;
	static int anInt3451;
	public static NativeSprite aClass160_3452;

	public void method5101(int i) {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3858(i, (byte) 97);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3858(i, (byte) -13);
		}
	}

	public HitbarDefinitions getDefinitions(int i, int i_0_) {
		HitbarDefinitions class198;
		synchronized (((Class290) this).aClass229_3449) {
			class198 = ((HitbarDefinitions) ((Class290) this).aClass229_3449.get((long) i));
		}
		if (class198 != null)
			return class198;
		byte[] is;
		synchronized (((Class290) this).aClass317_3450) {
			is = ((Class290) this).aClass317_3450.getFile(((SharedConfigsType.HITBARS.id) * -71319279), i);
		}
		class198 = new HitbarDefinitions();
		((HitbarDefinitions) class198).aClass290_2437 = this;
		if (null != is)
			class198.method3210(new RsByteBuffer(is), 1208743415);
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.put(class198, (long) i);
		}
		return class198;
	}

	public void method5103(int i) {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3859(-2093187724);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3859(1931980556);
		}
	}

	public Class290(Game class486, Language class495, Index class317, Index class317_1_) {
		((Class290) this).aClass229_3447 = new SoftCache(20);
		((Class290) this).aClass317_3448 = class317_1_;
		((Class290) this).aClass317_3450 = class317;
		((Class290) this).aClass317_3450.filesCount((-71319279 * (SharedConfigsType.HITBARS.id)), -732818997);
	}

	public void method5104() {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3863(1638280570);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3863(1820030157);
		}
	}

	public void method5105() {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3863(1109920784);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3863(769167472);
		}
	}

	public HitbarDefinitions method5106(int i) {
		HitbarDefinitions class198;
		synchronized (((Class290) this).aClass229_3449) {
			class198 = ((HitbarDefinitions) ((Class290) this).aClass229_3449.get((long) i));
		}
		if (class198 != null)
			return class198;
		byte[] is;
		synchronized (((Class290) this).aClass317_3450) {
			is = ((Class290) this).aClass317_3450.getFile(((SharedConfigsType.HITBARS.id) * -71319279), i);
		}
		class198 = new HitbarDefinitions();
		((HitbarDefinitions) class198).aClass290_2437 = this;
		if (null != is)
			class198.method3210(new RsByteBuffer(is), -1151222098);
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.put(class198, (long) i);
		}
		return class198;
	}

	public void method5107(int i, byte i_2_) {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3858(i, (byte) -95);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3858(i, (byte) 84);
		}
	}

	public void method5108() {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3859(-1847460978);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3859(1517137345);
		}
	}

	public void method5109(int i) {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3863(1288912888);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3863(1186404476);
		}
	}

	public void method5110(int i) {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3858(i, (byte) -19);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3858(i, (byte) -4);
		}
	}

	public HitbarDefinitions method5111(int i) {
		HitbarDefinitions class198;
		synchronized (((Class290) this).aClass229_3449) {
			class198 = ((HitbarDefinitions) ((Class290) this).aClass229_3449.get((long) i));
		}
		if (class198 != null)
			return class198;
		byte[] is;
		synchronized (((Class290) this).aClass317_3450) {
			is = ((Class290) this).aClass317_3450.getFile(((SharedConfigsType.HITBARS.id) * -71319279), i);
		}
		class198 = new HitbarDefinitions();
		((HitbarDefinitions) class198).aClass290_2437 = this;
		if (null != is)
			class198.method3210(new RsByteBuffer(is), 848432304);
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.put(class198, (long) i);
		}
		return class198;
	}

	public void method5112(int i) {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3858(i, (byte) -52);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3858(i, (byte) 1);
		}
	}

	public void method5113(int i) {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3858(i, (byte) 71);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3858(i, (byte) -29);
		}
	}

	public void method5114() {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3863(1869529283);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3863(1368101356);
		}
	}

	public void method5115() {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3859(1297372567);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3859(-1062836374);
		}
	}

	public void method5116(int i) {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3858(i, (byte) 12);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3858(i, (byte) -29);
		}
	}

	public void method5117() {
		synchronized (((Class290) this).aClass229_3449) {
			((Class290) this).aClass229_3449.method3863(2011067910);
		}
		synchronized (((Class290) this).aClass229_3447) {
			((Class290) this).aClass229_3447.method3863(1650933343);
		}
	}

	static final void method5118(byte i) {
		Class9.aLong77 = -2087908126908168589L;
		Class9.aLong86 = 0L;
		Class9.anInt76 = -1481524237;
	}

	static final void method5119(CS2Executor class527, byte i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class96_Sub20.method14668(1421797478).method243((byte) 1);
	}

	public static String method5120(int i, boolean bool, int i_3_) {
		if (!bool || i < 0)
			return Integer.toString(i);
		return Class149_Sub4.method14662(i, 10, bool, 16711680);
	}

	static final void method5121(IComponentDefinitions class118, Interface class98, CS2Executor class527, byte i) {
		class118.anInt1264 = ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) * -1774983547);
		Class109.method1858(class118, (byte) 103);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class282_Sub14.method12223(class118.idHash * -1952846363, (byte) -48);
	}

	static final void method5122(CS2Executor class527, short i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub30_8194.method13417(-1771623069) == 1 ? 1 : 0;
	}

	static final void method5123(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (class527.aBool7022) {
			if (i >= 0)
				return;
			class513 = class527.aClass513_6994;
		} else
			class513 = class527.aClass513_7007;
		UnderlayDefinition class513_4_ = class513;
		IComponentDefinitions class118 = ((UnderlayDefinition) class513_4_).aClass118_5886;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class118.anInt1312 * 682782159;
	}
}
