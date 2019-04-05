public class MovementType implements Identifiable {

    public static MovementType TELEPORT = new MovementType((byte) -1);

    public static MovementType HALF_WALK = new MovementType((byte) 0);

    public static MovementType WALKING = new MovementType((byte) 1);

    public static MovementType RUNNING = new MovementType((byte) 2);

    public byte id;

    public int getValue() {
        return this.id;
    }

    public int method4268() {
        return this.id + 1;
    }

    public int method76() {
        return this.id;
    }

    public int method75() {
        return this.id;
    }

    MovementType(byte b_1) {
        this.id = b_1;
    }

    static final void method4281(Animable animable_0) {
        int i_2 = animable_0.anInt10342 - client.cycles;
        int i_3 = animable_0.anInt10326 * 512 + animable_0.getSize() * 256;
        int i_4 = animable_0.anInt10328 * 512 + animable_0.getSize() * 256;
        Vector3 vector3_5 = animable_0.method11166().aClass385_3595;
        animable_0.method11172((float) ((int) vector3_5.x + (i_3 - (int) vector3_5.x) / i_2), (float) ((int) vector3_5.y), (float) ((int) vector3_5.z + (i_4 - (int) vector3_5.z) / i_2));
        animable_0.anInt10366 = 0;
        animable_0.method15863(animable_0.anInt10346, 1692779087);
    }

    public static boolean method4282(String string_0) {
        if (string_0 == null) {
            return false;
        } else {
            for (int i_2 = 0; i_2 < client.anInt7449; i_2++) {
                if (string_0.equalsIgnoreCase(client.aClass6Array7452[i_2].aString37)) {
                    return true;
                }
            }
            return string_0.equalsIgnoreCase(VertexNormal.myPlayer.displayName);
        }
    }
}
