public class TilestreamPacket {

    public static int COUNTRY;

    public static TilestreamPacket aClass364_4209 = new TilestreamPacket(-1);

    public static TilestreamPacket aClass364_4207 = new TilestreamPacket(3);

    public static TilestreamPacket CREATE_GROUND_ITEM = new TilestreamPacket(5);

    public static TilestreamPacket aClass364_4213 = new TilestreamPacket(2);

    public static TilestreamPacket aClass364_4208 = new TilestreamPacket(6);

    public static TilestreamPacket PROJECTILE = new TilestreamPacket(16);

    public static TilestreamPacket aClass364_4210 = new TilestreamPacket(19);

    public static TilestreamPacket aClass364_4211 = new TilestreamPacket(5);

    public static TilestreamPacket aClass364_4205 = new TilestreamPacket(7);

    public static TilestreamPacket aClass364_4204 = new TilestreamPacket(7);

    public static TilestreamPacket aClass364_4214 = new TilestreamPacket(8);

    public static TilestreamPacket TILE_MESSAGE = new TilestreamPacket(-1);

    public static TilestreamPacket aClass364_4216 = new TilestreamPacket(6);

    public static TilestreamPacket aClass364_4217 = new TilestreamPacket(9);

    public static TilestreamPacket aClass364_4218 = new TilestreamPacket(8);

    TilestreamPacket(int i_1) {
    }

    static final void method6292(int i_0, int i_1, int i_2, int i_3) {
        if (i_0 - i_2 >= Class532_Sub3.anInt7071 && i_0 + i_2 <= Class532_Sub3.anInt7069 && i_1 - i_2 >= Class532_Sub3.anInt7070 && i_2 + i_1 <= Class532_Sub3.anInt7068) {
            IdentitiKitIndexLoader.method813(i_0, i_1, i_2, i_3);
        } else {
            Class273.method4866(i_0, i_1, i_2, i_3);
        }
    }
}
