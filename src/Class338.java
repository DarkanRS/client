/* Class338 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Class338 {
	static int anInt3628 = -1;
	static int anInt3629 = 2;
	public static int anInt3630;
	static boolean aBoolean3631 = false;
	static int anInt3632 = 1;

	Class338() throws Throwable {
		throw new Error();
	}

	static final void method4113(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Interface class298_sub51 = ((Interface) client.aClass437_8841.get((long) i_0_));
			if (null != class298_sub51)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oc.rx(").append(')').toString());
		}
	}

	public static byte[] method4114(Object object, boolean bool, int i) {
		try {
			if (object == null)
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
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oc.f(").append(')').toString());
		}
	}

	public static Class119 method4115(int i, int[] is, Class119 class119, boolean bool, byte i_1_) {
		try {
			if (!Class270.aClass243_2894.method2291(i, 2091513640))
				return null;
			int i_2_ = Class270.aClass243_2894.method2316(i, -1254954272);
			IComponentDefinition[] class105s;
			if (i_2_ == 0)
				class105s = new IComponentDefinition[0];
			else if (null == class119)
				class105s = new IComponentDefinition[i_2_];
			else
				class105s = class119.aClass105Array1405;
			if (class119 == null)
				class119 = new Class119(bool, class105s);
			else {
				class119.aClass105Array1405 = class105s;
				class119.aBoolean1403 = bool;
			}
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				if (class119.aClass105Array1405[i_3_] == null) {
					byte[] is_4_ = Class270.aClass243_2894.method2289(i, i_3_, is, -1925510913);
					if (null != is_4_) {
						IComponentDefinition class105 = (class119.aClass105Array1405[i_3_] = new IComponentDefinition());
						class105.anInt1142 = (i_3_ + (i << 16)) * 533296807;
						class105.decode(new RsByteBuffer(is_4_), 1142190823);
					}
				}
			}
			return class119;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("oc.k(").append(')').toString());
		}
	}
}
