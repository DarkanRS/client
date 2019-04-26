public class Class161 {

	public int anInt2011;

	public int anInt2013;

	public int anInt2015;

	public int spotAnimId = -1;

	public Animation animation;

	Class161(Animable animable_1) {
		this.animation = new Animation_Sub2(animable_1);
	}

	static final void method2827(int i_0) {
		Class109.redrawComponent(client.aClass118_7257);
		++CutsceneAction_Sub1.anInt8308;
		if (client.aBool7369 && client.aBool7403) {
			int i_1 = Class163.mouseRecorder.getMouseX();
			int i_2 = Class163.mouseRecorder.getMouseY();
			i_1 -= client.anInt7361;
			i_2 -= client.anInt7362;
			if (i_1 < client.anInt7432) {
				i_1 = client.anInt7432;
			}
			if (i_1 + client.aClass118_7257.anInt1301 > client.anInt7367 + client.anInt7432) {
				i_1 = client.anInt7367 + client.anInt7432 - client.aClass118_7257.anInt1301;
			}
			if (i_2 < client.anInt7265) {
				i_2 = client.anInt7265;
			}
			if (i_2 + client.aClass118_7257.anInt1429 > client.anInt7265 + client.anInt7476) {
				i_2 = client.anInt7476 + client.anInt7265 - client.aClass118_7257.anInt1429;
			}
			int i_3;
			int i_4;
			if (client.aClass118_7247 == InputSubscriberType.aClass118_2763) {
				i_3 = i_1;
				i_4 = i_2;
			} else {
				i_3 = i_1 - client.anInt7432 + client.aClass118_7247.anInt1311;
				i_4 = i_2 - client.anInt7265 + client.aClass118_7247.anInt1312;
			}
			HookRequest hookrequest_5;
			if (!Class163.mouseRecorder.method3568()) {
				if (client.aBool7364) {
					Class60.method1170();
					if (client.aClass118_7257.anObjectArray1394 != null) {
						hookrequest_5 = new HookRequest();
						hookrequest_5.iComponentDefs = client.aClass118_7257;
						hookrequest_5.anInt8059 = i_3;
						hookrequest_5.anInt8055 = i_4;
						hookrequest_5.aClass118_8057 = client.aClass118_7370;
						hookrequest_5.params = client.aClass118_7257.anObjectArray1394;
						CS2Executor.executeHookInner200k(hookrequest_5, 79466209);
					}
					if (client.aClass118_7370 != null && client.method11634(client.aClass118_7257) != null) {
						Class119.method2076(client.aClass118_7257, client.aClass118_7370);
					}
				} else if ((client.anInt7339 == 1 || JS5GrabWorker.method12562(-285174833)) && Class20.anInt169 > 2) {
					QuestIndexLoader.method4164(client.anInt7361 + client.anInt7252, client.anInt7215 + client.anInt7362, -85284222);
				} else if (Class216.method3677(575398960)) {
					QuestIndexLoader.method4164(client.anInt7252 + client.anInt7361, client.anInt7215 + client.anInt7362, 405616760);
				}
				client.aClass118_7257 = null;
				client.aClass118_7247 = null;
			} else {
				if (CutsceneAction_Sub1.anInt8308 > client.aClass118_7257.anInt1381) {
					int i_7 = i_1 - client.anInt7252;
					int i_6 = i_2 - client.anInt7215;
					if (i_7 > client.aClass118_7257.anInt1380 || i_7 < -client.aClass118_7257.anInt1380 || i_6 > client.aClass118_7257.anInt1380 || i_6 < -client.aClass118_7257.anInt1380) {
						client.aBool7364 = true;
					}
				}
				if (client.aClass118_7257.anObjectArray1451 != null && client.aBool7364) {
					hookrequest_5 = new HookRequest();
					hookrequest_5.iComponentDefs = client.aClass118_7257;
					hookrequest_5.anInt8059 = i_3;
					hookrequest_5.anInt8055 = i_4;
					hookrequest_5.params = client.aClass118_7257.anObjectArray1451;
					CS2Executor.executeHookInner200k(hookrequest_5, 814557204);
				}
			}
		} else if (CutsceneAction_Sub1.anInt8308 > 1) {
			client.aClass118_7257 = null;
			client.aClass118_7247 = null;
		}
	}
}
