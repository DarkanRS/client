package com.jagex;

public class GroundItem extends GraphNode_Sub1_Sub2 {

    public int anInt10412;
    public int anInt10414;
    public int anInt10416;
    public int anInt10423;
    public int anInt10422;
    public int anInt10411 = -1;
    public int anInt10415 = -1;
    int anInt10420;
    int anInt10421;
    int anInt10413;
    int anInt10417;
    boolean aBool10419;
    int anInt10418;

    public GroundItem(SceneObjectManager sceneobjectmanager_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        super(sceneobjectmanager_1, i_2, i_3, i_4, i_5, i_6);
        method13008(3);
        method15947();
    }

    @Override
    public int method12997() {
        return anInt10422 - method12995();
    }

    void method15947() {
        anInt10420 = 32 + (int) (Math.random() * 4.0D);
        anInt10421 = 3 + (int) (Math.random() * 2.0D);
        anInt10413 = 16 + (int) (Math.random() * 3.0D);
        if (Class393.preferences.textures.method12873() == 1) {
            anInt10417 = (int) (Math.random() * 10.0D);
        } else {
            anInt10417 = (int) (Math.random() * 20.0D);
        }

    }

    @Override
    boolean method12999() {
        return false;
    }

    @Override
    boolean method12987() {
        return aBool10419;
    }

    @Override
    public Class200 method12992(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    public int method12995() {
        return -10;
    }

    @Override
    boolean method13001() {
        return aBool10419;
    }

    @Override
    void method12991(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    public Class200 method13019(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    boolean method12986() {
        return false;
    }

    @Override
    boolean method12983(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        Matrix44Var matrix44var_5 = graphicalrenderer_1.method8450();
        matrix44var_5.method5210(method11166());
        matrix44var_5.method5219(0.0F, -10.0f, 0.0F);
        MeshRasterizer meshrasterizer_6 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10423).method7084(graphicalrenderer_1, 131072, anInt10416, null, null, 0, 0, 0, 0);
        if (meshrasterizer_6 != null && meshrasterizer_6.method11270(i_2, i_3, matrix44var_5, true, 0)) {
            return true;
        } else {
            if (anInt10411 != -1) {
                meshrasterizer_6 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10411).method7084(graphicalrenderer_1, 131072, anInt10414, null, null, 0, 0, 0, 0);
                if (meshrasterizer_6 != null && meshrasterizer_6.method11270(i_2, i_3, matrix44var_5, true, 0)) {
                    return true;
                }
            }

            if (anInt10415 != -1) {
                meshrasterizer_6 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10415).method7084(graphicalrenderer_1, 131072, anInt10412, null, null, 0, 0, 0, 0);
                return meshrasterizer_6 != null && meshrasterizer_6.method11270(i_2, i_3, matrix44var_5, true, 0);
            }

            return false;
        }
    }

    @Override
    public int method13003() {
        return -10;
    }

    @Override
    public int method13006() {
        return -10;
    }

    @Override
    boolean method13002() {
        return aBool10419;
    }

    @Override
    Class285 method13009(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = Vector3.popVectorStackTo(method11166().coords);
        Class208 class208_3 = aClass206_7970.method3507(plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9);
        SceneObjectNode sceneobjectnode_4 = aClass206_7970.getGroundDecoration(plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9);
        int i_5 = 0;
        if (class208_3 != null && class208_3.aTransform_Sub1_Sub1_2659.aBool9459) {
            i_5 = class208_3.aTransform_Sub1_Sub1_2659.method12995();
        }

        if (sceneobjectnode_4 != null && sceneobjectnode_4.aShort9561 > -i_5) {
            i_5 = -sceneobjectnode_4.aShort9561;
        }

        if (i_5 != 1327971947 * anInt10422 * -460947901) {
            vector3_2.y += (i_5 - 1327971947 * anInt10422 * -460947901);
            method11171(vector3_2);
            anInt10422 = -460947901 * i_5 * 1327971947;
        }

        Matrix44Var matrix44var_6 = graphicalrenderer_1.method8450();
        matrix44var_6.method5212();
        if (anInt10422 * -460947901 * 1327971947 == 0) {
            boolean bool_7 = false;
            boolean bool_8 = false;
            boolean bool_9 = false;
            Ground class390_10 = aClass206_7970.aGroundArray2591[collisionPlane];
            int i_11 = 599728753 * anInt10418 * -1885839727 << 1;
            int i_13 = -i_11 / 2;
            int i_14 = -i_11 / 2;
            int i_15 = class390_10.averageHeight((int) vector3_2.x + i_13, (int) vector3_2.z + i_14);
            int i_16 = i_11 / 2;
            int i_17 = -i_11 / 2;
            int i_18 = class390_10.averageHeight((int) vector3_2.x + i_16, i_17 + (int) vector3_2.z);
            int i_19 = -i_11 / 2;
            int i_20 = i_11 / 2;
            int i_21 = class390_10.averageHeight((int) vector3_2.x + i_19, i_20 + (int) vector3_2.z);
            int i_22 = i_11 / 2;
            int i_23 = i_11 / 2;
            int i_24 = class390_10.averageHeight((int) vector3_2.x + i_22, (int) vector3_2.z + i_23);
            int i_25 = Math.min(i_15, i_18);
            int i_26 = Math.min(i_21, i_24);
            int i_27 = Math.min(i_18, i_24);
            int i_28 = Math.min(i_15, i_21);
            int i_29;
            if (i_11 != 0) {
                i_29 = (int) (Math.atan2(i_25 - i_26, i_11) * 2607.5945876176133D) & 0x3fff;
                if (i_29 != 0) {
                    matrix44var_6.rotation(1.0F, 0.0F, 0.0F, Class382.method6508(i_29));
                }
            }

            if (i_11 != 0) {
                i_29 = (int) (Math.atan2(i_28 - i_27, i_11) * 2607.5945876176133D) & 0x3fff;
                if (i_29 != 0) {
                    matrix44var_6.rotation(0.0F, 0.0F, 1.0F, Class382.method6508(-i_29));
                }
            }

            i_29 = i_15 + i_24;
            if (i_18 + i_21 < i_29) {
                i_29 = i_18 + i_21;
            }

            i_29 = (i_29 >> 1) - (int) vector3_2.y;
            if (i_29 != 0) {
                matrix44var_6.method5219(0.0F, i_29, 0.0F);
            }
        }

        vector3_2.pushVectorStack();
        Vector3 vector3_30 = method11166().coords;
        matrix44var_6.method5219(vector3_30.x, vector3_30.y - 10.0F, vector3_30.z);
        Class285 class285_31 = Class470.method7824(true);
        aBool10419 = false;
        anInt10418 = 0;
        MeshRasterizer meshrasterizer_32;
        if (-503986647 * anInt10415 * 100349465 != -1) {
            meshrasterizer_32 = IndexLoaders.ITEM_LOADER.getItemDefinitions(-503986647 * anInt10415 * 100349465).method7084(graphicalrenderer_1, 526336, anInt10412 * -1052106625 * -931815553, null, null, anInt10420 * -450257987 * 225048469, anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * anInt10413 * 1440872383, -359736537 * anInt10417 * 1371726999);
            if (meshrasterizer_32 != null) {
                meshrasterizer_32.method11282(matrix44var_6, boundingBoxPolygons[2], 0);
                aBool10419 |= meshrasterizer_32.i();
                anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
            }
        }

        if (anInt10411 * -1841858001 * 313920719 != -1) {
            meshrasterizer_32 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10411 * -1841858001 * 313920719).method7084(graphicalrenderer_1, 526336, 1089437631 * anInt10414 * 1305767999, null, null, 225048469 * anInt10420 * -450257987, -731570957 * anInt10421 * -1431655765 * 3 * -146187205, 1264449599 * anInt10413 * 1440872383, -359736537 * anInt10417 * 1371726999);
            if (meshrasterizer_32 != null) {
                meshrasterizer_32.method11282(matrix44var_6, boundingBoxPolygons[1], 0);
                aBool10419 |= meshrasterizer_32.i();
                if (meshrasterizer_32.n() > anInt10418 * -1885839727 * 599728753) {
                    anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
                }
            }
        }

        meshrasterizer_32 = IndexLoaders.ITEM_LOADER.getItemDefinitions(-876219087 * anInt10423 * -1511570479).method7084(graphicalrenderer_1, 526336, anInt10416 * 1423185937 * 513267953, null, null, 225048469 * anInt10420 * -450257987, anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * anInt10413 * 1440872383, -359736537 * anInt10417 * 1371726999);
        if (meshrasterizer_32 != null) {
            meshrasterizer_32.method11282(matrix44var_6, boundingBoxPolygons[0], 0);
            aBool10419 |= meshrasterizer_32.i();
            if (meshrasterizer_32.n() > 599728753 * anInt10418 * -1885839727) {
                anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
            }
        }

        return class285_31;
    }

    @Override
    public int method13017() {
        return -10;
    }

    @Override
    public int method13005() {
        return -10;
    }

    @Override
    int method12996() {
        ItemDefinitions itemdefinitions_2 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10423);
        int i_3 = itemdefinitions_2.pickSizeShift;
        ItemDefinitions itemdefinitions_4;
        if (anInt10411 != -1) {
            itemdefinitions_4 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10411);
            if (itemdefinitions_4.pickSizeShift > i_3) {
                i_3 = itemdefinitions_4.pickSizeShift;
            }
        }

        if (anInt10415 != -1) {
            itemdefinitions_4 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10415);
            if (itemdefinitions_4.pickSizeShift > i_3) {
                i_3 = itemdefinitions_4.pickSizeShift;
            }
        }

        return i_3;
    }

    @Override
    boolean method13000() {
        return aBool10419;
    }

    @Override
    Class285 method13010(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = Vector3.popVectorStackTo(method11166().coords);
        Class208 class208_3 = aClass206_7970.method3507(plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9);
        SceneObjectNode sceneobjectnode_4 = aClass206_7970.getGroundDecoration(plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9);
        int i_5 = 0;
        if (class208_3 != null && class208_3.aTransform_Sub1_Sub1_2659.aBool9459) {
            i_5 = class208_3.aTransform_Sub1_Sub1_2659.method12995();
        }

        if (sceneobjectnode_4 != null && sceneobjectnode_4.aShort9561 > -i_5) {
            i_5 = -sceneobjectnode_4.aShort9561;
        }

        if (i_5 != 1327971947 * anInt10422 * -460947901) {
            vector3_2.y += (i_5 - 1327971947 * anInt10422 * -460947901);
            method11171(vector3_2);
            anInt10422 = -460947901 * i_5 * 1327971947;
        }

        Matrix44Var matrix44var_6 = graphicalrenderer_1.method8450();
        matrix44var_6.method5212();
        if (anInt10422 * -460947901 * 1327971947 == 0) {
            boolean bool_7 = false;
            boolean bool_8 = false;
            boolean bool_9 = false;
            Ground class390_10 = aClass206_7970.aGroundArray2591[collisionPlane];
            int i_11 = 599728753 * anInt10418 * -1885839727 << 1;
            int i_13 = -i_11 / 2;
            int i_14 = -i_11 / 2;
            int i_15 = class390_10.averageHeight((int) vector3_2.x + i_13, (int) vector3_2.z + i_14);
            int i_16 = i_11 / 2;
            int i_17 = -i_11 / 2;
            int i_18 = class390_10.averageHeight((int) vector3_2.x + i_16, i_17 + (int) vector3_2.z);
            int i_19 = -i_11 / 2;
            int i_20 = i_11 / 2;
            int i_21 = class390_10.averageHeight((int) vector3_2.x + i_19, i_20 + (int) vector3_2.z);
            int i_22 = i_11 / 2;
            int i_23 = i_11 / 2;
            int i_24 = class390_10.averageHeight((int) vector3_2.x + i_22, (int) vector3_2.z + i_23);
            int i_25 = Math.min(i_15, i_18);
            int i_26 = Math.min(i_21, i_24);
            int i_27 = Math.min(i_18, i_24);
            int i_28 = Math.min(i_15, i_21);
            int i_29;
            if (i_11 != 0) {
                i_29 = (int) (Math.atan2(i_25 - i_26, i_11) * 2607.5945876176133D) & 0x3fff;
                if (i_29 != 0) {
                    matrix44var_6.rotation(1.0F, 0.0F, 0.0F, Class382.method6508(i_29));
                }
            }

            if (i_11 != 0) {
                i_29 = (int) (Math.atan2(i_28 - i_27, i_11) * 2607.5945876176133D) & 0x3fff;
                if (i_29 != 0) {
                    matrix44var_6.rotation(0.0F, 0.0F, 1.0F, Class382.method6508(-i_29));
                }
            }

            i_29 = i_15 + i_24;
            if (i_18 + i_21 < i_29) {
                i_29 = i_18 + i_21;
            }

            i_29 = (i_29 >> 1) - (int) vector3_2.y;
            if (i_29 != 0) {
                matrix44var_6.method5219(0.0F, i_29, 0.0F);
            }
        }

        vector3_2.pushVectorStack();
        Vector3 vector3_30 = method11166().coords;
        matrix44var_6.method5219(vector3_30.x, vector3_30.y - 10.0F, vector3_30.z);
        Class285 class285_31 = Class470.method7824(true);
        aBool10419 = false;
        anInt10418 = 0;
        MeshRasterizer meshrasterizer_32;
        if (-503986647 * anInt10415 * 100349465 != -1) {
            meshrasterizer_32 = IndexLoaders.ITEM_LOADER.getItemDefinitions(-503986647 * anInt10415 * 100349465).method7084(graphicalrenderer_1, 526336, anInt10412 * -1052106625 * -931815553, null, null, anInt10420 * -450257987 * 225048469, anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * anInt10413 * 1440872383, -359736537 * anInt10417 * 1371726999);
            if (meshrasterizer_32 != null) {
                meshrasterizer_32.method11282(matrix44var_6, boundingBoxPolygons[2], 0);
                aBool10419 |= meshrasterizer_32.i();
                anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
            }
        }

        if (anInt10411 * -1841858001 * 313920719 != -1) {
            meshrasterizer_32 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10411 * -1841858001 * 313920719).method7084(graphicalrenderer_1, 526336, 1089437631 * anInt10414 * 1305767999, null, null, 225048469 * anInt10420 * -450257987, -731570957 * anInt10421 * -1431655765 * 3 * -146187205, 1264449599 * anInt10413 * 1440872383, -359736537 * anInt10417 * 1371726999);
            if (meshrasterizer_32 != null) {
                meshrasterizer_32.method11282(matrix44var_6, boundingBoxPolygons[1], 0);
                aBool10419 |= meshrasterizer_32.i();
                if (meshrasterizer_32.n() > anInt10418 * -1885839727 * 599728753) {
                    anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
                }
            }
        }

        meshrasterizer_32 = IndexLoaders.ITEM_LOADER.getItemDefinitions(-876219087 * anInt10423 * -1511570479).method7084(graphicalrenderer_1, 526336, anInt10416 * 1423185937 * 513267953, null, null, 225048469 * anInt10420 * -450257987, anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * anInt10413 * 1440872383, -359736537 * anInt10417 * 1371726999);
        if (meshrasterizer_32 != null) {
            meshrasterizer_32.method11282(matrix44var_6, boundingBoxPolygons[0], 0);
            aBool10419 |= meshrasterizer_32.i();
            if (meshrasterizer_32.n() > 599728753 * anInt10418 * -1885839727) {
                anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
            }
        }

        return class285_31;
    }

    @Override
    Class285 method12989(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_2 = Vector3.popVectorStackTo(method11166().coords);
        Class208 class208_3 = aClass206_7970.method3507(plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9);
        SceneObjectNode sceneobjectnode_4 = aClass206_7970.getGroundDecoration(plane, (int) vector3_2.x >> 9, (int) vector3_2.z >> 9);
        int i_5 = 0;
        if (class208_3 != null && class208_3.aTransform_Sub1_Sub1_2659.aBool9459) {
            i_5 = class208_3.aTransform_Sub1_Sub1_2659.method12995();
        }

        if (sceneobjectnode_4 != null && sceneobjectnode_4.aShort9561 > -i_5) {
            i_5 = -sceneobjectnode_4.aShort9561;
        }

        if (i_5 != 1327971947 * anInt10422 * -460947901) {
            vector3_2.y += (i_5 - 1327971947 * anInt10422 * -460947901);
            method11171(vector3_2);
            anInt10422 = -460947901 * i_5 * 1327971947;
        }

        Matrix44Var matrix44var_6 = graphicalrenderer_1.method8450();
        matrix44var_6.method5212();
        if (anInt10422 * -460947901 * 1327971947 == 0) {
            boolean bool_7 = false;
            boolean bool_8 = false;
            boolean bool_9 = false;
            Ground class390_10 = aClass206_7970.aGroundArray2591[collisionPlane];
            int i_11 = 599728753 * anInt10418 * -1885839727 << 1;
            int i_13 = -i_11 / 2;
            int i_14 = -i_11 / 2;
            int i_15 = class390_10.averageHeight((int) vector3_2.x + i_13, (int) vector3_2.z + i_14);
            int i_16 = i_11 / 2;
            int i_17 = -i_11 / 2;
            int i_18 = class390_10.averageHeight((int) vector3_2.x + i_16, i_17 + (int) vector3_2.z);
            int i_19 = -i_11 / 2;
            int i_20 = i_11 / 2;
            int i_21 = class390_10.averageHeight((int) vector3_2.x + i_19, i_20 + (int) vector3_2.z);
            int i_22 = i_11 / 2;
            int i_23 = i_11 / 2;
            int i_24 = class390_10.averageHeight((int) vector3_2.x + i_22, (int) vector3_2.z + i_23);
            int i_25 = Math.min(i_15, i_18);
            int i_26 = Math.min(i_21, i_24);
            int i_27 = Math.min(i_18, i_24);
            int i_28 = Math.min(i_15, i_21);
            int i_29;
            if (i_11 != 0) {
                i_29 = (int) (Math.atan2(i_25 - i_26, i_11) * 2607.5945876176133D) & 0x3fff;
                if (i_29 != 0) {
                    matrix44var_6.rotation(1.0F, 0.0F, 0.0F, Class382.method6508(i_29));
                }
            }

            if (i_11 != 0) {
                i_29 = (int) (Math.atan2(i_28 - i_27, i_11) * 2607.5945876176133D) & 0x3fff;
                if (i_29 != 0) {
                    matrix44var_6.rotation(0.0F, 0.0F, 1.0F, Class382.method6508(-i_29));
                }
            }

            i_29 = i_15 + i_24;
            if (i_18 + i_21 < i_29) {
                i_29 = i_18 + i_21;
            }

            i_29 = (i_29 >> 1) - (int) vector3_2.y;
            if (i_29 != 0) {
                matrix44var_6.method5219(0.0F, i_29, 0.0F);
            }
        }

        vector3_2.pushVectorStack();
        Vector3 vector3_30 = method11166().coords;
        matrix44var_6.method5219(vector3_30.x, vector3_30.y - 10.0F, vector3_30.z);
        Class285 class285_31 = Class470.method7824(true);
        aBool10419 = false;
        anInt10418 = 0;
        MeshRasterizer meshrasterizer_32;
        if (-503986647 * anInt10415 * 100349465 != -1) {
            meshrasterizer_32 = IndexLoaders.ITEM_LOADER.getItemDefinitions(-503986647 * anInt10415 * 100349465).method7084(graphicalrenderer_1, 526336, anInt10412 * -1052106625 * -931815553, null, null, anInt10420 * -450257987 * 225048469, anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * anInt10413 * 1440872383, -359736537 * anInt10417 * 1371726999);
            if (meshrasterizer_32 != null) {
                meshrasterizer_32.method11282(matrix44var_6, boundingBoxPolygons[2], 0);
                aBool10419 |= meshrasterizer_32.i();
                anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
            }
        }

        if (anInt10411 * -1841858001 * 313920719 != -1) {
            meshrasterizer_32 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10411 * -1841858001 * 313920719).method7084(graphicalrenderer_1, 526336, 1089437631 * anInt10414 * 1305767999, null, null, 225048469 * anInt10420 * -450257987, -731570957 * anInt10421 * -1431655765 * 3 * -146187205, 1264449599 * anInt10413 * 1440872383, -359736537 * anInt10417 * 1371726999);
            if (meshrasterizer_32 != null) {
                meshrasterizer_32.method11282(matrix44var_6, boundingBoxPolygons[1], 0);
                aBool10419 |= meshrasterizer_32.i();
                if (meshrasterizer_32.n() > anInt10418 * -1885839727 * 599728753) {
                    anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
                }
            }
        }

        meshrasterizer_32 = IndexLoaders.ITEM_LOADER.getItemDefinitions(-876219087 * anInt10423 * -1511570479).method7084(graphicalrenderer_1, 526336, anInt10416 * 1423185937 * 513267953, null, null, 225048469 * anInt10420 * -450257987, anInt10421 * -1431655765 * 3 * -146187205 * -731570957, 1264449599 * anInt10413 * 1440872383, -359736537 * anInt10417 * 1371726999);
        if (meshrasterizer_32 != null) {
            meshrasterizer_32.method11282(matrix44var_6, boundingBoxPolygons[0], 0);
            aBool10419 |= meshrasterizer_32.i();
            if (meshrasterizer_32.n() > 599728753 * anInt10418 * -1885839727) {
                anInt10418 = meshrasterizer_32.n() * -1885839727 * 599728753;
            }
        }

        return class285_31;
    }

    @Override
    void method13012(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    void method13023(AbstractRenderer graphicalrenderer_1) {
    }

    @Override
    boolean method13020(AbstractRenderer graphicalrenderer_1, int i_2, int i_3) {
        Matrix44Var matrix44var_4 = graphicalrenderer_1.method8450();
        matrix44var_4.method5210(method11166());
        matrix44var_4.method5219(0.0F, -10.0f, 0.0F);
        MeshRasterizer meshrasterizer_5 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10423 * -1511570479 * -876219087).method7084(graphicalrenderer_1, 131072, anInt10416 * 1423185937 * 513267953, null, null, 0, 0, 0, 0);
        if (meshrasterizer_5 != null && meshrasterizer_5.method11270(i_2, i_3, matrix44var_4, true, 0)) {
            return true;
        } else {
            if (anInt10411 * -1841858001 * 313920719 != -1) {
                meshrasterizer_5 = IndexLoaders.ITEM_LOADER.getItemDefinitions(313920719 * anInt10411 * -1841858001).method7084(graphicalrenderer_1, 131072, 1089437631 * anInt10414 * 1305767999, null, null, 0, 0, 0, 0);
                if (meshrasterizer_5 != null && meshrasterizer_5.method11270(i_2, i_3, matrix44var_4, true, 0)) {
                    return true;
                }
            }

            if (anInt10415 * 100349465 * -503986647 != -1) {
                meshrasterizer_5 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10415 * 100349465 * -503986647).method7084(graphicalrenderer_1, 131072, anInt10412 * -1052106625 * -931815553, null, null, 0, 0, 0, 0);
                return meshrasterizer_5 != null && meshrasterizer_5.method11270(i_2, i_3, matrix44var_4, true, 0);
            }

            return false;
        }
    }

    @Override
    public Class200 method13018(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    public Class200 method12993(AbstractRenderer graphicalrenderer_1) {
        return null;
    }

    @Override
    Class285 method12990(AbstractRenderer graphicalrenderer_1) {
        Vector3 vector3_3 = Vector3.popVectorStackTo(method11166().coords);
        Class208 class208_4 = aClass206_7970.method3507(plane, (int) vector3_3.x >> 9, (int) vector3_3.z >> 9);
        SceneObjectNode sceneobjectnode_5 = aClass206_7970.getGroundDecoration(plane, (int) vector3_3.x >> 9, (int) vector3_3.z >> 9);
        int i_6 = 0;
        if (class208_4 != null && class208_4.aTransform_Sub1_Sub1_2659.aBool9459) {
            i_6 = class208_4.aTransform_Sub1_Sub1_2659.method12995();
        }

        if (sceneobjectnode_5 != null && sceneobjectnode_5.aShort9561 > -i_6) {
            i_6 = -sceneobjectnode_5.aShort9561;
        }

        if (i_6 != anInt10422) {
            vector3_3.y += (i_6 - anInt10422);
            method11171(vector3_3);
            anInt10422 = i_6;
        }

        Matrix44Var matrix44var_7 = graphicalrenderer_1.method8450();
        matrix44var_7.method5212();
        if (anInt10422 == 0) {
            boolean bool_8 = false;
            boolean bool_9 = false;
            boolean bool_10 = false;
            Ground class390_11 = aClass206_7970.aGroundArray2591[collisionPlane];
            int i_12 = anInt10418 << 1;
            int i_14 = -i_12 / 2;
            int i_15 = -i_12 / 2;
            int i_16 = class390_11.averageHeight(i_14 + (int) vector3_3.x, i_15 + (int) vector3_3.z);
            int i_17 = i_12 / 2;
            int i_18 = -i_12 / 2;
            int i_19 = class390_11.averageHeight(i_17 + (int) vector3_3.x, i_18 + (int) vector3_3.z);
            int i_20 = -i_12 / 2;
            int i_21 = i_12 / 2;
            int i_22 = class390_11.averageHeight(i_20 + (int) vector3_3.x, i_21 + (int) vector3_3.z);
            int i_23 = i_12 / 2;
            int i_24 = i_12 / 2;
            int i_25 = class390_11.averageHeight(i_23 + (int) vector3_3.x, i_24 + (int) vector3_3.z);
            int i_26 = Math.min(i_16, i_19);
            int i_27 = Math.min(i_22, i_25);
            int i_28 = Math.min(i_19, i_25);
            int i_29 = Math.min(i_16, i_22);
            int i_30;
            if (i_12 != 0) {
                i_30 = (int) (Math.atan2(i_26 - i_27, i_12) * 2607.5945876176133D) & 0x3fff;
                if (i_30 != 0) {
                    matrix44var_7.rotation(1.0F, 0.0F, 0.0F, Class382.method6508(i_30));
                }
            }

            if (i_12 != 0) {
                i_30 = (int) (Math.atan2(i_29 - i_28, i_12) * 2607.5945876176133D) & 0x3fff;
                if (i_30 != 0) {
                    matrix44var_7.rotation(0.0F, 0.0F, 1.0F, Class382.method6508(-i_30));
                }
            }

            i_30 = i_16 + i_25;
            if (i_19 + i_22 < i_30) {
                i_30 = i_19 + i_22;
            }

            i_30 = (i_30 >> 1) - (int) vector3_3.y;
            if (i_30 != 0) {
                matrix44var_7.method5219(0.0F, i_30, 0.0F);
            }
        }

        vector3_3.pushVectorStack();
        Vector3 vector3_31 = method11166().coords;
        matrix44var_7.method5219(vector3_31.x, vector3_31.y - 10.0F, vector3_31.z);
        Class285 class285_32 = Class470.method7824(true);
        aBool10419 = false;
        anInt10418 = 0;
        MeshRasterizer meshrasterizer_33;
        if (anInt10415 != -1) {
            meshrasterizer_33 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10415).method7084(graphicalrenderer_1, 526336, anInt10412, null, null, anInt10420, anInt10421, anInt10413, anInt10417);
            if (meshrasterizer_33 != null) {
                meshrasterizer_33.method11282(matrix44var_7, boundingBoxPolygons[2], 0);
                aBool10419 |= meshrasterizer_33.i();
                anInt10418 = meshrasterizer_33.n();
            }
        }

        if (anInt10411 != -1) {
            meshrasterizer_33 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10411).method7084(graphicalrenderer_1, 526336, anInt10414, null, null, anInt10420, anInt10421, anInt10413, anInt10417);
            if (meshrasterizer_33 != null) {
                meshrasterizer_33.method11282(matrix44var_7, boundingBoxPolygons[1], 0);
                aBool10419 |= meshrasterizer_33.i();
                if (meshrasterizer_33.n() > anInt10418) {
                    anInt10418 = meshrasterizer_33.n();
                }
            }
        }

        meshrasterizer_33 = IndexLoaders.ITEM_LOADER.getItemDefinitions(anInt10423).method7084(graphicalrenderer_1, 526336, anInt10416, null, null, anInt10420, anInt10421, anInt10413, anInt10417);
        if (meshrasterizer_33 != null) {
            meshrasterizer_33.method11282(matrix44var_7, boundingBoxPolygons[0], 0);
            aBool10419 |= meshrasterizer_33.i();
            if (meshrasterizer_33.n() > anInt10418) {
                anInt10418 = meshrasterizer_33.n();
            }
        }

        return class285_32;
    }

}
