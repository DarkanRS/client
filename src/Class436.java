/* Class436 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class436 {
	Index aClass317_5333;
	SoftCache aClass229_5334 = new SoftCache(64);

	public Class416 method7304(int i, byte i_0_) {
		Class416 class416;
		synchronized (((Class436) this).aClass229_5334) {
			class416 = ((Class416) ((Class436) this).aClass229_5334.get((long) i));
		}
		if (class416 != null)
			return class416;
		byte[] is;
		synchronized (((Class436) this).aClass317_5333) {
			is = ((Class436) this).aClass317_5333.getFile(((SharedConfigsType.aClass120_1494.id) * -71319279), i, -1863810018);
		}
		class416 = new Class416();
		if (null != is)
			class416.method6999(new RsByteBuffer(is), -1640531527);
		synchronized (((Class436) this).aClass229_5334) {
			((Class436) this).aClass229_5334.put(class416, (long) i);
		}
		return class416;
	}

	public void method7305() {
		synchronized (((Class436) this).aClass229_5334) {
			((Class436) this).aClass229_5334.method3859(-369187613);
		}
	}

	public void method7306(int i) {
		synchronized (((Class436) this).aClass229_5334) {
			((Class436) this).aClass229_5334.method3859(1100969051);
		}
	}

	public void method7307(int i, int i_1_) {
		synchronized (((Class436) this).aClass229_5334) {
			((Class436) this).aClass229_5334.method3858(i, (byte) 12);
		}
	}

	public void method7308(byte i) {
		synchronized (((Class436) this).aClass229_5334) {
			((Class436) this).aClass229_5334.method3863(1784570586);
		}
	}

	public Class416 method7309(int i) {
		Class416 class416;
		synchronized (((Class436) this).aClass229_5334) {
			class416 = ((Class416) ((Class436) this).aClass229_5334.get((long) i));
		}
		if (class416 != null)
			return class416;
		byte[] is;
		synchronized (((Class436) this).aClass317_5333) {
			is = ((Class436) this).aClass317_5333.getFile(((SharedConfigsType.aClass120_1494.id) * -71319279), i, -1505357380);
		}
		class416 = new Class416();
		if (null != is)
			class416.method6999(new RsByteBuffer(is), -1640531527);
		synchronized (((Class436) this).aClass229_5334) {
			((Class436) this).aClass229_5334.put(class416, (long) i);
		}
		return class416;
	}

	public Class416 method7310(int i) {
		Class416 class416;
		synchronized (((Class436) this).aClass229_5334) {
			class416 = ((Class416) ((Class436) this).aClass229_5334.get((long) i));
		}
		if (class416 != null)
			return class416;
		byte[] is;
		synchronized (((Class436) this).aClass317_5333) {
			is = ((Class436) this).aClass317_5333.getFile(((SharedConfigsType.aClass120_1494.id) * -71319279), i, -1657302050);
		}
		class416 = new Class416();
		if (null != is)
			class416.method6999(new RsByteBuffer(is), -1640531527);
		synchronized (((Class436) this).aClass229_5334) {
			((Class436) this).aClass229_5334.put(class416, (long) i);
		}
		return class416;
	}

	public Class436(Game class486, Language class495, Index class317) {
		((Class436) this).aClass317_5333 = class317;
		((Class436) this).aClass317_5333.filesCount((SharedConfigsType.aClass120_1494.id) * -71319279, 974737476);
	}

	public void method7311() {
		synchronized (((Class436) this).aClass229_5334) {
			((Class436) this).aClass229_5334.method3863(1548455431);
		}
	}

	public void method7312() {
		synchronized (((Class436) this).aClass229_5334) {
			((Class436) this).aClass229_5334.method3863(1145102903);
		}
	}

	static final void method7313(Class282_Sub44 class282_sub44, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, byte i_10_) {
		if (Class456_Sub3.method12682(i, null, -149079200)) {
			if (class282_sub44 != null && !class282_sub44.method13401((byte) -110))
				Class351.method6196(class282_sub44, true, false, -1434411886);
			else {
				Class98 class98 = Class468_Sub8.aClass98Array7889[i];
				client.method11768(class98, class98.method1616(2121969346), -1, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
			}
		}
	}
}
