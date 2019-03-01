public class Class363 {

	public static int anInt4203;

	Class363() throws Throwable {
		throw new Error();
	}

	static final void method6282(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class359.method6244(icomponentdefinitions_3, interface_4, cs2executor_0, -1411462408);
	}

	static final void method6283(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class287.method5066(icomponentdefinitions_3, interface_4, cs2executor_0, 2045260236);
	}

	static final void method6284(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 1383536878).anInt5051;
	}

	static final void method6285(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class9.anInt72;
	}

	static final void method6286(long long_0) {
		Vector3 vector3_2 = Class84.myPlayer.method11166().aClass385_3595;
		int i_3 = (int) vector3_2.x + client.anInt7248;
		int i_4 = (int) vector3_2.z + client.anInt7250;
		if (Class11.anInt122 - i_3 < -2000 || Class11.anInt122 - i_3 > 2000 || Class266.anInt3289 - i_4 < -2000 || Class266.anInt3289 - i_4 > 2000) {
			Class11.anInt122 = i_3;
			Class266.anInt3289 = i_4;
		}

		int i_5;
		int i_6;
		if (i_3 != Class11.anInt122) {
			i_5 = i_3 - Class11.anInt122;
			i_6 = (int) (long_0 * (long) i_5 / 320L);
			if (i_5 > 0) {
				if (i_6 == 0) {
					i_6 = 1;
				} else if (i_6 > i_5) {
					i_6 = i_5;
				}
			} else if (i_6 == 0) {
				i_6 = -1;
			} else if (i_6 < i_5) {
				i_6 = i_5;
			}

			Class11.anInt122 += i_6;
		}

		if (i_4 != Class266.anInt3289) {
			i_5 = i_4 - Class266.anInt3289;
			i_6 = (int) (long_0 * (long) i_5 / 320L);
			if (i_5 > 0) {
				if (i_6 == 0) {
					i_6 = 1;
				} else if (i_6 > i_5) {
					i_6 = i_5;
				}
			} else if (i_6 == 0) {
				i_6 = -1;
			} else if (i_6 < i_5) {
				i_6 = i_5;
			}

			Class266.anInt3289 += i_6;
		}

		client.aFloat7365 += client.aFloat7266 * (float) long_0 / 6.0F;
		client.aFloat7146 += client.aFloat7284 * (float) long_0 / 6.0F;
		IsaacCipher.method7268(1036013303);
	}

	static final void method6287(Animable animable_0, boolean bool_1, int i_2) {
		int i_3 = Class249.aClass249_3083.aByte3085;
		int i_4 = 0;
		if (animable_0.anInt10342 > client.cycles) {
			Class249.method4281(animable_0, -1503548002);
		} else if (animable_0.anInt10345 >= client.cycles) {
			Class463.method7727(animable_0, -1790074477);
		} else {
			SystemInfo.method13466(animable_0, bool_1, 141891001);
			i_3 = IdentikitDefinition.anInt430;
			i_4 = Class8_Sub1.anInt8515;
		}

		Vector3 vector3_5 = animable_0.method11166().aClass385_3595;
		int i_6;
		if ((int) vector3_5.x < 512 || (int) vector3_5.z < 512 || (int) vector3_5.x >= (IndexLoaders.MAP_REGION_DECODER.getSizeX(735172073) - 1) * 512 || (int) vector3_5.z >= (IndexLoaders.MAP_REGION_DECODER.getSizeY(-1048165287) - 1) * 512) {
			animable_0.currentAnimation.method7567(-1, (short) 8960);

			for (i_6 = 0; i_6 < animable_0.aClass161Array10339.length; i_6++) {
				animable_0.aClass161Array10339[i_6].spotAnimId = -1;
				animable_0.aClass161Array10339[i_6].animation.method7567(-1, (short) 8960);
			}

			animable_0.currentAnimations = null;
			animable_0.anInt10342 = 0;
			animable_0.anInt10345 = 0;
			i_3 = Class249.aClass249_3083.aByte3085;
			i_4 = 0;
			animable_0.method11172((float) (512 * animable_0.regionBaseX[0] + animable_0.getSize(828768449) * 256), vector3_5.y, (float) (animable_0.regionBaseY[0] * 512 + animable_0.getSize(828768449) * 256));
			animable_0.method15801(-1972620165);
		}

		if (Class84.myPlayer == animable_0 && ((int) vector3_5.x < 6144 || (int) vector3_5.z < 6144 || (int) vector3_5.x >= (IndexLoaders.MAP_REGION_DECODER.getSizeX(723986373) - 12) * 512 || (int) vector3_5.z >= (IndexLoaders.MAP_REGION_DECODER.getSizeY(-806842262) - 12) * 512)) {
			animable_0.currentAnimation.method7567(-1, (short) 8960);

			for (i_6 = 0; i_6 < animable_0.aClass161Array10339.length; i_6++) {
				animable_0.aClass161Array10339[i_6].spotAnimId = -1;
				animable_0.aClass161Array10339[i_6].animation.method7567(-1, (short) 8960);
			}

			animable_0.currentAnimations = null;
			animable_0.anInt10342 = 0;
			animable_0.anInt10345 = 0;
			i_3 = Class249.aClass249_3083.aByte3085;
			i_4 = 0;
			animable_0.method11172((float) (animable_0.regionBaseX[0] * 512 + animable_0.getSize(828768449) * 256), vector3_5.y, (float) (512 * animable_0.regionBaseY[0] + animable_0.getSize(828768449) * 256));
			animable_0.method15801(-1972620165);
		}

		i_6 = Class427.method7188(animable_0, 1919547361);
		WallDecoration.method16087(animable_0, -702995784);
		Class302.method5361(animable_0, i_3, i_4, i_6, 1792753982);
		Class236.method3985(animable_0, i_3, (byte) -27);
		Class150.method2581(animable_0, -1454383651);
		Quaternion quaternion_7 = Quaternion.create();
		quaternion_7.romYawPitchRoll(Class382.method6508(animable_0.aClass19_10359.method578((byte) 2)), Class382.method6508(animable_0.aClass19_10330.method578((byte) 2)), Class382.method6508(animable_0.aClass19_10360.method578((byte) 2)));
		animable_0.method11187(quaternion_7);
		quaternion_7.cache();
	}

	static final void method6288(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, short s_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		int[] ints_5 = Class96_Sub14.method14642(string_4, cs2executor_2, -37726580);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1405 = Class351.method6193(string_4, cs2executor_2, 1676741238);
		icomponentdefinitions_0.anIntArray1406 = ints_5;
		icomponentdefinitions_0.aBool1384 = true;
	}

}
