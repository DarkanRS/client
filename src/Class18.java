
/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class18 {
	static BigInteger LOGIN_EXPONENT = new BigInteger("65537");
	static BigInteger LOGIN_MODULUS = new BigInteger("120939379545801108457092146136811590420117523610064329653999963622953411640892324098339081283171912438928542907153945666535787774120650877051372580500361985127885543638857782912119058293779031071351842051170733225061372133137112279533742782156137403056226682880755263648445207569855678164101699535411202797793");
	public static BigInteger UPDATE_SERVER_EXPONENT = new BigInteger("65537");
	public static BigInteger UPDATE_SERVER_MODULUS = new BigInteger("120939379545801108457092146136811590420117523610064329653999963622953411640892324098339081283171912438928542907153945666535787774120650877051372580500361985127885543638857782912119058293779031071351842051170733225061372133137112279533742782156137403056226682880755263648445207569855678164101699535411202797793");

	static {
		new BigInteger("10001", 16);
		new BigInteger("807cbacd7aeed99f09c78c88a305f4fc15532249469ed4d45cbcc3cec47912a8b7e94cc9cb92d8ec33002fa8855a6c84794a4ea6144d4940a5c0da5e7668e045", 16);
	}

	Class18() throws Throwable {
		throw new Error();
	}

	static void method571(short i) {
		Class180.aClass229_2245.method3863(1106684848);
	}

	static final void method572(CS2Executor class527, int i) {
		boolean bool = true;
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (client.aBool7310) {
			try {
				Object object = Class361.aClass361_4181.method6254(new Object[] { string }, (byte) -31);
				if (object != null) {
					bool = ((Boolean) object).booleanValue();
				}
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = bool ? 1 : 0;
	}

	static void method573(Class505 class505, Class482 class482, int i, int i_0_, byte i_1_) {
		Class346.aClass482_4049.method8118(-449430209);
		if (!Class291_Sub1.aBool8027) {
			for (Class282_Sub36 class282_sub36 = (Class282_Sub36) class482.method8097((byte) 59); null != class282_sub36; class282_sub36 = (Class282_Sub36) class482.method8067(-319423268)) {
				Class220 class220 = (Class291_Sub1.aClass218_3456.method3700(-1798678621 * class282_sub36.anInt7991, -113762832));
				if (Class282_Sub16.method12248(class220, -852702638)) {
					boolean bool = Class220.method3742(class505, class282_sub36, class220, i, i_0_, 238178071);
					if (bool) {
						Class282_Sub39.method13297(class505, class282_sub36, class220, -502532321);
					}
				}
			}
		}
	}

	static void method574(short i) {
		/* empty */
	}
}
