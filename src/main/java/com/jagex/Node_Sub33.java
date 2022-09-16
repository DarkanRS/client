package com.jagex;

public class Node_Sub33 extends Node {

	static Node_Sub15_Sub2 aNode_Sub15_Sub2_7836;
	static String method12582(ByteBuf rsbytebuffer_0) {
		try {
			int i_4 = rsbytebuffer_0.readSmart();
			if (i_4 > 32767)
				i_4 = 32767;
			byte[] bytes_5 = new byte[i_4];
			rsbytebuffer_0.index += Class113.HUFFMAN.method1973(rsbytebuffer_0.buffer, rsbytebuffer_0.index, bytes_5, 0, i_4);
			String string_6 = Utils.readString(bytes_5, 0, i_4);
			return string_6;
		} catch (Exception exception_8) {
			return "Cabbage";
		}
	}
	int anInt7830 = Integer.MAX_VALUE;
	int anInt7828 = Integer.MIN_VALUE;
	int anInt7834 = Integer.MAX_VALUE;
	int anInt7833 = Integer.MIN_VALUE;
	int anInt7829 = Integer.MAX_VALUE;
	int anInt7832 = Integer.MIN_VALUE;
	int anInt7831 = Integer.MAX_VALUE;
	int anInt7827 = Integer.MIN_VALUE;

	Node_Sub36 aNode_Sub36_7835;

	Node_Sub33(Node_Sub36 class282_sub36_1) {
		aNode_Sub36_7835 = class282_sub36_1;
	}

	boolean method12577(int i_1, int i_2) {
		return i_1 >= anInt7830 && i_1 <= anInt7828 && i_2 >= anInt7834 && i_2 <= anInt7833 || i_1 >= anInt7829 && i_1 <= anInt7832 && i_2 >= anInt7831 && i_2 <= anInt7827;
	}
}
