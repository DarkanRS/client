public class ReferenceTable {

	int revision;
	int numValidArchives;
	int[] validArchiveIds;
	int archiveCount;
	int[] crcs;
	byte[][] whirlpool;
	int[] versions;
	int[] validFileIdSizes;
	int[][] validFileIds;
	int[] fileCounts;
	int[] nameHashes;
	NamedFileReference archiveName;
	int[][] fileNameHashes;
	NamedFileReference[] namedFiles;
	int headerCrc;
	byte[] headerWhirlpool;

	void decodeHeader(byte[] bytes_1) {
		RsByteBuffer stream = new RsByteBuffer(Class282_Sub17_Sub6.method15438(bytes_1, (byte) 90));
		int protocol = stream.readUnsignedByte();
		if (protocol >= 5 && protocol <= 7) {
			if (protocol >= 6) {
				this.revision = stream.readInt();
			} else {
				this.revision = 0;
			}

			int flags = stream.readUnsignedByte();
			boolean named = (flags & 0x1) != 0;
			boolean usesWhirpool = (flags & 0x2) != 0;
			if (protocol >= 7) {
				this.numValidArchives = stream.readUnsignedBigSmart();
			} else {
				this.numValidArchives = stream.readUnsignedShort();
			}

			int i_7 = 0;
			int i_8 = -1;
			this.validArchiveIds = new int[this.numValidArchives];
			int i_9;
			if (protocol >= 7) {
				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					this.validArchiveIds[i_9] = i_7 += stream.readUnsignedBigSmart();
					if (this.validArchiveIds[i_9] > i_8) {
						i_8 = this.validArchiveIds[i_9];
					}
				}
			} else {
				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					this.validArchiveIds[i_9] = i_7 += stream.readUnsignedShort();
					if (this.validArchiveIds[i_9] > i_8) {
						i_8 = this.validArchiveIds[i_9];
					}
				}
			}

			this.archiveCount = i_8 + 1;
			this.crcs = new int[this.archiveCount];
			if (usesWhirpool) {
				this.whirlpool = new byte[this.archiveCount][];
			}

			this.versions = new int[this.archiveCount];
			this.validFileIdSizes = new int[this.archiveCount];
			this.validFileIds = new int[this.archiveCount][];
			this.fileCounts = new int[this.archiveCount];
			if (named) {
				this.nameHashes = new int[this.archiveCount];

				for (i_9 = 0; i_9 < this.archiveCount; i_9++) {
					this.nameHashes[i_9] = -1;
				}

				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					this.nameHashes[this.validArchiveIds[i_9]] = stream.readInt();
				}

				this.archiveName = new NamedFileReference(this.nameHashes);
			}

			for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
				this.crcs[this.validArchiveIds[i_9]] = stream.readInt();
			}

			if (usesWhirpool) {
				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					byte[] bytes_15 = new byte[64];
					stream.readBytes(bytes_15, 0, 64, 612047318);
					this.whirlpool[this.validArchiveIds[i_9]] = bytes_15;
				}
			}

			for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
				this.versions[this.validArchiveIds[i_9]] = stream.readInt();
			}

			int i_10;
			int i_11;
			int i_12;
			int i_13;
			int i_14;
			if (protocol >= 7) {
				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					this.validFileIdSizes[this.validArchiveIds[i_9]] = stream.readUnsignedBigSmart();
				}

				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					i_10 = this.validArchiveIds[i_9];
					i_11 = this.validFileIdSizes[i_10];
					i_7 = 0;
					i_12 = -1;
					this.validFileIds[i_10] = new int[i_11];

					for (i_13 = 0; i_13 < i_11; i_13++) {
						i_14 = this.validFileIds[i_10][i_13] = i_7 += stream.readUnsignedBigSmart();
						if (i_14 > i_12) {
							i_12 = i_14;
						}
					}

					this.fileCounts[i_10] = i_12 + 1;
					if (i_11 == i_12 + 1) {
						this.validFileIds[i_10] = null;
					}
				}
			} else {
				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					this.validFileIdSizes[this.validArchiveIds[i_9]] = stream.readUnsignedShort();
				}

				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					i_10 = this.validArchiveIds[i_9];
					i_11 = this.validFileIdSizes[i_10];
					i_7 = 0;
					i_12 = -1;
					this.validFileIds[i_10] = new int[i_11];

					for (i_13 = 0; i_13 < i_11; i_13++) {
						i_14 = this.validFileIds[i_10][i_13] = i_7 += stream.readUnsignedShort();
						if (i_14 > i_12) {
							i_12 = i_14;
						}
					}

					this.fileCounts[i_10] = i_12 + 1;
					if (i_11 == i_12 + 1) {
						this.validFileIds[i_10] = null;
					}
				}
			}

			if (named) {
				this.fileNameHashes = new int[i_8 + 1][];
				this.namedFiles = new NamedFileReference[i_8 + 1];

				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					i_10 = this.validArchiveIds[i_9];
					i_11 = this.validFileIdSizes[i_10];
					this.fileNameHashes[i_10] = new int[this.fileCounts[i_10]];

					for (i_12 = 0; i_12 < this.fileCounts[i_10]; i_12++) {
						this.fileNameHashes[i_10][i_12] = -1;
					}

					for (i_12 = 0; i_12 < i_11; i_12++) {
						if (this.validFileIds[i_10] != null) {
							i_13 = this.validFileIds[i_10][i_12];
						} else {
							i_13 = i_12;
						}

						this.fileNameHashes[i_10][i_13] = stream.readInt();
					}

					this.namedFiles[i_10] = new NamedFileReference(this.fileNameHashes[i_10]);
				}
			}

		} else {
			throw new RuntimeException();
		}
	}

	ReferenceTable(byte[] data, int crcCheck, byte[] whirlpool) {
		this.headerCrc = Class285.getCRC(data, data.length);
		if (crcCheck != this.headerCrc) {
			throw new RuntimeException();
		} else {
			if (whirlpool != null) {
				if (whirlpool.length != 64) {
					throw new RuntimeException();
				}

				this.headerWhirlpool = Class361.getWhirlpool(data, 0, data.length);

				for (int i = 0; i < 64; i++) {
					if (whirlpool[i] != this.headerWhirlpool[i]) {
						throw new RuntimeException();
					}
				}
			}

			this.decodeHeader(data);
		}
	}

	static final void method5763(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1329 = 2;
		icomponentdefinitions_0.aClass417_1308 = null;
		icomponentdefinitions_0.anInt1330 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class92.method1565(icomponentdefinitions_0.idHash, -1575336609);
		}

	}

	static final void method5764(CS2Executor cs2executor_0, short s_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2 / i_3;
	}

	static final void method5765(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 200987173).equipType;
	}

	static final void method5766(CS2Executor cs2executor_0, int i_1) {
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub1_8197, cs2executor_0.intStack[--cs2executor_0.intStackPtr], 1012945270);
		Class190.savePreferences((byte) 77);
		client.aBool7175 = false;
	}

	static final void method5767(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub20_8207.method12797((byte) 57) ? 1 : 0;
	}

	static void method5768(int i_0, byte b_1) {
		SoftCache softcache_2 = Class13.aClass229_127;
		synchronized (Class13.aClass229_127) {
			Class13.aClass229_127.method3858(i_0, (byte) -14);
		}
	}

	static final void method5769(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (Class475.supportsFullScreen) {
			Class467[] arr_3 = Class405.method6825((byte) 57);
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = arr_3[i_2].anInt5571;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = arr_3[i_2].anInt5574;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

}
