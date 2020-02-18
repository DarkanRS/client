package com.jagex;

public class Preference_Sub1 extends Preference {

    public Preference_Sub1(GamePreferences class282_sub54_1) {
        super(class282_sub54_1);
    }

    public Preference_Sub1(int i_1, GamePreferences class282_sub54_2) {
        super(i_1, class282_sub54_2);
    }

    static boolean method12619() {
        return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5877);
    }

    static int method12620(WorldDescriptor world1, WorldDescriptor world2, int i_2, boolean bool_3) {
        int i_5;
        int i_6;
        if (i_2 == 1) {
            i_5 = world1.playerCount;
            i_6 = world2.playerCount;
            if (!bool_3) {
                if (i_5 == -1) {
                    i_5 = 2001;
                }

                if (i_6 == -1) {
                    i_6 = 2001;
                }
            }

            return i_5 - i_6;
        } else if (i_2 == 2) {
            return Class455.method7557(world1.getWorld().activity, world2.getWorld().activity, Class223.CURRENT_LANGUAGE);
        } else if (i_2 == 3) {
            return "-".equals(world1.unknown) ? ("-".equals(world2.unknown) ? 0 : (bool_3 ? -1 : 1)) : ("-".equals(world2.unknown) ? (bool_3 ? 1 : -1) : Class455.method7557(world1.unknown, world2.unknown, Class223.CURRENT_LANGUAGE));
        } else if (i_2 == 4) {
            return world1.isLootshare() ? (world2.isLootshare() ? 0 : 1) : (world2.isLootshare() ? -1 : 0);
        } else if (i_2 == 5) {
            return world1.is0x2() ? (world2.is0x2() ? 0 : 1) : (world2.is0x2() ? -1 : 0);
        } else if (i_2 == 6) {
            return world1.is0x4() ? (world2.is0x4() ? 0 : 1) : (world2.is0x4() ? -1 : 0);
        } else if (i_2 == 7) {
            return world1.isMembers() ? (world2.isMembers() ? 0 : 1) : (world2.isMembers() ? -1 : 0);
        } else if (i_2 == 8) {
            i_5 = world1.ping;
            i_6 = world2.ping;
            if (bool_3) {
                if (i_5 == 1000) {
                    i_5 = -1;
                }

                if (i_6 == 1000) {
                    i_6 = -1;
                }
            } else {
                if (i_5 == -1) {
                    i_5 = 1000;
                }

                if (i_6 == -1) {
                    i_6 = 1000;
                }
            }

            return i_5 - i_6;
        } else {
            return world1.worldNumber - world2.worldNumber;
        }
    }

    @Override
    void setValue(int i_1) {
        anInt5578 = i_1;
    }

    @Override
    int getDefaultValue() {
        return MapSize.aClass106_1075.anInt1071;
    }

    public boolean method12609() {
        int i_2 = manager.getProcessorSpecs().getMaxMemory();
        return i_2 >= 245;
    }

    @Override
    public int checkValid(int i_1) {
        int i_3 = manager.getProcessorSpecs().getMaxMemory();
        return i_3 < 245 ? 3 : (i_1 == MapSize.aClass106_1073.anInt1071 && i_3 < 500 ? 3 : 1);
    }

    public int method7784(int i_1) {
        int i_2 = manager.getProcessorSpecs().getMaxMemory();
        return i_2 < 245 ? 3 : (MapSize.aClass106_1073.anInt1071 * -827615537 * -530599889 == i_1 && i_2 < 500 ? 3 : 1);
    }

    void method7780(int i_1) {
        anInt5578 = i_1 * -754033619 * -859024475;
    }

    int method7786() {
        return -530599889 * MapSize.aClass106_1075.anInt1071 * -827615537;
    }

    int method7787() {
        return -530599889 * MapSize.aClass106_1075.anInt1071 * -827615537;
    }

    public int method12615() {
        return anInt5578;
    }

    public void method12616() {
        int i_2 = manager.getProcessorSpecs().getMaxMemory();
        if (i_2 < 245) {
            anInt5578 = MapSize.aClass106_1075.anInt1071;
        }

        if (anInt5578 == MapSize.aClass106_1073.anInt1071 && i_2 < 500) {
            anInt5578 = MapSize.aClass106_1072.anInt1071;
        }

        if (anInt5578 < MapSize.aClass106_1075.anInt1071 || anInt5578 > MapSize.aClass106_1070.anInt1071) {
            anInt5578 = getDefaultValue();
        }

    }

}
