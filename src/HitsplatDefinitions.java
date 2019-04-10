public class HitsplatDefinitions {

	HitsplatIndexLoader aClass210_2850;
	public int anInt2849 = -1;
	public int anInt2844 = 16777215;
	public boolean aBool2838 = false;
	int anInt2842 = -1;
	int anInt2851 = -1;
	int anInt2843 = -1;
	int anInt2845 = -1;
	public int anInt2846 = 0;
	String aString2840 = "";
	public int anInt2841 = 70;
	public int anInt2833 = 0;
	public int anInt2847 = -1;
	public int anInt2839 = -1;
	public int anInt2832 = 0;

	public NativeSprite method3832(GraphicalRenderer graphicalrenderer_1) {
		if (this.anInt2851 < 0) {
			return null;
		} else {
			NativeSprite nativesprite_3 = (NativeSprite) this.aClass210_2850.aClass229_2664.get((long) this.anInt2851);
			if (nativesprite_3 == null) {
				this.method3839(graphicalrenderer_1);
				nativesprite_3 = (NativeSprite) this.aClass210_2850.aClass229_2664.get((long) this.anInt2851);
			}

			return nativesprite_3;
		}
	}

	void method3833(RsByteBuffer stream, int opcode) {
		if (opcode == 1) {
			this.anInt2849 = stream.readBigSmart();
		} else if (opcode == 2) {
			this.anInt2844 = stream.read24BitUnsignedInteger();
			this.aBool2838 = true;
		} else if (opcode == 3) {
			this.anInt2842 = stream.readBigSmart();
		} else if (opcode == 4) {
			this.anInt2851 = stream.readBigSmart();
		} else if (opcode == 5) {
			this.anInt2843 = stream.readBigSmart();
		} else if (opcode == 6) {
			this.anInt2845 = stream.readBigSmart();
		} else if (opcode == 7) {
			this.anInt2846 = stream.readShort();
		} else if (opcode == 8) {
			this.aString2840 = stream.readGJString();
		} else if (opcode == 9) {
			this.anInt2841 = stream.readUnsignedShort();
		} else if (opcode == 10) {
			this.anInt2833 = stream.readShort();
		} else if (opcode == 11) {
			this.anInt2847 = 0;
		} else if (opcode == 12) {
			this.anInt2839 = stream.readUnsignedByte();
		} else if (opcode == 13) {
			this.anInt2832 = stream.readShort();
		} else if (opcode == 14) {
			this.anInt2847 = stream.readUnsignedShort();
		}
	}

	public NativeSprite method3835(GraphicalRenderer graphicalrenderer_1) {
		if (this.anInt2842 < 0) {
			return null;
		} else {
			NativeSprite nativesprite_3 = (NativeSprite) this.aClass210_2850.aClass229_2664.get((long) this.anInt2842);
			if (nativesprite_3 == null) {
				this.method3839(graphicalrenderer_1);
				nativesprite_3 = (NativeSprite) this.aClass210_2850.aClass229_2664.get((long) this.anInt2842);
			}

			return nativesprite_3;
		}
	}

	public NativeSprite method3836(GraphicalRenderer graphicalrenderer_1) {
		if (this.anInt2843 < 0) {
			return null;
		} else {
			NativeSprite nativesprite_3 = (NativeSprite) this.aClass210_2850.aClass229_2664.get((long) this.anInt2843);
			if (nativesprite_3 == null) {
				this.method3839(graphicalrenderer_1);
				nativesprite_3 = (NativeSprite) this.aClass210_2850.aClass229_2664.get((long) this.anInt2843);
			}

			return nativesprite_3;
		}
	}

	void method3837(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method3833(rsbytebuffer_1, i_3);
		}
	}

	public NativeSprite method3838(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		if (this.anInt2845 < 0) {
			return null;
		} else {
			NativeSprite nativesprite_3 = (NativeSprite) this.aClass210_2850.aClass229_2664.get((long) this.anInt2845);
			if (nativesprite_3 == null) {
				this.method3839(graphicalrenderer_1);
				nativesprite_3 = (NativeSprite) this.aClass210_2850.aClass229_2664.get((long) this.anInt2845);
			}

			return nativesprite_3;
		}
	}

	void method3839(GraphicalRenderer graphicalrenderer_1) {
		Index index_3 = this.aClass210_2850.aClass317_2666;
		SpriteDefinitions class91_4;
		if (this.anInt2842 >= 0 && this.aClass210_2850.aClass229_2664.get((long) this.anInt2842) == null && index_3.loadFile(this.anInt2842)) {
			class91_4 = SpriteDefinitions.method1515(index_3, this.anInt2842);
			this.aClass210_2850.aClass229_2664.put(graphicalrenderer_1.method8444(class91_4, true), (long) this.anInt2842);
		}

		if (this.anInt2843 >= 0 && this.aClass210_2850.aClass229_2664.get((long) this.anInt2843) == null && index_3.loadFile(this.anInt2843)) {
			class91_4 = SpriteDefinitions.method1515(index_3, this.anInt2843);
			this.aClass210_2850.aClass229_2664.put(graphicalrenderer_1.method8444(class91_4, true), (long) this.anInt2843);
		}

		if (this.anInt2851 >= 0 && this.aClass210_2850.aClass229_2664.get((long) this.anInt2851) == null && index_3.loadFile(this.anInt2851)) {
			class91_4 = SpriteDefinitions.method1515(index_3, this.anInt2851);
			this.aClass210_2850.aClass229_2664.put(graphicalrenderer_1.method8444(class91_4, true), (long) this.anInt2851);
		}

		if (this.anInt2845 >= 0 && this.aClass210_2850.aClass229_2664.get((long) this.anInt2845) == null && index_3.loadFile(this.anInt2845)) {
			class91_4 = SpriteDefinitions.method1515(index_3, this.anInt2845);
			this.aClass210_2850.aClass229_2664.put(graphicalrenderer_1.method8444(class91_4, true), (long) this.anInt2845);
		}

	}

	public String method3844(int i_1, byte b_2) {
		String string_3 = this.aString2840;

		while (true) {
			int i_4 = string_3.indexOf("%1");
			if (i_4 < 0) {
				return string_3;
			}

			string_3 = string_3.substring(0, i_4) + HitbarIndexLoader.method5120(i_1, false, 147527358) + string_3.substring(i_4 + 2);
		}
	}

	public static boolean method3849(int i_0) {
		return i_0 >= SceneObjectType.STRAIGHT_BOTTOM_EDGE_ROOF.type && i_0 <= SceneObjectType.STRAIGHT_BOTTOM_EDGE_CONNECT_CORNER_ROOF.type;
	}

	static void method3850(Matrix44Arr matrix44arr_0, boolean bool_1, float f_2, float f_3, float f_4, float f_5, int i_6, int i_7, byte b_8) {
		int i_9 = IndexLoaders.MAP_REGION_DECODER.method4522(-2126255936);
		int i_10 = IndexLoaders.MAP_REGION_DECODER.method4544(820314682);
		matrix44arr_0.method6531(f_2, f_3, f_4, f_5, (float) i_10, (float) i_9, (float) i_6, (float) i_7);
	}

	static void method3851() {
		for (Class282_Sub50_Sub15 class282_sub50_sub15_1 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_1 != null; class282_sub50_sub15_1 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7955(-395453439)) {
			if (class282_sub50_sub15_1.anInt9769 > 1) {
				class282_sub50_sub15_1.anInt9769 = 0;
				Class20.aClass229_164.put(class282_sub50_sub15_1, ((Class282_Sub50_Sub7) class282_sub50_sub15_1.aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119).aLong9580);
				class282_sub50_sub15_1.aClass477_9770.method7935((byte) 44);
			}
		}

		Class20.anInt170 = 0;
		Class20.anInt169 = 0;
		Class20.aClass482_171.method8118(-1612336586);
		Class20.aClass465_172.method7749(-2124634600);
		Class20.aClass477_182.method7935((byte) 16);
		Class361.method6269(Class20.aClass282_Sub50_Sub7_157);
	}

}
