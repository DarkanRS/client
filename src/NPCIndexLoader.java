/* Class406 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class NPCIndexLoader {
	SoftCache aClass229_4836;
	Language aClass495_4837;
	boolean aBool4838;
	Index aClass317_4839;
	String[] aStringArray4840;
	SoftCache aClass229_4841 = new SoftCache(64);
	Index aClass317_4842;
	SoftCache aClass229_4843;
	Game aClass486_4844;
	int anInt4845;

	public void method6826() {
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			((NPCIndexLoader) this).aClass229_4841.method3863(1328152952);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3863(1475110041);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3863(2104995668);
		}
	}

	public void method6827() {
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3859(-1081944978);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3859(-584824692);
		}
	}

	public NPCDefinitions getNPCDefinitions(int i, byte i_0_) {
		NPCDefinitions class409;
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			class409 = ((NPCDefinitions) ((NPCIndexLoader) this).aClass229_4841.get((long) i));
		}
		if (null != class409)
			return class409;
		byte[] is;
		synchronized (((NPCIndexLoader) this).aClass317_4839) {
			is = (((NPCIndexLoader) this).aClass317_4839.getFile(SharedConfigsType.aClass120_1467.containerId(i, -391005566), SharedConfigsType.aClass120_1467.fileId(i, -2083039735), -1310077438));
		}
		class409 = new NPCDefinitions();
		class409.anInt4856 = i * -1165155817;
		((NPCDefinitions) class409).aClass406_4855 = this;
		class409.aStringArray4882 = (String[]) ((NPCIndexLoader) this).aStringArray4840.clone();
		if (null != is)
			class409.method6874(new RsByteBuffer(is), 1737313867);
		class409.method6877(1494985964);
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			((NPCIndexLoader) this).aClass229_4841.put(class409, (long) i);
		}
		return class409;
	}

	public void method6829(int i, int i_1_) {
		((NPCIndexLoader) this).anInt4845 = 3014821 * i;
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3859(1726285779);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3859(21107724);
		}
	}

	public void method6830(boolean bool) {
		if (bool != ((NPCIndexLoader) this).aBool4838) {
			((NPCIndexLoader) this).aBool4838 = bool;
			method6836((byte) -80);
		}
	}

	public void method6831(int i) {
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3859(-157973986);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3859(970264872);
		}
	}

	public void method6832(int i, int i_2_) {
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			((NPCIndexLoader) this).aClass229_4841.method3858(i, (byte) 39);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3858(i, (byte) -24);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3858(i, (byte) -2);
		}
	}

	public void method6833(int i) {
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			((NPCIndexLoader) this).aClass229_4841.method3863(813622109);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3863(687026796);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3863(1635439222);
		}
	}

	public NPCDefinitions method6834(int i) {
		NPCDefinitions class409;
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			class409 = ((NPCDefinitions) ((NPCIndexLoader) this).aClass229_4841.get((long) i));
		}
		if (null != class409)
			return class409;
		byte[] is;
		synchronized (((NPCIndexLoader) this).aClass317_4839) {
			is = (((NPCIndexLoader) this).aClass317_4839.getFile(SharedConfigsType.aClass120_1467.containerId(i, 123668197), SharedConfigsType.aClass120_1467.fileId(i, -1898923068), -1845264085));
		}
		class409 = new NPCDefinitions();
		class409.anInt4856 = i * -1165155817;
		((NPCDefinitions) class409).aClass406_4855 = this;
		class409.aStringArray4882 = (String[]) ((NPCIndexLoader) this).aStringArray4840.clone();
		if (null != is)
			class409.method6874(new RsByteBuffer(is), 1705465056);
		class409.method6877(-2031468830);
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			((NPCIndexLoader) this).aClass229_4841.put(class409, (long) i);
		}
		return class409;
	}

	public NPCDefinitions method6835(int i) {
		NPCDefinitions class409;
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			class409 = ((NPCDefinitions) ((NPCIndexLoader) this).aClass229_4841.get((long) i));
		}
		if (null != class409)
			return class409;
		byte[] is;
		synchronized (((NPCIndexLoader) this).aClass317_4839) {
			is = (((NPCIndexLoader) this).aClass317_4839.getFile(SharedConfigsType.aClass120_1467.containerId(i, 1099243946), SharedConfigsType.aClass120_1467.fileId(i, -1970709943), -1827585715));
		}
		class409 = new NPCDefinitions();
		class409.anInt4856 = i * -1165155817;
		((NPCDefinitions) class409).aClass406_4855 = this;
		class409.aStringArray4882 = (String[]) ((NPCIndexLoader) this).aStringArray4840.clone();
		if (null != is)
			class409.method6874(new RsByteBuffer(is), 1944835693);
		class409.method6877(-918646775);
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			((NPCIndexLoader) this).aClass229_4841.put(class409, (long) i);
		}
		return class409;
	}

	public void method6836(byte i) {
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			((NPCIndexLoader) this).aClass229_4841.method3859(-986318596);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3859(-1053289793);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3859(-1428350726);
		}
	}

	public void method6837() {
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			((NPCIndexLoader) this).aClass229_4841.method3859(-1742586497);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3859(2050188538);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3859(1423489668);
		}
	}

	public void method6838() {
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			((NPCIndexLoader) this).aClass229_4841.method3863(1028894437);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3863(862479537);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3863(701397936);
		}
	}

	public void method6839(boolean bool) {
		if (bool != ((NPCIndexLoader) this).aBool4838) {
			((NPCIndexLoader) this).aBool4838 = bool;
			method6836((byte) -44);
		}
	}

	public void method6840(boolean bool) {
		if (bool != ((NPCIndexLoader) this).aBool4838) {
			((NPCIndexLoader) this).aBool4838 = bool;
			method6836((byte) -119);
		}
	}

	public NPCIndexLoader(Game class486, Language class495, boolean bool, Index class317, Index class317_3_) {
		((NPCIndexLoader) this).aClass229_4836 = new SoftCache(50);
		((NPCIndexLoader) this).aClass229_4843 = new SoftCache(5);
		((NPCIndexLoader) this).aClass486_4844 = class486;
		((NPCIndexLoader) this).aClass495_4837 = class495;
		((NPCIndexLoader) this).aBool4838 = bool;
		((NPCIndexLoader) this).aClass317_4839 = class317;
		((NPCIndexLoader) this).aClass317_4842 = class317_3_;
		if (null != ((NPCIndexLoader) this).aClass317_4839) {
			int i = ((NPCIndexLoader) this).aClass317_4839.containersCount(-941048817) - 1;
			SharedConfigsType.aClass120_1467.filesPerContainer(-443341258);
			((NPCIndexLoader) this).aClass317_4839.filesCount(i, 1971095578);
		}
		if (((NPCIndexLoader) this).aClass486_4844 == Game.runescape)
			((NPCIndexLoader) this).aStringArray4840 = (new String[] { null, null, null, null, null, Message.EXAMINE.translate((((NPCIndexLoader) this).aClass495_4837), -1623078066) });
		else
			((NPCIndexLoader) this).aStringArray4840 = new String[] { null, null, null, null, null, null };
	}

	public void method6841(int i) {
		((NPCIndexLoader) this).anInt4845 = 3014821 * i;
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3859(368531001);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3859(-656158176);
		}
	}

	public void method6842(int i) {
		((NPCIndexLoader) this).anInt4845 = 3014821 * i;
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3859(-328318674);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3859(-340921547);
		}
	}

	public void method6843(int i) {
		((NPCIndexLoader) this).anInt4845 = 3014821 * i;
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3859(-498760218);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3859(1894996656);
		}
	}

	public void method6844(int i) {
		((NPCIndexLoader) this).anInt4845 = 3014821 * i;
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3859(-1373861067);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3859(1887932518);
		}
	}

	public void method6845(int i) {
		((NPCIndexLoader) this).anInt4845 = 3014821 * i;
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3859(-1450879763);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3859(-937097949);
		}
	}

	public void method6846() {
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			((NPCIndexLoader) this).aClass229_4841.method3859(-1297315269);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3859(1620437552);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3859(-280207255);
		}
	}

	public void method6847(boolean bool, byte i) {
		if (bool != ((NPCIndexLoader) this).aBool4838) {
			((NPCIndexLoader) this).aBool4838 = bool;
			method6836((byte) -17);
		}
	}

	public void method6848(boolean bool) {
		if (bool != ((NPCIndexLoader) this).aBool4838) {
			((NPCIndexLoader) this).aBool4838 = bool;
			method6836((byte) -56);
		}
	}

	public void method6849(boolean bool) {
		if (bool != ((NPCIndexLoader) this).aBool4838) {
			((NPCIndexLoader) this).aBool4838 = bool;
			method6836((byte) -106);
		}
	}

	public void method6850() {
		synchronized (((NPCIndexLoader) this).aClass229_4841) {
			((NPCIndexLoader) this).aClass229_4841.method3863(1423816465);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4836) {
			((NPCIndexLoader) this).aClass229_4836.method3863(1498972850);
		}
		synchronized (((NPCIndexLoader) this).aClass229_4843) {
			((NPCIndexLoader) this).aClass229_4843.method3863(2100259311);
		}
	}

	static final void method6851(CS2Executor class527, int i) {
		int i_4_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_4_, (byte) 27);
		Class96_Sub10.method14605(class118, class527, (byte) -34);
	}

	static Class111[] method6852(int i) {
		return (new Class111[] { Class111.aClass111_1222, Class111.aClass111_1108, Class111.aClass111_1109, Class111.aClass111_1110, Class111.aClass111_1111, Class111.aClass111_1112, Class111.aClass111_1113, Class111.aClass111_1204, Class111.aClass111_1199, Class111.aClass111_1131, Class111.aClass111_1117, Class111.aClass111_1114, Class111.aClass111_1200, Class111.aClass111_1120, Class111.aClass111_1121, Class111.aClass111_1122, Class111.aClass111_1123, Class111.aClass111_1124,
				Class111.aClass111_1125, Class111.aClass111_1126, Class111.aClass111_1127, Class111.aClass111_1164, Class111.aClass111_1175, Class111.aClass111_1129, Class111.aClass111_1219, Class111.aClass111_1132, Class111.aClass111_1133, Class111.aClass111_1134, Class111.aClass111_1205, Class111.aClass111_1177, Class111.aClass111_1137, Class111.aClass111_1138, Class111.aClass111_1173, Class111.aClass111_1189, Class111.aClass111_1141, Class111.aClass111_1142, Class111.aClass111_1115,
				Class111.aClass111_1144, Class111.aClass111_1145, Class111.aClass111_1146, Class111.aClass111_1196, Class111.aClass111_1168, Class111.aClass111_1149, Class111.aClass111_1150, Class111.aClass111_1176, Class111.aClass111_1152, Class111.aClass111_1153, Class111.aClass111_1184, Class111.aClass111_1155, Class111.aClass111_1156, Class111.aClass111_1143, Class111.aClass111_1158, Class111.aClass111_1159, Class111.aClass111_1160, Class111.aClass111_1161, Class111.aClass111_1157,
				Class111.aClass111_1107, Class111.aClass111_1194, Class111.aClass111_1229, Class111.aClass111_1166, Class111.aClass111_1167, Class111.aClass111_1135, Class111.aClass111_1140, Class111.aClass111_1170, Class111.aClass111_1171, Class111.aClass111_1172, Class111.aClass111_1147, Class111.aClass111_1174, Class111.aClass111_1139, Class111.aClass111_1220, Class111.aClass111_1182, Class111.aClass111_1178, Class111.aClass111_1179, Class111.aClass111_1148, Class111.aClass111_1181,
				Class111.aClass111_1180, Class111.aClass111_1183, Class111.aClass111_1207, Class111.aClass111_1185, Class111.aClass111_1186, Class111.aClass111_1187, Class111.aClass111_1119, Class111.aClass111_1209, Class111.aClass111_1190, Class111.aClass111_1191, Class111.aClass111_1192, Class111.aClass111_1193, Class111.aClass111_1162, Class111.aClass111_1198, Class111.aClass111_1151, Class111.aClass111_1197, Class111.aClass111_1188, Class111.aClass111_1154, Class111.aClass111_1128,
				Class111.aClass111_1201, Class111.aClass111_1202, Class111.aClass111_1203, Class111.aClass111_1165, Class111.aClass111_1163, Class111.aClass111_1206, Class111.aClass111_1116, Class111.aClass111_1208, Class111.aClass111_1169, Class111.aClass111_1210, Class111.aClass111_1211, Class111.aClass111_1212, Class111.aClass111_1213, Class111.aClass111_1214, Class111.aClass111_1215, Class111.aClass111_1216, Class111.aClass111_1217, Class111.aClass111_1218, Class111.aClass111_1195,
				Class111.aClass111_1136, Class111.aClass111_1221, Class111.aClass111_1118, Class111.aClass111_1223, Class111.aClass111_1224, Class111.aClass111_1225, Class111.aClass111_1226, Class111.aClass111_1227, Class111.aClass111_1228, Class111.aClass111_1130, Class111.aClass111_1230, Class111.aClass111_1231 });
	}
}
