package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class AsyncInputStream implements Runnable {

    IOException anIOException3401;
    int anInt3400;
    InputStream anInputStream3396;
    int anInt3395;
    int anInt3397;
    byte[] aByteArray3399;
    Thread aThread3398;

    AsyncInputStream(InputStream inputstream_1, int i_2) {
        anInputStream3396 = inputstream_1;
        anInt3397 = i_2 + 1;
        aByteArray3399 = new byte[anInt3397];
        aThread3398 = new Thread(this);
        aThread3398.setDaemon(true);
        aThread3398.start();
    }

    static Class194 method5048(int i_0) {
        if (i_0 == 0) {
            if (Class291_Sub1.aFloat3468 == 3.0D) {
                return Static.aClass194_5794;
            }
            if (Class291_Sub1.aFloat3468 == 4.0D) {
                return Class291_Sub1.aClass194_8017;
            }
            if (Class291_Sub1.aFloat3468 == 6.0D) {
                return Class291_Sub1.aClass194_8023;
            }
            if (Class291_Sub1.aFloat3468 >= 8.0D) {
                return Class446.aClass194_5416;
            }
        } else if (i_0 == 1) {
            if (Class291_Sub1.aFloat3468 == 3.0D) {
                return Class291_Sub1.aClass194_8023;
            }
            if (Class291_Sub1.aFloat3468 == 4.0D) {
                return Class446.aClass194_5416;
            }
            if (Class291_Sub1.aFloat3468 == 6.0D) {
                return ShaderLoader.aClass194_1243;
            }
            if (Class291_Sub1.aFloat3468 >= 8.0D) {
                return DefaultsFile.aClass194_6967;
            }
        } else if (i_0 == 2) {
            if (Class291_Sub1.aFloat3468 == 3.0D) {
                return ShaderLoader.aClass194_1243;
            }
            if (Class291_Sub1.aFloat3468 == 4.0D) {
                return DefaultsFile.aClass194_6967;
            }
            if (Class291_Sub1.aFloat3468 == 6.0D) {
                return RouteFinder.aClass194_3103;
            }
            if (Class291_Sub1.aFloat3468 >= 8.0D) {
                return WallObjectGraphNode.aClass194_10527;
            }
        }
        return null;
    }

    static CS2Script getCS2Script(int i_0) {
        CS2Script cs2script_1 = (CS2Script) Class506.CS2_CACHE.get(i_0);
        if (cs2script_1 != null) {
            return cs2script_1;
        } else {
            byte[] bytes_2 = IndexLoaders.CS2_SCRIPTS_INDEX.getFile(i_0, 0);
            if (bytes_2 != null && bytes_2.length > 1) {
                try {
                    cs2script_1 = AbstractRenderer.method8699(bytes_2);
                } catch (Exception exception_4) {
                    throw new RuntimeException(exception_4.getMessage() + " " + i_0);
                }
                Class506.CS2_CACHE.put(cs2script_1, i_0);
                return cs2script_1;
            } else {
                return null;
            }
        }
    }

    boolean method5030(int i_1) throws IOException {
        if (i_1 > 0 && i_1 < anInt3397) {
            synchronized (this) {
                int i_4;
                if (anInt3395 <= anInt3400) {
                    i_4 = anInt3400 - anInt3395;
                } else {
                    i_4 = anInt3397 - anInt3395 + anInt3400;
                }
                boolean bool_5;
                if (i_4 < i_1) {
                    if (anIOException3401 != null) {
                        throw new IOException(anIOException3401.toString());
                    } else {
                        notifyAll();
                        bool_5 = false;
                        return bool_5;
                    }
                } else {
                    bool_5 = true;
                    return bool_5;
                }
            }
        } else {
            throw new IOException();
        }
    }

    @Override
    public void run() {
        while (true) {
            int i_1;
            synchronized (this) {
                while (true) {
                    if (anIOException3401 != null) {
                        return;
                    }
                    if (anInt3395 == 0) {
                        i_1 = anInt3397 - anInt3400 - 1;
                    } else if (anInt3395 <= anInt3400) {
                        i_1 = anInt3397 - anInt3400;
                    } else {
                        i_1 = anInt3395 - anInt3400 - 1;
                    }
                    if (i_1 > 0) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException ignored) {
                    }
                }
            }
            int i_5;
            try {
                i_5 = anInputStream3396.read(aByteArray3399, anInt3400, i_1);
                if (i_5 == -1) {
                    throw new EOFException();
                }
            } catch (IOException ioexception_9) {
                IOException ioexception_3 = ioexception_9;
                synchronized (this) {
                    anIOException3401 = ioexception_3;
                    return;
                }
            }
            synchronized (this) {
                anInt3400 = (i_5 + anInt3400) % anInt3397;
            }
        }
    }

    void method5031() {
        anInputStream3396 = new InputStream_Sub1();
    }

    int method5034() throws IOException {
        synchronized (this) {
            int i_3;
            if (anInt3395 <= anInt3400) {
                i_3 = anInt3400 - anInt3395;
            } else {
                i_3 = anInt3397 - anInt3395 + anInt3400;
            }
            if (anIOException3401 != null) {
                throw new IOException(anIOException3401.toString());
            } else {
                notifyAll();
                return i_3;
            }
        }
    }

    void method5042() {
        synchronized (this) {
            if (anIOException3401 == null) {
                anIOException3401 = new IOException("");
            }
            notifyAll();
        }
        try {
            aThread3398.join();
        } catch (InterruptedException ignored) {
        }
    }

    int method5043(byte[] bytes_1, int i_2, int i_3) throws IOException {
        int i_31 = i_3;
        if (i_31 >= 0 && i_2 >= 0 && i_31 + i_2 <= bytes_1.length) {
            synchronized (this) {
                int i_6;
                if (anInt3395 <= anInt3400) {
                    i_6 = anInt3400 - anInt3395;
                } else {
                    i_6 = anInt3397 - anInt3395 + anInt3400;
                }
                if (i_31 > i_6) {
                    i_31 = i_6;
                }
                if (i_31 == 0 && anIOException3401 != null) {
                    throw new IOException(anIOException3401.toString());
                } else {
                    if (i_31 + anInt3395 <= anInt3397) {
                        System.arraycopy(aByteArray3399, anInt3395, bytes_1, i_2, i_31);
                    } else {
                        int i_7 = anInt3397 - anInt3395;
                        System.arraycopy(aByteArray3399, anInt3395, bytes_1, i_2, i_7);
                        System.arraycopy(aByteArray3399, 0, bytes_1, i_7 + i_2, i_31 - i_7);
                    }
                    anInt3395 = (i_31 + anInt3395) % anInt3397;
                    notifyAll();
                    return i_31;
                }
            }
        } else {
            throw new IOException();
        }
    }
}
