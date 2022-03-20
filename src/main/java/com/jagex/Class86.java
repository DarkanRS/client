package com.jagex;

public class Class86 {

    public static CutsceneAction[] aCutsceneActionArray822;
    public static int anInt833;
    public static NodeCollection CUTSCENE_AREAS = new NodeCollection();
    public static IterableNodeMap aClass465_823 = new IterableNodeMap(32);
    public static VarProvider anInterface42_832 = new Class79();
    static CutsceneCameraMovement[] CUTSCENE_CAMERA_MOVEMENTS;
    static CutsceneObject[] CUTSCENE_OBJECTS;
    static CutsceneEntityMovement[] aClass93Array821;
    static short aShort828;
    static short aShort829;
    static short aShort830;
    static int anInt819 = 1;
    static int anInt825;
    static int anInt824;
    static boolean aBool826;
    static int anInt831 = -1;

    Class86() throws Throwable {
        throw new Error();
    }

    public static void method1478() {
        if (Class9.loginStage != 2) {
            Class9.CURRENT_CONNECTION_CONTEXT.end();
            JS5StandardRequester.method5558();
            Class361.method6270();
        }
    }

    static boolean method1481(KeyHoldInputSubscriber class232_0) {
        return Friend.method302(class232_0, null);
    }

    static void renderItemInvSprite(IComponentDefinitions component) {
        if (component.type == ComponentType.SPRITE && component.containerItemId != -1) {
            VarcDefinitions.renderItemInvSprite(Renderers.CURRENT_RENDERER, component);
        }
    }
}
