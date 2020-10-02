package com.jagex;

public class Class254_Sub1 extends Class254 {

    @Override
    public void run() {
        aBool3144 = true;

        try {
            try {
                while (!aBool3143) {
                    for (int i_1 = 0; i_1 < 2; i_1++) {
                        Class253 class253_2 = aClass253Array3142[i_1];
                        if (class253_2 != null) {
                            class253_2.method4333();
                        }
                    }

                    Class89.sleep(10L);
                    MaterialProp7.method15395(null);
                }
            } catch (Exception exception_4) {
                Class151.method2594(null, exception_4);
                aBool3144 = false;
                return;
            }

            aBool3144 = false;
        } catch (Exception exception_5) {
            aBool3144 = false;
        }

    }

}
