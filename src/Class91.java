public class Class91 {

	public int anInt956;
	public int anInt959;
	public int anInt957;
	public int anInt954;
	public int anInt958;
	public int anInt953;
	public int[] anIntArray955;
	public byte[] aByteArray960;
	public byte[] aByteArray961;

	public static Class91[] method1514(Index index_0, int i_1, int i_2) {
		byte[] bytes_3 = index_0.getFile(i_1, i_2);
		return bytes_3 == null ? null : method1517(bytes_3);
	}

	public static Class91 method1515(Index index_0, int i_1) {
		byte[] bytes_2 = index_0.getFile(i_1);
		return bytes_2 == null ? null : method1517(bytes_2)[0];
	}

	public static Class91[] method1517(byte[] bytes_0) {
		RsByteBuffer rsbytebuffer_1 = new RsByteBuffer(bytes_0);
		rsbytebuffer_1.index = bytes_0.length - 2;
		int i_2 = rsbytebuffer_1.readUnsignedShort();
		Class91[] arr_3 = new Class91[i_2];

		int i_4;
		for (i_4 = 0; i_4 < i_2; i_4++) {
			arr_3[i_4] = new Class91();
		}

		rsbytebuffer_1.index = bytes_0.length - 7 - i_2 * 8;
		i_4 = rsbytebuffer_1.readUnsignedShort();
		int i_5 = rsbytebuffer_1.readUnsignedShort();
		int i_6 = (rsbytebuffer_1.readUnsignedByte() & 0xff) + 1;

		int i_7;
		for (i_7 = 0; i_7 < i_2; i_7++) {
			arr_3[i_7].anInt956 = rsbytebuffer_1.readUnsignedShort();
		}

		for (i_7 = 0; i_7 < i_2; i_7++) {
			arr_3[i_7].anInt959 = rsbytebuffer_1.readUnsignedShort();
		}

		for (i_7 = 0; i_7 < i_2; i_7++) {
			arr_3[i_7].anInt957 = rsbytebuffer_1.readUnsignedShort();
		}

		for (i_7 = 0; i_7 < i_2; i_7++) {
			arr_3[i_7].anInt954 = rsbytebuffer_1.readUnsignedShort();
		}

		for (i_7 = 0; i_7 < i_2; i_7++) {
			Class91 class91_17 = arr_3[i_7];
			class91_17.anInt958 = i_4 - class91_17.anInt957 - class91_17.anInt956;
			class91_17.anInt953 = i_5 - class91_17.anInt954 - class91_17.anInt959;
		}

		rsbytebuffer_1.index = bytes_0.length - 7 - i_2 * 8 - (i_6 - 1) * 3;
		int[] ints_16 = new int[i_6];

		int i_8;
		for (i_8 = 1; i_8 < i_6; i_8++) {
			ints_16[i_8] = rsbytebuffer_1.read24BitUnsignedInteger();
			if (ints_16[i_8] == 0) {
				ints_16[i_8] = 1;
			}
		}

		for (i_8 = 0; i_8 < i_2; i_8++) {
			arr_3[i_8].anIntArray955 = ints_16;
		}

		rsbytebuffer_1.index = 0;

		for (i_8 = 0; i_8 < i_2; i_8++) {
			Class91 class91_9 = arr_3[i_8];
			int i_10 = class91_9.anInt957 * class91_9.anInt954;
			class91_9.aByteArray960 = new byte[i_10];
			int i_11 = rsbytebuffer_1.readUnsignedByte();
			int i_13;
			if ((i_11 & 0x2) == 0) {
				int i_18;
				if ((i_11 & 0x1) == 0) {
					for (i_18 = 0; i_18 < i_10; i_18++) {
						class91_9.aByteArray960[i_18] = rsbytebuffer_1.readByte();
					}
				} else {
					for (i_18 = 0; i_18 < class91_9.anInt957; i_18++) {
						for (i_13 = 0; i_13 < class91_9.anInt954; i_13++) {
							class91_9.aByteArray960[i_18 + i_13 * class91_9.anInt957] = rsbytebuffer_1.readByte();
						}
					}
				}
			} else {
				boolean bool_12 = false;
				class91_9.aByteArray961 = new byte[i_10];
				if ((i_11 & 0x1) == 0) {
					for (i_13 = 0; i_13 < i_10; i_13++) {
						class91_9.aByteArray960[i_13] = rsbytebuffer_1.readByte();
					}

					for (i_13 = 0; i_13 < i_10; i_13++) {
						byte b_14 = class91_9.aByteArray961[i_13] = rsbytebuffer_1.readByte();
						bool_12 |= b_14 != -1;
					}
				} else {
					int i_19;
					for (i_13 = 0; i_13 < class91_9.anInt957; i_13++) {
						for (i_19 = 0; i_19 < class91_9.anInt954; i_19++) {
							class91_9.aByteArray960[i_13 + i_19 * class91_9.anInt957] = rsbytebuffer_1.readByte();
						}
					}

					for (i_13 = 0; i_13 < class91_9.anInt957; i_13++) {
						for (i_19 = 0; i_19 < class91_9.anInt954; i_19++) {
							byte b_15 = class91_9.aByteArray961[i_13 + i_19 * class91_9.anInt957] = rsbytebuffer_1.readByte();
							bool_12 |= b_15 != -1;
						}
					}
				}

				if (!bool_12) {
					class91_9.aByteArray961 = null;
				}
			}
		}

		return arr_3;
	}

	public int method1519() {
		return this.anInt957 + this.anInt956 + this.anInt958;
	}

	public int method1520() {
		return this.anInt954 + this.anInt959 + this.anInt953;
	}

	public static Class91 method1522(Index index_0, int i_1, int i_2) {
		byte[] bytes_3 = index_0.getFile(i_1, i_2);
		return bytes_3 == null ? null : method1517(bytes_3)[0];
	}

	public void method1523() {
		int i_1 = this.method1519();
		int i_2 = this.method1520();
		if (i_1 != this.anInt957 || i_2 != this.anInt954) {
			byte[] bytes_3 = new byte[i_1 * i_2];
			int i_5;
			int i_6;
			int i_7;
			if (this.aByteArray961 != null) {
				byte[] bytes_4 = new byte[i_1 * i_2];
				i_5 = 0;

				while (true) {
					if (i_5 >= this.anInt954) {
						this.aByteArray961 = bytes_4;
						break;
					}

					i_6 = i_5 * this.anInt957;
					i_7 = i_1 * (i_5 + this.anInt959) + this.anInt956;

					for (int i_8 = 0; i_8 < this.anInt957; i_8++) {
						bytes_3[i_7] = this.aByteArray960[i_6];
						bytes_4[i_7++] = this.aByteArray961[i_6++];
					}

					++i_5;
				}
			} else {
				for (int i_9 = 0; i_9 < this.anInt954; i_9++) {
					i_5 = i_9 * this.anInt957;
					i_6 = i_1 * (i_9 + this.anInt959) + this.anInt956;

					for (i_7 = 0; i_7 < this.anInt957; i_7++) {
						bytes_3[i_6++] = this.aByteArray960[i_5++];
					}
				}
			}

			this.anInt953 = 0;
			this.anInt959 = 0;
			this.anInt958 = 0;
			this.anInt956 = 0;
			this.anInt957 = i_1;
			this.anInt954 = i_2;
			this.aByteArray960 = bytes_3;
		}

	}

	public void method1524(int i_1) {
		int i_2 = -1;
		int i_3;
		int i_4;
		int i_5;
		if (this.anIntArray955.length < 255) {
			for (i_3 = 0; i_3 < this.anIntArray955.length; i_3++) {
				if (this.anIntArray955[i_3] == i_1) {
					i_2 = i_3;
					break;
				}
			}

			if (i_2 == -1) {
				i_2 = this.anIntArray955.length;
				int[] ints_16 = new int[this.anIntArray955.length + 1];
				Class503.method8362(this.anIntArray955, 0, ints_16, 0, this.anIntArray955.length);
				this.anIntArray955 = ints_16;
				ints_16[i_2] = i_1;
			}
		} else {
			i_3 = Integer.MAX_VALUE;
			i_4 = i_1 >> 16 & 0xff;
			i_5 = i_1 >> 8 & 0xff;
			int i_6 = i_1 & 0xff;

			for (int i_7 = 0; i_7 < this.anIntArray955.length; i_7++) {
				int i_8 = this.anIntArray955[i_7];
				int i_9 = i_8 >> 16 & 0xff;
				int i_10 = i_8 >> 8 & 0xff;
				int i_11 = i_8 & 0xff;
				int i_12 = i_4 - i_9;
				if (i_12 < 0) {
					i_12 = -i_12;
				}

				int i_13 = i_5 - i_10;
				if (i_13 < 0) {
					i_13 = -i_13;
				}

				int i_14 = i_6 - i_11;
				if (i_14 < 0) {
					i_14 = -i_14;
				}

				int i_15 = i_12 + i_13 + i_14;
				if (i_15 < i_3) {
					i_3 = i_15;
					i_2 = i_7;
				}
			}
		}

		for (i_3 = this.anInt954 - 1; i_3 > 0; --i_3) {
			i_4 = i_3 * this.anInt957;

			for (i_5 = this.anInt957 - 1; i_5 > 0; --i_5) {
				if (this.anIntArray955[this.aByteArray960[i_5 + i_4] & 0xff] == 0 && this.anIntArray955[this.aByteArray960[i_5 + i_4 - 1 - this.anInt957] & 0xff] != 0) {
					this.aByteArray960[i_5 + i_4] = (byte) i_2;
				}
			}
		}

	}

	public void method1525() {
		byte[] bytes_1 = this.aByteArray960;
		int i_2;
		int i_3;
		int i_4;
		if (this.aByteArray961 == null) {
			for (i_2 = this.anInt954 - 1; i_2 >= 0; --i_2) {
				i_3 = i_2 * this.anInt957;

				for (i_4 = (i_2 + 1) * this.anInt957; i_3 < i_4; i_3++) {
					--i_4;
					byte b_5 = bytes_1[i_3];
					bytes_1[i_3] = bytes_1[i_4];
					bytes_1[i_4] = b_5;
				}
			}
		} else {
			byte[] bytes_7 = this.aByteArray961;

			for (i_3 = this.anInt954 - 1; i_3 >= 0; --i_3) {
				i_4 = i_3 * this.anInt957;

				for (int i_8 = (i_3 + 1) * this.anInt957; i_4 < i_8; i_4++) {
					--i_8;
					byte b_6 = bytes_1[i_4];
					bytes_1[i_4] = bytes_1[i_8];
					bytes_1[i_8] = b_6;
					b_6 = bytes_7[i_4];
					bytes_7[i_4] = bytes_7[i_8];
					bytes_7[i_8] = b_6;
				}
			}
		}

		i_2 = this.anInt956;
		this.anInt956 = this.anInt958;
		this.anInt958 = i_2;
	}

	public void method1526() {
		byte[] bytes_1 = this.aByteArray960;
		int i_2;
		int i_3;
		int i_4;
		int i_5;
		if (this.aByteArray961 == null) {
			for (i_2 = (this.anInt954 >> 1) - 1; i_2 >= 0; --i_2) {
				i_3 = i_2 * this.anInt957;
				i_4 = (this.anInt954 - i_2 - 1) * this.anInt957;

				for (i_5 = -this.anInt957; i_5 < 0; i_5++) {
					byte b_6 = bytes_1[i_3];
					bytes_1[i_3] = bytes_1[i_4];
					bytes_1[i_4] = b_6;
					++i_3;
					++i_4;
				}
			}
		} else {
			byte[] bytes_8 = this.aByteArray961;

			for (i_3 = (this.anInt954 >> 1) - 1; i_3 >= 0; --i_3) {
				i_4 = i_3 * this.anInt957;
				i_5 = (this.anInt954 - i_3 - 1) * this.anInt957;

				for (int i_9 = -this.anInt957; i_9 < 0; i_9++) {
					byte b_7 = bytes_1[i_4];
					bytes_1[i_4] = bytes_1[i_5];
					bytes_1[i_5] = b_7;
					b_7 = bytes_8[i_4];
					bytes_8[i_4] = bytes_8[i_5];
					bytes_8[i_5] = b_7;
					++i_4;
					++i_5;
				}
			}
		}

		i_2 = this.anInt959;
		this.anInt959 = this.anInt953;
		this.anInt953 = i_2;
	}

	public void method1527() {
		byte[] bytes_1 = new byte[this.anInt957 * this.anInt954];
		int i_2 = 0;
		int i_3;
		int i_4;
		if (this.aByteArray961 == null) {
			for (i_3 = 0; i_3 < this.anInt957; i_3++) {
				for (i_4 = this.anInt954 - 1; i_4 >= 0; --i_4) {
					bytes_1[i_2++] = this.aByteArray960[i_3 + i_4 * this.anInt957];
				}
			}

			this.aByteArray960 = bytes_1;
		} else {
			byte[] bytes_6 = new byte[this.anInt957 * this.anInt954];

			for (i_4 = 0; i_4 < this.anInt957; i_4++) {
				for (int i_5 = this.anInt954 - 1; i_5 >= 0; --i_5) {
					bytes_1[i_2] = this.aByteArray960[i_4 + i_5 * this.anInt957];
					bytes_6[i_2++] = this.aByteArray961[i_4 + i_5 * this.anInt957];
				}
			}

			this.aByteArray960 = bytes_1;
			this.aByteArray961 = bytes_6;
		}

		i_3 = this.anInt959;
		this.anInt959 = this.anInt956;
		this.anInt956 = this.anInt953;
		this.anInt953 = this.anInt958;
		this.anInt958 = this.anInt959;
		i_3 = this.anInt954;
		this.anInt954 = this.anInt957;
		this.anInt957 = i_3;
	}

	public int[] method1528() {
		int i_1 = this.method1519();
		int[] ints_2 = new int[i_1 * this.method1520()];
		int i_3;
		int i_4;
		int i_5;
		int i_6;
		if (this.aByteArray961 != null) {
			for (i_3 = 0; i_3 < this.anInt954; i_3++) {
				i_4 = i_3 * this.anInt957;
				i_5 = i_1 * (i_3 + this.anInt959) + this.anInt956;

				for (i_6 = 0; i_6 < this.anInt957; i_6++) {
					ints_2[i_5++] = this.aByteArray961[i_4] << 24 | this.anIntArray955[this.aByteArray960[i_4] & 0xff];
					++i_4;
				}
			}
		} else {
			for (i_3 = 0; i_3 < this.anInt954; i_3++) {
				i_4 = i_3 * this.anInt957;
				i_5 = i_1 * (i_3 + this.anInt959) + this.anInt956;

				for (i_6 = 0; i_6 < this.anInt957; i_6++) {
					int i_7 = this.anIntArray955[this.aByteArray960[i_4++] & 0xff];
					if (i_7 != 0) {
						ints_2[i_5++] = ~0xffffff | i_7;
					} else {
						ints_2[i_5++] = 0;
					}
				}
			}
		}

		return ints_2;
	}

	public void method1529(int i_1, int i_2, int i_3) {
		for (int i_4 = 1; i_4 < this.anIntArray955.length; i_4++) {
			if (this.anIntArray955[i_4] != 1 && this.anIntArray955[i_4] != 16711935) {
				int i_5 = this.anIntArray955[i_4] >> 16 & 0xff;
				i_5 += i_1;
				if (i_5 < 0) {
					i_5 = 0;
				} else if (i_5 > 255) {
					i_5 = 255;
				}

				int i_6 = this.anIntArray955[i_4] >> 8 & 0xff;
				i_6 += i_2;
				if (i_6 < 0) {
					i_6 = 0;
				} else if (i_6 > 255) {
					i_6 = 255;
				}

				int i_7 = this.anIntArray955[i_4] >> 0 & 0xff;
				i_7 += i_3;
				if (i_7 < 0) {
					i_7 = 0;
				} else if (i_7 > 255) {
					i_7 = 255;
				}

				this.anIntArray955[i_4] = i_5 << 16 | i_6 << 8 | i_7;
			}
		}

	}

	public static Class91[] method1534(Index index_0, int i_1) {
		byte[] bytes_2 = index_0.getFile(i_1);
		return bytes_2 == null ? null : method1517(bytes_2);
	}

	public void method1536(int i_1) {
		int i_2 = -1;
		int i_3;
		int i_5;
		int i_6;
		int i_7;
		if (this.anIntArray955.length < 255) {
			for (i_3 = 0; i_3 < this.anIntArray955.length; i_3++) {
				if (this.anIntArray955[i_3] == i_1) {
					i_2 = i_3;
					break;
				}
			}

			if (i_2 == -1) {
				i_2 = this.anIntArray955.length;
				int[] ints_16 = new int[this.anIntArray955.length + 1];
				Class503.method8362(this.anIntArray955, 0, ints_16, 0, this.anIntArray955.length);
				this.anIntArray955 = ints_16;
				ints_16[i_2] = i_1;
			}
		} else {
			i_3 = Integer.MAX_VALUE;
			int i_17 = i_1 >> 16 & 0xff;
			i_5 = i_1 >> 8 & 0xff;
			i_6 = i_1 & 0xff;

			for (i_7 = 0; i_7 < this.anIntArray955.length; i_7++) {
				int i_8 = this.anIntArray955[i_7];
				int i_9 = i_8 >> 16 & 0xff;
				int i_10 = i_8 >> 8 & 0xff;
				int i_11 = i_8 & 0xff;
				int i_12 = i_17 - i_9;
				if (i_12 < 0) {
					i_12 = -i_12;
				}

				int i_13 = i_5 - i_10;
				if (i_13 < 0) {
					i_13 = -i_13;
				}

				int i_14 = i_6 - i_11;
				if (i_14 < 0) {
					i_14 = -i_14;
				}

				int i_15 = i_12 + i_13 + i_14;
				if (i_15 < i_3) {
					i_3 = i_15;
					i_2 = i_7;
				}
			}
		}

		i_3 = 0;
		byte[] bytes_4 = new byte[this.anInt957 * this.anInt954];

		for (i_5 = 0; i_5 < this.anInt954; i_5++) {
			for (i_6 = 0; i_6 < this.anInt957; i_6++) {
				i_7 = this.aByteArray960[i_3] & 0xff;
				if (this.anIntArray955[i_7] == 0) {
					if (i_6 > 0 && this.anIntArray955[this.aByteArray960[i_3 - 1] & 0xff] != 0) {
						i_7 = i_2;
					} else if (i_5 > 0 && this.anIntArray955[this.aByteArray960[i_3 - this.anInt957] & 0xff] != 0) {
						i_7 = i_2;
					} else if (i_6 < this.anInt957 - 1 && this.anIntArray955[this.aByteArray960[i_3 + 1] & 0xff] != 0) {
						i_7 = i_2;
					} else if (i_5 < this.anInt954 - 1 && this.anIntArray955[this.aByteArray960[i_3 + this.anInt957] & 0xff] != 0) {
						i_7 = i_2;
					}
				}

				bytes_4[i_3++] = (byte) i_7;
			}
		}

		this.aByteArray960 = bytes_4;
	}

	public void method1554(int i_1) {
		int i_2 = this.method1519();
		int i_3 = this.method1520();
		if (i_2 != this.anInt957 || i_3 != this.anInt954) {
			int i_4 = i_1;
			if (i_1 > this.anInt956) {
				i_4 = this.anInt956;
			}

			int i_5 = i_1;
			if (i_1 + this.anInt956 + this.anInt957 > i_2) {
				i_5 = i_2 - this.anInt956 - this.anInt957;
			}

			int i_6 = i_1;
			if (i_1 > this.anInt959) {
				i_6 = this.anInt959;
			}

			int i_7 = i_1;
			if (i_1 + this.anInt959 + this.anInt954 > i_3) {
				i_7 = i_3 - this.anInt959 - this.anInt954;
			}

			int i_8 = i_4 + i_5 + this.anInt957;
			int i_9 = i_6 + i_7 + this.anInt954;
			byte[] bytes_10 = new byte[i_8 * i_9];
			int i_12;
			int i_13;
			int i_14;
			if (this.aByteArray961 == null) {
				for (int i_11 = 0; i_11 < this.anInt954; i_11++) {
					i_12 = i_11 * this.anInt957;
					i_13 = i_8 * (i_11 + i_6) + i_4;

					for (i_14 = 0; i_14 < this.anInt957; i_14++) {
						bytes_10[i_13++] = this.aByteArray960[i_12++];
					}
				}
			} else {
				byte[] bytes_16 = new byte[i_8 * i_9];
				i_12 = 0;

				while (true) {
					if (i_12 >= this.anInt954) {
						this.aByteArray961 = bytes_16;
						break;
					}

					i_13 = i_12 * this.anInt957;
					i_14 = i_8 * (i_12 + i_6) + i_4;

					for (int i_15 = 0; i_15 < this.anInt957; i_15++) {
						bytes_16[i_14] = this.aByteArray961[i_13];
						bytes_10[i_14++] = this.aByteArray960[i_13++];
					}

					++i_12;
				}
			}

			this.anInt956 -= i_4;
			this.anInt959 -= i_6;
			this.anInt958 -= i_5;
			this.anInt953 -= i_7;
			this.anInt957 = i_8;
			this.anInt954 = i_9;
			this.aByteArray960 = bytes_10;
		}

	}

}
