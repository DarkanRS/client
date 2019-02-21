
/* Class225_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class225_Sub1 extends RouteStrategy {
	public boolean canExit(int i, int i_0_, int i_1_, ClipMap class336, byte i_2_) {
		return (i_0_ == -1440558477 * approxDestinationX && i_1_ == 1732585867 * approxDestinationY);
	}

	public boolean method3786(int i, int i_3_, int i_4_, ClipMap class336) {
		return (i_3_ == -1440558477 * approxDestinationX && i_4_ == 1732585867 * approxDestinationY);
	}

	Class225_Sub1() {
		/* empty */
	}

	public boolean method3785(int i, int i_5_, int i_6_, ClipMap class336) {
		return (i_5_ == -1440558477 * approxDestinationX && i_6_ == 1732585867 * approxDestinationY);
	}

	public boolean method3788(int i, int i_7_, int i_8_, ClipMap class336) {
		return (i_7_ == -1440558477 * approxDestinationX && i_8_ == 1732585867 * approxDestinationY);
	}

	public boolean method3789(int i, int i_9_, int i_10_, ClipMap class336) {
		return (i_9_ == -1440558477 * approxDestinationX && i_10_ == 1732585867 * approxDestinationY);
	}

	static Class282_Sub54 method12791(int i) {
		Class442 class442 = null;
		Class282_Sub54 class282_sub54 = new Class282_Sub54(client.CURRENT_GAME, 0);
		try {
			class442 = Class345.method6137("", client.CURRENT_GAME.aString5748, false, (byte) -1);
			byte[] is = new byte[(int) class442.method7388(-273347477)];
			int i_11_;
			for (int i_12_ = 0; i_12_ < is.length; i_12_ += i_11_) {
				i_11_ = class442.method7389(is, i_12_, is.length - i_12_, (byte) -21);
				if (-1 == i_11_)
					throw new IOException();
			}
			class282_sub54 = new Class282_Sub54(new RsByteBuffer(is), client.CURRENT_GAME, 0);
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class442 != null)
				class442.method7385((short) 15234);
		} catch (Exception exception) {
			/* empty */
		}
		return class282_sub54;
	}

	static CS2Script method12792(Class397 class397, int i, int i_13_, int i_14_) {
		int i_15_ = 1700138339 * class397.anInt4802 | i << 10;
		CS2Script class282_sub50_sub5 = ((CS2Script) Class506.aClass223_5857.method3758((long) i_15_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		byte[] is = (IndexLoaders.CS2_SCRIPTS_INDEX.getFile(IndexLoaders.CS2_SCRIPTS_INDEX.method5623(i_15_, (byte) 4)));
		if (is != null) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 887206826);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_15_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			Class506.aClass223_5857.method3759(class282_sub50_sub5, (long) i_15_ << 16);
			return class282_sub50_sub5;
		}
		i_15_ = 1700138339 * class397.anInt4802 | 65536 + i_13_ << 10;
		class282_sub50_sub5 = ((CS2Script) Class506.aClass223_5857.method3758((long) i_15_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (IndexLoaders.CS2_SCRIPTS_INDEX.getFile(IndexLoaders.CS2_SCRIPTS_INDEX.method5623(i_15_, (byte) 4)));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, 163170026);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_15_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			Class506.aClass223_5857.method3759(class282_sub50_sub5, (long) i_15_ << 16);
			return class282_sub50_sub5;
		}
		i_15_ = 1700138339 * class397.anInt4802 | 0x3fffc00;
		class282_sub50_sub5 = ((CS2Script) Class506.aClass223_5857.method3758((long) i_15_ << 16));
		if (null != class282_sub50_sub5)
			return class282_sub50_sub5;
		is = (IndexLoaders.CS2_SCRIPTS_INDEX.getFile(IndexLoaders.CS2_SCRIPTS_INDEX.method5623(i_15_, (byte) 4)));
		if (null != is) {
			if (is.length <= 1)
				return null;
			try {
				class282_sub50_sub5 = GraphicalRenderer.method8699(is, -517791588);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_15_).toString());
			}
			class282_sub50_sub5.aClass397_9527 = class397;
			Class506.aClass223_5857.method3759(class282_sub50_sub5, (long) i_15_ << 16);
			return class282_sub50_sub5;
		}
		return null;
	}
}
