package com.jagex;
import java.net.InetAddress;
import java.net.UnknownHostException;

import jaclib.ping.Ping;

public class ConnectionPinger implements Runnable {

	String ip;
	InetAddress address;
	volatile long ping = -1L;
	volatile boolean checkPing = true;

	void setIp(String ip) {
		this.ip = ip;
		this.address = null;
		this.ping = -1L;
		if (this.ip != null) {
			try {
				this.address = InetAddress.getByName(this.ip);
			} catch (UnknownHostException unknownhostexception_4) {
				;
			}
		}
	}

	void finishPingRequest() {
		this.checkPing = false;
	}

	public void run() {
		while (this.checkPing) {
			this.requestPing();
		}
	}

	long getPing() {
		return this.ping;
	}

	void requestPing() {
		if (this.address != null) {
			try {
				byte[] bytes_2 = this.address.getAddress();
				this.ping = (long) Ping.ping(bytes_2[0], bytes_2[1], bytes_2[2], bytes_2[3], 10000L);
			} catch (Throwable throwable_3) {
				;
			}
		}
		Class89.sleep(1000L);
	}
}
