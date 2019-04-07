public class QuickChatCategoryDefinitions extends CacheableNode {

	public String name;
	public int[] subCategories;
	public char[] subCategoryHotkeys;
	public int[] messages;
	public char[] messageHotkeys;

	void method15209(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method15210(rsbytebuffer_1, i_3);
		}
	}

	void method15210(RsByteBuffer buffer, int opcode) {
		if (opcode == 1) {
			this.name = buffer.readString();
		} else if (opcode == 2) {
			int count = buffer.readUnsignedByte();
			this.subCategories = new int[count];
			this.subCategoryHotkeys = new char[count];

			for (int i_5 = 0; i_5 < count; i_5++) {
				this.subCategories[i_5] = buffer.readUnsignedShort();
				byte b_6 = buffer.readByte();
				this.subCategoryHotkeys[i_5] = b_6 == 0 ? 0 : Utils.cp1252ToChar(b_6);
			}
		} else if (opcode == 3) {
			int i_4 = buffer.readUnsignedByte();
			this.messages = new int[i_4];
			this.messageHotkeys = new char[i_4];

			for (int i_5 = 0; i_5 < i_4; i_5++) {
				this.messages[i_5] = buffer.readUnsignedShort();
				byte b_6 = buffer.readByte();
				this.messageHotkeys[i_5] = b_6 == 0 ? 0 : Utils.cp1252ToChar(b_6);
			}
		} else if (opcode == 4) {
			return;
		}
	}

	public int method15211(char var_1) {
		if (this.subCategories == null) {
			return -1;
		} else {
			for (int i_3 = 0; i_3 < this.subCategories.length; i_3++) {
				if (this.subCategoryHotkeys[i_3] == var_1) {
					return this.subCategories[i_3];
				}
			}

			return -1;
		}
	}

	public int method15212(char var_1) {
		if (this.messages == null) {
			return -1;
		} else {
			for (int i_3 = 0; i_3 < this.messages.length; i_3++) {
				if (this.messageHotkeys[i_3] == var_1) {
					return this.messages[i_3];
				}
			}

			return -1;
		}
	}

	void method15213() {
		int i_2;
		if (this.messages != null) {
			for (i_2 = 0; i_2 < this.messages.length; i_2++) {
				this.messages[i_2] |= 0x8000;
			}
		}

		if (this.subCategories != null) {
			for (i_2 = 0; i_2 < this.subCategories.length; i_2++) {
				this.subCategories[i_2] |= 0x8000;
			}
		}
	}

}
