
/* Class282_Sub41_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

public class Class282_Sub41_Sub3 extends Class282_Sub41 {
	Object anObject9544;
	static final int anInt9545 = 1024;
	TheoraInfo aTheoraInfo9546;
	double aDouble9547;
	static final int anInt9548 = 2048;
	DecoderContext aDecoderContext9549;
	GranulePos aGranulePos9550;
	Frame aFrame9551;
	TheoraComment aTheoraComment9552;
	long aLong9553;
	boolean aBool9554;
	boolean aBool9555;
	int anInt9556;
	int anInt9557;
	boolean aBool9558;
	SetupInfo aSetupInfo9559 = new SetupInfo();
	boolean aBool9560;

	void method14789(int i) {
		((Class282_Sub41_Sub3) this).anInt9557 = -986815551 * i;
		if (((Class282_Sub41_Sub3) this).aBool9554) {
			if (((Class282_Sub41_Sub3) this).anInt9557 * 351513665 > ((Class282_Sub41_Sub3) this).anInt9556 * -1692639633)
				((Class282_Sub41_Sub3) this).anInt9557 = ((Class282_Sub41_Sub3) this).anInt9556 * 1272585903;
			if (351513665 * ((Class282_Sub41_Sub3) this).anInt9557 < 0)
				((Class282_Sub41_Sub3) this).anInt9557 = 0;
			((Class282_Sub41_Sub3) this).aDecoderContext9549.setPostProcessingLevel(((Class282_Sub41_Sub3) this).anInt9557 * 351513665);
		}
	}

	void method13362(OggPacket oggpacket, int i) {
		if (!((Class282_Sub41_Sub3) this).aBool9554) {
			int i_0_ = (((Class282_Sub41_Sub3) this).aSetupInfo9559.decodeHeader(((Class282_Sub41_Sub3) this).aTheoraInfo9546, ((Class282_Sub41_Sub3) this).aTheoraComment9552, oggpacket));
			if (i_0_ == 0) {
				((Class282_Sub41_Sub3) this).aBool9554 = true;
				if ((((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameWidth > 2048) || (((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameHeight) > 1024)
					throw new IllegalStateException();
				((Class282_Sub41_Sub3) this).aDecoderContext9549 = new DecoderContext((((Class282_Sub41_Sub3) this).aTheoraInfo9546), (((Class282_Sub41_Sub3) this).aSetupInfo9559));
				((Class282_Sub41_Sub3) this).aGranulePos9550 = new GranulePos();
				((Class282_Sub41_Sub3) this).aFrame9551 = new Frame((((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameWidth), (((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameHeight));
				((Class282_Sub41_Sub3) this).anInt9556 = ((Class282_Sub41_Sub3) this).aDecoderContext9549.getMaxPostProcessingLevel() * 1525465231;
				method14790(351513665 * ((Class282_Sub41_Sub3) this).anInt9557, -1590545486);
			} else if (i_0_ < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i_0_).toString());
		} else {
			((Class282_Sub41_Sub3) this).aLong9553 = Class169.method2869(1993913659) * -3822562485386198145L;
			int i_1_ = (((Class282_Sub41_Sub3) this).aDecoderContext9549.decodePacketIn(oggpacket, ((Class282_Sub41_Sub3) this).aGranulePos9550));
			if (i_1_ < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i_1_).toString());
			((Class282_Sub41_Sub3) this).aDecoderContext9549.granuleFrame(((Class282_Sub41_Sub3) this).aGranulePos9550);
			((Class282_Sub41_Sub3) this).aDouble9547 = (((Class282_Sub41_Sub3) this).aDecoderContext9549.granuleTime(((Class282_Sub41_Sub3) this).aGranulePos9550));
			if (((Class282_Sub41_Sub3) this).aBool9558) {
				boolean bool = oggpacket.isKeyFrame() == 1;
				if (bool)
					((Class282_Sub41_Sub3) this).aBool9558 = false;
				else
					return;
			}
			if (!((Class282_Sub41_Sub3) this).aBool9555 || oggpacket.isKeyFrame() == 1) {
				if (((Class282_Sub41_Sub3) this).aDecoderContext9549.decodeFrame(((Class282_Sub41_Sub3) this).aFrame9551) != 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i_1_).toString());
				((Class282_Sub41_Sub3) this).aBool9560 = true;
			}
		}
	}

	void method14790(int i, int i_2_) {
		((Class282_Sub41_Sub3) this).anInt9557 = -986815551 * i;
		if (((Class282_Sub41_Sub3) this).aBool9554) {
			if (((Class282_Sub41_Sub3) this).anInt9557 * 351513665 > ((Class282_Sub41_Sub3) this).anInt9556 * -1692639633)
				((Class282_Sub41_Sub3) this).anInt9557 = ((Class282_Sub41_Sub3) this).anInt9556 * 1272585903;
			if (351513665 * ((Class282_Sub41_Sub3) this).anInt9557 < 0)
				((Class282_Sub41_Sub3) this).anInt9557 = 0;
			((Class282_Sub41_Sub3) this).aDecoderContext9549.setPostProcessingLevel(((Class282_Sub41_Sub3) this).anInt9557 * 351513665);
		}
	}

	float method14791(int i) {
		if (!((Class282_Sub41_Sub3) this).aBool9554 || ((Class282_Sub41_Sub3) this).aTheoraInfo9546.method6698())
			return 0.0F;
		return ((float) (((Class282_Sub41_Sub3) this).aTheoraInfo9546.fpsNumerator) / (float) (((Class282_Sub41_Sub3) this).aTheoraInfo9546.fpsDenominator));
	}

	double method14792(short i) {
		return ((Class282_Sub41_Sub3) this).aDouble9547;
	}

	long method14793(int i) {
		return 4278118698289560703L * ((Class282_Sub41_Sub3) this).aLong9553;
	}

	boolean method14794(int i) {
		return ((Class282_Sub41_Sub3) this).aBool9554;
	}

	void method13360(int i) {
		if (null != ((Class282_Sub41_Sub3) this).aFrame9551)
			((Class282_Sub41_Sub3) this).aFrame9551.method6699();
		if (((Class282_Sub41_Sub3) this).aDecoderContext9549 != null) {
			((Class282_Sub41_Sub3) this).aDecoderContext9549.method6699();
			((Class282_Sub41_Sub3) this).aDecoderContext9549 = null;
		}
		if (((Class282_Sub41_Sub3) this).aGranulePos9550 != null) {
			((Class282_Sub41_Sub3) this).aGranulePos9550.method6699();
			((Class282_Sub41_Sub3) this).aGranulePos9550 = null;
		}
		((Class282_Sub41_Sub3) this).aTheoraInfo9546.method6699();
		((Class282_Sub41_Sub3) this).aTheoraComment9552.method6699();
		((Class282_Sub41_Sub3) this).aSetupInfo9559.method6699();
	}

	public Object method14795(Interface23 interface23, int i) {
		if (((Class282_Sub41_Sub3) this).aFrame9551 == null)
			return null;
		if (!((Class282_Sub41_Sub3) this).aBool9560 && ((Class282_Sub41_Sub3) this).anObject9544 != null)
			return ((Class282_Sub41_Sub3) this).anObject9544;
		((Class282_Sub41_Sub3) this).anObject9544 = (interface23.method162(((Class282_Sub41_Sub3) this).aFrame9551.pixels, 0, 416891173 * ((Class282_Sub41_Sub3) this).aFrame9551.anInt9119, 416891173 * ((Class282_Sub41_Sub3) this).aFrame9551.anInt9119, ((Class282_Sub41_Sub3) this).aFrame9551.anInt9120 * 12877029, false, 2093100819));
		((Class282_Sub41_Sub3) this).aBool9560 = false;
		return ((Class282_Sub41_Sub3) this).anObject9544;
	}

	Class282_Sub41_Sub3(OggStreamState oggstreamstate) {
		super(oggstreamstate);
		((Class282_Sub41_Sub3) this).aTheoraInfo9546 = new TheoraInfo();
		((Class282_Sub41_Sub3) this).aTheoraComment9552 = new TheoraComment();
	}

	void method13366(OggPacket oggpacket) {
		if (!((Class282_Sub41_Sub3) this).aBool9554) {
			int i = (((Class282_Sub41_Sub3) this).aSetupInfo9559.decodeHeader(((Class282_Sub41_Sub3) this).aTheoraInfo9546, ((Class282_Sub41_Sub3) this).aTheoraComment9552, oggpacket));
			if (i == 0) {
				((Class282_Sub41_Sub3) this).aBool9554 = true;
				if ((((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameWidth > 2048) || (((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameHeight) > 1024)
					throw new IllegalStateException();
				((Class282_Sub41_Sub3) this).aDecoderContext9549 = new DecoderContext((((Class282_Sub41_Sub3) this).aTheoraInfo9546), (((Class282_Sub41_Sub3) this).aSetupInfo9559));
				((Class282_Sub41_Sub3) this).aGranulePos9550 = new GranulePos();
				((Class282_Sub41_Sub3) this).aFrame9551 = new Frame((((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameWidth), (((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameHeight));
				((Class282_Sub41_Sub3) this).anInt9556 = ((Class282_Sub41_Sub3) this).aDecoderContext9549.getMaxPostProcessingLevel() * 1525465231;
				method14790(351513665 * ((Class282_Sub41_Sub3) this).anInt9557, -1590545486);
			} else if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
		} else {
			((Class282_Sub41_Sub3) this).aLong9553 = Class169.method2869(2102729991) * -3822562485386198145L;
			int i = (((Class282_Sub41_Sub3) this).aDecoderContext9549.decodePacketIn(oggpacket, ((Class282_Sub41_Sub3) this).aGranulePos9550));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			((Class282_Sub41_Sub3) this).aDecoderContext9549.granuleFrame(((Class282_Sub41_Sub3) this).aGranulePos9550);
			((Class282_Sub41_Sub3) this).aDouble9547 = (((Class282_Sub41_Sub3) this).aDecoderContext9549.granuleTime(((Class282_Sub41_Sub3) this).aGranulePos9550));
			if (((Class282_Sub41_Sub3) this).aBool9558) {
				boolean bool = oggpacket.isKeyFrame() == 1;
				if (bool)
					((Class282_Sub41_Sub3) this).aBool9558 = false;
				else
					return;
			}
			if (!((Class282_Sub41_Sub3) this).aBool9555 || oggpacket.isKeyFrame() == 1) {
				if (((Class282_Sub41_Sub3) this).aDecoderContext9549.decodeFrame(((Class282_Sub41_Sub3) this).aFrame9551) != 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
				((Class282_Sub41_Sub3) this).aBool9560 = true;
			}
		}
	}

	void method13363(OggPacket oggpacket) {
		if (!((Class282_Sub41_Sub3) this).aBool9554) {
			int i = (((Class282_Sub41_Sub3) this).aSetupInfo9559.decodeHeader(((Class282_Sub41_Sub3) this).aTheoraInfo9546, ((Class282_Sub41_Sub3) this).aTheoraComment9552, oggpacket));
			if (i == 0) {
				((Class282_Sub41_Sub3) this).aBool9554 = true;
				if ((((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameWidth > 2048) || (((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameHeight) > 1024)
					throw new IllegalStateException();
				((Class282_Sub41_Sub3) this).aDecoderContext9549 = new DecoderContext((((Class282_Sub41_Sub3) this).aTheoraInfo9546), (((Class282_Sub41_Sub3) this).aSetupInfo9559));
				((Class282_Sub41_Sub3) this).aGranulePos9550 = new GranulePos();
				((Class282_Sub41_Sub3) this).aFrame9551 = new Frame((((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameWidth), (((Class282_Sub41_Sub3) this).aTheoraInfo9546.frameHeight));
				((Class282_Sub41_Sub3) this).anInt9556 = ((Class282_Sub41_Sub3) this).aDecoderContext9549.getMaxPostProcessingLevel() * 1525465231;
				method14790(351513665 * ((Class282_Sub41_Sub3) this).anInt9557, -1590545486);
			} else if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
		} else {
			((Class282_Sub41_Sub3) this).aLong9553 = Class169.method2869(1699656208) * -3822562485386198145L;
			int i = (((Class282_Sub41_Sub3) this).aDecoderContext9549.decodePacketIn(oggpacket, ((Class282_Sub41_Sub3) this).aGranulePos9550));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			((Class282_Sub41_Sub3) this).aDecoderContext9549.granuleFrame(((Class282_Sub41_Sub3) this).aGranulePos9550);
			((Class282_Sub41_Sub3) this).aDouble9547 = (((Class282_Sub41_Sub3) this).aDecoderContext9549.granuleTime(((Class282_Sub41_Sub3) this).aGranulePos9550));
			if (((Class282_Sub41_Sub3) this).aBool9558) {
				boolean bool = oggpacket.isKeyFrame() == 1;
				if (bool)
					((Class282_Sub41_Sub3) this).aBool9558 = false;
				else
					return;
			}
			if (!((Class282_Sub41_Sub3) this).aBool9555 || oggpacket.isKeyFrame() == 1) {
				if (((Class282_Sub41_Sub3) this).aDecoderContext9549.decodeFrame(((Class282_Sub41_Sub3) this).aFrame9551) != 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
				((Class282_Sub41_Sub3) this).aBool9560 = true;
			}
		}
	}

	void method13364() {
		if (null != ((Class282_Sub41_Sub3) this).aFrame9551)
			((Class282_Sub41_Sub3) this).aFrame9551.method6699();
		if (((Class282_Sub41_Sub3) this).aDecoderContext9549 != null) {
			((Class282_Sub41_Sub3) this).aDecoderContext9549.method6699();
			((Class282_Sub41_Sub3) this).aDecoderContext9549 = null;
		}
		if (((Class282_Sub41_Sub3) this).aGranulePos9550 != null) {
			((Class282_Sub41_Sub3) this).aGranulePos9550.method6699();
			((Class282_Sub41_Sub3) this).aGranulePos9550 = null;
		}
		((Class282_Sub41_Sub3) this).aTheoraInfo9546.method6699();
		((Class282_Sub41_Sub3) this).aTheoraComment9552.method6699();
		((Class282_Sub41_Sub3) this).aSetupInfo9559.method6699();
	}

	void method14796(int i) {
		((Class282_Sub41_Sub3) this).anInt9557 = -986815551 * i;
		if (((Class282_Sub41_Sub3) this).aBool9554) {
			if (((Class282_Sub41_Sub3) this).anInt9557 * 351513665 > ((Class282_Sub41_Sub3) this).anInt9556 * -1692639633)
				((Class282_Sub41_Sub3) this).anInt9557 = ((Class282_Sub41_Sub3) this).anInt9556 * 1272585903;
			if (351513665 * ((Class282_Sub41_Sub3) this).anInt9557 < 0)
				((Class282_Sub41_Sub3) this).anInt9557 = 0;
			((Class282_Sub41_Sub3) this).aDecoderContext9549.setPostProcessingLevel(((Class282_Sub41_Sub3) this).anInt9557 * 351513665);
		}
	}

	long method14797() {
		return 4278118698289560703L * ((Class282_Sub41_Sub3) this).aLong9553;
	}

	float method14798() {
		if (!((Class282_Sub41_Sub3) this).aBool9554 || ((Class282_Sub41_Sub3) this).aTheoraInfo9546.method6698())
			return 0.0F;
		return ((float) (((Class282_Sub41_Sub3) this).aTheoraInfo9546.fpsNumerator) / (float) (((Class282_Sub41_Sub3) this).aTheoraInfo9546.fpsDenominator));
	}

	long method14799() {
		return 4278118698289560703L * ((Class282_Sub41_Sub3) this).aLong9553;
	}

	float method14800() {
		if (!((Class282_Sub41_Sub3) this).aBool9554 || ((Class282_Sub41_Sub3) this).aTheoraInfo9546.method6698())
			return 0.0F;
		return ((float) (((Class282_Sub41_Sub3) this).aTheoraInfo9546.fpsNumerator) / (float) (((Class282_Sub41_Sub3) this).aTheoraInfo9546.fpsDenominator));
	}

	double method14801() {
		return ((Class282_Sub41_Sub3) this).aDouble9547;
	}

	double method14802() {
		return ((Class282_Sub41_Sub3) this).aDouble9547;
	}

	void method13365() {
		if (null != ((Class282_Sub41_Sub3) this).aFrame9551)
			((Class282_Sub41_Sub3) this).aFrame9551.method6699();
		if (((Class282_Sub41_Sub3) this).aDecoderContext9549 != null) {
			((Class282_Sub41_Sub3) this).aDecoderContext9549.method6699();
			((Class282_Sub41_Sub3) this).aDecoderContext9549 = null;
		}
		if (((Class282_Sub41_Sub3) this).aGranulePos9550 != null) {
			((Class282_Sub41_Sub3) this).aGranulePos9550.method6699();
			((Class282_Sub41_Sub3) this).aGranulePos9550 = null;
		}
		((Class282_Sub41_Sub3) this).aTheoraInfo9546.method6699();
		((Class282_Sub41_Sub3) this).aTheoraComment9552.method6699();
		((Class282_Sub41_Sub3) this).aSetupInfo9559.method6699();
	}

	boolean method14803() {
		return ((Class282_Sub41_Sub3) this).aBool9554;
	}

	float method14804() {
		if (!((Class282_Sub41_Sub3) this).aBool9554 || ((Class282_Sub41_Sub3) this).aTheoraInfo9546.method6698())
			return 0.0F;
		return ((float) (((Class282_Sub41_Sub3) this).aTheoraInfo9546.fpsNumerator) / (float) (((Class282_Sub41_Sub3) this).aTheoraInfo9546.fpsDenominator));
	}

	boolean method14805() {
		return ((Class282_Sub41_Sub3) this).aBool9554;
	}

	boolean method14806() {
		return ((Class282_Sub41_Sub3) this).aBool9554;
	}

	public static void method14807(int i, int i_3_) {
		Class268.anInt3307 = i * 2078474485;
		Class282_Sub53_Sub1.aClass282_Sub53_Sub1Array9497 = new Class282_Sub53_Sub1[i];
		Class81.anInt803 = 0;
	}
}
