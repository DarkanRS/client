import jaclib.hardware_info.HardwareInfo;
import java.util.HashMap;

public class SystemInfo extends Node {

	String aString8157;

	String aString8160;

	String aString8159;

	String aString8153;

	int[] anIntArray8139 = new int[3];

	int anInt8126;

	boolean aBool8142;

	int anInt8141;

	int anInt8155;

	public int javaRelease;

	int anInt8148;

	public int javaUpdate;

	boolean aBool8150;

	int anInt8151;

	int anInt8146;

	public int anInt8167;

	int anInt8163;

	int anInt8156;

	String aString8165;

	int anInt8168;

	int anInt8121;

	String aString8166;

	int anInt8162;

	int anInt8164;

	public int method13454() {
		byte b_2 = 38;
		int i_3 = b_2 + ParticleTriangle.method3952(this.aString8157, -696675148);
		i_3 += ParticleTriangle.method3952(this.aString8160, 1704970825);
		i_3 += ParticleTriangle.method3952(this.aString8159, 1902429767);
		i_3 += ParticleTriangle.method3952(this.aString8153, 1087732237);
		i_3 += ParticleTriangle.method3952(this.aString8165, -126400447);
		i_3 += ParticleTriangle.method3952(this.aString8166, -276282908);
		return i_3;
	}

	void method13455() {
		if (this.aString8157.length() > 40) {
			this.aString8157 = this.aString8157.substring(0, 40);
		}
		if (this.aString8160.length() > 40) {
			this.aString8160 = this.aString8160.substring(0, 40);
		}
		if (this.aString8159.length() > 10) {
			this.aString8159 = this.aString8159.substring(0, 10);
		}
		if (this.aString8153.length() > 10) {
			this.aString8153 = this.aString8153.substring(0, 10);
		}
	}

	public void writeMachineInformation(RsByteBuffer rsbytebuffer_1) {
		rsbytebuffer_1.writeByte(6);
		rsbytebuffer_1.writeByte(this.anInt8126);
		rsbytebuffer_1.writeByte(this.aBool8142 ? 1 : 0);
		rsbytebuffer_1.writeByte(this.anInt8141);
		rsbytebuffer_1.writeByte(this.anInt8155);
		rsbytebuffer_1.writeByte(this.javaRelease);
		rsbytebuffer_1.writeByte(this.anInt8148);
		rsbytebuffer_1.writeByte(this.javaUpdate);
		rsbytebuffer_1.writeByte(this.aBool8150 ? 1 : 0);
		rsbytebuffer_1.writeShort(this.anInt8151);
		rsbytebuffer_1.writeByte(this.anInt8146);
		rsbytebuffer_1.write24BitInt(this.anInt8167);
		rsbytebuffer_1.writeShort(this.anInt8156);
		rsbytebuffer_1.writeJagString(this.aString8157, 2145026142);
		rsbytebuffer_1.writeJagString(this.aString8160, 2128264250);
		rsbytebuffer_1.writeJagString(this.aString8159, 2122985674);
		rsbytebuffer_1.writeJagString(this.aString8153, 2114964752);
		rsbytebuffer_1.writeByte(this.anInt8162);
		rsbytebuffer_1.writeShort(this.anInt8164);
		rsbytebuffer_1.writeJagString(this.aString8165, 2113125400);
		rsbytebuffer_1.writeJagString(this.aString8166, 2132826460);
		rsbytebuffer_1.writeByte(this.anInt8163);
		rsbytebuffer_1.writeByte(this.anInt8121);
		for (int i_3 = 0; i_3 < this.anIntArray8139.length; i_3++) {
			rsbytebuffer_1.writeInt(this.anIntArray8139[i_3]);
		}
		rsbytebuffer_1.writeInt(this.anInt8168);
	}

	public SystemInfo() {
		if (Class225_Sub6.aString8069.startsWith("win")) {
			this.anInt8126 = 1;
		} else if (Class225_Sub6.aString8069.startsWith("mac")) {
			this.anInt8126 = 2;
		} else if (Class225_Sub6.aString8069.startsWith("linux")) {
			this.anInt8126 = 3;
		} else {
			this.anInt8126 = 4;
		}
		if (!Class402.aString4828.startsWith("amd64") && !Class402.aString4828.startsWith("x86_64")) {
			this.aBool8142 = false;
		} else {
			this.aBool8142 = true;
		}
		if (this.anInt8126 == 1) {
			if (Class231.aString2876.indexOf("4.0") != -1) {
				this.anInt8141 = 1;
			} else if (Class231.aString2876.indexOf("4.1") != -1) {
				this.anInt8141 = 2;
			} else if (Class231.aString2876.indexOf("4.9") != -1) {
				this.anInt8141 = 3;
			} else if (Class231.aString2876.indexOf("5.0") != -1) {
				this.anInt8141 = 4;
			} else if (Class231.aString2876.indexOf("5.1") != -1) {
				this.anInt8141 = 5;
			} else if (Class231.aString2876.indexOf("5.2") != -1) {
				this.anInt8141 = 8;
			} else if (Class231.aString2876.indexOf("6.0") != -1) {
				this.anInt8141 = 6;
			} else if (Class231.aString2876.indexOf("6.1") != -1) {
				this.anInt8141 = 7;
			} else if (Class231.aString2876.indexOf("6.2") != -1) {
				this.anInt8141 = 9;
			}
		} else if (this.anInt8126 == 2) {
			if (Class231.aString2876.indexOf("10.4") != -1) {
				this.anInt8141 = 20;
			} else if (Class231.aString2876.indexOf("10.5") != -1) {
				this.anInt8141 = 21;
			} else if (Class231.aString2876.indexOf("10.6") != -1) {
				this.anInt8141 = 22;
			} else if (Class231.aString2876.indexOf("10.7") != -1) {
				this.anInt8141 = 23;
			}
		}
		if (Class282_Sub20_Sub34.aString9967.toLowerCase().indexOf("sun") != -1) {
			this.anInt8155 = 1;
		} else if (Class282_Sub20_Sub34.aString9967.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt8155 = 2;
		} else if (Class282_Sub20_Sub34.aString9967.toLowerCase().indexOf("apple") != -1) {
			this.anInt8155 = 3;
		} else {
			this.anInt8155 = 4;
		}
		int i_2 = ChatLine.aString1093.startsWith("1.") ? 2 : 0;
		int i_3 = 0;
		char var_4;
		try {
			while (i_2 < ChatLine.aString1093.length()) {
				var_4 = ChatLine.aString1093.charAt(i_2);
				if (var_4 < 48 || var_4 > 57) {
					break;
				}
				i_3 = var_4 - 48 + i_3 * 10;
				++i_2;
			}
		} catch (Exception exception_24) {
			;
		}
		this.javaRelease = i_3;
		i_2 = ChatLine.aString1093.indexOf(46, 2) + 1;
		i_3 = 0;
		try {
			while (i_2 < ChatLine.aString1093.length()) {
				var_4 = ChatLine.aString1093.charAt(i_2);
				if (var_4 < 48 || var_4 > 57) {
					break;
				}
				i_3 = var_4 - 48 + i_3 * 10;
				++i_2;
			}
		} catch (Exception exception_23) {
			;
		}
		this.anInt8148 = i_3;
		i_2 = ChatLine.aString1093.indexOf(95, 4) + 1;
		i_3 = 0;
		try {
			while (i_2 < ChatLine.aString1093.length()) {
				var_4 = ChatLine.aString1093.charAt(i_2);
				if (var_4 < 48 || var_4 > 57) {
					break;
				}
				i_3 = var_4 - 48 + i_3 * 10;
				++i_2;
			}
		} catch (Exception exception_22) {
			;
		}
		this.javaUpdate = i_3;
		this.aBool8150 = false;
		this.anInt8151 = Engine.MAX_MEMORY;
		if (this.javaRelease > 3) {
			this.anInt8146 = Engine.AVAILABLE_PROCESSORS;
		} else {
			this.anInt8146 = 0;
		}
		try {
			int[] ints_14 = HardwareInfo.getCPUInfo();
			if (ints_14 != null && ints_14.length == 3) {
				this.anInt8163 = ints_14[0];
				this.anInt8156 = ints_14[1];
				this.anInt8167 = ints_14[2];
			}
			int[] ints_5 = HardwareInfo.getRawCPUInfo();
			int i_7;
			int i_9;
			int i_10;
			int i_11;
			if (ints_5 != null && ints_5.length % 5 == 0) {
				HashMap hashmap_6 = new HashMap();
				for (i_7 = 0; i_7 < ints_5.length / 5; i_7++) {
					int i_8 = ints_5[i_7 * 5];
					i_9 = ints_5[i_7 * 5 + 1];
					i_10 = ints_5[i_7 * 5 + 2];
					i_11 = ints_5[i_7 * 5 + 3];
					int i_12 = ints_5[i_7 * 5 + 4];
					Class430 class430_13 = new Class430(i_8, i_9, i_10, i_11, i_12);
					hashmap_6.put(Integer.valueOf(i_8), class430_13);
				}
				Class430 class430_15 = (Class430) hashmap_6.get(Integer.valueOf(0));
				if (class430_15 != null) {
					RsByteBuffer rsbytebuffer_16 = new RsByteBuffer(13);
					rsbytebuffer_16.method13232(class430_15.anInt5137, (byte) -36);
					rsbytebuffer_16.method13232(class430_15.anInt5136, (byte) -21);
					rsbytebuffer_16.method13232(class430_15.anInt5138, (byte) -95);
					rsbytebuffer_16.index = 0;
					this.aString8165 = rsbytebuffer_16.readString();
				}
				Class430 class430_27 = (Class430) hashmap_6.get(Integer.valueOf(1));
				if (class430_27 != null) {
					this.anInt8168 = class430_27.anInt5139;
					i_9 = class430_27.anInt5137;
					this.anInt8121 = i_9 >> 16 & 0xff;
					this.anIntArray8139[0] = class430_27.anInt5138;
					this.anIntArray8139[1] = class430_27.anInt5136;
				}
				Class430 class430_17 = (Class430) hashmap_6.get(Integer.valueOf(-2147483647));
				if (class430_17 != null) {
					this.anIntArray8139[2] = class430_17.anInt5136;
				}
				RsByteBuffer rsbytebuffer_18 = new RsByteBuffer(49);
				for (i_11 = -2147483646; i_11 <= -2147483644; i_11++) {
					Class430 class430_19 = (Class430) hashmap_6.get(Integer.valueOf(i_11));
					if (class430_19 != null) {
						rsbytebuffer_18.method13232(class430_19.anInt5139, (byte) -113);
						rsbytebuffer_18.method13232(class430_19.anInt5137, (byte) -58);
						rsbytebuffer_18.method13232(class430_19.anInt5138, (byte) -29);
						rsbytebuffer_18.method13232(class430_19.anInt5136, (byte) -36);
					}
				}
				rsbytebuffer_18.index = 0;
				this.aString8166 = rsbytebuffer_18.readString();
			}
			String[][] arr_25 = HardwareInfo.getDXDiagDisplayDevicesProps();
			String string_28;
			if (arr_25 != null && arr_25.length > 0 && arr_25[0] != null) {
				for (i_7 = 0; i_7 < arr_25[0].length; i_7 += 2) {
					if (arr_25[0][i_7].equalsIgnoreCase("szDescription")) {
						this.aString8157 = arr_25[0][i_7 + 1];
					} else if (arr_25[0][i_7].equalsIgnoreCase("szDriverDateEnglish")) {
						string_28 = arr_25[0][i_7 + 1];
						try {
							i_9 = string_28.indexOf("/");
							i_10 = string_28.indexOf("/", i_9 + 1);
							this.anInt8162 = Integer.parseInt(string_28.substring(0, i_9));
							this.anInt8164 = Integer.parseInt(string_28.substring(i_10 + 1, string_28.indexOf(" ", i_10)));
						} catch (Exception exception_20) {
							;
						}
					}
				}
			}
			String[] arr_26 = HardwareInfo.getDXDiagSystemProps();
			if (arr_26 != null) {
				string_28 = "";
				String str_29 = "";
				String str_30 = "";
				for (i_11 = 0; i_11 < arr_26.length; i_11 += 2) {
					if (arr_26[i_11].equalsIgnoreCase("dwDirectXVersionMajor")) {
						string_28 = arr_26[i_11 + 1];
					} else if (arr_26[i_11].equalsIgnoreCase("dwDirectXVersionMinor")) {
						str_29 = arr_26[i_11 + 1];
					} else if (arr_26[i_11].equalsIgnoreCase("dwDirectXVersionLetter")) {
						str_30 = arr_26[i_11 + 1];
					}
				}
				this.aString8159 = string_28 + "." + str_29 + str_30;
			}
		} catch (Throwable throwable_21) {
			this.anInt8167 = 0;
		}
		if (this.aString8157 == null) {
			this.aString8157 = "";
		}
		if (this.aString8160 == null) {
			this.aString8160 = "";
		}
		if (this.aString8159 == null) {
			this.aString8159 = "";
		}
		if (this.aString8153 == null) {
			this.aString8153 = "";
		}
		if (this.aString8165 == null) {
			this.aString8165 = "";
		}
		if (this.aString8166 == null) {
			this.aString8166 = "";
		}
		this.method13455();
	}

	static final void method13466(Animable animable_0, boolean bool_1) {
		RenderAnimDefs renderanimdefs_3 = animable_0.getRenderAnimDefs();
		if (animable_0.anInt10355 == 0) {
			animable_0.anInt10366 = 0;
			IdentikitDefinition.anInt430 = Class249.aClass249_3083.aByte3085;
			Class8_Sub1.anInt8515 = 0;
		} else {
			if (animable_0.currentAnimation.hasDefs() && !animable_0.currentAnimation.hasSpeed(584514311)) {
				AnimationDefinitions animationdefinitions_4 = animable_0.currentAnimation.getDefs();
				if (animable_0.anInt10367 > 0 && animationdefinitions_4.animatingPrecedence == 0) {
					++animable_0.anInt10366;
					IdentikitDefinition.anInt430 = Class249.aClass249_3083.aByte3085;
					Class8_Sub1.anInt8515 = 0;
					return;
				}
				if (animable_0.anInt10367 <= 0 && animationdefinitions_4.walkingPrecedence == 0) {
					++animable_0.anInt10366;
					IdentikitDefinition.anInt430 = Class249.aClass249_3083.aByte3085;
					Class8_Sub1.anInt8515 = 0;
					return;
				}
			}
			for (int i_18 = 0; i_18 < animable_0.aClass161Array10339.length; i_18++) {
				if (animable_0.aClass161Array10339[i_18].spotAnimId != -1 && animable_0.aClass161Array10339[i_18].animation.hasSpeed(-606649252)) {
					SpotAnimDefinitions spotanimdefinitions_19 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(animable_0.aClass161Array10339[i_18].spotAnimId, (byte) 43);
					if (spotanimdefinitions_19.aBool6968 && spotanimdefinitions_19.animationId != -1) {
						AnimationDefinitions animationdefinitions_20 = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(spotanimdefinitions_19.animationId, (byte) -10);
						if (animable_0.anInt10367 > 0 && animationdefinitions_20.animatingPrecedence == 0) {
							++animable_0.anInt10366;
							IdentikitDefinition.anInt430 = Class249.aClass249_3083.aByte3085;
							Class8_Sub1.anInt8515 = 0;
							return;
						}
						if (animable_0.anInt10367 <= 0 && animationdefinitions_20.walkingPrecedence == 0) {
							++animable_0.anInt10366;
							IdentikitDefinition.anInt430 = Class249.aClass249_3083.aByte3085;
							Class8_Sub1.anInt8515 = 0;
							return;
						}
					}
				}
			}
			Vector3 vector3_21 = Vector3.popVectorStackTo(animable_0.method11166().aClass385_3595);
			int i_5 = (int) vector3_21.x;
			int i_6 = (int) vector3_21.z;
			int i_7 = 512 * animable_0.regionBaseX[animable_0.anInt10355 - 1] + animable_0.getSize() * 256;
			int i_8 = animable_0.regionBaseY[animable_0.anInt10355 - 1] * 512 + animable_0.getSize() * 256;
			if (i_5 < i_7) {
				if (i_6 < i_8) {
					animable_0.method15863(10240, 1808111864);
				} else if (i_6 > i_8) {
					animable_0.method15863(14336, 1973233568);
				} else {
					animable_0.method15863(12288, 1565896314);
				}
			} else if (i_5 > i_7) {
				if (i_6 < i_8) {
					animable_0.method15863(6144, 1883994002);
				} else if (i_6 > i_8) {
					animable_0.method15863(2048, 2136664980);
				} else {
					animable_0.method15863(4096, 1716734744);
				}
			} else if (i_6 < i_8) {
				animable_0.method15863(8192, 1994158065);
			} else if (i_6 > i_8) {
				animable_0.method15863(0, 1630860423);
			}
			byte b_9 = animable_0.aByteArray10365[animable_0.anInt10355 - 1];
			if (bool_1 || i_7 - i_5 <= 1024 && i_7 - i_5 >= -1024 && i_8 - i_6 <= 1024 && i_8 - i_6 >= -1024) {
				int i_10 = 16;
				boolean bool_11 = true;
				if (animable_0 instanceof NPC) {
					bool_11 = ((NPC) animable_0).definitions.aBool4894;
				}
				int i_12;
				if (bool_11) {
					i_12 = animable_0.anInt10361 - animable_0.aClass19_10359.anInt153;
					if (i_12 != 0 && animable_0.faceEntity == -1 && animable_0.anInt10340 != 0) {
						i_10 = 8;
					}
					if (!bool_1 && animable_0.anInt10355 > 2) {
						i_10 = 24;
					}
					if (!bool_1 && animable_0.anInt10355 > 3) {
						i_10 = 32;
					}
				} else {
					if (!bool_1 && animable_0.anInt10355 > 1) {
						i_10 = 24;
					}
					if (!bool_1 && animable_0.anInt10355 > 2) {
						i_10 = 32;
					}
				}
				if (animable_0.anInt10366 > 0 && animable_0.anInt10355 > 1) {
					i_10 = 32;
					--animable_0.anInt10366;
				}
				if (b_9 == Class249.aClass249_3086.aByte3085) {
					i_10 <<= 1;
				} else if (b_9 == Class249.aClass249_3082.aByte3085) {
					i_10 >>= 1;
				}
				if (renderanimdefs_3.anInt2826 != -1) {
					i_10 <<= 9;
					if (animable_0.anInt10355 == 1) {
						i_12 = animable_0.anInt10368 * animable_0.anInt10368;
						int i_13 = ((int) vector3_21.x > i_7 ? (int) vector3_21.x - i_7 : i_7 - (int) vector3_21.x) << 9;
						int i_14 = ((int) vector3_21.z > i_8 ? (int) vector3_21.z - i_8 : i_8 - (int) vector3_21.z) << 9;
						int i_15 = i_13 > i_14 ? i_13 : i_14;
						int i_16 = i_15 * renderanimdefs_3.anInt2826 * 2;
						if (i_12 > i_16) {
							animable_0.anInt10368 /= 2;
						} else if (i_12 / 2 > i_15) {
							animable_0.anInt10368 -= renderanimdefs_3.anInt2826;
							if (animable_0.anInt10368 < 0) {
								animable_0.anInt10368 = 0;
							}
						} else if (animable_0.anInt10368 < i_10) {
							animable_0.anInt10368 += renderanimdefs_3.anInt2826;
							if (animable_0.anInt10368 > i_10) {
								animable_0.anInt10368 = i_10;
							}
						}
					} else if (animable_0.anInt10368 < i_10) {
						animable_0.anInt10368 += renderanimdefs_3.anInt2826;
						if (animable_0.anInt10368 > i_10) {
							animable_0.anInt10368 = i_10;
						}
					} else if (animable_0.anInt10368 > 0) {
						animable_0.anInt10368 -= renderanimdefs_3.anInt2826;
						if (animable_0.anInt10368 < 0) {
							animable_0.anInt10368 = 0;
						}
					}
					i_10 = animable_0.anInt10368 >> 9;
					if (i_10 < 1) {
						i_10 = 1;
					}
				}
				Class8_Sub1.anInt8515 = 0;
				if (i_7 == i_5 && i_8 == i_6) {
					IdentikitDefinition.anInt430 = Class249.aClass249_3083.aByte3085;
				} else {
					if (i_5 < i_7) {
						vector3_21.x += (float) i_10;
						Class8_Sub1.anInt8515 |= 0x4;
						if (vector3_21.x > (float) i_7) {
							vector3_21.x = (float) i_7;
						}
					} else if (i_5 > i_7) {
						vector3_21.x -= (float) i_10;
						Class8_Sub1.anInt8515 |= 0x8;
						if (vector3_21.x < (float) i_7) {
							vector3_21.x = (float) i_7;
						}
					}
					if (i_6 < i_8) {
						vector3_21.z += (float) i_10;
						Class8_Sub1.anInt8515 |= 0x1;
						if (vector3_21.z > (float) i_8) {
							vector3_21.z = (float) i_8;
						}
					} else if (i_6 > i_8) {
						vector3_21.z -= (float) i_10;
						Class8_Sub1.anInt8515 |= 0x2;
						if (vector3_21.z < (float) i_8) {
							vector3_21.z = (float) i_8;
						}
					}
					animable_0.method11171(vector3_21);
					if (i_10 >= 32) {
						IdentikitDefinition.anInt430 = Class249.aClass249_3086.aByte3085;
					} else {
						IdentikitDefinition.anInt430 = b_9;
					}
				}
				if (i_7 == (int) vector3_21.x && i_8 == (int) vector3_21.z) {
					--animable_0.anInt10355;
					if (animable_0.anInt10367 > 0) {
						--animable_0.anInt10367;
					}
				}
				vector3_21.pushVectorStack();
			} else {
				animable_0.method11172((float) i_7, vector3_21.y, (float) i_8);
				animable_0.method15791(animable_0.anInt10361, false, (byte) -111);
				--animable_0.anInt10355;
				if (animable_0.anInt10367 > 0) {
					--animable_0.anInt10367;
				}
				IdentikitDefinition.anInt430 = Class249.aClass249_3083.aByte3085;
				Class8_Sub1.anInt8515 = 0;
				vector3_21.pushVectorStack();
			}
		}
	}
}
