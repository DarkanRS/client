package com.jagex;

public final class Index {

    static Class395 aClass395_3684 = new Class395();
    static boolean aBool3692 = false;
    static int anInt3689 = 0;
    ReferenceTable referenceTable = null;
    Object[] archives;
    Object[][] archiveFiles;
    JS5FileWorker aClass327_3690;
    boolean aBool3685;
    int loadType;

    public int getCrc() {
        if (!this.referenceTableLoaded()) {
            throw new IllegalStateException("");
        } else {
            return this.referenceTable.headerCrc;
        }
    }

    synchronized boolean archiveExists(int i_1) {
        if (!this.referenceTableLoaded()) {
            return false;
        } else if (i_1 >= 0 && i_1 < this.referenceTable.fileCounts.length && this.referenceTable.fileCounts[i_1] != 0) {
            return true;
        } else if (aBool3692) {
            throw new IllegalArgumentException(Integer.toString(i_1));
        } else {
            return false;
        }
    }

    synchronized boolean fileExists(int i_1, int i_2) {
        if (!this.referenceTableLoaded()) {
            return false;
        } else if (i_1 >= 0 && i_2 >= 0 && i_1 < this.referenceTable.fileCounts.length && i_2 < this.referenceTable.fileCounts[i_1]) {
            return true;
        } else if (aBool3692) {
            throw new IllegalArgumentException(i_1 + " " + i_2);
        } else {
            return false;
        }
    }

    synchronized void requestArchive(int i_1) {
        if (this.aBool3685) {
            this.archives[i_1] = this.aClass327_3690.method5804(i_1);
        } else {
            this.archives[i_1] = JS5Manager.method5493(this.aClass327_3690.method5804(i_1), (byte) 47);
        }
    }

    void method5606(int i_1) {
        this.aClass327_3690.method5805(i_1);
    }

    public byte[] getFile(int i_1, int i_2) {
        return this.getFile(i_1, i_2, null);
    }

    public boolean validFile(String string_1) {
        if (!this.referenceTableLoaded()) {
            return false;
        } else {
            string_1 = string_1.toLowerCase();
            int i_2 = this.referenceTable.archiveName.method865(GraphicalRenderer.method8696(string_1), -1797692054);
            return i_2 >= 0;
        }
    }

    public int getArchiveId(String string_1) {
        if (!this.referenceTableLoaded()) {
            return -1;
        } else {
            string_1 = string_1.toLowerCase();
            int i_2 = this.referenceTable.archiveName.method865(GraphicalRenderer.method8696(string_1), -1537354695);
            return !this.archiveExists(i_2) ? -1 : i_2;
        }
    }

    public synchronized boolean isValid() {
        if (!this.referenceTableLoaded()) {
            return false;
        } else {
            boolean bool_1 = true;
            for (int i_2 = 0; i_2 < this.referenceTable.validArchiveIds.length; i_2++) {
                int i_3 = this.referenceTable.validArchiveIds[i_2];
                if (this.archives[i_3] == null) {
                    this.requestArchive(i_3);
                    if (this.archives[i_3] == null) {
                        bool_1 = false;
                    }
                }
            }
            return bool_1;
        }
    }

    synchronized int method5613(int i_1, byte b_2) {
        return !this.archiveExists(i_1) ? 0 : (this.archives[i_1] != null ? 100 : this.aClass327_3690.method5806(i_1));
    }

    public synchronized int getCompletion() {
        if (!this.referenceTableLoaded()) {
            return 0;
        } else {
            int i_1 = 0;
            int i_2 = 0;
            int i_3;
            for (i_3 = 0; i_3 < this.archives.length; i_3++) {
                if (this.referenceTable.validFileIdSizes[i_3] > 0) {
                    i_1 += 100;
                    i_2 += this.method5613(i_3, (byte) -93);
                }
            }
            if (i_1 == 0) {
                return 100;
            } else {
                i_3 = i_2 * 100 / i_1;
                return i_3;
            }
        }
    }

    public synchronized byte[] getFile(int i_1) {
        if (!this.referenceTableLoaded()) {
            return null;
        } else if (this.referenceTable.fileCounts.length == 1) {
            return this.getFile(0, i_1);
        } else if (!this.archiveExists(i_1)) {
            return null;
        } else if (this.referenceTable.fileCounts[i_1] == 1) {
            return this.getFile(i_1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    public synchronized int[] getValidFileIds(int i_1) {
        if (!this.archiveExists(i_1)) {
            return null;
        } else {
            int[] ints_2 = this.referenceTable.validFileIds[i_1];
            if (ints_2 == null) {
                ints_2 = new int[this.referenceTable.validFileIdSizes[i_1]];
                for (int i_3 = 0; i_3 < ints_2.length; ints_2[i_3] = i_3++) {
                }
            }
            return ints_2;
        }
    }

    public int containersCount() {
        return !this.referenceTableLoaded() ? -1 : this.referenceTable.fileCounts.length;
    }

    public synchronized void clearFiles(int i_1) {
        if (this.archiveExists(i_1) && this.archiveFiles != null) {
            this.archiveFiles[i_1] = null;
        }
    }

    public int method5623(int i_1) {
        if (!this.referenceTableLoaded()) {
            return -1;
        } else {
            int i_3 = this.referenceTable.archiveName.method865(i_1, -1675109701);
            return !this.archiveExists(i_3) ? -1 : i_3;
        }
    }

    public int filesCount(int i_1) {
        return !this.archiveExists(i_1) ? 0 : this.referenceTable.fileCounts[i_1];
    }

    public boolean method5625(String string_1, String string_2) {
        if (!this.referenceTableLoaded()) {
            return false;
        } else {
            string_1 = string_1.toLowerCase();
            string_2 = string_2.toLowerCase();
            int i_4 = this.referenceTable.archiveName.method865(GraphicalRenderer.method8696(string_1), -1883190493);
            if (i_4 < 0) {
                return false;
            } else {
                int i_5 = this.referenceTable.namedFiles[i_4].method865(GraphicalRenderer.method8696(string_2), -1658700496);
                return i_5 >= 0;
            }
        }
    }

    public synchronized byte[] getFileByName(String string_1, String string_2) {
        if (!this.referenceTableLoaded()) {
            return null;
        } else {
            string_1 = string_1.toLowerCase();
            string_2 = string_2.toLowerCase();
            int i_4 = this.referenceTable.archiveName.method865(GraphicalRenderer.method8696(string_1), -1918848832);
            if (!this.archiveExists(i_4)) {
                return null;
            } else {
                int i_5 = this.referenceTable.namedFiles[i_4].method865(GraphicalRenderer.method8696(string_2), -1926581994);
                return this.getFile(i_4, i_5);
            }
        }
    }

    boolean method5627(String string_1, String string_2, byte b_3) {
        if (!this.referenceTableLoaded()) {
            return false;
        } else {
            string_1 = string_1.toLowerCase();
            string_2 = string_2.toLowerCase();
            int i_4 = this.referenceTable.archiveName.method865(GraphicalRenderer.method8696(string_1), -1994003594);
            if (!this.archiveExists(i_4)) {
                return false;
            } else {
                int i_5 = this.referenceTable.namedFiles[i_4].method865(GraphicalRenderer.method8696(string_2), -1542672707);
                return this.load(i_4, i_5);
            }
        }
    }

    public boolean method5628(String string_1) {
        int i_3 = this.getArchiveId("");
        return i_3 != -1 ? this.method5627("", string_1, (byte) -29) : this.method5627(string_1, "", (byte) 31);
    }

    public boolean method5629(String string_1) {
        if (!this.referenceTableLoaded()) {
            return false;
        } else {
            string_1 = string_1.toLowerCase();
            int i_3 = this.referenceTable.archiveName.method865(GraphicalRenderer.method8696(string_1), -2031296285);
            return this.loadArchive(i_3);
        }
    }

    public void method5630(String string_1, int i_2) {
        if (this.referenceTableLoaded()) {
            string_1 = string_1.toLowerCase();
            int i_3 = this.referenceTable.archiveName.method865(GraphicalRenderer.method8696(string_1), -2076023188);
            this.method5606(i_3);
        }
    }

    public int method5631(String string_1, byte b_2) {
        if (!this.referenceTableLoaded()) {
            return 0;
        } else {
            string_1 = string_1.toLowerCase();
            int i_3 = this.referenceTable.archiveName.method865(GraphicalRenderer.method8696(string_1), -1645709178);
            return this.method5613(i_3, (byte) -6);
        }
    }

    synchronized boolean referenceTableLoaded() {
        if (this.referenceTable == null) {
            this.referenceTable = this.aClass327_3690.getReferenceTable(-860118856);
            if (this.referenceTable == null) {
                return false;
            }
            this.archives = new Object[this.referenceTable.archiveCount];
            this.archiveFiles = new Object[this.referenceTable.archiveCount][];
        }
        return true;
    }

    synchronized boolean method5638(int i_1, int i_2, int[] ints_3, int i_4) {
        if (!this.archiveExists(i_1)) {
            return false;
        } else if (this.archives[i_1] == null) {
            return false;
        } else {
            int i_5 = this.referenceTable.validFileIdSizes[i_1];
            int[] ints_6 = this.referenceTable.validFileIds[i_1];
            if (this.archiveFiles[i_1] == null) {
                this.archiveFiles[i_1] = new Object[this.referenceTable.fileCounts[i_1]];
            }
            Object[] arr_7 = this.archiveFiles[i_1];
            boolean bool_8 = true;
            for (int i_9 = 0; i_9 < i_5; i_9++) {
                int i_10;
                if (ints_6 == null) {
                    i_10 = i_9;
                } else {
                    i_10 = ints_6[i_9];
                }
                if (arr_7[i_10] == null) {
                    bool_8 = false;
                    break;
                }
            }
            if (bool_8) {
                return true;
            } else {
                byte[] bytes_22;
                if (ints_3 == null || ints_3[0] == 0 && ints_3[1] == 0 && ints_3[2] == 0 && ints_3[3] == 0) {
                    bytes_22 = QuickChatMessage.method6154(this.archives[i_1], false);
                } else {
                    bytes_22 = QuickChatMessage.method6154(this.archives[i_1], true);
                    RsByteBuffer rsbytebuffer_23 = new RsByteBuffer(bytes_22);
                    rsbytebuffer_23.method13249(ints_3, rsbytebuffer_23.buffer.length);
                }
                byte[] bytes_27 = Node_Sub17_Sub6.method15438(bytes_22, (byte) 43);
                if (this.aBool3685) {
                    this.archives[i_1] = null;
                }
                int i_11;
                if (i_5 > 1) {
                    int i_12;
                    RsByteBuffer rsbytebuffer_13;
                    int i_15;
                    int i_16;
                    int i_17;
                    int i_18;
                    int i_19;
                    if (this.loadType != 2) {
                        i_11 = bytes_27.length;
                        --i_11;
                        i_12 = bytes_27[i_11] & 0xff;
                        i_11 -= i_12 * i_5 * 4;
                        rsbytebuffer_13 = new RsByteBuffer(bytes_27);
                        int[] ints_14 = new int[i_5];
                        rsbytebuffer_13.index = i_11;
                        for (i_15 = 0; i_15 < i_12; i_15++) {
                            i_16 = 0;
                            for (i_17 = 0; i_17 < i_5; i_17++) {
                                i_16 += rsbytebuffer_13.readInt();
                                ints_14[i_17] += i_16;
                            }
                        }
                        byte[][] bytes_24 = new byte[i_5][];
                        for (i_16 = 0; i_16 < i_5; i_16++) {
                            bytes_24[i_16] = new byte[ints_14[i_16]];
                            ints_14[i_16] = 0;
                        }
                        rsbytebuffer_13.index = i_11;
                        i_16 = 0;
                        for (i_17 = 0; i_17 < i_12; i_17++) {
                            i_18 = 0;
                            for (i_19 = 0; i_19 < i_5; i_19++) {
                                i_18 += rsbytebuffer_13.readInt();
                                System.arraycopy(bytes_27, i_16, bytes_24[i_19], ints_14[i_19], i_18);
                                ints_14[i_19] += i_18;
                                i_16 += i_18;
                            }
                        }
                        for (i_17 = 0; i_17 < i_5; i_17++) {
                            if (ints_6 == null) {
                                i_18 = i_17;
                            } else {
                                i_18 = ints_6[i_17];
                            }
                            if (this.loadType == 0) {
                                arr_7[i_18] = JS5Manager.method5493(bytes_24[i_17], (byte) 5);
                            } else {
                                arr_7[i_18] = bytes_24[i_17];
                            }
                        }
                    } else {
                        i_11 = bytes_27.length;
                        --i_11;
                        i_12 = bytes_27[i_11] & 0xff;
                        i_11 -= i_12 * i_5 * 4;
                        rsbytebuffer_13 = new RsByteBuffer(bytes_27);
                        int i_25 = 0;
                        i_15 = 0;
                        rsbytebuffer_13.index = i_11;
                        for (i_16 = 0; i_16 < i_12; i_16++) {
                            i_17 = 0;
                            for (i_18 = 0; i_18 < i_5; i_18++) {
                                i_17 += rsbytebuffer_13.readInt();
                                if (ints_6 == null) {
                                    i_19 = i_18;
                                } else {
                                    i_19 = ints_6[i_18];
                                }
                                if (i_19 == i_2) {
                                    i_25 += i_17;
                                    i_15 = i_19;
                                }
                            }
                        }
                        if (i_25 == 0) {
                            return true;
                        }
                        byte[] bytes_26 = new byte[i_25];
                        i_25 = 0;
                        rsbytebuffer_13.index = i_11;
                        i_17 = 0;
                        for (i_18 = 0; i_18 < i_12; i_18++) {
                            i_19 = 0;
                            for (int i_20 = 0; i_20 < i_5; i_20++) {
                                i_19 += rsbytebuffer_13.readInt();
                                int i_21;
                                if (ints_6 == null) {
                                    i_21 = i_20;
                                } else {
                                    i_21 = ints_6[i_20];
                                }
                                if (i_21 == i_2) {
                                    System.arraycopy(bytes_27, i_17, bytes_26, i_25, i_19);
                                    i_25 += i_19;
                                }
                                i_17 += i_19;
                            }
                        }
                        arr_7[i_15] = bytes_26;
                    }
                } else {
                    if (ints_6 == null) {
                        i_11 = 0;
                    } else {
                        i_11 = ints_6[0];
                    }
                    if (this.loadType == 0) {
                        arr_7[i_11] = JS5Manager.method5493(bytes_27, (byte) 109);
                    } else {
                        arr_7[i_11] = bytes_27;
                    }
                }
                return true;
            }
        }
    }

    public synchronized byte[] getFile(int i_1, int i_2, int[] ints_3) {
        if (!this.fileExists(i_1, i_2)) {
            return null;
        } else {
            byte[] bytes_4 = null;
            if (this.archiveFiles[i_1] == null || this.archiveFiles[i_1][i_2] == null) {
                boolean bool_5 = this.method5638(i_1, i_2, ints_3, 2068142986);
                if (!bool_5) {
                    this.requestArchive(i_1);
                    bool_5 = this.method5638(i_1, i_2, ints_3, 382040238);
                    if (!bool_5) {
                        return null;
                    }
                }
            }
            if (this.archiveFiles[i_1] == null) {
                throw new RuntimeException("");
            } else {
                if (this.archiveFiles[i_1][i_2] != null) {
                    bytes_4 = QuickChatMessage.method6154(this.archiveFiles[i_1][i_2], false);
                    if (bytes_4 == null) {
                        throw new RuntimeException("");
                    }
                }
                if (bytes_4 != null) {
                    if (this.loadType == 1) {
                        this.archiveFiles[i_1][i_2] = null;
                        if (this.referenceTable.fileCounts[i_1] == 1) {
                            this.archiveFiles[i_1] = null;
                        }
                    } else if (this.loadType == 2) {
                        this.archiveFiles[i_1] = null;
                    }
                }
                return bytes_4;
            }
        }
    }

    public synchronized boolean loadArchive(int i_1) {
        if (!this.archiveExists(i_1)) {
            return false;
        } else if (this.archives[i_1] != null) {
            return true;
        } else {
            this.requestArchive(i_1);
            return this.archives[i_1] != null;
        }
    }

    public synchronized boolean loadFile(int i_1) {
        if (!this.referenceTableLoaded()) {
            return false;
        } else if (this.referenceTable.fileCounts.length == 1) {
            return this.load(0, i_1);
        } else if (!this.archiveExists(i_1)) {
            return false;
        } else if (this.referenceTable.fileCounts[i_1] == 1) {
            return this.load(i_1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    public Index(JS5FileWorker js5fileworker_1, boolean bool_2, int i_3) {
        if (i_3 >= 0 && i_3 <= 2) {
            this.aClass327_3690 = js5fileworker_1;
            this.aBool3685 = bool_2;
            this.loadType = i_3;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public void method5676(boolean bool_1) {
        if (this.referenceTableLoaded()) {
            if (bool_1) {
                this.referenceTable.nameHashes = null;
                this.referenceTable.archiveName = null;
            }
            this.referenceTable.fileNameHashes = null;
            this.referenceTable.namedFiles = null;
        }
    }

    public synchronized boolean load(int i_1, int i_2) {
        if (!this.fileExists(i_1, i_2)) {
            return false;
        } else if (this.archiveFiles[i_1] != null && this.archiveFiles[i_1][i_2] != null) {
            return true;
        } else if (this.archives[i_1] != null) {
            return true;
        } else {
            this.requestArchive(i_1);
            return this.archives[i_1] != null;
        }
    }

    public static int method5693(CharSequence charsequence_0, int i_2, byte[] bytes_3, int i_4) {
        int i_6 = i_2 - 0;
        for (int i_7 = 0; i_7 < i_6; i_7++) {
            char var_8 = charsequence_0.charAt(i_7 + 0);
            if (var_8 > 0 && var_8 < 128 || var_8 >= 160 && var_8 <= 255) {
                bytes_3[i_7 + i_4] = (byte) var_8;
            } else if (var_8 == 8364) {
                bytes_3[i_7 + i_4] = -128;
            } else if (var_8 == 8218) {
                bytes_3[i_7 + i_4] = -126;
            } else if (var_8 == 402) {
                bytes_3[i_7 + i_4] = -125;
            } else if (var_8 == 8222) {
                bytes_3[i_7 + i_4] = -124;
            } else if (var_8 == 8230) {
                bytes_3[i_7 + i_4] = -123;
            } else if (var_8 == 8224) {
                bytes_3[i_7 + i_4] = -122;
            } else if (var_8 == 8225) {
                bytes_3[i_7 + i_4] = -121;
            } else if (var_8 == 710) {
                bytes_3[i_7 + i_4] = -120;
            } else if (var_8 == 8240) {
                bytes_3[i_7 + i_4] = -119;
            } else if (var_8 == 352) {
                bytes_3[i_7 + i_4] = -118;
            } else if (var_8 == 8249) {
                bytes_3[i_7 + i_4] = -117;
            } else if (var_8 == 338) {
                bytes_3[i_7 + i_4] = -116;
            } else if (var_8 == 381) {
                bytes_3[i_7 + i_4] = -114;
            } else if (var_8 == 8216) {
                bytes_3[i_7 + i_4] = -111;
            } else if (var_8 == 8217) {
                bytes_3[i_7 + i_4] = -110;
            } else if (var_8 == 8220) {
                bytes_3[i_7 + i_4] = -109;
            } else if (var_8 == 8221) {
                bytes_3[i_7 + i_4] = -108;
            } else if (var_8 == 8226) {
                bytes_3[i_7 + i_4] = -107;
            } else if (var_8 == 8211) {
                bytes_3[i_7 + i_4] = -106;
            } else if (var_8 == 8212) {
                bytes_3[i_7 + i_4] = -105;
            } else if (var_8 == 732) {
                bytes_3[i_7 + i_4] = -104;
            } else if (var_8 == 8482) {
                bytes_3[i_7 + i_4] = -103;
            } else if (var_8 == 353) {
                bytes_3[i_7 + i_4] = -102;
            } else if (var_8 == 8250) {
                bytes_3[i_7 + i_4] = -101;
            } else if (var_8 == 339) {
                bytes_3[i_7 + i_4] = -100;
            } else if (var_8 == 382) {
                bytes_3[i_7 + i_4] = -98;
            } else if (var_8 == 376) {
                bytes_3[i_7 + i_4] = -97;
            } else {
                bytes_3[i_7 + i_4] = 63;
            }
        }
        return i_6;
    }

    public static IComponentDefinitions getIComponentDefinitions(int interfaceId, int slotId) {
        IComponentDefinitions ifDef = IComponentDefinitions.getDefs(interfaceId);
        if (slotId == -1)
            return ifDef;
        if (ifDef != null && ifDef.slotChildren != null && slotId < ifDef.slotChildren.length)
            return ifDef.slotChildren[slotId];
        return null;
    }
}
