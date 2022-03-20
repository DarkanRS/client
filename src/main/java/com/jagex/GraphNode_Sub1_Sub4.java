package com.jagex;

public abstract class GraphNode_Sub1_Sub4 extends GraphNode_Sub1 {

    protected short aShort9611;

    protected short aShort9612;

    GraphNode_Sub1_Sub4(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        super(sceneobjectmanager_1);
        plane = (byte) i_5;
        collisionPlane = (byte) i_6;
        aShort9611 = (short) i_7;
        aShort9612 = (short) i_8;
        method11171(new Vector3(i_2, i_3, i_4));
    }

    @Override
    void method12984() {
        throw new IllegalStateException();
    }

    @Override
    int method13036(GLLight[] arr_1) {
        Vector3 vector3_3 = method11166().coords;
        return method13004((int) vector3_3.x >> aClass206_7970.anInt2592, (int) vector3_3.z >> aClass206_7970.anInt2592, arr_1);
    }

    @Override
    boolean method12988(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        return aClass206_7970.aClass201_2600.method3273(collisionPlane, (int) vector3_2.x >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293, method12995());
    }

    @Override
    boolean method13029() {
        Vector3 vector3_2 = method11166().coords;
        return aClass206_7970.aBoolArrayArray2651[((int) vector3_2.x >> aClass206_7970.anInt2592) - aClass206_7970.anInt2628 + aClass206_7970.anInt2652][((int) vector3_2.z >> aClass206_7970.anInt2592) - aClass206_7970.anInt2629 + aClass206_7970.anInt2652];
    }

    @Override
    int method13024(GLLight[] arr_1) {
        Vector3 vector3_2 = method11166().coords;
        return method13004((int) vector3_2.x >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, arr_1);
    }

    @Override
    void method13013(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    boolean method13037(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_3 = method11166().coords;
        return aClass206_7970.aClass201_2600.method3273(collisionPlane, (int) vector3_3.x >> aClass206_7970.anInt2592, (int) vector3_3.z >> aClass206_7970.anInt2592, method12995());
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
    void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
        throw new IllegalStateException();
    }

    @Override
    int method13025(GLLight[] arr_1) {
        Vector3 vector3_2 = method11166().coords;
        return method13004((int) vector3_2.x >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, arr_1);
    }

    @Override
    void method13015() {
        throw new IllegalStateException();
    }

    @Override
    boolean method13034() {
        Vector3 vector3_1 = method11166().coords;
        return aClass206_7970.aBoolArrayArray2651[aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (((int) vector3_1.x >> -1928575293 * aClass206_7970.anInt2592 * -2000283157) - aClass206_7970.anInt2628 * 453572397 * -527863643)][1459994833 * aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> -1928575293 * aClass206_7970.anInt2592 * -2000283157) - 1580412859 * aClass206_7970.anInt2629 * -1765393037)];
    }

    @Override
    boolean method12985() {
        return false;
    }

    @Override
    int method13031(GLLight[] arr_1) {
        Vector3 vector3_2 = method11166().coords;
        return method13004((int) vector3_2.x >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, arr_1);
    }

    @Override
    int method12982(GLLight[] arr_1) {
        Vector3 vector3_2 = method11166().coords;
        return method13004((int) vector3_2.x >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, arr_1);
    }

    @Override
    boolean method13022(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        return aClass206_7970.aClass201_2600.method3273(collisionPlane, (int) vector3_2.x >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293, method12995());
    }

    @Override
    void method13021() {
        throw new IllegalStateException();
    }

    @Override
    boolean method12998(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        return aClass206_7970.aClass201_2600.method3273(collisionPlane, (int) vector3_2.x >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293, method12995());
    }

    @Override
    boolean method13032() {
        Vector3 vector3_1 = method11166().coords;
        return aClass206_7970.aBoolArrayArray2651[aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (((int) vector3_1.x >> -1928575293 * aClass206_7970.anInt2592 * -2000283157) - aClass206_7970.anInt2628 * 453572397 * -527863643)][1459994833 * aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> -1928575293 * aClass206_7970.anInt2592 * -2000283157) - 1580412859 * aClass206_7970.anInt2629 * -1765393037)];
    }

    @Override
    boolean method13033() {
        Vector3 vector3_1 = method11166().coords;
        return aClass206_7970.aBoolArrayArray2651[aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (((int) vector3_1.x >> -1928575293 * aClass206_7970.anInt2592 * -2000283157) - aClass206_7970.anInt2628 * 453572397 * -527863643)][1459994833 * aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> -1928575293 * aClass206_7970.anInt2592 * -2000283157) - 1580412859 * aClass206_7970.anInt2629 * -1765393037)];
    }

    @Override
    boolean method13030(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = method11166().coords;
        return aClass206_7970.aClass201_2600.method3273(collisionPlane, (int) vector3_2.x >> -1928575293 * aClass206_7970.anInt2592 * -2000283157, (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293, method12995());
    }
}
