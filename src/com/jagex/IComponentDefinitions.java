package com.jagex;

public class IComponentDefinitions {

    public static int anInt1283;
    public static int anInt1373 = 1;
    public static int anInt1265 = 2;
    public static int CONTENT_TYPE_328 = 328;
    public static int CONTENT_TYPE_1337 = 1337;
    public static int CONTENT_TYPE_1403 = 1403;
    public static int CONTENT_TYPE_1338 = 1338;
    public static int CONTENT_TYPE_1339 = 1339;
    public static int CONTENT_TYPE_1400 = 1400;
    public static int MINIMAP = 1401;
    public static int DEBUG_INFORMATION = 1405;
    public static int CONTENT_TYPE_1406 = 1406;
    public static int CONTENT_TYPE_1407 = 1407;
    public static int CONTENT_TYPE_1408 = 1408;
    public static int CONTENT_TYPE_1409 = 1409;
    public static LRUCache aClass229_1280 = new LRUCache(3000000, 200);
    public static LRUCache aClass229_1341 = new LRUCache(50);
    public static boolean aBool1399;
    static LRUCache aClass229_1303 = new LRUCache(8);
    static LRUCache aClass229_1282 = new LRUCache(4);
    public int modelTintBlue;
    public NPCMeshModifier npcMeshModifier;
    public int modelTintRed;
    public int modelTintGreen;
    public int modelTintScalar;
    public Object[] anObjectArray1407;
    public int[] anIntArray1408;
    public int serverTriggers;
    public Object[] anObjectArray1418;
    public int[] anIntArray1425;
    public int anInt1430;
    public int anInt1431;
    public int anInt1432;
    public int anInt1433;
    public int anInt1434;
    public Animation anim;
    public IComponentDefinitions[] slotChildren;
    public IComponentDefinitions[] itemSlots;
    public ComponentType type;
    public String name;
    public int contentType;
    public int basePositionX;
    public int basePositionY;
    public int baseWidth;
    public int baseHeight;
    public byte aspectWidthType;
    public byte aspectHeightType;
    public byte aspectXType;
    public byte aspectYType;
    public int parent = -1;
    public boolean hidden;
    public int scrollWidth;
    public int scrollHeight;
    public boolean noClickThrough;
    public int spriteId = -1;
    public int angle2d;
    public ModelType modelType = ModelType.RAW_MODEL;
    public int modelId;
    public boolean tiling;
    public int fontId = -1;
    public String text = "";
    public int color;
    public boolean alpha;
    public int transparency;
    public int borderThickness;
    public int spriteShadow;
    public int anInt1358;
    public int textHorizontalAli;
    public int textVerticalAli;
    public int lineWidth = 1;
    public boolean hasOrigin;
    public boolean monospaced = true;
    public boolean filled;
    public byte[][] aByteArrayArray1366;
    public byte[][] aByteArrayArray1367;
    public int[] anIntArray1395;
    public int[] anIntArray1267;
    public String useOnName;
    public boolean vFlip;
    public boolean shadow;
    public boolean lineDirection;
    public String[] optionNames;
    public boolean usesOrthogonal;
    public int maxTextLines;
    public int[] opCursors;
    public boolean hFlip;
    public String opName;
    public boolean aBool1345;
    public boolean aBool1424;
    public int anInt1380;
    public int anInt1381;
    public int anInt1382;
    public String useOptionString;
    public int originX;
    public int originY;
    public int spritePitch;
    public int spriteRoll;
    public int spriteYaw;
    public int spriteScale = 100;
    public boolean clickMask = true;
    public int originZ;
    public int animation;
    public int targetOverCursor = -1;
    public int mouseOverCursor = -1;
    public IFTargetParams targetParams;
    public int aspectWidth;
    public int targetLeaveCursor = -1;
    public Object[] onLoadScript;
    public Object[] onMouseHoverScript;
    public Object[] onMouseLeaveScript;
    public Object[] anObjectArray1396;
    public Object[] anObjectArray1400;
    public Object[] anObjectArray1397;
    public Object[] mouseLeaveScript;
    public Object[] anObjectArray1387;
    public Object[] anObjectArray1409;
    public Object[] params;
    public int aspectHeight;
    public Object[] anObjectArray1393;
    public Object[] popupScript;
    public Object[] anObjectArray1386;
    public Object[] anObjectArray1319;
    public Object[] anObjectArray1302;
    public Object[] anObjectArray1389;
    public Object[] anObjectArray1451;
    public Object[] anObjectArray1394;
    public Object[] anObjectArray1412;
    public Object[] anObjectArray1403;
    public Object[] anObjectArray1405;
    public int[] varps;
    public int[] mouseLeaveArrayParam;
    public int[] anIntArray1402;
    public int[] anIntArray1315;
    public int[] anIntArray1406;
    public Object[] anObjectArray1413;
    public Object[] anObjectArray1292;
    public Object[] anObjectArray1415;
    public Object[] anObjectArray1416;
    public Object[] anObjectArray1383;
    public Object[] anObjectArray1419;
    public Object[] anObjectArray1361;
    public Object[] anObjectArray1421;
    public Object[] anObjectArray1346;
    public Object[] anObjectArray1353;
    public Object[] anObjectArray1271;
    public boolean usesScripts;
    public ParticleSystem particleSystem;
    public int idHash = -1;
    public int slotId = -1;
    public int x;
    public int y;
    public int width;
    public int height;
    public int aspectX = 1;
    public int aspectY = 1;
    public int scrollX;
    public int scrollY;
    public int anInt1339 = -1;
    public int offsetX;
    public int offsetY;
    public int renderStack = 2;
    public boolean textAntiMacro;
    public int anInt1378;
    public IComponentDefinitions aClass118_1379;
    public int containerItemId;
    public int anInt1427;
    public boolean wearCol;
    public int anInt1404;
    public int anInt1435;
    public boolean aBool1440;
    public boolean aBool1286;
    public int anInt1442;
    public int anInt1443;
    public int anInt1444;
    public int anInt1445;
    public int anInt1446;
    public int anInt1447;
    public int anInt1448;
    public int anInt1449;
    public int anInt1450;
    IterableNodeMap aClass465_1365;
    short[] colorsToReplace;
    short[] colorsToReplaceWith;
    short[] texturesToReplace;
    short[] texturesToReplaceWith;

    public IComponentDefinitions() {
        targetParams = IFTargetParams.DEFAULT_SETTINGS;
        aBool1424 = false;
        useOnName = "";
        anInt1378 = -1;
        aClass118_1379 = null;
        anInt1380 = 0;
        anInt1381 = 0;
        anInt1382 = anInt1283;
        useOptionString = "";
        usesScripts = false;
        containerItemId = -1;
        anInt1427 = 0;
        wearCol = false;
        anInt1404 = -1;
        anInt1435 = -1;
        animation = -1;
        aBool1440 = false;
        aBool1286 = false;
        anInt1442 = -1;
        anInt1443 = 0;
        anInt1444 = 0;
        anInt1445 = 0;
        anInt1446 = 0;
        anInt1447 = 0;
        anInt1448 = 0;
        anInt1449 = -1;
        anInt1450 = -1;
    }

    public static IComponentDefinitions getDefs(int hash) {
        int interfaceId = hash >> 16;
        if (CustomCursorsPreference.INTERFACES[interfaceId] == null || CustomCursorsPreference.INTERFACES[interfaceId].getComponent(hash) == null) {
            boolean bool_3 = MovingAnimation.isInterfaceLoaded(interfaceId, null);
            if (!bool_3) {
                return null;
            }
        }
        return CustomCursorsPreference.INTERFACES[interfaceId].getComponent(hash);
    }

    void readValues(ByteBuf rsbytebuffer_1) {
        int i_3 = rsbytebuffer_1.readUnsignedByte();
        if (i_3 == 255) {
            i_3 = -1;
        }
        int typeId = rsbytebuffer_1.readUnsignedByte();
        if ((typeId & 0x80) != 0) {
            typeId &= 0x7f;
            name = rsbytebuffer_1.readString();
        }
        type = ComponentType.forId(typeId);
        contentType = rsbytebuffer_1.readUnsignedShort();
        basePositionX = rsbytebuffer_1.readShort();
        basePositionY = rsbytebuffer_1.readShort();
        baseWidth = rsbytebuffer_1.readUnsignedShort();
        baseHeight = rsbytebuffer_1.readUnsignedShort();
        aspectWidthType = rsbytebuffer_1.readByte();
        aspectHeightType = rsbytebuffer_1.readByte();
        aspectXType = rsbytebuffer_1.readByte();
        aspectYType = rsbytebuffer_1.readByte();
        parent = rsbytebuffer_1.readUnsignedShort();
        if (parent == 65535) {
            parent = -1;
        } else {
            parent += idHash & -65536;
        }
        int i_4 = rsbytebuffer_1.readUnsignedByte();
        hidden = (i_4 & 0x1) != 0;
        if (i_3 >= 0) {
            noClickThrough = (i_4 & 0x2) != 0;
        }
        if (type == ComponentType.CONTAINER) {
            scrollWidth = rsbytebuffer_1.readUnsignedShort();
            scrollHeight = rsbytebuffer_1.readUnsignedShort();
            if (i_3 < 0) {
                noClickThrough = rsbytebuffer_1.readUnsignedByte() == 1;
            }
        }
        if (type == ComponentType.SPRITE) {
            spriteId = rsbytebuffer_1.readInt();
            angle2d = rsbytebuffer_1.readUnsignedShort();
            int flag2 = rsbytebuffer_1.readUnsignedByte();
            tiling = (flag2 & 0x1) != 0;
            alpha = (flag2 & 0x2) != 0;
            transparency = rsbytebuffer_1.readUnsignedByte();
            borderThickness = rsbytebuffer_1.readUnsignedByte();
            spriteShadow = rsbytebuffer_1.readInt();
            vFlip = rsbytebuffer_1.readUnsignedByte() == 1;
            hFlip = rsbytebuffer_1.readUnsignedByte() == 1;
            color = rsbytebuffer_1.readInt();
            if (i_3 >= 3) {
                clickMask = rsbytebuffer_1.readUnsignedByte() == 1;
            }
        }
        if (type == ComponentType.MODEL) {
            modelType = ModelType.RAW_MODEL;
            modelId = rsbytebuffer_1.readBigSmart();
            int flag2 = rsbytebuffer_1.readUnsignedByte();
            boolean bool_6 = (flag2 & 0x1) == 1;
            hasOrigin = (flag2 & 0x2) == 2;
            usesOrthogonal = (flag2 & 0x4) == 4;
            aBool1345 = (flag2 & 0x8) == 8;
            if (bool_6) {
                originX = rsbytebuffer_1.readShort();
                originY = rsbytebuffer_1.readShort();
                spritePitch = rsbytebuffer_1.readUnsignedShort();
                spriteRoll = rsbytebuffer_1.readUnsignedShort();
                spriteYaw = rsbytebuffer_1.readUnsignedShort();
                spriteScale = rsbytebuffer_1.readUnsignedShort();
            } else if (hasOrigin) {
                originX = rsbytebuffer_1.readShort();
                originY = rsbytebuffer_1.readShort();
                originZ = rsbytebuffer_1.readShort();
                spritePitch = rsbytebuffer_1.readUnsignedShort();
                spriteRoll = rsbytebuffer_1.readUnsignedShort();
                spriteYaw = rsbytebuffer_1.readUnsignedShort();
                spriteScale = rsbytebuffer_1.readShort();
            }
            animation = rsbytebuffer_1.readBigSmart();
            if (aspectWidthType != 0) {
                aspectWidth = rsbytebuffer_1.readUnsignedShort();
            }
            if (aspectHeightType != 0) {
                aspectHeight = rsbytebuffer_1.readUnsignedShort();
            }
        }
        if (type == ComponentType.TEXT) {
            fontId = rsbytebuffer_1.readBigSmart();
            if (i_3 >= 2) {
                monospaced = rsbytebuffer_1.readUnsignedByte() == 1;
            }
            text = rsbytebuffer_1.readString();
            if (text.toLowerCase().contains("runescape")) {
                text = text.replace("runescape", "Darkan");
                text = text.replace("RuneScape", "Darkan");
                text = text.replace("Runescape", "Darkan");
            }
            anInt1358 = rsbytebuffer_1.readUnsignedByte();
            textHorizontalAli = rsbytebuffer_1.readUnsignedByte();
            textVerticalAli = rsbytebuffer_1.readUnsignedByte();
            shadow = rsbytebuffer_1.readUnsignedByte() == 1;
            color = rsbytebuffer_1.readInt();
            transparency = rsbytebuffer_1.readUnsignedByte();
            if (i_3 >= 0) {
                maxTextLines = rsbytebuffer_1.readUnsignedByte();
            }
        }
        if (type == ComponentType.FIGURE) {
            color = rsbytebuffer_1.readInt();
            filled = rsbytebuffer_1.readUnsignedByte() == 1;
            transparency = rsbytebuffer_1.readUnsignedByte();
        }
        if (type == ComponentType.LINE) {
            lineWidth = rsbytebuffer_1.readUnsignedByte();
            color = rsbytebuffer_1.readInt();
            lineDirection = rsbytebuffer_1.readUnsignedByte() == 1;
        }
        int optionMask = rsbytebuffer_1.read24BitUnsignedInteger();
        int i_16 = rsbytebuffer_1.readUnsignedByte();
        int i_7;
        if (i_16 != 0) {
            aByteArrayArray1366 = new byte[11][];
            aByteArrayArray1367 = new byte[11][];
            anIntArray1395 = new int[11];
            for (anIntArray1267 = new int[11]; i_16 != 0; i_16 = rsbytebuffer_1.readUnsignedByte()) {
                i_7 = (i_16 >> 4) - 1;
                i_16 = i_16 << 8 | rsbytebuffer_1.readUnsignedByte();
                i_16 &= 0xfff;
                if (i_16 == 4095) {
                    i_16 = -1;
                }
                byte b_8 = rsbytebuffer_1.readByte();
                if (b_8 != 0) {
                    aBool1424 = true;
                }
                byte b_9 = rsbytebuffer_1.readByte();
                anIntArray1395[i_7] = i_16;
                aByteArrayArray1366[i_7] = new byte[]{b_8};
                aByteArrayArray1367[i_7] = new byte[]{b_9};
            }
        }
        useOnName = rsbytebuffer_1.readString();
        i_7 = rsbytebuffer_1.readUnsignedByte();
        int i_17 = i_7 & 0xf;
        int i_18 = i_7 >> 4;
        int i_10;
        if (i_17 > 0) {
            optionNames = new String[i_17];
            for (i_10 = 0; i_10 < i_17; i_10++) {
                optionNames[i_10] = rsbytebuffer_1.readString();
            }
        }
        int i_11;
        if (i_18 > 0) {
            i_10 = rsbytebuffer_1.readUnsignedByte();
            opCursors = new int[i_10 + 1];
            for (i_11 = 0; i_11 < opCursors.length; i_11++) {
                opCursors[i_11] = -1;
            }
            opCursors[i_10] = rsbytebuffer_1.readUnsignedShort();
        }
        if (i_18 > 1) {
            i_10 = rsbytebuffer_1.readUnsignedByte();
            opCursors[i_10] = rsbytebuffer_1.readUnsignedShort();
        }
        opName = rsbytebuffer_1.readString();
        if (opName.isEmpty()) {
            opName = null;
        }
        anInt1380 = rsbytebuffer_1.readUnsignedByte();
        anInt1381 = rsbytebuffer_1.readUnsignedByte();
        anInt1382 = rsbytebuffer_1.readUnsignedByte();
        useOptionString = rsbytebuffer_1.readString();
        i_10 = -1;
        if (IFTargetParams.getUseOptionFlags(optionMask) != 0) {
            i_10 = rsbytebuffer_1.readUnsignedShort();
            if (i_10 == 65535) {
                i_10 = -1;
            }
            targetOverCursor = rsbytebuffer_1.readUnsignedShort();
            if (targetOverCursor == 65535) {
                targetOverCursor = -1;
            }
            targetLeaveCursor = rsbytebuffer_1.readUnsignedShort();
            if (targetLeaveCursor == 65535) {
                targetLeaveCursor = -1;
            }
        }
        if (i_3 >= 0) {
            mouseOverCursor = rsbytebuffer_1.readUnsignedShort();
            if (mouseOverCursor == 65535) {
                mouseOverCursor = -1;
            }
        }
        targetParams = new IFTargetParams(optionMask, i_10);
        if (i_3 >= 0) {
            i_11 = rsbytebuffer_1.readUnsignedByte();
            int i_12;
            int i_13;
            int i_14;
            for (i_12 = 0; i_12 < i_11; i_12++) {
                i_13 = rsbytebuffer_1.read24BitUnsignedInteger();
                i_14 = rsbytebuffer_1.readInt();
                aClass465_1365.put(new IntNode(i_14), i_13);
            }
            i_12 = rsbytebuffer_1.readUnsignedByte();
            for (i_13 = 0; i_13 < i_12; i_13++) {
                i_14 = rsbytebuffer_1.read24BitUnsignedInteger();
                String string_15 = rsbytebuffer_1.readGJString();
                aClass465_1365.put(new ObjectNode(string_15), i_14);
            }
        }
        onLoadScript = decodeScript(rsbytebuffer_1);
        onMouseHoverScript = decodeScript(rsbytebuffer_1);
        onMouseLeaveScript = decodeScript(rsbytebuffer_1);
        anObjectArray1396 = decodeScript(rsbytebuffer_1);
        anObjectArray1400 = decodeScript(rsbytebuffer_1);
        anObjectArray1397 = decodeScript(rsbytebuffer_1);
        mouseLeaveScript = decodeScript(rsbytebuffer_1);
        anObjectArray1387 = decodeScript(rsbytebuffer_1);
        anObjectArray1409 = decodeScript(rsbytebuffer_1);
        params = decodeScript(rsbytebuffer_1);
        if (i_3 >= 0) {
            anObjectArray1393 = decodeScript(rsbytebuffer_1);
        }
        popupScript = decodeScript(rsbytebuffer_1);
        anObjectArray1386 = decodeScript(rsbytebuffer_1);
        anObjectArray1319 = decodeScript(rsbytebuffer_1);
        anObjectArray1302 = decodeScript(rsbytebuffer_1);
        anObjectArray1389 = decodeScript(rsbytebuffer_1);
        anObjectArray1451 = decodeScript(rsbytebuffer_1);
        anObjectArray1394 = decodeScript(rsbytebuffer_1);
        anObjectArray1412 = decodeScript(rsbytebuffer_1);
        anObjectArray1403 = decodeScript(rsbytebuffer_1);
        anObjectArray1405 = decodeScript(rsbytebuffer_1);
        varps = decodeScript3(rsbytebuffer_1);
        mouseLeaveArrayParam = decodeScript3(rsbytebuffer_1);
        anIntArray1402 = decodeScript3(rsbytebuffer_1);
        anIntArray1315 = decodeScript3(rsbytebuffer_1);
        anIntArray1406 = decodeScript3(rsbytebuffer_1);
    }

    int[] decodeScript3(ByteBuf rsbytebuffer_1) {
        int i_3 = rsbytebuffer_1.readUnsignedByte();
        if (i_3 == 0) {
            return null;
        } else {
            int[] ints_4 = new int[i_3];
            for (int i_5 = 0; i_5 < i_3; i_5++) {
                ints_4[i_5] = rsbytebuffer_1.readInt();
            }
            return ints_4;
        }
    }

    public void method1987() {
        onLoadScript = null;
        anObjectArray1386 = null;
        anObjectArray1319 = null;
        anObjectArray1302 = null;
        anObjectArray1389 = null;
        onMouseHoverScript = null;
        popupScript = null;
        onMouseLeaveScript = null;
        anObjectArray1451 = null;
        anObjectArray1394 = null;
        anObjectArray1400 = null;
        anObjectArray1396 = null;
        anObjectArray1397 = null;
        varps = null;
        mouseLeaveScript = null;
        mouseLeaveArrayParam = null;
        anObjectArray1387 = null;
        anIntArray1402 = null;
        anObjectArray1403 = null;
        anIntArray1315 = null;
        anObjectArray1405 = null;
        anIntArray1406 = null;
        anObjectArray1409 = null;
        params = null;
        anObjectArray1393 = null;
        anObjectArray1412 = null;
        anObjectArray1413 = null;
        anObjectArray1292 = null;
        anObjectArray1415 = null;
        anObjectArray1416 = null;
        anObjectArray1383 = null;
        anObjectArray1419 = null;
        anObjectArray1361 = null;
        anObjectArray1421 = null;
        anObjectArray1346 = null;
        anObjectArray1353 = null;
        anObjectArray1271 = null;
    }

    public FontRenderer method1988(Class378 class378_1, Interface35 interface35_2) {
        FontRenderer fontrenderer_4 = (FontRenderer) class378_1.method6426(interface35_2, fontId, false, monospaced);
        aBool1399 = fontrenderer_4 == null;
        return fontrenderer_4;
    }

    public FontMetrics method1989(Class378 class378_1, Interface35 interface35_2) {
        FontMetrics fontmetrics_4 = class378_1.method6415(interface35_2, fontId);
        aBool1399 = fontmetrics_4 == null;
        return fontmetrics_4;
    }

    Object[] decodeScript(ByteBuf rsbytebuffer_1) {
        int i_3 = rsbytebuffer_1.readUnsignedByte();
        if (i_3 == 0) {
            return null;
        } else {
            Object[] arr_4 = new Object[i_3];
            for (int i_5 = 0; i_5 < i_3; i_5++) {
                int i_6 = rsbytebuffer_1.readUnsignedByte();
                if (i_6 == 0) {
                    arr_4[i_5] = new Integer(rsbytebuffer_1.readInt());
                } else if (i_6 == 1) {
                    arr_4[i_5] = rsbytebuffer_1.readString();
                }
            }
            usesScripts = true;
            return arr_4;
        }
    }

    public void method1991(AbstractRenderer graphicalrenderer_1, MeshRasterizer meshrasterizer_2, Matrix44Var matrix44var_3, int i_4) {
        meshrasterizer_2.method11273(matrix44var_3);
        ParticleEmitterConfig[] arr_6 = meshrasterizer_2.method11253();
        SurfaceSkin[] arr_7 = meshrasterizer_2.method11274();
        if ((particleSystem == null || particleSystem.aBool7132) && (arr_6 != null || arr_7 != null)) {
            particleSystem = ParticleSystem.method11557(i_4, false);
        }
        if (particleSystem != null) {
            particleSystem.method11511(graphicalrenderer_1, i_4, arr_6, arr_7);
        }
    }

    public void method1994(int i_1, String string_2) {
        if (optionNames == null || optionNames.length <= i_1) {
            String[] arr_4 = new String[i_1 + 1];
            if (optionNames != null) {
                System.arraycopy(optionNames, 0, arr_4, 0, optionNames.length);
            }
            optionNames = arr_4;
        }
        optionNames[i_1] = string_2;
    }

    public void method1995(int i_1) {
        if (aClass465_1365 != null) {
            Node node_3 = aClass465_1365.get(i_1);
            if (node_3 != null) {
                node_3.unlink();
            }
        }
    }

    public int method1997(int i_1, int i_2) {
        if (aClass465_1365 == null) {
            return i_2;
        } else {
            IntNode class282_sub38_4 = (IntNode) aClass465_1365.get(i_1);
            return class282_sub38_4 == null ? i_2 : class282_sub38_4.value;
        }
    }

    public String method1998(int i_1, String string_2) {
        if (aClass465_1365 == null) {
            return string_2;
        } else {
            ObjectNode class282_sub47_4 = (ObjectNode) aClass465_1365.get(i_1);
            return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
        }
    }

    public void method1999(int i_1, int i_2) {
        if (aClass465_1365 == null) {
            aClass465_1365 = new IterableNodeMap(16);
            aClass465_1365.put(new IntNode(i_2), i_1);
        } else {
            IntNode class282_sub38_4 = (IntNode) aClass465_1365.get(i_1);
            if (class282_sub38_4 == null) {
                aClass465_1365.put(new IntNode(i_2), i_1);
            } else {
                class282_sub38_4.value = i_2;
            }
        }
    }

    public void method2000(int i_1, String string_2) {
        if (aClass465_1365 == null) {
            aClass465_1365 = new IterableNodeMap(16);
        } else {
            ObjectNode class282_sub47_4 = (ObjectNode) aClass465_1365.get(i_1);
            if (class282_sub47_4 != null) {
                class282_sub47_4.unlink();
            }
        }
        aClass465_1365.put(new ObjectNode(string_2), i_1);
    }

    public MeshRasterizer method2002(AbstractRenderer graphicalrenderer_1, int i_2, RenderAnimIndexLoader renderanimindexloader_3, IdentiKitIndexLoader class31_4, NPCIndexLoader npcindexloader_5, ItemIndexLoader itemindexloader_6, VarProvider interface42_8, Animation animation_9, PlayerModel playerappearance_10) {
        aBool1399 = false;
        if (modelType == ModelType.NONE) {
            return null;
        } else if (modelType == ModelType.RAW_MODEL && modelId == -1) {
            return null;
        } else if (modelType == ModelType.RAW_MODEL) {
            if (animation_9 != null) {
                i_2 |= animation_9.method7640();
            }
            long long_13 = -1L;
            long[] longs_26 = ByteBuf.aLongArray7979;
            int i_16;
            if (colorsToReplace != null) {
                for (i_16 = 0; i_16 < colorsToReplace.length; i_16++) {
                    long_13 = long_13 >>> 8 ^ longs_26[(int) ((long_13 ^ (colorsToReplace[i_16] >> 8)) & 0xffL)];
                    long_13 = long_13 >>> 8 ^ longs_26[(int) ((long_13 ^ colorsToReplace[i_16]) & 0xffL)];
                    long_13 = long_13 >>> 8 ^ longs_26[(int) ((long_13 ^ (colorsToReplaceWith[i_16] >> 8)) & 0xffL)];
                    long_13 = long_13 >>> 8 ^ longs_26[(int) ((long_13 ^ colorsToReplaceWith[i_16]) & 0xffL)];
                }
                i_2 |= 0x4000;
            }
            if (texturesToReplace != null) {
                for (i_16 = 0; i_16 < texturesToReplace.length; i_16++) {
                    long_13 = long_13 >>> 8 ^ longs_26[(int) ((long_13 ^ (texturesToReplace[i_16] >> 8)) & 0xffL)];
                    long_13 = long_13 >>> 8 ^ longs_26[(int) ((long_13 ^ texturesToReplace[i_16]) & 0xffL)];
                    long_13 = long_13 >>> 8 ^ longs_26[(int) ((long_13 ^ (texturesToReplaceWith[i_16] >> 8)) & 0xffL)];
                    long_13 = long_13 >>> 8 ^ longs_26[(int) ((long_13 ^ texturesToReplaceWith[i_16]) & 0xffL)];
                }
                i_2 |= 0x8000;
            }
            long long_21 = (long) graphicalrenderer_1.rendererId << 59 | (long) modelType.getId() << 54 | (long) modelId << 38 | long_13 & 0x3fffffffffL;
            MeshRasterizer meshrasterizer_18 = (MeshRasterizer) aClass229_1341.get(long_21);
            if (meshrasterizer_18 == null || graphicalrenderer_1.method8452(meshrasterizer_18.m(), i_2) != 0) {
                if (meshrasterizer_18 != null) {
                    i_2 = graphicalrenderer_1.method8546(i_2, meshrasterizer_18.m());
                }
                RSMesh rsmesh_19 = RSMesh.decodeMesh(Class488.MESH_INDEX, modelId);
                if (rsmesh_19 == null) {
                    aBool1399 = true;
                    return null;
                }
                if (rsmesh_19.version < 13) {
                    rsmesh_19.upscale();
                }
                meshrasterizer_18 = graphicalrenderer_1.createMeshRasterizer(rsmesh_19, i_2, Node_Sub14.anInt7597, 64, 768);
                int i_20;
                if (colorsToReplace != null) {
                    for (i_20 = 0; i_20 < colorsToReplace.length; i_20++) {
                        meshrasterizer_18.X(colorsToReplace[i_20], colorsToReplaceWith[i_20]);
                    }
                }
                if (texturesToReplace != null) {
                    for (i_20 = 0; i_20 < texturesToReplace.length; i_20++) {
                        meshrasterizer_18.W(texturesToReplace[i_20], texturesToReplaceWith[i_20]);
                    }
                }
                aClass229_1341.put(meshrasterizer_18, long_21);
            }
            if (animation_9 != null) {
                meshrasterizer_18 = meshrasterizer_18.method11289((byte) 1, i_2, true);
                animation_9.rasterize(meshrasterizer_18, 0);
            }
            meshrasterizer_18.KA(i_2);
            return meshrasterizer_18;
        } else {
            MeshRasterizer meshrasterizer_23;
            if (modelType == ModelType.NPC_HEAD) {
                meshrasterizer_23 = npcindexloader_5.getNPCType(modelId).renderHead(graphicalrenderer_1, i_2, interface42_8, animation_9, npcMeshModifier);
                if (meshrasterizer_23 == null) {
                    aBool1399 = true;
                    return null;
                } else {
                    return meshrasterizer_23;
                }
            } else if (modelType == ModelType.PLAYER_HEAD) {
                if (playerappearance_10 == null) {
                    return null;
                } else {
                    meshrasterizer_23 = playerappearance_10.method4021(graphicalrenderer_1, i_2, class31_4, npcindexloader_5, itemindexloader_6, interface42_8, animation_9);
                    if (meshrasterizer_23 == null) {
                        aBool1399 = true;
                        return null;
                    } else {
                        return meshrasterizer_23;
                    }
                }
            } else if (modelType == ModelType.ITEM) {
                ItemDefinitions itemdefinitions_27 = itemindexloader_6.getItemDefinitions(modelId);
                MeshRasterizer meshrasterizer_24 = itemdefinitions_27.method7084(graphicalrenderer_1, i_2, 10, playerappearance_10, animation_9, 0, 0, 0, 0);
                if (meshrasterizer_24 == null) {
                    aBool1399 = true;
                    return null;
                } else {
                    return meshrasterizer_24;
                }
            } else if (modelType == ModelType.NPC_MODEL) {
                meshrasterizer_23 = npcindexloader_5.getNPCType(modelId).method6875(graphicalrenderer_1, i_2, renderanimindexloader_3, interface42_8, animation_9, null, null, null, 0, npcMeshModifier);
                if (meshrasterizer_23 == null) {
                    aBool1399 = true;
                    return null;
                } else {
                    return meshrasterizer_23;
                }
            } else if (modelType == ModelType.PLAYER_HEAD_IGNOREWORN) {
                if (playerappearance_10 == null) {
                    return null;
                } else {
                    int idKit1 = modelId >>> 16;
                    int idKit2 = modelId & 0xffff;
                    int idKit3 = anInt1339;
                    MeshRasterizer meshrasterizer_15 = playerappearance_10.getHeadModel(graphicalrenderer_1, i_2, class31_4, animation_9, idKit1, idKit2, idKit3);
                    if (meshrasterizer_15 == null) {
                        aBool1399 = true;
                        return null;
                    } else {
                        return meshrasterizer_15;
                    }
                }
            } else {
                return null;
            }
        }
    }

    public void recolor(int index, short originalColor, short modifiedColor) {
        if (index < 5) {
            if (colorsToReplace == null) {
                colorsToReplace = new short[5];
                colorsToReplaceWith = new short[5];
            }
            colorsToReplace[index] = originalColor;
            colorsToReplaceWith[index] = modifiedColor;
        }
    }

    public void retexture(int i_1, short s_2, short s_3) {
        if (i_1 < 5) {
            if (texturesToReplace == null) {
                texturesToReplace = new short[5];
                texturesToReplaceWith = new short[5];
            }
            texturesToReplace[i_1] = s_2;
            texturesToReplaceWith[i_1] = s_3;
        }
    }

    public Class247 method2027(SkyboxIndexLoader class288_1, SunIndexLoader class45_2) {
        if (anInt1404 == -1) {
            return null;
        } else {
            long long_4 = (anInt1432 & 0xffffL) << 48 | (anInt1433 & 0xffffL) << 32 | (anInt1434 & 0xffffL) << 16 | anInt1404 & 0xffffL;
            Class247 class247_6 = (Class247) aClass229_1282.get(long_4);
            if (class247_6 == null) {
                class247_6 = class288_1.method5077(anInt1404, anInt1432, anInt1433, anInt1434, class45_2);
                aClass229_1282.put(class247_6, long_4);
            }
            return class247_6;
        }
    }

    public void method2039(int i_1, int i_2) {
        if (opCursors == null || opCursors.length <= i_1) {
            int[] ints_4 = new int[i_1 + 1];
            if (opCursors != null) {
                int i_5;
                for (i_5 = 0; i_5 < opCursors.length; i_5++) {
                    ints_4[i_5] = opCursors[i_5];
                }
                for (i_5 = opCursors.length; i_5 < i_1; i_5++) {
                    ints_4[i_5] = -1;
                }
            }
            opCursors = ints_4;
        }
        opCursors[i_1] = i_2;
    }

    public Class119 method2046(AbstractRenderer graphicalrenderer_1) {
        long long_3 = (long) idHash << 32 | slotId & 0xffffffffL;
        Class119 class119_5 = (Class119) aClass229_1303.get(long_3);
        if (class119_5 != null) {
            if (class119_5.anInt1459 != spriteId) {
                aClass229_1303.method3873(long_3);
                class119_5 = null;
            }
            if (class119_5 != null) {
                return class119_5;
            }
        }
        SpriteDefinitions class91_6 = SpriteDefinitions.getSprite(ProcessorSpecs.SPRITES_INDEX, spriteId, 0);
        if (class91_6 == null) {
            return null;
        } else {
            int i_7 = class91_6.width + class91_6.minX + class91_6.anInt958;
            int i_8 = class91_6.minY + class91_6.height + class91_6.anInt953;
            int[] ints_9 = new int[i_8];
            int[] ints_10 = new int[i_8];
            for (int i_11 = 0; i_11 < class91_6.height; i_11++) {
                int i_12 = 0;
                int i_13 = class91_6.width;
                int i_14;
                for (i_14 = 0; i_14 < class91_6.width; i_14++) {
                    if (class91_6.pixels[i_14 + i_11 * class91_6.width] != 0) {
                        i_12 = i_14;
                        break;
                    }
                }
                for (i_14 = class91_6.width - 1; i_14 >= i_12; --i_14) {
                    if (class91_6.pixels[i_14 + i_11 * class91_6.width] != 0) {
                        i_13 = i_14 + 1;
                        break;
                    }
                }
                ints_9[i_11 + class91_6.minY] = i_12 + class91_6.minX;
                ints_10[i_11 + class91_6.minY] = i_13 - i_12;
            }
            Class455 class455_15 = graphicalrenderer_1.method8624(i_7, i_8, ints_9, ints_10);
            if (class455_15 == null) {
                return null;
            } else {
                class119_5 = new Class119(i_7, i_8, ints_10, ints_9, class455_15, spriteId);
                aClass229_1303.put(class119_5, long_3);
                return class119_5;
            }
        }
    }

    public NativeSprite method2048(AbstractRenderer graphicalrenderer_1) {
        aBool1399 = false;
        long long_3 = ((hFlip ? 1L : 0L) << 39) + ((alpha ? 1L : 0L) << 35) + spriteId + ((long) borderThickness << 36) + ((vFlip ? 1L : 0L) << 38) + ((long) spriteShadow << 40);
        NativeSprite nativesprite_5 = (NativeSprite) aClass229_1280.get(long_3);
        if (nativesprite_5 != null) {
            return nativesprite_5;
        } else {
            SpriteDefinitions class91_6 = SpriteDefinitions.getSprite(ProcessorSpecs.SPRITES_INDEX, spriteId, 0);
            if (class91_6 == null) {
                aBool1399 = true;
                return null;
            } else {
                if (vFlip) {
                    class91_6.method1526();
                }
                if (hFlip) {
                    class91_6.method1525();
                }
                if (borderThickness > 0) {
                    class91_6.method1554(borderThickness);
                } else if (spriteShadow != 0) {
                    class91_6.method1554(1);
                }
                if (borderThickness >= 1) {
                    class91_6.method1536(1);
                }
                if (borderThickness >= 2) {
                    class91_6.method1536(16777215);
                }
                if (spriteShadow != 0) {
                    class91_6.method1524(-16777216 | spriteShadow);
                }
                nativesprite_5 = graphicalrenderer_1.method8444(class91_6, true);
                aClass229_1280.method3857(nativesprite_5, long_3, nativesprite_5.method2747() * nativesprite_5.method2793() * 4);
                return nativesprite_5;
            }
        }
    }
    
    public static void render(IComponentDefinitions[] arr_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, boolean bool_9) {
	    Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
	    for (int i_11 = 0; i_11 < arr_0.length; i_11++) {
	        IComponentDefinitions inter = arr_0[i_11];
	        if (inter != null && (inter.parent == i_1 || i_1 == -1412584499 && inter == client.aClass118_7257)) {
	            int i_13;
	            if (i_8 == -1) {
	                client.aRectangleArray7411[client.anInt7407].setBounds(inter.x + i_6, i_7 + inter.y, inter.width, inter.height);
	                i_13 = ++client.anInt7407 - 1;
	            } else {
	                i_13 = i_8;
	            }
	            inter.anInt1449 = i_13;
	            inter.anInt1450 = client.CYCLES_20MS;
	            if (!client.method11651(inter)) {
	                if (inter.contentType != 0) {
	                    Class28.method776(inter);
	                }
	                int drawX = inter.x + i_6;
	                int drawY = i_7 + inter.y;
	                int i_16 = inter.transparency;
	                if (client.aBool7168 && (client.getIComponentSettings(inter).settingsHash != 0 || inter.type == ComponentType.CONTAINER) && i_16 > 127) {
	                    i_16 = 127;
	                }
	                int i_17;
	                int i_18;
	                if (inter == client.aClass118_7257) {
	                    if (i_1 != -1412584499 && (inter.anInt1382 == anInt1265 || inter.anInt1382 == anInt1283 || client.getIComponentSettings(inter).bit23Enabled())) {
	                        Comparable_Sub1.aClass118Array3772 = arr_0;
	                        GameTipsLoader.anInt4822 = i_6;
	                        Isaac.anInt5157 = i_7;
	                        continue;
	                    }
	                    if (client.aBool7364 && client.aBool7403) {
	                        i_17 = Class163.mouseRecorder.getMouseX();
	                        i_18 = Class163.mouseRecorder.getMouseY();
	                        i_17 -= client.anInt7361;
	                        i_18 -= client.anInt7362;
	                        if (i_17 < client.anInt7432) {
	                            i_17 = client.anInt7432;
	                        }
	                        if (i_17 + inter.width > client.anInt7432 + client.anInt7367) {
	                            i_17 = client.anInt7432 + client.anInt7367 - inter.width;
	                        }
	                        if (i_18 < client.anInt7265) {
	                            i_18 = client.anInt7265;
	                        }
	                        if (i_18 + inter.height > client.anInt7265 + client.anInt7476) {
	                            i_18 = client.anInt7476 + client.anInt7265 - inter.height;
	                        }
	                        if (client.getIComponentSettings(inter).bit23Enabled()) {
	                            Class292.method5201(i_17, i_18, inter.width, inter.height);
	                        }
	                        drawX = i_17;
	                        drawY = i_18;
	                    }
	                    if (inter.anInt1382 == anInt1283) {
	                        i_16 = 128;
	                    }
	                }
	                int i_19;
	                int i_20;
	                int i_21;
	                int i_22;
	                if (inter.type == ComponentType.TYPE_2) {
	                    i_17 = i_2;
	                    i_18 = i_3;
	                    i_19 = i_4;
	                    i_20 = i_5;
	                } else {
	                    i_21 = drawX + inter.width;
	                    i_22 = drawY + inter.height;
	                    if (inter.type == ComponentType.LINE) {
	                        ++i_21;
	                        ++i_22;
	                    }
	                    i_17 = Math.max(drawX, i_2);
	                    i_18 = Math.max(drawY, i_3);
	                    i_19 = Math.min(i_21, i_4);
	                    i_20 = Math.min(i_22, i_5);
	                }
	                if (i_17 < i_19 && i_18 < i_20) {
	                    if (inter.contentType != 0) {
	                        if (inter.contentType == CONTENT_TYPE_1337 || inter.contentType == CONTENT_TYPE_1403) {
	                            HitbarDefinitions.method3231(drawX, drawY, inter.width, inter.height, inter.contentType == CONTENT_TYPE_1403);
	                            TCPPacket.method12366(i_13, i_17, i_18, i_19, i_20, drawX, drawY);
	                            Renderers.CURRENT_RENDERER.method8421();
	                            Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
	                            client.aBoolArray7443[i_13] = true;
	                            continue;
	                        }
	                        if (inter.contentType == CONTENT_TYPE_1338 && client.anInt7341 == 1) {
	                            if (inter.method2046(Renderers.CURRENT_RENDERER) != null) {
	                                MaterialPropTexture.method15391();
	                                Item.method12574(Renderers.CURRENT_RENDERER, inter, drawX, drawY);
	                                Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
	                            }
	                            continue;
	                        }
	                        if (inter.contentType == CONTENT_TYPE_1408) {
	                            Shadow.method15506(Renderers.CURRENT_RENDERER, drawX, drawY, inter);
	                            continue;
	                        }
	                        if (inter.contentType == CONTENT_TYPE_1409) {
	                            Class366.method6301(Renderers.CURRENT_RENDERER, drawX, drawY, inter, inter.color % 64);
	                            continue;
	                        }
	                        if (inter.contentType == CONTENT_TYPE_1339) {
	                            if (inter.method2046(Renderers.CURRENT_RENDERER) != null) {
	                                VorbisFileReference.method13448(inter, drawX, drawY);
	                                Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
	                            }
	                            continue;
	                        }
	                        if (inter.contentType == CONTENT_TYPE_1400) {
	                            Node_Sub46.method13407(Renderers.CURRENT_RENDERER, IndexLoaders.IMAGE_LOADER, drawX, drawY, inter.width, inter.height);
	                            client.aBoolArray7443[i_13] = true;
	                            Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
	                            continue;
	                        }
	                        if (inter.contentType == MINIMAP) {
	                            LoadingStage.renderMiniMiniMap(Renderers.CURRENT_RENDERER, drawX, drawY, inter.width, inter.height);
	                            client.aBoolArray7443[i_13] = true;
	                            Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
	                            continue;
	                        }
	                        if (inter.contentType == DEBUG_INFORMATION) {
	                            if (client.DRAW_DEBUG || client.aBool7177) {
	                                NPCDirection.drawDebugInformation(drawX, drawY, inter);
	                                client.aBoolArray7443[i_13] = true;
	                            }
	                            continue;
	                        }
	                    }
	                    int i_23;
	                    int i_24;
	                    int i_25;
	                    if (inter.type == ComponentType.CONTAINER) {
	                        if (inter.contentType == CONTENT_TYPE_1407 && Renderers.CURRENT_RENDERER.method8471()) {
	                            Renderers.CURRENT_RENDERER.method8525(Class349.BASE_WINDOW_WIDTH, client.BASE_WINDOW_HEIGHT * -969250379);
	                        }
	                        render(arr_0, inter.idHash, i_17, i_18, i_19, i_20, drawX - inter.scrollX, drawY - inter.scrollY, i_13, bool_9);
	                        if (inter.itemSlots != null) {
	                            render(inter.itemSlots, inter.idHash, i_17, i_18, i_19, i_20, drawX - inter.scrollX, drawY - inter.scrollY, i_13, bool_9);
	                        }
	                        SubInterface class282_sub44_33 = (SubInterface) client.OPEN_INTERFACES.get(inter.idHash);
	                        if (class282_sub44_33 != null) {
	                            RenderAnimIndexLoader.method3629(class282_sub44_33.interfaceId, i_17, i_18, i_19, i_20, drawX, drawY, i_13);
	                        }
	                        if (inter.contentType == CONTENT_TYPE_1407) {
	                            if (Renderers.CURRENT_RENDERER.method8471()) {
	                                Renderers.CURRENT_RENDERER.method8474();
	                            }
	                            if (client.anInt7341 == 4) {
	                                i_22 = client.anInt7238;
	                                i_23 = client.anInt7377;
	                                i_24 = client.anInt7413;
	                                i_25 = client.anInt7217;
	                                if (client.CYCLES_20MS < client.anInt7237) {
	                                    float f_26 = (client.CYCLES_20MS - client.anInt7236) * 1.0F / (client.anInt7237 - client.anInt7236);
	                                    i_22 = (int) (client.anInt7238 * f_26 + (1.0F - f_26) * SceneryShadowPreference.anInt7868);
	                                    i_23 = (int) (client.anInt7377 * f_26 + Class350_Sub2.anInt7815 * (1.0F - f_26));
	                                    i_24 = (int) (f_26 * client.anInt7413 + Class329_Sub1.anInt7726 * (1.0F - f_26));
	                                    i_25 = (int) (f_26 * client.anInt7217 + Node_Sub17_Sub4.anInt9940 * (1.0F - f_26));
	                                }
	                                if (i_22 > 0) {
	                                    Renderers.CURRENT_RENDERER.method8425(i_17, i_18, i_19 - i_17, i_20 - i_18, i_22 << 24 | i_23 << 16 | i_24 << 8 | i_25);
	                                }
	                            }
	                        }
	                        Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
	                    }
	                    if (client.aBoolArray7410[i_13] || client.anInt7412 > 1) {
	                        if (inter.type == ComponentType.FIGURE) {
	                            if (i_16 == 0) {
	                                if (inter.filled) {
	                                    Renderers.CURRENT_RENDERER.B(drawX, drawY, inter.width, inter.height, inter.color, 0);
	                                } else {
	                                    Renderers.CURRENT_RENDERER.method8430(drawX, drawY, inter.width, inter.height, inter.color, 0);
	                                }
	                            } else if (inter.filled) {
	                                Renderers.CURRENT_RENDERER.B(drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | inter.color & 0xffffff, 1);
	                            } else {
	                                Renderers.CURRENT_RENDERER.method8430(drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | inter.color & 0xffffff, 1);
	                            }
	                        } else {
	                            ItemDefinitions itemdefinitions_36;
	                            if (inter.type == ComponentType.TEXT) {
	                                FontRenderer fontrenderer_43 = inter.method1988(Class487.aClass378_5752, client.anInterface35_7206);
	                                if (fontrenderer_43 == null) {
	                                    if (aBool1399) {
	                                        Class109.redrawComponent(inter);
	                                    }
	                                } else {
	                                    i_22 = inter.color;
	                                    String string_35 = inter.text;
	                                    if (inter.containerItemId != -1) {
	                                        itemdefinitions_36 = IndexLoaders.ITEM_LOADER.getItemDefinitions(inter.containerItemId);
	                                        string_35 = itemdefinitions_36.name;
	                                        if (string_35 == null) {
	                                            string_35 = "null";
	                                        }
	                                        if ((itemdefinitions_36.stackable == 1 || inter.anInt1427 != 1) && inter.anInt1427 != -1) {
	                                            string_35 = Utils.rgbToColHexShortcut(16748608) + string_35 + "</col>" + " x" + Class488.method8210(inter.anInt1427);
	                                        }
	                                    }
	                                    if (inter.anInt1435 != -1) {
	                                        string_35 = Class148.method2550(inter.anInt1435);
	                                        if (string_35 == null) {
	                                            string_35 = "";
	                                        }
	                                    }
	                                    if (inter == client.aClass118_7352) {
	                                        string_35 = LocalizedText.PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE);
	                                        i_22 = inter.color;
	                                    }
	                                    if (client.aBool7358) {
	                                        Renderers.CURRENT_RENDERER.o(drawX, drawY, drawX + inter.width, drawY + inter.height);
	                                    }
	                                    if (inter.textAntiMacro) {
	                                        fontrenderer_43.method367(string_35, drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | i_22, inter.shadow ? 255 - (i_16 & 0xff) << 24 : -1, inter.textHorizontalAli, inter.textVerticalAli, client.aRandom7260, Class455_Sub3.anInt9079, client.anIntArray7438, Class182.aNativeSpriteArray2261, null);
	                                    } else {
	                                        fontrenderer_43.method373(string_35, drawX, drawY, inter.width, inter.height, 255 - (i_16 & 0xff) << 24 | i_22, inter.shadow ? 255 - (i_16 & 0xff) << 24 : -1, inter.textHorizontalAli, inter.textVerticalAli, inter.anInt1358, inter.maxTextLines, Class182.aNativeSpriteArray2261, null, null, 0, 0);
	                                    }
	                                    if (client.aBool7358) {
	                                        Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
	                                    }
	                                }
	                            } else {
	                                int i_27;
	                                int i_39;
	                                if (inter.type == ComponentType.SPRITE) {
	                                    if (inter.anInt1404 >= 0) {
	                                        inter.method2027(IndexLoaders.SKYBOX_LOADER, IndexLoaders.SUN_LOADER).method4214(Renderers.CURRENT_RENDERER, drawX, drawY, inter.width, inter.height, inter.anInt1430 << 3, inter.anInt1431 << 3);
	                                    } else {
	                                        NativeSprite nativesprite_41;
	                                        if (inter.containerItemId != -1) {
	                                            PlayerModel playerappearance_34 = inter.wearCol ? VertexNormal.MY_PLAYER.model : null;
	                                            nativesprite_41 = IndexLoaders.ITEM_LOADER.softwareRender(Renderers.CURRENT_RENDERER, inter.containerItemId, inter.anInt1427, inter.borderThickness, -16777216 | inter.spriteShadow, inter.renderStack, playerappearance_34);
	                                        } else if (inter.anInt1435 != -1) {
	                                            nativesprite_41 = SpotAnimIndexLoader.method8858(Renderers.CURRENT_RENDERER, inter.anInt1435);
	                                        } else {
	                                            nativesprite_41 = inter.method2048(Renderers.CURRENT_RENDERER);
	                                        }
	                                        if (nativesprite_41 != null) {
	                                            i_22 = nativesprite_41.scaleWidth();
	                                            i_23 = nativesprite_41.method2748();
	                                            i_24 = 255 - (i_16 & 0xff) << 24 | (inter.color != 0 ? inter.color & 0xffffff : 16777215);
	                                            if (!inter.tiling) {
	                                                if (inter.color == 0 && i_16 == 0) {
	                                                    if (inter.angle2d != 0) {
	                                                        nativesprite_41.method2758(inter.width / 2.0F + drawX, drawY + inter.height / 2.0F, inter.width * 4096 / i_22, inter.angle2d);
	                                                    } else if (i_22 == inter.width && i_23 == inter.height) {
	                                                        nativesprite_41.method2752(drawX, drawY);
	                                                    } else {
	                                                        nativesprite_41.method2789(drawX, drawY, inter.width, inter.height);
	                                                    }
	                                                } else if (inter.angle2d != 0) {
	                                                    nativesprite_41.method2790(inter.width / 2.0F + drawX, inter.height / 2.0F + drawY, inter.width * 4096 / i_22, inter.angle2d, i_24);
	                                                } else if (i_22 == inter.width && i_23 == inter.height) {
	                                                    nativesprite_41.method2742(drawX, drawY, 0, i_24, 1);
	                                                } else {
	                                                    nativesprite_41.method2754(drawX, drawY, inter.width, inter.height, 0, i_24, 1);
	                                                }
	                                            } else {
	                                                Renderers.CURRENT_RENDERER.o(drawX, drawY, drawX + inter.width, drawY + inter.height);
	                                                if (inter.angle2d != 0) {
	                                                    i_25 = (i_22 - 1 + inter.width) / i_22;
	                                                    i_39 = (i_23 - 1 + inter.height) / i_23;
	                                                    for (i_27 = 0; i_27 < i_25; i_27++) {
	                                                        for (int i_28 = 0; i_28 < i_39; i_28++) {
	                                                            if (inter.color != 0) {
	                                                                nativesprite_41.method2790((drawX + i_27 * i_22) + i_22 / 2.0F, i_23 / 2.0F + (drawY + i_23 * i_28), 4096, inter.angle2d, i_24);
	                                                            } else {
	                                                                nativesprite_41.method2758((drawX + i_22 * i_27) + i_22 / 2.0F, (drawY + i_23 * i_28) + i_23 / 2.0F, 4096, inter.angle2d);
	                                                            }
	                                                        }
	                                                    }
	                                                } else if (inter.color == 0 && i_16 == 0) {
	                                                    nativesprite_41.method2756(drawX, drawY, inter.width, inter.height);
	                                                } else {
	                                                    nativesprite_41.method2772(drawX, drawY, inter.width, inter.height, 0, i_24, 1);
	                                                }
	                                                Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
	                                            }
	                                        } else if (aBool1399) {
	                                            Class109.redrawComponent(inter);
	                                        }
	                                    }
	                                } else if (inter.type == ComponentType.MODEL) {
	                                	//TODO figure out what is broken with this block of logic
	                                    IndexLoaders.MAP_REGION_DECODER.method4435().method4052();
	                                    MeshRasterizer meshRasterizer = null;
	                                    i_22 = 2048;
	                                    if (inter.modelTintScalar != 0) {
	                                        i_22 |= 0x80000;
	                                    }
	                                    i_23 = 0;
	                                    if (inter.containerItemId != -1) {
	                                        itemdefinitions_36 = IndexLoaders.ITEM_LOADER.getItemDefinitions(inter.containerItemId);
	                                        if (itemdefinitions_36 != null) {
	                                            itemdefinitions_36 = itemdefinitions_36.method7090(inter.anInt1427);
	                                            meshRasterizer = itemdefinitions_36.method7084(Renderers.CURRENT_RENDERER, i_22, 1, inter.wearCol ? VertexNormal.MY_PLAYER.model : null, inter.anim, 0, 0, 0, 0);
	                                            if (meshRasterizer != null) {
	                                                i_23 = -meshRasterizer.YA() >> 1;
	                                            } else {
	                                                Class109.redrawComponent(inter);
	                                            }
	                                        }
	                                    } else {
	                                        if (inter.modelType == ModelType.PLAYER_HEAD) {
	                                            i_24 = inter.modelId;
	                                            if (i_24 >= 0 && i_24 < 2048) {
	                                                PlayerEntity player_37 = client.players[i_24];
	                                                if (player_37 != null && (i_24 == client.myPlayerIndex || Class272.stringToInt(player_37.displayName) == inter.anInt1339)) {
	                                                    meshRasterizer = inter.method2002(Renderers.CURRENT_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTIKIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, inter.anim, player_37.model);
	                                                    if (meshRasterizer == null && aBool1399) {
	                                                        Class109.redrawComponent(inter);
	                                                    }
	                                                }
	                                            }
	                                        } else if (inter.modelType == ModelType.PLAYER_MODEL) {
	                                        	i_24 = inter.modelId;
	                                            if (i_24 >= 0 && i_24 < 2048) {
	                                            	PlayerEntity player_37 = client.players[i_24];
	                                                if (player_37 != null && (i_24 == client.myPlayerIndex || Class272.stringToInt(player_37.displayName) == inter.anInt1339)) {
	                                                    meshRasterizer = player_37.model.getBodyModel(Renderers.CURRENT_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTIKIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, inter.anim, null, null, null, 0, LinkedNodeList.EQUIPMENT_DEFAULTS);
	                                                }
	                                            }
	                                        } else if (inter.modelType == ModelType.ITEM_CONTAINER_MALE || inter.modelType == ModelType.ITEM_CONTAINER_FEMALE) {
	                                            ItemContainer container = ItemContainer.getContainer(inter.modelId, false);
	                                            if (container != null) {
	                                                meshRasterizer = container.method12429(Renderers.CURRENT_RENDERER, i_22, inter.anim, inter.anInt1339, inter.modelType == ModelType.ITEM_CONTAINER_FEMALE, inter.wearCol ? VertexNormal.MY_PLAYER.model : null);
	                                            }
	                                        } else {
	                                            meshRasterizer = inter.method2002(Renderers.CURRENT_RENDERER, i_22, IndexLoaders.RENDER_ANIM_LOADER, IndexLoaders.IDENTIKIT_LOADER, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_LOADER, Class158_Sub1.PLAYER_VAR_PROVIDER, inter.anim != null && inter.anim.hasDefs() ? inter.anim : null, VertexNormal.MY_PLAYER.model);
	                                            if (meshRasterizer == null && aBool1399) {
	                                                Class109.redrawComponent(inter);
	                                            }
	                                        }
	                                    }
	                                    if (meshRasterizer != null) {
	                                        if (inter.modelTintScalar != 0) {
	                                            meshRasterizer.PA(inter.modelTintRed, inter.modelTintGreen, inter.modelTintBlue, inter.modelTintScalar);
	                                        }
	                                        if (inter.aspectWidth > 0) {
	                                            i_24 = (inter.width << 9) / inter.aspectWidth;
	                                        } else {
	                                            i_24 = 512;
	                                        }
	                                        if (inter.aspectHeight > 0) {
	                                            i_25 = (inter.height << 9) / inter.aspectHeight;
	                                        } else {
	                                            i_25 = 512;
	                                        }
	                                        i_39 = inter.width / 2 + drawX;
	                                        i_27 = inter.height / 2 + drawY;
	                                        if (!inter.hasOrigin) {
	                                            i_39 += i_24 * inter.originX >> 9;
	                                            i_27 += i_25 * inter.originY >> 9;
	                                        }
	                                        client.aClass294_7457.method5212();
	                                        Renderers.CURRENT_RENDERER.method8457(client.aClass294_7457);
	                                        Matrix44 matrix44_38 = Renderers.CURRENT_RENDERER.method8449();
	                                        int i_29 = IndexLoaders.MAP_REGION_DECODER.method4544();
	                                        int i_30 = IndexLoaders.MAP_REGION_DECODER.method4522();
	                                        i_30 += inter.spriteScale;
	                                        if (inter.usesOrthogonal) {
	                                            if (inter.hasOrigin) {
	                                                matrix44_38.method6532(i_39, i_27, i_24, i_25, i_29, i_30, Class349.BASE_WINDOW_WIDTH, (client.BASE_WINDOW_HEIGHT), inter.spriteScale);
	                                            } else {
	                                                matrix44_38.method6532(i_39, i_27, i_24, i_25, i_29, i_30, Class349.BASE_WINDOW_WIDTH, (client.BASE_WINDOW_HEIGHT), (inter.spriteScale << 2));
	                                            }
	                                        } else {
	                                            matrix44_38.method6531(i_39, i_27, i_24, i_25, i_29, i_30, Class349.BASE_WINDOW_WIDTH, (client.BASE_WINDOW_HEIGHT));
	                                        }
	                                        Renderers.CURRENT_RENDERER.method8424(matrix44_38);
	                                        Renderers.CURRENT_RENDERER.ba(2, 0);
	                                        if (inter.aBool1345) {
	                                            Renderers.CURRENT_RENDERER.RA(false);
	                                        }
	                                        if (inter.hasOrigin) {
	                                            client.aClass294_7169.method5217(1.0F, 0.0F, 0.0F, Trig.degToRad(inter.spritePitch));
	                                            client.aClass294_7169.rotation(0.0F, 1.0F, 0.0F, Trig.degToRad(inter.spriteRoll));
	                                            client.aClass294_7169.rotation(0.0F, 0.0F, 1.0F, Trig.degToRad(inter.spriteYaw));
	                                            client.aClass294_7169.method5219(inter.originX, inter.originY, inter.originZ);
	                                        } else {
	                                            int i_31 = Trig.SINE[inter.spritePitch << 3] * (inter.spriteScale << 2) >> 14;
	                                            int i_32 = Trig.COSINE[inter.spritePitch << 3] * (inter.spriteScale << 2) >> 14;
	                                            client.aClass294_7169.method5217(0.0F, 0.0F, 1.0F, Trig.degToRad(-inter.spriteYaw << 3));
	                                            client.aClass294_7169.rotation(0.0F, 1.0F, 0.0F, Trig.degToRad(inter.spriteRoll << 3));
	                                            client.aClass294_7169.method5219((inter.offsetX << 2), (i_31 + i_23 + (inter.offsetY << 2)), (i_32 + (inter.offsetY << 2)));
	                                            client.aClass294_7169.rotation(1.0F, 0.0F, 0.0F, Trig.degToRad(inter.spritePitch << 3));
	                                        }
	                                        inter.method1991(Renderers.CURRENT_RENDERER, meshRasterizer, client.aClass294_7169, client.CYCLES_20MS);
	                                        if (client.aBool7358) {
	                                            Renderers.CURRENT_RENDERER.o(drawX, drawY, drawX + inter.width, drawY + inter.height);
	                                        }
	                                        meshRasterizer.method11282(client.aClass294_7169, null, 1);
	                                        if (!inter.usesOrthogonal && inter.particleSystem != null) {
	                                            Renderers.CURRENT_RENDERER.method8456(inter.particleSystem.method11533());
	                                        }
	                                        if (client.aBool7358) {
	                                            Renderers.CURRENT_RENDERER.r(i_2, i_3, i_4, i_5);
	                                        }
	                                        if (inter.aBool1345) {
	                                            Renderers.CURRENT_RENDERER.RA(true);
	                                        }
	                                    }
	                                } else if (inter.type == ComponentType.LINE) {
	                                    if (inter.lineDirection) {
	                                        i_21 = drawX;
	                                        i_22 = drawY + inter.height;
	                                        i_23 = drawX + inter.width;
	                                        i_24 = drawY;
	                                    } else {
	                                        i_21 = drawX;
	                                        i_22 = drawY;
	                                        i_23 = drawX + inter.width;
	                                        i_24 = drawY + inter.height;
	                                    }
	                                    if (inter.lineWidth == 1) {
	                                        Renderers.CURRENT_RENDERER.method8433(i_21, i_22, i_23, i_24, inter.color, 0);
	                                    } else {
	                                        Renderers.CURRENT_RENDERER.method8496(i_21, i_22, i_23, i_24, inter.color, inter.lineWidth, 0);
	                                    }
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	        }
	    }
	}
}
