package com.rs.jagex;

public abstract class GraphNode_Sub1_Sub5 extends GraphNode_Sub1 {

	static int[] anIntArray9618 = {19, 55, 38, 155, 255, 110, 137, 205, 76};
	public short aShort9615;

	GraphNode_Sub1_Sub5(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		super(sceneobjectmanager_1);
		plane = (byte) i_5;
		collisionPlane = (byte) i_6;
		aShort9615 = (short) i_7;
		method11171(new Vector3(i_2, i_3, i_4));
	}

	@Override
	int method12982(GLLight[] arr_1) {
		Vector3 vector3_2 = method11166().coords;
		int i_3 = (int) vector3_2.x >> aClass206_7970.anInt2592 * -2000283157 * -1928575293;
		int i_4 = (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293;
		int i_5 = 0;
		if (-527863643 * aClass206_7970.anInt2628 * 453572397 == i_3)
			++i_5;
		else if (aClass206_7970.anInt2628 * 453572397 * -527863643 < i_3)
			i_5 += 2;

		if (i_4 == 1580412859 * aClass206_7970.anInt2629 * -1765393037)
			i_5 += 3;
		else if (1580412859 * aClass206_7970.anInt2629 * -1765393037 > i_4)
			i_5 += 6;

		int i_6 = anIntArray9618[i_5];
		if ((aShort9615 & i_6) != 0)
			return method13004(i_3, i_4, arr_1);
		if (aShort9615 == 1 && i_3 > 0)
			return method13004(i_3 - 1, i_4, arr_1);
		else if (aShort9615 == 4 && i_3 <= aClass206_7970.sizeX * 537410607 * -1912960305)
			return method13004(i_3 + 1, i_4, arr_1);
		else if (aShort9615 == 8 && i_4 > 0)
			return method13004(i_3, i_4 - 1, arr_1);
		else if (aShort9615 == 2 && i_4 <= -18177099 * aClass206_7970.sizeY * 1850176157)
			return method13004(i_3, 1 + i_4, arr_1);
		else if (aShort9615 == 16 && i_3 > 0 && i_4 <= aClass206_7970.sizeY * 1850176157 * -18177099)
			return method13004(i_3 - 1, i_4 + 1, arr_1);
		else if (aShort9615 == 32 && i_3 <= -1912960305 * aClass206_7970.sizeX * 537410607 && i_4 <= -18177099 * aClass206_7970.sizeY * 1850176157)
			return method13004(i_3 + 1, 1 + i_4, arr_1);
		else if (aShort9615 == 128 && i_3 > 0 && i_4 > 0)
			return method13004(i_3 - 1, i_4 - 1, arr_1);
		else if (aShort9615 == 64 && i_3 <= -1912960305 * aClass206_7970.sizeX * 537410607 && i_4 > 0)
			return method13004(1 + i_3, i_4 - 1, arr_1);
		else
			throw new RuntimeException("");
	}

	@Override
	boolean method12988(AbstractRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = method11166().coords;
		return aClass206_7970.aClass201_2600.method3275(this, collisionPlane, (int) vector3_2.x >> aClass206_7970.anInt2592 * -2000283157 * -1928575293, (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293);
	}

	@Override
	boolean method12998(AbstractRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = method11166().coords;
		return aClass206_7970.aClass201_2600.method3275(this, collisionPlane, (int) vector3_2.x >> aClass206_7970.anInt2592 * -2000283157 * -1928575293, (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293);
	}

	@Override
	boolean method13022(AbstractRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = method11166().coords;
		return aClass206_7970.aClass201_2600.method3275(this, collisionPlane, (int) vector3_2.x >> aClass206_7970.anInt2592 * -2000283157 * -1928575293, (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293);
	}

	@Override
	int method13024(GLLight[] arr_1) {
		Vector3 vector3_2 = method11166().coords;
		int i_3 = (int) vector3_2.x >> aClass206_7970.anInt2592 * -2000283157 * -1928575293;
		int i_4 = (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293;
		int i_5 = 0;
		if (-527863643 * aClass206_7970.anInt2628 * 453572397 == i_3)
			++i_5;
		else if (aClass206_7970.anInt2628 * 453572397 * -527863643 < i_3)
			i_5 += 2;

		if (i_4 == 1580412859 * aClass206_7970.anInt2629 * -1765393037)
			i_5 += 3;
		else if (1580412859 * aClass206_7970.anInt2629 * -1765393037 > i_4)
			i_5 += 6;

		int i_6 = anIntArray9618[i_5];
		if ((aShort9615 & i_6) != 0)
			return method13004(i_3, i_4, arr_1);
		if (aShort9615 == 1 && i_3 > 0)
			return method13004(i_3 - 1, i_4, arr_1);
		else if (aShort9615 == 4 && i_3 <= aClass206_7970.sizeX * 537410607 * -1912960305)
			return method13004(i_3 + 1, i_4, arr_1);
		else if (aShort9615 == 8 && i_4 > 0)
			return method13004(i_3, i_4 - 1, arr_1);
		else if (aShort9615 == 2 && i_4 <= -18177099 * aClass206_7970.sizeY * 1850176157)
			return method13004(i_3, 1 + i_4, arr_1);
		else if (aShort9615 == 16 && i_3 > 0 && i_4 <= aClass206_7970.sizeY * 1850176157 * -18177099)
			return method13004(i_3 - 1, i_4 + 1, arr_1);
		else if (aShort9615 == 32 && i_3 <= -1912960305 * aClass206_7970.sizeX * 537410607 && i_4 <= -18177099 * aClass206_7970.sizeY * 1850176157)
			return method13004(i_3 + 1, 1 + i_4, arr_1);
		else if (aShort9615 == 128 && i_3 > 0 && i_4 > 0)
			return method13004(i_3 - 1, i_4 - 1, arr_1);
		else if (aShort9615 == 64 && i_3 <= -1912960305 * aClass206_7970.sizeX * 537410607 && i_4 > 0)
			return method13004(1 + i_3, i_4 - 1, arr_1);
		else
			throw new RuntimeException("");
	}

	@Override
	int method13025(GLLight[] arr_1) {
		Vector3 vector3_2 = method11166().coords;
		int i_3 = (int) vector3_2.x >> aClass206_7970.anInt2592 * -2000283157 * -1928575293;
		int i_4 = (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293;
		int i_5 = 0;
		if (-527863643 * aClass206_7970.anInt2628 * 453572397 == i_3)
			++i_5;
		else if (aClass206_7970.anInt2628 * 453572397 * -527863643 < i_3)
			i_5 += 2;

		if (i_4 == 1580412859 * aClass206_7970.anInt2629 * -1765393037)
			i_5 += 3;
		else if (1580412859 * aClass206_7970.anInt2629 * -1765393037 > i_4)
			i_5 += 6;

		int i_6 = anIntArray9618[i_5];
		if ((aShort9615 & i_6) != 0)
			return method13004(i_3, i_4, arr_1);
		if (aShort9615 == 1 && i_3 > 0)
			return method13004(i_3 - 1, i_4, arr_1);
		else if (aShort9615 == 4 && i_3 <= aClass206_7970.sizeX * 537410607 * -1912960305)
			return method13004(i_3 + 1, i_4, arr_1);
		else if (aShort9615 == 8 && i_4 > 0)
			return method13004(i_3, i_4 - 1, arr_1);
		else if (aShort9615 == 2 && i_4 <= -18177099 * aClass206_7970.sizeY * 1850176157)
			return method13004(i_3, 1 + i_4, arr_1);
		else if (aShort9615 == 16 && i_3 > 0 && i_4 <= aClass206_7970.sizeY * 1850176157 * -18177099)
			return method13004(i_3 - 1, i_4 + 1, arr_1);
		else if (aShort9615 == 32 && i_3 <= -1912960305 * aClass206_7970.sizeX * 537410607 && i_4 <= -18177099 * aClass206_7970.sizeY * 1850176157)
			return method13004(i_3 + 1, 1 + i_4, arr_1);
		else if (aShort9615 == 128 && i_3 > 0 && i_4 > 0)
			return method13004(i_3 - 1, i_4 - 1, arr_1);
		else if (aShort9615 == 64 && i_3 <= -1912960305 * aClass206_7970.sizeX * 537410607 && i_4 > 0)
			return method13004(1 + i_3, i_4 - 1, arr_1);
		else
			throw new RuntimeException("");
	}

	@Override
	boolean method13029() {
		Vector3 vector3_2 = method11166().coords;
		return aClass206_7970.aBoolArrayArray2651[((int) vector3_2.x >> aClass206_7970.anInt2592) - aClass206_7970.anInt2628 + aClass206_7970.anInt2652][((int) vector3_2.z >> aClass206_7970.anInt2592) - aClass206_7970.anInt2629 + aClass206_7970.anInt2652];
	}

	@Override
	boolean method13030(AbstractRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = method11166().coords;
		return aClass206_7970.aClass201_2600.method3275(this, collisionPlane, (int) vector3_2.x >> aClass206_7970.anInt2592 * -2000283157 * -1928575293, (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293);
	}

	@Override
	int method13031(GLLight[] arr_1) {
		Vector3 vector3_2 = method11166().coords;
		int i_3 = (int) vector3_2.x >> aClass206_7970.anInt2592 * -2000283157 * -1928575293;
		int i_4 = (int) vector3_2.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293;
		int i_5 = 0;
		if (-527863643 * aClass206_7970.anInt2628 * 453572397 == i_3)
			++i_5;
		else if (aClass206_7970.anInt2628 * 453572397 * -527863643 < i_3)
			i_5 += 2;

		if (i_4 == 1580412859 * aClass206_7970.anInt2629 * -1765393037)
			i_5 += 3;
		else if (1580412859 * aClass206_7970.anInt2629 * -1765393037 > i_4)
			i_5 += 6;

		int i_6 = anIntArray9618[i_5];
		if ((aShort9615 & i_6) != 0)
			return method13004(i_3, i_4, arr_1);
		if (aShort9615 == 1 && i_3 > 0)
			return method13004(i_3 - 1, i_4, arr_1);
		else if (aShort9615 == 4 && i_3 <= aClass206_7970.sizeX * 537410607 * -1912960305)
			return method13004(i_3 + 1, i_4, arr_1);
		else if (aShort9615 == 8 && i_4 > 0)
			return method13004(i_3, i_4 - 1, arr_1);
		else if (aShort9615 == 2 && i_4 <= -18177099 * aClass206_7970.sizeY * 1850176157)
			return method13004(i_3, 1 + i_4, arr_1);
		else if (aShort9615 == 16 && i_3 > 0 && i_4 <= aClass206_7970.sizeY * 1850176157 * -18177099)
			return method13004(i_3 - 1, i_4 + 1, arr_1);
		else if (aShort9615 == 32 && i_3 <= -1912960305 * aClass206_7970.sizeX * 537410607 && i_4 <= -18177099 * aClass206_7970.sizeY * 1850176157)
			return method13004(i_3 + 1, 1 + i_4, arr_1);
		else if (aShort9615 == 128 && i_3 > 0 && i_4 > 0)
			return method13004(i_3 - 1, i_4 - 1, arr_1);
		else if (aShort9615 == 64 && i_3 <= -1912960305 * aClass206_7970.sizeX * 537410607 && i_4 > 0)
			return method13004(1 + i_3, i_4 - 1, arr_1);
		else
			throw new RuntimeException("");
	}

	@Override
	boolean method13032() {
		Vector3 vector3_1 = method11166().coords;
		return aClass206_7970.aBoolArrayArray2651[aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (((int) vector3_1.x >> aClass206_7970.anInt2592 * -2000283157 * -1928575293) - -527863643 * aClass206_7970.anInt2628 * 453572397)][1459994833 * aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293) - aClass206_7970.anInt2629 * -1765393037 * 1580412859)];
	}

	@Override
	boolean method13033() {
		Vector3 vector3_1 = method11166().coords;
		return aClass206_7970.aBoolArrayArray2651[aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (((int) vector3_1.x >> aClass206_7970.anInt2592 * -2000283157 * -1928575293) - -527863643 * aClass206_7970.anInt2628 * 453572397)][1459994833 * aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293) - aClass206_7970.anInt2629 * -1765393037 * 1580412859)];
	}

	@Override
	boolean method13034() {
		Vector3 vector3_1 = method11166().coords;
		return aClass206_7970.aBoolArrayArray2651[aClass206_7970.anInt2652 * 1632278577 * 1459994833 + (((int) vector3_1.x >> aClass206_7970.anInt2592 * -2000283157 * -1928575293) - -527863643 * aClass206_7970.anInt2628 * 453572397)][1459994833 * aClass206_7970.anInt2652 * 1632278577 + (((int) vector3_1.z >> aClass206_7970.anInt2592 * -2000283157 * -1928575293) - aClass206_7970.anInt2629 * -1765393037 * 1580412859)];
	}

	@Override
	int method13036(GLLight[] arr_1) {
		Vector3 vector3_3 = method11166().coords;
		int i_4 = (int) vector3_3.x >> aClass206_7970.anInt2592;
		int i_5 = (int) vector3_3.z >> aClass206_7970.anInt2592;
		int i_6 = 0;
		if (aClass206_7970.anInt2628 == i_4)
			++i_6;
		else if (aClass206_7970.anInt2628 < i_4)
			i_6 += 2;

		if (aClass206_7970.anInt2629 == i_5)
			i_6 += 3;
		else if (aClass206_7970.anInt2629 > i_5)
			i_6 += 6;

		int i_7 = anIntArray9618[i_6];
		if ((aShort9615 & i_7) != 0)
			return method13004(i_4, i_5, arr_1);
		if (aShort9615 == 1 && i_4 > 0)
			return method13004(i_4 - 1, i_5, arr_1);
		else if (aShort9615 == 4 && i_4 <= aClass206_7970.sizeX)
			return method13004(i_4 + 1, i_5, arr_1);
		else if (aShort9615 == 8 && i_5 > 0)
			return method13004(i_4, i_5 - 1, arr_1);
		else if (aShort9615 == 2 && i_5 <= aClass206_7970.sizeY)
			return method13004(i_4, i_5 + 1, arr_1);
		else if (aShort9615 == 16 && i_4 > 0 && i_5 <= aClass206_7970.sizeY)
			return method13004(i_4 - 1, i_5 + 1, arr_1);
		else if (aShort9615 == 32 && i_4 <= aClass206_7970.sizeX && i_5 <= aClass206_7970.sizeY)
			return method13004(i_4 + 1, i_5 + 1, arr_1);
		else if (aShort9615 == 128 && i_4 > 0 && i_5 > 0)
			return method13004(i_4 - 1, i_5 - 1, arr_1);
		else if (aShort9615 == 64 && i_4 <= aClass206_7970.sizeX && i_5 > 0)
			return method13004(i_4 + 1, i_5 - 1, arr_1);
		else
			throw new RuntimeException("");
	}

	@Override
	boolean method13037(AbstractRenderer graphicalrenderer_1) {
		Vector3 vector3_3 = method11166().coords;
		return aClass206_7970.aClass201_2600.method3275(this, collisionPlane, (int) vector3_3.x >> aClass206_7970.anInt2592, (int) vector3_3.z >> aClass206_7970.anInt2592);
	}

}
