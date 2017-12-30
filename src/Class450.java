
/* Class450 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Calendar;

public class Class450 {
	boolean aBool5432;
	public String aString5433;
	public int anInt5434 = -190419398;
	public int worldId;
	boolean aBool5436;
	public int anInt5437 = 1338051315;
	public static int anInt5438;

	public boolean method7491(Class450 class450_0_, int i) {
		if (null == class450_0_) {
			return false;
		}
		return (class450_0_.worldId * -87869981 == -87869981 * worldId && aString5433.equals(class450_0_.aString5433));
	}

	public void method7492() {
		if (!this.aBool5436) {
			this.aBool5436 = true;
			this.aBool5432 = true;
		} else if (this.aBool5432) {
			this.aBool5432 = false;
		} else {
			this.aBool5436 = false;
		}
	}

	public void method7493(int i) {
		if (!this.aBool5436) {
			this.aBool5436 = true;
			this.aBool5432 = true;
		} else if (this.aBool5432) {
			this.aBool5432 = false;
		} else {
			this.aBool5436 = false;
		}
	}

	public Socket method7494(byte i) throws IOException {
		return new Socket(InetAddress.getByName(Loader.IP_ADDRESS), Loader.LOBBY_PORT);
	}

	public Socket method7495() throws IOException {
		return new Socket(InetAddress.getByName(Loader.IP_ADDRESS), Loader.LOBBY_PORT);
	}

	public Socket method7496() throws IOException {
		return new Socket(InetAddress.getByName(Loader.IP_ADDRESS), Loader.LOBBY_PORT);
	}

	public Class450() {
		this.aBool5436 = true;
		this.aBool5432 = false;
	}

	public boolean method7497(Class450 class450_1_) {
		if (null == class450_1_) {
			return false;
		}
		return (class450_1_.worldId * -87869981 == -87869981 * worldId && aString5433.equals(class450_1_.aString5433));
	}

	public boolean method7498(Class450 class450_2_) {
		if (null == class450_2_) {
			return false;
		}
		return (class450_2_.worldId * -87869981 == -87869981 * worldId && aString5433.equals(class450_2_.aString5433));
	}

	static String method7499(long l, int i, boolean bool, int i_3_) {
		Calendar calendar;
		if (bool) {
			Class288.method5083(l);
			calendar = Class407.aCalendar4846;
		} else {
			Class155.method2634(l);
			calendar = Class407.aCalendar4848;
		}
		int i_4_ = calendar.get(5);
		int i_5_ = calendar.get(2) + 1;
		int i_6_ = calendar.get(1);
		int i_7_ = calendar.get(11);
		int i_8_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_4_ / 10)).append(i_4_ % 10).append("/").append(i_5_ / 10).append(i_5_ % 10).append("/").append(i_6_ % 100 / 10).append(i_6_ % 10).append(" ").append(i_7_ / 10).append(i_7_ % 10).append(":").append(i_8_ / 10).append(i_8_ % 10).toString();
	}

	static final void method7500(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub15_8203, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -1848816059);
		Class190.method3148((byte) 103);
		client.aBool7175 = false;
	}

	static final void method7501(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		String string_9_ = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4558, client.aClass184_7218.aClass432_2283, -375525383);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((Class108.method1846(string, 204305012) + Class108.method1846(string_9_, -1829354202)), 1417031095);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeString(string_9_);
		client.aClass184_7218.method3049(class282_sub23, -283007581);
	}

	static final void method7502(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (class527.aBool7022) {
			if (i >= 14) {
				return;
			}
			class513 = class527.aClass513_6994;
		} else {
			class513 = class527.aClass513_7007;
		}
		UnderlayDefinition class513_10_ = class513;
		Class118 class118 = class513_10_.aClass118_5886;
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = class118.aString1391;
	}
}
