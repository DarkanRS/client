public class Class468_Sub19 extends Preference {

	void method7783(int i_1, int i_2) {
		this.anInt5578 = i_1;
	}

	public Class468_Sub19(int i_1, Class282_Sub54 class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public void method12785(int i_1) {
		if (this.anInt5578 != 1 && this.anInt5578 != 0) {
			this.anInt5578 = this.method7781(1848490325);
		}

	}

	int method7781(int i_1) {
		return 1;
	}

	int method7785(int i_1, int i_2) {
		return 1;
	}

	int method7786() {
		return 1;
	}

	public int method12786(int i_1) {
		return this.anInt5578;
	}

	void method7780(int i_1) {
		this.anInt5578 = i_1 * -754033619 * -859024475;
	}

	int method7784(int i_1) {
		return 1;
	}

	public Class468_Sub19(Class282_Sub54 class282_sub54_1) {
		super(class282_sub54_1);
	}

	int method7787() {
		return 1;
	}

	public static final void method12790(boolean bool_0, int i_1, int i_2) {
		Class282_Sub4 class282_sub4_3 = bool_0 ? Class113.aClass282_Sub4_1235 : Class202_Sub1.aClass282_Sub4_8186;
		if (class282_sub4_3 != null && i_1 >= 0 && i_1 < class282_sub4_3.anInt7503) {
			Class57 class57_4 = class282_sub4_3.aClass57Array7499[i_1];
			if (class57_4.aByte525 == -1) {
				String string_5 = class57_4.aString524;
				Class184 class184_6 = Class468_Sub20.method12807(-1321489648);
				TCPMessage tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4617, class184_6.isaac, 1070287495);
				tcpmessage_7.buffer.writeByte(3 + ChatLine.getLength(string_5));
				tcpmessage_7.buffer.writeByte(bool_0 ? 1 : 0);
				tcpmessage_7.buffer.writeShort(i_1, 1417031095);
				tcpmessage_7.buffer.writeString(string_5);
				class184_6.method3049(tcpmessage_7, -920214831);
			}
		}

	}

}
