package com.jagex;

public class NPCIndexLoader {

    int anInt4845;

    LRUCache aClass229_4841 = new LRUCache(64);

    LRUCache aClass229_4836 = new LRUCache(50);

    LRUCache meshCache = new LRUCache(5);

    Game aClass486_4844;

    Language aClass495_4837;

    boolean aBool4838;

    Index aClass317_4839;

    Index aClass317_4842;

    String[] aStringArray4840;

    public NPCIndexLoader(Game game_1, Language xlanguage_2, Index index_4, Index index_5) {
        aClass486_4844 = game_1;
        aClass495_4837 = xlanguage_2;
        aBool4838 = true;
        aClass317_4839 = index_4;
        aClass317_4842 = index_5;
        if (aClass317_4839 != null) {
            int i_6 = aClass317_4839.containersCount() - 1;
            SharedConfigsType.NPCS.filesPerContainer();
            aClass317_4839.filesCount(i_6);
        }
        if (aClass486_4844 == Game.darkan) {
            aStringArray4840 = new String[]{null, null, null, null, null, LocalizedText.EXAMINE.translate(aClass495_4837)};
        } else {
            aStringArray4840 = new String[6];
        }
    }

    static Class111[] method6852() {
        return new Class111[]{Class111.aClass111_1222, Class111.aClass111_1108, Class111.aClass111_1109, Class111.aClass111_1110, Class111.aClass111_1111, Class111.aClass111_1112, Class111.aClass111_1113, Class111.aClass111_1204, Class111.aClass111_1199, Class111.aClass111_1131, Class111.aClass111_1117, Class111.aClass111_1114, Class111.aClass111_1200, Class111.aClass111_1120, Class111.aClass111_1121, Class111.aClass111_1122, Class111.aClass111_1123, Class111.aClass111_1124, Class111.aClass111_1125, Class111.aClass111_1126, Class111.aClass111_1127, Class111.aClass111_1164, Class111.aClass111_1175, Class111.aClass111_1129, Class111.aClass111_1219, Class111.aClass111_1132, Class111.aClass111_1133, Class111.aClass111_1134, Class111.aClass111_1205, Class111.aClass111_1177, Class111.aClass111_1137, Class111.aClass111_1138, Class111.aClass111_1173, Class111.aClass111_1189, Class111.aClass111_1141, Class111.aClass111_1142, Class111.aClass111_1115, Class111.aClass111_1144, Class111.aClass111_1145, Class111.aClass111_1146, Class111.aClass111_1196, Class111.aClass111_1168, Class111.aClass111_1149, Class111.aClass111_1150, Class111.aClass111_1176, Class111.aClass111_1152, Class111.aClass111_1153, Class111.aClass111_1184, Class111.aClass111_1155, Class111.aClass111_1156, Class111.aClass111_1143, Class111.aClass111_1158, Class111.aClass111_1159, Class111.aClass111_1160, Class111.aClass111_1161, Class111.aClass111_1157, Class111.aClass111_1107, Class111.aClass111_1194, Class111.aClass111_1229, Class111.aClass111_1166, Class111.aClass111_1167, Class111.aClass111_1135, Class111.aClass111_1140, Class111.aClass111_1170, Class111.aClass111_1171, Class111.aClass111_1172, Class111.aClass111_1147, Class111.aClass111_1174, Class111.aClass111_1139, Class111.aClass111_1220, Class111.aClass111_1182, Class111.aClass111_1178, Class111.aClass111_1179, Class111.aClass111_1148, Class111.aClass111_1181, Class111.aClass111_1180, Class111.aClass111_1183, Class111.aClass111_1207, Class111.aClass111_1185, Class111.aClass111_1186, Class111.aClass111_1187, Class111.aClass111_1119, Class111.aClass111_1209, Class111.aClass111_1190, Class111.aClass111_1191, Class111.aClass111_1192, Class111.aClass111_1193, Class111.aClass111_1162, Class111.aClass111_1198, Class111.aClass111_1151, Class111.aClass111_1197, Class111.aClass111_1188, Class111.aClass111_1154, Class111.aClass111_1128, Class111.aClass111_1201, Class111.aClass111_1202, Class111.aClass111_1203, Class111.aClass111_1165, Class111.aClass111_1163, Class111.aClass111_1206, Class111.aClass111_1116, Class111.aClass111_1208, Class111.aClass111_1169, Class111.aClass111_1210, Class111.aClass111_1211, Class111.aClass111_1212, Class111.aClass111_1213, Class111.aClass111_1214, Class111.aClass111_1215, Class111.aClass111_1216, Class111.aClass111_1217, Class111.aClass111_1218, Class111.aClass111_1195, Class111.aClass111_1136, Class111.aClass111_1221, Class111.aClass111_1118, Class111.aClass111_1223, Class111.aClass111_1224, Class111.aClass111_1225, Class111.aClass111_1226, Class111.aClass111_1227, Class111.aClass111_1228, Class111.aClass111_1130, Class111.aClass111_1230, Class111.aClass111_1231};
    }

    public NPCDefinitions getNPCType(int i_1) {
        LRUCache softcache_4 = aClass229_4841;
        NPCDefinitions npcdefinitions_3;
        synchronized (aClass229_4841) {
            npcdefinitions_3 = (NPCDefinitions) aClass229_4841.get(i_1);
        }
        if (npcdefinitions_3 != null) {
            return npcdefinitions_3;
        } else {
            Index index_5 = aClass317_4839;
            byte[] bytes_10;
            synchronized (aClass317_4839) {
                bytes_10 = aClass317_4839.getFile(SharedConfigsType.NPCS.containerId(i_1), SharedConfigsType.NPCS.fileId(i_1));
            }
            npcdefinitions_3 = new NPCDefinitions();
            npcdefinitions_3.id = i_1;
            npcdefinitions_3.npcLoader = this;
            npcdefinitions_3.options = aStringArray4840.clone();
            if (bytes_10 != null) {
                npcdefinitions_3.method6874(new ByteBuf(bytes_10));
            }
            npcdefinitions_3.method6877();
            LRUCache softcache_9 = aClass229_4841;
            synchronized (aClass229_4841) {
                aClass229_4841.put(npcdefinitions_3, i_1);
                return npcdefinitions_3;
            }
        }
    }

    public void method6829(int i_1) {
        anInt4845 = i_1;
        LRUCache softcache_3 = aClass229_4836;
        synchronized (aClass229_4836) {
            aClass229_4836.method3859();
        }
        softcache_3 = meshCache;
        synchronized (meshCache) {
            meshCache.method3859();
        }
    }

    public void method6831() {
        LRUCache softcache_2 = aClass229_4836;
        synchronized (aClass229_4836) {
            aClass229_4836.method3859();
        }
        softcache_2 = meshCache;
        synchronized (meshCache) {
            meshCache.method3859();
        }
    }

    public void method6832() {
        LRUCache softcache_3 = aClass229_4841;
        synchronized (aClass229_4841) {
            aClass229_4841.method3858(5);
        }
        softcache_3 = aClass229_4836;
        synchronized (aClass229_4836) {
            aClass229_4836.method3858(5);
        }
        softcache_3 = meshCache;
        synchronized (meshCache) {
            meshCache.method3858(5);
        }
    }

    public void method6833() {
        LRUCache softcache_2 = aClass229_4841;
        synchronized (aClass229_4841) {
            aClass229_4841.method3863();
        }
        softcache_2 = aClass229_4836;
        synchronized (aClass229_4836) {
            aClass229_4836.method3863();
        }
        softcache_2 = meshCache;
        synchronized (meshCache) {
            meshCache.method3863();
        }
    }

    public void method6836() {
        LRUCache softcache_2 = aClass229_4841;
        synchronized (aClass229_4841) {
            aClass229_4841.method3859();
        }
        softcache_2 = aClass229_4836;
        synchronized (aClass229_4836) {
            aClass229_4836.method3859();
        }
        softcache_2 = meshCache;
        synchronized (meshCache) {
            meshCache.method3859();
        }
    }

    public void method6847(boolean bool_1) {
        if (aBool4838 != bool_1) {
            aBool4838 = bool_1;
            method6836();
        }
    }
}
