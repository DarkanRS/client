import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.nio.ByteBuffer;

public class Class282_Sub6 extends Node {

	int anInt7508 = 0;
	int anInt7514 = 0;
	int anInt7519 = 0;
	int anInt7517 = 0;
	Class390_Sub1 aClass390_Sub1_7509;
	Class505_Sub2 aClass505_Sub2_7518;
	int anInt7510;
	float aFloat7511;
	Class90 aClass90_7512;
	int[] anIntArray7515;
	Interface4 anInterface4_7516;
	NativeHeapBuffer aNativeHeapBuffer7520;
	Stream aStream7513;

	Class282_Sub6(Class390_Sub1 class390_sub1_1, int i_2, int i_3, Class90 class90_4) {
		this.aClass390_Sub1_7509 = class390_sub1_1;
		this.aClass505_Sub2_7518 = this.aClass390_Sub1_7509.aClass505_Sub2_8528;
		this.anInt7510 = i_2;
		this.aFloat7511 = (float) i_3;
		this.aClass90_7512 = class90_4;
		this.anIntArray7515 = new int[this.aClass390_Sub1_7509.anInt4776 * this.aClass390_Sub1_7509.anInt4773];
		byte b_5 = 10;
		if (i_2 >= 0) {
			Class169 class169_6 = this.aClass505_Sub2_7518.anInterface22_5834.method144(i_2, -1808049505);
			if (class169_6.aByte2064 > 0) {
				b_5 = class169_6.aByte2064;
			}
		}

		this.aClass505_Sub2_7518.method13896(b_5);
		this.aClass505_Sub2_7518.method13896(3);
	}

	void method12143(int i_1) {
		this.aStream7513.method2919(i_1 * 4 + 3);
		this.aStream7513.method2920(-1);
	}

	void method12145(int i_1, int i_2, int i_3, float f_4) {
		int i_6;
		int i_7;
		if (this.anInt7510 != -1) {
			Class169 class169_5 = this.aClass505_Sub2_7518.anInterface22_5834.method144(this.anInt7510, -1820378147);
			i_6 = class169_5.aByte2079 & 0xff;
			int i_9;
			if (i_6 != 0 && class169_5.aByte2064 != 4) {
				if (i_3 < 0) {
					i_7 = 0;
				} else if (i_3 > 127) {
					i_7 = 16777215;
				} else {
					i_7 = i_3 * 131586;
				}

				if (i_6 == 256) {
					i_2 = i_7;
				} else {
					i_9 = 256 - i_6;
					i_2 = ((i_7 & 0xff00ff) * i_6 + i_9 * (i_2 & 0xff00ff) & ~0xff00ff) + (i_9 * (i_2 & 0xff00) + i_6 * (i_7 & 0xff00) & 0xff0000) >> 8;
				}
			}

			i_7 = class169_5.aByte2080 & 0xff;
			if (i_7 != 0) {
				i_7 += 256;
				int i_8 = ((i_2 & 0xff0000) >> 16) * i_7;
				if (i_8 > 65535) {
					i_8 = 65535;
				}

				i_9 = ((i_2 & 0xff00) >> 8) * i_7;
				if (i_9 > 65535) {
					i_9 = 65535;
				}

				int i_10 = i_7 * (i_2 & 0xff);
				if (i_10 > 65535) {
					i_10 = 65535;
				}

				i_2 = (i_10 >> 8) + (i_9 & 0xff00) + (i_8 << 8 & 0xff0000);
			}
		}

		if (f_4 != 1.0F) {
			int i_11 = i_2 >> 16 & 0xff;
			i_6 = i_2 >> 8 & 0xff;
			i_7 = i_2 & 0xff;
			i_11 = (int) ((float) i_11 * f_4);
			if (i_11 < 0) {
				i_11 = 0;
			} else if (i_11 > 255) {
				i_11 = 255;
			}

			i_6 = (int) ((float) i_6 * f_4);
			if (i_6 < 0) {
				i_6 = 0;
			} else if (i_6 > 255) {
				i_6 = 255;
			}

			i_7 = (int) ((float) i_7 * f_4);
			if (i_7 < 0) {
				i_7 = 0;
			} else if (i_7 > 255) {
				i_7 = 255;
			}

			i_2 = i_11 << 16 | i_6 << 8 | i_7;
		}

		this.aStream7513.method2919(i_1 * 4);
		if (this.aClass505_Sub2_7518.anInt8824 == 0) {
			this.aStream7513.method2920((byte) i_2);
			this.aStream7513.method2920((byte) (i_2 >> 8));
			this.aStream7513.method2920((byte) (i_2 >> 16));
		} else {
			this.aStream7513.method2920((byte) (i_2 >> 16));
			this.aStream7513.method2920((byte) (i_2 >> 8));
			this.aStream7513.method2920((byte) i_2);
		}

	}

	void method12146(int i_1) {
		this.aStream7513.method2925();
		this.anInterface4_7516 = this.aClass505_Sub2_7518.method13994(false);
		this.anInterface4_7516.method27(i_1 * 4, 4, this.aNativeHeapBuffer7520);
		this.aNativeHeapBuffer7520 = null;
		this.aStream7513 = null;
	}

	void method12147(int[] ints_1, int i_2) {
		this.anInt7514 = 0;
		this.anInt7519 = 32767;
		this.anInt7517 = -32768;
		ByteBuffer bytebuffer_3 = this.aClass505_Sub2_7518.aByteBuffer8838;

		label49: for (int i_4 = 0; i_4 < i_2; i_4++) {
			int i_5 = ints_1[i_4];
			short[] shorts_6 = this.aClass390_Sub1_7509.aShortArrayArray8534[i_5];
			int i_7 = this.anIntArray7515[i_5];
			if (i_7 != 0 && shorts_6 != null) {
				int i_8 = 0;
				int i_9 = 0;

				while (true) {
					while (true) {
						if (i_9 >= shorts_6.length) {
							continue label49;
						}

						if ((i_7 & 1 << i_8++) != 0) {
							for (int i_10 = 0; i_10 < 3; i_10++) {
								int i_11 = shorts_6[i_9++] & 0xffff;
								if (i_11 > this.anInt7517) {
									this.anInt7517 = i_11;
								}

								if (i_11 < this.anInt7519) {
									this.anInt7519 = i_11;
								}

								bytebuffer_3.putShort((short) i_11);
							}

							this.anInt7514 += 3;
						} else {
							i_9 += 3;
						}
					}
				}
			}
		}

	}

	void method12150(int i_1) {
		this.aNativeHeapBuffer7520 = this.aClass505_Sub2_7518.method13910(i_1 * 4, true);
		this.aStream7513 = new Stream(this.aNativeHeapBuffer7520, 0, i_1 * 4);
	}

	void method12152(int i_1, int i_2, int i_3) {
		this.anIntArray7515[i_2 * this.aClass390_Sub1_7509.anInt4776 + i_1] |= 1 << i_3;
		++this.anInt7508;
	}

}
