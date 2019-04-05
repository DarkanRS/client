final class Class512 implements Runnable {

	public void run() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_7964.run();
		} catch (Throwable throwable_2) {
			;
		}
		IcmpService_Sub1.anIcmpService_Sub1_7964 = null;
	}

	public static short[] method8761(short[] shorts_0, int i_1) {
		if (shorts_0 == null) {
			return null;
		} else {
			short[] shorts_2 = new short[shorts_0.length];
			System.arraycopy(shorts_0, 0, shorts_2, 0, shorts_0.length);
			return shorts_2;
		}
	}

	public static final void method8762(Player player_0, int i_1, int i_2, byte b_3) {
		int i_5 = player_0.regionBaseX[0];
		int i_6 = player_0.regionBaseY[0];
		if (i_5 >= 0 && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_6 >= 0 && i_6 < IndexLoaders.MAP_REGION_DECODER.getSizeY() && i_1 >= 0 && i_1 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_2 >= 0 && i_2 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
			int i_7 = Class112.findRoute(i_5, i_6, player_0.getSize(), SunDefinitions.method853(i_1, i_2, 1356660525), IndexLoaders.MAP_REGION_DECODER.getClipMap(player_0.plane), true, client.walkStepsX, client.walkStepsY, -1498716878);
			if (i_7 >= 1 && i_7 <= 3) {
				for (int i_8 = 0; i_8 < i_7 - 1; i_8++) {
					player_0.method16132(client.walkStepsX[i_8], client.walkStepsY[i_8], b_3);
				}
			}
		}
	}
}
