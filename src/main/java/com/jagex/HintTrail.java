package com.jagex;

import java.util.Deque;
import java.util.LinkedList;

public class HintTrail {

	static int anInt3376;

	Deque<GraphNode_Sub1_Sub1_Sub1> aLinkedList3377;

	int modelId;

	int length;

	int[] xLocs;

	int[] yLocs;

	public HintTrail(AbstractRenderer graphicalrenderer_1, ByteBuf rsbytebuffer_2, int i_3) {
		modelId = i_3;
		length = rsbytebuffer_2.readUnsignedSmart();
		xLocs = new int[length];
		yLocs = new int[length];
		int i_4 = rsbytebuffer_2.readUnsignedShort();
		int i_5 = rsbytebuffer_2.readUnsignedShort();
		for (int i_6 = 0; i_6 < length; i_6++) {
			xLocs[i_6] = i_4 + rsbytebuffer_2.readByte();
			yLocs[i_6] = i_5 + rsbytebuffer_2.readByte();
		}
		getMeshRasterizer(graphicalrenderer_1);
	}

	MeshRasterizer getMeshRasterizer(AbstractRenderer graphicalrenderer_1) {
		RSMesh rsmesh_3 = RSMesh.decodeMesh(IndexLoaders.MESH_INDEX, modelId);
		if (rsmesh_3 == null)
			return null;
		if (rsmesh_3.version < 13)
			rsmesh_3.upscale();
		return graphicalrenderer_1.createMeshRasterizer(rsmesh_3, 2048, anInt3376, 64, 768);
	}

	public void method4978(SceneObjectManager sceneobjectmanager_1) {
		if (sceneobjectmanager_1 != null)
			if (length > 0) {
				method4983(sceneobjectmanager_1);
				for (GraphNode_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1_4 : aLinkedList3377)
					sceneobjectmanager_1.method3397(class521_sub1_sub1_sub1_4, false);
			}
	}

	public void method4979(SceneObjectManager sceneobjectmanager_1) {
		if (sceneobjectmanager_1 != null && aLinkedList3377 != null)
			for (GraphNode_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1_4 : aLinkedList3377)
				sceneobjectmanager_1.method3530(class521_sub1_sub1_sub1_4.plane, class521_sub1_sub1_sub1_4.aShort9458, class521_sub1_sub1_sub1_4.aShort9456, new Class280(class521_sub1_sub1_sub1_4));
	}

	void method4983(SceneObjectManager sceneobjectmanager_1) {
		aLinkedList3377 = new LinkedList<>();
		RenderFlagMap regionmap_3 = IndexLoaders.MAP_REGION_DECODER.getRenderFlags();
		CoordGrid regionBase = IndexLoaders.MAP_REGION_DECODER.getBase();
		CoordGrid prevPos = new CoordGrid(Class4.MY_PLAYER_PLANE, xLocs[0], yLocs[0]);
		for (int i_6 = 1; i_6 < length; i_6++) {
			CoordGrid currPos = new CoordGrid(Class4.MY_PLAYER_PLANE, xLocs[i_6], yLocs[i_6]);
			while (prevPos.x != currPos.x || prevPos.y != currPos.y) {
				if (prevPos.x < currPos.x)
					++prevPos.x;
				else if (prevPos.x > currPos.x)
					--prevPos.x;
				if (prevPos.y < currPos.y)
					++prevPos.y;
				else if (prevPos.y > currPos.y)
					--prevPos.y;
				int plane = Class4.MY_PLAYER_PLANE;
				int x = prevPos.x - regionBase.x;
				int y = prevPos.y - regionBase.y;
				if (x >= 0 && x < sceneobjectmanager_1.sizeX && y >= 0 && y < sceneobjectmanager_1.sizeY) {
					int i_11 = (x << 9) + 256;
					int i_12 = (y << 9) + 256;
					if (regionmap_3.isLowerObjectsToOverrideClipping(x, y))
						++plane;
					aLinkedList3377.add(new GraphNode_Sub1_Sub1_Sub1(sceneobjectmanager_1, this, Class4.MY_PLAYER_PLANE, plane, i_11, Class504.getTerrainHeightAtPos(i_11, i_12, Class4.MY_PLAYER_PLANE), i_12));
				}
			}
			prevPos = currPos;
		}
	}
}
