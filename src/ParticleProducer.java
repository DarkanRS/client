public class ParticleProducer {

	int particleCount;
	int anInt7108;
	int anInt7111;
	int anInt7112;
	ParticleTriangle aClass234_7109 = new ParticleTriangle();
	ParticleTriangle current = new ParticleTriangle();
	int anInt7103 = 0;
	int anInt7114;
	int anInt7113;
	int anInt7116;
	int anInt7117;
	boolean aBool7118 = false;
	boolean unmoved = false;
	boolean aBool7107 = false;
	Surface aClass87_7110;
	ParticleSystem parent;
	long startTime;
	ParticleProducerDefinition definition;
	EntityList particles;

	void method11493(GraphicalRenderer graphicalrenderer_1, long long_2, int i_4, boolean bool_5, int i_6) {
		int i_29;
		if (this.aBool7107) {
			bool_5 = false;
		} else if (Class235.anInt2906 < this.definition.minimumSetting) {
			bool_5 = false;
		} else if (Class235.anInt2903 > Class89.anIntArray934[Class235.anInt2906]) {
			bool_5 = false;
		} else if (this.unmoved) {
			bool_5 = false;
		} else if (this.definition.lifetime != -1) {
			i_29 = (int) (long_2 - this.startTime);
			if (!this.definition.periodic && i_29 > this.definition.lifetime) {
				bool_5 = false;
			} else {
				i_29 %= this.definition.lifetime;
			}

			if (!this.definition.activeFirst && i_29 < this.definition.anInt537) {
				bool_5 = false;
			}

			if (this.definition.activeFirst && i_29 >= this.definition.anInt537) {
				bool_5 = false;
			}
		}

		this.particleCount = 0;

		for (Particle class275_sub1_sub1_sub1_7 = (Particle) this.particles.method7659(); class275_sub1_sub1_sub1_7 != null; class275_sub1_sub1_sub1_7 = (Particle) this.particles.method7650((byte) 88)) {
			class275_sub1_sub1_sub1_7.method15967(long_2, i_4);
			++this.particleCount;
		}

		if (bool_5) {
			i_29 = (this.current.anInt2890 + this.current.anInt2893 + this.current.anInt2888) / 3;
			int i_8 = (this.current.anInt2885 + this.current.anInt2895 + this.current.anInt2891) / 3;
			int i_9 = (this.current.anInt2886 + this.current.anInt2889 + this.current.anInt2884) / 3;
			int i_10;
			int i_11;
			int i_12;
			int i_13;
			int i_14;
			int i_15;
			int i_16;
			int i_17;
			int i_18;
			if (this.current.centerX != i_29 || this.current.centerZ != i_8 || this.current.centerY != i_9 || !this.aBool7118) {
				this.current.centerX = i_29;
				this.current.centerZ = i_8;
				this.current.centerY = i_9;
				i_10 = this.current.anInt2893 - this.current.anInt2888;
				i_11 = this.current.anInt2895 - this.current.anInt2885;
				i_12 = this.current.anInt2889 - this.current.anInt2886;
				i_13 = this.current.anInt2890 - this.current.anInt2888;
				i_14 = this.current.anInt2891 - this.current.anInt2885;
				i_15 = this.current.anInt2884 - this.current.anInt2886;
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
						if (this.definition.maximumAngleH > 0 || this.definition.maximumAngleV > 0) {
							i_17 = (int) (Math.atan2((double) this.anInt7112, (double) this.anInt7108) * 2607.5945876176133D);
							i_18 = (int) (Math.atan2((double) this.anInt7111, Math.sqrt((double) (this.anInt7108 * this.anInt7108 + this.anInt7112 * this.anInt7112))) * 2607.5945876176133D);
							this.anInt7114 = this.definition.maximumAngleH - this.definition.minimumAngleH;
							this.anInt7113 = this.definition.minimumAngleH + i_17 - (this.anInt7114 >> 1);
							this.anInt7116 = this.definition.maximumAngleV - this.definition.minimumAngleV;
							this.anInt7117 = this.definition.minimumAngleV + i_18 - (this.anInt7116 >> 1);
						}

						this.aBool7118 = true;
						break;
					}

					this.anInt7108 >>= 1;
					this.anInt7111 >>= 1;
					this.anInt7112 >>= 1;
				}
			}

			this.anInt7103 += (int) ((double) i_4 * ((double) this.definition.minimumParticleRate + Math.random() * (double) (this.definition.maximumParticleRate - this.definition.minimumParticleRate)));
			if (this.anInt7103 > 63) {
				i_10 = this.anInt7103 >> 6;
				this.anInt7103 &= 0x3f;
				i_11 = (i_4 << 8) / i_10;
				i_12 = 0;

				for (i_13 = 0; i_13 < i_10; i_12 += i_11) {
					int i_20;
					int i_21;
					int i_22;
					if (this.definition.maximumAngleH <= 0 && this.definition.maximumAngleV <= 0) {
						i_14 = this.anInt7108;
						i_15 = this.anInt7111;
						i_16 = this.anInt7112;
					} else {
						i_17 = this.anInt7113 + (int) ((double) this.anInt7114 * Math.random());
						i_17 &= 0x3fff;
						i_18 = Class382.SINE[i_17];
						int i_19 = Class382.COSINE[i_17];
						i_20 = this.anInt7117 + (int) ((double) this.anInt7116 * Math.random());
						i_20 &= 0x1fff;
						i_21 = Class382.SINE[i_20];
						i_22 = Class382.COSINE[i_20];
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
					i_20 = (int) (f_33 * (float) this.current.anInt2893 + (float) this.current.anInt2888 * f_32 + f_34 * (float) this.current.anInt2890);
					i_21 = (int) ((float) this.current.anInt2895 * f_33 + (float) this.current.anInt2885 * f_32 + (float) this.current.anInt2891 * f_34);
					i_22 = (int) (f_34 * (float) this.current.anInt2884 + (float) this.current.anInt2886 * f_32 + f_33 * (float) this.current.anInt2889);
					int i_35 = this.definition.minimumSpeed + (int) (Math.random() * (double) (this.definition.maximumSpeed - this.definition.minimumSpeed));
					int i_24 = this.definition.minimumLifetime + (int) (Math.random() * (double) (this.definition.maximumLifetime - this.definition.minimumLifetime));
					int i_25 = this.definition.minimumSize + (int) (Math.random() * (double) (this.definition.maximumSize - this.definition.minimumSize));
					int i_26;
					if (this.definition.uniformColorVariance) {
						double d_27 = Math.random();
						i_26 = (int) (d_27 * (double) this.definition.anInt581 + (double) this.definition.anInt565) << 16 | (int) ((double) this.definition.anInt551 + d_27 * (double) this.definition.anInt584) << 8 | (int) ((double) this.definition.anInt585 + d_27 * (double) this.definition.anInt587) | (int) ((double) this.definition.anInt588 + Math.random() * (double) this.definition.anInt590) << 24;
					} else {
						i_26 = (int) ((double) this.definition.anInt565 + Math.random() * (double) this.definition.anInt581) << 16 | (int) ((double) this.definition.anInt551 + Math.random() * (double) this.definition.anInt584) << 8 | (int) ((double) this.definition.anInt585 + Math.random() * (double) this.definition.anInt587) | (int) ((double) this.definition.anInt588 + Math.random() * (double) this.definition.anInt590) << 24;
					}

					int i_30 = this.definition.anInt554;
					if (!graphicalrenderer_1.method8406() && !this.definition.aBool574) {
						i_30 = -1;
					}

					Particle class275_sub1_sub1_sub1_28;
					if (Class235.anInt2905 != Class235.anInt2902) {
						class275_sub1_sub1_sub1_28 = Class235.aEntityNode_Sub1_Sub1_Sub1Array2897[Class235.anInt2902];
						Class235.anInt2902 = Class235.anInt2902 + 1 & 0x3ff;
						class275_sub1_sub1_sub1_28.reset(this, i_20, i_21, i_22, i_14, i_15, i_16, i_35, i_24, i_26, i_25, i_30, this.definition.aBool572, this.definition.aBool534);
					} else {
						class275_sub1_sub1_sub1_28 = new Particle(this, i_20, i_21, i_22, i_14, i_15, i_16, i_35, i_24, i_26, i_25, i_30, this.definition.aBool572, this.definition.aBool534);
					}

					if (i_12 > 256) {
						class275_sub1_sub1_sub1_28.method15967(long_2, i_12 >> 8);
					}

					++this.particleCount;
					++i_13;
				}
			}
		}

		if (!this.current.equals(this.aClass234_7109)) {
			ParticleTriangle triangle = this.aClass234_7109;
			this.aClass234_7109 = this.current;
			this.current = triangle;
			this.current.anInt2888 = this.aClass87_7110.anInt844;
			this.current.anInt2885 = this.aClass87_7110.anInt841;
			this.current.anInt2886 = this.aClass87_7110.anInt847;
			this.current.anInt2893 = this.aClass87_7110.anInt834;
			this.current.anInt2895 = this.aClass87_7110.anInt843;
			this.current.anInt2889 = this.aClass87_7110.anInt845;
			this.current.anInt2890 = this.aClass87_7110.anInt846;
			this.current.anInt2891 = this.aClass87_7110.anInt840;
			this.current.anInt2884 = this.aClass87_7110.anInt848;
			this.current.centerX = this.aClass234_7109.centerX;
			this.current.centerZ = this.aClass234_7109.centerZ;
			this.current.centerY = this.aClass234_7109.centerY;
		}

		Class235.anInt2900 += this.particleCount;
	}

	void updatePosition(byte b_1) {
		this.current.anInt2888 = this.aClass87_7110.anInt844;
		this.current.anInt2885 = this.aClass87_7110.anInt841;
		this.current.anInt2886 = this.aClass87_7110.anInt847;
		this.current.anInt2893 = this.aClass87_7110.anInt834;
		this.current.anInt2895 = this.aClass87_7110.anInt843;
		this.current.anInt2889 = this.aClass87_7110.anInt845;
		this.current.anInt2890 = this.aClass87_7110.anInt846;
		this.current.anInt2891 = this.aClass87_7110.anInt840;
		this.current.anInt2884 = this.aClass87_7110.anInt848;
		if (this.current.anInt2893 == this.current.anInt2888 && this.current.anInt2893 == this.current.anInt2890 && this.current.anInt2885 == this.current.anInt2895 && this.current.anInt2895 == this.current.anInt2891 && this.current.anInt2889 == this.current.anInt2886 && this.current.anInt2889 == this.current.anInt2884) {
			this.unmoved = true;
		} else if (this.unmoved) {
			this.unmoved = false;
			this.aClass234_7109.anInt2888 = this.current.anInt2888;
			this.aClass234_7109.anInt2885 = this.current.anInt2885;
			this.aClass234_7109.anInt2886 = this.current.anInt2886;
			this.aClass234_7109.anInt2893 = this.current.anInt2893;
			this.aClass234_7109.anInt2895 = this.current.anInt2895;
			this.aClass234_7109.anInt2889 = this.current.anInt2889;
			this.aClass234_7109.anInt2890 = this.current.anInt2890;
			this.aClass234_7109.anInt2891 = this.current.anInt2891;
			this.aClass234_7109.anInt2884 = this.current.anInt2884;
		}

	}

	void method11496(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, long long_3) {
		for (Particle class275_sub1_sub1_sub1_5 = (Particle) this.particles.method7659(); class275_sub1_sub1_sub1_5 != null; class275_sub1_sub1_sub1_5 = (Particle) this.particles.method7650((byte) 108)) {
			class275_sub1_sub1_sub1_5.method15965(sceneobjectmanager_1, graphicalrenderer_2, long_3);
		}

	}

	ParticleProducer(GraphicalRenderer graphicalrenderer_1, Surface class87_2, ParticleSystem class539_3, long long_4) {
		this.aClass87_7110 = class87_2;
		this.parent = class539_3;
		this.startTime = long_4;
		this.definition = this.aClass87_7110.method1485();
		if (!graphicalrenderer_1.method8406() && this.definition.anInt573 != -1) {
			this.definition = Node_Sub11_Sub1.getParticleProducerDefs(this.definition.anInt573);
		}

		this.particles = new EntityList();
		this.anInt7103 = (int) ((double) this.anInt7103 + Math.random() * 64.0D);
		this.updatePosition((byte) -43);
		this.aClass234_7109.anInt2888 = this.current.anInt2888;
		this.aClass234_7109.anInt2885 = this.current.anInt2885;
		this.aClass234_7109.anInt2886 = this.current.anInt2886;
		this.aClass234_7109.anInt2893 = this.current.anInt2893;
		this.aClass234_7109.anInt2895 = this.current.anInt2895;
		this.aClass234_7109.anInt2889 = this.current.anInt2889;
		this.aClass234_7109.anInt2890 = this.current.anInt2890;
		this.aClass234_7109.anInt2891 = this.current.anInt2891;
		this.aClass234_7109.anInt2884 = this.current.anInt2884;
	}

	public static void method11500(int i_0, boolean bool_1) {
		Class231.method3914(i_0, Message.LOADING_PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE), bool_1, (byte) 104);
	}

	static final void method11501(int i_0) {
		CutsceneAction_Sub12.method14614(Renderers.SOFTWARE_RENDERER, (long) client.cycles);
		if (client.BASE_WINDOW_ID != -1) {
			CS2Interface.method8777(client.BASE_WINDOW_ID, (byte) -116);
		}

		int i_1;
		for (i_1 = 0; i_1 < client.anInt7407; i_1++) {
			client.aBoolArray7410[i_1] = client.aBoolArray7443[i_1];
			client.aBoolArray7443[i_1] = false;
		}

		client.anInt7408 = client.cycles;
		if (client.BASE_WINDOW_ID != -1) {
			client.anInt7407 = 0;
			StructIndexLoader.method7039((byte) 16);
		}

		Renderers.SOFTWARE_RENDERER.L();
		Node_Sub20_Sub33.method15411(Renderers.SOFTWARE_RENDERER, (byte) 123);
		i_1 = QuickchatFiller.method1141(1515135830);
		if (i_1 == -1) {
			i_1 = client.anInt7427;
		}

		if (i_1 == -1) {
			i_1 = client.anInt7340;
		}

		UnderlayIndexLoader.method8036(i_1);
		client.anInt7261 = 0;
	}

}
