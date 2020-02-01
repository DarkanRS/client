package com.jagex;
public class EntityDefaults {

	public int maximumHits = 4;
	public int[] hitOffsetsX = null;
	public int[] hitOffsetsY = null;
	public int anInt7030 = 4;
	public int anInt7032 = 4;
	public int anInt7028 = 7;
	public int profilingModel = -1;
	public boolean aBool7044 = true;
	public boolean npcMessagesEnabled = true;
	public int npcMessageDuration = 2;
	public boolean enablePlayerMessages = true;
	public int playerMessageDuration = 3;
	public int anInt7045 = -1;
	public int anInt7046 = -1;
	public int loginWindow;
	public int lobbyWindow;
	public short[][] originalColours;
	public short[][][] replacementColours;

	public EntityDefaults(Index index_1) {
		this.decode(new RsByteBuffer(index_1.getFile(DefaultsFile.ENTITY.fileId)));
	}

	void decode(RsByteBuffer buffer) {
		boolean loadedOffsets = false;
		while (true) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0) {
				if (!loadedOffsets) {
					if (this.hitOffsetsX == null) {
						this.maximumHits = 4;
						this.hitOffsetsX = new int[4];
						this.hitOffsetsY = new int[4];
					}
					for (opcode = 0; opcode < this.hitOffsetsX.length; opcode++) {
						this.hitOffsetsX[opcode] = 0;
						this.hitOffsetsY[opcode] = opcode * 20;
					}
				}
				return;
			}
			if (opcode == 1) {
				if (this.hitOffsetsX == null) {
					this.maximumHits = 4;
					this.hitOffsetsX = new int[4];
					this.hitOffsetsY = new int[4];
				}
				for (int i_5 = 0; i_5 < this.hitOffsetsX.length; i_5++) {
					this.hitOffsetsX[i_5] = buffer.readShort();
					this.hitOffsetsY[i_5] = buffer.readShort();
				}
				loadedOffsets = true;
			} else if (opcode == 2) {
				this.profilingModel = buffer.readBigSmart();
			} else if (opcode == 3) {
				this.maximumHits = buffer.readUnsignedByte();
				this.hitOffsetsX = new int[this.maximumHits];
				this.hitOffsetsY = new int[this.maximumHits];
			} else if (opcode == 4) {
				this.aBool7044 = false;
			} else if (opcode == 5) {
				this.loginWindow = buffer.read24BitUnsignedInteger();
			} else if (opcode == 6) {
				this.lobbyWindow = buffer.read24BitUnsignedInteger();
			} else if (opcode == 7) {
				this.originalColours = new short[10][4];
				this.replacementColours = new short[10][4][];
				for (int i_5 = 0; i_5 < 10; i_5++) {
					for (int i_6 = 0; i_6 < 4; i_6++) {
						int i_7 = buffer.readUnsignedShort();
						if (i_7 == 65535) {
							i_7 = -1;
						}
						this.originalColours[i_5][i_6] = (short) i_7;
						int i_8 = buffer.readUnsignedShort();
						this.replacementColours[i_5][i_6] = new short[i_8];
						for (int i_9 = 0; i_9 < i_8; i_9++) {
							int i_10 = buffer.readUnsignedShort();
							if (i_10 == 65535) {
								i_10 = -1;
							}
							this.replacementColours[i_5][i_6][i_9] = (short) i_10;
						}
					}
				}
			} else if (opcode == 8) {
				this.npcMessagesEnabled = false;
			} else if (opcode == 9) {
				this.npcMessageDuration = buffer.readUnsignedByte();
			} else if (opcode == 10) {
				this.enablePlayerMessages = false;
			} else if (opcode == 11) {
				this.playerMessageDuration = buffer.readUnsignedByte();
			} else if (opcode == 12) {
				this.anInt7045 = buffer.readUnsignedShort();
				this.anInt7046 = buffer.readUnsignedShort();
			} else if (opcode == 13) {
				this.anInt7032 = buffer.readUnsignedByte();
			} else if (opcode == 14) {
				this.anInt7030 = buffer.readUnsignedByte();
			} else if (opcode == 15) {
				this.anInt7028 = buffer.readUnsignedByte();
			}
		}
	}
}
