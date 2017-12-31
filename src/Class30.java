
/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
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

	boolean method790() {
		if (((Class30) this).aBool356)
			return true;
		if (null == ((Class30) this).aThread355) {
			((Class30) this).aThread355 = new Thread(this);
			((Class30) this).aThread355.start();
		}
		return ((Class30) this).aBool356;
	}

	Class105 method791(int i, byte i_0_) {
		if (((Class30) this).aClass105Array357 == null || i < 0 || i >= ((Class30) this).aClass105Array357.length)
			return null;
		return ((Class30) this).aClass105Array357[i];
	}

	boolean method792(int i) {
		if (((Class30) this).aBool356)
			return true;
		if (null == ((Class30) this).aThread355) {
			((Class30) this).aThread355 = new Thread(this);
			((Class30) this).aThread355.start();
		}
		return ((Class30) this).aBool356;
	}

	public void run() {
		try {
			int i = (Class90.aClass496_952 == Class496.aClass496_5813 ? 80 : Class448.aClass450_5420.worldId * -87869981 + 7000);
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class448.aClass450_5420.aString5433).append(":").append(i).append("/news.ws?game=").append(client.aClass486_7450.anInt5746 * 1648080491).toString()).openStream()))));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; string != null; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (0 != strings.length % 3)
				return;
			((Class30) this).aClass105Array357 = new Class105[strings.length / 3];
			for (int i_1_ = 0; i_1_ < strings.length; i_1_ += 3)
				((Class30) this).aClass105Array357[i_1_ / 3] = new Class105(strings[i_1_], strings[i_1_ + 1], strings[i_1_ + 2]);
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class30) this).aBool356 = true;
	}

	Class30() {
		/* empty */
	}

	public void method793() {
		try {
			int i = (Class90.aClass496_952 == Class496.aClass496_5813 ? 80 : Class448.aClass450_5420.worldId * -87869981 + 7000);
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class448.aClass450_5420.aString5433).append(":").append(i).append("/news.ws?game=").append(client.aClass486_7450.anInt5746 * 1648080491).toString()).openStream()))));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; string != null; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (0 != strings.length % 3)
				return;
			((Class30) this).aClass105Array357 = new Class105[strings.length / 3];
			for (int i_2_ = 0; i_2_ < strings.length; i_2_ += 3)
				((Class30) this).aClass105Array357[i_2_ / 3] = new Class105(strings[i_2_], strings[i_2_ + 1], strings[i_2_ + 2]);
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class30) this).aBool356 = true;
	}

	public void method794() {
		try {
			int i = (Class90.aClass496_952 == Class496.aClass496_5813 ? 80 : Class448.aClass450_5420.worldId * -87869981 + 7000);
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(new DataInputStream(new URL(new StringBuilder().append("http://").append(Class448.aClass450_5420.aString5433).append(":").append(i).append("/news.ws?game=").append(client.aClass486_7450.anInt5746 * 1648080491).toString()).openStream()))));
			String string = bufferedreader.readLine();
			ArrayList arraylist = new ArrayList();
			for (/**/; string != null; string = bufferedreader.readLine())
				arraylist.add(string);
			String[] strings = new String[arraylist.size()];
			arraylist.toArray(strings);
			if (0 != strings.length % 3)
				return;
			((Class30) this).aClass105Array357 = new Class105[strings.length / 3];
			for (int i_3_ = 0; i_3_ < strings.length; i_3_ += 3)
				((Class30) this).aClass105Array357[i_3_ / 3] = new Class105(strings[i_3_], strings[i_3_ + 1], strings[i_3_ + 2]);
		} catch (IOException ioexception) {
			/* empty */
		}
		((Class30) this).aBool356 = true;
	}

	public static void method795(byte i) {
		Class235.aClass465_2904 = new SwitchMap(8);
		Class235.anInt2898 = 0;
		Iterator iterator = Class235.aList2896.iterator();
		while (iterator.hasNext()) {
			Class539 class539 = (Class539) iterator.next();
			class539.method11506();
		}
	}

	public static void method796(int[] is, Object[] objects, int i) {
		Class51.method1074(is, objects, 0, is.length - 1, -990491051);
	}

	static final void method797(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		int i_4_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (i_4_ != class118.anInt1321 * 1241177935) {
			if (i_4_ != -1) {
				if (null == class118.aClass456_1437)
					class118.aClass456_1437 = new Class456_Sub1();
				class118.aClass456_1437.method7567(i_4_, (short) 8960);
			} else
				class118.aClass456_1437 = null;
			class118.anInt1321 = 388683695 * i_4_;
			Class109.method1858(class118, (byte) 39);
		}
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			Class149_Sub1.method14582(-1952846363 * class118.anInt1287, -370064085);
	}

	static final void method798(CS2Executor class527, int i) {
		Class337.method6018((((CS2Executor) class527).aClass521_Sub1_Sub2_Sub1_7014), class527, 1907071092);
	}
}
