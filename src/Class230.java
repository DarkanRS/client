/* Class230 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class230 implements IndexLoader {
	SoftCache aClass229_2856 = new SoftCache(64);
	public static final int anInt2857 = 64;
	Index aClass317_2858;

	public void method3896(int i) {
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.method3859(-1688169863);
			((Class230) this).aClass229_2856 = new SoftCache(i);
		}
	}

	public Class226 method3897(int i, byte i_0_) {
		Class226 class226;
		synchronized (((Class230) this).aClass229_2856) {
			class226 = ((Class226) ((Class230) this).aClass229_2856.get((long) i));
		}
		if (null != class226)
			return class226;
		byte[] is;
		synchronized (((Class230) this).aClass317_2858) {
			is = (((Class230) this).aClass317_2858.getFile(SharedConfigsType.aClass120_1477.containerId(i, 87190961), SharedConfigsType.aClass120_1477.fileId(i, -2017027234), -1643082761));
		}
		class226 = new Class226();
		if (null != is)
			class226.method3795(new RsByteBuffer(is), 631437425);
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.put(class226, (long) i);
		}
		return class226;
	}

	public Class230(Game class486, Language class495, Index class317) {
		((Class230) this).aClass317_2858 = class317;
		if (((Class230) this).aClass317_2858 != null) {
			int i = ((Class230) this).aClass317_2858.containersCount(-1585425152) - 1;
			SharedConfigsType.aClass120_1477.filesPerContainer(-689743414);
			((Class230) this).aClass317_2858.filesCount(i, -1063022229);
		}
	}

	public void method3898(int i, int i_1_) {
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.method3858(i, (byte) -17);
		}
	}

	public void method3899(short i) {
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.method3863(1268003404);
		}
	}

	public void method3900() {
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.method3863(1110189881);
		}
	}

	public Class226 method3901(int i) {
		Class226 class226;
		synchronized (((Class230) this).aClass229_2856) {
			class226 = ((Class226) ((Class230) this).aClass229_2856.get((long) i));
		}
		if (null != class226)
			return class226;
		byte[] is;
		synchronized (((Class230) this).aClass317_2858) {
			is = (((Class230) this).aClass317_2858.getFile(SharedConfigsType.aClass120_1477.containerId(i, -1228358151), SharedConfigsType.aClass120_1477.fileId(i, -1768503924), -1630119547));
		}
		class226 = new Class226();
		if (null != is)
			class226.method3795(new RsByteBuffer(is), 684621272);
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.put(class226, (long) i);
		}
		return class226;
	}

	public void method3902() {
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.method3859(1593564954);
		}
	}

	public void method3903(byte i) {
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.method3859(891629452);
		}
	}

	public void method3904(int i) {
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.method3858(i, (byte) -40);
		}
	}

	public void method3905() {
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.method3863(2032200660);
		}
	}

	public void method3906(int i, short i_2_) {
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.method3859(1117502683);
			((Class230) this).aClass229_2856 = new SoftCache(i);
		}
	}

	public void method3907() {
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.method3863(1716771940);
		}
	}

	public void method3908() {
		synchronized (((Class230) this).aClass229_2856) {
			((Class230) this).aClass229_2856.method3859(-944165676);
		}
	}

	static final void method3909(CS2Executor class527, byte i) {
		IComponentDefinitions class118 = Class117.method1981((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]), (byte) 38);
		class118.aClass118Array1438 = null;
		class118.aClass118Array1439 = null;
		Class109.method1858(class118, (byte) -71);
	}

	public static final int method3910(String string, int i) {
		if (string == null)
			return -1;
		for (int i_3_ = 0; i_3_ < 493536965 * client.anInt7449; i_3_++) {
			if (string.equalsIgnoreCase(client.aClass6Array7452[i_3_].aString37))
				return i_3_;
		}
		return -1;
	}

	static final void method3911(CS2Executor class527, int i) {
		class527.intStackPtr -= 425673003;
		int i_4_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_5_ = (class527.intStack[class527.intStackPtr * 1942118537 + 1]);
		int i_6_ = (class527.intStack[2 + class527.intStackPtr * 1942118537]);
		Class96_Sub10.method14603(10, i_4_ << 16 | i_5_, i_6_, "", (byte) 121);
	}

	static void method3912(byte i) {
		if (null != Class260.aClass277_3221) {
			Class260.aClass277_3221 = null;
			Class187.method3121(256, (short) -575);
		}
	}
}
