import java.util.Iterator;

public class Class451 implements Iterator {

	Node aClass282_5441 = null;
	IterableNodeMap aClass465_5439;
	int anInt5442;
	Node aClass282_5440;

	public Node method7503(int i_1) {
		this.method7512(789041827);
		return (Node) this.next();
	}

	public Class451(IterableNodeMap iterablenodemap_1) {
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

	public static boolean method7517(byte b_0) {
		Class282_Sub42 class282_sub42_1 = (Class282_Sub42) Class435.aClass482_5332.head((byte) 42);
		return class282_sub42_1 != null;
	}

	static final void method7518(CS2Executor cs2executor_0, byte b_1) {
		NodeCollection.method8146(-1130869373);
	}

	static Class411[] method7519(short s_0) {
		return new Class411[] { Class411.aClass411_4928, Class411.aClass411_4952, Class411.aClass411_4939, Class411.aClass411_4954, Class411.aClass411_4942, Class411.aClass411_4948, Class411.aClass411_4941, Class411.aClass411_4953, Class411.aClass411_4934, Class411.aClass411_4926, Class411.aClass411_4951, Class411.aClass411_4930, Class411.aClass411_4935, Class411.aClass411_4946, Class411.aClass411_4927, Class411.aClass411_4944, Class411.aClass411_4943, Class411.aClass411_4931, Class411.aClass411_4949, Class411.aClass411_4940, Class411.aClass411_4936, Class411.aClass411_4947, Class411.aClass411_4925, Class411.aClass411_4929, Class411.aClass411_4955, Class411.aClass411_4950, Class411.aClass411_4937, Class411.aClass411_4932, Class411.aClass411_4933, Class411.aClass411_4938, Class411.aClass411_4945 };
	}

	static final void method7520(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 58);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class282_Sub11.method12209(icomponentdefinitions_3, interface_4, cs2executor_0, 1467575804);
	}

	static final void method7521(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.water.getValue(308447312) == 2 ? 1 : 0;
	}

	static final void method7522(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class344.method6122(icomponentdefinitions_3, interface_4, cs2executor_0, -345845771);
	}

}
