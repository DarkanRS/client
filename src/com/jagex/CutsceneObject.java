package com.jagex;

public class CutsceneObject {

    int objectId;

    ObjectType type;

    int anInt965;

    int anInt962;

    int anInt966;

    int anInt967;

    CutsceneObject(ByteBuf rsbytebuffer_1) {
        objectId = rsbytebuffer_1.readBigSmart();
        type = (ObjectType) Class386.identify(ObjectType.values(), rsbytebuffer_1.readUnsignedByte());
    }

    static int calculateTileHeights(int i_0, int i_1) {
        int i_3 = Class159.method2735(45365 + i_0, i_1 + 91923, 4) - 128 + (Class159.method2735(i_0 + 10294, 37821 + i_1, 2) - 128 >> 1) + (Class159.method2735(i_0, i_1, 1) - 128 >> 2);
        i_3 = (int) (i_3 * 0.3D) + 35;
        if (i_3 < 10) {
            i_3 = 10;
        } else if (i_3 > 60) {
            i_3 = 60;
        }
        return i_3;
    }

    static QuickChatValueType[] getQuickChatDynamicValueTypes() {
        return new QuickChatValueType[]{QuickChatValueType.ENUM_STRING, QuickChatValueType.ACC_GETCOUNT_WORLD, QuickChatValueType.STAT_BASE, QuickChatValueType.ACTIVECOMBATLEVEL, QuickChatValueType.OBJTRADEDIALOG, QuickChatValueType.ENUM_STRING_CLAN, QuickChatValueType.COUNTDIALOG, QuickChatValueType.TOSTRING_VARBIT, QuickChatValueType.TOSTRING_VARP, QuickChatValueType.LISTDIALOG, QuickChatValueType.ACC_GETMEANCOMBATLEVEL, QuickChatValueType.TOSTRING_SHARED, QuickChatValueType.OBJDIALOG, QuickChatValueType.ENUM_STRING_STATBASE};
    }

    public static void method1563(int i_0) {
        VorbisNode class282_sub37_2 = (VorbisNode) Class492.INDEX36_FILE_CACHE.get(i_0);
        if (class282_sub37_2 != null) {
            class282_sub37_2.vfReference.method4947();
            Class62.method1260(class282_sub37_2.fileId, class282_sub37_2.aBool7998);
            class282_sub37_2.unlink();
        }
    }

    static void method1564(int i_0, int i_1, int i_2, int i_3, int i_4) {
        for (int i_6 = i_2; i_6 <= i_3; i_6++) {
            KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_6], i_0, i_1, i_4);
        }
    }

    public static void method1565(int i_0) {
        PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(4, i_0);
        class282_sub50_sub12_2.method14965();
    }

    boolean method1557() {
        if (objectId < 0) {
            return true;
        } else {
            ObjectDefinition objectdefinitions_2 = IndexLoaders.OBJECT_LOADER.getObjectDefs(objectId);
            boolean bool_3 = objectdefinitions_2.method7987(type.type);
            int[] ints_4 = objectdefinitions_2.method8008();
            if (ints_4 != null) {
                int[] ints_5 = ints_4;
                for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
                    int i_7 = ints_5[i_6];
                    bool_3 &= IndexLoaders.ANIMATION_LOADER.getAnimDefs(i_7).ready();
                }
            }
            return bool_3;
        }
    }

    void method1558() {
        Class299.method5313(anInt965, anInt962, anInt966, type.slot, -1, type.type, anInt967);
    }

    void method1559(int i_1, int i_2, int i_3, int i_4) {
        Class299.method5313(i_1, i_2, i_3, type.slot, objectId, type.type, i_4);
        anInt965 = i_1;
        anInt962 = i_2;
        anInt966 = i_3;
        anInt967 = i_4;
    }
}
