/* Class498 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class498 {
	Index aClass317_5823;
	SoftCache aClass229_5824 = new SoftCache(64);

	public void method8317() {
		synchronized (((Class498) this).aClass229_5824) {
			((Class498) this).aClass229_5824.method3859(1176678168);
		}
	}

	public void method8318() {
		synchronized (((Class498) this).aClass229_5824) {
			((Class498) this).aClass229_5824.method3863(1023969715);
		}
	}

	public void method8319(int i) {
		synchronized (((Class498) this).aClass229_5824) {
			((Class498) this).aClass229_5824.method3859(-1742228693);
		}
	}

	public void method8320(int i, int i_0_) {
		synchronized (((Class498) this).aClass229_5824) {
			((Class498) this).aClass229_5824.method3858(i, (byte) -28);
		}
	}

	public void method8321(int i) {
		synchronized (((Class498) this).aClass229_5824) {
			((Class498) this).aClass229_5824.method3863(1716297142);
		}
	}

	public Class498(Game class486, Language class495, Index class317) {
		((Class498) this).aClass317_5823 = class317;
		if (((Class498) this).aClass317_5823 != null)
			((Class498) this).aClass317_5823.filesCount(-71319279 * SharedConfigsType.aClass120_1479.id, 2039893772);
	}

	public Class489 method8322(int i, short i_1_) {
		Class489 class489;
		synchronized (((Class498) this).aClass229_5824) {
			class489 = ((Class489) ((Class498) this).aClass229_5824.get((long) i));
		}
		if (null != class489)
			return class489;
		byte[] is = ((Class498) this).aClass317_5823.getFile(((SharedConfigsType.aClass120_1479.id) * -71319279), i);
		class489 = new Class489();
		if (is != null)
			class489.method8213(new RsByteBuffer(is), (byte) 0);
		synchronized (((Class498) this).aClass229_5824) {
			((Class498) this).aClass229_5824.put(class489, (long) i);
		}
		return class489;
	}

	public void method8323() {
		synchronized (((Class498) this).aClass229_5824) {
			((Class498) this).aClass229_5824.method3859(1315984117);
		}
	}

	public void method8324() {
		synchronized (((Class498) this).aClass229_5824) {
			((Class498) this).aClass229_5824.method3863(755755769);
		}
	}

	public void method8325() {
		synchronized (((Class498) this).aClass229_5824) {
			((Class498) this).aClass229_5824.method3859(237779425);
		}
	}

	public void method8326() {
		synchronized (((Class498) this).aClass229_5824) {
			((Class498) this).aClass229_5824.method3863(1653166989);
		}
	}

	static final void method8327(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class455.method7555(class118, class98, class527, (byte) -121);
	}

	static final void method8328(CS2Executor class527, int i) {
		class527.longLocals[(class527.intOpValues[301123709 * class527.instrPtr])] = (class527.aLongArray7003[((class527.anInt7001 -= -1188480575) * 1820448321)]);
	}
}
