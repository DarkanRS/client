package com.rs.jagex;

public class CacheableNode_Sub17_Sub2 extends Shadow {

	static void method16046(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4) {
		int i_21 = i_2;
		if (i_3 < i_4) {
			i_1 += i_3;
			i_21 = i_4 - i_3 >> 2;

		while (true) {
			--i_21;
			if (i_21 < 0) {
				i_21 = i_4 - i_3 & 0x3;

				while (true) {
					--i_21;
					if (i_21 < 0)
						return;

					bytes_0[i_1++] = 1;
				}
			}

			bytes_0[i_1++] = 1;
			bytes_0[i_1++] = 1;
			bytes_0[i_1++] = 1;
			bytes_0[i_1++] = 1;
		}
		}
	}
	int anInt10453;
	int anInt10455;
	int anInt10452;
	int anInt10451;

	byte[] aByteArray10454;

	CacheableNode_Sub17_Sub2(int i_2, int i_3) {
		aByteArray10454 = new byte[i_3 * i_2];
	}

	boolean method16039(int i_1, int i_2) {
		return aByteArray10454.length >= i_2 * i_1;
	}

	void method16040(int i_1, int i_2, int i_3, int i_4) {
		anInt10453 = i_1;
		anInt10455 = i_2;
		anInt10452 = i_3 - i_1;
		anInt10451 = i_4 - i_2;
	}

	void method16042() {
		int i_1 = -1;

		for (int i_2 = aByteArray10454.length - 8; i_1 < i_2; aByteArray10454[i_1] = 0) {
			++i_1;
			aByteArray10454[i_1] = 0;
			++i_1;
			aByteArray10454[i_1] = 0;
			++i_1;
			aByteArray10454[i_1] = 0;
			++i_1;
			aByteArray10454[i_1] = 0;
			++i_1;
			aByteArray10454[i_1] = 0;
			++i_1;
			aByteArray10454[i_1] = 0;
			++i_1;
			aByteArray10454[i_1] = 0;
			++i_1;
		}

		while (i_1 < aByteArray10454.length - 1) {
			++i_1;
			aByteArray10454[i_1] = 0;
		}

	}

	void method16043(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_61 = i_6;
		int i_51 = i_5;
		int i_11 = i_1;
		int i_41 = i_4;
		int i_31 = i_3;
		int i_21 = i_2;
		int i_7 = 0;
		if (i_21 != i_11)
			i_7 = (i_51 - i_41 << 16) / (i_21 - i_11);

		int i_8 = 0;
		if (i_31 != i_21)
			i_8 = (i_61 - i_51 << 16) / (i_31 - i_21);

		int i_9 = 0;
		if (i_31 != i_11)
			i_9 = (i_41 - i_61 << 16) / (i_11 - i_31);

		if (i_11 <= i_21 && i_11 <= i_31) {
			if (i_21 < i_31) {
				i_61 = i_41 <<= 16;
				if (i_11 < 0) {
					i_61 -= i_9 * i_11;
					i_41 -= i_7 * i_11;
					i_11 = 0;
				}

				i_51 <<= 16;
				if (i_21 < 0) {
					i_51 -= i_8 * i_21;
					i_21 = 0;
				}

				if (i_21 != i_11 ? i_9 < i_7 : i_9 > i_8) {
					i_31 -= i_21;
					i_21 -= i_11;
					i_11 = anInt10452 * i_11;

					while (true) {
						--i_21;
						if (i_21 < 0)
							while (true) {
								--i_31;
								if (i_31 < 0)
									return;

								method16046(aByteArray10454, i_11, 0, i_61 >> 16, i_51 >> 16);
								i_61 += i_9;
								i_51 += i_8;
								i_11 += anInt10452;
							}

						method16046(aByteArray10454, i_11, 0, i_61 >> 16, i_41 >> 16);
						i_61 += i_9;
						i_41 += i_7;
						i_11 += anInt10452;
					}
				} else {
					i_31 -= i_21;
					i_21 -= i_11;
					i_11 = anInt10452 * i_11;

					while (true) {
						--i_21;
						if (i_21 < 0)
							while (true) {
								--i_31;
								if (i_31 < 0)
									return;

								method16046(aByteArray10454, i_11, 0, i_51 >> 16, i_61 >> 16);
								i_61 += i_9;
								i_51 += i_8;
								i_11 += anInt10452;
							}

						method16046(aByteArray10454, i_11, 0, i_41 >> 16, i_61 >> 16);
						i_61 += i_9;
						i_41 += i_7;
						i_11 += anInt10452;
					}
				}
			} else {
				i_51 = i_41 <<= 16;
				if (i_11 < 0) {
					i_51 -= i_9 * i_11;
					i_41 -= i_7 * i_11;
					i_11 = 0;
				}

				i_61 <<= 16;
				if (i_31 < 0) {
					i_61 -= i_31 * i_8;
					i_31 = 0;
				}

				if ((i_31 == i_11 || i_9 >= i_7) && (i_31 != i_11 || i_8 <= i_7)) {
					i_21 -= i_31;
					i_31 -= i_11;
					i_11 = anInt10452 * i_11;

					while (true) {
						--i_31;
						if (i_31 < 0)
							while (true) {
								--i_21;
								if (i_21 < 0)
									return;

								method16046(aByteArray10454, i_11, 0, i_41 >> 16, i_61 >> 16);
								i_61 += i_8;
								i_41 += i_7;
								i_11 += anInt10452;
							}

						method16046(aByteArray10454, i_11, 0, i_41 >> 16, i_51 >> 16);
						i_51 += i_9;
						i_41 += i_7;
						i_11 += anInt10452;
					}
				} else {
					i_21 -= i_31;
					i_31 -= i_11;
					i_11 = anInt10452 * i_11;

					while (true) {
						--i_31;
						if (i_31 < 0)
							while (true) {
								--i_21;
								if (i_21 < 0)
									return;

								method16046(aByteArray10454, i_11, 0, i_61 >> 16, i_41 >> 16);
								i_61 += i_8;
								i_41 += i_7;
								i_11 += anInt10452;
							}

						method16046(aByteArray10454, i_11, 0, i_51 >> 16, i_41 >> 16);
						i_51 += i_9;
						i_41 += i_7;
						i_11 += anInt10452;
					}
				}
			}
		} else if (i_21 <= i_31) {
			if (i_31 < i_11) {
				i_41 = i_51 <<= 16;
				if (i_21 < 0) {
					i_41 -= i_7 * i_21;
					i_51 -= i_8 * i_21;
					i_21 = 0;
				}

				i_61 <<= 16;
				if (i_31 < 0) {
					i_61 -= i_31 * i_9;
					i_31 = 0;
				}

				if ((i_31 == i_21 || i_7 >= i_8) && (i_31 != i_21 || i_7 <= i_9)) {
					i_11 -= i_31;
					i_31 -= i_21;
					i_21 *= anInt10452;

					while (true) {
						--i_31;
						if (i_31 < 0)
							while (true) {
								--i_11;
								if (i_11 < 0)
									return;

								method16046(aByteArray10454, i_21, 0, i_61 >> 16, i_41 >> 16);
								i_41 += i_7;
								i_61 += i_9;
								i_21 += anInt10452;
							}

						method16046(aByteArray10454, i_21, 0, i_51 >> 16, i_41 >> 16);
						i_41 += i_7;
						i_51 += i_8;
						i_21 += anInt10452;
					}
				} else {
					i_11 -= i_31;
					i_31 -= i_21;
					i_21 *= anInt10452;

					while (true) {
						--i_31;
						if (i_31 < 0)
							while (true) {
								--i_11;
								if (i_11 < 0)
									return;

								method16046(aByteArray10454, i_21, 0, i_41 >> 16, i_61 >> 16);
								i_41 += i_7;
								i_61 += i_9;
								i_21 += anInt10452;
							}

						method16046(aByteArray10454, i_21, 0, i_41 >> 16, i_51 >> 16);
						i_41 += i_7;
						i_51 += i_8;
						i_21 += anInt10452;
					}
				}
			} else {
				i_61 = i_51 <<= 16;
				if (i_21 < 0) {
					i_61 -= i_7 * i_21;
					i_51 -= i_8 * i_21;
					i_21 = 0;
				}

				i_41 <<= 16;
				if (i_11 < 0) {
					i_41 -= i_9 * i_11;
					i_11 = 0;
				}

				if (i_7 < i_8) {
					i_31 -= i_11;
					i_11 -= i_21;
					i_21 *= anInt10452;

					while (true) {
						--i_11;
						if (i_11 < 0)
							while (true) {
								--i_31;
								if (i_31 < 0)
									return;

								method16046(aByteArray10454, i_21, 0, i_41 >> 16, i_51 >> 16);
								i_41 += i_9;
								i_51 += i_8;
								i_21 += anInt10452;
							}

						method16046(aByteArray10454, i_21, 0, i_61 >> 16, i_51 >> 16);
						i_61 += i_7;
						i_51 += i_8;
						i_21 += anInt10452;
					}
				} else {
					i_31 -= i_11;
					i_11 -= i_21;
					i_21 *= anInt10452;

					while (true) {
						--i_11;
						if (i_11 < 0)
							while (true) {
								--i_31;
								if (i_31 < 0)
									return;

								method16046(aByteArray10454, i_21, 0, i_51 >> 16, i_41 >> 16);
								i_41 += i_9;
								i_51 += i_8;
								i_21 += anInt10452;
							}

						method16046(aByteArray10454, i_21, 0, i_51 >> 16, i_61 >> 16);
						i_61 += i_7;
						i_51 += i_8;
						i_21 += anInt10452;
					}
				}
			}
		} else if (i_11 < i_21) {
			i_51 = i_61 <<= 16;
			if (i_31 < 0) {
				i_51 -= i_31 * i_8;
				i_61 -= i_31 * i_9;
				i_31 = 0;
			}

			i_41 <<= 16;
			if (i_11 < 0) {
				i_41 -= i_7 * i_11;
				i_11 = 0;
			}

			if (i_8 < i_9) {
				i_21 -= i_11;
				i_11 -= i_31;
				i_31 *= anInt10452;

				while (true) {
					--i_11;
					if (i_11 < 0)
						while (true) {
							--i_21;
							if (i_21 < 0)
								return;

							method16046(aByteArray10454, i_31, 0, i_51 >> 16, i_41 >> 16);
							i_51 += i_8;
							i_41 += i_7;
							i_31 += anInt10452;
						}

					method16046(aByteArray10454, i_31, 0, i_51 >> 16, i_61 >> 16);
					i_51 += i_8;
					i_61 += i_9;
					i_31 += anInt10452;
				}
			} else {
				i_21 -= i_11;
				i_11 -= i_31;
				i_31 *= anInt10452;

				while (true) {
					--i_11;
					if (i_11 < 0)
						while (true) {
							--i_21;
							if (i_21 < 0)
								return;

							method16046(aByteArray10454, i_31, 0, i_41 >> 16, i_51 >> 16);
							i_51 += i_8;
							i_41 += i_7;
							i_31 += anInt10452;
						}

					method16046(aByteArray10454, i_31, 0, i_61 >> 16, i_51 >> 16);
					i_51 += i_8;
					i_61 += i_9;
					i_31 += anInt10452;
				}
			}
		} else {
			i_41 = i_61 <<= 16;
			if (i_31 < 0) {
				i_41 -= i_31 * i_8;
				i_61 -= i_31 * i_9;
				i_31 = 0;
			}

			i_51 <<= 16;
			if (i_21 < 0) {
				i_51 -= i_7 * i_21;
				i_21 = 0;
			}

			if (i_8 < i_9) {
				i_11 -= i_21;
				i_21 -= i_31;
				i_31 *= anInt10452;

				while (true) {
					--i_21;
					if (i_21 < 0)
						while (true) {
							--i_11;
							if (i_11 < 0)
								return;

							method16046(aByteArray10454, i_31, 0, i_51 >> 16, i_61 >> 16);
							i_51 += i_7;
							i_61 += i_9;
							i_31 += anInt10452;
						}

					method16046(aByteArray10454, i_31, 0, i_41 >> 16, i_61 >> 16);
					i_41 += i_8;
					i_61 += i_9;
					i_31 += anInt10452;
				}
			} else {
				i_11 -= i_21;
				i_21 -= i_31;
				i_31 *= anInt10452;

				while (true) {
					--i_21;
					if (i_21 < 0)
						while (true) {
							--i_11;
							if (i_11 < 0)
								return;

							method16046(aByteArray10454, i_31, 0, i_61 >> 16, i_51 >> 16);
							i_51 += i_7;
							i_61 += i_9;
							i_31 += anInt10452;
						}

					method16046(aByteArray10454, i_31, 0, i_61 >> 16, i_41 >> 16);
					i_41 += i_8;
					i_61 += i_9;
					i_31 += anInt10452;
				}
			}
		}
	}

}
