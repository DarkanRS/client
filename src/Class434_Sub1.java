
/* Class434_Sub1 - Decompiled by JODE
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

public class Class434_Sub1 extends Class434 {
	ProxySelector aProxySelector7909 = ProxySelector.getDefault();
	static final String aString7910 = "java.net.useSystemProxies";

	Socket method12753(String string, int i, String string_0_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (null == string_0_)
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(((Class434_Sub1) this).anInt5331 * 877634459).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(877634459 * ((Class434_Sub1) this).anInt5331).append(" HTTP/1.0\n").append(string_0_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_1_ = bufferedreader.readLine();
		if (string_1_ != null) {
			if (string_1_.startsWith("HTTP/1.0 200") || string_1_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_1_.startsWith("HTTP/1.0 407") || string_1_.startsWith("HTTP/1.1 407")) {
				int i_2_ = 0;
				String string_3_ = "proxy-authenticate: ";
				for (string_1_ = bufferedreader.readLine(); string_1_ != null && i_2_ < 50; i_2_++) {
					if (string_1_.toLowerCase().startsWith(string_3_)) {
						string_1_ = string_1_.substring(string_3_.length()).trim();
						int i_4_ = string_1_.indexOf(' ');
						if (i_4_ != -1)
							string_1_ = string_1_.substring(0, i_4_);
						throw new IOException_Sub1(string_1_);
					}
					string_1_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	Socket method12754(String string, int i, String string_5_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (null == string_5_)
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(((Class434_Sub1) this).anInt5331 * 877634459).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(877634459 * ((Class434_Sub1) this).anInt5331).append(" HTTP/1.0\n").append(string_5_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_6_ = bufferedreader.readLine();
		if (string_6_ != null) {
			if (string_6_.startsWith("HTTP/1.0 200") || string_6_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_6_.startsWith("HTTP/1.0 407") || string_6_.startsWith("HTTP/1.1 407")) {
				int i_7_ = 0;
				String string_8_ = "proxy-authenticate: ";
				for (string_6_ = bufferedreader.readLine(); string_6_ != null && i_7_ < 50; i_7_++) {
					if (string_6_.toLowerCase().startsWith(string_8_)) {
						string_6_ = string_6_.substring(string_8_.length()).trim();
						int i_9_ = string_6_.indexOf(' ');
						if (i_9_ != -1)
							string_6_ = string_6_.substring(0, i_9_);
						throw new IOException_Sub1(string_6_);
					}
					string_6_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	Socket method12755(Proxy proxy, byte i) throws IOException {
		if (proxy.type() == Proxy.Type.DIRECT)
			return method7291(1580851004);
		java.net.SocketAddress socketaddress = proxy.address();
		if (!(socketaddress instanceof InetSocketAddress))
			return null;
		InetSocketAddress inetsocketaddress = (InetSocketAddress) socketaddress;
		if (proxy.type() == Proxy.Type.HTTP) {
			String string = null;
			try {
				Class var_class = (Class.forName("sun.net.www.protocol.http.AuthenticationInfo"));
				Method method = var_class.getDeclaredMethod("getProxyAuth", (new Class[] { java.lang.String.class, Integer.TYPE }));
				method.setAccessible(true);
				Object object = method.invoke(null, (new Object[] { inetsocketaddress.getHostName(), new Integer(inetsocketaddress.getPort()) }));
				if (null != object) {
					Method method_10_ = (var_class.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]));
					method_10_.setAccessible(true);
					if (((Boolean) method_10_.invoke(object, new Object[0])).booleanValue()) {
						Method method_11_ = var_class.getDeclaredMethod("getHeaderName", new Class[0]);
						method_11_.setAccessible(true);
						Method method_12_ = (var_class.getDeclaredMethod("getHeaderValue", new Class[] { java.net.URL.class, java.lang.String.class }));
						method_12_.setAccessible(true);
						String string_13_ = ((String) method_11_.invoke(object, new Object[0]));
						String string_14_ = ((String) (method_12_.invoke(object, (new Object[] { new URL(new StringBuilder().append("https://").append(((Class434_Sub1) this).aString5330).append("/").toString()), "https" }))));
						string = new StringBuilder().append(string_13_).append(": ").append(string_14_).toString();
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
			return method12756(inetsocketaddress.getHostName(), inetsocketaddress.getPort(), string, (byte) -81);
		}
		if (proxy.type() == Proxy.Type.SOCKS) {
			Socket socket = new Socket(proxy);
			socket.connect(new InetSocketAddress((((Class434_Sub1) this).aString5330), (877634459 * (((Class434_Sub1) this).anInt5331))));
			return socket;
		}
		return null;
	}

	Socket method12756(String string, int i, String string_15_, byte i_16_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (null == string_15_)
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(((Class434_Sub1) this).anInt5331 * 877634459).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(877634459 * ((Class434_Sub1) this).anInt5331).append(" HTTP/1.0\n").append(string_15_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_17_ = bufferedreader.readLine();
		if (string_17_ != null) {
			if (string_17_.startsWith("HTTP/1.0 200") || string_17_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_17_.startsWith("HTTP/1.0 407") || string_17_.startsWith("HTTP/1.1 407")) {
				int i_18_ = 0;
				String string_19_ = "proxy-authenticate: ";
				for (string_17_ = bufferedreader.readLine(); string_17_ != null && i_18_ < 50; i_18_++) {
					if (string_17_.toLowerCase().startsWith(string_19_)) {
						string_17_ = string_17_.substring(string_19_.length()).trim();
						int i_20_ = string_17_.indexOf(' ');
						if (i_20_ != -1)
							string_17_ = string_17_.substring(0, i_20_);
						throw new IOException_Sub1(string_17_);
					}
					string_17_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	public Socket method7281() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_21_ = ((Class434_Sub1) this).anInt5331 * 877634459 == 443;
		List list;
		List list_22_;
		try {
			list = (((Class434_Sub1) this).aProxySelector7909.select(new URI(new StringBuilder().append(bool_21_ ? "https" : "http").append("://").append(((Class434_Sub1) this).aString5330).toString())));
			list_22_ = (((Class434_Sub1) this).aProxySelector7909.select(new URI(new StringBuilder().append(bool_21_ ? "http" : "https").append("://").append(((Class434_Sub1) this).aString5330).toString())));
		} catch (URISyntaxException urisyntaxexception) {
			return method7291(1580851004);
		}
		list.addAll(list_22_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_23_ = objects;
		for (int i = 0; i < objects_23_.length; i++) {
			Object object = objects_23_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_24_ = method12755(proxy, (byte) -113);
				if (socket_24_ == null)
					continue;
				socket = socket_24_;
			} catch (IOException_Sub1 ioexception_sub1_25_) {
				ioexception_sub1 = ioexception_sub1_25_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method7291(1580851004);
	}

	public Socket method7282() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_26_ = ((Class434_Sub1) this).anInt5331 * 877634459 == 443;
		List list;
		List list_27_;
		try {
			list = (((Class434_Sub1) this).aProxySelector7909.select(new URI(new StringBuilder().append(bool_26_ ? "https" : "http").append("://").append(((Class434_Sub1) this).aString5330).toString())));
			list_27_ = (((Class434_Sub1) this).aProxySelector7909.select(new URI(new StringBuilder().append(bool_26_ ? "http" : "https").append("://").append(((Class434_Sub1) this).aString5330).toString())));
		} catch (URISyntaxException urisyntaxexception) {
			return method7291(1580851004);
		}
		list.addAll(list_27_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_28_ = objects;
		for (int i = 0; i < objects_28_.length; i++) {
			Object object = objects_28_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_29_ = method12755(proxy, (byte) -109);
				if (socket_29_ == null)
					continue;
				socket = socket_29_;
			} catch (IOException_Sub1 ioexception_sub1_30_) {
				ioexception_sub1 = ioexception_sub1_30_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method7291(1580851004);
	}

	Socket method12757(String string, int i, String string_31_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (null == string_31_)
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(((Class434_Sub1) this).anInt5331 * 877634459).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(877634459 * ((Class434_Sub1) this).anInt5331).append(" HTTP/1.0\n").append(string_31_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_32_ = bufferedreader.readLine();
		if (string_32_ != null) {
			if (string_32_.startsWith("HTTP/1.0 200") || string_32_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_32_.startsWith("HTTP/1.0 407") || string_32_.startsWith("HTTP/1.1 407")) {
				int i_33_ = 0;
				String string_34_ = "proxy-authenticate: ";
				for (string_32_ = bufferedreader.readLine(); string_32_ != null && i_33_ < 50; i_33_++) {
					if (string_32_.toLowerCase().startsWith(string_34_)) {
						string_32_ = string_32_.substring(string_34_.length()).trim();
						int i_35_ = string_32_.indexOf(' ');
						if (i_35_ != -1)
							string_32_ = string_32_.substring(0, i_35_);
						throw new IOException_Sub1(string_32_);
					}
					string_32_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	Socket method12758(String string, int i, String string_36_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (null == string_36_)
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(((Class434_Sub1) this).anInt5331 * 877634459).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(877634459 * ((Class434_Sub1) this).anInt5331).append(" HTTP/1.0\n").append(string_36_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_37_ = bufferedreader.readLine();
		if (string_37_ != null) {
			if (string_37_.startsWith("HTTP/1.0 200") || string_37_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_37_.startsWith("HTTP/1.0 407") || string_37_.startsWith("HTTP/1.1 407")) {
				int i_38_ = 0;
				String string_39_ = "proxy-authenticate: ";
				for (string_37_ = bufferedreader.readLine(); string_37_ != null && i_38_ < 50; i_38_++) {
					if (string_37_.toLowerCase().startsWith(string_39_)) {
						string_37_ = string_37_.substring(string_39_.length()).trim();
						int i_40_ = string_37_.indexOf(' ');
						if (i_40_ != -1)
							string_37_ = string_37_.substring(0, i_40_);
						throw new IOException_Sub1(string_37_);
					}
					string_37_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	Class434_Sub1() {
		/* empty */
	}

	public Socket method7287() throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_41_ = ((Class434_Sub1) this).anInt5331 * 877634459 == 443;
		List list;
		List list_42_;
		try {
			list = (((Class434_Sub1) this).aProxySelector7909.select(new URI(new StringBuilder().append(bool_41_ ? "https" : "http").append("://").append(((Class434_Sub1) this).aString5330).toString())));
			list_42_ = (((Class434_Sub1) this).aProxySelector7909.select(new URI(new StringBuilder().append(bool_41_ ? "http" : "https").append("://").append(((Class434_Sub1) this).aString5330).toString())));
		} catch (URISyntaxException urisyntaxexception) {
			return method7291(1580851004);
		}
		list.addAll(list_42_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_43_ = objects;
		for (int i = 0; i < objects_43_.length; i++) {
			Object object = objects_43_[i];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_44_ = method12755(proxy, (byte) -69);
				if (socket_44_ == null)
					continue;
				socket = socket_44_;
			} catch (IOException_Sub1 ioexception_sub1_45_) {
				ioexception_sub1 = ioexception_sub1_45_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method7291(1580851004);
	}

	public Socket method7280(int i) throws IOException {
		boolean bool = (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies")));
		if (!bool)
			System.setProperty("java.net.useSystemProxies", "true");
		boolean bool_46_ = ((Class434_Sub1) this).anInt5331 * 877634459 == 443;
		List list;
		List list_47_;
		try {
			list = (((Class434_Sub1) this).aProxySelector7909.select(new URI(new StringBuilder().append(bool_46_ ? "https" : "http").append("://").append(((Class434_Sub1) this).aString5330).toString())));
			list_47_ = (((Class434_Sub1) this).aProxySelector7909.select(new URI(new StringBuilder().append(bool_46_ ? "http" : "https").append("://").append(((Class434_Sub1) this).aString5330).toString())));
		} catch (URISyntaxException urisyntaxexception) {
			return method7291(1580851004);
		}
		list.addAll(list_47_);
		Object[] objects = list.toArray();
		IOException_Sub1 ioexception_sub1 = null;
		Object[] objects_48_ = objects;
		for (int i_49_ = 0; i_49_ < objects_48_.length; i_49_++) {
			Object object = objects_48_[i_49_];
			Proxy proxy = (Proxy) object;
			Socket socket;
			try {
				Socket socket_50_ = method12755(proxy, (byte) -66);
				if (socket_50_ == null)
					continue;
				socket = socket_50_;
			} catch (IOException_Sub1 ioexception_sub1_51_) {
				ioexception_sub1 = ioexception_sub1_51_;
				continue;
			} catch (IOException ioexception) {
				continue;
			}
			return socket;
		}
		if (null != ioexception_sub1)
			throw ioexception_sub1;
		return method7291(1580851004);
	}

	Socket method12759(String string, int i, String string_52_) throws IOException {
		Socket socket = new Socket(string, i);
		socket.setSoTimeout(10000);
		OutputStream outputstream = socket.getOutputStream();
		if (null == string_52_)
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(((Class434_Sub1) this).anInt5331 * 877634459).append(" HTTP/1.0\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		else
			outputstream.write(new StringBuilder().append("CONNECT ").append(((Class434_Sub1) this).aString5330).append(":").append(877634459 * ((Class434_Sub1) this).anInt5331).append(" HTTP/1.0\n").append(string_52_).append("\n\n").toString().getBytes(Charset.forName("ISO-8859-1")));
		outputstream.flush();
		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String string_53_ = bufferedreader.readLine();
		if (string_53_ != null) {
			if (string_53_.startsWith("HTTP/1.0 200") || string_53_.startsWith("HTTP/1.1 200"))
				return socket;
			if (string_53_.startsWith("HTTP/1.0 407") || string_53_.startsWith("HTTP/1.1 407")) {
				int i_54_ = 0;
				String string_55_ = "proxy-authenticate: ";
				for (string_53_ = bufferedreader.readLine(); string_53_ != null && i_54_ < 50; i_54_++) {
					if (string_53_.toLowerCase().startsWith(string_55_)) {
						string_53_ = string_53_.substring(string_55_.length()).trim();
						int i_56_ = string_53_.indexOf(' ');
						if (i_56_ != -1)
							string_53_ = string_53_.substring(0, i_56_);
						throw new IOException_Sub1(string_53_);
					}
					string_53_ = bufferedreader.readLine();
				}
				throw new IOException_Sub1("");
			}
		}
		outputstream.close();
		bufferedreader.close();
		socket.close();
		return null;
	}

	public static void method12760(int i, int i_57_, int i_58_, int i_59_) {
		CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(499129134);
		int i_60_ = class219.x * 1948093437 + i_57_;
		int i_61_ = i_58_ + class219.y * -1002240017;
		if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1713508909) != null && (IndexLoaders.MAP_REGION_DECODER.method4419(-1984228697) != Class256.aClass256_3153) && i_57_ >= 0 && i_58_ >= 0 && i_57_ < IndexLoaders.MAP_REGION_DECODER.getSizeX(-1612887157) && i_58_ < IndexLoaders.MAP_REGION_DECODER.getSizeY(-1255966708)) {
			long l = (long) (i << 28 | i_61_ << 14 | i_60_);
			Class282_Sub29 class282_sub29 = (Class282_Sub29) client.aClass465_7414.method7754(l);
			if (class282_sub29 == null)
				IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1670103274).method3405(i, i_57_, i_58_, -259717537);
			else {
				Class282_Sub34 class282_sub34 = ((Class282_Sub34) class282_sub29.aClass482_7708.head((byte) 115));
				if (null == class282_sub34)
					IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1731204045).method3405(i, i_57_, i_58_, -237481476);
				else {
					Class521_Sub1_Sub2_Sub1 class521_sub1_sub2_sub1 = ((Class521_Sub1_Sub2_Sub1) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-892645216).method3405(i, i_57_, i_58_, -211748464));
					if (null == class521_sub1_sub2_sub1)
						class521_sub1_sub2_sub1 = (new Class521_Sub1_Sub2_Sub1(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1434674634), i_57_ << 265, IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1839771352).aClass390Array2591[i].method6722(i_57_, i_58_, 65280), i_58_ << 265, i, i));
					else {
						Class521_Sub1_Sub2_Sub1 class521_sub1_sub2_sub1_62_ = class521_sub1_sub2_sub1;
						class521_sub1_sub2_sub1.anInt10415 = -100349465;
						class521_sub1_sub2_sub1_62_.anInt10411 = 1841858001;
						class521_sub1_sub2_sub1.aClass206_7970 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1427831609);
					}
					class521_sub1_sub2_sub1.anInt10423 = class282_sub34.anInt7853 * 526767639;
					class521_sub1_sub2_sub1.anInt10416 = (-2068826129 * ((Class282_Sub34) class282_sub34).anInt7852);
					while_0_: do {
						Class282_Sub34 class282_sub34_63_;
						do {
							class282_sub34_63_ = (Class282_Sub34) class282_sub29.aClass482_7708.next(1363381477);
							if (null == class282_sub34_63_)
								break while_0_;
						} while (class282_sub34_63_.anInt7853 * 1964309863 == (class521_sub1_sub2_sub1.anInt10423 * -876219087));
						class521_sub1_sub2_sub1.anInt10411 = -1363239959 * class282_sub34_63_.anInt7853;
						class521_sub1_sub2_sub1.anInt10414 = (((Class282_Sub34) class282_sub34_63_).anInt7852 * 1341145025);
						for (;;) {
							Class282_Sub34 class282_sub34_64_ = ((Class282_Sub34) class282_sub29.aClass482_7708.next(-761697054));
							if (null == class282_sub34_64_)
								break;
							if ((1964309863 * class282_sub34_64_.anInt7853 != (class521_sub1_sub2_sub1.anInt10423 * -876219087)) && ((313920719 * class521_sub1_sub2_sub1.anInt10411) != (class282_sub34_64_.anInt7853 * 1964309863))) {
								class521_sub1_sub2_sub1.anInt10415 = (1400731919 * class282_sub34_64_.anInt7853);
								class521_sub1_sub2_sub1.anInt10412 = (((Class282_Sub34) class282_sub34_64_).anInt7852) * 927895425;
							}
						}
					} while (false);
					int i_65_ = Class504.method8389((i_57_ << 9) + 256, 256 + (i_58_ << 9), i, (byte) 85);
					class521_sub1_sub2_sub1.method11172((float) (i_57_ << 265), (float) i_65_, (float) (i_58_ << 265));
					class521_sub1_sub2_sub1.anInt10422 = 0;
					class521_sub1_sub2_sub1.plane = (byte) i;
					class521_sub1_sub2_sub1.aByte7968 = (byte) i;
					if (IndexLoaders.MAP_REGION_DECODER.method4433(33386298).is0x2(i_57_, i_58_, 1619505196))
						class521_sub1_sub2_sub1.aByte7968++;
					IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1499506351).method3394(i, i_57_, i_58_, i_65_, class521_sub1_sub2_sub1, (byte) -119);
				}
			}
		}
	}
}
