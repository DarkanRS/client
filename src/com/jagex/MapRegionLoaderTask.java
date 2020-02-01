package com.jagex;
import java.util.LinkedList;

public class MapRegionLoaderTask implements Runnable {

	static int anInt3991;

	MapRegion region = new MapRegion(true);

	volatile boolean aBool3989 = false;

	LinkedList aLinkedList3990 = new LinkedList();

	public void method6049(Class335 class335_1) {
		LinkedList linkedlist_3 = this.aLinkedList3990;
		synchronized (this.aLinkedList3990) {
			this.aLinkedList3990.add(class335_1);
			this.aLinkedList3990.notify();
		}
	}

	void method6050(MapRegion mapregion_1) {
		this.region = mapregion_1;
	}

	public boolean method6051() {
		return this.aBool3989;
	}

	public MapRegion method6052(short s_1) {
		return this.region;
	}

	void method6054() {
		Object obj_2 = null;
		LinkedList linkedlist_4 = this.aLinkedList3990;
		Class335 class335_3;
		synchronized (this.aLinkedList3990) {
			try {
				this.aLinkedList3990.wait();
			} catch (InterruptedException interruptedexception_6) {
				;
			}
			class335_3 = (Class335) this.aLinkedList3990.pollFirst();
		}
		try {
			try {
				if (class335_3 != null) {
					this.aBool3989 = true;
					this.method6055(class335_3);
				}
			} catch (Exception exception_8) {
				this.aBool3989 = false;
				return;
			}
			this.aBool3989 = false;
		} catch (Exception exception_9) {
			this.aBool3989 = false;
		}
	}

	void method6055(Class335 class335_1) {
		if (Class256.aClass256_3152 == class335_1.aClass256_3915) {
			this.region.method4547((byte) -52);
		} else {
			this.region.method4499(class335_1, 233576206);
		}
		for (boolean bool_3 = this.region.method4461((byte) -10); !bool_3; bool_3 = this.region.method4461((byte) -76)) {
			;
		}
		this.region.method4445((byte) -92);
		IndexLoaders.MAP_REGION_DECODER.method4445((byte) -40);
	}

	public void setObjectIndexLoader(ObjectIndexLoader objectindexloader_1) {
		this.region.setObjectIndexLoader(objectindexloader_1);
	}

	public void run() {
		while (true) {
			this.method6054();
		}
	}
}
