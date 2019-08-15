import java.util.Iterator;
import java.util.LinkedList;

public class HintTrail {

	static int anInt3376 = 0;

	LinkedList aLinkedList3377;

	int modelId;

	int length;

	int[] xLocs;

	int[] yLocs;

	MeshRasterizer getMeshRasterizer(GraphicalRenderer graphicalrenderer_1) {
		RSMesh rsmesh_3 = RSMesh.decodeMesh(IndexLoaders.MESH_INDEX, this.modelId);
		if (rsmesh_3 == null) {
			return null;
		} else {
			if (rsmesh_3.version < 13) {
				rsmesh_3.upscale();
			}
			return graphicalrenderer_1.createMeshRasterizer(rsmesh_3, 2048, anInt3376, 64, 768);
		}
	}

	public void method4978(SceneObjectManager sceneobjectmanager_1) {
		if (sceneobjectmanager_1 != null) {
			if (this.length > 0) {
				this.method4983(sceneobjectmanager_1);
				Iterator iterator_3 = this.aLinkedList3377.iterator();
				while (iterator_3.hasNext()) {
					Transform_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1_4 = (Transform_Sub1_Sub1_Sub1) iterator_3.next();
					sceneobjectmanager_1.method3397(class521_sub1_sub1_sub1_4, false, 1630649491);
				}
			}
		}
	}

	public void method4979(SceneObjectManager sceneobjectmanager_1) {
		if (sceneobjectmanager_1 != null && this.aLinkedList3377 != null) {
			Iterator iterator_3 = this.aLinkedList3377.iterator();
			while (iterator_3.hasNext()) {
				Transform_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1_4 = (Transform_Sub1_Sub1_Sub1) iterator_3.next();
				sceneobjectmanager_1.method3530(class521_sub1_sub1_sub1_4.plane, class521_sub1_sub1_sub1_4.aShort9458, class521_sub1_sub1_sub1_4.aShort9456, new Class280(class521_sub1_sub1_sub1_4), -1561298110);
			}
		}
	}

	void method4983(SceneObjectManager sceneobjectmanager_1) {
		this.aLinkedList3377 = new LinkedList();
		RegionMap regionmap_3 = IndexLoaders.MAP_REGION_DECODER.method4433();
		WorldTile regionBase = IndexLoaders.MAP_REGION_DECODER.getBase();
		WorldTile prevPos = new WorldTile(Class4.MY_PLAYER_PLANE, this.xLocs[0], this.yLocs[0]);
		for (int i_6 = 1; i_6 < this.length; i_6++) {
			WorldTile currPos = new WorldTile(Class4.MY_PLAYER_PLANE, this.xLocs[i_6], this.yLocs[i_6]);
			while (prevPos.x != currPos.x || prevPos.y != currPos.y) {
				if (prevPos.x < currPos.x) {
					++prevPos.x;
				} else if (prevPos.x > currPos.x) {
					--prevPos.x;
				}
				if (prevPos.y < currPos.y) {
					++prevPos.y;
				} else if (prevPos.y > currPos.y) {
					--prevPos.y;
				}
				int plane = Class4.MY_PLAYER_PLANE;
				int x = prevPos.x - regionBase.x;
				int y = prevPos.y - regionBase.y;
				if (x >= 0 && x < sceneobjectmanager_1.sizeX && y >= 0 && y < sceneobjectmanager_1.sizeY) {
					int i_11 = (x << 9) + 256;
					int i_12 = (y << 9) + 256;
					if (regionmap_3.is0x2(x, y, 1872595412)) {
						++plane;
					}
					this.aLinkedList3377.add(new Transform_Sub1_Sub1_Sub1(sceneobjectmanager_1, this, Class4.MY_PLAYER_PLANE, plane, i_11, Class504.getTerrainHeightAtPos(i_11, i_12, Class4.MY_PLAYER_PLANE), i_12));
				}
			}
			prevPos = currPos;
		}
	}

	public HintTrail(GraphicalRenderer graphicalrenderer_1, RsByteBuffer rsbytebuffer_2, int i_3) {
		this.modelId = i_3;
		this.length = rsbytebuffer_2.readSignedSmart();
		this.xLocs = new int[this.length];
		this.yLocs = new int[this.length];
		int i_4 = rsbytebuffer_2.readUnsignedShort();
		int i_5 = rsbytebuffer_2.readUnsignedShort();
		for (int i_6 = 0; i_6 < this.length; i_6++) {
			this.xLocs[i_6] = i_4 + rsbytebuffer_2.readByte();
			this.yLocs[i_6] = i_5 + rsbytebuffer_2.readByte();
		}
		this.getMeshRasterizer(graphicalrenderer_1);
	}
}
