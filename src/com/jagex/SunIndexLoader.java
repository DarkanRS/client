package com.jagex;

public class SunIndexLoader {

    protected static int anInt434;

    SoftCache aClass229_432 = new SoftCache(16);

    Index aClass317_433;

    public SunDefinitions method914(int i_1) {
        SoftCache softcache_4 = this.aClass229_432;
        SunDefinitions class38_3;
        synchronized (this.aClass229_432) {
            class38_3 = (SunDefinitions) this.aClass229_432.get(i_1);
        }
        if (class38_3 != null) {
            return class38_3;
        } else {
            Index index_5 = this.aClass317_433;
            byte[] bytes_10;
            synchronized (this.aClass317_433) {
                bytes_10 = this.aClass317_433.getFile(SharedConfigsType.SUN.id, i_1);
            }
            class38_3 = new SunDefinitions();
            if (bytes_10 != null) {
                class38_3.method850(new RsByteBuffer(bytes_10));
            }
            SoftCache softcache_9 = this.aClass229_432;
            synchronized (this.aClass229_432) {
                this.aClass229_432.put(class38_3, i_1);
                return class38_3;
            }
        }
    }

    public void method916() {
        SoftCache softcache_2 = this.aClass229_432;
        synchronized (this.aClass229_432) {
            this.aClass229_432.method3859();
        }
    }

    public void method917() {
        SoftCache softcache_3 = this.aClass229_432;
        synchronized (this.aClass229_432) {
            this.aClass229_432.method3858(5);
        }
    }

    public void method918() {
        SoftCache softcache_2 = this.aClass229_432;
        synchronized (this.aClass229_432) {
            this.aClass229_432.method3863();
        }
    }

    public SunIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
        this.aClass317_433 = index_3;
        this.aClass317_433.filesCount(SharedConfigsType.SUN.id);
    }
}
