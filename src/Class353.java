import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Class353 {

	static Class353 aClass353_4107 = new Class353();

	static Class353 aClass353_4105 = new Class353();

	static Class353 aClass353_4106 = new Class353();

	public int method6198(int i_1, int i_2, int i_3) {
		int i_4 = Engine.anInt3243 * -969250379 > i_2 ? Engine.anInt3243 * -969250379 : i_2;
		return this == aClass353_4107 ? 0 : (this == aClass353_4106 ? i_4 - i_1 : (this == aClass353_4105 ? (i_4 - i_1) / 2 : 0));
	}

	static void method6208(File file_0, byte[] bytes_1, int i_2) throws IOException {
		DataInputStream datainputstream_4 = new DataInputStream(new BufferedInputStream(new FileInputStream(file_0)));
		try {
			datainputstream_4.readFully(bytes_1, 0, i_2);
		} catch (EOFException eofexception_6) {
			;
		}
		datainputstream_4.close();
	}

	static void method6209(int i_0, int i_1, int i_2, Class282_Sub34 class282_sub34_3, int i_4) {
		long long_5 = (long) (i_0 << 28 | i_2 << 14 | i_1);
		Class282_Sub29 class282_sub29_7 = (Class282_Sub29) client.aClass465_7414.get(long_5);
		if (class282_sub29_7 == null) {
			class282_sub29_7 = new Class282_Sub29();
			client.aClass465_7414.put(class282_sub29_7, long_5);
			class282_sub29_7.aClass482_7708.append(class282_sub34_3, 64810777);
		} else {
			ItemDefinitions itemdefinitions_8 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(class282_sub34_3.anInt7853, 1474868024);
			int i_9 = itemdefinitions_8.value;
			if (itemdefinitions_8.stackable == 1) {
				i_9 *= class282_sub34_3.anInt7852 + 1;
			}
			for (Class282_Sub34 class282_sub34_10 = (Class282_Sub34) class282_sub29_7.aClass482_7708.head((byte) 33); class282_sub34_10 != null; class282_sub34_10 = (Class282_Sub34) class282_sub29_7.aClass482_7708.next(1444311005)) {
				itemdefinitions_8 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(class282_sub34_10.anInt7853, 1449282948);
				int i_11 = itemdefinitions_8.value;
				if (itemdefinitions_8.stackable == 1) {
					i_11 *= class282_sub34_10.anInt7852 + 1;
				}
				if (i_9 > i_11) {
					Class446.method7430(class282_sub34_3, class282_sub34_10, -1282402285);
					return;
				}
			}
			class282_sub29_7.aClass482_7708.append(class282_sub34_3, -1833227399);
		}
	}
}
