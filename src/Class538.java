public class Class538 {

	int anInt7104;
	int anInt7108;
	int anInt7111;
	int anInt7112;
	Class234 aClass234_7109 = new Class234();
	Class234 aClass234_7115 = new Class234();
	int anInt7103 = 0;
	int anInt7114;
	int anInt7113;
	int anInt7116;
	int anInt7117;
	boolean aBool7118 = false;
	boolean aBool7105 = false;
	boolean aBool7107 = false;
	Class87 aClass87_7110;
	Class539 aClass539_7102;
	long aLong7106;
	Class59 aClass59_7101;
	Class457 aClass457_7100;

	void method11493(GraphicalRenderer graphicalrenderer_1, long long_2, int i_4, boolean bool_5, int i_6) {
		int i_29;
		if (this.aBool7107) {
			bool_5 = false;
		} else if (Class235.anInt2906 < this.aClass59_7101.anInt571) {
			bool_5 = false;
		} else if (Class235.anInt2903 > Class89.anIntArray934[Class235.anInt2906]) {
			bool_5 = false;
		} else if (this.aBool7105) {
			bool_5 = false;
		} else if (this.aClass59_7101.anInt535 != -1) {
			i_29 = (int) (long_2 - this.aLong7106);
			if (!this.aClass59_7101.aBool568 && i_29 > this.aClass59_7101.anInt535) {
				bool_5 = false;
			} else {
				i_29 %= this.aClass59_7101.anInt535;
			}

			if (!this.aClass59_7101.aBool567 && i_29 < this.aClass59_7101.anInt537) {
				bool_5 = false;
			}

			if (this.aClass59_7101.aBool567 && i_29 >= this.aClass59_7101.anInt537) {
				bool_5 = false;
			}
		}

		this.anInt7104 = 0;

		for (Class275_Sub1_Sub1_Sub1 class275_sub1_sub1_sub1_7 = (Class275_Sub1_Sub1_Sub1) this.aClass457_7100.method7659(301908602); class275_sub1_sub1_sub1_7 != null; class275_sub1_sub1_sub1_7 = (Class275_Sub1_Sub1_Sub1) this.aClass457_7100.method7650((byte) 88)) {
			class275_sub1_sub1_sub1_7.method15967(long_2, i_4);
			++this.anInt7104;
		}

		if (bool_5) {
			i_29 = (this.aClass234_7115.anInt2890 + this.aClass234_7115.anInt2893 + this.aClass234_7115.anInt2888) / 3;
			int i_8 = (this.aClass234_7115.anInt2885 + this.aClass234_7115.anInt2895 + this.aClass234_7115.anInt2891) / 3;
			int i_9 = (this.aClass234_7115.anInt2886 + this.aClass234_7115.anInt2889 + this.aClass234_7115.anInt2884) / 3;
			int i_10;
			int i_11;
			int i_12;
			int i_13;
			int i_14;
			int i_15;
			int i_16;
			int i_17;
			int i_18;
			if (this.aClass234_7115.anInt2894 != i_29 || this.aClass234_7115.anInt2887 != i_8 || this.aClass234_7115.anInt2892 != i_9 || !this.aBool7118) {
				this.aClass234_7115.anInt2894 = i_29;
				this.aClass234_7115.anInt2887 = i_8;
				this.aClass234_7115.anInt2892 = i_9;
				i_10 = this.aClass234_7115.anInt2893 - this.aClass234_7115.anInt2888;
				i_11 = this.aClass234_7115.anInt2895 - this.aClass234_7115.anInt2885;
				i_12 = this.aClass234_7115.anInt2889 - this.aClass234_7115.anInt2886;
				i_13 = this.aClass234_7115.anInt2890 - this.aClass234_7115.anInt2888;
				i_14 = this.aClass234_7115.anInt2891 - this.aClass234_7115.anInt2885;
				i_15 = this.aClass234_7115.anInt2884 - this.aClass234_7115.anInt2886;
				this.anInt7108 = i_11 * i_15 - i_12 * i_14;
				this.anInt7111 = i_12 * i_13 - i_10 * i_15;
				this.anInt7112 = i_10 * i_14 - i_13 * i_11;

				while (true) {
					if (this.anInt7108 <= 32767 && this.anInt7111 <= 32767 && this.anInt7112 <= 32767 && this.anInt7108 >= -32767 && this.anInt7111 >= -32767 && this.anInt7112 >= -32767) {
						i_16 = (int) Math.sqrt((double) (this.anInt7112 * this.anInt7112 + this.anInt7111 * this.anInt7111 + this.anInt7108 * this.anInt7108));
						if (i_16 <= 0) {
							i_16 = 1;
						}

						this.anInt7108 = this.anInt7108 * 32767 / i_16;
						this.anInt7111 = this.anInt7111 * 32767 / i_16;
						this.anInt7112 = this.anInt7112 * 32767 / i_16;
						if (this.aClass59_7101.aShort570 > 0 || this.aClass59_7101.aShort579 > 0) {
							i_17 = (int) (Math.atan2((double) this.anInt7112, (double) this.anInt7108) * 2607.5945876176133D);
							i_18 = (int) (Math.atan2((double) this.anInt7111, Math.sqrt((double) (this.anInt7108 * this.anInt7108 + this.anInt7112 * this.anInt7112))) * 2607.5945876176133D);
							this.anInt7114 = this.aClass59_7101.aShort570 - this.aClass59_7101.aShort530;
							this.anInt7113 = this.aClass59_7101.aShort530 + i_17 - (this.anInt7114 >> 1);
							this.anInt7116 = this.aClass59_7101.aShort579 - this.aClass59_7101.aShort536;
							this.anInt7117 = this.aClass59_7101.aShort536 + i_18 - (this.anInt7116 >> 1);
						}

						this.aBool7118 = true;
						break;
					}

					this.anInt7108 >>= 1;
					this.anInt7111 >>= 1;
					this.anInt7112 >>= 1;
				}
			}

			this.anInt7103 += (int) ((double) i_4 * ((double) this.aClass59_7101.anInt546 + Math.random() * (double) (this.aClass59_7101.anInt545 - this.aClass59_7101.anInt546)));
			if (this.anInt7103 > 63) {
				i_10 = this.anInt7103 >> 6;
				this.anInt7103 &= 0x3f;
				i_11 = (i_4 << 8) / i_10;
				i_12 = 0;

				for (i_13 = 0; i_13 < i_10; i_12 += i_11) {
					int i_20;
					int i_21;
					int i_22;
					if (this.aClass59_7101.aShort570 <= 0 && this.aClass59_7101.aShort579 <= 0) {
						i_14 = this.anInt7108;
						i_15 = this.anInt7111;
						i_16 = this.anInt7112;
					} else {
						i_17 = this.anInt7113 + (int) ((double) this.anInt7114 * Math.random());
						i_17 &= 0x3fff;
						i_18 = Class382.anIntArray4657[i_17];
						int i_19 = Class382.anIntArray4661[i_17];
						i_20 = this.anInt7117 + (int) ((double) this.anInt7116 * Math.random());
						i_20 &= 0x1fff;
						i_21 = Class382.anIntArray4657[i_20];
						i_22 = Class382.anIntArray4661[i_20];
						byte b_23 = 13;
						i_14 = i_19 * i_21 >> b_23;
						i_15 = (i_22 << 1) * -1;
						i_16 = i_21 * i_18 >> b_23;
					}

					float f_32 = (float) Math.random();
					float f_33 = (float) Math.random();
					if (f_32 + f_33 > 1.0F) {
						f_32 = 1.0F - f_32;
						f_33 = 1.0F - f_33;
					}

					float f_34 = 1.0F - (f_32 + f_33);
					i_20 = (int) (f_33 * (float) this.aClass234_7115.anInt2893 + (float) this.aClass234_7115.anInt2888 * f_32 + f_34 * (float) this.aClass234_7115.anInt2890);
					i_21 = (int) ((float) this.aClass234_7115.anInt2895 * f_33 + (float) this.aClass234_7115.anInt2885 * f_32 + (float) this.aClass234_7115.anInt2891 * f_34);
					i_22 = (int) (f_34 * (float) this.aClass234_7115.anInt2884 + (float) this.aClass234_7115.anInt2886 * f_32 + f_33 * (float) this.aClass234_7115.anInt2889);
					int i_35 = this.aClass59_7101.anInt538 + (int) (Math.random() * (double) (this.aClass59_7101.anInt539 - this.aClass59_7101.anInt538));
					int i_24 = this.aClass59_7101.anInt555 + (int) (Math.random() * (double) (this.aClass59_7101.anInt556 - this.aClass59_7101.anInt555));
					int i_25 = this.aClass59_7101.anInt544 + (int) (Math.random() * (double) (this.aClass59_7101.anInt577 - this.aClass59_7101.anInt544));
					int i_26;
					if (this.aClass59_7101.aBool550) {
						double d_27 = Math.random();
						i_26 = (int) (d_27 * (double) this.aClass59_7101.anInt581 + (double) this.aClass59_7101.anInt565) << 16 | (int) ((double) this.aClass59_7101.anInt551 + d_27 * (double) this.aClass59_7101.anInt584) << 8 | (int) ((double) this.aClass59_7101.anInt585 + d_27 * (double) this.aClass59_7101.anInt587) | (int) ((double) this.aClass59_7101.anInt588 + Math.random() * (double) this.aClass59_7101.anInt590) << 24;
					} else {
						i_26 = (int) ((double) this.aClass59_7101.anInt565 + Math.random() * (double) this.aClass59_7101.anInt581) << 16 | (int) ((double) this.aClass59_7101.anInt551 + Math.random() * (double) this.aClass59_7101.anInt584) << 8 | (int) ((double) this.aClass59_7101.anInt585 + Math.random() * (double) this.aClass59_7101.anInt587) | (int) ((double) this.aClass59_7101.anInt588 + Math.random() * (double) this.aClass59_7101.anInt590) << 24;
					}

					int i_30 = this.aClass59_7101.anInt554;
					if (!graphicalrenderer_1.method8406() && !this.aClass59_7101.aBool574) {
						i_30 = -1;
					}

					Class275_Sub1_Sub1_Sub1 class275_sub1_sub1_sub1_28;
					if (Class235.anInt2905 != Class235.anInt2902) {
						class275_sub1_sub1_sub1_28 = Class235.aClass275_Sub1_Sub1_Sub1Array2897[Class235.anInt2902];
						Class235.anInt2902 = Class235.anInt2902 + 1 & 0x3ff;
						class275_sub1_sub1_sub1_28.method15955(this, i_20, i_21, i_22, i_14, i_15, i_16, i_35, i_24, i_26, i_25, i_30, this.aClass59_7101.aBool572, this.aClass59_7101.aBool534);
					} else {
						class275_sub1_sub1_sub1_28 = new Class275_Sub1_Sub1_Sub1(this, i_20, i_21, i_22, i_14, i_15, i_16, i_35, i_24, i_26, i_25, i_30, this.aClass59_7101.aBool572, this.aClass59_7101.aBool534);
					}

					if (i_12 > 256) {
						class275_sub1_sub1_sub1_28.method15967(long_2, i_12 >> 8);
					}

					++this.anInt7104;
					++i_13;
				}
			}
		}

		if (!this.aClass234_7115.method3944(this.aClass234_7109, (byte) 15)) {
			Class234 class234_31 = this.aClass234_7109;
			this.aClass234_7109 = this.aClass234_7115;
			this.aClass234_7115 = class234_31;
			this.aClass234_7115.anInt2888 = this.aClass87_7110.anInt844;
			this.aClass234_7115.anInt2885 = this.aClass87_7110.anInt841;
			this.aClass234_7115.anInt2886 = this.aClass87_7110.anInt847;
			this.aClass234_7115.anInt2893 = this.aClass87_7110.anInt834;
			this.aClass234_7115.anInt2895 = this.aClass87_7110.anInt843;
			this.aClass234_7115.anInt2889 = this.aClass87_7110.anInt845;
			this.aClass234_7115.anInt2890 = this.aClass87_7110.anInt846;
			this.aClass234_7115.anInt2891 = this.aClass87_7110.anInt840;
			this.aClass234_7115.anInt2884 = this.aClass87_7110.anInt848;
			this.aClass234_7115.anInt2894 = this.aClass234_7109.anInt2894;
			this.aClass234_7115.anInt2887 = this.aClass234_7109.anInt2887;
			this.aClass234_7115.anInt2892 = this.aClass234_7109.anInt2892;
		}

		Class235.anInt2900 += this.anInt7104;
	}

	void method11494(byte b_1) {
		this.aClass234_7115.anInt2888 = this.aClass87_7110.anInt844;
		this.aClass234_7115.anInt2885 = this.aClass87_7110.anInt841;
		this.aClass234_7115.anInt2886 = this.aClass87_7110.anInt847;
		this.aClass234_7115.anInt2893 = this.aClass87_7110.anInt834;
		this.aClass234_7115.anInt2895 = this.aClass87_7110.anInt843;
		this.aClass234_7115.anInt2889 = this.aClass87_7110.anInt845;
		this.aClass234_7115.anInt2890 = this.aClass87_7110.anInt846;
		this.aClass234_7115.anInt2891 = this.aClass87_7110.anInt840;
		this.aClass234_7115.anInt2884 = this.aClass87_7110.anInt848;
		if (this.aClass234_7115.anInt2893 == this.aClass234_7115.anInt2888 && this.aClass234_7115.anInt2893 == this.aClass234_7115.anInt2890 && this.aClass234_7115.anInt2885 == this.aClass234_7115.anInt2895 && this.aClass234_7115.anInt2895 == this.aClass234_7115.anInt2891 && this.aClass234_7115.anInt2889 == this.aClass234_7115.anInt2886 && this.aClass234_7115.anInt2889 == this.aClass234_7115.anInt2884) {
			this.aBool7105 = true;
		} else if (this.aBool7105) {
			this.aBool7105 = false;
			this.aClass234_7109.anInt2888 = this.aClass234_7115.anInt2888;
			this.aClass234_7109.anInt2885 = this.aClass234_7115.anInt2885;
			this.aClass234_7109.anInt2886 = this.aClass234_7115.anInt2886;
			this.aClass234_7109.anInt2893 = this.aClass234_7115.anInt2893;
			this.aClass234_7109.anInt2895 = this.aClass234_7115.anInt2895;
			this.aClass234_7109.anInt2889 = this.aClass234_7115.anInt2889;
			this.aClass234_7109.anInt2890 = this.aClass234_7115.anInt2890;
			this.aClass234_7109.anInt2891 = this.aClass234_7115.anInt2891;
			this.aClass234_7109.anInt2884 = this.aClass234_7115.anInt2884;
		}

	}

	void method11496(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, long long_3) {
		for (Class275_Sub1_Sub1_Sub1 class275_sub1_sub1_sub1_5 = (Class275_Sub1_Sub1_Sub1) this.aClass457_7100.method7659(301908602); class275_sub1_sub1_sub1_5 != null; class275_sub1_sub1_sub1_5 = (Class275_Sub1_Sub1_Sub1) this.aClass457_7100.method7650((byte) 108)) {
			class275_sub1_sub1_sub1_5.method15965(sceneobjectmanager_1, graphicalrenderer_2, long_3);
		}

	}

	Class538(GraphicalRenderer graphicalrenderer_1, Class87 class87_2, Class539 class539_3, long long_4) {
		this.aClass87_7110 = class87_2;
		this.aClass539_7102 = class539_3;
		this.aLong7106 = long_4;
		this.aClass59_7101 = this.aClass87_7110.method1485(228843304);
		if (!graphicalrenderer_1.method8406() && this.aClass59_7101.anInt573 != -1) {
			this.aClass59_7101 = Class282_Sub11_Sub1.method15434(this.aClass59_7101.anInt573, (byte) 14);
		}

		this.aClass457_7100 = new Class457();
		this.anInt7103 = (int) ((double) this.anInt7103 + Math.random() * 64.0D);
		this.method11494((byte) -43);
		this.aClass234_7109.anInt2888 = this.aClass234_7115.anInt2888;
		this.aClass234_7109.anInt2885 = this.aClass234_7115.anInt2885;
		this.aClass234_7109.anInt2886 = this.aClass234_7115.anInt2886;
		this.aClass234_7109.anInt2893 = this.aClass234_7115.anInt2893;
		this.aClass234_7109.anInt2895 = this.aClass234_7115.anInt2895;
		this.aClass234_7109.anInt2889 = this.aClass234_7115.anInt2889;
		this.aClass234_7109.anInt2890 = this.aClass234_7115.anInt2890;
		this.aClass234_7109.anInt2891 = this.aClass234_7115.anInt2891;
		this.aClass234_7109.anInt2884 = this.aClass234_7115.anInt2884;
	}

	public static void method11500(int i_0, boolean bool_1, byte b_2) {
		Class231.method3914(i_0, Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -929025713), bool_1, (byte) 104);
	}

	static final void method11501(int i_0) {
		Class96_Sub12.method14614(Renderers.SOFTWARE_RENDERER, (long) client.cycles);
		if (client.anInt7349 != -1) {
			UnderlayDefinition.method8777(client.anInt7349, (byte) -116);
		}

		int i_1;
		for (i_1 = 0; i_1 < client.anInt7407; i_1++) {
			client.aBoolArray7410[i_1] = client.aBoolArray7443[i_1];
			client.aBoolArray7443[i_1] = false;
		}

		client.anInt7408 = client.cycles;
		if (client.anInt7349 != -1) {
			client.anInt7407 = 0;
			Class421.method7039((byte) 16);
		}

		Renderers.SOFTWARE_RENDERER.L();
		Class282_Sub20_Sub33.method15411(Renderers.SOFTWARE_RENDERER, (byte) 123);
		i_1 = Class58.method1141(1515135830);
		if (i_1 == -1) {
			i_1 = client.anInt7427;
		}

		if (i_1 == -1) {
			i_1 = client.anInt7340;
		}

		UnderlayIndexLoader.method8036(i_1, (byte) 4);
		client.anInt7261 = 0;
	}

}
