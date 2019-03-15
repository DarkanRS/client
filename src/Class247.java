public class Class247 {

	static Interface22 anInterface22_3046;

	int anInt3053;

	int anInt3044;

	NativeSprite aClass160_3030;

	int anInt3052;

	int anInt3054;

	boolean aBool3042;

	Class247 aClass247_3051;

	int anInt3032 = -1;

	boolean aBool3045 = true;

	MeshRasterizer aClass528_3048;

	int anInt3034;

	int anInt3043;

	byte[] aByteArray3037;

	int anInt3036;

	int anInt3038;

	int anInt3039;

	int anInt3040;

	int anInt3031;

	Class334[] aClass334Array3049;

	Class204 aClass204_3050;

	Class334[] aClass334Array3035;

	Class334 aClass334_3033;

	int anInt3047;

	void method4206(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, boolean bool_11, int i_13, byte b_14) {
		int i_15 = 255 - i_13;
		if (this.aClass528_3048 == null) {
			graphicalrenderer_1.ba(2, 0);
			i_8 = i_8 + i_2 & 0x3fff;
			if (this.anInt3031 != -1 && this.anInt3034 != 0) {
				Class169 class169_16 = anInterface22_3046.method144(this.anInt3031, -1768391150);
				if (this.aClass160_3030 == null && anInterface22_3046.method139(this.anInt3031, -408857237)) {
					int[] ints_17 = class169_16.anInt2074 == 2 ? anInterface22_3046.method141(this.anInt3031, this.anInt3034, this.anInt3034, false, -1509054197) : anInterface22_3046.method140(this.anInt3031, 0.7F, this.anInt3034, this.anInt3034, false, (byte) 127);
					this.anInt3053 = ints_17[0];
					this.anInt3044 = ints_17[ints_17.length - 1];
					this.aClass160_3030 = graphicalrenderer_1.createNativeSprite(ints_17, this.anInt3034, this.anInt3034, this.anInt3034, 1367570399);
				}
				int i_22 = i_15 == 255 ? (class169_16.anInt2074 == 2 ? 1 : 0) : 1;
				if (i_22 == 1 && bool_11) {
					graphicalrenderer_1.B(i_3, i_4, i_5, i_6, i_10, 0);
				}
				if (this.aClass160_3030 != null) {
					int i_18 = i_7 * i_6 / -4096;
					int i_19;
					for (i_19 = i_8 * i_6 / 4096 + (i_5 - i_6) / 2; i_19 > i_6; i_19 -= i_6) {
						;
					}
					while (i_19 < 0) {
						i_19 += i_6;
					}
					int i_20;
					if (this.aClass204_3050 != Class204.aClass204_2578) {
						while (i_18 > i_6) {
							i_18 -= i_6;
						}
						while (i_18 < 0) {
							i_18 += i_6;
						}
						for (i_20 = i_19 - i_6; i_20 < i_5; i_20 += i_6) {
							for (int i_21 = i_18 - i_6; i_21 < i_6; i_21 += i_6) {
								this.aClass160_3030.method2754(i_3 + i_20, i_21 + i_4, i_6, i_6, 0, i_15 << 24 | 0xffffff, i_22);
							}
						}
					} else {
						for (i_20 = i_19 - i_6; i_20 < i_5; i_20 += i_6) {
							this.aClass160_3030.method2754(i_3 + i_20, i_18 + i_4, i_6, i_6, 0, i_15 << 24 | 0xffffff, i_22);
						}
						if ((this.anInt3053 & ~0xffffff) != 0) {
							graphicalrenderer_1.method8425(0, 0, i_5, i_18 + i_4 + 1, this.anInt3053, (byte) -82);
						}
						if ((this.anInt3044 & ~0xffffff) != 0) {
							graphicalrenderer_1.method8425(0, i_18 + i_4 + i_6, i_5, i_6 - (i_18 + i_4 + i_6), this.anInt3044, (byte) -94);
						}
					}
				}
			} else {
				graphicalrenderer_1.B(i_3, i_4, i_5, i_6, i_15 << 24 | i_10, 1);
			}
		} else if (false) {
			Matrix44Arr matrix44arr_24 = graphicalrenderer_1.method8453();
			Matrix44Arr matrix44arr_25 = graphicalrenderer_1.method8453();
			matrix44arr_24.buf[2] = matrix44arr_24.buf[3];
			matrix44arr_24.buf[6] = matrix44arr_24.buf[7];
			matrix44arr_24.buf[10] = matrix44arr_24.buf[11];
			matrix44arr_24.buf[14] = matrix44arr_24.buf[15];
			graphicalrenderer_1.method8424(matrix44arr_24);
			this.method4231(graphicalrenderer_1, i_7, i_8, i_9, i_13, 1009070761);
			graphicalrenderer_1.method8424(matrix44arr_25);
		} else {
			if (bool_11) {
				graphicalrenderer_1.ba(3, i_10);
			}
			this.method4231(graphicalrenderer_1, i_7, i_8, i_9, i_13, 1808967350);
		}
		for (int i_23 = this.anInt3043 - 1; i_23 >= 0; --i_23) {
			this.aClass334Array3035[i_23].method5955(graphicalrenderer_1, i_3, i_4, i_5, i_6, i_7, i_8, this.anInt3038, this.anInt3039, this.anInt3040, i_15);
		}
		graphicalrenderer_1.ba(2, 0);
	}

	public void method4207(int i_1, int i_2) {
		boolean bool_10000 = this.aBool3042;
		this.anInt3052 = (i_2 - this.anInt3054) * i_1 / 255 + this.anInt3054;
	}

	public void method4208(Class247 class247_1) {
		if (this.aBool3042) {
			this.anInt3054 = this.anInt3052;
		} else if (class247_1 != null && class247_1.aBool3042) {
			this.anInt3054 = 255 - class247_1.anInt3052;
		} else {
			this.anInt3054 = 0;
		}
		this.aBool3042 = true;
		this.aClass247_3051 = class247_1;
		this.anInt3052 = 0;
	}

	public void method4209() {
		this.aBool3042 = false;
		this.aClass247_3051 = null;
		this.anInt3052 = 0;
	}

	public boolean method4210() {
		return this.aBool3042;
	}

	public Class247 method4211() {
		return this.aClass247_3051;
	}

	public void method4214(GraphicalRenderer graphicalrenderer_1, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		this.method4215(graphicalrenderer_1, 0, i_3, i_4, i_5, i_6, i_7, i_8, 0, 0);
	}

	public void method4215(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
		int i_14 = 0;
		if (this.aBool3042) {
			i_14 = this.anInt3052;
		}
		if (this.aClass247_3051 != null) {
			Class247 class247_15 = this;
			Class247 class247_16 = this.aClass247_3051;
			if (this.hashCode() > class247_16.hashCode()) {
				class247_15 = this.aClass247_3051;
				class247_16 = this;
				i_14 = 255 - i_14;
			}
			class247_15.method4206(graphicalrenderer_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10, true, i_14, (byte) -85);
			class247_16.method4206(graphicalrenderer_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10, false, 255 - i_14, (byte) -6);
		} else {
			this.method4206(graphicalrenderer_1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10, true, i_14, (byte) -95);
		}
	}

	public boolean method4217(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		if (i_2 != this.anInt3032) {
			this.anInt3032 = i_2;
			int i_5 = Class51.method1072(i_2, 1659000710);
			if (i_5 > 512) {
				i_5 = 512;
			}
			if (i_5 <= 0) {
				i_5 = 1;
			}
			if (i_5 != this.anInt3034) {
				this.anInt3034 = i_5;
				this.aClass160_3030 = null;
			}
			if (this.aClass334Array3049 != null) {
				this.anInt3043 = 0;
				int[] ints_6 = new int[this.aClass334Array3049.length];
				for (int i_7 = 0; i_7 < this.aClass334Array3049.length; i_7++) {
					Class334 class334_8 = this.aClass334Array3049[i_7];
					if (class334_8.method5938(this.anInt3038, this.anInt3039, this.anInt3040, this.anInt3032)) {
						ints_6[this.anInt3043] = class334_8.anInt3897;
						this.aClass334Array3035[++this.anInt3043 - 1] = class334_8;
					}
				}
				Class51.method1074(ints_6, this.aClass334Array3035, 0, this.anInt3043 - 1, -377919121);
			}
			this.aBool3045 = true;
		}
		boolean bool_10 = false;
		if (this.aBool3045) {
			this.aBool3045 = false;
			for (int i_9 = this.anInt3043 - 1; i_9 >= 0; --i_9) {
				boolean bool_11 = this.aClass334Array3035[i_9].method5937(graphicalrenderer_1, this.aClass334_3033);
				this.aBool3045 |= !bool_11;
				bool_10 |= bool_11;
			}
		}
		if (i_3 != 0 && graphicalrenderer_1.method8404()) {
			if (this.aClass528_3048 == null && this.anInt3047 >= 0) {
				this.method4229(graphicalrenderer_1);
			}
		} else {
			this.aClass528_3048 = null;
		}
		if (this.aClass247_3051 != null && this != this.aClass247_3051) {
			this.aClass247_3051.method4209();
			bool_10 |= this.aClass247_3051.method4217(graphicalrenderer_1, i_2, i_3);
		}
		return bool_10;
	}

	void method4229(GraphicalRenderer graphicalrenderer_1) {
		try {
			boolean bool_3 = PaddedJS5Request.aClass317_10379.loadArchive(this.anInt3047);
			if (bool_3) {
				graphicalrenderer_1.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				RSMesh rsmesh_4 = RSMesh.decodeMesh(PaddedJS5Request.aClass317_10379, this.anInt3047);
				this.aClass528_3048 = graphicalrenderer_1.createMeshRasterizer(rsmesh_4, 1099776, 0, 255, 1);
				byte[] bytes_5 = this.aClass528_3048.aw();
				if (bytes_5 == null) {
					this.aByteArray3037 = null;
				} else {
					this.aByteArray3037 = new byte[bytes_5.length];
					System.arraycopy(bytes_5, 0, this.aByteArray3037, 0, bytes_5.length);
				}
			}
		} catch (Exception exception_7) {
			;
		}
	}

	void method4231(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		Matrix44Var matrix44var_7 = graphicalrenderer_1.method8458();
		Matrix44Var matrix44var_8 = new Matrix44Var();
		matrix44var_8.method5223(0.0F, 0.0F, 0.0F);
		matrix44var_8.method5220(0.0F, -1.0F, 0.0F, Class382.method6508(-i_3 & 0x3fff));
		matrix44var_8.method5220(-1.0F, 0.0F, 0.0F, Class382.method6508(-i_2 & 0x3fff));
		matrix44var_8.method5220(0.0F, 0.0F, -1.0F, Class382.method6508(-i_4 & 0x3fff));
		graphicalrenderer_1.method8457(matrix44var_8);
		Matrix44Var matrix44var_9 = new Matrix44Var();
		if (i_5 != this.anInt3036) {
			this.aClass528_3048.method11312((byte) i_5, this.aByteArray3037);
			this.anInt3036 = i_5;
		}
		this.aClass528_3048.method11282(matrix44var_9, (Class275_Sub5) null, 0);
		graphicalrenderer_1.method8457(matrix44var_7);
	}

	public Class247(int i_1, Class334[] arr_2, int i_3, int i_4, int i_5, int i_6, Class204 class204_7, int i_8) {
		this.anInt3038 = i_4;
		this.anInt3039 = i_5;
		this.anInt3040 = i_6;
		this.anInt3031 = i_1;
		this.aClass334Array3049 = arr_2;
		this.aClass204_3050 = class204_7;
		if (arr_2 != null) {
			this.aClass334Array3035 = new Class334[arr_2.length];
			this.aClass334_3033 = i_3 >= 0 ? arr_2[i_3] : null;
		} else {
			this.aClass334Array3035 = null;
			this.aClass334_3033 = null;
		}
		this.anInt3047 = i_8;
	}

	public static boolean method4248(int i_0, int i_1) {
		if (!Class20.aBool161) {
			return false;
		} else {
			int i_3 = i_0 >> 16;
			int i_4 = i_0 & 0xffff;
			if (Class468_Sub8.INTERFACES[i_3] != null && Class468_Sub8.INTERFACES[i_3].components[i_4] != null) {
				IComponentDefinitions icomponentdefinitions_5 = Class468_Sub8.INTERFACES[i_3].components[i_4];
				Class282_Sub50_Sub7 class282_sub50_sub7_6;
				if (i_1 == -1 && icomponentdefinitions_5.type == 0) {
					for (class282_sub50_sub7_6 = (Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 59); class282_sub50_sub7_6 != null; class282_sub50_sub7_6 = (Class282_Sub50_Sub7) Class20.aClass482_171.next(1787533982)) {
						if (class282_sub50_sub7_6.anInt9587 == 58 || class282_sub50_sub7_6.anInt9587 == 1007 || class282_sub50_sub7_6.anInt9587 == 25 || class282_sub50_sub7_6.anInt9587 == 57 || class282_sub50_sub7_6.anInt9587 == 30) {
							for (IComponentDefinitions icomponentdefinitions_7 = Class117.getInterfaceComponent(class282_sub50_sub7_6.anInt9582); icomponentdefinitions_7 != null; icomponentdefinitions_7 = Class96_Sub23.method14682(Class468_Sub8.INTERFACES[icomponentdefinitions_7.idHash >> 16], icomponentdefinitions_7)) {
								if (icomponentdefinitions_7.idHash == icomponentdefinitions_5.idHash) {
									return true;
								}
							}
						}
					}
				} else {
					for (class282_sub50_sub7_6 = (Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 31); class282_sub50_sub7_6 != null; class282_sub50_sub7_6 = (Class282_Sub50_Sub7) Class20.aClass482_171.next(2009173063)) {
						if (class282_sub50_sub7_6.anInt9581 == i_1 && icomponentdefinitions_5.idHash == class282_sub50_sub7_6.anInt9582 && (class282_sub50_sub7_6.anInt9587 == 58 || class282_sub50_sub7_6.anInt9587 == 1007 || class282_sub50_sub7_6.anInt9587 == 25 || class282_sub50_sub7_6.anInt9587 == 57 || class282_sub50_sub7_6.anInt9587 == 30)) {
							return true;
						}
					}
				}
				return false;
			} else {
				return false;
			}
		}
	}

	public static void method4250(byte b_0) {
		for (Class282_Sub37 class282_sub37_1 = (Class282_Sub37) Class492.aClass465_5774.method7750(-1139367366); class282_sub37_1 != null; class282_sub37_1 = (Class282_Sub37) Class492.aClass465_5774.method7751((byte) 8)) {
			Class92.method1563(class282_sub37_1.anInt7999);
		}
	}

	static void method4251() {
		Class192.ACCOUNT_CREATION_STAGE = Class1.REQUEST;
		Class96_Sub9.RECIEVED_RESPONSE = AccountCreationResponseOpcodes.aClass483_5729;
		Class237.aClass494_2916 = Class494.aClass494_5786;
		Class404.aClass466_4831 = Class466.aClass466_5569;
	}
}
