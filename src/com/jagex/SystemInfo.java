package com.jagex;

import jaclib.hardware_info.HardwareInfo;

import java.util.HashMap;

public class SystemInfo extends Node {

    public int javaBuild;
    public int javaUpdate;
    public int ram;
    String aString8157;
    String aString8160;
    String aString8159;
    String aString8153;
    int[] rawCPUInformationData = new int[3];
    int operatingSystem;
    boolean x64os;
    int osVendor;
    int javaVersion;
    int javaSubBuild;
    boolean idk;
    int maxMem;
    int processors;
    int cpuCores;
    int cpuClock;
    String cpuType;
    int rawCPUInformation2;
    int rawCPUInformation;
    String cpuData;
    int dxDriverMonth;
    int dxDriverYear;

    public SystemInfo() {
        if (GroundItemStrategy.aString8069.startsWith("win")) {
            operatingSystem = 1;
        } else if (GroundItemStrategy.aString8069.startsWith("mac")) {
            operatingSystem = 2;
        } else if (GroundItemStrategy.aString8069.startsWith("linux")) {
            operatingSystem = 3;
        } else {
            operatingSystem = 4;
        }
        x64os = Class402.aString4828.startsWith("amd64") || Class402.aString4828.startsWith("x86_64");
        if (operatingSystem == 1) {
            if (Class231.aString2876.indexOf("4.0") != -1) {
                osVendor = 1;
            } else if (Class231.aString2876.indexOf("4.1") != -1) {
                osVendor = 2;
            } else if (Class231.aString2876.indexOf("4.9") != -1) {
                osVendor = 3;
            } else if (Class231.aString2876.indexOf("5.0") != -1) {
                osVendor = 4;
            } else if (Class231.aString2876.indexOf("5.1") != -1) {
                osVendor = 5;
            } else if (Class231.aString2876.indexOf("5.2") != -1) {
                osVendor = 8;
            } else if (Class231.aString2876.indexOf("6.0") != -1) {
                osVendor = 6;
            } else if (Class231.aString2876.indexOf("6.1") != -1) {
                osVendor = 7;
            } else if (Class231.aString2876.indexOf("6.2") != -1) {
                osVendor = 9;
            }
        } else if (operatingSystem == 2) {
            if (Class231.aString2876.indexOf("10.4") != -1) {
                osVendor = 20;
            } else if (Class231.aString2876.indexOf("10.5") != -1) {
                osVendor = 21;
            } else if (Class231.aString2876.indexOf("10.6") != -1) {
                osVendor = 22;
            } else if (Class231.aString2876.indexOf("10.7") != -1) {
                osVendor = 23;
            }
        }
        if (Node_Sub20_Sub34.aString9967.toLowerCase().indexOf("sun") != -1) {
            javaVersion = 1;
        } else if (Node_Sub20_Sub34.aString9967.toLowerCase().indexOf("microsoft") != -1) {
            javaVersion = 2;
        } else if (Node_Sub20_Sub34.aString9967.toLowerCase().indexOf("apple") != -1) {
            javaVersion = 3;
        } else {
            javaVersion = 4;
        }
        int i_2 = ChatLine.aString1093.startsWith("1.") ? 2 : 0;
        int i_3 = 0;
        char var_4;
        try {
            while (i_2 < ChatLine.aString1093.length()) {
                var_4 = ChatLine.aString1093.charAt(i_2);
                if (var_4 < 48 || var_4 > 57) {
                    break;
                }
                i_3 = var_4 - 48 + i_3 * 10;
                ++i_2;
            }
        } catch (Exception ignored) {
        }
        javaBuild = i_3;
        i_2 = ChatLine.aString1093.indexOf(46, 2) + 1;
        i_3 = 0;
        try {
            while (i_2 < ChatLine.aString1093.length()) {
                var_4 = ChatLine.aString1093.charAt(i_2);
                if (var_4 < 48 || var_4 > 57) {
                    break;
                }
                i_3 = var_4 - 48 + i_3 * 10;
                ++i_2;
            }
        } catch (Exception ignored) {
        }
        javaSubBuild = i_3;
        i_2 = ChatLine.aString1093.indexOf(95, 4) + 1;
        i_3 = 0;
        try {
            while (i_2 < ChatLine.aString1093.length()) {
                var_4 = ChatLine.aString1093.charAt(i_2);
                if (var_4 < 48 || var_4 > 57) {
                    break;
                }
                i_3 = var_4 - 48 + i_3 * 10;
                ++i_2;
            }
        } catch (Exception ignored) {
        }
        javaUpdate = i_3;
        idk = false;
        maxMem = Engine.MAX_MEMORY;
        if (javaBuild > 3) {
            processors = Engine.AVAILABLE_PROCESSORS;
        } else {
            processors = 0;
        }
        try {
            int[] ints_14 = HardwareInfo.getCPUInfo();
            if (ints_14 != null && ints_14.length == 3) {
                cpuCores = ints_14[0];
                cpuClock = ints_14[1];
                ram = ints_14[2];
            }
            int[] ints_5 = HardwareInfo.getRawCPUInfo();
            int i_7;
            int i_9;
            int i_10;
            int i_11;
            if (ints_5 != null && ints_5.length % 5 == 0) {
                HashMap<Integer, Class430> hashmap_6 = new HashMap<>();
                for (i_7 = 0; i_7 < ints_5.length / 5; i_7++) {
                    int i_8 = ints_5[i_7 * 5];
                    i_9 = ints_5[i_7 * 5 + 1];
                    i_10 = ints_5[i_7 * 5 + 2];
                    i_11 = ints_5[i_7 * 5 + 3];
                    int i_12 = ints_5[i_7 * 5 + 4];
                    Class430 class430_13 = new Class430(i_8, i_9, i_10, i_11, i_12);
                    hashmap_6.put(Integer.valueOf(i_8), class430_13);
                }
                Class430 class430_15 = hashmap_6.get(Integer.valueOf(0));
                if (class430_15 != null) {
                    Packet rsbytebuffer_16 = new Packet(13);
                    rsbytebuffer_16.method13232(class430_15.anInt5137);
                    rsbytebuffer_16.method13232(class430_15.anInt5136);
                    rsbytebuffer_16.method13232(class430_15.anInt5138);
                    rsbytebuffer_16.index = 0;
                    cpuType = rsbytebuffer_16.readString();
                }
                Class430 class430_27 = hashmap_6.get(Integer.valueOf(1));
                if (class430_27 != null) {
                    rawCPUInformation2 = class430_27.anInt5139;
                    i_9 = class430_27.anInt5137;
                    rawCPUInformation = i_9 >> 16 & 0xff;
                    rawCPUInformationData[0] = class430_27.anInt5138;
                    rawCPUInformationData[1] = class430_27.anInt5136;
                }
                Class430 class430_17 = hashmap_6.get(Integer.valueOf(-2147483647));
                if (class430_17 != null) {
                    rawCPUInformationData[2] = class430_17.anInt5136;
                }
                Packet rsbytebuffer_18 = new Packet(49);
                for (i_11 = -2147483646; i_11 <= -2147483644; i_11++) {
                    Class430 class430_19 = hashmap_6.get(Integer.valueOf(i_11));
                    if (class430_19 != null) {
                        rsbytebuffer_18.method13232(class430_19.anInt5139);
                        rsbytebuffer_18.method13232(class430_19.anInt5137);
                        rsbytebuffer_18.method13232(class430_19.anInt5138);
                        rsbytebuffer_18.method13232(class430_19.anInt5136);
                    }
                }
                rsbytebuffer_18.index = 0;
                cpuData = rsbytebuffer_18.readString();
            }
            String[][] arr_25 = HardwareInfo.getDXDiagDisplayDevicesProps();
            String string_28;
            if (arr_25 != null && arr_25.length > 0 && arr_25[0] != null) {
                for (i_7 = 0; i_7 < arr_25[0].length; i_7 += 2) {
                    if ("szDescription".equalsIgnoreCase(arr_25[0][i_7])) {
                        aString8157 = arr_25[0][i_7 + 1];
                    } else if ("szDriverDateEnglish".equalsIgnoreCase(arr_25[0][i_7])) {
                        string_28 = arr_25[0][i_7 + 1];
                        try {
                            i_9 = string_28.indexOf('/');
                            i_10 = string_28.indexOf('/', i_9 + 1);
                            dxDriverMonth = Integer.parseInt(string_28.substring(0, i_9));
                            dxDriverYear = Integer.parseInt(string_28.substring(i_10 + 1, string_28.indexOf(' ', i_10)));
                        } catch (Exception ignored) {
                        }
                    }
                }
            }
            String[] arr_26 = HardwareInfo.getDXDiagSystemProps();
            if (arr_26 != null) {
                string_28 = "";
                String str_29 = "";
                String str_30 = "";
                for (i_11 = 0; i_11 < arr_26.length; i_11 += 2) {
                    if ("dwDirectXVersionMajor".equalsIgnoreCase(arr_26[i_11])) {
                        string_28 = arr_26[i_11 + 1];
                    } else if ("dwDirectXVersionMinor".equalsIgnoreCase(arr_26[i_11])) {
                        str_29 = arr_26[i_11 + 1];
                    } else if ("dwDirectXVersionLetter".equalsIgnoreCase(arr_26[i_11])) {
                        str_30 = arr_26[i_11 + 1];
                    }
                }
                aString8159 = string_28 + "." + str_29 + str_30;
            }
        } catch (Throwable throwable_21) {
            ram = 0;
        }
        if (aString8157 == null) {
            aString8157 = "";
        }
        if (aString8160 == null) {
            aString8160 = "";
        }
        if (aString8159 == null) {
            aString8159 = "";
        }
        if (aString8153 == null) {
            aString8153 = "";
        }
        if (cpuType == null) {
            cpuType = "";
        }
        if (cpuData == null) {
            cpuData = "";
        }
        method13455();
    }

    static void method13466(PathingEntity animable_0, boolean bool_1) {
        BASDefinitions renderanimdefs_3 = animable_0.getRenderAnimDefs();
        if (animable_0.anInt10355 == 0) {
            animable_0.anInt10366 = 0;
            IdentikitDefinition.anInt430 = MoveSpeed.STATIONARY.id;
            FontRenderer_Sub1.anInt8515 = 0;
        } else {
            if (animable_0.currentAnimation.hasDefs() && !animable_0.currentAnimation.hasSpeed()) {
                AnimationDefinitions animationdefinitions_4 = animable_0.currentAnimation.getDefs();
                if (animable_0.anInt10367 > 0 && animationdefinitions_4.animatingPrecedence == 0) {
                    ++animable_0.anInt10366;
                    IdentikitDefinition.anInt430 = MoveSpeed.STATIONARY.id;
                    FontRenderer_Sub1.anInt8515 = 0;
                    return;
                }
                if (animable_0.anInt10367 <= 0 && animationdefinitions_4.walkingPrecedence == 0) {
                    ++animable_0.anInt10366;
                    IdentikitDefinition.anInt430 = MoveSpeed.STATIONARY.id;
                    FontRenderer_Sub1.anInt8515 = 0;
                    return;
                }
            }
            for (int i_18 = 0; i_18 < animable_0.spotAnims.length; i_18++) {
                if (animable_0.spotAnims[i_18].spotAnimId != -1 && animable_0.spotAnims[i_18].animation.hasSpeed()) {
                    SpotAnimDefinitions spotanimdefinitions_19 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(animable_0.spotAnims[i_18].spotAnimId);
                    if (spotanimdefinitions_19.aBool6968 && spotanimdefinitions_19.animationId != -1) {
                        AnimationDefinitions animationdefinitions_20 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_19.animationId);
                        if (animable_0.anInt10367 > 0 && animationdefinitions_20.animatingPrecedence == 0) {
                            ++animable_0.anInt10366;
                            IdentikitDefinition.anInt430 = MoveSpeed.STATIONARY.id;
                            FontRenderer_Sub1.anInt8515 = 0;
                            return;
                        }
                        if (animable_0.anInt10367 <= 0 && animationdefinitions_20.walkingPrecedence == 0) {
                            ++animable_0.anInt10366;
                            IdentikitDefinition.anInt430 = MoveSpeed.STATIONARY.id;
                            FontRenderer_Sub1.anInt8515 = 0;
                            return;
                        }
                    }
                }
            }
            Vector3 vector3_21 = Vector3.popVectorStackTo(animable_0.method11166().coords);
            int i_5 = (int) vector3_21.x;
            int i_6 = (int) vector3_21.z;
            int i_7 = 512 * animable_0.regionBaseX[animable_0.anInt10355 - 1] + animable_0.getSize() * 256;
            int i_8 = animable_0.regionBaseY[animable_0.anInt10355 - 1] * 512 + animable_0.getSize() * 256;
            if (i_5 < i_7) {
                if (i_6 < i_8) {
                    animable_0.method15863(10240);
                } else if (i_6 > i_8) {
                    animable_0.method15863(14336);
                } else {
                    animable_0.method15863(12288);
                }
            } else if (i_5 > i_7) {
                if (i_6 < i_8) {
                    animable_0.method15863(6144);
                } else if (i_6 > i_8) {
                    animable_0.method15863(2048);
                } else {
                    animable_0.method15863(4096);
                }
            } else if (i_6 < i_8) {
                animable_0.method15863(8192);
            } else if (i_6 > i_8) {
                animable_0.method15863(0);
            }
            byte b_9 = animable_0.walkTypes[animable_0.anInt10355 - 1];
            if (bool_1 || i_7 - i_5 <= 1024 && i_7 - i_5 >= -1024 && i_8 - i_6 <= 1024 && i_8 - i_6 >= -1024) {
                int i_10 = 16;
                boolean bool_11 = true;
                if (animable_0 instanceof NPCEntity) {
                    bool_11 = ((NPCEntity) animable_0).definitions.aBool4894;
                }
                int i_12;
                if (bool_11) {
                    i_12 = animable_0.turnDirection - animable_0.aClass19_10359.turnDirection;
                    if (i_12 != 0 && animable_0.faceEntity == -1 && animable_0.anInt10340 != 0) {
                        i_10 = 8;
                    }
                    if (!bool_1 && animable_0.anInt10355 > 2) {
                        i_10 = 24;
                    }
                    if (!bool_1 && animable_0.anInt10355 > 3) {
                        i_10 = 32;
                    }
                } else {
                    if (!bool_1 && animable_0.anInt10355 > 1) {
                        i_10 = 24;
                    }
                    if (!bool_1 && animable_0.anInt10355 > 2) {
                        i_10 = 32;
                    }
                }
                if (animable_0.anInt10366 > 0 && animable_0.anInt10355 > 1) {
                    i_10 = 32;
                    --animable_0.anInt10366;
                }
                if (b_9 == MoveSpeed.RUNNING.id) {
                    i_10 <<= 1;
                } else if (b_9 == MoveSpeed.HALF_WALK.id) {
                    i_10 >>= 1;
                }
                if (renderanimdefs_3.anInt2826 != -1) {
                    i_10 <<= 9;
                    if (animable_0.anInt10355 == 1) {
                        i_12 = animable_0.anInt10368 * animable_0.anInt10368;
                        int i_13 = ((int) vector3_21.x > i_7 ? (int) vector3_21.x - i_7 : i_7 - (int) vector3_21.x) << 9;
                        int i_14 = ((int) vector3_21.z > i_8 ? (int) vector3_21.z - i_8 : i_8 - (int) vector3_21.z) << 9;
                        int i_15 = Math.max(i_13, i_14);
                        int i_16 = i_15 * renderanimdefs_3.anInt2826 * 2;
                        if (i_12 > i_16) {
                            animable_0.anInt10368 /= 2;
                        } else if (i_12 / 2 > i_15) {
                            animable_0.anInt10368 -= renderanimdefs_3.anInt2826;
                            if (animable_0.anInt10368 < 0) {
                                animable_0.anInt10368 = 0;
                            }
                        } else if (animable_0.anInt10368 < i_10) {
                            animable_0.anInt10368 += renderanimdefs_3.anInt2826;
                            if (animable_0.anInt10368 > i_10) {
                                animable_0.anInt10368 = i_10;
                            }
                        }
                    } else if (animable_0.anInt10368 < i_10) {
                        animable_0.anInt10368 += renderanimdefs_3.anInt2826;
                        if (animable_0.anInt10368 > i_10) {
                            animable_0.anInt10368 = i_10;
                        }
                    } else if (animable_0.anInt10368 > 0) {
                        animable_0.anInt10368 -= renderanimdefs_3.anInt2826;
                        if (animable_0.anInt10368 < 0) {
                            animable_0.anInt10368 = 0;
                        }
                    }
                    i_10 = animable_0.anInt10368 >> 9;
                    if (i_10 < 1) {
                        i_10 = 1;
                    }
                }
                FontRenderer_Sub1.anInt8515 = 0;
                if (i_7 == i_5 && i_8 == i_6) {
                    IdentikitDefinition.anInt430 = MoveSpeed.STATIONARY.id;
                } else {
                    if (i_5 < i_7) {
                        vector3_21.x += i_10;
                        FontRenderer_Sub1.anInt8515 |= 0x4;
                        if (vector3_21.x > i_7) {
                            vector3_21.x = i_7;
                        }
                    } else if (i_5 > i_7) {
                        vector3_21.x -= i_10;
                        FontRenderer_Sub1.anInt8515 |= 0x8;
                        if (vector3_21.x < i_7) {
                            vector3_21.x = i_7;
                        }
                    }
                    if (i_6 < i_8) {
                        vector3_21.z += i_10;
                        FontRenderer_Sub1.anInt8515 |= 0x1;
                        if (vector3_21.z > i_8) {
                            vector3_21.z = i_8;
                        }
                    } else if (i_6 > i_8) {
                        vector3_21.z -= i_10;
                        FontRenderer_Sub1.anInt8515 |= 0x2;
                        if (vector3_21.z < i_8) {
                            vector3_21.z = i_8;
                        }
                    }
                    animable_0.method11171(vector3_21);
                    if (i_10 >= 32) {
                        IdentikitDefinition.anInt430 = MoveSpeed.RUNNING.id;
                    } else {
                        IdentikitDefinition.anInt430 = b_9;
                    }
                }
                if (i_7 == (int) vector3_21.x && i_8 == (int) vector3_21.z) {
                    --animable_0.anInt10355;
                    if (animable_0.anInt10367 > 0) {
                        --animable_0.anInt10367;
                    }
                }
            } else {
                animable_0.method11172(i_7, vector3_21.y, i_8);
                animable_0.turn(animable_0.turnDirection, false);
                --animable_0.anInt10355;
                if (animable_0.anInt10367 > 0) {
                    --animable_0.anInt10367;
                }
                IdentikitDefinition.anInt430 = MoveSpeed.STATIONARY.id;
                FontRenderer_Sub1.anInt8515 = 0;
            }
            vector3_21.pushVectorStack();
        }
    }

    public int method13454() {
        byte b_2 = 38;
        int i_3 = b_2 + Utils.stringLengthPlus2(aString8157);
        i_3 += Utils.stringLengthPlus2(aString8160);
        i_3 += Utils.stringLengthPlus2(aString8159);
        i_3 += Utils.stringLengthPlus2(aString8153);
        i_3 += Utils.stringLengthPlus2(cpuType);
        i_3 += Utils.stringLengthPlus2(cpuData);
        return i_3;
    }

    void method13455() {
        if (aString8157.length() > 40) {
            aString8157 = aString8157.substring(0, 40);
        }
        if (aString8160.length() > 40) {
            aString8160 = aString8160.substring(0, 40);
        }
        if (aString8159.length() > 10) {
            aString8159 = aString8159.substring(0, 10);
        }
        if (aString8153.length() > 10) {
            aString8153 = aString8153.substring(0, 10);
        }
    }

    public void writeMachineInformation(Packet rsbytebuffer_1) {
        rsbytebuffer_1.writeByte(6);
        rsbytebuffer_1.writeByte(operatingSystem);
        rsbytebuffer_1.writeByte(x64os ? 1 : 0);
        rsbytebuffer_1.writeByte(osVendor);
        rsbytebuffer_1.writeByte(javaVersion);
        rsbytebuffer_1.writeByte(javaBuild);
        rsbytebuffer_1.writeByte(javaSubBuild);
        rsbytebuffer_1.writeByte(javaUpdate);
        rsbytebuffer_1.writeByte(idk ? 1 : 0);
        rsbytebuffer_1.writeShort(maxMem);
        rsbytebuffer_1.writeByte(processors);
        rsbytebuffer_1.write24BitInt(ram);
        rsbytebuffer_1.writeShort(cpuClock);
        rsbytebuffer_1.writeJagString(aString8157);
        rsbytebuffer_1.writeJagString(aString8160);
        rsbytebuffer_1.writeJagString(aString8159);
        rsbytebuffer_1.writeJagString(aString8153);
        rsbytebuffer_1.writeByte(dxDriverMonth);
        rsbytebuffer_1.writeShort(dxDriverYear);
        rsbytebuffer_1.writeJagString(cpuType);
        rsbytebuffer_1.writeJagString(cpuData);
        rsbytebuffer_1.writeByte(cpuCores);
        rsbytebuffer_1.writeByte(rawCPUInformation);
        for (int i_3 = 0; i_3 < rawCPUInformationData.length; i_3++) {
            rsbytebuffer_1.writeInt(rawCPUInformationData[i_3]);
        }
        rsbytebuffer_1.writeInt(rawCPUInformation2);
    }
}
