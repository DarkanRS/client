import java.util.Arrays;

public class CutsceneAction_Sub18 extends CutsceneAction {

    int anInt9395;

    int[] anIntArray9397;

    int anInt9396;

    int anInt9398;

    CutsceneAction_Sub18(RsByteBuffer rsbytebuffer_1) {
        super(rsbytebuffer_1);
        this.anInt9395 = rsbytebuffer_1.readUnsignedShort();
        this.anIntArray9397 = new int[FontRenderer_Sub3.method14339().length];
        this.anInt9396 = rsbytebuffer_1.readBigSmart();
        Arrays.fill(this.anIntArray9397, 0, this.anIntArray9397.length, this.anInt9396);
        this.anInt9398 = rsbytebuffer_1.readInt();
    }

    public void method1592() {
        Animable animable_2 = Class82.aClass75Array804[this.anInt9395].method1342((byte) 62);
        if (this.anInt9398 == 0) {
            Class20.animate(animable_2, this.anIntArray9397, 0, false, (byte) -103);
        } else {
            QuickchatCategoryLoader.method5923(animable_2, new int[] { this.anInt9396 }, new int[1], new int[] { this.anInt9398 }, 1929963591);
        }
    }

    boolean method1599() {
        AnimationDefinitions animationdefinitions_2 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(this.anInt9396, (byte) -29);
        return animationdefinitions_2.ready();
    }

    public void method1601() {
        Animable animable_1 = Class82.aClass75Array804[1932395903 * this.anInt9395 * 1548991103].method1342((byte) 78);
        if (1684442377 * this.anInt9398 * 933564729 == 0) {
            Class20.animate(animable_1, this.anIntArray9397, 0, false, (byte) 7);
        } else {
            QuickchatCategoryLoader.method5923(animable_1, new int[] { this.anInt9396 * 185651677 * 1590562421 }, new int[1], new int[] { this.anInt9398 * 933564729 * 1684442377 }, 1894867046);
        }
    }
}
