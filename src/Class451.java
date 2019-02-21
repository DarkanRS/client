
/* Class451 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class451 implements Iterator {
	IterableNodeMap aClass465_5439;
	Node aClass282_5440;
	Node aClass282_5441 = null;
	int anInt5442;

	public Node method7503(int i) {
		method7512(789041827);
		return (Node) next();
	}

	public Class451(IterableNodeMap class465) {
		((Class451) this).aClass465_5439 = class465;
		method7512(-303095976);
	}

	public boolean method7504() {
		if (((Class451) this).aClass282_5440 != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1]))
			return true;
		while (-965471089 * ((Class451) this).anInt5442 < (((IterableNodeMap) ((Class451) this).aClass465_5439).anInt5560 * 25900449)) {
			if ((((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((((Class451) this).anInt5442 += -1123382673) * -965471089 - 1)].prev) != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((Class451) this).anInt5442 * -965471089 - 1])) {
				((Class451) this).aClass282_5440 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1].prev);
				return true;
			}
			((Class451) this).aClass282_5440 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1]);
		}
		return false;
	}

	public Object method7505() {
		if (((Class451) this).aClass282_5440 != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1])) {
			Node class282 = ((Class451) this).aClass282_5440;
			((Class451) this).aClass282_5440 = class282.prev;
			((Class451) this).aClass282_5441 = class282;
			return class282;
		}
		while (((Class451) this).anInt5442 * -965471089 < (((IterableNodeMap) ((Class451) this).aClass465_5439).anInt5560 * 25900449)) {
			Node class282 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((((Class451) this).anInt5442 += -1123382673) * -965471089 - 1)].prev);
			if ((((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((Class451) this).anInt5442 * -965471089 - 1]) != class282) {
				((Class451) this).aClass282_5440 = class282.prev;
				((Class451) this).aClass282_5441 = class282;
				return class282;
			}
		}
		return null;
	}

	public boolean hasNext() {
		if (((Class451) this).aClass282_5440 != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1]))
			return true;
		while (-965471089 * ((Class451) this).anInt5442 < (((IterableNodeMap) ((Class451) this).aClass465_5439).anInt5560 * 25900449)) {
			if ((((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((((Class451) this).anInt5442 += -1123382673) * -965471089 - 1)].prev) != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((Class451) this).anInt5442 * -965471089 - 1])) {
				((Class451) this).aClass282_5440 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1].prev);
				return true;
			}
			((Class451) this).aClass282_5440 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1]);
		}
		return false;
	}

	public void remove() {
		if (null == ((Class451) this).aClass282_5441)
			throw new IllegalStateException();
		((Class451) this).aClass282_5441.remove();
		((Class451) this).aClass282_5441 = null;
	}

	public boolean method7506() {
		if (((Class451) this).aClass282_5440 != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1]))
			return true;
		while (-965471089 * ((Class451) this).anInt5442 < (((IterableNodeMap) ((Class451) this).aClass465_5439).anInt5560 * 25900449)) {
			if ((((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((((Class451) this).anInt5442 += -1123382673) * -965471089 - 1)].prev) != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((Class451) this).anInt5442 * -965471089 - 1])) {
				((Class451) this).aClass282_5440 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1].prev);
				return true;
			}
			((Class451) this).aClass282_5440 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1]);
		}
		return false;
	}

	public Object next() {
		if (((Class451) this).aClass282_5440 != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1])) {
			Node class282 = ((Class451) this).aClass282_5440;
			((Class451) this).aClass282_5440 = class282.prev;
			((Class451) this).aClass282_5441 = class282;
			return class282;
		}
		while (((Class451) this).anInt5442 * -965471089 < (((IterableNodeMap) ((Class451) this).aClass465_5439).anInt5560 * 25900449)) {
			Node class282 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((((Class451) this).anInt5442 += -1123382673) * -965471089 - 1)].prev);
			if ((((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((Class451) this).anInt5442 * -965471089 - 1]) != class282) {
				((Class451) this).aClass282_5440 = class282.prev;
				((Class451) this).aClass282_5441 = class282;
				return class282;
			}
		}
		return null;
	}

	public void method7507() {
		if (null == ((Class451) this).aClass282_5441)
			throw new IllegalStateException();
		((Class451) this).aClass282_5441.remove();
		((Class451) this).aClass282_5441 = null;
	}

	public boolean method7508() {
		if (((Class451) this).aClass282_5440 != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1]))
			return true;
		while (-965471089 * ((Class451) this).anInt5442 < (((IterableNodeMap) ((Class451) this).aClass465_5439).anInt5560 * 25900449)) {
			if ((((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((((Class451) this).anInt5442 += -1123382673) * -965471089 - 1)].prev) != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((Class451) this).anInt5442 * -965471089 - 1])) {
				((Class451) this).aClass282_5440 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1].prev);
				return true;
			}
			((Class451) this).aClass282_5440 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1]);
		}
		return false;
	}

	public Object method7509() {
		if (((Class451) this).aClass282_5440 != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1])) {
			Node class282 = ((Class451) this).aClass282_5440;
			((Class451) this).aClass282_5440 = class282.prev;
			((Class451) this).aClass282_5441 = class282;
			return class282;
		}
		while (((Class451) this).anInt5442 * -965471089 < (((IterableNodeMap) ((Class451) this).aClass465_5439).anInt5560 * 25900449)) {
			Node class282 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((((Class451) this).anInt5442 += -1123382673) * -965471089 - 1)].prev);
			if ((((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((Class451) this).anInt5442 * -965471089 - 1]) != class282) {
				((Class451) this).aClass282_5440 = class282.prev;
				((Class451) this).aClass282_5441 = class282;
				return class282;
			}
		}
		return null;
	}

	public Object method7510() {
		if (((Class451) this).aClass282_5440 != (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[-965471089 * ((Class451) this).anInt5442 - 1])) {
			Node class282 = ((Class451) this).aClass282_5440;
			((Class451) this).aClass282_5440 = class282.prev;
			((Class451) this).aClass282_5441 = class282;
			return class282;
		}
		while (((Class451) this).anInt5442 * -965471089 < (((IterableNodeMap) ((Class451) this).aClass465_5439).anInt5560 * 25900449)) {
			Node class282 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((((Class451) this).anInt5442 += -1123382673) * -965471089 - 1)].prev);
			if ((((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[((Class451) this).anInt5442 * -965471089 - 1]) != class282) {
				((Class451) this).aClass282_5440 = class282.prev;
				((Class451) this).aClass282_5441 = class282;
				return class282;
			}
		}
		return null;
	}

	public void method7511() {
		if (null == ((Class451) this).aClass282_5441)
			throw new IllegalStateException();
		((Class451) this).aClass282_5441.remove();
		((Class451) this).aClass282_5441 = null;
	}

	void method7512(int i) {
		((Class451) this).aClass282_5440 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[0].prev);
		((Class451) this).anInt5442 = -1123382673;
		((Class451) this).aClass282_5441 = null;
	}

	void method7513() {
		((Class451) this).aClass282_5440 = (((IterableNodeMap) ((Class451) this).aClass465_5439).aClass282Array5558[0].prev);
		((Class451) this).anInt5442 = -1123382673;
		((Class451) this).aClass282_5441 = null;
	}

	public Node method7514() {
		method7512(-2019603507);
		return (Node) next();
	}

	public Node method7515() {
		method7512(-1032267257);
		return (Node) next();
	}

	public Node method7516() {
		method7512(-397199448);
		return (Node) next();
	}

	public static boolean method7517(byte i) {
		Class282_Sub42 class282_sub42 = (Class282_Sub42) Class435.aClass482_5332.head((byte) 42);
		if (class282_sub42 == null)
			return false;
		return true;
	}

	static final void method7518(CS2Executor class527, byte i) {
		NodeCollection.method8146(-1130869373);
	}

	static Class411[] method7519(short i) {
		return (new Class411[] { Class411.aClass411_4928, Class411.aClass411_4952, Class411.aClass411_4939, Class411.aClass411_4954, Class411.aClass411_4942, Class411.aClass411_4948, Class411.aClass411_4941, Class411.aClass411_4953, Class411.aClass411_4934, Class411.aClass411_4926, Class411.aClass411_4951, Class411.aClass411_4930, Class411.aClass411_4935, Class411.aClass411_4946, Class411.aClass411_4927, Class411.aClass411_4944, Class411.aClass411_4943, Class411.aClass411_4931,
				Class411.aClass411_4949, Class411.aClass411_4940, Class411.aClass411_4936, Class411.aClass411_4947, Class411.aClass411_4925, Class411.aClass411_4929, Class411.aClass411_4955, Class411.aClass411_4950, Class411.aClass411_4937, Class411.aClass411_4932, Class411.aClass411_4933, Class411.aClass411_4938, Class411.aClass411_4945 });
	}

	static final void method7520(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_0_, (byte) 58);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_0_ >> 16];
		Class282_Sub11.method12209(class118, class98, class527, 1467575804);
	}

	static final void method7521(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12920(308447312) == 2 ? 1 : 0;
	}

	static final void method7522(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class344.method6122(class118, class98, class527, -345845771);
	}
}
