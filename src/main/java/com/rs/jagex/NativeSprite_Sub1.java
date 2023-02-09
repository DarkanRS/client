package com.rs.jagex;

public abstract class NativeSprite_Sub1 extends NativeSprite {

	static int anInt8878;
	static int anInt8879;
	static int anInt8880;
	static int anInt8852;
	static int anInt8882;
	static int anInt8883;
	static int anInt8884;
	static int anInt8885;
	static int anInt8850;
	static int anInt8870;
	static int anInt8865;
	static int anInt8868;
	static int anInt8869;
	static int anInt8876;
	static int anInt8871;
	static int anInt8872;
	static int anInt8873;
	static int anInt8874;
	static int anInt8858;
	static int anInt8866;
	static int anInt8861;
	static int anInt8862;
	static int anInt8863;
	static int anInt8864;
	static int anInt8877;
	int anInt8853;
	int anInt8854;
	int anInt8855;
	int anInt8856;
	int[] anIntArray8857;
	JavaRenderer renderer;
	int anInt8851;
	int anInt8867;

	NativeSprite_Sub1(JavaRenderer hardwarerenderer_1, int i_2, int i_3) {
		renderer = hardwarerenderer_1;
		anInt8851 = i_2;
		anInt8867 = i_3;
	}

	abstract void method14245(int var1, int var2);

	abstract void method14246(int var1, int var2);

	abstract void method14247(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, boolean var13);

	boolean method14248(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6) {
		int i_7 = anInt8853 + anInt8851 + anInt8855;
		int i_8 = anInt8854 + anInt8867 + anInt8856;
		float f_9;
		float f_10;
		float f_11;
		float f_12;
		float f_13;
		float f_14;
		float f_15;
		float f_16;
		if (i_7 != anInt8851 || i_8 != anInt8867) {
			f_9 = (f_3 - f_1) / i_7;
			f_10 = (f_4 - f_2) / i_7;
			f_11 = (f_5 - f_1) / i_8;
			f_12 = (f_6 - f_2) / i_8;
			f_13 = f_11 * anInt8854;
			f_14 = f_12 * anInt8854;
			f_15 = f_9 * anInt8853;
			f_16 = f_10 * anInt8853;
			float f_17 = -f_9 * anInt8855;
			float f_18 = -f_10 * anInt8855;
			float f_19 = -f_11 * anInt8856;
			float f_20 = -f_12 * anInt8856;
			f_1 += f_15 + f_13;
			f_2 += f_16 + f_14;
			f_3 += f_17 + f_13;
			f_4 += f_18 + f_14;
			f_5 += f_15 + f_19;
			f_6 += f_16 + f_20;
		}

		f_9 = f_5 + (f_3 - f_1);
		f_10 = f_4 + (f_6 - f_2);
		if (f_1 < f_3) {
			f_11 = f_1;
			f_12 = f_3;
		} else {
			f_11 = f_3;
			f_12 = f_1;
		}

		if (f_5 < f_11)
			f_11 = f_5;

		if (f_9 < f_11)
			f_11 = f_9;

		if (f_5 > f_12)
			f_12 = f_5;

		if (f_9 > f_12)
			f_12 = f_9;

		if (f_2 < f_4) {
			f_13 = f_2;
			f_14 = f_4;
		} else {
			f_13 = f_4;
			f_14 = f_2;
		}

		if (f_6 < f_13)
			f_13 = f_6;

		if (f_10 < f_13)
			f_13 = f_10;

		if (f_6 > f_14)
			f_14 = f_6;

		if (f_10 > f_14)
			f_14 = f_10;

		if (f_11 < renderer.anInt8983)
			f_11 = renderer.anInt8983;

		if (f_12 > renderer.anInt9002)
			f_12 = renderer.anInt9002;

		if (f_13 < renderer.anInt9009)
			f_13 = renderer.anInt9009;

		if (f_14 > renderer.anInt8986)
			f_14 = renderer.anInt8986;

		f_12 = f_11 - f_12;
		if (f_12 >= 0.0F)
			return false;
		f_14 = f_13 - f_14;
		if (f_14 >= 0.0F)
			return false;
		else {
			anInt8850 = renderer.width;
			anInt8870 = (int) (((int) f_13 * anInt8850) + f_11);
			f_15 = (f_3 - f_1) * (f_6 - f_2) - (f_4 - f_2) * (f_5 - f_1);
			f_16 = (f_5 - f_1) * (f_4 - f_2) - (f_6 - f_2) * (f_3 - f_1);
			anInt8865 = (int) ((f_6 - f_2) * 4096.0F * anInt8851 / f_15);
			anInt8868 = (int) ((f_4 - f_2) * 4096.0F * anInt8867 / f_16);
			anInt8869 = (int) ((f_5 - f_1) * 4096.0F * anInt8851 / f_16);
			anInt8876 = (int) ((f_3 - f_1) * 4096.0F * anInt8867 / f_15);
			anInt8871 = (int) (f_11 * 16.0F + 8.0F - (f_1 + f_3 + f_5 + f_9) / 4.0F * 16.0F);
			anInt8872 = (int) (f_13 * 16.0F + 8.0F - (f_2 + f_4 + f_6 + f_10) / 4.0F * 16.0F);
			anInt8873 = (anInt8851 >> 1 << 12) + (anInt8872 * anInt8869 >> 4);
			anInt8874 = (anInt8867 >> 1 << 12) + (anInt8872 * anInt8876 >> 4);
			anInt8858 = anInt8871 * anInt8865 >> 4;
			anInt8866 = anInt8871 * anInt8868 >> 4;
			anInt8861 = (int) f_11;
			anInt8862 = (int) f_12;
			anInt8863 = (int) f_13;
			anInt8864 = (int) f_14;
			return true;
		}
	}

	abstract void method14250(int[] var1, int[] var2, int var3, int var4);

	abstract void method14251(int[] var1, int[] var2, int var3, int var4);

	abstract void method14252(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, boolean var13);

	abstract void method14253(int var1, int var2);

	abstract void method14255(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, boolean var13);

	@Override
	public abstract void method2742(int var1, int var2, int var3, int var4, int var5);

	@Override
	public void method2743(int i_1, int i_2, int i_3, int i_4) {
		anInt8853 = i_1;
		anInt8854 = i_2;
		anInt8855 = i_3;
		anInt8856 = i_4;
	}

	@Override
	public void method2744(int[] ints_1) {
		ints_1[0] = anInt8853;
		ints_1[1] = anInt8854;
		ints_1[2] = anInt8855;
		ints_1[3] = anInt8856;
	}

	@Override
	public int method2747() {
		return anInt8851;
	}

	@Override
	public int method2748() {
		return anInt8854 + anInt8867 + anInt8856;
	}

	@Override
	public abstract void method2749(int var1, int var2, int var3, int var4, int var5);

	@Override
	public int method2753() {
		return anInt8854 + anInt8867 + anInt8856;
	}

	@Override
	abstract void method2755(int var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@Override
	public int method2757() {
		return anInt8854 + anInt8867 + anInt8856;
	}

	@Override
	void method2764(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9) {
		if (renderer.method14408())
			throw new IllegalStateException();
		if (method14248(f_1, f_2, f_3, f_4, f_5, f_6)) {
			anInt8877 = i_8;
			if (i_7 != 1) {
				anInt8878 = i_8 >>> 24;
				anInt8879 = 256 - anInt8878;
				if (i_7 == 0) {
					anInt8880 = (i_8 & 0xff0000) >> 16;
					anInt8852 = (i_8 & 0xff00) >> 8;
					anInt8882 = i_8 & 0xff;
				} else if (i_7 == 2) {
					anInt8883 = i_8 >>> 24;
					anInt8884 = 256 - anInt8883;
					int i_11 = (i_8 & 0xff00ff) * anInt8884 & -16711936;
					int i_12 = (i_8 & 0xff00) * anInt8884 & 0xff0000;
					anInt8885 = (i_11 | i_12) >>> 8;
				}
			}

			if (i_7 == 1) {
				if (i_9 == 0)
					method14245(1, 0);
				else if (i_9 == 1)
					method14245(1, 1);
				else if (i_9 == 2)
					method14245(1, 2);
			} else if (i_7 == 0) {
				if (i_9 == 0)
					method14245(0, 0);
				else if (i_9 == 1)
					method14245(0, 1);
				else if (i_9 == 2)
					method14245(0, 2);
			} else if (i_7 == 3) {
				if (i_9 == 0)
					method14245(3, 0);
				else if (i_9 == 1)
					method14245(3, 1);
				else if (i_9 == 2)
					method14245(3, 2);
			} else if (i_7 == 2)
				if (i_9 == 0)
					method14245(2, 0);
				else if (i_9 == 1)
					method14245(2, 1);
				else if (i_9 == 2)
					method14245(2, 2);
		}
	}

	@Override
	public int method2765() {
		return anInt8867;
	}

	@Override
	void method2766(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		if (renderer.method14408())
			throw new IllegalStateException();
		if (method14248(f_1, f_2, f_3, f_4, f_5, f_6)) {
			Class455_Sub3 packetsdecoder_11 = (Class455_Sub3) class455_8;
			method14250(packetsdecoder_11.anIntArray9077, packetsdecoder_11.anIntArray9078, anInt8861 - i_9, -i_10 - (anInt8864 - anInt8863));
		}
	}

	@Override
	public void method2772(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		if (renderer.method14408())
			throw new IllegalStateException();
		if (anIntArray8857 == null)
			anIntArray8857 = new int[4];

		renderer.qa(anIntArray8857);
		renderer.o(renderer.anInt8983, renderer.anInt9009, i_3 + i_1, i_2 + i_4);
		int i_8 = scaleWidth();
		int i_9 = method2748();
		int i_10 = (i_3 + i_8 - 1) / i_8;
		int i_11 = (i_9 + i_4 - 1) / i_9;

		for (int i_12 = 0; i_12 < i_11; i_12++) {
			int i_13 = i_12 * i_9;

			for (int i_14 = 0; i_14 < i_10; i_14++)
				method2742(i_14 * i_8 + i_1, i_13 + i_2, i_5, i_6, i_7);
		}

		renderer.r(anIntArray8857[0], anIntArray8857[1], anIntArray8857[2], anIntArray8857[3]);
	}

	@Override
	public abstract void method2773(int var1, int var2, Class455 var3, int var4, int var5);

	@Override
	public abstract void method2774(int var1, int var2, Class455 var3, int var4, int var5);

	@Override
	abstract void method2775(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

	@Override
	public void method2777(int[] ints_1) {
		ints_1[0] = anInt8853;
		ints_1[1] = anInt8854;
		ints_1[2] = anInt8855;
		ints_1[3] = anInt8856;
	}

	@Override
	public abstract void method2778(int var1, int var2, int var3, int var4, int var5);

	@Override
	public void method2780(int i_1, int i_2, int i_3, int i_4) {
		anInt8853 = i_1;
		anInt8854 = i_2;
		anInt8855 = i_3;
		anInt8856 = i_4;
	}

	@Override
	public void method2781(int i_1, int i_2, int i_3, int i_4) {
		anInt8853 = i_1;
		anInt8854 = i_2;
		anInt8855 = i_3;
		anInt8856 = i_4;
	}

	@Override
	public void method2782(int[] ints_1) {
		ints_1[0] = anInt8853;
		ints_1[1] = anInt8854;
		ints_1[2] = anInt8855;
		ints_1[3] = anInt8856;
	}

	@Override
	public void method2783(int i_1, int i_2, int i_3, int i_4) {
		anInt8853 = i_1;
		anInt8854 = i_2;
		anInt8855 = i_3;
		anInt8856 = i_4;
	}

	@Override
	public abstract void method2784(int var1, int var2, Class455 var3, int var4, int var5);

	@Override
	public void method2785(int[] ints_1) {
		ints_1[0] = anInt8853;
		ints_1[1] = anInt8854;
		ints_1[2] = anInt8855;
		ints_1[3] = anInt8856;
	}

	@Override
	public int method2786() {
		return anInt8851;
	}

	@Override
	abstract void method2787(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

	@Override
	public int method2788() {
		return anInt8867;
	}

	@Override
	void method2791(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		if (renderer.method14408())
			throw new IllegalStateException();
		if (method14248(f_1, f_2, f_3, f_4, f_5, f_6)) {
			anInt8877 = i_8;
			if (i_7 != 1) {
				anInt8878 = i_8 >>> 24;
		anInt8879 = 256 - anInt8878;
		if (i_7 == 0) {
			anInt8880 = (i_8 & 0xff0000) >> 16;
			anInt8852 = (i_8 & 0xff00) >> 8;
			anInt8882 = i_8 & 0xff;
		} else if (i_7 == 2) {
			anInt8883 = i_8 >>> 24;
			anInt8884 = 256 - anInt8883;
			int i_11 = (i_8 & 0xff00ff) * anInt8884 & -16711936;
			int i_12 = (i_8 & 0xff00) * anInt8884 & 0xff0000;
			anInt8885 = (i_11 | i_12) >>> 8;
		}
			}

			if (i_7 == 1) {
				if (i_9 == 0)
					method14245(1, 0);
				else if (i_9 == 1)
					method14245(1, 1);
				else if (i_9 == 2)
					method14245(1, 2);
			} else if (i_7 == 0) {
				if (i_9 == 0)
					method14245(0, 0);
				else if (i_9 == 1)
					method14245(0, 1);
				else if (i_9 == 2)
					method14245(0, 2);
			} else if (i_7 == 3) {
				if (i_9 == 0)
					method14245(3, 0);
				else if (i_9 == 1)
					method14245(3, 1);
				else if (i_9 == 2)
					method14245(3, 2);
			} else if (i_7 == 2)
				if (i_9 == 0)
					method14245(2, 0);
				else if (i_9 == 1)
					method14245(2, 1);
				else if (i_9 == 2)
					method14245(2, 2);
		}
	}

	@Override
	public int method2792() {
		return anInt8854 + anInt8867 + anInt8856;
	}

	@Override
	public int method2793() {
		return anInt8867;
	}

	@Override
	public int method2794() {
		return anInt8851;
	}

	@Override
	public void method2796(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		if (renderer.method14408())
			throw new IllegalStateException();
		if (anIntArray8857 == null)
			anIntArray8857 = new int[4];

		renderer.qa(anIntArray8857);
		renderer.o(renderer.anInt8983 * -363774331 * 72550989, renderer.anInt9009 * 1457972577 * 1516535457, i_1 + i_3, i_2 + i_4);
		int i_8 = scaleWidth();
		int i_9 = method2748();
		int i_10 = (i_3 + i_8 - 1) / i_8;
		int i_11 = (i_4 + i_9 - 1) / i_9;

		for (int i_12 = 0; i_12 < i_11; i_12++) {
			int i_13 = i_12 * i_9;

			for (int i_14 = 0; i_14 < i_10; i_14++)
				method2742(i_1 + i_14 * i_8, i_2 + i_13, i_5, i_6, i_7);
		}

		renderer.r(anIntArray8857[0], anIntArray8857[1], anIntArray8857[2], anIntArray8857[3]);
	}

	@Override
	void method2798(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		if (renderer.method14408())
			throw new IllegalStateException();
		if (method14248(f_1, f_2, f_3, f_4, f_5, f_6)) {
			anInt8877 = i_8;
			if (i_7 != 1) {
				anInt8878 = i_8 >>> 24;
		anInt8879 = 256 - anInt8878;
		if (i_7 == 0) {
			anInt8880 = (i_8 & 0xff0000) >> 16;
			anInt8852 = (i_8 & 0xff00) >> 8;
			anInt8882 = i_8 & 0xff;
		} else if (i_7 == 2) {
			anInt8883 = i_8 >>> 24;
			anInt8884 = 256 - anInt8883;
			int i_11 = (i_8 & 0xff00ff) * anInt8884 & -16711936;
			int i_12 = (i_8 & 0xff00) * anInt8884 & 0xff0000;
			anInt8885 = (i_11 | i_12) >>> 8;
		}
			}

			if (i_7 == 1) {
				if (i_9 == 0)
					method14245(1, 0);
				else if (i_9 == 1)
					method14245(1, 1);
				else if (i_9 == 2)
					method14245(1, 2);
			} else if (i_7 == 0) {
				if (i_9 == 0)
					method14245(0, 0);
				else if (i_9 == 1)
					method14245(0, 1);
				else if (i_9 == 2)
					method14245(0, 2);
			} else if (i_7 == 3) {
				if (i_9 == 0)
					method14245(3, 0);
				else if (i_9 == 1)
					method14245(3, 1);
				else if (i_9 == 2)
					method14245(3, 2);
			} else if (i_7 == 2)
				if (i_9 == 0)
					method14245(2, 0);
				else if (i_9 == 1)
					method14245(2, 1);
				else if (i_9 == 2)
					method14245(2, 2);
		}
	}

	@Override
	public void method2799(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		if (renderer.method14408())
			throw new IllegalStateException();
		if (anIntArray8857 == null)
			anIntArray8857 = new int[4];

		renderer.qa(anIntArray8857);
		renderer.o(renderer.anInt8983 * -363774331 * 72550989, renderer.anInt9009 * 1457972577 * 1516535457, i_1 + i_3, i_2 + i_4);
		int i_8 = scaleWidth();
		int i_9 = method2748();
		int i_10 = (i_3 + i_8 - 1) / i_8;
		int i_11 = (i_4 + i_9 - 1) / i_9;

		for (int i_12 = 0; i_12 < i_11; i_12++) {
			int i_13 = i_12 * i_9;

			for (int i_14 = 0; i_14 < i_10; i_14++)
				method2742(i_1 + i_14 * i_8, i_2 + i_13, i_5, i_6, i_7);
		}

		renderer.r(anIntArray8857[0], anIntArray8857[1], anIntArray8857[2], anIntArray8857[3]);
	}

	@Override
	void method2800(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		if (renderer.method14408())
			throw new IllegalStateException();
		if (method14248(f_1, f_2, f_3, f_4, f_5, f_6)) {
			Class455_Sub3 packetsdecoder_11 = (Class455_Sub3) class455_8;
			method14250(packetsdecoder_11.anIntArray9077, packetsdecoder_11.anIntArray9078, anInt8861 - i_9, -i_10 - (anInt8864 - anInt8863));
		}
	}

	@Override
	public void method2804(int[] ints_1) {
		ints_1[0] = anInt8853;
		ints_1[1] = anInt8854;
		ints_1[2] = anInt8855;
		ints_1[3] = anInt8856;
	}

	@Override
	void method2811(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, Class455 class455_8, int i_9, int i_10) {
		if (renderer.method14408())
			throw new IllegalStateException();
		if (method14248(f_1, f_2, f_3, f_4, f_5, f_6)) {
			Class455_Sub3 packetsdecoder_11 = (Class455_Sub3) class455_8;
			method14250(packetsdecoder_11.anIntArray9077, packetsdecoder_11.anIntArray9078, anInt8861 - i_9, -i_10 - (anInt8864 - anInt8863));
		}
	}

	@Override
	void method2812(float f_1, float f_2, float f_3, float f_4, float f_5, float f_6, int i_7, int i_8, int i_9, int i_10) {
		if (renderer.method14408())
			throw new IllegalStateException();
		if (method14248(f_1, f_2, f_3, f_4, f_5, f_6)) {
			anInt8877 = i_8;
			if (i_7 != 1) {
				anInt8878 = i_8 >>> 24;
		anInt8879 = 256 - anInt8878;
		if (i_7 == 0) {
			anInt8880 = (i_8 & 0xff0000) >> 16;
			anInt8852 = (i_8 & 0xff00) >> 8;
			anInt8882 = i_8 & 0xff;
		} else if (i_7 == 2) {
			anInt8883 = i_8 >>> 24;
			anInt8884 = 256 - anInt8883;
			int i_11 = (i_8 & 0xff00ff) * anInt8884 & -16711936;
			int i_12 = (i_8 & 0xff00) * anInt8884 & 0xff0000;
			anInt8885 = (i_11 | i_12) >>> 8;
		}
			}

			if (i_7 == 1) {
				if (i_9 == 0)
					method14245(1, 0);
				else if (i_9 == 1)
					method14245(1, 1);
				else if (i_9 == 2)
					method14245(1, 2);
			} else if (i_7 == 0) {
				if (i_9 == 0)
					method14245(0, 0);
				else if (i_9 == 1)
					method14245(0, 1);
				else if (i_9 == 2)
					method14245(0, 2);
			} else if (i_7 == 3) {
				if (i_9 == 0)
					method14245(3, 0);
				else if (i_9 == 1)
					method14245(3, 1);
				else if (i_9 == 2)
					method14245(3, 2);
			} else if (i_7 == 2)
				if (i_9 == 0)
					method14245(2, 0);
				else if (i_9 == 1)
					method14245(2, 1);
				else if (i_9 == 2)
					method14245(2, 2);
		}
	}

	@Override
	public int scaleWidth() {
		return anInt8853 + anInt8851 + anInt8855;
	}

}
