package com.jagex;

import java.io.IOException;
import java.net.Socket;

public class AsyncConnection extends Connection {

    public static ClanChannel LISTENED_CLAN_CHANNEL;

    Socket socket;

    AsyncInputStream inputStream;

    AsyncOutputStream outputStream;

    AsyncConnection(Socket socket_1, int i_2) throws IOException {
        socket = socket_1;
        socket.setSoTimeout(30000);
        socket.setTcpNoDelay(true);
        inputStream = new AsyncInputStream(socket.getInputStream(), i_2);
        outputStream = new AsyncOutputStream(socket.getOutputStream(), i_2);
    }

    @Override
    public int method3312() throws IOException {
        return inputStream.method5034();
    }

    @Override
    public boolean available(int i_1) throws IOException {
        return inputStream.method5030(i_1);
    }

    @Override
    public void method3330() {
        outputStream.method5094();
        try {
            socket.close();
        } catch (IOException ignored) {
        }
        inputStream.method5042();
    }

    @Override
    public int read(byte[] bytes_1, int i_2, int i_3) throws IOException {
        return inputStream.method5043(bytes_1, i_2, i_3);
    }

    @Override
    public void write(byte[] bytes_1, int i_3) throws IOException {
        outputStream.method5087(bytes_1, 0, i_3);
    }

    @Override
    protected void finalize() {
        method3318();
    }

    @Override
    public void method3320() {
        inputStream.method5031();
        outputStream.method5089();
    }

    @Override
    public void method3310() {
        outputStream.method5094();
        try {
            socket.close();
        } catch (IOException ignored) {
        }
        inputStream.method5042();
    }

    @Override
    public boolean method3328(int i_1) throws IOException {
        return inputStream.method5030(i_1);
    }

    @Override
    public void method3332() {
        inputStream.method5031();
        outputStream.method5089();
    }

    @Override
    public void method3333() {
        inputStream.method5031();
        outputStream.method5089();
    }

    @Override
    public boolean method3329(int i_1) throws IOException {
        return inputStream.method5030(i_1);
    }

    @Override
    public boolean method3321(int i_1) throws IOException {
        return inputStream.method5030(i_1);
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
    public void method3316() {
        outputStream.method5094();
        try {
            socket.close();
        } catch (IOException ignored) {
        }
        inputStream.method5042();
    }

    @Override
    public void method3318() {
        outputStream.method5094();
        try {
            socket.close();
        } catch (IOException ignored) {
        }
        inputStream.method5042();
    }

    @Override
    public boolean method3317(int i_1) throws IOException {
        return inputStream.method5030(i_1);
    }

    @Override
    public void method3331() {
        inputStream.method5031();
        outputStream.method5089();
    }

    @Override
    public boolean method3319(int i_1) throws IOException {
        return inputStream.method5030(i_1);
    }

    @Override
    public void method3314() {
        outputStream.method5094();
        try {
            socket.close();
        } catch (IOException ignored) {
        }
        inputStream.method5042();
    }
}
