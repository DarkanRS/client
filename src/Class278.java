import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;

public abstract class Class278 {

    boolean aBool3361;

    Class282_Sub41_Sub3 aClass282_Sub41_Sub3_3363;

    Class282_Sub41_Sub4 aClass282_Sub41_Sub4_3366;

    String aString3365;

    Class282_Sub41_Sub2 aClass282_Sub41_Sub2_3364;

    boolean aBool3353;

    boolean aBool3359;

    byte[] aByteArray3354;

    OggSyncState anOggSyncState3355;

    OggPage anOggPage3352;

    OggPacket anOggPacket3356;

    IterableNodeMap aClass465_3358;

    boolean aBool3360;

    boolean method4910(int i_1) {
        if (this.aClass282_Sub41_Sub4_3366 != null) {
            return !this.aClass282_Sub41_Sub3_3363.method14794(-1464343328) || this.method4923(24293549) > this.aClass282_Sub41_Sub3_3363.method14792((short) 255);
        } else {
            double d_2 = (double) this.aClass282_Sub41_Sub3_3363.method14791(-1670765094);
            return d_2 == 0.0D || (double) Class169.time() >= (double) this.aClass282_Sub41_Sub3_3363.method14793(2126760544) + 1000.0D / d_2;
        }
    }

    Class282_Sub41 method4911(byte b_1) throws IOException {
        if (this.aBool3360) {
            throw new IllegalStateException();
        } else if (this.aBool3361) {
            return null;
        } else {
            int i_2;
            while (this.anOggSyncState3355.pageOut(this.anOggPage3352) <= 0) {
                i_2 = this.method4951(this.aByteArray3354, -1649772947);
                if (i_2 == -1) {
                    this.aBool3361 = true;
                    return null;
                }
                if (i_2 == 0) {
                    return null;
                }
                if (!this.anOggSyncState3355.write(this.aByteArray3354, i_2)) {
                    throw new RuntimeException("");
                }
            }
            i_2 = this.anOggPage3352.getSerialNumber();
            if (!this.anOggPage3352.isBOS()) {
                Class282_Sub41 class282_sub41_9 = (Class282_Sub41) this.aClass465_3358.get((long) i_2);
                if (!class282_sub41_9.anOggStreamState8032.pageIn(this.anOggPage3352)) {
                    throw new IllegalStateException();
                } else {
                    return class282_sub41_9;
                }
            } else {
                OggStreamState oggstreamstate_3 = new OggStreamState(i_2);
                if (!oggstreamstate_3.pageIn(this.anOggPage3352)) {
                    throw new IllegalStateException();
                } else if (oggstreamstate_3.packetPeek(this.anOggPacket3356) != 1) {
                    throw new IllegalStateException();
                } else {
                    Object obj_4;
                    if (this.aClass282_Sub41_Sub3_3363 == null && this.anOggPacket3356.isTheora()) {
                        this.aClass282_Sub41_Sub3_3363 = new Class282_Sub41_Sub3(oggstreamstate_3);
                        obj_4 = this.aClass282_Sub41_Sub3_3363;
                    } else if (this.aClass282_Sub41_Sub4_3366 == null && this.anOggPacket3356.isVorbis()) {
                        this.aClass282_Sub41_Sub4_3366 = new Class282_Sub41_Sub4(oggstreamstate_3);
                        obj_4 = this.aClass282_Sub41_Sub4_3366;
                    } else {
                        byte[] bytes_5 = this.anOggPacket3356.getData();
                        StringBuilder stringbuilder_6 = new StringBuilder();
                        for (int i_7 = 1; i_7 < bytes_5.length && Character.isLetterOrDigit((char) bytes_5[i_7]); i_7++) {
                            stringbuilder_6.append((char) bytes_5[i_7]);
                        }
                        String string_8 = stringbuilder_6.toString();
                        if (string_8.equals("kate")) {
                            obj_4 = new Class282_Sub41_Sub2(oggstreamstate_3);
                        } else {
                            obj_4 = new Class282_Sub41_Sub1(oggstreamstate_3);
                        }
                    }
                    this.aClass465_3358.put((Node) obj_4, (long) i_2);
                    return (Class282_Sub41) obj_4;
                }
            }
        }
    }

    void method4913(int i_1) throws IOException {
        while (this.aClass282_Sub41_Sub3_3363.anOggStreamState8032.packetOut(this.anOggPacket3356) != 1) {
            Class282_Sub41 class282_sub41_2 = this.method4911((byte) 119);
            if (class282_sub41_2 == null) {
                if (this.aBool3361) {
                    this.method4916(1516535457);
                }
                return;
            }
            if (class282_sub41_2 == this.aClass282_Sub41_Sub2_3364) {
                this.method4942(1272558981);
            }
        }
        this.aClass282_Sub41_Sub3_3363.method13361(this.anOggPacket3356, (byte) 14);
    }

    public Class282_Sub41_Sub4 method4914(int i_1) {
        return this.aClass282_Sub41_Sub4_3366;
    }

    public void method4915(String string_1, int i_2) {
        this.aString3365 = string_1;
        if (this.aString3365 == null) {
            this.aClass282_Sub41_Sub2_3364 = null;
        } else {
            if (this.aClass282_Sub41_Sub2_3364 != null && !this.aString3365.equals(this.aClass282_Sub41_Sub2_3364.method14703(366618468))) {
                this.aClass282_Sub41_Sub2_3364 = null;
            }
            if (this.aClass282_Sub41_Sub2_3364 == null) {
                for (Class282_Sub41 class282_sub41_3 = (Class282_Sub41) this.aClass465_3358.method7750(-1121671279); class282_sub41_3 != null; class282_sub41_3 = (Class282_Sub41) this.aClass465_3358.method7751((byte) 18)) {
                    if (class282_sub41_3 instanceof Class282_Sub41_Sub2) {
                        Class282_Sub41_Sub2 class282_sub41_sub2_4 = (Class282_Sub41_Sub2) class282_sub41_3;
                        if (this.aString3365.equals(class282_sub41_sub2_4.method14703(314176350))) {
                            this.aClass282_Sub41_Sub2_3364 = class282_sub41_sub2_4;
                            break;
                        }
                    }
                }
            }
        }
    }

    void method4916(int i_1) {
        for (Class282_Sub41 class282_sub41_2 = (Class282_Sub41) this.aClass465_3358.method7750(-934664274); class282_sub41_2 != null; class282_sub41_2 = (Class282_Sub41) this.aClass465_3358.method7751((byte) 92)) {
            if (class282_sub41_2 != this.aClass282_Sub41_Sub3_3363) {
                while (class282_sub41_2.anOggStreamState8032.packetOut() == 1) {
                    class282_sub41_2.method13361(this.anOggPacket3356, (byte) 14);
                }
            }
        }
        if (this.aClass282_Sub41_Sub3_3363 != null) {
            for (int i_3 = 0; i_3 < 10 && this.method4910(-1822567904); i_3++) {
                if (this.aClass282_Sub41_Sub3_3363.anOggStreamState8032.packetOut() != 1) {
                    this.method4947((byte) 12);
                    break;
                }
                this.aClass282_Sub41_Sub3_3363.method13361(this.anOggPacket3356, (byte) 14);
            }
        }
    }

    public Class282_Sub41_Sub3 method4918(int i_1) {
        return this.aClass282_Sub41_Sub3_3363;
    }

    public boolean method4921(byte b_1) {
        return !this.aBool3360 && !this.aBool3361 ? false : this.aClass282_Sub41_Sub4_3366 == null || this.aClass282_Sub41_Sub4_3366.method14847(1747379029) <= 0;
    }

    public double method4923(int i_1) {
        return this.aClass282_Sub41_Sub4_3366 != null ? this.aClass282_Sub41_Sub4_3366.method14848(2074842940) : (this.aClass282_Sub41_Sub3_3363 != null ? this.aClass282_Sub41_Sub3_3363.method14792((short) 255) : 0.0D);
    }

    public void method4924(boolean bool_1, int i_2) {
        if (this.aClass282_Sub41_Sub4_3366 != null) {
            Class282_Sub15_Sub1 class282_sub15_sub1_3 = this.aClass282_Sub41_Sub4_3366.method14845(1918232773);
            if (class282_sub15_sub1_3 != null) {
                class282_sub15_sub1_3.method14816(bool_1, -910374946);
            }
        }
        this.aBool3353 = !this.aBool3353;
    }

    abstract int method4925(byte[] var1) throws IOException;

    public void method4932(int i_1) throws IOException {
        if (!this.aBool3353) {
            for (; !this.aBool3360; this.aBool3359 = false) {
                Class282_Sub41 class282_sub41_2;
                if (!this.aBool3359) {
                    class282_sub41_2 = this.method4911((byte) 87);
                    if (class282_sub41_2 == null) {
                        if (this.aBool3361) {
                            this.method4916(1516535457);
                        }
                        break;
                    }
                    if (class282_sub41_2 == null) {
                        throw new IllegalStateException();
                    }
                    this.aBool3359 = true;
                } else {
                    class282_sub41_2 = (Class282_Sub41) this.aClass465_3358.get((long) this.anOggPage3352.getSerialNumber());
                }
                if (class282_sub41_2 == this.aClass282_Sub41_Sub4_3366) {
                    if (this.aClass282_Sub41_Sub4_3366.method14847(1650384649) >= 50) {
                        break;
                    }
                    while (this.aClass282_Sub41_Sub4_3366.anOggStreamState8032.packetOut(this.anOggPacket3356) == 1) {
                        this.aClass282_Sub41_Sub4_3366.method13361(this.anOggPacket3356, (byte) 14);
                        this.method4942(-473852611);
                        if (this.aClass282_Sub41_Sub3_3363 != null) {
                            double d_3 = this.aClass282_Sub41_Sub3_3363.method14792((short) 255);
                            for (int i_5 = 0; i_5 < 10 && this.method4910(-1524174534); i_5++) {
                                this.method4913(1928018641);
                                if (this.aBool3360) {
                                    return;
                                }
                            }
                            if (d_3 < this.aClass282_Sub41_Sub3_3363.method14792((short) 255)) {
                                return;
                            }
                        }
                        if (this.aClass282_Sub41_Sub4_3366.method14847(2101566549) >= 50) {
                            return;
                        }
                    }
                } else if (class282_sub41_2 instanceof Class282_Sub41_Sub2) {
                    this.method4942(-934171767);
                } else if (class282_sub41_2 != this.aClass282_Sub41_Sub3_3363) {
                    for (; class282_sub41_2.anOggStreamState8032.packetOut(this.anOggPacket3356) == 1; class282_sub41_2.method13361(this.anOggPacket3356, (byte) 14)) {
                        if (class282_sub41_2.anInt8031 == 1 && class282_sub41_2 instanceof Class282_Sub41_Sub2) {
                            this.method4915(this.aString3365, 1039658724);
                        }
                    }
                } else if (this.aClass282_Sub41_Sub4_3366 == null && !this.aBool3353) {
                    for (int i_6 = 0; i_6 < 10 && this.method4910(1413439449); i_6++) {
                        this.method4913(1867007041);
                        if (this.aBool3360) {
                            return;
                        }
                    }
                    return;
                }
            }
        }
    }

    public Class282_Sub41_Sub2 method4935(int i_1) {
        return this.aClass282_Sub41_Sub2_3364;
    }

    void method4942(int i_1) {
        for (Class282_Sub41 class282_sub41_2 = (Class282_Sub41) this.aClass465_3358.method7750(-1801716581); class282_sub41_2 != null; class282_sub41_2 = (Class282_Sub41) this.aClass465_3358.method7751((byte) 10)) {
            if (class282_sub41_2 instanceof Class282_Sub41_Sub2) {
                Class282_Sub41_Sub2 class282_sub41_sub2_3 = (Class282_Sub41_Sub2) class282_sub41_2;
                while ((class282_sub41_sub2_3.anInt8031 <= 8 || this.method4923(1693788471) > (double) class282_sub41_sub2_3.method14705((byte) 39)) && class282_sub41_sub2_3.anOggStreamState8032.packetOut(this.anOggPacket3356) == 1) {
                    class282_sub41_sub2_3.method13361(this.anOggPacket3356, (byte) 14);
                }
            }
        }
        this.method4915(this.aString3365, -159539907);
    }

    Class278(int i_1) {
        if (!Class362.getNativeLibraryLoader(616047582).loadLibrary("jagtheora", -784781962)) {
            throw new RuntimeException("");
        } else {
            this.aByteArray3354 = new byte[i_1];
            this.anOggSyncState3355 = new OggSyncState();
            this.anOggPage3352 = new OggPage();
            this.anOggPacket3356 = new OggPacket();
            this.aClass465_3358 = new IterableNodeMap(8);
        }
    }

    public void method4947(byte b_1) {
        if (!this.aBool3360) {
            for (Class282_Sub41 class282_sub41_2 = (Class282_Sub41) this.aClass465_3358.method7750(2031827035); class282_sub41_2 != null; class282_sub41_2 = (Class282_Sub41) this.aClass465_3358.method7751((byte) 35)) {
                class282_sub41_2.method13360(171967708);
                class282_sub41_2.anOggStreamState8032.method6699();
            }
            this.anOggPacket3356.method6699();
            this.anOggPage3352.method6699();
            this.anOggSyncState3355.method6699();
            this.aBool3360 = true;
        }
    }

    abstract int method4951(byte[] var1, int var2) throws IOException;

    static Class282_Sub20 method4963(RsByteBuffer rsbytebuffer_0, byte b_1) {
        rsbytebuffer_0.readUnsignedByte();
        int i_2 = rsbytebuffer_0.readUnsignedByte();
        Class282_Sub20 class282_sub20_3 = Class252.method4328(i_2, -1146932113);
        class282_sub20_3.anInt7668 = rsbytebuffer_0.readUnsignedByte();
        int i_4 = rsbytebuffer_0.readUnsignedByte();
        for (int i_5 = 0; i_5 < i_4; i_5++) {
            int i_6 = rsbytebuffer_0.readUnsignedByte();
            class282_sub20_3.method12322(i_6, rsbytebuffer_0, -1503572950);
        }
        class282_sub20_3.method12321(1551109929);
        return class282_sub20_3;
    }
}
