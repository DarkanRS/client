import java.io.File;

public final class Class153 {

    static int anInt1965;

    int anInt1964;

    IterableNodeMap aClass465_1963;

    public void method2607(byte b_1) {
        if (this.aClass465_1963 != null) {
            this.aClass465_1963.method7749(1241970145);
        }
    }

    public int method2609(int i_1, byte b_2) {
        Class282_Sub38 class282_sub38_3 = (Class282_Sub38) this.aClass465_1963.get((long) i_1);
        if (class282_sub38_3 != null) {
            return class282_sub38_3.anInt8002;
        } else {
            Class449 class449_4 = IndexLoaders.aClass447_435.method7450(i_1, (byte) -118);
            return class449_4.aChar5431 != 105 ? -1 : 0;
        }
    }

    public int method2610(int i_1, short s_2) {
        Class489 class489_3 = IndexLoaders.aClass498_3001.method8322(i_1, (short) 4986);
        int i_4 = class489_3.anInt5764;
        int i_5 = class489_3.anInt5762 == 31 ? -1 : (1 << class489_3.anInt5762 + 1) - 1;
        return (this.method2609(i_4, (byte) 117) & i_5) >>> class489_3.anInt5763;
    }

    Class153(int i_1) {
        this.anInt1964 = i_1;
    }

    public void method2614(int i_1, int i_2, short s_3) {
        if (this.aClass465_1963 == null) {
            if (s_3 != 768) {
                return;
            }
            this.aClass465_1963 = new IterableNodeMap(this.anInt1964);
        }
        Class282_Sub38 class282_sub38_4 = (Class282_Sub38) this.aClass465_1963.get((long) i_1);
        if (class282_sub38_4 != null) {
            if (s_3 == 768) {
                class282_sub38_4.anInt8002 = i_2;
            }
        } else {
            class282_sub38_4 = new Class282_Sub38(i_2);
            this.aClass465_1963.put(class282_sub38_4, (long) i_1);
        }
    }

    static final int method2617(GraphicalRenderer graphicalrenderer_0, OverlayDef overlaydef_1, byte b_2) {
        if (overlaydef_1.secondaryRGB != -1) {
            return overlaydef_1.secondaryRGB;
        } else {
            if (overlaydef_1.texture != -1) {
                Class169 class169_3 = graphicalrenderer_0.anInterface22_5834.method144(overlaydef_1.texture, -2032882535);
                if (!class169_3.aBool2056) {
                    return class169_3.aShort2073;
                }
            }
            return overlaydef_1.primaryRGB;
        }
    }

    public static Class268 method2618(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
        if (Class393.preferences.aClass468_Sub13_8225.method12714(1292855903) != 0 && i_1 != 0 && Class260.anInt3219 < 50 && i_0 != -1) {
            Class268 class268_6 = new Class268((byte) 1, i_0, i_1, i_2, i_3, 0, i_4, (Class521_Sub1) null);
            Class260.aClass268Array3232[++Class260.anInt3219 - 1] = class268_6;
            return class268_6;
        } else {
            return null;
        }
    }

    public static Class358[] method2619(int i_0) {
        return new Class358[] { Class358.aClass358_4157, Class358.aClass358_4153, Class358.aClass358_4155, Class358.aClass358_4141, Class358.aClass358_4127, Class358.aClass358_4140, Class358.aClass358_4128, Class358.aClass358_4137, Class358.aClass358_4152, Class358.aClass358_4151, Class358.aClass358_4148, Class358.aClass358_4133, Class358.aClass358_4126, Class358.aClass358_4156, Class358.aClass358_4131, Class358.aClass358_4135, Class358.aClass358_4136, Class358.aClass358_4129, Class358.aClass358_4147, Class358.aClass358_4146, Class358.aClass358_4138, Class358.aClass358_4139, Class358.aClass358_4158, Class358.aClass358_4149, Class358.aClass358_4145, Class358.aClass358_4132, Class358.aClass358_4134, Class358.aClass358_4144, Class358.aClass358_4142, Class358.aClass358_4154, Class358.aClass358_4130, Class358.aClass358_4125, Class358.aClass358_4143, Class358.aClass358_4150 };
    }

    public static byte[] method2621(File file_0, int i_1) {
        return ObjectDefinitions.method8023(file_0, (int) file_0.length(), (byte) 0);
    }

    static Class208 method2622(Class521_Sub1_Sub1 class521_sub1_sub1_0, int i_1) {
        Class208 class208_2;
        if (Class507.aClass208_5860 == null) {
            class208_2 = new Class208();
        } else {
            class208_2 = Class507.aClass208_5860;
            Class507.aClass208_5860 = Class507.aClass208_5860.aClass208_2660;
            class208_2.aClass208_2660 = null;
            --Class208.anInt2661;
        }
        class208_2.aClass521_Sub1_Sub1_2659 = class521_sub1_sub1_0;
        return class208_2;
    }
}
