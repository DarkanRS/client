package com.jagex;

public class Class298 implements Interface41 {

    Index index;

    Class298(Index index_1) {
        index = index_1;
    }

    static boolean gameNotLoading() {
        return !GameState.loadingState(client.GAME_STATE);
    }

    public static boolean method5304(int i_0) {
        return i_0 == 0 || i_0 == 1 || i_0 == 2;
    }

    @Override
    public Class445 method232() {
        return Class445.aClass445_5381;
    }

    @Override
    public int getCompletion() {
        return index.isValid() ? 100 : index.getCompletion();
    }

    @Override
    public Class445 method234() {
        return Class445.aClass445_5381;
    }

    @Override
    public int method231() {
        return index.isValid() ? 100 : index.getCompletion();
    }

    @Override
    public Class445 method230() {
        return Class445.aClass445_5381;
    }

    @Override
    public Class445 method233() {
        return Class445.aClass445_5381;
    }

    @Override
    public Class445 method235() {
        return Class445.aClass445_5381;
    }
}
