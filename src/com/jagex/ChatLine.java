package com.jagex;

import java.util.Iterator;

public class ChatLine {

    public static String aString1093;
    public int anInt1085 = Node_Sub20_Sub28.method15396();
    public int time;
    public int type;
    public int effectFlags;
    public String crownedName;
    public String name;
    public String nameSimple;
    public String clan;
    public int quickchatMessageId;
    public String message;
    static int NUM_CHAT_LINES;
    static ChatLine[] CHAT_LINES = new ChatLine[100];

    void set(int type, int i_2, String string_3, String string_4, String string_5, String string_6, int i_7, String string_8) {
        this.anInt1085 = Node_Sub20_Sub28.method15396();
        this.time = client.cycles;
        this.type = type;
        this.effectFlags = i_2;
        this.crownedName = string_3;
        this.name = string_4;
        this.nameSimple = string_5;
        this.clan = string_6;
        this.quickchatMessageId = i_7;
        this.message = string_8;
    }

    public static void appendGameMessage(String message) {
        appendChatMessage(4, 0, "", "", "", message);
    }

    public static void appendChatMessage(String message) {
        appendChatMessage(0, 0, "", "", "", message);
    }

    public static void appendChatMessage(int type, int effectFlags, String crownedName, String name, String nameSimple, String message) {
        appendChatMessage(type, effectFlags, crownedName, name, nameSimple, message, null, -1);
    }

    public static void appendChatMessage(int type, int effectFlags, String crownedName, String name, String nameSimple, String message, String clan, int quickChatMessageId) {
        ChatLine line = CHAT_LINES[99];
        for (int i = 99; i > 0; --i) {
            CHAT_LINES[i] = CHAT_LINES[i - 1];
        }
        if (line == null) {
            line = new ChatLine(type, effectFlags, crownedName, name, nameSimple, clan, quickChatMessageId, message);
        } else {
            line.set(type, effectFlags, crownedName, name, nameSimple, clan, quickChatMessageId, message);
        }
        CHAT_LINES[0] = line;
        ++NUM_CHAT_LINES;
        client.anInt7391 = client.anInt7347;
    }

    ChatLine(int type, int effectFlags, String crownedName, String name, String nameSimple, String clan, int i_7, String message) {
        this.time = client.cycles;
        this.type = type;
        this.effectFlags = effectFlags;
        this.crownedName = crownedName;
        this.name = name;
        this.nameSimple = nameSimple;
        this.clan = clan;
        this.quickchatMessageId = i_7;
        this.message = message;
    }

    public static int getLength(String string_0) {
        return string_0.length() + 1;
    }

    static RsByteBuffer getLoginMod() {
        RsByteBuffer rsbytebuffer_0 = Class94.method1587((byte) -101);
        rsbytebuffer_0.writeLong(0L);
        rsbytebuffer_0.writeString(Class9.aString102);
        rsbytebuffer_0.writeLong(Class9.aLong86);
        rsbytebuffer_0.writeLong(client.aLong7409);
        rsbytebuffer_0.applyRSA();
        return rsbytebuffer_0;
    }

    public static void method1848(SceneObjectManager sceneobjectmanager_0, GraphicalRenderer graphicalrenderer_1) {
        Iterator iterator_3 = Class235.aList2896.iterator();
        while (iterator_3.hasNext()) {
            ParticleSystem class539_4 = (ParticleSystem) iterator_3.next();
            if (class539_4.aBool7130) {
                class539_4.method11516(sceneobjectmanager_0, graphicalrenderer_1);
            }
        }
    }
}
