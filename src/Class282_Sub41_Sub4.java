
/* Class282_Sub41_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

public class Class282_Sub41_Sub4 extends Class282_Sub41 {
	Class344 aClass344_9598;
	VorbisComment aVorbisComment9599;
	DSPState aDSPState9600;
	VorbisBlock aVorbisBlock9601;
	int anInt9602;
	Class282_Sub15_Sub1 aClass282_Sub15_Sub1_9603;
	double aDouble9604;
	VorbisInfo aVorbisInfo9605 = new VorbisInfo();

	Class282_Sub41_Sub4(OggStreamState oggstreamstate) {
		super(oggstreamstate);
		((Class282_Sub41_Sub4) this).aVorbisComment9599 = new VorbisComment();
	}

	void method13362(OggPacket oggpacket, int i) {
		if (((Class282_Sub41_Sub4) this).anInt8031 * -509226247 < 3) {
			int i_0_ = (((Class282_Sub41_Sub4) this).aVorbisInfo9605.headerIn(((Class282_Sub41_Sub4) this).aVorbisComment9599, oggpacket));
			if (i_0_ < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i_0_).toString());
			if (2 == -509226247 * ((Class282_Sub41_Sub4) this).anInt8031) {
				if (((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels > 2 || (((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels < 1))
					throw new RuntimeException(new StringBuilder().append("").append(((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels).toString());
				((Class282_Sub41_Sub4) this).aDSPState9600 = new DSPState(((Class282_Sub41_Sub4) this).aVorbisInfo9605);
				((Class282_Sub41_Sub4) this).aVorbisBlock9601 = new VorbisBlock(((Class282_Sub41_Sub4) this).aDSPState9600);
				((Class282_Sub41_Sub4) this).aClass344_9598 = new Class344((((Class282_Sub41_Sub4) this).aVorbisInfo9605.rate), Class253.anInt3129);
				((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603 = new Class282_Sub15_Sub1(((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels);
			}
		} else {
			if (((Class282_Sub41_Sub4) this).aVorbisBlock9601.synthesis(oggpacket) == 0)
				((Class282_Sub41_Sub4) this).aDSPState9600.blockIn(((Class282_Sub41_Sub4) this).aVorbisBlock9601);
			float[][] fs = (((Class282_Sub41_Sub4) this).aDSPState9600.pcmOut(((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels));
			((Class282_Sub41_Sub4) this).aDouble9604 = ((Class282_Sub41_Sub4) this).aDSPState9600.granuleTime();
			if (((Class282_Sub41_Sub4) this).aDouble9604 == -1.0)
				((Class282_Sub41_Sub4) this).aDouble9604 = (double) ((float) (((Class282_Sub41_Sub4) this).anInt9602 * 1938979851) / (float) (((Class282_Sub41_Sub4) this).aVorbisInfo9605.rate));
			((Class282_Sub41_Sub4) this).aDSPState9600.read(fs[0].length);
			((Class282_Sub41_Sub4) this).anInt9602 += -1560334429 * fs[0].length;
			Class282_Sub39 class282_sub39 = (((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14814(fs[0].length, ((Class282_Sub41_Sub4) this).aDouble9604));
			Class468_Sub20.method12805(fs, (((Class282_Sub39) class282_sub39).aShortArrayArray8003), -289864587);
			for (int i_1_ = 0; i_1_ < ((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels; i_1_++)
				((Class282_Sub39) class282_sub39).aShortArrayArray8003[i_1_] = (((Class282_Sub41_Sub4) this).aClass344_9598.method6111((((Class282_Sub39) class282_sub39).aShortArrayArray8003[i_1_]), -640368423));
			((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14815(class282_sub39, 2051042203);
		}
	}

	public Class282_Sub15_Sub1 method14845(int i) {
		return ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603;
	}

	double method14846() {
		double d = ((Class282_Sub41_Sub4) this).aDouble9604;
		if (null != ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603) {
			d = ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14819(1640152030);
			if (d < 0.0)
				d = ((Class282_Sub41_Sub4) this).aDouble9604;
		}
		return d - (double) (256.0F / (float) Class253.anInt3129);
	}

	void method13364() {
		if (((Class282_Sub41_Sub4) this).aVorbisBlock9601 != null)
			((Class282_Sub41_Sub4) this).aVorbisBlock9601.method6699();
		if (null != ((Class282_Sub41_Sub4) this).aDSPState9600)
			((Class282_Sub41_Sub4) this).aDSPState9600.method6699();
		((Class282_Sub41_Sub4) this).aVorbisComment9599.method6699();
		((Class282_Sub41_Sub4) this).aVorbisInfo9605.method6699();
		if (((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603 != null)
			((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14808((byte) -65);
	}

	int method14847(int i) {
		return (null == ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603 ? 0 : ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14811(-138243867));
	}

	void method13363(OggPacket oggpacket) {
		if (((Class282_Sub41_Sub4) this).anInt8031 * -509226247 < 3) {
			int i = (((Class282_Sub41_Sub4) this).aVorbisInfo9605.headerIn(((Class282_Sub41_Sub4) this).aVorbisComment9599, oggpacket));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			if (2 == -509226247 * ((Class282_Sub41_Sub4) this).anInt8031) {
				if (((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels > 2 || (((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels < 1))
					throw new RuntimeException(new StringBuilder().append("").append(((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels).toString());
				((Class282_Sub41_Sub4) this).aDSPState9600 = new DSPState(((Class282_Sub41_Sub4) this).aVorbisInfo9605);
				((Class282_Sub41_Sub4) this).aVorbisBlock9601 = new VorbisBlock(((Class282_Sub41_Sub4) this).aDSPState9600);
				((Class282_Sub41_Sub4) this).aClass344_9598 = new Class344((((Class282_Sub41_Sub4) this).aVorbisInfo9605.rate), Class253.anInt3129);
				((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603 = new Class282_Sub15_Sub1(((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels);
			}
		} else {
			if (((Class282_Sub41_Sub4) this).aVorbisBlock9601.synthesis(oggpacket) == 0)
				((Class282_Sub41_Sub4) this).aDSPState9600.blockIn(((Class282_Sub41_Sub4) this).aVorbisBlock9601);
			float[][] fs = (((Class282_Sub41_Sub4) this).aDSPState9600.pcmOut(((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels));
			((Class282_Sub41_Sub4) this).aDouble9604 = ((Class282_Sub41_Sub4) this).aDSPState9600.granuleTime();
			if (((Class282_Sub41_Sub4) this).aDouble9604 == -1.0)
				((Class282_Sub41_Sub4) this).aDouble9604 = (double) ((float) (((Class282_Sub41_Sub4) this).anInt9602 * 1938979851) / (float) (((Class282_Sub41_Sub4) this).aVorbisInfo9605.rate));
			((Class282_Sub41_Sub4) this).aDSPState9600.read(fs[0].length);
			((Class282_Sub41_Sub4) this).anInt9602 += -1560334429 * fs[0].length;
			Class282_Sub39 class282_sub39 = (((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14814(fs[0].length, ((Class282_Sub41_Sub4) this).aDouble9604));
			Class468_Sub20.method12805(fs, (((Class282_Sub39) class282_sub39).aShortArrayArray8003), -289864587);
			for (int i = 0; i < ((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels; i++)
				((Class282_Sub39) class282_sub39).aShortArrayArray8003[i] = (((Class282_Sub41_Sub4) this).aClass344_9598.method6111((((Class282_Sub39) class282_sub39).aShortArrayArray8003[i]), -640368423));
			((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14815(class282_sub39, -881464025);
		}
	}

	void method13366(OggPacket oggpacket) {
		if (((Class282_Sub41_Sub4) this).anInt8031 * -509226247 < 3) {
			int i = (((Class282_Sub41_Sub4) this).aVorbisInfo9605.headerIn(((Class282_Sub41_Sub4) this).aVorbisComment9599, oggpacket));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			if (2 == -509226247 * ((Class282_Sub41_Sub4) this).anInt8031) {
				if (((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels > 2 || (((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels < 1))
					throw new RuntimeException(new StringBuilder().append("").append(((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels).toString());
				((Class282_Sub41_Sub4) this).aDSPState9600 = new DSPState(((Class282_Sub41_Sub4) this).aVorbisInfo9605);
				((Class282_Sub41_Sub4) this).aVorbisBlock9601 = new VorbisBlock(((Class282_Sub41_Sub4) this).aDSPState9600);
				((Class282_Sub41_Sub4) this).aClass344_9598 = new Class344((((Class282_Sub41_Sub4) this).aVorbisInfo9605.rate), Class253.anInt3129);
				((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603 = new Class282_Sub15_Sub1(((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels);
			}
		} else {
			if (((Class282_Sub41_Sub4) this).aVorbisBlock9601.synthesis(oggpacket) == 0)
				((Class282_Sub41_Sub4) this).aDSPState9600.blockIn(((Class282_Sub41_Sub4) this).aVorbisBlock9601);
			float[][] fs = (((Class282_Sub41_Sub4) this).aDSPState9600.pcmOut(((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels));
			((Class282_Sub41_Sub4) this).aDouble9604 = ((Class282_Sub41_Sub4) this).aDSPState9600.granuleTime();
			if (((Class282_Sub41_Sub4) this).aDouble9604 == -1.0)
				((Class282_Sub41_Sub4) this).aDouble9604 = (double) ((float) (((Class282_Sub41_Sub4) this).anInt9602 * 1938979851) / (float) (((Class282_Sub41_Sub4) this).aVorbisInfo9605.rate));
			((Class282_Sub41_Sub4) this).aDSPState9600.read(fs[0].length);
			((Class282_Sub41_Sub4) this).anInt9602 += -1560334429 * fs[0].length;
			Class282_Sub39 class282_sub39 = (((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14814(fs[0].length, ((Class282_Sub41_Sub4) this).aDouble9604));
			Class468_Sub20.method12805(fs, (((Class282_Sub39) class282_sub39).aShortArrayArray8003), -289864587);
			for (int i = 0; i < ((Class282_Sub41_Sub4) this).aVorbisInfo9605.channels; i++)
				((Class282_Sub39) class282_sub39).aShortArrayArray8003[i] = (((Class282_Sub41_Sub4) this).aClass344_9598.method6111((((Class282_Sub39) class282_sub39).aShortArrayArray8003[i]), -640368423));
			((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14815(class282_sub39, -1788254103);
		}
	}

	void method13365() {
		if (((Class282_Sub41_Sub4) this).aVorbisBlock9601 != null)
			((Class282_Sub41_Sub4) this).aVorbisBlock9601.method6699();
		if (null != ((Class282_Sub41_Sub4) this).aDSPState9600)
			((Class282_Sub41_Sub4) this).aDSPState9600.method6699();
		((Class282_Sub41_Sub4) this).aVorbisComment9599.method6699();
		((Class282_Sub41_Sub4) this).aVorbisInfo9605.method6699();
		if (((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603 != null)
			((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14808((byte) -71);
	}

	double method14848(int i) {
		double d = ((Class282_Sub41_Sub4) this).aDouble9604;
		if (null != ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603) {
			d = ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14819(-907246201);
			if (d < 0.0)
				d = ((Class282_Sub41_Sub4) this).aDouble9604;
		}
		return d - (double) (256.0F / (float) Class253.anInt3129);
	}

	static short[][] method14849(float[][] fs, short[][] is) {
		for (int i = 0; i < fs.length; i++) {
			for (int i_2_ = 0; i_2_ < is[i].length; i_2_++)
				is[i][i_2_] = (short) (int) (16383.0F * fs[i][i_2_]);
		}
		return is;
	}

	static short[][] method14850(float[][] fs, short[][] is) {
		for (int i = 0; i < fs.length; i++) {
			for (int i_3_ = 0; i_3_ < is[i].length; i_3_++)
				is[i][i_3_] = (short) (int) (16383.0F * fs[i][i_3_]);
		}
		return is;
	}

	public Class282_Sub15_Sub1 method14851() {
		return ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603;
	}

	double method14852() {
		double d = ((Class282_Sub41_Sub4) this).aDouble9604;
		if (null != ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603) {
			d = ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14819(-1632712101);
			if (d < 0.0)
				d = ((Class282_Sub41_Sub4) this).aDouble9604;
		}
		return d - (double) (256.0F / (float) Class253.anInt3129);
	}

	double method14853() {
		double d = ((Class282_Sub41_Sub4) this).aDouble9604;
		if (null != ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603) {
			d = ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14819(1010706419);
			if (d < 0.0)
				d = ((Class282_Sub41_Sub4) this).aDouble9604;
		}
		return d - (double) (256.0F / (float) Class253.anInt3129);
	}

	public Class282_Sub15_Sub1 method14854() {
		return ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603;
	}

	void method13360(int i) {
		if (((Class282_Sub41_Sub4) this).aVorbisBlock9601 != null)
			((Class282_Sub41_Sub4) this).aVorbisBlock9601.method6699();
		if (null != ((Class282_Sub41_Sub4) this).aDSPState9600)
			((Class282_Sub41_Sub4) this).aDSPState9600.method6699();
		((Class282_Sub41_Sub4) this).aVorbisComment9599.method6699();
		((Class282_Sub41_Sub4) this).aVorbisInfo9605.method6699();
		if (((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603 != null)
			((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14808((byte) -52);
	}

	int method14855() {
		return (null == ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603 ? 0 : ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14811(-138243867));
	}

	int method14856() {
		return (null == ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603 ? 0 : ((Class282_Sub41_Sub4) this).aClass282_Sub15_Sub1_9603.method14811(-138243867));
	}

	static final void method14857(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub28_8212, ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) == 1) ? 1 : 0, 1214573976);
		Class190.method3148((byte) 106);
		client.aBool7175 = false;
	}
}
