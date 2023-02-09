package com.rs.jagex;

import jaclib.ping.Ping;

import java.awt.*;
import java.awt.Desktop.Action;
import java.net.InetAddress;
import java.net.URI;
import java.util.LinkedList;
import java.util.Queue;

public class PingRequester implements Runnable {

	public static void method8736(String string_0, boolean bool_1, String string_3, boolean bool_4) {
		if (bool_1) {
			if (!bool_4 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE))
				try {
					Desktop.getDesktop().browse(new URI(string_0));
					return;
				} catch (Exception ignored) {
				}
			if (GroundItemStrategy.aString8069.startsWith("win") && !bool_4)
				GraphicsPreference.method12661(string_0, 0);
			else if (GroundItemStrategy.aString8069.startsWith("mac"))
				Class186.method3082(string_0, 1, string_3);
			else
				GraphicsPreference.method12661(string_0, 2);
		} else
			GraphicsPreference.method12661(string_0, 3);
	}
	Object anObject5862 = new Object();
	Queue requestQueue = new LinkedList();

	Thread requestThread = new Thread(this);

	public PingRequester() {
		requestThread.setDaemon(true);
		requestThread.start();
	}

	public PingRequest createPingRequest(String ip) {
		if (requestThread == null)
			throw new IllegalStateException("");
		if (ip == null)
			throw new IllegalArgumentException("");
		else {
			PingRequest class510_3 = new PingRequest(ip);
			queueRequest(class510_3);
			return class510_3;
		}
	}

	public void method8733() {
		if (requestThread != null) {
			queueRequest(anObject5862);
			try {
				requestThread.join();
			} catch (InterruptedException ignored) {
			}
			requestThread = null;
		}
	}

	void queueRequest(Object object_1) {
		Queue queue_3 = requestQueue;
		synchronized (requestQueue) {
			requestQueue.add(object_1);
			requestQueue.notify();
		}
	}

	@Override
	public void run() {
		while (true) {
			PingRequest request;
			synchronized (requestQueue) {
				Object object_3;
				for (object_3 = requestQueue.poll(); object_3 == null; object_3 = requestQueue.poll())
					try {
						requestQueue.wait();
					} catch (InterruptedException ignored) {
					}
				if (object_3 == anObject5862)
					return;
				request = (PingRequest) object_3;
			}
			int ping;
			try {
				byte[] addr = InetAddress.getByName(request.ip).getAddress();
				ping = Ping.ping(addr[0], addr[1], addr[2], addr[3], 1000L);
			} catch (Throwable throwable_6) {
				ping = 1000;
			}
			request.ping = ping;
		}
	}
}
