public class NPCIndexLoader {

	int anInt4845;

	SoftCache aClass229_4841 = new SoftCache(64);

	SoftCache aClass229_4836 = new SoftCache(50);

	SoftCache aClass229_4843 = new SoftCache(5);

	Game aClass486_4844;

	Language aClass495_4837;

	boolean aBool4838;

	Index aClass317_4839;

	Index aClass317_4842;

	String[] aStringArray4840;

	public NPCDefinitions getNPCDefinitions(int i_1) {
		SoftCache softcache_4 = this.aClass229_4841;
		NPCDefinitions npcdefinitions_3;
		synchronized (this.aClass229_4841) {
			npcdefinitions_3 = (NPCDefinitions) this.aClass229_4841.get((long) i_1);
		}
		if (npcdefinitions_3 != null) {
			return npcdefinitions_3;
		} else {
			Index index_5 = this.aClass317_4839;
			byte[] bytes_10;
			synchronized (this.aClass317_4839) {
				bytes_10 = this.aClass317_4839.getFile(SharedConfigsType.NPCS.containerId(i_1), SharedConfigsType.NPCS.fileId(i_1));
			}
			npcdefinitions_3 = new NPCDefinitions();
			npcdefinitions_3.anInt4856 = i_1;
			npcdefinitions_3.aClass406_4855 = this;
			npcdefinitions_3.options = (String[]) this.aStringArray4840.clone();
			if (bytes_10 != null) {
				npcdefinitions_3.method6874(new RsByteBuffer(bytes_10));
			}
			npcdefinitions_3.method6877();
			SoftCache softcache_9 = this.aClass229_4841;
			synchronized (this.aClass229_4841) {
				this.aClass229_4841.put(npcdefinitions_3, (long) i_1);
				return npcdefinitions_3;
			}
		}
	}

	public void method6829(int i_1) {
		this.anInt4845 = i_1;
		SoftCache softcache_3 = this.aClass229_4836;
		synchronized (this.aClass229_4836) {
			this.aClass229_4836.method3859(1726285779);
		}
		softcache_3 = this.aClass229_4843;
		synchronized (this.aClass229_4843) {
			this.aClass229_4843.method3859(21107724);
		}
	}

	public void method6831() {
		SoftCache softcache_2 = this.aClass229_4836;
		synchronized (this.aClass229_4836) {
			this.aClass229_4836.method3859(-157973986);
		}
		softcache_2 = this.aClass229_4843;
		synchronized (this.aClass229_4843) {
			this.aClass229_4843.method3859(970264872);
		}
	}

	public void method6832() {
		SoftCache softcache_3 = this.aClass229_4841;
		synchronized (this.aClass229_4841) {
			this.aClass229_4841.method3858(5, (byte) 39);
		}
		softcache_3 = this.aClass229_4836;
		synchronized (this.aClass229_4836) {
			this.aClass229_4836.method3858(5, (byte) -24);
		}
		softcache_3 = this.aClass229_4843;
		synchronized (this.aClass229_4843) {
			this.aClass229_4843.method3858(5, (byte) -2);
		}
	}

	public void method6833() {
		SoftCache softcache_2 = this.aClass229_4841;
		synchronized (this.aClass229_4841) {
			this.aClass229_4841.method3863(813622109);
		}
		softcache_2 = this.aClass229_4836;
		synchronized (this.aClass229_4836) {
			this.aClass229_4836.method3863(687026796);
		}
		softcache_2 = this.aClass229_4843;
		synchronized (this.aClass229_4843) {
			this.aClass229_4843.method3863(1635439222);
		}
	}

	public void method6836(byte b_1) {
		SoftCache softcache_2 = this.aClass229_4841;
		synchronized (this.aClass229_4841) {
			this.aClass229_4841.method3859(-986318596);
		}
		softcache_2 = this.aClass229_4836;
		synchronized (this.aClass229_4836) {
			this.aClass229_4836.method3859(-1053289793);
		}
		softcache_2 = this.aClass229_4843;
		synchronized (this.aClass229_4843) {
			this.aClass229_4843.method3859(-1428350726);
		}
	}

	public NPCIndexLoader(Game game_1, Language xlanguage_2, Index index_4, Index index_5) {
		this.aClass486_4844 = game_1;
		this.aClass495_4837 = xlanguage_2;
		this.aBool4838 = true;
		this.aClass317_4839 = index_4;
		this.aClass317_4842 = index_5;
		if (this.aClass317_4839 != null) {
			int i_6 = this.aClass317_4839.containersCount() - 1;
			SharedConfigsType.NPCS.filesPerContainer(-443341258);
			this.aClass317_4839.filesCount(i_6);
		}
		if (this.aClass486_4844 == Game.darkan) {
			this.aStringArray4840 = new String[] { null, null, null, null, null, Message.EXAMINE.translate(this.aClass495_4837, -1623078066) };
		} else {
			this.aStringArray4840 = new String[6];
		}
	}

	public void method6847(boolean bool_1) {
		if (this.aBool4838 != bool_1) {
			this.aBool4838 = bool_1;
			this.method6836((byte) -17);
		}
	}

	static Class111[] method6852(int i_0) {
		return new Class111[] { Class111.aClass111_1222, Class111.aClass111_1108, Class111.aClass111_1109, Class111.aClass111_1110, Class111.aClass111_1111, Class111.aClass111_1112, Class111.aClass111_1113, Class111.aClass111_1204, Class111.aClass111_1199, Class111.aClass111_1131, Class111.aClass111_1117, Class111.aClass111_1114, Class111.aClass111_1200, Class111.aClass111_1120, Class111.aClass111_1121, Class111.aClass111_1122, Class111.aClass111_1123, Class111.aClass111_1124, Class111.aClass111_1125, Class111.aClass111_1126, Class111.aClass111_1127, Class111.aClass111_1164, Class111.aClass111_1175, Class111.aClass111_1129, Class111.aClass111_1219, Class111.aClass111_1132, Class111.aClass111_1133, Class111.aClass111_1134, Class111.aClass111_1205, Class111.aClass111_1177, Class111.aClass111_1137, Class111.aClass111_1138, Class111.aClass111_1173, Class111.aClass111_1189, Class111.aClass111_1141, Class111.aClass111_1142, Class111.aClass111_1115, Class111.aClass111_1144, Class111.aClass111_1145, Class111.aClass111_1146, Class111.aClass111_1196, Class111.aClass111_1168, Class111.aClass111_1149, Class111.aClass111_1150, Class111.aClass111_1176, Class111.aClass111_1152, Class111.aClass111_1153, Class111.aClass111_1184, Class111.aClass111_1155, Class111.aClass111_1156, Class111.aClass111_1143, Class111.aClass111_1158, Class111.aClass111_1159, Class111.aClass111_1160, Class111.aClass111_1161, Class111.aClass111_1157, Class111.aClass111_1107, Class111.aClass111_1194, Class111.aClass111_1229, Class111.aClass111_1166, Class111.aClass111_1167, Class111.aClass111_1135, Class111.aClass111_1140, Class111.aClass111_1170, Class111.aClass111_1171, Class111.aClass111_1172, Class111.aClass111_1147, Class111.aClass111_1174, Class111.aClass111_1139, Class111.aClass111_1220, Class111.aClass111_1182, Class111.aClass111_1178, Class111.aClass111_1179, Class111.aClass111_1148, Class111.aClass111_1181, Class111.aClass111_1180, Class111.aClass111_1183, Class111.aClass111_1207, Class111.aClass111_1185, Class111.aClass111_1186, Class111.aClass111_1187, Class111.aClass111_1119, Class111.aClass111_1209, Class111.aClass111_1190, Class111.aClass111_1191, Class111.aClass111_1192, Class111.aClass111_1193, Class111.aClass111_1162, Class111.aClass111_1198, Class111.aClass111_1151, Class111.aClass111_1197, Class111.aClass111_1188, Class111.aClass111_1154, Class111.aClass111_1128, Class111.aClass111_1201, Class111.aClass111_1202, Class111.aClass111_1203, Class111.aClass111_1165, Class111.aClass111_1163, Class111.aClass111_1206, Class111.aClass111_1116, Class111.aClass111_1208, Class111.aClass111_1169, Class111.aClass111_1210, Class111.aClass111_1211, Class111.aClass111_1212, Class111.aClass111_1213, Class111.aClass111_1214, Class111.aClass111_1215, Class111.aClass111_1216, Class111.aClass111_1217, Class111.aClass111_1218, Class111.aClass111_1195, Class111.aClass111_1136, Class111.aClass111_1221, Class111.aClass111_1118, Class111.aClass111_1223, Class111.aClass111_1224, Class111.aClass111_1225, Class111.aClass111_1226, Class111.aClass111_1227, Class111.aClass111_1228, Class111.aClass111_1130, Class111.aClass111_1230, Class111.aClass111_1231 };
	}
}
