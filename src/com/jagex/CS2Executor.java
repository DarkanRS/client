package com.jagex;

import java.util.ArrayList;

public class CS2Executor {

    static int CURRENT_CS2_EXEC_IDX = 0;
    static ArrayList CS2_EXECUTORS = new ArrayList();
    static int anInt5904 = 0;
    static String aString5897 = null;
    static boolean aBool5898 = false;
    static int[] anIntArray5900 = new int[3];
    static int anInt5906 = 0;

    int[] intLocals;
    long[] longLocals;
    int anInt7004;
    CS2Instruction[] operations;
    Entity currentEntity;
    Class191 aClass191_7008;
    QuickChatMessage currentQuickChatMessage;
    ClanSettings currentClanSettings;
    ClanChannel clanChannel;
    SceneObject currentSceneObject;
    GroundItem currentGroundItem;
    Object[] objectLocals;
    int[] intOpValues;
    CS2Script current;
    boolean aBool7022;
    int[] globalArrayLengths = new int[5];
    int[][] globalArrays = new int[5][5000];

    int[] intStack = new int[1000];
    int intStackPtr = 0;
    long[] longStack = new long[1000];
    int longStackPtr = 0;
    Object[] stringStack = new Object[1000];
    int stringStackPtr = 0;

    int returnValuesPtr = 0;
    CS2ReturnValue[] returnValues = new CS2ReturnValue[50];
    CS2Interface hookedInterface1 = new CS2Interface();
    CS2Interface hookedInterface2 = new CS2Interface();
    int hookRequestCount = 0;
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

    static void method1834(CS2HookEventType class397_0, int i_1, int i_2, CS2Executor cs2executor_3, byte b_4) {
        CS2Script cs2script_5 = FixedTileStrategy.getScript(class397_0, i_1, i_2);
        if (cs2script_5 == null) {
            decrementCS2ExecIdx();
        } else {
            cs2executor_3.intLocals = new int[cs2script_5.intLocalsCount];
            cs2executor_3.objectLocals = new Object[cs2script_5.stringLocalsCount];
            if (cs2script_5.aClass397_9527 != CS2HookEventType.aClass397_4797 && cs2script_5.aClass397_9527 != CS2HookEventType.aClass397_4805 && cs2script_5.aClass397_9527 != CS2HookEventType.aClass397_4798) {
                if (cs2script_5.aClass397_9527 == CS2HookEventType.aClass397_4806) {
                    cs2executor_3.intLocals[0] = cs2executor_3.anInt7004;
                }
            } else {
                int i_6 = 0;
                int i_7 = 0;
                if (Node_Sub20_Sub24.aClass118_9884 != null) {
                    i_6 = Node_Sub20_Sub24.aClass118_9884.x;
                    i_7 = Node_Sub20_Sub24.aClass118_9884.y;
                }
                cs2executor_3.intLocals[0] = Class163.mouseRecorder.getMouseX() - i_6;
                cs2executor_3.intLocals[1] = Class163.mouseRecorder.getMouseY() - i_7;
            }
            executeScript(cs2script_5, 200000, cs2executor_3);
        }
    }

    static void executeScript(CS2Script cs2script_0, int stackLimit, CS2Executor cs2executor_2) {
        cs2executor_2.intStackPtr = 0;
        cs2executor_2.stringStackPtr = 0;
        cs2executor_2.instrPtr = -1;
        cs2executor_2.current = cs2script_0;
        cs2executor_2.operations = cs2executor_2.current.operations;
        cs2executor_2.intOpValues = cs2executor_2.current.intOpValues;
        CS2Instruction cs2opinfo_4 = null;
        cs2executor_2.returnValuesPtr = 0;
        try {
            try {
                anInt5904 = 0;
                while (true) {
                    ++anInt5904;
                    if (anInt5904 > stackLimit) {
                        throw new RuntimeException("");
                    }
                    cs2opinfo_4 = cs2executor_2.operations[++cs2executor_2.instrPtr];
                    if (aBool5898 && (aString5897 == null || cs2executor_2.current.scriptName != null && cs2executor_2.current.scriptName.indexOf(aString5897) != -1)) {
                        System.out.println(cs2executor_2.current.scriptName + ": " + cs2opinfo_4);
                    }
                    cs2executor_2.aBool7022 = cs2executor_2.intOpValues[cs2executor_2.instrPtr] == 1;
                    if (cs2opinfo_4 == CS2Instruction.RETURN && cs2executor_2.returnValuesPtr == 0) {
                        decrementCS2ExecIdx();
                        break;
                    }
                    CS2Interpreter.executeOperation(cs2opinfo_4, cs2executor_2);
                }
            } catch (Exception exception_8) {
                StringBuilder stringbuilder_6 = new StringBuilder(30);
                stringbuilder_6.append(cs2executor_2.current.data).append(" ");
                for (int i_7 = cs2executor_2.returnValuesPtr - 1; i_7 >= 0; --i_7) {
                    stringbuilder_6.append(cs2executor_2.returnValues[i_7].aCacheableNode_Sub5_5869.data).append(" ");
                }
                stringbuilder_6.append(Integer.valueOf(cs2opinfo_4.opcode));
                Class151.method2594(stringbuilder_6.toString(), exception_8, (byte) -32);
                decrementCS2ExecIdx();
            }
        } catch (Exception exception_9) {
            decrementCS2ExecIdx();
        }
    }

    public static void executeHookInner(HookRequest hook) {
        executeHookInner(hook, 200000);
    }

    static void executeHookInner(HookRequest hook, int stackLimit) {
        Object[] params = hook.params;
        int scriptId = ((Integer) params[0]).intValue();
        CS2Script script = AsyncInputStream.getCS2Script(scriptId);
        if (script != null) {
            CS2Executor executor = getNextScriptExecutor();
            executor.intLocals = new int[script.intLocalsCount];
            int intLocalCount = 0;
            executor.objectLocals = new String[script.stringLocalsCount];
            int objectLocalCount = 0;
            executor.longLocals = new long[script.longLocalsCount];
            int longLocalCount = 0;

            for (int paramIdx = 1; paramIdx < params.length; paramIdx++) {
                if (params[paramIdx] instanceof Integer) {
                    int intLocal = ((Integer) params[paramIdx]).intValue();
                    if (intLocal == -2147483647) {
                        intLocal = hook.mouseX;
                    }

                    if (intLocal == -2147483646) {
                        intLocal = hook.mouseY;
                    }

                    if (intLocal == -2147483645) {
                        intLocal = hook.source != null ? hook.source.idHash : -1;
                    }

                    if (intLocal == -2147483644) {
                        intLocal = hook.anInt8051;
                    }

                    if (intLocal == -2147483643) {
                        intLocal = hook.source != null ? hook.source.slotId : -1;
                    }

                    if (intLocal == -2147483642) {
                        intLocal = hook.aClass118_8057 != null ? hook.aClass118_8057.idHash : -1;
                    }

                    if (intLocal == -2147483641) {
                        intLocal = hook.aClass118_8057 != null ? hook.aClass118_8057.slotId : -1;
                    }

                    if (intLocal == -2147483640) {
                        intLocal = hook.typedKeyCode;
                    }

                    if (intLocal == -2147483639) {
                        intLocal = hook.typedKeyChar;
                    }

                    executor.intLocals[intLocalCount++] = intLocal;
                } else if (params[paramIdx] instanceof String) {
                    String string_13 = (String) params[paramIdx];
                    if (string_13.equals("event_opbase")) {
                        string_13 = hook.opName;
                    }

                    executor.objectLocals[objectLocalCount++] = string_13;
                } else if (params[paramIdx] instanceof Long) {
                    long long_14 = ((Long) params[paramIdx]).longValue();
                    executor.longLocals[longLocalCount++] = long_14;
                }
            }

            executor.hookRequestCount = hook.requestId;
            executeScript(script, stackLimit, executor);
        }
    }

    public static void method3661(int i_0, String string_1, int i_2, byte b_3) {
        CS2Script cs2script_4 = FixedTileStrategy.getScript(CS2HookEventType.aClass397_4792, i_0, -1);
        if (cs2script_4 != null) {
            CS2Executor cs2executor_5 = getNextScriptExecutor();
            cs2executor_5.intLocals = new int[cs2script_4.intLocalsCount];
            cs2executor_5.objectLocals = new String[cs2script_4.stringLocalsCount];
            cs2executor_5.objectLocals[0] = string_1;
            cs2executor_5.intLocals[0] = i_2;
            executeScript(cs2script_4, 200000, cs2executor_5);
        }
    }

    static final void decrementCS2ExecIdx() {
        --CURRENT_CS2_EXEC_IDX;
    }

    static final CS2Executor getNextScriptExecutor() {
        if (CURRENT_CS2_EXEC_IDX == CS2_EXECUTORS.size()) {
            CS2_EXECUTORS.add(new CS2Executor());
        }
        return (CS2Executor) CS2_EXECUTORS.get(CURRENT_CS2_EXEC_IDX++);
    }

    static final long method1480() {
        return (long) (++anInt5906 - 1) << 32 | 0xffffffffL;
    }
}
