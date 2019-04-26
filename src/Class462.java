public class Class462 {

	public static String[] VARC_STRING;

	int anInt5542;

	AnimationFrameSet aCacheableNode_Sub13_5545;

	int anInt5543;

	int anInt5547;

	AnimationFrameSet animationFrameSet;

	boolean aBool5544 = false;

	final boolean method7707(AnimationIndexLoader animationindexloader_1, AnimationDefinitions animationdefinitions_2, int i_3, int i_4, int[] ints_5, int i_6) {
		if (!this.aBool5544) {
			if (i_3 >= ints_5.length) {
				return false;
			} else {
				this.anInt5542 = ints_5[i_3];
				this.aCacheableNode_Sub13_5545 = animationindexloader_1.getAnimationFrame(this.anInt5542 >> 16);
				this.anInt5542 &= 0xffff;
				if (this.aCacheableNode_Sub13_5545 != null) {
					if (animationdefinitions_2.tweened && i_4 != -1 && i_4 < ints_5.length) {
						this.anInt5547 = ints_5[i_4];
						this.animationFrameSet = animationindexloader_1.getAnimationFrame(this.anInt5547 >> 16);
						this.anInt5547 &= 0xffff;
					}
					if (animationdefinitions_2.aBool5923) {
						this.anInt5543 |= 0x200;
					}
					if (this.aCacheableNode_Sub13_5545.method15080(this.anInt5542, -1144516636)) {
						this.anInt5543 |= 0x80;
					}
					if (this.aCacheableNode_Sub13_5545.method15079(this.anInt5542)) {
						this.anInt5543 |= 0x100;
					}
					if (this.aCacheableNode_Sub13_5545.method15081(this.anInt5542)) {
						this.anInt5543 |= 0x400;
					}
					if (this.animationFrameSet != null) {
						if (this.animationFrameSet.method15080(this.anInt5547, -2104215933)) {
							this.anInt5543 |= 0x80;
						}
						if (this.animationFrameSet.method15079(this.anInt5547)) {
							this.anInt5543 |= 0x100;
						}
						if (this.animationFrameSet.method15081(this.anInt5547)) {
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

	final void method7708() {
		this.aBool5544 = false;
		this.anInt5543 = 0;
		this.animationFrameSet = null;
		this.aCacheableNode_Sub13_5545 = null;
	}
}
