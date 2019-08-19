import java.io.IOException;

public class FixedTileStrategy extends RouteStrategy {

	public boolean canExit(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
		return i_2 == this.approxDestinationX && i_3 == this.approxDestinationY;
	}

	static GamePreferences method12791() {
		Class442 class442_1 = null;
		GamePreferences class282_sub54_2 = new GamePreferences(client.CURRENT_GAME);

		try {
			class442_1 = ParticleArchive1Def.method6137("", client.CURRENT_GAME.name, false);
			byte[] bytes_3 = new byte[(int) class442_1.method7388()];

			int i_4;
			for (int i_5 = 0; i_5 < bytes_3.length; i_5 += i_4) {
				i_4 = class442_1.method7389(bytes_3, i_5, bytes_3.length - i_5, (byte) -21);
				if (i_4 == -1) {
					throw new IOException();
				}
			}

			class282_sub54_2 = new GamePreferences(new RsByteBuffer(bytes_3), client.CURRENT_GAME);
		} catch (Exception exception_7) {
			;
		}

		try {
			if (class442_1 != null) {
				class442_1.method7385((short) 15234);
			}
		} catch (Exception exception_6) {
			;
		}

		return class282_sub54_2;
	}

	static CS2Script getScript(CS2HookEventType event, int scriptId, int i_2) {
		int i_4 = event.id | scriptId << 10;
		CS2Script cs2script_5 = (CS2Script) Class506.CS2_CACHE.get((long) i_4 << 16);
		if (cs2script_5 != null) {
			return cs2script_5;
		} else {
			byte[] bytes_6 = IndexLoaders.CS2_SCRIPTS_INDEX.getFile(IndexLoaders.CS2_SCRIPTS_INDEX.method5623(i_4));
			if (bytes_6 != null) {
				if (bytes_6.length <= 1) {
					return null;
				} else {
					try {
						cs2script_5 = GraphicalRenderer.method8699(bytes_6, 887206826);
					} catch (Exception exception_8) {
						throw new RuntimeException(exception_8.getMessage() + " " + i_4);
					}

					cs2script_5.aClass397_9527 = event;
					Class506.CS2_CACHE.put(cs2script_5, (long) i_4 << 16);
					return cs2script_5;
				}
			} else {
				i_4 = event.id | i_2 + 65536 << 10;
				cs2script_5 = (CS2Script) Class506.CS2_CACHE.get((long) i_4 << 16);
				if (cs2script_5 != null) {
					return cs2script_5;
				} else {
					bytes_6 = IndexLoaders.CS2_SCRIPTS_INDEX.getFile(IndexLoaders.CS2_SCRIPTS_INDEX.method5623(i_4));
					if (bytes_6 != null) {
						if (bytes_6.length <= 1) {
							return null;
						} else {
							try {
								cs2script_5 = GraphicalRenderer.method8699(bytes_6, 163170026);
							} catch (Exception exception_9) {
								throw new RuntimeException(exception_9.getMessage() + " " + i_4);
							}

							cs2script_5.aClass397_9527 = event;
							Class506.CS2_CACHE.put(cs2script_5, (long) i_4 << 16);
							return cs2script_5;
						}
					} else {
						i_4 = event.id | 0x3fffc00;
						cs2script_5 = (CS2Script) Class506.CS2_CACHE.get((long) i_4 << 16);
						if (cs2script_5 != null) {
							return cs2script_5;
						} else {
							bytes_6 = IndexLoaders.CS2_SCRIPTS_INDEX.getFile(IndexLoaders.CS2_SCRIPTS_INDEX.method5623(i_4));
							if (bytes_6 != null) {
								if (bytes_6.length <= 1) {
									return null;
								} else {
									try {
										cs2script_5 = GraphicalRenderer.method8699(bytes_6, -517791588);
									} catch (Exception exception_10) {
										throw new RuntimeException(exception_10.getMessage() + " " + i_4);
									}

									cs2script_5.aClass397_9527 = event;
									Class506.CS2_CACHE.put(cs2script_5, (long) i_4 << 16);
									return cs2script_5;
								}
							} else {
								return null;
							}
						}
					}
				}
			}
		}
	}

}
