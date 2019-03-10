public final class Class223 {

	public static Language CURRENT_LANGUAGE;

	int anInt2769;

	CacheableNode aClass282_Sub50_2770 = new CacheableNode();

	Queue aClass477_2767 = new Queue();

	int anInt2768;

	IterableNodeMap aClass465_2771;

	public CacheableNode method3758(long long_1) {
		CacheableNode cacheablenode_3 = (CacheableNode) this.aClass465_2771.get(long_1);
		if (cacheablenode_3 != null) {
			this.aClass477_2767.method7936(cacheablenode_3, -1738910950);
		}
		return cacheablenode_3;
	}

	public void method3759(CacheableNode cacheablenode_1, long long_2) {
		if (this.anInt2769 == 0) {
			CacheableNode cacheablenode_4 = this.aClass477_2767.method7937(600411374);
			cacheablenode_4.remove();
			cacheablenode_4.method13452();
			if (cacheablenode_4 == this.aClass282_Sub50_2770) {
				cacheablenode_4 = this.aClass477_2767.method7937(1037693707);
				cacheablenode_4.remove();
				cacheablenode_4.method13452();
			}
		} else {
			--this.anInt2769;
		}
		this.aClass465_2771.put(cacheablenode_1, long_2);
		this.aClass477_2767.method7936(cacheablenode_1, -1738910950);
	}

	public Class223(int i_1) {
		this.anInt2768 = i_1;
		this.anInt2769 = i_1;
		int i_2;
		for (i_2 = 1; i_2 + i_2 < i_1; i_2 += i_2) {
			;
		}
		this.aClass465_2771 = new IterableNodeMap(i_2);
	}

	public void method3760(int i_1) {
		this.aClass477_2767.method7935((byte) -14);
		this.aClass465_2771.method7749(-1319395120);
		this.aClass282_Sub50_2770 = new CacheableNode();
		this.anInt2769 = this.anInt2768;
	}

	public static void method3770(byte b_0) {
		if (Class93.method1576(285718929)) {
			Class169.method2877(new Class237(), (byte) 125);
		}
	}
}
