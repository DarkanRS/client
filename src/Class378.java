import java.util.HashMap;
import java.util.Map;

public class Class378 {

	Map aMap4525 = null;
	SoftCache aClass229_4524 = new SoftCache(20);
	Index loadingFontIndex;
	Index fontMetricIndex;
	int[] indices;

	public void method6403(Interface35 interface35_1) {
		this.aMap4525 = new HashMap(this.indices.length);
		for (int i_3 = 0; i_3 < this.indices.length; i_3++) {
			int i_4 = this.indices[i_3];
			FontMetrics fontmetrics_5 = Class163.method2845(this.fontMetricIndex, i_4, (byte) 31);
			byte[] bytes_6 = this.loadingFontIndex.getFile(i_4);
			Object object_7 = interface35_1.method216(bytes_6, fontmetrics_5, true);
			this.aMap4525.put(Integer.valueOf(i_3), new Class452(object_7, fontmetrics_5));
		}
	}

	public Class378(Index index_1, Index index_2, int[] fontSpecs) {
		this.loadingFontIndex = index_1;
		this.fontMetricIndex = index_2;
		if (fontSpecs != null) {
			this.indices = fontSpecs;
		} else {
			this.indices = null;
		}
	}

	public int method6404() {
		return this.method6405(false, 1676950204);
	}

	public int method6405(boolean bool_1, int i_2) {
		if (this.indices == null) {
			return 0;
		} else if (!bool_1 && this.aMap4525 != null) {
			return this.indices.length * 2;
		} else {
			int i_3 = 0;
			for (int i_4 = 0; i_4 < this.indices.length; i_4++) {
				int i_5 = this.indices[i_4];
				if (this.loadingFontIndex.loadFile(i_5)) {
					++i_3;
				}
				if (this.fontMetricIndex.loadFile(i_5)) {
					++i_3;
				}
			}
			return i_3;
		}
	}

	Class452 method6409(Interface35 interface35_1, int i_2, boolean bool_3, boolean bool_4) {
		if (i_2 == -1) {
			return null;
		} else {
			if (this.indices != null) {
				for (int i_6 = 0; i_6 < this.indices.length; i_6++) {
					if (i_2 == this.indices[i_6]) {
						return (Class452) this.aMap4525.get(Integer.valueOf(i_6));
					}
				}
			}
			Class452 class452_9 = (Class452) this.aClass229_4524.get((long) (i_2 << 1 | (bool_4 ? 1 : 0)));
			if (class452_9 != null) {
				if (bool_3 && class452_9.anObject5444 == null) {
					FontMetrics fontmetrics_10 = Class163.method2845(this.fontMetricIndex, i_2, (byte) 119);
					if (fontmetrics_10 == null) {
						return null;
					}
					class452_9.anObject5444 = fontmetrics_10;
				}
				return class452_9;
			} else {
				byte[] bytes_7 = this.loadingFontIndex.getFile(i_2);
				if (bytes_7 == null) {
					return null;
				} else {
					FontMetrics fontmetrics_8 = Class163.method2845(this.fontMetricIndex, i_2, (byte) 90);
					if (fontmetrics_8 == null) {
						return null;
					} else {
						if (bool_3) {
							class452_9 = new Class452(interface35_1.method216(bytes_7, fontmetrics_8, bool_4), fontmetrics_8);
						} else {
							class452_9 = new Class452(interface35_1.method216(bytes_7, fontmetrics_8, bool_4), (Object) null);
						}
						this.aClass229_4524.put(class452_9, (long) (i_2 << 1 | (bool_4 ? 1 : 0)));
						return class452_9;
					}
				}
			}
		}
	}

	public void method6410() {
		this.aClass229_4524.method3859(-1705560469);
	}

	public void method6411() {
		this.aClass229_4524.method3858(50, (byte) -27);
	}

	public void method6412() {
		this.aClass229_4524.method3863(1703943609);
	}

	public FontMetrics method6415(Interface35 interface35_1, int i_2, int i_3) {
		Class452 class452_4 = this.method6409(interface35_1, i_2, true, true);
		return class452_4 == null ? null : (FontMetrics) class452_4.anObject5444;
	}

	public int method6422(int i_1) {
		return this.indices == null ? 0 : this.indices.length * 2;
	}

	public Object method6426(Interface35 interface35_1, int i_2, boolean bool_3, boolean bool_4, int i_5) {
		Class452 class452_6 = this.method6409(interface35_1, i_2, bool_3, bool_4);
		return class452_6 == null ? null : class452_6.anObject5443;
	}

	public void method6433() {
		this.aMap4525 = null;
	}

	public static int method6435() {
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
			IncomingPacket.method6375(string_0, bytes_5, 0);
			return bytes_5;
		}
	}

	static final void method6438() {
		IndexLoaders.OVERLAY_LOADER.method11477();
		IndexLoaders.UNDERLAY_LOADER.method8030();
		IndexLoaders.IDENTITI_KIT_LOADER.method802();
		IndexLoaders.MAP_REGION_DECODER.method4436(-1981388866).method7896();
		IndexLoaders.NPC_INDEX_LOADER.method6832();
		IndexLoaders.ITEM_LOADER.method7156();
		IndexLoaders.ANIMATION_LOADER.method11210();
		IndexLoaders.SPOT_ANIM_LOADER.method8847();
		IndexLoaders.VARBIT_LOADER.method3898();
		IndexLoaders.VAR_LOADER.method6386();
		IndexLoaders.SCT24_LOADER.method7452();
		IndexLoaders.SCT25_LOADER.method8320();
		IndexLoaders.CLAN_VAR_LOADER.method6755();
		IndexLoaders.CLAN_VAR_SETTINGS_LOADER.method3923();
		IndexLoaders.RENDER_ANIM_LOADER.method3615();
		IndexLoaders.WORLD_MAP_LOADER.method3695();
		IndexLoaders.MAP_SPRITE_LOADER.method7173();
		IndexLoaders.PARAM_LOADER.method7068();
		IndexLoaders.SKYBOX_LOADER.method5068();
		IndexLoaders.SUN_LOADER.method917();
		IndexLoaders.LIGHT_INTENSITY_LOADER.method7307();
		IndexLoaders.CURSOR_LOADER.method7326();
		IndexLoaders.HITSPLAT_LOADER.method3602();
		IndexLoaders.HITBAR_LOADER.method5107();
		MapAreaIndexLoader.method3709();
		Class439.method7343();
		Class487.aClass378_5752.method6411();
		Class332.method5927();
		ReferenceTable.method5768();
		client.aClass229_7204.method3858(5, (byte) 17);
		Class20.aClass229_191.method3858(5, (byte) 15);
		CS2Runner.aClass229_5901.method3858(5, (byte) -83);
	}
}
