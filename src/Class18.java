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

	static void method571(short s_0) {
		Class180.aClass229_2245.method3863(1106684848);
	}

	static final void method572(CS2Executor cs2executor_0, int i_1) {
		boolean bool_2 = true;
		String string_3 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		if (client.aBool7310) {
			try {
				Object object_4 = Class361.aClass361_4181.method6254(new Object[] { string_3 }, (byte) -31);
				if (object_4 != null) {
					bool_2 = ((Boolean) object_4).booleanValue();
				}
			} catch (Throwable throwable_5) {
				;
			}
		}

		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = bool_2 ? 1 : 0;
	}

	static void renderInformation(GraphicalRenderer graphicalrenderer_0, NodeCollection nodecollection_1, int i_2, int i_3, byte b_4) {
		Class346.aClass482_4049.method8118(-449430209);
		if (!Class291_Sub1.aBool8027) {
			for (Class282_Sub36 class282_sub36_5 = (Class282_Sub36) nodecollection_1.head((byte) 59); class282_sub36_5 != null; class282_sub36_5 = (Class282_Sub36) nodecollection_1.next(-319423268)) {
				WorldMapAreaDefs worldmapareadefs_6 = Class291_Sub1.aClass218_3456.getWorldMapDefs(class282_sub36_5.anInt7991, -113762832);
				if (Class282_Sub16.method12248(worldmapareadefs_6, -852702638)) {
					boolean bool_7 = WorldMapAreaDefs.renderIconsAndNames(graphicalrenderer_0, class282_sub36_5, worldmapareadefs_6, i_2, i_3, 238178071);
					if (bool_7) {
						Class282_Sub39.method13297(graphicalrenderer_0, class282_sub36_5, worldmapareadefs_6, -502532321);
					}
				}
			}
		}

	}

	static void method574(short s_0) {
	}

}
