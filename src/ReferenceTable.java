/* Class322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ReferenceTable {
	int[][] validFileIds;
	int crc;
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
	int[] validFileIdSizes;
	int[] unknown;
	int[][] fileNameHashes;
	int[] fileCounts;
	
	void decodeHeader(byte[] data) {
		RsByteBuffer buffer = new RsByteBuffer(Class282_Sub17_Sub6.method15438(data, (byte) 90));
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
			numValidArchives = buffer.readUnsignedBigSmart() * 2022935963;
		else
			numValidArchives = buffer.readUnsignedShort() * 2022935963;
		int lArchiveCount = 0;
		int lLastArchiveId = -1;
		validArchiveIds = new int[numValidArchives * 1006899347];
		if (protocol >= 7) {
			for (int i = 0; i < 1006899347 * numValidArchives; i++) {
				validArchiveIds[i] = lArchiveCount += buffer.readUnsignedBigSmart();
				if (validArchiveIds[i] > lLastArchiveId)
					lLastArchiveId = validArchiveIds[i];
			}
		} else {
			for (int i = 0; i < numValidArchives * 1006899347; i++) {
				validArchiveIds[i] = lArchiveCount += buffer.readUnsignedShort();
				if (validArchiveIds[i] > lLastArchiveId)
					lLastArchiveId = validArchiveIds[i];
			}
		}
		archiveCount = (1 + lLastArchiveId) * -1799178585;
		unknown = new int[archiveCount * 1563136279];
		if (usesWhirlpool)
			whirlpool = new byte[archiveCount * 1563136279][];
		crcs = new int[1563136279 * archiveCount];
		validFileIdSizes = new int[archiveCount * 1563136279];
		validFileIds = new int[archiveCount * 1563136279][];
		fileCounts = new int[archiveCount * 1563136279];
		if (named) {
			nameHashes = new int[archiveCount * 1563136279];
			for (int i = 0; i < 1563136279 * archiveCount; i++)
				nameHashes[i] = -1;
			for (int i = 0; i < 1006899347 * numValidArchives; i++)
				nameHashes[(validArchiveIds[i])] = buffer.readInt();
			archiveName = new NamedFileReference(nameHashes);
		}
		for (int i = 0; i < numValidArchives * 1006899347; i++)
			unknown[(validArchiveIds[i])] = buffer.readInt();
		if (usesWhirlpool) {
			for (int i = 0; i < 1006899347 * numValidArchives; i++) {
				byte[] is_43_ = new byte[64];
				buffer.readBytes(is_43_, 0, 64, 612047318);
				whirlpool[(validArchiveIds[i])] = is_43_;
			}
		}
		for (int i = 0; i < numValidArchives * 1006899347; i++)
			crcs[(validArchiveIds[i])] = buffer.readInt();
		if (protocol >= 7) {
			for (int i = 0; i < numValidArchives * 1006899347; i++)
				validFileIdSizes[(validArchiveIds[i])] = buffer.readUnsignedBigSmart();
			for (int i = 0; i < 1006899347 * numValidArchives; i++) {
				int archiveId = validArchiveIds[i];
				int validFileCount = validFileIdSizes[archiveId];
				lArchiveCount = 0;
				int count = -1;
				validFileIds[archiveId] = new int[validFileCount];
				for (int j = 0; j < validFileCount; j++) {
					int size = (validFileIds[archiveId][j] = lArchiveCount += buffer.readUnsignedBigSmart());
					if (size > count)
						count = size;
				}
				fileCounts[archiveId] = count + 1;
				if (validFileCount == count + 1)
					validFileIds[archiveId] = null;
			}
		} else {
			for (int i = 0; i < numValidArchives * 1006899347; i++)
				validFileIdSizes[(validArchiveIds[i])] = buffer.readUnsignedShort();
			for (int i = 0; i < 1006899347 * numValidArchives; i++) {
				int archiveId = validArchiveIds[i];
				int validFileCount = validFileIdSizes[archiveId];
				lArchiveCount = 0;
				int count = -1;
				validFileIds[archiveId] = new int[validFileCount];
				for (int j = 0; j < validFileCount; j++) {
					int size = (validFileIds[archiveId][j] = lArchiveCount += buffer.readUnsignedShort());
					if (size > count)
						count = size;
				}
				fileCounts[archiveId] = 1 + count;
				if (validFileCount == count + 1)
					validFileIds[archiveId] = null;
			}
		}
		if (named) {
			fileNameHashes = new int[lLastArchiveId + 1][];
			namedFiles = new NamedFileReference[lLastArchiveId + 1];
			for (int i_59_ = 0; i_59_ < numValidArchives * 1006899347; i_59_++) {
				int i_60_ = validArchiveIds[i_59_];
				int i_61_ = validFileIdSizes[i_60_];
				fileNameHashes[i_60_] = new int[fileCounts[i_60_]];
				for (int i_62_ = 0; i_62_ < fileCounts[i_60_]; i_62_++)
					fileNameHashes[i_60_][i_62_] = -1;
				for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
					int i_64_;
					if (null != validFileIds[i_60_])
						i_64_ = (validFileIds[i_60_][i_63_]);
					else
						i_64_ = i_63_;
					fileNameHashes[i_60_][i_64_] = buffer.readInt();
				}
				namedFiles[i_60_] = new NamedFileReference(fileNameHashes[i_60_]);
			}
		}
	}

	ReferenceTable(byte[] data, int expectedCRC, byte[] is_97_) {
		crc = Class285.getCRC(data, data.length) * 2079717751;
		if (expectedCRC != -2006273977 * crc)
			throw new RuntimeException();
		if (null != is_97_) {
			if (is_97_.length != 64)
				throw new RuntimeException();
			aByteArray3734 = Class361.method6273(data, 0, data.length);
			for (int i_98_ = 0; i_98_ < 64; i_98_++) {
				if (is_97_[i_98_] != aByteArray3734[i_98_])
					throw new RuntimeException();
			}
		}
		decodeHeader(data);
	}

	static final void method5763(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		class118.anInt1329 = 1179500154;
		class118.aClass417_1308 = null;
		class118.anInt1330 = ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) * -636815827);
		if (-1 == 1924549737 * class118.anInt1288 && !class98.aBool999)
			Class92.method1565(class118.idHash * -1952846363, -1575336609);
	}

	static final void method5764(CS2Executor class527, short i) {
		class527.intStackPtr -= 283782002;
		int i_131_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_132_ = (class527.intStack[class527.intStackPtr * 1942118537 + 1]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_131_ / i_132_;
	}

	static final void method5765(CS2Executor class527, int i) {
		int i_133_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_133_, 200987173).anInt5064 * 155439281);
	}

	static final void method5766(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub1_8197, (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]), 1012945270);
		Class190.method3148((byte) 77);
		client.aBool7175 = false;
	}

	static final void method5767(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub20_8207.method12797((byte) 57) ? 1 : 0;
	}

	static void method5768(int i, byte i_134_) {
		synchronized (Class13.aClass229_127) {
			Class13.aClass229_127.method3858(i, (byte) -14);
		}
	}

	static final void method5769(CS2Executor class527, byte i) {
		int i_135_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		if (Class475.aBool5623) {
			if (i == 9) {
				Class467[] class467s = Class405.method6825((byte) 57);
				class527.intStack[((class527.intStackPtr += 141891001) * 1942118537) - 1] = class467s[i_135_].anInt5571 * -1928226539;
				class527.intStack[((class527.intStackPtr += 141891001) * 1942118537) - 1] = class467s[i_135_].anInt5574 * -1980032233;
			}
		} else {
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
		}
	}
}
