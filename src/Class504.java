
/* Class504 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public abstract class Class504 {
	public static int anInt5832;

	public static byte[] method8382(Object object, boolean bool) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static byte[] method8383(Object object, boolean bool) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (bool)
				return Arrays.copyOf(is, is.length);
			return is;
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[bytebuffer.capacity()];
			bytebuffer.position(0);
			bytebuffer.get(is);
			return is;
		}
		throw new IllegalArgumentException();
	}

	Class504() throws Throwable {
		throw new Error();
	}

	public static Object method8384(byte[] is, boolean bool) {
		if (null == is)
			return null;
		if (is.length > 136) {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(is.length);
			bytebuffer.position(0);
			bytebuffer.put(is);
			return bytebuffer;
		}
		if (bool)
			return Arrays.copyOf(is, is.length);
		return is;
	}

	public static byte[] method8385(Object object, int i, int i_0_) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			return Arrays.copyOfRange(is, i, i_0_ + i);
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[i_0_];
			bytebuffer.position(i);
			bytebuffer.get(is, 0, i_0_);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static byte[] method8386(Object object, int i, int i_1_) {
		if (null == object)
			return null;
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			return Arrays.copyOfRange(is, i, i_1_ + i);
		}
		if (object instanceof ByteBuffer) {
			ByteBuffer bytebuffer = (ByteBuffer) object;
			byte[] is = new byte[i_1_];
			bytebuffer.position(i);
			bytebuffer.get(is, 0, i_1_);
			return is;
		}
		throw new IllegalArgumentException();
	}

	static final void method8387(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		class118.anInt1380 = ((class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]) * -1380100089);
	}

	static boolean method8388(int i, byte i_2_) {
		return 4 == i || 15 == i || 1 == i;
	}

	public static final int method8389(int i, int i_3_, int i_4_, byte i_5_) {
		if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1437330098) == null)
			return 0;
		int i_6_ = i >> 9;
		int i_7_ = i_3_ >> 9;
		if (i_6_ < 0 || i_7_ < 0 || i_6_ > IndexLoaders.MAP_REGION_DECODER.method4424(-868401346) - 1 || i_7_ > IndexLoaders.MAP_REGION_DECODER.method4451(-1411185573) - 1)
			return 0;
		int i_8_ = i_4_;
		if (i_8_ < 3 && ((IndexLoaders.MAP_REGION_DECODER.method4433(33386298).aByteArrayArrayArray3638[1][i_6_][i_7_]) & 0x2) != 0)
			i_8_++;
		return IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1489528047).aClass390Array2591[i_8_].method6709(i, i_3_, 1879647652);
	}

	static final void method8390(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		int i_9_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		if (class118.anInt1320 * 985215637 != i_9_) {
			class118.anInt1320 = i_9_ * -1179842371;
			Class109.method1858(class118, (byte) 22);
		}
		if (-1 == class118.anInt1288 * 1924549737 && !class98.aBool999)
			Class105.method1807(class118.anInt1287 * -1952846363, (byte) 68);
	}
}
