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

	public ItemDefinitions getItemDefinitions(int id, int i_0_) {
		ItemDefinitions def;
		synchronized (cache) {
			def = ((ItemDefinitions) cache.get((long) id));
		}
		if (def != null)
			return def;
		byte[] data;
		synchronized (fs19) {
			data = (fs19.getFile(SharedConfigsType.itemDefs.containerId(id, 548952968), SharedConfigsType.itemDefs.fileId(id, -1930948292), -1500146511));
		}
		def = new ItemDefinitions();
		def.loader = this;
		def.id = id * -2098132987;
		def.groundOptions = (String[]) defaultGroundOptions.clone();
		def.inventoryOptions = (String[]) defaultInventoryOptions.clone();
		if (null != data)
			def.decode(new RsByteBuffer(data), -176434754);
		def.postDecode(-1924179762);
		if (-722914683 * def.certTemplateId != -1)
			def.generateCert(getItemDefinitions(-722914683 * def.certTemplateId, 1167906942), getItemDefinitions(1416589415 * def.certId, 1245595517), -1715219620);
		if (-1 != def.lendTemplateId * -1203090775)
			def.generateLend(getItemDefinitions(def.lendTemplateId * -1203090775, 294444778), getItemDefinitions((def.lendId * -14763883), 1908925068), -1404615542);
		if (def.bindTemplateId * 370155889 != -1)
			def.generateBind(getItemDefinitions(370155889 * def.bindTemplateId, 828359432), getItemDefinitions((def.bindId * 224116893), 1928714230), 1201532175);
		if (!membersOnly && def.members) {
			def.team = 0;
			def.groundOptions = defaultGroundOptions;
			def.inventoryOptions = defaultInventoryOptions;
			def.grandExchange = false;
			def.quests = null;
			if (def.cs2Map != null) {
				boolean hasOne = false;
				for (Node class282 = def.cs2Map.method7750(-778830741); class282 != null; class282 = def.cs2Map.method7751((byte) 57)) {
					AttributeDefault attr = (attrDefaults.get((int) (class282.uid * -3442165056282524525L), (byte) 0));
					if (attr.autoDisable)
						class282.unlink(-371378792);
					else
						hasOne = true;
				}
				if (!hasOne)
					def.cs2Map = null;
			}
		}
		synchronized (cache) {
			cache.put(def, (long) id);
		}
		return def;
	}

	public NativeSprite renderItemSprite(GraphicalRenderer class505, GraphicalRenderer class505_1_, int i, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_, int i_6_, FontRenderer class8, PlayerAppearance class238, byte i_7_) {
		if (!bool_5_) {
			NativeSprite class160 = method7162(class505_1_, i, i_2_, i_3_, i_4_, i_6_, class238, 206421629);
			if (null != class160)
				return class160;
		}
		ItemDefinitions defs = getItemDefinitions(i, 1779200762);
		if (i_2_ > 1 && ((ItemDefinitions) defs).stackIds != null) {
			int id = -1;
			for (int i_9_ = 0; i_9_ < 10; i_9_++) {
				if (i_2_ >= ((ItemDefinitions) defs).stackAmounts[i_9_] && 0 != ((ItemDefinitions) defs).stackAmounts[i_9_])
					id = ((ItemDefinitions) defs).stackIds[i_9_];
			}
			if (id != -1)
				defs = getItemDefinitions(id, 486684892);
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
		if (membersOnly != bool) {
			membersOnly = bool;
			method7150(-2095377821);
		}
	}

	public void method7150(int i) {
		synchronized (cache) {
			cache.method3859(-1183528358);
		}
		synchronized (aClass229_5115) {
			aClass229_5115.method3859(-545923890);
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
		synchronized (aClass229_5115) {
			aClass229_5115.method3859(1371574931);
		}
	}

	public void method7153(int i, int i_14_) {
		anInt5116 = i * 1246124191;
		synchronized (aClass229_5115) {
			aClass229_5115.method3859(1018730754);
		}
	}

	public void method7156(int i, byte i_15_) {
		synchronized (cache) {
			cache.method3858(i, (byte) -11);
		}
		synchronized (aClass229_5115) {
			aClass229_5115.method3858(i, (byte) -73);
		}
		synchronized (aClass212_5114) {
			aClass212_5114.method3639(i);
		}
	}

	public ItemIndexLoader(Game class486, Language class495, boolean bool, AttributesDefaultsLoader class424, Index class317, Index class317_16_) {
		aClass212_5114 = new Class212(250);
		aClass420_5112 = new Class420();
		game = class486;
		language = class495;
		membersOnly = bool;
		attrDefaults = class424;
		fs19 = class317;
		meshIndex = class317_16_;
		if (fs19 != null) {
			int i = fs19.containersCount(-1865229040) - 1;
			maxItemsCount = (i * SharedConfigsType.itemDefs.filesPerContainer(-1077198554) + fs19.filesCount(i, -1891673686)) * -230207835;
		} else
			maxItemsCount = 0;
		if (Game.rs == game)
			defaultGroundOptions = (new String[] { null, null, Message.TAKE.translate((language), -1215966862), null, null, Message.EXAMINE.translate((language), -380297277) });
		else
			defaultGroundOptions = (new String[] { null, null, Message.TAKE.translate((language), -791276439), null, null, null });
		defaultInventoryOptions = (new String[] { null, null, null, null, Message.DROP.translate((language), -1623734133) });
	}

	public NativeSprite method7162(GraphicalRenderer class505, int i, int i_25_, int i_26_, int i_27_, int i_28_, PlayerAppearance class238, int i_29_) {
		((Class420) aClass420_5112).anInt5008 = -557951377 * class505.rendererId;
		((Class420) aClass420_5112).anInt5007 = 412172861 * i;
		((Class420) aClass420_5112).anInt5006 = -1802585529 * i_25_;
		((Class420) aClass420_5112).anInt5005 = i_26_ * -1113099245;
		((Class420) aClass420_5112).anInt5009 = i_27_ * -621770313;
		((Class420) aClass420_5112).anInt5010 = i_28_ * -190647633;
		((Class420) aClass420_5112).aBool5011 = class238 != null;
		return ((NativeSprite) aClass212_5114.method3654(aClass420_5112));
	}

	public void method7166(int i) {
		synchronized (cache) {
			cache.method3863(1688795020);
		}
		synchronized (aClass229_5115) {
			aClass229_5115.method3863(692619526);
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
