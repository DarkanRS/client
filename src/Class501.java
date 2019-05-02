import java.util.HashMap;

public class Class501 {

	static int anInt5828;

	static {
		new HashMap();
	}

	Class501() throws Throwable {
		throw new Error();
	}

	static void method8350() {
		Class9.aClass184_73.method3054((short) 1653);
		Class9.aClass184_73.recievedBuffer.index = 0;
		Class9.aClass184_73.currentPacket = null;
		Class9.aClass184_73.lastPacket = null;
		Class9.aClass184_73.secondLastPacket = null;
		Class9.aClass184_73.thirdLastPacket = null;
		Class9.aClass184_73.currentPacketSize = 0;
		Class9.aClass184_73.idleReadPulses = 0;
		client.anInt7178 = 0;
		Class350.method6189((byte) 111);
		Class256.method4416();

		int i_1;
		for (i_1 = 0; i_1 < 2048; i_1++) {
			client.players[i_1] = null;
		}

		VertexNormal.MY_PLAYER = null;

		for (i_1 = 0; i_1 < client.anInt7210; i_1++) {
			Animable animable_2 = (Animable) client.aNode_Sub47Array7209[i_1].anObject8068;
			if (animable_2 != null) {
				animable_2.faceEntity = -1;
			}
		}

		FontRenderer_Sub2.method14262(882795829);
		NativeLibraryLoader.anInt3240 = 2;
		Class86.anInt833 = -1;
		PingRequester.anInt5864 = -1;
		Class365.setGameState(13);

		for (i_1 = 0; i_1 < 107; i_1++) {
			client.aBoolArray7443[i_1] = true;
		}

		Class388.method6692(1016678349);
		PingRequest.CURRENT_REQUEST = null;
		Class28.aLong351 = 0L;
		FontMetrics.method6989();
	}

}
