package com.jagex;

public enum ComponentType {
    CONTAINER(0),
    TYPE_1(1),
    TYPE_2(2),
    FIGURE(3),
    TEXT(4),
    SPRITE(5),
    MODEL(6),
    TYPE_7(7),
    TYPE_8(8),
    LINE(9);

    private final int id;

    ComponentType(int id) {
        this.id = id;
    }

    public static ComponentType forId(int id) {
        for (ComponentType t : ComponentType.values()) {
            if (t.id == id)
                return t;
        }
        return null;
    }
}