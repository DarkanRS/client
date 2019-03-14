import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

public class Class30 implements Runnable {

	Thread aThread355;

	volatile boolean aBool356;

	Class105[] aClass105Array357;

	Class105 method791(int i_1, byte b_2) {
		return this.aClass105Array357 != null && i_1 >= 0 && i_1 < this.aClass105Array357.length ? this.aClass105Array357[i_1] : null;
	}

	boolean method792(int i_1) {
		if (this.aBool356) {
			return true;
		} else {
			if (this.aThread355 == null) {
				this.aThread355 = new Thread(this);
				this.aThread355.start();
			}
			return this.aBool356;
		}
	}

	public void run() {
		try {
			int i_1 = Class90.aClass496_952 == Class496.aClass496_5813 ? 80 : Class448.aClass450_5420.worldId + 7000;
			BufferedReader bufferedreader_2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class448.aClass450_5420.host + ":" + i_1 + "/news.ws?game=" + client.CURRENT_GAME.anInt5746)).openStream())));
			String string_3 = bufferedreader_2.readLine();
			ArrayList arraylist_4;
			for (arraylist_4 = new ArrayList(); string_3 != null; string_3 = bufferedreader_2.readLine()) {
				arraylist_4.add(string_3);
			}
			String[] arr_5 = new String[arraylist_4.size()];
			arraylist_4.toArray(arr_5);
			if (arr_5.length % 3 != 0) {
				return;
			}
			this.aClass105Array357 = new Class105[arr_5.length / 3];
			for (int i_6 = 0; i_6 < arr_5.length; i_6 += 3) {
				this.aClass105Array357[i_6 / 3] = new Class105(arr_5[i_6], arr_5[i_6 + 1], arr_5[i_6 + 2]);
			}
		} catch (IOException ioexception_8) {
			;
		}
		this.aBool356 = true;
	}

	public static void method795(byte b_0) {
		Class235.aClass465_2904 = new IterableNodeMap(8);
		Class235.anInt2898 = 0;
		Iterator iterator_1 = Class235.aList2896.iterator();
		while (iterator_1.hasNext()) {
			ParticleSystem class539_2 = (ParticleSystem) iterator_1.next();
			class539_2.method11506();
		}
	}

	public static void method796(int[] ints_0, Object[] arr_1, int i_2) {
		Class51.method1074(ints_0, arr_1, 0, ints_0.length - 1, -990491051);
	}

	static final void method797(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 != icomponentdefinitions_0.animation) {
			if (i_4 != -1) {
				if (icomponentdefinitions_0.aClass456_1437 == null) {
					icomponentdefinitions_0.aClass456_1437 = new Class456_Sub1();
				}
				icomponentdefinitions_0.aClass456_1437.method7567(i_4, (short) 8960);
			} else {
				icomponentdefinitions_0.aClass456_1437 = null;
			}
			icomponentdefinitions_0.animation = i_4;
			Class109.redrawComponent(icomponentdefinitions_0, (byte) 39);
		}
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class149_Sub1.method14582(icomponentdefinitions_0.idHash, -370064085);
		}
	}
}
