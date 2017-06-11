/* Class415 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

public class Class415 {
	static {
		new HashMap();
	}

	Class415() throws Throwable {
		throw new Error();
	}

	public static byte[] method5586(Object object, int i, int i_0_, byte i_1_) {
		try {
			if (null == object)
				return null;
			if (object instanceof byte[]) {
				byte[] is = (byte[]) object;
				return Arrays.copyOfRange(is, i, i + i_0_);
			}
			if (object instanceof ByteBuffer) {
				ByteBuffer bytebuffer = (ByteBuffer) object;
				byte[] is = new byte[i_0_];
				bytebuffer.position(i);
				bytebuffer.get(is, 0, i_0_);
				return is;
			}
			throw new IllegalArgumentException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rf.b(").append(')').toString());
		}
	}

	public static int method5587(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		try {
			if ((i_6_ & 0x1) == 1) {
				int i_8_ = i_4_;
				i_4_ = i_5_;
				i_5_ = i_8_;
			}
			i_3_ &= 0x3;
			if (i_3_ == 0)
				return i;
			if (i_3_ == 1)
				return i_2_;
			if (2 == i_3_)
				return 7 - i - (i_4_ - 1);
			return 7 - i_2_ - (i_5_ - 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rf.i(").append(')').toString());
		}
	}

	static String method5588(CharSequence charsequence, Class513 class513, byte i) {
		try {
			if (charsequence == null)
				return null;
			int i_9_ = 0;
			int i_10_;
			for (i_10_ = charsequence.length(); i_9_ < i_10_ && ConfigDefinitions.method3980(charsequence.charAt(i_9_), 185580898); i_9_++) {
				/* empty */
			}
			for (/**/; (i_10_ > i_9_ && ConfigDefinitions.method3980(charsequence.charAt(i_10_ - 1), -1519613648)); i_10_--) {
				/* empty */
			}
			int i_11_ = i_10_ - i_9_;
			if (i_11_ < 1 || i_11_ > Class3.method302(class513, 1677499576))
				return null;
			StringBuilder stringbuilder = new StringBuilder(i_11_);
			for (int i_12_ = i_9_; i_12_ < i_10_; i_12_++) {
				char c = charsequence.charAt(i_12_);
				if (!Class422.method5621(c, -1788323982)) {
					if (i >= 5) {
						/* empty */
					}
				} else {
					char c_13_ = Class126.method1406(c, 1232009783);
					if (c_13_ == 0) {
						if (i >= 5) {
							/* empty */
						}
					} else
						stringbuilder.append(c_13_);
				}
			}
			if (stringbuilder.length() == 0)
				return null;
			return stringbuilder.toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rf.i(").append(')').toString());
		}
	}
}
