package com.jagex;

public abstract class GraphNode_Sub1_Sub2 extends GraphNode_Sub1 {

    static int anInt9461;

    GraphNode_Sub1_Sub2(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        super(sceneobjectmanager_1);
        plane = (byte) i_5;
        collisionPlane = (byte) i_6;
        method11171(new Vector3(i_2, i_3, i_4));
    }

    @Override
    boolean method13030(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        Class208 class208_3 = aClass206_7970.method3507(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592);
        return class208_3 != null && class208_3.aTransform_Sub1_Sub1_2659.aBool9459 ? aClass206_7970.aClass201_2600.method3273(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592, class208_3.aTransform_Sub1_Sub1_2659.method12995() + method12995()) : aClass206_7970.aClass201_2600.method3271(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592);
    }

    @Override
    void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    boolean method13033() {
        Vector3 vector3_1 = method11166().coords;
        return aClass206_7970.aBoolArrayArray2651[((int) vector3_1.x >> aClass206_7970.anInt2592) - aClass206_7970.anInt2628 * aClass206_7970.anInt2652][aClass206_7970.anInt2652 + (((int) vector3_1.z >> aClass206_7970.anInt2592) - aClass206_7970.anInt2629)];
    }

    @Override
    boolean method13029() {
        Vector3 vector3_2 = method11166().coords;
        return aClass206_7970.aBoolArrayArray2651[((int) vector3_2.x >> aClass206_7970.anInt2592) - aClass206_7970.anInt2628 + aClass206_7970.anInt2652][((int) vector3_2.z >> aClass206_7970.anInt2592) - aClass206_7970.anInt2629 + aClass206_7970.anInt2652];
    }

    @Override
    boolean method12985() {
        return false;
    }

    @Override
    void method13013(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    void method12984() {
        throw new IllegalStateException();
    }

    @Override
    boolean method13026() {
        return false;
    }

    @Override
    boolean method13011() {
        return false;
    }

    @Override
    boolean method12988(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        Class208 class208_3 = aClass206_7970.method3507(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592);
        return class208_3 != null && class208_3.aTransform_Sub1_Sub1_2659.aBool9459 ? aClass206_7970.aClass201_2600.method3273(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592, class208_3.aTransform_Sub1_Sub1_2659.method12995() + method12995()) : aClass206_7970.aClass201_2600.method3271(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592);
    }

    @Override
    void method13015() {
        throw new IllegalStateException();
    }

    @Override
    boolean method13034() {
        Vector3 vector3_1 = method11166().coords;
        return aClass206_7970.aBoolArrayArray2651[((int) vector3_1.x >> aClass206_7970.anInt2592) - aClass206_7970.anInt2628 * aClass206_7970.anInt2652][aClass206_7970.anInt2652 + (((int) vector3_1.z >> aClass206_7970.anInt2592) - aClass206_7970.anInt2629)];
    }

    @Override
    int method13024(Node_Sub24[] arr_1) {
        Vector3 vector3_2 = method11166().coords;
        return method13004((int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592, arr_1);
    }

    @Override
    int method13025(Node_Sub24[] arr_1) {
        Vector3 vector3_2 = method11166().coords;
        return method13004((int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592, arr_1);
    }

    @Override
    int method13031(Node_Sub24[] arr_1) {
        Vector3 vector3_2 = method11166().coords;
        return method13004((int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592, arr_1);
    }

    @Override
    int method12982(Node_Sub24[] arr_1) {
        Vector3 vector3_2 = method11166().coords;
        return method13004((int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592, arr_1);
    }

    @Override
    void method13021() {
        throw new IllegalStateException();
    }

    @Override
    int method13036(Node_Sub24[] arr_1) {
        Vector3 vector3_3 = method11166().coords;
        return method13004((int) vector3_3.x >> aClass206_7970.anInt2592, (int) vector3_3.z >> aClass206_7970.anInt2592, arr_1);
    }

    @Override
    boolean method13022(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        Class208 class208_3 = aClass206_7970.method3507(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592);
        return class208_3 != null && class208_3.aTransform_Sub1_Sub1_2659.aBool9459 ? aClass206_7970.aClass201_2600.method3273(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592, class208_3.aTransform_Sub1_Sub1_2659.method12995() + method12995()) : aClass206_7970.aClass201_2600.method3271(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592);
    }

    @Override
    boolean method13032() {
        Vector3 vector3_1 = method11166().coords;
        return aClass206_7970.aBoolArrayArray2651[((int) vector3_1.x >> aClass206_7970.anInt2592) - aClass206_7970.anInt2628 * aClass206_7970.anInt2652][aClass206_7970.anInt2652 + (((int) vector3_1.z >> aClass206_7970.anInt2592) - aClass206_7970.anInt2629)];
    }

    @Override
    boolean method13037(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_3 = method11166().coords;
        Class208 class208_4 = aClass206_7970.method3507(plane, (int) vector3_3.x >> aClass206_7970.anInt2592, (int) vector3_3.z >> aClass206_7970.anInt2592);
        return class208_4 != null && class208_4.aTransform_Sub1_Sub1_2659.aBool9459 ? aClass206_7970.aClass201_2600.method3273(plane, (int) vector3_3.x >> aClass206_7970.anInt2592, (int) vector3_3.z >> aClass206_7970.anInt2592, class208_4.aTransform_Sub1_Sub1_2659.method12995() + method12995()) : aClass206_7970.aClass201_2600.method3271(plane, (int) vector3_3.x >> aClass206_7970.anInt2592, (int) vector3_3.z >> aClass206_7970.anInt2592);
    }

    @Override
    boolean method12998(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        Class208 class208_3 = aClass206_7970.method3507(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592);
        return class208_3 != null && class208_3.aTransform_Sub1_Sub1_2659.aBool9459 ? aClass206_7970.aClass201_2600.method3273(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592, class208_3.aTransform_Sub1_Sub1_2659.method12995() + method12995()) : aClass206_7970.aClass201_2600.method3271(plane, (int) vector3_2.x >> aClass206_7970.anInt2592, (int) vector3_2.z >> aClass206_7970.anInt2592);
    }

}
