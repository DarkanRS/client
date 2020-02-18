package com.jagex;

public class EntityDefaults {

    public int maximumHits = 4;
    public int[] hitOffsetsX;
    public int[] hitOffsetsY;
    public int anInt7030 = 4;
    public int anInt7032 = 4;
    public int anInt7028 = 7;
    public int profilingModel = -1;
    public boolean aBool7044 = true;
    public boolean npcMessagesEnabled = true;
    public int npcMessageDuration = 2;
    public boolean enablePlayerMessages = true;
    public int playerMessageDuration = 3;
    public int anInt7045 = -1;
    public int anInt7046 = -1;
    public int loginWindow;
    public int lobbyWindow;
    public short[][] originalColours;
    public short[][][] replacementColours;

    public EntityDefaults(Index index_1) {
        decode(new Packet(index_1.getFile(DefaultsFile.ENTITY.fileId)));
    }

    void decode(Packet buffer) {
        boolean loadedOffsets = false;
        while (true) {
            int opcode = buffer.readUnsignedByte();
            if (opcode == 0) {
                if (!loadedOffsets) {
                    if (hitOffsetsX == null) {
                        maximumHits = 4;
                        hitOffsetsX = new int[4];
                        hitOffsetsY = new int[4];
                    }
                    for (opcode = 0; opcode < hitOffsetsX.length; opcode++) {
                        hitOffsetsX[opcode] = 0;
                        hitOffsetsY[opcode] = opcode * 20;
                    }
                }
                return;
            }
            if (opcode == 1) {
                if (hitOffsetsX == null) {
                    maximumHits = 4;
                    hitOffsetsX = new int[4];
                    hitOffsetsY = new int[4];
                }
                for (int i_5 = 0; i_5 < hitOffsetsX.length; i_5++) {
                    hitOffsetsX[i_5] = buffer.readShort();
                    hitOffsetsY[i_5] = buffer.readShort();
                }
                loadedOffsets = true;
            } else if (opcode == 2) {
                profilingModel = buffer.readBigSmart();
            } else if (opcode == 3) {
                maximumHits = buffer.readUnsignedByte();
                hitOffsetsX = new int[maximumHits];
                hitOffsetsY = new int[maximumHits];
            } else if (opcode == 4) {
                aBool7044 = false;
            } else if (opcode == 5) {
                loginWindow = buffer.read24BitUnsignedInteger();
            } else if (opcode == 6) {
                lobbyWindow = buffer.read24BitUnsignedInteger();
            } else if (opcode == 7) {
                originalColours = new short[10][4];
                replacementColours = new short[10][4][];
                for (int i_5 = 0; i_5 < 10; i_5++) {
                    for (int i_6 = 0; i_6 < 4; i_6++) {
                        int i_7 = buffer.readUnsignedShort();
                        if (i_7 == 65535) {
                            i_7 = -1;
                        }
                        originalColours[i_5][i_6] = (short) i_7;
                        int i_8 = buffer.readUnsignedShort();
                        replacementColours[i_5][i_6] = new short[i_8];
                        for (int i_9 = 0; i_9 < i_8; i_9++) {
                            int i_10 = buffer.readUnsignedShort();
                            if (i_10 == 65535) {
                                i_10 = -1;
                            }
                            replacementColours[i_5][i_6][i_9] = (short) i_10;
                        }
                    }
                }
            } else if (opcode == 8) {
                npcMessagesEnabled = false;
            } else if (opcode == 9) {
                npcMessageDuration = buffer.readUnsignedByte();
            } else if (opcode == 10) {
                enablePlayerMessages = false;
            } else if (opcode == 11) {
                playerMessageDuration = buffer.readUnsignedByte();
            } else if (opcode == 12) {
                anInt7045 = buffer.readUnsignedShort();
                anInt7046 = buffer.readUnsignedShort();
            } else if (opcode == 13) {
                anInt7032 = buffer.readUnsignedByte();
            } else if (opcode == 14) {
                anInt7030 = buffer.readUnsignedByte();
            } else if (opcode == 15) {
                anInt7028 = buffer.readUnsignedByte();
            }
        }
    }
}
