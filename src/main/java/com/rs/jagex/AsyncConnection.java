package com.rs.jagex;

import java.io.IOException;
import java.net.Socket;

import com.rs.jagex.clans.ClanChannel;

public class AsyncConnection extends Connection {

	public static ClanChannel LISTENED_CLAN_CHANNEL;

	Socket socket;

	AsyncInputStream inputStream;

	AsyncOutputStream outputStream;

	AsyncConnection(Socket socket_1, int bufferSize) throws IOException {
		socket = socket_1;
		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		inputStream = new AsyncInputStream(socket.getInputStream(), bufferSize);
		outputStream = new AsyncOutputStream(socket.getOutputStream(), bufferSize);
	}

	@Override
	public boolean available(int i_1) throws IOException {
		return inputStream.available(i_1);
	}

	@Override
	public void end() {
		outputStream.end();
		try {
			socket.close();
		} catch (IOException ignored) {
		}
		inputStream.method5042();
	}

	@Override
	public void endDummy1() {
		outputStream.end();
		try {
			socket.close();
		} catch (IOException ignored) {
		}
		inputStream.method5042();
	}

	@Override
	public void endDummy2() {
		outputStream.end();
		try {
			socket.close();
		} catch (IOException ignored) {
		}
		inputStream.method5042();
	}

	@Override
	public void endDummy4() {
		outputStream.end();
		try {
			socket.close();
		} catch (IOException ignored) {
		}
		inputStream.method5042();
	}

	@Override
	protected void finalize() {
		end();
	}

	@Override
	public void method3310() {
		outputStream.end();
		try {
			socket.close();
		} catch (IOException ignored) {
		}
		inputStream.method5042();
	}

	@Override
	public int method3312() throws IOException {
		return inputStream.method5034();
	}

	@Override
	public boolean method3317(int i_1) throws IOException {
		return inputStream.available(i_1);
	}

	@Override
	public boolean method3319(int i_1) throws IOException {
		return inputStream.available(i_1);
	}

	@Override
	public void method3320() {
		inputStream.close();
		outputStream.close();
	}

	@Override
	public boolean method3321(int i_1) throws IOException {
		return inputStream.available(i_1);
	}

	@Override
	public int method3322() throws IOException {
		return inputStream.method5034();
	}

	@Override
	public int method3323() throws IOException {
		return inputStream.method5034();
	}

	@Override
	public int method3324(byte[] bytes_1, int i_2, int i_3) throws IOException {
		return inputStream.method5043(bytes_1, i_2, i_3);
	}

	@Override
	public void method3325(byte[] bytes_1, int i_2, int i_3) throws IOException {
		outputStream.method5087(bytes_1, i_2, i_3);
	}

	@Override
	public void method3326(byte[] bytes_1, int i_2, int i_3) throws IOException {
		outputStream.method5087(bytes_1, i_2, i_3);
	}

	@Override
	public boolean method3328(int i_1) throws IOException {
		return inputStream.available(i_1);
	}

	@Override
	public boolean method3329(int i_1) throws IOException {
		return inputStream.available(i_1);
	}

	@Override
	public void method3331() {
		inputStream.close();
		outputStream.close();
	}

	@Override
	public void method3332() {
		inputStream.close();
		outputStream.close();
	}

	@Override
	public void method3333() {
		inputStream.close();
		outputStream.close();
	}

	@Override
	public int read(byte[] bytes_1, int i_2, int i_3) throws IOException {
		return inputStream.method5043(bytes_1, i_2, i_3);
	}

	@Override
	public void write(byte[] bytes_1, int i_3) throws IOException {
		outputStream.method5087(bytes_1, 0, i_3);
	}
}
