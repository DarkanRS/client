package com.rs.jagex;

import java.awt.Image;
import java.io.IOException;
import java.io.OutputStream;

public class ClosedOutputStream extends OutputStream {

	public static Image anImage7953;

	static void method12938() {
		for (MenuActionEvent class282_sub50_sub7_1 = (MenuActionEvent) Class20.aClass482_171.head(); class282_sub50_sub7_1 != null; class282_sub50_sub7_1 = (MenuActionEvent) Class20.aClass482_171.next())
			if (class282_sub50_sub7_1.menuAction.isIFClick())
				Static.method2095(class282_sub50_sub7_1);

	}

	@Override
	public void write(int i_1) throws IOException {
		throw new IOException();
	}

}
