package com.rs.jagex;

public class CacheableNode_Sub4 extends CacheableNode {

	IterableNodeMap aClass465_9518;

	void method14747(ByteBuf rsbytebuffer_1, int i_2) {
		if (i_2 == 249) {
			int i_4 = rsbytebuffer_1.readUnsignedByte();
			int i_5;
			if (aClass465_9518 == null) {
				i_5 = Utils.nextPowerOfTwo(i_4);
				aClass465_9518 = new IterableNodeMap(i_5);
			}

			for (i_5 = 0; i_5 < i_4; i_5++) {
				boolean bool_6 = rsbytebuffer_1.readUnsignedByte() == 1;
				int i_7 = rsbytebuffer_1.read24BitUnsignedInteger();
				Node obj_8;
				if (bool_6)
					obj_8 = new ObjectNode(rsbytebuffer_1.readString());
				else
					obj_8 = new IntNode(rsbytebuffer_1.readInt());

				aClass465_9518.put(obj_8, i_7);
			}
		}

	}

	void method14748(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0)
				return;

			method14747(rsbytebuffer_1, i_3);
		}
	}

	public int method14750(int i_1, int i_2) {
		if (aClass465_9518 == null)
			return i_2;
		IntNode class282_sub38_4 = (IntNode) aClass465_9518.get(i_1);
		return class282_sub38_4 == null ? i_2 : class282_sub38_4.value;
	}

	public String method14751(int i_1, String string_2) {
		if (aClass465_9518 == null)
			return string_2;
		ObjectNode class282_sub47_4 = (ObjectNode) aClass465_9518.get(i_1);
		return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
	}

}
