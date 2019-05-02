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
		return this.method5822((Class328) object_1);
	}

	int method5822(Class328 class328_1) {
		return this.aLong3769 < class328_1.aLong3769 ? -1 : (this.aLong3769 > class328_1.aLong3769 ? 1 : 0);
	}

	Class328(Object object_1, Object object_2) {
		this.anObject3768 = object_1;
		this.anObject3770 = object_2;
	}

	static void method5827() {
		try {
			File file_1 = new File(Class110.aString1103, "random.dat");
			int i_3;
			if (file_1.exists()) {
				Engine.aClass440_3269 = new Class440(new Class442(file_1, 25L), 24);
			} else {
				label34: for (int i_2 = 0; i_2 < Class106.aStringArray1077.length; i_2++) {
					for (i_3 = 0; i_3 < Class246.aStringArray3028.length; i_3++) {
						File file_4 = new File(Class246.aStringArray3028[i_3] + Class106.aStringArray1077[i_2] + File.separatorChar + "random.dat");
						if (file_4.exists()) {
							Engine.aClass440_3269 = new Class440(new Class442(file_4, 25L), 24);
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
				Engine.aClass440_3269 = new Class440(new Class442(file_1, 25L), 24);
			}
		} catch (IOException ioexception_6) {
			;
		}
	}
}
