import java.awt.Container;
import java.awt.Frame;
import java.io.File;
import javax.swing.JFileChooser;

public class Class191 implements Runnable {

	File aFile2385 = null;

	boolean aBool2387 = false;

	String aString2384;

	boolean aBool2386;

	public void run() {
		Container container_1 = Class371.getActiveContainer();
		Frame frame_2 = null;
		if (Engine.engineFrame != null) {
			frame_2 = Engine.engineFrame;
		} else {
			while (container_1 != null) {
				if (container_1 instanceof Frame) {
					frame_2 = (Frame) container_1;
					break;
				}
				container_1 = container_1.getParent();
			}
		}
		if (frame_2 == null) {
			throw new RuntimeException("");
		} else {
			JFileChooser jfilechooser_3 = new JFileChooser("");
			jfilechooser_3.setDialogTitle(this.aString2384);
			jfilechooser_3.setFileFilter(new FileFilter_Sub1(this, this));
			jfilechooser_3.setFileSelectionMode(1);
			jfilechooser_3.setAcceptAllFileFilterUsed(false);
			int i_4 = jfilechooser_3.showOpenDialog(frame_2);
			if (i_4 == 0) {
				this.aFile2385 = jfilechooser_3.getSelectedFile();
			}
			this.aBool2387 = true;
		}
	}

	public Class191(String string_1) {
		this.aString2384 = string_1;
		this.aBool2386 = true;
		(new Thread(this)).start();
	}

	public boolean method3154() {
		return this.aBool2387;
	}

	boolean method3156(int i_1) {
		return this.aBool2386;
	}

	public File method3161() {
		return this.aFile2385;
	}

	public static void method3166() {
		ParticleProducerDefinition.aClass229_533.method3859();
	}
}
