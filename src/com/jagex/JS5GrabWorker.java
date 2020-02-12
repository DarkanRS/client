package com.jagex;

import java.util.zip.CRC32;

public class JS5GrabWorker extends JS5FileWorker {

    static CRC32 aCRC32_7804 = new CRC32();

    JS5CacheRequest refTableReq;

    ReferenceTable table;

    byte[] aByteArray7792;

    int anInt7793 = 0;

    boolean aBool7795;

    NodeCollection coll;

    IterableNodeMap aClass465_7796 = new IterableNodeMap(16);

    int anInt7797 = 0;

    NodeCollection aClass482_7807 = new NodeCollection();

    long aLong7785 = 0L;

    int indexId;

    JS5CacheFile dataFile;

    boolean hasDataFile;

    JS5CacheFile refsFile;

    JS5StandardRequester standardRequester;

    JS5LocalRequester localRequester;

    int tableCRC;

    byte[] tableDigest;

    int tableRevision;

    boolean aBool7801;

    void method5812(int i_1) {
        if (this.dataFile != null) {
            Node node_2;
            for (node_2 = this.aClass482_7807.head(); node_2 != null; node_2 = this.aClass482_7807.next(290181019)) {
                if (-3442165056282524525L * node_2.data * -1253863389874800229L == (long) i_1) {
                    return;
                }
            }
            node_2 = new Node();
            node_2.data = (long) i_1 * -1253863389874800229L * -3442165056282524525L;
            this.aClass482_7807.append(node_2);
        }
    }

    int method5806(int i_1) {
        JS5CacheRequest js5cacherequest_3 = (JS5CacheRequest) this.aClass465_7796.get(i_1);
        return js5cacherequest_3 != null ? js5cacherequest_3.getCompletion(-1369977403) : 0;
    }

    ReferenceTable getReferenceTable(int i_1) {
        if (this.table != null) {
            return this.table;
        } else {
            if (this.refTableReq == null) {
                if (this.standardRequester.priorityUnavailable(-1056221811)) {
                    return null;
                }
                this.refTableReq = this.standardRequester.request(255, this.indexId, (byte) 0, true, (byte) 102);
            }
            if (this.refTableReq.waiting) {
                return null;
            } else {
                byte[] bytes_2 = this.refTableReq.getData(862505694);
                if (this.refTableReq instanceof CacheableNode_Sub11_Sub2) {
                    if (bytes_2 == null) {
                        throw new RuntimeException();
                    }
                    this.table = new ReferenceTable(bytes_2, this.tableCRC, this.tableDigest);
                    if (this.table.revision != this.tableRevision) {
                        throw new RuntimeException();
                    }
                } else {
                    if (bytes_2 == null) {
                        throw new RuntimeException();
                    }
                    this.table = new ReferenceTable(bytes_2, this.tableCRC, this.tableDigest);
                    if (this.refsFile != null) {
                        this.localRequester.method5564(this.indexId, bytes_2, this.refsFile, -694199353);
                    }
                }
                this.refTableReq = null;
                if (this.dataFile != null) {
                    this.aByteArray7792 = new byte[this.table.archiveCount];
                    this.anInt7793 = 0;
                }
                return this.table;
            }
        }
    }

    byte[] method5804(int i_1) {
        JS5CacheRequest js5cacherequest_3 = this.method12546(i_1, 0, 242482231);
        if (js5cacherequest_3 == null) {
            return null;
        } else {
            byte[] bytes_4 = js5cacherequest_3.getData(-2100194534);
            js5cacherequest_3.remove();
            return bytes_4;
        }
    }

    void processCheck() {
        if (this.coll != null && this.getReferenceTable(-2030640343) != null) {
            for (Node node_2 = this.aClass482_7807.head(); node_2 != null; node_2 = this.aClass482_7807.next(-235017563)) {
                int i_3 = (int) node_2.data;
                if (i_3 >= 0 && i_3 < this.table.archiveCount && this.table.validFileIdSizes[i_3] != 0) {
                    if (this.aByteArray7792[i_3] == 0) {
                        this.method12546(i_3, 1, -43813469);
                    }
                    if (this.aByteArray7792[i_3] == -1) {
                        this.method12546(i_3, 2, -461658168);
                    }
                    if (this.aByteArray7792[i_3] == 1) {
                        node_2.remove();
                    }
                } else {
                    node_2.remove();
                }
            }
        }
    }

    void method5805(int i_1) {
        if (this.dataFile != null) {
            Node node_3;
            for (node_3 = this.aClass482_7807.head(); node_3 != null; node_3 = this.aClass482_7807.next(-1039604534)) {
                if (node_3.data == (long) i_1) {
                    return;
                }
            }
            node_3 = new Node();
            node_3.data = i_1;
            this.aClass482_7807.append(node_3);
        }
    }

    public int method12541() {
        return this.table == null ? 0 : this.table.numValidArchives;
    }

    public int method12542() {
        return this.anInt7793;
    }

    public int method12543(int i_1) {
        return this.getReferenceTable(-122167082) == null ? (this.refTableReq == null ? 0 : this.refTableReq.getCompletion(-1790040248)) : 100;
    }

    public void method12544() {
        if (this.dataFile != null) {
            this.aBool7795 = true;
            if (this.coll == null) {
                this.coll = new NodeCollection();
            }
        }
    }

    JS5CacheRequest method12546(int i_1, int i_2, int i_3) {
        Object obj_4 = this.aClass465_7796.get(i_1);
        if (obj_4 != null && i_2 == 0 && !((JS5CacheRequest) obj_4).highPriority && ((JS5CacheRequest) obj_4).waiting) {
            ((JS5CacheRequest) obj_4).remove();
            obj_4 = null;
        }
        if (obj_4 == null) {
            if (i_2 == 0) {
                if (this.dataFile != null && this.aByteArray7792[i_1] != -1) {
                    obj_4 = this.localRequester.method5578(i_1, this.dataFile, -1224840675);
                } else {
                    if (this.standardRequester.priorityUnavailable(-1505335895)) {
                        return null;
                    }
                    obj_4 = this.standardRequester.request(this.indexId, i_1, (byte) 2, true, (byte) 13);
                }
            } else if (i_2 == 1) {
                if (this.dataFile == null) {
                    throw new RuntimeException();
                }
                obj_4 = this.localRequester.method5567(i_1, this.dataFile);
            } else {
                if (i_2 != 2) {
                    throw new RuntimeException();
                }
                if (this.dataFile == null) {
                    throw new RuntimeException();
                }
                if (this.aByteArray7792[i_1] != -1) {
                    throw new RuntimeException();
                }
                if (this.standardRequester.extraUnavailable(-633705058)) {
                    return null;
                }
                obj_4 = this.standardRequester.request(this.indexId, i_1, (byte) 2, false, (byte) 54);
            }
            this.aClass465_7796.put((Node) obj_4, i_1);
        }
        if (((JS5CacheRequest) obj_4).waiting) {
            return null;
        } else {
            byte[] bytes_5 = ((JS5CacheRequest) obj_4).getData(-530456645);
            byte[] bytes_8;
            if (obj_4 instanceof CacheableNode_Sub11_Sub2) {
                try {
                    if (bytes_5 != null && bytes_5.length > 2) {
                        aCRC32_7804.reset();
                        aCRC32_7804.update(bytes_5, 0, bytes_5.length - 2);
                        int i_7 = (int) aCRC32_7804.getValue();
                        if (i_7 != this.table.crcs[i_1]) {
                            throw new RuntimeException();
                        } else {
                            if (this.table.whirlpool != null && this.table.whirlpool[i_1] != null) {
                                bytes_8 = this.table.whirlpool[i_1];
                                byte[] bytes_9 = Class361.getWhirlpool(bytes_5, 0, bytes_5.length - 2);
                                for (int i_10 = 0; i_10 < 64; i_10++) {
                                    if (bytes_9[i_10] != bytes_8[i_10]) {
                                        throw new RuntimeException();
                                    }
                                }
                            }
                            int i_11 = (bytes_5[bytes_5.length - 1] & 0xff) + ((bytes_5[bytes_5.length - 2] & 0xff) << 8);
                            if (i_11 != (this.table.versions[i_1] & 0xffff)) {
                                throw new RuntimeException();
                            } else {
                                if (this.aByteArray7792[i_1] != 1) {
                                    byte b_10000 = this.aByteArray7792[i_1];
                                    ++this.anInt7793;
                                    this.aByteArray7792[i_1] = 1;
                                }
                                if (!((JS5CacheRequest) obj_4).highPriority) {
                                    ((JS5CacheRequest) obj_4).remove();
                                }
                                return (JS5CacheRequest) obj_4;
                            }
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } catch (Exception exception_15) {
                    this.aByteArray7792[i_1] = -1;
                    ((JS5CacheRequest) obj_4).remove();
                    if (((JS5CacheRequest) obj_4).highPriority && !this.standardRequester.priorityUnavailable(-439719120)) {
                        PaddedJS5Request class282_sub50_sub11_sub1_16 = this.standardRequester.request(this.indexId, i_1, (byte) 2, true, (byte) -66);
                        this.aClass465_7796.put(class282_sub50_sub11_sub1_16, i_1);
                    }
                    return null;
                }
            } else if (bytes_5 != null && bytes_5.length > 2) {
                aCRC32_7804.reset();
                aCRC32_7804.update(bytes_5, 0, bytes_5.length - 2);
                int i_13 = (int) aCRC32_7804.getValue();
                if (i_13 != this.table.crcs[i_1]) {
                    throw new RuntimeException();
                } else {
                    if (this.table.whirlpool != null && this.table.whirlpool[i_1] != null) {
                        byte[] bytes_12 = this.table.whirlpool[i_1];
                        bytes_8 = Class361.getWhirlpool(bytes_5, 0, bytes_5.length - 2);
                        for (int i_14 = 0; i_14 < 64; i_14++) {
                            if (bytes_8[i_14] != bytes_12[i_14]) {
                                throw new RuntimeException();
                            }
                        }
                    }
                    this.standardRequester.anInt3657 = 0;
                    this.standardRequester.anInt3650 = 0;
                    bytes_5[bytes_5.length - 2] = (byte) (this.table.versions[i_1] >>> 8);
                    bytes_5[bytes_5.length - 1] = (byte) this.table.versions[i_1];
                    if (this.dataFile != null) {
                        this.localRequester.method5564(i_1, bytes_5, this.dataFile, -234788536);
                        if (this.aByteArray7792[i_1] != 1) {
                            ++this.anInt7793;
                            this.aByteArray7792[i_1] = 1;
                        }
                    }
                    if (!((JS5CacheRequest) obj_4).highPriority) {
                        ((JS5CacheRequest) obj_4).remove();
                    }
                    return (JS5CacheRequest) obj_4;
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    ReferenceTable method5807() {
        if (this.table != null) {
            return this.table;
        } else {
            if (this.refTableReq == null) {
                if (this.standardRequester.priorityUnavailable(-1103490150)) {
                    return null;
                }
                this.refTableReq = this.standardRequester.request(255, 737076305 * this.indexId * -507714383, (byte) 0, true, (byte) -74);
            }
            if (this.refTableReq.waiting) {
                return null;
            } else {
                byte[] bytes_1 = this.refTableReq.getData(1691080819);
                if (this.refTableReq instanceof CacheableNode_Sub11_Sub2) {
                    if (bytes_1 == null) {
                        throw new RuntimeException();
                    }
                    this.table = new ReferenceTable(bytes_1, -1197578581 * this.tableCRC * -903977981, this.tableDigest);
                    if (1502635595 * this.table.revision * -1817791645 != -1803818645 * this.tableRevision * -794625213) {
                        throw new RuntimeException();
                    }
                } else {
                    if (bytes_1 == null) {
                        throw new RuntimeException();
                    }
                    this.table = new ReferenceTable(bytes_1, this.tableCRC * -903977981 * -1197578581, this.tableDigest);
                    if (this.refsFile != null) {
                        this.localRequester.method5564(this.indexId * -507714383 * 737076305, bytes_1, this.refsFile, -1915662957);
                    }
                }
                this.refTableReq = null;
                if (this.dataFile != null) {
                    this.aByteArray7792 = new byte[this.table.archiveCount * -1799178585 * 1563136279];
                    this.anInt7793 = 0 * 308504451;
                }
                return this.table;
            }
        }
    }

    JS5GrabWorker(int i_1, JS5CacheFile js5cachefile_2, JS5CacheFile js5cachefile_3, JS5StandardRequester js5standardrequester_4, JS5LocalRequester js5localrequester_5, int i_6, byte[] bytes_7, int i_8) {
        this.indexId = i_1;
        this.dataFile = js5cachefile_2;
        if (this.dataFile == null) {
            this.hasDataFile = false;
        } else {
            this.hasDataFile = true;
            this.coll = new NodeCollection();
        }
        this.refsFile = js5cachefile_3;
        this.standardRequester = js5standardrequester_4;
        this.localRequester = js5localrequester_5;
        this.tableCRC = i_6;
        this.tableDigest = bytes_7;
        this.tableRevision = i_8;
        this.aBool7801 = true;
        if (this.refsFile != null) {
            this.refTableReq = this.localRequester.method5578(this.indexId, this.refsFile, -1435732555);
        }
    }

    byte[] method5809(int i_1) {
        JS5CacheRequest js5cacherequest_2 = this.method12546(i_1, 0, -1085366519);
        if (js5cacherequest_2 == null) {
            return null;
        } else {
            byte[] bytes_3 = js5cacherequest_2.getData(1414497884);
            js5cacherequest_2.remove();
            return bytes_3;
        }
    }

    int method5810(int i_1) {
        JS5CacheRequest js5cacherequest_2 = (JS5CacheRequest) this.aClass465_7796.get(i_1);
        return js5cacherequest_2 != null ? js5cacherequest_2.getCompletion(-1968748053) : 0;
    }

    byte[] method5811(int i_1) {
        JS5CacheRequest js5cacherequest_2 = this.method12546(i_1, 0, 227570516);
        if (js5cacherequest_2 == null) {
            return null;
        } else {
            byte[] bytes_3 = js5cacherequest_2.getData(1816584795);
            js5cacherequest_2.remove();
            return bytes_3;
        }
    }

    void method5808(int i_1) {
        if (this.dataFile != null) {
            Node node_2;
            for (node_2 = this.aClass482_7807.head(); node_2 != null; node_2 = this.aClass482_7807.next(978707001)) {
                if (-3442165056282524525L * node_2.data * -1253863389874800229L == (long) i_1) {
                    return;
                }
            }
            node_2 = new Node();
            node_2.data = (long) i_1 * -1253863389874800229L * -3442165056282524525L;
            this.aClass482_7807.append(node_2);
        }
    }

    byte[] method5813(int i_1) {
        JS5CacheRequest js5cacherequest_2 = this.method12546(i_1, 0, -1115231710);
        if (js5cacherequest_2 == null) {
            return null;
        } else {
            byte[] bytes_3 = js5cacherequest_2.getData(737831388);
            js5cacherequest_2.remove();
            return bytes_3;
        }
    }

    void method12552() {
        if (this.coll != null) {
            if (this.getReferenceTable(418724601) == null) {
                return;
            }
            Node node_3;
            int i_4;
            boolean bool_5;
            if (this.hasDataFile) {
                bool_5 = true;
                for (node_3 = this.coll.head(); node_3 != null; node_3 = this.coll.next(328179980)) {
                    i_4 = (int) node_3.data;
                    if (this.aByteArray7792[i_4] == 0) {
                        this.method12546(i_4, 1, -1048339107);
                    }
                    if (this.aByteArray7792[i_4] != 0) {
                        node_3.remove();
                    } else {
                        bool_5 = false;
                    }
                }
                while (this.anInt7797 * 1482915297 < this.table.validFileIdSizes.length) {
                    if (this.table.validFileIdSizes[this.anInt7797 * 1482915297] == 0) {
                        this.anInt7797 += -1503033823;
                    } else {
                        if (this.localRequester.anInt3662 >= 250) {
                            bool_5 = false;
                            break;
                        }
                        if (this.aByteArray7792[this.anInt7797 * 1482915297] == 0) {
                            this.method12546(this.anInt7797 * 1482915297, 1, 317844663);
                        }
                        if (this.aByteArray7792[this.anInt7797 * 1482915297] == 0) {
                            node_3 = new Node();
                            node_3.data = (long) this.anInt7797 * 1482915297L;
                            this.coll.append(node_3);
                            bool_5 = false;
                        }
                        this.anInt7797 += -1503033823;
                    }
                }
                if (bool_5) {
                    this.hasDataFile = false;
                    this.anInt7797 = 0;
                }
            } else if (this.aBool7795) {
                bool_5 = true;
                for (node_3 = this.coll.head(); node_3 != null; node_3 = this.coll.next(392865935)) {
                    i_4 = (int) node_3.data;
                    if (this.aByteArray7792[i_4] != 1) {
                        this.method12546(i_4, 2, -1651626518);
                    }
                    if (this.aByteArray7792[i_4] == 1) {
                        node_3.remove();
                    } else {
                        bool_5 = false;
                    }
                }
                while (this.anInt7797 * 1482915297 < this.table.validFileIdSizes.length) {
                    if (this.table.validFileIdSizes[this.anInt7797 * 1482915297] == 0) {
                        this.anInt7797 += -1503033823;
                    } else {
                        if (this.standardRequester.extraUnavailable(-619518274)) {
                            bool_5 = false;
                            break;
                        }
                        if (this.aByteArray7792[this.anInt7797 * 1482915297] != 1) {
                            this.method12546(this.anInt7797 * 1482915297, 2, 627310789);
                        }
                        if (this.aByteArray7792[this.anInt7797 * 1482915297] != 1) {
                            node_3 = new Node();
                            node_3.data = (long) this.anInt7797 * 1482915297L;
                            this.coll.append(node_3);
                            bool_5 = false;
                        }
                        this.anInt7797 += -1503033823;
                    }
                }
                if (bool_5) {
                    this.aBool7795 = false;
                    this.anInt7797 = 0;
                }
            } else {
                this.coll = null;
            }
        }
        if (this.aBool7801 && Utils.time() >= this.aLong7785) {
            for (JS5CacheRequest js5cacherequest_2 = (JS5CacheRequest) this.aClass465_7796.method7750(-556717169); js5cacherequest_2 != null; js5cacherequest_2 = (JS5CacheRequest) this.aClass465_7796.method7751((byte) 47)) {
                if (!js5cacherequest_2.waiting) {
                    if (js5cacherequest_2.aBool9638) {
                        if (!js5cacherequest_2.highPriority) {
                            throw new RuntimeException();
                        }
                        js5cacherequest_2.remove();
                    } else {
                        js5cacherequest_2.aBool9638 = true;
                    }
                }
            }
            this.aLong7785 = Utils.time() + 1000L;
        }
    }

    public int method12559() {
        if (this.table == null) {
            return 0;
        } else if (!this.hasDataFile) {
            return this.table.numValidArchives;
        } else {
            Node node_2 = this.coll.head();
            return node_2 == null ? 0 : (int) node_2.data;
        }
    }

    static boolean method12562(int i_0) {
        if (AccountCreationStage.aCacheableNode_Sub7_12 == null) {
            return false;
        } else {
            if (AccountCreationStage.aCacheableNode_Sub7_12.clickType >= 2000) {
                AccountCreationStage.aCacheableNode_Sub7_12.clickType -= 2000;
            }
            return AccountCreationStage.aCacheableNode_Sub7_12.clickType == 1007;
        }
    }
}
