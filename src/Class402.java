/* Class402 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class402 {
	boolean aBool4826;
	Class399[] aClass399Array4827;
	public static String aString4828;

	Class402(boolean bool, Class399[] class399s) {
		((Class402) this).aBool4826 = bool;
		((Class402) this).aClass399Array4827 = class399s;
	}

	public static final void method6798(String string, short i) {
		if (null != string) {
			String string_0_ = Class383.method6515(string, 1942118537);
			if (null != string_0_) {
				for (int i_1_ = 0; i_1_ < client.anInt7449 * 493536965; i_1_++) {
					Class6 class6 = client.aClass6Array7452[i_1_];
					String string_2_ = class6.aString37;
					String string_3_ = Class383.method6515(string_2_, 1942118537);
					if (Class159.method2734(string, string_0_, string_2_, string_3_, (byte) -79)) {
						client.anInt7449 -= -238893043;
						for (int i_4_ = i_1_; i_4_ < client.anInt7449 * 493536965; i_4_++)
							client.aClass6Array7452[i_4_] = client.aClass6Array7452[1 + i_4_];
						client.anInt7386 = client.anInt7347 * 23579151;
						Class184 class184 = Class468_Sub20.method12807(222304163);
						TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4551, class184.isaac, 1980188569);
						class282_sub23.buffer.writeByte(ChatLine.getLength(string));
						class282_sub23.buffer.writeString(string);
						class184.method3049(class282_sub23, -234662582);
						break;
					}
				}
			}
		}
	}

	static final void method6799(CS2Executor class527, byte i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = -1543197399 * client.anInt7149;
	}

	static final void method6800(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class468_Sub2.method12630(class118, class98, class527, 1465627737);
	}
}
