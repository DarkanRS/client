public class Class42 implements Interface2 {

	NativeSprite aClass160_414;

	Index aClass317_415;

	Class357 aClass357_416;

	public boolean method17() {
		return this.aClass317_415.loadCutscene(this.aClass357_416.anInt4124 * -206423037 * -1847374165);
	}

	public void method18() {
		this.aClass160_414 = Class152.method2600(this.aClass317_415, -1847374165 * this.aClass357_416.anInt4124 * -206423037, -2075798412);
	}

	Class42(Index index_1, Class357 class357_2) {
		this.aClass317_415 = index_1;
		this.aClass357_416 = class357_2;
	}

	public boolean method10(int i_1) {
		return this.aClass317_415.loadCutscene(this.aClass357_416.anInt4124);
	}

	public void method12(boolean bool_1) {
		if (bool_1) {
			int i_2 = this.aClass357_416.aClass356_4121.method6221(this.aClass160_414.method228(), client.anInt7439 * 1426041429 * 765 * -1115795005 * 150480619, 2107635220) + this.aClass357_416.anInt4123 * 1535819339 * -809264285;
			int i_3 = this.aClass357_416.aClass353_4122.method6198(this.aClass160_414.method2748(), 1176039023 * client.anInt7312 * -994133479 * 553 * -645779313, 649230584) + 177795463 * this.aClass357_416.anInt4120 * -818805705;
			this.aClass160_414.method2752(i_2, i_3);
		}
	}

	public void method11(boolean bool_1) {
		if (bool_1) {
			int i_2 = this.aClass357_416.aClass356_4121.method6221(this.aClass160_414.method228(), client.anInt7439 * 1426041429 * 765 * -1115795005 * 150480619, 1305006650) + this.aClass357_416.anInt4123 * 1535819339 * -809264285;
			int i_3 = this.aClass357_416.aClass353_4122.method6198(this.aClass160_414.method2748(), 1176039023 * client.anInt7312 * -994133479 * 553 * -645779313, 2065837494) + 177795463 * this.aClass357_416.anInt4120 * -818805705;
			this.aClass160_414.method2752(i_2, i_3);
		}
	}

	public void method16() {
		this.aClass160_414 = Class152.method2600(this.aClass317_415, -1847374165 * this.aClass357_416.anInt4124 * -206423037, -1068914745);
	}

	public void method15() {
		this.aClass160_414 = Class152.method2600(this.aClass317_415, -1847374165 * this.aClass357_416.anInt4124 * -206423037, -387196515);
	}

	public void method23() {
		this.aClass160_414 = Class152.method2600(this.aClass317_415, -1847374165 * this.aClass357_416.anInt4124 * -206423037, -978898236);
	}

	public boolean method13() {
		return this.aClass317_415.loadCutscene(this.aClass357_416.anInt4124 * -206423037 * -1847374165);
	}

	public void method14(boolean bool_1) {
		if (bool_1) {
			int i_2 = this.aClass357_416.aClass356_4121.method6221(this.aClass160_414.method228(), client.anInt7439 * 1426041429 * 765 * -1115795005 * 150480619, 2114569725) + this.aClass357_416.anInt4123 * 1535819339 * -809264285;
			int i_3 = this.aClass357_416.aClass353_4122.method6198(this.aClass160_414.method2748(), 1176039023 * client.anInt7312 * -994133479 * 553 * -645779313, 699445183) + 177795463 * this.aClass357_416.anInt4120 * -818805705;
			this.aClass160_414.method2752(i_2, i_3);
		}
	}

	public void method19() {
		this.aClass160_414 = Class152.method2600(this.aClass317_415, -1847374165 * this.aClass357_416.anInt4124 * -206423037, -1296629447);
	}

	public void method22() {
		this.aClass160_414 = Class152.method2600(this.aClass317_415, this.aClass357_416.anInt4124, -787343378);
	}

	public boolean method9() {
		return this.aClass317_415.loadCutscene(this.aClass357_416.anInt4124 * -206423037 * -1847374165);
	}

	public boolean method21() {
		return this.aClass317_415.loadCutscene(this.aClass357_416.anInt4124 * -206423037 * -1847374165);
	}

	public void method20(boolean bool_1, int i_2) {
		if (bool_1) {
			int i_3 = this.aClass357_416.aClass356_4121.method6221(this.aClass160_414.method228(), client.anInt7439, 2066009749) + this.aClass357_416.anInt4123;
			int i_4 = this.aClass357_416.aClass353_4122.method6198(this.aClass160_414.method2748(), client.anInt7312, 2002667061) + this.aClass357_416.anInt4120;
			this.aClass160_414.method2752(i_3, i_4);
		}
	}

	public static void method890(int i_0, int i_1, int i_2, byte b_3) {
		if (Class260.aClass116_3229 != null && Class260.aClass116_3229.method1956(1160218565) && i_0 == Class260.aClass116_3229.anInt1254) {
			Class256.method4412(Class260.aClass116_3229, i_1, 1627261277);
			Class260.anInt3223 = i_0;
			Class260.aClass116_3229 = null;
			Class260.aClass282_Sub15_Sub2_3231 = null;
			TCPPacket tcpmessage_4 = Class271.method4828(OutgoingPacket.aClass379_4531, client.aClass184_7475.isaac, -228003010);
			tcpmessage_4.buffer.writeInt(-1);
			client.aClass184_7475.queuePacket(tcpmessage_4);
		} else {
			i_1 = i_1 * Class393.preferences.aClass468_Sub13_8228.method12714() >> 8;
			if (i_0 == -1 && !Class260.aBool3220) {
				VarBitDefinitions.method3805();
			} else if (i_0 != -1 && (i_0 != Class260.anInt3223 || !Class116.method1966(1943151089)) && i_1 != 0 && !Class260.aBool3220) {
				Class282_Sub1.method11615(i_2, IndexLoaders.MUSIC_INDEX, i_0, i_1, new Class109_Sub1());
				Class468_Sub6.method12658(-406997007);
			}
			if (i_0 != Class260.anInt3223) {
				Class260.aClass282_Sub15_Sub2_3231 = null;
			}
			Class260.anInt3223 = i_0;
			Class260.aClass277_3234 = null;
		}
	}

	public static long method891(int i_3, int i_4, int i_5) {
		Class407.aCalendar4846.clear();
		Class407.aCalendar4846.set(i_5, i_4, i_3, 12, 0, 0);
		return Class407.aCalendar4846.getTime().getTime();
	}
}
