public class Class96_Sub14 extends Class96 {

	int anInt9369;
	int anInt9370;
	int anInt9371;
	int anInt9373;
	int anInt9372;

	public void method1592(int i_1) {
		Animable animable_2 = Class82.aClass75Array804[this.anInt9369].method1342((byte) 83);
		animable_2.applyHit(this.anInt9370, this.anInt9371, this.anInt9373, this.anInt9372, client.cycles, 0, 288203406);
	}

	Class96_Sub14(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9369 = rsbytebuffer_1.readUnsignedShort();
		int i_2 = rsbytebuffer_1.readUnsignedByte();
		if ((i_2 & 0x1) != 0) {
			this.anInt9370 = rsbytebuffer_1.readUnsignedShort();
			this.anInt9371 = rsbytebuffer_1.readUnsignedShort();
		} else {
			this.anInt9370 = -1;
			this.anInt9371 = -1;
		}

		if ((i_2 & 0x2) != 0) {
			this.anInt9373 = rsbytebuffer_1.readUnsignedShort();
			this.anInt9372 = rsbytebuffer_1.readUnsignedShort();
		} else {
			this.anInt9373 = -1;
			this.anInt9372 = -1;
		}

		if ((i_2 & 0x4) != 0) {
			int i_3 = rsbytebuffer_1.readUnsignedShort();
			int i_4 = rsbytebuffer_1.readUnsignedShort();
			int i_5 = i_3 * 255 / i_4;
			if (i_3 > 0 && i_5 < 1) {
				boolean bool_6 = true;
			}
		}

	}

	public void method1601() {
		Animable animable_1 = Class82.aClass75Array804[1276816799 * this.anInt9369 * 565784159].method1342((byte) 111);
		animable_1.applyHit(-2146354133 * this.anInt9370 * 1355915907, 2002383587 * this.anInt9371 * 1673585355, this.anInt9373 * 306986489 * 117044297, this.anInt9372 * -491483183 * 1810377009, client.cycles * 1968179203 * -1809259861, 0, 2138718580);
	}

	public static int method14641(int i_0) {
		boolean bool_1 = true;
		boolean bool_2 = false;
		boolean bool_3 = false;
		if (Class11.SYSTEM_INFO.anInt8167 < 512 && Class11.SYSTEM_INFO.anInt8167 != 0) {
			bool_1 = false;
		}

		if (Class225_Sub6.aString8069.startsWith("win")) {
			bool_3 = true;
			bool_2 = true;
		} else {
			bool_2 = true;
		}

		if (Class188.aBool2378) {
			bool_1 = false;
		}

		if (Class188.aBool2377) {
			bool_2 = false;
		}

		if (Class188.aBool2372) {
			bool_3 = false;
		}

		if (!bool_1 && !bool_2 && !bool_3) {
			return Class496.method8313((byte) 1);
		} else {
			int i_4 = -1;
			int i_5 = -1;
			int i_6 = -1;
			if (bool_1) {
				try {
					i_4 = Class383.method6513(2, 1000, 398662792);
				} catch (Exception exception_12) {
					;
				}
			}

			if (bool_3) {
				try {
					i_6 = Class383.method6513(3, 1000, 1356532046);
					if (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(525522056) == 3) {
						Class168 class168_7 = Renderers.SOFTWARE_RENDERER.method8392();
						long long_8 = class168_7.aLong2049 & 0xffffffffffffL;
						switch (class168_7.anInt2052) {
						case 4098:
							bool_2 &= long_8 >= 60129613779L;
							break;
						case 4318:
							bool_2 &= long_8 >= 64425238954L;
						}
					}
				} catch (Exception exception_11) {
					;
				}
			}

			if (bool_2) {
				try {
					i_5 = Class383.method6513(1, 1000, 762994065);
				} catch (Exception exception_10) {
					;
				}
			}

			if (i_4 == -1 && i_5 == -1 && i_6 == -1) {
				return Class496.method8313((byte) 1);
			} else {
				i_6 = (int) ((float) i_6 * 1.1F);
				i_5 = (int) ((float) i_5 * 1.1F);
				return i_4 > i_6 && i_4 > i_5 ? Class470.method7823(i_4, -395691636) : (i_6 > i_5 ? Class8_Sub1.method13782(3, i_6, -2005172435) : Class8_Sub1.method13782(1, i_5, -2005172435));
			}
		}
	}

	static final int[] method14642(String string_0, CS2Executor cs2executor_1, int i_2) {
		int[] ints_3 = null;
		if (string_0.length() > 0 && string_0.charAt(string_0.length() - 1) == 89) {
			int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
			if (i_4 > 0) {
				for (ints_3 = new int[i_4]; i_4-- > 0; ints_3[i_4] = cs2executor_1.intStack[--cs2executor_1.intStackPtr]) {
					;
				}
			}
		}

		return ints_3;
	}

	static boolean method14643(IComponentDefinitions icomponentdefinitions_0, int i_1) {
		IComponentSettings class282_sub10_2 = client.method11633(icomponentdefinitions_0);
		return class282_sub10_2.depthFlags() > 0 ? true : (class282_sub10_2.bit23Enabled() ? true : icomponentdefinitions_0.aClass118_1379 != null);
	}

	static final void method14644(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = cs2executor_0.aClass282_Sub4_7011.aByte7497;
	}

}
