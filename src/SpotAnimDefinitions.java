/* Class525 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SpotAnimDefinitions {
	public boolean aBool6968;
	int anInt6969;
	int defaultModel;
	int anInt6971;
	short[] aShortArray6972;
	SpotAnimIndexLoader aClass515_6973;
	short[] aShortArray6974;
	short[] aShortArray6975;
	int anInt6976;
	public int animationId = 1289004025;
	int anInt6978;
	int anInt6979;
	int anInt6980;
	int anInt6981;
	public byte aByte6982;
	short[] aShortArray6983;
	static int anInt6985;

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
			defaultModel = class282_sub35.readBigSmart() * 1808779797;
		else if (2 == i)
			animationId = class282_sub35.readBigSmart() * -1289004025;
		else if (i == 4)
			anInt6976 = class282_sub35.readUnsignedShort() * 729364025;
		else if (5 == i)
			anInt6971 = class282_sub35.readUnsignedShort() * 242404465;
		else if (6 == i)
			anInt6978 = class282_sub35.readUnsignedShort() * 2018024999;
		else if (i == 7)
			anInt6979 = class282_sub35.readUnsignedByte() * -711868515;
		else if (i == 8)
			anInt6981 = class282_sub35.readUnsignedByte() * 1625378755;
		else if (i == 9) {
			aByte6982 = (byte) 3;
			anInt6980 = 307512160;
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
			anInt6980 = class282_sub35.readUnsignedByte() * 193403648;
		} else if (15 == i) {
			aByte6982 = (byte) 3;
			anInt6980 = class282_sub35.readUnsignedShort() * -720664805;
		} else if (16 == i) {
			aByte6982 = (byte) 3;
			anInt6980 = class282_sub35.readInt() * -720664805;
		} else if (40 == i) {
			int i_3_ = class282_sub35.readUnsignedByte();
			aShortArray6972 = new short[i_3_];
			aShortArray6983 = new short[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				aShortArray6972[i_4_] = (short) class282_sub35.readUnsignedShort();
				aShortArray6983[i_4_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_5_ = class282_sub35.readUnsignedByte();
			aShortArray6974 = new short[i_5_];
			aShortArray6975 = new short[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				aShortArray6974[i_6_] = (short) class282_sub35.readUnsignedShort();
				aShortArray6975[i_6_] = (short) class282_sub35.readUnsignedShort();
			}
		}
	}

	public final MeshRasterizer method11228(GraphicalRenderer class505, int i, Animation class456, byte i_7_, byte i_8_) {
		return method11238(class505, i, false, null, null, 0, 0, 0, class456, i_7_, -2132170713);
	}

	SpotAnimDefinitions() {
		anInt6976 = -1130685312;
		anInt6971 = 963000448;
		anInt6978 = 0;
		anInt6979 = 0;
		anInt6981 = 0;
		aBool6968 = false;
		aByte6982 = (byte) 0;
		anInt6980 = 720664805;
	}

	public final boolean method11230(int i) {
		if (-2110999235 * defaultModel == -1)
			return true;
		return (((SpotAnimIndexLoader) aClass515_6973).aClass317_5889.load(-2110999235 * defaultModel, 0));
	}

	public final MeshRasterizer method11238(GraphicalRenderer class505, int i, boolean bool, Class390 class390, Class390 class390_42_, int i_43_, int i_44_, int i_45_, Animation class456, byte i_46_, int i_47_) {
		int i_48_ = i;
		bool = bool & 0 != aByte6982;
		if (class456 != null)
			i_48_ |= class456.method7640(-1098428491);
		if (bool)
			i_48_ = i_48_ | (3 == aByte6982 ? 7 : 2);
		if (128 != 692548753 * anInt6971)
			i_48_ |= 0x2;
		if (128 != 1122359305 * anInt6976 || 0 != -1032261225 * anInt6978)
			i_48_ |= 0x5;
		MeshRasterizer class528;
		synchronized (((SpotAnimIndexLoader) aClass515_6973).aClass229_5890) {
			class528 = ((MeshRasterizer) (((SpotAnimIndexLoader) aClass515_6973).aClass229_5890.get((long) ((anInt6969 = (-195085151 * (-1254250655 * anInt6969 | class505.rendererId * -413843045 << 29))) * -1254250655))));
		}
		if (class528 == null || class505.method8452(class528.m(), i_48_) != 0) {
			if (null != class528)
				i_48_ = class505.method8546(i_48_, class528.m());
			int i_49_ = i_48_;
			if (aShortArray6972 != null)
				i_49_ |= 0x4000;
			if (aShortArray6974 != null)
				i_49_ |= 0x8000;
			RSMesh class157 = RSMesh.decodeMesh((((SpotAnimIndexLoader) aClass515_6973).aClass317_5889), (-2110999235 * defaultModel), 0);
			if (null == class157)
				return null;
			if (class157.zoom < 13)
				class157.upscale(2);
			class528 = (class505.createMeshRasterizer(class157, i_49_, 497536981 * (((SpotAnimIndexLoader) aClass515_6973).anInt5892), 64 + anInt6979 * -90063179, 850 + anInt6981 * 1106286827));
			if (aShortArray6972 != null) {
				for (int i_50_ = 0; i_50_ < aShortArray6972.length; i_50_++)
					class528.X(aShortArray6972[i_50_], aShortArray6983[i_50_]);
			}
			if (null != aShortArray6974) {
				for (int i_51_ = 0; i_51_ < aShortArray6974.length; i_51_++)
					class528.W(aShortArray6974[i_51_], aShortArray6975[i_51_]);
			}
			class528.KA(i_48_);
			synchronized (((SpotAnimIndexLoader) aClass515_6973).aClass229_5890) {
				((SpotAnimIndexLoader) aClass515_6973).aClass229_5890.put(class528, (long) ((anInt6969 = (-195085151 * (-1254250655 * anInt6969 | -413843045 * class505.rendererId << 29))) * -1254250655));
			}
		}
		MeshRasterizer class528_52_ = class528.method11289(i_46_, i_48_, true);
		if (class456 != null)
			class456.method7577(class528_52_, 0, 16711935);
		if (1122359305 * anInt6976 != 128 || anInt6971 * 692548753 != 128)
			class528_52_.oa(anInt6976 * 1122359305, anInt6971 * 692548753, 1122359305 * anInt6976);
		if (-1032261225 * anInt6978 != 0) {
			if (90 == anInt6978 * -1032261225)
				class528_52_.f(4096);
			if (-1032261225 * anInt6978 == 180)
				class528_52_.f(8192);
			if (-1032261225 * anInt6978 == 270)
				class528_52_.f(12288);
		}
		if (bool)
			class528_52_.pa(aByte6982, anInt6980 * -1352565997, class390, class390_42_, i_43_, i_44_, i_45_);
		class528_52_.KA(i);
		return class528_52_;
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
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 157132839 * class217_sub1.anInt7975;
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = class217_sub1.anInt2700 * 1203083985;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7977;
			Class213 class213 = class217_sub1.method13055((short) -24683);
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = -216896281 * class213.anInt2680;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class213.aString2679;
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 652811625 * class217_sub1.anInt2701;
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = -129507359 * class217_sub1.anInt7978;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class217_sub1.aString7976;
		} else {
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = -1;
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		}
	}
}
