package com.jagex;

public class ItemContainerDefinitions extends CacheableNode implements Definition {

    public int contentSize;

    public int maxSize;

    public int[] itemIds;

    public int[] amounts;

    void method15690(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            method15691(rsbytebuffer_1, i_3);
        }
    }

    void method15691(ByteBuf rsbytebuffer_1, int i_2) {
        if (i_2 == 2) {
            maxSize = rsbytebuffer_1.readUnsignedShort();
        } else if (i_2 == 4) {
            contentSize = rsbytebuffer_1.readUnsignedByte();
            itemIds = new int[contentSize];
            amounts = new int[contentSize];
            for (int i_4 = 0; i_4 < contentSize; i_4++) {
                itemIds[i_4] = rsbytebuffer_1.readUnsignedShort();
                amounts[i_4] = rsbytebuffer_1.readUnsignedShort();
            }
        }
    }
}
