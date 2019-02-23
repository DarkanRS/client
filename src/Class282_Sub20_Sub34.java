import java.util.Random;

public class Class282_Sub20_Sub34 extends Class282_Sub20 {

	public static String aString9967;
	byte[] aByteArray9965 = new byte[512];
	short[] aShortArray9966 = new short[512];
	int anInt9959 = 0;
	int anInt9960 = 2048;
	int anInt9961 = 5;
	int anInt9962 = 5;
	int anInt9963 = 2;
	int anInt9949 = 1;

	int[] method12319(int i_1, int i_2) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -956244470);
		if (this.aClass320_7667.aBool3722) {
			int i_4 = Class316.anIntArray3668[i_1] * this.anInt9962 + 2048;
			int i_5 = i_4 >> 12;
			int i_6 = i_5 + 1;

			for (int i_7 = 0; i_7 < Class316.anInt3670; i_7++) {
				Class282_Sub11_Sub2.anInt10003 = Integer.MAX_VALUE;
				Class390.anInt4777 = Integer.MAX_VALUE;
				Class10.anInt118 = Integer.MAX_VALUE;
				Class368.anInt4266 = Integer.MAX_VALUE;
				int i_8 = Class316.anIntArray3672[i_7] * this.anInt9961 + 2048;
				int i_9 = i_8 >> 12;
				int i_10 = i_9 + 1;

				for (int i_11 = i_5 - 1; i_11 <= i_6; i_11++) {
					int i_12 = this.aByteArray9965[(i_11 >= this.anInt9962 ? i_11 - this.anInt9962 : i_11) & 0xff] & 0xff;

					for (int i_13 = i_9 - 1; i_13 <= i_10; i_13++) {
						int i_14 = 2 * (this.aByteArray9965[i_12 + (i_13 >= this.anInt9961 ? i_13 - this.anInt9961 : i_13) & 0xff] & 0xff);
						int i_15 = i_8 - (this.aShortArray9966[i_14++] + (i_13 << 12));
						int i_16 = i_4 - (this.aShortArray9966[i_14] + (i_11 << 12));
						int i_17;
						switch (this.anInt9949) {
						case 1:
							i_17 = i_16 * i_16 + i_15 * i_15 >> 12;
							break;
						case 2:
							i_17 = (i_15 < 0 ? -i_15 : i_15) + (i_16 < 0 ? -i_16 : i_16);
							break;
						case 3:
							i_15 = i_15 < 0 ? -i_15 : i_15;
							i_16 = i_16 < 0 ? -i_16 : i_16;
							i_17 = i_15 > i_16 ? i_15 : i_16;
							break;
						case 4:
							i_15 = (int) (Math.sqrt((double) ((float) (i_15 < 0 ? -i_15 : i_15) / 4096.0F)) * 4096.0D);
							i_16 = (int) (Math.sqrt((double) ((float) (i_16 < 0 ? -i_16 : i_16) / 4096.0F)) * 4096.0D);
							i_17 = i_15 + i_16;
							i_17 = i_17 * i_17 >> 12;
							break;
						case 5:
							i_15 *= i_15;
							i_16 *= i_16;
							i_17 = (int) (Math.sqrt(Math.sqrt((double) ((float) (i_16 + i_15) / 1.6777216E7F))) * 4096.0D);
							break;
						default:
							i_17 = (int) (Math.sqrt((double) ((float) (i_15 * i_15 + i_16 * i_16) / 1.6777216E7F)) * 4096.0D);
						}

						if (i_17 < Class368.anInt4266) {
							Class282_Sub11_Sub2.anInt10003 = Class390.anInt4777;
							Class390.anInt4777 = Class10.anInt118;
							Class10.anInt118 = Class368.anInt4266;
							Class368.anInt4266 = i_17;
						} else if (i_17 < Class10.anInt118) {
							Class282_Sub11_Sub2.anInt10003 = Class390.anInt4777;
							Class390.anInt4777 = Class10.anInt118;
							Class10.anInt118 = i_17;
						} else if (i_17 < Class390.anInt4777) {
							Class282_Sub11_Sub2.anInt10003 = Class390.anInt4777;
							Class390.anInt4777 = i_17;
						} else if (i_17 < Class282_Sub11_Sub2.anInt10003) {
							Class282_Sub11_Sub2.anInt10003 = i_17;
						}
					}
				}

				switch (this.anInt9963) {
				case 0:
					ints_3[i_7] = Class368.anInt4266;
					break;
				case 1:
					ints_3[i_7] = Class10.anInt118;
					break;
				case 2:
					ints_3[i_7] = Class10.anInt118 - Class368.anInt4266;
					break;
				case 3:
					ints_3[i_7] = Class390.anInt4777;
					break;
				case 4:
					ints_3[i_7] = Class282_Sub11_Sub2.anInt10003;
				}
			}
		}

		return ints_3;
	}

	void method12321(int i_1) {
		this.aByteArray9965 = Class316.method5588(this.anInt9959, -602501951);
		this.method15412(957138741);
	}

	void method15412(int i_1) {
		Random random_2 = new Random((long) this.anInt9959);
		this.aShortArray9966 = new short[512];
		if (this.anInt9960 > 0) {
			for (int i_3 = 0; i_3 < 512; i_3++) {
				this.aShortArray9966[i_3] = (short) Class476.method7931(random_2, this.anInt9960, 1534079645);
			}
		}

	}

	public Class282_Sub20_Sub34() {
		super(0, true);
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
		switch (i_1) {
		case 0:
			this.anInt9961 = this.anInt9962 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 1:
			this.anInt9959 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 2:
			this.anInt9960 = rsbytebuffer_2.readUnsignedShort();
			break;
		case 3:
			this.anInt9963 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 4:
			this.anInt9949 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 5:
			this.anInt9961 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 6:
			this.anInt9962 = rsbytebuffer_2.readUnsignedByte();
		}

	}

	static final void method15416(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class282_Sub11.method12209(icomponentdefinitions_3, interface_4, cs2executor_0, 1467575804);
	}

}
