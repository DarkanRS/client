public class HitsplatIndexLoader {

	public static int[] anIntArray2668;
	SoftCache aClass229_2664 = new SoftCache(20);
	SoftCache aClass229_2667 = new SoftCache(64);
	Index aClass317_2666;
	Index aClass317_2665;

	public void method3602() {
		SoftCache softcache_3 = this.aClass229_2667;
		synchronized (this.aClass229_2667) {
			this.aClass229_2667.method3858(5);
		}
		softcache_3 = this.aClass229_2664;
		synchronized (this.aClass229_2664) {
			this.aClass229_2664.method3858(5);
		}
	}

	public HitsplatDefinitions getDefinitions(int i_1) {
		SoftCache softcache_4 = this.aClass229_2667;
		HitsplatDefinitions hitsplatdefinitions_3;
		synchronized (this.aClass229_2667) {
			hitsplatdefinitions_3 = (HitsplatDefinitions) this.aClass229_2667.get((long) i_1);
		}
		if (hitsplatdefinitions_3 != null) {
			return hitsplatdefinitions_3;
		} else {
			Index index_5 = this.aClass317_2665;
			byte[] bytes_10;
			synchronized (this.aClass317_2665) {
				bytes_10 = this.aClass317_2665.getFile(SharedConfigsType.HITSPLATS.id, i_1);
			}
			hitsplatdefinitions_3 = new HitsplatDefinitions();
			hitsplatdefinitions_3.aClass210_2850 = this;
			if (bytes_10 != null) {
				hitsplatdefinitions_3.method3837(new RsByteBuffer(bytes_10));
			}
			SoftCache softcache_9 = this.aClass229_2667;
			synchronized (this.aClass229_2667) {
				this.aClass229_2667.put(hitsplatdefinitions_3, (long) i_1);
				return hitsplatdefinitions_3;
			}
		}
	}

	public void method3604() {
		SoftCache softcache_2 = this.aClass229_2667;
		synchronized (this.aClass229_2667) {
			this.aClass229_2667.method3859();
		}
		softcache_2 = this.aClass229_2664;
		synchronized (this.aClass229_2664) {
			this.aClass229_2664.method3859();
		}
	}

	public HitsplatIndexLoader(Game game_1, Language xlanguage_2, Index index_3, Index index_4) {
		this.aClass317_2666 = index_4;
		this.aClass317_2665 = index_3;
		this.aClass317_2665.filesCount(SharedConfigsType.HITSPLATS.id);
	}

	public void method3608() {
		SoftCache softcache_2 = this.aClass229_2667;
		synchronized (this.aClass229_2667) {
			this.aClass229_2667.method3863();
		}
		softcache_2 = this.aClass229_2664;
		synchronized (this.aClass229_2664) {
			this.aClass229_2664.method3863();
		}
	}

	static final void method3612(int i_0, int i_1, int i_2, int i_3, int i_4, boolean bool_5, byte b_6) {
		if (!bool_5 && (i_1 < 512 || i_2 < 512 || i_1 > (IndexLoaders.MAP_REGION_DECODER.getSizeX() - 2) * 512 || i_2 > (IndexLoaders.MAP_REGION_DECODER.getSizeY() - 2) * 512)) {
			float[] floats_7 = client.aFloatArray7292;
			client.aFloatArray7292[1] = -1.0F;
			floats_7[0] = -1.0F;
		} else {
			int i_8 = Class504.method8389(i_1, i_2, i_0, (byte) 110) - i_4;
			client.aClass294_7457.method5209(Renderers.SOFTWARE_RENDERER.method8458());
			client.aClass294_7457.method5219((float) i_3, 0.0F, 0.0F);
			Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
			if (bool_5) {
				Renderers.SOFTWARE_RENDERER.method8479((float) i_1, (float) i_8, (float) i_2, client.aFloatArray7292);
			} else {
				Renderers.SOFTWARE_RENDERER.method8515((float) i_1, (float) i_8, (float) i_2, client.aFloatArray7292);
			}
			client.aClass294_7457.method5219((float) (-i_3), 0.0F, 0.0F);
			Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
			client.aFloatArray7292[0] -= (float) client.anInt7444;
			client.aFloatArray7292[1] -= (float) client.anInt7445;
		}
	}

	public static void method3614(Class397 class397_0, int i_1, int i_2, byte b_3) {
		CS2Executor cs2executor_4 = CS2Executor.getNextScriptExecutor();
		CS2Executor.method1834(class397_0, i_1, i_2, cs2executor_4, (byte) 7);
	}
}
