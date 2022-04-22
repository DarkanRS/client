package com.jagex;

public abstract class Sound_Node_1 extends AbstractSoundNode_0 {

    static int anInt9859;
    int anInt9844;
    int duration;
    boolean aBoolNormFalse9857;
    int anInt9855;
    int anInt9848;
    int anInt9845;
    int anInt9850;
    int anInt9858;
    int anInt9854;
    int volume;
    int nodeIndex;
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
                if (volume * -298675253 * -1302038045 == Integer.MIN_VALUE) {
                    volume = 0;
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
        int i_3 = duration * -628161865 * -1048610041 << 8;
        int i_4 = ((NodeWithAudioBuffer26_Sub1) nodeWithAudioBuffer26).getAudioBufferLength() << 8;
        int i_5 = i_3 - i_2;
        if (i_5 <= 0) {
            anInt9854 = 0;
        }

        if (nodeIndex * -834443097 * -354697449 < 0) {
            if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
                method15354();
                unlink();
                return;
            }

            nodeIndex = 0;
        }

        if (nodeIndex * -834443097 * -354697449 >= i_4) {
            if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 >= 0) {
                method15354();
                unlink();
                return;
            }

            nodeIndex = (i_4 - 1) * -834443097 * -354697449;
        }

        nodeIndex = (nodeIndex * -834443097 + -834443097 * -177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 * i_11) * -354697449;
        if (1507503163 * anInt9854 * -485012237 < 0) {
            if (aBoolNormFalse9857) {
                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    if (nodeIndex * -834443097 * -354697449 >= i_2) {
                        return;
                    }

                    nodeIndex = (i_2 + i_2 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }

                while (-354697449 * nodeIndex * -834443097 >= i_3) {
                    nodeIndex = -834443097 * (i_3 + i_3 - 1 - -354697449 * nodeIndex * -834443097) * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    if (nodeIndex * -834443097 * -354697449 >= i_2) {
                        break;
                    }

                    nodeIndex = (i_2 + i_2 - 1 - -354697449 * nodeIndex * -834443097) * -834443097 * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }
            } else if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                if (-354697449 * nodeIndex * -834443097 < i_2) {
                    nodeIndex = -834443097 * (i_3 - 1 - (i_3 - 1 - nodeIndex * -834443097 * -354697449) % i_5) * -354697449;
                }
            } else if (nodeIndex * -834443097 * -354697449 >= i_3) {
                nodeIndex = -834443097 * (i_2 + (-354697449 * nodeIndex * -834443097 - i_2) % i_5) * -354697449;
            }
        } else {
            if (anInt9854 * -485012237 * 1507503163 > 0) {
                if (aBoolNormFalse9857) {
                    label123:
                    {
                        int i_10002;
                        if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                            if (nodeIndex * -834443097 * -354697449 >= i_2) {
                                return;
                            }

                            nodeIndex = (i_2 + i_2 - 1 - -354697449 * nodeIndex * -834443097) * -834443097 * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break label123;
                            }
                        }

                        do {
                            if (-354697449 * nodeIndex * -834443097 < i_3) {
                                return;
                            }

                            nodeIndex = (i_3 + i_3 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break;
                            }

                            if (-354697449 * nodeIndex * -834443097 >= i_2) {
                                return;
                            }

                            nodeIndex = -834443097 * (i_2 + i_2 - 1 - nodeIndex * -834443097 * -354697449) * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                        } while (i_10002 * 1507503163 != 0);
                    }
                } else {
                    int i_6;
                    if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                        if (-354697449 * nodeIndex * -834443097 >= i_2) {
                            return;
                        }

                        i_6 = (i_3 - 1 - -354697449 * nodeIndex * -834443097) / i_5;
                        if (i_6 < anInt9854 * -485012237 * 1507503163) {
                            nodeIndex = (nodeIndex * -834443097 + -834443097 * i_5 * i_6) * -354697449;
                            anInt9854 = (anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        nodeIndex = (nodeIndex * -834443097 + -834443097 * 1507503163 * anInt9854 * -485012237 * i_5) * -354697449;
                    } else {
                        if (-354697449 * nodeIndex * -834443097 < i_3) {
                            return;
                        }

                        i_6 = (-354697449 * nodeIndex * -834443097 - i_2) / i_5;
                        if (i_6 < 1507503163 * anInt9854 * -485012237) {
                            nodeIndex = (nodeIndex * -834443097 - -834443097 * i_5 * i_6) * -354697449;
                            anInt9854 = (anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        nodeIndex = (nodeIndex * -834443097 - -834443097 * i_5 * anInt9854 * -485012237 * 1507503163) * -354697449;
                    }
                    anInt9854 = 0;
                }
            }

            if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                if (-354697449 * nodeIndex * -834443097 < 0) {
                    nodeIndex = 834443097 * -354697449;
                    method15354();
                    unlink();
                }
            } else if (nodeIndex * -834443097 * -354697449 >= i_4) {
                nodeIndex = -834443097 * i_4 * -354697449;
                method15354();
                unlink();
            }
        }

    }

    public synchronized int method15315() {
        return volume == Integer.MIN_VALUE ? 0 : volume;
    }

    public synchronized int method15316() {
        return anInt9847 < 0 ? -1 : anInt9847;
    }

    public synchronized void method15317(int i_1) {
        int i_11 = i_1;
        int i_3 = ((NodeWithAudioBuffer26_Sub1) nodeWithAudioBuffer26).getAudioBufferLength() << 8;
        if (i_11 < -1) {
            i_11 = -1;
        }

        if (i_11 > i_3) {
            i_11 = i_3;
        }

        nodeIndex = i_11;
    }

    public synchronized boolean method15319() {
        return nodeIndex < 0 || nodeIndex >= ((NodeWithAudioBuffer26_Sub1) nodeWithAudioBuffer26).getAudioBufferLength() << 8;
    }

    @Override
	AbstractSoundNode_0 method12235() {
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
            int i_6 = MaterialPropTexture.method15390(i_2, i_3);
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
                volume = i_2;
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
            volume = 0;
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
            volume = Integer.MIN_VALUE;
            anInt9849 = -anInt9848 / i_11;
            anInt9852 = -anInt9845 / i_11;
            anInt9851 = -anInt9850 / i_11;
        }

    }

    @Override
    int method12238() {
        return -1302038045 * volume * -298675253 == 0 && anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    public synchronized int method15323() {
        return anInt9855 < 0 ? -anInt9855 : anInt9855;
    }

    @Override
    int method12228() {
        return volume == 0 && anInt9858 == 0 ? 0 : 1;
    }

    boolean method15324() {
        int i_2 = volume;
        int i_3;
        int i_4;
        if (i_2 == Integer.MIN_VALUE) {
            i_4 = 0;
            i_3 = 0;
            i_2 = 0;
        } else {
            i_3 = HostNameIdentifier.method488(i_2, anInt9847);
            i_4 = MaterialPropTexture.method15390(i_2, anInt9847);
        }

        if (i_2 == anInt9848 && i_3 == anInt9845 && i_4 == anInt9850) {
            if (volume == Integer.MIN_VALUE) {
                volume = 0;
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
                if (volume == Integer.MIN_VALUE) {
                    volume = 0;
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
        int i_3 = duration << 8;
        int i_4 = ((NodeWithAudioBuffer26_Sub1) nodeWithAudioBuffer26).getAudioBufferLength() << 8;
        int i_5 = i_3 - i_2;
        if (i_5 <= 0) {
            anInt9854 = 0;
        }

        if (nodeIndex < 0) {
            if (anInt9855 <= 0) {
                method15354();
                unlink();
                return;
            }

            nodeIndex = 0;
        }

        if (nodeIndex >= i_4) {
            if (anInt9855 >= 0) {
                method15354();
                unlink();
                return;
            }

            nodeIndex = i_4 - 1;
        }

        nodeIndex += anInt9855 * i_11;
        if (anInt9854 < 0) {
            if (aBoolNormFalse9857) {
                if (anInt9855 < 0) {
                    if (nodeIndex >= i_2) {
                        return;
                    }

                    nodeIndex = i_2 + i_2 - 1 - nodeIndex;
                    anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                }

                while (nodeIndex >= i_3) {
                    nodeIndex = i_3 + i_3 - 1 - nodeIndex;
                    anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                    if (nodeIndex >= i_2) {
                        break;
                    }

                    nodeIndex = i_2 + i_2 - 1 - nodeIndex;
                    anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                }
            } else if (anInt9855 < 0) {
                if (nodeIndex < i_2) {
                    nodeIndex = i_3 - 1 - (i_3 - 1 - nodeIndex) % i_5;
                }
            } else if (nodeIndex >= i_3) {
                nodeIndex = i_2 + (nodeIndex - i_2) % i_5;
            }
        } else {
            if (anInt9854 > 0) {
                if (aBoolNormFalse9857) {
                    label123:
                    {
                        if (anInt9855 < 0) {
                            if (nodeIndex >= i_2) {
                                return;
                            }

                            nodeIndex = i_2 + i_2 - 1 - nodeIndex;
                            anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                            if (--anInt9854 == 0) {
                                break label123;
                            }
                        }

                        do {
                            if (nodeIndex < i_3) {
                                return;
                            }

                            nodeIndex = i_3 + i_3 - 1 - nodeIndex;
                            anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                            if (--anInt9854 == 0) {
                                break;
                            }

                            if (nodeIndex >= i_2) {
                                return;
                            }

                            nodeIndex = i_2 + i_2 - 1 - nodeIndex;
                            anInt9855 = -(anInt9855 * 1927994969) * -177305111;
                        } while (--anInt9854 != 0);
                    }
                } else {
                    int i_6;
                    if (anInt9855 < 0) {
                        if (nodeIndex >= i_2) {
                            return;
                        }

                        i_6 = (i_3 - 1 - nodeIndex) / i_5;
                        if (i_6 < anInt9854) {
                            nodeIndex += i_5 * i_6;
                            anInt9854 -= i_6;
                            return;
                        }

                        nodeIndex += anInt9854 * i_5;
                    } else {
                        if (nodeIndex < i_3) {
                            return;
                        }

                        i_6 = (nodeIndex - i_2) / i_5;
                        if (i_6 < anInt9854) {
                            nodeIndex -= i_5 * i_6;
                            anInt9854 -= i_6;
                            return;
                        }

                        nodeIndex -= i_5 * anInt9854;
                    }
                    anInt9854 = 0;
                }
            }

            if (anInt9855 < 0) {
                if (nodeIndex < 0) {
                    nodeIndex = -1;
                    method15354();
                    unlink();
                }
            } else if (nodeIndex >= i_4) {
                nodeIndex = i_4;
                method15354();
                unlink();
            }
        }

    }

    @Override
	AbstractSoundNode_0 method12226() {
        return null;
    }

    public synchronized void method15325(int i_1) {
        anInt9854 = i_1;
    }

    synchronized void method15326() {
        method15364(0, method15316());
    }

    @Override
	AbstractSoundNode_0 method12232() {
        return null;
    }

    @Override
    public synchronized void method12243(int i_1) {
        int i_11 = i_1;
        if (1008956447 * anInt9858 * 1156515807 > 0) {
            if (i_11 >= 1008956447 * anInt9858 * 1156515807) {
                if (volume * -298675253 * -1302038045 == Integer.MIN_VALUE) {
                    volume = 0;
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
        int i_3 = duration * -628161865 * -1048610041 << 8;
        int i_4 = ((NodeWithAudioBuffer26_Sub1) nodeWithAudioBuffer26).getAudioBufferLength() << 8;
        int i_5 = i_3 - i_2;
        if (i_5 <= 0) {
            anInt9854 = 0;
        }

        if (nodeIndex * -834443097 * -354697449 < 0) {
            if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
                method15354();
                unlink();
                return;
            }

            nodeIndex = 0;
        }

        if (nodeIndex * -834443097 * -354697449 >= i_4) {
            if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 >= 0) {
                method15354();
                unlink();
                return;
            }

            nodeIndex = (i_4 - 1) * -834443097 * -354697449;
        }

        nodeIndex = (nodeIndex * -834443097 + -834443097 * -177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 * i_11) * -354697449;
        if (1507503163 * anInt9854 * -485012237 < 0) {
            if (aBoolNormFalse9857) {
                if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                    if (nodeIndex * -834443097 * -354697449 >= i_2) {
                        return;
                    }

                    nodeIndex = (i_2 + i_2 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }

                while (-354697449 * nodeIndex * -834443097 >= i_3) {
                    nodeIndex = -834443097 * (i_3 + i_3 - 1 - -354697449 * nodeIndex * -834443097) * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                    if (nodeIndex * -834443097 * -354697449 >= i_2) {
                        break;
                    }

                    nodeIndex = (i_2 + i_2 - 1 - -354697449 * nodeIndex * -834443097) * -834443097 * -354697449;
                    anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                }
            } else if (anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
                if (-354697449 * nodeIndex * -834443097 < i_2) {
                    nodeIndex = -834443097 * (i_3 - 1 - (i_3 - 1 - nodeIndex * -834443097 * -354697449) % i_5) * -354697449;
                }
            } else if (nodeIndex * -834443097 * -354697449 >= i_3) {
                nodeIndex = -834443097 * (i_2 + (-354697449 * nodeIndex * -834443097 - i_2) % i_5) * -354697449;
            }
        } else {
            if (anInt9854 * -485012237 * 1507503163 > 0) {
                if (aBoolNormFalse9857) {
                    label123:
                    {
                        int i_10002;
                        if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                            if (nodeIndex * -834443097 * -354697449 >= i_2) {
                                return;
                            }

                            nodeIndex = (i_2 + i_2 - 1 - -354697449 * nodeIndex * -834443097) * -834443097 * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break label123;
                            }
                        }

                        do {
                            if (-354697449 * nodeIndex * -834443097 < i_3) {
                                return;
                            }

                            nodeIndex = (i_3 + i_3 - 1 - nodeIndex * -834443097 * -354697449) * -834443097 * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                            if (i_10002 * 1507503163 == 0) {
                                break;
                            }

                            if (-354697449 * nodeIndex * -834443097 >= i_2) {
                                return;
                            }

                            nodeIndex = -834443097 * (i_2 + i_2 - 1 - nodeIndex * -834443097 * -354697449) * -354697449;
                            anInt9855 = -(anInt9855 * 1927994969 * -177305111 * 1927994969) * -177305111 * 1927994969 * -177305111;
                            i_10002 = anInt9854 * -485012237 - -485012237;
                            anInt9854 = (anInt9854 * -485012237 - -485012237) * 1507503163;
                        } while (i_10002 * 1507503163 != 0);
                    }
                } else {
                    int i_6;
                    if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                        if (-354697449 * nodeIndex * -834443097 >= i_2) {
                            return;
                        }

                        i_6 = (i_3 - 1 - -354697449 * nodeIndex * -834443097) / i_5;
                        if (i_6 < anInt9854 * -485012237 * 1507503163) {
                            nodeIndex = (nodeIndex * -834443097 + -834443097 * i_5 * i_6) * -354697449;
                            anInt9854 = (anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        nodeIndex = (nodeIndex * -834443097 + -834443097 * 1507503163 * anInt9854 * -485012237 * i_5) * -354697449;
                    } else {
                        if (-354697449 * nodeIndex * -834443097 < i_3) {
                            return;
                        }

                        i_6 = (-354697449 * nodeIndex * -834443097 - i_2) / i_5;
                        if (i_6 < 1507503163 * anInt9854 * -485012237) {
                            nodeIndex = (nodeIndex * -834443097 - -834443097 * i_5 * i_6) * -354697449;
                            anInt9854 = (anInt9854 * -485012237 - i_6 * -485012237) * 1507503163;
                            return;
                        }

                        nodeIndex = (nodeIndex * -834443097 - -834443097 * i_5 * anInt9854 * -485012237 * 1507503163) * -354697449;
                    }
                    anInt9854 = 0;
                }
            }

            if (-177305111 * anInt9855 * 1927994969 * -177305111 * 1927994969 < 0) {
                if (-354697449 * nodeIndex * -834443097 < 0) {
                    nodeIndex = 834443097 * -354697449;
                    method15354();
                    unlink();
                }
            } else if (nodeIndex * -834443097 * -354697449 >= i_4) {
                nodeIndex = -834443097 * i_4 * -354697449;
                method15354();
                unlink();
            }
        }

    }

    @Override
	AbstractSoundNode_0 method12229() {
        return null;
    }

    @Override
    int method12224() {
        return -1302038045 * volume * -298675253 == 0 && anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    @Override
    int method12244() {
        return -1302038045 * volume * -298675253 == 0 && anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    @Override
    public abstract void method12240(int[] var1, int var2, int var3);

    @Override
    public abstract void method12242(int[] var1, int var2, int var3);

    void method15332() {
        anInt9848 = volume;
        anInt9845 = HostNameIdentifier.method488(volume, anInt9847);
        anInt9850 = MaterialPropTexture.method15390(volume, anInt9847);
    }

    @Override
	AbstractSoundNode_0 method12233() {
        return null;
    }

    @Override
    int method12225() {
        int i_1 = anInt9848 * 3 >> 6;
        i_1 = (i_1 ^ i_1 >> 31) + (i_1 >>> 31);
        if (anInt9854 == 0) {
            i_1 -= i_1 * nodeIndex / (((NodeWithAudioBuffer26_Sub1) nodeWithAudioBuffer26).getAudioBufferLength() << 8);
        } else if (anInt9854 >= 0) {
            i_1 -= i_1 * anInt9844 / ((NodeWithAudioBuffer26_Sub1) nodeWithAudioBuffer26).getAudioBufferLength();
        }

        return Math.min(255, i_1);
    }

    @Override
	AbstractSoundNode_0 method12236() {
        return null;
    }

    public synchronized void method15340(int i_1) {
        method15364(method15315(), i_1);
    }

    @Override
    int method12227() {
        return -1302038045 * volume * -298675253 == 0 && anInt9858 * 1156515807 * 1008956447 == 0 ? 0 : 1;
    }

    @Override
    public abstract void method12230(int[] var1, int var2, int var3);

    @Override
	AbstractSoundNode_0 method12239() {
        return null;
    }

    void method15354() {
        if (anInt9858 != 0) {
            if (volume == Integer.MIN_VALUE) {
                volume = 0;
            }

            anInt9858 = 0;
            method15332();
        }

    }

    synchronized void method15364(int i_1, int i_2) {
        volume = i_1;
        anInt9847 = i_2;
        anInt9858 = 0;
        method15332();
    }

}
