
/* Class499 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class499 {
	Class499() throws Throwable {
		throw new Error();
	}

	public static byte[] method8329(byte[] is) {
		if (is == null)
			return null;
		byte[] is_0_ = new byte[is.length];
		System.arraycopy(is, 0, is_0_, 0, is.length);
		return is_0_;
	}

	public static short[] method8330(short[] is) {
		if (null == is)
			return null;
		short[] is_1_ = new short[is.length];
		System.arraycopy(is, 0, is_1_, 0, is.length);
		return is_1_;
	}

	public static short[] method8331(short[] is) {
		if (null == is)
			return null;
		short[] is_2_ = new short[is.length];
		System.arraycopy(is, 0, is_2_, 0, is.length);
		return is_2_;
	}

	public static short[] method8332(short[] is) {
		if (null == is)
			return null;
		short[] is_3_ = new short[is.length];
		System.arraycopy(is, 0, is_3_, 0, is.length);
		return is_3_;
	}

	static final void method8333(int i, int i_4_) {
		Class473.method7887(-1685527133);
		int i_5_ = (IndexLoaders.aClass377_1065.method6384(i, -822529502).anInt4327 * -735486551);
		if (0 != i_5_) {
			int i_6_ = Class158_Sub1.aClass3_8507.anIntArray26[i];
			if (i_5_ == 5)
				client.anInt7339 = -1848418365 * i_6_;
			if (6 == i_5_)
				client.anInt7351 = i_6_ * -257367639;
		}
	}

	static void method8334(File file, int i) {
		Class271.aFile3327 = file;
		if (!Class271.aFile3327.exists())
			throw new RuntimeException("");
		Class271.aBool3328 = true;
	}
}
