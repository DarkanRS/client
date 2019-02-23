public class OverlayDef {

	int anInt7053;
	Class536 aClass536_7062;
	public int anInt7052 = 8;
	public int primaryRGB = 0;
	public int texture = -1;
	public boolean aBool7056 = true;
	public int secondaryRGB = -1;
	public int anInt7057 = 512;
	public boolean aBool7059 = true;
	public boolean aBool7061 = false;
	public int anInt7051 = 1190717;
	public int anInt7063 = -2069119040;
	public int anInt7064 = 255;
	public int anInt7065 = 63;
	public int anInt7055 = 0;
	public int anInt7067 = 64;

	void method11356(byte b_1) {
		this.anInt7052 = this.anInt7052 << 8 | this.anInt7053;
	}

	void method11357(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method11364(rsbytebuffer_1, i_3, (byte) 14);
		}
	}

	void method11364(RsByteBuffer rsbytebuffer_1, int i_2, byte b_3) {
		if (i_2 == 1) {
			this.primaryRGB = Class44.method912(rsbytebuffer_1.read24BitUnsignedInteger(), 2117926535);
		} else if (i_2 == 2) {
			this.texture = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 3) {
			this.texture = rsbytebuffer_1.readUnsignedShort();
			if (this.texture == 65535) {
				this.texture = -1;
			}
		} else if (i_2 == 5) {
			this.aBool7056 = false;
		} else if (i_2 == 7) {
			this.secondaryRGB = Class44.method912(rsbytebuffer_1.read24BitUnsignedInteger(), 2117926535);
		} else if (i_2 == 8) {
			this.aClass536_7062.anInt7093 = this.anInt7053;
		} else if (i_2 == 9) {
			this.anInt7057 = rsbytebuffer_1.readUnsignedShort() << 2;
		} else if (i_2 == 10) {
			this.aBool7059 = false;
		} else if (i_2 == 11) {
			this.anInt7052 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 12) {
			this.aBool7061 = true;
		} else if (i_2 == 13) {
			this.anInt7051 = rsbytebuffer_1.read24BitUnsignedInteger();
		} else if (i_2 == 14) {
			this.anInt7063 = (rsbytebuffer_1.readUnsignedByte() << 2) * 2048044799;
		} else if (i_2 == 16) {
			this.anInt7064 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 20) {
			this.anInt7065 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 21) {
			this.anInt7055 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 22) {
			this.anInt7067 = rsbytebuffer_1.readUnsignedShort();
		}

	}

	static final void method11370(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (client.anInt7434 == 2 && i_2 < client.anInt7449) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aClass6Array7452[i_2].anInt44;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	static final void method11371(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 3;
		client.anInt7416 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		Class149_Sub2.aClass461_9316 = Class246.method4203(cs2executor_0.intStack[cs2executor_0.intStackPtr + 1], (byte) 2);
		if (Class149_Sub2.aClass461_9316 == null) {
			Class149_Sub2.aClass461_9316 = Class461.aClass461_5539;
		}

		client.anInt7422 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		Class184 class184_2 = Class468_Sub20.method12807(-405485002);
		TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4547, class184_2.isaac, 984159932);
		tcpmessage_3.buffer.writeByte(client.anInt7416);
		tcpmessage_3.buffer.writeByte(Class149_Sub2.aClass461_9316.anInt5541);
		tcpmessage_3.buffer.writeByte(client.anInt7422);
		class184_2.method3049(tcpmessage_3, 1462868199);
	}

	static final void method11372(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 14);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		LinkedNodeList.method7889(icomponentdefinitions_3, interface_4, cs2executor_0, 1072784051);
	}

	static final void method11373(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 42);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class339.method6045(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) -2);
	}

}
