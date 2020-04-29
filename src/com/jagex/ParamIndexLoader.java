package com.jagex;

public class ParamIndexLoader {

    static int anInt5029;

    LRUCache aClass229_5028 = new LRUCache(64);
    Index aClass317_5027;

    public ParamIndexLoader(Index index_3) {
        aClass317_5027 = index_3;
        if (aClass317_5027 != null) {
            aClass317_5027.filesCount(SharedConfigsType.PARAMS.id);
        }
    }

    static char method7080(char c) {
        switch (c) {
            case '\u00d2':
            case '\u00d3':
            case '\u00d4':
            case '\u00d5':
            case '\u00d6':
            case '\u00f2':
            case '\u00f3':
            case '\u00f4':
            case '\u00f5':
            case '\u00f6':
                return 'o';
            case '\u00c7':
            case '\u00e7':
                return 'c';
            case '\u00df':
                return 'b';
            case '\u00ff':
            case '\u0178':
                return 'y';
            case '#':
            case '[':
            case ']':
                return c;
            case '\u00c8':
            case '\u00c9':
            case '\u00ca':
            case '\u00cb':
            case '\u00e8':
            case '\u00e9':
            case '\u00ea':
            case '\u00eb':
                return 'e';
            case '\u00d1':
            case '\u00f1':
                return 'n';
            case '\u00c0':
            case '\u00c1':
            case '\u00c2':
            case '\u00c3':
            case '\u00c4':
            case '\u00e0':
            case '\u00e1':
            case '\u00e2':
            case '\u00e3':
            case '\u00e4':
                return 'a';
            case ' ':
            case '-':
            case '_':
            case '\u00a0':
                return '_';
            default:
                return Character.toLowerCase(c);
            case '\u00d9':
            case '\u00da':
            case '\u00db':
            case '\u00dc':
            case '\u00f9':
            case '\u00fa':
            case '\u00fb':
            case '\u00fc':
                return 'u';
            case '\u00cd':
            case '\u00ce':
            case '\u00cf':
            case '\u00ed':
            case '\u00ee':
            case '\u00ef':
                return 'i';
        }
    }

    public static void method7081() {
        Class365.setGameState(18);
        Class459.method7678();
        System.gc();
    }

    public void method7067() {
        LRUCache softcache_2 = aClass229_5028;
        synchronized (aClass229_5028) {
            aClass229_5028.method3863();
        }
    }

    public void method7068() {
        LRUCache softcache_3 = aClass229_5028;
        synchronized (aClass229_5028) {
            aClass229_5028.method3858(5);
        }
    }

    public ParamDefinitions getParam(int i_1) {
        LRUCache softcache_4 = aClass229_5028;
        ParamDefinitions attributedefault_3;
        synchronized (aClass229_5028) {
            attributedefault_3 = (ParamDefinitions) aClass229_5028.get(i_1);
        }
        if (attributedefault_3 != null) {
            return attributedefault_3;
        } else {
            Index index_5 = aClass317_5027;
            byte[] bytes_10;
            synchronized (aClass317_5027) {
                bytes_10 = aClass317_5027.getFile(SharedConfigsType.PARAMS.id, i_1);
            }
            attributedefault_3 = new ParamDefinitions();
            if (bytes_10 != null) {
                attributedefault_3.method7315(new ByteBuf(bytes_10));
            }
            LRUCache softcache_9 = aClass229_5028;
            synchronized (aClass229_5028) {
                aClass229_5028.put(attributedefault_3, i_1);
                return attributedefault_3;
            }
        }
    }

    public void method7070() {
        LRUCache softcache_2 = aClass229_5028;
        synchronized (aClass229_5028) {
            aClass229_5028.method3859();
        }
    }
}
