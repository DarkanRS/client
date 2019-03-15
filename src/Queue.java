import java.util.Iterator;

public class Queue implements Iterable {

	static int anInt5630;

	static ParticleSystem[] aClass539Array5632;

	public CacheableNode aClass282_Sub50_5629 = new CacheableNode();

	CacheableNode aClass282_Sub50_5631;

	public void method7935(byte b_1) {
		while (this.aClass282_Sub50_5629.aClass282_Sub50_8119 != this.aClass282_Sub50_5629) {
			this.aClass282_Sub50_5629.aClass282_Sub50_8119.method13452();
		}
	}

	public void method7936(CacheableNode cacheablenode_1) {
		if (cacheablenode_1.current != null) {
			cacheablenode_1.method13452();
		}
		cacheablenode_1.current = this.aClass282_Sub50_5629.current;
		cacheablenode_1.aClass282_Sub50_8119 = this.aClass282_Sub50_5629;
		cacheablenode_1.current.aClass282_Sub50_8119 = cacheablenode_1;
		cacheablenode_1.aClass282_Sub50_8119.current = cacheablenode_1;
	}

	public CacheableNode method7937(int i_1) {
		CacheableNode cacheablenode_2 = this.aClass282_Sub50_5629.aClass282_Sub50_8119;
		if (cacheablenode_2 == this.aClass282_Sub50_5629) {
			return null;
		} else {
			cacheablenode_2.method13452();
			return cacheablenode_2;
		}
	}

	public int size(int i_1) {
		int i_2 = 0;
		for (CacheableNode cacheablenode_3 = this.aClass282_Sub50_5629.aClass282_Sub50_8119; cacheablenode_3 != this.aClass282_Sub50_5629; cacheablenode_3 = cacheablenode_3.aClass282_Sub50_8119) {
			++i_2;
		}
		return i_2;
	}

	public Queue() {
		this.aClass282_Sub50_5629.aClass282_Sub50_8119 = this.aClass282_Sub50_5629;
		this.aClass282_Sub50_5629.current = this.aClass282_Sub50_5629;
	}

	public CacheableNode method7941() {
		return this.method7946((CacheableNode) null);
	}

	CacheableNode method7946(CacheableNode cacheablenode_1) {
		CacheableNode cacheablenode_3;
		if (cacheablenode_1 == null) {
			cacheablenode_3 = this.aClass282_Sub50_5629.aClass282_Sub50_8119;
		} else {
			cacheablenode_3 = cacheablenode_1;
		}
		if (cacheablenode_3 == this.aClass282_Sub50_5629) {
			this.aClass282_Sub50_5631 = null;
			return null;
		} else {
			this.aClass282_Sub50_5631 = cacheablenode_3.aClass282_Sub50_8119;
			return cacheablenode_3;
		}
	}

	public CacheableNode method7955(int i_1) {
		CacheableNode cacheablenode_2 = this.aClass282_Sub50_5631;
		if (cacheablenode_2 == this.aClass282_Sub50_5629) {
			this.aClass282_Sub50_5631 = null;
			return null;
		} else {
			this.aClass282_Sub50_5631 = cacheablenode_2.aClass282_Sub50_8119;
			return cacheablenode_2;
		}
	}

	public Iterator iterator() {
		return new Class469(this);
	}

	public static void method7960(Index index_0) {
		Class16.p11FullIndex = index_0.getArchiveId("p11_full");
		Class16.anInt136 = index_0.getArchiveId("p12_full");
		Class395.anInt4788 = index_0.getArchiveId("b12_full");
	}
}
