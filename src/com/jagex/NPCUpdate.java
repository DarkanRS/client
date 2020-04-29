package com.jagex;

import java.util.Iterator;

public class NPCUpdate {

    static void decode(boolean largeView) {
        client.anInt7216 = 0;
        client.npcListSize = 0;
        ++client.anInt7332;
        decodeAddRemove();
        decodeUpdate(largeView);
        decodeMasks();
        boolean bool_2 = false;
        int i_3;
        int i_4;
        for (i_3 = 0; i_3 < client.anInt7216; i_3++) {
            i_4 = client.anIntArray7421[i_3];
            ObjectNode class282_sub47_5 = (ObjectNode) client.NPC_MAP.get(i_4);
            NPCEntity npc_7 = (NPCEntity) class282_sub47_5.anObject8068;
            if (npc_7.lastUpdate != client.anInt7332) {
                if (Class20.aBool161 && EnumIndexLoader.method7426(i_4)) {
                    Class316.method5594();
                }
                if (npc_7.definitions.method6886()) {
                    TextureDetails.method2876(npc_7);
                }
                npc_7.setDefinition(null);
                class282_sub47_5.unlink();
                bool_2 = true;
            }
        }
        if (bool_2) {
            i_3 = client.anInt7210;
            client.anInt7210 = client.NPC_MAP.size();
            i_4 = 0;
            ObjectNode class282_sub47_9;
            for (Iterator iterator_8 = client.NPC_MAP.iterator(); iterator_8.hasNext(); client.NPC_ARRAY[i_4++] = class282_sub47_9) {
                class282_sub47_9 = (ObjectNode) iterator_8.next();
            }
            for (int i_6 = client.anInt7210; i_6 < i_3; i_6++) {
                client.NPC_ARRAY[i_6] = null;
            }
        }
        if (client.GAME_CONNECTION_CONTEXT.recievedBuffer.index != client.GAME_CONNECTION_CONTEXT.currentPacketSize) {
            throw new RuntimeException(client.GAME_CONNECTION_CONTEXT.recievedBuffer.index + " " + client.GAME_CONNECTION_CONTEXT.currentPacketSize);
        } else {
            for (i_3 = 0; i_3 < client.NPC_UPDATE_INDEX; i_3++) {
                if (client.NPC_MAP.get(client.NPC_UPDATE_INDICES[i_3]) == null) {
                    throw new RuntimeException(i_3 + " " + client.NPC_UPDATE_INDEX);
                }
            }
            if (client.anInt7210 - client.NPC_UPDATE_INDEX != 0) {
                throw new RuntimeException("" + (client.anInt7210 - client.NPC_UPDATE_INDEX));
            } else {
                for (i_3 = 0; i_3 < client.anInt7210; i_3++) {
                    if (((PathingEntity) client.NPC_ARRAY[i_3].anObject8068).lastUpdate != client.anInt7332) {
                        throw new RuntimeException("" + ((PathingEntity) client.NPC_ARRAY[i_3].anObject8068).index);
                    }
                }
            }
        }
    }

    static void decodeAddRemove() {
        ByteBuf.Bit buffer = client.GAME_CONNECTION_CONTEXT.recievedBuffer;
        buffer.initBitAccess();
        int size = buffer.readBits(8);
        int i;
        if (size < client.NPC_UPDATE_INDEX) {
            for (i = size; i < client.NPC_UPDATE_INDEX; i++) {
                client.anIntArray7421[++client.anInt7216 - 1] = client.NPC_UPDATE_INDICES[i];
            }
        }

        if (size > client.NPC_UPDATE_INDEX) {
            throw new RuntimeException();
        } else {
            client.NPC_UPDATE_INDEX = 0;

            for (i = 0; i < size; i++) {
                int key = client.NPC_UPDATE_INDICES[i];
                NPCEntity npc = (NPCEntity) ((ObjectNode) client.NPC_MAP.get(key)).anObject8068;
                int needsUpdate = buffer.readBits(1);
                if (needsUpdate == 0) {
                    client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
                    npc.lastUpdate = client.anInt7332;
                } else {
                    int moveSpeed = buffer.readBits(2);
                    if (moveSpeed == 0) {
                        client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
                        npc.lastUpdate = client.anInt7332;
                        client.NPC_INDICES[++client.npcListSize - 1] = key;
                    } else if (moveSpeed == 1) {
                        client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
                        npc.lastUpdate = client.anInt7332;
                        NPCDirection class252_8 = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
                        npc.move(class252_8, MoveSpeed.WALKING.id);
                        int i_9 = buffer.readBits(1);
                        if (i_9 == 1) {
                            client.NPC_INDICES[++client.npcListSize - 1] = key;
                        }
                    } else if (moveSpeed == 2) {
                        client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
                        npc.lastUpdate = client.anInt7332;
                        if (buffer.readBits(1) == 1) {
                            NPCDirection direction = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
                            npc.move(direction, MoveSpeed.RUNNING.id);
                            NPCDirection class252_10 = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
                            npc.move(class252_10, MoveSpeed.RUNNING.id);
                        } else {
                            NPCDirection class252_8 = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
                            npc.move(class252_8, MoveSpeed.HALF_WALK.id);
                        }

                        int i_11 = buffer.readBits(1);
                        if (i_11 == 1) {
                            client.NPC_INDICES[++client.npcListSize - 1] = key;
                        }
                    } else if (moveSpeed == 3) {
                        client.anIntArray7421[++client.anInt7216 - 1] = key;
                    }
                }
            }

        }
    }

    static void decodeUpdate(boolean largeView) {
        ByteBuf.Bit rsbitsbuffer_2 = client.GAME_CONNECTION_CONTEXT.recievedBuffer;
        while (rsbitsbuffer_2.readableBits(client.GAME_CONNECTION_CONTEXT.currentPacketSize) >= 15) {
            int i_3 = rsbitsbuffer_2.readBits(15);
            if (i_3 == 32767) {
                break;
            }
            boolean bool_4 = false;
            ObjectNode class282_sub47_5 = (ObjectNode) client.NPC_MAP.get(i_3);
            NPCEntity npc_6;
            if (class282_sub47_5 == null) {
                npc_6 = new NPCEntity(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager());
                npc_6.index = i_3;
                class282_sub47_5 = new ObjectNode(npc_6);
                client.NPC_MAP.put(class282_sub47_5, i_3);
                client.NPC_ARRAY[++client.anInt7210 - 1] = class282_sub47_5;
                bool_4 = true;
            }
            npc_6 = (NPCEntity) class282_sub47_5.anObject8068;
            client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = i_3;
            npc_6.lastUpdate = client.anInt7332;
            if (npc_6.definitions != null && npc_6.definitions.method6886()) {
                TextureDetails.method2876(npc_6);
            }
            int i_7 = rsbitsbuffer_2.readBits(1);
            if (i_7 == 1) {
                client.NPC_INDICES[++client.npcListSize - 1] = i_3;
            }
            int i_8;
            if (largeView) {
                i_8 = rsbitsbuffer_2.readBits(8);
                if (i_8 > 127) {
                    i_8 -= 256;
                }
            } else {
                i_8 = rsbitsbuffer_2.readBits(5);
                if (i_8 > 15) {
                    i_8 -= 32;
                }
            }
            int i_9 = rsbitsbuffer_2.readBits(3) + 4 << 11 & 0x3fff;
            npc_6.setDefinition(IndexLoaders.NPC_INDEX_LOADER.getNPCType(rsbitsbuffer_2.readBits(15)));
            int i_10;
            if (largeView) {
                i_10 = rsbitsbuffer_2.readBits(8);
                if (i_10 > 127) {
                    i_10 -= 256;
                }
            } else {
                i_10 = rsbitsbuffer_2.readBits(5);
                if (i_10 > 15) {
                    i_10 -= 32;
                }
            }
            int i_11 = rsbitsbuffer_2.readBits(1);
            int i_12 = rsbitsbuffer_2.readBits(2);
            npc_6.setBoundSize(npc_6.definitions.size);
            npc_6.anInt10340 = npc_6.definitions.contrast << 3;
            if (bool_4) {
                npc_6.turn(i_9, true);
            }
            npc_6.move(i_12, VertexNormal.MY_PLAYER.regionBaseX[0] + i_10, VertexNormal.MY_PLAYER.regionBaseY[0] + i_8, i_11 == 1, npc_6.getSize());
            if (npc_6.definitions.method6886()) {
                Static.method6775(npc_6.plane, npc_6.regionBaseX[0], npc_6.regionBaseY[0], 0, null, npc_6, null);
            }
        }
        rsbitsbuffer_2.finishBitAccess();
    }

    static void decodeMasks() {
        ByteBuf.Bit buffer = client.GAME_CONNECTION_CONTEXT.recievedBuffer;
        for (int i_1 = 0; i_1 < client.npcListSize; i_1++) {
            int i_2 = client.NPC_INDICES[i_1];
            NPCEntity npc = (NPCEntity) ((ObjectNode) client.NPC_MAP.get(i_2)).anObject8068;
            int i_4 = buffer.readUnsignedByte();
            if ((i_4 & 0x40) != 0) {
                i_4 += buffer.readUnsignedByte() << 8;
            }
            if ((i_4 & 0x2000) != 0) {
                i_4 += buffer.readUnsignedByte() << 16;
            }
            if ((i_4 & 0x100000) != 0) {
                i_4 += buffer.readUnsignedByte() << 24;
            }
            if ((i_4 & 0x10) != 0) {
                int[] ints_5 = new int[MoveSpeed.values().length];
                for (int i_6 = 0; i_6 < MoveSpeed.values().length; i_6++) {
                    ints_5[i_6] = buffer.readBigSmart();
                }
                int i_6 = buffer.readUnsignedByte();
                Class20.animate(npc, ints_5, i_6, true);
            }
            if ((i_4 & 0x100) != 0) {
                int i_14 = npc.definitions.modelIds.length;
                int i_6 = 0;
                if (npc.definitions.modifiedColors != null) {
                    i_6 = npc.definitions.modifiedColors.length;
                }
                int i_7 = 0;
                if (npc.definitions.modifiedTextures != null) {
                    i_7 = npc.definitions.modifiedTextures.length;
                }
                int i_8 = buffer.readUnsigned128Byte();
                if ((i_8 & 0x1) == 1) {
                    npc.meshModifiers = null;
                } else {
                    int[] ints_18 = null;
                    if ((i_8 & 0x2) == 2) {
                        ints_18 = new int[i_14];
                        for (int i_10 = 0; i_10 < i_14; i_10++) {
                            ints_18[i_10] = buffer.readBigSmart();
                        }
                    }
                    short[] shorts_19 = null;
                    if ((i_8 & 0x4) == 4) {
                        shorts_19 = new short[i_6];
                        for (int i_11 = 0; i_11 < i_6; i_11++) {
                            shorts_19[i_11] = (short) buffer.readUnsignedShort();
                        }
                    }
                    short[] shorts_20 = null;
                    if ((i_8 & 0x8) == 8) {
                        shorts_20 = new short[i_7];
                        for (int i_12 = 0; i_12 < i_7; i_12++) {
                            shorts_20[i_12] = (short) buffer.readUnsignedShort();
                        }
                    }
                    long long_21 = i_2 | (long) (++npc.meshModifierCount - 1) << 32;
                    npc.meshModifiers = new NPCMeshModifier(long_21, ints_18, shorts_19, shorts_20);
                }
            }
            if ((i_4 & 0x400) != 0) {
                npc.forceMovementT1XOff = buffer.read128Byte();
                npc.forceMovementT1YOff = buffer.readByte128();
                npc.forceMovementT2XOff = buffer.readByteC();
                npc.forceMovementT2YOff = buffer.readByte128();
                npc.forceMovementT1Delay = buffer.readShortLE() + client.cycles;
                npc.forceMovementT2Delay = buffer.readShortLE() + client.cycles;
                npc.forceMovementDir = buffer.readUnsignedShortLE128();
                npc.forceMovementT1XOff += npc.regionBaseX[0];
                npc.forceMovementT1YOff += npc.regionBaseY[0];
                npc.forceMovementT2XOff += npc.regionBaseX[0];
                npc.forceMovementT2YOff += npc.regionBaseY[0];
                npc.anInt10355 = 1;
                npc.anInt10367 = 0;
            }
            if ((i_4 & 0x1000) != 0) {
                npc.anInt10575 = buffer.readUnsignedShort();
                if (npc.anInt10575 == 65535) {
                    npc.anInt10575 = -1;
                }
            }
            if ((i_4 & 0x200000) != 0) {
                int i_14 = buffer.buffer[++buffer.index - 1] & 0xff;
                for (int i_6 = 0; i_6 < i_14; i_6++) {
                    int i_7 = buffer.readUnsignedShortLE128();
                    int i_8 = buffer.readIntV1();
                    npc.varns.setVarn(i_7, i_8);
                }
            }
            if ((i_4 & 0x1000000) != 0) {
                int i_14 = buffer.readUnsignedShort128();
                int i_6 = buffer.readIntV2();
                if (i_14 == 65535) {
                    i_14 = -1;
                }
                int i_7 = buffer.readUnsignedByte128();
                int i_8 = i_7 & 0x7;
                int i_9 = i_7 >> 3 & 0xf;
                if (i_9 == 15) {
                    i_9 = -1;
                }
                boolean bool_24 = (i_7 >> 7 & 0x1) == 1;
                npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 3);
            }
            if ((i_4 & 0x80) != 0) {
                npc.faceEntity = buffer.readShortLE();
                if (npc.faceEntity == 65535) {
                    npc.faceEntity = -1;
                }
            }
            if ((i_4 & 0x8000) != 0) {
                int i_14 = buffer.readUnsignedByteC();
                int[] ints_15 = new int[i_14];
                int[] ints_16 = new int[i_14];
                int[] ints_17 = new int[i_14];
                for (int i_9 = 0; i_9 < i_14; i_9++) {
                    int i_10 = buffer.readBigSmart();
                    ints_15[i_9] = i_10;
                    ints_16[i_9] = buffer.readUnsignedByte();
                    ints_17[i_9] = buffer.readShortLE();
                }
                QuickchatCategoryLoader.method5923(npc, ints_15, ints_16, ints_17);
            }
            if ((i_4 & 0x800) != 0) {
                int i_14 = buffer.readShortLE();
                int i_6 = buffer.readInt();
                if (i_14 == 65535) {
                    i_14 = -1;
                }
                int i_7 = buffer.readUnsignedByte128();
                int i_8 = i_7 & 0x7;
                int i_9 = i_7 >> 3 & 0xf;
                if (i_9 == 15) {
                    i_9 = -1;
                }
                boolean bool_24 = (i_7 >> 7 & 0x1) == 1;
                npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 1);
            }
            if ((i_4 & 0x1) != 0) {
                int i_14 = buffer.readUnsignedByte128();
                if (i_14 > 0) {
                    for (int i_6 = 0; i_6 < i_14; i_6++) {
                        int i_7 = -1;
                        int i_8;
                        int i_9 = -1;
                        int i_10 = buffer.readSmart();
                        if (i_10 == 32767) {
                            i_10 = buffer.readSmart();
                            i_8 = buffer.readSmart();
                            i_7 = buffer.readSmart();
                            i_9 = buffer.readSmart();
                        } else if (i_10 != 32766) {
                            i_8 = buffer.readSmart();
                        } else {
                            i_10 = -1;
                            i_8 = buffer.readUnsignedByte();
                        }
                        int i_11 = buffer.readSmart();
                        npc.applyHit(i_10, i_8, i_7, i_9, client.cycles, i_11);
                    }
                }
                int i_6 = buffer.readUnsignedByte128();
                if (i_6 > 0) {
                    for (int i_7 = 0; i_7 < i_6; i_7++) {
                        int i_8 = buffer.readSmart();
                        int i_9 = buffer.readSmart();
                        if (i_9 != 32767) {
                            int i_10 = buffer.readSmart();
                            int i_11 = buffer.readUnsigned128Byte();
                            int i_12 = i_9 > 0 ? buffer.readUnsignedByte128() : i_11;
                            npc.displayHitbar(i_8, client.cycles, i_9, i_10, i_11, i_12);
                        } else {
                            npc.method15857(i_8);
                        }
                    }
                }
            }
            if ((i_4 & 0x8) != 0) {
                if (npc.definitions.method6886()) {
                    TextureDetails.method2876(npc);
                }
                npc.setDefinition(IndexLoaders.NPC_INDEX_LOADER.getNPCType(buffer.readBigSmart()));
                npc.setBoundSize(npc.definitions.size);
                npc.anInt10340 = npc.definitions.contrast << 3;
                if (npc.definitions.method6886()) {
                    Static.method6775(npc.plane, npc.regionBaseX[0], npc.regionBaseY[0], 0, null, npc, null);
                }
            }
            if ((i_4 & 0x2000000) != 0) {
                int i_14 = buffer.readShortLE();
                int i_6 = buffer.readIntLE();
                if (i_14 == 65535) {
                    i_14 = -1;
                }
                int i_7 = buffer.readUnsignedByte();
                int i_8 = i_7 & 0x7;
                int i_9 = i_7 >> 3 & 0xf;
                if (i_9 == 15) {
                    i_9 = -1;
                }
                boolean bool_24 = (i_7 >> 7 & 0x1) == 1;
                npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 2);
            }
            if ((i_4 & 0x80000) != 0) {
                int i_14 = buffer.buffer[++buffer.index - 1] & 0xff;
                for (int i_6 = 0; i_6 < i_14; i_6++) {
                    int i_7 = buffer.readUnsignedByte128();
                    int i_8 = buffer.readInt();
                    int i_9 = buffer.method13132();
                    npc.method16179(i_7, i_8, i_9);
                }
            }
            if ((i_4 & 0x40000) != 0) {
                int i_14 = npc.definitions.headModels.length;
                int i_6 = 0;
                if (npc.definitions.modifiedColors != null) {
                    i_6 = npc.definitions.modifiedColors.length;
                }
                byte b_25 = 0;
                if (npc.definitions.modifiedTextures != null) {
                    i_6 = npc.definitions.modifiedTextures.length;
                }
                int i_8 = buffer.readUnsignedByte128();
                if ((i_8 & 0x1) != 1) {
                    int[] ints_18 = null;
                    if ((i_8 & 0x2) == 2) {
                        ints_18 = new int[i_14];
                        for (int i_10 = 0; i_10 < i_14; i_10++) {
                            ints_18[i_10] = buffer.readBigSmart();
                        }
                    }
                    short[] shorts_19 = null;
                    if ((i_8 & 0x4) == 4) {
                        shorts_19 = new short[i_6];
                        for (int i_11 = 0; i_11 < i_6; i_11++) {
                            shorts_19[i_11] = (short) buffer.readUnsignedShort();
                        }
                    }
                    short[] shorts_20 = null;
                    if ((i_8 & 0x8) == 8) {
                        shorts_20 = new short[b_25];
                        for (int i_12 = 0; i_12 < b_25; i_12++) {
                            shorts_20[i_12] = (short) buffer.readUnsignedShortLE128();
                        }
                    }
                    long long_21 = i_2 | (long) (++npc.headMeshModifierCount - 1) << 32;
                    new NPCMeshModifier(long_21, ints_18, shorts_19, shorts_20);
                }
            }
            if ((i_4 & 0x10000) != 0) {
                npc.anInt10582 = buffer.readUnsignedShort128();
                if (npc.anInt10582 == 65535) {
                    npc.anInt10582 = npc.definitions.combatLevel;
                }
            }
            if ((i_4 & 0x400000) != 0) {
                npc.varns.method2607();
                int i_14 = buffer.buffer[++buffer.index - 1] & 0xff;
                for (int i_6 = 0; i_6 < i_14; i_6++) {
                    int i_7 = buffer.readUnsignedShort();
                    int i_8 = buffer.readIntV1();
                    npc.varns.setVarn(i_7, i_8);
                }
            }
            if ((i_4 & 0x4) != 0) {
                npc.faceX = buffer.readUnsignedShortLE128();
                npc.faceY = buffer.readShortLE();
            }
            if ((i_4 & 0x20000) != 0) {
                npc.redAdd = buffer.read128Byte();
                npc.greenAdd = buffer.readByte();
                npc.blueAdd = buffer.readByte();
                npc.scalar = (byte) buffer.readUnsigned128Byte();
                npc.anInt10347 = client.cycles + buffer.readShortLE();
                npc.anInt10348 = client.cycles + buffer.readUnsignedShort();
            }
            if ((i_4 & 0x800000) != 0) {
                npc.modifiedName = buffer.readString();
                if (npc.modifiedName != null && npc.modifiedName.isEmpty() || npc.modifiedName.equals(npc.definitions.name)) {
                    npc.modifiedName = npc.definitions.name;
                }
            }
            if ((i_4 & 0x2) != 0) {
                npc.method16164(buffer.readString());
            }
            if ((i_4 & 0x4000) != 0) {
                int i_14 = buffer.readUnsigned128Byte();
                int[] ints_15 = new int[i_14];
                int[] ints_16 = new int[i_14];
                for (int i_8 = 0; i_8 < i_14; i_8++) {
                    int i_9 = buffer.readUnsignedShortLE128();
                    if ((i_9 & 0xc000) == 49152) {
                        int i_10 = buffer.readUnsignedShort();
                        ints_15[i_8] = i_9 << 16 | i_10;
                    } else {
                        ints_15[i_8] = i_9;
                    }
                    ints_16[i_8] = buffer.readUnsignedShortLE128();
                }
                npc.method15797(ints_15, ints_16);
            }
            if ((i_4 & 0x20) != 0) {
                int i_14 = buffer.readUnsignedShort();
                int i_6 = buffer.readIntV2();
                if (i_14 == 65535) {
                    i_14 = -1;
                }
                int i_7 = buffer.readUnsignedByteC();
                int i_8 = i_7 & 0x7;
                int i_9 = i_7 >> 3 & 0xf;
                if (i_9 == 15) {
                    i_9 = -1;
                }
                boolean bool_24 = (i_7 >> 7 & 0x1) == 1;
                npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 0);
            }
        }
    }

}
