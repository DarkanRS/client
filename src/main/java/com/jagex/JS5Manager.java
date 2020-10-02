package com.jagex;

import com.Loader;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class JS5Manager {

    PaddedJS5Request tableRequest;

    JS5GrabWorker[] grabWorkers;

    ByteBuf buffer;

    JS5StandardRequester standardRequester;

    JS5LocalRequester localRequester;

    BigInteger updateServerExponent;

    BigInteger updateServerModulus;

    public JS5Manager(JS5StandardRequester js5standardrequester_1, JS5LocalRequester js5localrequester_2) {
        standardRequester = js5standardrequester_1;
        localRequester = js5localrequester_2;
        updateServerExponent = Loader.RSA_PUBLIC_EXPONENT;
        updateServerModulus = Loader.RSA_PUBLIC_MODULUS;
        if (!standardRequester.priorityUnavailable()) {
            tableRequest = standardRequester.request(255, 255, (byte) 0, true);
        }
    }

    static boolean method5491(char var_0) {
        if (Character.isISOControl(var_0)) {
            return false;
        } else if (Class380.method6450(var_0)) {
            return true;
        } else {
            char[] arr_2 = Class412.aCharArray4960;
            int i_3;
            char var_4;
            for (i_3 = 0; i_3 < arr_2.length; i_3++) {
                var_4 = arr_2[i_3];
                if (var_0 == var_4) {
                    return true;
                }
            }
            arr_2 = Class412.aCharArray4961;
            for (i_3 = 0; i_3 < arr_2.length; i_3++) {
                var_4 = arr_2[i_3];
                if (var_0 == var_4) {
                    return true;
                }
            }
            return false;
        }
    }

    static boolean method5492(Class293[][][] arr_0, int i_1, int i_2, int i_3, boolean bool_4) {
        byte[][][] bytes_6 = IndexLoaders.MAP_REGION_DECODER.method4532();
        byte b_7 = bool_4 ? 1 : (byte) (client.anInt7286 & 0xff);
        if (bytes_6[Class4.MY_PLAYER_PLANE][i_2][i_3] == b_7) {
            return false;
        } else {
            RenderFlagMap regionmap_8 = IndexLoaders.MAP_REGION_DECODER.getRenderFlags();
            if ((regionmap_8.tileMasks[Class4.MY_PLAYER_PLANE][i_2][i_3] & 0x4) == 0) {
                return false;
            } else {
                byte b_9 = 0;
                int i_10 = 0;
                client.anIntArray7243[b_9] = i_2;
                int i_29 = b_9 + 1;
                client.anIntArray7425[b_9] = i_3;
                bytes_6[Class4.MY_PLAYER_PLANE][i_2][i_3] = b_7;
                while (i_29 != i_10) {
                    int i_11 = client.anIntArray7243[i_10] & 0xffff;
                    int i_12 = client.anIntArray7243[i_10] >> 16 & 0xff;
                    int i_13 = client.anIntArray7243[i_10] >> 24 & 0xff;
                    int i_14 = client.anIntArray7425[i_10] & 0xffff;
                    int i_15 = client.anIntArray7425[i_10] >> 16 & 0xff;
                    i_10 = i_10 + 1 & 0xfff;
                    boolean bool_16 = false;
                    if ((regionmap_8.tileMasks[Class4.MY_PLAYER_PLANE][i_11][i_14] & 0x4) == 0) {
                        bool_16 = true;
                    }
                    boolean bool_17 = false;
                    int i_18;
                    int i_19;
                    int i_20;
                    if (arr_0 != null) {
                        label270:
                        for (i_18 = Class4.MY_PLAYER_PLANE + 1; i_18 <= 3; i_18++) {
                            if (arr_0[i_18] != null && (regionmap_8.tileMasks[i_18][i_11][i_14] & 0x8) == 0) {
                                GraphNode_Sub1_Sub1 class521_sub1_sub1_21;
                                int i_23;
                                Class293 class293_26;
                                Class208 class208_27;
                                if (bool_16 && arr_0[i_18][i_11][i_14] != null) {
                                    if (arr_0[i_18][i_11][i_14].aTransform_Sub1_Sub5_3505 != null) {
                                        i_19 = Class125.method2172(i_12);
                                        if (arr_0[i_18][i_11][i_14].aTransform_Sub1_Sub5_3505.aShort9615 == i_19 || arr_0[i_18][i_11][i_14].aTransform_Sub1_Sub5_3502 != null && arr_0[i_18][i_11][i_14].aTransform_Sub1_Sub5_3502.aShort9615 == i_19) {
                                            continue;
                                        }
                                        if (i_13 != 0) {
                                            i_20 = Class125.method2172(i_13);
                                            if (arr_0[i_18][i_11][i_14].aTransform_Sub1_Sub5_3505.aShort9615 == i_20 || arr_0[i_18][i_11][i_14].aTransform_Sub1_Sub5_3502 != null && arr_0[i_18][i_11][i_14].aTransform_Sub1_Sub5_3502.aShort9615 == i_20) {
                                                continue;
                                            }
                                        }
                                        if (i_15 != 0) {
                                            i_20 = Class125.method2172(i_15);
                                            if (arr_0[i_18][i_11][i_14].aTransform_Sub1_Sub5_3505.aShort9615 == i_20 || arr_0[i_18][i_11][i_14].aTransform_Sub1_Sub5_3502 != null && arr_0[i_18][i_11][i_14].aTransform_Sub1_Sub5_3502.aShort9615 == i_20) {
                                                continue;
                                            }
                                        }
                                    }
                                    class293_26 = arr_0[i_18][i_11][i_14];
                                    if (class293_26.aClass208_3504 != null) {
                                        for (class208_27 = class293_26.aClass208_3504; class208_27 != null; class208_27 = class208_27.aClass208_2660) {
                                            class521_sub1_sub1_21 = class208_27.aTransform_Sub1_Sub1_2659;
                                            if (class521_sub1_sub1_21 instanceof WorldObject) {
                                                WorldObject sceneobject_28 = (WorldObject) class521_sub1_sub1_21;
                                                i_23 = sceneobject_28.method89();
                                                int i_24 = sceneobject_28.method92();
                                                if (i_23 == 21) {
                                                    i_23 = 19;
                                                }
                                                int i_25 = i_23 | i_24 << 6;
                                                if (i_12 == i_25 || i_13 != 0 && i_13 == i_25 || i_15 != 0 && i_15 == i_25) {
                                                    continue label270;
                                                }
                                            }
                                        }
                                    }
                                }
                                class293_26 = arr_0[i_18][i_11][i_14];
                                if (class293_26 != null && class293_26.aClass208_3504 != null) {
                                    for (class208_27 = class293_26.aClass208_3504; class208_27 != null; class208_27 = class208_27.aClass208_2660) {
                                        class521_sub1_sub1_21 = class208_27.aTransform_Sub1_Sub1_2659;
                                        if (class521_sub1_sub1_21.localX != class521_sub1_sub1_21.aShort9458 || class521_sub1_sub1_21.localY != class521_sub1_sub1_21.aShort9456) {
                                            for (int i_22 = class521_sub1_sub1_21.aShort9458; i_22 <= class521_sub1_sub1_21.localX; i_22++) {
                                                for (i_23 = class521_sub1_sub1_21.aShort9456; i_23 <= class521_sub1_sub1_21.localY; i_23++) {
                                                    bytes_6[i_18][i_22][i_23] = b_7;
                                                }
                                            }
                                        }
                                    }
                                }
                                bytes_6[i_18][i_11][i_14] = b_7;
                                bool_17 = true;
                            }
                        }
                    }
                    if (bool_17) {
                        i_18 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aGroundArray2591[Class4.MY_PLAYER_PLANE + 1].getHeight(i_11, i_14);
                        if (client.anIntArray7198[i_1] < i_18) {
                            client.anIntArray7198[i_1] = i_18;
                        }
                        i_19 = i_11 << 9;
                        i_20 = i_14 << 9;
                        if (client.anIntArray7303[i_1] > i_19) {
                            client.anIntArray7303[i_1] = i_19;
                        } else if (client.anIntArray7194[i_1] < i_19) {
                            client.anIntArray7194[i_1] = i_19;
                        }
                        if (client.anIntArray7306[i_1] > i_20) {
                            client.anIntArray7306[i_1] = i_20;
                        } else if (client.anIntArray7305[i_1] < i_20) {
                            client.anIntArray7305[i_1] = i_20;
                        }
                    }
                    if (!bool_16) {
                        if (i_11 >= 1 && b_7 != bytes_6[Class4.MY_PLAYER_PLANE][i_11 - 1][i_14]) {
                            client.anIntArray7243[i_29] = i_11 - 1 | 0x120000 | -754974720;
                            client.anIntArray7425[i_29] = i_14 | 0x130000;
                            i_29 = i_29 + 1 & 0xfff;
                            bytes_6[Class4.MY_PLAYER_PLANE][i_11 - 1][i_14] = b_7;
                        }
                        ++i_14;
                        if (i_14 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
                            if (i_11 - 1 >= 0 && b_7 != bytes_6[Class4.MY_PLAYER_PLANE][i_11 - 1][i_14] && (regionmap_8.tileMasks[Class4.MY_PLAYER_PLANE][i_11][i_14] & 0x4) == 0 && (regionmap_8.tileMasks[Class4.MY_PLAYER_PLANE][i_11 - 1][i_14 - 1] & 0x4) == 0) {
                                client.anIntArray7243[i_29] = i_11 - 1 | 0x120000 | 0x52000000;
                                client.anIntArray7425[i_29] = i_14 | 0x130000;
                                i_29 = i_29 + 1 & 0xfff;
                                bytes_6[Class4.MY_PLAYER_PLANE][i_11 - 1][i_14] = b_7;
                            }
                            if (b_7 != bytes_6[Class4.MY_PLAYER_PLANE][i_11][i_14]) {
                                client.anIntArray7243[i_29] = i_11 | 0x520000 | 0x13000000;
                                client.anIntArray7425[i_29] = i_14 | 0x530000;
                                i_29 = i_29 + 1 & 0xfff;
                                bytes_6[Class4.MY_PLAYER_PLANE][i_11][i_14] = b_7;
                            }
                            if (i_11 + 1 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && bytes_6[Class4.MY_PLAYER_PLANE][i_11 + 1][i_14] != b_7 && (regionmap_8.tileMasks[Class4.MY_PLAYER_PLANE][i_11][i_14] & 0x4) == 0 && (regionmap_8.tileMasks[Class4.MY_PLAYER_PLANE][i_11 + 1][i_14 - 1] & 0x4) == 0) {
                                client.anIntArray7243[i_29] = i_11 + 1 | 0x520000 | -1845493760;
                                client.anIntArray7425[i_29] = i_14 | 0x530000;
                                i_29 = i_29 + 1 & 0xfff;
                                bytes_6[Class4.MY_PLAYER_PLANE][i_11 + 1][i_14] = b_7;
                            }
                        }
                        --i_14;
                        if (i_11 + 1 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && b_7 != bytes_6[Class4.MY_PLAYER_PLANE][i_11 + 1][i_14]) {
                            client.anIntArray7243[i_29] = i_11 + 1 | 0x920000 | 0x53000000;
                            client.anIntArray7425[i_29] = i_14 | 0x930000;
                            i_29 = i_29 + 1 & 0xfff;
                            bytes_6[Class4.MY_PLAYER_PLANE][i_11 + 1][i_14] = b_7;
                        }
                        --i_14;
                        if (i_14 >= 0) {
                            if (i_11 - 1 >= 0 && b_7 != bytes_6[Class4.MY_PLAYER_PLANE][i_11 - 1][i_14] && (regionmap_8.tileMasks[Class4.MY_PLAYER_PLANE][i_11][i_14] & 0x4) == 0 && (regionmap_8.tileMasks[Class4.MY_PLAYER_PLANE][i_11 - 1][i_14 + 1] & 0x4) == 0) {
                                client.anIntArray7243[i_29] = i_11 - 1 | 0xd20000 | 0x12000000;
                                client.anIntArray7425[i_29] = i_14 | 0xd30000;
                                i_29 = i_29 + 1 & 0xfff;
                                bytes_6[Class4.MY_PLAYER_PLANE][i_11 - 1][i_14] = b_7;
                            }
                            if (b_7 != bytes_6[Class4.MY_PLAYER_PLANE][i_11][i_14]) {
                                client.anIntArray7243[i_29] = i_11 | 0xd20000 | -1828716544;
                                client.anIntArray7425[i_29] = i_14 | 0xd30000;
                                i_29 = i_29 + 1 & 0xfff;
                                bytes_6[Class4.MY_PLAYER_PLANE][i_11][i_14] = b_7;
                            }
                            if (i_11 + 1 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && bytes_6[Class4.MY_PLAYER_PLANE][i_11 + 1][i_14] != b_7 && (regionmap_8.tileMasks[Class4.MY_PLAYER_PLANE][i_11][i_14] & 0x4) == 0 && (regionmap_8.tileMasks[Class4.MY_PLAYER_PLANE][i_11 + 1][i_14 + 1] & 0x4) == 0) {
                                client.anIntArray7243[i_29] = i_11 + 1 | 0x920000 | -771751936;
                                client.anIntArray7425[i_29] = i_14 | 0x930000;
                                i_29 = i_29 + 1 & 0xfff;
                                bytes_6[Class4.MY_PLAYER_PLANE][i_11 + 1][i_14] = b_7;
                            }
                        }
                    }
                }
                if (client.anIntArray7198[i_1] != -1000000) {
                    client.anIntArray7198[i_1] += 40;
                    client.anIntArray7303[i_1] -= 512;
                    client.anIntArray7194[i_1] += 512;
                    client.anIntArray7305[i_1] += 512;
                    client.anIntArray7306[i_1] -= 512;
                }
                return true;
            }
        }
    }

    public static Object method5493(byte[] bytes_0) {
        if (bytes_0 == null) {
            return null;
        } else if (bytes_0.length > 136) {
            ByteBuffer bytebuffer_3 = ByteBuffer.allocateDirect(bytes_0.length);
            bytebuffer_3.position(0);
            bytebuffer_3.put(bytes_0);
            return bytebuffer_3;
        } else {
            return bytes_0;
        }
    }

    public boolean init() {
        if (buffer != null) {
            return true;
        } else {
            if (tableRequest == null) {
                if (standardRequester.priorityUnavailable()) {
                    return false;
                }
                tableRequest = standardRequester.request(255, 255, (byte) 0, true);
            }
            if (tableRequest.waiting) {
                return false;
            } else {
                ByteBuf stream = new ByteBuf(tableRequest.getData());
                stream.index = 5;
                int indiceLength = stream.readUnsignedByte();
                stream.index += indiceLength * 72;
                byte[] encrypted = new byte[stream.buffer.length - stream.index];
                stream.readBytes(encrypted, 0, encrypted.length);
                byte[] decrypted;
                if (updateServerExponent != null && updateServerModulus != null) {
                    BigInteger biginteger_6 = new BigInteger(encrypted);
                    BigInteger biginteger_7 = biginteger_6.modPow(updateServerExponent, updateServerModulus);
                    decrypted = biginteger_7.toByteArray();
                } else {
                    decrypted = encrypted;
                }
                if (decrypted.length != 65 && decrypted.length != 64) {
                    System.out.println("Invalid length: " + decrypted.length);
                    System.out.println(Arrays.toString(decrypted));
                    throw new RuntimeException();
                } else {
                    byte[] whirlpool = Class361.getWhirlpool(stream.buffer, 5, stream.index - encrypted.length - 5);
                    for (int i_8 = 0; i_8 < 64; i_8++) {
                        if (whirlpool[i_8] != decrypted[i_8 + (decrypted.length == 65 ? 1 : 0)]) {
                            throw new RuntimeException();
                        }
                    }
                    grabWorkers = new JS5GrabWorker[indiceLength];
                    buffer = stream;
                    return true;
                }
                // if (decrypted.length != 65) {
                // System.out.println("Invalid length: " + decrypted.length);
                // System.out.println(Arrays.toString(decrypted));
                // throw new RuntimeException();
                // } else {
                // byte[] whirlpool = Class361.getWhirlpool(stream.buffer, 5, stream.index -
                // encrypted.length - 5);
                //
                // for (int i_8 = 0; i_8 < 64; i_8++) {
                // if (whirlpool[i_8] != decrypted[i_8 + 1]) {
                // throw new RuntimeException();
                // }
                // }
                //
                // this.grabWorkers = new JS5GrabWorker[indiceLength];
                // this.buffer = stream;
                // return true;
                // }
            }
        }
    }

    JS5GrabWorker method5478(int i_1, JS5CacheFile js5cachefile_2, JS5CacheFile js5cachefile_3) {
        if (buffer == null) {
            throw new RuntimeException();
        } else if (i_1 >= 0 && i_1 < grabWorkers.length) {
            if (grabWorkers[i_1] != null) {
                return grabWorkers[i_1];
            } else {
                buffer.index = i_1 * 72 + 6;
                int i_6 = buffer.readInt();
                int i_7 = buffer.readInt();
                byte[] bytes_8 = new byte[64];
                buffer.readBytes(bytes_8, 0, 64);
                JS5GrabWorker js5grabworker_9 = new JS5GrabWorker(i_1, js5cachefile_2, js5cachefile_3, standardRequester, localRequester, i_6, bytes_8, i_7);
                grabWorkers[i_1] = js5grabworker_9;
                return js5grabworker_9;
            }
        } else {
            throw new RuntimeException();
        }
    }

    public JS5GrabWorker method5480(int i_1, JS5CacheFile js5cachefile_2, JS5CacheFile js5cachefile_3) {
        return method5478(i_1, js5cachefile_2, js5cachefile_3);
    }

    public void pulse() {
        if (grabWorkers != null) {
            int i_2;
            for (i_2 = 0; i_2 < grabWorkers.length; i_2++) {
                if (grabWorkers[i_2] != null) {
                    grabWorkers[i_2].processCheck();
                }
            }
            for (i_2 = 0; i_2 < grabWorkers.length; i_2++) {
                if (grabWorkers[i_2] != null) {
                    grabWorkers[i_2].method12552();
                }
            }
        }
    }
}
