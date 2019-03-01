public class ReferenceTable {

	int revision;
	int numValidArchives;
	int[] validArchiveIds;
	int archiveCount;
	int[] unknown;
	byte[][] whirlpool;
	int[] crcs;
	int[] validFileIdSizes;
	int[][] validFileIds;
	int[] fileCounts;
	int[] nameHashes;
	NamedFileReference archiveName;
	int[][] fileNameHashes;
	NamedFileReference[] namedFiles;
	int crc;
	byte[] aByteArray3734;

	void decodeHeader(byte[] bytes_1) {
		RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(Class282_Sub17_Sub6.method15438(bytes_1, (byte) 90));
		int i_3 = rsbytebuffer_2.readUnsignedByte();
		if (i_3 >= 5 && i_3 <= 7) {
			if (i_3 >= 6) {
				this.revision = rsbytebuffer_2.readInt();
			} else {
				this.revision = 0;
			}

			int i_4 = rsbytebuffer_2.readUnsignedByte();
			boolean bool_5 = (i_4 & 0x1) != 0;
			boolean bool_6 = (i_4 & 0x2) != 0;
			if (i_3 >= 7) {
				this.numValidArchives = rsbytebuffer_2.readUnsignedBigSmart();
			} else {
				this.numValidArchives = rsbytebuffer_2.readUnsignedShort();
			}

			int i_7 = 0;
			int i_8 = -1;
			this.validArchiveIds = new int[this.numValidArchives];
			int i_9;
			if (i_3 >= 7) {
				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					this.validArchiveIds[i_9] = i_7 += rsbytebuffer_2.readUnsignedBigSmart();
					if (this.validArchiveIds[i_9] > i_8) {
						i_8 = this.validArchiveIds[i_9];
					}
				}
			} else {
				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					this.validArchiveIds[i_9] = i_7 += rsbytebuffer_2.readUnsignedShort();
					if (this.validArchiveIds[i_9] > i_8) {
						i_8 = this.validArchiveIds[i_9];
					}
				}
			}

			this.archiveCount = i_8 + 1;
			this.unknown = new int[this.archiveCount];
			if (bool_6) {
				this.whirlpool = new byte[this.archiveCount][];
			}

			this.crcs = new int[this.archiveCount];
			this.validFileIdSizes = new int[this.archiveCount];
			this.validFileIds = new int[this.archiveCount][];
			this.fileCounts = new int[this.archiveCount];
			if (bool_5) {
				this.nameHashes = new int[this.archiveCount];

				for (i_9 = 0; i_9 < this.archiveCount; i_9++) {
					this.nameHashes[i_9] = -1;
				}

				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					this.nameHashes[this.validArchiveIds[i_9]] = rsbytebuffer_2.readInt();
				}

				this.archiveName = new NamedFileReference(this.nameHashes);
			}

			for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
				this.unknown[this.validArchiveIds[i_9]] = rsbytebuffer_2.readInt();
			}

			if (bool_6) {
				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					byte[] bytes_15 = new byte[64];
					rsbytebuffer_2.readBytes(bytes_15, 0, 64, 612047318);
					this.whirlpool[this.validArchiveIds[i_9]] = bytes_15;
				}
			}

			for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
				this.crcs[this.validArchiveIds[i_9]] = rsbytebuffer_2.readInt();
			}

			int i_10;
			int i_11;
			int i_12;
			int i_13;
			int i_14;
			if (i_3 >= 7) {
				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					this.validFileIdSizes[this.validArchiveIds[i_9]] = rsbytebuffer_2.readUnsignedBigSmart();
				}

				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					i_10 = this.validArchiveIds[i_9];
					i_11 = this.validFileIdSizes[i_10];
					i_7 = 0;
					i_12 = -1;
					this.validFileIds[i_10] = new int[i_11];

					for (i_13 = 0; i_13 < i_11; i_13++) {
						i_14 = this.validFileIds[i_10][i_13] = i_7 += rsbytebuffer_2.readUnsignedBigSmart();
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
					this.validFileIdSizes[this.validArchiveIds[i_9]] = rsbytebuffer_2.readUnsignedShort();
				}

				for (i_9 = 0; i_9 < this.numValidArchives; i_9++) {
					i_10 = this.validArchiveIds[i_9];
					i_11 = this.validFileIdSizes[i_10];
					i_7 = 0;
					i_12 = -1;
					this.validFileIds[i_10] = new int[i_11];

					for (i_13 = 0; i_13 < i_11; i_13++) {
						i_14 = this.validFileIds[i_10][i_13] = i_7 += rsbytebuffer_2.readUnsignedShort();
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

			if (bool_5) {
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

						this.fileNameHashes[i_10][i_13] = rsbytebuffer_2.readInt();
					}

					this.namedFiles[i_10] = new NamedFileReference(this.fileNameHashes[i_10]);
				}
			}

		} else {
			throw new RuntimeException();
		}
	}

	ReferenceTable(byte[] bytes_1, int i_2, byte[] bytes_3) {
		this.crc = Class285.getCRC(bytes_1, bytes_1.length);
		if (i_2 != this.crc) {
			throw new RuntimeException();
		} else {
			if (bytes_3 != null) {
				if (bytes_3.length != 64) {
					throw new RuntimeException();
				}

				this.aByteArray3734 = Class361.method6273(bytes_1, 0, bytes_1.length);

				for (int i_4 = 0; i_4 < 64; i_4++) {
					if (bytes_3[i_4] != this.aByteArray3734[i_4]) {
						throw new RuntimeException();
					}
				}
			}

			this.decodeHeader(bytes_1);
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
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 200987173).anInt5064;
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
