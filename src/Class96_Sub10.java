public abstract class Class96_Sub10 extends Class96 {

	int anInt9296;

	int anInt9297;

	int anInt9295;

	Class96_Sub10(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9296 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9297 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9295 = rsbytebuffer_1.readUnsignedByte();
	}

	boolean method1599() {
		SpotAnimDefinitions spotanimdefinitions_2 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(this.anInt9296, (byte) 90);
		boolean bool_3 = spotanimdefinitions_2.method11230(-1104094093);
		AnimationDefinitions animationdefinitions_4 = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(spotanimdefinitions_2.animationId, (byte) -39);
		bool_3 &= animationdefinitions_4.ready();
		return bool_3;
	}

	public static void method14603(int i_0, int i_1, int i_2, String string_3, byte b_4) {
		IComponentDefinitions icomponentdefinitions_5 = Index.method5694(i_1, i_2, -1959607972);
		if (icomponentdefinitions_5 != null) {
			if (icomponentdefinitions_5.params != null) {
				HookRequest hookrequest_6 = new HookRequest();
				hookrequest_6.iComponentDefs = icomponentdefinitions_5;
				hookrequest_6.anInt8051 = i_0;
				hookrequest_6.opName = string_3;
				hookrequest_6.params = icomponentdefinitions_5.params;
				Class96_Sub4.executeHookInner200k(hookrequest_6, 156165111);
			}
			if (client.method11633(icomponentdefinitions_5).clickOptionEnabled(i_0 - 1)) {
				BufferedConnectionContext class184_8 = Class468_Sub20.method12807(870102038);
				if (client.gameState == 0 || client.gameState == 13) {
					TCPMessage tcpmessage_7;
					if (i_0 == 1) {
						tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4574, class184_8.isaac, 440245011);
						Class350_Sub3.method12590(tcpmessage_7, i_1, i_2, icomponentdefinitions_5.anInt1426);
						class184_8.method3049(tcpmessage_7, 1677489806);
					}
					if (i_0 == 2) {
						tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4554, class184_8.isaac, -209568629);
						Class350_Sub3.method12590(tcpmessage_7, i_1, i_2, icomponentdefinitions_5.anInt1426);
						class184_8.method3049(tcpmessage_7, -641320368);
					}
					if (i_0 == 3) {
						tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4527, class184_8.isaac, 67534413);
						Class350_Sub3.method12590(tcpmessage_7, i_1, i_2, icomponentdefinitions_5.anInt1426);
						class184_8.method3049(tcpmessage_7, 34641642);
					}
					if (i_0 == 4) {
						tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4536, class184_8.isaac, 941336151);
						Class350_Sub3.method12590(tcpmessage_7, i_1, i_2, icomponentdefinitions_5.anInt1426);
						class184_8.method3049(tcpmessage_7, 1717133549);
					}
					if (i_0 == 5) {
						tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4562, class184_8.isaac, -519873323);
						Class350_Sub3.method12590(tcpmessage_7, i_1, i_2, icomponentdefinitions_5.anInt1426);
						class184_8.method3049(tcpmessage_7, 1443340985);
					}
					if (i_0 == 6) {
						tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4546, class184_8.isaac, 516854951);
						Class350_Sub3.method12590(tcpmessage_7, i_1, i_2, icomponentdefinitions_5.anInt1426);
						class184_8.method3049(tcpmessage_7, 1118744569);
					}
					if (i_0 == 7) {
						tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4550, class184_8.isaac, 216995585);
						Class350_Sub3.method12590(tcpmessage_7, i_1, i_2, icomponentdefinitions_5.anInt1426);
						class184_8.method3049(tcpmessage_7, 1074910390);
					}
					if (i_0 == 8) {
						tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4605, class184_8.isaac, 1816324678);
						Class350_Sub3.method12590(tcpmessage_7, i_1, i_2, icomponentdefinitions_5.anInt1426);
						class184_8.method3049(tcpmessage_7, -358596995);
					}
					if (i_0 == 9) {
						tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4604, class184_8.isaac, 868991635);
						Class350_Sub3.method12590(tcpmessage_7, i_1, i_2, icomponentdefinitions_5.anInt1426);
						class184_8.method3049(tcpmessage_7, -986323584);
					}
					if (i_0 == 10) {
						tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4608, class184_8.isaac, 486801259);
						Class350_Sub3.method12590(tcpmessage_7, i_1, i_2, icomponentdefinitions_5.anInt1426);
						class184_8.method3049(tcpmessage_7, -28228352);
					}
				}
			}
		}
	}

	static final void method14605(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, byte b_2) {
		byte b_3 = 10;
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		Class274.method4883(icomponentdefinitions_0, b_3, i_4, cs2executor_1);
	}
}
