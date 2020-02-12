package com.jagex;

public class VarnIndexLoader {

    SoftCache aClass229_5417 = new SoftCache(64);

    Index aClass317_5418;

    public VarnDefinitions method7450(int i_1) {
        SoftCache softcache_4 = this.aClass229_5417;
        VarnDefinitions class449_3;
        synchronized (this.aClass229_5417) {
            class449_3 = (VarnDefinitions) this.aClass229_5417.get(i_1);
        }
        if (class449_3 != null) {
            return class449_3;
        } else {
            byte[] bytes_8 = this.aClass317_5418.getFile(SharedConfigsType.VARN.id, i_1);
            class449_3 = new VarnDefinitions();
            if (bytes_8 != null) {
                class449_3.method7487(new RsByteBuffer(bytes_8));
            }
            SoftCache softcache_5 = this.aClass229_5417;
            synchronized (this.aClass229_5417) {
                this.aClass229_5417.put(class449_3, i_1);
                return class449_3;
            }
        }
    }

    public void method7452() {
        SoftCache softcache_3 = this.aClass229_5417;
        synchronized (this.aClass229_5417) {
            this.aClass229_5417.method3858(5);
        }
    }

    public void method7453() {
        SoftCache softcache_2 = this.aClass229_5417;
        synchronized (this.aClass229_5417) {
            this.aClass229_5417.method3863();
        }
    }

    public VarnIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
        this.aClass317_5418 = index_3;
        if (this.aClass317_5418 != null) {
            this.aClass317_5418.filesCount(SharedConfigsType.VARN.id);
        }
    }

    public void method7458() {
        SoftCache softcache_2 = this.aClass229_5417;
        synchronized (this.aClass229_5417) {
            this.aClass229_5417.method3859();
        }
    }

    static final void method7460(int i_0, int i_1, int i_2, int i_3) {
        String string_4 = "tele " + i_0 + "," + (i_1 >> 6) + "," + (i_2 >> 6) + "," + (i_1 & 0x3f) + "," + (i_2 & 0x3f);
        RouteFinder.handleCommand(string_4, true, false);
    }
}
