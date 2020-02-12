package com.jagex;

public abstract class Transform_Sub1_Sub5 extends Transform_Sub1 {

    static int[] anIntArray9618 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
    public short aShort9615;

    boolean method12988(GraphicalRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = this.method11166().coords;
        return this.aClass206_7970.aClass201_2600.method3275(this, this.collisionPlane, (int) vector3_2.x >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293, (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293);
    }

    int method13025(Node_Sub24[] arr_1) {
        Vector3 vector3_2 = this.method11166().coords;
        int i_3 = (int) vector3_2.x >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293;
        int i_4 = (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293;
        int i_5 = 0;
        if (-527863643 * this.aClass206_7970.anInt2628 * 453572397 == i_3) {
            ++i_5;
        } else if (this.aClass206_7970.anInt2628 * 453572397 * -527863643 < i_3) {
            i_5 += 2;
        }

        if (i_4 == 1580412859 * this.aClass206_7970.anInt2629 * -1765393037) {
            i_5 += 3;
        } else if (1580412859 * this.aClass206_7970.anInt2629 * -1765393037 > i_4) {
            i_5 += 6;
        }

        int i_6 = anIntArray9618[i_5];
        if ((this.aShort9615 & i_6) != 0) {
            return this.method13004(i_3, i_4, arr_1);
        } else if (this.aShort9615 == 1 && i_3 > 0) {
            return this.method13004(i_3 - 1, i_4, arr_1);
        } else if (this.aShort9615 == 4 && i_3 <= this.aClass206_7970.sizeX * 537410607 * -1912960305) {
            return this.method13004(i_3 + 1, i_4, arr_1);
        } else if (this.aShort9615 == 8 && i_4 > 0) {
            return this.method13004(i_3, i_4 - 1, arr_1);
        } else if (this.aShort9615 == 2 && i_4 <= -18177099 * this.aClass206_7970.sizeY * 1850176157) {
            return this.method13004(i_3, 1 + i_4, arr_1);
        } else if (this.aShort9615 == 16 && i_3 > 0 && i_4 <= this.aClass206_7970.sizeY * 1850176157 * -18177099) {
            return this.method13004(i_3 - 1, i_4 + 1, arr_1);
        } else if (this.aShort9615 == 32 && i_3 <= -1912960305 * this.aClass206_7970.sizeX * 537410607 && i_4 <= -18177099 * this.aClass206_7970.sizeY * 1850176157) {
            return this.method13004(i_3 + 1, 1 + i_4, arr_1);
        } else if (this.aShort9615 == 128 && i_3 > 0 && i_4 > 0) {
            return this.method13004(i_3 - 1, i_4 - 1, arr_1);
        } else if (this.aShort9615 == 64 && i_3 <= -1912960305 * this.aClass206_7970.sizeX * 537410607 && i_4 > 0) {
            return this.method13004(1 + i_3, i_4 - 1, arr_1);
        } else {
            throw new RuntimeException("");
        }
    }

    boolean method13037(GraphicalRenderer graphicalrenderer_1, int i_2) {
        Vector3 vector3_3 = this.method11166().coords;
        return this.aClass206_7970.aClass201_2600.method3275(this, this.collisionPlane, (int) vector3_3.x >> this.aClass206_7970.anInt2592, (int) vector3_3.z >> this.aClass206_7970.anInt2592);
    }

    boolean method13029(byte b_1) {
        Vector3 vector3_2 = this.method11166().coords;
        return this.aClass206_7970.aBoolArrayArray2651[((int) vector3_2.x >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2628 + this.aClass206_7970.anInt2652][((int) vector3_2.z >> this.aClass206_7970.anInt2592) - this.aClass206_7970.anInt2629 + this.aClass206_7970.anInt2652];
    }

    int method13036(Node_Sub24[] arr_1) {
        Vector3 vector3_3 = this.method11166().coords;
        int i_4 = (int) vector3_3.x >> this.aClass206_7970.anInt2592;
        int i_5 = (int) vector3_3.z >> this.aClass206_7970.anInt2592;
        int i_6 = 0;
        if (this.aClass206_7970.anInt2628 == i_4) {
            ++i_6;
        } else if (this.aClass206_7970.anInt2628 < i_4) {
            i_6 += 2;
        }

        if (this.aClass206_7970.anInt2629 == i_5) {
            i_6 += 3;
        } else if (this.aClass206_7970.anInt2629 > i_5) {
            i_6 += 6;
        }

        int i_7 = anIntArray9618[i_6];
        if ((this.aShort9615 & i_7) != 0) {
            return this.method13004(i_4, i_5, arr_1);
        } else if (this.aShort9615 == 1 && i_4 > 0) {
            return this.method13004(i_4 - 1, i_5, arr_1);
        } else if (this.aShort9615 == 4 && i_4 <= this.aClass206_7970.sizeX) {
            return this.method13004(i_4 + 1, i_5, arr_1);
        } else if (this.aShort9615 == 8 && i_5 > 0) {
            return this.method13004(i_4, i_5 - 1, arr_1);
        } else if (this.aShort9615 == 2 && i_5 <= this.aClass206_7970.sizeY) {
            return this.method13004(i_4, i_5 + 1, arr_1);
        } else if (this.aShort9615 == 16 && i_4 > 0 && i_5 <= this.aClass206_7970.sizeY) {
            return this.method13004(i_4 - 1, i_5 + 1, arr_1);
        } else if (this.aShort9615 == 32 && i_4 <= this.aClass206_7970.sizeX && i_5 <= this.aClass206_7970.sizeY) {
            return this.method13004(i_4 + 1, i_5 + 1, arr_1);
        } else if (this.aShort9615 == 128 && i_4 > 0 && i_5 > 0) {
            return this.method13004(i_4 - 1, i_5 - 1, arr_1);
        } else if (this.aShort9615 == 64 && i_4 <= this.aClass206_7970.sizeX && i_5 > 0) {
            return this.method13004(i_4 + 1, i_5 - 1, arr_1);
        } else {
            throw new RuntimeException("");
        }
    }

    boolean method13034() {
        Vector3 vector3_1 = this.method11166().coords;
        return this.aClass206_7970.aBoolArrayArray2651[this.aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (((int) vector3_1.x >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293) - -527863643 * this.aClass206_7970.anInt2628 * 453572397)][1459994833 * this.aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293) - this.aClass206_7970.anInt2629 * -1765393037 * 1580412859)];
    }

    Transform_Sub1_Sub5(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        super(sceneobjectmanager_1);
        this.plane = (byte) i_5;
        this.collisionPlane = (byte) i_6;
        this.aShort9615 = (short) i_7;
        this.method11171(new Vector3((float) i_2, (float) i_3, (float) i_4));
    }

    boolean method12998(GraphicalRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = this.method11166().coords;
        return this.aClass206_7970.aClass201_2600.method3275(this, this.collisionPlane, (int) vector3_2.x >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293, (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293);
    }

    boolean method13022(GraphicalRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = this.method11166().coords;
        return this.aClass206_7970.aClass201_2600.method3275(this, this.collisionPlane, (int) vector3_2.x >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293, (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293);
    }

    int method13031(Node_Sub24[] arr_1) {
        Vector3 vector3_2 = this.method11166().coords;
        int i_3 = (int) vector3_2.x >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293;
        int i_4 = (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293;
        int i_5 = 0;
        if (-527863643 * this.aClass206_7970.anInt2628 * 453572397 == i_3) {
            ++i_5;
        } else if (this.aClass206_7970.anInt2628 * 453572397 * -527863643 < i_3) {
            i_5 += 2;
        }

        if (i_4 == 1580412859 * this.aClass206_7970.anInt2629 * -1765393037) {
            i_5 += 3;
        } else if (1580412859 * this.aClass206_7970.anInt2629 * -1765393037 > i_4) {
            i_5 += 6;
        }

        int i_6 = anIntArray9618[i_5];
        if ((this.aShort9615 & i_6) != 0) {
            return this.method13004(i_3, i_4, arr_1);
        } else if (this.aShort9615 == 1 && i_3 > 0) {
            return this.method13004(i_3 - 1, i_4, arr_1);
        } else if (this.aShort9615 == 4 && i_3 <= this.aClass206_7970.sizeX * 537410607 * -1912960305) {
            return this.method13004(i_3 + 1, i_4, arr_1);
        } else if (this.aShort9615 == 8 && i_4 > 0) {
            return this.method13004(i_3, i_4 - 1, arr_1);
        } else if (this.aShort9615 == 2 && i_4 <= -18177099 * this.aClass206_7970.sizeY * 1850176157) {
            return this.method13004(i_3, 1 + i_4, arr_1);
        } else if (this.aShort9615 == 16 && i_3 > 0 && i_4 <= this.aClass206_7970.sizeY * 1850176157 * -18177099) {
            return this.method13004(i_3 - 1, i_4 + 1, arr_1);
        } else if (this.aShort9615 == 32 && i_3 <= -1912960305 * this.aClass206_7970.sizeX * 537410607 && i_4 <= -18177099 * this.aClass206_7970.sizeY * 1850176157) {
            return this.method13004(i_3 + 1, 1 + i_4, arr_1);
        } else if (this.aShort9615 == 128 && i_3 > 0 && i_4 > 0) {
            return this.method13004(i_3 - 1, i_4 - 1, arr_1);
        } else if (this.aShort9615 == 64 && i_3 <= -1912960305 * this.aClass206_7970.sizeX * 537410607 && i_4 > 0) {
            return this.method13004(1 + i_3, i_4 - 1, arr_1);
        } else {
            throw new RuntimeException("");
        }
    }

    boolean method13030(GraphicalRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = this.method11166().coords;
        return this.aClass206_7970.aClass201_2600.method3275(this, this.collisionPlane, (int) vector3_2.x >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293, (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293);
    }

    int method13024(Node_Sub24[] arr_1) {
        Vector3 vector3_2 = this.method11166().coords;
        int i_3 = (int) vector3_2.x >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293;
        int i_4 = (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293;
        int i_5 = 0;
        if (-527863643 * this.aClass206_7970.anInt2628 * 453572397 == i_3) {
            ++i_5;
        } else if (this.aClass206_7970.anInt2628 * 453572397 * -527863643 < i_3) {
            i_5 += 2;
        }

        if (i_4 == 1580412859 * this.aClass206_7970.anInt2629 * -1765393037) {
            i_5 += 3;
        } else if (1580412859 * this.aClass206_7970.anInt2629 * -1765393037 > i_4) {
            i_5 += 6;
        }

        int i_6 = anIntArray9618[i_5];
        if ((this.aShort9615 & i_6) != 0) {
            return this.method13004(i_3, i_4, arr_1);
        } else if (this.aShort9615 == 1 && i_3 > 0) {
            return this.method13004(i_3 - 1, i_4, arr_1);
        } else if (this.aShort9615 == 4 && i_3 <= this.aClass206_7970.sizeX * 537410607 * -1912960305) {
            return this.method13004(i_3 + 1, i_4, arr_1);
        } else if (this.aShort9615 == 8 && i_4 > 0) {
            return this.method13004(i_3, i_4 - 1, arr_1);
        } else if (this.aShort9615 == 2 && i_4 <= -18177099 * this.aClass206_7970.sizeY * 1850176157) {
            return this.method13004(i_3, 1 + i_4, arr_1);
        } else if (this.aShort9615 == 16 && i_3 > 0 && i_4 <= this.aClass206_7970.sizeY * 1850176157 * -18177099) {
            return this.method13004(i_3 - 1, i_4 + 1, arr_1);
        } else if (this.aShort9615 == 32 && i_3 <= -1912960305 * this.aClass206_7970.sizeX * 537410607 && i_4 <= -18177099 * this.aClass206_7970.sizeY * 1850176157) {
            return this.method13004(i_3 + 1, 1 + i_4, arr_1);
        } else if (this.aShort9615 == 128 && i_3 > 0 && i_4 > 0) {
            return this.method13004(i_3 - 1, i_4 - 1, arr_1);
        } else if (this.aShort9615 == 64 && i_3 <= -1912960305 * this.aClass206_7970.sizeX * 537410607 && i_4 > 0) {
            return this.method13004(1 + i_3, i_4 - 1, arr_1);
        } else {
            throw new RuntimeException("");
        }
    }

    boolean method13032() {
        Vector3 vector3_1 = this.method11166().coords;
        return this.aClass206_7970.aBoolArrayArray2651[this.aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (((int) vector3_1.x >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293) - -527863643 * this.aClass206_7970.anInt2628 * 453572397)][1459994833 * this.aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293) - this.aClass206_7970.anInt2629 * -1765393037 * 1580412859)];
    }

    boolean method13033() {
        Vector3 vector3_1 = this.method11166().coords;
        return this.aClass206_7970.aBoolArrayArray2651[this.aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (((int) vector3_1.x >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293) - -527863643 * this.aClass206_7970.anInt2628 * 453572397)][1459994833 * this.aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293) - this.aClass206_7970.anInt2629 * -1765393037 * 1580412859)];
    }

    int method12982(Node_Sub24[] arr_1) {
        Vector3 vector3_2 = this.method11166().coords;
        int i_3 = (int) vector3_2.x >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293;
        int i_4 = (int) vector3_2.z >> this.aClass206_7970.anInt2592 * -2000283157 * -1928575293;
        int i_5 = 0;
        if (-527863643 * this.aClass206_7970.anInt2628 * 453572397 == i_3) {
            ++i_5;
        } else if (this.aClass206_7970.anInt2628 * 453572397 * -527863643 < i_3) {
            i_5 += 2;
        }

        if (i_4 == 1580412859 * this.aClass206_7970.anInt2629 * -1765393037) {
            i_5 += 3;
        } else if (1580412859 * this.aClass206_7970.anInt2629 * -1765393037 > i_4) {
            i_5 += 6;
        }

        int i_6 = anIntArray9618[i_5];
        if ((this.aShort9615 & i_6) != 0) {
            return this.method13004(i_3, i_4, arr_1);
        } else if (this.aShort9615 == 1 && i_3 > 0) {
            return this.method13004(i_3 - 1, i_4, arr_1);
        } else if (this.aShort9615 == 4 && i_3 <= this.aClass206_7970.sizeX * 537410607 * -1912960305) {
            return this.method13004(i_3 + 1, i_4, arr_1);
        } else if (this.aShort9615 == 8 && i_4 > 0) {
            return this.method13004(i_3, i_4 - 1, arr_1);
        } else if (this.aShort9615 == 2 && i_4 <= -18177099 * this.aClass206_7970.sizeY * 1850176157) {
            return this.method13004(i_3, 1 + i_4, arr_1);
        } else if (this.aShort9615 == 16 && i_3 > 0 && i_4 <= this.aClass206_7970.sizeY * 1850176157 * -18177099) {
            return this.method13004(i_3 - 1, i_4 + 1, arr_1);
        } else if (this.aShort9615 == 32 && i_3 <= -1912960305 * this.aClass206_7970.sizeX * 537410607 && i_4 <= -18177099 * this.aClass206_7970.sizeY * 1850176157) {
            return this.method13004(i_3 + 1, 1 + i_4, arr_1);
        } else if (this.aShort9615 == 128 && i_3 > 0 && i_4 > 0) {
            return this.method13004(i_3 - 1, i_4 - 1, arr_1);
        } else if (this.aShort9615 == 64 && i_3 <= -1912960305 * this.aClass206_7970.sizeX * 537410607 && i_4 > 0) {
            return this.method13004(1 + i_3, i_4 - 1, arr_1);
        } else {
            throw new RuntimeException("");
        }
    }

}
