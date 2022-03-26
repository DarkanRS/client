package com.jagex;

public class PulseEvent extends CacheableNode {
	
	public enum EventType {
		SET_VARC,
		SET_VARCSTR,
		IF_SETTEXT,
		IF_SETMODEL,
		IF_SETANIM,
		IF_SETCOLORINT,
		IF_SETHIDDEN,
		IF_SET_SPRITE_TRANSFORM,
		IF_SETITEM,
		IF_SETOFFSET,
		IF_SETPOS,
		IF_SET_SCROLL_Y,
		DEPRECATED_PACKET_EVENT,
		IF_SETSPRITE,
		SET_MINIMAP_FLAG,
		IF_SETFONT,
		IF_SETVORBISID,
		IF_MODEL_RECOLOR,
		IF_MODEL_RETEXTURE,
		IF_SETMONOSPACE,
		IF_SETMASKCLICKS,
		IF_SETTEXTANTIMACRO;
		
		public long getId() {
			return (long) ordinal()+1;
		}
		
		public static EventType forId(int id) {
			return EventType.values()[id-1];
		}
	}

    static Queue aClass477_9666 = new Queue();
    static Queue<PulseEvent> PULSE_EVENT_QUEUE = new Queue<>();
    static IterableNodeMap aClass465_9667 = new IterableNodeMap(16);
    String string;
    int secondary;
    int tertiary;
    int primary;

    PulseEvent(EventType type, long data) {
        this.pointer = type.getId() << 56 | data;
    }

    static void processPulseEvents() {
        for (int i_1 = Class158_Sub1.PLAYER_VAR_PROVIDER.poll(true); i_1 != -1; i_1 = Class158_Sub1.PLAYER_VAR_PROVIDER.poll(false)) {
            Class499.method8333(i_1);
            client.anIntArray7379[++client.anInt7453 - 1 & 0x1f] = i_1;
        }
        for (PulseEvent event = ObjectDefinition.nextPulseEvent(); event != null; event = ObjectDefinition.nextPulseEvent()) {
        	EventType type = EventType.forId(event.getType());
        	if (type == null) {
        		System.err.println("Unknown event type: " + event.getType());
        		continue;
        	}
            long value = event.getPointer();
     
            switch(type) {
            case SET_VARC:
            	Class320.VARC_INT[(int) value] = event.primary;
                client.NEEDS_VARC_SAVE |= Node_Sub17_Sub2.IS_VARC_SAVE_TO_FILE[(int) value];
                client.anIntArray7150[++client.anInt7368 - 1 & 0x1f] = (int) value;
            	break;
            case SET_VARCSTR:
            	Class462.VARC_STRING[(int) value] = event.string;
                client.anIntArray7387[++client.anInt7388 - 1 & 0x1f] = (int) value;
            	break;
            case IF_SETTEXT: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                if (!event.string.equals(component.text)) {
                    component.text = event.string;
                    IComponentDefinitions.redrawComponent(component);
                }
            }
            	break;
            case IF_SETMODEL: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                ModelType i_6 = ModelType.forId(event.primary);
                int i_7 = event.secondary;
                int i_8 = event.tertiary;
                if (i_6 != component.modelType || i_7 != component.modelId || i_8 != component.anInt1339) {
                    component.modelType = i_6;
                    component.modelId = i_7;
                    component.anInt1339 = i_8;
                    component.npcMeshModifier = null;
                    IComponentDefinitions.redrawComponent(component);
                }
            }
            	break;
            case IF_SETANIM: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                if (event.primary != component.animation) {
                    if (event.primary != -1) {
                        if (component.anim == null) {
                            component.anim = new Animation_Sub1();
                        }
                        component.anim.update(event.primary);
                    } else {
                        component.anim = null;
                    }
                    component.animation = event.primary;
                    IComponentDefinitions.redrawComponent(component);
                }
            }
            	break;
            case IF_SETCOLORINT:
                int i_12 = event.primary;
                int r = i_12 >> 10 & 0x1f;
                int g = i_12 >> 5 & 0x1f;
                int b = i_12 & 0x1f;
                int color = (g << 11) + (r << 19) + (b << 3);
                IComponentDefinitions icomponentdefinitions_10 = IComponentDefinitions.getDefs((int) value);
                if (color != icomponentdefinitions_10.color) {
                    icomponentdefinitions_10.color = color;
                    IComponentDefinitions.redrawComponent(icomponentdefinitions_10);
                }
            	break;
            case IF_SETHIDDEN: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                 boolean bool_13 = event.primary == 1;
                 if (bool_13 != component.hidden) {
                     component.hidden = bool_13;
                     IComponentDefinitions.redrawComponent(component);
                 }
            }
            	break;
            case IF_SET_SPRITE_TRANSFORM: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                if (event.primary != component.spritePitch || event.secondary != component.spriteRoll || component.spriteScale != event.tertiary) {
                    component.spritePitch = event.primary;
                    component.spriteRoll = event.secondary;
                    component.spriteScale = event.tertiary;
                    if (component.containerItemId != -1) {
                        if (component.aspectWidth > 0) {
                            component.spriteScale = component.spriteScale * 32 / component.aspectWidth;
                        } else if (component.baseWidth > 0) {
                            component.spriteScale = component.spriteScale * 32 / component.baseWidth;
                        }
                    }
                    IComponentDefinitions.redrawComponent(component);
                }
            }
            	break;
            case IF_SETITEM: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                 if (component.containerItemId != event.primary || event.secondary != component.anInt1427) {
                     component.containerItemId = event.primary;
                     component.anInt1427 = event.secondary;
                     IComponentDefinitions.redrawComponent(component);
                 }
            }
            	break;
            case IF_SETOFFSET: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                if (event.primary != component.offsetX || event.secondary != component.offsetY || event.tertiary != component.spriteYaw) {
                    component.offsetX = event.primary;
                    component.offsetY = event.secondary;
                    component.spriteYaw = event.tertiary;
                    IComponentDefinitions.redrawComponent(component);
                }
            }
            	break;
            case IF_SETPOS: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                component.aspectXType = 0;
                component.x = component.basePositionX = event.primary;
                component.aspectYType = 0;
                component.y = component.basePositionY = event.secondary;
                IComponentDefinitions.redrawComponent(component);
            	break;
            }
            case IF_SET_SCROLL_Y: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                int scrollY = event.primary;
                if (component != null && component.type == ComponentType.CONTAINER) {
                    if (scrollY > component.scrollHeight - component.height) {
                    	scrollY = component.scrollHeight - component.height;
                    }
                    if (scrollY < 0) {
                    	scrollY = 0;
                    }
                    if (scrollY != component.scrollY) {
                        component.scrollY = scrollY;
                        IComponentDefinitions.redrawComponent(component);
                    }
                }
            }
            	break;
            case IF_SETSPRITE: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                component.spriteId = event.primary;
            }
            	break;
            case SET_MINIMAP_FLAG:
            	Class187.MINIMAP_FLAG_IS_OVERRIDE = true;
                Class187.MINIMAP_FLAG_X = event.primary;
                Class187.MINIMAP_FLAG_Y = event.secondary;
            	break;
            case IF_SETFONT: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                component.fontId = event.primary;
            }
            	break;
            case IF_SETVORBISID: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                component.vorbisStringId = event.primary;
            }
            	break;
            case IF_MODEL_RECOLOR: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                int col = (int) (value >> 32);
                component.recolor(col, (short) event.primary, (short) event.secondary);
            }
            	break;
            case IF_MODEL_RETEXTURE: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                int texId = (int) (value >> 32);
                component.retexture(texId, (short) event.primary, (short) event.secondary);
            }
            	break;
            case IF_SETMONOSPACE: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                component.monospaced = event.primary == 1;
            }
            	break;
            case IF_SETMASKCLICKS: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                component.clickMask = event.primary == 1;
            }
            	break;
            case IF_SETTEXTANTIMACRO: {
            	IComponentDefinitions component = IComponentDefinitions.getDefs((int) value);
                if (event.primary == 1 != component.textAntiMacro) {
                    component.textAntiMacro = event.primary == 1;
                    IComponentDefinitions.redrawComponent(component);
                }
            }
            	break;
			case DEPRECATED_PACKET_EVENT:
				break;
			default:
				break;
            }
        }
    }
    
    static PulseEvent createPulseEvent(EventType event, long data) {
        PulseEvent class282_sub50_sub12_3 = (PulseEvent) aClass465_9667.get(event.getId() << 56 | data);
        if (class282_sub50_sub12_3 == null) {
            class282_sub50_sub12_3 = new PulseEvent(event, data);
            aClass465_9667.put(class282_sub50_sub12_3, class282_sub50_sub12_3.pointer);
        }
        return class282_sub50_sub12_3;
    }

	public static void method5513(int i_0, int i_1) {
	    createPulseEvent(EventType.IF_MODEL_RECOLOR, (long) i_1 << 32 | i_0).queueDelay();
	}

	static void method15255() {
	    PulseEvent class282_sub50_sub12_1 = createPulseEvent(EventType.SET_MINIMAP_FLAG, 0L);
	    class282_sub50_sub12_1.queueDelay();
	}

	public static void method4903(int i_0, int i_1) {
	    PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.IF_MODEL_RETEXTURE, (long) i_1 << 32 | i_0);
	    class282_sub50_sub12_3.queueDelay();
	}

	public static void method3631(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETTEXT, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	static void setComponentText(int i_0, String string_1) {
	    PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.IF_SETTEXT, i_0);
	    class282_sub50_sub12_3.queueImmediately();
	    class282_sub50_sub12_3.string = string_1;
	}

	public static void method12223(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETCOLORINT, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method1807(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETSPRITE, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method15263(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.SET_VARCSTR, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method15264(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.SET_VARC, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method1818(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SET_SPRITE_TRANSFORM, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	static void method4562(int i_0, String string_1) {
	    PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.SET_VARCSTR, i_0);
	    class282_sub50_sub12_3.queueImmediately();
	    class282_sub50_sub12_3.string = string_1;
	}

	public static void method7278(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETMASKCLICKS, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method5581(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETVORBISID, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method12575(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETOFFSET, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method8207(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETFONT, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method1565(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETMODEL, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method14656(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETMONOSPACE, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method6914(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETITEM, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method1389(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETHIDDEN, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method6774(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETPOS, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method4196(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETTEXTANTIMACRO, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method14582(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SETANIM, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

	public static void method12709(int i_0) {
	    PulseEvent class282_sub50_sub12_2 = createPulseEvent(EventType.IF_SET_SCROLL_Y, i_0);
	    class282_sub50_sub12_2.queueDelay();
	}

    static void method7917(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.IF_SETSPRITE, i_0);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method11155(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.SET_MINIMAP_FLAG, 0L);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = i_0;
        class282_sub50_sub12_3.secondary = i_1;
    }

    static void setComponentItem(int i_0, int i_1, int i_2) {
        PulseEvent class282_sub50_sub12_4 = createPulseEvent(EventType.IF_SETITEM, i_0);
        class282_sub50_sub12_4.queueImmediately();
        class282_sub50_sub12_4.primary = i_1;
        class282_sub50_sub12_4.secondary = i_2;
    }

    static void setIFContent(int i_0, int i_1, int i_2, int i_3) {
        PulseEvent class282_sub50_sub12_5 = createPulseEvent(EventType.IF_SETMODEL, i_0);
        class282_sub50_sub12_5.queueImmediately();
        class282_sub50_sub12_5.primary = i_1;
        class282_sub50_sub12_5.secondary = i_2;
        class282_sub50_sub12_5.tertiary = i_3;
    }

    static void setComponentPosition(int component, int x, int y) {
        PulseEvent event = createPulseEvent(EventType.IF_SETPOS, component);
        event.queueImmediately();
        event.primary = x;
        event.secondary = y;
    }

    static void method8722(int i_0, int i_1, int i_2, int i_3) {
        PulseEvent class282_sub50_sub12_5 = createPulseEvent(EventType.IF_MODEL_RECOLOR, (long) i_1 << 32 | i_0);
        class282_sub50_sub12_5.queueImmediately();
        class282_sub50_sub12_5.primary = i_2;
        class282_sub50_sub12_5.secondary = i_3;
    }

    static void method7374(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.IF_SETCOLORINT, i_0);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method6751(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.SET_VARC, i_0);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method5924(int i_0, boolean bool_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.IF_SETMASKCLICKS, i_0);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = bool_1 ? 1 : 0;
    }

    static void method12420(int i_0, int i_1, int i_2, int i_3) {
        PulseEvent class282_sub50_sub12_5 = createPulseEvent(EventType.IF_MODEL_RETEXTURE, (long) i_1 << 32 | i_0);
        class282_sub50_sub12_5.queueImmediately();
        class282_sub50_sub12_5.primary = i_2;
        class282_sub50_sub12_5.secondary = i_3;
    }

    static void method15381(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.IF_SETVORBISID, i_0);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method15435(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.IF_SETFONT, i_0);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method778(int i_0, int i_1, int i_2, int i_3) {
        PulseEvent class282_sub50_sub12_5 = createPulseEvent(EventType.IF_SETOFFSET, i_0);
        class282_sub50_sub12_5.queueImmediately();
        class282_sub50_sub12_5.primary = i_1;
        class282_sub50_sub12_5.secondary = i_2;
        class282_sub50_sub12_5.tertiary = i_3;
    }

    static void method12882(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.DEPRECATED_PACKET_EVENT, i_0);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method3252(int i_0, boolean bool_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.IF_SETTEXTANTIMACRO, i_0);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = bool_1 ? 1 : 0;
    }

    static void method2966(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.IF_SET_SCROLL_Y, i_0);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void method14663(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.IF_SETHIDDEN, i_0);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = i_1;
    }

    static void rotateComponentSprite(int interfaceHash, int pitch, int roll, int scale) {
        PulseEvent event = createPulseEvent(EventType.IF_SET_SPRITE_TRANSFORM, interfaceHash);
        event.queueImmediately();
        event.primary = pitch;
        event.secondary = roll;
        event.tertiary = scale;
    }

    static void method3069(int i_0, int i_1) {
        PulseEvent class282_sub50_sub12_3 = createPulseEvent(EventType.IF_SETANIM, i_0);
        class282_sub50_sub12_3.queueImmediately();
        class282_sub50_sub12_3.primary = i_1;
    }

    int getType() {
        return (int) (pointer >>> 56 & 0xffL);
    }

    long getTime() {
        return key & 0x7fffffffffffffffL;
    }

    void queueDelay() {
        key = key & -9223372036854775808L | Utils.time() + 500L;
        PULSE_EVENT_QUEUE.add(this);
    }

    long getPointer() {
        return pointer & 0xffffffffffffffL;
    }

    void queueImmediately() {
        key |= -9223372036854775808L;
        if (getTime() == 0L) {
            aClass477_9666.add(this);
        }
    }
}
