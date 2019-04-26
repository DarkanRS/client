public class CacheableNode_Sub17_Sub2 extends Shadow {

	int anInt10453;
	int anInt10455;
	int anInt10452;
	int anInt10451;
	byte[] aByteArray10454;

	boolean method16039(int i_1, int i_2) {
		return this.aByteArray10454.length >= i_2 * i_1;
	}

	void method16040(int i_1, int i_2, int i_3, int i_4) {
		this.anInt10453 = i_1;
		this.anInt10455 = i_2;
		this.anInt10452 = i_3 - i_1;
		this.anInt10451 = i_4 - i_2;
	}

	void method16042() {
		int i_1 = -1;

		for (int i_2 = this.aByteArray10454.length - 8; i_1 < i_2; this.aByteArray10454[i_1] = 0) {
			++i_1;
			this.aByteArray10454[i_1] = 0;
			++i_1;
			this.aByteArray10454[i_1] = 0;
			++i_1;
			this.aByteArray10454[i_1] = 0;
			++i_1;
			this.aByteArray10454[i_1] = 0;
			++i_1;
			this.aByteArray10454[i_1] = 0;
			++i_1;
			this.aByteArray10454[i_1] = 0;
			++i_1;
			this.aByteArray10454[i_1] = 0;
			++i_1;
		}

		while (i_1 < this.aByteArray10454.length - 1) {
			++i_1;
			this.aByteArray10454[i_1] = 0;
		}

	}

	void method16043(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = 0;
		if (i_2 != i_1) {
			i_7 = (i_5 - i_4 << 16) / (i_2 - i_1);
		}

		int i_8 = 0;
		if (i_3 != i_2) {
			i_8 = (i_6 - i_5 << 16) / (i_3 - i_2);
		}

		int i_9 = 0;
		if (i_3 != i_1) {
			i_9 = (i_4 - i_6 << 16) / (i_1 - i_3);
		}

		if (i_1 <= i_2 && i_1 <= i_3) {
			if (i_2 < i_3) {
				i_6 = i_4 <<= 16;
				if (i_1 < 0) {
					i_6 -= i_9 * i_1;
					i_4 -= i_7 * i_1;
					i_1 = 0;
				}

				i_5 <<= 16;
				if (i_2 < 0) {
					i_5 -= i_8 * i_2;
					i_2 = 0;
				}

				if (i_2 != i_1 && i_9 < i_7 || i_2 == i_1 && i_9 > i_8) {
					i_3 -= i_2;
					i_2 -= i_1;
					i_1 = this.anInt10452 * i_1;

					while (true) {
						--i_2;
						if (i_2 < 0) {
							while (true) {
								--i_3;
								if (i_3 < 0) {
									return;
								}

								method16046(this.aByteArray10454, i_1, 0, i_6 >> 16, i_5 >> 16);
								i_6 += i_9;
								i_5 += i_8;
								i_1 += this.anInt10452;
							}
						}

						method16046(this.aByteArray10454, i_1, 0, i_6 >> 16, i_4 >> 16);
						i_6 += i_9;
						i_4 += i_7;
						i_1 += this.anInt10452;
					}
				} else {
					i_3 -= i_2;
					i_2 -= i_1;
					i_1 = this.anInt10452 * i_1;

					while (true) {
						--i_2;
						if (i_2 < 0) {
							while (true) {
								--i_3;
								if (i_3 < 0) {
									return;
								}

								method16046(this.aByteArray10454, i_1, 0, i_5 >> 16, i_6 >> 16);
								i_6 += i_9;
								i_5 += i_8;
								i_1 += this.anInt10452;
							}
						}

						method16046(this.aByteArray10454, i_1, 0, i_4 >> 16, i_6 >> 16);
						i_6 += i_9;
						i_4 += i_7;
						i_1 += this.anInt10452;
					}
				}
			} else {
				i_5 = i_4 <<= 16;
				if (i_1 < 0) {
					i_5 -= i_9 * i_1;
					i_4 -= i_7 * i_1;
					i_1 = 0;
				}

				i_6 <<= 16;
				if (i_3 < 0) {
					i_6 -= i_3 * i_8;
					i_3 = 0;
				}

				if ((i_3 == i_1 || i_9 >= i_7) && (i_3 != i_1 || i_8 <= i_7)) {
					i_2 -= i_3;
					i_3 -= i_1;
					i_1 = this.anInt10452 * i_1;

					while (true) {
						--i_3;
						if (i_3 < 0) {
							while (true) {
								--i_2;
								if (i_2 < 0) {
									return;
								}

								method16046(this.aByteArray10454, i_1, 0, i_4 >> 16, i_6 >> 16);
								i_6 += i_8;
								i_4 += i_7;
								i_1 += this.anInt10452;
							}
						}

						method16046(this.aByteArray10454, i_1, 0, i_4 >> 16, i_5 >> 16);
						i_5 += i_9;
						i_4 += i_7;
						i_1 += this.anInt10452;
					}
				} else {
					i_2 -= i_3;
					i_3 -= i_1;
					i_1 = this.anInt10452 * i_1;

					while (true) {
						--i_3;
						if (i_3 < 0) {
							while (true) {
								--i_2;
								if (i_2 < 0) {
									return;
								}

								method16046(this.aByteArray10454, i_1, 0, i_6 >> 16, i_4 >> 16);
								i_6 += i_8;
								i_4 += i_7;
								i_1 += this.anInt10452;
							}
						}

						method16046(this.aByteArray10454, i_1, 0, i_5 >> 16, i_4 >> 16);
						i_5 += i_9;
						i_4 += i_7;
						i_1 += this.anInt10452;
					}
				}
			}
		} else if (i_2 <= i_3) {
			if (i_3 < i_1) {
				i_4 = i_5 <<= 16;
				if (i_2 < 0) {
					i_4 -= i_7 * i_2;
					i_5 -= i_8 * i_2;
					i_2 = 0;
				}

				i_6 <<= 16;
				if (i_3 < 0) {
					i_6 -= i_3 * i_9;
					i_3 = 0;
				}

				if ((i_3 == i_2 || i_7 >= i_8) && (i_3 != i_2 || i_7 <= i_9)) {
					i_1 -= i_3;
					i_3 -= i_2;
					i_2 *= this.anInt10452;

					while (true) {
						--i_3;
						if (i_3 < 0) {
							while (true) {
								--i_1;
								if (i_1 < 0) {
									return;
								}

								method16046(this.aByteArray10454, i_2, 0, i_6 >> 16, i_4 >> 16);
								i_4 += i_7;
								i_6 += i_9;
								i_2 += this.anInt10452;
							}
						}

						method16046(this.aByteArray10454, i_2, 0, i_5 >> 16, i_4 >> 16);
						i_4 += i_7;
						i_5 += i_8;
						i_2 += this.anInt10452;
					}
				} else {
					i_1 -= i_3;
					i_3 -= i_2;
					i_2 *= this.anInt10452;

					while (true) {
						--i_3;
						if (i_3 < 0) {
							while (true) {
								--i_1;
								if (i_1 < 0) {
									return;
								}

								method16046(this.aByteArray10454, i_2, 0, i_4 >> 16, i_6 >> 16);
								i_4 += i_7;
								i_6 += i_9;
								i_2 += this.anInt10452;
							}
						}

						method16046(this.aByteArray10454, i_2, 0, i_4 >> 16, i_5 >> 16);
						i_4 += i_7;
						i_5 += i_8;
						i_2 += this.anInt10452;
					}
				}
			} else {
				i_6 = i_5 <<= 16;
				if (i_2 < 0) {
					i_6 -= i_7 * i_2;
					i_5 -= i_8 * i_2;
					i_2 = 0;
				}

				i_4 <<= 16;
				if (i_1 < 0) {
					i_4 -= i_9 * i_1;
					i_1 = 0;
				}

				if (i_7 < i_8) {
					i_3 -= i_1;
					i_1 -= i_2;
					i_2 *= this.anInt10452;

					while (true) {
						--i_1;
						if (i_1 < 0) {
							while (true) {
								--i_3;
								if (i_3 < 0) {
									return;
								}

								method16046(this.aByteArray10454, i_2, 0, i_4 >> 16, i_5 >> 16);
								i_4 += i_9;
								i_5 += i_8;
								i_2 += this.anInt10452;
							}
						}

						method16046(this.aByteArray10454, i_2, 0, i_6 >> 16, i_5 >> 16);
						i_6 += i_7;
						i_5 += i_8;
						i_2 += this.anInt10452;
					}
				} else {
					i_3 -= i_1;
					i_1 -= i_2;
					i_2 *= this.anInt10452;

					while (true) {
						--i_1;
						if (i_1 < 0) {
							while (true) {
								--i_3;
								if (i_3 < 0) {
									return;
								}

								method16046(this.aByteArray10454, i_2, 0, i_5 >> 16, i_4 >> 16);
								i_4 += i_9;
								i_5 += i_8;
								i_2 += this.anInt10452;
							}
						}

						method16046(this.aByteArray10454, i_2, 0, i_5 >> 16, i_6 >> 16);
						i_6 += i_7;
						i_5 += i_8;
						i_2 += this.anInt10452;
					}
				}
			}
		} else if (i_1 < i_2) {
			i_5 = i_6 <<= 16;
			if (i_3 < 0) {
				i_5 -= i_3 * i_8;
				i_6 -= i_3 * i_9;
				i_3 = 0;
			}

			i_4 <<= 16;
			if (i_1 < 0) {
				i_4 -= i_7 * i_1;
				i_1 = 0;
			}

			if (i_8 < i_9) {
				i_2 -= i_1;
				i_1 -= i_3;
				i_3 *= this.anInt10452;

				while (true) {
					--i_1;
					if (i_1 < 0) {
						while (true) {
							--i_2;
							if (i_2 < 0) {
								return;
							}

							method16046(this.aByteArray10454, i_3, 0, i_5 >> 16, i_4 >> 16);
							i_5 += i_8;
							i_4 += i_7;
							i_3 += this.anInt10452;
						}
					}

					method16046(this.aByteArray10454, i_3, 0, i_5 >> 16, i_6 >> 16);
					i_5 += i_8;
					i_6 += i_9;
					i_3 += this.anInt10452;
				}
			} else {
				i_2 -= i_1;
				i_1 -= i_3;
				i_3 *= this.anInt10452;

				while (true) {
					--i_1;
					if (i_1 < 0) {
						while (true) {
							--i_2;
							if (i_2 < 0) {
								return;
							}

							method16046(this.aByteArray10454, i_3, 0, i_4 >> 16, i_5 >> 16);
							i_5 += i_8;
							i_4 += i_7;
							i_3 += this.anInt10452;
						}
					}

					method16046(this.aByteArray10454, i_3, 0, i_6 >> 16, i_5 >> 16);
					i_5 += i_8;
					i_6 += i_9;
					i_3 += this.anInt10452;
				}
			}
		} else {
			i_4 = i_6 <<= 16;
			if (i_3 < 0) {
				i_4 -= i_3 * i_8;
				i_6 -= i_3 * i_9;
				i_3 = 0;
			}

			i_5 <<= 16;
			if (i_2 < 0) {
				i_5 -= i_7 * i_2;
				i_2 = 0;
			}

			if (i_8 < i_9) {
				i_1 -= i_2;
				i_2 -= i_3;
				i_3 *= this.anInt10452;

				while (true) {
					--i_2;
					if (i_2 < 0) {
						while (true) {
							--i_1;
							if (i_1 < 0) {
								return;
							}

							method16046(this.aByteArray10454, i_3, 0, i_5 >> 16, i_6 >> 16);
							i_5 += i_7;
							i_6 += i_9;
							i_3 += this.anInt10452;
						}
					}

					method16046(this.aByteArray10454, i_3, 0, i_4 >> 16, i_6 >> 16);
					i_4 += i_8;
					i_6 += i_9;
					i_3 += this.anInt10452;
				}
			} else {
				i_1 -= i_2;
				i_2 -= i_3;
				i_3 *= this.anInt10452;

				while (true) {
					--i_2;
					if (i_2 < 0) {
						while (true) {
							--i_1;
							if (i_1 < 0) {
								return;
							}

							method16046(this.aByteArray10454, i_3, 0, i_6 >> 16, i_5 >> 16);
							i_5 += i_7;
							i_6 += i_9;
							i_3 += this.anInt10452;
						}
					}

					method16046(this.aByteArray10454, i_3, 0, i_6 >> 16, i_4 >> 16);
					i_4 += i_8;
					i_6 += i_9;
					i_3 += this.anInt10452;
				}
			}
		}
	}

	CacheableNode_Sub17_Sub2(GraphicalRenderer_Sub2 class505_sub2_1, int i_2, int i_3) {
		this.aByteArray10454 = new byte[i_3 * i_2];
	}

	static final void method16046(byte[] bytes_0, int i_1, int i_2, int i_3, int i_4) {
		if (i_3 < i_4) {
			i_1 += i_3;
			i_2 = i_4 - i_3 >> 2;

			while (true) {
				--i_2;
				if (i_2 < 0) {
					i_2 = i_4 - i_3 & 0x3;

					while (true) {
						--i_2;
						if (i_2 < 0) {
							return;
						}

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

}
