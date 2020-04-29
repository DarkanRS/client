package com.jagex;

public class Class535 {

    int anInt7083;

    Vector3 aClass385_7084;

    float aFloat7081;

    float aFloat7082;

    float aFloat7090;

    int anInt7085;

    int anInt7086;

    Class152 aClass152_7087;

    float aFloat7088;

    float aFloat7089;

    float aFloat7080;

    Class247 aClass247_7091;

    public Class535(ByteBuf rsbytebuffer_1, Class239 class239_2) {
        method11468(rsbytebuffer_1, class239_2);
    }

    public Class535() {
        method11443();
    }

    void method11443() {
        anInt7083 = Class239.anInt2935;
        aClass385_7084 = Vector3.method6639(-50.0f, -60.0f, -50.0f);
        aFloat7081 = 1.1523438F;
        aFloat7082 = 0.69921875F;
        aFloat7090 = 1.2F;
        anInt7085 = Class239.anInt2932;
        anInt7086 = 0;
        aClass152_7087 = Class81.aClass152_802;
        aFloat7088 = 1.0F;
        aFloat7089 = 0.25F;
        aFloat7080 = 1.0F;
        aClass247_7091 = Class239.aClass247_2940;
    }

    void method11444(Class535 class535_1) {
        anInt7083 = class535_1.anInt7083;
        aFloat7081 = class535_1.aFloat7081;
        aFloat7082 = class535_1.aFloat7082;
        aFloat7090 = class535_1.aFloat7090;
        aClass385_7084.copy(class535_1.aClass385_7084);
        anInt7085 = class535_1.anInt7085;
        anInt7086 = class535_1.anInt7086;
        aClass152_7087 = class535_1.aClass152_7087;
        aFloat7088 = class535_1.aFloat7088;
        aFloat7089 = class535_1.aFloat7089;
        aFloat7080 = class535_1.aFloat7080;
        aClass247_7091 = class535_1.aClass247_7091;
    }

    void method11445(AbstractRenderer graphicalrenderer_1, Class535 class535_2, Class535 class535_3, float f_4) {
        anInt7083 = Class302.method5364(class535_2.anInt7083, class535_3.anInt7083, 255.0F * f_4);
        aFloat7082 = class535_2.aFloat7082 + (class535_3.aFloat7082 - class535_2.aFloat7082) * f_4;
        aFloat7090 = class535_2.aFloat7090 + f_4 * (class535_3.aFloat7090 - class535_2.aFloat7090);
        aFloat7081 = f_4 * (class535_3.aFloat7081 - class535_2.aFloat7081) + class535_2.aFloat7081;
        aFloat7080 = class535_2.aFloat7080 + (class535_3.aFloat7080 - class535_2.aFloat7080) * f_4;
        aFloat7088 = class535_2.aFloat7088 + (class535_3.aFloat7088 - class535_2.aFloat7088) * f_4;
        aFloat7089 = class535_2.aFloat7089 + f_4 * (class535_3.aFloat7089 - class535_2.aFloat7089);
        anInt7085 = Class302.method5364(class535_2.anInt7085, class535_3.anInt7085, 255.0F * f_4);
        anInt7086 = (int) ((class535_3.anInt7086 - class535_2.anInt7086) * f_4 + class535_2.anInt7086);
        if (class535_2.aClass152_7087 != class535_3.aClass152_7087) {
            aClass152_7087 = graphicalrenderer_1.method8467(class535_2.aClass152_7087, class535_3.aClass152_7087, f_4, aClass152_7087);
        }
        if (class535_2.aClass247_7091 != class535_3.aClass247_7091) {
            if (class535_2.aClass247_7091 == null) {
                aClass247_7091 = class535_3.aClass247_7091;
                if (aClass247_7091 != null) {
                    aClass247_7091.method4207((int) (f_4 * 255.0F), 0);
                }
            } else {
                aClass247_7091 = class535_2.aClass247_7091;
                if (aClass247_7091 != null) {
                    aClass247_7091.method4207((int) (f_4 * 255.0F), 255);
                }
            }
        }
    }

    boolean method11449(Class535 class535_1) {
        return anInt7083 == class535_1.anInt7083 && class535_1.aFloat7081 == aFloat7081 && aFloat7082 == class535_1.aFloat7082 && class535_1.aFloat7090 == aFloat7090 && class535_1.aFloat7089 == aFloat7089 && class535_1.aFloat7088 == aFloat7088 && aFloat7080 == class535_1.aFloat7080 && anInt7085 == class535_1.anInt7085 && anInt7086 == class535_1.anInt7086 && aClass152_7087 == class535_1.aClass152_7087 && aClass247_7091 == class535_1.aClass247_7091;
    }

    public int method11450() {
        return anInt7085;
    }

    public Class247 method11451() {
        return aClass247_7091;
    }

    public void method11468(ByteBuf rsbytebuffer_1, Class239 class239_2) {
        int i_4 = rsbytebuffer_1.readUnsignedByte();
        if (Class393.preferences.lightDetail.method12786() == 1 && Renderers.SOFTWARE_RENDERER.method8463() > 0) {
            if ((i_4 & 0x1) != 0) {
                anInt7083 = rsbytebuffer_1.readInt();
            } else {
                anInt7083 = Class239.anInt2935;
            }
            if ((i_4 & 0x2) != 0) {
                aFloat7081 = rsbytebuffer_1.readUnsignedShort() / 256.0F;
            } else {
                aFloat7081 = 1.1523438F;
            }
            if ((i_4 & 0x4) != 0) {
                aFloat7082 = rsbytebuffer_1.readUnsignedShort() / 256.0F;
            } else {
                aFloat7082 = 0.69921875F;
            }
            if ((i_4 & 0x8) != 0) {
                aFloat7090 = rsbytebuffer_1.readUnsignedShort() / 256.0F;
            } else {
                aFloat7090 = 1.2F;
            }
        } else {
            if ((i_4 & 0x1) != 0) {
                rsbytebuffer_1.readInt();
            }
            if ((i_4 & 0x2) != 0) {
                rsbytebuffer_1.readUnsignedShort();
            }
            if ((i_4 & 0x4) != 0) {
                rsbytebuffer_1.readUnsignedShort();
            }
            if ((i_4 & 0x8) != 0) {
                rsbytebuffer_1.readUnsignedShort();
            }
            anInt7083 = Class239.anInt2935;
            aFloat7090 = 1.2F;
            aFloat7082 = 0.69921875F;
            aFloat7081 = 1.1523438F;
        }
        if ((i_4 & 0x10) != 0) {
            aClass385_7084 = Vector3.method6639(rsbytebuffer_1.readShort(), rsbytebuffer_1.readShort(), rsbytebuffer_1.readShort());
        } else {
            aClass385_7084 = Vector3.method6639(-50.0f, -60.0f, -50.0f);
        }
        if ((i_4 & 0x20) != 0) {
            anInt7085 = rsbytebuffer_1.readInt();
        } else {
            anInt7085 = Class239.anInt2932;
        }
        if ((i_4 & 0x40) != 0) {
            anInt7086 = rsbytebuffer_1.readUnsignedShort();
        } else {
            anInt7086 = 0;
        }
        if ((i_4 & 0x80) != 0) {
            int i_5 = rsbytebuffer_1.readUnsignedShort();
            int i_6 = rsbytebuffer_1.readUnsignedShort();
            int i_7 = rsbytebuffer_1.readUnsignedShort();
            int i_8 = rsbytebuffer_1.readUnsignedShort();
            int i_9 = rsbytebuffer_1.readUnsignedShort();
            int i_10 = rsbytebuffer_1.readUnsignedShort();
            aClass152_7087 = class239_2.method4064(i_5, i_6, i_7, i_8, i_9, i_10);
        } else {
            aClass152_7087 = Class81.aClass152_802;
        }
    }

    public void method11471(ByteBuf rsbytebuffer_1) {
        aFloat7088 = (rsbytebuffer_1.readUnsignedByte() * 8) / 255.0F;
        aFloat7089 = (rsbytebuffer_1.readUnsignedByte() * 8) / 255.0F;
        aFloat7080 = (rsbytebuffer_1.readUnsignedByte() * 8) / 255.0F;
    }

    public void method11472(ByteBuf rsbytebuffer_1, Class239 class239_2) {
        int i_4 = rsbytebuffer_1.readUnsignedShort();
        int i_5 = rsbytebuffer_1.readShort();
        int i_6 = rsbytebuffer_1.readShort();
        int i_7 = rsbytebuffer_1.readShort();
        int i_8 = rsbytebuffer_1.readUnsignedShort();
        Class388.anInt4723 = i_8;
        aClass247_7091 = class239_2.method4050(i_4, i_5, i_6, i_7);
    }
}
