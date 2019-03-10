import java.awt.Point;

public class Node {

	public long data;

	public Node next;

	public Node prev;

	public void remove() {
		if (this.prev != null) {
			this.prev.next = this.next;
			this.next.prev = this.prev;
			this.next = null;
			this.prev = null;
		}
	}

	public boolean method4994(int i_1) {
		return this.prev != null;
	}

	static final void method5001(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		FontMetrics fontmetrics_3 = icomponentdefinitions_0.method1989(Class487.aClass378_5752, client.anInterface35_7206, 1667104026);
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		Point point_5 = fontmetrics_3.method6954(icomponentdefinitions_0.aString1391, icomponentdefinitions_0.anInt1301, icomponentdefinitions_0.anInt1358, i_4, Class182.aClass160Array2261, -1446712454);
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = point_5.x;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = point_5.y;
	}
}
