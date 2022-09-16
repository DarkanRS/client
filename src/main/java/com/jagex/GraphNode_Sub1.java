package com.jagex;

public abstract class GraphNode_Sub1 extends GraphNode {

	public byte plane;
	public byte collisionPlane;
	public SceneObjectManager aClass206_7970;
	public EntityNode_Sub5[] boundingBoxPolygons;
	GraphNode_Sub1 aTransform_Sub1_7966;
	int anInt7969;

	GraphNode_Sub1(SceneObjectManager sceneobjectmanager_1) {
		aClass206_7970 = sceneobjectmanager_1;
	}

	abstract int method12982(GLLight[] var1);

	abstract boolean method12983(AbstractRenderer var1, int var2, int var3);

	abstract void method12984();

	abstract boolean method12985();

	abstract boolean method12986();

	abstract boolean method12987();

	abstract boolean method12988(AbstractRenderer var1);

	abstract Class285 method12989(AbstractRenderer var1);

	abstract Class285 method12990(AbstractRenderer var1);

	abstract void method12991(AbstractRenderer var1);

	public abstract Class200 method12992(AbstractRenderer var1);

	public abstract Class200 method12993(AbstractRenderer var1);

	public abstract int method12995();

	int method12996() {
		return 0;
	}

	public int method12997() {
		return -method12995();
	}

	abstract boolean method12998(AbstractRenderer var1);

	abstract boolean method12999();

	abstract boolean method13000();

	abstract boolean method13001();

	abstract boolean method13002();

	public abstract int method13003();

	int method13004(int i_1, int i_2, GLLight[] arr_3) {
		long long_5 = aClass206_7970.aLongArrayArrayArray2645[plane][i_1][i_2];
		long long_7 = 0L;
		int i_9;
		int i_10;
		for (i_9 = 0; long_7 <= 48L; long_7 += 16L) {
			i_10 = (int) (long_5 >> long_7 & 65535L);
			if (i_10 <= 0)
				break;
			arr_3[i_9++] = aClass206_7970.aClass287Array2646[i_10 - 1].aNode_Sub24_3425;
		}
		for (i_10 = i_9; i_10 < 4; i_10++)
			arr_3[i_10] = null;
		return i_9;
	}

	public abstract int method13005();

	public abstract int method13006();

	void method13008(int i_1) {
		boundingBoxPolygons = new EntityNode_Sub5[i_1];
		for (int i_3 = 0; i_3 < boundingBoxPolygons.length; i_3++)
			boundingBoxPolygons[i_3] = new EntityNode_Sub5();
	}

	abstract Class285 method13009(AbstractRenderer var1);

	abstract Class285 method13010(AbstractRenderer var1);

	abstract boolean method13011();

	abstract void method13012(AbstractRenderer var1);

	abstract void method13013(GraphNode_Sub1 var2, int var3, int var4, int var5, boolean var6);

	abstract void method13015();

	abstract void method13016(GraphNode_Sub1 var2, int var3, int var4, int var5, boolean var6);

	public abstract int method13017();

	public abstract Class200 method13018(AbstractRenderer var1);

	public abstract Class200 method13019(AbstractRenderer var1);

	abstract boolean method13020(AbstractRenderer var1, int var2, int var3);

	abstract void method13021();

	abstract boolean method13022(AbstractRenderer var1);

	abstract void method13023(AbstractRenderer var1);

	abstract int method13024(GLLight[] var1);

	abstract int method13025(GLLight[] var1);

	abstract boolean method13026();

	abstract boolean method13029();

	abstract boolean method13030(AbstractRenderer var1);

	abstract int method13031(GLLight[] var1);

	abstract boolean method13032();

	abstract boolean method13033();

	abstract boolean method13034();

	abstract int method13036(GLLight[] var1);

	abstract boolean method13037(AbstractRenderer var1);
}
