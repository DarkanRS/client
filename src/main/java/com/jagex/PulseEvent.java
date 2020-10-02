package com.jagex;

public class PulseEvent extends CacheableNode {

    static Queue aClass477_9666 = new Queue();
    static Queue aClass477_9655 = new Queue();
    static IterableNodeMap aClass465_9667 = new IterableNodeMap(16);
    String string;
    int secondary;
    int tertiary;
    int primary;

    PulseEvent(int type, long data) {
        this.pointer = (long) type << 56 | data;
    }

    static PulseEvent createPulseEvent(int i_0, long long_1) {
        PulseEvent class282_sub50_sub12_3 = (PulseEvent) aClass465_9667.get((long) i_0 << 56 | long_1);
        if (class282_sub50_sub12_3 == null) {
            class282_sub50_sub12_3 = new PulseEvent(i_0, long_1);
            aClass465_9667.put(class282_sub50_sub12_3, class282_sub50_sub12_3.pointer);
        }
        return class282_sub50_sub12_3;
    }

    static void processPulseEvents() {
        for (int i_1 = Class158_Sub1.PLAYER_VAR_PROVIDER.poll(true); i_1 != -1; i_1 = Class158_Sub1.PLAYER_VAR_PROVIDER.poll(false)) {
            Class499.method8333(i_1);
            client.anIntArray7379[++client.anInt7453 - 1 & 0x1f] = i_1;
        }
        for (PulseEvent event = ObjectDefinition.nextPulseEvent(); event != null; event = ObjectDefinition.nextPulseEvent()) {
            int type = event.getType();
            long value = event.method14967();
            if (type == 1) {
                Class320.VARC_INT[(int) value] = event.primary;
                client.NEEDS_VARC_SAVE |= Node_Sub17_Sub2.IS_VARC_SAVE_TO_FILE[(int) value];
                client.anIntArray7150[++client.anInt7368 - 1 & 0x1f] = (int) value;
            } else if (type == 2) {
                Class462.VARC_STRING[(int) value] = event.string;
                client.anIntArray7387[++client.anInt7388 - 1 & 0x1f] = (int) value;
            } else if (type == 3) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                if (!event.string.equals(icomponentdefinitions_5.text)) {
                    icomponentdefinitions_5.text = event.string;
                    IComponentDefinitions.redrawComponent(icomponentdefinitions_5);
                }
            } else if (type == 22) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                if (event.primary == 1 != icomponentdefinitions_5.textAntiMacro) {
                    icomponentdefinitions_5.textAntiMacro = event.primary == 1;
                    IComponentDefinitions.redrawComponent(icomponentdefinitions_5);
                }
            } else if (type == 4) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                ModelType i_6 = ModelType.forId(event.primary);
                int i_7 = event.secondary;
                int i_8 = event.tertiary;
                if (i_6 != icomponentdefinitions_5.modelType || i_7 != icomponentdefinitions_5.modelId || i_8 != icomponentdefinitions_5.anInt1339) {
                    icomponentdefinitions_5.modelType = i_6;
                    icomponentdefinitions_5.modelId = i_7;
                    icomponentdefinitions_5.anInt1339 = i_8;
                    icomponentdefinitions_5.npcMeshModifier = null;
                    IComponentDefinitions.redrawComponent(icomponentdefinitions_5);
                }
            } else if (type == 5) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                if (event.primary != icomponentdefinitions_5.animation) {
                    if (event.primary != -1) {
                        if (icomponentdefinitions_5.anim == null) {
                            icomponentdefinitions_5.anim = new Animation_Sub1();
                        }
                        icomponentdefinitions_5.anim.update(event.primary);
                    } else {
                        icomponentdefinitions_5.anim = null;
                    }
                    icomponentdefinitions_5.animation = event.primary;
                    IComponentDefinitions.redrawComponent(icomponentdefinitions_5);
                }
            } else if (type == 6) {
                int i_12 = event.primary;
                int i_6 = i_12 >> 10 & 0x1f;
                int i_7 = i_12 >> 5 & 0x1f;
                int i_8 = i_12 & 0x1f;
                int i_9 = (i_7 << 11) + (i_6 << 19) + (i_8 << 3);
                IComponentDefinitions icomponentdefinitions_10 = IComponentDefinitions.getDefs((int) value);
                if (i_9 != icomponentdefinitions_10.color) {
                    icomponentdefinitions_10.color = i_9;
                    IComponentDefinitions.redrawComponent(icomponentdefinitions_10);
                }
            } else if (type == 7) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                boolean bool_13 = event.primary == 1;
                if (bool_13 != icomponentdefinitions_5.hidden) {
                    icomponentdefinitions_5.hidden = bool_13;
                    IComponentDefinitions.redrawComponent(icomponentdefinitions_5);
                }
            } else if (type == 8) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                if (event.primary != icomponentdefinitions_5.spritePitch || event.secondary != icomponentdefinitions_5.spriteRoll || icomponentdefinitions_5.spriteScale != event.tertiary) {
                    icomponentdefinitions_5.spritePitch = event.primary;
                    icomponentdefinitions_5.spriteRoll = event.secondary;
                    icomponentdefinitions_5.spriteScale = event.tertiary;
                    if (icomponentdefinitions_5.containerItemId != -1) {
                        if (icomponentdefinitions_5.aspectWidth > 0) {
                            icomponentdefinitions_5.spriteScale = icomponentdefinitions_5.spriteScale * 32 / icomponentdefinitions_5.aspectWidth;
                        } else if (icomponentdefinitions_5.baseWidth > 0) {
                            icomponentdefinitions_5.spriteScale = icomponentdefinitions_5.spriteScale * 32 / icomponentdefinitions_5.baseWidth;
                        }
                    }
                    IComponentDefinitions.redrawComponent(icomponentdefinitions_5);
                }
            } else if (type == 9) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                if (icomponentdefinitions_5.containerItemId != event.primary || event.secondary != icomponentdefinitions_5.anInt1427) {
                    icomponentdefinitions_5.containerItemId = event.primary;
                    icomponentdefinitions_5.anInt1427 = event.secondary;
                    IComponentDefinitions.redrawComponent(icomponentdefinitions_5);
                }
            } else if (type == 10) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                if (event.primary != icomponentdefinitions_5.offsetX || event.secondary != icomponentdefinitions_5.offsetY || event.tertiary != icomponentdefinitions_5.spriteYaw) {
                    icomponentdefinitions_5.offsetX = event.primary;
                    icomponentdefinitions_5.offsetY = event.secondary;
                    icomponentdefinitions_5.spriteYaw = event.tertiary;
                    IComponentDefinitions.redrawComponent(icomponentdefinitions_5);
                }
            } else if (type == 11) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                icomponentdefinitions_5.aspectXType = 0;
                icomponentdefinitions_5.x = icomponentdefinitions_5.basePositionX = event.primary;
                icomponentdefinitions_5.aspectYType = 0;
                icomponentdefinitions_5.y = icomponentdefinitions_5.basePositionY = event.secondary;
                IComponentDefinitions.redrawComponent(icomponentdefinitions_5);
            } else if (type == 12) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                int i_6 = event.primary;
                if (icomponentdefinitions_5 != null && icomponentdefinitions_5.type == ComponentType.CONTAINER) {
                    if (i_6 > icomponentdefinitions_5.scrollHeight - icomponentdefinitions_5.height) {
                        i_6 = icomponentdefinitions_5.scrollHeight - icomponentdefinitions_5.height;
                    }
                    if (i_6 < 0) {
                        i_6 = 0;
                    }
                    if (i_6 != icomponentdefinitions_5.scrollY) {
                        icomponentdefinitions_5.scrollY = i_6;
                        IComponentDefinitions.redrawComponent(icomponentdefinitions_5);
                    }
                }
            } else if (type == 14) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                icomponentdefinitions_5.spriteId = event.primary;
            } else if (type == 15) {
                Class187.aBool2360 = true;
                Class187.anInt2361 = event.primary;
                Class187.anInt2359 = event.secondary;
            } else if (type == 16) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                icomponentdefinitions_5.fontId = event.primary;
            } else if (type == 20) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                icomponentdefinitions_5.monospaced = event.primary == 1;
            } else if (type == 21) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                icomponentdefinitions_5.clickMask = event.primary == 1;
            } else if (type == 17) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                icomponentdefinitions_5.anInt1435 = event.primary;
            } else if (type == 18) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                int i_6 = (int) (value >> 32);
                icomponentdefinitions_5.recolor(i_6, (short) event.primary, (short) event.secondary);
            } else if (type == 19) {
                IComponentDefinitions icomponentdefinitions_5 = IComponentDefinitions.getDefs((int) value);
                int i_6 = (int) (value >> 32);
                icomponentdefinitions_5.retexture(i_6, (short) event.primary, (short) event.secondary);
            }
        }
    }

    static void method7917(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(14, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method11155(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(15, 0L);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = i_0;
        class282_sub50_sub12_3.secondary = i_1;
    }

    static void setComponentItem(int i_0, int i_1, int i_2) {
        PulseEvent class282_sub50_sub12_4 = createPulseEvent(9, i_0);
        class282_sub50_sub12_4.immediate();
        class282_sub50_sub12_4.primary = i_1;
        class282_sub50_sub12_4.secondary = i_2;
    }

    static void setIFContent(int i_0, int i_1, int i_2, int i_3) {
        PulseEvent class282_sub50_sub12_5 = PulseEvent.createPulseEvent(4, i_0);
        class282_sub50_sub12_5.immediate();
        class282_sub50_sub12_5.primary = i_1;
        class282_sub50_sub12_5.secondary = i_2;
        class282_sub50_sub12_5.tertiary = i_3;
    }

    static void setComponentPosition(int component, int x, int y) {
        PulseEvent event = PulseEvent.createPulseEvent(11, component);
        event.immediate();
        event.primary = x;
        event.secondary = y;
    }

    static void method8722(int i_0, int i_1, int i_2, int i_3) {
        PulseEvent class282_sub50_sub12_5 = PulseEvent.createPulseEvent(18, (long) i_1 << 32 | i_0);
        class282_sub50_sub12_5.immediate();
        class282_sub50_sub12_5.primary = i_2;
        class282_sub50_sub12_5.secondary = i_3;
    }

    static void method7374(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(6, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method6751(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(1, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method5924(int i_0, boolean bool_1) {
        PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(21, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = bool_1 ? 1 : 0;
    }

    static void method12420(int i_0, int i_1, int i_2, int i_3) {
        PulseEvent class282_sub50_sub12_5 = PulseEvent.createPulseEvent(19, (long) i_1 << 32 | i_0);
        class282_sub50_sub12_5.immediate();
        class282_sub50_sub12_5.primary = i_2;
        class282_sub50_sub12_5.secondary = i_3;
    }

    static void method15381(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(17, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method15435(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(16, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method778(int i_0, int i_1, int i_2, int i_3) {
        PulseEvent class282_sub50_sub12_5 = PulseEvent.createPulseEvent(10, i_0);
        class282_sub50_sub12_5.immediate();
        class282_sub50_sub12_5.primary = i_1;
        class282_sub50_sub12_5.secondary = i_2;
        class282_sub50_sub12_5.tertiary = i_3;
    }

    static void method12882(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(13, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method3252(int i_0, boolean bool_1) {
        PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(22, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = bool_1 ? 1 : 0;
    }

    static void method2966(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(12, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method14663(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(7, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void rotateComponentSprite(int interfaceHash, int pitch, int roll, int scale) {
        PulseEvent event = PulseEvent.createPulseEvent(8, interfaceHash);
        event.immediate();
        event.primary = pitch;
        event.secondary = roll;
        event.tertiary = scale;
    }

    static void method3069(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(5, i_0);
        class282_sub50_sub12_3.immediate();
        class282_sub50_sub12_3.primary = i_1;
    }

    int getType() {
        return (int) (pointer >>> 56 & 0xffL);
    }

    long method14955() {
        return key & 0x7fffffffffffffffL;
    }

    void method14965() {
        key = key & -9223372036854775808L | Utils.time() + 500L;
        aClass477_9655.method7936(this);
    }

    long method14967() {
        return pointer & 0xffffffffffffffL;
    }

    void immediate() {
        key |= -9223372036854775808L;
        if (method14955() == 0L) {
            aClass477_9666.method7936(this);
        }
    }
}
