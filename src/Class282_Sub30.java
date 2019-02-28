public class Class282_Sub30 extends Node {

	static IterableNodeMap aClass465_7711 = new IterableNodeMap(32);
	static SoftCache aClass229_7712 = new SoftCache(11);
	int[] anIntArray7710 = new int[] { -1 };
	int[] anIntArray7709 = new int[1];

	final MeshRasterizer method12429(GraphicalRenderer graphicalrenderer_1, int i_2, Animation animation_3, int i_4, boolean bool_5, PlayerAppearance playerappearance_6, int i_7) {
		MeshRasterizer meshrasterizer_8 = null;
		int i_9 = i_2;
		RenderAnimDefs renderanimdefs_10 = null;
		if (i_4 != -1) {
			renderanimdefs_10 = IndexLoaders.RENDER_ANIMS.getRenderAnimDefs(i_4, (byte) 66);
		}

		int[] ints_11 = this.anIntArray7710;
		if (renderanimdefs_10 != null && renderanimdefs_10.anIntArray2811 != null) {
			ints_11 = new int[renderanimdefs_10.anIntArray2811.length];

			for (int i_12 = 0; i_12 < renderanimdefs_10.anIntArray2811.length; i_12++) {
				int i_13 = renderanimdefs_10.anIntArray2811[i_12];
				if (i_13 >= 0 && i_13 < this.anIntArray7710.length) {
					ints_11[i_12] = this.anIntArray7710[i_13];
				} else {
					ints_11[i_12] = -1;
				}
			}
		}

		if (animation_3 != null) {
			i_9 = i_2 | animation_3.method7640(-1290274733);
		}

		long long_24 = this.method12444(ints_11, i_4, playerappearance_6 != null ? playerappearance_6.colors : null, bool_5, 583894637);
		if (aClass229_7712 != null) {
			meshrasterizer_8 = (MeshRasterizer) aClass229_7712.get(long_24);
		}

		if (meshrasterizer_8 == null || graphicalrenderer_1.method8452(meshrasterizer_8.m(), i_9) != 0) {
			if (meshrasterizer_8 != null) {
				i_9 = graphicalrenderer_1.method8546(i_9, meshrasterizer_8.m());
			}

			int i_26 = i_9;
			boolean bool_15 = false;

			for (int i_16 = 0; i_16 < ints_11.length; i_16++) {
				if (ints_11[i_16] != -1 && !IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(ints_11[i_16], 1950538416).bodyMeshesReady(bool_5, (MeshModifier) null, -763899504)) {
					bool_15 = true;
				}
			}

			if (bool_15) {
				return null;
			}

			RSMesh[] arr_27 = new RSMesh[ints_11.length];

			int i_17;
			for (i_17 = 0; i_17 < ints_11.length; i_17++) {
				if (ints_11[i_17] != -1) {
					arr_27[i_17] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(ints_11[i_17], 584500075).getBodyMesh(bool_5, (MeshModifier) null, 2085001887);
				}
			}

			int i_18;
			int i_19;
			if (renderanimdefs_10 != null && renderanimdefs_10.anIntArrayArray2802 != null) {
				for (i_17 = 0; i_17 < renderanimdefs_10.anIntArrayArray2802.length; i_17++) {
					if (renderanimdefs_10.anIntArrayArray2802[i_17] != null && arr_27[i_17] != null) {
						i_18 = renderanimdefs_10.anIntArrayArray2802[i_17][0];
						i_19 = renderanimdefs_10.anIntArrayArray2802[i_17][1];
						int i_20 = renderanimdefs_10.anIntArrayArray2802[i_17][2];
						int i_21 = renderanimdefs_10.anIntArrayArray2802[i_17][3];
						int i_22 = renderanimdefs_10.anIntArrayArray2802[i_17][4];
						int i_23 = renderanimdefs_10.anIntArrayArray2802[i_17][5];
						if (i_21 != 0 || i_22 != 0 || i_23 != 0) {
							arr_27[i_17].method2671(i_21, i_22, i_23);
						}

						if (i_18 != 0 || i_19 != 0 || i_20 != 0) {
							arr_27[i_17].method2712(i_18, i_19, i_20);
						}
					}
				}
			}

			RSMesh rsmesh_28 = new RSMesh(arr_27, arr_27.length);
			if (playerappearance_6 != null) {
				i_26 = i_9 | 0x4000;
			}

			meshrasterizer_8 = graphicalrenderer_1.createMeshRasterizer(rsmesh_28, i_26, Class105.anInt1069, 65, 857);
			if (playerappearance_6 != null) {
				for (i_18 = 0; i_18 < 10; i_18++) {
					for (i_19 = 0; i_19 < AbstractQueue_Sub1.SKIN_COLORS[i_18].length; i_19++) {
						if (playerappearance_6.colors[i_18] < Class366.SKIN_COLORS[i_18][i_19].length) {
							meshrasterizer_8.X(AbstractQueue_Sub1.SKIN_COLORS[i_18][i_19], Class366.SKIN_COLORS[i_18][i_19][playerappearance_6.colors[i_18]]);
						}
					}
				}
			}

			if (aClass229_7712 != null) {
				meshrasterizer_8.KA(i_9);
				aClass229_7712.put(meshrasterizer_8, long_24);
			}
		}

		if (animation_3 == null) {
			return meshrasterizer_8;
		} else {
			MeshRasterizer meshrasterizer_14 = meshrasterizer_8.method11289((byte) 1, i_9, true);
			animation_3.rasterize(meshrasterizer_14, 0, 16711935);
			return meshrasterizer_14;
		}
	}

	long method12444(int[] ints_1, int i_2, int[] ints_3, boolean bool_4, int i_5) {
		long[] longs_6 = RsByteBuffer.aLongArray7979;
		long long_7 = -1L;
		long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (long) (i_2 >> 8)) & 0xffL)];
		long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (long) i_2) & 0xffL)];

		int i_9;
		for (i_9 = 0; i_9 < ints_1.length; i_9++) {
			long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (long) (ints_1[i_9] >> 24)) & 0xffL)];
			long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (long) (ints_1[i_9] >> 16)) & 0xffL)];
			long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (long) (ints_1[i_9] >> 8)) & 0xffL)];
			long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (long) ints_1[i_9]) & 0xffL)];
		}

		if (ints_3 != null) {
			for (i_9 = 0; i_9 < 5; i_9++) {
				long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (long) ints_3[i_9]) & 0xffL)];
			}
		}

		long_7 = long_7 >>> 8 ^ longs_6[(int) ((long_7 ^ (long) (bool_4 ? 1 : 0)) & 0xffL)];
		return long_7;
	}

}
