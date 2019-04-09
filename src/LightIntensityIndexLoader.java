public class LightIntensityIndexLoader {

	SoftCache aClass229_5334 = new SoftCache(64);
	Index aClass317_5333;

	public LightIntensityDefinitions method7304(int i_1, byte b_2) {
		SoftCache softcache_4 = this.aClass229_5334;
		LightIntensityDefinitions class416_3;
		synchronized (this.aClass229_5334) {
			class416_3 = (LightIntensityDefinitions) this.aClass229_5334.get((long) i_1);
		}

		if (class416_3 != null) {
			return class416_3;
		} else {
			Index index_5 = this.aClass317_5333;
			byte[] bytes_10;
			synchronized (this.aClass317_5333) {
				bytes_10 = this.aClass317_5333.getFile(SharedConfigsType.LIGHT_INTENSITIES.id, i_1);
			}

			class416_3 = new LightIntensityDefinitions();
			if (bytes_10 != null) {
				class416_3.method6999(new RsByteBuffer(bytes_10));
			}

			SoftCache softcache_9 = this.aClass229_5334;
			synchronized (this.aClass229_5334) {
				this.aClass229_5334.put(class416_3, (long) i_1);
				return class416_3;
			}
		}
	}

	public void method7306() {
		SoftCache softcache_2 = this.aClass229_5334;
		synchronized (this.aClass229_5334) {
			this.aClass229_5334.method3859(1100969051);
		}
	}

	public void method7307() {
		SoftCache softcache_3 = this.aClass229_5334;
		synchronized (this.aClass229_5334) {
			this.aClass229_5334.method3858(5, (byte) 12);
		}
	}

	public void method7308() {
		SoftCache softcache_2 = this.aClass229_5334;
		synchronized (this.aClass229_5334) {
			this.aClass229_5334.method3863(1784570586);
		}
	}

	public LightIntensityIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_5333 = index_3;
		this.aClass317_5333.filesCount(SharedConfigsType.LIGHT_INTENSITIES.id);
	}

	static final void method7313(Class282_Sub44 class282_sub44_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, byte b_10) {
		if (MovingAnimation.isInterfaceLoaded(i_1, (int[]) null, -149079200)) {
			if (class282_sub44_0 != null && !class282_sub44_0.method13401()) {
				Class351.closeChildren(class282_sub44_0, true, false, -1434411886);
			} else {
				Interface interface_11 = Class468_Sub8.INTERFACES[i_1];
				client.method11768(interface_11, interface_11.method1616(2121969346), -1, i_2, i_3, i_4, i_5, i_6, i_7, i_8, i_9);
			}
		}

	}

}
