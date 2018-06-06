
/* Class199_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class Class199_Sub1 extends Class199 implements KeyListener, FocusListener {
	static int[] anIntArray8044 = { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0,
			0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	static final int anInt8045 = 128;
	NodeCollection aClass482_8046 = new NodeCollection();
	NodeCollection aClass482_8047 = new NodeCollection();
	boolean[] aBoolArray8048 = new boolean[112];
	static final int anInt8049 = 112;
	Component aComponent8050;

	public boolean method3236(int i, int i_0_) {
		if (i < 0 || i >= 112)
			return false;
		return ((Class199_Sub1) this).aBoolArray8048[i];
	}

	int method13374() {
		int i = 0;
		if (((Class199_Sub1) this).aBoolArray8048[81])
			i |= 0x1;
		if (((Class199_Sub1) this).aBoolArray8048[82])
			i |= 0x4;
		if (((Class199_Sub1) this).aBoolArray8048[86])
			i |= 0x2;
		return i;
	}

	Class199_Sub1(Component component) {
		Class430.method7221(-1695618125);
		method13397(component, -1670677200);
	}

	void method13375(int i, char c, int i_1_, int i_2_) {
		Class282_Sub52 class282_sub52 = new Class282_Sub52();
		((Class282_Sub52) class282_sub52).anInt8173 = i * -461318909;
		((Class282_Sub52) class282_sub52).aChar8171 = c;
		((Class282_Sub52) class282_sub52).anInt8172 = -1618834677 * i_1_;
		((Class282_Sub52) class282_sub52).aLong8169 = Class169.method2869(1647332594) * 5617785483754464897L;
		((Class199_Sub1) this).aClass482_8047.append(class282_sub52, 1868756852);
	}

	public synchronized void method13376(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class175.method2962(c, -16711936)) {
			method13375(3, c, -1, -1044821975);
			keyevent.consume();
		}
	}

	public boolean method3240(int i) {
		if (i < 0 || i >= 112)
			return false;
		return ((Class199_Sub1) this).aBoolArray8048[i];
	}

	void method13377(KeyEvent keyevent, int i) {
		int i_3_ = keyevent.getKeyCode();
		if (0 != i_3_) {
			if (i_3_ >= 0 && i_3_ < anIntArray8044.length) {
				i_3_ = anIntArray8044[i_3_];
				if (i == 0 && 0 != (i_3_ & 0x80))
					i_3_ = 0;
				else
					i_3_ &= ~0x80;
			} else
				i_3_ = 0;
		} else
			i_3_ = 0;
		if (i_3_ != 0) {
			method13375(i, '\uffff', i_3_, -1308527039);
			keyevent.consume();
		}
	}

	public synchronized void method3235(byte i) {
		((Class199_Sub1) this).aClass482_8046.method8118(-1343308861);
		for (Class282_Sub52 class282_sub52 = (Class282_Sub52) ((Class199_Sub1) this).aClass482_8047.method8061((byte) -120); class282_sub52 != null; class282_sub52 = (Class282_Sub52) ((Class199_Sub1) this).aClass482_8047.method8061((byte) -23)) {
			((Class282_Sub52) class282_sub52).anInt8174 = method13398((byte) 124) * 110455137;
			if (((Class282_Sub52) class282_sub52).anInt8173 * -921682517 == 0) {
				if (!((Class199_Sub1) this).aBoolArray8048[(-581998429 * ((Class282_Sub52) class282_sub52).anInt8172)]) {
					Class282_Sub52 class282_sub52_4_ = new Class282_Sub52();
					((Class282_Sub52) class282_sub52_4_).anInt8173 = 0;
					((Class282_Sub52) class282_sub52_4_).aChar8171 = '\uffff';
					((Class282_Sub52) class282_sub52_4_).anInt8172 = 1 * ((Class282_Sub52) class282_sub52).anInt8172;
					((Class282_Sub52) class282_sub52_4_).aLong8169 = 1L * ((Class282_Sub52) class282_sub52).aLong8169;
					((Class282_Sub52) class282_sub52_4_).anInt8174 = 1 * ((Class282_Sub52) class282_sub52).anInt8174;
					((Class199_Sub1) this).aClass482_8046.append(class282_sub52_4_, 1312996857);
					((Class199_Sub1) this).aBoolArray8048[(-581998429 * ((Class282_Sub52) class282_sub52).anInt8172)] = true;
				}
				((Class282_Sub52) class282_sub52).anInt8173 = -922637818;
				((Class199_Sub1) this).aClass482_8046.append(class282_sub52, -924649078);
			} else if (((Class282_Sub52) class282_sub52).anInt8173 * -921682517 == 1) {
				if (((Class199_Sub1) this).aBoolArray8048[(-581998429 * ((Class282_Sub52) class282_sub52).anInt8172)]) {
					((Class199_Sub1) this).aClass482_8046.append(class282_sub52, -317129171);
					((Class199_Sub1) this).aBoolArray8048[(-581998429 * ((Class282_Sub52) class282_sub52).anInt8172)] = false;
				}
			} else if (-1 == (((Class282_Sub52) class282_sub52).anInt8173 * -921682517)) {
				for (int i_5_ = 0; i_5_ < 112; i_5_++) {
					if (((Class199_Sub1) this).aBoolArray8048[i_5_]) {
						Class282_Sub52 class282_sub52_6_ = new Class282_Sub52();
						((Class282_Sub52) class282_sub52_6_).anInt8173 = -461318909;
						((Class282_Sub52) class282_sub52_6_).aChar8171 = '\uffff';
						((Class282_Sub52) class282_sub52_6_).anInt8172 = -1618834677 * i_5_;
						((Class282_Sub52) class282_sub52_6_).aLong8169 = ((Class282_Sub52) class282_sub52).aLong8169 * 1L;
						((Class282_Sub52) class282_sub52_6_).anInt8174 = 1 * ((Class282_Sub52) class282_sub52).anInt8174;
						((Class199_Sub1) this).aClass482_8046.append(class282_sub52_6_, -1107804482);
						((Class199_Sub1) this).aBoolArray8048[i_5_] = false;
					}
				}
			} else if (-921682517 * ((Class282_Sub52) class282_sub52).anInt8173 == 3)
				((Class199_Sub1) this).aClass482_8046.append(class282_sub52, -1098300070);
		}
	}

	public Interface16 method3237(int i) {
		return ((Interface16) ((Class199_Sub1) this).aClass482_8046.method8061((byte) -54));
	}

	void method13378(KeyEvent keyevent, int i, byte i_7_) {
		int i_8_ = keyevent.getKeyCode();
		if (0 != i_8_) {
			if (i_8_ >= 0 && i_8_ < anIntArray8044.length) {
				i_8_ = anIntArray8044[i_8_];
				if (i == 0 && 0 != (i_8_ & 0x80))
					i_8_ = 0;
				else
					i_8_ &= ~0x80;
			} else
				i_8_ = 0;
		} else
			i_8_ = 0;
		if (i_8_ != 0) {
			method13375(i, '\uffff', i_8_, -468374099);
			keyevent.consume();
		}
	}

	public synchronized void keyPressed(KeyEvent keyevent) {
		method13378(keyevent, 0, (byte) 111);
	}

	public synchronized void keyReleased(KeyEvent keyevent) {
		method13378(keyevent, 1, (byte) 40);
	}

	public synchronized void method13379(KeyEvent keyevent) {
		method13378(keyevent, 0, (byte) 87);
	}

	public void focusGained(FocusEvent focusevent) {
		/* empty */
	}

	public synchronized void focusLost(FocusEvent focusevent) {
		method13375(-1, '\0', 0, -1603655488);
	}

	public Interface16 method3243() {
		return ((Interface16) ((Class199_Sub1) this).aClass482_8046.method8061((byte) -43));
	}

	public void method13380(FocusEvent focusevent) {
		/* empty */
	}

	public void method13381(FocusEvent focusevent) {
		/* empty */
	}

	public synchronized void method13382(FocusEvent focusevent) {
		method13375(-1, '\0', 0, -538955252);
	}

	static void method13383() {
		anIntArray8044[44] = 71;
		anIntArray8044[45] = 26;
		anIntArray8044[46] = 72;
		anIntArray8044[47] = 73;
		anIntArray8044[59] = 57;
		anIntArray8044[61] = 27;
		anIntArray8044[91] = 42;
		anIntArray8044[92] = 74;
		anIntArray8044[93] = 43;
		anIntArray8044[192] = 28;
		anIntArray8044[222] = 58;
		anIntArray8044[520] = 59;
	}

	void method13384(Component component) {
		method13387((byte) 1);
		((Class199_Sub1) this).aComponent8050 = component;
		((Class199_Sub1) this).aComponent8050.addKeyListener(this);
		((Class199_Sub1) this).aComponent8050.addFocusListener(this);
	}

	void method13385() {
		if (null != ((Class199_Sub1) this).aComponent8050) {
			((Class199_Sub1) this).aComponent8050.removeKeyListener(this);
			((Class199_Sub1) this).aComponent8050.removeFocusListener(this);
			((Class199_Sub1) this).aComponent8050 = null;
			for (int i = 0; i < 112; i++)
				((Class199_Sub1) this).aBoolArray8048[i] = false;
			((Class199_Sub1) this).aClass482_8046.method8118(-1262924902);
			((Class199_Sub1) this).aClass482_8047.method8118(1324241971);
		}
	}

	void method13386() {
		if (null != ((Class199_Sub1) this).aComponent8050) {
			((Class199_Sub1) this).aComponent8050.removeKeyListener(this);
			((Class199_Sub1) this).aComponent8050.removeFocusListener(this);
			((Class199_Sub1) this).aComponent8050 = null;
			for (int i = 0; i < 112; i++)
				((Class199_Sub1) this).aBoolArray8048[i] = false;
			((Class199_Sub1) this).aClass482_8046.method8118(378325087);
			((Class199_Sub1) this).aClass482_8047.method8118(98468116);
		}
	}

	void method13387(byte i) {
		if (null != ((Class199_Sub1) this).aComponent8050) {
			((Class199_Sub1) this).aComponent8050.removeKeyListener(this);
			((Class199_Sub1) this).aComponent8050.removeFocusListener(this);
			((Class199_Sub1) this).aComponent8050 = null;
			for (int i_9_ = 0; i_9_ < 112; i_9_++)
				((Class199_Sub1) this).aBoolArray8048[i_9_] = false;
			((Class199_Sub1) this).aClass482_8046.method8118(-1693342085);
			((Class199_Sub1) this).aClass482_8047.method8118(-800390555);
		}
	}

	void method13388(int i, char c, int i_10_) {
		Class282_Sub52 class282_sub52 = new Class282_Sub52();
		((Class282_Sub52) class282_sub52).anInt8173 = i * -461318909;
		((Class282_Sub52) class282_sub52).aChar8171 = c;
		((Class282_Sub52) class282_sub52).anInt8172 = -1618834677 * i_10_;
		((Class282_Sub52) class282_sub52).aLong8169 = Class169.method2869(1627997402) * 5617785483754464897L;
		((Class199_Sub1) this).aClass482_8047.append(class282_sub52, 504248551);
	}

	public Interface16 method3239() {
		return ((Interface16) ((Class199_Sub1) this).aClass482_8046.method8061((byte) -4));
	}

	public Interface16 method3234() {
		return ((Interface16) ((Class199_Sub1) this).aClass482_8046.method8061((byte) -62));
	}

	void method13389(int i, char c, int i_11_) {
		Class282_Sub52 class282_sub52 = new Class282_Sub52();
		((Class282_Sub52) class282_sub52).anInt8173 = i * -461318909;
		((Class282_Sub52) class282_sub52).aChar8171 = c;
		((Class282_Sub52) class282_sub52).anInt8172 = -1618834677 * i_11_;
		((Class282_Sub52) class282_sub52).aLong8169 = Class169.method2869(1923489988) * 5617785483754464897L;
		((Class199_Sub1) this).aClass482_8047.append(class282_sub52, 888772202);
	}

	public void method13390(FocusEvent focusevent) {
		/* empty */
	}

	public void method3245() {
		method13387((byte) 1);
	}

	public boolean method3244(int i) {
		if (i < 0 || i >= 112)
			return false;
		return ((Class199_Sub1) this).aBoolArray8048[i];
	}

	public synchronized void method3246() {
		((Class199_Sub1) this).aClass482_8046.method8118(1090234793);
		for (Class282_Sub52 class282_sub52 = (Class282_Sub52) ((Class199_Sub1) this).aClass482_8047.method8061((byte) -35); class282_sub52 != null; class282_sub52 = (Class282_Sub52) ((Class199_Sub1) this).aClass482_8047.method8061((byte) -109)) {
			((Class282_Sub52) class282_sub52).anInt8174 = method13398((byte) 40) * 110455137;
			if (((Class282_Sub52) class282_sub52).anInt8173 * -921682517 == 0) {
				if (!((Class199_Sub1) this).aBoolArray8048[(-581998429 * ((Class282_Sub52) class282_sub52).anInt8172)]) {
					Class282_Sub52 class282_sub52_12_ = new Class282_Sub52();
					((Class282_Sub52) class282_sub52_12_).anInt8173 = 0;
					((Class282_Sub52) class282_sub52_12_).aChar8171 = '\uffff';
					((Class282_Sub52) class282_sub52_12_).anInt8172 = 1 * ((Class282_Sub52) class282_sub52).anInt8172;
					((Class282_Sub52) class282_sub52_12_).aLong8169 = 1L * ((Class282_Sub52) class282_sub52).aLong8169;
					((Class282_Sub52) class282_sub52_12_).anInt8174 = 1 * ((Class282_Sub52) class282_sub52).anInt8174;
					((Class199_Sub1) this).aClass482_8046.append(class282_sub52_12_, -807358565);
					((Class199_Sub1) this).aBoolArray8048[(-581998429 * ((Class282_Sub52) class282_sub52).anInt8172)] = true;
				}
				((Class282_Sub52) class282_sub52).anInt8173 = -922637818;
				((Class199_Sub1) this).aClass482_8046.append(class282_sub52, 269297613);
			} else if (((Class282_Sub52) class282_sub52).anInt8173 * -921682517 == 1) {
				if (((Class199_Sub1) this).aBoolArray8048[(-581998429 * ((Class282_Sub52) class282_sub52).anInt8172)]) {
					((Class199_Sub1) this).aClass482_8046.append(class282_sub52, -790183134);
					((Class199_Sub1) this).aBoolArray8048[(-581998429 * ((Class282_Sub52) class282_sub52).anInt8172)] = false;
				}
			} else if (-1 == (((Class282_Sub52) class282_sub52).anInt8173 * -921682517)) {
				for (int i = 0; i < 112; i++) {
					if (((Class199_Sub1) this).aBoolArray8048[i]) {
						Class282_Sub52 class282_sub52_13_ = new Class282_Sub52();
						((Class282_Sub52) class282_sub52_13_).anInt8173 = -461318909;
						((Class282_Sub52) class282_sub52_13_).aChar8171 = '\uffff';
						((Class282_Sub52) class282_sub52_13_).anInt8172 = -1618834677 * i;
						((Class282_Sub52) class282_sub52_13_).aLong8169 = ((Class282_Sub52) class282_sub52).aLong8169 * 1L;
						((Class282_Sub52) class282_sub52_13_).anInt8174 = 1 * ((Class282_Sub52) class282_sub52).anInt8174;
						((Class199_Sub1) this).aClass482_8046.append(class282_sub52_13_, 716991282);
						((Class199_Sub1) this).aBoolArray8048[i] = false;
					}
				}
			} else if (-921682517 * ((Class282_Sub52) class282_sub52).anInt8173 == 3)
				((Class199_Sub1) this).aClass482_8046.append(class282_sub52, 382193306);
		}
	}

	public boolean method3242(int i) {
		if (i < 0 || i >= 112)
			return false;
		return ((Class199_Sub1) this).aBoolArray8048[i];
	}

	void method13391(KeyEvent keyevent, int i) {
		int i_14_ = keyevent.getKeyCode();
		if (0 != i_14_) {
			if (i_14_ >= 0 && i_14_ < anIntArray8044.length) {
				i_14_ = anIntArray8044[i_14_];
				if (i == 0 && 0 != (i_14_ & 0x80))
					i_14_ = 0;
				else
					i_14_ &= ~0x80;
			} else
				i_14_ = 0;
		} else
			i_14_ = 0;
		if (i_14_ != 0) {
			method13375(i, '\uffff', i_14_, -1454685521);
			keyevent.consume();
		}
	}

	void method13392(KeyEvent keyevent, int i) {
		int i_15_ = keyevent.getKeyCode();
		if (0 != i_15_) {
			if (i_15_ >= 0 && i_15_ < anIntArray8044.length) {
				i_15_ = anIntArray8044[i_15_];
				if (i == 0 && 0 != (i_15_ & 0x80))
					i_15_ = 0;
				else
					i_15_ &= ~0x80;
			} else
				i_15_ = 0;
		} else
			i_15_ = 0;
		if (i_15_ != 0) {
			method13375(i, '\uffff', i_15_, -1004698520);
			keyevent.consume();
		}
	}

	public synchronized void keyTyped(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class175.method2962(c, -16711936)) {
			method13375(3, c, -1, -1446580970);
			keyevent.consume();
		}
	}

	void method13393(KeyEvent keyevent, int i) {
		int i_16_ = keyevent.getKeyCode();
		if (0 != i_16_) {
			if (i_16_ >= 0 && i_16_ < anIntArray8044.length) {
				i_16_ = anIntArray8044[i_16_];
				if (i == 0 && 0 != (i_16_ & 0x80))
					i_16_ = 0;
				else
					i_16_ &= ~0x80;
			} else
				i_16_ = 0;
		} else
			i_16_ = 0;
		if (i_16_ != 0) {
			method13375(i, '\uffff', i_16_, -2050548717);
			keyevent.consume();
		}
	}

	void method13394(KeyEvent keyevent, int i) {
		int i_17_ = keyevent.getKeyCode();
		if (0 != i_17_) {
			if (i_17_ >= 0 && i_17_ < anIntArray8044.length) {
				i_17_ = anIntArray8044[i_17_];
				if (i == 0 && 0 != (i_17_ & 0x80))
					i_17_ = 0;
				else
					i_17_ &= ~0x80;
			} else
				i_17_ = 0;
		} else
			i_17_ = 0;
		if (i_17_ != 0) {
			method13375(i, '\uffff', i_17_, -759753400);
			keyevent.consume();
		}
	}

	public void method3238(int i) {
		method13387((byte) 1);
	}

	public synchronized void method13395(KeyEvent keyevent) {
		method13378(keyevent, 1, (byte) 92);
	}

	public void method3247() {
		method13387((byte) 1);
	}

	public synchronized void method13396(KeyEvent keyevent) {
		char c = keyevent.getKeyChar();
		if (c != '\uffff' && Class175.method2962(c, -16711936)) {
			method13375(3, c, -1, -1496822076);
			keyevent.consume();
		}
	}

	void method13397(Component component, int i) {
		method13387((byte) 1);
		((Class199_Sub1) this).aComponent8050 = component;
		((Class199_Sub1) this).aComponent8050.addKeyListener(this);
		((Class199_Sub1) this).aComponent8050.addFocusListener(this);
	}

	public void method3248() {
		method13387((byte) 1);
	}

	public void method3249() {
		method13387((byte) 1);
	}

	int method13398(byte i) {
		int i_18_ = 0;
		if (((Class199_Sub1) this).aBoolArray8048[81])
			i_18_ |= 0x1;
		if (((Class199_Sub1) this).aBoolArray8048[82])
			i_18_ |= 0x4;
		if (((Class199_Sub1) this).aBoolArray8048[86])
			i_18_ |= 0x2;
		return i_18_;
	}

	static final void method13399(CS2Executor class527, int i) {
		int i_19_ = (class527.intOpValues[class527.instrPtr * 301123709]);
		Class537 class537 = IndexLoaders.aClass233_5822.method3933(i_19_, 1715918723);
		if (null == class537)
			throw new RuntimeException();
		Integer integer = (class527.aClass61_7010.method1199(client.CURRENT_GAME.anInt5746 * 1648080491 << 16 | i_19_, 1287514720));
		int i_20_;
		if (integer == null) {
			if (class537.aChar7096 == 'i' || class537.aChar7096 == '1')
				i_20_ = 0;
			else
				i_20_ = -1;
		} else
			i_20_ = integer.intValue();
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_20_;
	}
}
