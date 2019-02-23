import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

public class Class282_Sub41_Sub4 extends Class282_Sub41 {

	VorbisInfo aVorbisInfo9605 = new VorbisInfo();
	VorbisComment aVorbisComment9599 = new VorbisComment();
	double aDouble9604;
	int anInt9602;
	DSPState aDSPState9600;
	VorbisBlock aVorbisBlock9601;
	Class344 aClass344_9598;
	Class282_Sub15_Sub1 aClass282_Sub15_Sub1_9603;

	Class282_Sub41_Sub4(OggStreamState oggstreamstate_1) {
		super(oggstreamstate_1);
	}

	void method13362(OggPacket oggpacket_1, int i_2) {
		if (this.anInt8031 < 3) {
			int i_3 = this.aVorbisInfo9605.headerIn(this.aVorbisComment9599, oggpacket_1);
			if (i_3 < 0) {
				throw new IllegalStateException("" + i_3);
			}

			if (this.anInt8031 == 2) {
				if (this.aVorbisInfo9605.channels > 2 || this.aVorbisInfo9605.channels < 1) {
					throw new RuntimeException("" + this.aVorbisInfo9605.channels);
				}

				this.aDSPState9600 = new DSPState(this.aVorbisInfo9605);
				this.aVorbisBlock9601 = new VorbisBlock(this.aDSPState9600);
				this.aClass344_9598 = new Class344(this.aVorbisInfo9605.rate, Class253.anInt3129);
				this.aClass282_Sub15_Sub1_9603 = new Class282_Sub15_Sub1(this.aVorbisInfo9605.channels);
			}
		} else {
			if (this.aVorbisBlock9601.synthesis(oggpacket_1) == 0) {
				this.aDSPState9600.blockIn(this.aVorbisBlock9601);
			}

			float[][] floats_6 = this.aDSPState9600.pcmOut(this.aVorbisInfo9605.channels);
			this.aDouble9604 = this.aDSPState9600.granuleTime();
			if (this.aDouble9604 == -1.0D) {
				this.aDouble9604 = (double) ((float) this.anInt9602 / (float) this.aVorbisInfo9605.rate);
			}

			this.aDSPState9600.read(floats_6[0].length);
			this.anInt9602 += floats_6[0].length;
			Class282_Sub39 class282_sub39_4 = this.aClass282_Sub15_Sub1_9603.method14814(floats_6[0].length, this.aDouble9604);
			Class468_Sub20.method12805(floats_6, class282_sub39_4.aShortArrayArray8003, -289864587);

			for (int i_5 = 0; i_5 < this.aVorbisInfo9605.channels; i_5++) {
				class282_sub39_4.aShortArrayArray8003[i_5] = this.aClass344_9598.method6111(class282_sub39_4.aShortArrayArray8003[i_5], -640368423);
			}

			this.aClass282_Sub15_Sub1_9603.method14815(class282_sub39_4, 2051042203);
		}

	}

	public Class282_Sub15_Sub1 method14845(int i_1) {
		return this.aClass282_Sub15_Sub1_9603;
	}

	void method13364() {
		if (this.aVorbisBlock9601 != null) {
			this.aVorbisBlock9601.method6699();
		}

		if (this.aDSPState9600 != null) {
			this.aDSPState9600.method6699();
		}

		this.aVorbisComment9599.method6699();
		this.aVorbisInfo9605.method6699();
		if (this.aClass282_Sub15_Sub1_9603 != null) {
			this.aClass282_Sub15_Sub1_9603.method14808((byte) -65);
		}

	}

	int method14847(int i_1) {
		return this.aClass282_Sub15_Sub1_9603 == null ? 0 : this.aClass282_Sub15_Sub1_9603.method14811(-138243867);
	}

	void method13363(OggPacket oggpacket_1) {
		if (this.anInt8031 * 1669091145 * -509226247 < 3) {
			int i_2 = this.aVorbisInfo9605.headerIn(this.aVorbisComment9599, oggpacket_1);
			if (i_2 < 0) {
				throw new IllegalStateException("" + i_2);
			}

			if (-509226247 * this.anInt8031 * 1669091145 == 2) {
				if (this.aVorbisInfo9605.channels > 2 || this.aVorbisInfo9605.channels < 1) {
					throw new RuntimeException("" + this.aVorbisInfo9605.channels);
				}

				this.aDSPState9600 = new DSPState(this.aVorbisInfo9605);
				this.aVorbisBlock9601 = new VorbisBlock(this.aDSPState9600);
				this.aClass344_9598 = new Class344(this.aVorbisInfo9605.rate, Class253.anInt3129);
				this.aClass282_Sub15_Sub1_9603 = new Class282_Sub15_Sub1(this.aVorbisInfo9605.channels);
			}
		} else {
			if (this.aVorbisBlock9601.synthesis(oggpacket_1) == 0) {
				this.aDSPState9600.blockIn(this.aVorbisBlock9601);
			}

			float[][] floats_5 = this.aDSPState9600.pcmOut(this.aVorbisInfo9605.channels);
			this.aDouble9604 = this.aDSPState9600.granuleTime();
			if (this.aDouble9604 == -1.0D) {
				this.aDouble9604 = (double) ((float) (this.anInt9602 * -1560334429 * 1938979851) / (float) this.aVorbisInfo9605.rate);
			}

			this.aDSPState9600.read(floats_5[0].length);
			this.anInt9602 = (this.anInt9602 * -1560334429 + -1560334429 * floats_5[0].length) * 1938979851;
			Class282_Sub39 class282_sub39_3 = this.aClass282_Sub15_Sub1_9603.method14814(floats_5[0].length, this.aDouble9604);
			Class468_Sub20.method12805(floats_5, class282_sub39_3.aShortArrayArray8003, -289864587);

			for (int i_4 = 0; i_4 < this.aVorbisInfo9605.channels; i_4++) {
				class282_sub39_3.aShortArrayArray8003[i_4] = this.aClass344_9598.method6111(class282_sub39_3.aShortArrayArray8003[i_4], -640368423);
			}

			this.aClass282_Sub15_Sub1_9603.method14815(class282_sub39_3, -881464025);
		}

	}

	void method13366(OggPacket oggpacket_1) {
		if (this.anInt8031 * 1669091145 * -509226247 < 3) {
			int i_2 = this.aVorbisInfo9605.headerIn(this.aVorbisComment9599, oggpacket_1);
			if (i_2 < 0) {
				throw new IllegalStateException("" + i_2);
			}

			if (-509226247 * this.anInt8031 * 1669091145 == 2) {
				if (this.aVorbisInfo9605.channels > 2 || this.aVorbisInfo9605.channels < 1) {
					throw new RuntimeException("" + this.aVorbisInfo9605.channels);
				}

				this.aDSPState9600 = new DSPState(this.aVorbisInfo9605);
				this.aVorbisBlock9601 = new VorbisBlock(this.aDSPState9600);
				this.aClass344_9598 = new Class344(this.aVorbisInfo9605.rate, Class253.anInt3129);
				this.aClass282_Sub15_Sub1_9603 = new Class282_Sub15_Sub1(this.aVorbisInfo9605.channels);
			}
		} else {
			if (this.aVorbisBlock9601.synthesis(oggpacket_1) == 0) {
				this.aDSPState9600.blockIn(this.aVorbisBlock9601);
			}

			float[][] floats_5 = this.aDSPState9600.pcmOut(this.aVorbisInfo9605.channels);
			this.aDouble9604 = this.aDSPState9600.granuleTime();
			if (this.aDouble9604 == -1.0D) {
				this.aDouble9604 = (double) ((float) (this.anInt9602 * -1560334429 * 1938979851) / (float) this.aVorbisInfo9605.rate);
			}

			this.aDSPState9600.read(floats_5[0].length);
			this.anInt9602 = (this.anInt9602 * -1560334429 + -1560334429 * floats_5[0].length) * 1938979851;
			Class282_Sub39 class282_sub39_3 = this.aClass282_Sub15_Sub1_9603.method14814(floats_5[0].length, this.aDouble9604);
			Class468_Sub20.method12805(floats_5, class282_sub39_3.aShortArrayArray8003, -289864587);

			for (int i_4 = 0; i_4 < this.aVorbisInfo9605.channels; i_4++) {
				class282_sub39_3.aShortArrayArray8003[i_4] = this.aClass344_9598.method6111(class282_sub39_3.aShortArrayArray8003[i_4], -640368423);
			}

			this.aClass282_Sub15_Sub1_9603.method14815(class282_sub39_3, -1788254103);
		}

	}

	void method13365() {
		if (this.aVorbisBlock9601 != null) {
			this.aVorbisBlock9601.method6699();
		}

		if (this.aDSPState9600 != null) {
			this.aDSPState9600.method6699();
		}

		this.aVorbisComment9599.method6699();
		this.aVorbisInfo9605.method6699();
		if (this.aClass282_Sub15_Sub1_9603 != null) {
			this.aClass282_Sub15_Sub1_9603.method14808((byte) -71);
		}

	}

	double method14848(int i_1) {
		double d_2 = this.aDouble9604;
		if (this.aClass282_Sub15_Sub1_9603 != null) {
			d_2 = this.aClass282_Sub15_Sub1_9603.method14819(-907246201);
			if (d_2 < 0.0D) {
				d_2 = this.aDouble9604;
			}
		}

		return d_2 - (double) (256.0F / (float) Class253.anInt3129);
	}

	void method13360(int i_1) {
		if (this.aVorbisBlock9601 != null) {
			this.aVorbisBlock9601.method6699();
		}

		if (this.aDSPState9600 != null) {
			this.aDSPState9600.method6699();
		}

		this.aVorbisComment9599.method6699();
		this.aVorbisInfo9605.method6699();
		if (this.aClass282_Sub15_Sub1_9603 != null) {
			this.aClass282_Sub15_Sub1_9603.method14808((byte) -52);
		}

	}

	static final void method14857(CS2Executor cs2executor_0, int i_1) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub28_8212, cs2executor_0.intStack[--cs2executor_0.intStackPtr] == 1 ? 1 : 0, 1214573976);
		Class190.method3148((byte) 106);
		client.aBool7175 = false;
	}

}
