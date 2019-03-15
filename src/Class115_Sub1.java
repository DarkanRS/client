import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class115_Sub1 extends Class115 {

	static float[] aFloatArray9288 = new float[16];
	boolean aBool9284;
	float[][] aFloatArrayArray9283;
	boolean[] aBoolArray9285;
	byte[] aByteArray9289;
	byte[] aByteArray9290;
	long aLong9286;
	long aLong9287;
	Class505_Sub2_Sub2 aClass505_Sub2_Sub2_9293;
	Class101_Sub2 aClass101_Sub2_9294;

	void method1912(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2) {
		int i_3 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 122) != Class111.aClass111_1219 && class282_sub21_sub1_1.method15457((byte) 35) != Class111.aClass111_1182) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_3 >= 0) {
				i_3 *= 4;
				this.aFloatArrayArray9283[0][i_3] = f_2;
				this.aBoolArray9285[0] = true;
			}

			if (i_4 >= 0) {
				i_4 *= 4;
				this.aFloatArrayArray9283[1][i_4] = f_2;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	Class115_Sub1(Class505_Sub2_Sub2 class505_sub2_sub2_1, Class99 class99_2) {
		this.aBool9284 = false;
		this.aFloatArrayArray9283 = new float[2][];
		this.aBoolArray9285 = new boolean[2];
		this.aString1245 = class99_2.aString1003;
		if (class99_2.aString1001 != null) {
			this.aString1244 = class99_2.aString1001;
			this.aByteArray9289 = class505_sub2_sub2_1.method15651(this.aString1244);
		}

		if (class99_2.aString1002 != null) {
			this.aString1246 = class99_2.aString1002;
			this.aByteArray9290 = class505_sub2_sub2_1.method15651(this.aString1246);
		}

		class505_sub2_sub2_1.method13901(this);
	}

	public boolean method1898() {
		if (this.aBool9284) {
			return true;
		} else {
			this.aLong9286 = this.aByteArray9289 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass505_Sub2_Sub2_9293.aLong10252, this.aByteArray9289);
			this.aLong9287 = this.aByteArray9290 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass505_Sub2_Sub2_9293.aLong10252, this.aByteArray9290);
			if (this.aLong9286 == 0L && this.aLong9287 == 0L) {
				return false;
			} else {
				int i_1 = -1;

				int i_2;
				for (i_2 = 0; i_2 < this.aClass101_Sub2_9294.method1650(300449281); i_2++) {
					if (this.aClass101_Sub2_9294.method1652(i_2, (byte) 108) == this) {
						i_1 = i_2;
						break;
					}
				}

				i_2 = this.aClass101_Sub2_9294.method1682(1481602803);
				int i_3 = this.aClass101_Sub2_9294.method1679(1445130884);

				int i_4;
				Class282_Sub21_Sub1 class282_sub21_sub1_12;
				for (i_4 = 0; i_4 < i_2; i_4++) {
					class282_sub21_sub1_12 = this.aClass101_Sub2_9294.method1742(i_4, -41887126);
					class282_sub21_sub1_12.method15471(i_1);
				}

				for (i_4 = 0; i_4 < i_3; i_4++) {
					class282_sub21_sub1_12 = this.aClass101_Sub2_9294.method1705(i_4, 289833629);
					class282_sub21_sub1_12.method15471(i_1);
				}

				i_4 = 0;
				int i_5 = 0;
				int i_6 = this.aClass101_Sub2_9294.method1653(this, (byte) -15);

				for (int i_7 = 0; i_7 < i_2 + i_3; i_7++) {
					Class282_Sub21_Sub1_Sub1 class282_sub21_sub1_sub1_8 = (Class282_Sub21_Sub1_Sub1) (i_7 < i_2 ? this.aClass101_Sub2_9294.method1742(i_7, -1079014826) : this.aClass101_Sub2_9294.method1705(i_7 - i_2, 2108244742));
					Class111 class111_9 = class282_sub21_sub1_sub1_8.method15457((byte) 40);
					int i_10 = 1;
					if (class111_9 == Class111.aClass111_1109) {
						class111_9 = class282_sub21_sub1_sub1_8.method15458((byte) -103);
						i_10 = class282_sub21_sub1_sub1_8.method15459();
					}

					switch (class111_9.anInt1232 * 1002380705 * -278657439) {
					case 5:
					case 26:
					case 49:
					case 64:
						i_10 *= 3;
					case 8:
					case 10:
					case 54:
					case 95:
						break;
					case 16:
					case 17:
					case 56:
					case 75:
						i_10 *= 4;
						break;
					case 34:
					case 41:
					case 80:
					case 94:
						i_10 *= 2;
						break;
					default:
						i_10 = 0;
					}

					int i_11;
					if (class282_sub21_sub1_sub1_8.anIntArray10306[i_6] >= 0) {
						i_11 = class282_sub21_sub1_sub1_8.anIntArray10306[i_6] + i_10;
						if (i_4 < i_11) {
							i_4 = i_11;
						}
					}

					if (class282_sub21_sub1_sub1_8.anIntArray10307[i_6] >= 0) {
						i_11 = class282_sub21_sub1_sub1_8.anIntArray10307[i_6] + i_10;
						if (i_5 < i_11) {
							i_5 = i_11;
						}
					}
				}

				this.aFloatArrayArray9283[0] = new float[i_4 * 4];
				this.aFloatArrayArray9283[1] = new float[i_5 * 4];
				this.aBool9284 = true;
				return true;
			}
		}
	}

	void method1894(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2) {
		int i_3 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 28) != Class111.aClass111_1219 && class282_sub21_sub1_1.method15457((byte) 56) != Class111.aClass111_1182) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_3 >= 0) {
				i_3 *= 4;
				this.aFloatArrayArray9283[0][i_3] = f_2;
				this.aBoolArray9285[0] = true;
			}

			if (i_4 >= 0) {
				i_4 *= 4;
				this.aFloatArrayArray9283[1][i_4] = f_2;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1923(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3) {
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_5 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 32) != Class111.aClass111_1132) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_4 >= 0) {
				i_4 *= 4;
				this.aFloatArrayArray9283[0][i_4 + 0] = f_2;
				this.aFloatArrayArray9283[0][i_4 + 1] = f_3;
				this.aBoolArray9285[0] = true;
			}

			if (i_5 >= 0) {
				i_5 *= 4;
				this.aFloatArrayArray9283[1][i_5 + 0] = f_2;
				this.aFloatArrayArray9283[1][i_5 + 1] = f_3;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1908(int i_1, int i_2, Interface30 interface30_3) {
		this.aClass505_Sub2_Sub2_9293.method14163(i_2);
		this.aClass505_Sub2_Sub2_9293.method14035(interface30_3);
	}

	void method1942(int i_1, Matrix44Arr matrix44arr_2) {
		int i_3 = i_1 >> 16;
		int i_4 = (i_1 & 0xffff) * 4;
		System.arraycopy(matrix44arr_2.method6589(aFloatArray9288), 0, this.aFloatArrayArray9283[i_3], i_4, 8);
		this.aBoolArray9285[i_3] = true;
	}

	void method1936(Class282_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		int i_3 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 115) != Class111.aClass111_1168) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_3 >= 0) {
				this.method14589(i_3, matrix44arr_2.method6589(aFloatArray9288), 8);
			}

			if (i_4 >= 0) {
				this.method14590(i_4, matrix44arr_2.method6589(aFloatArray9288), 8);
			}

		}
	}

	void method1891(Class282_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		int i_3 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 27) != Class111.aClass111_1150) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_3 >= 0) {
				this.method14589(i_3, matrix44arr_2.method6545(aFloatArray9288), 16);
			}

			if (i_4 >= 0) {
				this.method14590(i_4, matrix44arr_2.method6545(aFloatArray9288), 16);
			}

		}
	}

	void method1948(int i_1, int i_2, Interface30 interface30_3) {
		this.aClass505_Sub2_Sub2_9293.method14163(i_2);
		this.aClass505_Sub2_Sub2_9293.method14035(interface30_3);
	}

	void method1893(int i_1, float f_2, float f_3, float f_4) {
		int i_5 = i_1 >> 16;
		int i_6 = (i_1 & 0xffff) * 4;
		this.aFloatArrayArray9283[i_5][i_6] = f_2;
		this.aFloatArrayArray9283[i_5][i_6 + 1] = f_3;
		this.aFloatArrayArray9283[i_5][i_6 + 2] = f_4;
		this.aBoolArray9285[i_5] = true;
	}

	void method1895(int i_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = i_1 >> 16;
		int i_7 = (i_1 & 0xffff) * 4;
		this.aFloatArrayArray9283[i_6][i_7] = f_2;
		this.aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
		this.aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
		this.aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
		this.aBoolArray9285[i_6] = true;
	}

	void method1905(int i_1, Matrix44Arr matrix44arr_2) {
		int i_3 = i_1 >> 16;
		int i_4 = (i_1 & 0xffff) * 4;
		System.arraycopy(matrix44arr_2.method6545(aFloatArray9288), 0, this.aFloatArrayArray9283[i_3], i_4, 12);
		this.aBoolArray9285[i_3] = true;
	}

	void method1906(int i_1, Matrix44Arr matrix44arr_2) {
		int i_3 = i_1 >> 16;
		int i_4 = (i_1 & 0xffff) * 4;
		System.arraycopy(matrix44arr_2.method6589(aFloatArray9288), 0, this.aFloatArrayArray9283[i_3], i_4, 8);
		this.aBoolArray9285[i_3] = true;
	}

	void method1900(int i_1, Matrix44Arr matrix44arr_2) {
		int i_3 = i_1 >> 16;
		int i_4 = (i_1 & 0xffff) * 4;
		System.arraycopy(matrix44arr_2.method6545(aFloatArray9288), 0, this.aFloatArrayArray9283[i_3], i_4, 16);
		this.aBoolArray9285[i_3] = true;
	}

	void method1904(int i_1, float[] floats_2, int i_3) {
		int i_4 = i_1 >> 16;
		int i_5 = (i_1 & 0xffff) * 4;
		System.arraycopy(floats_2, 0, this.aFloatArrayArray9283[i_4], i_5, i_3);
		this.aBoolArray9285[i_4] = true;
	}

	final void method14589(int i_1, float[] floats_2, int i_3) {
		Class503.method8356(floats_2, 0, this.aFloatArrayArray9283[0], i_1 * 4, i_3);
		this.aBoolArray9285[0] = true;
	}

	final void method14590(int i_1, float[] floats_2, int i_3) {
		Class503.method8356(floats_2, 0, this.aFloatArrayArray9283[1], i_1 * 4, i_3);
		this.aBoolArray9285[1] = true;
	}

	void method1933(int i_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = i_1 >> 16;
		int i_7 = (i_1 & 0xffff) * 4;
		this.aFloatArrayArray9283[i_6][i_7] = f_2;
		this.aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
		this.aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
		this.aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
		this.aBoolArray9285[i_6] = true;
	}

	void method14591() {
		int i_1;
		if (this.aBoolArray9285[0]) {
			for (i_1 = 0; i_1 < this.aFloatArrayArray9283[0].length; i_1++) {
				this.aClass505_Sub2_Sub2_9293.anUnsafe8830.putFloat(this.aClass505_Sub2_Sub2_9293.aLong8695 + (long) (i_1 * 4), this.aFloatArrayArray9283[0][i_1]);
			}

			IDirect3DDevice.SetVertexShaderConstantF(this.aClass505_Sub2_Sub2_9293.aLong10252, 0, this.aClass505_Sub2_Sub2_9293.aLong8695, this.aFloatArrayArray9283[0].length / 4);
			this.aBoolArray9285[0] = false;
		}

		if (this.aBoolArray9285[1]) {
			for (i_1 = 0; i_1 < this.aFloatArrayArray9283[1].length; i_1++) {
				this.aClass505_Sub2_Sub2_9293.anUnsafe8830.putFloat(this.aClass505_Sub2_Sub2_9293.aLong8695 + (long) (i_1 * 4), this.aFloatArrayArray9283[1][i_1]);
			}

			IDirect3DDevice.SetPixelShaderConstantF(this.aClass505_Sub2_Sub2_9293.aLong10252, 0, this.aClass505_Sub2_Sub2_9293.aLong8695, this.aFloatArrayArray9283[1].length / 4);
			this.aBoolArray9285[1] = false;
		}

	}

	public void method26() {
		if (this.aLong9286 != 0L) {
			IUnknown.Release(this.aLong9286);
			this.aLong9286 = 0L;
		}

		if (this.aLong9287 != 0L) {
			IUnknown.Release(this.aLong9287);
			this.aLong9287 = 0L;
		}

		this.aClass505_Sub2_Sub2_9293.method13885(this);
	}

	void method14592() {
		if (this.aLong9286 != 0L) {
			this.aClass505_Sub2_Sub2_9293.method15650(this.aLong9286);
			this.aLong9286 = 0L;
		}

		if (this.aLong9287 != 0L) {
			this.aClass505_Sub2_Sub2_9293.method15650(this.aLong9287);
			this.aLong9287 = 0L;
		}

	}

	public void finalize() {
		this.method14592();
	}

	void method1903(Class282_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_5 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 38) != Class111.aClass111_1109) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_4 >= 0) {
				this.method14589(i_4, floats_2, i_3);
			}

			if (i_5 >= 0) {
				this.method14590(i_5, floats_2, i_3);
			}

		}
	}

	public void method32() {
		if (this.aLong9286 != 0L) {
			IUnknown.Release(this.aLong9286);
			this.aLong9286 = 0L;
		}

		if (this.aLong9287 != 0L) {
			IUnknown.Release(this.aLong9287);
			this.aLong9287 = 0L;
		}

		this.aClass505_Sub2_Sub2_9293.method13885(this);
	}

	public boolean method1911() {
		if (this.aBool9284) {
			return true;
		} else {
			this.aLong9286 = this.aByteArray9289 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass505_Sub2_Sub2_9293.aLong10252, this.aByteArray9289);
			this.aLong9287 = this.aByteArray9290 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass505_Sub2_Sub2_9293.aLong10252, this.aByteArray9290);
			if (this.aLong9286 == 0L && this.aLong9287 == 0L) {
				return false;
			} else {
				int i_1 = -1;

				int i_2;
				for (i_2 = 0; i_2 < this.aClass101_Sub2_9294.method1650(1390005853); i_2++) {
					if (this.aClass101_Sub2_9294.method1652(i_2, (byte) 56) == this) {
						i_1 = i_2;
						break;
					}
				}

				i_2 = this.aClass101_Sub2_9294.method1682(705004134);
				int i_3 = this.aClass101_Sub2_9294.method1679(-2110230326);

				int i_4;
				Class282_Sub21_Sub1 class282_sub21_sub1_12;
				for (i_4 = 0; i_4 < i_2; i_4++) {
					class282_sub21_sub1_12 = this.aClass101_Sub2_9294.method1742(i_4, -1925781962);
					class282_sub21_sub1_12.method15471(i_1);
				}

				for (i_4 = 0; i_4 < i_3; i_4++) {
					class282_sub21_sub1_12 = this.aClass101_Sub2_9294.method1705(i_4, 284619700);
					class282_sub21_sub1_12.method15471(i_1);
				}

				i_4 = 0;
				int i_5 = 0;
				int i_6 = this.aClass101_Sub2_9294.method1653(this, (byte) -48);

				for (int i_7 = 0; i_7 < i_2 + i_3; i_7++) {
					Class282_Sub21_Sub1_Sub1 class282_sub21_sub1_sub1_8 = (Class282_Sub21_Sub1_Sub1) (i_7 < i_2 ? this.aClass101_Sub2_9294.method1742(i_7, -381245659) : this.aClass101_Sub2_9294.method1705(i_7 - i_2, -206996520));
					Class111 class111_9 = class282_sub21_sub1_sub1_8.method15457((byte) 20);
					int i_10 = 1;
					if (class111_9 == Class111.aClass111_1109) {
						class111_9 = class282_sub21_sub1_sub1_8.method15458((byte) -41);
						i_10 = class282_sub21_sub1_sub1_8.method15459();
					}

					switch (class111_9.anInt1232 * 1002380705 * -278657439) {
					case 5:
					case 26:
					case 49:
					case 64:
						i_10 *= 3;
					case 8:
					case 10:
					case 54:
					case 95:
						break;
					case 16:
					case 17:
					case 56:
					case 75:
						i_10 *= 4;
						break;
					case 34:
					case 41:
					case 80:
					case 94:
						i_10 *= 2;
						break;
					default:
						i_10 = 0;
					}

					int i_11;
					if (class282_sub21_sub1_sub1_8.anIntArray10306[i_6] >= 0) {
						i_11 = class282_sub21_sub1_sub1_8.anIntArray10306[i_6] + i_10;
						if (i_4 < i_11) {
							i_4 = i_11;
						}
					}

					if (class282_sub21_sub1_sub1_8.anIntArray10307[i_6] >= 0) {
						i_11 = class282_sub21_sub1_sub1_8.anIntArray10307[i_6] + i_10;
						if (i_5 < i_11) {
							i_5 = i_11;
						}
					}
				}

				this.aFloatArrayArray9283[0] = new float[i_4 * 4];
				this.aFloatArrayArray9283[1] = new float[i_5 * 4];
				this.aBool9284 = true;
				return true;
			}
		}
	}

	Class115_Sub1(Class505_Sub2_Sub2 class505_sub2_sub2_1, Class101_Sub2 class101_sub2_2, Class99 class99_3) {
		this(class505_sub2_sub2_1, class99_3);
		this.aClass505_Sub2_Sub2_9293 = class505_sub2_sub2_1;
		this.aClass101_Sub2_9294 = class101_sub2_2;
	}

	void method1897(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_7 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 45) != Class111.aClass111_1134) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_6 >= 0) {
				i_6 *= 4;
				this.aFloatArrayArray9283[0][i_6 + 0] = f_2;
				this.aFloatArrayArray9283[0][i_6 + 1] = f_3;
				this.aFloatArrayArray9283[0][i_6 + 2] = f_4;
				this.aFloatArrayArray9283[0][i_6 + 3] = f_5;
				this.aBoolArray9285[0] = true;
			}

			if (i_7 >= 0) {
				i_7 *= 4;
				this.aFloatArrayArray9283[1][i_7 + 0] = f_2;
				this.aFloatArrayArray9283[1][i_7 + 1] = f_3;
				this.aFloatArrayArray9283[1][i_7 + 2] = f_4;
				this.aFloatArrayArray9283[1][i_7 + 3] = f_5;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1928(Class282_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 interface30_3) {
		this.aClass505_Sub2_Sub2_9293.method14163(i_2);
		this.aClass505_Sub2_Sub2_9293.method14035(interface30_3);
	}

	void method1939(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_6 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 19) != Class111.aClass111_1133) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_5 >= 0) {
				i_5 *= 4;
				this.aFloatArrayArray9283[0][i_5 + 0] = f_2;
				this.aFloatArrayArray9283[0][i_5 + 1] = f_3;
				this.aFloatArrayArray9283[0][i_5 + 2] = f_4;
				this.aBoolArray9285[0] = true;
			}

			if (i_6 >= 0) {
				i_6 *= 4;
				this.aFloatArrayArray9283[1][i_6 + 0] = f_2;
				this.aFloatArrayArray9283[1][i_6 + 1] = f_3;
				this.aFloatArrayArray9283[1][i_6 + 2] = f_4;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1917(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_7 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 56) != Class111.aClass111_1134) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_6 >= 0) {
				i_6 *= 4;
				this.aFloatArrayArray9283[0][i_6 + 0] = f_2;
				this.aFloatArrayArray9283[0][i_6 + 1] = f_3;
				this.aFloatArrayArray9283[0][i_6 + 2] = f_4;
				this.aFloatArrayArray9283[0][i_6 + 3] = f_5;
				this.aBoolArray9285[0] = true;
			}

			if (i_7 >= 0) {
				i_7 *= 4;
				this.aFloatArrayArray9283[1][i_7 + 0] = f_2;
				this.aFloatArrayArray9283[1][i_7 + 1] = f_3;
				this.aFloatArrayArray9283[1][i_7 + 2] = f_4;
				this.aFloatArrayArray9283[1][i_7 + 3] = f_5;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1901(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_7 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 111) != Class111.aClass111_1134) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_6 >= 0) {
				i_6 *= 4;
				this.aFloatArrayArray9283[0][i_6 + 0] = f_2;
				this.aFloatArrayArray9283[0][i_6 + 1] = f_3;
				this.aFloatArrayArray9283[0][i_6 + 2] = f_4;
				this.aFloatArrayArray9283[0][i_6 + 3] = f_5;
				this.aBoolArray9285[0] = true;
			}

			if (i_7 >= 0) {
				i_7 *= 4;
				this.aFloatArrayArray9283[1][i_7 + 0] = f_2;
				this.aFloatArrayArray9283[1][i_7 + 1] = f_3;
				this.aFloatArrayArray9283[1][i_7 + 2] = f_4;
				this.aFloatArrayArray9283[1][i_7 + 3] = f_5;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1920(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_7 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 116) != Class111.aClass111_1134) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_6 >= 0) {
				i_6 *= 4;
				this.aFloatArrayArray9283[0][i_6 + 0] = f_2;
				this.aFloatArrayArray9283[0][i_6 + 1] = f_3;
				this.aFloatArrayArray9283[0][i_6 + 2] = f_4;
				this.aFloatArrayArray9283[0][i_6 + 3] = f_5;
				this.aBoolArray9285[0] = true;
			}

			if (i_7 >= 0) {
				i_7 *= 4;
				this.aFloatArrayArray9283[1][i_7 + 0] = f_2;
				this.aFloatArrayArray9283[1][i_7 + 1] = f_3;
				this.aFloatArrayArray9283[1][i_7 + 2] = f_4;
				this.aFloatArrayArray9283[1][i_7 + 3] = f_5;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1925(Class282_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		int i_3 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 127) != Class111.aClass111_1168) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_3 >= 0) {
				this.method14589(i_3, matrix44arr_2.method6589(aFloatArray9288), 8);
			}

			if (i_4 >= 0) {
				this.method14590(i_4, matrix44arr_2.method6589(aFloatArray9288), 8);
			}

		}
	}

	void method1919(Class282_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_5 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 45) != Class111.aClass111_1109) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_4 >= 0) {
				this.method14589(i_4, floats_2, i_3);
			}

			if (i_5 >= 0) {
				this.method14590(i_5, floats_2, i_3);
			}

		}
	}

	void method1944(Class282_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_5 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 125) != Class111.aClass111_1109) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_4 >= 0) {
				this.method14589(i_4, floats_2, i_3);
			}

			if (i_5 >= 0) {
				this.method14590(i_5, floats_2, i_3);
			}

		}
	}

	void method1930(Class282_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 interface30_3) {
		this.aClass505_Sub2_Sub2_9293.method14163(i_2);
		this.aClass505_Sub2_Sub2_9293.method14035(interface30_3);
	}

	void method1918(Class282_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_5 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 48) != Class111.aClass111_1109) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_4 >= 0) {
				this.method14589(i_4, floats_2, i_3);
			}

			if (i_5 >= 0) {
				this.method14590(i_5, floats_2, i_3);
			}

		}
	}

	void method1924(Class282_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		int i_3 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 110) != Class111.aClass111_1168) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_3 >= 0) {
				this.method14589(i_3, matrix44arr_2.method6589(aFloatArray9288), 8);
			}

			if (i_4 >= 0) {
				this.method14590(i_4, matrix44arr_2.method6589(aFloatArray9288), 8);
			}

		}
	}

	void method1921(Class282_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_5 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 21) != Class111.aClass111_1109) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_4 >= 0) {
				this.method14589(i_4, floats_2, i_3);
			}

			if (i_5 >= 0) {
				this.method14590(i_5, floats_2, i_3);
			}

		}
	}

	void method1926(Class282_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		int i_3 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 69) != Class111.aClass111_1150) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_3 >= 0) {
				this.method14589(i_3, matrix44arr_2.method6545(aFloatArray9288), 16);
			}

			if (i_4 >= 0) {
				this.method14590(i_4, matrix44arr_2.method6545(aFloatArray9288), 16);
			}

		}
	}

	void method1927(Class282_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		int i_3 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 44) != Class111.aClass111_1150) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_3 >= 0) {
				this.method14589(i_3, matrix44arr_2.method6545(aFloatArray9288), 16);
			}

			if (i_4 >= 0) {
				this.method14590(i_4, matrix44arr_2.method6545(aFloatArray9288), 16);
			}

		}
	}

	void method1910(int i_1, Matrix44Arr matrix44arr_2) {
		int i_3 = i_1 >> 16;
		int i_4 = (i_1 & 0xffff) * 4;
		System.arraycopy(matrix44arr_2.method6545(aFloatArray9288), 0, this.aFloatArrayArray9283[i_3], i_4, 16);
		this.aBoolArray9285[i_3] = true;
	}

	void method1929(Class282_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 interface30_3) {
		this.aClass505_Sub2_Sub2_9293.method14163(i_2);
		this.aClass505_Sub2_Sub2_9293.method14035(interface30_3);
	}

	void method1922(int i_1, Matrix44Arr matrix44arr_2) {
		int i_3 = i_1 >> 16;
		int i_4 = (i_1 & 0xffff) * 4;
		System.arraycopy(matrix44arr_2.method6545(aFloatArray9288), 0, this.aFloatArrayArray9283[i_3], i_4, 12);
		this.aBoolArray9285[i_3] = true;
	}

	void method1931(int i_1, float f_2, float f_3, float f_4) {
		int i_5 = i_1 >> 16;
		int i_6 = (i_1 & 0xffff) * 4;
		this.aFloatArrayArray9283[i_5][i_6] = f_2;
		this.aFloatArrayArray9283[i_5][i_6 + 1] = f_3;
		this.aFloatArrayArray9283[i_5][i_6 + 2] = f_4;
		this.aBoolArray9285[i_5] = true;
	}

	void method1932(int i_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = i_1 >> 16;
		int i_7 = (i_1 & 0xffff) * 4;
		this.aFloatArrayArray9283[i_6][i_7] = f_2;
		this.aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
		this.aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
		this.aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
		this.aBoolArray9285[i_6] = true;
	}

	void method1935(int i_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = i_1 >> 16;
		int i_7 = (i_1 & 0xffff) * 4;
		this.aFloatArrayArray9283[i_6][i_7] = f_2;
		this.aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
		this.aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
		this.aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
		this.aBoolArray9285[i_6] = true;
	}

	void method1934(int i_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = i_1 >> 16;
		int i_7 = (i_1 & 0xffff) * 4;
		this.aFloatArrayArray9283[i_6][i_7] = f_2;
		this.aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
		this.aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
		this.aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
		this.aBoolArray9285[i_6] = true;
	}

	void method1914(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_6 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 57) != Class111.aClass111_1133) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_5 >= 0) {
				i_5 *= 4;
				this.aFloatArrayArray9283[0][i_5 + 0] = f_2;
				this.aFloatArrayArray9283[0][i_5 + 1] = f_3;
				this.aFloatArrayArray9283[0][i_5 + 2] = f_4;
				this.aBoolArray9285[0] = true;
			}

			if (i_6 >= 0) {
				i_6 *= 4;
				this.aFloatArrayArray9283[1][i_6 + 0] = f_2;
				this.aFloatArrayArray9283[1][i_6 + 1] = f_3;
				this.aFloatArrayArray9283[1][i_6 + 2] = f_4;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1907(int i_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = i_1 >> 16;
		int i_7 = (i_1 & 0xffff) * 4;
		this.aFloatArrayArray9283[i_6][i_7] = f_2;
		this.aFloatArrayArray9283[i_6][i_7 + 1] = f_3;
		this.aFloatArrayArray9283[i_6][i_7 + 2] = f_4;
		this.aFloatArrayArray9283[i_6][i_7 + 3] = f_5;
		this.aBoolArray9285[i_6] = true;
	}

	void method1937(int i_1, float[] floats_2, int i_3) {
		int i_4 = i_1 >> 16;
		int i_5 = (i_1 & 0xffff) * 4;
		System.arraycopy(floats_2, 0, this.aFloatArrayArray9283[i_4], i_5, i_3);
		this.aBoolArray9285[i_4] = true;
	}

	void method1938(int i_1, float[] floats_2, int i_3) {
		int i_4 = i_1 >> 16;
		int i_5 = (i_1 & 0xffff) * 4;
		System.arraycopy(floats_2, 0, this.aFloatArrayArray9283[i_4], i_5, i_3);
		this.aBoolArray9285[i_4] = true;
	}

	void method1915(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_6 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 44) != Class111.aClass111_1133) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_5 >= 0) {
				i_5 *= 4;
				this.aFloatArrayArray9283[0][i_5 + 0] = f_2;
				this.aFloatArrayArray9283[0][i_5 + 1] = f_3;
				this.aFloatArrayArray9283[0][i_5 + 2] = f_4;
				this.aBoolArray9285[0] = true;
			}

			if (i_6 >= 0) {
				i_6 *= 4;
				this.aFloatArrayArray9283[1][i_6 + 0] = f_2;
				this.aFloatArrayArray9283[1][i_6 + 1] = f_3;
				this.aFloatArrayArray9283[1][i_6 + 2] = f_4;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1940(int i_1, Matrix44Arr matrix44arr_2) {
		int i_3 = i_1 >> 16;
		int i_4 = (i_1 & 0xffff) * 4;
		System.arraycopy(matrix44arr_2.method6545(aFloatArray9288), 0, this.aFloatArrayArray9283[i_3], i_4, 12);
		this.aBoolArray9285[i_3] = true;
	}

	void method1913(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3) {
		int i_4 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_5 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 40) != Class111.aClass111_1132) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_4 >= 0) {
				i_4 *= 4;
				this.aFloatArrayArray9283[0][i_4 + 0] = f_2;
				this.aFloatArrayArray9283[0][i_4 + 1] = f_3;
				this.aBoolArray9285[0] = true;
			}

			if (i_5 >= 0) {
				i_5 *= 4;
				this.aFloatArrayArray9283[1][i_5 + 0] = f_2;
				this.aFloatArrayArray9283[1][i_5 + 1] = f_3;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1943(int i_1, Matrix44Arr matrix44arr_2) {
		int i_3 = i_1 >> 16;
		int i_4 = (i_1 & 0xffff) * 4;
		System.arraycopy(matrix44arr_2.method6545(aFloatArray9288), 0, this.aFloatArrayArray9283[i_3], i_4, 16);
		this.aBoolArray9285[i_3] = true;
	}

	void method1902(int i_1, Matrix44Arr matrix44arr_2) {
		int i_3 = i_1 >> 16;
		int i_4 = (i_1 & 0xffff) * 4;
		System.arraycopy(matrix44arr_2.method6545(aFloatArray9288), 0, this.aFloatArrayArray9283[i_3], i_4, 12);
		this.aBoolArray9285[i_3] = true;
	}

	void method1947(int i_1, int i_2, Interface30 interface30_3) {
		this.aClass505_Sub2_Sub2_9293.method14163(i_2);
		this.aClass505_Sub2_Sub2_9293.method14035(interface30_3);
	}

	void method1945(int i_1, int i_2, Interface30 interface30_3) {
		this.aClass505_Sub2_Sub2_9293.method14163(i_2);
		this.aClass505_Sub2_Sub2_9293.method14035(interface30_3);
	}

	void method1946(int i_1, int i_2, Interface30 interface30_3) {
		this.aClass505_Sub2_Sub2_9293.method14163(i_2);
		this.aClass505_Sub2_Sub2_9293.method14035(interface30_3);
	}

	public boolean method1899() {
		if (this.aBool9284) {
			return true;
		} else {
			this.aLong9286 = this.aByteArray9289 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass505_Sub2_Sub2_9293.aLong10252, this.aByteArray9289);
			this.aLong9287 = this.aByteArray9290 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass505_Sub2_Sub2_9293.aLong10252, this.aByteArray9290);
			if (this.aLong9286 == 0L && this.aLong9287 == 0L) {
				return false;
			} else {
				int i_1 = -1;

				int i_2;
				for (i_2 = 0; i_2 < this.aClass101_Sub2_9294.method1650(-184991496); i_2++) {
					if (this.aClass101_Sub2_9294.method1652(i_2, (byte) 38) == this) {
						i_1 = i_2;
						break;
					}
				}

				i_2 = this.aClass101_Sub2_9294.method1682(-428364287);
				int i_3 = this.aClass101_Sub2_9294.method1679(56139267);

				int i_4;
				Class282_Sub21_Sub1 class282_sub21_sub1_12;
				for (i_4 = 0; i_4 < i_2; i_4++) {
					class282_sub21_sub1_12 = this.aClass101_Sub2_9294.method1742(i_4, 689990162);
					class282_sub21_sub1_12.method15471(i_1);
				}

				for (i_4 = 0; i_4 < i_3; i_4++) {
					class282_sub21_sub1_12 = this.aClass101_Sub2_9294.method1705(i_4, 1150500722);
					class282_sub21_sub1_12.method15471(i_1);
				}

				i_4 = 0;
				int i_5 = 0;
				int i_6 = this.aClass101_Sub2_9294.method1653(this, (byte) -120);

				for (int i_7 = 0; i_7 < i_2 + i_3; i_7++) {
					Class282_Sub21_Sub1_Sub1 class282_sub21_sub1_sub1_8 = (Class282_Sub21_Sub1_Sub1) (i_7 < i_2 ? this.aClass101_Sub2_9294.method1742(i_7, -1199561098) : this.aClass101_Sub2_9294.method1705(i_7 - i_2, 529548747));
					Class111 class111_9 = class282_sub21_sub1_sub1_8.method15457((byte) 26);
					int i_10 = 1;
					if (class111_9 == Class111.aClass111_1109) {
						class111_9 = class282_sub21_sub1_sub1_8.method15458((byte) -56);
						i_10 = class282_sub21_sub1_sub1_8.method15459();
					}

					switch (class111_9.anInt1232) {
					case 5:
					case 26:
					case 49:
					case 64:
						i_10 *= 3;
					case 8:
					case 10:
					case 54:
					case 95:
						break;
					case 16:
					case 17:
					case 56:
					case 75:
						i_10 *= 4;
						break;
					case 34:
					case 41:
					case 80:
					case 94:
						i_10 *= 2;
						break;
					default:
						i_10 = 0;
					}

					int i_11;
					if (class282_sub21_sub1_sub1_8.anIntArray10306[i_6] >= 0) {
						i_11 = i_10 + class282_sub21_sub1_sub1_8.anIntArray10306[i_6];
						if (i_4 < i_11) {
							i_4 = i_11;
						}
					}

					if (class282_sub21_sub1_sub1_8.anIntArray10307[i_6] >= 0) {
						i_11 = i_10 + class282_sub21_sub1_sub1_8.anIntArray10307[i_6];
						if (i_5 < i_11) {
							i_5 = i_11;
						}
					}
				}

				this.aFloatArrayArray9283[0] = new float[i_4 * 4];
				this.aFloatArrayArray9283[1] = new float[i_5 * 4];
				this.aBool9284 = true;
				return true;
			}
		}
	}

	void method1916(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_6 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 46) != Class111.aClass111_1133) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_5 >= 0) {
				i_5 *= 4;
				this.aFloatArrayArray9283[0][i_5 + 0] = f_2;
				this.aFloatArrayArray9283[0][i_5 + 1] = f_3;
				this.aFloatArrayArray9283[0][i_5 + 2] = f_4;
				this.aBoolArray9285[0] = true;
			}

			if (i_6 >= 0) {
				i_6 *= 4;
				this.aFloatArrayArray9283[1][i_6 + 0] = f_2;
				this.aFloatArrayArray9283[1][i_6 + 1] = f_3;
				this.aFloatArrayArray9283[1][i_6 + 2] = f_4;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1941(Class282_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15782();
		int i_7 = ((Class282_Sub21_Sub1_Sub1) class282_sub21_sub1_1).method15783();
		if (class282_sub21_sub1_1.method15457((byte) 60) != Class111.aClass111_1134) {
			throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
		} else {
			if (i_6 >= 0) {
				i_6 *= 4;
				this.aFloatArrayArray9283[0][i_6 + 0] = f_2;
				this.aFloatArrayArray9283[0][i_6 + 1] = f_3;
				this.aFloatArrayArray9283[0][i_6 + 2] = f_4;
				this.aFloatArrayArray9283[0][i_6 + 3] = f_5;
				this.aBoolArray9285[0] = true;
			}

			if (i_7 >= 0) {
				i_7 *= 4;
				this.aFloatArrayArray9283[1][i_7 + 0] = f_2;
				this.aFloatArrayArray9283[1][i_7 + 1] = f_3;
				this.aFloatArrayArray9283[1][i_7 + 2] = f_4;
				this.aFloatArrayArray9283[1][i_7 + 3] = f_5;
				this.aBoolArray9285[1] = true;
			}

		}
	}

	void method1896(Class282_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 interface30_3) {
		this.aClass505_Sub2_Sub2_9293.method14163(i_2);
		this.aClass505_Sub2_Sub2_9293.method14035(interface30_3);
	}

}
