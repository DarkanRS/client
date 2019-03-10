import java.io.IOException;

public class Class31 implements IndexLoader {

	public static int anInt361;

	SoftCache aClass229_360 = new SoftCache(64);

	Index aClass317_358;

	Index aClass317_359;

	public IdentikitDefinition method800(int i_1, int i_2) {
		SoftCache softcache_4 = this.aClass229_360;
		IdentikitDefinition class44_3;
		synchronized (this.aClass229_360) {
			class44_3 = (IdentikitDefinition) this.aClass229_360.get((long) i_1);
		}
		if (class44_3 != null) {
			return class44_3;
		} else {
			Index index_5 = this.aClass317_358;
			byte[] bytes_10;
			synchronized (this.aClass317_358) {
				bytes_10 = this.aClass317_358.getFile(SharedConfigsType.aClass120_1466.id, i_1);
			}
			class44_3 = new IdentikitDefinition();
			class44_3.aClass31_429 = this;
			if (bytes_10 != null) {
				class44_3.method909(new RsByteBuffer(bytes_10), -1148034067);
			}
			SoftCache softcache_9 = this.aClass229_360;
			synchronized (this.aClass229_360) {
				this.aClass229_360.put(class44_3, (long) i_1);
				return class44_3;
			}
		}
	}

	public void method801(int i_1) {
		SoftCache softcache_2 = this.aClass229_360;
		synchronized (this.aClass229_360) {
			this.aClass229_360.method3859(-1013964419);
		}
	}

	public void method802(int i_1, int i_2) {
		SoftCache softcache_3 = this.aClass229_360;
		synchronized (this.aClass229_360) {
			this.aClass229_360.method3858(i_1, (byte) -3);
		}
	}

	public void method803(byte b_1) {
		SoftCache softcache_2 = this.aClass229_360;
		synchronized (this.aClass229_360) {
			this.aClass229_360.method3863(903388454);
		}
	}

	public Class31(Game game_1, Language xlanguage_2, Index index_3, Index index_4) {
		this.aClass317_358 = index_3;
		this.aClass317_359 = index_4;
		this.aClass317_358.filesCount(SharedConfigsType.aClass120_1466.id);
	}

	public static void method809(RsByteBuffer rsbytebuffer_0, int i_1) {
		byte[] bytes_2 = new byte[24];
		try {
			Engine.aClass440_3269.method7347(0L);
			Engine.aClass440_3269.method7351(bytes_2, -991225250);
			int i_3;
			for (i_3 = 0; i_3 < 24 && bytes_2[i_3] == 0; i_3++) {
				;
			}
			if (i_3 >= 24) {
				throw new IOException();
			}
		} catch (Exception exception_6) {
			for (int i_4 = 0; i_4 < 24; i_4++) {
				bytes_2[i_4] = -1;
			}
		}
		rsbytebuffer_0.writeBytes(bytes_2, 0, 24);
	}

	public static final Class282_Sub44 method812(int i_0, Class282_Sub44 class282_sub44_1, int[] ints_2, boolean bool_3, byte b_4) {
		Class282_Sub44 class282_sub44_5 = (Class282_Sub44) client.aClass465_7442.get((long) i_0);
		if (class282_sub44_5 != null) {
			Class351.method6196(class282_sub44_5, class282_sub44_5.anInt8063 != class282_sub44_1.anInt8063, bool_3, -1911344380);
		}
		client.aClass465_7442.put(class282_sub44_1, (long) i_0);
		ClipMap.method6007(class282_sub44_1.anInt8063, ints_2, -1937827624);
		IComponentDefinitions icomponentdefinitions_6 = Class117.method1981(i_0, (byte) 76);
		if (icomponentdefinitions_6 != null) {
			Class109.method1858(icomponentdefinitions_6, (byte) 12);
		}
		if (client.aClass118_7352 != null) {
			Class109.method1858(client.aClass118_7352, (byte) -25);
			client.aClass118_7352 = null;
		}
		OutputStream_Sub1.method12938((byte) 26);
		if (icomponentdefinitions_6 != null) {
			Class12.method483(Class468_Sub8.aClass98Array7889[icomponentdefinitions_6.idHash >>> 16], icomponentdefinitions_6, !bool_3, -1031164822);
		}
		if (!bool_3) {
			Class150.method2582(class282_sub44_1.anInt8063, ints_2, -1100140607);
		}
		if (!bool_3 && client.anInt7349 != -1) {
			Class383.method6514(client.anInt7349, 1, 815212600);
		}
		return class282_sub44_1;
	}

	static final void method813(int i_0, int i_1, int i_2, int i_3, int i_4) {
		int i_5 = 0;
		int i_6 = i_2;
		int i_7 = -i_2;
		int i_8 = -1;
		Class232.method3922(Class532_Sub3.anIntArrayArray7072[i_1], i_0 - i_2, i_0 + i_2, i_3, (byte) -15);
		while (i_6 > i_5) {
			i_8 += 2;
			i_7 += i_8;
			++i_5;
			if (i_7 >= 0) {
				--i_6;
				i_7 -= i_6 << 1;
				int[] ints_9 = Class532_Sub3.anIntArrayArray7072[i_6 + i_1];
				int[] ints_10 = Class532_Sub3.anIntArrayArray7072[i_1 - i_6];
				int i_11 = i_0 + i_5;
				int i_12 = i_0 - i_5;
				Class232.method3922(ints_9, i_12, i_11, i_3, (byte) -71);
				Class232.method3922(ints_10, i_12, i_11, i_3, (byte) 45);
			}
			int i_13 = i_0 + i_6;
			int i_14 = i_0 - i_6;
			int[] ints_15 = Class532_Sub3.anIntArrayArray7072[i_5 + i_1];
			int[] ints_16 = Class532_Sub3.anIntArrayArray7072[i_1 - i_5];
			Class232.method3922(ints_15, i_14, i_13, i_3, (byte) 11);
			Class232.method3922(ints_16, i_14, i_13, i_3, (byte) -34);
		}
	}
}
