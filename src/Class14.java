public class Class14 {

	static int[] LOGIN_XTEAS;

	static int anInt133 = 0;

	static int anInt134 = 0;

	Class14() throws Throwable {
		throw new Error();
	}

	static void method537() {
		Class9.lobbyStage = 273;
		Class9.aClass184_73 = client.aClass184_7475;
		Class455.method7558(Class9.aLong77 == -1L, true, "", "", Class9.aLong77);
	}

	static final void decodeMasks() {
		RsBitsBuffer buffer = client.aClass184_7475.recievedBuffer;
		for (int i_1 = 0; i_1 < client.npcListSize; i_1++) {
			int i_2 = client.NPC_INDICES[i_1];
			NPC npc = (NPC) ((Class282_Sub47) client.NPCS.get((long) i_2)).anObject8068;
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
			int i_6;
			if ((i_4 & 0x10) != 0) {
				int[] ints_5 = new int[Class8_Sub3.method14339().length];
				for (i_6 = 0; i_6 < Class8_Sub3.method14339().length; i_6++) {
					ints_5[i_6] = buffer.readBigSmart();
				}
				i_6 = buffer.readUnsignedByte();
				Class20.animate(npc, ints_5, i_6, true, (byte) 23);
			}
			int i_7;
			int i_8;
			int i_10;
			int i_11;
			int i_12;
			int i_14;
			int[] ints_18;
			short[] shorts_19;
			short[] shorts_20;
			long long_21;
			if ((i_4 & 0x100) != 0) {
				i_14 = npc.definitions.modelIds.length;
				i_6 = 0;
				if (npc.definitions.aShortArray4892 != null) {
					i_6 = npc.definitions.aShortArray4892.length;
				}
				i_7 = 0;
				if (npc.definitions.aShortArray4867 != null) {
					i_7 = npc.definitions.aShortArray4867.length;
				}
				i_8 = buffer.readUnsigned128Byte();
				if ((i_8 & 0x1) == 1) {
					npc.aClass417_10581 = null;
				} else {
					ints_18 = null;
					if ((i_8 & 0x2) == 2) {
						ints_18 = new int[i_14];
						for (i_10 = 0; i_10 < i_14; i_10++) {
							ints_18[i_10] = buffer.readBigSmart();
						}
					}
					shorts_19 = null;
					if ((i_8 & 0x4) == 4) {
						shorts_19 = new short[i_6];
						for (i_11 = 0; i_11 < i_6; i_11++) {
							shorts_19[i_11] = (short) buffer.readUnsignedShort();
						}
					}
					shorts_20 = null;
					if ((i_8 & 0x8) == 8) {
						shorts_20 = new short[i_7];
						for (i_12 = 0; i_12 < i_7; i_12++) {
							shorts_20[i_12] = (short) buffer.readUnsignedShort();
						}
					}
					long_21 = (long) i_2 | (long) (++npc.anInt10583 - 1) << 32;
					npc.aClass417_10581 = new Class417(long_21, ints_18, shorts_19, shorts_20);
				}
			}
			if ((i_4 & 0x400) != 0) {
				npc.anInt10326 = buffer.read128Byte();
				npc.anInt10328 = buffer.readByte128();
				npc.anInt10341 = buffer.readByteC();
				npc.anInt10343 = buffer.readByte128();
				npc.anInt10342 = buffer.readShortLE() + client.cycles;
				npc.anInt10345 = buffer.readShortLE() + client.cycles;
				npc.anInt10346 = buffer.readUnsignedShortLE128();
				npc.anInt10326 += npc.regionBaseX[0];
				npc.anInt10328 += npc.regionBaseY[0];
				npc.anInt10341 += npc.regionBaseX[0];
				npc.anInt10343 += npc.regionBaseY[0];
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
				i_14 = buffer.buffer[++buffer.index - 1] & 0xff;
				for (i_6 = 0; i_6 < i_14; i_6++) {
					i_7 = buffer.readUnsignedShortLE128();
					i_8 = buffer.readIntV1();
					npc.aClass153_10579.method2614(i_7, i_8);
				}
			}
			int i_9;
			boolean bool_24;
			if ((i_4 & 0x1000000) != 0) {
				i_14 = buffer.readUnsignedShort128();
				i_6 = buffer.readIntV2();
				if (i_14 == 65535) {
					i_14 = -1;
				}
				i_7 = buffer.readUnsignedByte128();
				i_8 = i_7 & 0x7;
				i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}
				bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 3, -770849102);
			}
			if ((i_4 & 0x80) != 0) {
				npc.faceEntity = buffer.readShortLE();
				if (npc.faceEntity == 65535) {
					npc.faceEntity = -1;
				}
			}
			int[] ints_15;
			int[] ints_16;
			if ((i_4 & 0x8000) != 0) {
				i_14 = buffer.readUnsignedByteC();
				ints_15 = new int[i_14];
				ints_16 = new int[i_14];
				int[] ints_17 = new int[i_14];
				for (i_9 = 0; i_9 < i_14; i_9++) {
					i_10 = buffer.readBigSmart();
					ints_15[i_9] = i_10;
					ints_16[i_9] = buffer.readUnsignedByte();
					ints_17[i_9] = buffer.readShortLE();
				}
				QuickchatCategoryLoader.method5923(npc, ints_15, ints_16, ints_17, -125170497);
			}
			if ((i_4 & 0x800) != 0) {
				i_14 = buffer.readShortLE();
				i_6 = buffer.readInt();
				if (i_14 == 65535) {
					i_14 = -1;
				}
				i_7 = buffer.readUnsignedByte128();
				i_8 = i_7 & 0x7;
				i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}
				bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 1, 733349032);
			}
			if ((i_4 & 0x1) != 0) {
				i_14 = buffer.readUnsignedByte128();
				if (i_14 > 0) {
					for (i_6 = 0; i_6 < i_14; i_6++) {
						i_7 = -1;
						boolean bool_23 = true;
						i_9 = -1;
						i_10 = buffer.readUnsignedSmart();
						if (i_10 == 32767) {
							i_10 = buffer.readUnsignedSmart();
							i_8 = buffer.readUnsignedSmart();
							i_7 = buffer.readUnsignedSmart();
							i_9 = buffer.readUnsignedSmart();
						} else if (i_10 != 32766) {
							i_8 = buffer.readUnsignedSmart();
						} else {
							i_10 = -1;
							i_8 = buffer.readUnsignedByte();
						}
						i_11 = buffer.readUnsignedSmart();
						npc.applyHit(i_10, i_8, i_7, i_9, client.cycles, i_11, 1810678734);
					}
				}
				i_6 = buffer.readUnsignedByte128();
				if (i_6 > 0) {
					for (i_7 = 0; i_7 < i_6; i_7++) {
						i_8 = buffer.readUnsignedSmart();
						i_9 = buffer.readUnsignedSmart();
						if (i_9 != 32767) {
							i_10 = buffer.readUnsignedSmart();
							i_11 = buffer.readUnsigned128Byte();
							i_12 = i_9 > 0 ? buffer.readUnsignedByte128() : i_11;
							npc.displayHitbar(i_8, client.cycles, i_9, i_10, i_11, i_12);
						} else {
							npc.method15857(i_8);
						}
					}
				}
			}
			if ((i_4 & 0x8) != 0) {
				if (npc.definitions.method6886(-1543379642)) {
					TextureDetails.method2876(npc);
				}
				npc.setDefinition(IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(buffer.readBigSmart()));
				npc.setBoundSize(npc.definitions.size);
				npc.anInt10340 = npc.definitions.contrast << 3;
				if (npc.definitions.method6886(-1928423029)) {
					Class397.method6775(npc.plane, npc.regionBaseX[0], npc.regionBaseY[0], 0, (ObjectDefinitions) null, npc, (Player) null, 352984427);
				}
			}
			if ((i_4 & 0x2000000) != 0) {
				i_14 = buffer.readShortLE();
				i_6 = buffer.readIntLE();
				if (i_14 == 65535) {
					i_14 = -1;
				}
				i_7 = buffer.readUnsignedByte();
				i_8 = i_7 & 0x7;
				i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}
				bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 2, -195417019);
			}
			if ((i_4 & 0x80000) != 0) {
				i_14 = buffer.buffer[++buffer.index - 1] & 0xff;
				for (i_6 = 0; i_6 < i_14; i_6++) {
					i_7 = buffer.readUnsignedByte128();
					i_8 = buffer.readInt();
					i_9 = buffer.method13132();
					npc.method16179(i_7, i_8, i_9);
				}
			}
			if ((i_4 & 0x40000) != 0) {
				i_14 = npc.definitions.anIntArray4860.length;
				i_6 = 0;
				if (npc.definitions.aShortArray4892 != null) {
					i_6 = npc.definitions.aShortArray4892.length;
				}
				byte b_25 = 0;
				if (npc.definitions.aShortArray4867 != null) {
					i_6 = npc.definitions.aShortArray4867.length;
				}
				i_8 = buffer.readUnsignedByte128();
				if ((i_8 & 0x1) != 1) {
					ints_18 = null;
					if ((i_8 & 0x2) == 2) {
						ints_18 = new int[i_14];
						for (i_10 = 0; i_10 < i_14; i_10++) {
							ints_18[i_10] = buffer.readBigSmart();
						}
					}
					shorts_19 = null;
					if ((i_8 & 0x4) == 4) {
						shorts_19 = new short[i_6];
						for (i_11 = 0; i_11 < i_6; i_11++) {
							shorts_19[i_11] = (short) buffer.readUnsignedShort();
						}
					}
					shorts_20 = null;
					if ((i_8 & 0x8) == 8) {
						shorts_20 = new short[b_25];
						for (i_12 = 0; i_12 < b_25; i_12++) {
							shorts_20[i_12] = (short) buffer.readUnsignedShortLE128();
						}
					}
					long_21 = (long) i_2 | (long) (++npc.anInt10576 - 1) << 32;
					new Class417(long_21, ints_18, shorts_19, shorts_20);
				}
			}
			if ((i_4 & 0x10000) != 0) {
				npc.anInt10582 = buffer.readUnsignedShort128();
				if (npc.anInt10582 == 65535) {
					npc.anInt10582 = npc.definitions.combatLevel;
				}
			}
			if ((i_4 & 0x400000) != 0) {
				npc.aClass153_10579.method2607();
				i_14 = buffer.buffer[++buffer.index - 1] & 0xff;
				for (i_6 = 0; i_6 < i_14; i_6++) {
					i_7 = buffer.readUnsignedShort();
					i_8 = buffer.readIntV1();
					npc.aClass153_10579.method2614(i_7, i_8);
				}
			}
			if ((i_4 & 0x4) != 0) {
				npc.anInt10578 = buffer.readUnsignedShortLE128();
				npc.anInt10577 = buffer.readShortLE();
			}
			if ((i_4 & 0x20000) != 0) {
				npc.aByte10371 = buffer.read128Byte();
				npc.aByte10327 = buffer.readByte();
				npc.aByte10364 = buffer.readByte();
				npc.aByte10352 = (byte) buffer.readUnsigned128Byte();
				npc.anInt10347 = client.cycles + buffer.readShortLE();
				npc.anInt10348 = client.cycles + buffer.readUnsignedShort();
			}
			if ((i_4 & 0x800000) != 0) {
				npc.aString10584 = buffer.readString();
				if ("".equals(npc.aString10584) || npc.aString10584.equals(npc.definitions.name)) {
					npc.aString10584 = npc.definitions.name;
				}
			}
			if ((i_4 & 0x2) != 0) {
				npc.method16164(buffer.readString());
			}
			if ((i_4 & 0x4000) != 0) {
				i_14 = buffer.readUnsigned128Byte();
				ints_15 = new int[i_14];
				ints_16 = new int[i_14];
				for (i_8 = 0; i_8 < i_14; i_8++) {
					i_9 = buffer.readUnsignedShortLE128();
					if ((i_9 & 0xc000) == 49152) {
						i_10 = buffer.readUnsignedShort();
						ints_15[i_8] = i_9 << 16 | i_10;
					} else {
						ints_15[i_8] = i_9;
					}
					ints_16[i_8] = buffer.readUnsignedShortLE128();
				}
				npc.method15797(ints_15, ints_16);
			}
			if ((i_4 & 0x20) != 0) {
				i_14 = buffer.readUnsignedShort();
				i_6 = buffer.readIntV2();
				if (i_14 == 65535) {
					i_14 = -1;
				}
				i_7 = buffer.readUnsignedByteC();
				i_8 = i_7 & 0x7;
				i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}
				bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 0, 1997289787);
			}
		}
	}

	static boolean method539(int i_0, int i_1) {
		return i_0 == 57 || i_0 == 58 || i_0 == 1007 || i_0 == 25 || i_0 == 30;
	}
}
