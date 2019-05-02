import java.io.IOException;

public class RouteStrategy_Sub1 extends RouteStrategy {

	public boolean canExit(int i_1, int i_2, int i_3, ClipMap clipmap_4, byte b_5) {
		return i_2 == this.approxDestinationX && i_3 == this.approxDestinationY;
	}

	public boolean method3786(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
		return i_2 == -1440558477 * this.approxDestinationX * -726719813 && i_3 == 1732585867 * this.approxDestinationY * 1767388707;
	}

	public boolean method3785(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
		return i_2 == -1440558477 * this.approxDestinationX * -726719813 && i_3 == 1732585867 * this.approxDestinationY * 1767388707;
	}

	public boolean method3788(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
		return i_2 == -1440558477 * this.approxDestinationX * -726719813 && i_3 == 1732585867 * this.approxDestinationY * 1767388707;
	}

	public boolean method3789(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
		return i_2 == -1440558477 * this.approxDestinationX * -726719813 && i_3 == 1732585867 * this.approxDestinationY * 1767388707;
	}

	static GamePreferences method12791() {
		Class442 class442_1 = null;
		GamePreferences class282_sub54_2 = new GamePreferences(client.CURRENT_GAME);

		try {
			class442_1 = Class345.method6137("", client.CURRENT_GAME.name, false);
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

	static CS2Script getScript(Class397 class397_0, int i_1, int i_2) {
		int i_4 = class397_0.anInt4802 | i_1 << 10;
		CS2Script cs2script_5 = (CS2Script) Class506.aClass223_5857.method3758((long) i_4 << 16);
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

					cs2script_5.aClass397_9527 = class397_0;
					Class506.aClass223_5857.method3759(cs2script_5, (long) i_4 << 16);
					return cs2script_5;
				}
			} else {
				i_4 = class397_0.anInt4802 | i_2 + 65536 << 10;
				cs2script_5 = (CS2Script) Class506.aClass223_5857.method3758((long) i_4 << 16);
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

							cs2script_5.aClass397_9527 = class397_0;
							Class506.aClass223_5857.method3759(cs2script_5, (long) i_4 << 16);
							return cs2script_5;
						}
					} else {
						i_4 = class397_0.anInt4802 | 0x3fffc00;
						cs2script_5 = (CS2Script) Class506.aClass223_5857.method3758((long) i_4 << 16);
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

									cs2script_5.aClass397_9527 = class397_0;
									Class506.aClass223_5857.method3759(cs2script_5, (long) i_4 << 16);
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
