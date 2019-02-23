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
		this.maleBody[0] = itemdefinitions_1.maleBody1;
		this.maleBody[1] = itemdefinitions_1.maleBody2;
		this.maleBody[2] = itemdefinitions_1.maleBody3;
		this.femaleBody[0] = itemdefinitions_1.femaleBody1;
		this.femaleBody[1] = itemdefinitions_1.femaleBody2;
		this.femaleBody[2] = itemdefinitions_1.femaleBody3;
		this.maleHeads[0] = itemdefinitions_1.maleHead1;
		this.maleHeads[1] = itemdefinitions_1.maleHead2;
		this.femaleHeads[0] = itemdefinitions_1.femaleHead1;
		this.femaleHeads[1] = itemdefinitions_1.femaleHead2;
		if (itemdefinitions_1.modifiedColors != null) {
			this.modifiedColors = new short[itemdefinitions_1.modifiedColors.length];
			System.arraycopy(itemdefinitions_1.modifiedColors, 0, this.modifiedColors, 0, this.modifiedColors.length);
		}

		if (itemdefinitions_1.modifiedTextures != null) {
			this.modifiedTextures = new short[itemdefinitions_1.modifiedTextures.length];
			System.arraycopy(itemdefinitions_1.modifiedTextures, 0, this.modifiedTextures, 0, this.modifiedTextures.length);
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

	static final void method7043(CS2Executor cs2executor_0, int i_1) {
		Class282_Sub50_Sub6 class282_sub50_sub6_2 = Class125.method2173(1468656099);
		if (class282_sub50_sub6_2 != null) {
			boolean bool_3 = class282_sub50_sub6_2.method14775(Class291.anInt3472 + Class427.anInt5123, Class291.anInt3473 + Class475.anInt5624, CS2Runner.anIntArray5900, -1687346032);
			if (bool_3) {
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = CS2Runner.anIntArray5900[1];
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = CS2Runner.anIntArray5900[2];
			} else {
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
				cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
			}
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = -1;
		}

	}

}
