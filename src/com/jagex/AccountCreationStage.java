package com.jagex;

public class AccountCreationStage {

    static CacheableNode_Sub7 aCacheableNode_Sub7_12;
    static AccountCreationStage REQUEST = new AccountCreationStage();
    static AccountCreationStage RESPONSE = new AccountCreationStage();

    public static void method252(ClientTriggerType class397_0, int i_1, PathingEntity animable_3, int i_4) {
        CS2Executor cs2executor_6 = CS2Executor.getNextScriptExecutor();
        cs2executor_6.currentEntity = animable_3;
        cs2executor_6.anInt7004 = i_4;
        CS2Executor.method1834(class397_0, i_1, -1, cs2executor_6);
        cs2executor_6.currentEntity = null;
        cs2executor_6.anInt7004 = -1;
    }

    static void method253(int i_0, IterableNodeMap<Node> iterablenodemap_1) {
        if (i_0 != -1 && iterablenodemap_1.get(i_0) == null) {
            iterablenodemap_1.put(new Node<Node>(), i_0);
        }
    }
}
