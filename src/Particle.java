import java.util.Iterator;

public class Particle extends PointEntity {

	short aShort10425;
	ParticleProducer producer;
	short lifetime;
	short lifespan;
	short aShort10431;
	short aShort10424;
	short aShort10430;
	int speed;
	int intermediateColour;

	void link() {
		int index = this.producer.parent.size;
		if (this.producer.parent.particles[index] != null) {
			this.producer.parent.particles[index].kill();
		}

		this.producer.parent.particles[index] = this;
		this.aShort10425 = (short) this.producer.parent.size;
		this.producer.parent.size = index + 1 & 0x1fff;
		this.producer.particles.offer(this, 1353338910);
	}

	void reset(ParticleProducer emitter, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, boolean bool_13, boolean bool_14) {
		this.producer = emitter;
		this.x = i_2 << 12;
		this.z = i_3 << 12;
		this.y = i_4 << 12;
		this.color = i_10;
		this.lifespan = this.lifetime = (short) i_9;
		this.size = i_11;
		this.rotation = i_12;
		this.aBool10210 = bool_14;
		this.aShort10431 = (short) i_5;
		this.aShort10424 = (short) i_6;
		this.aShort10430 = (short) i_7;
		this.speed = i_8;
		this.aByte10211 = this.producer.aClass87_7110.aByte839;
		this.link();
	}

	void kill() {
		this.producer.parent.particles[this.aShort10425] = null;
		Class235.aClass275_Sub1_Sub1_Sub1Array2897[Class235.anInt2905] = this;
		Class235.anInt2905 = Class235.anInt2905 + 1 & 0x3ff;
		this.method4887((byte) -14);
		this.method12423((byte) -115);
	}

	void method15965(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, long long_3) {
		int i_5 = this.x >> sceneobjectmanager_1.anInt2592 + 12;
		int i_6 = this.y >> sceneobjectmanager_1.anInt2592 + 12;
		int i_7 = this.z >> 12;
		if (i_7 <= 0 && i_7 >= -262144 && i_5 >= 0 && i_5 < sceneobjectmanager_1.anInt2617 && i_6 >= 0 && i_6 < sceneobjectmanager_1.anInt2603) {
			ParticleSystem class539_8 = this.producer.parent;
			ParticleProducerDefinition class59_9 = this.producer.definition;
			Class390[] arr_10 = sceneobjectmanager_1.aClass390Array2591;
			int i_11 = class539_8.anInt7122;
			Class293 class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[class539_8.anInt7122][i_5][i_6];
			if (class293_12 != null) {
				i_11 = class293_12.aByte3507;
			}

			int i_13 = arr_10[i_11].method6722(i_5, i_6, 65280);
			int i_14;
			if (i_11 < sceneobjectmanager_1.anInt2601 - 1) {
				i_14 = arr_10[i_11 + 1].method6722(i_5, i_6, 65280);
			} else {
				i_14 = i_13 - (8 << sceneobjectmanager_1.anInt2592);
			}

			if (class59_9.aBool578) {
				if (class59_9.anInt591 == -1 && i_7 > i_13) {
					this.kill();
					return;
				}

				if (class59_9.anInt591 >= 0 && i_7 > arr_10[class59_9.anInt591].method6722(i_5, i_6, 65280)) {
					this.kill();
					return;
				}

				if (class59_9.anInt600 == -1 && i_7 < i_14) {
					this.kill();
					return;
				}

				if (class59_9.anInt600 >= 0 && i_7 < arr_10[class59_9.anInt600 + 1].method6722(i_5, i_6, 65280)) {
					this.kill();
					return;
				}
			}

			int i_15;
			for (i_15 = sceneobjectmanager_1.anInt2601 - 1; i_15 > 0 && i_7 > arr_10[i_15].method6722(i_5, i_6, 65280); --i_15) {
				;
			}

			if (class59_9.aBool541 && i_15 == 0 && i_7 > arr_10[0].method6722(i_5, i_6, 65280)) {
				this.kill();
			} else if (i_15 == sceneobjectmanager_1.anInt2601 - 1 && arr_10[i_15].method6722(i_5, i_6, 65280) - i_7 > 8 << sceneobjectmanager_1.anInt2592) {
				this.kill();
			} else {
				class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[i_15][i_5][i_6];
				int i_17;
				if (class293_12 == null) {
					if (i_15 == 0 || sceneobjectmanager_1.aClass293ArrayArrayArray2604[0][i_5][i_6] == null) {
						class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[0][i_5][i_6] = new Class293(0);
					}

					boolean bool_16 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[0][i_5][i_6].aClass293_3509 != null;
					if (i_15 == 3 && bool_16) {
						this.kill();
						return;
					}

					for (i_17 = 1; i_17 <= i_15; i_17++) {
						if (sceneobjectmanager_1.aClass293ArrayArrayArray2604[i_17][i_5][i_6] == null) {
							class293_12 = sceneobjectmanager_1.aClass293ArrayArrayArray2604[i_17][i_5][i_6] = new Class293(i_17);
							if (bool_16) {
								++class293_12.aByte3507;
							}
						}
					}
				}

				if (class59_9.aBool576) {
					int i_20 = this.x >> 12;
					i_17 = this.y >> 12;
					Class200 class200_18;
					if (class293_12.aClass521_Sub1_Sub5_3505 != null) {
						class200_18 = class293_12.aClass521_Sub1_Sub5_3505.method12992(graphicalrenderer_2, (byte) -108);
						if (class200_18 != null && class200_18.method3255(i_20, i_7, i_17)) {
							this.kill();
							return;
						}
					}

					if (class293_12.aClass521_Sub1_Sub5_3502 != null) {
						class200_18 = class293_12.aClass521_Sub1_Sub5_3502.method12992(graphicalrenderer_2, (byte) -127);
						if (class200_18 != null && class200_18.method3255(i_20, i_7, i_17)) {
							this.kill();
							return;
						}
					}

					if (class293_12.aClass521_Sub1_Sub3_3499 != null) {
						class200_18 = class293_12.aClass521_Sub1_Sub3_3499.method12992(graphicalrenderer_2, (byte) -37);
						if (class200_18 != null && class200_18.method3255(i_20, i_7, i_17)) {
							this.kill();
							return;
						}
					}

					for (Class208 class208_21 = class293_12.aClass208_3504; class208_21 != null; class208_21 = class208_21.aClass208_2660) {
						Class200 class200_19 = class208_21.aClass521_Sub1_Sub1_2659.method12992(graphicalrenderer_2, (byte) -12);
						if (class200_19 != null && class200_19.method3255(i_20, i_7, i_17)) {
							this.kill();
							return;
						}
					}
				}

				class539_8.aClass151_7131.aClass464_1961.method7735(this, -606845948);
			}
		} else {
			this.kill();
		}

	}

	Particle(ParticleProducer class538_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, boolean bool_13, boolean bool_14) {
		this.producer = class538_1;
		this.x = i_2 << 12;
		this.z = i_3 << 12;
		this.y = i_4 << 12;
		this.color = i_10;
		this.lifespan = this.lifetime = (short) i_9;
		this.size = i_11;
		this.rotation = i_12;
		this.aBool10210 = bool_14;
		this.aShort10431 = (short) i_5;
		this.aShort10424 = (short) i_6;
		this.aShort10430 = (short) i_7;
		this.speed = i_8;
		this.aByte10211 = this.producer.aClass87_7110.aByte839;
		this.link();
	}

	void method15967(long long_1, int delta) {
		this.lifetime = (short) (this.lifetime - delta);
		if (this.lifetime <= 0) {
			this.kill();
		} else {
			int tileX = this.x >> 12;
			int tileZ = this.z >> 12;
			int plane = this.y >> 12;
			ParticleSystem system = this.producer.parent;
			ParticleProducerDefinition definition = this.producer.definition;
			if (definition.fadeColor != 0) {
				if (this.lifespan - this.lifetime <= definition.colorFadeStart) {
					int r = delta * definition.fadeRedStep + (this.intermediateColour >> 16 & 0xff) + (this.color >> 8 & 0xff00);
					int g = delta * definition.fadeGreenStep + (this.color & 0xff00) + (this.intermediateColour >> 8 & 0xff);
					int b = delta * definition.fadeBlueStep + (this.color << 8 & 0xff00) + (this.intermediateColour & 0xff);
					if (r < 0) {
						r = 0;
					} else if (r > 65535) {
						r = 65535;
					}

					if (g < 0) {
						g = 0;
					} else if (g > 65535) {
						g = 65535;
					}

					if (b < 0) {
						b = 0;
					} else if (b > 65535) {
						b = 65535;
					}

					this.color &= ~0xffffff;
					this.color |= (g & 0xff00) + ((b & 0xff00) >> 8) + ((r & 0xff00) << 8);
					this.intermediateColour &= ~0xffffff;
					this.intermediateColour |= (b & 0xff) + ((r & 0xff) << 16) + ((g & 0xff) << 8);
				}

				if (this.lifespan - this.lifetime <= definition.alphaFadeStart) {
					int a = delta * definition.fadeAlphaStep + (this.intermediateColour >> 24 & 0xff) + (this.color >> 16 & 0xff00);
					if (a < 0) {
						a = 0;
					} else if (a > 65535) {
						a = 65535;
					}

					this.color &= 0xffffff;
					this.color |= (a & 0xff00) << 16;
					this.intermediateColour &= 0xffffff;
					this.intermediateColour |= (a & 0xff) << 24;
				}
			}

			if (definition.endSpeed != -1 && this.lifespan - this.lifetime <= definition.startSpeedChange) {
				this.speed += definition.speedStep * delta;
			}

			if (definition.endSize != -1 && this.lifespan - this.lifetime <= definition.startSizeChange) {
				this.size += definition.sizeChangeStep * delta;
			}

			double directionX = (double) this.aShort10431;
			double directionZ = (double) this.aShort10424;
			double directionY = (double) this.aShort10430;
			boolean bool_15 = false;
			int dx;
			int dz;
			int dy;
			int i_19;
			long long_20;
			if (definition.anInt542 == 1) {
				dx = tileX - this.producer.current.centerX;
				dz = tileZ - this.producer.current.centerZ;
				dy = plane - this.producer.current.centerY;
				i_19 = (int) Math.sqrt((double) (dx * dx + dz * dz + dy * dy)) >> 2;
				long_20 = (long) (delta * i_19 * definition.anInt569);
				this.speed = (int) ((long) this.speed - ((long) this.speed * long_20 >> 18));
			} else if (definition.anInt542 == 2) {
				dx = tileX - this.producer.current.centerX;
				dz = tileZ - this.producer.current.centerZ;
				dy = plane - this.producer.current.centerY;
				i_19 = dx * dx + dz * dz + dy * dy;
				long_20 = (long) (delta * i_19 * definition.anInt569);
				this.speed = (int) ((long) this.speed - ((long) this.speed * long_20 >> 28));
			}

			Class282_Sub40 class282_sub40_45;
			Class345 class345_46;
			if (definition.anIntArray559 != null) {
				Iterator iterator_44 = system.aList7127.iterator();

				label218: while (true) {
					do {
						if (!iterator_44.hasNext()) {
							break label218;
						}

						class282_sub40_45 = (Class282_Sub40) iterator_44.next();
						class345_46 = class282_sub40_45.aClass345_8007;
					} while (class345_46.anInt4041 == 1);

					boolean found = false;

					for (int i_47 = 0; i_47 < definition.anIntArray559.length; i_47++) {
						if (class345_46.anInt4032 == definition.anIntArray559[i_47]) {
							found = true;
							break;
						}
					}

					if (found) {
						double d_51 = (double) (tileX - class282_sub40_45.anInt8010);
						double d_22 = (double) (tileZ - class282_sub40_45.anInt8006);
						double d_24 = (double) (plane - class282_sub40_45.anInt8008);
						double d_26 = d_51 * d_51 + d_22 * d_22 + d_24 * d_24;
						if (d_26 <= (double) class345_46.aLong4044) {
							double d_28 = Math.sqrt(d_26);
							if (d_28 == 0.0D) {
								d_28 = 1.0D;
							}

							double d_30 = (d_51 * (double) class282_sub40_45.aFloat8011 + d_22 * (double) class345_46.anInt4036 + d_24 * (double) class282_sub40_45.aFloat8012) * 65535.0D / ((double) class345_46.anInt4033 * d_28);
							if (d_30 >= (double) class345_46.anInt4024) {
								double d_32 = 0.0D;
								if (class345_46.anInt4038 == 1) {
									d_32 = d_28 / 16.0D * (double) class345_46.anInt4035;
								} else if (class345_46.anInt4038 == 2) {
									d_32 = d_28 / 16.0D * (d_28 / 16.0D) * (double) class345_46.anInt4035;
								}

								if (class345_46.anInt4039 == 0) {
									if (class345_46.anInt4040 == 0) {
										directionX += ((double) class282_sub40_45.aFloat8011 - d_32) * (double) delta;
										directionZ += ((double) class345_46.anInt4036 - d_32) * (double) delta;
										directionY += ((double) class282_sub40_45.aFloat8012 - d_32) * (double) delta;
										bool_15 = true;
									} else {
										this.x = (int) ((double) this.x + ((double) class282_sub40_45.aFloat8011 - d_32) * (double) delta);
										this.z = (int) ((double) this.z + ((double) class345_46.anInt4036 - d_32) * (double) delta);
										this.y = (int) ((double) this.y + ((double) class282_sub40_45.aFloat8012 - d_32) * (double) delta);
									}
								} else {
									double d_34 = d_51 / d_28 * (double) class345_46.anInt4033;
									double d_36 = d_22 / d_28 * (double) class345_46.anInt4033;
									double d_38 = d_24 / d_28 * (double) class345_46.anInt4033;
									if (class345_46.anInt4040 == 0) {
										directionX += d_34 * (double) delta;
										directionZ += d_36 * (double) delta;
										directionY += d_38 * (double) delta;
										bool_15 = true;
									} else {
										this.x = (int) ((double) this.x + d_34 * (double) delta);
										this.z = (int) ((double) this.z + d_36 * (double) delta);
										this.y = (int) ((double) this.y + d_38 * (double) delta);
									}
								}
							}
						}
					}
				}
			}

			if (definition.anIntArray582 != null) {
				for (dx = 0; dx < definition.anIntArray582.length; dx++) {
					class282_sub40_45 = (Class282_Sub40) Class235.aClass465_2904.get((long) definition.anIntArray582[dx]);

					while (class282_sub40_45 != null) {
						class345_46 = class282_sub40_45.aClass345_8007;
						double d_48 = (double) (tileX - class282_sub40_45.anInt8010);
						double d_21 = (double) (tileZ - class282_sub40_45.anInt8006);
						double d_23 = (double) (plane - class282_sub40_45.anInt8008);
						double d_25 = d_48 * d_48 + d_21 * d_21 + d_23 * d_23;
						if (d_25 > (double) class345_46.aLong4044) {
							class282_sub40_45 = (Class282_Sub40) Class235.aClass465_2904.method7747(-1253459750);
						} else {
							double d_27 = Math.sqrt(d_25);
							if (d_27 == 0.0D) {
								d_27 = 1.0D;
							}

							double d_29 = (d_48 * (double) class282_sub40_45.aFloat8011 + d_21 * (double) class345_46.anInt4036 + d_23 * (double) class282_sub40_45.aFloat8012) * 65535.0D / ((double) class345_46.anInt4033 * d_27);
							if (d_29 < (double) class345_46.anInt4024) {
								class282_sub40_45 = (Class282_Sub40) Class235.aClass465_2904.method7747(-1518106530);
							} else {
								double d_31 = 0.0D;
								if (class345_46.anInt4038 == 1) {
									d_31 = d_27 / 16.0D * (double) class345_46.anInt4035;
								} else if (class345_46.anInt4038 == 2) {
									d_31 = d_27 / 16.0D * (d_27 / 16.0D) * (double) class345_46.anInt4035;
								}

								if (class345_46.anInt4039 == 0) {
									if (class345_46.anInt4040 == 0) {
										directionX += ((double) class282_sub40_45.aFloat8011 - d_31) * (double) delta;
										directionZ += ((double) class345_46.anInt4036 - d_31) * (double) delta;
										directionY += ((double) class282_sub40_45.aFloat8012 - d_31) * (double) delta;
										bool_15 = true;
									} else {
										this.x = (int) ((double) this.x + ((double) class282_sub40_45.aFloat8011 - d_31) * (double) delta);
										this.z = (int) ((double) this.z + ((double) class345_46.anInt4036 - d_31) * (double) delta);
										this.y = (int) ((double) this.y + ((double) class282_sub40_45.aFloat8012 - d_31) * (double) delta);
									}
								} else {
									double d_33 = d_48 / d_27 * (double) class345_46.anInt4033;
									double d_35 = d_21 / d_27 * (double) class345_46.anInt4033;
									double d_37 = d_23 / d_27 * (double) class345_46.anInt4033;
									if (class345_46.anInt4040 == 0) {
										directionX += d_33 * (double) delta;
										directionZ += d_35 * (double) delta;
										directionY += d_37 * (double) delta;
										bool_15 = true;
									} else {
										this.x = (int) ((double) this.x + d_33 * (double) delta);
										this.z = (int) ((double) this.z + d_35 * (double) delta);
										this.y = (int) ((double) this.y + d_37 * (double) delta);
									}
								}

								class282_sub40_45 = (Class282_Sub40) Class235.aClass465_2904.method7747(-1586920665);
							}
						}
					}
				}
			}

			if (definition.anIntArray561 != null) {
				if (definition.anIntArray562 == null) {
					definition.anIntArray562 = new int[definition.anIntArray561.length];

					for (dx = 0; dx < definition.anIntArray561.length; dx++) {
						Class423.method7065(definition.anIntArray561[dx], -1229346850);
						definition.anIntArray562[dx] = ((Class282_Sub38) Class345.aClass465_4029.get((long) definition.anIntArray561[dx])).anInt8002;
					}
				}

				for (dx = 0; dx < definition.anIntArray562.length; dx++) {
					Class345 class345_52 = Class345.aClass345Array4025[definition.anIntArray562[dx]];
					if (class345_52.anInt4040 == 0) {
						directionX += (double) (delta * class345_52.anInt4027);
						directionZ += (double) (delta * class345_52.anInt4036);
						directionY += (double) (delta * class345_52.anInt4037);
						bool_15 = true;
					} else {
						this.x += class345_52.anInt4027 * delta;
						this.z += class345_52.anInt4036 * delta;
						this.y += class345_52.anInt4037 * delta;
					}
				}
			}

			if (bool_15) {
				while (true) {
					if (directionX <= 32767.0D && directionZ <= 32767.0D && directionY <= 32767.0D && directionX >= -32767.0D && directionZ >= -32767.0D && directionY >= -32767.0D) {
						this.aShort10431 = (short) ((int) directionX);
						this.aShort10424 = (short) ((int) directionZ);
						this.aShort10430 = (short) ((int) directionY);
						break;
					}

					directionX /= 2.0D;
					directionZ /= 2.0D;
					directionY /= 2.0D;
					this.speed <<= 1;
				}
			}

			this.x = (int) ((long) this.x + ((long) this.aShort10431 * (long) (this.speed << 2) >> 23) * (long) delta);
			this.z = (int) ((long) this.z + ((long) this.aShort10424 * (long) (this.speed << 2) >> 23) * (long) delta);
			this.y = (int) ((long) this.y + ((long) this.aShort10430 * (long) (this.speed << 2) >> 23) * (long) delta);
		}

	}

}
