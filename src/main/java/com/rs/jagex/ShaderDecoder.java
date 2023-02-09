package com.rs.jagex;

public class ShaderDecoder {

	static Class253 aClass253_1008;
	public static void sortAlphabetically(String[] names, short[] ids) {
		Static.method1495(names, ids, 0, names.length - 1);
	}
	byte[] data;

	int decoderIndex;

	ShaderDecoder(byte[] bytes_1) {
		data = bytes_1;
		decoderIndex = 0;
	}

	int getNextStringLength() {
		short s_2 = 0;
		for (int i_3 = 0; i_3 < 2; i_3++)
			s_2 |= (data[++decoderIndex - 1] & 0xff) << i_3 * 8;
		return s_2;
	}

	String readString() {
		int length = getNextStringLength();
		if (length == -1)
			return null;
		if (length > 256)
			throw new RuntimeException_Sub4();
		else {
			String str = new String(data, decoderIndex, length);
			decoderIndex += length;
			return str;
		}
	}
}
