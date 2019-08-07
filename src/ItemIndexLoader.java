public class ItemIndexLoader implements IndexLoader {

	boolean membersOnly;
	int anInt5116;
	SoftCache cache = new SoftCache(64);
	SoftCache aClass229_5115 = new SoftCache(50);
	public Class212 aClass212_5114 = new Class212();
	SoftwareItemRender softwareItemRender = new SoftwareItemRender();
	Game game;
	Language language;
	ParamIndexLoader attrDefaults;
	Index fs19;
	Index meshIndex;
	public int maxItemsCount;
	String[] defaultGroundOptions;
	String[] defaultInventoryOptions;

	public ItemDefinitions getItemDefinitions(int i_1) {
		SoftCache softcache_4 = this.cache;
		ItemDefinitions itemdefinitions_3;
		synchronized (this.cache) {
			itemdefinitions_3 = (ItemDefinitions) this.cache.get((long) i_1);
		}

		if (itemdefinitions_3 != null) {
			return itemdefinitions_3;
		} else {
			Index index_5 = this.fs19;
			byte[] bytes_12;
			synchronized (this.fs19) {
				bytes_12 = this.fs19.getFile(SharedConfigsType.ITEMS.containerId(i_1), SharedConfigsType.ITEMS.fileId(i_1));
			}

			itemdefinitions_3 = new ItemDefinitions();
			itemdefinitions_3.loader = this;
			itemdefinitions_3.id = i_1;
			itemdefinitions_3.groundOptions = (String[]) this.defaultGroundOptions.clone();
			itemdefinitions_3.inventoryOptions = (String[]) this.defaultInventoryOptions.clone();
			if (bytes_12 != null) {
				itemdefinitions_3.decode(new RsByteBuffer(bytes_12));
			}

			itemdefinitions_3.postDecode();
			if (itemdefinitions_3.certTemplateId != -1) {
				itemdefinitions_3.generateCert(this.getItemDefinitions(itemdefinitions_3.certTemplateId), this.getItemDefinitions(itemdefinitions_3.certId));
			}

			if (itemdefinitions_3.lendTemplateId != -1) {
				itemdefinitions_3.generateLend(this.getItemDefinitions(itemdefinitions_3.lendTemplateId), this.getItemDefinitions(itemdefinitions_3.lendId));
			}

			if (itemdefinitions_3.bindTemplateId != -1) {
				itemdefinitions_3.generateBind(this.getItemDefinitions(itemdefinitions_3.bindTemplateId), this.getItemDefinitions(itemdefinitions_3.bindId));
			}

			if (!this.membersOnly && itemdefinitions_3.membersOnly) {
				itemdefinitions_3.teamId = 0;
				itemdefinitions_3.groundOptions = this.defaultGroundOptions;
				itemdefinitions_3.inventoryOptions = this.defaultInventoryOptions;
				itemdefinitions_3.grandExchange = false;
				itemdefinitions_3.quests = null;
				if (itemdefinitions_3.cs2Map != null) {
					boolean bool_8 = false;
					for (Node node_6 = itemdefinitions_3.cs2Map.method7750(-778830741); node_6 != null; node_6 = itemdefinitions_3.cs2Map.method7751((byte) 57)) {
						ParamDefinitions param = this.attrDefaults.getParam((int) node_6.data);
						if (param.autoDisable) {
							node_6.remove();
						} else {
							bool_8 = true;
						}
					}

					if (!bool_8) {
						itemdefinitions_3.cs2Map = null;
					}
				}
			}

			SoftCache softcache_13 = this.cache;
			synchronized (this.cache) {
				this.cache.put(itemdefinitions_3, (long) i_1);
				return itemdefinitions_3;
			}
		}
	}

	public NativeSprite getSprite(GraphicalRenderer graphicalrenderer_1, GraphicalRenderer graphicalrenderer_2, int i_3, int i_4, int i_5, int i_6, boolean bool_7, boolean bool_8, int i_9, FontRenderer fontrenderer_10, PlayerAppearance playerappearance_11, byte b_12) {
		if (!bool_8) {
			NativeSprite nativesprite_13 = this.softwareRender(graphicalrenderer_2, i_3, i_4, i_5, i_6, i_9, playerappearance_11);
			if (nativesprite_13 != null) {
				return nativesprite_13;
			}
		}

		ItemDefinitions itemdefinitions_19 = this.getItemDefinitions(i_3);
		if (i_4 > 1 && itemdefinitions_19.stackIds != null) {
			int i_14 = -1;

			for (int i_15 = 0; i_15 < 10; i_15++) {
				if (i_4 >= itemdefinitions_19.stackAmounts[i_15] && itemdefinitions_19.stackAmounts[i_15] != 0) {
					i_14 = itemdefinitions_19.stackIds[i_15];
				}
			}

			if (i_14 != -1) {
				itemdefinitions_19 = this.getItemDefinitions(i_14);
			}
		}

		int[] ints_17 = itemdefinitions_19.getSprite(graphicalrenderer_1, graphicalrenderer_2, i_4, i_5, i_6, bool_7, i_9, fontrenderer_10, playerappearance_11, (short) 255);
		if (ints_17 == null) {
			return null;
		} else {
			NativeSprite nativesprite_18;
			if (bool_8) {
				nativesprite_18 = graphicalrenderer_1.createNativeSprite(ints_17, 36, 36, 32, -1903449230);
			} else {
				nativesprite_18 = graphicalrenderer_2.createNativeSprite(ints_17, 36, 36, 32, -923043708);
			}

			if (!bool_8) {
				SoftwareItemRender softwareitemrender_16 = new SoftwareItemRender();
				softwareitemrender_16.rendererId = graphicalrenderer_2.rendererId;
				softwareitemrender_16.itemId = i_3;
				softwareitemrender_16.itemAmount = i_4;
				softwareitemrender_16.outlineSize = i_5;
				softwareitemrender_16.shadowColor = i_6;
				softwareitemrender_16.renderStack = i_9;
				softwareitemrender_16.hasPlayerAppearance = playerappearance_11 != null;
				this.aClass212_5114.method3644(nativesprite_18, softwareitemrender_16);
			}

			return nativesprite_18;
		}
	}

	public void method7148(boolean bool_1) {
		if (this.membersOnly != bool_1) {
			this.membersOnly = bool_1;
			this.method7150(-2095377821);
		}

	}

	public void method7150(int i_1) {
		SoftCache softcache_2 = this.cache;
		synchronized (this.cache) {
			this.cache.method3859();
		}

		softcache_2 = this.aClass229_5115;
		synchronized (this.aClass229_5115) {
			this.aClass229_5115.method3859();
		}

		Class212 class212_6 = this.aClass212_5114;
		synchronized (this.aClass212_5114) {
			this.aClass212_5114.method3638();
		}
	}

	public void method7151(byte b_1) {
		Class212 class212_2 = this.aClass212_5114;
		synchronized (this.aClass212_5114) {
			this.aClass212_5114.method3638();
		}
	}

	public void method7152() {
		SoftCache softcache_2 = this.aClass229_5115;
		synchronized (this.aClass229_5115) {
			this.aClass229_5115.method3859();
		}
	}

	public void method7153(int i_1) {
		this.anInt5116 = i_1;
		SoftCache softcache_3 = this.aClass229_5115;
		synchronized (this.aClass229_5115) {
			this.aClass229_5115.method3859();
		}
	}

	public void method7156() {
		SoftCache softcache_3 = this.cache;
		synchronized (this.cache) {
			this.cache.method3858(5);
		}

		softcache_3 = this.aClass229_5115;
		synchronized (this.aClass229_5115) {
			this.aClass229_5115.method3858(5);
		}

		Class212 class212_7 = this.aClass212_5114;
		synchronized (this.aClass212_5114) {
			this.aClass212_5114.method3639();
		}
	}

	public ItemIndexLoader(Game game_1, Language xlanguage_2, ParamIndexLoader itemdefaultsloader_4, Index index_5, Index index_6) {
		this.game = game_1;
		this.language = xlanguage_2;
		this.membersOnly = true;
		this.attrDefaults = itemdefaultsloader_4;
		this.fs19 = index_5;
		this.meshIndex = index_6;
		if (this.fs19 != null) {
			int i_7 = this.fs19.containersCount() - 1;
			this.maxItemsCount = i_7 * SharedConfigsType.ITEMS.filesPerContainer() + this.fs19.filesCount(i_7);
		} else {
			this.maxItemsCount = 0;
		}

		if (this.game == Game.darkan) {
			this.defaultGroundOptions = new String[] { null, null, Message.TAKE.translate(this.language), null, null, Message.EXAMINE.translate(this.language) };
		} else {
			this.defaultGroundOptions = new String[] { null, null, Message.TAKE.translate(this.language), null, null, null };
		}

		this.defaultInventoryOptions = new String[] { null, null, null, null, Message.DROP.translate(this.language) };
	}

	public NativeSprite softwareRender(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, int i_5, int i_6, PlayerAppearance playerappearance_7) {
		this.softwareItemRender.rendererId = graphicalrenderer_1.rendererId;
		this.softwareItemRender.itemId = i_2;
		this.softwareItemRender.itemAmount = i_3;
		this.softwareItemRender.outlineSize = i_4;
		this.softwareItemRender.shadowColor = i_5;
		this.softwareItemRender.renderStack = i_6;
		this.softwareItemRender.hasPlayerAppearance = playerappearance_7 != null;
		return (NativeSprite) this.aClass212_5114.method3654(this.softwareItemRender);
	}

	public void method7166() {
		SoftCache softcache_2 = this.cache;
		synchronized (this.cache) {
			this.cache.method3863();
		}

		softcache_2 = this.aClass229_5115;
		synchronized (this.aClass229_5115) {
			this.aClass229_5115.method3863();
		}

		Class212 class212_6 = this.aClass212_5114;
		synchronized (this.aClass212_5114) {
			this.aClass212_5114.method3641();
		}
	}

	static String method7169(int i_0, int i_1, int i_2) {
		int i_3 = i_1 - i_0;
		return i_3 < -9 ? Utils.rgbToColHexShortcut(16711680) : (i_3 < -6 ? Utils.rgbToColHexShortcut(16723968) : (i_3 < -3 ? Utils.rgbToColHexShortcut(16740352) : (i_3 < 0 ? Utils.rgbToColHexShortcut(16756736) : (i_3 > 9 ? Utils.rgbToColHexShortcut(65280) : (i_3 > 6 ? Utils.rgbToColHexShortcut(4259584) : (i_3 > 3 ? Utils.rgbToColHexShortcut(8453888) : (i_3 > 0 ? Utils.rgbToColHexShortcut(12648192) : Utils.rgbToColHexShortcut(16776960))))))));
	}

	static void method7170(int i_0) {
		if (Class5.anIntArray36 == null || Class5.anIntArray36.length < i_0) {
			Class5.anIntArray36 = new int[i_0];
		}

	}

	static String method7171(IComponentDefinitions icomponentdefinitions_0, int i_1, byte b_2) {
		return !client.getIComponentSettings(icomponentdefinitions_0).clickOptionEnabled(i_1) && icomponentdefinitions_0.params == null ? null : (icomponentdefinitions_0.optionNames != null && icomponentdefinitions_0.optionNames.length > i_1 && icomponentdefinitions_0.optionNames[i_1] != null && icomponentdefinitions_0.optionNames[i_1].trim().length() != 0 ? icomponentdefinitions_0.optionNames[i_1] : (client.aBool7168 ? "Hidden-" + i_1 : null));
	}

}
