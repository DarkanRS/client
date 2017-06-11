/* Class298_Sub24_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class Class298_Sub24_Sub4 extends Class298_Sub24 {
	String aString9300;
	static int anInt9301 = 0;
	int anInt9302;
	static int anInt9303 = 128;
	String aString9304;
	String aString9305;
	float aFloat9306;
	float aFloat9307;
	int anInt9308;

	void method3074(OggPacket oggpacket, int i) {
		try {
			if (((Class298_Sub24_Sub4) this).anInt7352 * -1312498565 <= 0 || "SUB".equals(((Class298_Sub24_Sub4) this).aString9305)) {
				RsByteBuffer class298_sub53 = new RsByteBuffer(oggpacket.getData());
				int i_0_ = class298_sub53.readUnsignedByte();
				if (-1312498565 * ((Class298_Sub24_Sub4) this).anInt7352 <= 8) {
					if (0 == (i_0_ | 0x80))
						throw new IllegalStateException();
					if (-1312498565 * ((Class298_Sub24_Sub4) this).anInt7352 == 0) {
						class298_sub53.index += -1617461143;
						((Class298_Sub24_Sub4) this).anInt9302 = class298_sub53.method3600(1431459183) * 33758645;
						((Class298_Sub24_Sub4) this).anInt9308 = (class298_sub53.method3600(-150244186) * 1857578037);
						if ((((Class298_Sub24_Sub4) this).anInt9302 * -180836195) == 0 || (((Class298_Sub24_Sub4) this).anInt9308 * 2110967325) == 0)
							throw new IllegalStateException();
						RsByteBuffer class298_sub53_1_ = new RsByteBuffer(16);
						class298_sub53.readBytes((class298_sub53_1_.buffer), 0, 16, -953523806);
						((Class298_Sub24_Sub4) this).aString9304 = class298_sub53_1_.readString(-1838621769);
						class298_sub53_1_.index = 0;
						class298_sub53.readBytes((class298_sub53_1_.buffer), 0, 16, -953523806);
						((Class298_Sub24_Sub4) this).aString9305 = class298_sub53_1_.readString(1476138543);
					}
				} else {
					if (0 == i_0_) {
						long l = class298_sub53.method3640(1976358727);
						long l_2_ = class298_sub53.method3640(1286401972);
						long l_3_ = class298_sub53.method3640(1829097486);
						if (l < 0L || l_2_ < 0L || l_3_ < 0L || l_3_ > l)
							throw new IllegalStateException();
						((Class298_Sub24_Sub4) this).aFloat9306 = ((float) (l * (long) (2110967325 * ((Class298_Sub24_Sub4) this).anInt9308)) / (float) (-180836195 * (((Class298_Sub24_Sub4) this).anInt9302)));
						((Class298_Sub24_Sub4) this).aFloat9307 = ((float) ((l + l_2_) * (long) ((((Class298_Sub24_Sub4) this).anInt9308) * 2110967325)) / (float) (-180836195 * (((Class298_Sub24_Sub4) this).anInt9302)));
						int i_4_ = class298_sub53.method3600(-941704037);
						if (i_4_ < 0 || i_4_ > (class298_sub53.buffer.length - 385051775 * class298_sub53.index))
							throw new IllegalStateException();
						((Class298_Sub24_Sub4) this).aString9300 = Class214.method1995((class298_sub53.buffer), (class298_sub53.index * 385051775), i_4_, -730069426);
					}
					if ((i_0_ | 0x80) != 0)
						return;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajv.f(").append(')').toString());
		}
	}

	String method3091(byte i) {
		try {
			return ((Class298_Sub24_Sub4) this).aString9304;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajv.q(").append(')').toString());
		}
	}

	public float method3092(byte i) {
		try {
			return ((Class298_Sub24_Sub4) this).aFloat9306;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajv.n(").append(')').toString());
		}
	}

	public float method3093(int i) {
		try {
			return ((Class298_Sub24_Sub4) this).aFloat9307;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajv.s(").append(')').toString());
		}
	}

	public String method3094(int i) {
		try {
			return ((Class298_Sub24_Sub4) this).aString9300;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajv.z(").append(')').toString());
		}
	}

	void method3079() {
		/* empty */
	}

	void method3077(OggPacket oggpacket) {
		if (((Class298_Sub24_Sub4) this).anInt7352 * -1312498565 <= 0 || "SUB".equals(((Class298_Sub24_Sub4) this).aString9305)) {
			RsByteBuffer class298_sub53 = new RsByteBuffer(oggpacket.getData());
			int i = class298_sub53.readUnsignedByte();
			if (-1312498565 * ((Class298_Sub24_Sub4) this).anInt7352 <= 8) {
				if (0 == (i | 0x80))
					throw new IllegalStateException();
				if (-1312498565 * ((Class298_Sub24_Sub4) this).anInt7352 == 0) {
					class298_sub53.index += -1617461143;
					((Class298_Sub24_Sub4) this).anInt9302 = class298_sub53.method3600(-1960945614) * 33758645;
					((Class298_Sub24_Sub4) this).anInt9308 = class298_sub53.method3600(1105841706) * 1857578037;
					if ((((Class298_Sub24_Sub4) this).anInt9302 * -180836195 == 0) || (((Class298_Sub24_Sub4) this).anInt9308 * 2110967325 == 0))
						throw new IllegalStateException();
					RsByteBuffer class298_sub53_5_ = new RsByteBuffer(16);
					class298_sub53.readBytes(class298_sub53_5_.buffer, 0, 16, -953523806);
					((Class298_Sub24_Sub4) this).aString9304 = class298_sub53_5_.readString(-2059271269);
					class298_sub53_5_.index = 0;
					class298_sub53.readBytes(class298_sub53_5_.buffer, 0, 16, -953523806);
					((Class298_Sub24_Sub4) this).aString9305 = class298_sub53_5_.readString(254290400);
				}
			} else {
				if (0 == i) {
					long l = class298_sub53.method3640(1922871636);
					long l_6_ = class298_sub53.method3640(1312894396);
					long l_7_ = class298_sub53.method3640(718042704);
					if (l < 0L || l_6_ < 0L || l_7_ < 0L || l_7_ > l)
						throw new IllegalStateException();
					((Class298_Sub24_Sub4) this).aFloat9306 = ((float) (l * (long) (2110967325 * (((Class298_Sub24_Sub4) this).anInt9308))) / (float) (-180836195 * (((Class298_Sub24_Sub4) this).anInt9302)));
					((Class298_Sub24_Sub4) this).aFloat9307 = ((float) ((l + l_6_) * (long) ((((Class298_Sub24_Sub4) this).anInt9308) * 2110967325)) / (float) (-180836195 * (((Class298_Sub24_Sub4) this).anInt9302)));
					int i_8_ = class298_sub53.method3600(1321488370);
					if (i_8_ < 0 || i_8_ > (class298_sub53.buffer.length - 385051775 * class298_sub53.index))
						throw new IllegalStateException();
					((Class298_Sub24_Sub4) this).aString9300 = Class214.method1995(class298_sub53.buffer, (class298_sub53.index * 385051775), i_8_, -932621904);
				}
				if ((i | 0x80) != 0)
					return;
			}
		}
	}

	void method3078(OggPacket oggpacket) {
		if (((Class298_Sub24_Sub4) this).anInt7352 * -1312498565 <= 0 || "SUB".equals(((Class298_Sub24_Sub4) this).aString9305)) {
			RsByteBuffer class298_sub53 = new RsByteBuffer(oggpacket.getData());
			int i = class298_sub53.readUnsignedByte();
			if (-1312498565 * ((Class298_Sub24_Sub4) this).anInt7352 <= 8) {
				if (0 == (i | 0x80))
					throw new IllegalStateException();
				if (-1312498565 * ((Class298_Sub24_Sub4) this).anInt7352 == 0) {
					class298_sub53.index += -1617461143;
					((Class298_Sub24_Sub4) this).anInt9302 = class298_sub53.method3600(-1885777054) * 33758645;
					((Class298_Sub24_Sub4) this).anInt9308 = class298_sub53.method3600(-1908777764) * 1857578037;
					if ((((Class298_Sub24_Sub4) this).anInt9302 * -180836195 == 0) || (((Class298_Sub24_Sub4) this).anInt9308 * 2110967325 == 0))
						throw new IllegalStateException();
					RsByteBuffer class298_sub53_9_ = new RsByteBuffer(16);
					class298_sub53.readBytes(class298_sub53_9_.buffer, 0, 16, -953523806);
					((Class298_Sub24_Sub4) this).aString9304 = class298_sub53_9_.readString(933165446);
					class298_sub53_9_.index = 0;
					class298_sub53.readBytes(class298_sub53_9_.buffer, 0, 16, -953523806);
					((Class298_Sub24_Sub4) this).aString9305 = class298_sub53_9_.readString(-1680071522);
				}
			} else {
				if (0 == i) {
					long l = class298_sub53.method3640(1453589293);
					long l_10_ = class298_sub53.method3640(216828969);
					long l_11_ = class298_sub53.method3640(958666578);
					if (l < 0L || l_10_ < 0L || l_11_ < 0L || l_11_ > l)
						throw new IllegalStateException();
					((Class298_Sub24_Sub4) this).aFloat9306 = ((float) (l * (long) (2110967325 * (((Class298_Sub24_Sub4) this).anInt9308))) / (float) (-180836195 * (((Class298_Sub24_Sub4) this).anInt9302)));
					((Class298_Sub24_Sub4) this).aFloat9307 = ((float) ((l + l_10_) * (long) ((((Class298_Sub24_Sub4) this).anInt9308) * 2110967325)) / (float) (-180836195 * (((Class298_Sub24_Sub4) this).anInt9302)));
					int i_12_ = class298_sub53.method3600(-1427296069);
					if (i_12_ < 0 || i_12_ > (class298_sub53.buffer.length - 385051775 * class298_sub53.index))
						throw new IllegalStateException();
					((Class298_Sub24_Sub4) this).aString9300 = Class214.method1995(class298_sub53.buffer, (class298_sub53.index * 385051775), i_12_, -854138275);
				}
				if ((i | 0x80) != 0)
					return;
			}
		}
	}

	void method3072() {
		/* empty */
	}

	void method3076(OggPacket oggpacket) {
		if (((Class298_Sub24_Sub4) this).anInt7352 * -1312498565 <= 0 || "SUB".equals(((Class298_Sub24_Sub4) this).aString9305)) {
			RsByteBuffer class298_sub53 = new RsByteBuffer(oggpacket.getData());
			int i = class298_sub53.readUnsignedByte();
			if (-1312498565 * ((Class298_Sub24_Sub4) this).anInt7352 <= 8) {
				if (0 == (i | 0x80))
					throw new IllegalStateException();
				if (-1312498565 * ((Class298_Sub24_Sub4) this).anInt7352 == 0) {
					class298_sub53.index += -1617461143;
					((Class298_Sub24_Sub4) this).anInt9302 = class298_sub53.method3600(-1909623846) * 33758645;
					((Class298_Sub24_Sub4) this).anInt9308 = class298_sub53.method3600(1996267542) * 1857578037;
					if ((((Class298_Sub24_Sub4) this).anInt9302 * -180836195 == 0) || (((Class298_Sub24_Sub4) this).anInt9308 * 2110967325 == 0))
						throw new IllegalStateException();
					RsByteBuffer class298_sub53_13_ = new RsByteBuffer(16);
					class298_sub53.readBytes((class298_sub53_13_.buffer), 0, 16, -953523806);
					((Class298_Sub24_Sub4) this).aString9304 = class298_sub53_13_.readString(-1904784161);
					class298_sub53_13_.index = 0;
					class298_sub53.readBytes((class298_sub53_13_.buffer), 0, 16, -953523806);
					((Class298_Sub24_Sub4) this).aString9305 = class298_sub53_13_.readString(333136246);
				}
			} else {
				if (0 == i) {
					long l = class298_sub53.method3640(1871449900);
					long l_14_ = class298_sub53.method3640(2001133775);
					long l_15_ = class298_sub53.method3640(1245800446);
					if (l < 0L || l_14_ < 0L || l_15_ < 0L || l_15_ > l)
						throw new IllegalStateException();
					((Class298_Sub24_Sub4) this).aFloat9306 = ((float) (l * (long) (2110967325 * (((Class298_Sub24_Sub4) this).anInt9308))) / (float) (-180836195 * (((Class298_Sub24_Sub4) this).anInt9302)));
					((Class298_Sub24_Sub4) this).aFloat9307 = ((float) ((l + l_14_) * (long) ((((Class298_Sub24_Sub4) this).anInt9308) * 2110967325)) / (float) (-180836195 * (((Class298_Sub24_Sub4) this).anInt9302)));
					int i_16_ = class298_sub53.method3600(1651625621);
					if (i_16_ < 0 || i_16_ > (class298_sub53.buffer.length - 385051775 * class298_sub53.index))
						throw new IllegalStateException();
					((Class298_Sub24_Sub4) this).aString9300 = Class214.method1995(class298_sub53.buffer, (class298_sub53.index * 385051775), i_16_, 1348372434);
				}
				if ((i | 0x80) != 0)
					return;
			}
		}
	}

	void method3075(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajv.b(").append(')').toString());
		}
	}

	Class298_Sub24_Sub4(OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}
}
