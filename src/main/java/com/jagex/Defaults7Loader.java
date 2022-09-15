package com.jagex;

public class Defaults7Loader {

	static NativeSprite aNativeSprite_5883;
	public static void method8751(CacheableNode cacheablenode_0, CacheableNode cacheablenode_1) {
		if (cacheablenode_0.current != null)
			cacheablenode_0.method13452();
		cacheablenode_0.current = cacheablenode_1.current;
		cacheablenode_0.aCacheableNode_8119 = cacheablenode_1;
		cacheablenode_0.current.aCacheableNode_8119 = cacheablenode_0;
		cacheablenode_0.aCacheableNode_8119.current = cacheablenode_0;
	}
	public static MeshRasterizer method8752(AbstractRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		long long_7 = i_5;
		MeshRasterizer meshrasterizer_9 = (MeshRasterizer) HintArrow.aClass229_2245.get(long_7);
		short s_10 = 2055;
		if (meshrasterizer_9 == null) {
			RSMesh rsmesh_11 = RSMesh.decodeMesh(IndexLoaders.MESH_INDEX, i_5);
			if (rsmesh_11 == null)
				return null;
			if (rsmesh_11.version < 13)
				rsmesh_11.upscale();
			meshrasterizer_9 = graphicalrenderer_0.createMeshRasterizer(rsmesh_11, s_10, HintArrow.anInt2246, 64, 768);
			HintArrow.aClass229_2245.put(meshrasterizer_9, long_7);
		}
		meshrasterizer_9 = meshrasterizer_9.method11289((byte) 6, s_10, true);
		if (i_1 != 0)
			meshrasterizer_9.f(i_1);
		if (i_2 != 0)
			meshrasterizer_9.t(i_2);
		if (i_3 != 0)
			meshrasterizer_9.EA(i_3);
		if (i_4 != 0)
			meshrasterizer_9.ia(0, i_4, 0);
		return meshrasterizer_9;
	}
	public static String method8755(ByteBuf rsbytebuffer_0) {
		return Node_Sub33.method12582(rsbytebuffer_0);
	}
	public InputSubscriber anInterface17_5878;
	public InputSubscriber anInterface17_5874;
	public InputSubscriber anInterface17_5875;
	public InputSubscriber anInterface17_5882;
	public KeyHoldInputSubscriber aClass232_5877;
	public KeyHoldInputSubscriber aClass232_5873;
	public KeyHoldInputSubscriber aClass232_5879;

	public boolean aBool5876;

	public int membersTooltipColor;

	public int f2pTooltipColor;

	public Defaults7Loader(Index index_1) {
		byte[] bytes_2 = index_1.getFile(DefaultsFile.FILE_7.fileId);
		method8746(new ByteBuf(bytes_2));
	}

	void method8746(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0)
				return;
			if (i_3 == 1)
				anInterface17_5878 = InputSubscriber.decode(rsbytebuffer_1);
			else if (i_3 == 2)
				anInterface17_5874 = InputSubscriber.decode(rsbytebuffer_1);
			else if (i_3 == 3)
				anInterface17_5875 = InputSubscriber.decode(rsbytebuffer_1);
			else if (i_3 == 4)
				anInterface17_5882 = InputSubscriber.decode(rsbytebuffer_1);
			else if (i_3 == 5)
				aClass232_5877 = KeyHoldInputSubscriber.decode(rsbytebuffer_1);
			else if (i_3 == 6)
				aClass232_5873 = KeyHoldInputSubscriber.decode(rsbytebuffer_1);
			else if (i_3 == 7)
				aClass232_5879 = KeyHoldInputSubscriber.decode(rsbytebuffer_1);
			else if ((i_3 == 8) || (i_3 == 9) || (i_3 == 10))
				InputSubscriber.decode(rsbytebuffer_1);
			else if (i_3 == 11)
				aBool5876 = true;
			else if (i_3 == 12)
				membersTooltipColor = rsbytebuffer_1.readInt();
			else if (i_3 == 13)
				f2pTooltipColor = rsbytebuffer_1.readInt();
		}
	}
}
