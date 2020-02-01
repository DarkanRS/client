package com.jagex;
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class CanvasKeyRecorder extends KeyRecorder implements KeyListener, FocusListener {

	static int[] anIntArray8044 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	NodeCollection aClass482_8046 = new NodeCollection();

	NodeCollection aClass482_8047 = new NodeCollection();

	boolean[] aBoolArray8048 = new boolean[112];

	Component aComponent8050;

	public boolean held(int i_1) {
		return i_1 >= 0 && i_1 < 112 ? this.aBoolArray8048[i_1] : false;
	}

	CanvasKeyRecorder(Component component_1) {
		Class430.method7221();
		this.method13397(component_1);
	}

	void method13375(int i_1, char var_2, int i_3, int i_4) {
		Node_Sub52 class282_sub52_5 = new Node_Sub52();
		class282_sub52_5.anInt8173 = i_1;
		class282_sub52_5.aChar8171 = var_2;
		class282_sub52_5.anInt8172 = i_3;
		class282_sub52_5.aLong8169 = Utils.time();
		this.aClass482_8047.append(class282_sub52_5);
	}

	public boolean method3240(int i_1) {
		return i_1 >= 0 && i_1 < 112 ? this.aBoolArray8048[i_1] : false;
	}

	public synchronized void method3235() {
		this.aClass482_8046.removeAll();
		for (Node_Sub52 class282_sub52_2 = (Node_Sub52) this.aClass482_8047.popHead(); class282_sub52_2 != null; class282_sub52_2 = (Node_Sub52) this.aClass482_8047.popHead()) {
			class282_sub52_2.anInt8174 = this.method13398((byte) 124);
			if (class282_sub52_2.anInt8173 == 0) {
				if (!this.aBoolArray8048[class282_sub52_2.anInt8172]) {
					Node_Sub52 class282_sub52_3 = new Node_Sub52();
					class282_sub52_3.anInt8173 = 0;
					class282_sub52_3.aChar8171 = (char) 65535;
					class282_sub52_3.anInt8172 = class282_sub52_2.anInt8172;
					class282_sub52_3.aLong8169 = class282_sub52_2.aLong8169;
					class282_sub52_3.anInt8174 = class282_sub52_2.anInt8174;
					this.aClass482_8046.append(class282_sub52_3);
					this.aBoolArray8048[class282_sub52_2.anInt8172] = true;
				}
				class282_sub52_2.anInt8173 = 2;
				this.aClass482_8046.append(class282_sub52_2);
			} else if (class282_sub52_2.anInt8173 == 1) {
				if (this.aBoolArray8048[class282_sub52_2.anInt8172]) {
					this.aClass482_8046.append(class282_sub52_2);
					this.aBoolArray8048[class282_sub52_2.anInt8172] = false;
				}
			} else if (class282_sub52_2.anInt8173 == -1) {
				for (int i_5 = 0; i_5 < 112; i_5++) {
					if (this.aBoolArray8048[i_5]) {
						Node_Sub52 class282_sub52_4 = new Node_Sub52();
						class282_sub52_4.anInt8173 = 1;
						class282_sub52_4.aChar8171 = (char) 65535;
						class282_sub52_4.anInt8172 = i_5;
						class282_sub52_4.aLong8169 = class282_sub52_2.aLong8169;
						class282_sub52_4.anInt8174 = class282_sub52_2.anInt8174;
						this.aClass482_8046.append(class282_sub52_4);
						this.aBoolArray8048[i_5] = false;
					}
				}
			} else if (class282_sub52_2.anInt8173 == 3) {
				this.aClass482_8046.append(class282_sub52_2);
			}
		}
	}

	public KeyRecord getNext(int i_1) {
		return (KeyRecord) this.aClass482_8046.popHead();
	}

	void method13378(KeyEvent keyevent_1, int i_2, byte b_3) {
		int i_4 = keyevent_1.getKeyCode();
		if (i_4 != 0) {
			if (i_4 >= 0 && i_4 < anIntArray8044.length) {
				i_4 = anIntArray8044[i_4];
				if (i_2 == 0 && (i_4 & 0x80) != 0) {
					i_4 = 0;
				} else {
					i_4 &= ~0x80;
				}
			} else {
				i_4 = 0;
			}
		} else {
			i_4 = 0;
		}
		if (i_4 != 0) {
			this.method13375(i_2, (char) 65535, i_4, -468374099);
			keyevent_1.consume();
		}
	}

	public synchronized void keyPressed(KeyEvent keyevent_1) {
		this.method13378(keyevent_1, 0, (byte) 111);
	}

	public synchronized void keyReleased(KeyEvent keyevent_1) {
		this.method13378(keyevent_1, 1, (byte) 40);
	}

	public void focusGained(FocusEvent focusevent_1) {
	}

	public synchronized void focusLost(FocusEvent focusevent_1) {
		this.method13375(-1, '\u0000', 0, -1603655488);
	}

	public KeyRecord method3243() {
		return (KeyRecord) this.aClass482_8046.popHead();
	}

	void method13387() {
		if (this.aComponent8050 != null) {
			this.aComponent8050.removeKeyListener(this);
			this.aComponent8050.removeFocusListener(this);
			this.aComponent8050 = null;
			for (int i_2 = 0; i_2 < 112; i_2++) {
				this.aBoolArray8048[i_2] = false;
			}
			this.aClass482_8046.removeAll();
			this.aClass482_8047.removeAll();
		}
	}

	public KeyRecord method3239() {
		return (KeyRecord) this.aClass482_8046.popHead();
	}

	public KeyRecord method3234() {
		return (KeyRecord) this.aClass482_8046.popHead();
	}

	public void method3245() {
		this.method13387();
	}

	public boolean method3244(int i_1) {
		return i_1 >= 0 && i_1 < 112 ? this.aBoolArray8048[i_1] : false;
	}

	public synchronized void method3246() {
		this.aClass482_8046.removeAll();
		for (Node_Sub52 class282_sub52_1 = (Node_Sub52) this.aClass482_8047.popHead(); class282_sub52_1 != null; class282_sub52_1 = (Node_Sub52) this.aClass482_8047.popHead()) {
			class282_sub52_1.anInt8174 = this.method13398((byte) 40) * 110455137 * 656472737;
			if (class282_sub52_1.anInt8173 * -461318909 * -921682517 == 0) {
				if (!this.aBoolArray8048[-581998429 * class282_sub52_1.anInt8172 * -1618834677]) {
					Node_Sub52 class282_sub52_2 = new Node_Sub52();
					class282_sub52_2.anInt8173 = 0 * -921682517;
					class282_sub52_2.aChar8171 = (char) 65535;
					class282_sub52_2.anInt8172 = 1 * class282_sub52_1.anInt8172 * -1618834677 * -581998429;
					class282_sub52_2.aLong8169 = 1L * class282_sub52_1.aLong8169 * 5617785483754464897L * 3568855149896161665L;
					class282_sub52_2.anInt8174 = 1 * class282_sub52_1.anInt8174 * 110455137 * 656472737;
					this.aClass482_8046.append(class282_sub52_2);
					this.aBoolArray8048[-581998429 * class282_sub52_1.anInt8172 * -1618834677] = true;
				}
				class282_sub52_1.anInt8173 = -922637818 * -921682517;
				this.aClass482_8046.append(class282_sub52_1);
			} else if (class282_sub52_1.anInt8173 * -461318909 * -921682517 == 1) {
				if (this.aBoolArray8048[-581998429 * class282_sub52_1.anInt8172 * -1618834677]) {
					this.aClass482_8046.append(class282_sub52_1);
					this.aBoolArray8048[-581998429 * class282_sub52_1.anInt8172 * -1618834677] = false;
				}
			} else if (class282_sub52_1.anInt8173 * -461318909 * -921682517 == -1) {
				for (int i_4 = 0; i_4 < 112; i_4++) {
					if (this.aBoolArray8048[i_4]) {
						Node_Sub52 class282_sub52_3 = new Node_Sub52();
						class282_sub52_3.anInt8173 = -461318909 * -921682517;
						class282_sub52_3.aChar8171 = (char) 65535;
						class282_sub52_3.anInt8172 = -1618834677 * i_4 * -581998429;
						class282_sub52_3.aLong8169 = class282_sub52_1.aLong8169 * 5617785483754464897L * 1L * 3568855149896161665L;
						class282_sub52_3.anInt8174 = 1 * class282_sub52_1.anInt8174 * 110455137 * 656472737;
						this.aClass482_8046.append(class282_sub52_3);
						this.aBoolArray8048[i_4] = false;
					}
				}
			} else if (-921682517 * class282_sub52_1.anInt8173 * -461318909 == 3) {
				this.aClass482_8046.append(class282_sub52_1);
			}
		}
	}

	public boolean method3242(int i_1) {
		return i_1 >= 0 && i_1 < 112 ? this.aBoolArray8048[i_1] : false;
	}

	public synchronized void keyTyped(KeyEvent keyevent_1) {
		char var_2 = keyevent_1.getKeyChar();
		if (var_2 != 65535 && Class175.method2962(var_2)) {
			this.method13375(3, var_2, -1, -1446580970);
			keyevent_1.consume();
		}
	}

	public void method3238() {
		this.method13387();
	}

	public void method3247() {
		this.method13387();
	}

	void method13397(Component component_1) {
		this.method13387();
		this.aComponent8050 = component_1;
		this.aComponent8050.addKeyListener(this);
		this.aComponent8050.addFocusListener(this);
	}

	public void method3248() {
		this.method13387();
	}

	public void method3249() {
		this.method13387();
	}

	int method13398(byte b_1) {
		int i_2 = 0;
		if (this.aBoolArray8048[81]) {
			i_2 |= 0x1;
		}
		if (this.aBoolArray8048[82]) {
			i_2 |= 0x4;
		}
		if (this.aBoolArray8048[86]) {
			i_2 |= 0x2;
		}
		return i_2;
	}
}
