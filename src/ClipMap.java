import java.util.ArrayList;

public class ClipMap {

    public int[][] map;
    public int offsetX;
    public int offsetY;
    int sizeX;
    int sizeY;

    static int anInt3968;
    
    public static ArrayList<ClipFlag> getFlags(int value) {
		ArrayList<ClipFlag> flags = new ArrayList<>();
		for (ClipFlag f : ClipFlag.values()) {
			if ((value & f.flag) != 0 && f != ClipFlag.EMPTY)
				flags.add(f);
		}
		return flags;
    }

    public void initEmpty() {
        for (int x = 0; x < this.sizeX; x++) {
            for (int y = 0; y < this.sizeY; y++) {
                if (x != 0 && y != 0 && x < this.sizeX - 5 && y < this.sizeY - 5) {
                    this.map[x][y] = ClipFlag.BLOCKED.flag;
                } else {
                    this.map[x][y] = ClipFlag.EMPTY.flag;
                }
            }
        }
    }

    public void addObject(int i_1, int i_2, int i_3, int i_4, boolean clipped, boolean projectileClipped) {
        int flag = ClipFlag.OBJ.flag;
        if (clipped) {
            flag |= ClipFlag.BLOCKED_OBJ.flag;
        }
        if (projectileClipped) {
            flag |= ClipFlag.ALT_OBJ.flag;
        }
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        for (int x = i_1; x < i_3 + i_1; x++) {
            if (x >= 0 && x < this.sizeX) {
                for (int y = i_2; y < i_2 + i_4; y++) {
                    if (y >= 0 && y < this.sizeY) {
                        this.addFlag(x, y, flag);
                    }
                }
            }
        }
    }

    public void addBlockFloorDeco(int i_1, int i_2) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        this.map[i_1][i_2] |= ClipFlag.BLOCKED_DECO.flag;
    }
    
    public void removeBlockFloorDeco(int i_1, int i_2) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        this.map[i_1][i_2] &= ~ClipFlag.BLOCKED_DECO.flag;
    }

    public void removeObject(int i_1, int i_2, int i_3, int i_4, int i_5, boolean blocked, boolean alt) {
        int flag = ClipFlag.OBJ.flag;
        if (blocked) {
            flag |= ClipFlag.BLOCKED_OBJ.flag;
        }
        if (alt) {
            flag |= ClipFlag.ALT_OBJ.flag;
        }
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        int i_10;
        if (i_5 == 1 || i_5 == 3) {
            i_10 = i_3;
            i_3 = i_4;
            i_4 = i_10;
        }
        for (i_10 = i_1; i_10 < i_3 + i_1; i_10++) {
            if (i_10 >= 0 && i_10 < this.sizeX) {
                for (int i_11 = i_2; i_11 < i_2 + i_4; i_11++) {
                    if (i_11 >= 0 && i_11 < this.sizeY) {
                        this.removeFlag(i_10, i_11, flag);
                    }
                }
            }
        }
    }

    public void method5971(int i_1, int i_2, int i_3, int i_4, boolean bool_5, boolean bool_6) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        if (i_3 == 0) {
            if (i_4 == 0) {
                this.addFlag(i_1, i_2, ClipFlag.W_OBJ);
                this.addFlag(i_1 - 1, i_2, ClipFlag.E_OBJ);
            }
            if (i_4 == 1) {
                this.addFlag(i_1, i_2, ClipFlag.N_OBJ);
                this.addFlag(i_1, i_2 + 1, ClipFlag.S_OBJ);
            }
            if (i_4 == 2) {
                this.addFlag(i_1, i_2, ClipFlag.E_OBJ);
                this.addFlag(i_1 + 1, i_2, ClipFlag.W_OBJ);
            }
            if (i_4 == 3) {
                this.addFlag(i_1, i_2, ClipFlag.S_OBJ);
                this.addFlag(i_1, i_2 - 1, ClipFlag.N_OBJ);
            }
        }
        if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
                this.addFlag(i_1, i_2, ClipFlag.NW_OBJ);
                this.addFlag(i_1 - 1, i_2 + 1, ClipFlag.SE_OBJ);
            }
            if (i_4 == 1) {
                this.addFlag(i_1, i_2, ClipFlag.NE_OBJ);
                this.addFlag(i_1 + 1, i_2 + 1, ClipFlag.SW_OBJ);
            }
            if (i_4 == 2) {
                this.addFlag(i_1, i_2, ClipFlag.SE_OBJ);
                this.addFlag(i_1 + 1, i_2 - 1, ClipFlag.NW_OBJ);
            }
            if (i_4 == 3) {
                this.addFlag(i_1, i_2, ClipFlag.SW_OBJ);
                this.addFlag(i_1 - 1, i_2 - 1, ClipFlag.NE_OBJ);
            }
        }
        if (i_3 == 2) {
            if (i_4 == 0) {
                this.addFlag(i_1, i_2, ClipFlag.N_OBJ, ClipFlag.W_OBJ);
                this.addFlag(i_1 - 1, i_2, ClipFlag.E_OBJ);
                this.addFlag(i_1, i_2 + 1, ClipFlag.S_OBJ);
            }
            if (i_4 == 1) {
                this.addFlag(i_1, i_2, ClipFlag.N_OBJ, ClipFlag.E_OBJ);
                this.addFlag(i_1, i_2 + 1, ClipFlag.S_OBJ);
                this.addFlag(i_1 + 1, i_2, ClipFlag.W_OBJ);
            }
            if (i_4 == 2) {
                this.addFlag(i_1, i_2, ClipFlag.E_OBJ, ClipFlag.S_OBJ);
                this.addFlag(i_1 + 1, i_2, ClipFlag.W_OBJ);
                this.addFlag(i_1, i_2 - 1, ClipFlag.N_OBJ);
            }
            if (i_4 == 3) {
                this.addFlag(i_1, i_2, ClipFlag.S_OBJ, ClipFlag.W_OBJ);
                this.addFlag(i_1, i_2 - 1, ClipFlag.N_OBJ);
                this.addFlag(i_1 - 1, i_2, ClipFlag.E_OBJ);
            }
        }
        if (bool_5) {
            if (i_3 == 0) {
                if (i_4 == 0) {
                    this.addFlag(i_1, i_2, ClipFlag.W_BOUND);
                    this.addFlag(i_1 - 1, i_2, ClipFlag.E_BOUND);
                }
                if (i_4 == 1) {
                    this.addFlag(i_1, i_2, ClipFlag.N_BOUND);
                    this.addFlag(i_1, i_2 + 1, ClipFlag.S_BOUND);
                }
                if (i_4 == 2) {
                    this.addFlag(i_1, i_2, ClipFlag.E_BOUND);
                    this.addFlag(i_1 + 1, i_2, ClipFlag.W_BOUND);
                }
                if (i_4 == 3) {
                    this.addFlag(i_1, i_2, ClipFlag.S_BOUND);
                    this.addFlag(i_1, i_2 - 1, ClipFlag.N_BOUND);
                }
            }
            if (i_3 == 1 || i_3 == 3) {
                if (i_4 == 0) {
                    this.addFlag(i_1, i_2, ClipFlag.NW_BOUND);
                    this.addFlag(i_1 - 1, i_2 + 1, ClipFlag.SE_BOUND);
                }
                if (i_4 == 1) {
                    this.addFlag(i_1, i_2, ClipFlag.NE_BOUND);
                    this.addFlag(i_1 + 1, i_2 + 1, ClipFlag.SW_BOUND);
                }
                if (i_4 == 2) {
                    this.addFlag(i_1, i_2, ClipFlag.SE_BOUND);
                    this.addFlag(i_1 + 1, i_2 - 1, ClipFlag.NW_BOUND);
                }
                if (i_4 == 3) {
                    this.addFlag(i_1, i_2, ClipFlag.SW_BOUND);
                    this.addFlag(i_1 - 1, i_2 - 1, ClipFlag.NE_BOUND);
                }
            }
            if (i_3 == 2) {
                if (i_4 == 0) {
                    this.addFlag(i_1, i_2, ClipFlag.N_BOUND, ClipFlag.W_BOUND);
                    this.addFlag(i_1 - 1, i_2, ClipFlag.E_BOUND);
                    this.addFlag(i_1, i_2 + 1, ClipFlag.S_BOUND);
                }
                if (i_4 == 1) {
                    this.addFlag(i_1, i_2, ClipFlag.N_BOUND, ClipFlag.E_BOUND);
                    this.addFlag(i_1, i_2 + 1, ClipFlag.S_BOUND);
                    this.addFlag(i_1 + 1, i_2, ClipFlag.W_BOUND);
                }
                if (i_4 == 2) {
                    this.addFlag(i_1, i_2, ClipFlag.E_BOUND, ClipFlag.S_BOUND);
                    this.addFlag(i_1 + 1, i_2, ClipFlag.W_BOUND);
                    this.addFlag(i_1, i_2 - 1, ClipFlag.N_BOUND);
                }
                if (i_4 == 3) {
                    this.addFlag(i_1, i_2, ClipFlag.S_BOUND, ClipFlag.W_BOUND);
                    this.addFlag(i_1, i_2 - 1, ClipFlag.N_BOUND);
                    this.addFlag(i_1 - 1, i_2, ClipFlag.E_BOUND);
                }
            }
        }
        if (bool_6) {
            if (i_3 == 0) {
                if (i_4 == 0) {
                    this.addFlag(i_1, i_2, ClipFlag.W_ALT_OBJ);
                    this.addFlag(i_1 - 1, i_2, ClipFlag.E_ALT_OBJ);
                }
                if (i_4 == 1) {
                    this.addFlag(i_1, i_2, ClipFlag.N_ALT_OBJ);
                    this.addFlag(i_1, i_2 + 1, ClipFlag.S_ALT_OBJ);
                }
                if (i_4 == 2) {
                    this.addFlag(i_1, i_2, ClipFlag.E_ALT_OBJ);
                    this.addFlag(i_1 + 1, i_2, ClipFlag.W_ALT_OBJ);
                }
                if (i_4 == 3) {
                    this.addFlag(i_1, i_2, ClipFlag.S_ALT_OBJ);
                    this.addFlag(i_1, i_2 - 1, ClipFlag.N_ALT_OBJ);
                }
            }
            if (i_3 == 1 || i_3 == 3) {
                if (i_4 == 0) {
                    this.addFlag(i_1, i_2, ClipFlag.NW_ALT_OBJ);
                    this.addFlag(i_1 - 1, i_2 + 1, ClipFlag.SE_ALT_OBJ);
                }
                if (i_4 == 1) {
                    this.addFlag(i_1, i_2, ClipFlag.NE_ALT_OBJ);
                    this.addFlag(i_1 + 1, i_2 + 1, ClipFlag.SW_ALT_OBJ);
                }
                if (i_4 == 2) {
                    this.addFlag(i_1, i_2, ClipFlag.SE_ALT_OBJ);
                    this.addFlag(i_1 + 1, i_2 - 1, ClipFlag.NW_ALT_OBJ);
                }
                if (i_4 == 3) {
                    this.addFlag(i_1, i_2, ClipFlag.SW_ALT_OBJ);
                    this.addFlag(i_1 - 1, i_2 - 1, ClipFlag.NE_ALT_OBJ);
                }
            }
            if (i_3 == 2) {
                if (i_4 == 0) {
                    this.addFlag(i_1, i_2, ClipFlag.N_ALT_OBJ, ClipFlag.W_ALT_OBJ);
                    this.addFlag(i_1 - 1, i_2, ClipFlag.E_ALT_OBJ);
                    this.addFlag(i_1, i_2 + 1, ClipFlag.S_ALT_OBJ);
                }
                if (i_4 == 1) {
                    this.addFlag(i_1, i_2, ClipFlag.N_ALT_OBJ, ClipFlag.E_ALT_OBJ);
                    this.addFlag(i_1, i_2 + 1, ClipFlag.S_ALT_OBJ);
                    this.addFlag(i_1 + 1, i_2, ClipFlag.W_ALT_OBJ);
                }
                if (i_4 == 2) {
                    this.addFlag(i_1, i_2, ClipFlag.E_ALT_OBJ, ClipFlag.S_ALT_OBJ);
                    this.addFlag(i_1 + 1, i_2, ClipFlag.W_ALT_OBJ);
                    this.addFlag(i_1, i_2 - 1, ClipFlag.N_ALT_OBJ);
                }
                if (i_4 == 3) {
                    this.addFlag(i_1, i_2, ClipFlag.S_ALT_OBJ, ClipFlag.W_ALT_OBJ);
                    this.addFlag(i_1, i_2 - 1, ClipFlag.N_ALT_OBJ);
                    this.addFlag(i_1 - 1, i_2, ClipFlag.E_ALT_OBJ);
                }
            }
        }
    }

    public void addBlockedTile(int i_1, int i_2) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        this.map[i_1][i_2] |= ClipFlag.BLOCKED.flag;
    }
    
    void removeFlag(int i_1, int i_2, ClipFlag... flags) {
    	int flag = 0;
    	for (ClipFlag f : flags)
    		flag |= f.flag;
    	removeFlag(i_1, i_2, flag);
    }

    void removeFlag(int i_1, int i_2, int i_3) {
        this.map[i_1][i_2] &= ~i_3;
    }

    public void removeBlockedTile(int i_1, int i_2) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        this.map[i_1][i_2] &= ~ClipFlag.BLOCKED.flag;
    }

    void addFlag(int i_1, int i_2, int i_3) {
        this.map[i_1][i_2] |= i_3;
    }
    
    void addFlag(int i_1, int i_2, ClipFlag... flags) {
    	int flag = 0;
    	for (ClipFlag f : flags)
    		flag |= f.flag;
    	addFlag(i_1, i_2, flag);
    }
    
    public static boolean isFlagged(int value, ClipFlag... flags) {
    	int flag = 0;
    	for (ClipFlag f : flags)
    		flag |= f.flag;
    	return (value & flag) == 0;
    }

    public boolean method5978(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10) {
        int i_11 = i_3 + i_1;
        int i_12 = i_2 + i_4;
        int i_13 = i_5 + i_7;
        int i_14 = i_8 + i_6;
        int i_15;
        int i_16;
        if (i_13 == i_1 && isFlagged(i_9, ClipFlag.N_OBJ)) {
            i_15 = i_2 > i_6 ? i_2 : i_6;
            for (i_16 = i_12 < i_14 ? i_12 : i_14; i_15 < i_16; i_15++) {
                if (isFlagged(this.map[i_13 - 1 - this.offsetX][i_15 - this.offsetY], ClipFlag.E_OBJ)) {
                    return true;
                }
            }
        } else if (i_5 == i_11 && isFlagged(i_9, ClipFlag.E_OBJ)) {
            i_15 = i_2 > i_6 ? i_2 : i_6;
            for (i_16 = i_12 < i_14 ? i_12 : i_14; i_15 < i_16; i_15++) {
                if (isFlagged(this.map[i_5 - this.offsetX][i_15 - this.offsetY], ClipFlag.W_OBJ)) {
                    return true;
                }
            }
        } else if (i_14 == i_2 && isFlagged(i_9, ClipFlag.NW_OBJ)) {
            i_15 = i_1 > i_5 ? i_1 : i_5;
            for (i_16 = i_11 < i_13 ? i_11 : i_13; i_15 < i_16; i_15++) {
                if (isFlagged(this.map[i_15 - this.offsetX][i_14 - 1 - this.offsetY], ClipFlag.N_OBJ)) {
                    return true;
                }
            }
        } else if (i_12 == i_6 && isFlagged(i_9, ClipFlag.NE_OBJ)) {
            i_15 = i_1 > i_5 ? i_1 : i_5;
            for (i_16 = i_11 < i_13 ? i_11 : i_13; i_15 < i_16; i_15++) {
                if (isFlagged(this.map[i_15 - this.offsetX][i_6 - this.offsetY], ClipFlag.S_OBJ)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean method5986(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, short s_8) {
        if (i_3 == 1) {
            if (i_4 == i_1 && i_5 == i_2) {
                return true;
            }
        } else if (i_4 >= i_1 && i_4 <= i_3 + i_1 - 1 && i_5 >= i_5 && i_5 <= i_3 + i_5 - 1) {
            return true;
        }
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        i_4 -= this.offsetX;
        i_5 -= this.offsetY;
        if (i_3 == 1) {
            if (i_6 == 0) {
                if (i_7 == 0) {
                    if (i_4 - 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_5 + 1 == i_2 && isFlagged(this.map[i_1][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && isFlagged(this.map[i_1][i_2], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 == i_1 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 - 1 == i_1 && i_5 == i_2 && isFlagged(this.map[i_1][i_2], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2 && isFlagged(this.map[i_1][i_2], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 + 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 + 1 && isFlagged(this.map[i_1][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && isFlagged(this.map[i_1][i_2], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 3) {
                    if (i_4 == i_1 && i_2 == i_5 - 1) {
                        return true;
                    }
                    if (i_4 - 1 == i_1 && i_5 == i_2 && isFlagged(this.map[i_1][i_2], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2 && isFlagged(this.map[i_1][i_2], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                }
            }
            if (i_6 == 2) {
                if (i_7 == 0) {
                    if (i_4 - 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2 && isFlagged(this.map[i_1][i_2], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && isFlagged(this.map[i_1][i_2], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 - 1 == i_1 && i_5 == i_2 && isFlagged(this.map[i_1][i_2], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && isFlagged(this.map[i_1][i_2], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 - 1 == i_1 && i_5 == i_2 && isFlagged(this.map[i_1][i_2], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 + 1 && isFlagged(this.map[i_1][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1) {
                        return true;
                    }
                } else if (i_7 == 3) {
                    if (i_4 - 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 + 1 && isFlagged(this.map[i_1][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2 && isFlagged(this.map[i_1][i_2], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1) {
                        return true;
                    }
                }
            }
            if (i_6 == 9) {
                if (i_4 == i_1 && i_2 == i_5 + 1 && isFlagged(this.map[i_1][i_2], ClipFlag.S_OBJ)) {
                    return true;
                }
                if (i_4 == i_1 && i_2 == i_5 - 1 && isFlagged(this.map[i_1][i_2], ClipFlag.N_OBJ)) {
                    return true;
                }
                if (i_4 - 1 == i_1 && i_5 == i_2 && isFlagged(this.map[i_1][i_2], ClipFlag.E_OBJ)) {
                    return true;
                }
                if (i_4 + 1 == i_1 && i_5 == i_2 && isFlagged(this.map[i_1][i_2], ClipFlag.W_OBJ)) {
                    return true;
                }
            }
        } else {
            int i_9 = i_3 + i_1 - 1;
            int i_10 = i_3 + i_2 - 1;
            if (i_6 == 0) {
                if (i_7 == 0) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_2 == i_5 + 1 && isFlagged(this.map[i_4][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && isFlagged(this.map[i_4][i_10], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && isFlagged(this.map[i_9][i_5], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && isFlagged(this.map[i_1][i_5], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2 && isFlagged(this.map[i_4][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && isFlagged(this.map[i_4][i_10], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 3) {
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2) {
                        return true;
                    }
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && isFlagged(this.map[i_9][i_5], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && isFlagged(this.map[i_1][i_5], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                }
            }
            if (i_6 == 2) {
                if (i_7 == 0) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && isFlagged(this.map[i_1][i_5], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && isFlagged(this.map[i_4][i_10], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && isFlagged(this.map[i_9][i_5], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && isFlagged(this.map[i_4][i_10], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && isFlagged(this.map[i_9][i_5], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2 && isFlagged(this.map[i_4][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2) {
                        return true;
                    }
                } else if (i_7 == 3) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_2 == i_5 + 1 && isFlagged(this.map[i_4][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && isFlagged(this.map[i_1][i_5], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2) {
                        return true;
                    }
                }
            }
            if (i_6 == 9) {
                if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2 && isFlagged(this.map[i_4][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                    return true;
                }
                if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && isFlagged(this.map[i_4][i_10], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                    return true;
                }
                if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && isFlagged(this.map[i_9][i_5], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                    return true;
                }
                if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && isFlagged(this.map[i_1][i_5], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean method5988(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, byte b_9) {
        if (i_3 > 1) {
            return Class325.method5790(i_1, i_2, i_3, i_3, i_4, i_5, i_6, i_7, -386839744) ? true : this.method5978(i_1, i_2, i_3, i_3, i_4, i_5, i_6, i_7, i_8, -1585578368);
        } else {
            int i_10 = i_4 + i_6 - 1;
            int i_11 = i_5 + i_7 - 1;
            return i_1 >= i_4 && i_1 <= i_10 && i_2 >= i_5 && i_2 <= i_11 ? true : (i_4 - 1 == i_1 && i_2 >= i_5 && i_2 <= i_11 && isFlagged(this.map[i_1 - this.offsetX][i_2 - this.offsetY], ClipFlag.E_OBJ) && isFlagged(i_8, ClipFlag.E_OBJ) ? true : (i_10 + 1 == i_1 && i_2 >= i_5 && i_2 <= i_11 && isFlagged(this.map[i_1 - this.offsetX][i_2 - this.offsetY], ClipFlag.W_OBJ) && isFlagged(i_8, ClipFlag.N_OBJ) ? true : (i_2 == i_5 - 1 && i_1 >= i_4 && i_1 <= i_10 && isFlagged(this.map[i_1 - this.offsetX][i_2 - this.offsetY], ClipFlag.N_OBJ) && isFlagged(i_8, ClipFlag.NE_OBJ) ? true : i_2 == i_11 + 1 && i_1 >= i_4 && i_1 <= i_10 && isFlagged(this.map[i_1 - this.offsetX][i_2 - this.offsetY], ClipFlag.S_OBJ) && isFlagged(i_8, ClipFlag.NW_OBJ))));
        }
    }

    public void method5992(int i_1, int i_2, int i_3, int i_4, boolean blocks, boolean alt) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        if (i_3 == 0) {
            if (i_4 == 0) {
                this.removeFlag(i_1, i_2, ClipFlag.W_OBJ);
                this.removeFlag(i_1 - 1, i_2, ClipFlag.E_OBJ);
            }
            if (i_4 == 1) {
                this.removeFlag(i_1, i_2, ClipFlag.N_OBJ);
                this.removeFlag(i_1, i_2 + 1, ClipFlag.S_OBJ);
            }
            if (i_4 == 2) {
                this.removeFlag(i_1, i_2, ClipFlag.E_OBJ);
                this.removeFlag(i_1 + 1, i_2, ClipFlag.W_OBJ);
            }
            if (i_4 == 3) {
                this.removeFlag(i_1, i_2, ClipFlag.S_OBJ);
                this.removeFlag(i_1, i_2 - 1, ClipFlag.N_OBJ);
            }
        }
        if (i_3 == 1 || i_3 == 3) {
            if (i_4 == 0) {
                this.removeFlag(i_1, i_2, ClipFlag.NW_OBJ);
                this.removeFlag(i_1 - 1, i_2 + 1, ClipFlag.SE_OBJ);
            }
            if (i_4 == 1) {
                this.removeFlag(i_1, i_2, ClipFlag.NE_OBJ);
                this.removeFlag(i_1 + 1, i_2 + 1, ClipFlag.SW_OBJ);
            }
            if (i_4 == 2) {
                this.removeFlag(i_1, i_2, ClipFlag.SE_OBJ);
                this.removeFlag(i_1 + 1, i_2 - 1, ClipFlag.NW_OBJ);
            }
            if (i_4 == 3) {
                this.removeFlag(i_1, i_2, ClipFlag.SW_OBJ);
                this.removeFlag(i_1 - 1, i_2 - 1, ClipFlag.NE_OBJ);
            }
        }
        if (i_3 == 2) {
            if (i_4 == 0) {
                this.removeFlag(i_1, i_2, ClipFlag.N_OBJ, ClipFlag.W_OBJ);
                this.removeFlag(i_1 - 1, i_2, ClipFlag.E_OBJ);
                this.removeFlag(i_1, i_2 + 1, ClipFlag.S_OBJ);
            }
            if (i_4 == 1) {
                this.removeFlag(i_1, i_2, ClipFlag.N_OBJ, ClipFlag.E_OBJ);
                this.removeFlag(i_1, i_2 + 1, ClipFlag.S_OBJ);
                this.removeFlag(i_1 + 1, i_2, ClipFlag.W_OBJ);
            }
            if (i_4 == 2) {
                this.removeFlag(i_1, i_2, ClipFlag.E_OBJ, ClipFlag.S_OBJ);
                this.removeFlag(i_1 + 1, i_2, ClipFlag.W_OBJ);
                this.removeFlag(i_1, i_2 - 1, ClipFlag.N_OBJ);
            }
            if (i_4 == 3) {
                this.removeFlag(i_1, i_2, ClipFlag.S_OBJ, ClipFlag.W_OBJ);
                this.removeFlag(i_1, i_2 - 1, ClipFlag.N_OBJ);
                this.removeFlag(i_1 - 1, i_2, ClipFlag.E_OBJ);
            }
        }
        if (blocks) {
            if (i_3 == 0) {
                if (i_4 == 0) {
                    this.removeFlag(i_1, i_2, ClipFlag.W_BOUND);
                    this.removeFlag(i_1 - 1, i_2, ClipFlag.E_BOUND);
                }
                if (i_4 == 1) {
                    this.removeFlag(i_1, i_2, ClipFlag.N_BOUND);
                    this.removeFlag(i_1, i_2 + 1, ClipFlag.S_BOUND);
                }
                if (i_4 == 2) {
                    this.removeFlag(i_1, i_2, ClipFlag.E_BOUND);
                    this.removeFlag(i_1 + 1, i_2, ClipFlag.W_BOUND);
                }
                if (i_4 == 3) {
                    this.removeFlag(i_1, i_2, ClipFlag.S_BOUND);
                    this.removeFlag(i_1, i_2 - 1, ClipFlag.N_BOUND);
                }
            }
            if (i_3 == 1 || i_3 == 3) {
                if (i_4 == 0) {
                    this.removeFlag(i_1, i_2, ClipFlag.NW_BOUND);
                    this.removeFlag(i_1 - 1, i_2 + 1, ClipFlag.SE_BOUND);
                }
                if (i_4 == 1) {
                    this.removeFlag(i_1, i_2, ClipFlag.NE_BOUND);
                    this.removeFlag(i_1 + 1, i_2 + 1, ClipFlag.SW_BOUND);
                }
                if (i_4 == 2) {
                    this.removeFlag(i_1, i_2, ClipFlag.SE_BOUND);
                    this.removeFlag(i_1 + 1, i_2 - 1, ClipFlag.NW_BOUND);
                }
                if (i_4 == 3) {
                    this.removeFlag(i_1, i_2, ClipFlag.SW_BOUND);
                    this.removeFlag(i_1 - 1, i_2 - 1, ClipFlag.NE_BOUND);
                }
            }
            if (i_3 == 2) {
                if (i_4 == 0) {
                    this.removeFlag(i_1, i_2, ClipFlag.N_BOUND, ClipFlag.W_BOUND);
                    this.removeFlag(i_1 - 1, i_2, ClipFlag.E_BOUND);
                    this.removeFlag(i_1, i_2 + 1, ClipFlag.S_BOUND);
                }
                if (i_4 == 1) {
                    this.removeFlag(i_1, i_2, ClipFlag.N_BOUND, ClipFlag.E_BOUND);
                    this.removeFlag(i_1, i_2 + 1, ClipFlag.S_BOUND);
                    this.removeFlag(i_1 + 1, i_2, ClipFlag.W_BOUND);
                }
                if (i_4 == 2) {
                    this.removeFlag(i_1, i_2, ClipFlag.E_BOUND, ClipFlag.S_BOUND);
                    this.removeFlag(i_1 + 1, i_2, ClipFlag.W_BOUND);
                    this.removeFlag(i_1, i_2 - 1, ClipFlag.N_BOUND);
                }
                if (i_4 == 3) {
                    this.removeFlag(i_1, i_2, ClipFlag.S_BOUND, ClipFlag.W_BOUND);
                    this.removeFlag(i_1, i_2 - 1, ClipFlag.N_BOUND);
                    this.removeFlag(i_1 - 1, i_2, ClipFlag.E_BOUND);
                }
            }
        }
        if (alt) {
            if (i_3 == 0) {
                if (i_4 == 0) {
                    this.removeFlag(i_1, i_2, ClipFlag.W_ALT_OBJ);
                    this.removeFlag(i_1 - 1, i_2, ClipFlag.E_ALT_OBJ);
                }
                if (i_4 == 1) {
                    this.removeFlag(i_1, i_2, ClipFlag.N_ALT_OBJ);
                    this.removeFlag(i_1, i_2 + 1, ClipFlag.S_ALT_OBJ);
                }
                if (i_4 == 2) {
                    this.removeFlag(i_1, i_2, ClipFlag.E_ALT_OBJ);
                    this.removeFlag(i_1 + 1, i_2, ClipFlag.W_ALT_OBJ);
                }
                if (i_4 == 3) {
                    this.removeFlag(i_1, i_2, ClipFlag.S_ALT_OBJ);
                    this.removeFlag(i_1, i_2 - 1, ClipFlag.N_ALT_OBJ);
                }
            }
            if (i_3 == 1 || i_3 == 3) {
                if (i_4 == 0) {
                    this.removeFlag(i_1, i_2, ClipFlag.NW_ALT_OBJ);
                    this.removeFlag(i_1 - 1, i_2 + 1, ClipFlag.SE_ALT_OBJ);
                }
                if (i_4 == 1) {
                    this.removeFlag(i_1, i_2, ClipFlag.NE_ALT_OBJ);
                    this.removeFlag(i_1 + 1, i_2 + 1, ClipFlag.SW_ALT_OBJ);
                }
                if (i_4 == 2) {
                    this.removeFlag(i_1, i_2, ClipFlag.SE_ALT_OBJ);
                    this.removeFlag(i_1 + 1, i_2 - 1, ClipFlag.NW_ALT_OBJ);
                }
                if (i_4 == 3) {
                    this.removeFlag(i_1, i_2, ClipFlag.SW_ALT_OBJ);
                    this.removeFlag(i_1 - 1, i_2 - 1, ClipFlag.NE_ALT_OBJ);
                }
            }
            if (i_3 == 2) {
                if (i_4 == 0) {
                    this.removeFlag(i_1, i_2, ClipFlag.N_ALT_OBJ, ClipFlag.W_ALT_OBJ);
                    this.removeFlag(i_1 - 1, i_2, ClipFlag.E_ALT_OBJ);
                    this.removeFlag(i_1, i_2 + 1, ClipFlag.S_ALT_OBJ);
                }
                if (i_4 == 1) {
                    this.removeFlag(i_1, i_2, ClipFlag.N_ALT_OBJ, ClipFlag.E_ALT_OBJ);
                    this.removeFlag(i_1, i_2 + 1, ClipFlag.S_ALT_OBJ);
                    this.removeFlag(i_1 + 1, i_2, ClipFlag.W_ALT_OBJ);
                }
                if (i_4 == 2) {
                    this.removeFlag(i_1, i_2, ClipFlag.E_ALT_OBJ, ClipFlag.S_ALT_OBJ);
                    this.removeFlag(i_1 + 1, i_2, ClipFlag.W_ALT_OBJ);
                    this.removeFlag(i_1, i_2 - 1, ClipFlag.N_ALT_OBJ);
                }
                if (i_4 == 3) {
                    this.removeFlag(i_1, i_2, ClipFlag.S_ALT_OBJ, ClipFlag.W_ALT_OBJ);
                    this.removeFlag(i_1, i_2 - 1, ClipFlag.N_ALT_OBJ);
                    this.removeFlag(i_1 - 1, i_2, ClipFlag.E_ALT_OBJ);
                }
            }
        }
    }

    static final void method6007(int i_0, int[] ints_1, int i_2) {
        if (MovingAnimation.isInterfaceLoaded(i_0, ints_1, 214426228)) {
            IComponentDefinitions[] arr_3 = CustomCursorsPreference.INTERFACES[i_0].components;
            for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
                IComponentDefinitions icomponentdefinitions_5 = arr_3[i_4];
                if (icomponentdefinitions_5 != null && icomponentdefinitions_5.aAnimation_1437 != null) {
                    icomponentdefinitions_5.aAnimation_1437.method7582((byte) -62);
                }
            }
        }
    }

    public static void method6008(boolean bool_0) {
        Node_Sub48 class282_sub48_2;
        for (class282_sub48_2 = (Node_Sub48) Node_Sub48.aClass482_8073.head(); class282_sub48_2 != null; class282_sub48_2 = (Node_Sub48) Node_Sub48.aClass482_8073.next(-128319020)) {
            if (class282_sub48_2.aNode_Sub15_Sub5_8099 != null) {
                Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_2.aNode_Sub15_Sub5_8099);
                class282_sub48_2.aNode_Sub15_Sub5_8099 = null;
            }
            if (class282_sub48_2.aNode_Sub15_Sub5_8096 != null) {
                Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_2.aNode_Sub15_Sub5_8096);
                class282_sub48_2.aNode_Sub15_Sub5_8096 = null;
            }
            class282_sub48_2.remove();
        }
        if (bool_0) {
            for (class282_sub48_2 = (Node_Sub48) Node_Sub48.aClass482_8074.head(); class282_sub48_2 != null; class282_sub48_2 = (Node_Sub48) Node_Sub48.aClass482_8074.next(-938773769)) {
                if (class282_sub48_2.aNode_Sub15_Sub5_8099 != null) {
                    Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_2.aNode_Sub15_Sub5_8099);
                    class282_sub48_2.aNode_Sub15_Sub5_8099 = null;
                }
                class282_sub48_2.remove();
            }
            for (class282_sub48_2 = (Node_Sub48) Node_Sub48.aClass465_8075.method7750(856415350); class282_sub48_2 != null; class282_sub48_2 = (Node_Sub48) Node_Sub48.aClass465_8075.method7751((byte) 62)) {
                if (class282_sub48_2.aNode_Sub15_Sub5_8099 != null) {
                    Class79.aNode_Sub15_Sub4_783.method15276(class282_sub48_2.aNode_Sub15_Sub5_8099);
                    class282_sub48_2.aNode_Sub15_Sub5_8099 = null;
                }
                class282_sub48_2.remove();
            }
        }
    }
}
