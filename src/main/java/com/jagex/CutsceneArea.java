package com.jagex;

public class CutsceneArea extends Node {

    public int plane;
    public int regionX;
    public int regionY;
    public int width;
    public int length;
    public int anInt7481;
    public int anInt7480;
    public int anInt7483;
    public int anInt7486;

    CutsceneArea(ByteBuf buffer) {
        int position = buffer.readInt();
        plane = position >>> 28;
        regionX = position >>> 14 & 0x3fff;
        regionY = position & 0x3fff;
        width = buffer.readUnsignedByte();
        length = buffer.readUnsignedByte();
        anInt7481 = buffer.readUnsignedByte();
        anInt7480 = buffer.readUnsignedByte();
        anInt7483 = buffer.readUnsignedByte();
        anInt7486 = buffer.readUnsignedByte();
    }

    static TCPPacket method12078(int i_0, int i_1, int i_2) {
        TCPPacket tcpmessage_4 = null;
        if (i_2 == 0) {
            tcpmessage_4 = TCPPacket.createPacket(ServerPacket.WALK, client.GAME_CONNECTION_CONTEXT.isaac);
        }

        if (i_2 == 1) {
            tcpmessage_4 = TCPPacket.createPacket(ServerPacket.MINI_WALK, client.GAME_CONNECTION_CONTEXT.isaac);
        }

        CoordGrid coordgrid_5 = IndexLoaders.MAP_REGION_DECODER.getBase();
        tcpmessage_4.buffer.writeByte(VertexNormal.method1465() ? 1 : 0);
        tcpmessage_4.buffer.writeShort(i_0 + coordgrid_5.x);
        tcpmessage_4.buffer.writeShortLE(coordgrid_5.y + i_1);
        Class187.anInt2361 = i_0;
        Class187.anInt2359 = i_1;
        Class187.aBool2360 = false;
        MaterialProp28.method15255();
        return tcpmessage_4;
    }

}
