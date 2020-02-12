package com.jagex;

public abstract class Transform_Sub1 extends Transform {

    Transform_Sub1 aTransform_Sub1_7966;
    public byte plane;
    public byte collisionPlane;
    int anInt7969;
    public SceneObjectManager aClass206_7970;
    public EntityNode_Sub5[] boundingBoxPolygons;

    abstract int method12982(Node_Sub24[] var1);

    abstract boolean method12983(GraphicalRenderer var1, int var2, int var3);

    abstract void method12984(int var1);

    abstract boolean method12985(int var1);

    abstract boolean method12986(int var1);

    abstract boolean method12987(int var1);

    abstract boolean method12988(GraphicalRenderer var1);

    abstract Class285 method12989(GraphicalRenderer var1);

    abstract Class285 method12990(GraphicalRenderer var1);

    abstract void method12991(GraphicalRenderer var1, int var2);

    public abstract Class200 method12992(GraphicalRenderer var1, byte var2);

    public abstract Class200 method12993(GraphicalRenderer var1);

    Transform_Sub1(SceneObjectManager sceneobjectmanager_1) {
        this.aClass206_7970 = sceneobjectmanager_1;
    }

    public abstract int method12995(int var1);

    int method12996() {
        return 0;
    }

    public int method12997() {
        return -this.method12995(-812710006);
    }

    abstract boolean method12998(GraphicalRenderer var1);

    abstract boolean method12999();

    abstract boolean method13000();

    abstract boolean method13001();

    abstract boolean method13002();

    public abstract int method13003();

    int method13004(int i_1, int i_2, Node_Sub24[] arr_3) {
        long long_5 = this.aClass206_7970.aLongArrayArrayArray2645[this.plane][i_1][i_2];
        long long_7 = 0L;
        int i_9;
        int i_10;
        for (i_9 = 0; long_7 <= 48L; long_7 += 16L) {
            i_10 = (int) (long_5 >> (int) long_7 & 0xffffL);
            if (i_10 <= 0) {
                break;
            }
            arr_3[i_9++] = this.aClass206_7970.aClass287Array2646[i_10 - 1].aNode_Sub24_3425;
        }
        for (i_10 = i_9; i_10 < 4; i_10++) {
            arr_3[i_10] = null;
        }
        return i_9;
    }

    public abstract int method13005();

    public abstract int method13006();

    void method13008(int i_1, byte b_2) {
        this.boundingBoxPolygons = new EntityNode_Sub5[i_1];
        for (int i_3 = 0; i_3 < this.boundingBoxPolygons.length; i_3++) {
            this.boundingBoxPolygons[i_3] = new EntityNode_Sub5();
        }
    }

    abstract Class285 method13009(GraphicalRenderer var1);

    abstract Class285 method13010(GraphicalRenderer var1);

    abstract boolean method13011();

    abstract void method13012(GraphicalRenderer var1);

    abstract void method13013(GraphicalRenderer var1, Transform_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7);

    abstract void method13015();

    abstract void method13016(GraphicalRenderer var1, Transform_Sub1 var2, int var3, int var4, int var5, boolean var6);

    public abstract int method13017();

    public abstract Class200 method13018(GraphicalRenderer var1);

    public abstract Class200 method13019(GraphicalRenderer var1);

    abstract boolean method13020(GraphicalRenderer var1, int var2, int var3);

    abstract void method13021();

    abstract boolean method13022(GraphicalRenderer var1);

    abstract void method13023(GraphicalRenderer var1);

    abstract int method13024(Node_Sub24[] var1);

    abstract int method13025(Node_Sub24[] var1);

    abstract boolean method13026();

    abstract boolean method13029(byte var1);

    abstract boolean method13030(GraphicalRenderer var1);

    abstract int method13031(Node_Sub24[] var1);

    abstract boolean method13032();

    abstract boolean method13033();

    abstract boolean method13034();

    abstract int method13036(Node_Sub24[] var1);

    abstract boolean method13037(GraphicalRenderer var1, int var2);
}
