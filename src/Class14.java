public class Class14 {

	static int[] LOGIN_XTEAS;
	static int anInt133 = 0;
	static int anInt134 = 0;

	Class14() throws Throwable {
		throw new Error();
	}

	static final void method536(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		String string_5 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		if (i_3 == -1) {
			throw new RuntimeException();
		} else {
			EnumDefinitions enumdefinitions_6 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_3, (byte) 8);
			if (i_2 != enumdefinitions_6.aChar5146) {
				throw new RuntimeException();
			} else if (enumdefinitions_6.aChar5140 != 115) {
				throw new RuntimeException();
			} else {
				int[] ints_7 = enumdefinitions_6.method7251(string_5, 1800176062);
				if (i_4 >= 0 && ints_7 != null && ints_7.length > i_4) {
					cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = ints_7[i_4];
				} else {
					throw new RuntimeException();
				}
			}
		}
	}

	static void method537(int i_0) {
		Class9.lobbyStage = 273;
		Class9.aClass184_73 = client.aClass184_7475;
		Class455.method7558(Class9.aLong77 == -1L, true, "", "", Class9.aLong77);
	}

	static final void decodeMasks() {
		RsBitsBuffer rsbitsbuffer_0 = client.aClass184_7475.recievedBuffer;

		for (int i_1 = 0; i_1 < client.npcListSize; i_1++) {
			int i_2 = client.NPC_INDICES[i_1];
			NPC npc_3 = (NPC) ((Class282_Sub47) client.NPCS.get((long) i_2)).anObject8068;
			int i_4 = rsbitsbuffer_0.readUnsignedByte();
			if ((i_4 & 0x40) != 0) {
				i_4 += rsbitsbuffer_0.readUnsignedByte() << 8;
			}

			if ((i_4 & 0x2000) != 0) {
				i_4 += rsbitsbuffer_0.readUnsignedByte() << 16;
			}

			if ((i_4 & 0x100000) != 0) {
				i_4 += rsbitsbuffer_0.readUnsignedByte() << 24;
			}

			int i_6;
			if ((i_4 & 0x10) != 0) {
				int[] ints_5 = new int[Class8_Sub3.method14339(195444347).length];

				for (i_6 = 0; i_6 < Class8_Sub3.method14339(1841907826).length; i_6++) {
					ints_5[i_6] = rsbitsbuffer_0.readBigSmart();
				}

				i_6 = rsbitsbuffer_0.readUnsignedByte();
				Class20.animate(npc_3, ints_5, i_6, true, (byte) 23);
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
				i_14 = npc_3.definitions.anIntArray4859.length;
				i_6 = 0;
				if (npc_3.definitions.aShortArray4892 != null) {
					i_6 = npc_3.definitions.aShortArray4892.length;
				}

				i_7 = 0;
				if (npc_3.definitions.aShortArray4867 != null) {
					i_7 = npc_3.definitions.aShortArray4867.length;
				}

				i_8 = rsbitsbuffer_0.readUnsigned128Byte();
				if ((i_8 & 0x1) == 1) {
					npc_3.aClass417_10581 = null;
				} else {
					ints_18 = null;
					if ((i_8 & 0x2) == 2) {
						ints_18 = new int[i_14];

						for (i_10 = 0; i_10 < i_14; i_10++) {
							ints_18[i_10] = rsbitsbuffer_0.readBigSmart();
						}
					}

					shorts_19 = null;
					if ((i_8 & 0x4) == 4) {
						shorts_19 = new short[i_6];

						for (i_11 = 0; i_11 < i_6; i_11++) {
							shorts_19[i_11] = (short) rsbitsbuffer_0.readUnsignedShort();
						}
					}

					shorts_20 = null;
					if ((i_8 & 0x8) == 8) {
						shorts_20 = new short[i_7];

						for (i_12 = 0; i_12 < i_7; i_12++) {
							shorts_20[i_12] = (short) rsbitsbuffer_0.readUnsignedShort();
						}
					}

					long_21 = (long) i_2 | (long) (++npc_3.anInt10583 - 1) << 32;
					npc_3.aClass417_10581 = new Class417(long_21, ints_18, shorts_19, shorts_20);
				}
			}

			if ((i_4 & 0x400) != 0) {
				npc_3.anInt10326 = rsbitsbuffer_0.read128Byte((short) -21275);
				npc_3.anInt10328 = rsbitsbuffer_0.readByte128(1918538585);
				npc_3.anInt10341 = rsbitsbuffer_0.readByteC(-1245142414);
				npc_3.anInt10343 = rsbitsbuffer_0.readByte128(1932630708);
				npc_3.anInt10342 = rsbitsbuffer_0.readShortLE((byte) -102) + client.cycles;
				npc_3.anInt10345 = rsbitsbuffer_0.readShortLE((byte) -65) + client.cycles;
				npc_3.anInt10346 = rsbitsbuffer_0.readShortLE128();
				npc_3.anInt10326 += npc_3.regionBaseX[0];
				npc_3.anInt10328 += npc_3.regionBaseY[0];
				npc_3.anInt10341 += npc_3.regionBaseX[0];
				npc_3.anInt10343 += npc_3.regionBaseY[0];
				npc_3.anInt10355 = 1;
				npc_3.anInt10367 = 0;
			}

			if ((i_4 & 0x1000) != 0) {
				npc_3.anInt10575 = rsbitsbuffer_0.readUnsignedShort();
				if (npc_3.anInt10575 == 65535) {
					npc_3.anInt10575 = -1;
				}
			}

			if ((i_4 & 0x200000) != 0) {
				i_14 = rsbitsbuffer_0.buffer[++rsbitsbuffer_0.index - 1] & 0xff;

				for (i_6 = 0; i_6 < i_14; i_6++) {
					i_7 = rsbitsbuffer_0.readShortLE128();
					i_8 = rsbitsbuffer_0.readIntV1();
					npc_3.aClass153_10579.method2614(i_7, i_8, (short) 768);
				}
			}

			int i_9;
			boolean bool_24;
			if ((i_4 & 0x1000000) != 0) {
				i_14 = rsbitsbuffer_0.readUnsignedShort128();
				i_6 = rsbitsbuffer_0.readIntV2(-309073722);
				if (i_14 == 65535) {
					i_14 = -1;
				}

				i_7 = rsbitsbuffer_0.readUnsignedByte128(-1454950076);
				i_8 = i_7 & 0x7;
				i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}

				bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc_3.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 3, -770849102);
			}

			if ((i_4 & 0x80) != 0) {
				npc_3.faceEntity = rsbitsbuffer_0.readShortLE((byte) -44);
				if (npc_3.faceEntity == 65535) {
					npc_3.faceEntity = -1;
				}
			}

			int[] ints_15;
			int[] ints_16;
			if ((i_4 & 0x8000) != 0) {
				i_14 = rsbitsbuffer_0.readUnsignedByteC(-172016026);
				ints_15 = new int[i_14];
				ints_16 = new int[i_14];
				int[] ints_17 = new int[i_14];

				for (i_9 = 0; i_9 < i_14; i_9++) {
					i_10 = rsbitsbuffer_0.readBigSmart();
					ints_15[i_9] = i_10;
					ints_16[i_9] = rsbitsbuffer_0.readUnsignedByte();
					ints_17[i_9] = rsbitsbuffer_0.readShortLE((byte) -27);
				}

				Class331.method5923(npc_3, ints_15, ints_16, ints_17, -125170497);
			}

			if ((i_4 & 0x800) != 0) {
				i_14 = rsbitsbuffer_0.readShortLE((byte) -78);
				i_6 = rsbitsbuffer_0.readInt();
				if (i_14 == 65535) {
					i_14 = -1;
				}

				i_7 = rsbitsbuffer_0.readUnsignedByte128(-967780898);
				i_8 = i_7 & 0x7;
				i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}

				bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc_3.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 1, 733349032);
			}

			if ((i_4 & 0x1) != 0) {
				i_14 = rsbitsbuffer_0.readUnsignedByte128(-1043197231);
				if (i_14 > 0) {
					for (i_6 = 0; i_6 < i_14; i_6++) {
						i_7 = -1;
						boolean bool_23 = true;
						i_9 = -1;
						i_10 = rsbitsbuffer_0.readUnsignedSmart(1828814034);
						if (i_10 == 32767) {
							i_10 = rsbitsbuffer_0.readUnsignedSmart(1784037348);
							i_8 = rsbitsbuffer_0.readUnsignedSmart(1685424814);
							i_7 = rsbitsbuffer_0.readUnsignedSmart(1522141109);
							i_9 = rsbitsbuffer_0.readUnsignedSmart(1916421564);
						} else if (i_10 != 32766) {
							i_8 = rsbitsbuffer_0.readUnsignedSmart(2083838398);
						} else {
							i_10 = -1;
							i_8 = rsbitsbuffer_0.readUnsignedByte();
						}

						i_11 = rsbitsbuffer_0.readUnsignedSmart(1905070758);
						npc_3.applyHit(i_10, i_8, i_7, i_9, client.cycles, i_11, 1810678734);
					}
				}

				i_6 = rsbitsbuffer_0.readUnsignedByte128(-625812613);
				if (i_6 > 0) {
					for (i_7 = 0; i_7 < i_6; i_7++) {
						i_8 = rsbitsbuffer_0.readUnsignedSmart(2098648600);
						i_9 = rsbitsbuffer_0.readUnsignedSmart(2076092492);
						if (i_9 != 32767) {
							i_10 = rsbitsbuffer_0.readUnsignedSmart(1675414519);
							i_11 = rsbitsbuffer_0.readUnsigned128Byte();
							i_12 = i_9 > 0 ? rsbitsbuffer_0.readUnsignedByte128(-1240191837) : i_11;
							npc_3.displayHitbar(i_8, client.cycles, i_9, i_10, i_11, i_12, (byte) 0);
						} else {
							npc_3.method15857(i_8, 1885735347);
						}
					}
				}
			}

			if ((i_4 & 0x8) != 0) {
				if (npc_3.definitions.method6886(-1543379642)) {
					Class169.method2876(npc_3, 1280406765);
				}

				npc_3.method16166(IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(rsbitsbuffer_0.readBigSmart(), (byte) 45), 332217631);
				npc_3.method15836(npc_3.definitions.anInt4858, (byte) -91);
				npc_3.anInt10340 = npc_3.definitions.anInt4889 << 3;
				if (npc_3.definitions.method6886(-1928423029)) {
					Class397.method6775(npc_3.plane, npc_3.regionBaseX[0], npc_3.regionBaseY[0], 0, (ObjectDefinitions) null, npc_3, (Player) null, 352984427);
				}
			}

			if ((i_4 & 0x2000000) != 0) {
				i_14 = rsbitsbuffer_0.readShortLE((byte) -78);
				i_6 = rsbitsbuffer_0.readIntLE();
				if (i_14 == 65535) {
					i_14 = -1;
				}

				i_7 = rsbitsbuffer_0.readUnsignedByte();
				i_8 = i_7 & 0x7;
				i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}

				bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc_3.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 2, -195417019);
			}

			if ((i_4 & 0x80000) != 0) {
				i_14 = rsbitsbuffer_0.buffer[++rsbitsbuffer_0.index - 1] & 0xff;

				for (i_6 = 0; i_6 < i_14; i_6++) {
					i_7 = rsbitsbuffer_0.readUnsignedByte128(-890813741);
					i_8 = rsbitsbuffer_0.readInt();
					i_9 = rsbitsbuffer_0.method13132(-458827259);
					npc_3.method16179(i_7, i_8, i_9, (byte) -110);
				}
			}

			if ((i_4 & 0x40000) != 0) {
				i_14 = npc_3.definitions.anIntArray4860.length;
				i_6 = 0;
				if (npc_3.definitions.aShortArray4892 != null) {
					i_6 = npc_3.definitions.aShortArray4892.length;
				}

				byte b_25 = 0;
				if (npc_3.definitions.aShortArray4867 != null) {
					i_6 = npc_3.definitions.aShortArray4867.length;
				}

				i_8 = rsbitsbuffer_0.readUnsignedByte128(-1866772562);
				if ((i_8 & 0x1) != 1) {
					ints_18 = null;
					if ((i_8 & 0x2) == 2) {
						ints_18 = new int[i_14];

						for (i_10 = 0; i_10 < i_14; i_10++) {
							ints_18[i_10] = rsbitsbuffer_0.readBigSmart();
						}
					}

					shorts_19 = null;
					if ((i_8 & 0x4) == 4) {
						shorts_19 = new short[i_6];

						for (i_11 = 0; i_11 < i_6; i_11++) {
							shorts_19[i_11] = (short) rsbitsbuffer_0.readUnsignedShort();
						}
					}

					shorts_20 = null;
					if ((i_8 & 0x8) == 8) {
						shorts_20 = new short[b_25];

						for (i_12 = 0; i_12 < b_25; i_12++) {
							shorts_20[i_12] = (short) rsbitsbuffer_0.readShortLE128();
						}
					}

					long_21 = (long) i_2 | (long) (++npc_3.anInt10576 - 1) << 32;
					new Class417(long_21, ints_18, shorts_19, shorts_20);
				}
			}

			if ((i_4 & 0x10000) != 0) {
				npc_3.anInt10582 = rsbitsbuffer_0.readUnsignedShort128();
				if (npc_3.anInt10582 == 65535) {
					npc_3.anInt10582 = npc_3.definitions.anInt4879;
				}
			}

			if ((i_4 & 0x400000) != 0) {
				npc_3.aClass153_10579.method2607((byte) -33);
				i_14 = rsbitsbuffer_0.buffer[++rsbitsbuffer_0.index - 1] & 0xff;

				for (i_6 = 0; i_6 < i_14; i_6++) {
					i_7 = rsbitsbuffer_0.readUnsignedShort();
					i_8 = rsbitsbuffer_0.readIntV1();
					npc_3.aClass153_10579.method2614(i_7, i_8, (short) 768);
				}
			}

			if ((i_4 & 0x4) != 0) {
				npc_3.anInt10578 = rsbitsbuffer_0.readShortLE128();
				npc_3.anInt10577 = rsbitsbuffer_0.readShortLE((byte) -32);
			}

			if ((i_4 & 0x20000) != 0) {
				npc_3.aByte10371 = rsbitsbuffer_0.read128Byte((short) 2463);
				npc_3.aByte10327 = rsbitsbuffer_0.readByte();
				npc_3.aByte10364 = rsbitsbuffer_0.readByte();
				npc_3.aByte10352 = (byte) rsbitsbuffer_0.readUnsigned128Byte();
				npc_3.anInt10347 = client.cycles + rsbitsbuffer_0.readShortLE((byte) -97);
				npc_3.anInt10348 = client.cycles + rsbitsbuffer_0.readUnsignedShort();
			}

			if ((i_4 & 0x800000) != 0) {
				npc_3.aString10584 = rsbitsbuffer_0.readString();
				if ("".equals(npc_3.aString10584) || npc_3.aString10584.equals(npc_3.definitions.aString4857)) {
					npc_3.aString10584 = npc_3.definitions.aString4857;
				}
			}

			if ((i_4 & 0x2) != 0) {
				npc_3.method16164(rsbitsbuffer_0.readString(), 0, 0, (byte) -84);
			}

			if ((i_4 & 0x4000) != 0) {
				i_14 = rsbitsbuffer_0.readUnsigned128Byte();
				ints_15 = new int[i_14];
				ints_16 = new int[i_14];

				for (i_8 = 0; i_8 < i_14; i_8++) {
					i_9 = rsbitsbuffer_0.readShortLE128();
					if ((i_9 & 0xc000) == 49152) {
						i_10 = rsbitsbuffer_0.readUnsignedShort();
						ints_15[i_8] = i_9 << 16 | i_10;
					} else {
						ints_15[i_8] = i_9;
					}

					ints_16[i_8] = rsbitsbuffer_0.readShortLE128();
				}

				npc_3.method15797(ints_15, ints_16, -1858199952);
			}

			if ((i_4 & 0x20) != 0) {
				i_14 = rsbitsbuffer_0.readUnsignedShort();
				i_6 = rsbitsbuffer_0.readIntV2(-1710167524);
				if (i_14 == 65535) {
					i_14 = -1;
				}

				i_7 = rsbitsbuffer_0.readUnsignedByteC(-1949571815);
				i_8 = i_7 & 0x7;
				i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}

				bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc_3.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 0, 1997289787);
			}
		}

	}

	static boolean method539(int i_0, int i_1) {
		return i_0 == 57 || i_0 == 58 || i_0 == 1007 || i_0 == 25 || i_0 == 30;
	}

}
