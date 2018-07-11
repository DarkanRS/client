/* Class336 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ClipMap {
	public int[][] map;
	public int offsetX;
	public int offsetY;
	int sizeX;
	int sizeY;
	static int anInt3968;

	public void method5965(byte i) {
		for (int i_1_ = 0; i_1_ < ((ClipMap) this).sizeX * -1208414035; i_1_++) {
			for (int i_2_ = 0; i_2_ < 117800569 * ((ClipMap) this).sizeY; i_2_++) {
				if (0 == i_1_ || i_2_ == 0 || i_1_ >= -1208414035 * ((ClipMap) this).sizeX - 5 || i_2_ >= 117800569 * ((ClipMap) this).sizeY - 5)
					map[i_1_][i_2_] = -1;
				else
					map[i_1_][i_2_] = 2097152;
			}
		}
	}

	public void addObject(int localX, int localY, int i_5_, int i_6_, boolean projectileClipped, boolean notAlternative, byte i_8_) {
		int mask = 256;
		if (projectileClipped)
			mask |= 0x20000;
		if (notAlternative)
			mask |= 0x40000000;
		localX -= -1969357273 * offsetX;
		localY -= 1503444365 * offsetY;
		for (int x = localX; x < localX + i_5_; x++) {
			if (x >= 0 && x < -1208414035 * ((ClipMap) this).sizeX) {
				for (int y = localY; y < localY + i_6_; y++) {
					if (y >= 0 && y < 117800569 * ((ClipMap) this).sizeY)
						addMask(x, y, mask, (byte) -45);
				}
			}
		}
	}

	public void addBlockFloorDeco(int i, int i_12_, int i_13_) {
		i -= -1969357273 * offsetX;
		i_12_ -= offsetY * 1503444365;
		map[i][i_12_] |= 0x40000;
	}

	public void method5970(int i, int i_15_, int i_16_, int i_17_, int i_18_, boolean bool, boolean bool_19_, int i_20_) {
		int mask = 256;
		if (bool)
			mask |= 0x20000;
		if (bool_19_)
			mask |= 0x40000000;
		i -= offsetX * -1969357273;
		i_15_ -= offsetY * 1503444365;
		if (1 == i_18_ || i_18_ == 3) {
			int i_22_ = i_16_;
			i_16_ = i_17_;
			i_17_ = i_22_;
		}
		for (int x = i; x < i + i_16_; x++) {
			if (x >= 0 && x < -1208414035 * ((ClipMap) this).sizeX) {
				for (int y = i_15_; y < i_17_ + i_15_; y++) {
					if (y >= 0 && y < ((ClipMap) this).sizeY * 117800569)
						method5973(x, y, mask, (byte) 121);
				}
			}
		}
	}

	public void method5971(int i, int i_25_, int i_26_, int i_27_, boolean bool, boolean bool_28_, int i_29_) {
		i -= offsetX * -1969357273;
		i_25_ -= 1503444365 * offsetY;
		if (i_26_ == 0) {
			if (0 == i_27_) {
				addMask(i, i_25_, 128, (byte) -66);
				addMask(i - 1, i_25_, 8, (byte) -78);
			}
			if (1 == i_27_) {
				addMask(i, i_25_, 2, (byte) -8);
				addMask(i, i_25_ + 1, 32, (byte) -40);
			}
			if (i_27_ == 2) {
				addMask(i, i_25_, 8, (byte) -5);
				addMask(1 + i, i_25_, 128, (byte) -55);
			}
			if (3 == i_27_) {
				addMask(i, i_25_, 32, (byte) -4);
				addMask(i, i_25_ - 1, 2, (byte) -73);
			}
		}
		if (1 == i_26_ || 3 == i_26_) {
			if (0 == i_27_) {
				addMask(i, i_25_, 1, (byte) -65);
				addMask(i - 1, i_25_ + 1, 16, (byte) -1);
			}
			if (i_27_ == 1) {
				addMask(i, i_25_, 4, (byte) -113);
				addMask(i + 1, 1 + i_25_, 64, (byte) -40);
			}
			if (i_27_ == 2) {
				addMask(i, i_25_, 16, (byte) -55);
				addMask(i + 1, i_25_ - 1, 1, (byte) -106);
			}
			if (3 == i_27_) {
				addMask(i, i_25_, 64, (byte) -119);
				addMask(i - 1, i_25_ - 1, 4, (byte) -35);
			}
		}
		if (i_26_ == 2) {
			if (i_27_ == 0) {
				addMask(i, i_25_, 130, (byte) -57);
				addMask(i - 1, i_25_, 8, (byte) -10);
				addMask(i, 1 + i_25_, 32, (byte) -15);
			}
			if (1 == i_27_) {
				addMask(i, i_25_, 10, (byte) -5);
				addMask(i, 1 + i_25_, 32, (byte) -98);
				addMask(1 + i, i_25_, 128, (byte) -13);
			}
			if (i_27_ == 2) {
				addMask(i, i_25_, 40, (byte) -32);
				addMask(1 + i, i_25_, 128, (byte) -104);
				addMask(i, i_25_ - 1, 2, (byte) -11);
			}
			if (i_27_ == 3) {
				addMask(i, i_25_, 160, (byte) -41);
				addMask(i, i_25_ - 1, 2, (byte) -112);
				addMask(i - 1, i_25_, 8, (byte) -103);
			}
		}
		if (bool) {
			if (i_26_ == 0) {
				if (0 == i_27_) {
					addMask(i, i_25_, 65536, (byte) -54);
					addMask(i - 1, i_25_, 4096, (byte) -117);
				}
				if (i_27_ == 1) {
					addMask(i, i_25_, 1024, (byte) -86);
					addMask(i, 1 + i_25_, 16384, (byte) -114);
				}
				if (i_27_ == 2) {
					addMask(i, i_25_, 4096, (byte) -112);
					addMask(1 + i, i_25_, 65536, (byte) -88);
				}
				if (3 == i_27_) {
					addMask(i, i_25_, 16384, (byte) -20);
					addMask(i, i_25_ - 1, 1024, (byte) -12);
				}
			}
			if (1 == i_26_ || i_26_ == 3) {
				if (i_27_ == 0) {
					addMask(i, i_25_, 512, (byte) -118);
					addMask(i - 1, i_25_ + 1, 8192, (byte) -106);
				}
				if (1 == i_27_) {
					addMask(i, i_25_, 2048, (byte) -15);
					addMask(i + 1, 1 + i_25_, 32768, (byte) -59);
				}
				if (2 == i_27_) {
					addMask(i, i_25_, 8192, (byte) -115);
					addMask(i + 1, i_25_ - 1, 512, (byte) -60);
				}
				if (i_27_ == 3) {
					addMask(i, i_25_, 32768, (byte) -88);
					addMask(i - 1, i_25_ - 1, 2048, (byte) -40);
				}
			}
			if (i_26_ == 2) {
				if (0 == i_27_) {
					addMask(i, i_25_, 66560, (byte) -32);
					addMask(i - 1, i_25_, 4096, (byte) -5);
					addMask(i, i_25_ + 1, 16384, (byte) -16);
				}
				if (i_27_ == 1) {
					addMask(i, i_25_, 5120, (byte) -17);
					addMask(i, 1 + i_25_, 16384, (byte) -115);
					addMask(i + 1, i_25_, 65536, (byte) -83);
				}
				if (i_27_ == 2) {
					addMask(i, i_25_, 20480, (byte) -124);
					addMask(1 + i, i_25_, 65536, (byte) -78);
					addMask(i, i_25_ - 1, 1024, (byte) -2);
				}
				if (3 == i_27_) {
					addMask(i, i_25_, 81920, (byte) -97);
					addMask(i, i_25_ - 1, 1024, (byte) -22);
					addMask(i - 1, i_25_, 4096, (byte) -53);
				}
			}
		}
		if (bool_28_) {
			if (i_26_ == 0) {
				if (i_27_ == 0) {
					addMask(i, i_25_, 536870912, (byte) -6);
					addMask(i - 1, i_25_, 33554432, (byte) -69);
				}
				if (i_27_ == 1) {
					addMask(i, i_25_, 8388608, (byte) -99);
					addMask(i, i_25_ + 1, 134217728, (byte) -100);
				}
				if (2 == i_27_) {
					addMask(i, i_25_, 33554432, (byte) -18);
					addMask(i + 1, i_25_, 536870912, (byte) -23);
				}
				if (i_27_ == 3) {
					addMask(i, i_25_, 134217728, (byte) -104);
					addMask(i, i_25_ - 1, 8388608, (byte) -88);
				}
			}
			if (i_26_ == 1 || 3 == i_26_) {
				if (i_27_ == 0) {
					addMask(i, i_25_, 4194304, (byte) -116);
					addMask(i - 1, i_25_ + 1, 67108864, (byte) -95);
				}
				if (i_27_ == 1) {
					addMask(i, i_25_, 16777216, (byte) -120);
					addMask(i + 1, 1 + i_25_, 268435456, (byte) -127);
				}
				if (2 == i_27_) {
					addMask(i, i_25_, 67108864, (byte) -59);
					addMask(1 + i, i_25_ - 1, 4194304, (byte) -92);
				}
				if (i_27_ == 3) {
					addMask(i, i_25_, 268435456, (byte) -63);
					addMask(i - 1, i_25_ - 1, 16777216, (byte) -69);
				}
			}
			if (2 == i_26_) {
				if (i_27_ == 0) {
					addMask(i, i_25_, 545259520, (byte) -108);
					addMask(i - 1, i_25_, 33554432, (byte) -103);
					addMask(i, i_25_ + 1, 134217728, (byte) -9);
				}
				if (1 == i_27_) {
					addMask(i, i_25_, 41943040, (byte) -99);
					addMask(i, i_25_ + 1, 134217728, (byte) -27);
					addMask(i + 1, i_25_, 536870912, (byte) -124);
				}
				if (2 == i_27_) {
					addMask(i, i_25_, 167772160, (byte) -67);
					addMask(1 + i, i_25_, 536870912, (byte) -102);
					addMask(i, i_25_ - 1, 8388608, (byte) -115);
				}
				if (3 == i_27_) {
					addMask(i, i_25_, 671088640, (byte) -1);
					addMask(i, i_25_ - 1, 8388608, (byte) -83);
					addMask(i - 1, i_25_, 33554432, (byte) -81);
				}
			}
		}
	}

	public void addUnwalkable(int i, int i_30_, int i_31_) {
		i -= -1969357273 * offsetX;
		i_30_ -= 1503444365 * offsetY;
		map[i][i_30_] |= 0x200000;
	}

	void method5973(int i, int i_32_, int i_33_, byte i_34_) {
		map[i][i_32_] &= i_33_ ^ 0xffffffff;
	}

	public void method5974(int i, int i_35_, int i_36_) {
		i -= offsetX * -1969357273;
		i_35_ -= offsetY * 1503444365;
		map[i][i_35_] &= ~0x200000;
	}
	
	void addMask(int i, int i_48_, int i_49_, byte i_50_) {
		map[i][i_48_] |= i_49_;
	}

	public boolean method5978(int i, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_) {
		int i_60_ = i + i_52_;
		int i_61_ = i_53_ + i_51_;
		int i_62_ = i_56_ + i_54_;
		int i_63_ = i_55_ + i_57_;
		if (i == i_62_ && 0 == (i_58_ & 0x2)) {
			int i_64_ = i_51_ > i_55_ ? i_51_ : i_55_;
			for (int i_65_ = i_61_ < i_63_ ? i_61_ : i_63_; i_64_ < i_65_; i_64_++) {
				if (((map[i_62_ - 1 - -1969357273 * offsetX][i_64_ - 1503444365 * offsetY]) & 0x8) == 0)
					return true;
			}
		} else if (i_60_ == i_54_ && 0 == (i_58_ & 0x8)) {
			int i_66_ = i_51_ > i_55_ ? i_51_ : i_55_;
			for (int i_67_ = i_61_ < i_63_ ? i_61_ : i_63_; i_66_ < i_67_; i_66_++) {
				if (0 == ((map[i_54_ - offsetX * -1969357273][i_66_ - 1503444365 * offsetY]) & 0x80))
					return true;
			}
		} else if (i_51_ == i_63_ && 0 == (i_58_ & 0x1)) {
			int i_68_ = i > i_54_ ? i : i_54_;
			for (int i_69_ = i_60_ < i_62_ ? i_60_ : i_62_; i_68_ < i_69_; i_68_++) {
				if (0 == ((map[i_68_ - offsetX * -1969357273][i_63_ - 1 - offsetY * 1503444365]) & 0x2))
					return true;
			}
		} else if (i_61_ == i_55_ && 0 == (i_58_ & 0x4)) {
			int i_70_ = i > i_54_ ? i : i_54_;
			for (int i_71_ = i_60_ < i_62_ ? i_60_ : i_62_; i_70_ < i_71_; i_70_++) {
				if (0 == ((map[i_70_ - -1969357273 * offsetX][i_55_ - 1503444365 * offsetY]) & 0x20))
					return true;
			}
		}
		return false;
	}

	public boolean method5986(int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_, int i_91_, short i_92_) {
		if (i_87_ == 1) {
			if (i_88_ == i && i_86_ == i_89_)
				return true;
		} else if (i_88_ >= i && i_88_ <= i + i_87_ - 1 && i_89_ >= i_89_ && i_89_ <= i_87_ + i_89_ - 1)
			return true;
		i -= offsetX * -1969357273;
		i_86_ -= offsetY * 1503444365;
		i_88_ -= offsetX * -1969357273;
		i_89_ -= offsetY * 1503444365;
		if (1 == i_87_) {
			if (i_90_ == 0) {
				if (0 == i_91_) {
					if (i == i_88_ - 1 && i_89_ == i_86_)
						return true;
					if (i_88_ == i && 1 + i_89_ == i_86_ && (map[i][i_86_] & 0x2c0120) == 0)
						return true;
					if (i == i_88_ && i_89_ - 1 == i_86_ && (map[i][i_86_] & 0x2c0102) == 0)
						return true;
				} else if (i_91_ == 1) {
					if (i == i_88_ && 1 + i_89_ == i_86_)
						return true;
					if (i == i_88_ - 1 && i_86_ == i_89_ && (map[i][i_86_] & 0x2c0108) == 0)
						return true;
					if (i == i_88_ + 1 && i_86_ == i_89_ && 0 == (map[i][i_86_] & 0x2c0180))
						return true;
				} else if (2 == i_91_) {
					if (i == 1 + i_88_ && i_89_ == i_86_)
						return true;
					if (i == i_88_ && i_86_ == i_89_ + 1 && 0 == (map[i][i_86_] & 0x2c0120))
						return true;
					if (i_88_ == i && i_86_ == i_89_ - 1 && 0 == (map[i][i_86_] & 0x2c0102))
						return true;
				} else if (3 == i_91_) {
					if (i == i_88_ && i_86_ == i_89_ - 1)
						return true;
					if (i == i_88_ - 1 && i_86_ == i_89_ && (map[i][i_86_] & 0x2c0108) == 0)
						return true;
					if (i == 1 + i_88_ && i_89_ == i_86_ && 0 == (map[i][i_86_] & 0x2c0180))
						return true;
				}
			}
			if (i_90_ == 2) {
				if (0 == i_91_) {
					if (i == i_88_ - 1 && i_86_ == i_89_)
						return true;
					if (i == i_88_ && i_86_ == 1 + i_89_)
						return true;
					if (1 + i_88_ == i && i_86_ == i_89_ && 0 == (map[i][i_86_] & 0x2c0180))
						return true;
					if (i == i_88_ && i_89_ - 1 == i_86_ && 0 == (map[i][i_86_] & 0x2c0102))
						return true;
				} else if (1 == i_91_) {
					if (i == i_88_ - 1 && i_86_ == i_89_ && 0 == (map[i][i_86_] & 0x2c0108))
						return true;
					if (i == i_88_ && 1 + i_89_ == i_86_)
						return true;
					if (i == i_88_ + 1 && i_86_ == i_89_)
						return true;
					if (i_88_ == i && i_86_ == i_89_ - 1 && 0 == (map[i][i_86_] & 0x2c0102))
						return true;
				} else if (2 == i_91_) {
					if (i_88_ - 1 == i && i_89_ == i_86_ && (map[i][i_86_] & 0x2c0108) == 0)
						return true;
					if (i == i_88_ && i_89_ + 1 == i_86_ && (map[i][i_86_] & 0x2c0120) == 0)
						return true;
					if (i_88_ + 1 == i && i_89_ == i_86_)
						return true;
					if (i == i_88_ && i_89_ - 1 == i_86_)
						return true;
				} else if (3 == i_91_) {
					if (i_88_ - 1 == i && i_89_ == i_86_)
						return true;
					if (i == i_88_ && i_86_ == i_89_ + 1 && (map[i][i_86_] & 0x2c0120) == 0)
						return true;
					if (1 + i_88_ == i && i_86_ == i_89_ && 0 == (map[i][i_86_] & 0x2c0180))
						return true;
					if (i == i_88_ && i_89_ - 1 == i_86_)
						return true;
				}
			}
			if (9 == i_90_) {
				if (i == i_88_ && i_86_ == i_89_ + 1 && (map[i][i_86_] & 0x20) == 0)
					return true;
				if (i == i_88_ && i_89_ - 1 == i_86_ && 0 == (map[i][i_86_] & 0x2))
					return true;
				if (i_88_ - 1 == i && i_89_ == i_86_ && 0 == (map[i][i_86_] & 0x8))
					return true;
				if (1 + i_88_ == i && i_89_ == i_86_ && 0 == (map[i][i_86_] & 0x80))
					return true;
			}
		} else {
			int i_93_ = i + i_87_ - 1;
			int i_94_ = i_87_ + i_86_ - 1;
			if (i_90_ == 0) {
				if (i_91_ == 0) {
					if (i == i_88_ - i_87_ && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_89_ + 1 == i_86_ && (map[i_88_][i_86_] & 0x2c0120) == 0)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_ && (map[i_88_][i_94_] & 0x2c0102) == 0)
						return true;
				} else if (i_91_ == 1) {
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == 1 + i_89_)
						return true;
					if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (map[i_93_][i_89_] & 0x2c0108))
						return true;
					if (1 + i_88_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && (map[i][i_89_] & 0x2c0180) == 0)
						return true;
				} else if (i_91_ == 2) {
					if (i == 1 + i_88_ && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && 1 + i_89_ == i_86_ && 0 == (map[i_88_][i_86_] & 0x2c0120))
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_ && (map[i_88_][i_94_] & 0x2c0102) == 0)
						return true;
				} else if (i_91_ == 3) {
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_)
						return true;
					if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (map[i_93_][i_89_] & 0x2c0108))
						return true;
					if (1 + i_88_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && (map[i][i_89_] & 0x2c0180) == 0)
						return true;
				}
			}
			if (i_90_ == 2) {
				if (0 == i_91_) {
					if (i == i_88_ - i_87_ && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == 1 + i_89_)
						return true;
					if (i == i_88_ + 1 && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (map[i][i_89_] & 0x2c0180))
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_ && 0 == (map[i_88_][i_94_] & 0x2c0102))
						return true;
				} else if (1 == i_91_) {
					if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (map[i_93_][i_89_] & 0x2c0108))
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == 1 + i_89_)
						return true;
					if (i == i_88_ + 1 && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_ && 0 == (map[i_88_][i_94_] & 0x2c0102))
						return true;
				} else if (2 == i_91_) {
					if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && (map[i_93_][i_89_] & 0x2c0108) == 0)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && 1 + i_89_ == i_86_ && (map[i_88_][i_86_] & 0x2c0120) == 0)
						return true;
					if (1 + i_88_ == i && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_89_ - i_87_ == i_86_)
						return true;
				} else if (i_91_ == 3) {
					if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_)
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_89_ + 1 == i_86_ && 0 == (map[i_88_][i_86_] & 0x2c0120))
						return true;
					if (i_88_ + 1 == i && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (map[i][i_89_] & 0x2c0180))
						return true;
					if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_)
						return true;
				}
			}
			if (9 == i_90_) {
				if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == 1 + i_89_ && 0 == (map[i_88_][i_86_] & 0x2c0120))
					return true;
				if (i_88_ >= i && i_88_ <= i_93_ && i_86_ == i_89_ - i_87_ && 0 == (map[i_88_][i_94_] & 0x2c0102))
					return true;
				if (i_88_ - i_87_ == i && i_89_ >= i_86_ && i_89_ <= i_94_ && (map[i_93_][i_89_] & 0x2c0108) == 0)
					return true;
				if (i == i_88_ + 1 && i_89_ >= i_86_ && i_89_ <= i_94_ && 0 == (map[i][i_89_] & 0x2c0180))
					return true;
			}
		}
		return false;
	}

	public boolean method5988(int i, int i_96_, int i_97_, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_, byte i_103_) {
		if (i_97_ > 1) {
			if (Class325.method5790(i, i_96_, i_97_, i_97_, i_98_, i_99_, i_100_, i_101_, -386839744))
				return true;
			return method5978(i, i_96_, i_97_, i_97_, i_98_, i_99_, i_100_, i_101_, i_102_, -1585578368);
		}
		int i_104_ = i_100_ + i_98_ - 1;
		int i_105_ = i_101_ + i_99_ - 1;
		if (i >= i_98_ && i <= i_104_ && i_96_ >= i_99_ && i_96_ <= i_105_)
			return true;
		if (i_98_ - 1 == i && i_96_ >= i_99_ && i_96_ <= i_105_ && 0 == ((map[i - offsetX * -1969357273][i_96_ - offsetY * 1503444365]) & 0x8) && (i_102_ & 0x8) == 0)
			return true;
		if (i_104_ + 1 == i && i_96_ >= i_99_ && i_96_ <= i_105_ && 0 == ((map[i - -1969357273 * offsetX][i_96_ - 1503444365 * offsetY]) & 0x80) && 0 == (i_102_ & 0x2))
			return true;
		if (i_96_ == i_99_ - 1 && i >= i_98_ && i <= i_104_ && 0 == ((map[i - -1969357273 * offsetX][i_96_ - 1503444365 * offsetY]) & 0x2) && (i_102_ & 0x4) == 0)
			return true;
		if (i_96_ == i_105_ + 1 && i >= i_98_ && i <= i_104_ && 0 == ((map[i - offsetX * -1969357273][i_96_ - offsetY * 1503444365]) & 0x20) && 0 == (i_102_ & 0x1))
			return true;
		return false;
	}

	ClipMap() {
		/* empty */
	}

	public void method5991(int i, int i_112_, byte i_113_) {
		i -= offsetX * -1969357273;
		i_112_ -= 1503444365 * offsetY;
		map[i][i_112_] &= ~0x40000;
	}

	public void method5992(int i, int i_114_, int i_115_, int i_116_, boolean bool, boolean bool_117_, byte i_118_) {
		i -= -1969357273 * offsetX;
		i_114_ -= offsetY * 1503444365;
		if (i_115_ == 0) {
			if (i_116_ == 0) {
				method5973(i, i_114_, 128, (byte) 124);
				method5973(i - 1, i_114_, 8, (byte) 71);
			}
			if (i_116_ == 1) {
				method5973(i, i_114_, 2, (byte) 69);
				method5973(i, i_114_ + 1, 32, (byte) 69);
			}
			if (2 == i_116_) {
				method5973(i, i_114_, 8, (byte) 119);
				method5973(i + 1, i_114_, 128, (byte) 114);
			}
			if (3 == i_116_) {
				method5973(i, i_114_, 32, (byte) 113);
				method5973(i, i_114_ - 1, 2, (byte) 101);
			}
		}
		if (i_115_ == 1 || 3 == i_115_) {
			if (0 == i_116_) {
				method5973(i, i_114_, 1, (byte) 123);
				method5973(i - 1, 1 + i_114_, 16, (byte) 93);
			}
			if (1 == i_116_) {
				method5973(i, i_114_, 4, (byte) 122);
				method5973(i + 1, 1 + i_114_, 64, (byte) 68);
			}
			if (2 == i_116_) {
				method5973(i, i_114_, 16, (byte) 105);
				method5973(i + 1, i_114_ - 1, 1, (byte) 89);
			}
			if (i_116_ == 3) {
				method5973(i, i_114_, 64, (byte) 68);
				method5973(i - 1, i_114_ - 1, 4, (byte) 106);
			}
		}
		if (i_115_ == 2) {
			if (i_116_ == 0) {
				method5973(i, i_114_, 130, (byte) 112);
				method5973(i - 1, i_114_, 8, (byte) 74);
				method5973(i, 1 + i_114_, 32, (byte) 100);
			}
			if (1 == i_116_) {
				method5973(i, i_114_, 10, (byte) 122);
				method5973(i, i_114_ + 1, 32, (byte) 68);
				method5973(1 + i, i_114_, 128, (byte) 99);
			}
			if (2 == i_116_) {
				method5973(i, i_114_, 40, (byte) 73);
				method5973(i + 1, i_114_, 128, (byte) 102);
				method5973(i, i_114_ - 1, 2, (byte) 73);
			}
			if (3 == i_116_) {
				method5973(i, i_114_, 160, (byte) 114);
				method5973(i, i_114_ - 1, 2, (byte) 74);
				method5973(i - 1, i_114_, 8, (byte) 105);
			}
		}
		if (bool) {
			if (i_115_ == 0) {
				if (i_116_ == 0) {
					method5973(i, i_114_, 65536, (byte) 79);
					method5973(i - 1, i_114_, 4096, (byte) 124);
				}
				if (i_116_ == 1) {
					method5973(i, i_114_, 1024, (byte) 82);
					method5973(i, 1 + i_114_, 16384, (byte) 72);
				}
				if (2 == i_116_) {
					method5973(i, i_114_, 4096, (byte) 101);
					method5973(i + 1, i_114_, 65536, (byte) 119);
				}
				if (i_116_ == 3) {
					method5973(i, i_114_, 16384, (byte) 107);
					method5973(i, i_114_ - 1, 1024, (byte) 122);
				}
			}
			if (i_115_ == 1 || 3 == i_115_) {
				if (0 == i_116_) {
					method5973(i, i_114_, 512, (byte) 66);
					method5973(i - 1, i_114_ + 1, 8192, (byte) 126);
				}
				if (1 == i_116_) {
					method5973(i, i_114_, 2048, (byte) 127);
					method5973(i + 1, i_114_ + 1, 32768, (byte) 114);
				}
				if (2 == i_116_) {
					method5973(i, i_114_, 8192, (byte) 125);
					method5973(i + 1, i_114_ - 1, 512, (byte) 84);
				}
				if (i_116_ == 3) {
					method5973(i, i_114_, 32768, (byte) 116);
					method5973(i - 1, i_114_ - 1, 2048, (byte) 91);
				}
			}
			if (i_115_ == 2) {
				if (i_116_ == 0) {
					method5973(i, i_114_, 66560, (byte) 70);
					method5973(i - 1, i_114_, 4096, (byte) 88);
					method5973(i, 1 + i_114_, 16384, (byte) 121);
				}
				if (1 == i_116_) {
					method5973(i, i_114_, 5120, (byte) 66);
					method5973(i, i_114_ + 1, 16384, (byte) 101);
					method5973(1 + i, i_114_, 65536, (byte) 85);
				}
				if (2 == i_116_) {
					method5973(i, i_114_, 20480, (byte) 125);
					method5973(1 + i, i_114_, 65536, (byte) 107);
					method5973(i, i_114_ - 1, 1024, (byte) 118);
				}
				if (3 == i_116_) {
					method5973(i, i_114_, 81920, (byte) 91);
					method5973(i, i_114_ - 1, 1024, (byte) 69);
					method5973(i - 1, i_114_, 4096, (byte) 123);
				}
			}
		}
		if (bool_117_) {
			if (0 == i_115_) {
				if (i_116_ == 0) {
					method5973(i, i_114_, 536870912, (byte) 122);
					method5973(i - 1, i_114_, 33554432, (byte) 118);
				}
				if (i_116_ == 1) {
					method5973(i, i_114_, 8388608, (byte) 81);
					method5973(i, i_114_ + 1, 134217728, (byte) 90);
				}
				if (2 == i_116_) {
					method5973(i, i_114_, 33554432, (byte) 106);
					method5973(1 + i, i_114_, 536870912, (byte) 120);
				}
				if (i_116_ == 3) {
					method5973(i, i_114_, 134217728, (byte) 89);
					method5973(i, i_114_ - 1, 8388608, (byte) 68);
				}
			}
			if (i_115_ == 1 || 3 == i_115_) {
				if (i_116_ == 0) {
					method5973(i, i_114_, 4194304, (byte) 106);
					method5973(i - 1, 1 + i_114_, 67108864, (byte) 82);
				}
				if (i_116_ == 1) {
					method5973(i, i_114_, 16777216, (byte) 113);
					method5973(1 + i, i_114_ + 1, 268435456, (byte) 101);
				}
				if (i_116_ == 2) {
					method5973(i, i_114_, 67108864, (byte) 94);
					method5973(i + 1, i_114_ - 1, 4194304, (byte) 106);
				}
				if (i_116_ == 3) {
					method5973(i, i_114_, 268435456, (byte) 111);
					method5973(i - 1, i_114_ - 1, 16777216, (byte) 69);
				}
			}
			if (2 == i_115_) {
				if (0 == i_116_) {
					method5973(i, i_114_, 545259520, (byte) 87);
					method5973(i - 1, i_114_, 33554432, (byte) 118);
					method5973(i, i_114_ + 1, 134217728, (byte) 67);
				}
				if (i_116_ == 1) {
					method5973(i, i_114_, 41943040, (byte) 106);
					method5973(i, i_114_ + 1, 134217728, (byte) 91);
					method5973(1 + i, i_114_, 536870912, (byte) 123);
				}
				if (i_116_ == 2) {
					method5973(i, i_114_, 167772160, (byte) 107);
					method5973(i + 1, i_114_, 536870912, (byte) 90);
					method5973(i, i_114_ - 1, 8388608, (byte) 86);
				}
				if (i_116_ == 3) {
					method5973(i, i_114_, 671088640, (byte) 122);
					method5973(i, i_114_ - 1, 8388608, (byte) 88);
					method5973(i - 1, i_114_, 33554432, (byte) 102);
				}
			}
		}
	}

	static final void method6005(CS2Executor class527, byte i) {
		int i_196_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		Class184 class184 = Class468_Sub20.method12807(-1949417532);
		TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4557, class184.isaac, 502225021);
		class282_sub23.buffer.writeByte(i_196_);
		class184.method3049(class282_sub23, -616684350);
	}

	static final void method6006(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class493.sendCheckEmailPacket(string, (byte) -74);
	}

	static final void method6007(int i, int[] is, int i_197_) {
		if (Class456_Sub3.method12682(i, is, 214426228)) {
			IComponentDefinitions[] class118s = Class468_Sub8.aClass98Array7889[i].components;
			for (int i_198_ = 0; i_198_ < class118s.length; i_198_++) {
				IComponentDefinitions class118 = class118s[i_198_];
				if (null != class118 && null != class118.aClass456_1437)
					class118.aClass456_1437.method7582((byte) -62);
			}
		}
	}

	public static void method6008(boolean bool, byte i) {
		for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass482_8073.head((byte) 38)); class282_sub48 != null; class282_sub48 = (Class282_Sub48) Class282_Sub48.aClass482_8073.next(-128319020)) {
			if (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 != null) {
				Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099);
				((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = null;
			}
			if (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096 != null) {
				Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096);
				((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8096 = null;
			}
			class282_sub48.unlink(-371378792);
		}
		if (bool) {
			for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass482_8074.head((byte) 121)); null != class282_sub48; class282_sub48 = (Class282_Sub48) Class282_Sub48.aClass482_8074.next(-938773769)) {
				if (null != (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099)) {
					Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099);
					((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = null;
				}
				class282_sub48.unlink(-371378792);
			}
			for (Class282_Sub48 class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass465_8075.method7750(856415350)); class282_sub48 != null; class282_sub48 = ((Class282_Sub48) Class282_Sub48.aClass465_8075.method7751((byte) 62))) {
				if (((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 != null) {
					Class79.aClass282_Sub15_Sub4_783.method15276(((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099);
					((Class282_Sub48) class282_sub48).aClass282_Sub15_Sub5_8099 = null;
				}
				class282_sub48.unlink(-371378792);
			}
		}
	}

	public static Class232 method6009(RsByteBuffer class282_sub35, int i) {
		int i_199_ = class282_sub35.readUnsignedByte();
		int[] is = new int[i_199_];
		for (int i_200_ = 0; i_200_ < i_199_; i_200_++)
			is[i_200_] = class282_sub35.readUnsignedByte();
		return new Class232(is);
	}

	static final void method6010(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		class527.intStackPtr -= 425673003;
		int i_201_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		short i_202_ = (short) (class527.intStack[1 + class527.intStackPtr * 1942118537]);
		short i_203_ = (short) (class527.intStack[class527.intStackPtr * 1942118537 + 2]);
		if (i_201_ >= 0 && i_201_ < 5) {
			class118.method2013(i_201_, i_202_, i_203_, (byte) 11);
			Class109.method1858(class118, (byte) -78);
			if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
				Class276.method4903(-1952846363 * class118.idHash, i_201_, -1379026024);
		}
	}
}
