/* Class524 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class524 implements Runnable {
	volatile String aString6293;
	InetAddress anInetAddress6294;

	public String method6376(int i) {
		try {
			return ((Class524) this).aString6293;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("y.a(").append(')').toString());
		}
	}

	Class524(int i) throws UnknownHostException {
		((Class524) this).anInetAddress6294 = InetAddress.getByAddress(new byte[] { (byte) (i >> 24 & 0xff), (byte) (i >> 16 & 0xff), (byte) (i >> 8 & 0xff), (byte) (i & 0xff) });
	}

	public void run() {
		try {
			((Class524) this).aString6293 = ((Class524) this).anInetAddress6294.getHostName();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("y.run(").append(')').toString());
		}
	}

	static final int method6377(int i, int i_0_, int i_1_, int i_2_) {
		try {
			int i_3_ = i / i_1_;
			int i_4_ = i & i_1_ - 1;
			int i_5_ = i_0_ / i_1_;
			int i_6_ = i_0_ & i_1_ - 1;
			int i_7_ = Class264_Sub2.method2508(i_3_, i_5_, (short) -9483);
			int i_8_ = Class264_Sub2.method2508(1 + i_3_, i_5_, (short) -29113);
			int i_9_ = Class264_Sub2.method2508(i_3_, i_5_ + 1, (short) -24319);
			int i_10_ = Class264_Sub2.method2508(i_3_ + 1, 1 + i_5_, (short) -3168);
			int i_11_ = Class298_Sub40_Sub12.method3516(i_7_, i_8_, i_4_, i_1_, (byte) 105);
			int i_12_ = Class298_Sub40_Sub12.method3516(i_9_, i_10_, i_4_, i_1_, (byte) 123);
			return Class298_Sub40_Sub12.method3516(i_11_, i_12_, i_6_, i_1_, (byte) 78);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("y.w(").append(')').toString());
		}
	}
}
