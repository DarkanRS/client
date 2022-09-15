package com.jagex;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CanvasKeyRecorder extends KeyRecorder implements KeyListener, FocusListener {

	static int[] anIntArray8044 = {0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

	NodeCollection aClass482_8046 = new NodeCollection();

	NodeCollection aClass482_8047 = new NodeCollection();

	boolean[] aBoolArray8048 = new boolean[112];

	Component aComponent8050;

	CanvasKeyRecorder(Component component_1) {
		Class430.method7221();
		method13397(component_1);
	}

	@Override
	public void focusGained(FocusEvent focusevent_1) {
	}

	@Override
	public synchronized void focusLost(FocusEvent focusevent_1) {
		method13375(-1, '\u0000', 0);
	}

	@Override
	public KeyRecord getNext() {
		return (KeyRecord) aClass482_8046.popHead();
	}

	@Override
	public boolean held(int i_1) {
		return (i_1 >= 0 && i_1 < 112) && aBoolArray8048[i_1];
	}

	@Override
	public synchronized void keyPressed(KeyEvent keyevent_1) {
		method13378(keyevent_1, 0);
	}

	@Override
	public synchronized void keyReleased(KeyEvent keyevent_1) {
		method13378(keyevent_1, 1);
	}

	@Override
	public synchronized void keyTyped(KeyEvent keyevent_1) {
		char var_2 = keyevent_1.getKeyChar();
		if (var_2 != 65535 && Class175.method2962(var_2)) {
			method13375(3, var_2, -1);
			keyevent_1.consume();
		}
	}

	void method13375(int i_1, char var_2, int i_3) {
		Node_Sub52 class282_sub52_5 = new Node_Sub52();
		class282_sub52_5.anInt8173 = i_1;
		class282_sub52_5.aChar8171 = var_2;
		class282_sub52_5.anInt8172 = i_3;
		class282_sub52_5.aLong8169 = Utils.time();
		aClass482_8047.append(class282_sub52_5);
	}

	void method13378(KeyEvent keyevent_1, int i_2) {
		int i_4 = keyevent_1.getKeyCode();
		if ((i_4 != 0) && (i_4 >= 0 && i_4 < anIntArray8044.length)) {
			i_4 = anIntArray8044[i_4];
			if (i_2 == 0 && (i_4 & 0x80) != 0)
				i_4 = 0;
			else
				i_4 &= -129;
		} else
			i_4 = 0;
		if (i_4 != 0) {
			method13375(i_2, (char) 65535, i_4);
			keyevent_1.consume();
		}
	}

	void method13387() {
		if (aComponent8050 != null) {
			aComponent8050.removeKeyListener(this);
			aComponent8050.removeFocusListener(this);
			aComponent8050 = null;
			for (int i_2 = 0; i_2 < 112; i_2++)
				aBoolArray8048[i_2] = false;
			aClass482_8046.removeAll();
			aClass482_8047.removeAll();
		}
	}

	void method13397(Component component_1) {
		method13387();
		aComponent8050 = component_1;
		aComponent8050.addKeyListener(this);
		aComponent8050.addFocusListener(this);
	}

	int method13398() {
		int i_2 = 0;
		if (aBoolArray8048[81])
			i_2 |= 0x1;
		if (aBoolArray8048[82])
			i_2 |= 0x4;
		if (aBoolArray8048[86])
			i_2 |= 0x2;
		return i_2;
	}

	@Override
	public KeyRecord method3234() {
		return (KeyRecord) aClass482_8046.popHead();
	}

	@Override
	public synchronized void method3235() {
		aClass482_8046.removeAll();
		for (Node_Sub52 class282_sub52_2 = (Node_Sub52) aClass482_8047.popHead(); class282_sub52_2 != null; class282_sub52_2 = (Node_Sub52) aClass482_8047.popHead()) {
			class282_sub52_2.anInt8174 = method13398();
			if (class282_sub52_2.anInt8173 == 0) {
				if (!aBoolArray8048[class282_sub52_2.anInt8172]) {
					Node_Sub52 class282_sub52_3 = new Node_Sub52();
					class282_sub52_3.anInt8173 = 0;
					class282_sub52_3.aChar8171 = 65535;
					class282_sub52_3.anInt8172 = class282_sub52_2.anInt8172;
					class282_sub52_3.aLong8169 = class282_sub52_2.aLong8169;
					class282_sub52_3.anInt8174 = class282_sub52_2.anInt8174;
					aClass482_8046.append(class282_sub52_3);
					aBoolArray8048[class282_sub52_2.anInt8172] = true;
				}
				class282_sub52_2.anInt8173 = 2;
				aClass482_8046.append(class282_sub52_2);
			} else if (class282_sub52_2.anInt8173 == 1) {
				if (aBoolArray8048[class282_sub52_2.anInt8172]) {
					aClass482_8046.append(class282_sub52_2);
					aBoolArray8048[class282_sub52_2.anInt8172] = false;
				}
			} else if (class282_sub52_2.anInt8173 == -1) {
				for (int i_5 = 0; i_5 < 112; i_5++)
					if (aBoolArray8048[i_5]) {
						Node_Sub52 class282_sub52_4 = new Node_Sub52();
						class282_sub52_4.anInt8173 = 1;
						class282_sub52_4.aChar8171 = 65535;
						class282_sub52_4.anInt8172 = i_5;
						class282_sub52_4.aLong8169 = class282_sub52_2.aLong8169;
						class282_sub52_4.anInt8174 = class282_sub52_2.anInt8174;
						aClass482_8046.append(class282_sub52_4);
						aBoolArray8048[i_5] = false;
					}
			} else if (class282_sub52_2.anInt8173 == 3)
				aClass482_8046.append(class282_sub52_2);
		}
	}

	@Override
	public void method3238() {
		method13387();
	}

	@Override
	public KeyRecord method3239() {
		return (KeyRecord) aClass482_8046.popHead();
	}

	@Override
	public boolean method3240(int i_1) {
		return (i_1 >= 0 && i_1 < 112) && aBoolArray8048[i_1];
	}

	@Override
	public boolean method3242(int i_1) {
		return (i_1 >= 0 && i_1 < 112) && aBoolArray8048[i_1];
	}

	@Override
	public KeyRecord method3243() {
		return (KeyRecord) aClass482_8046.popHead();
	}

	@Override
	public boolean method3244(int i_1) {
		return (i_1 >= 0 && i_1 < 112) && aBoolArray8048[i_1];
	}

	@Override
	public void method3245() {
		method13387();
	}

	@Override
	public synchronized void method3246() {
		aClass482_8046.removeAll();
		for (Node_Sub52 class282_sub52_1 = (Node_Sub52) aClass482_8047.popHead(); class282_sub52_1 != null; class282_sub52_1 = (Node_Sub52) aClass482_8047.popHead()) {
			class282_sub52_1.anInt8174 = method13398() * 110455137 * 656472737;
			if (class282_sub52_1.anInt8173 * -461318909 * -921682517 == 0) {
				if (!aBoolArray8048[-581998429 * class282_sub52_1.anInt8172 * -1618834677]) {
					Node_Sub52 class282_sub52_2 = new Node_Sub52();
					class282_sub52_2.anInt8173 = 0;
					class282_sub52_2.aChar8171 = 65535;
					class282_sub52_2.anInt8172 = class282_sub52_1.anInt8172 * -1618834677 * -581998429;
					class282_sub52_2.aLong8169 = class282_sub52_1.aLong8169 * 5617785483754464897L * 3568855149896161665L;
					class282_sub52_2.anInt8174 = class282_sub52_1.anInt8174 * 110455137 * 656472737;
					aClass482_8046.append(class282_sub52_2);
					aBoolArray8048[-581998429 * class282_sub52_1.anInt8172 * -1618834677] = true;
				}
				class282_sub52_1.anInt8173 = -922637818 * -921682517;
				aClass482_8046.append(class282_sub52_1);
			} else if (class282_sub52_1.anInt8173 * -461318909 * -921682517 == 1) {
				if (aBoolArray8048[-581998429 * class282_sub52_1.anInt8172 * -1618834677]) {
					aClass482_8046.append(class282_sub52_1);
					aBoolArray8048[-581998429 * class282_sub52_1.anInt8172 * -1618834677] = false;
				}
			} else if (class282_sub52_1.anInt8173 * -461318909 * -921682517 == -1) {
				for (int i_4 = 0; i_4 < 112; i_4++)
					if (aBoolArray8048[i_4]) {
						Node_Sub52 class282_sub52_3 = new Node_Sub52();
						class282_sub52_3.anInt8173 = -461318909 * -921682517;
						class282_sub52_3.aChar8171 = 65535;
						class282_sub52_3.anInt8172 = -1618834677 * i_4 * -581998429;
						class282_sub52_3.aLong8169 = class282_sub52_1.aLong8169 * 5617785483754464897L * 3568855149896161665L;
						class282_sub52_3.anInt8174 = class282_sub52_1.anInt8174 * 110455137 * 656472737;
						aClass482_8046.append(class282_sub52_3);
						aBoolArray8048[i_4] = false;
					}
			} else if (-921682517 * class282_sub52_1.anInt8173 * -461318909 == 3)
				aClass482_8046.append(class282_sub52_1);
		}
	}

	@Override
	public void method3247() {
		method13387();
	}

	@Override
	public void method3248() {
		method13387();
	}

	@Override
	public void method3249() {
		method13387();
	}
}
