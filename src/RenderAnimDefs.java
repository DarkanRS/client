import java.util.Iterator;

public class RenderAnimDefs {

	public int renderAnimId;
	RenderAnimIndexLoader aClass211_2788;
	static int anInt2831;
	public int defaultStandAnimation = -1;
	public int walkAnimation = -1;
	public int anInt2801 = -1;
	public int anInt2828 = -1;
	public int anInt2803 = -1;
	public int anInt2812 = -1;
	public int anInt2797 = -1;
	public int walkDir6 = -1;
	public int anInt2799 = -1;
	public int anInt2800 = -1;
	public int anInt2786 = 0;
	public int anInt2829 = 0;
	public int[] anIntArray2811;
	public int[][] anIntArrayArray2802;
	public int anInt2820 = 0;
	public int anInt2804 = 0;
	public int anInt2825 = 0;
	public int anInt2823 = 0;
	public int anInt2824 = 0;
	public int anInt2816 = 0;
	public int anInt2815 = 0;
	public int anInt2827 = 0;
	public int anInt2826 = -1;
	public int walkDir1 = -1;
	public int walkDir2 = -1;
	public int walkDir3 = -1;
	public int walkDir4 = -1;
	public int walkDir5 = -1;
	public int anInt2798 = -1;
	public int anInt2830 = -1;
	public int anInt2806 = -1;
	public int anInt2807 = -1;
	public int anInt2808 = -1;
	public int anInt2809 = -1;
	public int anInt2810 = -1;
	public int[] anIntArray2814 = null;
	public int[] anIntArray2789 = null;
	public boolean aBool2787 = true;
	public int anInt2813 = 0;
	public int anInt2790 = 0;
	int anInt2822 = 0;
	public int[] anIntArray2818;
	public int[][] anIntArrayArray2791;
	Matrix44Var[] aClass294Array2805;

	void method3808(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		if (i_2 == 1) {
			this.defaultStandAnimation = rsbytebuffer_1.readBigSmart();
			this.walkAnimation = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 2) {
			this.anInt2801 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 3) {
			this.anInt2828 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 4) {
			this.anInt2803 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 5) {
			this.anInt2812 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 6) {
			this.anInt2797 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 7) {
			this.walkDir6 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 8) {
			this.anInt2799 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 9) {
			this.anInt2800 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 26) {
			this.anInt2786 = (short) (rsbytebuffer_1.readUnsignedByte() * 4);
			this.anInt2829 = (short) (rsbytebuffer_1.readUnsignedByte() * 4);
		} else {
			int i_4;
			int i_5;
			if (i_2 == 27) {
				if (this.anIntArrayArray2802 == null) {
					this.anIntArrayArray2802 = new int[this.aClass211_2788.aClass526_2672.equipmentSlots.length][];
				}

				i_4 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArrayArray2802[i_4] = new int[6];

				for (i_5 = 0; i_5 < 6; i_5++) {
					this.anIntArrayArray2802[i_4][i_5] = rsbytebuffer_1.readShort();
				}
			} else if (i_2 == 28) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray2811 = new int[i_4];

				for (i_5 = 0; i_5 < i_4; i_5++) {
					this.anIntArray2811[i_5] = rsbytebuffer_1.readUnsignedByte();
					if (this.anIntArray2811[i_5] == 255) {
						this.anIntArray2811[i_5] = -1;
					}
				}
			} else if (i_2 == 29) {
				this.anInt2820 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 30) {
				this.anInt2804 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 31) {
				this.anInt2825 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 32) {
				this.anInt2823 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 33) {
				this.anInt2824 = rsbytebuffer_1.readShort();
			} else if (i_2 == 34) {
				this.anInt2816 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 35) {
				this.anInt2815 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 36) {
				this.anInt2827 = rsbytebuffer_1.readShort();
			} else if (i_2 == 37) {
				this.anInt2826 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 38) {
				this.walkDir1 = rsbytebuffer_1.readBigSmart();
			} else if (i_2 == 39) {
				this.walkDir2 = rsbytebuffer_1.readBigSmart();
			} else if (i_2 == 40) {
				this.walkDir3 = rsbytebuffer_1.readBigSmart();
			} else if (i_2 == 41) {
				this.walkDir4 = rsbytebuffer_1.readBigSmart();
			} else if (i_2 == 42) {
				this.walkDir5 = rsbytebuffer_1.readBigSmart();
			} else if (i_2 == 43) {
				rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 44) {
				rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 45) {
				this.anInt2798 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 46) {
				this.anInt2830 = rsbytebuffer_1.readBigSmart();
			} else if (i_2 == 47) {
				this.anInt2806 = rsbytebuffer_1.readBigSmart();
			} else if (i_2 == 48) {
				this.anInt2807 = rsbytebuffer_1.readBigSmart();
			} else if (i_2 == 49) {
				this.anInt2808 = rsbytebuffer_1.readBigSmart();
			} else if (i_2 == 50) {
				this.anInt2809 = rsbytebuffer_1.readBigSmart();
			} else if (i_2 == 51) {
				this.anInt2810 = rsbytebuffer_1.readBigSmart();
			} else if (i_2 == 52) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray2814 = new int[i_4];
				this.anIntArray2789 = new int[i_4];

				for (i_5 = 0; i_5 < i_4; i_5++) {
					this.anIntArray2814[i_5] = rsbytebuffer_1.readBigSmart();
					int i_6 = rsbytebuffer_1.readUnsignedByte();
					this.anIntArray2789[i_5] = i_6;
					this.anInt2822 += i_6;
				}
			} else if (i_2 == 53) {
				this.aBool2787 = false;
			} else if (i_2 == 54) {
				this.anInt2813 = rsbytebuffer_1.readUnsignedByte() << 6;
				this.anInt2790 = rsbytebuffer_1.readUnsignedByte() << 6;
			} else if (i_2 == 55) {
				if (this.anIntArray2818 == null) {
					this.anIntArray2818 = new int[this.aClass211_2788.aClass526_2672.equipmentSlots.length];
				}

				i_4 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray2818[i_4] = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 56) {
				if (this.anIntArrayArray2791 == null) {
					this.anIntArrayArray2791 = new int[this.aClass211_2788.aClass526_2672.equipmentSlots.length][];
				}

				i_4 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArrayArray2791[i_4] = new int[3];

				for (i_5 = 0; i_5 < 3; i_5++) {
					this.anIntArrayArray2791[i_4][i_5] = rsbytebuffer_1.readShort();
				}
			}
		}

	}

	public int method3809(int i_1) {
		if (this.defaultStandAnimation != -1) {
			return this.defaultStandAnimation;
		} else if (this.anIntArray2814 == null) {
			return -1;
		} else {
			int i_2 = (int) (Math.random() * (double) this.anInt2822);

			int i_3;
			for (i_3 = 0; i_2 >= this.anIntArray2789[i_3]; i_3++) {
				i_2 -= this.anIntArray2789[i_3];
			}

			return this.anIntArray2814[i_3];
		}
	}

	public boolean method3810(int i_1, int i_2) {
		if (i_1 == -1) {
			return false;
		} else if (this.defaultStandAnimation == i_1) {
			return true;
		} else {
			if (this.anIntArray2814 != null) {
				for (int i_3 = 0; i_3 < this.anIntArray2814.length; i_3++) {
					if (this.anIntArray2814[i_3] == i_1) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public Matrix44Var[] method3811(byte b_1) {
		if (this.aClass294Array2805 != null) {
			return this.aClass294Array2805;
		} else if (this.anIntArrayArray2802 == null) {
			return null;
		} else {
			this.aClass294Array2805 = new Matrix44Var[this.anIntArrayArray2802.length];

			for (int i_2 = 0; i_2 < this.anIntArrayArray2802.length; i_2++) {
				int i_3 = 0;
				int i_4 = 0;
				int i_5 = 0;
				int i_6 = 0;
				int i_7 = 0;
				int i_8 = 0;
				if (this.anIntArrayArray2802[i_2] != null) {
					i_3 = this.anIntArrayArray2802[i_2][0];
					i_4 = this.anIntArrayArray2802[i_2][1];
					i_5 = this.anIntArrayArray2802[i_2][2];
					i_6 = this.anIntArrayArray2802[i_2][3] << 3;
					i_7 = this.anIntArrayArray2802[i_2][4] << 3;
					i_8 = this.anIntArrayArray2802[i_2][5] << 3;
				}

				if (i_3 != 0 || i_4 != 0 || i_5 != 0 || i_6 != 0 || i_7 != 0 || i_8 != 0) {
					Matrix44Var matrix44var_9 = this.aClass294Array2805[i_2] = new Matrix44Var();
					if (i_8 != 0) {
						matrix44var_9.method5220(0.0F, 0.0F, 1.0F, Class382.method6508(i_8));
					}

					if (i_6 != 0) {
						matrix44var_9.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(i_6));
					}

					if (i_7 != 0) {
						matrix44var_9.method5220(0.0F, 1.0F, 0.0F, Class382.method6508(i_7));
					}

					matrix44var_9.method5219((float) i_3, (float) i_4, (float) i_5);
				}
			}

			return this.aClass294Array2805;
		}
	}

	void method3821(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method3808(rsbytebuffer_1, i_3, -374840735);
		}
	}

	public int[] method3828(int i_1) {
		IterableNodeMap iterablenodemap_2 = new IterableNodeMap(16);
		Class1.method253(this.defaultStandAnimation, iterablenodemap_2, 1339333196);
		int[] ints_3;
		int i_4;
		if (this.anIntArray2814 != null) {
			ints_3 = this.anIntArray2814;

			for (i_4 = 0; i_4 < ints_3.length; i_4++) {
				int i_7 = ints_3[i_4];
				Class1.method253(i_7, iterablenodemap_2, -371482637);
			}
		}

		Class1.method253(this.walkDir1, iterablenodemap_2, 936766272);
		Class1.method253(this.walkDir2, iterablenodemap_2, 617830168);
		Class1.method253(this.walkAnimation, iterablenodemap_2, 622026359);
		Class1.method253(this.walkDir3, iterablenodemap_2, -1286273225);
		Class1.method253(this.walkDir4, iterablenodemap_2, 1136269352);
		Class1.method253(this.walkDir5, iterablenodemap_2, 981784054);
		Class1.method253(this.anInt2797, iterablenodemap_2, -432276567);
		Class1.method253(this.walkDir6, iterablenodemap_2, -24099782);
		Class1.method253(this.anInt2799, iterablenodemap_2, -472783883);
		Class1.method253(this.anInt2800, iterablenodemap_2, 843907387);
		Class1.method253(this.anInt2801, iterablenodemap_2, -622930621);
		Class1.method253(this.anInt2828, iterablenodemap_2, -405283185);
		Class1.method253(this.anInt2803, iterablenodemap_2, -576014447);
		Class1.method253(this.anInt2812, iterablenodemap_2, 1786049859);
		Class1.method253(this.anInt2830, iterablenodemap_2, 918825528);
		Class1.method253(this.anInt2806, iterablenodemap_2, 854789085);
		Class1.method253(this.anInt2807, iterablenodemap_2, 230817910);
		Class1.method253(this.anInt2808, iterablenodemap_2, -1749638);
		Class1.method253(this.anInt2809, iterablenodemap_2, 2115368709);
		Class1.method253(this.anInt2810, iterablenodemap_2, -1020829225);
		ints_3 = new int[iterablenodemap_2.method7748((short) 9430)];
		i_4 = 0;

		Node node_6;
		for (Iterator iterator_5 = iterablenodemap_2.iterator(); iterator_5.hasNext(); ints_3[i_4++] = (int) node_6.data) {
			node_6 = (Node) iterator_5.next();
		}

		return ints_3;
	}

	static final void method3829(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class412.aByte4963;
	}

	static final void method3830(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = Preference.method7788((long) cs2executor_0.intStack[--cs2executor_0.intStackPtr] * 60000L, Class223.CURRENT_LANGUAGE.method243((byte) 1), true, 1560112549) + " UTC";
	}

}
