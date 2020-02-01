package com.jagex;
import java.io.IOException;
import java.net.Socket;

public class AsyncConnection extends Connection {

	public static ClanChannel LISTENED_CLAN_CHANNEL;

	Socket socket;

	AsyncInputStream inputStream;

	AsyncOutputStream outputStream;

	public int method3312(int i_1) throws IOException {
		return this.inputStream.method5034();
	}

	public boolean available(int i_1) throws IOException {
		return this.inputStream.method5030(i_1, 140362254);
	}

	public void method3330() {
		this.outputStream.method5094(1533379991);
		try {
			this.socket.close();
		} catch (IOException ioexception_2) {
			;
		}
		this.inputStream.method5042(1037256692);
	}

	public int read(byte[] bytes_1, int i_2, int i_3) throws IOException {
		return this.inputStream.method5043(bytes_1, i_2, i_3, -1812586359);
	}

	public void write(byte[] bytes_1, int i_3, int i_4) throws IOException {
		this.outputStream.method5087(bytes_1, 0, i_3, -2123189080);
	}

	public void finalize() {
		this.method3318(-282508161);
	}

	public void method3320(byte b_1) {
		this.inputStream.method5031();
		this.outputStream.method5089((byte) 93);
	}

	public void method3310() {
		this.outputStream.method5094(-315048026);
		try {
			this.socket.close();
		} catch (IOException ioexception_2) {
			;
		}
		this.inputStream.method5042(-310821679);
	}

	public boolean method3328(int i_1) throws IOException {
		return this.inputStream.method5030(i_1, 616390569);
	}

	public void method3332() {
		this.inputStream.method5031();
		this.outputStream.method5089((byte) 109);
	}

	public void method3333() {
		this.inputStream.method5031();
		this.outputStream.method5089((byte) 11);
	}

	public boolean method3329(int i_1) throws IOException {
		return this.inputStream.method5030(i_1, 2048228153);
	}

	public boolean method3321(int i_1) throws IOException {
		return this.inputStream.method5030(i_1, -107857674);
	}

	public int method3322() throws IOException {
		return this.inputStream.method5034();
	}

	public int method3323() throws IOException {
		return this.inputStream.method5034();
	}

	public int method3324(byte[] bytes_1, int i_2, int i_3) throws IOException {
		return this.inputStream.method5043(bytes_1, i_2, i_3, -944362593);
	}

	public void method3325(byte[] bytes_1, int i_2, int i_3) throws IOException {
		this.outputStream.method5087(bytes_1, i_2, i_3, -1840053185);
	}

	public void method3326(byte[] bytes_1, int i_2, int i_3) throws IOException {
		this.outputStream.method5087(bytes_1, i_2, i_3, -1850876885);
	}

	AsyncConnection(Socket socket_1, int i_2) throws IOException {
		this.socket = socket_1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.inputStream = new AsyncInputStream(this.socket.getInputStream(), i_2);
		this.outputStream = new AsyncOutputStream(this.socket.getOutputStream(), i_2);
	}

	public void method3316() {
		this.outputStream.method5094(1106310151);
		try {
			this.socket.close();
		} catch (IOException ioexception_2) {
			;
		}
		this.inputStream.method5042(-1304432726);
	}

	public void method3318(int i_1) {
		this.outputStream.method5094(900325637);
		try {
			this.socket.close();
		} catch (IOException ioexception_3) {
			;
		}
		this.inputStream.method5042(1120679627);
	}

	public boolean method3317(int i_1) throws IOException {
		return this.inputStream.method5030(i_1, 1384301076);
	}

	public void method3331() {
		this.inputStream.method5031();
		this.outputStream.method5089((byte) 69);
	}

	public boolean method3319(int i_1) throws IOException {
		return this.inputStream.method5030(i_1, 1764967239);
	}

	public void method3314() {
		this.outputStream.method5094(2033958494);
		try {
			this.socket.close();
		} catch (IOException ioexception_2) {
			;
		}
		this.inputStream.method5042(-1480562152);
	}
}
