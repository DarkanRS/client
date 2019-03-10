import java.util.HashMap;
import java.util.Map;

public class Class378 {

	Map aMap4525 = null;

	SoftCache aClass229_4524 = new SoftCache(20);

	Index aClass317_4522;

	Index aClass317_4523;

	int[] anIntArray4521;

	public void method6403(Interface35 interface35_1, short s_2) {
		this.aMap4525 = new HashMap(this.anIntArray4521.length);
		for (int i_3 = 0; i_3 < this.anIntArray4521.length; i_3++) {
			int i_4 = this.anIntArray4521[i_3];
			FontMetrics fontmetrics_5 = Class163.method2845(this.aClass317_4523, i_4, (byte) 31);
			byte[] bytes_6 = this.aClass317_4522.getFile(i_4);
			Object object_7 = interface35_1.method216(bytes_6, fontmetrics_5, true, 1942118537);
			this.aMap4525.put(Integer.valueOf(i_3), new Class452(object_7, fontmetrics_5));
		}
	}

	public Class378(Index index_1, Index index_2, int[] ints_3) {
		this.aClass317_4522 = index_1;
		this.aClass317_4523 = index_2;
		if (ints_3 != null) {
			this.anIntArray4521 = ints_3;
		} else {
			this.anIntArray4521 = null;
		}
	}

	public int method6404(int i_1) {
		return this.method6405(false, 1676950204);
	}

	public int method6405(boolean bool_1, int i_2) {
		if (this.anIntArray4521 == null) {
			return 0;
		} else if (!bool_1 && this.aMap4525 != null) {
			return this.anIntArray4521.length * 2;
		} else {
			int i_3 = 0;
			for (int i_4 = 0; i_4 < this.anIntArray4521.length; i_4++) {
				int i_5 = this.anIntArray4521[i_4];
				if (this.aClass317_4522.method5661(i_5, 2017428513)) {
					++i_3;
				}
				if (this.aClass317_4523.method5661(i_5, -810105857)) {
					++i_3;
				}
			}
			return i_3;
		}
	}

	Class452 method6409(Interface35 interface35_1, int i_2, boolean bool_3, boolean bool_4, byte b_5) {
		if (i_2 == -1) {
			return null;
		} else {
			if (this.anIntArray4521 != null) {
				for (int i_6 = 0; i_6 < this.anIntArray4521.length; i_6++) {
					if (i_2 == this.anIntArray4521[i_6]) {
						return (Class452) this.aMap4525.get(Integer.valueOf(i_6));
					}
				}
			}
			Class452 class452_9 = (Class452) this.aClass229_4524.get((long) (i_2 << 1 | (bool_4 ? 1 : 0)));
			if (class452_9 != null) {
				if (bool_3 && class452_9.anObject5444 == null) {
					FontMetrics fontmetrics_10 = Class163.method2845(this.aClass317_4523, i_2, (byte) 119);
					if (fontmetrics_10 == null) {
						return null;
					}
					class452_9.anObject5444 = fontmetrics_10;
				}
				return class452_9;
			} else {
				byte[] bytes_7 = this.aClass317_4522.getFile(i_2);
				if (bytes_7 == null) {
					return null;
				} else {
					FontMetrics fontmetrics_8 = Class163.method2845(this.aClass317_4523, i_2, (byte) 90);
					if (fontmetrics_8 == null) {
						return null;
					} else {
						if (bool_3) {
							class452_9 = new Class452(interface35_1.method216(bytes_7, fontmetrics_8, bool_4, 1942118537), fontmetrics_8);
						} else {
							class452_9 = new Class452(interface35_1.method216(bytes_7, fontmetrics_8, bool_4, 1942118537), (Object) null);
						}
						this.aClass229_4524.put(class452_9, (long) (i_2 << 1 | (bool_4 ? 1 : 0)));
						return class452_9;
					}
				}
			}
		}
	}

	public void method6410(short s_1) {
		this.aClass229_4524.method3859(-1705560469);
	}

	public void method6411(int i_1, int i_2) {
		this.aClass229_4524.method3858(i_1, (byte) -27);
	}

	public void method6412(int i_1) {
		this.aClass229_4524.method3863(1703943609);
	}

	public FontMetrics method6415(Interface35 interface35_1, int i_2, int i_3) {
		Class452 class452_4 = this.method6409(interface35_1, i_2, true, true, (byte) 1);
		return class452_4 == null ? null : (FontMetrics) class452_4.anObject5444;
	}

	public int method6422(int i_1) {
		return this.anIntArray4521 == null ? 0 : this.anIntArray4521.length * 2;
	}

	public Object method6426(Interface35 interface35_1, int i_2, boolean bool_3, boolean bool_4, int i_5) {
		Class452 class452_6 = this.method6409(interface35_1, i_2, bool_3, bool_4, (byte) 1);
		return class452_6 == null ? null : class452_6.anObject5443;
	}

	public void method6433(int i_1) {
		this.aMap4525 = null;
	}

	public static int method6435(int i_0) {
		return Class96_Sub10_Sub1.anInt10159;
	}

	public static byte[] method6436(String string_0, int i_1) {
		int i_2 = string_0.length();
		if (i_2 == 0) {
			return new byte[0];
		} else {
			int i_3 = i_2 + 3 & ~0x3;
			int i_4 = i_3 / 4 * 3;
			if (i_3 - 2 < i_2 && Class514.method8840(string_0.charAt(i_3 - 2), -1434281035) != -1) {
				if (i_3 - 1 >= i_2 || Class514.method8840(string_0.charAt(i_3 - 1), -1329801870) == -1) {
					--i_4;
				}
			} else {
				i_4 -= 2;
			}
			byte[] bytes_5 = new byte[i_4];
			IncomingPacket.method6375(string_0, bytes_5, 0, -692534854);
			return bytes_5;
		}
	}

	static final void method6438(byte b_0) {
		IndexLoaders.OVERLAY_INDEX_LOADER.method11477(5, (byte) 1);
		IndexLoaders.UNDERLAY_INDEX_LOADER.method8030(5, 1440443465);
		IndexLoaders.aClass31_204.method802(5, -957587210);
		IndexLoaders.MAP_REGION_DECODER.method4436(-1981388866).method7896(5, (byte) -88);
		IndexLoaders.NPC_INDEX_LOADER.method6832(5, 1789161968);
		IndexLoaders.ITEM_INDEX_LOADER.method7156(5, (byte) 44);
		IndexLoaders.ANIMATION_INDEX_LOADER.method11210(5, (byte) -68);
		IndexLoaders.SPOT_ANIM_INDEX_LOADER.method8847(5, 1748344729);
		IndexLoaders.aClass230_147.method3898(5, 1935231941);
		IndexLoaders.aClass377_1065.method6386(5, (byte) 31);
		IndexLoaders.aClass447_435.method7452(5, (byte) 17);
		IndexLoaders.aClass498_3001.method8320(5, 1532833912);
		IndexLoaders.CLAN_VAR_LOADER.method6755(5, (byte) -16);
		IndexLoaders.aClass233_5822.method3923(5, -1373028288);
		IndexLoaders.RENDER_ANIMS.method3615(5, -1820135458);
		IndexLoaders.WORLD_MAP_INDEX_LOADER.method3695(5, -103071229);
		IndexLoaders.aClass427_995.method7173(5, 1756821991);
		IndexLoaders.ITEM_DEFAULTS.method7068(5, -549869828);
		IndexLoaders.aClass288_1746.method5068(5, (byte) -22);
		IndexLoaders.aClass45_5759.method917(5, -1830471227);
		IndexLoaders.aClass436_7683.method7307(5, 675653231);
		IndexLoaders.aClass438_7932.method7326(5, -934687178);
		IndexLoaders.HITSPLAT_INDEX_LOADER.method3602(5, -1179101504);
		IndexLoaders.HITBAR_INDEX.method5107(5, (byte) 14);
		WorldMapIndexLoader.method3709(5, (short) 4421);
		Class439.method7343(50, 827005880);
		Class487.aClass378_5752.method6411(50, -1105244547);
		Class332.method5927(5, (byte) 0);
		ReferenceTable.method5768(5, (byte) -42);
		client.aClass229_7204.method3858(5, (byte) 17);
		Class20.aClass229_191.method3858(5, (byte) 15);
		CS2Runner.aClass229_5901.method3858(5, (byte) -83);
	}
}
