import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;

public class Class434_Sub1 extends Class434 {

	ProxySelector aProxySelector7909 = ProxySelector.getDefault();

	Socket method12755(Proxy proxy_1, byte b_2) throws IOException {
		if (proxy_1.type() == Type.DIRECT) {
			return this.method7291();
		} else {
			SocketAddress socketaddress_3 = proxy_1.address();
			if (!(socketaddress_3 instanceof InetSocketAddress)) {
				return null;
			} else {
				InetSocketAddress inetsocketaddress_4 = (InetSocketAddress) socketaddress_3;
				if (proxy_1.type() == Type.HTTP) {
					String string_15 = null;

					try {
						Class class_6 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
						Method method_7 = class_6.getDeclaredMethod("getProxyAuth", new Class[] { String.class, Integer.TYPE });
						method_7.setAccessible(true);
						Object object_8 = method_7.invoke((Object) null, new Object[] { inetsocketaddress_4.getHostName(), new Integer(inetsocketaddress_4.getPort()) });
						if (object_8 != null) {
							Method method_9 = class_6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[0]);
							method_9.setAccessible(true);
							if (((Boolean) method_9.invoke(object_8, new Object[0])).booleanValue()) {
								Method method_10 = class_6.getDeclaredMethod("getHeaderName", new Class[0]);
								method_10.setAccessible(true);
								Method method_11 = class_6.getDeclaredMethod("getHeaderValue", new Class[] { URL.class, String.class });
								method_11.setAccessible(true);
								String string_12 = (String) method_10.invoke(object_8, new Object[0]);
								String string_13 = (String) method_11.invoke(object_8, new Object[] { new URL("https://" + this.aString5330 + "/"), "https" });
								string_15 = string_12 + ": " + string_13;
							}
						}
					} catch (Exception exception_14) {
						;
					}

					return this.method12756(inetsocketaddress_4.getHostName(), inetsocketaddress_4.getPort(), string_15);
				} else if (proxy_1.type() == Type.SOCKS) {
					Socket socket_5 = new Socket(proxy_1);
					socket_5.connect(new InetSocketAddress(this.aString5330, 877634459 * this.anInt5331));
					return socket_5;
				} else {
					return null;
				}
			}
		}
	}

	Socket method12756(String string_1, int i_2, String string_3) throws IOException {
		Socket socket_5 = new Socket(string_1, i_2);
		socket_5.setSoTimeout(10000);
		OutputStream outputstream_6 = socket_5.getOutputStream();
		if (string_3 == null) {
			outputstream_6.write(("CONNECT " + this.aString5330 + ":" + this.anInt5331 * 877634459 + " HTTP/1.0\n\n").getBytes(Charset.forName("ISO-8859-1")));
		} else {
			outputstream_6.write(("CONNECT " + this.aString5330 + ":" + 877634459 * this.anInt5331 + " HTTP/1.0\n" + string_3 + "\n\n").getBytes(Charset.forName("ISO-8859-1")));
		}

		outputstream_6.flush();
		BufferedReader bufferedreader_7 = new BufferedReader(new InputStreamReader(socket_5.getInputStream()));
		String string_8 = bufferedreader_7.readLine();
		if (string_8 != null) {
			if (string_8.startsWith("HTTP/1.0 200") || string_8.startsWith("HTTP/1.1 200")) {
				return socket_5;
			}

			if (string_8.startsWith("HTTP/1.0 407") || string_8.startsWith("HTTP/1.1 407")) {
				int i_9 = 0;
				String str_10 = "proxy-authenticate: ";

				for (string_8 = bufferedreader_7.readLine(); string_8 != null && i_9 < 50; i_9++) {
					if (string_8.toLowerCase().startsWith(str_10)) {
						string_8 = string_8.substring(str_10.length()).trim();
						int i_11 = string_8.indexOf(32);
						if (i_11 != -1) {
							string_8 = string_8.substring(0, i_11);
						}

						throw new IOException_Sub1(string_8);
					}

					string_8 = bufferedreader_7.readLine();
				}

				throw new IOException_Sub1("");
			}
		}

		outputstream_6.close();
		bufferedreader_7.close();
		socket_5.close();
		return null;
	}

	public Socket method7281() throws IOException {
		boolean bool_1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!bool_1) {
			System.setProperty("java.net.useSystemProxies", "true");
		}

		boolean bool_2 = this.anInt5331 * 877634459 == 443;

		List list_3;
		List list_4;
		try {
			list_3 = this.aProxySelector7909.select(new URI((bool_2 ? "https" : "http") + "://" + this.aString5330));
			list_4 = this.aProxySelector7909.select(new URI((bool_2 ? "http" : "https") + "://" + this.aString5330));
		} catch (URISyntaxException urisyntaxexception_15) {
			return this.method7291();
		}

		list_3.addAll(list_4);
		Object[] arr_5 = list_3.toArray();
		IOException_Sub1 ioexception_sub1_6 = null;
		Object[] arr_7 = arr_5;

		for (int i_8 = 0; i_8 < arr_7.length; i_8++) {
			Object object_9 = arr_7[i_8];
			Proxy proxy_10 = (Proxy) object_9;

			try {
				Socket socket_12 = this.method12755(proxy_10, (byte) -113);
				if (socket_12 != null) {
					return socket_12;
				}
			} catch (IOException_Sub1 ioexception_sub1_13) {
				ioexception_sub1_6 = ioexception_sub1_13;
			} catch (IOException ioexception_14) {
				;
			}
		}

		if (ioexception_sub1_6 != null) {
			throw ioexception_sub1_6;
		} else {
			return this.method7291();
		}
	}

	public Socket method7282() throws IOException {
		boolean bool_1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!bool_1) {
			System.setProperty("java.net.useSystemProxies", "true");
		}

		boolean bool_2 = this.anInt5331 * 877634459 == 443;

		List list_3;
		List list_4;
		try {
			list_3 = this.aProxySelector7909.select(new URI((bool_2 ? "https" : "http") + "://" + this.aString5330));
			list_4 = this.aProxySelector7909.select(new URI((bool_2 ? "http" : "https") + "://" + this.aString5330));
		} catch (URISyntaxException urisyntaxexception_15) {
			return this.method7291();
		}

		list_3.addAll(list_4);
		Object[] arr_5 = list_3.toArray();
		IOException_Sub1 ioexception_sub1_6 = null;
		Object[] arr_7 = arr_5;

		for (int i_8 = 0; i_8 < arr_7.length; i_8++) {
			Object object_9 = arr_7[i_8];
			Proxy proxy_10 = (Proxy) object_9;

			try {
				Socket socket_12 = this.method12755(proxy_10, (byte) -109);
				if (socket_12 != null) {
					return socket_12;
				}
			} catch (IOException_Sub1 ioexception_sub1_13) {
				ioexception_sub1_6 = ioexception_sub1_13;
			} catch (IOException ioexception_14) {
				;
			}
		}

		if (ioexception_sub1_6 != null) {
			throw ioexception_sub1_6;
		} else {
			return this.method7291();
		}
	}

	public Socket method7287() throws IOException {
		boolean bool_1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!bool_1) {
			System.setProperty("java.net.useSystemProxies", "true");
		}

		boolean bool_2 = this.anInt5331 * 877634459 == 443;

		List list_3;
		List list_4;
		try {
			list_3 = this.aProxySelector7909.select(new URI((bool_2 ? "https" : "http") + "://" + this.aString5330));
			list_4 = this.aProxySelector7909.select(new URI((bool_2 ? "http" : "https") + "://" + this.aString5330));
		} catch (URISyntaxException urisyntaxexception_15) {
			return this.method7291();
		}

		list_3.addAll(list_4);
		Object[] arr_5 = list_3.toArray();
		IOException_Sub1 ioexception_sub1_6 = null;
		Object[] arr_7 = arr_5;

		for (int i_8 = 0; i_8 < arr_7.length; i_8++) {
			Object object_9 = arr_7[i_8];
			Proxy proxy_10 = (Proxy) object_9;

			try {
				Socket socket_12 = this.method12755(proxy_10, (byte) -69);
				if (socket_12 != null) {
					return socket_12;
				}
			} catch (IOException_Sub1 ioexception_sub1_13) {
				ioexception_sub1_6 = ioexception_sub1_13;
			} catch (IOException ioexception_14) {
				;
			}
		}

		if (ioexception_sub1_6 != null) {
			throw ioexception_sub1_6;
		} else {
			return this.method7291();
		}
	}

	public Socket method7280(int i_1) throws IOException {
		boolean bool_2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!bool_2) {
			System.setProperty("java.net.useSystemProxies", "true");
		}

		boolean bool_3 = this.anInt5331 * 877634459 == 443;

		List list_4;
		List list_5;
		try {
			list_4 = this.aProxySelector7909.select(new URI((bool_3 ? "https" : "http") + "://" + this.aString5330));
			list_5 = this.aProxySelector7909.select(new URI((bool_3 ? "http" : "https") + "://" + this.aString5330));
		} catch (URISyntaxException urisyntaxexception_16) {
			return this.method7291();
		}

		list_4.addAll(list_5);
		Object[] arr_6 = list_4.toArray();
		IOException_Sub1 ioexception_sub1_7 = null;
		Object[] arr_8 = arr_6;

		for (int i_9 = 0; i_9 < arr_8.length; i_9++) {
			Object object_10 = arr_8[i_9];
			Proxy proxy_11 = (Proxy) object_10;

			try {
				Socket socket_13 = this.method12755(proxy_11, (byte) -66);
				if (socket_13 != null) {
					return socket_13;
				}
			} catch (IOException_Sub1 ioexception_sub1_14) {
				ioexception_sub1_7 = ioexception_sub1_14;
			} catch (IOException ioexception_15) {
				;
			}
		}

		if (ioexception_sub1_7 != null) {
			throw ioexception_sub1_7;
		} else {
			return this.method7291();
		}
	}

	public static void method12760(int i_0, int i_1, int i_2) {
		CoordGrid coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
		int i_5 = coordgrid_4.x + i_1;
		int i_6 = i_2 + coordgrid_4.y;
		if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null && IndexLoaders.MAP_REGION_DECODER.method4419(-1984228697) != Class256.aClass256_3153 && i_1 >= 0 && i_2 >= 0 && i_1 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_2 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
			long long_7 = (long) (i_0 << 28 | i_6 << 14 | i_5);
			Class282_Sub29 class282_sub29_9 = (Class282_Sub29) client.aClass465_7414.get(long_7);
			if (class282_sub29_9 == null) {
				IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3405(i_0, i_1, i_2, -259717537);
			} else {
				Class282_Sub34 class282_sub34_10 = (Class282_Sub34) class282_sub29_9.aClass482_7708.head((byte) 115);
				if (class282_sub34_10 == null) {
					IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3405(i_0, i_1, i_2, -237481476);
				} else {
					Class521_Sub1_Sub2_Sub1 class521_sub1_sub2_sub1_11 = (Class521_Sub1_Sub2_Sub1) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3405(i_0, i_1, i_2, -211748464);
					if (class521_sub1_sub2_sub1_11 == null) {
						class521_sub1_sub2_sub1_11 = new Class521_Sub1_Sub2_Sub1(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), i_1 << 265, IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aClass390Array2591[i_0].method6722(i_1, i_2), i_2 << 265, i_0, i_0);
					} else {
						class521_sub1_sub2_sub1_11.anInt10415 = -1;
						class521_sub1_sub2_sub1_11.anInt10411 = -1;
						class521_sub1_sub2_sub1_11.aClass206_7970 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
					}

					class521_sub1_sub2_sub1_11.anInt10423 = class282_sub34_10.anInt7853;
					class521_sub1_sub2_sub1_11.anInt10416 = class282_sub34_10.anInt7852;

					label44: while (true) {
						Class282_Sub34 class282_sub34_12 = (Class282_Sub34) class282_sub29_9.aClass482_7708.next(1363381477);
						if (class282_sub34_12 == null) {
							break;
						}

						if (class282_sub34_12.anInt7853 != class521_sub1_sub2_sub1_11.anInt10423) {
							class521_sub1_sub2_sub1_11.anInt10411 = class282_sub34_12.anInt7853;
							class521_sub1_sub2_sub1_11.anInt10414 = class282_sub34_12.anInt7852;

							while (true) {
								Class282_Sub34 class282_sub34_13 = (Class282_Sub34) class282_sub29_9.aClass482_7708.next(-761697054);
								if (class282_sub34_13 == null) {
									break label44;
								}

								if (class282_sub34_13.anInt7853 != class521_sub1_sub2_sub1_11.anInt10423 && class521_sub1_sub2_sub1_11.anInt10411 != class282_sub34_13.anInt7853) {
									class521_sub1_sub2_sub1_11.anInt10415 = class282_sub34_13.anInt7853;
									class521_sub1_sub2_sub1_11.anInt10412 = class282_sub34_13.anInt7852;
								}
							}
						}
					}

					int i_14 = Class504.method8389((i_1 << 9) + 256, (i_2 << 9) + 256, i_0, (byte) 85);
					class521_sub1_sub2_sub1_11.method11172((float) (i_1 << 265), (float) i_14, (float) (i_2 << 265));
					class521_sub1_sub2_sub1_11.anInt10422 = 0;
					class521_sub1_sub2_sub1_11.plane = (byte) i_0;
					class521_sub1_sub2_sub1_11.collisionPlane = (byte) i_0;
					if (IndexLoaders.MAP_REGION_DECODER.method4433().is0x2(i_1, i_2, 1619505196)) {
						class521_sub1_sub2_sub1_11.collisionPlane = (byte) (class521_sub1_sub2_sub1_11.collisionPlane + 1);
					}

					IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3394(i_0, i_1, i_2, i_14, class521_sub1_sub2_sub1_11);
				}
			}
		}

	}

}
