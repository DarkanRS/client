/* Class536 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class536 {
	SoftCache aClass229_7092 = new SoftCache(64);
	public int anInt7093 = 0;
	public int anInt7094;
	Index aClass317_7095;

	public OverlayDef method11475(int i, byte i_0_) {
		OverlayDef class531;
		synchronized (((Class536) this).aClass229_7092) {
			class531 = ((OverlayDef) ((Class536) this).aClass229_7092.get((long) i));
		}
		if (class531 != null)
			return class531;
		byte[] is;
		synchronized (((Class536) this).aClass317_7095) {
			is = (((Class536) this).aClass317_7095.getFile(-71319279 * SharedConfigsType.FLO2.id, i));
		}
		class531 = new OverlayDef();
		((OverlayDef) class531).aClass536_7062 = this;
		((OverlayDef) class531).anInt7053 = -609380743 * i;
		if (null != is)
			class531.method11357(new RsByteBuffer(is), 1338105221);
		class531.method11356((byte) -46);
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.put(class531, (long) i);
		}
		return class531;
	}

	public void method11476(byte i) {
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3859(2009928513);
		}
	}

	public void method11477(int i, byte i_1_) {
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3858(i, (byte) 14);
		}
	}

	public void method11478(int i) {
		synchronized (((Class536) this).aClass229_7092) {
			((Class536) this).aClass229_7092.method3863(1398711796);
		}
	}

	public Class536(Game class486, Language class495, Index class317) {
		((Class536) this).aClass317_7095 = class317;
		anInt7094 = (((Class536) this).aClass317_7095.filesCount((-71319279 * (SharedConfigsType.FLO2.id))) * -919202315);
	}

	static final void method11486(CS2Executor class527, byte i) {
		int i_2_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = client.anIntArray7337[i_2_];
	}
}
