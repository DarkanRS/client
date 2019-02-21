/* Class377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class377 implements IndexLoader {
	SoftCache aClass229_4517 = new SoftCache(64);
	Index aClass317_4518;
	public int anInt4519;
	static Thread aThread4520;

	public Class377(Game class486, Language class495, Index class317) {
		((Class377) this).aClass317_4518 = class317;
		if (((Class377) this).aClass317_4518 != null)
			anInt4519 = (((Class377) this).aClass317_4518.filesCount(SharedConfigsType.aClass120_1487.id * -71319279, -1550492065)) * -517376561;
		else
			anInt4519 = 0;
	}

	public Class372 method6384(int i, int i_0_) {
		Class372 class372;
		synchronized (((Class377) this).aClass229_4517) {
			class372 = ((Class372) ((Class377) this).aClass229_4517.get((long) i));
		}
		if (class372 != null)
			return class372;
		byte[] is;
		synchronized (((Class377) this).aClass317_4518) {
			is = ((Class377) this).aClass317_4518.getFile(((SharedConfigsType.aClass120_1487.id) * -71319279), i);
		}
		class372 = new Class372();
		if (is != null)
			class372.method6356(new RsByteBuffer(is), 1810955787);
		synchronized (((Class377) this).aClass229_4517) {
			((Class377) this).aClass229_4517.put(class372, (long) i);
		}
		return class372;
	}

	public Class372 method6385(int i) {
		Class372 class372;
		synchronized (((Class377) this).aClass229_4517) {
			class372 = ((Class372) ((Class377) this).aClass229_4517.get((long) i));
		}
		if (class372 != null)
			return class372;
		byte[] is;
		synchronized (((Class377) this).aClass317_4518) {
			is = ((Class377) this).aClass317_4518.getFile(((SharedConfigsType.aClass120_1487.id) * -71319279), i);
		}
		class372 = new Class372();
		if (is != null)
			class372.method6356(new RsByteBuffer(is), 471213324);
		synchronized (((Class377) this).aClass229_4517) {
			((Class377) this).aClass229_4517.put(class372, (long) i);
		}
		return class372;
	}

	public void method6386(int i, byte i_1_) {
		synchronized (((Class377) this).aClass229_4517) {
			((Class377) this).aClass229_4517.method3858(i, (byte) -47);
		}
	}

	public void method6387(int i) {
		synchronized (((Class377) this).aClass229_4517) {
			((Class377) this).aClass229_4517.method3858(i, (byte) -2);
		}
	}

	public void method6388(byte i) {
		synchronized (((Class377) this).aClass229_4517) {
			((Class377) this).aClass229_4517.method3859(-2056634706);
		}
	}

	public Class372 method6389(int i) {
		Class372 class372;
		synchronized (((Class377) this).aClass229_4517) {
			class372 = ((Class372) ((Class377) this).aClass229_4517.get((long) i));
		}
		if (class372 != null)
			return class372;
		byte[] is;
		synchronized (((Class377) this).aClass317_4518) {
			is = ((Class377) this).aClass317_4518.getFile(((SharedConfigsType.aClass120_1487.id) * -71319279), i);
		}
		class372 = new Class372();
		if (is != null)
			class372.method6356(new RsByteBuffer(is), 1597587859);
		synchronized (((Class377) this).aClass229_4517) {
			((Class377) this).aClass229_4517.put(class372, (long) i);
		}
		return class372;
	}

	public void method6390(int i) {
		synchronized (((Class377) this).aClass229_4517) {
			((Class377) this).aClass229_4517.method3863(2135815187);
		}
	}

	public void method6391() {
		synchronized (((Class377) this).aClass229_4517) {
			((Class377) this).aClass229_4517.method3863(2137902118);
		}
	}

	public void method6392() {
		synchronized (((Class377) this).aClass229_4517) {
			((Class377) this).aClass229_4517.method3863(1588803028);
		}
	}

	public void method6393() {
		synchronized (((Class377) this).aClass229_4517) {
			((Class377) this).aClass229_4517.method3863(2033533486);
		}
	}

	static void method6394(GraphicalRenderer class505, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		class505.method8425(i, i_2_, i_3_, i_4_, i_5_, (byte) -74);
		class505.method8425(1 + i, 1 + i_2_, i_3_ - 2, 16, i_6_, (byte) -67);
		class505.method8562(i + 1, i_2_ + 18, i_3_ - 2, i_4_ - 19, i_6_, (byte) 4);
	}

	static final void method6395(CS2Executor class527, short i) {
		UnderlayDefinition class513;
		if (class527.aBool7022) {
			if (i != 9728)
				return;
			class513 = class527.aClass513_6994;
		} else
			class513 = class527.aClass513_7007;
		UnderlayDefinition class513_8_ = class513;
		IComponentDefinitions class118 = ((UnderlayDefinition) class513_8_).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513_8_).aClass98_5885;
		Class283.method5009(class118, class98, class527, -1781977981);
	}

	static final void method6396(CS2Executor class527, byte i) {
		int i_9_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		Class282_Sub20_Sub38.method15430(i_9_, 16711935);
	}

	static final void method6397(CS2Executor class527, int i) {
		int i_10_ = Class393.aClass282_Sub54_4783.aClass468_Sub27_8208.method12952((byte) 81);
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub27_8209, ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) == 1) ? 0 : i_10_, 2046929998);
		Class405.method6823(-734889653);
	}

	public static String method6398(Object[] objects, int i, int i_11_, int i_12_) {
		if (0 == i_11_)
			return "";
		if (i_11_ == 1) {
			CharSequence charsequence = (CharSequence) objects[i];
			if (charsequence == null)
				return "null";
			return charsequence.toString();
		}
		int i_13_ = i_11_ + i;
		int i_14_ = 0;
		for (int i_15_ = i; i_15_ < i_13_; i_15_++) {
			CharSequence charsequence = (CharSequence) objects[i_15_];
			if (null == charsequence)
				i_14_ += 4;
			else
				i_14_ += charsequence.length();
		}
		StringBuilder stringbuilder = new StringBuilder(i_14_);
		for (int i_16_ = i; i_16_ < i_13_; i_16_++) {
			CharSequence charsequence = (CharSequence) objects[i_16_];
			if (charsequence == null)
				stringbuilder.append("null");
			else
				stringbuilder.append(charsequence);
		}
		return stringbuilder.toString();
	}

	static final void method6399(CS2Executor class527, byte i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = 0;
	}

	static final void method6400(CS2Executor class527, byte i) {
		class527.anInt7000 -= -1341717846;
		class527.intStackPtr -= 283782002;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		int i_17_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_18_ = (class527.intStack[1 + class527.intStackPtr * 1942118537]);
		String string_19_ = (String) (class527.objectStack[1 + 1806726141 * class527.anInt7000]);
		Class96_Sub19.method14666(string, i_17_ == 1, i_18_, string_19_, 720350555);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	public static Class62 method6401(RsByteBuffer class282_sub35, byte i) {
		String string = class282_sub35.readString();
		Class356 class356 = (Class350_Sub3_Sub1.method15558(180670091)[class282_sub35.readUnsignedByte()]);
		Class353 class353 = (AccountCreationResponseOpcodes.method8155(152314627)[class282_sub35.readUnsignedByte()]);
		int i_20_ = class282_sub35.readShort(1978619926);
		int i_21_ = class282_sub35.readShort(1827949740);
		int i_22_ = class282_sub35.readUnsignedByte();
		int i_23_ = class282_sub35.readUnsignedByte();
		int i_24_ = class282_sub35.readUnsignedByte();
		int i_25_ = class282_sub35.readUnsignedShort();
		int i_26_ = class282_sub35.readUnsignedShort();
		int i_27_ = class282_sub35.readBigSmart();
		int i_28_ = class282_sub35.readInt();
		int i_29_ = class282_sub35.readInt();
		return new Class62(string, class356, class353, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, i_27_, i_28_, i_29_);
	}
}
