public class Class377 implements IndexLoader {

	static Thread aThread4520;
	SoftCache aClass229_4517 = new SoftCache(64);
	Index aClass317_4518;
	public int anInt4519;

	public Class377(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_4518 = index_3;
		if (this.aClass317_4518 != null) {
			this.anInt4519 = this.aClass317_4518.filesCount(SharedConfigsType.aClass120_1487.id);
		} else {
			this.anInt4519 = 0;
		}

	}

	public Class372 method6384(int i_1, int i_2) {
		SoftCache softcache_4 = this.aClass229_4517;
		Class372 class372_3;
		synchronized (this.aClass229_4517) {
			class372_3 = (Class372) this.aClass229_4517.get((long) i_1);
		}

		if (class372_3 != null) {
			return class372_3;
		} else {
			Index index_5 = this.aClass317_4518;
			byte[] bytes_10;
			synchronized (this.aClass317_4518) {
				bytes_10 = this.aClass317_4518.getFile(SharedConfigsType.aClass120_1487.id, i_1);
			}

			class372_3 = new Class372();
			if (bytes_10 != null) {
				class372_3.method6356(new RsByteBuffer(bytes_10), 1810955787);
			}

			SoftCache softcache_9 = this.aClass229_4517;
			synchronized (this.aClass229_4517) {
				this.aClass229_4517.put(class372_3, (long) i_1);
				return class372_3;
			}
		}
	}

	public void method6386(int i_1, byte b_2) {
		SoftCache softcache_3 = this.aClass229_4517;
		synchronized (this.aClass229_4517) {
			this.aClass229_4517.method3858(i_1, (byte) -47);
		}
	}

	public void method6388(byte b_1) {
		SoftCache softcache_2 = this.aClass229_4517;
		synchronized (this.aClass229_4517) {
			this.aClass229_4517.method3859(-2056634706);
		}
	}

	public void method6390(int i_1) {
		SoftCache softcache_2 = this.aClass229_4517;
		synchronized (this.aClass229_4517) {
			this.aClass229_4517.method3863(2135815187);
		}
	}

	static void method6394(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
		graphicalrenderer_0.method8425(i_1, i_2, i_3, i_4, i_5, (byte) -74);
		graphicalrenderer_0.method8425(i_1 + 1, i_2 + 1, i_3 - 2, 16, i_6, (byte) -67);
		graphicalrenderer_0.method8562(i_1 + 1, i_2 + 18, i_3 - 2, i_4 - 19, i_6, (byte) 4);
	}

	static final void method6395(CS2Executor cs2executor_0, short s_1) {
		ClassSomet underlaydefinition_2;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_2 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_2 = cs2executor_0.aClass513_7007;
		}

		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		Class283.method5009(icomponentdefinitions_4, interface_5, cs2executor_0, -1781977981);
	}

	static final void method6396(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		Class282_Sub20_Sub38.method15430(i_2, 16711935);
	}

	static final void method6397(CS2Executor cs2executor_0, int i_1) {
		int i_2 = Class393.preferences.aClass468_Sub27_8208.method12952((byte) 81);
		Class393.preferences.setValue(Class393.preferences.aClass468_Sub27_8209, cs2executor_0.intStack[--cs2executor_0.intStackPtr] == 1 ? 0 : i_2, 2046929998);
		Class405.method6823(-734889653);
	}

	public static String method6398(Object[] arr_0, int i_1, int i_2, int i_3) {
		if (i_2 == 0) {
			return "";
		} else if (i_2 == 1) {
			CharSequence charsequence_4 = (CharSequence) arr_0[i_1];
			return charsequence_4 == null ? "null" : charsequence_4.toString();
		} else {
			int i_9 = i_2 + i_1;
			int i_5 = 0;

			for (int i_6 = i_1; i_6 < i_9; i_6++) {
				CharSequence charsequence_11 = (CharSequence) arr_0[i_6];
				if (charsequence_11 == null) {
					i_5 += 4;
				} else {
					i_5 += charsequence_11.length();
				}
			}

			StringBuilder stringbuilder_10 = new StringBuilder(i_5);

			for (int i_7 = i_1; i_7 < i_9; i_7++) {
				CharSequence charsequence_8 = (CharSequence) arr_0[i_7];
				if (charsequence_8 == null) {
					stringbuilder_10.append("null");
				} else {
					stringbuilder_10.append(charsequence_8);
				}
			}

			return stringbuilder_10.toString();
		}
	}

	static final void method6399(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
	}

	static final void method6400(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.anInt7000 -= 2;
		cs2executor_0.intStackPtr -= 2;
		String string_2 = (String) cs2executor_0.objectStack[cs2executor_0.anInt7000];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		String string_5 = (String) cs2executor_0.objectStack[cs2executor_0.anInt7000 + 1];
		Class96_Sub19.method14666(string_2, i_3 == 1, i_4, string_5, 720350555);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class415.anInt4985;
	}

	public static Class62 method6401(RsByteBuffer rsbytebuffer_0, byte b_1) {
		String string_2 = rsbytebuffer_0.readString();
		Class356 class356_3 = Class350_Sub3_Sub1.method15558(180670091)[rsbytebuffer_0.readUnsignedByte()];
		Class353 class353_4 = AccountCreationResponseOpcodes.method8155(152314627)[rsbytebuffer_0.readUnsignedByte()];
		int i_5 = rsbytebuffer_0.readShort();
		int i_6 = rsbytebuffer_0.readShort();
		int i_7 = rsbytebuffer_0.readUnsignedByte();
		int i_8 = rsbytebuffer_0.readUnsignedByte();
		int i_9 = rsbytebuffer_0.readUnsignedByte();
		int i_10 = rsbytebuffer_0.readUnsignedShort();
		int i_11 = rsbytebuffer_0.readUnsignedShort();
		int i_12 = rsbytebuffer_0.readBigSmart();
		int i_13 = rsbytebuffer_0.readInt();
		int i_14 = rsbytebuffer_0.readInt();
		return new Class62(string_2, class356_3, class353_4, i_5, i_6, i_7, i_8, i_9, i_10, i_11, i_12, i_13, i_14);
	}

}
