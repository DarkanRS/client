import java.io.IOException;

public class Class312_Sub1 extends JS5StandardRequester {

	Class202 aClass202_7778;

	public void init(Object object_1, boolean bool_2, int i_3) {
		if (this.aClass202_7778 != null) {
			try {
				this.aClass202_7778.method3318(83456367);
			} catch (Exception exception_8) {
				;
			}

			this.aClass202_7778 = null;
		}

		this.aClass202_7778 = (Class202) object_1;
		this.method12537((byte) 78);
		this.method5523(bool_2, (byte) 116);
		this.aClass282_Sub35_3647.index = 0;
		this.current = null;

		while (true) {
			PaddedJS5Request class282_sub50_sub11_sub1_4 = (PaddedJS5Request) this.waitingPriorities.method7937(23154670);
			if (class282_sub50_sub11_sub1_4 == null) {
				while (true) {
					class282_sub50_sub11_sub1_4 = (PaddedJS5Request) this.waitingExtras.method7937(1599470054);
					if (class282_sub50_sub11_sub1_4 == null) {
						if (this.aByte3656 != 0) {
							try {
								this.aClass282_Sub35_3655.index = 0;
								this.aClass282_Sub35_3655.writeByte(4);
								this.aClass282_Sub35_3655.writeByte(this.aByte3656);
								this.aClass282_Sub35_3655.writeInt(0);
								this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -1775828673);
							} catch (IOException ioexception_7) {
								try {
									this.aClass202_7778.method3318(1779285831);
								} catch (Exception exception_6) {
									;
								}

								this.aClass202_7778 = null;
								++this.anInt3657;
								this.anInt3650 = -2;
							}
						}

						this.anInt3653 = 0;
						this.aLong3648 = Class169.time();
						return;
					}

					this.extras.method7936(class282_sub50_sub11_sub1_4, -1738910950);
				}
			}

			this.priorities.method7936(class282_sub50_sub11_sub1_4, -1738910950);
		}
	}

	public void method5546(boolean bool_1) {
		if (this.aClass202_7778 != null) {
			try {
				this.aClass282_Sub35_3655.index = 0 * -1990677291;
				this.aClass282_Sub35_3655.writeByte(bool_1 ? 2 : 3);
				this.aClass282_Sub35_3655.method13204(0L);
				this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -443418120);
			} catch (IOException ioexception_5) {
				try {
					this.aClass202_7778.method3318(-1183746217);
				} catch (Exception exception_4) {
					;
				}

				this.aClass202_7778 = null;
				this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
				this.anInt3650 = -1877293362 * -99092567;
			}
		}

	}

	public void method5549() {
		if (this.aClass202_7778 != null) {
			this.aClass202_7778.method3318(-547896145);
		}

	}

	public void method5548() {
		if (this.aClass202_7778 != null) {
			this.aClass202_7778.method3318(874998056);
		}

	}

	public void method5523(boolean bool_1, byte b_2) {
		if (this.aClass202_7778 != null) {
			try {
				this.aClass282_Sub35_3655.index = 0;
				this.aClass282_Sub35_3655.writeByte(bool_1 ? 2 : 3);
				this.aClass282_Sub35_3655.method13204(0L);
				this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -585768342);
			} catch (IOException ioexception_6) {
				try {
					this.aClass202_7778.method3318(1946895320);
				} catch (Exception exception_5) {
					;
				}

				this.aClass202_7778 = null;
				++this.anInt3657;
				this.anInt3650 = -2;
			}
		}

	}

	public void method5526(int i_1) {
		if (this.aClass202_7778 != null) {
			try {
				this.aClass282_Sub35_3655.index = 0;
				this.aClass282_Sub35_3655.writeByte(7);
				this.aClass282_Sub35_3655.method13204(0L);
				this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -1373474989);
			} catch (IOException ioexception_5) {
				try {
					this.aClass202_7778.method3318(-1489776443);
				} catch (Exception exception_4) {
					;
				}

				this.aClass202_7778 = null;
				++this.anInt3657;
				this.anInt3650 = -2;
			}
		}

	}

	public void method5525(int i_1) {
		if (this.aClass202_7778 != null) {
			this.aClass202_7778.method3318(-158211655);
		}

	}

	public void method5543(byte b_1) {
		if (this.aClass202_7778 != null) {
			this.aClass202_7778.method3320((byte) 30);
		}

	}

	void method5538() {
		try {
			this.aClass202_7778.method3318(-1205326281);
		} catch (Exception exception_2) {
			;
		}

		this.aClass202_7778 = null;
		this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
		this.anInt3650 = 1208836967 * -99092567;
		this.aByte3656 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
	}

	void method5539() {
		try {
			this.aClass202_7778.method3318(-503045570);
		} catch (Exception exception_2) {
			;
		}

		this.aClass202_7778 = null;
		this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
		this.anInt3650 = 1208836967 * -99092567;
		this.aByte3656 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
	}

	void method5540() {
		try {
			this.aClass202_7778.method3318(-183578609);
		} catch (Exception exception_2) {
			;
		}

		this.aClass202_7778 = null;
		this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
		this.anInt3650 = 1208836967 * -99092567;
		this.aByte3656 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
	}

	public boolean method5524() {
		int i_3;
		if (this.aClass202_7778 != null) {
			long long_1 = Class169.time();
			i_3 = (int) (long_1 - 3280542953542993467L * this.aLong3648 * 4647288634594403059L);
			this.aLong3648 = 4647288634594403059L * long_1 * 3280542953542993467L;
			if (i_3 > 200) {
				i_3 = 200;
			}

			this.anInt3653 = (this.anInt3653 * -993989301 + i_3 * -993989301) * -1846332317;
			if (this.anInt3653 * -993989301 * -1846332317 > 30000) {
				try {
					this.aClass202_7778.method3318(880201539);
				} catch (Exception exception_22) {
					;
				}

				this.aClass202_7778 = null;
			}
		}

		if (this.aClass202_7778 == null) {
			return this.priorities((short) 10397) == 0 && this.extras(-1521800227) == 0;
		} else {
			try {
				PaddedJS5Request class282_sub50_sub11_sub1_2;
				for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.priorities.method7941((byte) 4); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.priorities.method7955(-301602175)) {
					this.aClass282_Sub35_3655.index = 0 * -1990677291;
					this.aClass282_Sub35_3655.writeByte(1);
					this.aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
					this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -2053652444);
					this.waitingPriorities.method7936(class282_sub50_sub11_sub1_2, -1738910950);
				}

				for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.extras.method7941((byte) 4); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.extras.method7955(1146835721)) {
					this.aClass282_Sub35_3655.index = 0 * -1990677291;
					this.aClass282_Sub35_3655.writeByte(0);
					this.aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
					this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -1058968042);
					this.waitingExtras.method7936(class282_sub50_sub11_sub1_2, -1738910950);
				}

				for (int i_17 = 0; i_17 < 100; i_17++) {
					i_3 = this.aClass202_7778.method3312(-22142053);
					if (i_3 < 0) {
						throw new IOException();
					}

					if (i_3 == 0) {
						break;
					}

					this.anInt3653 = 0 * -1846332317;
					byte b_18 = 0;
					if (this.current == null) {
						b_18 = 10;
					} else if (-5971791 * this.current.anInt10377 * -442668975 == 0) {
						b_18 = 1;
					}

					int i_5;
					int i_6;
					int i_7;
					if (b_18 > 0) {
						i_5 = b_18 - -1990677291 * this.aClass282_Sub35_3647.index * -1115476867;
						if (i_5 > i_3) {
							i_5 = i_3;
						}

						this.aClass202_7778.read(this.aClass282_Sub35_3647.buffer, -1990677291 * this.aClass282_Sub35_3647.index * -1115476867, i_5, -1598930989);
						if (this.aByte3656 != 0) {
							for (i_6 = 0; i_6 < i_5; i_6++) {
								this.aClass282_Sub35_3647.buffer[i_6 + -1990677291 * this.aClass282_Sub35_3647.index * -1115476867] ^= this.aByte3656;
							}
						}

						this.aClass282_Sub35_3647.index = (this.aClass282_Sub35_3647.index * -1115476867 + -1115476867 * i_5) * -1990677291;
						if (this.aClass282_Sub35_3647.index * -1115476867 * -1990677291 >= b_18) {
							if (this.current == null) {
								this.aClass282_Sub35_3647.index = 0 * -1990677291;
								i_6 = this.aClass282_Sub35_3647.readUnsignedByte();
								i_7 = this.aClass282_Sub35_3647.readInt();
								int i_8 = this.aClass282_Sub35_3647.readUnsignedByte();
								int i_9 = this.aClass282_Sub35_3647.readInt();
								int i_10 = i_8 & 0x7f;
								boolean bool_11 = (i_8 & 0x80) != 0;
								long long_12 = (long) i_7 + ((long) i_6 << 32);
								Object obj_14 = null;
								PaddedJS5Request class282_sub50_sub11_sub1_15;
								if (bool_11) {
									for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingExtras.method7941((byte) 4); class282_sub50_sub11_sub1_15 != null && class282_sub50_sub11_sub1_15.key * 5418180015864004923L * -7883876913471066125L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingExtras.method7955(-261946030)) {
										;
									}
								} else {
									for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingPriorities.method7941((byte) 4); class282_sub50_sub11_sub1_15 != null && -7883876913471066125L * class282_sub50_sub11_sub1_15.key * 5418180015864004923L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingPriorities.method7955(-43331753)) {
										;
									}
								}

								if (class282_sub50_sub11_sub1_15 == null) {
									throw new IOException();
								}

								int i_16 = i_10 == 0 ? 5 : 9;
								this.current = class282_sub50_sub11_sub1_15;
								this.current.stream = new RsByteBuffer(i_16 + i_9 + this.current.padding);
								this.current.stream.writeByte(i_10);
								this.current.stream.writeInt(i_9);
								this.current.anInt10377 = -131722454 * -5971791;
								this.aClass282_Sub35_3647.index = 0 * -1990677291;
							} else {
								if (-5971791 * this.current.anInt10377 * -442668975 != 0) {
									throw new IOException();
								}

								if (this.aClass282_Sub35_3647.buffer[0] == -1) {
									this.current.anInt10377 = -442668975 * -5971791;
									this.aClass282_Sub35_3647.index = 0 * -1990677291;
								} else {
									this.current = null;
								}
							}
						}
					} else {
						i_5 = this.current.stream.buffer.length - this.current.padding;
						i_6 = 512 - this.current.anInt10377 * -442668975 * -5971791;
						if (i_6 > i_5 - -1990677291 * this.current.stream.index * -1115476867) {
							i_6 = i_5 - -1990677291 * this.current.stream.index * -1115476867;
						}

						if (i_6 > i_3) {
							i_6 = i_3;
						}

						this.aClass202_7778.read(this.current.stream.buffer, -1990677291 * this.current.stream.index * -1115476867, i_6, -2058896407);
						if (this.aByte3656 != 0) {
							for (i_7 = 0; i_7 < i_6; i_7++) {
								this.current.stream.buffer[i_7 + this.current.stream.index * -1115476867 * -1990677291] ^= this.aByte3656;
							}
						}

						this.current.stream.index = (this.current.stream.index * -1115476867 + i_6 * -1115476867) * -1990677291;
						this.current.anInt10377 = (this.current.anInt10377 * -442668975 + i_6 * -442668975) * -5971791;
						if (i_5 == -1990677291 * this.current.stream.index * -1115476867) {
							this.current.method13452();
							this.current.waiting = false;
							this.current = null;
						} else if (this.current.anInt10377 * -442668975 * -5971791 == 512) {
							this.current.anInt10377 = 0 * -5971791;
						}
					}
				}

				boolean bool_19 = true;
				return bool_19;
			} catch (IOException ioexception_23) {
				try {
					this.aClass202_7778.method3318(-496813903);
				} catch (Exception exception_21) {
					;
				}

				this.aClass202_7778 = null;
				this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
				this.anInt3650 = -1877293362 * -99092567;
				return this.priorities((short) 26686) == 0 && this.extras(-1963785262) == 0;
			}
		}
	}

	public boolean method5542() {
		int i_3;
		if (this.aClass202_7778 != null) {
			long long_1 = Class169.time();
			i_3 = (int) (long_1 - 3280542953542993467L * this.aLong3648 * 4647288634594403059L);
			this.aLong3648 = 4647288634594403059L * long_1 * 3280542953542993467L;
			if (i_3 > 200) {
				i_3 = 200;
			}

			this.anInt3653 = (this.anInt3653 * -993989301 + i_3 * -993989301) * -1846332317;
			if (this.anInt3653 * -993989301 * -1846332317 > 30000) {
				try {
					this.aClass202_7778.method3318(1168410964);
				} catch (Exception exception_22) {
					;
				}

				this.aClass202_7778 = null;
			}
		}

		if (this.aClass202_7778 == null) {
			return this.priorities((short) 2153) == 0 && this.extras(-1889405488) == 0;
		} else {
			try {
				PaddedJS5Request class282_sub50_sub11_sub1_2;
				for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.priorities.method7941((byte) 4); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.priorities.method7955(572445941)) {
					this.aClass282_Sub35_3655.index = 0 * -1990677291;
					this.aClass282_Sub35_3655.writeByte(1);
					this.aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
					this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, 1134264052);
					this.waitingPriorities.method7936(class282_sub50_sub11_sub1_2, -1738910950);
				}

				for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.extras.method7941((byte) 4); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.extras.method7955(-792632663)) {
					this.aClass282_Sub35_3655.index = 0 * -1990677291;
					this.aClass282_Sub35_3655.writeByte(0);
					this.aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
					this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -2080680995);
					this.waitingExtras.method7936(class282_sub50_sub11_sub1_2, -1738910950);
				}

				for (int i_17 = 0; i_17 < 100; i_17++) {
					i_3 = this.aClass202_7778.method3312(636572826);
					if (i_3 < 0) {
						throw new IOException();
					}

					if (i_3 == 0) {
						break;
					}

					this.anInt3653 = 0 * -1846332317;
					byte b_18 = 0;
					if (this.current == null) {
						b_18 = 10;
					} else if (-5971791 * this.current.anInt10377 * -442668975 == 0) {
						b_18 = 1;
					}

					int i_5;
					int i_6;
					int i_7;
					if (b_18 > 0) {
						i_5 = b_18 - -1990677291 * this.aClass282_Sub35_3647.index * -1115476867;
						if (i_5 > i_3) {
							i_5 = i_3;
						}

						this.aClass202_7778.read(this.aClass282_Sub35_3647.buffer, -1990677291 * this.aClass282_Sub35_3647.index * -1115476867, i_5, -717221969);
						if (this.aByte3656 != 0) {
							for (i_6 = 0; i_6 < i_5; i_6++) {
								this.aClass282_Sub35_3647.buffer[i_6 + -1990677291 * this.aClass282_Sub35_3647.index * -1115476867] ^= this.aByte3656;
							}
						}

						this.aClass282_Sub35_3647.index = (this.aClass282_Sub35_3647.index * -1115476867 + -1115476867 * i_5) * -1990677291;
						if (this.aClass282_Sub35_3647.index * -1115476867 * -1990677291 >= b_18) {
							if (this.current == null) {
								this.aClass282_Sub35_3647.index = 0 * -1990677291;
								i_6 = this.aClass282_Sub35_3647.readUnsignedByte();
								i_7 = this.aClass282_Sub35_3647.readInt();
								int i_8 = this.aClass282_Sub35_3647.readUnsignedByte();
								int i_9 = this.aClass282_Sub35_3647.readInt();
								int i_10 = i_8 & 0x7f;
								boolean bool_11 = (i_8 & 0x80) != 0;
								long long_12 = (long) i_7 + ((long) i_6 << 32);
								Object obj_14 = null;
								PaddedJS5Request class282_sub50_sub11_sub1_15;
								if (bool_11) {
									for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingExtras.method7941((byte) 4); class282_sub50_sub11_sub1_15 != null && class282_sub50_sub11_sub1_15.key * 5418180015864004923L * -7883876913471066125L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingExtras.method7955(464344065)) {
										;
									}
								} else {
									for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingPriorities.method7941((byte) 4); class282_sub50_sub11_sub1_15 != null && -7883876913471066125L * class282_sub50_sub11_sub1_15.key * 5418180015864004923L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingPriorities.method7955(-1933263300)) {
										;
									}
								}

								if (class282_sub50_sub11_sub1_15 == null) {
									throw new IOException();
								}

								int i_16 = i_10 == 0 ? 5 : 9;
								this.current = class282_sub50_sub11_sub1_15;
								this.current.stream = new RsByteBuffer(i_16 + i_9 + this.current.padding);
								this.current.stream.writeByte(i_10);
								this.current.stream.writeInt(i_9);
								this.current.anInt10377 = -131722454 * -5971791;
								this.aClass282_Sub35_3647.index = 0 * -1990677291;
							} else {
								if (-5971791 * this.current.anInt10377 * -442668975 != 0) {
									throw new IOException();
								}

								if (this.aClass282_Sub35_3647.buffer[0] == -1) {
									this.current.anInt10377 = -442668975 * -5971791;
									this.aClass282_Sub35_3647.index = 0 * -1990677291;
								} else {
									this.current = null;
								}
							}
						}
					} else {
						i_5 = this.current.stream.buffer.length - this.current.padding;
						i_6 = 512 - this.current.anInt10377 * -442668975 * -5971791;
						if (i_6 > i_5 - -1990677291 * this.current.stream.index * -1115476867) {
							i_6 = i_5 - -1990677291 * this.current.stream.index * -1115476867;
						}

						if (i_6 > i_3) {
							i_6 = i_3;
						}

						this.aClass202_7778.read(this.current.stream.buffer, -1990677291 * this.current.stream.index * -1115476867, i_6, -625709122);
						if (this.aByte3656 != 0) {
							for (i_7 = 0; i_7 < i_6; i_7++) {
								this.current.stream.buffer[i_7 + this.current.stream.index * -1115476867 * -1990677291] ^= this.aByte3656;
							}
						}

						this.current.stream.index = (this.current.stream.index * -1115476867 + i_6 * -1115476867) * -1990677291;
						this.current.anInt10377 = (this.current.anInt10377 * -442668975 + i_6 * -442668975) * -5971791;
						if (i_5 == -1990677291 * this.current.stream.index * -1115476867) {
							this.current.method13452();
							this.current.waiting = false;
							this.current = null;
						} else if (this.current.anInt10377 * -442668975 * -5971791 == 512) {
							this.current.anInt10377 = 0 * -5971791;
						}
					}
				}

				boolean bool_19 = true;
				return bool_19;
			} catch (IOException ioexception_23) {
				try {
					this.aClass202_7778.method3318(1386116466);
				} catch (Exception exception_21) {
					;
				}

				this.aClass202_7778 = null;
				this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
				this.anInt3650 = -1877293362 * -99092567;
				return this.priorities((short) 14380) == 0 && this.extras(-1857295154) == 0;
			}
		}
	}

	void method12537(byte b_1) {
		if (this.aClass202_7778 != null) {
			try {
				this.aClass282_Sub35_3655.index = 0;
				this.aClass282_Sub35_3655.writeByte(6);
				this.aClass282_Sub35_3655.write24BitInt(3, (byte) 14);
				this.aClass282_Sub35_3655.writeShort(0, 1417031095);
				this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, 810595372);
			} catch (IOException ioexception_5) {
				try {
					this.aClass202_7778.method3318(192003951);
				} catch (Exception exception_4) {
					;
				}

				this.aClass202_7778 = null;
				++this.anInt3657;
				this.anInt3650 = -2;
			}
		}

	}

	public void method5544(Object object_1, boolean bool_2) {
		if (this.aClass202_7778 != null) {
			try {
				this.aClass202_7778.method3318(-265350643);
			} catch (Exception exception_7) {
				;
			}

			this.aClass202_7778 = null;
		}

		this.aClass202_7778 = (Class202) object_1;
		this.method12537((byte) -6);
		this.method5523(bool_2, (byte) 29);
		this.aClass282_Sub35_3647.index = 0 * -1990677291;
		this.current = null;

		while (true) {
			PaddedJS5Request class282_sub50_sub11_sub1_3 = (PaddedJS5Request) this.waitingPriorities.method7937(-1288156327);
			if (class282_sub50_sub11_sub1_3 == null) {
				while (true) {
					class282_sub50_sub11_sub1_3 = (PaddedJS5Request) this.waitingExtras.method7937(-1812380478);
					if (class282_sub50_sub11_sub1_3 == null) {
						if (this.aByte3656 != 0) {
							try {
								this.aClass282_Sub35_3655.index = 0 * -1990677291;
								this.aClass282_Sub35_3655.writeByte(4);
								this.aClass282_Sub35_3655.writeByte(this.aByte3656);
								this.aClass282_Sub35_3655.writeInt(0);
								this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -1020594054);
							} catch (IOException ioexception_6) {
								try {
									this.aClass202_7778.method3318(684361654);
								} catch (Exception exception_5) {
									;
								}

								this.aClass202_7778 = null;
								this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
								this.anInt3650 = -1877293362 * -99092567;
							}
						}

						this.anInt3653 = 0 * -1846332317;
						this.aLong3648 = Class169.time() * 4647288634594403059L * 3280542953542993467L;
						return;
					}

					this.extras.method7936(class282_sub50_sub11_sub1_3, -1738910950);
				}
			}

			this.priorities.method7936(class282_sub50_sub11_sub1_3, -1738910950);
		}
	}

	public void method5545(Object object_1, boolean bool_2) {
		if (this.aClass202_7778 != null) {
			try {
				this.aClass202_7778.method3318(-439767834);
			} catch (Exception exception_7) {
				;
			}

			this.aClass202_7778 = null;
		}

		this.aClass202_7778 = (Class202) object_1;
		this.method12537((byte) 23);
		this.method5523(bool_2, (byte) 95);
		this.aClass282_Sub35_3647.index = 0 * -1990677291;
		this.current = null;

		while (true) {
			PaddedJS5Request class282_sub50_sub11_sub1_3 = (PaddedJS5Request) this.waitingPriorities.method7937(994952178);
			if (class282_sub50_sub11_sub1_3 == null) {
				while (true) {
					class282_sub50_sub11_sub1_3 = (PaddedJS5Request) this.waitingExtras.method7937(1990433330);
					if (class282_sub50_sub11_sub1_3 == null) {
						if (this.aByte3656 != 0) {
							try {
								this.aClass282_Sub35_3655.index = 0 * -1990677291;
								this.aClass282_Sub35_3655.writeByte(4);
								this.aClass282_Sub35_3655.writeByte(this.aByte3656);
								this.aClass282_Sub35_3655.writeInt(0);
								this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, 1101181210);
							} catch (IOException ioexception_6) {
								try {
									this.aClass202_7778.method3318(1984653342);
								} catch (Exception exception_5) {
									;
								}

								this.aClass202_7778 = null;
								this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
								this.anInt3650 = -1877293362 * -99092567;
							}
						}

						this.anInt3653 = 0 * -1846332317;
						this.aLong3648 = Class169.time() * 4647288634594403059L * 3280542953542993467L;
						return;
					}

					this.extras.method7936(class282_sub50_sub11_sub1_3, -1738910950);
				}
			}

			this.priorities.method7936(class282_sub50_sub11_sub1_3, -1738910950);
		}
	}

	public boolean method5521(byte b_1) {
		int i_4;
		if (this.aClass202_7778 != null) {
			long long_2 = Class169.time();
			i_4 = (int) (long_2 - this.aLong3648);
			this.aLong3648 = long_2;
			if (i_4 > 200) {
				i_4 = 200;
			}

			this.anInt3653 += i_4;
			if (this.anInt3653 > 30000) {
				try {
					this.aClass202_7778.method3318(1707585597);
				} catch (Exception exception_23) {
					;
				}

				this.aClass202_7778 = null;
			}
		}

		if (this.aClass202_7778 == null) {
			return this.priorities((short) 28870) == 0 && this.extras(-1745805197) == 0;
		} else {
			try {
				PaddedJS5Request class282_sub50_sub11_sub1_3;
				for (class282_sub50_sub11_sub1_3 = (PaddedJS5Request) this.priorities.method7941((byte) 4); class282_sub50_sub11_sub1_3 != null; class282_sub50_sub11_sub1_3 = (PaddedJS5Request) this.priorities.method7955(-302687935)) {
					this.aClass282_Sub35_3655.index = 0;
					this.aClass282_Sub35_3655.writeByte(1);
					this.aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1_3.key);
					this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -1323919760);
					this.waitingPriorities.method7936(class282_sub50_sub11_sub1_3, -1738910950);
				}

				for (class282_sub50_sub11_sub1_3 = (PaddedJS5Request) this.extras.method7941((byte) 4); class282_sub50_sub11_sub1_3 != null; class282_sub50_sub11_sub1_3 = (PaddedJS5Request) this.extras.method7955(-1021577303)) {
					this.aClass282_Sub35_3655.index = 0;
					this.aClass282_Sub35_3655.writeByte(0);
					this.aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1_3.key);
					this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, 5845484);
					this.waitingExtras.method7936(class282_sub50_sub11_sub1_3, -1738910950);
				}

				for (int i_18 = 0; i_18 < 100; i_18++) {
					i_4 = this.aClass202_7778.method3312(1392283982);
					if (i_4 < 0) {
						throw new IOException();
					}

					if (i_4 == 0) {
						break;
					}

					this.anInt3653 = 0;
					byte b_19 = 0;
					if (this.current == null) {
						b_19 = 10;
					} else if (this.current.anInt10377 == 0) {
						b_19 = 1;
					}

					int i_6;
					int i_7;
					int i_8;
					if (b_19 > 0) {
						i_6 = b_19 - this.aClass282_Sub35_3647.index;
						if (i_6 > i_4) {
							i_6 = i_4;
						}

						this.aClass202_7778.read(this.aClass282_Sub35_3647.buffer, this.aClass282_Sub35_3647.index, i_6, -1570276139);
						if (this.aByte3656 != 0) {
							for (i_7 = 0; i_7 < i_6; i_7++) {
								this.aClass282_Sub35_3647.buffer[i_7 + this.aClass282_Sub35_3647.index] ^= this.aByte3656;
							}
						}

						this.aClass282_Sub35_3647.index += i_6;
						if (this.aClass282_Sub35_3647.index >= b_19) {
							if (this.current == null) {
								this.aClass282_Sub35_3647.index = 0;
								i_7 = this.aClass282_Sub35_3647.readUnsignedByte();
								i_8 = this.aClass282_Sub35_3647.readInt();
								int i_9 = this.aClass282_Sub35_3647.readUnsignedByte();
								int i_10 = this.aClass282_Sub35_3647.readInt();
								int i_11 = i_9 & 0x7f;
								boolean bool_12 = (i_9 & 0x80) != 0;
								long long_13 = (long) i_8 + ((long) i_7 << 32);
								Object obj_15 = null;
								PaddedJS5Request class282_sub50_sub11_sub1_16;
								if (bool_12) {
									for (class282_sub50_sub11_sub1_16 = (PaddedJS5Request) this.waitingExtras.method7941((byte) 4); class282_sub50_sub11_sub1_16 != null && class282_sub50_sub11_sub1_16.key != long_13; class282_sub50_sub11_sub1_16 = (PaddedJS5Request) this.waitingExtras.method7955(-257563362)) {
										;
									}
								} else {
									for (class282_sub50_sub11_sub1_16 = (PaddedJS5Request) this.waitingPriorities.method7941((byte) 4); class282_sub50_sub11_sub1_16 != null && class282_sub50_sub11_sub1_16.key != long_13; class282_sub50_sub11_sub1_16 = (PaddedJS5Request) this.waitingPriorities.method7955(-691952599)) {
										;
									}
								}

								if (class282_sub50_sub11_sub1_16 == null) {
									throw new IOException();
								}

								int i_17 = i_11 == 0 ? 5 : 9;
								this.current = class282_sub50_sub11_sub1_16;
								this.current.stream = new RsByteBuffer(this.current.padding + i_17 + i_10);
								this.current.stream.writeByte(i_11);
								this.current.stream.writeInt(i_10);
								this.current.anInt10377 = 10;
								this.aClass282_Sub35_3647.index = 0;
							} else {
								if (this.current.anInt10377 != 0) {
									throw new IOException();
								}

								if (this.aClass282_Sub35_3647.buffer[0] == -1) {
									this.current.anInt10377 = 1;
									this.aClass282_Sub35_3647.index = 0;
								} else {
									this.current = null;
								}
							}
						}
					} else {
						i_6 = this.current.stream.buffer.length - this.current.padding;
						i_7 = 512 - this.current.anInt10377;
						if (i_7 > i_6 - this.current.stream.index) {
							i_7 = i_6 - this.current.stream.index;
						}

						if (i_7 > i_4) {
							i_7 = i_4;
						}

						this.aClass202_7778.read(this.current.stream.buffer, this.current.stream.index, i_7, -1556112403);
						if (this.aByte3656 != 0) {
							for (i_8 = 0; i_8 < i_7; i_8++) {
								this.current.stream.buffer[i_8 + this.current.stream.index] ^= this.aByte3656;
							}
						}

						this.current.stream.index += i_7;
						this.current.anInt10377 += i_7;
						if (this.current.stream.index == i_6) {
							this.current.method13452();
							this.current.waiting = false;
							this.current = null;
						} else if (this.current.anInt10377 == 512) {
							this.current.anInt10377 = 0;
						}
					}
				}

				boolean bool_20 = true;
				return bool_20;
			} catch (IOException ioexception_24) {
				try {
					this.aClass202_7778.method3318(483191103);
				} catch (Exception exception_22) {
					;
				}

				this.aClass202_7778 = null;
				++this.anInt3657;
				this.anInt3650 = -2;
				return this.priorities((short) 24461) == 0 && this.extras(-2070253366) == 0;
			}
		}
	}

	public void method5547() {
		if (this.aClass202_7778 != null) {
			this.aClass202_7778.method3318(677093148);
		}

	}

	public boolean method5557() {
		int i_3;
		if (this.aClass202_7778 != null) {
			long long_1 = Class169.time();
			i_3 = (int) (long_1 - 3280542953542993467L * this.aLong3648 * 4647288634594403059L);
			this.aLong3648 = 4647288634594403059L * long_1 * 3280542953542993467L;
			if (i_3 > 200) {
				i_3 = 200;
			}

			this.anInt3653 = (this.anInt3653 * -993989301 + i_3 * -993989301) * -1846332317;
			if (this.anInt3653 * -993989301 * -1846332317 > 30000) {
				try {
					this.aClass202_7778.method3318(-949990042);
				} catch (Exception exception_22) {
					;
				}

				this.aClass202_7778 = null;
			}
		}

		if (this.aClass202_7778 == null) {
			return this.priorities((short) 2501) == 0 && this.extras(-1598449109) == 0;
		} else {
			try {
				PaddedJS5Request class282_sub50_sub11_sub1_2;
				for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.priorities.method7941((byte) 4); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.priorities.method7955(-1980128000)) {
					this.aClass282_Sub35_3655.index = 0 * -1990677291;
					this.aClass282_Sub35_3655.writeByte(1);
					this.aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
					this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -943163618);
					this.waitingPriorities.method7936(class282_sub50_sub11_sub1_2, -1738910950);
				}

				for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.extras.method7941((byte) 4); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) this.extras.method7955(-676569028)) {
					this.aClass282_Sub35_3655.index = 0 * -1990677291;
					this.aClass282_Sub35_3655.writeByte(0);
					this.aClass282_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
					this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -477727140);
					this.waitingExtras.method7936(class282_sub50_sub11_sub1_2, -1738910950);
				}

				for (int i_17 = 0; i_17 < 100; i_17++) {
					i_3 = this.aClass202_7778.method3312(2083656307);
					if (i_3 < 0) {
						throw new IOException();
					}

					if (i_3 == 0) {
						break;
					}

					this.anInt3653 = 0 * -1846332317;
					byte b_18 = 0;
					if (this.current == null) {
						b_18 = 10;
					} else if (-5971791 * this.current.anInt10377 * -442668975 == 0) {
						b_18 = 1;
					}

					int i_5;
					int i_6;
					int i_7;
					if (b_18 > 0) {
						i_5 = b_18 - -1990677291 * this.aClass282_Sub35_3647.index * -1115476867;
						if (i_5 > i_3) {
							i_5 = i_3;
						}

						this.aClass202_7778.read(this.aClass282_Sub35_3647.buffer, -1990677291 * this.aClass282_Sub35_3647.index * -1115476867, i_5, -914075102);
						if (this.aByte3656 != 0) {
							for (i_6 = 0; i_6 < i_5; i_6++) {
								this.aClass282_Sub35_3647.buffer[i_6 + -1990677291 * this.aClass282_Sub35_3647.index * -1115476867] ^= this.aByte3656;
							}
						}

						this.aClass282_Sub35_3647.index = (this.aClass282_Sub35_3647.index * -1115476867 + -1115476867 * i_5) * -1990677291;
						if (this.aClass282_Sub35_3647.index * -1115476867 * -1990677291 >= b_18) {
							if (this.current == null) {
								this.aClass282_Sub35_3647.index = 0 * -1990677291;
								i_6 = this.aClass282_Sub35_3647.readUnsignedByte();
								i_7 = this.aClass282_Sub35_3647.readInt();
								int i_8 = this.aClass282_Sub35_3647.readUnsignedByte();
								int i_9 = this.aClass282_Sub35_3647.readInt();
								int i_10 = i_8 & 0x7f;
								boolean bool_11 = (i_8 & 0x80) != 0;
								long long_12 = (long) i_7 + ((long) i_6 << 32);
								Object obj_14 = null;
								PaddedJS5Request class282_sub50_sub11_sub1_15;
								if (bool_11) {
									for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingExtras.method7941((byte) 4); class282_sub50_sub11_sub1_15 != null && class282_sub50_sub11_sub1_15.key * 5418180015864004923L * -7883876913471066125L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingExtras.method7955(-693904973)) {
										;
									}
								} else {
									for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingPriorities.method7941((byte) 4); class282_sub50_sub11_sub1_15 != null && -7883876913471066125L * class282_sub50_sub11_sub1_15.key * 5418180015864004923L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) this.waitingPriorities.method7955(-1904114468)) {
										;
									}
								}

								if (class282_sub50_sub11_sub1_15 == null) {
									throw new IOException();
								}

								int i_16 = i_10 == 0 ? 5 : 9;
								this.current = class282_sub50_sub11_sub1_15;
								this.current.stream = new RsByteBuffer(i_16 + i_9 + this.current.padding);
								this.current.stream.writeByte(i_10);
								this.current.stream.writeInt(i_9);
								this.current.anInt10377 = -131722454 * -5971791;
								this.aClass282_Sub35_3647.index = 0 * -1990677291;
							} else {
								if (-5971791 * this.current.anInt10377 * -442668975 != 0) {
									throw new IOException();
								}

								if (this.aClass282_Sub35_3647.buffer[0] == -1) {
									this.current.anInt10377 = -442668975 * -5971791;
									this.aClass282_Sub35_3647.index = 0 * -1990677291;
								} else {
									this.current = null;
								}
							}
						}
					} else {
						i_5 = this.current.stream.buffer.length - this.current.padding;
						i_6 = 512 - this.current.anInt10377 * -442668975 * -5971791;
						if (i_6 > i_5 - -1990677291 * this.current.stream.index * -1115476867) {
							i_6 = i_5 - -1990677291 * this.current.stream.index * -1115476867;
						}

						if (i_6 > i_3) {
							i_6 = i_3;
						}

						this.aClass202_7778.read(this.current.stream.buffer, -1990677291 * this.current.stream.index * -1115476867, i_6, -777445999);
						if (this.aByte3656 != 0) {
							for (i_7 = 0; i_7 < i_6; i_7++) {
								this.current.stream.buffer[i_7 + this.current.stream.index * -1115476867 * -1990677291] ^= this.aByte3656;
							}
						}

						this.current.stream.index = (this.current.stream.index * -1115476867 + i_6 * -1115476867) * -1990677291;
						this.current.anInt10377 = (this.current.anInt10377 * -442668975 + i_6 * -442668975) * -5971791;
						if (i_5 == -1990677291 * this.current.stream.index * -1115476867) {
							this.current.method13452();
							this.current.waiting = false;
							this.current = null;
						} else if (this.current.anInt10377 * -442668975 * -5971791 == 512) {
							this.current.anInt10377 = 0 * -5971791;
						}
					}
				}

				boolean bool_19 = true;
				return bool_19;
			} catch (IOException ioexception_23) {
				try {
					this.aClass202_7778.method3318(859849832);
				} catch (Exception exception_21) {
					;
				}

				this.aClass202_7778 = null;
				this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
				this.anInt3650 = -1877293362 * -99092567;
				return this.priorities((short) 26378) == 0 && this.extras(-1720565234) == 0;
			}
		}
	}

	public void method5550() {
		if (this.aClass202_7778 != null) {
			try {
				this.aClass282_Sub35_3655.index = 0 * -1990677291;
				this.aClass282_Sub35_3655.writeByte(7);
				this.aClass282_Sub35_3655.method13204(0L);
				this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -533636623);
			} catch (IOException ioexception_4) {
				try {
					this.aClass202_7778.method3318(2071907403);
				} catch (Exception exception_3) {
					;
				}

				this.aClass202_7778 = null;
				this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
				this.anInt3650 = -1877293362 * -99092567;
			}
		}

	}

	public void method5554() {
		if (this.aClass202_7778 != null) {
			this.aClass202_7778.method3318(167485151);
		}

	}

	public void method5537() {
		if (this.aClass202_7778 != null) {
			this.aClass202_7778.method3320((byte) 76);
		}

	}

	public void method5532() {
		if (this.aClass202_7778 != null) {
			try {
				this.aClass282_Sub35_3655.index = 0 * -1990677291;
				this.aClass282_Sub35_3655.writeByte(7);
				this.aClass282_Sub35_3655.method13204(0L);
				this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -199994614);
			} catch (IOException ioexception_4) {
				try {
					this.aClass202_7778.method3318(-800915699);
				} catch (Exception exception_3) {
					;
				}

				this.aClass202_7778 = null;
				this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
				this.anInt3650 = -1877293362 * -99092567;
			}
		}

	}

	public void method5552() {
		if (this.aClass202_7778 != null) {
			try {
				this.aClass282_Sub35_3655.index = 0 * -1990677291;
				this.aClass282_Sub35_3655.writeByte(7);
				this.aClass282_Sub35_3655.method13204(0L);
				this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, 391543029);
			} catch (IOException ioexception_4) {
				try {
					this.aClass202_7778.method3318(855871609);
				} catch (Exception exception_3) {
					;
				}

				this.aClass202_7778 = null;
				this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
				this.anInt3650 = -1877293362 * -99092567;
			}
		}

	}

	public void method5530() {
		if (this.aClass202_7778 != null) {
			try {
				this.aClass282_Sub35_3655.index = 0 * -1990677291;
				this.aClass282_Sub35_3655.writeByte(7);
				this.aClass282_Sub35_3655.method13204(0L);
				this.aClass202_7778.write(this.aClass282_Sub35_3655.buffer, 0, this.aClass282_Sub35_3655.buffer.length, -2081026700);
			} catch (IOException ioexception_4) {
				try {
					this.aClass202_7778.method3318(198330451);
				} catch (Exception exception_3) {
					;
				}

				this.aClass202_7778 = null;
				this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
				this.anInt3650 = -1877293362 * -99092567;
			}
		}

	}

	public void method5514() {
		if (this.aClass202_7778 != null) {
			this.aClass202_7778.method3320((byte) 105);
		}

	}

	void method5520(byte b_1) {
		try {
			this.aClass202_7778.method3318(1038372369);
		} catch (Exception exception_3) {
			;
		}

		this.aClass202_7778 = null;
		this.anInt3657 = (this.anInt3657 * 1211706083 + 1211706083) * 1287875275;
		this.anInt3650 = 1208836967 * -99092567;
		this.aByte3656 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
	}

	public void method5527() {
		if (this.aClass202_7778 != null) {
			this.aClass202_7778.method3320((byte) 73);
		}

	}

	public void method5528() {
		if (this.aClass202_7778 != null) {
			this.aClass202_7778.method3320((byte) 13);
		}

	}

	public static Class282_Sub36 method12538(byte b_0) {
		if (Class291_Sub1.aClass482_3459 != null && Class291_Sub1.aClass460_8030 != null) {
			Class291_Sub1.aClass460_8030.method7684(Class291_Sub1.aClass482_3459, (byte) 74);
			Class282_Sub36 class282_sub36_1 = (Class282_Sub36) Class291_Sub1.aClass460_8030.method7683(1601520946);
			if (class282_sub36_1 == null) {
				return null;
			} else {
				WorldMapAreaDefs worldmapareadefs_2 = Class291_Sub1.aClass218_3456.getWorldMapDefs(class282_sub36_1.anInt7991, 1419676338);
				return worldmapareadefs_2 != null && worldmapareadefs_2.aBool2742 && worldmapareadefs_2.method3719(Class291_Sub1.anInterface42_3458, -305455176) ? class282_sub36_1 : Class540.method11595(1263609035);
			}
		} else {
			return null;
		}
	}

}
