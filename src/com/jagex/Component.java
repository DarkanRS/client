package com.jagex;

public class Component {

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
    public Component[] slotChildren;
    public Component[] itemSlots;
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
    public Component aClass118_1379;
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

    public Component() {
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

    public static Component getDefs(int hash) {
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

    public MeshRasterizer method2002(AbstractRenderer graphicalrenderer_1, int i_2, RenderAnimIndexLoader renderanimindexloader_3, IdentiKitIndexLoader class31_4, NPCIndexLoader npcindexloader_5, ObjectIndexLoader itemindexloader_6, VarProvider interface42_8, Animation animation_9, PlayerModel playerappearance_10) {
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
}
