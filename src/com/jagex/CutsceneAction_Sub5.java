package com.jagex;

public class CutsceneAction_Sub5 extends CutsceneAction {

    int anInt8845;

    int anInt8847;

    int anInt8846;

    int anInt8848;

    int anInt8849;

    public void method1601() {
        RouteStrategy.moveCamera(-1748191497 * this.anInt8845 * -597628217, this.anInt8846 * 693223401 * -808646567, -602355731 * this.anInt8847 * 1851960805, 100, 100, false);
        HostNameIdentifier.method486(-908637089 * this.anInt8848 * -1393422433, this.anInt8849 * -652781679 * -1608889999, 0);
        client.aBool7321 = true;
    }

    public void method1592() {
        RouteStrategy.moveCamera(this.anInt8845, this.anInt8846, this.anInt8847, 100, 100, false);
        HostNameIdentifier.method486(this.anInt8848, this.anInt8849, 0);
        client.aBool7321 = true;
    }

    CutsceneAction_Sub5(RsByteBuffer rsbytebuffer_1) {
        super(rsbytebuffer_1);
        this.anInt8845 = rsbytebuffer_1.readUnsignedShort();
        this.anInt8847 = rsbytebuffer_1.readUnsignedShort();
        this.anInt8846 = rsbytebuffer_1.readUnsignedShort();
        this.anInt8848 = rsbytebuffer_1.readUnsignedShort();
        this.anInt8849 = rsbytebuffer_1.readUnsignedShort();
    }

    public static void method14243() {
        if (IcmpService_Sub1.anIcmpService_Sub1_7964 != null) {
            try {
                IcmpService_Sub1.anIcmpService_Sub1_7964.quit();
            } catch (Throwable throwable_2) {
            }
            IcmpService_Sub1.anIcmpService_Sub1_7964 = null;
        }
    }
}
