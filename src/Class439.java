
/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class Class439 {
	Class439() throws Throwable {
		throw new Error();
	}

	static byte[] method7336(File file, int i) {
		byte[] is;
		try {
			byte[] is_0_ = new byte[i];
			Class353.method6208(file, is_0_, i, 108704305);
			is = is_0_;
		} catch (IOException ioexception) {
			return null;
		}
		return is;
	}

	public static byte[] method7337(File file) {
		return ObjectDefinitions.method8023(file, (int) file.length(), (byte) 0);
	}

	static void method7338(File file, byte[] is, int i) throws IOException {
		DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
		try {
			datainputstream.readFully(is, 0, i);
		} catch (EOFException eofexception) {
			/* empty */
		}
		datainputstream.close();
	}

	static byte[] method7339(File file, int i) {
		byte[] is;
		try {
			byte[] is_1_ = new byte[i];
			Class353.method6208(file, is_1_, i, 108704305);
			is = is_1_;
		} catch (IOException ioexception) {
			return null;
		}
		return is;
	}

	public static byte[] method7340(File file) {
		return ObjectDefinitions.method8023(file, (int) file.length(), (byte) 0);
	}

	static void method7341(File file, byte[] is, int i) throws IOException {
		DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
		try {
			datainputstream.readFully(is, 0, i);
		} catch (EOFException eofexception) {
			/* empty */
		}
		datainputstream.close();
	}

	public static byte[] method7342(File file) {
		return ObjectDefinitions.method8023(file, (int) file.length(), (byte) 0);
	}

	public static void method7343(int i, int i_2_) {
		IComponentDefinitions.aClass229_1280.method3858(i, (byte) 2);
		IComponentDefinitions.aClass229_1341.method3858(i, (byte) 35);
		IComponentDefinitions.aClass229_1303.method3858(i, (byte) 34);
		IComponentDefinitions.aClass229_1282.method3858(i, (byte) -52);
	}

	static final void method7344(int i, int i_3_, long l) {
		int i_4_ = (int) l >> 14 & 0x1f;
		int i_5_ = (int) l >> 20 & 0x3;
		int i_6_ = (int) (l >>> 32) & 0x7fffffff;
		Class458 class458 = (Class458) Class386.method6672(Class2.method262((byte) -1), i_4_, -917234900);
		Class225 class225;
		if (class458 == Class458.aClass458_5490 || Class458.aClass458_5492 == class458 || class458 == Class458.aClass458_5480) {
			ObjectDefinitions class478 = IndexLoaders.MAP_REGION_DECODER.method4436(-1792559044).getObjectDefinitions(i_6_, 65280);
			int i_7_;
			int i_8_;
			if (i_5_ == 0 || i_5_ == 2) {
				i_7_ = -752356381 * class478.anInt5648;
				i_8_ = class478.anInt5649 * -1610844647;
			} else {
				i_7_ = -1610844647 * class478.anInt5649;
				i_8_ = -752356381 * class478.anInt5648;
			}
			if (i_5_ == 0) {
				/* empty */
			}
			class225 = JS5CacheFile.method3354(i, i_3_, i_7_, i_8_, Class458.aClass458_5470, 0, 1608795477);
		} else if (Class308.method5473(1109376893 * class458.anInt5481, 1861080465))
			class225 = JS5CacheFile.method3354(i, i_3_, 0, 0, class458, i_5_, 1608795477);
		else
			class225 = Class148.method2551(i, i_3_, 0, 0, class458, i_5_, 960380494);
		MapRegion.method4559(i, i_3_, true, class225, 2130368133);
	}
}
