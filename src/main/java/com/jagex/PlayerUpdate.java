package com.jagex;

public class PlayerUpdate {

    static void decode(ByteBuf.Bit buffer, int size) {
        Class197.anInt2434 = 0;
        decodeUpdate(buffer);
        decodeMasks(buffer);
        if (buffer.index != size) {
            throw new RuntimeException(buffer.index + " " + size);
        }
    }

    static void decodeUpdate(ByteBuf.Bit bitPacket) {
        int i_2 = 0;
        bitPacket.initBitAccess();
        int i_3;
        int i_4;
        int i_5;
        for (i_3 = 0; i_3 < Class197.NUM_PLAYER_INDICES; i_3++) {
            i_4 = Class197.PLAYER_INDICES[i_3];
            if ((Class197.aByteArray2424[i_4] & 0x1) == 0) {
                if (i_2 > 0) {
                    --i_2;
                    Class197.aByteArray2424[i_4] |= 0x2;
                } else {
                    i_5 = bitPacket.readBits(1);
                    if (i_5 == 0) {
                        i_2 = Class399.decodeSkip(bitPacket);
                        Class197.aByteArray2424[i_4] |= 0x2;
                    } else {
                        NewsItem.method1806(bitPacket, i_4);
                    }
                }
            }
        }
        bitPacket.finishBitAccess();
        if (i_2 != 0) {
            throw new RuntimeException();
        } else {
            bitPacket.initBitAccess();
            for (i_3 = 0; i_3 < Class197.NUM_PLAYER_INDICES; i_3++) {
                i_4 = Class197.PLAYER_INDICES[i_3];
                if ((Class197.aByteArray2424[i_4] & 0x1) != 0) {
                    if (i_2 > 0) {
                        --i_2;
                        Class197.aByteArray2424[i_4] |= 0x2;
                    } else {
                        i_5 = bitPacket.readBits(1);
                        if (i_5 == 0) {
                            i_2 = Class399.decodeSkip(bitPacket);
                            Class197.aByteArray2424[i_4] |= 0x2;
                        } else {
                            NewsItem.method1806(bitPacket, i_4);
                        }
                    }
                }
            }
            bitPacket.finishBitAccess();
            if (i_2 != 0) {
                throw new RuntimeException();
            } else {
                bitPacket.initBitAccess();
                for (i_3 = 0; i_3 < Class197.anInt2431; i_3++) {
                    i_4 = Class197.anIntArray2426[i_3];
                    if ((Class197.aByteArray2424[i_4] & 0x1) != 0) {
                        if (i_2 > 0) {
                            --i_2;
                            Class197.aByteArray2424[i_4] |= 0x2;
                        } else {
                            i_5 = bitPacket.readBits(1);
                            if (i_5 == 0) {
                                i_2 = Class399.decodeSkip(bitPacket);
                                Class197.aByteArray2424[i_4] |= 0x2;
                            } else if (QuickChatMessage.method6155(bitPacket, i_4)) {
                                Class197.aByteArray2424[i_4] |= 0x2;
                            }
                        }
                    }
                }
                bitPacket.finishBitAccess();
                if (i_2 != 0) {
                    throw new RuntimeException();
                } else {
                    bitPacket.initBitAccess();
                    for (i_3 = 0; i_3 < Class197.anInt2431; i_3++) {
                        i_4 = Class197.anIntArray2426[i_3];
                        if ((Class197.aByteArray2424[i_4] & 0x1) == 0) {
                            if (i_2 > 0) {
                                --i_2;
                                Class197.aByteArray2424[i_4] |= 0x2;
                            } else {
                                i_5 = bitPacket.readBits(1);
                                if (i_5 == 0) {
                                    i_2 = Class399.decodeSkip(bitPacket);
                                    Class197.aByteArray2424[i_4] |= 0x2;
                                } else if (QuickChatMessage.method6155(bitPacket, i_4)) {
                                    Class197.aByteArray2424[i_4] |= 0x2;
                                }
                            }
                        }
                    }
                    bitPacket.finishBitAccess();
                    if (i_2 != 0) {
                        throw new RuntimeException();
                    } else {
                        Class197.NUM_PLAYER_INDICES = 0;
                        Class197.anInt2431 = 0;
                        for (i_3 = 1; i_3 < 2048; i_3++) {
                            Class197.aByteArray2424[i_3] >>= 1;
                            PlayerEntity player_6 = client.players[i_3];
                            if (player_6 != null) {
                                Class197.PLAYER_INDICES[++Class197.NUM_PLAYER_INDICES - 1] = i_3;
                            } else {
                                Class197.anIntArray2426[++Class197.anInt2431 - 1] = i_3;
                            }
                        }
                    }
                }
            }
        }
    }

    static void decodeMasks(ByteBuf.Bit buffer) {
        for (int i_2 = 0; i_2 < Class197.anInt2434; i_2++) {
            int i_3 = Class197.anIntArray2435[i_2];
            PlayerEntity player_4 = client.players[i_3];
            int i_5 = buffer.readUnsignedByte();
            if ((i_5 & 0x8) != 0) {
                i_5 += buffer.readUnsignedByte() << 8;
            }
            if ((i_5 & 0x100) != 0) {
                i_5 += buffer.readUnsignedByte() << 16;
            }
            decodeMasksBody(buffer, i_3, player_4, i_5);
        }
    }

    static void decodeMasksBody(ByteBuf.Bit stream, int i_1, PlayerEntity player, int flags) {
        byte tempMoveType = MoveSpeed.STATIONARY.id;

        if ((flags & 0x20000) != 0) {
            player.redAdd = stream.readByte();
            player.greenAdd = stream.readByteC();
            player.blueAdd = stream.read128Byte();
            player.scalar = (byte) stream.readUnsigned128Byte();
            player.anInt10347 = client.FRAME_COUNT + stream.readUnsignedShort128();
            player.anInt10348 = client.FRAME_COUNT + stream.readUnsignedShort();
        }

        if ((flags & 0x400000) != 0) {
            int i_6 = stream.buffer[++stream.index - 1] & 0xff;

            for (int i_7 = 0; i_7 < i_6; i_7++) {
                int i_8 = stream.readShortLE();
                int i_9 = stream.readInt();
                player.aClass155_10561.method2625(i_8, i_9);
            }
        }

        if ((flags & 0x200) != 0) {
            int i_6 = stream.readUnsignedShort();
            int i_7 = stream.readIntV2();
            if (i_6 == 65535) {
                i_6 = -1;
            }

            int i_8 = stream.readUnsigned128Byte();
            int i_9 = i_8 & 0x7;
            int i_10 = i_8 >> 3 & 0xf;
            if (i_10 == 15) {
                i_10 = -1;
            }

            boolean bool_11 = (i_8 >> 7 & 0x1) == 1;
            player.sendSpotAnim(i_6, i_7, i_9, i_10, bool_11, 1);
        }

        if ((flags & 0x20) != 0) {
            player.faceDirection = stream.readUnsignedShort128();
            if (player.anInt10355 == 0) {
                player.method15863(player.faceDirection);
                player.faceDirection = -1;
            }
        }

        if ((flags & 0x800000) != 0) {
            player.aClass155_10561.method2624();
            int i_6 = stream.buffer[++stream.index - 1] & 0xff;

            for (int i_7 = 0; i_7 < i_6; i_7++) {
                int i_8 = stream.readShortLE();
                int i_9 = stream.readInt();
                player.aClass155_10561.method2625(i_8, i_9);
            }
        }

        if ((flags & 0x10000) != 0) {
            player.aBool10550 = stream.readUnsigned128Byte() == 1;
        }

        if ((flags & 0x100000) != 0) {
            int size = stream.readUnsigned128Byte();
            int[] ints_14 = new int[size];
            int[] ints_15 = new int[size];

            for (int i_9 = 0; i_9 < size; i_9++) {
                int i_10 = stream.readUnsignedShort128();
                if ((i_10 & 0xc000) == 0xc000) {
                    int i_19 = stream.readUnsignedShort128();
                    ints_14[i_9] = i_10 << 16 | i_19;
                } else {
                    ints_14[i_9] = i_10;
                }

                ints_15[i_9] = stream.readUnsignedShort();
            }

            player.applyModelRotations(ints_14, ints_15);
        }

        if ((flags & 0x4000) != 0) {
            String string_16 = stream.readString();
            if (player == VertexNormal.MY_PLAYER) {
                ChatLine.appendChatMessage(MessageType.PUBLIC_CHAT, 0, player.getUsernameWithTitle(), player.getDisplayName(), player.username, string_16);
            }

            player.sendChat(string_16, 0, 0);
        }

        if ((flags & 0x80000) != 0) {
            String string_16 = stream.readString();
            int i_7 = stream.readUnsignedByte128();
            if ((i_7 & 0x1) != 0) {
                ChatLine.appendChatMessage(MessageType.PUBLIC_CHAT, i_7, player.getUsernameWithTitle(), player.getDisplayName(), player.username, string_16);
            }

            player.sendChat(string_16, 0, 0);
        }

        if ((flags & 0x40000) != 0) {
            int i_6 = stream.readUnsignedShortLE128();
            int i_7 = stream.readIntV2();
            if (i_6 == 65535) {
                i_6 = -1;
            }

            int i_8 = stream.readUnsignedByte128();
            int i_9 = i_8 & 0x7;
            int i_10 = i_8 >> 3 & 0xf;
            if (i_10 == 15) {
                i_10 = -1;
            }

            boolean bool_11 = (i_8 >> 7 & 0x1) == 1;
            player.sendSpotAnim(i_6, i_7, i_9, i_10, bool_11, 2);
        }

        if ((flags & 0x8000) != 0) {
            player.aBool10571 = stream.readUnsigned128Byte() == 1;
        }

        if ((flags & 0x40) != 0) {
            int i_6 = stream.readUnsigned128Byte();
            int i_12;
            if (i_6 > 0) {
                for (int i_7 = 0; i_7 < i_6; i_7++) {
                    int i_8 = -1;
                    boolean bool_18 = true;
                    int i_10 = -1;
                    int i_9 = -1;
                    int i_19 = stream.readSmart();
                    if (i_19 == 32767) {
                        i_19 = stream.readSmart();
                        i_9 = stream.readSmart();
                        i_8 = stream.readSmart();
                        i_10 = stream.readSmart();
                    } else if (i_19 == 32766) {
                        i_19 = -1;
                        i_9 = stream.readUnsignedByteC();
                    } else {
                        i_9 = stream.readSmart();
                    }

                    i_12 = stream.readSmart();
                    player.applyHit(i_19, i_9, i_8, i_10, client.FRAME_COUNT, i_12);
                }
            }

            int i_7 = stream.readUnsignedByte();
            if (i_7 > 0) {
                for (int i_8 = 0; i_8 < i_7; i_8++) {
                    int i_9 = stream.readSmart();
                    int i_10 = stream.readSmart();
                    if (i_10 != 32767) {
                        int i_19 = stream.readSmart();
                        i_12 = stream.readUnsigned128Byte();
                        int i_13 = i_10 > 0 ? stream.readUnsignedByte128() : i_12;
                        player.displayHitbar(i_9, client.FRAME_COUNT, i_10, i_19, i_12, i_13);
                    } else {
                        player.method15857(i_9);
                    }
                }
            }
        }

        if ((flags & 0x1) != 0) {
            int i_6 = stream.readUnsignedByteC();
            byte[] bytes_21 = new byte[i_6];
            ByteBuf rsbytebuffer_22 = new ByteBuf(bytes_21);
            stream.readBytes(bytes_21, 0, i_6);
            Class197.aNode_Sub35Array2428[i_1] = rsbytebuffer_22;
            player.decodeAppearance(rsbytebuffer_22);
        }

        if ((flags & 0x10) != 0) {
            int[] ints_23 = new int[MoveSpeed.values().length];

            for (int i_7 = 0; i_7 < MoveSpeed.values().length; i_7++) {
                ints_23[i_7] = stream.readBigSmart();
            }

            int i_7 = stream.readUnsignedByte();
            Class20.animate(player, ints_23, i_7, false);
        }

        if ((flags & 0x2) != 0) {
            int i_6 = stream.readUnsignedShort128();
            if (i_6 == 65535) {
                i_6 = -1;
            }

            player.faceEntity = i_6;
        }

        if ((flags & 0x1000) != 0) {
            tempMoveType = stream.readByteC();
        }

        if ((flags & 0x2000) != 0) {
            int i_6 = stream.readUnsigned128Byte();
            int[] animationIds = new int[i_6];
            int[] ints_15 = new int[i_6];
            int[] ints_17 = new int[i_6];

            for (int i_10 = 0; i_10 < i_6; i_10++) {
                animationIds[i_10] = stream.readBigSmart();
                ints_15[i_10] = stream.readUnsignedByteC();
                ints_17[i_10] = stream.readUnsignedShortLE128();
            }

            QuickchatCategoryLoader.method5923(player, animationIds, ints_15, ints_17);
        }

        if ((flags & 0x4) != 0) {
            Class197.playerMovementTypes[i_1] = stream.read128Byte();
        }

        if ((flags & 0x200000) != 0) {
            int i_6 = stream.readShortLE();
            int i_7 = stream.readIntLE();
            if (i_6 == 65535) {
                i_6 = -1;
            }

            int i_8 = stream.readUnsigned128Byte();
            int i_9 = i_8 & 0x7;
            int i_10 = i_8 >> 3 & 0xf;
            if (i_10 == 15) {
                i_10 = -1;
            }

            boolean bool_11 = (i_8 >> 7 & 0x1) == 1;
            player.sendSpotAnim(i_6, i_7, i_9, i_10, bool_11, 3);
        }

        if ((flags & 0x800) != 0) {
            player.forceMovementT1XOff = stream.readByteC();
            player.forceMovementT1YOff = stream.read128Byte();
            player.forceMovementT2XOff = stream.readByte128();
            player.forceMovementT2YOff = stream.readByteC();
            player.forceMovementT1Delay = stream.readUnsignedShortLE128() + client.FRAME_COUNT;
            player.forceMovementT2Delay = stream.readShortLE() + client.FRAME_COUNT;
            player.forceMovementDir = stream.readUnsignedShort128();
            if (player.aBool10568) {
                player.forceMovementT1XOff += player.anInt10569;
                player.forceMovementT1YOff += player.anInt10570;
                player.forceMovementT2XOff += player.anInt10569;
                player.forceMovementT2YOff += player.anInt10570;
                player.anInt10355 = 0;
            } else {
                player.forceMovementT1XOff += player.regionBaseX[0];
                player.forceMovementT1YOff += player.regionBaseY[0];
                player.forceMovementT2XOff += player.regionBaseX[0];
                player.forceMovementT2YOff += player.regionBaseY[0];
                player.anInt10355 = 1;
            }

            player.anInt10367 = 0;
        }

        if ((flags & 0x80) != 0) {
            int spotAnimId = stream.readShortLE();
            int flags1 = stream.readInt();
            if (spotAnimId == 65535) {
                spotAnimId = -1;
            }

            int flags2 = stream.readUnsignedByte128();
            int rotation = flags2 & 0x7;
            int i_10 = flags2 >> 3 & 0xf;
            if (i_10 == 15) {
                i_10 = -1;
            }

            boolean bool_11 = (flags2 >> 7 & 0x1) == 1;
            player.sendSpotAnim(spotAnimId, flags1, rotation, i_10, bool_11, 0);
        }

        if (player.aBool10568) {
            if (tempMoveType == 127) {
                player.move(player.anInt10569, player.anInt10570);
            } else {
                byte b_20;
                if (tempMoveType != MoveSpeed.STATIONARY.id) {
                    b_20 = tempMoveType;
                } else {
                    b_20 = Class197.playerMovementTypes[i_1];
                }

                Class236.method3985(player, b_20);
                player.method16129(player.anInt10569, player.anInt10570, b_20);
            }
        }

    }

}
