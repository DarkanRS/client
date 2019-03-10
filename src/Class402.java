public class Class402 {

	public static String aString4828;
	boolean aBool4826;
	Class399[] aClass399Array4827;

	Class402(boolean bool_1, Class399[] arr_2) {
		this.aBool4826 = bool_1;
		this.aClass399Array4827 = arr_2;
	}

	public static final void method6798(String string_0, short s_1) {
		if (string_0 != null) {
			String string_2 = Class383.method6515(string_0, 1942118537);
			if (string_2 != null) {
				for (int i_3 = 0; i_3 < client.anInt7449; i_3++) {
					Class6 class6_4 = client.aClass6Array7452[i_3];
					String string_5 = class6_4.aString37;
					String string_6 = Class383.method6515(string_5, 1942118537);
					if (Class159.method2734(string_0, string_2, string_5, string_6, (byte) -79)) {
						--client.anInt7449;

						for (int i_7 = i_3; i_7 < client.anInt7449; i_7++) {
							client.aClass6Array7452[i_7] = client.aClass6Array7452[i_7 + 1];
						}

						client.anInt7386 = client.anInt7347;
						Class184 class184_9 = Class468_Sub20.method12807(222304163);
						TCPMessage tcpmessage_8 = Class271.method4828(OutgoingPacket.aClass379_4551, class184_9.isaac, 1980188569);
						tcpmessage_8.buffer.writeByte(ChatLine.getLength(string_0));
						tcpmessage_8.buffer.writeString(string_0);
						class184_9.method3049(tcpmessage_8, -234662582);
						break;
					}
				}
			}
		}

	}

	static final void method6799(CS2Executor cs2executor_0) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7149;
	}

	static final void method6800(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class468_Sub2.method12630(icomponentdefinitions_3, interface_4, cs2executor_0, 1465627737);
	}

}
