package com.jagex;

public enum AccountCreationResponseOpcodes implements Identifiable {

    aClass483_5737(-1),
    aClass483_5730(-2),
    aClass483_5729(-3),
    aClass483_5732(-4),
    aClass483_5731(-5),
    CONTINUE(2),
    aClass483_5735(3),
    aClass483_5736(7),
    aClass483_5733(9),
    CLIENT_HAS_BEEN_UPDATED(37);

    int opcode;

    AccountCreationResponseOpcodes(int i_1) {
        this.opcode = i_1;
    }

    public int getValue() {
        return this.opcode;
    }
}
