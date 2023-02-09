package com.rs.jagex;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public abstract class Node_Sub41 extends Node {

	public static boolean method13367(int i_0) {
		return i_0 != 1 && i_0 != 7;
	}
	int anInt8031;

	OggStreamState anOggStreamState8032;

	Node_Sub41(OggStreamState oggstreamstate_1) {
		anOggStreamState8032 = oggstreamstate_1;
	}

	abstract void method13360();

	void method13361(OggPacket oggpacket_1) {
		method13362(oggpacket_1);
		++anInt8031;
	}

	abstract void method13362(OggPacket var1);

	abstract void method13363(OggPacket var1);

	abstract void method13364();

	abstract void method13365();

	abstract void method13366(OggPacket var1);

}
