/* Class280 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class280 implements Interface25 {
	Class521_Sub1_Sub1_Sub1 aClass521_Sub1_Sub1_Sub1_3371;

	public boolean method182(Class521_Sub1_Sub1 class521_sub1_sub1) {
		return (class521_sub1_sub1 == ((Class280) this).aClass521_Sub1_Sub1_Sub1_3371);
	}

	public boolean method183(Class521_Sub1_Sub1 class521_sub1_sub1, int i) {
		return (class521_sub1_sub1 == ((Class280) this).aClass521_Sub1_Sub1_Sub1_3371);
	}

	Class280(Class521_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1) {
		((Class280) this).aClass521_Sub1_Sub1_Sub1_3371 = class521_sub1_sub1_sub1;
	}

	static final void method4973(CS2Executor class527, byte i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7394;
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7324;
	}

	static final void method4974(long l) {
		int i = client.anInt7262 * 61805441;
		int i_0_ = client.anInt7376 * -1032332761;
		if (1762352089 * Class11.anInt122 != i) {
			int i_1_ = i - Class11.anInt122 * 1762352089;
			int i_2_ = (int) ((long) i_1_ * l / 320L);
			if (i_1_ > 0) {
				if (i_2_ == 0)
					i_2_ = 1;
				else if (i_2_ > i_1_)
					i_2_ = i_1_;
			} else if (0 == i_2_)
				i_2_ = -1;
			else if (i_2_ < i_1_)
				i_2_ = i_1_;
			Class11.anInt122 += i_2_ * -2082376599;
		}
		if (518160421 * Class266.anInt3289 != i_0_) {
			int i_3_ = i_0_ - Class266.anInt3289 * 518160421;
			int i_4_ = (int) ((long) i_3_ * l / 320L);
			if (i_3_ > 0) {
				if (0 == i_4_)
					i_4_ = 1;
				else if (i_4_ > i_3_)
					i_4_ = i_3_;
			} else if (0 == i_4_)
				i_4_ = -1;
			else if (i_4_ < i_3_)
				i_4_ = i_3_;
			Class266.anInt3289 += i_4_ * 405117869;
		}
		client.aFloat7365 += 8.0F * (client.aFloat7266 * (float) l / 40.0F);
		client.aFloat7146 += 8.0F * ((float) l * client.aFloat7284 / 40.0F);
		IsaacCipher.method7268(1874031200);
	}

	public static boolean method4975(String string, byte i) {
		if (string == null)
			return false;
		for (int i_5_ = 0; i_5_ < client.anInt7373 * -1754449153; i_5_++) {
			Class10 class10 = client.aClass10Array7456[i_5_];
			if (string.equalsIgnoreCase(class10.aString115))
				return true;
			if (string.equalsIgnoreCase(class10.aString116))
				return true;
		}
		return false;
	}
}
