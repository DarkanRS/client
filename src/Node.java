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

	static final void method5000(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 91);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class283.method5009(icomponentdefinitions_3, interface_4, cs2executor_0, -1863768075);
	}

	static final void method5001(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		FontMetrics fontmetrics_3 = icomponentdefinitions_0.method1989(Class487.aClass378_5752, client.anInterface35_7206, 1667104026);
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		Point point_5 = fontmetrics_3.method6954(icomponentdefinitions_0.aString1391, icomponentdefinitions_0.anInt1301, icomponentdefinitions_0.anInt1358, i_4, Class182.aClass160Array2261, -1446712454);
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = point_5.x;
		cs2executor_1.intStack[++cs2executor_1.intStackPtr - 1] = point_5.y;
	}

	static final void method5002(CS2Executor cs2executor_0, int i_1) {
		Class93.method1573(cs2executor_0, (byte) 59);
	}

	static final void method5003(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2 & 0x3fff;
	}

	static final void method5004(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class388.method6690(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 92);
	}

}
