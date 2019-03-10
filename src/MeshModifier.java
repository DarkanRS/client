import java.util.Iterator;

public class MeshModifier {

    protected static Class267 aClass267_5026;

    public int[] maleBody = new int[3];

    public int[] femaleBody = new int[3];

    public int[] maleHeads = new int[2];

    public int[] femaleHeads = new int[2];

    public short[] modifiedColors;

    public short[] modifiedTextures;

    MeshModifier(ItemDefinitions itemdefinitions_1) {
        this.maleBody[0] = itemdefinitions_1.maleEquip1;
        this.maleBody[1] = itemdefinitions_1.maleEquip2;
        this.maleBody[2] = itemdefinitions_1.maleEquip3;
        this.femaleBody[0] = itemdefinitions_1.femaleEquip1;
        this.femaleBody[1] = itemdefinitions_1.femaleEquip2;
        this.femaleBody[2] = itemdefinitions_1.femaleEquip3;
        this.maleHeads[0] = itemdefinitions_1.maleHead1;
        this.maleHeads[1] = itemdefinitions_1.maleHead2;
        this.femaleHeads[0] = itemdefinitions_1.femaleHead1;
        this.femaleHeads[1] = itemdefinitions_1.femaleHead2;
        if (itemdefinitions_1.modifiedModelColors != null) {
            this.modifiedColors = new short[itemdefinitions_1.modifiedModelColors.length];
            System.arraycopy(itemdefinitions_1.modifiedModelColors, 0, this.modifiedColors, 0, this.modifiedColors.length);
        }
        if (itemdefinitions_1.modifiedTextureIds != null) {
            this.modifiedTextures = new short[itemdefinitions_1.modifiedTextureIds.length];
            System.arraycopy(itemdefinitions_1.modifiedTextureIds, 0, this.modifiedTextures, 0, this.modifiedTextures.length);
        }
    }

    public static void method7041(byte b_0) {
        Class468_Sub8.aClass98Array7889 = new Interface[Class388.INTERFACE_INDEX.containersCount()];
        WorldMapIndexLoader.aBoolArray2709 = new boolean[Class388.INTERFACE_INDEX.containersCount()];
    }

    public static void method7042(byte b_0) {
        int i_1 = Class337.aLinkedList3969.size();
        Iterator iterator_2 = Class337.aLinkedList3969.iterator();
        while (iterator_2.hasNext()) {
            Class282_Sub18 class282_sub18_3 = (Class282_Sub18) iterator_2.next();
            class282_sub18_3.method12296(class282_sub18_3.method12275() + class282_sub18_3.method12277() / (2 * i_1));
            if (!class282_sub18_3.method12276()) {
                iterator_2.remove();
            }
        }
    }
}
