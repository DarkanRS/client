import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

public class Class282_Sub41_Sub3 extends Class282_Sub41 {

	boolean aBool9555;
	long aLong9553;
	boolean aBool9554;
	double aDouble9547;
	DecoderContext aDecoderContext9549;
	GranulePos aGranulePos9550;
	Frame aFrame9551;
	int anInt9556;
	boolean aBool9560;
	boolean aBool9558;
	int anInt9557;
	Object anObject9544;
	SetupInfo aSetupInfo9559 = new SetupInfo();
	TheoraInfo aTheoraInfo9546 = new TheoraInfo();
	TheoraComment aTheoraComment9552 = new TheoraComment();

	void method13362(OggPacket oggpacket_1) {
		int i_3;
		if (!this.aBool9554) {
			i_3 = this.aSetupInfo9559.decodeHeader(this.aTheoraInfo9546, this.aTheoraComment9552, oggpacket_1);
			if (i_3 == 0) {
				this.aBool9554 = true;
				if (this.aTheoraInfo9546.frameWidth > 2048 || this.aTheoraInfo9546.frameHeight > 1024) {
					throw new IllegalStateException();
				}

				this.aDecoderContext9549 = new DecoderContext(this.aTheoraInfo9546, this.aSetupInfo9559);
				this.aGranulePos9550 = new GranulePos();
				this.aFrame9551 = new Frame(this.aTheoraInfo9546.frameWidth, this.aTheoraInfo9546.frameHeight);
				this.anInt9556 = this.aDecoderContext9549.getMaxPostProcessingLevel();
				this.method14790(this.anInt9557);
			} else if (i_3 < 0) {
				throw new IllegalStateException("" + i_3);
			}
		} else {
			this.aLong9553 = Class169.time();
			i_3 = this.aDecoderContext9549.decodePacketIn(oggpacket_1, this.aGranulePos9550);
			if (i_3 < 0) {
				throw new IllegalStateException("" + i_3);
			}

			this.aDecoderContext9549.granuleFrame(this.aGranulePos9550);
			this.aDouble9547 = this.aDecoderContext9549.granuleTime(this.aGranulePos9550);
			if (this.aBool9558) {
				boolean bool_4 = oggpacket_1.isKeyFrame() == 1;
				if (!bool_4) {
					return;
				}

				this.aBool9558 = false;
			}

			if (!this.aBool9555 || oggpacket_1.isKeyFrame() == 1) {
				if (this.aDecoderContext9549.decodeFrame(this.aFrame9551) != 0) {
					throw new IllegalStateException("" + i_3);
				}

				this.aBool9560 = true;
			}
		}

	}

	void method14790(int i_1) {
		this.anInt9557 = i_1;
		if (this.aBool9554) {
			if (this.anInt9557 > this.anInt9556) {
				this.anInt9557 = this.anInt9556;
			}

			if (this.anInt9557 < 0) {
				this.anInt9557 = 0;
			}

			this.aDecoderContext9549.setPostProcessingLevel(this.anInt9557);
		}

	}

	float method14791() {
		return this.aBool9554 && !this.aTheoraInfo9546.method6698() ? (float) this.aTheoraInfo9546.fpsNumerator / (float) this.aTheoraInfo9546.fpsDenominator : 0.0F;
	}

	double method14792() {
		return this.aDouble9547;
	}

	long method14793() {
		return this.aLong9553;
	}

	boolean method14794() {
		return this.aBool9554;
	}

	void method13360() {
		if (this.aFrame9551 != null) {
			this.aFrame9551.method6699();
		}

		if (this.aDecoderContext9549 != null) {
			this.aDecoderContext9549.method6699();
			this.aDecoderContext9549 = null;
		}

		if (this.aGranulePos9550 != null) {
			this.aGranulePos9550.method6699();
			this.aGranulePos9550 = null;
		}

		this.aTheoraInfo9546.method6699();
		this.aTheoraComment9552.method6699();
		this.aSetupInfo9559.method6699();
	}

	public Object method14795(Interface23 interface23_1) {
		if (this.aFrame9551 == null) {
			return null;
		} else if (!this.aBool9560 && this.anObject9544 != null) {
			return this.anObject9544;
		} else {
			this.anObject9544 = interface23_1.method162(this.aFrame9551.pixels, this.aFrame9551.anInt9119, this.aFrame9551.anInt9119, this.aFrame9551.anInt9120);
			this.aBool9560 = false;
			return this.anObject9544;
		}
	}

	Class282_Sub41_Sub3(OggStreamState oggstreamstate_1) {
		super(oggstreamstate_1);
	}

	void method13366(OggPacket oggpacket_1) {
		int i_2;
		if (!this.aBool9554) {
			i_2 = this.aSetupInfo9559.decodeHeader(this.aTheoraInfo9546, this.aTheoraComment9552, oggpacket_1);
			if (i_2 == 0) {
				this.aBool9554 = true;
				if (this.aTheoraInfo9546.frameWidth > 2048 || this.aTheoraInfo9546.frameHeight > 1024) {
					throw new IllegalStateException();
				}

				this.aDecoderContext9549 = new DecoderContext(this.aTheoraInfo9546, this.aSetupInfo9559);
				this.aGranulePos9550 = new GranulePos();
				this.aFrame9551 = new Frame(this.aTheoraInfo9546.frameWidth, this.aTheoraInfo9546.frameHeight);
				this.anInt9556 = this.aDecoderContext9549.getMaxPostProcessingLevel() * 1525465231 * -1692639633;
				this.method14790(351513665 * this.anInt9557 * -986815551);
			} else if (i_2 < 0) {
				throw new IllegalStateException("" + i_2);
			}
		} else {
			this.aLong9553 = Class169.time() * -3822562485386198145L * 4278118698289560703L;
			i_2 = this.aDecoderContext9549.decodePacketIn(oggpacket_1, this.aGranulePos9550);
			if (i_2 < 0) {
				throw new IllegalStateException("" + i_2);
			}

			this.aDecoderContext9549.granuleFrame(this.aGranulePos9550);
			this.aDouble9547 = this.aDecoderContext9549.granuleTime(this.aGranulePos9550);
			if (this.aBool9558) {
				boolean bool_3 = oggpacket_1.isKeyFrame() == 1;
				if (!bool_3) {
					return;
				}

				this.aBool9558 = false;
			}

			if (!this.aBool9555 || oggpacket_1.isKeyFrame() == 1) {
				if (this.aDecoderContext9549.decodeFrame(this.aFrame9551) != 0) {
					throw new IllegalStateException("" + i_2);
				}

				this.aBool9560 = true;
			}
		}

	}

	void method13363(OggPacket oggpacket_1) {
		int i_2;
		if (!this.aBool9554) {
			i_2 = this.aSetupInfo9559.decodeHeader(this.aTheoraInfo9546, this.aTheoraComment9552, oggpacket_1);
			if (i_2 == 0) {
				this.aBool9554 = true;
				if (this.aTheoraInfo9546.frameWidth > 2048 || this.aTheoraInfo9546.frameHeight > 1024) {
					throw new IllegalStateException();
				}

				this.aDecoderContext9549 = new DecoderContext(this.aTheoraInfo9546, this.aSetupInfo9559);
				this.aGranulePos9550 = new GranulePos();
				this.aFrame9551 = new Frame(this.aTheoraInfo9546.frameWidth, this.aTheoraInfo9546.frameHeight);
				this.anInt9556 = this.aDecoderContext9549.getMaxPostProcessingLevel() * 1525465231 * -1692639633;
				this.method14790(351513665 * this.anInt9557 * -986815551);
			} else if (i_2 < 0) {
				throw new IllegalStateException("" + i_2);
			}
		} else {
			this.aLong9553 = Class169.time() * -3822562485386198145L * 4278118698289560703L;
			i_2 = this.aDecoderContext9549.decodePacketIn(oggpacket_1, this.aGranulePos9550);
			if (i_2 < 0) {
				throw new IllegalStateException("" + i_2);
			}

			this.aDecoderContext9549.granuleFrame(this.aGranulePos9550);
			this.aDouble9547 = this.aDecoderContext9549.granuleTime(this.aGranulePos9550);
			if (this.aBool9558) {
				boolean bool_3 = oggpacket_1.isKeyFrame() == 1;
				if (!bool_3) {
					return;
				}

				this.aBool9558 = false;
			}

			if (!this.aBool9555 || oggpacket_1.isKeyFrame() == 1) {
				if (this.aDecoderContext9549.decodeFrame(this.aFrame9551) != 0) {
					throw new IllegalStateException("" + i_2);
				}

				this.aBool9560 = true;
			}
		}

	}

	void method13364() {
		if (this.aFrame9551 != null) {
			this.aFrame9551.method6699();
		}

		if (this.aDecoderContext9549 != null) {
			this.aDecoderContext9549.method6699();
			this.aDecoderContext9549 = null;
		}

		if (this.aGranulePos9550 != null) {
			this.aGranulePos9550.method6699();
			this.aGranulePos9550 = null;
		}

		this.aTheoraInfo9546.method6699();
		this.aTheoraComment9552.method6699();
		this.aSetupInfo9559.method6699();
	}

	void method13365() {
		if (this.aFrame9551 != null) {
			this.aFrame9551.method6699();
		}

		if (this.aDecoderContext9549 != null) {
			this.aDecoderContext9549.method6699();
			this.aDecoderContext9549 = null;
		}

		if (this.aGranulePos9550 != null) {
			this.aGranulePos9550.method6699();
			this.aGranulePos9550 = null;
		}

		this.aTheoraInfo9546.method6699();
		this.aTheoraComment9552.method6699();
		this.aSetupInfo9559.method6699();
	}

	public static void method14807(int i_1) {
		Class268.anInt3307 = 100;
		Class282_Sub53_Sub1.aClass282_Sub53_Sub1Array9497 = new Class282_Sub53_Sub1[100];
		Class81.anInt803 = 0;
	}

}
