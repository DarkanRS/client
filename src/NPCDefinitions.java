public class NPCDefinitions {

	NPCIndexLoader aClass406_4855;

	public int anInt4856;

	public String[] aStringArray4882;

	public static short[] aShortArray4862 = new short[256];

	public int[] anIntArray4859;

	public byte aByte4916;

	public String aString4857 = "null";

	public int anInt4858 = 1;

	public int anInt4898 = -1;

	byte aByte4871 = 0;

	public int anInt4873 = -1;

	public int anInt4861 = -1;

	public int anInt4875 = -1;

	public int anInt4854 = -1;

	public int anInt4877 = -1;

	public boolean aBool4864 = true;

	public int anInt4879 = -1;

	int anInt4880 = 128;

	int anInt4881 = 128;

	public boolean aBool4904 = false;

	public boolean aBool4890 = false;

	public boolean aBool4884 = false;

	int anInt4885 = 0;

	int anInt4888 = 0;

	public int anInt4887 = -1;

	public int anInt4918 = -1;

	public int anInt4889 = 32;

	int anInt4891 = -1;

	int anInt4878 = -1;

	public boolean aBool4893 = true;

	public boolean aBool4894 = true;

	public boolean aBool4912 = true;

	public short aShort4874 = 0;

	public short aShort4897 = 0;

	public byte aByte4883 = -96;

	public byte aByte4899 = -16;

	public byte aByte4900 = 0;

	public int anInt4903 = -1;

	public int anInt4921 = -1;

	public int anInt4876 = -1;

	public int anInt4906 = -1;

	public int anInt4907 = 0;

	public int anInt4908 = 0;

	public int anInt4909 = 255;

	public int anInt4902 = -1;

	public NPCDirection aClass252_4910;

	public int anInt4914;

	public int anInt4917;

	public int anInt4911;

	public int anInt4919;

	public int anInt4913;

	public boolean aBool4920;

	short[] aShortArray4863;

	public short[] aShortArray4892;

	short[] aShortArray4866;

	public short[] aShortArray4867;

	byte[] aByteArray4865;

	public int[] anIntArray4860;

	public int[] anIntArray4886;

	int[][] anIntArrayArray4895;

	byte aByte4868;

	byte aByte4869;

	byte aByte4905;

	public int[] anIntArray4915;

	public boolean aBool4872;

	IterableNodeMap aClass465_4896;

	void method6874(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.method6896(rsbytebuffer_1, i_3);
		}
	}

	public final MeshRasterizer method6875(GraphicalRenderer graphicalrenderer_1, int i_2, RenderAnimIndexLoader renderanimindexloader_3, Interface42 interface42_4, Animation animation_5, Animation animation_6, Animation[] arr_7, int[] ints_8, int i_9, Class417 class417_10, int i_11) {
		return this.method6879(graphicalrenderer_1, i_2, renderanimindexloader_3, interface42_4, animation_5, animation_6, arr_7, ints_8, i_9, class417_10, this.anInt4898, true, 1493042037);
	}

	public int method6876(int i_1, int i_2, int i_3) {
		if (this.aClass465_4896 == null) {
			return i_2;
		} else {
			Class282_Sub38 class282_sub38_4 = (Class282_Sub38) this.aClass465_4896.get((long) i_1);
			return class282_sub38_4 == null ? i_2 : class282_sub38_4.anInt8002;
		}
	}

	void method6877() {
		if (this.anIntArray4859 == null) {
			this.anIntArray4859 = new int[0];
		}
		if (this.aByte4916 == -1) {
			if (this.aClass406_4855.aClass486_4844 == Game.darkan) {
				this.aByte4916 = 1;
			} else {
				this.aByte4916 = 0;
			}
		}
	}

	public final MeshRasterizer method6879(GraphicalRenderer graphicalrenderer_1, int i_2, RenderAnimIndexLoader renderanimindexloader_3, Interface42 interface42_4, Animation animation_5, Animation animation_6, Animation[] arr_7, int[] ints_8, int i_9, Class417 class417_10, int i_11, boolean bool_12, int i_13) {
		if (this.anIntArray4886 != null) {
			NPCDefinitions npcdefinitions_14 = this.method6884(interface42_4);
			return npcdefinitions_14 == null ? null : npcdefinitions_14.method6879(graphicalrenderer_1, i_2, renderanimindexloader_3, interface42_4, animation_5, animation_6, arr_7, ints_8, i_9, class417_10, i_11, bool_12, 1208445516);
		} else {
			int i_32 = i_2;
			if (this.anInt4881 != 128) {
				i_32 = i_2 | 0x2;
			}
			if (this.anInt4880 != 128) {
				i_32 |= 0x5;
			}
			boolean bool_15 = false;
			int i_16 = arr_7 != null ? arr_7.length : 0;
			for (int i_17 = 0; i_17 < i_16; i_17++) {
				if (arr_7[i_17] != null) {
					i_32 |= arr_7[i_17].method7640(-1824890003);
					bool_15 = true;
				}
			}
			if (animation_5 != null) {
				i_32 |= animation_5.method7640(-1277632431);
				bool_15 = true;
			}
			if (animation_6 != null) {
				i_32 |= animation_6.method7640(-1870377420);
				bool_15 = true;
			}
			long long_33 = (long) (this.anInt4856 | graphicalrenderer_1.rendererId << 16);
			if (class417_10 != null) {
				long_33 |= class417_10.aLong4993 << 24;
			}
			SoftCache softcache_20 = this.aClass406_4855.aClass229_4836;
			MeshRasterizer meshrasterizer_19;
			synchronized (this.aClass406_4855.aClass229_4836) {
				meshrasterizer_19 = (MeshRasterizer) this.aClass406_4855.aClass229_4836.get(long_33);
			}
			RenderAnimDefs renderanimdefs_45 = null;
			if (!bool_12 && i_11 != -1) {
				renderanimdefs_45 = renderanimindexloader_3.getRenderAnimDefs(i_11, (byte) 22);
			} else if (this.anInt4898 != -1) {
				renderanimdefs_45 = renderanimindexloader_3.getRenderAnimDefs(this.anInt4898, (byte) 85);
			}
			int i_25;
			if (meshrasterizer_19 == null || (meshrasterizer_19.m() & i_32) != i_32) {
				if (meshrasterizer_19 != null) {
					i_32 |= meshrasterizer_19.m();
				}
				int i_21 = i_32;
				if (this.aShortArray4863 != null) {
					i_21 = i_32 | 0x4000;
				}
				if (this.aShortArray4866 != null) {
					i_21 |= 0x8000;
				}
				if (this.aByte4871 != 0) {
					i_21 |= 0x80000;
				}
				int[] ints_22 = class417_10 != null && class417_10.anIntArray4992 != null ? class417_10.anIntArray4992 : this.anIntArray4859;
				boolean bool_23 = false;
				Index index_24 = this.aClass406_4855.aClass317_4842;
				synchronized (this.aClass406_4855.aClass317_4842) {
					i_25 = 0;
					while (true) {
						if (i_25 >= ints_22.length) {
							break;
						}
						if (ints_22[i_25] != -1 && !this.aClass406_4855.aClass317_4842.load(ints_22[i_25], 0)) {
							bool_23 = true;
						}
						++i_25;
					}
				}
				if (bool_23) {
					return null;
				}
				RSMesh[] arr_47 = new RSMesh[ints_22.length];
				for (i_25 = 0; i_25 < ints_22.length; i_25++) {
					if (ints_22[i_25] != -1) {
						Index index_26 = this.aClass406_4855.aClass317_4842;
						synchronized (this.aClass406_4855.aClass317_4842) {
							arr_47[i_25] = RSMesh.decodeMesh(this.aClass406_4855.aClass317_4842, ints_22[i_25]);
						}
						if (arr_47[i_25] != null) {
							if (arr_47[i_25].version < 13) {
								arr_47[i_25].upscale();
							}
							if (this.anIntArrayArray4895 != null && this.anIntArrayArray4895[i_25] != null) {
								arr_47[i_25].translate(this.anIntArrayArray4895[i_25][0], this.anIntArrayArray4895[i_25][1], this.anIntArrayArray4895[i_25][2]);
							}
						}
					}
				}
				int i_27;
				if (renderanimdefs_45 != null && renderanimdefs_45.anIntArrayArray2802 != null) {
					for (i_25 = 0; i_25 < renderanimdefs_45.anIntArrayArray2802.length; i_25++) {
						if (i_25 < arr_47.length && arr_47[i_25] != null) {
							int i_35 = 0;
							i_27 = 0;
							int i_28 = 0;
							int i_29 = 0;
							int i_30 = 0;
							int i_31 = 0;
							if (renderanimdefs_45.anIntArrayArray2802[i_25] != null) {
								i_35 = renderanimdefs_45.anIntArrayArray2802[i_25][0];
								i_27 = renderanimdefs_45.anIntArrayArray2802[i_25][1];
								i_28 = renderanimdefs_45.anIntArrayArray2802[i_25][2];
								i_29 = renderanimdefs_45.anIntArrayArray2802[i_25][3] << 3;
								i_30 = renderanimdefs_45.anIntArrayArray2802[i_25][4] << 3;
								i_31 = renderanimdefs_45.anIntArrayArray2802[i_25][5] << 3;
							}
							if (i_29 != 0 || i_30 != 0 || i_31 != 0) {
								arr_47[i_25].method2671(i_29, i_30, i_31);
							}
							if (i_35 != 0 || i_27 != 0 || i_28 != 0) {
								arr_47[i_25].translate(i_35, i_27, i_28);
							}
						}
					}
				}
				RSMesh rsmesh_36;
				if (arr_47.length == 1) {
					rsmesh_36 = arr_47[0];
				} else {
					rsmesh_36 = new RSMesh(arr_47, arr_47.length);
				}
				meshrasterizer_19 = graphicalrenderer_1.createMeshRasterizer(rsmesh_36, i_21, this.aClass406_4855.anInt4845, this.anInt4885 + 64, this.anInt4888 * 5 + 850);
				short[] shorts_48;
				if (this.aShortArray4863 != null) {
					if (class417_10 != null && class417_10.aShortArray4990 != null) {
						shorts_48 = class417_10.aShortArray4990;
					} else {
						shorts_48 = this.aShortArray4892;
					}
					for (i_27 = 0; i_27 < this.aShortArray4863.length; i_27++) {
						if (this.aByteArray4865 != null && i_27 < this.aByteArray4865.length) {
							meshrasterizer_19.X(this.aShortArray4863[i_27], aShortArray4862[this.aByteArray4865[i_27] & 0xff]);
						} else {
							meshrasterizer_19.X(this.aShortArray4863[i_27], shorts_48[i_27]);
						}
					}
				}
				if (this.aShortArray4866 != null) {
					if (class417_10 != null && class417_10.aShortArray4991 != null) {
						shorts_48 = class417_10.aShortArray4991;
					} else {
						shorts_48 = this.aShortArray4867;
					}
					for (i_27 = 0; i_27 < this.aShortArray4866.length; i_27++) {
						meshrasterizer_19.W(this.aShortArray4866[i_27], shorts_48[i_27]);
					}
				}
				if (this.aByte4871 != 0) {
					meshrasterizer_19.PA(this.aByte4868, this.aByte4869, this.aByte4905, this.aByte4871 & 0xff);
				}
				meshrasterizer_19.KA(i_32);
				SoftCache softcache_49 = this.aClass406_4855.aClass229_4836;
				synchronized (this.aClass406_4855.aClass229_4836) {
					this.aClass406_4855.aClass229_4836.put(meshrasterizer_19, long_33);
				}
			}
			MeshRasterizer meshrasterizer_37 = meshrasterizer_19.method11289((byte) 4, i_32, true);
			boolean bool_38 = false;
			if (ints_8 != null) {
				for (int i_46 = 0; i_46 < 12; i_46++) {
					if (ints_8[i_46] != -1) {
						bool_38 = true;
					}
				}
			}
			if (!bool_15 && !bool_38) {
				return meshrasterizer_37;
			} else {
				Matrix44Var[] arr_39 = null;
				if (renderanimdefs_45 != null) {
					arr_39 = renderanimdefs_45.method3811((byte) 81);
				}
				int i_40;
				if (bool_38 && arr_39 != null) {
					for (i_40 = 0; i_40 < 12; i_40++) {
						if (arr_39[i_40] != null) {
							meshrasterizer_37.method11298(arr_39[i_40], 1 << i_40, true);
						}
					}
				}
				i_40 = 0;
				for (i_25 = 1; i_40 < i_16; i_25 <<= 1) {
					if (arr_7[i_40] != null) {
						arr_7[i_40].method7578(meshrasterizer_37, i_25, 1091009708);
					}
					++i_40;
				}
				if (bool_38) {
					for (i_40 = 0; i_40 < 12; i_40++) {
						if (ints_8[i_40] != -1) {
							i_25 = ints_8[i_40] - i_9;
							i_25 &= 0x3fff;
							Matrix44Var matrix44var_50 = new Matrix44Var();
							matrix44var_50.method5217(0.0F, 1.0F, 0.0F, Class382.method6508(i_25));
							meshrasterizer_37.method11298(matrix44var_50, 1 << i_40, false);
						}
					}
				}
				if (bool_38 && arr_39 != null) {
					for (i_40 = 0; i_40 < 12; i_40++) {
						if (arr_39[i_40] != null) {
							meshrasterizer_37.method11298(arr_39[i_40], 1 << i_40, false);
						}
					}
				}
				if (animation_5 != null && animation_6 != null) {
					Class521_Sub1_Sub3_Sub1.method16078(meshrasterizer_37, animation_5, animation_6, 407704915);
				} else if (animation_5 != null) {
					animation_5.rasterize(meshrasterizer_37, 0);
				} else if (animation_6 != null) {
					animation_6.rasterize(meshrasterizer_37, 0);
				}
				if (this.anInt4880 != 128 || this.anInt4881 != 128) {
					meshrasterizer_37.oa(this.anInt4880, this.anInt4881, this.anInt4880);
				}
				meshrasterizer_37.KA(i_2);
				return meshrasterizer_37;
			}
		}
	}

	public final MeshRasterizer method6880(GraphicalRenderer graphicalrenderer_1, int i_2, Interface42 interface42_3, Animation animation_4, Class417 class417_5, int i_6) {
		if (this.anIntArray4886 != null) {
			NPCDefinitions npcdefinitions_7 = this.method6884(interface42_3);
			return npcdefinitions_7 == null ? null : npcdefinitions_7.method6880(graphicalrenderer_1, i_2, interface42_3, animation_4, class417_5, 1382303105);
		} else if (this.anIntArray4860 == null && (class417_5 == null || class417_5.anIntArray4992 == null)) {
			return null;
		} else {
			int i_18 = i_2;
			if (animation_4 != null) {
				i_18 = i_2 | animation_4.method7640(-1724515671);
			}
			long long_8 = (long) (this.anInt4856 | graphicalrenderer_1.rendererId << 16);
			if (class417_5 != null) {
				long_8 |= class417_5.aLong4993 << 24;
			}
			SoftCache softcache_11 = this.aClass406_4855.aClass229_4843;
			MeshRasterizer meshrasterizer_10;
			synchronized (this.aClass406_4855.aClass229_4843) {
				meshrasterizer_10 = (MeshRasterizer) this.aClass406_4855.aClass229_4843.get(long_8);
			}
			if (meshrasterizer_10 == null || (meshrasterizer_10.m() & i_18) != i_18) {
				if (meshrasterizer_10 != null) {
					i_18 |= meshrasterizer_10.m();
				}
				int i_19 = i_18;
				if (this.aShortArray4863 != null) {
					i_19 = i_18 | 0x4000;
				}
				if (this.aShortArray4866 != null) {
					i_19 |= 0x8000;
				}
				if (this.aByte4871 != 0) {
					i_19 |= 0x80000;
				}
				int[] ints_12 = class417_5 != null && class417_5.anIntArray4992 != null ? class417_5.anIntArray4992 : this.anIntArray4860;
				boolean bool_13 = false;
				Index index_14 = this.aClass406_4855.aClass317_4842;
				int i_15;
				synchronized (this.aClass406_4855.aClass317_4842) {
					i_15 = 0;
					while (true) {
						if (i_15 >= ints_12.length) {
							break;
						}
						if (!this.aClass406_4855.aClass317_4842.load(ints_12[i_15], 0)) {
							bool_13 = true;
						}
						++i_15;
					}
				}
				if (bool_13) {
					return null;
				}
				RSMesh[] arr_26 = new RSMesh[ints_12.length];
				Index index_20 = this.aClass406_4855.aClass317_4842;
				synchronized (this.aClass406_4855.aClass317_4842) {
					for (int i_16 = 0; i_16 < ints_12.length; i_16++) {
						arr_26[i_16] = RSMesh.decodeMesh(this.aClass406_4855.aClass317_4842, ints_12[i_16]);
					}
				}
				for (i_15 = 0; i_15 < ints_12.length; i_15++) {
					if (arr_26[i_15] != null && arr_26[i_15].version < 13) {
						arr_26[i_15].upscale();
					}
				}
				RSMesh rsmesh_27;
				if (arr_26.length == 1) {
					rsmesh_27 = arr_26[0];
				} else {
					rsmesh_27 = new RSMesh(arr_26, arr_26.length);
				}
				meshrasterizer_10 = graphicalrenderer_1.createMeshRasterizer(rsmesh_27, i_19, this.aClass406_4855.anInt4845, 64, 768);
				int i_17;
				short[] shorts_21;
				if (this.aShortArray4863 != null) {
					if (class417_5 != null && class417_5.aShortArray4990 != null) {
						shorts_21 = class417_5.aShortArray4990;
					} else {
						shorts_21 = this.aShortArray4892;
					}
					for (i_17 = 0; i_17 < this.aShortArray4863.length; i_17++) {
						if (this.aByteArray4865 != null && i_17 < this.aByteArray4865.length) {
							meshrasterizer_10.X(this.aShortArray4863[i_17], aShortArray4862[this.aByteArray4865[i_17] & 0xff]);
						} else {
							meshrasterizer_10.X(this.aShortArray4863[i_17], shorts_21[i_17]);
						}
					}
				}
				if (this.aShortArray4866 != null) {
					if (class417_5 != null && class417_5.aShortArray4991 != null) {
						shorts_21 = class417_5.aShortArray4991;
					} else {
						shorts_21 = this.aShortArray4867;
					}
					for (i_17 = 0; i_17 < this.aShortArray4866.length; i_17++) {
						meshrasterizer_10.W(this.aShortArray4866[i_17], shorts_21[i_17]);
					}
				}
				if (this.aByte4871 != 0) {
					meshrasterizer_10.PA(this.aByte4868, this.aByte4869, this.aByte4905, this.aByte4871 & 0xff);
				}
				meshrasterizer_10.KA(i_18);
				SoftCache softcache_28 = this.aClass406_4855.aClass229_4843;
				synchronized (this.aClass406_4855.aClass229_4843) {
					this.aClass406_4855.aClass229_4843.put(meshrasterizer_10, long_8);
				}
			}
			if (animation_4 != null) {
				meshrasterizer_10 = meshrasterizer_10.method11289((byte) 1, i_18, true);
				animation_4.rasterize(meshrasterizer_10, 0);
			}
			meshrasterizer_10.KA(i_2);
			return meshrasterizer_10;
		}
	}

	public final boolean method6881() {
		if (this.anIntArray4859 == null) {
			return true;
		} else {
			boolean bool_2 = true;
			int[] ints_3 = this.anIntArray4859;
			for (int i_4 = 0; i_4 < ints_3.length; i_4++) {
				int i_5 = ints_3[i_4];
				if (!this.aClass406_4855.aClass317_4842.load(i_5, 0)) {
					bool_2 = false;
				}
			}
			return bool_2;
		}
	}

	public String method6882(int i_1, String string_2) {
		if (this.aClass465_4896 == null) {
			return string_2;
		} else {
			Class282_Sub47 class282_sub47_4 = (Class282_Sub47) this.aClass465_4896.get((long) i_1);
			return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
		}
	}

	public final NPCDefinitions method6884(Interface42 interface42_1) {
		int i_3 = -1;
		if (this.anInt4891 != -1) {
			i_3 = interface42_1.method241(this.anInt4891, -578283448);
		} else if (this.anInt4878 != -1) {
			i_3 = interface42_1.method240(this.anInt4878, 817995491);
		}
		if (i_3 >= 0 && i_3 < this.anIntArray4886.length - 1 && this.anIntArray4886[i_3] != -1) {
			return this.aClass406_4855.getNPCDefinitions(this.anIntArray4886[i_3], (byte) 43);
		} else {
			int i_4 = this.anIntArray4886[this.anIntArray4886.length - 1];
			return i_4 != -1 ? this.aClass406_4855.getNPCDefinitions(i_4, (byte) -44) : null;
		}
	}

	public boolean method6885(Interface42 interface42_1) {
		if (this.anIntArray4886 == null) {
			return true;
		} else {
			int i_3 = -1;
			if (this.anInt4891 != -1) {
				i_3 = interface42_1.method241(this.anInt4891, -2139197647);
			} else if (this.anInt4878 != -1) {
				i_3 = interface42_1.method240(this.anInt4878, -332269014);
			}
			if (i_3 >= 0 && i_3 < this.anIntArray4886.length - 1 && this.anIntArray4886[i_3] != -1) {
				return true;
			} else {
				int i_4 = this.anIntArray4886[this.anIntArray4886.length - 1];
				return i_4 != -1;
			}
		}
	}

	public boolean method6886(int i_1) {
		if (this.anIntArray4886 == null) {
			return this.anInt4903 != -1 || this.anInt4876 != -1 || this.anInt4906 != -1;
		} else {
			for (int i_2 = 0; i_2 < this.anIntArray4886.length; i_2++) {
				if (this.anIntArray4886[i_2] != -1) {
					NPCDefinitions npcdefinitions_3 = this.aClass406_4855.getNPCDefinitions(this.anIntArray4886[i_2], (byte) -70);
					if (npcdefinitions_3.anInt4903 != -1 || npcdefinitions_3.anInt4876 != -1 || npcdefinitions_3.anInt4906 != -1) {
						return true;
					}
				}
			}
			return false;
		}
	}

	NPCDefinitions() {
		this.aClass252_4910 = NPCDirection.SOUTH;
		this.anInt4914 = -1;
		this.aByte4916 = -1;
		this.anInt4917 = -1;
		this.anInt4911 = 256;
		this.anInt4919 = 256;
		this.anInt4913 = 0;
		this.aBool4920 = true;
	}

	void method6896(RsByteBuffer rsbytebuffer_1, int i_2) {
		int i_4;
		int i_5;
		if (i_2 == 1) {
			i_4 = rsbytebuffer_1.readUnsignedByte();
			this.anIntArray4859 = new int[i_4];
			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.anIntArray4859[i_5] = rsbytebuffer_1.readBigSmart();
			}
		} else if (i_2 == 2) {
			this.aString4857 = rsbytebuffer_1.readString();
		} else if (i_2 == 12) {
			this.anInt4858 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 >= 30 && i_2 < 35) {
			this.aStringArray4882[i_2 - 30] = rsbytebuffer_1.readString();
		} else if (i_2 == 40) {
			i_4 = rsbytebuffer_1.readUnsignedByte();
			this.aShortArray4863 = new short[i_4];
			this.aShortArray4892 = new short[i_4];
			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.aShortArray4863[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
				this.aShortArray4892[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
			}
		} else if (i_2 == 41) {
			i_4 = rsbytebuffer_1.readUnsignedByte();
			this.aShortArray4866 = new short[i_4];
			this.aShortArray4867 = new short[i_4];
			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.aShortArray4866[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
				this.aShortArray4867[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
			}
		} else if (i_2 == 42) {
			i_4 = rsbytebuffer_1.readUnsignedByte();
			this.aByteArray4865 = new byte[i_4];
			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.aByteArray4865[i_5] = rsbytebuffer_1.readByte();
			}
		} else if (i_2 == 60) {
			i_4 = rsbytebuffer_1.readUnsignedByte();
			this.anIntArray4860 = new int[i_4];
			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.anIntArray4860[i_5] = rsbytebuffer_1.readBigSmart();
			}
		} else if (i_2 == 93) {
			this.aBool4864 = false;
		} else if (i_2 == 95) {
			this.anInt4879 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 97) {
			this.anInt4880 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 98) {
			this.anInt4881 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 99) {
			this.aBool4904 = true;
		} else if (i_2 == 100) {
			this.anInt4885 = rsbytebuffer_1.readByte();
		} else if (i_2 == 101) {
			this.anInt4888 = rsbytebuffer_1.readByte();
		} else if (i_2 == 102) {
			this.anInt4887 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 103) {
			this.anInt4889 = rsbytebuffer_1.readUnsignedShort();
		} else {
			int i_6;
			if (i_2 != 106 && i_2 != 118) {
				if (i_2 == 107) {
					this.aBool4893 = false;
				} else if (i_2 == 109) {
					this.aBool4894 = false;
				} else if (i_2 == 111) {
					this.aBool4912 = false;
				} else if (i_2 == 113) {
					this.aShort4874 = (short) rsbytebuffer_1.readUnsignedShort();
					this.aShort4897 = (short) rsbytebuffer_1.readUnsignedShort();
				} else if (i_2 == 114) {
					this.aByte4883 = rsbytebuffer_1.readByte();
					this.aByte4899 = rsbytebuffer_1.readByte();
				} else if (i_2 == 119) {
					this.aByte4900 = rsbytebuffer_1.readByte();
				} else if (i_2 == 121) {
					this.anIntArrayArray4895 = new int[this.anIntArray4859.length][];
					i_4 = rsbytebuffer_1.readUnsignedByte();
					for (i_5 = 0; i_5 < i_4; i_5++) {
						i_6 = rsbytebuffer_1.readUnsignedByte();
						int[] ints_7 = this.anIntArrayArray4895[i_6] = new int[3];
						ints_7[0] = rsbytebuffer_1.readByte();
						ints_7[1] = rsbytebuffer_1.readByte();
						ints_7[2] = rsbytebuffer_1.readByte();
					}
				} else if (i_2 == 123) {
					this.anInt4902 = rsbytebuffer_1.readUnsignedShort();
				} else if (i_2 == 125) {
					this.aClass252_4910 = (NPCDirection) Class386.identify(Class46.getDirections(), rsbytebuffer_1.readByte());
				} else if (i_2 == 127) {
					this.anInt4898 = rsbytebuffer_1.readUnsignedShort();
				} else if (i_2 == 128) {
					Class386.identify(Class8_Sub3.method14339(), rsbytebuffer_1.readUnsignedByte());
				} else if (i_2 == 134) {
					this.anInt4903 = rsbytebuffer_1.readUnsignedShort();
					if (this.anInt4903 == 65535) {
						this.anInt4903 = -1;
					}
					this.anInt4921 = rsbytebuffer_1.readUnsignedShort();
					if (this.anInt4921 == 65535) {
						this.anInt4921 = -1;
					}
					this.anInt4876 = rsbytebuffer_1.readUnsignedShort();
					if (this.anInt4876 == 65535) {
						this.anInt4876 = -1;
					}
					this.anInt4906 = rsbytebuffer_1.readUnsignedShort();
					if (this.anInt4906 == 65535) {
						this.anInt4906 = -1;
					}
					this.anInt4907 = rsbytebuffer_1.readUnsignedByte();
				} else if (i_2 == 135) {
					this.anInt4875 = rsbytebuffer_1.readUnsignedByte();
					this.anInt4873 = rsbytebuffer_1.readUnsignedShort();
				} else if (i_2 == 136) {
					this.anInt4854 = rsbytebuffer_1.readUnsignedByte();
					this.anInt4861 = rsbytebuffer_1.readUnsignedShort();
				} else if (i_2 == 137) {
					this.anInt4877 = rsbytebuffer_1.readUnsignedShort();
				} else if (i_2 == 138) {
					this.anInt4918 = rsbytebuffer_1.readBigSmart();
				} else if (i_2 == 140) {
					this.anInt4909 = rsbytebuffer_1.readUnsignedByte();
				} else if (i_2 == 141) {
					this.aBool4884 = true;
				} else if (i_2 == 142) {
					this.anInt4914 = rsbytebuffer_1.readUnsignedShort();
				} else if (i_2 == 143) {
					this.aBool4890 = true;
				} else if (i_2 >= 150 && i_2 < 155) {
					this.aStringArray4882[i_2 - 150] = rsbytebuffer_1.readString();
					if (!this.aClass406_4855.aBool4838) {
						this.aStringArray4882[i_2 - 150] = null;
					}
				} else if (i_2 == 155) {
					this.aByte4868 = rsbytebuffer_1.readByte();
					this.aByte4869 = rsbytebuffer_1.readByte();
					this.aByte4905 = rsbytebuffer_1.readByte();
					this.aByte4871 = rsbytebuffer_1.readByte();
				} else if (i_2 == 158) {
					this.aByte4916 = 1;
				} else if (i_2 == 159) {
					this.aByte4916 = 0;
				} else if (i_2 == 160) {
					i_4 = rsbytebuffer_1.readUnsignedByte();
					this.anIntArray4915 = new int[i_4];
					for (i_5 = 0; i_5 < i_4; i_5++) {
						this.anIntArray4915[i_5] = rsbytebuffer_1.readUnsignedShort();
					}
				} else if (i_2 == 162) {
					this.aBool4872 = true;
				} else if (i_2 == 163) {
					this.anInt4917 = rsbytebuffer_1.readUnsignedByte();
				} else if (i_2 == 164) {
					this.anInt4911 = rsbytebuffer_1.readUnsignedShort();
					this.anInt4919 = rsbytebuffer_1.readUnsignedShort();
				} else if (i_2 == 165) {
					this.anInt4913 = rsbytebuffer_1.readUnsignedByte();
				} else if (i_2 == 168) {
					this.anInt4908 = rsbytebuffer_1.readUnsignedByte();
				} else if (i_2 == 169) {
					this.aBool4920 = false;
				} else if (i_2 == 249) {
					i_4 = rsbytebuffer_1.readUnsignedByte();
					if (this.aClass465_4896 == null) {
						i_5 = Texture.nextPowerOfTwo(i_4, -597233692);
						this.aClass465_4896 = new IterableNodeMap(i_5);
					}
					for (i_5 = 0; i_5 < i_4; i_5++) {
						boolean bool_10 = rsbytebuffer_1.readUnsignedByte() == 1;
						int i_9 = rsbytebuffer_1.read24BitUnsignedInteger();
						Object obj_8;
						if (bool_10) {
							obj_8 = new Class282_Sub47(rsbytebuffer_1.readString());
						} else {
							obj_8 = new Class282_Sub38(rsbytebuffer_1.readInt());
						}
						this.aClass465_4896.put((Node) obj_8, (long) i_9);
					}
				}
			} else {
				this.anInt4891 = rsbytebuffer_1.readUnsignedShort();
				if (this.anInt4891 == 65535) {
					this.anInt4891 = -1;
				}
				this.anInt4878 = rsbytebuffer_1.readUnsignedShort();
				if (this.anInt4878 == 65535) {
					this.anInt4878 = -1;
				}
				i_4 = -1;
				if (i_2 == 118) {
					i_4 = rsbytebuffer_1.readUnsignedShort();
					if (i_4 == 65535) {
						i_4 = -1;
					}
				}
				i_5 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray4886 = new int[i_5 + 2];
				for (i_6 = 0; i_6 <= i_5; i_6++) {
					this.anIntArray4886[i_6] = rsbytebuffer_1.readUnsignedShort();
					if (this.anIntArray4886[i_6] == 65535) {
						this.anIntArray4886[i_6] = -1;
					}
				}
				this.anIntArray4886[i_5 + 1] = i_4;
			}
		}
	}

	static void method6907() {
		IndexLoaders.MAP_REGION_DECODER.method4444(1050660585);
		Class58.method1139(-2058483007);
		Class356.method6227(true, (byte) -37);
		Class247.method4250((byte) -91);
		System.gc();
		Renderers.SOFTWARE_RENDERER.ba(2, 0);
	}
}
