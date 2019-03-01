public abstract class Class390 {

	static int anInt4777;
	public int anInt4776;
	public int anInt4773;
	public int anInt4774;
	public int anInt4775;
	public int[][] anIntArrayArray4772;

	public abstract void method6706(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class90 var11, boolean var12);

	public abstract void LA(int var1, int var2, int var3);

	public abstract void method6707(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, Class90 var11, boolean var12);

	public abstract void method6708(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class90 var14, boolean var15);

	public abstract void SA();

	public abstract void p();

	public final int method6709(int i_1, int i_2, int i_3) {
		int i_4 = i_1 >> this.anInt4775;
		int i_5 = i_2 >> this.anInt4775;
		if (i_4 >= 0 && i_5 >= 0 && i_4 <= this.anInt4776 - 1 && i_5 <= this.anInt4773 - 1) {
			int i_6 = i_1 & this.anInt4774 - 1;
			int i_7 = i_2 & this.anInt4774 - 1;
			int i_8 = this.anIntArrayArray4772[i_4][i_5] * (this.anInt4774 - i_6) + i_6 * this.anIntArrayArray4772[i_4 + 1][i_5] >> this.anInt4775;
			int i_9 = this.anIntArrayArray4772[i_4][i_5 + 1] * (this.anInt4774 - i_6) + this.anIntArrayArray4772[i_4 + 1][i_5 + 1] * i_6 >> this.anInt4775;
			return i_9 * i_7 + i_8 * (this.anInt4774 - i_7) >> this.anInt4775;
		} else {
			return 0;
		}
	}

	public abstract void method6710(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

	public abstract void z(Class282_Sub50_Sub17 var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract void method6711(Class282_Sub24 var1, int[] var2);

	public abstract void UA(Class282_Sub50_Sub17 var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract void NA(Class282_Sub50_Sub17 var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract boolean method6712(Class282_Sub50_Sub17 var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract void method6713(Class282_Sub24 var1, int[] var2);

	public abstract void m(int var1, int var2, int var3);

	public abstract void method6714(int var1, int var2, int[] var3, int[] var4, int[] var5, int[] var6, int[] var7, int[] var8, int[] var9, int[] var10, int[] var11, int[] var12, int[] var13, Class90 var14, boolean var15);

	public abstract void b(Class282_Sub50_Sub17 var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract void method6715(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

	public abstract void e();

	public abstract void method6716(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

	public abstract void method6717(int var1, int var2, int var3, boolean[][] var4, boolean var5, int var6);

	public abstract void u(Class282_Sub50_Sub17 var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract boolean method6718(Class282_Sub50_Sub17 var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract boolean method6719(Class282_Sub50_Sub17 var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract void d(Class282_Sub50_Sub17 var1, int var2, int var3, int var4, int var5, boolean var6);

	public abstract void a(Class282_Sub50_Sub17 var1, int var2, int var3, int var4, int var5, boolean var6);

	Class390(int i_1, int i_2, int i_3, int[][] ints_4) {
		this.anInt4776 = i_1;
		this.anInt4773 = i_2;

		int i_5;
		for (i_5 = 0; i_3 > 1; i_3 >>= 1) {
			++i_5;
		}

		this.anInt4774 = 1 << i_5;
		this.anInt4775 = i_5;
		this.anIntArrayArray4772 = ints_4;
	}

	public abstract void method6720(Class282_Sub24 var1, int[] var2);

	public abstract Class282_Sub50_Sub17 s(int var1, int var2, Class282_Sub50_Sub17 var3);

	public abstract void method6721(Class282_Sub24 var1, int[] var2);

	public final int method6722(int i_1, int i_2, int i_3) {
		return this.anIntArrayArray4772[i_1][i_2];
	}

	public abstract void method6723(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean[][] var8);

	public abstract Class282_Sub50_Sub17 w(int var1, int var2, Class282_Sub50_Sub17 var3);

	static void method6728(IComponentDefinitions icomponentdefinitions_0, Class119 class119_1, int i_2, int i_3, int i_4, int i_5, int i_6, long long_7) {
		int i_9 = i_5 * i_5 + i_4 * i_4;
		if ((long) i_9 <= long_7) {
			int i_10;
			if (NativeLibraryLoader.anInt3240 == 4) {
				i_10 = (int) client.aFloat7365 & 0x3fff;
			} else {
				i_10 = (int) client.aFloat7365 + client.anInt7255 & 0x3fff;
			}

			int i_11 = Class382.anIntArray4657[i_10];
			int i_12 = Class382.anIntArray4661[i_10];
			if (NativeLibraryLoader.anInt3240 != 4) {
				i_11 = i_11 * 256 / (client.anInt7203 + 256);
				i_12 = i_12 * 256 / (client.anInt7203 + 256);
			}

			int i_13 = i_12 * i_4 + i_5 * i_11 >> 14;
			int i_14 = i_5 * i_12 - i_11 * i_4 >> 14;
			NativeSprite nativesprite_15 = Class282_Sub20_Sub15.aClass160Array9838[i_6];
			int i_16 = nativesprite_15.method2747();
			int i_17 = nativesprite_15.method2793();
			int i_18 = i_13 + icomponentdefinitions_0.anInt1301 / 2 - i_16 / 2;
			int i_19 = i_16 + i_18;
			int i_20 = -i_14 + icomponentdefinitions_0.anInt1429 / 2 - i_17;
			int i_21 = i_20 + i_17;
			if (class119_1.method2073(i_18, i_20, -560505458) && class119_1.method2073(i_19, i_20, -1424835178) && class119_1.method2073(i_18, i_21, -197878747) && class119_1.method2073(i_19, i_21, -685172335)) {
				nativesprite_15.method2773(i_18 + i_2, i_3 + i_20, class119_1.aClass455_1456, i_2, i_3);
			} else {
				double d_22 = Math.atan2((double) i_13, (double) i_14);
				int i_24 = Math.min(icomponentdefinitions_0.anInt1301 / 2, icomponentdefinitions_0.anInt1429 / 2);
				i_24 -= 6;
				int i_25 = (int) (Math.sin(d_22) * (double) i_24);
				int i_26 = (int) (Math.cos(d_22) * (double) i_24);
				Class245.aClass160Array3027[i_6].method2758((float) i_2 + (float) icomponentdefinitions_0.anInt1301 / 2.0F + (float) i_25, (float) i_3 + (float) icomponentdefinitions_0.anInt1429 / 2.0F - (float) i_26, 4096, (int) (65535.0D * (-d_22 / 6.283185307179586D)));
			}
		}

	}

	static final void method6729(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		boolean bool_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1] == 1;
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub18_8214, i_2, 77442027);
		if (!bool_3) {
			Class393.preferences.setValue(Class393.preferences.aClass468_Sub6_8192, 0, -1019376772);
		}

		Class190.savePreferences((byte) 45);
		client.aBool7175 = false;
	}

	static final void method6730(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = ((Player) cs2executor_0.animable).method16127(true, 2071482968);
	}

	public static final void method6731(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		if (i_0 >= Class532_Sub1.anInt7071 && i_1 <= Class532_Sub1.anInt7069 && i_2 >= Class532_Sub1.anInt7070 && i_3 <= Class532_Sub1.anInt7068) {
			HitbarDefinitions.method3230(i_0, i_1, i_2, i_3, i_4, i_5, i_6, (byte) 89);
		} else {
			PlayerAppearance.method4034(i_0, i_1, i_2, i_3, i_4, i_5, i_6, (byte) -84);
		}

	}

	static final void method6732(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		EnumDefinitions enumdefinitions_3 = IndexLoaders.ENUM_LOADER.getEnumDefinitions(i_2, (byte) 8);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = enumdefinitions_3.method7222(1242812938);
	}

}
