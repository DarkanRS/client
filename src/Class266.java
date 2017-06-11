/* Class266 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class266 {
	static Class266 aClass266_2845;
	public static Class266 aClass266_2846;
	public static Class266 LOAD_MAP_SCENE_NORMAL;
	public static Class266 aClass266_2848 = new Class266(false, false);
	static Class266 aClass266_2849;
	static Class266 aClass266_2850;
	boolean aBoolean2851;
	public static Class266 aClass266_2852;
	boolean allowDynamicMap;
	public static Class266 LOAD_MAP_SCENE_DYNAMIC;
	public static Class243 aClass243_2855;

	boolean allowDynamicMapScene(int i) {
		try {
			return ((Class266) this).allowDynamicMap;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lb.a(").append(')').toString());
		}
	}

	public boolean method2522(byte i) {
		try {
			return ((Class266) this).aBoolean2851;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lb.f(").append(')').toString());
		}
	}

	static {
		aClass266_2846 = new Class266(true, false);
		LOAD_MAP_SCENE_NORMAL = new Class266(false, false);
		LOAD_MAP_SCENE_DYNAMIC = new Class266(true, false);
		aClass266_2849 = new Class266(true, false);
		aClass266_2845 = new Class266(true, true);
		aClass266_2850 = new Class266(true, true);
		aClass266_2852 = new Class266(false, false);
	}

	Class266(boolean bool, boolean bool_0_) {
		((Class266) this).allowDynamicMap = bool;
		((Class266) this).aBoolean2851 = bool_0_;
	}

	public static Class209[] method2523(int i) {
		try {
			return (new Class209[] { Class209.aClass209_2363, Class209.aClass209_2392, Class209.aClass209_2380, Class209.aClass209_2370, Class209.aClass209_2381, Class209.aClass209_2393, Class209.aClass209_2384, Class209.aClass209_2364, Class209.aClass209_2376, Class209.aClass209_2387, Class209.aClass209_2390, Class209.aClass209_2388, Class209.aClass209_2372, Class209.aClass209_2365, Class209.aClass209_2389, Class209.aClass209_2366, Class209.aClass209_2368, Class209.aClass209_2378,
					Class209.aClass209_2377, Class209.aClass209_2385, Class209.aClass209_2375, Class209.aClass209_2394, Class209.aClass209_2391, Class209.aClass209_2371, Class209.aClass209_2374, Class209.aClass209_2369, Class209.aClass209_2383, Class209.aClass209_2373, Class209.aClass209_2386, Class209.aClass209_2382, Class209.aClass209_2379, Class209.aClass209_2367 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lb.a(").append(')').toString());
		}
	}

	public static Class128 method2524(RsByteBuffer class298_sub53, byte i) {
		try {
			Class128 class128 = Graphics.method608(class298_sub53, -2082890426);
			int i_1_ = class298_sub53.readBigSmart(1235052657);
			int i_2_ = class298_sub53.readBigSmart(1235052657);
			int i_3_ = class298_sub53.readBigSmart(1235052657);
			int i_4_ = class298_sub53.readBigSmart(1235052657);
			int i_5_ = class298_sub53.readBigSmart(1235052657);
			int i_6_ = class298_sub53.readBigSmart(1235052657);
			return new Class128_Sub3(class128.aClass139_6322, class128.aClass133_6323, -39975161 * class128.anInt6327, class128.anInt6325 * 1886882435, class128.anInt6326 * -944287579, class128.anInt6330 * -1387457793, -684094775 * class128.anInt6328, class128.anInt6329 * 955568089, class128.anInt6324 * 782326281, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lb.i(").append(')').toString());
		}
	}

	static final int method2525(Entity class365_sub1_sub1_sub2, int i) {
		try {
			if (0 == 907865649 * class365_sub1_sub1_sub2.anInt10115)
				return 0;
			if (class365_sub1_sub1_sub2.anInt10090 * 1433412323 != -1) {
				Entity class365_sub1_sub1_sub2_7_ = null;
				if (class365_sub1_sub1_sub2.anInt10090 * 1433412323 < 32768) {
					Class298_Sub29 class298_sub29 = ((Class298_Sub29) (client.npcs.get((long) (1433412323 * class365_sub1_sub1_sub2.anInt10090))));
					if (class298_sub29 != null)
						class365_sub1_sub1_sub2_7_ = ((Entity) class298_sub29.anObject7366);
				} else if (class365_sub1_sub1_sub2.anInt10090 * 1433412323 >= 32768 && ((1433412323 * class365_sub1_sub1_sub2.anInt10090 - 32768) < client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805.length))
					class365_sub1_sub1_sub2_7_ = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[(1433412323 * class365_sub1_sub1_sub2.anInt10090 - 32768)]);
				if (class365_sub1_sub1_sub2_7_ != null) {
					Class217 class217 = Class217.method2011(class365_sub1_sub1_sub2.method4337().aClass217_2599, (class365_sub1_sub1_sub2_7_.method4337().aClass217_2599));
					int i_8_ = (int) class217.aFloat2451;
					int i_9_ = (int) class217.aFloat2454;
					if (i_8_ != 0 || 0 != i_9_)
						class365_sub1_sub1_sub2.method4414((int) (Math.atan2((double) i_8_, (double) i_9_) * 2607.5945876176133) & 0x3fff, (byte) 1);
				}
			}
			if (class365_sub1_sub1_sub2 instanceof Player) {
				Player class365_sub1_sub1_sub2_sub2 = (Player) class365_sub1_sub1_sub2;
				if (-1 != class365_sub1_sub1_sub2_sub2.anInt10221 * 1208589843 && (0 == (class365_sub1_sub1_sub2_sub2.anInt10120 * 2050671733) || (-1531994851 * class365_sub1_sub1_sub2_sub2.anInt10124) > 0)) {
					class365_sub1_sub1_sub2_sub2.method4414(1208589843 * class365_sub1_sub1_sub2_sub2.anInt10221, (byte) 1);
					class365_sub1_sub1_sub2_sub2.anInt10221 = 1530078181;
				}
			} else if (class365_sub1_sub1_sub2 instanceof NPC) {
				NPC class365_sub1_sub1_sub2_sub1 = (NPC) class365_sub1_sub1_sub2;
				if (-1 != class365_sub1_sub1_sub2_sub1.anInt10179 * 579792529 && ((class365_sub1_sub1_sub2_sub1.anInt10120 * 2050671733 == 0) || (-1531994851 * class365_sub1_sub1_sub2_sub1.anInt10124) > 0)) {
					Class217 class217 = (class365_sub1_sub1_sub2_sub1.method4337().aClass217_2599);
					Class341 class341 = client.aClass283_8716.method2628(681479919);
					int i_10_ = ((int) class217.aFloat2451 - ((class365_sub1_sub1_sub2_sub1.anInt10179 * -1896967936) - 263081728 * class341.gameSceneBaseX - 263081728 * class341.gameSceneBaseX));
					int i_11_ = ((int) class217.aFloat2454 - ((893346048 * class365_sub1_sub1_sub2_sub1.anInt10180) - class341.gameSceneBaseY * -434703616 - class341.gameSceneBaseY * -434703616));
					if (0 != i_10_ || i_11_ != 0)
						class365_sub1_sub1_sub2_sub1.method4414((int) (Math.atan2((double) i_10_, (double) i_11_) * 2607.5945876176133) & 0x3fff, (byte) 1);
					class365_sub1_sub1_sub2_sub1.anInt10179 = -1312461425;
				}
			}
			return class365_sub1_sub1_sub2.method4450((short) 6752);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lb.ha(").append(')').toString());
		}
	}

	static void method2526(GraphicsToolkit class_ra, Class453 class453, int i, int i_12_, int i_13_) {
		try {
			Class476.aClass453_5986.method5943((byte) 1);
			if (!Class301_Sub1.aBoolean7635) {
				for (Class298_Sub52 class298_sub52 = (Class298_Sub52) class453.method5939(1766612795); class298_sub52 != null; class298_sub52 = (Class298_Sub52) class453.method5944(49146)) {
					Class352 class352 = (Class301_Sub1.aClass339_3251.method4116(-530122905 * class298_sub52.anInt7608, -1838109089));
					if (!Class422_Sub29.method5728(class352, 1541069402)) {
						if (i_13_ <= -4851154) {
							/* empty */
						}
					} else {
						boolean bool = Class386.method4726(class_ra, class298_sub52, class352, i, i_12_, -1417215477);
						if (bool)
							Class368.method4556(class_ra, class298_sub52, class352, 1387394029);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lb.bh(").append(')').toString());
		}
	}

	static final void method2527(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class66.anInt666 * -1972322437;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lb.amk(").append(')').toString());
		}
	}
}
