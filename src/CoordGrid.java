public class CoordGrid {

    static Index PARTICLE_INDEX;

    public int level;

    public int x;

    public int y;

    public String toString() {
        return this.level + "," + (this.x >> 6) + "," + (this.y >> 6) + "," + (this.x & 0x3f) + "," + (this.y & 0x3f);
    }

    public CoordGrid(int i_1) {
        if (i_1 == -1) {
            this.level = -1;
        } else {
            this.level = i_1 >> 28 & 0x3;
            this.x = i_1 >> 14 & 0x3fff;
            this.y = i_1 & 0x3fff;
        }
    }

    public CoordGrid() {
        this.level = -1;
    }

    public CoordGrid(int i_1, int i_2, int i_3) {
        this.level = i_1;
        this.x = i_2;
        this.y = i_3;
    }
}
