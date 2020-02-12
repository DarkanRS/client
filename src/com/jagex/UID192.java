package com.jagex;

import java.io.EOFException;
import java.io.IOException;

public class UID192 {

    public static int anInt5357;
    long aLong5353;
    long aLong5351;
    long aLong5355;
    int anInt5356 = 0;
    long aLong5345 = -1L;
    long aLong5354;
    long aLong5347 = -1L;
    Class442 aClass442_5346;
    byte[] aByteArray5350;
    byte[] aByteArray5348;
    int anInt5349;

    public long method7345(byte b_1) {
        return this.aLong5355;
    }

    public void method7346() throws IOException {
        this.method7353((byte) -31);
        this.aClass442_5346.method7385((short) 14390);
    }

    public void method7347(long long_1) throws IOException {
        if (long_1 < 0L) {
            throw new IOException();
        } else {
            this.aLong5353 = long_1;
        }
    }

    public void method7350(byte[] bytes_1, int i_2, int i_3, int i_4) throws IOException {
        try {
            if (i_3 + i_2 > bytes_1.length) {
                throw new ArrayIndexOutOfBoundsException(i_3 + i_2 - bytes_1.length);
            }

            if (this.aLong5345 != -1L && this.aLong5353 >= this.aLong5345 && this.aLong5353 + (long) i_3 <= (long) (this.anInt5356 * 675653231) + this.aLong5345) {
                System.arraycopy(this.aByteArray5348, (int) (this.aLong5353 - this.aLong5345), bytes_1, i_2, i_3);
                this.aLong5353 += i_3;
                return;
            }

            long long_5 = this.aLong5353;
            int i_8 = i_3;
            int i_9;
            if (this.aLong5353 >= this.aLong5347 && this.aLong5353 < (long) this.anInt5349 + this.aLong5347) {
                i_9 = (int) ((long) this.anInt5349 - (this.aLong5353 - this.aLong5347));
                if (i_9 > i_3) {
                    i_9 = i_3;
                }

                System.arraycopy(this.aByteArray5350, (int) (this.aLong5353 - this.aLong5347), bytes_1, i_2, i_9);
                this.aLong5353 += i_9;
                i_2 += i_9;
                i_3 -= i_9;
            }

            if (i_3 > this.aByteArray5350.length) {
                this.aClass442_5346.method7390(this.aLong5353);

                for (this.aLong5351 = this.aLong5353; i_3 > 0; i_3 -= i_9) {
                    i_9 = this.aClass442_5346.method7389(bytes_1, i_2, i_3, (byte) -118);
                    if (i_9 == -1) {
                        break;
                    }

                    this.aLong5351 += i_9;
                    this.aLong5353 += i_9;
                    i_2 += i_9;
                }
            } else if (i_3 > 0) {
                this.method7363();
                i_9 = i_3;
                if (i_3 > this.anInt5349) {
                    i_9 = this.anInt5349;
                }

                System.arraycopy(this.aByteArray5350, 0, bytes_1, i_2, i_9);
                i_2 += i_9;
                i_3 -= i_9;
                this.aLong5353 += i_9;
            }

            if (this.aLong5345 != -1L) {
                if (this.aLong5345 > this.aLong5353 && i_3 > 0) {
                    i_9 = i_2 + (int) (this.aLong5345 - this.aLong5353);
                    if (i_9 > i_3 + i_2) {
                        i_9 = i_3 + i_2;
                    }

                    while (i_2 < i_9) {
                        bytes_1[i_2++] = 0;
                        --i_3;
                        ++this.aLong5353;
                    }
                }

                long long_14 = -1L;
                long long_11 = -1L;
                if (this.aLong5345 >= long_5 && this.aLong5345 < (long) i_8 + long_5) {
                    long_14 = this.aLong5345;
                } else if (long_5 >= this.aLong5345 && long_5 < (long) (this.anInt5356 * 675653231) + this.aLong5345) {
                    long_14 = long_5;
                }

                if ((long) (this.anInt5356 * 675653231) + this.aLong5345 > long_5 && (long) (this.anInt5356 * 675653231) + this.aLong5345 <= (long) i_8 + long_5) {
                    long_11 = (long) (this.anInt5356 * 675653231) + this.aLong5345;
                } else if ((long) i_8 + long_5 > this.aLong5345 && long_5 + (long) i_8 <= this.aLong5345 + (long) (this.anInt5356 * 675653231)) {
                    long_11 = (long) i_8 + long_5;
                }

                if (long_14 > -1L && long_11 > long_14) {
                    int i_13 = (int) (long_11 - long_14);
                    System.arraycopy(this.aByteArray5348, (int) (long_14 - this.aLong5345), bytes_1, (int) (long_14 - long_5) + i_2, i_13);
                    if (long_11 > this.aLong5353) {
                        i_3 = (int) ((long) i_3 - (long_11 - this.aLong5353));
                        this.aLong5353 = long_11;
                    }
                }
            }
        } catch (IOException ioexception_17) {
            this.aLong5351 = -1L;
            throw ioexception_17;
        }

        if (i_3 > 0) {
            throw new EOFException();
        }
    }

    public void method7351(byte[] bytes_1) throws IOException {
        this.method7350(bytes_1, 0, bytes_1.length, 79386718);
    }

    public void write(byte[] bytes_1, int i_2, int i_3) throws IOException {
        try {
            if ((long) i_3 + this.aLong5353 > this.aLong5355) {
                this.aLong5355 = this.aLong5353 + (long) i_3;
            }

            if (this.aLong5345 != -1L && (this.aLong5353 < this.aLong5345 || this.aLong5353 > (long) (this.anInt5356 * 675653231) + this.aLong5345)) {
                this.method7353((byte) -17);
            }

            if (this.aLong5345 != -1L && this.aLong5353 + (long) i_3 > this.aLong5345 + (long) this.aByteArray5348.length) {
                int i_5 = (int) ((long) this.aByteArray5348.length - (this.aLong5353 - this.aLong5345));
                System.arraycopy(bytes_1, i_2, this.aByteArray5348, (int) (this.aLong5353 - this.aLong5345), i_5);
                this.aLong5353 += i_5;
                i_2 += i_5;
                i_3 -= i_5;
                this.anInt5356 = this.aByteArray5348.length * -1070827377;
                this.method7353((byte) -81);
            }

            if (i_3 > this.aByteArray5348.length) {
                if (this.aLong5353 != this.aLong5351) {
                    this.aClass442_5346.method7390(this.aLong5353);
                    this.aLong5351 = this.aLong5353;
                }

                this.aClass442_5346.method7386(bytes_1, i_2, i_3, 402289131);
                this.aLong5351 += i_3;
                if (this.aLong5351 > this.aLong5354) {
                    this.aLong5354 = this.aLong5351;
                }

                long long_10 = -1L;
                long long_7 = -1L;
                if (this.aLong5353 >= this.aLong5347 && this.aLong5353 < this.aLong5347 + (long) this.anInt5349) {
                    long_10 = this.aLong5353;
                } else if (this.aLong5347 >= this.aLong5353 && this.aLong5347 < (long) i_3 + this.aLong5353) {
                    long_10 = this.aLong5347;
                }

                if ((long) i_3 + this.aLong5353 > this.aLong5347 && this.aLong5353 + (long) i_3 <= this.aLong5347 + (long) this.anInt5349) {
                    long_7 = (long) i_3 + this.aLong5353;
                } else if (this.aLong5347 + (long) this.anInt5349 > this.aLong5353 && this.aLong5347 + (long) this.anInt5349 <= this.aLong5353 + (long) i_3) {
                    long_7 = (long) this.anInt5349 + this.aLong5347;
                }

                if (long_10 > -1L && long_7 > long_10) {
                    int i_9 = (int) (long_7 - long_10);
                    System.arraycopy(bytes_1, (int) (long_10 + (long) i_2 - this.aLong5353), this.aByteArray5350, (int) (long_10 - this.aLong5347), i_9);
                }

                this.aLong5353 += i_3;
            } else if (i_3 > 0) {
                if (this.aLong5345 == -1L) {
                    this.aLong5345 = this.aLong5353;
                }

                System.arraycopy(bytes_1, i_2, this.aByteArray5348, (int) (this.aLong5353 - this.aLong5345), i_3);
                this.aLong5353 += i_3;
                if (this.aLong5353 - this.aLong5345 > (long) (this.anInt5356 * 675653231)) {
                    this.anInt5356 = (int) (this.aLong5353 - this.aLong5345) * -1070827377;
                }
            }

        } catch (IOException ioexception_13) {
            this.aLong5351 = -1L;
            throw ioexception_13;
        }
    }

    void method7353(byte b_1) throws IOException {
        if (this.aLong5345 != -1L) {
            if (this.aLong5345 != this.aLong5351) {
                this.aClass442_5346.method7390(this.aLong5345);
                this.aLong5351 = this.aLong5345;
            }

            this.aClass442_5346.method7386(this.aByteArray5348, 0, this.anInt5356 * 675653231, -1758103988);
            this.aLong5351 += 675653231L * (long) this.anInt5356;
            if (this.aLong5351 > this.aLong5354) {
                this.aLong5354 = this.aLong5351;
            }

            long long_2 = -1L;
            long long_4 = -1L;
            if (this.aLong5345 >= this.aLong5347 && this.aLong5345 < (long) this.anInt5349 + this.aLong5347) {
                long_2 = this.aLong5345;
            } else if (this.aLong5347 >= this.aLong5345 && this.aLong5347 < this.aLong5345 + (long) (this.anInt5356 * 675653231)) {
                long_2 = this.aLong5347;
            }

            if ((long) (this.anInt5356 * 675653231) + this.aLong5345 > this.aLong5347 && (long) (this.anInt5356 * 675653231) + this.aLong5345 <= (long) this.anInt5349 + this.aLong5347) {
                long_4 = (long) (this.anInt5356 * 675653231) + this.aLong5345;
            } else if (this.aLong5347 + (long) this.anInt5349 > this.aLong5345 && (long) this.anInt5349 + this.aLong5347 <= this.aLong5345 + (long) (this.anInt5356 * 675653231)) {
                long_4 = this.aLong5347 + (long) this.anInt5349;
            }

            if (long_2 > -1L && long_4 > long_2) {
                int i_6 = (int) (long_4 - long_2);
                System.arraycopy(this.aByteArray5348, (int) (long_2 - this.aLong5345), this.aByteArray5350, (int) (long_2 - this.aLong5347), i_6);
            }

            this.aLong5345 = -1L;
            this.anInt5356 = 0;
        }

    }

    public UID192(Class442 class442_1, int i_2) throws IOException {
        this.aClass442_5346 = class442_1;
        this.aLong5355 = this.aLong5354 = class442_1.method7388();
        this.aByteArray5350 = new byte[i_2];
        this.aByteArray5348 = new byte[0];
        this.aLong5353 = 0L;
    }

    void method7363() throws IOException {
        this.anInt5349 = 0;
        if (this.aLong5353 != this.aLong5351) {
            this.aClass442_5346.method7390(this.aLong5353);
            this.aLong5351 = this.aLong5353;
        }

        int i_2;
        for (this.aLong5347 = this.aLong5353; this.anInt5349 < this.aByteArray5350.length; this.anInt5349 += i_2) {
            int i_3 = this.aByteArray5350.length - this.anInt5349;
            if (i_3 > 200000000) {
                i_3 = 200000000;
            }

            i_2 = this.aClass442_5346.method7389(this.aByteArray5350, this.anInt5349, i_3, (byte) -42);
            if (i_2 == -1) {
                break;
            }

            this.aLong5351 += i_2;
        }

    }

    public static void method7373(int i_0, int i_1, int i_2, boolean bool_3, byte b_4) {
        client.aLong7307 = 0L;
        int i_5 = Class158.windowedMode();
        if (i_0 == 3 || i_5 == 3) {
            bool_3 = true;
        }

        if (!Renderers.SOFTWARE_RENDERER.method8664()) {
            bool_3 = true;
        }

        Class507.method8725(i_5, i_0, i_1, i_2, bool_3);
    }

}
