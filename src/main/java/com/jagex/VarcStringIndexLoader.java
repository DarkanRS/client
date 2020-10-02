package com.jagex;

public class VarcStringIndexLoader {

    static IComponentDefinitions aClass118_4825;
    public int size;
    Index configIndex;

    public VarcStringIndexLoader(Index index_3) {
        new LRUCache(64);
        configIndex = index_3;
        size = configIndex.filesCount(SharedConfigsType.VARC_STRING.id);
    }
}
