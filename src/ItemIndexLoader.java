/* Class426 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemIndexLoader implements IndexLoader {
	Game game;
	Language language;
	boolean membersOnly;
	Index fs19;
	String[] defaultInventoryOptions;
	public int maxItemsCount;
	SoftCache cache = new SoftCache(64);
	String[] defaultGroundOptions;
	Index meshIndex;
	SoftwareItemRender softwareItemRender;
	ItemDefaultsLoader attrDefaults;
	public Class212 aClass212_5114;
	SoftCache aClass229_5115 = new SoftCache(50);
	int anInt5116;

	public ItemDefinitions getItemDefinitions(int itemId, int i_0_) {
		ItemDefinitions defs;
		synchronized (((ItemIndexLoader) this).cache) {
			defs = ((ItemDefinitions) ((ItemIndexLoader) this).cache.get((long) itemId));
		}
		if (defs != null)
			return defs;
		byte[] data;
		synchronized (((ItemIndexLoader) this).fs19) {
			data = (((ItemIndexLoader) this).fs19.getFile(SharedConfigsType.ITEM_DEFINITIONS.containerId(itemId), SharedConfigsType.ITEM_DEFINITIONS.fileId(itemId)));
		}
		defs = new ItemDefinitions();
		defs.loader = this;
		defs.id = itemId * -2098132987;
		defs.groundOptions = (String[]) ((ItemIndexLoader) this).defaultGroundOptions.clone();
		defs.inventoryOptions = (String[]) ((ItemIndexLoader) this).defaultInventoryOptions.clone();
		if (null != data)
			defs.decode(new RsByteBuffer(data), -176434754);
		defs.postDecode(-1924179762);
		if (-722914683 * defs.certTemplateId != -1)
			defs.generateCert(getItemDefinitions(-722914683 * defs.certTemplateId, 1167906942), getItemDefinitions(1416589415 * defs.certId, 1245595517), -1715219620);
		if (-1 != defs.landTemplateId * -1203090775)
			defs.generateLend(getItemDefinitions(defs.landTemplateId * -1203090775, 294444778), getItemDefinitions((defs.lendId * -14763883), 1908925068), -1404615542);
		if (defs.bindTemplateId * 370155889 != -1)
			defs.generateBind(getItemDefinitions(370155889 * defs.bindTemplateId, 828359432), getItemDefinitions((defs.bindId * 224116893), 1928714230), 1201532175);
		if (!((ItemIndexLoader) this).membersOnly && defs.members) {
			defs.team = 0;
			defs.groundOptions = ((ItemIndexLoader) this).defaultGroundOptions;
			defs.inventoryOptions = ((ItemIndexLoader) this).defaultInventoryOptions;
			defs.grandExchange = false;
			defs.quests = null;
			if (defs.cs2Map != null) {
				boolean bool = false;
				for (Node class282 = defs.cs2Map.method7750(-778830741); class282 != null; class282 = defs.cs2Map.method7751((byte) 57)) {
					AttributeDefault class437 = (((ItemIndexLoader) this).attrDefaults.method7069((int) (class282.data * -3442165056282524525L), (byte) 0));
					if (class437.autoDisable)
						class282.remove();
					else
						bool = true;
				}
				if (!bool)
					defs.cs2Map = null;
			}
		}
		synchronized (((ItemIndexLoader) this).cache) {
			((ItemIndexLoader) this).cache.put(defs, (long) itemId);
		}
		return defs;
	}

	public NativeSprite renderItemSprite(GraphicalRenderer hardwareRenderer, GraphicalRenderer softwareRenderer, int itemId, int amount, int outlineSize, int shadowColor, boolean zoomedIn, boolean hardwareRendering, int renderStack, FontRenderer fontRenderer, PlayerAppearance playerAppearance, byte i_7_) {
		if (!hardwareRendering) {
			NativeSprite sprite = softwareRender(softwareRenderer, itemId, amount, outlineSize, shadowColor, renderStack, playerAppearance, 206421629);
			if (null != sprite)
				return sprite;
		}
		ItemDefinitions defs = getItemDefinitions(itemId, 1779200762);
		if (amount > 1 && defs.stackIds != null) {
			int stackItemId = -1;
			for (int i = 0; i < 10; i++) {
				if (amount >= defs.stackAmounts[i] && 0 != defs.stackAmounts[i])
					stackItemId = defs.stackIds[i];
			}
			if (stackItemId != -1)
				defs = getItemDefinitions(stackItemId, 486684892);
		}
		int[] pixels = defs.renderToSprite(hardwareRenderer, softwareRenderer, amount, outlineSize, shadowColor, zoomedIn, renderStack, fontRenderer, playerAppearance, (short) 255);
		if (pixels == null)
			return null;
		NativeSprite sprite;
		if (hardwareRendering)
			sprite = hardwareRenderer.createNativeSprite(pixels, 0, 36, 36, 32, -1903449230);
		else
			sprite = softwareRenderer.createNativeSprite(pixels, 0, 36, 36, 32, -923043708);
		if (!hardwareRendering) {
			SoftwareItemRender softwareItemRender = new SoftwareItemRender();
			((SoftwareItemRender) softwareItemRender).rendererId = softwareRenderer.rendererId * -557951377;
			((SoftwareItemRender) softwareItemRender).itemId = itemId * 412172861;
			((SoftwareItemRender) softwareItemRender).itemAmount = -1802585529 * amount;
			((SoftwareItemRender) softwareItemRender).outlineSize = outlineSize * -1113099245;
			((SoftwareItemRender) softwareItemRender).shadowColor = shadowColor * -621770313;
			((SoftwareItemRender) softwareItemRender).renderStack = -190647633 * renderStack;
			((SoftwareItemRender) softwareItemRender).hasPlayerAppearance = playerAppearance != null;
			aClass212_5114.method3644(sprite, softwareItemRender);
		}
		return sprite;
	}

	public void method7148(boolean bool, int i) {
		if (((ItemIndexLoader) this).membersOnly != bool) {
			((ItemIndexLoader) this).membersOnly = bool;
			method7150(-2095377821);
		}
	}

	public void method7150(int i) {
		synchronized (((ItemIndexLoader) this).cache) {
			((ItemIndexLoader) this).cache.method3859(-1183528358);
		}
		synchronized (((ItemIndexLoader) this).aClass229_5115) {
			((ItemIndexLoader) this).aClass229_5115.method3859(-545923890);
		}
		synchronized (aClass212_5114) {
			aClass212_5114.method3638();
		}
	}

	public void method7151(byte i) {
		synchronized (aClass212_5114) {
			aClass212_5114.method3638();
		}
	}

	public void method7152(int i) {
		synchronized (((ItemIndexLoader) this).aClass229_5115) {
			((ItemIndexLoader) this).aClass229_5115.method3859(1371574931);
		}
	}

	public void method7153(int i, int i_14_) {
		((ItemIndexLoader) this).anInt5116 = i * 1246124191;
		synchronized (((ItemIndexLoader) this).aClass229_5115) {
			((ItemIndexLoader) this).aClass229_5115.method3859(1018730754);
		}
	}

	public void method7156(int i, byte i_15_) {
		synchronized (((ItemIndexLoader) this).cache) {
			((ItemIndexLoader) this).cache.method3858(i, (byte) -11);
		}
		synchronized (((ItemIndexLoader) this).aClass229_5115) {
			((ItemIndexLoader) this).aClass229_5115.method3858(i, (byte) -73);
		}
		synchronized (aClass212_5114) {
			aClass212_5114.method3639(i);
		}
	}

	public ItemIndexLoader(Game game, Language language, boolean bool, ItemDefaultsLoader attrDefaults, Index fs19, Index meshIndex) {
		aClass212_5114 = new Class212(250);
		((ItemIndexLoader) this).softwareItemRender = new SoftwareItemRender();
		((ItemIndexLoader) this).game = game;
		((ItemIndexLoader) this).language = language;
		((ItemIndexLoader) this).membersOnly = bool;
		((ItemIndexLoader) this).attrDefaults = attrDefaults;
		((ItemIndexLoader) this).fs19 = fs19;
		((ItemIndexLoader) this).meshIndex = meshIndex;
		if (((ItemIndexLoader) this).fs19 != null) {
			int i = ((ItemIndexLoader) this).fs19.containersCount(-1865229040) - 1;
			maxItemsCount = (i * SharedConfigsType.ITEM_DEFINITIONS.filesPerContainer(-1077198554) + ((ItemIndexLoader) this).fs19.filesCount(i, -1891673686)) * -230207835;
		} else
			maxItemsCount = 0;
		if (Game.darkan == ((ItemIndexLoader) this).game)
			((ItemIndexLoader) this).defaultGroundOptions = (new String[] { null, null, Message.TAKE.translate((((ItemIndexLoader) this).language), -1215966862), null, null, Message.EXAMINE.translate((((ItemIndexLoader) this).language), -380297277) });
		else
			((ItemIndexLoader) this).defaultGroundOptions = (new String[] { null, null, Message.TAKE.translate((((ItemIndexLoader) this).language), -791276439), null, null, null });
		((ItemIndexLoader) this).defaultInventoryOptions = (new String[] { null, null, null, null, Message.DROP.translate((((ItemIndexLoader) this).language), -1623734133) });
	}

	public NativeSprite softwareRender(GraphicalRenderer softwareRenderer, int i, int i_25_, int i_26_, int i_27_, int i_28_, PlayerAppearance class238, int i_29_) {
		((SoftwareItemRender) ((ItemIndexLoader) this).softwareItemRender).rendererId = -557951377 * softwareRenderer.rendererId;
		((SoftwareItemRender) ((ItemIndexLoader) this).softwareItemRender).itemId = 412172861 * i;
		((SoftwareItemRender) ((ItemIndexLoader) this).softwareItemRender).itemAmount = -1802585529 * i_25_;
		((SoftwareItemRender) ((ItemIndexLoader) this).softwareItemRender).outlineSize = i_26_ * -1113099245;
		((SoftwareItemRender) ((ItemIndexLoader) this).softwareItemRender).shadowColor = i_27_ * -621770313;
		((SoftwareItemRender) ((ItemIndexLoader) this).softwareItemRender).renderStack = i_28_ * -190647633;
		((SoftwareItemRender) ((ItemIndexLoader) this).softwareItemRender).hasPlayerAppearance = class238 != null;
		return ((NativeSprite) aClass212_5114.method3654(((ItemIndexLoader) this).softwareItemRender));
	}

	public void method7166(int i) {
		synchronized (((ItemIndexLoader) this).cache) {
			((ItemIndexLoader) this).cache.method3863(1688795020);
		}
		synchronized (((ItemIndexLoader) this).aClass229_5115) {
			((ItemIndexLoader) this).aClass229_5115.method3863(692619526);
		}
		synchronized (aClass212_5114) {
			aClass212_5114.method3641();
		}
	}

	static String method7169(int i, int i_34_, int i_35_) {
		int i_36_ = i_34_ - i;
		if (i_36_ < -9)
			return Class59.method1163(16711680, 619010179);
		if (i_36_ < -6)
			return Class59.method1163(16723968, 619010179);
		if (i_36_ < -3)
			return Class59.method1163(16740352, 619010179);
		if (i_36_ < 0)
			return Class59.method1163(16756736, 619010179);
		if (i_36_ > 9)
			return Class59.method1163(65280, 619010179);
		if (i_36_ > 6)
			return Class59.method1163(4259584, 619010179);
		if (i_36_ > 3)
			return Class59.method1163(8453888, 619010179);
		if (i_36_ > 0)
			return Class59.method1163(12648192, 619010179);
		return Class59.method1163(16776960, 619010179);
	}

	static void method7170(int i, int i_37_) {
		if (Class5.anIntArray36 == null || Class5.anIntArray36.length < i)
			Class5.anIntArray36 = new int[i];
	}

	static String method7171(IComponentDefinitions class118, int i, byte i_38_) {
		if (!client.method11633(class118).method12178(i, (short) -32600) && class118.params == null)
			return null;
		if (class118.aStringArray1352 == null || class118.aStringArray1352.length <= i || class118.aStringArray1352[i] == null || class118.aStringArray1352[i].trim().length() == 0) {
			if (client.aBool7168)
				return new StringBuilder().append("Hidden-").append(i).toString();
			return null;
		}
		return class118.aStringArray1352[i];
	}
}
