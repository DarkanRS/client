package com.jagex;

public class LightIntensityIndexLoader {

    LRUCache aClass229_5334 = new LRUCache(64);
    Index aClass317_5333;

    public LightIntensityIndexLoader(Index index_3) {
        aClass317_5333 = index_3;
        aClass317_5333.filesCount(SharedConfigsType.LIGHT_INTENSITIES.id);
    }

    static void method7313(SubInterface ifSub, int baseWindowId, int leftBound, int lowerBound, int rightBound, int upperBound, int x, int y, int mouseX, int mouseY) {
        if (MovingAnimation.isInterfaceLoaded(baseWindowId, null)) {
            if (ifSub != null && !ifSub.load()) {
                Class351.closeChildren(ifSub, true, false);
            } else {
                Interface interface_11 = CustomCursorsPreference.INTERFACES[baseWindowId];
                client.method11768(interface_11, interface_11.method1616(), -1, leftBound, lowerBound, rightBound, upperBound, x, y, mouseX, mouseY);
            }
        }
    }

    public LightIntensityDefinitions method7304(int i_1) {
        LRUCache softcache_4 = aClass229_5334;
        LightIntensityDefinitions class416_3;
        synchronized (aClass229_5334) {
            class416_3 = (LightIntensityDefinitions) aClass229_5334.get(i_1);
        }

        if (class416_3 != null) {
            return class416_3;
        } else {
            Index index_5 = aClass317_5333;
            byte[] bytes_10;
            synchronized (aClass317_5333) {
                bytes_10 = aClass317_5333.getFile(SharedConfigsType.LIGHT_INTENSITIES.id, i_1);
            }

            class416_3 = new LightIntensityDefinitions();
            if (bytes_10 != null) {
                class416_3.method6999(new ByteBuf(bytes_10));
            }

            LRUCache softcache_9 = aClass229_5334;
            synchronized (aClass229_5334) {
                aClass229_5334.put(class416_3, i_1);
                return class416_3;
            }
        }
    }

    public void method7306() {
        LRUCache softcache_2 = aClass229_5334;
        synchronized (aClass229_5334) {
            aClass229_5334.method3859();
        }
    }

    public void method7307() {
        LRUCache softcache_3 = aClass229_5334;
        synchronized (aClass229_5334) {
            aClass229_5334.method3858(5);
        }
    }

    public void method7308() {
        LRUCache softcache_2 = aClass229_5334;
        synchronized (aClass229_5334) {
            aClass229_5334.method3863();
        }
    }

}
