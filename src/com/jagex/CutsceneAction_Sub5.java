package com.jagex;

public class CutsceneAction_Sub5 extends CutsceneAction {

    int anInt8845;

    int anInt8847;

    int anInt8846;

    int anInt8848;

    int anInt8849;

    CutsceneAction_Sub5(ByteBuf rsbytebuffer_1) {
        super(rsbytebuffer_1);
        anInt8845 = rsbytebuffer_1.readUnsignedShort();
        anInt8847 = rsbytebuffer_1.readUnsignedShort();
        anInt8846 = rsbytebuffer_1.readUnsignedShort();
        anInt8848 = rsbytebuffer_1.readUnsignedShort();
        anInt8849 = rsbytebuffer_1.readUnsignedShort();
    }

    public static void method14243() {
        if (IcmpService_Sub1.anIcmpService_Sub1_7964 != null) {
            try {
                IcmpService_Sub1.anIcmpService_Sub1_7964.quit();
            } catch (Throwable ignored) {
            }
            IcmpService_Sub1.anIcmpService_Sub1_7964 = null;
        }
    }

    public void method1601() {
        RouteStrategy.moveCamera(-1748191497 * anInt8845 * -597628217, anInt8846 * 693223401 * -808646567, -602355731 * anInt8847 * 1851960805, 100, 100, false);
        HostNameIdentifier.method486(-908637089 * anInt8848 * -1393422433, anInt8849 * -652781679 * -1608889999, 0);
        client.aBool7321 = true;
    }

    @Override
    public void method1592() {
        RouteStrategy.moveCamera(anInt8845, anInt8846, anInt8847, 100, 100, false);
        HostNameIdentifier.method486(anInt8848, anInt8849, 0);
        client.aBool7321 = true;
    }
}
