package com.rs.jagex;

import java.io.*;

public class Class353 {

	static Class353 aClass353_4107 = new Class353();

	static Class353 aClass353_4105 = new Class353();

	static Class353 aClass353_4106 = new Class353();

	static void addGroundItem(int i_0, int x, int y, GroundItemNode groundItem) {
		long long_5 = i_0 << 28 | y << 14 | x;
		Node_Sub29 class282_sub29_7 = (Node_Sub29) client.aClass465_7414.get(long_5);
		if (class282_sub29_7 == null) {
			class282_sub29_7 = new Node_Sub29();
			client.aClass465_7414.put(class282_sub29_7, long_5);
		} else {
			ItemDefinitions itemdefinitions_8 = IndexLoaders.ITEM_LOADER.getItemDefinitions(groundItem.id);
			int i_9 = itemdefinitions_8.value;
			if (itemdefinitions_8.stackable == 1)
				i_9 *= groundItem.amount + 1;
			for (GroundItemNode class282_sub34_10 = (GroundItemNode) class282_sub29_7.aClass482_7708.head(); class282_sub34_10 != null; class282_sub34_10 = (GroundItemNode) class282_sub29_7.aClass482_7708.next()) {
				itemdefinitions_8 = IndexLoaders.ITEM_LOADER.getItemDefinitions(class282_sub34_10.id);
				int i_11 = itemdefinitions_8.value;
				if (itemdefinitions_8.stackable == 1)
					i_11 *= class282_sub34_10.amount + 1;
				if (i_9 > i_11) {
					Class446.method7430(groundItem, class282_sub34_10);
					return;
				}
			}
		}
		class282_sub29_7.aClass482_7708.append(groundItem);
	}

	static void method6208(File file_0, byte[] bytes_1, int i_2) throws IOException {
		DataInputStream datainputstream_4 = new DataInputStream(new BufferedInputStream(new FileInputStream(file_0)));
		try {
			datainputstream_4.readFully(bytes_1, 0, i_2);
		} catch (EOFException ignored) {
		}
		datainputstream_4.close();
	}

	public static Class353[] values() {
		return new Class353[]{aClass353_4107, aClass353_4105, aClass353_4106};
	}

	public int method6198(int i_1, int i_2) {
		int i_4 = Math.max(Engine.BASE_WINDOW_HEIGHT * -969250379, i_2);
		return this == aClass353_4107 ? 0 : (this == aClass353_4106 ? i_4 - i_1 : (this == aClass353_4105 ? (i_4 - i_1) / 2 : 0));
	}
}
