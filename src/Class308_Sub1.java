/* Class308_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class308_Sub1 extends Class308 {
	int anInt7668;
	static int anInt7669 = 10;
	Class243 aClass243_7670;
	byte[][] aByteArrayArray7671 = new byte[10][];
	int[] anIntArray7672;
	int anInt7673;
	RsByteBuffer aClass298_Sub53_7674 = new RsByteBuffer(null);
	RsByteBuffer aClass298_Sub53_7675 = new RsByteBuffer(null);

	int method3775(byte[] is, int i) throws IOException {
		try {
			if (((Class308_Sub1) this).anIntArray7672 == null) {
				if (!((Class308_Sub1) this).aClass243_7670.method2290(((Class308_Sub1) this).anInt7668 * -247750727, 0, -925167069))
					return 0;
				byte[] is_0_ = (((Class308_Sub1) this).aClass243_7670.getFile(-247750727 * ((Class308_Sub1) this).anInt7668, 0, (byte) -2));
				if (null == is_0_)
					throw new IllegalStateException("");
				((Class308_Sub1) this).aClass298_Sub53_7675.buffer = is_0_;
				((Class308_Sub1) this).aClass298_Sub53_7675.index = 0;
				int i_1_ = is_0_.length >> 1;
				((Class308_Sub1) this).anIntArray7672 = new int[i_1_];
				for (int i_2_ = 0; i_2_ < i_1_; i_2_++)
					((Class308_Sub1) this).anIntArray7672[i_2_] = ((Class308_Sub1) this).aClass298_Sub53_7675.readUnsignedShort();
			}
			if (((Class308_Sub1) this).anInt7673 * 352672983 >= ((Class308_Sub1) this).anIntArray7672.length)
				return -1;
			method3785((byte) 81);
			((Class308_Sub1) this).aClass298_Sub53_7675.buffer = is;
			((Class308_Sub1) this).aClass298_Sub53_7675.index = 0;
			while_9_: do {
				do {
					if ((((Class308_Sub1) this).aClass298_Sub53_7675.index * 385051775) >= (((Class308_Sub1) this).aClass298_Sub53_7675.buffer).length)
						break while_9_;
					if ((((Class308_Sub1) this).aClass298_Sub53_7674.buffer) == null) {
						if (((Class308_Sub1) this).aByteArrayArray7671[0] == null) {
							((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
							return ((((Class308_Sub1) this).aClass298_Sub53_7675.index) * 385051775);
						}
						((Class308_Sub1) this).aClass298_Sub53_7674.buffer = ((Class308_Sub1) this).aByteArrayArray7671[0];
					}
					int i_3_ = ((((Class308_Sub1) this).aClass298_Sub53_7675.buffer).length - 385051775 * (((Class308_Sub1) this).aClass298_Sub53_7675.index));
					int i_4_ = ((((Class308_Sub1) this).aClass298_Sub53_7674.buffer).length - 385051775 * (((Class308_Sub1) this).aClass298_Sub53_7674.index));
					if (i_3_ < i_4_) {
						((Class308_Sub1) this).aClass298_Sub53_7674.readBytes((((Class308_Sub1) this).aClass298_Sub53_7675.buffer), (((Class308_Sub1) this).aClass298_Sub53_7675.index) * 385051775, i_3_, -953523806);
						((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
						return is.length;
					}
					((Class308_Sub1) this).aClass298_Sub53_7675.writeBytes((((Class308_Sub1) this).aClass298_Sub53_7674.buffer), (((Class308_Sub1) this).aClass298_Sub53_7674.index * 385051775), i_4_, (short) -26872);
					((Class308_Sub1) this).aClass298_Sub53_7674.buffer = null;
					((Class308_Sub1) this).aClass298_Sub53_7674.index = 0;
					((Class308_Sub1) this).anInt7673 += -592488729;
					for (int i_5_ = 0; i_5_ < 9; i_5_++)
						((Class308_Sub1) this).aByteArrayArray7671[i_5_] = (((Class308_Sub1) this).aByteArrayArray7671[1 + i_5_]);
					((Class308_Sub1) this).aByteArrayArray7671[9] = null;
				} while (((Class308_Sub1) this).anInt7673 * 352672983 < ((Class308_Sub1) this).anIntArray7672.length);
				((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
				return (((Class308_Sub1) this).aClass298_Sub53_7675.index * 385051775);
			} while (false);
			((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
			return is.length;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acm.a(").append(')').toString());
		}
	}

	public void method3785(byte i) {
		try {
			if (null != ((Class308_Sub1) this).anIntArray7672) {
				for (int i_6_ = 0; (i_6_ < 10 && (i_6_ + 352672983 * ((Class308_Sub1) this).anInt7673 < ((Class308_Sub1) this).anIntArray7672.length)); i_6_++) {
					if ((((Class308_Sub1) this).aByteArrayArray7671[i_6_] == null) && (((Class308_Sub1) this).aClass243_7670.method2290((((Class308_Sub1) this).anIntArray7672[i_6_ + (352672983 * ((Class308_Sub1) this).anInt7673)]), 0, -951445461)))
						((Class308_Sub1) this).aByteArrayArray7671[i_6_] = (((Class308_Sub1) this).aClass243_7670.getFile((((Class308_Sub1) this).anIntArray7672[(352672983 * ((Class308_Sub1) this).anInt7673 + i_6_)]), 0, (byte) -31));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acm.as(").append(')').toString());
		}
	}

	int method3777(byte[] is) throws IOException {
		if (((Class308_Sub1) this).anIntArray7672 == null) {
			if (!((Class308_Sub1) this).aClass243_7670.method2290(((Class308_Sub1) this).anInt7668 * -247750727, 0, -1752861403))
				return 0;
			byte[] is_7_ = (((Class308_Sub1) this).aClass243_7670.getFile(-247750727 * ((Class308_Sub1) this).anInt7668, 0, (byte) 9));
			if (null == is_7_)
				throw new IllegalStateException("");
			((Class308_Sub1) this).aClass298_Sub53_7675.buffer = is_7_;
			((Class308_Sub1) this).aClass298_Sub53_7675.index = 0;
			int i = is_7_.length >> 1;
			((Class308_Sub1) this).anIntArray7672 = new int[i];
			for (int i_8_ = 0; i_8_ < i; i_8_++)
				((Class308_Sub1) this).anIntArray7672[i_8_] = ((Class308_Sub1) this).aClass298_Sub53_7675.readUnsignedShort();
		}
		if (((Class308_Sub1) this).anInt7673 * 352672983 >= ((Class308_Sub1) this).anIntArray7672.length)
			return -1;
		method3785((byte) 97);
		((Class308_Sub1) this).aClass298_Sub53_7675.buffer = is;
		((Class308_Sub1) this).aClass298_Sub53_7675.index = 0;
		while_10_: do {
			do {
				if ((((Class308_Sub1) this).aClass298_Sub53_7675.index * 385051775) >= (((Class308_Sub1) this).aClass298_Sub53_7675.buffer).length)
					break while_10_;
				if (((Class308_Sub1) this).aClass298_Sub53_7674.buffer == null) {
					if (((Class308_Sub1) this).aByteArrayArray7671[0] == null) {
						((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
						return ((((Class308_Sub1) this).aClass298_Sub53_7675.index) * 385051775);
					}
					((Class308_Sub1) this).aClass298_Sub53_7674.buffer = ((Class308_Sub1) this).aByteArrayArray7671[0];
				}
				int i = ((((Class308_Sub1) this).aClass298_Sub53_7675.buffer).length - 385051775 * (((Class308_Sub1) this).aClass298_Sub53_7675.index));
				int i_9_ = ((((Class308_Sub1) this).aClass298_Sub53_7674.buffer).length - 385051775 * (((Class308_Sub1) this).aClass298_Sub53_7674.index));
				if (i < i_9_) {
					((Class308_Sub1) this).aClass298_Sub53_7674.readBytes((((Class308_Sub1) this).aClass298_Sub53_7675.buffer), (((Class308_Sub1) this).aClass298_Sub53_7675.index * 385051775), i, -953523806);
					((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
					return is.length;
				}
				((Class308_Sub1) this).aClass298_Sub53_7675.writeBytes((((Class308_Sub1) this).aClass298_Sub53_7674.buffer), (((Class308_Sub1) this).aClass298_Sub53_7674.index * 385051775), i_9_, (short) -14294);
				((Class308_Sub1) this).aClass298_Sub53_7674.buffer = null;
				((Class308_Sub1) this).aClass298_Sub53_7674.index = 0;
				((Class308_Sub1) this).anInt7673 += -592488729;
				for (int i_10_ = 0; i_10_ < 9; i_10_++)
					((Class308_Sub1) this).aByteArrayArray7671[i_10_] = (((Class308_Sub1) this).aByteArrayArray7671[1 + i_10_]);
				((Class308_Sub1) this).aByteArrayArray7671[9] = null;
			} while (((Class308_Sub1) this).anInt7673 * 352672983 < ((Class308_Sub1) this).anIntArray7672.length);
			((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
			return (((Class308_Sub1) this).aClass298_Sub53_7675.index * 385051775);
		} while (false);
		((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
		return is.length;
	}

	int method3778(byte[] is) throws IOException {
		if (((Class308_Sub1) this).anIntArray7672 == null) {
			if (!((Class308_Sub1) this).aClass243_7670.method2290(((Class308_Sub1) this).anInt7668 * -247750727, 0, -718226291))
				return 0;
			byte[] is_11_ = (((Class308_Sub1) this).aClass243_7670.getFile(-247750727 * ((Class308_Sub1) this).anInt7668, 0, (byte) -126));
			if (null == is_11_)
				throw new IllegalStateException("");
			((Class308_Sub1) this).aClass298_Sub53_7675.buffer = is_11_;
			((Class308_Sub1) this).aClass298_Sub53_7675.index = 0;
			int i = is_11_.length >> 1;
			((Class308_Sub1) this).anIntArray7672 = new int[i];
			for (int i_12_ = 0; i_12_ < i; i_12_++)
				((Class308_Sub1) this).anIntArray7672[i_12_] = ((Class308_Sub1) this).aClass298_Sub53_7675.readUnsignedShort();
		}
		if (((Class308_Sub1) this).anInt7673 * 352672983 >= ((Class308_Sub1) this).anIntArray7672.length)
			return -1;
		method3785((byte) 11);
		((Class308_Sub1) this).aClass298_Sub53_7675.buffer = is;
		((Class308_Sub1) this).aClass298_Sub53_7675.index = 0;
		while_11_: do {
			do {
				if ((((Class308_Sub1) this).aClass298_Sub53_7675.index * 385051775) >= (((Class308_Sub1) this).aClass298_Sub53_7675.buffer).length)
					break while_11_;
				if (((Class308_Sub1) this).aClass298_Sub53_7674.buffer == null) {
					if (((Class308_Sub1) this).aByteArrayArray7671[0] == null) {
						((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
						return ((((Class308_Sub1) this).aClass298_Sub53_7675.index) * 385051775);
					}
					((Class308_Sub1) this).aClass298_Sub53_7674.buffer = ((Class308_Sub1) this).aByteArrayArray7671[0];
				}
				int i = ((((Class308_Sub1) this).aClass298_Sub53_7675.buffer).length - 385051775 * (((Class308_Sub1) this).aClass298_Sub53_7675.index));
				int i_13_ = ((((Class308_Sub1) this).aClass298_Sub53_7674.buffer).length - 385051775 * (((Class308_Sub1) this).aClass298_Sub53_7674.index));
				if (i < i_13_) {
					((Class308_Sub1) this).aClass298_Sub53_7674.readBytes((((Class308_Sub1) this).aClass298_Sub53_7675.buffer), (((Class308_Sub1) this).aClass298_Sub53_7675.index * 385051775), i, -953523806);
					((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
					return is.length;
				}
				((Class308_Sub1) this).aClass298_Sub53_7675.writeBytes((((Class308_Sub1) this).aClass298_Sub53_7674.buffer), (((Class308_Sub1) this).aClass298_Sub53_7674.index * 385051775), i_13_, (short) -19169);
				((Class308_Sub1) this).aClass298_Sub53_7674.buffer = null;
				((Class308_Sub1) this).aClass298_Sub53_7674.index = 0;
				((Class308_Sub1) this).anInt7673 += -592488729;
				for (int i_14_ = 0; i_14_ < 9; i_14_++)
					((Class308_Sub1) this).aByteArrayArray7671[i_14_] = (((Class308_Sub1) this).aByteArrayArray7671[1 + i_14_]);
				((Class308_Sub1) this).aByteArrayArray7671[9] = null;
			} while (((Class308_Sub1) this).anInt7673 * 352672983 < ((Class308_Sub1) this).anIntArray7672.length);
			((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
			return (((Class308_Sub1) this).aClass298_Sub53_7675.index * 385051775);
		} while (false);
		((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
		return is.length;
	}

	int method3766(byte[] is) throws IOException {
		if (((Class308_Sub1) this).anIntArray7672 == null) {
			if (!((Class308_Sub1) this).aClass243_7670.method2290(((Class308_Sub1) this).anInt7668 * -247750727, 0, -1469304085))
				return 0;
			byte[] is_15_ = (((Class308_Sub1) this).aClass243_7670.getFile(-247750727 * ((Class308_Sub1) this).anInt7668, 0, (byte) -90));
			if (null == is_15_)
				throw new IllegalStateException("");
			((Class308_Sub1) this).aClass298_Sub53_7675.buffer = is_15_;
			((Class308_Sub1) this).aClass298_Sub53_7675.index = 0;
			int i = is_15_.length >> 1;
			((Class308_Sub1) this).anIntArray7672 = new int[i];
			for (int i_16_ = 0; i_16_ < i; i_16_++)
				((Class308_Sub1) this).anIntArray7672[i_16_] = ((Class308_Sub1) this).aClass298_Sub53_7675.readUnsignedShort();
		}
		if (((Class308_Sub1) this).anInt7673 * 352672983 >= ((Class308_Sub1) this).anIntArray7672.length)
			return -1;
		method3785((byte) 56);
		((Class308_Sub1) this).aClass298_Sub53_7675.buffer = is;
		((Class308_Sub1) this).aClass298_Sub53_7675.index = 0;
		while_12_: do {
			do {
				if ((((Class308_Sub1) this).aClass298_Sub53_7675.index * 385051775) >= (((Class308_Sub1) this).aClass298_Sub53_7675.buffer).length)
					break while_12_;
				if (((Class308_Sub1) this).aClass298_Sub53_7674.buffer == null) {
					if (((Class308_Sub1) this).aByteArrayArray7671[0] == null) {
						((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
						return ((((Class308_Sub1) this).aClass298_Sub53_7675.index) * 385051775);
					}
					((Class308_Sub1) this).aClass298_Sub53_7674.buffer = ((Class308_Sub1) this).aByteArrayArray7671[0];
				}
				int i = ((((Class308_Sub1) this).aClass298_Sub53_7675.buffer).length - 385051775 * (((Class308_Sub1) this).aClass298_Sub53_7675.index));
				int i_17_ = ((((Class308_Sub1) this).aClass298_Sub53_7674.buffer).length - 385051775 * (((Class308_Sub1) this).aClass298_Sub53_7674.index));
				if (i < i_17_) {
					((Class308_Sub1) this).aClass298_Sub53_7674.readBytes((((Class308_Sub1) this).aClass298_Sub53_7675.buffer), (((Class308_Sub1) this).aClass298_Sub53_7675.index * 385051775), i, -953523806);
					((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
					return is.length;
				}
				((Class308_Sub1) this).aClass298_Sub53_7675.writeBytes((((Class308_Sub1) this).aClass298_Sub53_7674.buffer), (((Class308_Sub1) this).aClass298_Sub53_7674.index * 385051775), i_17_, (short) -30519);
				((Class308_Sub1) this).aClass298_Sub53_7674.buffer = null;
				((Class308_Sub1) this).aClass298_Sub53_7674.index = 0;
				((Class308_Sub1) this).anInt7673 += -592488729;
				for (int i_18_ = 0; i_18_ < 9; i_18_++)
					((Class308_Sub1) this).aByteArrayArray7671[i_18_] = (((Class308_Sub1) this).aByteArrayArray7671[1 + i_18_]);
				((Class308_Sub1) this).aByteArrayArray7671[9] = null;
			} while (((Class308_Sub1) this).anInt7673 * 352672983 < ((Class308_Sub1) this).anIntArray7672.length);
			((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
			return (((Class308_Sub1) this).aClass298_Sub53_7675.index * 385051775);
		} while (false);
		((Class308_Sub1) this).aClass298_Sub53_7675.buffer = null;
		return is.length;
	}

	public Class308_Sub1(int i, Class243 class243, int i_19_) {
		super(i);
		((Class308_Sub1) this).aClass243_7670 = class243;
		((Class308_Sub1) this).anInt7668 = -2133150071 * i_19_;
	}

	static final void method3786(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -301797495) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1150 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acm.kh(").append(')').toString());
		}
	}
}
