/* Class365_Sub1_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.Clipboard;

public class Class365_Sub1_Sub5_Sub2 extends Class365_Sub1_Sub5 implements Interface3 {
	Class334 aClass334_9934;
	public Class60 aClass60_9935;
	boolean aBoolean9936;
	static int[] anIntArray9937 = { 1, 2, 4, 8 };
	static int[] anIntArray9938 = { 16, 32, 64, 128 };
	boolean aBoolean9939 = true;
	static Class318 aClass318_9940;
	public static Clipboard aClipboard9941;

	Class335 method4370(GraphicsToolkit class_ra) {
		Class387 class387 = aClass60_9935.method700(class_ra, 2048, false, true, (byte) 90);
		if (class387 == null)
			return null;
		Matrix3f class222 = method4347();
		Class235 class235 = method4337();
		Class335 class335 = Class73.method818(((Class365_Sub1_Sub5_Sub2) this).aBoolean9936, 1239765065);
		int i = (int) class235.aClass217_2599.aFloat2451 >> 9;
		int i_0_ = (int) class235.aClass217_2599.aFloat2454 >> 9;
		aClass60_9935.method701(class_ra, class387, class222, i, i, i_0_, i_0_, true, -1223011244);
		class387.method4739(class222, aClass302_Sub1Array7726[0], 0);
		if (null != ((Class60) aClass60_9935).aClass351_602) {
			Class69 class69 = ((Class60) aClass60_9935).aClass351_602.method4229();
			class_ra.method5042(class69);
		}
		((Class365_Sub1_Sub5_Sub2) this).aBoolean9939 = class387.i() || null != ((Class60) aClass60_9935).aClass351_602;
		if (null == ((Class365_Sub1_Sub5_Sub2) this).aClass334_9934)
			((Class365_Sub1_Sub5_Sub2) this).aClass334_9934 = Class472.method6063((int) class235.aClass217_2599.aFloat2451, (int) class235.aClass217_2599.aFloat2455, (int) class235.aClass217_2599.aFloat2454, class387, 2146599220);
		else
			Class264_Sub2.method2507((((Class365_Sub1_Sub5_Sub2) this).aClass334_9934), (int) class235.aClass217_2599.aFloat2451, (int) class235.aClass217_2599.aFloat2455, (int) class235.aClass217_2599.aFloat2454, class387, (byte) 1);
		return class335;
	}

	public void method33(GraphicsToolkit class_ra, int i) {
		try {
			aClass60_9935.method702(class_ra, 889648408);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.k(").append(')').toString());
		}
	}

	boolean method4376(short i) {
		try {
			return ((Class365_Sub1_Sub5_Sub2) this).aBoolean9939;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.be(").append(')').toString());
		}
	}

	public Class334 method4358(GraphicsToolkit class_ra, byte i) {
		try {
			return ((Class365_Sub1_Sub5_Sub2) this).aClass334_9934;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.bc(").append(')').toString());
		}
	}

	public int method4361(int i) {
		try {
			return aClass60_9935.method705(945802681);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.bm(").append(')').toString());
		}
	}

	public void method40(GraphicsToolkit class_ra) {
		aClass60_9935.method707(class_ra, -475225909);
	}

	public void method4530(Class435 class435, int i) {
		try {
			aClass60_9935.method698(class435, 502075834);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.bl(").append(')').toString());
		}
	}

	Class335 method4394(GraphicsToolkit class_ra, int i) {
		try {
			Class387 class387 = aClass60_9935.method700(class_ra, 2048, false, true, (byte) -12);
			if (class387 == null)
				return null;
			Matrix3f class222 = method4347();
			Class235 class235 = method4337();
			Class335 class335 = Class73.method818((((Class365_Sub1_Sub5_Sub2) this).aBoolean9936), 1511204499);
			int i_1_ = (int) class235.aClass217_2599.aFloat2451 >> 9;
			int i_2_ = (int) class235.aClass217_2599.aFloat2454 >> 9;
			aClass60_9935.method701(class_ra, class387, class222, i_1_, i_1_, i_2_, i_2_, true, 327958726);
			class387.method4739(class222, aClass302_Sub1Array7726[0], 0);
			if (null != ((Class60) aClass60_9935).aClass351_602) {
				Class69 class69 = ((Class60) aClass60_9935).aClass351_602.method4229();
				class_ra.method5042(class69);
			}
			((Class365_Sub1_Sub5_Sub2) this).aBoolean9939 = (class387.i() || null != ((Class60) aClass60_9935).aClass351_602);
			if (null == ((Class365_Sub1_Sub5_Sub2) this).aClass334_9934)
				((Class365_Sub1_Sub5_Sub2) this).aClass334_9934 = Class472.method6063((int) (class235.aClass217_2599.aFloat2451), (int) (class235.aClass217_2599.aFloat2455), (int) (class235.aClass217_2599.aFloat2454), class387, 1999876467);
			else
				Class264_Sub2.method2507(((Class365_Sub1_Sub5_Sub2) this).aClass334_9934, (int) class235.aClass217_2599.aFloat2451, (int) class235.aClass217_2599.aFloat2455, (int) class235.aClass217_2599.aFloat2454, class387, (byte) 127);
			return class335;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.bo(").append(')').toString());
		}
	}

	void method4357(GraphicsToolkit class_ra, int i) {
		try {
			Class387 class387 = aClass60_9935.method700(class_ra, 262144, true, true, (byte) -57);
			if (class387 != null) {
				Matrix3f class222 = method4347();
				Class235 class235 = method4337();
				int i_3_ = (int) class235.aClass217_2599.aFloat2451 >> 9;
				int i_4_ = (int) class235.aClass217_2599.aFloat2454 >> 9;
				aClass60_9935.method701(class_ra, class387, class222, i_3_, i_3_, i_4_, i_4_, false, -2048622161);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.bb(").append(')').toString());
		}
	}

	void method4371(GraphicsToolkit class_ra) {
		Class387 class387 = aClass60_9935.method700(class_ra, 262144, true, true, (byte) -72);
		if (class387 != null) {
			Matrix3f class222 = method4347();
			Class235 class235 = method4337();
			int i = (int) class235.aClass217_2599.aFloat2451 >> 9;
			int i_5_ = (int) class235.aClass217_2599.aFloat2454 >> 9;
			aClass60_9935.method701(class_ra, class387, class222, i, i, i_5_, i_5_, false, -1344370284);
		}
	}

	public int method36() {
		return -1598457753 * ((Class60) aClass60_9935).anInt589;
	}

	final void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_6_, int i_7_, boolean bool, int i_8_) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.bk(").append(')').toString());
		}
	}

	boolean method4352(GraphicsToolkit class_ra, int i, int i_9_) {
		Class387 class387 = aClass60_9935.method700(class_ra, 131072, false, false, (byte) 94);
		if (class387 == null)
			return false;
		return class387.method4787(i, i_9_, method4347(), false, 0);
	}

	public int method4363(byte i) {
		try {
			return aClass60_9935.method699(2122093474);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.bx(").append(')').toString());
		}
	}

	public int method29(int i) {
		try {
			return -1598457753 * ((Class60) aClass60_9935).anInt589;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.f(").append(')').toString());
		}
	}

	public int method30(short i) {
		try {
			return 748228569 * ((Class60) aClass60_9935).anInt590;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.b(").append(')').toString());
		}
	}

	public void method31(byte i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.p(").append(')').toString());
		}
	}

	public boolean method39(int i) {
		try {
			return aClass60_9935.method706(-1088806112);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.i(").append(')').toString());
		}
	}

	public int method35() {
		return -1598457753 * ((Class60) aClass60_9935).anInt589;
	}

	public void method37(GraphicsToolkit class_ra, int i) {
		try {
			aClass60_9935.method707(class_ra, -475225909);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.d(").append(')').toString());
		}
	}

	public int method45() {
		return ((Class60) aClass60_9935).anInt601 * 1686561661;
	}

	boolean method4349() {
		return ((Class365_Sub1_Sub5_Sub2) this).aBoolean9939;
	}

	final boolean method4400() {
		return false;
	}

	public int method42() {
		return 748228569 * ((Class60) aClass60_9935).anInt590;
	}

	public int method38() {
		return 748228569 * ((Class60) aClass60_9935).anInt590;
	}

	public void method34() {
		/* empty */
	}

	boolean method4399(byte i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.bf(").append(')').toString());
		}
	}

	final boolean method4366(int i) {
		try {
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.bw(").append(')').toString());
		}
	}

	public void method43(GraphicsToolkit class_ra) {
		aClass60_9935.method707(class_ra, -475225909);
	}

	final void method4377() {
		throw new IllegalStateException();
	}

	public boolean method41() {
		return aClass60_9935.method706(-1547751108);
	}

	boolean method4353() {
		return false;
	}

	boolean method4365() {
		return false;
	}

	boolean method4374() {
		return false;
	}

	public Class334 method4367(GraphicsToolkit class_ra) {
		return ((Class365_Sub1_Sub5_Sub2) this).aClass334_9934;
	}

	void method4373(GraphicsToolkit class_ra) {
		Class387 class387 = aClass60_9935.method700(class_ra, 262144, true, true, (byte) 47);
		if (class387 != null) {
			Matrix3f class222 = method4347();
			Class235 class235 = method4337();
			int i = (int) class235.aClass217_2599.aFloat2451 >> 9;
			int i_10_ = (int) class235.aClass217_2599.aFloat2454 >> 9;
			aClass60_9935.method701(class_ra, class387, class222, i, i, i_10_, i_10_, false, 428224872);
		}
	}

	public int method4531() {
		return aClass60_9935.method699(2124766078);
	}

	public int method4532() {
		return aClass60_9935.method699(2101700797);
	}

	boolean method4383() {
		return ((Class365_Sub1_Sub5_Sub2) this).aBoolean9939;
	}

	public Class365_Sub1_Sub5_Sub2(Class331 class331, GraphicsToolkit class_ra, Class433 class433, ObjectDefinitions class432, int i, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool, int i_15_, int i_16_, int i_17_) {
		super(class331, i_12_, i_13_, i_14_, i, i_11_, Class355.method4263(i_15_, i_16_, (byte) -51));
		aClass60_9935 = new Class60(class_ra, class433, class432, i_15_, i_16_, plane, i_11_, this, bool, i_17_);
		((Class365_Sub1_Sub5_Sub2) this).aBoolean9936 = 0 != 1532834983 * class432.anInt5382 && !bool;
		method4362(1, 1122698828);
	}

	public void method28(GraphicsToolkit class_ra) {
		aClass60_9935.method702(class_ra, 1649698074);
	}

	boolean method4372(GraphicsToolkit class_ra, int i, int i_18_) {
		Class387 class387 = aClass60_9935.method700(class_ra, 131072, false, false, (byte) 27);
		if (class387 == null)
			return false;
		return class387.method4787(i, i_18_, method4347(), false, 0);
	}

	public int method32(byte i) {
		try {
			return ((Class60) aClass60_9935).anInt601 * 1686561661;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.a(").append(')').toString());
		}
	}

	final void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_19_, int i_20_, boolean bool) {
		throw new IllegalStateException();
	}

	final void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1, int i, int i_21_, int i_22_, boolean bool) {
		throw new IllegalStateException();
	}

	public void method44(GraphicsToolkit class_ra) {
		aClass60_9935.method707(class_ra, -475225909);
	}

	final void method4378() {
		throw new IllegalStateException();
	}

	public int method4379() {
		return aClass60_9935.method705(1082725147);
	}

	public int method4380() {
		return aClass60_9935.method705(864713404);
	}

	public int method4381() {
		return aClass60_9935.method705(642665450);
	}

	boolean method4369() {
		return ((Class365_Sub1_Sub5_Sub2) this).aBoolean9939;
	}

	boolean method4382() {
		return ((Class365_Sub1_Sub5_Sub2) this).aBoolean9939;
	}

	boolean method4350(GraphicsToolkit class_ra, int i, int i_23_, byte i_24_) {
		try {
			Class387 class387 = aClass60_9935.method700(class_ra, 131072, false, false, (byte) 30);
			if (class387 == null)
				return false;
			return class387.method4787(i, i_23_, method4347(), false, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.bu(").append(')').toString());
		}
	}

	public Class334 method4368(GraphicsToolkit class_ra) {
		return ((Class365_Sub1_Sub5_Sub2) this).aClass334_9934;
	}

	boolean method4351() {
		return ((Class365_Sub1_Sub5_Sub2) this).aBoolean9939;
	}

	final boolean method4384() {
		return false;
	}

	final void method4398(byte i) {
		try {
			throw new IllegalStateException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.bq(").append(')').toString());
		}
	}

	final boolean method4386() {
		return false;
	}

	final boolean method4387() {
		return false;
	}

	boolean method4385(GraphicsToolkit class_ra, int i, int i_25_) {
		Class387 class387 = aClass60_9935.method700(class_ra, 131072, false, false, (byte) 23);
		if (class387 == null)
			return false;
		return class387.method4787(i, i_25_, method4347(), false, 0);
	}

	public static void method4533(int i, String string, boolean bool, short i_26_) {
		try {
			while_108_: do {
				if (i == 0) {
					Class373.aClass_ra4071 = Class523.method6334(0, Class52_Sub2_Sub1.aCanvas9079, Class253.anInterface_ma2785, Class82_Sub6.aClass243_6844, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7550.method5675(-497177413) * 2, -659449737);
					if (null != string) {
						Class373.aClass_ra4071.ba(1, 0);
						Class505 class505 = Class322.method3931(Class173.aClass243_1758, (Class74.anInt690 * 1178461027), 0, (byte) 84);
						Class264 class264 = (Class373.aClass_ra4071.method5092(class505, Class89.method993(Class158.aClass243_6364, (1178461027 * Class74.anInt690), 0), true));
						Class148.method1614((byte) 42);
						Class139.method1548(string, true, Class373.aClass_ra4071, class264, class505, (byte) -38);
					}
				} else {
					GraphicsToolkit class_ra = null;
					if (null != string) {
						class_ra = Class523.method6334(0, (Class52_Sub2_Sub1.aCanvas9079), Class253.anInterface_ma2785, Class82_Sub6.aClass243_6844, 0, -199455021);
						class_ra.ba(1, 0);
						Class505 class505 = Class322.method3931(Class173.aClass243_1758, (Class74.anInt690 * 1178461027), 0, (byte) 29);
						Class264 class264 = (class_ra.method5092(class505, Class89.method993(Class158.aClass243_6364, (Class74.anInt690 * 1178461027), 0), true));
						Class148.method1614((byte) 9);
						Class139.method1548(string, true, class_ra, class264, class505, (byte) 53);
					}
					do {
						try {
							try {
								Class373.aClass_ra4071 = (Class523.method6334(i, Class52_Sub2_Sub1.aCanvas9079, Class253.anInterface_ma2785, Class82_Sub6.aClass243_6844, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7550.method5675(-1644099824) * 2, 1353555803));
								if (string != null) {
									class_ra.ba(1, 0);
									Class505 class505 = (Class322.method3931(Class173.aClass243_1758, Class74.anInt690 * 1178461027, 0, (byte) 32));
									Class264 class264 = (class_ra.method5092(class505, (Class89.method993(Class158.aClass243_6364, Class74.anInt690 * 1178461027, 0)), true));
									Class148.method1614((byte) 0);
									Class139.method1548(string, true, class_ra, class264, class505, (byte) -21);
								}
								if (Class373.aClass_ra4071.method5001()) {
									boolean bool_27_ = true;
									try {
										bool_27_ = (Class12.aClass298_Sub44_9946.cpuClockSpeed) * 399637415 > 256;
									} catch (Throwable throwable) {
										/* empty */
									}
									Class_v class_v;
									if (bool_27_)
										class_v = Class373.aClass_ra4071.method5026(146800640);
									else
										class_v = Class373.aClass_ra4071.method5026(104857600);
									Class373.aClass_ra4071.method5027(class_v);
								}
							} catch (Throwable throwable) {
								int i_28_ = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1530002941);
								if (i_28_ == 2)
									client.aBoolean8662 = true;
								Class422_Sub25.aClass298_Sub48_8425.method3540((Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571), 0, -1712068885);
								method4533(i_28_, string, bool, (short) 256);
								break;
							}
							if (class_ra != null) {
								try {
									class_ra.method5136(1031621435);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							break while_108_;
						} catch (RuntimeException object) {
							if (class_ra != null) {
								try {
									class_ra.method5136(1902974655);
								} catch (Throwable throwable) {
									/* empty */
								}
							}
							throw object;
						}
					} while (false);
					if (class_ra != null) {
						try {
							class_ra.method5136(362695969);
						} catch (Throwable throwable) {
							/* empty */
						}
					}
					return;
				}
			} while (false);
			if (bool)
				Class422_Sub25.aClass298_Sub48_8425.method3539(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571, !bool, -1907250649);
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571, i, -1004506906);
			if (!bool)
				Class422_Sub25.aClass298_Sub48_8425.method3539(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571, !bool, -1748771368);
			Class513.method6293(-707841245);
			Class373.aClass_ra4071.method5169(10000);
			Class373.aClass_ra4071.J(32);
			client.aClass283_8716.method2648(-818859939);
			Class373.aClass_ra4071.method5047(false);
			if (Class373.aClass_ra4071.method5050())
				Class365_Sub1_Sub5_Sub1.method4525(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub6_7551.method5647(-1411340111) == 1, -1054485931);
			client.aClass283_8716.method2647(526823496);
			client.aClass283_8716.method2640((byte) 64).method4324(-1897479103);
			client.aBoolean8666 = false;
			client.aBoolean8676 = true;
			Class100.aClass456Array1080 = null;
			Class373.aClass_ra4071.GA(0.0F, 1.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.fe(").append(')').toString());
		}
	}

	static final void method4534(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub5_7572.method5641(-1981564122) ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.any(").append(')').toString());
		}
	}

	static final void method4535(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_29_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			boolean bool = ((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]) == 1);
			if (Class301_Sub1.aClass437_7636 != null) {
				Linkable class298 = Class301_Sub1.aClass437_7636.get((long) i_29_);
				if (class298 != null && !bool)
					class298.unlink(-1460969981);
				else if (class298 == null && bool) {
					class298 = new Linkable();
					Class301_Sub1.aClass437_7636.method5817(class298, (long) i_29_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.aeh(").append(')').toString());
		}
	}

	static final void method4536(RsBitsBuffer stream, byte i) {
		int skip = 0;
		stream.initBitAccess(1090191163);
		for (int i_31_ = 0; i_31_ < 1168366243 * Class10.anInt129; i_31_++) {
			int playerIndex = Class10.anIntArray135[i_31_];
			if (0 == (Class10.slotFlags[playerIndex] & 0x1)) {
				if (skip > 0) {
					skip--;
					Class10.slotFlags[playerIndex] |= 0x2;
				} else {
					int i_33_ = stream.readBits(1);
					if (0 == i_33_) {
						skip = Class127_Sub3.method1431(stream, 2074736782);
						Class10.slotFlags[playerIndex] |= 0x2;
					} else
						Class500.method6221(stream, playerIndex, -1265435014);
				}
			}
		}
		stream.finishBitAccess((byte) 81);
		if (skip != 0)
			throw new RuntimeException();
		stream.initBitAccess(1796731201);
		for (int i_34_ = 0; i_34_ < Class10.anInt129 * 1168366243; i_34_++) {
			int i_35_ = Class10.anIntArray135[i_34_];
			if (0 != (Class10.slotFlags[i_35_] & 0x1)) {
				if (skip > 0) {
					skip--;
					Class10.slotFlags[i_35_] |= 0x2;
				} else {
					int i_36_ = stream.readBits(1);
					if (i_36_ == 0) {
						skip = Class127_Sub3.method1431(stream, 2076159127);
						Class10.slotFlags[i_35_] |= 0x2;
					} else
						Class500.method6221(stream, i_35_, -1556347349);
				}
			}
		}
		stream.finishBitAccess((byte) 23);
		if (0 != skip)
			throw new RuntimeException();
		stream.initBitAccess(-909299389);
		for (int i_37_ = 0; i_37_ < 1430471535 * Class10.anInt130; i_37_++) {
			int i_38_ = Class10.anIntArray134[i_37_];
			if ((Class10.slotFlags[i_38_] & 0x1) != 0) {
				if (skip > 0) {
					skip--;
					Class10.slotFlags[i_38_] |= 0x2;
				} else {
					int i_39_ = stream.readBits(1);
					if (0 == i_39_) {
						skip = Class127_Sub3.method1431(stream, 2121776092);
						Class10.slotFlags[i_38_] |= 0x2;
					} else if (Class501.method6229(stream, i_38_, -166989889))
						Class10.slotFlags[i_38_] |= 0x2;
				}
			}
		}
		stream.finishBitAccess((byte) 92);
		if (0 != skip)
			throw new RuntimeException();
		stream.initBitAccess(526089082);
		for (int i_40_ = 0; i_40_ < Class10.anInt130 * 1430471535; i_40_++) {
			int i_41_ = Class10.anIntArray134[i_40_];
			if ((Class10.slotFlags[i_41_] & 0x1) == 0) {
				if (skip > 0) {
					skip--;
					Class10.slotFlags[i_41_] |= 0x2;
				} else {
					int i_42_ = stream.readBits(1);
					if (i_42_ == 0) {
						skip = Class127_Sub3.method1431(stream, 2129494225);
						Class10.slotFlags[i_41_] |= 0x2;
					} else if (Class501.method6229(stream, i_41_, -1080126826))
						Class10.slotFlags[i_41_] |= 0x2;
				}
			}
		}
		stream.finishBitAccess((byte) 49);
		if (skip != 0)
			throw new RuntimeException();
		Class10.anInt129 = 0;
		Class10.anInt130 = 0;
		for (int i_43_ = 1; i_43_ < 2048; i_43_++) {
			Class10.slotFlags[i_43_] >>= 1;
			Player class365_sub1_sub1_sub2_sub2 = client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_43_];
			if (null != class365_sub1_sub1_sub2_sub2)
				Class10.anIntArray135[(Class10.anInt129 += -656365301) * 1168366243 - 1] = i_43_;
			else
				Class10.anIntArray134[(Class10.anInt130 += 854162319) * 1430471535 - 1] = i_43_;
		}
	}

	public static Class343_Sub1 method4537(int i) {
		try {
			if (Class474.anInt5977 * 1056867697 < Class474.aClass343_Sub1Array5975.length)
				return (Class474.aClass343_Sub1Array5975[(Class474.anInt5977 += -700736623) * 1056867697 - 1]);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wr.k(").append(')').toString());
		}
	}
}
