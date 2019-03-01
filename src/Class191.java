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
		Container container_1 = Class371.getActiveContainer((byte) 1);
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

	public Class191(String string_1, boolean bool_2) {
		this.aString2384 = string_1;
		this.aBool2386 = bool_2;
		(new Thread(this)).start();
	}

	public boolean method3154(byte b_1) {
		return this.aBool2387;
	}

	boolean method3156(int i_1) {
		return this.aBool2386;
	}

	public File method3161(int i_1) {
		return this.aFile2385;
	}

	static final void method3163(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		FontRenderer.method403(icomponentdefinitions_3, interface_4, cs2executor_0, 1299404618);
	}

	static final void method3164(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aClass10Array7456[i_2].aBool117 ? 1 : 0;
	}

	public static void method3166(int i_0) {
		ParticleProducerDefinition.aClass229_533.method3859(1570831832);
	}

	public static void method3167(int i_0, int i_1, String string_2, String string_3, String string_4, String string_5, int i_6) {
		MapRegionLoaderTask.appendMessage(i_0, i_1, string_2, string_3, string_4, string_5, (String) null, -1);
	}

	static final void method3168(CS2Executor cs2executor_0, int i_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		IComponentDefinitions icomponentdefinitions_5 = Class96_Sub23.method14682(interface_4, icomponentdefinitions_3, -838454718);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = icomponentdefinitions_5 == null ? -1 : icomponentdefinitions_5.idHash;
	}

}
