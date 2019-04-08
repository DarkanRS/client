public class CS2Executor {

	int[] intLocals;
	long[] longLocals;
	int anInt7004;
	CS2OpInfo[] operations;
	Animable animable;
	Class191 aClass191_7008;
	Class346 aClass346_7009;
	Class61 aClass61_7010;
	ClanChannel aClass282_Sub4_7011;
	SceneObject anInterface12_7013;
	Class521_Sub1_Sub2_Sub1 aClass521_Sub1_Sub2_Sub1_7014;
	Object[] objectLocals;
	int[] intOpValues;
	CS2Script current;
	boolean aBool7022;
	int[] globalArrayLengths = new int[5];
	int[][] globalArrays = new int[5][5000];
	int[] intStack = new int[1000];
	int intStackPtr = 0;
	Object[] stringStack = new Object[1000];
	int stringStackPtr = 0;
	long[] longStack = new long[1000];
	int longStackPtr = 0;
	int anInt7002 = 0;
	Class509[] aClass509Array7016 = new Class509[50];
	InterfaceWithDefs aClass513_7007 = new InterfaceWithDefs();
	InterfaceWithDefs aClass513_6994 = new InterfaceWithDefs();
	int anInt7015 = 0;
	int instrPtr = -1;

	static final void method11250(int i_0, int i_1, int i_2, int i_3) {
		if (i_2 >= Class532_Sub2.anInt7070 && i_2 <= Class532_Sub2.anInt7068) {
			i_0 = EntityNode.method4890(i_0, Class532_Sub2.anInt7071, Class532_Sub2.anInt7069, -1202150111);
			i_1 = EntityNode.method4890(i_1, Class532_Sub2.anInt7071, Class532_Sub2.anInt7069, 23945710);
			Class16.method568(i_0, i_1, i_2, i_3);
		}
	}

	static final void method11251(String string_0) {
		System.out.println("Error: " + CutsceneAction.method1609(string_0, "%0a", "\n"));
	}

	static void method1834(Class397 class397_0, int i_1, int i_2, CS2Executor cs2executor_3, byte b_4) {
		CS2Script cs2script_5 = Class225_Sub1.method12792(class397_0, i_1, i_2);
		if (cs2script_5 == null) {
			Shadow.method15509(282059094);
		} else {
			cs2executor_3.intLocals = new int[cs2script_5.intLocalsCount];
			cs2executor_3.objectLocals = new Object[cs2script_5.stringLocalsCount];
			if (cs2script_5.aClass397_9527 != Class397.aClass397_4797 && cs2script_5.aClass397_9527 != Class397.aClass397_4805 && cs2script_5.aClass397_9527 != Class397.aClass397_4798) {
				if (cs2script_5.aClass397_9527 == Class397.aClass397_4806) {
					cs2executor_3.intLocals[0] = cs2executor_3.anInt7004;
				}
			} else {
				int i_6 = 0;
				int i_7 = 0;
				if (Class282_Sub20_Sub24.aClass118_9884 != null) {
					i_6 = Class282_Sub20_Sub24.aClass118_9884.anInt1299;
					i_7 = Class282_Sub20_Sub24.aClass118_9884.anInt1428;
				}
				cs2executor_3.intLocals[0] = Class163.mouseRecorder.method3569(2102959757) - i_6;
				cs2executor_3.intLocals[1] = Class163.mouseRecorder.method3570() - i_7;
			}
			method1068(cs2script_5, 200000, cs2executor_3);
		}
	}
	
	static void method1068(CS2Script cs2script_0, int i_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr = 0;
		cs2executor_2.stringStackPtr = 0;
		cs2executor_2.instrPtr = -1;
		cs2executor_2.current = cs2script_0;
		cs2executor_2.operations = cs2executor_2.current.operations;
		cs2executor_2.intOpValues = cs2executor_2.current.intOpValues;
		CS2OpInfo cs2opinfo_4 = null;
		cs2executor_2.anInt7002 = 0;
		try {
			try {
				CS2Runner.anInt5904 = 0;
				while (true) {
					++CS2Runner.anInt5904;
					if (CS2Runner.anInt5904 > i_1) {
						throw new RuntimeException("");
					}
					cs2opinfo_4 = cs2executor_2.operations[++cs2executor_2.instrPtr];
					if (CS2Runner.aBool5898 && (CS2Runner.aString5897 == null || cs2executor_2.current.scriptName != null && cs2executor_2.current.scriptName.indexOf(CS2Runner.aString5897) != -1)) {
						System.out.println(cs2executor_2.current.scriptName + ": " + cs2opinfo_4);
					}
					if (cs2executor_2.intOpValues[cs2executor_2.instrPtr] == 1) {
						cs2executor_2.aBool7022 = true;
					} else {
						cs2executor_2.aBool7022 = false;
					}
					if (cs2opinfo_4 == CS2OpInfo.RETURN && cs2executor_2.anInt7002 == 0) {
						Shadow.method15509(1969627147);
						break;
					}
					CS2Interpreter.executeOperation(cs2opinfo_4, cs2executor_2);
				}
			} catch (Exception exception_8) {
				StringBuilder stringbuilder_6 = new StringBuilder(30);
				stringbuilder_6.append("").append(cs2executor_2.current.data).append(" ");
				for (int i_7 = cs2executor_2.anInt7002 - 1; i_7 >= 0; --i_7) {
					stringbuilder_6.append("").append(cs2executor_2.aClass509Array7016[i_7].aClass282_Sub50_Sub5_5869.data).append(" ");
				}
				stringbuilder_6.append("").append(Integer.valueOf(cs2opinfo_4.opcode));
				Class151.method2594(stringbuilder_6.toString(), exception_8, (byte) -32);
				Shadow.method15509(1831526496);
			}
		} catch (Exception exception_9) {
			Shadow.method15509(105300500);
		}
	}
	
	public static void executeHookInner200k(HookRequest hookrequest_0, int i_1) {
		executeHookInner(hookrequest_0, 200000, (byte) 44);
	}
	
	static void executeHookInner(HookRequest hookrequest_0, int i_1, byte b_2) {
		Object[] arr_3 = hookrequest_0.params;
		int i_4 = ((Integer) arr_3[0]).intValue();
		CS2Script cs2script_5 = Class286.getCS2Script(i_4);
		if (cs2script_5 != null) {
			CS2Executor cs2executor_6 = Class125.getNextScriptExecutor();
			cs2executor_6.intLocals = new int[cs2script_5.intLocalsCount];
			int i_7 = 0;
			cs2executor_6.objectLocals = new String[cs2script_5.stringLocalsCount];
			int i_8 = 0;
			cs2executor_6.longLocals = new long[cs2script_5.longLocalsCount];
			int i_9 = 0;

			for (int i_10 = 1; i_10 < arr_3.length; i_10++) {
				if (arr_3[i_10] instanceof Integer) {
					int i_11 = ((Integer) arr_3[i_10]).intValue();
					if (i_11 == -2147483647) {
						i_11 = hookrequest_0.anInt8059;
					}

					if (i_11 == -2147483646) {
						i_11 = hookrequest_0.anInt8055;
					}

					if (i_11 == -2147483645) {
						i_11 = hookrequest_0.iComponentDefs != null ? hookrequest_0.iComponentDefs.idHash : -1;
					}

					if (i_11 == -2147483644) {
						i_11 = hookrequest_0.anInt8051;
					}

					if (i_11 == -2147483643) {
						i_11 = hookrequest_0.iComponentDefs != null ? hookrequest_0.iComponentDefs.anInt1288 : -1;
					}

					if (i_11 == -2147483642) {
						i_11 = hookrequest_0.aClass118_8057 != null ? hookrequest_0.aClass118_8057.idHash : -1;
					}

					if (i_11 == -2147483641) {
						i_11 = hookrequest_0.aClass118_8057 != null ? hookrequest_0.aClass118_8057.anInt1288 : -1;
					}

					if (i_11 == -2147483640) {
						i_11 = hookrequest_0.anInt8058;
					}

					if (i_11 == -2147483639) {
						i_11 = hookrequest_0.anInt8056;
					}

					cs2executor_6.intLocals[i_7++] = i_11;
				} else if (arr_3[i_10] instanceof String) {
					String string_13 = (String) arr_3[i_10];
					if (string_13.equals("event_opbase")) {
						string_13 = hookrequest_0.opName;
					}

					cs2executor_6.objectLocals[i_8++] = string_13;
				} else if (arr_3[i_10] instanceof Long) {
					long long_14 = ((Long) arr_3[i_10]).longValue();
					cs2executor_6.longLocals[i_9++] = long_14;
				}
			}

			cs2executor_6.anInt7015 = hookrequest_0.anInt8061;
			method1068(cs2script_5, i_1, cs2executor_6);
		}
	}
	
	public static void method3661(int i_0, String string_1, int i_2, byte b_3) {
		CS2Script cs2script_4 = Class225_Sub1.method12792(Class397.aClass397_4792, i_0, -1);
		if (cs2script_4 != null) {
			CS2Executor cs2executor_5 = Class125.getNextScriptExecutor();
			cs2executor_5.intLocals = new int[cs2script_4.intLocalsCount];
			cs2executor_5.objectLocals = new String[cs2script_4.stringLocalsCount];
			cs2executor_5.objectLocals[0] = string_1;
			cs2executor_5.intLocals[0] = i_2;
			method1068(cs2script_4, 200000, cs2executor_5);
		}
	}
}
