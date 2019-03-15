public class Class287 {

	public int anInt3419;

	boolean aBool3426;

	boolean aBool3427;

	short[] aShortArray3429;

	public int anInt3430;

	int anInt3433;

	public Class282_Sub24 aClass282_Sub24_3425;

	int anInt3435;

	int anInt3431;

	int anInt3409;

	int anInt3432;

	public Class287(GraphicalRenderer graphicalrenderer_1, int i_2, RsByteBuffer rsbytebuffer_3) {
		if (Class468_Sub20.anIntArray7920 == null) {
			Class8_Sub1.method13783();
		}
		this.anInt3419 = rsbytebuffer_3.readUnsignedByte();
		this.aBool3426 = (this.anInt3419 & 0x8) != 0;
		this.aBool3427 = (this.anInt3419 & 0x10) != 0;
		this.anInt3419 &= 0x7;
		int i_5 = rsbytebuffer_3.readUnsignedShort() << 2;
		int i_6 = rsbytebuffer_3.readUnsignedShort() << 2;
		int i_7 = rsbytebuffer_3.readUnsignedShort() << 2;
		int i_8 = rsbytebuffer_3.readUnsignedByte();
		int i_9 = i_8 * 2 + 1;
		this.aShortArray3429 = new short[i_9];
		int i_10;
		for (i_10 = 0; i_10 < this.aShortArray3429.length; i_10++) {
			short s_11 = (short) rsbytebuffer_3.readUnsignedShort();
			int i_12 = s_11 >>> 8;
			int i_13 = s_11 & 0xff;
			if (i_12 >= i_9) {
				i_12 = i_9 - 1;
			}
			if (i_13 > i_9 - i_12) {
				i_13 = i_9 - i_12;
			}
			this.aShortArray3429[i_10] = (short) (i_12 << 8 | i_13);
		}
		i_8 = (i_8 << i_2) + (1 << i_2 >> 1);
		i_10 = Class540.anIntArray7136 != null ? Class540.anIntArray7136[rsbytebuffer_3.readUnsignedShort()] : Class335.anIntArray3916[Class372.method6362(rsbytebuffer_3.readUnsignedShort(), 1418422481) & 0xffff];
		int i_14 = rsbytebuffer_3.readUnsignedByte();
		this.anInt3430 = i_14 & 0x1f;
		this.anInt3433 = (i_14 & 0xe0) << 3;
		if (this.anInt3430 != 31) {
			this.method5052();
		}
		this.method5050(graphicalrenderer_1, i_5, i_7, i_6, i_8, i_10);
	}

	void method5050(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		this.aClass282_Sub24_3425 = graphicalrenderer_1.method8593(i_2, i_3, i_4, i_5, i_6);
	}

	void method5052() {
		switch (this.anInt3430) {
		case 2:
			this.anInt3431 = 1;
			this.anInt3435 = 0;
			this.anInt3409 = 2048;
			this.anInt3432 = 2048;
			break;
		case 3:
			this.anInt3431 = 1;
			this.anInt3435 = 0;
			this.anInt3409 = 2048;
			this.anInt3432 = 4096;
			break;
		case 4:
			this.anInt3431 = 4;
			this.anInt3435 = 0;
			this.anInt3409 = 2048;
			this.anInt3432 = 2048;
			break;
		case 5:
			this.anInt3431 = 4;
			this.anInt3435 = 0;
			this.anInt3409 = 2048;
			this.anInt3432 = 8192;
			break;
		case 6:
			this.anInt3431 = 3;
			this.anInt3435 = 1280;
			this.anInt3409 = 768;
			this.anInt3432 = 2048;
			break;
		case 7:
			this.anInt3431 = 3;
			this.anInt3435 = 1280;
			this.anInt3409 = 768;
			this.anInt3432 = 4096;
			break;
		case 8:
			this.anInt3431 = 3;
			this.anInt3435 = 1024;
			this.anInt3409 = 1024;
			this.anInt3432 = 2048;
			break;
		case 9:
			this.anInt3431 = 3;
			this.anInt3435 = 1024;
			this.anInt3409 = 1024;
			this.anInt3432 = 4096;
			break;
		case 10:
			this.anInt3431 = 3;
			this.anInt3435 = 1536;
			this.anInt3409 = 512;
			this.anInt3432 = 2048;
			break;
		case 11:
			this.anInt3431 = 3;
			this.anInt3435 = 1536;
			this.anInt3409 = 512;
			this.anInt3432 = 4096;
			break;
		case 12:
			this.anInt3431 = 2;
			this.anInt3435 = 0;
			this.anInt3409 = 2048;
			this.anInt3432 = 2048;
			break;
		case 13:
			this.anInt3431 = 2;
			this.anInt3435 = 0;
			this.anInt3409 = 2048;
			this.anInt3432 = 8192;
			break;
		case 14:
			this.anInt3431 = 1;
			this.anInt3435 = 1280;
			this.anInt3409 = 768;
			this.anInt3432 = 2048;
			break;
		case 15:
			this.anInt3431 = 1;
			this.anInt3435 = 1536;
			this.anInt3409 = 512;
			this.anInt3432 = 4096;
			break;
		case 16:
			this.anInt3431 = 1;
			this.anInt3435 = 1792;
			this.anInt3409 = 256;
			this.anInt3432 = 8192;
			break;
		default:
			this.anInt3435 = 0;
			this.anInt3431 = 0;
			this.anInt3409 = 2048;
			this.anInt3432 = 2048;
		}
	}

	void method5053(int i_1, boolean bool_2) {
		int i_4;
		if (!bool_2) {
			int i_5 = this.anInt3432 * i_1 / 50 + this.anInt3433 & 0x7ff;
			switch (this.anInt3431) {
			case 1:
				i_4 = (Class382.anIntArray4657[i_5 << 3] >> 4) + 1024;
				break;
			case 2:
				i_4 = i_5;
				break;
			case 3:
				i_4 = Class468_Sub20.anIntArray7920[i_5] >> 1;
				break;
			case 4:
				i_4 = i_5 >> 10 << 11;
				break;
			case 5:
				i_4 = (i_5 < 1024 ? i_5 : 2048 - i_5) << 1;
				break;
			default:
				i_4 = 2048;
			}
		} else {
			i_4 = 2048;
		}
		this.aClass282_Sub24_3425.method12373((float) ((i_4 * this.anInt3409 >> 11) + this.anInt3435) / 2048.0F);
	}

	public void method5061(int i_1, int i_2, int i_3, int i_4) {
		this.anInt3431 = i_1;
		this.anInt3435 = i_4;
		this.anInt3409 = i_3;
		this.anInt3432 = i_2;
	}

	static final void method5066(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1329 = 5;
		icomponentdefinitions_0.anInt1330 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class92.method1565(icomponentdefinitions_0.idHash, 1743541888);
		}
	}
}
