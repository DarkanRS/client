public class Interface {

	IComponentDefinitions[] iComponentDefinitions;

	public IComponentDefinitions[] components;

	public boolean aBool999;

	public IComponentDefinitions[] method1616(int i_1) {
		return this.iComponentDefinitions == null ? this.components : this.iComponentDefinitions;
	}

	public IComponentDefinitions[] method1617(int i_1) {
		if (this.iComponentDefinitions == null) {
			int i_2 = this.components.length;
			this.iComponentDefinitions = new IComponentDefinitions[i_2];
			System.arraycopy(this.components, 0, this.iComponentDefinitions, 0, this.components.length);
		}
		return this.iComponentDefinitions;
	}

	public IComponentDefinitions getComponent(int componentId) {
		if (componentId >>> 16 != this.components[0].idHash >>> 16) {
			throw new IllegalArgumentException();
		} else {
			return this.components[componentId & 0xffff];
		}
	}

	Interface(boolean bool_1, IComponentDefinitions[] arr_2) {
		this.components = arr_2;
		this.aBool999 = bool_1;
	}

	public static final void method1623(int i_0) {
		Class216.method3675(1786345593);
		for (int i_1 = 0; i_1 < Class260.anInt3219; i_1++) {
			Class268 class268_2 = Class260.aClass268Array3232[i_1];
			boolean bool_3 = false;
			int i_4;
			if (class268_2.aClass282_Sub15_Sub5_3304 == null) {
				--class268_2.anInt3297;
				if (class268_2.anInt3297 >= (class268_2.method4793((byte) -64) ? -1500 : -10)) {
					if (class268_2.aByte3300 == 1 && class268_2.aClass343_3303 == null) {
						class268_2.aClass343_3303 = Class343.method6094(IndexLoaders.SOUND_EFFECT_INDEX, class268_2.anInt3291, 0);
						if (class268_2.aClass343_3303 == null) {
							continue;
						}
						class268_2.anInt3297 += class268_2.aClass343_3303.method6090();
					} else if (class268_2.method4793((byte) -41) && (class268_2.aClass282_Sub18_3294 == null || class268_2.aClass282_Sub26_Sub1_Sub1_3296 == null)) {
						if (class268_2.aClass282_Sub18_3294 == null) {
							class268_2.aClass282_Sub18_3294 = Class282_Sub18.method12270(IndexLoaders.MIDI_INSTRUMENT_INDEX, class268_2.anInt3291);
						}
						if (class268_2.aClass282_Sub18_3294 == null) {
							continue;
						}
						if (class268_2.aClass282_Sub26_Sub1_Sub1_3296 == null) {
							class268_2.aClass282_Sub26_Sub1_Sub1_3296 = class268_2.aClass282_Sub18_3294.method12272();
							if (class268_2.aClass282_Sub26_Sub1_Sub1_3296 == null) {
								continue;
							}
						}
					}
					if (class268_2.anInt3297 < 0) {
						i_4 = 8192;
						int i_5;
						if (class268_2.anInt3298 != 0) {
							int i_6 = class268_2.anInt3298 >> 24 & 0x3;
							if (i_6 == Class84.myPlayer.plane) {
								int i_7 = (class268_2.anInt3298 & 0xff) << 9;
								int i_8 = Class84.myPlayer.getSize(828768449) << 8;
								Vector3 vector3_9 = Class84.myPlayer.method11166().aClass385_3595;
								int i_10 = class268_2.anInt3298 >> 16 & 0xff;
								int i_11 = (i_10 << 9) + 256 - (int) vector3_9.x + i_8;
								int i_12 = class268_2.anInt3298 >> 8 & 0xff;
								int i_13 = (i_12 << 9) + 256 - (int) vector3_9.z + i_8;
								int i_14 = Math.abs(i_11) + Math.abs(i_13) - 512;
								if (i_14 > i_7) {
									class268_2.anInt3297 = -99999;
									continue;
								}
								if (i_14 < 0) {
									i_14 = 0;
								}
								i_5 = (i_7 - i_14) * Class393.preferences.aClass468_Sub13_8193.method12714(347360160) * class268_2.anInt3299 / i_7 >> 2;
								if (class268_2.anInt3305 != -1) {
									i_10 = class268_2.anInt3305;
									i_12 = class268_2.anInt3306;
								}
								if (i_11 != 0 || i_13 != 0) {
									int i_15 = -AnimationDefinitions.anInt5930 - (int) (Math.atan2((double) i_11, (double) i_13) * 2607.5945876176133D) - 4096 & 0x3fff;
									if (i_15 > 8192) {
										i_15 = 16384 - i_15;
									}
									int i_16;
									if (i_14 <= 0) {
										i_16 = 8192;
									} else if (i_14 >= 4096) {
										i_16 = 16384;
									} else {
										i_16 = (8192 - i_14) / 4096 + 8192;
									}
									i_4 = (16384 - i_16 >> 1) + i_15 * i_16 / 8192;
								}
							} else {
								i_5 = 0;
							}
						} else {
							i_5 = class268_2.anInt3299 * (class268_2.aByte3300 == 3 ? Class393.preferences.aClass468_Sub13_8227.method12714(-356829345) : Class393.preferences.aClass468_Sub13_8225.method12714(-2116926454)) >> 2;
						}
						if (i_5 > 0) {
							if (class268_2.aByte3300 == 1) {
								Object obj_18 = null;
								Class282_Sub26_Sub1_Sub2 class282_sub26_sub1_sub2_19 = class268_2.aClass343_3303.method6089().method16062(Class119.aClass344_1460);
								class268_2.aClass282_Sub15_Sub5_3304 = class282_sub26_sub1_sub2_19.method15225(class268_2.anInt3295, i_5, i_4);
							} else if (class268_2.method4793((byte) -6)) {
								class268_2.aClass282_Sub15_Sub5_3304 = class268_2.aClass282_Sub26_Sub1_Sub1_3296.method15225(class268_2.anInt3295, i_5, i_4);
							}
							class268_2.aClass282_Sub15_Sub5_3304.method15325(class268_2.anInt3302 - 1, (byte) 8);
							Class79.aClass282_Sub15_Sub4_783.method15275(class268_2.aClass282_Sub15_Sub5_3304);
						}
					}
				} else {
					bool_3 = true;
				}
			} else if (!class268_2.aClass282_Sub15_Sub5_3304.isLinked()) {
				bool_3 = true;
			}
			if (bool_3) {
				--Class260.anInt3219;
				for (i_4 = i_1; i_4 < Class260.anInt3219; i_4++) {
					Class260.aClass268Array3232[i_4] = Class260.aClass268Array3232[i_4 + 1];
				}
				--i_1;
			}
		}
		if (Class260.aBool3220 && !Class116.method1966(1117518618)) {
			if (Class393.preferences.aClass468_Sub13_8228.method12714(-1550374075) != 0 && Class260.anInt3223 != -1) {
				if (Class260.aClass282_Sub15_Sub2_3231 != null) {
					Class217.method3690(IndexLoaders.MUSIC_INDEX, Class260.anInt3223, 0, Class393.preferences.aClass468_Sub13_8228.method12714(1791834725), false, Class260.aClass282_Sub15_Sub2_3231, 62181845);
				} else {
					Class11.method13400(IndexLoaders.MUSIC_INDEX, Class260.anInt3223, 0, Class393.preferences.aClass468_Sub13_8228.method12714(-786685196), false, (byte) -3);
				}
			}
			Class260.aBool3220 = false;
			Class260.aClass282_Sub15_Sub2_3231 = null;
		} else if (Class393.preferences.aClass468_Sub13_8228.method12714(-597103482) != 0 && Class260.anInt3223 != -1 && !Class116.method1966(1621182156)) {
			TCPMessage tcpmessage_17 = Class271.method4828(OutgoingPacket.aClass379_4529, client.aClass184_7475.isaac, 61949935);
			tcpmessage_17.buffer.writeInt(Class260.anInt3223);
			client.aClass184_7475.method3049(tcpmessage_17, -952420572);
			Class260.anInt3223 = -1;
		}
	}

	public static AccountCreationResponseOpcodes[] method1626(int i_0) {
		return new AccountCreationResponseOpcodes[] { AccountCreationResponseOpcodes.aClass483_5729, AccountCreationResponseOpcodes.CLIENT_HAS_BEEN_UPDATED, AccountCreationResponseOpcodes.CONTINUE, AccountCreationResponseOpcodes.aClass483_5733, AccountCreationResponseOpcodes.aClass483_5730, AccountCreationResponseOpcodes.aClass483_5735, AccountCreationResponseOpcodes.aClass483_5732, AccountCreationResponseOpcodes.aClass483_5736, AccountCreationResponseOpcodes.aClass483_5737, AccountCreationResponseOpcodes.aClass483_5731 };
	}
}
