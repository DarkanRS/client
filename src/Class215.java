public class Class215 implements Interface17 {

    int anInt2683;

    int anInt2684;

    int[] anIntArray2685;

    Class215(int i_1, int i_2, int[] ints_3) {
        this.anInt2683 = i_1;
        this.anInt2684 = i_2;
        this.anIntArray2685 = ints_3;
    }

    public boolean method127(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4, byte b_5) {
        if (class282_sub53_1 == null) {
            if (this.anInt2683 != -1) {
                return false;
            }
        } else {
            if (this.anInt2683 != class282_sub53_1.getClickType(-69637093)) {
                return false;
            }
            if (this.anInt2684 > class282_sub53_1.getMeta()) {
                return false;
            }
            int[] ints_6 = this.anIntArray2685;
            for (int i_7 = 0; i_7 < ints_6.length; i_7++) {
                int i_8 = ints_6[i_7];
                if (!class199_4.method3236(i_8, -1576046451)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean method128(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
        if (class282_sub53_1 == null) {
            if (-142561261 * this.anInt2683 * 985045531 != -1) {
                return false;
            }
        } else {
            if (this.anInt2683 * 985045531 * -142561261 != class282_sub53_1.getClickType(2068258113)) {
                return false;
            }
            if (-1099480527 * this.anInt2684 * 1924060881 > class282_sub53_1.getMeta()) {
                return false;
            }
            int[] ints_5 = this.anIntArray2685;
            for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
                int i_7 = ints_5[i_6];
                if (!class199_4.method3236(i_7, -2084416497)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean method129(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
        if (class282_sub53_1 == null) {
            if (-142561261 * this.anInt2683 * 985045531 != -1) {
                return false;
            }
        } else {
            if (this.anInt2683 * 985045531 * -142561261 != class282_sub53_1.getClickType(-1374498088)) {
                return false;
            }
            if (-1099480527 * this.anInt2684 * 1924060881 > class282_sub53_1.getMeta()) {
                return false;
            }
            int[] ints_5 = this.anIntArray2685;
            for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
                int i_7 = ints_5[i_6];
                if (!class199_4.method3236(i_7, -1578013720)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean method126(MouseRecord class282_sub53_1, KeyRecord[] arr_2, int i_3, Class199 class199_4) {
        if (class282_sub53_1 == null) {
            if (-142561261 * this.anInt2683 * 985045531 != -1) {
                return false;
            }
        } else {
            if (this.anInt2683 * 985045531 * -142561261 != class282_sub53_1.getClickType(-63255169)) {
                return false;
            }
            if (-1099480527 * this.anInt2684 * 1924060881 > class282_sub53_1.getMeta()) {
                return false;
            }
            int[] ints_5 = this.anIntArray2685;
            for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
                int i_7 = ints_5[i_6];
                if (!class199_4.method3236(i_7, -1402673347)) {
                    return false;
                }
            }
        }
        return true;
    }

    static void method3673(String string_0, boolean bool_1, int i_2, int i_3, String string_4, boolean bool_5) {
        string_0 = string_0.toLowerCase();
        short[] shorts_7 = new short[16];
        int i_8 = -1;
        String string_9 = null;
        if (i_2 != -1) {
            ParamDefinitions attributedefault_10 = IndexLoaders.PARAM_LOADER.getParam(i_2);
            if (attributedefault_10 == null || attributedefault_10.method7319(1591846177) != bool_5) {
                return;
            }
            if (attributedefault_10.method7319(1882298499)) {
                string_9 = attributedefault_10.typeName;
            } else {
                i_8 = attributedefault_10.defaultInt;
            }
        }
        int i_15 = 0;
        for (int i_11 = 0; i_11 < IndexLoaders.ITEM_LOADER.maxItemsCount; i_11++) {
            ItemDefinitions itemdefinitions_17 = IndexLoaders.ITEM_LOADER.getItemDefinitions(i_11);
            if ((!bool_1 || itemdefinitions_17.grandExchange) && itemdefinitions_17.certTemplateId == -1 && itemdefinitions_17.lendTemplateId == -1 && itemdefinitions_17.bindTemplateId == -1 && itemdefinitions_17.unknownInt6 == 0 && itemdefinitions_17.name.toLowerCase().indexOf(string_0) != -1) {
                if (i_2 != -1) {
                    if (bool_5) {
                        if (!string_4.equals(itemdefinitions_17.method7101(i_2, string_9, -1780783562))) {
                            continue;
                        }
                    } else if (i_3 != itemdefinitions_17.method7099(i_2, i_8, -1985446250)) {
                        continue;
                    }
                }
                if (i_15 >= 250) {
                    VarcDefinitions.anInt4985 = -1;
                    Class308.aShortArray3621 = null;
                    return;
                }
                if (i_15 >= shorts_7.length) {
                    short[] shorts_13 = new short[shorts_7.length * 2];
                    for (int i_14 = 0; i_14 < i_15; i_14++) {
                        shorts_13[i_14] = shorts_7[i_14];
                    }
                    shorts_7 = shorts_13;
                }
                shorts_7[i_15++] = (short) i_11;
            }
        }
        Class308.aShortArray3621 = shorts_7;
        Class283.anInt3384 = 0;
        VarcDefinitions.anInt4985 = i_15;
        String[] arr_16 = new String[VarcDefinitions.anInt4985];
        for (int i_12 = 0; i_12 < VarcDefinitions.anInt4985; i_12++) {
            arr_16[i_12] = IndexLoaders.ITEM_LOADER.getItemDefinitions(shorts_7[i_12]).name;
        }
        Class100.method1644(arr_16, Class308.aShortArray3621, (short) 2733);
    }
}
