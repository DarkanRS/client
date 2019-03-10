public final class Class510 {

	public volatile int anInt5872 = -1;

	volatile String aString5871;

	Class510(String string_1) {
		this.aString5871 = string_1;
	}

	static final void method8744(byte b_0, int i_1) {
		byte[][][] bytes_2 = IndexLoaders.MAP_REGION_DECODER.method4532(1227540505);
		if (bytes_2 == null) {
			bytes_2 = new byte[4][IndexLoaders.MAP_REGION_DECODER.getSizeX(1852995764)][IndexLoaders.MAP_REGION_DECODER.getSizeY(-533095676)];
			IndexLoaders.MAP_REGION_DECODER.method4440(bytes_2, (byte) 2);
		}
		for (int i_3 = 0; i_3 < 4; i_3++) {
			for (int i_4 = 0; i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeX(713986087); i_4++) {
				for (int i_5 = 0; i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY(-748380927); i_5++) {
					bytes_2[i_3][i_4][i_5] = b_0;
				}
			}
		}
	}
}
