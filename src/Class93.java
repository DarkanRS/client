public class Class93 {

	int[] anIntArray971;
	int[] anIntArray968;

	Class93(RsByteBuffer rsbytebuffer_1) {
		int i_2 = rsbytebuffer_1.readUnsignedSmart(1738391980);
		this.anIntArray971 = new int[i_2];
		this.anIntArray968 = new int[i_2];

		for (int i_3 = 0; i_3 < i_2; i_3++) {
			int i_4 = rsbytebuffer_1.readUnsignedByte();
			this.anIntArray971[i_3] = i_4;
			int i_5 = rsbytebuffer_1.readUnsignedShort();
			int i_6 = rsbytebuffer_1.readUnsignedShort();
			this.anIntArray968[i_3] = i_6 + (i_5 << 16);
		}

	}

	void method1566(Class75 class75_1, int i_2, int i_3) {
		int i_4 = this.anIntArray968[0];
		class75_1.method1338(i_2, i_4 >>> 16, i_4 & 0xffff, 307993512);
		Animable animable_5 = class75_1.method1342((byte) 51);
		animable_5.anInt10355 = 0;

		for (int i_6 = this.anIntArray971.length - 1; i_6 >= 0; --i_6) {
			int i_7 = this.anIntArray971[i_6];
			int i_8 = this.anIntArray968[i_6];
			animable_5.regionBaseX[animable_5.anInt10355] = i_8 >> 16;
			animable_5.regionBaseY[animable_5.anInt10355] = i_8 & 0xffff;
			byte b_9 = Class249.aClass249_3084.aByte3085;
			if (i_7 == 0) {
				b_9 = Class249.aClass249_3082.aByte3085;
			} else if (i_7 == 2) {
				b_9 = Class249.aClass249_3086.aByte3085;
			}

			animable_5.aByteArray10365[animable_5.anInt10355] = b_9;
			++animable_5.anInt10355;
		}

	}

	public static void method1568(int i_0) {
		SoftCache softcache_1 = PlayerAppearance.aClass229_2920;
		synchronized (PlayerAppearance.aClass229_2920) {
			PlayerAppearance.aClass229_2920.method3863(1281693706);
		}

		softcache_1 = PlayerAppearance.aClass229_2930;
		synchronized (PlayerAppearance.aClass229_2930) {
			PlayerAppearance.aClass229_2930.method3863(1087742173);
		}
	}

	static final void method1569(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class249.method4280(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 60);
	}

	static final void method1570(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class96_Sub18.method14664(icomponentdefinitions_3, interface_4, true, 1, cs2executor_0, (byte) -4);
	}

	static final void method1571(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 38);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1336;
	}

	static final void method1572(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub22_8213.method7785(i_2, -398594048);
	}

	static final void method1573(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		Class282_Sub44 class282_sub44_4 = (Class282_Sub44) client.aClass465_7442.get((long) i_2);
		if (class282_sub44_4 != null && i_3 == class282_sub44_4.anInt8063) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 1;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		}

	}

	static final void method1574(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub14_8211.method12727(-247262308) ? 1 : 0;
	}

	public static void method1575(int i_0, int i_1, boolean bool_2, int i_3) {
		if (Class492.aClass465_5774.get((long) i_0) == null) {
			if (!client.aBool7393) {
				Class62.method1260(i_0, bool_2, 860609292);
			} else {
				Class282_Sub37 class282_sub37_4 = new Class282_Sub37(i_0, new Class278_Sub1(4096, IndexLoaders.aClass317_2663, i_0), i_1, bool_2);
				class282_sub37_4.aClass278_Sub1_8001.method4915(Class223.CURRENT_LANGUAGE.method8276(1496562454), 47217972);
				Class492.aClass465_5774.method7765(class282_sub37_4, (long) i_0);
			}
		}

	}

	public static boolean method1576(int i_0) {
		try {
			if (!IcmpService_Sub1.available()) {
				boolean bool_1 = false;
				return bool_1;
			}
		} catch (Throwable throwable_4) {
			return false;
		}

		if (IcmpService_Sub1.anIcmpService_Sub1_7964 != null) {
			throw new IllegalStateException("");
		} else {
			IcmpService_Sub1.anIcmpService_Sub1_7964 = new IcmpService_Sub1();
			Thread thread_3 = new Thread(new Class512());
			thread_3.setDaemon(true);
			thread_3.start();
			return true;
		}
	}

	static boolean method1577(SceneObject sceneobject_0, int i_1) {
		ObjectDefinitions objectdefinitions_2 = IndexLoaders.MAP_REGION_DECODER.method4436(-1771032162).getObjectDefinitions(sceneobject_0.getId(-1594739949), 65280);
		if (objectdefinitions_2.anInt5689 == -1) {
			return true;
		} else {
			Class418 class418_3 = IndexLoaders.aClass427_995.method7172(objectdefinitions_2.anInt5689, -1014703371);
			return class418_3.anInt4995 == -1 ? true : class418_3.method7015(65280);
		}
	}

	static String method1578(long long_0, int i_2, byte b_3) {
		Class155.method2634(long_0);
		int i_4 = Class407.aCalendar4848.get(5);
		int i_5 = Class407.aCalendar4848.get(2) + 1;
		int i_6 = Class407.aCalendar4848.get(1);
		return Integer.toString(i_4 / 10) + i_4 % 10 + "/" + i_5 / 10 + i_5 % 10 + "/" + i_6 % 100 / 10 + i_6 % 10;
	}

}
