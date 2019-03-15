import java.io.IOException;
import java.net.Socket;
import java.util.Calendar;

public class ConnectionInfo {

	public String host;
	public int worldId;
	public static int anInt5438;
	boolean alternate = true;
	boolean proxied = false;
	public int anInt5437 = 1;
	public int anInt5434 = -190419398;

	public boolean equals(ConnectionInfo class450_1) {
		return class450_1 == null ? false : this.worldId == class450_1.worldId && this.host.equals(class450_1.host);
	}

	public void swap(int i_1) {
		if (!this.alternate) {
			this.alternate = true;
			this.proxied = true;
		} else if (this.proxied) {
			this.proxied = false;
		} else {
			this.alternate = false;
		}
	}

	public Socket createSocket(byte b_1) throws IOException {
		return new Socket(this.host, 5555);
	}

	static String method7499(long long_0, int i_2) {
		Calendar calendar_5;
		if (true) {
			Class288.method5083(long_0);
			calendar_5 = Class407.aCalendar4846;
		} else {
			Class155.method2634(long_0);
			calendar_5 = Class407.aCalendar4848;
		}
		int i_6 = calendar_5.get(5);
		int i_7 = calendar_5.get(2) + 1;
		int i_8 = calendar_5.get(1);
		int i_9 = calendar_5.get(11);
		int i_10 = calendar_5.get(12);
		return Integer.toString(i_6 / 10) + i_6 % 10 + "/" + i_7 / 10 + i_7 % 10 + "/" + i_8 % 100 / 10 + i_8 % 10 + " " + i_9 / 10 + i_9 % 10 + ":" + i_10 / 10 + i_10 % 10;
	}
}
