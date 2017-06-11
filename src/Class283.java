/* Class283 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class283 {
	Class240_Sub1 aClass240_Sub1_3000;
	Class266 aClass266_3001;
	byte[][] aByteArrayArray3002;
	Class115 aClass115_3003;
	Class266 aClass266_3004;
	Class296 aClass296_3005;
	Class341 aClass341_3006 = new Class341();
	Class341 aClass341_3007 = new Class341();
	public boolean aBoolean3008;
	int anInt3009;
	int[] anIntArray3010;
	int anInt3011;
	Class244 aClass244_3012;
	Class364 aClass364_3013;
	byte[][] aByteArrayArray3014;
	int anInt3015;
	int anInt3016;
	Class298_Sub37_Sub13 aClass298_Sub37_Sub13_3017;
	boolean aBoolean3018;
	Class287 aClass287_3019 = new Class287(0, 0, 0, 0);
	float aFloat3020;
	int anInt3021;
	Class289[] SCENE_CLIP_DATA_PLANES = new Class289[4];
	int[][] anIntArrayArray3023;
	int anInt3024;
	Class273 aClass273_3025;
	int[][] anIntArrayArray3026;
	int anInt3027 = 0;
	int anInt3028 = 255626399;
	Class240_Sub1 aClass240_Sub1_3029;
	int anInt3030;
	int[] anIntArray3031;
	byte[][][] aByteArrayArrayArray3032;
	int[] anIntArray3033;
	int[] anIntArray3034;
	int[] anIntArray3035;
	int[] anIntArray3036;
	Class331 aClass331_3037;
	byte[][] aByteArrayArray3038;
	int anInt3039;
	Class433 aClass433_3040;
	byte[][] aByteArrayArray3041;
	int[][] anIntArrayArray3042;
	int[][][] anIntArrayArrayArray3043;
	byte[][] aByteArrayArray3044;
	public long aLong3045;

	public Class273 method2627(byte i) {
		try {
			return ((Class283) this).aClass273_3025;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.f(").append(')').toString());
		}
	}

	public Class341 method2628(int i) {
		try {
			return ((Class283) this).aClass341_3006;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.i(").append(')').toString());
		}
	}

	public int method2629(int i) {
		try {
			return ((Class283) this).anInt3039 * -991330803;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.k(").append(')').toString());
		}
	}

	public int method2630(int i) {
		try {
			return ((Class283) this).anInt3011 * -1456212765;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.d(").append(')').toString());
		}
	}

	public Class296 method2631(int i) {
		try {
			return ((Class283) this).aClass296_3005;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.u(").append(')').toString());
		}
	}

	public Class287 method2632(int i) {
		try {
			return ((Class283) this).aClass287_3019;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.x(").append(')').toString());
		}
	}

	public float method2633(int i) {
		try {
			return ((Class283) this).aFloat3020;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.r(").append(')').toString());
		}
	}

	public int method2634(byte i) {
		try {
			return ((Class283) this).anInt3015 * -2091897981;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.q(").append(')').toString());
		}
	}

	public int method2635(int i) {
		try {
			return 2073578817 * ((Class283) this).anInt3016;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.n(").append(')').toString());
		}
	}

	void method2636(Class240_Sub1 class240_sub1, byte[][] is, byte i) {
		try {
			for (int i_0_ = 0; i_0_ < 1551623871 * class240_sub1.anInt2626; i_0_++) {
				if (!((Class283) this).aBoolean3018)
					Class247.method2365(-286862514);
				for (int i_1_ = 0; i_1_ < -991330803 * ((Class283) this).anInt3039 >> 3; i_1_++) {
					for (int i_2_ = 0; i_2_ < ((Class283) this).anInt3011 * -1456212765 >> 3; i_2_++) {
						int i_3_ = (((Class283) this).anIntArrayArrayArray3043[i_0_][i_1_][i_2_]);
						if (-1 != i_3_) {
							int i_4_ = i_3_ >> 24 & 0x3;
							if (!class240_sub1.aBoolean2629 || i_4_ == 0) {
								int i_5_ = i_3_ >> 1 & 0x3;
								int i_6_ = i_3_ >> 14 & 0x3ff;
								int i_7_ = i_3_ >> 3 & 0x7ff;
								int i_8_ = i_7_ / 8 + (i_6_ / 8 << 8);
								for (int i_9_ = 0; i_9_ < (((Class283) this).anIntArray3031).length; i_9_++) {
									if (i_8_ == (((Class283) this).anIntArray3031[i_9_]) && null != is[i_9_]) {
										RsByteBuffer class298_sub53 = new RsByteBuffer(is[i_9_]);
										class240_sub1.method2216(class298_sub53, i_0_, i_1_ * 8, i_2_ * 8, i_4_, i_6_, i_7_, i_5_, (((Class283) this).SCENE_CLIP_DATA_PLANES), -828677341);
										class240_sub1.method2236(Class373.aClass_ra4071, class298_sub53, i_0_, 8 * i_1_, 8 * i_2_, i_4_, i_6_, i_7_, i_5_, -2145736118);
										break;
									}
								}
							}
						}
					}
				}
			}
			for (int i_10_ = 0; i_10_ < 1551623871 * class240_sub1.anInt2626; i_10_++) {
				if (!((Class283) this).aBoolean3018)
					Class247.method2365(788826930);
				for (int i_11_ = 0; i_11_ < -991330803 * ((Class283) this).anInt3039 >> 3; i_11_++) {
					for (int i_12_ = 0; (i_12_ < ((Class283) this).anInt3011 * -1456212765 >> 3); i_12_++) {
						int i_13_ = (((Class283) this).anIntArrayArrayArray3043[i_10_][i_11_][i_12_]);
						if (-1 == i_13_)
							class240_sub1.method2214(i_10_, 8 * i_11_, 8 * i_12_, 8, 8, 335584387);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.aq(").append(')').toString());
		}
	}

	public byte[][] method2637(int i, int i_14_) {
		try {
			if (null != ((Class283) this).aClass240_Sub1_3029 && (((Class283) this).aClass240_Sub1_3029.aByteArrayArrayArray2631) != null && (((Class283) this).aClass240_Sub1_3029.aByteArrayArrayArray2631[i]) != null)
				return (((Class283) this).aClass240_Sub1_3029.aByteArrayArrayArray2631[i]);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.z(").append(')').toString());
		}
	}

	public int[][] method2638(int i) {
		try {
			return ((Class283) this).anIntArrayArray3026;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.e(").append(')').toString());
		}
	}

	public Class289 getSceneClipDataPlane(int i) {
		try {
			return ((Class283) this).SCENE_CLIP_DATA_PLANES[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.t(").append(')').toString());
		}
	}

	public Class364 method2640(byte i) {
		try {
			return ((Class283) this).aClass364_3013;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.h(").append(')').toString());
		}
	}

	public Class433 method2641(int i) {
		try {
			return ((Class283) this).aClass433_3040;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.v(").append(')').toString());
		}
	}

	public byte[][][] method2642(int i) {
		try {
			return ((Class283) this).aByteArrayArrayArray3032;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.c(").append(')').toString());
		}
	}

	public void method2643(byte[][][] is, int i) {
		try {
			((Class283) this).aByteArrayArrayArray3032 = is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.m(").append(')').toString());
		}
	}

	public Class240_Sub1 method2644(int i) {
		try {
			return ((Class283) this).aClass240_Sub1_3029;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.w(").append(')').toString());
		}
	}

	public void method2645(Class433 class433, int i) {
		try {
			((Class283) this).aClass433_3040 = class433;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.j(").append(')').toString());
		}
	}

	public void method2646(byte i) {
		try {
			if (null != ((Class283) this).aClass331_3037) {
				Class66.method764((byte) 1);
				((Class283) this).aClass331_3037.aClass324_3528.method3956(-1174492425);
				((Class283) this).aClass331_3037 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.l(").append(')').toString());
		}
	}

	public void method2647(int i) {
		try {
			((Class283) this).aClass364_3013 = new Class364(Class373.aClass_ra4071, -991330803 * ((Class283) this).anInt3039 >> 3, ((Class283) this).anInt3011 * -1456212765 >> 3);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.aa(").append(')').toString());
		}
	}

	public void method2648(int i) {
		try {
			((Class283) this).anInt3015 = -896386664;
			((Class283) this).anInt3016 = ((int) (34.46 * (double) (-991330803 * ((Class283) this).anInt3039)) * -2038218047);
			((Class283) this).anInt3016 = ((2073578817 * ((Class283) this).anInt3016 << 2) * -2038218047);
			if (Class373.aClass_ra4071.method4998())
				((Class283) this).anInt3016 += 109412864;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ak(").append(')').toString());
		}
	}

	void method2649(byte i) {
		try {
			if (((Class283) this).aClass266_3001 != Class266.aClass266_2846 && (Class266.aClass266_2846 != ((Class283) this).aClass266_3004)) {
				if (((Class283) this).aClass266_3001 == Class266.LOAD_MAP_SCENE_DYNAMIC || (((Class283) this).aClass266_3001 == Class266.aClass266_2845) || ((((Class283) this).aClass266_3004 != ((Class283) this).aClass266_3001) && ((Class266.LOAD_MAP_SCENE_NORMAL == ((Class283) this).aClass266_3001) || (((Class283) this).aClass266_3004 == Class266.LOAD_MAP_SCENE_NORMAL)))) {
					client.anInt8703 = 0;
					client.anInt8772 = 0;
					client.npcs.clear((byte) -6);
				}
				((Class283) this).aClass266_3004 = ((Class283) this).aClass266_3001;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.as(").append(')').toString());
		}
	}

	public void sendMapScene(Class267 class267, int i) {
		try {
			((Class283) this).aClass266_3001 = ((Class267) class267).aClass266_2857;
			if (((Class283) this).aClass266_3001 == Class266.aClass266_2848) // background
				method2651(-1676557011);
			else if (((Class283) this).aClass266_3001 == Class266.LOAD_MAP_SCENE_NORMAL) // normal
				loadMapSceneNormal(((Class267) class267).aClass298_Sub53_Sub2_2856, -444215668);
			else if (((Class283) this).aClass266_3001 == Class266.aClass266_2846) // cutscenes
				method2665((byte) -112);
			else if (((Class283) this).aClass266_3001.allowDynamicMapScene(-1578454249)) // dynamic
																							// maps
				loadMapSceneDynamic(((Class267) class267).aClass298_Sub53_Sub2_2856, 1483918042);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ad(").append(')').toString());
		}
	}

	void method2651(int i) {
		try {
			method2655(Class94.method1020(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub11_7558.method5667(-369768513), 2010588610), 226677224);
			int i_16_ = ((Class283) this).aClass341_3006.gameSceneBaseX * -1760580017;
			int i_17_ = ((Class283) this).aClass341_3006.gameSceneBaseY * 283514611;
			int i_18_ = (Class367.anInt4000 * -1740717447 >> 12) + (i_16_ >> 3);
			int i_19_ = (i_17_ >> 3) + (-299812095 * Class146.anInt1575 >> 12);
			Class287.myPlayer.plane = (byte) 0;
			Class99.anInt952 = 0;
			Class287.myPlayer.method4472(8, 8, -1960083958);
			int i_20_ = 18;
			((Class283) this).anIntArrayArray3042 = new int[i_20_][4];
			((Class283) this).anIntArray3031 = new int[i_20_];
			((Class283) this).anIntArray3010 = new int[i_20_];
			((Class283) this).anIntArray3033 = new int[i_20_];
			((Class283) this).anIntArray3034 = new int[i_20_];
			((Class283) this).aByteArrayArray3038 = new byte[i_20_][];
			((Class283) this).aByteArrayArray3014 = new byte[i_20_][];
			((Class283) this).aByteArrayArray3044 = new byte[i_20_][];
			((Class283) this).anIntArray3035 = new int[i_20_];
			((Class283) this).anIntArray3036 = new int[i_20_];
			((Class283) this).aByteArrayArray3041 = new byte[i_20_][];
			((Class283) this).aByteArrayArray3002 = new byte[i_20_][];
			i_20_ = 0;
			for (int i_21_ = (i_18_ - (((Class283) this).anInt3039 * -991330803 >> 4)) / 8; i_21_ <= ((-991330803 * ((Class283) this).anInt3039 >> 4) + i_18_) / 8; i_21_++) {
				for (int i_22_ = (i_19_ - (((Class283) this).anInt3011 * -1456212765 >> 4)) / 8; i_22_ <= ((-1456212765 * ((Class283) this).anInt3011 >> 4) + i_19_) / 8; i_22_++) {
					int i_23_ = (i_21_ << 8) + i_22_;
					((Class283) this).anIntArray3031[i_20_] = i_23_;
					((Class283) this).anIntArray3010[i_20_] = (Class65.aClass243_665.method2311(method2669(true, false, i_21_, i_22_, (byte) -40), -2024507927));
					((Class283) this).anIntArray3033[i_20_] = (Class65.aClass243_665.method2311(method2669(false, false, i_21_, i_22_, (byte) 85), -1204727759));
					((Class283) this).anIntArray3034[i_20_] = Class65.aClass243_665.method2311(new StringBuilder().append("n").append(i_21_).append('_').append(i_22_).toString(), -386533519);
					((Class283) this).anIntArray3035[i_20_] = (Class65.aClass243_665.method2311(method2669(true, true, i_21_, i_22_, (byte) -47), -1725557270));
					((Class283) this).anIntArray3036[i_20_] = (Class65.aClass243_665.method2311(method2669(false, true, i_21_, i_22_, (byte) -30), -1962303314));
					if (((Class283) this).anIntArray3034[i_20_] == -1) {
						((Class283) this).anIntArray3010[i_20_] = -1;
						((Class283) this).anIntArray3033[i_20_] = -1;
						((Class283) this).anIntArray3035[i_20_] = -1;
						((Class283) this).anIntArray3036[i_20_] = -1;
					}
					i_20_++;
				}
			}
			for (int i_24_ = i_20_; i_24_ < ((Class283) this).anIntArray3034.length; i_24_++) {
				((Class283) this).anIntArray3034[i_24_] = -1;
				((Class283) this).anIntArray3010[i_24_] = -1;
				((Class283) this).anIntArray3033[i_24_] = -1;
				((Class283) this).anIntArray3035[i_24_] = -1;
				((Class283) this).anIntArray3036[i_24_] = -1;
			}
			int i_25_;
			if (client.anInt8752 * -1233866115 == 19)
				i_25_ = 1;
			else if (18 == -1233866115 * client.anInt8752)
				i_25_ = 16;
			else if (14 == client.anInt8752 * -1233866115)
				i_25_ = 15;
			else if (client.anInt8752 * -1233866115 == 8)
				i_25_ = 9;
			else
				throw new RuntimeException(new StringBuilder().append("").append(-1233866115 * client.anInt8752).toString());
			method2657(i_18_, i_19_, i_25_, false, -815771659);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.av(").append(')').toString());
		}
	}

	void loadMapSceneNormal(RsBitsBuffer buffer, int i) {
		try {
			int mapSize = buffer.readUnsignedByteC((short) -9830);
			boolean forceRefresh = buffer.readUnsignedByte() == 1;
			int chunkX = buffer.readUnsignedShort();
			int chunkY = buffer.readUnsignedShort();
			if (!((Class283) this).aBoolean3018)
				method2649((byte) 38);
			method2655(Class94.method1020(mapSize, -1114771755), 226677224);
			int i_29_ = ((buffer.buffer.length - buffer.index * 385051775) / 16);
			((Class283) this).anIntArrayArray3042 = new int[i_29_][4];
			for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
				for (int i_31_ = 0; i_31_ < 4; i_31_++)
					((Class283) this).anIntArrayArray3042[i_30_][i_31_] = buffer.readInt((byte) 40);
			}
			((Class283) this).anIntArray3031 = new int[i_29_];
			((Class283) this).anIntArray3010 = new int[i_29_];
			((Class283) this).anIntArray3033 = new int[i_29_];
			((Class283) this).anIntArray3034 = null;
			((Class283) this).aByteArrayArray3038 = new byte[i_29_][];
			((Class283) this).aByteArrayArray3014 = new byte[i_29_][];
			((Class283) this).aByteArrayArray3044 = null;
			((Class283) this).anIntArray3035 = new int[i_29_];
			((Class283) this).anIntArray3036 = new int[i_29_];
			((Class283) this).aByteArrayArray3041 = new byte[i_29_][];
			((Class283) this).aByteArrayArray3002 = new byte[i_29_][];
			i_29_ = 0;
			for (int i_32_ = (chunkX - (((Class283) this).anInt3039 * -991330803 >> 4)) / 8; i_32_ <= (chunkX + (((Class283) this).anInt3039 * -991330803 >> 4)) / 8; i_32_++) {
				for (int i_33_ = (chunkY - (-1456212765 * ((Class283) this).anInt3011 >> 4)) / 8; i_33_ <= ((((Class283) this).anInt3011 * -1456212765 >> 4) + chunkY) / 8; i_33_++) {
					((Class283) this).anIntArray3031[i_29_] = i_33_ + (i_32_ << 8);
					((Class283) this).anIntArray3010[i_29_] = (Class65.aClass243_665.method2311(method2669(true, false, i_32_, i_33_, (byte) -113), -317623107));
					((Class283) this).anIntArray3033[i_29_] = (Class65.aClass243_665.method2311(method2669(false, false, i_32_, i_33_, (byte) -82), -1013661811));
					((Class283) this).anIntArray3035[i_29_] = (Class65.aClass243_665.method2311(method2669(true, true, i_32_, i_33_, (byte) -99), -1834537704));
					((Class283) this).anIntArray3036[i_29_] = (Class65.aClass243_665.method2311(method2669(false, true, i_32_, i_33_, (byte) -80), -1244616261));
					i_29_++;
				}
			}
			method2657(chunkX, chunkY, 17, forceRefresh, -815771659);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.at(").append(')').toString());
		}
	}

	void loadMapSceneDynamic(RsBitsBuffer stream, int i) {
		try {
			int loadType = stream.readUnsigned128Byte((byte) 93);
			if (1 == loadType)
				((Class283) this).aClass266_3001 = Class266.LOAD_MAP_SCENE_DYNAMIC;
			else if (2 == loadType)
				((Class283) this).aClass266_3001 = Class266.aClass266_2849;
			else if (loadType == 3)
				((Class283) this).aClass266_3001 = Class266.aClass266_2845;
			else if (4 == loadType)
				((Class283) this).aClass266_3001 = Class266.aClass266_2850;
			int chunkY = stream.readUnsignedShortLE((byte) -29);
			int chunkX = stream.readUnsignedShortLE128(1478539457);
			int forceRefreshMask = stream.readUnsigned128Byte((byte) 19);
			boolean forceRefresh = (forceRefreshMask & 0x1) != 0;
			int mapSize = stream.readUnsignedByteC((short) -21481);
			if (!((Class283) this).aBoolean3018)
				method2649((byte) 124);
			method2655(Class94.method1020(mapSize, 1925270996), 226677224);
			stream.initBitAccess(-1836176958);
			for (int i_39_ = 0; i_39_ < 4; i_39_++) {
				for (int i_40_ = 0; i_40_ < -991330803 * ((Class283) this).anInt3039 >> 3; i_40_++) {
					for (int i_41_ = 0; (i_41_ < -1456212765 * ((Class283) this).anInt3011 >> 3); i_41_++) {
						int i_42_ = stream.readBits(1);
						if (1 == i_42_)
							((Class283) this).anIntArrayArrayArray3043[i_39_][i_40_][i_41_] = stream.readBits(26);
						else
							((Class283) this).anIntArrayArrayArray3043[i_39_][i_40_][i_41_] = -1;
					}
				}
			}
			stream.finishBitAccess((byte) 65);
			int i_43_ = ((stream.buffer.length - stream.index * 385051775) / 16);
			((Class283) this).anIntArrayArray3042 = new int[i_43_][4];
			for (int i_44_ = 0; i_44_ < i_43_; i_44_++) {
				for (int i_45_ = 0; i_45_ < 4; i_45_++)
					((Class283) this).anIntArrayArray3042[i_44_][i_45_] = stream.readInt((byte) -51);
			}
			((Class283) this).anIntArray3031 = new int[i_43_];
			((Class283) this).anIntArray3010 = new int[i_43_];
			((Class283) this).anIntArray3033 = new int[i_43_];
			((Class283) this).anIntArray3034 = null;
			((Class283) this).aByteArrayArray3038 = new byte[i_43_][];
			((Class283) this).aByteArrayArray3014 = new byte[i_43_][];
			((Class283) this).aByteArrayArray3044 = null;
			((Class283) this).anIntArray3035 = new int[i_43_];
			((Class283) this).anIntArray3036 = new int[i_43_];
			((Class283) this).aByteArrayArray3041 = new byte[i_43_][];
			((Class283) this).aByteArrayArray3002 = new byte[i_43_][];
			i_43_ = 0;
			for (int i_46_ = 0; i_46_ < 4; i_46_++) {
				for (int i_47_ = 0; i_47_ < -991330803 * ((Class283) this).anInt3039 >> 3; i_47_++) {
					for (int i_48_ = 0; (i_48_ < -1456212765 * ((Class283) this).anInt3011 >> 3); i_48_++) {
						int i_49_ = (((Class283) this).anIntArrayArrayArray3043[i_46_][i_47_][i_48_]);
						if (i_49_ != -1) {
							int i_50_ = i_49_ >> 14 & 0x3ff;
							int i_51_ = i_49_ >> 3 & 0x7ff;
							int i_52_ = (i_50_ / 8 << 8) + i_51_ / 8;
							for (int i_53_ = 0; i_53_ < i_43_; i_53_++) {
								if (i_52_ == (((Class283) this).anIntArray3031[i_53_])) {
									i_52_ = -1;
									break;
								}
							}
							if (-1 != i_52_) {
								((Class283) this).anIntArray3031[i_43_] = i_52_;
								int i_54_ = i_52_ >> 8 & 0xff;
								int i_55_ = i_52_ & 0xff;
								((Class283) this).anIntArray3010[i_43_] = (Class65.aClass243_665.method2311(method2669(true, false, i_54_, i_55_, (byte) -94), -976709735));
								((Class283) this).anIntArray3033[i_43_] = (Class65.aClass243_665.method2311(method2669(false, false, i_54_, i_55_, (byte) -94), -666597667));
								((Class283) this).anIntArray3035[i_43_] = (Class65.aClass243_665.method2311(method2669(true, true, i_54_, i_55_, (byte) 105), -1176293113));
								((Class283) this).anIntArray3036[i_43_] = (Class65.aClass243_665.method2311(method2669(false, true, i_54_, i_55_, (byte) 23), -1142086956));
								i_43_++;
							}
						}
					}
				}
			}
			method2657(chunkX, chunkY, 17, forceRefresh, -815771659);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ah(").append(')').toString());
		}
	}

	public Class244 method2654(int i) {
		try {
			return ((Class283) this).aClass244_3012;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.y(").append(')').toString());
		}
	}

	void method2655(Class115 class115, int i) {
		try {
			if (class115 != ((Class283) this).aClass115_3003) {
				((Class283) this).anInt3039 = (((Class283) this).anInt3011 = class115.anInt1382 * 723673737) * -116821329;
				((Class283) this).anIntArrayArrayArray3043 = (new int[4][-991330803 * ((Class283) this).anInt3039 >> 3][-1456212765 * ((Class283) this).anInt3011 >> 3]);
				((Class283) this).anIntArrayArray3023 = (new int[((Class283) this).anInt3039 * -991330803][-1456212765 * ((Class283) this).anInt3011]);
				((Class283) this).anIntArrayArray3026 = (new int[-991330803 * ((Class283) this).anInt3039][-1456212765 * ((Class283) this).anInt3011]);
				for (int i_56_ = 0; i_56_ < 4; i_56_++)
					((Class283) this).SCENE_CLIP_DATA_PLANES[i_56_] = Class16.method354((-991330803 * ((Class283) this).anInt3039), (((Class283) this).anInt3011 * -1456212765), -617039163);
				((Class283) this).aByteArrayArrayArray3032 = (new byte[4][-991330803 * ((Class283) this).anInt3039][((Class283) this).anInt3011 * -1456212765]);
				((Class283) this).aClass244_3012 = new Class244(4, -991330803 * ((Class283) this).anInt3039, ((Class283) this).anInt3011 * -1456212765);
				method2647(-1528485886);
				((Class283) this).aClass115_3003 = class115;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.az(").append(')').toString());
		}
	}

	public int[][] method2656(byte i) {
		try {
			return ((Class283) this).anIntArrayArray3023;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.g(").append(')').toString());
		}
	}

	void method2657(int i, int i_57_, int i_58_, boolean bool, int i_59_) {
		try {
			if (1596783995 * client.anInt8724 == 2) {
				if (((Class283) this).aBoolean3018)
					throw new IllegalStateException();
				client.anInt8724 = -1334571751;
				client.anInt8870 = -221729505;
			}
			if (bool || ((Class283) this).anInt3030 * 19679283 != i || i_57_ != ((Class283) this).anInt3009 * 306966675) {
				((Class283) this).anInt3030 = i * -1135086853;
				((Class283) this).anInt3009 = i_57_ * -1928942181;
				if (!((Class283) this).aBoolean3018) {
					Class439.method5851(i_58_, 430070283);
					Class139.method1548(Tradution.aClass470_5874.method6049(Class321.aClass429_3357, -875414210), true, Class373.aClass_ra4071, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) 103);
				}
				if (((Class283) this).aClass341_3006 != null)
					((Class283) this).aClass341_3007 = ((Class283) this).aClass341_3006;
				else
					((Class283) this).aClass341_3007 = new Class341(0, 0, 0);
				((Class283) this).aClass341_3006 = new Class341(0, 8 * (((Class283) this).anInt3030 * 19679283 - ((-991330803 * ((Class283) this).anInt3039) >> 4)), 8 * (306966675 * ((Class283) this).anInt3009 - ((((Class283) this).anInt3011 * -1456212765) >> 4)));
				((Class283) this).aClass298_Sub37_Sub13_3017 = Class301.method3708(-1760580017 * (((Class283) this).aClass341_3006.gameSceneBaseX), (((Class283) this).aClass341_3006.gameSceneBaseY) * 283514611);
				((Class283) this).aClass296_3005 = null;
				if (!((Class283) this).aBoolean3018)
					method2663(i_58_, 1177231331);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ap(").append(')').toString());
		}
	}

	public Class283(boolean bool) {
		((Class283) this).anInt3021 = 0;
		((Class283) this).anInt3024 = -861507225;
		aBoolean3008 = false;
		((Class283) this).aBoolean3018 = bool;
	}

	void method2658(int i, byte i_60_) {
		try {
			try {
				Thread.sleep((long) i);
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.aj(").append(')').toString());
		}
	}

	void method2659(Class240_Sub1 class240_sub1, byte[][] is, short i) {
		try {
			int i_61_ = is.length;
			for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
				byte[] is_63_ = is[i_62_];
				if (null != is_63_) {
					RsByteBuffer class298_sub53 = new RsByteBuffer(is_63_);
					int i_64_ = ((Class283) this).anIntArray3031[i_62_] >> 8;
					int i_65_ = ((Class283) this).anIntArray3031[i_62_] & 0xff;
					int i_66_ = (64 * i_64_ - (((Class283) this).aClass341_3006.gameSceneBaseX * -1760580017));
					int i_67_ = 64 * i_65_ - 283514611 * (((Class283) this).aClass341_3006.gameSceneBaseY);
					if (!((Class283) this).aBoolean3018)
						Class247.method2365(408539711);
					class240_sub1.method2215(class298_sub53, i_66_, i_67_, -1760580017 * (((Class283) this).aClass341_3006.gameSceneBaseX), (((Class283) this).aClass341_3006.gameSceneBaseY) * 283514611, (((Class283) this).SCENE_CLIP_DATA_PLANES), -391880689);
					class240_sub1.method2235(Class373.aClass_ra4071, class298_sub53, i_66_, i_67_, (byte) -72);
				}
			}
			for (int i_68_ = 0; i_68_ < i_61_; i_68_++) {
				int i_69_ = ((((Class283) this).anIntArray3031[i_68_] >> 8) * 64 - (((Class283) this).aClass341_3006.gameSceneBaseX * -1760580017));
				int i_70_ = ((((Class283) this).anIntArray3031[i_68_] & 0xff) * 64 - (((Class283) this).aClass341_3006.gameSceneBaseY * 283514611));
				byte[] is_71_ = is[i_68_];
				if (is_71_ == null && ((Class283) this).anInt3009 * 306966675 < 800) {
					if (!((Class283) this).aBoolean3018)
						Class247.method2365(-918952780);
					class240_sub1.method2213(i_69_, i_70_, 64, 64, (byte) 0);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ay(").append(')').toString());
		}
	}

	void method2660(Class240_Sub1 class240_sub1, byte[][] is, byte i) {
		try {
			int i_72_ = ((Class283) this).aByteArrayArray3038.length;
			for (int i_73_ = 0; i_73_ < i_72_; i_73_++) {
				byte[] is_74_ = is[i_73_];
				if (is_74_ != null) {
					int i_75_ = (64 * (((Class283) this).anIntArray3031[i_73_] >> 8) - (-1760580017 * ((Class283) this).aClass341_3006.gameSceneBaseX));
					int i_76_ = ((((Class283) this).anIntArray3031[i_73_] & 0xff) * 64 - 283514611 * (((Class283) this).aClass341_3006.gameSceneBaseY));
					if (!((Class283) this).aBoolean3018)
						Class247.method2365(-802890876);
					class240_sub1.method2237(Class373.aClass_ra4071, is_74_, i_75_, i_76_, (((Class283) this).SCENE_CLIP_DATA_PLANES), 1861855341);
					if (((Class283) this).aBoolean3018)
						method2658(10, (byte) 22);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ag(").append(')').toString());
		}
	}

	void method2661(int i) {
		try {
			int i_77_ = ((Class283) this).aByteArrayArray3044.length;
			for (int i_78_ = 0; i_78_ < i_77_; i_78_++) {
				if (((Class283) this).aByteArrayArray3044[i_78_] == null) {
					if (i <= -1776092464) {
						/* empty */
					}
				} else {
					int i_79_ = -1;
					for (int i_80_ = 0; i_80_ < client.anInt8721 * -160072615; i_80_++) {
						if (((Class283) this).anIntArray3031[i_78_] == client.anIntArray8751[i_80_]) {
							i_79_ = i_80_;
							break;
						}
					}
					if (i_79_ == -1) {
						client.anIntArray8751[client.anInt8721 * -160072615] = ((Class283) this).anIntArray3031[i_78_];
						i_79_ = (client.anInt8721 += 424283113) * -160072615 - 1;
					}
					RsByteBuffer class298_sub53 = new RsByteBuffer(((Class283) this).aByteArrayArray3044[i_78_]);
					int i_81_ = 0;
					while ((385051775 * class298_sub53.index < (((Class283) this).aByteArrayArray3044[i_78_]).length) && i_81_ < 511) {
						if (client.anInt8703 * -1230451913 >= 1023) {
							if (i <= -1776092464) {
								/* empty */
							}
							break;
						}
						int i_82_ = i_79_ | i_81_++ << 6;
						int i_83_ = class298_sub53.readUnsignedShort();
						int i_84_ = i_83_ >> 14;
						int i_85_ = i_83_ >> 7 & 0x3f;
						int i_86_ = i_83_ & 0x3f;
						int i_87_ = (64 * (((Class283) this).anIntArray3031[i_78_] >> 8) - (((Class283) this).aClass341_3006.gameSceneBaseX * -1760580017) + i_85_);
						int i_88_ = (i_86_ + (64 * (((Class283) this).anIntArray3031[i_78_] & 0xff) - (((Class283) this).aClass341_3006.gameSceneBaseY * 283514611)));
						SomethingDefinitions class503 = (Class15.aClass507_224.method6269(class298_sub53.readUnsignedShort(), -806262033));
						Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_82_));
						if (class298_sub29 == null && (class503.aByte6170 & 0x1) > 0 && i_87_ >= 0 && (-2095128707 * class503.anInt6187 + i_87_ < -991330803 * ((Class283) this).anInt3039) && i_88_ >= 0 && (i_88_ + class503.anInt6187 * -2095128707 < ((Class283) this).anInt3011 * -1456212765)) {
							NPC class365_sub1_sub1_sub2_sub1 = (new NPC(((Class283) this).aClass331_3037));
							class365_sub1_sub1_sub2_sub1.anInt10064 = i_82_ * 1714292119;
							Class298_Sub29 class298_sub29_89_ = (new Class298_Sub29(class365_sub1_sub1_sub2_sub1));
							client.npcs.method5817(class298_sub29_89_, (long) i_82_);
							client.aClass298_Sub29Array8816[((client.anInt8772 += -118843751) * 1962237353) - 1] = class298_sub29_89_;
							client.anIntArray8699[((client.anInt8703 += -409937273) * -1230451913) - 1] = i_82_;
							class365_sub1_sub1_sub2_sub1.anInt10075 = client.anInt8884 * -128551287;
							class365_sub1_sub1_sub2_sub1.method4464(class503, 1908625985);
							class365_sub1_sub1_sub2_sub1.setSizeOffset((class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187) * -2095128707, -948262466);
							class365_sub1_sub1_sub2_sub1.anInt10115 = (-1927065533 * (class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6181) << 3) * -1186616623;
							class365_sub1_sub1_sub2_sub1.method4415((class365_sub1_sub1_sub2_sub1.aClass503_10190.aClass274_6183.method2567((byte) 73).method242(694163818) << 11 & 0x3fff), true, 822135678);
							class365_sub1_sub1_sub2_sub1.method4456(i_84_, i_87_, i_88_, true, class365_sub1_sub1_sub2_sub1.getSize(), (byte) 78);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.au(").append(')').toString());
		}
	}

	public int method2662(int i) {
		try {
			return 100 - (-1285506348 * ((Class283) this).anInt3027 / (((Class283) this).anInt3028 * -316305569));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.b(").append(')').toString());
		}
	}

	void method2663(int i, int i_90_) {
		try {
			int i_91_ = (((Class283) this).aClass341_3006.gameSceneBaseX * -1760580017 - ((Class283) this).aClass341_3007.gameSceneBaseX * -1760580017);
			int i_92_ = (((Class283) this).aClass341_3006.gameSceneBaseY * 283514611 - 283514611 * ((Class283) this).aClass341_3007.gameSceneBaseY);
			if (17 == i) {
				for (int i_93_ = 0; i_93_ < 1962237353 * client.anInt8772; i_93_++) {
					Class298_Sub29 class298_sub29 = client.aClass298_Sub29Array8816[i_93_];
					if (null != class298_sub29) {
						NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
						for (int i_94_ = 0; i_94_ < (class365_sub1_sub1_sub2_sub1.scenePositionXQueue).length; i_94_++) {
							class365_sub1_sub1_sub2_sub1.scenePositionXQueue[i_94_] -= i_91_;
							class365_sub1_sub1_sub2_sub1.scenePositionYQueue[i_94_] -= i_92_;
						}
						Class217 class217 = Class217.method2005(class365_sub1_sub1_sub2_sub1.method4337().aClass217_2599);
						class217.aFloat2451 -= (float) (512 * i_91_);
						class217.aFloat2454 -= (float) (i_92_ * 512);
						class365_sub1_sub1_sub2_sub1.method4340(class217);
						class217.method2006();
					}
				}
			} else {
				boolean bool = false;
				client.anInt8703 = 0;
				int i_95_ = -755230208 * ((Class283) this).anInt3039 - 512;
				int i_96_ = ((Class283) this).anInt3011 * 1743373824 - 512;
				for (int i_97_ = 0; i_97_ < client.anInt8772 * 1962237353; i_97_++) {
					Class298_Sub29 class298_sub29 = client.aClass298_Sub29Array8816[i_97_];
					if (null != class298_sub29) {
						NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
						Class217 class217 = Class217.method2005(class365_sub1_sub1_sub2_sub1.method4337().aClass217_2599);
						class217.aFloat2451 -= (float) (512 * i_91_);
						class217.aFloat2454 -= (float) (512 * i_92_);
						class365_sub1_sub1_sub2_sub1.method4340(class217);
						if ((int) class217.aFloat2451 < 0 || (int) class217.aFloat2451 > i_95_ || (int) class217.aFloat2454 < 0 || (int) class217.aFloat2454 > i_96_) {
							class365_sub1_sub1_sub2_sub1.method4464(null, 1741344135);
							class298_sub29.unlink(-1460969981);
							bool = true;
						} else {
							boolean bool_98_ = true;
							for (int i_99_ = 0; i_99_ < (class365_sub1_sub1_sub2_sub1.scenePositionXQueue).length; i_99_++) {
								class365_sub1_sub1_sub2_sub1.scenePositionXQueue[i_99_] -= i_91_;
								class365_sub1_sub1_sub2_sub1.scenePositionYQueue[i_99_] -= i_92_;
								if ((class365_sub1_sub1_sub2_sub1.scenePositionXQueue[i_99_]) < 0 || ((class365_sub1_sub1_sub2_sub1.scenePositionXQueue[i_99_]) >= (((Class283) this).anInt3039 * -991330803)) || (class365_sub1_sub1_sub2_sub1.scenePositionYQueue[i_99_]) < 0 || ((class365_sub1_sub1_sub2_sub1.scenePositionYQueue[i_99_]) >= (((Class283) this).anInt3011 * -1456212765)))
									bool_98_ = false;
							}
							if (bool_98_)
								client.anIntArray8699[((client.anInt8703 += -409937273) * -1230451913) - 1] = (class365_sub1_sub1_sub2_sub1.anInt10064 * 1888274983);
							else {
								class365_sub1_sub1_sub2_sub1.method4464(null, 2025506166);
								class298_sub29.unlink(-1460969981);
								bool = true;
							}
						}
						class217.method2006();
					}
				}
				if (bool) {
					client.anInt8772 = (client.npcs.method5814(2145683355) * -118843751);
					int i_100_ = 0;
					Iterator iterator = client.npcs.iterator();
					while (iterator.hasNext()) {
						Class298_Sub29 class298_sub29 = (Class298_Sub29) iterator.next();
						client.aClass298_Sub29Array8816[i_100_++] = class298_sub29;
					}
				}
			}
			for (int i_101_ = 0; i_101_ < 2048; i_101_++) {
				Player class365_sub1_sub1_sub2_sub2 = client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_101_];
				if (class365_sub1_sub1_sub2_sub2 != null) {
					for (int i_102_ = 0; i_102_ < (class365_sub1_sub1_sub2_sub2.scenePositionXQueue).length; i_102_++) {
						class365_sub1_sub1_sub2_sub2.scenePositionXQueue[i_102_] -= i_91_;
						class365_sub1_sub1_sub2_sub2.scenePositionYQueue[i_102_] -= i_92_;
					}
					Class217 class217 = Class217.method2005(class365_sub1_sub1_sub2_sub2.method4337().aClass217_2599);
					class217.aFloat2451 -= (float) (512 * i_91_);
					class217.aFloat2454 -= (float) (i_92_ * 512);
					class365_sub1_sub1_sub2_sub2.method4340(class217);
					class217.method2006();
				}
			}
			Class19[] class19s = client.aClass19Array8869;
			for (int i_103_ = 0; i_103_ < class19s.length; i_103_++) {
				Class19 class19 = class19s[i_103_];
				if (class19 != null) {
					class19.anInt260 -= i_91_ * -1268095488;
					class19.anInt261 -= i_92_ * 1688061440;
				}
			}
			for (Class298_Sub1 class298_sub1 = ((Class298_Sub1) Class298_Sub1.aClass453_7152.method5939(1766612795)); null != class298_sub1; class298_sub1 = (Class298_Sub1) Class298_Sub1.aClass453_7152.method5944(49146)) {
				class298_sub1.anInt7150 -= i_91_ * 656787783;
				class298_sub1.anInt7155 -= i_92_ * 284247153;
				if (((Class283) this).aClass266_3001 != Class266.aClass266_2850 && (class298_sub1.anInt7150 * 634196087 < 0 || -2146829167 * class298_sub1.anInt7155 < 0 || (634196087 * class298_sub1.anInt7150 >= ((Class283) this).anInt3039 * -991330803) || (-2146829167 * class298_sub1.anInt7155 >= ((Class283) this).anInt3011 * -1456212765)))
					class298_sub1.unlink(-1460969981);
			}
			for (Class298_Sub1 class298_sub1 = ((Class298_Sub1) Class298_Sub1.aClass453_7162.method5939(1766612795)); null != class298_sub1; class298_sub1 = (Class298_Sub1) Class298_Sub1.aClass453_7162.method5944(49146)) {
				class298_sub1.anInt7150 -= i_91_ * 656787783;
				class298_sub1.anInt7155 -= 284247153 * i_92_;
				if (((Class283) this).aClass266_3001 != Class266.aClass266_2850 && (634196087 * class298_sub1.anInt7150 < 0 || -2146829167 * class298_sub1.anInt7155 < 0 || (class298_sub1.anInt7150 * 634196087 >= ((Class283) this).anInt3039 * -991330803) || (-2146829167 * class298_sub1.anInt7155 >= -1456212765 * ((Class283) this).anInt3011)))
					class298_sub1.unlink(-1460969981);
			}
			for (Class298_Sub2 class298_sub2 = ((Class298_Sub2) client.groundItems.method5816(1670233657)); null != class298_sub2; class298_sub2 = (Class298_Sub2) client.groundItems.method5815((byte) -33)) {
				int i_104_ = (int) ((class298_sub2.linkedKey * 7051297995265073167L >> 28) & 0x3L);
				int i_105_ = (int) (7051297995265073167L * class298_sub2.linkedKey & 0x3fffL);
				int i_106_ = i_105_ - (-1760580017 * ((Class283) this).aClass341_3006.gameSceneBaseX);
				int i_107_ = (int) ((class298_sub2.linkedKey * 7051297995265073167L >> 14) & 0x3fffL);
				int i_108_ = i_107_ - 283514611 * (((Class283) this).aClass341_3006.gameSceneBaseY);
				if (null != ((Class283) this).aClass331_3037) {
					if (i_106_ < 0 || i_108_ < 0 || i_106_ >= -991330803 * ((Class283) this).anInt3039 || i_108_ >= ((Class283) this).anInt3011 * -1456212765 || i_106_ >= (((Class283) this).aClass331_3037.anInt3514) * 1988988347 || i_108_ >= 1340714547 * (((Class283) this).aClass331_3037.anInt3549)) {
						if (((Class283) this).aClass266_3001 != Class266.aClass266_2850)
							class298_sub2.unlink(-1460969981);
					} else if ((((Class283) this).aClass331_3037.aClass326ArrayArrayArray3516) != null)
						((Class283) this).aClass331_3037.method4059(i_104_, i_106_, i_108_, (byte) 116);
				}
			}
			if (2076926079 * Class3.anInt62 != 0) {
				Class3.anInt62 -= i_91_ * -1129029761;
				Class3.anInt54 -= -1835291189 * i_92_;
			}
			Class127_Sub3.method1434(-1799857115);
			Class264_Sub4.method2513(false, -1299725311);
			if (17 == i) {
				client.anInt8753 -= i_91_ * 721337856;
				client.anInt8755 -= i_92_ * 601815552;
				Class75.anInt708 -= -1853832704 * i_91_;
				Class106.anInt1309 -= 1181634048 * i_92_;
				if (2 != -863531439 * Class298_Sub1.anInt7164) {
					Class298_Sub1.anInt7164 = 1355934404;
					Class418.anInt5339 = -1001372047;
					Class100.anInt1081 = 178575833;
				}
			} else {
				Class376.anInt4089 -= i_91_ * 2140348215;
				Class82_Sub4.anInt6832 -= -2108764285 * i_92_;
				Class_xa.anInt6292 -= 446226445 * i_91_;
				Class464.anInt5959 -= i_92_ * 2019382975;
				Class367.anInt4000 -= i_91_ * 1343197696;
				Class146.anInt1575 -= i_92_ * -276168192;
				if (Math.abs(i_91_) > -991330803 * ((Class283) this).anInt3039 || (Math.abs(i_92_) > ((Class283) this).anInt3011 * -1456212765))
					((Class283) this).aClass364_3013.method4324(-1910257839);
			}
			Class447.method5905(2108312995);
			InputStream_Sub1.method273(632959802);
			client.aClass437_8825.clear((byte) -16);
			client.aClass453_8824.method5943((byte) 1);
			client.aClass442_8650.method5869(268098313);
			Class298_Sub27.method3105((short) 255);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.af(").append(')').toString());
		}
	}

	void method2664(byte i) {
		try {
			((Class283) this).aClass240_Sub1_3000 = null;
			((Class283) this).aClass240_Sub1_3029 = null;
			for (int i_109_ = 0; i_109_ < 4; i_109_++) {
				if (null != ((Class283) this).SCENE_CLIP_DATA_PLANES[i_109_])
					((Class283) this).SCENE_CLIP_DATA_PLANES[i_109_].method2731(-2096339600);
			}
			if (((Class283) this).aClass244_3012 != null)
				((Class283) this).aClass244_3012.method2319(-1035232458);
			if (null != ((Class283) this).aClass364_3013)
				((Class283) this).aClass364_3013.method4320((byte) 38);
			if (null != ((Class283) this).aClass331_3037) {
				((Class283) this).aClass331_3037.aClass324_3528.method3956(-1174492425);
				((Class283) this).aClass331_3037 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.aw(").append(')').toString());
		}
	}

	void method2665(byte i) {
		try {
			((Class283) this).aClass266_3004 = ((Class283) this).aClass266_3001;
			method2655(Class115.aClass115_1383, 226677224);
			for (int i_110_ = 0; i_110_ < 4; i_110_++) {
				for (int i_111_ = 0; i_111_ < ((Class283) this).anInt3039 * -991330803 >> 3; i_111_++) {
					for (int i_112_ = 0; (i_112_ < -1456212765 * ((Class283) this).anInt3011 >> 3); i_112_++)
						((Class283) this).anIntArrayArrayArray3043[i_110_][i_111_][i_112_] = -1;
				}
			}
			for (Class298_Sub7 class298_sub7 = ((Class298_Sub7) Class87.aClass453_799.method5939(1766612795)); null != class298_sub7; class298_sub7 = ((Class298_Sub7) Class87.aClass453_799.method5944(49146))) {
				int i_113_ = -1895845629 * class298_sub7.anInt7220;
				boolean bool = (i_113_ & 0x1) == 1;
				int i_114_ = 783342041 * class298_sub7.anInt7218 >> 3;
				int i_115_ = class298_sub7.anInt7212 * -1769464355 >> 3;
				int i_116_ = class298_sub7.anInt7216 * -815575585;
				int i_117_ = 35898435 * class298_sub7.anInt7217;
				int i_118_ = -802955793 * class298_sub7.anInt7214;
				int i_119_ = 25889883 * class298_sub7.anInt7215;
				int i_120_ = -60744569 * class298_sub7.anInt7219;
				int i_121_ = 1016983439 * class298_sub7.anInt7213;
				int i_122_ = 0;
				int i_123_ = 0;
				int i_124_ = 1;
				int i_125_ = 1;
				if (1 == i_113_) {
					i_123_ = i_120_ - 1;
					i_124_ = -1;
				} else if (2 == i_113_) {
					i_123_ = i_120_ - 1;
					i_122_ = i_121_ - 1;
					i_124_ = -1;
					i_125_ = -1;
				} else if (i_113_ == 3) {
					i_122_ = i_121_ - 1;
					i_124_ = 1;
					i_125_ = -1;
				}
				int i_126_ = i_115_;
				while (i_126_ < i_121_ + i_115_) {
					int i_127_ = i_123_;
					int i_128_ = i_114_;
					while (i_128_ < i_114_ + i_120_) {
						if (bool)
							((Class283) this).anIntArrayArrayArray3043[i_119_][i_116_ + i_122_][i_117_ + i_127_] = ((i_126_ << 3) + ((i_128_ << 14) + (i_118_ << 24)) + (i_113_ << 1));
						else
							((Class283) this).anIntArrayArrayArray3043[i_119_][i_116_ + i_127_][i_122_ + i_117_] = (i_113_ << 1) + ((i_126_ << 3) + ((i_128_ << 14) + (i_118_ << 24)));
						i_128_++;
						i_127_ += i_124_;
					}
					i_126_++;
					i_122_ += i_125_;
				}
			}
			int i_129_ = Class298_Sub37.anIntArrayArray7407.length;
			((Class283) this).anIntArray3031 = new int[i_129_];
			((Class283) this).anIntArray3010 = new int[i_129_];
			((Class283) this).anIntArray3033 = new int[i_129_];
			((Class283) this).anIntArray3034 = null;
			((Class283) this).aByteArrayArray3038 = new byte[i_129_][];
			((Class283) this).aByteArrayArray3014 = new byte[i_129_][];
			((Class283) this).aByteArrayArray3044 = null;
			((Class283) this).anIntArray3035 = new int[i_129_];
			((Class283) this).anIntArray3036 = new int[i_129_];
			((Class283) this).aByteArrayArray3041 = new byte[i_129_][];
			((Class283) this).aByteArrayArray3002 = new byte[i_129_][];
			i_129_ = 0;
			for (Class298_Sub7 class298_sub7 = ((Class298_Sub7) Class87.aClass453_799.method5939(1766612795)); class298_sub7 != null; class298_sub7 = ((Class298_Sub7) Class87.aClass453_799.method5944(49146))) {
				int i_130_ = class298_sub7.anInt7218 * 783342041 >>> 3;
				int i_131_ = -1769464355 * class298_sub7.anInt7212 >>> 3;
				int i_132_ = i_130_ + class298_sub7.anInt7219 * -60744569;
				if ((i_132_ & 0x7) == 0)
					i_132_--;
				i_132_ >>>= 3;
				int i_133_ = class298_sub7.anInt7213 * 1016983439 + i_131_;
				if ((i_133_ & 0x7) == 0)
					i_133_--;
				i_133_ >>>= 3;
				for (int i_134_ = i_130_ >>> 3; i_134_ <= i_132_; i_134_++) {
					while_71_: for (int i_135_ = i_131_ >>> 3; i_135_ <= i_133_; i_135_++) {
						int i_136_ = i_134_ << 8 | i_135_;
						for (int i_137_ = 0; i_137_ < i_129_; i_137_++) {
							if (((Class283) this).anIntArray3031[i_137_] == i_136_) {
								if (i >= 0) {
									/* empty */
								}
								continue while_71_;
							}
						}
						((Class283) this).anIntArray3031[i_129_] = i_136_;
						((Class283) this).anIntArray3010[i_129_] = (Class65.aClass243_665.method2311(method2669(true, false, i_134_, i_135_, (byte) -52), -1034865468));
						((Class283) this).anIntArray3033[i_129_] = (Class65.aClass243_665.method2311(method2669(false, false, i_134_, i_135_, (byte) 111), -1106973771));
						((Class283) this).anIntArray3035[i_129_] = (Class65.aClass243_665.method2311(method2669(true, true, i_134_, i_135_, (byte) 24), -740435939));
						((Class283) this).anIntArray3036[i_129_] = (Class65.aClass243_665.method2311(method2669(false, true, i_134_, i_135_, (byte) 86), -1244375919));
						i_129_++;
					}
				}
			}
			((Class283) this).anIntArrayArray3042 = Class298_Sub37.anIntArrayArray7407;
			Class298_Sub37.anIntArrayArray7407 = null;
			method2657(-991330803 * ((Class283) this).anInt3039 >> 4, -1456212765 * ((Class283) this).anInt3011 >> 4, 17, false, -815771659);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ai(").append(')').toString());
		}
	}

	public void method2666(int i) {
		try {
			((Class283) this).aClass341_3006 = new Class341();
			((Class283) this).anInt3009 = 0;
			((Class283) this).anInt3030 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.o(").append(')').toString());
		}
	}

	public void method2667(int i) {
		try {
			if (((Class283) this).aBoolean3018) {
				method2673((byte) 2);
				Class423.method5733(true, 1336561252);
				Class283 class283_138_ = client.aClass283_8716;
				((Class283) this).anIntArray3031 = ((Class283) class283_138_).anIntArray3031;
				((Class283) this).anIntArray3010 = ((Class283) class283_138_).anIntArray3010;
				((Class283) this).anIntArray3033 = ((Class283) class283_138_).anIntArray3033;
				((Class283) this).anIntArray3034 = ((Class283) class283_138_).anIntArray3034;
				((Class283) this).anIntArray3035 = ((Class283) class283_138_).anIntArray3035;
				((Class283) this).anIntArray3036 = ((Class283) class283_138_).anIntArray3036;
				((Class283) this).anIntArrayArray3042 = ((Class283) class283_138_).anIntArrayArray3042;
				((Class283) this).aByteArrayArray3038 = ((Class283) class283_138_).aByteArrayArray3038;
				((Class283) this).aByteArrayArray3014 = ((Class283) class283_138_).aByteArrayArray3014;
				((Class283) this).aByteArrayArray3044 = ((Class283) class283_138_).aByteArrayArray3044;
				((Class283) this).aByteArrayArray3041 = ((Class283) class283_138_).aByteArrayArray3041;
				((Class283) this).aByteArrayArray3002 = ((Class283) class283_138_).aByteArrayArray3002;
				((Class283) this).SCENE_CLIP_DATA_PLANES = ((Class283) class283_138_).SCENE_CLIP_DATA_PLANES;
				((Class283) this).aClass244_3012 = ((Class283) class283_138_).aClass244_3012;
				((Class283) this).aClass364_3013 = ((Class283) class283_138_).aClass364_3013;
				((Class283) this).anIntArrayArrayArray3043 = ((Class283) class283_138_).anIntArrayArrayArray3043;
				((Class283) this).anInt3015 = 1 * ((Class283) class283_138_).anInt3015;
				((Class283) this).anInt3016 = 1 * ((Class283) class283_138_).anInt3016;
				((Class283) this).aClass298_Sub37_Sub13_3017 = ((Class283) class283_138_).aClass298_Sub37_Sub13_3017;
				((Class283) this).aClass296_3005 = ((Class283) class283_138_).aClass296_3005;
				((Class283) this).anIntArrayArray3023 = ((Class283) class283_138_).anIntArrayArray3023;
				((Class283) this).anIntArrayArray3026 = ((Class283) class283_138_).anIntArrayArray3026;
				((Class283) this).aByteArrayArrayArray3032 = ((Class283) class283_138_).aByteArrayArrayArray3032;
				((Class283) this).aClass266_3001 = ((Class283) class283_138_).aClass266_3001;
				((Class283) this).aClass115_3003 = ((Class283) class283_138_).aClass115_3003;
				((Class283) this).aClass341_3006 = ((Class283) class283_138_).aClass341_3006;
				((Class283) this).aClass341_3007 = ((Class283) class283_138_).aClass341_3007;
				((Class283) this).anInt3030 = ((Class283) class283_138_).anInt3030 * 1;
				((Class283) this).anInt3009 = 1 * ((Class283) class283_138_).anInt3009;
				((Class283) this).anInt3039 = ((Class283) class283_138_).anInt3039 * 1;
				((Class283) this).anInt3011 = ((Class283) class283_138_).anInt3011 * 1;
			} else if (19 == -1233866115 * client.anInt8752)
				Class439.method5851(1, -193120332);
			else if (client.anInt8752 * -1233866115 == 14)
				Class439.method5851(15, 1644134026);
			else if (client.anInt8752 * -1233866115 == 18)
				Class439.method5851(16, 1118439953);
			else if (0 == -1233866115 * client.anInt8752)
				Class439.method5851(17, 1835904519);
			else if (8 == client.anInt8752 * -1233866115)
				Class439.method5851(9, -169912530);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ao(").append(')').toString());
		}
	}

	void method2668(Class283 class283_139_, byte i) {
		try {
			boolean bool = ((Class283) class283_139_).aBoolean3018;
			((Class283) class283_139_).aBoolean3018 = ((Class283) this).aBoolean3018;
			((Class283) this).aBoolean3018 = bool;
			Class266 class266 = ((Class283) class283_139_).aClass266_3004;
			((Class283) class283_139_).aClass266_3004 = ((Class283) this).aClass266_3004;
			((Class283) this).aClass266_3004 = class266;
			((Class283) class283_139_).aClass341_3007 = ((Class283) this).aClass341_3006;
			((Class283) this).aClass341_3007 = ((Class283) class283_139_).aClass341_3006;
			((Class283) this).aClass364_3013.method4327(class283_139_.method2640((byte) 49), -1162508016);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ae(").append(')').toString());
		}
	}

	String method2669(boolean bool, boolean bool_140_, int i, int i_141_, byte i_142_) {
		try {
			String string = "";
			if (bool)
				string = new StringBuilder().append(string).append("m").append(i).append('_').append(i_141_).toString();
			else
				string = new StringBuilder().append(string).append("l").append(i).append('_').append(i_141_).toString();
			if (bool_140_)
				string = new StringBuilder().append('u').append(string).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.al(").append(')').toString());
		}
	}

	public int method2670(byte i) {
		try {
			return 100 - (((Class283) this).anInt3021 * -1732877004 / (1792875095 * ((Class283) this).anInt3024));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.p(").append(')').toString());
		}
	}

	void method2671(Class240_Sub1 class240_sub1, byte[][] is, int i) {
		try {
			for (int i_143_ = 0; i_143_ < class240_sub1.anInt2626 * 1551623871; i_143_++) {
				if (!((Class283) this).aBoolean3018)
					Class247.method2365(140857778);
				for (int i_144_ = 0; i_144_ < -991330803 * ((Class283) this).anInt3039 >> 3; i_144_++) {
					for (int i_145_ = 0; (i_145_ < -1456212765 * ((Class283) this).anInt3011 >> 3); i_145_++) {
						int i_146_ = (((Class283) this).anIntArrayArrayArray3043[i_143_][i_144_][i_145_]);
						if (-1 != i_146_) {
							int i_147_ = i_146_ >> 24 & 0x3;
							if (!class240_sub1.aBoolean2629 || 0 == i_147_) {
								int i_148_ = i_146_ >> 1 & 0x3;
								int i_149_ = i_146_ >> 14 & 0x3ff;
								int i_150_ = i_146_ >> 3 & 0x7ff;
								int i_151_ = (i_149_ / 8 << 8) + i_150_ / 8;
								for (int i_152_ = 0; i_152_ < (((Class283) this).anIntArray3031).length; i_152_++) {
									if ((((Class283) this).anIntArray3031[i_152_]) == i_151_ && null != is[i_152_]) {
										class240_sub1.method2238(Class373.aClass_ra4071, is[i_152_], i_143_, 8 * i_144_, i_145_ * 8, i_147_, 8 * (i_149_ & 0x7), (i_150_ & 0x7) * 8, i_148_, (((Class283) this).SCENE_CLIP_DATA_PLANES), -174685332);
										break;
									}
								}
							}
						}
						if (((Class283) this).aBoolean3018)
							method2658(5, (byte) 22);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.an(").append(')').toString());
		}
	}

	public boolean method2672(int i) {
		try {
			if (!((Class283) this).aBoolean3018)
				Class517.method6310(false, -583672467);
			((Class283) this).anInt3027 = 0;
			for (int i_153_ = 0; i_153_ < ((Class283) this).aByteArrayArray3038.length; i_153_++) {
				if (-1 != ((Class283) this).anIntArray3010[i_153_] && ((Class283) this).aByteArrayArray3038[i_153_] == null) {
					((Class283) this).aByteArrayArray3038[i_153_] = Class65.aClass243_665.method2315((((Class283) this).anIntArray3010[i_153_]), 0, (byte) -67);
					if (null == ((Class283) this).aByteArrayArray3038[i_153_])
						((Class283) this).anInt3027 += -427342251;
				}
				if (-1 != ((Class283) this).anIntArray3033[i_153_] && null == ((Class283) this).aByteArrayArray3014[i_153_]) {
					((Class283) this).aByteArrayArray3014[i_153_] = (Class65.aClass243_665.method2289(((Class283) this).anIntArray3033[i_153_], 0, ((Class283) this).anIntArrayArray3042[i_153_], -1251594466));
					if (null == ((Class283) this).aByteArrayArray3014[i_153_])
						((Class283) this).anInt3027 += -427342251;
				}
				if (((Class283) this).anIntArray3035[i_153_] != -1 && null == ((Class283) this).aByteArrayArray3041[i_153_]) {
					((Class283) this).aByteArrayArray3041[i_153_] = Class65.aClass243_665.method2315((((Class283) this).anIntArray3035[i_153_]), 0, (byte) -60);
					if (((Class283) this).aByteArrayArray3041[i_153_] == null)
						((Class283) this).anInt3027 += -427342251;
				}
				if (((Class283) this).anIntArray3036[i_153_] != -1 && ((Class283) this).aByteArrayArray3002[i_153_] == null) {
					((Class283) this).aByteArrayArray3002[i_153_] = Class65.aClass243_665.method2315((((Class283) this).anIntArray3036[i_153_]), 0, (byte) -33);
					if (null == ((Class283) this).aByteArrayArray3002[i_153_])
						((Class283) this).anInt3027 += -427342251;
				}
				if (null != ((Class283) this).anIntArray3034 && null == ((Class283) this).aByteArrayArray3044[i_153_] && ((Class283) this).anIntArray3034[i_153_] != -1) {
					((Class283) this).aByteArrayArray3044[i_153_] = (Class65.aClass243_665.method2289(((Class283) this).anIntArray3034[i_153_], 0, ((Class283) this).anIntArrayArray3042[i_153_], -1874141869));
					if (null == ((Class283) this).aByteArrayArray3044[i_153_])
						((Class283) this).anInt3027 += -427342251;
				}
			}
			if (((Class283) this).aClass296_3005 == null) {
				if (null != ((Class283) this).aClass298_Sub37_Sub13_3017 && (Class_v.aClass243_7622.method2295(new StringBuilder().append(((Class283) this).aClass298_Sub37_Sub13_3017.aString9640).append("_staticelements").toString(), -400372089))) {
					if (!Class_v.aClass243_7622.method2312(new StringBuilder().append(((Class283) this).aClass298_Sub37_Sub13_3017.aString9640).append("_staticelements").toString(), -2144896080))
						((Class283) this).anInt3027 += -427342251;
					else
						((Class283) this).aClass296_3005 = (Class237.method2192(Class_v.aClass243_7622, new StringBuilder().append(((Class283) this).aClass298_Sub37_Sub13_3017.aString9640).append("_staticelements").toString(), client.isMemberWorld, 565671699));
				} else
					((Class283) this).aClass296_3005 = new Class296(0);
			}
			if (-528251139 * ((Class283) this).anInt3027 > 0) {
				if (-316305569 * ((Class283) this).anInt3028 < ((Class283) this).anInt3027 * -528251139)
					((Class283) this).anInt3028 = ((Class283) this).anInt3027 * -707841245;
				((Class283) this).aClass273_3025 = Class273.aClass273_2906;
				return false;
			}
			((Class283) this).anInt3021 = 0;
			for (int i_154_ = 0; i_154_ < ((Class283) this).aByteArrayArray3038.length; i_154_++) {
				byte[] is = ((Class283) this).aByteArrayArray3014[i_154_];
				if (is != null) {
					int i_155_ = ((((Class283) this).anIntArray3031[i_154_] >> 8) * 64 - (-1760580017 * ((Class283) this).aClass341_3006.gameSceneBaseX));
					int i_156_ = ((((Class283) this).anIntArray3031[i_154_] & 0xff) * 64 - (((Class283) this).aClass341_3006.gameSceneBaseY * 283514611));
					if (((Class283) this).aClass266_3001.allowDynamicMapScene(-1692375482)) {
						i_155_ = 10;
						i_156_ = 10;
					}
					int i_157_ = (Class82_Sub13.method910(((Class283) this).aClass433_3040, is, i_155_, i_156_, ((Class283) this).anInt3039 * -991330803, -1456212765 * ((Class283) this).anInt3011, (byte) -75));
					if (i_157_ > 0)
						((Class283) this).anInt3021 += i_157_ * 94764029;
				}
				is = ((Class283) this).aByteArrayArray3002[i_154_];
				if (is != null) {
					int i_158_ = (64 * (((Class283) this).anIntArray3031[i_154_] >> 8) - (((Class283) this).aClass341_3006.gameSceneBaseX * -1760580017));
					int i_159_ = (64 * (((Class283) this).anIntArray3031[i_154_] & 0xff) - (((Class283) this).aClass341_3006.gameSceneBaseY * 283514611));
					if (((Class283) this).aClass266_3001.allowDynamicMapScene(-105390577)) {
						i_158_ = 10;
						i_159_ = 10;
					}
					int i_160_ = (Class82_Sub13.method910(((Class283) this).aClass433_3040, is, i_158_, i_159_, ((Class283) this).anInt3039 * -991330803, -1456212765 * ((Class283) this).anInt3011, (byte) 54));
					if (i_160_ > 0)
						((Class283) this).anInt3021 += 94764029 * i_160_;
				}
			}
			if (-1134020267 * ((Class283) this).anInt3021 > 0) {
				if (1792875095 * ((Class283) this).anInt3024 < ((Class283) this).anInt3021 * -1134020267)
					((Class283) this).anInt3024 = ((Class283) this).anInt3021 * -1201957325;
				((Class283) this).aClass273_3025 = Class273.aClass273_2904;
				return false;
			}
			if (!((Class283) this).aBoolean3018 && ((Class283) this).aClass273_3025 != Class273.aClass273_2905)
				Class139.method1548(new StringBuilder().append(Tradution.aClass470_5874.method6049(Class321.aClass429_3357, -875414210)).append(Class26.aString350).append("(100%)").toString(), true, Class373.aClass_ra4071, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) -16);
			((Class283) this).aClass273_3025 = Class273.aClass273_2907;
			if (!((Class283) this).aBoolean3018)
				Class247.method2365(-1142860499);
			if (!((Class283) this).aBoolean3018) {
				for (int i_161_ = 0; i_161_ < 2048; i_161_++) {
					Player class365_sub1_sub1_sub2_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_161_]);
					if (class365_sub1_sub1_sub2_sub2 != null)
						class365_sub1_sub1_sub2_sub2.aClass331_7722 = null;
				}
				for (int i_162_ = 0; i_162_ < client.aClass298_Sub29Array8816.length; i_162_++) {
					Class298_Sub29 class298_sub29 = client.aClass298_Sub29Array8816[i_162_];
					if (class298_sub29 != null)
						((Class365_Sub1) class298_sub29.anObject7366).aClass331_7722 = null;
				}
			}
			if (!((Class283) this).aBoolean3018)
				Class223.method2082(true, -1663847334);
			if (!((Class283) this).aBoolean3018)
				Class117.method1278((byte) 84);
			boolean bool = false;
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub5_7572.method5642(-1598768408) == 2) {
				for (int i_163_ = 0; i_163_ < ((Class283) this).aByteArrayArray3038.length; i_163_++) {
					if (((Class283) this).aByteArrayArray3002[i_163_] != null || (((Class283) this).aByteArrayArray3041[i_163_] != null)) {
						bool = true;
						break;
					}
				}
			}
			int i_164_ = (Class69.method787(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub24_7554.method5713((byte) 73), (byte) 16).anInt1581 * 2098573928);
			if (Class373.aClass_ra4071.method4998())
				i_164_++;
			method2648(-1878791507);
			method2664((byte) 12);
			((Class283) this).aClass331_3037 = new Class331(Class373.aClass_ra4071, 9, 4, ((Class283) this).anInt3039 * -991330803, ((Class283) this).anInt3011 * -1456212765, i_164_, bool, Class373.aClass_ra4071.method5048() > 0);
			((Class283) this).aClass331_3037.method4052(false, -740850409);
			((Class283) this).aClass331_3037.method4007(client.anInt8814 * -2081556469, (byte) -26);
			if (0 != client.anInt8814 * -2081556469)
				((Class283) this).aClass331_3037.method4008(Script.aClass264_7534, -972568309);
			else
				((Class283) this).aClass331_3037.method4008(null, 1333003580);
			((Class283) this).aClass287_3019 = new Class287();
			((Class283) this).aFloat3020 = -0.05F + (float) (Math.random() / 10.0);
			((Class283) this).aClass240_Sub1_3029 = new Class240_Sub1(((Class283) this).aClass331_3037, ((Class283) this).aClass433_3040, 4, -991330803 * ((Class283) this).anInt3039, -1456212765 * ((Class283) this).anInt3011, false, ((Class283) this).aClass244_3012, ((Class283) this).aClass364_3013);
			((Class283) this).aClass240_Sub1_3029.method2212(-403694446);
			((Class283) this).aClass240_Sub1_3029.anInt2621 = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub7_7581.method5650(-809818345) * 275039235;
			((Class283) this).aClass240_Sub1_3029.aBoolean2622 = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub5_7572.method5642(-2131698628) == 2;
			((Class283) this).aClass240_Sub1_3029.aBoolean2697 = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub15_7560.method5684(-2037839529) == 1;
			((Class283) this).aClass240_Sub1_3029.aBoolean2624 = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub28_7573.method5724(1917266854) == 1;
			((Class283) this).aClass240_Sub1_3029.aBoolean2625 = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub16_7557.method5687(1803060969) == 1;
			if (!((Class283) this).aClass266_3001.allowDynamicMapScene(338257036))
				method2659(((Class283) this).aClass240_Sub1_3029, ((Class283) this).aByteArrayArray3038, (short) 821);
			else
				method2636(((Class283) this).aClass240_Sub1_3029, ((Class283) this).aByteArrayArray3038, (byte) 53);
			if (((Class283) this).aBoolean3018)
				method2658(50, (byte) -75);
			((Class283) this).aClass364_3013.method4321(((Class283) this).anInt3039 * -991330803 >> 4, -1456212765 * ((Class283) this).anInt3011 >> 4, 1532552397);
			((Class283) this).aClass364_3013.method4323(this, 1783211969);
			if (bool) {
				((Class283) this).aClass331_3037.method4052(true, -740850409);
				((Class283) this).aClass240_Sub1_3000 = new Class240_Sub1(((Class283) this).aClass331_3037, ((Class283) this).aClass433_3040, 1, (-991330803 * ((Class283) this).anInt3039), (-1456212765 * ((Class283) this).anInt3011), true, ((Class283) this).aClass244_3012, ((Class283) this).aClass364_3013);
				((Class283) this).aClass240_Sub1_3000.method2212(-1978540544);
				((Class283) this).aClass240_Sub1_3000.anInt2621 = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub7_7581.method5650(-15786995) * 275039235;
				((Class283) this).aClass240_Sub1_3000.aBoolean2622 = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub5_7572.method5642(864049094) == 2;
				((Class283) this).aClass240_Sub1_3000.aBoolean2697 = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub15_7560.method5684(-1853244696) == 1;
				((Class283) this).aClass240_Sub1_3000.aBoolean2624 = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub28_7573.method5724(281198825) == 1;
				((Class283) this).aClass240_Sub1_3000.aBoolean2625 = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub16_7557.method5687(2103749887) == 1;
				if (!((Class283) this).aClass266_3001.allowDynamicMapScene(1753743768)) {
					method2659(((Class283) this).aClass240_Sub1_3000, ((Class283) this).aByteArrayArray3041, (short) 5882);
					if (!((Class283) this).aBoolean3018)
						Class517.method6310(true, 1696867322);
				} else {
					method2636(((Class283) this).aClass240_Sub1_3000, ((Class283) this).aByteArrayArray3041, (byte) 95);
					if (!((Class283) this).aBoolean3018)
						Class517.method6310(true, -428383733);
				}
				((Class283) this).aClass240_Sub1_3000.method2211(0, (((Class283) this).aClass240_Sub1_3029.anIntArrayArrayArray2653[0]), -1177013471);
				((Class283) this).aClass240_Sub1_3000.method2218(Class373.aClass_ra4071, null, null, (byte) -27);
				((Class283) this).aClass331_3037.method4052(false, -740850409);
				if (((Class283) this).aBoolean3018)
					method2658(50, (byte) 33);
			}
			((Class283) this).aClass240_Sub1_3029.method2218(Class373.aClass_ra4071, bool ? (((Class283) this).aClass240_Sub1_3000.anIntArrayArrayArray2653) : null, ((Class283) this).SCENE_CLIP_DATA_PLANES, (byte) 23);
			if (!((Class283) this).aClass266_3001.allowDynamicMapScene(-1767246323)) {
				if (!((Class283) this).aBoolean3018)
					Class517.method6310(true, 1723627031);
				method2660(((Class283) this).aClass240_Sub1_3029, ((Class283) this).aByteArrayArray3014, (byte) -90);
				if (null != ((Class283) this).aByteArrayArray3044)
					method2661(-388258926);
			} else {
				if (!((Class283) this).aBoolean3018)
					Class517.method6310(true, 2071599739);
				method2671(((Class283) this).aClass240_Sub1_3029, ((Class283) this).aByteArrayArray3014, 1378612829);
			}
			if (!((Class283) this).aBoolean3018)
				Class517.method6310(true, -741926161);
			((Class283) this).aClass240_Sub1_3029.method2219(Class373.aClass_ra4071, (bool ? ((Class283) this).aClass331_3037.aClass_xaArray3521[0] : null), null, (byte) -119);
			if (((Class283) this).aBoolean3018)
				method2658(75, (byte) 18);
			((Class283) this).aClass240_Sub1_3029.method2242(Class373.aClass_ra4071, false, 1773155741);
			if (((Class283) this).aBoolean3018)
				method2658(75, (byte) 61);
			if (!((Class283) this).aBoolean3018)
				Class517.method6310(true, 1278015476);
			if (bool) {
				((Class283) this).aClass331_3037.method4052(true, -740850409);
				if (!((Class283) this).aBoolean3018)
					Class517.method6310(true, -2085672109);
				if (!((Class283) this).aClass266_3001.allowDynamicMapScene(423424816))
					method2660(((Class283) this).aClass240_Sub1_3000, ((Class283) this).aByteArrayArray3002, (byte) -36);
				else
					method2671(((Class283) this).aClass240_Sub1_3000, ((Class283) this).aByteArrayArray3002, -957252436);
				if (!((Class283) this).aBoolean3018)
					Class517.method6310(true, 1319323091);
				((Class283) this).aClass240_Sub1_3000.method2219(Class373.aClass_ra4071, null, ((Class283) this).aClass331_3037.aClass_xaArray3519[0], (byte) 43);
				((Class283) this).aClass240_Sub1_3000.method2242(Class373.aClass_ra4071, true, 1773155741);
				if (!((Class283) this).aBoolean3018)
					Class517.method6310(true, 1345203008);
				((Class283) this).aClass331_3037.method4052(false, -740850409);
				if (((Class283) this).aBoolean3018)
					method2658(50, (byte) -40);
			}
			((Class283) this).aClass240_Sub1_3029.method2217(-702552699);
			if (((Class283) this).aClass240_Sub1_3000 != null)
				((Class283) this).aClass240_Sub1_3000.method2217(-702552699);
			((Class283) this).aClass331_3037.method4050(-1802988635);
			if (((Class283) this).aBoolean3018) {
				Class122.method1319((byte) 1);
				while (!Class373.aClass_ra4071.method5041(2085922748))
					method2658(1, (byte) -1);
			}
			boolean bool_165_ = false;
			if (((Class283) this).aBoolean3018) {
				Class283 class283_166_ = client.aClass283_8716;
				method2668(class283_166_, (byte) -125);
				Class62.aClass248_612.method2381(class283_166_, -1651604);
				bool_165_ = true;
				Class122.method1319((byte) 1);
				synchronized (client.anObject8661) {
					client.aBoolean8717 = true;
					try {
						client.anObject8661.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				client.aClass283_8716 = this;
				class283_166_.method2664((byte) 12);
				method2663(17, 1856850794);
				method2649((byte) 34);
			} else {
				Class247.method2365(-913079296);
				((Class283) this).aClass364_3013.method4331((byte) 3);
				Class113.method1247(1506910584);
			}
			for (int i_167_ = 0; i_167_ < 4; i_167_++) {
				for (int i_168_ = 0; i_168_ < ((Class283) this).anInt3039 * -991330803; i_168_++) {
					for (int i_169_ = 0; i_169_ < -1456212765 * ((Class283) this).anInt3011; i_169_++)
						Class173.method1820(i_167_, i_168_, i_169_, 814827061);
				}
			}
			for (int i_170_ = 0; i_170_ < client.aClass299Array8671.length; i_170_++) {
				if (client.aClass299Array8671[i_170_] != null)
					client.aClass299Array8671[i_170_].method3676(((Class283) this).aClass331_3037, 1790221759);
			}
			Class475.method6075((short) -8812);
			Class420.method5608(2113027902);
			if (Class389.method4865((byte) -6) == Class292.aClass292_3162 && client.gameConnection.method387(537308016) != null && 17 == client.anInt8752 * -1233866115) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2040, client.gameConnection.aClass449_330, (byte) 55);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(1057001181, -2024753870);
				client.gameConnection.method390(class298_sub36, (byte) -45);
			}
			if (!((Class283) this).aClass266_3001.allowDynamicMapScene(1503430704)) {
				int i_171_ = ((19679283 * ((Class283) this).anInt3030 - (((Class283) this).anInt3039 * -991330803 >> 4)) / 8);
				int i_172_ = ((19679283 * ((Class283) this).anInt3030 + (((Class283) this).anInt3039 * -991330803 >> 4)) / 8);
				int i_173_ = ((306966675 * ((Class283) this).anInt3009 - (((Class283) this).anInt3011 * -1456212765 >> 4)) / 8);
				int i_174_ = ((306966675 * ((Class283) this).anInt3009 + (-1456212765 * ((Class283) this).anInt3011 >> 4)) / 8);
				for (int i_175_ = i_171_ - 1; i_175_ <= 1 + i_172_; i_175_++) {
					for (int i_176_ = i_173_ - 1; i_176_ <= i_174_ + 1; i_176_++) {
						if (i_175_ >= i_171_ && i_175_ <= i_172_ && i_176_ >= i_173_ && i_176_ <= i_174_) {
							if (i >= 1047709682)
								throw new IllegalStateException();
						} else {
							Class65.aClass243_665.method2304(method2669(true, false, i_175_, i_176_, (byte) 34), -1752946353);
							Class65.aClass243_665.method2304(method2669(false, false, i_175_, i_176_, (byte) -61), -1482810579);
							Class65.aClass243_665.method2304(method2669(true, true, i_175_, i_176_, (byte) -69), -1377878894);
							Class65.aClass243_665.method2304(method2669(false, true, i_175_, i_176_, (byte) -104), -180643080);
						}
					}
				}
			}
			if (-1233866115 * client.anInt8752 == 1)
				Class439.method5851(19, 1314741993);
			else if (client.anInt8752 * -1233866115 == 15)
				Class439.method5851(14, 1781016763);
			else if (16 == client.anInt8752 * -1233866115)
				Class439.method5851(18, 1023292756);
			else if (-1233866115 * client.anInt8752 == 9)
				Class439.method5851(8, 6222714);
			else {
				Class439.method5851(0, 2061499324);
				if (client.gameConnection.method387(537308016) != null) {
					Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.DONE_LOADING_REGION_PACKET, client.gameConnection.aClass449_330, (byte) 9);
					client.gameConnection.method390(class298_sub36, (byte) -71);
				}
			}
			Class82_Sub19.method926(55767460);
			if (aBoolean3008) {
				Class255.method2435(Long.toString(Class122.method1319((byte) 1) - (aLong3045 * 4917044907588821591L)), 180430926);
				aBoolean3008 = false;
			}
			if (bool_165_) {
				synchronized (client.anObject8718) {
					client.anObject8718.notify();
				}
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ab(").append(')').toString());
		}
	}

	public void method2673(byte i) {
		try {
			((Class283) this).aClass273_3025 = Class273.aClass273_2905;
			((Class283) this).anInt3027 = 0;
			((Class283) this).anInt3028 = 255626399;
			((Class283) this).anInt3021 = 0;
			((Class283) this).anInt3024 = -861507225;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ax(").append(')').toString());
		}
	}

	public Class266 method2674(int i) {
		try {
			return ((Class283) this).aClass266_3001;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.a(").append(')').toString());
		}
	}

	public Class331 method2675(int i) {
		try {
			return ((Class283) this).aClass331_3037;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.s(").append(')').toString());
		}
	}

	static final void method2676(ClientScript2 class403, int i) {
		try {
			int i_177_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_177_, (byte) -54);
			Class119 class119 = Class389.aClass119Array4165[i_177_ >> 16];
			Class225.method2101(class105, class119, class403, -1146943352);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ea(").append(')').toString());
		}
	}

	static final void method2677(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			int[] is = Class298_Sub6.method2863(string, class403, -1881953326);
			if (null != is)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1255 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.anIntArray1256 = is;
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.ml(").append(')').toString());
		}
	}

	public static Class387 method2678(GraphicsToolkit class_ra, int i, int i_178_, int i_179_, int i_180_, int i_181_, Class387 class387, int i_182_, int i_183_, int i_184_, int i_185_, Class438 class438, int i_186_) {
		try {
			if (null == class387)
				return null;
			int i_187_ = 2055;
			if (null != class438) {
				i_187_ |= class438.method5829(-1790708337);
				i_187_ &= ~0x200;
			}
			long l = (((long) i_183_ << 48) + ((long) ((i_185_ << 24) + ((i_184_ << 16) + i_181_)) + ((long) i_182_ << 32)));
			Class387 class387_188_;
			synchronized (Class462.aClass348_5682) {
				class387_188_ = (Class387) Class462.aClass348_5682.method4184(l);
			}
			if (class387_188_ == null || class_ra.method5017(class387_188_.m(), i_187_) != 0) {
				if (class387_188_ != null)
					i_187_ = class_ra.method5004(i_187_, class387_188_.m());
				int i_189_;
				if (i_181_ == 1)
					i_189_ = 9;
				else if (2 == i_181_)
					i_189_ = 12;
				else if (i_181_ == 3)
					i_189_ = 15;
				else if (4 == i_181_)
					i_189_ = 18;
				else
					i_189_ = 21;
				int i_190_ = 3;
				int[] is = { 64, 96, 128 };
				Model model = new Model(1 + i_190_ * i_189_, 2 * (i_190_ * i_189_) - i_189_, 0);
				int i_191_ = model.method747(0, 0, 0);
				int[][] is_192_ = new int[i_190_][i_189_];
				for (int i_193_ = 0; i_193_ < i_190_; i_193_++) {
					int i_194_ = is[i_193_];
					int i_195_ = is[i_193_];
					for (int i_196_ = 0; i_196_ < i_189_; i_196_++) {
						int i_197_ = (i_196_ << 14) / i_189_;
						int i_198_ = i_194_ * Class220.anIntArray2483[i_197_] >> 14;
						int i_199_ = i_195_ * Class220.anIntArray2474[i_197_] >> 14;
						is_192_[i_193_][i_196_] = model.method747(i_198_, 0, i_199_);
					}
				}
				for (int i_200_ = 0; i_200_ < i_190_; i_200_++) {
					int i_201_ = (128 + i_200_ * 256) / i_190_;
					int i_202_ = 256 - i_201_;
					byte i_203_ = (byte) (i_185_ * i_201_ + i_202_ * i_184_ >> 8);
					short i_204_ = (short) ((((i_202_ * (i_182_ & 0x7f) + i_201_ * (i_183_ & 0x7f)) & 0x7f00) + ((((i_183_ & 0xfc00) * i_201_ + (i_182_ & 0xfc00) * i_202_) & 0xfc0000) + ((i_201_ * (i_183_ & 0x380) + i_202_ * (i_182_ & 0x380)) & 0x38000))) >> 8);
					for (int i_205_ = 0; i_205_ < i_189_; i_205_++) {
						if (0 == i_200_)
							model.method748(i_191_, (is_192_[0][(1 + i_205_) % i_189_]), is_192_[0][i_205_], (byte) 1, (byte) -1, i_204_, i_203_, (short) -1);
						else {
							model.method748(is_192_[i_200_ - 1][i_205_], (is_192_[i_200_ - 1][(1 + i_205_) % i_189_]), (is_192_[i_200_][(1 + i_205_) % i_189_]), (byte) 1, (byte) -1, i_204_, i_203_, (short) -1);
							model.method748(is_192_[i_200_ - 1][i_205_], (is_192_[i_200_][(i_205_ + 1) % i_189_]), is_192_[i_200_][i_205_], (byte) 1, (byte) -1, i_204_, i_203_, (short) -1);
						}
					}
				}
				class387_188_ = class_ra.method5037(model, i_187_, 161976139 * Class419.anInt5341, 64, 768);
				synchronized (Class462.aClass348_5682) {
					Class462.aClass348_5682.method4194(class387_188_, l);
				}
			}
			int i_206_ = class387.RA();
			int i_207_ = class387.ya();
			int i_208_ = class387.AA();
			int i_209_ = class387.ha();
			if (class438 != null) {
				class387_188_ = class387_188_.method4755((byte) 3, i_187_, true);
				class387_188_.oa(i_207_ - i_206_ >> 1, 128, i_209_ - i_208_ >> 1);
				class387_188_.ia(i_206_ + i_207_ >> 1, 0, i_208_ + i_209_ >> 1);
				class438.method5831(class387_188_, 574844997);
			} else {
				class387_188_ = class387_188_.method4755((byte) 3, i_187_, true);
				class387_188_.oa(i_207_ - i_206_ >> 1, 128, i_209_ - i_208_ >> 1);
				class387_188_.ia(i_206_ + i_207_ >> 1, 0, i_209_ + i_208_ >> 1);
			}
			if (i_178_ != 0)
				class387_188_.t(i_178_);
			if (0 != i_179_)
				class387_188_.EA(i_179_);
			if (i_180_ != 0)
				class387_188_.ia(0, i_180_, 0);
			return class387_188_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lt.a(").append(')').toString());
		}
	}
}
