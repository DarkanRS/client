package com.rs.jagex;

import java.io.IOException;
import java.net.Socket;
import java.util.Calendar;

import com.rs.Loader;

public class ConnectionInfo {

	public static int anInt5438;
	public static ServerEnvironment SERVER_ENVIRONMENT;
	static PingRequest CURRENT_WORLD_PING_REQUEST;
	static int currentWorldPingIdx;
	static int CURRENT_WORLD = 1000336;
	static WorldDescriptor[] WORLD_DESCRIPTORS_BYID = new WorldDescriptor[0];
	public static boolean PING_WORLDS;
	public static boolean aBool5422;

	public static ConnectionInfo aClass450_5429;
	public static boolean aBool5428;
	public static long aLong5425;
	public static ConnectionInfo LOBBY_CONNECTION_INFO;
	public static ConnectionInfo NEWS_CONNECTION_INFO;
	public static ConnectionInfo JS5_CONNECTION_INFO;
	public static ConnectionInfo GAME_CONNECTION_INFO;
	static String method7499(long long_0) {
		Calendar calendar_5;
		if (true) {
			SkyboxIndexLoader.method5083(long_0);
			calendar_5 = Class407.aCalendar4846;
		} else {
			Class155.method2634(long_0);
			calendar_5 = Class407.aCalendar4848;
		}
		int i_6 = calendar_5.get(Calendar.DATE);
		int i_7 = calendar_5.get(Calendar.MONTH) + 1;
		int i_8 = calendar_5.get(Calendar.YEAR);
		int i_9 = calendar_5.get(Calendar.HOUR_OF_DAY);
		int i_10 = calendar_5.get(Calendar.MINUTE);
		return Integer.toString(i_6 / 10) + i_6 % 10 + "/" + i_7 / 10 + i_7 % 10 + "/" + i_8 % 100 / 10 + i_8 % 10 + " " + i_9 / 10 + i_9 % 10 + ":" + i_10 / 10 + i_10 % 10;
	}
	public String host;
	public int worldId;
	public int anInt5437 = 1;
	public int anInt5434 = -190419398;
	boolean alternate = true;

	boolean proxied;

	public Socket createSocket() throws IOException {
		int port = Loader.getPort(worldId);
		if (Loader.DEBUG)
			System.out.println("Creating socket for world: " + worldId + " at " + host + ":" + port);
		return new Socket(host, port);
	}

	public boolean equals(ConnectionInfo class450_1) {
		return class450_1 != null && (worldId == class450_1.worldId && host.equals(class450_1.host));
	}

	public void swap() {
		if (!alternate) {
			alternate = true;
			proxied = true;
		} else if (proxied)
			proxied = false;
		else
			alternate = false;
	}
}
