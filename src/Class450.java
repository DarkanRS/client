import java.io.IOException;
import java.net.Socket;
import java.util.Calendar;

public class Class450 {

	public String aString5433;
	public int worldId;
	public static int anInt5438;
	boolean aBool5436 = true;
	boolean aBool5432 = false;
	public int anInt5437 = 1;
	public int anInt5434 = -190419398;

	public boolean method7491(Class450 class450_1, int i_2) {
		return class450_1 == null ? false : this.worldId == class450_1.worldId && this.aString5433.equals(class450_1.aString5433);
	}

	public void method7493(int i_1) {
		if (!this.aBool5436) {
			this.aBool5436 = true;
			this.aBool5432 = true;
		} else if (this.aBool5432) {
			this.aBool5432 = false;
		} else {
			this.aBool5436 = false;
		}

	}

	public Socket method7494(byte b_1) throws IOException {
		return new Socket(this.aString5433, 5555);
	}

	static String method7499(long long_0, int i_2, boolean bool_3, int i_4) {
		Calendar calendar_5;
		if (bool_3) {
			Class288.method5083(long_0);
			calendar_5 = Class407.aCalendar4846;
		} else {
			Class155.method2634(long_0);
			calendar_5 = Class407.aCalendar4848;
		}

		int i_6 = calendar_5.get(5);
		int i_7 = calendar_5.get(2) + 1;
		int i_8 = calendar_5.get(1);
		int i_9 = calendar_5.get(11);
		int i_10 = calendar_5.get(12);
		return Integer.toString(i_6 / 10) + i_6 % 10 + "/" + i_7 / 10 + i_7 % 10 + "/" + i_8 % 100 / 10 + i_8 % 10 + " " + i_9 / 10 + i_9 % 10 + ":" + i_10 / 10 + i_10 % 10;
	}

	static final void method7500(CS2Executor cs2executor_0, int i_1) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub15_8203, cs2executor_0.intStack[--cs2executor_0.intStackPtr], -1848816059);
		Class190.method3148((byte) 103);
		client.aBool7175 = false;
	}

	static final void method7501(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		String string_3 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		TCPMessage tcpmessage_4 = Class271.method4828(OutgoingPacket.aClass379_4558, client.aClass184_7218.isaac, -375525383);
		tcpmessage_4.buffer.writeShort(ChatLine.getLength(string_2) + ChatLine.getLength(string_3), 1417031095);
		tcpmessage_4.buffer.writeString(string_2);
		tcpmessage_4.buffer.writeString(string_3);
		client.aClass184_7218.method3049(tcpmessage_4, -283007581);
	}

	static final void method7502(CS2Executor cs2executor_0, byte b_1) {
		UnderlayDefinition underlaydefinition_2;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_2 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_2 = cs2executor_0.aClass513_7007;
		}

		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = icomponentdefinitions_4.aString1391;
	}

}
