public class ParticleProducerDefinition {

	public int[] anIntArray562;

	static SoftCache aClass229_533 = new SoftCache(64);

	public short minimumAngleH;

	public short maximumAngleH;

	public short minimumAngleV;

	public short maximumAngleV;

	public int minimumSpeed;

	public int maximumSpeed;

	public int anInt542 = 0;

	public int anInt569;

	public int maximumSize;

	public int minimumSize;

	int minimumStartColor;

	int maximumStartColor;

	public int minimumLifetime;

	public int maximumLifetime;

	public int minimumParticleRate;

	public int maximumParticleRate;

	public int[] anIntArray559;

	public int[] anIntArray561;

	public int anInt591 = -2;

	public int anInt600 = -2;

	public int anInt557 = 0;

	public int anInt554 = -1;

	public int anInt573 = -1;

	public int fadeColor;

	public boolean activeFirst = true;

	public int anInt537 = -1;

	public int lifetime = -1;

	public int minimumSetting = 0;

	int colorFading = 100;

	public boolean periodic = true;

	int alphaFading = 100;

	public int endSpeed = -1;

	int speedChange = 100;

	public boolean uniformColorVariance = true;

	public int[] anIntArray582;

	public boolean aBool572 = true;

	public int endSize = -1;

	int sizeChange = 100;

	public boolean aBool574 = false;

	public boolean aBool534 = true;

	public boolean aBool576 = false;

	public boolean aBool541 = true;

	public boolean aBool578 = false;

	public int anInt565;

	int anInt566;

	public int anInt581;

	public int anInt551;

	int anInt599;

	public int anInt584;

	public int anInt585;

	int anInt586;

	public int anInt587;

	public int anInt588;

	int anInt575;

	public int anInt590;

	public int colorFadeStart;

	public int alphaFadeStart;

	public int fadeRedStep;

	public int fadeGreenStep;

	public int fadeBlueStep;

	public int startSpeedChange;

	public int fadeAlphaStep;

	public int speedStep;

	public int startSizeChange;

	public int sizeChangeStep;

	void readValues(RsByteBuffer buffer, int opcode) {
		if (opcode == 1) {
			this.minimumAngleH = (short) buffer.readUnsignedShort();
			this.maximumAngleH = (short) buffer.readUnsignedShort();
			this.minimumAngleV = (short) buffer.readUnsignedShort();
			this.maximumAngleV = (short) buffer.readUnsignedShort();
			byte scale = 3;
			this.minimumAngleH = (short) (this.minimumAngleH << scale);
			this.maximumAngleH = (short) (this.maximumAngleH << scale);
			this.minimumAngleV = (short) (this.minimumAngleV << scale);
			this.maximumAngleV = (short) (this.maximumAngleV << scale);
		} else if (opcode == 2) {
			buffer.readUnsignedByte();
		} else if (opcode == 3) {
			this.minimumSpeed = buffer.readInt();
			this.maximumSpeed = buffer.readInt();
		} else if (opcode == 4) {
			this.anInt542 = buffer.readUnsignedByte();
			this.anInt569 = buffer.readByte();
		} else if (opcode == 5) {
			this.minimumSize = this.maximumSize = buffer.readUnsignedShort() << 12 << 2;
		} else if (opcode == 6) {
			this.minimumStartColor = buffer.readInt();
			this.maximumStartColor = buffer.readInt();
		} else if (opcode == 7) {
			this.minimumLifetime = buffer.readUnsignedShort();
			this.maximumLifetime = buffer.readUnsignedShort();
		} else if (opcode == 8) {
			this.minimumParticleRate = buffer.readUnsignedShort();
			this.maximumParticleRate = buffer.readUnsignedShort();
		} else {
			int i_5;
			int count;
			if (opcode == 9) {
				count = buffer.readUnsignedByte();
				this.anIntArray559 = new int[count];
				for (i_5 = 0; i_5 < count; i_5++) {
					this.anIntArray559[i_5] = buffer.readUnsignedShort();
				}
			} else if (opcode == 10) {
				count = buffer.readUnsignedByte();
				this.anIntArray561 = new int[count];
				for (i_5 = 0; i_5 < count; i_5++) {
					this.anIntArray561[i_5] = buffer.readUnsignedShort();
				}
			} else if (opcode == 12) {
				this.anInt591 = buffer.readByte();
			} else if (opcode == 13) {
				this.anInt600 = buffer.readByte();
			} else if (opcode == 14) {
				this.anInt557 = buffer.readUnsignedShort();
			} else if (opcode == 15) {
				this.anInt554 = buffer.readUnsignedShort();
			} else if (opcode == 16) {
				this.activeFirst = buffer.readUnsignedByte() == 1;
				this.anInt537 = buffer.readUnsignedShort();
				this.lifetime = buffer.readUnsignedShort();
				this.periodic = buffer.readUnsignedByte() == 1;
			} else if (opcode == 17) {
				this.anInt573 = buffer.readUnsignedShort();
			} else if (opcode == 18) {
				this.fadeColor = buffer.readInt();
			} else if (opcode == 19) {
				this.minimumSetting = buffer.readUnsignedByte();
			} else if (opcode == 20) {
				this.colorFading = buffer.readUnsignedByte();
			} else if (opcode == 21) {
				this.alphaFading = buffer.readUnsignedByte();
			} else if (opcode == 22) {
				this.endSpeed = buffer.readInt();
			} else if (opcode == 23) {
				this.speedChange = buffer.readUnsignedByte();
			} else if (opcode == 24) {
				this.uniformColorVariance = false;
			} else if (opcode == 25) {
				count = buffer.readUnsignedByte();
				this.anIntArray582 = new int[count];
				for (i_5 = 0; i_5 < count; i_5++) {
					this.anIntArray582[i_5] = buffer.readUnsignedShort();
				}
			} else if (opcode == 26) {
				this.aBool572 = false;
			} else if (opcode == 27) {
				this.endSize = buffer.readUnsignedShort() << 12 << 2;
			} else if (opcode == 28) {
				this.sizeChange = buffer.readUnsignedByte();
			} else if (opcode == 29) {
				buffer.readShort();
			} else if (opcode == 30) {
				this.aBool574 = true;
			} else if (opcode == 31) {
				this.minimumSize = buffer.readUnsignedShort() << 12 << 2;
				this.maximumSize = buffer.readUnsignedShort() << 12 << 2;
			} else if (opcode == 32) {
				this.aBool534 = false;
			} else if (opcode == 33) {
				this.aBool576 = true;
			} else if (opcode == 34) {
				this.aBool541 = false;
			}
		}
	}

	void init() {
		if (this.anInt591 > -2 || this.anInt600 > -2) {
			this.aBool578 = true;
		}
		this.anInt565 = this.minimumStartColor >> 16 & 0xff;
		this.anInt566 = this.maximumStartColor >> 16 & 0xff;
		this.anInt581 = this.anInt566 - this.anInt565;
		this.anInt551 = this.minimumStartColor >> 8 & 0xff;
		this.anInt599 = this.maximumStartColor >> 8 & 0xff;
		this.anInt584 = this.anInt599 - this.anInt551;
		this.anInt585 = this.minimumStartColor & 0xff;
		this.anInt586 = this.maximumStartColor & 0xff;
		this.anInt587 = this.anInt586 - this.anInt585;
		this.anInt588 = this.minimumStartColor >> 24 & 0xff;
		this.anInt575 = this.maximumStartColor >> 24 & 0xff;
		this.anInt590 = this.anInt575 - this.anInt588;
		if (this.fadeColor != 0) {
			this.colorFadeStart = this.colorFading * this.maximumLifetime / 100;
			this.alphaFadeStart = this.alphaFading * this.maximumLifetime / 100;
			if (this.colorFadeStart == 0) {
				this.colorFadeStart = 1;
			}
			this.fadeRedStep = ((this.fadeColor >> 16 & 0xff) - (this.anInt581 / 2 + this.anInt565) << 8) / this.colorFadeStart;
			this.fadeGreenStep = ((this.fadeColor >> 8 & 0xff) - (this.anInt584 / 2 + this.anInt551) << 8) / this.colorFadeStart;
			this.fadeBlueStep = ((this.fadeColor & 0xff) - (this.anInt587 / 2 + this.anInt585) << 8) / this.colorFadeStart;
			if (this.alphaFadeStart == 0) {
				this.alphaFadeStart = 1;
			}
			this.fadeAlphaStep = ((this.fadeColor >> 24 & 0xff) - (this.anInt590 / 2 + this.anInt588) << 8) / this.alphaFadeStart;
			this.fadeRedStep += this.fadeRedStep > 0 ? -4 : 4;
			this.fadeGreenStep += this.fadeGreenStep > 0 ? -4 : 4;
			this.fadeBlueStep += this.fadeBlueStep > 0 ? -4 : 4;
			this.fadeAlphaStep += this.fadeAlphaStep > 0 ? -4 : 4;
		}
		if (this.endSpeed != -1) {
			this.startSpeedChange = this.maximumLifetime * this.speedChange / 100;
			if (this.startSpeedChange == 0) {
				this.startSpeedChange = 1;
			}
			this.speedStep = (this.endSpeed - ((this.maximumSpeed - this.minimumSpeed) / 2 + this.minimumSpeed)) / this.startSpeedChange;
		}
		if (this.endSize != -1) {
			this.startSizeChange = this.sizeChange * this.maximumLifetime / 100;
			if (this.startSizeChange == 0) {
				this.startSizeChange = 1;
			}
			this.sizeChangeStep = (this.endSize - ((this.maximumSize - this.minimumSize) / 2 + this.minimumSize)) / this.startSizeChange;
		}
	}

	void decode(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.readValues(rsbytebuffer_1, i_3);
		}
	}

	public static int method1159(Index index_0) {
		int i_2 = 0;
		if (index_0.loadFile(Class165.anInt2035)) {
			++i_2;
		}
		if (index_0.loadFile(Class475.anInt5622)) {
			++i_2;
		}
		if (index_0.loadFile(Class16.anInt135)) {
			++i_2;
		}
		if (index_0.loadFile(Class16.anInt142)) {
			++i_2;
		}
		if (index_0.loadFile(Class16.anInt137)) {
			++i_2;
		}
		if (index_0.loadFile(BloomPreference.anInt7899)) {
			++i_2;
		}
		if (index_0.loadFile(Class13.anInt130)) {
			++i_2;
		}
		if (index_0.loadFile(Class16.anInt143)) {
			++i_2;
		}
		if (index_0.loadFile(GameTipsLoader.anInt4821)) {
			++i_2;
		}
		if (index_0.loadFile(Class16.anInt141)) {
			++i_2;
		}
		if (index_0.loadFile(Class165.anInt2037)) {
			++i_2;
		}
		if (index_0.loadFile(Class271.anInt3330)) {
			++i_2;
		}
		return i_2;
	}

	public static void method1160(int i_0) {
		if (Class51.anInt488 != -1) {
			SpotAnimIndexLoader.method8862(Class51.anInt488, -1, -1, false);
			Class51.anInt488 = -1;
		}
	}

	public static void method1161(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, String string_6, short s_7) {
		EntityNode_Sub6 class275_sub6_8 = new EntityNode_Sub6();
		class275_sub6_8.anInt7857 = i_0;
		class275_sub6_8.anInt7859 = i_1;
		class275_sub6_8.anInt7854 = i_2;
		class275_sub6_8.anInt7858 = i_4 + client.cycles;
		class275_sub6_8.anInt7855 = i_3;
		class275_sub6_8.aString7860 = string_6;
		class275_sub6_8.anInt7856 = i_5;
		client.aClass457_7335.offer(class275_sub6_8, 1112580220);
	}
}
