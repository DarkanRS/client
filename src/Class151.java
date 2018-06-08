
/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

public class Class151 {
	public static final int anInt1960 = 8191;
	public Class464 aClass464_1961 = new Class464();

	static final void method2586(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub5_8221, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -2100114669);
		Class190.method3148((byte) 44);
	}

	static final void method2587(CS2Executor class527, byte i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7436;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = client.aShort7437;
	}

	static final void method2588(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12923(-1002096865) ? 1 : 0;
	}

	public static void method2589(boolean bool, byte[] is, int i) {
		if (null == Class96_Sub20.aClass282_Sub35_9415)
			Class96_Sub20.aClass282_Sub35_9415 = new RsByteBuffer(20000);
		Class96_Sub20.aClass282_Sub35_9415.writeBytes(is, 0, is.length);
		if (bool) {
			Class468_Sub10.method12695((Class96_Sub20.aClass282_Sub35_9415.buffer), (byte) 1);
			Class448.aClass217_Sub1Array5426 = new Class217_Sub1[Class4.anInt34 * -2043473211];
			int i_0_ = 0;
			for (int i_1_ = -377428565 * Class485.anInt5740; i_1_ <= Class244.anInt3003 * -860748679; i_1_++) {
				Class217_Sub1 class217_sub1 = ObjectIndexLoader.method7916(i_1_, 241978983);
				if (null != class217_sub1)
					Class448.aClass217_Sub1Array5426[i_0_++] = class217_sub1;
			}
			Class448.aBool5422 = false;
			Class448.aLong5425 = Class169.method2869(1708391360) * -3240548399766708365L;
			Class96_Sub20.aClass282_Sub35_9415 = null;
		}
	}

	static void method2590(IComponentDefinitions class118, byte i) {
		if (client.aBool7344) {
			if (class118.anObjectArray1393 != null) {
				IComponentDefinitions class118_2_ = Index.method5694(Class7.anInt56 * 728544879, client.anInt7345 * -1673073865, -1264111799);
				if (class118_2_ != null) {
					HookRequest class282_sub43 = new HookRequest();
					class282_sub43.iComponentDefs = class118;
					class282_sub43.aClass118_8057 = class118_2_;
					class282_sub43.params = class118.anObjectArray1393;
					Class96_Sub4.executeHookInner200k(class282_sub43, 1791224764);
				}
			}
			TCPMessage class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4573, client.aClass184_7475.isaac, 891007251);
			class282_sub23.buffer.writeShortLE128(class118.anInt1288 * 1924549737, -1183932171);
			class282_sub23.buffer.writeShortLE(client.anInt7345 * -1673073865, (short) -9723);
			class282_sub23.buffer.writeShortLE128(class118.anInt1426 * -56249735, -1183932171);
			class282_sub23.buffer.writeLEInt(-1952846363 * class118.idHash, (byte) 89);
			class282_sub23.buffer.writeIntV2(Class7.anInt56 * 728544879, (byte) 104);
			class282_sub23.buffer.writeShortLE(client.anInt7346 * -1555739329, (short) -1117);
			client.aClass184_7475.method3049(class282_sub23, 656208756);
		}
	}

	static final void method2591(IComponentDefinitions[] class118s, int i, byte i_3_) {
		for (int i_4_ = 0; i_4_ < class118s.length; i_4_++) {
			IComponentDefinitions class118 = class118s[i_4_];
			if (null != class118) {
				if (0 == class118.anInt1268 * -2131393857) {
					if (null != class118.aClass118Array1439)
						method2591(class118.aClass118Array1439, i, (byte) -28);
					Class282_Sub44 class282_sub44 = ((Class282_Sub44) (client.aClass465_7442.method7754((long) (-1952846363 * class118.idHash))));
					if (class282_sub44 != null)
						Class383.method6514((587626901 * class282_sub44.anInt8063), i, -138211954);
				}
				if (0 == i && class118.anObjectArray1421 != null) {
					HookRequest class282_sub43 = new HookRequest();
					class282_sub43.iComponentDefs = class118;
					class282_sub43.params = class118.anObjectArray1421;
					Class96_Sub4.executeHookInner200k(class282_sub43, 506526261);
				}
				if (1 == i && null != class118.anObjectArray1346) {
					if (class118.anInt1288 * 1924549737 >= 0) {
						IComponentDefinitions class118_5_ = Class117.method1981((class118.idHash * -1952846363), (byte) 87);
						if (null == class118_5_ || null == class118_5_.aClass118Array1438 || (1924549737 * class118.anInt1288 >= class118_5_.aClass118Array1438.length) || class118 != (class118_5_.aClass118Array1438[class118.anInt1288 * 1924549737]))
							continue;
					}
					HookRequest class282_sub43 = new HookRequest();
					class282_sub43.iComponentDefs = class118;
					class282_sub43.params = class118.anObjectArray1346;
					Class96_Sub4.executeHookInner200k(class282_sub43, 2094989397);
				}
			}
		}
	}

	static final void method2592(byte i) {
		if (Class282_Sub17.method12259(-1741204137 * client.anInt7166, -632153862) || Class97.method1612(-1741204137 * client.anInt7166, 1908805257))
			Class438.method7333(false, 2084407063);
		else {
			Class233.aClass202_2883 = client.aClass184_7475.method3053((byte) -113);
			client.aClass184_7475.method3061(-1872117357);
			Class365.setGameState(10, 1328603649);
		}
	}

	static final void method2593(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1647551269) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1394 = Class351.method6193(string, class527, 1442904775);
		class118.aBool1384 = true;
	}

	public static void method2594(String string, Throwable throwable, byte i) {
		try {
			String string_6_ = "";
			if (throwable != null)
				string_6_ = Class96_Sub3.method13787(throwable, (byte) -73);
			if (string != null) {
				if (null != throwable)
					string_6_ = new StringBuilder().append(string_6_).append(" | ").toString();
				string_6_ = new StringBuilder().append(string_6_).append(string).toString();
			}
			CS2Executor.method11251(string_6_, -16686792);
			string_6_ = Class475.method7926(string_6_, -53160653);
			if (null != RuntimeException_Sub3.anApplet10460) {
				String string_7_ = "Unknown";
				String string_8_ = "1.1";
				try {
					string_7_ = System.getProperty("java.vendor");
					string_8_ = System.getProperty("java.version");
				} catch (Exception exception) {
					/* empty */
				}
				URL url = (new URL(RuntimeException_Sub3.anApplet10460.getCodeBase(), new StringBuilder().append("clienterror.ws?c=").append(-1705325745 * RuntimeException_Sub3.anInt10457).append("&cs=").append(-1529960075 * InventoriesIndexLoader.anInt4781).append("&u=").append(RuntimeException_Sub3.aString10458 != null ? Class475.method7926((RuntimeException_Sub3.aString10458), -790911814) : new StringBuilder().append("").append(7071485906675456853L * RuntimeException_Sub3.aLong10459).toString())
						.append("&v1=").append(Class475.method7926(string_7_, 553035872)).append("&v2=").append(Class475.method7926(string_8_, 72672054)).append("&e=").append(string_6_).toString()));
				DataInputStream datainputstream = new DataInputStream(url.openStream());
				datainputstream.read();
				datainputstream.close();
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	static final void method2595(CS2Executor class527, int i) {
		int i_9_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_9_, (byte) 76);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_9_ >> 16];
		Class380.method6453(class118, class98, class527, -1649840188);
	}
}
