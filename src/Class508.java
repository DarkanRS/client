import jaclib.ping.Ping;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.InetAddress;
import java.net.URI;
import java.util.LinkedList;
import java.util.Queue;

public class Class508 implements Runnable {

	public static int anInt5864;

	Object anObject5862 = new Object();

	Queue aQueue5863 = new LinkedList();

	Thread aThread5861 = new Thread(this);

	public Class510 method8729(String string_1, short s_2) {
		if (this.aThread5861 == null) {
			throw new IllegalStateException("");
		} else if (string_1 == null) {
			throw new IllegalArgumentException("");
		} else {
			Class510 class510_3 = new Class510(string_1);
			this.method8730(class510_3, -1763010472);
			return class510_3;
		}
	}

	public Class508() {
		this.aThread5861.setDaemon(true);
		this.aThread5861.start();
	}

	void method8730(Object object_1, int i_2) {
		Queue queue_3 = this.aQueue5863;
		synchronized (this.aQueue5863) {
			this.aQueue5863.add(object_1);
			this.aQueue5863.notify();
		}
	}

	public void method8733(int i_1) {
		if (this.aThread5861 != null) {
			this.method8730(this.anObject5862, -2004280805);
			try {
				this.aThread5861.join();
			} catch (InterruptedException interruptedexception_3) {
				;
			}
			this.aThread5861 = null;
		}
	}

	public void run() {
		while (true) {
			Queue queue_2 = this.aQueue5863;
			Class510 class510_1;
			synchronized (this.aQueue5863) {
				Object object_3;
				for (object_3 = this.aQueue5863.poll(); object_3 == null; object_3 = this.aQueue5863.poll()) {
					try {
						this.aQueue5863.wait();
					} catch (InterruptedException interruptedexception_7) {
						;
					}
				}
				if (object_3 == this.anObject5862) {
					return;
				}
				class510_1 = (Class510) object_3;
			}
			int i_5;
			try {
				byte[] bytes_9 = InetAddress.getByName(class510_1.aString5871).getAddress();
				i_5 = Ping.method747(bytes_9[0], bytes_9[1], bytes_9[2], bytes_9[3], 1000L);
			} catch (Throwable throwable_6) {
				i_5 = 1000;
			}
			class510_1.anInt5872 = i_5;
		}
	}

	public static void method8736(String string_0, boolean bool_1, boolean bool_2, String string_3, boolean bool_4, boolean bool_5, byte b_6) {
		if (bool_1) {
			if (!bool_4 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(string_0));
					return;
				} catch (Exception exception_8) {
					;
				}
			}
			if (Class225_Sub6.aString8069.startsWith("win") && !bool_4) {
				Class468_Sub6.method12661(string_0, 0, (byte) -25);
			} else if (Class225_Sub6.aString8069.startsWith("mac")) {
				Class186.method3082(string_0, 1, string_3, 145298920);
			} else {
				Class468_Sub6.method12661(string_0, 2, (byte) -47);
			}
		} else {
			Class468_Sub6.method12661(string_0, 3, (byte) -77);
		}
	}

	static final void decodeMasks(RsBitsBuffer rsbitsbuffer_0, int i_1) {
		for (int i_2 = 0; i_2 < Class197.anInt2434; i_2++) {
			int i_3 = Class197.anIntArray2435[i_2];
			Player player_4 = client.players[i_3];
			int i_5 = rsbitsbuffer_0.readUnsignedByte();
			if ((i_5 & 0x8) != 0) {
				i_5 += rsbitsbuffer_0.readUnsignedByte() << 8;
			}
			if ((i_5 & 0x100) != 0) {
				i_5 += rsbitsbuffer_0.readUnsignedByte() << 16;
			}
			Class282_Sub15_Sub5.decodeMasks(rsbitsbuffer_0, i_3, player_4, i_5, -303630036);
		}
	}
}
