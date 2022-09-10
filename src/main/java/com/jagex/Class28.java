package com.jagex;

public class Class28 implements Interface2 {

    static long aLong351;

    Class365 aClass365_349;

    NewsItemFetcher fetchNewsTask;

    Class28(NewsItemFetcher class30_1, Class365 class365_2) {
        aClass365_349 = class365_2;
        fetchNewsTask = class30_1;
    }

    public static void method772() {
        if (Comparable_Sub1.aClass306_3771 != null) {
            Comparable_Sub1.aClass306_3771.method5437();
        }
        if (VarDefinitionLoader.aThread4520 != null) {
            while (true) {
                try {
                    VarDefinitionLoader.aThread4520.join();
                    break;
                } catch (InterruptedException ignored) {
                }
            }
        }
    }

    static void method776(IComponentDefinitions icomponentdefinitions_0) {
        if (icomponentdefinitions_0.contentType == ContentType.LOCAL_PLAYER_MODEL) {
            if (VertexNormal.MY_PLAYER.displayName == null) {
                icomponentdefinitions_0.modelId = 0;
                icomponentdefinitions_0.anInt1339 = 0;
            } else {
                icomponentdefinitions_0.spritePitch = 150;
                icomponentdefinitions_0.spriteRoll = (int) (Math.sin(client.FRAME_COUNT / 40.0D) * 256.0D) & 0x7ff;
                icomponentdefinitions_0.modelType = ModelType.PLAYER_MODEL;
                icomponentdefinitions_0.modelId = client.myPlayerIndex;
                icomponentdefinitions_0.anInt1339 = Class272.stringToInt(VertexNormal.MY_PLAYER.displayName);
                MovingAnimation class456_sub3_2 = VertexNormal.MY_PLAYER.aAnimation_Sub3_10337;
                if (class456_sub3_2 != null) {
                    if (icomponentdefinitions_0.anim == null) {
                        icomponentdefinitions_0.anim = new Animation_Sub1();
                    }
                    icomponentdefinitions_0.animation = class456_sub3_2.method7597();
                    icomponentdefinitions_0.anim.method7563(class456_sub3_2);
                } else {
                    icomponentdefinitions_0.anim = null;
                }
            }
        }
    }

    @Override
    public boolean method10() {
        return fetchNewsTask.fetch();
    }

    @Override
    public boolean method17() {
        return fetchNewsTask.fetch();
    }

    @Override
    public void method11(boolean bool_1) {
        NewsItem class105_2 = fetchNewsTask.get(aClass365_349.anInt4229 * 1551783443 * 778888219);
        if (class105_2 != null) {
            int i_3 = aClass365_349.aClass356_4225.method6221(aClass365_349.anInt4227 * 1984931449 * -547232823, 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005) + aClass365_349.anInt4221 * 368783541 * 1878539677;
            int i_4 = aClass365_349.aClass353_4226.method6198(1416311209 * aClass365_349.anInt4228 * -1733557607, 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass365_349.anInt4223 * 843965525 * -1081607939;
            if (aClass365_349.aBool4230) {
                Renderers.CURRENT_RENDERER.method8430(i_3, i_4, -547232823 * aClass365_349.anInt4227 * 1984931449, aClass365_349.anInt4228 * -1733557607 * 1416311209, aClass365_349.anInt4220 * -965307251 * -1214034363, 0);
            }
            i_4 += method770(Class285.aFontRenderer_3394, class105_2.aString1067, i_3, i_4) * 12;
            i_4 += 8;
            if (aClass365_349.aBool4230) {
                Renderers.CURRENT_RENDERER.method8433(i_3, i_4, aClass365_349.anInt4227 * 1984931449 * -547232823 + i_3 - 1, i_4, -1214034363 * aClass365_349.anInt4220 * -965307251, 0);
            }
            ++i_4;
            i_4 += method770(Class285.aFontRenderer_3394, class105_2.aString1066, i_3, i_4) * 12;
            i_4 += 5;
            int i_10000 = i_4 + method770(Class285.aFontRenderer_3394, class105_2.aString1068, i_3, i_4) * 12;
        }
    }

    @Override
    public void method20(boolean bool_1) {
        NewsItem class105_3 = fetchNewsTask.get(aClass365_349.anInt4229);
        if (class105_3 != null) {
            int i_4 = aClass365_349.aClass356_4225.method6221(aClass365_349.anInt4227, client.GAME_WIDTH) + aClass365_349.anInt4221;
            int i_5 = aClass365_349.aClass353_4226.method6198(aClass365_349.anInt4228, client.GAME_HEIGHT) + aClass365_349.anInt4223;
            if (aClass365_349.aBool4230) {
                Renderers.CURRENT_RENDERER.method8430(i_4, i_5, aClass365_349.anInt4227, aClass365_349.anInt4228, aClass365_349.anInt4220, 0);
            }
            i_5 += method770(Class285.aFontRenderer_3394, class105_3.aString1067, i_4, i_5) * 12;
            i_5 += 8;
            if (aClass365_349.aBool4230) {
                Renderers.CURRENT_RENDERER.method8433(i_4, i_5, aClass365_349.anInt4227 + i_4 - 1, i_5, aClass365_349.anInt4220, 0);
            }
            ++i_5;
            i_5 += method770(Class285.aFontRenderer_3394, class105_3.aString1066, i_4, i_5) * 12;
            i_5 += 5;
            int i_10000 = i_5 + method770(Class285.aFontRenderer_3394, class105_3.aString1068, i_4, i_5) * 12;
        }
    }

    @Override
    public void method12(boolean bool_1) {
        NewsItem class105_2 = fetchNewsTask.get(aClass365_349.anInt4229 * 1551783443 * 778888219);
        if (class105_2 != null) {
            int i_3 = aClass365_349.aClass356_4225.method6221(aClass365_349.anInt4227 * 1984931449 * -547232823, 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005) + aClass365_349.anInt4221 * 368783541 * 1878539677;
            int i_4 = aClass365_349.aClass353_4226.method6198(1416311209 * aClass365_349.anInt4228 * -1733557607, 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass365_349.anInt4223 * 843965525 * -1081607939;
            if (aClass365_349.aBool4230) {
                Renderers.CURRENT_RENDERER.method8430(i_3, i_4, -547232823 * aClass365_349.anInt4227 * 1984931449, aClass365_349.anInt4228 * -1733557607 * 1416311209, aClass365_349.anInt4220 * -965307251 * -1214034363, 0);
            }
            i_4 += method770(Class285.aFontRenderer_3394, class105_2.aString1067, i_3, i_4) * 12;
            i_4 += 8;
            if (aClass365_349.aBool4230) {
                Renderers.CURRENT_RENDERER.method8433(i_3, i_4, aClass365_349.anInt4227 * 1984931449 * -547232823 + i_3 - 1, i_4, -1214034363 * aClass365_349.anInt4220 * -965307251, 0);
            }
            ++i_4;
            i_4 += method770(Class285.aFontRenderer_3394, class105_2.aString1066, i_3, i_4) * 12;
            i_4 += 5;
            int i_10000 = i_4 + method770(Class285.aFontRenderer_3394, class105_2.aString1068, i_3, i_4) * 12;
        }
    }

    int method770(FontRenderer fontrenderer_1, String string_2, int i_3, int i_4) {
        return fontrenderer_1.method378(string_2, i_3 + 5, 5 + i_4, aClass365_349.anInt4227 - 10, aClass365_349.anInt4228 - 10, aClass365_349.anInt4224, aClass365_349.anInt4222, 0, 0, 0, null, null, null, 0, 0);
    }

    @Override
    public void method14(boolean bool_1) {
        NewsItem class105_2 = fetchNewsTask.get(aClass365_349.anInt4229 * 1551783443 * 778888219);
        if (class105_2 != null) {
            int i_3 = aClass365_349.aClass356_4225.method6221(aClass365_349.anInt4227 * 1984931449 * -547232823, 150480619 * client.GAME_WIDTH * 1426041429 * 765 * -1115795005) + aClass365_349.anInt4221 * 368783541 * 1878539677;
            int i_4 = aClass365_349.aClass353_4226.method6198(1416311209 * aClass365_349.anInt4228 * -1733557607, 1176039023 * client.GAME_HEIGHT * -994133479 * 553 * -645779313) + aClass365_349.anInt4223 * 843965525 * -1081607939;
            if (aClass365_349.aBool4230) {
                Renderers.CURRENT_RENDERER.method8430(i_3, i_4, -547232823 * aClass365_349.anInt4227 * 1984931449, aClass365_349.anInt4228 * -1733557607 * 1416311209, aClass365_349.anInt4220 * -965307251 * -1214034363, 0);
            }
            i_4 += method770(Class285.aFontRenderer_3394, class105_2.aString1067, i_3, i_4) * 12;
            i_4 += 8;
            if (aClass365_349.aBool4230) {
                Renderers.CURRENT_RENDERER.method8433(i_3, i_4, aClass365_349.anInt4227 * 1984931449 * -547232823 + i_3 - 1, i_4, -1214034363 * aClass365_349.anInt4220 * -965307251, 0);
            }
            ++i_4;
            i_4 += method770(Class285.aFontRenderer_3394, class105_2.aString1066, i_3, i_4) * 12;
            i_4 += 5;
            int i_10000 = i_4 + method770(Class285.aFontRenderer_3394, class105_2.aString1068, i_3, i_4) * 12;
        }
    }

    @Override
    public void method22() {
    }

    @Override
    public void method16() {
    }

    @Override
    public void method23() {
    }

    @Override
    public void method18() {
    }

    @Override
    public void method19() {
    }

    @Override
    public boolean method13() {
        return fetchNewsTask.fetch();
    }

    @Override
    public boolean method9() {
        return fetchNewsTask.fetch();
    }

    @Override
    public boolean method21() {
        return fetchNewsTask.fetch();
    }

    @Override
    public void method15() {
    }
}
