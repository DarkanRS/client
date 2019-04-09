public final class PingRequest {

	public volatile int ping = -1;

	volatile String ip;

	static PingRequest CURRENT_REQUEST;

	PingRequest(String string_1) {
		this.ip = string_1;
	}

	static final void method8744(byte b_0, int i_1) {
		byte[][][] bytes_2 = IndexLoaders.MAP_REGION_DECODER.method4532();
		if (bytes_2 == null) {
			bytes_2 = new byte[4][IndexLoaders.MAP_REGION_DECODER.getSizeX()][IndexLoaders.MAP_REGION_DECODER.getSizeY()];
			IndexLoaders.MAP_REGION_DECODER.method4440(bytes_2);
		}
		for (int i_3 = 0; i_3 < 4; i_3++) {
			for (int i_4 = 0; i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeX(); i_4++) {
				for (int i_5 = 0; i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY(); i_5++) {
					bytes_2[i_3][i_4][i_5] = b_0;
				}
			}
		}
	}
}
