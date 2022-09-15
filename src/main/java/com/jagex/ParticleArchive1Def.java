package com.jagex;

import java.io.File;
import java.io.IOException;

import com.Loader;

public class ParticleArchive1Def {

	public static ParticleArchive1Def[] aClass345Array4025 = new ParticleArchive1Def[16];
	public static IterableNodeMap aClass465_4029 = new IterableNodeMap(16);
	static Index PARTICLE_INDEX;
	static int anInt4028;
	static LRUCache aClass229_4031 = new LRUCache(64);
	public static Class442 method6137(String string_0, String string_1, boolean bool_2) {
		File file_4 = new File(Engine.aFile3264, "preferences" + string_0 + ".dat");
		if (file_4.exists())
			try {
				Class442 class442_12 = new Class442(file_4, 10000L);
				return class442_12;
			} catch (IOException ignored) {
			}
		String str_5 = "";
		if (Class514.anInt5887 == 33)
			str_5 = "_rc";
		else if (Class514.anInt5887 == 34)
			str_5 = "_wip";
		File file_6 = new File(Class110.aString1103 + File.separatorChar + Loader.CACHE_DIR, "dk_" + string_1 + "_preferences" + string_0 + str_5 + ".dat");
		Class442 class442_8;
		if (!bool_2 && file_6.exists())
			try {
				class442_8 = new Class442(file_6, 10000L);
				return class442_8;
			} catch (IOException ignored) {
			}
		try {
			class442_8 = new Class442(file_4, 10000L);
			return class442_8;
		} catch (IOException ioexception_9) {
			throw new RuntimeException();
		}
	}
	public static boolean method6140() {
		return Class148.anInt1730 != 0;
	}
	static void method6143(int i_0) {
		NewsItem.anInt1069 = i_0;
		ItemContainer.aClass229_7712.method3859();
	}
	static void worldLogin(String string_0, String string_1) {
		Class9.lobbyStage = 273;
		Class9.CURRENT_CONNECTION_CONTEXT = client.GAME_CONNECTION_CONTEXT;
		Class455.method7558(false, false, string_0, string_1, -1L);
	}
	public int anInt4032;
	public int anInt4038;
	public int anInt4035;
	public int anInt4027;
	public int anInt4036;
	public int anInt4037;
	public int anInt4041;
	public int anInt4039;
	public int anInt4040;
	public int anInt4024;

	public int anInt4033;

	public long aLong4044;

	int anInt4034;

	boolean aBool4042;

	void method6124(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0)
				return;
			method6125(rsbytebuffer_1, i_3);
		}
	}

	void method6125(ByteBuf rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			if (false)
				throw new IllegalStateException();
			anInt4034 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 2)
			rsbytebuffer_1.readUnsignedByte();
		else if (i_2 == 3) {
			if (false)
				throw new IllegalStateException();
			anInt4027 = rsbytebuffer_1.readInt();
			anInt4036 = rsbytebuffer_1.readInt();
			anInt4037 = rsbytebuffer_1.readInt();
		} else if (i_2 == 4) {
			if (false)
				anInt4038 = rsbytebuffer_1.readUnsignedByte();
			anInt4035 = rsbytebuffer_1.readInt();
		} else if (i_2 == 6) {
			if (false)
				throw new IllegalStateException();
			anInt4041 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 8) {
			if (true)
				anInt4040 = 1;
		} else if (i_2 == 9)
			anInt4039 = 1;
		else if (i_2 == 10)
			if (false)
				aBool4042 = true;
	}

	void method6128() {
		anInt4024 = Trig.COSINE[anInt4034 << 3];
		long long_2 = anInt4027;
		long long_4 = anInt4036;
		long long_6 = anInt4037;
		anInt4033 = (int) Math.sqrt((long_2 * long_2 + long_4 * long_4 + long_6 * long_6));
		if (anInt4035 == 0)
			anInt4035 = 1;
		if (anInt4038 == 0)
			aLong4044 = 2147483647L;
		else if (anInt4038 == 1) {
			aLong4044 = anInt4033 * 8 / anInt4035;
			aLong4044 *= aLong4044;
		} else if (anInt4038 == 2)
			aLong4044 = anInt4033 * 8 / anInt4035;
		if (aBool4042)
			anInt4033 *= -1;
	}
}
