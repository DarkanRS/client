import java.util.Iterator;

public class HashTableIterator implements Iterator {

	Node aClass282_5441 = null;

	IterableNodeMap aClass465_5439;

	int anInt5442;

	Node aClass282_5440;

	public Node first() {
		this.method7512(789041827);
		return (Node) this.next();
	}

	public HashTableIterator(IterableNodeMap iterablenodemap_1) {
		this.aClass465_5439 = iterablenodemap_1;
		this.method7512(-303095976);
	}

	public boolean hasNext() {
		if (this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1] != this.aClass282_5440) {
			return true;
		} else {
			while (this.anInt5442 < this.aClass465_5439.anInt5560) {
				if (this.aClass465_5439.aClass282Array5558[++this.anInt5442 - 1].next != this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1]) {
					this.aClass282_5440 = this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1].next;
					return true;
				}
				this.aClass282_5440 = this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1];
			}
			return false;
		}
	}

	public void remove() {
		if (this.aClass282_5441 == null) {
			throw new IllegalStateException();
		} else {
			this.aClass282_5441.remove();
			this.aClass282_5441 = null;
		}
	}

	public Object next() {
		Node node_1;
		if (this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1] != this.aClass282_5440) {
			node_1 = this.aClass282_5440;
			this.aClass282_5440 = node_1.next;
			this.aClass282_5441 = node_1;
			return node_1;
		} else {
			while (this.anInt5442 < this.aClass465_5439.anInt5560) {
				node_1 = this.aClass465_5439.aClass282Array5558[++this.anInt5442 - 1].next;
				if (node_1 != this.aClass465_5439.aClass282Array5558[this.anInt5442 - 1]) {
					this.aClass282_5440 = node_1.next;
					this.aClass282_5441 = node_1;
					return node_1;
				}
			}
			return null;
		}
	}

	void method7512(int i_1) {
		this.aClass282_5440 = this.aClass465_5439.aClass282Array5558[0].next;
		this.anInt5442 = 1;
		this.aClass282_5441 = null;
	}

	public static boolean method7517() {
		Class282_Sub42 class282_sub42_1 = (Class282_Sub42) Class435.aClass482_5332.head((byte) 42);
		return class282_sub42_1 != null;
	}

	static CutsceneActionType[] method7519() {
		return new CutsceneActionType[] { CutsceneActionType.aClass411_4928, CutsceneActionType.aClass411_4952, CutsceneActionType.aClass411_4939, CutsceneActionType.aClass411_4954, CutsceneActionType.aClass411_4942, CutsceneActionType.aClass411_4948, CutsceneActionType.aClass411_4941, CutsceneActionType.aClass411_4953, CutsceneActionType.aClass411_4934, CutsceneActionType.aClass411_4926, CutsceneActionType.aClass411_4951, CutsceneActionType.aClass411_4930, CutsceneActionType.aClass411_4935, CutsceneActionType.aClass411_4946, CutsceneActionType.aClass411_4927, CutsceneActionType.aClass411_4944, CutsceneActionType.aClass411_4943, CutsceneActionType.aClass411_4931, CutsceneActionType.aClass411_4949, CutsceneActionType.aClass411_4940, CutsceneActionType.aClass411_4936, CutsceneActionType.aClass411_4947, CutsceneActionType.aClass411_4925, CutsceneActionType.aClass411_4929, CutsceneActionType.aClass411_4955, CutsceneActionType.aClass411_4950, CutsceneActionType.aClass411_4937, CutsceneActionType.aClass411_4932, CutsceneActionType.aClass411_4933, CutsceneActionType.aClass411_4938, CutsceneActionType.aClass411_4945 };
	}
}
