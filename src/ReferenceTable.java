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
	static final int anInt3747 = 7;
	int[] fileLengths;
	public static Index aClass317_3749;

	void decodeHeader(byte[] is) {
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
		int archiveCount = 0;
		int lastArchiveId = -1;
		validArchiveIds = new int[numValidArchives * 1006899347];
		if (protocol >= 7) {
			for (int i = 0; i < 1006899347 * numValidArchives; i++) {
				validArchiveIds[i] = archiveCount += buffer.readBigSmart((byte) 1);
				if (validArchiveIds[i] > lastArchiveId)
					lastArchiveId = validArchiveIds[i];
			}
		} else {
			for (int i = 0; i < numValidArchives * 1006899347; i++) {
				validArchiveIds[i] = archiveCount += buffer.readUnsignedShort();
				if (validArchiveIds[i] > lastArchiveId)
					lastArchiveId = validArchiveIds[i];
			}
		}
		archiveCount = (1 + lastArchiveId) * -1799178585;
		unknown = new int[archiveCount * 1563136279];
		if (usesWhirlpool)
			whirlpool = new byte[archiveCount * 1563136279][];
		crcs = new int[1563136279 * archiveCount];
		fileCounts = new int[archiveCount * 1563136279];
		archiveFiles = new int[archiveCount * 1563136279][];
		fileLengths = new int[archiveCount * 1563136279];
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
				byte[] whirlpoolData = new byte[64];
				buffer.readBytes(whirlpoolData, 0, 64, 612047318);
				whirlpool[(validArchiveIds[i])] = whirlpoolData;
			}
		}
		for (int i = 0; i < numValidArchives * 1006899347; i++)
			crcs[(validArchiveIds[i])] = buffer.readInt();
		if (protocol >= 7) {
			for (int i = 0; i < numValidArchives * 1006899347; i++)
				fileCounts[(validArchiveIds[i])] = buffer.readBigSmart((byte) 1);
			for (int i = 0; i < 1006899347 * numValidArchives; i++) {
				int archiveId = validArchiveIds[i];
				int fileCount = fileCounts[archiveId];
				archiveCount = 0;
				int lastFileId = -1;
				archiveFiles[archiveId] = new int[fileCount];
				for (int fileId = 0; fileId < fileCount; fileId++) {
					int currentFileId = (archiveFiles[archiveId][fileId] = archiveCount += buffer.readBigSmart((byte) 1));
					if (currentFileId > lastFileId)
						lastFileId = currentFileId;
				}
				fileLengths[archiveId] = lastFileId + 1;
				if (fileCount == lastFileId + 1)
					archiveFiles[archiveId] = null;
			}
		} else {
			for (int i = 0; i < numValidArchives * 1006899347; i++)
				fileCounts[(validArchiveIds[i])] = buffer.readUnsignedShort();
			for (int i = 0; i < 1006899347 * numValidArchives; i++) {
				int archiveId = validArchiveIds[i];
				int fileCount = fileCounts[archiveId];
				archiveCount = 0;
				int lastFileId = -1;
				archiveFiles[archiveId] = new int[fileCount];
				for (int fileId = 0; fileId < fileCount; fileId++) {
					int currentFileId = (archiveFiles[archiveId][fileId] = archiveCount += buffer.readUnsignedShort());
					if (currentFileId > lastFileId)
						lastFileId = currentFileId;
				}
				fileLengths[archiveId] = 1 + lastFileId;
				if (fileCount == lastFileId + 1)
					archiveFiles[archiveId] = null;
			}
		}
		if (named) {
			fileNameHashes = new int[lastArchiveId + 1][];
			namedFiles = new NamedFileReference[lastArchiveId + 1];
			for (int i = 0; i < numValidArchives * 1006899347; i++) {
				int archiveId = validArchiveIds[i];
				int fileCount = fileCounts[archiveId];
				fileNameHashes[archiveId] = new int[fileLengths[archiveId]];
				for (int fileId = 0; fileId < fileLengths[archiveId]; fileId++)
					fileNameHashes[archiveId][fileId] = -1;
				for (int fileId = 0; fileId < fileCount; fileId++) {
					int currentFileId;
					if (null != archiveFiles[archiveId])
						currentFileId = (archiveFiles[archiveId][fileId]);
					else
						currentFileId = fileId;
					fileNameHashes[archiveId][currentFileId] = buffer.readInt();
				}
				namedFiles[archiveId] = new NamedFileReference(fileNameHashes[archiveId]);
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
		decodeHeader(is);
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
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (Class119.aClass426_1463.getItemDefinitions(i_133_, 200987173).anInt5064 * 155439281);
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
