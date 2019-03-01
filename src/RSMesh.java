public class RSMesh {

	public int version = 12;
	public int vertexCount = 0;
	public int anInt1999 = 0;
	public int anInt1973 = 0;
	public byte aByte1994 = 0;
	public int texturedFaceCount = 0;
	public byte[] aByteArray1995;
	public int[] vertexX;
	public int[] vertexY;
	public int[] vertexZ;
	public short[] aShortArray1982;
	public short[] aShortArray1983;
	public short[] aShortArray1984;
	public int[] anIntArray2002;
	public byte[] aByteArray1985;
	public byte[] aByteArray1977;
	public byte[] aByteArray1975;
	public int[] anIntArray1991;
	public short[] textures;
	public short[] colors;
	public byte[] aByteArray1988;
	public short[] aShortArray1996;
	public short[] aShortArray1987;
	public short[] aShortArray1998;
	public int[] anIntArray1989;
	public int[] anIntArray2000;
	public int[] anIntArray2001;
	public byte[] aByteArray2005;
	public byte[] aByteArray1990;
	public int[] anIntArray1992;
	public int[] anIntArray1997;
	public int[] anIntArray2004;
	public Class87[] aClass87Array2007;
	public Class172[] aClass172Array2008;
	public Class84[] aClass84Array2009;
	public short[] aShortArray1980;
	public short[] aShortArray1981;

	RSMesh(byte[] data) {
		if (data[data.length - 1] == -1 && data[data.length - 2] == -1) {
			this.decodeMesh1(data);
		} else {
			this.method2674(data);
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
		this.anIntArray2002[this.vertexCount] = rsmesh_1.anIntArray2002 != null ? rsmesh_1.anIntArray2002[i_2] : -1;
		return this.vertexCount++;
	}

	void decodeMesh1(byte[] data) {
		RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_3 = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_4 = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_5 = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_6 = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_7 = new RsByteBuffer(data);
		RsByteBuffer rsbytebuffer_8 = new RsByteBuffer(data);
		rsbytebuffer_2.index = data.length - 23;
		this.vertexCount = rsbytebuffer_2.readUnsignedShort();
		this.anInt1973 = rsbytebuffer_2.readUnsignedShort();
		this.texturedFaceCount = rsbytebuffer_2.readUnsignedByte();
		int i_9 = rsbytebuffer_2.readUnsignedByte();
		boolean bool_10 = (i_9 & 0x1) == 1;
		boolean bool_11 = (i_9 & 0x2) == 2;
		boolean bool_12 = (i_9 & 0x4) == 4;
		boolean bool_13 = (i_9 & 0x8) == 8;
		if (bool_13) {
			rsbytebuffer_2.index -= 7;
			this.version = rsbytebuffer_2.readUnsignedByte();
			rsbytebuffer_2.index += 6;
		}

		int i_14 = rsbytebuffer_2.readUnsignedByte();
		int i_15 = rsbytebuffer_2.readUnsignedByte();
		int i_16 = rsbytebuffer_2.readUnsignedByte();
		int i_17 = rsbytebuffer_2.readUnsignedByte();
		int i_18 = rsbytebuffer_2.readUnsignedByte();
		int i_19 = rsbytebuffer_2.readUnsignedShort();
		int i_20 = rsbytebuffer_2.readUnsignedShort();
		int i_21 = rsbytebuffer_2.readUnsignedShort();
		int i_22 = rsbytebuffer_2.readUnsignedShort();
		int i_23 = rsbytebuffer_2.readUnsignedShort();
		int i_24 = 0;
		int i_25 = 0;
		int i_26 = 0;
		int i_27;
		if (this.texturedFaceCount > 0) {
			this.aByteArray1995 = new byte[this.texturedFaceCount];
			rsbytebuffer_2.index = 0;

			for (i_27 = 0; i_27 < this.texturedFaceCount; i_27++) {
				byte b_28 = this.aByteArray1995[i_27] = rsbytebuffer_2.readByte();
				if (b_28 == 0) {
					++i_24;
				}

				if (b_28 >= 1 && b_28 <= 3) {
					++i_25;
				}

				if (b_28 == 2) {
					++i_26;
				}
			}
		}

		i_27 = this.texturedFaceCount;
		int i_59 = i_27;
		i_27 += this.vertexCount;
		int i_29 = i_27;
		if (bool_10) {
			i_27 += this.anInt1973;
		}

		int i_30 = i_27;
		i_27 += this.anInt1973;
		int i_31 = i_27;
		if (i_14 == 255) {
			i_27 += this.anInt1973;
		}

		int i_32 = i_27;
		if (i_16 == 1) {
			i_27 += this.anInt1973;
		}

		int i_33 = i_27;
		if (i_18 == 1) {
			i_27 += this.vertexCount;
		}

		int i_34 = i_27;
		if (i_15 == 1) {
			i_27 += this.anInt1973;
		}

		int i_35 = i_27;
		i_27 += i_22;
		int i_36 = i_27;
		if (i_17 == 1) {
			i_27 += this.anInt1973 * 2;
		}

		int i_37 = i_27;
		i_27 += i_23;
		int i_38 = i_27;
		i_27 += this.anInt1973 * 2;
		int i_39 = i_27;
		i_27 += i_19;
		int i_40 = i_27;
		i_27 += i_20;
		int i_41 = i_27;
		i_27 += i_21;
		int i_42 = i_27;
		i_27 += i_24 * 6;
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
		this.aShortArray1982 = new short[this.anInt1973];
		this.aShortArray1983 = new short[this.anInt1973];
		this.aShortArray1984 = new short[this.anInt1973];
		if (i_18 == 1) {
			this.anIntArray2002 = new int[this.vertexCount];
		}

		if (bool_10) {
			this.aByteArray1985 = new byte[this.anInt1973];
		}

		if (i_14 == 255) {
			this.aByteArray1977 = new byte[this.anInt1973];
		} else {
			this.aByte1994 = (byte) i_14;
		}

		if (i_15 == 1) {
			this.aByteArray1975 = new byte[this.anInt1973];
		}

		if (i_16 == 1) {
			this.anIntArray1991 = new int[this.anInt1973];
		}

		if (i_17 == 1) {
			this.textures = new short[this.anInt1973];
		}

		if (i_17 == 1 && this.texturedFaceCount > 0) {
			this.aByteArray1988 = new byte[this.anInt1973];
		}

		this.colors = new short[this.anInt1973];
		if (this.texturedFaceCount > 0) {
			this.aShortArray1996 = new short[this.texturedFaceCount];
			this.aShortArray1987 = new short[this.texturedFaceCount];
			this.aShortArray1998 = new short[this.texturedFaceCount];
			if (i_25 > 0) {
				this.anIntArray1989 = new int[i_25];
				this.anIntArray2000 = new int[i_25];
				this.anIntArray2001 = new int[i_25];
				this.aByteArray2005 = new byte[i_25];
				this.aByteArray1990 = new byte[i_25];
				this.anIntArray1992 = new int[i_25];
			}

			if (i_26 > 0) {
				this.anIntArray1997 = new int[i_26];
				this.anIntArray2004 = new int[i_26];
			}
		}

		rsbytebuffer_2.index = i_59;
		rsbytebuffer_3.index = i_39;
		rsbytebuffer_4.index = i_40;
		rsbytebuffer_5.index = i_41;
		rsbytebuffer_6.index = i_33;
		int i_50 = 0;
		int i_51 = 0;
		int i_52 = 0;

		int i_53;
		int i_54;
		int i_55;
		int i_56;
		int i_57;
		for (i_53 = 0; i_53 < this.vertexCount; i_53++) {
			i_54 = rsbytebuffer_2.readUnsignedByte();
			i_55 = 0;
			if ((i_54 & 0x1) != 0) {
				i_55 = rsbytebuffer_3.readSmart();
			}

			i_56 = 0;
			if ((i_54 & 0x2) != 0) {
				i_56 = rsbytebuffer_4.readSmart();
			}

			i_57 = 0;
			if ((i_54 & 0x4) != 0) {
				i_57 = rsbytebuffer_5.readSmart();
			}

			this.vertexX[i_53] = i_50 + i_55;
			this.vertexY[i_53] = i_51 + i_56;
			this.vertexZ[i_53] = i_52 + i_57;
			i_50 = this.vertexX[i_53];
			i_51 = this.vertexY[i_53];
			i_52 = this.vertexZ[i_53];
			if (i_18 == 1) {
				this.anIntArray2002[i_53] = rsbytebuffer_6.readUnsignedByte();
			}
		}

		rsbytebuffer_2.index = i_38;
		rsbytebuffer_3.index = i_29;
		rsbytebuffer_4.index = i_31;
		rsbytebuffer_5.index = i_34;
		rsbytebuffer_6.index = i_32;
		rsbytebuffer_7.index = i_36;
		rsbytebuffer_8.index = i_37;

		for (i_53 = 0; i_53 < this.anInt1973; i_53++) {
			this.colors[i_53] = (short) rsbytebuffer_2.readUnsignedShort();
			if (bool_10) {
				this.aByteArray1985[i_53] = rsbytebuffer_3.readByte();
			}

			if (i_14 == 255) {
				this.aByteArray1977[i_53] = rsbytebuffer_4.readByte();
			}

			if (i_15 == 1) {
				this.aByteArray1975[i_53] = rsbytebuffer_5.readByte();
			}

			if (i_16 == 1) {
				this.anIntArray1991[i_53] = rsbytebuffer_6.readUnsignedByte();
			}

			if (i_17 == 1) {
				this.textures[i_53] = (short) (rsbytebuffer_7.readUnsignedShort() - 1);
			}

			if (this.aByteArray1988 != null) {
				if (this.textures[i_53] != -1) {
					this.aByteArray1988[i_53] = (byte) (rsbytebuffer_8.readUnsignedByte() - 1);
				} else {
					this.aByteArray1988[i_53] = -1;
				}
			}
		}

		this.anInt1999 = -1;
		rsbytebuffer_2.index = i_35;
		rsbytebuffer_3.index = i_30;
		this.method2659(rsbytebuffer_2, rsbytebuffer_3);
		rsbytebuffer_2.index = i_42;
		rsbytebuffer_3.index = i_43;
		rsbytebuffer_4.index = i_45;
		rsbytebuffer_5.index = i_46;
		rsbytebuffer_6.index = i_47;
		rsbytebuffer_7.index = i_48;
		this.method2660(rsbytebuffer_2, rsbytebuffer_3, rsbytebuffer_4, rsbytebuffer_5, rsbytebuffer_6, rsbytebuffer_7);
		rsbytebuffer_2.index = i_27;
		if (bool_11) {
			i_53 = rsbytebuffer_2.readUnsignedByte();
			if (i_53 > 0) {
				this.aClass87Array2007 = new Class87[i_53];

				for (i_54 = 0; i_54 < i_53; i_54++) {
					i_55 = rsbytebuffer_2.readUnsignedShort();
					i_56 = rsbytebuffer_2.readUnsignedShort();
					byte b_60;
					if (i_14 == 255) {
						b_60 = this.aByteArray1977[i_56];
					} else {
						b_60 = (byte) i_14;
					}

					this.aClass87Array2007[i_54] = new Class87(i_55, this.aShortArray1982[i_56], this.aShortArray1983[i_56], this.aShortArray1984[i_56], b_60);
				}
			}

			i_54 = rsbytebuffer_2.readUnsignedByte();
			if (i_54 > 0) {
				this.aClass172Array2008 = new Class172[i_54];

				for (i_55 = 0; i_55 < i_54; i_55++) {
					i_56 = rsbytebuffer_2.readUnsignedShort();
					i_57 = rsbytebuffer_2.readUnsignedShort();
					this.aClass172Array2008[i_55] = new Class172(i_56, i_57);
				}
			}
		}

		if (bool_12) {
			i_53 = rsbytebuffer_2.readUnsignedByte();
			if (i_53 > 0) {
				this.aClass84Array2009 = new Class84[i_53];

				for (i_54 = 0; i_54 < i_53; i_54++) {
					i_55 = rsbytebuffer_2.readUnsignedShort();
					i_56 = rsbytebuffer_2.readUnsignedShort();
					i_57 = rsbytebuffer_2.readUnsignedByte();
					byte b_58 = rsbytebuffer_2.readByte();
					this.aClass84Array2009[i_54] = new Class84(i_55, i_56, i_57, b_58);
				}
			}
		}

	}

	void method2659(RsByteBuffer rsbytebuffer_1, RsByteBuffer rsbytebuffer_2) {
		short s_3 = 0;
		short s_4 = 0;
		short s_5 = 0;
		short s_6 = 0;

		for (int i_7 = 0; i_7 < this.anInt1973; i_7++) {
			int i_8 = rsbytebuffer_2.readUnsignedByte();
			if (i_8 == 1) {
				s_3 = (short) (rsbytebuffer_1.readSmart() + s_6);
				s_4 = (short) (rsbytebuffer_1.readSmart() + s_3);
				s_5 = (short) (rsbytebuffer_1.readSmart() + s_4);
				s_6 = s_5;
				this.aShortArray1982[i_7] = s_3;
				this.aShortArray1983[i_7] = s_4;
				this.aShortArray1984[i_7] = s_5;
				if (s_3 > this.anInt1999) {
					this.anInt1999 = s_3;
				}

				if (s_4 > this.anInt1999) {
					this.anInt1999 = s_4;
				}

				if (s_5 > this.anInt1999) {
					this.anInt1999 = s_5;
				}
			}

			if (i_8 == 2) {
				s_4 = s_5;
				s_5 = (short) (rsbytebuffer_1.readSmart() + s_6);
				s_6 = s_5;
				this.aShortArray1982[i_7] = s_3;
				this.aShortArray1983[i_7] = s_4;
				this.aShortArray1984[i_7] = s_5;
				if (s_5 > this.anInt1999) {
					this.anInt1999 = s_5;
				}
			}

			if (i_8 == 3) {
				s_3 = s_5;
				s_5 = (short) (rsbytebuffer_1.readSmart() + s_6);
				s_6 = s_5;
				this.aShortArray1982[i_7] = s_3;
				this.aShortArray1983[i_7] = s_4;
				this.aShortArray1984[i_7] = s_5;
				if (s_5 > this.anInt1999) {
					this.anInt1999 = s_5;
				}
			}

			if (i_8 == 4) {
				short s_9 = s_3;
				s_3 = s_4;
				s_4 = s_9;
				s_5 = (short) (rsbytebuffer_1.readSmart() + s_6);
				s_6 = s_5;
				this.aShortArray1982[i_7] = s_3;
				this.aShortArray1983[i_7] = s_9;
				this.aShortArray1984[i_7] = s_5;
				if (s_5 > this.anInt1999) {
					this.anInt1999 = s_5;
				}
			}
		}

		++this.anInt1999;
	}

	void method2660(RsByteBuffer rsbytebuffer_1, RsByteBuffer rsbytebuffer_2, RsByteBuffer rsbytebuffer_3, RsByteBuffer rsbytebuffer_4, RsByteBuffer rsbytebuffer_5, RsByteBuffer rsbytebuffer_6) {
		for (int i_7 = 0; i_7 < this.texturedFaceCount; i_7++) {
			int i_8 = this.aByteArray1995[i_7] & 0xff;
			if (i_8 == 0) {
				this.aShortArray1996[i_7] = (short) rsbytebuffer_1.readUnsignedShort();
				this.aShortArray1987[i_7] = (short) rsbytebuffer_1.readUnsignedShort();
				this.aShortArray1998[i_7] = (short) rsbytebuffer_1.readUnsignedShort();
			}

			if (i_8 == 1) {
				this.aShortArray1996[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.aShortArray1987[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.aShortArray1998[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				if (this.version < 15) {
					this.anIntArray1989[i_7] = rsbytebuffer_3.readUnsignedShort();
					if (this.version < 14) {
						this.anIntArray2000[i_7] = rsbytebuffer_3.readUnsignedShort();
					} else {
						this.anIntArray2000[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					}

					this.anIntArray2001[i_7] = rsbytebuffer_3.readUnsignedShort();
				} else {
					this.anIntArray1989[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.anIntArray2000[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.anIntArray2001[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
				}

				this.aByteArray2005[i_7] = rsbytebuffer_4.readByte();
				this.aByteArray1990[i_7] = rsbytebuffer_5.readByte();
				this.anIntArray1992[i_7] = rsbytebuffer_6.readByte();
			}

			if (i_8 == 2) {
				this.aShortArray1996[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.aShortArray1987[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.aShortArray1998[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				if (this.version < 15) {
					this.anIntArray1989[i_7] = rsbytebuffer_3.readUnsignedShort();
					if (this.version < 14) {
						this.anIntArray2000[i_7] = rsbytebuffer_3.readUnsignedShort();
					} else {
						this.anIntArray2000[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					}

					this.anIntArray2001[i_7] = rsbytebuffer_3.readUnsignedShort();
				} else {
					this.anIntArray1989[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.anIntArray2000[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.anIntArray2001[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
				}

				this.aByteArray2005[i_7] = rsbytebuffer_4.readByte();
				this.aByteArray1990[i_7] = rsbytebuffer_5.readByte();
				this.anIntArray1992[i_7] = rsbytebuffer_6.readByte();
				this.anIntArray1997[i_7] = rsbytebuffer_6.readByte();
				this.anIntArray2004[i_7] = rsbytebuffer_6.readByte();
			}

			if (i_8 == 3) {
				this.aShortArray1996[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.aShortArray1987[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				this.aShortArray1998[i_7] = (short) rsbytebuffer_2.readUnsignedShort();
				if (this.version < 15) {
					this.anIntArray1989[i_7] = rsbytebuffer_3.readUnsignedShort();
					if (this.version < 14) {
						this.anIntArray2000[i_7] = rsbytebuffer_3.readUnsignedShort();
					} else {
						this.anIntArray2000[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					}

					this.anIntArray2001[i_7] = rsbytebuffer_3.readUnsignedShort();
				} else {
					this.anIntArray1989[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.anIntArray2000[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
					this.anIntArray2001[i_7] = rsbytebuffer_3.read24BitUnsignedInteger();
				}

				this.aByteArray2005[i_7] = rsbytebuffer_4.readByte();
				this.aByteArray1990[i_7] = rsbytebuffer_5.readByte();
				this.anIntArray1992[i_7] = rsbytebuffer_6.readByte();
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
		this.anInt1999 = this.vertexCount + 1;
		return this.vertexCount++;
	}

	public int method2663(int i_1, int i_2, int i_3, byte b_4, byte b_5, short s_6, byte b_7, short s_8) {
		this.aShortArray1982[this.anInt1973] = (short) i_1;
		this.aShortArray1983[this.anInt1973] = (short) i_2;
		this.aShortArray1984[this.anInt1973] = (short) i_3;
		this.aByteArray1985[this.anInt1973] = b_4;
		this.aByteArray1988[this.anInt1973] = b_5;
		this.colors[this.anInt1973] = s_6;
		this.aByteArray1975[this.anInt1973] = b_7;
		this.textures[this.anInt1973] = s_8;
		return this.anInt1973++;
	}

	public byte method2664(short s_1, short s_2, short s_3, short s_4, short s_5, short s_6, byte b_7, byte b_8, byte b_9) {
		if (this.texturedFaceCount >= 255) {
			throw new IllegalStateException();
		} else {
			this.aByteArray1995[this.texturedFaceCount] = 3;
			this.aShortArray1996[this.texturedFaceCount] = s_1;
			this.aShortArray1987[this.texturedFaceCount] = s_2;
			this.aShortArray1998[this.texturedFaceCount] = s_3;
			this.anIntArray1989[this.texturedFaceCount] = s_4;
			this.anIntArray2000[this.texturedFaceCount] = s_5;
			this.anIntArray2001[this.texturedFaceCount] = s_6;
			this.aByteArray2005[this.texturedFaceCount] = b_7;
			this.aByteArray1990[this.texturedFaceCount] = b_8;
			this.anIntArray1992[this.texturedFaceCount] = b_9;
			return (byte) (this.texturedFaceCount++);
		}
	}

	public int[][] method2665(boolean bool_1) {
		int[] ints_2 = new int[256];
		int i_3 = 0;
		int i_4 = bool_1 ? this.vertexCount : this.anInt1999;

		int i_6;
		for (int i_5 = 0; i_5 < i_4; i_5++) {
			i_6 = this.anIntArray2002[i_5];
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
			int i_7 = this.anIntArray2002[i_6];
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
		for (int i_3 = 0; i_3 < this.anInt1973; i_3++) {
			i_4 = this.anIntArray1991[i_3];
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

		for (i_4 = 0; i_4 < this.anInt1973; i_4++) {
			int i_5 = this.anIntArray1991[i_4];
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
		for (int i_3 = 0; i_3 < this.aClass84Array2009.length; i_3++) {
			i_4 = this.aClass84Array2009[i_3].anInt811;
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

		for (i_4 = 0; i_4 < this.aClass84Array2009.length; i_4++) {
			int i_5 = this.aClass84Array2009[i_4].anInt811;
			if (i_5 >= 0) {
				ints_6[i_5][ints_1[i_5]++] = i_4;
			}
		}

		return ints_6;
	}

	public void recolor(short s_1, short s_2) {
		for (int i_3 = 0; i_3 < this.anInt1973; i_3++) {
			if (this.colors[i_3] == s_1) {
				this.colors[i_3] = s_2;
			}
		}

	}

	public void retexture(short s_1, short s_2) {
		if (this.textures != null) {
			for (int i_3 = 0; i_3 < this.anInt1973; i_3++) {
				if (this.textures[i_3] == s_1) {
					this.textures[i_3] = s_2;
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

	void method2674(byte[] bytes_1) {
		boolean bool_2 = false;
		boolean bool_3 = false;
		RsByteBuffer rsbytebuffer_4 = new RsByteBuffer(bytes_1);
		RsByteBuffer rsbytebuffer_5 = new RsByteBuffer(bytes_1);
		RsByteBuffer rsbytebuffer_6 = new RsByteBuffer(bytes_1);
		RsByteBuffer rsbytebuffer_7 = new RsByteBuffer(bytes_1);
		RsByteBuffer rsbytebuffer_8 = new RsByteBuffer(bytes_1);
		rsbytebuffer_4.index = bytes_1.length - 18;
		this.vertexCount = rsbytebuffer_4.readUnsignedShort();
		this.anInt1973 = rsbytebuffer_4.readUnsignedShort();
		this.texturedFaceCount = rsbytebuffer_4.readUnsignedByte();
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
		i_42 += this.anInt1973;
		int i_21 = i_42;
		if (i_10 == 255) {
			i_42 += this.anInt1973;
		}

		int i_22 = i_42;
		if (i_12 == 1) {
			i_42 += this.anInt1973;
		}

		int i_23 = i_42;
		if (i_9 == 1) {
			i_42 += this.anInt1973;
		}

		int i_24 = i_42;
		if (i_13 == 1) {
			i_42 += this.vertexCount;
		}

		int i_25 = i_42;
		if (i_11 == 1) {
			i_42 += this.anInt1973;
		}

		int i_26 = i_42;
		i_42 += i_17;
		int i_27 = i_42;
		i_42 += this.anInt1973 * 2;
		int i_28 = i_42;
		i_42 += this.texturedFaceCount * 6;
		int i_29 = i_42;
		i_42 += i_14;
		int i_30 = i_42;
		i_42 += i_15;
		int i_10000 = i_42 + i_16;
		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.aShortArray1982 = new short[this.anInt1973];
		this.aShortArray1983 = new short[this.anInt1973];
		this.aShortArray1984 = new short[this.anInt1973];
		if (this.texturedFaceCount > 0) {
			this.aByteArray1995 = new byte[this.texturedFaceCount];
			this.aShortArray1996 = new short[this.texturedFaceCount];
			this.aShortArray1987 = new short[this.texturedFaceCount];
			this.aShortArray1998 = new short[this.texturedFaceCount];
		}

		if (i_13 == 1) {
			this.anIntArray2002 = new int[this.vertexCount];
		}

		if (i_9 == 1) {
			this.aByteArray1985 = new byte[this.anInt1973];
			this.aByteArray1988 = new byte[this.anInt1973];
			this.textures = new short[this.anInt1973];
		}

		if (i_10 == 255) {
			this.aByteArray1977 = new byte[this.anInt1973];
		} else {
			this.aByte1994 = (byte) i_10;
		}

		if (i_11 == 1) {
			this.aByteArray1975 = new byte[this.anInt1973];
		}

		if (i_12 == 1) {
			this.anIntArray1991 = new int[this.anInt1973];
		}

		this.colors = new short[this.anInt1973];
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
				this.anIntArray2002[i_35] = rsbytebuffer_8.readUnsignedByte();
			}
		}

		rsbytebuffer_4.index = i_27;
		rsbytebuffer_5.index = i_23;
		rsbytebuffer_6.index = i_21;
		rsbytebuffer_7.index = i_25;
		rsbytebuffer_8.index = i_22;

		for (i_35 = 0; i_35 < this.anInt1973; i_35++) {
			this.colors[i_35] = (short) rsbytebuffer_4.readUnsignedShort();
			if (i_9 == 1) {
				i_36 = rsbytebuffer_5.readUnsignedByte();
				if ((i_36 & 0x1) == 1) {
					this.aByteArray1985[i_35] = 1;
					bool_2 = true;
				} else {
					this.aByteArray1985[i_35] = 0;
				}

				if ((i_36 & 0x2) == 2) {
					this.aByteArray1988[i_35] = (byte) (i_36 >> 2);
					this.textures[i_35] = this.colors[i_35];
					this.colors[i_35] = 127;
					if (this.textures[i_35] != -1) {
						bool_3 = true;
					}
				} else {
					this.aByteArray1988[i_35] = -1;
					this.textures[i_35] = -1;
				}
			}

			if (i_10 == 255) {
				this.aByteArray1977[i_35] = rsbytebuffer_6.readByte();
			}

			if (i_11 == 1) {
				this.aByteArray1975[i_35] = rsbytebuffer_7.readByte();
			}

			if (i_12 == 1) {
				this.anIntArray1991[i_35] = rsbytebuffer_8.readUnsignedByte();
			}
		}

		this.anInt1999 = -1;
		rsbytebuffer_4.index = i_26;
		rsbytebuffer_5.index = i_20;
		short s_43 = 0;
		short s_44 = 0;
		short s_45 = 0;
		short s_46 = 0;

		int i_40;
		for (i_39 = 0; i_39 < this.anInt1973; i_39++) {
			i_40 = rsbytebuffer_5.readUnsignedByte();
			if (i_40 == 1) {
				s_43 = (short) (rsbytebuffer_4.readSmart() + s_46);
				s_44 = (short) (rsbytebuffer_4.readSmart() + s_43);
				s_45 = (short) (rsbytebuffer_4.readSmart() + s_44);
				s_46 = s_45;
				this.aShortArray1982[i_39] = s_43;
				this.aShortArray1983[i_39] = s_44;
				this.aShortArray1984[i_39] = s_45;
				if (s_43 > this.anInt1999) {
					this.anInt1999 = s_43;
				}

				if (s_44 > this.anInt1999) {
					this.anInt1999 = s_44;
				}

				if (s_45 > this.anInt1999) {
					this.anInt1999 = s_45;
				}
			}

			if (i_40 == 2) {
				s_44 = s_45;
				s_45 = (short) (rsbytebuffer_4.readSmart() + s_46);
				s_46 = s_45;
				this.aShortArray1982[i_39] = s_43;
				this.aShortArray1983[i_39] = s_44;
				this.aShortArray1984[i_39] = s_45;
				if (s_45 > this.anInt1999) {
					this.anInt1999 = s_45;
				}
			}

			if (i_40 == 3) {
				s_43 = s_45;
				s_45 = (short) (rsbytebuffer_4.readSmart() + s_46);
				s_46 = s_45;
				this.aShortArray1982[i_39] = s_43;
				this.aShortArray1983[i_39] = s_44;
				this.aShortArray1984[i_39] = s_45;
				if (s_45 > this.anInt1999) {
					this.anInt1999 = s_45;
				}
			}

			if (i_40 == 4) {
				short s_41 = s_43;
				s_43 = s_44;
				s_44 = s_41;
				s_45 = (short) (rsbytebuffer_4.readSmart() + s_46);
				s_46 = s_45;
				this.aShortArray1982[i_39] = s_43;
				this.aShortArray1983[i_39] = s_41;
				this.aShortArray1984[i_39] = s_45;
				if (s_45 > this.anInt1999) {
					this.anInt1999 = s_45;
				}
			}
		}

		++this.anInt1999;
		rsbytebuffer_4.index = i_28;

		for (i_39 = 0; i_39 < this.texturedFaceCount; i_39++) {
			this.aByteArray1995[i_39] = 0;
			this.aShortArray1996[i_39] = (short) rsbytebuffer_4.readUnsignedShort();
			this.aShortArray1987[i_39] = (short) rsbytebuffer_4.readUnsignedShort();
			this.aShortArray1998[i_39] = (short) rsbytebuffer_4.readUnsignedShort();
		}

		if (this.aByteArray1988 != null) {
			boolean bool_47 = false;

			for (i_40 = 0; i_40 < this.anInt1973; i_40++) {
				int i_48 = this.aByteArray1988[i_40] & 0xff;
				if (i_48 != 255) {
					if (this.aShortArray1982[i_40] == (this.aShortArray1996[i_48] & 0xffff) && this.aShortArray1983[i_40] == (this.aShortArray1987[i_48] & 0xffff) && this.aShortArray1984[i_40] == (this.aShortArray1998[i_48] & 0xffff)) {
						this.aByteArray1988[i_40] = -1;
					} else {
						bool_47 = true;
					}
				}
			}

			if (!bool_47) {
				this.aByteArray1988 = null;
			}
		}

		if (!bool_3) {
			this.textures = null;
		}

		if (!bool_2) {
			this.aByteArray1985 = null;
		}

	}

	public void upscale(int i_1) {
		int i_2;
		for (i_2 = 0; i_2 < this.vertexCount; i_2++) {
			this.vertexX[i_2] <<= i_1;
			this.vertexY[i_2] <<= i_1;
			this.vertexZ[i_2] <<= i_1;
		}

		if (this.texturedFaceCount > 0 && this.anIntArray1989 != null) {
			for (i_2 = 0; i_2 < this.anIntArray1989.length; i_2++) {
				this.anIntArray1989[i_2] <<= i_1;
				this.anIntArray2000[i_2] <<= i_1;
				if (this.aByteArray1995[i_2] != 1) {
					this.anIntArray2001[i_2] <<= i_1;
				}
			}
		}

	}

	public static RSMesh decodeMesh(Index index_0, int i_1, int i_2) {
		byte[] bytes_3 = index_0.getFile(i_1, i_2);
		return bytes_3 == null ? null : new RSMesh(bytes_3);
	}

	public RSMesh(RSMesh[] arr_1, int i_2) {
		this.vertexCount = 0;
		this.anInt1973 = 0;
		this.texturedFaceCount = 0;
		int i_3 = 0;
		int i_4 = 0;
		int i_5 = 0;
		boolean bool_6 = false;
		boolean bool_7 = false;
		boolean bool_8 = false;
		boolean bool_9 = false;
		boolean bool_10 = false;
		boolean bool_11 = false;
		this.aByte1994 = -1;

		int i_12;
		for (i_12 = 0; i_12 < i_2; i_12++) {
			RSMesh rsmesh_22 = arr_1[i_12];
			if (rsmesh_22 != null) {
				this.vertexCount += rsmesh_22.vertexCount;
				this.anInt1973 += rsmesh_22.anInt1973;
				this.texturedFaceCount += rsmesh_22.texturedFaceCount;
				if (rsmesh_22.aClass87Array2007 != null) {
					i_3 += rsmesh_22.aClass87Array2007.length;
				}

				if (rsmesh_22.aClass172Array2008 != null) {
					i_4 += rsmesh_22.aClass172Array2008.length;
				}

				if (rsmesh_22.aClass84Array2009 != null) {
					i_5 += rsmesh_22.aClass84Array2009.length;
				}

				bool_6 |= rsmesh_22.aByteArray1985 != null;
				if (rsmesh_22.aByteArray1977 != null) {
					bool_7 = true;
				} else {
					if (this.aByte1994 == -1) {
						this.aByte1994 = rsmesh_22.aByte1994;
					}

					if (this.aByte1994 != rsmesh_22.aByte1994) {
						bool_7 = true;
					}
				}

				bool_8 |= rsmesh_22.aByteArray1975 != null;
				bool_9 |= rsmesh_22.aByteArray1988 != null;
				bool_10 |= rsmesh_22.textures != null;
				bool_11 |= rsmesh_22.anIntArray1991 != null;
			}
		}

		this.vertexX = new int[this.vertexCount];
		this.vertexY = new int[this.vertexCount];
		this.vertexZ = new int[this.vertexCount];
		this.anIntArray2002 = new int[this.vertexCount];
		this.aShortArray1980 = new short[this.vertexCount];
		this.aShortArray1982 = new short[this.anInt1973];
		this.aShortArray1983 = new short[this.anInt1973];
		this.aShortArray1984 = new short[this.anInt1973];
		if (bool_6) {
			this.aByteArray1985 = new byte[this.anInt1973];
		}

		if (bool_7) {
			this.aByteArray1977 = new byte[this.anInt1973];
		}

		if (bool_8) {
			this.aByteArray1975 = new byte[this.anInt1973];
		}

		if (bool_9) {
			this.aByteArray1988 = new byte[this.anInt1973];
		}

		this.colors = new short[this.anInt1973];
		if (bool_10) {
			this.textures = new short[this.anInt1973];
		}

		if (bool_11) {
			this.anIntArray1991 = new int[this.anInt1973];
		}

		this.aShortArray1981 = new short[this.anInt1973];
		if (this.texturedFaceCount > 0) {
			this.aByteArray1995 = new byte[this.texturedFaceCount];
			this.aShortArray1996 = new short[this.texturedFaceCount];
			this.aShortArray1987 = new short[this.texturedFaceCount];
			this.aShortArray1998 = new short[this.texturedFaceCount];
			this.anIntArray1989 = new int[this.texturedFaceCount];
			this.anIntArray2000 = new int[this.texturedFaceCount];
			this.anIntArray2001 = new int[this.texturedFaceCount];
			this.aByteArray2005 = new byte[this.texturedFaceCount];
			this.aByteArray1990 = new byte[this.texturedFaceCount];
			this.anIntArray1992 = new int[this.texturedFaceCount];
			this.anIntArray1997 = new int[this.texturedFaceCount];
			this.anIntArray2004 = new int[this.texturedFaceCount];
		}

		if (i_5 > 0) {
			this.aClass84Array2009 = new Class84[i_5];
		}

		if (i_3 > 0) {
			this.aClass87Array2007 = new Class87[i_3];
		}

		if (i_4 > 0) {
			this.aClass172Array2008 = new Class172[i_4];
		}

		this.vertexCount = 0;
		this.anInt1973 = 0;
		this.texturedFaceCount = 0;
		i_3 = 0;
		i_4 = 0;
		i_5 = 0;

		int i_16;
		for (i_12 = 0; i_12 < i_2; i_12++) {
			short s_13 = (short) (1 << i_12);
			RSMesh rsmesh_14 = arr_1[i_12];
			if (rsmesh_14 != null) {
				int i_15;
				if (rsmesh_14.aClass84Array2009 != null) {
					for (i_15 = 0; i_15 < rsmesh_14.aClass84Array2009.length; i_15++) {
						Class84 class84_21 = rsmesh_14.aClass84Array2009[i_15];
						this.aClass84Array2009[i_5++] = class84_21.method1459(class84_21.anInt809 + this.anInt1973, 482846070);
					}
				}

				for (i_15 = 0; i_15 < rsmesh_14.anInt1973; i_15++) {
					if (bool_6 && rsmesh_14.aByteArray1985 != null) {
						this.aByteArray1985[this.anInt1973] = rsmesh_14.aByteArray1985[i_15];
					}

					if (bool_7) {
						if (rsmesh_14.aByteArray1977 != null) {
							this.aByteArray1977[this.anInt1973] = rsmesh_14.aByteArray1977[i_15];
						} else {
							this.aByteArray1977[this.anInt1973] = rsmesh_14.aByte1994;
						}
					}

					if (bool_8 && rsmesh_14.aByteArray1975 != null) {
						this.aByteArray1975[this.anInt1973] = rsmesh_14.aByteArray1975[i_15];
					}

					if (bool_10) {
						if (rsmesh_14.textures != null) {
							this.textures[this.anInt1973] = rsmesh_14.textures[i_15];
						} else {
							this.textures[this.anInt1973] = -1;
						}
					}

					if (bool_11) {
						if (rsmesh_14.anIntArray1991 != null) {
							this.anIntArray1991[this.anInt1973] = rsmesh_14.anIntArray1991[i_15];
						} else {
							this.anIntArray1991[this.anInt1973] = -1;
						}
					}

					this.aShortArray1982[this.anInt1973] = (short) this.method2657(rsmesh_14, rsmesh_14.aShortArray1982[i_15], s_13);
					this.aShortArray1983[this.anInt1973] = (short) this.method2657(rsmesh_14, rsmesh_14.aShortArray1983[i_15], s_13);
					this.aShortArray1984[this.anInt1973] = (short) this.method2657(rsmesh_14, rsmesh_14.aShortArray1984[i_15], s_13);
					this.aShortArray1981[this.anInt1973] = s_13;
					this.colors[this.anInt1973] = rsmesh_14.colors[i_15];
					++this.anInt1973;
				}

				if (rsmesh_14.aClass87Array2007 != null) {
					for (i_15 = 0; i_15 < rsmesh_14.aClass87Array2007.length; i_15++) {
						i_16 = this.method2657(rsmesh_14, rsmesh_14.aClass87Array2007[i_15].anInt836, s_13);
						int i_17 = this.method2657(rsmesh_14, rsmesh_14.aClass87Array2007[i_15].anInt837, s_13);
						int i_18 = this.method2657(rsmesh_14, rsmesh_14.aClass87Array2007[i_15].anInt838, s_13);
						this.aClass87Array2007[i_3] = rsmesh_14.aClass87Array2007[i_15].method1488(i_16, i_17, i_18, (byte) 98);
						++i_3;
					}
				}

				if (rsmesh_14.aClass172Array2008 != null) {
					for (i_15 = 0; i_15 < rsmesh_14.aClass172Array2008.length; i_15++) {
						i_16 = this.method2657(rsmesh_14, rsmesh_14.aClass172Array2008[i_15].anInt2119, s_13);
						this.aClass172Array2008[i_4] = rsmesh_14.aClass172Array2008[i_15].method2911(i_16, -546330898);
						++i_4;
					}
				}
			}
		}

		i_12 = 0;
		this.anInt1999 = this.vertexCount;

		for (int i_23 = 0; i_23 < i_2; i_23++) {
			short s_19 = (short) (1 << i_23);
			RSMesh rsmesh_20 = arr_1[i_23];
			if (rsmesh_20 != null) {
				for (i_16 = 0; i_16 < rsmesh_20.anInt1973; i_16++) {
					if (bool_9) {
						this.aByteArray1988[i_12++] = (byte) (rsmesh_20.aByteArray1988 != null && rsmesh_20.aByteArray1988[i_16] != -1 ? this.texturedFaceCount + rsmesh_20.aByteArray1988[i_16] : -1);
					}
				}

				for (i_16 = 0; i_16 < rsmesh_20.texturedFaceCount; i_16++) {
					byte b_24 = this.aByteArray1995[this.texturedFaceCount] = rsmesh_20.aByteArray1995[i_16];
					if (b_24 == 0) {
						this.aShortArray1996[this.texturedFaceCount] = (short) this.method2657(rsmesh_20, rsmesh_20.aShortArray1996[i_16], s_19);
						this.aShortArray1987[this.texturedFaceCount] = (short) this.method2657(rsmesh_20, rsmesh_20.aShortArray1987[i_16], s_19);
						this.aShortArray1998[this.texturedFaceCount] = (short) this.method2657(rsmesh_20, rsmesh_20.aShortArray1998[i_16], s_19);
					}

					if (b_24 >= 1 && b_24 <= 3) {
						this.aShortArray1996[this.texturedFaceCount] = rsmesh_20.aShortArray1996[i_16];
						this.aShortArray1987[this.texturedFaceCount] = rsmesh_20.aShortArray1987[i_16];
						this.aShortArray1998[this.texturedFaceCount] = rsmesh_20.aShortArray1998[i_16];
						this.anIntArray1989[this.texturedFaceCount] = rsmesh_20.anIntArray1989[i_16];
						this.anIntArray2000[this.texturedFaceCount] = rsmesh_20.anIntArray2000[i_16];
						this.anIntArray2001[this.texturedFaceCount] = rsmesh_20.anIntArray2001[i_16];
						this.aByteArray2005[this.texturedFaceCount] = rsmesh_20.aByteArray2005[i_16];
						this.aByteArray1990[this.texturedFaceCount] = rsmesh_20.aByteArray1990[i_16];
						this.anIntArray1992[this.texturedFaceCount] = rsmesh_20.anIntArray1992[i_16];
					}

					if (b_24 == 2) {
						this.anIntArray1997[this.texturedFaceCount] = rsmesh_20.anIntArray1997[i_16];
						this.anIntArray2004[this.texturedFaceCount] = rsmesh_20.anIntArray2004[i_16];
					}

					++this.texturedFaceCount;
				}
			}
		}

	}

	public RSMesh(int i_1, int i_2, int i_3) {
		this.vertexX = new int[i_1];
		this.vertexY = new int[i_1];
		this.vertexZ = new int[i_1];
		this.anIntArray2002 = new int[i_1];
		this.aShortArray1982 = new short[i_2];
		this.aShortArray1983 = new short[i_2];
		this.aShortArray1984 = new short[i_2];
		this.aByteArray1985 = new byte[i_2];
		this.aByteArray1977 = new byte[i_2];
		this.aByteArray1975 = new byte[i_2];
		this.aByteArray1988 = new byte[i_2];
		this.colors = new short[i_2];
		this.textures = new short[i_2];
		this.anIntArray1991 = new int[i_2];
		if (i_3 > 0) {
			this.aByteArray1995 = new byte[i_3];
			this.aShortArray1996 = new short[i_3];
			this.aShortArray1987 = new short[i_3];
			this.aShortArray1998 = new short[i_3];
			this.anIntArray1989 = new int[i_3];
			this.anIntArray2000 = new int[i_3];
			this.anIntArray2001 = new int[i_3];
			this.aByteArray2005 = new byte[i_3];
			this.aByteArray1990 = new byte[i_3];
			this.anIntArray1992 = new int[i_3];
			this.anIntArray1997 = new int[i_3];
			this.anIntArray2004 = new int[i_3];
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
