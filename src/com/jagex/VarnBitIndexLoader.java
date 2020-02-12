package com.jagex;

public class VarnBitIndexLoader {

    SoftCache aClass229_5824 = new SoftCache(64);

    Index aClass317_5823;

    public void method8319() {
        SoftCache softcache_2 = this.aClass229_5824;
        synchronized (this.aClass229_5824) {
            this.aClass229_5824.method3859();
        }
    }

    public void method8320() {
        SoftCache softcache_3 = this.aClass229_5824;
        synchronized (this.aClass229_5824) {
            this.aClass229_5824.method3858(5);
        }
    }

    public void method8321() {
        SoftCache softcache_2 = this.aClass229_5824;
        synchronized (this.aClass229_5824) {
            this.aClass229_5824.method3863();
        }
    }

    public VarnBitIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
        this.aClass317_5823 = index_3;
        if (this.aClass317_5823 != null) {
            this.aClass317_5823.filesCount(SharedConfigsType.VARNBIT.id);
        }
    }

    public VarnBitDefinitions method8322(int i_1) {
        SoftCache softcache_4 = this.aClass229_5824;
        VarnBitDefinitions class489_3;
        synchronized (this.aClass229_5824) {
            class489_3 = (VarnBitDefinitions) this.aClass229_5824.get(i_1);
        }
        if (class489_3 != null) {
            return class489_3;
        } else {
            byte[] bytes_8 = this.aClass317_5823.getFile(SharedConfigsType.VARNBIT.id, i_1);
            class489_3 = new VarnBitDefinitions();
            if (bytes_8 != null) {
                class489_3.method8213(new RsByteBuffer(bytes_8));
            }
            SoftCache softcache_5 = this.aClass229_5824;
            synchronized (this.aClass229_5824) {
                this.aClass229_5824.put(class489_3, i_1);
                return class489_3;
            }
        }
    }
}
