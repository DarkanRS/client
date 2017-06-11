/* Class298_Sub44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.HashMap;

import jaclib.hardware_info.HardwareInfo;

public class Class298_Sub44 extends Linkable {
	int cpuInfo;
	static int anInt7467 = 3;
	static int anInt7468 = 4;
	int anInt7469;
	public static int anInt7470 = 0;
	int anInt7471;
	static int anInt7472 = 5;
	static int anInt7473 = 1;
	static int anInt7474 = 2;
	static int anInt7475 = 3;
	static int anInt7476 = 3;
	static int anInt7477 = 2;
	static int anInt7478 = 4;
	static int anInt7479 = 7;
	static int anInt7480 = 8;
	static int anInt7481 = 6;
	String aString7482;
	static int anInt7483 = 21;
	static int anInt7484 = 22;
	static int anInt7485 = 23;
	int anInt7486;
	static int anInt7487 = 1;
	static int anInt7488 = 9;
	int anInt7489;
	static int anInt7490 = 4;
	int anInt7491;
	public int anInt7492;
	int anInt7493;
	public int anInt7494;
	boolean aBoolean7495;
	String aString7496;
	static int anInt7497 = 0;
	int anInt7498;
	static int anInt7499 = 20;
	static int anInt7500 = 2;
	int cpuClockSpeed1;
	String aString7502;
	String aString7503;
	static int anInt7504 = 1;
	String aString7505;
	int directXDriverData2;
	int directXDriverDate;
	static int anInt7508 = 6;
	boolean aBoolean7509;
	public int cpuClockSpeed;
	String aString7511;
	int[] anIntArray7512 = new int[3];
	int anInt7513;

	void method3528(int i) {
		try {
			if (((Class298_Sub44) this).aString7502.length() > 40)
				((Class298_Sub44) this).aString7502 = ((Class298_Sub44) this).aString7502.substring(0, 40);
			if (((Class298_Sub44) this).aString7503.length() > 40)
				((Class298_Sub44) this).aString7503 = ((Class298_Sub44) this).aString7503.substring(0, 40);
			if (((Class298_Sub44) this).aString7482.length() > 10)
				((Class298_Sub44) this).aString7482 = ((Class298_Sub44) this).aString7482.substring(0, 10);
			if (((Class298_Sub44) this).aString7505.length() > 10)
				((Class298_Sub44) this).aString7505 = ((Class298_Sub44) this).aString7505.substring(0, 10);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acc.a(").append(')').toString());
		}
	}

	public void writeMachineInformation(RsByteBuffer buffer, int i) {
		try {
			buffer.writeByte(6); // protocol 6, before 5
			buffer.writeByte((((Class298_Sub44) this).anInt7471 * -1570985485)); // OS
																					// type.
			buffer.writeByte((((Class298_Sub44) this).aBoolean7509 ? 1 : 0)); // 64-bit
			buffer.writeByte((-1414570243 * ((Class298_Sub44) this).anInt7486)); // OS
																					// version
			buffer.writeByte((((Class298_Sub44) this).anInt7491 * 43286197)); // Java
																				// vendor
			buffer.writeByte(anInt7492 * 154600941); // Java version
			buffer.writeByte((-1529246497 * ((Class298_Sub44) this).anInt7493)); // Java
																					// sub
																					// version
			buffer.writeByte(anInt7494 * 1324779323); // Java sub sub version.
			buffer.writeByte((((Class298_Sub44) this).aBoolean7495 ? 1 : 0)); // Always
																				// false
			buffer.writeShort((((Class298_Sub44) this).anInt7469 * -2088235843), 16711935); // Maximum
																							// memory
			buffer.writeByte((-1837764033 * ((Class298_Sub44) this).anInt7498)); // Available
																					// processors
			buffer.putTriByte(399637415 * cpuClockSpeed, (byte) 115); // Clock
																		// speed
																		// (MHz)
			buffer.writeShort((-1360789919 * ((Class298_Sub44) this).cpuClockSpeed1), 16711935); // Clock
																									// speed
																									// (MHz)
			buffer.putJagString(((Class298_Sub44) this).aString7502, (short) 14956); // Empty
			buffer.putJagString(((Class298_Sub44) this).aString7503, (short) 23186); // Empty
			buffer.putJagString(((Class298_Sub44) this).aString7482, (short) 15519); // Empty
			buffer.putJagString(((Class298_Sub44) this).aString7505, (short) 4727); // Empty
			buffer.writeByte((((Class298_Sub44) this).directXDriverDate * 1183412533)); // DirectX
																						// driver
																						// date
																						// (month).
			buffer.writeShort((-669549295 * ((Class298_Sub44) this).directXDriverData2), 16711935); // DirectX
																									// driver
																									// date
																									// (year).
			buffer.putJagString(((Class298_Sub44) this).aString7496, (short) 3988); // CPU
																					// type.
			buffer.putJagString(((Class298_Sub44) this).aString7511, (short) -4559); // CPU
																						// data
			buffer.writeByte((78038867 * ((Class298_Sub44) this).cpuInfo)); // CPU
																			// cores
																			// amount.
			buffer.writeByte((((Class298_Sub44) this).anInt7489 * 664924581)); // Raw
																				// cpu
																				// info0
			for (int i_0_ = 0; i_0_ < ((Class298_Sub44) this).anIntArray7512.length; i_0_++) {
				buffer.writeInt((((Class298_Sub44) this).anIntArray7512[i_0_]), -1856682920);
			}
			buffer.writeInt((-277721711 * ((Class298_Sub44) this).anInt7513), -1047358922);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acc.f(").append(')').toString());
		}
	}

	public int method3530(int i) {
		try {
			int i_1_ = 38;
			i_1_ += Class120.method1310(((Class298_Sub44) this).aString7502, (byte) -1);
			i_1_ += Class120.method1310(((Class298_Sub44) this).aString7503, (byte) -1);
			i_1_ += Class120.method1310(((Class298_Sub44) this).aString7482, (byte) -1);
			i_1_ += Class120.method1310(((Class298_Sub44) this).aString7505, (byte) -1);
			i_1_ += Class120.method1310(((Class298_Sub44) this).aString7496, (byte) -1);
			i_1_ += Class120.method1310(((Class298_Sub44) this).aString7511, (byte) -1);
			return i_1_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acc.b(").append(')').toString());
		}
	}

	public Class298_Sub44(boolean bool) {
		if (bool) {
			if (Class82_Sub8.aString6856.startsWith("win"))
				((Class298_Sub44) this).anInt7471 = -1323296965;
			else if (Class82_Sub8.aString6856.startsWith("mac"))
				((Class298_Sub44) this).anInt7471 = 1648373366;
			else if (Class82_Sub8.aString6856.startsWith("linux"))
				((Class298_Sub44) this).anInt7471 = 325076401;
			else
				((Class298_Sub44) this).anInt7471 = -998220564;
			if (Class344.aString3687.startsWith("amd64") || Class344.aString3687.startsWith("x86_64"))
				((Class298_Sub44) this).aBoolean7509 = true;
			else
				((Class298_Sub44) this).aBoolean7509 = false;
			if (1 == -1570985485 * ((Class298_Sub44) this).anInt7471) {
				if (Class250.aString2765.indexOf("4.0") != -1)
					((Class298_Sub44) this).anInt7486 = 1791241813;
				else if (Class250.aString2765.indexOf("4.1") != -1)
					((Class298_Sub44) this).anInt7486 = -712483670;
				else if (Class250.aString2765.indexOf("4.9") != -1)
					((Class298_Sub44) this).anInt7486 = 1078758143;
				else if (Class250.aString2765.indexOf("5.0") != -1)
					((Class298_Sub44) this).anInt7486 = -1424967340;
				else if (Class250.aString2765.indexOf("5.1") != -1)
					((Class298_Sub44) this).anInt7486 = 366274473;
				else if (Class250.aString2765.indexOf("5.2") != -1)
					((Class298_Sub44) this).anInt7486 = 1445032616;
				else if (Class250.aString2765.indexOf("6.0") != -1)
					((Class298_Sub44) this).anInt7486 = -2137451010;
				else if (Class250.aString2765.indexOf("6.1") != -1)
					((Class298_Sub44) this).anInt7486 = -346209197;
				else if (Class250.aString2765.indexOf("6.2") != -1)
					((Class298_Sub44) this).anInt7486 = -1058692867;
			} else if (2 == ((Class298_Sub44) this).anInt7471 * -1570985485) {
				if (Class250.aString2765.indexOf("10.4") != -1)
					((Class298_Sub44) this).anInt7486 = 1465097892;
				else if (Class250.aString2765.indexOf("10.5") != -1)
					((Class298_Sub44) this).anInt7486 = -1038627591;
				else if (Class250.aString2765.indexOf("10.6") != -1)
					((Class298_Sub44) this).anInt7486 = 752614222;
				else if (Class250.aString2765.indexOf("10.7") != -1)
					((Class298_Sub44) this).anInt7486 = -1751111261;
			}
			if (Class350.aString3759.toLowerCase().indexOf("sun") != -1)
				((Class298_Sub44) this).anInt7491 = 953745309;
			else if (Class350.aString3759.toLowerCase().indexOf("microsoft") != -1)
				((Class298_Sub44) this).anInt7491 = 1907490618;
			else if (Class350.aString3759.toLowerCase().indexOf("apple") != -1)
				((Class298_Sub44) this).anInt7491 = -1433731369;
			else
				((Class298_Sub44) this).anInt7491 = -479986060;
			int i = 2;
			int i_2_ = 0;
			try {
				for (/**/; i < Class120.aString1462.length(); i++) {
					int i_3_ = Class120.aString1462.charAt(i);
					if (i_3_ < 48 || i_3_ > 57)
						break;
					i_2_ = i_3_ - 48 + i_2_ * 10;
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt7492 = i_2_ * 1984962533;
			i = Class120.aString1462.indexOf('.', 2) + 1;
			i_2_ = 0;
			try {
				for (/**/; i < Class120.aString1462.length(); i++) {
					int i_4_ = Class120.aString1462.charAt(i);
					if (i_4_ < 48 || i_4_ > 57)
						break;
					i_2_ = i_4_ - 48 + 10 * i_2_;
				}
			} catch (Exception exception) {
				/* empty */
			}
			((Class298_Sub44) this).anInt7493 = i_2_ * 1167404831;
			i = Class120.aString1462.indexOf('_', 4) + 1;
			i_2_ = 0;
			try {
				for (/**/; i < Class120.aString1462.length(); i++) {
					int i_5_ = Class120.aString1462.charAt(i);
					if (i_5_ < 48 || i_5_ > 57)
						break;
					i_2_ = i_2_ * 10 + (i_5_ - 48);
				}
			} catch (Exception exception) {
				/* empty */
			}
			anInt7494 = -796083725 * i_2_;
			((Class298_Sub44) this).aBoolean7495 = false;
			((Class298_Sub44) this).anInt7469 = Class291.maximumMemory * -633367115;
			if (154600941 * anInt7492 > 3)
				((Class298_Sub44) this).anInt7498 = Class291.availableCPU * -1360223467;
			else
				((Class298_Sub44) this).anInt7498 = 0;
			try {
				int[] is = HardwareInfo.getCPUInfo();
				if (is != null && 3 == is.length) {
					((Class298_Sub44) this).cpuInfo = is[0] * 672863451;
					((Class298_Sub44) this).cpuClockSpeed1 = is[1] * -1283906143;
					cpuClockSpeed = is[2] * -108594153;
				}
				int[] is_6_ = HardwareInfo.getRawCPUInfo();
				if (is_6_ != null && is_6_.length % 5 == 0) {
					HashMap hashmap = new HashMap();
					for (int i_7_ = 0; i_7_ < is_6_.length / 5; i_7_++) {
						int i_8_ = is_6_[i_7_ * 5];
						int i_9_ = is_6_[5 * i_7_ + 1];
						int i_10_ = is_6_[2 + i_7_ * 5];
						int i_11_ = is_6_[i_7_ * 5 + 3];
						int i_12_ = is_6_[4 + i_7_ * 5];
						Class472 class472 = new Class472(i_8_, i_9_, i_10_, i_11_, i_12_);
						hashmap.put(Integer.valueOf(i_8_), class472);
					}
					Class472 class472 = (Class472) hashmap.get(Integer.valueOf(0));
					if (null != class472) {
						RsByteBuffer class298_sub53 = new RsByteBuffer(13);
						class298_sub53.writeLEInt((-2056580217 * (((Class472) class472).anInt5960)), 162325587);
						class298_sub53.writeLEInt((272393713 * (((Class472) class472).anInt5964)), -487042280);
						class298_sub53.writeLEInt((634425393 * (((Class472) class472).anInt5963)), 164405285);
						class298_sub53.index = 0;
						((Class298_Sub44) this).aString7496 = class298_sub53.readString(512996154);
					}
					Class472 class472_13_ = (Class472) hashmap.get(Integer.valueOf(1));
					if (null != class472_13_) {
						((Class298_Sub44) this).anInt7513 = (-1193649755 * ((Class472) class472_13_).anInt5961);
						int i_14_ = (((Class472) class472_13_).anInt5960 * -2056580217);
						((Class298_Sub44) this).anInt7489 = -1403810259 * (i_14_ >> 16 & 0xff);
						((Class298_Sub44) this).anIntArray7512[0] = ((Class472) class472_13_).anInt5963 * 634425393;
						((Class298_Sub44) this).anIntArray7512[1] = 272393713 * ((Class472) class472_13_).anInt5964;
					}
					Class472 class472_15_ = (Class472) hashmap.get(Integer.valueOf(-2147483647));
					if (class472_15_ != null)
						((Class298_Sub44) this).anIntArray7512[2] = 272393713 * ((Class472) class472_15_).anInt5964;
					RsByteBuffer class298_sub53 = new RsByteBuffer(49);
					for (int i_16_ = -2147483646; i_16_ <= -2147483644; i_16_++) {
						Class472 class472_17_ = (Class472) hashmap.get(Integer.valueOf(i_16_));
						if (null != class472_17_) {
							class298_sub53.writeLEInt((((Class472) class472_17_).anInt5961 * 1461544821), 1924293641);
							class298_sub53.writeLEInt((-2056580217 * (((Class472) class472_17_).anInt5960)), -1273071648);
							class298_sub53.writeLEInt((((Class472) class472_17_).anInt5963 * 634425393), 293591119);
							class298_sub53.writeLEInt((272393713 * (((Class472) class472_17_).anInt5964)), -1803597625);
						}
					}
					class298_sub53.index = 0;
					((Class298_Sub44) this).aString7511 = class298_sub53.readString(-1784035682);
				}
				String[][] strings = HardwareInfo.getDXDiagDisplayDevicesProps();
				if (null != strings && strings.length > 0 && null != strings[0]) {
					for (int i_18_ = 0; i_18_ < strings[0].length; i_18_ += 2) {
						if (strings[0][i_18_].equalsIgnoreCase("szDescription"))
							((Class298_Sub44) this).aString7502 = strings[0][i_18_ + 1];
						else if (strings[0][i_18_].equalsIgnoreCase("szDriverDateEnglish")) {
							String string = strings[0][i_18_ + 1];
							try {
								int i_19_ = string.indexOf("/");
								int i_20_ = string.indexOf("/", 1 + i_19_);
								((Class298_Sub44) this).directXDriverDate = ((Integer.parseInt(string.substring(0, i_19_))) * 1759516957);
								((Class298_Sub44) this).directXDriverData2 = ((Integer.parseInt(string.substring(1 + i_20_, string.indexOf(" ", i_20_)))) * -1242885135);
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
							string = strings_21_[1 + i_24_];
						else if (strings_21_[i_24_].equalsIgnoreCase("dwDirectXVersionMinor"))
							string_22_ = strings_21_[1 + i_24_];
						else if (strings_21_[i_24_].equalsIgnoreCase("dwDirectXVersionLetter"))
							string_23_ = strings_21_[1 + i_24_];
					}
					((Class298_Sub44) this).aString7482 = new StringBuilder().append(string).append(".").append(string_22_).append(string_23_).toString();
				}
			} catch (Throwable throwable) {
				cpuClockSpeed = 0;
			}
		}
		if (((Class298_Sub44) this).aString7502 == null)
			((Class298_Sub44) this).aString7502 = "";
		if (null == ((Class298_Sub44) this).aString7503)
			((Class298_Sub44) this).aString7503 = "";
		if (null == ((Class298_Sub44) this).aString7482)
			((Class298_Sub44) this).aString7482 = "";
		if (null == ((Class298_Sub44) this).aString7505)
			((Class298_Sub44) this).aString7505 = "";
		if (((Class298_Sub44) this).aString7496 == null)
			((Class298_Sub44) this).aString7496 = "";
		if (((Class298_Sub44) this).aString7511 == null)
			((Class298_Sub44) this).aString7511 = "";
		method3528(1932457780);
	}

	static Class459[] method3531(byte i) {
		try {
			return (new Class459[] { Class459.aClass459_5672, Class459.aClass459_5671, Class459.aClass459_5670 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("acc.a(").append(')').toString());
		}
	}
}
