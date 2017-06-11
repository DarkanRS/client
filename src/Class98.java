/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.List;

public abstract class Class98 {
	int anInt946;
	int anInt947;
	int anInt948;
	public static byte[][] aByteArrayArray949;
	static int anInt950;

	Class98(int i, int i_0_, int i_1_) {
		((Class98) this).anInt948 = i * -1209403731;
		((Class98) this).anInt947 = -2125519021 * i_0_;
		((Class98) this).anInt946 = -1733764677 * i_1_;
	}

	abstract void method1046(int i, int i_2_);

	abstract void method1047(int i, int i_3_, byte i_4_);

	abstract void method1048(int i, int i_5_, byte i_6_);

	abstract void method1049(int i, int i_7_);

	abstract void method1050(int i, int i_8_);

	abstract void method1051(int i, int i_9_);

	abstract void method1052(int i, int i_10_);

	abstract void method1053(int i, int i_11_);

	abstract void method1054(int i, int i_12_, byte i_13_);

	static void method1055(GraphicsToolkit class_ra, int i, int i_14_, int i_15_) {
		try {
			if (i >= 0 && i_14_ >= 0 && null != Class436.aClass233_5493) {
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				Matrix4f class233 = class_ra.method5036();
				class_ra.method5182(Class436.aClass233_5493);
				class_ra.method5043(Class436.aClass222_5495);
				class_ra.r(Class436.anInt5489 * -156795795, -2074651333 * Class436.anInt5490, (-156795795 * Class436.anInt5489 + 2125992951 * Class436.anInt5491), (Class436.anInt5490 * -2074651333 + Class436.anInt5492 * 971707205));
				class_ra.method5187(Class436.anInt5489 * -156795795, -2074651333 * Class436.anInt5490, 2125992951 * Class436.anInt5491, 971707205 * Class436.anInt5492);
				class233.method2145(Class436.aClass222_5495);
				class233.method2144(Class436.aClass233_5493);
				class233.method2146();
				int i_16_ = i - Class436.anInt5489 * -156795795;
				int i_17_ = i_14_ - Class436.anInt5490 * -2074651333;
				if (client.aClass283_8716.method2675(-1611682495) != null && (!client.aBoolean8835 || (-112110875 * Linkable.anInt3192 & 0x40) != 0)) {
					int i_18_ = -1;
					int i_19_ = -1;
					float f = ((float) i_16_ * 2.0F / (float) (Class436.anInt5491 * 2125992951) - 1.0F);
					float f_20_ = ((2.0F * (float) i_17_ / (float) (971707205 * Class436.anInt5492)) - 1.0F);
					class233.method2149(f, f_20_, -1.0F, Class436.aFloatArray5475);
					float f_21_ = (Class436.aFloatArray5475[0] / Class436.aFloatArray5475[3]);
					float f_22_ = (Class436.aFloatArray5475[1] / Class436.aFloatArray5475[3]);
					float f_23_ = (Class436.aFloatArray5475[2] / Class436.aFloatArray5475[3]);
					class233.method2149(f, f_20_, 1.0F, Class436.aFloatArray5475);
					float f_24_ = (Class436.aFloatArray5475[0] / Class436.aFloatArray5475[3]);
					float f_25_ = (Class436.aFloatArray5475[1] / Class436.aFloatArray5475[3]);
					float f_26_ = (Class436.aFloatArray5475[2] / Class436.aFloatArray5475[3]);
					float f_27_ = Class120.method1312(f_21_, f_22_, f_23_, f_24_, f_25_, f_26_, 4, 1869450178);
					if (f_27_ > 0.0F) {
						float f_28_ = f_24_ - f_21_;
						float f_29_ = f_26_ - f_23_;
						int i_30_ = (int) (f_21_ + f_27_ * f_28_);
						int i_31_ = (int) (f_29_ * f_27_ + f_23_);
						i_18_ = i_30_ + (Class287.myPlayer.getSize() - 1 << 8) >> 9;
						i_19_ = i_31_ + (Class287.myPlayer.getSize() - 1 << 8) >> 9;
						int i_32_ = (Class287.myPlayer.plane);
						if (i_32_ < 3 && ((client.aClass283_8716.method2654(-86337284).aByteArrayArrayArray2731[1][i_30_ >> 9][i_31_ >> 9]) & 0x2) != 0)
							i_32_++;
					}
					if (-1 != i_18_ && -1 != i_19_) {
						if (client.aBoolean8835 && (-112110875 * Linkable.anInt3192 & 0x40) != 0) {
							IComponentDefinition class105 = Class140.method1558((Class379.anInt4099 * 1262526353), (392084321 * client.anInt8836), -156511736);
							if (class105 != null)
								Class234.method2174(client.aString8838, new StringBuilder().append(" ").append(Class26.aString351).append(" ").toString(), Class240.anInt2704 * 697885143, 59, -1, 0L, i_18_, i_19_, true, false, (long) (i_18_ << 32 | i_19_), true, -1555484950);
							else
								Class144.method1587((byte) 4);
						} else {
							if (Class396.aBoolean5196)
								Class234.method2174((Tradution.aClass470_5910.method6049(Class321.aClass429_3357, -875414210)), "", -1, 60, -1, 0L, i_18_, i_19_, true, false, (long) (i_18_ << 32 | i_19_), true, -1698149123);
							Class234.method2174(Class82_Sub6.aString6845, "", client.anInt8822 * -1471730241, 23, -1, 0L, i_18_, i_19_, true, false, (long) (i_18_ << 32 | i_19_), true, -1114825452);
						}
					}
				}
				Class324 class324 = (client.aClass283_8716.method2675(-1611682495).aClass324_3528);
				int i_33_ = i;
				int i_34_ = i_14_;
				List list = class324.aList3448;
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Class335 class335 = (Class335) iterator.next();
					if (!client.aBoolean8674 && ((Class287.myPlayer.plane) != class335.aClass365_Sub1_3616.plane)) {
						if (i_15_ == 202437353) {
							/* empty */
						}
					} else if (!class335.method4084(class_ra, i_33_, i_34_, 1628119840)) {
						if (i_15_ == 202437353)
							break;
					} else {
						boolean bool = false;
						boolean bool_35_ = false;
						int i_36_;
						int i_37_;
						if (class335.aClass365_Sub1_3616 instanceof Class365_Sub1_Sub1) {
							i_36_ = ((Class365_Sub1_Sub1) class335.aClass365_Sub1_3616).aShort9798;
							i_37_ = ((Class365_Sub1_Sub1) class335.aClass365_Sub1_3616).aShort9795;
						} else {
							Class217 class217 = (class335.aClass365_Sub1_3616.method4337().aClass217_2599);
							i_36_ = (int) class217.aFloat2451 >> 9;
							i_37_ = (int) class217.aFloat2454 >> 9;
						}
						if (class335.aClass365_Sub1_3616 instanceof Player) {
							Player class365_sub1_sub1_sub2_sub2 = ((Player) class335.aClass365_Sub1_3616);
							int i_38_ = class365_sub1_sub1_sub2_sub2.getSize();
							Class217 class217 = (class365_sub1_sub1_sub2_sub2.method4337().aClass217_2599);
							if ((0 == (i_38_ & 0x1) && 0 == ((int) class217.aFloat2451 & 0x1ff) && ((int) class217.aFloat2454 & 0x1ff) == 0) || ((i_38_ & 0x1) == 1 && (((int) class217.aFloat2451 & 0x1ff) == 256) && 256 == ((int) class217.aFloat2454 & 0x1ff))) {
								int i_39_ = ((int) class217.aFloat2451 - (class365_sub1_sub1_sub2_sub2.getSize() - 1 << 8));
								int i_40_ = ((int) class217.aFloat2454 - (class365_sub1_sub1_sub2_sub2.getSize() - 1 << 8));
								for (int i_41_ = 0; i_41_ < -1230451913 * client.anInt8703; i_41_++) {
									Class298_Sub29 class298_sub29 = ((Class298_Sub29) (client.npcs.get((long) client.anIntArray8699[i_41_])));
									if (null == class298_sub29) {
										if (i_15_ == 202437353) {
											/* empty */
										}
									} else {
										NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
										if (443738891 * client.anInt8884 != (class365_sub1_sub1_sub2_sub1.anInt10070) * 335731285) {
											if (!class365_sub1_sub1_sub2_sub1.aBoolean10123) {
												if (i_15_ == 202437353) {
													/* empty */
												}
											} else {
												Class217 class217_42_ = (class365_sub1_sub1_sub2_sub1.method4337().aClass217_2599);
												int i_43_ = ((int) (class217_42_.aFloat2451) - (((class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187) * -2095128707) - 1 << 8));
												int i_44_ = ((int) (class217_42_.aFloat2454) - ((-2095128707 * (class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187)) - 1 << 8));
												if (i_43_ >= i_39_ && (((class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187) * -2095128707) <= ((class365_sub1_sub1_sub2_sub2.getSize()) - (i_43_ - i_39_ >> 9))) && i_44_ >= i_40_ && (((class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187) * -2095128707) <= ((class365_sub1_sub1_sub2_sub2.getSize()) - (i_44_ - i_40_ >> 9)))) {
													Class140.method1555(class365_sub1_sub1_sub2_sub1, ((Class287.myPlayer.plane) != (class335.aClass365_Sub1_3616.plane)), (byte) -10);
													class365_sub1_sub1_sub2_sub1.anInt10070 = (-339947553 * client.anInt8884);
												}
											}
										}
									}
								}
								int i_45_ = 1168366243 * Class10.anInt129;
								int[] is = Class10.anIntArray135;
								for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
									Player class365_sub1_sub1_sub2_sub2_47_ = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_46_]]);
									if ((null != class365_sub1_sub1_sub2_sub2_47_) && (443738891 * client.anInt8884 != (335731285 * (class365_sub1_sub1_sub2_sub2_47_.anInt10070))) && (class365_sub1_sub1_sub2_sub2 != class365_sub1_sub1_sub2_sub2_47_)) {
										if (!class365_sub1_sub1_sub2_sub2_47_.aBoolean10123) {
											if (i_15_ == 202437353)
												return;
										} else {
											Class217 class217_48_ = (class365_sub1_sub1_sub2_sub2_47_.method4337().aClass217_2599);
											int i_49_ = ((int) (class217_48_.aFloat2451) - ((class365_sub1_sub1_sub2_sub2_47_.getSize()) - 1 << 8));
											int i_50_ = ((int) (class217_48_.aFloat2454) - ((class365_sub1_sub1_sub2_sub2_47_.getSize()) - 1 << 8));
											if (i_49_ >= i_39_ && (class365_sub1_sub1_sub2_sub2_47_.getSize() <= ((class365_sub1_sub1_sub2_sub2.getSize()) - (i_49_ - i_39_ >> 9))) && i_50_ >= i_40_ && (class365_sub1_sub1_sub2_sub2_47_.getSize() <= ((class365_sub1_sub1_sub2_sub2.getSize()) - (i_50_ - i_40_ >> 9)))) {
												Class298_Sub47.method3535(class365_sub1_sub1_sub2_sub2_47_, ((Class287.myPlayer.plane) != (class335.aClass365_Sub1_3616.plane)), 875975417);
												class365_sub1_sub1_sub2_sub2_47_.anInt10070 = (client.anInt8884 * -339947553);
											}
										}
									}
								}
							}
							if (443738891 * client.anInt8884 == 335731285 * (class365_sub1_sub1_sub2_sub2.anInt10070)) {
								if (i_15_ == 202437353) {
									/* empty */
								}
								continue;
							}
							Class298_Sub47.method3535(class365_sub1_sub1_sub2_sub2, ((Class287.myPlayer.plane) != class335.aClass365_Sub1_3616.plane), -554283505);
							class365_sub1_sub1_sub2_sub2.anInt10070 = -339947553 * client.anInt8884;
						}
						if (class335.aClass365_Sub1_3616 instanceof NPC) {
							NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class335.aClass365_Sub1_3616);
							if (null != (class365_sub1_sub1_sub2_sub1.aClass503_10190)) {
								Class217 class217 = (class365_sub1_sub1_sub2_sub1.method4337().aClass217_2599);
								if ((0 == ((-2095128707 * (class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187)) & 0x1) && 0 == ((int) class217.aFloat2451 & 0x1ff) && (((int) class217.aFloat2454 & 0x1ff) == 0)) || (((-2095128707 * (class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187)) & 0x1) == 1 && (((int) class217.aFloat2451 & 0x1ff) == 256) && (((int) class217.aFloat2454 & 0x1ff) == 256))) {
									int i_51_ = ((int) class217.aFloat2451 - (((-2095128707 * (class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187)) - 1) << 8));
									int i_52_ = ((int) class217.aFloat2454 - (((class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187) * -2095128707) - 1 << 8));
									for (int i_53_ = 0; (i_53_ < client.anInt8703 * -1230451913); i_53_++) {
										Class298_Sub29 class298_sub29 = ((Class298_Sub29) (client.npcs.get((long) client.anIntArray8699[i_53_])));
										if (class298_sub29 == null) {
											if (i_15_ == 202437353) {
												/* empty */
											}
										} else {
											NPC class365_sub1_sub1_sub2_sub1_54_ = ((NPC) (class298_sub29.anObject7366));
											if (((335731285 * (class365_sub1_sub1_sub2_sub1_54_.anInt10070)) != (client.anInt8884 * 443738891)) && (class365_sub1_sub1_sub2_sub1_54_ != class365_sub1_sub1_sub2_sub1)) {
												if (!class365_sub1_sub1_sub2_sub1_54_.aBoolean10123) {
													if (i_15_ == 202437353)
														throw new IllegalStateException();
												} else {
													Class217 class217_55_ = (class365_sub1_sub1_sub2_sub1_54_.method4337().aClass217_2599);
													int i_56_ = ((int) (class217_55_.aFloat2451) - (((class365_sub1_sub1_sub2_sub1_54_.aClass503_10190.anInt6187) * -2095128707) - 1 << 8));
													int i_57_ = ((int) (class217_55_.aFloat2454) - (((-2095128707 * (class365_sub1_sub1_sub2_sub1_54_.aClass503_10190.anInt6187)) - 1) << 8));
													if (i_56_ >= i_51_ && ((-2095128707 * (class365_sub1_sub1_sub2_sub1_54_.aClass503_10190.anInt6187)) <= (((class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187) * -2095128707) - ((i_56_ - i_51_) >> 9))) && i_57_ >= i_52_ && ((-2095128707 * (class365_sub1_sub1_sub2_sub1_54_.aClass503_10190.anInt6187)) <= ((-2095128707 * (class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187)) - ((i_57_ - i_52_) >> 9)))) {
														Class140.method1555(class365_sub1_sub1_sub2_sub1_54_, ((class335.aClass365_Sub1_3616.plane) != (Class287.myPlayer.plane)), (byte) -62);
														class365_sub1_sub1_sub2_sub1_54_.anInt10070 = (-339947553 * (client.anInt8884));
													}
												}
											}
										}
									}
									int i_58_ = 1168366243 * Class10.anInt129;
									int[] is = Class10.anIntArray135;
									for (int i_59_ = 0; i_59_ < i_58_; i_59_++) {
										Player class365_sub1_sub1_sub2_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[is[i_59_]]);
										if ((null != class365_sub1_sub1_sub2_sub2) && ((335731285 * (class365_sub1_sub1_sub2_sub2.anInt10070)) != (client.anInt8884 * 443738891))) {
											if (!class365_sub1_sub1_sub2_sub2.aBoolean10123) {
												if (i_15_ == 202437353)
													return;
											} else {
												Class217 class217_60_ = (class365_sub1_sub1_sub2_sub2.method4337().aClass217_2599);
												int i_61_ = ((int) (class217_60_.aFloat2451) - ((class365_sub1_sub1_sub2_sub2.getSize()) - 1 << 8));
												int i_62_ = ((int) (class217_60_.aFloat2454) - ((class365_sub1_sub1_sub2_sub2.getSize()) - 1 << 8));
												if (i_61_ >= i_51_ && ((class365_sub1_sub1_sub2_sub2.getSize()) <= (((class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187) * -2095128707) - (i_61_ - i_51_ >> 9))) && i_62_ >= i_52_ && ((class365_sub1_sub1_sub2_sub2.getSize()) <= ((-2095128707 * (class365_sub1_sub1_sub2_sub1.aClass503_10190.anInt6187)) - (i_62_ - i_52_ >> 9)))) {
													Class298_Sub47.method3535(class365_sub1_sub1_sub2_sub2, ((class335.aClass365_Sub1_3616.plane) != (Class287.myPlayer.plane)), 1713781703);
													class365_sub1_sub1_sub2_sub2.anInt10070 = (-339947553 * client.anInt8884);
												}
											}
										}
									}
								}
								if ((class365_sub1_sub1_sub2_sub1.anInt10070 * 335731285) == 443738891 * client.anInt8884) {
									if (i_15_ == 202437353)
										throw new IllegalStateException();
									continue;
								}
								Class140.method1555(class365_sub1_sub1_sub2_sub1, ((Class287.myPlayer.plane) != (class335.aClass365_Sub1_3616.plane)), (byte) -73);
								class365_sub1_sub1_sub2_sub1.anInt10070 = client.anInt8884 * -339947553;
							}
						}
						if (class335.aClass365_Sub1_3616 instanceof Class365_Sub1_Sub4_Sub1) {
							int i_63_ = -1760580017 * class341.gameSceneBaseX + i_36_;
							int i_64_ = 283514611 * class341.gameSceneBaseY + i_37_;
							Class298_Sub2 class298_sub2 = ((Class298_Sub2) (client.groundItems.get((long) ((class335.aClass365_Sub1_3616.plane) << 28 | i_64_ << 14 | i_63_))));
							if (null != class298_sub2) {
								int i_65_ = 0;
								Class298_Sub12 class298_sub12 = ((Class298_Sub12) class298_sub2.aClass453_7166.method5942(-1921101370));
								while (class298_sub12 != null) {
									ItemDefinitions class468 = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions((1768239597 * class298_sub12.anInt7257)));
									int i_66_;
									if (class468.aBoolean5771)
										i_66_ = class468.anInt5763 * 292187293;
									else if (class468.aBoolean5731)
										i_66_ = (Class144.aClass381_1563.anInt4110) * 1295181471;
									else
										i_66_ = 363537303 * (Class144.aClass381_1563.anInt4117);
									if (client.aBoolean8835 && ((class335.aClass365_Sub1_3616.plane) == (Class287.myPlayer.plane))) {
										Class497 class497 = ((Class132.anInt1508 * 831522399 != -1) ? (Class92.aClass504_905.method6251((Class132.anInt1508 * 831522399), 1640464070)) : null);
										if (0 != ((Linkable.anInt3192 * -112110875) & 0x1) && (null == class497 || ((class468.method6037((831522399 * Class132.anInt1508), (-388931549 * class497.anInt6100), -2028636758)) != (-388931549 * (class497.anInt6100)))))
											Class234.method2174(client.aString8838, new StringBuilder().append(client.aString8754).append(" ").append(Class26.aString351).append(" ").append(Class285.method2709(i_66_, -1803338083)).append(class468.aString5707).toString(), (Class240.anInt2704 * 697885143), 17, -1, (long) ((class298_sub12.anInt7257) * 1768239597), i_36_, i_37_, true, false, (long) i_65_, false, -1282887596);
									}
									if (class335.aClass365_Sub1_3616.plane == (Class287.myPlayer.plane)) {
										String[] strings = class468.aStringArray5723;
										for (int i_67_ = strings.length - 1; i_67_ >= 0; i_67_--) {
											if (null != strings[i_67_]) {
												int i_68_ = 0;
												int i_69_ = (client.anInt8690 * 1395924385);
												if (0 == i_67_)
													i_68_ = 18;
												if (i_67_ == 1)
													i_68_ = 19;
												if (i_67_ == 2)
													i_68_ = 20;
												if (3 == i_67_)
													i_68_ = 21;
												if (i_67_ == 4)
													i_68_ = 22;
												if (i_67_ == 5)
													i_68_ = 1004;
												if (i_67_ == (1109145023 * class468.anInt5729))
													i_69_ = (1605315453 * (class468.anInt5725));
												if ((class468.anInt5730 * 693471665) == i_67_)
													i_69_ = (class468.anInt5703 * -1818170233);
												Class234.method2174(strings[i_67_], new StringBuilder().append(Class285.method2709(i_66_, -1300852022)).append(class468.aString5707).toString(), i_69_, i_68_, -1, (long) ((class298_sub12.anInt7257) * 1768239597), i_36_, i_37_, true, false, (long) i_65_, false, -1707817875);
											}
										}
									}
									class298_sub12 = ((Class298_Sub12) class298_sub2.aClass453_7166.method5947(293661745));
									i_65_++;
								}
							}
						}
						if (class335.aClass365_Sub1_3616 instanceof Interface3) {
							Interface3 interface3 = (Interface3) class335.aClass365_Sub1_3616;
							ObjectDefinitions class432 = (client.aClass283_8716.method2641(-151154213).getObjectDefinitions(interface3.method32((byte) 32)));
							if (class432.anIntArray5366 != null)
								class432 = class432.method5777((Class128.aClass148_6331), 2026923830);
							if (class432 == null) {
								if (i_15_ == 202437353)
									break;
							} else {
								if (client.aBoolean8835 && (class335.aClass365_Sub1_3616.plane == (Class287.myPlayer.plane))) {
									Class497 class497 = (831522399 * Class132.anInt1508 != -1 ? (Class92.aClass504_905.method6251(Class132.anInt1508 * 831522399, -616098570)) : null);
									if (0 != (Linkable.anInt3192 * -112110875 & 0x4) && (class497 == null || ((class432.method5776((831522399 * Class132.anInt1508), (class497.anInt6100 * -388931549), (byte) 2)) != (-388931549 * class497.anInt6100))))
										Class234.method2174(client.aString8838, new StringBuilder().append(client.aString8754).append(" ").append(Class26.aString351).append(" ").append(Class285.method2709(65535, -1704073338)).append(class432.name).toString(), Class240.anInt2704 * 697885143, 2, -1, Class119.method1301(interface3, i_36_, i_37_, 2139321433), i_36_, i_37_, true, false, (long) interface3.hashCode(), false, -978621849);
								}
								if (class335.aClass365_Sub1_3616.plane == (Class287.myPlayer.plane)) {
									String[] strings = class432.aStringArray5394;
									if (strings != null) {
										for (int i_70_ = strings.length - 1; i_70_ >= 0; i_70_--) {
											if (strings[i_70_] != null) {
												int i_71_ = 0;
												int i_72_ = (client.anInt8690 * 1395924385);
												if (0 == i_70_)
													i_71_ = 3;
												if (1 == i_70_)
													i_71_ = 4;
												if (i_70_ == 2)
													i_71_ = 5;
												if (i_70_ == 3)
													i_71_ = 6;
												if (i_70_ == 4)
													i_71_ = 1001;
												if (i_70_ == 5)
													i_71_ = 1002;
												if (i_70_ == (class432.anInt5397 * -1412413471))
													i_72_ = (1501072109 * (class432.anInt5436));
												if (i_70_ == (class432.anInt5398 * 1498416223))
													i_72_ = (class432.anInt5364 * -143998181);
												Class234.method2174(strings[i_70_], new StringBuilder().append(Class285.method2709(65535, -1882925758)).append(class432.name).toString(), i_72_, i_71_, -1, (Class119.method1301(interface3, i_36_, i_37_, 2141756436)), i_36_, i_37_, true, false, (long) interface3.hashCode(), false, -1317659949);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dz.e(").append(')').toString());
		}
	}

	static final void method1056(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			int i_73_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			boolean bool = 1 == (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			int i_74_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]);
			boolean bool_75_ = ((((ClientScript2) class403).anIntArray5244[3 + 681479919 * ((ClientScript2) class403).anInt5239]) == 1);
			Class298_Sub32_Sub20.method3263(i_73_, bool, i_74_, bool_75_, 1687031105);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dz.alr(").append(')').toString());
		}
	}

	static int method1057(int i, int i_76_, int i_77_) {
		try {
			int i_78_ = i >> 31 & i_76_ - 1;
			return i_78_ + (i + (i >>> 31)) % i_76_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dz.r(").append(')').toString());
		}
	}

	static void method1058(int i, String string, byte i_79_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(3, (long) i);
			class298_sub37_sub12.method3449((byte) 104);
			((Class298_Sub37_Sub12) class298_sub37_sub12).aString9611 = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dz.ah(").append(')').toString());
		}
	}
}
