package com.jagex;

import java.io.IOException;

public class JS5StandardRequester_Sub1 extends JS5StandardRequester {

	public static Node_Sub36 method12538() {
		if ((Class291.aClass482_3459 == null) || (Class291_Sub1.aClass460_8030 == null))
			return null;
		Class291_Sub1.aClass460_8030.method7684(Class291.aClass482_3459);
		Node_Sub36 class282_sub36_1 = (Node_Sub36) Class291_Sub1.aClass460_8030.method7683();
		if (class282_sub36_1 == null)
			return null;
		else {
			MapAreaDefinitions worldmapareadefs_2 = Class291.MAP_AREA_LOADER.getWorldMapDefs(class282_sub36_1.anInt7991);
			return worldmapareadefs_2 != null && worldmapareadefs_2.aBool2742 && worldmapareadefs_2.shouldDraw(Class291.PLAYER_VAR_PROVIDER) ? class282_sub36_1 : Class540.method11595();
		}
	}

	Connection aClass202_7778;

	@Override
	public void init(Connection object_1, boolean bool_2) {
		if (aClass202_7778 != null) {
			try {
				aClass202_7778.end();
			} catch (Exception ignored) {
			}

			aClass202_7778 = null;
		}

		aClass202_7778 = object_1;
		method12537();
		method5523(bool_2);
		aNode_Sub35_3647.index = 0;
		current = null;

		while (true) {
			PaddedJS5Request class282_sub50_sub11_sub1_4 = (PaddedJS5Request) waitingPriorities.method7937();
			if (class282_sub50_sub11_sub1_4 == null)
				while (true) {
					class282_sub50_sub11_sub1_4 = (PaddedJS5Request) waitingExtras.method7937();
					if (class282_sub50_sub11_sub1_4 == null) {
						if (aByte3656 != 0)
							try {
								aNode_Sub35_3655.index = 0;
								aNode_Sub35_3655.writeByte(4);
								aNode_Sub35_3655.writeByte(aByte3656);
								aNode_Sub35_3655.writeInt(0);
								aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
							} catch (IOException ioexception_7) {
								try {
									aClass202_7778.end();
								} catch (Exception ignored) {
								}

								aClass202_7778 = null;
								++anInt3657;
								anInt3650 = -2;
							}

						anInt3653 = 0;
						aLong3648 = Utils.time();
						return;
					}

					extras.add(class282_sub50_sub11_sub1_4);
				}

			priorities.add(class282_sub50_sub11_sub1_4);
		}
	}

	void method12537() {
		if (aClass202_7778 != null)
			try {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(6);
				aNode_Sub35_3655.write24BitInt(3);
				aNode_Sub35_3655.writeShort(0);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
			} catch (IOException ioexception_5) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
				++anInt3657;
				anInt3650 = -2;
			}

	}

	@Override
	public void method5514() {
		if (aClass202_7778 != null)
			aClass202_7778.method3320();

	}

	@Override
	void method5520() {
		try {
			aClass202_7778.end();
		} catch (Exception ignored) {
		}

		aClass202_7778 = null;
		anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
		anInt3650 = 1208836967 * -99092567;
		aByte3656 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
	}

	@Override
	public boolean method5521() {
		int i_4;
		if (aClass202_7778 != null) {
			long long_2 = Utils.time();
			i_4 = (int) (long_2 - aLong3648);
			aLong3648 = long_2;
			if (i_4 > 200)
				i_4 = 200;

			anInt3653 += i_4;
			if (anInt3653 > 30000) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
			}
		}

		if (aClass202_7778 == null)
			return priorities() == 0 && extras() == 0;
		try {
			PaddedJS5Request class282_sub50_sub11_sub1_3;
			for (class282_sub50_sub11_sub1_3 = (PaddedJS5Request) priorities.method7941(); class282_sub50_sub11_sub1_3 != null; class282_sub50_sub11_sub1_3 = (PaddedJS5Request) priorities.method7955()) {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(1);
				aNode_Sub35_3655.method13204(class282_sub50_sub11_sub1_3.key);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
				waitingPriorities.add(class282_sub50_sub11_sub1_3);
			}

			for (class282_sub50_sub11_sub1_3 = (PaddedJS5Request) extras.method7941(); class282_sub50_sub11_sub1_3 != null; class282_sub50_sub11_sub1_3 = (PaddedJS5Request) extras.method7955()) {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(0);
				aNode_Sub35_3655.method13204(class282_sub50_sub11_sub1_3.key);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
				waitingExtras.add(class282_sub50_sub11_sub1_3);
			}

			for (int i_18 = 0; i_18 < 100; i_18++) {
				i_4 = aClass202_7778.method3312();
				if (i_4 < 0)
					throw new IOException();

				if (i_4 == 0)
					break;

				anInt3653 = 0;
				byte b_19 = 0;
				if (current == null)
					b_19 = 10;
				else if (current.anInt10377 == 0)
					b_19 = 1;

				int i_6;
				int i_7;
				int i_8;
				if (b_19 > 0) {
					i_6 = b_19 - aNode_Sub35_3647.index;
					if (i_6 > i_4)
						i_6 = i_4;

					aClass202_7778.read(aNode_Sub35_3647.buffer, aNode_Sub35_3647.index, i_6);
					if (aByte3656 != 0)
						for (i_7 = 0; i_7 < i_6; i_7++)
							aNode_Sub35_3647.buffer[i_7 + aNode_Sub35_3647.index] ^= aByte3656;

					aNode_Sub35_3647.index += i_6;
					if (aNode_Sub35_3647.index >= b_19)
						if (current == null) {
							aNode_Sub35_3647.index = 0;
							i_7 = aNode_Sub35_3647.readUnsignedByte();
							i_8 = aNode_Sub35_3647.readInt();
							int i_9 = aNode_Sub35_3647.readUnsignedByte();
							int i_10 = aNode_Sub35_3647.readInt();
							int i_11 = i_9 & 0x7f;
							boolean bool_12 = (i_9 & 0x80) != 0;
							long long_13 = i_8 + ((long) i_7 << 32);
							Object obj_15 = null;
							PaddedJS5Request class282_sub50_sub11_sub1_16;
							if (bool_12)
								for (class282_sub50_sub11_sub1_16 = (PaddedJS5Request) waitingExtras.method7941(); class282_sub50_sub11_sub1_16 != null && class282_sub50_sub11_sub1_16.key != long_13; class282_sub50_sub11_sub1_16 = (PaddedJS5Request) waitingExtras.method7955()) {
								}
							else
								for (class282_sub50_sub11_sub1_16 = (PaddedJS5Request) waitingPriorities.method7941(); class282_sub50_sub11_sub1_16 != null && class282_sub50_sub11_sub1_16.key != long_13; class282_sub50_sub11_sub1_16 = (PaddedJS5Request) waitingPriorities.method7955()) {
								}

							if (class282_sub50_sub11_sub1_16 == null)
								throw new IOException();

							int i_17 = i_11 == 0 ? 5 : 9;
							current = class282_sub50_sub11_sub1_16;
							current.stream = new ByteBuf(current.padding + i_17 + i_10);
							current.stream.writeByte(i_11);
							current.stream.writeInt(i_10);
							current.anInt10377 = 10;
							aNode_Sub35_3647.index = 0;
						} else {
							if (current.anInt10377 != 0)
								throw new IOException();

							if (aNode_Sub35_3647.buffer[0] == -1) {
								current.anInt10377 = 1;
								aNode_Sub35_3647.index = 0;
							} else
								current = null;
						}
				} else {
					i_6 = current.stream.buffer.length - current.padding;
					i_7 = 512 - current.anInt10377;
					if (i_7 > i_6 - current.stream.index)
						i_7 = i_6 - current.stream.index;

					if (i_7 > i_4)
						i_7 = i_4;

					aClass202_7778.read(current.stream.buffer, current.stream.index, i_7);
					if (aByte3656 != 0)
						for (i_8 = 0; i_8 < i_7; i_8++)
							current.stream.buffer[i_8 + current.stream.index] ^= aByte3656;

					current.stream.index += i_7;
					current.anInt10377 += i_7;
					if (current.stream.index == i_6) {
						current.method13452();
						current.waiting = false;
						current = null;
					} else if (current.anInt10377 == 512)
						current.anInt10377 = 0;
				}
			}

			boolean bool_20 = true;
			return bool_20;
		} catch (IOException ioexception_24) {
			try {
				aClass202_7778.end();
			} catch (Exception ignored) {
			}

			aClass202_7778 = null;
			++anInt3657;
			anInt3650 = -2;
			return priorities() == 0 && extras() == 0;
		}
	}

	@Override
	public void method5523(boolean bool_1) {
		if (aClass202_7778 != null)
			try {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(bool_1 ? 2 : 3);
				aNode_Sub35_3655.method13204(0L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
			} catch (IOException ioexception_6) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
				++anInt3657;
				anInt3650 = -2;
			}

	}

	@Override
	public boolean method5524() {
		int i_3;
		if (aClass202_7778 != null) {
			long long_1 = Utils.time();
			i_3 = (int) (long_1 - 3280542953542993467L * aLong3648 * 4647288634594403059L);
			aLong3648 = 4647288634594403059L * long_1 * 3280542953542993467L;
			if (i_3 > 200)
				i_3 = 200;

			anInt3653 = (anInt3653 * -993989301 + i_3 * -993989301) * -1846332317;
			if (anInt3653 * -993989301 * -1846332317 > 30000) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
			}
		}

		if (aClass202_7778 == null)
			return priorities() == 0 && extras() == 0;
		try {
			PaddedJS5Request class282_sub50_sub11_sub1_2;
			for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) priorities.method7941(); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) priorities.method7955()) {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(1);
				aNode_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
				waitingPriorities.add(class282_sub50_sub11_sub1_2);
			}

			for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) extras.method7941(); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) extras.method7955()) {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(0);
				aNode_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
				waitingExtras.add(class282_sub50_sub11_sub1_2);
			}

			for (int i_17 = 0; i_17 < 100; i_17++) {
				i_3 = aClass202_7778.method3312();
				if (i_3 < 0)
					throw new IOException();

				if (i_3 == 0)
					break;

				anInt3653 = 0;
				byte b_18 = 0;
				if (current == null)
					b_18 = 10;
				else if (-5971791 * current.anInt10377 * -442668975 == 0)
					b_18 = 1;

				int i_5;
				int i_6;
				int i_7;
				if (b_18 > 0) {
					i_5 = b_18 - -1990677291 * aNode_Sub35_3647.index * -1115476867;
					if (i_5 > i_3)
						i_5 = i_3;

					aClass202_7778.read(aNode_Sub35_3647.buffer, -1990677291 * aNode_Sub35_3647.index * -1115476867, i_5);
					if (aByte3656 != 0)
						for (i_6 = 0; i_6 < i_5; i_6++)
							aNode_Sub35_3647.buffer[i_6 + -1990677291 * aNode_Sub35_3647.index * -1115476867] ^= aByte3656;

					aNode_Sub35_3647.index = (aNode_Sub35_3647.index * -1115476867 + -1115476867 * i_5) * -1990677291;
					if (aNode_Sub35_3647.index * -1115476867 * -1990677291 >= b_18)
						if (current == null) {
							aNode_Sub35_3647.index = 0;
							i_6 = aNode_Sub35_3647.readUnsignedByte();
							i_7 = aNode_Sub35_3647.readInt();
							int i_8 = aNode_Sub35_3647.readUnsignedByte();
							int i_9 = aNode_Sub35_3647.readInt();
							int i_10 = i_8 & 0x7f;
							boolean bool_11 = (i_8 & 0x80) != 0;
							long long_12 = i_7 + ((long) i_6 << 32);
							Object obj_14 = null;
							PaddedJS5Request class282_sub50_sub11_sub1_15;
							if (bool_11)
								for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingExtras.method7941(); class282_sub50_sub11_sub1_15 != null && class282_sub50_sub11_sub1_15.key * 5418180015864004923L * -7883876913471066125L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingExtras.method7955()) {
								}
							else
								for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingPriorities.method7941(); class282_sub50_sub11_sub1_15 != null && -7883876913471066125L * class282_sub50_sub11_sub1_15.key * 5418180015864004923L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingPriorities.method7955()) {
								}

							if (class282_sub50_sub11_sub1_15 == null)
								throw new IOException();

							int i_16 = i_10 == 0 ? 5 : 9;
							current = class282_sub50_sub11_sub1_15;
							current.stream = new ByteBuf(i_16 + i_9 + current.padding);
							current.stream.writeByte(i_10);
							current.stream.writeInt(i_9);
							current.anInt10377 = -131722454 * -5971791;
							aNode_Sub35_3647.index = 0;
						} else {
							if (-5971791 * current.anInt10377 * -442668975 != 0)
								throw new IOException();

							if (aNode_Sub35_3647.buffer[0] == -1) {
								current.anInt10377 = -442668975 * -5971791;
								aNode_Sub35_3647.index = 0;
							} else
								current = null;
						}
				} else {
					i_5 = current.stream.buffer.length - current.padding;
					i_6 = 512 - current.anInt10377 * -442668975 * -5971791;
					if (i_6 > i_5 - -1990677291 * current.stream.index * -1115476867)
						i_6 = i_5 - -1990677291 * current.stream.index * -1115476867;

					if (i_6 > i_3)
						i_6 = i_3;

					aClass202_7778.read(current.stream.buffer, -1990677291 * current.stream.index * -1115476867, i_6);
					if (aByte3656 != 0)
						for (i_7 = 0; i_7 < i_6; i_7++)
							current.stream.buffer[i_7 + current.stream.index * -1115476867 * -1990677291] ^= aByte3656;

					current.stream.index = (current.stream.index * -1115476867 + i_6 * -1115476867) * -1990677291;
					current.anInt10377 = (current.anInt10377 * -442668975 + i_6 * -442668975) * -5971791;
					if (i_5 == -1990677291 * current.stream.index * -1115476867) {
						current.method13452();
						current.waiting = false;
						current = null;
					} else if (current.anInt10377 * -442668975 * -5971791 == 512)
						current.anInt10377 = 0;
				}
			}

			boolean bool_19 = true;
			return bool_19;
		} catch (IOException ioexception_23) {
			try {
				aClass202_7778.end();
			} catch (Exception ignored) {
			}

			aClass202_7778 = null;
			anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
			anInt3650 = -1877293362 * -99092567;
			return priorities() == 0 && extras() == 0;
		}
	}

	@Override
	public void method5525() {
		if (aClass202_7778 != null)
			aClass202_7778.end();

	}

	@Override
	public void method5526() {
		if (aClass202_7778 != null)
			try {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(7);
				aNode_Sub35_3655.method13204(0L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
			} catch (IOException ioexception_5) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
				++anInt3657;
				anInt3650 = -2;
			}

	}

	@Override
	public void method5527() {
		if (aClass202_7778 != null)
			aClass202_7778.method3320();

	}

	@Override
	public void method5528() {
		if (aClass202_7778 != null)
			aClass202_7778.method3320();

	}

	@Override
	public void method5530() {
		if (aClass202_7778 != null)
			try {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(7);
				aNode_Sub35_3655.method13204(0L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
			} catch (IOException ioexception_4) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
				anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
				anInt3650 = -1877293362 * -99092567;
			}

	}

	@Override
	public void method5532() {
		if (aClass202_7778 != null)
			try {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(7);
				aNode_Sub35_3655.method13204(0L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
			} catch (IOException ioexception_4) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
				anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
				anInt3650 = -1877293362 * -99092567;
			}

	}

	@Override
	public void method5537() {
		if (aClass202_7778 != null)
			aClass202_7778.method3320();

	}

	@Override
	void method5538() {
		try {
			aClass202_7778.end();
		} catch (Exception ignored) {
		}

		aClass202_7778 = null;
		anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
		anInt3650 = 1208836967 * -99092567;
		aByte3656 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
	}

	@Override
	void method5539() {
		try {
			aClass202_7778.end();
		} catch (Exception ignored) {
		}

		aClass202_7778 = null;
		anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
		anInt3650 = 1208836967 * -99092567;
		aByte3656 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
	}

	@Override
	void method5540() {
		try {
			aClass202_7778.end();
		} catch (Exception ignored) {
		}

		aClass202_7778 = null;
		anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
		anInt3650 = 1208836967 * -99092567;
		aByte3656 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
	}

	@Override
	public boolean method5542() {
		int i_3;
		if (aClass202_7778 != null) {
			long long_1 = Utils.time();
			i_3 = (int) (long_1 - 3280542953542993467L * aLong3648 * 4647288634594403059L);
			aLong3648 = 4647288634594403059L * long_1 * 3280542953542993467L;
			if (i_3 > 200)
				i_3 = 200;

			anInt3653 = (anInt3653 * -993989301 + i_3 * -993989301) * -1846332317;
			if (anInt3653 * -993989301 * -1846332317 > 30000) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
			}
		}

		if (aClass202_7778 == null)
			return priorities() == 0 && extras() == 0;
		try {
			PaddedJS5Request class282_sub50_sub11_sub1_2;
			for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) priorities.method7941(); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) priorities.method7955()) {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(1);
				aNode_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
				waitingPriorities.add(class282_sub50_sub11_sub1_2);
			}

			for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) extras.method7941(); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) extras.method7955()) {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(0);
				aNode_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
				waitingExtras.add(class282_sub50_sub11_sub1_2);
			}

			for (int i_17 = 0; i_17 < 100; i_17++) {
				i_3 = aClass202_7778.method3312();
				if (i_3 < 0)
					throw new IOException();

				if (i_3 == 0)
					break;

				anInt3653 = 0;
				byte b_18 = 0;
				if (current == null)
					b_18 = 10;
				else if (-5971791 * current.anInt10377 * -442668975 == 0)
					b_18 = 1;

				int i_5;
				int i_6;
				int i_7;
				if (b_18 > 0) {
					i_5 = b_18 - -1990677291 * aNode_Sub35_3647.index * -1115476867;
					if (i_5 > i_3)
						i_5 = i_3;

					aClass202_7778.read(aNode_Sub35_3647.buffer, -1990677291 * aNode_Sub35_3647.index * -1115476867, i_5);
					if (aByte3656 != 0)
						for (i_6 = 0; i_6 < i_5; i_6++)
							aNode_Sub35_3647.buffer[i_6 + -1990677291 * aNode_Sub35_3647.index * -1115476867] ^= aByte3656;

					aNode_Sub35_3647.index = (aNode_Sub35_3647.index * -1115476867 + -1115476867 * i_5) * -1990677291;
					if (aNode_Sub35_3647.index * -1115476867 * -1990677291 >= b_18)
						if (current == null) {
							aNode_Sub35_3647.index = 0;
							i_6 = aNode_Sub35_3647.readUnsignedByte();
							i_7 = aNode_Sub35_3647.readInt();
							int i_8 = aNode_Sub35_3647.readUnsignedByte();
							int i_9 = aNode_Sub35_3647.readInt();
							int i_10 = i_8 & 0x7f;
							boolean bool_11 = (i_8 & 0x80) != 0;
							long long_12 = i_7 + ((long) i_6 << 32);
							Object obj_14 = null;
							PaddedJS5Request class282_sub50_sub11_sub1_15;
							if (bool_11)
								for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingExtras.method7941(); class282_sub50_sub11_sub1_15 != null && class282_sub50_sub11_sub1_15.key * 5418180015864004923L * -7883876913471066125L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingExtras.method7955()) {
								}
							else
								for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingPriorities.method7941(); class282_sub50_sub11_sub1_15 != null && -7883876913471066125L * class282_sub50_sub11_sub1_15.key * 5418180015864004923L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingPriorities.method7955()) {
								}

							if (class282_sub50_sub11_sub1_15 == null)
								throw new IOException();

							int i_16 = i_10 == 0 ? 5 : 9;
							current = class282_sub50_sub11_sub1_15;
							current.stream = new ByteBuf(i_16 + i_9 + current.padding);
							current.stream.writeByte(i_10);
							current.stream.writeInt(i_9);
							current.anInt10377 = -131722454 * -5971791;
							aNode_Sub35_3647.index = 0;
						} else {
							if (-5971791 * current.anInt10377 * -442668975 != 0)
								throw new IOException();

							if (aNode_Sub35_3647.buffer[0] == -1) {
								current.anInt10377 = -442668975 * -5971791;
								aNode_Sub35_3647.index = 0;
							} else
								current = null;
						}
				} else {
					i_5 = current.stream.buffer.length - current.padding;
					i_6 = 512 - current.anInt10377 * -442668975 * -5971791;
					if (i_6 > i_5 - -1990677291 * current.stream.index * -1115476867)
						i_6 = i_5 - -1990677291 * current.stream.index * -1115476867;

					if (i_6 > i_3)
						i_6 = i_3;

					aClass202_7778.read(current.stream.buffer, -1990677291 * current.stream.index * -1115476867, i_6);
					if (aByte3656 != 0)
						for (i_7 = 0; i_7 < i_6; i_7++)
							current.stream.buffer[i_7 + current.stream.index * -1115476867 * -1990677291] ^= aByte3656;

					current.stream.index = (current.stream.index * -1115476867 + i_6 * -1115476867) * -1990677291;
					current.anInt10377 = (current.anInt10377 * -442668975 + i_6 * -442668975) * -5971791;
					if (i_5 == -1990677291 * current.stream.index * -1115476867) {
						current.method13452();
						current.waiting = false;
						current = null;
					} else if (current.anInt10377 * -442668975 * -5971791 == 512)
						current.anInt10377 = 0;
				}
			}

			boolean bool_19 = true;
			return bool_19;
		} catch (IOException ioexception_23) {
			try {
				aClass202_7778.end();
			} catch (Exception ignored) {
			}

			aClass202_7778 = null;
			anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
			anInt3650 = -1877293362 * -99092567;
			return priorities() == 0 && extras() == 0;
		}
	}

	@Override
	public void method5543() {
		if (aClass202_7778 != null)
			aClass202_7778.method3320();

	}

	@Override
	public void method5544(Connection object_1, boolean bool_2) {
		if (aClass202_7778 != null) {
			try {
				aClass202_7778.end();
			} catch (Exception ignored) {
			}

			aClass202_7778 = null;
		}

		aClass202_7778 = object_1;
		method12537();
		method5523(bool_2);
		aNode_Sub35_3647.index = 0;
		current = null;

		while (true) {
			PaddedJS5Request class282_sub50_sub11_sub1_3 = (PaddedJS5Request) waitingPriorities.method7937();
			if (class282_sub50_sub11_sub1_3 == null)
				while (true) {
					class282_sub50_sub11_sub1_3 = (PaddedJS5Request) waitingExtras.method7937();
					if (class282_sub50_sub11_sub1_3 == null) {
						if (aByte3656 != 0)
							try {
								aNode_Sub35_3655.index = 0;
								aNode_Sub35_3655.writeByte(4);
								aNode_Sub35_3655.writeByte(aByte3656);
								aNode_Sub35_3655.writeInt(0);
								aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
							} catch (IOException ioexception_6) {
								try {
									aClass202_7778.end();
								} catch (Exception ignored) {
								}

								aClass202_7778 = null;
								anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
								anInt3650 = -1877293362 * -99092567;
							}

						anInt3653 = 0;
						aLong3648 = Utils.time() * 4647288634594403059L * 3280542953542993467L;
						return;
					}

					extras.add(class282_sub50_sub11_sub1_3);
				}

			priorities.add(class282_sub50_sub11_sub1_3);
		}
	}

	@Override
	public void method5545(Connection object_1, boolean bool_2) {
		if (aClass202_7778 != null) {
			try {
				aClass202_7778.end();
			} catch (Exception ignored) {
			}

			aClass202_7778 = null;
		}

		aClass202_7778 = object_1;
		method12537();
		method5523(bool_2);
		aNode_Sub35_3647.index = 0;
		current = null;

		while (true) {
			PaddedJS5Request class282_sub50_sub11_sub1_3 = (PaddedJS5Request) waitingPriorities.method7937();
			if (class282_sub50_sub11_sub1_3 == null)
				while (true) {
					class282_sub50_sub11_sub1_3 = (PaddedJS5Request) waitingExtras.method7937();
					if (class282_sub50_sub11_sub1_3 == null) {
						if (aByte3656 != 0)
							try {
								aNode_Sub35_3655.index = 0;
								aNode_Sub35_3655.writeByte(4);
								aNode_Sub35_3655.writeByte(aByte3656);
								aNode_Sub35_3655.writeInt(0);
								aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
							} catch (IOException ioexception_6) {
								try {
									aClass202_7778.end();
								} catch (Exception ignored) {
								}

								aClass202_7778 = null;
								anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
								anInt3650 = -1877293362 * -99092567;
							}

						anInt3653 = 0;
						aLong3648 = Utils.time() * 4647288634594403059L * 3280542953542993467L;
						return;
					}

					extras.add(class282_sub50_sub11_sub1_3);
				}

			priorities.add(class282_sub50_sub11_sub1_3);
		}
	}

	@Override
	public void method5546(boolean bool_1) {
		if (aClass202_7778 != null)
			try {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(bool_1 ? 2 : 3);
				aNode_Sub35_3655.method13204(0L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
			} catch (IOException ioexception_5) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
				anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
				anInt3650 = -1877293362 * -99092567;
			}

	}

	@Override
	public void method5547() {
		if (aClass202_7778 != null)
			aClass202_7778.end();

	}

	@Override
	public void method5548() {
		if (aClass202_7778 != null)
			aClass202_7778.end();

	}

	@Override
	public void method5549() {
		if (aClass202_7778 != null)
			aClass202_7778.end();

	}

	@Override
	public void method5550() {
		if (aClass202_7778 != null)
			try {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(7);
				aNode_Sub35_3655.method13204(0L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
			} catch (IOException ioexception_4) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
				anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
				anInt3650 = -1877293362 * -99092567;
			}

	}

	@Override
	public void method5552() {
		if (aClass202_7778 != null)
			try {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(7);
				aNode_Sub35_3655.method13204(0L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
			} catch (IOException ioexception_4) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
				anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
				anInt3650 = -1877293362 * -99092567;
			}

	}

	@Override
	public void method5554() {
		if (aClass202_7778 != null)
			aClass202_7778.end();

	}

	@Override
	public boolean method5557() {
		int i_3;
		if (aClass202_7778 != null) {
			long long_1 = Utils.time();
			i_3 = (int) (long_1 - 3280542953542993467L * aLong3648 * 4647288634594403059L);
			aLong3648 = 4647288634594403059L * long_1 * 3280542953542993467L;
			if (i_3 > 200)
				i_3 = 200;

			anInt3653 = (anInt3653 * -993989301 + i_3 * -993989301) * -1846332317;
			if (anInt3653 * -993989301 * -1846332317 > 30000) {
				try {
					aClass202_7778.end();
				} catch (Exception ignored) {
				}

				aClass202_7778 = null;
			}
		}

		if (aClass202_7778 == null)
			return priorities() == 0 && extras() == 0;
		try {
			PaddedJS5Request class282_sub50_sub11_sub1_2;
			for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) priorities.method7941(); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) priorities.method7955()) {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(1);
				aNode_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
				waitingPriorities.add(class282_sub50_sub11_sub1_2);
			}

			for (class282_sub50_sub11_sub1_2 = (PaddedJS5Request) extras.method7941(); class282_sub50_sub11_sub1_2 != null; class282_sub50_sub11_sub1_2 = (PaddedJS5Request) extras.method7955()) {
				aNode_Sub35_3655.index = 0;
				aNode_Sub35_3655.writeByte(0);
				aNode_Sub35_3655.method13204(class282_sub50_sub11_sub1_2.key * 5418180015864004923L * -7883876913471066125L);
				aClass202_7778.write(aNode_Sub35_3655.buffer, aNode_Sub35_3655.buffer.length);
				waitingExtras.add(class282_sub50_sub11_sub1_2);
			}

			for (int i_17 = 0; i_17 < 100; i_17++) {
				i_3 = aClass202_7778.method3312();
				if (i_3 < 0)
					throw new IOException();

				if (i_3 == 0)
					break;

				anInt3653 = 0;
				byte b_18 = 0;
				if (current == null)
					b_18 = 10;
				else if (-5971791 * current.anInt10377 * -442668975 == 0)
					b_18 = 1;

				int i_5;
				int i_6;
				int i_7;
				if (b_18 > 0) {
					i_5 = b_18 - -1990677291 * aNode_Sub35_3647.index * -1115476867;
					if (i_5 > i_3)
						i_5 = i_3;

					aClass202_7778.read(aNode_Sub35_3647.buffer, -1990677291 * aNode_Sub35_3647.index * -1115476867, i_5);
					if (aByte3656 != 0)
						for (i_6 = 0; i_6 < i_5; i_6++)
							aNode_Sub35_3647.buffer[i_6 + -1990677291 * aNode_Sub35_3647.index * -1115476867] ^= aByte3656;

					aNode_Sub35_3647.index = (aNode_Sub35_3647.index * -1115476867 + -1115476867 * i_5) * -1990677291;
					if (aNode_Sub35_3647.index * -1115476867 * -1990677291 >= b_18)
						if (current == null) {
							aNode_Sub35_3647.index = 0;
							i_6 = aNode_Sub35_3647.readUnsignedByte();
							i_7 = aNode_Sub35_3647.readInt();
							int i_8 = aNode_Sub35_3647.readUnsignedByte();
							int i_9 = aNode_Sub35_3647.readInt();
							int i_10 = i_8 & 0x7f;
							boolean bool_11 = (i_8 & 0x80) != 0;
							long long_12 = i_7 + ((long) i_6 << 32);
							Object obj_14 = null;
							PaddedJS5Request class282_sub50_sub11_sub1_15;
							if (bool_11)
								for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingExtras.method7941(); class282_sub50_sub11_sub1_15 != null && class282_sub50_sub11_sub1_15.key * 5418180015864004923L * -7883876913471066125L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingExtras.method7955()) {
								}
							else
								for (class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingPriorities.method7941(); class282_sub50_sub11_sub1_15 != null && -7883876913471066125L * class282_sub50_sub11_sub1_15.key * 5418180015864004923L != long_12; class282_sub50_sub11_sub1_15 = (PaddedJS5Request) waitingPriorities.method7955()) {
								}

							if (class282_sub50_sub11_sub1_15 == null)
								throw new IOException();

							int i_16 = i_10 == 0 ? 5 : 9;
							current = class282_sub50_sub11_sub1_15;
							current.stream = new ByteBuf(i_16 + i_9 + current.padding);
							current.stream.writeByte(i_10);
							current.stream.writeInt(i_9);
							current.anInt10377 = -131722454 * -5971791;
							aNode_Sub35_3647.index = 0;
						} else {
							if (-5971791 * current.anInt10377 * -442668975 != 0)
								throw new IOException();

							if (aNode_Sub35_3647.buffer[0] == -1) {
								current.anInt10377 = -442668975 * -5971791;
								aNode_Sub35_3647.index = 0;
							} else
								current = null;
						}
				} else {
					i_5 = current.stream.buffer.length - current.padding;
					i_6 = 512 - current.anInt10377 * -442668975 * -5971791;
					if (i_6 > i_5 - -1990677291 * current.stream.index * -1115476867)
						i_6 = i_5 - -1990677291 * current.stream.index * -1115476867;

					if (i_6 > i_3)
						i_6 = i_3;

					aClass202_7778.read(current.stream.buffer, -1990677291 * current.stream.index * -1115476867, i_6);
					if (aByte3656 != 0)
						for (i_7 = 0; i_7 < i_6; i_7++)
							current.stream.buffer[i_7 + current.stream.index * -1115476867 * -1990677291] ^= aByte3656;

					current.stream.index = (current.stream.index * -1115476867 + i_6 * -1115476867) * -1990677291;
					current.anInt10377 = (current.anInt10377 * -442668975 + i_6 * -442668975) * -5971791;
					if (i_5 == -1990677291 * current.stream.index * -1115476867) {
						current.method13452();
						current.waiting = false;
						current = null;
					} else if (current.anInt10377 * -442668975 * -5971791 == 512)
						current.anInt10377 = 0;
				}
			}

			boolean bool_19 = true;
			return bool_19;
		} catch (IOException ioexception_23) {
			try {
				aClass202_7778.end();
			} catch (Exception ignored) {
			}

			aClass202_7778 = null;
			anInt3657 = (anInt3657 * 1211706083 + 1211706083) * 1287875275;
			anInt3650 = -1877293362 * -99092567;
			return priorities() == 0 && extras() == 0;
		}
	}
}
