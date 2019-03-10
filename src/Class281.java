import java.util.Iterator;
import java.util.LinkedList;

public class Class281 {

	static int anInt3376 = 0;
	LinkedList aLinkedList3377;
	int anInt3372;
	int anInt3374;
	int[] anIntArray3375;
	int[] anIntArray3373;

	MeshRasterizer method4977(GraphicalRenderer graphicalrenderer_1, int i_2) {
		RSMesh rsmesh_3 = RSMesh.decodeMesh(IndexLoaders.MESH_INDEX, this.anInt3372, 0);
		if (rsmesh_3 == null) {
			return null;
		} else {
			if (rsmesh_3.version < 13) {
				rsmesh_3.upscale(2);
			}

			return graphicalrenderer_1.createMeshRasterizer(rsmesh_3, 2048, anInt3376, 64, 768);
		}
	}

	public void method4978(SceneObjectManager sceneobjectmanager_1, byte b_2) {
		if (sceneobjectmanager_1 != null) {
			if (b_2 != -1)
				if (this.anInt3374 > 0 && b_2 == -1) {
					this.method4983(sceneobjectmanager_1, -199147692);
					Iterator iterator_3 = this.aLinkedList3377.iterator();

					while (iterator_3.hasNext() && b_2 == -1) {
						Class521_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1_4 = (Class521_Sub1_Sub1_Sub1) iterator_3.next();
						sceneobjectmanager_1.method3397(class521_sub1_sub1_sub1_4, false, 1630649491);
					}
				}
		}

	}

	public void method4979(SceneObjectManager sceneobjectmanager_1, int i_2) {
		if (sceneobjectmanager_1 != null && this.aLinkedList3377 != null) {
			Iterator iterator_3 = this.aLinkedList3377.iterator();

			while (iterator_3.hasNext()) {
				Class521_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1_4 = (Class521_Sub1_Sub1_Sub1) iterator_3.next();
				sceneobjectmanager_1.method3530(class521_sub1_sub1_sub1_4.plane, class521_sub1_sub1_sub1_4.aShort9458, class521_sub1_sub1_sub1_4.aShort9456, new Class280(class521_sub1_sub1_sub1_4), -1561298110);
			}
		}

	}

	void method4983(SceneObjectManager sceneobjectmanager_1, int i_2) {
		this.aLinkedList3377 = new LinkedList();
		RegionMap regionmap_3 = IndexLoaders.MAP_REGION_DECODER.method4433(33386298);
		CoordGrid coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(309280433);
		CoordGrid coordgrid_5 = new CoordGrid(Class4.anInt35, this.anIntArray3375[0], this.anIntArray3373[0]);

		for (int i_6 = 1; i_6 < this.anInt3374; i_6++) {
			CoordGrid coordgrid_7 = new CoordGrid(Class4.anInt35, this.anIntArray3375[i_6], this.anIntArray3373[i_6]);

			while (coordgrid_5.x != coordgrid_7.x || coordgrid_5.y != coordgrid_7.y) {
				if (coordgrid_5.x < coordgrid_7.x) {
					++coordgrid_5.x;
				} else if (coordgrid_5.x > coordgrid_7.x) {
					--coordgrid_5.x;
				}

				if (coordgrid_5.y < coordgrid_7.y) {
					++coordgrid_5.y;
				} else if (coordgrid_5.y > coordgrid_7.y) {
					--coordgrid_5.y;
				}

				int i_8 = Class4.anInt35;
				int i_9 = coordgrid_5.x - coordgrid_4.x;
				int i_10 = coordgrid_5.y - coordgrid_4.y;
				if (i_9 >= 0 && i_9 < sceneobjectmanager_1.anInt2617 && i_10 >= 0 && i_10 < sceneobjectmanager_1.anInt2603) {
					int i_11 = (i_9 << 9) + 256;
					int i_12 = (i_10 << 9) + 256;
					if (regionmap_3.is0x2(i_9, i_10, 1872595412)) {
						++i_8;
					}

					this.aLinkedList3377.add(new Class521_Sub1_Sub1_Sub1(sceneobjectmanager_1, this, Class4.anInt35, i_8, i_11, Class504.method8389(i_11, i_12, Class4.anInt35, (byte) 91), i_12));
				}
			}

			coordgrid_5 = coordgrid_7;
		}

	}

	public Class281(GraphicalRenderer graphicalrenderer_1, RsByteBuffer rsbytebuffer_2, int i_3) {
		this.anInt3372 = i_3;
		this.anInt3374 = rsbytebuffer_2.readSmart();
		this.anIntArray3375 = new int[this.anInt3374];
		this.anIntArray3373 = new int[this.anInt3374];
		int i_4 = rsbytebuffer_2.readUnsignedShort();
		int i_5 = rsbytebuffer_2.readUnsignedShort();

		for (int i_6 = 0; i_6 < this.anInt3374; i_6++) {
			this.anIntArray3375[i_6] = i_4 + rsbytebuffer_2.readByte();
			this.anIntArray3373[i_6] = i_5 + rsbytebuffer_2.readByte();
		}

		this.method4977(graphicalrenderer_1, 546105467);
	}

	static final void method4986(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = ((Player) cs2executor_0.animable).aClass155_10561.method2627(i_2, -1165969492);
	}

	static final void method4987(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.stringStack[--cs2executor_0.stringStackPtr];
		int i_3 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = string_2 + i_3;
	}

	static final void method4988(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		Class282_Sub50_Sub6 class282_sub50_sub6_3 = Class291.method5130(i_2);
		if (class282_sub50_sub6_3 == null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class282_sub50_sub6_3.anInt9540 - class282_sub50_sub6_3.anInt9539;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class282_sub50_sub6_3.anInt9535 - class282_sub50_sub6_3.anInt9541;
		}

	}

	static final void method4989(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub2_8205.method12622(531406560) ? 1 : 0;
	}

}
