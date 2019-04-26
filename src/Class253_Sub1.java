import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;

public class Class253_Sub1 extends Class253 {

	AudioFormat anAudioFormat7824;
	byte[] aByteArray7825;
	boolean aBool7826 = false;
	SourceDataLine aSourceDataLine7822;
	int anInt7823;

	void method4370(Component component_1) {
		Info[] arr_2 = AudioSystem.getMixerInfo();
		if (arr_2 != null) {
			Info[] arr_3 = arr_2;

			for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
				Info mixer$info_5 = arr_3[i_4];
				if (mixer$info_5 != null) {
					String string_6 = mixer$info_5.getName();
					if (string_6 != null && string_6.toLowerCase().indexOf("soundmax") >= 0) {
						this.aBool7826 = true;
					}
				}
			}
		}

		this.anAudioFormat7824 = new AudioFormat((float) anInt3129, 16, aBool3115 ? 2 : 1, true, false);
		this.aByteArray7825 = new byte[256 << (aBool3115 ? 2 : 1)];
	}

	void method4361(int i_1) throws LineUnavailableException {
		try {
			javax.sound.sampled.DataLine.Info dataline$info_2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat7824, i_1 << (aBool3115 ? 2 : 1));
			this.aSourceDataLine7822 = (SourceDataLine) AudioSystem.getLine(dataline$info_2);
			this.aSourceDataLine7822.open();
			this.aSourceDataLine7822.start();
			this.anInt7823 = i_1;
		} catch (LineUnavailableException lineunavailableexception_3) {
			if (Class179.method3019(i_1) == 1) {
				this.aSourceDataLine7822 = null;
				throw lineunavailableexception_3;
			}

			this.method4361(Utils.nextPowerOfTwo(i_1));
		}

	}

	void method4342() {
		int i_1 = 256;
		if (aBool3115) {
			i_1 <<= 1;
		}

		for (int i_2 = 0; i_2 < i_1; i_2++) {
			int i_3 = this.anIntArray3140[i_2];
			if ((i_3 + 8388608 & ~0xffffff) != 0) {
				i_3 = 0x7fffff ^ i_3 >> 31;
			}

			this.aByteArray7825[i_2 * 2] = (byte) (i_3 >> 8);
			this.aByteArray7825[i_2 * 2 + 1] = (byte) (i_3 >> 16);
		}

		this.aSourceDataLine7822.write(this.aByteArray7825, 0, i_1 << 1);
	}

	void method4343() {
		if (this.aSourceDataLine7822 != null) {
			this.aSourceDataLine7822.close();
			this.aSourceDataLine7822 = null;
		}

	}

	void method4344() throws LineUnavailableException {
		this.aSourceDataLine7822.flush();
		if (this.aBool7826) {
			this.aSourceDataLine7822.close();
			this.aSourceDataLine7822 = null;
			javax.sound.sampled.DataLine.Info dataline$info_1 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, this.anAudioFormat7824, this.anInt7823 << (aBool3115 ? 2 : 1));
			this.aSourceDataLine7822 = (SourceDataLine) AudioSystem.getLine(dataline$info_1);
			this.aSourceDataLine7822.open();
			this.aSourceDataLine7822.start();
		}

	}

	int method4340() {
		return this.anInt7823 - (this.aSourceDataLine7822.available() >> (aBool3115 ? 2 : 1));
	}

}
