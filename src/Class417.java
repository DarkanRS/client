public class Class417 {

    public static int anInt4994;

    public long aLong4993;

    public int[] anIntArray4992;

    public short[] aShortArray4990;

    public short[] aShortArray4991;

    public Class417(long long_1, int[] ints_3, short[] shorts_4, short[] shorts_5) {
        this.aLong4993 = long_1;
        this.anIntArray4992 = ints_3;
        this.aShortArray4990 = shorts_4;
        this.aShortArray4991 = shorts_5;
    }

    public Class417(NPCDefinitions npcdefinitions_1, boolean bool_2) {
        if (bool_2) {
            this.anIntArray4992 = new int[npcdefinitions_1.anIntArray4859.length];
            System.arraycopy(npcdefinitions_1.anIntArray4859, 0, this.anIntArray4992, 0, this.anIntArray4992.length);
        } else {
            this.anIntArray4992 = new int[npcdefinitions_1.anIntArray4860.length];
            System.arraycopy(npcdefinitions_1.anIntArray4860, 0, this.anIntArray4992, 0, this.anIntArray4992.length);
        }
        if (npcdefinitions_1.aShortArray4892 != null) {
            this.aShortArray4990 = new short[npcdefinitions_1.aShortArray4892.length];
            System.arraycopy(npcdefinitions_1.aShortArray4892, 0, this.aShortArray4990, 0, this.aShortArray4990.length);
        }
        if (npcdefinitions_1.aShortArray4867 != null) {
            this.aShortArray4991 = new short[npcdefinitions_1.aShortArray4867.length];
            System.arraycopy(npcdefinitions_1.aShortArray4867, 0, this.aShortArray4991, 0, this.aShortArray4991.length);
        }
    }

    public static Class347 method7005(int i_0, int i_1) {
        Class347 class347_2 = (Class347) Class347.aClass229_4052.get((long) i_0);
        if (class347_2 != null) {
            return class347_2;
        } else {
            byte[] bytes_3 = Class347.aClass317_4053.getFile(0, i_0);
            class347_2 = new Class347();
            if (bytes_3 != null) {
                class347_2.method6163(new RsByteBuffer(bytes_3), i_0, (short) 257);
            }
            Class347.aClass229_4052.put(class347_2, (long) i_0);
            return class347_2;
        }
    }
}
