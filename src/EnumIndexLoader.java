/* Class444 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class EnumIndexLoader {
	SoftCache aClass229_5377 = new SoftCache(128);
	Index aClass317_5378;
	public static int[] anIntArray5379;

	public EnumDefinitions method7424(int i, byte i_0_) {
		EnumDefinitions class431;
		synchronized (((EnumIndexLoader) this).aClass229_5377) {
			class431 = ((EnumDefinitions) ((EnumIndexLoader) this).aClass229_5377.get((long) i));
		}
		if (class431 != null)
			return class431;
		byte[] is = (((EnumIndexLoader) this).aClass317_5378.getFile(SharedConfigsType.aClass120_1471.containerId(i), SharedConfigsType.aClass120_1471.fileId(i)));
		class431 = new EnumDefinitions();
		if (null != is)
			class431.method7227(new RsByteBuffer(is), (byte) 104);
		synchronized (((EnumIndexLoader) this).aClass229_5377) {
			((EnumIndexLoader) this).aClass229_5377.put(class431, (long) i);
		}
		return class431;
	}

	public EnumIndexLoader(Game class486, Language class495, Index class317) {
		((EnumIndexLoader) this).aClass317_5378 = class317;
		if (null != ((EnumIndexLoader) this).aClass317_5378) {
			int i = ((EnumIndexLoader) this).aClass317_5378.containersCount() - 1;
			SharedConfigsType.aClass120_1471.filesPerContainer(-613744571);
			((EnumIndexLoader) this).aClass317_5378.filesCount(i);
		}
	}

	public static boolean method7426(int i, byte i_1_) {
		for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 75)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.next(1043628930))) {
			if (Class237.method3989((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225), (byte) 0) && (long) i == (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584)))
				return true;
		}
		return false;
	}

	static final void method7427(CS2Executor class527, int i) {
		int i_2_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_2_ >> 28;
	}
}
