
/* Class282 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

public class Node {
	public Node prev;
	public long data;
	public Node next;

	public void remove() {
		if (null != next) {
			next.prev = prev;
			prev.next = next;
			prev = null;
			next = null;
		}
	}

	public boolean method4994(int i) {
		if (null == next)
			return false;
		return true;
	}

	static final void method5000(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_0_, (byte) 91);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_0_ >> 16];
		Class283.method5009(class118, class98, class527, -1863768075);
	}

	static final void method5001(IComponentDefinitions class118, CS2Executor class527, int i) {
		FontMetrics class414 = class118.method1989(Class487.aClass378_5752, client.anInterface35_7206, 1667104026);
		int i_1_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		Point point = class414.method6954(class118.aString1391, 1506818197 * class118.anInt1301, class118.anInt1358 * -753644021, i_1_, Class182.aClass160Array2261, -1446712454);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = point.x;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = point.y;
	}

	static final void method5002(CS2Executor class527, int i) {
		Class93.method1573(class527, (byte) 59);
	}

	static final void method5003(CS2Executor class527, byte i) {
		int i_2_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_2_ & 0x3fff;
	}

	static final void method5004(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class388.method6690(class118, class98, class527, (byte) 92);
	}
}
