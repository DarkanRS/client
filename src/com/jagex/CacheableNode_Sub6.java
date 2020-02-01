package com.jagex;
public class CacheableNode_Sub6 extends CacheableNode {

	int anInt9538 = -1;
	public int anInt9542 = -1;
	public int anInt9539 = 12800;
	public int anInt9540 = 0;
	public int anInt9541 = 12800;
	public int anInt9535 = 0;
	boolean aBool9543 = true;
	public int anInt9536;
	public String aString9533;
	public String aString9534;
	public int anInt9532;
	NodeCollection aClass482_9537;

	public boolean method14775(int i_1, int i_2, int[] ints_3, int i_4) {
		for (Node_Sub28 class282_sub28_5 = (Node_Sub28) this.aClass482_9537.head(); class282_sub28_5 != null; class282_sub28_5 = (Node_Sub28) this.aClass482_9537.next(756655030)) {
			if (class282_sub28_5.method12409(i_1, i_2)) {
				class282_sub28_5.method12410(i_1, i_2, ints_3);
				return true;
			}
		}

		return false;
	}

	CacheableNode_Sub6(int i_1, String string_2, String string_3, int i_4, int i_5, boolean bool_6, int i_7, int i_8) {
		this.anInt9536 = i_1;
		this.aString9533 = string_2;
		this.aString9534 = string_3;
		this.anInt9532 = i_4;
		this.anInt9538 = i_5;
		this.aBool9543 = bool_6;
		this.anInt9542 = i_7;
		if (this.anInt9542 == 255) {
			this.anInt9542 = 0;
		}

		Class480.getMapSize(i_8, (byte) 69);
		this.aClass482_9537 = new NodeCollection();
	}

	public boolean method14777(int i_1, int i_2, int[] ints_3, int i_4) {
		for (Node_Sub28 class282_sub28_5 = (Node_Sub28) this.aClass482_9537.head(); class282_sub28_5 != null; class282_sub28_5 = (Node_Sub28) this.aClass482_9537.next(1143191300)) {
			if (class282_sub28_5.method12415(i_1, i_2, 2103169135)) {
				class282_sub28_5.method12414(i_1, i_2, ints_3, -1628136570);
				return true;
			}
		}

		return false;
	}

	public boolean method14778(int i_1, int i_2, int i_3, int[] ints_4, int i_5) {
		for (Node_Sub28 class282_sub28_6 = (Node_Sub28) this.aClass482_9537.head(); class282_sub28_6 != null; class282_sub28_6 = (Node_Sub28) this.aClass482_9537.next(-376153003)) {
			if (class282_sub28_6.method12408(i_1, i_2, i_3)) {
				class282_sub28_6.method12414(i_2, i_3, ints_4, 698012248);
				return true;
			}
		}

		return false;
	}

	void method14779() {
		this.anInt9539 = 12800;
		this.anInt9540 = 0;
		this.anInt9541 = 12800;
		this.anInt9535 = 0;

		for (Node_Sub28 class282_sub28_2 = (Node_Sub28) this.aClass482_9537.head(); class282_sub28_2 != null; class282_sub28_2 = (Node_Sub28) this.aClass482_9537.next(361173732)) {
			if (class282_sub28_2.anInt7701 < this.anInt9539) {
				this.anInt9539 = class282_sub28_2.anInt7701;
			}

			if (class282_sub28_2.anInt7704 > this.anInt9540) {
				this.anInt9540 = class282_sub28_2.anInt7704;
			}

			if (class282_sub28_2.anInt7703 < this.anInt9541) {
				this.anInt9541 = class282_sub28_2.anInt7703;
			}

			if (class282_sub28_2.anInt7705 > this.anInt9535) {
				this.anInt9535 = class282_sub28_2.anInt7705;
			}
		}

	}

	boolean method14784(int i_1, int i_2) {
		for (Node_Sub28 class282_sub28_4 = (Node_Sub28) this.aClass482_9537.head(); class282_sub28_4 != null; class282_sub28_4 = (Node_Sub28) this.aClass482_9537.next(1597035848)) {
			if (class282_sub28_4.method12415(i_1, i_2, 2088759506)) {
				return true;
			}
		}

		return false;
	}

	public static void method14788(String string_0, boolean bool_1, boolean bool_2, boolean bool_3, boolean bool_4, byte b_5) {
		PingRequester.method8736(string_0, bool_1, bool_2, "openjs", bool_3, bool_4, (byte) 60);
	}

}
