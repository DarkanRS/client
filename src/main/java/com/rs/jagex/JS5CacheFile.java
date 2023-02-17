package com.rs.jagex;

import java.io.EOFException;
import java.io.IOException;

public class JS5CacheFile {

	static long aLong2577;

	static byte[] aByteArray2576 = new byte[520];

	public static RouteStrategy createWallObjectStrategy(int i_0, int i_1, int i_2, int i_3, ObjectType sceneobjecttype_4, int i_5) {
		RouteStrategies.WALL_OBJECT.approxDestinationX = i_0;
		RouteStrategies.WALL_OBJECT.approxDestinationY = i_1;
		RouteStrategies.WALL_OBJECT.approxDestinationSizeX = i_2;
		RouteStrategies.WALL_OBJECT.approxDestinationSizeY = i_3;
		RouteStrategies.WALL_OBJECT.objectType = sceneobjecttype_4;
		RouteStrategies.WALL_OBJECT.accessFlags = i_5;
		return RouteStrategies.WALL_OBJECT;
	}

	public static void method3359() {
		if (!Class190.aBool2383) {
			Class435.method7301(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aClass293ArrayArrayArray2610);
			if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().waterRelatedClassArray1 != null)
				Class435.method7301(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().waterRelatedClassArray1);
			Class190.aBool2383 = true;
		}
	}

	public static boolean method3360() {
		return Login.getLoginStage() != LoginStage.NONE_2;
	}

	public static void record(MouseRecord record) {
		if (!GameState.loggedIn(client.GAME_STATE))
			record.cache();
		else
			Class236.MOUSE_MOVEMENT_WINDOW.addRecord(record);
	}

	UID192 aClass440_2573;

	UID192 aClass440_2574;

	int anInt2572 = 65000;

	int anInt2575;

	public JS5CacheFile(int i_1, UID192 class440_2, UID192 class440_3) {
		anInt2575 = i_1;
		aClass440_2573 = class440_2;
		aClass440_2574 = class440_3;
		anInt2572 = 1500000;
	}

	public boolean method3348(int i_1, byte[] bytes_2, int i_3) {
		UID192 class440_5 = aClass440_2573;
		synchronized (aClass440_2573) {
			if ((i_3 < 0) || (i_3 > anInt2572))
				throw new IllegalArgumentException();
			boolean bool_6 = method3349(i_1, bytes_2, i_3, true);
			if (!bool_6)
				bool_6 = method3349(i_1, bytes_2, i_3, false);
			return bool_6;
		}
	}

	boolean method3349(int i_1, byte[] bytes_2, int i_3, boolean bool_4) {
		boolean bool_41 = bool_4;
		UID192 class440_6 = aClass440_2573;
		synchronized (aClass440_2573) {
			boolean bool_9;
			try {
				int i_8;
				boolean bool_10000;
				if (bool_41) {
					if (aClass440_2574.method7345() < (i_1 * 6 + 6)) {
						bool_9 = false;
						bool_10000 = bool_9;
						return bool_10000;
					}
					aClass440_2574.method7347(i_1 * 6);
					aClass440_2574.method7350(aByteArray2576, 0, 6);
					i_8 = (aByteArray2576[5] & 0xff) + ((aByteArray2576[3] & 0xff) << 16) + ((aByteArray2576[4] & 0xff) << 8);
					if (i_8 <= 0 || i_8 > aClass440_2573.method7345() / 520L) {
						bool_9 = false;
						bool_10000 = bool_9;
						return bool_10000;
					}
				} else {
					i_8 = (int) ((aClass440_2573.method7345() + 519L) / 520L);
					if (i_8 == 0)
						i_8 = 1;
				}
				aByteArray2576[0] = (byte) (i_3 >> 16);
				aByteArray2576[1] = (byte) (i_3 >> 8);
				aByteArray2576[2] = (byte) i_3;
				aByteArray2576[3] = (byte) (i_8 >> 16);
				aByteArray2576[4] = (byte) (i_8 >> 8);
				aByteArray2576[5] = (byte) i_8;
				aClass440_2574.method7347(i_1 * 6);
				aClass440_2574.write(aByteArray2576, 0, 6);
				int i_22 = 0;
				int i_10 = 0;
				while (true) {
					if (i_22 < i_3)
						label150:
						{
						int i_11 = 0;
						int i_12;
						if (bool_41) {
							aClass440_2573.method7347(i_8 * 520);
							int i_13;
							int i_14;
							if (i_1 > 65535) {
								try {
									aClass440_2573.method7350(aByteArray2576, 0, 10);
								} catch (EOFException eofexception_19) {
									break label150;
								}
								i_12 = ((aByteArray2576[1] & 0xff) << 16) + ((aByteArray2576[0] & 0xff) << 24) + (aByteArray2576[3] & 0xff) + ((aByteArray2576[2] & 0xff) << 8);
								i_13 = (aByteArray2576[5] & 0xff) + ((aByteArray2576[4] & 0xff) << 8);
								i_11 = (aByteArray2576[8] & 0xff) + ((aByteArray2576[7] & 0xff) << 8) + ((aByteArray2576[6] & 0xff) << 16);
								i_14 = aByteArray2576[9] & 0xff;
							} else {
								try {
									aClass440_2573.method7350(aByteArray2576, 0, 8);
								} catch (EOFException eofexception_18) {
									break label150;
								}
								i_12 = (aByteArray2576[1] & 0xff) + ((aByteArray2576[0] & 0xff) << 8);
								i_13 = (aByteArray2576[3] & 0xff) + ((aByteArray2576[2] & 0xff) << 8);
								i_11 = ((aByteArray2576[5] & 0xff) << 8) + ((aByteArray2576[4] & 0xff) << 16) + (aByteArray2576[6] & 0xff);
								i_14 = aByteArray2576[7] & 0xff;
							}
							boolean bool_16;
							if (i_12 != i_1 || i_13 != i_10 || i_14 != anInt2575) {
								bool_16 = false;
								bool_10000 = bool_16;
								return bool_10000;
							}
							if (i_11 < 0 || i_11 > aClass440_2573.method7345() / 520L) {
								bool_16 = false;
								bool_10000 = bool_16;
								return bool_10000;
							}
						}
						if (i_11 == 0) {
							bool_41 = false;
							i_11 = (int) ((aClass440_2573.method7345() + 519L) / 520L);
							if (i_11 == 0)
								++i_11;
							if (i_8 == i_11)
								++i_11;
						}
						if (i_3 - i_22 <= 512)
							i_11 = 0;
						if (i_1 > 65535) {
							aByteArray2576[0] = (byte) (i_1 >> 24);
							aByteArray2576[1] = (byte) (i_1 >> 16);
							aByteArray2576[2] = (byte) (i_1 >> 8);
							aByteArray2576[3] = (byte) i_1;
							aByteArray2576[4] = (byte) (i_10 >> 8);
							aByteArray2576[5] = (byte) i_10;
							aByteArray2576[6] = (byte) (i_11 >> 16);
							aByteArray2576[7] = (byte) (i_11 >> 8);
							aByteArray2576[8] = (byte) i_11;
							aByteArray2576[9] = (byte) anInt2575;
							aClass440_2573.method7347(i_8 * 520);
							aClass440_2573.write(aByteArray2576, 0, 10);
							i_12 = i_3 - i_22;
							if (i_12 > 510)
								i_12 = 510;
						} else {
							aByteArray2576[0] = (byte) (i_1 >> 8);
							aByteArray2576[1] = (byte) i_1;
							aByteArray2576[2] = (byte) (i_10 >> 8);
							aByteArray2576[3] = (byte) i_10;
							aByteArray2576[4] = (byte) (i_11 >> 16);
							aByteArray2576[5] = (byte) (i_11 >> 8);
							aByteArray2576[6] = (byte) i_11;
							aByteArray2576[7] = (byte) anInt2575;
							aClass440_2573.method7347(i_8 * 520);
							aClass440_2573.write(aByteArray2576, 0, 8);
							i_12 = i_3 - i_22;
							if (i_12 > 512)
								i_12 = 512;
						}
						aClass440_2573.write(bytes_2, i_22, i_12);
						i_22 += i_12;
						i_8 = i_11;
						++i_10;
						continue;
						}
					boolean bool_7 = true;
					return bool_7;
				}
			} catch (IOException ioexception_20) {
				bool_9 = false;
				return bool_9;
			}
		}
	}

	public byte[] method3350(int i_1) {
		UID192 class440_3 = aClass440_2573;
		synchronized (aClass440_2573) {
			Object obj_10000;
			try {
				if (aClass440_2574.method7345() < (i_1 * 6 + 6)) {
					Object obj_5 = null;
					obj_10000 = obj_5;
					return (byte[]) obj_10000;
				}
				aClass440_2574.method7347(i_1 * 6);
				aClass440_2574.method7350(aByteArray2576, 0, 6);
				int i_18 = ((aByteArray2576[0] & 0xff) << 16) + (aByteArray2576[2] & 0xff) + ((aByteArray2576[1] & 0xff) << 8);
				int i_6 = (aByteArray2576[5] & 0xff) + ((aByteArray2576[3] & 0xff) << 16) + ((aByteArray2576[4] & 0xff) << 8);
				Object obj_7;
				if (i_18 < 0 || i_18 > anInt2572) {
					obj_7 = null;
					obj_10000 = obj_7;
					return (byte[]) obj_10000;
				}
				if (i_6 > 0 && i_6 <= aClass440_2573.method7345() / 520L) {
					byte[] bytes_24 = new byte[i_18];
					int i_8 = 0;
					int i_9 = 0;
					while (i_8 < i_18) {
						if (i_6 == 0) {
							Object obj_10 = null;
							obj_10000 = obj_10;
							return (byte[]) obj_10000;
						}
						aClass440_2573.method7347(i_6 * 520);
						int i_19 = i_18 - i_8;
						byte b_11;
						int i_12;
						int i_13;
						int i_14;
						int i_15;
						if (i_1 > 65535) {
							if (i_19 > 510)
								i_19 = 510;
							b_11 = 10;
							aClass440_2573.method7350(aByteArray2576, 0, b_11 + i_19);
							i_12 = ((aByteArray2576[1] & 0xff) << 16) + ((aByteArray2576[0] & 0xff) << 24) + (aByteArray2576[3] & 0xff) + ((aByteArray2576[2] & 0xff) << 8);
							i_13 = (aByteArray2576[5] & 0xff) + ((aByteArray2576[4] & 0xff) << 8);
							i_14 = (aByteArray2576[8] & 0xff) + ((aByteArray2576[7] & 0xff) << 8) + ((aByteArray2576[6] & 0xff) << 16);
							i_15 = aByteArray2576[9] & 0xff;
						} else {
							if (i_19 > 512)
								i_19 = 512;
							b_11 = 8;
							aClass440_2573.method7350(aByteArray2576, 0, b_11 + i_19);
							i_12 = (aByteArray2576[1] & 0xff) + ((aByteArray2576[0] & 0xff) << 8);
							i_13 = (aByteArray2576[3] & 0xff) + ((aByteArray2576[2] & 0xff) << 8);
							i_14 = ((aByteArray2576[5] & 0xff) << 8) + ((aByteArray2576[4] & 0xff) << 16) + (aByteArray2576[6] & 0xff);
							i_15 = aByteArray2576[7] & 0xff;
						}
						Object obj_16;
						if (i_12 == i_1 && i_13 == i_9 && i_15 == anInt2575) {
							if (i_14 >= 0 && i_14 <= aClass440_2573.method7345() / 520L) {
								int i_20 = i_19 + b_11;
								for (int i_17 = b_11; i_17 < i_20; i_17++)
									bytes_24[i_8++] = aByteArray2576[i_17];
								i_6 = i_14;
								++i_9;
								continue;
							}
						}
						obj_16 = null;
						obj_10000 = obj_16;
						return (byte[]) obj_10000;
					}
					byte[] bytes_4 = bytes_24;
					return bytes_4;
				}
				obj_7 = null;
				obj_10000 = obj_7;
			} catch (IOException ioexception_22) {
				Object obj_21 = null;
				return (byte[]) obj_21;
			}
			return (byte[]) obj_10000;
		}
	}

	@Override
	public String toString() {
		return "" + anInt2575;
	}
}
