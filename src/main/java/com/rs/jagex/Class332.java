package com.rs.jagex;

public class Class332 {

	public static Class332 aClass332_3875 = new Class332(1);
	static Class332 aClass332_3874 = new Class332(0);
	static void method5927() {
		HintArrow.aClass229_2245.method3858(5);
	}

	public static Class350 method5928(ByteBuf rsbytebuffer_0) {
		Class350_Sub3 class350_sub3_2 = (Class350_Sub3) Class163.method2843(rsbytebuffer_0);
		int i_3 = rsbytebuffer_0.readShort();
		return new Class350_Sub3_Sub1(class350_sub3_2.aClass356_4094, class350_sub3_2.aClass353_4087, class350_sub3_2.anInt4090, class350_sub3_2.anInt4089, class350_sub3_2.anInt4093, class350_sub3_2.anInt4088, class350_sub3_2.anInt4092, class350_sub3_2.anInt4086, class350_sub3_2.anInt4091, class350_sub3_2.anInt7844, class350_sub3_2.anInt7840, class350_sub3_2.anInt7842, class350_sub3_2.anInt7843, class350_sub3_2.anInt7841, class350_sub3_2.anInt7845, i_3);
	}

	static void method5929() {
		Class148.anInt1730 = 0;
		Node_Sub44_Sub3.aNode_Sub7_9563 = null;
		Class454.aClass250_5450 = null;
		CutsceneEntity.aClass317_746 = null;
		Node_Sub33.aNode_Sub15_Sub2_7836 = null;
	}

	public static void preloadSong(int songId) {
		TCPPacket tcpmessage_2 = TCPPacket.createPacket(ClientProt.SONG_LOADED, client.GAME_CONNECTION_CONTEXT.outKeys);
		tcpmessage_2.buffer.writeInt(-1);
		client.GAME_CONNECTION_CONTEXT.queuePacket(tcpmessage_2);
		Class260.aClass116_3229 = new SongReference(IndexLoaders.MUSIC_INDEX, songId);
	}

	int anInt3876;

	Class332(int i_1) {
		anInt3876 = i_1;
	}

}
