
/* Class250 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;

public class Class250 {
	IterableNodeMap aClass465_3087 = new IterableNodeMap(256);
	Index aClass317_3088;
	IterableNodeMap aClass465_3089;
	IterableNodeMap aClass465_3090 = new IterableNodeMap(256);
	Index aClass317_3091;
	static NativeSprite[] aClass160Array3092;
	public static Index aClass317_3093;

	public Class282_Sub26_Sub1_Sub2 method4284(int i, int[] is) {
		if (((Class250) this).aClass317_3091.containersCount(-1640431967) == 1)
			return method4285(0, i, is, -24629164);
		if (((Class250) this).aClass317_3091.filesCount(i, 1431854135) == 1)
			return method4285(i, 0, is, 342107882);
		throw new RuntimeException();
	}

	Class282_Sub26_Sub1_Sub2 method4285(int i, int i_0_, int[] is, int i_1_) {
		int i_2_ = i_0_ ^ (i << 4 & 0xffff | i >>> 12);
		i_2_ |= i << 16;
		long l = (long) i_2_;
		Class282_Sub26_Sub1_Sub2 class282_sub26_sub1_sub2 = ((Class282_Sub26_Sub1_Sub2) ((Class250) this).aClass465_3089.method7754(l));
		if (null != class282_sub26_sub1_sub2)
			return class282_sub26_sub1_sub2;
		if (is != null && is[0] <= 0)
			return null;
		Class343 class343 = Class343.method6094(((Class250) this).aClass317_3091, i, i_0_);
		if (class343 == null)
			return null;
		class282_sub26_sub1_sub2 = class343.method6089();
		((Class250) this).aClass465_3089.method7765(class282_sub26_sub1_sub2, l);
		if (is != null)
			is[0] -= (((Class282_Sub26_Sub1_Sub2) class282_sub26_sub1_sub2).aByteArray10470).length;
		return class282_sub26_sub1_sub2;
	}

	Class282_Sub26_Sub1_Sub1 method4286(int i, int i_3_, int[] is, byte i_4_) {
		int i_5_ = i_3_ ^ (i << 4 & 0xffff | i >>> 12);
		i_5_ |= i << 16;
		long l = (long) i_5_ ^ 0x100000000L;
		Class282_Sub26_Sub1_Sub1 class282_sub26_sub1_sub1 = ((Class282_Sub26_Sub1_Sub1) ((Class250) this).aClass465_3090.method7754(l));
		if (class282_sub26_sub1_sub1 != null)
			return class282_sub26_sub1_sub1;
		if (null != is && is[0] <= 0)
			return null;
		Class282_Sub18 class282_sub18 = (Class282_Sub18) ((Class250) this).aClass465_3087.method7754(l);
		if (null == class282_sub18) {
			class282_sub18 = Class282_Sub18.method12271(((Class250) this).aClass317_3088, i, i_3_);
			if (class282_sub18 == null)
				return null;
			((Class250) this).aClass465_3087.method7765(class282_sub18, l);
		}
		class282_sub26_sub1_sub1 = class282_sub18.method12272();
		if (class282_sub26_sub1_sub1 == null)
			return null;
		class282_sub18.unlink(-371378792);
		((Class250) this).aClass465_3090.method7765(class282_sub26_sub1_sub1, l);
		return class282_sub26_sub1_sub1;
	}

	public Class250(Index class317, Index class317_6_) {
		((Class250) this).aClass465_3089 = new IterableNodeMap(256);
		((Class250) this).aClass317_3091 = class317;
		((Class250) this).aClass317_3088 = class317_6_;
	}

	public Class282_Sub26_Sub1_Sub1 method4287(int i, int[] is, int i_7_) {
		if (((Class250) this).aClass317_3088.containersCount(-2129658875) == 1)
			return method4286(0, i, is, (byte) 114);
		if (((Class250) this).aClass317_3088.filesCount(i, 445586663) == 1)
			return method4286(i, 0, is, (byte) 119);
		throw new RuntimeException();
	}

	Class282_Sub26_Sub1_Sub2 method4288(int i, int i_8_, int[] is) {
		int i_9_ = i_8_ ^ (i << 4 & 0xffff | i >>> 12);
		i_9_ |= i << 16;
		long l = (long) i_9_;
		Class282_Sub26_Sub1_Sub2 class282_sub26_sub1_sub2 = ((Class282_Sub26_Sub1_Sub2) ((Class250) this).aClass465_3089.method7754(l));
		if (null != class282_sub26_sub1_sub2)
			return class282_sub26_sub1_sub2;
		if (is != null && is[0] <= 0)
			return null;
		Class343 class343 = Class343.method6094(((Class250) this).aClass317_3091, i, i_8_);
		if (class343 == null)
			return null;
		class282_sub26_sub1_sub2 = class343.method6089();
		((Class250) this).aClass465_3089.method7765(class282_sub26_sub1_sub2, l);
		if (is != null)
			is[0] -= (((Class282_Sub26_Sub1_Sub2) class282_sub26_sub1_sub2).aByteArray10470).length;
		return class282_sub26_sub1_sub2;
	}

	Class282_Sub26_Sub1_Sub1 method4289(int i, int i_10_, int[] is) {
		int i_11_ = i_10_ ^ (i << 4 & 0xffff | i >>> 12);
		i_11_ |= i << 16;
		long l = (long) i_11_ ^ 0x100000000L;
		Class282_Sub26_Sub1_Sub1 class282_sub26_sub1_sub1 = ((Class282_Sub26_Sub1_Sub1) ((Class250) this).aClass465_3090.method7754(l));
		if (class282_sub26_sub1_sub1 != null)
			return class282_sub26_sub1_sub1;
		if (null != is && is[0] <= 0)
			return null;
		Class282_Sub18 class282_sub18 = (Class282_Sub18) ((Class250) this).aClass465_3087.method7754(l);
		if (null == class282_sub18) {
			class282_sub18 = Class282_Sub18.method12271(((Class250) this).aClass317_3088, i, i_10_);
			if (class282_sub18 == null)
				return null;
			((Class250) this).aClass465_3087.method7765(class282_sub18, l);
		}
		class282_sub26_sub1_sub1 = class282_sub18.method12272();
		if (class282_sub26_sub1_sub1 == null)
			return null;
		class282_sub18.unlink(-371378792);
		((Class250) this).aClass465_3090.method7765(class282_sub26_sub1_sub1, l);
		return class282_sub26_sub1_sub1;
	}

	public Class282_Sub26_Sub1_Sub2 method4290(int i, int[] is, byte i_12_) {
		if (((Class250) this).aClass317_3091.containersCount(-1613280035) == 1)
			return method4285(0, i, is, 980716221);
		if (((Class250) this).aClass317_3091.filesCount(i, -1126653706) == 1)
			return method4285(i, 0, is, -350826880);
		throw new RuntimeException();
	}

	Class282_Sub26_Sub1_Sub2 method4291(int i, int i_13_, int[] is) {
		int i_14_ = i_13_ ^ (i << 4 & 0xffff | i >>> 12);
		i_14_ |= i << 16;
		long l = (long) i_14_;
		Class282_Sub26_Sub1_Sub2 class282_sub26_sub1_sub2 = ((Class282_Sub26_Sub1_Sub2) ((Class250) this).aClass465_3089.method7754(l));
		if (null != class282_sub26_sub1_sub2)
			return class282_sub26_sub1_sub2;
		if (is != null && is[0] <= 0)
			return null;
		Class343 class343 = Class343.method6094(((Class250) this).aClass317_3091, i, i_13_);
		if (class343 == null)
			return null;
		class282_sub26_sub1_sub2 = class343.method6089();
		((Class250) this).aClass465_3089.method7765(class282_sub26_sub1_sub2, l);
		if (is != null)
			is[0] -= (((Class282_Sub26_Sub1_Sub2) class282_sub26_sub1_sub2).aByteArray10470).length;
		return class282_sub26_sub1_sub2;
	}

	public Class282_Sub26_Sub1_Sub2 method4292(int i, int[] is) {
		if (((Class250) this).aClass317_3091.containersCount(-1311168858) == 1)
			return method4285(0, i, is, -1031932159);
		if (((Class250) this).aClass317_3091.filesCount(i, 750562123) == 1)
			return method4285(i, 0, is, 841642747);
		throw new RuntimeException();
	}

	public Class282_Sub26_Sub1_Sub2 method4293(int i, int[] is) {
		if (((Class250) this).aClass317_3091.containersCount(-2006298879) == 1)
			return method4285(0, i, is, -309734030);
		if (((Class250) this).aClass317_3091.filesCount(i, -2017582612) == 1)
			return method4285(i, 0, is, -205382253);
		throw new RuntimeException();
	}

	public Class282_Sub26_Sub1_Sub1 method4294(int i, int[] is) {
		if (((Class250) this).aClass317_3088.containersCount(-2035626476) == 1)
			return method4286(0, i, is, (byte) 104);
		if (((Class250) this).aClass317_3088.filesCount(i, -2008876266) == 1)
			return method4286(i, 0, is, (byte) 82);
		throw new RuntimeException();
	}

	static final void method4295(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = -1900875655 * ((CS2Executor) class527).aClass61_7010.anInt636;
	}

	public static void method4296(int i) {
		Class435.aClass482_5332 = new NodeCollection();
	}

	static void method4297(int i) {
		Class96_Sub21.aClass199_9438.method3238(-1428980483);
		Class163.aClass209_2031.method3584(-2146990157);
		Class308.aclient3620.method4704(2044329067);
		Class351.aCanvas4096.setBackground(Color.black);
		client.anInt7190 = 618386713;
		Class96_Sub21.aClass199_9438 = Class325.method5787(Class351.aCanvas4096, 539499635);
		Class163.aClass209_2031 = FontRenderer.method400(Class351.aCanvas4096, true, (byte) -106);
	}

	static final void method4298(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, byte i_20_) {
		int i_21_ = -963499271 * Class197.NUM_PLAYER_INDICES;
		int[] is = Class197.PLAYER_INDICES;
		client.anInt7415 = 0;
		int i_22_;
		if (4 == client.anInt7341 * -891719545)
			i_22_ = Class82.aClass75Array804.length;
		else
			i_22_ = -685729279 * client.anInt7211 + i_21_;
		for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
			Class409 class409 = null;
			Animable class521_sub1_sub1_sub2;
			if (-891719545 * client.anInt7341 == 4) {
				Class75 class75 = Class82.aClass75Array804[i_23_];
				if (!class75.aBool742)
					continue;
				class521_sub1_sub1_sub2 = class75.method1342((byte) 112);
				if (class521_sub1_sub1_sub2.anInt10349 * -2009373393 != client.anInt7286 * 48374445)
					continue;
				if (class75.anInt739 * 62352723 >= 0) {
					class409 = ((NPC) class521_sub1_sub1_sub2).aClass409_10580;
					if (null != class409.anIntArray4886) {
						class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
						if (null == class409)
							continue;
					}
				}
			} else {
				if (i_23_ < i_21_)
					class521_sub1_sub1_sub2 = (client.players[is[i_23_]]);
				else {
					class521_sub1_sub1_sub2 = ((Animable) (((Class282_Sub47) (client.aClass465_7208.method7754((long) client.anIntArray7212[i_23_ - i_21_]))).anObject8068));
					class409 = ((NPC) class521_sub1_sub1_sub2).aClass409_10580;
					if (null != class409.anIntArray4886) {
						class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
						if (null == class409)
							continue;
					}
				}
				if (1870758255 * class521_sub1_sub1_sub2.anInt10321 < 0 || ((48374445 * client.anInt7286 != -2009373393 * class521_sub1_sub1_sub2.anInt10349) && (Class84.myPlayer.aByte7967 != class521_sub1_sub1_sub2.aByte7967)))
					continue;
			}
			Class361.method6274(class521_sub1_sub1_sub2, class521_sub1_sub1_sub2.method12997(-218366287), -1607053853);
			if (!(client.aFloatArray7292[0] < 0.0F)) {
				if (class521_sub1_sub1_sub2.method15887(141891001)) {
					Class163 class163 = class521_sub1_sub1_sub2.method15811(-709125350);
					if (null != class163 && (client.anInt7415 * -854034157 < client.anInt7366 * 432489217)) {
						client.anIntArray7263[client.anInt7415 * -854034157] = ((Class288.aClass414_3438.method6946(class163.method2829(-766550436), -1967833701)) / 2);
						client.anIntArray7420[client.anInt7415 * -854034157] = (int) client.aFloatArray7292[0];
						client.anIntArray7417[-854034157 * client.anInt7415] = (int) client.aFloatArray7292[1];
						client.aClass163Array7419[(client.anInt7415 * -854034157)] = class163;
						client.anInt7415 += 460470555;
					}
				}
				int i_24_ = (int) ((float) i_15_ + client.aFloatArray7292[1]);
				i_24_ -= Class288.aClass414_3438.anInt4978 * 397683159;
				boolean bool = false;
				if (!class521_sub1_sub1_sub2.aBool10318 && !class521_sub1_sub1_sub2.aClass457_10333.method7666(833555541)) {
					for (Class275_Sub7 class275_sub7 = (Class275_Sub7) class521_sub1_sub1_sub2.aClass457_10333.method7659(301908602); null != class275_sub7; class275_sub7 = (Class275_Sub7) class521_sub1_sub1_sub2.aClass457_10333.method7650((byte) 17)) {
						Class275_Sub3 class275_sub3 = class275_sub7.method12600((-1809259861 * client.cycles), (short) 12514);
						if (null != class275_sub3) {
							Class198 class198 = class275_sub7.aClass198_7863;
							Player class521_sub1_sub1_sub2_sub1 = (client.players[is[i_23_]]);
							NativeSprite class160;
							NativeSprite class160_25_;
							if (null != class521_sub1_sub1_sub2_sub1 && class521_sub1_sub1_sub2_sub1.aBool10571) {
								class160 = class198.method3224((Class316.aClass505_3680), 1826512281);
								class160_25_ = class198.method3222((Class316.aClass505_3680), -1448626109);
							} else {
								class160 = class198.method3208((Class316.aClass505_3680), 549654584);
								class160_25_ = class198.method3207((Class316.aClass505_3680), -2032776037);
							}
							if (null != class160 && null != class160_25_) {
								int i_26_ = 255;
								int i_27_ = -1;
								int i_28_ = (-1809259861 * client.cycles - class275_sub3.anInt7811 * -145017129);
								int i_29_ = (class160_25_.method2747() * (-167090555 * class275_sub3.anInt7809) / 255);
								if (28139157 * class275_sub3.anInt7812 > i_28_) {
									int i_30_ = (0 == class198.anInt2442 * -776944103 ? 0 : (i_28_ / (class198.anInt2442 * -776944103) * (class198.anInt2442 * -776944103)));
									int i_31_ = (class160_25_.method2747() * (class275_sub3.anInt7810 * 2026547711) / 255);
									i_27_ = i_31_ + ((i_29_ - i_31_) * i_30_ / (class275_sub3.anInt7812 * 28139157));
								} else {
									i_27_ = i_29_;
									int i_32_ = (28139157 * class275_sub3.anInt7812 + class198.anInt2443 * -2073838649 - i_28_);
									if (270910593 * class198.anInt2439 >= 0)
										i_26_ = ((i_32_ << 8) / ((-2073838649 * class198.anInt2443) - (class198.anInt2439 * 270910593)));
								}
								if (-167090555 * class275_sub3.anInt7809 > 0 && i_27_ < 2)
									i_27_ = 2;
								int i_33_ = class160.method2793();
								int i_34_ = (int) (client.aFloatArray7292[0] + (float) i - (float) (class160.method2747() >> 1));
								i_24_ -= i_33_;
								if (i_26_ >= 0 && i_26_ < 255) {
									int i_35_ = i_26_ << 24;
									int i_36_ = i_35_ | 0xffffff;
									class160.method2742(i_34_, i_24_, 0, i_36_, 1);
									Class316.aClass505_3680.o(i_34_, i_24_, i_34_ + i_27_, i_24_ + i_33_);
									class160_25_.method2742(i_34_, i_24_, 0, i_36_, 1);
								} else {
									class160.method2752(i_34_, i_24_);
									Class316.aClass505_3680.o(i_34_, i_24_, i_27_ + i_34_, i_24_ + i_33_);
									class160_25_.method2752(i_34_, i_24_);
								}
								Class316.aClass505_3680.r(i, i_15_, i_16_ + i, i_17_ + i_15_);
								i_24_ -= 2;
								bool = true;
							}
						} else if (class275_sub7.method12602(1668926296))
							class275_sub7.method4887((byte) -66);
					}
				}
				if (!bool)
					i_24_ -= Class58.aClass529_527.anInt7028 * -1369601877 + 2;
				if (!class521_sub1_sub1_sub2.aBool10318) {
					if (null == class409) {
						Player class521_sub1_sub1_sub2_sub1 = ((Player) class521_sub1_sub1_sub2);
						if ((class521_sub1_sub1_sub2_sub1.skullId * -134543849) != -1) {
							NativeSprite class160 = (Class282_Sub21.aClass160Array7673[(class521_sub1_sub1_sub2_sub1.skullId * -134543849)]);
							i_24_ -= class160.method2793();
							class160.method2752((int) ((client.aFloatArray7292[0]) + (float) i - 12.0F), i_24_);
							i_24_ -= 2;
						}
						if (-1 != (class521_sub1_sub1_sub2_sub1.headIconId * 1369791245)) {
							NativeSprite class160 = (Class16.aClass160Array138[1369791245 * (class521_sub1_sub1_sub2_sub1.headIconId)]);
							i_24_ -= class160.method2793();
							class160.method2752((int) ((client.aFloatArray7292[0]) + (float) i - 12.0F), i_24_);
							i_24_ -= 2;
						}
					} else if (class409.anInt4887 * -1341416409 >= 0 && (class409.anInt4887 * -1341416409 < Class16.aClass160Array138.length)) {
						NativeSprite class160 = (Class16.aClass160Array138[class409.anInt4887 * -1341416409]);
						i_24_ -= class160.method2793();
						class160.method2752((int) ((float) i + client.aFloatArray7292[0] - (float) (class160.method2747() >> 1)), i_24_);
						i_24_ -= 2;
					}
				}
				if (class521_sub1_sub1_sub2 instanceof Player) {
					if (i_23_ >= 0) {
						int i_37_ = 0;
						Class180[] class180s = client.aClass180Array7348;
						for (int i_38_ = 0; i_38_ < class180s.length; i_38_++) {
							Class180 class180 = class180s[i_38_];
							if (null != class180 && 10 == class180.anInt2236 * -379447335 && (is[i_23_] == 1505135749 * class180.anInt2238)) {
								NativeSprite class160 = (Class391.aClass160Array4778[(-1923151643 * ((Class180) class180).anInt2240)]);
								if (class160.method2793() > i_37_)
									i_37_ = class160.method2793();
								class160.method2752((int) ((float) i + (client.aFloatArray7292[0]) - 12.0F), (i_24_ - class160.method2793()));
							}
						}
						if (i_37_ > 0)
							i_24_ -= 2 + i_37_;
					}
				} else {
					int i_39_ = 0;
					Class180[] class180s = client.aClass180Array7348;
					for (int i_40_ = 0; i_40_ < class180s.length; i_40_++) {
						Class180 class180 = class180s[i_40_];
						if (null != class180 && 1 == class180.anInt2236 * -379447335 && (class180.anInt2238 * 1505135749 == client.anIntArray7212[i_23_ - i_21_])) {
							NativeSprite class160 = (Class391.aClass160Array4778[(((Class180) class180).anInt2240 * -1923151643)]);
							if (class160.method2793() > i_39_)
								i_39_ = class160.method2793();
							boolean bool_41_;
							if (0 == ((Class180) class180).anInt2244 * 796206009)
								bool_41_ = true;
							else {
								int i_42_ = (Class204.method3363(1264825249) * 1000 / (796206009 * ((Class180) class180).anInt2244) / 2);
								bool_41_ = (client.cycles * -1809259861 % (2 * i_42_)) < i_42_;
							}
							if (bool_41_)
								class160.method2752((int) ((float) i + (client.aFloatArray7292[0]) - 12.0F), (i_24_ - class160.method2793()));
						}
					}
					if (i_39_ > 0)
						i_24_ -= 2 + i_39_;
				}
				int i_43_ = 0;
				for (/**/; i_43_ < -1141871871 * Class58.aClass529_527.anInt7026; i_43_++) {
					int i_44_ = class521_sub1_sub1_sub2.anIntArray10351[i_43_];
					int i_45_ = class521_sub1_sub1_sub2.anIntArray10316[i_43_];
					Class228 class228 = null;
					int i_46_ = 0;
					if (i_45_ >= 0) {
						if (i_44_ <= -1809259861 * client.cycles)
							continue;
						class228 = (Login.aClass210_3389.method3603(class521_sub1_sub1_sub2.anIntArray10316[i_43_], 1856651955));
						i_46_ = class228.anInt2841 * -1006911631;
					} else if (i_44_ < 0)
						continue;
					int i_47_ = class521_sub1_sub1_sub2.anIntArray10331[i_43_];
					Class228 class228_48_ = null;
					if (i_47_ >= 0)
						class228_48_ = Login.aClass210_3389.method3603(i_47_, 1856651955);
					if (i_44_ - i_46_ <= client.cycles * -1809259861) {
						if (null == class228)
							class521_sub1_sub1_sub2.anIntArray10351[i_43_] = -1;
						else {
							int i_49_ = (class521_sub1_sub1_sub2.method12997(-218366287) / 2);
							Class361.method6274(class521_sub1_sub1_sub2, i_49_, -1352747334);
							if (client.aFloatArray7292[0] > -1.0F) {
								client.aFloatArray7292[0] += (float) (Class58.aClass529_527.anIntArray7042[i_43_]);
								client.aFloatArray7292[1] += (float) (Class58.aClass529_527.anIntArray7029[i_43_]);
								Object object = null;
								Object object_50_ = null;
								Object object_51_ = null;
								Object object_52_ = null;
								int i_53_ = 0;
								int i_54_ = 0;
								int i_55_ = 0;
								int i_56_ = 0;
								int i_57_ = 0;
								int i_58_ = 0;
								int i_59_ = 0;
								int i_60_ = 0;
								NativeSprite class160 = null;
								NativeSprite class160_61_ = null;
								NativeSprite class160_62_ = null;
								NativeSprite class160_63_ = null;
								int i_64_ = 0;
								int i_65_ = 0;
								int i_66_ = 0;
								int i_67_ = 0;
								int i_68_ = 0;
								int i_69_ = 0;
								int i_70_ = 0;
								int i_71_ = 0;
								int i_72_ = 0;
								NativeSprite class160_73_ = class228.method3835((Class316.aClass505_3680), 1623036719);
								if (null != class160_73_) {
									i_53_ = class160_73_.method2747();
									int i_74_ = class160_73_.method2793();
									if (i_74_ > i_72_)
										i_72_ = i_74_;
									class160_73_.method2744(client.anIntArray7461);
									i_57_ = client.anIntArray7461[0];
								}
								NativeSprite class160_75_ = class228.method3836((Class316.aClass505_3680), -47251071);
								if (class160_75_ != null) {
									i_54_ = class160_75_.method2747();
									int i_76_ = class160_75_.method2793();
									if (i_76_ > i_72_)
										i_72_ = i_76_;
									class160_75_.method2744(client.anIntArray7461);
									i_58_ = client.anIntArray7461[0];
								}
								NativeSprite class160_77_ = class228.method3832((Class316.aClass505_3680), 1942118537);
								if (null != class160_77_) {
									i_55_ = class160_77_.method2747();
									int i_78_ = class160_77_.method2793();
									if (i_78_ > i_72_)
										i_72_ = i_78_;
									class160_77_.method2744(client.anIntArray7461);
									i_59_ = client.anIntArray7461[0];
								}
								NativeSprite class160_79_ = class228.method3838((Class316.aClass505_3680), (byte) 13);
								if (class160_79_ != null) {
									i_56_ = class160_79_.method2747();
									int i_80_ = class160_79_.method2793();
									if (i_80_ > i_72_)
										i_72_ = i_80_;
									class160_79_.method2744(client.anIntArray7461);
									i_60_ = client.anIntArray7461[0];
								}
								if (class228_48_ != null) {
									class160 = (class228_48_.method3835(Class316.aClass505_3680, 1623036719));
									if (null != class160) {
										i_64_ = class160.method2747();
										int i_81_ = class160.method2793();
										if (i_81_ > i_72_)
											i_72_ = i_81_;
										class160.method2744(client.anIntArray7461);
										i_68_ = client.anIntArray7461[0];
									}
									class160_61_ = (class228_48_.method3836(Class316.aClass505_3680, -47251071));
									if (class160_61_ != null) {
										i_65_ = class160_61_.method2747();
										int i_82_ = class160_61_.method2793();
										if (i_82_ > i_72_)
											i_72_ = i_82_;
										class160_61_.method2744(client.anIntArray7461);
										i_69_ = client.anIntArray7461[0];
									}
									class160_62_ = (class228_48_.method3832(Class316.aClass505_3680, 1942118537));
									if (class160_62_ != null) {
										i_66_ = class160_62_.method2747();
										int i_83_ = class160_62_.method2793();
										if (i_83_ > i_72_)
											i_72_ = i_83_;
										class160_62_.method2744(client.anIntArray7461);
										i_70_ = client.anIntArray7461[0];
									}
									class160_63_ = (class228_48_.method3838(Class316.aClass505_3680, (byte) -1));
									if (null != class160_63_) {
										i_67_ = class160_63_.method2747();
										int i_84_ = class160_63_.method2793();
										if (i_84_ > i_72_)
											i_72_ = i_84_;
										class160_63_.method2744(client.anIntArray7461);
										i_71_ = client.anIntArray7461[0];
									}
								}
								FontRenderer class8 = Class540.aClass8_7138;
								FontRenderer class8_85_ = Class540.aClass8_7138;
								Class414 class414 = Class282_Sub17_Sub2.aClass414_9933;
								Class414 class414_86_ = Class282_Sub17_Sub2.aClass414_9933;
								int i_87_ = class228.anInt2849 * -243009855;
								if (i_87_ >= 0) {
									FontRenderer class8_88_ = ((FontRenderer) (Class487.aClass378_5752.method6426(client.anInterface35_7206, i_87_, true, class228.aBool2838, -2104806064)));
									Class414 class414_89_ = (Class487.aClass378_5752.method6415(client.anInterface35_7206, i_87_, 849439454));
									if (class8_88_ != null && class414_89_ != null) {
										class8 = class8_88_;
										class414 = class414_89_;
									}
								}
								if (class228_48_ != null) {
									i_87_ = -243009855 * class228_48_.anInt2849;
									if (i_87_ >= 0) {
										FontRenderer class8_90_ = ((FontRenderer) (Class487.aClass378_5752.method6426(client.anInterface35_7206, i_87_, true, class228_48_.aBool2838, -2122773037)));
										Class414 class414_91_ = (Class487.aClass378_5752.method6415(client.anInterface35_7206, i_87_, -1865476378));
										if (class8_90_ != null && null != class414_91_) {
											class8_85_ = class8_90_;
											class414_86_ = class414_91_;
										}
									}
								}
								Object object_92_ = null;
								String string = null;
								boolean bool_93_ = false;
								int i_94_ = 0;
								String string_95_ = (class228.method3844((class521_sub1_sub1_sub2.anIntArray10329[i_43_]), (byte) -109));
								int i_96_ = class414.method6946(string_95_, -1967833701);
								if (class228_48_ != null) {
									string = (class228_48_.method3844((class521_sub1_sub1_sub2.anIntArray10332[i_43_]), (byte) -122));
									i_94_ = class414_86_.method6946(string, -1967833701);
								}
								int i_97_ = 0;
								int i_98_ = 0;
								if (i_54_ > 0)
									i_97_ = 1 + i_96_ / i_54_;
								if (null != class228_48_ && i_65_ > 0)
									i_98_ = i_94_ / i_65_ + 1;
								int i_99_ = 0;
								int i_100_ = i_99_;
								if (i_53_ > 0)
									i_99_ += i_53_;
								i_99_ += 2;
								int i_101_ = i_99_;
								if (i_55_ > 0)
									i_99_ += i_55_;
								int i_102_ = i_99_;
								int i_103_ = i_99_;
								if (i_54_ > 0) {
									int i_104_ = i_54_ * i_97_;
									i_99_ += i_104_;
									i_103_ += (i_104_ - i_96_) / 2;
								} else
									i_99_ += i_96_;
								int i_105_ = i_99_;
								if (i_56_ > 0)
									i_99_ += i_56_;
								int i_106_ = 0;
								int i_107_ = 0;
								int i_108_ = 0;
								int i_109_ = 0;
								int i_110_ = 0;
								if (null != class228_48_) {
									i_99_ += 2;
									i_106_ = i_99_;
									if (i_64_ > 0)
										i_99_ += i_64_;
									i_99_ += 2;
									i_107_ = i_99_;
									if (i_66_ > 0)
										i_99_ += i_66_;
									i_108_ = i_99_;
									i_110_ = i_99_;
									if (i_65_ > 0) {
										int i_111_ = i_98_ * i_65_;
										i_99_ += i_111_;
										i_110_ += (i_111_ - i_94_) / 2;
									} else
										i_99_ += i_94_;
									i_109_ = i_99_;
									if (i_67_ > 0)
										i_99_ += i_67_;
								}
								int i_112_ = ((class521_sub1_sub1_sub2.anIntArray10351[i_43_]) - client.cycles * -1809259861);
								int i_113_ = (class228.anInt2846 * 1368824469 - (1368824469 * class228.anInt2846 * i_112_ / (-1006911631 * class228.anInt2841)));
								int i_114_ = (-(-17085045 * class228.anInt2833) + (-17085045 * class228.anInt2833 * i_112_ / (class228.anInt2841 * -1006911631)));
								int i_115_ = (int) ((float) i + client.aFloatArray7292[0] - (float) (i_99_ >> 1) + (float) i_113_);
								int i_116_ = (int) ((float) i_114_ + (client.aFloatArray7292[1] + (float) i_15_ - 12.0F));
								int i_117_ = i_116_;
								int i_118_ = i_116_ + i_72_;
								int i_119_ = (class228.anInt2832 * 1460906305 + (15 + i_116_));
								int i_120_ = i_119_ - 397683159 * class414.anInt4978;
								int i_121_ = (i_119_ + -1518951631 * class414.anInt4979);
								if (i_120_ < i_117_)
									i_117_ = i_120_;
								if (i_121_ > i_118_)
									i_118_ = i_121_;
								int i_122_ = 0;
								if (null != class228_48_) {
									i_122_ = (i_116_ + 15 + (1460906305 * class228_48_.anInt2832));
									int i_123_ = i_122_ - (class414_86_.anInt4978 * 397683159);
									int i_124_ = (class414_86_.anInt4979 * -1518951631 + i_122_);
									if (i_123_ < i_117_)
										i_117_ = i_123_;
									if (i_124_ > i_118_)
										i_118_ = i_124_;
								}
								int i_125_ = 255;
								if (class228.anInt2847 * 1549607997 >= 0)
									i_125_ = ((i_112_ << 8) / (-1006911631 * class228.anInt2841 - (1549607997 * class228.anInt2847)));
								if (i_125_ >= 0 && i_125_ < 255) {
									int i_126_ = i_125_ << 24;
									int i_127_ = i_126_ | 0xffffff;
									if (null != class160_73_)
										class160_73_.method2742((i_100_ + i_115_ - i_57_), i_116_, 0, i_127_, 1);
									if (class160_77_ != null)
										class160_77_.method2742((i_101_ + i_115_ - i_59_), i_116_, 0, i_127_, 1);
									if (null != class160_75_) {
										for (int i_128_ = 0; i_128_ < i_97_; i_128_++)
											class160_75_.method2742((i_128_ * i_54_ + (i_102_ + i_115_ - i_58_)), i_116_, 0, i_127_, 1);
									}
									if (null != class160_79_)
										class160_79_.method2742((i_105_ + i_115_ - i_60_), i_116_, 0, i_127_, 1);
									class8.renderText(string_95_, i_115_ + i_103_, i_119_, (class228.anInt2844 * -1448612163) | i_126_, 0, -418109423);
									if (class228_48_ != null) {
										if (null != class160)
											class160.method2742((i_115_ + i_106_ - i_68_), i_116_, 0, i_127_, 1);
										if (class160_62_ != null)
											class160_62_.method2742((i_115_ + i_107_ - i_70_), i_116_, 0, i_127_, 1);
										if (null != class160_61_) {
											for (int i_129_ = 0; i_129_ < i_98_; i_129_++)
												class160_61_.method2742((i_108_ + i_115_ - i_69_ + i_129_ * i_65_), i_116_, 0, i_127_, 1);
										}
										if (null != class160_63_)
											class160_63_.method2742((i_115_ + i_109_ - i_71_), i_116_, 0, i_127_, 1);
										class8_85_.renderText(string, i_110_ + i_115_, i_122_, (((class228_48_.anInt2844) * -1448612163) | i_126_), 0, -418109423);
									}
								} else {
									if (class160_73_ != null)
										class160_73_.method2752((i_115_ + i_100_ - i_57_), i_116_);
									if (class160_77_ != null)
										class160_77_.method2752((i_101_ + i_115_ - i_59_), i_116_);
									if (class160_75_ != null) {
										for (int i_130_ = 0; i_130_ < i_97_; i_130_++)
											class160_75_.method2752((i_102_ + i_115_ - i_58_ + i_130_ * i_54_), i_116_);
									}
									if (null != class160_79_)
										class160_79_.method2752((i_105_ + i_115_ - i_60_), i_116_);
									class8.renderText(string_95_, i_115_ + i_103_, i_119_, ((-1448612163 * class228.anInt2844) | ~0xffffff), 0, -418109423);
									if (class228_48_ != null) {
										if (null != class160)
											class160.method2752((i_115_ + i_106_ - i_68_), i_116_);
										if (null != class160_62_)
											class160_62_.method2752((i_115_ + i_107_ - i_70_), i_116_);
										if (null != class160_61_) {
											for (int i_131_ = 0; i_131_ < i_98_; i_131_++)
												class160_61_.method2752((i_115_ + i_108_ - i_69_ + i_65_ * i_131_), i_116_);
										}
										if (null != class160_63_)
											class160_63_.method2752((i_109_ + i_115_ - i_71_), i_116_);
										class8_85_.renderText(string, i_115_ + i_110_, i_122_, ((-1448612163 * (class228_48_.anInt2844)) | ~0xffffff), 0, -418109423);
									}
								}
							}
						}
					}
				}
			}
		}
		for (int i_132_ = 0; i_132_ < client.anInt7304 * -282380655; i_132_++) {
			int i_133_ = client.anIntArray7287[i_132_];
			Animable class521_sub1_sub1_sub2;
			if (i_133_ < 2048)
				class521_sub1_sub1_sub2 = client.players[i_133_];
			else
				class521_sub1_sub1_sub2 = ((Animable) (((Class282_Sub47) client.aClass465_7208.method7754((long) (i_133_ - 2048))).anObject8068));
			int i_134_ = client.anIntArray7288[i_132_];
			Animable class521_sub1_sub1_sub2_135_;
			if (i_134_ < 2048)
				class521_sub1_sub1_sub2_135_ = client.players[i_134_];
			else
				class521_sub1_sub1_sub2_135_ = ((Animable) (((Class282_Sub47) client.aClass465_7208.method7754((long) (i_134_ - 2048))).anObject8068));
			ItemDefinitions.method7140(class521_sub1_sub1_sub2, class521_sub1_sub1_sub2_135_, (class521_sub1_sub1_sub2.anInt10319 -= -783136099) * -1960408139, i, i_15_, i_16_, i_17_, i_18_, i_19_, (byte) 41);
		}
		int i_136_ = (-1518951631 * Class288.aClass414_3438.anInt4979 + Class288.aClass414_3438.anInt4978 * 397683159 + 2);
		for (int i_137_ = 0; i_137_ < client.anInt7415 * -854034157; i_137_++) {
			int i_138_ = client.anIntArray7420[i_137_];
			int i_139_ = client.anIntArray7417[i_137_];
			int i_140_ = client.anIntArray7263[i_137_];
			boolean bool = true;
			while (bool) {
				bool = false;
				for (int i_141_ = 0; i_141_ < i_137_; i_141_++) {
					if (i_139_ + 2 > client.anIntArray7417[i_141_] - i_136_ && i_139_ - i_136_ < client.anIntArray7417[i_141_] + 2 && i_138_ - i_140_ < (client.anIntArray7263[i_141_] + client.anIntArray7420[i_141_]) && i_138_ + i_140_ > (client.anIntArray7420[i_141_] - client.anIntArray7263[i_141_]) && client.anIntArray7417[i_141_] - i_136_ < i_139_) {
						i_139_ = client.anIntArray7417[i_141_] - i_136_;
						bool = true;
					}
				}
			}
			client.anIntArray7417[i_137_] = i_139_;
			String string = client.aClass163Array7419[i_137_].method2829(-766550436);
			if (0 == client.anInt7351 * -1675537767) {
				int i_142_ = 16776960;
				int i_143_ = client.aClass163Array7419[i_137_].method2830((short) 2671);
				if (i_143_ < 6)
					i_142_ = client.anIntArray7148[i_143_];
				if (i_143_ == 6)
					i_142_ = (client.anInt7286 * 48374445 % 20 < 10 ? 16711680 : 16776960);
				if (7 == i_143_)
					i_142_ = 48374445 * client.anInt7286 % 20 < 10 ? 255 : 65535;
				if (i_143_ == 8)
					i_142_ = (48374445 * client.anInt7286 % 20 < 10 ? 45056 : 8454016);
				if (9 == i_143_) {
					int i_144_ = 150 - (client.aClass163Array7419[i_137_].method2833(-315932327) * 150 / client.aClass163Array7419[i_137_].method2832(2065771528));
					if (i_144_ < 50)
						i_142_ = 16711680 + 1280 * i_144_;
					else if (i_144_ < 100)
						i_142_ = 16776960 - (i_144_ - 50) * 327680;
					else if (i_144_ < 150)
						i_142_ = 65280 + 5 * (i_144_ - 100);
				}
				if (i_143_ == 10) {
					int i_145_ = 150 - (client.aClass163Array7419[i_137_].method2833(-315932327) * 150 / client.aClass163Array7419[i_137_].method2832(-1271614996));
					if (i_145_ < 50)
						i_142_ = 16711680 + 5 * i_145_;
					else if (i_145_ < 100)
						i_142_ = 16711935 - 327680 * (i_145_ - 50);
					else if (i_145_ < 150)
						i_142_ = ((i_145_ - 100) * 327680 + 255 - (i_145_ - 100) * 5);
				}
				if (11 == i_143_) {
					int i_146_ = 150 - (client.aClass163Array7419[i_137_].method2833(-315932327) * 150 / client.aClass163Array7419[i_137_].method2832(-1800362752));
					if (i_146_ < 50)
						i_142_ = 16777215 - i_146_ * 327685;
					else if (i_146_ < 100)
						i_142_ = (i_146_ - 50) * 327685 + 65280;
					else if (i_146_ < 150)
						i_142_ = 16777215 - (i_146_ - 100) * 327680;
				}
				int i_147_ = i_142_ | ~0xffffff;
				int i_148_ = client.aClass163Array7419[i_137_].method2831((short) -9164);
				if (0 == i_148_)
					Class285.aClass8_3394.method360(string, i + i_138_, i_139_ + i_15_, i_147_, -16777216, 768492991);
				if (1 == i_148_)
					Class285.aClass8_3394.method387(string, i + i_138_, i_15_ + i_139_, i_147_, -16777216, (48374445 * client.anInt7286), -1574262773);
				if (2 == i_148_)
					Class285.aClass8_3394.method368(string, i + i_138_, i_139_ + i_15_, i_147_, -16777216, (48374445 * client.anInt7286), (byte) -65);
				if (3 == i_148_) {
					int i_149_ = 150 - (client.aClass163Array7419[i_137_].method2833(-315932327) * 150 / client.aClass163Array7419[i_137_].method2832(71923775));
					Class285.aClass8_3394.method381(string, i_138_ + i, i_15_ + i_139_, i_147_, -16777216, (client.anInt7286 * 48374445), i_149_, -142309733);
				}
				if (i_148_ == 4) {
					int i_150_ = 150 - (client.aClass163Array7419[i_137_].method2833(-315932327) * 150 / client.aClass163Array7419[i_137_].method2832(744941042));
					int i_151_ = i_150_ * (Class288.aClass414_3438.method6946(string, -1967833701) + 100) / 150;
					Class316.aClass505_3680.o(i + i_138_ - 50, i_15_, 50 + (i + i_138_), i_15_ + i_17_);
					Class285.aClass8_3394.renderText(string, 50 + (i + i_138_) - i_151_, i_139_ + i_15_, i_147_, -16777216, -418109423);
					Class316.aClass505_3680.r(i, i_15_, i_16_ + i, i_17_ + i_15_);
				}
				if (i_148_ == 5) {
					int i_152_ = 150 - (client.aClass163Array7419[i_137_].method2833(-315932327) * 150 / client.aClass163Array7419[i_137_].method2832(1124068407));
					int i_153_ = 0;
					if (i_152_ < 25)
						i_153_ = i_152_ - 25;
					else if (i_152_ > 125)
						i_153_ = i_152_ - 125;
					int i_154_ = (397683159 * Class288.aClass414_3438.anInt4978 + -1518951631 * Class288.aClass414_3438.anInt4979);
					Class316.aClass505_3680.o(i, i_15_ + i_139_ - i_154_ - 1, i_16_ + i, i_139_ + i_15_ + 5);
					Class285.aClass8_3394.method360(string, i_138_ + i, i_153_ + (i_139_ + i_15_), i_147_, -16777216, 768492991);
					Class316.aClass505_3680.r(i, i_15_, i_16_ + i, i_17_ + i_15_);
				}
			} else
				Class285.aClass8_3394.method360(string, i + i_138_, i_139_ + i_15_, -256, -16777216, 768492991);
		}
	}

	static final void method4299(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		if ((((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]) == (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]))
			((CS2Executor) class527).instrPtr += (-1051529003 * (((CS2Executor) class527).unknown[((CS2Executor) class527).instrPtr * 301123709]));
	}
}
