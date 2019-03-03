import java.util.LinkedList;

public class MapRegionLoaderTask implements Runnable {

	static int anInt3991;
	MapRegion region = new MapRegion(true);
	volatile boolean aBool3989 = false;
	LinkedList aLinkedList3990 = new LinkedList();

	public void method6049(Class335 class335_1, int i_2) {
		LinkedList linkedlist_3 = this.aLinkedList3990;
		synchronized (this.aLinkedList3990) {
			this.aLinkedList3990.add(class335_1);
			this.aLinkedList3990.notify();
		}
	}

	void method6050(MapRegion mapregion_1, byte b_2) {
		this.region = mapregion_1;
	}

	public boolean method6051(int i_1) {
		return this.aBool3989;
	}

	public MapRegion method6052(short s_1) {
		return this.region;
	}

	void method6054(byte b_1) {
		Object obj_2 = null;
		LinkedList linkedlist_4 = this.aLinkedList3990;
		Class335 class335_3;
		synchronized (this.aLinkedList3990) {
			try {
				this.aLinkedList3990.wait();
			} catch (InterruptedException interruptedexception_6) {
				;
			}

			class335_3 = (Class335) this.aLinkedList3990.pollFirst();
		}

		try {
			try {
				if (class335_3 != null) {
					this.aBool3989 = true;
					this.method6055(class335_3, -1292482767);
				}
			} catch (Exception exception_8) {
				this.aBool3989 = false;
				return;
			}

			this.aBool3989 = false;
		} catch (Exception exception_9) {
			this.aBool3989 = false;
		}

	}

	void method6055(Class335 class335_1, int i_2) {
		if (Class256.aClass256_3152 == class335_1.aClass256_3915) {
			this.region.method4547((byte) -52);
		} else {
			this.region.method4499(class335_1, 233576206);
		}

		for (boolean bool_3 = this.region.method4461((byte) -10); !bool_3; bool_3 = this.region.method4461((byte) -76)) {
			;
		}

		this.region.method4445((byte) -92);
		IndexLoaders.MAP_REGION_DECODER.method4445((byte) -40);
	}

	public void setObjectIndexLoader(ObjectIndexLoader objectindexloader_1, int i_2) {
		this.region.setObjectIndexLoader(objectindexloader_1, -834443097);
	}

	public void run() {
		while (true) {
			this.method6054((byte) 2);
		}
	}

	public static void appendMessage(int i_0, int i_1, String string_2, String string_3, String string_4, String string_5, String string_6, int i_7) {
		ChatLine chatline_8 = Class81.CHAT_LINES[99];

		for (int i_9 = 99; i_9 > 0; --i_9) {
			Class81.CHAT_LINES[i_9] = Class81.CHAT_LINES[i_9 - 1];
		}

		if (chatline_8 == null) {
			chatline_8 = new ChatLine(i_0, i_1, string_2, string_3, string_4, string_6, i_7, string_5);
		} else {
			chatline_8.set(i_0, i_1, string_2, string_3, string_4, string_6, i_7, string_5);
		}

		Class81.CHAT_LINES[0] = chatline_8;
		++Class81.NUM_CHAT_LINES;
		client.anInt7391 = client.anInt7347;
	}

	static final void method6071(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class504.method8390(icomponentdefinitions_3, interface_4, cs2executor_0, 1964593641);
	}

	static final void method6072(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.preferences.aClass468_Sub12_8195.method12707(1260810349) && Renderers.SOFTWARE_RENDERER.method8403() ? 1 : 0;
	}

}
