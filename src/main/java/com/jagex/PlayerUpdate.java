package com.jagex;

public class PlayerUpdate {

	static void decode(ByteBuf.Bit buffer, int size) {
		Class197.CURR_MASK_UPDATE_IDX = 0;
		decodeAddRemove(buffer);
		decodeMasks(buffer);
		if (buffer.index != size)
			throw new RuntimeException(buffer.index + " " + size);
	}

	static void decodeAddRemove(ByteBuf.Bit stream) {
		int bytesLeft = 0;
		stream.initBitAccess();
		for (int count = 0; count < Class197.NUM_PLAYER_INDICES; count++) {
			int pid = Class197.PLAYER_INDICES[count];
			if ((Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] & 0x1) == 0)
				if (bytesLeft > 0) {
					--bytesLeft;
					Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] |= 0x2;
				} else {
					int needsUpdate = stream.readBits(1);
					System.out.println("Needs update local nsn0: [ PID: " + pid + " needsUpdate: " + needsUpdate + "]");
					if (needsUpdate == 0) {
						bytesLeft = decodeSkip(stream);
						Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] |= 0x2;
					} else
						decodeUpdate(stream, pid);
				}
		}
		stream.finishBitAccess();
		if (bytesLeft != 0)
			throw new RuntimeException();
		stream.initBitAccess();
		for (int count = 0; count < Class197.NUM_PLAYER_INDICES; count++) {
			int pid = Class197.PLAYER_INDICES[count];
			if ((Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] & 0x1) != 0)
				if (bytesLeft > 0) {
					--bytesLeft;
					Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] |= 0x2;
				} else {
					int needsUpdate = stream.readBits(1);
					System.out.println("Needs update local nsn1: [ PID: " + pid + " needsUpdate: " + needsUpdate + "]");
					if (needsUpdate == 0) {
						bytesLeft = decodeSkip(stream);
						Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] |= 0x2;
					} else
						decodeUpdate(stream, pid);
				}
		}
		stream.finishBitAccess();
		if (bytesLeft != 0)
			throw new RuntimeException();
		else {
			stream.initBitAccess();
			for (int count = 0; count < Class197.anInt2431; count++) {
				int pid = Class197.anIntArray2426[count];
				if ((Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] & 0x1) != 0)
					if (bytesLeft > 0) {
						--bytesLeft;
						Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] |= 0x2;
					} else {
						int needsUpdate = stream.readBits(1);
						System.out.println("Needs update outside nsn0: [ PID: " + pid + " needsUpdate: " + needsUpdate + "]");
						if (needsUpdate == 0) {
							bytesLeft = decodeSkip(stream);
							Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] |= 0x2;
						} else if (decodeRegionHash(stream, pid))
							Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] |= 0x2;
					}
			}
			stream.finishBitAccess();
			if (bytesLeft != 0)
				throw new RuntimeException();
			else {
				stream.initBitAccess();
				for (int count = 0; count < Class197.anInt2431; count++) {
					int pid = Class197.anIntArray2426[count];
					if ((Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] & 0x1) == 0)
						if (bytesLeft > 0) {
							--bytesLeft;
							Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] |= 0x2;
						} else {
							int needsUpdate = stream.readBits(1);
							System.out.println("Needs update outside nsn1: [ PID: " + pid + " needsUpdate: " + needsUpdate + "]");
							if (needsUpdate == 0) {
								bytesLeft = decodeSkip(stream);
								Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] |= 0x2;
							} else if (decodeRegionHash(stream, pid))
								Class197.PLAYER_UPDATE_SLOT_FLAGS[pid] |= 0x2;
						}
				}
				stream.finishBitAccess();
				if (bytesLeft != 0)
					throw new RuntimeException();
				else {
					Class197.NUM_PLAYER_INDICES = 0;
					Class197.anInt2431 = 0;
					for (int count = 1; count < 2048; count++) {
						Class197.PLAYER_UPDATE_SLOT_FLAGS[count] >>= 1;
						PlayerEntity player_6 = client.PLAYER_LIST[count];
						if (player_6 != null)
							Class197.PLAYER_INDICES[++Class197.NUM_PLAYER_INDICES - 1] = count;
						else
							Class197.anIntArray2426[++Class197.anInt2431 - 1] = count;
					}
				}
			}
		}
	}

	static void decodeMasks(ByteBuf.Bit buffer) {
		for (int i = 0; i < Class197.CURR_MASK_UPDATE_IDX; i++) {
			int pid = Class197.NEEDS_MASK_UPDATE[i];
			System.out.println("Updating masks: PID: " + pid);
			PlayerEntity player = client.PLAYER_LIST[pid];
			int i_5 = buffer.readUnsignedByte();
			if ((i_5 & 0x8) != 0)
				i_5 += buffer.readUnsignedByte() << 8;
			if ((i_5 & 0x100) != 0)
				i_5 += buffer.readUnsignedByte() << 16;
			decodeMasksBody(buffer, pid, player, i_5);
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
			if (i_6 == 65535)
				i_6 = -1;

			int i_8 = stream.readUnsigned128Byte();
			int i_9 = i_8 & 0x7;
			int i_10 = i_8 >> 3 & 0xf;
			if (i_10 == 15)
				i_10 = -1;

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

		if ((flags & 0x10000) != 0)
			player.aBool10550 = stream.readUnsigned128Byte() == 1;

		if ((flags & 0x100000) != 0) {
			int size = stream.readUnsigned128Byte();
			int[] ints_14 = new int[size];
			int[] ints_15 = new int[size];

			for (int i_9 = 0; i_9 < size; i_9++) {
				int i_10 = stream.readUnsignedShort128();
				if ((i_10 & 0xc000) == 0xc000) {
					int i_19 = stream.readUnsignedShort128();
					ints_14[i_9] = i_10 << 16 | i_19;
				} else
					ints_14[i_9] = i_10;

				ints_15[i_9] = stream.readUnsignedShort();
			}

			player.applyModelRotations(ints_14, ints_15);
		}

		if ((flags & 0x4000) != 0) {
			String string_16 = stream.readString();
			if (player == VertexNormal.MY_PLAYER)
				ChatLine.appendChatMessage(MessageType.PUBLIC_CHAT, 0, player.getUsernameWithTitle(), player.getDisplayName(), player.username, string_16);

			player.sendChat(string_16, 0, 0);
		}

		if ((flags & 0x80000) != 0) {
			String string_16 = stream.readString();
			int i_7 = stream.readUnsignedByte128();
			if ((i_7 & 0x1) != 0)
				ChatLine.appendChatMessage(MessageType.PUBLIC_CHAT, i_7, player.getUsernameWithTitle(), player.getDisplayName(), player.username, string_16);

			player.sendChat(string_16, 0, 0);
		}

		if ((flags & 0x40000) != 0) {
			int i_6 = stream.readUnsignedShortLE128();
			int i_7 = stream.readIntV2();
			if (i_6 == 65535)
				i_6 = -1;

			int i_8 = stream.readUnsignedByte128();
			int i_9 = i_8 & 0x7;
			int i_10 = i_8 >> 3 & 0xf;
			if (i_10 == 15)
				i_10 = -1;

			boolean bool_11 = (i_8 >> 7 & 0x1) == 1;
			player.sendSpotAnim(i_6, i_7, i_9, i_10, bool_11, 2);
		}

		if ((flags & 0x8000) != 0)
			player.aBool10571 = stream.readUnsigned128Byte() == 1;

		if ((flags & 0x40) != 0) {
			int i_6 = stream.readUnsigned128Byte();
			int i_12;
			if (i_6 > 0)
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
					} else
						i_9 = stream.readSmart();

					i_12 = stream.readSmart();
					player.applyHit(i_19, i_9, i_8, i_10, client.FRAME_COUNT, i_12);
				}

			int i_7 = stream.readUnsignedByte();
			if (i_7 > 0)
				for (int i_8 = 0; i_8 < i_7; i_8++) {
					int i_9 = stream.readSmart();
					int i_10 = stream.readSmart();
					if (i_10 != 32767) {
						int i_19 = stream.readSmart();
						i_12 = stream.readUnsigned128Byte();
						int i_13 = i_10 > 0 ? stream.readUnsignedByte128() : i_12;
						player.displayHitbar(i_9, client.FRAME_COUNT, i_10, i_19, i_12, i_13);
					} else
						player.method15857(i_9);
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

			for (int i_7 = 0; i_7 < MoveSpeed.values().length; i_7++)
				ints_23[i_7] = stream.readBigSmart();

			int i_7 = stream.readUnsignedByte();
			Class20.animate(player, ints_23, i_7, false);
		}

		if ((flags & 0x2) != 0) {
			int i_6 = stream.readUnsignedShort128();
			if (i_6 == 65535)
				i_6 = -1;

			player.faceEntity = i_6;
		}

		if ((flags & 0x1000) != 0)
			tempMoveType = stream.readByteC();

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

		if ((flags & 0x4) != 0)
			Class197.playerMovementTypes[i_1] = stream.read128Byte();

		if ((flags & 0x200000) != 0) {
			int i_6 = stream.readShortLE();
			int i_7 = stream.readIntLE();
			if (i_6 == 65535)
				i_6 = -1;

			int i_8 = stream.readUnsigned128Byte();
			int i_9 = i_8 & 0x7;
			int i_10 = i_8 >> 3 & 0xf;
			if (i_10 == 15)
				i_10 = -1;

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
			if (player.needsMaskUpdate) {
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
			if (spotAnimId == 65535)
				spotAnimId = -1;

			int flags2 = stream.readUnsignedByte128();
			int rotation = flags2 & 0x7;
			int i_10 = flags2 >> 3 & 0xf;
			if (i_10 == 15)
				i_10 = -1;

			boolean bool_11 = (flags2 >> 7 & 0x1) == 1;
			player.sendSpotAnim(spotAnimId, flags1, rotation, i_10, bool_11, 0);
		}

		if (player.needsMaskUpdate)
			if (tempMoveType == 127)
				player.move(player.anInt10569, player.anInt10570);
			else {
				byte b_20;
				if (tempMoveType != MoveSpeed.STATIONARY.id)
					b_20 = tempMoveType;
				else
					b_20 = Class197.playerMovementTypes[i_1];

				Class236.method3985(player, b_20);
				player.method16129(player.anInt10569, player.anInt10570, b_20);
			}

	}

	static void decodeUpdate(ByteBuf.Bit stream, int pid) {
		CoordGrid mapBase = IndexLoaders.MAP_REGION_DECODER.getBase();
		boolean needsMaskUpdate = stream.readBits(1) == 1;
		if (needsMaskUpdate)
			Class197.NEEDS_MASK_UPDATE[++Class197.CURR_MASK_UPDATE_IDX - 1] = pid;
		int updateType = stream.readBits(2);
		System.out.println("Decoding update: [ PID:" + pid + " needsMasksUpdate: " + needsMaskUpdate + " updateType: " + updateType + "]");
		PlayerEntity player = client.PLAYER_LIST[pid];
		switch (updateType) {
		case 0 -> { //REMOVE FROM SCREEN
			if (needsMaskUpdate)
				player.needsMaskUpdate = false;
			else {
				if (client.myPlayerIndex == pid)
					throw new RuntimeException();
				Class4 class4_14 = Class197.aClass4Array2430[pid] = new Class4();
				class4_14.regionHash = (player.plane << 28) + (mapBase.y + player.regionBaseY[0] >> 6) + (mapBase.x + player.regionBaseX[0] >> 6 << 14);
				if (player.faceDirection != -1)
					class4_14.faceAngle = player.faceDirection;
				else
					class4_14.faceAngle = player.aClass19_10359.method578();
				class4_14.faceEntity = player.faceEntity;
				class4_14.aBool29 = player.aBool10571;
				class4_14.aBool33 = player.aBool10550;
				if (player.isNpc > 0)
					Class149_Sub2.method14609(player);
				client.PLAYER_LIST[pid] = null;
				if (stream.readBits(1) != 0)
					decodeRegionHash(stream, pid);
			}
		}
		case 1 -> { //WALKING
			int walkOpcode = stream.readBits(3);
			int xStart = player.regionBaseX[0];
			int yStart = player.regionBaseY[0];
			if (walkOpcode == 0) {
				--xStart;
				--yStart;
			} else if (walkOpcode == 1)
				--yStart;
			else if (walkOpcode == 2) {
				++xStart;
				--yStart;
			} else if (walkOpcode == 3)
				--xStart;
			else if (walkOpcode == 4)
				++xStart;
			else if (walkOpcode == 5) {
				--xStart;
				++yStart;
			} else if (walkOpcode == 6)
				++yStart;
			else if (walkOpcode == 7) {
				++xStart;
				++yStart;
			}
			if (needsMaskUpdate) {
				player.anInt10569 = xStart;
				player.anInt10570 = yStart;
				player.needsMaskUpdate = true;
			} else
				player.method16129(xStart, yStart, Class197.playerMovementTypes[pid]);
		}
		case 2 -> { //RUNNING
			int runOpcode = stream.readBits(4);
			int xStart = player.regionBaseX[0];
			int yStart = player.regionBaseY[0];
			if (runOpcode == 0) {
				xStart -= 2;
				yStart -= 2;
			} else if (runOpcode == 1) {
				--xStart;
				yStart -= 2;
			} else if (runOpcode == 2)
				yStart -= 2;
			else if (runOpcode == 3) {
				++xStart;
				yStart -= 2;
			} else if (runOpcode == 4) {
				xStart += 2;
				yStart -= 2;
			} else if (runOpcode == 5) {
				xStart -= 2;
				--yStart;
			} else if (runOpcode == 6) {
				xStart += 2;
				--yStart;
			} else if (runOpcode == 7)
				xStart -= 2;
			else if (runOpcode == 8)
				xStart += 2;
			else if (runOpcode == 9) {
				xStart -= 2;
				++yStart;
			} else if (runOpcode == 10) {
				xStart += 2;
				++yStart;
			} else if (runOpcode == 11) {
				xStart -= 2;
				yStart += 2;
			} else if (runOpcode == 12) {
				--xStart;
				yStart += 2;
			} else if (runOpcode == 13)
				yStart += 2;
			else if (runOpcode == 14) {
				++xStart;
				yStart += 2;
			} else if (runOpcode == 15) {
				xStart += 2;
				yStart += 2;
			}
			if (needsMaskUpdate) {
				player.anInt10569 = xStart;
				player.anInt10570 = yStart;
				player.needsMaskUpdate = true;
			} else
				player.method16129(xStart, yStart, Class197.playerMovementTypes[pid]);
		}
		default -> { //TELEPORT
			boolean localTele = stream.readBits(1) == 0;
			if (localTele) {
				int posHash = stream.readBits(12);
				int planeOffset = posHash >> 10;
				int xOffset = posHash >> 5 & 0x1f;
				if (xOffset > 15)
					xOffset -= 32;
				int yOffset = posHash & 0x1f;
				if (yOffset > 15)
					yOffset -= 32;
				System.out.println("Teleport local offset: " + xOffset + ", " + yOffset + ", " + planeOffset);
				int newX = xOffset + player.regionBaseX[0];
				int newY = yOffset + player.regionBaseY[0];
				if (needsMaskUpdate) {
					player.anInt10569 = newX;
					player.anInt10570 = newY;
					player.needsMaskUpdate = true;
				} else
					player.method16129(newX, newY, Class197.playerMovementTypes[pid]);
				player.plane = player.collisionPlane = (byte) (planeOffset + player.plane & 0x3);
				if (IndexLoaders.MAP_REGION_DECODER.getRenderFlags().isLowerObjectsToOverrideClipping(newX, newY))
					player.collisionPlane += 1;
				if (client.myPlayerIndex == pid && player.plane != Class4.MY_PLAYER_PLANE)
					Class4.MY_PLAYER_PLANE = player.plane;
			} else {
				int posHash = stream.readBits(30);
				int plane = posHash >> 28;
				int x = posHash >> 14 & 0x3fff;
				int y = posHash & 0x3fff;
				int localX = (x + mapBase.x + player.regionBaseX[0] & 0x3fff) - mapBase.x;
				int localY = (y + mapBase.y + player.regionBaseY[0] & 0x3fff) - mapBase.y;
				System.out.println("Teleport far: " + x + ", " + y + ", " + plane);
				if (needsMaskUpdate) {
					player.anInt10569 = localX;
					player.anInt10570 = localY;
					player.needsMaskUpdate = true;
				} else
					player.method16129(localX, localY, Class197.playerMovementTypes[pid]);
				player.plane = player.collisionPlane = (byte) (plane + player.plane & 0x3);
				if (IndexLoaders.MAP_REGION_DECODER.getRenderFlags().isLowerObjectsToOverrideClipping(localX, localY))
					player.collisionPlane += 1;
				if (client.myPlayerIndex == pid)
					Class4.MY_PLAYER_PLANE = player.plane;
			}
		}
		}
	}

	static int decodeSkip(ByteBuf.Bit rsbitsbuffer_0) {
		int i_2 = rsbitsbuffer_0.readBits(2);
		int i_3;
		if (i_2 == 0)
			i_3 = 0;
		else if (i_2 == 1)
			i_3 = rsbitsbuffer_0.readBits(5);
		else if (i_2 == 2)
			i_3 = rsbitsbuffer_0.readBits(8);
		else
			i_3 = rsbitsbuffer_0.readBits(11);

		return i_3;
	}

	static boolean decodeRegionHash(ByteBuf.Bit stream, int pid) {
		switch(stream.readBits(2)) {
		case 0 -> {
			if (stream.readBits(1) != 0)
				decodeRegionHash(stream, pid);
			int i_4 = stream.readBits(6);
			int i_5 = stream.readBits(6);
			boolean bool_18 = stream.readBits(1) == 1;
			if (bool_18)
				Class197.NEEDS_MASK_UPDATE[++Class197.CURR_MASK_UPDATE_IDX - 1] = pid;
			if (client.PLAYER_LIST[pid] != null)
				throw new RuntimeException();
			else {
				Class4 class4_7 = Class197.aClass4Array2430[pid];
				PlayerEntity player_8 = client.PLAYER_LIST[pid] = new PlayerEntity(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager());
				player_8.index = pid;
				if (Class197.aNode_Sub35Array2428[pid] != null)
					player_8.decodeAppearance(Class197.aNode_Sub35Array2428[pid]);
				player_8.turn(class4_7.faceAngle, true);
				player_8.faceEntity = class4_7.faceEntity;
				int i_9 = class4_7.regionHash;
				int i_10 = i_9 >> 28;
				int i_11 = i_9 >> 14 & 0xff;
				int i_12 = i_9 & 0xff;
				CoordGrid coordgrid_13 = IndexLoaders.MAP_REGION_DECODER.getBase();
				int i_14 = i_4 + (i_11 << 6) - coordgrid_13.x;
				int i_15 = i_5 + (i_12 << 6) - coordgrid_13.y;
				player_8.aBool10571 = class4_7.aBool29;
				player_8.aBool10550 = class4_7.aBool33;
				player_8.walkTypes[0] = Class197.playerMovementTypes[pid];
				player_8.plane = player_8.collisionPlane = (byte) i_10;
				if (IndexLoaders.MAP_REGION_DECODER.getRenderFlags().isLowerObjectsToOverrideClipping(i_14, i_15))
					player_8.collisionPlane += 1;
				player_8.move(i_14, i_15);
				player_8.needsMaskUpdate = false;
				Class197.aClass4Array2430[pid] = null;
				return true;
			}
		}
		
		case 1 -> {
			int planeOffset = stream.readBits(2);
			int regionHash = Class197.aClass4Array2430[pid].regionHash;
			Class197.aClass4Array2430[pid].regionHash = (regionHash & 0xfffffff) + (((regionHash >> 28) + planeOffset & 0x3) << 28);
			return false;
		}
		
		case 2 -> {
			int smallOffsetHash = stream.readBits(5);
			int planeOffset = smallOffsetHash >> 3;
			int opcode = smallOffsetHash & 0x7;
			int regionHash = Class197.aClass4Array2430[pid].regionHash;
			int plane = (regionHash >> 28) + planeOffset & 0x3;
			int x = regionHash >> 14 & 0xff;
			int y = regionHash & 0xff;
			if (opcode == 0) {
				--x;
				--y;
			}
			if (opcode == 1)
				--y;
			if (opcode == 2) {
				++x;
				--y;
			}
			if (opcode == 3)
				--x;
			if (opcode == 4)
				++x;
			if (opcode == 5) {
				--x;
				++y;
			}
			if (opcode == 6)
				++y;
			if (opcode == 7) {
				++x;
				++y;
			}
			Class197.aClass4Array2430[pid].regionHash = (x << 14) + y + (plane << 28);
		}
		
		case 3 -> {
			int updateHash = stream.readBits(18);
			int planeOffset = updateHash >> 16;
			int xOffset = updateHash >> 8 & 0xff;
			int yOffset = updateHash & 0xff;
			int oldHash = Class197.aClass4Array2430[pid].regionHash;
			int plane = (oldHash >> 28) + planeOffset & 0x3;
			int x = xOffset + (oldHash >> 14) & 0xff;
			int y = yOffset + oldHash & 0xff;
			Class197.aClass4Array2430[pid].regionHash = (x << 14) + y + (plane << 28);
			return false;
		}
		
		default -> throw new IllegalArgumentException("Unexpected region update type");
		}
		return false;
	}

}
