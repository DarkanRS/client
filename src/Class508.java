
/* Class508 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Desktop;
import java.net.InetAddress;
import java.net.URI;
import java.util.LinkedList;
import java.util.Queue;

import jaclib.ping.Ping;

public class Class508 implements Runnable {
	Thread aThread5861;
	Object anObject5862 = new Object();
	Queue aQueue5863 = new LinkedList();
	public static int anInt5864;

	public void method8728() {
		if (null != ((Class508) this).aThread5861) {
			method8730(((Class508) this).anObject5862, -134848194);
			try {
				((Class508) this).aThread5861.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			((Class508) this).aThread5861 = null;
		}
	}

	public Class510 method8729(String string, short i) {
		if (((Class508) this).aThread5861 == null)
			throw new IllegalStateException("");
		if (null == string)
			throw new IllegalArgumentException("");
		Class510 class510 = new Class510(string);
		method8730(class510, -1763010472);
		return class510;
	}

	public Class508() {
		((Class508) this).aThread5861 = new Thread(this);
		((Class508) this).aThread5861.setDaemon(true);
		((Class508) this).aThread5861.start();
	}

	void method8730(Object object, int i) {
		synchronized (((Class508) this).aQueue5863) {
			((Class508) this).aQueue5863.add(object);
			((Class508) this).aQueue5863.notify();
		}
	}

	public Class510 method8731(String string) {
		if (((Class508) this).aThread5861 == null)
			throw new IllegalStateException("");
		if (null == string)
			throw new IllegalArgumentException("");
		Class510 class510 = new Class510(string);
		method8730(class510, -2112866133);
		return class510;
	}

	public void method8732() {
		for (;;) {
			Class510 class510;
			synchronized (((Class508) this).aQueue5863) {
				Object object;
				for (object = ((Class508) this).aQueue5863.poll(); null == object; object = ((Class508) this).aQueue5863.poll()) {
					try {
						((Class508) this).aQueue5863.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == ((Class508) this).anObject5862)
					break;
				class510 = (Class510) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(((Class510) class510).aString5871).getAddress();
				i = Ping.method747(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class510.anInt5872 = 624679881 * i;
		}
	}

	public void method8733(int i) {
		if (null != ((Class508) this).aThread5861) {
			method8730(((Class508) this).anObject5862, -2004280805);
			try {
				((Class508) this).aThread5861.join();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			((Class508) this).aThread5861 = null;
		}
	}

	public void method8734() {
		for (;;) {
			Class510 class510;
			synchronized (((Class508) this).aQueue5863) {
				Object object;
				for (object = ((Class508) this).aQueue5863.poll(); null == object; object = ((Class508) this).aQueue5863.poll()) {
					try {
						((Class508) this).aQueue5863.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == ((Class508) this).anObject5862)
					break;
				class510 = (Class510) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(((Class510) class510).aString5871).getAddress();
				i = Ping.method747(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class510.anInt5872 = 624679881 * i;
		}
	}

	public void run() {
		for (;;) {
			Class510 class510;
			synchronized (((Class508) this).aQueue5863) {
				Object object;
				for (object = ((Class508) this).aQueue5863.poll(); null == object; object = ((Class508) this).aQueue5863.poll()) {
					try {
						((Class508) this).aQueue5863.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				if (object == ((Class508) this).anObject5862)
					break;
				class510 = (Class510) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(((Class510) class510).aString5871).getAddress();
				i = Ping.method747(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class510.anInt5872 = 624679881 * i;
		}
	}

	static final void method8735(CS2Executor class527, byte i) {
		UnderlayDefinition class513;
		if (class527.aBool7022) {
			if (i <= 1)
				return;
			class513 = class527.aClass513_6994;
		} else
			class513 = class527.aClass513_7007;
		UnderlayDefinition class513_0_ = class513;
		Class118 class118 = ((UnderlayDefinition) class513_0_).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1453 * 1762983005;
	}

	public static void method8736(String string, boolean bool, boolean bool_1_, String string_2_, boolean bool_3_, boolean bool_4_, byte i) {
		if (bool) {
			do {
				if (!bool_3_ && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					try {
						Desktop.getDesktop().browse(new URI(string));
					} catch (Exception exception) {
						break;
					}
					return;
				}
			} while (false);
			if (Class225_Sub6.aString8069.startsWith("win") && !bool_3_)
				Class468_Sub6.method12661(string, 0, (byte) -25);
			else if (Class225_Sub6.aString8069.startsWith("mac"))
				Class186.method3082(string, 1, string_2_, 145298920);
			else
				Class468_Sub6.method12661(string, 2, (byte) -47);
		} else
			Class468_Sub6.method12661(string, 3, (byte) -77);
	}

	static final void decodeMasks(RsBitsBuffer buffer, int i) {
		for (int i_5_ = 0; i_5_ < Class197.anInt2434 * -706143403; i_5_++) {
			int i_6_ = Class197.anIntArray2435[i_5_];
			Player player = client.players[i_6_];
			int i_7_ = buffer.readUnsignedByte();
			if ((i_7_ & 0x8) != 0)
				i_7_ += buffer.readUnsignedByte() << 8;
			if ((i_7_ & 0x100) != 0)
				i_7_ += buffer.readUnsignedByte() << 16;
			Class282_Sub15_Sub5.decodeMasks(buffer, i_6_, player, i_7_, -303630036);
		}
	}
}
