public class Class462 {

	public static String[] aStringArray5548;
	int anInt5542;
	AnimationFrameSet aClass282_Sub50_Sub13_5545;
	int anInt5543;
	int anInt5547;
	AnimationFrameSet aClass282_Sub50_Sub13_5546;
	boolean aBool5544 = false;

	final boolean method7707(AnimationIndexLoader animationindexloader_1, AnimationDefinitions animationdefinitions_2, int i_3, int i_4, int[] ints_5, int i_6) {
		if (!this.aBool5544) {
			if (i_3 >= ints_5.length) {
				return false;
			} else {
				this.anInt5542 = ints_5[i_3];
				this.aClass282_Sub50_Sub13_5545 = animationindexloader_1.getAnimationFrame(this.anInt5542 >> 16, -1536383536);
				this.anInt5542 &= 0xffff;
				if (this.aClass282_Sub50_Sub13_5545 != null) {
					if (animationdefinitions_2.tweened && i_4 != -1 && i_4 < ints_5.length) {
						this.anInt5547 = ints_5[i_4];
						this.aClass282_Sub50_Sub13_5546 = animationindexloader_1.getAnimationFrame(this.anInt5547 >> 16, -1536383536);
						this.anInt5547 &= 0xffff;
					}

					if (animationdefinitions_2.aBool5923) {
						this.anInt5543 |= 0x200;
					}

					if (this.aClass282_Sub50_Sub13_5545.method15080(this.anInt5542, -1144516636)) {
						this.anInt5543 |= 0x80;
					}

					if (this.aClass282_Sub50_Sub13_5545.method15079(this.anInt5542, 61802721)) {
						this.anInt5543 |= 0x100;
					}

					if (this.aClass282_Sub50_Sub13_5545.method15081(this.anInt5542, -752356381)) {
						this.anInt5543 |= 0x400;
					}

					if (this.aClass282_Sub50_Sub13_5546 != null) {
						if (this.aClass282_Sub50_Sub13_5546.method15080(this.anInt5547, -2104215933)) {
							this.anInt5543 |= 0x80;
						}

						if (this.aClass282_Sub50_Sub13_5546.method15079(this.anInt5547, 61802721)) {
							this.anInt5543 |= 0x100;
						}

						if (this.aClass282_Sub50_Sub13_5546.method15081(this.anInt5547, -752356381)) {
							this.anInt5543 |= 0x400;
						}
					}

					this.anInt5543 |= 0x20;
					this.aBool5544 = true;
					return true;
				} else {
					return false;
				}
			}
		} else {
			return true;
		}
	}

	final void method7708(int i_1) {
		this.aBool5544 = false;
		this.anInt5543 = 0;
		this.aClass282_Sub50_Sub13_5546 = null;
		this.aClass282_Sub50_Sub13_5545 = null;
	}

	static final void method7715(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aClass330Array7428[i_2].anInt3862;
	}

}
