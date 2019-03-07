public class CS2Script extends CacheableNode {

	public Class397 aClass397_9527;
	public int intLocalsCount;
	public int stringLocalsCount;
	public int longLocalsCount;
	public int intArgsCount;
	public int stringArgsCount;
	public int longArgsCount;
	public IterableNodeMap[] switchMaps;
	public String scriptName;
	public CS2OpInfo[] operations;
	public Object[] stringOpValues;
	public int[] intOpValues;
	public long[] longOpValues;

	public CS2Script(RsByteBuffer rsbytebuffer_1) {
		int i_2 = this.decodeHeader(rsbytebuffer_1);
		int i_3 = 0;

		for (CS2OpInfo[] arr_4 = CS2OpInfo.getCS2Operations(); rsbytebuffer_1.index < i_2; i_3++) {
			CS2OpInfo cs2opinfo_5 = this.getOpcode(rsbytebuffer_1, arr_4);
			this.decodeInstruction(rsbytebuffer_1, i_3, cs2opinfo_5);
		}

	}

	CS2OpInfo getOpcode(RsByteBuffer rsbytebuffer_1, CS2OpInfo[] arr_2) {
		int i_3 = rsbytebuffer_1.readUnsignedShort();
		if (i_3 >= 0 && i_3 < arr_2.length) {
			CS2OpInfo cs2opinfo_4 = arr_2[i_3];
			return cs2opinfo_4;
		} else {
			throw new RuntimeException("");
		}
	}

	int decodeHeader(RsByteBuffer stream) {
		stream.index = stream.buffer.length - 2;
		int i_2 = stream.readUnsignedShort();
		int i_3 = stream.buffer.length - 2 - i_2 - 16;
		stream.index = i_3;
		int i_4 = stream.readInt();
		this.intLocalsCount = stream.readUnsignedShort();
		this.stringLocalsCount = stream.readUnsignedShort();
		this.longLocalsCount = stream.readUnsignedShort();
		this.intArgsCount = stream.readUnsignedShort();
		this.stringArgsCount = stream.readUnsignedShort();
		this.longArgsCount = stream.readUnsignedShort();
		int i_5 = stream.readUnsignedByte();
		if (i_5 > 0) {
			this.switchMaps = new IterableNodeMap[i_5];

			for (int i_6 = 0; i_6 < i_5; i_6++) {
				int i_7 = stream.readUnsignedShort();
				IterableNodeMap iterablenodemap_8 = new IterableNodeMap(Class323.nextPowerOfTwo(i_7, -234379644));
				this.switchMaps[i_6] = iterablenodemap_8;

				while (i_7-- > 0) {
					int i_9 = stream.readInt();
					int i_10 = stream.readInt();
					iterablenodemap_8.put(new Class282_Sub38(i_10), (long) i_9);
				}
			}
		}

		stream.index = 0;
		this.scriptName = stream.readNullString();
		this.operations = new CS2OpInfo[i_4];
		return i_3;
	}

	void decodeInstruction(RsByteBuffer rsbytebuffer_1, int i_2, CS2OpInfo cs2opinfo_3) {
		int i_4 = this.operations.length;
		if (cs2opinfo_3 == CS2OpInfo.PUSH_STRING) {
			if (this.stringOpValues == null) {
				this.stringOpValues = new String[i_4];
			}

			String string_5 = rsbytebuffer_1.readString();
			if (string_5.toLowerCase().contains("runescape")) {
				string_5 = string_5.replace("runescape", "Darkan");
				string_5 = string_5.replace("RuneScape", "Darkan");
				string_5 = string_5.replace("Runescape", "Darkan");
			}

			this.stringOpValues[i_2] = string_5.intern();
		} else if (cs2opinfo_3 == CS2OpInfo.PUSH_LONG) {
			if (this.longOpValues == null) {
				this.longOpValues = new long[i_4];
			}

			this.longOpValues[i_2] = rsbytebuffer_1.readLong(1461379326);
		} else {
			if (this.intOpValues == null) {
				this.intOpValues = new int[i_4];
			}

			if (cs2opinfo_3.hasIntConstant) {
				this.intOpValues[i_2] = rsbytebuffer_1.readInt();
			} else {
				this.intOpValues[i_2] = rsbytebuffer_1.readUnsignedByte();
			}
			if (intOpValues.length == 110 && intOpValues[i_2] == 556) {
				System.out.println("Bank cs2 script instruction increased to 800.");
				intOpValues[i_2] = 800;
			}
		}

		this.operations[i_2] = cs2opinfo_3;
	}

}
