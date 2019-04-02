public class WorldMapAreaDefs {

	WorldMapIndexLoader aClass218_2716;

	public int anInt2753;

	public int anInt2719 = -1;

	public int anInt2757 = -1;

	public String areaName;

	public int anInt2720;

	public int anInt2721 = -1;

	public int anInt2722 = 0;

	public boolean aBool2728 = true;

	int anInt2736 = -1;

	public boolean aBool2729 = false;

	int anInt2745 = -1;

	public boolean aBool2730 = true;

	public int[] anIntArray2717;

	int anInt2734;

	int anInt2735;

	public boolean aBool2742 = true;

	public String aString2732;

	public int anInt2715;

	public int[] anIntArray2738;

	int anInt2733 = -1;

	public int anInt2718 = -1;

	public byte[] aByteArray2754;

	int anInt2755 = -1;

	public int anInt2727;

	int anInt2741 = -1;

	public int anInt2726;

	int anInt2743;

	int anInt2739;

	public int anInt2748 = -1;

	public int anInt2749 = -1;

	public int anInt2756 = -1;

	public int anInt2750;

	public int anInt2752;

	IterableNodeMap aClass465_2737;

	public int anInt2747 = Integer.MAX_VALUE;

	public int anInt2731 = Integer.MIN_VALUE;

	public int anInt2744 = Integer.MAX_VALUE;

	public int anInt2746 = Integer.MIN_VALUE;

	public String[] aStringArray2740 = new String[5];

	void method3716(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.method3717(rsbytebuffer_1, i_3);
		}
	}

	void method3717(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.anInt2719 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 2) {
			this.anInt2757 = rsbytebuffer_1.readBigSmart();
		} else if (i_2 == 3) {
			this.areaName = rsbytebuffer_1.readString();
		} else if (i_2 == 4) {
			this.anInt2720 = rsbytebuffer_1.read24BitUnsignedInteger();
		} else if (i_2 == 5) {
			this.anInt2721 = rsbytebuffer_1.read24BitUnsignedInteger();
		} else if (i_2 == 6) {
			this.anInt2722 = rsbytebuffer_1.readUnsignedByte();
		} else {
			int i_4;
			if (i_2 == 7) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				if ((i_4 & 0x1) == 0) {
					this.aBool2728 = false;
				}
				if ((i_4 & 0x2) == 2) {
					this.aBool2729 = true;
				}
			} else if (i_2 == 8) {
				this.aBool2730 = rsbytebuffer_1.readUnsignedByte() == 1;
			} else if (i_2 == 9) {
				this.anInt2736 = rsbytebuffer_1.readUnsignedShort();
				if (this.anInt2736 == 65535) {
					this.anInt2736 = -1;
				}
				this.anInt2745 = rsbytebuffer_1.readUnsignedShort();
				if (this.anInt2745 == 65535) {
					this.anInt2745 = -1;
				}
				this.anInt2734 = rsbytebuffer_1.readInt();
				this.anInt2735 = rsbytebuffer_1.readInt();
			} else if (i_2 >= 10 && i_2 <= 14) {
				this.aStringArray2740[i_2 - 10] = rsbytebuffer_1.readString();
			} else {
				int i_5;
				if (i_2 == 15) {
					i_4 = rsbytebuffer_1.readUnsignedByte();
					this.anIntArray2717 = new int[i_4 * 2];
					for (i_5 = 0; i_5 < i_4 * 2; i_5++) {
						this.anIntArray2717[i_5] = rsbytebuffer_1.readShort();
					}
					this.anInt2715 = rsbytebuffer_1.readInt();
					i_5 = rsbytebuffer_1.readUnsignedByte();
					this.anIntArray2738 = new int[i_5];
					int i_6;
					for (i_6 = 0; i_6 < this.anIntArray2738.length; i_6++) {
						this.anIntArray2738[i_6] = rsbytebuffer_1.readInt();
					}
					this.aByteArray2754 = new byte[i_4];
					for (i_6 = 0; i_6 < i_4; i_6++) {
						this.aByteArray2754[i_6] = rsbytebuffer_1.readByte();
					}
				} else if (i_2 == 16) {
					this.aBool2742 = false;
				} else if (i_2 == 17) {
					this.aString2732 = rsbytebuffer_1.readString();
				} else if (i_2 == 18) {
					this.anInt2733 = rsbytebuffer_1.readBigSmart();
				} else if (i_2 == 19) {
					this.anInt2718 = rsbytebuffer_1.readUnsignedShort();
				} else if (i_2 == 20) {
					this.anInt2755 = rsbytebuffer_1.readUnsignedShort();
					if (this.anInt2755 == 65535) {
						this.anInt2755 = -1;
					}
					this.anInt2741 = rsbytebuffer_1.readUnsignedShort();
					if (this.anInt2741 == 65535) {
						this.anInt2741 = -1;
					}
					this.anInt2743 = rsbytebuffer_1.readInt();
					this.anInt2739 = rsbytebuffer_1.readInt();
				} else if (i_2 == 21) {
					this.anInt2727 = rsbytebuffer_1.readInt();
				} else if (i_2 == 22) {
					this.anInt2726 = rsbytebuffer_1.readInt();
				} else if (i_2 == 23) {
					this.anInt2748 = rsbytebuffer_1.readUnsignedByte();
					this.anInt2749 = rsbytebuffer_1.readUnsignedByte();
					this.anInt2756 = rsbytebuffer_1.readUnsignedByte();
				} else if (i_2 == 24) {
					this.anInt2750 = rsbytebuffer_1.readShort();
					this.anInt2752 = rsbytebuffer_1.readShort();
				} else if (i_2 == 249) {
					i_4 = rsbytebuffer_1.readUnsignedByte();
					if (this.aClass465_2737 == null) {
						i_5 = Texture.nextPowerOfTwo(i_4, -417308135);
						this.aClass465_2737 = new IterableNodeMap(i_5);
					}
					for (i_5 = 0; i_5 < i_4; i_5++) {
						boolean bool_9 = rsbytebuffer_1.readUnsignedByte() == 1;
						int i_7 = rsbytebuffer_1.read24BitUnsignedInteger();
						Object obj_8;
						if (bool_9) {
							obj_8 = new Class282_Sub47(rsbytebuffer_1.readString());
						} else {
							obj_8 = new Class282_Sub38(rsbytebuffer_1.readInt());
						}
						this.aClass465_2737.put((Node) obj_8, (long) i_7);
					}
				}
			}
		}
	}

	void method3718() {
		if (this.anIntArray2717 != null) {
			for (int i_2 = 0; i_2 < this.anIntArray2717.length; i_2 += 2) {
				if (this.anIntArray2717[i_2] < this.anInt2747) {
					this.anInt2747 = this.anIntArray2717[i_2];
				} else if (this.anIntArray2717[i_2] > this.anInt2731) {
					this.anInt2731 = this.anIntArray2717[i_2];
				}
				if (this.anIntArray2717[i_2 + 1] < this.anInt2744) {
					this.anInt2744 = this.anIntArray2717[i_2 + 1];
				} else if (this.anIntArray2717[i_2 + 1] > this.anInt2746) {
					this.anInt2746 = this.anIntArray2717[i_2 + 1];
				}
			}
		}
	}

	public boolean method3719(Interface42 interface42_1, int i_2) {
		int i_3;
		if (this.anInt2745 != -1) {
			i_3 = interface42_1.method240(this.anInt2745, 1482918340);
		} else {
			if (this.anInt2736 == -1) {
				return true;
			}
			i_3 = interface42_1.method241(this.anInt2736, 1874672884);
		}
		if (i_3 >= this.anInt2734 && i_3 <= this.anInt2735) {
			boolean bool_4 = false;
			int i_5;
			if (this.anInt2741 != -1) {
				i_5 = interface42_1.method240(this.anInt2741, 873480521);
			} else {
				if (this.anInt2755 == -1) {
					return true;
				}
				i_5 = interface42_1.method241(this.anInt2755, 1556323126);
			}
			return i_5 >= this.anInt2743 && i_5 <= this.anInt2739;
		} else {
			return false;
		}
	}

	public String method3722(int i_1, String string_2) {
		if (this.aClass465_2737 == null) {
			return string_2;
		} else {
			Class282_Sub47 class282_sub47_4 = (Class282_Sub47) this.aClass465_2737.get((long) i_1);
			return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
		}
	}

	public int method3723(int i_1, int i_2) {
		if (this.aClass465_2737 == null) {
			return i_2;
		} else {
			Class282_Sub38 class282_sub38_4 = (Class282_Sub38) this.aClass465_2737.get((long) i_1);
			return class282_sub38_4 == null ? i_2 : class282_sub38_4.anInt8002;
		}
	}

	public NativeSprite method3729(GraphicalRenderer graphicalrenderer_1) {
		NativeSprite nativesprite_3 = (NativeSprite) this.aClass218_2716.aClass229_2708.get((long) (this.anInt2733 | 0x20000 | graphicalrenderer_1.rendererId << 29));
		if (nativesprite_3 != null) {
			return nativesprite_3;
		} else {
			this.aClass218_2716.aClass317_2703.loadCutscene(this.anInt2733);
			Class91 class91_4 = Class91.method1522(this.aClass218_2716.aClass317_2703, this.anInt2733, 0);
			if (class91_4 != null) {
				nativesprite_3 = graphicalrenderer_1.method8444(class91_4, true);
				this.aClass218_2716.aClass229_2708.put(nativesprite_3, (long) (this.anInt2733 | 0x20000 | graphicalrenderer_1.rendererId << 29));
			}
			return nativesprite_3;
		}
	}

	public NativeSprite renderIcons(GraphicalRenderer graphicalrenderer_1, boolean bool_2) {
		int i_4 = bool_2 ? this.anInt2757 : this.anInt2719;
		int i_5 = i_4 | graphicalrenderer_1.rendererId << 29;
		NativeSprite nativesprite_6 = (NativeSprite) this.aClass218_2716.aClass229_2708.get((long) i_5);
		if (nativesprite_6 != null) {
			return nativesprite_6;
		} else if (!this.aClass218_2716.aClass317_2703.loadCutscene(i_4)) {
			return null;
		} else {
			Class91 class91_7 = Class91.method1522(this.aClass218_2716.aClass317_2703, i_4, 0);
			if (class91_7 != null) {
				nativesprite_6 = graphicalrenderer_1.method8444(class91_7, true);
				this.aClass218_2716.aClass229_2708.put(nativesprite_6, (long) i_5);
			}
			return nativesprite_6;
		}
	}

	static void method3736(NPC npc_0, boolean bool_1, int i_2) {
		if (Class20.anInt169 < 412) {
			NPCDefinitions npcdefinitions_3 = npc_0.definitions;
			String string_4 = npc_0.aString10584;
			if (npcdefinitions_3.transformTo != null) {
				npcdefinitions_3 = npcdefinitions_3.method6884(Class158_Sub1.PLAYER_VAR_PROVIDER);
				if (npcdefinitions_3 == null) {
					return;
				}
				string_4 = npcdefinitions_3.name;
			}
			if (npcdefinitions_3.aBool4893) {
				if (npc_0.anInt10582 != 0) {
					String string_5 = client.CURRENT_GAME == Game.stellarDawn ? Message.RATING_.translate(Class223.CURRENT_LANGUAGE, -834706251) : Message.LEVEL_.translate(Class223.CURRENT_LANGUAGE, -2066176113);
					string_4 = string_4 + ItemIndexLoader.method7169(npc_0.anInt10582, VertexNormal.myPlayer.anInt10565, -1957998512) + " (" + string_5 + npc_0.anInt10582 + ")";
				}
				if (client.aBool7344 && !bool_1) {
					ParamDefinitions attributedefault_10 = Class96_Sub12.anInt9319 != -1 ? IndexLoaders.ITEM_DEFAULTS.method7069(Class96_Sub12.anInt9319) : null;
					if ((Class506.anInt5858 & 0x2) != 0 && (attributedefault_10 == null || npcdefinitions_3.method6876(Class96_Sub12.anInt9319, attributedefault_10.defaultInt, 130038001) != attributedefault_10.defaultInt)) {
						PlayerAppearance.method4032(client.aString7275, client.aString7356 + " " + "->" + " " + ParticleProducerDefinition.method1163(16776960) + string_4, Defaults8Loader.anInt5932, 8, -1, (long) npc_0.index, 0, 0, true, false, (long) npc_0.index, false, -1728725165);
					}
				}
				if (!bool_1) {
					String[] arr_11 = npcdefinitions_3.options;
					if (client.aBool7264) {
						arr_11 = Class362.method6277(arr_11);
					}
					if (arr_11 != null) {
						int i_6;
						short s_7;
						for (i_6 = arr_11.length - 1; i_6 >= 0; --i_6) {
							if (arr_11[i_6] != null && (npcdefinitions_3.aByte4916 == 0 || !arr_11[i_6].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -1264290338)) && !arr_11[i_6].equalsIgnoreCase(Message.EXAMINE.translate(Class223.CURRENT_LANGUAGE, -1819151765)))) {
								s_7 = 0;
								int i_8 = client.anInt7342;
								if (i_6 == 0) {
									s_7 = 9;
								}
								if (i_6 == 1) {
									s_7 = 10;
								}
								if (i_6 == 2) {
									s_7 = 11;
								}
								if (i_6 == 3) {
									s_7 = 12;
								}
								if (i_6 == 4) {
									s_7 = 13;
								}
								if (i_6 == 5) {
									s_7 = 1003;
								}
								if (i_6 == npcdefinitions_3.anInt4875) {
									i_8 = npcdefinitions_3.anInt4873;
								}
								if (i_6 == npcdefinitions_3.anInt4854) {
									i_8 = npcdefinitions_3.anInt4861;
								}
								PlayerAppearance.method4032(arr_11[i_6], ParticleProducerDefinition.method1163(16776960) + string_4, arr_11[i_6].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -422947170)) ? npcdefinitions_3.anInt4877 : i_8, s_7, -1, (long) npc_0.index, 0, 0, true, false, (long) npc_0.index, false, -1773453670);
							}
						}
						if (npcdefinitions_3.aByte4916 == 1) {
							for (i_6 = 0; i_6 < arr_11.length; i_6++) {
								if (arr_11[i_6] != null && (arr_11[i_6].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -436851003)) || arr_11[i_6].equalsIgnoreCase(Message.EXAMINE.translate(Class223.CURRENT_LANGUAGE, -473516287)))) {
									s_7 = 0;
									if (npc_0.anInt10582 > VertexNormal.myPlayer.anInt10565) {
										s_7 = 2000;
									}
									short s_12 = 0;
									int i_9 = client.anInt7342;
									if (i_6 == 0) {
										s_12 = 9;
									}
									if (i_6 == 1) {
										s_12 = 10;
									}
									if (i_6 == 2) {
										s_12 = 11;
									}
									if (i_6 == 3) {
										s_12 = 12;
									}
									if (i_6 == 4) {
										s_12 = 13;
									}
									if (i_6 == 5) {
										s_12 = 1003;
									}
									if (s_12 != 0) {
										s_12 += s_7;
									}
									if (i_6 == npcdefinitions_3.anInt4875) {
										i_9 = npcdefinitions_3.anInt4873;
									}
									if (i_6 == npcdefinitions_3.anInt4854) {
										i_9 = npcdefinitions_3.anInt4861;
									}
									PlayerAppearance.method4032(arr_11[i_6], ParticleProducerDefinition.method1163(16776960) + string_4, arr_11[i_6].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -1997310478)) ? npcdefinitions_3.anInt4877 : i_9, s_12, -1, (long) npc_0.index, 0, 0, true, false, (long) npc_0.index, false, -1021673171);
								}
							}
						}
					}
				}
			}
		}
	}

	static final void method3738(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2) {
		cs2executor_2.intStackPtr -= 2;
		int i_4 = cs2executor_2.intStack[cs2executor_2.intStackPtr];
		int i_5 = cs2executor_2.intStack[cs2executor_2.intStackPtr + 1];
		if (i_4 == -1 && i_5 == -1) {
			icomponentdefinitions_0.aClass118_1379 = null;
		} else {
			icomponentdefinitions_0.aClass118_1379 = Index.method5694(i_4, i_5, 551266570);
		}
	}

	public static String method3741() {
		String str_1 = "www";
		if (Class496.aClass496_5811 == HDWaterTile.aClass496_952) {
			str_1 = "www-wtrc";
		} else if (Class496.aClass496_5808 == HDWaterTile.aClass496_952) {
			str_1 = "www-wtqa";
		} else if (Class496.aClass496_5807 == HDWaterTile.aClass496_952) {
			str_1 = "www-wtwip";
		} else if (HDWaterTile.aClass496_952 == Class496.aClass496_5809) {
			str_1 = "www-wti";
		}
		String str_2 = "";
		if (client.aString7281 != null) {
			str_2 = "/p=" + client.aString7281;
		}
		String string_3 = client.CURRENT_GAME.aString5748 + ".com";
		return "http://" + str_1 + "." + string_3 + "/l=" + Class223.CURRENT_LANGUAGE + "/a=" + client.anInt7149 + str_2 + "/";
	}

	static boolean renderIconsAndNames(GraphicalRenderer graphicalrenderer_0, Class282_Sub36 class282_sub36_1, WorldMapAreaDefs worldmapareadefs_2) {
		int i_6 = Integer.MAX_VALUE;
		int i_7 = Integer.MIN_VALUE;
		int i_8 = Integer.MAX_VALUE;
		int i_9 = Integer.MIN_VALUE;
		if (worldmapareadefs_2.anIntArray2717 != null) {
			i_6 = (Class291_Sub1.anInt3476 - Class291_Sub1.anInt3489) * (worldmapareadefs_2.anInt2747 + class282_sub36_1.anInt7987 - Class291_Sub1.anInt3485) / (Class291_Sub1.anInt3480 - Class291_Sub1.anInt3485) + Class291_Sub1.anInt3489;
			i_7 = Class291_Sub1.anInt3489 + (Class291_Sub1.anInt3476 - Class291_Sub1.anInt3489) * (worldmapareadefs_2.anInt2731 + class282_sub36_1.anInt7987 - Class291_Sub1.anInt3485) / (Class291_Sub1.anInt3480 - Class291_Sub1.anInt3485);
			i_9 = Class291_Sub1.anInt3492 - (Class291_Sub1.anInt3492 - Class291_Sub1.anInt3490) * (worldmapareadefs_2.anInt2744 + class282_sub36_1.anInt7993 - Class291_Sub1.anInt3465) / (Class291_Sub1.anInt3486 - Class291_Sub1.anInt3465);
			i_8 = Class291_Sub1.anInt3492 - (Class291_Sub1.anInt3492 - Class291_Sub1.anInt3490) * (worldmapareadefs_2.anInt2746 + class282_sub36_1.anInt7993 - Class291_Sub1.anInt3465) / (Class291_Sub1.anInt3486 - Class291_Sub1.anInt3465);
		}
		NativeSprite nativesprite_10 = null;
		int i_11 = 0;
		int i_12 = 0;
		int i_13 = 0;
		int i_14 = 0;
		if (worldmapareadefs_2.anInt2719 != -1) {
			if (class282_sub36_1.aBool7989 && worldmapareadefs_2.anInt2757 != -1) {
				nativesprite_10 = worldmapareadefs_2.renderIcons(graphicalrenderer_0, true);
			} else {
				nativesprite_10 = worldmapareadefs_2.renderIcons(graphicalrenderer_0, false);
			}
			if (nativesprite_10 != null) {
				i_11 = class282_sub36_1.anInt7990 - (nativesprite_10.method228() + 1 >> 1);
				if (i_11 < i_6) {
					i_6 = i_11;
				}
				i_12 = class282_sub36_1.anInt7990 + (nativesprite_10.method228() + 1 >> 1);
				if (i_12 > i_7) {
					i_7 = i_12;
				}
				i_13 = class282_sub36_1.anInt7992 - (nativesprite_10.method2748() + 1 >> 1);
				if (i_13 < i_8) {
					i_8 = i_13;
				}
				i_14 = class282_sub36_1.anInt7992 + (nativesprite_10.method2748() + 1 >> 1);
				if (i_14 > i_9) {
					i_9 = i_14;
				}
			}
		}
		Class194 class194_15 = null;
		int i_16 = 0;
		int i_17 = 0;
		int i_18 = 0;
		int i_19 = 0;
		int i_20 = 0;
		int i_21 = 0;
		int i_22 = 0;
		int i_23 = 0;
		int i_24;
		if (worldmapareadefs_2.areaName != null) {
			class194_15 = Class286.method5048(worldmapareadefs_2.anInt2722);
			if (class194_15 != null) {
				i_16 = Class282_Sub17_Sub2.aClass414_9933.method6987(worldmapareadefs_2.areaName, (int[]) null, Class291_Sub1.aStringArray8024, (Sprite[]) null);
				i_17 = (Class291_Sub1.anInt3476 - Class291_Sub1.anInt3489) * worldmapareadefs_2.anInt2750 / (Class291_Sub1.anInt3480 - Class291_Sub1.anInt3485) + class282_sub36_1.anInt7990;
				i_18 = class282_sub36_1.anInt7992 - (Class291_Sub1.anInt3492 - Class291_Sub1.anInt3490) * worldmapareadefs_2.anInt2752 / (Class291_Sub1.anInt3486 - Class291_Sub1.anInt3465);
				if (nativesprite_10 == null) {
					i_18 -= class194_15.method3186() * i_16 / 2;
				} else {
					i_18 -= (nativesprite_10.method2748() >> 1) + class194_15.method3173() * i_16;
				}
				for (i_24 = 0; i_24 < i_16; i_24++) {
					String string_25 = Class291_Sub1.aStringArray8024[i_24];
					if (i_24 < i_16 - 1) {
						string_25 = string_25.substring(0, string_25.length() - 4);
					}
					int i_26 = class194_15.method3177(string_25);
					if (i_26 > i_19) {
						i_19 = i_26;
					}
				}
				i_20 = 0 + (i_17 - i_19 / 2);
				if (i_20 < i_6) {
					i_6 = i_20;
				}
				i_21 = 0 + i_19 / 2 + i_17;
				if (i_21 > i_7) {
					i_7 = i_21;
				}
				i_22 = i_18 + 0;
				if (i_22 < i_8) {
					i_8 = i_22;
				}
				i_23 = i_18 + i_16 * class194_15.method3173() + 0;
				if (i_23 > i_9) {
					i_9 = i_23;
				}
			}
		}
		if (i_7 >= Class291_Sub1.anInt3489 && i_6 <= Class291_Sub1.anInt3476 && i_9 >= Class291_Sub1.anInt3490 && i_8 <= Class291_Sub1.anInt3492) {
			Class291_Sub1.method5147(graphicalrenderer_0, class282_sub36_1, worldmapareadefs_2);
			if (nativesprite_10 != null) {
				if (Class361.anInt4185 > 0 && (Class291_Sub1.anInt8018 != -1 && Class291_Sub1.anInt8018 == class282_sub36_1.anInt7991 || Class291_Sub1.anInt8026 != -1 && worldmapareadefs_2.anInt2718 == Class291_Sub1.anInt8026)) {
					if (Class96_Sub9.anInt9282 > 50) {
						i_24 = 200 - Class96_Sub9.anInt9282 * 2;
					} else {
						i_24 = Class96_Sub9.anInt9282 * 2;
					}
					int i_27 = i_24 << 24 | 0xffff00;
					graphicalrenderer_0.method8468(class282_sub36_1.anInt7990, class282_sub36_1.anInt7992, nativesprite_10.method2747() / 2 + 7, i_27, 1444193569);
					graphicalrenderer_0.method8468(class282_sub36_1.anInt7990, class282_sub36_1.anInt7992, nativesprite_10.method2747() / 2 + 5, i_27, -1310024744);
					graphicalrenderer_0.method8468(class282_sub36_1.anInt7990, class282_sub36_1.anInt7992, nativesprite_10.method2747() / 2 + 3, i_27, -333030920);
					graphicalrenderer_0.method8468(class282_sub36_1.anInt7990, class282_sub36_1.anInt7992, nativesprite_10.method2747() / 2 + 1, i_27, 283633810);
					graphicalrenderer_0.method8468(class282_sub36_1.anInt7990, class282_sub36_1.anInt7992, nativesprite_10.method2747() / 2, i_27, -1440374921);
				}
				nativesprite_10.method2752(class282_sub36_1.anInt7990 - (nativesprite_10.method228() >> 1), class282_sub36_1.anInt7992 - (nativesprite_10.method2748() >> 1));
			}
			if (worldmapareadefs_2.areaName != null && class194_15 != null) {
				InventoriesIndexLoader.renderAreaText(graphicalrenderer_0, class282_sub36_1, worldmapareadefs_2, i_16, i_17, i_18, i_19, class194_15);
			}
			if (worldmapareadefs_2.anInt2719 != -1 || worldmapareadefs_2.areaName != null) {
				Class282_Sub33 class282_sub33_28 = new Class282_Sub33(class282_sub36_1);
				class282_sub33_28.anInt7830 = i_11;
				class282_sub33_28.anInt7828 = i_12;
				class282_sub33_28.anInt7834 = i_13;
				class282_sub33_28.anInt7833 = i_14;
				class282_sub33_28.anInt7829 = i_20;
				class282_sub33_28.anInt7832 = i_21;
				class282_sub33_28.anInt7831 = i_22;
				class282_sub33_28.anInt7827 = i_23;
				Class346.aClass482_4049.append(class282_sub33_28);
			}
			return false;
		} else {
			return true;
		}
	}
}
