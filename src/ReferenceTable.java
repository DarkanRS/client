/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ReferenceTable {
	int[][] archiveFiles;
	int anInt3733;
	byte[] aByteArray3734;
	int revision;
	int numValidArchives;
	int[] validArchiveIds;
	int[] nameHashes;
	NamedFileReference archiveName;
	int archiveCount;
	NamedFileReference[] namedFiles;
	byte[][] whirlpool;
	int[] crcs;
	int[] fileCounts;
	int[] unknown;
	int[][] fileNameHashes;
	int[] fileLengths;
	public static Index aClass317_3749;

	void decodeHeader(byte[] is, int i) {
		RsByteBuffer buffer = new RsByteBuffer(Class282_Sub17_Sub6.method15438(is, (byte) 90));
		int protocol = buffer.readUnsignedByte();
		if (protocol < 5 || protocol > 7)
			throw new RuntimeException();
		if (protocol >= 6)
			revision = buffer.readInt() * -1817791645;
		else
			revision = 0;
		int flags = buffer.readUnsignedByte();
		boolean named = (flags & 0x1) != 0;
		boolean usesWhirlpool = 0 != (flags & 0x2);
		if (protocol >= 7)
			numValidArchives = buffer.readBigSmart((byte) 1) * 2022935963;
		else
			numValidArchives = buffer.readUnsignedShort() * 2022935963;
		int lArchiveCount = 0;
		int lLastArchiveId = -1;
		validArchiveIds = new int[numValidArchives * 1006899347];
		if (protocol >= 7) {
			for (int i_37_ = 0; i_37_ < 1006899347 * numValidArchives; i_37_++) {
				validArchiveIds[i_37_] = lArchiveCount += buffer.readBigSmart((byte) 1);
				if (validArchiveIds[i_37_] > lLastArchiveId)
					lLastArchiveId = validArchiveIds[i_37_];
			}
		} else {
			for (int i_38_ = 0; i_38_ < numValidArchives * 1006899347; i_38_++) {
				validArchiveIds[i_38_] = lArchiveCount += buffer.readUnsignedShort();
				if (validArchiveIds[i_38_] > lLastArchiveId)
					lLastArchiveId = validArchiveIds[i_38_];
			}
		}
		archiveCount = (1 + lLastArchiveId) * -1799178585;
		unknown = new int[archiveCount * 1563136279];
		if (usesWhirlpool)
			whirlpool = new byte[archiveCount * 1563136279][];
		crcs = new int[1563136279 * archiveCount];
		fileCounts = new int[archiveCount * 1563136279];
		archiveFiles = new int[archiveCount * 1563136279][];
		fileLengths = new int[archiveCount * 1563136279];
		if (named) {
			nameHashes = new int[archiveCount * 1563136279];
			for (int i_39_ = 0; i_39_ < 1563136279 * archiveCount; i_39_++)
				nameHashes[i_39_] = -1;
			for (int i_40_ = 0; i_40_ < 1006899347 * numValidArchives; i_40_++)
				nameHashes[(validArchiveIds[i_40_])] = buffer.readInt();
			archiveName = new NamedFileReference(nameHashes);
		}
		for (int i_41_ = 0; i_41_ < numValidArchives * 1006899347; i_41_++)
			unknown[(validArchiveIds[i_41_])] = buffer.readInt();
		if (usesWhirlpool) {
			for (int i_42_ = 0; i_42_ < 1006899347 * numValidArchives; i_42_++) {
				byte[] is_43_ = new byte[64];
				buffer.readBytes(is_43_, 0, 64, 612047318);
				whirlpool[(validArchiveIds[i_42_])] = is_43_;
			}
		}
		for (int i_44_ = 0; i_44_ < numValidArchives * 1006899347; i_44_++)
			crcs[(validArchiveIds[i_44_])] = buffer.readInt();
		if (protocol >= 7) {
			for (int i_45_ = 0; i_45_ < numValidArchives * 1006899347; i_45_++)
				fileCounts[(validArchiveIds[i_45_])] = buffer.readBigSmart((byte) 1);
			for (int i_46_ = 0; i_46_ < 1006899347 * numValidArchives; i_46_++) {
				int i_47_ = validArchiveIds[i_46_];
				int i_48_ = fileCounts[i_47_];
				lArchiveCount = 0;
				int i_49_ = -1;
				archiveFiles[i_47_] = new int[i_48_];
				for (int i_50_ = 0; i_50_ < i_48_; i_50_++) {
					int i_51_ = (archiveFiles[i_47_][i_50_] = lArchiveCount += buffer.readBigSmart((byte) 1));
					if (i_51_ > i_49_)
						i_49_ = i_51_;
				}
				fileLengths[i_47_] = i_49_ + 1;
				if (i_48_ == i_49_ + 1)
					archiveFiles[i_47_] = null;
			}
		} else {
			for (int i_52_ = 0; i_52_ < numValidArchives * 1006899347; i_52_++)
				fileCounts[(validArchiveIds[i_52_])] = buffer.readUnsignedShort();
			for (int i_53_ = 0; i_53_ < 1006899347 * numValidArchives; i_53_++) {
				int i_54_ = validArchiveIds[i_53_];
				int i_55_ = fileCounts[i_54_];
				lArchiveCount = 0;
				int i_56_ = -1;
				archiveFiles[i_54_] = new int[i_55_];
				for (int i_57_ = 0; i_57_ < i_55_; i_57_++) {
					int i_58_ = (archiveFiles[i_54_][i_57_] = lArchiveCount += buffer.readUnsignedShort());
					if (i_58_ > i_56_)
						i_56_ = i_58_;
				}
				fileLengths[i_54_] = 1 + i_56_;
				if (i_55_ == i_56_ + 1)
					archiveFiles[i_54_] = null;
			}
		}
		if (named) {
			fileNameHashes = new int[lLastArchiveId + 1][];
			namedFiles = new NamedFileReference[lLastArchiveId + 1];
			for (int i_59_ = 0; i_59_ < numValidArchives * 1006899347; i_59_++) {
				int i_60_ = validArchiveIds[i_59_];
				int i_61_ = fileCounts[i_60_];
				fileNameHashes[i_60_] = new int[fileLengths[i_60_]];
				for (int i_62_ = 0; i_62_ < fileLengths[i_60_]; i_62_++)
					fileNameHashes[i_60_][i_62_] = -1;
				for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
					int i_64_;
					if (null != archiveFiles[i_60_])
						i_64_ = (archiveFiles[i_60_][i_63_]);
					else
						i_64_ = i_63_;
					fileNameHashes[i_60_][i_64_] = buffer.readInt();
				}
				namedFiles[i_60_] = new NamedFileReference(fileNameHashes[i_60_]);
			}
		}
	}

	ReferenceTable(byte[] is, int i, byte[] is_97_) {
		anInt3733 = Class285.method5028(is, is.length, (short) 255) * 2079717751;
		if (i != -2006273977 * anInt3733)
			throw new RuntimeException();
		if (null != is_97_) {
			if (is_97_.length != 64)
				throw new RuntimeException();
			aByteArray3734 = Class361.method6273(is, 0, is.length, (byte) 79);
			for (int i_98_ = 0; i_98_ < 64; i_98_++) {
				if (is_97_[i_98_] != aByteArray3734[i_98_])
					throw new RuntimeException();
			}
		}
		decodeHeader(is, 227007259);
	}

	static final void method5763(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		class118.anInt1329 = 1179500154;
		class118.aClass417_1308 = null;
		class118.anInt1330 = ((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]) * -636815827);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(class118.anInt1287 * -1952846363, -1575336609);
	}

	static final void method5764(CS2Executor class527, short i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_131_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_132_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 1]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_131_ / i_132_;
	}

	static final void method5765(CS2Executor class527, int i) {
		int i_133_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_133_, 200987173).anInt5064 * 155439281);
	}

	static final void method5766(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub1_8197, (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]), 1012945270);
		Class190.method3148((byte) 77);
		client.aBool7175 = false;
	}

	static final void method5767(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub20_8207.method12797((byte) 57) ? 1 : 0;
	}

	static void method5768(int i, byte i_134_) {
		synchronized (Class13.aClass229_127) {
			Class13.aClass229_127.method3858(i, (byte) -14);
		}
	}

	static final void method5769(CS2Executor class527, byte i) {
		int i_135_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (Class475.aBool5623) {
			if (i == 9) {
				Class467[] class467s = Class405.method6825((byte) 57);
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = class467s[i_135_].anInt5571 * -1928226539;
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = class467s[i_135_].anInt5574 * -1980032233;
			}
		} else {
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		}
	}
}
