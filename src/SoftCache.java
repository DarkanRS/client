public final class SoftCache {

	Queue aClass477_2855;

	int anInt2853;

	int anInt2852;

	IterableNodeMap aClass465_2854;

	public SoftCache(int i_1, int i_2) {
		this.aClass477_2855 = new Queue();
		this.anInt2853 = i_1;
		this.anInt2852 = i_1;
		int i_3;
		for (i_3 = 1; i_3 + i_3 < i_1 && i_3 < i_2; i_3 += i_3) {
			;
		}
		this.aClass465_2854 = new IterableNodeMap(i_3);
	}

	public void put(Object object_1, long long_2) {
		this.method3857(object_1, long_2, 1, -1866496230);
	}

	public void method3857(Object object_1, long long_2, int i_4, int i_5) {
		if (i_4 > this.anInt2853) {
			throw new IllegalStateException();
		} else {
			this.method3873(long_2);
			this.anInt2852 -= i_4;
			while (this.anInt2852 < 0) {
				Class282_Sub50_Sub1 class282_sub50_sub1_6 = (Class282_Sub50_Sub1) this.aClass477_2855.method7937(-154092419);
				this.method3864(class282_sub50_sub1_6, (byte) 24);
			}
			Class282_Sub50_Sub1_Sub1 class282_sub50_sub1_sub1_7 = new Class282_Sub50_Sub1_Sub1(object_1, i_4);
			this.aClass465_2854.put(class282_sub50_sub1_sub1_7, long_2);
			this.aClass477_2855.method7936(class282_sub50_sub1_sub1_7, -1738910950);
			class282_sub50_sub1_sub1_7.key = 0L;
		}
	}

	public void method3858(int i_1, byte b_2) {
		for (Class282_Sub50_Sub1 class282_sub50_sub1_3 = (Class282_Sub50_Sub1) this.aClass477_2855.method7941((byte) 4); class282_sub50_sub1_3 != null; class282_sub50_sub1_3 = (Class282_Sub50_Sub1) this.aClass477_2855.method7955(-1108267960)) {
			if (class282_sub50_sub1_3.method14691(-436752315)) {
				if (class282_sub50_sub1_3.method14692(-264417270) == null) {
					class282_sub50_sub1_3.remove();
					class282_sub50_sub1_3.method13452();
					this.anInt2852 += class282_sub50_sub1_3.anInt9451;
				}
			} else if (++class282_sub50_sub1_3.key > (long) i_1) {
				Class282_Sub50_Sub1_Sub2 class282_sub50_sub1_sub2_4 = new Class282_Sub50_Sub1_Sub2(class282_sub50_sub1_3.method14692(-264417270), class282_sub50_sub1_3.anInt9451);
				this.aClass465_2854.put(class282_sub50_sub1_sub2_4, class282_sub50_sub1_3.data);
				Class224.method3782(class282_sub50_sub1_sub2_4, class282_sub50_sub1_3, -782987779);
				class282_sub50_sub1_3.remove();
				class282_sub50_sub1_3.method13452();
			}
		}
	}

	public void method3859(int i_1) {
		this.aClass477_2855.method7935((byte) 38);
		this.aClass465_2854.method7749(-1780649231);
		this.anInt2852 = this.anInt2853;
	}

	public int method3860(byte b_1) {
		return this.anInt2853;
	}

	public int method3861(byte b_1) {
		return this.anInt2852;
	}

	public int method3862(byte b_1) {
		int i_2 = 0;
		for (Class282_Sub50_Sub1 class282_sub50_sub1_3 = (Class282_Sub50_Sub1) this.aClass477_2855.method7941((byte) 4); class282_sub50_sub1_3 != null; class282_sub50_sub1_3 = (Class282_Sub50_Sub1) this.aClass477_2855.method7955(-124475022)) {
			if (!class282_sub50_sub1_3.method14691(-1137158918)) {
				++i_2;
			}
		}
		return i_2;
	}

	public void method3863(int i_1) {
		for (Class282_Sub50_Sub1 class282_sub50_sub1_2 = (Class282_Sub50_Sub1) this.aClass477_2855.method7941((byte) 4); class282_sub50_sub1_2 != null; class282_sub50_sub1_2 = (Class282_Sub50_Sub1) this.aClass477_2855.method7955(-586582507)) {
			if (class282_sub50_sub1_2.method14691(1940847824)) {
				class282_sub50_sub1_2.remove();
				class282_sub50_sub1_2.method13452();
				this.anInt2852 += class282_sub50_sub1_2.anInt9451;
			}
		}
	}

	void method3864(Class282_Sub50_Sub1 class282_sub50_sub1_1, byte b_2) {
		if (class282_sub50_sub1_1 != null) {
			class282_sub50_sub1_1.remove();
			class282_sub50_sub1_1.method13452();
			this.anInt2852 += class282_sub50_sub1_1.anInt9451;
		}
	}

	public Object get(long long_1) {
		Class282_Sub50_Sub1 class282_sub50_sub1_3 = (Class282_Sub50_Sub1) this.aClass465_2854.get(long_1);
		if (class282_sub50_sub1_3 == null) {
			return null;
		} else {
			Object object_4 = class282_sub50_sub1_3.method14692(-264417270);
			if (object_4 == null) {
				class282_sub50_sub1_3.remove();
				class282_sub50_sub1_3.method13452();
				this.anInt2852 += class282_sub50_sub1_3.anInt9451;
				return null;
			} else {
				if (class282_sub50_sub1_3.method14691(279512561)) {
					Class282_Sub50_Sub1_Sub1 class282_sub50_sub1_sub1_5 = new Class282_Sub50_Sub1_Sub1(object_4, class282_sub50_sub1_3.anInt9451);
					this.aClass465_2854.put(class282_sub50_sub1_sub1_5, class282_sub50_sub1_3.data);
					this.aClass477_2855.method7936(class282_sub50_sub1_sub1_5, -1738910950);
					class282_sub50_sub1_sub1_5.key = 0L;
					class282_sub50_sub1_3.remove();
					class282_sub50_sub1_3.method13452();
				} else {
					this.aClass477_2855.method7936(class282_sub50_sub1_3, -1738910950);
					class282_sub50_sub1_3.key = 0L;
				}
				return object_4;
			}
		}
	}

	public SoftCache(int i_1) {
		this(i_1, i_1);
	}

	public Object method3866(int i_1) {
		Class282_Sub50_Sub1 class282_sub50_sub1_4;
		for (Class282_Sub50_Sub1 class282_sub50_sub1_2 = (Class282_Sub50_Sub1) this.aClass465_2854.method7750(426226201); class282_sub50_sub1_2 != null; this.anInt2852 += class282_sub50_sub1_4.anInt9451) {
			Object object_3 = class282_sub50_sub1_2.method14692(-264417270);
			if (object_3 != null) {
				return object_3;
			}
			class282_sub50_sub1_4 = class282_sub50_sub1_2;
			class282_sub50_sub1_2 = (Class282_Sub50_Sub1) this.aClass465_2854.method7751((byte) 100);
			class282_sub50_sub1_4.remove();
			class282_sub50_sub1_4.method13452();
		}
		return null;
	}

	public Object method3867(int i_1) {
		Class282_Sub50_Sub1 class282_sub50_sub1_4;
		for (Class282_Sub50_Sub1 class282_sub50_sub1_2 = (Class282_Sub50_Sub1) this.aClass465_2854.method7751((byte) 50); class282_sub50_sub1_2 != null; this.anInt2852 += class282_sub50_sub1_4.anInt9451) {
			Object object_3 = class282_sub50_sub1_2.method14692(-264417270);
			if (object_3 != null) {
				return object_3;
			}
			class282_sub50_sub1_4 = class282_sub50_sub1_2;
			class282_sub50_sub1_2 = (Class282_Sub50_Sub1) this.aClass465_2854.method7751((byte) 125);
			class282_sub50_sub1_4.remove();
			class282_sub50_sub1_4.method13452();
		}
		return null;
	}

	public void method3873(long long_1) {
		Class282_Sub50_Sub1 class282_sub50_sub1_3 = (Class282_Sub50_Sub1) this.aClass465_2854.get(long_1);
		this.method3864(class282_sub50_sub1_3, (byte) -6);
	}

	static void method3895(double d_0) {
		if (d_0 != TextureDefinition.aDouble9479) {
			for (int i_2 = 0; i_2 < 256; i_2++) {
				int i_3 = (int) (Math.pow((double) i_2 / 255.0D, d_0) * 255.0D);
				TextureDefinition.anIntArray9474[i_2] = i_3 > 255 ? 255 : i_3;
			}
			TextureDefinition.aDouble9479 = d_0;
		}
	}
}
