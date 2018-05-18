
/* Class418 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class418 {
	public int anInt4995;
	public boolean aBool4996 = false;
	public int anInt4997;
	Class427 aClass427_4998;
	public static int anInt4999;

	public NativeSprite method7007(GraphicalRenderer class505, int i, boolean bool) {
		long l = (long) (-1053123675 * anInt4995 | i << 16 | (bool ? 262144 : 0) | -413843045 * class505.rendererId << 19);
		NativeSprite class160 = (NativeSprite) ((Class427) ((Class418) this).aClass427_4998).aClass229_5122.method3865(l);
		if (null != class160)
			return class160;
		if (!((Class427) ((Class418) this).aClass427_4998).aClass317_5118.method5661(-1053123675 * anInt4995, -989855693))
			return null;
		Class91 class91 = Class91.method1522((((Class427) ((Class418) this).aClass427_4998).aClass317_5118), anInt4995 * -1053123675, 0);
		if (class91 != null) {
			Class91 class91_0_ = class91;
			Class91 class91_1_ = class91;
			Class91 class91_2_ = class91;
			class91.anInt959 = 0;
			class91_2_.anInt958 = 0;
			class91_1_.anInt956 = 0;
			class91_0_.anInt953 = 0;
			if (bool)
				class91.method1526();
			for (int i_3_ = 0; i_3_ < i; i_3_++)
				class91.method1527();
		}
		class160 = class505.method8444(class91, true);
		if (null != class160)
			((Class427) ((Class418) this).aClass427_4998).aClass229_5122.put(class160, l);
		return class160;
	}

	void method7008(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_4_ = class282_sub35.readUnsignedByte();
			if (i_4_ == 0)
				break;
			method7009(class282_sub35, i_4_, -1539480331);
		}
	}

	void method7009(RsByteBuffer class282_sub35, int i, int i_5_) {
		if (1 == i)
			anInt4995 = class282_sub35.readBigSmart(1946439151) * 255251501;
		else if (2 == i)
			anInt4997 = class282_sub35.read24BitUnsignedInteger((short) 28155) * -1533569987;
		else if (3 == i)
			aBool4996 = true;
		else if (i == 4)
			anInt4995 = -255251501;
	}

	public NativeSprite method7010(GraphicalRenderer class505, int i, boolean bool, byte i_6_) {
		long l = (long) (-1053123675 * anInt4995 | i << 16 | (bool ? 262144 : 0) | -413843045 * class505.rendererId << 19);
		NativeSprite class160 = (NativeSprite) ((Class427) ((Class418) this).aClass427_4998).aClass229_5122.method3865(l);
		if (null != class160)
			return class160;
		if (!((Class427) ((Class418) this).aClass427_4998).aClass317_5118.method5661(-1053123675 * anInt4995, -2124549990))
			return null;
		Class91 class91 = Class91.method1522((((Class427) ((Class418) this).aClass427_4998).aClass317_5118), anInt4995 * -1053123675, 0);
		if (class91 != null) {
			Class91 class91_7_ = class91;
			Class91 class91_8_ = class91;
			Class91 class91_9_ = class91;
			class91.anInt959 = 0;
			class91_9_.anInt958 = 0;
			class91_8_.anInt956 = 0;
			class91_7_.anInt953 = 0;
			if (bool)
				class91.method1526();
			for (int i_10_ = 0; i_10_ < i; i_10_++)
				class91.method1527();
		}
		class160 = class505.method8444(class91, true);
		if (null != class160)
			((Class427) ((Class418) this).aClass427_4998).aClass229_5122.put(class160, l);
		return class160;
	}

	public NativeSprite method7011(GraphicalRenderer class505, int i, boolean bool) {
		long l = (long) (-1053123675 * anInt4995 | i << 16 | (bool ? 262144 : 0) | -413843045 * class505.rendererId << 19);
		NativeSprite class160 = (NativeSprite) ((Class427) ((Class418) this).aClass427_4998).aClass229_5122.method3865(l);
		if (null != class160)
			return class160;
		if (!((Class427) ((Class418) this).aClass427_4998).aClass317_5118.method5661(-1053123675 * anInt4995, 1427666232))
			return null;
		Class91 class91 = Class91.method1522((((Class427) ((Class418) this).aClass427_4998).aClass317_5118), anInt4995 * -1053123675, 0);
		if (class91 != null) {
			Class91 class91_11_ = class91;
			Class91 class91_12_ = class91;
			Class91 class91_13_ = class91;
			class91.anInt959 = 0;
			class91_13_.anInt958 = 0;
			class91_12_.anInt956 = 0;
			class91_11_.anInt953 = 0;
			if (bool)
				class91.method1526();
			for (int i_14_ = 0; i_14_ < i; i_14_++)
				class91.method1527();
		}
		class160 = class505.method8444(class91, true);
		if (null != class160)
			((Class427) ((Class418) this).aClass427_4998).aClass229_5122.put(class160, l);
		return class160;
	}

	void method7012(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method7009(class282_sub35, i, -1696448387);
		}
	}

	void method7013(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method7009(class282_sub35, i, -1757847144);
		}
	}

	public NativeSprite method7014(GraphicalRenderer class505, int i, boolean bool) {
		long l = (long) (-1053123675 * anInt4995 | i << 16 | (bool ? 262144 : 0) | -413843045 * class505.rendererId << 19);
		NativeSprite class160 = (NativeSprite) ((Class427) ((Class418) this).aClass427_4998).aClass229_5122.method3865(l);
		if (null != class160)
			return class160;
		if (!((Class427) ((Class418) this).aClass427_4998).aClass317_5118.method5661(-1053123675 * anInt4995, -518493050))
			return null;
		Class91 class91 = Class91.method1522((((Class427) ((Class418) this).aClass427_4998).aClass317_5118), anInt4995 * -1053123675, 0);
		if (class91 != null) {
			Class91 class91_15_ = class91;
			Class91 class91_16_ = class91;
			Class91 class91_17_ = class91;
			class91.anInt959 = 0;
			class91_17_.anInt958 = 0;
			class91_16_.anInt956 = 0;
			class91_15_.anInt953 = 0;
			if (bool)
				class91.method1526();
			for (int i_18_ = 0; i_18_ < i; i_18_++)
				class91.method1527();
		}
		class160 = class505.method8444(class91, true);
		if (null != class160)
			((Class427) ((Class418) this).aClass427_4998).aClass229_5122.put(class160, l);
		return class160;
	}

	Class418() {
		/* empty */
	}

	public boolean method7015(int i) {
		return ((Class427) ((Class418) this).aClass427_4998).aClass317_5118.method5661(-1053123675 * anInt4995, 2025308521);
	}

	public NativeSprite method7016(GraphicalRenderer class505, int i, boolean bool) {
		long l = (long) (-1053123675 * anInt4995 | i << 16 | (bool ? 262144 : 0) | -413843045 * class505.rendererId << 19);
		NativeSprite class160 = (NativeSprite) ((Class427) ((Class418) this).aClass427_4998).aClass229_5122.method3865(l);
		if (null != class160)
			return class160;
		if (!((Class427) ((Class418) this).aClass427_4998).aClass317_5118.method5661(-1053123675 * anInt4995, -1625219990))
			return null;
		Class91 class91 = Class91.method1522((((Class427) ((Class418) this).aClass427_4998).aClass317_5118), anInt4995 * -1053123675, 0);
		if (class91 != null) {
			Class91 class91_19_ = class91;
			Class91 class91_20_ = class91;
			Class91 class91_21_ = class91;
			class91.anInt959 = 0;
			class91_21_.anInt958 = 0;
			class91_20_.anInt956 = 0;
			class91_19_.anInt953 = 0;
			if (bool)
				class91.method1526();
			for (int i_22_ = 0; i_22_ < i; i_22_++)
				class91.method1527();
		}
		class160 = class505.method8444(class91, true);
		if (null != class160)
			((Class427) ((Class418) this).aClass427_4998).aClass229_5122.put(class160, l);
		return class160;
	}

	public boolean method7017() {
		return ((Class427) ((Class418) this).aClass427_4998).aClass317_5118.method5661(-1053123675 * anInt4995, 305646099);
	}

	public boolean method7018() {
		return ((Class427) ((Class418) this).aClass427_4998).aClass317_5118.method5661(-1053123675 * anInt4995, 2094416435);
	}

	public boolean method7019() {
		return ((Class427) ((Class418) this).aClass427_4998).aClass317_5118.method5661(-1053123675 * anInt4995, 1740123774);
	}

	public boolean method7020() {
		return ((Class427) ((Class418) this).aClass427_4998).aClass317_5118.method5661(-1053123675 * anInt4995, -1243706238);
	}

	static final void method7021(CS2Executor class527, int i) {
		boolean bool = false;
		String string = "";
		if (null != ((CS2Executor) class527).aClass191_7008 && ((CS2Executor) class527).aClass191_7008.method3154((byte) -45)) {
			File file = ((CS2Executor) class527).aClass191_7008.method3161(-2069377284);
			if (file != null) {
				string = file.getPath();
				if (null == string)
					string = "";
			}
			bool = true;
			((CS2Executor) class527).aClass191_7008 = null;
		}
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static void method7022(byte i) {
		Class9.lobbyStage = 211318143;
		Class9.aClass184_73 = client.aClass184_7475;
		if (client.aByteArray7152 != null) {
			RsByteBuffer class282_sub35 = new RsByteBuffer(client.aByteArray7152);
			Class9.aLong77 = (class282_sub35.readLong(1246778050) * 2087908126908168589L);
			Class9.aLong86 = (class282_sub35.readLong(441994271) * -3627564723025713089L);
		}
		if (8013795473128403269L * Class9.aLong77 < 0L)
			Class8_Sub1.method13784(35, -90187895);
		else
			Class455.method7558(false, true, "", "", Class9.aLong77 * 8013795473128403269L);
	}
}
