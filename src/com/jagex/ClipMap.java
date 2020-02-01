package com.jagex;
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

    public void addObject(int x, int y, int sizeX, int sizeY, boolean blocked, boolean notAlt) {
        int flag = ClipFlag.OBJ.flag;
        if (blocked) {
            flag |= ClipFlag.BLOCKED_OBJ.flag;
        }
        if (notAlt) {
            flag |= ClipFlag.ALT_OBJ.flag;
        }
        x -= this.offsetX;
        y -= this.offsetY;
        for (int tileX = x; tileX < x + sizeX; tileX++) {
            if (tileX >= 0 && tileX < this.sizeX) {
                for (int tileY = y; tileY < y + sizeY; tileY++) {
                    if (tileY >= 0 && tileY < this.sizeY) {
                        addFlag(tileX, tileY, flag);
                    }
                }
            }
        }
    }

    public void removeObject(int x, int y, int sizeX, int sizeY, int rotation, boolean blocked, boolean notAlt) {
        int flag = ClipFlag.OBJ.flag;
        if (blocked) {
            flag |= ClipFlag.BLOCKED_OBJ.flag;
        }
        if (notAlt) {
            flag |= ClipFlag.ALT_OBJ.flag;
        }
        x -= this.offsetX;
        y -= this.offsetY;
        int tileX;
        if (rotation == 1 || rotation == 3) {
            tileX = sizeX;
            sizeX = sizeY;
            sizeY = tileX;
        }
        for (tileX = x; tileX < sizeX + x; tileX++) {
            if (tileX >= 0 && tileX < this.sizeX) {
                for (int tileY = y; tileY < y + sizeY; tileY++) {
                    if (tileY >= 0 && tileY < this.sizeY) {
                        removeFlag(tileX, tileY, flag);
                    }
                }
            }
        }
    }

    public void addWall(int x, int y, int type, int rotation, boolean blocks, boolean alt) {
        x -= this.offsetX;
        y -= this.offsetY;
        if (type == 0) {
            if (rotation == 0) {
                addFlag(x, y, ClipFlag.W_OBJ);
                addFlag(x - 1, y, ClipFlag.E_OBJ);
            }
            if (rotation == 1) {
                addFlag(x, y, ClipFlag.N_OBJ);
                addFlag(x, y + 1, ClipFlag.S_OBJ);
            }
            if (rotation == 2) {
                addFlag(x, y, ClipFlag.E_OBJ);
                addFlag(x + 1, y, ClipFlag.W_OBJ);
            }
            if (rotation == 3) {
                addFlag(x, y, ClipFlag.S_OBJ);
                addFlag(x, y - 1, ClipFlag.N_OBJ);
            }
        }
        if (type == 1 || type == 3) {
            if (rotation == 0) {
                addFlag(x, y, ClipFlag.NW_OBJ);
                addFlag(x - 1, y + 1, ClipFlag.SE_OBJ);
            }
            if (rotation == 1) {
                addFlag(x, y, ClipFlag.NE_OBJ);
                addFlag(x + 1, y + 1, ClipFlag.SW_OBJ);
            }
            if (rotation == 2) {
                addFlag(x, y, ClipFlag.SE_OBJ);
                addFlag(x + 1, y - 1, ClipFlag.NW_OBJ);
            }
            if (rotation == 3) {
                addFlag(x, y, ClipFlag.SW_OBJ);
                addFlag(x - 1, y - 1, ClipFlag.NE_OBJ);
            }
        }
        if (type == 2) {
            if (rotation == 0) {
                addFlag(x, y, ClipFlag.N_OBJ, ClipFlag.W_OBJ);
                addFlag(x - 1, y, ClipFlag.E_OBJ);
                addFlag(x, y + 1, ClipFlag.S_OBJ);
            }
            if (rotation == 1) {
                addFlag(x, y, ClipFlag.N_OBJ, ClipFlag.E_OBJ);
                addFlag(x, y + 1, ClipFlag.S_OBJ);
                addFlag(x + 1, y, ClipFlag.W_OBJ);
            }
            if (rotation == 2) {
                addFlag(x, y, ClipFlag.E_OBJ, ClipFlag.S_OBJ);
                addFlag(x + 1, y, ClipFlag.W_OBJ);
                addFlag(x, y - 1, ClipFlag.N_OBJ);
            }
            if (rotation == 3) {
                addFlag(x, y, ClipFlag.S_OBJ, ClipFlag.W_OBJ);
                addFlag(x, y - 1, ClipFlag.N_OBJ);
                addFlag(x - 1, y, ClipFlag.E_OBJ);
            }
        }
        if (blocks) {
            if (type == 0) {
                if (rotation == 0) {
                    addFlag(x, y, ClipFlag.W_BOUND);
                    addFlag(x - 1, y, ClipFlag.E_BOUND);
                }
                if (rotation == 1) {
                    addFlag(x, y, ClipFlag.N_BOUND);
                    addFlag(x, y + 1, ClipFlag.S_BOUND);
                }
                if (rotation == 2) {
                    addFlag(x, y, ClipFlag.E_BOUND);
                    addFlag(x + 1, y, ClipFlag.W_BOUND);
                }
                if (rotation == 3) {
                    addFlag(x, y, ClipFlag.S_BOUND);
                    addFlag(x, y - 1, ClipFlag.N_BOUND);
                }
            }
            if (type == 1 || type == 3) {
                if (rotation == 0) {
                    addFlag(x, y, ClipFlag.NW_BOUND);
                    addFlag(x - 1, y + 1, ClipFlag.SE_BOUND);
                }
                if (rotation == 1) {
                    addFlag(x, y, ClipFlag.NE_BOUND);
                    addFlag(x + 1, y + 1, ClipFlag.SW_BOUND);
                }
                if (rotation == 2) {
                    addFlag(x, y, ClipFlag.SE_BOUND);
                    addFlag(x + 1, y - 1, ClipFlag.NW_BOUND);
                }
                if (rotation == 3) {
                    addFlag(x, y, ClipFlag.SW_BOUND);
                    addFlag(x - 1, y - 1, ClipFlag.NE_BOUND);
                }
            }
            if (type == 2) {
                if (rotation == 0) {
                    addFlag(x, y, ClipFlag.N_BOUND, ClipFlag.W_BOUND);
                    addFlag(x - 1, y, ClipFlag.E_BOUND);
                    addFlag(x, y + 1, ClipFlag.S_BOUND);
                }
                if (rotation == 1) {
                    addFlag(x, y, ClipFlag.N_BOUND, ClipFlag.E_BOUND);
                    addFlag(x, y + 1, ClipFlag.S_BOUND);
                    addFlag(x + 1, y, ClipFlag.W_BOUND);
                }
                if (rotation == 2) {
                    addFlag(x, y, ClipFlag.E_BOUND, ClipFlag.S_BOUND);
                    addFlag(x + 1, y, ClipFlag.W_BOUND);
                    addFlag(x, y - 1, ClipFlag.N_BOUND);
                }
                if (rotation == 3) {
                    addFlag(x, y, ClipFlag.S_BOUND, ClipFlag.W_BOUND);
                    addFlag(x, y - 1, ClipFlag.N_BOUND);
                    addFlag(x - 1, y, ClipFlag.E_BOUND);
                }
            }
        }
        if (alt) {
            if (type == 0) {
                if (rotation == 0) {
                    addFlag(x, y, ClipFlag.W_ALT_OBJ);
                    addFlag(x - 1, y, ClipFlag.E_ALT_OBJ);
                }
                if (rotation == 1) {
                    addFlag(x, y, ClipFlag.N_ALT_OBJ);
                    addFlag(x, y + 1, ClipFlag.S_ALT_OBJ);
                }
                if (rotation == 2) {
                    addFlag(x, y, ClipFlag.E_ALT_OBJ);
                    addFlag(x + 1, y, ClipFlag.W_ALT_OBJ);
                }
                if (rotation == 3) {
                    addFlag(x, y, ClipFlag.S_ALT_OBJ);
                    addFlag(x, y - 1, ClipFlag.N_ALT_OBJ);
                }
            }
            if (type == 1 || type == 3) {
                if (rotation == 0) {
                    addFlag(x, y, ClipFlag.NW_ALT_OBJ);
                    addFlag(x - 1, y + 1, ClipFlag.SE_ALT_OBJ);
                }
                if (rotation == 1) {
                    addFlag(x, y, ClipFlag.NE_ALT_OBJ);
                    addFlag(x + 1, y + 1, ClipFlag.SW_ALT_OBJ);
                }
                if (rotation == 2) {
                    addFlag(x, y, ClipFlag.SE_ALT_OBJ);
                    addFlag(x + 1, y - 1, ClipFlag.NW_ALT_OBJ);
                }
                if (rotation == 3) {
                    addFlag(x, y, ClipFlag.SW_ALT_OBJ);
                    addFlag(x - 1, y - 1, ClipFlag.NE_ALT_OBJ);
                }
            }
            if (type == 2) {
                if (rotation == 0) {
                    addFlag(x, y, ClipFlag.N_ALT_OBJ, ClipFlag.W_ALT_OBJ);
                    addFlag(x - 1, y, ClipFlag.E_ALT_OBJ);
                    addFlag(x, y + 1, ClipFlag.S_ALT_OBJ);
                }
                if (rotation == 1) {
                    addFlag(x, y, ClipFlag.N_ALT_OBJ, ClipFlag.E_ALT_OBJ);
                    addFlag(x, y + 1, ClipFlag.S_ALT_OBJ);
                    addFlag(x + 1, y, ClipFlag.W_ALT_OBJ);
                }
                if (rotation == 2) {
                    addFlag(x, y, ClipFlag.E_ALT_OBJ, ClipFlag.S_ALT_OBJ);
                    addFlag(x + 1, y, ClipFlag.W_ALT_OBJ);
                    addFlag(x, y - 1, ClipFlag.N_ALT_OBJ);
                }
                if (rotation == 3) {
                    addFlag(x, y, ClipFlag.S_ALT_OBJ, ClipFlag.W_ALT_OBJ);
                    addFlag(x, y - 1, ClipFlag.N_ALT_OBJ);
                    addFlag(x - 1, y, ClipFlag.E_ALT_OBJ);
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

    public void addBlockedTile(int i_1, int i_2) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        this.map[i_1][i_2] |= ClipFlag.BLOCKED.flag;
    }
    
    public void removeBlockedTile(int i_1, int i_2) {
        i_1 -= this.offsetX;
        i_2 -= this.offsetY;
        this.map[i_1][i_2] &= ~ClipFlag.BLOCKED.flag;
    }
    
    void removeFlag(int i_1, int i_2, int i_3) {
        this.map[i_1][i_2] &= ~i_3;
    }

    void addFlag(int i_1, int i_2, int i_3) {
        this.map[i_1][i_2] |= i_3;
    }
    
    void removeFlag(int i_1, int i_2, ClipFlag... flags) {
    	int flag = 0;
    	for (ClipFlag f : flags)
    		flag |= f.flag;
    	removeFlag(i_1, i_2, flag);
    }
    
    void addFlag(int i_1, int i_2, ClipFlag... flags) {
    	int flag = 0;
    	for (ClipFlag f : flags)
    		flag |= f.flag;
    	addFlag(i_1, i_2, flag);
    }
    
    public static boolean notFlagged(int value, ClipFlag... flags) {
    	int flag = 0;
    	for (ClipFlag f : flags)
    		flag |= f.flag;
    	return (value & flag) == 0;
    }

    public boolean method5978(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9) {
        int i_11 = i_3 + i_1;
        int i_12 = i_2 + i_4;
        int i_13 = i_5 + i_7;
        int i_14 = i_8 + i_6;
        int i_15;
        int i_16;
        if (i_13 == i_1 && notFlagged(i_9, ClipFlag.N_OBJ)) {
            i_15 = i_2 > i_6 ? i_2 : i_6;
            for (i_16 = i_12 < i_14 ? i_12 : i_14; i_15 < i_16; i_15++) {
                if (notFlagged(this.map[i_13 - 1 - this.offsetX][i_15 - this.offsetY], ClipFlag.E_OBJ)) {
                    return true;
                }
            }
        } else if (i_5 == i_11 && notFlagged(i_9, ClipFlag.E_OBJ)) {
            i_15 = i_2 > i_6 ? i_2 : i_6;
            for (i_16 = i_12 < i_14 ? i_12 : i_14; i_15 < i_16; i_15++) {
                if (notFlagged(this.map[i_5 - this.offsetX][i_15 - this.offsetY], ClipFlag.W_OBJ)) {
                    return true;
                }
            }
        } else if (i_14 == i_2 && notFlagged(i_9, ClipFlag.NW_OBJ)) {
            i_15 = i_1 > i_5 ? i_1 : i_5;
            for (i_16 = i_11 < i_13 ? i_11 : i_13; i_15 < i_16; i_15++) {
                if (notFlagged(this.map[i_15 - this.offsetX][i_14 - 1 - this.offsetY], ClipFlag.N_OBJ)) {
                    return true;
                }
            }
        } else if (i_12 == i_6 && notFlagged(i_9, ClipFlag.NE_OBJ)) {
            i_15 = i_1 > i_5 ? i_1 : i_5;
            for (i_16 = i_11 < i_13 ? i_11 : i_13; i_15 < i_16; i_15++) {
                if (notFlagged(this.map[i_15 - this.offsetX][i_6 - this.offsetY], ClipFlag.S_OBJ)) {
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
                    if (i_4 == i_1 && i_5 + 1 == i_2 && notFlagged(this.map[i_1][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && notFlagged(this.map[i_1][i_2], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 == i_1 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 - 1 == i_1 && i_5 == i_2 && notFlagged(this.map[i_1][i_2], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2 && notFlagged(this.map[i_1][i_2], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 + 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 + 1 && notFlagged(this.map[i_1][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && notFlagged(this.map[i_1][i_2], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 3) {
                    if (i_4 == i_1 && i_2 == i_5 - 1) {
                        return true;
                    }
                    if (i_4 - 1 == i_1 && i_5 == i_2 && notFlagged(this.map[i_1][i_2], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2 && notFlagged(this.map[i_1][i_2], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
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
                    if (i_4 + 1 == i_1 && i_5 == i_2 && notFlagged(this.map[i_1][i_2], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && notFlagged(this.map[i_1][i_2], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 - 1 == i_1 && i_5 == i_2 && notFlagged(this.map[i_1][i_2], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1 && notFlagged(this.map[i_1][i_2], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 - 1 == i_1 && i_5 == i_2 && notFlagged(this.map[i_1][i_2], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 + 1 && notFlagged(this.map[i_1][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
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
                    if (i_4 == i_1 && i_2 == i_5 + 1 && notFlagged(this.map[i_1][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 == i_2 && notFlagged(this.map[i_1][i_2], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 == i_1 && i_2 == i_5 - 1) {
                        return true;
                    }
                }
            }
            if (i_6 == 9) {
                if (i_4 == i_1 && i_2 == i_5 + 1 && notFlagged(this.map[i_1][i_2], ClipFlag.S_OBJ)) {
                    return true;
                }
                if (i_4 == i_1 && i_2 == i_5 - 1 && notFlagged(this.map[i_1][i_2], ClipFlag.N_OBJ)) {
                    return true;
                }
                if (i_4 - 1 == i_1 && i_5 == i_2 && notFlagged(this.map[i_1][i_2], ClipFlag.E_OBJ)) {
                    return true;
                }
                if (i_4 + 1 == i_1 && i_5 == i_2 && notFlagged(this.map[i_1][i_2], ClipFlag.W_OBJ)) {
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
                    if (i_4 >= i_1 && i_4 <= i_9 && i_2 == i_5 + 1 && notFlagged(this.map[i_4][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && notFlagged(this.map[i_4][i_10], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && notFlagged(this.map[i_9][i_5], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && notFlagged(this.map[i_1][i_5], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2 && notFlagged(this.map[i_4][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && notFlagged(this.map[i_4][i_10], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 3) {
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2) {
                        return true;
                    }
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && notFlagged(this.map[i_9][i_5], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && notFlagged(this.map[i_1][i_5], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
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
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && notFlagged(this.map[i_1][i_5], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && notFlagged(this.map[i_4][i_10], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 1) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && notFlagged(this.map[i_9][i_5], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && notFlagged(this.map[i_4][i_10], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                } else if (i_7 == 2) {
                    if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && notFlagged(this.map[i_9][i_5], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2 && notFlagged(this.map[i_4][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
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
                    if (i_4 >= i_1 && i_4 <= i_9 && i_2 == i_5 + 1 && notFlagged(this.map[i_4][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && notFlagged(this.map[i_1][i_5], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                        return true;
                    }
                    if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2) {
                        return true;
                    }
                }
            }
            if (i_6 == 9) {
                if (i_4 >= i_1 && i_4 <= i_9 && i_5 + 1 == i_2 && notFlagged(this.map[i_4][i_2], ClipFlag.S_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                    return true;
                }
                if (i_4 >= i_1 && i_4 <= i_9 && i_5 - i_3 == i_2 && notFlagged(this.map[i_4][i_10], ClipFlag.N_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                    return true;
                }
                if (i_4 - i_3 == i_1 && i_5 >= i_2 && i_5 <= i_10 && notFlagged(this.map[i_9][i_5], ClipFlag.E_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                    return true;
                }
                if (i_4 + 1 == i_1 && i_5 >= i_2 && i_5 <= i_10 && notFlagged(this.map[i_1][i_5], ClipFlag.W_OBJ, ClipFlag.OBJ, ClipFlag.BLOCKED_DECO, ClipFlag.BLOCKED)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean method5988(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, byte b_9) {
        if (i_3 > 1) {
            return Class325.method5790(i_1, i_2, i_3, i_3, i_4, i_5, i_6, i_7, -386839744) ? true : this.method5978(i_1, i_2, i_3, i_3, i_4, i_5, i_6, i_7, i_8);
        } else {
            int i_10 = i_4 + i_6 - 1;
            int i_11 = i_5 + i_7 - 1;
            return i_1 >= i_4 && i_1 <= i_10 && i_2 >= i_5 && i_2 <= i_11 ? true : (i_4 - 1 == i_1 && i_2 >= i_5 && i_2 <= i_11 && notFlagged(this.map[i_1 - this.offsetX][i_2 - this.offsetY], ClipFlag.E_OBJ) && notFlagged(i_8, ClipFlag.E_OBJ) ? true : (i_10 + 1 == i_1 && i_2 >= i_5 && i_2 <= i_11 && notFlagged(this.map[i_1 - this.offsetX][i_2 - this.offsetY], ClipFlag.W_OBJ) && notFlagged(i_8, ClipFlag.N_OBJ) ? true : (i_2 == i_5 - 1 && i_1 >= i_4 && i_1 <= i_10 && notFlagged(this.map[i_1 - this.offsetX][i_2 - this.offsetY], ClipFlag.N_OBJ) && notFlagged(i_8, ClipFlag.NE_OBJ) ? true : i_2 == i_11 + 1 && i_1 >= i_4 && i_1 <= i_10 && notFlagged(this.map[i_1 - this.offsetX][i_2 - this.offsetY], ClipFlag.S_OBJ) && notFlagged(i_8, ClipFlag.NW_OBJ))));
        }
    }

    public void removeWall(int x, int y, int type, int rotation, boolean blocks, boolean notAlternative) {
        x -= this.offsetX;
        y -= this.offsetY;
        if (type == 0) {
            if (rotation == 0) {
                removeFlag(x, y, ClipFlag.W_OBJ);
                removeFlag(x - 1, y, ClipFlag.E_OBJ);
            }
            if (rotation == 1) {
                removeFlag(x, y, ClipFlag.N_OBJ);
                removeFlag(x, y + 1, ClipFlag.S_OBJ);
            }
            if (rotation == 2) {
                removeFlag(x, y, ClipFlag.E_OBJ);
                removeFlag(x + 1, y, ClipFlag.W_OBJ);
            }
            if (rotation == 3) {
                removeFlag(x, y, ClipFlag.S_OBJ);
                removeFlag(x, y - 1, ClipFlag.N_OBJ);
            }
        }
        if (type == 1 || type == 3) {
            if (rotation == 0) {
                removeFlag(x, y, ClipFlag.NW_OBJ);
                removeFlag(x - 1, y + 1, ClipFlag.SE_OBJ);
            }
            if (rotation == 1) {
                removeFlag(x, y, ClipFlag.NE_OBJ);
                removeFlag(x + 1, y + 1, ClipFlag.SW_OBJ);
            }
            if (rotation == 2) {
                removeFlag(x, y, ClipFlag.SE_OBJ);
                removeFlag(x + 1, y - 1, ClipFlag.NW_OBJ);
            }
            if (rotation == 3) {
                removeFlag(x, y, ClipFlag.SW_OBJ);
                removeFlag(x - 1, y - 1, ClipFlag.NE_OBJ);
            }
        }
        if (type == 2) {
            if (rotation == 0) {
                removeFlag(x, y, ClipFlag.N_OBJ, ClipFlag.W_OBJ);
                removeFlag(x - 1, y, ClipFlag.E_OBJ);
                removeFlag(x, y + 1, ClipFlag.S_OBJ);
            }
            if (rotation == 1) {
                removeFlag(x, y, ClipFlag.N_OBJ, ClipFlag.E_OBJ);
                removeFlag(x, y + 1, ClipFlag.S_OBJ);
                removeFlag(x + 1, y, ClipFlag.W_OBJ);
            }
            if (rotation == 2) {
                removeFlag(x, y, ClipFlag.E_OBJ, ClipFlag.S_OBJ);
                removeFlag(x + 1, y, ClipFlag.W_OBJ);
                removeFlag(x, y - 1, ClipFlag.N_OBJ);
            }
            if (rotation == 3) {
                removeFlag(x, y, ClipFlag.S_OBJ, ClipFlag.W_OBJ);
                removeFlag(x, y - 1, ClipFlag.N_OBJ);
                removeFlag(x - 1, y, ClipFlag.E_OBJ);
            }
        }
        if (blocks) {
            if (type == 0) {
                if (rotation == 0) {
                    removeFlag(x, y, ClipFlag.W_BOUND);
                    removeFlag(x - 1, y, ClipFlag.E_BOUND);
                }
                if (rotation == 1) {
                    removeFlag(x, y, ClipFlag.N_BOUND);
                    removeFlag(x, y + 1, ClipFlag.S_BOUND);
                }
                if (rotation == 2) {
                    removeFlag(x, y, ClipFlag.E_BOUND);
                    removeFlag(x + 1, y, ClipFlag.W_BOUND);
                }
                if (rotation == 3) {
                    removeFlag(x, y, ClipFlag.S_BOUND);
                    removeFlag(x, y - 1, ClipFlag.N_BOUND);
                }
            }
            if (type == 1 || type == 3) {
                if (rotation == 0) {
                    removeFlag(x, y, ClipFlag.NW_BOUND);
                    removeFlag(x - 1, y + 1, ClipFlag.SE_BOUND);
                }
                if (rotation == 1) {
                    removeFlag(x, y, ClipFlag.NE_BOUND);
                    removeFlag(x + 1, y + 1, ClipFlag.SW_BOUND);
                }
                if (rotation == 2) {
                    removeFlag(x, y, ClipFlag.SE_BOUND);
                    removeFlag(x + 1, y - 1, ClipFlag.NW_BOUND);
                }
                if (rotation == 3) {
                    removeFlag(x, y, ClipFlag.SW_BOUND);
                    removeFlag(x - 1, y - 1, ClipFlag.NE_BOUND);
                }
            }
            if (type == 2) {
                if (rotation == 0) {
                    removeFlag(x, y, ClipFlag.N_BOUND, ClipFlag.W_BOUND);
                    removeFlag(x - 1, y, ClipFlag.E_BOUND);
                    removeFlag(x, y + 1, ClipFlag.S_BOUND);
                }
                if (rotation == 1) {
                    removeFlag(x, y, ClipFlag.N_BOUND, ClipFlag.E_BOUND);
                    removeFlag(x, y + 1, ClipFlag.S_BOUND);
                    removeFlag(x + 1, y, ClipFlag.W_BOUND);
                }
                if (rotation == 2) {
                    removeFlag(x, y, ClipFlag.E_BOUND, ClipFlag.S_BOUND);
                    removeFlag(x + 1, y, ClipFlag.W_BOUND);
                    removeFlag(x, y - 1, ClipFlag.N_BOUND);
                }
                if (rotation == 3) {
                    removeFlag(x, y, ClipFlag.S_BOUND, ClipFlag.W_BOUND);
                    removeFlag(x, y - 1, ClipFlag.N_BOUND);
                    removeFlag(x - 1, y, ClipFlag.E_BOUND);
                }
            }
        }
        if (notAlternative) {
            if (type == 0) {
                if (rotation == 0) {
                    removeFlag(x, y, ClipFlag.W_ALT_OBJ);
                    removeFlag(x - 1, y, ClipFlag.E_ALT_OBJ);
                }
                if (rotation == 1) {
                    removeFlag(x, y, ClipFlag.N_ALT_OBJ);
                    removeFlag(x, y + 1, ClipFlag.S_ALT_OBJ);
                }
                if (rotation == 2) {
                    removeFlag(x, y, ClipFlag.E_ALT_OBJ);
                    removeFlag(x + 1, y, ClipFlag.W_ALT_OBJ);
                }
                if (rotation == 3) {
                    removeFlag(x, y, ClipFlag.S_ALT_OBJ);
                    removeFlag(x, y - 1, ClipFlag.N_ALT_OBJ);
                }
            }
            if (type == 1 || type == 3) {
                if (rotation == 0) {
                    removeFlag(x, y, ClipFlag.NW_ALT_OBJ);
                    removeFlag(x - 1, y + 1, ClipFlag.SE_ALT_OBJ);
                }
                if (rotation == 1) {
                    removeFlag(x, y, ClipFlag.NE_ALT_OBJ);
                    removeFlag(x + 1, y + 1, ClipFlag.SW_ALT_OBJ);
                }
                if (rotation == 2) {
                    removeFlag(x, y, ClipFlag.SE_ALT_OBJ);
                    removeFlag(x + 1, y - 1, ClipFlag.NW_ALT_OBJ);
                }
                if (rotation == 3) {
                    removeFlag(x, y, ClipFlag.SW_ALT_OBJ);
                    removeFlag(x - 1, y - 1, ClipFlag.NE_ALT_OBJ);
                }
            }
            if (type == 2) {
                if (rotation == 0) {
                    removeFlag(x, y, ClipFlag.N_ALT_OBJ, ClipFlag.W_ALT_OBJ);
                    removeFlag(x - 1, y, ClipFlag.E_ALT_OBJ);
                    removeFlag(x, y + 1, ClipFlag.S_ALT_OBJ);
                }
                if (rotation == 1) {
                    removeFlag(x, y, ClipFlag.N_ALT_OBJ, ClipFlag.E_ALT_OBJ);
                    removeFlag(x, y + 1, ClipFlag.S_ALT_OBJ);
                    removeFlag(x + 1, y, ClipFlag.W_ALT_OBJ);
                }
                if (rotation == 2) {
                    removeFlag(x, y, ClipFlag.E_ALT_OBJ, ClipFlag.S_ALT_OBJ);
                    removeFlag(x + 1, y, ClipFlag.W_ALT_OBJ);
                    removeFlag(x, y - 1, ClipFlag.N_ALT_OBJ);
                }
                if (rotation == 3) {
                    removeFlag(x, y, ClipFlag.S_ALT_OBJ, ClipFlag.W_ALT_OBJ);
                    removeFlag(x, y - 1, ClipFlag.N_ALT_OBJ);
                    removeFlag(x - 1, y, ClipFlag.E_ALT_OBJ);
                }
            }
        }
    }

    static final void method6007(int i_0, int[] ints_1, int i_2) {
        if (MovingAnimation.isInterfaceLoaded(i_0, ints_1, 214426228)) {
            IComponentDefinitions[] arr_3 = CustomCursorsPreference.INTERFACES[i_0].components;
            for (int i_4 = 0; i_4 < arr_3.length; i_4++) {
                IComponentDefinitions icomponentdefinitions_5 = arr_3[i_4];
                if (icomponentdefinitions_5 != null && icomponentdefinitions_5.anim != null) {
                    icomponentdefinitions_5.anim.method7582((byte) -62);
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
