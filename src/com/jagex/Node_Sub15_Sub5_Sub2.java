package com.jagex;
public class Node_Sub15_Sub5_Sub2 extends Node_Sub15_Sub5 {

	public synchronized void method12230(int[] ints_1, int i_2, int i_3) {
		if (this.anInt9846 == 0 && this.anInt9858 == 0) {
			this.method12231(i_3);
		} else {
			int i_4 = this.anInt9844 << 8;
			int i_5 = this.anInt9856 << 8;
			int i_6 = ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470.length << 8;
			int i_7 = i_5 - i_4;
			if (i_7 <= 0) {
				this.anInt9854 = 0;
			}

			int i_8 = i_2;
			i_3 += i_2;
			if (this.anInt9853 < 0) {
				if (this.anInt9855 <= 0) {
					this.method15354();
					this.remove();
					return;
				}

				this.anInt9853 = 0;
			}

			if (this.anInt9853 >= i_6) {
				if (this.anInt9855 >= 0) {
					this.method15354();
					this.remove();
					return;
				}

				this.anInt9853 = i_6 - 1;
			}

			if (this.anInt9854 < 0) {
				if (this.aBool9857) {
					if (this.anInt9855 < 0) {
						i_8 = this.method16018(ints_1, i_2, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844]);
						if (this.anInt9853 >= i_4) {
							return;
						}

						this.anInt9853 = i_4 + i_4 - 1 - this.anInt9853;
						this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
					}

					while (true) {
						i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 - 1]);
						if (this.anInt9853 < i_5) {
							break;
						}

						this.anInt9853 = i_5 + i_5 - 1 - this.anInt9853;
						this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
						i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844]);
						if (this.anInt9853 >= i_4) {
							break;
						}

						this.anInt9853 = i_4 + i_4 - 1 - this.anInt9853;
						this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
					}
				} else if (this.anInt9855 < 0) {
					while (true) {
						i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 - 1]);
						if (this.anInt9853 >= i_4) {
							break;
						}

						this.anInt9853 = i_5 - 1 - (i_5 - 1 - this.anInt9853) % i_7;
					}
				} else {
					while (true) {
						i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844]);
						if (this.anInt9853 < i_5) {
							break;
						}

						this.anInt9853 = i_4 + (this.anInt9853 - i_4) % i_7;
					}
				}
			} else {
				if (this.anInt9854 > 0) {
					if (this.aBool9857) {
						label111: {
							if (this.anInt9855 < 0) {
								i_8 = this.method16018(ints_1, i_2, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844]);
								if (this.anInt9853 >= i_4) {
									return;
								}

								this.anInt9853 = i_4 + i_4 - 1 - this.anInt9853;
								this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
								if (--this.anInt9854 == 0) {
									break label111;
								}
							}

							do {
								i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 - 1]);
								if (this.anInt9853 < i_5) {
									return;
								}

								this.anInt9853 = i_5 + i_5 - 1 - this.anInt9853;
								this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
								if (--this.anInt9854 == 0) {
									break;
								}

								i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844]);
								if (this.anInt9853 >= i_4) {
									return;
								}

								this.anInt9853 = i_4 + i_4 - 1 - this.anInt9853;
								this.anInt9855 = -(this.anInt9855 * 1927994969) * -177305111;
							} while (--this.anInt9854 != 0);
						}
					} else {
						int i_9;
						if (this.anInt9855 < 0) {
							while (true) {
								i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 - 1]);
								if (this.anInt9853 >= i_4) {
									return;
								}

								i_9 = (i_5 - 1 - this.anInt9853) / i_7;
								if (i_9 >= this.anInt9854) {
									this.anInt9853 += i_7 * this.anInt9854;
									this.anInt9854 = 0;
									break;
								}

								this.anInt9853 += i_7 * i_9;
								this.anInt9854 -= i_9;
							}
						} else {
							while (true) {
								i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844]);
								if (this.anInt9853 < i_5) {
									return;
								}

								i_9 = (this.anInt9853 - i_4) / i_7;
								if (i_9 >= this.anInt9854) {
									this.anInt9853 -= i_7 * this.anInt9854;
									this.anInt9854 = 0;
									break;
								}

								this.anInt9853 -= i_7 * i_9;
								this.anInt9854 -= i_9;
							}
						}
					}
				}

				if (this.anInt9855 < 0) {
					this.method16018(ints_1, i_8, 0, i_3, 0);
					if (this.anInt9853 < 0) {
						this.anInt9853 = -1;
						this.method15354();
						this.remove();
					}
				} else {
					this.method15990(ints_1, i_8, i_6, i_3, 0);
					if (this.anInt9853 >= i_6) {
						this.anInt9853 = i_6;
						this.method15354();
						this.remove();
					}
				}
			}
		}

	}

	int method15990(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
		do {
			if (this.anInt9858 <= 0) {
				if (this.anInt9855 == 256 && (this.anInt9853 & 0xff) == 0) {
					if (Class253.aBool3115) {
						return method16031(((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9845, this.anInt9850, 0, i_4, i_3, this);
					}

					return method15992(((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9848, 0, i_4, i_3, this);
				}

				if (Class253.aBool3115) {
					return method16019(0, 0, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9845, this.anInt9850, 0, i_4, i_3, this, this.anInt9855, i_5);
				}

				return method15996(0, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9848, 0, i_4, i_3, this, this.anInt9855, i_5);
			}

			int i_6 = i_2 + this.anInt9858;
			if (i_6 > i_4) {
				i_6 = i_4;
			}

			this.anInt9858 += i_2;
			if (this.anInt9855 == 256 && (this.anInt9853 & 0xff) == 0) {
				if (Class253.aBool3115) {
					i_2 = method16001(((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9845, this.anInt9850, this.anInt9852, this.anInt9851, 0, i_6, i_3, this);
				} else {
					i_2 = method16000(((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9848, this.anInt9849, 0, i_6, i_3, this);
				}
			} else if (Class253.aBool3115) {
				i_2 = method16005(0, 0, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9845, this.anInt9850, this.anInt9852, this.anInt9851, 0, i_6, i_3, this, this.anInt9855, i_5);
			} else {
				i_2 = method16004(0, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9848, this.anInt9849, 0, i_6, i_3, this, this.anInt9855, i_5);
			}

			this.anInt9858 -= i_2;
			if (this.anInt9858 != 0) {
				return i_2;
			}
		} while (!this.method15324((byte) 40));

		return i_4;
	}

	static int method15991(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_8) {
		i_2 >>= 8;
		i_7 >>= 8;
		i_4 <<= 2;
		if ((i_5 = i_3 + i_2 - (i_7 - 1)) > i_6) {
			i_5 = i_6;
		}

		int i_10001;
		for (i_5 -= 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2--] * i_4) {
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2--] * i_4;
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2--] * i_4;
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2--] * i_4;
			i_10001 = i_3++;
		}

		for (i_5 += 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2--] * i_4) {
			i_10001 = i_3++;
		}

		class282_sub15_sub5_sub2_8.anInt9853 = i_2 << 8;
		return i_3;
	}

	static int method15992(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_8) {
		i_2 >>= 8;
		i_7 >>= 8;
		i_4 <<= 2;
		if ((i_5 = i_3 + i_7 - i_2) > i_6) {
			i_5 = i_6;
		}

		int i_10001;
		for (i_5 -= 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2++] * i_4) {
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2++] * i_4;
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2++] * i_4;
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2++] * i_4;
			i_10001 = i_3++;
		}

		for (i_5 += 3; i_3 < i_5; ints_1[i_10001] += bytes_0[i_2++] * i_4) {
			i_10001 = i_3++;
		}

		class282_sub15_sub5_sub2_8.anInt9853 = i_2 << 8;
		return i_3;
	}

	static int method15995(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_10) {
		i_3 >>= 8;
		i_9 >>= 8;
		i_5 <<= 2;
		i_6 <<= 2;
		if ((i_7 = i_3 + i_4 - (i_9 - 1)) > i_8) {
			i_7 = i_8;
		}

		i_4 <<= 1;
		i_7 <<= 1;

		int i_10001;
		byte b_11;
		for (i_7 -= 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
			b_11 = bytes_1[i_3--];
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_5;
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_6;
			b_11 = bytes_1[i_3--];
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_5;
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_6;
			b_11 = bytes_1[i_3--];
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_5;
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_6;
			b_11 = bytes_1[i_3--];
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_5;
			i_10001 = i_4++;
		}

		for (i_7 += 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
			b_11 = bytes_1[i_3--];
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_5;
			i_10001 = i_4++;
		}

		class282_sub15_sub5_sub2_10.anInt9853 = i_3 << 8;
		return i_4 >> 1;
	}

	static int method15996(int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_10, int i_11, int i_12) {
		if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 - i_4) - 257) / i_11) > i_8) {
			i_7 = i_8;
		}

		byte b_13;
		int i_10001;
		while (i_5 < i_7) {
			i_1 = i_4 >> 8;
			b_13 = bytes_2[i_1];
			i_10001 = i_5++;
			ints_3[i_10001] += ((b_13 << 8) + (bytes_2[i_1 + 1] - b_13) * (i_4 & 0xff)) * i_6 >> 6;
			i_4 += i_11;
		}

		if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 - i_4) - 1) / i_11) > i_8) {
			i_7 = i_8;
		}

		for (i_1 = i_12; i_5 < i_7; i_4 += i_11) {
			b_13 = bytes_2[i_4 >> 8];
			i_10001 = i_5++;
			ints_3[i_10001] += ((b_13 << 8) + (i_1 - b_13) * (i_4 & 0xff)) * i_6 >> 6;
		}

		class282_sub15_sub5_sub2_10.anInt9853 = i_4;
		return i_5;
	}

	static int method15998(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_10, int i_11, int i_12) {
		if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 + 256 - i_4)) / i_11) > i_8) {
			i_7 = i_8;
		}

		int i_10001;
		while (i_5 < i_7) {
			i_1 = i_4 >> 8;
			byte b_13 = bytes_2[i_1 - 1];
			i_10001 = i_5++;
			ints_3[i_10001] += ((b_13 << 8) + (bytes_2[i_1] - b_13) * (i_4 & 0xff)) * i_6 >> 6;
			i_4 += i_11;
		}

		if (i_11 == 0 || (i_7 = i_5 + (i_11 + (i_9 - i_4)) / i_11) > i_8) {
			i_7 = i_8;
		}

		i_0 = i_12;

		for (i_1 = i_11; i_5 < i_7; i_4 += i_1) {
			i_10001 = i_5++;
			ints_3[i_10001] += ((i_0 << 8) + (bytes_2[i_4 >> 8] - i_0) * (i_4 & 0xff)) * i_6 >> 6;
		}

		class282_sub15_sub5_sub2_10.anInt9853 = i_4;
		return i_5;
	}

	static int method15999(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_11, int i_12, int i_13) {
		if (i_12 == 0 || (i_8 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9) {
			i_8 = i_9;
		}

		i_5 <<= 1;

		int i_10001;
		for (i_8 <<= 1; i_5 < i_8; i_4 += i_12) {
			i_1 = i_4 >> 8;
			byte b_14 = bytes_2[i_1 - 1];
			i_0 = (bytes_2[i_1] - b_14) * (i_4 & 0xff) + (b_14 << 8);
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_6 >> 6;
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_7 >> 6;
		}

		if (i_12 == 0 || (i_8 = (i_5 >> 1) + (i_10 - i_4 + i_12) / i_12) > i_9) {
			i_8 = i_9;
		}

		i_8 <<= 1;

		for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
			i_0 = (i_1 << 8) + (i_4 & 0xff) * (bytes_2[i_4 >> 8] - i_1);
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_6 >> 6;
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_7 >> 6;
		}

		class282_sub15_sub5_sub2_11.anInt9853 = i_4;
		return i_5 >> 1;
	}

	static int method16000(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_9) {
		i_2 >>= 8;
		i_8 >>= 8;
		i_4 <<= 2;
		i_5 <<= 2;
		if ((i_6 = i_3 + i_8 - i_2) > i_7) {
			i_6 = i_7;
		}

		class282_sub15_sub5_sub2_9.anInt9845 += class282_sub15_sub5_sub2_9.anInt9852 * (i_6 - i_3);
		class282_sub15_sub5_sub2_9.anInt9850 += class282_sub15_sub5_sub2_9.anInt9851 * (i_6 - i_3);

		int i_10001;
		for (i_6 -= 3; i_3 < i_6; i_4 += i_5) {
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2++] * i_4;
			i_4 += i_5;
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2++] * i_4;
			i_4 += i_5;
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2++] * i_4;
			i_4 += i_5;
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2++] * i_4;
		}

		for (i_6 += 3; i_3 < i_6; i_4 += i_5) {
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2++] * i_4;
		}

		class282_sub15_sub5_sub2_9.anInt9848 = i_4 >> 2;
		class282_sub15_sub5_sub2_9.anInt9853 = i_2 << 8;
		return i_3;
	}

	static int method16001(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_12) {
		i_3 >>= 8;
		i_11 >>= 8;
		i_5 <<= 2;
		i_6 <<= 2;
		i_7 <<= 2;
		i_8 <<= 2;
		if ((i_9 = i_11 + i_4 - i_3) > i_10) {
			i_9 = i_10;
		}

		class282_sub15_sub5_sub2_12.anInt9848 += class282_sub15_sub5_sub2_12.anInt9849 * (i_9 - i_4);
		i_4 <<= 1;
		i_9 <<= 1;

		byte b_13;
		int i_10001;
		for (i_9 -= 6; i_4 < i_9; i_6 += i_8) {
			b_13 = bytes_1[i_3++];
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_5;
			i_5 += i_7;
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_6;
			i_6 += i_8;
			b_13 = bytes_1[i_3++];
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_5;
			i_5 += i_7;
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_6;
			i_6 += i_8;
			b_13 = bytes_1[i_3++];
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_5;
			i_5 += i_7;
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_6;
			i_6 += i_8;
			b_13 = bytes_1[i_3++];
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_5;
			i_5 += i_7;
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_6;
		}

		for (i_9 += 6; i_4 < i_9; i_6 += i_8) {
			b_13 = bytes_1[i_3++];
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_5;
			i_5 += i_7;
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_6;
		}

		class282_sub15_sub5_sub2_12.anInt9845 = i_5 >> 2;
		class282_sub15_sub5_sub2_12.anInt9850 = i_6 >> 2;
		class282_sub15_sub5_sub2_12.anInt9853 = i_3 << 8;
		return i_4 >> 1;
	}

	static int method16002(byte[] bytes_0, int[] ints_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_9) {
		i_2 >>= 8;
		i_8 >>= 8;
		i_4 <<= 2;
		i_5 <<= 2;
		if ((i_6 = i_3 + i_2 - (i_8 - 1)) > i_7) {
			i_6 = i_7;
		}

		class282_sub15_sub5_sub2_9.anInt9845 += class282_sub15_sub5_sub2_9.anInt9852 * (i_6 - i_3);
		class282_sub15_sub5_sub2_9.anInt9850 += class282_sub15_sub5_sub2_9.anInt9851 * (i_6 - i_3);

		int i_10001;
		for (i_6 -= 3; i_3 < i_6; i_4 += i_5) {
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2--] * i_4;
			i_4 += i_5;
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2--] * i_4;
			i_4 += i_5;
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2--] * i_4;
			i_4 += i_5;
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2--] * i_4;
		}

		for (i_6 += 3; i_3 < i_6; i_4 += i_5) {
			i_10001 = i_3++;
			ints_1[i_10001] += bytes_0[i_2--] * i_4;
		}

		class282_sub15_sub5_sub2_9.anInt9848 = i_4 >> 2;
		class282_sub15_sub5_sub2_9.anInt9853 = i_2 << 8;
		return i_3;
	}

	static int method16003(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_12) {
		i_3 >>= 8;
		i_11 >>= 8;
		i_5 <<= 2;
		i_6 <<= 2;
		i_7 <<= 2;
		i_8 <<= 2;
		if ((i_9 = i_3 + i_4 - (i_11 - 1)) > i_10) {
			i_9 = i_10;
		}

		class282_sub15_sub5_sub2_12.anInt9848 += class282_sub15_sub5_sub2_12.anInt9849 * (i_9 - i_4);
		i_4 <<= 1;
		i_9 <<= 1;

		byte b_13;
		int i_10001;
		for (i_9 -= 6; i_4 < i_9; i_6 += i_8) {
			b_13 = bytes_1[i_3--];
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_5;
			i_5 += i_7;
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_6;
			i_6 += i_8;
			b_13 = bytes_1[i_3--];
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_5;
			i_5 += i_7;
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_6;
			i_6 += i_8;
			b_13 = bytes_1[i_3--];
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_5;
			i_5 += i_7;
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_6;
			i_6 += i_8;
			b_13 = bytes_1[i_3--];
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_5;
			i_5 += i_7;
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_6;
		}

		for (i_9 += 6; i_4 < i_9; i_6 += i_8) {
			b_13 = bytes_1[i_3--];
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_5;
			i_5 += i_7;
			i_10001 = i_4++;
			ints_2[i_10001] += b_13 * i_6;
		}

		class282_sub15_sub5_sub2_12.anInt9845 = i_5 >> 2;
		class282_sub15_sub5_sub2_12.anInt9850 = i_6 >> 2;
		class282_sub15_sub5_sub2_12.anInt9853 = i_3 << 8;
		return i_4 >> 1;
	}

	static int method16004(int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_11, int i_12, int i_13) {
		class282_sub15_sub5_sub2_11.anInt9845 -= class282_sub15_sub5_sub2_11.anInt9852 * i_5;
		class282_sub15_sub5_sub2_11.anInt9850 -= class282_sub15_sub5_sub2_11.anInt9851 * i_5;
		if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9) {
			i_8 = i_9;
		}

		byte b_14;
		int i_10001;
		while (i_5 < i_8) {
			i_1 = i_4 >> 8;
			b_14 = bytes_2[i_1];
			i_10001 = i_5++;
			ints_3[i_10001] += ((b_14 << 8) + (bytes_2[i_1 + 1] - b_14) * (i_4 & 0xff)) * i_6 >> 6;
			i_6 += i_7;
			i_4 += i_12;
		}

		if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 1) / i_12) > i_9) {
			i_8 = i_9;
		}

		for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
			b_14 = bytes_2[i_4 >> 8];
			i_10001 = i_5++;
			ints_3[i_10001] += ((b_14 << 8) + (i_1 - b_14) * (i_4 & 0xff)) * i_6 >> 6;
			i_6 += i_7;
		}

		class282_sub15_sub5_sub2_11.anInt9845 += class282_sub15_sub5_sub2_11.anInt9852 * i_5;
		class282_sub15_sub5_sub2_11.anInt9850 += class282_sub15_sub5_sub2_11.anInt9851 * i_5;
		class282_sub15_sub5_sub2_11.anInt9848 = i_6;
		class282_sub15_sub5_sub2_11.anInt9853 = i_4;
		return i_5;
	}

	static int method16005(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_13, int i_14, int i_15) {
		class282_sub15_sub5_sub2_13.anInt9848 -= i_5 * class282_sub15_sub5_sub2_13.anInt9849;
		if (i_14 == 0 || (i_10 = i_5 + (i_12 - i_4 + i_14 - 257) / i_14) > i_11) {
			i_10 = i_11;
		}

		i_5 <<= 1;

		byte b_16;
		int i_10001;
		for (i_10 <<= 1; i_5 < i_10; i_4 += i_14) {
			i_1 = i_4 >> 8;
			b_16 = bytes_2[i_1];
			i_0 = (b_16 << 8) + (i_4 & 0xff) * (bytes_2[i_1 + 1] - b_16);
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_6 >> 6;
			i_6 += i_8;
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_7 >> 6;
			i_7 += i_9;
		}

		if (i_14 == 0 || (i_10 = (i_5 >> 1) + (i_12 - i_4 + i_14 - 1) / i_14) > i_11) {
			i_10 = i_11;
		}

		i_10 <<= 1;

		for (i_1 = i_15; i_5 < i_10; i_4 += i_14) {
			b_16 = bytes_2[i_4 >> 8];
			i_0 = (b_16 << 8) + (i_1 - b_16) * (i_4 & 0xff);
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_6 >> 6;
			i_6 += i_8;
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_7 >> 6;
			i_7 += i_9;
		}

		i_5 >>= 1;
		class282_sub15_sub5_sub2_13.anInt9848 += class282_sub15_sub5_sub2_13.anInt9849 * i_5;
		class282_sub15_sub5_sub2_13.anInt9845 = i_6;
		class282_sub15_sub5_sub2_13.anInt9850 = i_7;
		class282_sub15_sub5_sub2_13.anInt9853 = i_4;
		return i_5;
	}

	static int method16006(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_11, int i_12, int i_13) {
		class282_sub15_sub5_sub2_11.anInt9845 -= class282_sub15_sub5_sub2_11.anInt9852 * i_5;
		class282_sub15_sub5_sub2_11.anInt9850 -= class282_sub15_sub5_sub2_11.anInt9851 * i_5;
		if (i_12 == 0 || (i_8 = i_5 + (i_10 + 256 - i_4 + i_12) / i_12) > i_9) {
			i_8 = i_9;
		}

		int i_10001;
		while (i_5 < i_8) {
			i_1 = i_4 >> 8;
			byte b_14 = bytes_2[i_1 - 1];
			i_10001 = i_5++;
			ints_3[i_10001] += ((b_14 << 8) + (bytes_2[i_1] - b_14) * (i_4 & 0xff)) * i_6 >> 6;
			i_6 += i_7;
			i_4 += i_12;
		}

		if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12) / i_12) > i_9) {
			i_8 = i_9;
		}

		i_0 = i_13;

		for (i_1 = i_12; i_5 < i_8; i_4 += i_1) {
			i_10001 = i_5++;
			ints_3[i_10001] += ((i_0 << 8) + (bytes_2[i_4 >> 8] - i_0) * (i_4 & 0xff)) * i_6 >> 6;
			i_6 += i_7;
		}

		class282_sub15_sub5_sub2_11.anInt9845 += class282_sub15_sub5_sub2_11.anInt9852 * i_5;
		class282_sub15_sub5_sub2_11.anInt9850 += class282_sub15_sub5_sub2_11.anInt9851 * i_5;
		class282_sub15_sub5_sub2_11.anInt9848 = i_6;
		class282_sub15_sub5_sub2_11.anInt9853 = i_4;
		return i_5;
	}

	static int method16007(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_13, int i_14, int i_15) {
		class282_sub15_sub5_sub2_13.anInt9848 -= i_5 * class282_sub15_sub5_sub2_13.anInt9849;
		if (i_14 == 0 || (i_10 = i_5 + (i_12 + 256 - i_4 + i_14) / i_14) > i_11) {
			i_10 = i_11;
		}

		i_5 <<= 1;

		int i_10001;
		for (i_10 <<= 1; i_5 < i_10; i_4 += i_14) {
			i_1 = i_4 >> 8;
			byte b_16 = bytes_2[i_1 - 1];
			i_0 = (bytes_2[i_1] - b_16) * (i_4 & 0xff) + (b_16 << 8);
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_6 >> 6;
			i_6 += i_8;
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_7 >> 6;
			i_7 += i_9;
		}

		if (i_14 == 0 || (i_10 = (i_5 >> 1) + (i_12 - i_4 + i_14) / i_14) > i_11) {
			i_10 = i_11;
		}

		i_10 <<= 1;

		for (i_1 = i_15; i_5 < i_10; i_4 += i_14) {
			i_0 = (i_1 << 8) + (i_4 & 0xff) * (bytes_2[i_4 >> 8] - i_1);
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_6 >> 6;
			i_6 += i_8;
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_7 >> 6;
			i_7 += i_9;
		}

		i_5 >>= 1;
		class282_sub15_sub5_sub2_13.anInt9848 += class282_sub15_sub5_sub2_13.anInt9849 * i_5;
		class282_sub15_sub5_sub2_13.anInt9845 = i_6;
		class282_sub15_sub5_sub2_13.anInt9850 = i_7;
		class282_sub15_sub5_sub2_13.anInt9853 = i_4;
		return i_5;
	}

	public synchronized void method12240(int[] ints_1, int i_2, int i_3) {
		if (this.anInt9846 * -298675253 * -1302038045 == 0 && this.anInt9858 * 1156515807 * 1008956447 == 0) {
			this.method12231(i_3);
		} else {
			int i_4 = this.anInt9844 * 900940833 * -99794975 << 8;
			int i_5 = this.anInt9856 * -628161865 * -1048610041 << 8;
			int i_6 = ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470.length << 8;
			int i_7 = i_5 - i_4;
			if (i_7 <= 0) {
				this.anInt9854 = 0 * 1507503163;
			}

			int i_8 = i_2;
			i_3 += i_2;
			if (this.anInt9853 * -834443097 * -354697449 < 0) {
				if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
					this.method15354();
					this.remove();
					return;
				}

				this.anInt9853 = 0 * -354697449;
			}

			if (this.anInt9853 * -834443097 * -354697449 >= i_6) {
				if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 >= 0) {
					this.method15354();
					this.remove();
					return;
				}

				this.anInt9853 = (i_6 - 1) * -834443097 * -354697449;
			}

			if (this.anInt9854 * -485012237 * 1507503163 < 0) {
				if (this.aBool9857) {
					if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
						i_8 = this.method16018(ints_1, i_2, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
						if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
							return;
						}

						this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
						this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
					}

					while (true) {
						i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
						if (this.anInt9853 * -834443097 * -354697449 < i_5) {
							break;
						}

						this.anInt9853 = (i_5 + i_5 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
						this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
						i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
						if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
							break;
						}

						this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
						this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
					}
				} else if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
					while (true) {
						i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
						if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
							break;
						}

						this.anInt9853 = (i_5 - 1 - (i_5 - 1 - this.anInt9853 * -834443097 * -354697449) % i_7) * -834443097 * -354697449;
					}
				} else {
					while (true) {
						i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
						if (this.anInt9853 * -834443097 * -354697449 < i_5) {
							break;
						}

						this.anInt9853 = (i_4 + (this.anInt9853 * -834443097 * -354697449 - i_4) % i_7) * -834443097 * -354697449;
					}
				}
			} else {
				if (this.anInt9854 * -485012237 * 1507503163 > 0) {
					if (this.aBool9857) {
						label111: {
							int i_10002;
							if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
								i_8 = this.method16018(ints_1, i_2, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
								if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
									return;
								}

								this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
								this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
								i_10002 = this.anInt9854 * -485012237 - -485012237;
								this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
								if (i_10002 * 1507503163 == 0) {
									break label111;
								}
							}

							do {
								i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
								if (this.anInt9853 * -834443097 * -354697449 < i_5) {
									return;
								}

								this.anInt9853 = (i_5 + i_5 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
								this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
								i_10002 = this.anInt9854 * -485012237 - -485012237;
								this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
								if (i_10002 * 1507503163 == 0) {
									break;
								}

								i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
								if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
									return;
								}

								this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
								this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
								i_10002 = this.anInt9854 * -485012237 - -485012237;
								this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
							} while (i_10002 * 1507503163 != 0);
						}
					} else {
						int i_9;
						if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
							while (true) {
								i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
								if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
									return;
								}

								i_9 = (i_5 - 1 - this.anInt9853 * -834443097 * -354697449) / i_7;
								if (i_9 >= this.anInt9854 * -485012237 * 1507503163) {
									this.anInt9853 = (this.anInt9853 * -834443097 + i_7 * this.anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
									this.anInt9854 = 0 * 1507503163;
									break;
								}

								this.anInt9853 = (this.anInt9853 * -834443097 + i_7 * i_9 * -834443097) * -354697449;
								this.anInt9854 = (this.anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
							}
						} else {
							while (true) {
								i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
								if (this.anInt9853 * -834443097 * -354697449 < i_5) {
									return;
								}

								i_9 = (this.anInt9853 * -834443097 * -354697449 - i_4) / i_7;
								if (i_9 >= this.anInt9854 * -485012237 * 1507503163) {
									this.anInt9853 = (this.anInt9853 * -834443097 - i_7 * this.anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
									this.anInt9854 = 0 * 1507503163;
									break;
								}

								this.anInt9853 = (this.anInt9853 * -834443097 - i_7 * i_9 * -834443097) * -354697449;
								this.anInt9854 = (this.anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
							}
						}
					}
				}

				if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
					this.method16018(ints_1, i_8, 0, i_3, 0);
					if (this.anInt9853 * -834443097 * -354697449 < 0) {
						this.anInt9853 = 834443097 * -354697449;
						this.method15354();
						this.remove();
					}
				} else {
					this.method15990(ints_1, i_8, i_6, i_3, 0);
					if (this.anInt9853 * -834443097 * -354697449 >= i_6) {
						this.anInt9853 = i_6 * -834443097 * -354697449;
						this.method15354();
						this.remove();
					}
				}
			}
		}

	}

	public synchronized void method12241(int[] ints_1, int i_2, int i_3) {
		if (this.anInt9846 * -298675253 * -1302038045 == 0 && this.anInt9858 * 1156515807 * 1008956447 == 0) {
			this.method12231(i_3);
		} else {
			int i_4 = this.anInt9844 * 900940833 * -99794975 << 8;
			int i_5 = this.anInt9856 * -628161865 * -1048610041 << 8;
			int i_6 = ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470.length << 8;
			int i_7 = i_5 - i_4;
			if (i_7 <= 0) {
				this.anInt9854 = 0 * 1507503163;
			}

			int i_8 = i_2;
			i_3 += i_2;
			if (this.anInt9853 * -834443097 * -354697449 < 0) {
				if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
					this.method15354();
					this.remove();
					return;
				}

				this.anInt9853 = 0 * -354697449;
			}

			if (this.anInt9853 * -834443097 * -354697449 >= i_6) {
				if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 >= 0) {
					this.method15354();
					this.remove();
					return;
				}

				this.anInt9853 = (i_6 - 1) * -834443097 * -354697449;
			}

			if (this.anInt9854 * -485012237 * 1507503163 < 0) {
				if (this.aBool9857) {
					if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
						i_8 = this.method16018(ints_1, i_2, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
						if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
							return;
						}

						this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
						this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
					}

					while (true) {
						i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
						if (this.anInt9853 * -834443097 * -354697449 < i_5) {
							break;
						}

						this.anInt9853 = (i_5 + i_5 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
						this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
						i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
						if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
							break;
						}

						this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
						this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
					}
				} else if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
					while (true) {
						i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
						if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
							break;
						}

						this.anInt9853 = (i_5 - 1 - (i_5 - 1 - this.anInt9853 * -834443097 * -354697449) % i_7) * -834443097 * -354697449;
					}
				} else {
					while (true) {
						i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
						if (this.anInt9853 * -834443097 * -354697449 < i_5) {
							break;
						}

						this.anInt9853 = (i_4 + (this.anInt9853 * -834443097 * -354697449 - i_4) % i_7) * -834443097 * -354697449;
					}
				}
			} else {
				if (this.anInt9854 * -485012237 * 1507503163 > 0) {
					if (this.aBool9857) {
						label111: {
							int i_10002;
							if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
								i_8 = this.method16018(ints_1, i_2, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
								if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
									return;
								}

								this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
								this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
								i_10002 = this.anInt9854 * -485012237 - -485012237;
								this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
								if (i_10002 * 1507503163 == 0) {
									break label111;
								}
							}

							do {
								i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
								if (this.anInt9853 * -834443097 * -354697449 < i_5) {
									return;
								}

								this.anInt9853 = (i_5 + i_5 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
								this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
								i_10002 = this.anInt9854 * -485012237 - -485012237;
								this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
								if (i_10002 * 1507503163 == 0) {
									break;
								}

								i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
								if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
									return;
								}

								this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
								this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
								i_10002 = this.anInt9854 * -485012237 - -485012237;
								this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
							} while (i_10002 * 1507503163 != 0);
						}
					} else {
						int i_9;
						if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
							while (true) {
								i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
								if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
									return;
								}

								i_9 = (i_5 - 1 - this.anInt9853 * -834443097 * -354697449) / i_7;
								if (i_9 >= this.anInt9854 * -485012237 * 1507503163) {
									this.anInt9853 = (this.anInt9853 * -834443097 + i_7 * this.anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
									this.anInt9854 = 0 * 1507503163;
									break;
								}

								this.anInt9853 = (this.anInt9853 * -834443097 + i_7 * i_9 * -834443097) * -354697449;
								this.anInt9854 = (this.anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
							}
						} else {
							while (true) {
								i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
								if (this.anInt9853 * -834443097 * -354697449 < i_5) {
									return;
								}

								i_9 = (this.anInt9853 * -834443097 * -354697449 - i_4) / i_7;
								if (i_9 >= this.anInt9854 * -485012237 * 1507503163) {
									this.anInt9853 = (this.anInt9853 * -834443097 - i_7 * this.anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
									this.anInt9854 = 0 * 1507503163;
									break;
								}

								this.anInt9853 = (this.anInt9853 * -834443097 - i_7 * i_9 * -834443097) * -354697449;
								this.anInt9854 = (this.anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
							}
						}
					}
				}

				if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
					this.method16018(ints_1, i_8, 0, i_3, 0);
					if (this.anInt9853 * -834443097 * -354697449 < 0) {
						this.anInt9853 = 834443097 * -354697449;
						this.method15354();
						this.remove();
					}
				} else {
					this.method15990(ints_1, i_8, i_6, i_3, 0);
					if (this.anInt9853 * -834443097 * -354697449 >= i_6) {
						this.anInt9853 = i_6 * -834443097 * -354697449;
						this.method15354();
						this.remove();
					}
				}
			}
		}

	}

	Node_Sub15_Sub5_Sub2(Node_Sub26_Sub1_Sub2 class282_sub26_sub1_sub2_1, int i_2, int i_3, int i_4) {
		this.aNode_Sub26_7601 = class282_sub26_sub1_sub2_1;
		this.anInt9844 = class282_sub26_sub1_sub2_1.anInt9749;
		this.anInt9856 = class282_sub26_sub1_sub2_1.anInt9751;
		this.aBool9857 = class282_sub26_sub1_sub2_1.aBool9752;
		this.anInt9855 = i_2;
		this.anInt9846 = i_3;
		this.anInt9847 = i_4;
		this.anInt9853 = 0;
		this.method15332((byte) -21);
	}

	int method16018(int[] ints_1, int i_2, int i_3, int i_4, int i_5) {
		do {
			if (this.anInt9858 <= 0) {
				if (this.anInt9855 == -256 && (this.anInt9853 & 0xff) == 0) {
					if (Class253.aBool3115) {
						return method15995(((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9845, this.anInt9850, 0, i_4, i_3, this);
					}

					return method15991(((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9848, 0, i_4, i_3, this);
				}

				if (Class253.aBool3115) {
					return method15999(0, 0, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9845, this.anInt9850, 0, i_4, i_3, this, this.anInt9855, i_5);
				}

				return method15998(0, 0, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9848, 0, i_4, i_3, this, this.anInt9855, i_5);
			}

			int i_6 = i_2 + this.anInt9858;
			if (i_6 > i_4) {
				i_6 = i_4;
			}

			this.anInt9858 += i_2;
			if (this.anInt9855 == -256 && (this.anInt9853 & 0xff) == 0) {
				if (Class253.aBool3115) {
					i_2 = method16003(((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9845, this.anInt9850, this.anInt9852, this.anInt9851, 0, i_6, i_3, this);
				} else {
					i_2 = method16002(((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9848, this.anInt9849, 0, i_6, i_3, this);
				}
			} else if (Class253.aBool3115) {
				i_2 = method16007(0, 0, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9845, this.anInt9850, this.anInt9852, this.anInt9851, 0, i_6, i_3, this, this.anInt9855, i_5);
			} else {
				i_2 = method16006(0, 0, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470, ints_1, this.anInt9853, i_2, this.anInt9848, this.anInt9849, 0, i_6, i_3, this, this.anInt9855, i_5);
			}

			this.anInt9858 -= i_2;
			if (this.anInt9858 != 0) {
				return i_2;
			}
		} while (!this.method15324((byte) 65));

		return i_4;
	}

	static int method16019(int i_0, int i_1, byte[] bytes_2, int[] ints_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_11, int i_12, int i_13) {
		if (i_12 == 0 || (i_8 = i_5 + (i_10 - i_4 + i_12 - 257) / i_12) > i_9) {
			i_8 = i_9;
		}

		i_5 <<= 1;

		byte b_14;
		int i_10001;
		for (i_8 <<= 1; i_5 < i_8; i_4 += i_12) {
			i_1 = i_4 >> 8;
			b_14 = bytes_2[i_1];
			i_0 = (b_14 << 8) + (i_4 & 0xff) * (bytes_2[i_1 + 1] - b_14);
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_6 >> 6;
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_7 >> 6;
		}

		if (i_12 == 0 || (i_8 = (i_5 >> 1) + (i_10 - i_4 + i_12 - 1) / i_12) > i_9) {
			i_8 = i_9;
		}

		i_8 <<= 1;

		for (i_1 = i_13; i_5 < i_8; i_4 += i_12) {
			b_14 = bytes_2[i_4 >> 8];
			i_0 = (b_14 << 8) + (i_1 - b_14) * (i_4 & 0xff);
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_6 >> 6;
			i_10001 = i_5++;
			ints_3[i_10001] += i_0 * i_7 >> 6;
		}

		class282_sub15_sub5_sub2_11.anInt9853 = i_4;
		return i_5 >> 1;
	}

	static int method16031(byte[] bytes_1, int[] ints_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, Node_Sub15_Sub5_Sub2 class282_sub15_sub5_sub2_10) {
		i_3 >>= 8;
		i_9 >>= 8;
		i_5 <<= 2;
		i_6 <<= 2;
		if ((i_7 = i_4 + i_9 - i_3) > i_8) {
			i_7 = i_8;
		}

		i_4 <<= 1;
		i_7 <<= 1;

		int i_10001;
		byte b_11;
		for (i_7 -= 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
			b_11 = bytes_1[i_3++];
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_5;
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_6;
			b_11 = bytes_1[i_3++];
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_5;
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_6;
			b_11 = bytes_1[i_3++];
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_5;
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_6;
			b_11 = bytes_1[i_3++];
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_5;
			i_10001 = i_4++;
		}

		for (i_7 += 6; i_4 < i_7; ints_2[i_10001] += b_11 * i_6) {
			b_11 = bytes_1[i_3++];
			i_10001 = i_4++;
			ints_2[i_10001] += b_11 * i_5;
			i_10001 = i_4++;
		}

		class282_sub15_sub5_sub2_10.anInt9853 = i_3 << 8;
		return i_4 >> 1;
	}

	public synchronized void method12242(int[] ints_1, int i_2, int i_3) {
		if (this.anInt9846 * -298675253 * -1302038045 == 0 && this.anInt9858 * 1156515807 * 1008956447 == 0) {
			this.method12231(i_3);
		} else {
			int i_4 = this.anInt9844 * 900940833 * -99794975 << 8;
			int i_5 = this.anInt9856 * -628161865 * -1048610041 << 8;
			int i_6 = ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470.length << 8;
			int i_7 = i_5 - i_4;
			if (i_7 <= 0) {
				this.anInt9854 = 0 * 1507503163;
			}

			int i_8 = i_2;
			i_3 += i_2;
			if (this.anInt9853 * -834443097 * -354697449 < 0) {
				if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 <= 0) {
					this.method15354();
					this.remove();
					return;
				}

				this.anInt9853 = 0 * -354697449;
			}

			if (this.anInt9853 * -834443097 * -354697449 >= i_6) {
				if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 >= 0) {
					this.method15354();
					this.remove();
					return;
				}

				this.anInt9853 = (i_6 - 1) * -834443097 * -354697449;
			}

			if (this.anInt9854 * -485012237 * 1507503163 < 0) {
				if (this.aBool9857) {
					if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
						i_8 = this.method16018(ints_1, i_2, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
						if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
							return;
						}

						this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
						this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
					}

					while (true) {
						i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
						if (this.anInt9853 * -834443097 * -354697449 < i_5) {
							break;
						}

						this.anInt9853 = (i_5 + i_5 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
						this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
						i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
						if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
							break;
						}

						this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
						this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
					}
				} else if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
					while (true) {
						i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
						if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
							break;
						}

						this.anInt9853 = (i_5 - 1 - (i_5 - 1 - this.anInt9853 * -834443097 * -354697449) % i_7) * -834443097 * -354697449;
					}
				} else {
					while (true) {
						i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
						if (this.anInt9853 * -834443097 * -354697449 < i_5) {
							break;
						}

						this.anInt9853 = (i_4 + (this.anInt9853 * -834443097 * -354697449 - i_4) % i_7) * -834443097 * -354697449;
					}
				}
			} else {
				if (this.anInt9854 * -485012237 * 1507503163 > 0) {
					if (this.aBool9857) {
						label111: {
							int i_10002;
							if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
								i_8 = this.method16018(ints_1, i_2, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
								if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
									return;
								}

								this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
								this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
								i_10002 = this.anInt9854 * -485012237 - -485012237;
								this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
								if (i_10002 * 1507503163 == 0) {
									break label111;
								}
							}

							do {
								i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
								if (this.anInt9853 * -834443097 * -354697449 < i_5) {
									return;
								}

								this.anInt9853 = (i_5 + i_5 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
								this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
								i_10002 = this.anInt9854 * -485012237 - -485012237;
								this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
								if (i_10002 * 1507503163 == 0) {
									break;
								}

								i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
								if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
									return;
								}

								this.anInt9853 = (i_4 + i_4 - 1 - this.anInt9853 * -834443097 * -354697449) * -834443097 * -354697449;
								this.anInt9855 = -(this.anInt9855 * 1927994969 * -177305111 * 1927994969 * 1) * -177305111 * 1927994969 * -177305111;
								i_10002 = this.anInt9854 * -485012237 - -485012237;
								this.anInt9854 = (this.anInt9854 * -485012237 - -485012237) * 1507503163;
							} while (i_10002 * 1507503163 != 0);
						}
					} else {
						int i_9;
						if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
							while (true) {
								i_8 = this.method16018(ints_1, i_8, i_4, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9856 * -628161865 * -1048610041 - 1]);
								if (this.anInt9853 * -834443097 * -354697449 >= i_4) {
									return;
								}

								i_9 = (i_5 - 1 - this.anInt9853 * -834443097 * -354697449) / i_7;
								if (i_9 >= this.anInt9854 * -485012237 * 1507503163) {
									this.anInt9853 = (this.anInt9853 * -834443097 + i_7 * this.anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
									this.anInt9854 = 0 * 1507503163;
									break;
								}

								this.anInt9853 = (this.anInt9853 * -834443097 + i_7 * i_9 * -834443097) * -354697449;
								this.anInt9854 = (this.anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
							}
						} else {
							while (true) {
								i_8 = this.method15990(ints_1, i_8, i_5, i_3, ((Node_Sub26_Sub1_Sub2) this.aNode_Sub26_7601).aByteArray10470[this.anInt9844 * 900940833 * -99794975]);
								if (this.anInt9853 * -834443097 * -354697449 < i_5) {
									return;
								}

								i_9 = (this.anInt9853 * -834443097 * -354697449 - i_4) / i_7;
								if (i_9 >= this.anInt9854 * -485012237 * 1507503163) {
									this.anInt9853 = (this.anInt9853 * -834443097 - i_7 * this.anInt9854 * -485012237 * 1507503163 * -834443097) * -354697449;
									this.anInt9854 = 0 * 1507503163;
									break;
								}

								this.anInt9853 = (this.anInt9853 * -834443097 - i_7 * i_9 * -834443097) * -354697449;
								this.anInt9854 = (this.anInt9854 * -485012237 - i_9 * -485012237) * 1507503163;
							}
						}
					}
				}

				if (this.anInt9855 * 1927994969 * -177305111 * 1927994969 * -177305111 < 0) {
					this.method16018(ints_1, i_8, 0, i_3, 0);
					if (this.anInt9853 * -834443097 * -354697449 < 0) {
						this.anInt9853 = 834443097 * -354697449;
						this.method15354();
						this.remove();
					}
				} else {
					this.method15990(ints_1, i_8, i_6, i_3, 0);
					if (this.anInt9853 * -834443097 * -354697449 >= i_6) {
						this.anInt9853 = i_6 * -834443097 * -354697449;
						this.method15354();
						this.remove();
					}
				}
			}
		}

	}

}
