/* Class444 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class444 {
	SoftCache aClass229_5377 = new SoftCache(128);
	Index aClass317_5378;
	public static int[] anIntArray5379;

	public Class431 method7423(int i) {
		Class431 class431;
		synchronized (((Class444) this).aClass229_5377) {
			class431 = ((Class431) ((Class444) this).aClass229_5377.get((long) i));
		}
		if (class431 != null)
			return class431;
		byte[] is = (((Class444) this).aClass317_5378.getFile(SharedConfigsType.aClass120_1471.containerId(i, 374972545), SharedConfigsType.aClass120_1471.fileId(i, -2000339976), -1809807646));
		class431 = new Class431();
		if (null != is)
			class431.method7227(new RsByteBuffer(is), (byte) 35);
		synchronized (((Class444) this).aClass229_5377) {
			((Class444) this).aClass229_5377.put(class431, (long) i);
		}
		return class431;
	}

	public Class431 method7424(int i, byte i_0_) {
		Class431 class431;
		synchronized (((Class444) this).aClass229_5377) {
			class431 = ((Class431) ((Class444) this).aClass229_5377.get((long) i));
		}
		if (class431 != null)
			return class431;
		byte[] is = (((Class444) this).aClass317_5378.getFile(SharedConfigsType.aClass120_1471.containerId(i, 1042477341), SharedConfigsType.aClass120_1471.fileId(i, -1854324369), -2133256826));
		class431 = new Class431();
		if (null != is)
			class431.method7227(new RsByteBuffer(is), (byte) 104);
		synchronized (((Class444) this).aClass229_5377) {
			((Class444) this).aClass229_5377.put(class431, (long) i);
		}
		return class431;
	}

	public Class444(Game class486, Language class495, Index class317) {
		((Class444) this).aClass317_5378 = class317;
		if (null != ((Class444) this).aClass317_5378) {
			int i = ((Class444) this).aClass317_5378.containersCount(-1259843972) - 1;
			SharedConfigsType.aClass120_1471.filesPerContainer(-613744571);
			((Class444) this).aClass317_5378.filesCount(i, -826629788);
		}
	}

	public Class431 method7425(int i) {
		Class431 class431;
		synchronized (((Class444) this).aClass229_5377) {
			class431 = ((Class431) ((Class444) this).aClass229_5377.get((long) i));
		}
		if (class431 != null)
			return class431;
		byte[] is = (((Class444) this).aClass317_5378.getFile(SharedConfigsType.aClass120_1471.containerId(i, 1267824598), SharedConfigsType.aClass120_1471.fileId(i, -2031984543), -1609304948));
		class431 = new Class431();
		if (null != is)
			class431.method7227(new RsByteBuffer(is), (byte) 77);
		synchronized (((Class444) this).aClass229_5377) {
			((Class444) this).aClass229_5377.put(class431, (long) i);
		}
		return class431;
	}

	public static boolean method7426(int i, byte i_1_) {
		for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 75)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.next(1043628930))) {
			if (Class237.method3989((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225), (byte) 0) && (long) i == (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584)))
				return true;
		}
		return false;
	}

	static final void method7427(CS2Executor class527, int i) {
		int i_2_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_2_ >> 28;
	}
}
