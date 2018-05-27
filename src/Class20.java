
/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.List;

public class Class20 {
	static Class294 aClass294_155;
	static int anInt156;
	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_157;
	static Class384 aClass384_158;
	static final int anInt159 = 31;
	static final int anInt160 = 31;
	public static boolean aBool161;
	static boolean aBool162;
	static Class282_Sub50_Sub15 aClass282_Sub50_Sub15_163;
	static SoftCache aClass229_164;
	static final int anInt165 = 1;
	static final int anInt166 = 2;
	static int anInt167;
	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_168;
	public static int anInt169;
	public static int anInt170;
	static NodeCollection aClass482_171;
	static IterableNodeMap aClass465_172;
	static final int anInt173 = 3;
	static NodeCollection aClass482_174;
	static NodeCollection aClass482_175;
	static int anInt176;
	static int[] anIntArray177;
	static int anInt178 = 426037136;
	static int anInt179;
	static int anInt180;
	static int anInt181;
	static Class477 aClass477_182;
	static Class118 aClass118_183;
	static int anInt184;
	static Class384 aClass384_185;
	static int anInt186;
	public static boolean aBool187;
	public static int anInt188;
	static final int anInt189 = 520;
	static final int anInt190 = 0;
	static SoftCache aClass229_191;
	static final int anInt192 = 412;
	static final int anInt193 = 0;
	static float[] aFloatArray194;
	static int anInt195;
	static final int anInt196 = 1;
	static final int anInt197 = 2;
	public static int anInt198;
	static final int anInt199 = 4;
	static final int anInt200 = 5;
	static final int anInt201 = 6;
	static final int anInt202 = 7;
	static final int anInt203 = 8;
	
	static String method588(int i, int i_0_) {
		int i_1_ = i_0_ - i;
		if (i_1_ < -9)
			return Class59.method1163(16711680, 619010179);
		if (i_1_ < -6)
			return Class59.method1163(16723968, 619010179);
		if (i_1_ < -3)
			return Class59.method1163(16740352, 619010179);
		if (i_1_ < 0)
			return Class59.method1163(16756736, 619010179);
		if (i_1_ > 9)
			return Class59.method1163(65280, 619010179);
		if (i_1_ > 6)
			return Class59.method1163(4259584, 619010179);
		if (i_1_ > 3)
			return Class59.method1163(8453888, 619010179);
		if (i_1_ > 0)
			return Class59.method1163(12648192, 619010179);
		return Class59.method1163(16776960, 619010179);
	}

	static {
		aBool161 = false;
		aBool162 = false;
		aClass282_Sub50_Sub15_163 = null;
		anInt167 = 0;
		anInt169 = 0;
		anInt170 = 0;
		aClass482_171 = new NodeCollection();
		aClass465_172 = new IterableNodeMap(16);
		aClass477_182 = new Class477();
		aClass482_174 = new NodeCollection();
		aClass482_175 = new NodeCollection();
		aClass229_164 = new SoftCache(30);
		aClass118_183 = null;
		anInt195 = -1511257025;
		anInt179 = 248935111;
		anInt180 = -797571487;
		anInt181 = 2139368457;
		anInt176 = 0;
		anInt184 = 0;
		aClass384_158 = null;
		aClass384_185 = new Class384();
		aClass294_155 = new Class294();
		aBool187 = false;
		anInt156 = 0;
		anInt198 = -1670293651;
		aClass229_191 = new SoftCache(8);
		aFloatArray194 = new float[4];
	}

	static boolean method589() {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5873, (byte) 17);
	}

	static boolean method590() {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5877, (byte) 13);
	}

	static boolean method591() {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5877, (byte) 19);
	}

	static boolean method592() {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5877, (byte) -9);
	}

	public static boolean method593(int i) {
		for (Class282_Sub50_Sub7 class282_sub50_sub7 = (Class282_Sub50_Sub7) aClass482_171.head((byte) 121); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(-612215960))) {
			if (Class237.method3989((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225), (byte) 0) && (long) i == (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584)))
				return true;
		}
		return false;
	}

	static boolean method594(Class232 class232) {
		return Class6.method302(class232, null, 365602936);
	}

	public static Class282_Sub50_Sub7 method595() {
		return Class96_Sub23.aClass282_Sub50_Sub7_9445;
	}

	static boolean method596(Class232 class232) {
		return Class6.method302(class232, null, 1806764997);
	}

	static boolean method597(Interface17 interface17, Class282_Sub53 class282_sub53) {
		return (interface17 != null && interface17.method127(class282_sub53, client.anInterface16Array7298, client.anInt7196 * -809233249, Class96_Sub21.aClass199_9438, (byte) 70));
	}

	static void method598(GraphicalRenderer class505, int i, int i_2_) {
		if (i >= 0 && i_2_ >= 0 && aClass384_158 != null) {
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1164148862);
			Class384 class384 = class505.method8449();
			class505.method8424(aClass384_158);
			class505.method8457(aClass294_155);
			class505.r(anInt180 * -1747787169, 1607392711 * anInt181, anInt180 * -1747787169 + anInt176 * -2026336709, anInt184 * 919355353 + 1607392711 * anInt181);
			class505.method8617(-1747787169 * anInt180, 1607392711 * anInt181, anInt176 * -2026336709, 919355353 * anInt184);
			class384.method6522(aClass294_155);
			class384.method6523(aClass384_158);
			class384.method6524();
			int i_3_ = i - -1747787169 * anInt180;
			int i_4_ = i_2_ - anInt181 * 1607392711;
			if (IndexLoaders.MAP_REGION_DECODER.method4430(-1268370188) != null && (!client.aBool7344 || (1310510077 * Class506.anInt5858 & 0x40) != 0)) {
				int i_5_ = -1;
				int i_6_ = -1;
				float f = (2.0F * (float) i_3_ / (float) (anInt176 * -2026336709) - 1.0F);
				float f_7_ = (2.0F * (float) i_4_ / (float) (919355353 * anInt184) - 1.0F);
				class384.method6527(f, f_7_, -1.0F, aFloatArray194);
				float f_8_ = aFloatArray194[0] / aFloatArray194[3];
				float f_9_ = aFloatArray194[1] / aFloatArray194[3];
				float f_10_ = aFloatArray194[2] / aFloatArray194[3];
				class384.method6527(f, f_7_, 1.0F, aFloatArray194);
				float f_11_ = aFloatArray194[0] / aFloatArray194[3];
				float f_12_ = aFloatArray194[1] / aFloatArray194[3];
				float f_13_ = aFloatArray194[2] / aFloatArray194[3];
				float f_14_ = Class4.method288(f_8_, f_9_, f_10_, f_11_, f_12_, f_13_, 4, -1694982146);
				if (f_14_ > 0.0F) {
					float f_15_ = f_11_ - f_8_;
					float f_16_ = f_13_ - f_10_;
					int i_17_ = (int) (f_15_ * f_14_ + f_8_);
					int i_18_ = (int) (f_14_ * f_16_ + f_10_);
					i_5_ = i_17_ + (Class84.myPlayer.method15805(828768449) - 1 << 8) >> 9;
					i_6_ = i_18_ + (Class84.myPlayer.method15805(828768449) - 1 << 8) >> 9;
					int i_19_ = Class84.myPlayer.aByte7967;
					if (i_19_ < 3 && ((IndexLoaders.MAP_REGION_DECODER.method4433(33386298).aByteArrayArrayArray3638[1][i_17_ >> 9][i_18_ >> 9]) & 0x2) != 0)
						i_19_++;
				}
				if (-1 != i_5_ && i_6_ != -1) {
					if (client.aBool7344 && 0 != (1310510077 * Class506.anInt5858 & 0x40)) {
						Class118 class118 = Index.method5694(Class7.anInt56 * 728544879, (client.anInt7345 * -1673073865), 42844230);
						if (class118 != null)
							PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(" ").append(Class2.aString17).append(" ").toString(), (Defaults8Loader.anInt5932 * -239192305), 59, -1, 0L, i_5_, i_6_, true, false, (long) (i_5_ << 32 | i_6_), true, -1239349727);
						else
							Class60.method1170(-609337146);
					} else {
						if (Class96_Sub6.aBool9173)
							PlayerAppearance.method4032((Message.FACE_HERE.translate(Class223.CURRENT_LANGUAGE, -1870608616)), "", -1, 60, -1, 0L, i_5_, i_6_, true, false, (long) (i_5_ << 32 | i_6_), true, -1523332904);
						PlayerAppearance.method4032(Class85.aString817, "", 460745521 * client.anInt7311, 23, -1, 0L, i_5_, i_6_, true, false, (long) (i_5_ << 32 | i_6_), true, -1159966194);
					}
				}
			}
			Login class284 = IndexLoaders.MAP_REGION_DECODER.method4430(-1846463935).aClass284_2648;
			int i_20_ = i;
			int i_21_ = i_2_;
			List list = class284.aList3388;
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class285 class285 = (Class285) iterator.next();
				if ((client.aBool7372 || (Class84.myPlayer.aByte7967 == class285.aClass521_Sub1_3391.aByte7967)) && class285.method5019(class505, i_20_, i_21_, 491485000)) {
					boolean bool = false;
					boolean bool_22_ = false;
					int i_23_;
					int i_24_;
					if (class285.aClass521_Sub1_3391 instanceof Class521_Sub1_Sub1) {
						i_23_ = ((Class521_Sub1_Sub1) class285.aClass521_Sub1_3391).aShort9458;
						i_24_ = ((Class521_Sub1_Sub1) class285.aClass521_Sub1_3391).aShort9456;
					} else {
						Class385 class385 = (class285.aClass521_Sub1_3391.method11166().aClass385_3595);
						i_23_ = (int) class385.aFloat4671 >> 9;
						i_24_ = (int) class385.aFloat4673 >> 9;
					}
					if (class285.aClass521_Sub1_3391 instanceof Player) {
						Player class521_sub1_sub1_sub2_sub1 = ((Player) class285.aClass521_Sub1_3391);
						int i_25_ = class521_sub1_sub1_sub2_sub1.method15805(828768449);
						Class385 class385 = (class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
						if ((0 == (i_25_ & 0x1) && 0 == ((int) class385.aFloat4671 & 0x1ff) && 0 == ((int) class385.aFloat4673 & 0x1ff)) || (1 == (i_25_ & 0x1) && 256 == ((int) class385.aFloat4671 & 0x1ff) && (((int) class385.aFloat4673 & 0x1ff) == 256))) {
							int i_26_ = ((int) class385.aFloat4671 - (class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1 << 8));
							int i_27_ = ((int) class385.aFloat4673 - (class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1 << 8));
							for (int i_28_ = 0; i_28_ < client.anInt7211 * -685729279; i_28_++) {
								Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) client.anIntArray7212[i_28_])));
								if (class282_sub47 != null) {
									NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
									if (((class521_sub1_sub1_sub2_sub2.anInt10375) * 717008059 != client.cycles * -1809259861) && (class521_sub1_sub1_sub2_sub2.aBool10318)) {
										Class385 class385_29_ = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
										int i_30_ = ((int) class385_29_.aFloat4671 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
										int i_31_ = ((int) class385_29_.aFloat4673 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
										if (i_30_ >= i_26_ && (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_30_ - i_26_ >> 9))) && i_31_ >= i_27_ && (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_31_ - i_27_ >> 9)))) {
											WorldMapAreaDefs.method3736(class521_sub1_sub1_sub2_sub2, ((Class84.myPlayer.aByte7967) != (class285.aClass521_Sub1_3391.aByte7967)), 1807772467);
											class521_sub1_sub1_sub2_sub2.anInt10375 = (client.cycles * 1977662161);
										}
									}
								}
							}
							int i_32_ = Class197.NUM_PLAYER_INDICES * -963499271;
							int[] is = Class197.PLAYER_INDICES;
							for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
								Player class521_sub1_sub1_sub2_sub1_34_ = (client.players[is[i_33_]]);
								if (class521_sub1_sub1_sub2_sub1_34_ != null && ((class521_sub1_sub1_sub2_sub1_34_.anInt10375) * 717008059 != -1809259861 * client.cycles) && (class521_sub1_sub1_sub2_sub1 != class521_sub1_sub1_sub2_sub1_34_) && (class521_sub1_sub1_sub2_sub1_34_.aBool10318)) {
									Class385 class385_35_ = (class521_sub1_sub1_sub2_sub1_34_.method11166().aClass385_3595);
									int i_36_ = ((int) class385_35_.aFloat4671 - (class521_sub1_sub1_sub2_sub1_34_.method15805(828768449) - 1 << 8));
									int i_37_ = ((int) class385_35_.aFloat4673 - (class521_sub1_sub1_sub2_sub1_34_.method15805(828768449) - 1 << 8));
									if (i_36_ >= i_26_ && (class521_sub1_sub1_sub2_sub1_34_.method15805(828768449) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_36_ - i_26_ >> 9))) && i_37_ >= i_27_ && (class521_sub1_sub1_sub2_sub1_34_.method15805(828768449) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_37_ - i_27_ >> 9)))) {
										Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1_34_, ((class285.aClass521_Sub1_3391.aByte7967) != (Class84.myPlayer.aByte7967)), 1557506355);
										class521_sub1_sub1_sub2_sub1_34_.anInt10375 = client.cycles * 1977662161;
									}
								}
							}
						}
						if (717008059 * class521_sub1_sub1_sub2_sub1.anInt10375 == client.cycles * -1809259861)
							continue;
						Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1, (class285.aClass521_Sub1_3391.aByte7967 != (Class84.myPlayer.aByte7967)), 1557506355);
						class521_sub1_sub1_sub2_sub1.anInt10375 = 1977662161 * client.cycles;
					}
					if (class285.aClass521_Sub1_3391 instanceof NPC) {
						NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class285.aClass521_Sub1_3391);
						if (null != class521_sub1_sub1_sub2_sub2.aClass409_10580) {
							Class385 class385 = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
							if ((0 == (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) & 0x1) && 0 == ((int) class385.aFloat4671 & 0x1ff) && 0 == ((int) class385.aFloat4673 & 0x1ff)) || (1 == ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) & 0x1) && 256 == ((int) class385.aFloat4671 & 0x1ff) && 256 == ((int) class385.aFloat4673 & 0x1ff))) {
								int i_38_ = ((int) class385.aFloat4671 - (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) - 1 << 8));
								int i_39_ = ((int) class385.aFloat4673 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
								for (int i_40_ = 0; i_40_ < client.anInt7211 * -685729279; i_40_++) {
									Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) client.anIntArray7212[i_40_])));
									if (null != class282_sub47) {
										NPC class521_sub1_sub1_sub2_sub2_41_ = ((NPC) class282_sub47.anObject8068);
										if (((717008059 * (class521_sub1_sub1_sub2_sub2_41_.anInt10375)) != -1809259861 * client.cycles) && (class521_sub1_sub1_sub2_sub2 != class521_sub1_sub1_sub2_sub2_41_) && (class521_sub1_sub1_sub2_sub2_41_.aBool10318)) {
											Class385 class385_42_ = (class521_sub1_sub1_sub2_sub2_41_.method11166().aClass385_3595);
											int i_43_ = ((int) (class385_42_.aFloat4671) - ((1203434505 * (class521_sub1_sub1_sub2_sub2_41_.aClass409_10580.anInt4858)) - 1 << 8));
											int i_44_ = ((int) (class385_42_.aFloat4673) - (((class521_sub1_sub1_sub2_sub2_41_.aClass409_10580.anInt4858) * 1203434505) - 1 << 8));
											if (i_43_ >= i_38_ && ((1203434505 * (class521_sub1_sub1_sub2_sub2_41_.aClass409_10580.anInt4858)) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_43_ - i_38_ >> 9))) && i_44_ >= i_39_ && ((class521_sub1_sub1_sub2_sub2_41_.aClass409_10580.anInt4858) * 1203434505 <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_44_ - i_39_ >> 9)))) {
												WorldMapAreaDefs.method3736(class521_sub1_sub1_sub2_sub2_41_, ((Class84.myPlayer.aByte7967) != (class285.aClass521_Sub1_3391.aByte7967)), 1277108625);
												class521_sub1_sub1_sub2_sub2_41_.anInt10375 = (1977662161 * client.cycles);
											}
										}
									}
								}
								int i_45_ = Class197.NUM_PLAYER_INDICES * -963499271;
								int[] is = Class197.PLAYER_INDICES;
								for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
									Player class521_sub1_sub1_sub2_sub1 = (client.players[is[i_46_]]);
									if (null != class521_sub1_sub1_sub2_sub1 && (-1809259861 * client.cycles != (717008059 * (class521_sub1_sub1_sub2_sub1.anInt10375))) && (class521_sub1_sub1_sub2_sub1.aBool10318)) {
										Class385 class385_47_ = (class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
										int i_48_ = ((int) class385_47_.aFloat4671 - ((class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1) << 8));
										int i_49_ = ((int) class385_47_.aFloat4673 - ((class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1) << 8));
										if (i_48_ >= i_38_ && (class521_sub1_sub1_sub2_sub1.method15805(828768449) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_48_ - i_38_ >> 9))) && i_49_ >= i_39_ && (class521_sub1_sub1_sub2_sub1.method15805(828768449) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_49_ - i_39_ >> 9)))) {
											Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1, ((class285.aClass521_Sub1_3391.aByte7967) != (Class84.myPlayer.aByte7967)), 1557506355);
											class521_sub1_sub1_sub2_sub1.anInt10375 = (client.cycles * 1977662161);
										}
									}
								}
							}
							if ((class521_sub1_sub1_sub2_sub2.anInt10375 * 717008059) == -1809259861 * client.cycles)
								continue;
							WorldMapAreaDefs.method3736(class521_sub1_sub1_sub2_sub2, ((Class84.myPlayer.aByte7967) != class285.aClass521_Sub1_3391.aByte7967), 1371104396);
							class521_sub1_sub1_sub2_sub2.anInt10375 = client.cycles * 1977662161;
						}
					}
					if (class285.aClass521_Sub1_3391 instanceof Class521_Sub1_Sub2_Sub1) {
						int i_50_ = class219.anInt2711 * 1948093437 + i_23_;
						int i_51_ = i_24_ + class219.anInt2712 * -1002240017;
						Class282_Sub29 class282_sub29 = ((Class282_Sub29) (client.aClass465_7414.method7754((long) ((class285.aClass521_Sub1_3391.aByte7967) << 28 | i_51_ << 14 | i_50_))));
						if (null != class282_sub29) {
							int i_52_ = 0;
							Class282_Sub34 class282_sub34 = ((Class282_Sub34) class282_sub29.aClass482_7708.method8065(-1956439030));
							while (class282_sub34 != null) {
								ItemDefinitions class425 = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(1964309863 * class282_sub34.anInt7853, 1579037315));
								int i_53_;
								if (class425.aBool5101)
									i_53_ = class425.anInt5102 * 712312847;
								else if (class425.members)
									i_53_ = -1519092215 * (Class149_Sub2.DEFAULTS_LOADER_7.anInt5880);
								else
									i_53_ = 725268415 * (Class149_Sub2.DEFAULTS_LOADER_7.anInt5881);
								if (client.aBool7344 && ((Class84.myPlayer.aByte7967) == (class285.aClass521_Sub1_3391.aByte7967))) {
									AttributeDefault class437 = ((Class96_Sub12.anInt9319 * -1605351655) != -1 ? (IndexLoaders.ITEM_DEFAULTS.method7069((-1605351655 * Class96_Sub12.anInt9319), (byte) 0)) : null);
									if ((Class506.anInt5858 * 1310510077 & 0x1) != 0 && (null == class437 || ((class425.method7099((Class96_Sub12.anInt9319 * -1605351655), (-1741480635 * class437.anInt5337), -1421720905)) != (class437.anInt5337 * -1741480635))))
										PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(i_53_, 619010179)).append(class425.aString5043).toString(), Defaults8Loader.anInt5932 * -239192305, 17, -1, (long) (class282_sub34.anInt7853 * 1964309863), i_23_, i_24_, true, false, (long) i_52_, false, -1530292481);
								}
								if (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967)) {
									String[] strings = class425.groundOptions;
									for (int i_54_ = strings.length - 1; i_54_ >= 0; i_54_--) {
										if (null != strings[i_54_]) {
											int i_55_ = 0;
											int i_56_ = client.anInt7342 * 452205213;
											if (0 == i_54_)
												i_55_ = 18;
											if (i_54_ == 1)
												i_55_ = 19;
											if (2 == i_54_)
												i_55_ = 20;
											if (3 == i_54_)
												i_55_ = 21;
											if (4 == i_54_)
												i_55_ = 22;
											if (5 == i_54_)
												i_55_ = 1004;
											if (i_54_ == (class425.anInt5059 * -934531831))
												i_56_ = (1152999273 * class425.anInt5055);
											if (i_54_ == (class425.anInt5060 * 1533030603))
												i_56_ = (class425.anInt5056 * -1540078225);
											PlayerAppearance.method4032(strings[i_54_], new StringBuilder().append(Class59.method1163(i_53_, 619010179)).append(class425.aString5043).toString(), i_56_, i_55_, -1, (long) (1964309863 * (class282_sub34.anInt7853)), i_23_, i_24_, true, false, (long) i_52_, false, -1582537973);
										}
									}
								}
								class282_sub34 = ((Class282_Sub34) class282_sub29.aClass482_7708.method8068((byte) 42));
								i_52_++;
							}
						}
					}
					if (class285.aClass521_Sub1_3391 instanceof Interface12) {
						Interface12 interface12 = (Interface12) class285.aClass521_Sub1_3391;
						ObjectDefinitions class478 = (IndexLoaders.MAP_REGION_DECODER.method4436(-1427151439).getObjectDefinitions(interface12.method84(-655062312), 65280));
						if (null != class478.anIntArray5650)
							class478 = class478.method8013((Class158_Sub1.aClass3_8507), (byte) -37);
						if (null != class478) {
							if (client.aBool7344 && (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967))) {
								AttributeDefault class437 = (-1 != (-1605351655 * Class96_Sub12.anInt9319) ? (IndexLoaders.ITEM_DEFAULTS.method7069((Class96_Sub12.anInt9319 * -1605351655), (byte) 0)) : null);
								if (0 != (1310510077 * Class506.anInt5858 & 0x4) && (class437 == null || ((class478.method7963((Class96_Sub12.anInt9319 * -1605351655), -1741480635 * class437.anInt5337, -511860685)) != (-1741480635 * class437.anInt5337))))
									PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(65535, 619010179)).append(class478.aString5638).toString(), Defaults8Loader.anInt5932 * -239192305, 2, -1, Class329.method5905(interface12, i_23_, i_24_, (byte) -46), i_23_, i_24_, true, false, (long) interface12.hashCode(), false, -1802021876);
							}
							if (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967)) {
								String[] strings = class478.options;
								if (null != strings) {
									for (int i_57_ = strings.length - 1; i_57_ >= 0; i_57_--) {
										if (strings[i_57_] != null) {
											int i_58_ = 0;
											int i_59_ = 452205213 * client.anInt7342;
											if (i_57_ == 0)
												i_58_ = 3;
											if (i_57_ == 1)
												i_58_ = 4;
											if (2 == i_57_)
												i_58_ = 5;
											if (i_57_ == 3)
												i_58_ = 6;
											if (4 == i_57_)
												i_58_ = 1001;
											if (i_57_ == 5)
												i_58_ = 1002;
											if (class478.anInt5705 * -176888381 == i_57_)
												i_59_ = (1362609543 * class478.anInt5665);
											if (570422367 * class478.anInt5670 == i_57_)
												i_59_ = (-305458077 * class478.anInt5666);
											PlayerAppearance.method4032(strings[i_57_], new StringBuilder().append(Class59.method1163(65535, 619010179)).append(class478.aString5638).toString(), i_59_, i_58_, -1, (Class329.method5905(interface12, i_23_, i_24_, (byte) -75)), i_23_, i_24_, true, false, (long) interface12.hashCode(), false, -2044400073);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static boolean method599(Interface17 interface17, Class282_Sub53 class282_sub53) {
		return (interface17 != null && interface17.method127(class282_sub53, client.anInterface16Array7298, client.anInt7196 * -809233249, Class96_Sub21.aClass199_9438, (byte) 19));
	}

	static boolean method600(Interface17 interface17, Class282_Sub53 class282_sub53) {
		return (interface17 != null && interface17.method127(class282_sub53, client.anInterface16Array7298, client.anInt7196 * -809233249, Class96_Sub21.aClass199_9438, (byte) 124));
	}

	public static void method601() {
		Class404.method6810(815286168);
		aBool161 = false;
		Class292.method5201(Class301.anInt3555 * 1742345613, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, (byte) 12);
		Class96_Sub23.aClass282_Sub50_Sub7_9445 = null;
		aClass282_Sub50_Sub7_168 = null;
	}

	static long method602(Interface12 interface12, int i, int i_60_) {
		long l = 4194304L;
		long l_61_ = -9223372036854775808L;
		ObjectDefinitions class478 = IndexLoaders.MAP_REGION_DECODER.method4436(-1976114082).getObjectDefinitions(interface12.method84(-683410427), 65280);
		long l_62_ = (long) (i | i_60_ << 7 | interface12.method89(564959344) << 14 | interface12.method92(-637046956) << 20 | 0x40000000);
		if (0 == -348507379 * class478.anInt5652)
			l_62_ |= l_61_;
		if (1 == -1062790731 * class478.anInt5687)
			l_62_ |= l;
		l_62_ |= (long) interface12.method84(307268526) << 32;
		return l_62_;
	}

	static int method603(Class282_Sub50_Sub15 class282_sub50_sub15, Class414 class414) {
		String string = Class75.method1354(class282_sub50_sub15, -938758900);
		return class414.method6947(string, Class115.aClass160Array1248, 682635809);
	}

	static void method604(String string, String string_63_, int i, int i_64_, int i_65_, long l, int i_66_, int i_67_, boolean bool, boolean bool_68_, long l_69_, boolean bool_70_) {
		if (!aBool161 && anInt169 * 2144330291 < 520) {
			i = -1 != i ? i : -1211259595 * client.anInt7427;
			Class282_Sub50_Sub7 class282_sub50_sub7 = new Class282_Sub50_Sub7(string, string_63_, i, i_64_, i_65_, l, i_66_, i_67_, bool, bool_68_, l_69_, bool_70_);
			Class361.method6269(class282_sub50_sub7, -1498808978);
		}
	}

	static void method605(Class282_Sub50_Sub15 class282_sub50_sub15, int i) {
		if (aBool161) {
			Class414 class414 = Class114.method1887(-697754114);
			int i_71_ = 0;
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7941((byte) 4)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7955(-1720693934))) {
				int i_72_ = Class282_Sub50_Sub17.method15507(class282_sub50_sub7, class414, 943671530);
				if (i_72_ > i_71_)
					i_71_ = i_72_;
			}
			i_71_ += 8;
			int i_73_ = ((997766473 * anInt178 * (((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 * 2026887253)) + 21);
			Class521_Sub1_Sub5_Sub1.anInt10526 = -628178221 * ((aBool187 ? 26 : 22) + (anInt178 * 997766473 * (2026887253 * ((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769)));
			int i_74_ = (1742345613 * Class301.anInt3555 + Class158_Sub2.anInt8975 * -13788709);
			if (i_71_ + i_74_ > Class349.anInt4083 * -418109423)
				i_74_ = 1742345613 * Class301.anInt3555 - i_71_;
			if (i_74_ < 0)
				i_74_ = 0;
			int i_75_ = aBool187 ? 1 + (20 + 397683159 * class414.anInt4978) : 31;
			int i_76_ = class414.anInt4978 * 397683159 + (i - i_75_) + 1;
			if (i_73_ + i_76_ > Class263.anInt3243 * -969250379)
				i_76_ = Class263.anInt3243 * -969250379 - i_73_;
			if (i_76_ < 0)
				i_76_ = 0;
			Class341.anInt3996 = -1046325159 * i_74_;
			Class282_Sub50_Sub2.anInt9471 = i_76_ * 442655807;
			Class96_Sub3.anInt8518 = i_71_ * 694445155;
			aClass282_Sub50_Sub15_163 = class282_sub50_sub15;
		}
	}

	static void method606(Class282_Sub50_Sub15 class282_sub50_sub15, int i) {
		if (aBool161) {
			Class414 class414 = Class114.method1887(834867526);
			int i_77_ = 0;
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7941((byte) 4)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7955(-1746572086))) {
				int i_78_ = Class282_Sub50_Sub17.method15507(class282_sub50_sub7, class414, 943671530);
				if (i_78_ > i_77_)
					i_77_ = i_78_;
			}
			i_77_ += 8;
			int i_79_ = ((997766473 * anInt178 * (((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 * 2026887253)) + 21);
			Class521_Sub1_Sub5_Sub1.anInt10526 = -628178221 * ((aBool187 ? 26 : 22) + (anInt178 * 997766473 * (2026887253 * ((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769)));
			int i_80_ = (1742345613 * Class301.anInt3555 + Class158_Sub2.anInt8975 * -13788709);
			if (i_77_ + i_80_ > Class349.anInt4083 * -418109423)
				i_80_ = 1742345613 * Class301.anInt3555 - i_77_;
			if (i_80_ < 0)
				i_80_ = 0;
			int i_81_ = aBool187 ? 1 + (20 + 397683159 * class414.anInt4978) : 31;
			int i_82_ = class414.anInt4978 * 397683159 + (i - i_81_) + 1;
			if (i_79_ + i_82_ > Class263.anInt3243 * -969250379)
				i_82_ = Class263.anInt3243 * -969250379 - i_79_;
			if (i_82_ < 0)
				i_82_ = 0;
			Class341.anInt3996 = -1046325159 * i_80_;
			Class282_Sub50_Sub2.anInt9471 = i_82_ * 442655807;
			Class96_Sub3.anInt8518 = i_77_ * 694445155;
			aClass282_Sub50_Sub15_163 = class282_sub50_sub15;
		}
	}

	static void method607() {
		for (Class282_Sub50_Sub7 class282_sub50_sub7 = (Class282_Sub50_Sub7) aClass482_171.head((byte) 108); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(-668193440))) {
			if (Class14.method539(-1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587), -17163071))
				SharedConfigsType.method2095(class282_sub50_sub7, -1273559307);
		}
	}

	static Class414 method608() {
		Class414 class414;
		if (aBool187) {
			if (null != Class186.aClass8_2348 && Class176.aClass414_2200 != null)
				class414 = Class176.aClass414_2200;
			else
				class414 = Class288.aClass414_3438;
		} else
			class414 = Class288.aClass414_3438;
		anInt178 = 1217218217 * class414.anInt4979 + 362972703 * class414.anInt4978;
		return class414;
	}

	static Class414 method609() {
		Class414 class414;
		if (aBool187) {
			if (null != Class186.aClass8_2348 && Class176.aClass414_2200 != null)
				class414 = Class176.aClass414_2200;
			else
				class414 = Class288.aClass414_3438;
		} else
			class414 = Class288.aClass414_3438;
		anInt178 = 1217218217 * class414.anInt4979 + 362972703 * class414.anInt4978;
		return class414;
	}

	static Class414 method610() {
		Class414 class414;
		if (aBool187) {
			if (null != Class186.aClass8_2348 && Class176.aClass414_2200 != null)
				class414 = Class176.aClass414_2200;
			else
				class414 = Class288.aClass414_3438;
		} else
			class414 = Class288.aClass414_3438;
		anInt178 = 1217218217 * class414.anInt4979 + 362972703 * class414.anInt4978;
		return class414;
	}

	public static boolean method611(int i, int i_83_) {
		if (!aBool161)
			return false;
		int i_84_ = i >> 16;
		int i_85_ = i & 0xffff;
		if (null == Class468_Sub8.aClass98Array7889[i_84_] || (Class468_Sub8.aClass98Array7889[i_84_].aClass118Array998[i_85_] == null))
			return false;
		Class118 class118 = Class468_Sub8.aClass98Array7889[i_84_].aClass118Array998[i_85_];
		if (i_83_ != -1 || -2131393857 * class118.anInt1268 != 0) {
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 117)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(-596250294))) {
				if (i_83_ == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9581) * 1575008129 && (class118.anInt1287 * -1952846363 == 395156599 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582)
						&& (58 == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 == 1007 || -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 == 25 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 == 57 || 30 == -1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587)))
					return true;
			}
		} else {
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 93)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(1245588995))) {
				if ((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225) == 58 || 1007 == -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 || -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 == 25 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225) == 57 || 30 == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225) {
					for (Class118 class118_86_ = Class117.method1981((395156599 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582)), (byte) 20); null != class118_86_; class118_86_ = Class96_Sub23.method14682((Class468_Sub8.aClass98Array7889[(((class118_86_.anInt1287) * -1952846363) >> 16)]), class118_86_, -838454718)) {
						if (-1952846363 * class118_86_.anInt1287 == -1952846363 * class118.anInt1287)
							return true;
					}
				}
			}
		}
		return false;
	}

	static void method612() {
		if (client.anInt7231 * -1638311881 < 0) {
			Class414 class414 = Class114.method1887(-1460895203);
			if (!aBool161)
				aBool162 = ((anInt198 * 215004571 != -1 && anInt169 * 2144330291 >= anInt198 * 215004571) || (((aBool187 ? 26 : 22) + 997766473 * anInt178 * (2144330291 * anInt169)) > -969250379 * Class263.anInt3243));
			aClass482_174.method8118(-750349933);
			aClass482_175.method8118(318325401);
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 43)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(-1217628241))) {
				int i = (-1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587));
				if (i < 1000) {
					class282_sub50_sub7.unlink(-371378792);
					if (59 == i || 2 == i || 8 == i || 17 == i || 15 == i || i == 16 || i == 58)
						aClass482_175.append(class282_sub50_sub7, -1834493016);
					else
						aClass482_174.append(class282_sub50_sub7, 592980569);
				}
			}
			aClass482_174.method8063(aClass482_171, -1553248551);
			aClass482_175.method8063(aClass482_171, -1553248551);
			if (anInt169 * 2144330291 > 1) {
				if (Class468_Sub1.method12619(200242837) && 2144330291 * anInt169 > 2)
					Class96_Sub23.aClass282_Sub50_Sub7_9445 = (Class282_Sub50_Sub7) (aClass482_171.head.prev.prev);
				else
					Class96_Sub23.aClass282_Sub50_Sub7_9445 = ((Class282_Sub50_Sub7) aClass482_171.head.prev);
				Class1.aClass282_Sub50_Sub7_12 = ((Class282_Sub50_Sub7) aClass482_171.head.prev);
				if (anInt169 * 2144330291 > 2)
					aClass282_Sub50_Sub7_168 = ((Class282_Sub50_Sub7) Class1.aClass282_Sub50_Sub7_12.prev);
				else
					aClass282_Sub50_Sub7_168 = null;
			} else {
				Class96_Sub23.aClass282_Sub50_Sub7_9445 = null;
				Class1.aClass282_Sub50_Sub7_12 = null;
				aClass282_Sub50_Sub7_168 = null;
			}
			Class282_Sub53 class282_sub53 = (Class282_Sub53) client.aClass482_7267.head((byte) 75);
			int i;
			int i_87_;
			if (null != class282_sub53) {
				i = class282_sub53.method13481(1669505773);
				i_87_ = class282_sub53.method13469(706278881);
			} else {
				i = Class163.aClass209_2031.method3569(2053453495);
				i_87_ = Class163.aClass209_2031.method3570(756095591);
			}
			if (aBool161) {
				if (Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5882), class282_sub53, -383465014)) {
					if (null != aClass282_Sub50_Sub15_163 && i >= Class341.anInt3996 * 143093737 && i <= (Class341.anInt3996 * 143093737 + Class96_Sub3.anInt8518 * 572079435) && i_87_ >= Class282_Sub50_Sub2.anInt9471 * 2107083711 && i_87_ <= ((-1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526) + (2107083711 * Class282_Sub50_Sub2.anInt9471))) {
						int i_88_ = -1;
						for (int i_89_ = 0; i_89_ < 2026887253 * (((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).anInt9769); i_89_++) {
							if (aBool187) {
								int i_90_ = (anInt178 * 997766473 * i_89_ + (1 + (class414.anInt4978 * 397683159 + ((2107083711 * (Class282_Sub50_Sub2.anInt9471)) + 20))));
								if (i_87_ > (i_90_ - class414.anInt4978 * 397683159 - 1) && i_87_ < i_90_ + (-1518951631 * class414.anInt4979))
									i_88_ = i_89_;
							} else {
								int i_91_ = (997766473 * anInt178 * i_89_ + ((2107083711 * Class282_Sub50_Sub2.anInt9471) + 31));
								if (i_87_ > i_91_ - 13 && i_87_ < 3 + i_91_)
									i_88_ = i_89_;
							}
						}
						if (i_88_ != -1) {
							int i_92_ = 0;
							Class469 class469 = new Class469(((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770);
							for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class469.method7790(1832486278)); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) class469.next()) {
								if (i_88_ == i_92_) {
									Class96_Sub4.method13789(class282_sub50_sub7, i, i_87_, 2048067139);
									break;
								}
								i_92_++;
							}
						}
						Class316.method5594(-559600711);
					} else if (i >= Class301.anInt3555 * 1742345613 && i <= (-13788709 * Class158_Sub2.anInt8975 + Class301.anInt3555 * 1742345613) && i_87_ >= 815250613 * Class184.anInt2300 && (i_87_ <= (Class184.anInt2300 * 815250613 + -1488439617 * Class110.anInt1104))) {
						if (!aBool162) {
							int i_93_ = -1;
							for (int i_94_ = 0; i_94_ < 2144330291 * anInt169; i_94_++) {
								if (aBool187) {
									int i_95_ = ((997766473 * anInt178 * (2144330291 * anInt169 - 1 - i_94_)) + (20 + Class184.anInt2300 * 815250613 + class414.anInt4978 * 397683159 + 1));
									if ((i_87_ > (i_95_ - 397683159 * class414.anInt4978 - 1)) && i_87_ < (class414.anInt4979 * -1518951631) + i_95_)
										i_93_ = i_94_;
								} else {
									int i_96_ = (((2144330291 * anInt169 - 1 - i_94_) * (anInt178 * 997766473)) + (815250613 * Class184.anInt2300 + 31));
									if (i_87_ > i_96_ - 13 && i_87_ < 3 + i_96_)
										i_93_ = i_94_;
								}
							}
							if (i_93_ != -1) {
								int i_97_ = 0;
								NodeIterator class460 = new NodeIterator(aClass482_171);
								for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class460.method7683(2008517721)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) class460.next())) {
									if (i_97_ == i_93_) {
										Class96_Sub4.method13789(class282_sub50_sub7, i, i_87_, 1723474479);
										break;
									}
									i_97_++;
								}
							}
							Class316.method5594(-559600711);
						} else {
							int i_98_ = -1;
							for (int i_99_ = 0; i_99_ < anInt170 * 292682521; i_99_++) {
								if (aBool187) {
									int i_100_ = (anInt178 * 997766473 * i_99_ + (1 + (class414.anInt4978 * 397683159 + (20 + (815250613 * (Class184.anInt2300))))));
									if (i_87_ > i_100_ - (class414.anInt4978 * 397683159) - 1 && (i_87_ < (-1518951631 * class414.anInt4979 + i_100_))) {
										i_98_ = i_99_;
										break;
									}
								} else {
									int i_101_ = (31 + Class184.anInt2300 * 815250613 + i_99_ * (anInt178 * 997766473));
									if (i_87_ > i_101_ - 13 && i_87_ < 3 + i_101_) {
										i_98_ = i_99_;
										break;
									}
								}
							}
							if (-1 != i_98_) {
								int i_102_ = 0;
								Class469 class469 = new Class469(aClass477_182);
								for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.method7790(1832486278)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.next())) {
									if (i_98_ == i_102_) {
										Class96_Sub4.method13789(((Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)), i, i_87_, 518157009);
										Class316.method5594(-559600711);
										break;
									}
									i_102_++;
								}
							}
						}
					}
				} else {
					boolean bool = false;
					if (null != aClass282_Sub50_Sub15_163) {
						if (i < Class341.anInt3996 * 143093737 - 10 || i > 10 + (Class96_Sub3.anInt8518 * 572079435 + 143093737 * Class341.anInt3996) || i_87_ < (Class282_Sub50_Sub2.anInt9471 * 2107083711) - 10 || (i_87_ > ((-1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526) + 2107083711 * Class282_Sub50_Sub2.anInt9471 + 10)))
							Class404.method6810(-1225756200);
						else
							bool = true;
					}
					if (!bool) {
						if (i < Class301.anInt3555 * 1742345613 - 10 || i > (Class158_Sub2.anInt8975 * -13788709 + 1742345613 * Class301.anInt3555 + 10) || i_87_ < Class184.anInt2300 * 815250613 - 10 || i_87_ > (-1488439617 * Class110.anInt1104 + 815250613 * Class184.anInt2300 + 10))
							Class316.method5594(-559600711);
						else if (aBool162) {
							int i_103_ = -1;
							int i_104_ = -1;
							for (int i_105_ = 0; i_105_ < 292682521 * anInt170; i_105_++) {
								if (aBool187) {
									int i_106_ = (class414.anInt4978 * 397683159 + (815250613 * Class184.anInt2300 + 20) + 1 + 997766473 * anInt178 * i_105_);
									if ((i_87_ > (i_106_ - 397683159 * class414.anInt4978 - 1)) && (i_87_ < (-1518951631 * class414.anInt4979 + i_106_))) {
										i_103_ = i_105_;
										i_104_ = (i_106_ - 397683159 * class414.anInt4978 - 1);
										break;
									}
								} else {
									int i_107_ = (Class184.anInt2300 * 815250613 + 31 + i_105_ * (997766473 * anInt178));
									if (i_87_ > i_107_ - 13 && i_87_ < 3 + i_107_) {
										i_103_ = i_105_;
										i_104_ = i_107_ - 13;
										break;
									}
								}
							}
							if (i_103_ != -1) {
								int i_108_ = 0;
								Class469 class469 = new Class469(aClass477_182);
								for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.method7790(1832486278)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.next())) {
									if (i_103_ == i_108_) {
										if ((2026887253 * (((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769)) > 1)
											Class282_Sub12.method12212(class282_sub50_sub15, i_104_, -1334313695);
										break;
									}
									i_108_++;
								}
							}
						}
					}
				}
			} else {
				boolean bool = Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5878), class282_sub53, 1249734553);
				boolean bool_109_ = Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5874), class282_sub53, 52677578);
				boolean bool_110_ = Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5875), class282_sub53, 1908329550);
				if ((bool || bool_109_) && ((-1718417173 * client.anInt7339 == 1 && 2144330291 * anInt169 > 2) || JS5GrabWorker.method12562(-1447555225)))
					bool_110_ = true;
				if (bool_110_ && anInt169 * 2144330291 > 0) {
					if (null == client.aClass118_7257 && 0 == client.anInt7184 * 676534483)
						Class262.method4653(i, i_87_, -651513274);
					else
						anInt167 = -256186394;
				} else if (bool_109_) {
					if (aClass282_Sub50_Sub7_168 != null)
						Class96_Sub4.method13789(aClass282_Sub50_Sub7_168, i, i_87_, 1714298512);
				} else if (bool) {
					if (null != Class96_Sub23.aClass282_Sub50_Sub7_9445) {
						boolean bool_111_ = (null != client.aClass118_7257 || 676534483 * client.anInt7184 > 0);
						if (bool_111_) {
							anInt167 = 2019390451;
							Class46.aClass282_Sub50_Sub7_438 = Class96_Sub23.aClass282_Sub50_Sub7_9445;
						} else
							Class96_Sub4.method13789(Class96_Sub23.aClass282_Sub50_Sub7_9445, i, i_87_, 4720037);
					} else if (client.aBool7344)
						Class60.method1170(-609337146);
				}
				if (client.aClass118_7257 == null && 0 == 676534483 * client.anInt7184) {
					anInt167 = 0;
					Class46.aClass282_Sub50_Sub7_438 = null;
				}
			}
		}
	}

	static void method613() {
		if (null != aClass282_Sub50_Sub15_163) {
			aClass282_Sub50_Sub15_163 = null;
			Class292.method5201(Class341.anInt3996 * 143093737, Class282_Sub50_Sub2.anInt9471 * 2107083711, Class96_Sub3.anInt8518 * 572079435, (-1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526), (byte) 12);
		}
	}

	static long method614(Interface12 interface12, int i, int i_112_) {
		long l = 4194304L;
		long l_113_ = -9223372036854775808L;
		ObjectDefinitions class478 = IndexLoaders.MAP_REGION_DECODER.method4436(-1788558859).getObjectDefinitions(interface12.method84(1320266321), 65280);
		long l_114_ = (long) (i | i_112_ << 7 | interface12.method89(660726658) << 14 | interface12.method92(775011496) << 20 | 0x40000000);
		if (0 == -348507379 * class478.anInt5652)
			l_114_ |= l_113_;
		if (1 == -1062790731 * class478.anInt5687)
			l_114_ |= l;
		l_114_ |= (long) interface12.method84(-646854844) << 32;
		return l_114_;
	}

	static void method615(String string, String string_115_, int i, int i_116_, int i_117_, long l, int i_118_, int i_119_, boolean bool, boolean bool_120_, long l_121_, boolean bool_122_) {
		if (!aBool161 && anInt169 * 2144330291 < 520) {
			i = -1 != i ? i : -1211259595 * client.anInt7427;
			Class282_Sub50_Sub7 class282_sub50_sub7 = new Class282_Sub50_Sub7(string, string_115_, i, i_116_, i_117_, l, i_118_, i_119_, bool, bool_120_, l_121_, bool_122_);
			Class361.method6269(class282_sub50_sub7, -1498808978);
		}
	}

	static Class414 method616() {
		Class414 class414;
		if (aBool187) {
			if (null != Class186.aClass8_2348 && Class176.aClass414_2200 != null)
				class414 = Class176.aClass414_2200;
			else
				class414 = Class288.aClass414_3438;
		} else
			class414 = Class288.aClass414_3438;
		anInt178 = 1217218217 * class414.anInt4979 + 362972703 * class414.anInt4978;
		return class414;
	}

	static String method617(Class118 class118, int i) {
		if (!client.method11633(class118).method12178(i, (short) -28728) && class118.anObjectArray1410 == null)
			return null;
		if (class118.aStringArray1352 == null || class118.aStringArray1352.length <= i || class118.aStringArray1352[i] == null || class118.aStringArray1352[i].trim().length() == 0) {
			if (client.aBool7168)
				return new StringBuilder().append("Hidden-").append(i).toString();
			return null;
		}
		return class118.aStringArray1352[i];
	}

	static void method618(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (null != class282_sub50_sub7) {
			aClass482_171.append(class282_sub50_sub7, 151051921);
			anInt169 += 1410722043;
			Object object = null;
			Class282_Sub50_Sub15 class282_sub50_sub15;
			if (!((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9586 && !"".equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588)) {
				long l = (820033947929891191L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9580));
				for (class282_sub50_sub15 = (Class282_Sub50_Sub15) aClass465_172.method7754(l); (null != class282_sub50_sub15 && !(((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588))); class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass465_172.method7747(-1597903653))) {
					/* empty */
				}
				if (class282_sub50_sub15 == null) {
					class282_sub50_sub15 = (Class282_Sub50_Sub15) aClass229_164.get(l);
					if (null != class282_sub50_sub15 && !(((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588)))
						class282_sub50_sub15 = null;
					if (null == class282_sub50_sub15)
						class282_sub50_sub15 = new Class282_Sub50_Sub15(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588);
					aClass465_172.method7765(class282_sub50_sub15, l);
					anInt170 += 1980182825;
				}
			} else {
				class282_sub50_sub15 = new Class282_Sub50_Sub15(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588);
				anInt170 += 1980182825;
			}
			if (class282_sub50_sub15.method15245(class282_sub50_sub7, -1176564470))
				Class13.method503(class282_sub50_sub15, 1023204095);
		}
	}

	static void method619(Class282_Sub50_Sub15 class282_sub50_sub15) {
		boolean bool = false;
		class282_sub50_sub15.method13452((byte) -5);
		for (Class282_Sub50_Sub15 class282_sub50_sub15_123_ = (Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4); null != class282_sub50_sub15_123_; class282_sub50_sub15_123_ = ((Class282_Sub50_Sub15) aClass477_182.method7955(-1182055568))) {
			if (Class301.method5334(class282_sub50_sub15.method15244((byte) 43), class282_sub50_sub15_123_.method15244((byte) 101), 1005327930)) {
				Class224.method3782(class282_sub50_sub15, class282_sub50_sub15_123_, -611467016);
				bool = true;
				break;
			}
		}
		if (!bool)
			aClass477_182.method7936(class282_sub50_sub15, -1738910950);
	}

	static void method620() {
		if (client.anInt7231 * -1638311881 < 0) {
			Class414 class414 = Class114.method1887(1831962733);
			if (!aBool161)
				aBool162 = ((anInt198 * 215004571 != -1 && anInt169 * 2144330291 >= anInt198 * 215004571) || (((aBool187 ? 26 : 22) + 997766473 * anInt178 * (2144330291 * anInt169)) > -969250379 * Class263.anInt3243));
			aClass482_174.method8118(-773723432);
			aClass482_175.method8118(-416498885);
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 103)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(1147850254))) {
				int i = (-1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587));
				if (i < 1000) {
					class282_sub50_sub7.unlink(-371378792);
					if (59 == i || 2 == i || 8 == i || 17 == i || 15 == i || i == 16 || i == 58)
						aClass482_175.append(class282_sub50_sub7, 1384537552);
					else
						aClass482_174.append(class282_sub50_sub7, 117965495);
				}
			}
			aClass482_174.method8063(aClass482_171, -1553248551);
			aClass482_175.method8063(aClass482_171, -1553248551);
			if (anInt169 * 2144330291 > 1) {
				if (Class468_Sub1.method12619(-1163264306) && 2144330291 * anInt169 > 2)
					Class96_Sub23.aClass282_Sub50_Sub7_9445 = (Class282_Sub50_Sub7) (aClass482_171.head.prev.prev);
				else
					Class96_Sub23.aClass282_Sub50_Sub7_9445 = ((Class282_Sub50_Sub7) aClass482_171.head.prev);
				Class1.aClass282_Sub50_Sub7_12 = ((Class282_Sub50_Sub7) aClass482_171.head.prev);
				if (anInt169 * 2144330291 > 2)
					aClass282_Sub50_Sub7_168 = ((Class282_Sub50_Sub7) Class1.aClass282_Sub50_Sub7_12.prev);
				else
					aClass282_Sub50_Sub7_168 = null;
			} else {
				Class96_Sub23.aClass282_Sub50_Sub7_9445 = null;
				Class1.aClass282_Sub50_Sub7_12 = null;
				aClass282_Sub50_Sub7_168 = null;
			}
			Class282_Sub53 class282_sub53 = (Class282_Sub53) client.aClass482_7267.head((byte) 27);
			int i;
			int i_124_;
			if (null != class282_sub53) {
				i = class282_sub53.method13481(999644766);
				i_124_ = class282_sub53.method13469(1897679702);
			} else {
				i = Class163.aClass209_2031.method3569(2051330077);
				i_124_ = Class163.aClass209_2031.method3570(756095591);
			}
			if (aBool161) {
				if (Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5882), class282_sub53, 1473649252)) {
					if (null != aClass282_Sub50_Sub15_163 && i >= Class341.anInt3996 * 143093737 && i <= (Class341.anInt3996 * 143093737 + Class96_Sub3.anInt8518 * 572079435) && i_124_ >= Class282_Sub50_Sub2.anInt9471 * 2107083711 && i_124_ <= ((-1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526) + (2107083711 * Class282_Sub50_Sub2.anInt9471))) {
						int i_125_ = -1;
						for (int i_126_ = 0; i_126_ < 2026887253 * (((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).anInt9769); i_126_++) {
							if (aBool187) {
								int i_127_ = (anInt178 * 997766473 * i_126_ + (1 + (class414.anInt4978 * 397683159 + ((2107083711 * (Class282_Sub50_Sub2.anInt9471)) + 20))));
								if (i_124_ > (i_127_ - class414.anInt4978 * 397683159 - 1) && (i_124_ < i_127_ + (-1518951631 * class414.anInt4979)))
									i_125_ = i_126_;
							} else {
								int i_128_ = (997766473 * anInt178 * i_126_ + ((2107083711 * Class282_Sub50_Sub2.anInt9471) + 31));
								if (i_124_ > i_128_ - 13 && i_124_ < 3 + i_128_)
									i_125_ = i_126_;
							}
						}
						if (i_125_ != -1) {
							int i_129_ = 0;
							Class469 class469 = new Class469(((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770);
							for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class469.method7790(1832486278)); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) class469.next()) {
								if (i_125_ == i_129_) {
									Class96_Sub4.method13789(class282_sub50_sub7, i, i_124_, -145410607);
									break;
								}
								i_129_++;
							}
						}
						Class316.method5594(-559600711);
					} else if (i >= Class301.anInt3555 * 1742345613 && i <= (-13788709 * Class158_Sub2.anInt8975 + Class301.anInt3555 * 1742345613) && i_124_ >= 815250613 * Class184.anInt2300 && (i_124_ <= (Class184.anInt2300 * 815250613 + -1488439617 * Class110.anInt1104))) {
						if (!aBool162) {
							int i_130_ = -1;
							for (int i_131_ = 0; i_131_ < 2144330291 * anInt169; i_131_++) {
								if (aBool187) {
									int i_132_ = ((997766473 * anInt178 * (2144330291 * anInt169 - 1 - i_131_)) + (20 + Class184.anInt2300 * 815250613 + class414.anInt4978 * 397683159 + 1));
									if ((i_124_ > (i_132_ - 397683159 * class414.anInt4978 - 1)) && i_124_ < (class414.anInt4979 * -1518951631) + i_132_)
										i_130_ = i_131_;
								} else {
									int i_133_ = ((2144330291 * anInt169 - 1 - i_131_) * (anInt178 * 997766473) + (815250613 * Class184.anInt2300 + 31));
									if (i_124_ > i_133_ - 13 && i_124_ < 3 + i_133_)
										i_130_ = i_131_;
								}
							}
							if (i_130_ != -1) {
								int i_134_ = 0;
								NodeIterator class460 = new NodeIterator(aClass482_171);
								for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class460.method7683(-968436531)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) class460.next())) {
									if (i_134_ == i_130_) {
										Class96_Sub4.method13789(class282_sub50_sub7, i, i_124_, -466703059);
										break;
									}
									i_134_++;
								}
							}
							Class316.method5594(-559600711);
						} else {
							int i_135_ = -1;
							for (int i_136_ = 0; i_136_ < anInt170 * 292682521; i_136_++) {
								if (aBool187) {
									int i_137_ = (anInt178 * 997766473 * i_136_ + (1 + (class414.anInt4978 * 397683159 + (20 + (815250613 * (Class184.anInt2300))))));
									if (i_124_ > i_137_ - (class414.anInt4978 * 397683159) - 1 && (i_124_ < (-1518951631 * class414.anInt4979 + i_137_))) {
										i_135_ = i_136_;
										break;
									}
								} else {
									int i_138_ = (31 + Class184.anInt2300 * 815250613 + i_136_ * (anInt178 * 997766473));
									if (i_124_ > i_138_ - 13 && i_124_ < 3 + i_138_) {
										i_135_ = i_136_;
										break;
									}
								}
							}
							if (-1 != i_135_) {
								int i_139_ = 0;
								Class469 class469 = new Class469(aClass477_182);
								for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.method7790(1832486278)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.next())) {
									if (i_135_ == i_139_) {
										Class96_Sub4.method13789(((Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)), i, i_124_, 53706309);
										Class316.method5594(-559600711);
										break;
									}
									i_139_++;
								}
							}
						}
					}
				} else {
					boolean bool = false;
					if (null != aClass282_Sub50_Sub15_163) {
						if (i < Class341.anInt3996 * 143093737 - 10 || i > 10 + (Class96_Sub3.anInt8518 * 572079435 + 143093737 * Class341.anInt3996) || i_124_ < (Class282_Sub50_Sub2.anInt9471 * 2107083711) - 10 || (i_124_ > ((-1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526) + 2107083711 * Class282_Sub50_Sub2.anInt9471 + 10)))
							Class404.method6810(1443575755);
						else
							bool = true;
					}
					if (!bool) {
						if (i < Class301.anInt3555 * 1742345613 - 10 || i > (Class158_Sub2.anInt8975 * -13788709 + 1742345613 * Class301.anInt3555 + 10) || i_124_ < Class184.anInt2300 * 815250613 - 10 || i_124_ > (-1488439617 * Class110.anInt1104 + 815250613 * Class184.anInt2300 + 10))
							Class316.method5594(-559600711);
						else if (aBool162) {
							int i_140_ = -1;
							int i_141_ = -1;
							for (int i_142_ = 0; i_142_ < 292682521 * anInt170; i_142_++) {
								if (aBool187) {
									int i_143_ = (class414.anInt4978 * 397683159 + (815250613 * Class184.anInt2300 + 20) + 1 + 997766473 * anInt178 * i_142_);
									if ((i_124_ > (i_143_ - 397683159 * class414.anInt4978 - 1)) && (i_124_ < (-1518951631 * class414.anInt4979 + i_143_))) {
										i_140_ = i_142_;
										i_141_ = (i_143_ - 397683159 * class414.anInt4978 - 1);
										break;
									}
								} else {
									int i_144_ = (Class184.anInt2300 * 815250613 + 31 + i_142_ * (997766473 * anInt178));
									if (i_124_ > i_144_ - 13 && i_124_ < 3 + i_144_) {
										i_140_ = i_142_;
										i_141_ = i_144_ - 13;
										break;
									}
								}
							}
							if (i_140_ != -1) {
								int i_145_ = 0;
								Class469 class469 = new Class469(aClass477_182);
								for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.method7790(1832486278)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.next())) {
									if (i_140_ == i_145_) {
										if ((2026887253 * (((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769)) > 1)
											Class282_Sub12.method12212(class282_sub50_sub15, i_141_, -2016790911);
										break;
									}
									i_145_++;
								}
							}
						}
					}
				}
			} else {
				boolean bool = Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5878), class282_sub53, 1266934084);
				boolean bool_146_ = Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5874), class282_sub53, 1401799855);
				boolean bool_147_ = Class6.method302((Class149_Sub2.DEFAULTS_LOADER_7.anInterface17_5875), class282_sub53, -16962109);
				if ((bool || bool_146_) && ((-1718417173 * client.anInt7339 == 1 && 2144330291 * anInt169 > 2) || JS5GrabWorker.method12562(-676720347)))
					bool_147_ = true;
				if (bool_147_ && anInt169 * 2144330291 > 0) {
					if (null == client.aClass118_7257 && 0 == client.anInt7184 * 676534483)
						Class262.method4653(i, i_124_, -1222651312);
					else
						anInt167 = -256186394;
				} else if (bool_146_) {
					if (aClass282_Sub50_Sub7_168 != null)
						Class96_Sub4.method13789(aClass282_Sub50_Sub7_168, i, i_124_, 1398610814);
				} else if (bool) {
					if (null != Class96_Sub23.aClass282_Sub50_Sub7_9445) {
						boolean bool_148_ = (null != client.aClass118_7257 || 676534483 * client.anInt7184 > 0);
						if (bool_148_) {
							anInt167 = 2019390451;
							Class46.aClass282_Sub50_Sub7_438 = Class96_Sub23.aClass282_Sub50_Sub7_9445;
						} else
							Class96_Sub4.method13789(Class96_Sub23.aClass282_Sub50_Sub7_9445, i, i_124_, -698924050);
					} else if (client.aBool7344)
						Class60.method1170(-609337146);
				}
				if (client.aClass118_7257 == null && 0 == 676534483 * client.anInt7184) {
					anInt167 = 0;
					Class46.aClass282_Sub50_Sub7_438 = null;
				}
			}
		}
	}

	static boolean method621() {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5877, (byte) -40);
	}

	static void method622(Class118 class118, int i, int i_149_) {
		if (client.aBool7344) {
			AttributeDefault class437 = (Class96_Sub12.anInt9319 * -1605351655 != -1 ? IndexLoaders.ITEM_DEFAULTS.method7069((-1605351655 * (Class96_Sub12.anInt9319)), (byte) 0) : null);
			if (client.method11633(class118).method12181(1834701989) && (Class506.anInt5858 * 1310510077 & 0x20) != 0 && (class437 == null || (class118.method1997((Class96_Sub12.anInt9319 * -1605351655), -1741480635 * class437.anInt5337, 1802954593) != class437.anInt5337 * -1741480635)))
				PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(class118.aString1369).toString(), -239192305 * Defaults8Loader.anInt5932, 58, class118.anInt1426 * -56249735, 0L, 1924549737 * class118.anInt1288, class118.anInt1287 * -1952846363, true, false, (long) (1924549737 * class118.anInt1288 << 32 | -1952846363 * class118.anInt1287), false, -1416675375);
		}
		for (int i_150_ = 9; i_150_ >= 5; i_150_--) {
			String string = ItemIndexLoader.method7171(class118, i_150_, (byte) 27);
			if (null != string)
				PlayerAppearance.method4032(string, class118.aString1369, Class520.method11163(class118, i_150_, 340920090), 1007, -56249735 * class118.anInt1426, (long) (i_150_ + 1), class118.anInt1288 * 1924549737, -1952846363 * class118.anInt1287, true, false, (long) (1924549737 * class118.anInt1288 << 32 | class118.anInt1287 * -1952846363), false, -1952533549);
		}
		String string = Class346.method6157(class118, -1240396606);
		if (string != null)
			PlayerAppearance.method4032(string, class118.aString1369, class118.anInt1378 * 1289545277, 25, -56249735 * class118.anInt1426, 0L, 1924549737 * class118.anInt1288, -1952846363 * class118.anInt1287, true, false, (long) (1924549737 * class118.anInt1288 << 32 | class118.anInt1287 * -1952846363), false, -1266890996);
		for (int i_151_ = 4; i_151_ >= 0; i_151_--) {
			String string_152_ = ItemIndexLoader.method7171(class118, i_151_, (byte) 51);
			if (null != string_152_)
				PlayerAppearance.method4032(string_152_, class118.aString1369, Class520.method11163(class118, i_151_, 811057602), 57, class118.anInt1426 * -56249735, (long) (i_151_ + 1), 1924549737 * class118.anInt1288, class118.anInt1287 * -1952846363, true, false, (long) (class118.anInt1288 * 1924549737 << 32 | -1952846363 * class118.anInt1287), false, -1809010323);
		}
		if (client.method11633(class118).method12182(-814264887)) {
			if (class118.aString1348 != null)
				PlayerAppearance.method4032(class118.aString1348, "", -1, 30, -56249735 * class118.anInt1426, 0L, 1924549737 * class118.anInt1288, -1952846363 * class118.anInt1287, true, false, (long) ((1924549737 * class118.anInt1288 << 32) | (class118.anInt1287 * -1952846363)), false, -1615346243);
			else
				PlayerAppearance.method4032(Message.CONTINUE.translate(Class223.CURRENT_LANGUAGE, -541985458), "", -1, 30, class118.anInt1426 * -56249735, 0L, 1924549737 * class118.anInt1288, class118.anInt1287 * -1952846363, true, false, (long) (1924549737 * class118.anInt1288 << 32 | -1952846363 * class118.anInt1287), false, -1535784177);
		}
	}

	static void method623(Animable class521_sub1_sub1_sub2) {
		if (class521_sub1_sub1_sub2 instanceof NPC) {
			NPC class521_sub1_sub1_sub2_sub2 = (NPC) class521_sub1_sub1_sub2;
			if (class521_sub1_sub1_sub2_sub2.aClass409_10580 != null)
				WorldMapAreaDefs.method3736(class521_sub1_sub1_sub2_sub2, (class521_sub1_sub1_sub2_sub2.aByte7967 != (Class84.myPlayer.aByte7967)), 1292616286);
		} else if (class521_sub1_sub1_sub2 instanceof Player) {
			Player class521_sub1_sub1_sub2_sub1 = (Player) class521_sub1_sub1_sub2;
			Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1, (class521_sub1_sub1_sub2_sub1.aByte7967 != (Class84.myPlayer.aByte7967)), 1557506355);
		}
	}

	static void method624(GraphicalRenderer class505, int i, int i_153_) {
		if (i >= 0 && i_153_ >= 0 && aClass384_158 != null) {
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(175812683);
			Class384 class384 = class505.method8449();
			class505.method8424(aClass384_158);
			class505.method8457(aClass294_155);
			class505.r(anInt180 * -1747787169, 1607392711 * anInt181, anInt180 * -1747787169 + anInt176 * -2026336709, anInt184 * 919355353 + 1607392711 * anInt181);
			class505.method8617(-1747787169 * anInt180, 1607392711 * anInt181, anInt176 * -2026336709, 919355353 * anInt184);
			class384.method6522(aClass294_155);
			class384.method6523(aClass384_158);
			class384.method6524();
			int i_154_ = i - -1747787169 * anInt180;
			int i_155_ = i_153_ - anInt181 * 1607392711;
			if (IndexLoaders.MAP_REGION_DECODER.method4430(-1805273994) != null && (!client.aBool7344 || (1310510077 * Class506.anInt5858 & 0x40) != 0)) {
				int i_156_ = -1;
				int i_157_ = -1;
				float f = (2.0F * (float) i_154_ / (float) (anInt176 * -2026336709) - 1.0F);
				float f_158_ = (2.0F * (float) i_155_ / (float) (919355353 * anInt184) - 1.0F);
				class384.method6527(f, f_158_, -1.0F, aFloatArray194);
				float f_159_ = aFloatArray194[0] / aFloatArray194[3];
				float f_160_ = aFloatArray194[1] / aFloatArray194[3];
				float f_161_ = aFloatArray194[2] / aFloatArray194[3];
				class384.method6527(f, f_158_, 1.0F, aFloatArray194);
				float f_162_ = aFloatArray194[0] / aFloatArray194[3];
				float f_163_ = aFloatArray194[1] / aFloatArray194[3];
				float f_164_ = aFloatArray194[2] / aFloatArray194[3];
				float f_165_ = Class4.method288(f_159_, f_160_, f_161_, f_162_, f_163_, f_164_, 4, -1192911327);
				if (f_165_ > 0.0F) {
					float f_166_ = f_162_ - f_159_;
					float f_167_ = f_164_ - f_161_;
					int i_168_ = (int) (f_166_ * f_165_ + f_159_);
					int i_169_ = (int) (f_165_ * f_167_ + f_161_);
					i_156_ = i_168_ + (Class84.myPlayer.method15805(828768449) - 1 << 8) >> 9;
					i_157_ = i_169_ + (Class84.myPlayer.method15805(828768449) - 1 << 8) >> 9;
					int i_170_ = Class84.myPlayer.aByte7967;
					if (i_170_ < 3 && ((IndexLoaders.MAP_REGION_DECODER.method4433(33386298).aByteArrayArrayArray3638[1][i_168_ >> 9][i_169_ >> 9]) & 0x2) != 0)
						i_170_++;
				}
				if (-1 != i_156_ && i_157_ != -1) {
					if (client.aBool7344 && 0 != (1310510077 * Class506.anInt5858 & 0x40)) {
						Class118 class118 = Index.method5694(Class7.anInt56 * 728544879, (client.anInt7345 * -1673073865), 1491104282);
						if (class118 != null)
							PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(" ").append(Class2.aString17).append(" ").toString(), (Defaults8Loader.anInt5932 * -239192305), 59, -1, 0L, i_156_, i_157_, true, false, (long) (i_156_ << 32 | i_157_), true, -1912175836);
						else
							Class60.method1170(-609337146);
					} else {
						if (Class96_Sub6.aBool9173)
							PlayerAppearance.method4032((Message.FACE_HERE.translate(Class223.CURRENT_LANGUAGE, -1517065237)), "", -1, 60, -1, 0L, i_156_, i_157_, true, false, (long) (i_156_ << 32 | i_157_), true, -1997652787);
						PlayerAppearance.method4032(Class85.aString817, "", 460745521 * client.anInt7311, 23, -1, 0L, i_156_, i_157_, true, false, (long) (i_156_ << 32 | i_157_), true, -1794935000);
					}
				}
			}
			Login class284 = IndexLoaders.MAP_REGION_DECODER.method4430(-1831567192).aClass284_2648;
			int i_171_ = i;
			int i_172_ = i_153_;
			List list = class284.aList3388;
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class285 class285 = (Class285) iterator.next();
				if ((client.aBool7372 || (Class84.myPlayer.aByte7967 == class285.aClass521_Sub1_3391.aByte7967)) && class285.method5019(class505, i_171_, i_172_, -1792932931)) {
					boolean bool = false;
					boolean bool_173_ = false;
					int i_174_;
					int i_175_;
					if (class285.aClass521_Sub1_3391 instanceof Class521_Sub1_Sub1) {
						i_174_ = ((Class521_Sub1_Sub1) class285.aClass521_Sub1_3391).aShort9458;
						i_175_ = ((Class521_Sub1_Sub1) class285.aClass521_Sub1_3391).aShort9456;
					} else {
						Class385 class385 = (class285.aClass521_Sub1_3391.method11166().aClass385_3595);
						i_174_ = (int) class385.aFloat4671 >> 9;
						i_175_ = (int) class385.aFloat4673 >> 9;
					}
					if (class285.aClass521_Sub1_3391 instanceof Player) {
						Player class521_sub1_sub1_sub2_sub1 = ((Player) class285.aClass521_Sub1_3391);
						int i_176_ = class521_sub1_sub1_sub2_sub1.method15805(828768449);
						Class385 class385 = (class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
						if ((0 == (i_176_ & 0x1) && 0 == ((int) class385.aFloat4671 & 0x1ff) && 0 == ((int) class385.aFloat4673 & 0x1ff)) || (1 == (i_176_ & 0x1) && 256 == ((int) class385.aFloat4671 & 0x1ff) && (((int) class385.aFloat4673 & 0x1ff) == 256))) {
							int i_177_ = ((int) class385.aFloat4671 - (class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1 << 8));
							int i_178_ = ((int) class385.aFloat4673 - (class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1 << 8));
							for (int i_179_ = 0; i_179_ < client.anInt7211 * -685729279; i_179_++) {
								Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) client.anIntArray7212[i_179_])));
								if (class282_sub47 != null) {
									NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
									if (((class521_sub1_sub1_sub2_sub2.anInt10375) * 717008059 != client.cycles * -1809259861) && (class521_sub1_sub1_sub2_sub2.aBool10318)) {
										Class385 class385_180_ = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
										int i_181_ = ((int) class385_180_.aFloat4671 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
										int i_182_ = ((int) class385_180_.aFloat4673 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
										if (i_181_ >= i_177_ && (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_181_ - i_177_ >> 9))) && i_182_ >= i_178_ && (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_182_ - i_178_ >> 9)))) {
											WorldMapAreaDefs.method3736(class521_sub1_sub1_sub2_sub2, ((Class84.myPlayer.aByte7967) != (class285.aClass521_Sub1_3391.aByte7967)), 1717234813);
											class521_sub1_sub1_sub2_sub2.anInt10375 = (client.cycles * 1977662161);
										}
									}
								}
							}
							int i_183_ = Class197.NUM_PLAYER_INDICES * -963499271;
							int[] is = Class197.PLAYER_INDICES;
							for (int i_184_ = 0; i_184_ < i_183_; i_184_++) {
								Player class521_sub1_sub1_sub2_sub1_185_ = (client.players[is[i_184_]]);
								if (class521_sub1_sub1_sub2_sub1_185_ != null && ((class521_sub1_sub1_sub2_sub1_185_.anInt10375) * 717008059 != -1809259861 * client.cycles) && (class521_sub1_sub1_sub2_sub1 != class521_sub1_sub1_sub2_sub1_185_) && (class521_sub1_sub1_sub2_sub1_185_.aBool10318)) {
									Class385 class385_186_ = (class521_sub1_sub1_sub2_sub1_185_.method11166().aClass385_3595);
									int i_187_ = ((int) class385_186_.aFloat4671 - (class521_sub1_sub1_sub2_sub1_185_.method15805(828768449) - 1 << 8));
									int i_188_ = ((int) class385_186_.aFloat4673 - (class521_sub1_sub1_sub2_sub1_185_.method15805(828768449) - 1 << 8));
									if (i_187_ >= i_177_ && (class521_sub1_sub1_sub2_sub1_185_.method15805(828768449) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_187_ - i_177_ >> 9))) && i_188_ >= i_178_ && (class521_sub1_sub1_sub2_sub1_185_.method15805(828768449) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_188_ - i_178_ >> 9)))) {
										Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1_185_, ((class285.aClass521_Sub1_3391.aByte7967) != (Class84.myPlayer.aByte7967)), 1557506355);
										class521_sub1_sub1_sub2_sub1_185_.anInt10375 = client.cycles * 1977662161;
									}
								}
							}
						}
						if (717008059 * class521_sub1_sub1_sub2_sub1.anInt10375 == client.cycles * -1809259861)
							continue;
						Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1, (class285.aClass521_Sub1_3391.aByte7967 != (Class84.myPlayer.aByte7967)), 1557506355);
						class521_sub1_sub1_sub2_sub1.anInt10375 = 1977662161 * client.cycles;
					}
					if (class285.aClass521_Sub1_3391 instanceof NPC) {
						NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class285.aClass521_Sub1_3391);
						if (null != class521_sub1_sub1_sub2_sub2.aClass409_10580) {
							Class385 class385 = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
							if ((0 == (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) & 0x1) && 0 == ((int) class385.aFloat4671 & 0x1ff) && 0 == ((int) class385.aFloat4673 & 0x1ff)) || (1 == ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) & 0x1) && 256 == ((int) class385.aFloat4671 & 0x1ff) && 256 == ((int) class385.aFloat4673 & 0x1ff))) {
								int i_189_ = ((int) class385.aFloat4671 - (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) - 1 << 8));
								int i_190_ = ((int) class385.aFloat4673 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
								for (int i_191_ = 0; i_191_ < client.anInt7211 * -685729279; i_191_++) {
									Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) client.anIntArray7212[i_191_])));
									if (null != class282_sub47) {
										NPC class521_sub1_sub1_sub2_sub2_192_ = ((NPC) class282_sub47.anObject8068);
										if (((717008059 * (class521_sub1_sub1_sub2_sub2_192_.anInt10375)) != -1809259861 * client.cycles) && (class521_sub1_sub1_sub2_sub2 != class521_sub1_sub1_sub2_sub2_192_) && (class521_sub1_sub1_sub2_sub2_192_.aBool10318)) {
											Class385 class385_193_ = (class521_sub1_sub1_sub2_sub2_192_.method11166().aClass385_3595);
											int i_194_ = ((int) (class385_193_.aFloat4671) - ((1203434505 * (class521_sub1_sub1_sub2_sub2_192_.aClass409_10580.anInt4858)) - 1 << 8));
											int i_195_ = ((int) (class385_193_.aFloat4673) - (((class521_sub1_sub1_sub2_sub2_192_.aClass409_10580.anInt4858) * 1203434505) - 1 << 8));
											if (i_194_ >= i_189_ && ((1203434505 * (class521_sub1_sub1_sub2_sub2_192_.aClass409_10580.anInt4858)) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_194_ - i_189_ >> 9))) && i_195_ >= i_190_ && ((class521_sub1_sub1_sub2_sub2_192_.aClass409_10580.anInt4858) * 1203434505 <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_195_ - i_190_ >> 9)))) {
												WorldMapAreaDefs.method3736(class521_sub1_sub1_sub2_sub2_192_, ((Class84.myPlayer.aByte7967) != (class285.aClass521_Sub1_3391.aByte7967)), 2000946153);
												class521_sub1_sub1_sub2_sub2_192_.anInt10375 = (1977662161 * client.cycles);
											}
										}
									}
								}
								int i_196_ = Class197.NUM_PLAYER_INDICES * -963499271;
								int[] is = Class197.PLAYER_INDICES;
								for (int i_197_ = 0; i_197_ < i_196_; i_197_++) {
									Player class521_sub1_sub1_sub2_sub1 = (client.players[is[i_197_]]);
									if (null != class521_sub1_sub1_sub2_sub1 && (-1809259861 * client.cycles != (717008059 * (class521_sub1_sub1_sub2_sub1.anInt10375))) && (class521_sub1_sub1_sub2_sub1.aBool10318)) {
										Class385 class385_198_ = (class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
										int i_199_ = ((int) class385_198_.aFloat4671 - ((class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1) << 8));
										int i_200_ = ((int) class385_198_.aFloat4673 - ((class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1) << 8));
										if (i_199_ >= i_189_ && (class521_sub1_sub1_sub2_sub1.method15805(828768449) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_199_ - i_189_ >> 9))) && i_200_ >= i_190_ && (class521_sub1_sub1_sub2_sub1.method15805(828768449) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_200_ - i_190_ >> 9)))) {
											Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1, ((class285.aClass521_Sub1_3391.aByte7967) != (Class84.myPlayer.aByte7967)), 1557506355);
											class521_sub1_sub1_sub2_sub1.anInt10375 = (client.cycles * 1977662161);
										}
									}
								}
							}
							if ((class521_sub1_sub1_sub2_sub2.anInt10375 * 717008059) == -1809259861 * client.cycles)
								continue;
							WorldMapAreaDefs.method3736(class521_sub1_sub1_sub2_sub2, ((Class84.myPlayer.aByte7967) != class285.aClass521_Sub1_3391.aByte7967), 1754898087);
							class521_sub1_sub1_sub2_sub2.anInt10375 = client.cycles * 1977662161;
						}
					}
					if (class285.aClass521_Sub1_3391 instanceof Class521_Sub1_Sub2_Sub1) {
						int i_201_ = class219.anInt2711 * 1948093437 + i_174_;
						int i_202_ = i_175_ + class219.anInt2712 * -1002240017;
						Class282_Sub29 class282_sub29 = ((Class282_Sub29) (client.aClass465_7414.method7754((long) ((class285.aClass521_Sub1_3391.aByte7967) << 28 | i_202_ << 14 | i_201_))));
						if (null != class282_sub29) {
							int i_203_ = 0;
							Class282_Sub34 class282_sub34 = ((Class282_Sub34) class282_sub29.aClass482_7708.method8065(-1866936026));
							while (class282_sub34 != null) {
								ItemDefinitions class425 = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(1964309863 * class282_sub34.anInt7853, 1143909760));
								int i_204_;
								if (class425.aBool5101)
									i_204_ = class425.anInt5102 * 712312847;
								else if (class425.members)
									i_204_ = -1519092215 * (Class149_Sub2.DEFAULTS_LOADER_7.anInt5880);
								else
									i_204_ = 725268415 * (Class149_Sub2.DEFAULTS_LOADER_7.anInt5881);
								if (client.aBool7344 && ((Class84.myPlayer.aByte7967) == (class285.aClass521_Sub1_3391.aByte7967))) {
									AttributeDefault class437 = ((Class96_Sub12.anInt9319 * -1605351655) != -1 ? (IndexLoaders.ITEM_DEFAULTS.method7069((-1605351655 * Class96_Sub12.anInt9319), (byte) 0)) : null);
									if ((Class506.anInt5858 * 1310510077 & 0x1) != 0 && (null == class437 || ((class425.method7099((Class96_Sub12.anInt9319 * -1605351655), (-1741480635 * class437.anInt5337), -317586390)) != (class437.anInt5337 * -1741480635))))
										PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(i_204_, 619010179)).append(class425.aString5043).toString(), Defaults8Loader.anInt5932 * -239192305, 17, -1, (long) (class282_sub34.anInt7853 * 1964309863), i_174_, i_175_, true, false, (long) i_203_, false, -2055501116);
								}
								if (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967)) {
									String[] strings = class425.groundOptions;
									for (int i_205_ = strings.length - 1; i_205_ >= 0; i_205_--) {
										if (null != strings[i_205_]) {
											int i_206_ = 0;
											int i_207_ = client.anInt7342 * 452205213;
											if (0 == i_205_)
												i_206_ = 18;
											if (i_205_ == 1)
												i_206_ = 19;
											if (2 == i_205_)
												i_206_ = 20;
											if (3 == i_205_)
												i_206_ = 21;
											if (4 == i_205_)
												i_206_ = 22;
											if (5 == i_205_)
												i_206_ = 1004;
											if (i_205_ == (class425.anInt5059 * -934531831))
												i_207_ = (1152999273 * class425.anInt5055);
											if (i_205_ == (class425.anInt5060 * 1533030603))
												i_207_ = (class425.anInt5056 * -1540078225);
											PlayerAppearance.method4032(strings[i_205_], new StringBuilder().append(Class59.method1163(i_204_, 619010179)).append(class425.aString5043).toString(), i_207_, i_206_, -1, (long) (1964309863 * (class282_sub34.anInt7853)), i_174_, i_175_, true, false, (long) i_203_, false, -1393664795);
										}
									}
								}
								class282_sub34 = ((Class282_Sub34) class282_sub29.aClass482_7708.method8068((byte) 16));
								i_203_++;
							}
						}
					}
					if (class285.aClass521_Sub1_3391 instanceof Interface12) {
						Interface12 interface12 = (Interface12) class285.aClass521_Sub1_3391;
						ObjectDefinitions class478 = (IndexLoaders.MAP_REGION_DECODER.method4436(-1743644999).getObjectDefinitions(interface12.method84(-960220586), 65280));
						if (null != class478.anIntArray5650)
							class478 = class478.method8013((Class158_Sub1.aClass3_8507), (byte) 18);
						if (null != class478) {
							if (client.aBool7344 && (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967))) {
								AttributeDefault class437 = (-1 != (-1605351655 * Class96_Sub12.anInt9319) ? (IndexLoaders.ITEM_DEFAULTS.method7069((Class96_Sub12.anInt9319 * -1605351655), (byte) 0)) : null);
								if (0 != (1310510077 * Class506.anInt5858 & 0x4) && (class437 == null || ((class478.method7963((Class96_Sub12.anInt9319 * -1605351655), -1741480635 * class437.anInt5337, -1332978366)) != (-1741480635 * class437.anInt5337))))
									PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(65535, 619010179)).append(class478.aString5638).toString(), Defaults8Loader.anInt5932 * -239192305, 2, -1, Class329.method5905(interface12, i_174_, i_175_, (byte) -102), i_174_, i_175_, true, false, (long) interface12.hashCode(), false, -1656238080);
							}
							if (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967)) {
								String[] strings = class478.options;
								if (null != strings) {
									for (int i_208_ = strings.length - 1; i_208_ >= 0; i_208_--) {
										if (strings[i_208_] != null) {
											int i_209_ = 0;
											int i_210_ = 452205213 * client.anInt7342;
											if (i_208_ == 0)
												i_209_ = 3;
											if (i_208_ == 1)
												i_209_ = 4;
											if (2 == i_208_)
												i_209_ = 5;
											if (i_208_ == 3)
												i_209_ = 6;
											if (4 == i_208_)
												i_209_ = 1001;
											if (i_208_ == 5)
												i_209_ = 1002;
											if (class478.anInt5705 * -176888381 == i_208_)
												i_210_ = (1362609543 * class478.anInt5665);
											if (570422367 * class478.anInt5670 == i_208_)
												i_210_ = (-305458077 * class478.anInt5666);
											PlayerAppearance.method4032(strings[i_208_], new StringBuilder().append(Class59.method1163(65535, 619010179)).append(class478.aString5638).toString(), i_210_, i_209_, -1, (Class329.method5905(interface12, i_174_, i_175_, (byte) -109)), i_174_, i_175_, true, false, (long) interface12.hashCode(), false, -1063898610);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static Class282_Sub50_Sub7 method625() {
		return aClass282_Sub50_Sub7_168;
	}

	static void method626(GraphicalRenderer class505) {
		int i = -10660793;
		Class377.method6394(class505, Class301.anInt3555 * 1742345613, 815250613 * Class184.anInt2300, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i, -16777216, -281213279);
		Class285.aClass8_3394.renderText(Message.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE, -1577823469), 3 + 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300 + 14, i, -1, -418109423);
		int i_211_ = Class163.aClass209_2031.method3569(2044877441);
		int i_212_ = Class163.aClass209_2031.method3570(756095591);
		if (!aBool162) {
			int i_213_ = 0;
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 19)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(-396326561))) {
				int i_214_ = (anInt178 * 997766473 * (anInt169 * 2144330291 - 1 - i_213_) + (815250613 * Class184.anInt2300 + 31));
				Class282_Sub25.method12400(i_211_, i_212_, 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300, Class158_Sub2.anInt8975 * -13788709, Class110.anInt1104 * -1488439617, i_214_, class282_sub50_sub7, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, 1309671330);
				i_213_++;
			}
		} else {
			int i_215_ = 0;
			for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4)); null != class282_sub50_sub15; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(-1284000086))) {
				int i_216_ = (31 + Class184.anInt2300 * 815250613 + i_215_ * (anInt178 * 997766473));
				if (1 == 2026887253 * ((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769)
					Class282_Sub25.method12400(i_211_, i_212_, 1742345613 * Class301.anInt3555, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, -1488439617 * Class110.anInt1104, i_216_, ((Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)), Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, 387551030);
				else
					Class99.method1630(i_211_, i_212_, Class301.anInt3555 * 1742345613, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i_216_, class282_sub50_sub15, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, -575388288);
				i_215_++;
			}
			if (aClass282_Sub50_Sub15_163 != null) {
				Class377.method6394(class505, 143093737 * Class341.anInt3996, 2107083711 * Class282_Sub50_Sub2.anInt9471, 572079435 * Class96_Sub3.anInt8518, (Class521_Sub1_Sub5_Sub1.anInt10526 * -1193351845), i, -16777216, -978090213);
				Class285.aClass8_3394.renderText((((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aString9771), 143093737 * Class341.anInt3996 + 3, 2107083711 * Class282_Sub50_Sub2.anInt9471 + 14, i, -1, -418109423);
				i_215_ = 0;
				for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770.method7941((byte) 4)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770.method7955(-211395909))) {
					int i_217_ = (i_215_ * (997766473 * anInt178) + (2107083711 * Class282_Sub50_Sub2.anInt9471 + 31));
					Class282_Sub25.method12400(i_211_, i_212_, 143093737 * Class341.anInt3996, 2107083711 * Class282_Sub50_Sub2.anInt9471, 572079435 * Class96_Sub3.anInt8518, -1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526, i_217_, class282_sub50_sub7, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, -562367069);
					i_215_++;
				}
			}
		}
	}

	public static boolean method627(int i, int i_218_) {
		if (!aBool161)
			return false;
		int i_219_ = i >> 16;
		int i_220_ = i & 0xffff;
		if (null == Class468_Sub8.aClass98Array7889[i_219_] || (Class468_Sub8.aClass98Array7889[i_219_].aClass118Array998[i_220_]) == null)
			return false;
		Class118 class118 = (Class468_Sub8.aClass98Array7889[i_219_].aClass118Array998[i_220_]);
		if (i_218_ != -1 || -2131393857 * class118.anInt1268 != 0) {
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 51)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(1220523771))) {
				if (i_218_ == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9581) * 1575008129 && (class118.anInt1287 * -1952846363 == 395156599 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582)
						&& (58 == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 == 1007 || -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 == 25 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 == 57 || 30 == -1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587)))
					return true;
			}
		} else {
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 24)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(1677064585))) {
				if ((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225) == 58 || 1007 == -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 || -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 == 25 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225) == 57 || 30 == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225) {
					for (Class118 class118_221_ = Class117.method1981((395156599 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582)), (byte) 67); null != class118_221_; class118_221_ = Class96_Sub23.method14682((Class468_Sub8.aClass98Array7889[(((class118_221_.anInt1287) * -1952846363) >> 16)]), class118_221_, -838454718)) {
						if (-1952846363 * class118_221_.anInt1287 == -1952846363 * class118.anInt1287)
							return true;
					}
				}
			}
		}
		return false;
	}

	static long method628(Interface12 interface12, int i, int i_222_) {
		long l = 4194304L;
		long l_223_ = -9223372036854775808L;
		ObjectDefinitions class478 = IndexLoaders.MAP_REGION_DECODER.method4436(-1545435311).getObjectDefinitions(interface12.method84(341508447), 65280);
		long l_224_ = (long) (i | i_222_ << 7 | interface12.method89(1431328487) << 14 | interface12.method92(-1953925904) << 20 | 0x40000000);
		if (0 == -348507379 * class478.anInt5652)
			l_224_ |= l_223_;
		if (1 == -1062790731 * class478.anInt5687)
			l_224_ |= l;
		l_224_ |= (long) interface12.method84(136556539) << 32;
		return l_224_;
	}

	static boolean method629(Interface17 interface17, Class282_Sub53 class282_sub53) {
		return (interface17 != null && interface17.method127(class282_sub53, client.anInterface16Array7298, client.anInt7196 * -809233249, Class96_Sub21.aClass199_9438, (byte) 99));
	}

	static long method630(Interface12 interface12, int i, int i_225_) {
		long l = 4194304L;
		long l_226_ = -9223372036854775808L;
		ObjectDefinitions class478 = IndexLoaders.MAP_REGION_DECODER.method4436(-1533906704).getObjectDefinitions(interface12.method84(-862957626), 65280);
		long l_227_ = (long) (i | i_225_ << 7 | interface12.method89(1421570318) << 14 | interface12.method92(918701156) << 20 | 0x40000000);
		if (0 == -348507379 * class478.anInt5652)
			l_227_ |= l_226_;
		if (1 == -1062790731 * class478.anInt5687)
			l_227_ |= l;
		l_227_ |= (long) interface12.method84(2141380282) << 32;
		return l_227_;
	}

	static void method631(Player class521_sub1_sub1_sub2_sub1, boolean bool) {
		if (anInt169 * 2144330291 < 412) {
			if (Class84.myPlayer == class521_sub1_sub1_sub2_sub1) {
				if (client.aBool7344 && (Class506.anInt5858 * 1310510077 & 0x10) != 0)
					PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16777215, 619010179)).append(Message.aClass433_5299.translate(Class223.CURRENT_LANGUAGE, -2116185959)).toString(), Defaults8Loader.anInt5932 * -239192305, 16, -1, 0L, 0, 0, true, false, (long) (class521_sub1_sub1_sub2_sub1.anInt10314 * -1691508299), false, -1515346618);
			} else {
				String string;
				if (0 == -1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556) {
					boolean bool_228_ = true;
					if (1519880441 * (Class84.myPlayer.anInt10555) != -1 && -1 != (1519880441 * class521_sub1_sub1_sub2_sub1.anInt10555)) {
						int i = (((Class84.myPlayer.anInt10555) * 1519880441 < (1519880441 * class521_sub1_sub1_sub2_sub1.anInt10555)) ? (1519880441 * (Class84.myPlayer.anInt10555)) : (class521_sub1_sub1_sub2_sub1.anInt10555 * 1519880441));
						int i_229_ = ((-1880473919 * (Class84.myPlayer.anInt10565)) - (-1880473919 * class521_sub1_sub1_sub2_sub1.anInt10565));
						if (i_229_ < 0)
							i_229_ = -i_229_;
						if (i_229_ > i)
							bool_228_ = false;
					}
					String string_230_ = (client.CURRENT_GAME == Game.stellarDawn ? (Message.RATING_.translate(Class223.CURRENT_LANGUAGE, -1237495198)) : (Message.LEVEL_.translate(Class223.CURRENT_LANGUAGE, -1677642192)));
					if (class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919 >= class521_sub1_sub1_sub2_sub1.anInt10554 * 410641457)
						string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 2103068939)).append(bool_228_ ? (ItemIndexLoader.method7169((-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565)), (-1880473919 * (Class84.myPlayer.anInt10565)), -1302109263)) : Class59.method1163(16777215, 619010179)).append(Class2.aString15).append(string_230_).append(class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919).append(Class2.aString18).toString();
					else
						string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 1999924161)).append(bool_228_ ? (ItemIndexLoader.method7169((-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565)), (-1880473919 * (Class84.myPlayer.anInt10565)), -2103015532)) : Class59.method1163(16777215, 619010179)).append(Class2.aString15).append(string_230_).append(class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919).append("+")
								.append((410641457 * class521_sub1_sub1_sub2_sub1.anInt10554) - (-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565))).append(Class2.aString18).toString();
				} else if (-1 == (-1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556))
					string = class521_sub1_sub1_sub2_sub1.method16127(true, 1989576136);
				else
					string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 2099078836)).append(Class2.aString15).append(Message.SKILL_.translate(Class223.CURRENT_LANGUAGE, -2002216176)).append(-1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556).append(Class2.aString18).toString();
				if (client.aBool7344 && !bool && 0 != (1310510077 * Class506.anInt5858 & 0x8))
					PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16777215, 619010179)).append(string).toString(), Defaults8Loader.anInt5932 * -239192305, 15, -1, (long) (class521_sub1_sub1_sub2_sub1.anInt10314 * -1691508299), 0, 0, true, false, (long) (-1691508299 * class521_sub1_sub1_sub2_sub1.anInt10314), false, -1898123128);
				if (!bool) {
					for (int i = 7; i >= 0; i--) {
						if (client.aStringArray7329[i] != null) {
							short i_231_ = 0;
							if ((Game.runescape == client.CURRENT_GAME) && (client.aStringArray7329[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -323654065)))) {
								if (client.aBool7454 && ((class521_sub1_sub1_sub2_sub1.anInt10565) * -1880473919 > (-1880473919 * (Class84.myPlayer.anInt10565))))
									i_231_ = (short) 2000;
								if ((-1623446397 * (Class84.myPlayer.anInt10559)) != 0 && 0 != (class521_sub1_sub1_sub2_sub1.anInt10559) * -1623446397) {
									if ((class521_sub1_sub1_sub2_sub1.anInt10559) * -1623446397 == (-1623446397 * (Class84.myPlayer.anInt10559)))
										i_231_ = (short) 2000;
									else
										i_231_ = (short) 0;
								} else if (class521_sub1_sub1_sub2_sub1.aBool10550)
									i_231_ = (short) 2000;
							} else if (client.aBoolArray7330[i])
								i_231_ = (short) 2000;
							short i_232_ = (short) (i_231_ + client.aShortArray7239[i]);
							int i_233_ = (-1 != client.anIntArray7328[i] ? client.anIntArray7328[i] : 452205213 * client.anInt7342);
							PlayerAppearance.method4032(client.aStringArray7329[i], new StringBuilder().append(Class59.method1163(16777215, 619010179)).append(string).toString(), i_233_, i_232_, -1, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), 0, 0, true, false, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), false, -1258355329);
						}
					}
				} else
					PlayerAppearance.method4032(new StringBuilder().append(Class59.method1163(13421772, 619010179)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), false, -1767590566);
				if (!bool) {
					for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 68)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(1088289992))) {
						if (23 == -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) {
							((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585 = new StringBuilder().append(Class59.method1163(16777215, 619010179)).append(string).toString();
							break;
						}
					}
				}
			}
		}
	}

	static void method632(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (!aBool161) {
			class282_sub50_sub7.unlink(-371378792);
			anInt169 -= 1410722043;
			if (!((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9586) {
				long l = (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9580 * 820033947929891191L);
				Class282_Sub50_Sub15 class282_sub50_sub15;
				for (class282_sub50_sub15 = (Class282_Sub50_Sub15) aClass465_172.method7754(l); (class282_sub50_sub15 != null && !(((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588))); class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass465_172.method7747(-1258636635))) {
					/* empty */
				}
				if (null != class282_sub50_sub15 && class282_sub50_sub15.method15249(class282_sub50_sub7, (byte) 23))
					Class13.method503(class282_sub50_sub15, 1193602235);
			} else {
				for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(212811693))) {
					if (((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588)) {
						boolean bool = false;
						for (Class282_Sub50_Sub7 class282_sub50_sub7_234_ = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7941((byte) 4)); null != class282_sub50_sub7_234_; class282_sub50_sub7_234_ = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7955(1075441041))) {
							if (class282_sub50_sub7_234_ == class282_sub50_sub7) {
								if (class282_sub50_sub15.method15249(class282_sub50_sub7, (byte) 66))
									Class13.method503(class282_sub50_sub15, 1940694581);
								bool = true;
								break;
							}
						}
						if (bool)
							break;
					}
				}
			}
		}
	}

	static void method633(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (!aBool161) {
			class282_sub50_sub7.unlink(-371378792);
			anInt169 -= 1410722043;
			if (!((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9586) {
				long l = (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9580 * 820033947929891191L);
				Class282_Sub50_Sub15 class282_sub50_sub15;
				for (class282_sub50_sub15 = (Class282_Sub50_Sub15) aClass465_172.method7754(l); (class282_sub50_sub15 != null && !(((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588))); class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass465_172.method7747(-1445418704))) {
					/* empty */
				}
				if (null != class282_sub50_sub15 && class282_sub50_sub15.method15249(class282_sub50_sub7, (byte) 122))
					Class13.method503(class282_sub50_sub15, 1708876388);
			} else {
				for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(609902949))) {
					if (((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588)) {
						boolean bool = false;
						for (Class282_Sub50_Sub7 class282_sub50_sub7_235_ = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7941((byte) 4)); null != class282_sub50_sub7_235_; class282_sub50_sub7_235_ = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7955(-598282546))) {
							if (class282_sub50_sub7_235_ == class282_sub50_sub7) {
								if (class282_sub50_sub15.method15249(class282_sub50_sub7, (byte) 94))
									Class13.method503(class282_sub50_sub15, 678071538);
								bool = true;
								break;
							}
						}
						if (bool)
							break;
					}
				}
			}
		}
	}

	static void method634() {
		for (Class282_Sub50_Sub7 class282_sub50_sub7 = (Class282_Sub50_Sub7) aClass482_171.head((byte) 77); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(1319771667))) {
			if (Class14.method539(-1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587), 1555942124))
				SharedConfigsType.method2095(class282_sub50_sub7, -1273559307);
		}
	}

	static void method635(Class282_Sub50_Sub15 class282_sub50_sub15) {
		boolean bool = false;
		class282_sub50_sub15.method13452((byte) -5);
		for (Class282_Sub50_Sub15 class282_sub50_sub15_236_ = (Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4); null != class282_sub50_sub15_236_; class282_sub50_sub15_236_ = ((Class282_Sub50_Sub15) aClass477_182.method7955(-1152478505))) {
			if (Class301.method5334(class282_sub50_sub15.method15244((byte) 88), class282_sub50_sub15_236_.method15244((byte) 31), 1355238627)) {
				Class224.method3782(class282_sub50_sub15, class282_sub50_sub15_236_, -1155364036);
				bool = true;
				break;
			}
		}
		if (!bool)
			aClass477_182.method7936(class282_sub50_sub15, -1738910950);
	}

	static void method636() {
		for (Class282_Sub50_Sub7 class282_sub50_sub7 = (Class282_Sub50_Sub7) aClass482_171.head((byte) 51); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(-423604677))) {
			if (Class14.method539(-1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587), -1803597596))
				SharedConfigsType.method2095(class282_sub50_sub7, -1273559307);
		}
	}

	public static boolean method637(int i) {
		for (Class282_Sub50_Sub7 class282_sub50_sub7 = (Class282_Sub50_Sub7) aClass482_171.head((byte) 18); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) aClass482_171.next(655884343)) {
			if (Class237.method3989((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225), (byte) 0) && (long) i == (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584)))
				return true;
		}
		return false;
	}

	static Class414 method638() {
		Class414 class414;
		if (aBool187) {
			if (null != Class186.aClass8_2348 && Class176.aClass414_2200 != null)
				class414 = Class176.aClass414_2200;
			else
				class414 = Class288.aClass414_3438;
		} else
			class414 = Class288.aClass414_3438;
		anInt178 = 1217218217 * class414.anInt4979 + 362972703 * class414.anInt4978;
		return class414;
	}

	public static boolean method639(int i) {
		for (Class282_Sub50_Sub7 class282_sub50_sub7 = (Class282_Sub50_Sub7) aClass482_171.head((byte) 22); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(-283432276))) {
			if (Class237.method3989((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225), (byte) 0) && (long) i == (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584)))
				return true;
		}
		return false;
	}

	static boolean method640() {
		return anInt169 * 2144330291 > 0;
	}

	static void method641(Class282_Sub50_Sub7 class282_sub50_sub7, int i, int i_237_) {
		if (null != class282_sub50_sub7 && aClass482_171.head != class282_sub50_sub7) {
			int i_238_ = (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9581 * 1575008129);
			int i_239_ = (395156599 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582);
			int i_240_ = (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225);
			int i_241_ = (int) (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584));
			long l = (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584 * -5876141066140255231L);
			if (i_240_ >= 2000)
				i_240_ -= 2000;
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(113102200);
			OutgoingPacket class379 = null;
			if (i_240_ == 44)
				class379 = OutgoingPacket.aClass379_4539;
			else if (45 == i_240_)
				class379 = OutgoingPacket.aClass379_4571;
			else if (46 == i_240_)
				class379 = OutgoingPacket.aClass379_4623;
			else if (i_240_ == 47)
				class379 = OutgoingPacket.aClass379_4616;
			else if (48 == i_240_)
				class379 = OutgoingPacket.aClass379_4610;
			else if (i_240_ == 49)
				class379 = OutgoingPacket.aClass379_4528;
			else if (i_240_ == 50)
				class379 = OutgoingPacket.aClass379_4594;
			else if (51 == i_240_)
				class379 = OutgoingPacket.aClass379_4621;
			else if (i_240_ == 52)
				class379 = OutgoingPacket.aClass379_4580;
			else if (i_240_ == 53)
				class379 = OutgoingPacket.aClass379_4629;
			if (null != class379) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i_241_];
				if (null != class521_sub1_sub1_sub2_sub1) {
					client.anInt7293 = -1271587837 * i;
					client.anInt7294 = 1614548531 * i_237_;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379, (client.aClass184_7475.aClass432_2283), -518096050);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_241_, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1842927532) ? 1 : 0, 2138921900);
					client.aClass184_7475.method3049(class282_sub23, -235875008);
					MapRegion.method4559(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], true, (Class344.method6115(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], class521_sub1_sub1_sub2_sub1.method15805(828768449), class521_sub1_sub1_sub2_sub1.method15805(828768449), 0, 971339209)), 1838700990);
				}
			}
			if (16 == i_240_) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_237_;
				client.anInt7296 = -370989110;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4540, client.aClass184_7475.aClass432_2283, 687982883);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(client.anInt7345 * -1673073865, 1417031095);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE((-1691508299 * Class84.myPlayer.anInt10314), (short) -10215);
				class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-2038074142) ? 1 : 0, -1678329004);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(728544879 * Class7.anInt56, (byte) 104);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(-1555739329 * client.anInt7346, (short) -28835);
				client.aClass184_7475.method3049(class282_sub23, -1168163901);
			}
			if (i_240_ == 57 || 1007 == i_240_)
				Class96_Sub10.method14603(i_241_, i_239_, i_238_, ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588, (byte) 117);
			if (i_240_ == 15) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i_241_];
				if (class521_sub1_sub1_sub2_sub1 != null) {
					client.anInt7293 = i * -1271587837;
					client.anInt7294 = i_237_ * 1614548531;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4540, (client.aClass184_7475.aClass432_2283), -89852063);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-1673073865 * client.anInt7345, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(i_241_, (short) -2653);
					class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-2140503507) ? 1 : 0, -1315649269);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(Class7.anInt56 * 728544879, (byte) 104);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(client.anInt7346 * -1555739329, (short) -4491);
					client.aClass184_7475.method3049(class282_sub23, 1754782076);
					MapRegion.method4559(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], true, (Class344.method6115(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], class521_sub1_sub1_sub2_sub1.method15805(828768449), class521_sub1_sub1_sub2_sub1.method15805(828768449), 0, 971339209)), 1554734983);
				}
			}
			if (i_240_ == 2) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_237_;
				client.anInt7296 = -370989110;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4625, client.aClass184_7475.aClass432_2283, 952657433);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(i_238_ + class219.anInt2711 * 1948093437, -1183932171);
				class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1668719059) ? 1 : 0, 487962033);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV1((int) (l >>> 32) & 0x7fffffff, 569570152);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(Class7.anInt56 * 728544879);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(-1555739329 * client.anInt7346, (short) -22741);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(-1673073865 * client.anInt7345, -800257688);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(i_239_ + -1002240017 * class219.anInt2712, (short) 690);
				client.aClass184_7475.method3049(class282_sub23, 537785203);
				Class439.method7344(i_238_, i_239_, l);
			}
			OutgoingPacket class379_242_ = null;
			if (i_240_ == 9)
				class379_242_ = OutgoingPacket.aClass379_4592;
			else if (10 == i_240_)
				class379_242_ = OutgoingPacket.aClass379_4532;
			else if (i_240_ == 11)
				class379_242_ = OutgoingPacket.aClass379_4577;
			else if (12 == i_240_)
				class379_242_ = OutgoingPacket.aClass379_4599;
			else if (i_240_ == 13)
				class379_242_ = OutgoingPacket.aClass379_4622;
			else if (1003 == i_240_)
				class379_242_ = OutgoingPacket.aClass379_4530;
			if (class379_242_ != null) {
				Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_241_));
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					client.anInt7293 = -1271587837 * i;
					client.anInt7294 = i_237_ * 1614548531;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379_242_, (client.aClass184_7475.aClass432_2283), 1056398270);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_241_, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class84.method1465(-1760828954) ? 1 : 0);
					client.aClass184_7475.method3049(class282_sub23, -922248161);
					MapRegion.method4559(class521_sub1_sub1_sub2_sub2.regionBaseX[0], class521_sub1_sub1_sub2_sub2.regionBaseY[0], true, (Class344.method6115(class521_sub1_sub1_sub2_sub2.regionBaseX[0], class521_sub1_sub1_sub2_sub2.regionBaseY[0], class521_sub1_sub1_sub2_sub2.method15805(828768449), class521_sub1_sub1_sub2_sub2.method15805(828768449), 0, 971339209)), 1462907400);
				}
			}
			if (60 == i_240_) {
				if (client.rights * -644057819 > 0 && Class96_Sub8.method14577(1203434505))
					Class447.method7460(Class84.myPlayer.aByte7967, i_238_ + 1948093437 * class219.anInt2711, i_239_ + class219.anInt2712 * -1002240017, -871404308);
				else {
					client.anInt7293 = i * -1271587837;
					client.anInt7294 = 1614548531 * i_237_;
					client.anInt7296 = 1961989093;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4590, (client.aClass184_7475.aClass432_2283), 285964008);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(1948093437 * class219.anInt2711 + i_238_, -800257688);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_239_ + -1002240017 * class219.anInt2712, 1417031095);
					client.aClass184_7475.method3049(class282_sub23, -1073781945);
				}
			}
			if (i_240_ == 23) {
				if (client.rights * -644057819 > 0 && Class96_Sub8.method14577(1203434505))
					Class447.method7460(Class84.myPlayer.aByte7967, i_238_ + class219.anInt2711 * 1948093437, i_239_ + class219.anInt2712 * -1002240017, -1922720462);
				else {
					Class282_Sub23 class282_sub23 = Class282_Sub2.method12078(i_238_, i_239_, i_241_, -1759870861);
					if (1 == i_241_) {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((int) client.aFloat7365, 1417031095);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(57);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1790074477 * client.anInt7255);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(client.anInt7203 * -1864403271);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(89);
						Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((int) class385.aFloat4671, 1417031095);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((int) class385.aFloat4673, 1417031095);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(63);
					} else {
						client.anInt7293 = -1271587837 * i;
						client.anInt7294 = 1614548531 * i_237_;
						client.anInt7296 = 1961989093;
						client.anInt7295 = 0;
					}
					client.aClass184_7475.method3049(class282_sub23, -84435523);
					MapRegion.method4559(i_238_, i_239_, true, Class38.method853(i_238_, i_239_, 2134855256), 1700258862);
				}
			}
			if (17 == i_240_) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_237_;
				client.anInt7296 = -370989110;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4583, client.aClass184_7475.aClass432_2283, 531796025);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(client.anInt7346 * -1555739329, -800257688);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(728544879 * Class7.anInt56, (byte) 104);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_241_, 1417031095);
				class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1852708483) ? 1 : 0, 524024330);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(client.anInt7345 * -1673073865, -1183932171);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(class219.anInt2712 * -1002240017 + i_239_, -1183932171);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(class219.anInt2711 * 1948093437 + i_238_, (short) -3356);
				client.aClass184_7475.method3049(class282_sub23, 787023911);
				client.method12073(i_238_, i_239_, -160959233);
			}
			if (i_240_ == 59) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_237_;
				client.anInt7296 = 1961989093;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4589, client.aClass184_7475.aClass432_2283, 1704141374);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(client.anInt7346 * -1555739329, (short) -15385);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(class219.anInt2712 * -1002240017 + i_239_, (short) -28269);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV1(728544879 * Class7.anInt56, 1553321504);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(-1673073865 * client.anInt7345, -800257688);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(class219.anInt2711 * 1948093437 + i_238_, (short) -626);
				client.aClass184_7475.method3049(class282_sub23, 1410191987);
				MapRegion.method4559(i_238_, i_239_, true, Class38.method853(i_238_, i_239_, -253882571), 1396199282);
			}
			if (30 == i_240_ && null == client.aClass118_7352) {
				Class158_Sub2.method14355(i_239_, i_238_, -1470939774);
				client.aClass118_7352 = Index.method5694(i_239_, i_238_, 1328732496);
				if (null != client.aClass118_7352)
					Class109.method1858(client.aClass118_7352, (byte) 46);
			}
			if (i_240_ == 58) {
				Class118 class118 = Index.method5694(i_239_, i_238_, -2100158076);
				if (null != class118)
					Class151.method2590(class118, (byte) 108);
			}
			if (25 == i_240_) {
				Class118 class118 = Index.method5694(i_239_, i_238_, -657963535);
				if (class118 != null) {
					Class60.method1170(-609337146);
					Class282_Sub10 class282_sub10 = client.method11633(class118);
					Class304.method5409(class118, class282_sub10.method12179(651334852), class282_sub10.anInt7541 * 1831058647, (byte) -87);
					client.aString7275 = Class346.method6157(class118, 1420499055);
					if (client.aString7275 == null)
						client.aString7275 = "Null";
					client.aString7356 = new StringBuilder().append(class118.aString1369).append(Class59.method1163(16777215, 619010179)).toString();
				}
			} else {
				OutgoingPacket class379_243_ = null;
				if (18 == i_240_)
					class379_243_ = OutgoingPacket.aClass379_4559;
				else if (19 == i_240_)
					class379_243_ = OutgoingPacket.aClass379_4552;
				else if (i_240_ == 20)
					class379_243_ = OutgoingPacket.aClass379_4581;
				else if (21 == i_240_)
					class379_243_ = OutgoingPacket.aClass379_4535;
				else if (i_240_ == 22)
					class379_243_ = OutgoingPacket.aClass379_4564;
				else if (i_240_ == 1004)
					class379_243_ = OutgoingPacket.aClass379_4588;
				if (null != class379_243_) {
					client.anInt7293 = i * -1271587837;
					client.anInt7294 = i_237_ * 1614548531;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379_243_, (client.aClass184_7475.aClass432_2283), 2029186337);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(i_241_, -1183932171);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByteC(Class84.method1465(-1763171698) ? 1 : 0, 1203558743);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class219.anInt2712 * -1002240017 + i_239_, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(i_238_ + class219.anInt2711 * 1948093437, -800257688);
					client.aClass184_7475.method3049(class282_sub23, 1607823047);
					client.method12073(i_238_, i_239_, 908189388);
				}
				if (8 == i_240_) {
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_241_));
					if (null != class282_sub47) {
						NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
						client.anInt7293 = -1271587837 * i;
						client.anInt7294 = 1614548531 * i_237_;
						client.anInt7296 = -370989110;
						client.anInt7295 = 0;
						Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4568, (client.aClass184_7475.aClass432_2283), 630423246);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(728544879 * Class7.anInt56, (byte) 104);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(i_241_, -1183932171);
						class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1737477191) ? 1 : 0, -1367310742);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(client.anInt7346 * -1555739329, -1183932171);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(client.anInt7345 * -1673073865, -800257688);
						client.aClass184_7475.method3049(class282_sub23, 1409578616);
						MapRegion.method4559(class521_sub1_sub1_sub2_sub2.regionBaseX[0], class521_sub1_sub1_sub2_sub2.regionBaseY[0], true, Class344.method6115((class521_sub1_sub1_sub2_sub2.regionBaseX[0]), (class521_sub1_sub1_sub2_sub2.regionBaseY[0]), class521_sub1_sub1_sub2_sub2.method15805(828768449), class521_sub1_sub1_sub2_sub2.method15805(828768449), 0, 971339209), 1542329613);
					}
				}
				OutgoingPacket class379_244_ = null;
				if (i_240_ == 3)
					class379_244_ = OutgoingPacket.aClass379_4602;
				else if (i_240_ == 4)
					class379_244_ = OutgoingPacket.aClass379_4620;
				else if (i_240_ == 5)
					class379_244_ = OutgoingPacket.aClass379_4565;
				else if (i_240_ == 6)
					class379_244_ = OutgoingPacket.aClass379_4626;
				else if (i_240_ == 1001)
					class379_244_ = OutgoingPacket.aClass379_4575;
				else if (i_240_ == 1002)
					class379_244_ = OutgoingPacket.OBJECT_EXAMINE;
				if (class379_244_ != null) {
					client.anInt7293 = -1271587837 * i;
					client.anInt7294 = 1614548531 * i_237_;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379_244_, (client.aClass184_7475.aClass432_2283), 1930671627);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_239_ + -1002240017 * class219.anInt2712, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_238_ + class219.anInt2711 * 1948093437, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeInt((int) (l >>> 32) & 0x7fffffff);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte128(Class84.method1465(-1966004868) ? 1 : 0, -318450211);
					client.aClass184_7475.method3049(class282_sub23, 932372082);
					Class439.method7344(i_238_, i_239_, l);
				}
				if (1008 == i_240_ || 1009 == i_240_ || 1010 == i_240_ || 1011 == i_240_ || 1012 == i_240_)
					Class6.method303(i_240_, i_241_, i_238_, 557087036);
				if (client.aBool7344)
					Class60.method1170(-609337146);
				if (Class401.aClass118_4825 != null && -1694129533 * client.anInt7297 == 0)
					Class109.method1858(Class401.aClass118_4825, (byte) -32);
			}
		}
	}

	static int method642(Class282_Sub50_Sub7 class282_sub50_sub7, Class414 class414) {
		String string = IncomingPacket.method6380(class282_sub50_sub7, 1745865674);
		int[] is = Class534_Sub1.method12815(class282_sub50_sub7, -1149652363);
		if (is != null)
			string = new StringBuilder().append(string).append(Class15.method547(is, 1886112825)).toString();
		int i = class414.method6947(string, Class115.aClass160Array1248, -1528901475);
		if (((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9577)
			i += Exception_Sub1.aClass160_10075.method2747() + 4;
		return i;
	}

	static void method643(GraphicalRenderer class505) {
		if (aBool161)
			Class354.method6216(class505, 731062139);
		else
			Class268.method4800(class505, (byte) 89);
	}

	static void method644(GraphicalRenderer class505) {
		if (aBool161)
			Class354.method6216(class505, 1139920533);
		else
			Class268.method4800(class505, (byte) 118);
	}

	static void method645(int i, int i_245_) {
		if (Class58.aClass529_527.aBool7044 || (1 != 2144330291 * anInt169 && (!Class96_Sub6.aBool9173 || 2 != 2144330291 * anInt169 || !(((Class282_Sub50_Sub7) Class1.aClass282_Sub50_Sub7_12).aString9576.equals(Message.FACE_HERE.translate((Class223.CURRENT_LANGUAGE), -642166855)))))) {
			Class414 class414 = Class114.method1887(-721090543);
			int i_246_ = (class414.method6946(Message.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE, -1708130889), -1967833701));
			int i_247_;
			if (!aBool162) {
				for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 69)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(1017914814))) {
					int i_248_ = Class282_Sub50_Sub17.method15507(class282_sub50_sub7, class414, 943671530);
					if (i_248_ > i_246_)
						i_246_ = i_248_;
				}
				i_246_ += 8;
				i_247_ = 21 + 2144330291 * anInt169 * (anInt178 * 997766473);
				Class110.anInt1104 = -1149880001 * ((aBool187 ? 26 : 22) + 2144330291 * anInt169 * (anInt178 * 997766473));
			} else {
				for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(1015870795))) {
					int i_249_;
					if (1 == (((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769) * 2026887253)
						i_249_ = (Class282_Sub50_Sub17.method15507(((Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)), class414, 943671530));
					else
						i_249_ = Class163.method2840(class282_sub50_sub15, class414, 444800403);
					if (i_249_ > i_246_)
						i_246_ = i_249_;
				}
				i_246_ += 8;
				i_247_ = 21 + 997766473 * anInt178 * (anInt170 * 292682521);
				Class110.anInt1104 = (anInt178 * 997766473 * (anInt170 * 292682521) + (aBool187 ? 26 : 22)) * -1149880001;
			}
			i_246_ += 10;
			int i_250_ = i - i_246_ / 2;
			if (i_250_ + i_246_ > -418109423 * Class349.anInt4083)
				i_250_ = Class349.anInt4083 * -418109423 - i_246_;
			if (i_250_ < 0)
				i_250_ = 0;
			int i_251_ = i_245_;
			if (i_251_ + i_247_ > Class263.anInt3243 * -969250379)
				i_251_ = Class263.anInt3243 * -969250379 - i_247_;
			if (i_251_ < 0)
				i_251_ = 0;
			Class301.anInt3555 = i_250_ * 1699362117;
			Class184.anInt2300 = -1865657955 * i_251_;
			Class158_Sub2.anInt8975 = 363510355 * i_246_;
			anInt156 = (int) (Math.random() * 24.0) * -2033238375;
			aBool161 = true;
		}
	}

	static boolean method646(int i) {
		return 57 == i || i == 58 || i == 1007 || i == 25 || 30 == i;
	}

	static void method647() {
		for (Class282_Sub50_Sub15 class282_sub50_sub15 = (Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(-471196930))) {
			if ((((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 * 2026887253) > 1) {
				((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 = 0;
				aClass229_164.put(class282_sub50_sub15, (((Class282_Sub50_Sub7) (Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)).aLong9580 * 820033947929891191L));
				((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7935((byte) -12);
			}
		}
		anInt170 = 0;
		anInt169 = 0;
		aClass482_171.method8118(628140699);
		aClass465_172.method7749(946825641);
		aClass477_182.method7935((byte) -3);
		Class361.method6269(aClass282_Sub50_Sub7_157, -1498808978);
	}

	static void method648() {
		for (Class282_Sub50_Sub15 class282_sub50_sub15 = (Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(-2120793728))) {
			if ((((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 * 2026887253) > 1) {
				((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 = 0;
				aClass229_164.put(class282_sub50_sub15, (((Class282_Sub50_Sub7) (Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)).aLong9580 * 820033947929891191L));
				((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7935((byte) -22);
			}
		}
		anInt170 = 0;
		anInt169 = 0;
		aClass482_171.method8118(-1726554475);
		aClass465_172.method7749(-1726515492);
		aClass477_182.method7935((byte) 77);
		Class361.method6269(aClass282_Sub50_Sub7_157, -1498808978);
	}

	public static void method649() {
		for (Class282_Sub50_Sub15 class282_sub50_sub15 = (Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(-505836912))) {
			if ((((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 * 2026887253) > 1) {
				((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 = 0;
				aClass229_164.put(class282_sub50_sub15, (820033947929891191L * (((Class282_Sub50_Sub7) (Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)).aLong9580)));
				((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7935((byte) 4);
			}
		}
		anInt170 = 0;
		anInt169 = 0;
		aClass482_171.method8118(656400155);
		aClass465_172.method7749(1934017862);
		aClass477_182.method7935((byte) -24);
		aBool161 = false;
	}

	public static void method650() {
		for (Class282_Sub50_Sub15 class282_sub50_sub15 = (Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(-874006145))) {
			if ((((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 * 2026887253) > 1) {
				((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 = 0;
				aClass229_164.put(class282_sub50_sub15, (820033947929891191L * (((Class282_Sub50_Sub7) (Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)).aLong9580)));
				((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7935((byte) -24);
			}
		}
		anInt170 = 0;
		anInt169 = 0;
		aClass482_171.method8118(-685952454);
		aClass465_172.method7749(-427936772);
		aClass477_182.method7935((byte) 3);
		aBool161 = false;
	}

	public static void method651() {
		Class61.aClass160_647 = null;
		Class60.aClass160_612 = null;
		Class467.aClass160_5576 = null;
		AttributeDefault.aClass160_5339 = null;
		Class290.aClass160_3452 = null;
		Class354.aClass160_4110 = null;
		Class125.aClass160_1571 = null;
		Class149_Sub2.aClass160_9315 = null;
		Class186.aClass8_2348 = null;
		Class176.aClass414_2200 = null;
	}

	public static void method652() {
		Class61.aClass160_647 = null;
		Class60.aClass160_612 = null;
		Class467.aClass160_5576 = null;
		AttributeDefault.aClass160_5339 = null;
		Class290.aClass160_3452 = null;
		Class354.aClass160_4110 = null;
		Class125.aClass160_1571 = null;
		Class149_Sub2.aClass160_9315 = null;
		Class186.aClass8_2348 = null;
		Class176.aClass414_2200 = null;
	}

	public static void method653() {
		Class61.aClass160_647 = null;
		Class60.aClass160_612 = null;
		Class467.aClass160_5576 = null;
		AttributeDefault.aClass160_5339 = null;
		Class290.aClass160_3452 = null;
		Class354.aClass160_4110 = null;
		Class125.aClass160_1571 = null;
		Class149_Sub2.aClass160_9315 = null;
		Class186.aClass8_2348 = null;
		Class176.aClass414_2200 = null;
	}

	static String method654(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (null == ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585 || ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585.length() == 0) {
			if (((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588 != null && ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588.length() > 0)
				return new StringBuilder().append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576).append(Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE, -1726076032)).append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588).toString();
			return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576;
		}
		if (((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588 != null && ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588.length() > 0)
			return new StringBuilder().append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576).append(Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE, -229794955)).append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588).append(Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE, -1228622600)).append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585).toString();
		return new StringBuilder().append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576).append(Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE, -698349795)).append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585).toString();
	}

	public static void method655() {
		Class96.method1607((byte) 13);
		Class115.aClass160Array1248 = null;
	}

	static void method656(GraphicalRenderer class505, int i, int i_252_) {
		if (i >= 0 && i_252_ >= 0 && aClass384_158 != null) {
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(566664299);
			Class384 class384 = class505.method8449();
			class505.method8424(aClass384_158);
			class505.method8457(aClass294_155);
			class505.r(anInt180 * -1747787169, 1607392711 * anInt181, anInt180 * -1747787169 + anInt176 * -2026336709, anInt184 * 919355353 + 1607392711 * anInt181);
			class505.method8617(-1747787169 * anInt180, 1607392711 * anInt181, anInt176 * -2026336709, 919355353 * anInt184);
			class384.method6522(aClass294_155);
			class384.method6523(aClass384_158);
			class384.method6524();
			int i_253_ = i - -1747787169 * anInt180;
			int i_254_ = i_252_ - anInt181 * 1607392711;
			if (IndexLoaders.MAP_REGION_DECODER.method4430(-1053173153) != null && (!client.aBool7344 || (1310510077 * Class506.anInt5858 & 0x40) != 0)) {
				int i_255_ = -1;
				int i_256_ = -1;
				float f = (2.0F * (float) i_253_ / (float) (anInt176 * -2026336709) - 1.0F);
				float f_257_ = (2.0F * (float) i_254_ / (float) (919355353 * anInt184) - 1.0F);
				class384.method6527(f, f_257_, -1.0F, aFloatArray194);
				float f_258_ = aFloatArray194[0] / aFloatArray194[3];
				float f_259_ = aFloatArray194[1] / aFloatArray194[3];
				float f_260_ = aFloatArray194[2] / aFloatArray194[3];
				class384.method6527(f, f_257_, 1.0F, aFloatArray194);
				float f_261_ = aFloatArray194[0] / aFloatArray194[3];
				float f_262_ = aFloatArray194[1] / aFloatArray194[3];
				float f_263_ = aFloatArray194[2] / aFloatArray194[3];
				float f_264_ = Class4.method288(f_258_, f_259_, f_260_, f_261_, f_262_, f_263_, 4, -757882293);
				if (f_264_ > 0.0F) {
					float f_265_ = f_261_ - f_258_;
					float f_266_ = f_263_ - f_260_;
					int i_267_ = (int) (f_265_ * f_264_ + f_258_);
					int i_268_ = (int) (f_264_ * f_266_ + f_260_);
					i_255_ = i_267_ + (Class84.myPlayer.method15805(828768449) - 1 << 8) >> 9;
					i_256_ = i_268_ + (Class84.myPlayer.method15805(828768449) - 1 << 8) >> 9;
					int i_269_ = Class84.myPlayer.aByte7967;
					if (i_269_ < 3 && ((IndexLoaders.MAP_REGION_DECODER.method4433(33386298).aByteArrayArrayArray3638[1][i_267_ >> 9][i_268_ >> 9]) & 0x2) != 0)
						i_269_++;
				}
				if (-1 != i_255_ && i_256_ != -1) {
					if (client.aBool7344 && 0 != (1310510077 * Class506.anInt5858 & 0x40)) {
						Class118 class118 = Index.method5694(Class7.anInt56 * 728544879, (client.anInt7345 * -1673073865), 1586987339);
						if (class118 != null)
							PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(" ").append(Class2.aString17).append(" ").toString(), (Defaults8Loader.anInt5932 * -239192305), 59, -1, 0L, i_255_, i_256_, true, false, (long) (i_255_ << 32 | i_256_), true, -1034266147);
						else
							Class60.method1170(-609337146);
					} else {
						if (Class96_Sub6.aBool9173)
							PlayerAppearance.method4032((Message.FACE_HERE.translate(Class223.CURRENT_LANGUAGE, -342419320)), "", -1, 60, -1, 0L, i_255_, i_256_, true, false, (long) (i_255_ << 32 | i_256_), true, -1373149823);
						PlayerAppearance.method4032(Class85.aString817, "", 460745521 * client.anInt7311, 23, -1, 0L, i_255_, i_256_, true, false, (long) (i_255_ << 32 | i_256_), true, -1248159211);
					}
				}
			}
			Login class284 = IndexLoaders.MAP_REGION_DECODER.method4430(-1941918104).aClass284_2648;
			int i_270_ = i;
			int i_271_ = i_252_;
			List list = class284.aList3388;
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class285 class285 = (Class285) iterator.next();
				if ((client.aBool7372 || (Class84.myPlayer.aByte7967 == class285.aClass521_Sub1_3391.aByte7967)) && class285.method5019(class505, i_270_, i_271_, -431516828)) {
					boolean bool = false;
					boolean bool_272_ = false;
					int i_273_;
					int i_274_;
					if (class285.aClass521_Sub1_3391 instanceof Class521_Sub1_Sub1) {
						i_273_ = ((Class521_Sub1_Sub1) class285.aClass521_Sub1_3391).aShort9458;
						i_274_ = ((Class521_Sub1_Sub1) class285.aClass521_Sub1_3391).aShort9456;
					} else {
						Class385 class385 = (class285.aClass521_Sub1_3391.method11166().aClass385_3595);
						i_273_ = (int) class385.aFloat4671 >> 9;
						i_274_ = (int) class385.aFloat4673 >> 9;
					}
					if (class285.aClass521_Sub1_3391 instanceof Player) {
						Player class521_sub1_sub1_sub2_sub1 = ((Player) class285.aClass521_Sub1_3391);
						int i_275_ = class521_sub1_sub1_sub2_sub1.method15805(828768449);
						Class385 class385 = (class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
						if ((0 == (i_275_ & 0x1) && 0 == ((int) class385.aFloat4671 & 0x1ff) && 0 == ((int) class385.aFloat4673 & 0x1ff)) || (1 == (i_275_ & 0x1) && 256 == ((int) class385.aFloat4671 & 0x1ff) && (((int) class385.aFloat4673 & 0x1ff) == 256))) {
							int i_276_ = ((int) class385.aFloat4671 - (class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1 << 8));
							int i_277_ = ((int) class385.aFloat4673 - (class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1 << 8));
							for (int i_278_ = 0; i_278_ < client.anInt7211 * -685729279; i_278_++) {
								Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) client.anIntArray7212[i_278_])));
								if (class282_sub47 != null) {
									NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
									if (((class521_sub1_sub1_sub2_sub2.anInt10375) * 717008059 != client.cycles * -1809259861) && (class521_sub1_sub1_sub2_sub2.aBool10318)) {
										Class385 class385_279_ = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
										int i_280_ = ((int) class385_279_.aFloat4671 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
										int i_281_ = ((int) class385_279_.aFloat4673 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
										if (i_280_ >= i_276_ && (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_280_ - i_276_ >> 9))) && i_281_ >= i_277_ && (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_281_ - i_277_ >> 9)))) {
											WorldMapAreaDefs.method3736(class521_sub1_sub1_sub2_sub2, ((Class84.myPlayer.aByte7967) != (class285.aClass521_Sub1_3391.aByte7967)), 1530589427);
											class521_sub1_sub1_sub2_sub2.anInt10375 = (client.cycles * 1977662161);
										}
									}
								}
							}
							int i_282_ = Class197.NUM_PLAYER_INDICES * -963499271;
							int[] is = Class197.PLAYER_INDICES;
							for (int i_283_ = 0; i_283_ < i_282_; i_283_++) {
								Player class521_sub1_sub1_sub2_sub1_284_ = (client.players[is[i_283_]]);
								if (class521_sub1_sub1_sub2_sub1_284_ != null && ((class521_sub1_sub1_sub2_sub1_284_.anInt10375) * 717008059 != -1809259861 * client.cycles) && (class521_sub1_sub1_sub2_sub1 != class521_sub1_sub1_sub2_sub1_284_) && (class521_sub1_sub1_sub2_sub1_284_.aBool10318)) {
									Class385 class385_285_ = (class521_sub1_sub1_sub2_sub1_284_.method11166().aClass385_3595);
									int i_286_ = ((int) class385_285_.aFloat4671 - (class521_sub1_sub1_sub2_sub1_284_.method15805(828768449) - 1 << 8));
									int i_287_ = ((int) class385_285_.aFloat4673 - (class521_sub1_sub1_sub2_sub1_284_.method15805(828768449) - 1 << 8));
									if (i_286_ >= i_276_ && (class521_sub1_sub1_sub2_sub1_284_.method15805(828768449) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_286_ - i_276_ >> 9))) && i_287_ >= i_277_ && (class521_sub1_sub1_sub2_sub1_284_.method15805(828768449) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_287_ - i_277_ >> 9)))) {
										Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1_284_, ((class285.aClass521_Sub1_3391.aByte7967) != (Class84.myPlayer.aByte7967)), 1557506355);
										class521_sub1_sub1_sub2_sub1_284_.anInt10375 = client.cycles * 1977662161;
									}
								}
							}
						}
						if (717008059 * class521_sub1_sub1_sub2_sub1.anInt10375 == client.cycles * -1809259861)
							continue;
						Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1, (class285.aClass521_Sub1_3391.aByte7967 != (Class84.myPlayer.aByte7967)), 1557506355);
						class521_sub1_sub1_sub2_sub1.anInt10375 = 1977662161 * client.cycles;
					}
					if (class285.aClass521_Sub1_3391 instanceof NPC) {
						NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class285.aClass521_Sub1_3391);
						if (null != class521_sub1_sub1_sub2_sub2.aClass409_10580) {
							Class385 class385 = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
							if ((0 == (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) & 0x1) && 0 == ((int) class385.aFloat4671 & 0x1ff) && 0 == ((int) class385.aFloat4673 & 0x1ff)) || (1 == ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) & 0x1) && 256 == ((int) class385.aFloat4671 & 0x1ff) && 256 == ((int) class385.aFloat4673 & 0x1ff))) {
								int i_288_ = ((int) class385.aFloat4671 - (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) - 1 << 8));
								int i_289_ = ((int) class385.aFloat4673 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
								for (int i_290_ = 0; i_290_ < client.anInt7211 * -685729279; i_290_++) {
									Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) client.anIntArray7212[i_290_])));
									if (null != class282_sub47) {
										NPC class521_sub1_sub1_sub2_sub2_291_ = ((NPC) class282_sub47.anObject8068);
										if (((717008059 * (class521_sub1_sub1_sub2_sub2_291_.anInt10375)) != -1809259861 * client.cycles) && (class521_sub1_sub1_sub2_sub2 != class521_sub1_sub1_sub2_sub2_291_) && (class521_sub1_sub1_sub2_sub2_291_.aBool10318)) {
											Class385 class385_292_ = (class521_sub1_sub1_sub2_sub2_291_.method11166().aClass385_3595);
											int i_293_ = ((int) (class385_292_.aFloat4671) - ((1203434505 * (class521_sub1_sub1_sub2_sub2_291_.aClass409_10580.anInt4858)) - 1 << 8));
											int i_294_ = ((int) (class385_292_.aFloat4673) - (((class521_sub1_sub1_sub2_sub2_291_.aClass409_10580.anInt4858) * 1203434505) - 1 << 8));
											if (i_293_ >= i_288_ && ((1203434505 * (class521_sub1_sub1_sub2_sub2_291_.aClass409_10580.anInt4858)) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_293_ - i_288_ >> 9))) && i_294_ >= i_289_ && ((class521_sub1_sub1_sub2_sub2_291_.aClass409_10580.anInt4858) * 1203434505 <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_294_ - i_289_ >> 9)))) {
												WorldMapAreaDefs.method3736(class521_sub1_sub1_sub2_sub2_291_, ((Class84.myPlayer.aByte7967) != (class285.aClass521_Sub1_3391.aByte7967)), 1432201950);
												class521_sub1_sub1_sub2_sub2_291_.anInt10375 = (1977662161 * client.cycles);
											}
										}
									}
								}
								int i_295_ = Class197.NUM_PLAYER_INDICES * -963499271;
								int[] is = Class197.PLAYER_INDICES;
								for (int i_296_ = 0; i_296_ < i_295_; i_296_++) {
									Player class521_sub1_sub1_sub2_sub1 = (client.players[is[i_296_]]);
									if (null != class521_sub1_sub1_sub2_sub1 && (-1809259861 * client.cycles != (717008059 * (class521_sub1_sub1_sub2_sub1.anInt10375))) && (class521_sub1_sub1_sub2_sub1.aBool10318)) {
										Class385 class385_297_ = (class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
										int i_298_ = ((int) class385_297_.aFloat4671 - ((class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1) << 8));
										int i_299_ = ((int) class385_297_.aFloat4673 - ((class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1) << 8));
										if (i_298_ >= i_288_ && (class521_sub1_sub1_sub2_sub1.method15805(828768449) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_298_ - i_288_ >> 9))) && i_299_ >= i_289_ && (class521_sub1_sub1_sub2_sub1.method15805(828768449) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_299_ - i_289_ >> 9)))) {
											Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1, ((class285.aClass521_Sub1_3391.aByte7967) != (Class84.myPlayer.aByte7967)), 1557506355);
											class521_sub1_sub1_sub2_sub1.anInt10375 = (client.cycles * 1977662161);
										}
									}
								}
							}
							if ((class521_sub1_sub1_sub2_sub2.anInt10375 * 717008059) == -1809259861 * client.cycles)
								continue;
							WorldMapAreaDefs.method3736(class521_sub1_sub1_sub2_sub2, ((Class84.myPlayer.aByte7967) != class285.aClass521_Sub1_3391.aByte7967), 1603364319);
							class521_sub1_sub1_sub2_sub2.anInt10375 = client.cycles * 1977662161;
						}
					}
					if (class285.aClass521_Sub1_3391 instanceof Class521_Sub1_Sub2_Sub1) {
						int i_300_ = class219.anInt2711 * 1948093437 + i_273_;
						int i_301_ = i_274_ + class219.anInt2712 * -1002240017;
						Class282_Sub29 class282_sub29 = ((Class282_Sub29) (client.aClass465_7414.method7754((long) ((class285.aClass521_Sub1_3391.aByte7967) << 28 | i_301_ << 14 | i_300_))));
						if (null != class282_sub29) {
							int i_302_ = 0;
							Class282_Sub34 class282_sub34 = ((Class282_Sub34) class282_sub29.aClass482_7708.method8065(-1766562424));
							while (class282_sub34 != null) {
								ItemDefinitions class425 = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(1964309863 * class282_sub34.anInt7853, 2005030981));
								int i_303_;
								if (class425.aBool5101)
									i_303_ = class425.anInt5102 * 712312847;
								else if (class425.members)
									i_303_ = -1519092215 * (Class149_Sub2.DEFAULTS_LOADER_7.anInt5880);
								else
									i_303_ = 725268415 * (Class149_Sub2.DEFAULTS_LOADER_7.anInt5881);
								if (client.aBool7344 && ((Class84.myPlayer.aByte7967) == (class285.aClass521_Sub1_3391.aByte7967))) {
									AttributeDefault class437 = ((Class96_Sub12.anInt9319 * -1605351655) != -1 ? (IndexLoaders.ITEM_DEFAULTS.method7069((-1605351655 * Class96_Sub12.anInt9319), (byte) 0)) : null);
									if ((Class506.anInt5858 * 1310510077 & 0x1) != 0 && (null == class437 || ((class425.method7099((Class96_Sub12.anInt9319 * -1605351655), (-1741480635 * class437.anInt5337), -1632976891)) != (class437.anInt5337 * -1741480635))))
										PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(i_303_, 619010179)).append(class425.aString5043).toString(), Defaults8Loader.anInt5932 * -239192305, 17, -1, (long) (class282_sub34.anInt7853 * 1964309863), i_273_, i_274_, true, false, (long) i_302_, false, -1756380231);
								}
								if (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967)) {
									String[] strings = class425.groundOptions;
									for (int i_304_ = strings.length - 1; i_304_ >= 0; i_304_--) {
										if (null != strings[i_304_]) {
											int i_305_ = 0;
											int i_306_ = client.anInt7342 * 452205213;
											if (0 == i_304_)
												i_305_ = 18;
											if (i_304_ == 1)
												i_305_ = 19;
											if (2 == i_304_)
												i_305_ = 20;
											if (3 == i_304_)
												i_305_ = 21;
											if (4 == i_304_)
												i_305_ = 22;
											if (5 == i_304_)
												i_305_ = 1004;
											if (i_304_ == (class425.anInt5059 * -934531831))
												i_306_ = (1152999273 * class425.anInt5055);
											if (i_304_ == (class425.anInt5060 * 1533030603))
												i_306_ = (class425.anInt5056 * -1540078225);
											PlayerAppearance.method4032(strings[i_304_], new StringBuilder().append(Class59.method1163(i_303_, 619010179)).append(class425.aString5043).toString(), i_306_, i_305_, -1, (long) (1964309863 * (class282_sub34.anInt7853)), i_273_, i_274_, true, false, (long) i_302_, false, -1106351558);
										}
									}
								}
								class282_sub34 = ((Class282_Sub34) class282_sub29.aClass482_7708.method8068((byte) 120));
								i_302_++;
							}
						}
					}
					if (class285.aClass521_Sub1_3391 instanceof Interface12) {
						Interface12 interface12 = (Interface12) class285.aClass521_Sub1_3391;
						ObjectDefinitions class478 = (IndexLoaders.MAP_REGION_DECODER.method4436(-1346234189).getObjectDefinitions(interface12.method84(1220367215), 65280));
						if (null != class478.anIntArray5650)
							class478 = class478.method8013((Class158_Sub1.aClass3_8507), (byte) -63);
						if (null != class478) {
							if (client.aBool7344 && (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967))) {
								AttributeDefault class437 = (-1 != (-1605351655 * Class96_Sub12.anInt9319) ? (IndexLoaders.ITEM_DEFAULTS.method7069((Class96_Sub12.anInt9319 * -1605351655), (byte) 0)) : null);
								if (0 != (1310510077 * Class506.anInt5858 & 0x4) && (class437 == null || ((class478.method7963((Class96_Sub12.anInt9319 * -1605351655), -1741480635 * class437.anInt5337, 291498876)) != (-1741480635 * class437.anInt5337))))
									PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(65535, 619010179)).append(class478.aString5638).toString(), Defaults8Loader.anInt5932 * -239192305, 2, -1, Class329.method5905(interface12, i_273_, i_274_, (byte) -124), i_273_, i_274_, true, false, (long) interface12.hashCode(), false, -1053134061);
							}
							if (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967)) {
								String[] strings = class478.options;
								if (null != strings) {
									for (int i_307_ = strings.length - 1; i_307_ >= 0; i_307_--) {
										if (strings[i_307_] != null) {
											int i_308_ = 0;
											int i_309_ = 452205213 * client.anInt7342;
											if (i_307_ == 0)
												i_308_ = 3;
											if (i_307_ == 1)
												i_308_ = 4;
											if (2 == i_307_)
												i_308_ = 5;
											if (i_307_ == 3)
												i_308_ = 6;
											if (4 == i_307_)
												i_308_ = 1001;
											if (i_307_ == 5)
												i_308_ = 1002;
											if (class478.anInt5705 * -176888381 == i_307_)
												i_309_ = (1362609543 * class478.anInt5665);
											if (570422367 * class478.anInt5670 == i_307_)
												i_309_ = (-305458077 * class478.anInt5666);
											PlayerAppearance.method4032(strings[i_307_], new StringBuilder().append(Class59.method1163(65535, 619010179)).append(class478.aString5638).toString(), i_309_, i_308_, -1, (Class329.method5905(interface12, i_273_, i_274_, (byte) -43)), i_273_, i_274_, true, false, (long) interface12.hashCode(), false, -1063075986);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static String method657(Class118 class118, int i) {
		if (!client.method11633(class118).method12178(i, (short) -30878) && class118.anObjectArray1410 == null)
			return null;
		if (class118.aStringArray1352 == null || class118.aStringArray1352.length <= i || class118.aStringArray1352[i] == null || class118.aStringArray1352[i].trim().length() == 0) {
			if (client.aBool7168)
				return new StringBuilder().append("Hidden-").append(i).toString();
			return null;
		}
		return class118.aStringArray1352[i];
	}

	public static String method658(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (aBool161 || null == class282_sub50_sub7)
			return "";
		return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576;
	}

	static void method659(int i, int i_310_) {
		anInt180 = i * 797571487;
		anInt181 = -2139368457 * i_310_;
	}

	static void method660(int i, int i_311_) {
		anInt180 = i * 797571487;
		anInt181 = -2139368457 * i_311_;
	}

	public static String method661(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (aBool161 || null == class282_sub50_sub7)
			return "";
		int[] is = Class534_Sub1.method12815(class282_sub50_sub7, -1251840349);
		if (null == is)
			return "";
		return Class15.method547(is, 1984734119);
	}

	static void method662(Class118 class118, int i, int i_312_) {
		aClass118_183 = class118;
		anInt195 = i * 1511257025;
		anInt179 = -248935111 * i_312_;
	}

	static void method663(Class118 class118, int i, int i_313_) {
		aClass118_183 = class118;
		anInt195 = i * 1511257025;
		anInt179 = -248935111 * i_313_;
	}

	static void method664(Class118 class118, int i, int i_314_) {
		aClass118_183 = class118;
		anInt195 = i * 1511257025;
		anInt179 = -248935111 * i_314_;
	}

	static void method665(int i, int i_315_) {
		if (anInt167 * -468886213 == 1)
			Class96_Sub4.method13789(Class46.aClass282_Sub50_Sub7_438, i, i_315_, 1217250744);
		else if (2 == -468886213 * anInt167)
			Class262.method4653(i, i_315_, -1097299104);
		anInt167 = 0;
		Class46.aClass282_Sub50_Sub7_438 = null;
	}

	static int method666() {
		if (null == client.aClass118_7257) {
			if (!aBool161) {
				if (Class149_Sub2.DEFAULTS_LOADER_7.aBool5876) {
					if (aClass282_Sub50_Sub7_168 != null)
						return (((Class282_Sub50_Sub7) aClass282_Sub50_Sub7_168).anInt9578 * -1332134173);
				} else if (null != Class96_Sub23.aClass282_Sub50_Sub7_9445)
					return (-1332134173 * (((Class282_Sub50_Sub7) Class96_Sub23.aClass282_Sub50_Sub7_9445).anInt9578));
			} else {
				Class414 class414 = Class114.method1887(404014265);
				int i = Class163.aClass209_2031.method3569(2049897651);
				int i_316_ = Class163.aClass209_2031.method3570(756095591);
				if (!aBool162) {
					if (i > 1742345613 * Class301.anInt3555 && i < (1742345613 * Class301.anInt3555 + -13788709 * Class158_Sub2.anInt8975)) {
						int i_317_ = -1;
						for (int i_318_ = 0; i_318_ < anInt169 * 2144330291; i_318_++) {
							if (aBool187) {
								int i_319_ = ((anInt178 * 997766473 * (2144330291 * anInt169 - 1 - i_318_)) + (1 + (397683159 * class414.anInt4978 + (Class184.anInt2300 * 815250613 + 20))));
								if (i_316_ > (i_319_ - class414.anInt4978 * 397683159 - 1) && (i_316_ < i_319_ + (-1518951631 * class414.anInt4979)))
									i_317_ = i_318_;
							} else {
								int i_320_ = ((997766473 * anInt178 * (2144330291 * anInt169 - 1 - i_318_)) + (31 + Class184.anInt2300 * 815250613));
								if (i_316_ > (i_320_ - class414.anInt4978 * 397683159 - 1) && i_316_ < i_320_ + (class414.anInt4979 * -1518951631))
									i_317_ = i_318_;
							}
						}
						if (-1 != i_317_) {
							int i_321_ = 0;
							NodeIterator class460 = new NodeIterator(aClass482_171);
							for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class460.method7683(1944512040)); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) class460.next()) {
								if (i_321_++ == i_317_)
									return (-1332134173 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9578);
							}
						}
					}
				} else if (i > 1742345613 * Class301.anInt3555 && i < (1742345613 * Class301.anInt3555 + -13788709 * Class158_Sub2.anInt8975)) {
					int i_322_ = -1;
					for (int i_323_ = 0; i_323_ < anInt170 * 292682521; i_323_++) {
						if (aBool187) {
							int i_324_ = (815250613 * Class184.anInt2300 + 20 + class414.anInt4978 * 397683159 + 1 + 997766473 * anInt178 * i_323_);
							if ((i_316_ > i_324_ - 397683159 * class414.anInt4978 - 1) && i_316_ < (class414.anInt4979 * -1518951631 + i_324_))
								i_322_ = i_323_;
						} else {
							int i_325_ = (31 + 815250613 * Class184.anInt2300 + i_323_ * (997766473 * anInt178));
							if ((i_316_ > i_325_ - 397683159 * class414.anInt4978 - 1) && i_316_ < i_325_ + (-1518951631 * class414.anInt4979))
								i_322_ = i_323_;
						}
					}
					if (-1 != i_322_) {
						int i_326_ = 0;
						Class469 class469 = new Class469(aClass477_182);
						for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.method7790(1832486278)); null != class282_sub50_sub15; class282_sub50_sub15 = (Class282_Sub50_Sub15) class469.next()) {
							if (i_326_++ == i_322_)
								return (-1332134173 * ((Class282_Sub50_Sub7) (Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)).anInt9578);
						}
					}
				} else if (aClass282_Sub50_Sub15_163 != null && i > 143093737 * Class341.anInt3996 && i < (Class96_Sub3.anInt8518 * 572079435 + 143093737 * Class341.anInt3996)) {
					int i_327_ = -1;
					for (int i_328_ = 0; (i_328_ < (((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).anInt9769) * 2026887253); i_328_++) {
						if (aBool187) {
							int i_329_ = (i_328_ * (997766473 * anInt178) + (20 + (2107083711 * Class282_Sub50_Sub2.anInt9471) + 397683159 * class414.anInt4978 + 1));
							if ((i_316_ > i_329_ - class414.anInt4978 * 397683159 - 1) && i_316_ < (-1518951631 * class414.anInt4979 + i_329_))
								i_327_ = i_328_;
						} else {
							int i_330_ = (anInt178 * 997766473 * i_328_ + ((2107083711 * Class282_Sub50_Sub2.anInt9471) + 31));
							if ((i_316_ > i_330_ - 397683159 * class414.anInt4978 - 1) && i_316_ < (-1518951631 * class414.anInt4979 + i_330_))
								i_327_ = i_328_;
						}
					}
					if (i_327_ != -1) {
						int i_331_ = 0;
						Class469 class469 = new Class469(((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770);
						for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class469.method7790(1832486278)); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) class469.next()) {
							if (i_331_++ == i_327_)
								return (-1332134173 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9578);
						}
					}
				}
			}
		}
		return -1;
	}

	static int method667() {
		if (null == client.aClass118_7257) {
			if (!aBool161) {
				if (Class149_Sub2.DEFAULTS_LOADER_7.aBool5876) {
					if (aClass282_Sub50_Sub7_168 != null)
						return (((Class282_Sub50_Sub7) aClass282_Sub50_Sub7_168).anInt9578 * -1332134173);
				} else if (null != Class96_Sub23.aClass282_Sub50_Sub7_9445)
					return (-1332134173 * (((Class282_Sub50_Sub7) Class96_Sub23.aClass282_Sub50_Sub7_9445).anInt9578));
			} else {
				Class414 class414 = Class114.method1887(2136890191);
				int i = Class163.aClass209_2031.method3569(1943564583);
				int i_332_ = Class163.aClass209_2031.method3570(756095591);
				if (!aBool162) {
					if (i > 1742345613 * Class301.anInt3555 && i < (1742345613 * Class301.anInt3555 + -13788709 * Class158_Sub2.anInt8975)) {
						int i_333_ = -1;
						for (int i_334_ = 0; i_334_ < anInt169 * 2144330291; i_334_++) {
							if (aBool187) {
								int i_335_ = ((anInt178 * 997766473 * (2144330291 * anInt169 - 1 - i_334_)) + (1 + (397683159 * class414.anInt4978 + (Class184.anInt2300 * 815250613 + 20))));
								if (i_332_ > (i_335_ - class414.anInt4978 * 397683159 - 1) && (i_332_ < i_335_ + (-1518951631 * class414.anInt4979)))
									i_333_ = i_334_;
							} else {
								int i_336_ = ((997766473 * anInt178 * (2144330291 * anInt169 - 1 - i_334_)) + (31 + Class184.anInt2300 * 815250613));
								if (i_332_ > (i_336_ - class414.anInt4978 * 397683159 - 1) && i_332_ < i_336_ + (class414.anInt4979 * -1518951631))
									i_333_ = i_334_;
							}
						}
						if (-1 != i_333_) {
							int i_337_ = 0;
							NodeIterator class460 = new NodeIterator(aClass482_171);
							for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class460.method7683(1421721085)); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) class460.next()) {
								if (i_337_++ == i_333_)
									return (-1332134173 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9578);
							}
						}
					}
				} else if (i > 1742345613 * Class301.anInt3555 && i < (1742345613 * Class301.anInt3555 + -13788709 * Class158_Sub2.anInt8975)) {
					int i_338_ = -1;
					for (int i_339_ = 0; i_339_ < anInt170 * 292682521; i_339_++) {
						if (aBool187) {
							int i_340_ = (815250613 * Class184.anInt2300 + 20 + class414.anInt4978 * 397683159 + 1 + 997766473 * anInt178 * i_339_);
							if ((i_332_ > i_340_ - 397683159 * class414.anInt4978 - 1) && i_332_ < (class414.anInt4979 * -1518951631 + i_340_))
								i_338_ = i_339_;
						} else {
							int i_341_ = (31 + 815250613 * Class184.anInt2300 + i_339_ * (997766473 * anInt178));
							if ((i_332_ > i_341_ - 397683159 * class414.anInt4978 - 1) && i_332_ < i_341_ + (-1518951631 * class414.anInt4979))
								i_338_ = i_339_;
						}
					}
					if (-1 != i_338_) {
						int i_342_ = 0;
						Class469 class469 = new Class469(aClass477_182);
						for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.method7790(1832486278)); null != class282_sub50_sub15; class282_sub50_sub15 = (Class282_Sub50_Sub15) class469.next()) {
							if (i_342_++ == i_338_)
								return (-1332134173 * ((Class282_Sub50_Sub7) (Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)).anInt9578);
						}
					}
				} else if (aClass282_Sub50_Sub15_163 != null && i > 143093737 * Class341.anInt3996 && i < (Class96_Sub3.anInt8518 * 572079435 + 143093737 * Class341.anInt3996)) {
					int i_343_ = -1;
					for (int i_344_ = 0; (i_344_ < (((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).anInt9769) * 2026887253); i_344_++) {
						if (aBool187) {
							int i_345_ = (i_344_ * (997766473 * anInt178) + (20 + (2107083711 * Class282_Sub50_Sub2.anInt9471) + 397683159 * class414.anInt4978 + 1));
							if ((i_332_ > i_345_ - class414.anInt4978 * 397683159 - 1) && i_332_ < (-1518951631 * class414.anInt4979 + i_345_))
								i_343_ = i_344_;
						} else {
							int i_346_ = (anInt178 * 997766473 * i_344_ + ((2107083711 * Class282_Sub50_Sub2.anInt9471) + 31));
							if ((i_332_ > i_346_ - 397683159 * class414.anInt4978 - 1) && i_332_ < (-1518951631 * class414.anInt4979 + i_346_))
								i_343_ = i_344_;
						}
					}
					if (i_343_ != -1) {
						int i_347_ = 0;
						Class469 class469 = new Class469(((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770);
						for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class469.method7790(1832486278)); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) class469.next()) {
							if (i_347_++ == i_343_)
								return (-1332134173 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9578);
						}
					}
				}
			}
		}
		return -1;
	}

	public static boolean method668(int i, int i_348_) {
		if (!aBool161)
			return false;
		int i_349_ = i >> 16;
		int i_350_ = i & 0xffff;
		if (null == Class468_Sub8.aClass98Array7889[i_349_] || (Class468_Sub8.aClass98Array7889[i_349_].aClass118Array998[i_350_]) == null)
			return false;
		Class118 class118 = (Class468_Sub8.aClass98Array7889[i_349_].aClass118Array998[i_350_]);
		if (i_348_ != -1 || -2131393857 * class118.anInt1268 != 0) {
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 54)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(240667960))) {
				if (i_348_ == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9581) * 1575008129 && (class118.anInt1287 * -1952846363 == 395156599 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582)
						&& (58 == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 == 1007 || -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 == 25 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 == 57 || 30 == -1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587)))
					return true;
			}
		} else {
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 39)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(-878948737))) {
				if ((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225) == 58 || 1007 == -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 || -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 == 25 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225) == 57 || 30 == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225) {
					for (Class118 class118_351_ = Class117.method1981((395156599 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582)), (byte) 57); null != class118_351_; class118_351_ = Class96_Sub23.method14682((Class468_Sub8.aClass98Array7889[(((class118_351_.anInt1287) * -1952846363) >> 16)]), class118_351_, -838454718)) {
						if (-1952846363 * class118_351_.anInt1287 == -1952846363 * class118.anInt1287)
							return true;
					}
				}
			}
		}
		return false;
	}

	static int method669() {
		if (null == client.aClass118_7257) {
			if (!aBool161) {
				if (Class149_Sub2.DEFAULTS_LOADER_7.aBool5876) {
					if (aClass282_Sub50_Sub7_168 != null)
						return (((Class282_Sub50_Sub7) aClass282_Sub50_Sub7_168).anInt9578 * -1332134173);
				} else if (null != Class96_Sub23.aClass282_Sub50_Sub7_9445)
					return (-1332134173 * (((Class282_Sub50_Sub7) Class96_Sub23.aClass282_Sub50_Sub7_9445).anInt9578));
			} else {
				Class414 class414 = Class114.method1887(1285516564);
				int i = Class163.aClass209_2031.method3569(1982802796);
				int i_352_ = Class163.aClass209_2031.method3570(756095591);
				if (!aBool162) {
					if (i > 1742345613 * Class301.anInt3555 && i < (1742345613 * Class301.anInt3555 + -13788709 * Class158_Sub2.anInt8975)) {
						int i_353_ = -1;
						for (int i_354_ = 0; i_354_ < anInt169 * 2144330291; i_354_++) {
							if (aBool187) {
								int i_355_ = ((anInt178 * 997766473 * (2144330291 * anInt169 - 1 - i_354_)) + (1 + (397683159 * class414.anInt4978 + (Class184.anInt2300 * 815250613 + 20))));
								if (i_352_ > (i_355_ - class414.anInt4978 * 397683159 - 1) && (i_352_ < i_355_ + (-1518951631 * class414.anInt4979)))
									i_353_ = i_354_;
							} else {
								int i_356_ = ((997766473 * anInt178 * (2144330291 * anInt169 - 1 - i_354_)) + (31 + Class184.anInt2300 * 815250613));
								if (i_352_ > (i_356_ - class414.anInt4978 * 397683159 - 1) && i_352_ < i_356_ + (class414.anInt4979 * -1518951631))
									i_353_ = i_354_;
							}
						}
						if (-1 != i_353_) {
							int i_357_ = 0;
							NodeIterator class460 = new NodeIterator(aClass482_171);
							for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class460.method7683(-1937637316)); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) class460.next()) {
								if (i_357_++ == i_353_)
									return (-1332134173 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9578);
							}
						}
					}
				} else if (i > 1742345613 * Class301.anInt3555 && i < (1742345613 * Class301.anInt3555 + -13788709 * Class158_Sub2.anInt8975)) {
					int i_358_ = -1;
					for (int i_359_ = 0; i_359_ < anInt170 * 292682521; i_359_++) {
						if (aBool187) {
							int i_360_ = (815250613 * Class184.anInt2300 + 20 + class414.anInt4978 * 397683159 + 1 + 997766473 * anInt178 * i_359_);
							if ((i_352_ > i_360_ - 397683159 * class414.anInt4978 - 1) && i_352_ < (class414.anInt4979 * -1518951631 + i_360_))
								i_358_ = i_359_;
						} else {
							int i_361_ = (31 + 815250613 * Class184.anInt2300 + i_359_ * (997766473 * anInt178));
							if ((i_352_ > i_361_ - 397683159 * class414.anInt4978 - 1) && i_352_ < i_361_ + (-1518951631 * class414.anInt4979))
								i_358_ = i_359_;
						}
					}
					if (-1 != i_358_) {
						int i_362_ = 0;
						Class469 class469 = new Class469(aClass477_182);
						for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) class469.method7790(1832486278)); null != class282_sub50_sub15; class282_sub50_sub15 = (Class282_Sub50_Sub15) class469.next()) {
							if (i_362_++ == i_358_)
								return (-1332134173 * ((Class282_Sub50_Sub7) (Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)).anInt9578);
						}
					}
				} else if (aClass282_Sub50_Sub15_163 != null && i > 143093737 * Class341.anInt3996 && i < (Class96_Sub3.anInt8518 * 572079435 + 143093737 * Class341.anInt3996)) {
					int i_363_ = -1;
					for (int i_364_ = 0; (i_364_ < (((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).anInt9769) * 2026887253); i_364_++) {
						if (aBool187) {
							int i_365_ = (i_364_ * (997766473 * anInt178) + (20 + (2107083711 * Class282_Sub50_Sub2.anInt9471) + 397683159 * class414.anInt4978 + 1));
							if ((i_352_ > i_365_ - class414.anInt4978 * 397683159 - 1) && i_352_ < (-1518951631 * class414.anInt4979 + i_365_))
								i_363_ = i_364_;
						} else {
							int i_366_ = (anInt178 * 997766473 * i_364_ + ((2107083711 * Class282_Sub50_Sub2.anInt9471) + 31));
							if ((i_352_ > i_366_ - 397683159 * class414.anInt4978 - 1) && i_352_ < (-1518951631 * class414.anInt4979 + i_366_))
								i_363_ = i_364_;
						}
					}
					if (i_363_ != -1) {
						int i_367_ = 0;
						Class469 class469 = new Class469(((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770);
						for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) class469.method7790(1832486278)); class282_sub50_sub7 != null; class282_sub50_sub7 = (Class282_Sub50_Sub7) class469.next()) {
							if (i_367_++ == i_363_)
								return (-1332134173 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9578);
						}
					}
				}
			}
		}
		return -1;
	}

	public static boolean method670(int i, int i_368_) {
		if (!aBool161)
			return false;
		int i_369_ = i >> 16;
		int i_370_ = i & 0xffff;
		if (null == Class468_Sub8.aClass98Array7889[i_369_] || (Class468_Sub8.aClass98Array7889[i_369_].aClass118Array998[i_370_]) == null)
			return false;
		Class118 class118 = (Class468_Sub8.aClass98Array7889[i_369_].aClass118Array998[i_370_]);
		if (i_368_ != -1 || -2131393857 * class118.anInt1268 != 0) {
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 125)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(570222857))) {
				if (i_368_ == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9581) * 1575008129 && (class118.anInt1287 * -1952846363 == 395156599 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582)
						&& (58 == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 == 1007 || -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 == 25 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225 == 57 || 30 == -1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587)))
					return true;
			}
		} else {
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 23)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(1886477647))) {
				if ((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225) == 58 || 1007 == -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 || -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 == 25 || (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225) == 57 || 30 == (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) * -1441507225) {
					for (Class118 class118_371_ = Class117.method1981((395156599 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582)), (byte) 126); null != class118_371_; class118_371_ = Class96_Sub23.method14682((Class468_Sub8.aClass98Array7889[(((class118_371_.anInt1287) * -1952846363) >> 16)]), class118_371_, -838454718)) {
						if (-1952846363 * class118_371_.anInt1287 == -1952846363 * class118.anInt1287)
							return true;
					}
				}
			}
		}
		return false;
	}

	public static String method671(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (aBool161 || null == class282_sub50_sub7)
			return "";
		return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576;
	}

	public static Class282_Sub50_Sub7 method672() {
		return Class96_Sub23.aClass282_Sub50_Sub7_9445;
	}

	public static void method673(NativeSprite[] class160s) {
		anInt186 = class160s.length * 1884228835;
		Class115.aClass160Array1248 = new NativeSprite[anInt186 * 1104058571 + 10];
		anIntArray177 = new int[1104058571 * anInt186 + 10];
		System.arraycopy(class160s, 0, Class115.aClass160Array1248, 0, anInt186 * 1104058571);
		for (int i = 0; i < anInt186 * 1104058571; i++)
			anIntArray177[i] = Class115.aClass160Array1248[i].method2748();
		for (int i = anInt186 * 1104058571; i < Class115.aClass160Array1248.length; i++)
			anIntArray177[i] = 12;
	}

	public static int method674(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (aBool161)
			return 6;
		if (class282_sub50_sub7 == null)
			return 0;
		int i = (-1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587);
		if (Class14.method539(i, 352419376))
			return 1;
		if (Class38.method859(i, -261998775))
			return 2;
		if (Class431.method7252(i, (byte) 0))
			return 3;
		if (Class237.method3989(i, (byte) 0))
			return 4;
		if (Class348.method6176(i, -1122366852))
			return 7;
		if (i == 16)
			return 8;
		return 5;
	}

	public static Class282_Sub50_Sub7 method675() {
		return aClass282_Sub50_Sub7_168;
	}

	public static Class282_Sub50_Sub7 method676() {
		return aClass282_Sub50_Sub7_168;
	}

	static boolean method677(Class232 class232) {
		return Class6.method302(class232, null, 1607270897);
	}

	public static String method678(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (aBool161 || null == class282_sub50_sub7)
			return "";
		return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576;
	}

	public static String method679(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (aBool161 || null == class282_sub50_sub7)
			return "";
		return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576;
	}

	static void method680(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (!aBool161) {
			class282_sub50_sub7.unlink(-371378792);
			anInt169 -= 1410722043;
			if (!((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9586) {
				long l = (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9580 * 820033947929891191L);
				Class282_Sub50_Sub15 class282_sub50_sub15;
				for (class282_sub50_sub15 = (Class282_Sub50_Sub15) aClass465_172.method7754(l); (class282_sub50_sub15 != null && !(((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588))); class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass465_172.method7747(-2113220150))) {
					/* empty */
				}
				if (null != class282_sub50_sub15 && class282_sub50_sub15.method15249(class282_sub50_sub7, (byte) 41))
					Class13.method503(class282_sub50_sub15, 1012368093);
			} else {
				for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(-1066180204))) {
					if (((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588)) {
						boolean bool = false;
						for (Class282_Sub50_Sub7 class282_sub50_sub7_372_ = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7941((byte) 4)); null != class282_sub50_sub7_372_; class282_sub50_sub7_372_ = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.method7955(-1799664607))) {
							if (class282_sub50_sub7_372_ == class282_sub50_sub7) {
								if (class282_sub50_sub15.method15249(class282_sub50_sub7, (byte) 117))
									Class13.method503(class282_sub50_sub15, 1196023230);
								bool = true;
								break;
							}
						}
						if (bool)
							break;
					}
				}
			}
		}
	}

	static void method681(GraphicalRenderer class505, int i, int i_373_, int i_374_, int i_375_, int i_376_, FontRenderer class8, Class414 class414, String string) {
		int i_377_ = 255 - Class301.anInt3556 * 233097173 - anInt156 * -1454754391;
		if (i_377_ < 0)
			i_377_ = 0;
		if (Class467.aClass160_5576 == null || null == Class61.aClass160_647) {
			if (IndexLoaders.SPRITES_INDEX.method5661(Class450.anInt5438 * 947424179, -1870916341) && IndexLoaders.SPRITES_INDEX.method5661((-1626939609 * Class373.anInt4350), -6286042)) {
				Class467.aClass160_5576 = (class505.method8444(Class91.method1522(IndexLoaders.SPRITES_INDEX, Class450.anInt5438 * 947424179, 0), true));
				Class91 class91 = Class91.method1522(IndexLoaders.SPRITES_INDEX, -1626939609 * Class373.anInt4350, 0);
				Class61.aClass160_647 = class505.method8444(class91, true);
				class91.method1525();
				Class60.aClass160_612 = class505.method8444(class91, true);
			} else
				class505.B(i, i_373_, i_374_, i_376_, (i_377_ << 24 | 134810037 * Class282_Sub20_Sub9.anInt9792), 1);
		}
		if (Class467.aClass160_5576 != null && Class61.aClass160_647 != null) {
			int i_378_ = ((i_374_ - Class61.aClass160_647.method2747() * 2) / Class467.aClass160_5576.method2747());
			for (int i_379_ = 0; i_379_ < i_378_; i_379_++)
				Class467.aClass160_5576.method2752((i + Class61.aClass160_647.method2747() + i_379_ * Class467.aClass160_5576.method2747()), i_373_);
			Class61.aClass160_647.method2752(i, i_373_);
			Class60.aClass160_612.method2752(i + i_374_ - Class60.aClass160_612.method2747(), i_373_);
		}
		class8.renderText(string, i + 3, (i_373_ + 397683159 * class414.anInt4978 + (20 - class414.anInt4978 * 397683159) / 2), 1836789541 * Class388.anInt4722 | ~0xffffff, -1, -418109423);
		class505.B(i, i_373_ + i_376_, i_374_, i_375_ - i_376_, i_377_ << 24 | Class282_Sub20_Sub9.anInt9792 * 134810037, 1);
	}

	static void method682(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (null != class282_sub50_sub7) {
			aClass482_171.append(class282_sub50_sub7, -591781664);
			anInt169 += 1410722043;
			Object object = null;
			Class282_Sub50_Sub15 class282_sub50_sub15;
			if (!((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9586 && !"".equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588)) {
				long l = (820033947929891191L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9580));
				for (class282_sub50_sub15 = (Class282_Sub50_Sub15) aClass465_172.method7754(l); (null != class282_sub50_sub15 && !(((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588))); class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass465_172.method7747(-2057013982))) {
					/* empty */
				}
				if (class282_sub50_sub15 == null) {
					class282_sub50_sub15 = (Class282_Sub50_Sub15) aClass229_164.get(l);
					if (null != class282_sub50_sub15 && !(((Class282_Sub50_Sub15) class282_sub50_sub15).aString9771.equals(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588)))
						class282_sub50_sub15 = null;
					if (null == class282_sub50_sub15)
						class282_sub50_sub15 = new Class282_Sub50_Sub15(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588);
					aClass465_172.method7765(class282_sub50_sub15, l);
					anInt170 += 1980182825;
				}
			} else {
				class282_sub50_sub15 = new Class282_Sub50_Sub15(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588);
				anInt170 += 1980182825;
			}
			if (class282_sub50_sub15.method15245(class282_sub50_sub7, -1746572290))
				Class13.method503(class282_sub50_sub15, 1093169852);
		}
	}

	public static String method683(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (aBool161 || class282_sub50_sub7 == null)
			return "";
		if ((((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588 == null || ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588.length() == 0) && null != ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585 && ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585.length() > 0)
			return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585;
		return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588;
	}

	public static String method684(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (aBool161 || class282_sub50_sub7 == null)
			return "";
		if ((((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588 == null || ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588.length() == 0) && null != ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585 && ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585.length() > 0)
			return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585;
		return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588;
	}

	public static String method685(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (aBool161 || class282_sub50_sub7 == null)
			return "";
		if ((((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588 == null || ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588.length() == 0) && null != ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585 && ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585.length() > 0)
			return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585;
		return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588;
	}

	static void method686(GraphicalRenderer class505) {
		if (aBool161)
			Class354.method6216(class505, 1931730454);
		else
			Class268.method4800(class505, (byte) 39);
	}

	public static int method687(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (aBool161)
			return 6;
		if (class282_sub50_sub7 == null)
			return 0;
		int i = (-1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587);
		if (Class14.method539(i, -734179440))
			return 1;
		if (Class38.method859(i, -1157542720))
			return 2;
		if (Class431.method7252(i, (byte) 0))
			return 3;
		if (Class237.method3989(i, (byte) 0))
			return 4;
		if (Class348.method6176(i, -1206017346))
			return 7;
		if (i == 16)
			return 8;
		return 5;
	}

	static boolean method688() {
		return anInt169 * 2144330291 > 0;
	}

	static void method689(Class294 class294, Class384 class384, int i, int i_380_) {
		if (aClass384_158 == null)
			aClass384_158 = new Class384(class384);
		else
			aClass384_158.method6562(class384);
		aClass294_155.method5209(class294);
		anInt176 = i * -877847821;
		anInt184 = i_380_ * -21606295;
	}

	static void method690(Class118 class118, int i, int i_381_) {
		aClass118_183 = class118;
		anInt195 = i * 1511257025;
		anInt179 = -248935111 * i_381_;
	}

	static void method691(GraphicalRenderer class505) {
		if (!aBool187)
			Class277.method4908(class505, 444970042);
		else
			Class38.method857(class505, -436881514);
	}

	static void method692(GraphicalRenderer class505) {
		if ((anInt169 * 2144330291 >= 2 || client.aBool7344) && client.aClass118_7257 == null) {
			String string;
			if (client.aBool7344 && 2144330291 * anInt169 < 2)
				string = new StringBuilder().append(client.aString7275).append(Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE, -779271589)).append(client.aString7356).append(" ").append(Class2.aString17).toString();
			else if (Class468_Sub1.method12619(-64252242) && 2144330291 * anInt169 > 2)
				string = IncomingPacket.method6380((Class96_Sub23.aClass282_Sub50_Sub7_9445), 914092261);
			else {
				Class282_Sub50_Sub7 class282_sub50_sub7 = Class96_Sub23.aClass282_Sub50_Sub7_9445;
				if (null == class282_sub50_sub7)
					return;
				string = IncomingPacket.method6380(class282_sub50_sub7, 569373386);
				int[] is = Class534_Sub1.method12815(class282_sub50_sub7, -826689693);
				if (null != is)
					string = new StringBuilder().append(string).append(Class15.method547(is, 1806945129)).toString();
			}
			if (anInt169 * 2144330291 > 2)
				string = new StringBuilder().append(string).append(Class59.method1163(16777215, 619010179)).append(" / ").append(2144330291 * anInt169 - 2).append(Message.MORE_OPTIONS.translate(Class223.CURRENT_LANGUAGE, -1126126061)).toString();
			if (aClass118_183 != null) {
				FontRenderer class8 = aClass118_183.method1988(Class487.aClass378_5752, client.anInterface35_7206, 1393020203);
				if (class8 == null)
					class8 = Class285.aClass8_3394;
				class8.method367(string, anInt195 * 734403649, -1447866103 * anInt179, aClass118_183.anInt1301 * 1506818197, aClass118_183.anInt1429 * -492594917, aClass118_183.anInt1264 * -795991475, 1279397863 * aClass118_183.anInt1324, -220189555 * aClass118_183.anInt1359, aClass118_183.anInt1360 * 1297350181, client.aRandom7260, -242333475 * PacketsDecoder.anInt9079, client.anIntArray7438, Class115.aClass160Array1248, anIntArray177, 1760590156);
				Class292.method5201(client.anIntArray7438[0], client.anIntArray7438[1], client.anIntArray7438[2], client.anIntArray7438[3], (byte) 12);
			}
		}
	}

	static void method693(GraphicalRenderer class505, int i, int i_382_, int i_383_, int i_384_, int i_385_, int i_386_) {
		class505.method8425(i, i_382_, i_383_, i_384_, i_385_, (byte) -73);
		class505.method8425(1 + i, 1 + i_382_, i_383_ - 2, 16, i_386_, (byte) -69);
		class505.method8562(i + 1, i_382_ + 18, i_383_ - 2, i_384_ - 19, i_386_, (byte) 4);
	}

	static int[] method694(Class282_Sub50_Sub7 class282_sub50_sub7) {
		int[] is = null;
		if (Class38.method859(-1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587, 201245845))
			is = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((int) (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584)), 736974100).quests);
		else if ((-270249393 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9579) != -1)
			is = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9579 * -270249393), 1610477745).quests);
		else if (Class237.method3989((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225), (byte) 0)) {
			Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) (int) ((((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584) * -5876141066140255231L))));
			if (class282_sub47 != null) {
				NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
				NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
				if (class409.anIntArray4886 != null)
					class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
				if (class409 != null)
					is = class409.anIntArray4915;
			}
		} else if (Class431.method7252(-1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587), (byte) 0)) {
			ObjectDefinitions class478 = (IndexLoaders.MAP_REGION_DECODER.method4436(-1447553900).getObjectDefinitions((int) ((((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584) * -5876141066140255231L >>> 32 & 0x7fffffffL), 65280));
			if (class478.anIntArray5650 != null)
				class478 = class478.method8013(Class158_Sub1.aClass3_8507, (byte) -3);
			if (class478 != null)
				is = class478.anIntArray5707;
		}
		return is;
	}

	static int[] method695(Class282_Sub50_Sub7 class282_sub50_sub7) {
		int[] is = null;
		if (Class38.method859(-1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587, 70287026))
			is = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((int) (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584)), 482546320).quests);
		else if ((-270249393 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9579) != -1)
			is = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9579 * -270249393), 1992586475).quests);
		else if (Class237.method3989((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225), (byte) 0)) {
			Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) (int) ((((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584) * -5876141066140255231L))));
			if (class282_sub47 != null) {
				NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
				NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
				if (class409.anIntArray4886 != null)
					class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
				if (class409 != null)
					is = class409.anIntArray4915;
			}
		} else if (Class431.method7252(-1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587), (byte) 0)) {
			ObjectDefinitions class478 = (IndexLoaders.MAP_REGION_DECODER.method4436(-1771651003).getObjectDefinitions((int) ((((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584) * -5876141066140255231L >>> 32 & 0x7fffffffL), 65280));
			if (class478.anIntArray5650 != null)
				class478 = class478.method8013(Class158_Sub1.aClass3_8507, (byte) 40);
			if (class478 != null)
				is = class478.anIntArray5707;
		}
		return is;
	}

	static int[] method696(Class282_Sub50_Sub7 class282_sub50_sub7) {
		int[] is = null;
		if (Class38.method859(-1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587, -814359114))
			is = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((int) (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584)), 603694282).quests);
		else if ((-270249393 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9579) != -1)
			is = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9579 * -270249393), 2038774663).quests);
		else if (Class237.method3989((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225), (byte) 0)) {
			Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) (int) ((((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584) * -5876141066140255231L))));
			if (class282_sub47 != null) {
				NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
				NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
				if (class409.anIntArray4886 != null)
					class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
				if (class409 != null)
					is = class409.anIntArray4915;
			}
		} else if (Class431.method7252(-1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587), (byte) 0)) {
			ObjectDefinitions class478 = (IndexLoaders.MAP_REGION_DECODER.method4436(-1421443297).getObjectDefinitions((int) ((((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584) * -5876141066140255231L >>> 32 & 0x7fffffffL), 65280));
			if (class478.anIntArray5650 != null)
				class478 = class478.method8013(Class158_Sub1.aClass3_8507, (byte) 31);
			if (class478 != null)
				is = class478.anIntArray5707;
		}
		return is;
	}

	static int[] method697(Class282_Sub50_Sub7 class282_sub50_sub7) {
		int[] is = null;
		if (Class38.method859(-1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587, 1342990450))
			is = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((int) (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584)), 956277456).quests);
		else if ((-270249393 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9579) != -1)
			is = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9579 * -270249393), 1509767660).quests);
		else if (Class237.method3989((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225), (byte) 0)) {
			Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) (int) ((((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584) * -5876141066140255231L))));
			if (class282_sub47 != null) {
				NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
				NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
				if (class409.anIntArray4886 != null)
					class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
				if (class409 != null)
					is = class409.anIntArray4915;
			}
		} else if (Class431.method7252(-1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587), (byte) 0)) {
			ObjectDefinitions class478 = (IndexLoaders.MAP_REGION_DECODER.method4436(-1531939892).getObjectDefinitions((int) ((((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584) * -5876141066140255231L >>> 32 & 0x7fffffffL), 65280));
			if (class478.anIntArray5650 != null)
				class478 = class478.method8013(Class158_Sub1.aClass3_8507, (byte) 97);
			if (class478 != null)
				is = class478.anIntArray5707;
		}
		return is;
	}

	static void method698(int i, int i_387_, int i_388_, int i_389_, int i_390_, int i_391_, int i_392_, Class282_Sub50_Sub7 class282_sub50_sub7, FontRenderer class8, Class414 class414, int i_393_, int i_394_) {
		if (i > i_388_ && i < i_388_ + i_390_ && i_387_ > i_392_ - 397683159 * class414.anInt4978 - 1 && i_387_ < class414.anInt4979 * -1518951631 + i_392_ && ((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9583)
			i_393_ = i_394_;
		int[] is = Class534_Sub1.method12815(class282_sub50_sub7, -1803871941);
		String string = IncomingPacket.method6380(class282_sub50_sub7, 1220088115);
		if (null != is)
			string = new StringBuilder().append(string).append(Class15.method547(is, 2098044397)).toString();
		class8.method386(string, 3 + i_388_, i_392_, i_393_, 0, client.aRandom7260, -242333475 * PacketsDecoder.anInt9079, Class115.aClass160Array1248, anIntArray177, 1242639410);
		if (((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9577)
			Exception_Sub1.aClass160_10075.method2752(5 + i_388_ + class414.method6946(string, -1967833701), i_392_ - class414.anInt4978 * 397683159);
	}

	static void method699(int i, int i_395_, int i_396_, int i_397_, int i_398_, int i_399_, int i_400_, Class282_Sub50_Sub15 class282_sub50_sub15, FontRenderer class8, Class414 class414, int i_401_, int i_402_) {
		if (i > i_396_ && i < i_398_ + i_396_ && i_395_ > i_400_ - 397683159 * class414.anInt4978 - 1 && i_395_ < i_400_ + class414.anInt4979 * -1518951631)
			i_401_ = i_402_;
		String string = Class75.method1354(class282_sub50_sub15, -938758900);
		class8.method386(string, 3 + i_396_, i_400_, i_401_, 0, client.aRandom7260, -242333475 * PacketsDecoder.anInt9079, Class115.aClass160Array1248, anIntArray177, -1784510994);
	}

	static boolean method700(int i) {
		if (18 == i || i == 19 || i == 20 || i == 21 || 22 == i || 1004 == i)
			return true;
		if (i == 17)
			return true;
		return false;
	}

	static void method701(GraphicalRenderer class505) {
		int i = -10660793;
		Class377.method6394(class505, Class301.anInt3555 * 1742345613, 815250613 * Class184.anInt2300, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i, -16777216, -307191268);
		Class285.aClass8_3394.renderText(Message.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE, -722153660), 3 + 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300 + 14, i, -1, -418109423);
		int i_403_ = Class163.aClass209_2031.method3569(2078881917);
		int i_404_ = Class163.aClass209_2031.method3570(756095591);
		if (!aBool162) {
			int i_405_ = 0;
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 44)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(-19943353))) {
				int i_406_ = (anInt178 * 997766473 * (anInt169 * 2144330291 - 1 - i_405_) + (815250613 * Class184.anInt2300 + 31));
				Class282_Sub25.method12400(i_403_, i_404_, 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300, Class158_Sub2.anInt8975 * -13788709, Class110.anInt1104 * -1488439617, i_406_, class282_sub50_sub7, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, 970501438);
				i_405_++;
			}
		} else {
			int i_407_ = 0;
			for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4)); null != class282_sub50_sub15; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(1151054875))) {
				int i_408_ = (31 + Class184.anInt2300 * 815250613 + i_407_ * (anInt178 * 997766473));
				if (1 == 2026887253 * ((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769)
					Class282_Sub25.method12400(i_403_, i_404_, 1742345613 * Class301.anInt3555, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, -1488439617 * Class110.anInt1104, i_408_, ((Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)), Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, -2021543192);
				else
					Class99.method1630(i_403_, i_404_, Class301.anInt3555 * 1742345613, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i_408_, class282_sub50_sub15, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, -1739526357);
				i_407_++;
			}
			if (aClass282_Sub50_Sub15_163 != null) {
				Class377.method6394(class505, 143093737 * Class341.anInt3996, 2107083711 * Class282_Sub50_Sub2.anInt9471, 572079435 * Class96_Sub3.anInt8518, (Class521_Sub1_Sub5_Sub1.anInt10526 * -1193351845), i, -16777216, 787893849);
				Class285.aClass8_3394.renderText((((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aString9771), 143093737 * Class341.anInt3996 + 3, 2107083711 * Class282_Sub50_Sub2.anInt9471 + 14, i, -1, -418109423);
				i_407_ = 0;
				for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770.method7941((byte) 4)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770.method7955(-258778228))) {
					int i_409_ = (i_407_ * (997766473 * anInt178) + (2107083711 * Class282_Sub50_Sub2.anInt9471 + 31));
					Class282_Sub25.method12400(i_403_, i_404_, 143093737 * Class341.anInt3996, 2107083711 * Class282_Sub50_Sub2.anInt9471, 572079435 * Class96_Sub3.anInt8518, -1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526, i_409_, class282_sub50_sub7, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, 377059003);
					i_407_++;
				}
			}
		}
	}

	static void method702(GraphicalRenderer class505) {
		int i = -10660793;
		Class377.method6394(class505, Class301.anInt3555 * 1742345613, 815250613 * Class184.anInt2300, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i, -16777216, -1095602908);
		Class285.aClass8_3394.renderText(Message.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE, -2122841603), 3 + 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300 + 14, i, -1, -418109423);
		int i_410_ = Class163.aClass209_2031.method3569(1990085491);
		int i_411_ = Class163.aClass209_2031.method3570(756095591);
		if (!aBool162) {
			int i_412_ = 0;
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 16)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(-492909886))) {
				int i_413_ = (anInt178 * 997766473 * (anInt169 * 2144330291 - 1 - i_412_) + (815250613 * Class184.anInt2300 + 31));
				Class282_Sub25.method12400(i_410_, i_411_, 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300, Class158_Sub2.anInt8975 * -13788709, Class110.anInt1104 * -1488439617, i_413_, class282_sub50_sub7, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, 584561916);
				i_412_++;
			}
		} else {
			int i_414_ = 0;
			for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4)); null != class282_sub50_sub15; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(-1940797226))) {
				int i_415_ = (31 + Class184.anInt2300 * 815250613 + i_414_ * (anInt178 * 997766473));
				if (1 == 2026887253 * ((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769)
					Class282_Sub25.method12400(i_410_, i_411_, 1742345613 * Class301.anInt3555, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, -1488439617 * Class110.anInt1104, i_415_, ((Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)), Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, 215505863);
				else
					Class99.method1630(i_410_, i_411_, Class301.anInt3555 * 1742345613, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i_415_, class282_sub50_sub15, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, -1638966246);
				i_414_++;
			}
			if (aClass282_Sub50_Sub15_163 != null) {
				Class377.method6394(class505, 143093737 * Class341.anInt3996, 2107083711 * Class282_Sub50_Sub2.anInt9471, 572079435 * Class96_Sub3.anInt8518, (Class521_Sub1_Sub5_Sub1.anInt10526 * -1193351845), i, -16777216, -1617337577);
				Class285.aClass8_3394.renderText((((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aString9771), 143093737 * Class341.anInt3996 + 3, 2107083711 * Class282_Sub50_Sub2.anInt9471 + 14, i, -1, -418109423);
				i_414_ = 0;
				for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770.method7941((byte) 4)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770.method7955(1159872820))) {
					int i_416_ = (i_414_ * (997766473 * anInt178) + (2107083711 * Class282_Sub50_Sub2.anInt9471 + 31));
					Class282_Sub25.method12400(i_410_, i_411_, 143093737 * Class341.anInt3996, 2107083711 * Class282_Sub50_Sub2.anInt9471, 572079435 * Class96_Sub3.anInt8518, -1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526, i_416_, class282_sub50_sub7, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, 358730693);
					i_414_++;
				}
			}
		}
	}

	static void method703(GraphicalRenderer class505) {
		if (aBool161)
			Class354.method6216(class505, 1298358113);
		else
			Class268.method4800(class505, (byte) 71);
	}

	static void method704(GraphicalRenderer class505) {
		int i = -10660793;
		Class377.method6394(class505, Class301.anInt3555 * 1742345613, 815250613 * Class184.anInt2300, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i, -16777216, 323126336);
		Class285.aClass8_3394.renderText(Message.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE, -633699120), 3 + 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300 + 14, i, -1, -418109423);
		int i_417_ = Class163.aClass209_2031.method3569(1952015678);
		int i_418_ = Class163.aClass209_2031.method3570(756095591);
		if (!aBool162) {
			int i_419_ = 0;
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 35)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(1789749452))) {
				int i_420_ = (anInt178 * 997766473 * (anInt169 * 2144330291 - 1 - i_419_) + (815250613 * Class184.anInt2300 + 31));
				Class282_Sub25.method12400(i_417_, i_418_, 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300, Class158_Sub2.anInt8975 * -13788709, Class110.anInt1104 * -1488439617, i_420_, class282_sub50_sub7, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, 446928212);
				i_419_++;
			}
		} else {
			int i_421_ = 0;
			for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4)); null != class282_sub50_sub15; class282_sub50_sub15 = ((Class282_Sub50_Sub15) aClass477_182.method7955(-948200885))) {
				int i_422_ = (31 + Class184.anInt2300 * 815250613 + i_421_ * (anInt178 * 997766473));
				if (1 == 2026887253 * ((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769)
					Class282_Sub25.method12400(i_417_, i_418_, 1742345613 * Class301.anInt3555, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, -1488439617 * Class110.anInt1104, i_422_, ((Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)), Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, -676829975);
				else
					Class99.method1630(i_417_, i_418_, Class301.anInt3555 * 1742345613, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i_422_, class282_sub50_sub15, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, -475523372);
				i_421_++;
			}
			if (aClass282_Sub50_Sub15_163 != null) {
				Class377.method6394(class505, 143093737 * Class341.anInt3996, 2107083711 * Class282_Sub50_Sub2.anInt9471, 572079435 * Class96_Sub3.anInt8518, (Class521_Sub1_Sub5_Sub1.anInt10526 * -1193351845), i, -16777216, -1826190017);
				Class285.aClass8_3394.renderText((((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aString9771), 143093737 * Class341.anInt3996 + 3, 2107083711 * Class282_Sub50_Sub2.anInt9471 + 14, i, -1, -418109423);
				i_421_ = 0;
				for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770.method7941((byte) 4)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) aClass282_Sub50_Sub15_163).aClass477_9770.method7955(-1106890966))) {
					int i_423_ = (i_421_ * (997766473 * anInt178) + (2107083711 * Class282_Sub50_Sub2.anInt9471 + 31));
					Class282_Sub25.method12400(i_417_, i_418_, 143093737 * Class341.anInt3996, 2107083711 * Class282_Sub50_Sub2.anInt9471, 572079435 * Class96_Sub3.anInt8518, -1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526, i_423_, class282_sub50_sub7, Class285.aClass8_3394, Class288.aClass414_3438, -1, -256, 38074357);
					i_421_++;
				}
			}
		}
	}

	static void method705(GraphicalRenderer class505, int i, int i_424_, int i_425_, int i_426_, int i_427_, FontRenderer class8, Class414 class414, String string) {
		int i_428_ = 255 - Class301.anInt3556 * 233097173 - anInt156 * -1454754391;
		if (i_428_ < 0)
			i_428_ = 0;
		if (Class467.aClass160_5576 == null || null == Class61.aClass160_647) {
			if (IndexLoaders.SPRITES_INDEX.method5661(Class450.anInt5438 * 947424179, -475626454) && IndexLoaders.SPRITES_INDEX.method5661((-1626939609 * Class373.anInt4350), -1106585803)) {
				Class467.aClass160_5576 = (class505.method8444(Class91.method1522(IndexLoaders.SPRITES_INDEX, Class450.anInt5438 * 947424179, 0), true));
				Class91 class91 = Class91.method1522(IndexLoaders.SPRITES_INDEX, -1626939609 * Class373.anInt4350, 0);
				Class61.aClass160_647 = class505.method8444(class91, true);
				class91.method1525();
				Class60.aClass160_612 = class505.method8444(class91, true);
			} else
				class505.B(i, i_424_, i_425_, i_427_, (i_428_ << 24 | 134810037 * Class282_Sub20_Sub9.anInt9792), 1);
		}
		if (Class467.aClass160_5576 != null && Class61.aClass160_647 != null) {
			int i_429_ = ((i_425_ - Class61.aClass160_647.method2747() * 2) / Class467.aClass160_5576.method2747());
			for (int i_430_ = 0; i_430_ < i_429_; i_430_++)
				Class467.aClass160_5576.method2752((i + Class61.aClass160_647.method2747() + i_430_ * Class467.aClass160_5576.method2747()), i_424_);
			Class61.aClass160_647.method2752(i, i_424_);
			Class60.aClass160_612.method2752(i + i_425_ - Class60.aClass160_612.method2747(), i_424_);
		}
		class8.renderText(string, i + 3, (i_424_ + 397683159 * class414.anInt4978 + (20 - class414.anInt4978 * 397683159) / 2), 1836789541 * Class388.anInt4722 | ~0xffffff, -1, -418109423);
		class505.B(i, i_424_ + i_427_, i_425_, i_426_ - i_427_, i_428_ << 24 | Class282_Sub20_Sub9.anInt9792 * 134810037, 1);
	}

	static void method706(GraphicalRenderer class505, int i, int i_431_, int i_432_, int i_433_, int i_434_, FontRenderer class8, Class414 class414, String string) {
		int i_435_ = 255 - Class301.anInt3556 * 233097173 - anInt156 * -1454754391;
		if (i_435_ < 0)
			i_435_ = 0;
		if (Class467.aClass160_5576 == null || null == Class61.aClass160_647) {
			if (IndexLoaders.SPRITES_INDEX.method5661(Class450.anInt5438 * 947424179, 647521973) && IndexLoaders.SPRITES_INDEX.method5661((-1626939609 * Class373.anInt4350), 1434893722)) {
				Class467.aClass160_5576 = (class505.method8444(Class91.method1522(IndexLoaders.SPRITES_INDEX, Class450.anInt5438 * 947424179, 0), true));
				Class91 class91 = Class91.method1522(IndexLoaders.SPRITES_INDEX, -1626939609 * Class373.anInt4350, 0);
				Class61.aClass160_647 = class505.method8444(class91, true);
				class91.method1525();
				Class60.aClass160_612 = class505.method8444(class91, true);
			} else
				class505.B(i, i_431_, i_432_, i_434_, (i_435_ << 24 | 134810037 * Class282_Sub20_Sub9.anInt9792), 1);
		}
		if (Class467.aClass160_5576 != null && Class61.aClass160_647 != null) {
			int i_436_ = ((i_432_ - Class61.aClass160_647.method2747() * 2) / Class467.aClass160_5576.method2747());
			for (int i_437_ = 0; i_437_ < i_436_; i_437_++)
				Class467.aClass160_5576.method2752((i + Class61.aClass160_647.method2747() + i_437_ * Class467.aClass160_5576.method2747()), i_431_);
			Class61.aClass160_647.method2752(i, i_431_);
			Class60.aClass160_612.method2752(i + i_432_ - Class60.aClass160_612.method2747(), i_431_);
		}
		class8.renderText(string, i + 3, (i_431_ + 397683159 * class414.anInt4978 + (20 - class414.anInt4978 * 397683159) / 2), 1836789541 * Class388.anInt4722 | ~0xffffff, -1, -418109423);
		class505.B(i, i_431_ + i_434_, i_432_, i_433_ - i_434_, i_435_ << 24 | Class282_Sub20_Sub9.anInt9792 * 134810037, 1);
	}

	public static Class282_Sub50_Sub7 method707() {
		return aClass282_Sub50_Sub7_168;
	}

	Class20() throws Throwable {
		throw new Error();
	}

	static void method708(GraphicalRenderer class505, int i, int i_438_, int i_439_, int i_440_, int i_441_) {
		if ((null == Class354.aClass160_4110 || null == AttributeDefault.aClass160_5339 || Class125.aClass160_1571 == null) && IndexLoaders.SPRITES_INDEX.method5661(Class254.anInt3145 * 464964387, 790103109) && IndexLoaders.SPRITES_INDEX.method5661(Class446.anInt5396 * -781860267, 1304869312) && IndexLoaders.SPRITES_INDEX.method5661(-1965396391 * Class17.anInt148, -1347406354)) {
			Class91 class91 = Class91.method1522(IndexLoaders.SPRITES_INDEX, -781860267 * Class446.anInt5396, 0);
			AttributeDefault.aClass160_5339 = class505.method8444(class91, true);
			class91.method1525();
			Class290.aClass160_3452 = class505.method8444(class91, true);
			Class354.aClass160_4110 = (class505.method8444(Class91.method1522(IndexLoaders.SPRITES_INDEX, 464964387 * Class254.anInt3145, 0), true));
			Class91 class91_442_ = Class91.method1522(IndexLoaders.SPRITES_INDEX, Class17.anInt148 * -1965396391, 0);
			Class125.aClass160_1571 = class505.method8444(class91_442_, true);
			class91_442_.method1525();
			Class149_Sub2.aClass160_9315 = class505.method8444(class91_442_, true);
		}
		if (null != Class354.aClass160_4110 && AttributeDefault.aClass160_5339 != null && Class125.aClass160_1571 != null) {
			int i_443_ = ((i_439_ - Class125.aClass160_1571.method2747() * 2) / Class354.aClass160_4110.method2747());
			for (int i_444_ = 0; i_444_ < i_443_; i_444_++)
				Class354.aClass160_4110.method2752((i + Class125.aClass160_1571.method2747() + i_444_ * Class354.aClass160_4110.method2747()), i_438_ + i_440_ - Class354.aClass160_4110.method2793());
			int i_445_ = ((i_440_ - i_441_ - Class125.aClass160_1571.method2793()) / AttributeDefault.aClass160_5339.method2793());
			for (int i_446_ = 0; i_446_ < i_445_; i_446_++) {
				AttributeDefault.aClass160_5339.method2752(i, (i_441_ + i_438_ + i_446_ * AttributeDefault.aClass160_5339.method2793()));
				Class290.aClass160_3452.method2752(i + i_439_ - Class290.aClass160_3452.method2747(), (i_441_ + i_438_ + i_446_ * AttributeDefault.aClass160_5339.method2793()));
			}
			Class125.aClass160_1571.method2752(i, (i_440_ + i_438_ - Class125.aClass160_1571.method2793()));
			Class149_Sub2.aClass160_9315.method2752(i_439_ + i - Class125.aClass160_1571.method2747(), i_440_ + i_438_ - Class125.aClass160_1571.method2793());
		}
	}

	static void method709(GraphicalRenderer class505, int i, int i_447_, int i_448_, int i_449_, int i_450_) {
		if ((null == Class354.aClass160_4110 || null == AttributeDefault.aClass160_5339 || Class125.aClass160_1571 == null) && IndexLoaders.SPRITES_INDEX.method5661(Class254.anInt3145 * 464964387, -264147330) && IndexLoaders.SPRITES_INDEX.method5661(Class446.anInt5396 * -781860267, -692931447) && IndexLoaders.SPRITES_INDEX.method5661(-1965396391 * Class17.anInt148, -826996403)) {
			Class91 class91 = Class91.method1522(IndexLoaders.SPRITES_INDEX, -781860267 * Class446.anInt5396, 0);
			AttributeDefault.aClass160_5339 = class505.method8444(class91, true);
			class91.method1525();
			Class290.aClass160_3452 = class505.method8444(class91, true);
			Class354.aClass160_4110 = (class505.method8444(Class91.method1522(IndexLoaders.SPRITES_INDEX, 464964387 * Class254.anInt3145, 0), true));
			Class91 class91_451_ = Class91.method1522(IndexLoaders.SPRITES_INDEX, Class17.anInt148 * -1965396391, 0);
			Class125.aClass160_1571 = class505.method8444(class91_451_, true);
			class91_451_.method1525();
			Class149_Sub2.aClass160_9315 = class505.method8444(class91_451_, true);
		}
		if (null != Class354.aClass160_4110 && AttributeDefault.aClass160_5339 != null && Class125.aClass160_1571 != null) {
			int i_452_ = ((i_448_ - Class125.aClass160_1571.method2747() * 2) / Class354.aClass160_4110.method2747());
			for (int i_453_ = 0; i_453_ < i_452_; i_453_++)
				Class354.aClass160_4110.method2752((i + Class125.aClass160_1571.method2747() + i_453_ * Class354.aClass160_4110.method2747()), i_447_ + i_449_ - Class354.aClass160_4110.method2793());
			int i_454_ = ((i_449_ - i_450_ - Class125.aClass160_1571.method2793()) / AttributeDefault.aClass160_5339.method2793());
			for (int i_455_ = 0; i_455_ < i_454_; i_455_++) {
				AttributeDefault.aClass160_5339.method2752(i, (i_450_ + i_447_ + i_455_ * AttributeDefault.aClass160_5339.method2793()));
				Class290.aClass160_3452.method2752(i + i_448_ - Class290.aClass160_3452.method2747(), (i_450_ + i_447_ + i_455_ * AttributeDefault.aClass160_5339.method2793()));
			}
			Class125.aClass160_1571.method2752(i, (i_449_ + i_447_ - Class125.aClass160_1571.method2793()));
			Class149_Sub2.aClass160_9315.method2752(i_448_ + i - Class125.aClass160_1571.method2747(), i_449_ + i_447_ - Class125.aClass160_1571.method2793());
		}
	}

	static String method710(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (null == ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585 || ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585.length() == 0) {
			if (((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588 != null && ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588.length() > 0)
				return new StringBuilder().append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576).append(Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE, -892463948)).append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588).toString();
			return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576;
		}
		if (((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588 != null && ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588.length() > 0)
			return new StringBuilder().append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576).append(Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE, -823255574)).append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588).append(Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE, -1324068879)).append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585).toString();
		return new StringBuilder().append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576).append(Message.aClass433_5315.translate(Class223.CURRENT_LANGUAGE, -919488629)).append(((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585).toString();
	}

	public static void method711(NativeSprite[] class160s) {
		anInt186 = class160s.length * 1884228835;
		Class115.aClass160Array1248 = new NativeSprite[anInt186 * 1104058571 + 10];
		anIntArray177 = new int[1104058571 * anInt186 + 10];
		System.arraycopy(class160s, 0, Class115.aClass160Array1248, 0, anInt186 * 1104058571);
		for (int i = 0; i < anInt186 * 1104058571; i++)
			anIntArray177[i] = Class115.aClass160Array1248[i].method2748();
		for (int i = anInt186 * 1104058571; i < Class115.aClass160Array1248.length; i++)
			anIntArray177[i] = 12;
	}

	static int method712(Class282_Sub50_Sub15 class282_sub50_sub15, Class414 class414) {
		String string = Class75.method1354(class282_sub50_sub15, -938758900);
		return class414.method6947(string, Class115.aClass160Array1248, 1203543612);
	}

	static int method713(Class282_Sub50_Sub15 class282_sub50_sub15, Class414 class414) {
		String string = Class75.method1354(class282_sub50_sub15, -938758900);
		return class414.method6947(string, Class115.aClass160Array1248, 1817929649);
	}

	static void method714(String string, String string_456_, int i, int i_457_, int i_458_, long l, int i_459_, int i_460_, boolean bool, boolean bool_461_, long l_462_, boolean bool_463_) {
		if (!aBool161 && anInt169 * 2144330291 < 520) {
			i = -1 != i ? i : -1211259595 * client.anInt7427;
			Class282_Sub50_Sub7 class282_sub50_sub7 = new Class282_Sub50_Sub7(string, string_456_, i, i_457_, i_458_, l, i_459_, i_460_, bool, bool_461_, l_462_, bool_463_);
			Class361.method6269(class282_sub50_sub7, -1498808978);
		}
	}

	static boolean method715(int i) {
		return 57 == i || i == 58 || i == 1007 || i == 25 || 30 == i;
	}

	static int method716(Class282_Sub50_Sub7 class282_sub50_sub7, Class414 class414) {
		String string = IncomingPacket.method6380(class282_sub50_sub7, 126398846);
		int[] is = Class534_Sub1.method12815(class282_sub50_sub7, -2084880569);
		if (is != null)
			string = new StringBuilder().append(string).append(Class15.method547(is, 1999201877)).toString();
		int i = class414.method6947(string, Class115.aClass160Array1248, 1148330610);
		if (((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9577)
			i += Exception_Sub1.aClass160_10075.method2747() + 4;
		return i;
	}

	static void method717(int i, int i_464_, int i_465_, int i_466_, int i_467_, int i_468_, int i_469_, Class282_Sub50_Sub15 class282_sub50_sub15, FontRenderer class8, Class414 class414, int i_470_, int i_471_) {
		if (i > i_465_ && i < i_467_ + i_465_ && i_464_ > i_469_ - 397683159 * class414.anInt4978 - 1 && i_464_ < i_469_ + class414.anInt4979 * -1518951631)
			i_470_ = i_471_;
		String string = Class75.method1354(class282_sub50_sub15, -938758900);
		class8.method386(string, 3 + i_465_, i_469_, i_470_, 0, client.aRandom7260, -242333475 * PacketsDecoder.anInt9079, Class115.aClass160Array1248, anIntArray177, -710711122);
	}

	public static String method718(Class282_Sub50_Sub7 class282_sub50_sub7) {
		if (aBool161 || null == class282_sub50_sub7)
			return "";
		return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9576;
	}

	public static void method719(NativeSprite[] class160s) {
		anInt186 = class160s.length * 1884228835;
		Class115.aClass160Array1248 = new NativeSprite[anInt186 * 1104058571 + 10];
		anIntArray177 = new int[1104058571 * anInt186 + 10];
		System.arraycopy(class160s, 0, Class115.aClass160Array1248, 0, anInt186 * 1104058571);
		for (int i = 0; i < anInt186 * 1104058571; i++)
			anIntArray177[i] = Class115.aClass160Array1248[i].method2748();
		for (int i = anInt186 * 1104058571; i < Class115.aClass160Array1248.length; i++)
			anIntArray177[i] = 12;
	}

	static boolean method720(int i) {
		if (18 == i || i == 19 || i == 20 || i == 21 || 22 == i || 1004 == i)
			return true;
		if (i == 17)
			return true;
		return false;
	}

	static boolean method721(int i) {
		if (i == 9 || 10 == i || i == 11 || i == 12 || 13 == i || i == 1003)
			return true;
		if (8 == i)
			return true;
		return false;
	}

	static boolean method722(int i) {
		return (44 == i || 45 == i || i == 46 || 47 == i || i == 48 || 49 == i || i == 50 || 51 == i || i == 52 || i == 53 || 15 == i);
	}

	static void method723(NPC class521_sub1_sub1_sub2_sub2, boolean bool) {
		if (2144330291 * anInt169 < 412) {
			NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
			String string = class521_sub1_sub1_sub2_sub2.aString10584;
			if (class409.anIntArray4886 != null) {
				class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
				if (null == class409)
					return;
				string = class409.aString4857;
			}
			if (class409.aBool4893) {
				if (class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433 != 0) {
					String string_472_ = (client.CURRENT_GAME == Game.stellarDawn ? (Message.RATING_.translate(Class223.CURRENT_LANGUAGE, -1319727464)) : (Message.LEVEL_.translate(Class223.CURRENT_LANGUAGE, -2068832399)));
					string = new StringBuilder().append(string).append(ItemIndexLoader.method7169((class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433), (Class84.myPlayer.anInt10565) * -1880473919, 80942677)).append(Class2.aString15).append(string_472_).append(class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433).append(Class2.aString18).toString();
				}
				if (client.aBool7344 && !bool) {
					AttributeDefault class437 = (-1 != Class96_Sub12.anInt9319 * -1605351655 ? (IndexLoaders.ITEM_DEFAULTS.method7069(-1605351655 * Class96_Sub12.anInt9319, (byte) 0)) : null);
					if (0 != (Class506.anInt5858 * 1310510077 & 0x2) && (null == class437 || (class409.method6876((-1605351655 * (Class96_Sub12.anInt9319)), (-1741480635 * class437.anInt5337), 1120974530) != class437.anInt5337 * -1741480635)))
						PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16776960, 619010179)).append(string).toString(), -239192305 * Defaults8Loader.anInt5932, 8, -1, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub2.anInt10314)), 0, 0, true, false, (long) (class521_sub1_sub1_sub2_sub2.anInt10314 * -1691508299), false, -1026837686);
				}
				if (!bool) {
					String[] strings = class409.aStringArray4882;
					if (client.aBool7264)
						strings = Class362.method6277(strings, (short) 21349);
					if (null != strings) {
						for (int i = strings.length - 1; i >= 0; i--) {
							if (null != strings[i] && (0 == class409.aByte4916 || (!(strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -2067192427))) && !(strings[i].equalsIgnoreCase(Message.EXAMINE.translate(Class223.CURRENT_LANGUAGE, -1556675934)))))) {
								int i_473_ = 0;
								int i_474_ = 452205213 * client.anInt7342;
								if (0 == i)
									i_473_ = 9;
								if (1 == i)
									i_473_ = 10;
								if (2 == i)
									i_473_ = 11;
								if (3 == i)
									i_473_ = 12;
								if (i == 4)
									i_473_ = 13;
								if (5 == i)
									i_473_ = 1003;
								if (-1111700649 * class409.anInt4875 == i)
									i_474_ = class409.anInt4873 * -370908623;
								if (class409.anInt4854 * 351313017 == i)
									i_474_ = class409.anInt4861 * -574217529;
								PlayerAppearance.method4032(strings[i], new StringBuilder().append(Class59.method1163(16776960, 619010179)).append(string).toString(), ((strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -1259625961))) ? -1025853585 * class409.anInt4877 : i_474_), i_473_, -1, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), 0, 0, true, false, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), false, -1815517695);
							}
						}
						if (1 == class409.aByte4916) {
							for (int i = 0; i < strings.length; i++) {
								if (null != strings[i] && ((strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -1260387087))) || (strings[i].equalsIgnoreCase(Message.EXAMINE.translate(Class223.CURRENT_LANGUAGE, -752843105))))) {
									short i_475_ = 0;
									if ((-1394313433 * (class521_sub1_sub1_sub2_sub2.anInt10582)) > (-1880473919 * (Class84.myPlayer.anInt10565)))
										i_475_ = (short) 2000;
									short i_476_ = 0;
									int i_477_ = 452205213 * client.anInt7342;
									if (0 == i)
										i_476_ = (short) 9;
									if (i == 1)
										i_476_ = (short) 10;
									if (i == 2)
										i_476_ = (short) 11;
									if (i == 3)
										i_476_ = (short) 12;
									if (4 == i)
										i_476_ = (short) 13;
									if (5 == i)
										i_476_ = (short) 1003;
									if (i_476_ != 0)
										i_476_ += i_475_;
									if (-1111700649 * class409.anInt4875 == i)
										i_477_ = -370908623 * class409.anInt4873;
									if (class409.anInt4854 * 351313017 == i)
										i_477_ = class409.anInt4861 * -574217529;
									PlayerAppearance.method4032(strings[i], new StringBuilder().append(Class59.method1163(16776960, 619010179)).append(string).toString(), ((strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -399734991))) ? -1025853585 * class409.anInt4877 : i_477_), i_476_, -1, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), 0, 0, true, false, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub2.anInt10314)), false, -1035015716);
								}
							}
						}
					}
				}
			}
		}
	}

	static void method724(NPC class521_sub1_sub1_sub2_sub2, boolean bool) {
		if (2144330291 * anInt169 < 412) {
			NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
			String string = class521_sub1_sub1_sub2_sub2.aString10584;
			if (class409.anIntArray4886 != null) {
				class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
				if (null == class409)
					return;
				string = class409.aString4857;
			}
			if (class409.aBool4893) {
				if (class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433 != 0) {
					String string_478_ = (client.CURRENT_GAME == Game.stellarDawn ? (Message.RATING_.translate(Class223.CURRENT_LANGUAGE, -1543977130)) : (Message.LEVEL_.translate(Class223.CURRENT_LANGUAGE, -469357428)));
					string = new StringBuilder().append(string).append(ItemIndexLoader.method7169((class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433), (Class84.myPlayer.anInt10565) * -1880473919, 1122038413)).append(Class2.aString15).append(string_478_).append(class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433).append(Class2.aString18).toString();
				}
				if (client.aBool7344 && !bool) {
					AttributeDefault class437 = (-1 != Class96_Sub12.anInt9319 * -1605351655 ? (IndexLoaders.ITEM_DEFAULTS.method7069(-1605351655 * Class96_Sub12.anInt9319, (byte) 0)) : null);
					if (0 != (Class506.anInt5858 * 1310510077 & 0x2) && (null == class437 || (class409.method6876((-1605351655 * (Class96_Sub12.anInt9319)), (-1741480635 * class437.anInt5337), 1947573638) != class437.anInt5337 * -1741480635)))
						PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16776960, 619010179)).append(string).toString(), -239192305 * Defaults8Loader.anInt5932, 8, -1, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub2.anInt10314)), 0, 0, true, false, (long) (class521_sub1_sub1_sub2_sub2.anInt10314 * -1691508299), false, -1666622222);
				}
				if (!bool) {
					String[] strings = class409.aStringArray4882;
					if (client.aBool7264)
						strings = Class362.method6277(strings, (short) 26750);
					if (null != strings) {
						for (int i = strings.length - 1; i >= 0; i--) {
							if (null != strings[i] && (0 == class409.aByte4916 || (!(strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -1909150003))) && !(strings[i].equalsIgnoreCase(Message.EXAMINE.translate(Class223.CURRENT_LANGUAGE, -1973437812)))))) {
								int i_479_ = 0;
								int i_480_ = 452205213 * client.anInt7342;
								if (0 == i)
									i_479_ = 9;
								if (1 == i)
									i_479_ = 10;
								if (2 == i)
									i_479_ = 11;
								if (3 == i)
									i_479_ = 12;
								if (i == 4)
									i_479_ = 13;
								if (5 == i)
									i_479_ = 1003;
								if (-1111700649 * class409.anInt4875 == i)
									i_480_ = class409.anInt4873 * -370908623;
								if (class409.anInt4854 * 351313017 == i)
									i_480_ = class409.anInt4861 * -574217529;
								PlayerAppearance.method4032(strings[i], new StringBuilder().append(Class59.method1163(16776960, 619010179)).append(string).toString(), ((strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -342150227))) ? -1025853585 * class409.anInt4877 : i_480_), i_479_, -1, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), 0, 0, true, false, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), false, -1394575733);
							}
						}
						if (1 == class409.aByte4916) {
							for (int i = 0; i < strings.length; i++) {
								if (null != strings[i] && ((strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -466917867))) || (strings[i].equalsIgnoreCase(Message.EXAMINE.translate(Class223.CURRENT_LANGUAGE, -1239250177))))) {
									short i_481_ = 0;
									if ((-1394313433 * (class521_sub1_sub1_sub2_sub2.anInt10582)) > (-1880473919 * (Class84.myPlayer.anInt10565)))
										i_481_ = (short) 2000;
									short i_482_ = 0;
									int i_483_ = 452205213 * client.anInt7342;
									if (0 == i)
										i_482_ = (short) 9;
									if (i == 1)
										i_482_ = (short) 10;
									if (i == 2)
										i_482_ = (short) 11;
									if (i == 3)
										i_482_ = (short) 12;
									if (4 == i)
										i_482_ = (short) 13;
									if (5 == i)
										i_482_ = (short) 1003;
									if (i_482_ != 0)
										i_482_ += i_481_;
									if (-1111700649 * class409.anInt4875 == i)
										i_483_ = -370908623 * class409.anInt4873;
									if (class409.anInt4854 * 351313017 == i)
										i_483_ = class409.anInt4861 * -574217529;
									PlayerAppearance.method4032(strings[i], new StringBuilder().append(Class59.method1163(16776960, 619010179)).append(string).toString(), ((strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -1935337448))) ? -1025853585 * class409.anInt4877 : i_483_), i_482_, -1, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), 0, 0, true, false, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub2.anInt10314)), false, -1071921197);
								}
							}
						}
					}
				}
			}
		}
	}

	static void method725(NPC class521_sub1_sub1_sub2_sub2, boolean bool) {
		if (2144330291 * anInt169 < 412) {
			NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
			String string = class521_sub1_sub1_sub2_sub2.aString10584;
			if (class409.anIntArray4886 != null) {
				class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
				if (null == class409)
					return;
				string = class409.aString4857;
			}
			if (class409.aBool4893) {
				if (class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433 != 0) {
					String string_484_ = (client.CURRENT_GAME == Game.stellarDawn ? (Message.RATING_.translate(Class223.CURRENT_LANGUAGE, -1347993184)) : (Message.LEVEL_.translate(Class223.CURRENT_LANGUAGE, -906974120)));
					string = new StringBuilder().append(string).append(ItemIndexLoader.method7169((class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433), (Class84.myPlayer.anInt10565) * -1880473919, 533714476)).append(Class2.aString15).append(string_484_).append(class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433).append(Class2.aString18).toString();
				}
				if (client.aBool7344 && !bool) {
					AttributeDefault class437 = (-1 != Class96_Sub12.anInt9319 * -1605351655 ? (IndexLoaders.ITEM_DEFAULTS.method7069(-1605351655 * Class96_Sub12.anInt9319, (byte) 0)) : null);
					if (0 != (Class506.anInt5858 * 1310510077 & 0x2) && (null == class437 || (class409.method6876((-1605351655 * (Class96_Sub12.anInt9319)), (-1741480635 * class437.anInt5337), -1692012979) != class437.anInt5337 * -1741480635)))
						PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16776960, 619010179)).append(string).toString(), -239192305 * Defaults8Loader.anInt5932, 8, -1, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub2.anInt10314)), 0, 0, true, false, (long) (class521_sub1_sub1_sub2_sub2.anInt10314 * -1691508299), false, -1433597209);
				}
				if (!bool) {
					String[] strings = class409.aStringArray4882;
					if (client.aBool7264)
						strings = Class362.method6277(strings, (short) 15968);
					if (null != strings) {
						for (int i = strings.length - 1; i >= 0; i--) {
							if (null != strings[i] && (0 == class409.aByte4916 || (!(strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -1174428506))) && !(strings[i].equalsIgnoreCase(Message.EXAMINE.translate(Class223.CURRENT_LANGUAGE, -1267593007)))))) {
								int i_485_ = 0;
								int i_486_ = 452205213 * client.anInt7342;
								if (0 == i)
									i_485_ = 9;
								if (1 == i)
									i_485_ = 10;
								if (2 == i)
									i_485_ = 11;
								if (3 == i)
									i_485_ = 12;
								if (i == 4)
									i_485_ = 13;
								if (5 == i)
									i_485_ = 1003;
								if (-1111700649 * class409.anInt4875 == i)
									i_486_ = class409.anInt4873 * -370908623;
								if (class409.anInt4854 * 351313017 == i)
									i_486_ = class409.anInt4861 * -574217529;
								PlayerAppearance.method4032(strings[i], new StringBuilder().append(Class59.method1163(16776960, 619010179)).append(string).toString(), ((strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -926195981))) ? -1025853585 * class409.anInt4877 : i_486_), i_485_, -1, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), 0, 0, true, false, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), false, -1804989342);
							}
						}
						if (1 == class409.aByte4916) {
							for (int i = 0; i < strings.length; i++) {
								if (null != strings[i] && ((strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -689546248))) || (strings[i].equalsIgnoreCase(Message.EXAMINE.translate(Class223.CURRENT_LANGUAGE, -386838720))))) {
									short i_487_ = 0;
									if ((-1394313433 * (class521_sub1_sub1_sub2_sub2.anInt10582)) > (-1880473919 * (Class84.myPlayer.anInt10565)))
										i_487_ = (short) 2000;
									short i_488_ = 0;
									int i_489_ = 452205213 * client.anInt7342;
									if (0 == i)
										i_488_ = (short) 9;
									if (i == 1)
										i_488_ = (short) 10;
									if (i == 2)
										i_488_ = (short) 11;
									if (i == 3)
										i_488_ = (short) 12;
									if (4 == i)
										i_488_ = (short) 13;
									if (5 == i)
										i_488_ = (short) 1003;
									if (i_488_ != 0)
										i_488_ += i_487_;
									if (-1111700649 * class409.anInt4875 == i)
										i_489_ = -370908623 * class409.anInt4873;
									if (class409.anInt4854 * 351313017 == i)
										i_489_ = class409.anInt4861 * -574217529;
									PlayerAppearance.method4032(strings[i], new StringBuilder().append(Class59.method1163(16776960, 619010179)).append(string).toString(), ((strings[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -2004592044))) ? -1025853585 * class409.anInt4877 : i_489_), i_488_, -1, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), 0, 0, true, false, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub2.anInt10314)), false, -1125318655);
								}
							}
						}
					}
				}
			}
		}
	}

	static void method726(Player class521_sub1_sub1_sub2_sub1, boolean bool) {
		if (anInt169 * 2144330291 < 412) {
			if (Class84.myPlayer == class521_sub1_sub1_sub2_sub1) {
				if (client.aBool7344 && (Class506.anInt5858 * 1310510077 & 0x10) != 0)
					PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16777215, 619010179)).append(Message.aClass433_5299.translate(Class223.CURRENT_LANGUAGE, -1734035197)).toString(), Defaults8Loader.anInt5932 * -239192305, 16, -1, 0L, 0, 0, true, false, (long) (class521_sub1_sub1_sub2_sub1.anInt10314 * -1691508299), false, -1622407490);
			} else {
				String string;
				if (0 == -1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556) {
					boolean bool_490_ = true;
					if (1519880441 * (Class84.myPlayer.anInt10555) != -1 && -1 != (1519880441 * class521_sub1_sub1_sub2_sub1.anInt10555)) {
						int i = (((Class84.myPlayer.anInt10555) * 1519880441 < (1519880441 * class521_sub1_sub1_sub2_sub1.anInt10555)) ? (1519880441 * (Class84.myPlayer.anInt10555)) : (class521_sub1_sub1_sub2_sub1.anInt10555 * 1519880441));
						int i_491_ = ((-1880473919 * (Class84.myPlayer.anInt10565)) - (-1880473919 * class521_sub1_sub1_sub2_sub1.anInt10565));
						if (i_491_ < 0)
							i_491_ = -i_491_;
						if (i_491_ > i)
							bool_490_ = false;
					}
					String string_492_ = (client.CURRENT_GAME == Game.stellarDawn ? (Message.RATING_.translate(Class223.CURRENT_LANGUAGE, -1751610016)) : (Message.LEVEL_.translate(Class223.CURRENT_LANGUAGE, -1835550589)));
					if (class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919 >= class521_sub1_sub1_sub2_sub1.anInt10554 * 410641457)
						string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 1971897301)).append(bool_490_ ? (ItemIndexLoader.method7169((-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565)), (-1880473919 * (Class84.myPlayer.anInt10565)), 2050580958)) : Class59.method1163(16777215, 619010179)).append(Class2.aString15).append(string_492_).append(class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919).append(Class2.aString18).toString();
					else
						string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 1944957827)).append(bool_490_ ? (ItemIndexLoader.method7169((-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565)), (-1880473919 * (Class84.myPlayer.anInt10565)), 708110059)) : Class59.method1163(16777215, 619010179)).append(Class2.aString15).append(string_492_).append(class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919).append("+")
								.append((410641457 * class521_sub1_sub1_sub2_sub1.anInt10554) - (-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565))).append(Class2.aString18).toString();
				} else if (-1 == (-1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556))
					string = class521_sub1_sub1_sub2_sub1.method16127(true, 2079774210);
				else
					string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 2100006537)).append(Class2.aString15).append(Message.SKILL_.translate(Class223.CURRENT_LANGUAGE, -471152006)).append(-1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556).append(Class2.aString18).toString();
				if (client.aBool7344 && !bool && 0 != (1310510077 * Class506.anInt5858 & 0x8))
					PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16777215, 619010179)).append(string).toString(), Defaults8Loader.anInt5932 * -239192305, 15, -1, (long) (class521_sub1_sub1_sub2_sub1.anInt10314 * -1691508299), 0, 0, true, false, (long) (-1691508299 * class521_sub1_sub1_sub2_sub1.anInt10314), false, -2116921247);
				if (!bool) {
					for (int i = 7; i >= 0; i--) {
						if (client.aStringArray7329[i] != null) {
							short i_493_ = 0;
							if ((Game.runescape == client.CURRENT_GAME) && (client.aStringArray7329[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -686029929)))) {
								if (client.aBool7454 && ((class521_sub1_sub1_sub2_sub1.anInt10565) * -1880473919 > (-1880473919 * (Class84.myPlayer.anInt10565))))
									i_493_ = (short) 2000;
								if ((-1623446397 * (Class84.myPlayer.anInt10559)) != 0 && 0 != (class521_sub1_sub1_sub2_sub1.anInt10559) * -1623446397) {
									if ((class521_sub1_sub1_sub2_sub1.anInt10559) * -1623446397 == (-1623446397 * (Class84.myPlayer.anInt10559)))
										i_493_ = (short) 2000;
									else
										i_493_ = (short) 0;
								} else if (class521_sub1_sub1_sub2_sub1.aBool10550)
									i_493_ = (short) 2000;
							} else if (client.aBoolArray7330[i])
								i_493_ = (short) 2000;
							short i_494_ = (short) (i_493_ + client.aShortArray7239[i]);
							int i_495_ = (-1 != client.anIntArray7328[i] ? client.anIntArray7328[i] : 452205213 * client.anInt7342);
							PlayerAppearance.method4032(client.aStringArray7329[i], new StringBuilder().append(Class59.method1163(16777215, 619010179)).append(string).toString(), i_495_, i_494_, -1, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), 0, 0, true, false, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), false, -1990942889);
						}
					}
				} else
					PlayerAppearance.method4032(new StringBuilder().append(Class59.method1163(13421772, 619010179)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), false, -1517318089);
				if (!bool) {
					for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 30)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(1393523696))) {
						if (23 == -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) {
							((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585 = new StringBuilder().append(Class59.method1163(16777215, 619010179)).append(string).toString();
							break;
						}
					}
				}
			}
		}
	}

	static void method727(GraphicalRenderer class505, int i, int i_496_, int i_497_, int i_498_, int i_499_) {
		if ((null == Class354.aClass160_4110 || null == AttributeDefault.aClass160_5339 || Class125.aClass160_1571 == null) && IndexLoaders.SPRITES_INDEX.method5661(Class254.anInt3145 * 464964387, 1099207318) && IndexLoaders.SPRITES_INDEX.method5661(Class446.anInt5396 * -781860267, -2144123100) && IndexLoaders.SPRITES_INDEX.method5661(-1965396391 * Class17.anInt148, -1682702249)) {
			Class91 class91 = Class91.method1522(IndexLoaders.SPRITES_INDEX, -781860267 * Class446.anInt5396, 0);
			AttributeDefault.aClass160_5339 = class505.method8444(class91, true);
			class91.method1525();
			Class290.aClass160_3452 = class505.method8444(class91, true);
			Class354.aClass160_4110 = (class505.method8444(Class91.method1522(IndexLoaders.SPRITES_INDEX, 464964387 * Class254.anInt3145, 0), true));
			Class91 class91_500_ = Class91.method1522(IndexLoaders.SPRITES_INDEX, Class17.anInt148 * -1965396391, 0);
			Class125.aClass160_1571 = class505.method8444(class91_500_, true);
			class91_500_.method1525();
			Class149_Sub2.aClass160_9315 = class505.method8444(class91_500_, true);
		}
		if (null != Class354.aClass160_4110 && AttributeDefault.aClass160_5339 != null && Class125.aClass160_1571 != null) {
			int i_501_ = ((i_497_ - Class125.aClass160_1571.method2747() * 2) / Class354.aClass160_4110.method2747());
			for (int i_502_ = 0; i_502_ < i_501_; i_502_++)
				Class354.aClass160_4110.method2752((i + Class125.aClass160_1571.method2747() + i_502_ * Class354.aClass160_4110.method2747()), i_496_ + i_498_ - Class354.aClass160_4110.method2793());
			int i_503_ = ((i_498_ - i_499_ - Class125.aClass160_1571.method2793()) / AttributeDefault.aClass160_5339.method2793());
			for (int i_504_ = 0; i_504_ < i_503_; i_504_++) {
				AttributeDefault.aClass160_5339.method2752(i, (i_499_ + i_496_ + i_504_ * AttributeDefault.aClass160_5339.method2793()));
				Class290.aClass160_3452.method2752(i + i_497_ - Class290.aClass160_3452.method2747(), (i_499_ + i_496_ + i_504_ * AttributeDefault.aClass160_5339.method2793()));
			}
			Class125.aClass160_1571.method2752(i, (i_498_ + i_496_ - Class125.aClass160_1571.method2793()));
			Class149_Sub2.aClass160_9315.method2752(i_497_ + i - Class125.aClass160_1571.method2747(), i_498_ + i_496_ - Class125.aClass160_1571.method2793());
		}
	}

	static void method728(Player class521_sub1_sub1_sub2_sub1, boolean bool) {
		if (anInt169 * 2144330291 < 412) {
			if (Class84.myPlayer == class521_sub1_sub1_sub2_sub1) {
				if (client.aBool7344 && (Class506.anInt5858 * 1310510077 & 0x10) != 0)
					PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16777215, 619010179)).append(Message.aClass433_5299.translate(Class223.CURRENT_LANGUAGE, -1006246999)).toString(), Defaults8Loader.anInt5932 * -239192305, 16, -1, 0L, 0, 0, true, false, (long) (class521_sub1_sub1_sub2_sub1.anInt10314 * -1691508299), false, -2111107605);
			} else {
				String string;
				if (0 == -1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556) {
					boolean bool_505_ = true;
					if (1519880441 * (Class84.myPlayer.anInt10555) != -1 && -1 != (1519880441 * class521_sub1_sub1_sub2_sub1.anInt10555)) {
						int i = (((Class84.myPlayer.anInt10555) * 1519880441 < (1519880441 * class521_sub1_sub1_sub2_sub1.anInt10555)) ? (1519880441 * (Class84.myPlayer.anInt10555)) : (class521_sub1_sub1_sub2_sub1.anInt10555 * 1519880441));
						int i_506_ = ((-1880473919 * (Class84.myPlayer.anInt10565)) - (-1880473919 * class521_sub1_sub1_sub2_sub1.anInt10565));
						if (i_506_ < 0)
							i_506_ = -i_506_;
						if (i_506_ > i)
							bool_505_ = false;
					}
					String string_507_ = (client.CURRENT_GAME == Game.stellarDawn ? (Message.RATING_.translate(Class223.CURRENT_LANGUAGE, -2068036808)) : (Message.LEVEL_.translate(Class223.CURRENT_LANGUAGE, -863150707)));
					if (class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919 >= class521_sub1_sub1_sub2_sub1.anInt10554 * 410641457)
						string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 2045113708)).append(bool_505_ ? (ItemIndexLoader.method7169((-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565)), (-1880473919 * (Class84.myPlayer.anInt10565)), 1237906459)) : Class59.method1163(16777215, 619010179)).append(Class2.aString15).append(string_507_).append(class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919).append(Class2.aString18).toString();
					else
						string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 2024318103)).append(bool_505_ ? (ItemIndexLoader.method7169((-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565)), (-1880473919 * (Class84.myPlayer.anInt10565)), 301726163)) : Class59.method1163(16777215, 619010179)).append(Class2.aString15).append(string_507_).append(class521_sub1_sub1_sub2_sub1.anInt10565 * -1880473919).append("+")
								.append((410641457 * class521_sub1_sub1_sub2_sub1.anInt10554) - (-1880473919 * (class521_sub1_sub1_sub2_sub1.anInt10565))).append(Class2.aString18).toString();
				} else if (-1 == (-1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556))
					string = class521_sub1_sub1_sub2_sub1.method16127(true, 2120444356);
				else
					string = new StringBuilder().append(class521_sub1_sub1_sub2_sub1.method16127(true, 2117684263)).append(Class2.aString15).append(Message.SKILL_.translate(Class223.CURRENT_LANGUAGE, -258603512)).append(-1231486985 * class521_sub1_sub1_sub2_sub1.anInt10556).append(Class2.aString18).toString();
				if (client.aBool7344 && !bool && 0 != (1310510077 * Class506.anInt5858 & 0x8))
					PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16777215, 619010179)).append(string).toString(), Defaults8Loader.anInt5932 * -239192305, 15, -1, (long) (class521_sub1_sub1_sub2_sub1.anInt10314 * -1691508299), 0, 0, true, false, (long) (-1691508299 * class521_sub1_sub1_sub2_sub1.anInt10314), false, -1515517375);
				if (!bool) {
					for (int i = 7; i >= 0; i--) {
						if (client.aStringArray7329[i] != null) {
							short i_508_ = 0;
							if ((Game.runescape == client.CURRENT_GAME) && (client.aStringArray7329[i].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -1655332215)))) {
								if (client.aBool7454 && ((class521_sub1_sub1_sub2_sub1.anInt10565) * -1880473919 > (-1880473919 * (Class84.myPlayer.anInt10565))))
									i_508_ = (short) 2000;
								if ((-1623446397 * (Class84.myPlayer.anInt10559)) != 0 && 0 != (class521_sub1_sub1_sub2_sub1.anInt10559) * -1623446397) {
									if ((class521_sub1_sub1_sub2_sub1.anInt10559) * -1623446397 == (-1623446397 * (Class84.myPlayer.anInt10559)))
										i_508_ = (short) 2000;
									else
										i_508_ = (short) 0;
								} else if (class521_sub1_sub1_sub2_sub1.aBool10550)
									i_508_ = (short) 2000;
							} else if (client.aBoolArray7330[i])
								i_508_ = (short) 2000;
							short i_509_ = (short) (i_508_ + client.aShortArray7239[i]);
							int i_510_ = (-1 != client.anIntArray7328[i] ? client.anIntArray7328[i] : 452205213 * client.anInt7342);
							PlayerAppearance.method4032(client.aStringArray7329[i], new StringBuilder().append(Class59.method1163(16777215, 619010179)).append(string).toString(), i_510_, i_509_, -1, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), 0, 0, true, false, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), false, -1013907721);
						}
					}
				} else
					PlayerAppearance.method4032(new StringBuilder().append(Class59.method1163(13421772, 619010179)).append(string).toString(), "", -1, -1, 0, 0L, 0, 0, false, true, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub1.anInt10314)), false, -1037857130);
				if (!bool) {
					for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.head((byte) 35)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) aClass482_171.next(1198430958))) {
						if (23 == -1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587) {
							((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585 = new StringBuilder().append(Class59.method1163(16777215, 619010179)).append(string).toString();
							break;
						}
					}
				}
			}
		}
	}

	static String method729(Class118 class118, int i) {
		if (!client.method11633(class118).method12178(i, (short) -3127) && class118.anObjectArray1410 == null)
			return null;
		if (class118.aStringArray1352 == null || class118.aStringArray1352.length <= i || class118.aStringArray1352[i] == null || class118.aStringArray1352[i].trim().length() == 0) {
			if (client.aBool7168)
				return new StringBuilder().append("Hidden-").append(i).toString();
			return null;
		}
		return class118.aStringArray1352[i];
	}

	static void method730(Class282_Sub50_Sub15 class282_sub50_sub15) {
		boolean bool = false;
		class282_sub50_sub15.method13452((byte) -5);
		for (Class282_Sub50_Sub15 class282_sub50_sub15_511_ = (Class282_Sub50_Sub15) aClass477_182.method7941((byte) 4); null != class282_sub50_sub15_511_; class282_sub50_sub15_511_ = ((Class282_Sub50_Sub15) aClass477_182.method7955(-1214760263))) {
			if (Class301.method5334(class282_sub50_sub15.method15244((byte) 39), class282_sub50_sub15_511_.method15244((byte) 115), -316367955)) {
				Class224.method3782(class282_sub50_sub15, class282_sub50_sub15_511_, -668427190);
				bool = true;
				break;
			}
		}
		if (!bool)
			aClass477_182.method7936(class282_sub50_sub15, -1738910950);
	}

	public static void method731() {
		Class96.method1607((byte) 101);
		Class115.aClass160Array1248 = null;
	}

	static void method732(Class384 class384) {
		aClass384_185.method6562(class384);
	}

	static void method733(GraphicalRenderer class505) {
		if (aBool161)
			Class354.method6216(class505, 2137511500);
		else
			Class268.method4800(class505, (byte) 127);
	}

	static void method734(Class282_Sub50_Sub7 class282_sub50_sub7, int i, int i_512_) {
		if (null != class282_sub50_sub7 && aClass482_171.head != class282_sub50_sub7) {
			int i_513_ = (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9581 * 1575008129);
			int i_514_ = (395156599 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9582);
			int i_515_ = (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225);
			int i_516_ = (int) (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584));
			long l = (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584 * -5876141066140255231L);
			if (i_515_ >= 2000)
				i_515_ -= 2000;
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(194199099);
			OutgoingPacket class379 = null;
			if (i_515_ == 44)
				class379 = OutgoingPacket.aClass379_4539;
			else if (45 == i_515_)
				class379 = OutgoingPacket.aClass379_4571;
			else if (46 == i_515_)
				class379 = OutgoingPacket.aClass379_4623;
			else if (i_515_ == 47)
				class379 = OutgoingPacket.aClass379_4616;
			else if (48 == i_515_)
				class379 = OutgoingPacket.aClass379_4610;
			else if (i_515_ == 49)
				class379 = OutgoingPacket.aClass379_4528;
			else if (i_515_ == 50)
				class379 = OutgoingPacket.aClass379_4594;
			else if (51 == i_515_)
				class379 = OutgoingPacket.aClass379_4621;
			else if (i_515_ == 52)
				class379 = OutgoingPacket.aClass379_4580;
			else if (i_515_ == 53)
				class379 = OutgoingPacket.aClass379_4629;
			if (null != class379) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i_516_];
				if (null != class521_sub1_sub1_sub2_sub1) {
					client.anInt7293 = -1271587837 * i;
					client.anInt7294 = 1614548531 * i_512_;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379, (client.aClass184_7475.aClass432_2283), -480371745);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_516_, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1904568160) ? 1 : 0, 35762767);
					client.aClass184_7475.method3049(class282_sub23, -880703104);
					MapRegion.method4559(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], true, (Class344.method6115(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], class521_sub1_sub1_sub2_sub1.method15805(828768449), class521_sub1_sub1_sub2_sub1.method15805(828768449), 0, 971339209)), 1685361278);
				}
			}
			if (16 == i_515_) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_512_;
				client.anInt7296 = -370989110;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4540, client.aClass184_7475.aClass432_2283, -183172856);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(client.anInt7345 * -1673073865, 1417031095);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE((-1691508299 * Class84.myPlayer.anInt10314), (short) -28471);
				class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1827230711) ? 1 : 0, 187691123);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(728544879 * Class7.anInt56, (byte) 104);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(-1555739329 * client.anInt7346, (short) -8734);
				client.aClass184_7475.method3049(class282_sub23, 741911092);
			}
			if (i_515_ == 57 || 1007 == i_515_)
				Class96_Sub10.method14603(i_516_, i_514_, i_513_, ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588, (byte) 21);
			if (i_515_ == 15) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i_516_];
				if (class521_sub1_sub1_sub2_sub1 != null) {
					client.anInt7293 = i * -1271587837;
					client.anInt7294 = i_512_ * 1614548531;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4540, (client.aClass184_7475.aClass432_2283), -189738509);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(-1673073865 * client.anInt7345, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(i_516_, (short) -26980);
					class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1648625033) ? 1 : 0, -251958010);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(Class7.anInt56 * 728544879, (byte) 104);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(client.anInt7346 * -1555739329, (short) -26938);
					client.aClass184_7475.method3049(class282_sub23, 1135631399);
					MapRegion.method4559(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], true, (Class344.method6115(class521_sub1_sub1_sub2_sub1.regionBaseX[0], class521_sub1_sub1_sub2_sub1.regionBaseY[0], class521_sub1_sub1_sub2_sub1.method15805(828768449), class521_sub1_sub1_sub2_sub1.method15805(828768449), 0, 971339209)), 1406708869);
				}
			}
			if (i_515_ == 2) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_512_;
				client.anInt7296 = -370989110;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4625, client.aClass184_7475.aClass432_2283, 584103493);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(i_513_ + class219.anInt2711 * 1948093437, -1183932171);
				class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1784014426) ? 1 : 0, -580307794);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV1((int) (l >>> 32) & 0x7fffffff, 827563141);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(Class7.anInt56 * 728544879);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(-1555739329 * client.anInt7346, (short) -28367);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(-1673073865 * client.anInt7345, -800257688);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(i_514_ + -1002240017 * class219.anInt2712, (short) -24747);
				client.aClass184_7475.method3049(class282_sub23, -1161458447);
				Class439.method7344(i_513_, i_514_, l);
			}
			OutgoingPacket class379_517_ = null;
			if (i_515_ == 9)
				class379_517_ = OutgoingPacket.aClass379_4592;
			else if (10 == i_515_)
				class379_517_ = OutgoingPacket.aClass379_4532;
			else if (i_515_ == 11)
				class379_517_ = OutgoingPacket.aClass379_4577;
			else if (12 == i_515_)
				class379_517_ = OutgoingPacket.aClass379_4599;
			else if (i_515_ == 13)
				class379_517_ = OutgoingPacket.aClass379_4622;
			else if (1003 == i_515_)
				class379_517_ = OutgoingPacket.aClass379_4530;
			if (class379_517_ != null) {
				Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_516_));
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					client.anInt7293 = -1271587837 * i;
					client.anInt7294 = i_512_ * 1614548531;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379_517_, (client.aClass184_7475.aClass432_2283), -549689050);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_516_, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class84.method1465(-1629093052) ? 1 : 0);
					client.aClass184_7475.method3049(class282_sub23, -64452005);
					MapRegion.method4559(class521_sub1_sub1_sub2_sub2.regionBaseX[0], class521_sub1_sub1_sub2_sub2.regionBaseY[0], true, (Class344.method6115(class521_sub1_sub1_sub2_sub2.regionBaseX[0], class521_sub1_sub1_sub2_sub2.regionBaseY[0], class521_sub1_sub1_sub2_sub2.method15805(828768449), class521_sub1_sub1_sub2_sub2.method15805(828768449), 0, 971339209)), 1988955111);
				}
			}
			if (60 == i_515_) {
				if (client.rights * -644057819 > 0 && Class96_Sub8.method14577(1203434505))
					Class447.method7460(Class84.myPlayer.aByte7967, i_513_ + 1948093437 * class219.anInt2711, i_514_ + class219.anInt2712 * -1002240017, -1481847737);
				else {
					client.anInt7293 = i * -1271587837;
					client.anInt7294 = 1614548531 * i_512_;
					client.anInt7296 = 1961989093;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4590, (client.aClass184_7475.aClass432_2283), 108289936);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(1948093437 * class219.anInt2711 + i_513_, -800257688);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_514_ + -1002240017 * class219.anInt2712, 1417031095);
					client.aClass184_7475.method3049(class282_sub23, -987949188);
				}
			}
			if (i_515_ == 23) {
				if (client.rights * -644057819 > 0 && Class96_Sub8.method14577(1203434505))
					Class447.method7460(Class84.myPlayer.aByte7967, i_513_ + class219.anInt2711 * 1948093437, i_514_ + class219.anInt2712 * -1002240017, 336245293);
				else {
					Class282_Sub23 class282_sub23 = Class282_Sub2.method12078(i_513_, i_514_, i_516_, -2072149185);
					if (1 == i_516_) {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((int) client.aFloat7365, 1417031095);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(57);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(-1790074477 * client.anInt7255);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(client.anInt7203 * -1864403271);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(89);
						Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((int) class385.aFloat4671, 1417031095);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((int) class385.aFloat4673, 1417031095);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(63);
					} else {
						client.anInt7293 = -1271587837 * i;
						client.anInt7294 = 1614548531 * i_512_;
						client.anInt7296 = 1961989093;
						client.anInt7295 = 0;
					}
					client.aClass184_7475.method3049(class282_sub23, -1076825810);
					MapRegion.method4559(i_513_, i_514_, true, Class38.method853(i_513_, i_514_, 201188139), 1810620112);
				}
			}
			if (17 == i_515_) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_512_;
				client.anInt7296 = -370989110;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4583, client.aClass184_7475.aClass432_2283, 2121787433);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(client.anInt7346 * -1555739329, -800257688);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(728544879 * Class7.anInt56, (byte) 104);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_516_, 1417031095);
				class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1669589673) ? 1 : 0, -1355435029);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(client.anInt7345 * -1673073865, -1183932171);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(class219.anInt2712 * -1002240017 + i_514_, -1183932171);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(class219.anInt2711 * 1948093437 + i_513_, (short) -11881);
				client.aClass184_7475.method3049(class282_sub23, 116139063);
				client.method12073(i_513_, i_514_, 1486862390);
			}
			if (i_515_ == 59) {
				client.anInt7293 = -1271587837 * i;
				client.anInt7294 = 1614548531 * i_512_;
				client.anInt7296 = 1961989093;
				client.anInt7295 = 0;
				Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4589, client.aClass184_7475.aClass432_2283, 1630327614);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(client.anInt7346 * -1555739329, (short) -25554);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(class219.anInt2712 * -1002240017 + i_514_, (short) -3292);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV1(728544879 * Class7.anInt56, -1887962568);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(-1673073865 * client.anInt7345, -800257688);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(class219.anInt2711 * 1948093437 + i_513_, (short) -9592);
				client.aClass184_7475.method3049(class282_sub23, 371789985);
				MapRegion.method4559(i_513_, i_514_, true, Class38.method853(i_513_, i_514_, 1949629205), 1814212235);
			}
			if (30 == i_515_ && null == client.aClass118_7352) {
				Class158_Sub2.method14355(i_514_, i_513_, -603889674);
				client.aClass118_7352 = Index.method5694(i_514_, i_513_, 837812269);
				if (null != client.aClass118_7352)
					Class109.method1858(client.aClass118_7352, (byte) -53);
			}
			if (i_515_ == 58) {
				Class118 class118 = Index.method5694(i_514_, i_513_, 1240107127);
				if (null != class118)
					Class151.method2590(class118, (byte) 23);
			}
			if (25 == i_515_) {
				Class118 class118 = Index.method5694(i_514_, i_513_, 30072551);
				if (class118 != null) {
					Class60.method1170(-609337146);
					Class282_Sub10 class282_sub10 = client.method11633(class118);
					Class304.method5409(class118, class282_sub10.method12179(-335390137), class282_sub10.anInt7541 * 1831058647, (byte) -26);
					client.aString7275 = Class346.method6157(class118, 1494229027);
					if (client.aString7275 == null)
						client.aString7275 = "Null";
					client.aString7356 = new StringBuilder().append(class118.aString1369).append(Class59.method1163(16777215, 619010179)).toString();
				}
			} else {
				OutgoingPacket class379_518_ = null;
				if (18 == i_515_)
					class379_518_ = OutgoingPacket.aClass379_4559;
				else if (19 == i_515_)
					class379_518_ = OutgoingPacket.aClass379_4552;
				else if (i_515_ == 20)
					class379_518_ = OutgoingPacket.aClass379_4581;
				else if (21 == i_515_)
					class379_518_ = OutgoingPacket.aClass379_4535;
				else if (i_515_ == 22)
					class379_518_ = OutgoingPacket.aClass379_4564;
				else if (i_515_ == 1004)
					class379_518_ = OutgoingPacket.aClass379_4588;
				if (null != class379_518_) {
					client.anInt7293 = i * -1271587837;
					client.anInt7294 = i_512_ * 1614548531;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379_518_, (client.aClass184_7475.aClass432_2283), 1549075670);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(i_516_, -1183932171);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByteC(Class84.method1465(-1911437866) ? 1 : 0, 1203558743);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(class219.anInt2712 * -1002240017 + i_514_, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(i_513_ + class219.anInt2711 * 1948093437, -800257688);
					client.aClass184_7475.method3049(class282_sub23, 508293404);
					client.method12073(i_513_, i_514_, -302122565);
				}
				if (8 == i_515_) {
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_516_));
					if (null != class282_sub47) {
						NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
						client.anInt7293 = -1271587837 * i;
						client.anInt7294 = 1614548531 * i_512_;
						client.anInt7296 = -370989110;
						client.anInt7295 = 0;
						Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4568, (client.aClass184_7475.aClass432_2283), -77824231);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(728544879 * Class7.anInt56, (byte) 104);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(i_516_, -1183932171);
						class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(Class84.method1465(-1648894457) ? 1 : 0, -1216866442);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE128(client.anInt7346 * -1555739329, -1183932171);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort128(client.anInt7345 * -1673073865, -800257688);
						client.aClass184_7475.method3049(class282_sub23, 1557258411);
						MapRegion.method4559(class521_sub1_sub1_sub2_sub2.regionBaseX[0], class521_sub1_sub1_sub2_sub2.regionBaseY[0], true, Class344.method6115((class521_sub1_sub1_sub2_sub2.regionBaseX[0]), (class521_sub1_sub1_sub2_sub2.regionBaseY[0]), class521_sub1_sub1_sub2_sub2.method15805(828768449), class521_sub1_sub1_sub2_sub2.method15805(828768449), 0, 971339209), 1451791418);
					}
				}
				OutgoingPacket class379_519_ = null;
				if (i_515_ == 3)
					class379_519_ = OutgoingPacket.aClass379_4602;
				else if (i_515_ == 4)
					class379_519_ = OutgoingPacket.aClass379_4620;
				else if (i_515_ == 5)
					class379_519_ = OutgoingPacket.aClass379_4565;
				else if (i_515_ == 6)
					class379_519_ = OutgoingPacket.aClass379_4626;
				else if (i_515_ == 1001)
					class379_519_ = OutgoingPacket.aClass379_4575;
				else if (i_515_ == 1002)
					class379_519_ = OutgoingPacket.OBJECT_EXAMINE;
				if (class379_519_ != null) {
					client.anInt7293 = -1271587837 * i;
					client.anInt7294 = 1614548531 * i_512_;
					client.anInt7296 = -370989110;
					client.anInt7295 = 0;
					Class282_Sub23 class282_sub23 = Class271.method4828(class379_519_, (client.aClass184_7475.aClass432_2283), 1355917297);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_514_ + -1002240017 * class219.anInt2712, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_513_ + class219.anInt2711 * 1948093437, 1417031095);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeInt((int) (l >>> 32) & 0x7fffffff);
					class282_sub23.aClass282_Sub35_Sub2_7682.writeByte128(Class84.method1465(-1990004833) ? 1 : 0, 784979172);
					client.aClass184_7475.method3049(class282_sub23, -1205970769);
					Class439.method7344(i_513_, i_514_, l);
				}
				if (1008 == i_515_ || 1009 == i_515_ || 1010 == i_515_ || 1011 == i_515_ || 1012 == i_515_)
					Class6.method303(i_515_, i_516_, i_513_, -1029552275);
				if (client.aBool7344)
					Class60.method1170(-609337146);
				if (Class401.aClass118_4825 != null && -1694129533 * client.anInt7297 == 0)
					Class109.method1858(Class401.aClass118_4825, (byte) 9);
			}
		}
	}

	static Class282_Sub23 method735(int i, int i_520_, int i_521_) {
		Class282_Sub23 class282_sub23 = null;
		if (i_521_ == 0)
			class282_sub23 = Class271.method4828(OutgoingPacket.WALK, client.aClass184_7475.aClass432_2283, 23984078);
		if (i_521_ == 1)
			class282_sub23 = Class271.method4828(OutgoingPacket.MINI_WALK, client.aClass184_7475.aClass432_2283, 1004046004);
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1572011120);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(Class84.method1465(-1849259540) ? 1 : 0);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i + 1948093437 * class219.anInt2711, 1417031095);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(i_520_ + -1002240017 * class219.anInt2712, (short) -7779);
		Class187.anInt2361 = -134656021 * i;
		Class187.anInt2359 = i_520_ * -818291313;
		Class187.aBool2360 = false;
		Class282_Sub20_Sub9.method15255((short) -9205);
		return class282_sub23;
	}

	static boolean method736(int i, int i_522_) {
		if (i_522_ >= 1000 && i < 1000)
			return true;
		if (i_522_ < 1000 && i < 1000) {
			if (Class96_Sub4.method13788(i, -1825615579))
				return true;
			if (Class96_Sub4.method13788(i_522_, -111297836))
				return false;
			return true;
		}
		if (i_522_ >= 1000 && i >= 1000)
			return true;
		return false;
	}

	static boolean method737(int i) {
		return (i == 59 || i == 2 || i == 8 || 17 == i || 15 == i || 16 == i || i == 58);
	}

	static boolean method738(int i) {
		return (i == 59 || i == 2 || i == 8 || 17 == i || 15 == i || 16 == i || i == 58);
	}

	static float method739(float f, float f_523_, float f_524_, float f_525_, float f_526_, float f_527_, int i) {
		float f_528_ = 0.0F;
		float f_529_ = f_525_ - f;
		float f_530_ = f_526_ - f_523_;
		float f_531_ = f_527_ - f_524_;
		float f_532_ = 0.0F;
		float f_533_ = 0.0F;
		float f_534_ = 0.0F;
		Class206 class206 = IndexLoaders.MAP_REGION_DECODER.method4430(-1812627159);
		for (/**/; f_528_ < 1.1F; f_528_ += 0.1F) {
			float f_535_ = f_528_ * f_529_ + f;
			float f_536_ = f_530_ * f_528_ + f_523_;
			float f_537_ = f_524_ + f_528_ * f_531_;
			int i_538_ = (int) f_535_ >> 9;
			int i_539_ = (int) f_537_ >> 9;
			if (i_538_ > 0 && i_539_ > 0 && i_538_ < IndexLoaders.MAP_REGION_DECODER.method4424(-184536005) && i_539_ < IndexLoaders.MAP_REGION_DECODER.method4451(-1663373708)) {
				int i_540_ = Class84.myPlayer.aByte7967;
				if (i_540_ < 3 && ((IndexLoaders.MAP_REGION_DECODER.method4433(33386298).aByteArrayArrayArray3638[1][i_538_][i_539_]) & 0x2) != 0)
					i_540_++;
				int i_541_ = class206.aClass390Array2607[i_540_].method6709((int) f_535_, (int) f_537_, 226746773);
				if ((float) i_541_ < f_536_) {
					if (i >= 2)
						return (f_528_ - 0.1F + Class4.method288(f_532_, f_533_, f_534_, f_535_, f_536_, f_537_, i - 1, -896169668) * 0.1F);
					return f_528_;
				}
			}
			f_532_ = f_535_;
			f_533_ = f_536_;
			f_534_ = f_537_;
		}
		return -1.0F;
	}

	static float method740(float f, float f_542_, float f_543_, float f_544_, float f_545_, float f_546_, int i) {
		float f_547_ = 0.0F;
		float f_548_ = f_544_ - f;
		float f_549_ = f_545_ - f_542_;
		float f_550_ = f_546_ - f_543_;
		float f_551_ = 0.0F;
		float f_552_ = 0.0F;
		float f_553_ = 0.0F;
		Class206 class206 = IndexLoaders.MAP_REGION_DECODER.method4430(-1130533996);
		for (/**/; f_547_ < 1.1F; f_547_ += 0.1F) {
			float f_554_ = f_547_ * f_548_ + f;
			float f_555_ = f_549_ * f_547_ + f_542_;
			float f_556_ = f_543_ + f_547_ * f_550_;
			int i_557_ = (int) f_554_ >> 9;
			int i_558_ = (int) f_556_ >> 9;
			if (i_557_ > 0 && i_558_ > 0 && i_557_ < IndexLoaders.MAP_REGION_DECODER.method4424(1260078314) && i_558_ < IndexLoaders.MAP_REGION_DECODER.method4451(-1412814901)) {
				int i_559_ = Class84.myPlayer.aByte7967;
				if (i_559_ < 3 && ((IndexLoaders.MAP_REGION_DECODER.method4433(33386298).aByteArrayArrayArray3638[1][i_557_][i_558_]) & 0x2) != 0)
					i_559_++;
				int i_560_ = class206.aClass390Array2607[i_559_].method6709((int) f_554_, (int) f_556_, 1462391674);
				if ((float) i_560_ < f_555_) {
					if (i >= 2)
						return (f_547_ - 0.1F + Class4.method288(f_551_, f_552_, f_553_, f_554_, f_555_, f_556_, i - 1, -1664072587) * 0.1F);
					return f_547_;
				}
			}
			f_551_ = f_554_;
			f_552_ = f_555_;
			f_553_ = f_556_;
		}
		return -1.0F;
	}

	static final void method741(CS2Executor class527, short i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class306.method5455(class118, class98, class527, -869216999);
	}

	static final void method742(CS2Executor class527, int i) {
		int i_561_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub14 class282_sub50_sub14 = IndexLoaders.aClass331_3535.method5918(i_561_, -572656458);
		if (class282_sub50_sub14.anIntArray9746 == null)
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub14.anIntArray9746.length;
	}

	static final void method743(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12872(-257053432) ? 1 : 0;
	}

	static void method744(int i, int i_562_, int i_563_, int i_564_, int i_565_, int i_566_, int i_567_) {
		int i_568_ = Class275.method4890(i_563_, 324226563 * Class532_Sub1.anInt7070, Class532_Sub1.anInt7068 * -348932735, -109837866);
		int i_569_ = Class275.method4890(i_564_, 324226563 * Class532_Sub1.anInt7070, -348932735 * Class532_Sub1.anInt7068, -766812485);
		int i_570_ = Class275.method4890(i, -612590951 * Class532_Sub1.anInt7071, -1345107225 * Class532_Sub1.anInt7069, -1790568603);
		int i_571_ = Class275.method4890(i_562_, -612590951 * Class532_Sub1.anInt7071, -1345107225 * Class532_Sub1.anInt7069, -1159028771);
		int i_572_ = Class275.method4890(i_566_ + i_563_, Class532_Sub1.anInt7070 * 324226563, Class532_Sub1.anInt7068 * -348932735, -1317034828);
		int i_573_ = Class275.method4890(i_564_ - i_566_, 324226563 * Class532_Sub1.anInt7070, Class532_Sub1.anInt7068 * -348932735, -1696179527);
		for (int i_574_ = i_568_; i_574_ < i_572_; i_574_++)
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_574_], i_570_, i_571_, i_565_, (byte) 31);
		for (int i_575_ = i_569_; i_575_ > i_573_; i_575_--)
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_575_], i_570_, i_571_, i_565_, (byte) 46);
		int i_576_ = Class275.method4890(i_566_ + i, Class532_Sub1.anInt7071 * -612590951, Class532_Sub1.anInt7069 * -1345107225, 2146581760);
		int i_577_ = Class275.method4890(i_562_ - i_566_, -612590951 * Class532_Sub1.anInt7071, -1345107225 * Class532_Sub1.anInt7069, 167924575);
		for (int i_578_ = i_572_; i_578_ <= i_573_; i_578_++) {
			int[] is = Class532_Sub1.anIntArrayArray7072[i_578_];
			Class232.method3922(is, i_570_, i_576_, i_565_, (byte) -7);
			Class232.method3922(is, i_577_, i_571_, i_565_, (byte) -37);
		}
	}

	static final void method745(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7155 ? 1 : 0;
	}

	public static void animate(Animable animable, int[] is, int i, boolean bool, byte i_579_) {
		if (null != animable.anIntArray10350) {
			boolean bool_580_ = true;
			for (int i_581_ = 0; i_581_ < animable.anIntArray10350.length; i_581_++) {
				if (is[i_581_] != animable.anIntArray10350[i_581_]) {
					bool_580_ = false;
					break;
				}
			}
			Class456 class456 = animable.aClass456_10338;
			if (bool_580_ && class456.method7564(-1655113782)) {
				AnimationDefinitions class518 = animable.aClass456_10338.method7565(-1632742162);
				int i_582_ = 554947543 * class518.anInt5907;
				if (i_582_ == 1)
					class456.method7583(i, (byte) 0);
				if (2 == i_582_)
					class456.method7584(-272427166);
			}
		}
		boolean bool_583_ = true;
		for (int i_584_ = 0; i_584_ < is.length; i_584_++) {
			if (-1 != is[i_584_])
				bool_583_ = false;
			if (null == animable.anIntArray10350 || -1 == animable.anIntArray10350[i_584_] || ((IndexLoaders.aClass523_3868.method11205(is[i_584_], (byte) -52).anInt5916) * -1834317435 >= (IndexLoaders.aClass523_3868.method11205(animable.anIntArray10350[i_584_], (byte) -23).anInt5916) * -1834317435)) {
				animable.anIntArray10350 = is;
				animable.aClass456_10338.method7575(i, 1547741706);
				if (bool)
					animable.anInt10367 = 485298635 * animable.anInt10355;
			}
		}
		if (bool_583_) {
			animable.anIntArray10350 = is;
			animable.aClass456_10338.method7575(i, 1956173638);
			if (bool)
				animable.anInt10367 = 485298635 * animable.anInt10355;
		}
	}
}
