
/* Class282_Sub51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;

import jaclib.hardware_info.HardwareInfo;

public class SystemInfo extends Node {
	int anInt8121;
	int anInt8126;
	int[] anIntArray8139 = new int[3];
	int anInt8141;
	boolean aBool8142;
	int anInt8146;
	public int javaRelease;
	int anInt8148;
	public int javaUpdate;
	boolean aBool8150;
	int anInt8151;
	String aString8153;
	int anInt8155;
	int anInt8156;
	String aString8157;
	String aString8159;
	String aString8160;
	int anInt8162;
	int anInt8163;
	int anInt8164;
	String aString8165;
	String aString8166;
	public int anInt8167;
	int anInt8168;

	public int method13454(int i) {
		int i_0_ = 38;
		i_0_ += Class234.method3952(((SystemInfo) this).aString8157, -696675148);
		i_0_ += Class234.method3952(((SystemInfo) this).aString8160, 1704970825);
		i_0_ += Class234.method3952(((SystemInfo) this).aString8159, 1902429767);
		i_0_ += Class234.method3952(((SystemInfo) this).aString8153, 1087732237);
		i_0_ += Class234.method3952(((SystemInfo) this).aString8165, -126400447);
		i_0_ += Class234.method3952(((SystemInfo) this).aString8166, -276282908);
		return i_0_;
	}

	void method13455(int i) {
		if (((SystemInfo) this).aString8157.length() > 40)
			((SystemInfo) this).aString8157 = ((SystemInfo) this).aString8157.substring(0, 40);
		if (((SystemInfo) this).aString8160.length() > 40)
			((SystemInfo) this).aString8160 = ((SystemInfo) this).aString8160.substring(0, 40);
		if (((SystemInfo) this).aString8159.length() > 10)
			((SystemInfo) this).aString8159 = ((SystemInfo) this).aString8159.substring(0, 10);
		if (((SystemInfo) this).aString8153.length() > 10)
			((SystemInfo) this).aString8153 = ((SystemInfo) this).aString8153.substring(0, 10);
	}

	public void writeMachineInformation(RsByteBuffer class282_sub35, int i) {
		class282_sub35.writeByte(6);
		class282_sub35.writeByte((((SystemInfo) this).anInt8126 * 1426377833));
		class282_sub35.writeByte(((SystemInfo) this).aBool8142 ? 1 : 0);
		class282_sub35.writeByte((((SystemInfo) this).anInt8141 * 1562271679));
		class282_sub35.writeByte((((SystemInfo) this).anInt8155 * 1981945913));
		class282_sub35.writeByte(javaRelease * 1358864261);
		class282_sub35.writeByte((((SystemInfo) this).anInt8148 * -466347561));
		class282_sub35.writeByte(javaUpdate * -399173307);
		class282_sub35.writeByte(((SystemInfo) this).aBool8150 ? 1 : 0);
		class282_sub35.writeShort((-758089477 * ((SystemInfo) this).anInt8151), 1417031095);
		class282_sub35.writeByte((((SystemInfo) this).anInt8146 * 635444991));
		class282_sub35.write24BitInt(-79546877 * anInt8167, (byte) 14);
		class282_sub35.writeShort((((SystemInfo) this).anInt8156 * -1490085469), 1417031095);
		class282_sub35.writeJagString(((SystemInfo) this).aString8157, 2145026142);
		class282_sub35.writeJagString(((SystemInfo) this).aString8160, 2128264250);
		class282_sub35.writeJagString(((SystemInfo) this).aString8159, 2122985674);
		class282_sub35.writeJagString(((SystemInfo) this).aString8153, 2114964752);
		class282_sub35.writeByte((215074033 * ((SystemInfo) this).anInt8162));
		class282_sub35.writeShort((((SystemInfo) this).anInt8164 * 298070835), 1417031095);
		class282_sub35.writeJagString(((SystemInfo) this).aString8165, 2113125400);
		class282_sub35.writeJagString(((SystemInfo) this).aString8166, 2132826460);
		class282_sub35.writeByte((((SystemInfo) this).anInt8163 * 1545181999));
		class282_sub35.writeByte((((SystemInfo) this).anInt8121 * -194125771));
		for (int i_1_ = 0; i_1_ < ((SystemInfo) this).anIntArray8139.length; i_1_++)
			class282_sub35.writeInt((((SystemInfo) this).anIntArray8139[i_1_]));
		class282_sub35.writeInt((((SystemInfo) this).anInt8168 * 155536121));
	}

	public SystemInfo(boolean bool) {
		if (bool) {
			if (Class225_Sub6.aString8069.startsWith("win"))
				((SystemInfo) this).anInt8126 = 822969305;
			else if (Class225_Sub6.aString8069.startsWith("mac"))
				((SystemInfo) this).anInt8126 = 1645938610;
			else if (Class225_Sub6.aString8069.startsWith("linux"))
				((SystemInfo) this).anInt8126 = -1826059381;
			else
				((SystemInfo) this).anInt8126 = -1003090076;
			if (Class402.aString4828.startsWith("amd64") || Class402.aString4828.startsWith("x86_64"))
				((SystemInfo) this).aBool8142 = true;
			else
				((SystemInfo) this).aBool8142 = false;
			if (1 == 1426377833 * ((SystemInfo) this).anInt8126) {
				if (Class231.aString2876.indexOf("4.0") != -1)
					((SystemInfo) this).anInt8141 = 454398015;
				else if (Class231.aString2876.indexOf("4.1") != -1)
					((SystemInfo) this).anInt8141 = 908796030;
				else if (Class231.aString2876.indexOf("4.9") != -1)
					((SystemInfo) this).anInt8141 = 1363194045;
				else if (Class231.aString2876.indexOf("5.0") != -1)
					((SystemInfo) this).anInt8141 = 1817592060;
				else if (Class231.aString2876.indexOf("5.1") != -1)
					((SystemInfo) this).anInt8141 = -2022977221;
				else if (Class231.aString2876.indexOf("5.2") != -1)
					((SystemInfo) this).anInt8141 = -659783176;
				else if (Class231.aString2876.indexOf("6.0") != -1)
					((SystemInfo) this).anInt8141 = -1568579206;
				else if (Class231.aString2876.indexOf("6.1") != -1)
					((SystemInfo) this).anInt8141 = -1114181191;
				else if (Class231.aString2876.indexOf("6.2") != -1)
					((SystemInfo) this).anInt8141 = -205385161;
			} else if (2 == 1426377833 * ((SystemInfo) this).anInt8126) {
				if (Class231.aString2876.indexOf("10.4") != -1)
					((SystemInfo) this).anInt8141 = 498025708;
				else if (Class231.aString2876.indexOf("10.5") != -1)
					((SystemInfo) this).anInt8141 = 952423723;
				else if (Class231.aString2876.indexOf("10.6") != -1)
					((SystemInfo) this).anInt8141 = 1406821738;
				else if (Class231.aString2876.indexOf("10.7") != -1)
					((SystemInfo) this).anInt8141 = 1861219753;
			}
			if (Class282_Sub20_Sub34.aString9967.toLowerCase().indexOf("sun") != -1)
				((SystemInfo) this).anInt8155 = -1510320631;
			else if (Class282_Sub20_Sub34.aString9967.toLowerCase().indexOf("microsoft") != -1)
				((SystemInfo) this).anInt8155 = 1274326034;
			else if (Class282_Sub20_Sub34.aString9967.toLowerCase().indexOf("apple") != -1)
				((SystemInfo) this).anInt8155 = -235994597;
			else
				((SystemInfo) this).anInt8155 = -1746315228;
			int i = ChatLine.aString1093.startsWith("1.") ? 2 : 0;
			int i_2_ = 0;
			try {
				for (/**/; i < ChatLine.aString1093.length(); i++) {
					int i_3_ = ChatLine.aString1093.charAt(i);
					if (i_3_ < 48 || i_3_ > 57)
						break;
					i_2_ = i_3_ - 48 + 10 * i_2_;
				}
			} catch (Exception exception) {
				/* empty */
			}
			javaRelease = i_2_ * -1687649971;
			i = ChatLine.aString1093.indexOf('.', 2) + 1;
			i_2_ = 0;
			try {
				for (/**/; i < ChatLine.aString1093.length(); i++) {
					int i_4_ = ChatLine.aString1093.charAt(i);
					if (i_4_ < 48 || i_4_ > 57)
						break;
					i_2_ = 10 * i_2_ + (i_4_ - 48);
				}
			} catch (Exception exception) {
				/* empty */
			}
			((SystemInfo) this).anInt8148 = i_2_ * 591981031;
			i = ChatLine.aString1093.indexOf('_', 4) + 1;
			i_2_ = 0;
			try {
				for (/**/; i < ChatLine.aString1093.length(); i++) {
					int i_5_ = ChatLine.aString1093.charAt(i);
					if (i_5_ < 48 || i_5_ > 57)
						break;
					i_2_ = i_5_ - 48 + 10 * i_2_;
				}
			} catch (Exception exception) {
				/* empty */
			}
			javaUpdate = 440242573 * i_2_;
			((SystemInfo) this).aBool8150 = false;
			((SystemInfo) this).anInt8151 = -1066842283 * Engine.MAX_MEMORY;
			if (javaRelease * 1358864261 > 3)
				((SystemInfo) this).anInt8146 = Engine.AVAILABLE_PROCESSORS * -888695625;
			else
				((SystemInfo) this).anInt8146 = 0;
			try {
				int[] is = HardwareInfo.getCPUInfo();
				if (null != is && is.length == 3) {
					((SystemInfo) this).anInt8163 = is[0] * 1246202831;
					((SystemInfo) this).anInt8156 = is[1] * 1204347403;
					anInt8167 = is[2] * -1922784085;
				}
				int[] is_6_ = HardwareInfo.getRawCPUInfo();
				if (is_6_ != null && 0 == is_6_.length % 5) {
					HashMap hashmap = new HashMap();
					for (int i_7_ = 0; i_7_ < is_6_.length / 5; i_7_++) {
						int i_8_ = is_6_[i_7_ * 5];
						int i_9_ = is_6_[1 + i_7_ * 5];
						int i_10_ = is_6_[2 + 5 * i_7_];
						int i_11_ = is_6_[3 + i_7_ * 5];
						int i_12_ = is_6_[5 * i_7_ + 4];
						Class430 class430 = new Class430(i_8_, i_9_, i_10_, i_11_, i_12_);
						hashmap.put(Integer.valueOf(i_8_), class430);
					}
					Class430 class430 = (Class430) hashmap.get(Integer.valueOf(0));
					if (null != class430) {
						RsByteBuffer class282_sub35 = new RsByteBuffer(13);
						class282_sub35.method13232((((Class430) class430).anInt5137) * 1682848855, (byte) -36);
						class282_sub35.method13232((((Class430) class430).anInt5136) * 1645440037, (byte) -21);
						class282_sub35.method13232((-155922493 * (((Class430) class430).anInt5138)), (byte) -95);
						class282_sub35.index = 0;
						((SystemInfo) this).aString8165 = class282_sub35.readString();
					}
					Class430 class430_13_ = (Class430) hashmap.get(Integer.valueOf(1));
					if (null != class430_13_) {
						((SystemInfo) this).anInt8168 = ((Class430) class430_13_).anInt5139 * 998753003;
						int i_14_ = 1682848855 * ((Class430) class430_13_).anInt5137;
						((SystemInfo) this).anInt8121 = (i_14_ >> 16 & 0xff) * 496923165;
						((SystemInfo) this).anIntArray8139[0] = -155922493 * ((Class430) class430_13_).anInt5138;
						((SystemInfo) this).anIntArray8139[1] = 1645440037 * ((Class430) class430_13_).anInt5136;
					}
					Class430 class430_15_ = (Class430) hashmap.get(Integer.valueOf(-2147483647));
					if (null != class430_15_)
						((SystemInfo) this).anIntArray8139[2] = ((Class430) class430_15_).anInt5136 * 1645440037;
					RsByteBuffer class282_sub35 = new RsByteBuffer(49);
					for (int i_16_ = -2147483646; i_16_ <= -2147483644; i_16_++) {
						Class430 class430_17_ = (Class430) hashmap.get(Integer.valueOf(i_16_));
						if (class430_17_ != null) {
							class282_sub35.method13232((-239369069 * (((Class430) class430_17_).anInt5139)), (byte) -113);
							class282_sub35.method13232((1682848855 * (((Class430) class430_17_).anInt5137)), (byte) -58);
							class282_sub35.method13232((-155922493 * (((Class430) class430_17_).anInt5138)), (byte) -29);
							class282_sub35.method13232((1645440037 * (((Class430) class430_17_).anInt5136)), (byte) -36);
						}
					}
					class282_sub35.index = 0;
					((SystemInfo) this).aString8166 = class282_sub35.readString();
				}
				String[][] strings = HardwareInfo.getDXDiagDisplayDevicesProps();
				if (strings != null && strings.length > 0 && null != strings[0]) {
					for (int i_18_ = 0; i_18_ < strings[0].length; i_18_ += 2) {
						if (strings[0][i_18_].equalsIgnoreCase("szDescription"))
							((SystemInfo) this).aString8157 = strings[0][1 + i_18_];
						else if (strings[0][i_18_].equalsIgnoreCase("szDriverDateEnglish")) {
							String string = strings[0][i_18_ + 1];
							try {
								int i_19_ = string.indexOf("/");
								int i_20_ = string.indexOf("/", 1 + i_19_);
								((SystemInfo) this).anInt8162 = ((Integer.parseInt(string.substring(0, i_19_))) * -1849644015);
								((SystemInfo) this).anInt8164 = ((Integer.parseInt(string.substring(i_20_ + 1, string.indexOf(" ", i_20_)))) * 1138163707);
							} catch (Exception exception) {
								/* empty */
							}
						}
					}
				}
				String[] strings_21_ = HardwareInfo.getDXDiagSystemProps();
				if (strings_21_ != null) {
					String string = "";
					String string_22_ = "";
					String string_23_ = "";
					for (int i_24_ = 0; i_24_ < strings_21_.length; i_24_ += 2) {
						if (strings_21_[i_24_].equalsIgnoreCase("dwDirectXVersionMajor"))
							string = strings_21_[i_24_ + 1];
						else if (strings_21_[i_24_].equalsIgnoreCase("dwDirectXVersionMinor"))
							string_22_ = strings_21_[1 + i_24_];
						else if (strings_21_[i_24_].equalsIgnoreCase("dwDirectXVersionLetter"))
							string_23_ = strings_21_[i_24_ + 1];
					}
					((SystemInfo) this).aString8159 = new StringBuilder().append(string).append(".").append(string_22_).append(string_23_).toString();
				}
			} catch (Throwable throwable) {
				anInt8167 = 0;
			}
		}
		if (((SystemInfo) this).aString8157 == null)
			((SystemInfo) this).aString8157 = "";
		if (((SystemInfo) this).aString8160 == null)
			((SystemInfo) this).aString8160 = "";
		if (((SystemInfo) this).aString8159 == null)
			((SystemInfo) this).aString8159 = "";
		if (((SystemInfo) this).aString8153 == null)
			((SystemInfo) this).aString8153 = "";
		if (null == ((SystemInfo) this).aString8165)
			((SystemInfo) this).aString8165 = "";
		if (null == ((SystemInfo) this).aString8166)
			((SystemInfo) this).aString8166 = "";
		method13455(998850218);
	}

	static final void method13466(Animable class521_sub1_sub1_sub2, boolean bool, int i) {
		RenderAnimDefs class227 = class521_sub1_sub1_sub2.getRenderAnimDefs((byte) -17);
		if (0 == 1871221471 * class521_sub1_sub1_sub2.anInt10355) {
			class521_sub1_sub1_sub2.anInt10366 = 0;
			Class44.anInt430 = Class249.aClass249_3083.aByte3085 * 235132365;
			Class8_Sub1.anInt8515 = 0;
		} else {
			if (class521_sub1_sub1_sub2.currentAnimation.hasDefs() && !class521_sub1_sub1_sub2.currentAnimation.hasSpeed(584514311)) {
				AnimationDefinitions class518 = class521_sub1_sub1_sub2.currentAnimation.getDefs();
				if (41504957 * class521_sub1_sub1_sub2.anInt10367 > 0 && 0 == class518.anInt5920 * -1113882773) {
					class521_sub1_sub1_sub2.anInt10366 += 1951902055;
					Class44.anInt430 = 235132365 * Class249.aClass249_3083.aByte3085;
					Class8_Sub1.anInt8515 = 0;
					return;
				}
				if (class521_sub1_sub1_sub2.anInt10367 * 41504957 <= 0 && class518.anInt5921 * 113839939 == 0) {
					class521_sub1_sub1_sub2.anInt10366 += 1951902055;
					Class44.anInt430 = 235132365 * Class249.aClass249_3083.aByte3085;
					Class8_Sub1.anInt8515 = 0;
					return;
				}
			}
			for (int i_25_ = 0; i_25_ < class521_sub1_sub1_sub2.aClass161Array10339.length; i_25_++) {
				if (-1 != (class521_sub1_sub1_sub2.aClass161Array10339[i_25_].anInt2012) * 378836105 && class521_sub1_sub1_sub2.aClass161Array10339[i_25_].aClass456_2014.hasSpeed(-606649252)) {
					SpotAnimDefinitions class525 = (IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs((class521_sub1_sub1_sub2.aClass161Array10339[i_25_].anInt2012) * 378836105, (byte) 43));
					if (class525.aBool6968 && -1 != class525.animationId * -364555849) {
						AnimationDefinitions class518 = (IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(class525.animationId * -364555849, (byte) -10));
						if (41504957 * class521_sub1_sub1_sub2.anInt10367 > 0 && 0 == class518.anInt5920 * -1113882773) {
							class521_sub1_sub1_sub2.anInt10366 += 1951902055;
							Class44.anInt430 = (Class249.aClass249_3083.aByte3085 * 235132365);
							Class8_Sub1.anInt8515 = 0;
							return;
						}
						if (class521_sub1_sub1_sub2.anInt10367 * 41504957 <= 0 && 113839939 * class518.anInt5921 == 0) {
							class521_sub1_sub1_sub2.anInt10366 += 1951902055;
							Class44.anInt430 = (Class249.aClass249_3083.aByte3085 * 235132365);
							Class8_Sub1.anInt8515 = 0;
							return;
						}
					}
				}
			}
			Vector3 class385 = Vector3.method6623(class521_sub1_sub1_sub2.method11166().aClass385_3595);
			int i_26_ = (int) class385.x;
			int i_27_ = (int) class385.z;
			int i_28_ = ((512 * (class521_sub1_sub1_sub2.regionBaseX[1871221471 * class521_sub1_sub1_sub2.anInt10355 - 1])) + class521_sub1_sub1_sub2.getSize(828768449) * 256);
			int i_29_ = (((class521_sub1_sub1_sub2.regionBaseY[1871221471 * class521_sub1_sub1_sub2.anInt10355 - 1]) * 512) + class521_sub1_sub1_sub2.getSize(828768449) * 256);
			if (i_26_ < i_28_) {
				if (i_27_ < i_29_)
					class521_sub1_sub1_sub2.method15863(10240, 1808111864);
				else if (i_27_ > i_29_)
					class521_sub1_sub1_sub2.method15863(14336, 1973233568);
				else
					class521_sub1_sub1_sub2.method15863(12288, 1565896314);
			} else if (i_26_ > i_28_) {
				if (i_27_ < i_29_)
					class521_sub1_sub1_sub2.method15863(6144, 1883994002);
				else if (i_27_ > i_29_)
					class521_sub1_sub1_sub2.method15863(2048, 2136664980);
				else
					class521_sub1_sub1_sub2.method15863(4096, 1716734744);
			} else if (i_27_ < i_29_)
				class521_sub1_sub1_sub2.method15863(8192, 1994158065);
			else if (i_27_ > i_29_)
				class521_sub1_sub1_sub2.method15863(0, 1630860423);
			int i_30_ = (class521_sub1_sub1_sub2.aByteArray10365[1871221471 * class521_sub1_sub1_sub2.anInt10355 - 1]);
			if (!bool && (i_28_ - i_26_ > 1024 || i_28_ - i_26_ < -1024 || i_29_ - i_27_ > 1024 || i_29_ - i_27_ < -1024)) {
				class521_sub1_sub1_sub2.method11172((float) i_28_, class385.y, (float) i_29_);
				class521_sub1_sub1_sub2.method15791((class521_sub1_sub1_sub2.anInt10361) * 1633416769, false, (byte) -111);
				class521_sub1_sub1_sub2.anInt10355 -= -2086688481;
				if (class521_sub1_sub1_sub2.anInt10367 * 41504957 > 0)
					class521_sub1_sub1_sub2.anInt10367 -= -276223339;
				Class44.anInt430 = 235132365 * Class249.aClass249_3083.aByte3085;
				Class8_Sub1.anInt8515 = 0;
				class385.method6624();
			} else {
				int i_31_ = 16;
				boolean bool_32_ = true;
				if (class521_sub1_sub1_sub2 instanceof NPC)
					bool_32_ = ((NPC) class521_sub1_sub1_sub2).aClass409_10580.aBool4894;
				if (bool_32_) {
					int i_33_ = (class521_sub1_sub1_sub2.anInt10361 * 1633416769 - (class521_sub1_sub1_sub2.aClass19_10359.anInt153 * 1040633965));
					if (i_33_ != 0 && (-737324181 * class521_sub1_sub1_sub2.faceEntity == -1) && 0 != 455380417 * class521_sub1_sub1_sub2.anInt10340)
						i_31_ = 8;
					if (!bool && class521_sub1_sub1_sub2.anInt10355 * 1871221471 > 2)
						i_31_ = 24;
					if (!bool && 1871221471 * class521_sub1_sub1_sub2.anInt10355 > 3)
						i_31_ = 32;
				} else {
					if (!bool && 1871221471 * class521_sub1_sub1_sub2.anInt10355 > 1)
						i_31_ = 24;
					if (!bool && class521_sub1_sub1_sub2.anInt10355 * 1871221471 > 2)
						i_31_ = 32;
				}
				if (class521_sub1_sub1_sub2.anInt10366 * -666607017 > 0 && 1871221471 * class521_sub1_sub1_sub2.anInt10355 > 1) {
					i_31_ = 32;
					class521_sub1_sub1_sub2.anInt10366 -= 1951902055;
				}
				if (Class249.aClass249_3086.aByte3085 == i_30_)
					i_31_ <<= 1;
				else if (Class249.aClass249_3082.aByte3085 == i_30_)
					i_31_ >>= 1;
				if (-1 != class227.anInt2826 * -1606350841) {
					i_31_ <<= 9;
					if (1871221471 * class521_sub1_sub1_sub2.anInt10355 == 1) {
						int i_34_ = (-531167237 * class521_sub1_sub1_sub2.anInt10368 * (class521_sub1_sub1_sub2.anInt10368 * -531167237));
						int i_35_ = (((int) class385.x > i_28_ ? (int) class385.x - i_28_ : i_28_ - (int) class385.x) << 9);
						int i_36_ = (((int) class385.z > i_29_ ? (int) class385.z - i_29_ : i_29_ - (int) class385.z) << 9);
						int i_37_ = i_35_ > i_36_ ? i_35_ : i_36_;
						int i_38_ = class227.anInt2826 * 1082265614 * i_37_;
						if (i_34_ > i_38_) {
							Animable class521_sub1_sub1_sub2_39_;
							(class521_sub1_sub1_sub2_39_ = class521_sub1_sub1_sub2).anInt10368 = (555936563 * (-531167237 * class521_sub1_sub1_sub2_39_.anInt10368 / 2));
						} else if (i_34_ / 2 > i_37_) {
							class521_sub1_sub1_sub2.anInt10368 -= -1757346203 * class227.anInt2826;
							if (-531167237 * class521_sub1_sub1_sub2.anInt10368 < 0)
								class521_sub1_sub1_sub2.anInt10368 = 0;
						} else if ((-531167237 * class521_sub1_sub1_sub2.anInt10368) < i_31_) {
							class521_sub1_sub1_sub2.anInt10368 += -1757346203 * class227.anInt2826;
							if (-531167237 * class521_sub1_sub1_sub2.anInt10368 > i_31_)
								class521_sub1_sub1_sub2.anInt10368 = i_31_ * 555936563;
						}
					} else if (-531167237 * class521_sub1_sub1_sub2.anInt10368 < i_31_) {
						class521_sub1_sub1_sub2.anInt10368 += class227.anInt2826 * -1757346203;
						if (-531167237 * class521_sub1_sub1_sub2.anInt10368 > i_31_)
							class521_sub1_sub1_sub2.anInt10368 = 555936563 * i_31_;
					} else if (-531167237 * class521_sub1_sub1_sub2.anInt10368 > 0) {
						class521_sub1_sub1_sub2.anInt10368 -= -1757346203 * class227.anInt2826;
						if (-531167237 * class521_sub1_sub1_sub2.anInt10368 < 0)
							class521_sub1_sub1_sub2.anInt10368 = 0;
					}
					i_31_ = -531167237 * class521_sub1_sub1_sub2.anInt10368 >> 9;
					if (i_31_ < 1)
						i_31_ = 1;
				}
				Class8_Sub1.anInt8515 = 0;
				if (i_28_ != i_26_ || i_29_ != i_27_) {
					if (i_26_ < i_28_) {
						class385.x += (float) i_31_;
						Class8_Sub1.anInt8515 = ((-1293360775 * Class8_Sub1.anInt8515 | 0x4) * 1608038601);
						if (class385.x > (float) i_28_)
							class385.x = (float) i_28_;
					} else if (i_26_ > i_28_) {
						class385.x -= (float) i_31_;
						Class8_Sub1.anInt8515 = ((Class8_Sub1.anInt8515 * -1293360775 | 0x8) * 1608038601);
						if (class385.x < (float) i_28_)
							class385.x = (float) i_28_;
					}
					if (i_27_ < i_29_) {
						class385.z += (float) i_31_;
						Class8_Sub1.anInt8515 = 1608038601 * (-1293360775 * Class8_Sub1.anInt8515 | 0x1);
						if (class385.z > (float) i_29_)
							class385.z = (float) i_29_;
					} else if (i_27_ > i_29_) {
						class385.z -= (float) i_31_;
						Class8_Sub1.anInt8515 = 1608038601 * (-1293360775 * Class8_Sub1.anInt8515 | 0x2);
						if (class385.z < (float) i_29_)
							class385.z = (float) i_29_;
					}
					class521_sub1_sub1_sub2.method11171(class385);
					if (i_31_ >= 32)
						Class44.anInt430 = Class249.aClass249_3086.aByte3085 * 235132365;
					else
						Class44.anInt430 = 235132365 * i_30_;
				} else
					Class44.anInt430 = Class249.aClass249_3083.aByte3085 * 235132365;
				if ((int) class385.x == i_28_ && i_29_ == (int) class385.z) {
					class521_sub1_sub1_sub2.anInt10355 -= -2086688481;
					if (41504957 * class521_sub1_sub1_sub2.anInt10367 > 0)
						class521_sub1_sub1_sub2.anInt10367 -= -276223339;
				}
				class385.method6624();
			}
		}
	}

	static final void method13467(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = -1174321703 * RegionMap.anInt3644;
	}
}
