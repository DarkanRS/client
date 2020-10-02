package com.jagex;

public enum LoginProt {

    INIT_GAME_CONNECTION(14),
    INIT_JS5REMOTE_CONNECTION(15),
    GAMELOGIN(16),
    LOBBYLOGIN(19),
    REQUEST_WORLDLIST(23),
    CHECK_WORLD_SUITABILITY(24),
    GAMELOGIN_CONTINUE(26),
    SSL_WEBCONNECTION(27),
    CREATE_ACCOUNT_CONNECT(28),
    INIT_SOCIAL_NETWORK_CONNECTION(29),
    SOCIAL_NETWORK_LOGIN(30);

    private static final LoginProt[] OUTGOING_LOGIN_PACKETS = new LoginProt[32];

    static {
        for (LoginProt packet : LoginProt.values())
            OUTGOING_LOGIN_PACKETS[packet.id] = packet;
    }

    public final int id;

    LoginProt(int id) {
        this.id = id;
    }
}
