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

	static final void method8749(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		if (cs2executor_0.intStack[cs2executor_0.intStackPtr] < cs2executor_0.intStack[cs2executor_0.intStackPtr + 1]) {
			cs2executor_0.instrPtr += cs2executor_0.intOpValues[cs2executor_0.instrPtr];
		}

	}

	static final void method8750(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 23);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		OutgoingLoginPacket.method6313(icomponentdefinitions_3, interface_4, cs2executor_0, 435475117);
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

			if (rsmesh_11.zoom < 13) {
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

	static final void method8753(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStackPtr -= 2;
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_5 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		AttributeDefault attributedefault_6 = IndexLoaders.ITEM_DEFAULTS.method7069(i_4, (byte) 0);
		if (i_5 != attributedefault_6.anInt5337) {
			icomponentdefinitions_3.method1999(i_4, i_5, -76076232);
		} else {
			icomponentdefinitions_3.method1995(i_4, -1265527536);
		}

	}

	static final void method8754(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.aBool1316 = cs2executor_2.intStack[--cs2executor_2.intStackPtr] == 1;
		Class109.method1858(icomponentdefinitions_0, (byte) 19);
	}

	public static String method8755(RsByteBuffer rsbytebuffer_0, byte b_1) {
		return Class282_Sub33.method12582(rsbytebuffer_0, 32767, -2080210989);
	}

	static final void method8756(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (client.aString7426 != null && i_2 < Class459.anInt5534) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class467.aClass173Array5575[i_2].aByte2126;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	static final void method8757(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		String string_3 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		if (i_2 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_4 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2, (byte) 8);
			if (enumdefinitions_4.aChar5140 != 115) {
				throw new RuntimeException();
			} else {
				int[] ints_5 = enumdefinitions_4.method7251(string_3, 1883860951);
				int i_6 = 0;
				if (ints_5 != null) {
					i_6 = ints_5.length;
				}

				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_6;
			}
		}
	}

	static final void method8758(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		AttributeDefault attributedefault_4 = IndexLoaders.ITEM_DEFAULTS.method7069(i_3, (byte) 0);
		if (attributedefault_4.method7319(2036753920)) {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i_2, 882562729).method3722(i_3, attributedefault_4.aString5335, -379285425);
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i_2, 884887679).method3723(i_3, attributedefault_4.anInt5337, 1942118537);
		}

	}

}
