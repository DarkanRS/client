package com.rs.jagex;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Class191 implements Runnable {

	public static void method3166() {
		ParticleProducerDefinition.aClass229_533.method3859();
	}

	File aFile2385;

	boolean aBool2387;

	String aString2384;

	boolean aBool2386;

	public Class191(String string_1) {
		aString2384 = string_1;
		aBool2386 = true;
		(new Thread(this)).start();
	}

	public boolean method3154() {
		return aBool2387;
	}

	boolean method3156() {
		return aBool2386;
	}

	public File method3161() {
		return aFile2385;
	}

	@Override
	public void run() {
		Container container_1 = Class371.getActiveContainer();
		Frame frame_2 = null;
		if (Engine.engineFrame != null)
			frame_2 = Engine.engineFrame;
		else
			while (container_1 != null) {
				if (container_1 instanceof Frame) {
					frame_2 = (Frame) container_1;
					break;
				}
				container_1 = container_1.getParent();
			}
		if (frame_2 == null)
			throw new RuntimeException("");
		JFileChooser jfilechooser_3 = new JFileChooser("");
		jfilechooser_3.setDialogTitle(aString2384);
		jfilechooser_3.setFileFilter(new FileFilter_Sub1(this, this));
		jfilechooser_3.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		jfilechooser_3.setAcceptAllFileFilterUsed(false);
		int i_4 = jfilechooser_3.showOpenDialog(frame_2);
		if (i_4 == 0)
			aFile2385 = jfilechooser_3.getSelectedFile();
		aBool2387 = true;
	}
}
