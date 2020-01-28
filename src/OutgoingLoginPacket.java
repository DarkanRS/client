public enum OutgoingLoginPacket {

	INIT_GAME_CONNECTION(14, 0),
	INIT_JS5REMOTE_CONNECTION(15, -1),
	GAMELOGIN(16, -2),
	LOBBYLOGIN(19, -2),
	REQUEST_WORLDLIST(23, 4),
	CHECK_WORLD_SUITABILITY(24, -1),
	GAMELOGIN_CONTINUE(26, 0),
	SSL_WEBCONNECTION(27, 0),
	CREATE_ACCOUNT_CONNECT(28, -2),
	INIT_SOCIAL_NETWORK_CONNECTION(29, -2),
	SOCIAL_NETWORK_LOGIN(30, -2);

	private static OutgoingLoginPacket[] OUTGOING_LOGIN_PACKETS = new OutgoingLoginPacket[32];
	
	static {
		for (OutgoingLoginPacket packet : OutgoingLoginPacket.values())
			OUTGOING_LOGIN_PACKETS[packet.id] = packet;
	}

	public int id;

	private OutgoingLoginPacket(int id, int size) {
		this.id = id;
	}
}
