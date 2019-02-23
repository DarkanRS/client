public class Class323 implements Interface22 {

	Class223 aClass223_3754 = new Class223(256);
	Index textureIndex;
	Index spriteIndex;
	int textureDefSize;
	Class169[] aClass169Array3753;

	TextureDefinition method5770(int i_1, int i_2) {
		CacheableNode cacheablenode_3 = this.aClass223_3754.method3758((long) i_1);
		if (cacheablenode_3 != null) {
			return (TextureDefinition) cacheablenode_3;
		} else {
			byte[] bytes_4 = this.textureIndex.getFile(i_1);
			if (bytes_4 == null) {
				return null;
			} else {
				TextureDefinition texturedefinition_5 = new TextureDefinition(new RsByteBuffer(bytes_4));
				this.aClass223_3754.method3759(texturedefinition_5, (long) i_1);
				return texturedefinition_5;
			}
		}
	}

	public int method84(int i_1) {
		return this.textureDefSize;
	}

	public int method39() {
		return 821306191 * this.textureDefSize * 309531567;
	}

	public Class169 method144(int i_1, int i_2) {
		return this.aClass169Array3753[i_1];
	}

	public void method161(int i_1) {
	}

	public Class323(Index index_1, Index index_2, Index index_3) {
		this.textureIndex = index_2;
		this.spriteIndex = index_3;
		RsByteBuffer rsbytebuffer_4 = new RsByteBuffer(index_1.getFile(0, 0));
		this.textureDefSize = rsbytebuffer_4.readUnsignedShort();
		this.aClass169Array3753 = new Class169[this.textureDefSize];

		int i_5;
		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (rsbytebuffer_4.readUnsignedByte() == 1) {
				this.aClass169Array3753[i_5] = new Class169();
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aBool2056 = rsbytebuffer_4.readUnsignedByte() == 0;
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aBool2065 = rsbytebuffer_4.readUnsignedByte() == 1;
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aBool2072 = rsbytebuffer_4.readUnsignedByte() == 1;
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aByte2080 = rsbytebuffer_4.readByte();
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aByte2079 = rsbytebuffer_4.readByte();
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aByte2064 = rsbytebuffer_4.readByte();
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aByte2076 = rsbytebuffer_4.readByte();
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aShort2073 = (short) rsbytebuffer_4.readUnsignedShort();
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aByte2081 = rsbytebuffer_4.readByte();
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aByte2090 = rsbytebuffer_4.readByte();
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aBool2087 = rsbytebuffer_4.readUnsignedByte() == 1;
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aBool2082 = rsbytebuffer_4.readUnsignedByte() == 1;
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aByte2088 = rsbytebuffer_4.readByte();
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aBool2086 = rsbytebuffer_4.readUnsignedByte() == 1;
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aBool2059 = rsbytebuffer_4.readUnsignedByte() == 1;
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].aBool2089 = rsbytebuffer_4.readUnsignedByte() == 1;
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].anInt2091 = rsbytebuffer_4.readUnsignedByte();
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].anInt2077 = rsbytebuffer_4.readInt();
			}
		}

		for (i_5 = 0; i_5 < this.textureDefSize; i_5++) {
			if (this.aClass169Array3753[i_5] != null) {
				this.aClass169Array3753[i_5].anInt2074 = rsbytebuffer_4.readUnsignedByte();
			}
		}

	}

	public int[] method141(int i_1, float f_2, int i_3, int i_4, boolean bool_5, int i_6) {
		int[] ints_7 = this.method5770(i_1, 1098624376).method14719(this.spriteIndex, this, (double) f_2, i_3, i_4, this.aClass169Array3753[i_1].aBool2082, (byte) -5);
		return ints_7;
	}

	public float[] method145(int i_1, float f_2, int i_3, int i_4, boolean bool_5, int i_6) {
		float[] floats_7 = this.method5770(i_1, 409452943).method14723(this.spriteIndex, this, i_3, i_4, this.aClass169Array3753[i_1].aBool2082, -1771156117);
		return floats_7;
	}

	public boolean method146(int i_1) {
		TextureDefinition texturedefinition_2 = this.method5770(i_1, 1665929764);
		return texturedefinition_2 != null && texturedefinition_2.method14717(this.spriteIndex, this, -1782889034);
	}

	public int method76() {
		return 821306191 * this.textureDefSize * 309531567;
	}

	public boolean method139(int i_1, int i_2) {
		TextureDefinition texturedefinition_3 = this.method5770(i_1, 832620623);
		return texturedefinition_3 != null && texturedefinition_3.method14717(this.spriteIndex, this, -950452873);
	}

	public boolean method150(int i_1) {
		TextureDefinition texturedefinition_2 = this.method5770(i_1, 2122748961);
		return texturedefinition_2 != null && texturedefinition_2.method14717(this.spriteIndex, this, -450865232);
	}

	public float[] method143(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
		float[] floats_6 = this.method5770(i_1, 1967689599).method14723(this.spriteIndex, this, i_3, i_4, this.aClass169Array3753[i_1].aBool2082, -1771156117);
		return floats_6;
	}

	public boolean method147(int i_1) {
		TextureDefinition texturedefinition_2 = this.method5770(i_1, 1168970702);
		return texturedefinition_2 != null && texturedefinition_2.method14717(this.spriteIndex, this, 1117287067);
	}

	public int[] method151(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
		int[] ints_6 = this.method5770(i_1, 1578123890).method14719(this.spriteIndex, this, (double) f_2, i_3, i_4, this.aClass169Array3753[i_1].aBool2082, (byte) -42);
		return ints_6;
	}

	public int[] method149(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
		int[] ints_6 = this.method5770(i_1, 131429824).method14718(this.spriteIndex, this, (double) f_2, i_3, i_4, bool_5, this.aClass169Array3753[i_1].aBool2082, 1932199605);
		return ints_6;
	}

	public int[] method142(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
		int[] ints_6 = this.method5770(i_1, 1541756935).method14718(this.spriteIndex, this, (double) f_2, i_3, i_4, bool_5, this.aClass169Array3753[i_1].aBool2082, 1245157724);
		return ints_6;
	}

	public boolean method148(int i_1) {
		TextureDefinition texturedefinition_2 = this.method5770(i_1, 1141007931);
		return texturedefinition_2 != null && texturedefinition_2.method14717(this.spriteIndex, this, 1414802158);
	}

	public int[] method138(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
		int[] ints_6 = this.method5770(i_1, 638861447).method14718(this.spriteIndex, this, (double) f_2, i_3, i_4, bool_5, this.aClass169Array3753[i_1].aBool2082, 733021009);
		return ints_6;
	}

	public float[] method152(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
		float[] floats_6 = this.method5770(i_1, 795042789).method14723(this.spriteIndex, this, i_3, i_4, this.aClass169Array3753[i_1].aBool2082, -1771156117);
		return floats_6;
	}

	public float[] method154(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
		float[] floats_6 = this.method5770(i_1, 1535419542).method14723(this.spriteIndex, this, i_3, i_4, this.aClass169Array3753[i_1].aBool2082, -1771156117);
		return floats_6;
	}

	public float[] method155(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
		float[] floats_6 = this.method5770(i_1, 777010049).method14723(this.spriteIndex, this, i_3, i_4, this.aClass169Array3753[i_1].aBool2082, -1771156117);
		return floats_6;
	}

	public Class169 method156(int i_1) {
		return this.aClass169Array3753[i_1];
	}

	public void method157() {
	}

	public int[] method140(int i_1, float f_2, int i_3, int i_4, boolean bool_5, byte b_6) {
		int[] ints_7 = this.method5770(i_1, 531210835).method14718(this.spriteIndex, this, (double) f_2, i_3, i_4, bool_5, this.aClass169Array3753[i_1].aBool2082, 112593463);
		return ints_7;
	}

	public void method159() {
	}

	public Class169 method160(int i_1) {
		return this.aClass169Array3753[i_1];
	}

	public float[] method153(int i_1, float f_2, int i_3, int i_4, boolean bool_5) {
		float[] floats_6 = this.method5770(i_1, 1019867788).method14723(this.spriteIndex, this, i_3, i_4, this.aClass169Array3753[i_1].aBool2082, -1771156117);
		return floats_6;
	}

	public void method158() {
	}

	public static int method5773(int i_0, int i_1, byte b_2) {
		int i_3 = i_1 >>> 24;
		int i_4 = 255 - i_3;
		i_1 = (i_3 * (i_1 & 0xff00ff) & ~0xff00ff | i_3 * (i_1 & 0xff00) & 0xff0000) >>> 8;
		return ((i_4 * (i_0 & 0xff00ff) & ~0xff00ff | (i_0 & 0xff00) * i_4 & 0xff0000) >>> 8) + i_1;
	}

	static final void method5774(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class13.method501(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 22);
	}

	static final void method5775(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class363.method6288(icomponentdefinitions_3, interface_4, cs2executor_0, (short) 27570);
	}

	static final void method5776(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		String string_3 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		if (i_2 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_4 = IndexLoaders.ENUM_LOADER.method7424(i_2, (byte) 8);
			if (enumdefinitions_4.aChar5140 != 115) {
				throw new RuntimeException();
			} else {
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = enumdefinitions_4.method7228(string_3, (byte) -23) ? 1 : 0;
			}
		}
	}

	static void method5777(int i_0) {
		if (Engine.AVAILABLE_PROCESSORS > 1) {
			Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub5_8221, 4, 482618320);
		} else {
			Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub5_8221, 2, -2037005846);
		}

	}

	public static int nextPowerOfTwo(int i_0, int i_1) {
		--i_0;
		i_0 |= i_0 >>> 1;
		i_0 |= i_0 >>> 2;
		i_0 |= i_0 >>> 4;
		i_0 |= i_0 >>> 8;
		i_0 |= i_0 >>> 16;
		return i_0 + 1;
	}

}
