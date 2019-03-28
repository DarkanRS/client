public class RSMesh {

	public int version = 12;
	public int vertexCount = 0;
	public int maxDepth = 0;
	public int faceCount = 0;
	public byte priority = 0;
	public int numTextureTriangles = 0;
	public byte[] textureRenderTypes;
	public int[] vertexX;
	public int[] vertexY;
	public int[] vertexZ;
	public short[] triangleX;
	public short[] triangleY;
	public short[] triangleZ;
	public int[] vertexSkins;
	public byte[] faceType;
	public byte[] facePriorities;
	public byte[] faceAlphas;
	public int[] textureSkins;
	public short[] faceTextures;
	public short[] faceColor;
	public byte[] texturePos;
	public short[] texTriX;
	public short[] texTriY;
	public short[] texTriZ;
	public int[] particleDirectionX;
	public int[] particleDirectionY;
	public int[] particleDirectionZ;
	public byte[] particleLifespanX;
	public byte[] particleLifespanY;
	public int[] particleLifespanZ;
	public int[] texturePrimaryColor;
	public int[] textureSecondaryColor;
	public Surface[] surfaces;
	public SurfaceSkin[] surfaceSkins;
	public VertexNormal[] isolatedVertexNormals;
	public short[] aShortArray1980;
	public short[] aShortArray1981;

	RSMesh(byte[] data) {
		if (data[data.length - 1] == -1 && data[data.length - 2] == -1) {
			this.decodeNewFormat(data);
		} else {
			this.decodeOldFormat(data);
		}

	}

	final int method2657(RSMesh rsmesh_1, int i_2, short s_3) {
		int i_4 = rsmesh_1.vertexX[i_2];
		int i_5 = rsmesh_1.vertexY[i_2];
		int i_6 = rsmesh_1.vertexZ[i_2];

		for (int i_7 = 0; i_7 < this.vertexCount; i_7++) {
			if (i_4 == this.vertexX[i_7] && i_5 == this.vertexY[i_7] && i_6 == this.vertexZ[i_7]) {
				this.aShortArray1980[i_7] |= s_3;
				return i_7;
			}
		}

		this.vertexX[this.vertexCount] = i_4;
		this.vertexY[this.vertexCount] = i_5;
		this.vertexZ[this.vertexCount] = i_6;
		this.aShortArray1980[this.vertexCount] = s_3;
		this.vertexSkins[this.vertexCount] = rsmesh_1.vertexSkins != null ? rsmesh_1.vertexSkins[i_2] : -1;
		return this.vertexCount++;
	}

	void decodeNewFormat(byte[] data) {
		RsByteBuffer buffer = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_3 = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_4 = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_5 = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_6 = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_7 = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_8 = new RsByteBuffer(data);
		buffer.index = data.length - 23;
		this.vertexCount = buffer.readUnsignedShort();
		this.faceCount = buffer.readUnsignedShort();
		this.numTextureTriangles = buffer.readUnsignedByte();
		int i_9 = buffer.readUnsignedByte();
		boolean bool_10 = (i_9 & 0x1) == 1;
		boolean bool_11 = (i_9 & 0x2) == 2;
		boolean bool_12 = (i_9 & 0x4) == 4;
		boolean bool_13 = (i_9 & 0x8) == 8;
		if (bool_13) {
			buffer.index -= 7;
			this.version = buffer.readUnsignedByte();
			buffer.index += 6;
		}

		int modelPriority = buffer.readUnsignedByte();
		int i_15 = buffer.readUnsignedByte();
		int i_16 = buffer.readUnsignedByte();
		int i_17 = buffer.readUnsignedByte();
		int modelSkins = buffer.readUnsignedByte();
		int i_19 = buffer.readUnsignedShort();
		int i_20 = buffer.readUnsignedShort();
		int i_21 = buffer.readUnsignedShort();
		int i_22 = buffer.readUnsignedShort();
		int i_23 = buffer.readUnsignedShort();
		int textureCount = 0;
		int i_25 = 0;
		int i_26 = 0;
		int i_27;
		if (this.numTextureTriangles > 0) {
			this.textureRenderTypes = new byte[this.numTextureTriangles];
			buffer.index = 0;

			for (i_27 = 0; i_27 < this.numTextureTriangles; i_27++) {
				byte b_28 = this.textureRenderTypes[i_27] = buffer.readByte();
				if (b_28 == 0) {
					++textureCount;
				}

				if (b_28 >= 1 && b_28 <= 3) {
					++i_25;
				}

				if (b_28 == 2) {
					++i_26;
				}
			}
		}

		i_27 = this.numTextureTriangles;
		int i_59 = i_27;
		i_27 += this.vertexCount;
		int i_29 = i_27;
		if (bool_10) {
			i_27 += this.faceCount;
		}

		int i_30 = i_27;
		i_27 += this.faceCount;
		int i_31 = i_27;
		if (modelPriority == 255) {
			i_27 += this.faceCount;
		}

		int i_32 = i_27;
		if (i_16 == 1) {
			i_27 += this.faceCount;
		}

		int i_33 = i_27;
		if (modelSkins == 1) {
			i_27 += this.vertexCount;
		}

		int i_34 = i_27;
		if (i_15 == 1) {
			i_27 += this.faceCount;
		}

		int i_35 = i_27;
		i_27 += i_22;
		int i_36 = i_27;
		if (i_17 == 1) {
			i_27 += this.faceCount * 2;
		}

		int i_37 = i_27;
		i_27 += i_23;
		int i_38 = i_27;
		i_27 += this.faceCount * 2;
		int i_39 = i_27;
		i_27 += i_19;
		int i_40 = i_27;
		i_27 += i_20;
		int i_41 = i_27;
		i_27 += i_21;
		int i_42 = i_27;
		i_27 += textureCount * 6;
		int i_43 = i_27;
		i_27 += i_25 * 6;
		byte b_44 = 6;
		if (this.version == 14) {
			b_44 = 7;
		} else if (this.version >= 15) {
			b_44 = 9;
		}

		int i_45 = i_27;
		i_27 += i_25 * b_44;
		int i_46 = i_27;
		i_27 += i_25;
		int i_47 = i_27;
		i_27 += i_25;
		int i_48 = i_27;
		i_27 = i_26 * 2 + i_27 + i_25;
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.triangleX = new short[this.faceCount];
		this.triangleY = new short[this.faceCount];
		this.triangleZ = new short[this.faceCount];
		if (modelSkins == 1) {
			this.vertexSkins = new int[this.vertexCount];
		}

		if (bool_10) {
			this.faceType = new byte[this.faceCount];
		}

		if (modelPriority == 255) {
			this.facePriorities = new byte[this.faceCount];
		} else {
			this.priority = (byte) modelPriority;
		}

		if (i_15 == 1) {
			this.faceAlphas = new byte[this.faceCount];
		}

		if (i_16 == 1) {
			this.textureSkins = new int[this.faceCount];
		}

		if (i_17 == 1) {
			this.faceTextures = new short[this.faceCount];
		}

		if (i_17 == 1 && this.numTextureTriangles > 0) {
			this.texturePos = new byte[this.faceCount];
		}

		this.faceColor = new short[this.faceCount];
		if (this.numTextureTriangles > 0) {
			this.texTriX = new short[this.numTextureTriangles];
			this.texTriY = new short[this.numTextureTriangles];
			this.texTriZ = new short[this.numTextureTriangles];
			if (i_25 > 0) {
				this.particleDirectionX = new int[i_25];
				this.particleDirectionY = new int[i_25];
				this.particleDirectionZ = new int[i_25];
				this.particleLifespanX = new byte[i_25];
				this.particleLifespanY = new byte[i_25];
				this.particleLifespanZ = new int[i_25];
			}

			if (i_26 > 0) {
				this.texturePrimaryColor = new int[i_26];
				this.textureSecondaryColor = new int[i_26];
			}
		}

		buffer.index = i_59;
		rsbytebuffer_3.index = i_39;
		rsbytebuffer_4.index = i_40;
		rsbytebuffer_5.index = i_41;
		rsbytebuffer_6.index = i_33;
		int i_50 = 0;
		int i_51 = 0;
		int i_52 = 0;

		int i_53;
		int flags;
		int vertextOffsetX;
		int vertextOffsetY;
		int vertetxOffsetZ;
		for (i_53 = 0; i_53 < this.vertexCount; i_53++) {
			flags = buffer.readUnsignedByte();
			vertextOffsetX = 0;
			if ((flags & 0x1) != 0) {
				vertextOffsetX = rsbytebuffer_3.readSmart();
			}

			vertextOffsetY = 0;
			if ((flags & 0x2) != 0) {
				vertextOffsetY = rsbytebuffer_4.readSmart();
			}

			vertetxOffsetZ = 0;
			if ((flags & 0x4) != 0) {
				vertetxOffsetZ = rsbytebuffer_5.readSmart();
			}

			this.vertexX[i_53] = i_50 + vertextOffsetX;
			this.vertexY[i_53] = i_51 + vertextOffsetY;
			this.vertexZ[i_53] = i_52 + vertetxOffsetZ;
			i_50 = this.vertexX[i_53];
			i_51 = this.vertexY[i_53];
			i_52 = this.vertexZ[i_53];
			if (modelSkins == 1) {
				this.vertexSkins[i_53] = rsbytebuffer_6.readUnsignedByte();
			}
		}

		buffer.index = i_38;
		rsbytebuffer_3.index = i_29;
		rsbytebuffer_4.index = i_31;
		rsbytebuffer_5.index = i_34;
		rsbytebuffer_6.index = i_32;
		rsbytebuffer_7.index = i_36;
		rsbytebuffer_8.index = i_37;

		for (i_53 = 0; i_53 < this.faceCount; i_53++) {
			this.faceColor[i_53] = (short) buffer.readUnsignedShort();
			if (bool_10) {
				this.faceType[i_53] = rsbytebuffer_3.readByte();
			}

			if (modelPriority == 255) {
				this.facePriorities[i_53] = rsbytebuffer_4.readByte();
			}

			if (i_15 == 1) {
				this.faceAlphas[i_53] = rsbytebuffer_5.readByte();
			}

			if (i_16 == 1) {
				this.textureSkins[i_53] = rsbytebuffer_6.readUnsignedByte();
			}

			if (i_17 == 1) {
				this.faceTextures[i_53] = (short) (rsbytebuffer_7.readUnsignedShort() - 1);
			}

			if (this.texturePos != null) {
				if (this.faceTextures[i_53] != -1) {
					this.texturePos[i_53] = (byte) (rsbytebuffer_8.readUnsignedByte() - 1);
				} else {
					this.texturePos[i_53] = -1;
				}
			}
		}

		this.maxDepth = -1;
		buffer.index = i_35;
		rsbytebuffer_3.index = i_30;
		this.calculateMaxDepth(buffer, rsbytebuffer_3);
		buffer.index = i_42;
		rsbytebuffer_3.index = i_43;
		rsbytebuffer_4.index = i_45;
		rsbytebuffer_5.index = i_46;
		rsbytebuffer_6.index = i_47;
		rsbytebuffer_7.index = i_48;
		this.decodeTexturedTriangles(buffer, rsbytebuffer_3, rsbytebuffer_4, rsbytebuffer_5, rsbytebuffer_6, rsbytebuffer_7);
		buffer.index = i_27;
		if (bool_11) {
			i_53 = buffer.readUnsignedByte();
			if (i_53 > 0) {
				this.surfaces = new Surface[i_53];

				for (flags = 0; flags < i_53; flags++) {
					vertextOffsetX = buffer.readUnsignedShort();
					vertextOffsetY = buffer.readUnsignedShort();
					byte b_60;
					if (modelPriority == 255) {
						b_60 = this.facePriorities[vertextOffsetY];
					} else {
						b_60 = (byte) modelPriority;
					}

					this.surfaces[flags] = new Surface(vertextOffsetX, this.triangleX[vertextOffsetY], this.triangleY[vertextOffsetY], this.triangleZ[vertextOffsetY], b_60);
				}
			}

			flags = buffer.readUnsignedByte();
			if (flags > 0) {
				this.surfaceSkins = new SurfaceSkin[flags];

				for (vertextOffsetX = 0; vertextOffsetX < flags; vertextOffsetX++) {
					vertextOffsetY = buffer.readUnsignedShort();
					vertetxOffsetZ = buffer.readUnsignedShort();
					this.surfaceSkins[vertextOffsetX] = new SurfaceSkin(vertextOffsetY, vertetxOffsetZ);
				}
			}
		}

		if (bool_12) {
			i_53 = buffer.readUnsignedByte();
			if (i_53 > 0) {
				this.isolatedVertexNormals = new VertexNormal[i_53];

				for (flags = 0; flags < i_53; flags++) {
					vertextOffsetX = buffer.readUnsignedShort();
					vertextOffsetY = buffer.readUnsignedShort();
					vertetxOffsetZ = buffer.readUnsignedByte();
					byte b_58 = buffer.readByte();
					this.isolatedVertexNormals[flags] = new VertexNormal(vertextOffsetX, vertextOffsetY, vertetxOffsetZ, b_58);
				}
			}
		}

	}

	void calculateMaxDepth(RsByteBuffer rsbytebuffer_1, RsByteBuffer rsbytebuffer_2) {
		short s_3 = 0;
		short s_4 = 0;
		short s_5 = 0;
		short s_6 = 0;

		for (int i_7 = 0; i_7 < this.faceCount; i_7++) {
			int i_8 = rsbytebuffer_2.readUnsignedByte();
			if (i_8 == 1) {
				s_3 = (short) (rsbytebuffer_1.readSmart() + s_6);
				s_4 = (short) (rsbytebuffer_1.readSmart() + s_3);
				s_5 = (short) (rsbytebuffer_1.readSmart() + s_4);
				s_6 = s_5;
				this.triangleX[i_7] = s_3;
				this.triangleY[i_7] = s_4;
				this.triangleZ[i_7] = s_5;
				if (s_3 > this.maxDepth) {
					this.maxDepth = s_3;
				}

				if (s_4 > this.maxDepth) {
					this.maxDepth = s_4;
				}

				if (s_5 > this.maxDepth) {
					this.maxDepth = s_5;
				}
			}

			if (i_8 == 2) {
				s_4 = s_5;
				s_5 = (short) (rsbytebuffer_1.readSmart() + s_6);
				s_6 = s_5;
				this.triangleX[i_7] = s_3;
				this.triangleY[i_7] = s_4;
				this.triangleZ[i_7] = s_5;
				if (s_5 > this.maxDepth) {
					this.maxDepth = s_5;
				}
			}

			if (i_8 == 3) {
				s_3 = s_5;
				s_5 = (short) (rsbytebuffer_1.readSmart() + s_6);
				s_6 = s_5;
				this.triangleX[i_7] = s_3;
				this.triangleY[i_7] = s_4;
				this.triangleZ[i_7] = s_5;
				if (s_5 > this.maxDepth) {
					this.maxDepth = s_5;
				}
			}

			if (i_8 == 4) {
				short s_9 = s_3;
				s_3 = s_4;
				s_4 = s_9;
				s_5 = (short) (rsbytebuffer_1.readSmart() + s_6);
				s_6 = s_5;
				this.triangleX[i_7] = s_3;
				this.triangleY[i_7] = s_9;
				this.triangleZ[i_7] = s_5;
				if (s_5 > this.maxDepth) {
					this.maxDepth = s_5;
				}
			}
		}

		++this.maxDepth;
	}

	void decodeTexturedTriangles(RsByteBuffer rsbytebuffer_1, RsByteBuffer rsbytebuffer_2, RsByteBuffer rsbytebuffer_3, RsByteBuffer rsbytebuffer_4, RsByteBuffer rsbytebuffer_5, RsByteBuffer rsbytebuffer_6) {
		for (int i_7 = 0; i_7 < this.numTextureTriangles; i_7++) {
			int i_8 = this.textureRenderTypes[i_7] & 0xff;
			if (i_8 == 0) {
				this.texTriX[i_7] = (short) rsbytebuffer_1.readUnsignedShort();
				this.texTriY[i_7] = (short) rsbytebuffer_1.readUnsignedShort();
				this.texTriZ[i_7] = (short) rsbytebuffer_1.readUnsignedShort();
			}

			if (i_8 == 1) {
				this.texTriX[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.texTriY[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.texTriZ[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				if (this.version < 15) {
					this.particleDirectionX[i_7] = rsbytebuffer_3.readUnsignedShort();
					if (this.version < 14) {
						this.particleDirectionY[i_7] = rsbytebuffer_3.readUnsignedShort();
					} else {
						this.particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					}

					this.particleDirectionZ[i_7] = rsbytebuffer_3.readUnsignedShort();
				} else {
					this.particleDirectionX[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.particleDirectionZ[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
				}

				this.particleLifespanX[i_7] = rsbytebuffer_4.readByte();
				this.particleLifespanY[i_7] = rsbytebuffer_5.readByte();
				this.particleLifespanZ[i_7] = rsbytebuffer_6.readByte();
			}

			if (i_8 == 2) {
				this.texTriX[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.texTriY[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.texTriZ[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				if (this.version < 15) {
					this.particleDirectionX[i_7] = rsbytebuffer_3.readUnsignedShort();
					if (this.version < 14) {
						this.particleDirectionY[i_7] = rsbytebuffer_3.readUnsignedShort();
					} else {
						this.particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					}

					this.particleDirectionZ[i_7] = rsbytebuffer_3.readUnsignedShort();
				} else {
					this.particleDirectionX[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.particleDirectionZ[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
				}

				this.particleLifespanX[i_7] = rsbytebuffer_4.readByte();
				this.particleLifespanY[i_7] = rsbytebuffer_5.readByte();
				this.particleLifespanZ[i_7] = rsbytebuffer_6.readByte();
				this.texturePrimaryColor[i_7] = rsbytebuffer_6.readByte();
				this.textureSecondaryColor[i_7] = rsbytebuffer_6.readByte();
			}

			if (i_8 == 3) {
				this.texTriX[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.texTriY[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.texTriZ[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				if (this.version < 15) {
					this.particleDirectionX[i_7] = rsbytebuffer_3.readUnsignedShort();
					if (this.version < 14) {
						this.particleDirectionY[i_7] = rsbytebuffer_3.readUnsignedShort();
					} else {
						this.particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					}

					this.particleDirectionZ[i_7] = rsbytebuffer_3.readUnsignedShort();
				} else {
					this.particleDirectionX[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.particleDirectionY[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.particleDirectionZ[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
				}

				this.particleLifespanX[i_7] = rsbytebuffer_4.readByte();
				this.particleLifespanY[i_7] = rsbytebuffer_5.readByte();
				this.particleLifespanZ[i_7] = rsbytebuffer_6.readByte();
			}
		}

	}

	public int method2662(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < this.vertexCount; i_4++) {
			if (this.vertexX[i_4] == i_1 && i_2 == this.vertexY[i_4] && i_3 == this.vertexZ[i_4]) {
				return i_4;
			}
		}

		this.vertexX[this.vertexCount] = i_1;
		this.vertexY[this.vertexCount] = i_2;
		this.vertexZ[this.vertexCount] = i_3;
		this.maxDepth = this.vertexCount + 1;
		return this.vertexCount++;
	}

	public int method2663(int i_1, int i_2, int i_3, byte b_4, byte b_5, short s_6, byte b_7, short s_8) {
		this.triangleX[this.faceCount] = (short) i_1;
		this.triangleY[this.faceCount] = (short) i_2;
		this.triangleZ[this.faceCount] = (short) i_3;
		this.faceType[this.faceCount] = b_4;
		this.texturePos[this.faceCount] = b_5;
		this.faceColor[this.faceCount] = s_6;
		this.faceAlphas[this.faceCount] = b_7;
		this.faceTextures[this.faceCount] = s_8;
		return this.faceCount++;
	}

	public byte method2664() {
		if (this.numTextureTriangles >= 255) {
			throw new IllegalStateException();
		} else {
			this.textureRenderTypes[this.numTextureTriangles] = 3;
			this.texTriX[this.numTextureTriangles] = (short) 0;
			this.texTriY[this.numTextureTriangles] = (short) 32767;
			this.texTriZ[this.numTextureTriangles] = (short) 0;
			this.particleDirectionX[this.numTextureTriangles] = (short) 1024;
			this.particleDirectionY[this.numTextureTriangles] = (short) 1024;
			this.particleDirectionZ[this.numTextureTriangles] = (short) 1024;
			this.particleLifespanX[this.numTextureTriangles] = (byte) 0;
			this.particleLifespanY[this.numTextureTriangles] = (byte) 0;
			this.particleLifespanZ[this.numTextureTriangles] = (byte) 0;
			return (byte) (this.numTextureTriangles++);
		}
	}

	public int[][] getBones(boolean bool_1) {
		int[] ints_2 = new int[256];
		int i_3 = 0;
		int i_4 = bool_1 ? this.vertexCount : this.maxDepth;

		int i_6;
		for (int i_5 = 0; i_5 < i_4; i_5++) {
			i_6 = this.vertexSkins[i_5];
			if (i_6 >= 0) {
				++ints_2[i_6];
				if (i_6 > i_3) {
					i_3 = i_6;
				}
			}
		}

		int[][] ints_8 = new int[i_3 + 1][];

		for (i_6 = 0; i_6 <= i_3; i_6++) {
			ints_8[i_6] = new int[ints_2[i_6]];
			ints_2[i_6] = 0;
		}

		for (i_6 = 0; i_6 < i_4; i_6++) {
			int i_7 = this.vertexSkins[i_6];
			if (i_7 >= 0) {
				ints_8[i_7][ints_2[i_7]++] = i_6;
			}
		}

		return ints_8;
	}

	public int[][] method2666() {
		int[] ints_1 = new int[256];
		int i_2 = 0;

		int i_4;
		for (int i_3 = 0; i_3 < this.faceCount; i_3++) {
			i_4 = this.textureSkins[i_3];
			if (i_4 >= 0) {
				++ints_1[i_4];
				if (i_4 > i_2) {
					i_2 = i_4;
				}
			}
		}

		int[][] ints_6 = new int[i_2 + 1][];

		for (i_4 = 0; i_4 <= i_2; i_4++) {
			ints_6[i_4] = new int[ints_1[i_4]];
			ints_1[i_4] = 0;
		}

		for (i_4 = 0; i_4 < this.faceCount; i_4++) {
			int i_5 = this.textureSkins[i_4];
			if (i_5 >= 0) {
				ints_6[i_5][ints_1[i_5]++] = i_4;
			}
		}

		return ints_6;
	}

	public int[][] method2667() {
		int[] ints_1 = new int[256];
		int i_2 = 0;

		int i_4;
		for (int i_3 = 0; i_3 < this.isolatedVertexNormals.length; i_3++) {
			i_4 = this.isolatedVertexNormals[i_3].anInt811;
			if (i_4 >= 0) {
				++ints_1[i_4];
				if (i_4 > i_2) {
					i_2 = i_4;
				}
			}
		}

		int[][] ints_6 = new int[i_2 + 1][];

		for (i_4 = 0; i_4 <= i_2; i_4++) {
			ints_6[i_4] = new int[ints_1[i_4]];
			ints_1[i_4] = 0;
		}

		for (i_4 = 0; i_4 < this.isolatedVertexNormals.length; i_4++) {
			int i_5 = this.isolatedVertexNormals[i_4].anInt811;
			if (i_5 >= 0) {
				ints_6[i_5][ints_1[i_5]++] = i_4;
			}
		}

		return ints_6;
	}

	public void recolor(short s_1, short s_2) {
		for (int i_3 = 0; i_3 < this.faceCount; i_3++) {
			if (this.faceColor[i_3] == s_1) {
				this.faceColor[i_3] = s_2;
			}
		}

	}

	public void retexture(short s_1, short s_2) {
		if (this.faceTextures != null) {
			for (int i_3 = 0; i_3 < this.faceCount; i_3++) {
				if (this.faceTextures[i_3] == s_1) {
					this.faceTextures[i_3] = s_2;
				}
			}
		}

	}

	public void method2671(int i_1, int i_2, int i_3) {
		int i_4;
		int i_5;
		int i_6;
		int i_7;
		if (i_3 != 0) {
			i_4 = Class382.anIntArray4657[i_3];
			i_5 = Class382.anIntArray4661[i_3];

			for (i_6 = 0; i_6 < this.vertexCount; i_6++) {
				i_7 = i_4 * this.vertexY[i_6] + i_5 * this.vertexX[i_6] >> 14;
				this.vertexY[i_6] = i_5 * this.vertexY[i_6] - i_4 * this.vertexX[i_6] >> 14;
				this.vertexX[i_6] = i_7;
			}
		}

		if (i_1 != 0) {
			i_4 = Class382.anIntArray4657[i_1];
			i_5 = Class382.anIntArray4661[i_1];

			for (i_6 = 0; i_6 < this.vertexCount; i_6++) {
				i_7 = i_5 * this.vertexY[i_6] - i_4 * this.vertexZ[i_6] >> 14;
				this.vertexZ[i_6] = i_4 * this.vertexY[i_6] + i_5 * this.vertexZ[i_6] >> 14;
				this.vertexY[i_6] = i_7;
			}
		}

		if (i_2 != 0) {
			i_4 = Class382.anIntArray4657[i_2];
			i_5 = Class382.anIntArray4661[i_2];

			for (i_6 = 0; i_6 < this.vertexCount; i_6++) {
				i_7 = i_4 * this.vertexZ[i_6] + i_5 * this.vertexX[i_6] >> 14;
				this.vertexZ[i_6] = i_5 * this.vertexZ[i_6] - i_4 * this.vertexX[i_6] >> 14;
				this.vertexX[i_6] = i_7;
			}
		}

	}

	void decodeOldFormat(byte[] bytes_1) {
		boolean bool_2 = false;
		boolean bool_3 = false;
		RsByteBuffer rsbytebuffer_4 = new RsByteBuffer(bytes_1);
		RsByteBuffer rsbytebuffer_5 = new RsByteBuffer(bytes_1);
		RsByteBuffer rsbytebuffer_6 = new RsByteBuffer(bytes_1);
		RsByteBuffer rsbytebuffer_7 = new RsByteBuffer(bytes_1);
		RsByteBuffer rsbytebuffer_8 = new RsByteBuffer(bytes_1);
		rsbytebuffer_4.index = bytes_1.length - 18;
		this.vertexCount = rsbytebuffer_4.readUnsignedShort();
		this.faceCount = rsbytebuffer_4.readUnsignedShort();
		this.numTextureTriangles = rsbytebuffer_4.readUnsignedByte();
		int i_9 = rsbytebuffer_4.readUnsignedByte();
		int i_10 = rsbytebuffer_4.readUnsignedByte();
		int i_11 = rsbytebuffer_4.readUnsignedByte();
		int i_12 = rsbytebuffer_4.readUnsignedByte();
		int i_13 = rsbytebuffer_4.readUnsignedByte();
		int i_14 = rsbytebuffer_4.readUnsignedShort();
		int i_15 = rsbytebuffer_4.readUnsignedShort();
		int i_16 = rsbytebuffer_4.readUnsignedShort();
		int i_17 = rsbytebuffer_4.readUnsignedShort();
		byte b_18 = 0;
		int i_42 = b_18 + this.vertexCount;
		int i_20 = i_42;
		i_42 += this.faceCount;
		int i_21 = i_42;
		if (i_10 == 255) {
			i_42 += this.faceCount;
		}

		int i_22 = i_42;
		if (i_12 == 1) {
			i_42 += this.faceCount;
		}

		int i_23 = i_42;
		if (i_9 == 1) {
			i_42 += this.faceCount;
		}

		int i_24 = i_42;
		if (i_13 == 1) {
			i_42 += this.vertexCount;
		}

		int i_25 = i_42;
		if (i_11 == 1) {
			i_42 += this.faceCount;
		}

		int i_26 = i_42;
		i_42 += i_17;
		int i_27 = i_42;
		i_42 += this.faceCount * 2;
		int i_28 = i_42;
		i_42 += this.numTextureTriangles * 6;
		int i_29 = i_42;
		i_42 += i_14;
		int i_30 = i_42;
		i_42 += i_15;
		int i_10000 = i_42 + i_16;
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.triangleX = new short[this.faceCount];
		this.triangleY = new short[this.faceCount];
		this.triangleZ = new short[this.faceCount];
		if (this.numTextureTriangles > 0) {
			this.textureRenderTypes = new byte[this.numTextureTriangles];
			this.texTriX = new short[this.numTextureTriangles];
			this.texTriY = new short[this.numTextureTriangles];
			this.texTriZ = new short[this.numTextureTriangles];
		}

		if (i_13 == 1) {
			this.vertexSkins = new int[this.vertexCount];
		}

		if (i_9 == 1) {
			this.faceType = new byte[this.faceCount];
			this.texturePos = new byte[this.faceCount];
			this.faceTextures = new short[this.faceCount];
		}

		if (i_10 == 255) {
			this.facePriorities = new byte[this.faceCount];
		} else {
			this.priority = (byte) i_10;
		}

		if (i_11 == 1) {
			this.faceAlphas = new byte[this.faceCount];
		}

		if (i_12 == 1) {
			this.textureSkins = new int[this.faceCount];
		}

		this.faceColor = new short[this.faceCount];
		rsbytebuffer_4.index = b_18;
		rsbytebuffer_5.index = i_29;
		rsbytebuffer_6.index = i_30;
		rsbytebuffer_7.index = i_42;
		rsbytebuffer_8.index = i_24;
		int i_32 = 0;
		int i_33 = 0;
		int i_34 = 0;

		int i_35;
		int i_36;
		int i_39;
		for (i_35 = 0; i_35 < this.vertexCount; i_35++) {
			i_36 = rsbytebuffer_4.readUnsignedByte();
			int i_37 = 0;
			if ((i_36 & 0x1) != 0) {
				i_37 = rsbytebuffer_5.readSmart();
			}

			int i_38 = 0;
			if ((i_36 & 0x2) != 0) {
				i_38 = rsbytebuffer_6.readSmart();
			}

			i_39 = 0;
			if ((i_36 & 0x4) != 0) {
				i_39 = rsbytebuffer_7.readSmart();
			}

			this.vertexX[i_35] = i_32 + i_37;
			this.vertexY[i_35] = i_33 + i_38;
			this.vertexZ[i_35] = i_34 + i_39;
			i_32 = this.vertexX[i_35];
			i_33 = this.vertexY[i_35];
			i_34 = this.vertexZ[i_35];
			if (i_13 == 1) {
				this.vertexSkins[i_35] = rsbytebuffer_8.readUnsignedByte();
			}
		}

		rsbytebuffer_4.index = i_27;
		rsbytebuffer_5.index = i_23;
		rsbytebuffer_6.index = i_21;
		rsbytebuffer_7.index = i_25;
		rsbytebuffer_8.index = i_22;

		for (i_35 = 0; i_35 < this.faceCount; i_35++) {
			this.faceColor[i_35] = (short) rsbytebuffer_4.readUnsignedShort();
			if (i_9 == 1) {
				i_36 = rsbytebuffer_5.readUnsignedByte();
				if ((i_36 & 0x1) == 1) {
					this.faceType[i_35] = 1;
					bool_2 = true;
				} else {
					this.faceType[i_35] = 0;
				}

				if ((i_36 & 0x2) == 2) {
					this.texturePos[i_35] = (byte) (i_36 >> 2);
					this.faceTextures[i_35] = this.faceColor[i_35];
					this.faceColor[i_35] = 127;
					if (this.faceTextures[i_35] != -1) {
						bool_3 = true;
					}
				} else {
					this.texturePos[i_35] = -1;
					this.faceTextures[i_35] = -1;
				}
			}

			if (i_10 == 255) {
				this.facePriorities[i_35] = rsbytebuffer_6.readByte();
			}

			if (i_11 == 1) {
				this.faceAlphas[i_35] = rsbytebuffer_7.readByte();
			}

			if (i_12 == 1) {
				this.textureSkins[i_35] = rsbytebuffer_8.readUnsignedByte();
			}
		}

		this.maxDepth = -1;
		rsbytebuffer_4.index = i_26;
		rsbytebuffer_5.index = i_20;
		short s_43 = 0;
		short s_44 = 0;
		short s_45 = 0;
		short s_46 = 0;

		int i_40;
		for (i_39 = 0; i_39 < this.faceCount; i_39++) {
			i_40 = rsbytebuffer_5.readUnsignedByte();
			if (i_40 == 1) {
				s_43 = (short) (rsbytebuffer_4.readSmart() + s_46);
				s_44 = (short) (rsbytebuffer_4.readSmart() + s_43);
				s_45 = (short) (rsbytebuffer_4.readSmart() + s_44);
				s_46 = s_45;
				this.triangleX[i_39] = s_43;
				this.triangleY[i_39] = s_44;
				this.triangleZ[i_39] = s_45;
				if (s_43 > this.maxDepth) {
					this.maxDepth = s_43;
				}

				if (s_44 > this.maxDepth) {
					this.maxDepth = s_44;
				}

				if (s_45 > this.maxDepth) {
					this.maxDepth = s_45;
				}
			}

			if (i_40 == 2) {
				s_44 = s_45;
				s_45 = (short) (rsbytebuffer_4.readSmart() + s_46);
				s_46 = s_45;
				this.triangleX[i_39] = s_43;
				this.triangleY[i_39] = s_44;
				this.triangleZ[i_39] = s_45;
				if (s_45 > this.maxDepth) {
					this.maxDepth = s_45;
				}
			}

			if (i_40 == 3) {
				s_43 = s_45;
				s_45 = (short) (rsbytebuffer_4.readSmart() + s_46);
				s_46 = s_45;
				this.triangleX[i_39] = s_43;
				this.triangleY[i_39] = s_44;
				this.triangleZ[i_39] = s_45;
				if (s_45 > this.maxDepth) {
					this.maxDepth = s_45;
				}
			}

			if (i_40 == 4) {
				short s_41 = s_43;
				s_43 = s_44;
				s_44 = s_41;
				s_45 = (short) (rsbytebuffer_4.readSmart() + s_46);
				s_46 = s_45;
				this.triangleX[i_39] = s_43;
				this.triangleY[i_39] = s_41;
				this.triangleZ[i_39] = s_45;
				if (s_45 > this.maxDepth) {
					this.maxDepth = s_45;
				}
			}
		}

		++this.maxDepth;
		rsbytebuffer_4.index = i_28;

		for (i_39 = 0; i_39 < this.numTextureTriangles; i_39++) {
			this.textureRenderTypes[i_39] = 0;
			this.texTriX[i_39] = (short) rsbytebuffer_4.readUnsignedShort();
			this.texTriY[i_39] = (short) rsbytebuffer_4.readUnsignedShort();
			this.texTriZ[i_39] = (short) rsbytebuffer_4.readUnsignedShort();
		}

		if (this.texturePos != null) {
			boolean bool_47 = false;

			for (i_40 = 0; i_40 < this.faceCount; i_40++) {
				int i_48 = this.texturePos[i_40] & 0xff;
				if (i_48 != 255) {
					if (this.triangleX[i_40] == (this.texTriX[i_48] & 0xffff) && this.triangleY[i_40] == (this.texTriY[i_48] & 0xffff) && this.triangleZ[i_40] == (this.texTriZ[i_48] & 0xffff)) {
						this.texturePos[i_40] = -1;
					} else {
						bool_47 = true;
					}
				}
			}

			if (!bool_47) {
				this.texturePos = null;
			}
		}

		if (!bool_3) {
			this.faceTextures = null;
		}

		if (!bool_2) {
			this.faceType = null;
		}

	}

	public void upscale() {
		int i_2;
		for (i_2 = 0; i_2 < this.vertexCount; i_2++) {
			this.vertexX[i_2] <<= 2;
			this.vertexY[i_2] <<= 2;
			this.vertexZ[i_2] <<= 2;
		}

		if (this.numTextureTriangles > 0 && this.particleDirectionX != null) {
			for (i_2 = 0; i_2 < this.particleDirectionX.length; i_2++) {
				this.particleDirectionX[i_2] <<= 2;
				this.particleDirectionY[i_2] <<= 2;
				if (this.textureRenderTypes[i_2] != 1) {
					this.particleDirectionZ[i_2] <<= 2;
				}
			}
		}

	}

	public static RSMesh decodeMesh(Index index_0, int i_1) {
		byte[] bytes_3 = index_0.getFile(i_1, 0);
		return bytes_3 == null ? null : new RSMesh(bytes_3);
	}

	public RSMesh(RSMesh[] arr_1, int i_2) {
		this.vertexCount = 0;
		this.faceCount = 0;
		this.numTextureTriangles = 0;
		int i_3 = 0;
		int i_4 = 0;
		int i_5 = 0;
		boolean bool_6 = false;
		boolean bool_7 = false;
		boolean bool_8 = false;
		boolean bool_9 = false;
		boolean bool_10 = false;
		boolean bool_11 = false;
		this.priority = -1;

		int i_12;
		for (i_12 = 0; i_12 < i_2; i_12++) {
			RSMesh rsmesh_22 = arr_1[i_12];
			if (rsmesh_22 != null) {
				this.vertexCount += rsmesh_22.vertexCount;
				this.faceCount += rsmesh_22.faceCount;
				this.numTextureTriangles += rsmesh_22.numTextureTriangles;
				if (rsmesh_22.surfaces != null) {
					i_3 += rsmesh_22.surfaces.length;
				}

				if (rsmesh_22.surfaceSkins != null) {
					i_4 += rsmesh_22.surfaceSkins.length;
				}

				if (rsmesh_22.isolatedVertexNormals != null) {
					i_5 += rsmesh_22.isolatedVertexNormals.length;
				}

				bool_6 |= rsmesh_22.faceType != null;
				if (rsmesh_22.facePriorities != null) {
					bool_7 = true;
				} else {
					if (this.priority == -1) {
						this.priority = rsmesh_22.priority;
					}

					if (this.priority != rsmesh_22.priority) {
						bool_7 = true;
					}
				}

				bool_8 |= rsmesh_22.faceAlphas != null;
				bool_9 |= rsmesh_22.texturePos != null;
				bool_10 |= rsmesh_22.faceTextures != null;
				bool_11 |= rsmesh_22.textureSkins != null;
			}
		}

		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.vertexSkins = new int[this.vertexCount];
		this.aShortArray1980 = new short[this.vertexCount];
		this.triangleX = new short[this.faceCount];
		this.triangleY = new short[this.faceCount];
		this.triangleZ = new short[this.faceCount];
		if (bool_6) {
			this.faceType = new byte[this.faceCount];
		}

		if (bool_7) {
			this.facePriorities = new byte[this.faceCount];
		}

		if (bool_8) {
			this.faceAlphas = new byte[this.faceCount];
		}

		if (bool_9) {
			this.texturePos = new byte[this.faceCount];
		}

		this.faceColor = new short[this.faceCount];
		if (bool_10) {
			this.faceTextures = new short[this.faceCount];
		}

		if (bool_11) {
			this.textureSkins = new int[this.faceCount];
		}

		this.aShortArray1981 = new short[this.faceCount];
		if (this.numTextureTriangles > 0) {
			this.textureRenderTypes = new byte[this.numTextureTriangles];
			this.texTriX = new short[this.numTextureTriangles];
			this.texTriY = new short[this.numTextureTriangles];
			this.texTriZ = new short[this.numTextureTriangles];
			this.particleDirectionX = new int[this.numTextureTriangles];
			this.particleDirectionY = new int[this.numTextureTriangles];
			this.particleDirectionZ = new int[this.numTextureTriangles];
			this.particleLifespanX = new byte[this.numTextureTriangles];
			this.particleLifespanY = new byte[this.numTextureTriangles];
			this.particleLifespanZ = new int[this.numTextureTriangles];
			this.texturePrimaryColor = new int[this.numTextureTriangles];
			this.textureSecondaryColor = new int[this.numTextureTriangles];
		}

		if (i_5 > 0) {
			this.isolatedVertexNormals = new VertexNormal[i_5];
		}

		if (i_3 > 0) {
			this.surfaces = new Surface[i_3];
		}

		if (i_4 > 0) {
			this.surfaceSkins = new SurfaceSkin[i_4];
		}

		this.vertexCount = 0;
		this.faceCount = 0;
		this.numTextureTriangles = 0;
		i_3 = 0;
		i_4 = 0;
		i_5 = 0;

		int i_16;
		for (i_12 = 0; i_12 < i_2; i_12++) {
			short s_13 = (short) (1 << i_12);
			RSMesh rsmesh_14 = arr_1[i_12];
			if (rsmesh_14 != null) {
				int i_15;
				if (rsmesh_14.isolatedVertexNormals != null) {
					for (i_15 = 0; i_15 < rsmesh_14.isolatedVertexNormals.length; i_15++) {
						VertexNormal class84_21 = rsmesh_14.isolatedVertexNormals[i_15];
						this.isolatedVertexNormals[i_5++] = class84_21.method1459(class84_21.anInt809 + this.faceCount);
					}
				}

				for (i_15 = 0; i_15 < rsmesh_14.faceCount; i_15++) {
					if (bool_6 && rsmesh_14.faceType != null) {
						this.faceType[this.faceCount] = rsmesh_14.faceType[i_15];
					}

					if (bool_7) {
						if (rsmesh_14.facePriorities != null) {
							this.facePriorities[this.faceCount] = rsmesh_14.facePriorities[i_15];
						} else {
							this.facePriorities[this.faceCount] = rsmesh_14.priority;
						}
					}

					if (bool_8 && rsmesh_14.faceAlphas != null) {
						this.faceAlphas[this.faceCount] = rsmesh_14.faceAlphas[i_15];
					}

					if (bool_10) {
						if (rsmesh_14.faceTextures != null) {
							this.faceTextures[this.faceCount] = rsmesh_14.faceTextures[i_15];
						} else {
							this.faceTextures[this.faceCount] = -1;
						}
					}

					if (bool_11) {
						if (rsmesh_14.textureSkins != null) {
							this.textureSkins[this.faceCount] = rsmesh_14.textureSkins[i_15];
						} else {
							this.textureSkins[this.faceCount] = -1;
						}
					}

					this.triangleX[this.faceCount] = (short) this.method2657(rsmesh_14, rsmesh_14.triangleX[i_15], s_13);
					this.triangleY[this.faceCount] = (short) this.method2657(rsmesh_14, rsmesh_14.triangleY[i_15], s_13);
					this.triangleZ[this.faceCount] = (short) this.method2657(rsmesh_14, rsmesh_14.triangleZ[i_15], s_13);
					this.aShortArray1981[this.faceCount] = s_13;
					this.faceColor[this.faceCount] = rsmesh_14.faceColor[i_15];
					++this.faceCount;
				}

				if (rsmesh_14.surfaces != null) {
					for (i_15 = 0; i_15 < rsmesh_14.surfaces.length; i_15++) {
						i_16 = this.method2657(rsmesh_14, rsmesh_14.surfaces[i_15].anInt836, s_13);
						int i_17 = this.method2657(rsmesh_14, rsmesh_14.surfaces[i_15].anInt837, s_13);
						int i_18 = this.method2657(rsmesh_14, rsmesh_14.surfaces[i_15].anInt838, s_13);
						this.surfaces[i_3] = rsmesh_14.surfaces[i_15].method1488(i_16, i_17, i_18);
						++i_3;
					}
				}

				if (rsmesh_14.surfaceSkins != null) {
					for (i_15 = 0; i_15 < rsmesh_14.surfaceSkins.length; i_15++) {
						i_16 = this.method2657(rsmesh_14, rsmesh_14.surfaceSkins[i_15].anInt2119, s_13);
						this.surfaceSkins[i_4] = rsmesh_14.surfaceSkins[i_15].method2911(i_16);
						++i_4;
					}
				}
			}
		}

		i_12 = 0;
		this.maxDepth = this.vertexCount;

		for (int i_23 = 0; i_23 < i_2; i_23++) {
			short s_19 = (short) (1 << i_23);
			RSMesh rsmesh_20 = arr_1[i_23];
			if (rsmesh_20 != null) {
				for (i_16 = 0; i_16 < rsmesh_20.faceCount; i_16++) {
					if (bool_9) {
						this.texturePos[i_12++] = (byte) (rsmesh_20.texturePos != null && rsmesh_20.texturePos[i_16] != -1 ? this.numTextureTriangles + rsmesh_20.texturePos[i_16] : -1);
					}
				}

				for (i_16 = 0; i_16 < rsmesh_20.numTextureTriangles; i_16++) {
					byte b_24 = this.textureRenderTypes[this.numTextureTriangles] = rsmesh_20.textureRenderTypes[i_16];
					if (b_24 == 0) {
						this.texTriX[this.numTextureTriangles] = (short) this.method2657(rsmesh_20, rsmesh_20.texTriX[i_16], s_19);
						this.texTriY[this.numTextureTriangles] = (short) this.method2657(rsmesh_20, rsmesh_20.texTriY[i_16], s_19);
						this.texTriZ[this.numTextureTriangles] = (short) this.method2657(rsmesh_20, rsmesh_20.texTriZ[i_16], s_19);
					}

					if (b_24 >= 1 && b_24 <= 3) {
						this.texTriX[this.numTextureTriangles] = rsmesh_20.texTriX[i_16];
						this.texTriY[this.numTextureTriangles] = rsmesh_20.texTriY[i_16];
						this.texTriZ[this.numTextureTriangles] = rsmesh_20.texTriZ[i_16];
						this.particleDirectionX[this.numTextureTriangles] = rsmesh_20.particleDirectionX[i_16];
						this.particleDirectionY[this.numTextureTriangles] = rsmesh_20.particleDirectionY[i_16];
						this.particleDirectionZ[this.numTextureTriangles] = rsmesh_20.particleDirectionZ[i_16];
						this.particleLifespanX[this.numTextureTriangles] = rsmesh_20.particleLifespanX[i_16];
						this.particleLifespanY[this.numTextureTriangles] = rsmesh_20.particleLifespanY[i_16];
						this.particleLifespanZ[this.numTextureTriangles] = rsmesh_20.particleLifespanZ[i_16];
					}

					if (b_24 == 2) {
						this.texturePrimaryColor[this.numTextureTriangles] = rsmesh_20.texturePrimaryColor[i_16];
						this.textureSecondaryColor[this.numTextureTriangles] = rsmesh_20.textureSecondaryColor[i_16];
					}

					++this.numTextureTriangles;
				}
			}
		}

	}

	public RSMesh(int i_1, int i_2, int i_3) {
		this.vertexX = new int[i_1];
		this.vertexY = new int[i_1];
		this.vertexZ = new int[i_1];
		this.vertexSkins = new int[i_1];
		this.triangleX = new short[i_2];
		this.triangleY = new short[i_2];
		this.triangleZ = new short[i_2];
		this.faceType = new byte[i_2];
		this.facePriorities = new byte[i_2];
		this.faceAlphas = new byte[i_2];
		this.texturePos = new byte[i_2];
		this.faceColor = new short[i_2];
		this.faceTextures = new short[i_2];
		this.textureSkins = new int[i_2];
		if (i_3 > 0) {
			this.textureRenderTypes = new byte[i_3];
			this.texTriX = new short[i_3];
			this.texTriY = new short[i_3];
			this.texTriZ = new short[i_3];
			this.particleDirectionX = new int[i_3];
			this.particleDirectionY = new int[i_3];
			this.particleDirectionZ = new int[i_3];
			this.particleLifespanX = new byte[i_3];
			this.particleLifespanY = new byte[i_3];
			this.particleLifespanZ = new int[i_3];
			this.texturePrimaryColor = new int[i_3];
			this.textureSecondaryColor = new int[i_3];
		}

	}

	public void translate(int dx, int dy, int dz) {
		for (int i = 0; i < this.vertexCount; i++) {
			this.vertexX[i] += dx;
			this.vertexY[i] += dy;
			this.vertexZ[i] += dz;
		}

	}

}
