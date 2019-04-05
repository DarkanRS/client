public class OutgoingLoginPacket {

    public static int anInt4280;

    public static OutgoingLoginPacket INIT_GAME_CONNECTION = new OutgoingLoginPacket(14, 0);

    public static OutgoingLoginPacket INIT_JS5REMOTE_CONNECTION = new OutgoingLoginPacket(15, -1);

    public static OutgoingLoginPacket GAMELOGIN = new OutgoingLoginPacket(16, -2);

    public static OutgoingLoginPacket LOBBYLOGIN = new OutgoingLoginPacket(19, -2);

    static OutgoingLoginPacket REQUEST_WORLDLIST = new OutgoingLoginPacket(23, 4);

    static OutgoingLoginPacket CHECK_WORLD_SUITABILITY = new OutgoingLoginPacket(24, -1);

    public static OutgoingLoginPacket GAMELOGIN_CONTINUE = new OutgoingLoginPacket(26, 0);

    static OutgoingLoginPacket SSL_WEBCONNECTION = new OutgoingLoginPacket(27, 0);

    public static OutgoingLoginPacket CREATE_ACCOUNT_CONNECT = new OutgoingLoginPacket(28, -2);

    public static OutgoingLoginPacket INIT_SOCIAL_NETWORK_CONNECTION = new OutgoingLoginPacket(29, -2);

    public static OutgoingLoginPacket SOCIAL_NETWORK_LOGIN = new OutgoingLoginPacket(30, -2);

    static OutgoingLoginPacket[] OUTGOING_LOGIN_PACKETS = new OutgoingLoginPacket[32];

    public int id;

    static {
        OutgoingLoginPacket[] arr_0 = Class345.getOutgoingLoginPackets();
        for (int i_1 = 0; i_1 < arr_0.length; i_1++) {
            OUTGOING_LOGIN_PACKETS[arr_0[i_1].id] = arr_0[i_1];
        }
    }

    OutgoingLoginPacket(int i_1, int i_2) {
        this.id = i_1;
    }
}
