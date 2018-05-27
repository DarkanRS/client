/* Class525 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class525 {
	public boolean aBool6968;
	int anInt6969;
	int anInt6970;
	int anInt6971;
	short[] aShortArray6972;
	Class515 aClass515_6973;
	short[] aShortArray6974;
	short[] aShortArray6975;
	int anInt6976;
	public int anInt6977 = 1289004025;
	int anInt6978;
	int anInt6979;
	int anInt6980;
	int anInt6981;
	public byte aByte6982;
	short[] aShortArray6983;
	static int anInt6985;

	public final MeshRasterizer method11225(GraphicalRenderer class505, int i, Class456 class456, byte i_0_) {
		return method11238(class505, i, false, null, null, 0, 0, 0, class456, i_0_, -436815032);
	}

	void method11226(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_1_ = class282_sub35.readUnsignedByte();
			if (i_1_ == 0)
				break;
			method11227(class282_sub35, i_1_, (byte) 106);
		}
	}

	void method11227(RsByteBuffer class282_sub35, int i, byte i_2_) {
		if (i == 1)
			((Class525) this).anInt6970 = class282_sub35.readBigSmart() * 1808779797;
		else if (2 == i)
			anInt6977 = class282_sub35.readBigSmart() * -1289004025;
		else if (i == 4)
			((Class525) this).anInt6976 = class282_sub35.readUnsignedShort() * 729364025;
		else if (5 == i)
			((Class525) this).anInt6971 = class282_sub35.readUnsignedShort() * 242404465;
		else if (6 == i)
			((Class525) this).anInt6978 = class282_sub35.readUnsignedShort() * 2018024999;
		else if (i == 7)
			((Class525) this).anInt6979 = class282_sub35.readUnsignedByte() * -711868515;
		else if (i == 8)
			((Class525) this).anInt6981 = class282_sub35.readUnsignedByte() * 1625378755;
		else if (i == 9) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = 307512160;
		} else if (i == 10)
			aBool6968 = true;
		else if (i == 11)
			aByte6982 = (byte) 1;
		else if (12 == i)
			aByte6982 = (byte) 4;
		else if (i == 13)
			aByte6982 = (byte) 5;
		else if (i == 14) {
			aByte6982 = (byte) 2;
			((Class525) this).anInt6980 = class282_sub35.readUnsignedByte() * 193403648;
		} else if (15 == i) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = class282_sub35.readUnsignedShort() * -720664805;
		} else if (16 == i) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = class282_sub35.readInt() * -720664805;
		} else if (40 == i) {
			int i_3_ = class282_sub35.readUnsignedByte();
			((Class525) this).aShortArray6972 = new short[i_3_];
			((Class525) this).aShortArray6983 = new short[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				((Class525) this).aShortArray6972[i_4_] = (short) class282_sub35.readUnsignedShort();
				((Class525) this).aShortArray6983[i_4_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_5_ = class282_sub35.readUnsignedByte();
			((Class525) this).aShortArray6974 = new short[i_5_];
			((Class525) this).aShortArray6975 = new short[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				((Class525) this).aShortArray6974[i_6_] = (short) class282_sub35.readUnsignedShort();
				((Class525) this).aShortArray6975[i_6_] = (short) class282_sub35.readUnsignedShort();
			}
		}
	}

	public final MeshRasterizer method11228(GraphicalRenderer class505, int i, Class456 class456, byte i_7_, byte i_8_) {
		return method11238(class505, i, false, null, null, 0, 0, 0, class456, i_7_, -2132170713);
	}

	public final MeshRasterizer method11229(GraphicalRenderer class505, int i, boolean bool, Class390 class390, Class390 class390_9_, int i_10_, int i_11_, int i_12_, Class456 class456, byte i_13_) {
		int i_14_ = i;
		bool = bool & 0 != aByte6982;
		if (class456 != null)
			i_14_ |= class456.method7640(-2073715433);
		if (bool)
			i_14_ = i_14_ | (3 == aByte6982 ? 7 : 2);
		if (128 != 692548753 * ((Class525) this).anInt6971)
			i_14_ |= 0x2;
		if (128 != 1122359305 * ((Class525) this).anInt6976 || 0 != -1032261225 * ((Class525) this).anInt6978)
			i_14_ |= 0x5;
		MeshRasterizer class528;
		synchronized (((Class515) ((Class525) this).aClass515_6973).aClass229_5890) {
			class528 = ((MeshRasterizer) (((Class515) ((Class525) this).aClass515_6973).aClass229_5890.get((long) ((((Class525) this).anInt6969 = (-195085151 * (-1254250655 * ((Class525) this).anInt6969 | class505.rendererId * -413843045 << 29))) * -1254250655))));
		}
		if (class528 == null || class505.method8452(class528.m(), i_14_) != 0) {
			if (null != class528)
				i_14_ = class505.method8546(i_14_, class528.m());
			int i_15_ = i_14_;
			if (((Class525) this).aShortArray6972 != null)
				i_15_ |= 0x4000;
			if (((Class525) this).aShortArray6974 != null)
				i_15_ |= 0x8000;
			RSMesh class157 = RSMesh.decodeMesh((((Class515) ((Class525) this).aClass515_6973).aClass317_5889), (-2110999235 * ((Class525) this).anInt6970), 0);
			if (null == class157)
				return null;
			if (class157.zoom < 13)
				class157.upscale(2);
			class528 = (class505.createMeshRasterizer(class157, i_15_, 497536981 * (((Class515) ((Class525) this).aClass515_6973).anInt5892), 64 + ((Class525) this).anInt6979 * -90063179, 850 + ((Class525) this).anInt6981 * 1106286827));
			if (((Class525) this).aShortArray6972 != null) {
				for (int i_16_ = 0; i_16_ < ((Class525) this).aShortArray6972.length; i_16_++)
					class528.X(((Class525) this).aShortArray6972[i_16_], ((Class525) this).aShortArray6983[i_16_]);
			}
			if (null != ((Class525) this).aShortArray6974) {
				for (int i_17_ = 0; i_17_ < ((Class525) this).aShortArray6974.length; i_17_++)
					class528.W(((Class525) this).aShortArray6974[i_17_], ((Class525) this).aShortArray6975[i_17_]);
			}
			class528.KA(i_14_);
			synchronized (((Class515) ((Class525) this).aClass515_6973).aClass229_5890) {
				((Class515) ((Class525) this).aClass515_6973).aClass229_5890.put(class528, (long) ((((Class525) this).anInt6969 = (-195085151 * (-1254250655 * ((Class525) this).anInt6969 | -413843045 * class505.rendererId << 29))) * -1254250655));
			}
		}
		MeshRasterizer class528_18_ = class528.method11289(i_13_, i_14_, true);
		if (class456 != null)
			class456.method7577(class528_18_, 0, 16711935);
		if (1122359305 * ((Class525) this).anInt6976 != 128 || ((Class525) this).anInt6971 * 692548753 != 128)
			class528_18_.oa(((Class525) this).anInt6976 * 1122359305, ((Class525) this).anInt6971 * 692548753, 1122359305 * ((Class525) this).anInt6976);
		if (-1032261225 * ((Class525) this).anInt6978 != 0) {
			if (90 == ((Class525) this).anInt6978 * -1032261225)
				class528_18_.f(4096);
			if (-1032261225 * ((Class525) this).anInt6978 == 180)
				class528_18_.f(8192);
			if (-1032261225 * ((Class525) this).anInt6978 == 270)
				class528_18_.f(12288);
		}
		if (bool)
			class528_18_.pa(aByte6982, ((Class525) this).anInt6980 * -1352565997, class390, class390_9_, i_10_, i_11_, i_12_);
		class528_18_.KA(i);
		return class528_18_;
	}

	Class525() {
		((Class525) this).anInt6976 = -1130685312;
		((Class525) this).anInt6971 = 963000448;
		((Class525) this).anInt6978 = 0;
		((Class525) this).anInt6979 = 0;
		((Class525) this).anInt6981 = 0;
		aBool6968 = false;
		aByte6982 = (byte) 0;
		((Class525) this).anInt6980 = 720664805;
	}

	public final boolean method11230(int i) {
		if (-2110999235 * ((Class525) this).anInt6970 == -1)
			return true;
		return (((Class515) ((Class525) this).aClass515_6973).aClass317_5889.load(-2110999235 * ((Class525) this).anInt6970, 0, 16711935));
	}

	void method11231(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method11227(class282_sub35, i, (byte) 8);
		}
	}

	public final MeshRasterizer method11232(GraphicalRenderer class505, int i, boolean bool, Class390 class390, Class390 class390_19_, int i_20_, int i_21_, int i_22_, Class456 class456, byte i_23_) {
		int i_24_ = i;
		bool = bool & 0 != aByte6982;
		if (class456 != null)
			i_24_ |= class456.method7640(-806804280);
		if (bool)
			i_24_ = i_24_ | (3 == aByte6982 ? 7 : 2);
		if (128 != 692548753 * ((Class525) this).anInt6971)
			i_24_ |= 0x2;
		if (128 != 1122359305 * ((Class525) this).anInt6976 || 0 != -1032261225 * ((Class525) this).anInt6978)
			i_24_ |= 0x5;
		MeshRasterizer class528;
		synchronized (((Class515) ((Class525) this).aClass515_6973).aClass229_5890) {
			class528 = ((MeshRasterizer) (((Class515) ((Class525) this).aClass515_6973).aClass229_5890.get((long) ((((Class525) this).anInt6969 = (-195085151 * (-1254250655 * ((Class525) this).anInt6969 | class505.rendererId * -413843045 << 29))) * -1254250655))));
		}
		if (class528 == null || class505.method8452(class528.m(), i_24_) != 0) {
			if (null != class528)
				i_24_ = class505.method8546(i_24_, class528.m());
			int i_25_ = i_24_;
			if (((Class525) this).aShortArray6972 != null)
				i_25_ |= 0x4000;
			if (((Class525) this).aShortArray6974 != null)
				i_25_ |= 0x8000;
			RSMesh class157 = RSMesh.decodeMesh((((Class515) ((Class525) this).aClass515_6973).aClass317_5889), (-2110999235 * ((Class525) this).anInt6970), 0);
			if (null == class157)
				return null;
			if (class157.zoom < 13)
				class157.upscale(2);
			class528 = (class505.createMeshRasterizer(class157, i_25_, 497536981 * (((Class515) ((Class525) this).aClass515_6973).anInt5892), 64 + ((Class525) this).anInt6979 * -90063179, 850 + ((Class525) this).anInt6981 * 1106286827));
			if (((Class525) this).aShortArray6972 != null) {
				for (int i_26_ = 0; i_26_ < ((Class525) this).aShortArray6972.length; i_26_++)
					class528.X(((Class525) this).aShortArray6972[i_26_], ((Class525) this).aShortArray6983[i_26_]);
			}
			if (null != ((Class525) this).aShortArray6974) {
				for (int i_27_ = 0; i_27_ < ((Class525) this).aShortArray6974.length; i_27_++)
					class528.W(((Class525) this).aShortArray6974[i_27_], ((Class525) this).aShortArray6975[i_27_]);
			}
			class528.KA(i_24_);
			synchronized (((Class515) ((Class525) this).aClass515_6973).aClass229_5890) {
				((Class515) ((Class525) this).aClass515_6973).aClass229_5890.put(class528, (long) ((((Class525) this).anInt6969 = (-195085151 * (-1254250655 * ((Class525) this).anInt6969 | -413843045 * class505.rendererId << 29))) * -1254250655));
			}
		}
		MeshRasterizer class528_28_ = class528.method11289(i_23_, i_24_, true);
		if (class456 != null)
			class456.method7577(class528_28_, 0, 16711935);
		if (1122359305 * ((Class525) this).anInt6976 != 128 || ((Class525) this).anInt6971 * 692548753 != 128)
			class528_28_.oa(((Class525) this).anInt6976 * 1122359305, ((Class525) this).anInt6971 * 692548753, 1122359305 * ((Class525) this).anInt6976);
		if (-1032261225 * ((Class525) this).anInt6978 != 0) {
			if (90 == ((Class525) this).anInt6978 * -1032261225)
				class528_28_.f(4096);
			if (-1032261225 * ((Class525) this).anInt6978 == 180)
				class528_28_.f(8192);
			if (-1032261225 * ((Class525) this).anInt6978 == 270)
				class528_28_.f(12288);
		}
		if (bool)
			class528_28_.pa(aByte6982, ((Class525) this).anInt6980 * -1352565997, class390, class390_19_, i_20_, i_21_, i_22_);
		class528_28_.KA(i);
		return class528_28_;
	}

	void method11233(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			((Class525) this).anInt6970 = class282_sub35.readBigSmart() * 1808779797;
		else if (2 == i)
			anInt6977 = class282_sub35.readBigSmart() * -1289004025;
		else if (i == 4)
			((Class525) this).anInt6976 = class282_sub35.readUnsignedShort() * 729364025;
		else if (5 == i)
			((Class525) this).anInt6971 = class282_sub35.readUnsignedShort() * 242404465;
		else if (6 == i)
			((Class525) this).anInt6978 = class282_sub35.readUnsignedShort() * 2018024999;
		else if (i == 7)
			((Class525) this).anInt6979 = class282_sub35.readUnsignedByte() * -711868515;
		else if (i == 8)
			((Class525) this).anInt6981 = class282_sub35.readUnsignedByte() * 1625378755;
		else if (i == 9) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = 307512160;
		} else if (i == 10)
			aBool6968 = true;
		else if (i == 11)
			aByte6982 = (byte) 1;
		else if (12 == i)
			aByte6982 = (byte) 4;
		else if (i == 13)
			aByte6982 = (byte) 5;
		else if (i == 14) {
			aByte6982 = (byte) 2;
			((Class525) this).anInt6980 = class282_sub35.readUnsignedByte() * 193403648;
		} else if (15 == i) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = class282_sub35.readUnsignedShort() * -720664805;
		} else if (16 == i) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = class282_sub35.readInt() * -720664805;
		} else if (40 == i) {
			int i_29_ = class282_sub35.readUnsignedByte();
			((Class525) this).aShortArray6972 = new short[i_29_];
			((Class525) this).aShortArray6983 = new short[i_29_];
			for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
				((Class525) this).aShortArray6972[i_30_] = (short) class282_sub35.readUnsignedShort();
				((Class525) this).aShortArray6983[i_30_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_31_ = class282_sub35.readUnsignedByte();
			((Class525) this).aShortArray6974 = new short[i_31_];
			((Class525) this).aShortArray6975 = new short[i_31_];
			for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
				((Class525) this).aShortArray6974[i_32_] = (short) class282_sub35.readUnsignedShort();
				((Class525) this).aShortArray6975[i_32_] = (short) class282_sub35.readUnsignedShort();
			}
		}
	}

	void method11234(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			((Class525) this).anInt6970 = class282_sub35.readBigSmart() * 1808779797;
		else if (2 == i)
			anInt6977 = class282_sub35.readBigSmart() * -1289004025;
		else if (i == 4)
			((Class525) this).anInt6976 = class282_sub35.readUnsignedShort() * 729364025;
		else if (5 == i)
			((Class525) this).anInt6971 = class282_sub35.readUnsignedShort() * 242404465;
		else if (6 == i)
			((Class525) this).anInt6978 = class282_sub35.readUnsignedShort() * 2018024999;
		else if (i == 7)
			((Class525) this).anInt6979 = class282_sub35.readUnsignedByte() * -711868515;
		else if (i == 8)
			((Class525) this).anInt6981 = class282_sub35.readUnsignedByte() * 1625378755;
		else if (i == 9) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = 307512160;
		} else if (i == 10)
			aBool6968 = true;
		else if (i == 11)
			aByte6982 = (byte) 1;
		else if (12 == i)
			aByte6982 = (byte) 4;
		else if (i == 13)
			aByte6982 = (byte) 5;
		else if (i == 14) {
			aByte6982 = (byte) 2;
			((Class525) this).anInt6980 = class282_sub35.readUnsignedByte() * 193403648;
		} else if (15 == i) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = class282_sub35.readUnsignedShort() * -720664805;
		} else if (16 == i) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = class282_sub35.readInt() * -720664805;
		} else if (40 == i) {
			int i_33_ = class282_sub35.readUnsignedByte();
			((Class525) this).aShortArray6972 = new short[i_33_];
			((Class525) this).aShortArray6983 = new short[i_33_];
			for (int i_34_ = 0; i_34_ < i_33_; i_34_++) {
				((Class525) this).aShortArray6972[i_34_] = (short) class282_sub35.readUnsignedShort();
				((Class525) this).aShortArray6983[i_34_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_35_ = class282_sub35.readUnsignedByte();
			((Class525) this).aShortArray6974 = new short[i_35_];
			((Class525) this).aShortArray6975 = new short[i_35_];
			for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
				((Class525) this).aShortArray6974[i_36_] = (short) class282_sub35.readUnsignedShort();
				((Class525) this).aShortArray6975[i_36_] = (short) class282_sub35.readUnsignedShort();
			}
		}
	}

	void method11235(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			((Class525) this).anInt6970 = class282_sub35.readBigSmart() * 1808779797;
		else if (2 == i)
			anInt6977 = class282_sub35.readBigSmart() * -1289004025;
		else if (i == 4)
			((Class525) this).anInt6976 = class282_sub35.readUnsignedShort() * 729364025;
		else if (5 == i)
			((Class525) this).anInt6971 = class282_sub35.readUnsignedShort() * 242404465;
		else if (6 == i)
			((Class525) this).anInt6978 = class282_sub35.readUnsignedShort() * 2018024999;
		else if (i == 7)
			((Class525) this).anInt6979 = class282_sub35.readUnsignedByte() * -711868515;
		else if (i == 8)
			((Class525) this).anInt6981 = class282_sub35.readUnsignedByte() * 1625378755;
		else if (i == 9) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = 307512160;
		} else if (i == 10)
			aBool6968 = true;
		else if (i == 11)
			aByte6982 = (byte) 1;
		else if (12 == i)
			aByte6982 = (byte) 4;
		else if (i == 13)
			aByte6982 = (byte) 5;
		else if (i == 14) {
			aByte6982 = (byte) 2;
			((Class525) this).anInt6980 = class282_sub35.readUnsignedByte() * 193403648;
		} else if (15 == i) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = class282_sub35.readUnsignedShort() * -720664805;
		} else if (16 == i) {
			aByte6982 = (byte) 3;
			((Class525) this).anInt6980 = class282_sub35.readInt() * -720664805;
		} else if (40 == i) {
			int i_37_ = class282_sub35.readUnsignedByte();
			((Class525) this).aShortArray6972 = new short[i_37_];
			((Class525) this).aShortArray6983 = new short[i_37_];
			for (int i_38_ = 0; i_38_ < i_37_; i_38_++) {
				((Class525) this).aShortArray6972[i_38_] = (short) class282_sub35.readUnsignedShort();
				((Class525) this).aShortArray6983[i_38_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_39_ = class282_sub35.readUnsignedByte();
			((Class525) this).aShortArray6974 = new short[i_39_];
			((Class525) this).aShortArray6975 = new short[i_39_];
			for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
				((Class525) this).aShortArray6974[i_40_] = (short) class282_sub35.readUnsignedShort();
				((Class525) this).aShortArray6975[i_40_] = (short) class282_sub35.readUnsignedShort();
			}
		}
	}

	public final MeshRasterizer method11236(GraphicalRenderer class505, int i, Class456 class456, byte i_41_) {
		return method11238(class505, i, false, null, null, 0, 0, 0, class456, i_41_, -1144492726);
	}

	void method11237(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method11227(class282_sub35, i, (byte) 119);
		}
	}

	public final MeshRasterizer method11238(GraphicalRenderer class505, int i, boolean bool, Class390 class390, Class390 class390_42_, int i_43_, int i_44_, int i_45_, Class456 class456, byte i_46_, int i_47_) {
		int i_48_ = i;
		bool = bool & 0 != aByte6982;
		if (class456 != null)
			i_48_ |= class456.method7640(-1098428491);
		if (bool)
			i_48_ = i_48_ | (3 == aByte6982 ? 7 : 2);
		if (128 != 692548753 * ((Class525) this).anInt6971)
			i_48_ |= 0x2;
		if (128 != 1122359305 * ((Class525) this).anInt6976 || 0 != -1032261225 * ((Class525) this).anInt6978)
			i_48_ |= 0x5;
		MeshRasterizer class528;
		synchronized (((Class515) ((Class525) this).aClass515_6973).aClass229_5890) {
			class528 = ((MeshRasterizer) (((Class515) ((Class525) this).aClass515_6973).aClass229_5890.get((long) ((((Class525) this).anInt6969 = (-195085151 * (-1254250655 * ((Class525) this).anInt6969 | class505.rendererId * -413843045 << 29))) * -1254250655))));
		}
		if (class528 == null || class505.method8452(class528.m(), i_48_) != 0) {
			if (null != class528)
				i_48_ = class505.method8546(i_48_, class528.m());
			int i_49_ = i_48_;
			if (((Class525) this).aShortArray6972 != null)
				i_49_ |= 0x4000;
			if (((Class525) this).aShortArray6974 != null)
				i_49_ |= 0x8000;
			RSMesh class157 = RSMesh.decodeMesh((((Class515) ((Class525) this).aClass515_6973).aClass317_5889), (-2110999235 * ((Class525) this).anInt6970), 0);
			if (null == class157)
				return null;
			if (class157.zoom < 13)
				class157.upscale(2);
			class528 = (class505.createMeshRasterizer(class157, i_49_, 497536981 * (((Class515) ((Class525) this).aClass515_6973).anInt5892), 64 + ((Class525) this).anInt6979 * -90063179, 850 + ((Class525) this).anInt6981 * 1106286827));
			if (((Class525) this).aShortArray6972 != null) {
				for (int i_50_ = 0; i_50_ < ((Class525) this).aShortArray6972.length; i_50_++)
					class528.X(((Class525) this).aShortArray6972[i_50_], ((Class525) this).aShortArray6983[i_50_]);
			}
			if (null != ((Class525) this).aShortArray6974) {
				for (int i_51_ = 0; i_51_ < ((Class525) this).aShortArray6974.length; i_51_++)
					class528.W(((Class525) this).aShortArray6974[i_51_], ((Class525) this).aShortArray6975[i_51_]);
			}
			class528.KA(i_48_);
			synchronized (((Class515) ((Class525) this).aClass515_6973).aClass229_5890) {
				((Class515) ((Class525) this).aClass515_6973).aClass229_5890.put(class528, (long) ((((Class525) this).anInt6969 = (-195085151 * (-1254250655 * ((Class525) this).anInt6969 | -413843045 * class505.rendererId << 29))) * -1254250655));
			}
		}
		MeshRasterizer class528_52_ = class528.method11289(i_46_, i_48_, true);
		if (class456 != null)
			class456.method7577(class528_52_, 0, 16711935);
		if (1122359305 * ((Class525) this).anInt6976 != 128 || ((Class525) this).anInt6971 * 692548753 != 128)
			class528_52_.oa(((Class525) this).anInt6976 * 1122359305, ((Class525) this).anInt6971 * 692548753, 1122359305 * ((Class525) this).anInt6976);
		if (-1032261225 * ((Class525) this).anInt6978 != 0) {
			if (90 == ((Class525) this).anInt6978 * -1032261225)
				class528_52_.f(4096);
			if (-1032261225 * ((Class525) this).anInt6978 == 180)
				class528_52_.f(8192);
			if (-1032261225 * ((Class525) this).anInt6978 == 270)
				class528_52_.f(12288);
		}
		if (bool)
			class528_52_.pa(aByte6982, ((Class525) this).anInt6980 * -1352565997, class390, class390_42_, i_43_, i_44_, i_45_);
		class528_52_.KA(i);
		return class528_52_;
	}

	public final MeshRasterizer method11239(GraphicalRenderer class505, int i, Class456 class456, byte i_53_) {
		return method11238(class505, i, false, null, null, 0, 0, 0, class456, i_53_, -658189521);
	}

	public final MeshRasterizer method11240(GraphicalRenderer class505, int i, boolean bool, Class390 class390, Class390 class390_54_, int i_55_, int i_56_, int i_57_, Class456 class456, byte i_58_) {
		int i_59_ = i;
		bool = bool & 0 != aByte6982;
		if (class456 != null)
			i_59_ |= class456.method7640(-1634723481);
		if (bool)
			i_59_ = i_59_ | (3 == aByte6982 ? 7 : 2);
		if (128 != 692548753 * ((Class525) this).anInt6971)
			i_59_ |= 0x2;
		if (128 != 1122359305 * ((Class525) this).anInt6976 || 0 != -1032261225 * ((Class525) this).anInt6978)
			i_59_ |= 0x5;
		MeshRasterizer class528;
		synchronized (((Class515) ((Class525) this).aClass515_6973).aClass229_5890) {
			class528 = ((MeshRasterizer) (((Class515) ((Class525) this).aClass515_6973).aClass229_5890.get((long) ((((Class525) this).anInt6969 = (-195085151 * (-1254250655 * ((Class525) this).anInt6969 | class505.rendererId * -413843045 << 29))) * -1254250655))));
		}
		if (class528 == null || class505.method8452(class528.m(), i_59_) != 0) {
			if (null != class528)
				i_59_ = class505.method8546(i_59_, class528.m());
			int i_60_ = i_59_;
			if (((Class525) this).aShortArray6972 != null)
				i_60_ |= 0x4000;
			if (((Class525) this).aShortArray6974 != null)
				i_60_ |= 0x8000;
			RSMesh class157 = RSMesh.decodeMesh((((Class515) ((Class525) this).aClass515_6973).aClass317_5889), (-2110999235 * ((Class525) this).anInt6970), 0);
			if (null == class157)
				return null;
			if (class157.zoom < 13)
				class157.upscale(2);
			class528 = (class505.createMeshRasterizer(class157, i_60_, 497536981 * (((Class515) ((Class525) this).aClass515_6973).anInt5892), 64 + ((Class525) this).anInt6979 * -90063179, 850 + ((Class525) this).anInt6981 * 1106286827));
			if (((Class525) this).aShortArray6972 != null) {
				for (int i_61_ = 0; i_61_ < ((Class525) this).aShortArray6972.length; i_61_++)
					class528.X(((Class525) this).aShortArray6972[i_61_], ((Class525) this).aShortArray6983[i_61_]);
			}
			if (null != ((Class525) this).aShortArray6974) {
				for (int i_62_ = 0; i_62_ < ((Class525) this).aShortArray6974.length; i_62_++)
					class528.W(((Class525) this).aShortArray6974[i_62_], ((Class525) this).aShortArray6975[i_62_]);
			}
			class528.KA(i_59_);
			synchronized (((Class515) ((Class525) this).aClass515_6973).aClass229_5890) {
				((Class515) ((Class525) this).aClass515_6973).aClass229_5890.put(class528, (long) ((((Class525) this).anInt6969 = (-195085151 * (-1254250655 * ((Class525) this).anInt6969 | -413843045 * class505.rendererId << 29))) * -1254250655));
			}
		}
		MeshRasterizer class528_63_ = class528.method11289(i_58_, i_59_, true);
		if (class456 != null)
			class456.method7577(class528_63_, 0, 16711935);
		if (1122359305 * ((Class525) this).anInt6976 != 128 || ((Class525) this).anInt6971 * 692548753 != 128)
			class528_63_.oa(((Class525) this).anInt6976 * 1122359305, ((Class525) this).anInt6971 * 692548753, 1122359305 * ((Class525) this).anInt6976);
		if (-1032261225 * ((Class525) this).anInt6978 != 0) {
			if (90 == ((Class525) this).anInt6978 * -1032261225)
				class528_63_.f(4096);
			if (-1032261225 * ((Class525) this).anInt6978 == 180)
				class528_63_.f(8192);
			if (-1032261225 * ((Class525) this).anInt6978 == 270)
				class528_63_.f(12288);
		}
		if (bool)
			class528_63_.pa(aByte6982, ((Class525) this).anInt6980 * -1352565997, class390, class390_54_, i_55_, i_56_, i_57_);
		class528_63_.KA(i);
		return class528_63_;
	}

	public final MeshRasterizer method11241(GraphicalRenderer class505, int i, boolean bool, Class390 class390, Class390 class390_64_, int i_65_, int i_66_, int i_67_, Class456 class456, byte i_68_) {
		int i_69_ = i;
		bool = bool & 0 != aByte6982;
		if (class456 != null)
			i_69_ |= class456.method7640(-2128465235);
		if (bool)
			i_69_ = i_69_ | (3 == aByte6982 ? 7 : 2);
		if (128 != 692548753 * ((Class525) this).anInt6971)
			i_69_ |= 0x2;
		if (128 != 1122359305 * ((Class525) this).anInt6976 || 0 != -1032261225 * ((Class525) this).anInt6978)
			i_69_ |= 0x5;
		MeshRasterizer class528;
		synchronized (((Class515) ((Class525) this).aClass515_6973).aClass229_5890) {
			class528 = ((MeshRasterizer) (((Class515) ((Class525) this).aClass515_6973).aClass229_5890.get((long) ((((Class525) this).anInt6969 = (-195085151 * (-1254250655 * ((Class525) this).anInt6969 | class505.rendererId * -413843045 << 29))) * -1254250655))));
		}
		if (class528 == null || class505.method8452(class528.m(), i_69_) != 0) {
			if (null != class528)
				i_69_ = class505.method8546(i_69_, class528.m());
			int i_70_ = i_69_;
			if (((Class525) this).aShortArray6972 != null)
				i_70_ |= 0x4000;
			if (((Class525) this).aShortArray6974 != null)
				i_70_ |= 0x8000;
			RSMesh class157 = RSMesh.decodeMesh((((Class515) ((Class525) this).aClass515_6973).aClass317_5889), (-2110999235 * ((Class525) this).anInt6970), 0);
			if (null == class157)
				return null;
			if (class157.zoom < 13)
				class157.upscale(2);
			class528 = (class505.createMeshRasterizer(class157, i_70_, 497536981 * (((Class515) ((Class525) this).aClass515_6973).anInt5892), 64 + ((Class525) this).anInt6979 * -90063179, 850 + ((Class525) this).anInt6981 * 1106286827));
			if (((Class525) this).aShortArray6972 != null) {
				for (int i_71_ = 0; i_71_ < ((Class525) this).aShortArray6972.length; i_71_++)
					class528.X(((Class525) this).aShortArray6972[i_71_], ((Class525) this).aShortArray6983[i_71_]);
			}
			if (null != ((Class525) this).aShortArray6974) {
				for (int i_72_ = 0; i_72_ < ((Class525) this).aShortArray6974.length; i_72_++)
					class528.W(((Class525) this).aShortArray6974[i_72_], ((Class525) this).aShortArray6975[i_72_]);
			}
			class528.KA(i_69_);
			synchronized (((Class515) ((Class525) this).aClass515_6973).aClass229_5890) {
				((Class515) ((Class525) this).aClass515_6973).aClass229_5890.put(class528, (long) ((((Class525) this).anInt6969 = (-195085151 * (-1254250655 * ((Class525) this).anInt6969 | -413843045 * class505.rendererId << 29))) * -1254250655));
			}
		}
		MeshRasterizer class528_73_ = class528.method11289(i_68_, i_69_, true);
		if (class456 != null)
			class456.method7577(class528_73_, 0, 16711935);
		if (1122359305 * ((Class525) this).anInt6976 != 128 || ((Class525) this).anInt6971 * 692548753 != 128)
			class528_73_.oa(((Class525) this).anInt6976 * 1122359305, ((Class525) this).anInt6971 * 692548753, 1122359305 * ((Class525) this).anInt6976);
		if (-1032261225 * ((Class525) this).anInt6978 != 0) {
			if (90 == ((Class525) this).anInt6978 * -1032261225)
				class528_73_.f(4096);
			if (-1032261225 * ((Class525) this).anInt6978 == 180)
				class528_73_.f(8192);
			if (-1032261225 * ((Class525) this).anInt6978 == 270)
				class528_73_.f(12288);
		}
		if (bool)
			class528_73_.pa(aByte6982, ((Class525) this).anInt6980 * -1352565997, class390, class390_64_, i_65_, i_66_, i_67_);
		class528_73_.KA(i);
		return class528_73_;
	}

	public final boolean method11242() {
		if (-2110999235 * ((Class525) this).anInt6970 == -1)
			return true;
		return (((Class515) ((Class525) this).aClass515_6973).aClass317_5889.load(-2110999235 * ((Class525) this).anInt6970, 0, 16711935));
	}

	static void method11243(int i) {
		if (Class298.method5303((byte) 39)) {
			if (Class13.aStringArray129 == null)
				FontRenderer.method402(-26055309);
			Class179.aBool2229 = true;
			Class179.anInt2221 = 0;
		}
	}

	static final void method11244(CS2Executor class527, int i) {
		Class217_Sub1 class217_sub1 = Class77.method1368(1851142340);
		if (null != class217_sub1) {
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 157132839 * class217_sub1.anInt7975;
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2700 * 1203083985;
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7977;
			Class213 class213 = class217_sub1.method13055((short) -24683);
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -216896281 * class213.anInt2680;
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = class213.aString2679;
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 652811625 * class217_sub1.anInt2701;
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -129507359 * class217_sub1.anInt7978;
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7976;
		} else {
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -1;
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}
}
