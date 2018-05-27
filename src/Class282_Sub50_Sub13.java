/* Class282_Sub50_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub50_Sub13 extends Class282_Sub50 {
	static Index aClass317_9685;
	static Index aClass317_9686;
	int anInt9687;
	byte[][] aByteArrayArray9688;
	Class95[] aClass95Array9689;

	public boolean method15077() {
		if (null != ((Class282_Sub50_Sub13) this).aClass95Array9689)
			return true;
		if (((Class282_Sub50_Sub13) this).aByteArrayArray9688 == null) {
			synchronized (aClass317_9686) {
				if (!aClass317_9686.method5647((((Class282_Sub50_Sub13) this).anInt9687) * 2091314053, -2119577317)) {
					boolean bool = false;
					return bool;
				}
				int[] is = aClass317_9686.method5616((((Class282_Sub50_Sub13) this).anInt9687) * 2091314053, -1321914973);
				((Class282_Sub50_Sub13) this).aByteArrayArray9688 = new byte[is.length][];
				for (int i = 0; i < is.length; i++)
					((Class282_Sub50_Sub13) this).aByteArrayArray9688[i] = aClass317_9686.getFile((((Class282_Sub50_Sub13) this).anInt9687 * 2091314053), is[i], -1325143145);
			}
		}
		boolean bool = true;
		for (int i = 0; i < ((Class282_Sub50_Sub13) this).aByteArrayArray9688.length; i++) {
			byte[] is = ((Class282_Sub50_Sub13) this).aByteArrayArray9688[i];
			RsByteBuffer class282_sub35 = new RsByteBuffer(is);
			class282_sub35.index = -1115476867;
			int i_0_ = class282_sub35.readUnsignedShort();
			synchronized (aClass317_9685) {
				bool &= aClass317_9685.method5661(i_0_, -514248517);
			}
		}
		if (!bool)
			return false;
		Class473 class473 = new Class473();
		int[] is;
		synchronized (aClass317_9686) {
			int i = aClass317_9686.filesCount((((Class282_Sub50_Sub13) this).anInt9687) * 2091314053, -508277238);
			((Class282_Sub50_Sub13) this).aClass95Array9689 = new Class95[i];
			is = aClass317_9686.method5616((((Class282_Sub50_Sub13) this).anInt9687) * 2091314053, -1703325907);
		}
		for (int i = 0; i < is.length; i++) {
			byte[] is_1_ = ((Class282_Sub50_Sub13) this).aByteArrayArray9688[i];
			RsByteBuffer class282_sub35 = new RsByteBuffer(is_1_);
			class282_sub35.index = -1115476867;
			int i_2_ = class282_sub35.readUnsignedShort();
			Class282_Sub12 class282_sub12 = null;
			for (Class282_Sub12 class282_sub12_3_ = (Class282_Sub12) class473.method7859(1412373634); class282_sub12_3_ != null; class282_sub12_3_ = (Class282_Sub12) class473.method7857((byte) -113)) {
				if (i_2_ == (((Class282_Sub12) class282_sub12_3_).anInt7559 * -2041542071)) {
					class282_sub12 = class282_sub12_3_;
					break;
				}
			}
			if (class282_sub12 == null) {
				synchronized (aClass317_9685) {
					class282_sub12 = new Class282_Sub12(i_2_, (aClass317_9685.getFile(i_2_, -1406400793)));
				}
				class473.method7877(class282_sub12, 935511421);
			}
			((Class282_Sub50_Sub13) this).aClass95Array9689[is[i]] = new Class95(is_1_, class282_sub12);
		}
		((Class282_Sub50_Sub13) this).aByteArrayArray9688 = null;
		return true;
	}

	public boolean method15078(int i) {
		return (((Class95) ((Class282_Sub50_Sub13) this).aClass95Array9689[i]).aBool986);
	}

	public boolean method15079(int i, int i_4_) {
		return (((Class95) ((Class282_Sub50_Sub13) this).aClass95Array9689[i]).aBool986);
	}

	public boolean method15080(int i, int i_5_) {
		return (((Class95) ((Class282_Sub50_Sub13) this).aClass95Array9689[i]).aBool972);
	}

	public boolean method15081(int i, int i_6_) {
		return (((Class95) ((Class282_Sub50_Sub13) this).aClass95Array9689[i]).aBool988);
	}

	public Class282_Sub50_Sub13(int i) {
		((Class282_Sub50_Sub13) this).anInt9687 = i * -155691699;
	}

	public boolean method15082(int i) {
		return (((Class95) ((Class282_Sub50_Sub13) this).aClass95Array9689[i]).aBool986);
	}

	public boolean method15083(int i) {
		return (((Class95) ((Class282_Sub50_Sub13) this).aClass95Array9689[i]).aBool986);
	}

	public boolean method15084(int i) {
		return (((Class95) ((Class282_Sub50_Sub13) this).aClass95Array9689[i]).aBool972);
	}

	public boolean method15085(int i) {
		return (((Class95) ((Class282_Sub50_Sub13) this).aClass95Array9689[i]).aBool972);
	}

	public boolean method15086(byte i) {
		if (null != ((Class282_Sub50_Sub13) this).aClass95Array9689)
			return true;
		if (((Class282_Sub50_Sub13) this).aByteArrayArray9688 == null) {
			synchronized (aClass317_9686) {
				if (!aClass317_9686.method5647((((Class282_Sub50_Sub13) this).anInt9687) * 2091314053, -2119577317)) {
					boolean bool = false;
					return bool;
				}
				int[] is = aClass317_9686.method5616((((Class282_Sub50_Sub13) this).anInt9687) * 2091314053, -751611807);
				((Class282_Sub50_Sub13) this).aByteArrayArray9688 = new byte[is.length][];
				for (int i_7_ = 0; i_7_ < is.length; i_7_++)
					((Class282_Sub50_Sub13) this).aByteArrayArray9688[i_7_] = aClass317_9686.getFile((((Class282_Sub50_Sub13) this).anInt9687 * 2091314053), is[i_7_], -1677831078);
			}
		}
		boolean bool = true;
		for (int i_8_ = 0; i_8_ < ((Class282_Sub50_Sub13) this).aByteArrayArray9688.length; i_8_++) {
			byte[] is = ((Class282_Sub50_Sub13) this).aByteArrayArray9688[i_8_];
			RsByteBuffer class282_sub35 = new RsByteBuffer(is);
			class282_sub35.index = -1115476867;
			int i_9_ = class282_sub35.readUnsignedShort();
			synchronized (aClass317_9685) {
				bool &= aClass317_9685.method5661(i_9_, 518523792);
			}
		}
		if (!bool)
			return false;
		Class473 class473 = new Class473();
		int[] is;
		synchronized (aClass317_9686) {
			int i_10_ = aClass317_9686.filesCount((((Class282_Sub50_Sub13) this).anInt9687) * 2091314053, -35753208);
			((Class282_Sub50_Sub13) this).aClass95Array9689 = new Class95[i_10_];
			is = aClass317_9686.method5616((((Class282_Sub50_Sub13) this).anInt9687) * 2091314053, -1900755589);
		}
		for (int i_11_ = 0; i_11_ < is.length; i_11_++) {
			byte[] is_12_ = ((Class282_Sub50_Sub13) this).aByteArrayArray9688[i_11_];
			RsByteBuffer class282_sub35 = new RsByteBuffer(is_12_);
			class282_sub35.index = -1115476867;
			int i_13_ = class282_sub35.readUnsignedShort();
			Class282_Sub12 class282_sub12 = null;
			for (Class282_Sub12 class282_sub12_14_ = (Class282_Sub12) class473.method7859(445165990); class282_sub12_14_ != null; class282_sub12_14_ = (Class282_Sub12) class473.method7857((byte) -42)) {
				if (i_13_ == (((Class282_Sub12) class282_sub12_14_).anInt7559 * -2041542071)) {
					class282_sub12 = class282_sub12_14_;
					break;
				}
			}
			if (class282_sub12 == null) {
				synchronized (aClass317_9685) {
					class282_sub12 = new Class282_Sub12(i_13_, (aClass317_9685.getFile(i_13_, -601020019)));
				}
				class473.method7877(class282_sub12, 501140771);
			}
			((Class282_Sub50_Sub13) this).aClass95Array9689[is[i_11_]] = new Class95(is_12_, class282_sub12);
		}
		((Class282_Sub50_Sub13) this).aByteArrayArray9688 = null;
		return true;
	}

	public boolean method15087(int i) {
		return (((Class95) ((Class282_Sub50_Sub13) this).aClass95Array9689[i]).aBool972);
	}

	public boolean method15088(int i) {
		return (((Class95) ((Class282_Sub50_Sub13) this).aClass95Array9689[i]).aBool988);
	}

	public boolean method15089(int i) {
		return (((Class95) ((Class282_Sub50_Sub13) this).aClass95Array9689[i]).aBool988);
	}

	public static byte[] method15090(byte[] is, int i) {
		if (is == null)
			return null;
		byte[] is_15_ = new byte[is.length];
		System.arraycopy(is, 0, is_15_, 0, is.length);
		return is_15_;
	}
}
