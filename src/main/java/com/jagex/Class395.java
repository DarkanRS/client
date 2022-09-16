package com.jagex;

import java.util.zip.Inflater;

public class Class395 {

	public static int b12FullIndex;
	public static void method6772(int i_0, int i_1, int i_2, int i_3, int i_4) {
		if (i_0 >= Class532.anInt7071 && i_1 <= Class532.anInt7069 && i_2 >= Class532.anInt7070 && i_3 <= Class532.anInt7068)
			CutsceneObject.method1564(i_0, i_1, i_2, i_3, i_4);
		else
			ProcessorSpecs.method7728(i_0, i_1, i_2, i_3, i_4);

	}

	Inflater anInflater4787;

	public byte[] method6764(byte[] bytes_1) {
		ByteBuf rsbytebuffer_3 = new ByteBuf(bytes_1);
		rsbytebuffer_3.index = bytes_1.length - 4;
		int i_4 = rsbytebuffer_3.method13085();
		byte[] bytes_5 = new byte[i_4];
		rsbytebuffer_3.index = 0;
		method6767(rsbytebuffer_3, bytes_5);
		return bytes_5;
	}

	public void method6767(ByteBuf rsbytebuffer_1, byte[] bytes_2) {
		if ((rsbytebuffer_1.buffer[rsbytebuffer_1.index] != 31) || (rsbytebuffer_1.buffer[rsbytebuffer_1.index + 1] != -117))
			throw new RuntimeException("");
		if (anInflater4787 == null)
			anInflater4787 = new Inflater(true);

		try {
			anInflater4787.setInput(rsbytebuffer_1.buffer, rsbytebuffer_1.index + 10, rsbytebuffer_1.buffer.length - (rsbytebuffer_1.index + 8 + 10));
			anInflater4787.inflate(bytes_2);
		} catch (Exception exception_5) {
			anInflater4787.reset();
			throw new RuntimeException("");
		}

		anInflater4787.reset();
	}

}
