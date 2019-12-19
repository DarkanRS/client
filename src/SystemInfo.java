import jaclib.hardware_info.HardwareInfo;
import java.util.HashMap;

public class SystemInfo extends Node {

	String aString8157;
	String aString8160;
	String aString8159;
	String aString8153;
	int[] rawCPUInformationData = new int[3];
	int operatingSystem;
	boolean x64os;
	int osVendor;
	int javaVersion;
	public int javaBuild;
	int javaSubBuild;
	public int javaUpdate;
	boolean idk;
	int maxMem;
	int processors;
	public int ram;
	int cpuCores;
	int cpuClock;
	String cpuType;
	int rawCPUInformation2;
	int rawCPUInformation;
	String cpuData;
	int dxDriverMonth;
	int dxDriverYear;

	public int method13454() {
		byte b_2 = 38;
		int i_3 = b_2 + Utils.stringLengthPlus2(this.aString8157);
		i_3 += Utils.stringLengthPlus2(this.aString8160);
		i_3 += Utils.stringLengthPlus2(this.aString8159);
		i_3 += Utils.stringLengthPlus2(this.aString8153);
		i_3 += Utils.stringLengthPlus2(this.cpuType);
		i_3 += Utils.stringLengthPlus2(this.cpuData);
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
		rsbytebuffer_1.writeByte(this.operatingSystem);
		rsbytebuffer_1.writeByte(this.x64os ? 1 : 0);
		rsbytebuffer_1.writeByte(this.osVendor);
		rsbytebuffer_1.writeByte(this.javaVersion);
		rsbytebuffer_1.writeByte(this.javaBuild);
		rsbytebuffer_1.writeByte(this.javaSubBuild);
		rsbytebuffer_1.writeByte(this.javaUpdate);
		rsbytebuffer_1.writeByte(this.idk ? 1 : 0);
		rsbytebuffer_1.writeShort(this.maxMem);
		rsbytebuffer_1.writeByte(this.processors);
		rsbytebuffer_1.write24BitInt(this.ram);
		rsbytebuffer_1.writeShort(this.cpuClock);
		rsbytebuffer_1.writeJagString(this.aString8157);
		rsbytebuffer_1.writeJagString(this.aString8160);
		rsbytebuffer_1.writeJagString(this.aString8159);
		rsbytebuffer_1.writeJagString(this.aString8153);
		rsbytebuffer_1.writeByte(this.dxDriverMonth);
		rsbytebuffer_1.writeShort(this.dxDriverYear);
		rsbytebuffer_1.writeJagString(this.cpuType);
		rsbytebuffer_1.writeJagString(this.cpuData);
		rsbytebuffer_1.writeByte(this.cpuCores);
		rsbytebuffer_1.writeByte(this.rawCPUInformation);
		for (int i_3 = 0; i_3 < this.rawCPUInformationData.length; i_3++) {
			rsbytebuffer_1.writeInt(this.rawCPUInformationData[i_3]);
		}
		rsbytebuffer_1.writeInt(this.rawCPUInformation2);
	}

	public SystemInfo() {
		if (GroundItemStrategy.aString8069.startsWith("win")) {
			this.operatingSystem = 1;
		} else if (GroundItemStrategy.aString8069.startsWith("mac")) {
			this.operatingSystem = 2;
		} else if (GroundItemStrategy.aString8069.startsWith("linux")) {
			this.operatingSystem = 3;
		} else {
			this.operatingSystem = 4;
		}
		if (!Class402.aString4828.startsWith("amd64") && !Class402.aString4828.startsWith("x86_64")) {
			this.x64os = false;
		} else {
			this.x64os = true;
		}
		if (this.operatingSystem == 1) {
			if (Class231.aString2876.indexOf("4.0") != -1) {
				this.osVendor = 1;
			} else if (Class231.aString2876.indexOf("4.1") != -1) {
				this.osVendor = 2;
			} else if (Class231.aString2876.indexOf("4.9") != -1) {
				this.osVendor = 3;
			} else if (Class231.aString2876.indexOf("5.0") != -1) {
				this.osVendor = 4;
			} else if (Class231.aString2876.indexOf("5.1") != -1) {
				this.osVendor = 5;
			} else if (Class231.aString2876.indexOf("5.2") != -1) {
				this.osVendor = 8;
			} else if (Class231.aString2876.indexOf("6.0") != -1) {
				this.osVendor = 6;
			} else if (Class231.aString2876.indexOf("6.1") != -1) {
				this.osVendor = 7;
			} else if (Class231.aString2876.indexOf("6.2") != -1) {
				this.osVendor = 9;
			}
		} else if (this.operatingSystem == 2) {
			if (Class231.aString2876.indexOf("10.4") != -1) {
				this.osVendor = 20;
			} else if (Class231.aString2876.indexOf("10.5") != -1) {
				this.osVendor = 21;
			} else if (Class231.aString2876.indexOf("10.6") != -1) {
				this.osVendor = 22;
			} else if (Class231.aString2876.indexOf("10.7") != -1) {
				this.osVendor = 23;
			}
		}
		if (Node_Sub20_Sub34.aString9967.toLowerCase().indexOf("sun") != -1) {
			this.javaVersion = 1;
		} else if (Node_Sub20_Sub34.aString9967.toLowerCase().indexOf("microsoft") != -1) {
			this.javaVersion = 2;
		} else if (Node_Sub20_Sub34.aString9967.toLowerCase().indexOf("apple") != -1) {
			this.javaVersion = 3;
		} else {
			this.javaVersion = 4;
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
		this.javaBuild = i_3;
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
		this.javaSubBuild = i_3;
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
		this.idk = false;
		this.maxMem = Engine.MAX_MEMORY;
		if (this.javaBuild > 3) {
			this.processors = Engine.AVAILABLE_PROCESSORS;
		} else {
			this.processors = 0;
		}
		try {
			int[] ints_14 = HardwareInfo.getCPUInfo();
			if (ints_14 != null && ints_14.length == 3) {
				this.cpuCores = ints_14[0];
				this.cpuClock = ints_14[1];
				this.ram = ints_14[2];
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
					this.cpuType = rsbytebuffer_16.readString();
				}
				Class430 class430_27 = (Class430) hashmap_6.get(Integer.valueOf(1));
				if (class430_27 != null) {
					this.rawCPUInformation2 = class430_27.anInt5139;
					i_9 = class430_27.anInt5137;
					this.rawCPUInformation = i_9 >> 16 & 0xff;
					this.rawCPUInformationData[0] = class430_27.anInt5138;
					this.rawCPUInformationData[1] = class430_27.anInt5136;
				}
				Class430 class430_17 = (Class430) hashmap_6.get(Integer.valueOf(-2147483647));
				if (class430_17 != null) {
					this.rawCPUInformationData[2] = class430_17.anInt5136;
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
				this.cpuData = rsbytebuffer_18.readString();
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
							this.dxDriverMonth = Integer.parseInt(string_28.substring(0, i_9));
							this.dxDriverYear = Integer.parseInt(string_28.substring(i_10 + 1, string_28.indexOf(" ", i_10)));
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
			this.ram = 0;
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
		if (this.cpuType == null) {
			this.cpuType = "";
		}
		if (this.cpuData == null) {
			this.cpuData = "";
		}
		this.method13455();
	}

	static final void method13466(Entity animable_0, boolean bool_1) {
		BASDefinitions renderanimdefs_3 = animable_0.getRenderAnimDefs();
		if (animable_0.anInt10355 == 0) {
			animable_0.anInt10366 = 0;
			IdentikitDefinition.anInt430 = MovementType.STATIONARY.id;
			FontRenderer_Sub1.anInt8515 = 0;
		} else {
			if (animable_0.currentAnimation.hasDefs() && !animable_0.currentAnimation.hasSpeed(584514311)) {
				AnimationDefinitions animationdefinitions_4 = animable_0.currentAnimation.getDefs();
				if (animable_0.anInt10367 > 0 && animationdefinitions_4.animatingPrecedence == 0) {
					++animable_0.anInt10366;
					IdentikitDefinition.anInt430 = MovementType.STATIONARY.id;
					FontRenderer_Sub1.anInt8515 = 0;
					return;
				}
				if (animable_0.anInt10367 <= 0 && animationdefinitions_4.walkingPrecedence == 0) {
					++animable_0.anInt10366;
					IdentikitDefinition.anInt430 = MovementType.STATIONARY.id;
					FontRenderer_Sub1.anInt8515 = 0;
					return;
				}
			}
			for (int i_18 = 0; i_18 < animable_0.spotAnims.length; i_18++) {
				if (animable_0.spotAnims[i_18].spotAnimId != -1 && animable_0.spotAnims[i_18].animation.hasSpeed(-606649252)) {
					SpotAnimDefinitions spotanimdefinitions_19 = IndexLoaders.SPOT_ANIM_LOADER.getSpotAnimDefs(animable_0.spotAnims[i_18].spotAnimId, (byte) 43);
					if (spotanimdefinitions_19.aBool6968 && spotanimdefinitions_19.animationId != -1) {
						AnimationDefinitions animationdefinitions_20 = IndexLoaders.ANIMATION_LOADER.getAnimDefs(spotanimdefinitions_19.animationId, (byte) -10);
						if (animable_0.anInt10367 > 0 && animationdefinitions_20.animatingPrecedence == 0) {
							++animable_0.anInt10366;
							IdentikitDefinition.anInt430 = MovementType.STATIONARY.id;
							FontRenderer_Sub1.anInt8515 = 0;
							return;
						}
						if (animable_0.anInt10367 <= 0 && animationdefinitions_20.walkingPrecedence == 0) {
							++animable_0.anInt10366;
							IdentikitDefinition.anInt430 = MovementType.STATIONARY.id;
							FontRenderer_Sub1.anInt8515 = 0;
							return;
						}
					}
				}
			}
			Vector3 vector3_21 = Vector3.popVectorStackTo(animable_0.method11166().coords);
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
			byte b_9 = animable_0.walkTypes[animable_0.anInt10355 - 1];
			if (bool_1 || i_7 - i_5 <= 1024 && i_7 - i_5 >= -1024 && i_8 - i_6 <= 1024 && i_8 - i_6 >= -1024) {
				int i_10 = 16;
				boolean bool_11 = true;
				if (animable_0 instanceof NPC) {
					bool_11 = ((NPC) animable_0).definitions.aBool4894;
				}
				int i_12;
				if (bool_11) {
					i_12 = animable_0.turnDirection - animable_0.aClass19_10359.turnDirection;
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
				if (b_9 == MovementType.RUNNING.id) {
					i_10 <<= 1;
				} else if (b_9 == MovementType.HALF_WALK.id) {
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
				FontRenderer_Sub1.anInt8515 = 0;
				if (i_7 == i_5 && i_8 == i_6) {
					IdentikitDefinition.anInt430 = MovementType.STATIONARY.id;
				} else {
					if (i_5 < i_7) {
						vector3_21.x += (float) i_10;
						FontRenderer_Sub1.anInt8515 |= 0x4;
						if (vector3_21.x > (float) i_7) {
							vector3_21.x = (float) i_7;
						}
					} else if (i_5 > i_7) {
						vector3_21.x -= (float) i_10;
						FontRenderer_Sub1.anInt8515 |= 0x8;
						if (vector3_21.x < (float) i_7) {
							vector3_21.x = (float) i_7;
						}
					}
					if (i_6 < i_8) {
						vector3_21.z += (float) i_10;
						FontRenderer_Sub1.anInt8515 |= 0x1;
						if (vector3_21.z > (float) i_8) {
							vector3_21.z = (float) i_8;
						}
					} else if (i_6 > i_8) {
						vector3_21.z -= (float) i_10;
						FontRenderer_Sub1.anInt8515 |= 0x2;
						if (vector3_21.z < (float) i_8) {
							vector3_21.z = (float) i_8;
						}
					}
					animable_0.method11171(vector3_21);
					if (i_10 >= 32) {
						IdentikitDefinition.anInt430 = MovementType.RUNNING.id;
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
				animable_0.turn(animable_0.turnDirection, false);
				--animable_0.anInt10355;
				if (animable_0.anInt10367 > 0) {
					--animable_0.anInt10367;
				}
				IdentikitDefinition.anInt430 = MovementType.STATIONARY.id;
				FontRenderer_Sub1.anInt8515 = 0;
				vector3_21.pushVectorStack();
			}
		}
	}
}
