import java.util.LinkedList;
import java.util.Queue;

public class Class534_Sub1 extends Class534 {

	Queue aQueue7921 = new LinkedList();

	int method11424() {
		return 1;
	}

	void method12809(Class282_Sub53_Sub1 class282_sub53_sub1_1) {
		this.aQueue7921.add(class282_sub53_sub1_1);
		if (this.aQueue7921.size() > 10) {
			this.aQueue7921.poll();
		}
	}

	void method11414() {
		Class282_Sub53_Sub1 class282_sub53_sub1_2 = (Class282_Sub53_Sub1) this.aQueue7921.poll();
		if (class282_sub53_sub1_2 != null) {
			TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.MOUSE_BUTTON_CLICK, client.outputContext.isaac);
			tcpmessage_3.buffer.writeLEInt(class282_sub53_sub1_2.method13481(2071740821) | class282_sub53_sub1_2.method13469(1875995188) << 16, (byte) 22);
			tcpmessage_3.buffer.writeByte128(class282_sub53_sub1_2.method14730(-24722123) << 1 | class282_sub53_sub1_2.method14729() & 0x1, 670389922);
			tcpmessage_3.buffer.writeShortLE(this.method11408(class282_sub53_sub1_2, 65535, 1958251581), (short) -6480);
			client.outputContext.queuePacket(tcpmessage_3);
			class282_sub53_sub1_2.cache(-1706861091);
		}
	}

	void method12810(RsByteBuffer rsbytebuffer_1, Class282_Sub53_Sub1 class282_sub53_sub1_2, byte b_3) {
		rsbytebuffer_1.writeByte(class282_sub53_sub1_2.method14729());
	}

	boolean method11423() {
		return !this.aQueue7921.isEmpty() || this.aLong7076 < TextureDetails.time() - 2000L;
	}

	int method11412() {
		return 1;
	}

	void method11427(RsByteBuffer rsbytebuffer_1, MouseRecord class282_sub53_2) {
		this.method12810(rsbytebuffer_1, (Class282_Sub53_Sub1) class282_sub53_2, (byte) 72);
	}

	void method11426(RsByteBuffer rsbytebuffer_1, MouseRecord class282_sub53_2) {
		this.method12810(rsbytebuffer_1, (Class282_Sub53_Sub1) class282_sub53_2, (byte) 80);
	}

	void method11431() {
		Class282_Sub53_Sub1 class282_sub53_sub1_1 = (Class282_Sub53_Sub1) this.aQueue7921.poll();
		if (class282_sub53_sub1_1 != null) {
			TCPPacket tcpmessage_2 = Class271.createPacket(OutgoingPacket.MOUSE_BUTTON_CLICK, client.outputContext.isaac);
			tcpmessage_2.buffer.writeLEInt(class282_sub53_sub1_1.method13481(1928533930) | class282_sub53_sub1_1.method13469(-2039460343) << 16, (byte) -49);
			tcpmessage_2.buffer.writeByte128(class282_sub53_sub1_1.method14730(-1430500590) << 1 | class282_sub53_sub1_1.method14729() & 0x1, -2080491977);
			tcpmessage_2.buffer.writeShortLE(this.method11408(class282_sub53_sub1_1, 65535, 2099731488), (short) -23063);
			client.outputContext.queuePacket(tcpmessage_2);
			class282_sub53_sub1_1.cache(1162879870);
		}
	}

	void method11418() {
		Class282_Sub53_Sub1 class282_sub53_sub1_1 = (Class282_Sub53_Sub1) this.aQueue7921.poll();
		if (class282_sub53_sub1_1 != null) {
			TCPPacket tcpmessage_2 = Class271.createPacket(OutgoingPacket.MOUSE_BUTTON_CLICK, client.outputContext.isaac);
			tcpmessage_2.buffer.writeLEInt(class282_sub53_sub1_1.method13481(932524891) | class282_sub53_sub1_1.method13469(-1600764926) << 16, (byte) 96);
			tcpmessage_2.buffer.writeByte128(class282_sub53_sub1_1.method14730(2068393904) << 1 | class282_sub53_sub1_1.method14729() & 0x1, -414105270);
			tcpmessage_2.buffer.writeShortLE(this.method11408(class282_sub53_sub1_1, 65535, -352975879), (short) -24854);
			client.outputContext.queuePacket(tcpmessage_2);
			class282_sub53_sub1_1.cache(-92529177);
		}
	}

	boolean method11434() {
		return !this.aQueue7921.isEmpty() || 2966128844247041579L * this.aLong7076 * 1203484888895588483L < TextureDetails.time() - 2000L;
	}

	TCPPacket method11416() {
		return Class271.createPacket(OutgoingPacket.MOVE_MOUSE, client.outputContext.isaac);
	}

	TCPPacket method11420() {
		return Class271.createPacket(OutgoingPacket.MOVE_MOUSE, client.outputContext.isaac);
	}

	TCPPacket method11428() {
		return Class271.createPacket(OutgoingPacket.MOVE_MOUSE, client.outputContext.isaac);
	}

	TCPPacket method11422() {
		return Class271.createPacket(OutgoingPacket.MOVE_MOUSE, client.outputContext.isaac);
	}

	int method11415() {
		return 1;
	}

	int method11425() {
		return 1;
	}

	void method11413(RsByteBuffer rsbytebuffer_1, MouseRecord class282_sub53_2) {
		this.method12810(rsbytebuffer_1, (Class282_Sub53_Sub1) class282_sub53_2, (byte) 110);
	}

	TCPPacket method11421() {
		return Class271.createPacket(OutgoingPacket.MOVE_MOUSE, client.outputContext.isaac);
	}

	static int[] method12815(Class282_Sub50_Sub7 class282_sub50_sub7_0, int i_1) {
		int[] ints_2 = null;
		if (SunDefinitions.method859(class282_sub50_sub7_0.clickType, 219826890)) {
			ints_2 = IndexLoaders.ITEM_LOADER.getItemDefinitions((int) class282_sub50_sub7_0.aLong9584).quests;
		} else if (class282_sub50_sub7_0.anInt9579 != -1) {
			ints_2 = IndexLoaders.ITEM_LOADER.getItemDefinitions(class282_sub50_sub7_0.anInt9579).quests;
		} else if (Class237.method3989(class282_sub50_sub7_0.clickType)) {
			StringNode class282_sub47_3 = (StringNode) client.NPCS.get((long) ((int) class282_sub50_sub7_0.aLong9584));
			if (class282_sub47_3 != null) {
				NPC npc_4 = (NPC) class282_sub47_3.anObject8068;
				NPCDefinitions npcdefinitions_5 = npc_4.definitions;
				if (npcdefinitions_5.transformTo != null) {
					npcdefinitions_5 = npcdefinitions_5.method6884(Class158_Sub1.PLAYER_VAR_PROVIDER);
				}
				if (npcdefinitions_5 != null) {
					ints_2 = npcdefinitions_5.anIntArray4915;
				}
			}
		} else if (EnumDefinitions.method7252(class282_sub50_sub7_0.clickType)) {
			ObjectDefinitions objectdefinitions_6 = IndexLoaders.MAP_REGION_DECODER.method4436(-1943524543).getObjectDefinitions((int) (class282_sub50_sub7_0.aLong9584 >>> 32 & 0x7fffffffL));
			if (objectdefinitions_6.toObjectIds != null) {
				objectdefinitions_6 = objectdefinitions_6.method8013(Class158_Sub1.PLAYER_VAR_PROVIDER, (byte) 45);
			}
			if (objectdefinitions_6 != null) {
				ints_2 = objectdefinitions_6.anIntArray5707;
			}
		}
		return ints_2;
	}
}
