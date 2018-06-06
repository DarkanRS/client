
/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

@SuppressWarnings({"rawtypes", "unchecked"})
public class MapRegionLoaderTask implements Runnable {
	MapRegion region;
	volatile boolean aBool3989 = false;
	LinkedList aLinkedList3990 = new LinkedList();
	static int anInt3991;

	public void method6049(Class335 class335, int i) {
		synchronized (this.aLinkedList3990) {
			this.aLinkedList3990.add(class335);
			this.aLinkedList3990.notify();
		}
	}

	void method6050(MapRegion class257, byte i) {
		this.region = class257;
	}

	public boolean method6051(int i) {
		return this.aBool3989;
	}

	public MapRegionLoaderTask() {
		this.region = new MapRegion(true);
	}

	public MapRegion method6052(short i) {
		return this.region;
	}

	void method6054(byte i) {
		Object object = null;
		Class335 class335;
		synchronized (this.aLinkedList3990) {
			try {
				this.aLinkedList3990.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
			class335 = (Class335) this.aLinkedList3990.pollFirst();
		}
		do {
			try {
				try {
					if (class335 != null) {
						if (i != 2) {
							break;
						}
						this.aBool3989 = true;
						method6055(class335, -1292482767);
					}
				} catch (Exception exception) {
					this.aBool3989 = false;
					break;
				}
				this.aBool3989 = false;
			} catch (Exception object_0_) {
				this.aBool3989 = false;
				//throw object_0_;
			}
		} while (false);
	}

	void method6055(Class335 class335, int i) {
		if (class335.aClass256_3915 == Class256.aClass256_3152) {
			this.region.method4547((byte) -52);
		} else {
			this.region.method4499(class335, 233576206);
		}
		for (boolean bool = this.region.method4461((byte) -10); !bool; bool = this.region.method4461((byte) -76)) {
			/* empty */
		}
		this.region.method4445((byte) -92);
		IndexLoaders.MAP_REGION_DECODER.method4445((byte) -40);
	}

	public void setObjectIndexLoader(ObjectIndexLoader class474, int i) {
		this.region.setObjectIndexLoader(class474, -834443097);
	}

	@Override
	public void run() {
		for (;;) {
			method6054((byte) 2);
		}
	}

	public static void appendMessage(int type, int i_2_, String name, String nameUnfiltered, String nameSimple, String message, String clan, int i_7_) {
		ChatLine line = Class81.CHAT_LINES[99];
		for (int i_9_ = 99; i_9_ > 0; i_9_--) {
			Class81.CHAT_LINES[i_9_] = Class81.CHAT_LINES[i_9_ - 1];
		}
		if (null == line) {
			line = new ChatLine(type, i_2_, name, nameUnfiltered, nameSimple, clan, i_7_, message);
		} else {
			line.set(type, i_2_, name, nameUnfiltered, nameSimple, clan, i_7_, message);
		}
		Class81.CHAT_LINES[0] = line;
		Class81.NUM_CHAT_LINES += 809055037;
		client.anInt7391 = -1529209901 * client.anInt7347;
	}

	static final void method6071(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = class513.aClass118_5886;
		Interface class98 = class513.aClass98_5885;
		Class504.method8390(class118, class98, class527, 1964593641);
	}

	static final void method6072(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = (Class393.aClass282_Sub54_4783.aClass468_Sub12_8195.method12707(1260810349) && Renderers.SOFTWARE_RENDERER.method8403()) ? 1 : 0;
	}
}
