package com.rs.jagex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.*;
import java.net.Proxy.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Class434_Sub1 extends Class434 {

	public static void method12760(int i_0, int i_1, int i_2) {
		CoordGrid coordgrid_4 = IndexLoaders.MAP_REGION_DECODER.getBase();
		int i_5 = coordgrid_4.x + i_1;
		int i_6 = i_2 + coordgrid_4.y;
		if (IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null && IndexLoaders.MAP_REGION_DECODER.method4419() != RegionLoadType.aRegionLoadType_3153 && i_1 >= 0 && i_2 >= 0 && i_1 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_2 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
			long long_7 = i_0 << 28 | i_6 << 14 | i_5;
			Node_Sub29 class282_sub29_9 = (Node_Sub29) client.aClass465_7414.get(long_7);
			if (class282_sub29_9 == null)
				IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3405(i_0, i_1, i_2);
			else {
				GroundItemNode class282_sub34_10 = (GroundItemNode) class282_sub29_9.aClass482_7708.head();
				if (class282_sub34_10 == null)
					IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3405(i_0, i_1, i_2);
				else {
					GroundItem class521_sub1_sub2_sub1_11 = (GroundItem) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3405(i_0, i_1, i_2);
					if (class521_sub1_sub2_sub1_11 == null)
						class521_sub1_sub2_sub1_11 = new GroundItem(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(), i_1 << 9, IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().aGroundArray2591[i_0].getHeight(i_1, i_2), i_2 << 9, i_0, i_0);
					else {
						class521_sub1_sub2_sub1_11.anInt10415 = -1;
						class521_sub1_sub2_sub1_11.anInt10411 = -1;
						class521_sub1_sub2_sub1_11.aClass206_7970 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager();
					}

					class521_sub1_sub2_sub1_11.anInt10423 = class282_sub34_10.id;
					class521_sub1_sub2_sub1_11.anInt10416 = class282_sub34_10.amount;

					label44:
						while (true) {
							GroundItemNode class282_sub34_12 = (GroundItemNode) class282_sub29_9.aClass482_7708.next();
							if (class282_sub34_12 == null)
								break;

							if (class282_sub34_12.id != class521_sub1_sub2_sub1_11.anInt10423) {
								class521_sub1_sub2_sub1_11.anInt10411 = class282_sub34_12.id;
								class521_sub1_sub2_sub1_11.anInt10414 = class282_sub34_12.amount;

								while (true) {
									GroundItemNode class282_sub34_13 = (GroundItemNode) class282_sub29_9.aClass482_7708.next();
									if (class282_sub34_13 == null)
										break label44;

									if (class282_sub34_13.id != class521_sub1_sub2_sub1_11.anInt10423 && class521_sub1_sub2_sub1_11.anInt10411 != class282_sub34_13.id) {
										class521_sub1_sub2_sub1_11.anInt10415 = class282_sub34_13.id;
										class521_sub1_sub2_sub1_11.anInt10412 = class282_sub34_13.amount;
									}
								}
							}
						}

					int i_14 = Class504.getTerrainHeightAtPos((i_1 << 9) + 256, (i_2 << 9) + 256, i_0);
					class521_sub1_sub2_sub1_11.method11172((i_1 << 9), i_14, (i_2 << 9));
					class521_sub1_sub2_sub1_11.anInt10422 = 0;
					class521_sub1_sub2_sub1_11.plane = (byte) i_0;
					class521_sub1_sub2_sub1_11.collisionPlane = (byte) i_0;
					if (IndexLoaders.MAP_REGION_DECODER.getRenderFlags().isLowerObjectsToOverrideClipping(i_1, i_2))
						class521_sub1_sub2_sub1_11.collisionPlane += 1;

					IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3394(i_0, i_1, i_2, i_14, class521_sub1_sub2_sub1_11);
				}
			}
		}

	}

	ProxySelector aProxySelector7909 = ProxySelector.getDefault();

	Socket method12755(Proxy proxy_1) throws IOException {
		if (proxy_1.type() == Type.DIRECT)
			return method7291();
		SocketAddress socketaddress_3 = proxy_1.address();
		if (!(socketaddress_3 instanceof InetSocketAddress inetsocketaddress_4))
			return null;
		else {
			if (proxy_1.type() == Type.HTTP) {
				String string_15 = null;

				try {
					Class class_6 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
					Method method_7 = class_6.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
					method_7.setAccessible(true);
					Object object_8 = method_7.invoke(null, inetsocketaddress_4.getHostName(), Integer.valueOf(inetsocketaddress_4.getPort()));
					if (object_8 != null) {
						Method method_9 = class_6.getDeclaredMethod("supportsPreemptiveAuthorization");
						method_9.setAccessible(true);
						if (((Boolean) method_9.invoke(object_8, new Object[0])).booleanValue()) {
							Method method_10 = class_6.getDeclaredMethod("getHeaderName");
							method_10.setAccessible(true);
							Method method_11 = class_6.getDeclaredMethod("getHeaderValue", URL.class, String.class);
							method_11.setAccessible(true);
							String string_12 = (String) method_10.invoke(object_8, new Object[0]);
							String string_13 = (String) method_11.invoke(object_8, new Object[]{new URL("https://" + aString5330 + "/"), "https"});
							string_15 = string_12 + ": " + string_13;
						}
					}
				} catch (Exception ignored) {
				}

				return method12756(inetsocketaddress_4.getHostName(), inetsocketaddress_4.getPort(), string_15);
			} else if (proxy_1.type() == Type.SOCKS) {
				Socket socket_5 = new Socket(proxy_1);
				socket_5.connect(new InetSocketAddress(aString5330, 877634459 * anInt5331));
				return socket_5;
			} else
				return null;
		}
	}

	Socket method12756(String string_1, int i_2, String string_3) throws IOException {
		Socket socket_5 = new Socket(string_1, i_2);
		socket_5.setSoTimeout(10000);
		OutputStream outputstream_6 = socket_5.getOutputStream();
		if (string_3 == null)
			outputstream_6.write(("CONNECT " + aString5330 + ":" + anInt5331 * 877634459 + " HTTP/1.0\n\n").getBytes(StandardCharsets.ISO_8859_1));
		else
			outputstream_6.write(("CONNECT " + aString5330 + ":" + 877634459 * anInt5331 + " HTTP/1.0\n" + string_3 + "\n\n").getBytes(StandardCharsets.ISO_8859_1));

		outputstream_6.flush();
		BufferedReader bufferedreader_7 = new BufferedReader(new InputStreamReader(socket_5.getInputStream()));
		String string_8 = bufferedreader_7.readLine();
		if (string_8 != null) {
			if (string_8.startsWith("HTTP/1.0 200") || string_8.startsWith("HTTP/1.1 200"))
				return socket_5;

			if (string_8.startsWith("HTTP/1.0 407") || string_8.startsWith("HTTP/1.1 407")) {
				int i_9 = 0;
				String str_10 = "proxy-authenticate: ";

				for (string_8 = bufferedreader_7.readLine(); string_8 != null && i_9 < 50; i_9++) {
					if (string_8.toLowerCase().startsWith(str_10)) {
						string_8 = string_8.substring(str_10.length()).trim();
						int i_11 = string_8.indexOf(32);
						if (i_11 != -1)
							string_8 = string_8.substring(0, i_11);

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

	@Override
	public Socket method7280() throws IOException {
		boolean bool_2 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!bool_2)
			System.setProperty("java.net.useSystemProxies", "true");

		boolean bool_3 = anInt5331 * 877634459 == 443;

		List<Proxy> list_4;
		List<Proxy> list_5;
		try {
			list_4 = aProxySelector7909.select(new URI((bool_3 ? "https" : "http") + "://" + aString5330));
			list_5 = aProxySelector7909.select(new URI((bool_3 ? "http" : "https") + "://" + aString5330));
		} catch (URISyntaxException urisyntaxexception_16) {
			return method7291();
		}

		list_4.addAll(list_5);
		Object[] arr_6 = list_4.toArray();
		IOException_Sub1 ioexception_sub1_7 = null;
		Object[] arr_8 = arr_6;

		for (Object object_10 : arr_8) {
			Proxy proxy_11 = (Proxy) object_10;

			try {
				Socket socket_13 = method12755(proxy_11);
				if (socket_13 != null)
					return socket_13;
			} catch (IOException_Sub1 ioexception_sub1_14) {
				ioexception_sub1_7 = ioexception_sub1_14;
			} catch (IOException ignored) {
			}
		}

		if (ioexception_sub1_7 != null)
			throw ioexception_sub1_7;
		return method7291();
	}

	@Override
	public Socket method7281() throws IOException {
		boolean bool_1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!bool_1)
			System.setProperty("java.net.useSystemProxies", "true");

		boolean bool_2 = anInt5331 * 877634459 == 443;

		List<Proxy> list_3;
		List<Proxy> list_4;
		try {
			list_3 = aProxySelector7909.select(new URI((bool_2 ? "https" : "http") + "://" + aString5330));
			list_4 = aProxySelector7909.select(new URI((bool_2 ? "http" : "https") + "://" + aString5330));
		} catch (URISyntaxException urisyntaxexception_15) {
			return method7291();
		}

		list_3.addAll(list_4);
		Object[] arr_5 = list_3.toArray();
		IOException_Sub1 ioexception_sub1_6 = null;
		Object[] arr_7 = arr_5;

		for (Object object_9 : arr_7) {
			Proxy proxy_10 = (Proxy) object_9;

			try {
				Socket socket_12 = method12755(proxy_10);
				if (socket_12 != null)
					return socket_12;
			} catch (IOException_Sub1 ioexception_sub1_13) {
				ioexception_sub1_6 = ioexception_sub1_13;
			} catch (IOException ignored) {
			}
		}

		if (ioexception_sub1_6 != null)
			throw ioexception_sub1_6;
		return method7291();
	}

	@Override
	public Socket method7282() throws IOException {
		boolean bool_1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!bool_1)
			System.setProperty("java.net.useSystemProxies", "true");

		boolean bool_2 = anInt5331 * 877634459 == 443;

		List<Proxy> list_3;
		List<Proxy> list_4;
		try {
			list_3 = aProxySelector7909.select(new URI((bool_2 ? "https" : "http") + "://" + aString5330));
			list_4 = aProxySelector7909.select(new URI((bool_2 ? "http" : "https") + "://" + aString5330));
		} catch (URISyntaxException urisyntaxexception_15) {
			return method7291();
		}

		list_3.addAll(list_4);
		Object[] arr_5 = list_3.toArray();
		IOException_Sub1 ioexception_sub1_6 = null;
		Object[] arr_7 = arr_5;

		for (Object object_9 : arr_7) {
			Proxy proxy_10 = (Proxy) object_9;

			try {
				Socket socket_12 = method12755(proxy_10);
				if (socket_12 != null)
					return socket_12;
			} catch (IOException_Sub1 ioexception_sub1_13) {
				ioexception_sub1_6 = ioexception_sub1_13;
			} catch (IOException ignored) {
			}
		}

		if (ioexception_sub1_6 != null)
			throw ioexception_sub1_6;
		return method7291();
	}

	@Override
	public Socket method7287() throws IOException {
		boolean bool_1 = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!bool_1)
			System.setProperty("java.net.useSystemProxies", "true");

		boolean bool_2 = anInt5331 * 877634459 == 443;

		List<Proxy> list_3;
		List<Proxy> list_4;
		try {
			list_3 = aProxySelector7909.select(new URI((bool_2 ? "https" : "http") + "://" + aString5330));
			list_4 = aProxySelector7909.select(new URI((bool_2 ? "http" : "https") + "://" + aString5330));
		} catch (URISyntaxException urisyntaxexception_15) {
			return method7291();
		}

		list_3.addAll(list_4);
		Object[] arr_5 = list_3.toArray();
		IOException_Sub1 ioexception_sub1_6 = null;
		Object[] arr_7 = arr_5;

		for (Object object_9 : arr_7) {
			Proxy proxy_10 = (Proxy) object_9;

			try {
				Socket socket_12 = method12755(proxy_10);
				if (socket_12 != null)
					return socket_12;
			} catch (IOException_Sub1 ioexception_sub1_13) {
				ioexception_sub1_6 = ioexception_sub1_13;
			} catch (IOException ignored) {
			}
		}

		if (ioexception_sub1_6 != null)
			throw ioexception_sub1_6;
		return method7291();
	}

}
