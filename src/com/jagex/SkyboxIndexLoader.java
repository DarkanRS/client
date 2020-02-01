package com.jagex;
import java.util.Date;

public class SkyboxIndexLoader {

	static FontMetrics aClass414_3438;
	SoftCache aClass229_3437 = new SoftCache(16);
	Index aClass317_3436;

	public void method5068() {
		SoftCache softcache_3 = this.aClass229_3437;
		synchronized (this.aClass229_3437) {
			this.aClass229_3437.method3858(5);
		}
	}

	public void method5070() {
		SoftCache softcache_2 = this.aClass229_3437;
		synchronized (this.aClass229_3437) {
			this.aClass229_3437.method3859();
		}
	}

	public SkyboxIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_3436 = index_3;
		this.aClass317_3436.filesCount(SharedConfigsType.SKYBOX.id);
	}

	public void method5071() {
		SoftCache softcache_2 = this.aClass229_3437;
		synchronized (this.aClass229_3437) {
			this.aClass229_3437.method3863();
		}
	}

	SkyboxDefinitions method5072(int i_1) {
		SoftCache softcache_4 = this.aClass229_3437;
		SkyboxDefinitions class207_3;
		synchronized (this.aClass229_3437) {
			class207_3 = (SkyboxDefinitions) this.aClass229_3437.get((long) i_1);
		}
		if (class207_3 != null) {
			return class207_3;
		} else {
			Index index_5 = this.aClass317_3436;
			byte[] bytes_10;
			synchronized (this.aClass317_3436) {
				bytes_10 = this.aClass317_3436.getFile(SharedConfigsType.SKYBOX.id, i_1);
			}
			class207_3 = new SkyboxDefinitions();
			if (bytes_10 != null) {
				class207_3.method3549(new RsByteBuffer(bytes_10));
			}
			SoftCache softcache_9 = this.aClass229_3437;
			synchronized (this.aClass229_3437) {
				this.aClass229_3437.put(class207_3, (long) i_1);
				return class207_3;
			}
		}
	}

	public Class247 method5077(int i_1, int i_2, int i_3, int i_4, SunIndexLoader class45_5, int i_6) {
		Class334[] arr_7 = null;
		SkyboxDefinitions class207_8 = this.method5072(i_1);
		if (class207_8.anIntArray2655 != null) {
			arr_7 = new Class334[class207_8.anIntArray2655.length];
			for (int i_9 = 0; i_9 < arr_7.length; i_9++) {
				SunDefinitions class38_10 = class45_5.method914(class207_8.anIntArray2655[i_9]);
				arr_7[i_9] = new Class334(class38_10.anInt395, class38_10.anInt402, class38_10.anInt401, class38_10.anInt397, class38_10.anInt399, class38_10.anInt396, class38_10.anInt404, class38_10.aBool400, class38_10.anInt403, class38_10.anInt398, class38_10.anInt405);
			}
		}
		return new Class247(class207_8.anInt2653, arr_7, class207_8.anInt2654, i_2, i_3, i_4, class207_8.aClass204_2656, class207_8.anInt2657);
	}

	static void method5083(long long_0) {
		Class407.aCalendar4846.setTime(new Date(long_0));
	}

	public static RSInterface getInterface(int interfaceId, int[] ints_1, RSInterface interface_2, boolean bool_3, byte b_4) {
		if (!Class388.INTERFACE_INDEX.loadArchive(interfaceId)) {
			return null;
		} else {
			int componentSize = Class388.INTERFACE_INDEX.filesCount(interfaceId);
			IComponentDefinitions[] arr_6;
			if (componentSize == 0) {
				arr_6 = new IComponentDefinitions[0];
			} else if (interface_2 == null) {
				arr_6 = new IComponentDefinitions[componentSize];
			} else {
				arr_6 = interface_2.components;
			}
			if (interface_2 == null) {
				interface_2 = new RSInterface(bool_3, arr_6);
			} else {
				interface_2.components = arr_6;
				interface_2.aBool999 = bool_3;
			}
			for (int i = 0; i < componentSize; i++) {
				if (interface_2.components[i] == null) {
					byte[] bytes_8 = Class388.INTERFACE_INDEX.getFile(interfaceId, i, ints_1);
					if (bytes_8 != null) {
						IComponentDefinitions component = interface_2.components[i] = new IComponentDefinitions();
						component.idHash = i + (interfaceId << 16);
						component.readValues(new RsByteBuffer(bytes_8));
					}
				}
			}
			return interface_2;
		}
	}
}
