package com.jagex;

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

    ReferenceTable(byte[] data, int crcCheck, byte[] whirlpool) {
        headerCrc = Class285.getCRC(data, data.length);
        if (crcCheck != headerCrc) {
            throw new RuntimeException();
        } else {
            if (whirlpool != null) {
                if (whirlpool.length != 64) {
                    throw new RuntimeException();
                }
                headerWhirlpool = Class361.getWhirlpool(data, 0, data.length);
                for (int i = 0; i < 64; i++) {
                    if (whirlpool[i] != headerWhirlpool[i]) {
                        throw new RuntimeException();
                    }
                }
            }
            decodeHeader(data);
        }
    }

    static void method5768() {
        LRUCache softcache_2 = Class13.aClass229_127;
        synchronized (Class13.aClass229_127) {
            Class13.aClass229_127.method3858(5);
        }
    }

    void decodeHeader(byte[] bytes_1) {
        ByteBuf stream = new ByteBuf(Node_Sub17_Sub6.method15438(bytes_1));
        int protocol = stream.readUnsignedByte();
        if (protocol >= 5 && protocol <= 7) {
            if (protocol >= 6) {
                revision = stream.readInt();
            } else {
                revision = 0;
            }
            int flags = stream.readUnsignedByte();
            boolean named = (flags & 0x1) != 0;
            boolean usesWhirpool = (flags & 0x2) != 0;
            if (protocol >= 7) {
                numValidArchives = stream.readUnsignedBigSmart();
            } else {
                numValidArchives = stream.readUnsignedShort();
            }
            int i_7 = 0;
            int i_8 = -1;
            validArchiveIds = new int[numValidArchives];
            int i_9;
            if (protocol >= 7) {
                for (i_9 = 0; i_9 < numValidArchives; i_9++) {
                    validArchiveIds[i_9] = i_7 += stream.readUnsignedBigSmart();
                    if (validArchiveIds[i_9] > i_8) {
                        i_8 = validArchiveIds[i_9];
                    }
                }
            } else {
                for (i_9 = 0; i_9 < numValidArchives; i_9++) {
                    validArchiveIds[i_9] = i_7 += stream.readUnsignedShort();
                    if (validArchiveIds[i_9] > i_8) {
                        i_8 = validArchiveIds[i_9];
                    }
                }
            }
            archiveCount = i_8 + 1;
            crcs = new int[archiveCount];
            if (usesWhirpool) {
                whirlpool = new byte[archiveCount][];
            }
            versions = new int[archiveCount];
            validFileIdSizes = new int[archiveCount];
            validFileIds = new int[archiveCount][];
            fileCounts = new int[archiveCount];
            if (named) {
                nameHashes = new int[archiveCount];
                for (i_9 = 0; i_9 < archiveCount; i_9++) {
                    nameHashes[i_9] = -1;
                }
                for (i_9 = 0; i_9 < numValidArchives; i_9++) {
                    nameHashes[validArchiveIds[i_9]] = stream.readInt();
                }
                archiveName = new NamedFileReference(nameHashes);
            }
            for (i_9 = 0; i_9 < numValidArchives; i_9++) {
                crcs[validArchiveIds[i_9]] = stream.readInt();
            }
            if (usesWhirpool) {
                for (i_9 = 0; i_9 < numValidArchives; i_9++) {
                    byte[] bytes_15 = new byte[64];
                    stream.readBytes(bytes_15, 0, 64);
                    whirlpool[validArchiveIds[i_9]] = bytes_15;
                }
            }
            for (i_9 = 0; i_9 < numValidArchives; i_9++) {
                versions[validArchiveIds[i_9]] = stream.readInt();
            }
            int i_10;
            int i_11;
            int i_12;
            int i_13;
            int i_14;
            if (protocol >= 7) {
                for (i_9 = 0; i_9 < numValidArchives; i_9++) {
                    validFileIdSizes[validArchiveIds[i_9]] = stream.readUnsignedBigSmart();
                }
                for (i_9 = 0; i_9 < numValidArchives; i_9++) {
                    i_10 = validArchiveIds[i_9];
                    i_11 = validFileIdSizes[i_10];
                    i_7 = 0;
                    i_12 = -1;
                    validFileIds[i_10] = new int[i_11];
                    for (i_13 = 0; i_13 < i_11; i_13++) {
                        i_14 = validFileIds[i_10][i_13] = i_7 += stream.readUnsignedBigSmart();
                        if (i_14 > i_12) {
                            i_12 = i_14;
                        }
                    }
                    fileCounts[i_10] = i_12 + 1;
                    if (i_11 == i_12 + 1) {
                        validFileIds[i_10] = null;
                    }
                }
            } else {
                for (i_9 = 0; i_9 < numValidArchives; i_9++) {
                    validFileIdSizes[validArchiveIds[i_9]] = stream.readUnsignedShort();
                }
                for (i_9 = 0; i_9 < numValidArchives; i_9++) {
                    i_10 = validArchiveIds[i_9];
                    i_11 = validFileIdSizes[i_10];
                    i_7 = 0;
                    i_12 = -1;
                    validFileIds[i_10] = new int[i_11];
                    for (i_13 = 0; i_13 < i_11; i_13++) {
                        i_14 = validFileIds[i_10][i_13] = i_7 += stream.readUnsignedShort();
                        if (i_14 > i_12) {
                            i_12 = i_14;
                        }
                    }
                    fileCounts[i_10] = i_12 + 1;
                    if (i_11 == i_12 + 1) {
                        validFileIds[i_10] = null;
                    }
                }
            }
            if (named) {
                fileNameHashes = new int[i_8 + 1][];
                namedFiles = new NamedFileReference[i_8 + 1];
                for (i_9 = 0; i_9 < numValidArchives; i_9++) {
                    i_10 = validArchiveIds[i_9];
                    i_11 = validFileIdSizes[i_10];
                    fileNameHashes[i_10] = new int[fileCounts[i_10]];
                    for (i_12 = 0; i_12 < fileCounts[i_10]; i_12++) {
                        fileNameHashes[i_10][i_12] = -1;
                    }
                    for (i_12 = 0; i_12 < i_11; i_12++) {
                        if (validFileIds[i_10] != null) {
                            i_13 = validFileIds[i_10][i_12];
                        } else {
                            i_13 = i_12;
                        }
                        fileNameHashes[i_10][i_13] = stream.readInt();
                    }
                    namedFiles[i_10] = new NamedFileReference(fileNameHashes[i_10]);
                }
            }
        } else {
            throw new RuntimeException();
        }
    }
}
