
/* Class296 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaclib.ping.Ping;

public class Class296 {
	static Class446[] aClass446Array3531;
	static int anInt3532 = 0;
	static int anInt3533 = 0;
	public static int anInt3534;
	public static Class331 aClass331_3535;

	public static int method5293() {
		if (0 == anInt3532 * 1164388509) {
			Class446.aClass446_5412.method7435(new Class301("jaclib"), (byte) -56);
			if (Class446.aClass446_5412.method7443(1322798442).method84(-477828346) != 100)
				return 1;
			if (!((Class301) Class446.aClass446_5412.method7443(-1460062494)).method5328((byte) -117)) {
				Class308.aclient3620.method4681((byte) 1);
				Class223.method3770((byte) 1);
				try {
					Ping.init();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt3532 = -699884107;
		}
		if (1 == anInt3532 * 1164388509) {
			aClass446Array3531 = Class446.method7436((byte) 24);
			Class446.aClass446_5386.method7435(new Class298(Class520.aClass317_5935), (byte) -17);
			Class446.aClass446_5387.method7435(new Class301("jaggl"), (byte) -50);
			Class446.aClass446_5388.method7435(new Class301("jagdx"), (byte) -18);
			Class446.aClass446_5389.method7435(new Class301("sw3d"), (byte) 92);
			Class446.aClass446_5415.method7435(new Class301("hw3d"), (byte) 5);
			Class446.aClass446_5385.method7435(new Class301("jagtheora"), (byte) 66);
			Class446.aClass446_5392.method7435(new Class298(Class488.aClass317_5758), (byte) 10);
			Class446.aClass446_5390.method7435(new Class298(Class40.aClass317_412), (byte) -6);
			Class446.aClass446_5394.method7435(new Class298(Class282_Sub39.aClass317_8005), (byte) 37);
			Class446.aClass446_5395.method7435(new Class298(Class273.aClass317_3332), (byte) -57);
			Class446.aClass446_5397.method7435(new Class298(Class236.aClass317_2915), (byte) -45);
			Class446.aClass446_5393.method7435(new Class298(Class107.aClass317_1081), (byte) 27);
			Class446.aClass446_5413.method7435(new Class298(Class383.aClass317_4665), (byte) 7);
			Class446.aClass446_5399.method7435(new Class298(Class235.aClass317_2908), (byte) -57);
			Class446.aClass446_5400.method7435(new Class298(Class322.aClass317_3749), (byte) 50);
			Class446.aClass446_5401.method7435(new Class298(Class222.aClass317_2766), (byte) -31);
			Class446.aClass446_5402.method7435(new Class298(Class371.aClass317_4326), (byte) -95);
			Class446.aClass446_5403.method7435(new Class298(Class329.aClass317_3861), (byte) 5);
			Class446.aClass446_5404.method7435(new Class298(Class437.aClass317_5340), (byte) -67);
			Class446.aClass446_5405.method7435(new Class298(Class468_Sub7.aClass317_7886), (byte) 70);
			Class446.aClass446_5410.method7435(new Class298(Class215.aClass317_2686), (byte) -42);
			Class446.aClass446_5407.method7435(new Class383((Class250.aClass317_3093), "huffman"), (byte) 46);
			Class446.aClass446_5391.method7435(new Class298(Class523.aClass317_6957), (byte) 96);
			Class446.aClass446_5409.method7435(new Class298(Class378.aClass317_4526), (byte) -35);
			Class446.aClass446_5398.method7435(new Class298(Class410.aClass317_4924), (byte) -24);
			Class446.aClass446_5411.method7435(new Class388((Class192.worldMap), "details"), (byte) -74);
			for (int i = 0; i < aClass446Array3531.length; i++) {
				if (aClass446Array3531[i].method7443(1480288863) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class446[] class446s = aClass446Array3531;
			for (int i_0_ = 0; i_0_ < class446s.length; i_0_++) {
				Class446 class446 = class446s[i_0_];
				int i_1_ = class446.method7432((byte) 66);
				int i_2_ = class446.method7443(-1235746349).method84(-477828346);
				i += i_2_ * i_1_ / 100;
			}
			anInt3533 = i * -621298115;
			anInt3532 = -1399768214;
		}
		if (null == aClass446Array3531)
			return 100;
		int i = 0;
		int i_3_ = 0;
		boolean bool = true;
		Class446[] class446s = aClass446Array3531;
		for (int i_4_ = 0; i_4_ < class446s.length; i_4_++) {
			Class446 class446 = class446s[i_4_];
			int i_5_ = class446.method7432((byte) 66);
			int i_6_ = class446.method7443(-1044791730).method84(-477828346);
			if (i_6_ < 100)
				bool = false;
			i += i_5_;
			i_3_ += i_5_ * i_6_ / 100;
		}
		if (bool) {
			if (!((Class301) Class446.aClass446_5385.method7443(-226245168)).method5328((byte) -49))
				client.aBool7393 = Class308.aclient3620.method4662((byte) 7);
			aClass446Array3531 = null;
		}
		i_3_ -= anInt3533 * -1694086891;
		i -= anInt3533 * -1694086891;
		int i_7_ = i > 0 ? i_3_ * 100 / i : 100;
		if (!bool && i_7_ > 99)
			i_7_ = 99;
		return i_7_;
	}

	public static int method5294() {
		if (0 == anInt3532 * 1164388509) {
			Class446.aClass446_5412.method7435(new Class301("jaclib"), (byte) 54);
			if (Class446.aClass446_5412.method7443(1457064220).method84(-477828346) != 100)
				return 1;
			if (!((Class301) Class446.aClass446_5412.method7443(1614526456)).method5328((byte) -98)) {
				Class308.aclient3620.method4681((byte) 1);
				Class223.method3770((byte) 1);
				try {
					Ping.init();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt3532 = -699884107;
		}
		if (1 == anInt3532 * 1164388509) {
			aClass446Array3531 = Class446.method7436((byte) 24);
			Class446.aClass446_5386.method7435(new Class298(Class520.aClass317_5935), (byte) -13);
			Class446.aClass446_5387.method7435(new Class301("jaggl"), (byte) -8);
			Class446.aClass446_5388.method7435(new Class301("jagdx"), (byte) 47);
			Class446.aClass446_5389.method7435(new Class301("sw3d"), (byte) 61);
			Class446.aClass446_5415.method7435(new Class301("hw3d"), (byte) 20);
			Class446.aClass446_5385.method7435(new Class301("jagtheora"), (byte) -18);
			Class446.aClass446_5392.method7435(new Class298(Class488.aClass317_5758), (byte) -71);
			Class446.aClass446_5390.method7435(new Class298(Class40.aClass317_412), (byte) -24);
			Class446.aClass446_5394.method7435(new Class298(Class282_Sub39.aClass317_8005), (byte) -59);
			Class446.aClass446_5395.method7435(new Class298(Class273.aClass317_3332), (byte) 104);
			Class446.aClass446_5397.method7435(new Class298(Class236.aClass317_2915), (byte) -60);
			Class446.aClass446_5393.method7435(new Class298(Class107.aClass317_1081), (byte) -51);
			Class446.aClass446_5413.method7435(new Class298(Class383.aClass317_4665), (byte) 2);
			Class446.aClass446_5399.method7435(new Class298(Class235.aClass317_2908), (byte) 8);
			Class446.aClass446_5400.method7435(new Class298(Class322.aClass317_3749), (byte) 80);
			Class446.aClass446_5401.method7435(new Class298(Class222.aClass317_2766), (byte) 47);
			Class446.aClass446_5402.method7435(new Class298(Class371.aClass317_4326), (byte) -68);
			Class446.aClass446_5403.method7435(new Class298(Class329.aClass317_3861), (byte) 68);
			Class446.aClass446_5404.method7435(new Class298(Class437.aClass317_5340), (byte) -3);
			Class446.aClass446_5405.method7435(new Class298(Class468_Sub7.aClass317_7886), (byte) 78);
			Class446.aClass446_5410.method7435(new Class298(Class215.aClass317_2686), (byte) -52);
			Class446.aClass446_5407.method7435(new Class383((Class250.aClass317_3093), "huffman"), (byte) -25);
			Class446.aClass446_5391.method7435(new Class298(Class523.aClass317_6957), (byte) 17);
			Class446.aClass446_5409.method7435(new Class298(Class378.aClass317_4526), (byte) 6);
			Class446.aClass446_5398.method7435(new Class298(Class410.aClass317_4924), (byte) -39);
			Class446.aClass446_5411.method7435(new Class388((Class192.worldMap), "details"), (byte) -8);
			for (int i = 0; i < aClass446Array3531.length; i++) {
				if (aClass446Array3531[i].method7443(1425576153) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class446[] class446s = aClass446Array3531;
			for (int i_8_ = 0; i_8_ < class446s.length; i_8_++) {
				Class446 class446 = class446s[i_8_];
				int i_9_ = class446.method7432((byte) 66);
				int i_10_ = class446.method7443(963619985).method84(-477828346);
				i += i_10_ * i_9_ / 100;
			}
			anInt3533 = i * -621298115;
			anInt3532 = -1399768214;
		}
		if (null == aClass446Array3531)
			return 100;
		int i = 0;
		int i_11_ = 0;
		boolean bool = true;
		Class446[] class446s = aClass446Array3531;
		for (int i_12_ = 0; i_12_ < class446s.length; i_12_++) {
			Class446 class446 = class446s[i_12_];
			int i_13_ = class446.method7432((byte) 66);
			int i_14_ = class446.method7443(1261475695).method84(-477828346);
			if (i_14_ < 100)
				bool = false;
			i += i_13_;
			i_11_ += i_13_ * i_14_ / 100;
		}
		if (bool) {
			if (!((Class301) Class446.aClass446_5385.method7443(-1632742454)).method5328((byte) -32))
				client.aBool7393 = Class308.aclient3620.method4662((byte) 14);
			aClass446Array3531 = null;
		}
		i_11_ -= anInt3533 * -1694086891;
		i -= anInt3533 * -1694086891;
		int i_15_ = i > 0 ? i_11_ * 100 / i : 100;
		if (!bool && i_15_ > 99)
			i_15_ = 99;
		return i_15_;
	}

	Class296() throws Throwable {
		throw new Error();
	}

	public static int method5295() {
		if (0 == anInt3532 * 1164388509) {
			Class446.aClass446_5412.method7435(new Class301("jaclib"), (byte) 0);
			if (Class446.aClass446_5412.method7443(-580271749).method84(-477828346) != 100)
				return 1;
			if (!((Class301) Class446.aClass446_5412.method7443(-376894485)).method5328((byte) -23)) {
				Class308.aclient3620.method4681((byte) 1);
				Class223.method3770((byte) 1);
				try {
					Ping.init();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			anInt3532 = -699884107;
		}
		if (1 == anInt3532 * 1164388509) {
			aClass446Array3531 = Class446.method7436((byte) 24);
			Class446.aClass446_5386.method7435(new Class298(Class520.aClass317_5935), (byte) -47);
			Class446.aClass446_5387.method7435(new Class301("jaggl"), (byte) -31);
			Class446.aClass446_5388.method7435(new Class301("jagdx"), (byte) 15);
			Class446.aClass446_5389.method7435(new Class301("sw3d"), (byte) 74);
			Class446.aClass446_5415.method7435(new Class301("hw3d"), (byte) 103);
			Class446.aClass446_5385.method7435(new Class301("jagtheora"), (byte) 50);
			Class446.aClass446_5392.method7435(new Class298(Class488.aClass317_5758), (byte) -60);
			Class446.aClass446_5390.method7435(new Class298(Class40.aClass317_412), (byte) 5);
			Class446.aClass446_5394.method7435(new Class298(Class282_Sub39.aClass317_8005), (byte) -52);
			Class446.aClass446_5395.method7435(new Class298(Class273.aClass317_3332), (byte) 93);
			Class446.aClass446_5397.method7435(new Class298(Class236.aClass317_2915), (byte) 50);
			Class446.aClass446_5393.method7435(new Class298(Class107.aClass317_1081), (byte) -23);
			Class446.aClass446_5413.method7435(new Class298(Class383.aClass317_4665), (byte) -9);
			Class446.aClass446_5399.method7435(new Class298(Class235.aClass317_2908), (byte) 13);
			Class446.aClass446_5400.method7435(new Class298(Class322.aClass317_3749), (byte) -26);
			Class446.aClass446_5401.method7435(new Class298(Class222.aClass317_2766), (byte) 16);
			Class446.aClass446_5402.method7435(new Class298(Class371.aClass317_4326), (byte) -86);
			Class446.aClass446_5403.method7435(new Class298(Class329.aClass317_3861), (byte) 40);
			Class446.aClass446_5404.method7435(new Class298(Class437.aClass317_5340), (byte) -13);
			Class446.aClass446_5405.method7435(new Class298(Class468_Sub7.aClass317_7886), (byte) -64);
			Class446.aClass446_5410.method7435(new Class298(Class215.aClass317_2686), (byte) 73);
			Class446.aClass446_5407.method7435(new Class383((Class250.aClass317_3093), "huffman"), (byte) 57);
			Class446.aClass446_5391.method7435(new Class298(Class523.aClass317_6957), (byte) -77);
			Class446.aClass446_5409.method7435(new Class298(Class378.aClass317_4526), (byte) 37);
			Class446.aClass446_5398.method7435(new Class298(Class410.aClass317_4924), (byte) 12);
			Class446.aClass446_5411.method7435(new Class388((Class192.worldMap), "details"), (byte) -29);
			for (int i = 0; i < aClass446Array3531.length; i++) {
				if (aClass446Array3531[i].method7443(-1850556854) == null)
					throw new RuntimeException();
			}
			int i = 0;
			Class446[] class446s = aClass446Array3531;
			for (int i_16_ = 0; i_16_ < class446s.length; i_16_++) {
				Class446 class446 = class446s[i_16_];
				int i_17_ = class446.method7432((byte) 66);
				int i_18_ = class446.method7443(-773841292).method84(-477828346);
				i += i_18_ * i_17_ / 100;
			}
			anInt3533 = i * -621298115;
			anInt3532 = -1399768214;
		}
		if (null == aClass446Array3531)
			return 100;
		int i = 0;
		int i_19_ = 0;
		boolean bool = true;
		Class446[] class446s = aClass446Array3531;
		for (int i_20_ = 0; i_20_ < class446s.length; i_20_++) {
			Class446 class446 = class446s[i_20_];
			int i_21_ = class446.method7432((byte) 66);
			int i_22_ = class446.method7443(941157360).method84(-477828346);
			if (i_22_ < 100)
				bool = false;
			i += i_21_;
			i_19_ += i_21_ * i_22_ / 100;
		}
		if (bool) {
			if (!((Class301) Class446.aClass446_5385.method7443(2112847787)).method5328((byte) -94))
				client.aBool7393 = Class308.aclient3620.method4662((byte) -39);
			aClass446Array3531 = null;
		}
		i_19_ -= anInt3533 * -1694086891;
		i -= anInt3533 * -1694086891;
		int i_23_ = i > 0 ? i_19_ * 100 / i : 100;
		if (!bool && i_23_ > 99)
			i_23_ = 99;
		return i_23_;
	}

	static final void method5296(Class527 class527, byte i) {
		Class513 class513;
		if (((Class527) class527).aBool7022) {
			if (i <= 0)
				return;
			class513 = ((Class527) class527).aClass513_6994;
		} else
			class513 = ((Class527) class527).aClass513_7007;
		Class513 class513_24_ = class513;
		Class118 class118 = ((Class513) class513_24_).aClass118_5886;
		Class98 class98 = ((Class513) class513_24_).aClass98_5885;
		Class204.method3366(class118, class98, class527, (byte) -128);
	}

	static final void method5297(Class527 class527, byte i) {
		int i_25_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		int i_26_ = client.aClass330Array7428[i_25_].method5908(-1252250172);
		int[] is = ((Class527) class527).anIntArray6999;
		int i_27_ = (((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1;
		int i_28_;
		if (i_26_ == 1) {
			if (i <= -123)
				return;
			i_28_ = 1;
		} else
			i_28_ = 0;
		is[i_27_] = i_28_;
	}

	static final void method5298(Class527 class527, int i) {
		int i_29_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		((Class527) class527).anInt7000 -= -1341717846;
		String string = (String) (((Class527) class527).anObjectArray7019[((Class527) class527).anInt7000 * 1806726141]);
		String string_30_ = (String) (((Class527) class527).anObjectArray7019[1806726141 * ((Class527) class527).anInt7000 + 1]);
		if (string.length() <= 500 && string_30_.length() <= 500)
			Class105.method1804(i_29_, string, string_30_, (byte) -22);
	}

	static final void method5299(Class527 class527, int i) {
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class282_Sub45.method13405(Class169.method2869(1994559110));
	}
}
