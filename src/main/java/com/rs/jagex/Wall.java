package com.rs.jagex;

public class Wall extends GraphNode_Sub1_Sub5 implements WorldObject {

	static int[] anIntArray10531 = {1, 2, 4, 8};
	static int[] anIntArray10533 = {16, 32, 64, 128};
	static void method16113() {
		int i_1 = Camera.CAM_MOVE_LOCALX * 512 + 256;
		int i_2 = Camera.CAM_MOVE_LOCALY * 512 + 256;
		int i_3 = Class504.getTerrainHeightAtPos(i_1, i_2, Class4.MY_PLAYER_PLANE) - Camera.CAM_MOVE_Z;
		if (Camera.CAM_MOVE_VAR_SPEED >= 100) {
			Camera.CAM_MOVE_ABSOLUTEX = Camera.CAM_MOVE_LOCALX * 512 + 256;
			Camera.CAM_MOVE_ABSOLUTEY = Camera.CAM_MOVE_LOCALY * 512 + 256;
			Camera.CAM_MOVE_ABSOLUTEZ = Class504.getTerrainHeightAtPos(Camera.CAM_MOVE_ABSOLUTEX, Camera.CAM_MOVE_ABSOLUTEY, Class4.MY_PLAYER_PLANE) - Camera.CAM_MOVE_Z;
		} else {
			if (Camera.CAM_MOVE_ABSOLUTEX < i_1) {
				Camera.CAM_MOVE_ABSOLUTEX = (i_1 - Camera.CAM_MOVE_ABSOLUTEX) * Camera.CAM_MOVE_VAR_SPEED / 1000 + Camera.CAM_MOVE_ABSOLUTEX + Camera.CAM_MOVE_CONST_SPEED;
				if (Camera.CAM_MOVE_ABSOLUTEX > i_1)
					Camera.CAM_MOVE_ABSOLUTEX = i_1;
			}

			if (Camera.CAM_MOVE_ABSOLUTEX > i_1) {
				Camera.CAM_MOVE_ABSOLUTEX -= Camera.CAM_MOVE_VAR_SPEED * (Camera.CAM_MOVE_ABSOLUTEX - i_1) / 1000 + Camera.CAM_MOVE_CONST_SPEED;
				if (Camera.CAM_MOVE_ABSOLUTEX < i_1)
					Camera.CAM_MOVE_ABSOLUTEX = i_1;
			}

			if (Camera.CAM_MOVE_ABSOLUTEZ < i_3) {
				Camera.CAM_MOVE_ABSOLUTEZ = (i_3 - Camera.CAM_MOVE_ABSOLUTEZ) * Camera.CAM_MOVE_VAR_SPEED / 1000 + Camera.CAM_MOVE_ABSOLUTEZ + Camera.CAM_MOVE_CONST_SPEED;
				if (Camera.CAM_MOVE_ABSOLUTEZ > i_3)
					Camera.CAM_MOVE_ABSOLUTEZ = i_3;
			}

			if (Camera.CAM_MOVE_ABSOLUTEZ > i_3) {
				Camera.CAM_MOVE_ABSOLUTEZ -= Camera.CAM_MOVE_VAR_SPEED * (Camera.CAM_MOVE_ABSOLUTEZ - i_3) / 1000 + Camera.CAM_MOVE_CONST_SPEED;
				if (Camera.CAM_MOVE_ABSOLUTEZ < i_3)
					Camera.CAM_MOVE_ABSOLUTEZ = i_3;
			}

			if (Camera.CAM_MOVE_ABSOLUTEY < i_2) {
				Camera.CAM_MOVE_ABSOLUTEY = (i_2 - Camera.CAM_MOVE_ABSOLUTEY) * Camera.CAM_MOVE_VAR_SPEED / 1000 + Camera.CAM_MOVE_ABSOLUTEY + Camera.CAM_MOVE_CONST_SPEED;
				if (Camera.CAM_MOVE_ABSOLUTEY > i_2)
					Camera.CAM_MOVE_ABSOLUTEY = i_2;
			}

			if (Camera.CAM_MOVE_ABSOLUTEY > i_2) {
				Camera.CAM_MOVE_ABSOLUTEY -= Camera.CAM_MOVE_VAR_SPEED * (Camera.CAM_MOVE_ABSOLUTEY - i_2) / 1000 + Camera.CAM_MOVE_CONST_SPEED;
				if (Camera.CAM_MOVE_ABSOLUTEY < i_2)
					Camera.CAM_MOVE_ABSOLUTEY = i_2;
			}
		}

		i_1 = Camera.anInt9368 * 512 + 256;
		i_2 = Camera.anInt4280 * 512 + 256;
		i_3 = Class504.getTerrainHeightAtPos(i_1, i_2, Class4.MY_PLAYER_PLANE) - Camera.anInt1527;
		int i_4 = i_1 - Camera.CAM_MOVE_ABSOLUTEX;
		int i_5 = i_3 - Camera.CAM_MOVE_ABSOLUTEZ;
		int i_6 = i_2 - Camera.CAM_MOVE_ABSOLUTEY;
		int i_7 = (int) Math.sqrt(i_6 * i_6 + i_4 * i_4);
		int i_8 = (int) (Math.atan2(i_5, i_7) * 2607.5945876176133D) & 0x3fff;
		int i_9 = (int) (Math.atan2(i_4, i_6) * -2607.5945876176133) & 0x3fff;
		if (i_8 < 1024)
			i_8 = 1024;

		if (i_8 > 3072)
			i_8 = 3072;

		if (Camera.anInt3512 < i_8) {
			Camera.anInt3512 += (i_8 - Camera.anInt3512 >> 3) * Camera.anInt5828 / 1000 + Camera.anInt5606 << 3;
			if (Camera.anInt3512 > i_8)
				Camera.anInt3512 = i_8;
		}

		if (Camera.anInt3512 > i_8) {
			Camera.anInt3512 -= (Camera.anInt3512 - i_8 >> 3) * Camera.anInt5828 / 1000 + Camera.anInt5606 << 3;
			if (Camera.anInt3512 < i_8)
				Camera.anInt3512 = i_8;
		}

		int i_10 = i_9 - Camera.anInt5930;
		if (i_10 > 8192)
			i_10 -= 16384;

		if (i_10 < -8192)
			i_10 += 16384;

		i_10 >>= 3;
		if (i_10 > 0) {
			Camera.anInt5930 += i_10 * Camera.anInt5828 / 1000 + Camera.anInt5606 << 3;
			Camera.anInt5930 &= 0x3fff;
		}

		if (i_10 < 0) {
			Camera.anInt5930 -= Camera.anInt5606 + -i_10 * Camera.anInt5828 / 1000 << 3;
			Camera.anInt5930 &= 0x3fff;
		}

		int i_11 = i_9 - Camera.anInt5930;
		if (i_11 > 8192)
			i_11 -= 16384;

		if (i_11 < -8192)
			i_11 += 16384;

		if (i_11 < 0 && i_10 > 0 || i_11 > 0 && i_10 < 0)
			Camera.anInt5930 = i_9;

		Camera.anInt1525 = 0;
	}
	public static void method16114() {
		if (!client.aBool7331) {
			client.aFloat7284 += (-12.0f - client.aFloat7284) / 2.0F;
			client.aBool7371 = true;
			client.aBool7331 = true;
		}

	}
	public Class123 aClass123_10532;
	boolean aBool10528 = true;

	Class200 aClass200_10530;

	boolean aBool10529;

	public Wall(SceneObjectManager sceneobjectmanager_1, AbstractRenderer graphicalrenderer_2, LocationIndexLoader objectindexloader_3, ObjectDefinition objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12, int i_13) {
		super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, Engine.method4777(i_11, i_12));
		aClass123_10532 = new Class123(graphicalrenderer_2, objectindexloader_3, objectdefinitions_4, i_11, i_12, plane, i_6, this, bool_10, i_13);
		aBool10529 = objectdefinitions_4.interactable != 0 && !bool_10;
		method13008(1);
	}

	@Override
	public int getId() {
		return aClass123_10532.anInt1540;
	}

	@Override
	boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_5 = aClass123_10532.method2132(graphicalrenderer_1, 131072, false, false);
		return meshrasterizer_5 != null && meshrasterizer_5.method11270(i_2, i_3, method11168(), false, 0);
	}

	@Override
	void method12984() {
		throw new IllegalStateException();
	}

	@Override
	boolean method12985() {
		return false;
	}

	@Override
	boolean method12986() {
		return false;
	}

	@Override
	boolean method12987() {
		return aBool10528;
	}

	@Override
	Class285 method12989(AbstractRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = aClass123_10532.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null)
			return null;
		Matrix44Var matrix44var_3 = method11168();
		CoordinateSpace class305_4 = method11166();
		Class285 class285_5 = Class470.method7824(aBool10529);
		int i_6 = (int) class305_4.coords.x >> 9;
		int i_7 = (int) class305_4.coords.z >> 9;
		aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
		meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
		if (aClass123_10532.aClass539_1538 != null) {
			Class151 class151_8 = aClass123_10532.aClass539_1538.method11517();
			graphicalrenderer_1.method8456(class151_8);
		}

		aBool10528 = meshrasterizer_2.i() || aClass123_10532.aClass539_1538 != null;
		if (aClass200_10530 == null)
			aClass200_10530 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
		else
			Class388.method6694(aClass200_10530, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);

		return class285_5;
	}

	@Override
	Class285 method12990(AbstractRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_3 = aClass123_10532.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_3 == null)
			return null;
		Matrix44Var matrix44var_4 = method11168();
		CoordinateSpace class305_5 = method11166();
		Class285 class285_6 = Class470.method7824(aBool10529);
		int i_7 = (int) class305_5.coords.x >> 9;
			int i_8 = (int) class305_5.coords.z >> 9;
			aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, true);
			meshrasterizer_3.method11282(matrix44var_4, boundingBoxPolygons[0], 0);
			if (aClass123_10532.aClass539_1538 != null) {
				Class151 class151_9 = aClass123_10532.aClass539_1538.method11517();
				graphicalrenderer_1.method8456(class151_9);
			}

			aBool10528 = meshrasterizer_3.i() || aClass123_10532.aClass539_1538 != null;
			if (aClass200_10530 == null)
				aClass200_10530 = EntityNode_Sub2.method12505((int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3);
			else
				Class388.method6694(aClass200_10530, (int) class305_5.coords.x, (int) class305_5.coords.y, (int) class305_5.coords.z, meshrasterizer_3);

			return class285_6;
	}

	@Override
	void method12991(AbstractRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_3 = aClass123_10532.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_3 != null) {
			Matrix44Var matrix44var_4 = method11168();
			CoordinateSpace class305_5 = method11166();
			int i_6 = (int) class305_5.coords.x >> 9;
			int i_7 = (int) class305_5.coords.z >> 9;
			aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_3, matrix44var_4, false);
		}

	}

	@Override
	public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
		return aClass200_10530;
	}

	@Override
	public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
		return aClass200_10530;
	}

	@Override
	public int method12995() {
		return aClass123_10532.method2115();
	}

	@Override
	public int method12997() {
		return aClass123_10532.method2121();
	}

	@Override
	boolean method12999() {
		return false;
	}

	@Override
	boolean method13000() {
		return aBool10528;
	}

	@Override
	boolean method13001() {
		return aBool10528;
	}

	@Override
	boolean method13002() {
		return aBool10528;
	}

	@Override
	public int method13003() {
		return aClass123_10532.method2115();
	}

	@Override
	public int method13005() {
		return aClass123_10532.method2115();
	}

	@Override
	public int method13006() {
		return aClass123_10532.method2115();
	}

	@Override
	Class285 method13009(AbstractRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = aClass123_10532.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null)
			return null;
		Matrix44Var matrix44var_3 = method11168();
		CoordinateSpace class305_4 = method11166();
		Class285 class285_5 = Class470.method7824(aBool10529);
		int i_6 = (int) class305_4.coords.x >> 9;
		int i_7 = (int) class305_4.coords.z >> 9;
		aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
		meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
		if (aClass123_10532.aClass539_1538 != null) {
			Class151 class151_8 = aClass123_10532.aClass539_1538.method11517();
			graphicalrenderer_1.method8456(class151_8);
		}

		aBool10528 = meshrasterizer_2.i() || aClass123_10532.aClass539_1538 != null;
		if (aClass200_10530 == null)
			aClass200_10530 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
		else
			Class388.method6694(aClass200_10530, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);

		return class285_5;
	}

	@Override
	Class285 method13010(AbstractRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = aClass123_10532.method2132(graphicalrenderer_1, 2048, false, true);
		if (meshrasterizer_2 == null)
			return null;
		Matrix44Var matrix44var_3 = method11168();
		CoordinateSpace class305_4 = method11166();
		Class285 class285_5 = Class470.method7824(aBool10529);
		int i_6 = (int) class305_4.coords.x >> 9;
		int i_7 = (int) class305_4.coords.z >> 9;
		aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, true);
		meshrasterizer_2.method11282(matrix44var_3, boundingBoxPolygons[0], 0);
		if (aClass123_10532.aClass539_1538 != null) {
			Class151 class151_8 = aClass123_10532.aClass539_1538.method11517();
			graphicalrenderer_1.method8456(class151_8);
		}

		aBool10528 = meshrasterizer_2.i() || aClass123_10532.aClass539_1538 != null;
		if (aClass200_10530 == null)
			aClass200_10530 = EntityNode_Sub2.method12505((int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);
		else
			Class388.method6694(aClass200_10530, (int) class305_4.coords.x, (int) class305_4.coords.y, (int) class305_4.coords.z, meshrasterizer_2);

		return class285_5;
	}

	@Override
	boolean method13011() {
		return false;
	}

	@Override
	void method13012(AbstractRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = aClass123_10532.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_2 != null) {
			Matrix44Var matrix44var_3 = method11168();
			CoordinateSpace class305_4 = method11166();
			int i_5 = (int) class305_4.coords.x >> 9;
			int i_6 = (int) class305_4.coords.z >> 9;
			aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, false);
		}

	}

	@Override
	void method13013(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		throw new IllegalStateException();
	}

	@Override
	void method13015() {
		throw new IllegalStateException();
	}

	@Override
	void method13016(GraphNode_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		throw new IllegalStateException();
	}

	@Override
	public int method13017() {
		return aClass123_10532.method2115();
	}

	@Override
	public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
		return aClass200_10530;
	}

	@Override
	public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
		return aClass200_10530;
	}

	@Override
	boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_4 = aClass123_10532.method2132(graphicalrenderer_1, 131072, false, false);
		return meshrasterizer_4 != null && meshrasterizer_4.method11270(i_2, i_3, method11168(), false, 0);
	}

	@Override
	void method13021() {
		throw new IllegalStateException();
	}

	@Override
	void method13023(AbstractRenderer graphicalrenderer_1) {
		MeshRasterizer meshrasterizer_2 = aClass123_10532.method2132(graphicalrenderer_1, 262144, true, true);
		if (meshrasterizer_2 != null) {
			Matrix44Var matrix44var_3 = method11168();
			CoordinateSpace class305_4 = method11166();
			int i_5 = (int) class305_4.coords.x >> 9;
			int i_6 = (int) class305_4.coords.z >> 9;
			aClass123_10532.method2119(graphicalrenderer_1, meshrasterizer_2, matrix44var_3, false);
		}

	}

	@Override
	boolean method13026() {
		return false;
	}

	public void method16108(ObjectMeshModifier class476_1) {
		aClass123_10532.method2116(class476_1);
	}

	@Override
	public void method38() {
	}

	@Override
	public int method39() {
		return aClass123_10532.anInt1540 * 1623064993 * 1535779425;
	}

	@Override
	public int method73() {
		return aClass123_10532.anInt1555 * 2129865927 * 845010167;
	}

	@Override
	public int method76() {
		return aClass123_10532.anInt1540 * 1623064993 * 1535779425;
	}

	@Override
	public int method77() {
		return aClass123_10532.anInt1555 * 2129865927 * 845010167;
	}

	@Override
	public void method83(AbstractRenderer graphicalrenderer_1) {
		aClass123_10532.method2136(graphicalrenderer_1);
	}

	@Override
	public void method85() {
	}

	@Override
	public boolean method86() {
		return aClass123_10532.method2117();
	}

	@Override
	public void method87(AbstractRenderer graphicalrenderer_1) {
		aClass123_10532.method2136(graphicalrenderer_1);
	}

	@Override
	public void method88(AbstractRenderer graphicalrenderer_1) {
		aClass123_10532.method2118();
	}

	@Override
	public int method89() {
		return aClass123_10532.anInt1555;
	}

	@Override
	public void method90() {
	}

	@Override
	public int method91() {
		return aClass123_10532.anInt1542 * -2132267033 * -515017769;
	}

	@Override
	public int method92() {
		return aClass123_10532.anInt1542;
	}

	@Override
	public void method93(AbstractRenderer graphicalrenderer_1) {
		aClass123_10532.method2136(graphicalrenderer_1);
	}

	@Override
	public boolean method94() {
		return aClass123_10532.method2117();
	}

	@Override
	public boolean method95() {
		return aClass123_10532.method2117();
	}

	@Override
	public void method96() {
	}

	@Override
	public void method97(AbstractRenderer graphicalrenderer_1) {
		aClass123_10532.method2118();
	}

	@Override
	public void method98(AbstractRenderer graphicalrenderer_1) {
		aClass123_10532.method2118();
	}
}
