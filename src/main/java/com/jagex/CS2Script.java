package com.jagex;

public class CS2Script extends CacheableNode {

    public ClientTriggerType aClass397_9527;
    public int intLocalsCount;
    public int stringLocalsCount;
    public int longLocalsCount;
    public int intArgsCount;
    public int stringArgsCount;
    public int longArgsCount;
    public IterableNodeMap[] switchMaps;
    public String scriptName;
    public CS2Instruction[] operations;
    public Object[] stringOpValues;
    public int[] intOpValues;
    public long[] longOpValues;

    public CS2Script(ByteBuf rsbytebuffer_1) {
        int i_2 = decodeHeader(rsbytebuffer_1);
        int i_3 = 0;

        for (; rsbytebuffer_1.index < i_2; i_3++) {
            CS2Instruction cs2opinfo_5 = getOpcode(rsbytebuffer_1);
            decodeInstruction(rsbytebuffer_1, i_3, cs2opinfo_5);
        }

    }

    CS2Instruction getOpcode(ByteBuf rsbytebuffer_1) {
        int i_3 = rsbytebuffer_1.readUnsignedShort();
        CS2Instruction operation = CS2Instruction.getByOpcode(i_3);
        if (operation != null) {
            return operation;
        } else {
            throw new RuntimeException("");
        }
    }

    int decodeHeader(ByteBuf stream) {
        stream.index = stream.buffer.length - 2;
        int i_2 = stream.readUnsignedShort();
        int i_3 = stream.buffer.length - 2 - i_2 - 16;
        stream.index = i_3;
        int i_4 = stream.readInt();
        intLocalsCount = stream.readUnsignedShort();
        stringLocalsCount = stream.readUnsignedShort();
        longLocalsCount = stream.readUnsignedShort();
        intArgsCount = stream.readUnsignedShort();
        stringArgsCount = stream.readUnsignedShort();
        longArgsCount = stream.readUnsignedShort();
        int i_5 = stream.readUnsignedByte();
        if (i_5 > 0) {
            switchMaps = new IterableNodeMap[i_5];

            for (int i_6 = 0; i_6 < i_5; i_6++) {
                int i_7 = stream.readUnsignedShort();
                IterableNodeMap iterablenodemap_8 = new IterableNodeMap(Utils.nextPowerOfTwo(i_7));
                switchMaps[i_6] = iterablenodemap_8;

                while (i_7-- > 0) {
                    int i_9 = stream.readInt();
                    int i_10 = stream.readInt();
                    iterablenodemap_8.put(new IntNode(i_10), i_9);
                }
            }
        }

        stream.index = 0;
        scriptName = stream.readNullString();
        operations = new CS2Instruction[i_4];
        return i_3;
    }

    void decodeInstruction(ByteBuf rsbytebuffer_1, int i_2, CS2Instruction cs2opinfo_3) {
        int i_4 = operations.length;
        if (cs2opinfo_3 == CS2Instruction.PUSH_STRING) {
            if (stringOpValues == null) {
                stringOpValues = new String[i_4];
            }

            String string_5 = rsbytebuffer_1.readString();
            if (string_5.toLowerCase().contains("runescape")) {
                string_5 = string_5.replace("runescape", "Darkan");
                string_5 = string_5.replace("RuneScape", "Darkan");
                string_5 = string_5.replace("Runescape", "Darkan");
            }

            stringOpValues[i_2] = string_5.intern();
        } else if (cs2opinfo_3 == CS2Instruction.PUSH_LONG) {
            if (longOpValues == null) {
                longOpValues = new long[i_4];
            }

            longOpValues[i_2] = rsbytebuffer_1.readLong();
        } else {
            if (intOpValues == null) {
                intOpValues = new int[i_4];
            }

            if (cs2opinfo_3.hasIntConstant) {
                intOpValues[i_2] = rsbytebuffer_1.readInt();
            } else {
                intOpValues[i_2] = rsbytebuffer_1.readUnsignedByte();
            }
        }

        operations[i_2] = cs2opinfo_3;
    }

}
