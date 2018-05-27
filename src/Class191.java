
/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Frame;
import java.io.File;

import javax.swing.JFileChooser;

public class Class191 implements Runnable {
	String aString2384;
	File aFile2385 = null;
	boolean aBool2386;
	boolean aBool2387 = false;

	public boolean method3153() {
		return ((Class191) this).aBool2387;
	}

	public void run() {
		Container container = Class371.method6354((byte) 1);
		Frame frame = null;
		if (null != Class263.aFrame3261)
			frame = Class263.aFrame3261;
		else {
			for (/**/; container != null; container = container.getParent()) {
				if (container instanceof Frame) {
					frame = (Frame) container;
					break;
				}
			}
		}
		if (frame == null)
			throw new RuntimeException("");
		JFileChooser jfilechooser = new JFileChooser("");
		jfilechooser.setDialogTitle(((Class191) this).aString2384);
		jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
		jfilechooser.setFileSelectionMode(1);
		jfilechooser.setAcceptAllFileFilterUsed(false);
		int i = jfilechooser.showOpenDialog(frame);
		if (0 == i)
			((Class191) this).aFile2385 = jfilechooser.getSelectedFile();
		((Class191) this).aBool2387 = true;
	}

	public Class191(String string, boolean bool) {
		((Class191) this).aString2384 = string;
		((Class191) this).aBool2386 = bool;
		new Thread(this).start();
	}

	public boolean method3154(byte i) {
		return ((Class191) this).aBool2387;
	}

	boolean method3155() {
		return ((Class191) this).aBool2386;
	}

	boolean method3156(int i) {
		return ((Class191) this).aBool2386;
	}

	public void method3157() {
		Container container = Class371.method6354((byte) 1);
		Frame frame = null;
		if (null != Class263.aFrame3261)
			frame = Class263.aFrame3261;
		else {
			for (/**/; container != null; container = container.getParent()) {
				if (container instanceof Frame) {
					frame = (Frame) container;
					break;
				}
			}
		}
		if (frame == null)
			throw new RuntimeException("");
		JFileChooser jfilechooser = new JFileChooser("");
		jfilechooser.setDialogTitle(((Class191) this).aString2384);
		jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
		jfilechooser.setFileSelectionMode(1);
		jfilechooser.setAcceptAllFileFilterUsed(false);
		int i = jfilechooser.showOpenDialog(frame);
		if (0 == i)
			((Class191) this).aFile2385 = jfilechooser.getSelectedFile();
		((Class191) this).aBool2387 = true;
	}

	public File method3158() {
		return ((Class191) this).aFile2385;
	}

	public File method3159() {
		return ((Class191) this).aFile2385;
	}

	public void method3160() {
		Container container = Class371.method6354((byte) 1);
		Frame frame = null;
		if (null != Class263.aFrame3261)
			frame = Class263.aFrame3261;
		else {
			for (/**/; container != null; container = container.getParent()) {
				if (container instanceof Frame) {
					frame = (Frame) container;
					break;
				}
			}
		}
		if (frame == null)
			throw new RuntimeException("");
		JFileChooser jfilechooser = new JFileChooser("");
		jfilechooser.setDialogTitle(((Class191) this).aString2384);
		jfilechooser.setFileFilter(new FileFilter_Sub1(this, this));
		jfilechooser.setFileSelectionMode(1);
		jfilechooser.setAcceptAllFileFilterUsed(false);
		int i = jfilechooser.showOpenDialog(frame);
		if (0 == i)
			((Class191) this).aFile2385 = jfilechooser.getSelectedFile();
		((Class191) this).aBool2387 = true;
	}

	public File method3161(int i) {
		return ((Class191) this).aFile2385;
	}

	boolean method3162() {
		return ((Class191) this).aBool2386;
	}

	static final void method3163(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		FontRenderer.method403(class118, class98, class527, 1299404618);
	}

	static final void method3164(CS2Executor class527, int i) {
		int i_0_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = client.aClass10Array7456[i_0_].aBool117 ? 1 : 0;
	}

	public static void method3166(int i) {
		Class59.aClass229_533.method3859(1570831832);
	}

	public static void method3167(int i, int i_1_, String string, String string_2_, String string_3_, String string_4_, int i_5_) {
		MapRegionLoaderTask.method6070(i, i_1_, string, string_2_, string_3_, string_4_, null, -1, 30927485);
	}

	static final void method3168(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class118 class118_6_ = Class96_Sub23.method14682(class98, class118, -838454718);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = null == class118_6_ ? -1 : class118_6_.anInt1287 * -1952846363;
	}
}
