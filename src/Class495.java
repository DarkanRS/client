/* Class495 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class495 {
	public static String aString6093;
	public static String aString6094;

	Class495() throws Throwable {
		throw new Error();
	}

	static {
		String string = "Unknown";
		try {
			string = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("java.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.name").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString6094 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		aString6093 = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		string.toLowerCase();
		string = "~/";
		try {
			string = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception) {
			/* empty */
		}
		new File(string);
	}

	public static final void method6194(String string, int i) {
		try {
			if (null != string) {
				String string_0_ = Class173.method1824(string, 2076308091);
				if (string_0_ != null) {
					for (int i_1_ = 0; i_1_ < client.anInt8941 * -1054937867; i_1_++) {
						String string_2_ = client.aStringArray8704[i_1_];
						String string_3_ = Class173.method1824(string_2_, -1598414380);
						if (Class396.method4910(string, string_0_, string_2_, string_3_, -1043868937)) {
							client.anInt8941 -= 560029533;
							for (int i_4_ = i_1_; i_4_ < -1054937867 * client.anInt8941; i_4_++) {
								client.aStringArray8704[i_4_] = client.aStringArray8704[i_4_ + 1];
								client.aStringArray8945[i_4_] = client.aStringArray8945[1 + i_4_];
								client.anIntArray8946[i_4_] = client.anIntArray8946[i_4_ + 1];
								client.aStringArray8947[i_4_] = client.aStringArray8947[i_4_ + 1];
								client.anIntArray8705[i_4_] = client.anIntArray8705[1 + i_4_];
								client.aBooleanArray8722[i_4_] = client.aBooleanArray8722[1 + i_4_];
								client.aBooleanArray8950[i_4_] = client.aBooleanArray8950[1 + i_4_];
							}
							client.anInt8883 = client.anInt8933 * 754377557;
							BufferedConnectionContext class25 = Class429.method5760((short) 512);
							Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.REMOVE_FRIEND_PACKET, class25.aClass449_330, (byte) 9);
							class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(Class58.method693(string, 2053997873));
							class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2123529676);
							class25.method390(class298_sub36, (byte) -90);
							break;
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uk.ms(").append(')').toString());
		}
	}

	public static int method6195(byte i) {
		try {
			return Class107.anInt1310 * 1103086749;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("uk.d(").append(')').toString());
		}
	}
}
