package com.jagex.clans.settings;

import com.jagex.ByteBuf;
import com.jagex.Class111;
import com.jagex.Class503;
import com.jagex.IntNode;
import com.jagex.IterableNodeMap;
import com.jagex.LongNode;
import com.jagex.NativeSprite;
import com.jagex.Node;
import com.jagex.ObjectNode;
import com.jagex.Utils;

public class ClanSettings {

    public static NativeSprite aNativeSprite_647;
    public int currentOwner = -1;
    public int replacementOwner = -1;
    public int banCount;
    public String[] bannedUserNames;
    public int memberCount;
    public String clanName;
    public String[] memberNames;
    public byte[] memberRanks;
    public int[] anIntArray634;
    public boolean allowGuests;
    public byte talkRank;
    public byte kickRank;
    public byte lootshareRank;
    public byte coinShare;
    public long aLong631;
    public long[] bannedUserHashes;
    public IterableNodeMap<Object> variables;
    public int[] sortedAffinedSlots;
    public int updateCount;
    public int anInt623;
    public long[] memberHashes;
    public int[] anIntArray633;
    public boolean useHashes;
    public boolean useNames;

    public ClanSettings(ByteBuf rsbytebuffer_1) {
        decode(rsbytebuffer_1);
    }

    public int method1197(String string_1) {
        if (string_1 != null && !string_1.isEmpty()) {
            for (int i_3 = 0; i_3 < memberCount; i_3++) {
                if (memberNames[i_3].equals(string_1)) {
                    return i_3;
                }
            }
        }
        return -1;
    }

    public int method1198(int i_1, int i_2, int i_3) {
        int i_5 = i_3 == 31 ? -1 : (1 << i_3 + 1) - 1;
        return (anIntArray633[i_1] & i_5) >>> i_2;
    }

    public Integer getIntVar(int i_1) {
        if (variables == null) {
            return null;
        } else {
            Node<Object> node_3 = variables.get(i_1);
            return node_3 instanceof IntNode ? new Integer(((IntNode) node_3).value) : null;
        }
    }

    public Long getLongVar(int i_1) {
        if (variables == null) {
            return null;
        } else {
            Node<Object> node_3 = variables.get(i_1);
            return node_3 instanceof LongNode ? new Long(((LongNode) node_3).aLong8066) : null;
        }
    }

    public String getStringVar(int i_1) {
        if (variables == null) {
            return null;
        } else {
            Node<Object> node_3 = variables.get(i_1);
            return node_3 instanceof ObjectNode ? (String) ((ObjectNode) node_3).anObject8068 : null;
        }
    }

    public void updateOwners() {
        if (memberCount == 0) {
            currentOwner = -1;
            replacementOwner = -1;
        } else {
            currentOwner = -1;
            replacementOwner = -1;
            int maximumIndex = 0;
            byte maximum = memberRanks[0];
            for (int i_4 = 1; i_4 < memberCount; i_4++) {
                if (memberRanks[i_4] > maximum) {
                    if (maximum == 125) {
                        replacementOwner = maximumIndex;
                    }
                    maximumIndex = i_4;
                    maximum = memberRanks[i_4];
                } else if (replacementOwner == -1 && memberRanks[i_4] == 125) {
                    replacementOwner = i_4;
                }
            }
            currentOwner = maximumIndex;
            if (currentOwner != -1) {
                memberRanks[currentOwner] = 126;
            }
        }
    }

    public void method1207(long long_1, String string_3) {
        String string_31 = string_3;
        if (string_31 != null && string_31.isEmpty()) {
            string_31 = null;
        }
        if (useHashes != long_1 > 0L) {
            throw new RuntimeException("");
        } else if (string_31 == null == useNames) {
            throw new RuntimeException("");
        } else {
            if (long_1 > 0L && (bannedUserHashes == null || banCount >= bannedUserHashes.length) || string_31 != null && (bannedUserNames == null || banCount >= bannedUserNames.length)) {
                method1211(banCount + 5);
            }
            if (bannedUserHashes != null) {
                bannedUserHashes[banCount] = long_1;
            }
            if (bannedUserNames != null) {
                bannedUserNames[banCount] = string_31;
            }
            ++banCount;
        }
    }

    public void method1208(int i_1) {
        --banCount;
        if (banCount == 0) {
            bannedUserHashes = null;
            bannedUserNames = null;
        } else {
            if (bannedUserHashes != null) {
                Class503.method8351(bannedUserHashes, i_1 + 1, bannedUserHashes, i_1, banCount - i_1);
            }
            if (bannedUserNames != null) {
                Class503.setSize(bannedUserNames, i_1 + 1, bannedUserNames, i_1, banCount - i_1);
            }
        }
    }

    public int method1209(int i_1, byte b_2) {
        if (b_2 != 126 && b_2 != 127) {
            if (currentOwner == i_1 && (replacementOwner == -1 || memberRanks[replacementOwner] < 125)) {
                return -1;
            } else if (memberRanks[i_1] == b_2) {
                return -1;
            } else {
                memberRanks[i_1] = b_2;
                updateOwners();
                return i_1;
            }
        } else {
            return -1;
        }
    }

    public int method1210(int i_1, int i_2, int i_3, int i_4) {
        int i_6 = (1 << i_3) - 1;
        int i_7 = i_4 == 31 ? -1 : (1 << i_4 + 1) - 1;
        int i_8 = i_7 ^ i_6;
        i_2 <<= i_3;
        i_2 &= i_8;
        int i_9 = anIntArray633[i_1];
        if ((i_9 & i_8) == i_2) {
            return -1;
        } else {
            i_9 &= ~i_8;
            anIntArray633[i_1] = i_9 | i_2;
            return i_1;
        }
    }

    public void method1211(int i_1) {
        if (useHashes) {
            if (bannedUserHashes != null) {
                Class503.method8351(bannedUserHashes, 0, bannedUserHashes = new long[i_1], 0, banCount);
            } else {
                bannedUserHashes = new long[i_1];
            }
        }
        if (useNames) {
            if (bannedUserNames != null) {
                Class503.setSize(bannedUserNames, 0, bannedUserNames = new String[i_1], 0, banCount);
            } else {
                bannedUserNames = new String[i_1];
            }
        }
    }

    public boolean method1212(int i_1, int i_2, int i_3, int i_4) {
        int i_6 = (1 << i_3) - 1;
        int i_7 = i_4 == 31 ? -1 : (1 << i_4 + 1) - 1;
        int i_8 = i_7 ^ i_6;
        i_2 <<= i_3;
        i_2 &= i_8;
        if (variables != null) {
            Node<Object> node_9 = variables.get(i_1);
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
                node_9.unlink();
            }
        } else {
            variables = new IterableNodeMap<>(4);
        }
        variables.put(new IntNode(i_2), i_1);
        return true;
    }

    public boolean method1213(int i_1, long long_2) {
        if (variables != null) {
            Node<Object> node_4 = variables.get(i_1);
            if (node_4 != null) {
                if (node_4 instanceof LongNode) {
                    LongNode class282_sub45_5 = (LongNode) node_4;
                    if (class282_sub45_5.aLong8066 == long_2) {
                        return false;
                    }
                    class282_sub45_5.aLong8066 = long_2;
                    return true;
                }
                node_4.unlink();
            }
        } else {
            variables = new IterableNodeMap<>(4);
        }
        variables.put(new LongNode(long_2), i_1);
        return true;
    }

    public int[] method1215() {
        if (sortedAffinedSlots == null) {
            String[] arr_2 = new String[memberCount];
            sortedAffinedSlots = new int[memberCount];
            for (int i_3 = 0; i_3 < memberCount; sortedAffinedSlots[i_3] = i_3++) {
                arr_2[i_3] = memberNames[i_3];
            }
            Class111.toSortedIndicesArr(arr_2, sortedAffinedSlots);
        }
        return sortedAffinedSlots;
    }

    public void method1216(long long_1, String string_3, int i_4) {
        String string_31 = string_3;
        if (string_31 != null && string_31.isEmpty()) {
            string_31 = null;
        }
        if (long_1 > 0L != useHashes) {
            throw new RuntimeException("");
        } else if (useNames == (string_31 == null)) {
            throw new RuntimeException("");
        } else {
            if (long_1 > 0L && (memberHashes == null || memberCount >= memberHashes.length) || string_31 != null && (memberNames == null || memberCount >= memberNames.length)) {
                method1232(memberCount + 5);
            }
            if (memberHashes != null) {
                memberHashes[memberCount] = long_1;
            }
            if (memberNames != null) {
                memberNames[memberCount] = string_31;
            }
            if (currentOwner == -1) {
                currentOwner = memberCount;
                memberRanks[memberCount] = 126;
            } else {
                memberRanks[memberCount] = 0;
            }
            anIntArray633[memberCount] = 0;
            anIntArray634[memberCount] = i_4;
            ++memberCount;
            sortedAffinedSlots = null;
        }
    }

    public boolean method1222(int i_1, int i_2) {
        if (variables != null) {
            Node<Object> node_4 = variables.get(i_1);
            if (node_4 != null) {
                if (node_4 instanceof IntNode) {
                    IntNode class282_sub38_5 = (IntNode) node_4;
                    if (i_2 == class282_sub38_5.value) {
                        return false;
                    }
                    class282_sub38_5.value = i_2;
                    return true;
                }
                node_4.unlink();
            }
        } else {
            variables = new IterableNodeMap<>(4);
        }
        variables.put(new IntNode(i_2), i_1);
        return true;
    }

    public boolean method1224(int i_1, String string_2) {
        String string_21 = string_2;
        if (string_21 == null) {
            string_21 = "";
        } else if (string_21.length() > 80) {
            string_21 = string_21.substring(0, 80);
        }
        if (variables != null) {
            Node<Object> node_4 = variables.get(i_1);
            if (node_4 != null) {
                if (node_4 instanceof ObjectNode) {
                    ObjectNode class282_sub47_5 = (ObjectNode) node_4;
                    if (class282_sub47_5.anObject8068 instanceof String) {
                        if (string_21.equals(class282_sub47_5.anObject8068)) {
                            return false;
                        }
                        class282_sub47_5.unlink();
                        class282_sub47_5.unlink();
                        variables.put(new ObjectNode(string_21), class282_sub47_5.pointer);
                        return true;
                    }
                }
                node_4.unlink();
            }
        } else {
            variables = new IterableNodeMap<>(4);
        }
        variables.put(new ObjectNode(string_21), i_1);
        return true;
    }

    public Integer method1225(int i_1, int i_2, int i_3) {
        if (variables == null) {
            return null;
        } else {
            Node<Object> node_5 = variables.get(i_1);
            if (node_5 instanceof IntNode) {
                int i_6 = i_3 == 31 ? -1 : (1 << i_3 + 1) - 1;
                return new Integer((((IntNode) node_5).value & i_6) >>> i_2);
            } else {
                return null;
            }
        }
    }

    public void method1232(int i_1) {
        if (useHashes) {
            if (memberHashes != null) {
                Class503.method8351(memberHashes, 0, memberHashes = new long[i_1], 0, memberCount);
            } else {
                memberHashes = new long[i_1];
            }
        }
        if (useNames) {
            if (memberNames != null) {
                Class503.setSize(memberNames, 0, memberNames = new String[i_1], 0, memberCount);
            } else {
                memberNames = new String[i_1];
            }
        }
        if (memberRanks != null) {
            Class503.method8352(memberRanks, 0, memberRanks = new byte[i_1], 0, memberCount);
        } else {
            memberRanks = new byte[i_1];
        }
        if (anIntArray633 != null) {
            Class503.method8362(anIntArray633, 0, anIntArray633 = new int[i_1], 0, memberCount);
        } else {
            anIntArray633 = new int[i_1];
        }
        if (anIntArray634 != null) {
            Class503.method8362(anIntArray634, 0, anIntArray634 = new int[i_1], 0, memberCount);
        } else {
            anIntArray634 = new int[i_1];
        }
    }

    public void method1233(int i_1) {
        if (i_1 >= 0 && i_1 < memberCount) {
            --memberCount;
            sortedAffinedSlots = null;
            if (memberCount == 0) {
                memberHashes = null;
                memberNames = null;
                memberRanks = null;
                anIntArray633 = null;
                anIntArray634 = null;
                currentOwner = -1;
                replacementOwner = -1;
            } else {
                Class503.method8352(memberRanks, i_1 + 1, memberRanks, i_1, memberCount - i_1);
                Class503.method8362(anIntArray633, i_1 + 1, anIntArray633, i_1, memberCount - i_1);
                Class503.method8362(anIntArray634, i_1 + 1, anIntArray634, i_1, memberCount - i_1);
                if (memberHashes != null) {
                    Class503.method8351(memberHashes, i_1 + 1, memberHashes, i_1, memberCount - i_1);
                }
                if (memberNames != null) {
                    Class503.setSize(memberNames, i_1 + 1, memberNames, i_1, memberCount - i_1);
                }
                if (currentOwner == i_1 || replacementOwner == i_1) {
                    updateOwners();
                }
            }
        } else {
            throw new RuntimeException("");
        }
    }

    public void decode(ByteBuf buffer) {
        int version = buffer.readUnsignedByte();
        if (version >= 1 && version <= 5) {
            int attr = buffer.readUnsignedByte();
            if ((attr & 0x1) != 0) {
                useHashes = true;
            }
            if ((attr & 0x2) != 0) {
                useNames = true;
            }
            if (!useHashes) {
                memberHashes = null;
                bannedUserHashes = null;
            }
            if (!useNames) {
                memberNames = null;
                bannedUserNames = null;
            }
            updateCount = buffer.readInt();
            anInt623 = buffer.readInt();
            if (version <= 3 && anInt623 != 0) {
                anInt623 += 16912800;
            }
            memberCount = buffer.readUnsignedShort();
            banCount = buffer.readUnsignedByte();
            clanName = buffer.readString();
            if (version >= 4) {
                buffer.readInt();
            }
            allowGuests = buffer.readUnsignedByte() == 1;
            talkRank = buffer.readByte();
            kickRank = buffer.readByte();
            lootshareRank = buffer.readByte();
            coinShare = buffer.readByte();
            int i_5;
            if (memberCount > 0) {
                if (useHashes && (memberHashes == null || memberHashes.length < memberCount)) {
                    memberHashes = new long[memberCount];
                }
                if (useNames && (memberNames == null || memberNames.length < memberCount)) {
                    memberNames = new String[memberCount];
                }
                if (memberRanks == null || memberRanks.length < memberCount) {
                    memberRanks = new byte[memberCount];
                }
                if (anIntArray633 == null || anIntArray633.length < memberCount) {
                    anIntArray633 = new int[memberCount];
                }
                if (anIntArray634 == null || anIntArray634.length < memberCount) {
                    anIntArray634 = new int[memberCount];
                }
                for (i_5 = 0; i_5 < memberCount; i_5++) {
                    if (useHashes) {
                        memberHashes[i_5] = buffer.readLong();
                    }
                    if (useNames) {
                        memberNames[i_5] = buffer.readNullString();
                    }
                    memberRanks[i_5] = buffer.readByte();
                    if (version >= 2) {
                        anIntArray633[i_5] = buffer.readInt();
                    }
                    if (version >= 5) {
                        anIntArray634[i_5] = buffer.readUnsignedShort();
                    } else {
                        anIntArray634[i_5] = 0;
                    }
                }
                updateOwners();
            }
            if (banCount > 0) {
                if (useHashes && (bannedUserHashes == null || bannedUserHashes.length < banCount)) {
                    bannedUserHashes = new long[banCount];
                }
                if (useNames && (bannedUserNames == null || bannedUserNames.length < banCount)) {
                    bannedUserNames = new String[banCount];
                }
                for (i_5 = 0; i_5 < banCount; i_5++) {
                    if (useHashes) {
                        bannedUserHashes[i_5] = buffer.readLong();
                    }
                    if (useNames) {
                        bannedUserNames[i_5] = buffer.readNullString();
                    }
                }
            }
            if (version >= 3) {
                i_5 = buffer.readUnsignedShort();
                if (i_5 > 0) {
                    variables = new IterableNodeMap<>(i_5 < 16 ? Utils.nextPowerOfTwo(i_5) : 16);
                    while (i_5-- > 0) {
                        int i_6 = buffer.readInt();
                        int i_7 = i_6 & 0x3fffffff;
                        int i_8 = i_6 >>> 30;
                        if (i_8 == 0) {
                            int i_9 = buffer.readInt();
                            variables.put(new IntNode(i_9), i_7);
                        } else if (i_8 == 1) {
                            long long_11 = buffer.readLong();
                            variables.put(new LongNode(long_11), i_7);
                        } else if (i_8 == 2) {
                            String string_13 = buffer.readString();
                            variables.put(new ObjectNode(string_13), i_7);
                        }
                    }
                }
            }
        } else {
            throw new RuntimeException("" + version);
        }
    }
}
