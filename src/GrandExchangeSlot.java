public class GrandExchangeSlot {

	byte progress;
	public int itemId;
	public int price;
	public int amount;
	public int currentAmount;
	public int totalPrice;

	public GrandExchangeSlot() {
	}

	public int method5908(int i_1) {
		return this.progress & 0x7;
	}

	public int method5909() {
		return (this.progress & 0x8) == 8 ? 1 : 0;
	}

	public GrandExchangeSlot(RsByteBuffer buffer) {
		this.progress = buffer.readByte();
		this.itemId = buffer.readUnsignedShort();
		this.price = buffer.readInt();
		this.amount = buffer.readInt();
		this.currentAmount = buffer.readInt();
		this.totalPrice = buffer.readInt();
	}

	public static void method5913() {
		IComponentDefinitions.aClass229_1280.method3863(1550469296);
		IComponentDefinitions.aClass229_1341.method3863(986985015);
		IComponentDefinitions.aClass229_1303.method3863(759496379);
		IComponentDefinitions.aClass229_1282.method3863(726939878);
	}

	public static int method5914(byte[] bytes_0, int i_1, CharSequence charsequence_2) {
		int i_4 = charsequence_2.length();
		int i_5 = i_1;
		for (int i_6 = 0; i_6 < i_4; i_6++) {
			char var_7 = charsequence_2.charAt(i_6);
			if (var_7 <= 127) {
				bytes_0[i_5++] = (byte) var_7;
			} else if (var_7 <= 2047) {
				bytes_0[i_5++] = (byte) (0xc0 | var_7 >> 6);
				bytes_0[i_5++] = (byte) (0x80 | var_7 & 0x3f);
			} else {
				bytes_0[i_5++] = (byte) (0xe0 | var_7 >> 12);
				bytes_0[i_5++] = (byte) (0x80 | var_7 >> 6 & 0x3f);
				bytes_0[i_5++] = (byte) (0x80 | var_7 & 0x3f);
			}
		}
		return i_5 - i_1;
	}

	static final void method5916() {
		for (int i_1 = 0; i_1 < client.NPC_UPDATE_INDEX; i_1++) {
			int i_2 = client.NPC_UPDATE_INDICES[i_1];
			StringNode class282_sub47_3 = (StringNode) client.NPCS.get((long) i_2);
			if (class282_sub47_3 != null) {
				NPC npc_4 = (NPC) class282_sub47_3.anObject8068;
				Class363.method6287(npc_4, false, -496404861);
			}
		}
	}
}
