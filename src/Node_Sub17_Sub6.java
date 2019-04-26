public class Node_Sub17_Sub6 extends Node_Sub17 {

	boolean aBool10016;
	byte aByte10015;
	byte aByte10014;
	byte aByte10017;
	byte aByte10018;
	Class348 this$0;

	void method12253(RsByteBuffer rsbytebuffer_1) {
		this.aBool10016 = rsbytebuffer_1.readUnsignedByte() == 1;
		this.aByte10015 = rsbytebuffer_1.readByte();
		this.aByte10014 = rsbytebuffer_1.readByte();
		this.aByte10017 = rsbytebuffer_1.readByte();
		this.aByte10018 = rsbytebuffer_1.readByte();
	}

	void method12252(ClanSettings class61_1) {
		class61_1.allowGuests = this.aBool10016;
		class61_1.talkRank = this.aByte10015;
		class61_1.kickRank = this.aByte10014;
		class61_1.lootshareRank = this.aByte10017;
		class61_1.aByte628 = this.aByte10018;
	}

	void method12251(ClanSettings class61_1) {
		class61_1.allowGuests = this.aBool10016;
		class61_1.talkRank = this.aByte10015;
		class61_1.kickRank = this.aByte10014;
		class61_1.lootshareRank = this.aByte10017;
		class61_1.aByte628 = this.aByte10018;
	}

	void method12249(RsByteBuffer rsbytebuffer_1) {
		this.aBool10016 = rsbytebuffer_1.readUnsignedByte() == 1;
		this.aByte10015 = rsbytebuffer_1.readByte();
		this.aByte10014 = rsbytebuffer_1.readByte();
		this.aByte10017 = rsbytebuffer_1.readByte();
		this.aByte10018 = rsbytebuffer_1.readByte();
	}

	void method12257(RsByteBuffer rsbytebuffer_1) {
		this.aBool10016 = rsbytebuffer_1.readUnsignedByte() == 1;
		this.aByte10015 = rsbytebuffer_1.readByte();
		this.aByte10014 = rsbytebuffer_1.readByte();
		this.aByte10017 = rsbytebuffer_1.readByte();
		this.aByte10018 = rsbytebuffer_1.readByte();
	}

	void method12250(RsByteBuffer rsbytebuffer_1) {
		this.aBool10016 = rsbytebuffer_1.readUnsignedByte() == 1;
		this.aByte10015 = rsbytebuffer_1.readByte();
		this.aByte10014 = rsbytebuffer_1.readByte();
		this.aByte10017 = rsbytebuffer_1.readByte();
		this.aByte10018 = rsbytebuffer_1.readByte();
	}

	void method12256(ClanSettings class61_1) {
		class61_1.allowGuests = this.aBool10016;
		class61_1.talkRank = this.aByte10015;
		class61_1.kickRank = this.aByte10014;
		class61_1.lootshareRank = this.aByte10017;
		class61_1.aByte628 = this.aByte10018;
	}

	void method12258(ClanSettings class61_1) {
		class61_1.allowGuests = this.aBool10016;
		class61_1.talkRank = this.aByte10015;
		class61_1.kickRank = this.aByte10014;
		class61_1.lootshareRank = this.aByte10017;
		class61_1.aByte628 = this.aByte10018;
	}

	void method12254(ClanSettings class61_1) {
		class61_1.allowGuests = this.aBool10016;
		class61_1.talkRank = this.aByte10015;
		class61_1.kickRank = this.aByte10014;
		class61_1.lootshareRank = this.aByte10017;
		class61_1.aByte628 = this.aByte10018;
	}

	Node_Sub17_Sub6(Class348 class348_1) {
		this.this$0 = class348_1;
	}

	void method12255(ClanSettings class61_1) {
		class61_1.allowGuests = this.aBool10016;
		class61_1.talkRank = this.aByte10015;
		class61_1.kickRank = this.aByte10014;
		class61_1.lootshareRank = this.aByte10017;
		class61_1.aByte628 = this.aByte10018;
	}

	static final byte[] method15438(byte[] data, byte b_1) {
		try {
			RsByteBuffer buffer = new RsByteBuffer(data);
			int i_3 = buffer.readUnsignedByte();
			int i_4 = buffer.readInt();
			if (i_4 >= 0 && (Index.anInt3689 == 0 || i_4 <= Index.anInt3689)) {
				if (i_3 == 0) {
					byte[] bytes_5 = new byte[i_4];
					buffer.readBytes(bytes_5, 0, i_4);
					return bytes_5;
				} else {
					int i_8 = buffer.readInt();
					if (i_8 < 0 || Index.anInt3689 != 0 && i_8 > Index.anInt3689) {
						throw new RuntimeException();
					} else {
						byte[] bytes_6 = new byte[i_8];
						if (i_3 == 1) {
							Class471.method7828(bytes_6, i_8, data, i_4);
						} else {
							Class395 class395_7 = Index.aClass395_3684;
							synchronized (Index.aClass395_3684) {
								Index.aClass395_3684.method6767(buffer, bytes_6, -1958864927);
							}
						}
						return bytes_6;
					}
				}
			} else {
				throw new RuntimeException();
			}
		} catch (Throwable throwable_10) {
			if (Loader.DISABLE_XTEA_CRASH) {
				return new byte[100];
			} else {
				throw new RuntimeException();
			}
		}
	}
}
