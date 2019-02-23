public class Class282_Sub48 extends Node {

	int anInt8076;
	int anInt8077;
	int anInt8078;
	int anInt8079;
	int anInt8080;
	NPC aClass521_Sub1_Sub1_Sub2_Sub2_8085;
	Player aClass521_Sub1_Sub1_Sub2_Sub1_8086;
	Class282_Sub18 aClass282_Sub18_8087;
	boolean aBool8092;
	Class282_Sub15_Sub5 aClass282_Sub15_Sub5_8096;
	ObjectDefinitions aClass478_8104;
	Class282_Sub26_Sub1_Sub1 aClass282_Sub26_Sub1_Sub1_8106;
	int anInt8107;
	static NodeCollection aClass482_8073 = new NodeCollection();
	static NodeCollection aClass482_8074 = new NodeCollection();
	static IterableNodeMap aClass465_8075 = new IterableNodeMap(16);
	int anInt8095;
	boolean aBool8098;
	int anInt8105;
	int anInt8081;
	int anInt8089;
	int anInt8094;
	int anInt8093;
	int anInt8072;
	int anInt8101;
	int[] anIntArray8102;
	boolean aBool8103;
	Class282_Sub15_Sub5 aClass282_Sub15_Sub5_8099;
	Class282_Sub26_Sub1_Sub1 aClass282_Sub26_Sub1_Sub1_8082;
	Class282_Sub18 aClass282_Sub18_8097;
	int anInt8091 = 0;

	void method13426(byte b_1) {
		int i_2 = this.anInt8095;
		boolean bool_3 = this.aBool8098;
		if (this.aClass478_8104 != null) {
			ObjectDefinitions objectdefinitions_4 = this.aClass478_8104.method8013((Interface42) (client.anInt7341 == 4 ? Class86.anInterface42_832 : Class158_Sub1.aClass3_8507), (byte) 46);
			if (objectdefinitions_4 != null) {
				this.anInt8095 = objectdefinitions_4.anInt5653;
				this.aBool8098 = objectdefinitions_4.aBool5696;
				this.anInt8105 = objectdefinitions_4.anInt5693 << 9;
				this.anInt8089 = objectdefinitions_4.anInt5695;
				this.anInt8072 = objectdefinitions_4.anInt5667;
				this.anInt8101 = objectdefinitions_4.anInt5698;
				this.anIntArray8102 = objectdefinitions_4.anIntArray5688;
				this.aBool8103 = objectdefinitions_4.aBool5700;
				this.anInt8094 = objectdefinitions_4.anInt5709;
				this.anInt8093 = objectdefinitions_4.anInt5708;
			} else {
				this.anInt8095 = -1;
				this.aBool8098 = false;
				this.anInt8105 = 0;
				this.anInt8089 = 0;
				this.anInt8072 = 0;
				this.anInt8101 = 0;
				this.anIntArray8102 = null;
				this.aBool8103 = false;
				this.anInt8094 = 256;
				this.anInt8093 = 256;
				this.anInt8081 = 0;
			}
		} else if (this.aClass521_Sub1_Sub1_Sub2_Sub2_8085 != null) {
			int i_6 = Class282_Sub11_Sub1.method15433(this.aClass521_Sub1_Sub1_Sub2_Sub2_8085, 912866554);
			if (i_2 != i_6) {
				this.anInt8095 = i_6;
				NPCDefinitions npcdefinitions_5 = this.aClass521_Sub1_Sub1_Sub2_Sub2_8085.aClass409_10580;
				if (npcdefinitions_5.anIntArray4886 != null) {
					npcdefinitions_5 = npcdefinitions_5.method6884(Class158_Sub1.aClass3_8507, 265881693);
				}

				if (npcdefinitions_5 != null) {
					this.anInt8105 = npcdefinitions_5.anInt4907 << 9;
					this.anInt8081 = npcdefinitions_5.anInt4908 << 9;
					this.anInt8089 = npcdefinitions_5.anInt4909;
					this.aBool8098 = npcdefinitions_5.aBool4872;
					this.anInt8094 = npcdefinitions_5.anInt4919;
					this.anInt8093 = npcdefinitions_5.anInt4911;
				} else {
					this.anInt8081 = 0;
					this.anInt8105 = 0;
					this.anInt8089 = 0;
					this.aBool8098 = this.aClass521_Sub1_Sub1_Sub2_Sub2_8085.aClass409_10580.aBool4872;
					this.anInt8094 = 256;
					this.anInt8093 = 256;
				}
			}
		} else if (this.aClass521_Sub1_Sub1_Sub2_Sub1_8086 != null) {
			this.anInt8095 = Class149_Sub2.method14610(this.aClass521_Sub1_Sub1_Sub2_Sub1_8086, 2122332185);
			this.aBool8098 = this.aClass521_Sub1_Sub1_Sub2_Sub1_8086.isTransformedNPC;
			this.anInt8105 = this.aClass521_Sub1_Sub1_Sub2_Sub1_8086.isNpc << 9;
			this.anInt8081 = 0;
			this.anInt8089 = this.aClass521_Sub1_Sub1_Sub2_Sub1_8086.anInt10566;
			this.anInt8094 = 256;
			this.anInt8093 = 256;
		}

		if ((i_2 != this.anInt8095 || bool_3 != this.aBool8098) && this.aClass282_Sub15_Sub5_8099 != null) {
			Class79.aClass282_Sub15_Sub4_783.method15276(this.aClass282_Sub15_Sub5_8099);
			this.aClass282_Sub15_Sub5_8099 = null;
			this.aClass282_Sub26_Sub1_Sub1_8082 = null;
			this.aClass282_Sub18_8097 = null;
		}

	}

	static final void method13446(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = ~i_2;
	}

}
