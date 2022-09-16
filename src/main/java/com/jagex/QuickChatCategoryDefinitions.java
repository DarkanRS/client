package com.jagex;

public class QuickChatCategoryDefinitions extends CacheableNode {

	public String name;
	public int[] subCategories;
	public char[] subCategoryHotkeys;
	public int[] messages;
	public char[] messageHotkeys;

	void method15209(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0)
				return;

			method15210(rsbytebuffer_1, i_3);
		}
	}

	void method15210(ByteBuf buffer, int opcode) {
		if (opcode == 1)
			name = buffer.readString();
		else if (opcode == 2) {
			int count = buffer.readUnsignedByte();
			subCategories = new int[count];
			subCategoryHotkeys = new char[count];

			for (int i_5 = 0; i_5 < count; i_5++) {
				subCategories[i_5] = buffer.readUnsignedShort();
				byte b_6 = buffer.readByte();
				subCategoryHotkeys[i_5] = b_6 == 0 ? 0 : Utils.cp1252ToChar(b_6);
			}
		} else if (opcode == 3) {
			int i_4 = buffer.readUnsignedByte();
			messages = new int[i_4];
			messageHotkeys = new char[i_4];

			for (int i_5 = 0; i_5 < i_4; i_5++) {
				messages[i_5] = buffer.readUnsignedShort();
				byte b_6 = buffer.readByte();
				messageHotkeys[i_5] = b_6 == 0 ? 0 : Utils.cp1252ToChar(b_6);
			}
		} else if (opcode == 4)
			return;
	}

	public int method15211(char var_1) {
		if (subCategories != null)
			for (int i_3 = 0; i_3 < subCategories.length; i_3++)
				if (subCategoryHotkeys[i_3] == var_1)
					return subCategories[i_3];
		return -1;
	}

	public int method15212(char var_1) {
		if (messages != null)
			for (int i_3 = 0; i_3 < messages.length; i_3++)
				if (messageHotkeys[i_3] == var_1)
					return messages[i_3];
		return -1;
	}

	void method15213() {
		int i_2;
		if (messages != null)
			for (i_2 = 0; i_2 < messages.length; i_2++)
				messages[i_2] |= 0x8000;

		if (subCategories != null)
			for (i_2 = 0; i_2 < subCategories.length; i_2++)
				subCategories[i_2] |= 0x8000;
	}

}
