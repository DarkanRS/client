/* Class471 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class Class464 {
	boolean aBoolean5952;
	public String address;
	public int anInt5954 = 1723266594;
	public int anInt5955 = -2031127069;
	boolean aBoolean5956 = true;
	public int worldId;
	public static int anInt5958;
	public static int anInt5959;

	public Socket method6056(int i) throws IOException {
		try {
			return new Socket(InetAddress.getByName(Class518.urp), Loader.local ? 5555 : Loader.PORT);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tk.a(").append(')').toString());
		}
	}

	public static Socket createSocket(String address, int port) throws IOException {
		try {
			return new Socket(InetAddress.getByName(address), port);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tk.a(").append(')').toString());
		}
	}

	public boolean method6057(Class464 class471_0_, int i) {
		try {
			if (null == class471_0_)
				return false;
			return ((worldId * 1606920449 == class471_0_.worldId * 1606920449) && address.equals(class471_0_.address));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tk.b(").append(')').toString());
		}
	}

	public Class464() {
		((Class464) this).aBoolean5952 = false;
	}

	public void method6058(int i) {
		try {
			if (!((Class464) this).aBoolean5956) {
				((Class464) this).aBoolean5956 = true;
				((Class464) this).aBoolean5952 = true;
			} else if (((Class464) this).aBoolean5952)
				((Class464) this).aBoolean5952 = false;
			else
				((Class464) this).aBoolean5956 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tk.f(").append(')').toString());
		}
	}

	static final void method6059(ClientScript2 class403, int i) {
		try {
			int i_1_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_1_).anInt5721) * 785788887;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tk.aad(").append(')').toString());
		}
	}

	public static final void method6060(long l) {
		try {
			if (l > 0L) {
				if (l % 10L == 0L) {
					Class302.method3717(l - 1L);
					Class302.method3717(1L);
				} else
					Class302.method3717(l);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tk.a(").append(')').toString());
		}
	}

	static void method6061(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 - 1] = (Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 - 1]), 245040087).anInt4011) * -1570899057;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tk.b(").append(')').toString());
		}
	}

	public static void method6062(String string, Throwable throwable, short i) {
		try {
			try {
				String string_2_ = "";
				if (null != throwable) {
					string_2_ = Class298_Sub28.method3110(throwable, (byte) 10);
				}
				if (null != string) {
					if (throwable != null)
						string_2_ = new StringBuilder().append(string_2_).append(" | ").toString();
					string_2_ = new StringBuilder().append(string_2_).append(string).toString();
				}
				Class82_Sub6.method888(string_2_, (byte) -97);
				string_2_ = Class24.method381(string_2_, 1866879375);
				if (RuntimeException_Sub2.anApplet6306 != null) {
					String string_3_ = "Unknown";
					String string_4_ = "1.1";
					try {
						string_3_ = System.getProperty("java.vendor");
						string_4_ = System.getProperty("java.version");
					} catch (Exception exception) {
						/* empty */
					}
					URL url = (new URL(RuntimeException_Sub2.anApplet6306.getCodeBase(), new StringBuilder().append("clienterror.ws?c=").append(1879961195 * RuntimeException_Sub2.anInt6307).append("&cs=").append(Class400.anInt5225 * -518231893).append("&u=").append(RuntimeException_Sub2.aString6305 != null ? Class24.method381((RuntimeException_Sub2.aString6305), 1755268630) : new StringBuilder().append("").append(RuntimeException_Sub2.aLong6304 * -6049538010378147713L).toString())
							.append("&v1=").append(Class24.method381(string_3_, 1908813810)).append("&v2=").append(Class24.method381(string_4_, 1870225284)).append("&e=").append(string_2_).toString()));
					DataInputStream datainputstream = new DataInputStream(url.openStream());
					datainputstream.read();
					datainputstream.close();
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tk.a(").append(')').toString());
		}
	}
}
