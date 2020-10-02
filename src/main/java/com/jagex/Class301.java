package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class301 implements Interface41 {

    public static int anInt3556;
    static int anInt3555;
    boolean aBool3554;

    String aString3553;

    Class301(String string_1) {
        aString3553 = string_1;
    }

    public static StaticElements getStaticElements(Index index_0, String archiveName, boolean members) {
        int archiveId = index_0.getArchiveId(archiveName);
        if (archiveId == -1) {
            return new StaticElements(0);
        } else {
            int[] fileIds = index_0.getValidFileIds(archiveId);
            StaticElements elements = new StaticElements(fileIds.length);
            int id = 0;
            int fileIndex = 0;
            while (true) {
                while (id < elements.size) {
                    ByteBuf buffer = new ByteBuf(index_0.getFile(archiveId, fileIds[fileIndex++]));
                    int regionHash = buffer.readInt();
                    int areaId = buffer.readUnsignedShort();
                    int isMembers = buffer.readUnsignedByte();
                    if (!members && isMembers == 1) {
                        --elements.size;
                    } else {
                        elements.regionHashes[id] = regionHash;
                        elements.areaIds[id] = areaId;
                        ++id;
                    }
                }
                return elements;
            }
        }
    }

    static void method5333() {
        if (Class179.anInt2221 < 102) {
            Class179.anInt2221 += 6;
        }
        int i_1;
        if (Class179.anInt2231 != -1 && Class179.aLong2232 < Utils.time()) {
            for (i_1 = Class179.anInt2231; i_1 < Class276.aStringArray3345.length; i_1++) {
                if (Class276.aStringArray3345[i_1].startsWith("pause")) {
                    int i_2 = 5;
                    try {
                        i_2 = Integer.parseInt(Class276.aStringArray3345[i_1].substring(6));
                    } catch (Exception ignored) {
                    }
                    Class209.printConsoleMessage("Pausing for " + i_2 + " seconds...");
                    Class179.anInt2231 = i_1 + 1;
                    Class179.aLong2232 = Utils.time() + (i_2 * 1000);
                    return;
                }
                Class179.aString2225 = Class276.aStringArray3345[i_1];
                Class165.method2853(false);
            }
            Class179.anInt2231 = -1;
        }
        if (client.anInt7191 != 0) {
            Class179.anInt2223 -= client.anInt7191 * 5;
            if (Class179.anInt2223 >= Class179.anInt2227) {
                Class179.anInt2223 = Class179.anInt2227 - 1;
            }
            if (Class179.anInt2223 < 0) {
                Class179.anInt2223 = 0;
            }
            client.anInt7191 = 0;
        }
        for (i_1 = 0; i_1 < client.anInt7193; i_1++) {
            KeyRecord interface16_9 = client.KEYS_PRESSED[i_1];
            int i_10 = interface16_9.getCode();
            char var_4 = interface16_9.getCharacter();
            int i_5 = interface16_9.getFlags();
            if (i_10 == 84) {
                Class165.method2853(false);
            }
            if (i_10 == 80) {
                Class165.method2853(true);
            } else if (i_10 == 66 && (i_5 & 0x4) != 0) {
                if (Class182.aClipboard2263 != null) {
                    String str_14 = "";
                    for (int i_7 = Class13.aStringArray129.length - 1; i_7 >= 0; --i_7) {
                        if (Class13.aStringArray129[i_7] != null && !Class13.aStringArray129[i_7].isEmpty()) {
                            str_14 = str_14 + Class13.aStringArray129[i_7] + '\n';
                        }
                    }
                    Class182.aClipboard2263.setContents(new StringSelection(str_14), null);
                }
            } else if (i_10 == 67 && (i_5 & 0x4) != 0) {
                if (Class182.aClipboard2263 != null) {
                    try {
                        Transferable transferable_6 = Class182.aClipboard2263.getContents(null);
                        if (transferable_6 != null) {
                            String string_11 = (String) transferable_6.getTransferData(DataFlavor.stringFlavor);
                            if (string_11 != null) {
                                String[] arr_8 = MovingAnimation.method12681(string_11, '\n');
                                Class341.method6074(arr_8);
                            }
                        }
                    } catch (Exception ignored) {
                    }
                }
            } else if (i_10 == 85 && Class179.anInt2220 > 0) {
                Class179.aString2225 = Class179.aString2225.substring(0, Class179.anInt2220 - 1) + Class179.aString2225.substring(Class179.anInt2220);
                --Class179.anInt2220;
            } else if (i_10 == 101 && Class179.anInt2220 < Class179.aString2225.length()) {
                Class179.aString2225 = Class179.aString2225.substring(0, Class179.anInt2220) + Class179.aString2225.substring(Class179.anInt2220 + 1);
            } else if (i_10 == 96 && Class179.anInt2220 > 0) {
                --Class179.anInt2220;
            } else if (i_10 == 97 && Class179.anInt2220 < Class179.aString2225.length()) {
                ++Class179.anInt2220;
            } else if (i_10 == 102) {
                Class179.anInt2220 = 0;
            } else if (i_10 == 103) {
                Class179.anInt2220 = Class179.aString2225.length();
            } else if (i_10 == 104 && Class179.anInt2226 < Class13.aStringArray129.length) {
                ++Class179.anInt2226;
                Class534.method11441();
                Class179.anInt2220 = Class179.aString2225.length();
            } else if (i_10 == 105 && Class179.anInt2226 > 0) {
                --Class179.anInt2226;
                Class534.method11441();
                Class179.anInt2220 = Class179.aString2225.length();
            } else if (Class380.method6450(var_4) || "\\/.:, _-+[]~@".indexOf(var_4) != -1) {
                Class179.aString2225 = Class179.aString2225.substring(0, Class179.anInt2220) + client.KEYS_PRESSED[i_1].getCharacter() + Class179.aString2225.substring(Class179.anInt2220);
                ++Class179.anInt2220;
            }
        }
        client.anInt7193 = 0;
        client.maximumHeldKeys = 0;
        Static.method6378();
    }

    static boolean method5334(int i_0, int i_1) {
        return i_1 >= 1000 && i_0 < 1000 || (i_1 < 1000 && i_0 < 1000 ? (CutsceneAction_Sub4.method13788(i_0) || !CutsceneAction_Sub4.method13788(i_1)) : i_1 >= 1000 && i_0 >= 1000);
    }

    @Override
    public Class445 method230() {
        return Class445.aClass445_5383;
    }

    @Override
    public Class445 method235() {
        return Class445.aClass445_5383;
    }

    @Override
    public int method231() {
        if (aBool3554) {
            return 100;
        } else {
            int i_1 = IndexLoaders.NATIVE_LIBRARY_LOADER.method4648(aString3553);
            if (i_1 >= 0 && i_1 <= 100) {
                return i_1;
            } else {
                aBool3554 = true;
                return 100;
            }
        }
    }

    @Override
    public Class445 method232() {
        return Class445.aClass445_5383;
    }

    @Override
    public Class445 method233() {
        return Class445.aClass445_5383;
    }

    @Override
    public Class445 method234() {
        return Class445.aClass445_5383;
    }

    boolean method5328() {
        return aBool3554;
    }

    @Override
    public int getCompletion() {
        if (aBool3554) {
            return 100;
        } else {
            int i_2 = IndexLoaders.NATIVE_LIBRARY_LOADER.method4648(aString3553);
            if (i_2 >= 0 && i_2 <= 100) {
                return i_2;
            } else {
                aBool3554 = true;
                return 100;
            }
        }
    }
}
