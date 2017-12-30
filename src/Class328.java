
/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class328 implements Comparable {
	long aLong3767;
	Object anObject3768;
	long aLong3769;
	Object anObject3770;
	public static Class306 aClass306_3771;
	static Class118[] aClass118Array3772;

	public int method5817(Object object) {
		return method5822((Class328) object, (byte) 98);
	}

	int method5818(Class328 class328_0_) {
		if (-6781388050759103145L * ((Class328) this).aLong3769 < -6781388050759103145L * ((Class328) class328_0_).aLong3769)
			return -1;
		if (-6781388050759103145L * ((Class328) this).aLong3769 > ((Class328) class328_0_).aLong3769 * -6781388050759103145L)
			return 1;
		return 0;
	}

	public boolean equals(Object object) {
		if (object instanceof Class328)
			return ((Class328) this).anObject3770.equals(((Class328) (Class328) object).anObject3770);
		throw new IllegalArgumentException();
	}

	public int compareTo(Object object) {
		return method5822((Class328) object, (byte) 39);
	}

	public boolean method5819(Object object) {
		if (object instanceof Class328)
			return ((Class328) this).anObject3770.equals(((Class328) (Class328) object).anObject3770);
		throw new IllegalArgumentException();
	}

	public boolean method5820(Object object) {
		if (object instanceof Class328)
			return ((Class328) this).anObject3770.equals(((Class328) (Class328) object).anObject3770);
		throw new IllegalArgumentException();
	}

	public boolean method5821(Object object) {
		if (object instanceof Class328)
			return ((Class328) this).anObject3770.equals(((Class328) (Class328) object).anObject3770);
		throw new IllegalArgumentException();
	}

	int method5822(Class328 class328_1_, byte i) {
		if (-6781388050759103145L * ((Class328) this).aLong3769 < -6781388050759103145L * ((Class328) class328_1_).aLong3769)
			return -1;
		if (-6781388050759103145L * ((Class328) this).aLong3769 > ((Class328) class328_1_).aLong3769 * -6781388050759103145L)
			return 1;
		return 0;
	}

	Class328(Object object, Object object_2_) {
		((Class328) this).anObject3768 = object;
		((Class328) this).anObject3770 = object_2_;
	}

	public int method5823(Object object) {
		return method5822((Class328) object, (byte) 28);
	}

	public int method5824(Object object) {
		return method5822((Class328) object, (byte) 127);
	}

	public int method5825(Object object) {
		return method5822((Class328) object, (byte) 31);
	}

	public int method5826(Object object) {
		return method5822((Class328) object, (byte) 57);
	}

	static void method5827(short i) {
		try {
			File file = new File(Class110.aString1103, "random.dat");
			if (file.exists())
				Class263.aClass440_3269 = new Class440(new Class442(file, "rw", 25L), 24, 0);
			else {
				while_218_: for (int i_3_ = 0; i_3_ < Class106.aStringArray1077.length; i_3_++) {
					for (int i_4_ = 0; i_4_ < Class246.aStringArray3028.length; i_4_++) {
						File file_5_ = new File(new StringBuilder().append(Class246.aStringArray3028[i_4_]).append(Class106.aStringArray1077[i_3_]).append(File.separatorChar).append("random.dat").toString());
						if (file_5_.exists()) {
							Class263.aClass440_3269 = new Class440(new Class442(file_5_, "rw", 25L), 24, 0);
							break while_218_;
						}
					}
				}
			}
			if (null == Class263.aClass440_3269) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i_6_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_6_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				Class263.aClass440_3269 = new Class440(new Class442(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	static final void method5828(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7000 -= 1476624725;
		((CS2Executor) class527).anInt7012 -= 425673003;
		String string = (String) (((CS2Executor) class527).objectStack[((CS2Executor) class527).anInt7000 * 1806726141]);
		boolean bool = ((((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]) == 1);
		boolean bool_7_ = ((((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]) == 1);
		boolean bool_8_ = ((((CS2Executor) class527).intStack[2 + 1942118537 * ((CS2Executor) class527).anInt7012]) == 1);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4619, client.aClass184_7218.aClass432_2283, -685598433);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(Class108.method1846(string, 108230630) + 1, 1417031095);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		int i_9_ = 0;
		if (bool)
			i_9_ |= 0x1;
		if (bool_7_)
			i_9_ |= 0x2;
		if (bool_8_)
			i_9_ |= 0x4;
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_9_);
		client.aClass184_7218.method3049(class282_sub23, 1599721330);
	}

	static final void method5829(CS2Executor class527, int i) {
		int i_10_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class120.method2094(i_10_, (byte) 1);
	}

	public static int method5830(CharSequence charsequence, int i) {
		return Class356.method6225(charsequence, 10, true, 2038427942);
	}

	static final void method5831(CS2Executor class527, int i) {
		int i_11_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) (Math.random() * (double) (i_11_ + 1));
	}

	static final void method5832(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7224 && !client.aBool7244 ? 1 : 0;
	}

	static final void method5833(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class282_Sub52.method13468(class118, class98, class527, 769396750);
	}
}
