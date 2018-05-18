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
	Class420 aClass420_5112;
	AttributesDefaultsLoader attrDefaults;
	public Class212 aClass212_5114;
	SoftCache aClass229_5115 = new SoftCache(50);
	int anInt5116;

	public ItemDefinitions getItemDefinitions(int itemId, int i_0_) {
		ItemDefinitions defs;
		synchronized (((ItemIndexLoader) this).cache) {
			defs = ((ItemDefinitions) ((ItemIndexLoader) this).cache.method3865((long) itemId));
		}
		if (defs != null)
			return defs;
		byte[] data;
		synchronized (((ItemIndexLoader) this).fs19) {
			data = (((ItemIndexLoader) this).fs19.getFile(SharedConfigsType.ITEM_DEFINITIONS.containerId(itemId, 548952968), SharedConfigsType.ITEM_DEFINITIONS.fileId(itemId, -1930948292), -1500146511));
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
					AttributeDefault class437 = (((ItemIndexLoader) this).attrDefaults.method7069((int) (class282.aLong3379 * -3442165056282524525L), (byte) 0));
					if (class437.autoDisable)
						class282.unlink(-371378792);
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

	public NativeSprite renderItemSprite(GraphicalRenderer class505, GraphicalRenderer class505_1_, int i, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_, int i_6_, FontRenderer class8, PlayerAppearance class238, byte i_7_) {
		if (!bool_5_) {
			NativeSprite class160 = method7162(class505_1_, i, i_2_, i_3_, i_4_, i_6_, class238, 206421629);
			if (null != class160)
				return class160;
		}
		ItemDefinitions defs = getItemDefinitions(i, 1779200762);
		if (i_2_ > 1 && defs.stackIds != null) {
			int i_8_ = -1;
			for (int i_9_ = 0; i_9_ < 10; i_9_++) {
				if (i_2_ >= defs.stackAmounts[i_9_] && 0 != defs.stackAmounts[i_9_])
					i_8_ = defs.stackIds[i_9_];
			}
			if (i_8_ != -1)
				defs = getItemDefinitions(i_8_, 486684892);
		}
		int[] is = defs.renderToSprite(class505, class505_1_, i_2_, i_3_, i_4_, bool, i_6_, class8, class238, (short) 255);
		if (is == null)
			return null;
		NativeSprite class160;
		if (bool_5_)
			class160 = class505.createNativeSprite(is, 0, 36, 36, 32, -1903449230);
		else
			class160 = class505_1_.createNativeSprite(is, 0, 36, 36, 32, -923043708);
		if (!bool_5_) {
			Class420 class420 = new Class420();
			((Class420) class420).anInt5008 = class505_1_.rendererId * -557951377;
			((Class420) class420).anInt5007 = i * 412172861;
			((Class420) class420).anInt5006 = -1802585529 * i_2_;
			((Class420) class420).anInt5005 = i_3_ * -1113099245;
			((Class420) class420).anInt5009 = i_4_ * -621770313;
			((Class420) class420).anInt5010 = -190647633 * i_6_;
			((Class420) class420).aBool5011 = class238 != null;
			aClass212_5114.method3644(class160, class420);
		}
		return class160;
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

	public ItemIndexLoader(Game class486, Language class495, boolean bool, AttributesDefaultsLoader class424, Index class317, Index class317_16_) {
		aClass212_5114 = new Class212(250);
		((ItemIndexLoader) this).aClass420_5112 = new Class420();
		((ItemIndexLoader) this).game = class486;
		((ItemIndexLoader) this).language = class495;
		((ItemIndexLoader) this).membersOnly = bool;
		((ItemIndexLoader) this).attrDefaults = class424;
		((ItemIndexLoader) this).fs19 = class317;
		((ItemIndexLoader) this).meshIndex = class317_16_;
		if (((ItemIndexLoader) this).fs19 != null) {
			int i = ((ItemIndexLoader) this).fs19.containersCount(-1865229040) - 1;
			maxItemsCount = (i * SharedConfigsType.ITEM_DEFINITIONS.method2078(-1077198554) + ((ItemIndexLoader) this).fs19.filesCount(i, -1891673686)) * -230207835;
		} else
			maxItemsCount = 0;
		if (Game.runescape == ((ItemIndexLoader) this).game)
			((ItemIndexLoader) this).defaultGroundOptions = (new String[] { null, null, Message.aClass433_5243.translate((((ItemIndexLoader) this).language), -1215966862), null, null, Message.aClass433_5282.translate((((ItemIndexLoader) this).language), -380297277) });
		else
			((ItemIndexLoader) this).defaultGroundOptions = (new String[] { null, null, Message.aClass433_5243.translate((((ItemIndexLoader) this).language), -791276439), null, null, null });
		((ItemIndexLoader) this).defaultInventoryOptions = (new String[] { null, null, null, null, Message.aClass433_5168.translate((((ItemIndexLoader) this).language), -1623734133) });
	}

	public NativeSprite method7162(GraphicalRenderer class505, int i, int i_25_, int i_26_, int i_27_, int i_28_, PlayerAppearance class238, int i_29_) {
		((Class420) ((ItemIndexLoader) this).aClass420_5112).anInt5008 = -557951377 * class505.rendererId;
		((Class420) ((ItemIndexLoader) this).aClass420_5112).anInt5007 = 412172861 * i;
		((Class420) ((ItemIndexLoader) this).aClass420_5112).anInt5006 = -1802585529 * i_25_;
		((Class420) ((ItemIndexLoader) this).aClass420_5112).anInt5005 = i_26_ * -1113099245;
		((Class420) ((ItemIndexLoader) this).aClass420_5112).anInt5009 = i_27_ * -621770313;
		((Class420) ((ItemIndexLoader) this).aClass420_5112).anInt5010 = i_28_ * -190647633;
		((Class420) ((ItemIndexLoader) this).aClass420_5112).aBool5011 = class238 != null;
		return ((NativeSprite) aClass212_5114.method3654(((ItemIndexLoader) this).aClass420_5112));
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

	static String method7171(Class118 class118, int i, byte i_38_) {
		if (!client.method11633(class118).method12178(i, (short) -32600) && class118.anObjectArray1410 == null)
			return null;
		if (class118.aStringArray1352 == null || class118.aStringArray1352.length <= i || class118.aStringArray1352[i] == null || class118.aStringArray1352[i].trim().length() == 0) {
			if (client.aBool7168)
				return new StringBuilder().append("Hidden-").append(i).toString();
			return null;
		}
		return class118.aStringArray1352[i];
	}
}
