package com.jagex;

import java.io.EOFException;
import java.io.IOException;

public class UID192 {

    public static int anInt5357;
    long aLong5353;
    long aLong5351;
    long aLong5355;
    int anInt5356;
    long aLong5345 = -1L;
    long aLong5354;
    long aLong5347 = -1L;
    Class442 aClass442_5346;
    byte[] aByteArray5350;
    byte[] aByteArray5348;
    int anInt5349;

    public UID192(Class442 class442_1, int i_2) throws IOException {
        aClass442_5346 = class442_1;
        aLong5355 = aLong5354 = class442_1.method7388();
        aByteArray5350 = new byte[i_2];
        aByteArray5348 = new byte[0];
        aLong5353 = 0L;
    }

    public static void method7373(int desiredScreenMode, int width, int height) {
        boolean isFullScreen = false;
        client.aLong7307 = 0L;
        int currentScreenMode = Class158.getScreenMode();
        if (desiredScreenMode == 3 || currentScreenMode == 3) {
            isFullScreen = true;
        }

        if (!Renderers.CURRENT_RENDERER.method8664()) {
            isFullScreen = true;
        }

        Class507.method8725(currentScreenMode, desiredScreenMode, width, height, isFullScreen);
    }

    public long method7345() {
        return aLong5355;
    }

    public void method7346() throws IOException {
        method7353();
        aClass442_5346.method7385();
    }

    public void method7347(long long_1) throws IOException {
        if (long_1 < 0L) {
            throw new IOException();
        } else {
            aLong5353 = long_1;
        }
    }

    public void method7350(byte[] bytes_1, int i_2, int i_3) throws IOException {
        try {
            if (i_3 + i_2 > bytes_1.length) {
                throw new ArrayIndexOutOfBoundsException(i_3 + i_2 - bytes_1.length);
            }

            if (aLong5345 != -1L && aLong5353 >= aLong5345 && aLong5353 + i_3 <= (anInt5356 * 675653231) + aLong5345) {
                System.arraycopy(aByteArray5348, (int) (aLong5353 - aLong5345), bytes_1, i_2, i_3);
                aLong5353 += i_3;
                return;
            }

            long long_5 = aLong5353;
            int i_8 = i_3;
            int i_9;
            if (aLong5353 >= aLong5347 && aLong5353 < anInt5349 + aLong5347) {
                i_9 = (int) (anInt5349 - (aLong5353 - aLong5347));
                if (i_9 > i_3) {
                    i_9 = i_3;
                }

                System.arraycopy(aByteArray5350, (int) (aLong5353 - aLong5347), bytes_1, i_2, i_9);
                aLong5353 += i_9;
                i_2 += i_9;
                i_3 -= i_9;
            }

            if (i_3 > aByteArray5350.length) {
                aClass442_5346.method7390(aLong5353);

                for (aLong5351 = aLong5353; i_3 > 0; i_3 -= i_9) {
                    i_9 = aClass442_5346.method7389(bytes_1, i_2, i_3);
                    if (i_9 == -1) {
                        break;
                    }

                    aLong5351 += i_9;
                    aLong5353 += i_9;
                    i_2 += i_9;
                }
            } else if (i_3 > 0) {
                method7363();
                i_9 = Math.min(i_3, anInt5349);

                System.arraycopy(aByteArray5350, 0, bytes_1, i_2, i_9);
                i_2 += i_9;
                i_3 -= i_9;
                aLong5353 += i_9;
            }

            if (aLong5345 != -1L) {
                if (aLong5345 > aLong5353 && i_3 > 0) {
                    i_9 = i_2 + (int) (aLong5345 - aLong5353);
                    if (i_9 > i_3 + i_2) {
                        i_9 = i_3 + i_2;
                    }

                    while (i_2 < i_9) {
                        bytes_1[i_2++] = 0;
                        --i_3;
                        ++aLong5353;
                    }
                }

                long long_14 = -1L;
                long long_11 = -1L;
                if (aLong5345 >= long_5 && aLong5345 < i_8 + long_5) {
                    long_14 = aLong5345;
                } else if (long_5 >= aLong5345 && long_5 < (anInt5356 * 675653231) + aLong5345) {
                    long_14 = long_5;
                }

                if ((anInt5356 * 675653231) + aLong5345 > long_5 && (anInt5356 * 675653231) + aLong5345 <= i_8 + long_5) {
                    long_11 = (anInt5356 * 675653231) + aLong5345;
                } else if (i_8 + long_5 > aLong5345 && long_5 + i_8 <= aLong5345 + (anInt5356 * 675653231)) {
                    long_11 = i_8 + long_5;
                }

                if (long_14 > -1L && long_11 > long_14) {
                    int i_13 = (int) (long_11 - long_14);
                    System.arraycopy(aByteArray5348, (int) (long_14 - aLong5345), bytes_1, (int) (long_14 - long_5) + i_2, i_13);
                    if (long_11 > aLong5353) {
                        i_3 = (int) (i_3 - (long_11 - aLong5353));
                        aLong5353 = long_11;
                    }
                }
            }
        } catch (IOException ioexception_17) {
            aLong5351 = -1L;
            throw ioexception_17;
        }

        if (i_3 > 0) {
            throw new EOFException();
        }
    }

    public void method7351(byte[] bytes_1) throws IOException {
        method7350(bytes_1, 0, bytes_1.length);
    }

    public void write(byte[] bytes_1, int i_2, int i_3) throws IOException {
        try {
            if (i_3 + aLong5353 > aLong5355) {
                aLong5355 = aLong5353 + i_3;
            }

            if (aLong5345 != -1L && (aLong5353 < aLong5345 || aLong5353 > (anInt5356 * 675653231) + aLong5345)) {
                method7353();
            }

            if (aLong5345 != -1L && aLong5353 + i_3 > aLong5345 + aByteArray5348.length) {
                int i_5 = (int) (aByteArray5348.length - (aLong5353 - aLong5345));
                System.arraycopy(bytes_1, i_2, aByteArray5348, (int) (aLong5353 - aLong5345), i_5);
                aLong5353 += i_5;
                i_2 += i_5;
                i_3 -= i_5;
                anInt5356 = aByteArray5348.length * -1070827377;
                method7353();
            }

            if (i_3 > aByteArray5348.length) {
                if (aLong5353 != aLong5351) {
                    aClass442_5346.method7390(aLong5353);
                    aLong5351 = aLong5353;
                }

                aClass442_5346.method7386(bytes_1, i_2, i_3);
                aLong5351 += i_3;
                if (aLong5351 > aLong5354) {
                    aLong5354 = aLong5351;
                }

                long long_10 = -1L;
                long long_7 = -1L;
                if (aLong5353 >= aLong5347 && aLong5353 < aLong5347 + anInt5349) {
                    long_10 = aLong5353;
                } else if (aLong5347 >= aLong5353 && aLong5347 < i_3 + aLong5353) {
                    long_10 = aLong5347;
                }

                if (i_3 + aLong5353 > aLong5347 && aLong5353 + i_3 <= aLong5347 + anInt5349) {
                    long_7 = i_3 + aLong5353;
                } else if (aLong5347 + anInt5349 > aLong5353 && aLong5347 + anInt5349 <= aLong5353 + i_3) {
                    long_7 = anInt5349 + aLong5347;
                }

                if (long_10 > -1L && long_7 > long_10) {
                    int i_9 = (int) (long_7 - long_10);
                    System.arraycopy(bytes_1, (int) (long_10 + i_2 - aLong5353), aByteArray5350, (int) (long_10 - aLong5347), i_9);
                }

                aLong5353 += i_3;
            } else if (i_3 > 0) {
                if (aLong5345 == -1L) {
                    aLong5345 = aLong5353;
                }

                System.arraycopy(bytes_1, i_2, aByteArray5348, (int) (aLong5353 - aLong5345), i_3);
                aLong5353 += i_3;
                if (aLong5353 - aLong5345 > (anInt5356 * 675653231)) {
                    anInt5356 = (int) (aLong5353 - aLong5345) * -1070827377;
                }
            }

        } catch (IOException ioexception_13) {
            aLong5351 = -1L;
            throw ioexception_13;
        }
    }

    void method7353() throws IOException {
        if (aLong5345 != -1L) {
            if (aLong5345 != aLong5351) {
                aClass442_5346.method7390(aLong5345);
                aLong5351 = aLong5345;
            }

            aClass442_5346.method7386(aByteArray5348, 0, anInt5356 * 675653231);
            aLong5351 += 675653231L * anInt5356;
            if (aLong5351 > aLong5354) {
                aLong5354 = aLong5351;
            }

            long long_2 = -1L;
            long long_4 = -1L;
            if (aLong5345 >= aLong5347 && aLong5345 < anInt5349 + aLong5347) {
                long_2 = aLong5345;
            } else if (aLong5347 >= aLong5345 && aLong5347 < aLong5345 + (anInt5356 * 675653231)) {
                long_2 = aLong5347;
            }

            if ((anInt5356 * 675653231) + aLong5345 > aLong5347 && (anInt5356 * 675653231) + aLong5345 <= anInt5349 + aLong5347) {
                long_4 = (anInt5356 * 675653231) + aLong5345;
            } else if (aLong5347 + anInt5349 > aLong5345 && anInt5349 + aLong5347 <= aLong5345 + (anInt5356 * 675653231)) {
                long_4 = aLong5347 + anInt5349;
            }

            if (long_2 > -1L && long_4 > long_2) {
                int i_6 = (int) (long_4 - long_2);
                System.arraycopy(aByteArray5348, (int) (long_2 - aLong5345), aByteArray5350, (int) (long_2 - aLong5347), i_6);
            }

            aLong5345 = -1L;
            anInt5356 = 0;
        }

    }

    void method7363() throws IOException {
        anInt5349 = 0;
        if (aLong5353 != aLong5351) {
            aClass442_5346.method7390(aLong5353);
            aLong5351 = aLong5353;
        }

        int i_2;
        for (aLong5347 = aLong5353; anInt5349 < aByteArray5350.length; anInt5349 += i_2) {
            int i_3 = aByteArray5350.length - anInt5349;
            if (i_3 > 200000000) {
                i_3 = 200000000;
            }

            i_2 = aClass442_5346.method7389(aByteArray5350, anInt5349, i_3);
            if (i_2 == -1) {
                break;
            }

            aLong5351 += i_2;
        }

    }

}
