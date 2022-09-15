package com.jagex;

import jaclib.memory.Stream;
import jaggl.OpenGL;

public class MeshRasterizer_Sub1 extends MeshRasterizer {

	static float[] aFloatArray8299 = new float[2];
	static int[] anIntArray8296 = new int[8];
	static int[] anIntArray8301 = new int[8];
	static int[] anIntArray8268 = new int[8];
	static long[] aLongArray8298;
	static int anInt8271;
	static int anInt8247;
	static int anInt8232;
	static boolean aBool8233;
	static float[] method13523(float[] floats_0, int i_1) {
		float[] floats_2 = new float[i_1];
		System.arraycopy(floats_0, 0, floats_2, 0, i_1);
		return floats_2;
	}
	static short[] method13526(short[] shorts_0, int i_1) {
		short[] shorts_2 = new short[i_1];
		System.arraycopy(shorts_0, 0, shorts_2, 0, i_1);
		return shorts_2;
	}
	static int method13538(int i_0, int i_1) {
		int i_11 = i_1;
		i_11 = (i_0 & 0x7f) * i_11 >> 7;
		if (i_11 < 2)
			i_11 = 2;
		else if (i_11 > 126)
			i_11 = 126;

		return (i_0 & 0xff80) + i_11;
	}
	static byte[] method13555(byte[] bytes_0, int i_1) {
		byte[] bytes_2 = new byte[i_1];
		System.arraycopy(bytes_0, 0, bytes_2, 0, i_1);
		return bytes_2;
	}
	boolean aBool8254;
	boolean aBool8245;
	boolean aBool8246;
	int vertexCount;
	int maxDepth;
	int anInt8300;
	int triangleCount;
	int anInt8302;
	boolean aBool8279 = true;
	OpenGLRenderer aGraphicalRenderer_Sub1_8239;
	int anInt8240;
	int anInt8241;
	OpenGlArrayBufferPointer aClass143_8272;
	OpenGlArrayBufferPointer aClass143_8275;
	OpenGlArrayBufferPointer aClass143_8274;
	OpenGlArrayBufferPointer aClass143_8273;
	Class132 aClass132_8276;
	int[] triangles;
	int[] verticesX;
	int[] verticesY;
	int[] verticesZ;
	short[] aShortArray8253;
	ParticleEmitterConfig[] aClass87Array8252;
	SurfaceSkin[] aClass172Array8244;
	int anInt8294;
	Class162[] aClass162Array8295;
	Class145[] aClass145Array8258;
	short[] aShortArray8255;
	short[] aShortArray8270;
	short[] aShortArray8261;
	byte[] aByteArray8264;
	float[] aFloatArray8297;
	float[] aFloatArray8292;
	short[] colors;
	byte[] aByteArray8265;
	short[] aShortArray8266;
	short[] aShortArray8267;
	short[] aShortArray8256;
	short[] aShortArray8269;
	short[] aShortArray8304;
	short aShort8243;
	short aShort8257;
	short[] aShortArray8288;
	int[] anIntArray8289;
	int[][] anIntArrayArray8263;
	int[][] anIntArrayArray8278;
	int[][] anIntArrayArray8282;
	Class166 aClass166_8259;
	byte aByte8242;
	int anInt8280;
	int anInt8281;
	short aShort8285;
	short aShort8286;
	short aShort8283;
	short aShort8284;

	short aShort8287;

	short aShort8306;

	Interface15 anInterface15_8277;

	Interface14 anInterface14_8305;

	MeshRasterizer_Sub1(OpenGLRenderer class505_sub1_1) {
		aGraphicalRenderer_Sub1_8239 = class505_sub1_1;
		aClass143_8272 = new OpenGlArrayBufferPointer(null, 5126, 3, 0);
		aClass143_8275 = new OpenGlArrayBufferPointer(null, 5126, 2, 0);
		aClass143_8274 = new OpenGlArrayBufferPointer(null, 5126, 3, 0);
		aClass143_8273 = new OpenGlArrayBufferPointer(null, 5121, 4, 0);
		aClass132_8276 = new Class132();
	}

	MeshRasterizer_Sub1(OpenGLRenderer class505_sub1_1, RSMesh rsmesh_2, int i_3, int i_4, int i_5, int i_6) {
		aGraphicalRenderer_Sub1_8239 = class505_sub1_1;
		anInt8240 = i_3;
		anInt8241 = i_6;
		if (RasterizerFlags.method2192(i_3))
			aClass143_8272 = new OpenGlArrayBufferPointer(null, 5126, 3, 0);

		if (RasterizerFlags.method2201(i_3))
			aClass143_8275 = new OpenGlArrayBufferPointer(null, 5126, 2, 0);

		if (RasterizerFlags.method2193(i_3, i_6))
			aClass143_8274 = new OpenGlArrayBufferPointer(null, 5126, 3, 0);

		if (RasterizerFlags.method2194(i_3))
			aClass143_8273 = new OpenGlArrayBufferPointer(null, 5121, 4, 0);

		if (RasterizerFlags.method2196(i_3))
			aClass132_8276 = new Class132();

		ImageLoader interface22_7 = class505_sub1_1.textureCache;
		int[] ints_8 = new int[rsmesh_2.faceCount];
		triangles = new int[rsmesh_2.maxDepth + 1];

		for (int i_9 = 0; i_9 < rsmesh_2.faceCount; i_9++)
			if (rsmesh_2.faceType == null || rsmesh_2.faceType[i_9] != 2) {
				if (rsmesh_2.faceTextures != null && rsmesh_2.faceTextures[i_9] != -1) {
					TextureDetails class169_72 = interface22_7.getTextureDetails(rsmesh_2.faceTextures[i_9] & 0xffff);
					if (((anInt8241 & 0x40) == 0 || !class169_72.isGroundMesh) && class169_72.skipTriangles)
						continue;
				}

				ints_8[triangleCount++] = i_9;
				++triangles[rsmesh_2.triangleX[i_9]];
				++triangles[rsmesh_2.triangleY[i_9]];
				++triangles[rsmesh_2.triangleZ[i_9]];
			}

		anInt8302 = triangleCount;
		long[] longs_63 = new long[triangleCount];
		boolean bool_10 = (anInt8240 & 0x100) != 0;

		int i_12;
		int i_14;
		int i_19;
		TextureDetails class169_71;
		short s_82;
		int i_111;
		for (int i_11 = 0; i_11 < triangleCount; i_11++) {
			i_12 = ints_8[i_11];
			TextureDetails class169_65 = null;
			i_14 = 0;
			byte b_67 = 0;
			byte b_16 = 0;
			byte b_17 = 0;
			if (rsmesh_2.isolatedVertexNormals != null) {
				boolean bool_18 = false;

				for (i_19 = 0; i_19 < rsmesh_2.isolatedVertexNormals.length; i_19++) {
					VertexNormal class84_69 = rsmesh_2.isolatedVertexNormals[i_19];
					if (i_12 == class84_69.anInt809) {
						BillboardDefinitions class347_70 = NPCMeshModifier.getBillboardDefinitions(class84_69.anInt812);
						if (class347_70.aBool4059)
							bool_18 = true;

						if (class347_70.anInt4055 != -1) {
							class169_71 = interface22_7.getTextureDetails(class347_70.anInt4055);
							if (class169_71.blendType == 2)
								aBool8245 = true;
						}
					}
				}

				if (bool_18) {
					longs_63[i_11] = Long.MAX_VALUE;
					--anInt8302;
					continue;
				}
			}

			s_82 = -1;
			if (rsmesh_2.faceTextures != null) {
				s_82 = rsmesh_2.faceTextures[i_12];
				if (s_82 != -1) {
					class169_65 = interface22_7.getTextureDetails(s_82 & 0xffff);
					if ((anInt8241 & 0x40) != 0 && class169_65.isGroundMesh) {
						s_82 = -1;
						class169_65 = null;
					} else {
						b_16 = class169_65.effectId;
						b_17 = class169_65.effectParam1;
						if (class169_65.textureSpeedU != 0 || class169_65.textureSpeedV != 0)
							aBool8246 = true;
					}
				}
			}

			boolean bool_83 = rsmesh_2.faceAlphas != null && rsmesh_2.faceAlphas[i_12] != 0 || class169_65 != null && class169_65.blendType != 0;
			if ((bool_10 || bool_83) && rsmesh_2.facePriorities != null)
				i_14 += rsmesh_2.facePriorities[i_12] << 17;

			if (bool_83)
				i_14 += 65536;

			i_14 += (b_16 & 0xff) << 8;
			i_14 += b_17 & 0xff;
			i_111 = b_67 + ((s_82 & 0xffff) << 16);
			i_111 += i_11 & 0xffff;
			longs_63[i_11] = ((long) i_14 << 32) + i_111;
			aBool8245 |= bool_83;
			aBool8246 |= class169_65 != null && (class169_65.textureSpeedU != 0 || class169_65.textureSpeedV != 0);
		}

		Class159.method2736(longs_63, ints_8);
		vertexCount = rsmesh_2.vertexCount;
		maxDepth = rsmesh_2.maxDepth;
		verticesX = rsmesh_2.vertexX;
		verticesY = rsmesh_2.vertexY;
		verticesZ = rsmesh_2.vertexZ;
		aShortArray8253 = rsmesh_2.aShortArray1980;
		Class126[] arr_64 = new Class126[maxDepth];
		aClass87Array8252 = rsmesh_2.particleConfig;
		aClass172Array8244 = rsmesh_2.surfaceSkins;
		int i_79;
		if (rsmesh_2.isolatedVertexNormals != null) {
			anInt8294 = rsmesh_2.isolatedVertexNormals.length;
			aClass162Array8295 = new Class162[anInt8294];
			aClass145Array8258 = new Class145[anInt8294];

			for (i_12 = 0; i_12 < anInt8294; i_12++) {
				VertexNormal class84_110 = rsmesh_2.isolatedVertexNormals[i_12];
				BillboardDefinitions class347_66 = NPCMeshModifier.getBillboardDefinitions(class84_110.anInt812);
				i_111 = -1;

				for (i_79 = 0; i_79 < triangleCount; i_79++)
					if (class84_110.anInt809 == ints_8[i_79]) {
						i_111 = i_79;
						break;
					}

				if (i_111 == -1)
					throw new RuntimeException();

				i_79 = Class540.anIntArray7136[rsmesh_2.faceColor[class84_110.anInt809] & 0xffff] & 0xffffff;
				i_79 |= 255 - (rsmesh_2.faceAlphas != null ? rsmesh_2.faceAlphas[class84_110.anInt809] : 0) << 24;
				aClass162Array8295[i_12] = new Class162(i_111, rsmesh_2.triangleX[class84_110.anInt809], rsmesh_2.triangleY[class84_110.anInt809], rsmesh_2.triangleZ[class84_110.anInt809], class347_66.anInt4054, class347_66.anInt4050, class347_66.anInt4055, class347_66.anInt4051, class347_66.aBool4058, class84_110.anInt810);
				aClass145Array8258[i_12] = new Class145(i_79);
			}
		}

		i_12 = triangleCount * 3;
		aShortArray8255 = new short[i_12];
		aShortArray8270 = new short[i_12];
		aShortArray8261 = new short[i_12];
		aByteArray8264 = new byte[i_12];
		aFloatArray8297 = new float[i_12];
		aFloatArray8292 = new float[i_12];
		colors = new short[triangleCount];
		aByteArray8265 = new byte[triangleCount];
		aShortArray8266 = new short[triangleCount];
		aShortArray8267 = new short[triangleCount];
		aShortArray8256 = new short[triangleCount];
		aShortArray8269 = new short[triangleCount];
		if (rsmesh_2.aShortArray1981 != null)
			aShortArray8304 = new short[triangleCount];

		aShort8243 = (short) i_4;
		aShort8257 = (short) i_5;
		aShortArray8288 = new short[i_12];
		aLongArray8298 = new long[i_12];
		int i_13 = 0;

		for (i_14 = 0; i_14 < rsmesh_2.maxDepth; i_14++) {
			i_111 = triangles[i_14];
			triangles[i_14] = i_13;
			i_13 += i_111;
			arr_64[i_14] = new Class126();
		}

		triangles[rsmesh_2.maxDepth] = i_13;
		Class83 class83_109 = method11256(rsmesh_2, ints_8, triangleCount);
		Class127[] arr_15 = new Class127[rsmesh_2.faceCount];

		int i_20;
		int i_21;
		short s_80;
		short s_84;
		for (i_79 = 0; i_79 < rsmesh_2.faceCount; i_79++) {
			s_80 = rsmesh_2.triangleX[i_79];
			s_82 = rsmesh_2.triangleY[i_79];
			s_84 = rsmesh_2.triangleZ[i_79];
			i_20 = verticesX[s_82] - verticesX[s_80];
			i_21 = verticesY[s_82] - verticesY[s_80];
			int i_22 = verticesZ[s_82] - verticesZ[s_80];
			int i_23 = verticesX[s_84] - verticesX[s_80];
			int i_24 = verticesY[s_84] - verticesY[s_80];
			int i_25 = verticesZ[s_84] - verticesZ[s_80];
			int i_26 = i_21 * i_25 - i_24 * i_22;
			int i_27 = i_22 * i_23 - i_25 * i_20;

			int i_28;
			for (i_28 = i_20 * i_24 - i_23 * i_21; i_26 > 8192 || i_27 > 8192 || i_28 > 8192 || i_26 < -8192 || i_27 < -8192 || i_28 < -8192; i_28 >>= 1) {
				i_26 >>= 1;
			i_27 >>= 1;
			}

			int i_29 = (int) Math.sqrt(i_26 * i_26 + i_27 * i_27 + i_28 * i_28);
			if (i_29 <= 0)
				i_29 = 1;

			i_26 = i_26 * 256 / i_29;
			i_27 = i_27 * 256 / i_29;
			i_28 = i_28 * 256 / i_29;
			byte b_30 = rsmesh_2.faceType == null ? 0 : rsmesh_2.faceType[i_79];
			if (b_30 == 0) {
				Class126 class126_31 = arr_64[s_80];
				class126_31.anInt1577 += i_26;
				class126_31.anInt1575 += i_27;
				class126_31.anInt1576 += i_28;
				++class126_31.anInt1574;
				class126_31 = arr_64[s_82];
				class126_31.anInt1577 += i_26;
				class126_31.anInt1575 += i_27;
				class126_31.anInt1576 += i_28;
				++class126_31.anInt1574;
				class126_31 = arr_64[s_84];
				class126_31.anInt1577 += i_26;
				class126_31.anInt1575 += i_27;
				class126_31.anInt1576 += i_28;
				++class126_31.anInt1574;
			} else if (b_30 == 1) {
				Class127 class127_96 = arr_15[i_79] = new Class127();
				class127_96.anInt1579 = i_26;
				class127_96.anInt1578 = i_27;
				class127_96.anInt1580 = i_28;
			}
		}

		int i_85;
		for (i_79 = 0; i_79 < triangleCount; i_79++) {
			int i_81 = ints_8[i_79];
			i_85 = rsmesh_2.faceColor[i_81] & 0xffff;
			if (rsmesh_2.texturePos == null)
				i_19 = -1;
			else
				i_19 = rsmesh_2.texturePos[i_81];

			if (rsmesh_2.faceAlphas == null)
				i_20 = 0;
			else
				i_20 = rsmesh_2.faceAlphas[i_81] & 0xff;

			short s_86 = rsmesh_2.faceTextures == null ? -1 : rsmesh_2.faceTextures[i_81];
			if (s_86 != -1 && (anInt8241 & 0x40) != 0) {
				class169_71 = interface22_7.getTextureDetails(s_86 & 0xffff);
				if (class169_71.isGroundMesh)
					s_86 = -1;
			}

			float f_87 = 0.0F;
			float f_88 = 0.0F;
			float f_89 = 0.0F;
			float f_90 = 0.0F;
			float f_91 = 0.0F;
			float f_92 = 0.0F;
			byte b_93 = 0;
			byte b_94 = 0;
			int i_95 = 0;
			short s_34;
			short s_35;
			short s_36;
			byte b_73;
			if (s_86 != -1)
				if (i_19 == -1) {
					f_87 = 0.0F;
					f_88 = 1.0F;
					f_89 = 1.0F;
					f_90 = 1.0F;
					b_93 = 1;
					f_91 = 0.0F;
					f_92 = 0.0F;
					b_94 = 2;
				} else {
					i_19 &= 0xff;
					b_73 = rsmesh_2.textureRenderTypes[i_19];
					float f_40;
					float f_41;
					float f_42;
					float f_52;
					float f_53;
					float f_54;
					float f_55;
					float f_56;
					float f_57;
					short s_75;
					short s_76;
					if (b_73 == 0) {
						s_75 = rsmesh_2.triangleX[i_81];
						s_76 = rsmesh_2.triangleY[i_81];
						s_34 = rsmesh_2.triangleZ[i_81];
						s_35 = rsmesh_2.texTriX[i_19];
						s_36 = rsmesh_2.texTriY[i_19];
						short s_77 = rsmesh_2.texTriZ[i_19];
						float f_38 = rsmesh_2.vertexX[s_35];
						float f_39 = rsmesh_2.vertexY[s_35];
						f_40 = rsmesh_2.vertexZ[s_35];
						f_41 = rsmesh_2.vertexX[s_36] - f_38;
						f_42 = rsmesh_2.vertexY[s_36] - f_39;
						float f_43 = rsmesh_2.vertexZ[s_36] - f_40;
						float f_44 = rsmesh_2.vertexX[s_77] - f_38;
						float f_45 = rsmesh_2.vertexY[s_77] - f_39;
						float f_46 = rsmesh_2.vertexZ[s_77] - f_40;
						float f_47 = rsmesh_2.vertexX[s_75] - f_38;
						float f_48 = rsmesh_2.vertexY[s_75] - f_39;
						float f_49 = rsmesh_2.vertexZ[s_75] - f_40;
						float f_50 = rsmesh_2.vertexX[s_76] - f_38;
						float f_51 = rsmesh_2.vertexY[s_76] - f_39;
						f_52 = rsmesh_2.vertexZ[s_76] - f_40;
						f_53 = rsmesh_2.vertexX[s_34] - f_38;
						f_54 = rsmesh_2.vertexY[s_34] - f_39;
						f_55 = rsmesh_2.vertexZ[s_34] - f_40;
						f_56 = f_42 * f_46 - f_43 * f_45;
						f_57 = f_43 * f_44 - f_41 * f_46;
						float f_58 = f_41 * f_45 - f_42 * f_44;
						float f_59 = f_45 * f_58 - f_46 * f_57;
						float f_60 = f_46 * f_56 - f_44 * f_58;
						float f_61 = f_44 * f_57 - f_45 * f_56;
						float f_62 = 1.0F / (f_59 * f_41 + f_60 * f_42 + f_61 * f_43);
						f_87 = (f_59 * f_47 + f_60 * f_48 + f_61 * f_49) * f_62;
						f_89 = (f_59 * f_50 + f_60 * f_51 + f_61 * f_52) * f_62;
						f_91 = (f_59 * f_53 + f_60 * f_54 + f_61 * f_55) * f_62;
						f_59 = f_42 * f_58 - f_43 * f_57;
						f_60 = f_43 * f_56 - f_41 * f_58;
						f_61 = f_41 * f_57 - f_42 * f_56;
						f_62 = 1.0F / (f_59 * f_44 + f_60 * f_45 + f_61 * f_46);
						f_88 = (f_59 * f_47 + f_60 * f_48 + f_61 * f_49) * f_62;
						f_90 = (f_59 * f_50 + f_60 * f_51 + f_61 * f_52) * f_62;
						f_92 = (f_59 * f_53 + f_60 * f_54 + f_61 * f_55) * f_62;
					} else {
						s_75 = rsmesh_2.triangleX[i_81];
						s_76 = rsmesh_2.triangleY[i_81];
						s_34 = rsmesh_2.triangleZ[i_81];
						int i_97 = class83_109.anIntArray808[i_19];
						int i_98 = class83_109.anIntArray805[i_19];
						int i_112 = class83_109.anIntArray807[i_19];
						float[] floats_78 = class83_109.aFloatArrayArray806[i_19];
						byte b_99 = rsmesh_2.particleLifespanY[i_19];
						f_40 = rsmesh_2.particleLifespanZ[i_19] / 256.0F;
						if (b_73 == 1) {
							f_41 = rsmesh_2.particleDirectionZ[i_19] / 1024.0F;
							method11306(rsmesh_2.vertexX[s_75], rsmesh_2.vertexY[s_75], rsmesh_2.vertexZ[s_75], i_97, i_98, i_112, floats_78, f_41, b_99, f_40, aFloatArray8299);
							f_87 = aFloatArray8299[0];
							f_88 = aFloatArray8299[1];
							method11306(rsmesh_2.vertexX[s_76], rsmesh_2.vertexY[s_76], rsmesh_2.vertexZ[s_76], i_97, i_98, i_112, floats_78, f_41, b_99, f_40, aFloatArray8299);
							f_89 = aFloatArray8299[0];
							f_90 = aFloatArray8299[1];
							method11306(rsmesh_2.vertexX[s_34], rsmesh_2.vertexY[s_34], rsmesh_2.vertexZ[s_34], i_97, i_98, i_112, floats_78, f_41, b_99, f_40, aFloatArray8299);
							f_91 = aFloatArray8299[0];
							f_92 = aFloatArray8299[1];
							f_42 = f_41 / 2.0F;
							if ((b_99 & 0x1) == 0) {
								if (f_89 - f_87 > f_42) {
									f_89 -= f_41;
									b_93 = 1;
								} else if (f_87 - f_89 > f_42) {
									f_89 += f_41;
									b_93 = 2;
								}

								if (f_91 - f_87 > f_42) {
									f_91 -= f_41;
									b_94 = 1;
								} else if (f_87 - f_91 > f_42) {
									f_91 += f_41;
									b_94 = 2;
								}
							} else {
								if (f_90 - f_88 > f_42) {
									f_90 -= f_41;
									b_93 = 1;
								} else if (f_88 - f_90 > f_42) {
									f_90 += f_41;
									b_93 = 2;
								}

								if (f_92 - f_88 > f_42) {
									f_92 -= f_41;
									b_94 = 1;
								} else if (f_88 - f_92 > f_42) {
									f_92 += f_41;
									b_94 = 2;
								}
							}
						} else if (b_73 == 2) {
							f_41 = rsmesh_2.texturePrimaryColor[i_19] / 256.0F;
							f_42 = rsmesh_2.textureSecondaryColor[i_19] / 256.0F;
							int i_100 = rsmesh_2.vertexX[s_76] - rsmesh_2.vertexX[s_75];
							int i_101 = rsmesh_2.vertexY[s_76] - rsmesh_2.vertexY[s_75];
							int i_102 = rsmesh_2.vertexZ[s_76] - rsmesh_2.vertexZ[s_75];
							int i_103 = rsmesh_2.vertexX[s_34] - rsmesh_2.vertexX[s_75];
							int i_104 = rsmesh_2.vertexY[s_34] - rsmesh_2.vertexY[s_75];
							int i_105 = rsmesh_2.vertexZ[s_34] - rsmesh_2.vertexZ[s_75];
							int i_106 = i_101 * i_105 - i_104 * i_102;
							int i_107 = i_102 * i_103 - i_105 * i_100;
							int i_108 = i_100 * i_104 - i_103 * i_101;
							f_52 = 64.0F / rsmesh_2.particleDirectionX[i_19];
							f_53 = 64.0F / rsmesh_2.particleDirectionY[i_19];
							f_54 = 64.0F / rsmesh_2.particleDirectionZ[i_19];
							f_55 = (i_106 * floats_78[0] + i_107 * floats_78[1] + i_108 * floats_78[2]) / f_52;
							f_56 = (i_106 * floats_78[3] + i_107 * floats_78[4] + i_108 * floats_78[5]) / f_53;
							f_57 = (i_106 * floats_78[6] + i_107 * floats_78[7] + i_108 * floats_78[8]) / f_54;
							i_95 = method11254(f_55, f_56, f_57);
							method11255(rsmesh_2.vertexX[s_75], rsmesh_2.vertexY[s_75], rsmesh_2.vertexZ[s_75], i_97, i_98, i_112, i_95, floats_78, b_99, f_40, f_41, f_42, aFloatArray8299);
							f_87 = aFloatArray8299[0];
							f_88 = aFloatArray8299[1];
							method11255(rsmesh_2.vertexX[s_76], rsmesh_2.vertexY[s_76], rsmesh_2.vertexZ[s_76], i_97, i_98, i_112, i_95, floats_78, b_99, f_40, f_41, f_42, aFloatArray8299);
							f_89 = aFloatArray8299[0];
							f_90 = aFloatArray8299[1];
							method11255(rsmesh_2.vertexX[s_34], rsmesh_2.vertexY[s_34], rsmesh_2.vertexZ[s_34], i_97, i_98, i_112, i_95, floats_78, b_99, f_40, f_41, f_42, aFloatArray8299);
							f_91 = aFloatArray8299[0];
							f_92 = aFloatArray8299[1];
						} else if (b_73 == 3) {
							method11271(rsmesh_2.vertexX[s_75], rsmesh_2.vertexY[s_75], rsmesh_2.vertexZ[s_75], i_97, i_98, i_112, floats_78, b_99, f_40, aFloatArray8299);
							f_87 = aFloatArray8299[0];
							f_88 = aFloatArray8299[1];
							method11271(rsmesh_2.vertexX[s_76], rsmesh_2.vertexY[s_76], rsmesh_2.vertexZ[s_76], i_97, i_98, i_112, floats_78, b_99, f_40, aFloatArray8299);
							f_89 = aFloatArray8299[0];
							f_90 = aFloatArray8299[1];
							method11271(rsmesh_2.vertexX[s_34], rsmesh_2.vertexY[s_34], rsmesh_2.vertexZ[s_34], i_97, i_98, i_112, floats_78, b_99, f_40, aFloatArray8299);
							f_91 = aFloatArray8299[0];
							f_92 = aFloatArray8299[1];
							if ((b_99 & 0x1) == 0) {
								if (f_89 - f_87 > 0.5F) {
									--f_89;
									b_93 = 1;
								} else if (f_87 - f_89 > 0.5F) {
									++f_89;
									b_93 = 2;
								}

								if (f_91 - f_87 > 0.5F) {
									--f_91;
									b_94 = 1;
								} else if (f_87 - f_91 > 0.5F) {
									++f_91;
									b_94 = 2;
								}
							} else {
								if (f_90 - f_88 > 0.5F) {
									--f_90;
									b_93 = 1;
								} else if (f_88 - f_90 > 0.5F) {
									++f_90;
									b_93 = 2;
								}

								if (f_92 - f_88 > 0.5F) {
									--f_92;
									b_94 = 1;
								} else if (f_88 - f_92 > 0.5F) {
									++f_92;
									b_94 = 2;
								}
							}
						}
					}
				}

			if (rsmesh_2.faceType == null)
				b_73 = 0;
			else
				b_73 = rsmesh_2.faceType[i_81];

			if (b_73 == 0) {
				long long_32 = (i_19 << 2) + ((long) (i_95 << 24) + (i_85 << 8) + i_20 << 32);
				s_34 = rsmesh_2.triangleX[i_81];
				s_35 = rsmesh_2.triangleY[i_81];
				s_36 = rsmesh_2.triangleZ[i_81];
				Class126 class126_37 = arr_64[s_34];
				aShortArray8266[i_79] = method13542(s_34, long_32, class126_37.anInt1577, class126_37.anInt1575, class126_37.anInt1576, class126_37.anInt1574, f_87, f_88);
				class126_37 = arr_64[s_35];
				aShortArray8267[i_79] = method13542(s_35, long_32 + b_93, class126_37.anInt1577, class126_37.anInt1575, class126_37.anInt1576, class126_37.anInt1574, f_89, f_90);
				class126_37 = arr_64[s_36];
				aShortArray8256[i_79] = method13542(s_36, long_32 + b_94, class126_37.anInt1577, class126_37.anInt1575, class126_37.anInt1576, class126_37.anInt1574, f_91, f_92);
			} else if (b_73 == 1) {
				Class127 class127_74 = arr_15[i_81];
				long long_33 = ((i_19 << 2) + (class127_74.anInt1579 > 0 ? 1024 : 2048) + (class127_74.anInt1578 + 256 << 12) + (class127_74.anInt1580 + 256 << 22)) + ((long) (i_95 << 24) + (i_85 << 8) + i_20 << 32);
				aShortArray8266[i_79] = method13542(rsmesh_2.triangleX[i_81], long_33, class127_74.anInt1579, class127_74.anInt1578, class127_74.anInt1580, 0, f_87, f_88);
				aShortArray8267[i_79] = method13542(rsmesh_2.triangleY[i_81], long_33 + b_93, class127_74.anInt1579, class127_74.anInt1578, class127_74.anInt1580, 0, f_89, f_90);
				aShortArray8256[i_79] = method13542(rsmesh_2.triangleZ[i_81], long_33 + b_94, class127_74.anInt1579, class127_74.anInt1578, class127_74.anInt1580, 0, f_91, f_92);
			}

			if (rsmesh_2.faceAlphas != null)
				aByteArray8265[i_79] = rsmesh_2.faceAlphas[i_81];

			if (rsmesh_2.aShortArray1981 != null)
				aShortArray8304[i_79] = rsmesh_2.aShortArray1981[i_81];

			colors[i_79] = rsmesh_2.faceColor[i_81];
			aShortArray8269[i_79] = s_86;
		}

		i_79 = 0;
		s_80 = -10000;

		for (i_85 = 0; i_85 < anInt8302; i_85++) {
			s_84 = aShortArray8269[i_85];
			if (s_84 != s_80) {
				++i_79;
				s_80 = s_84;
			}
		}

		anIntArray8289 = new int[i_79 + 1];
		i_79 = 0;
		s_80 = -10000;

		for (i_85 = 0; i_85 < anInt8302; i_85++) {
			s_84 = aShortArray8269[i_85];
			if (s_84 != s_80) {
				anIntArray8289[i_79++] = i_85;
				s_80 = s_84;
			}
		}

		anIntArray8289[i_79] = anInt8302;
		aLongArray8298 = null;
		aShortArray8255 = method13526(aShortArray8255, anInt8300);
		aShortArray8270 = method13526(aShortArray8270, anInt8300);
		aShortArray8261 = method13526(aShortArray8261, anInt8300);
		aByteArray8264 = method13555(aByteArray8264, anInt8300);
		aFloatArray8297 = method13523(aFloatArray8297, anInt8300);
		aFloatArray8292 = method13523(aFloatArray8292, anInt8300);
		if (rsmesh_2.vertexSkins != null && RasterizerFlags.method2226(i_3))
			anIntArrayArray8263 = rsmesh_2.getBones(false);

		if (rsmesh_2.isolatedVertexNormals != null && RasterizerFlags.method2260(i_3))
			anIntArrayArray8278 = rsmesh_2.method2667();

		if (rsmesh_2.textureSkins != null && RasterizerFlags.method2208(i_3)) {
			i_85 = 0;
			int[] ints_68 = new int[256];

			for (i_20 = 0; i_20 < triangleCount; i_20++) {
				i_21 = rsmesh_2.textureSkins[ints_8[i_20]];
				if (i_21 >= 0) {
					++ints_68[i_21];
					if (i_21 > i_85)
						i_85 = i_21;
				}
			}

			anIntArrayArray8282 = new int[i_85 + 1][];

			for (i_20 = 0; i_20 <= i_85; i_20++) {
				anIntArrayArray8282[i_20] = new int[ints_68[i_20]];
				ints_68[i_20] = 0;
			}

			for (i_20 = 0; i_20 < triangleCount; i_20++) {
				i_21 = rsmesh_2.textureSkins[ints_8[i_20]];
				if (i_21 >= 0)
					anIntArrayArray8282[i_21][ints_68[i_21]++] = i_20;
			}
		}

	}

	@Override
	public int AA() {
		if (!aBool8254)
			method13528();

		return aShort8287;
	}

	@Override
	public int ae() {
		return anInt8240;
	}

	@Override
	public void aq(int i_1) {
		anInt8240 = i_1;
		if (aClass166_8259 != null && (anInt8240 & 0x10000) == 0) {
			aShortArray8255 = aClass166_8259.aShortArray2038;
			aShortArray8270 = aClass166_8259.aShortArray2039;
			aShortArray8261 = aClass166_8259.aShortArray2041;
			aByteArray8264 = aClass166_8259.aByteArray2040;
			aClass166_8259 = null;
		}

		aBool8279 = true;
		method13525();
	}

	@Override
	public int ar() {
		return anInt8240;
	}

	@Override
	public byte[] aw() {
		return aByteArray8265;
	}

	@Override
	void bb(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (i_1 == 0) {
			i_5 = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;

			for (i_6 = 0; i_6 < maxDepth; i_6++) {
				anInt8271 += verticesX[i_6];
				anInt8247 += verticesY[i_6];
				anInt8232 += verticesZ[i_6];
				++i_5;
			}

			if (i_5 > 0) {
				anInt8271 = anInt8271 / i_5 + i_2;
				anInt8247 = anInt8247 / i_5 + i_3;
				anInt8232 = anInt8232 / i_5 + i_4;
			} else {
				anInt8271 = i_2;
				anInt8247 = i_3;
				anInt8232 = i_4;
			}
		} else if (i_1 == 1)
			for (i_5 = 0; i_5 < maxDepth; i_5++) {
				verticesX[i_5] += i_2;
				verticesY[i_5] += i_3;
				verticesZ[i_5] += i_4;
			}
		else {
			int i_7;
			int i_8;
			if (i_1 == 2)
				for (i_5 = 0; i_5 < maxDepth; i_5++) {
					verticesX[i_5] -= anInt8271;
					verticesY[i_5] -= anInt8247;
					verticesZ[i_5] -= anInt8232;
					if (i_4 != 0) {
						i_6 = Trig.SINE[i_4];
						i_7 = Trig.COSINE[i_4];
						i_8 = verticesY[i_5] * i_6 + verticesX[i_5] * i_7 + 16383 >> 14;
				verticesY[i_5] = verticesY[i_5] * i_7 - verticesX[i_5] * i_6 + 16383 >> 14;
			verticesX[i_5] = i_8;
					}

					if (i_2 != 0) {
						i_6 = Trig.SINE[i_2];
						i_7 = Trig.COSINE[i_2];
						i_8 = verticesY[i_5] * i_7 - verticesZ[i_5] * i_6 + 16383 >> 14;
				verticesZ[i_5] = verticesY[i_5] * i_6 + verticesZ[i_5] * i_7 + 16383 >> 14;
				verticesY[i_5] = i_8;
					}

					if (i_3 != 0) {
						i_6 = Trig.SINE[i_3];
						i_7 = Trig.COSINE[i_3];
						i_8 = verticesZ[i_5] * i_6 + verticesX[i_5] * i_7 + 16383 >> 14;
				verticesZ[i_5] = verticesZ[i_5] * i_7 - verticesX[i_5] * i_6 + 16383 >> 14;
				verticesX[i_5] = i_8;
					}

					verticesX[i_5] += anInt8271;
					verticesY[i_5] += anInt8247;
					verticesZ[i_5] += anInt8232;
				}
			else if (i_1 == 3)
				for (i_5 = 0; i_5 < maxDepth; i_5++) {
					verticesX[i_5] -= anInt8271;
					verticesY[i_5] -= anInt8247;
					verticesZ[i_5] -= anInt8232;
					verticesX[i_5] = verticesX[i_5] * i_2 / 128;
					verticesY[i_5] = verticesY[i_5] * i_3 / 128;
					verticesZ[i_5] = verticesZ[i_5] * i_4 / 128;
					verticesX[i_5] += anInt8271;
					verticesY[i_5] += anInt8247;
					verticesZ[i_5] += anInt8232;
				}
			else {
				Class162 class162_10;
				Class145 class145_11;
				if (i_1 == 5) {
					for (i_5 = 0; i_5 < triangleCount * 3 * -1431655765; i_5++) {
						i_6 = (aByteArray8265[i_5] & 0xff) + i_2 * 8;
						if (i_6 < 0)
							i_6 = 0;
						else if (i_6 > 255)
							i_6 = 255;

						aByteArray8265[i_5] = (byte) i_6;
					}

					if (aClass143_8273 != null)
						aClass143_8273.anInterface14_1667 = null;

					if (aClass162Array8295 != null)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class162_10 = aClass162Array8295[i_5];
							class145_11 = aClass145Array8258[i_5];
							class145_11.anInt1714 = class145_11.anInt1714 & 0xffffff | 255 - (aByteArray8265[class162_10.anInt2023] & 0xff) << 24;
						}
				} else if (i_1 == 7) {
					for (i_5 = 0; i_5 < triangleCount * 3 * -1431655765; i_5++) {
						i_6 = colors[i_5] & 0xffff;
						i_7 = i_6 >> 10 & 0x3f;
					i_8 = i_6 >> 7 & 0x7;
							int i_9 = i_6 & 0x7f;
							i_7 = i_7 + i_2 & 0x3f;
							i_8 += i_3 / 4;
							if (i_8 < 0)
								i_8 = 0;
							else if (i_8 > 7)
								i_8 = 7;

							i_9 += i_4;
							if (i_9 < 0)
								i_9 = 0;
							else if (i_9 > 127)
								i_9 = 127;

							colors[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
					}

					if (aClass143_8273 != null)
						aClass143_8273.anInterface14_1667 = null;

					if (aClass162Array8295 != null)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class162_10 = aClass162Array8295[i_5];
							class145_11 = aClass145Array8258[i_5];
							class145_11.anInt1714 = class145_11.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_10.anInt2023] & 0xffff] & 0xffffff;
						}
				} else {
					Class145 class145_12;
					if (i_1 == 8)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class145_12 = aClass145Array8258[i_5];
							class145_12.anInt1709 += i_2;
							class145_12.anInt1713 += i_3;
						}
					else if (i_1 == 10)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class145_12 = aClass145Array8258[i_5];
							class145_12.anInt1710 = class145_12.anInt1710 * i_2 >> 7;
						class145_12.anInt1711 = class145_12.anInt1711 * i_3 >> 7;
						}
					else if (i_1 == 9)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class145_12 = aClass145Array8258[i_5];
							class145_12.anInt1712 = class145_12.anInt1712 + i_2 & 0x3fff;
						}
				}
			}
		}

	}

	@Override
	public void bc(int i_1, int i_2, Ground class390_3, Ground class390_4, int i_5, int i_6, int i_7) {
		if (!aBool8254)
			method13528();

		int i_8 = i_5 + aShort8285;
		int i_9 = i_5 + aShort8286;
		int i_10 = i_7 + aShort8287;
		int i_11 = i_7 + aShort8306;
		if (i_1 != 1 && i_1 != 2 && i_1 != 3 && i_1 != 5 || i_8 >= 0 && i_9 + class390_3.tileUnits >> class390_3.tileScale < class390_3.width && i_10 >= 0 && i_11 + class390_3.tileUnits >> class390_3.tileScale < class390_3.length) {
			if (i_1 != 4 && i_1 != 5) {
				i_8 >>= class390_3.tileScale;
							i_9 = i_9 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
				i_10 >>= class390_3.tileScale;
				i_11 = i_11 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
				if (class390_3.getHeight(i_8, i_10) == i_6 && class390_3.getHeight(i_9, i_10) == i_6 && class390_3.getHeight(i_8, i_11) == i_6 && class390_3.getHeight(i_9, i_11) == i_6)
					return;
			} else if (class390_4 == null || i_8 < 0 || class390_4.tileUnits + i_9 >> class390_4.tileScale >= class390_4.width || i_10 < 0 || class390_4.tileUnits + i_11 >> class390_4.tileScale >= class390_4.length)
				return;

			int i_12;
			if (i_1 == 1)
				for (i_12 = 0; i_12 < maxDepth; i_12++)
					verticesY[i_12] = verticesY[i_12] + class390_3.averageHeight(verticesX[i_12] + i_5, verticesZ[i_12] + i_7) - i_6;
			else {
				int i_13;
				int i_14;
				if (i_1 == 2) {
					short s_19 = aShort8283;
					if (s_19 == 0)
						return;

					for (i_13 = 0; i_13 < maxDepth; i_13++) {
						i_14 = (verticesY[i_13] << 16) / s_19;
						if (i_14 < i_2)
							verticesY[i_13] += (class390_3.averageHeight(verticesX[i_13] + i_5, verticesZ[i_13] + i_7) - i_6) * (i_2 - i_14) / i_2;
					}
				} else {
					int i_15;
					if (i_1 == 3) {
						i_12 = (i_2 & 0xff) * 4;
						i_13 = (i_2 >> 8 & 0xff) * 4;
						i_14 = (i_2 >> 16 & 0xff) << 6;
						i_15 = (i_2 >> 24 & 0xff) << 6;
						if (i_5 - (i_12 >> 1) < 0 || i_5 + class390_3.tileUnits + (i_12 >> 1) >= class390_3.width << class390_3.tileScale || i_7 - (i_13 >> 1) < 0 || class390_3.tileUnits + (i_13 >> 1) + i_7 >= class390_3.length << class390_3.tileScale)
							return;

						method11281(class390_3, i_5, i_6, i_7, i_12, i_13, i_14, i_15);
					} else if (i_1 == 4) {
						i_12 = aShort8284 - aShort8283;

						for (i_13 = 0; i_13 < maxDepth; i_13++)
							verticesY[i_13] += (class390_4.averageHeight(verticesX[i_13] + i_5, verticesZ[i_13] + i_7) - i_6) + i_12;
					} else if (i_1 == 5) {
						i_12 = aShort8284 - aShort8283;

						for (i_13 = 0; i_13 < maxDepth; i_13++) {
							i_14 = i_5 + verticesX[i_13];
							i_15 = i_7 + verticesZ[i_13];
							int i_16 = class390_3.averageHeight(i_14, i_15);
							int i_17 = class390_4.averageHeight(i_14, i_15);
							int i_18 = i_16 - i_17 - i_2;
							verticesY[i_13] = (i_18 * ((verticesY[i_13] << 8) / i_12) >> 8) - (i_6 - i_16);
						}
					}
				}
			}

			if (aClass143_8272 != null)
				aClass143_8272.anInterface14_1667 = null;

			aBool8254 = false;
		}

	}

	@Override
	public void be() {
		int i_1;
		for (i_1 = 0; i_1 < maxDepth; i_1++)
			verticesZ[i_1] = -verticesZ[i_1];

		for (i_1 = 0; i_1 < anInt8300; i_1++)
			aShortArray8261[i_1] = (short) (-aShortArray8261[i_1]);

		for (i_1 = 0; i_1 < triangleCount * 3 * -1431655765; i_1++) {
			short s_2 = aShortArray8266[i_1];
			aShortArray8266[i_1] = aShortArray8256[i_1];
			aShortArray8256[i_1] = s_2;
		}

		if (aClass143_8274 == null && aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

		if (aClass143_8274 != null)
			aClass143_8274.anInterface14_1667 = null;

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		if (aClass132_8276 != null)
			aClass132_8276.anInterface15_1595 = null;

		aBool8254 = false;
	}

	@Override
	public void bf(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = verticesY[i_4] * i_3 - verticesZ[i_4] * i_2 >> 14;
		verticesZ[i_4] = verticesY[i_4] * i_2 + verticesZ[i_4] * i_3 >> 14;
		verticesY[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	boolean bh() {
		if (anIntArrayArray8263 == null)
			return false;
		for (int i_1 = 0; i_1 < vertexCount; i_1++) {
			verticesX[i_1] <<= 4;
			verticesY[i_1] <<= 4;
			verticesZ[i_1] <<= 4;
		}

		anInt8271 = 0;
		anInt8247 = 0;
		anInt8232 = 0;
		return true;
	}

	@Override
	public void bi(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = verticesZ[i_4] * i_2 + verticesX[i_4] * i_3 >> 14;
		verticesZ[i_4] = verticesZ[i_4] * i_3 - verticesX[i_4] * i_2 >> 14;
			verticesX[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public void bj(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		int i_4;
		int i_5;
		for (i_4 = 0; i_4 < maxDepth; i_4++) {
			i_5 = verticesZ[i_4] * i_2 + verticesX[i_4] * i_3 >> 14;
		verticesZ[i_4] = verticesZ[i_4] * i_3 - verticesX[i_4] * i_2 >> 14;
			verticesX[i_4] = i_5;
		}

		for (i_4 = 0; i_4 < anInt8300; i_4++) {
			i_5 = aShortArray8261[i_4] * i_2 + aShortArray8255[i_4] * i_3 >> 14;
		aShortArray8261[i_4] = (short) (aShortArray8261[i_4] * i_3 - aShortArray8255[i_4] * i_2 >> 14);
		aShortArray8255[i_4] = (short) i_5;
		}

		if (aClass143_8274 == null && aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

		if (aClass143_8274 != null)
			aClass143_8274.anInterface14_1667 = null;

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public void bk(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = verticesY[i_4] * i_3 - verticesZ[i_4] * i_2 >> 14;
		verticesZ[i_4] = verticesY[i_4] * i_2 + verticesZ[i_4] * i_3 >> 14;
						verticesY[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	void bl(int i_1, int[] ints_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7, int[] ints_8) {
		int i_31 = i_3;
		int i_41 = i_4;
		int i_51 = i_5;
		int i_9 = ints_2.length;
		int i_10;
		int i_11;
		int i_12;
		int i_14;
		int i_15;
		if (i_1 == 0) {
			i_31 <<= 4;
			i_41 <<= 4;
			i_51 <<= 4;
			i_10 = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;

			for (i_11 = 0; i_11 < i_9; i_11++) {
				i_12 = ints_2[i_11];
				if (i_12 < anIntArrayArray8263.length) {
					int[] ints_13 = anIntArrayArray8263[i_12];

					for (i_14 = 0; i_14 < ints_13.length; i_14++) {
						i_15 = ints_13[i_14];
						if (aShortArray8253 == null || (i_7 & aShortArray8253[i_15]) != 0) {
							anInt8271 += verticesX[i_15];
							anInt8247 += verticesY[i_15];
							anInt8232 += verticesZ[i_15];
							++i_10;
						}
					}
				}
			}

			if (i_10 > 0) {
				anInt8271 = anInt8271 / i_10 + i_31;
				anInt8247 = anInt8247 / i_10 + i_41;
				anInt8232 = anInt8232 / i_10 + i_51;
				aBool8233 = true;
			} else {
				anInt8271 = i_31;
				anInt8247 = i_41;
				anInt8232 = i_51;
			}
		} else {
			int[] ints_47;
			int i_48;
			if (i_1 == 1) {
				if (ints_8 != null) {
					i_10 = ints_8[0] * i_31 + ints_8[1] * i_41 + ints_8[2] * i_51 + 8192 >> 14;
				i_11 = ints_8[3] * i_31 + ints_8[4] * i_41 + ints_8[5] * i_51 + 8192 >> 14;
			i_12 = ints_8[6] * i_31 + ints_8[7] * i_41 + ints_8[8] * i_51 + 8192 >> 14;
			i_31 = i_10;
			i_41 = i_11;
			i_51 = i_12;
				}

				i_31 <<= 4;
				i_41 <<= 4;
				i_51 <<= 4;

				for (i_10 = 0; i_10 < i_9; i_10++) {
					i_11 = ints_2[i_10];
					if (i_11 < anIntArrayArray8263.length) {
						ints_47 = anIntArrayArray8263[i_11];

						for (i_48 = 0; i_48 < ints_47.length; i_48++) {
							i_14 = ints_47[i_48];
							if (aShortArray8253 == null || (i_7 & aShortArray8253[i_14]) != 0) {
								verticesX[i_14] += i_31;
								verticesY[i_14] += i_41;
								verticesZ[i_14] += i_51;
							}
						}
					}
				}
			} else {
				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_26;
				int i_27;
				int i_28;
				int i_30;
				int i_32;
				int i_33;
				int i_34;
				int[] ints_35;
				int i_36;
				int i_37;
				int i_38;
				int i_39;
				int i_40;
				if (i_1 == 2) {
					if (ints_8 != null) {
						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_48 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (aBool8233) {
							i_16 = ints_8[0] * anInt8271 + ints_8[3] * anInt8247 + ints_8[6] * anInt8232 + 8192 >> 14;
						i_17 = ints_8[1] * anInt8271 + ints_8[4] * anInt8247 + ints_8[7] * anInt8232 + 8192 >> 14;
						i_18 = ints_8[2] * anInt8271 + ints_8[5] * anInt8247 + ints_8[8] * anInt8232 + 8192 >> 14;
						i_16 += i_48;
						i_17 += i_14;
						i_18 += i_15;
						anInt8271 = i_16;
						anInt8247 = i_17;
						anInt8232 = i_18;
						aBool8233 = false;
						}

						int[] ints_49 = new int[9];
						i_17 = Trig.COSINE[i_31];
						i_18 = Trig.SINE[i_31];
						i_19 = Trig.COSINE[i_41];
						i_20 = Trig.SINE[i_41];
						i_21 = Trig.COSINE[i_51];
						i_22 = Trig.SINE[i_51];
						i_23 = i_18 * i_21 + 8192 >> 14;
						i_24 = i_18 * i_22 + 8192 >> 14;
						ints_49[0] = i_19 * i_21 + i_20 * i_24 + 8192 >> 14;
						ints_49[1] = -i_19 * i_22 + i_20 * i_23 + 8192 >> 14;
						ints_49[2] = i_20 * i_17 + 8192 >> 14;
				ints_49[3] = i_17 * i_22 + 8192 >> 14;
				ints_49[4] = i_17 * i_21 + 8192 >> 14;
				ints_49[5] = -i_18;
				ints_49[6] = -i_20 * i_21 + i_19 * i_24 + 8192 >> 14;
				ints_49[7] = i_20 * i_22 + i_19 * i_23 + 8192 >> 14;
			ints_49[8] = i_19 * i_17 + 8192 >> 14;
			int i_25 = ints_49[0] * -anInt8271 + ints_49[1] * -anInt8247 + ints_49[2] * -anInt8232 + 8192 >> 14;
			i_26 = ints_49[3] * -anInt8271 + ints_49[4] * -anInt8247 + ints_49[5] * -anInt8232 + 8192 >> 14;
			i_27 = ints_49[6] * -anInt8271 + ints_49[7] * -anInt8247 + ints_49[8] * -anInt8232 + 8192 >> 14;
			i_28 = i_25 + anInt8271;
			int i_29 = i_26 + anInt8247;
			i_30 = i_27 + anInt8232;
			int[] ints_31 = new int[9];

			for (i_32 = 0; i_32 < 3; i_32++)
				for (i_33 = 0; i_33 < 3; i_33++) {
					i_34 = 0;

					for (int i_53 = 0; i_53 < 3; i_53++)
						i_34 += ints_49[i_32 * 3 + i_53] * ints_8[i_33 * 3 + i_53];

					ints_31[i_32 * 3 + i_33] = i_34 + 8192 >> 14;
				}

			i_32 = ints_49[0] * i_48 + ints_49[1] * i_14 + ints_49[2] * i_15 + 8192 >> 14;
			i_33 = ints_49[3] * i_48 + ints_49[4] * i_14 + ints_49[5] * i_15 + 8192 >> 14;
			i_34 = ints_49[6] * i_48 + ints_49[7] * i_14 + ints_49[8] * i_15 + 8192 >> 14;
			i_32 += i_28;
			i_33 += i_29;
			i_34 += i_30;
			ints_35 = new int[9];

			for (i_36 = 0; i_36 < 3; i_36++)
				for (i_37 = 0; i_37 < 3; i_37++) {
					i_38 = 0;

					for (i_39 = 0; i_39 < 3; i_39++)
						i_38 += ints_8[i_36 * 3 + i_39] * ints_31[i_37 + i_39 * 3];

					ints_35[i_36 * 3 + i_37] = i_38 + 8192 >> 14;
				}

			i_36 = ints_8[0] * i_32 + ints_8[1] * i_33 + ints_8[2] * i_34 + 8192 >> 14;
			i_37 = ints_8[3] * i_32 + ints_8[4] * i_33 + ints_8[5] * i_34 + 8192 >> 14;
			i_38 = ints_8[6] * i_32 + ints_8[7] * i_33 + ints_8[8] * i_34 + 8192 >> 14;
			i_36 += i_10;
			i_37 += i_11;
			i_38 += i_12;

			for (i_39 = 0; i_39 < i_9; i_39++) {
				i_40 = ints_2[i_39];
				if (i_40 < anIntArrayArray8263.length) {
					int[] ints_41 = anIntArrayArray8263[i_40];

					for (int element : ints_41) {
						int i_43 = element;
						if (aShortArray8253 == null || (i_7 & aShortArray8253[i_43]) != 0) {
							int i_44 = ints_35[0] * verticesX[i_43] + ints_35[1] * verticesY[i_43] + ints_35[2] * verticesZ[i_43] + 8192 >> 14;
				int i_45 = ints_35[3] * verticesX[i_43] + ints_35[4] * verticesY[i_43] + ints_35[5] * verticesZ[i_43] + 8192 >> 14;
				int i_46 = ints_35[6] * verticesX[i_43] + ints_35[7] * verticesY[i_43] + ints_35[8] * verticesZ[i_43] + 8192 >> 14;
				i_44 += i_36;
				i_45 += i_37;
				i_46 += i_38;
				verticesX[i_43] = i_44;
				verticesY[i_43] = i_45;
				verticesZ[i_43] = i_46;
						}
					}
				}
			}
					} else {
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < anIntArrayArray8263.length) {
								ints_47 = anIntArrayArray8263[i_11];

								for (i_48 = 0; i_48 < ints_47.length; i_48++) {
									i_14 = ints_47[i_48];
									if (aShortArray8253 == null || (i_7 & aShortArray8253[i_14]) != 0) {
										verticesX[i_14] -= anInt8271;
										verticesY[i_14] -= anInt8247;
										verticesZ[i_14] -= anInt8232;
										if (i_51 != 0) {
											i_15 = Trig.SINE[i_51];
											i_16 = Trig.COSINE[i_51];
											i_17 = verticesY[i_14] * i_15 + verticesX[i_14] * i_16 + 16383 >> 14;
								verticesY[i_14] = verticesY[i_14] * i_16 - verticesX[i_14] * i_15 + 16383 >> 14;
						verticesX[i_14] = i_17;
										}

										if (i_31 != 0) {
											i_15 = Trig.SINE[i_31];
											i_16 = Trig.COSINE[i_31];
											i_17 = verticesY[i_14] * i_16 - verticesZ[i_14] * i_15 + 16383 >> 14;
											verticesZ[i_14] = verticesY[i_14] * i_15 + verticesZ[i_14] * i_16 + 16383 >> 14;
											verticesY[i_14] = i_17;
										}

										if (i_41 != 0) {
											i_15 = Trig.SINE[i_41];
											i_16 = Trig.COSINE[i_41];
											i_17 = verticesZ[i_14] * i_15 + verticesX[i_14] * i_16 + 16383 >> 14;
											verticesZ[i_14] = verticesZ[i_14] * i_16 - verticesX[i_14] * i_15 + 16383 >> 14;
											verticesX[i_14] = i_17;
										}

										verticesX[i_14] += anInt8271;
										verticesY[i_14] += anInt8247;
										verticesZ[i_14] += anInt8232;
									}
								}
							}
						}

						if (bool_6) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < anIntArrayArray8263.length) {
									ints_47 = anIntArrayArray8263[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										i_14 = ints_47[i_48];
										if (aShortArray8253 == null || (i_7 & aShortArray8253[i_14]) != 0) {
											i_15 = triangles[i_14];
											i_16 = triangles[i_14 + 1];

											for (i_17 = i_15; i_17 < i_16; i_17++) {
												i_18 = aShortArray8288[i_17] - 1;
												if (i_18 == -1)
													break;

												if (i_51 != 0) {
													i_19 = Trig.SINE[i_51];
													i_20 = Trig.COSINE[i_51];
													i_21 = aShortArray8270[i_18] * i_19 + aShortArray8255[i_18] * i_20 + 16383 >> 14;
											aShortArray8270[i_18] = (short) (aShortArray8270[i_18] * i_20 - aShortArray8255[i_18] * i_19 + 16383 >> 14);
											aShortArray8255[i_18] = (short) i_21;
												}

												if (i_31 != 0) {
													i_19 = Trig.SINE[i_31];
													i_20 = Trig.COSINE[i_31];
													i_21 = aShortArray8270[i_18] * i_20 - aShortArray8261[i_18] * i_19 + 16383 >> 14;
													aShortArray8261[i_18] = (short) (aShortArray8270[i_18] * i_19 + aShortArray8261[i_18] * i_20 + 16383 >> 14);
													aShortArray8270[i_18] = (short) i_21;
												}

												if (i_41 != 0) {
													i_19 = Trig.SINE[i_41];
													i_20 = Trig.COSINE[i_41];
													i_21 = aShortArray8261[i_18] * i_19 + aShortArray8255[i_18] * i_20 + 16383 >> 14;
													aShortArray8261[i_18] = (short) (aShortArray8261[i_18] * i_20 - aShortArray8255[i_18] * i_19 + 16383 >> 14);
													aShortArray8255[i_18] = (short) i_21;
												}
											}
										}
									}
								}
							}

							if (aClass143_8274 == null && aClass143_8273 != null)
								aClass143_8273.anInterface14_1667 = null;

							if (aClass143_8274 != null)
								aClass143_8274.anInterface14_1667 = null;
						}
					}
				} else if (i_1 == 3) {
					if (ints_8 != null) {
						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_48 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (aBool8233) {
							i_16 = ints_8[0] * anInt8271 + ints_8[3] * anInt8247 + ints_8[6] * anInt8232 + 8192 >> 14;
						i_17 = ints_8[1] * anInt8271 + ints_8[4] * anInt8247 + ints_8[7] * anInt8232 + 8192 >> 14;
						i_18 = ints_8[2] * anInt8271 + ints_8[5] * anInt8247 + ints_8[8] * anInt8232 + 8192 >> 14;
						i_16 += i_48;
						i_17 += i_14;
						i_18 += i_15;
						anInt8271 = i_16;
						anInt8247 = i_17;
						anInt8232 = i_18;
						aBool8233 = false;
						}

						i_16 = i_31 << 15 >> 7;
						i_17 = i_41 << 15 >> 7;
						i_18 = i_51 << 15 >> 7;
						i_19 = i_16 * -anInt8271 + 8192 >> 14;
						i_20 = i_17 * -anInt8247 + 8192 >> 14;
						i_21 = i_18 * -anInt8232 + 8192 >> 14;
						i_22 = i_19 + anInt8271;
						i_23 = i_20 + anInt8247;
						i_24 = i_21 + anInt8232;
						int[] ints_50 = {i_16 * ints_8[0] + 8192 >> 14, i_16 * ints_8[3] + 8192 >> 14, i_16 * ints_8[6] + 8192 >> 14, i_17 * ints_8[1] + 8192 >> 14, i_17 * ints_8[4] + 8192 >> 14, i_17 * ints_8[7] + 8192 >> 14, i_18 * ints_8[2] + 8192 >> 14, i_18 * ints_8[5] + 8192 >> 14, i_18 * ints_8[8] + 8192 >> 14};
						i_26 = i_16 * i_48 + 8192 >> 14;
						i_27 = i_17 * i_14 + 8192 >> 14;
						i_28 = i_18 * i_15 + 8192 >> 14;
						i_26 += i_22;
						i_27 += i_23;
						i_28 += i_24;
						int[] ints_51 = new int[9];

						int i_52;
						for (i_30 = 0; i_30 < 3; i_30++)
							for (i_52 = 0; i_52 < 3; i_52++) {
								i_32 = 0;

								for (i_33 = 0; i_33 < 3; i_33++)
									i_32 += ints_8[i_30 * 3 + i_33] * ints_50[i_52 + i_33 * 3];

								ints_51[i_30 * 3 + i_52] = i_32 + 8192 >> 14;
							}

						i_30 = ints_8[0] * i_26 + ints_8[1] * i_27 + ints_8[2] * i_28 + 8192 >> 14;
						i_52 = ints_8[3] * i_26 + ints_8[4] * i_27 + ints_8[5] * i_28 + 8192 >> 14;
						i_32 = ints_8[6] * i_26 + ints_8[7] * i_27 + ints_8[8] * i_28 + 8192 >> 14;
						i_30 += i_10;
						i_52 += i_11;
						i_32 += i_12;

						for (i_33 = 0; i_33 < i_9; i_33++) {
							i_34 = ints_2[i_33];
							if (i_34 < anIntArrayArray8263.length) {
								ints_35 = anIntArrayArray8263[i_34];

								for (i_36 = 0; i_36 < ints_35.length; i_36++) {
									i_37 = ints_35[i_36];
									if (aShortArray8253 == null || (i_7 & aShortArray8253[i_37]) != 0) {
										i_38 = ints_51[0] * verticesX[i_37] + ints_51[1] * verticesY[i_37] + ints_51[2] * verticesZ[i_37] + 8192 >> 14;
								i_39 = ints_51[3] * verticesX[i_37] + ints_51[4] * verticesY[i_37] + ints_51[5] * verticesZ[i_37] + 8192 >> 14;
						i_40 = ints_51[6] * verticesX[i_37] + ints_51[7] * verticesY[i_37] + ints_51[8] * verticesZ[i_37] + 8192 >> 14;
						i_38 += i_30;
						i_39 += i_52;
						i_40 += i_32;
						verticesX[i_37] = i_38;
						verticesY[i_37] = i_39;
						verticesZ[i_37] = i_40;
									}
								}
							}
						}
					} else
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < anIntArrayArray8263.length) {
								ints_47 = anIntArrayArray8263[i_11];

								for (i_48 = 0; i_48 < ints_47.length; i_48++) {
									i_14 = ints_47[i_48];
									if (aShortArray8253 == null || (i_7 & aShortArray8253[i_14]) != 0) {
										verticesX[i_14] -= anInt8271;
										verticesY[i_14] -= anInt8247;
										verticesZ[i_14] -= anInt8232;
										verticesX[i_14] = verticesX[i_14] * i_31 >> 7;
								verticesY[i_14] = verticesY[i_14] * i_41 >> 7;
						verticesZ[i_14] = verticesZ[i_14] * i_51 >> 7;
						verticesX[i_14] += anInt8271;
						verticesY[i_14] += anInt8247;
						verticesZ[i_14] += anInt8232;
									}
								}
							}
						}
				} else {
					Class162 class162_54;
					Class145 class145_56;
					if (i_1 == 5) {
						if (anIntArrayArray8282 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < anIntArrayArray8282.length) {
									ints_47 = anIntArrayArray8282[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										i_14 = ints_47[i_48];
										if (aShortArray8304 == null || (i_7 & aShortArray8304[i_14]) != 0) {
											i_15 = (aByteArray8265[i_14] & 0xff) + i_31 * 8;
											if (i_15 < 0)
												i_15 = 0;
											else if (i_15 > 255)
												i_15 = 255;

											aByteArray8265[i_14] = (byte) i_15;
											if (aClass143_8273 != null)
												aClass143_8273.anInterface14_1667 = null;
										}
									}
								}
							}

							if (aClass162Array8295 != null)
								for (i_10 = 0; i_10 < anInt8294; i_10++) {
									class162_54 = aClass162Array8295[i_10];
									class145_56 = aClass145Array8258[i_10];
									class145_56.anInt1714 = class145_56.anInt1714 & 0xffffff | 255 - (aByteArray8265[class162_54.anInt2023] & 0xff) << 24;
								}
						}
					} else if (i_1 == 7) {
						if (anIntArrayArray8282 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < anIntArrayArray8282.length) {
									ints_47 = anIntArrayArray8282[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										i_14 = ints_47[i_48];
										if (aShortArray8304 == null || (i_7 & aShortArray8304[i_14]) != 0) {
											i_15 = colors[i_14] & 0xffff;
											i_16 = i_15 >> 10 & 0x3f;
									i_17 = i_15 >> 7 & 0x7;
							i_18 = i_15 & 0x7f;
							i_16 = i_16 + i_31 & 0x3f;
							i_17 += i_41 / 4;
							if (i_17 < 0)
								i_17 = 0;
							else if (i_17 > 7)
								i_17 = 7;

							i_18 += i_51;
							if (i_18 < 0)
								i_18 = 0;
							else if (i_18 > 127)
								i_18 = 127;

							colors[i_14] = (short) (i_16 << 10 | i_17 << 7 | i_18);
							if (aClass143_8273 != null)
								aClass143_8273.anInterface14_1667 = null;
										}
									}
								}
							}

							if (aClass162Array8295 != null)
								for (i_10 = 0; i_10 < anInt8294; i_10++) {
									class162_54 = aClass162Array8295[i_10];
									class145_56 = aClass145Array8258[i_10];
									class145_56.anInt1714 = class145_56.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_54.anInt2023] & 0xffff] & 0xffffff;
								}
						}
					} else {
						Class145 class145_55;
						if (i_1 == 8) {
							if (anIntArrayArray8278 != null)
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < anIntArrayArray8278.length) {
										ints_47 = anIntArrayArray8278[i_11];

										for (i_48 = 0; i_48 < ints_47.length; i_48++) {
											class145_55 = aClass145Array8258[ints_47[i_48]];
											class145_55.anInt1709 += i_31;
											class145_55.anInt1713 += i_41;
										}
									}
								}
						} else if (i_1 == 10) {
							if (anIntArrayArray8278 != null)
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < anIntArrayArray8278.length) {
										ints_47 = anIntArrayArray8278[i_11];

										for (i_48 = 0; i_48 < ints_47.length; i_48++) {
											class145_55 = aClass145Array8258[ints_47[i_48]];
											class145_55.anInt1710 = class145_55.anInt1710 * i_31 >> 7;
										class145_55.anInt1711 = class145_55.anInt1711 * i_41 >> 7;
										}
									}
								}
						} else if (i_1 == 9 && anIntArrayArray8278 != null)
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < anIntArrayArray8278.length) {
									ints_47 = anIntArrayArray8278[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										class145_55 = aClass145Array8258[ints_47[i_48]];
										class145_55.anInt1712 = class145_55.anInt1712 + i_31 & 0x3fff;
									}
								}
							}
					}
				}
			}
		}

	}

	@Override
	public void bm(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = verticesY[i_4] * i_3 - verticesZ[i_4] * i_2 >> 14;
		verticesZ[i_4] = verticesY[i_4] * i_2 + verticesZ[i_4] * i_3 >> 14;
								verticesY[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public void bn(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = verticesY[i_4] * i_3 - verticesZ[i_4] * i_2 >> 14;
		verticesZ[i_4] = verticesY[i_4] * i_2 + verticesZ[i_4] * i_3 >> 14;
								verticesY[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	void bo(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (i_1 == 0) {
			i_5 = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;

			for (i_6 = 0; i_6 < maxDepth; i_6++) {
				anInt8271 += verticesX[i_6];
				anInt8247 += verticesY[i_6];
				anInt8232 += verticesZ[i_6];
				++i_5;
			}

			if (i_5 > 0) {
				anInt8271 = anInt8271 / i_5 + i_2;
				anInt8247 = anInt8247 / i_5 + i_3;
				anInt8232 = anInt8232 / i_5 + i_4;
			} else {
				anInt8271 = i_2;
				anInt8247 = i_3;
				anInt8232 = i_4;
			}
		} else if (i_1 == 1)
			for (i_5 = 0; i_5 < maxDepth; i_5++) {
				verticesX[i_5] += i_2;
				verticesY[i_5] += i_3;
				verticesZ[i_5] += i_4;
			}
		else {
			int i_7;
			int i_8;
			if (i_1 == 2)
				for (i_5 = 0; i_5 < maxDepth; i_5++) {
					verticesX[i_5] -= anInt8271;
					verticesY[i_5] -= anInt8247;
					verticesZ[i_5] -= anInt8232;
					if (i_4 != 0) {
						i_6 = Trig.SINE[i_4];
						i_7 = Trig.COSINE[i_4];
						i_8 = verticesY[i_5] * i_6 + verticesX[i_5] * i_7 + 16383 >> 14;
				verticesY[i_5] = verticesY[i_5] * i_7 - verticesX[i_5] * i_6 + 16383 >> 14;
							verticesX[i_5] = i_8;
					}

					if (i_2 != 0) {
						i_6 = Trig.SINE[i_2];
						i_7 = Trig.COSINE[i_2];
						i_8 = verticesY[i_5] * i_7 - verticesZ[i_5] * i_6 + 16383 >> 14;
							verticesZ[i_5] = verticesY[i_5] * i_6 + verticesZ[i_5] * i_7 + 16383 >> 14;
									verticesY[i_5] = i_8;
					}

					if (i_3 != 0) {
						i_6 = Trig.SINE[i_3];
						i_7 = Trig.COSINE[i_3];
						i_8 = verticesZ[i_5] * i_6 + verticesX[i_5] * i_7 + 16383 >> 14;
									verticesZ[i_5] = verticesZ[i_5] * i_7 - verticesX[i_5] * i_6 + 16383 >> 14;
							verticesX[i_5] = i_8;
					}

					verticesX[i_5] += anInt8271;
					verticesY[i_5] += anInt8247;
					verticesZ[i_5] += anInt8232;
				}
			else if (i_1 == 3)
				for (i_5 = 0; i_5 < maxDepth; i_5++) {
					verticesX[i_5] -= anInt8271;
					verticesY[i_5] -= anInt8247;
					verticesZ[i_5] -= anInt8232;
					verticesX[i_5] = verticesX[i_5] * i_2 / 128;
					verticesY[i_5] = verticesY[i_5] * i_3 / 128;
					verticesZ[i_5] = verticesZ[i_5] * i_4 / 128;
					verticesX[i_5] += anInt8271;
					verticesY[i_5] += anInt8247;
					verticesZ[i_5] += anInt8232;
				}
			else {
				Class162 class162_10;
				Class145 class145_11;
				if (i_1 == 5) {
					for (i_5 = 0; i_5 < triangleCount * 3 * -1431655765; i_5++) {
						i_6 = (aByteArray8265[i_5] & 0xff) + i_2 * 8;
						if (i_6 < 0)
							i_6 = 0;
						else if (i_6 > 255)
							i_6 = 255;

						aByteArray8265[i_5] = (byte) i_6;
					}

					if (aClass143_8273 != null)
						aClass143_8273.anInterface14_1667 = null;

					if (aClass162Array8295 != null)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class162_10 = aClass162Array8295[i_5];
							class145_11 = aClass145Array8258[i_5];
							class145_11.anInt1714 = class145_11.anInt1714 & 0xffffff | 255 - (aByteArray8265[class162_10.anInt2023] & 0xff) << 24;
						}
				} else if (i_1 == 7) {
					for (i_5 = 0; i_5 < triangleCount * 3 * -1431655765; i_5++) {
						i_6 = colors[i_5] & 0xffff;
						i_7 = i_6 >> 10 & 0x3f;
					i_8 = i_6 >> 7 & 0x7;
							int i_9 = i_6 & 0x7f;
							i_7 = i_7 + i_2 & 0x3f;
							i_8 += i_3 / 4;
							if (i_8 < 0)
								i_8 = 0;
							else if (i_8 > 7)
								i_8 = 7;

							i_9 += i_4;
							if (i_9 < 0)
								i_9 = 0;
							else if (i_9 > 127)
								i_9 = 127;

							colors[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
					}

					if (aClass143_8273 != null)
						aClass143_8273.anInterface14_1667 = null;

					if (aClass162Array8295 != null)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class162_10 = aClass162Array8295[i_5];
							class145_11 = aClass145Array8258[i_5];
							class145_11.anInt1714 = class145_11.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_10.anInt2023] & 0xffff] & 0xffffff;
						}
				} else {
					Class145 class145_12;
					if (i_1 == 8)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class145_12 = aClass145Array8258[i_5];
							class145_12.anInt1709 += i_2;
							class145_12.anInt1713 += i_3;
						}
					else if (i_1 == 10)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class145_12 = aClass145Array8258[i_5];
							class145_12.anInt1710 = class145_12.anInt1710 * i_2 >> 7;
						class145_12.anInt1711 = class145_12.anInt1711 * i_3 >> 7;
						}
					else if (i_1 == 9)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class145_12 = aClass145Array8258[i_5];
							class145_12.anInt1712 = class145_12.anInt1712 + i_2 & 0x3fff;
						}
				}
			}
		}

	}

	@Override
	void bp() {
		for (int i_1 = 0; i_1 < vertexCount; i_1++) {
			verticesX[i_1] = verticesX[i_1] + 7 >> 4;
		verticesY[i_1] = verticesY[i_1] + 7 >> 4;
							verticesZ[i_1] = verticesZ[i_1] + 7 >> 4;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public void bq() {
		int i_1;
		for (i_1 = 0; i_1 < maxDepth; i_1++)
			verticesZ[i_1] = -verticesZ[i_1];

		for (i_1 = 0; i_1 < anInt8300; i_1++)
			aShortArray8261[i_1] = (short) (-aShortArray8261[i_1]);

		for (i_1 = 0; i_1 < triangleCount * 3 * -1431655765; i_1++) {
			short s_2 = aShortArray8266[i_1];
			aShortArray8266[i_1] = aShortArray8256[i_1];
			aShortArray8256[i_1] = s_2;
		}

		if (aClass143_8274 == null && aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

		if (aClass143_8274 != null)
			aClass143_8274.anInterface14_1667 = null;

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		if (aClass132_8276 != null)
			aClass132_8276.anInterface15_1595 = null;

		aBool8254 = false;
	}

	@Override
	public void bs(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = verticesY[i_4] * i_3 - verticesZ[i_4] * i_2 >> 14;
		verticesZ[i_4] = verticesY[i_4] * i_2 + verticesZ[i_4] * i_3 >> 14;
		verticesY[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	boolean bv() {
		if (anIntArrayArray8263 == null)
			return false;
		for (int i_1 = 0; i_1 < vertexCount; i_1++) {
			verticesX[i_1] <<= 4;
			verticesY[i_1] <<= 4;
			verticesZ[i_1] <<= 4;
		}

		anInt8271 = 0;
		anInt8247 = 0;
		anInt8232 = 0;
		return true;
	}

	@Override
	public void bw(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = verticesZ[i_4] * i_2 + verticesX[i_4] * i_3 >> 14;
		verticesZ[i_4] = verticesZ[i_4] * i_3 - verticesX[i_4] * i_2 >> 14;
			verticesX[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public void bx(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = verticesZ[i_4] * i_2 + verticesX[i_4] * i_3 >> 14;
		verticesZ[i_4] = verticesZ[i_4] * i_3 - verticesX[i_4] * i_2 >> 14;
			verticesX[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public void by() {
		int i_1;
		for (i_1 = 0; i_1 < maxDepth; i_1++)
			verticesZ[i_1] = -verticesZ[i_1];

		for (i_1 = 0; i_1 < anInt8300; i_1++)
			aShortArray8261[i_1] = (short) (-aShortArray8261[i_1]);

		for (i_1 = 0; i_1 < triangleCount * 3 * -1431655765; i_1++) {
			short s_2 = aShortArray8266[i_1];
			aShortArray8266[i_1] = aShortArray8256[i_1];
			aShortArray8256[i_1] = s_2;
		}

		if (aClass143_8274 == null && aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

		if (aClass143_8274 != null)
			aClass143_8274.anInterface14_1667 = null;

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		if (aClass132_8276 != null)
			aClass132_8276.anInterface15_1595 = null;

		aBool8254 = false;
	}

	@Override
	public void bz(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		int i_4;
		int i_5;
		for (i_4 = 0; i_4 < maxDepth; i_4++) {
			i_5 = verticesZ[i_4] * i_2 + verticesX[i_4] * i_3 >> 14;
		verticesZ[i_4] = verticesZ[i_4] * i_3 - verticesX[i_4] * i_2 >> 14;
		verticesX[i_4] = i_5;
		}

		for (i_4 = 0; i_4 < anInt8300; i_4++) {
			i_5 = aShortArray8261[i_4] * i_2 + aShortArray8255[i_4] * i_3 >> 14;
		aShortArray8261[i_4] = (short) (aShortArray8261[i_4] * i_3 - aShortArray8255[i_4] * i_2 >> 14);
		aShortArray8255[i_4] = (short) i_5;
		}

		if (aClass143_8274 == null && aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

		if (aClass143_8274 != null)
			aClass143_8274.anInterface14_1667 = null;

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public int c() {
		return aShort8243;
	}

	@Override
	public int ca() {
		if (!aBool8254)
			method13528();

		return aShort8283;
	}

	@Override
	public int cb() {
		if (!aBool8254)
			method13528();

		return aShort8283;
	}

	@Override
	public int cc() {
		if (!aBool8254)
			method13528();

		return aShort8285;
	}

	@Override
	public int cd() {
		if (!aBool8254)
			method13528();

		return aShort8306;
	}

	@Override
	public void ce(int i_1) {
		aShort8243 = (short) i_1;
		if (aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

	}

	@Override
	public int ch() {
		return aShort8257;
	}

	@Override
	public int ci() {
		if (!aBool8254)
			method13528();

		return aShort8285;
	}

	@Override
	public int ck() {
		if (!aBool8254)
			method13528();

		return aShort8287;
	}

	@Override
	public int cm() {
		if (!aBool8254)
			method13528();

		return aShort8283;
	}

	@Override
	public int co() {
		if (!aBool8254)
			method13528();

		return aShort8306;
	}

	@Override
	public int cp() {
		if (!aBool8254)
			method13528();

		return aShort8285;
	}

	@Override
	public void cq(short s_1, short s_2) {
		int i_3;
		for (i_3 = 0; i_3 < triangleCount * 3 * -1431655765; i_3++)
			if (colors[i_3] == s_1)
				colors[i_3] = s_2;

		if (aClass162Array8295 != null)
			for (i_3 = 0; i_3 < anInt8294; i_3++) {
				Class162 class162_4 = aClass162Array8295[i_3];
				Class145 class145_5 = aClass145Array8258[i_3];
				class145_5.anInt1714 = class145_5.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_4.anInt2023] & 0xffff] & 0xffffff;
			}

		if (aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

	}

	@Override
	public void cr(int i_1) {
		aShort8257 = (short) i_1;
		if (aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

		if (aClass143_8274 != null)
			aClass143_8274.anInterface14_1667 = null;

	}

	@Override
	public int ct() {
		if (!aBool8254)
			method13528();

		return aShort8286;
	}

	@Override
	public int cu() {
		if (!aBool8254)
			method13528();

		return aShort8286;
	}

	@Override
	public int cv() {
		if (!aBool8254)
			method13528();

		return aShort8285;
	}

	@Override
	public int cw() {
		if (!aBool8254)
			method13528();

		return aShort8283;
	}

	@Override
	public void cy(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		for (i_5 = 0; i_5 < triangleCount * 3 * -1431655765; i_5++) {
			int i_6 = colors[i_5] & 0xffff;
			int i_7 = i_6 >> 10 & 0x3f;
		int i_8 = i_6 >> 7 & 0x7;
		int i_9 = i_6 & 0x7f;
		if (i_1 != -1)
			i_7 += (i_1 - i_7) * i_4 >> 7;

			if (i_2 != -1)
				i_8 += (i_2 - i_8) * i_4 >> 7;

				if (i_3 != -1)
					i_9 += (i_3 - i_9) * i_4 >> 7;

					colors[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
		}

		if (aClass162Array8295 != null)
			for (i_5 = 0; i_5 < anInt8294; i_5++) {
				Class162 class162_10 = aClass162Array8295[i_5];
				Class145 class145_11 = aClass145Array8258[i_5];
				class145_11.anInt1714 = class145_11.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_10.anInt2023] & 0xffff] & 0xffffff;
			}

		if (aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

	}

	@Override
	public byte[] cz() {
		return aByteArray8265;
	}

	@Override
	public Shadow da(Shadow class282_sub50_sub17_1) {
		if (anInt8300 == 0)
			return null;
		if (!aBool8254)
			method13528();

		int i_2;
		int i_3;
		if (aGraphicalRenderer_Sub1_8239.anInt8438 > 0) {
			i_2 = aShort8285 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
					i_3 = aShort8286 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		} else {
			i_2 = aShort8285 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_3 = aShort8286 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		}

		int i_4;
		int i_5;
		if (aGraphicalRenderer_Sub1_8239.anInt8439 > 0) {
			i_4 = aShort8287 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_5 = aShort8306 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		} else {
			i_4 = aShort8287 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_5 = aShort8306 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		}

		int i_6 = i_3 - i_2 + 1;
		int i_7 = i_5 - i_4 + 1;
		CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_8 = (CacheableNode_Sub17_Sub1) class282_sub50_sub17_1;
		CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_9;
		if (class282_sub50_sub17_sub1_8 != null && class282_sub50_sub17_sub1_8.method15716(i_6, i_7)) {
			class282_sub50_sub17_sub1_9 = class282_sub50_sub17_sub1_8;
			class282_sub50_sub17_sub1_8.method15712();
		} else
			class282_sub50_sub17_sub1_9 = new CacheableNode_Sub17_Sub1(i_6, i_7);

		class282_sub50_sub17_sub1_9.method15721(i_2, i_4, i_3, i_5);
		method13522(class282_sub50_sub17_sub1_9);
		return class282_sub50_sub17_sub1_9;
	}

	@Override
	public int dd() {
		if (!aBool8254)
			method13528();

		return aShort8284;
	}

	@Override
	public void df(short s_1, short s_2) {
		ImageLoader interface22_3 = aGraphicalRenderer_Sub1_8239.textureCache;

		for (int i_4 = 0; i_4 < triangleCount * 3 * -1431655765; i_4++)
			if (aShortArray8269[i_4] == s_1)
				aShortArray8269[i_4] = s_2;

		byte b_13 = 0;
		byte b_5 = 0;
		if (s_1 != -1) {
			TextureDetails class169_6 = interface22_3.getTextureDetails(s_1 & 0xffff);
			b_13 = class169_6.shadowFactor;
			b_5 = class169_6.brightness;
		}

		byte b_11 = 0;
		byte b_7 = 0;
		if (s_2 != -1) {
			TextureDetails class169_8 = interface22_3.getTextureDetails(s_2 & 0xffff);
			b_11 = class169_8.shadowFactor;
			b_7 = class169_8.brightness;
			if (class169_8.textureSpeedU != 0 || class169_8.textureSpeedV != 0)
				aBool8246 = true;
		}

		if (b_13 != b_11 | b_5 != b_7) {
			if (aClass162Array8295 != null)
				for (int i_12 = 0; i_12 < anInt8294; i_12++) {
					Class162 class162_9 = aClass162Array8295[i_12];
					Class145 class145_10 = aClass145Array8258[i_12];
					class145_10.anInt1714 = class145_10.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_9.anInt2023] & 0xffff] & 0xffffff;
				}

			if (aClass143_8273 != null)
				aClass143_8273.anInterface14_1667 = null;
		}

	}

	@Override
	public int dg() {
		if (!aBool8254)
			method13528();

		return anInt8280;
	}

	@Override
	public boolean dh() {
		return aBool8246;
	}

	@Override
	public void di(short s_1, short s_2) {
		ImageLoader interface22_3 = aGraphicalRenderer_Sub1_8239.textureCache;

		for (int i_4 = 0; i_4 < triangleCount * 3 * -1431655765; i_4++)
			if (aShortArray8269[i_4] == s_1)
				aShortArray8269[i_4] = s_2;

		byte b_13 = 0;
		byte b_5 = 0;
		if (s_1 != -1) {
			TextureDetails class169_6 = interface22_3.getTextureDetails(s_1 & 0xffff);
			b_13 = class169_6.shadowFactor;
			b_5 = class169_6.brightness;
		}

		byte b_11 = 0;
		byte b_7 = 0;
		if (s_2 != -1) {
			TextureDetails class169_8 = interface22_3.getTextureDetails(s_2 & 0xffff);
			b_11 = class169_8.shadowFactor;
			b_7 = class169_8.brightness;
			if (class169_8.textureSpeedU != 0 || class169_8.textureSpeedV != 0)
				aBool8246 = true;
		}

		if (b_13 != b_11 | b_5 != b_7) {
			if (aClass162Array8295 != null)
				for (int i_12 = 0; i_12 < anInt8294; i_12++) {
					Class162 class162_9 = aClass162Array8295[i_12];
					Class145 class145_10 = aClass145Array8258[i_12];
					class145_10.anInt1714 = class145_10.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_9.anInt2023] & 0xffff] & 0xffffff;
				}

			if (aClass143_8273 != null)
				aClass143_8273.anInterface14_1667 = null;
		}

	}

	@Override
	public void dk(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			if (i_1 != 0)
				verticesX[i_4] += i_1;

			if (i_2 != 0)
				verticesY[i_4] += i_2;

			if (i_3 != 0)
				verticesZ[i_4] += i_3;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public void dl(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = verticesY[i_4] * i_2 + verticesX[i_4] * i_3 >> 14;
		verticesY[i_4] = verticesY[i_4] * i_3 - verticesX[i_4] * i_2 >> 14;
				verticesX[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public int dm() {
		if (!aBool8254)
			method13528();

		return anInt8281;
	}

	@Override
	public Shadow dn(Shadow class282_sub50_sub17_1) {
		if (anInt8300 == 0)
			return null;
		if (!aBool8254)
			method13528();

		int i_2;
		int i_3;
		if (aGraphicalRenderer_Sub1_8239.anInt8438 > 0) {
			i_2 = aShort8285 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_3 = aShort8286 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		} else {
			i_2 = aShort8285 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_3 = aShort8286 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		}

		int i_4;
		int i_5;
		if (aGraphicalRenderer_Sub1_8239.anInt8439 > 0) {
			i_4 = aShort8287 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_5 = aShort8306 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		} else {
			i_4 = aShort8287 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_5 = aShort8306 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		}

		int i_6 = i_3 - i_2 + 1;
		int i_7 = i_5 - i_4 + 1;
		CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_8 = (CacheableNode_Sub17_Sub1) class282_sub50_sub17_1;
		CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_9;
		if (class282_sub50_sub17_sub1_8 != null && class282_sub50_sub17_sub1_8.method15716(i_6, i_7)) {
			class282_sub50_sub17_sub1_9 = class282_sub50_sub17_sub1_8;
			class282_sub50_sub17_sub1_8.method15712();
		} else
			class282_sub50_sub17_sub1_9 = new CacheableNode_Sub17_Sub1(i_6, i_7);

		class282_sub50_sub17_sub1_9.method15721(i_2, i_4, i_3, i_5);
		method13522(class282_sub50_sub17_sub1_9);
		return class282_sub50_sub17_sub1_9;
	}

	@Override
	public int dp() {
		if (!aBool8254)
			method13528();

		return anInt8280;
	}

	@Override
	public int dq() {
		return aShort8243;
	}

	@Override
	public Shadow dr(Shadow class282_sub50_sub17_1) {
		if (anInt8300 == 0)
			return null;
		if (!aBool8254)
			method13528();

		int i_2;
		int i_3;
		if (aGraphicalRenderer_Sub1_8239.anInt8438 > 0) {
			i_2 = aShort8285 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_3 = aShort8286 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		} else {
			i_2 = aShort8285 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_3 = aShort8286 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		}

		int i_4;
		int i_5;
		if (aGraphicalRenderer_Sub1_8239.anInt8439 > 0) {
			i_4 = aShort8287 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_5 = aShort8306 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		} else {
			i_4 = aShort8287 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_5 = aShort8306 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		}

		int i_6 = i_3 - i_2 + 1;
		int i_7 = i_5 - i_4 + 1;
		CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_8 = (CacheableNode_Sub17_Sub1) class282_sub50_sub17_1;
		CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_9;
		if (class282_sub50_sub17_sub1_8 != null && class282_sub50_sub17_sub1_8.method15716(i_6, i_7)) {
			class282_sub50_sub17_sub1_9 = class282_sub50_sub17_sub1_8;
			class282_sub50_sub17_sub1_8.method15712();
		} else
			class282_sub50_sub17_sub1_9 = new CacheableNode_Sub17_Sub1(i_6, i_7);

		class282_sub50_sub17_sub1_9.method15721(i_2, i_4, i_3, i_5);
		method13522(class282_sub50_sub17_sub1_9);
		return class282_sub50_sub17_sub1_9;
	}

	@Override
	public int du() {
		if (!aBool8254)
			method13528();

		return anInt8280;
	}

	@Override
	public boolean dv() {
		return aBool8245;
	}

	@Override
	public Shadow dw(Shadow class282_sub50_sub17_1) {
		if (anInt8300 == 0)
			return null;
		if (!aBool8254)
			method13528();

		int i_2;
		int i_3;
		if (aGraphicalRenderer_Sub1_8239.anInt8438 > 0) {
			i_2 = aShort8285 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_3 = aShort8286 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		} else {
			i_2 = aShort8285 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_3 = aShort8286 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8438 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		}

		int i_4;
		int i_5;
		if (aGraphicalRenderer_Sub1_8239.anInt8439 > 0) {
			i_4 = aShort8287 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_5 = aShort8306 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		} else {
			i_4 = aShort8287 - (aShort8283 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
			i_5 = aShort8306 - (aShort8284 * aGraphicalRenderer_Sub1_8239.anInt8439 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473 * -1431655765 * 3 * -1431655765 * 3;
		}

		int i_6 = i_3 - i_2 + 1;
		int i_7 = i_5 - i_4 + 1;
		CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_8 = (CacheableNode_Sub17_Sub1) class282_sub50_sub17_1;
		CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_9;
		if (class282_sub50_sub17_sub1_8 != null && class282_sub50_sub17_sub1_8.method15716(i_6, i_7)) {
			class282_sub50_sub17_sub1_9 = class282_sub50_sub17_sub1_8;
			class282_sub50_sub17_sub1_8.method15712();
		} else
			class282_sub50_sub17_sub1_9 = new CacheableNode_Sub17_Sub1(i_6, i_7);

		class282_sub50_sub17_sub1_9.method15721(i_2, i_4, i_3, i_5);
		method13522(class282_sub50_sub17_sub1_9);
		return class282_sub50_sub17_sub1_9;
	}

	@Override
	public int dy() {
		if (!aBool8254)
			method13528();

		return anInt8281;
	}

	@Override
	void e(int i_1, int[] ints_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7, int[] ints_8) {
		int i_31 = i_3;
		int i_41 = i_4;
		int i_51 = i_5;
		int i_9 = ints_2.length;
		int i_10;
		int i_11;
		int i_12;
		int i_14;
		int i_15;
		if (i_1 == 0) {
			i_31 <<= 4;
			i_41 <<= 4;
			i_51 <<= 4;
			i_10 = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;

			for (i_11 = 0; i_11 < i_9; i_11++) {
				i_12 = ints_2[i_11];
				if (i_12 < anIntArrayArray8263.length) {
					int[] ints_13 = anIntArrayArray8263[i_12];

					for (i_14 = 0; i_14 < ints_13.length; i_14++) {
						i_15 = ints_13[i_14];
						if (aShortArray8253 == null || (i_7 & aShortArray8253[i_15]) != 0) {
							anInt8271 += verticesX[i_15];
							anInt8247 += verticesY[i_15];
							anInt8232 += verticesZ[i_15];
							++i_10;
						}
					}
				}
			}

			if (i_10 > 0) {
				anInt8271 = i_31 + anInt8271 / i_10;
				anInt8247 = i_41 + anInt8247 / i_10;
				anInt8232 = i_51 + anInt8232 / i_10;
				aBool8233 = true;
			} else {
				anInt8271 = i_31;
				anInt8247 = i_41;
				anInt8232 = i_51;
			}
		} else {
			int[] ints_47;
			int i_48;
			if (i_1 == 1) {
				if (ints_8 != null) {
					i_10 = i_51 * ints_8[2] + ints_8[1] * i_41 + i_31 * ints_8[0] + 8192 >> 14;
				i_11 = i_31 * ints_8[3] + i_51 * ints_8[5] + i_41 * ints_8[4] + 8192 >> 14;
			i_12 = i_31 * ints_8[6] + ints_8[7] * i_41 + i_51 * ints_8[8] + 8192 >> 14;
			i_31 = i_10;
			i_41 = i_11;
			i_51 = i_12;
				}

				i_31 <<= 4;
				i_41 <<= 4;
				i_51 <<= 4;

				for (i_10 = 0; i_10 < i_9; i_10++) {
					i_11 = ints_2[i_10];
					if (i_11 < anIntArrayArray8263.length) {
						ints_47 = anIntArrayArray8263[i_11];

						for (i_48 = 0; i_48 < ints_47.length; i_48++) {
							i_14 = ints_47[i_48];
							if (aShortArray8253 == null || (i_7 & aShortArray8253[i_14]) != 0) {
								verticesX[i_14] += i_31;
								verticesY[i_14] += i_41;
								verticesZ[i_14] += i_51;
							}
						}
					}
				}
			} else {
				int i_16;
				int i_17;
				int i_18;
				int i_19;
				int i_20;
				int i_21;
				int i_22;
				int i_23;
				int i_24;
				int i_26;
				int i_27;
				int i_28;
				int i_30;
				int i_32;
				int i_33;
				int i_34;
				int[] ints_35;
				int i_36;
				int i_37;
				int i_38;
				int i_39;
				int i_40;
				if (i_1 == 2) {
					if (ints_8 != null) {
						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_48 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (aBool8233) {
							i_16 = ints_8[0] * anInt8271 + ints_8[6] * anInt8232 + ints_8[3] * anInt8247 + 8192 >> 14;
						i_17 = ints_8[7] * anInt8232 + ints_8[4] * anInt8247 + ints_8[1] * anInt8271 + 8192 >> 14;
						i_18 = ints_8[8] * anInt8232 + ints_8[2] * anInt8271 + ints_8[5] * anInt8247 + 8192 >> 14;
						i_16 += i_48;
						i_17 += i_14;
						i_18 += i_15;
						anInt8271 = i_16;
						anInt8247 = i_17;
						anInt8232 = i_18;
						aBool8233 = false;
						}

						int[] ints_49 = new int[9];
						i_17 = Trig.COSINE[i_31];
						i_18 = Trig.SINE[i_31];
						i_19 = Trig.COSINE[i_41];
						i_20 = Trig.SINE[i_41];
						i_21 = Trig.COSINE[i_51];
						i_22 = Trig.SINE[i_51];
						i_23 = i_18 * i_21 + 8192 >> 14;
						i_24 = i_18 * i_22 + 8192 >> 14;
						ints_49[0] = i_19 * i_21 + i_20 * i_24 + 8192 >> 14;
						ints_49[1] = i_20 * i_23 + -i_19 * i_22 + 8192 >> 14;
						ints_49[2] = i_20 * i_17 + 8192 >> 14;
				ints_49[3] = i_17 * i_22 + 8192 >> 14;
				ints_49[4] = i_17 * i_21 + 8192 >> 14;
				ints_49[5] = -i_18;
				ints_49[6] = i_19 * i_24 + -i_20 * i_21 + 8192 >> 14;
				ints_49[7] = i_20 * i_22 + i_19 * i_23 + 8192 >> 14;
			ints_49[8] = i_19 * i_17 + 8192 >> 14;
			int i_25 = ints_49[1] * -anInt8247 + ints_49[0] * -anInt8271 + ints_49[2] * -anInt8232 + 8192 >> 14;
			i_26 = -anInt8247 * ints_49[4] + ints_49[3] * -anInt8271 + -anInt8232 * ints_49[5] + 8192 >> 14;
			i_27 = ints_49[7] * -anInt8247 + ints_49[6] * -anInt8271 + ints_49[8] * -anInt8232 + 8192 >> 14;
			i_28 = i_25 + anInt8271;
			int i_29 = i_26 + anInt8247;
			i_30 = i_27 + anInt8232;
			int[] ints_31 = new int[9];

			for (i_32 = 0; i_32 < 3; i_32++)
				for (i_33 = 0; i_33 < 3; i_33++) {
					i_34 = 0;

					for (int i_53 = 0; i_53 < 3; i_53++)
						i_34 += ints_8[i_53 + i_33 * 3] * ints_49[i_53 + i_32 * 3];

					ints_31[i_33 + i_32 * 3] = i_34 + 8192 >> 14;
				}

			i_32 = i_14 * ints_49[1] + i_48 * ints_49[0] + i_15 * ints_49[2] + 8192 >> 14;
			i_33 = i_14 * ints_49[4] + i_48 * ints_49[3] + i_15 * ints_49[5] + 8192 >> 14;
			i_34 = ints_49[6] * i_48 + i_15 * ints_49[8] + ints_49[7] * i_14 + 8192 >> 14;
			i_32 += i_28;
			i_33 += i_29;
			i_34 += i_30;
			ints_35 = new int[9];

			for (i_36 = 0; i_36 < 3; i_36++)
				for (i_37 = 0; i_37 < 3; i_37++) {
					i_38 = 0;

					for (i_39 = 0; i_39 < 3; i_39++)
						i_38 += ints_31[i_37 + i_39 * 3] * ints_8[i_39 + i_36 * 3];

					ints_35[i_37 + i_36 * 3] = i_38 + 8192 >> 14;
				}

			i_36 = i_34 * ints_8[2] + i_32 * ints_8[0] + i_33 * ints_8[1] + 8192 >> 14;
			i_37 = i_32 * ints_8[3] + i_33 * ints_8[4] + ints_8[5] * i_34 + 8192 >> 14;
			i_38 = i_32 * ints_8[6] + i_34 * ints_8[8] + ints_8[7] * i_33 + 8192 >> 14;
			i_36 += i_10;
			i_37 += i_11;
			i_38 += i_12;

			for (i_39 = 0; i_39 < i_9; i_39++) {
				i_40 = ints_2[i_39];
				if (i_40 < anIntArrayArray8263.length) {
					int[] ints_41 = anIntArrayArray8263[i_40];

					for (int element : ints_41) {
						int i_43 = element;
						if (aShortArray8253 == null || (i_7 & aShortArray8253[i_43]) != 0) {
							int i_44 = ints_35[0] * verticesX[i_43] + ints_35[2] * verticesZ[i_43] + ints_35[1] * verticesY[i_43] + 8192 >> 14;
				int i_45 = ints_35[4] * verticesY[i_43] + ints_35[5] * verticesZ[i_43] + ints_35[3] * verticesX[i_43] + 8192 >> 14;
				int i_46 = ints_35[6] * verticesX[i_43] + ints_35[7] * verticesY[i_43] + ints_35[8] * verticesZ[i_43] + 8192 >> 14;
				i_44 += i_36;
				i_45 += i_37;
				i_46 += i_38;
				verticesX[i_43] = i_44;
				verticesY[i_43] = i_45;
				verticesZ[i_43] = i_46;
						}
					}
				}
			}
					} else {
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < anIntArrayArray8263.length) {
								ints_47 = anIntArrayArray8263[i_11];

								for (i_48 = 0; i_48 < ints_47.length; i_48++) {
									i_14 = ints_47[i_48];
									if (aShortArray8253 == null || (i_7 & aShortArray8253[i_14]) != 0) {
										verticesX[i_14] -= anInt8271;
										verticesY[i_14] -= anInt8247;
										verticesZ[i_14] -= anInt8232;
										if (i_51 != 0) {
											i_15 = Trig.SINE[i_51];
											i_16 = Trig.COSINE[i_51];
											i_17 = i_15 * verticesY[i_14] + i_16 * verticesX[i_14] + 16383 >> 14;
								verticesY[i_14] = i_16 * verticesY[i_14] - i_15 * verticesX[i_14] + 16383 >> 14;
						verticesX[i_14] = i_17;
										}

										if (i_31 != 0) {
											i_15 = Trig.SINE[i_31];
											i_16 = Trig.COSINE[i_31];
											i_17 = i_16 * verticesY[i_14] - i_15 * verticesZ[i_14] + 16383 >> 14;
											verticesZ[i_14] = i_15 * verticesY[i_14] + i_16 * verticesZ[i_14] + 16383 >> 14;
											verticesY[i_14] = i_17;
										}

										if (i_41 != 0) {
											i_15 = Trig.SINE[i_41];
											i_16 = Trig.COSINE[i_41];
											i_17 = i_15 * verticesZ[i_14] + i_16 * verticesX[i_14] + 16383 >> 14;
											verticesZ[i_14] = i_16 * verticesZ[i_14] - i_15 * verticesX[i_14] + 16383 >> 14;
											verticesX[i_14] = i_17;
										}

										verticesX[i_14] += anInt8271;
										verticesY[i_14] += anInt8247;
										verticesZ[i_14] += anInt8232;
									}
								}
							}
						}

						if (bool_6) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < anIntArrayArray8263.length) {
									ints_47 = anIntArrayArray8263[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										i_14 = ints_47[i_48];
										if (aShortArray8253 == null || (i_7 & aShortArray8253[i_14]) != 0) {
											i_15 = triangles[i_14];
											i_16 = triangles[i_14 + 1];

											for (i_17 = i_15; i_17 < i_16; i_17++) {
												i_18 = aShortArray8288[i_17] - 1;
												if (i_18 == -1)
													break;

												if (i_51 != 0) {
													i_19 = Trig.SINE[i_51];
													i_20 = Trig.COSINE[i_51];
													i_21 = aShortArray8270[i_18] * i_19 + aShortArray8255[i_18] * i_20 + 16383 >> 14;
											aShortArray8270[i_18] = (short) (aShortArray8270[i_18] * i_20 - aShortArray8255[i_18] * i_19 + 16383 >> 14);
											aShortArray8255[i_18] = (short) i_21;
												}

												if (i_31 != 0) {
													i_19 = Trig.SINE[i_31];
													i_20 = Trig.COSINE[i_31];
													i_21 = aShortArray8270[i_18] * i_20 - aShortArray8261[i_18] * i_19 + 16383 >> 14;
													aShortArray8261[i_18] = (short) (aShortArray8270[i_18] * i_19 + aShortArray8261[i_18] * i_20 + 16383 >> 14);
													aShortArray8270[i_18] = (short) i_21;
												}

												if (i_41 != 0) {
													i_19 = Trig.SINE[i_41];
													i_20 = Trig.COSINE[i_41];
													i_21 = aShortArray8261[i_18] * i_19 + aShortArray8255[i_18] * i_20 + 16383 >> 14;
													aShortArray8261[i_18] = (short) (aShortArray8261[i_18] * i_20 - aShortArray8255[i_18] * i_19 + 16383 >> 14);
													aShortArray8255[i_18] = (short) i_21;
												}
											}
										}
									}
								}
							}

							if (aClass143_8274 == null && aClass143_8273 != null)
								aClass143_8273.anInterface14_1667 = null;

							if (aClass143_8274 != null)
								aClass143_8274.anInterface14_1667 = null;
						}
					}
				} else if (i_1 == 3) {
					if (ints_8 != null) {
						i_10 = ints_8[9] << 4;
						i_11 = ints_8[10] << 4;
						i_12 = ints_8[11] << 4;
						i_48 = ints_8[12] << 4;
						i_14 = ints_8[13] << 4;
						i_15 = ints_8[14] << 4;
						if (aBool8233) {
							i_16 = ints_8[0] * anInt8271 + ints_8[6] * anInt8232 + ints_8[3] * anInt8247 + 8192 >> 14;
						i_17 = ints_8[7] * anInt8232 + ints_8[4] * anInt8247 + ints_8[1] * anInt8271 + 8192 >> 14;
						i_18 = ints_8[8] * anInt8232 + ints_8[2] * anInt8271 + ints_8[5] * anInt8247 + 8192 >> 14;
						i_16 += i_48;
						i_17 += i_14;
						i_18 += i_15;
						anInt8271 = i_16;
						anInt8247 = i_17;
						anInt8232 = i_18;
						aBool8233 = false;
						}

						i_16 = i_31 << 15 >> 7;
						i_17 = i_41 << 15 >> 7;
						i_18 = i_51 << 15 >> 7;
						i_19 = i_16 * -anInt8271 + 8192 >> 14;
						i_20 = i_17 * -anInt8247 + 8192 >> 14;
						i_21 = i_18 * -anInt8232 + 8192 >> 14;
						i_22 = i_19 + anInt8271;
						i_23 = i_20 + anInt8247;
						i_24 = i_21 + anInt8232;
						int[] ints_50 = {i_16 * ints_8[0] + 8192 >> 14, i_16 * ints_8[3] + 8192 >> 14, i_16 * ints_8[6] + 8192 >> 14, i_17 * ints_8[1] + 8192 >> 14, i_17 * ints_8[4] + 8192 >> 14, ints_8[7] * i_17 + 8192 >> 14, i_18 * ints_8[2] + 8192 >> 14, ints_8[5] * i_18 + 8192 >> 14, i_18 * ints_8[8] + 8192 >> 14};
						i_26 = i_16 * i_48 + 8192 >> 14;
						i_27 = i_17 * i_14 + 8192 >> 14;
						i_28 = i_18 * i_15 + 8192 >> 14;
						i_26 += i_22;
						i_27 += i_23;
						i_28 += i_24;
						int[] ints_51 = new int[9];

						int i_52;
						for (i_30 = 0; i_30 < 3; i_30++)
							for (i_52 = 0; i_52 < 3; i_52++) {
								i_32 = 0;

								for (i_33 = 0; i_33 < 3; i_33++)
									i_32 += ints_50[i_52 + i_33 * 3] * ints_8[i_33 + i_30 * 3];

								ints_51[i_52 + i_30 * 3] = i_32 + 8192 >> 14;
							}

						i_30 = i_28 * ints_8[2] + i_26 * ints_8[0] + i_27 * ints_8[1] + 8192 >> 14;
						i_52 = i_26 * ints_8[3] + i_27 * ints_8[4] + ints_8[5] * i_28 + 8192 >> 14;
						i_32 = i_26 * ints_8[6] + i_28 * ints_8[8] + ints_8[7] * i_27 + 8192 >> 14;
						i_30 += i_10;
						i_52 += i_11;
						i_32 += i_12;

						for (i_33 = 0; i_33 < i_9; i_33++) {
							i_34 = ints_2[i_33];
							if (i_34 < anIntArrayArray8263.length) {
								ints_35 = anIntArrayArray8263[i_34];

								for (i_36 = 0; i_36 < ints_35.length; i_36++) {
									i_37 = ints_35[i_36];
									if (aShortArray8253 == null || (i_7 & aShortArray8253[i_37]) != 0) {
										i_38 = ints_51[0] * verticesX[i_37] + ints_51[2] * verticesZ[i_37] + ints_51[1] * verticesY[i_37] + 8192 >> 14;
								i_39 = ints_51[4] * verticesY[i_37] + ints_51[5] * verticesZ[i_37] + ints_51[3] * verticesX[i_37] + 8192 >> 14;
						i_40 = ints_51[6] * verticesX[i_37] + ints_51[7] * verticesY[i_37] + ints_51[8] * verticesZ[i_37] + 8192 >> 14;
						i_38 += i_30;
						i_39 += i_52;
						i_40 += i_32;
						verticesX[i_37] = i_38;
						verticesY[i_37] = i_39;
						verticesZ[i_37] = i_40;
									}
								}
							}
						}
					} else
						for (i_10 = 0; i_10 < i_9; i_10++) {
							i_11 = ints_2[i_10];
							if (i_11 < anIntArrayArray8263.length) {
								ints_47 = anIntArrayArray8263[i_11];

								for (i_48 = 0; i_48 < ints_47.length; i_48++) {
									i_14 = ints_47[i_48];
									if (aShortArray8253 == null || (i_7 & aShortArray8253[i_14]) != 0) {
										verticesX[i_14] -= anInt8271;
										verticesY[i_14] -= anInt8247;
										verticesZ[i_14] -= anInt8232;
										verticesX[i_14] = i_31 * verticesX[i_14] >> 7;
								verticesY[i_14] = i_41 * verticesY[i_14] >> 7;
						verticesZ[i_14] = i_51 * verticesZ[i_14] >> 7;
						verticesX[i_14] += anInt8271;
						verticesY[i_14] += anInt8247;
						verticesZ[i_14] += anInt8232;
									}
								}
							}
						}
				} else {
					Class162 class162_54;
					Class145 class145_56;
					if (i_1 == 5) {
						if (anIntArrayArray8282 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < anIntArrayArray8282.length) {
									ints_47 = anIntArrayArray8282[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										i_14 = ints_47[i_48];
										if (aShortArray8304 == null || (i_7 & aShortArray8304[i_14]) != 0) {
											i_15 = (aByteArray8265[i_14] & 0xff) + i_31 * 8;
											if (i_15 < 0)
												i_15 = 0;
											else if (i_15 > 255)
												i_15 = 255;

											aByteArray8265[i_14] = (byte) i_15;
											if (aClass143_8273 != null)
												aClass143_8273.anInterface14_1667 = null;
										}
									}
								}
							}

							if (aClass162Array8295 != null)
								for (i_10 = 0; i_10 < anInt8294; i_10++) {
									class162_54 = aClass162Array8295[i_10];
									class145_56 = aClass145Array8258[i_10];
									class145_56.anInt1714 = class145_56.anInt1714 & 0xffffff | 255 - (aByteArray8265[class162_54.anInt2023] & 0xff) << 24;
								}
						}
					} else if (i_1 == 7) {
						if (anIntArrayArray8282 != null) {
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < anIntArrayArray8282.length) {
									ints_47 = anIntArrayArray8282[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										i_14 = ints_47[i_48];
										if (aShortArray8304 == null || (i_7 & aShortArray8304[i_14]) != 0) {
											i_15 = colors[i_14] & 0xffff;
											i_16 = i_15 >> 10 & 0x3f;
									i_17 = i_15 >> 7 & 0x7;
							i_18 = i_15 & 0x7f;
							i_16 = i_31 + i_16 & 0x3f;
							i_17 += i_41 / 4;
							if (i_17 < 0)
								i_17 = 0;
							else if (i_17 > 7)
								i_17 = 7;

							i_18 += i_51;
							if (i_18 < 0)
								i_18 = 0;
							else if (i_18 > 127)
								i_18 = 127;

							colors[i_14] = (short) (i_16 << 10 | i_17 << 7 | i_18);
							if (aClass143_8273 != null)
								aClass143_8273.anInterface14_1667 = null;
										}
									}
								}
							}

							if (aClass162Array8295 != null)
								for (i_10 = 0; i_10 < anInt8294; i_10++) {
									class162_54 = aClass162Array8295[i_10];
									class145_56 = aClass145Array8258[i_10];
									class145_56.anInt1714 = class145_56.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_54.anInt2023] & 0xffff] & 0xffffff;
								}
						}
					} else {
						Class145 class145_55;
						if (i_1 == 8) {
							if (anIntArrayArray8278 != null)
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < anIntArrayArray8278.length) {
										ints_47 = anIntArrayArray8278[i_11];

										for (i_48 = 0; i_48 < ints_47.length; i_48++) {
											class145_55 = aClass145Array8258[ints_47[i_48]];
											class145_55.anInt1709 += i_31;
											class145_55.anInt1713 += i_41;
										}
									}
								}
						} else if (i_1 == 10) {
							if (anIntArrayArray8278 != null)
								for (i_10 = 0; i_10 < i_9; i_10++) {
									i_11 = ints_2[i_10];
									if (i_11 < anIntArrayArray8278.length) {
										ints_47 = anIntArrayArray8278[i_11];

										for (i_48 = 0; i_48 < ints_47.length; i_48++) {
											class145_55 = aClass145Array8258[ints_47[i_48]];
											class145_55.anInt1710 = i_31 * class145_55.anInt1710 >> 7;
										class145_55.anInt1711 = i_41 * class145_55.anInt1711 >> 7;
										}
									}
								}
						} else if (i_1 == 9 && anIntArrayArray8278 != null)
							for (i_10 = 0; i_10 < i_9; i_10++) {
								i_11 = ints_2[i_10];
								if (i_11 < anIntArrayArray8278.length) {
									ints_47 = anIntArrayArray8278[i_11];

									for (i_48 = 0; i_48 < ints_47.length; i_48++) {
										class145_55 = aClass145Array8258[ints_47[i_48]];
										class145_55.anInt1712 = i_31 + class145_55.anInt1712 & 0x3fff;
									}
								}
							}
					}
				}
			}
		}

	}

	@Override
	boolean ea() {
		if (anIntArrayArray8263 == null)
			return false;
		for (int i_1 = 0; i_1 < vertexCount; i_1++) {
			verticesX[i_1] <<= 4;
			verticesY[i_1] <<= 4;
			verticesZ[i_1] <<= 4;
		}

		anInt8271 = 0;
		anInt8247 = 0;
		anInt8232 = 0;
		return true;
	}

	@Override
	public void EA(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = i_2 * verticesY[i_4] + i_3 * verticesX[i_4] >> 14;
		verticesY[i_4] = i_3 * verticesY[i_4] - i_2 * verticesX[i_4] >> 14;
			verticesX[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public void ep(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			if (i_1 != 128)
				verticesX[i_4] = verticesX[i_4] * i_1 >> 7;

		if (i_2 != 128)
			verticesY[i_4] = verticesY[i_4] * i_2 >> 7;

			if (i_3 != 128)
				verticesZ[i_4] = verticesZ[i_4] * i_3 >> 7;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public void f(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = i_2 * verticesZ[i_4] + i_3 * verticesX[i_4] >> 14;
		verticesZ[i_4] = i_3 * verticesZ[i_4] - i_2 * verticesX[i_4] >> 14;
							verticesX[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public Shadow ga(Shadow class282_sub50_sub17_1) {
		if (anInt8300 == 0)
			return null;
		if (!aBool8254)
			method13528();

		int i_2;
		int i_3;
		if (aGraphicalRenderer_Sub1_8239.anInt8438 > 0) {
			i_2 = aShort8285 - (aGraphicalRenderer_Sub1_8239.anInt8438 * aShort8284 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473;
							i_3 = aShort8286 - (aGraphicalRenderer_Sub1_8239.anInt8438 * aShort8283 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473;
		} else {
			i_2 = aShort8285 - (aGraphicalRenderer_Sub1_8239.anInt8438 * aShort8283 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473;
			i_3 = aShort8286 - (aGraphicalRenderer_Sub1_8239.anInt8438 * aShort8284 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473;
		}

		int i_4;
		int i_5;
		if (aGraphicalRenderer_Sub1_8239.anInt8439 > 0) {
			i_4 = aShort8287 - (aGraphicalRenderer_Sub1_8239.anInt8439 * aShort8284 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473;
			i_5 = aShort8306 - (aGraphicalRenderer_Sub1_8239.anInt8439 * aShort8283 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473;
		} else {
			i_4 = aShort8287 - (aGraphicalRenderer_Sub1_8239.anInt8439 * aShort8283 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473;
			i_5 = aShort8306 - (aGraphicalRenderer_Sub1_8239.anInt8439 * aShort8284 >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473;
		}

		int i_6 = i_3 - i_2 + 1;
		int i_7 = i_5 - i_4 + 1;
		CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_8 = (CacheableNode_Sub17_Sub1) class282_sub50_sub17_1;
		CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_9;
		if (class282_sub50_sub17_sub1_8 != null && class282_sub50_sub17_sub1_8.method15716(i_6, i_7)) {
			class282_sub50_sub17_sub1_9 = class282_sub50_sub17_sub1_8;
			class282_sub50_sub17_sub1_8.method15712();
		} else
			class282_sub50_sub17_sub1_9 = new CacheableNode_Sub17_Sub1(i_6, i_7);

		class282_sub50_sub17_sub1_9.method15721(i_2, i_4, i_3, i_5);
		method13522(class282_sub50_sub17_sub1_9);
		return class282_sub50_sub17_sub1_9;
	}

	@Override
	public int ha() {
		if (!aBool8254)
			method13528();

		return aShort8306;
	}

	@Override
	public boolean i() {
		return aBool8245;
	}

	@Override
	public void ia(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			if (i_1 != 0)
				verticesX[i_4] += i_1;

			if (i_2 != 0)
				verticesY[i_4] += i_2;

			if (i_3 != 0)
				verticesZ[i_4] += i_3;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	void ka() {
		for (int i_1 = 0; i_1 < vertexCount; i_1++) {
			verticesX[i_1] = verticesX[i_1] + 7 >> 4;
		verticesY[i_1] = verticesY[i_1] + 7 >> 4;
		verticesZ[i_1] = verticesZ[i_1] + 7 >> 4;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public void KA(int i_1) {
		anInt8240 = i_1;
		if (aClass166_8259 != null && (anInt8240 & 0x10000) == 0) {
			aShortArray8255 = aClass166_8259.aShortArray2038;
			aShortArray8270 = aClass166_8259.aShortArray2039;
			aShortArray8261 = aClass166_8259.aShortArray2041;
			aByteArray8264 = aClass166_8259.aByteArray2040;
			aClass166_8259 = null;
		}

		aBool8279 = true;
		method13525();
	}

	@Override
	public int m() {
		return anInt8240;
	}

	@Override
	public ParticleEmitterConfig[] method11253() {
		return aClass87Array8252;
	}

	@Override
	public void method11259() {
		if (anInt8300 > 0 && anInt8302 > 0) {
			method13537(false);
			if ((aByte8242 & 0x10) == 0 && aClass132_8276.anInterface15_1595 == null)
				method13536(false);

			method13525();
		}

	}

	@Override
	void method11260() {
	}

	@Override
	void method11261() {
	}

	@Override
	public void method11263(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (aShortArray8253 != null) {
			Matrix44Var matrix44var_4 = matrix44var_1;
			if (bool_3) {
				matrix44var_4 = aGraphicalRenderer_Sub1_8239.aClass294_8405;
				matrix44var_4.method5215(matrix44var_1);
			}

			float[] floats_5 = new float[3];

			for (int i_6 = 0; i_6 < maxDepth; i_6++)
				if ((i_2 & aShortArray8253[i_6]) != 0) {
					matrix44var_4.method5226(verticesX[i_6], verticesY[i_6], verticesZ[i_6], floats_5);
					verticesX[i_6] = (int) floats_5[0];
					verticesY[i_6] = (int) floats_5[1];
					verticesZ[i_6] = (int) floats_5[2];
				}
		}

	}

	@Override
	void method11268(int i_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
		int i_8 = ints_2.length;
		int i_9;
		int i_10;
		int i_13;
		int i_14;
		if (i_1 == 0) {
			i_3 <<= 4;
			i_4 <<= 4;
			i_5 <<= 4;
			i_9 = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;

			for (i_10 = 0; i_10 < i_8; i_10++) {
				int i_11 = ints_2[i_10];
				if (i_11 < anIntArrayArray8263.length) {
					int[] ints_12 = anIntArrayArray8263[i_11];

					for (i_13 = 0; i_13 < ints_12.length; i_13++) {
						i_14 = ints_12[i_13];
						anInt8271 += verticesX[i_14];
						anInt8247 += verticesY[i_14];
						anInt8232 += verticesZ[i_14];
						++i_9;
					}
				}
			}

			if (i_9 > 0) {
				anInt8271 = i_3 + anInt8271 / i_9;
				anInt8247 = i_4 + anInt8247 / i_9;
				anInt8232 = i_5 + anInt8232 / i_9;
			} else {
				anInt8271 = i_3;
				anInt8247 = i_4;
				anInt8232 = i_5;
			}
		} else {
			int[] ints_21;
			int i_22;
			if (i_1 == 1) {
				i_3 <<= 4;
				i_4 <<= 4;
				i_5 <<= 4;

				for (i_9 = 0; i_9 < i_8; i_9++) {
					i_10 = ints_2[i_9];
					if (i_10 < anIntArrayArray8263.length) {
						ints_21 = anIntArrayArray8263[i_10];

						for (i_22 = 0; i_22 < ints_21.length; i_22++) {
							i_13 = ints_21[i_22];
							verticesX[i_13] += i_3;
							verticesY[i_13] += i_4;
							verticesZ[i_13] += i_5;
						}
					}
				}
			} else {
				int i_15;
				int i_16;
				int i_17;
				if (i_1 == 2) {
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < anIntArrayArray8263.length) {
							ints_21 = anIntArrayArray8263[i_10];
							if ((i_6 & 0x1) == 0)
								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									verticesX[i_13] -= anInt8271;
									verticesY[i_13] -= anInt8247;
									verticesZ[i_13] -= anInt8232;
									if (i_5 != 0) {
										i_14 = Trig.SINE[i_5];
										i_15 = Trig.COSINE[i_5];
										i_16 = i_14 * verticesY[i_13] + i_15 * verticesX[i_13] + 16383 >> 14;
								verticesY[i_13] = i_15 * verticesY[i_13] - i_14 * verticesX[i_13] + 16383 >> 14;
					verticesX[i_13] = i_16;
									}

									if (i_3 != 0) {
										i_14 = Trig.SINE[i_3];
										i_15 = Trig.COSINE[i_3];
										i_16 = i_15 * verticesY[i_13] - i_14 * verticesZ[i_13] + 16383 >> 14;
					verticesZ[i_13] = i_14 * verticesY[i_13] + i_15 * verticesZ[i_13] + 16383 >> 14;
				verticesY[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Trig.SINE[i_4];
										i_15 = Trig.COSINE[i_4];
										i_16 = i_14 * verticesZ[i_13] + i_15 * verticesX[i_13] + 16383 >> 14;
				verticesZ[i_13] = i_15 * verticesZ[i_13] - i_14 * verticesX[i_13] + 16383 >> 14;
				verticesX[i_13] = i_16;
									}

									verticesX[i_13] += anInt8271;
									verticesY[i_13] += anInt8247;
									verticesZ[i_13] += anInt8232;
								}
							else
								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									verticesX[i_13] -= anInt8271;
									verticesY[i_13] -= anInt8247;
									verticesZ[i_13] -= anInt8232;
									if (i_3 != 0) {
										i_14 = Trig.SINE[i_3];
										i_15 = Trig.COSINE[i_3];
										i_16 = i_15 * verticesY[i_13] - i_14 * verticesZ[i_13] + 16383 >> 14;
								verticesZ[i_13] = i_14 * verticesY[i_13] + i_15 * verticesZ[i_13] + 16383 >> 14;
			verticesY[i_13] = i_16;
									}

									if (i_5 != 0) {
										i_14 = Trig.SINE[i_5];
										i_15 = Trig.COSINE[i_5];
										i_16 = i_14 * verticesY[i_13] + i_15 * verticesX[i_13] + 16383 >> 14;
			verticesY[i_13] = i_15 * verticesY[i_13] - i_14 * verticesX[i_13] + 16383 >> 14;
			verticesX[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Trig.SINE[i_4];
										i_15 = Trig.COSINE[i_4];
										i_16 = i_14 * verticesZ[i_13] + i_15 * verticesX[i_13] + 16383 >> 14;
			verticesZ[i_13] = i_15 * verticesZ[i_13] - i_14 * verticesX[i_13] + 16383 >> 14;
			verticesX[i_13] = i_16;
									}

									verticesX[i_13] += anInt8271;
									verticesY[i_13] += anInt8247;
									verticesZ[i_13] += anInt8232;
								}
						}
					}

					if (bool_7) {
						for (i_9 = 0; i_9 < i_8; i_9++) {
							i_10 = ints_2[i_9];
							if (i_10 < anIntArrayArray8263.length) {
								ints_21 = anIntArrayArray8263[i_10];

								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									i_14 = triangles[i_13];
									i_15 = triangles[i_13 + 1];

									for (i_16 = i_14; i_16 < i_15; i_16++) {
										i_17 = aShortArray8288[i_16] - 1;
										if (i_17 == -1)
											break;

										int i_18;
										int i_19;
										int i_20;
										if (i_5 != 0) {
											i_18 = Trig.SINE[i_5];
											i_19 = Trig.COSINE[i_5];
											i_20 = aShortArray8270[i_17] * i_18 + aShortArray8255[i_17] * i_19 + 16383 >> 14;
									aShortArray8270[i_17] = (short) (aShortArray8270[i_17] * i_19 - aShortArray8255[i_17] * i_18 + 16383 >> 14);
									aShortArray8255[i_17] = (short) i_20;
										}

										if (i_3 != 0) {
											i_18 = Trig.SINE[i_3];
											i_19 = Trig.COSINE[i_3];
											i_20 = aShortArray8270[i_17] * i_19 - aShortArray8261[i_17] * i_18 + 16383 >> 14;
											aShortArray8261[i_17] = (short) (aShortArray8270[i_17] * i_18 + aShortArray8261[i_17] * i_19 + 16383 >> 14);
											aShortArray8270[i_17] = (short) i_20;
										}

										if (i_4 != 0) {
											i_18 = Trig.SINE[i_4];
											i_19 = Trig.COSINE[i_4];
											i_20 = aShortArray8261[i_17] * i_18 + aShortArray8255[i_17] * i_19 + 16383 >> 14;
											aShortArray8261[i_17] = (short) (aShortArray8261[i_17] * i_19 - aShortArray8255[i_17] * i_18 + 16383 >> 14);
											aShortArray8255[i_17] = (short) i_20;
										}
									}
								}
							}
						}

						if (aClass143_8274 == null && aClass143_8273 != null)
							aClass143_8273.anInterface14_1667 = null;

						if (aClass143_8274 != null)
							aClass143_8274.anInterface14_1667 = null;
					}
				} else if (i_1 == 3)
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < anIntArrayArray8263.length) {
							ints_21 = anIntArrayArray8263[i_10];

							for (i_22 = 0; i_22 < ints_21.length; i_22++) {
								i_13 = ints_21[i_22];
								verticesX[i_13] -= anInt8271;
								verticesY[i_13] -= anInt8247;
								verticesZ[i_13] -= anInt8232;
								verticesX[i_13] = i_3 * verticesX[i_13] >> 7;
							verticesY[i_13] = i_4 * verticesY[i_13] >> 7;
					verticesZ[i_13] = i_5 * verticesZ[i_13] >> 7;
					verticesX[i_13] += anInt8271;
					verticesY[i_13] += anInt8247;
					verticesZ[i_13] += anInt8232;
							}
						}
					}
				else {
					Class162 class162_23;
					Class145 class145_25;
					if (i_1 == 5) {
						if (anIntArrayArray8282 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < anIntArrayArray8282.length) {
									ints_21 = anIntArrayArray8282[i_10];

									for (i_22 = 0; i_22 < ints_21.length; i_22++) {
										i_13 = ints_21[i_22];
										i_14 = (aByteArray8265[i_13] & 0xff) + i_3 * 8;
										if (i_14 < 0)
											i_14 = 0;
										else if (i_14 > 255)
											i_14 = 255;

										aByteArray8265[i_13] = (byte) i_14;
									}

									if (ints_21.length > 0 && aClass143_8273 != null)
										aClass143_8273.anInterface14_1667 = null;
								}
							}

							if (aClass162Array8295 != null)
								for (i_9 = 0; i_9 < anInt8294; i_9++) {
									class162_23 = aClass162Array8295[i_9];
									class145_25 = aClass145Array8258[i_9];
									class145_25.anInt1714 = class145_25.anInt1714 & 0xffffff | 255 - (aByteArray8265[class162_23.anInt2023] & 0xff) << 24;
								}
						}
					} else if (i_1 == 7) {
						if (anIntArrayArray8282 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < anIntArrayArray8282.length) {
									ints_21 = anIntArrayArray8282[i_10];

									for (i_22 = 0; i_22 < ints_21.length; i_22++) {
										i_13 = ints_21[i_22];
										i_14 = colors[i_13] & 0xffff;
										i_15 = i_14 >> 10 & 0x3f;
									i_16 = i_14 >> 7 & 0x7;
							i_17 = i_14 & 0x7f;
							i_15 = i_3 + i_15 & 0x3f;
							i_16 += i_4 / 4;
							if (i_16 < 0)
								i_16 = 0;
							else if (i_16 > 7)
								i_16 = 7;

							i_17 += i_5;
							if (i_17 < 0)
								i_17 = 0;
							else if (i_17 > 127)
								i_17 = 127;

							colors[i_13] = (short) (i_15 << 10 | i_16 << 7 | i_17);
									}

									if (ints_21.length > 0 && aClass143_8273 != null)
										aClass143_8273.anInterface14_1667 = null;
								}
							}

							if (aClass162Array8295 != null)
								for (i_9 = 0; i_9 < anInt8294; i_9++) {
									class162_23 = aClass162Array8295[i_9];
									class145_25 = aClass145Array8258[i_9];
									class145_25.anInt1714 = class145_25.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_23.anInt2023] & 0xffff] & 0xffffff;
								}
						}
					} else {
						Class145 class145_24;
						if (i_1 == 8) {
							if (anIntArrayArray8278 != null)
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < anIntArrayArray8278.length) {
										ints_21 = anIntArrayArray8278[i_10];

										for (i_22 = 0; i_22 < ints_21.length; i_22++) {
											class145_24 = aClass145Array8258[ints_21[i_22]];
											class145_24.anInt1709 += i_3;
											class145_24.anInt1713 += i_4;
										}
									}
								}
						} else if (i_1 == 10) {
							if (anIntArrayArray8278 != null)
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < anIntArrayArray8278.length) {
										ints_21 = anIntArrayArray8278[i_10];

										for (i_22 = 0; i_22 < ints_21.length; i_22++) {
											class145_24 = aClass145Array8258[ints_21[i_22]];
											class145_24.anInt1710 = i_3 * class145_24.anInt1710 >> 7;
										class145_24.anInt1711 = i_4 * class145_24.anInt1711 >> 7;
										}
									}
								}
						} else if (i_1 == 9 && anIntArrayArray8278 != null)
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < anIntArrayArray8278.length) {
									ints_21 = anIntArrayArray8278[i_10];

									for (i_22 = 0; i_22 < ints_21.length; i_22++) {
										class145_24 = aClass145Array8258[ints_21[i_22]];
										class145_24.anInt1712 = i_3 + class145_24.anInt1712 & 0x3fff;
									}
								}
							}
					}
				}
			}
		}

	}

	@Override
	public void method11269(MeshRasterizer meshrasterizer_1, int i_2, int i_3, int i_4, boolean bool_5) {
		MeshRasterizer_Sub1 class528_sub1_6 = (MeshRasterizer_Sub1) meshrasterizer_1;
		if (triangleCount != 0 && class528_sub1_6.triangleCount != 0) {
			int i_7 = class528_sub1_6.maxDepth;
			int[] ints_8 = class528_sub1_6.verticesX;
			int[] ints_9 = class528_sub1_6.verticesY;
			int[] ints_10 = class528_sub1_6.verticesZ;
			short[] shorts_11 = class528_sub1_6.aShortArray8255;
			short[] shorts_12 = class528_sub1_6.aShortArray8270;
			short[] shorts_13 = class528_sub1_6.aShortArray8261;
			byte[] bytes_14 = class528_sub1_6.aByteArray8264;
			short[] shorts_15;
			short[] shorts_16;
			short[] shorts_17;
			byte[] bytes_18;
			if (aClass166_8259 != null) {
				shorts_15 = aClass166_8259.aShortArray2038;
				shorts_16 = aClass166_8259.aShortArray2039;
				shorts_17 = aClass166_8259.aShortArray2041;
				bytes_18 = aClass166_8259.aByteArray2040;
			} else {
				shorts_15 = null;
				shorts_16 = null;
				shorts_17 = null;
				bytes_18 = null;
			}

			short[] shorts_19;
			short[] shorts_20;
			short[] shorts_21;
			byte[] bytes_22;
			if (class528_sub1_6.aClass166_8259 != null) {
				shorts_19 = class528_sub1_6.aClass166_8259.aShortArray2038;
				shorts_20 = class528_sub1_6.aClass166_8259.aShortArray2039;
				shorts_21 = class528_sub1_6.aClass166_8259.aShortArray2041;
				bytes_22 = class528_sub1_6.aClass166_8259.aByteArray2040;
			} else {
				shorts_19 = null;
				shorts_20 = null;
				shorts_21 = null;
				bytes_22 = null;
			}

			int[] ints_23 = class528_sub1_6.triangles;
			short[] shorts_24 = class528_sub1_6.aShortArray8288;
			if (!class528_sub1_6.aBool8254)
				class528_sub1_6.method13528();

			short s_25 = class528_sub1_6.aShort8283;
			short s_26 = class528_sub1_6.aShort8284;
			short s_27 = class528_sub1_6.aShort8285;
			short s_28 = class528_sub1_6.aShort8286;
			short s_29 = class528_sub1_6.aShort8287;
			short s_30 = class528_sub1_6.aShort8306;

			for (int i_31 = 0; i_31 < maxDepth; i_31++) {
				int i_32 = verticesY[i_31] - i_3;
				if (i_32 >= s_25 && i_32 <= s_26) {
					int i_33 = verticesX[i_31] - i_2;
					if (i_33 >= s_27 && i_33 <= s_28) {
						int i_34 = verticesZ[i_31] - i_4;
						if (i_34 >= s_29 && i_34 <= s_30) {
							int i_35 = -1;
							int i_36 = triangles[i_31];
							int i_37 = triangles[i_31 + 1];

							int i_38;
							for (i_38 = i_36; i_38 < i_37; i_38++) {
								i_35 = aShortArray8288[i_38] - 1;
								if (i_35 == -1 || aByteArray8264[i_35] != 0)
									break;
							}

							if (i_35 != -1)
								for (i_38 = 0; i_38 < i_7; i_38++)
									if (i_33 == ints_8[i_38] && i_34 == ints_10[i_38] && i_32 == ints_9[i_38]) {
										int i_39 = -1;
										i_36 = ints_23[i_38];
										i_37 = ints_23[i_38 + 1];

										for (int i_40 = i_36; i_40 < i_37; i_40++) {
											i_39 = shorts_24[i_40] - 1;
											if (i_39 == -1 || bytes_14[i_39] != 0)
												break;
										}

										if (i_39 != -1) {
											if (shorts_15 == null) {
												aClass166_8259 = new Class166();
												shorts_15 = aClass166_8259.aShortArray2038 = Class512.method8761(aShortArray8255);
												shorts_16 = aClass166_8259.aShortArray2039 = Class512.method8761(aShortArray8270);
												shorts_17 = aClass166_8259.aShortArray2041 = Class512.method8761(aShortArray8261);
												bytes_18 = aClass166_8259.aByteArray2040 = AnimationFrameSet.method15090(aByteArray8264);
											}

											if (shorts_19 == null) {
												Class166 class166_46 = class528_sub1_6.aClass166_8259 = new Class166();
												shorts_19 = class166_46.aShortArray2038 = Class512.method8761(shorts_11);
												shorts_20 = class166_46.aShortArray2039 = Class512.method8761(shorts_12);
												shorts_21 = class166_46.aShortArray2041 = Class512.method8761(shorts_13);
												bytes_22 = class166_46.aByteArray2040 = AnimationFrameSet.method15090(bytes_14);
											}

											short s_47 = aShortArray8255[i_35];
											short s_41 = aShortArray8270[i_35];
											short s_42 = aShortArray8261[i_35];
											byte b_43 = aByteArray8264[i_35];
											i_36 = ints_23[i_38];
											i_37 = ints_23[i_38 + 1];

											int i_44;
											int i_45;
											for (i_44 = i_36; i_44 < i_37; i_44++) {
												i_45 = shorts_24[i_44] - 1;
												if (i_45 == -1)
													break;

												if (bytes_22[i_45] != 0) {
													shorts_19[i_45] += s_47;
													shorts_20[i_45] += s_41;
													shorts_21[i_45] += s_42;
													bytes_22[i_45] += b_43;
												}
											}

											s_47 = shorts_11[i_39];
											s_41 = shorts_12[i_39];
											s_42 = shorts_13[i_39];
											b_43 = bytes_14[i_39];
											i_36 = triangles[i_31];
											i_37 = triangles[i_31 + 1];

											for (i_44 = i_36; i_44 < i_37; i_44++) {
												i_45 = aShortArray8288[i_44] - 1;
												if (i_45 == -1)
													break;

												if (bytes_18[i_45] != 0) {
													shorts_15[i_45] += s_47;
													shorts_16[i_45] += s_41;
													shorts_17[i_45] += s_42;
													bytes_18[i_45] += b_43;
												}
											}

											if (aClass143_8274 == null && aClass143_8273 != null)
												aClass143_8273.anInterface14_1667 = null;

											if (aClass143_8274 != null)
												aClass143_8274.anInterface14_1667 = null;

											if (class528_sub1_6.aClass143_8274 == null && class528_sub1_6.aClass143_8273 != null)
												class528_sub1_6.aClass143_8273.anInterface14_1667 = null;

											if (class528_sub1_6.aClass143_8274 != null)
												class528_sub1_6.aClass143_8274.anInterface14_1667 = null;
										}
									}
						}
					}
				}
			}
		}

	}

	@Override
	public boolean method11270(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		Matrix44 matrix44_6 = aGraphicalRenderer_Sub1_8239.aClass384_8380;
		matrix44_6.fromVarMatrix44(matrix44var_3);
		matrix44_6.method6523(aGraphicalRenderer_Sub1_8239.aClass384_8394);
		boolean bool_7 = false;
		int i_8 = Integer.MAX_VALUE;
		int i_9 = Integer.MIN_VALUE;
		int i_10 = Integer.MAX_VALUE;
		int i_11 = Integer.MIN_VALUE;
		if (!aBool8254)
			method13528();

		int i_12 = aShort8286 - aShort8285 >> 1;
											int i_13 = aShort8284 - aShort8283 >> 1;
										int i_14 = aShort8306 - aShort8287 >> 1;
							int i_15 = i_12 + aShort8285;
							int i_16 = i_13 + aShort8283;
							int i_17 = i_14 + aShort8287;
							int i_18 = i_15 - (i_12 << i_5);
							int i_19 = i_16 - (i_13 << i_5);
							int i_20 = i_17 - (i_14 << i_5);
							int i_21 = i_15 + (i_12 << i_5);
							int i_22 = i_16 + (i_13 << i_5);
							int i_23 = i_17 + (i_14 << i_5);
							anIntArray8296[0] = i_18;
							anIntArray8301[0] = i_19;
							anIntArray8268[0] = i_20;
							anIntArray8296[1] = i_21;
							anIntArray8301[1] = i_19;
							anIntArray8268[1] = i_20;
							anIntArray8296[2] = i_18;
							anIntArray8301[2] = i_22;
							anIntArray8268[2] = i_20;
							anIntArray8296[3] = i_21;
							anIntArray8301[3] = i_22;
							anIntArray8268[3] = i_20;
							anIntArray8296[4] = i_18;
							anIntArray8301[4] = i_19;
							anIntArray8268[4] = i_23;
							anIntArray8296[5] = i_21;
							anIntArray8301[5] = i_19;
							anIntArray8268[5] = i_23;
							anIntArray8296[6] = i_18;
							anIntArray8301[6] = i_22;
							anIntArray8268[6] = i_23;
							anIntArray8296[7] = i_21;
							anIntArray8301[7] = i_22;
							anIntArray8268[7] = i_23;

							int i_26;
							int i_27;
							float f_30;
							float f_31;
							int i_32;
							int i_33;
							for (int i_24 = 0; i_24 < 8; i_24++) {
								int i_39 = anIntArray8296[i_24];
								i_26 = anIntArray8301[i_24];
								i_27 = anIntArray8268[i_24];
								float f_28 = matrix44_6.buf[2] * i_39 + matrix44_6.buf[6] * i_26 + matrix44_6.buf[10] * i_27 + matrix44_6.buf[14];
								float f_29 = matrix44_6.buf[3] * i_39 + matrix44_6.buf[7] * i_26 + matrix44_6.buf[11] * i_27 + matrix44_6.buf[15];
								if (f_28 >= -f_29) {
									f_30 = matrix44_6.buf[0] * i_39 + matrix44_6.buf[4] * i_26 + matrix44_6.buf[8] * i_27 + matrix44_6.buf[12];
									f_31 = matrix44_6.buf[1] * i_39 + matrix44_6.buf[5] * i_26 + matrix44_6.buf[9] * i_27 + matrix44_6.buf[13];
									i_32 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_30 / f_29);
									i_33 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_31 / f_29);
									if (i_32 < i_8)
										i_8 = i_32;

									if (i_32 > i_9)
										i_9 = i_32;

									if (i_33 < i_10)
										i_10 = i_33;

									if (i_33 > i_11)
										i_11 = i_33;

									bool_7 = true;
								}
							}

							if (bool_7 && i_1 > i_8 && i_1 < i_9 && i_2 > i_10 && i_2 < i_11) {
								if (bool_4)
									return true;

								if (aGraphicalRenderer_Sub1_8239.anIntArray8500.length < anInt8300) {
									aGraphicalRenderer_Sub1_8239.anIntArray8500 = new int[anInt8300];
									aGraphicalRenderer_Sub1_8239.anIntArray8501 = new int[anInt8300];
								}

								int[] ints_38 = aGraphicalRenderer_Sub1_8239.anIntArray8500;
								int[] ints_25 = aGraphicalRenderer_Sub1_8239.anIntArray8501;

								for (i_26 = 0; i_26 < maxDepth; i_26++) {
									i_27 = verticesX[i_26];
									int i_40 = verticesY[i_26];
									int i_41 = verticesZ[i_26];
									f_30 = matrix44_6.buf[2] * i_27 + matrix44_6.buf[6] * i_40 + matrix44_6.buf[10] * i_41 + matrix44_6.buf[14];
									f_31 = matrix44_6.buf[3] * i_27 + matrix44_6.buf[7] * i_40 + matrix44_6.buf[11] * i_41 + matrix44_6.buf[15];
									int i_34;
									int i_35;
									if (f_30 >= -f_31) {
										float f_42 = matrix44_6.buf[0] * i_27 + matrix44_6.buf[4] * i_40 + matrix44_6.buf[8] * i_41 + matrix44_6.buf[12];
										float f_43 = matrix44_6.buf[1] * i_27 + matrix44_6.buf[5] * i_40 + matrix44_6.buf[9] * i_41 + matrix44_6.buf[13];
										i_34 = triangles[i_26];
										i_35 = triangles[i_26 + 1];

										for (int i_36 = i_34; i_36 < i_35; i_36++) {
											int i_37 = aShortArray8288[i_36] - 1;
											if (i_37 == -1)
												break;

											ints_38[i_37] = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_42 / f_31);
											ints_25[i_37] = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_43 / f_31);
										}
									} else {
										i_32 = triangles[i_26];
										i_33 = triangles[i_26 + 1];

										for (i_34 = i_32; i_34 < i_33; i_34++) {
											i_35 = aShortArray8288[i_34] - 1;
											if (i_35 == -1)
												break;

											ints_38[aShortArray8288[i_34] - 1] = -999999;
										}
									}
								}

								for (i_26 = 0; i_26 < triangleCount; i_26++)
									if (ints_38[aShortArray8266[i_26]] != -999999 && ints_38[aShortArray8267[i_26]] != -999999 && ints_38[aShortArray8256[i_26]] != -999999 && method13532(i_1, i_2, ints_25[aShortArray8266[i_26]], ints_25[aShortArray8267[i_26]], ints_25[aShortArray8256[i_26]], ints_38[aShortArray8266[i_26]], ints_38[aShortArray8267[i_26]], ints_38[aShortArray8256[i_26]]))
										return true;
							}

							return false;
	}

	@Override
	public void method11273(Matrix44Var matrix44var_1) {
		Matrix44 matrix44_2 = aGraphicalRenderer_Sub1_8239.aClass384_8380;
		matrix44_2.fromVarMatrix44(matrix44var_1);
		int i_3;
		if (aClass87Array8252 != null)
			for (i_3 = 0; i_3 < aClass87Array8252.length; i_3++) {
				ParticleEmitterConfig class87_4 = aClass87Array8252[i_3];
				ParticleEmitterConfig class87_5 = class87_4;
				if (class87_4.aClass87_835 != null)
					class87_5 = class87_4.aClass87_835;

				class87_5.anInt844 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class87_4.faceX] + matrix44_2.buf[4] * verticesY[class87_4.faceX] + matrix44_2.buf[8] * verticesZ[class87_4.faceX]);
				class87_5.anInt841 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class87_4.faceX] + matrix44_2.buf[5] * verticesY[class87_4.faceX] + matrix44_2.buf[9] * verticesZ[class87_4.faceX]);
				class87_5.anInt847 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class87_4.faceX] + matrix44_2.buf[6] * verticesY[class87_4.faceX] + matrix44_2.buf[10] * verticesZ[class87_4.faceX]);
				class87_5.anInt834 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class87_4.faceY] + matrix44_2.buf[4] * verticesY[class87_4.faceY] + matrix44_2.buf[8] * verticesZ[class87_4.faceY]);
				class87_5.anInt843 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class87_4.faceY] + matrix44_2.buf[5] * verticesY[class87_4.faceY] + matrix44_2.buf[9] * verticesZ[class87_4.faceY]);
				class87_5.anInt845 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class87_4.faceY] + matrix44_2.buf[6] * verticesY[class87_4.faceY] + matrix44_2.buf[10] * verticesZ[class87_4.faceY]);
				class87_5.anInt846 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class87_4.faceZ] + matrix44_2.buf[4] * verticesY[class87_4.faceZ] + matrix44_2.buf[8] * verticesZ[class87_4.faceZ]);
				class87_5.anInt840 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class87_4.faceZ] + matrix44_2.buf[5] * verticesY[class87_4.faceZ] + matrix44_2.buf[9] * verticesZ[class87_4.faceZ]);
				class87_5.anInt848 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class87_4.faceZ] + matrix44_2.buf[6] * verticesY[class87_4.faceZ] + matrix44_2.buf[10] * verticesZ[class87_4.faceZ]);
			}

		if (aClass172Array8244 != null)
			for (i_3 = 0; i_3 < aClass172Array8244.length; i_3++) {
				SurfaceSkin class172_6 = aClass172Array8244[i_3];
				SurfaceSkin class172_7 = class172_6;
				if (class172_6.aClass172_2114 != null)
					class172_7 = class172_6.aClass172_2114;

				if (class172_6.aClass384_2116 != null)
					class172_6.aClass384_2116.method6562(matrix44_2);
				else
					class172_6.aClass384_2116 = new Matrix44(matrix44_2);

				class172_7.anInt2113 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class172_6.anInt2119] + matrix44_2.buf[4] * verticesY[class172_6.anInt2119] + matrix44_2.buf[8] * verticesZ[class172_6.anInt2119]);
				class172_7.anInt2117 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class172_6.anInt2119] + matrix44_2.buf[5] * verticesY[class172_6.anInt2119] + matrix44_2.buf[9] * verticesZ[class172_6.anInt2119]);
				class172_7.anInt2118 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class172_6.anInt2119] + matrix44_2.buf[6] * verticesY[class172_6.anInt2119] + matrix44_2.buf[10] * verticesZ[class172_6.anInt2119]);
			}

	}

	@Override
	public SurfaceSkin[] method11274() {
		return aClass172Array8244;
	}

	@Override
	void method11275(int i_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7) {
		int i_8 = ints_2.length;
		int i_9;
		int i_10;
		int i_13;
		int i_14;
		if (i_1 == 0) {
			i_3 <<= 4;
			i_4 <<= 4;
			i_5 <<= 4;
			i_9 = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;

			for (i_10 = 0; i_10 < i_8; i_10++) {
				int i_11 = ints_2[i_10];
				if (i_11 < anIntArrayArray8263.length) {
					int[] ints_12 = anIntArrayArray8263[i_11];

					for (i_13 = 0; i_13 < ints_12.length; i_13++) {
						i_14 = ints_12[i_13];
						anInt8271 += verticesX[i_14];
						anInt8247 += verticesY[i_14];
						anInt8232 += verticesZ[i_14];
						++i_9;
					}
				}
			}

			if (i_9 > 0) {
				anInt8271 = anInt8271 / i_9 + i_3;
				anInt8247 = anInt8247 / i_9 + i_4;
				anInt8232 = anInt8232 / i_9 + i_5;
			} else {
				anInt8271 = i_3;
				anInt8247 = i_4;
				anInt8232 = i_5;
			}
		} else {
			int[] ints_21;
			int i_22;
			if (i_1 == 1) {
				i_3 <<= 4;
				i_4 <<= 4;
				i_5 <<= 4;

				for (i_9 = 0; i_9 < i_8; i_9++) {
					i_10 = ints_2[i_9];
					if (i_10 < anIntArrayArray8263.length) {
						ints_21 = anIntArrayArray8263[i_10];

						for (i_22 = 0; i_22 < ints_21.length; i_22++) {
							i_13 = ints_21[i_22];
							verticesX[i_13] += i_3;
							verticesY[i_13] += i_4;
							verticesZ[i_13] += i_5;
						}
					}
				}
			} else {
				int i_15;
				int i_16;
				int i_17;
				if (i_1 == 2) {
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < anIntArrayArray8263.length) {
							ints_21 = anIntArrayArray8263[i_10];
							if ((i_6 & 0x1) == 0)
								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									verticesX[i_13] -= anInt8271;
									verticesY[i_13] -= anInt8247;
									verticesZ[i_13] -= anInt8232;
									if (i_5 != 0) {
										i_14 = Trig.SINE[i_5];
										i_15 = Trig.COSINE[i_5];
										i_16 = verticesY[i_13] * i_14 + verticesX[i_13] * i_15 + 16383 >> 14;
								verticesY[i_13] = verticesY[i_13] * i_15 - verticesX[i_13] * i_14 + 16383 >> 14;
					verticesX[i_13] = i_16;
									}

									if (i_3 != 0) {
										i_14 = Trig.SINE[i_3];
										i_15 = Trig.COSINE[i_3];
										i_16 = verticesY[i_13] * i_15 - verticesZ[i_13] * i_14 + 16383 >> 14;
					verticesZ[i_13] = verticesY[i_13] * i_14 + verticesZ[i_13] * i_15 + 16383 >> 14;
				verticesY[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Trig.SINE[i_4];
										i_15 = Trig.COSINE[i_4];
										i_16 = verticesZ[i_13] * i_14 + verticesX[i_13] * i_15 + 16383 >> 14;
				verticesZ[i_13] = verticesZ[i_13] * i_15 - verticesX[i_13] * i_14 + 16383 >> 14;
				verticesX[i_13] = i_16;
									}

									verticesX[i_13] += anInt8271;
									verticesY[i_13] += anInt8247;
									verticesZ[i_13] += anInt8232;
								}
							else
								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									verticesX[i_13] -= anInt8271;
									verticesY[i_13] -= anInt8247;
									verticesZ[i_13] -= anInt8232;
									if (i_3 != 0) {
										i_14 = Trig.SINE[i_3];
										i_15 = Trig.COSINE[i_3];
										i_16 = verticesY[i_13] * i_15 - verticesZ[i_13] * i_14 + 16383 >> 14;
								verticesZ[i_13] = verticesY[i_13] * i_14 + verticesZ[i_13] * i_15 + 16383 >> 14;
			verticesY[i_13] = i_16;
									}

									if (i_5 != 0) {
										i_14 = Trig.SINE[i_5];
										i_15 = Trig.COSINE[i_5];
										i_16 = verticesY[i_13] * i_14 + verticesX[i_13] * i_15 + 16383 >> 14;
			verticesY[i_13] = verticesY[i_13] * i_15 - verticesX[i_13] * i_14 + 16383 >> 14;
			verticesX[i_13] = i_16;
									}

									if (i_4 != 0) {
										i_14 = Trig.SINE[i_4];
										i_15 = Trig.COSINE[i_4];
										i_16 = verticesZ[i_13] * i_14 + verticesX[i_13] * i_15 + 16383 >> 14;
			verticesZ[i_13] = verticesZ[i_13] * i_15 - verticesX[i_13] * i_14 + 16383 >> 14;
			verticesX[i_13] = i_16;
									}

									verticesX[i_13] += anInt8271;
									verticesY[i_13] += anInt8247;
									verticesZ[i_13] += anInt8232;
								}
						}
					}

					if (bool_7) {
						for (i_9 = 0; i_9 < i_8; i_9++) {
							i_10 = ints_2[i_9];
							if (i_10 < anIntArrayArray8263.length) {
								ints_21 = anIntArrayArray8263[i_10];

								for (i_22 = 0; i_22 < ints_21.length; i_22++) {
									i_13 = ints_21[i_22];
									i_14 = triangles[i_13];
									i_15 = triangles[i_13 + 1];

									for (i_16 = i_14; i_16 < i_15; i_16++) {
										i_17 = aShortArray8288[i_16] - 1;
										if (i_17 == -1)
											break;

										int i_18;
										int i_19;
										int i_20;
										if (i_5 != 0) {
											i_18 = Trig.SINE[i_5];
											i_19 = Trig.COSINE[i_5];
											i_20 = aShortArray8270[i_17] * i_18 + aShortArray8255[i_17] * i_19 + 16383 >> 14;
									aShortArray8270[i_17] = (short) (aShortArray8270[i_17] * i_19 - aShortArray8255[i_17] * i_18 + 16383 >> 14);
									aShortArray8255[i_17] = (short) i_20;
										}

										if (i_3 != 0) {
											i_18 = Trig.SINE[i_3];
											i_19 = Trig.COSINE[i_3];
											i_20 = aShortArray8270[i_17] * i_19 - aShortArray8261[i_17] * i_18 + 16383 >> 14;
										aShortArray8261[i_17] = (short) (aShortArray8270[i_17] * i_18 + aShortArray8261[i_17] * i_19 + 16383 >> 14);
										aShortArray8270[i_17] = (short) i_20;
										}

										if (i_4 != 0) {
											i_18 = Trig.SINE[i_4];
											i_19 = Trig.COSINE[i_4];
											i_20 = aShortArray8261[i_17] * i_18 + aShortArray8255[i_17] * i_19 + 16383 >> 14;
							aShortArray8261[i_17] = (short) (aShortArray8261[i_17] * i_19 - aShortArray8255[i_17] * i_18 + 16383 >> 14);
							aShortArray8255[i_17] = (short) i_20;
										}
									}
								}
							}
						}

						if (aClass143_8274 == null && aClass143_8273 != null)
							aClass143_8273.anInterface14_1667 = null;

						if (aClass143_8274 != null)
							aClass143_8274.anInterface14_1667 = null;
					}
				} else if (i_1 == 3)
					for (i_9 = 0; i_9 < i_8; i_9++) {
						i_10 = ints_2[i_9];
						if (i_10 < anIntArrayArray8263.length) {
							ints_21 = anIntArrayArray8263[i_10];

							for (i_22 = 0; i_22 < ints_21.length; i_22++) {
								i_13 = ints_21[i_22];
								verticesX[i_13] -= anInt8271;
								verticesY[i_13] -= anInt8247;
								verticesZ[i_13] -= anInt8232;
								verticesX[i_13] = verticesX[i_13] * i_3 >> 7;
							verticesY[i_13] = verticesY[i_13] * i_4 >> 7;
					verticesZ[i_13] = verticesZ[i_13] * i_5 >> 7;
							verticesX[i_13] += anInt8271;
							verticesY[i_13] += anInt8247;
							verticesZ[i_13] += anInt8232;
							}
						}
					}
				else {
					Class162 class162_23;
					Class145 class145_25;
					if (i_1 == 5) {
						if (anIntArrayArray8282 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < anIntArrayArray8282.length) {
									ints_21 = anIntArrayArray8282[i_10];

									for (i_22 = 0; i_22 < ints_21.length; i_22++) {
										i_13 = ints_21[i_22];
										i_14 = (aByteArray8265[i_13] & 0xff) + i_3 * 8;
										if (i_14 < 0)
											i_14 = 0;
										else if (i_14 > 255)
											i_14 = 255;

										aByteArray8265[i_13] = (byte) i_14;
									}

									if (ints_21.length > 0 && aClass143_8273 != null)
										aClass143_8273.anInterface14_1667 = null;
								}
							}

							if (aClass162Array8295 != null)
								for (i_9 = 0; i_9 < anInt8294; i_9++) {
									class162_23 = aClass162Array8295[i_9];
									class145_25 = aClass145Array8258[i_9];
									class145_25.anInt1714 = class145_25.anInt1714 & 0xffffff | 255 - (aByteArray8265[class162_23.anInt2023] & 0xff) << 24;
								}
						}
					} else if (i_1 == 7) {
						if (anIntArrayArray8282 != null) {
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < anIntArrayArray8282.length) {
									ints_21 = anIntArrayArray8282[i_10];

									for (i_22 = 0; i_22 < ints_21.length; i_22++) {
										i_13 = ints_21[i_22];
										i_14 = colors[i_13] & 0xffff;
										i_15 = i_14 >> 10 & 0x3f;
									i_16 = i_14 >> 7 & 0x7;
							i_17 = i_14 & 0x7f;
							i_15 = i_15 + i_3 & 0x3f;
							i_16 += i_4 / 4;
							if (i_16 < 0)
								i_16 = 0;
							else if (i_16 > 7)
								i_16 = 7;

							i_17 += i_5;
							if (i_17 < 0)
								i_17 = 0;
							else if (i_17 > 127)
								i_17 = 127;

							colors[i_13] = (short) (i_15 << 10 | i_16 << 7 | i_17);
									}

									if (ints_21.length > 0 && aClass143_8273 != null)
										aClass143_8273.anInterface14_1667 = null;
								}
							}

							if (aClass162Array8295 != null)
								for (i_9 = 0; i_9 < anInt8294; i_9++) {
									class162_23 = aClass162Array8295[i_9];
									class145_25 = aClass145Array8258[i_9];
									class145_25.anInt1714 = class145_25.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_23.anInt2023] & 0xffff] & 0xffffff;
								}
						}
					} else {
						Class145 class145_24;
						if (i_1 == 8) {
							if (anIntArrayArray8278 != null)
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < anIntArrayArray8278.length) {
										ints_21 = anIntArrayArray8278[i_10];

										for (i_22 = 0; i_22 < ints_21.length; i_22++) {
											class145_24 = aClass145Array8258[ints_21[i_22]];
											class145_24.anInt1709 += i_3;
											class145_24.anInt1713 += i_4;
										}
									}
								}
						} else if (i_1 == 10) {
							if (anIntArrayArray8278 != null)
								for (i_9 = 0; i_9 < i_8; i_9++) {
									i_10 = ints_2[i_9];
									if (i_10 < anIntArrayArray8278.length) {
										ints_21 = anIntArrayArray8278[i_10];

										for (i_22 = 0; i_22 < ints_21.length; i_22++) {
											class145_24 = aClass145Array8258[ints_21[i_22]];
											class145_24.anInt1710 = class145_24.anInt1710 * i_3 >> 7;
										class145_24.anInt1711 = class145_24.anInt1711 * i_4 >> 7;
										}
									}
								}
						} else if (i_1 == 9 && anIntArrayArray8278 != null)
							for (i_9 = 0; i_9 < i_8; i_9++) {
								i_10 = ints_2[i_9];
								if (i_10 < anIntArrayArray8278.length) {
									ints_21 = anIntArrayArray8278[i_10];

									for (i_22 = 0; i_22 < ints_21.length; i_22++) {
										class145_24 = aClass145Array8258[ints_21[i_22]];
										class145_24.anInt1712 = class145_24.anInt1712 + i_3 & 0x3fff;
									}
								}
							}
					}
				}
			}
		}

	}

	@Override
	public MeshRasterizer method11276(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		MeshRasterizer_Sub1 class528_sub1_5;
		MeshRasterizer_Sub1 class528_sub1_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub1_6 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8492[b_1 - 1];
			class528_sub1_5 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8479[b_1 - 1];
			bool_4 = true;
		} else
			class528_sub1_5 = class528_sub1_6 = new MeshRasterizer_Sub1(aGraphicalRenderer_Sub1_8239);

		return method13524(class528_sub1_5, class528_sub1_6, i_2, bool_4);
	}

	@Override
	public MeshRasterizer method11277(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		MeshRasterizer_Sub1 class528_sub1_5;
		MeshRasterizer_Sub1 class528_sub1_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub1_6 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8492[b_1 - 1];
			class528_sub1_5 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8479[b_1 - 1];
			bool_4 = true;
		} else
			class528_sub1_5 = class528_sub1_6 = new MeshRasterizer_Sub1(aGraphicalRenderer_Sub1_8239);

		return method13524(class528_sub1_5, class528_sub1_6, i_2, bool_4);
	}

	@Override
	public MeshRasterizer method11278(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		MeshRasterizer_Sub1 class528_sub1_5;
		MeshRasterizer_Sub1 class528_sub1_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub1_6 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8492[b_1 - 1];
			class528_sub1_5 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8479[b_1 - 1];
			bool_4 = true;
		} else
			class528_sub1_5 = class528_sub1_6 = new MeshRasterizer_Sub1(aGraphicalRenderer_Sub1_8239);

		return method13524(class528_sub1_5, class528_sub1_6, i_2, bool_4);
	}

	@Override
	public MeshRasterizer method11279(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		MeshRasterizer_Sub1 class528_sub1_5;
		MeshRasterizer_Sub1 class528_sub1_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub1_6 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8492[b_1 - 1];
			class528_sub1_5 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8479[b_1 - 1];
			bool_4 = true;
		} else
			class528_sub1_5 = class528_sub1_6 = new MeshRasterizer_Sub1(aGraphicalRenderer_Sub1_8239);

		return method13524(class528_sub1_5, class528_sub1_6, i_2, bool_4);
	}

	@Override
	public void method11282(Matrix44Var matrix44var_1, EntityNode_Sub5 class275_sub5_2, int i_3) {
		if ((i_3 & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);

		if (anInt8300 != 0) {
			Matrix44 matrix44_4 = aGraphicalRenderer_Sub1_8239.aClass384_8442;
			Matrix44 matrix44_5 = aGraphicalRenderer_Sub1_8239.aClass384_8380;
			Matrix44 matrix44_6 = aGraphicalRenderer_Sub1_8239.aClass384_8407;
			matrix44_5.fromVarMatrix44(matrix44var_1);
			matrix44_6.method6562(matrix44_5);
			matrix44_6.method6523(aGraphicalRenderer_Sub1_8239.aClass384_8394);
			if (!aBool8254)
				method13528();

			float[] floats_7 = aGraphicalRenderer_Sub1_8239.aFloatArray8396;
			matrix44_5.method6527(0.0F, aShort8283, 0.0F, floats_7);
			float f_8 = floats_7[0];
			float f_9 = floats_7[1];
			float f_10 = floats_7[2];
			matrix44_5.method6527(0.0F, aShort8284, 0.0F, floats_7);
			float f_11 = floats_7[0];
			float f_12 = floats_7[1];
			float f_13 = floats_7[2];

			for (int i_14 = 0; i_14 < 6; i_14++) {
				float[] floats_33 = aGraphicalRenderer_Sub1_8239.aFloatArrayArray8395[i_14];
				float f_16 = floats_33[0] * f_8 + floats_33[1] * f_9 + floats_33[2] * f_10 + floats_33[3] + anInt8281;
				float f_17 = floats_33[0] * f_11 + floats_33[1] * f_12 + floats_33[2] * f_13 + floats_33[3] + anInt8281;
				if (f_16 < 0.0F && f_17 < 0.0F)
					return;
			}

			if (class275_sub5_2 != null) {
				boolean bool_34 = false;
				boolean bool_15 = true;
				int i_35 = aShort8285 + aShort8286 >> 1;
				int i_36 = aShort8287 + aShort8306 >> 1;
			short s_19 = aShort8283;
			float f_21 = matrix44_6.buf[0] * i_35 + matrix44_6.buf[4] * s_19 + matrix44_6.buf[8] * i_36 + matrix44_6.buf[12];
			float f_22 = matrix44_6.buf[1] * i_35 + matrix44_6.buf[5] * s_19 + matrix44_6.buf[9] * i_36 + matrix44_6.buf[13];
			float f_23 = matrix44_6.buf[2] * i_35 + matrix44_6.buf[6] * s_19 + matrix44_6.buf[10] * i_36 + matrix44_6.buf[14];
			float f_24 = matrix44_6.buf[3] * i_35 + matrix44_6.buf[7] * s_19 + matrix44_6.buf[11] * i_36 + matrix44_6.buf[15];
			if (f_23 >= -f_24) {
				class275_sub5_2.anInt7847 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_21 / f_24);
				class275_sub5_2.anInt7848 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_22 / f_24);
			} else
				bool_34 = true;

			s_19 = aShort8284;
			float f_25 = matrix44_6.buf[0] * i_35 + matrix44_6.buf[4] * s_19 + matrix44_6.buf[8] * i_36 + matrix44_6.buf[12];
			float f_26 = matrix44_6.buf[1] * i_35 + matrix44_6.buf[5] * s_19 + matrix44_6.buf[9] * i_36 + matrix44_6.buf[13];
			float f_27 = matrix44_6.buf[2] * i_35 + matrix44_6.buf[6] * s_19 + matrix44_6.buf[10] * i_36 + matrix44_6.buf[14];
			float f_28 = matrix44_6.buf[3] * i_35 + matrix44_6.buf[7] * s_19 + matrix44_6.buf[11] * i_36 + matrix44_6.buf[15];
			if (f_27 >= -f_28) {
				class275_sub5_2.anInt7850 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_25 / f_28);
				class275_sub5_2.anInt7846 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_26 / f_28);
			} else
				bool_34 = true;

			float f_29;
			float f_30;
			if (bool_34)
				if (f_23 < -f_24 && f_27 < -f_28)
					bool_15 = false;
				else {
					float f_31;
					float f_32;
					if (f_23 < -f_24) {
						f_29 = (f_23 + f_24) / (f_27 + f_28) - 1.0F;
						f_30 = f_21 + f_29 * (f_25 - f_21);
						f_31 = f_22 + f_29 * (f_26 - f_22);
						f_32 = f_24 + f_29 * (f_28 - f_24);
						class275_sub5_2.anInt7847 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_30 / f_32);
						class275_sub5_2.anInt7848 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_31 / f_32);
					} else if (f_27 < -f_28) {
						f_29 = (f_27 + f_28) / (f_23 + f_24) - 1.0F;
						f_30 = f_25 + f_29 * (f_21 - f_25);
						f_31 = f_26 + f_29 * (f_22 - f_26);
						f_32 = f_28 + f_29 * (f_24 - f_28);
						class275_sub5_2.anInt7850 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_30 / f_32);
						class275_sub5_2.anInt7846 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_31 / f_32);
					}
				}

			if (bool_15) {
				if (f_23 / f_24 > f_27 / f_28) {
					f_29 = f_21 + matrix44_4.buf[0] * anInt8281 + matrix44_4.buf[12];
					f_30 = f_24 + matrix44_4.buf[3] * anInt8281 + matrix44_4.buf[15];
					class275_sub5_2.anInt7851 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 - class275_sub5_2.anInt7847 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_29 / f_30);
				} else {
					f_29 = f_25 + matrix44_4.buf[0] * anInt8281 + matrix44_4.buf[12];
					f_30 = f_28 + matrix44_4.buf[3] * anInt8281 + matrix44_4.buf[15];
					class275_sub5_2.anInt7851 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 - class275_sub5_2.anInt7850 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_29 / f_30);
				}

				class275_sub5_2.aBool7849 = true;
			}
			}

			aGraphicalRenderer_Sub1_8239.method13607();
			aGraphicalRenderer_Sub1_8239.method13633(matrix44_5);
			method13534();
			aGraphicalRenderer_Sub1_8239.method13641();
			matrix44_5.method6523(aGraphicalRenderer_Sub1_8239.aClass384_8348);
			method13535(matrix44_5);
			if ((i_3 & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}

	}

	@Override
	public SurfaceSkin[] method11283() {
		return aClass172Array8244;
	}

	@Override
	void method11285() {
	}

	@Override
	public boolean method11286(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		Matrix44 matrix44_6 = aGraphicalRenderer_Sub1_8239.aClass384_8380;
		matrix44_6.fromVarMatrix44(matrix44var_3);
		matrix44_6.method6523(aGraphicalRenderer_Sub1_8239.aClass384_8394);
		boolean bool_7 = false;
		int i_8 = Integer.MAX_VALUE;
		int i_9 = Integer.MIN_VALUE;
		int i_10 = Integer.MAX_VALUE;
		int i_11 = Integer.MIN_VALUE;
		if (!aBool8254)
			method13528();

		int i_12 = aShort8286 - aShort8285 >> 1;
					int i_13 = aShort8284 - aShort8283 >> 1;
				int i_14 = aShort8306 - aShort8287 >> 1;
								int i_15 = aShort8285 + i_12;
								int i_16 = aShort8283 + i_13;
								int i_17 = aShort8287 + i_14;
								int i_18 = i_15 - (i_12 << i_5);
								int i_19 = i_16 - (i_13 << i_5);
								int i_20 = i_17 - (i_14 << i_5);
								int i_21 = i_15 + (i_12 << i_5);
								int i_22 = i_16 + (i_13 << i_5);
								int i_23 = i_17 + (i_14 << i_5);
								anIntArray8296[0] = i_18;
								anIntArray8301[0] = i_19;
								anIntArray8268[0] = i_20;
								anIntArray8296[1] = i_21;
								anIntArray8301[1] = i_19;
								anIntArray8268[1] = i_20;
								anIntArray8296[2] = i_18;
								anIntArray8301[2] = i_22;
								anIntArray8268[2] = i_20;
								anIntArray8296[3] = i_21;
								anIntArray8301[3] = i_22;
								anIntArray8268[3] = i_20;
								anIntArray8296[4] = i_18;
								anIntArray8301[4] = i_19;
								anIntArray8268[4] = i_23;
								anIntArray8296[5] = i_21;
								anIntArray8301[5] = i_19;
								anIntArray8268[5] = i_23;
								anIntArray8296[6] = i_18;
								anIntArray8301[6] = i_22;
								anIntArray8268[6] = i_23;
								anIntArray8296[7] = i_21;
								anIntArray8301[7] = i_22;
								anIntArray8268[7] = i_23;

								int i_26;
								int i_27;
								float f_30;
								float f_31;
								int i_32;
								int i_33;
								for (int i_24 = 0; i_24 < 8; i_24++) {
									int i_39 = anIntArray8296[i_24];
									i_26 = anIntArray8301[i_24];
									i_27 = anIntArray8268[i_24];
									float f_28 = matrix44_6.buf[2] * i_39 + matrix44_6.buf[6] * i_26 + matrix44_6.buf[10] * i_27 + matrix44_6.buf[14];
									float f_29 = matrix44_6.buf[3] * i_39 + matrix44_6.buf[7] * i_26 + matrix44_6.buf[11] * i_27 + matrix44_6.buf[15];
									if (f_28 >= -f_29) {
										f_30 = matrix44_6.buf[0] * i_39 + matrix44_6.buf[4] * i_26 + matrix44_6.buf[8] * i_27 + matrix44_6.buf[12];
										f_31 = matrix44_6.buf[1] * i_39 + matrix44_6.buf[5] * i_26 + matrix44_6.buf[9] * i_27 + matrix44_6.buf[13];
										i_32 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_30 / f_29);
										i_33 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_31 / f_29);
										if (i_32 < i_8)
											i_8 = i_32;

										if (i_32 > i_9)
											i_9 = i_32;

										if (i_33 < i_10)
											i_10 = i_33;

										if (i_33 > i_11)
											i_11 = i_33;

										bool_7 = true;
									}
								}

								if (bool_7 && i_1 > i_8 && i_1 < i_9 && i_2 > i_10 && i_2 < i_11) {
									if (bool_4)
										return true;

									if (aGraphicalRenderer_Sub1_8239.anIntArray8500.length < anInt8300) {
										aGraphicalRenderer_Sub1_8239.anIntArray8500 = new int[anInt8300];
										aGraphicalRenderer_Sub1_8239.anIntArray8501 = new int[anInt8300];
									}

									int[] ints_38 = aGraphicalRenderer_Sub1_8239.anIntArray8500;
									int[] ints_25 = aGraphicalRenderer_Sub1_8239.anIntArray8501;

									for (i_26 = 0; i_26 < maxDepth; i_26++) {
										i_27 = verticesX[i_26];
										int i_40 = verticesY[i_26];
										int i_41 = verticesZ[i_26];
										f_30 = matrix44_6.buf[2] * i_27 + matrix44_6.buf[6] * i_40 + matrix44_6.buf[10] * i_41 + matrix44_6.buf[14];
										f_31 = matrix44_6.buf[3] * i_27 + matrix44_6.buf[7] * i_40 + matrix44_6.buf[11] * i_41 + matrix44_6.buf[15];
										int i_34;
										int i_35;
										if (f_30 >= -f_31) {
											float f_42 = matrix44_6.buf[0] * i_27 + matrix44_6.buf[4] * i_40 + matrix44_6.buf[8] * i_41 + matrix44_6.buf[12];
											float f_43 = matrix44_6.buf[1] * i_27 + matrix44_6.buf[5] * i_40 + matrix44_6.buf[9] * i_41 + matrix44_6.buf[13];
											i_34 = triangles[i_26];
											i_35 = triangles[i_26 + 1];

											for (int i_36 = i_34; i_36 < i_35; i_36++) {
												int i_37 = aShortArray8288[i_36] - 1;
												if (i_37 == -1)
													break;

												ints_38[i_37] = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_42 / f_31);
												ints_25[i_37] = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_43 / f_31);
											}
										} else {
											i_32 = triangles[i_26];
											i_33 = triangles[i_26 + 1];

											for (i_34 = i_32; i_34 < i_33; i_34++) {
												i_35 = aShortArray8288[i_34] - 1;
												if (i_35 == -1)
													break;

												ints_38[aShortArray8288[i_34] - 1] = -999999;
											}
										}
									}

									for (i_26 = 0; i_26 < triangleCount * 3 * -1431655765; i_26++)
										if (ints_38[aShortArray8266[i_26]] != -999999 && ints_38[aShortArray8267[i_26]] != -999999 && ints_38[aShortArray8256[i_26]] != -999999 && method13532(i_1, i_2, ints_25[aShortArray8266[i_26]], ints_25[aShortArray8267[i_26]], ints_25[aShortArray8256[i_26]], ints_38[aShortArray8266[i_26]], ints_38[aShortArray8267[i_26]], ints_38[aShortArray8256[i_26]]))
											return true;
								}

								return false;
	}

	@Override
	void method11288() {
	}

	@Override
	public MeshRasterizer method11289(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		MeshRasterizer_Sub1 class528_sub1_5;
		MeshRasterizer_Sub1 class528_sub1_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub1_6 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8492[b_1 - 1];
			class528_sub1_5 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8479[b_1 - 1];
			bool_4 = true;
		} else
			class528_sub1_5 = class528_sub1_6 = new MeshRasterizer_Sub1(aGraphicalRenderer_Sub1_8239);

		return method13524(class528_sub1_5, class528_sub1_6, i_2, bool_4);
	}

	@Override
	public void method11290(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (aShortArray8253 != null) {
			Matrix44Var matrix44var_4 = matrix44var_1;
			if (bool_3) {
				matrix44var_4 = aGraphicalRenderer_Sub1_8239.aClass294_8405;
				matrix44var_4.method5215(matrix44var_1);
			}

			float[] floats_5 = new float[3];

			for (int i_6 = 0; i_6 < maxDepth; i_6++)
				if ((i_2 & aShortArray8253[i_6]) != 0) {
					matrix44var_4.method5226(verticesX[i_6], verticesY[i_6], verticesZ[i_6], floats_5);
					verticesX[i_6] = (int) floats_5[0];
					verticesY[i_6] = (int) floats_5[1];
					verticesZ[i_6] = (int) floats_5[2];
				}
		}

	}

	@Override
	public void method11291(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (aShortArray8253 != null) {
			Matrix44Var matrix44var_4 = matrix44var_1;
			if (bool_3) {
				matrix44var_4 = aGraphicalRenderer_Sub1_8239.aClass294_8405;
				matrix44var_4.method5215(matrix44var_1);
			}

			float[] floats_5 = new float[3];

			for (int i_6 = 0; i_6 < maxDepth; i_6++)
				if ((i_2 & aShortArray8253[i_6]) != 0) {
					matrix44var_4.method5226(verticesX[i_6], verticesY[i_6], verticesZ[i_6], floats_5);
					verticesX[i_6] = (int) floats_5[0];
					verticesY[i_6] = (int) floats_5[1];
					verticesZ[i_6] = (int) floats_5[2];
				}
		}

	}

	@Override
	public void method11292(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (aShortArray8253 != null) {
			Matrix44Var matrix44var_4 = matrix44var_1;
			if (bool_3) {
				matrix44var_4 = aGraphicalRenderer_Sub1_8239.aClass294_8405;
				matrix44var_4.method5215(matrix44var_1);
			}

			float[] floats_5 = new float[3];

			for (int i_6 = 0; i_6 < maxDepth; i_6++)
				if ((i_2 & aShortArray8253[i_6]) != 0) {
					matrix44var_4.method5226(verticesX[i_6], verticesY[i_6], verticesZ[i_6], floats_5);
					verticesX[i_6] = (int) floats_5[0];
					verticesY[i_6] = (int) floats_5[1];
					verticesZ[i_6] = (int) floats_5[2];
				}
		}

	}

	@Override
	public void method11293(Matrix44Var matrix44var_1, EntityNode_Sub5 class275_sub5_2, int i_3) {
		if ((i_3 & 0x2) != 0)
			OpenGL.glPolygonMode(1032, 6913);

		if (anInt8300 != 0) {
			Matrix44 matrix44_4 = aGraphicalRenderer_Sub1_8239.aClass384_8442;
			Matrix44 matrix44_5 = aGraphicalRenderer_Sub1_8239.aClass384_8380;
			Matrix44 matrix44_6 = aGraphicalRenderer_Sub1_8239.aClass384_8407;
			matrix44_5.fromVarMatrix44(matrix44var_1);
			matrix44_6.method6562(matrix44_5);
			matrix44_6.method6523(aGraphicalRenderer_Sub1_8239.aClass384_8394);
			if (!aBool8254)
				method13528();

			float[] floats_7 = aGraphicalRenderer_Sub1_8239.aFloatArray8396;
			matrix44_5.method6527(0.0F, aShort8283, 0.0F, floats_7);
			float f_8 = floats_7[0];
			float f_9 = floats_7[1];
			float f_10 = floats_7[2];
			matrix44_5.method6527(0.0F, aShort8284, 0.0F, floats_7);
			float f_11 = floats_7[0];
			float f_12 = floats_7[1];
			float f_13 = floats_7[2];

			for (int i_14 = 0; i_14 < 6; i_14++) {
				float[] floats_33 = aGraphicalRenderer_Sub1_8239.aFloatArrayArray8395[i_14];
				float f_16 = floats_33[0] * f_8 + floats_33[1] * f_9 + floats_33[2] * f_10 + floats_33[3] + anInt8281;
				float f_17 = floats_33[0] * f_11 + floats_33[1] * f_12 + floats_33[2] * f_13 + floats_33[3] + anInt8281;
				if (f_16 < 0.0F && f_17 < 0.0F)
					return;
			}

			if (class275_sub5_2 != null) {
				boolean bool_34 = false;
				boolean bool_15 = true;
				int i_35 = aShort8285 + aShort8286 >> 1;
				int i_36 = aShort8287 + aShort8306 >> 1;
			short s_19 = aShort8283;
			float f_21 = matrix44_6.buf[0] * i_35 + matrix44_6.buf[4] * s_19 + matrix44_6.buf[8] * i_36 + matrix44_6.buf[12];
			float f_22 = matrix44_6.buf[1] * i_35 + matrix44_6.buf[5] * s_19 + matrix44_6.buf[9] * i_36 + matrix44_6.buf[13];
			float f_23 = matrix44_6.buf[2] * i_35 + matrix44_6.buf[6] * s_19 + matrix44_6.buf[10] * i_36 + matrix44_6.buf[14];
			float f_24 = matrix44_6.buf[3] * i_35 + matrix44_6.buf[7] * s_19 + matrix44_6.buf[11] * i_36 + matrix44_6.buf[15];
			if (f_23 >= -f_24) {
				class275_sub5_2.anInt7847 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_21 / f_24);
				class275_sub5_2.anInt7848 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_22 / f_24);
			} else
				bool_34 = true;

			s_19 = aShort8284;
			float f_25 = matrix44_6.buf[0] * i_35 + matrix44_6.buf[4] * s_19 + matrix44_6.buf[8] * i_36 + matrix44_6.buf[12];
			float f_26 = matrix44_6.buf[1] * i_35 + matrix44_6.buf[5] * s_19 + matrix44_6.buf[9] * i_36 + matrix44_6.buf[13];
			float f_27 = matrix44_6.buf[2] * i_35 + matrix44_6.buf[6] * s_19 + matrix44_6.buf[10] * i_36 + matrix44_6.buf[14];
			float f_28 = matrix44_6.buf[3] * i_35 + matrix44_6.buf[7] * s_19 + matrix44_6.buf[11] * i_36 + matrix44_6.buf[15];
			if (f_27 >= -f_28) {
				class275_sub5_2.anInt7850 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_25 / f_28);
				class275_sub5_2.anInt7846 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_26 / f_28);
			} else
				bool_34 = true;

			float f_29;
			float f_30;
			if (bool_34)
				if (f_23 < -f_24 && f_27 < -f_28)
					bool_15 = false;
				else {
					float f_31;
					float f_32;
					if (f_23 < -f_24) {
						f_29 = (f_23 + f_24) / (f_27 + f_28) - 1.0F;
						f_30 = f_21 + f_29 * (f_25 - f_21);
						f_31 = f_22 + f_29 * (f_26 - f_22);
						f_32 = f_24 + f_29 * (f_28 - f_24);
						class275_sub5_2.anInt7847 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_30 / f_32);
						class275_sub5_2.anInt7848 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_31 / f_32);
					} else if (f_27 < -f_28) {
						f_29 = (f_27 + f_28) / (f_23 + f_24) - 1.0F;
						f_30 = f_25 + f_29 * (f_21 - f_25);
						f_31 = f_26 + f_29 * (f_22 - f_26);
						f_32 = f_28 + f_29 * (f_24 - f_28);
						class275_sub5_2.anInt7850 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_30 / f_32);
						class275_sub5_2.anInt7846 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_31 / f_32);
					}
				}

			if (bool_15) {
				if (f_23 / f_24 > f_27 / f_28) {
					f_29 = f_21 + matrix44_4.buf[0] * anInt8281 + matrix44_4.buf[12];
					f_30 = f_24 + matrix44_4.buf[3] * anInt8281 + matrix44_4.buf[15];
					class275_sub5_2.anInt7851 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 - class275_sub5_2.anInt7847 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_29 / f_30);
				} else {
					f_29 = f_25 + matrix44_4.buf[0] * anInt8281 + matrix44_4.buf[12];
					f_30 = f_28 + matrix44_4.buf[3] * anInt8281 + matrix44_4.buf[15];
					class275_sub5_2.anInt7851 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 - class275_sub5_2.anInt7850 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_29 / f_30);
				}

				class275_sub5_2.aBool7849 = true;
			}
			}

			aGraphicalRenderer_Sub1_8239.method13607();
			aGraphicalRenderer_Sub1_8239.method13633(matrix44_5);
			method13534();
			aGraphicalRenderer_Sub1_8239.method13641();
			matrix44_5.method6523(aGraphicalRenderer_Sub1_8239.aClass384_8348);
			method13535(matrix44_5);
			if ((i_3 & 0x2) != 0)
				OpenGL.glPolygonMode(1028, 6914);
		}

	}

	@Override
	public void method11294(Matrix44Var matrix44var_1) {
		Matrix44 matrix44_2 = aGraphicalRenderer_Sub1_8239.aClass384_8380;
		matrix44_2.fromVarMatrix44(matrix44var_1);
		int i_3;
		if (aClass87Array8252 != null)
			for (i_3 = 0; i_3 < aClass87Array8252.length; i_3++) {
				ParticleEmitterConfig class87_4 = aClass87Array8252[i_3];
				ParticleEmitterConfig class87_5 = class87_4;
				if (class87_4.aClass87_835 != null)
					class87_5 = class87_4.aClass87_835;

				class87_5.anInt844 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[4] * verticesY[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[8] * verticesZ[class87_4.faceX * 1502404273 * -1572033967]) * -1929058355 * -75866875;
				class87_5.anInt841 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[5] * verticesY[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[9] * verticesZ[class87_4.faceX * 1502404273 * -1572033967]) * 996785411 * 1618253227;
				class87_5.anInt847 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[6] * verticesY[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[10] * verticesZ[class87_4.faceX * 1502404273 * -1572033967]) * 976806429 * -489230283;
				class87_5.anInt834 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[4] * verticesY[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[8] * verticesZ[class87_4.faceY * -2021469179 * -1955014451]) * -458323579 * 1747322701;
				class87_5.anInt843 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[5] * verticesY[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[9] * verticesZ[class87_4.faceY * -2021469179 * -1955014451]) * 543149547 * -174394685;
				class87_5.anInt845 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[6] * verticesY[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[10] * verticesZ[class87_4.faceY * -2021469179 * -1955014451]) * 1054448197 * 305293453;
				class87_5.anInt846 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[4] * verticesY[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[8] * verticesZ[class87_4.faceZ * -1292195173 * -2135413869]) * 1348028043 * 1878552867;
				class87_5.anInt840 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[5] * verticesY[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[9] * verticesZ[class87_4.faceZ * -1292195173 * -2135413869]) * -1652520905 * 950906247;
				class87_5.anInt848 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[6] * verticesY[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[10] * verticesZ[class87_4.faceZ * -1292195173 * -2135413869]) * 1757672349 * -1923011915;
			}

		if (aClass172Array8244 != null)
			for (i_3 = 0; i_3 < aClass172Array8244.length; i_3++) {
				SurfaceSkin class172_6 = aClass172Array8244[i_3];
				SurfaceSkin class172_7 = class172_6;
				if (class172_6.aClass172_2114 != null)
					class172_7 = class172_6.aClass172_2114;

				if (class172_6.aClass384_2116 != null)
					class172_6.aClass384_2116.method6562(matrix44_2);
				else
					class172_6.aClass384_2116 = new Matrix44(matrix44_2);

				class172_7.anInt2113 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[4] * verticesY[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[8] * verticesZ[class172_6.anInt2119 * 702737761 * -1382123871]) * 959663283 * -48479621;
				class172_7.anInt2117 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[5] * verticesY[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[9] * verticesZ[class172_6.anInt2119 * 702737761 * -1382123871]) * -1084180847 * 1018284657;
				class172_7.anInt2118 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[6] * verticesY[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[10] * verticesZ[class172_6.anInt2119 * 702737761 * -1382123871]) * -1221574613 * 1898872451;
			}

	}

	@Override
	public void method11295() {
		if (anInt8300 > 0 && anInt8302 * 3 * -1431655765 * 3 * -1431655765 > 0) {
			method13537(false);
			if ((aByte8242 & 0x10) == 0 && aClass132_8276.anInterface15_1595 == null)
				method13536(false);

			method13525();
		}

	}

	@Override
	public MeshRasterizer method11296(byte b_1, int i_2, boolean bool_3) {
		boolean bool_4 = false;
		MeshRasterizer_Sub1 class528_sub1_5;
		MeshRasterizer_Sub1 class528_sub1_6;
		if (b_1 > 0 && b_1 <= 7) {
			class528_sub1_6 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8492[b_1 - 1];
			class528_sub1_5 = aGraphicalRenderer_Sub1_8239.aMeshRasterizer_Sub1Array8479[b_1 - 1];
			bool_4 = true;
		} else
			class528_sub1_5 = class528_sub1_6 = new MeshRasterizer_Sub1(aGraphicalRenderer_Sub1_8239);

		return method13524(class528_sub1_5, class528_sub1_6, i_2, bool_4);
	}

	@Override
	public void method11298(Matrix44Var matrix44var_1, int i_2, boolean bool_3) {
		if (aShortArray8253 != null) {
			Matrix44Var matrix44var_4 = matrix44var_1;
			if (bool_3) {
				matrix44var_4 = aGraphicalRenderer_Sub1_8239.aClass294_8405;
				matrix44var_4.method5215(matrix44var_1);
			}

			float[] floats_5 = new float[3];

			for (int i_6 = 0; i_6 < maxDepth; i_6++)
				if ((i_2 & aShortArray8253[i_6]) != 0) {
					matrix44var_4.method5226(verticesX[i_6], verticesY[i_6], verticesZ[i_6], floats_5);
					verticesX[i_6] = (int) floats_5[0];
					verticesY[i_6] = (int) floats_5[1];
					verticesZ[i_6] = (int) floats_5[2];
				}
		}

	}

	@Override
	public void method11299(MeshRasterizer meshrasterizer_1, int i_2, int i_3, int i_4, boolean bool_5) {
		MeshRasterizer_Sub1 class528_sub1_6 = (MeshRasterizer_Sub1) meshrasterizer_1;
		if (triangleCount * 3 * -1431655765 != 0 && class528_sub1_6.triangleCount * 3 * -1431655765 != 0) {
			int i_7 = class528_sub1_6.maxDepth;
			int[] ints_8 = class528_sub1_6.verticesX;
			int[] ints_9 = class528_sub1_6.verticesY;
			int[] ints_10 = class528_sub1_6.verticesZ;
			short[] shorts_11 = class528_sub1_6.aShortArray8255;
			short[] shorts_12 = class528_sub1_6.aShortArray8270;
			short[] shorts_13 = class528_sub1_6.aShortArray8261;
			byte[] bytes_14 = class528_sub1_6.aByteArray8264;
			short[] shorts_15;
			short[] shorts_16;
			short[] shorts_17;
			byte[] bytes_18;
			if (aClass166_8259 != null) {
				shorts_15 = aClass166_8259.aShortArray2038;
				shorts_16 = aClass166_8259.aShortArray2039;
				shorts_17 = aClass166_8259.aShortArray2041;
				bytes_18 = aClass166_8259.aByteArray2040;
			} else {
				shorts_15 = null;
				shorts_16 = null;
				shorts_17 = null;
				bytes_18 = null;
			}

			short[] shorts_19;
			short[] shorts_20;
			short[] shorts_21;
			byte[] bytes_22;
			if (class528_sub1_6.aClass166_8259 != null) {
				shorts_19 = class528_sub1_6.aClass166_8259.aShortArray2038;
				shorts_20 = class528_sub1_6.aClass166_8259.aShortArray2039;
				shorts_21 = class528_sub1_6.aClass166_8259.aShortArray2041;
				bytes_22 = class528_sub1_6.aClass166_8259.aByteArray2040;
			} else {
				shorts_19 = null;
				shorts_20 = null;
				shorts_21 = null;
				bytes_22 = null;
			}

			int[] ints_23 = class528_sub1_6.triangles;
			short[] shorts_24 = class528_sub1_6.aShortArray8288;
			if (!class528_sub1_6.aBool8254)
				class528_sub1_6.method13528();

			short s_25 = class528_sub1_6.aShort8283;
			short s_26 = class528_sub1_6.aShort8284;
			short s_27 = class528_sub1_6.aShort8285;
			short s_28 = class528_sub1_6.aShort8286;
			short s_29 = class528_sub1_6.aShort8287;
			short s_30 = class528_sub1_6.aShort8306;

			for (int i_31 = 0; i_31 < maxDepth; i_31++) {
				int i_32 = verticesY[i_31] - i_3;
				if (i_32 >= s_25 && i_32 <= s_26) {
					int i_33 = verticesX[i_31] - i_2;
					if (i_33 >= s_27 && i_33 <= s_28) {
						int i_34 = verticesZ[i_31] - i_4;
						if (i_34 >= s_29 && i_34 <= s_30) {
							int i_35 = -1;
							int i_36 = triangles[i_31];
							int i_37 = triangles[i_31 + 1];

							int i_38;
							for (i_38 = i_36; i_38 < i_37; i_38++) {
								i_35 = aShortArray8288[i_38] - 1;
								if (i_35 == -1 || aByteArray8264[i_35] != 0)
									break;
							}

							if (i_35 != -1)
								for (i_38 = 0; i_38 < i_7; i_38++)
									if (i_33 == ints_8[i_38] && i_34 == ints_10[i_38] && i_32 == ints_9[i_38]) {
										int i_39 = -1;
										i_36 = ints_23[i_38];
										i_37 = ints_23[i_38 + 1];

										for (int i_40 = i_36; i_40 < i_37; i_40++) {
											i_39 = shorts_24[i_40] - 1;
											if (i_39 == -1 || bytes_14[i_39] != 0)
												break;
										}

										if (i_39 != -1) {
											if (shorts_15 == null) {
												aClass166_8259 = new Class166();
												shorts_15 = aClass166_8259.aShortArray2038 = Class512.method8761(aShortArray8255);
												shorts_16 = aClass166_8259.aShortArray2039 = Class512.method8761(aShortArray8270);
												shorts_17 = aClass166_8259.aShortArray2041 = Class512.method8761(aShortArray8261);
												bytes_18 = aClass166_8259.aByteArray2040 = AnimationFrameSet.method15090(aByteArray8264);
											}

											if (shorts_19 == null) {
												Class166 class166_46 = class528_sub1_6.aClass166_8259 = new Class166();
												shorts_19 = class166_46.aShortArray2038 = Class512.method8761(shorts_11);
												shorts_20 = class166_46.aShortArray2039 = Class512.method8761(shorts_12);
												shorts_21 = class166_46.aShortArray2041 = Class512.method8761(shorts_13);
												bytes_22 = class166_46.aByteArray2040 = AnimationFrameSet.method15090(bytes_14);
											}

											short s_47 = aShortArray8255[i_35];
											short s_41 = aShortArray8270[i_35];
											short s_42 = aShortArray8261[i_35];
											byte b_43 = aByteArray8264[i_35];
											i_36 = ints_23[i_38];
											i_37 = ints_23[i_38 + 1];

											int i_44;
											int i_45;
											for (i_44 = i_36; i_44 < i_37; i_44++) {
												i_45 = shorts_24[i_44] - 1;
												if (i_45 == -1)
													break;

												if (bytes_22[i_45] != 0) {
													shorts_19[i_45] += s_47;
													shorts_20[i_45] += s_41;
													shorts_21[i_45] += s_42;
													bytes_22[i_45] += b_43;
												}
											}

											s_47 = shorts_11[i_39];
											s_41 = shorts_12[i_39];
											s_42 = shorts_13[i_39];
											b_43 = bytes_14[i_39];
											i_36 = triangles[i_31];
											i_37 = triangles[i_31 + 1];

											for (i_44 = i_36; i_44 < i_37; i_44++) {
												i_45 = aShortArray8288[i_44] - 1;
												if (i_45 == -1)
													break;

												if (bytes_18[i_45] != 0) {
													shorts_15[i_45] += s_47;
													shorts_16[i_45] += s_41;
													shorts_17[i_45] += s_42;
													bytes_18[i_45] += b_43;
												}
											}

											if (aClass143_8274 == null && aClass143_8273 != null)
												aClass143_8273.anInterface14_1667 = null;

											if (aClass143_8274 != null)
												aClass143_8274.anInterface14_1667 = null;

											if (class528_sub1_6.aClass143_8274 == null && class528_sub1_6.aClass143_8273 != null)
												class528_sub1_6.aClass143_8273.anInterface14_1667 = null;

											if (class528_sub1_6.aClass143_8274 != null)
												class528_sub1_6.aClass143_8274.anInterface14_1667 = null;
										}
									}
						}
					}
				}
			}
		}

	}

	@Override
	public ParticleEmitterConfig[] method11300() {
		return aClass87Array8252;
	}

	@Override
	void method11301() {
	}

	@Override
	public SurfaceSkin[] method11302() {
		return aClass172Array8244;
	}

	@Override
	public boolean method11303() {
		if (aShortArray8269 != null)
			for (short element : aShortArray8269)
				if (element != -1 && !aGraphicalRenderer_Sub1_8239.textureCache.loadTexture(element))
					return false;
		return true;
	}

	@Override
	public void method11307(byte b_1, byte[] bytes_2) {
		int i_3;
		if (bytes_2 == null)
			for (i_3 = 0; i_3 < triangleCount * 3 * -1431655765; i_3++)
				aByteArray8265[i_3] = b_1;
		else
			for (i_3 = 0; i_3 < triangleCount * 3 * -1431655765; i_3++) {
				int i_4 = 255 - (255 - (bytes_2[i_3] & 0xff)) * (255 - (b_1 & 0xff)) / 255;
				aByteArray8265[i_3] = (byte) i_4;
			}

		if (aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

	}

	@Override
	void method11308() {
	}

	@Override
	public boolean method11309(int i_1, int i_2, Matrix44Var matrix44var_3, boolean bool_4, int i_5) {
		Matrix44 matrix44_6 = aGraphicalRenderer_Sub1_8239.aClass384_8380;
		matrix44_6.fromVarMatrix44(matrix44var_3);
		matrix44_6.method6523(aGraphicalRenderer_Sub1_8239.aClass384_8394);
		boolean bool_7 = false;
		int i_8 = Integer.MAX_VALUE;
		int i_9 = Integer.MIN_VALUE;
		int i_10 = Integer.MAX_VALUE;
		int i_11 = Integer.MIN_VALUE;
		if (!aBool8254)
			method13528();

		int i_12 = aShort8286 - aShort8285 >> 1;
			int i_13 = aShort8284 - aShort8283 >> 1;
											int i_14 = aShort8306 - aShort8287 >> 1;
										int i_15 = aShort8285 + i_12;
										int i_16 = aShort8283 + i_13;
										int i_17 = aShort8287 + i_14;
										int i_18 = i_15 - (i_12 << i_5);
										int i_19 = i_16 - (i_13 << i_5);
										int i_20 = i_17 - (i_14 << i_5);
										int i_21 = i_15 + (i_12 << i_5);
										int i_22 = i_16 + (i_13 << i_5);
										int i_23 = i_17 + (i_14 << i_5);
										anIntArray8296[0] = i_18;
										anIntArray8301[0] = i_19;
										anIntArray8268[0] = i_20;
										anIntArray8296[1] = i_21;
										anIntArray8301[1] = i_19;
										anIntArray8268[1] = i_20;
										anIntArray8296[2] = i_18;
										anIntArray8301[2] = i_22;
										anIntArray8268[2] = i_20;
										anIntArray8296[3] = i_21;
										anIntArray8301[3] = i_22;
										anIntArray8268[3] = i_20;
										anIntArray8296[4] = i_18;
										anIntArray8301[4] = i_19;
										anIntArray8268[4] = i_23;
										anIntArray8296[5] = i_21;
										anIntArray8301[5] = i_19;
										anIntArray8268[5] = i_23;
										anIntArray8296[6] = i_18;
										anIntArray8301[6] = i_22;
										anIntArray8268[6] = i_23;
										anIntArray8296[7] = i_21;
										anIntArray8301[7] = i_22;
										anIntArray8268[7] = i_23;

										int i_26;
										int i_27;
										float f_30;
										float f_31;
										int i_32;
										int i_33;
										for (int i_24 = 0; i_24 < 8; i_24++) {
											int i_39 = anIntArray8296[i_24];
											i_26 = anIntArray8301[i_24];
											i_27 = anIntArray8268[i_24];
											float f_28 = matrix44_6.buf[2] * i_39 + matrix44_6.buf[6] * i_26 + matrix44_6.buf[10] * i_27 + matrix44_6.buf[14];
											float f_29 = matrix44_6.buf[3] * i_39 + matrix44_6.buf[7] * i_26 + matrix44_6.buf[11] * i_27 + matrix44_6.buf[15];
											if (f_28 >= -f_29) {
												f_30 = matrix44_6.buf[0] * i_39 + matrix44_6.buf[4] * i_26 + matrix44_6.buf[8] * i_27 + matrix44_6.buf[12];
												f_31 = matrix44_6.buf[1] * i_39 + matrix44_6.buf[5] * i_26 + matrix44_6.buf[9] * i_27 + matrix44_6.buf[13];
												i_32 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_30 / f_29);
												i_33 = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_31 / f_29);
												if (i_32 < i_8)
													i_8 = i_32;

												if (i_32 > i_9)
													i_9 = i_32;

												if (i_33 < i_10)
													i_10 = i_33;

												if (i_33 > i_11)
													i_11 = i_33;

												bool_7 = true;
											}
										}

										if (bool_7 && i_1 > i_8 && i_1 < i_9 && i_2 > i_10 && i_2 < i_11) {
											if (bool_4)
												return true;

											if (aGraphicalRenderer_Sub1_8239.anIntArray8500.length < anInt8300) {
												aGraphicalRenderer_Sub1_8239.anIntArray8500 = new int[anInt8300];
												aGraphicalRenderer_Sub1_8239.anIntArray8501 = new int[anInt8300];
											}

											int[] ints_38 = aGraphicalRenderer_Sub1_8239.anIntArray8500;
											int[] ints_25 = aGraphicalRenderer_Sub1_8239.anIntArray8501;

											for (i_26 = 0; i_26 < maxDepth; i_26++) {
												i_27 = verticesX[i_26];
												int i_40 = verticesY[i_26];
												int i_41 = verticesZ[i_26];
												f_30 = matrix44_6.buf[2] * i_27 + matrix44_6.buf[6] * i_40 + matrix44_6.buf[10] * i_41 + matrix44_6.buf[14];
												f_31 = matrix44_6.buf[3] * i_27 + matrix44_6.buf[7] * i_40 + matrix44_6.buf[11] * i_41 + matrix44_6.buf[15];
												int i_34;
												int i_35;
												if (f_30 >= -f_31) {
													float f_42 = matrix44_6.buf[0] * i_27 + matrix44_6.buf[4] * i_40 + matrix44_6.buf[8] * i_41 + matrix44_6.buf[12];
													float f_43 = matrix44_6.buf[1] * i_27 + matrix44_6.buf[5] * i_40 + matrix44_6.buf[9] * i_41 + matrix44_6.buf[13];
													i_34 = triangles[i_26];
													i_35 = triangles[i_26 + 1];

													for (int i_36 = i_34; i_36 < i_35; i_36++) {
														int i_37 = aShortArray8288[i_36] - 1;
														if (i_37 == -1)
															break;

														ints_38[i_37] = (int) (aGraphicalRenderer_Sub1_8239.aFloat8315 + aGraphicalRenderer_Sub1_8239.aFloat8398 * f_42 / f_31);
														ints_25[i_37] = (int) (aGraphicalRenderer_Sub1_8239.aFloat8399 + aGraphicalRenderer_Sub1_8239.aFloat8400 * f_43 / f_31);
													}
												} else {
													i_32 = triangles[i_26];
													i_33 = triangles[i_26 + 1];

													for (i_34 = i_32; i_34 < i_33; i_34++) {
														i_35 = aShortArray8288[i_34] - 1;
														if (i_35 == -1)
															break;

														ints_38[aShortArray8288[i_34] - 1] = -999999;
													}
												}
											}

											for (i_26 = 0; i_26 < triangleCount * 3 * -1431655765; i_26++)
												if (ints_38[aShortArray8266[i_26]] != -999999 && ints_38[aShortArray8267[i_26]] != -999999 && ints_38[aShortArray8256[i_26]] != -999999 && method13532(i_1, i_2, ints_25[aShortArray8266[i_26]], ints_25[aShortArray8267[i_26]], ints_25[aShortArray8256[i_26]], ints_38[aShortArray8266[i_26]], ints_38[aShortArray8267[i_26]], ints_38[aShortArray8256[i_26]]))
													return true;
										}

										return false;
	}

	@Override
	public void method11312(byte b_1, byte[] bytes_2) {
		int i_3;
		if (bytes_2 == null)
			for (i_3 = 0; i_3 < triangleCount; i_3++)
				aByteArray8265[i_3] = b_1;
		else
			for (i_3 = 0; i_3 < triangleCount; i_3++) {
				int i_4 = 255 - (255 - (b_1 & 0xff)) * (255 - (bytes_2[i_3] & 0xff)) / 255;
				aByteArray8265[i_3] = (byte) i_4;
			}

		if (aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

	}

	@Override
	public void method11315(Matrix44Var matrix44var_1) {
		Matrix44 matrix44_2 = aGraphicalRenderer_Sub1_8239.aClass384_8380;
		matrix44_2.fromVarMatrix44(matrix44var_1);
		int i_3;
		if (aClass87Array8252 != null)
			for (i_3 = 0; i_3 < aClass87Array8252.length; i_3++) {
				ParticleEmitterConfig class87_4 = aClass87Array8252[i_3];
				ParticleEmitterConfig class87_5 = class87_4;
				if (class87_4.aClass87_835 != null)
					class87_5 = class87_4.aClass87_835;

				class87_5.anInt844 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[4] * verticesY[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[8] * verticesZ[class87_4.faceX * 1502404273 * -1572033967]) * -1929058355 * -75866875;
				class87_5.anInt841 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[5] * verticesY[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[9] * verticesZ[class87_4.faceX * 1502404273 * -1572033967]) * 996785411 * 1618253227;
				class87_5.anInt847 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[6] * verticesY[class87_4.faceX * 1502404273 * -1572033967] + matrix44_2.buf[10] * verticesZ[class87_4.faceX * 1502404273 * -1572033967]) * 976806429 * -489230283;
				class87_5.anInt834 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[4] * verticesY[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[8] * verticesZ[class87_4.faceY * -2021469179 * -1955014451]) * -458323579 * 1747322701;
				class87_5.anInt843 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[5] * verticesY[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[9] * verticesZ[class87_4.faceY * -2021469179 * -1955014451]) * 543149547 * -174394685;
				class87_5.anInt845 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[6] * verticesY[class87_4.faceY * -2021469179 * -1955014451] + matrix44_2.buf[10] * verticesZ[class87_4.faceY * -2021469179 * -1955014451]) * 1054448197 * 305293453;
				class87_5.anInt846 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[4] * verticesY[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[8] * verticesZ[class87_4.faceZ * -1292195173 * -2135413869]) * 1348028043 * 1878552867;
				class87_5.anInt840 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[5] * verticesY[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[9] * verticesZ[class87_4.faceZ * -1292195173 * -2135413869]) * -1652520905 * 950906247;
				class87_5.anInt848 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[6] * verticesY[class87_4.faceZ * -1292195173 * -2135413869] + matrix44_2.buf[10] * verticesZ[class87_4.faceZ * -1292195173 * -2135413869]) * 1757672349 * -1923011915;
			}

		if (aClass172Array8244 != null)
			for (i_3 = 0; i_3 < aClass172Array8244.length; i_3++) {
				SurfaceSkin class172_6 = aClass172Array8244[i_3];
				SurfaceSkin class172_7 = class172_6;
				if (class172_6.aClass172_2114 != null)
					class172_7 = class172_6.aClass172_2114;

				if (class172_6.aClass384_2116 != null)
					class172_6.aClass384_2116.method6562(matrix44_2);
				else
					class172_6.aClass384_2116 = new Matrix44(matrix44_2);

				class172_7.anInt2113 = (int) (matrix44_2.buf[12] + matrix44_2.buf[0] * verticesX[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[4] * verticesY[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[8] * verticesZ[class172_6.anInt2119 * 702737761 * -1382123871]) * 959663283 * -48479621;
				class172_7.anInt2117 = (int) (matrix44_2.buf[13] + matrix44_2.buf[1] * verticesX[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[5] * verticesY[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[9] * verticesZ[class172_6.anInt2119 * 702737761 * -1382123871]) * -1084180847 * 1018284657;
				class172_7.anInt2118 = (int) (matrix44_2.buf[14] + matrix44_2.buf[2] * verticesX[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[6] * verticesY[class172_6.anInt2119 * 702737761 * -1382123871] + matrix44_2.buf[10] * verticesZ[class172_6.anInt2119 * 702737761 * -1382123871]) * -1221574613 * 1898872451;
			}

	}

	@Override
	public SurfaceSkin[] method11331() {
		return aClass172Array8244;
	}

	void method13522(CacheableNode_Sub17_Sub1 class282_sub50_sub17_sub1_1) {
		if (aGraphicalRenderer_Sub1_8239.anIntArray8500.length < anInt8300) {
			aGraphicalRenderer_Sub1_8239.anIntArray8500 = new int[anInt8300];
			aGraphicalRenderer_Sub1_8239.anIntArray8501 = new int[anInt8300];
		}

		int[] ints_2 = aGraphicalRenderer_Sub1_8239.anIntArray8500;
		int[] ints_3 = aGraphicalRenderer_Sub1_8239.anIntArray8501;

		int i_4;
		int i_5;
		int i_6;
		int i_7;
		int i_8;
		int i_9;
		int i_10;
		for (i_4 = 0; i_4 < maxDepth; i_4++) {
			i_5 = (verticesX[i_4] - (aGraphicalRenderer_Sub1_8239.anInt8438 * verticesY[i_4] >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473) - class282_sub50_sub17_sub1_1.anInt10293;
			i_6 = (verticesZ[i_4] - (aGraphicalRenderer_Sub1_8239.anInt8439 * verticesY[i_4] >> 8) >> aGraphicalRenderer_Sub1_8239.anInt8473) - class282_sub50_sub17_sub1_1.anInt10295;
			i_7 = triangles[i_4];
			i_8 = triangles[i_4 + 1];

			for (i_9 = i_7; i_9 < i_8; i_9++) {
				i_10 = (aShortArray8288[i_9] & 0xffff) - 1;
				if (i_10 == -1)
					break;

				ints_2[i_10] = i_5;
				ints_3[i_10] = i_6;
			}
		}

		for (i_4 = 0; i_4 < anInt8302; i_4++)
			if (aByteArray8265 == null || aByteArray8265[i_4] <= 128) {
				i_5 = aShortArray8266[i_4] & 0xffff;
				i_6 = aShortArray8267[i_4] & 0xffff;
				i_7 = aShortArray8256[i_4] & 0xffff;
				i_8 = ints_2[i_5];
				i_9 = ints_2[i_6];
				i_10 = ints_2[i_7];
				int i_11 = ints_3[i_5];
				int i_12 = ints_3[i_6];
				int i_13 = ints_3[i_7];
				if ((i_8 - i_9) * (i_12 - i_13) - (i_12 - i_11) * (i_10 - i_9) > 0)
					class282_sub50_sub17_sub1_1.method15713(i_11, i_12, i_13, i_8, i_9, i_10);
			}

	}

	MeshRasterizer method13524(MeshRasterizer_Sub1 class528_sub1_1, MeshRasterizer_Sub1 class528_sub1_2, int i_3, boolean bool_4) {
		class528_sub1_1.aByte8242 = 0;
		class528_sub1_1.anInt8240 = i_3;
		class528_sub1_1.anInt8241 = anInt8241;
		class528_sub1_1.aShort8243 = aShort8243;
		class528_sub1_1.aShort8257 = aShort8257;
		class528_sub1_1.vertexCount = vertexCount;
		class528_sub1_1.maxDepth = maxDepth;
		class528_sub1_1.anInt8300 = anInt8300;
		class528_sub1_1.triangleCount = triangleCount;
		class528_sub1_1.anInt8302 = anInt8302;
		class528_sub1_1.anInt8294 = anInt8294;
		if ((i_3 & 0x100) != 0)
			class528_sub1_1.aBool8245 = true;
		else
			class528_sub1_1.aBool8245 = aBool8245;

		class528_sub1_1.aBool8246 = aBool8246;
		boolean bool_6 = RasterizerFlags.method2180(i_3);
		boolean bool_7 = RasterizerFlags.method2181(i_3);
		boolean bool_8 = RasterizerFlags.method2184(i_3);
		boolean bool_9 = bool_6 | bool_7 | bool_8;
		int i_10;
		if (bool_9) {
			if (bool_6) {
				if (class528_sub1_2.verticesX != null && class528_sub1_2.verticesX.length >= vertexCount)
					class528_sub1_1.verticesX = class528_sub1_2.verticesX;
				else
					class528_sub1_1.verticesX = class528_sub1_2.verticesX = new int[vertexCount];
			} else
				class528_sub1_1.verticesX = verticesX;

			if (bool_7) {
				if (class528_sub1_2.verticesY != null && class528_sub1_2.verticesY.length >= vertexCount)
					class528_sub1_1.verticesY = class528_sub1_2.verticesY;
				else
					class528_sub1_1.verticesY = class528_sub1_2.verticesY = new int[vertexCount];
			} else
				class528_sub1_1.verticesY = verticesY;

			if (bool_8) {
				if (class528_sub1_2.verticesZ != null && class528_sub1_2.verticesZ.length >= vertexCount)
					class528_sub1_1.verticesZ = class528_sub1_2.verticesZ;
				else
					class528_sub1_1.verticesZ = class528_sub1_2.verticesZ = new int[vertexCount];
			} else
				class528_sub1_1.verticesZ = verticesZ;

			for (i_10 = 0; i_10 < vertexCount; i_10++) {
				if (bool_6)
					class528_sub1_1.verticesX[i_10] = verticesX[i_10];

				if (bool_7)
					class528_sub1_1.verticesY[i_10] = verticesY[i_10];

				if (bool_8)
					class528_sub1_1.verticesZ[i_10] = verticesZ[i_10];
			}
		} else {
			class528_sub1_1.verticesX = verticesX;
			class528_sub1_1.verticesY = verticesY;
			class528_sub1_1.verticesZ = verticesZ;
		}

		if (RasterizerFlags.method2197(i_3)) {
			if (bool_4)
				class528_sub1_1.aByte8242 |= 0x1;

			class528_sub1_1.aClass143_8272 = class528_sub1_2.aClass143_8272;
			class528_sub1_1.aClass143_8272.aByte1669 = aClass143_8272.aByte1669;
			class528_sub1_1.aClass143_8272.anInterface14_1667 = aClass143_8272.anInterface14_1667;
		} else if (RasterizerFlags.method2192(i_3))
			class528_sub1_1.aClass143_8272 = aClass143_8272;
		else
			class528_sub1_1.aClass143_8272 = null;

		if (RasterizerFlags.method2185(i_3)) {
			if (class528_sub1_2.colors != null && class528_sub1_2.colors.length >= triangleCount)
				class528_sub1_1.colors = class528_sub1_2.colors;
			else
				class528_sub1_1.colors = class528_sub1_2.colors = new short[triangleCount];

			for (i_10 = 0; i_10 < triangleCount; i_10++)
				class528_sub1_1.colors[i_10] = colors[i_10];
		} else
			class528_sub1_1.colors = colors;

		if (RasterizerFlags.method2186(i_3)) {
			if (class528_sub1_2.aByteArray8265 != null && class528_sub1_2.aByteArray8265.length >= triangleCount)
				class528_sub1_1.aByteArray8265 = class528_sub1_2.aByteArray8265;
			else
				class528_sub1_1.aByteArray8265 = class528_sub1_2.aByteArray8265 = new byte[triangleCount];

			for (i_10 = 0; i_10 < triangleCount; i_10++)
				class528_sub1_1.aByteArray8265[i_10] = aByteArray8265[i_10];
		} else
			class528_sub1_1.aByteArray8265 = aByteArray8265;

		if (RasterizerFlags.method2199(i_3, anInt8241)) {
			if (bool_4)
				class528_sub1_1.aByte8242 |= 0x2;

			class528_sub1_1.aClass143_8273 = class528_sub1_2.aClass143_8273;
			class528_sub1_1.aClass143_8273.aByte1669 = aClass143_8273.aByte1669;
			class528_sub1_1.aClass143_8273.anInterface14_1667 = aClass143_8273.anInterface14_1667;
		} else if (RasterizerFlags.method2194(i_3))
			class528_sub1_1.aClass143_8273 = aClass143_8273;
		else
			class528_sub1_1.aClass143_8273 = null;

		int i_11;
		if (RasterizerFlags.method2195(i_3)) {
			if (class528_sub1_2.aShortArray8255 != null && class528_sub1_2.aShortArray8255.length >= anInt8300) {
				class528_sub1_1.aShortArray8255 = class528_sub1_2.aShortArray8255;
				class528_sub1_1.aShortArray8270 = class528_sub1_2.aShortArray8270;
				class528_sub1_1.aShortArray8261 = class528_sub1_2.aShortArray8261;
			} else {
				i_10 = anInt8300;
				class528_sub1_1.aShortArray8255 = class528_sub1_2.aShortArray8255 = new short[i_10];
				class528_sub1_1.aShortArray8270 = class528_sub1_2.aShortArray8270 = new short[i_10];
				class528_sub1_1.aShortArray8261 = class528_sub1_2.aShortArray8261 = new short[i_10];
			}

			if (aClass166_8259 != null) {
				if (class528_sub1_2.aClass166_8259 == null)
					class528_sub1_2.aClass166_8259 = new Class166();

				Class166 class166_12 = class528_sub1_1.aClass166_8259 = class528_sub1_2.aClass166_8259;
				if (class166_12.aShortArray2038 == null || class166_12.aShortArray2038.length < anInt8300) {
					i_11 = anInt8300;
					class166_12.aShortArray2038 = new short[i_11];
					class166_12.aShortArray2039 = new short[i_11];
					class166_12.aShortArray2041 = new short[i_11];
					class166_12.aByteArray2040 = new byte[i_11];
				}

				for (i_11 = 0; i_11 < anInt8300; i_11++) {
					class528_sub1_1.aShortArray8255[i_11] = aShortArray8255[i_11];
					class528_sub1_1.aShortArray8270[i_11] = aShortArray8270[i_11];
					class528_sub1_1.aShortArray8261[i_11] = aShortArray8261[i_11];
					class166_12.aShortArray2038[i_11] = aClass166_8259.aShortArray2038[i_11];
					class166_12.aShortArray2039[i_11] = aClass166_8259.aShortArray2039[i_11];
					class166_12.aShortArray2041[i_11] = aClass166_8259.aShortArray2041[i_11];
					class166_12.aByteArray2040[i_11] = aClass166_8259.aByteArray2040[i_11];
				}
			} else
				for (i_10 = 0; i_10 < anInt8300; i_10++) {
					class528_sub1_1.aShortArray8255[i_10] = aShortArray8255[i_10];
					class528_sub1_1.aShortArray8270[i_10] = aShortArray8270[i_10];
					class528_sub1_1.aShortArray8261[i_10] = aShortArray8261[i_10];
				}

		} else {
			class528_sub1_1.aClass166_8259 = aClass166_8259;
			class528_sub1_1.aShortArray8255 = aShortArray8255;
			class528_sub1_1.aShortArray8270 = aShortArray8270;
			class528_sub1_1.aShortArray8261 = aShortArray8261;
		}
		class528_sub1_1.aByteArray8264 = aByteArray8264;

		if (RasterizerFlags.method2261(i_3, anInt8241)) {
			if (bool_4)
				class528_sub1_1.aByte8242 |= 0x4;

			class528_sub1_1.aClass143_8274 = class528_sub1_2.aClass143_8274;
			class528_sub1_1.aClass143_8274.aByte1669 = aClass143_8274.aByte1669;
			class528_sub1_1.aClass143_8274.anInterface14_1667 = aClass143_8274.anInterface14_1667;
		} else if (RasterizerFlags.method2193(i_3, anInt8241))
			class528_sub1_1.aClass143_8274 = aClass143_8274;
		else
			class528_sub1_1.aClass143_8274 = null;

		class528_sub1_1.aFloatArray8297 = aFloatArray8297;
		class528_sub1_1.aFloatArray8292 = aFloatArray8292;

		if (RasterizerFlags.method2200()) {
			if (bool_4)
				class528_sub1_1.aByte8242 |= 0x8;

			class528_sub1_1.aClass143_8275 = class528_sub1_2.aClass143_8275;
			class528_sub1_1.aClass143_8275.aByte1669 = aClass143_8275.aByte1669;
			class528_sub1_1.aClass143_8275.anInterface14_1667 = aClass143_8275.anInterface14_1667;
		} else if (RasterizerFlags.method2201(i_3))
			class528_sub1_1.aClass143_8275 = aClass143_8275;
		else
			class528_sub1_1.aClass143_8275 = null;

		if (RasterizerFlags.method2188(i_3)) {
			if (class528_sub1_2.aShortArray8266 != null && class528_sub1_2.aShortArray8266.length >= triangleCount) {
				class528_sub1_1.aShortArray8266 = class528_sub1_2.aShortArray8266;
				class528_sub1_1.aShortArray8267 = class528_sub1_2.aShortArray8267;
				class528_sub1_1.aShortArray8256 = class528_sub1_2.aShortArray8256;
			} else {
				i_10 = triangleCount;
				class528_sub1_1.aShortArray8266 = class528_sub1_2.aShortArray8266 = new short[i_10];
				class528_sub1_1.aShortArray8267 = class528_sub1_2.aShortArray8267 = new short[i_10];
				class528_sub1_1.aShortArray8256 = class528_sub1_2.aShortArray8256 = new short[i_10];
			}

			for (i_10 = 0; i_10 < triangleCount; i_10++) {
				class528_sub1_1.aShortArray8266[i_10] = aShortArray8266[i_10];
				class528_sub1_1.aShortArray8267[i_10] = aShortArray8267[i_10];
				class528_sub1_1.aShortArray8256[i_10] = aShortArray8256[i_10];
			}
		} else {
			class528_sub1_1.aShortArray8266 = aShortArray8266;
			class528_sub1_1.aShortArray8267 = aShortArray8267;
			class528_sub1_1.aShortArray8256 = aShortArray8256;
		}

		if (RasterizerFlags.method2283(i_3)) {
			if (bool_4)
				class528_sub1_1.aByte8242 |= 0x10;

			class528_sub1_1.aClass132_8276 = class528_sub1_2.aClass132_8276;
			class528_sub1_1.aClass132_8276.anInterface15_1595 = aClass132_8276.anInterface15_1595;
		} else if (RasterizerFlags.method2196(i_3))
			class528_sub1_1.aClass132_8276 = aClass132_8276;
		else
			class528_sub1_1.aClass132_8276 = null;

		if (RasterizerFlags.method2189(i_3)) {
			if (class528_sub1_2.aShortArray8269 != null && class528_sub1_2.aShortArray8269.length >= triangleCount)
				class528_sub1_1.aShortArray8269 = class528_sub1_2.aShortArray8269;
			else {
				i_10 = triangleCount;
				class528_sub1_1.aShortArray8269 = class528_sub1_2.aShortArray8269 = new short[i_10];
			}

			for (i_10 = 0; i_10 < triangleCount; i_10++)
				class528_sub1_1.aShortArray8269[i_10] = aShortArray8269[i_10];
		} else
			class528_sub1_1.aShortArray8269 = aShortArray8269;

		if (RasterizerFlags.method2190(i_3)) {
			if (class528_sub1_2.aClass145Array8258 != null && class528_sub1_2.aClass145Array8258.length >= anInt8294) {
				class528_sub1_1.aClass145Array8258 = class528_sub1_2.aClass145Array8258;

				for (i_10 = 0; i_10 < anInt8294; i_10++)
					class528_sub1_1.aClass145Array8258[i_10].method2452(aClass145Array8258[i_10]);
			} else {
				i_10 = anInt8294;
				class528_sub1_1.aClass145Array8258 = class528_sub1_2.aClass145Array8258 = new Class145[i_10];

				for (i_11 = 0; i_11 < anInt8294; i_11++)
					class528_sub1_1.aClass145Array8258[i_11] = aClass145Array8258[i_11].method2451();
			}
		} else
			class528_sub1_1.aClass145Array8258 = aClass145Array8258;

		class528_sub1_1.aClass162Array8295 = aClass162Array8295;
		if (aBool8254) {
			class528_sub1_1.anInt8280 = anInt8280;
			class528_sub1_1.anInt8281 = anInt8281;
			class528_sub1_1.aShort8285 = aShort8285;
			class528_sub1_1.aShort8286 = aShort8286;
			class528_sub1_1.aShort8283 = aShort8283;
			class528_sub1_1.aShort8284 = aShort8284;
			class528_sub1_1.aShort8287 = aShort8287;
			class528_sub1_1.aShort8306 = aShort8306;
			class528_sub1_1.aBool8254 = true;
		} else
			class528_sub1_1.aBool8254 = false;

		class528_sub1_1.anIntArrayArray8263 = anIntArrayArray8263;
		class528_sub1_1.anIntArrayArray8282 = anIntArrayArray8282;
		class528_sub1_1.anIntArrayArray8278 = anIntArrayArray8278;
		class528_sub1_1.aShortArray8288 = aShortArray8288;
		class528_sub1_1.triangles = triangles;
		class528_sub1_1.aShortArray8253 = aShortArray8253;
		class528_sub1_1.aShortArray8304 = aShortArray8304;
		class528_sub1_1.anIntArray8289 = anIntArray8289;
		class528_sub1_1.aClass87Array8252 = aClass87Array8252;
		class528_sub1_1.aClass172Array8244 = aClass172Array8244;
		return class528_sub1_1;
	}

	void method13525() {
		if (aBool8279) {
			aBool8279 = false;
			if (aClass87Array8252 == null && aClass172Array8244 == null && aClass162Array8295 == null && !RasterizerFlags.method2183(anInt8240)) {
				boolean bool_1 = false;
				boolean bool_2 = false;
				boolean bool_3 = false;
				if (verticesX != null && !RasterizerFlags.method2202(anInt8240))
					if (aClass143_8272 != null && aClass143_8272.anInterface14_1667 == null)
						aBool8279 = true;
					else {
						if (!aBool8254)
							method13528();

						bool_1 = true;
					}

				if (verticesY != null && !RasterizerFlags.method2229(anInt8240))
					if (aClass143_8272 != null && aClass143_8272.anInterface14_1667 == null)
						aBool8279 = true;
					else {
						if (!aBool8254)
							method13528();

						bool_2 = true;
					}

				if (verticesZ != null && !RasterizerFlags.method2252(anInt8240))
					if (aClass143_8272 != null && aClass143_8272.anInterface14_1667 == null)
						aBool8279 = true;
					else {
						if (!aBool8254)
							method13528();

						bool_3 = true;
					}

				if (bool_1)
					verticesX = null;

				if (bool_2)
					verticesY = null;

				if (bool_3)
					verticesZ = null;
			}

			if (aShortArray8288 != null && verticesX == null && verticesY == null && verticesZ == null) {
				aShortArray8288 = null;
				triangles = null;
			}

			if (aByteArray8264 != null && !RasterizerFlags.method2204(anInt8240, anInt8241))
				if (aClass143_8274 != null) {
					if (aClass143_8274.anInterface14_1667 != null) {
						aShortArray8261 = null;
						aShortArray8270 = null;
						aShortArray8255 = null;
						aByteArray8264 = null;
					} else
						aBool8279 = true;
				} else if (aClass143_8273 != null && aClass143_8273.anInterface14_1667 == null)
					aBool8279 = true;
				else {
					aShortArray8261 = null;
					aShortArray8270 = null;
					aShortArray8255 = null;
					aByteArray8264 = null;
				}

			if (colors != null && !RasterizerFlags.method2205(anInt8240, anInt8241))
				if (aClass143_8273 != null && aClass143_8273.anInterface14_1667 == null)
					aBool8279 = true;
				else
					colors = null;

			if (aByteArray8265 != null && !RasterizerFlags.method2206(anInt8240, anInt8241))
				if (aClass143_8273 != null && aClass143_8273.anInterface14_1667 == null)
					aBool8279 = true;
				else
					aByteArray8265 = null;

			if (aFloatArray8297 != null && !RasterizerFlags.method2241())
				if (aClass143_8275 != null && aClass143_8275.anInterface14_1667 == null)
					aBool8279 = true;
				else {
					aFloatArray8292 = null;
					aFloatArray8297 = null;
				}

			if (aShortArray8269 != null && !RasterizerFlags.method2212(anInt8240, anInt8241))
				if (aClass143_8273 != null && aClass143_8273.anInterface14_1667 == null)
					aBool8279 = true;
				else
					aShortArray8269 = null;

			if (aShortArray8266 != null && !RasterizerFlags.method2211(anInt8240, anInt8241))
				if (aClass132_8276 != null && aClass132_8276.anInterface15_1595 == null || aClass143_8273 != null && aClass143_8273.anInterface14_1667 == null)
					aBool8279 = true;
				else {
					aShortArray8256 = null;
					aShortArray8267 = null;
					aShortArray8266 = null;
				}

			if (anIntArrayArray8282 != null && !RasterizerFlags.method2208(anInt8240)) {
				anIntArrayArray8282 = null;
				aShortArray8304 = null;
			}

			if (anIntArrayArray8263 != null && !RasterizerFlags.method2226(anInt8240)) {
				anIntArrayArray8263 = null;
				aShortArray8253 = null;
			}

			if (anIntArrayArray8278 != null && !RasterizerFlags.method2260(anInt8240))
				anIntArrayArray8278 = null;

			if (anIntArray8289 != null && (anInt8240 & 0x800) == 0 && (anInt8240 & 0x40000) == 0)
				anIntArray8289 = null;
		}

	}

	void method13528() {
		int i_1 = 32767;
		int i_2 = 32767;
		int i_3 = 32767;
		int i_4 = -32768;
		int i_5 = -32768;
		int i_6 = -32768;
		int i_7 = 0;
		int i_8 = 0;

		for (int i_9 = 0; i_9 < maxDepth; i_9++) {
			int i_10 = verticesX[i_9];
			int i_11 = verticesY[i_9];
			int i_12 = verticesZ[i_9];
			if (i_10 < i_1)
				i_1 = i_10;

			if (i_10 > i_4)
				i_4 = i_10;

			if (i_11 < i_2)
				i_2 = i_11;

			if (i_11 > i_5)
				i_5 = i_11;

			if (i_12 < i_3)
				i_3 = i_12;

			if (i_12 > i_6)
				i_6 = i_12;

			int i_13 = i_10 * i_10 + i_12 * i_12;
			if (i_13 > i_7)
				i_7 = i_13;

			i_13 = i_10 * i_10 + i_12 * i_12 + i_11 * i_11;
			if (i_13 > i_8)
				i_8 = i_13;
		}

		aShort8285 = (short) i_1;
		aShort8286 = (short) i_4;
		aShort8283 = (short) i_2;
		aShort8284 = (short) i_5;
		aShort8287 = (short) i_3;
		aShort8306 = (short) i_6;
		anInt8281 = (int) (Math.sqrt(i_7) + 0.99D);
		anInt8280 = (int) (Math.sqrt(i_8) + 0.99D);
		aBool8254 = true;
	}

	int method13531(int i_1, short s_2, int i_3, byte b_4) {
		int i_5 = Class540.anIntArray7136[method13538(i_1, i_3)];
		if (s_2 != -1) {
			TextureDetails class169_6 = aGraphicalRenderer_Sub1_8239.textureCache.getTextureDetails(s_2 & 0xffff);
			int i_7 = class169_6.shadowFactor & 0xff;
			int i_8;
			int i_10;
			if (i_7 != 0) {
				if (i_3 < 0)
					i_8 = 0;
				else if (i_3 > 127)
					i_8 = 16777215;
				else
					i_8 = i_3 * 131586;

				if (i_7 == 256)
					i_5 = i_8;
				else {
					i_10 = 256 - i_7;
					i_5 = ((i_8 & 0xff00ff) * i_7 + (i_5 & 0xff00ff) * i_10 & -16711936) + (i_7 * (i_8 & 0xff00) + i_10 * (i_5 & 0xff00) & 0xff0000) >> 8;
				}
			}

			i_8 = class169_6.brightness & 0xff;
			if (i_8 != 0) {
				i_8 += 256;
				int i_9 = i_8 * ((i_5 & 0xff0000) >> 16);
				if (i_9 > 65535)
					i_9 = 65535;

				i_10 = i_8 * ((i_5 & 0xff00) >> 8);
				if (i_10 > 65535)
					i_10 = 65535;

				int i_11 = (i_5 & 0xff) * i_8;
				if (i_11 > 65535)
					i_11 = 65535;

				i_5 = (i_11 >> 8) + (i_10 & 0xff00) + (i_9 << 8 & 0xff0000);
			}
		}

		return i_5 << 8 | 255 - (b_4 & 0xff);
	}

	boolean method13532(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		return (i_2 >= i_3 || i_2 >= i_4 || i_2 >= i_5) && ((i_2 <= i_3 || i_2 <= i_4 || i_2 <= i_5) && ((i_1 >= i_6 || i_1 >= i_7 || i_1 >= i_8) && (i_1 <= i_6 || i_1 <= i_7 || i_1 <= i_8)));
	}

	void method13534() {
		if (anInt8302 != 0) {
			if (aByte8242 != 0)
				method13537(true);

			method13537(false);
			if (aClass132_8276 != null) {
				if (aClass132_8276.anInterface15_1595 == null)
					method13536((aByte8242 & 0x10) != 0);

				if (aClass132_8276.anInterface15_1595 != null) {
					aGraphicalRenderer_Sub1_8239.method13620(aClass143_8274 != null);
					aGraphicalRenderer_Sub1_8239.method13647(aClass143_8272, aClass143_8274, aClass143_8273, aClass143_8275);
					int i_1 = anIntArray8289.length - 1;

					for (int i_2 = 0; i_2 < i_1; i_2++) {
						int i_3 = anIntArray8289[i_2];
						int i_4 = anIntArray8289[i_2 + 1];
						int i_5 = aShortArray8269[i_3] & 0xffff;
						if (i_5 == 65535)
							i_5 = -1;

						aGraphicalRenderer_Sub1_8239.method13608(i_5, aClass143_8274 != null);
						aGraphicalRenderer_Sub1_8239.method13611(aClass132_8276.anInterface15_1595, i_3 * 3, (i_4 - i_3) * 3);
					}
				}
			}

			method13525();
		}

	}

	void method13535(Matrix44 matrix44_1) {
		if (aClass162Array8295 != null) {
			Matrix44 matrix44_2 = aGraphicalRenderer_Sub1_8239.aClass384_8361;
			aGraphicalRenderer_Sub1_8239.pushMatrix();
			aGraphicalRenderer_Sub1_8239.RA(!aBool8245);
			aGraphicalRenderer_Sub1_8239.method13620(false);
			aGraphicalRenderer_Sub1_8239.method13647(aGraphicalRenderer_Sub1_8239.aClass143_8494, null, null, aGraphicalRenderer_Sub1_8239.aClass143_8495);

			for (int i_3 = 0; i_3 < anInt8294; i_3++) {
				Class162 class162_4 = aClass162Array8295[i_3];
				Class145 class145_5 = aClass145Array8258[i_3];
				if (!class162_4.aBool2018 || !aGraphicalRenderer_Sub1_8239.method8471()) {
					float f_6 = (verticesX[class162_4.anInt2017] + verticesX[class162_4.anInt2019] + verticesX[class162_4.anInt2021]) * 0.3333333F;
					float f_7 = (verticesY[class162_4.anInt2017] + verticesY[class162_4.anInt2019] + verticesY[class162_4.anInt2021]) * 0.3333333F;
					float f_8 = (verticesZ[class162_4.anInt2017] + verticesZ[class162_4.anInt2019] + verticesZ[class162_4.anInt2021]) * 0.3333333F;
					float f_9 = matrix44_1.buf[0] * f_6 + matrix44_1.buf[4] * f_7 + matrix44_1.buf[8] * f_8 + matrix44_1.buf[12];
					float f_10 = matrix44_1.buf[1] * f_6 + matrix44_1.buf[5] * f_7 + matrix44_1.buf[9] * f_8 + matrix44_1.buf[13];
					float f_11 = matrix44_1.buf[2] * f_6 + matrix44_1.buf[6] * f_7 + matrix44_1.buf[10] * f_8 + matrix44_1.buf[14];
					float f_12 = (float) (1.0D / Math.sqrt(f_9 * f_9 + f_10 * f_10 + f_11 * f_11)) * class162_4.anInt2025;
					matrix44_2.method6549(class145_5.anInt1712, class145_5.anInt1710 * class162_4.aShort2020 >> 7, class145_5.anInt1711 * class162_4.aShort2016 >> 7, f_9 + class145_5.anInt1709 - f_9 * f_12, f_10 + class145_5.anInt1713 - f_10 * f_12, f_11 - f_11 * f_12);
					aGraphicalRenderer_Sub1_8239.method13585(matrix44_2);
					int i_13 = class145_5.anInt1714;
					OpenGL.glColor4ub((byte) (i_13 >> 16), (byte) (i_13 >> 8), (byte) i_13, (byte) (i_13 >> 24));
					aGraphicalRenderer_Sub1_8239.method13581(class162_4.aShort2022);
					aGraphicalRenderer_Sub1_8239.setColorRenderType(class162_4.aByte2024);
					aGraphicalRenderer_Sub1_8239.method13603(4);
				}
			}

			aGraphicalRenderer_Sub1_8239.RA(true);
			aGraphicalRenderer_Sub1_8239.method13641();
		}

	}

	void method13536(boolean bool_1) {
		if (aGraphicalRenderer_Sub1_8239.aNode_Sub35_Sub1_8499.buffer.length < anInt8302 * 6)
			aGraphicalRenderer_Sub1_8239.aNode_Sub35_Sub1_8499 = new Node_Sub35_Sub1((anInt8302 + 100) * 6);
		else
			aGraphicalRenderer_Sub1_8239.aNode_Sub35_Sub1_8499.index = 0;

		Node_Sub35_Sub1 class282_sub35_sub1_2 = aGraphicalRenderer_Sub1_8239.aNode_Sub35_Sub1_8499;
		int i_3;
		if (aGraphicalRenderer_Sub1_8239.aBool8467)
			for (i_3 = 0; i_3 < anInt8302; i_3++) {
				class282_sub35_sub1_2.writeShort(aShortArray8266[i_3]);
				class282_sub35_sub1_2.writeShort(aShortArray8267[i_3]);
				class282_sub35_sub1_2.writeShort(aShortArray8256[i_3]);
			}
		else
			for (i_3 = 0; i_3 < anInt8302; i_3++) {
				class282_sub35_sub1_2.writeLEShort(aShortArray8266[i_3]);
				class282_sub35_sub1_2.writeLEShort(aShortArray8267[i_3]);
				class282_sub35_sub1_2.writeLEShort(aShortArray8256[i_3]);
			}

		if (class282_sub35_sub1_2.index != 0) {
			if (bool_1) {
				if (anInterface15_8277 == null)
					anInterface15_8277 = aGraphicalRenderer_Sub1_8239.method13598(class282_sub35_sub1_2.buffer, class282_sub35_sub1_2.index, true);
				else
					anInterface15_8277.method111(class282_sub35_sub1_2.buffer, class282_sub35_sub1_2.index);

				aClass132_8276.anInterface15_1595 = anInterface15_8277;
			} else
				aClass132_8276.anInterface15_1595 = aGraphicalRenderer_Sub1_8239.method13598(class282_sub35_sub1_2.buffer, class282_sub35_sub1_2.index, false);

			if (!bool_1)
				aBool8279 = true;
		}

	}

	void method13537(boolean bool_1) {
		boolean bool_2 = aClass143_8273 != null && aClass143_8273.anInterface14_1667 == null;
		boolean bool_3 = aClass143_8274 != null && aClass143_8274.anInterface14_1667 == null;
		boolean bool_4 = aClass143_8272 != null && aClass143_8272.anInterface14_1667 == null;
		boolean bool_5 = aClass143_8275 != null && aClass143_8275.anInterface14_1667 == null;
		if (bool_1) {
			bool_2 &= (aByte8242 & 0x2) != 0;
			bool_3 &= (aByte8242 & 0x4) != 0;
			bool_4 &= (aByte8242 & 0x1) != 0;
			bool_5 &= (aByte8242 & 0x8) != 0;
		}

		byte b_6 = 0;
		byte b_7 = 0;
		byte b_8 = 0;
		byte b_9 = 0;
		byte b_10 = 0;
		if (bool_4) {
			b_7 = b_6;
			b_6 += 12;
		}

		if (bool_2) {
			b_8 = b_6;
			b_6 += 4;
		}

		if (bool_3) {
			b_9 = b_6;
			b_6 += 12;
		}

		if (bool_5) {
			b_10 = b_6;
			b_6 += 8;
		}

		if (b_6 != 0) {
			if (aGraphicalRenderer_Sub1_8239.aNode_Sub35_Sub1_8499.buffer.length < b_6 * anInt8300)
				aGraphicalRenderer_Sub1_8239.aNode_Sub35_Sub1_8499 = new Node_Sub35_Sub1((anInt8300 + 100) * b_6);
			else
				aGraphicalRenderer_Sub1_8239.aNode_Sub35_Sub1_8499.index = 0;

			Node_Sub35_Sub1 class282_sub35_sub1_11 = aGraphicalRenderer_Sub1_8239.aNode_Sub35_Sub1_8499;
			int i_12;
			int i_13;
			int i_18;
			int i_19;
			if (bool_4) {
				int i_14;
				int i_15;
				int i_16;
				int i_17;
				if (aGraphicalRenderer_Sub1_8239.aBool8467)
					for (i_12 = 0; i_12 < maxDepth; i_12++) {
						i_13 = Stream.floatToRawIntBits(verticesX[i_12]);
						i_14 = Stream.floatToRawIntBits(verticesY[i_12]);
						i_15 = Stream.floatToRawIntBits(verticesZ[i_12]);
						i_16 = triangles[i_12];
						i_17 = triangles[i_12 + 1];

						for (i_18 = i_16; i_18 < i_17; i_18++) {
							i_19 = aShortArray8288[i_18] - 1;
							if (i_19 == -1)
								break;

							class282_sub35_sub1_11.index = i_19 * b_6;
							class282_sub35_sub1_11.writeInt(i_13);
							class282_sub35_sub1_11.writeInt(i_14);
							class282_sub35_sub1_11.writeInt(i_15);
						}
					}
				else
					for (i_12 = 0; i_12 < maxDepth; i_12++) {
						i_13 = Stream.floatToRawIntBits(verticesX[i_12]);
						i_14 = Stream.floatToRawIntBits(verticesY[i_12]);
						i_15 = Stream.floatToRawIntBits(verticesZ[i_12]);
						i_16 = triangles[i_12];
						i_17 = triangles[i_12 + 1];

						for (i_18 = i_16; i_18 < i_17; i_18++) {
							i_19 = (aShortArray8288[i_18] & 0xffff) - 1;
							if (i_19 == -1)
								break;

							class282_sub35_sub1_11.index = i_19 * b_6;
							class282_sub35_sub1_11.method13232(i_13);
							class282_sub35_sub1_11.method13232(i_14);
							class282_sub35_sub1_11.method13232(i_15);
						}
					}
			}

			float f_20;
			short[] shorts_34;
			short[] shorts_35;
			short[] shorts_36;
			byte[] bytes_37;
			float f_38;
			float f_39;
			if (bool_2)
				if (aClass143_8274 == null) {
					if (aClass166_8259 != null) {
						shorts_34 = aClass166_8259.aShortArray2038;
						shorts_35 = aClass166_8259.aShortArray2039;
						shorts_36 = aClass166_8259.aShortArray2041;
						bytes_37 = aClass166_8259.aByteArray2040;
					} else {
						shorts_34 = aShortArray8255;
						shorts_35 = aShortArray8270;
						shorts_36 = aShortArray8261;
						bytes_37 = aByteArray8264;
					}

					f_38 = aGraphicalRenderer_Sub1_8239.aFloatArray8426[0];
					f_39 = aGraphicalRenderer_Sub1_8239.aFloatArray8426[1];
					float f_40 = aGraphicalRenderer_Sub1_8239.aFloatArray8426[2];
					float f_41 = aGraphicalRenderer_Sub1_8239.aFloat8432;
					f_20 = aGraphicalRenderer_Sub1_8239.aFloat8433 * 768.0F / aShort8257;
					float f_21 = aGraphicalRenderer_Sub1_8239.aFloat8434 * 768.0F / aShort8257;

					for (int i_22 = 0; i_22 < triangleCount; i_22++) {
						int i_23 = method13531(colors[i_22], aShortArray8269[i_22], aShort8243, aByteArray8265[i_22]);
						float f_24 = (i_23 >>> 24) * aGraphicalRenderer_Sub1_8239.aFloat8429;
						float f_25 = (i_23 >> 16 & 0xff) * aGraphicalRenderer_Sub1_8239.aFloat8430;
						float f_26 = (i_23 >> 8 & 0xff) * aGraphicalRenderer_Sub1_8239.aFloat8431;
						short s_27 = aShortArray8266[i_22];
						short s_28 = bytes_37[s_27];
						float f_29;
						if (s_28 == 0)
							f_29 = (f_38 * shorts_34[s_27] + f_39 * shorts_35[s_27] + f_40 * shorts_36[s_27]) * 0.0026041667F;
						else
							f_29 = (f_38 * shorts_34[s_27] + f_39 * shorts_35[s_27] + f_40 * shorts_36[s_27]) / (s_28 * 256);

						float f_30 = f_41 + f_29 * (f_29 < 0.0F ? f_21 : f_20);
						int i_31 = (int) (f_24 * f_30);
						if (i_31 < 0)
							i_31 = 0;
						else if (i_31 > 255)
							i_31 = 255;

						int i_32 = (int) (f_25 * f_30);
						if (i_32 < 0)
							i_32 = 0;
						else if (i_32 > 255)
							i_32 = 255;

						int i_33 = (int) (f_26 * f_30);
						if (i_33 < 0)
							i_33 = 0;
						else if (i_33 > 255)
							i_33 = 255;

						class282_sub35_sub1_11.index = b_8 + s_27 * b_6;
						class282_sub35_sub1_11.writeByte(i_31);
						class282_sub35_sub1_11.writeByte(i_32);
						class282_sub35_sub1_11.writeByte(i_33);
						class282_sub35_sub1_11.writeByte(255 - (aByteArray8265[i_22] & 0xff));
						s_27 = aShortArray8267[i_22];
						s_28 = bytes_37[s_27];
						if (s_28 == 0)
							f_29 = (f_38 * shorts_34[s_27] + f_39 * shorts_35[s_27] + f_40 * shorts_36[s_27]) * 0.0026041667F;
						else
							f_29 = (f_38 * shorts_34[s_27] + f_39 * shorts_35[s_27] + f_40 * shorts_36[s_27]) / (s_28 * 256);

						f_30 = f_41 + f_29 * (f_29 < 0.0F ? f_21 : f_20);
						i_31 = (int) (f_24 * f_30);
						if (i_31 < 0)
							i_31 = 0;
						else if (i_31 > 255)
							i_31 = 255;

						i_32 = (int) (f_25 * f_30);
						if (i_32 < 0)
							i_32 = 0;
						else if (i_32 > 255)
							i_32 = 255;

						i_33 = (int) (f_26 * f_30);
						if (i_33 < 0)
							i_33 = 0;
						else if (i_33 > 255)
							i_33 = 255;

						class282_sub35_sub1_11.index = b_8 + s_27 * b_6;
						class282_sub35_sub1_11.writeByte(i_31);
						class282_sub35_sub1_11.writeByte(i_32);
						class282_sub35_sub1_11.writeByte(i_33);
						class282_sub35_sub1_11.writeByte(255 - (aByteArray8265[i_22] & 0xff));
						s_27 = aShortArray8256[i_22];
						s_28 = bytes_37[s_27];
						if (s_28 == 0)
							f_29 = (f_38 * shorts_34[s_27] + f_39 * shorts_35[s_27] + f_40 * shorts_36[s_27]) * 0.0026041667F;
						else
							f_29 = (f_38 * shorts_34[s_27] + f_39 * shorts_35[s_27] + f_40 * shorts_36[s_27]) / (s_28 * 256);

						f_30 = f_41 + f_29 * (f_29 < 0.0F ? f_21 : f_20);
						i_31 = (int) (f_24 * f_30);
						if (i_31 < 0)
							i_31 = 0;
						else if (i_31 > 255)
							i_31 = 255;

						i_32 = (int) (f_25 * f_30);
						if (i_32 < 0)
							i_32 = 0;
						else if (i_32 > 255)
							i_32 = 255;

						i_33 = (int) (f_26 * f_30);
						if (i_33 < 0)
							i_33 = 0;
						else if (i_33 > 255)
							i_33 = 255;

						class282_sub35_sub1_11.index = b_8 + s_27 * b_6;
						class282_sub35_sub1_11.writeByte(i_31);
						class282_sub35_sub1_11.writeByte(i_32);
						class282_sub35_sub1_11.writeByte(i_33);
						class282_sub35_sub1_11.writeByte(255 - (aByteArray8265[i_22] & 0xff));
					}
				} else
					for (i_12 = 0; i_12 < triangleCount; i_12++) {
						i_13 = method13531(colors[i_12], aShortArray8269[i_12], aShort8243, aByteArray8265[i_12]);
						class282_sub35_sub1_11.index = b_8 + b_6 * (aShortArray8266[i_12] & 0xffff);
						class282_sub35_sub1_11.writeInt(i_13);
						class282_sub35_sub1_11.index = b_8 + b_6 * (aShortArray8267[i_12] & 0xffff);
						class282_sub35_sub1_11.writeInt(i_13);
						class282_sub35_sub1_11.index = b_8 + b_6 * (aShortArray8256[i_12] & 0xffff);
						class282_sub35_sub1_11.writeInt(i_13);
					}

			if (bool_3) {
				if (aClass166_8259 != null) {
					shorts_34 = aClass166_8259.aShortArray2038;
					shorts_35 = aClass166_8259.aShortArray2039;
					shorts_36 = aClass166_8259.aShortArray2041;
					bytes_37 = aClass166_8259.aByteArray2040;
				} else {
					shorts_34 = aShortArray8255;
					shorts_35 = aShortArray8270;
					shorts_36 = aShortArray8261;
					bytes_37 = aByteArray8264;
				}

				f_38 = 3.0F / aShort8257;
				f_39 = 3.0F / (aShort8257 / 2 + aShort8257);
				class282_sub35_sub1_11.index = b_9;
				if (aGraphicalRenderer_Sub1_8239.aBool8467)
					for (i_18 = 0; i_18 < anInt8300; i_18++) {
						i_19 = bytes_37[i_18] & 0xff;
						if (i_19 == 0) {
							class282_sub35_sub1_11.method14688(shorts_34[i_18] * f_39);
							class282_sub35_sub1_11.method14688(shorts_35[i_18] * f_39);
							class282_sub35_sub1_11.method14688(shorts_36[i_18] * f_39);
						} else {
							f_20 = f_38 / i_19;
							class282_sub35_sub1_11.method14688(shorts_34[i_18] * f_20);
							class282_sub35_sub1_11.method14688(shorts_35[i_18] * f_20);
							class282_sub35_sub1_11.method14688(shorts_36[i_18] * f_20);
						}

						class282_sub35_sub1_11.index += b_6 - 12;
					}
				else
					for (i_18 = 0; i_18 < anInt8300; i_18++) {
						i_19 = bytes_37[i_18] & 0xff;
						if (i_19 == 0) {
							class282_sub35_sub1_11.method14685(shorts_34[i_18] * f_39);
							class282_sub35_sub1_11.method14685(shorts_35[i_18] * f_39);
							class282_sub35_sub1_11.method14685(shorts_36[i_18] * f_39);
						} else {
							f_20 = f_38 / i_19;
							class282_sub35_sub1_11.method14685(shorts_34[i_18] * f_20);
							class282_sub35_sub1_11.method14685(shorts_35[i_18] * f_20);
							class282_sub35_sub1_11.method14685(shorts_36[i_18] * f_20);
						}

						class282_sub35_sub1_11.index += b_6 - 12;
					}
			}

			if (bool_5) {
				class282_sub35_sub1_11.index = b_10;
				if (aGraphicalRenderer_Sub1_8239.aBool8467)
					for (i_12 = 0; i_12 < anInt8300; i_12++) {
						class282_sub35_sub1_11.method14688(aFloatArray8297[i_12]);
						class282_sub35_sub1_11.method14688(aFloatArray8292[i_12]);
						class282_sub35_sub1_11.index += b_6 - 8;
					}
				else
					for (i_12 = 0; i_12 < anInt8300; i_12++) {
						class282_sub35_sub1_11.method14685(aFloatArray8297[i_12]);
						class282_sub35_sub1_11.method14685(aFloatArray8292[i_12]);
						class282_sub35_sub1_11.index += b_6 - 8;
					}
			}

			class282_sub35_sub1_11.index = b_6 * anInt8300;
			Interface14 interface14_42;
			if (bool_1) {
				if (anInterface14_8305 == null)
					anInterface14_8305 = aGraphicalRenderer_Sub1_8239.method13599(b_6, class282_sub35_sub1_11.buffer, class282_sub35_sub1_11.index, true);
				else
					anInterface14_8305.method106(b_6, class282_sub35_sub1_11.buffer, class282_sub35_sub1_11.index);

				interface14_42 = anInterface14_8305;
				aByte8242 = 0;
			} else {
				interface14_42 = aGraphicalRenderer_Sub1_8239.method13599(b_6, class282_sub35_sub1_11.buffer, class282_sub35_sub1_11.index, false);
				aBool8279 = true;
			}

			if (bool_4) {
				aClass143_8272.anInterface14_1667 = interface14_42;
				aClass143_8272.aByte1669 = b_7;
			}

			if (bool_5) {
				aClass143_8275.anInterface14_1667 = interface14_42;
				aClass143_8275.aByte1669 = b_10;
			}

			if (bool_2) {
				aClass143_8273.anInterface14_1667 = interface14_42;
				aClass143_8273.aByte1669 = b_8;
			}

			if (bool_3) {
				aClass143_8274.anInterface14_1667 = interface14_42;
				aClass143_8274.aByte1669 = b_9;
			}
		}

	}

	short method13542(int i_2, long long_3, int i_5, int i_6, int i_7, int i_8, float f_9, float f_10) {
		int i_11 = triangles[i_2];
		int i_12 = triangles[i_2 + 1];
		int i_13 = 0;

		for (int i_14 = i_11; i_14 < i_12; i_14++) {
			short s_15 = aShortArray8288[i_14];
			if (s_15 == 0) {
				i_13 = i_14;
				break;
			}

			if (aLongArray8298[i_14] == long_3)
				return (short) (s_15 - 1);
		}

		aShortArray8288[i_13] = (short) (anInt8300 + 1);
		aLongArray8298[i_13] = long_3;
		aShortArray8255[anInt8300] = (short) i_5;
		aShortArray8270[anInt8300] = (short) i_6;
		aShortArray8261[anInt8300] = (short) i_7;
		aByteArray8264[anInt8300] = (byte) i_8;
		aFloatArray8297[anInt8300] = f_9;
		aFloatArray8292[anInt8300] = f_10;
		return (short) (anInt8300++);
	}

	@Override
	public int n() {
		if (!aBool8254)
			method13528();

		return anInt8280;
	}

	@Override
	public int N() {
		if (!aBool8254)
			method13528();

		return anInt8281;
	}

	@Override
	public int o() {
		if (!aBool8254)
			method13528();

		return aShort8284;
	}

	@Override
	public void oa(int i_1, int i_2, int i_3) {
		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			if (i_1 != 128)
				verticesX[i_4] = verticesX[i_4] * i_1 >> 7;

		if (i_2 != 128)
			verticesY[i_4] = i_2 * verticesY[i_4] >> 7;

					if (i_3 != 128)
						verticesZ[i_4] = i_3 * verticesZ[i_4] >> 7;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public void p(int i_1) {
		aShort8243 = (short) i_1;
		if (aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

	}

	@Override
	public void pa(int i_1, int i_2, Ground class390_3, Ground class390_4, int i_5, int i_6, int i_7) {
		if (!aBool8254)
			method13528();

		int i_8 = i_5 + aShort8285;
		int i_9 = i_5 + aShort8286;
		int i_10 = i_7 + aShort8287;
		int i_11 = i_7 + aShort8306;
		if (i_1 != 1 && i_1 != 2 && i_1 != 3 && i_1 != 5 || i_8 >= 0 && i_9 + class390_3.tileUnits >> class390_3.tileScale < class390_3.width && i_10 >= 0 && i_11 + class390_3.tileUnits >> class390_3.tileScale < class390_3.length) {
			if (i_1 != 4 && i_1 != 5) {
				i_8 >>= class390_3.tileScale;
						i_9 = i_9 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
										i_10 >>= class390_3.tileScale;
						i_11 = i_11 + (class390_3.tileUnits - 1) >> class390_3.tileScale;
		if (class390_3.getHeight(i_8, i_10) == i_6 && class390_3.getHeight(i_9, i_10) == i_6 && class390_3.getHeight(i_8, i_11) == i_6 && class390_3.getHeight(i_9, i_11) == i_6)
			return;
			} else if (class390_4 == null || i_8 < 0 || class390_4.tileUnits + i_9 >> class390_4.tileScale >= class390_4.width || i_10 < 0 || class390_4.tileUnits + i_11 >> class390_4.tileScale >= class390_4.length)
				return;

			int i_12;
			if (i_1 == 1)
				for (i_12 = 0; i_12 < maxDepth; i_12++)
					verticesY[i_12] = verticesY[i_12] + class390_3.averageHeight(verticesX[i_12] + i_5, verticesZ[i_12] + i_7) - i_6;
			else {
				int i_13;
				int i_14;
				if (i_1 == 2) {
					short s_19 = aShort8283;
					if (s_19 == 0)
						return;

					for (i_13 = 0; i_13 < maxDepth; i_13++) {
						i_14 = (verticesY[i_13] << 16) / s_19;
						if (i_14 < i_2)
							verticesY[i_13] += (class390_3.averageHeight(verticesX[i_13] + i_5, verticesZ[i_13] + i_7) - i_6) * (i_2 - i_14) / i_2;
					}
				} else {
					int i_15;
					if (i_1 == 3) {
						i_12 = (i_2 & 0xff) * 4;
						i_13 = (i_2 >> 8 & 0xff) * 4;
						i_14 = (i_2 >> 16 & 0xff) << 6;
						i_15 = (i_2 >> 24 & 0xff) << 6;
						if (i_5 - (i_12 >> 1) < 0 || i_5 + class390_3.tileUnits + (i_12 >> 1) >= class390_3.width << class390_3.tileScale || i_7 - (i_13 >> 1) < 0 || class390_3.tileUnits + (i_13 >> 1) + i_7 >= class390_3.length << class390_3.tileScale)
							return;

						method11281(class390_3, i_5, i_6, i_7, i_12, i_13, i_14, i_15);
					} else if (i_1 == 4) {
						i_12 = aShort8284 - aShort8283;

						for (i_13 = 0; i_13 < maxDepth; i_13++)
							verticesY[i_13] += (class390_4.averageHeight(verticesX[i_13] + i_5, verticesZ[i_13] + i_7) - i_6) + i_12;
					} else if (i_1 == 5) {
						i_12 = aShort8284 - aShort8283;

						for (i_13 = 0; i_13 < maxDepth; i_13++) {
							i_14 = i_5 + verticesX[i_13];
							i_15 = i_7 + verticesZ[i_13];
							int i_16 = class390_3.averageHeight(i_14, i_15);
							int i_17 = class390_4.averageHeight(i_14, i_15);
							int i_18 = i_16 - i_17 - i_2;
							verticesY[i_13] = (i_18 * ((verticesY[i_13] << 8) / i_12) >> 8) - (i_6 - i_16);
						}
					}
				}
			}

			if (aClass143_8272 != null)
				aClass143_8272.anInterface14_1667 = null;

			aBool8254 = false;
		}

	}

	@Override
	public void PA(int rAdd, int gAdd, int bAdd, int scalar) {
		for (int i = 0; i < triangleCount; i++) {
			int originalColor = colors[i] & 0xffff;
			int origR = originalColor >> 10 & 0x3f;
		int origG = originalColor >> 7 & 0x7;
						int origB = originalColor & 0x7f;
						if (rAdd != -1)
							origR += (rAdd - origR) * scalar >> 7;

						if (gAdd != -1)
							origG += scalar * (gAdd - origG) >> 7;

								if (bAdd != -1)
									origB += (bAdd - origB) * scalar >> 7;

								colors[i] = (short) (origR << 10 | origG << 7 | origB);
		}

		if (aClass162Array8295 != null)
			for (int i = 0; i < anInt8294; i++) {
				Class162 class162_10 = aClass162Array8295[i];
				Class145 class145_11 = aClass145Array8258[i];
				class145_11.anInt1714 = class145_11.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_10.anInt2023] & 0xffff] & 0xffffff;
			}

		if (aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

	}

	@Override
	public void Q(int i_1) {
		aShort8257 = (short) i_1;
		if (aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

		if (aClass143_8274 != null)
			aClass143_8274.anInterface14_1667 = null;

	}

	@Override
	public int RA() {
		if (!aBool8254)
			method13528();

		return aShort8285;
	}

	@Override
	public void S(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		int i_4;
		int i_5;
		for (i_4 = 0; i_4 < maxDepth; i_4++) {
			i_5 = i_2 * verticesZ[i_4] + i_3 * verticesX[i_4] >> 14;
		verticesZ[i_4] = i_3 * verticesZ[i_4] - i_2 * verticesX[i_4] >> 14;
								verticesX[i_4] = i_5;
		}

		for (i_4 = 0; i_4 < anInt8300; i_4++) {
			i_5 = aShortArray8261[i_4] * i_2 + aShortArray8255[i_4] * i_3 >> 14;
		aShortArray8261[i_4] = (short) (aShortArray8261[i_4] * i_3 - aShortArray8255[i_4] * i_2 >> 14);
		aShortArray8255[i_4] = (short) i_5;
		}

		if (aClass143_8274 == null && aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

		if (aClass143_8274 != null)
			aClass143_8274.anInterface14_1667 = null;

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public boolean successful() {
		if (aShortArray8269 != null)
			for (short element : aShortArray8269)
				if (element != -1 && !aGraphicalRenderer_Sub1_8239.textureCache.loadTexture(element))
					return false;
		return true;
	}

	@Override
	public void t(int i_1) {
		int i_2 = Trig.SINE[i_1];
		int i_3 = Trig.COSINE[i_1];

		for (int i_4 = 0; i_4 < maxDepth; i_4++) {
			int i_5 = i_3 * verticesY[i_4] - i_2 * verticesZ[i_4] >> 14;
		verticesZ[i_4] = i_2 * verticesY[i_4] + i_3 * verticesZ[i_4] >> 14;
								verticesY[i_4] = i_5;
		}

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		aBool8254 = false;
	}

	@Override
	public boolean u() {
		return aBool8246;
	}

	@Override
	void w(int i_1, int i_2, int i_3, int i_4) {
		int i_5;
		int i_6;
		if (i_1 == 0) {
			i_5 = 0;
			anInt8271 = 0;
			anInt8247 = 0;
			anInt8232 = 0;

			for (i_6 = 0; i_6 < maxDepth; i_6++) {
				anInt8271 += verticesX[i_6];
				anInt8247 += verticesY[i_6];
				anInt8232 += verticesZ[i_6];
				++i_5;
			}

			if (i_5 > 0) {
				anInt8271 = i_2 + anInt8271 / i_5;
				anInt8247 = i_3 + anInt8247 / i_5;
				anInt8232 = i_4 + anInt8232 / i_5;
			} else {
				anInt8271 = i_2;
				anInt8247 = i_3;
				anInt8232 = i_4;
			}
		} else if (i_1 == 1)
			for (i_5 = 0; i_5 < maxDepth; i_5++) {
				verticesX[i_5] += i_2;
				verticesY[i_5] += i_3;
				verticesZ[i_5] += i_4;
			}
		else {
			int i_7;
			int i_8;
			if (i_1 == 2)
				for (i_5 = 0; i_5 < maxDepth; i_5++) {
					verticesX[i_5] -= anInt8271;
					verticesY[i_5] -= anInt8247;
					verticesZ[i_5] -= anInt8232;
					if (i_4 != 0) {
						i_6 = Trig.SINE[i_4];
						i_7 = Trig.COSINE[i_4];
						i_8 = i_6 * verticesY[i_5] + i_7 * verticesX[i_5] + 16383 >> 14;
				verticesY[i_5] = i_7 * verticesY[i_5] - i_6 * verticesX[i_5] + 16383 >> 14;
								verticesX[i_5] = i_8;
					}

					if (i_2 != 0) {
						i_6 = Trig.SINE[i_2];
						i_7 = Trig.COSINE[i_2];
						i_8 = i_7 * verticesY[i_5] - i_6 * verticesZ[i_5] + 16383 >> 14;
							verticesZ[i_5] = i_6 * verticesY[i_5] + i_7 * verticesZ[i_5] + 16383 >> 14;
									verticesY[i_5] = i_8;
					}

					if (i_3 != 0) {
						i_6 = Trig.SINE[i_3];
						i_7 = Trig.COSINE[i_3];
						i_8 = i_6 * verticesZ[i_5] + i_7 * verticesX[i_5] + 16383 >> 14;
								verticesZ[i_5] = i_7 * verticesZ[i_5] - i_6 * verticesX[i_5] + 16383 >> 14;
							verticesX[i_5] = i_8;
					}

					verticesX[i_5] += anInt8271;
					verticesY[i_5] += anInt8247;
					verticesZ[i_5] += anInt8232;
				}
			else if (i_1 == 3)
				for (i_5 = 0; i_5 < maxDepth; i_5++) {
					verticesX[i_5] -= anInt8271;
					verticesY[i_5] -= anInt8247;
					verticesZ[i_5] -= anInt8232;
					verticesX[i_5] = i_2 * verticesX[i_5] / 128;
					verticesY[i_5] = i_3 * verticesY[i_5] / 128;
					verticesZ[i_5] = i_4 * verticesZ[i_5] / 128;
					verticesX[i_5] += anInt8271;
					verticesY[i_5] += anInt8247;
					verticesZ[i_5] += anInt8232;
				}
			else {
				Class162 class162_10;
				Class145 class145_11;
				if (i_1 == 5) {
					for (i_5 = 0; i_5 < triangleCount; i_5++) {
						i_6 = (aByteArray8265[i_5] & 0xff) + i_2 * 8;
						if (i_6 < 0)
							i_6 = 0;
						else if (i_6 > 255)
							i_6 = 255;

						aByteArray8265[i_5] = (byte) i_6;
					}

					if (aClass143_8273 != null)
						aClass143_8273.anInterface14_1667 = null;

					if (aClass162Array8295 != null)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class162_10 = aClass162Array8295[i_5];
							class145_11 = aClass145Array8258[i_5];
							class145_11.anInt1714 = class145_11.anInt1714 & 0xffffff | 255 - (aByteArray8265[class162_10.anInt2023] & 0xff) << 24;
						}
				} else if (i_1 == 7) {
					for (i_5 = 0; i_5 < triangleCount; i_5++) {
						i_6 = colors[i_5] & 0xffff;
						i_7 = i_6 >> 10 & 0x3f;
					i_8 = i_6 >> 7 & 0x7;
							int i_9 = i_6 & 0x7f;
							i_7 = i_7 + i_2 & 0x3f;
							i_8 += i_3 / 4;
							if (i_8 < 0)
								i_8 = 0;
							else if (i_8 > 7)
								i_8 = 7;

							i_9 += i_4;
							if (i_9 < 0)
								i_9 = 0;
							else if (i_9 > 127)
								i_9 = 127;

							colors[i_5] = (short) (i_7 << 10 | i_8 << 7 | i_9);
					}

					if (aClass143_8273 != null)
						aClass143_8273.anInterface14_1667 = null;

					if (aClass162Array8295 != null)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class162_10 = aClass162Array8295[i_5];
							class145_11 = aClass145Array8258[i_5];
							class145_11.anInt1714 = class145_11.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_10.anInt2023] & 0xffff] & 0xffffff;
						}
				} else {
					Class145 class145_12;
					if (i_1 == 8)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class145_12 = aClass145Array8258[i_5];
							class145_12.anInt1709 += i_2;
							class145_12.anInt1713 += i_3;
						}
					else if (i_1 == 10)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class145_12 = aClass145Array8258[i_5];
							class145_12.anInt1710 = i_2 * class145_12.anInt1710 >> 7;
						class145_12.anInt1711 = i_3 * class145_12.anInt1711 >> 7;
						}
					else if (i_1 == 9)
						for (i_5 = 0; i_5 < anInt8294; i_5++) {
							class145_12 = aClass145Array8258[i_5];
							class145_12.anInt1712 = i_2 + class145_12.anInt1712 & 0x3fff;
						}
				}
			}
		}

	}

	@Override
	public void W(short s_1, short s_2) {
		ImageLoader interface22_3 = aGraphicalRenderer_Sub1_8239.textureCache;

		for (int i_4 = 0; i_4 < triangleCount; i_4++)
			if (aShortArray8269[i_4] == s_1)
				aShortArray8269[i_4] = s_2;

		byte b_13 = 0;
		byte b_5 = 0;
		if (s_1 != -1) {
			TextureDetails class169_6 = interface22_3.getTextureDetails(s_1 & 0xffff);
			b_13 = class169_6.shadowFactor;
			b_5 = class169_6.brightness;
		}

		byte b_11 = 0;
		byte b_7 = 0;
		if (s_2 != -1) {
			TextureDetails class169_8 = interface22_3.getTextureDetails(s_2 & 0xffff);
			b_11 = class169_8.shadowFactor;
			b_7 = class169_8.brightness;
			if (class169_8.textureSpeedU != 0 || class169_8.textureSpeedV != 0)
				aBool8246 = true;
		}

		if (b_13 != b_11 | b_5 != b_7) {
			if (aClass162Array8295 != null)
				for (int i_12 = 0; i_12 < anInt8294; i_12++) {
					Class162 class162_9 = aClass162Array8295[i_12];
					Class145 class145_10 = aClass145Array8258[i_12];
					class145_10.anInt1714 = class145_10.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_9.anInt2023] & 0xffff] & 0xffffff;
				}

			if (aClass143_8273 != null)
				aClass143_8273.anInterface14_1667 = null;
		}

	}

	@Override
	public void wa() {
		int i_1;
		for (i_1 = 0; i_1 < maxDepth; i_1++)
			verticesZ[i_1] = -verticesZ[i_1];

		for (i_1 = 0; i_1 < anInt8300; i_1++)
			aShortArray8261[i_1] = (short) (-aShortArray8261[i_1]);

		for (i_1 = 0; i_1 < triangleCount; i_1++) {
			short s_2 = aShortArray8266[i_1];
			aShortArray8266[i_1] = aShortArray8256[i_1];
			aShortArray8256[i_1] = s_2;
		}

		if (aClass143_8274 == null && aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

		if (aClass143_8274 != null)
			aClass143_8274.anInterface14_1667 = null;

		if (aClass143_8272 != null)
			aClass143_8272.anInterface14_1667 = null;

		if (aClass132_8276 != null)
			aClass132_8276.anInterface15_1595 = null;

		aBool8254 = false;
	}

	@Override
	public void X(short s_1, short s_2) {
		int i_3;
		for (i_3 = 0; i_3 < triangleCount; i_3++)
			if (colors[i_3] == s_1)
				colors[i_3] = s_2;

		if (aClass162Array8295 != null)
			for (i_3 = 0; i_3 < anInt8294; i_3++) {
				Class162 class162_4 = aClass162Array8295[i_3];
				Class145 class145_5 = aClass145Array8258[i_3];
				class145_5.anInt1714 = class145_5.anInt1714 & -16777216 | Class540.anIntArray7136[colors[class162_4.anInt2023] & 0xffff] & 0xffffff;
			}

		if (aClass143_8273 != null)
			aClass143_8273.anInterface14_1667 = null;

	}

	@Override
	public int ya() {
		if (!aBool8254)
			method13528();

		return aShort8286;
	}

	@Override
	public int YA() {
		if (!aBool8254)
			method13528();

		return aShort8283;
	}

	@Override
	public int Z() {
		return aShort8257;
	}

}
