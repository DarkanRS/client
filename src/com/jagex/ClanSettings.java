package com.jagex;

public class ClanSettings {

    long aLong631;
    public static NativeSprite aNativeSprite_647;
    public int currentOwner = -1;
    public int replacementOwner = -1;
    public int banCount;
    long[] bannedUserHashes;
    public String[] bannedUserNames;
    IterableNodeMap<Object> variables;
    int[] sortedAffinedSlots;
    public int memberCount;
    int updateCount = 0;
    public String clanName = null;
    int anInt623 = 0;
    long[] memberHashes;
    public String[] memberNames;
    public byte[] memberRanks;
    int[] anIntArray633;
    public int[] anIntArray634;
    boolean useHashes;
    boolean useNames;
    public boolean allowGuests;
    public byte talkRank;
    public byte kickRank;
    public byte lootshareRank;
    public byte coinShare;

    public int method1197(String string_1) {
        if (string_1 != null && string_1.length() != 0) {
            for (int i_3 = 0; i_3 < this.memberCount; i_3++) {
                if (this.memberNames[i_3].equals(string_1)) {
                    return i_3;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    public int method1198(int i_1, int i_2, int i_3) {
        int i_5 = i_3 == 31 ? -1 : (1 << i_3 + 1) - 1;
        return (this.anIntArray633[i_1] & i_5) >>> i_2;
    }

    public Integer getIntVar(int i_1) {
        if (this.variables == null) {
            return null;
        } else {
            Node<Object> node_3 = this.variables.get(i_1);
            return node_3 != null && node_3 instanceof IntNode ? new Integer(((IntNode) node_3).value) : null;
        }
    }

    public Long getLongVar(int i_1) {
        if (this.variables == null) {
            return null;
        } else {
            Node<Object> node_3 = this.variables.get(i_1);
            return node_3 != null && node_3 instanceof LongNode ? new Long(((LongNode) node_3).aLong8066) : null;
        }
    }

    public String getStringVar(int i_1) {
        if (this.variables == null) {
            return null;
        } else {
            Node<Object> node_3 = this.variables.get(i_1);
            return node_3 != null && node_3 instanceof StringNode ? (String) ((StringNode) node_3).anObject8068 : null;
        }
    }

    void updateOwners() {
        if (this.memberCount == 0) {
            this.currentOwner = -1;
            this.replacementOwner = -1;
        } else {
            this.currentOwner = -1;
            this.replacementOwner = -1;
            int maximumIndex = 0;
            byte maximum = this.memberRanks[0];
            for (int i_4 = 1; i_4 < this.memberCount; i_4++) {
                if (this.memberRanks[i_4] > maximum) {
                    if (maximum == 125) {
                        this.replacementOwner = maximumIndex;
                    }
                    maximumIndex = i_4;
                    maximum = this.memberRanks[i_4];
                } else if (this.replacementOwner == -1 && this.memberRanks[i_4] == 125) {
                    this.replacementOwner = i_4;
                }
            }
            this.currentOwner = maximumIndex;
            if (this.currentOwner != -1) {
                this.memberRanks[this.currentOwner] = 126;
            }
        }
    }

    void method1207(long long_1, String string_3, int i_4) {
        if (string_3 != null && string_3.length() == 0) {
            string_3 = null;
        }
        if (this.useHashes != long_1 > 0L) {
            throw new RuntimeException("");
        } else if (string_3 != null != this.useNames) {
            throw new RuntimeException("");
        } else {
            if (long_1 > 0L && (this.bannedUserHashes == null || this.banCount >= this.bannedUserHashes.length) || string_3 != null && (this.bannedUserNames == null || this.banCount >= this.bannedUserNames.length)) {
                this.method1211(this.banCount + 5);
            }
            if (this.bannedUserHashes != null) {
                this.bannedUserHashes[this.banCount] = long_1;
            }
            if (this.bannedUserNames != null) {
                this.bannedUserNames[this.banCount] = string_3;
            }
            ++this.banCount;
        }
    }

    void method1208(int i_1, int i_2) {
        --this.banCount;
        if (this.banCount == 0) {
            this.bannedUserHashes = null;
            this.bannedUserNames = null;
        } else {
            if (this.bannedUserHashes != null) {
                Class503.method8351(this.bannedUserHashes, i_1 + 1, this.bannedUserHashes, i_1, this.banCount - i_1);
            }
            if (this.bannedUserNames != null) {
                Class503.method8359(this.bannedUserNames, i_1 + 1, this.bannedUserNames, i_1, this.banCount - i_1);
            }
        }
    }

    int method1209(int i_1, byte b_2, int i_3) {
        if (b_2 != 126 && b_2 != 127) {
            if (this.currentOwner == i_1 && (this.replacementOwner == -1 || this.memberRanks[this.replacementOwner] < 125)) {
                return -1;
            } else if (this.memberRanks[i_1] == b_2) {
                return -1;
            } else {
                this.memberRanks[i_1] = b_2;
                this.updateOwners();
                return i_1;
            }
        } else {
            return -1;
        }
    }

    int method1210(int i_1, int i_2, int i_3, int i_4, byte b_5) {
        int i_6 = (1 << i_3) - 1;
        int i_7 = i_4 == 31 ? -1 : (1 << i_4 + 1) - 1;
        int i_8 = i_7 ^ i_6;
        i_2 <<= i_3;
        i_2 &= i_8;
        int i_9 = this.anIntArray633[i_1];
        if ((i_9 & i_8) == i_2) {
            return -1;
        } else {
            i_9 &= ~i_8;
            this.anIntArray633[i_1] = i_9 | i_2;
            return i_1;
        }
    }

    void method1211(int i_1) {
        if (this.useHashes) {
            if (this.bannedUserHashes != null) {
                Class503.method8351(this.bannedUserHashes, 0, this.bannedUserHashes = new long[i_1], 0, this.banCount);
            } else {
                this.bannedUserHashes = new long[i_1];
            }
        }
        if (this.useNames) {
            if (this.bannedUserNames != null) {
                Class503.method8359(this.bannedUserNames, 0, this.bannedUserNames = new String[i_1], 0, this.banCount);
            } else {
                this.bannedUserNames = new String[i_1];
            }
        }
    }

    boolean method1212(int i_1, int i_2, int i_3, int i_4, byte b_5) {
        int i_6 = (1 << i_3) - 1;
        int i_7 = i_4 == 31 ? -1 : (1 << i_4 + 1) - 1;
        int i_8 = i_7 ^ i_6;
        i_2 <<= i_3;
        i_2 &= i_8;
        if (this.variables != null) {
            Node<Object> node_9 = this.variables.get(i_1);
            if (node_9 != null) {
                if (node_9 instanceof IntNode) {
                    IntNode class282_sub38_10 = (IntNode) node_9;
                    if ((class282_sub38_10.value & i_8) == i_2) {
                        return false;
                    }
                    class282_sub38_10.value &= ~i_8;
                    class282_sub38_10.value |= i_2;
                    return true;
                }
                node_9.remove();
            }
        } else {
            this.variables = new IterableNodeMap(4);
        }
        this.variables.put(new IntNode(i_2), i_1);
        return true;
    }

    boolean method1213(int i_1, long long_2) {
        if (this.variables != null) {
            Node node_4 = this.variables.get(i_1);
            if (node_4 != null) {
                if (node_4 instanceof LongNode) {
                    LongNode class282_sub45_5 = (LongNode) node_4;
                    if (class282_sub45_5.aLong8066 == long_2) {
                        return false;
                    }
                    class282_sub45_5.aLong8066 = long_2;
                    return true;
                }
                node_4.remove();
            }
        } else {
            this.variables = new IterableNodeMap(4);
        }
        this.variables.put(new LongNode(long_2), i_1);
        return true;
    }

    public int[] method1215() {
        if (this.sortedAffinedSlots == null) {
            String[] arr_2 = new String[this.memberCount];
            this.sortedAffinedSlots = new int[this.memberCount];
            for (int i_3 = 0; i_3 < this.memberCount; this.sortedAffinedSlots[i_3] = i_3++) {
                arr_2[i_3] = this.memberNames[i_3];
            }
            Class111.toSortedIndicesArr(arr_2, this.sortedAffinedSlots);
        }
        return this.sortedAffinedSlots;
    }

    void method1216(long long_1, String string_3, int i_4, byte b_5) {
        if (string_3 != null && string_3.length() == 0) {
            string_3 = null;
        }
        if (long_1 > 0L != this.useHashes) {
            throw new RuntimeException("");
        } else if (this.useNames != (string_3 != null)) {
            throw new RuntimeException("");
        } else {
            if (long_1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || string_3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
                this.method1232(this.memberCount + 5);
            }
            if (this.memberHashes != null) {
                this.memberHashes[this.memberCount] = long_1;
            }
            if (this.memberNames != null) {
                this.memberNames[this.memberCount] = string_3;
            }
            if (this.currentOwner == -1) {
                this.currentOwner = this.memberCount;
                this.memberRanks[this.memberCount] = 126;
            } else {
                this.memberRanks[this.memberCount] = 0;
            }
            this.anIntArray633[this.memberCount] = 0;
            this.anIntArray634[this.memberCount] = i_4;
            ++this.memberCount;
            this.sortedAffinedSlots = null;
        }
    }

    public ClanSettings(RsByteBuffer rsbytebuffer_1) {
        this.decode(rsbytebuffer_1);
    }

    boolean method1222(int i_1, int i_2, int i_3) {
        if (this.variables != null) {
            Node node_4 = this.variables.get(i_1);
            if (node_4 != null) {
                if (node_4 instanceof IntNode) {
                    IntNode class282_sub38_5 = (IntNode) node_4;
                    if (i_2 == class282_sub38_5.value) {
                        return false;
                    }
                    class282_sub38_5.value = i_2;
                    return true;
                }
                node_4.remove();
            }
        } else {
            this.variables = new IterableNodeMap(4);
        }
        this.variables.put(new IntNode(i_2), i_1);
        return true;
    }

    boolean method1224(int i_1, String string_2, byte b_3) {
        if (string_2 == null) {
            string_2 = "";
        } else if (string_2.length() > 80) {
            string_2 = string_2.substring(0, 80);
        }
        if (this.variables != null) {
            Node node_4 = this.variables.get(i_1);
            if (node_4 != null) {
                if (node_4 instanceof StringNode) {
                    StringNode class282_sub47_5 = (StringNode) node_4;
                    if (class282_sub47_5.anObject8068 instanceof String) {
                        if (string_2.equals(class282_sub47_5.anObject8068)) {
                            return false;
                        }
                        class282_sub47_5.remove();
                        class282_sub47_5.remove();
                        this.variables.put(new StringNode(string_2), class282_sub47_5.data);
                        return true;
                    }
                }
                node_4.remove();
            }
        } else {
            this.variables = new IterableNodeMap(4);
        }
        this.variables.put(new StringNode(string_2), i_1);
        return true;
    }

    public Integer method1225(int i_1, int i_2, int i_3) {
        if (this.variables == null) {
            return null;
        } else {
            Node node_5 = this.variables.get(i_1);
            if (node_5 != null && node_5 instanceof IntNode) {
                int i_6 = i_3 == 31 ? -1 : (1 << i_3 + 1) - 1;
                return new Integer((((IntNode) node_5).value & i_6) >>> i_2);
            } else {
                return null;
            }
        }
    }

    void method1232(int i_1) {
        if (this.useHashes) {
            if (this.memberHashes != null) {
                Class503.method8351(this.memberHashes, 0, this.memberHashes = new long[i_1], 0, this.memberCount);
            } else {
                this.memberHashes = new long[i_1];
            }
        }
        if (this.useNames) {
            if (this.memberNames != null) {
                Class503.method8359(this.memberNames, 0, this.memberNames = new String[i_1], 0, this.memberCount);
            } else {
                this.memberNames = new String[i_1];
            }
        }
        if (this.memberRanks != null) {
            Class503.method8352(this.memberRanks, 0, this.memberRanks = new byte[i_1], 0, this.memberCount);
        } else {
            this.memberRanks = new byte[i_1];
        }
        if (this.anIntArray633 != null) {
            Class503.method8362(this.anIntArray633, 0, this.anIntArray633 = new int[i_1], 0, this.memberCount);
        } else {
            this.anIntArray633 = new int[i_1];
        }
        if (this.anIntArray634 != null) {
            Class503.method8362(this.anIntArray634, 0, this.anIntArray634 = new int[i_1], 0, this.memberCount);
        } else {
            this.anIntArray634 = new int[i_1];
        }
    }

    void method1233(int i_1, int i_2) {
        if (i_1 >= 0 && i_1 < this.memberCount) {
            --this.memberCount;
            this.sortedAffinedSlots = null;
            if (this.memberCount == 0) {
                this.memberHashes = null;
                this.memberNames = null;
                this.memberRanks = null;
                this.anIntArray633 = null;
                this.anIntArray634 = null;
                this.currentOwner = -1;
                this.replacementOwner = -1;
            } else {
                Class503.method8352(this.memberRanks, i_1 + 1, this.memberRanks, i_1, this.memberCount - i_1);
                Class503.method8362(this.anIntArray633, i_1 + 1, this.anIntArray633, i_1, this.memberCount - i_1);
                Class503.method8362(this.anIntArray634, i_1 + 1, this.anIntArray634, i_1, this.memberCount - i_1);
                if (this.memberHashes != null) {
                    Class503.method8351(this.memberHashes, i_1 + 1, this.memberHashes, i_1, this.memberCount - i_1);
                }
                if (this.memberNames != null) {
                    Class503.method8359(this.memberNames, i_1 + 1, this.memberNames, i_1, this.memberCount - i_1);
                }
                if (this.currentOwner == i_1 || this.replacementOwner == i_1) {
                    this.updateOwners();
                }
            }
        } else {
            throw new RuntimeException("");
        }
    }

    void decode(RsByteBuffer buffer) {
        int version = buffer.readUnsignedByte();
        if (version >= 1 && version <= 5) {
            int attr = buffer.readUnsignedByte();
            if ((attr & 0x1) != 0) {
                this.useHashes = true;
            }
            if ((attr & 0x2) != 0) {
                this.useNames = true;
            }
            if (!this.useHashes) {
                this.memberHashes = null;
                this.bannedUserHashes = null;
            }
            if (!this.useNames) {
                this.memberNames = null;
                this.bannedUserNames = null;
            }
            this.updateCount = buffer.readInt();
            this.anInt623 = buffer.readInt();
            if (version <= 3 && this.anInt623 != 0) {
                this.anInt623 += 16912800;
            }
            this.memberCount = buffer.readUnsignedShort();
            this.banCount = buffer.readUnsignedByte();
            this.clanName = buffer.readString();
            if (version >= 4) {
                buffer.readInt();
            }
            this.allowGuests = buffer.readUnsignedByte() == 1;
            this.talkRank = buffer.readByte();
            this.kickRank = buffer.readByte();
            this.lootshareRank = buffer.readByte();
            this.coinShare = buffer.readByte();
            int i_5;
            if (this.memberCount > 0) {
                if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) {
                    this.memberHashes = new long[this.memberCount];
                }
                if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) {
                    this.memberNames = new String[this.memberCount];
                }
                if (this.memberRanks == null || this.memberRanks.length < this.memberCount) {
                    this.memberRanks = new byte[this.memberCount];
                }
                if (this.anIntArray633 == null || this.anIntArray633.length < this.memberCount) {
                    this.anIntArray633 = new int[this.memberCount];
                }
                if (this.anIntArray634 == null || this.anIntArray634.length < this.memberCount) {
                    this.anIntArray634 = new int[this.memberCount];
                }
                for (i_5 = 0; i_5 < this.memberCount; i_5++) {
                    if (this.useHashes) {
                        this.memberHashes[i_5] = buffer.readLong();
                    }
                    if (this.useNames) {
                        this.memberNames[i_5] = buffer.readNullString();
                    }
                    this.memberRanks[i_5] = buffer.readByte();
                    if (version >= 2) {
                        this.anIntArray633[i_5] = buffer.readInt();
                    }
                    if (version >= 5) {
                        this.anIntArray634[i_5] = buffer.readUnsignedShort();
                    } else {
                        this.anIntArray634[i_5] = 0;
                    }
                }
                this.updateOwners();
            }
            if (this.banCount > 0) {
                if (this.useHashes && (this.bannedUserHashes == null || this.bannedUserHashes.length < this.banCount)) {
                    this.bannedUserHashes = new long[this.banCount];
                }
                if (this.useNames && (this.bannedUserNames == null || this.bannedUserNames.length < this.banCount)) {
                    this.bannedUserNames = new String[this.banCount];
                }
                for (i_5 = 0; i_5 < this.banCount; i_5++) {
                    if (this.useHashes) {
                        this.bannedUserHashes[i_5] = buffer.readLong();
                    }
                    if (this.useNames) {
                        this.bannedUserNames[i_5] = buffer.readNullString();
                    }
                }
            }
            if (version >= 3) {
                i_5 = buffer.readUnsignedShort();
                if (i_5 > 0) {
                    this.variables = new IterableNodeMap(i_5 < 16 ? Utils.nextPowerOfTwo(i_5) : 16);
                    while (i_5-- > 0) {
                        int i_6 = buffer.readInt();
                        int i_7 = i_6 & 0x3fffffff;
                        int i_8 = i_6 >>> 30;
                        if (i_8 == 0) {
                            int i_9 = buffer.readInt();
                            this.variables.put(new IntNode(i_9), i_7);
                        } else if (i_8 == 1) {
                            long long_11 = buffer.readLong();
                            this.variables.put(new LongNode(long_11), i_7);
                        } else if (i_8 == 2) {
                            String string_13 = buffer.readString();
                            this.variables.put(new StringNode(string_13), i_7);
                        }
                    }
                }
            }
        } else {
            throw new RuntimeException("" + version);
        }
    }
}
