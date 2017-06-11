/* Class481_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public class Class481_Sub1 extends Class481 {
	ProxySelector aProxySelector8445 = ProxySelector.getDefault();
	static String aString8446 = "java.net.useSystemProxies";

	Socket method6114(String string, int i, String string_0_, int i_1_) throws IOException {
		try {
			Socket socket = new Socket(string, i);
			socket.setSoTimeout(10000);
			OutputStream outputstream = socket.getOutputStream();
			if (null == string_0_)
				outputstream.write(new StringBuilder().append("CONNECT ").append(((Class481_Sub1) this).aString6034).append(":").append(98195689 * ((Class481_Sub1) this).anInt6033).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
			else
				outputstream.write(new StringBuilder().append("CONNECT ").append(((Class481_Sub1) this).aString6034).append(":").append(((Class481_Sub1) this).anInt6033 * 98195689).append(" HTTP/1.0\n").append(string_0_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
			outputstream.flush();
			BufferedReader bufferedreader = (new BufferedReader(new InputStreamReader(socket.getInputStream())));
			String string_2_ = bufferedreader.readLine();
			if (null != string_2_) {
				if (string_2_.startsWith("HTTP/1.0 200") || string_2_.startsWith("HTTP/1.1 200"))
					return socket;
				if (string_2_.startsWith("HTTP/1.0 407") || string_2_.startsWith("HTTP/1.1 407")) {
					int i_3_ = 0;
					String string_4_ = "proxy-authenticate: ";
					for (string_2_ = bufferedreader.readLine(); string_2_ != null && i_3_ < 50; i_3_++) {
						if (string_2_.toLowerCase().startsWith(string_4_)) {
							string_2_ = string_2_.substring(string_4_.length()).trim();
							int i_5_ = string_2_.indexOf(' ');
							if (-1 != i_5_)
								string_2_ = string_2_.substring(0, i_5_);
							throw new IOException_Sub1(string_2_);
						}
						string_2_ = bufferedreader.readLine();
					}
					throw new IOException_Sub1("");
				}
			}
			outputstream.close();
			bufferedreader.close();
			socket.close();
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aes.q(").append(')').toString());
		}
	}

	Socket method6115(Proxy proxy, int i) throws IOException {
		try {
			if (proxy.type() == Proxy.Type.DIRECT)
				return method6110(-1908230977);
			java.net.SocketAddress socketaddress = proxy.address();
			if (!(socketaddress instanceof InetSocketAddress))
				return null;
			InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
			if (proxy.type() == Proxy.Type.HTTP) {
				String string = null;
				try {
					Class var_class = sun.net.www.protocol.http.AuthenticationInfo.class;
					Method method = (var_class.getDeclaredMethod("getProxyAuth", new Class[] { java.lang.String.class, Integer.TYPE }));
					method.setAccessible(true);
					Object object = method.invoke(null, (new Object[] { inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()) }));
					if (object != null) {
						Method method_6_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
						method_6_.setAccessible(true);
						if (((Boolean) method_6_.invoke(object, new Object[0])).booleanValue()) {
							Method method_7_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
							method_7_.setAccessible(true);
							Method method_8_ = (var_class.getDeclaredMethod("getHeaderValue", (new Class[] { java.net.URL.class, java.lang.String.class })));
							method_8_.setAccessible(true);
							String string_9_ = ((String) method_7_.invoke(object, new Object[0]));
							String string_10_ = ((String) (method_8_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(((Class481_Sub1) this).aString6034).append("/").toString()), "https" }))));
							string = new StringBuilder().append(string_9_).append(": ").append(string_10_).toString();
						}
					}
				} catch (Exception exception) {
					/* empty */
				}
				return method6114(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, -1832604571);
			}
			if (proxy.type() == Proxy.Type.SOCKS) {
				Socket socket = new Socket(proxy);
				socket.connect(new InetSocketAddress((((Class481_Sub1) this).aString6034), (98195689 * (((Class481_Sub1) this).anInt6033))));
				return socket;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aes.r(").append(')').toString());
		}
	}

	public Socket method6112() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_11_ = ((Class481_Sub1) this).anInt6033 * 98195689 == 443;
		List list;
		List list_12_;
		try {
			list = (((Class481_Sub1) this).aProxySelector8445.select(new URI(new StringBuilder().append(bool_11_ ? "https" : "http").append("://").append(((Class481_Sub1) this).aString6034).toString())));
			list_12_ = (((Class481_Sub1) this).aProxySelector8445.select(new URI(new StringBuilder().append(bool_11_ ? "http" : "https").append("://").append(((Class481_Sub1) this).aString6034).toString())));
		} catch (URISyntaxException urisyntaxexception) {
			return method6110(-1850943966);
		}
		list.addAll(list_12_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_13_ = objects;
		for (int i = 0; i < objects_13_.length; i++) {
			Object object = objects_13_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_14_ = method6115(proxy, 1862351535);
				if (null == socket_14_)
					continue;
				socket = socket_14_;
			} catch (IOException_Sub1 ioexception_sub1_15_) {
				ioexception_sub1 = ioexception_sub1_15_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method6110(-1772806309);
	}

	Class481_Sub1() {
		/* empty */
	}

	public Socket method6111(int i) throws IOException {
		try {
			boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
			if (!bool)
				System.setProperty("java.net.useSystemProxies", "true");
			boolean bool_16_ = ((Class481_Sub1) this).anInt6033 * 98195689 == 443;
			List list;
			List list_17_;
			try {
				list = (((Class481_Sub1) this).aProxySelector8445.select(new URI(new StringBuilder().append(bool_16_ ? "https" : "http").append("://").append(((Class481_Sub1) this).aString6034).toString())));
				list_17_ = (((Class481_Sub1) this).aProxySelector8445.select(new URI(new StringBuilder().append(bool_16_ ? "http" : "https").append("://").append(((Class481_Sub1) this).aString6034).toString())));
			} catch (URISyntaxException urisyntaxexception) {
				return method6110(-1954406666);
			}
			list.addAll(list_17_);
			Object[] objects = list.toArray();
			IOException_Sub1 ioexception_sub1 = null;
			Object[] objects_18_ = objects;
			for (int i_19_ = 0; i_19_ < objects_18_.length; i_19_++) {
				Object object = objects_18_[i_19_];
				Proxy proxy = (Proxy) object;
				Socket socket;
				try {
					Socket socket_20_ = method6115(proxy, 2044557315);
					if (null == socket_20_)
						continue;
					socket = socket_20_;
				} catch (IOException_Sub1 ioexception_sub1_21_) {
					ioexception_sub1 = ioexception_sub1_21_;
					continue;
				} catch (IOException ioexception) {
					continue;
				}
				return socket;
			}
			if (null != ioexception_sub1)
				throw ioexception_sub1;
			return method6110(-2133259279);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aes.f(").append(')').toString());
		}
	}
}
