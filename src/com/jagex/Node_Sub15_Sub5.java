package com.jagex;

public abstract class Node_Sub15_Sub5 extends Node_Sub15 {

    static int anInt9859;
    int anInt9844;
    int anInt9856;
    boolean aBool9857;
    int anInt9855;
    int anInt9848;
    int anInt9845;
    int anInt9850;
    int anInt9858;
    int anInt9854;
    int anInt9846;
    int anInt9853;
    int anInt9847;
    int anInt9849;
    int anInt9852;
    int anInt9851;

    public synchronized void method15308(int i_1) {
        if (anInt9855 < 0) {
            anInt9855 = -i_1;
        } else {
            anInt9855 = i_1;
        }

    }

    public synchronized boolean method15311() {
        return anInt9858 != 0;
    }

    @Override
    public abstract void method12241(int[] var1, int var2, int var3);

    public synchronized void method15312(int i_1) {
        method15364(i_1 << 6, method15316());
    }

    public synchronized void method15313() {
        anInt9855 = (anInt9855 ^ anInt9855 >> 31) + (anInt9855 >>> 31);
        anInt9855 = -(anInt9855 * 1927994969) * -177305111;
    }

    @Override
    public synchronized void method12234(int i_1) {
        int i_11 = i_1;
        if (1008956447 * anInt9858 * 1156515807 > 0) {
            if (i_11 >= 1008956447 * anInt9858 * 1156515807) {
                if (anInt9846 * -298675253 * -1302038045 == Integer.MIN_VALUE) {
                    anInt9846 = 0;
                    anInt9850 = 0;
                    anInt9845 = 0;
                    anInt9848 = 0;
                    unlink();
                    i_11 = anInt9858 * 1156515807 * 1008956447;
                }

                anInt9858 = 0;
                method15332();
            } else {
                anInt9848 = (anInt9848 * 3 * -1431655765 * 809781739 + 809781739 * i_11 * 1670226395 * anInt9849 * -1756138925) * -217803069 * 3 * -1431655765;
                anInt9845 = (anInt9845 * 1672655349 + 1672655349 * anInt9852 * -661281463 * 1923898617 * i_11) * 1784001117;
                anInt9850 = (anInt9850 * 1339372733 + 1339372733 * anInt9851 * -1589776061 * 241181547 * i_11) * 2085185173;
                anInt9858 = (anInt9858 * 1156515807 - i_11 * 1156515807) * 1008956447;
            }
        }

        int i_2 = anInt9844 * 900940833 * -99794975 << 8;
        int i_3 = anInt9856 * -628161865 * -1048610041 << 8;
        int i_4 = ((Node_Sub26_Sub1) aNode_Sub26_7601).method15223() << 8;
        int i_5 = i_3 - i_2;
        if (i_5 <= 0) {
            anInt9854 = 0;
        }

        if (anInt9853 * -834443097 * -354697449 < 0) {
            if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
                method15354();
                unlink();
                return;
            }

            anInt9853 = 0;
        }

        if (anInt9853 * -834443097 * -354697449 >= i_4) {
            if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 >= 0) {
                method15354();
                unlink();
                return;
            }

            anInt9853 = (i_4 - 1) * -834443097 * -354697449;
        }

        anInt9853 = (anInt9853 * -834443097 + -834443097 * -177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 * i_11) * -354697449;
        if (1507503163 * anInt9854 * -485012237 < 0) {
            if (aBool9857) {
                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    if (anInt9853 * -834443097 * -354697449 >= i_2) {
                        return;
                    }

                    anInt9853 = (i_2 + i_2 - 1 - anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }

                while (-354697449 * anInt9853 * -834443097 >= i_3) {
                    anInt9853 = -834443097 * (i_3 + i_3 - 1 - -354697449 * anInt9853 * -834443097) * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    if (anInt9853 * -834443097 * -354697449 >= i_2) {
                        break;
                    }

                    anInt9853 = (i_2 + i_2 - 1 - -354697449 * anInt9853 * -834443097) * -834443097 * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }
            } else if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                if (-354697449 * anInt9853 * -834443097 < i_2) {
                    anInt9853 = -834443097 * (i_3 - 1 - (i_3 - 1 - anInt9853 * -834443097 * -354697449) % i_5) * -354697449;
                }
            } else if (anInt9853 * -834443097 * -354697449 >= i_3) {
                anInt9853 = -834443097 * (i_2 + (-354697449 * anInt9853 * -834443097 - i_2) % i_5) * -354697449;
            }
        } else {
            if (anInt9854 * -485012237 * 1507503163 > 0) {
                if (aBool9857) {
                    label123:
                    {
                        int i_10002;
                        if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                            if (anInt9853 * -834443097 * -354697449 >= i_2) {
                                return;
                            }

                            anInt9853 = (i_2 + i_2 - 1 - -354697449 * anInt9853 * -834443097) * -834443097 * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break label123;
                            }
                        }

                        do {
                            if (-354697449 * anInt9853 * -834443097 < i_3) {
                                return;
                            }

                            anInt9853 = (i_3 + i_3 - 1 - anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break;
                            }

                            if (-354697449 * anInt9853 * -834443097 >= i_2) {
                                return;
                            }

                            anInt9853 = -834443097 * (i_2 + i_2 - 1 - anInt9853 * -834443097 * -354697449) * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                        } while (i_10002 * 1507503163 != 0);
                    }
                } else {
                    int i_6;
                    if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                        if (-354697449 * anInt9853 * -834443097 >= i_2) {
                            return;
                        }

                        i_6 = (i_3 - 1 - -354697449 * anInt9853 * -834443097) / i_5;
                        if (i_6 < anInt9854 * -485012237 * 1507503163) {
                            anInt9853 = (anInt9853 * -834443097 + -834443097 * i_5 * i_6) * -354697449;
                            anInt9854 = (anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        anInt9853 = (anInt9853 * -834443097 + -834443097 * 1507503163 * anInt9854 * -485012237 * i_5) * -354697449;
                    } else {
                        if (-354697449 * anInt9853 * -834443097 < i_3) {
                            return;
                        }

                        i_6 = (-354697449 * anInt9853 * -834443097 - i_2) / i_5;
                        if (i_6 < 1507503163 * anInt9854 * -485012237) {
                            anInt9853 = (anInt9853 * -834443097 - -834443097 * i_5 * i_6) * -354697449;
                            anInt9854 = (anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        anInt9853 = (anInt9853 * -834443097 - -834443097 * i_5 * anInt9854 * -485012237 * 1507503163) * -354697449;
                    }
                    anInt9854 = 0;
                }
            }

            if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                if (-354697449 * anInt9853 * -834443097 < 0) {
                    anInt9853 = 834443097 * -354697449;
                    method15354();
                    unlink();
                }
            } else if (anInt9853 * -834443097 * -354697449 >= i_4) {
                anInt9853 = -834443097 * i_4 * -354697449;
                method15354();
                unlink();
            }
        }

    }

    public synchronized int method15315() {
        return anInt9846 == Integer.MIN_VALUE ? 0 : anInt9846;
    }

    public synchronized int method15316() {
        return anInt9847 < 0 ? -1 : anInt9847;
    }

    public synchronized void method15317(int i_1) {
        int i_11 = i_1;
        int i_3 = ((Node_Sub26_Sub1) aNode_Sub26_7601).method15223() << 8;
        if (i_11 < -1) {
            i_11 = -1;
        }

        if (i_11 > i_3) {
            i_11 = i_3;
        }

        anInt9853 = i_11;
    }

    public synchronized boolean method15319() {
        return anInt9853 < 0 || anInt9853 >= ((Node_Sub26_Sub1) aNode_Sub26_7601).method15223() << 8;
    }

    @Override
    Node_Sub15 method12235() {
        return null;
    }

    public synchronized void method15320(int i_1, int i_2) {
        method15321(i_1, i_2, method15316());
    }

    public synchronized void method15321(int i_1, int i_2, int i_3) {
        int i_11 = i_1;
        if (i_11 == 0) {
            method15364(i_2, i_3);
        } else {
            int i_5 = HostNameIdentifier.method488(i_2, i_3);
            int i_6 = Node_Sub20_Sub24.method15390(i_2, i_3);
            if (i_5 == anInt9845 && i_6 == anInt9850) {
                anInt9858 = 0;
            } else {
                int i_7 = i_2 - anInt9848;
                if (anInt9848 - i_2 > i_7) {
                    i_7 = anInt9848 - i_2;
                }

                if (i_5 - anInt9845 > i_7) {
                    i_7 = i_5 - anInt9845;
                }

                if (anInt9845 - i_5 > i_7) {
                    i_7 = anInt9845 - i_5;
                }

                if (i_6 - anInt9850 > i_7) {
                    i_7 = i_6 - anInt9850;
                }

                if (anInt9850 - i_6 > i_7) {
                    i_7 = anInt9850 - i_6;
                }

                if (i_11 > i_7) {
                    i_11 = i_7;
                }

                anInt9858 = i_11;
                anInt9846 = i_2;
                anInt9847 = i_3;
                anInt9849 = (i_2 - anInt9848) / i_11;
                anInt9852 = (i_5 - anInt9845) / i_11;
                anInt9851 = (i_6 - anInt9850) / i_11;
            }
        }

    }

    public synchronized void method15322(int i_1) {
        int i_11 = i_1;
        if (i_11 == 0) {
            method15326();
            unlink();
        } else if (anInt9845 == 0 && anInt9850 == 0) {
            anInt9858 = 0;
            anInt9846 = 0;
            anInt9848 = 0;
            unlink();
        } else {
            int i_3 = -anInt9848;
            if (anInt9848 > i_3) {
                i_3 = anInt9848;
            }

            if (-anInt9845 > i_3) {
                i_3 = -anInt9845;
            }

            if (anInt9845 > i_3) {
                i_3 = anInt9845;
            }

            if (-anInt9850 > i_3) {
                i_3 = -anInt9850;
            }

            if (anInt9850 > i_3) {
                i_3 = anInt9850;
            }

            if (i_11 > i_3) {
                i_11 = i_3;
            }

            anInt9858 = i_11;
            anInt9846 = Integer.MIN_VALUE;
            anInt9849 = -anInt9848 / i_11;
            anInt9852 = -anInt9845 / i_11;
            anInt9851 = -anInt9850 / i_11;
        }

    }

    @Override
    int method12238() {
        return -1302038045 * anInt9846 * -298675253 == 0 && anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    public synchronized int method15323() {
        return anInt9855 < 0 ? -anInt9855 : anInt9855;
    }

    @Override
    int method12228() {
        return anInt9846 == 0 && anInt9858 == 0 ? 0 : 1;
    }

    boolean method15324() {
        int i_2 = anInt9846;
        int i_3;
        int i_4;
        if (i_2 == Integer.MIN_VALUE) {
            i_4 = 0;
            i_3 = 0;
            i_2 = 0;
        } else {
            i_3 = HostNameIdentifier.method488(i_2, anInt9847);
            i_4 = Node_Sub20_Sub24.method15390(i_2, anInt9847);
        }

        if (i_2 == anInt9848 && i_3 == anInt9845 && i_4 == anInt9850) {
            if (anInt9846 == Integer.MIN_VALUE) {
                anInt9846 = 0;
                anInt9850 = 0;
                anInt9845 = 0;
                anInt9848 = 0;
                unlink();
                return true;
            } else {
                method15332();
                return false;
            }
        } else {
            if (anInt9848 < i_2) {
                anInt9849 = 1;
                anInt9858 = i_2 - anInt9848;
            } else if (anInt9848 > i_2) {
                anInt9849 = -1;
                anInt9858 = anInt9848 - i_2;
            } else {
                anInt9849 = 0;
            }

            if (anInt9845 < i_3) {
                anInt9852 = 1;
                if (anInt9858 == 0 || anInt9858 > i_3 - anInt9845) {
                    anInt9858 = i_3 - anInt9845;
                }
            } else if (anInt9845 > i_3) {
                anInt9852 = -1;
                if (anInt9858 == 0 || anInt9858 > anInt9845 - i_3) {
                    anInt9858 = anInt9845 - i_3;
                }
            } else {
                anInt9852 = 0;
            }

            if (anInt9850 < i_4) {
                anInt9851 = 1;
                if (anInt9858 == 0 || anInt9858 > i_4 - anInt9850) {
                    anInt9858 = i_4 - anInt9850;
                }
            } else if (anInt9850 > i_4) {
                anInt9851 = -1;
                if (anInt9858 == 0 || anInt9858 > anInt9850 - i_4) {
                    anInt9858 = anInt9850 - i_4;
                }
            } else {
                anInt9851 = 0;
            }

            return false;
        }
    }

    @Override
    public synchronized void method12231(int i_1) {
        int i_11 = i_1;
        if (anInt9858 > 0) {
            if (i_11 >= anInt9858) {
                if (anInt9846 == Integer.MIN_VALUE) {
                    anInt9846 = 0;
                    anInt9850 = 0;
                    anInt9845 = 0;
                    anInt9848 = 0;
                    unlink();
                    i_11 = anInt9858;
                }

                anInt9858 = 0;
                method15332();
            } else {
                anInt9848 += i_11 * anInt9849;
                anInt9845 += anInt9852 * i_11;
                anInt9850 += anInt9851 * i_11;
                anInt9858 -= i_11;
            }
        }

        int i_2 = anInt9844 << 8;
        int i_3 = anInt9856 << 8;
        int i_4 = ((Node_Sub26_Sub1) aNode_Sub26_7601).method15223() << 8;
        int i_5 = i_3 - i_2;
        if (i_5 <= 0) {
            anInt9854 = 0;
        }

        if (anInt9853 < 0) {
            if (anInt9855 <= 0) {
                method15354();
                unlink();
                return;
            }

            anInt9853 = 0;
        }

        if (anInt9853 >= i_4) {
            if (anInt9855 >= 0) {
                method15354();
                unlink();
                return;
            }

            anInt9853 = i_4 - 1;
        }

        anInt9853 += anInt9855 * i_11;
        if (anInt9854 < 0) {
            if (aBool9857) {
                if (anInt9855 < 0) {
                    if (anInt9853 >= i_2) {
                        return;
                    }

                    anInt9853 = i_2 + i_2 - 1 - anInt9853;
                    anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                }

                while (anInt9853 >= i_3) {
                    anInt9853 = i_3 + i_3 - 1 - anInt9853;
                    anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                    if (anInt9853 >= i_2) {
                        break;
                    }

                    anInt9853 = i_2 + i_2 - 1 - anInt9853;
                    anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                }
            } else if (anInt9855 < 0) {
                if (anInt9853 < i_2) {
                    anInt9853 = i_3 - 1 - (i_3 - 1 - anInt9853) % i_5;
                }
            } else if (anInt9853 >= i_3) {
                anInt9853 = i_2 + (anInt9853 - i_2) % i_5;
            }
        } else {
            if (anInt9854 > 0) {
                if (aBool9857) {
                    label123:
                    {
                        if (anInt9855 < 0) {
                            if (anInt9853 >= i_2) {
                                return;
                            }

                            anInt9853 = i_2 + i_2 - 1 - anInt9853;
                            anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                            if (--anInt9854 == 0) {
                                break label123;
                            }
                        }

                        do {
                            if (anInt9853 < i_3) {
                                return;
                            }

                            anInt9853 = i_3 + i_3 - 1 - anInt9853;
                            anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                            if (--anInt9854 == 0) {
                                break;
                            }

                            if (anInt9853 >= i_2) {
                                return;
                            }

                            anInt9853 = i_2 + i_2 - 1 - anInt9853;
                            anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                        } while (--anInt9854 != 0);
                    }
                } else {
                    int i_6;
                    if (anInt9855 < 0) {
                        if (anInt9853 >= i_2) {
                            return;
                        }

                        i_6 = (i_3 - 1 - anInt9853) / i_5;
                        if (i_6 < anInt9854) {
                            anInt9853 += i_5 * i_6;
                            anInt9854 -= i_6;
                            return;
                        }

                        anInt9853 += anInt9854 * i_5;
                    } else {
                        if (anInt9853 < i_3) {
                            return;
                        }

                        i_6 = (anInt9853 - i_2) / i_5;
                        if (i_6 < anInt9854) {
                            anInt9853 -= i_5 * i_6;
                            anInt9854 -= i_6;
                            return;
                        }

                        anInt9853 -= i_5 * anInt9854;
                    }
                    anInt9854 = 0;
                }
            }

            if (anInt9855 < 0) {
                if (anInt9853 < 0) {
                    anInt9853 = -1;
                    method15354();
                    unlink();
                }
            } else if (anInt9853 >= i_4) {
                anInt9853 = i_4;
                method15354();
                unlink();
            }
        }

    }

    @Override
    Node_Sub15 method12226() {
        return null;
    }

    public synchronized void method15325(int i_1) {
        anInt9854 = i_1;
    }

    synchronized void method15326() {
        method15364(0, method15316());
    }

    @Override
    Node_Sub15 method12232() {
        return null;
    }

    @Override
    public synchronized void method12243(int i_1) {
        int i_11 = i_1;
        if (1008956447 * anInt9858 * 1156515807 > 0) {
            if (i_11 >= 1008956447 * anInt9858 * 1156515807) {
                if (anInt9846 * -298675253 * -1302038045 == Integer.MIN_VALUE) {
                    anInt9846 = 0;
                    anInt9850 = 0;
                    anInt9845 = 0;
                    anInt9848 = 0;
                    unlink();
                    i_11 = anInt9858 * 1156515807 * 1008956447;
                }

                anInt9858 = 0;
                method15332();
            } else {
                anInt9848 = (anInt9848 * 3 * -1431655765 * 809781739 + 809781739 * i_11 * 1670226395 * anInt9849 * -1756138925) * -217803069 * 3 * -1431655765;
                anInt9845 = (anInt9845 * 1672655349 + 1672655349 * anInt9852 * -661281463 * 1923898617 * i_11) * 1784001117;
                anInt9850 = (anInt9850 * 1339372733 + 1339372733 * anInt9851 * -1589776061 * 241181547 * i_11) * 2085185173;
                anInt9858 = (anInt9858 * 1156515807 - i_11 * 1156515807) * 1008956447;
            }
        }

        int i_2 = anInt9844 * 900940833 * -99794975 << 8;
        int i_3 = anInt9856 * -628161865 * -1048610041 << 8;
        int i_4 = ((Node_Sub26_Sub1) aNode_Sub26_7601).method15223() << 8;
        int i_5 = i_3 - i_2;
        if (i_5 <= 0) {
            anInt9854 = 0;
        }

        if (anInt9853 * -834443097 * -354697449 < 0) {
            if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
                method15354();
                unlink();
                return;
            }

            anInt9853 = 0;
        }

        if (anInt9853 * -834443097 * -354697449 >= i_4) {
            if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 >= 0) {
                method15354();
                unlink();
                return;
            }

            anInt9853 = (i_4 - 1) * -834443097 * -354697449;
        }

        anInt9853 = (anInt9853 * -834443097 + -834443097 * -177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 * i_11) * -354697449;
        if (1507503163 * anInt9854 * -485012237 < 0) {
            if (aBool9857) {
                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    if (anInt9853 * -834443097 * -354697449 >= i_2) {
                        return;
                    }

                    anInt9853 = (i_2 + i_2 - 1 - anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }

                while (-354697449 * anInt9853 * -834443097 >= i_3) {
                    anInt9853 = -834443097 * (i_3 + i_3 - 1 - -354697449 * anInt9853 * -834443097) * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    if (anInt9853 * -834443097 * -354697449 >= i_2) {
                        break;
                    }

                    anInt9853 = (i_2 + i_2 - 1 - -354697449 * anInt9853 * -834443097) * -834443097 * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }
            } else if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                if (-354697449 * anInt9853 * -834443097 < i_2) {
                    anInt9853 = -834443097 * (i_3 - 1 - (i_3 - 1 - anInt9853 * -834443097 * -354697449) % i_5) * -354697449;
                }
            } else if (anInt9853 * -834443097 * -354697449 >= i_3) {
                anInt9853 = -834443097 * (i_2 + (-354697449 * anInt9853 * -834443097 - i_2) % i_5) * -354697449;
            }
        } else {
            if (anInt9854 * -485012237 * 1507503163 > 0) {
                if (aBool9857) {
                    label123:
                    {
                        int i_10002;
                        if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                            if (anInt9853 * -834443097 * -354697449 >= i_2) {
                                return;
                            }

                            anInt9853 = (i_2 + i_2 - 1 - -354697449 * anInt9853 * -834443097) * -834443097 * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break label123;
                            }
                        }

                        do {
                            if (-354697449 * anInt9853 * -834443097 < i_3) {
                                return;
                            }

                            anInt9853 = (i_3 + i_3 - 1 - anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break;
                            }

                            if (-354697449 * anInt9853 * -834443097 >= i_2) {
                                return;
                            }

                            anInt9853 = -834443097 * (i_2 + i_2 - 1 - anInt9853 * -834443097 * -354697449) * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                        } while (i_10002 * 1507503163 != 0);
                    }
                } else {
                    int i_6;
                    if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                        if (-354697449 * anInt9853 * -834443097 >= i_2) {
                            return;
                        }

                        i_6 = (i_3 - 1 - -354697449 * anInt9853 * -834443097) / i_5;
                        if (i_6 < anInt9854 * -485012237 * 1507503163) {
                            anInt9853 = (anInt9853 * -834443097 + -834443097 * i_5 * i_6) * -354697449;
                            anInt9854 = (anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        anInt9853 = (anInt9853 * -834443097 + -834443097 * 1507503163 * anInt9854 * -485012237 * i_5) * -354697449;
                    } else {
                        if (-354697449 * anInt9853 * -834443097 < i_3) {
                            return;
                        }

                        i_6 = (-354697449 * anInt9853 * -834443097 - i_2) / i_5;
                        if (i_6 < 1507503163 * anInt9854 * -485012237) {
                            anInt9853 = (anInt9853 * -834443097 - -834443097 * i_5 * i_6) * -354697449;
                            anInt9854 = (anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        anInt9853 = (anInt9853 * -834443097 - -834443097 * i_5 * anInt9854 * -485012237 * 1507503163) * -354697449;
                    }
                    anInt9854 = 0;
                }
            }

            if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                if (-354697449 * anInt9853 * -834443097 < 0) {
                    anInt9853 = 834443097 * -354697449;
                    method15354();
                    unlink();
                }
            } else if (anInt9853 * -834443097 * -354697449 >= i_4) {
                anInt9853 = -834443097 * i_4 * -354697449;
                method15354();
                unlink();
            }
        }

    }

    @Override
    Node_Sub15 method12229() {
        return null;
    }

    @Override
    int method12224() {
        return -1302038045 * anInt9846 * -298675253 == 0 && anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    @Override
    int method12244() {
        return -1302038045 * anInt9846 * -298675253 == 0 && anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    @Override
    public abstract void method12240(int[] var1, int var2, int var3);

    @Override
    public abstract void method12242(int[] var1, int var2, int var3);

    void method15332() {
        anInt9848 = anInt9846;
        anInt9845 = HostNameIdentifier.method488(anInt9846, anInt9847);
        anInt9850 = Node_Sub20_Sub24.method15390(anInt9846, anInt9847);
    }

    @Override
    Node_Sub15 method12233() {
        return null;
    }

    @Override
    int method12225() {
        int i_1 = anInt9848 * 3 >> 6;
        i_1 = (i_1 ^ i_1 >> 31) + (i_1 >>> 31);
        if (anInt9854 == 0) {
            i_1 -= i_1 * anInt9853 / (((Node_Sub26_Sub1) aNode_Sub26_7601).method15223() << 8);
        } else if (anInt9854 >= 0) {
            i_1 -= i_1 * anInt9844 / ((Node_Sub26_Sub1) aNode_Sub26_7601).method15223();
        }

        return Math.min(255, i_1);
    }

    @Override
    Node_Sub15 method12236() {
        return null;
    }

    public synchronized void method15340(int i_1) {
        method15364(method15315(), i_1);
    }

    @Override
    int method12227() {
        return -1302038045 * anInt9846 * -298675253 == 0 && anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    @Override
    public abstract void method12230(int[] var1, int var2, int var3);

    @Override
    Node_Sub15 method12239() {
        return null;
    }

    void method15354() {
        if (anInt9858 != 0) {
            if (anInt9846 == Integer.MIN_VALUE) {
                anInt9846 = 0;
            }

            anInt9858 = 0;
            method15332();
        }

    }

    synchronized void method15364(int i_1, int i_2) {
        anInt9846 = i_1;
        anInt9847 = i_2;
        anInt9858 = 0;
        method15332();
    }

}
