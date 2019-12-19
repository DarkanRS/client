public class LightDetailPreference extends Preference {

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	public LightDetailPreference(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12785() {
		if (this.anInt5578 != 1 && this.anInt5578 != 0) {
			this.anInt5578 = this.getDefaultValue();
		}

	}

	int getDefaultValue() {
		return 1;
	}

	int checkValid(int i_1) {
		return 1;
	}

	int method7786() {
		return 1;
	}

	public int method12786() {
		return this.anInt5578;
	}

	void method7780(int i_1) {
		this.anInt5578 = i_1 * -754033619 * -859024475;
	}

	int method7784(int i_1) {
		return 1;
	}

	public LightDetailPreference(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

	int method7787() {
		return 1;
	}

	public static final void method12790(boolean bool_0, int i_1) {
		ClanChannel class282_sub4_3 = bool_0 ? Class113.CLAN_CHANNEL : AsyncConnection.GUEST_CLAN_CHANNEL;
		if (class282_sub4_3 != null && i_1 >= 0 && i_1 < class282_sub4_3.numPlayers) {
			ClanChannelPlayer class57_4 = class282_sub4_3.players[i_1];
			if (class57_4.rank == -1) {
				String string_5 = class57_4.name;
				BufferedConnectionContext class184_6 = Preference_Sub20.method12807(-1321489648);
				TCPPacket tcpmessage_7 = Class271.createPacket(ClientPacket.UNK_90, class184_6.isaac);
				tcpmessage_7.buffer.writeByte(3 + ChatLine.getLength(string_5));
				tcpmessage_7.buffer.writeByte(bool_0 ? 1 : 0);
				tcpmessage_7.buffer.writeShort(i_1);
				tcpmessage_7.buffer.writeString(string_5);
				class184_6.queuePacket(tcpmessage_7);
			}
		}

	}

}
