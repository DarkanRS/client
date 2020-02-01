package com.jagex;
public class Node_Sub26_Sub1_Sub2 extends Node_Sub26_Sub1 {

	byte[] aByteArray10470;

	Node_Sub26_Sub1_Sub2(byte[] bytes_2, int i_3, int i_4) {
		this.anInt9750 = 22050;
		this.aByteArray10470 = bytes_2;
		this.anInt9749 = i_3;
		this.anInt9751 = i_4;
	}

	public Node_Sub26_Sub1_Sub2 method16062(Class344 class344_1) {
		this.aByteArray10470 = class344_1.method6102(this.aByteArray10470);
		this.anInt9750 = class344_1.method6112(this.anInt9750);
		if (this.anInt9749 == this.anInt9751) {
			this.anInt9749 = this.anInt9751 = class344_1.method6114(this.anInt9749, 750841507);
		} else {
			this.anInt9749 = class344_1.method6114(this.anInt9749, 1525418215);
			this.anInt9751 = class344_1.method6114(this.anInt9751, -554257346);
			if (this.anInt9749 == this.anInt9751) {
				--this.anInt9749;
			}
		}

		return this;
	}

	public int method15223() {
		return this.aByteArray10470.length;
	}

	public Node_Sub15_Sub5 method15225(int i_1, int i_2, int i_3) {
		return this.aByteArray10470 != null && this.aByteArray10470.length != 0 ? new Node_Sub15_Sub5_Sub2(this, i_1, i_2, i_3) : null;
	}

	public Node_Sub15_Sub5 method15230(int i_1, int i_2, int i_3) {
		return this.aByteArray10470 != null && this.aByteArray10470.length != 0 ? new Node_Sub15_Sub5_Sub2(this, i_1, i_2, i_3) : null;
	}

	public int method15227() {
		return this.aByteArray10470.length;
	}

	public int method15228() {
		return this.aByteArray10470.length;
	}

	public Node_Sub15_Sub5 method15229(int i_1, int i_2, int i_3) {
		return this.aByteArray10470 != null && this.aByteArray10470.length != 0 ? new Node_Sub15_Sub5_Sub2(this, i_1, i_2, i_3) : null;
	}

	public int method15226() {
		return this.aByteArray10470.length;
	}

	public Node_Sub15_Sub5 method15224(int i_1, int i_2, int i_3) {
		return this.aByteArray10470 != null && this.aByteArray10470.length != 0 ? new Node_Sub15_Sub5_Sub2(this, i_1, i_2, i_3) : null;
	}

}
