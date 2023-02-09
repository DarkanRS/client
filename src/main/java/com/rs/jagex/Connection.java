package com.rs.jagex;

import java.io.IOException;

public abstract class Connection {

	public static String method3342(long long_0, int i_2, boolean bool_3, Language xlanguage_4) {
		char var_6 = 44;
		char var_7 = 46;
		if (xlanguage_4 == Language.ENGLISH) {
			var_6 = 46;
			var_7 = 44;
		}
		if (xlanguage_4 == Language.FRENCH)
			var_7 = 160;
		boolean bool_8 = false;
		if (long_0 < 0L) {
			bool_8 = true;
			long_0 = -long_0;
		}
		StringBuilder stringbuilder_9 = new StringBuilder(26);
		int i_10;
		int i_11;
		if (i_2 > 0) {
			for (i_10 = 0; i_10 < i_2; i_10++) {
				i_11 = (int) long_0;
				long_0 /= 10L;
				stringbuilder_9.append((char) (i_11 + 48 - (int) long_0 * 10));
			}
			stringbuilder_9.append(var_6);
		}
		i_10 = 0;
		while (true) {
			i_11 = (int) long_0;
			long_0 /= 10L;
			stringbuilder_9.append((char) (i_11 + 48 - (int) long_0 * 10));
			if (long_0 == 0L) {
				if (bool_8)
					stringbuilder_9.append('-');
				return stringbuilder_9.reverse().toString();
			}
			if (bool_3) {
				++i_10;
				if (i_10 % 3 == 0)
					stringbuilder_9.append(var_7);
			}
		}
	}

	static FriendStatus[] method3343() {
		return new FriendStatus[]{FriendStatus.FRIENDS_ONLY, FriendStatus.ONLINE, FriendStatus.OFFLINE};
	}

	public static void method3345(String string_0) {
		if (!string_0.isEmpty()) {
			BufferedConnectionContext class184_2 = BufferedConnectionContext.getConnectionContext();
			TCPPacket tcpmessage_3 = TCPPacket.createPacket(ClientProt.FC_JOIN, class184_2.outKeys);
			tcpmessage_3.buffer.writeByte(ChatLine.getLength(string_0));
			tcpmessage_3.buffer.writeString(string_0);
			class184_2.queuePacket(tcpmessage_3);
		}
	}

	public static void runIComponentScripts(IComponentDefinitions[] arr_0) {
		for (IComponentDefinitions icomponentdefinitions_3 : arr_0) {
			if (icomponentdefinitions_3.onLoadScript != null) {
				HookRequest hookrequest_4 = new HookRequest();
				hookrequest_4.source = icomponentdefinitions_3;
				hookrequest_4.params = icomponentdefinitions_3.onLoadScript;
				CS2Executor.executeHookInner(hookrequest_4, 2000000);
			}
		}
	}

	public abstract boolean available(int var1) throws IOException;

	public abstract void end();

	public abstract void endDummy1();

	public abstract void endDummy2();

	public abstract void endDummy4();

	public abstract void method3310();

	public abstract int method3312() throws IOException;

	public abstract boolean method3317(int var1) throws IOException;

	public abstract boolean method3319(int var1) throws IOException;

	public abstract void method3320();

	public abstract boolean method3321(int var1) throws IOException;

	public abstract int method3322() throws IOException;

	public abstract int method3323() throws IOException;

	public abstract int method3324(byte[] var1, int var2, int var3) throws IOException;

	public abstract void method3325(byte[] var1, int var2, int var3) throws IOException;

	public abstract void method3326(byte[] var1, int var2, int var3) throws IOException;

	public abstract boolean method3328(int var1) throws IOException;

	public abstract boolean method3329(int var1) throws IOException;

	public abstract void method3331();

	public abstract void method3332();

	public abstract void method3333();

	public abstract int read(byte[] var1, int var2, int var3) throws IOException;

	public abstract void write(byte[] var1, int var3) throws IOException;
}
