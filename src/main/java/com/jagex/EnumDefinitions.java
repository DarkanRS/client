package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EnumDefinitions {

    public char keyType;
    public char valueType;
    String defaultStringValue = "null";
    int defaultIntValue;
    int size;
    Map aMap5144;
    Object[] values;
    HashMap aHashMap5147;

    static boolean isObjectClickType(int i_0) {
        return i_0 == 3 || i_0 == 4 || i_0 == 5 || i_0 == 6 || i_0 == 1001 || i_0 == 1002 || i_0 == 2;
    }

    public int getSize() {
        return size;
    }

    void method7224(ByteBuf stream, int opcode) {
        if (opcode == 1) {
            keyType = Utils.cp1252ToChar(stream.readByte());
        } else if (opcode == 2) {
            valueType = Utils.cp1252ToChar(stream.readByte());
        } else if (opcode == 3) {
            defaultStringValue = stream.readString();
        } else if (opcode == 4) {
            defaultIntValue = stream.readInt();
        } else {
            int i_4;
            int i_5;
            if (opcode != 5 && opcode != 6) {
                if (opcode == 7 || opcode == 8) {
                    i_4 = stream.readUnsignedShort();
                    size = stream.readUnsignedShort();
                    values = new Object[i_4];

                    for (i_5 = 0; i_5 < size; i_5++) {
                        int i_7 = stream.readUnsignedShort();
                        if (opcode == 7) {
                            values[i_7] = stream.readString();
                        } else {
                            values[i_7] = new Integer(stream.readInt());
                        }
                    }
                }
            } else {
                size = stream.readUnsignedShort();
                aMap5144 = new HashMap(size);

                for (i_4 = 0; i_4 < size; i_4++) {
                    i_5 = stream.readInt();
                    Object obj_6;
                    if (opcode == 5) {
                        obj_6 = stream.readString();
                    } else {
                        obj_6 = new Integer(stream.readInt());
                    }

                    aMap5144.put(new Integer(i_5), obj_6);
                }
            }
        }

    }

    Object getValue(int key) {
        return values != null ? (key >= 0 && key < values.length ? values[key] : null) : (aMap5144 != null ? aMap5144.get(new Integer(key)) : null);
    }

    public String getStringValue(int i_1) {
        Object object_3 = getValue(i_1);
        return object_3 == null ? defaultStringValue : (String) object_3;
    }

    void method7227(ByteBuf rsbytebuffer_1) {
        while (true) {
            int i_3 = rsbytebuffer_1.readUnsignedByte();
            if (i_3 == 0) {
                return;
            }

            method7224(rsbytebuffer_1, i_3);
        }
    }

    public boolean containsKey(java.io.Serializable object_1) {
        if (size == 0) {
            return false;
        } else {
            if (aHashMap5147 == null) {
                method7233();
            }

            return aHashMap5147.containsKey(object_1);
        }
    }

    public int getIntValue(int i_1) {
        Object object_3 = getValue(i_1);
        return object_3 == null ? defaultIntValue : ((Integer) object_3).intValue();
    }

    void method7233() {
        HashMap hashmap_2 = new HashMap();
        Object obj_5;
        Iterator iterator_10;
        Entry map$entry_11;
        if (values != null) {
            for (int i_3 = 0; i_3 < values.length; i_3++) {
                if (values[i_3] != null) {
                    Object object_4 = values[i_3];
                    obj_5 = hashmap_2.get(object_4);
                    if (obj_5 == null) {
                        obj_5 = new LinkedList();
                        hashmap_2.put(object_4, obj_5);
                    }

                    ((List) obj_5).add(new Integer(i_3));
                }
            }
        } else {
            if (aMap5144 == null) {
                throw new IllegalStateException();
            }

            Object obj_6;
            for (iterator_10 = aMap5144.entrySet().iterator(); iterator_10.hasNext(); ((List) obj_6).add(map$entry_11.getKey())) {
                map$entry_11 = (Entry) iterator_10.next();
                obj_5 = map$entry_11.getValue();
                obj_6 = hashmap_2.get(obj_5);
                if (obj_6 == null) {
                    obj_6 = new LinkedList();
                    hashmap_2.put(obj_5, obj_6);
                }
            }
        }

        aHashMap5147 = new HashMap();

        int[] ints_13;
        for (iterator_10 = hashmap_2.entrySet().iterator(); iterator_10.hasNext(); aHashMap5147.put(map$entry_11.getKey(), ints_13)) {
            map$entry_11 = (Entry) iterator_10.next();
            List list_12 = (List) map$entry_11.getValue();
            ints_13 = new int[list_12.size()];
            int i_7 = 0;

            Integer integer_9;
            for (Iterator iterator_8 = list_12.iterator(); iterator_8.hasNext(); ints_13[i_7++] = integer_9.intValue()) {
                integer_9 = (Integer) iterator_8.next();
            }

            if (values == null) {
                Arrays.sort(ints_13);
            }
        }

    }

    public int[] method7251(java.io.Serializable object_1) {
        if (size == 0) {
            return null;
        } else {
            if (aHashMap5147 == null) {
                method7233();
            }

            return (int[]) aHashMap5147.get(object_1);
        }
    }

}
