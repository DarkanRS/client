public class IdentikitDefinition implements Definition {

	Class31 aClass31_429;

	static int anInt430;

	static int anInt431;

	public static int[] anIntArray428 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	public static int[] anIntArray422 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	int[] modelIds;

	short[] originalColours;

	short[] replacementColours;

	short[] originalTextures;

	short[] replacementTextures;

	int[] headModels = new int[] { -1, -1, -1, -1, -1 };

	public RSMesh method895(int i_1) {
		RSMesh[] arr_2 = new RSMesh[5];
		int i_3 = 0;
		Index index_4 = this.aClass31_429.aClass317_359;
		int i_5;
		synchronized (this.aClass31_429.aClass317_359) {
			i_5 = 0;
			while (true) {
				if (i_5 >= 5) {
					break;
				}
				if (this.headModels[i_5] != -1) {
					arr_2[i_3++] = RSMesh.decodeMesh(this.aClass31_429.aClass317_359, this.headModels[i_5]);
				}
				++i_5;
			}
		}
		for (int i_6 = 0; i_6 < 5; i_6++) {
			if (arr_2[i_6] != null && arr_2[i_6].version < 13) {
				arr_2[i_6].upscale();
			}
		}
		RSMesh rsmesh_8 = new RSMesh(arr_2, i_3);
		if (this.originalColours != null) {
			for (i_5 = 0; i_5 < this.originalColours.length; i_5++) {
				rsmesh_8.recolor(this.originalColours[i_5], this.replacementColours[i_5]);
			}
		}
		if (this.originalTextures != null) {
			for (i_5 = 0; i_5 < this.originalTextures.length; i_5++) {
				rsmesh_8.retexture(this.originalTextures[i_5], this.replacementTextures[i_5]);
			}
		}
		return rsmesh_8;
	}

	void method897(RsByteBuffer buffer, int opcode) {
		if (opcode == 1) {
			buffer.readUnsignedByte();
		} else {
			int count;
			int i_5;
			if (opcode == 2) {
				count = buffer.readUnsignedByte();
				this.modelIds = new int[count];
				for (i_5 = 0; i_5 < count; i_5++) {
					this.modelIds[i_5] = buffer.readBigSmart();
				}
			} else if (opcode != 3) {
				if (opcode == 40) {
					count = buffer.readUnsignedByte();
					this.originalColours = new short[count];
					this.replacementColours = new short[count];
					for (i_5 = 0; i_5 < count; i_5++) {
						this.originalColours[i_5] = (short) buffer.readUnsignedShort();
						this.replacementColours[i_5] = (short) buffer.readUnsignedShort();
					}
				} else if (opcode == 41) {
					count = buffer.readUnsignedByte();
					this.originalTextures = new short[count];
					this.replacementTextures = new short[count];
					for (i_5 = 0; i_5 < count; i_5++) {
						this.originalTextures[i_5] = (short) buffer.readUnsignedShort();
						this.replacementTextures[i_5] = (short) buffer.readUnsignedShort();
					}
				} else if (opcode >= 60 && opcode < 70) {
					this.headModels[opcode - 60] = buffer.readBigSmart();
				}
			}
		}
	}

	public boolean method898() {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean bool_2 = true;
			Index index_3 = this.aClass31_429.aClass317_359;
			synchronized (this.aClass31_429.aClass317_359) {
				for (int i_4 = 0; i_4 < this.modelIds.length; i_4++) {
					if (!this.aClass31_429.aClass317_359.load(this.modelIds[i_4], 0)) {
						bool_2 = false;
					}
				}
				return bool_2;
			}
		}
	}

	public RSMesh method899() {
		if (this.modelIds == null) {
			return null;
		} else {
			RSMesh[] arr_2 = new RSMesh[this.modelIds.length];
			Index index_3 = this.aClass31_429.aClass317_359;
			int i_4;
			synchronized (this.aClass31_429.aClass317_359) {
				i_4 = 0;
				while (true) {
					if (i_4 >= this.modelIds.length) {
						break;
					}
					arr_2[i_4] = RSMesh.decodeMesh(this.aClass31_429.aClass317_359, this.modelIds[i_4]);
					++i_4;
				}
			}
			for (int i_5 = 0; i_5 < this.modelIds.length; i_5++) {
				if (arr_2[i_5].version < 13) {
					arr_2[i_5].upscale();
				}
			}
			RSMesh rsmesh_7;
			if (arr_2.length == 1) {
				rsmesh_7 = arr_2[0];
			} else {
				rsmesh_7 = new RSMesh(arr_2, arr_2.length);
			}
			if (rsmesh_7 == null) {
				return null;
			} else {
				if (this.originalColours != null) {
					for (i_4 = 0; i_4 < this.originalColours.length; i_4++) {
						rsmesh_7.recolor(this.originalColours[i_4], this.replacementColours[i_4]);
					}
				}
				if (this.originalTextures != null) {
					for (i_4 = 0; i_4 < this.originalTextures.length; i_4++) {
						rsmesh_7.retexture(this.originalTextures[i_4], this.replacementTextures[i_4]);
					}
				}
				return rsmesh_7;
			}
		}
	}

	public boolean method900() {
		boolean bool_2 = true;
		Index index_3 = this.aClass31_429.aClass317_359;
		synchronized (this.aClass31_429.aClass317_359) {
			for (int i_4 = 0; i_4 < 5; i_4++) {
				if (this.headModels[i_4] != -1 && !this.aClass31_429.aClass317_359.load(this.headModels[i_4], 0)) {
					bool_2 = false;
				}
			}
			return bool_2;
		}
	}

	void method909(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.method897(rsbytebuffer_1, i_3);
		}
	}

	static final void method910(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 513538858) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}
		icomponentdefinitions_0.params = Class351.method6193(string_4, cs2executor_2, 240682174);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static int method912(int i_0) {
		return i_0 == 16711935 ? -1 : Class5.method294(i_0, (byte) -81);
	}

	public static void method913(Interface interface_0, IComponentDefinitions icomponentdefinitions_1) {
		IComponentDefinitions icomponentdefinitions_3 = Class96_Sub23.method14682(interface_0, icomponentdefinitions_1);
		int i_4;
		int i_5;
		if (icomponentdefinitions_3 == null) {
			i_4 = Class349.anInt4083;
			i_5 = client.anInt3243 * -969250379;
		} else {
			i_4 = icomponentdefinitions_3.anInt1301;
			i_5 = icomponentdefinitions_3.anInt1429;
		}
		Class484.method8200(icomponentdefinitions_1, i_4, i_5, false, -342639292);
		Class246.method4204(icomponentdefinitions_1, i_4, i_5, 354709557);
	}
}
