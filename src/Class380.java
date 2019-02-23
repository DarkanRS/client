import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class380 implements Iterator {

	static String aString4636;
	int anInt4634 = 0;
	int anInt4635;
	AbstractQueue_Sub1 anAbstractQueue_Sub1_4633;

	public Object next() {
		if (this.anAbstractQueue_Sub1_4633.anInt10073 != this.anInt4635) {
			throw new ConcurrentModificationException();
		} else if (this.anInt4634 < this.anAbstractQueue_Sub1_4633.anInt10070) {
			Object object_1 = this.anAbstractQueue_Sub1_4633.aClass354Array10072[this.anInt4634].anObject4109;
			++this.anInt4634;
			return object_1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public boolean hasNext() {
		return this.anInt4634 < this.anAbstractQueue_Sub1_4633.anInt10070;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	Class380(AbstractQueue_Sub1 abstractqueue_sub1_1) {
		this.anInt4635 = this.anAbstractQueue_Sub1_4633.anInt10073;
		this.anAbstractQueue_Sub1_4633 = abstractqueue_sub1_1;
	}

	static final void method6449(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_3.anInt1329 == 1 ? icomponentdefinitions_3.anInt1330 : -1;
	}

	public static boolean method6450(char var_0, int i_1) {
		return var_0 >= 48 && var_0 <= 57 || var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
	}

	static void method6451(int i_0, int i_1, int i_2) {
		Class20.anInt180 = i_0;
		Class20.anInt181 = i_1;
	}

	static final void method6452(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class295.method5291(icomponentdefinitions_3, interface_4, cs2executor_0, 989451427);
	}

	static final void method6453(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		int[] ints_5 = Class96_Sub14.method14642(string_4, cs2executor_2, 1022957959);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1342 = Class351.method6193(string_4, cs2executor_2, 720778855);
		icomponentdefinitions_0.anIntArray1398 = ints_5;
		icomponentdefinitions_0.aBool1384 = true;
	}

}
