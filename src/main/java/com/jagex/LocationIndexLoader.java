package com.jagex;

public class LocationIndexLoader {

    int anInt5617;

    RSMesh[] aClass157Array5616 = new RSMesh[4];

    Class452 aClass452_5620 = new Class452(null, null);

    LRUCache LRUCache = new LRUCache(256);

    LRUCache aClass229_5614 = new LRUCache(500);

    LRUCache aClass229_5615 = new LRUCache(30);

    LRUCache aClass229_5619 = new LRUCache(50);

    Game game;

    Language language;

    boolean showOptions;

    Index locationIndex;

    Index meshIndex;

    String[] defaultOptions;

    public LocationIndexLoader(Game game_1, Language xlanguage_2, Index index_4, Index index_5) {
        game = game_1;
        language = xlanguage_2;
        showOptions = true;
        locationIndex = index_4;
        meshIndex = index_5;
        if (locationIndex != null) {
            int i_6 = locationIndex.containersCount() - 1;
            SharedConfigsType.OBJECTS.filesPerContainer();
            locationIndex.filesCount(i_6);
        }
        if (game == Game.darkan) {
            defaultOptions = new String[]{null, null, null, null, null, LocalizedText.EXAMINE.translate(language)};
        } else {
            defaultOptions = new String[6];
        }
    }

    public static int method7914(long long_0) {
        return (int) (long_0 / 86400000L) - 11745;
    }

    public ObjectDefinition getObjectDefs(int i_1) {
        LRUCache softcache_4 = LRUCache;
        ObjectDefinition objectdefinitions_3;
        synchronized (LRUCache) {
            objectdefinitions_3 = (ObjectDefinition) LRUCache.get(i_1);
        }
        if (objectdefinitions_3 != null) {
            return objectdefinitions_3;
        } else {
            Index index_5 = locationIndex;
            byte[] bytes_9;
            synchronized (locationIndex) {
                bytes_9 = locationIndex.getFile(SharedConfigsType.OBJECTS.containerId(i_1), SharedConfigsType.OBJECTS.fileId(i_1));
            }
            objectdefinitions_3 = new ObjectDefinition();
            objectdefinitions_3.id = i_1;
            objectdefinitions_3.loader = this;
            objectdefinitions_3.options = defaultOptions.clone();
            if (bytes_9 != null) {
                objectdefinitions_3.method7964(new ByteBuf(bytes_9));
            }
            objectdefinitions_3.method7966();
            if (objectdefinitions_3.ignoreAltClip) {
                objectdefinitions_3.clipType = 0;
                objectdefinitions_3.blocks = false;
            }
            if (!showOptions && objectdefinitions_3.members) {
                objectdefinitions_3.options = null;
                objectdefinitions_3.anIntArray5707 = null;
            }
            LRUCache softcache_10 = LRUCache;
            synchronized (LRUCache) {
                LRUCache.put(objectdefinitions_3, i_1);
                return objectdefinitions_3;
            }
        }
    }

    public void method7893(int i_1) {
        anInt5617 = i_1;
        LRUCache softcache_3 = aClass229_5614;
        synchronized (aClass229_5614) {
            aClass229_5614.method3859();
        }
        softcache_3 = aClass229_5615;
        synchronized (aClass229_5615) {
            aClass229_5615.method3859();
        }
        softcache_3 = aClass229_5619;
        synchronized (aClass229_5619) {
            aClass229_5619.method3859();
        }
    }

    public void method7895() {
        LRUCache softcache_2 = LRUCache;
        synchronized (LRUCache) {
            LRUCache.method3859();
        }
        softcache_2 = aClass229_5614;
        synchronized (aClass229_5614) {
            aClass229_5614.method3859();
        }
        softcache_2 = aClass229_5615;
        synchronized (aClass229_5615) {
            aClass229_5615.method3859();
        }
        softcache_2 = aClass229_5619;
        synchronized (aClass229_5619) {
            aClass229_5619.method3859();
        }
        aClass157Array5616 = new RSMesh[4];
        aClass452_5620 = new Class452(null, null);
    }

    public void method7896() {
        LRUCache softcache_3 = LRUCache;
        synchronized (LRUCache) {
            LRUCache.method3858(5);
        }
        softcache_3 = aClass229_5614;
        synchronized (aClass229_5614) {
            aClass229_5614.method3858(5);
        }
        softcache_3 = aClass229_5615;
        synchronized (aClass229_5615) {
            aClass229_5615.method3858(5);
        }
        softcache_3 = aClass229_5619;
        synchronized (aClass229_5619) {
            aClass229_5619.method3858(5);
        }
    }

    public void method7897() {
        LRUCache softcache_2 = LRUCache;
        synchronized (LRUCache) {
            LRUCache.method3863();
        }
        softcache_2 = aClass229_5614;
        synchronized (aClass229_5614) {
            aClass229_5614.method3863();
        }
        softcache_2 = aClass229_5615;
        synchronized (aClass229_5615) {
            aClass229_5615.method3863();
        }
        softcache_2 = aClass229_5619;
        synchronized (aClass229_5619) {
            aClass229_5619.method3863();
        }
    }

    public void method7899(int i_1) {
        LRUCache = new LRUCache(i_1);
    }

    public void method7912(boolean bool_1) {
        if (showOptions != bool_1) {
            showOptions = bool_1;
            method7895();
        }
    }
}
