public class Class330 {

	byte aByte3864;
	public int anInt3863;
	public int anInt3866;
	public int anInt3865;
	public int anInt3862;
	public int anInt3867;

	public Class330() {
	}

	public int method5908(int i_1) {
		return this.aByte3864 & 0x7;
	}

	public int method5909(int i_1) {
		return (this.aByte3864 & 0x8) == 8 ? 1 : 0;
	}

	public Class330(RsByteBuffer rsbytebuffer_1) {
		this.aByte3864 = rsbytebuffer_1.readByte();
		this.anInt3863 = rsbytebuffer_1.readUnsignedShort();
		this.anInt3866 = rsbytebuffer_1.readInt();
		this.anInt3865 = rsbytebuffer_1.readInt();
		this.anInt3862 = rsbytebuffer_1.readInt();
		this.anInt3867 = rsbytebuffer_1.readInt();
	}

	static final void method5912(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.longStack[++cs2executor_0.longStackPtr - 1] = cs2executor_0.current.longOpValues[cs2executor_0.instrPtr];
	}

	public static void method5913(int i_0) {
		IComponentDefinitions.aClass229_1280.method3863(1550469296);
		IComponentDefinitions.aClass229_1341.method3863(986985015);
		IComponentDefinitions.aClass229_1303.method3863(759496379);
		IComponentDefinitions.aClass229_1282.method3863(726939878);
	}

	public static int method5914(byte[] bytes_0, int i_1, CharSequence charsequence_2, int i_3) {
		int i_4 = charsequence_2.length();
		int i_5 = i_1;

		for (int i_6 = 0; i_6 < i_4; i_6++) {
			char var_7 = charsequence_2.charAt(i_6);
			if (var_7 <= 127) {
				bytes_0[i_5++] = (byte) var_7;
			} else if (var_7 <= 2047) {
				bytes_0[i_5++] = (byte) (0xc0 | var_7 >> 6);
				bytes_0[i_5++] = (byte) (0x80 | var_7 & 0x3f);
			} else {
				bytes_0[i_5++] = (byte) (0xe0 | var_7 >> 12);
				bytes_0[i_5++] = (byte) (0x80 | var_7 >> 6 & 0x3f);
				bytes_0[i_5++] = (byte) (0x80 | var_7 & 0x3f);
			}
		}

		return i_5 - i_1;
	}

	static final void method5915(CS2Executor cs2executor_0, byte b_1) {
		String string_2 = (String) cs2executor_0.stringStack[--cs2executor_0.stringStackPtr];
		cs2executor_0.intStackPtr -= 2;
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = string_2.indexOf(i_3, i_4);
	}

	static final void method5916(int i_0) {
		for (int i_1 = 0; i_1 < client.anInt7211; i_1++) {
			int i_2 = client.anIntArray7212[i_1];
			Class282_Sub47 class282_sub47_3 = (Class282_Sub47) client.NPCS.get((long) i_2);
			if (class282_sub47_3 != null) {
				NPC npc_4 = (NPC) class282_sub47_3.anObject8068;
				Class363.method6287(npc_4, false, -496404861);
			}
		}

	}

}
