public class Defaults7Loader {

    static NativeSprite aClass160_5883;

    public Interface17 anInterface17_5878;

    public Interface17 anInterface17_5874;

    public Interface17 anInterface17_5875;

    public Interface17 anInterface17_5882;

    public Class232 aClass232_5877;

    public Class232 aClass232_5873;

    public Class232 aClass232_5879;

    public boolean aBool5876;

    public int anInt5880;

    public int anInt5881;

    public Defaults7Loader(Index index_1) {
        byte[] bytes_2 = index_1.getFile(DefaultsFile.FILE_7.fileId);
        this.method8746(new RsByteBuffer(bytes_2), -525270939);
    }

    void method8746(RsByteBuffer rsbytebuffer_1, int i_2) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }
            if (i_3 == 1) {
                this.anInterface17_5878 = Class197.method3202(rsbytebuffer_1, 470106489);
            } else if (i_3 == 2) {
                this.anInterface17_5874 = Class197.method3202(rsbytebuffer_1, 470106489);
            } else if (i_3 == 3) {
                this.anInterface17_5875 = Class197.method3202(rsbytebuffer_1, 470106489);
            } else if (i_3 == 4) {
                this.anInterface17_5882 = Class197.method3202(rsbytebuffer_1, 470106489);
            } else if (i_3 == 5) {
                this.aClass232_5877 = ClipMap.method6009(rsbytebuffer_1, -1710988237);
            } else if (i_3 == 6) {
                this.aClass232_5873 = ClipMap.method6009(rsbytebuffer_1, -1710988237);
            } else if (i_3 == 7) {
                this.aClass232_5879 = ClipMap.method6009(rsbytebuffer_1, -1710988237);
            } else if (i_3 == 8) {
                Class197.method3202(rsbytebuffer_1, 470106489);
            } else if (i_3 == 9) {
                Class197.method3202(rsbytebuffer_1, 470106489);
            } else if (i_3 == 10) {
                Class197.method3202(rsbytebuffer_1, 470106489);
            } else if (i_3 == 11) {
                this.aBool5876 = true;
            } else if (i_3 == 12) {
                this.anInt5880 = rsbytebuffer_1.readInt();
            } else if (i_3 == 13) {
                this.anInt5881 = rsbytebuffer_1.readInt();
            }
        }
    }

    public static void method8751(CacheableNode cacheablenode_0, CacheableNode cacheablenode_1, int i_2) {
        if (cacheablenode_0.current != null) {
            cacheablenode_0.method13452();
        }
        cacheablenode_0.current = cacheablenode_1.current;
        cacheablenode_0.aClass282_Sub50_8119 = cacheablenode_1;
        cacheablenode_0.current.aClass282_Sub50_8119 = cacheablenode_0;
        cacheablenode_0.aClass282_Sub50_8119.current = cacheablenode_0;
    }

    public static MeshRasterizer method8752(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        long long_7 = (long) i_5;
        MeshRasterizer meshrasterizer_9 = (MeshRasterizer) Class180.aClass229_2245.get(long_7);
        short s_10 = 2055;
        if (meshrasterizer_9 == null) {
            RSMesh rsmesh_11 = RSMesh.decodeMesh(IndexLoaders.MESH_INDEX, i_5, 0);
            if (rsmesh_11 == null) {
                return null;
            }
            if (rsmesh_11.version < 13) {
                rsmesh_11.upscale(2);
            }
            meshrasterizer_9 = graphicalrenderer_0.createMeshRasterizer(rsmesh_11, s_10, Class180.anInt2246, 64, 768);
            Class180.aClass229_2245.put(meshrasterizer_9, long_7);
        }
        meshrasterizer_9 = meshrasterizer_9.method11289((byte) 6, s_10, true);
        if (i_1 != 0) {
            meshrasterizer_9.f(i_1);
        }
        if (i_2 != 0) {
            meshrasterizer_9.t(i_2);
        }
        if (i_3 != 0) {
            meshrasterizer_9.EA(i_3);
        }
        if (i_4 != 0) {
            meshrasterizer_9.ia(0, i_4, 0);
        }
        return meshrasterizer_9;
    }

    static final void method8754(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
        icomponentdefinitions_0.aBool1316 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
        Class109.method1858(icomponentdefinitions_0, (byte) 19);
    }

    public static String method8755(RsByteBuffer rsbytebuffer_0, byte b_1) {
        return Class282_Sub33.method12582(rsbytebuffer_0, 32767, -2080210989);
    }
}
