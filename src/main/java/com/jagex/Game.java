package com.jagex;

public class Game {

    public static Game darkan = new Game("darkan", "Darkan", 0);
    public static Game stellarDawn = new Game("stellardawn", "Stellar Dawn", 1);
    static Game aClass486_5745 = new Game("game3", "Game 3", 2);
    static Game aClass486_5743 = new Game("game4", "Game 4", 3);
    static Game aClass486_5747 = new Game("game5", "Game 5", 4);

    public String name;
    public String formattedName;
    public int id;

    Game(String string_1, String string_2, int i_3) {
        name = string_1;
        formattedName = string_2;
        id = i_3;
    }

    public static void method8204(int i_0) {
        HintTrail.anInt3376 = i_0;
    }

    public static void method8207(int i_0) {
        PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(16, i_0);
        class282_sub50_sub12_2.method14965();
    }
}
