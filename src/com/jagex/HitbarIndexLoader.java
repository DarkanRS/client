package com.jagex;

public class HitbarIndexLoader {

    static int anInt3451;
    public static NativeSprite aNativeSprite_3452;
    SoftCache aClass229_3449 = new SoftCache(64);
    SoftCache aClass229_3447 = new SoftCache(20);
    Index aClass317_3448;
    Index aClass317_3450;

    public HitbarDefinitions getDefinitions(int i_1, int i_2) {
        SoftCache softcache_4 = this.aClass229_3449;
        HitbarDefinitions hitbardefinitions_3;
        synchronized (this.aClass229_3449) {
            hitbardefinitions_3 = (HitbarDefinitions) this.aClass229_3449.get(i_1);
        }
        if (hitbardefinitions_3 != null) {
            return hitbardefinitions_3;
        } else {
            Index index_5 = this.aClass317_3450;
            byte[] bytes_10;
            synchronized (this.aClass317_3450) {
                bytes_10 = this.aClass317_3450.getFile(SharedConfigsType.HITBARS.id, i_1);
            }
            hitbardefinitions_3 = new HitbarDefinitions();
            hitbardefinitions_3.aClass290_2437 = this;
            if (bytes_10 != null) {
                hitbardefinitions_3.method3210(new RsByteBuffer(bytes_10));
            }
            SoftCache softcache_9 = this.aClass229_3449;
            synchronized (this.aClass229_3449) {
                this.aClass229_3449.put(hitbardefinitions_3, i_1);
                return hitbardefinitions_3;
            }
        }
    }

    public void method5103() {
        SoftCache softcache_2 = this.aClass229_3449;
        synchronized (this.aClass229_3449) {
            this.aClass229_3449.method3859();
        }
        softcache_2 = this.aClass229_3447;
        synchronized (this.aClass229_3447) {
            this.aClass229_3447.method3859();
        }
    }

    public HitbarIndexLoader(Game game_1, Language xlanguage_2, Index index_3, Index index_4) {
        this.aClass317_3448 = index_4;
        this.aClass317_3450 = index_3;
        this.aClass317_3450.filesCount(SharedConfigsType.HITBARS.id);
    }

    public void method5107() {
        SoftCache softcache_3 = this.aClass229_3449;
        synchronized (this.aClass229_3449) {
            this.aClass229_3449.method3858(5);
        }
        softcache_3 = this.aClass229_3447;
        synchronized (this.aClass229_3447) {
            this.aClass229_3447.method3858(5);
        }
    }

    public void method5109() {
        SoftCache softcache_2 = this.aClass229_3449;
        synchronized (this.aClass229_3449) {
            this.aClass229_3449.method3863();
        }
        softcache_2 = this.aClass229_3447;
        synchronized (this.aClass229_3447) {
            this.aClass229_3447.method3863();
        }
    }

    static final void method5118(byte b_0) {
        Class9.aLong77 = -1L;
        Class9.aLong86 = 0L;
        Class9.anInt76 = -1;
    }

    public static String method5120(int i_0, boolean bool_1, int i_2) {
        return bool_1 && i_0 >= 0 ? Class149_Sub4.method14662(i_0, bool_1) : Integer.toString(i_0);
    }
}
