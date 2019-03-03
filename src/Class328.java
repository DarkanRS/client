import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class Class328 implements Comparable {

	long aLong3767;
	long aLong3769;
	public static Class306 aClass306_3771;
	static IComponentDefinitions[] aClass118Array3772;
	Object anObject3768;
	Object anObject3770;

	public boolean equals(Object object_1) {
		if (object_1 instanceof Class328) {
			return this.anObject3770.equals(((Class328) object_1).anObject3770);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int compareTo(Object object_1) {
		return this.method5822((Class328) object_1, (byte) 39);
	}

	int method5822(Class328 class328_1, byte b_2) {
		return this.aLong3769 < class328_1.aLong3769 ? -1 : (this.aLong3769 > class328_1.aLong3769 ? 1 : 0);
	}

	Class328(Object object_1, Object object_2) {
		this.anObject3768 = object_1;
		this.anObject3770 = object_2;
	}

	static void method5827(short s_0) {
		try {
			File file_1 = new File(Class110.aString1103, "random.dat");
			int i_3;
			if (file_1.exists()) {
				Engine.aClass440_3269 = new Class440(new Class442(file_1, "rw", 25L), 24, 0);
			} else {
				label34: for (int i_2 = 0; i_2 < Class106.aStringArray1077.length; i_2++) {
					for (i_3 = 0; i_3 < Class246.aStringArray3028.length; i_3++) {
						File file_4 = new File(Class246.aStringArray3028[i_3] + Class106.aStringArray1077[i_2] + File.separatorChar + "random.dat");
						if (file_4.exists()) {
							Engine.aClass440_3269 = new Class440(new Class442(file_4, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}

			if (Engine.aClass440_3269 == null) {
				RandomAccessFile randomaccessfile_5 = new RandomAccessFile(file_1, "rw");
				i_3 = randomaccessfile_5.read();
				randomaccessfile_5.seek(0L);
				randomaccessfile_5.write(i_3);
				randomaccessfile_5.seek(0L);
				randomaccessfile_5.close();
				Engine.aClass440_3269 = new Class440(new Class442(file_1, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception_6) {
			;
		}

	}

	static final void method5828(CS2Executor cs2executor_0, int i_1) {
		--cs2executor_0.anInt7000;
		cs2executor_0.intStackPtr -= 3;
		String string_2 = (String) cs2executor_0.objectStack[cs2executor_0.anInt7000];
		boolean bool_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr] == 1;
		boolean bool_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1] == 1;
		boolean bool_5 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2] == 1;
		TCPMessage tcpmessage_6 = Class271.method4828(OutgoingPacket.aClass379_4619, client.aClass184_7218.isaac, -685598433);
		tcpmessage_6.buffer.writeShort(ChatLine.getLength(string_2) + 1, 1417031095);
		tcpmessage_6.buffer.writeString(string_2);
		int i_7 = 0;
		if (bool_3) {
			i_7 |= 0x1;
		}

		if (bool_4) {
			i_7 |= 0x2;
		}

		if (bool_5) {
			i_7 |= 0x4;
		}

		tcpmessage_6.buffer.writeByte(i_7);
		client.aClass184_7218.method3049(tcpmessage_6, 1599721330);
	}

	static final void method5829(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		SharedConfigsType.method2094(i_2, (byte) 1);
	}

	public static int parseInt(CharSequence charsequence_0, int i_1) {
		return Class356.parseInt(charsequence_0, 10, true, 2038427942);
	}

	static final void method5831(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = (int) (Math.random() * (double) (i_2 + 1));
	}

	static final void method5832(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aBool7224 && !client.aBool7244 ? 1 : 0;
	}

	static final void method5833(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class282_Sub52.method13468(icomponentdefinitions_3, interface_4, cs2executor_0, 769396750);
	}

}
