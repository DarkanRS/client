public class Class402 {

	public static String aString4828;

	boolean aBool4826;

	Class399[] aClass399Array4827;

	Class402(boolean bool_1, Class399[] arr_2) {
		this.aBool4826 = bool_1;
		this.aClass399Array4827 = arr_2;
	}

	public static final void deleteFriend(String string_0) {
		if (string_0 != null) {
			String string_2 = Class383.method6515(string_0);
			if (string_2 != null) {
				for (int i_3 = 0; i_3 < client.FRIEND_COUNT; i_3++) {
					Friend class6_4 = client.FRIENDS[i_3];
					String string_5 = class6_4.displayName;
					String string_6 = Class383.method6515(string_5);
					if (Class159.method2734(string_0, string_2, string_5, string_6, (byte) -79)) {
						--client.FRIEND_COUNT;
						for (int i_7 = i_3; i_7 < client.FRIEND_COUNT; i_7++) {
							client.FRIENDS[i_7] = client.FRIENDS[i_7 + 1];
						}
						client.anInt7386 = client.anInt7347;
						BufferedConnectionContext class184_9 = Preference_Sub20.method12807(222304163);
						TCPPacket tcpmessage_8 = Class271.createPacket(OutgoingPacket.REMOVE_FRIEND, class184_9.isaac);
						tcpmessage_8.buffer.writeByte(ChatLine.getLength(string_0));
						tcpmessage_8.buffer.writeString(string_0);
						class184_9.queuePacket(tcpmessage_8);
						break;
					}
				}
			}
		}
	}
}
