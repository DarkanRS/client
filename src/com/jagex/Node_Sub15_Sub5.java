package com.jagex;

public abstract class Node_Sub15_Sub5 extends Node_Sub15 {

    int anInt9844;
    int anInt9856;
    boolean aBool9857;
    static int anInt9859;
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

    public final synchronized void method15308(int i_1) {
        if (this.anInt9855 < 0) {
            this.anInt9855 = -i_1;
        } else {
            this.anInt9855 = i_1;
        }

    }

    public final synchronized boolean method15311() {
        return this.anInt9858 != 0;
    }

    public abstract void method12241(int[] var1, int var2, int var3);

    public final synchronized void method15312(int i_1, byte b_2) {
        this.method15364(i_1 << 6, this.method15316(1349583884));
    }

    public final synchronized void method15313() {
        this.anInt9855 = (this.anInt9855 ^ this.anInt9855 >> 31) + (this.anInt9855 >>> 31);
        this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
    }

    public final synchronized void method12234(int i_1) {
        if (1008956447 * this.anInt9858 * 1156515807 > 0) {
            if (i_1 >= 1008956447 * this.anInt9858 * 1156515807) {
                if (this.anInt9846 * -298675253 * -1302038045 == Integer.MIN_VALUE) {
                    this.anInt9846 = 0 * -1302038045;
                    this.anInt9850 = 0 * 2085185173;
                    this.anInt9845 = 0 * 1784001117;
                    this.anInt9848 = 0 * -217803069 * 3 * -1431655765;
                    this.remove();
                    i_1 = this.anInt9858 * 1156515807 * 1008956447;
                }

                this.anInt9858 = 0 * 1008956447;
                this.method15332((byte) -7);
            } else {
                this.anInt9848 = (this.anInt9848 * 3 * -1431655765 * 809781739 + 809781739 * i_1 * 1670226395 * this.anInt9849 * -1756138925) * -217803069 * 3 * -1431655765;
                this.anInt9845 = (this.anInt9845 * 1672655349 + 1672655349 * this.anInt9852 * -661281463 * 1923898617 * i_1) * 1784001117;
                this.anInt9850 = (this.anInt9850 * 1339372733 + 1339372733 * this.anInt9851 * -1589776061 * 241181547 * i_1) * 2085185173;
                this.anInt9858 = (this.anInt9858 * 1156515807 - i_1 * 1156515807) * 1008956447;
            }
        }

        int i_2 = this.anInt9844 * 900940833 * -99794975 << 8;
        int i_3 = this.anInt9856 * -628161865 * -1048610041 << 8;
        int i_4 = ((Node_Sub26_Sub1) this.aNode_Sub26_7601).method15223() << 8;
        int i_5 = i_3 - i_2;
        if (i_5 <= 0) {
            this.anInt9854 = 0 * 1507503163;
        }

        if (this.anInt9853 * -834443097 * -354697449 < 0) {
            if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
                this.method15354();
                this.remove();
                return;
            }

            this.anInt9853 = 0 * -354697449;
        }

        if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
            if (-177305111 * this.anInt9855 * 1927994969 * -177305111 * 1927994969 >= 0) {
                this.method15354();
                this.remove();
                return;
            }

            this.anInt9853 = (i_4 - 1) * -834443097 * -354697449;
        }

        this.anInt9853 = (this.anInt9853 * -834443097 + -834443097 * -177305111 * this.anInt9855 * 1927994969 * -177305111 * 1927994969 * i_1) * -354697449;
        if (1507503163 * this.anInt9854 * -485012237 < 0) {
            if (this.aBool9857) {
                if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    if (this.anInt9853 * -834443097 * -354697449 >= i_2) {
                        return;
                    }

                    this.anInt9853 = (i_2 + i_2 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
                    this.anInt9855 = -(1 * this.anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }

                while (-354697449 * this.anInt9853 * -834443097 >= i_3) {
                    this.anInt9853 = -834443097 * (i_3 + i_3 - 1 - -354697449 * this.anInt9853 * -834443097) * -354697449;
                    this.anInt9855 = -(1 * this.anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    if (this.anInt9853 * -834443097 * -354697449 >= i_2) {
                        break;
                    }

                    this.anInt9853 = (i_2 + i_2 - 1 - -354697449 * this.anInt9853 * -834443097) * -834443097 * -354697449;
                    this.anInt9855 = -(1 * this.anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }
            } else if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                if (-354697449 * this.anInt9853 * -834443097 < i_2) {
                    this.anInt9853 = -834443097 * (i_3 - 1 - (i_3 - 1 - this.anInt9853 * -834443097 * -354697449) % i_5) * -354697449;
                }
            } else if (this.anInt9853 * -834443097 * -354697449 >= i_3) {
                this.anInt9853 = -834443097 * (i_2 + (-354697449 * this.anInt9853 * -834443097 - i_2) % i_5) * -354697449;
            }
        } else {
            if (this.anInt9854 * -485012237 * 1507503163 > 0) {
                if (this.aBool9857) {
                    label123:
                    {
                        int i_10002;
                        if (-177305111 * this.anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                            if (this.anInt9853 * -834443097 * -354697449 >= i_2) {
                                return;
                            }

                            this.anInt9853 = (i_2 + i_2 - 1 - -354697449 * this.anInt9853 * -834443097) * -834443097 * -354697449;
                            this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
                            i_10002 = this.anInt9854 * -485012237 - -485012237;
                            this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break label123;
                            }
                        }

                        do {
                            if (-354697449 * this.anInt9853 * -834443097 < i_3) {
                                return;
                            }

                            this.anInt9853 = (i_3 + i_3 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
                            this.anInt9855 = -(1 * this.anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = this.anInt9854 * -485012237 - -485012237;
                            this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break;
                            }

                            if (-354697449 * this.anInt9853 * -834443097 >= i_2) {
                                return;
                            }

                            this.anInt9853 = -834443097 * (i_2 + i_2 - 1 - this.anInt9853 * -834443097 * -354697449) * -354697449;
                            this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
                            i_10002 = this.anInt9854 * -485012237 - -485012237;
                            this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
                        } while (i_10002 * 1507503163 != 0);
                    }
                } else {
                    int i_6;
                    if (-177305111 * this.anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                        if (-354697449 * this.anInt9853 * -834443097 >= i_2) {
                            return;
                        }

                        i_6 = (i_3 - 1 - -354697449 * this.anInt9853 * -834443097) / i_5;
                        if (i_6 < this.anInt9854 * -485012237 * 1507503163) {
                            this.anInt9853 = (this.anInt9853 * -834443097 + -834443097 * i_5 * i_6) * -354697449;
                            this.anInt9854 = (this.anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        this.anInt9853 = (this.anInt9853 * -834443097 + -834443097 * 1507503163 * this.anInt9854 * -485012237 * i_5) * -354697449;
                        this.anInt9854 = 0 * 1507503163;
                    } else {
                        if (-354697449 * this.anInt9853 * -834443097 < i_3) {
                            return;
                        }

                        i_6 = (-354697449 * this.anInt9853 * -834443097 - i_2) / i_5;
                        if (i_6 < 1507503163 * this.anInt9854 * -485012237) {
                            this.anInt9853 = (this.anInt9853 * -834443097 - -834443097 * i_5 * i_6) * -354697449;
                            this.anInt9854 = (this.anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        this.anInt9853 = (this.anInt9853 * -834443097 - -834443097 * i_5 * this.anInt9854 * -485012237 * 1507503163) * -354697449;
                        this.anInt9854 = 0 * 1507503163;
                    }
                }
            }

            if (-177305111 * this.anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                if (-354697449 * this.anInt9853 * -834443097 < 0) {
                    this.anInt9853 = 834443097 * -354697449;
                    this.method15354();
                    this.remove();
                }
            } else if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
                this.anInt9853 = -834443097 * i_4 * -354697449;
                this.method15354();
                this.remove();
            }
        }

    }

    public final synchronized int method15315(int i_1) {
        return this.anInt9846 == Integer.MIN_VALUE ? 0 : this.anInt9846;
    }

    public final synchronized int method15316(int i_1) {
        return this.anInt9847 < 0 ? -1 : this.anInt9847;
    }

    public final synchronized void method15317(int i_1) {
        int i_3 = ((Node_Sub26_Sub1) this.aNode_Sub26_7601).method15223() << 8;
        if (i_1 < -1) {
            i_1 = -1;
        }

        if (i_1 > i_3) {
            i_1 = i_3;
        }

        this.anInt9853 = i_1;
    }

    public final synchronized boolean method15319() {
        return this.anInt9853 < 0 || this.anInt9853 >= ((Node_Sub26_Sub1) this.aNode_Sub26_7601).method15223() << 8;
    }

    final Node_Sub15 method12235() {
        return null;
    }

    public final synchronized void method15320(int i_1, int i_2) {
        this.method15321(i_1, i_2, this.method15316(-879511518), 43881265);
    }

    public final synchronized void method15321(int i_1, int i_2, int i_3, int i_4) {
        if (i_1 == 0) {
            this.method15364(i_2, i_3);
        } else {
            int i_5 = HostNameIdentifier.method488(i_2, i_3, -1863158316);
            int i_6 = Node_Sub20_Sub24.method15390(i_2, i_3, 768902996);
            if (i_5 == this.anInt9845 && i_6 == this.anInt9850) {
                this.anInt9858 = 0;
            } else {
                int i_7 = i_2 - this.anInt9848;
                if (this.anInt9848 - i_2 > i_7) {
                    i_7 = this.anInt9848 - i_2;
                }

                if (i_5 - this.anInt9845 > i_7) {
                    i_7 = i_5 - this.anInt9845;
                }

                if (this.anInt9845 - i_5 > i_7) {
                    i_7 = this.anInt9845 - i_5;
                }

                if (i_6 - this.anInt9850 > i_7) {
                    i_7 = i_6 - this.anInt9850;
                }

                if (this.anInt9850 - i_6 > i_7) {
                    i_7 = this.anInt9850 - i_6;
                }

                if (i_1 > i_7) {
                    i_1 = i_7;
                }

                this.anInt9858 = i_1;
                this.anInt9846 = i_2;
                this.anInt9847 = i_3;
                this.anInt9849 = (i_2 - this.anInt9848) / i_1;
                this.anInt9852 = (i_5 - this.anInt9845) / i_1;
                this.anInt9851 = (i_6 - this.anInt9850) / i_1;
            }
        }

    }

    public final synchronized void method15322(int i_1, byte b_2) {
        if (i_1 == 0) {
            this.method15326();
            this.remove();
        } else if (this.anInt9845 == 0 && this.anInt9850 == 0) {
            this.anInt9858 = 0;
            this.anInt9846 = 0;
            this.anInt9848 = 0;
            this.remove();
        } else {
            int i_3 = -this.anInt9848;
            if (this.anInt9848 > i_3) {
                i_3 = this.anInt9848;
            }

            if (-this.anInt9845 > i_3) {
                i_3 = -this.anInt9845;
            }

            if (this.anInt9845 > i_3) {
                i_3 = this.anInt9845;
            }

            if (-this.anInt9850 > i_3) {
                i_3 = -this.anInt9850;
            }

            if (this.anInt9850 > i_3) {
                i_3 = this.anInt9850;
            }

            if (i_1 > i_3) {
                i_1 = i_3;
            }

            this.anInt9858 = i_1;
            this.anInt9846 = Integer.MIN_VALUE;
            this.anInt9849 = -this.anInt9848 / i_1;
            this.anInt9852 = -this.anInt9845 / i_1;
            this.anInt9851 = -this.anInt9850 / i_1;
        }

    }

    final int method12238() {
        return -1302038045 * this.anInt9846 * -298675253 == 0 && this.anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    public final synchronized int method15323(int i_1) {
        return this.anInt9855 < 0 ? -this.anInt9855 : this.anInt9855;
    }

    final int method12228() {
        return this.anInt9846 == 0 && this.anInt9858 == 0 ? 0 : 1;
    }

    final boolean method15324(byte b_1) {
        int i_2 = this.anInt9846;
        int i_3;
        int i_4;
        if (i_2 == Integer.MIN_VALUE) {
            i_4 = 0;
            i_3 = 0;
            i_2 = 0;
        } else {
            i_3 = HostNameIdentifier.method488(i_2, this.anInt9847, -1833618815);
            i_4 = Node_Sub20_Sub24.method15390(i_2, this.anInt9847, 1570261179);
        }

        if (i_2 == this.anInt9848 && i_3 == this.anInt9845 && i_4 == this.anInt9850) {
            if (this.anInt9846 == Integer.MIN_VALUE) {
                this.anInt9846 = 0;
                this.anInt9850 = 0;
                this.anInt9845 = 0;
                this.anInt9848 = 0;
                this.remove();
                return true;
            } else {
                this.method15332((byte) -51);
                return false;
            }
        } else {
            if (this.anInt9848 < i_2) {
                this.anInt9849 = 1;
                this.anInt9858 = i_2 - this.anInt9848;
            } else if (this.anInt9848 > i_2) {
                this.anInt9849 = -1;
                this.anInt9858 = this.anInt9848 - i_2;
            } else {
                this.anInt9849 = 0;
            }

            if (this.anInt9845 < i_3) {
                this.anInt9852 = 1;
                if (this.anInt9858 == 0 || this.anInt9858 > i_3 - this.anInt9845) {
                    this.anInt9858 = i_3 - this.anInt9845;
                }
            } else if (this.anInt9845 > i_3) {
                this.anInt9852 = -1;
                if (this.anInt9858 == 0 || this.anInt9858 > this.anInt9845 - i_3) {
                    this.anInt9858 = this.anInt9845 - i_3;
                }
            } else {
                this.anInt9852 = 0;
            }

            if (this.anInt9850 < i_4) {
                this.anInt9851 = 1;
                if (this.anInt9858 == 0 || this.anInt9858 > i_4 - this.anInt9850) {
                    this.anInt9858 = i_4 - this.anInt9850;
                }
            } else if (this.anInt9850 > i_4) {
                this.anInt9851 = -1;
                if (this.anInt9858 == 0 || this.anInt9858 > this.anInt9850 - i_4) {
                    this.anInt9858 = this.anInt9850 - i_4;
                }
            } else {
                this.anInt9851 = 0;
            }

            return false;
        }
    }

    public final synchronized void method12231(int i_1) {
        if (this.anInt9858 > 0) {
            if (i_1 >= this.anInt9858) {
                if (this.anInt9846 == Integer.MIN_VALUE) {
                    this.anInt9846 = 0;
                    this.anInt9850 = 0;
                    this.anInt9845 = 0;
                    this.anInt9848 = 0;
                    this.remove();
                    i_1 = this.anInt9858;
                }

                this.anInt9858 = 0;
                this.method15332((byte) -60);
            } else {
                this.anInt9848 += i_1 * this.anInt9849;
                this.anInt9845 += this.anInt9852 * i_1;
                this.anInt9850 += this.anInt9851 * i_1;
                this.anInt9858 -= i_1;
            }
        }

        int i_2 = this.anInt9844 << 8;
        int i_3 = this.anInt9856 << 8;
        int i_4 = ((Node_Sub26_Sub1) this.aNode_Sub26_7601).method15223() << 8;
        int i_5 = i_3 - i_2;
        if (i_5 <= 0) {
            this.anInt9854 = 0;
        }

        if (this.anInt9853 < 0) {
            if (this.anInt9855 <= 0) {
                this.method15354();
                this.remove();
                return;
            }

            this.anInt9853 = 0;
        }

        if (this.anInt9853 >= i_4) {
            if (this.anInt9855 >= 0) {
                this.method15354();
                this.remove();
                return;
            }

            this.anInt9853 = i_4 - 1;
        }

        this.anInt9853 += this.anInt9855 * i_1;
        if (this.anInt9854 < 0) {
            if (this.aBool9857) {
                if (this.anInt9855 < 0) {
                    if (this.anInt9853 >= i_2) {
                        return;
                    }

                    this.anInt9853 = i_2 + i_2 - 1 - this.anInt9853;
                    this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
                }

                while (this.anInt9853 >= i_3) {
                    this.anInt9853 = i_3 + i_3 - 1 - this.anInt9853;
                    this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
                    if (this.anInt9853 >= i_2) {
                        break;
                    }

                    this.anInt9853 = i_2 + i_2 - 1 - this.anInt9853;
                    this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
                }
            } else if (this.anInt9855 < 0) {
                if (this.anInt9853 < i_2) {
                    this.anInt9853 = i_3 - 1 - (i_3 - 1 - this.anInt9853) % i_5;
                }
            } else if (this.anInt9853 >= i_3) {
                this.anInt9853 = i_2 + (this.anInt9853 - i_2) % i_5;
            }
        } else {
            if (this.anInt9854 > 0) {
                if (this.aBool9857) {
                    label123:
                    {
                        if (this.anInt9855 < 0) {
                            if (this.anInt9853 >= i_2) {
                                return;
                            }

                            this.anInt9853 = i_2 + i_2 - 1 - this.anInt9853;
                            this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
                            if (--this.anInt9854 == 0) {
                                break label123;
                            }
                        }

                        do {
                            if (this.anInt9853 < i_3) {
                                return;
                            }

                            this.anInt9853 = i_3 + i_3 - 1 - this.anInt9853;
                            this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
                            if (--this.anInt9854 == 0) {
                                break;
                            }

                            if (this.anInt9853 >= i_2) {
                                return;
                            }

                            this.anInt9853 = i_2 + i_2 - 1 - this.anInt9853;
                            this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
                        } while (--this.anInt9854 != 0);
                    }
                } else {
                    int i_6;
                    if (this.anInt9855 < 0) {
                        if (this.anInt9853 >= i_2) {
                            return;
                        }

                        i_6 = (i_3 - 1 - this.anInt9853) / i_5;
                        if (i_6 < this.anInt9854) {
                            this.anInt9853 += i_5 * i_6;
                            this.anInt9854 -= i_6;
                            return;
                        }

                        this.anInt9853 += this.anInt9854 * i_5;
                        this.anInt9854 = 0;
                    } else {
                        if (this.anInt9853 < i_3) {
                            return;
                        }

                        i_6 = (this.anInt9853 - i_2) / i_5;
                        if (i_6 < this.anInt9854) {
                            this.anInt9853 -= i_5 * i_6;
                            this.anInt9854 -= i_6;
                            return;
                        }

                        this.anInt9853 -= i_5 * this.anInt9854;
                        this.anInt9854 = 0;
                    }
                }
            }

            if (this.anInt9855 < 0) {
                if (this.anInt9853 < 0) {
                    this.anInt9853 = -1;
                    this.method15354();
                    this.remove();
                }
            } else if (this.anInt9853 >= i_4) {
                this.anInt9853 = i_4;
                this.method15354();
                this.remove();
            }
        }

    }

    final Node_Sub15 method12226() {
        return null;
    }

    public final synchronized void method15325(int i_1) {
        this.anInt9854 = i_1;
    }

    final synchronized void method15326() {
        this.method15364(0, this.method15316(-934939985));
    }

    final Node_Sub15 method12232() {
        return null;
    }

    public final synchronized void method12243(int i_1) {
        if (1008956447 * this.anInt9858 * 1156515807 > 0) {
            if (i_1 >= 1008956447 * this.anInt9858 * 1156515807) {
                if (this.anInt9846 * -298675253 * -1302038045 == Integer.MIN_VALUE) {
                    this.anInt9846 = 0 * -1302038045;
                    this.anInt9850 = 0 * 2085185173;
                    this.anInt9845 = 0 * 1784001117;
                    this.anInt9848 = 0 * -217803069 * 3 * -1431655765;
                    this.remove();
                    i_1 = this.anInt9858 * 1156515807 * 1008956447;
                }

                this.anInt9858 = 0 * 1008956447;
                this.method15332((byte) -8);
            } else {
                this.anInt9848 = (this.anInt9848 * 3 * -1431655765 * 809781739 + 809781739 * i_1 * 1670226395 * this.anInt9849 * -1756138925) * -217803069 * 3 * -1431655765;
                this.anInt9845 = (this.anInt9845 * 1672655349 + 1672655349 * this.anInt9852 * -661281463 * 1923898617 * i_1) * 1784001117;
                this.anInt9850 = (this.anInt9850 * 1339372733 + 1339372733 * this.anInt9851 * -1589776061 * 241181547 * i_1) * 2085185173;
                this.anInt9858 = (this.anInt9858 * 1156515807 - i_1 * 1156515807) * 1008956447;
            }
        }

        int i_2 = this.anInt9844 * 900940833 * -99794975 << 8;
        int i_3 = this.anInt9856 * -628161865 * -1048610041 << 8;
        int i_4 = ((Node_Sub26_Sub1) this.aNode_Sub26_7601).method15223() << 8;
        int i_5 = i_3 - i_2;
        if (i_5 <= 0) {
            this.anInt9854 = 0 * 1507503163;
        }

        if (this.anInt9853 * -834443097 * -354697449 < 0) {
            if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
                this.method15354();
                this.remove();
                return;
            }

            this.anInt9853 = 0 * -354697449;
        }

        if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
            if (-177305111 * this.anInt9855 * 1927994969 * -177305111 * 1927994969 >= 0) {
                this.method15354();
                this.remove();
                return;
            }

            this.anInt9853 = (i_4 - 1) * -834443097 * -354697449;
        }

        this.anInt9853 = (this.anInt9853 * -834443097 + -834443097 * -177305111 * this.anInt9855 * 1927994969 * -177305111 * 1927994969 * i_1) * -354697449;
        if (1507503163 * this.anInt9854 * -485012237 < 0) {
            if (this.aBool9857) {
                if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    if (this.anInt9853 * -834443097 * -354697449 >= i_2) {
                        return;
                    }

                    this.anInt9853 = (i_2 + i_2 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
                    this.anInt9855 = -(1 * this.anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }

                while (-354697449 * this.anInt9853 * -834443097 >= i_3) {
                    this.anInt9853 = -834443097 * (i_3 + i_3 - 1 - -354697449 * this.anInt9853 * -834443097) * -354697449;
                    this.anInt9855 = -(1 * this.anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    if (this.anInt9853 * -834443097 * -354697449 >= i_2) {
                        break;
                    }

                    this.anInt9853 = (i_2 + i_2 - 1 - -354697449 * this.anInt9853 * -834443097) * -834443097 * -354697449;
                    this.anInt9855 = -(1 * this.anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }
            } else if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                if (-354697449 * this.anInt9853 * -834443097 < i_2) {
                    this.anInt9853 = -834443097 * (i_3 - 1 - (i_3 - 1 - this.anInt9853 * -834443097 * -354697449) % i_5) * -354697449;
                }
            } else if (this.anInt9853 * -834443097 * -354697449 >= i_3) {
                this.anInt9853 = -834443097 * (i_2 + (-354697449 * this.anInt9853 * -834443097 - i_2) % i_5) * -354697449;
            }
        } else {
            if (this.anInt9854 * -485012237 * 1507503163 > 0) {
                if (this.aBool9857) {
                    label123:
                    {
                        int i_10002;
                        if (-177305111 * this.anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                            if (this.anInt9853 * -834443097 * -354697449 >= i_2) {
                                return;
                            }

                            this.anInt9853 = (i_2 + i_2 - 1 - -354697449 * this.anInt9853 * -834443097) * -834443097 * -354697449;
                            this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
                            i_10002 = this.anInt9854 * -485012237 - -485012237;
                            this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break label123;
                            }
                        }

                        do {
                            if (-354697449 * this.anInt9853 * -834443097 < i_3) {
                                return;
                            }

                            this.anInt9853 = (i_3 + i_3 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
                            this.anInt9855 = -(1 * this.anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = this.anInt9854 * -485012237 - -485012237;
                            this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break;
                            }

                            if (-354697449 * this.anInt9853 * -834443097 >= i_2) {
                                return;
                            }

                            this.anInt9853 = -834443097 * (i_2 + i_2 - 1 - this.anInt9853 * -834443097 * -354697449) * -354697449;
                            this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
                            i_10002 = this.anInt9854 * -485012237 - -485012237;
                            this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
                        } while (i_10002 * 1507503163 != 0);
                    }
                } else {
                    int i_6;
                    if (-177305111 * this.anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                        if (-354697449 * this.anInt9853 * -834443097 >= i_2) {
                            return;
                        }

                        i_6 = (i_3 - 1 - -354697449 * this.anInt9853 * -834443097) / i_5;
                        if (i_6 < this.anInt9854 * -485012237 * 1507503163) {
                            this.anInt9853 = (this.anInt9853 * -834443097 + -834443097 * i_5 * i_6) * -354697449;
                            this.anInt9854 = (this.anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        this.anInt9853 = (this.anInt9853 * -834443097 + -834443097 * 1507503163 * this.anInt9854 * -485012237 * i_5) * -354697449;
                        this.anInt9854 = 0 * 1507503163;
                    } else {
                        if (-354697449 * this.anInt9853 * -834443097 < i_3) {
                            return;
                        }

                        i_6 = (-354697449 * this.anInt9853 * -834443097 - i_2) / i_5;
                        if (i_6 < 1507503163 * this.anInt9854 * -485012237) {
                            this.anInt9853 = (this.anInt9853 * -834443097 - -834443097 * i_5 * i_6) * -354697449;
                            this.anInt9854 = (this.anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        this.anInt9853 = (this.anInt9853 * -834443097 - -834443097 * i_5 * this.anInt9854 * -485012237 * 1507503163) * -354697449;
                        this.anInt9854 = 0 * 1507503163;
                    }
                }
            }

            if (-177305111 * this.anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                if (-354697449 * this.anInt9853 * -834443097 < 0) {
                    this.anInt9853 = 834443097 * -354697449;
                    this.method15354();
                    this.remove();
                }
            } else if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
                this.anInt9853 = -834443097 * i_4 * -354697449;
                this.method15354();
                this.remove();
            }
        }

    }

    final Node_Sub15 method12229() {
        return null;
    }

    final int method12224() {
        return -1302038045 * this.anInt9846 * -298675253 == 0 && this.anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    final int method12244() {
        return -1302038045 * this.anInt9846 * -298675253 == 0 && this.anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    public abstract void method12240(int[] var1, int var2, int var3);

    public abstract void method12242(int[] var1, int var2, int var3);

    final void method15332(byte b_1) {
        this.anInt9848 = this.anInt9846;
        this.anInt9845 = HostNameIdentifier.method488(this.anInt9846, this.anInt9847, -1884211393);
        this.anInt9850 = Node_Sub20_Sub24.method15390(this.anInt9846, this.anInt9847, 1768966833);
    }

    final Node_Sub15 method12233() {
        return null;
    }

    final int method12225() {
        int i_1 = this.anInt9848 * 3 >> 6;
        i_1 = (i_1 ^ i_1 >> 31) + (i_1 >>> 31);
        if (this.anInt9854 == 0) {
            i_1 -= i_1 * this.anInt9853 / (((Node_Sub26_Sub1) this.aNode_Sub26_7601).method15223() << 8);
        } else if (this.anInt9854 >= 0) {
            i_1 -= i_1 * this.anInt9844 / ((Node_Sub26_Sub1) this.aNode_Sub26_7601).method15223();
        }

        return i_1 > 255 ? 255 : i_1;
    }

    final Node_Sub15 method12236() {
        return null;
    }

    public final synchronized void method15340(int i_1, int i_2) {
        this.method15364(this.method15315(-1209647357), i_1);
    }

    final int method12227() {
        return -1302038045 * this.anInt9846 * -298675253 == 0 && this.anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    public abstract void method12230(int[] var1, int var2, int var3);

    final Node_Sub15 method12239() {
        return null;
    }

    final void method15354() {
        if (this.anInt9858 != 0) {
            if (this.anInt9846 == Integer.MIN_VALUE) {
                this.anInt9846 = 0;
            }

            this.anInt9858 = 0;
            this.method15332((byte) 11);
        }

    }

    final synchronized void method15364(int i_1, int i_2) {
        this.anInt9846 = i_1;
        this.anInt9847 = i_2;
        this.anInt9858 = 0;
        this.method15332((byte) -91);
    }

}
