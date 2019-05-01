import java.util.Queue;

public class RenderAnimIndexLoader {

	public static BASDefinitions aClass227_2669 = new BASDefinitions();

	SoftCache renderAnimCache = new SoftCache(64);

	Index aClass317_2671;

	EquipmentDefaults aClass526_2672;

	public void method3615() {
		SoftCache softcache_3 = this.renderAnimCache;
		synchronized (this.renderAnimCache) {
			this.renderAnimCache.method3858(5);
		}
	}

	public BASDefinitions getBASDefs(int i_1, byte b_2) {
		SoftCache softcache_4 = this.renderAnimCache;
		BASDefinitions renderanimdefs_3;
		synchronized (this.renderAnimCache) {
			renderanimdefs_3 = (BASDefinitions) this.renderAnimCache.get((long) i_1);
		}
		if (renderanimdefs_3 != null) {
			renderanimdefs_3.renderAnimId = i_1;
			return renderanimdefs_3;
		} else {
			Index index_5 = this.aClass317_2671;
			byte[] bytes_10;
			synchronized (this.aClass317_2671) {
				bytes_10 = this.aClass317_2671.getFile(SharedConfigsType.RENDER_ANIMS.id, i_1);
			}
			renderanimdefs_3 = new BASDefinitions();
			renderanimdefs_3.renderAnimId = i_1;
			renderanimdefs_3.aClass211_2788 = this;
			if (bytes_10 != null) {
				renderanimdefs_3.method3821(new RsByteBuffer(bytes_10));
			}
			SoftCache softcache_9 = this.renderAnimCache;
			synchronized (this.renderAnimCache) {
				this.renderAnimCache.put(renderanimdefs_3, (long) i_1);
				return renderanimdefs_3;
			}
		}
	}

	public void method3617() {
		SoftCache softcache_2 = this.renderAnimCache;
		synchronized (this.renderAnimCache) {
			this.renderAnimCache.method3859();
		}
	}

	public void method3618() {
		SoftCache softcache_2 = this.renderAnimCache;
		synchronized (this.renderAnimCache) {
			this.renderAnimCache.method3863();
		}
	}

	public RenderAnimIndexLoader(Game game_1, Language xlanguage_2, Index index_3, EquipmentDefaults defaults6loader_4) {
		this.aClass317_2671 = index_3;
		this.aClass317_2671.filesCount(SharedConfigsType.RENDER_ANIMS.id);
		this.aClass526_2672 = defaults6loader_4;
	}

	static final void method3629(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
		if (!MovingAnimation.isInterfaceLoaded(i_0, (int[]) null, -1707980188)) {
			if (i_7 != -1) {
				client.aBoolArray7443[i_7] = true;
			} else {
				for (int i_9 = 0; i_9 < 107; i_9++) {
					client.aBoolArray7443[i_9] = true;
				}
			}
		} else {
			GroundDecoration.method16094(Preference_Sub8.INTERFACES[i_0].method1616(2127300382), -1, i_1, i_2, i_3, i_4, i_5, i_6, i_7, i_7 < 0);
		}
	}

	public static void method3630() {
		Queue queue_1 = Class236.aQueue2914;
		synchronized (Class236.aQueue2914) {
			while (true) {
				MouseRecord_Sub1 class282_sub53_sub1_2 = (MouseRecord_Sub1) Class236.aQueue2914.poll();
				if (class282_sub53_sub1_2 == null) {
					return;
				}
				class282_sub53_sub1_2.cache(-1123290307);
			}
		}
	}

	public static void method3631(int i_0) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(3, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) -28);
	}
}
